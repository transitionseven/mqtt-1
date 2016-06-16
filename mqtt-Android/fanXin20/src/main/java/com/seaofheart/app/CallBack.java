package com.seaofheart.app;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public interface CallBack {
    int ERROR_EXCEPTION = -1;
    int ERROR_SEND = -2;
    int ERROR_FILE_NOT_FOUND = -3;
    int ERROR_EXCEPTION_NO_ERROR = 0;
    int ERROR_EXCEPTION_UNKNOWN_SERVER_ERROR = -1000;
    int ERROR_EXCEPTION_NONETWORK_ERROR = -1001;
    int ERROR_EXCEPTION_DNS_ERROR = -1002;
    int ERROR_EXCEPTION_UNABLE_CONNECT_TO_SERVER = -1003;
    int ERROR_EXCEPTION_CONNECT_TIMER_OUT = -1004;
    int ERROR_EXCEPTION_INVALID_PASSWORD_USERNAME = -1005;
    int ERROR_EXCEPTION_INVALID_KEYSTORE = -1006;
    int ERROR_EXCEPTION_IO_EXCEPTION = -1007;
    int ERROR_EXCEPTION_INVALID_CERTIFICATE = -1008;
    int ERROR_EXCEPTION_ENCRYPTION_ERROR = -1009;
    int ERROR_EXCEPTION_LOGOFFINPROGRESS_ERROR = -1010;
    int ERROR_EXCEPTION_INVALID_FILE = -1011;
    int ERROR_EXCEPTION_FILE_NOT_FOUND = -1012;
    Object data = null;

    void onSuccess();

    void onError(int var1, String var2);

    void onProgress(int var1, String var2);
}
