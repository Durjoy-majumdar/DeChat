package com.tencent.map.tools.net;

import com.tencent.map.tools.net.exception.NetErrorException;
import com.tencent.map.tools.net.processor.Processor;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NetResponse {
    public String charset = "GBK";
    public String contentEncoding;
    public int contentLength;
    public byte[] data;
    public InputStream dataStream;
    public int errorCode = -1;
    public byte[] errorData;
    public Exception exception;
    public long mRequestId;
    public String requestUrl;
    public final Map<String, String> respHeads = new HashMap();
    private List<Processor> respProcessorSet;
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

    public void clone(NetResponse netResponse) {
        if (netResponse != null) {
            this.errorCode = netResponse.errorCode;
            this.statusCode = netResponse.statusCode;
            this.data = netResponse.data;
            this.charset = netResponse.charset;
            this.exception = netResponse.exception;
            this.errorData = netResponse.errorData;
        }
    }

    public void exception(Exception exc) {
        this.exception = exc;
        if (exc instanceof NetErrorException) {
            NetErrorException netErrorException = (NetErrorException) exc;
            this.errorCode = netErrorException.errorCode;
            this.statusCode = netErrorException.statusCode;
        }
    }

    public String getData() {
        byte[] bArr = this.data;
        return bArr != null ? new String(bArr) : "";
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        byte[] bArr = this.errorData;
        if (bArr != null) {
            return new String(bArr);
        }
        Exception exc = this.exception;
        return exc != null ? exc.getMessage() : "";
    }

    public String getHeaderField(String str) {
        return this.respHeads.get(str);
    }

    public InputStream getInputStream() {
        return this.dataStream;
    }

    public List<Processor> getProcessors() {
        return this.respProcessorSet;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String toHumanString() {
        if (this.data != null) {
            return "[DATA] " + (((float) this.data.length) / 1024.0f) + "KB " + new String(this.data, Charset.forName("utf-8"));
        } else if (this.errorData == null) {
            return "";
        } else {
            Exception exc = this.exception;
            if (exc != null) {
                exc.getClass();
            }
            return "[ERROR] " + new String(this.errorData);
        }
    }

    public String toString() {
        try {
            byte[] bArr = this.data;
            return bArr != null ? new String(bArr, this.charset) : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public NetResponse(NetRequest netRequest) {
        this.mRequestId = netRequest.mRequestId;
        this.respProcessorSet = netRequest.processors;
        this.requestUrl = netRequest.url;
    }
}
