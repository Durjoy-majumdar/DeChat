package ro2;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.p844mb.AdLandingMBSclView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95295z;
import com.tencent.p014mm.sdk.platformtools.Log;
import fp2.C87067c;
import fp2.C87070f;
import gy3.C87412m;
import i70.C87667c;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p749xh.C102646h;
import rq2.C101425k;
import rx3.C13598b0;
import so2.C90269o;
import z04.C112551y;

/* renamed from: ro2.a */
public class C90076a extends C95295z implements View.OnAttachStateChangeListener {

    /* renamed from: s */
    public AdLandingMBSclView f258737s;

    /* renamed from: t */
    public final C90269o f258738t;

    /* renamed from: u */
    public C87667c<?, ?>.a f258739u;

    /* renamed from: v */
    public C87067c f258740v;

    /* renamed from: w */
    public boolean f258741w = true;

    public C90076a(Context context, C90269o oVar, ViewGroup viewGroup) {
        super(context, oVar, viewGroup);
        this.f258738t = oVar;
    }

    /* renamed from: B */
    public void mo124360B() {
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        super.mo124360B();
        Log.m105924i("AdLandingMBComponent", "viewWillAppear is called");
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
    }

    /* renamed from: D */
    public void mo124361D() {
        SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        super.mo124361D();
        SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
    }

