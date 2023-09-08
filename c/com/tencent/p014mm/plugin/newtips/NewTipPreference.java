package com.tencent.p014mm.plugin.newtips;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.newtips.model.C115619a;
import com.tencent.p014mm.plugin.newtips.model.C115631n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import j20.C117292a;
import java.lang.ref.WeakReference;
import k20.C60958c;
import k20.C9556a;
import p626nv.C47300f;
import pj3.C47511g;
import te3.tg4;
import u00.C52399a;

/* renamed from: com.tencent.mm.plugin.newtips.NewTipPreference */
public class NewTipPreference extends Preference implements C115619a {

    /* renamed from: J */
    public Context f115222J;

    /* renamed from: K */
    public View f115223K;

    /* renamed from: L */
    public View f115224L;

    /* renamed from: M */
    public View f115225M;

    /* renamed from: N */
    public String f115226N;

    /* renamed from: P */
    public WeakReference<C47511g> f115227P;

    /* renamed from: Q */
    public boolean f115228Q;

    public NewTipPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: I */
    public final boolean mo66682I(boolean z) {
        if (this.f115224L == null) {
            return false;
        }
        Log.m105925i("MicroMsg.NewTips.NewTipPreference", "hash:%d, showRedDot() show:%s", Integer.valueOf(hashCode()), Boolean.valueOf(z));
        if (z) {
            View view = this.f115224L;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/newtips/NewTipPreference", "showRedDot", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/newtips/NewTipPreference", "showRedDot", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view3 = this.f115224L;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/newtips/NewTipPreference", "showRedDot", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/newtips/NewTipPreference", "showRedDot", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return true;
    }

    /* renamed from: e */
    public View mo64133e() {
        if (this.f115225M == null) {
            this.f115225M = new View(this.f115222J);
        }
        return this.f115225M;
    }

    /* renamed from: f */
    public boolean mo25956f(boolean z) {
        C47511g gVar;
        Log.m105925i("MicroMsg.NewTips.NewTipPreference", "hash:%d, showRedPoint() show:%s", Integer.valueOf(hashCode()), Boolean.valueOf(z));
        if (!mo66682I(z)) {
            return false;
        }
        this.f115228Q = z;
        WeakReference<C47511g> weakReference = this.f115227P;
        if (!(weakReference == null || (gVar = weakReference.get()) == null)) {
            gVar.notifyDataSetChanged();
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo25958g(boolean z, tg4 tg4) {
        return false;
    }

    public String getPath() {
        return this.f115226N;
    }

    /* renamed from: h */
    public boolean mo25960h(boolean z) {
        return false;
    }

    /* renamed from: i */
    public boolean mo25962i(boolean z, tg4 tg4) {
        return false;
    }

    /* renamed from: j */
    public boolean mo64135j(boolean z, tg4 tg4) {
        return false;
    }

    /* renamed from: k */
    public void mo64136k(C115631n nVar, boolean z) {
        ((C47300f) C86312j.m106911c(C47300f.class)).mo72342m2(this, nVar, z);
    }

    /* renamed from: l */
    public boolean mo64137l() {
        return false;
    }

    /* renamed from: m */
    public boolean mo64138m(boolean z) {
        return ((C47300f) C86312j.m106911c(C47300f.class)).mo72340I0(z, this);
    }

    /* renamed from: n */
    public boolean mo64139n(boolean z, tg4 tg4) {
        return false;
    }

    /* renamed from: o */
    public void mo64140o(boolean z, C115631n nVar) {
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        this.f115224L = view.findViewById(C0966R.C0970id.iis);
        mo66682I(this.f115228Q);
        ((C47300f) C86312j.m106911c(C47300f.class)).bt0(this.f115226N);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        View.inflate(this.f121274d, C0966R.C0971layout.bes, viewGroup2);
        this.f115223K = x;
        return x;
    }

    public NewTipPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NewTipPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f115227P = null;
        this.f115228Q = false;
        this.f115222J = context;
        this.f121271G = C0966R.C0971layout.bcy;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52399a.f146476a, i, 0);
        this.f115226N = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
        Log.m105925i("MicroMsg.NewTips.NewTipPreference", "NewTipPreference() path:%s", this.f115226N);
    }
}
