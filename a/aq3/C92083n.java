package aq3;

import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MMViewPager;
import com.tencent.p014mm.p136ui.base.WxImageView;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import nj3.C11184p0;
import nj3.C76879j;
import p157gk.C59492k;
import p248ug.C102029k0;
import sk2.C101643c;
import sk2.C101644d;
import sk2.C101645e;
import tk2.C101903a;

/* renamed from: aq3.n */
public final class C92083n implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C92075j f263635d;

    public C92083n(C92075j jVar) {
        this.f263635d = jVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C54295a0 a0Var = C54295a0.CUR_STATE_RUNNING;
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            AppCompatActivity activity = this.f263635d.getActivity();
            long j = this.f263635d.f263612d;
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C102029k0 k0Var = C59492k.f169999a;
            if (k0Var != null) {
                k0Var.mo137225l(activity, j);
            }
        } else if (itemId == 1) {
            AppCompatActivity activity2 = this.f263635d.getActivity();
            long j2 = this.f263635d.f263612d;
            C87412m.m108594g(activity2, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C102029k0 k0Var2 = C59492k.f169999a;
            if (k0Var2 != null) {
                k0Var2.mo137232s(activity2, j2);
            }
        } else if (itemId == 2) {
            AppCompatActivity activity3 = this.f263635d.getActivity();
            long j3 = this.f263635d.f263612d;
            C87412m.m108594g(activity3, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C102029k0 k0Var3 = C59492k.f169999a;
            if (k0Var3 != null) {
                k0Var3.mo137230q(activity3, j3);
            }
        } else if (itemId == 5) {
            AppCompatActivity activity4 = this.f263635d.getActivity();
            long j4 = this.f263635d.f263612d;
            C87412m.m108594g(activity4, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C102029k0 k0Var4 = C59492k.f169999a;
            if (k0Var4 != null) {
                k0Var4.mo137216d(activity4, j4);
            }
        } else if (itemId != 6) {
            String str = "";
            int i2 = 4;
            if (itemId != 7) {
                if (itemId == 9) {
                    C92075j jVar = this.f263635d;
                    long j5 = jVar.f263612d;
                    AppCompatActivity activity5 = jVar.getActivity();
                    C87412m.m108594g(activity5, "context");
                    C102029k0 k0Var5 = C59492k.f169999a;
                    if (k0Var5 != null) {
                        k0Var5.mo137224k(j5, 1, activity5);
                    }
                } else if (itemId == 10) {
                    C92075j jVar2 = this.f263635d;
                    Class cls = C92068g.class;
                    long j6 = jVar2.f263612d;
                    C102029k0 k0Var6 = C59492k.f169999a;
                    boolean j7 = k0Var6 != null ? k0Var6.mo137223j(j6) : false;
                    if (!j7) {
                        i2 = 3;
                    }
                    if (jVar2.f263620o == null) {
                        jVar2.f263620o = ((C101643c) C86312j.m106911c(C101643c.class)).z80(jVar2.getActivity(), i2);
                        MMViewPager mMViewPager = ((C92068g) C39818r.f106831a.mo62444c(jVar2.getActivity()).mo75002a(cls)).f263593e;
                        if (mMViewPager != null) {
                            C101903a aVar = jVar2.f263620o;
                            C87412m.m108591d(aVar);
                            aVar.mo33386c(mMViewPager);
                        }
                    }
                    C101645e eVar = new C101645e();
                    eVar.f297534c = jVar2.f263612d;
                    eVar.f297536e = i2;
                    eVar.f297532a = System.currentTimeMillis();
                    eVar.f297533b = 3;
                    eVar.f297541j = false;
                    eVar.f297542k = true;
                    eVar.f297543l = 201;
                    C101645e.C101646a aVar2 = eVar.f297544m;
                    long j8 = jVar2.f263612d;
                    C102029k0 k0Var7 = C59492k.f169999a;
                    String i3 = k0Var7 != null ? k0Var7.mo137222i(j8, j7) : null;
                    if (i3 != null) {
                        str = i3;
                    }
                    aVar2.f297546a = str;
                    WxImageView c3 = ((C92068g) C39818r.f106831a.mo62444c(jVar2.getActivity()).mo75002a(cls)).mo126057c3();
                    if (c3 != null) {
                        C101903a aVar3 = jVar2.f263620o;
                        C87412m.m108591d(aVar3);
                        aVar3.mo33390g(c3);
                    }
                    C101644d dVar = new C101644d();
                    dVar.f297531b = true;
                    jVar2.mo126066i3();
                    C101903a aVar4 = jVar2.f263620o;
                    C87412m.m108591d(aVar4);
                    jVar2.f263621p = aVar4.mo33385b(eVar, dVar, jVar2.f263623r);
                    jVar2.f263622q = a0Var;
                }
            } else if (WeChatBrands.Business.Entries.ContextTranslate.checkAvailable(this.f263635d.getActivity())) {
                C92075j jVar3 = this.f263635d;
                jVar3.getClass();
                if (C86709a0.m107524d().mo123467m() == 6 || C86709a0.m107524d().mo123467m() == 4) {
                    jVar3.f263619n = a0Var;
                    jVar3.mo126066i3();
                } else {
                    C76879j.m92748s(jVar3.getActivity(), jVar3.getString(C0966R.string.f360087a11), str);
                }
                AppCompatActivity activity6 = this.f263635d.getActivity();
                long j9 = this.f263635d.f263612d;
                C87412m.m108594g(activity6, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                C102029k0 k0Var8 = C59492k.f169999a;
                if (k0Var8 != null) {
                    k0Var8.mo137214b(activity6, j9);
                }
            }
        } else {
            AppCompatActivity activity7 = this.f263635d.getActivity();
            long j15 = this.f263635d.f263612d;
            C87412m.m108594g(activity7, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C102029k0 k0Var9 = C59492k.f169999a;
            if (k0Var9 != null) {
                k0Var9.mo137215c(activity7, j15);
            }
        }
    }
}
