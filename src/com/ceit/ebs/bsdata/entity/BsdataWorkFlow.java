package com.ceit.ebs.bsdata.entity;

/**
 * BsdataWorkFlow 系统的工作流构件
 * @author czg
 * date 2014-8-10
 */

public class BsdataWorkFlow  implements java.io.Serializable {


    // Fields    

     private Integer id;         //工作流ID
     private Integer parentId;   //父ID
     private Integer dispIndex;  //排序索引
     private String name;        //工作流名称
     private String url;         
     private String remark;      //字典描述
     private String state;       //状态
     private Integer num;        //数量
     private Integer userId;     //用户ID
     private String userName;    //用户名
     private Integer userDeptid; //用户部门ID
     private String userDeptname;//用户部门名称
     private String reTime;     
     private String seTime;     
     private String actState;    
     private String opTime;     //操作时间
     private String busi_type;  //业务类型
     private String code;		//流程显示名称

    // Constructors

    /** default constructor */
    public BsdataWorkFlow() {
    }

	/** minimal constructor */
    public BsdataWorkFlow(Integer id) {
        this.id = id;
    }
    
    /** full constructor */
    public BsdataWorkFlow(Integer id, Integer parentId, Integer dispIndex, String name, String url, String remark, String state, Integer num, Integer userId, String userName, Integer userDeptid, String userDeptname, String reTime, String seTime, String actState, String opTime) {
        this.id = id;
        this.parentId = parentId;
        this.dispIndex = dispIndex;
        this.name = name;
        this.url = url;
        this.remark = remark;
        this.state = state;
        this.num = num;
        this.userId = userId;
        this.userName = userName;
        this.userDeptid = userDeptid;
        this.userDeptname = userDeptname;
        this.reTime = reTime;
        this.seTime = seTime;
        this.actState = actState;
        this.opTime = opTime;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return this.parentId;
    }
    
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getDispIndex() {
        return this.dispIndex;
    }
    
    public void setDispIndex(Integer dispIndex) {
        this.dispIndex = dispIndex;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }

    public Integer getNum() {
        return this.num;
    }
    
    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserDeptid() {
        return this.userDeptid;
    }
    
    public void setUserDeptid(Integer userDeptid) {
        this.userDeptid = userDeptid;
    }

    public String getUserDeptname() {
        return this.userDeptname;
    }
    
    public void setUserDeptname(String userDeptname) {
        this.userDeptname = userDeptname;
    }

    public String getReTime() {
        return this.reTime;
    }
    
    public void setReTime(String reTime) {
        this.reTime = reTime;
    }

    public String getSeTime() {
        return this.seTime;
    }
    
    public void setSeTime(String seTime) {
        this.seTime = seTime;
    }

    public String getActState() {
        return this.actState;
    }
    
    public void setActState(String actState) {
        this.actState = actState;
    }

    public String getOpTime() {
        return this.opTime;
    }
    
    public void setOpTime(String opTime) {
        this.opTime = opTime;
    }

	public String getBusi_type() {
		return busi_type;
	}

	public void setBusi_type(String busiType) {
		busi_type = busiType;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
   
    








}