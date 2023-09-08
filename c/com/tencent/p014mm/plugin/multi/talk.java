package com.tencent.p014mm.plugin.multi;

import bs3.C104161b;
import com.tencent.wecall.talkroom.model.VoiceEngineConf;
import j20.C117292a;
import java.util.concurrent.atomic.AtomicInteger;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.multi.talk */
public class talk {

    /* renamed from: a */
    public static int f314039a = 8000;

    /* renamed from: b */
    public static int f314040b = 20;
    public byte[] field_capInfo = null;
    public int field_localImgHeight = 0;
    public int field_localImgWidth = 0;
    public int field_remoteImgChannel = 0;
    public int field_remoteImgChannel_screen = 0;
    public int field_remoteImgHeight = 0;
    public int field_remoteImgHeight_screen = 0;
    public int field_remoteImgLength = 0;
    public int field_remoteImgLength_screen = 0;
    public int field_remoteImgOrien = 0;
    public int field_remoteImgOrien_screen = 0;
    public int field_remoteImgWidth = 0;
    public int field_remoteImgWidth_screen = 0;

    /* renamed from: com.tencent.mm.plugin.multi.talk$IMultiTalkListener */
    public interface IMultiTalkListener {
        void keep_OnError(int i);

        void keep_OnNotify(int i);

        void keep_OnOpenSuccess();

        void keep_OnReportChannel(String str);

        void keep_OnReportEngineRecv(String str, int i);

        void keep_OnReportEngineSend(String str);
    }

    static {
        try {
            C9556a aVar = new C9556a();
            aVar.mo10233c("stlport_shared");
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/multi/talk", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/plugin/multi/talk", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c("wechatxlog");
            Object obj2 = new Object();
            C117292a.m165358d(obj2, aVar2.mo10232b(), "com/tencent/mm/plugin/multi/talk", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar2.mo10231a(0));
            C117292a.m165359e(obj2, "com/tencent/mm/plugin/multi/talk", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c("voipMain");
            Object obj3 = new Object();
            C117292a.m165358d(obj3, aVar3.mo10232b(), "com/tencent/mm/plugin/multi/talk", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar3.mo10231a(0));
            C117292a.m165359e(obj3, "com/tencent/mm/plugin/multi/talk", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        } catch (Throwable th) {
            C104161b.m138997f("loadLibrary: ", th);
        }
    }

    public native int GetAudioData(byte[] bArr, int i, AtomicInteger atomicInteger, AtomicInteger atomicInteger2);

    public native int GetVoiceActivity(int i);

    public native int IsSilenceFrame();

    public native void OnMembersChanged(int[] iArr);

    public native int Open(IMultiTalkListener iMultiTalkListener, VoiceEngineConf voiceEngineConf, int i, int i2, int i3, long j, String[] strArr, short[] sArr, int i4, int[] iArr, byte[] bArr, boolean z, int i5, String[] strArr2, short[] sArr2, int i6, int i7, int i8, byte[] bArr2, int[] iArr2, int i9, String str);

    public native int Redirect(String[] strArr, short[] sArr, String[] strArr2, short[] sArr2, int i);

    public native int SendAudio(byte[] bArr, short s, int i);

    public native int SendScreen(byte[] bArr, int i, int i2, int i3, int i4);

    public native int SendVideo(byte[] bArr, int i, int i2, int i3, int i4, int i5);

    public native void SetAVEncryptType(int i, int i2);

    public native int SetCurrentMicId(int i);

    public native int close();

    public native int getChannelBytes(AtomicInteger atomicInteger, AtomicInteger atomicInteger2);

    public native int getSampleRate(AtomicInteger atomicInteger, AtomicInteger atomicInteger2);

    public native int imgClip(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4, int i5, int i6);

    public native int init(int i, int i2, int i3, int i4, String str);

    public native int onNetworkChange(int i);

    public native int screenDecode(byte[] bArr, int[] iArr, int i);

    public native int screenTrans(byte[] bArr, int i, int i2, int i3, byte[] bArr2, int i4, int i5, int i6);

    public native int setAppCmd(int i, byte[] bArr, int i2);

    public native int setMVSvrCfg(int[] iArr, int i);

    public native int uninit();

    public native int videoDecode(int[] iArr);

    public native int videoTrans(byte[] bArr, int i, int i2, int i3, int i4, int[] iArr);
}
