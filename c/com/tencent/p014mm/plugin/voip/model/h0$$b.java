package com.tencent.p014mm.plugin.voip.model;

import a14.C0002w;
import a14.C53872d1;
import a14.C53873d2;
import a14.C53930o0;
import a14.C53973z1;
import android.content.Context;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.WindowManager;
import android.widget.ImageView;
import bd2.C54451c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82969i;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import l31.C61212e;
import lu3.C34379c;
import p206nj.C11171e;
import p33.C110140b;
import p33.C110152e;
import p33.C110157f;
import p33.C110158g;
import p33.C110161i;
import p33.C11822h;
import z33.C112595h;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.voip.model.h0$$b */
public final /* synthetic */ class h0$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C106350h0 f317359d;

    /* renamed from: e */
    public final /* synthetic */ String f317360e;

    public /* synthetic */ h0$$b(C106350h0 h0Var, String str) {
        this.f317359d = h0Var;
        this.f317360e = str;
    }

    public final void run() {
        C110152e eVar;
        C106350h0 h0Var = this.f317359d;
        String str = this.f317360e;
        h0Var.getClass();
        if (!((C54451c) C86312j.m106911c(C54451c.class)).D10().equals(str) && (eVar = h0Var.f317355x) != null && str != null) {
            Context context = MMApplicationContext.getContext();
            C87412m.m108594g(context, "context");
            if (C112595h.f337168c && eVar.f329509e == null) {
                eVar.f329552A = true;
                C34379c<?> cVar = eVar.f329557z;
                if (cVar != null) {
                    cVar.cancel(true);
                }
                C119179t tVar = C119157j.f356862d;
                C110157f fVar = new C110157f(eVar);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                eVar.f329557z = jVar.mo183892w(fVar, 2500, false);
                if (eVar.f329522r != 2) {
                    C110140b.m149726c(eVar, true, false, false, 6, (Object) null);
                }
                int i = eVar.f329512h;
                long j = eVar.f329511g;
                HashMap hashMap = new HashMap();
                hashMap.put("view_id", "voip_banner_after_reject");
                hashMap.put("voip_roomid", Integer.valueOf(i));
                hashMap.put("voip_roomKey", Long.valueOf(j));
                hashMap.put("voip_banner_after_reject_from", 2);
                ((C61212e) C86312j.m106911c(C61212e.class)).mo86168ix("view_exp", hashMap, 26804);
                eVar.f329522r = 2;
                eVar.f329511g = eVar.f329511g;
                eVar.f329515k = str;
                AppForegroundDelegate.INSTANCE.mo174208a(eVar.f329525u);
                if (eVar.f329505a == null) {
                    C0002w a = C53873d2.m60389a((C53973z1) null, 1, (Object) null);
                    eVar.f329507c = C53930o0.m60554a(C53872d1.f151119c.plus(a));
                    eVar.f329505a = a;
                }
                if (eVar.f329508d == null) {
                    Object systemService = context.getSystemService("window");
                    C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                    eVar.f329508d = new C110140b.C89313b((WindowManager) systemService);
                }
                if (eVar.f329509e == null) {
                    eVar.f329524t = new GestureDetector(context, eVar.f329523s);
                    eVar.f329509e = LayoutInflater.from(context).inflate(C0966R.C0971layout.d4u, (ViewGroup) null, false);
                }
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.type = C11171e.m11046c(26) ? 2038 : 2002;
                layoutParams.flags = C82969i.CTRL_INDEX;
                layoutParams.format = 1;
                layoutParams.packageName = context.getPackageName();
                layoutParams.gravity = 49;
                layoutParams.width = -1;
                layoutParams.height = -2;
                View view = eVar.f329509e;
                if (view != null) {
                    ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.hjt);
                    imageView.post(new C110158g(eVar, imageView));
                    eVar.mo161553t();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Float.valueOf(0.0f));
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager", "showFinishCard", "(Landroid/content/Context;Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager", "showFinishCard", "(Landroid/content/Context;Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(4);
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager", "showFinishCard", "(Landroid/content/Context;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager", "showFinishCard", "(Landroid/content/Context;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    ViewManager viewManager = eVar.f329508d;
                    if (viewManager != null) {
                        viewManager.addView(view, layoutParams);
                    }
                    view.post(new C11822h(eVar, view));
                    view.setOnClickListener(new C110161i(eVar, str));
                }
            }
        }
    }
}
