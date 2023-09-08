package com.tencent.ilink;

import com.google.protobuf.C23922p0;
import com.tencent.ilink.base.Proto;
import com.tencent.ilink.network.Proto;
import pw3.C89441a;

public class Context {
    private static Context instance = new Context();
    private C89441a interfaceMap = new C89441a();
    public long nativeHandle = 0;

    private Context() {
        jniCreateContext();
    }

    public static Context getInstance() {
        return instance;
    }

    private native void jniChangeDomain(int i);

    private native byte[] jniConfig();

    private native void jniCreateContext();

    private native void jniDeleteAppDeviceSession(long j);

    private native void jniDeleteAppSession(long j);

    private native void jniDeleteDeviceSession(long j);

    private native void jniForegroundChanged(boolean z);

    private native long jniGetCloudSession();

    private native void jniInit(byte[] bArr);

    private native boolean jniIsAlreadyGetStrategy();

    private native void jniNetworkChanged();

    private native long jniNewAppDeviceSession(String str, long j);

    private native long jniNewAppSession(String str);

    private native long jniNewDeviceSession();

    private native void jniSetLonglinkIplist(byte[] bArr);

    private native void jniSetProxy(byte[] bArr);

    private native void jniSetShortlinkIplist(byte[] bArr);

    private native void jniUninit();

    public void changeDomain(Proto.IlinkDomainType ilinkDomainType) {
        jniChangeDomain(ilinkDomainType.getNumber());
    }

    public Proto.IlinkStartConfig config() {
        try {
            return Proto.IlinkStartConfig.parseFrom(jniConfig());
        } catch (C23922p0 unused) {
            return null;
        }
    }

    public void deleteAppDeviceSession(AppDeviceSession appDeviceSession) {
        jniDeleteAppDeviceSession(this.interfaceMap.mo123760a(appDeviceSession));
    }

    public void deleteAppSession(AppSession appSession) {
        jniDeleteAppSession(this.interfaceMap.mo123760a(appSession));
    }

    public void deleteDeviceSession(DeviceSession deviceSession) {
        jniDeleteDeviceSession(this.interfaceMap.mo123760a(deviceSession));
    }

    public void foregroundChanged(boolean z) {
        jniForegroundChanged(z);
    }

    public CloudSession getCloudSession() {
        return (CloudSession) this.interfaceMap.mo123761b(jniGetCloudSession(), CloudSession.class.getName());
    }

    public void init(Proto.IlinkStartConfig ilinkStartConfig) {
        jniInit(ilinkStartConfig.toByteArray());
    }

    public boolean isAlreadyGetStrategy() {
        return jniIsAlreadyGetStrategy();
    }

    public void networkChanged() {
        jniNetworkChanged();
    }

    public AppDeviceSession newAppDeviceSession(String str, long j) {
        return (AppDeviceSession) this.interfaceMap.mo123761b(jniNewAppDeviceSession(str, j), AppDeviceSession.class.getName());
    }

    public AppSession newAppSession(String str) {
        return (AppSession) this.interfaceMap.mo123761b(jniNewAppSession(str), AppSession.class.getName());
    }

    public DeviceSession newDeviceSession() {
        return (DeviceSession) this.interfaceMap.mo123761b(jniNewDeviceSession(), DeviceSession.class.getName());
    }

    public void setLonglinkIplist(Proto.IlinkServerIplist ilinkServerIplist) {
        jniSetLonglinkIplist(ilinkServerIplist.toByteArray());
    }

    public void setProxy(Proto.IlinkNetProxyInfo ilinkNetProxyInfo) {
        jniSetProxy(ilinkNetProxyInfo.toByteArray());
    }

    public void setShortlinkIplist(Proto.IlinkServerIplist ilinkServerIplist) {
        jniSetShortlinkIplist(ilinkServerIplist.toByteArray());
    }

    public void uninit() {
        jniUninit();
    }
}
