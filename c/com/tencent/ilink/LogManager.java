package com.tencent.ilink;

import com.tencent.ilink.base.Proto;

public class LogManager {
    private static LogManager instance = new LogManager();
    private long callbackHandle = 0;
    public long nativeHandle = 0;

    public interface Callback {
        boolean onFilterLogEvent(int i, String str, String str2, String str3, int i2, String str4);

        void onWriteLogEvent(int i, String str, String str2, String str3, int i2, String str4);
    }

    private LogManager() {
        jniCreateLogManager();
    }

    public static LogManager getInstance() {
        return instance;
    }

    private native void jniClose();

    private native void jniCreateLogManager();

    private native void jniFlush();

    private native void jniInit(byte[] bArr);

    private native void jniOpen(String str, byte[] bArr);

    private native void jniSetCallback(Object obj);

    private native void jniWrite(int i, String str, String str2, String str3, int i2, String str4);

    public void close() {
        jniClose();
    }

    public void flush() {
        jniFlush();
    }

    public void init(Proto.IlinkLogConfig ilinkLogConfig) {
        jniInit(ilinkLogConfig.toByteArray());
    }

    public void open(String str, byte[] bArr) {
        jniOpen(str, bArr);
    }

    public void setCallback(Callback callback) {
        jniSetCallback(callback);
    }

    public void write(int i, String str, String str2, String str3, int i2, String str4) {
        jniWrite(i, str, str2, str3, i2, str4);
    }
}
