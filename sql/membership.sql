-- ������Ա������Ŀ --

-- ��Ա�� -- //SID �Զ�����

CREATE TABLE members
(
       userid        NUMBER(10) PRIMARY KEY,
       userName      VARCHAR2(10) NOT NULL UNIQUE,
       userpasswd  VARCHAR(20) NOT NULL
       
)

--��������

CREATE SEQUENCE members_seq
       START WITH     1
       INCREMENT BY   1
       MINVALUE       1
       MAXVALUE     100000
       NOCYCLE
       CACHE        10
       
--������

CREATE TRIGGER members_trigger
       BEFORE INSERT ON members
       FOR EACH ROW
       BEGIN
           SELECT members_seq.nextval INTO :new.userid FROM dual;
       END;
       
--�û�Υ��ΨһԼ����δ�����Ϣʱ����ռ���Զ����ɵ����кţ��Ҿ���������ܴ��ڰ�ȫ������
