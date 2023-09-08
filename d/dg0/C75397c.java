package dg0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.account.p024ui.PreCheckAffiliateAccountUI;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import hg0.C76185s;
import hg0.C76187y0;
import hg0.C76189z0;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import mg0.C76754b;
import mg0.C76755c;
import sf0.C13658a;
import sf0.C13665i0;
import te3.C49174do2;

@C86522b
/* renamed from: dg0.c */
public class C75397c extends C86301e implements C76754b {
    /* renamed from: BP */
    public MStorage mo105736BP() {
        C86709a0.m107523b().mo121108c();
        if (C75398e.wx0().f221658g == null) {
            C75398e.wx0().f221658g = new C76189z0(C86709a0.m107535s().f251811i);
        }
        return C75398e.wx0().f221658g;
    }

    /* renamed from: Pt */
    public MStorage mo105737Pt() {
        C86709a0.m107523b().mo121108c();
        if (C75398e.wx0().f221657f == null) {
            C75398e.wx0().f221657f = new C76185s(C86709a0.m107535s().f251811i);
        }
        return C75398e.wx0().f221657f;
    }

    public MStorageEx R50() {
        return C75398e.vx0();
    }

    /* renamed from: Rh */
    public void mo105739Rh() {
    }

    public void Sw0(LinkedList linkedList) {
        C86709a0.m107523b().mo121108c();
        C75398e.wx0().f221663o = linkedList;
    }

    /* renamed from: VY */
    public void mo105741VY() {
        C86709a0.m107523b().mo121108c();
        C75398e.wx0().f221663o = null;
    }

    /* renamed from: Vj */
    public LinkedList<C49174do2> mo105742Vj() {
        C86709a0.m107523b().mo121108c();
        return C75398e.wx0().f221663o;
    }

    public boolean Yn0(C76755c cVar) {
        return C13658a.m12959a(cVar);
    }

    /* renamed from: cx */
    public void mo105744cx(boolean z, boolean z2) {
        C13665i0.m12974g(z, z2);
    }

    /* renamed from: dR */
    public void mo105745dR(Activity activity, Runnable runnable, boolean z, int i) {
        C13665i0.m12969b(activity, runnable, z, i);
    }

    /* renamed from: fv */
    public MStorage mo105746fv() {
        return C75398e.yx0();
    }

    /* renamed from: jG */
    public void mo105747jG() {
        MMApplicationContext.getContext();
        C13658a.m12959a(C13658a.f38696b);
    }

    /* renamed from: ml */
    public void mo105748ml(Activity activity, int i) {
        Intent intent = new Intent(activity, PreCheckAffiliateAccountUI.class);
        intent.putExtra("RegScene", 2);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/account/PluginAccount", "startAffiliateAccount", "(Landroid/app/Activity;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    /* renamed from: ob */
    public MStorageEx mo105749ob() {
        return C75398e.Ax0();
    }

    /* renamed from: tV */
    public MStorage mo105750tV() {
        return C75398e.zx0();
    }

    /* renamed from: xv */
    public void mo105751xv(Context context) {
    }

    /* renamed from: yf */
    public MStorage mo105752yf() {
        return C75398e.xx0();
    }

    /* renamed from: zo */
    public MAutoStorage mo105753zo() {
        C86709a0.m107523b().mo121108c();
        if (C75398e.wx0().f221662n == null) {
            C75398e.wx0().f221662n = new C76187y0(C86709a0.m107535s().f251811i);
        }
        return C75398e.wx0().f221662n;
    }
}
