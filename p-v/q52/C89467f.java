package q52;

import android.content.Context;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1727m;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82835n;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import e42.C7596h;
import fu3.C116901a;
import fy3.C32226l;
import gt0.C87375o0;
import gy3.C87412m;
import li0.C88508b;
import p224ra.C12964b;
import rx3.C13598b0;
import rx3.C48096k;
import z04.C112551y;

/* renamed from: q52.f */
public final class C89467f implements C82381f {

    /* renamed from: d */
    public final Context f257512d;

    /* renamed from: e */
    public final String f257513e;

    /* renamed from: f */
    public final C32226l<C7596h, C13598b0> f257514f;

    public C89467f(Context context, String str, C32226l<? super C7596h, C13598b0> lVar) {
        C87412m.m108594g(context, "ctx");
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(lVar, "callback");
        this.f257512d = context;
        this.f257513e = str;
        this.f257514f = lVar;
    }

    /* renamed from: a */
    public void mo109647a(int i, String str) {
        C87412m.m108594g(str, "data");
        C7596h hVar = new C7596h(str);
        if (!hVar.has("errCode")) {
            String optString = hVar.optString("errMsg");
            C87412m.m108593f(optString, "errMsg");
            if (C112551y.m153808h(optString, ":ok", false, 2, (Object) null)) {
                hVar.put("errCode", 0);
            } else {
                hVar.put("errCode", 4096);
            }
        }
        this.f257514f.invoke(hVar);
    }

    /* renamed from: b */
    public boolean mo109648b(String str, C40482o oVar) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    /* renamed from: d */
    public void mo109650d(String str, String str2) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    /* renamed from: e */
    public void mo109651e(String str, String str2, int[] iArr) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    /* renamed from: f */
    public void mo109652f(String str, String str2, int i) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public String getAppId() {
        return this.f257513e;
    }

    public C88508b getAppState() {
        return C88508b.FOREGROUND;
    }

    public /* synthetic */ C116901a getAsyncHandler() {
        return null;
    }

    public int getComponentId() {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public Context getContext() {
        return this.f257512d;
    }

    public C87375o0 getDialogContainer() {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public C81415h0 getFileSystem() {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public C82381f.C82384c getInterceptor() {
        return null;
    }

    public C83165i getJsRuntime() {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public /* synthetic */ C0125s getLifecycleOwner() {
        return null;
    }

    /* renamed from: h */
    public <T extends C82835n> T mo109666h(Class<T> cls) {
        C87412m.m108594g(cls, "clazz");
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public boolean isRunning() {
        return true;
    }

    /* renamed from: l */
    public <T extends C12964b> T mo109668l(Class<T> cls) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    /* renamed from: n */
    public void mo109669n(C82919r2 r2Var, int[] iArr) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    /* renamed from: o */
    public void mo109670o(Runnable runnable, long j) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    /* renamed from: p */
    public <T extends C1727m> T mo109671p(Class<T> cls) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    /* renamed from: s */
    public boolean mo109672s(C82835n nVar) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    /* renamed from: t */
    public void mo109673t(Runnable runnable) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    /* renamed from: v */
    public /* synthetic */ C82870p mo109675v(String str) {
        return null;
    }

    /* renamed from: w */
    public void mo109676w(C82919r2 r2Var) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }
}