    /* renamed from: E */
    public final void mo124362E() {
        SnsMethodCalculate.markStartTimeMs("bindMagicSclView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        C90269o oVar = this.f258738t;
        if (oVar == null || TextUtils.isEmpty(oVar.f259117z) || TextUtils.isEmpty(oVar.f259115A)) {
            Log.m105920e("AdLandingMBComponent", "the magic node info is null, or necessity is empty");
            SnsMethodCalculate.markEndTimeMs("bindMagicSclView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
            return;
        }
        if (!(this.f258737s == null || this.f258739u == null || !this.f258741w || this.f258740v == null)) {
            Log.m105924i("AdLandingMBComponent", "rebind scl view again");
            boolean z = false;
            this.f258741w = false;
            this.f258737s.mo76544a(this.f258739u);
            C87067c cVar = this.f258740v;
            String str = oVar.f259115A;
            String str2 = oVar.f259117z;
            cVar.getClass();
            SnsMethodCalculate.markStartTimeMs("sendDataChangeEvent", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
            C87412m.m108594g(str, "data");
            C87667c<?, ?>.a aVar = cVar.f252653q;
            C13598b0 b0Var = null;
            if (aVar != null) {
                if (str2 == null || C112551y.m153811k(str2)) {
                    z = true;
                }
                if (z) {
                    aVar.mo122099a(str, (String) null);
                } else {
                    C87667c.C87668a.m109055b(aVar, str, str2, (String) null, 4, (Object) null);
                }
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105928w("SnsAdMB", "the frameSetRoot is null, please create frame-set-root and bound it by one frame-set");
            }
            SnsMethodCalculate.markEndTimeMs("sendDataChangeEvent", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        }
        SnsMethodCalculate.markEndTimeMs("bindMagicSclView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
    }

    /* renamed from: d */
    public void mo124363d() {
        SnsMethodCalculate.markStartTimeMs("applyLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        C90269o oVar = this.f258738t;
        if (oVar != null && oVar.f259116B == 1) {
            oVar.f296501g = (float) this.f276588p;
            oVar.f296502h = (float) this.f276589q;
        }
        super.mo124363d();
        SnsMethodCalculate.markEndTimeMs("applyLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0186  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo67238e() {
        /*
            r19 = this;
            r1 = r19
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData"
            java.lang.String r2 = "createView"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            android.content.Context r4 = r1.f276579d
            boolean r4 = r4 instanceof android.app.Activity
            java.lang.String r5 = "AdLandingMBComponent"
            if (r4 != 0) goto L_0x001d
            java.lang.String r0 = "the context is not activity, is the component right?"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x001d:
            so2.o r4 = r1.f258738t
            android.view.View r6 = r1.f276586n
            if (r6 == 0) goto L_0x01e1
            if (r4 == 0) goto L_0x01e1
            java.lang.String r6 = r4.f259117z
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x002f
            goto L_0x01e1
        L_0x002f:
            android.view.View r6 = r1.f276586n
            r7 = 2131312777(0x7f094089, float:1.8243932E38)
            android.view.View r6 = r6.findViewById(r7)
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBSclView r6 = (com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.p844mb.AdLandingMBSclView) r6
            r1.f258737s = r6
            if (r6 != 0) goto L_0x0048
            java.lang.String r0 = "the magic view is null, are you sure???"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x0048:
            boolean r6 = fp2.C32156g.m39639a()
            if (r6 != 0) goto L_0x0058
            java.lang.String r0 = "the mb is not supported, hide the magic scl view"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x0058:
            android.view.View r14 = r1.f276586n
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r13 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r15.mo10233c(r6)
            java.lang.Object[] r7 = r15.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/mb/AdLandingMBComponent"
            java.lang.String r9 = "createView"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r6 = r14
            r17 = r2
            r2 = 0
            r13 = r16
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r6 = r15.mo10231a(r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r14.setVisibility(r6)
            java.lang.String r7 = "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/mb/AdLandingMBComponent"
            java.lang.String r8 = "createView"
            java.lang.String r9 = "()V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r6 = r14
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBSclView r6 = r1.f258737s
            r6.setUnbindFrameSetOnDetach(r2)
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBSclView r2 = r1.f258737s
            r2.addOnAttachStateChangeListener(r1)
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBSclView r2 = r1.f258737s
            java.lang.String r4 = r4.f259117z
            r2.getClass()
            java.lang.String r6 = "name"
            gy3.C87412m.m108594g(r4, r6)
            r2.f157377h = r4
            android.content.Context r2 = r1.f276579d
            android.app.Activity r2 = (android.app.Activity) r2
            fp2.f r4 = fp2.C87070f.f252656a
            java.lang.String r4 = "prepareBiz"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r6)
            java.lang.String r7 = "SnsAdMB"
            if (r2 != 0) goto L_0x00d9
            java.lang.String r0 = "activity is null, are you sure??"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r6)
            r16 = r3
            r8 = 0
            goto L_0x0174
        L_0x00d9:
            int r15 = r2.hashCode()     // Catch:{ Exception -> 0x0154 }
            java.util.Map<java.lang.Integer, fp2.b> r14 = fp2.C87070f.f252657b     // Catch:{ Exception -> 0x0154 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x0154 }
            r10 = r14
            java.util.LinkedHashMap r10 = (java.util.LinkedHashMap) r10     // Catch:{ Exception -> 0x0154 }
            java.lang.Object r9 = r10.get(r9)     // Catch:{ Exception -> 0x0154 }
            fp2.b r9 = (fp2.C87066b) r9     // Catch:{ Exception -> 0x0154 }
            if (r9 != 0) goto L_0x0112
            java.lang.String r9 = "new magic brush manager data."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r9)     // Catch:{ Exception -> 0x0154 }
            fp2.b r13 = new fp2.b     // Catch:{ Exception -> 0x0154 }
            r11 = 0
            r12 = 0
            r16 = 6
            r18 = 0
            r9 = r13
            r10 = r15
            r8 = r13
            r13 = r16
            r16 = r3
            r3 = r14
            r14 = r18
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0152 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x0152 }
            r3.put(r9, r8)     // Catch:{ Exception -> 0x0152 }
            r9 = r8
            goto L_0x0114
        L_0x0112:
            r16 = r3
        L_0x0114:
            java.lang.String r3 = "getBiz"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r0)     // Catch:{ Exception -> 0x0152 }
            fp2.c r8 = r9.f252648b     // Catch:{ Exception -> 0x0152 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r0)     // Catch:{ Exception -> 0x0152 }
            if (r8 != 0) goto L_0x0171
            java.lang.String r3 = "new magic brush biz created!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)     // Catch:{ Exception -> 0x0152 }
            fp2.c r8 = new fp2.c     // Catch:{ Exception -> 0x0152 }
            r8.<init>(r2)     // Catch:{ Exception -> 0x0152 }
            java.lang.String r2 = "setBiz"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r0)     // Catch:{ Exception -> 0x0152 }
            r9.f252648b = r8     // Catch:{ Exception -> 0x0152 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r0)     // Catch:{ Exception -> 0x0152 }
            java.util.Map<java.lang.Integer, java.lang.ref.WeakReference<android.widget.FrameLayout>> r0 = fp2.C87070f.f252658c     // Catch:{ Exception -> 0x0152 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x0152 }
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch:{ Exception -> 0x0152 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x0152 }
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch:{ Exception -> 0x0152 }
            if (r0 == 0) goto L_0x014d
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0152 }
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0     // Catch:{ Exception -> 0x0152 }
            goto L_0x014e
        L_0x014d:
            r0 = 0
        L_0x014e:
            r8.mo121537D0(r0)     // Catch:{ Exception -> 0x0152 }
            goto L_0x0171
        L_0x0152:
            r0 = move-exception
            goto L_0x0157
        L_0x0154:
            r0 = move-exception
            r16 = r3
        L_0x0157:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "there is an exception in destroy: "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            r8 = 0
        L_0x0171:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r6)
        L_0x0174:
            r1.f258740v = r8
            if (r8 != 0) goto L_0x0186
            java.lang.String r0 = "the biz is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            r3 = r16
            r2 = r17
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x0186:
            r3 = r16
            r2 = r17
            java.lang.String r0 = "getOrCreateFrameSetRoot"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r4)
            java.lang.ref.Reference<android.app.Activity> r6 = r8.f252652p
            java.lang.Object r6 = r6.get()
            if (r6 != 0) goto L_0x01a4
            java.lang.String r6 = "the activity is null, Please check it"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
            r8 = 0
            goto L_0x01c7
        L_0x01a4:
            i70.c<?, ?>$a r6 = r8.f252653q
            if (r6 != 0) goto L_0x01c3
            java.lang.ref.Reference<android.app.Activity> r6 = r8.f252652p
            java.lang.Object r6 = r6.get()
            r11 = r6
            android.app.Activity r11 = (android.app.Activity) r11
            if (r11 == 0) goto L_0x01c0
            java.lang.String r12 = "MagicAdLandPage"
            java.lang.String r13 = "frames"
            java.lang.String r14 = ""
            r9 = r8
            r10 = r8
            i70.c$a r6 = r9.mo122091i0(r10, r11, r12, r13, r14)
            goto L_0x01c1
        L_0x01c0:
            r6 = 0
        L_0x01c1:
            r8.f252653q = r6
        L_0x01c3:
            r8 = r6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
        L_0x01c7:
            r1.f258739u = r8
            if (r8 != 0) goto L_0x01d5
            java.lang.String r0 = "the frameSetRoot is null, is biz prepared???"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x01d5:
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBSclView r0 = r1.f258737s
            r0.mo76546c(r8)
            r19.mo124362E()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x01e1:
            java.lang.String r0 = "the magic info is null, or the frame set name is empty!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ro2.C90076a.mo67238e():void");
    }

    /* renamed from: n */
    public int mo118819n() {
        SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        return C0966R.C0971layout.d_t;
    }

    public void onViewAttachedToWindow(View view) {
        SnsMethodCalculate.markStartTimeMs("onViewAttachedToWindow", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        mo124362E();
        SnsMethodCalculate.markEndTimeMs("onViewAttachedToWindow", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
    }

    public void onViewDetachedFromWindow(View view) {
        SnsMethodCalculate.markStartTimeMs("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        this.f258741w = view == this.f258737s;
        SnsMethodCalculate.markEndTimeMs("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
    }

    /* renamed from: u */
    public boolean mo124366u(JSONArray jSONArray) {
        SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        try {
            C90269o oVar = this.f258738t;
            if (oVar == null) {
                Log.m105920e("AdLandingMBComponent", "the mb info is null in setComponentKVReportData, are you sure?");
                SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
                return false;
            }
            Context context = this.f276579d;
            if (!(context instanceof Activity)) {
                Log.m105920e("AdLandingMBComponent", "the context is not Activity object!!");
                SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
                return false;
            }
            Activity activity = (Activity) context;
            JSONObject jSONObject = new JSONObject();
            if (!mo118822v(jSONObject)) {
                Log.m105928w("AdLandingMBComponent", "magic brush component doesn't allow to report 13387");
                SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
                return false;
            }
            List<JSONObject> b = C87070f.m108089b(activity, oVar.f296495a);
            if (C101425k.m133097a(b)) {
                Log.m105920e("AdLandingMBComponent", "there is no children in magic brush !!");
                SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
                return false;
            }
            for (JSONObject next : b) {
                if (!next.has("cid")) {
                    Log.m105928w("AdLandingMBComponent", "there is one data without id, are you sure?");
                } else {
                    if (!next.has(C102646h.COL_EXPOSURECOUNT)) {
                        next.put(C102646h.COL_EXPOSURECOUNT, mo131851j());
                    }
                    if (!next.has("stayTime")) {
                        next.put("stayTime", mo131555o());
                    }
                    jSONArray.put(next);
                }
            }
            jSONArray.put(jSONObject);
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
            return true;
        } catch (Exception e) {
            Log.m105920e("AdLandingMBComponent", "there is a wrong in setComponentKVReportData, exception: " + e.getMessage());
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
            return false;
        }
    }
}
