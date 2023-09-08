package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.VideoFullScreenActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p749xh.C102646h;
import qs2.C101255a0;
import qs2.C101271i0;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z */
public class C95295z {

    /* renamed from: d */
    public Context f276579d;

    /* renamed from: e */
    public C101255a0 f276580e;

    /* renamed from: f */
    public int f276581f;

    /* renamed from: g */
    public int f276582g = 0;

    /* renamed from: h */
    public long f276583h = 0;

    /* renamed from: i */
    public long f276584i = 0;

    /* renamed from: j */
    public boolean f276585j = false;

    /* renamed from: n */
    public View f276586n = null;

    /* renamed from: o */
    public ViewGroup f276587o;

    /* renamed from: p */
    public int f276588p;

    /* renamed from: q */
    public int f276589q;

    /* renamed from: r */
    public int f276590r = 0;

    public C95295z(Context context, C101255a0 a0Var, ViewGroup viewGroup) {
        this.f276579d = context;
        this.f276580e = a0Var;
        this.f276587o = viewGroup;
        int[] b = C95198o2.m121130b(context);
        this.f276588p = b[0];
        this.f276589q = b[1];
        if (C85875k4.m106205t(context, false)) {
            int o = C85875k4.m106198o(context);
            this.f276589q -= o;
            this.f276590r = o;
        }
    }

    /* renamed from: A */
    public void mo130145A() {
        SnsMethodCalculate.markStartTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
    }

    /* renamed from: B */
    public void mo124360B() {
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        if (this.f276585j) {
            SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
            return;
        }
        this.f276585j = true;
        this.f276583h = System.currentTimeMillis();
        this.f276582g++;
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
    }

    /* renamed from: C */
    public void mo67235C() {
        SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        mo124361D();
        SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
    }

    /* renamed from: D */
    public void mo124361D() {
        SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        if (!this.f276585j) {
            SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
            return;
        }
        this.f276585j = false;
        if (this.f276583h > 0) {
            this.f276584i += System.currentTimeMillis() - this.f276583h;
        }
        this.f276583h = 0;
        SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
    }

