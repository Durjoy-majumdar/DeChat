package th0;

import android.app.Activity;
import com.tencent.p014mm.modelcdntran.C55377a0;
import com.tencent.p014mm.modelcdntran.C55385t;
import com.tencent.p014mm.modelcdntran.C92795s;
import com.tencent.p014mm.modelcdntran.C92798v;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import p159gw.C98250h;
import p434ig.C98672d;

/* renamed from: th0.j */
public final class C64932j implements C92795s {

    /* renamed from: d */
    public final /* synthetic */ C98672d f186970d;

    /* renamed from: e */
    public final /* synthetic */ String f186971e;

    /* renamed from: f */
    public final /* synthetic */ WeakReference<C55377a0> f186972f;

    /* renamed from: g */
    public final /* synthetic */ Activity f186973g;

    public C64932j(C98672d dVar, String str, WeakReference<C55377a0> weakReference, Activity activity) {
        this.f186970d = dVar;
        this.f186971e = str;
        this.f186972f = weakReference;
        this.f186973g = activity;
    }

    /* renamed from: o2 */
    public void mo76200o2(int i, C55385t tVar) {
        C55377a0 a0Var;
        C55377a0 a0Var2;
        Class cls = C98250h.class;
        C87412m.m108594g(tVar, "info");
        if (C87412m.m108589b(tVar.f157721c, this.f186970d.mo55264K())) {
            boolean z = false;
            if (i == 1) {
                if (this.f186970d.mo55274P() == 4) {
                    String str = tVar.f157726h;
                    if (str == null || str.length() == 0) {
                        z = true;
                    }
                    String str2 = z ? this.f186971e : tVar.f157726h;
                    if (str2 != null) {
                        Activity activity = this.f186973g;
                        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                        ((C98250h) C86312j.m106911c(cls)).mo137342Lm(activity, str2, new C13924g(str2, activity));
                    }
                } else {
                    String str3 = tVar.f157726h;
                    if (str3 == null || str3.length() == 0) {
                        z = true;
                    }
                    String str4 = z ? this.f186971e : tVar.f157726h;
                    if (str4 != null) {
                        Activity activity2 = this.f186973g;
                        C87412m.m108594g(activity2, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                        ((C98250h) C86312j.m106911c(cls)).mo137346Zv(activity2, str4, new C64929f(activity2));
                    }
                }
                WeakReference<C55377a0> weakReference = this.f186972f;
                if (weakReference != null && (a0Var = weakReference.get()) != null) {
                    a0Var.mo76632a((C92798v) null);
                }
            } else if (i == 2) {
                if (this.f186970d.mo55274P() == 4) {
                    String str5 = tVar.f157726h;
                    if (str5 == null || str5.length() == 0) {
                        z = true;
                    }
                    String str6 = z ? this.f186971e : tVar.f157726h;
                    if (str6 != null) {
                        Activity activity3 = this.f186973g;
                        C87412m.m108594g(activity3, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                        ((C98250h) C86312j.m106911c(cls)).mo137342Lm(activity3, str6, new C13924g(str6, activity3));
                    }
                } else {
                    String str7 = tVar.f157726h;
                    if (str7 == null || str7.length() == 0) {
                        z = true;
                    }
                    String str8 = z ? this.f186971e : tVar.f157726h;
                    if (str8 != null) {
                        Activity activity4 = this.f186973g;
                        C87412m.m108594g(activity4, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                        ((C98250h) C86312j.m106911c(cls)).mo137346Zv(activity4, str8, new C64929f(activity4));
                    }
                }
                WeakReference<C55377a0> weakReference2 = this.f186972f;
                if (weakReference2 != null && (a0Var2 = weakReference2.get()) != null) {
                    a0Var2.mo76632a((C92798v) null);
                }
            }
        }
    }
}
