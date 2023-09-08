package com.tencent.ilink;

import com.google.protobuf.C23922p0;
import com.tencent.ilink.auth.FaceProto;
import com.tencent.ilink.auth.Proto;
import com.tencent.ilink.base.Proto;

public class AuthManager {
    private long callbackHandle = 0;
    private long nativeHandle = 0;

    public interface Callback {
        void onCancelOAuthComplete(int i, int i2);

        void onCheckLoginQrCodeComplete(int i, int i2, Proto.IlinkCheckLoginQrCodeResponse ilinkCheckLoginQrCodeResponse);

        void onDeviceLoginComplete(int i, int i2, Proto.IlinkDeviceLoginResponse ilinkDeviceLoginResponse);

        void onFaceExtVerifyComplete(int i, int i2, FaceProto.IlinkFaceExtVerifyResponse ilinkFaceExtVerifyResponse);

        void onFaceRecognizeComplete(int i, int i2, FaceProto.IlinkFaceRecognizeResponse ilinkFaceRecognizeResponse);

        void onFaceRecognizeConfigComplete(int i, int i2, FaceProto.IlinkFaceRecognizeConfigResponse ilinkFaceRecognizeConfigResponse);

        void onGetLoginQrCodeComplete(int i, int i2, Proto.IlinkGetLoginQrCodeResponse ilinkGetLoginQrCodeResponse);

        void onGetOAuthCodeComplete(int i, int i2, Proto.IlinkGetOAuthCodeResponse ilinkGetOAuthCodeResponse);

        void onLoginComplete(int i, Proto.IlinkLoginType ilinkLoginType, int i2, Proto.IlinkLoginResponse ilinkLoginResponse);

        void onLogoutComplete(int i, int i2);
    }

    public AuthManager(long j) {
        jniCreateAuthManagerFromHandle(j);
    }

    private native void jniCancelAllTask();

    private native void jniCancelOAuthAsync(int i, byte[] bArr);

    private native void jniCheckLoginQrCodeAsync(int i);

    private native void jniCreateAuthManagerFromHandle(long j);

    private native void jniDestroyAuthManager();

    private native void jniDeviceLoginAsync(int i, byte[] bArr);

    private native void jniFaceExtVerifyAsync(int i, byte[] bArr);

    private native void jniFaceRecognizeAsync(int i, byte[] bArr);

    private native void jniFaceRecognizeConfigAsync(int i, byte[] bArr);

    private native int jniGenTaskId();

    private native void jniGetLoginQrCodeAsync(int i, byte[] bArr);

    private native void jniGetOAuthCodeAsync(int i, byte[] bArr);

    private native byte[] jniGetSession();

    private native void jniInit(byte[] bArr);

    private native void jniLoginAsync(int i, int i2, byte[] bArr);

    private native void jniLogoutAsync(int i);

    private native void jniSetCallback(Object obj);

    private native void jniUpdateIlinkToken(String str);

    private native void jniUpdateSession(byte[] bArr);

    private native byte[] jniUserInfo();

    public void cancelAllTask() {
        jniCancelAllTask();
    }

    public void cancelOAuthAsync(int i, Proto.IlinkCancelOAuthRequest ilinkCancelOAuthRequest) {
        jniCancelOAuthAsync(i, ilinkCancelOAuthRequest.toByteArray());
    }

    public void checkLoginQrCodeAsync(int i) {
        jniCheckLoginQrCodeAsync(i);
    }

    public void deviceLoginAsync(int i, Proto.IlinkDeviceLoginRequest ilinkDeviceLoginRequest) {
        jniDeviceLoginAsync(i, ilinkDeviceLoginRequest.toByteArray());
    }

    public void faceExtVerifyAsync(int i, FaceProto.IlinkFaceExtVerifyRequest ilinkFaceExtVerifyRequest) {
        jniFaceExtVerifyAsync(i, ilinkFaceExtVerifyRequest.toByteArray());
    }

    public void faceRecognizeAsync(int i, FaceProto.IlinkFaceRecognizeRequest ilinkFaceRecognizeRequest) {
        jniFaceRecognizeAsync(i, ilinkFaceRecognizeRequest.toByteArray());
    }

    public void faceRecognizeConfigAsync(int i, FaceProto.IlinkFaceRecognizeConfigRequest ilinkFaceRecognizeConfigRequest) {
        jniFaceRecognizeConfigAsync(i, ilinkFaceRecognizeConfigRequest.toByteArray());
    }

    public int genTaskId() {
        return jniGenTaskId();
    }

    public void getLoginQrCodeAsync(int i, Proto.IlinkGetLoginQrCodeRequest ilinkGetLoginQrCodeRequest) {
        jniGetLoginQrCodeAsync(i, ilinkGetLoginQrCodeRequest.toByteArray());
    }

    public void getOAuthCodeAsync(int i, Proto.IlinkGetOAuthCodeRequest ilinkGetOAuthCodeRequest) {
        jniGetOAuthCodeAsync(i, ilinkGetOAuthCodeRequest.toByteArray());
    }

    public byte[] getSession() {
        return jniGetSession();
    }

    public void init(Proto.IlinkAuthConfig ilinkAuthConfig) {
        jniInit(ilinkAuthConfig.toByteArray());
    }

    public void loginAsync(int i, Proto.IlinkLoginType ilinkLoginType, Proto.IlinkLoginRequest ilinkLoginRequest) {
        jniLoginAsync(i, ilinkLoginType.getNumber(), ilinkLoginRequest.toByteArray());
    }

    public void logoutAsync(int i) {
        jniLogoutAsync(i);
    }

    public void onDestroy() {
        jniDestroyAuthManager();
        this.nativeHandle = 0;
        this.callbackHandle = 0;
    }

    public void setCallback(Callback callback) {
        jniSetCallback(callback);
    }

    public void updateIlinkToken(String str) {
        jniUpdateIlinkToken(str);
    }

    public void updateSession(byte[] bArr) {
        jniUpdateSession(bArr);
    }

    public Proto.IlinkUserInfo userInfo() {
        try {
            return Proto.IlinkUserInfo.parseFrom(jniUserInfo());
        } catch (C23922p0 unused) {
            return null;
        }
    }
}