    /* renamed from: d */
    public void mo124363d() {
        SnsMethodCalculate.markStartTimeMs("applyLayoutParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        View view = this.f276586n;
        if (view != null) {
            if (this.f276580e != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    C101255a0 a0Var = this.f276580e;
                    float f = a0Var.f296501g;
                    if (f != 2.14748365E9f) {
                        layoutParams.width = (int) f;
                    }
                    float f2 = a0Var.f296502h;
                    if (f2 != 2.14748365E9f) {
                        layoutParams.height = (int) f2;
                    }
                    if (layoutParams instanceof LinearLayout.LayoutParams) {
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        int k = mo131852k();
                        if (k != 0) {
                            layoutParams2.gravity = k;
                        }
                    } else if (layoutParams instanceof FrameLayout.LayoutParams) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams;
                        int k2 = mo131852k();
                        if (k2 != 0) {
                            layoutParams3.gravity = k2;
                        }
                    }
                    this.f276586n.setLayoutParams(layoutParams);
                } else {
                    Log.m105924i("MicroMsg.Sns.AdLandingPageBaseComponent", this + " has no layoutParams in container " + this.f276587o);
                }
            }
            SnsMethodCalculate.markEndTimeMs("applyLayoutParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("set field contentView first");
        SnsMethodCalculate.markEndTimeMs("applyLayoutParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        throw illegalStateException;
    }

    /* renamed from: e */
    public void mo67238e() {
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
    }

    /* renamed from: f */
    public View mo67239f() {
        SnsMethodCalculate.markStartTimeMs("customLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        SnsMethodCalculate.markEndTimeMs("customLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        return null;
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        Log.m105928w("MicroMsg.Sns.AdLandingPageBaseComponent", "for component reuse, subclass must implement this method");
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
    }

    /* renamed from: h */
    public C101255a0 mo131850h() {
        SnsMethodCalculate.markStartTimeMs("getComponetInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        C101255a0 a0Var = this.f276580e;
        SnsMethodCalculate.markEndTimeMs("getComponetInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        return a0Var;
    }

    /* renamed from: i */
    public View mo131609i() {
        SnsMethodCalculate.markStartTimeMs("getContentView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        View view = this.f276586n;
        SnsMethodCalculate.markEndTimeMs("getContentView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        return view;
    }

    /* renamed from: j */
    public int mo131851j() {
        SnsMethodCalculate.markStartTimeMs("getExposureCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        int i = this.f276582g;
        SnsMethodCalculate.markEndTimeMs("getExposureCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        return i;
    }

    /* renamed from: k */
    public int mo131852k() {
        SnsMethodCalculate.markStartTimeMs("getGravity", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        C101255a0 a0Var = this.f276580e;
        int i = a0Var.f296509o;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 80 : 16 : 48;
        int i3 = a0Var.f296510p;
        if (i3 == 0) {
            i2 |= 3;
        } else if (i3 == 1) {
            i2 |= 1;
        } else if (i3 == 2) {
            i2 |= 5;
        }
        SnsMethodCalculate.markEndTimeMs("getGravity", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        return i2;
    }

    /* renamed from: l */
    public int mo131853l() {
        SnsMethodCalculate.markStartTimeMs("getInScreenHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        int i = this.f276589q + this.f276590r;
        View p = mo131855p();
        int[] iArr = new int[2];
        p.getLocationOnScreen(iArr);
        int i2 = iArr[1];
        int height = p.getHeight() + i2;
        Log.m105919d("MicroMsg.Sns.AdLandingPageBaseComponent", "comp %s , top %d,bottom %d ", this, Integer.valueOf(i2), Integer.valueOf(height));
        if (i2 >= 0 && height <= i) {
            i = p.getHeight();
        } else if (i2 < 0 && height > 0 && height <= i) {
            i = height;
        } else if (i2 >= 0 || height <= i) {
            i = (i2 >= i || height <= i) ? 0 : i - i2;
        }
        SnsMethodCalculate.markEndTimeMs("getInScreenHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        return i;
    }

    /* renamed from: m */
    public C101271i0 mo131854m() {
        SnsMethodCalculate.markStartTimeMs("getLandingPageData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        Context context = this.f276579d;
        if (context instanceof SnsAdNativeLandingPagesUI) {
            C101271i0 n8 = ((SnsAdNativeLandingPagesUI) context).mo132541n8();
            SnsMethodCalculate.markEndTimeMs("getLandingPageData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
            return n8;
        } else if (context instanceof VideoFullScreenActivity) {
            C101271i0 T0 = ((VideoFullScreenActivity) context).mo133148T0();
            SnsMethodCalculate.markEndTimeMs("getLandingPageData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
            return T0;
        } else {
            C101271i0 i0Var = new C101271i0();
            SnsMethodCalculate.markEndTimeMs("getLandingPageData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
            return i0Var;
        }
    }

    /* renamed from: n */
    public int mo118819n() {
        SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        return Integer.MAX_VALUE;
    }

    /* renamed from: o */
    public long mo131555o() {
        SnsMethodCalculate.markStartTimeMs("getStayTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        long j = this.f276584i;
        SnsMethodCalculate.markEndTimeMs("getStayTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        return j;
    }

    /* renamed from: p */
    public final View mo131855p() {
        SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        View view = this.f276586n;
        if (view != null) {
            SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
            return view;
        }
        SnsMethodCalculate.markStartTimeMs("inflateLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        if (this.f276586n != null) {
            SnsMethodCalculate.markEndTimeMs("inflateLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        } else {
            int n = mo118819n();
            if (n != Integer.MAX_VALUE) {
                this.f276586n = ((LayoutInflater) this.f276579d.getSystemService("layout_inflater")).inflate(n, this.f276587o, false);
            } else {
                View f = mo67239f();
                this.f276586n = f;
                if (f != null && f.getLayoutParams() == null) {
                    this.f276587o.addView(this.f276586n);
                    ViewGroup.LayoutParams layoutParams = this.f276586n.getLayoutParams();
                    this.f276587o.removeView(this.f276586n);
                    this.f276586n.setLayoutParams(layoutParams);
                }
            }
            if (this.f276586n != null) {
                SnsMethodCalculate.markEndTimeMs("inflateLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("implement getLayout() or customLayout() to get a valid root view");
                SnsMethodCalculate.markEndTimeMs("inflateLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
                throw illegalStateException;
            }
        }
        mo67238e();
        mo67240g();
        mo118814y();
        mo124363d();
        View view2 = this.f276586n;
        SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        return view2;
    }

    /* renamed from: q */
    public <T> T mo131856q() {
        SnsMethodCalculate.markStartTimeMs("getWrapInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        try {
            T t = this.f276580e;
            SnsMethodCalculate.markEndTimeMs("getWrapInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
            return t;
        } catch (Exception unused) {
            SnsMethodCalculate.markEndTimeMs("getWrapInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
            return null;
        }
    }

    /* renamed from: r */
    public String mo131857r() {
        SnsMethodCalculate.markStartTimeMs("getcId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        String str = this.f276580e.f296495a;
        SnsMethodCalculate.markEndTimeMs("getcId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        return str;
    }

    /* renamed from: s */
    public boolean mo131640s() {
        SnsMethodCalculate.markStartTimeMs("isExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        if (mo131853l() >= Math.min(mo131855p().getHeight() >>> 1, this.f276589q >>> 1)) {
            SnsMethodCalculate.markEndTimeMs("isExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("isExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        return false;
    }

    /* renamed from: t */
    public void mo130247t() {
        SnsMethodCalculate.markStartTimeMs("restoreToOriginState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        SnsMethodCalculate.markEndTimeMs("restoreToOriginState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
    }

    /* renamed from: u */
    public boolean mo124366u(JSONArray jSONArray) {
        SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        return false;
    }

    /* renamed from: v */
    public boolean mo118822v(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        if (mo131851j() == 0) {
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
            return false;
        } else if (this.f276580e.f296512r) {
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
            return false;
        } else {
            try {
                jSONObject.put("cid", mo131857r());
                jSONObject.put(C102646h.COL_EXPOSURECOUNT, mo131851j());
                jSONObject.put("stayTime", mo131555o());
                SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
                return true;
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.Sns.AdLandingPageBaseComponent", e, "", new Object[0]);
                SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
                return false;
            }
        }
    }

    /* renamed from: w */
    public void mo131858w(Map<String, Object> map) {
        SnsMethodCalculate.markStartTimeMs("setOriginState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        SnsMethodCalculate.markEndTimeMs("setOriginState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
    }

    /* renamed from: y */
    public void mo118814y() {
        SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
    }

    /* renamed from: z */
    public void mo130213z(C101255a0 a0Var) {
        SnsMethodCalculate.markStartTimeMs("updateDataSet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        C101255a0 h = mo131850h();
        if (h == a0Var) {
            SnsMethodCalculate.markEndTimeMs("updateDataSet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        } else if (h == null || !h.equals(a0Var)) {
            SnsMethodCalculate.markStartTimeMs("setmAdLandingPageComponetInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
            this.f276580e = a0Var;
            SnsMethodCalculate.markEndTimeMs("setmAdLandingPageComponetInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
            mo67240g();
            mo124363d();
            SnsMethodCalculate.markEndTimeMs("updateDataSet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        } else {
            SnsMethodCalculate.markEndTimeMs("updateDataSet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        }
    }
}
