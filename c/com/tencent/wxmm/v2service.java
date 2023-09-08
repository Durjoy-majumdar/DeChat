package com.tencent.wxmm;

import j20.C117292a;
import k20.C9556a;

public class v2service {
    private static final String TAG = "WXMM.Voip";
    private byte _hellAccFlag_;
    public byte[] callbackOutData = null;
    public int defaultHeight = 544;
    public int defaultWidth = 704;
    public int field_remoteImgHeight = 0;
    public int field_remoteImgLength = 0;
    public int field_remoteImgWidth = 0;
    public int field_remoteScreenImgHeight = 0;
    public int field_remoteScreenImgLength = 0;
    public int field_remoteScreenImgWidth = 0;
    private IVoipCallBack mUiCallBack = null;
    public byte[] remoteImgBuffer = null;

    static {
        C9556a aVar = new C9556a();
        aVar.mo10233c("c++_shared");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/wxmm/v2service", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/wxmm/v2service", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c("marsbridgexlog");
        Object obj2 = new Object();
        C117292a.m165358d(obj2, aVar2.mo10232b(), "com/tencent/wxmm/v2service", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar2.mo10231a(0));
        C117292a.m165359e(obj2, "com/tencent/wxmm/v2service", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c("marsbridgenetwork");
        Object obj3 = new Object();
        C117292a.m165358d(obj3, aVar3.mo10232b(), "com/tencent/wxmm/v2service", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar3.mo10231a(0));
        C117292a.m165359e(obj3, "com/tencent/wxmm/v2service", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c("voipService");
        Object obj4 = new Object();
        C117292a.m165358d(obj4, aVar4.mo10232b(), "com/tencent/wxmm/v2service", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar4.mo10231a(0));
        C117292a.m165359e(obj4, "com/tencent/wxmm/v2service", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    private native int Init(byte[] bArr, int i);

    private native int UnInit();

    public native int Accept(int i);

    public native int Ack();

    public byte[] ByteArrayCallbackFromVoipSDK(int i, int i2, byte[] bArr) {
        IVoipCallBack iVoipCallBack = this.mUiCallBack;
        if (iVoipCallBack != null) {
            return iVoipCallBack.callBackFromVoip2(i, i2, bArr);
        }
        return null;
    }

    public native int Hangup(int i);

    public int InitSDK(byte[] bArr, int i, IVoipCallBack iVoipCallBack) {
        this.mUiCallBack = iVoipCallBack;
        this.remoteImgBuffer = new byte[(((this.defaultWidth * this.defaultHeight) * 3) / 2)];
        int Init = Init(bArr, i);
        v2helper.Logd(TAG, "protocal init ret :" + Init + " " + i);
        return Init;
    }

    public int IntCallbackFromVoipSDK(int i, int i2, byte[] bArr) {
        IVoipCallBack iVoipCallBack = this.mUiCallBack;
        if (iVoipCallBack == null) {
            return 0;
        }
        iVoipCallBack.callBackFromVoip1(i, i2, bArr);
        return 0;
    }

    public native int Invite(int i, byte[] bArr, int i2, int i3);

    public native int OnNetworkChange(int i);

    public native int RecvNotify(byte[] bArr, int i, int i2);

    public native int SwitchAVCmd(int i);

    public int UninitSDK() {
        this.mUiCallBack = null;
        UnInit();
        return 0;
    }

    public native int UpdateAuthKey(byte[] bArr, int i);

    public native int playCallback(byte[] bArr, int i);

    public native int recordCallback(byte[] bArr, int i);

    public int setAppCmd(int i) {
        int appCmd = setAppCmd(i, new byte[]{0}, 1);
        if (appCmd < 0) {
            v2helper.Logd(TAG, "setAppCmd: type:" + appCmd + ":ret:" + appCmd);
        }
        return appCmd;
    }

    public native int setAppCmd(int i, byte[] bArr, int i2);

    public native int videoDecode(byte[] bArr);

    public native int videoEncodeToSend(byte[] bArr, int i, int i2, int i3, int i4);
}
