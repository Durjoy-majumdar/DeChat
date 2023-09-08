package j42;

import com.tencent.p014mm.libwxaudio.WxAudioNative;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C86009m1;
import d42.C86186n;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import hp0.C8648d;
import q52.C62583q;
import rx3.C13598b0;
import z04.C112550d0;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: j42.l */
public final class C87869l implements WxAudioNative.NativeCallBackInterface {

    /* renamed from: a */
    public final /* synthetic */ C87830a f254361a;

    /* renamed from: j42.l$a */
    public static final class C60734a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C60734a f172988d = new C60734a();

        public C60734a() {
            super(0);
        }

        public Object invoke() {
            throw new IllegalStateException("WxAudio onCallback not supported");
        }
    }

    public C87869l(C87830a aVar) {
        this.f254361a = aVar;
    }

    public String getFilePath(String str) {
        C87412m.m108594g(str, "src");
        String str2 = this.f254361a.f254274E;
        Log.m105924i(str2, "wxAudio: getFilePath " + str);
        if (C112551y.m153819s(str, "file://", false)) {
            str = str.substring(7);
            C87412m.m108593f(str, "this as java.lang.String).substring(startIndex)");
        } else if (C112551y.m153819s(str, "data:audio", false) && C112550d0.m153801u(str, "base64", false)) {
            String substring = str.substring(C112550d0.m153769E(str, "base64,", 0, false, 6, (Object) null) + 7);
            C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
            str = C8648d.m8496b(C112550d0.m153799i0(substring).toString());
            C87412m.m108593f(str, "writeToFile(src.substrin…\"base64,\".length).trim())");
        } else if (C112551y.m153819s(str, "wxblob://", false)) {
            C86186n nVar = this.f254361a.f254284j;
            if (nVar != null) {
                C86009m1 privateAbsoluteFile = nVar.mo109577a().getPrivateAbsoluteFile(str);
                if (privateAbsoluteFile != null && privateAbsoluteFile.mo119967g()) {
                    str = privateAbsoluteFile.mo119971i();
                    C87412m.m108593f(str, "file.absolutePath");
                }
            } else {
                C87412m.m108603p("pkgManagement");
                throw null;
            }
        } else if (!C112551y.m153819s(str, HttpWrapperBase.PROTOCAL_HTTP, false) && !C112551y.m153819s(str, HttpWrapperBase.PROTOCAL_HTTPS, false)) {
            C86186n nVar2 = this.f254361a.f254284j;
            if (nVar2 != null) {
                C86009m1 absoluteFile = nVar2.mo109577a().getAbsoluteFile(str);
                if (absoluteFile != null && absoluteFile.mo119967g()) {
                    str = absoluteFile.mo119971i();
                    C87412m.m108593f(str, "file.absolutePath");
                }
            } else {
                C87412m.m108603p("pkgManagement");
                throw null;
            }
        }
        String str3 = this.f254361a.f254274E;
        Log.m105924i(str3, "wxAudio: getFilePath ret = " + str);
        return str;
    }

    public void onCallBack(long j, String str) {
        if (BuildInfo.DEBUG || WeChatEnvironment.hasDebugger()) {
            C60734a aVar = C60734a.f172988d;
            C87412m.m108594g(aVar, "r");
            ((C119157j) C119157j.f356862d).mo183884o(new C62583q.C62584a(aVar));
        }
    }
}
