package com.hspedu.qqcommon;

/**
 * @author 韩顺平
 * @version 1.0
 * 表示消息类型
 */
public enum MessageType {
    //老师解读
    //1. 在接口中定义了一些常量
    //2. 不同的常量的值，表示不同的消息类型.
    MESSAGE_LOGIN_SUCCEED, //表示登录成功
    MESSAGE_LOGIN_FAIL, // 表示登录失败
    MESSAGE_COMM_MES, //普通信息包
    MESSAGE_GET_ONLINE_FRIEND, //要求返回在线用户列表
    MESSAGE_RET_ONLINE_FRIEND, //返回在线用户列表
    MESSAGE_CLIENT_EXIT, //客户端请求退出
    MESSAGE_TO_ALL_MES, //群发消息报
    MESSAGE_FILE_MES //文件消息(发送文件)

}
