package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import bt0.C79815i;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import js0.C88020k;
import kg3.C76577a;
import p1057w2.C90885a;
import p849e3.C107168a0;
import p849e3.C107207u;
import rx3.C13598b0;
import wi0.C66117m;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.x0 */
public class C84706x0 extends C1986e4 implements C84565m4 {

    /* renamed from: A */
    public WxaAttributes.WxaVersionInfo f247092A;

    /* renamed from: x */
    public AppBrandRuntimeWC f247093x;

    /* renamed from: y */
    public C79815i f247094y;

    /* renamed from: z */
    public C32224a<C13598b0> f247095z;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.x0$a */
    public class C84707a implements View.OnClickListener {
        public C84707a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/AppBrandPluginLoadingSplash$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C84706x0 x0Var = C84706x0.this;
            AppBrandRuntimeWC appBrandRuntimeWC = x0Var.f247093x;
            if (appBrandRuntimeWC != null) {
                C83231l.m102146g(appBrandRuntimeWC.f238147j, C83231l.C83235e.CLOSE);
                C84706x0.this.f247093x.mo113006E();
            } else {
                C32224a<C13598b0> aVar = x0Var.f247095z;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandPluginLoadingSplash$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.x0$b */
    public class C84708b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f247097d;

        public C84708b(C32224a aVar) {
            this.f247097d = aVar;
        }

        public void run() {
            C84706x0.this.setVisibility(8);
            if (C84706x0.this.getParent() != null) {
                ((ViewGroup) C84706x0.this.getParent()).removeView(C84706x0.this);
            }
            C84682u4 u4Var = (C84682u4) C84706x0.this.f247094y;
            u4Var.f247048j.mo148694d();
            u4Var.removeAllViews();
            u4Var.f247042d = null;
            C32224a aVar = this.f247097d;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public C84706x0(Context context, AppBrandRuntimeWC appBrandRuntimeWC, WxaAttributes.WxaVersionInfo wxaVersionInfo) {
        super(context);
        this.f247093x = appBrandRuntimeWC;
        this.f247092A = wxaVersionInfo;
        setBackgroundColor(getResources().getColor(C0966R.color.f2929c));
        C84682u4 u4Var = new C84682u4(context);
        this.f247094y = u4Var;
        u4Var.setBackgroundColor(C76577a.m92153d(context, C0966R.color.ahf));
        addView(this.f247094y.getActionView());
        mo117206W();
    }

    /* renamed from: D */
    public void mo1911D(C32224a<C13598b0> aVar) {
        post(new C84708b(aVar));
    }

    /* renamed from: F */
    public void mo117194F(C32224a<C13598b0> aVar) {
        this.f247095z = aVar;
    }

    /* renamed from: S */
    public String mo1898S() {
        return "AppBrandPluginLoadingSplash:" + this.f247093x.f238147j;
    }

    /* renamed from: U */
    public void mo117433U(String str, int i, String str2, int i2) {
        this.f247094y.setMainTitle(str);
        this.f247094y.setForegroundStyle(str2);
        this.f247094y.setLoadingIconVisibility(true);
        this.f247094y.setForegroundColor(i2);
        mo122168R(i, "black".equals(str2), true);
    }

    /* renamed from: W */
    public void mo117206W() {
        C66117m mVar;
        this.f247094y.mo109614d(false);
        C84707a aVar = new C84707a();
        this.f247094y.setCloseButtonClickListener(aVar);
        this.f247094y.setBackButtonClickListener(aVar);
        int color = getContext().getResources().getColor(C0966R.color.f2929c);
        int color2 = getContext().getResources().getColor(C0966R.color.a7f);
        AppBrandRuntimeWC appBrandRuntimeWC = this.f247093x;
        AppBrandInitConfigWC M1 = appBrandRuntimeWC == null ? null : appBrandRuntimeWC.mo113210l1();
        String str = "black";
        String str2 = "white";
        if (M1 == null || !M1.f234815R0.mo76931c() || !(M1.f234815R0.mo76930b() == (mVar = C66117m.FORCE_DARK) || M1.f234815R0.mo76930b() == C66117m.FORCE_LIGHT)) {
            if (this.f247092A != null) {
                if (C85875k4.m106211z()) {
                    if (!Util.isNullOrNil(this.f247092A.f239470y)) {
                        try {
                            color = C88020k.m109562m(this.f247092A.f239470y);
                        } catch (Exception unused) {
                            color = getContext().getResources().getColor(C0966R.color.f2929c);
                        }
                    }
                    if (!Util.isNullOrNil(this.f247092A.f239469x)) {
                        try {
                            color2 = C88020k.m109562m(this.f247092A.f239469x);
                        } catch (Exception unused2) {
                            color2 = getContext().getResources().getColor(C0966R.color.a7f);
                        }
                    }
                    str = str2;
                } else {
                    if (!Util.isNullOrNil(this.f247092A.f239468w)) {
                        try {
                            color = C88020k.m109562m(this.f247092A.f239468w);
                        } catch (Exception unused3) {
                            color = getContext().getResources().getColor(C0966R.color.f2929c);
                        }
                    }
                    if (!Util.isNullOrNil(this.f247092A.f239467v)) {
                        try {
                            color2 = C88020k.m109562m(this.f247092A.f239467v);
                        } catch (Exception unused4) {
                            color2 = getContext().getResources().getColor(C0966R.color.a7f);
                        }
                    }
                }
                this.f247094y.setLoadingIconVisibility(true);
            }
            mo117433U(getContext().getString(C0966R.string.f7587kf), color, str2, color2);
            mo1913r(color);
        }
        if (M1.f234815R0.mo76930b() == mVar) {
            color = Color.parseColor("#191919");
            color2 = Color.parseColor("#CCFFFFFF");
        } else {
            color = getContext().getResources().getColor(C0966R.color.f2975b6);
            color2 = getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9);
            str = str2;
        }
        this.f247094y.setLoadingIconVisibility(false);
        str2 = str;
        mo117433U(getContext().getString(C0966R.string.f7587kf), color, str2, color2);
        mo1913r(color);
    }

    public View getView() {
        return this;
    }

    public final boolean post(Runnable runnable) {
        boolean z = false;
        if (runnable == null) {
            return false;
        }
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (!C107207u.C107211e.m145207b(this)) {
            AppBrandRuntimeWC appBrandRuntimeWC = this.f247093x;
            if (appBrandRuntimeWC != null && appBrandRuntimeWC.mo121251g1()) {
                z = true;
            }
            if (z) {
                MMHandlerThread.postToMainThread(runnable);
                return true;
            }
        }
        return super.post(runnable);
    }

    public final boolean postDelayed(Runnable runnable, long j) {
        boolean z = false;
        if (runnable == null) {
            return false;
        }
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (!C107207u.C107211e.m145207b(this)) {
            AppBrandRuntimeWC appBrandRuntimeWC = this.f247093x;
            if (appBrandRuntimeWC != null && appBrandRuntimeWC.mo121251g1()) {
                z = true;
            }
            if (z) {
                MMHandlerThread.postToMainThreadDelayed(runnable, j);
                return true;
            }
        }
        return super.postDelayed(runnable, j);
    }

    /* renamed from: q */
    public void mo1912q(String str, String str2) {
        this.f247094y.setMainTitle(getContext().getString(C0966R.string.f7587kf));
    }

    /* renamed from: r */
    public void mo1913r(int i) {
        setBackgroundColor(C90885a.m114003h(i, getContext().getResources().getColor(C0966R.color.f2929c)));
    }

    public void setBackButtonVisibility(boolean z) {
        this.f247094y.setNavHidden(!z);
    }

    public void setLoadingIconVisibility(boolean z) {
        this.f247094y.setLoadingIconVisibility(z);
    }

    public void setProgress(int i) {
    }
}
