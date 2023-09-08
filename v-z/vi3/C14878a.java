package vi3;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.stub.WebViewStubService;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import gy3.C87412m;
import p167hz.C21031j;
import s73.C13626a;
import t83.C13848e;
import t83.C13854i1;
import t83.C48590l;

/* renamed from: vi3.a */
public final class C14878a implements C21031j {

    /* renamed from: a */
    public final C48590l f40907a = new C13626a(WebViewStubService.class, "topStory", "", JsapiPermissionWrapper.f121047h).mo13024a();

    /* renamed from: a */
    public void mo13942a(String str, String str2, String str3, C13848e eVar) {
        C87412m.m108594g(str, "func");
        C87412m.m108594g(str2, "msg");
        C87412m.m108594g(str3, "callbackId");
        this.f40907a.mo63613h(C13854i1.m13150c(str, str2, str3), eVar);
    }

    /* renamed from: b */
    public void mo13943b(Context context) {
        this.f40907a.f129998c = context;
    }
}
