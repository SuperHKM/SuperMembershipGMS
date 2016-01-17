package lyons.tools;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import lyons.db.DbClose;
import lyons.db.DbConn;
import lyons.entity.UserInfo;

public class Query
{
	/*
	 * ����id�Ų�ѯ��Ա��Ϣ�����ڲ�ѯ���Ľ��ֻ��һ������ֱ�ӷ���UserInfo���ͣ��������ö�̬����
	 */
	public UserInfo queryMemberById(int id)
	{
		Connection  	  conn = null;
		ResultSet		    rs = null;
		PreparedStatement pstmt = null;
		
//		ArrayList<UserInfo> memberInfo = new ArrayList<UserInfo>();
		conn = DbConn.getConn();
		String sql = "SELECT * FROM MEMBERINFO WHERE USERID=?";
		try
		{
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if(rs.next())
			{
				int userId = rs.getInt(1);
				String nickName = rs.getString(2);
				String trueName = rs.getString(3);
				String gender = rs.getString(4);
				String major = rs.getString(5);
				
				String[] courses = {""};
					if (rs.getString(6) != null)
					{
						courses = rs.getString(6).split("&"); //���ַ����ָ�ʢ��������ȥ
					}
				String[] hobbys = {""};
					if (rs.getString(7) != null)
					{
						hobbys = rs.getString(7).split("&"); //���ַ����ָ�ʢ��������ȥ
					}
				
				String remarks = rs.getString(8);
				
				UserInfo membershipInfo = new UserInfo(userId,nickName,trueName,gender,major,courses,hobbys,remarks);
				return membershipInfo;//���ظ������ߴ�id������Ϣ
			}
		} catch (SQLException e)
		{
			e.printStackTrace();
		}finally
		{
			DbClose.allClose(pstmt, rs, conn);
		}
		
		return null; //����û�в�ѯ�������Ϣ
	}
}
