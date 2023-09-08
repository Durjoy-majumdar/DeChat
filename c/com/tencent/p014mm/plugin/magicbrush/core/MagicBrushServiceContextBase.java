package com.tencent.p014mm.plugin.magicbrush.core;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import com.tencent.matrix.lifecycle.C80403e;
import com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.magicbrush.C30193g0;
import com.tencent.p014mm.plugin.magicbrush.C30200i0;
import com.tencent.p014mm.plugin.magicbrush.C85282s0;
import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C86188p;
import d42.C86191t;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import g42.C87148f;
import g42.C87157g;
import gy3.C87412m;
import gy3.C87413o;
import j52.C87879c;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONObject;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/magicbrush/core/MagicBrushServiceContextBase;", "Landroid/app/Service;", "<init>", "()V", "mb-core_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.magicbrush.core.MagicBrushServiceContextBase */
public class MagicBrushServiceContextBase extends Service {

    /* renamed from: f */
    public static final /* synthetic */ int f248392f = 0;

    /* renamed from: d */
    public final C13601g f248393d = C36568h.m40985a(new C85254b(this));

    /* renamed from: e */
    public final C85253a f248394e = new C85253a(this);

    /* renamed from: com.tencent.mm.plugin.magicbrush.core.MagicBrushServiceContextBase$a */
    public static final class C85253a extends C80403e {

        /* renamed from: b */
        public final /* synthetic */ MagicBrushServiceContextBase f248395b;

        public C85253a(MagicBrushServiceContextBase magicBrushServiceContextBase) {
            this.f248395b = magicBrushServiceContextBase;
        }

        /* renamed from: a */
        public void mo56329a() {
            Log.m105924i("MagicBrushServiceContext", "onEnterForeground");
            MagicBrushServiceContextBase magicBrushServiceContextBase = this.f248395b;
            int i = MagicBrushServiceContextBase.f248392f;
            magicBrushServiceContextBase.mo118406a().mo121592j(true);
        }

        /* renamed from: b */
        public void mo56330b() {
            Log.m105924i("MagicBrushServiceContext", "onExitForeground");
            MagicBrushServiceContextBase magicBrushServiceContextBase = this.f248395b;
            int i = MagicBrushServiceContextBase.f248392f;
            magicBrushServiceContextBase.mo118406a().mo121592j(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.magicbrush.core.MagicBrushServiceContextBase$b */
    public static final class C85254b extends C87413o implements C32224a<C87148f> {

        /* renamed from: d */
        public final /* synthetic */ MagicBrushServiceContextBase f248396d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C85254b(MagicBrushServiceContextBase magicBrushServiceContextBase) {
            super(0);
            this.f248396d = magicBrushServiceContextBase;
        }

        public Object invoke() {
            MagicBrushServiceContextBase magicBrushServiceContextBase = this.f248396d;
            C7335d c = C86312j.m106911c(C30200i0.class);
            C87412m.m108593f(c, "getService(IMBPublicServiceMgrFeature::class.java)");
            C7335d c2 = C86312j.m106911c(C30193g0.class);
            C87412m.m108593f(c2, "getService(IMBPluginMgrFeature::class.java)");
            return new C87148f(magicBrushServiceContextBase, (C86191t) c, (C86188p) c2);
        }
    }

    /* renamed from: a */
    public final C87148f mo118406a() {
        return (C87148f) ((C36570n) this.f248393d).getValue();
    }

    public IBinder onBind(Intent intent) {
        C87412m.m108594g(intent, "intent");
        return mo118406a();
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        C87148f a = mo118406a();
        synchronized (a) {
            boolean A = C85875k4.m106144A(configuration);
            Log.m105924i("MagicBrushServerMgr", "onConfigurationChange: lastDarkMode = " + a.f252749n + ", newDarkMode = " + A);
            if (a.f252749n != A) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("theme", A ? "dark" : "light");
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …\n            }.toString()");
                Log.m105924i("MagicBrushServerMgr", "onConfigurationChange: sendData = " + jSONObject2);
                Set<String> keySet = a.f252746h.keySet();
                C87412m.m108593f(keySet, "serverMap.keys");
                for (String str : keySet) {
                    C87412m.m108593f(str, "instanceName");
                    a.mo121585b(str, new C87157g(a, str, jSONObject2));
                }
                a.f252749n = A;
            }
        }
    }

    public void onCreate() {
        super.onCreate();
        Log.m105924i("MagicBrushServiceContext", "service created");
        C85282s0.f248437b = true;
        AppUIForegroundOwner.INSTANCE.addLifecycleCallback((C80403e) this.f248394e);
        IMagicBrushMonitor.C85281a.m105255c(C87879c.f254379e, "magicbrush", IMagicBrushMonitor.TimeCostScene.PRELOAD_SERVICE.name(), C85282s0.f248439d, (String) null, 8, (Object) null);
    }

    public void onDestroy() {
        AppUIForegroundOwner.INSTANCE.removeLifecycleCallback((C80403e) this.f248394e);
        mo118406a().mo121591i("");
        C85282s0.f248437b = false;
    }
}
