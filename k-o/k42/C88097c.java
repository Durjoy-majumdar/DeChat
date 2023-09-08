package k42;

import com.tencent.p014mm.appbrand.commonjni.AppBrandJsBridgeBinding;
import com.tencent.p014mm.appbrand.p942v8.IJSRuntime;
import gy3.C87412m;

/* renamed from: k42.c */
public final class C88097c extends AppBrandJsBridgeBinding {

    /* renamed from: a */
    public final IJSRuntime f254800a;

    /* renamed from: k42.c$a */
    public static final class C88098a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C88097c f254801d;

        /* renamed from: e */
        public final /* synthetic */ int f254802e;

        /* renamed from: f */
        public final /* synthetic */ String f254803f;

        public C88098a(C88097c cVar, int i, String str) {
            this.f254801d = cVar;
            this.f254802e = i;
            this.f254803f = str;
        }

        public final void run() {
            C88097c.super.invokeCallbackHandler(this.f254802e, this.f254803f);
        }
    }

    /* renamed from: k42.c$b */
    public static final class C88099b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C88097c f254804d;

        /* renamed from: e */
        public final /* synthetic */ String f254805e;

        /* renamed from: f */
        public final /* synthetic */ String f254806f;

        /* renamed from: g */
        public final /* synthetic */ int f254807g;

        /* renamed from: h */
        public final /* synthetic */ String f254808h;

        public C88099b(C88097c cVar, String str, String str2, int i, String str3) {
            this.f254804d = cVar;
            this.f254805e = str;
            this.f254806f = str2;
            this.f254807g = i;
            this.f254808h = str3;
        }

        public final void run() {
            C88097c.super.subscribeHandler(this.f254805e, this.f254806f, this.f254807g, this.f254808h);
        }
    }

    public C88097c(IJSRuntime iJSRuntime) {
        C87412m.m108594g(iJSRuntime, "jsRuntime");
        this.f254800a = iJSRuntime;
    }

    public void invokeCallbackHandler(int i, String str) {
        this.f254800a.mo112450v(new C88098a(this, i, str));
    }

    public void subscribeHandler(String str, String str2, int i, String str3) {
        this.f254800a.mo112450v(new C88099b(this, str, str2, i, str3));
    }
}
