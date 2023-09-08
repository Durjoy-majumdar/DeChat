package com.tencent.p014mm.sensitive.p135ui;

import android.app.Activity;
import bh3.C113177k;
import com.tencent.p014mm.p136ui.MMActivity;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import hh3.C117098f;
import o40.C61926c;
import rx3.C13598b0;
import sx3.C110823p;

/* renamed from: com.tencent.mm.sensitive.ui.b */
public final class C116015b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f347988d;

    /* renamed from: e */
    public final /* synthetic */ C113177k.C113179b f347989e;

    /* renamed from: f */
    public final /* synthetic */ C113177k.C113178a f347990f;

    /* renamed from: g */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f347991g;

    /* renamed from: h */
    public final /* synthetic */ Activity f347992h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116015b(boolean z, C113177k.C113179b bVar, C113177k.C113178a aVar, C32226l<? super Boolean, C13598b0> lVar, Activity activity) {
        super(0);
        this.f347988d = z;
        this.f347989e = bVar;
        this.f347990f = aVar;
        this.f347991g = lVar;
        this.f347992h = activity;
    }

    public Object invoke() {
        C13598b0 b0Var;
        if (this.f347988d) {
            C117098f.f350877a.mo181044a(202, Long.valueOf((long) this.f347989e.f338673e), Long.valueOf((long) this.f347990f.f338662e), Boolean.TRUE);
        }
        ((C113177k) C86312j.m106911c(C113177k.class)).mo165721yX(this.f347989e.f338672d, this.f347990f.f338661d, this.f347988d);
        C32226l<Boolean, C13598b0> lVar = this.f347991g;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(this.f347988d));
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            PermissionSwitchCheckUtil permissionSwitchCheckUtil = PermissionSwitchCheckUtil.f347926a;
            boolean z = this.f347988d;
            Activity activity = this.f347992h;
            C113177k.C113179b bVar = this.f347989e;
            if (z) {
                if (activity instanceof MMActivity) {
                    ((MMActivity) activity).onBusinessPermissionGranted(bVar.f338672d);
                } else if (activity instanceof C113177k.C113180d) {
                    ((C113177k.C113180d) activity).onBusinessPermissionGranted(bVar.f338672d);
                } else {
                    permissionSwitchCheckUtil.getClass();
                    if (!C110823p.m151009y(PermissionSwitchCheckUtil.f347929d, activity.getClass().getSimpleName())) {
                        activity.finish();
                        activity.overridePendingTransition(0, 0);
                        C61926c.m72666K(50, new C6700a(activity));
                    }
                }
            } else if (activity instanceof MMActivity) {
                ((MMActivity) activity).onBusinessPermissionDenied(bVar.f338672d);
            } else if (activity instanceof C113177k.C113180d) {
                ((C113177k.C113180d) activity).onBusinessPermissionDenied(bVar.f338672d);
            } else {
                permissionSwitchCheckUtil.getClass();
                String[] strArr = PermissionSwitchCheckUtil.f347929d;
                if (!C110823p.m151009y(strArr, activity.getClass().getSimpleName())) {
                    activity.finish();
                } else if (!C110823p.m151009y(strArr, activity.getClass().getSimpleName()) && (activity instanceof MMActivity)) {
                    ((MMActivity) activity).onBusinessPermissionDenied(bVar.f338672d);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
