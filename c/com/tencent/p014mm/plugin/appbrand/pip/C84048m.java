package com.tencent.p014mm.plugin.appbrand.pip;

import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppFloatingVideoStruct;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.pip.C84021a;
import com.tencent.p014mm.plugin.appbrand.widget.AppBrandPipContainerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import hm0.C87554b;
import hm0.C87562h;
import hm0.C87564i;
import j20.C117292a;
import java.util.concurrent.ConcurrentHashMap;
import k20.C60958c;
import k20.C9556a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.pip.m */
public class C84048m implements C87564i.C87565a {

    /* renamed from: a */
    public final /* synthetic */ C84059t f245397a;

    /* renamed from: com.tencent.mm.plugin.appbrand.pip.m$a */
    public class C84049a implements Runnable {
        public C84049a() {
        }

        public void run() {
            AppBrandPipContainerView appBrandPipContainerView = C84048m.this.f245397a.f245419e;
            if (appBrandPipContainerView.f247482G) {
                Log.m105924i("MicroMsg.AppBrand.AppBrandPipContainerView", "showOnLoading");
                View view = appBrandPipContainerView.f247476A;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", "showOnLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", "showOnLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.pip.m$b */
    public class C84050b implements Runnable {
        public C84050b() {
        }

        public void run() {
            C84048m.this.f245397a.f245419e.mo117676p();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.pip.m$c */
    public class C84051c implements Runnable {
        public C84051c() {
        }

        public void run() {
            View view;
            C84059t tVar = C84048m.this.f245397a;
            C87562h hVar = tVar.f245425k;
            if (hVar != null && (view = tVar.f245423i) != null) {
                hVar.mo109565a(view, (Runnable) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.pip.m$d */
    public class C84052d implements Runnable {
        public C84052d() {
        }

        public void run() {
            View view;
            Log.m105924i(C84048m.this.f245397a.f245415a, "onPlayEnd, onPlayEndWorkaround");
            C84059t tVar = C84048m.this.f245397a;
            C87562h hVar = tVar.f245425k;
            if (hVar != null && (view = tVar.f245423i) != null) {
                hVar.mo109568f(view);
            }
        }
    }

    public C84048m(C84059t tVar) {
        this.f245397a = tVar;
    }

    /* renamed from: a */
    public void mo116693a(C87564i iVar) {
        String key = iVar.getKey();
        String str = this.f245397a.f245415a;
        Log.m105924i(str, "onError, key: " + key);
    }

    /* renamed from: b */
    public void mo116694b(C87564i iVar) {
        AppBrandPipContainerView appBrandPipContainerView;
        String key = iVar.getKey();
        String str = this.f245397a.f245415a;
        Log.m105924i(str, "onLoadEnd, key: " + key);
        String str2 = this.f245397a.f245426l;
        if (str2 != null && str2.equals(key) && (appBrandPipContainerView = this.f245397a.f245419e) != null) {
            appBrandPipContainerView.post(new C84050b());
            iVar.start();
        }
    }

    /* renamed from: c */
    public void mo116695c(C87564i iVar) {
        AppBrandPipContainerView appBrandPipContainerView;
        String key = iVar.getKey();
        String str = this.f245397a.f245415a;
        Log.m105924i(str, "onLoading, key: " + key);
        String str2 = this.f245397a.f245426l;
        if (str2 != null && str2.equals(key) && (appBrandPipContainerView = this.f245397a.f245419e) != null) {
            appBrandPipContainerView.post(new C84049a());
        }
    }

    /* renamed from: d */
    public void mo116696d(C87564i iVar) {
        String key = iVar.getKey();
        String str = this.f245397a.f245415a;
        Log.m105924i(str, "onPause, key: " + key);
        if (this.f245397a.f245414C) {
            Log.m105924i(this.f245397a.f245415a, "onPause, runtime paused");
            return;
        }
        Integer b = iVar.mo110185b();
        if (b != null) {
            C84059t tVar = this.f245397a;
            int intValue = b.intValue();
            C87564i.C87566b type = iVar.getType();
            C84021a i = tVar.mo116712i(intValue);
            if (i != null) {
                i.mo116678c(type, key);
            }
            String str2 = this.f245397a.f245426l;
            if (str2 == null || !str2.equals(key)) {
                this.f245397a.mo116713k(b.intValue(), key, "onPause");
                return;
            }
            return;
        }
        Log.m105928w(this.f245397a.f245415a, "onPause, pageViewId is null");
    }

    /* renamed from: e */
    public void mo116697e(C87564i iVar, boolean z) {
        AppBrandPipContainerView appBrandPipContainerView;
        String str;
        C87554b.C87555a aVar;
        C87554b.C87555a aVar2 = C87554b.C87555a.NONE;
        String key = iVar.getKey();
        String str2 = this.f245397a.f245415a;
        Log.m105924i(str2, "onPlay, key: " + key);
        if (this.f245397a.f245414C) {
            Log.m105924i(this.f245397a.f245415a, "onPlay, runtime paused");
            return;
        }
        Integer b = iVar.mo110185b();
        C84021a.C84024c cVar = null;
        int i = 1;
        if (b != null) {
            C84059t tVar = this.f245397a;
            C84021a aVar3 = (C84021a) ((ConcurrentHashMap) tVar.f245421g).get(Integer.valueOf(b.intValue()));
            if (aVar3 == null) {
                Log.m105928w(tVar.f245415a, "getPipVideoSession, null == pageScopedPipInfo");
            } else {
                cVar = (C84021a.C84024c) ((ConcurrentHashMap) aVar3.f245299i).get(key);
            }
            if (cVar != null) {
                C87554b.C87555a aVar4 = cVar.f245303b;
                if ((aVar4 == null || aVar2 == aVar4) ? false : true) {
                    C84059t tVar2 = this.f245397a;
                    int intValue = b.intValue();
                    C87564i.C87566b type = iVar.getType();
                    C84021a i2 = tVar2.mo116712i(intValue);
                    if (i2 != null) {
                        if (!tVar2.f245420f) {
                            tVar2.f245418d.setPipPageLifeCycleListener(new C84045j(tVar2));
                            tVar2.f245418d.setOnPageSwitchListener(new C84047l(tVar2));
                            C83231l.m102140a(tVar2.f245417c.f238147j, new C84044i(tVar2));
                            tVar2.f245418d.setDelegateWrapperFactory(new C84057r(tVar2));
                            tVar2.f245420f = true;
                        }
                        i2.mo116676a(type, key);
                    }
                }
            }
        } else {
            Log.m105928w(this.f245397a.f245415a, "onPlay, pageViewId is null");
        }
        C84036e eVar = this.f245397a.f245413B;
        if (!(eVar == null || cVar == null || (aVar = cVar.f245303b) == null || aVar2 == aVar)) {
            C84034d dVar = cVar.f245309h;
            Log.m105919d("MicroMsg.AppBrand.AppBrandPipReporter", "onVideoSupportPip, baseInfo: %s, mode: %s", dVar, aVar);
            WeAppFloatingVideoStruct a = ((C84025a0) eVar).mo116679a(dVar);
            a.f236590g = 1;
            int ordinal = aVar.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    i = 3;
                    if (ordinal != 3) {
                        i = 0;
                    }
                } else {
                    i = 2;
                }
            }
            a.f236591h = (long) i;
            a.mo86054n();
        }
        if (C84059t.m103574c(this.f245397a) && (str = this.f245397a.f245426l) != null && str.equals(key)) {
            C84059t tVar3 = this.f245397a;
            if (tVar3.f245419e != null) {
                Log.m105924i(tVar3.f245415a, "processTransferFromOnPlay for other video is playing");
                this.f245397a.f245419e.post(new C84054o(this, z));
                return;
            }
        }
        String str3 = this.f245397a.f245426l;
        if (str3 == null || !str3.equals(key)) {
            if (b != null) {
                this.f245397a.mo116708e(b.intValue(), key, "onPlay");
            }
            C84059t tVar4 = this.f245397a;
            if ((!tVar4.f245434t || !tVar4.f245435u) && tVar4.f245426l != null && (appBrandPipContainerView = tVar4.f245419e) != null) {
                appBrandPipContainerView.post(new C84054o(this, z));
                return;
            }
            return;
        }
        Log.m105924i(this.f245397a.f245415a, "onPlay, mark pip video play");
        ((C119157j) C119157j.f356862d).mo183895z(new C84051c());
        C84059t tVar5 = this.f245397a;
        tVar5.f245432r = false;
        C84059t.m103573b(tVar5, "onPlay");
    }

    /* renamed from: f */
    public void mo116698f(C87564i iVar) {
        String key = iVar.getKey();
        String str = this.f245397a.f245415a;
        Log.m105924i(str, "onPlayEnd, key: " + key);
        String str2 = this.f245397a.f245426l;
        if (str2 != null && str2.equals(key)) {
            C84059t tVar = this.f245397a;
            if (tVar.f245419e != null) {
                tVar.mo116707a("onPlayEnd");
                this.f245397a.f245432r = true;
            }
        }
        Integer b = iVar.mo110185b();
        if (b != null) {
            C84059t tVar2 = this.f245397a;
            int intValue = b.intValue();
            C87564i.C87566b type = iVar.getType();
            C84021a i = tVar2.mo116712i(intValue);
            if (i != null) {
                i.mo116678c(type, key);
            }
            String str3 = this.f245397a.f245426l;
            if (str3 == null || !str3.equals(key)) {
                this.f245397a.mo116713k(b.intValue(), key, "onPlayEnd");
            }
        } else {
            Log.m105928w(this.f245397a.f245415a, "onPlayEnd, pageViewId is null");
        }
        if (this.f245397a.f245425k != null) {
            ((C119157j) C119157j.f356862d).mo183895z(new C84052d());
        }
    }

    /* renamed from: g */
    public void mo116699g(C87564i iVar) {
        String key = iVar.getKey();
        String str = this.f245397a.f245415a;
        Log.m105924i(str, "onStop, key: " + key);
        String str2 = this.f245397a.f245426l;
        if (str2 != null && str2.equals(key)) {
            C84059t tVar = this.f245397a;
            if (tVar.f245419e != null) {
                tVar.mo116707a("onStop");
                this.f245397a.f245432r = true;
            }
        }
        Integer b = iVar.mo110185b();
        if (b != null) {
            C84059t tVar2 = this.f245397a;
            int intValue = b.intValue();
            C87564i.C87566b type = iVar.getType();
            C84021a i = tVar2.mo116712i(intValue);
            if (i != null) {
                i.mo116678c(type, key);
            }
            String str3 = this.f245397a.f245426l;
            if (str3 == null || !str3.equals(key)) {
                this.f245397a.mo116713k(b.intValue(), key, "onStop");
                return;
            }
            return;
        }
        Log.m105928w(this.f245397a.f245415a, "onStop, pageViewId is null");
    }
}
