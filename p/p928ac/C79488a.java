package p928ac;

import com.tencent.p014mm.libwxaudio.WxAudioNative;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83174m;
import gy3.C87412m;

/* renamed from: ac.a */
public final class C79488a implements WxAudioNative.NativeCallBackInterface {

    /* renamed from: a */
    public WxAudioNative.NativeCallBackInterface f233047a;

    /* renamed from: ac.a$a */
    public static final class C79489a implements C83174m.C83175a {

        /* renamed from: d */
        public final /* synthetic */ C79488a f233048d;

        public C79489a(C79488a aVar) {
            this.f233048d = aVar;
        }

        public final void onDestroy() {
            this.f233048d.f233047a = null;
        }
    }

    public C79488a(WxAudioNative.NativeCallBackInterface nativeCallBackInterface, C83174m mVar) {
        C87412m.m108594g(mVar, "lifecycleOwner");
        this.f233047a = nativeCallBackInterface;
        mVar.mo115384z0(new C79489a(this));
    }

    public String getFilePath(String str) {
        WxAudioNative.NativeCallBackInterface nativeCallBackInterface = this.f233047a;
        String filePath = nativeCallBackInterface != null ? nativeCallBackInterface.getFilePath(str) : null;
        return filePath == null ? str == null ? "" : str : filePath;
    }

    public void onCallBack(long j, String str) {
        WxAudioNative.NativeCallBackInterface nativeCallBackInterface = this.f233047a;
        if (nativeCallBackInterface != null) {
            nativeCallBackInterface.onCallBack(j, str);
        }
    }
}
