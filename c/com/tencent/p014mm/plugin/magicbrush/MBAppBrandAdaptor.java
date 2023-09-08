package com.tencent.p014mm.plugin.magicbrush;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C0125s;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.appbrand.commonjni.AppBrandJsBridgeBinding;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1727m;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82366d;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82835n;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83125x6;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82408a1;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82412b1;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82416c1;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82428f0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82431g0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82449j;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82452k;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82455l;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82456l0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82458m;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82459m0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82461n;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82462n0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82464o;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82465o0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82467p;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82468p0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82470q;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82471q0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82473r;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82475r0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82477s;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82479s0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82481t;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82483t0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82485u;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82486u0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82488v;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82489v0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82497w0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82502y0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82504z0;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83139a;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C86179f;
import d42.C86186n;
import di3.C86312j;
import fu3.C116901a;
import fy3.C32224a;
import gt0.C87375o0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import li0.C88508b;
import org.json.JSONObject;
import p224ra.C12964b;
import p235sm.C90233i0;
import r42.C89869a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import rx3.C48096k;
import sx3.C36907w;
import sx3.C64197v;
import sx3.C90363p0;
import sx3.C90364q0;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002BI\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\rj\b\u0012\u0004\u0012\u00020\u0005`\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/plugin/magicbrush/MBAppBrandAdaptor;", "Ld42/f;", "Lcom/tencent/mm/plugin/appbrand/jsapi/f;", "Landroid/content/Context;", "context", "", "instanceName", "Lcom/tencent/mm/plugin/appbrand/jsruntime/a;", "jsRuntime", "Lcom/tencent/mm/appbrand/commonjni/AppBrandJsBridgeBinding;", "jsBridge", "Ld42/n;", "pkgManagement", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "jsapiNameSet", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/jsruntime/a;Lcom/tencent/mm/appbrand/commonjni/AppBrandJsBridgeBinding;Ld42/n;Ljava/util/HashSet;)V", "mb-impl_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.magicbrush.MBAppBrandAdaptor */
public final class MBAppBrandAdaptor implements C86179f, C82381f {

    /* renamed from: d */
    public final Context f248358d;

    /* renamed from: e */
    public final C83139a f248359e;

    /* renamed from: f */
    public final AppBrandJsBridgeBinding f248360f;

    /* renamed from: g */
    public final C86186n f248361g;

    /* renamed from: h */
    public String f248362h;

    /* renamed from: i */
    public final Handler f248363i = new Handler(Looper.getMainLooper());

    /* renamed from: j */
    public final C13601g f248364j;

    /* renamed from: n */
    public final String f248365n;

    /* renamed from: com.tencent.mm.plugin.magicbrush.MBAppBrandAdaptor$a */
    public static final class C85242a extends C87413o implements C32224a<Map<String, ? extends C82870p>> {

        /* renamed from: d */
        public final /* synthetic */ MBAppBrandAdaptor f248366d;

        /* renamed from: e */
        public final /* synthetic */ HashSet<String> f248367e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C85242a(MBAppBrandAdaptor mBAppBrandAdaptor, HashSet<String> hashSet) {
            super(0);
            this.f248366d = mBAppBrandAdaptor;
            this.f248367e = hashSet;
        }

        public Object invoke() {
            int i = 16;
            if (!C87412m.m108589b(this.f248366d.f248362h, "MagicPlayable")) {
                HashSet<String> hashSet = this.f248367e;
                int a = C90363p0.m113142a(C36907w.m41090l(hashSet, 10));
                if (a < 16) {
                    a = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                for (String cls : hashSet) {
                    Object newInstance = Class.forName(cls).newInstance();
                    C87412m.m108592e(newInstance, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandJsApi");
                    C82870p pVar = (C82870p) newInstance;
                    linkedHashMap.put(pVar.mo114779e(), pVar);
                }
                this.f248366d.getClass();
                Class cls2 = C90233i0.class;
                List f = C64197v.m75537f(new C82489v0(), new C82497w0(), new C82473r(), new C82477s(), new C82481t(), new C82471q0(), new C82465o0(), new C82416c1(), new C82431g0(), new C82459m0(), new C82486u0(), new C82452k(), new C82504z0(), new C82488v(), new C82470q(), new C82462n0(), new C82412b1(), new C82428f0(), new C82456l0(), new C82483t0(), new C82449j(), new C82502y0(), new C82485u(), new C82467p(), new C82408a1(), new C82468p0(), new C82461n(), new C82464o(), new C82475r0(), new C82479s0(), new C82455l(), new C82458m(), ((C90233i0) C86312j.m106911c(cls2)).Qf0(), ((C90233i0) C86312j.m106911c(cls2)).mo124331mx(), ((C90233i0) C86312j.m106911c(cls2)).mo124326Ew(), new C89869a());
                int a2 = C90363p0.m113142a(C36907w.m41090l(f, 10));
                if (a2 >= 16) {
                    i = a2;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                for (Object next : f) {
                    linkedHashMap2.put(((C82870p) next).mo114779e(), next);
                }
                return C90364q0.m113149h(linkedHashMap, linkedHashMap2);
            }
            HashSet<String> hashSet2 = this.f248367e;
            int a3 = C90363p0.m113142a(C36907w.m41090l(hashSet2, 10));
            if (a3 < 16) {
                a3 = 16;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(a3);
            for (String cls3 : hashSet2) {
                Object newInstance2 = Class.forName(cls3).newInstance();
                C87412m.m108592e(newInstance2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandJsApi");
                C82870p pVar2 = (C82870p) newInstance2;
                linkedHashMap3.put(pVar2.mo114779e(), pVar2);
            }
            this.f248366d.getClass();
            List f2 = C64197v.m75537f(new C82465o0(), new C82462n0());
            int a4 = C90363p0.m113142a(C36907w.m41090l(f2, 10));
            if (a4 >= 16) {
                i = a4;
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(i);
            for (Object next2 : f2) {
                linkedHashMap4.put(((C82870p) next2).mo114779e(), next2);
            }
            return C90364q0.m113149h(linkedHashMap3, linkedHashMap4);
        }
    }

    public MBAppBrandAdaptor(Context context, String str, C83139a aVar, AppBrandJsBridgeBinding appBrandJsBridgeBinding, C86186n nVar, HashSet<String> hashSet) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(aVar, "jsRuntime");
        C87412m.m108594g(appBrandJsBridgeBinding, "jsBridge");
        C87412m.m108594g(nVar, "pkgManagement");
        C87412m.m108594g(hashSet, "jsapiNameSet");
        this.f248358d = context;
        this.f248359e = aVar;
        this.f248360f = appBrandJsBridgeBinding;
        this.f248361g = nVar;
        this.f248362h = C112550d0.m153797g0(str, "_", str);
        this.f248364j = C36568h.m40985a(new C85242a(this, hashSet));
        this.f248365n = "MBAppBrandAdaptor_" + str;
    }

    /* renamed from: a */
    public void mo109647a(int i, String str) {
        this.f248360f.invokeCallbackHandler(i, str);
    }

    /* renamed from: b */
    public boolean mo109648b(String str, C40482o oVar) {
        C87412m.m108594g(str, ProviderConstants.API_PATH);
        return true;
    }

    /* renamed from: d */
    public void mo109650d(String str, String str2) {
        C87412m.m108594g(str, "event");
        C87412m.m108594g(str2, "data");
        mo109652f(str, str2, 0);
    }

    /* renamed from: e */
    public void mo109651e(String str, String str2, int[] iArr) {
        C87412m.m108594g(str, "event");
        C87412m.m108594g(str2, "data");
        C87412m.m108594g(iArr, "dst");
        mo109652f(str, str2, hashCode());
    }

    /* renamed from: f */
    public void mo109652f(String str, String str2, int i) {
        C87412m.m108594g(str, "event");
        C87412m.m108594g(str2, "data");
        AppBrandJsBridgeBinding appBrandJsBridgeBinding = this.f248360f;
        appBrandJsBridgeBinding.subscribeHandler(str, str2, i, "{\"nativeTime\": " + System.currentTimeMillis() + '}');
    }

    /* renamed from: g */
    public Collection mo118365g() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) ((C36570n) this.f248364j).getValue()).entrySet()) {
            if (entry.getValue() instanceof C82268c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry key : linkedHashMap.entrySet()) {
            arrayList.add((String) key.getKey());
        }
        return arrayList;
    }

    public String getAppId() {
        return this.f248361g.mo109579c();
    }

    public C88508b getAppState() {
        return C88508b.FOREGROUND;
    }

    public /* synthetic */ C116901a getAsyncHandler() {
        return null;
    }

    public int getComponentId() {
        return hashCode();
    }

    public Context getContext() {
        return this.f248358d;
    }

    public C87375o0 getDialogContainer() {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public C81415h0 getFileSystem() {
        return this.f248361g.mo109577a();
    }

    public C82381f.C82384c getInterceptor() {
        return null;
    }

    public C83165i getJsRuntime() {
        return this.f248359e;
    }

    public /* synthetic */ C0125s getLifecycleOwner() {
        return null;
    }

    /* renamed from: h */
    public <T extends C82835n> T mo109666h(Class<T> cls) {
        C87412m.m108594g(cls, "clazz");
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    /* renamed from: i */
    public String mo118366i(String str, String str2, String str3, int i) {
        C87412m.m108594g(str, ProviderConstants.API_PATH);
        C87412m.m108594g(str2, "data");
        C87412m.m108594g(str3, "extData");
        C82870p pVar = (C82870p) ((Map) ((C36570n) this.f248364j).getValue()).get(str);
        if (pVar == null) {
            String str4 = this.f248365n;
            Log.m105920e(str4, "jsapi " + str + " not found!");
            this.f248360f.invokeCallbackHandler(i, "{\"errMsg\":\"Not found\", \"errCode\": -2}");
            return "";
        } else if (pVar instanceof C82016a0) {
            this.f248360f.invokeCallbackHandler(i, ((C82016a0) pVar).mo1731t(this, new JSONObject(str2)));
            return "";
        } else if (pVar instanceof C82366d) {
            ((C82366d) pVar).mo114544c(new C83125x6(this.f248359e, this, new JSONObject(str2), str3.length() > 0 ? new JSONObject(str3) : null, i));
            return "";
        } else if (pVar instanceof C82268c) {
            ((C82268c) pVar).mo1505u(this, new JSONObject(str2), i);
            return "";
        } else {
            String str5 = this.f248365n;
            Log.m105920e(str5, "why you use jsapi " + str + " without test???");
            return "";
        }
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
        C87412m.m108594g(r2Var, "event");
        C87412m.m108594g(iArr, "dst");
        String e = r2Var.mo114779e();
        C87412m.m108593f(e, "event.name");
        String j = r2Var.mo115160j();
        C87412m.m108593f(j, "event.data");
        mo109651e(e, j, iArr);
    }

    /* renamed from: o */
    public void mo109670o(Runnable runnable, long j) {
        C87412m.m108594g(runnable, "runnable");
        this.f248363i.postDelayed(runnable, j);
    }

    /* renamed from: p */
    public <T extends C1727m> T mo109671p(Class<T> cls) {
        return null;
    }

    /* renamed from: s */
    public boolean mo109672s(C82835n nVar) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    /* renamed from: t */
    public void mo109673t(Runnable runnable) {
        C87412m.m108594g(runnable, "runnable");
        this.f248363i.post(runnable);
    }

    /* renamed from: v */
    public C82870p mo109675v(String str) {
        C87412m.m108594g(str, "apiName");
        return (C82870p) ((Map) ((C36570n) this.f248364j).getValue()).get(str);
    }

    /* renamed from: w */
    public void mo109676w(C82919r2 r2Var) {
        C87412m.m108594g(r2Var, "event");
        r2Var.mo115161k(this).mo115158h();
    }
}
