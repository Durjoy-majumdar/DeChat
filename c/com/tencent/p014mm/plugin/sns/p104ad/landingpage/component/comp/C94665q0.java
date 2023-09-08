package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import co2.C92442i;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p104ad.timeline.helper.ActionBtnFollowFinderHelper;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95108i0;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import jq2.C60887c;
import org.json.JSONObject;
import qo3.C77407n;
import so2.C101688q;
import up2.C102064e;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q0 */
public class C94665q0 extends C95108i0 {

    /* renamed from: B */
    public final C101688q f273934B;

    /* renamed from: C */
    public C92442i f273935C;

    /* renamed from: D */
    public C94666a f273936D;

    /* renamed from: E */
    public ActionBtnFollowFinderHelper f273937E;

    /* renamed from: F */
    public int f273938F = 0;

    /* renamed from: G */
    public int f273939G;

    /* renamed from: H */
    public int f273940H;

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q0$a */
    public static class C94666a implements AdLandingPagesProxy.C94830p {

        /* renamed from: a */
        public WeakReference<C94665q0> f273941a;

        /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q0$a$a */
        public class C94667a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Object f273942d;

            public C94667a(Object obj) {
                this.f273942d = obj;
            }

            public void run() {
                ActionBtnFollowFinderHelper actionBtnFollowFinderHelper;
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback$1");
                C94666a aVar = C94666a.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback");
                WeakReference<C94665q0> weakReference = aVar.f273941a;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback");
                if (weakReference == null) {
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback$1");
                    return;
                }
                C94666a aVar2 = C94666a.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback");
                WeakReference<C94665q0> weakReference2 = aVar2.f273941a;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback");
                C94665q0 q0Var = weakReference2.get();
                if (q0Var == null) {
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback$1");
                    return;
                }
                Object obj = this.f273942d;
                if (obj instanceof String) {
                    String str = (String) obj;
                    try {
                        String h = q0Var.mo131854m().mo140741h();
                        String l = q0Var.mo131854m().mo140745l();
                        String a = q0Var.mo131854m().mo140734a();
                        JSONObject jSONObject = new JSONObject(str);
                        int optInt = jSONObject.optInt("followType");
                        if (optInt == 1) {
                            q0Var.mo130255c0(jSONObject.optInt("followFlg"), jSONObject.optInt("followNum"), jSONObject.optInt("feedNum"));
                        } else if (optInt == 2) {
                            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
                            ActionBtnFollowFinderHelper actionBtnFollowFinderHelper2 = q0Var.f273937E;
                            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
                            if (actionBtnFollowFinderHelper2 == null) {
                                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback$1");
                                return;
                            }
                            boolean optBoolean = jSONObject.optBoolean("followRet");
                            String b = actionBtnFollowFinderHelper2.mo130395b();
                            if (optBoolean) {
                                actionBtnFollowFinderHelper = actionBtnFollowFinderHelper2;
                                C60887c.m71301b(h, l, a, b, 0, 2);
                                Log.m105924i("AdLandingQuickAddFinderBtnComp", "add finder contract success, followFlg is 1");
                                q0Var.mo130254b0(1);
                                AdLandingPagesProxy instance = AdLandingPagesProxy.getInstance();
                                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
                                Context context = q0Var.f276579d;
                                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
                                SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
                                C92442i iVar = q0Var.f273935C;
                                SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
                                instance.doJumpToFinderProfileUI(context, iVar.f264532a, l, h, 5);
                            } else {
                                actionBtnFollowFinderHelper = actionBtnFollowFinderHelper2;
                                C60887c.m71301b(h, l, a, b, 1, 2);
                            }
                            SnsMethodCalculate.markStartTimeMs("hideBottomSheet", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
                            ActionBtnFollowFinderHelper actionBtnFollowFinderHelper3 = actionBtnFollowFinderHelper;
                            C77407n nVar = actionBtnFollowFinderHelper3.f274161c;
                            if (nVar != null && nVar.mo107563h()) {
                                actionBtnFollowFinderHelper3.f274161c.mo107572p();
                            }
                            SnsMethodCalculate.markEndTimeMs("hideBottomSheet", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
                            actionBtnFollowFinderHelper3.mo130396c();
                        }
                    } catch (Throwable th) {
                        Log.m105920e("AdLandingQuickAddFinderBtnComp", "FinderLogicCallback callback, exp is " + th.toString());
                    }
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback$1");
            }
        }

        public C94666a(C94665q0 q0Var) {
            this.f273941a = new WeakReference<>(q0Var);
        }

        /* renamed from: a */
        public void mo10855a(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback");
            ((C119157j) C119157j.f356862d).mo183895z(new C94667a(obj));
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback");
        }

        /* renamed from: b */
        public void mo10856b(int i, int i2, Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback");
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback");
        }
    }

    public C94665q0(Context context, C101688q qVar, ViewGroup viewGroup) {
        super(context, qVar, viewGroup);
        this.f273934B = qVar;
        this.f273935C = qVar.f297696Z;
        this.f273936D = new C94666a(this);
        C92442i iVar = this.f273935C;
        if (iVar != null) {
            this.f276010t.mo90729c("finderExportId", iVar.f264537f);
            this.f276010t.mo90729c("finderUsername", this.f273935C.f264532a);
        }
    }

    /* renamed from: B */
    public void mo124360B() {
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
        super.mo124360B();
        if (this.f273934B == null || this.f273935C == null) {
            SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
            return;
        }
        Log.m105924i("AdLandingQuickAddFinderBtnComp", "viewWillAppear, mLastFollowFlg is " + this.f273938F);
        mo130254b0(this.f273938F);
        AdLandingPagesProxy.getInstance().getAdFinderContact(this.f273935C.f264532a, this.f273936D);
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
    }

    /* renamed from: K */
    public void mo130177K() {
        SnsMethodCalculate.markStartTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
        if (this.f273934B == null || this.f273935C == null) {
            SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
            return;
        }
        if (this.f273938F == 0) {
            if (this.f273937E == null) {
                Context context = this.f276579d;
                SnsMethodCalculate.markStartTimeMs("getBtnLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
                RoundedCornerFrameLayout roundedCornerFrameLayout = this.f276026u;
                SnsMethodCalculate.markEndTimeMs("getBtnLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
                this.f273937E = new ActionBtnFollowFinderHelper(context, roundedCornerFrameLayout, 1000, (C102064e.C102068b) null);
            }
            this.f276010t.mo90728b("opType", 0);
            ActionBtnFollowFinderHelper actionBtnFollowFinderHelper = this.f273937E;
            C92442i iVar = this.f273935C;
            String str = this.f273934B.f296714z;
            int i = this.f273939G;
            int i2 = this.f273940H;
            C94666a aVar = this.f273936D;
            actionBtnFollowFinderHelper.getClass();
            SnsMethodCalculate.markStartTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            actionBtnFollowFinderHelper.f274165g = iVar;
            actionBtnFollowFinderHelper.f274177s = str;
            actionBtnFollowFinderHelper.f274166h = aVar;
            actionBtnFollowFinderHelper.mo130397d(iVar, i, i2);
            SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        } else {
            String l = mo131854m().mo140745l();
            String h = mo131854m().mo140741h();
            this.f276010t.mo90728b("opType", 1);
            Log.m105924i("AdLandingQuickAddFinderBtnComp", "doBtnClick, uxInfo = " + l + ", snsId = " + h);
            AdLandingPagesProxy.getInstance().doJumpToFinderProfileUI(this.f276579d, this.f273935C.f264532a, l, h, 5);
        }
        SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
    }

    /* renamed from: b0 */
    public void mo130254b0(int i) {
        SnsMethodCalculate.markStartTimeMs("updateBtnUI", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
        this.f273938F = i;
        if (this.f273934B == null || this.f273935C == null) {
            SnsMethodCalculate.markEndTimeMs("updateBtnUI", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
            return;
        }
        Button N = mo131625N();
        if (N == null) {
            SnsMethodCalculate.markEndTimeMs("updateBtnUI", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
            return;
        }
        if (i == 0) {
            N.setText(this.f273934B.f296714z);
        } else {
            N.setText(this.f273935C.f264536e);
        }
        SnsMethodCalculate.markEndTimeMs("updateBtnUI", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
    }

    /* renamed from: c0 */
    public void mo130255c0(int i, int i2, int i3) {
        SnsMethodCalculate.markStartTimeMs("updateFinderFollowFlag", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
        Log.m105924i("AdLandingQuickAddFinderBtnComp", "request ad finder contract status, followFlg is " + i);
        this.f273939G = i2;
        this.f273940H = i3;
        mo130254b0(i);
        SnsMethodCalculate.markEndTimeMs("updateFinderFollowFlag", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
    }
}
