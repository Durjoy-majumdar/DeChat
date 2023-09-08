package com.tencent.wxmm;

import j20.C117292a;
import java.nio.ByteBuffer;
import k20.C9556a;

public class v2conference {
    private static final String TAG = "WXMM.Conference";
    private byte _hellAccFlag_;
    public int[] audioChannels = {1};
    public int[] audioFrameLen = {20};
    public int[] audioSampleRate = {8000};
    public int defaultHeight = 480;
    public int defaultWidth = 640;
    public int field_HWEncH = 0;
    public int field_HWEncW = 0;
    public int field_localImgHeight = 0;
    public int field_localImgWidth = 0;
    public int field_remoteImgFormat = 0;
    public int field_remoteImgHeight = 0;
    public int field_remoteImgLength = 0;
    public int field_remoteImgMember = -1;
    public int field_remoteImgWidth = 0;
    public int field_remoteScreenImgFormat = 0;
    public int field_remoteScreenImgHeight = 0;
    public int field_remoteScreenImgLength = 0;
    public int field_remoteScreenImgMember = -1;
    public int field_remoteScreenImgWidth = 0;
    private IConfCallBack mUiConfCallback = null;
    public int maxMemberSize = 100;
    public byte[] remoteImgBuffer = null;
    public ByteBuffer videoBuffer = null;

    static {
        C9556a aVar = new C9556a();
        aVar.mo10233c("c++_shared");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/wxmm/v2conference", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/wxmm/v2conference", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c("ilink2");
        Object obj2 = new Object();
        C117292a.m165358d(obj2, aVar2.mo10232b(), "com/tencent/wxmm/v2conference", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar2.mo10231a(0));
        C117292a.m165359e(obj2, "com/tencent/wxmm/v2conference", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c("confService");
        Object obj3 = new Object();
        C117292a.m165358d(obj3, aVar3.mo10232b(), "com/tencent/wxmm/v2conference", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar3.mo10231a(0));
        C117292a.m165359e(obj3, "com/tencent/wxmm/v2conference", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    private native int GetVideoData(byte[] bArr, int i);

    public native int Accept(int i);

    public native int Ack();

    public native int Add(byte[] bArr, int i);

    public byte[] CallbackFromConferenceSDK(int i, int i2, byte[] bArr) {
        IConfCallBack iConfCallBack = this.mUiConfCallback;
        if (iConfCallBack != null) {
            return iConfCallBack.callBackFromConf(i, i2, bArr);
        }
        return null;
    }

    public void CallbackOnVideoFrameFromSDK(int i, int i2, int i3, int i4) {
        IConfCallBack iConfCallBack = this.mUiConfCallback;
        if (iConfCallBack != null) {
            iConfCallBack.callbackVideoFrame(i, this.videoBuffer, i2, i3, i4);
        }
    }

    public void CallbackWriteLogFromSDK(int i, String str, String str2, int i2, String str3, String str4, int i3) {
        IConfCallBack iConfCallBack = this.mUiConfCallback;
        if (iConfCallBack != null) {
            iConfCallBack.callbackWriteLog(i, str, str2, i2, str3, str4, i3);
        }
    }

    public native int ExitRoom(int i);

    public int GetAllActiveMembers(int[] iArr, int i) {
        if (iArr == null || i <= 0) {
            return -1;
        }
        return GetVADMembers(iArr, i);
    }

    public native int GetAudioData(byte[] bArr, int i);

    public native int GetAudioDataToPlayInLiveMode(byte[] bArr, int i);

    public int GetAudioDeviceFmt(AudDataFmt audDataFmt) {
        int GetAudioFormat = GetAudioFormat(this.audioSampleRate, this.audioFrameLen, this.audioChannels);
        audDataFmt.nChannesl = this.audioChannels[0];
        audDataFmt.nFramelen = this.audioFrameLen[0];
        audDataFmt.nSamplerate = this.audioSampleRate[0];
        return GetAudioFormat;
    }

    public native int GetAudioFormat(int[] iArr, int[] iArr2, int[] iArr3);

    public native int GetConfRecordAudioData(byte[] bArr, int i);

    public int GetDecodeVideoData(byte[] bArr, int i) {
        return GetVideoData(bArr, i);
    }

    public ByteBuffer GetDirectByteBuffer(int i) {
        ByteBuffer byteBuffer = this.videoBuffer;
        if (byteBuffer == null) {
            this.videoBuffer = ByteBuffer.allocateDirect(i);
        } else if (byteBuffer.capacity() < i) {
            this.videoBuffer = ByteBuffer.allocateDirect(i);
        }
        return this.videoBuffer;
    }

    public native int GetVADMembers(int[] iArr, int i);

    public native int GetVoiceActivity(int i);

    public native int Hangup(int i);

    public native int ImageConvert(ImagePlane imagePlane, ImagePlane imagePlane2, byte[] bArr, byte[] bArr2);

    public native int Init(byte[] bArr, int i);

    public int InitSDK(byte[] bArr, int i, IConfCallBack iConfCallBack) {
        this.mUiConfCallback = iConfCallBack;
        this.remoteImgBuffer = new byte[(((this.defaultWidth * this.defaultHeight) * 3) / 2)];
        return Init(bArr, i);
    }

    public native int Invite(byte[] bArr, int i);

    public native int JoinRoom(byte[] bArr, int i);

    public native int OnNetworkChange(int i, byte[] bArr);

    public native int PutExternalplayAudioData(byte[] bArr, int i, int i2, int i3, int i4);

    public native int PutProcessedAudioDataToEncodeInLiveMode(byte[] bArr, int i);

    public native int RecvNotify(byte[] bArr, int i, int i2);

    public native int SendAudioData(byte[] bArr, int i, int i2);

    public native int SendCmdMsg(byte[] bArr, int i);

    public native int SendVideoData(byte[] bArr, int i, int i2, int i3, int i4);

    public native int SetAppCmd(int i, byte[] bArr, int i2);

    public native int SetAudioDevFormat(int i, int i2, int i3);

    public void SetUICallback(IConfCallBack iConfCallBack) {
        this.mUiConfCallback = iConfCallBack;
    }

    public native int StartPublish(byte[] bArr, int i);

    public native int StopPublish();

    public native int SubscribeVideo(byte[] bArr, int i);

    public native int SwitchAV(int i, int i2, int i3);

    public native int SwitchAudio(int i);

    public native int SwitchVideo(int i);

    public native int UnInit();

    public int UninitSDK() {
        this.mUiConfCallback = null;
        UnInit();
        return 0;
    }

    public native int UpdateAuthKey(byte[] bArr, int i);

    public native int imgClip(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4, int i5, int i6);

    public native int videoHWProcess(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6);

    public native int videoTrans(byte[] bArr, int i, int i2, int i3, int i4, int[] iArr);
}
