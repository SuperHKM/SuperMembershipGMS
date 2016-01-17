package lyons.entity;

public class UserInfo
{
	private int userId;
	private String nickName;
	private String trueName;
	private String gender;
	private String major;
	private String[] courses = {""}; //��ȡ���û���Ϣ�洢��������
	private String course = "";	//������������ȡֵ�����ַ�������ʽ�������ݿ���
	private String[] hobbys = {""};	//
	private String hobby ="";
	private String remarks = "";

	/*
	 * ��ѯ��Ϣ���캯��
	 */
	public UserInfo(int userId, String nickName, String trueName,String gender, String major, String[] courses, String[] hobbys,String remarks)
	{
		this.userId = userId;
		this.nickName = nickName;
		this.trueName = trueName;
		this.gender = gender;
		this.major = major;
		this.courses = courses;
		this.hobbys = hobbys;
		this.remarks = remarks;
	}
	/*
	 * �޲εĹ��캯��
	 * jsp���޲εĹ��캯������Ҫ�����ط����󣬱�����дһ����ʽ���޲ι��캯��
	 */
	public UserInfo()
	{
	}
	/*
	 * ����get��set
	 * ע�⣬get set ���涼Ҫ��д
	 */
	public int getUserId()
	{
		return userId;
	}
	public void setUserId(int userId)
	{
		this.userId = userId;
	}
	public String getNickName()
	{
		return nickName;
	}
	public void setNickName(String nickName)
	{
		this.nickName = nickName;
	}
	public String getTrueName()
	{
		return trueName;
	}
	public void setTrueName(String trueName)
	{
		this.trueName = trueName;
	}
	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public String getMajor()
	{
		return major;
	}
	public void setMajor(String major)
	{
		this.major = major;
	}
	public String[] getCourses()
	{
		return courses;
	}
	public void setCourses(String[] courses)
	{
		this.courses = courses;
	}
	public String getCourse()
	{
		if (courses != null)	
		{
			course = ""; //��ʼ������ֹ��ε���ʱ�ۼ�
			for (int i = 0,length = courses.length; i < length; i++)
				course += courses[i] + "&"; //�������е�ֵ�洢���ַ����У����������ڷָ�ķ���&�������Ժ�ȡֵ
		}
		course = course.substring(0,course.length()-1); //������һ���ָ����޳���
		return course;
	}
	public void setCourse(String course)
	{
		this.course = course;
	}
	public String[] getHobbys()
	{
		return hobbys;
	}
	public void setHobbys(String[] hobbys)
	{
		this.hobbys = hobbys;
	}
	public String getHobby()
	{
		if (hobbys != null)	
		{
			hobby = ""; //��ʼ������ֹ��ε���ʱ�ۼ�
			for (int i = 0,length = hobbys.length; i < length; i++)
				hobby += hobbys[i] + "&"; //�������е�ֵ�洢���ַ����У����������ڷָ�ķ���&�������Ժ�ȡֵ
		}
		hobby = hobby.substring(0,hobby.length()-1); //������һ���ָ����޳���
		return hobby;
	}
	public void setHobby(String hobby)
	{
		this.hobby = hobby;
	}
	public String getRemarks()
	{
		return remarks;
	}
	public void setRemarks(String remarks)
	{
		this.remarks = remarks;
	}
}
