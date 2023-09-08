package com.tencent.tencentmap.net;

import com.tencent.map.tools.net.exception.NetErrorException;

public class NetResponse {
    public String charset = "GBK";
    public byte[] data;
    public int errorCode = -1;
    public byte[] errorData;
    public Exception exception;
    public int statusCode;

    public NetResponse() {
    }

    public boolean available() {
        if (this.errorCode == 0 && this.statusCode == 200) {
            return true;
        }
        byte[] bArr = this.data;
        return bArr != null && bArr.length > 0;
    }

    public String toString() {
        try {
            byte[] bArr = this.data;
            return bArr != null ? new String(bArr, this.charset) : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public NetResponse(com.tencent.map.tools.net.NetResponse netResponse) {
        if (netResponse != null) {
            this.errorCode = netResponse.errorCode;
            this.statusCode = netResponse.statusCode;
            this.data = netResponse.data;
            this.charset = netResponse.charset;
            this.exception = netResponse.exception;
            this.errorData = netResponse.errorData;
        }
    }

    public NetResponse(Exception exc) {
        this.exception = exc;
        if (exc instanceof NetErrorException) {
            NetErrorException netErrorException = (NetErrorException) exc;
            this.errorCode = netErrorException.errorCode;
            this.statusCode = netErrorException.statusCode;
        }
    }
}
