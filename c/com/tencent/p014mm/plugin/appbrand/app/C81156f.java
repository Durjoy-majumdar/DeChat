package com.tencent.p014mm.plugin.appbrand.app;

import android.content.Context;
import android.os.Parcelable;
import android.util.Pair;
import com.tencent.luggage.sdk.processes.LuggageServiceType;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage;
import com.tencent.p014mm.plugin.appbrand.app.C29114g;
import com.tencent.p014mm.plugin.appbrand.appcache.C81243g;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81427p;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import java.util.List;
import kotlin.Metadata;
import kr0.C88273g1;
import kr0.C88274h0;
import x20.C15618a;

@C86522b(creator = C29114g.C29115a.class, dependencies = {PluginAppBrand.class}, onProcess = {C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS})
/* renamed from: com.tencent.mm.plugin.appbrand.app.f */
public final class C81156f extends C86301e implements C88274h0 {

    /* renamed from: d */
    public static final C81156f f238464d = new C81156f();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCString;", "kotlin.jvm.PlatformType", "data", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "callback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCString;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.app.f$a */
    public static final class C81157a<InputType, ResultType> implements C1255d {

        /* renamed from: d */
        public static final C81157a<InputType, ResultType> f238465d = new C81157a<>();

        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            try {
                AppBrandProcessesManager a = AppBrandProcessesManager.f246131g.mo116962a();
                LuggageServiceType luggageServiceType = LuggageServiceType.WAGAME;
                String str = iPCString.f10315d;
                C87412m.m108593f(str, "data.value");
                a.mo116954S(luggageServiceType, C88273g1.valueOf(str));
                if (gVar != null) {
                    C15618a.m14625a(gVar);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrandMixExportLogicServiceAnyProcess", e, "preloadEnvForMiniGame", new Object[0]);
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCString;", "kotlin.jvm.PlatformType", "data", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "callback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCString;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.app.f$b */
    public static final class C81158b<InputType, ResultType> implements C1255d {

        /* renamed from: d */
        public static final C81158b<InputType, ResultType> f238466d = new C81158b<>();

        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            try {
                AppBrandProcessesManager a = AppBrandProcessesManager.f246131g.mo116962a();
                LuggageServiceType luggageServiceType = LuggageServiceType.WASERVICE;
                String str = iPCString.f10315d;
                C87412m.m108593f(str, "data.value");
                a.mo116954S(luggageServiceType, C88273g1.valueOf(str));
                if (gVar != null) {
                    C15618a.m14625a(gVar);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrandMixExportLogicServiceAnyProcess", e, "preloadEnvForMiniProgram", new Object[0]);
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCString;", "kotlin.jvm.PlatformType", "data", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "callback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCString;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.app.f$c */
    public static final class C81159c<InputType, ResultType> implements C1255d {

        /* renamed from: d */
        public static final C81159c<InputType, ResultType> f238467d = new C81159c<>();

        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            try {
                AppBrandProcessesManager a = AppBrandProcessesManager.f246131g.mo116962a();
                LuggageServiceType luggageServiceType = LuggageServiceType.WASERVICE;
                String str = iPCString.f10315d;
                C87412m.m108593f(str, "data.value");
                a.mo116954S(luggageServiceType, C88273g1.valueOf(str));
                if (gVar != null) {
                    C15618a.m14625a(gVar);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrandMixExportLogicServiceAnyProcess", e, "preloadEnvForPluginApp", new Object[0]);
            }
        }
    }

    /* renamed from: AC */
    public void mo113299AC(C88273g1 g1Var) {
        C87412m.m108594g(g1Var, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C15618a.m14627c(new IPCString(g1Var.name()), C81158b.f238466d, (C1256g) null, 4, (Object) null);
    }

    /* renamed from: BB */
    public Pair<Integer, String> mo113300BB(Context context, WXLaunchWxaRedirectingPage.Req req, String str, String str2, String str3) {
        throw new IllegalStateException("Not support".toString());
    }

    /* renamed from: Gt */
    public List<C81427p> mo113301Gt() {
        throw new IllegalStateException("Not support".toString());
    }

    public <T extends Parcelable> void O30(String str, T t) {
        throw new IllegalStateException("Not support".toString());
    }

    /* renamed from: QK */
    public void mo113303QK(C88273g1 g1Var) {
        C87412m.m108594g(g1Var, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C15618a.m14627c(new IPCString(g1Var.name()), C81157a.f238465d, (C1256g) null, 4, (Object) null);
    }

    /* renamed from: Ss */
    public void mo113304Ss(List<String> list) {
        throw new IllegalStateException("Not support".toString());
    }

    /* renamed from: TH */
    public void mo113305TH(C88273g1 g1Var) {
        C87412m.m108594g(g1Var, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C15618a.m14627c(new IPCString(g1Var.name()), C81159c.f238467d, (C1256g) null, 4, (Object) null);
    }

    public C82870p Xg0(int i) {
        return C81154e.m99438a(i);
    }

    public void a90() {
        throw new IllegalStateException("Not support".toString());
    }

    /* renamed from: b0 */
    public Pair<String, Integer> mo113308b0(int i) {
        return new Pair<>(C81243g.m99551a(i), Integer.valueOf(C0966R.C0969drawable.f4459d5));
    }

    /* renamed from: fx */
    public List<String> mo113309fx() {
        throw new IllegalStateException("Not support".toString());
    }

    public void j30(Context context, String str, String str2, String str3, boolean z, String str4) {
        throw new IllegalStateException("Not support".toString());
    }

    /* renamed from: k8 */
    public String mo113311k8(String str) {
        throw new IllegalStateException("Not support".toString());
    }

    /* renamed from: xm */
    public void mo113312xm() {
        throw new IllegalStateException("Not support".toString());
    }
}
