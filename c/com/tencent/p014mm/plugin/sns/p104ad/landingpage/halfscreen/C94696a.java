package com.tencent.p014mm.plugin.sns.p104ad.landingpage.halfscreen;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95243v0;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C7865r3;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import qs2.C101271i0;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.a */
public class C94696a {

    /* renamed from: a */
    public SnsAdNativeLandingPagesUI f274073a;

    /* renamed from: b */
    public AdLandingPageHalfScreenContainer f274074b;

    /* renamed from: c */
    public Context f274075c;

    /* renamed from: d */
    public View f274076d;

    /* renamed from: e */
    public int f274077e;

    /* renamed from: f */
    public boolean f274078f = false;

    /* renamed from: g */
    public AdLandingPageHalfScreenContainer.C94695e f274079g = new C94698b();

    /* renamed from: h */
    public C94699c f274080h;

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.a$a */
    public class C94697a implements View.OnClickListener {
        public C94697a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ad/landingpage/halfscreen/AdHalfScreenLandingPageHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$1");
            C94696a.m119887a(C94696a.this).mo132509R8();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/landingpage/halfscreen/AdHalfScreenLandingPageHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.a$b */
    public class C94698b implements AdLandingPageHalfScreenContainer.C94695e {
        public C94698b() {
        }

        /* renamed from: a */
        public void mo130353a() {
            SnsMethodCalculate.markStartTimeMs("onStayToTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$2");
            Log.m105924i("AdHalfScreenLandingPageHelper", "onStayToTop");
            SnsAdNativeLandingPagesUI a = C94696a.m119887a(C94696a.this);
            a.getClass();
            SnsMethodCalculate.markStartTimeMs("getGlobalFloatBtnsLayout", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            C95243v0 v0Var = a.f277544T1;
            SnsMethodCalculate.markEndTimeMs("getGlobalFloatBtnsLayout", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            if (v0Var != null && C94696a.m119887a(C94696a.this).mo132495C8()) {
                SnsAdNativeLandingPagesUI a2 = C94696a.m119887a(C94696a.this);
                a2.getClass();
                SnsMethodCalculate.markStartTimeMs("getGlobalFloatBtnsLayout", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                C95243v0 v0Var2 = a2.f277544T1;
                SnsMethodCalculate.markEndTimeMs("getGlobalFloatBtnsLayout", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                v0Var2.mo131766H();
                SnsAdNativeLandingPagesUI a3 = C94696a.m119887a(C94696a.this);
                a3.getClass();
                SnsMethodCalculate.markStartTimeMs("getGlobalFloatBtnsLayout", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                C95243v0 v0Var3 = a3.f277544T1;
                SnsMethodCalculate.markEndTimeMs("getGlobalFloatBtnsLayout", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                v0Var3.mo124360B();
            }
            SnsAdNativeLandingPagesUI a4 = C94696a.m119887a(C94696a.this);
            a4.getClass();
            SnsMethodCalculate.markStartTimeMs("getFloatBarViewWrapper", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper = a4.f277610r1;
            SnsMethodCalculate.markEndTimeMs("getFloatBarViewWrapper", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            if (adLandingFloatBarCompWrapper != null && C94696a.m119887a(C94696a.this).mo132495C8()) {
                SnsAdNativeLandingPagesUI a5 = C94696a.m119887a(C94696a.this);
                a5.getClass();
                SnsMethodCalculate.markStartTimeMs("getFloatBarViewWrapper", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper2 = a5.f277610r1;
                SnsMethodCalculate.markEndTimeMs("getFloatBarViewWrapper", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                if (adLandingFloatBarCompWrapper2.mo131506O()) {
                    SnsAdNativeLandingPagesUI a6 = C94696a.m119887a(C94696a.this);
                    a6.getClass();
                    SnsMethodCalculate.markStartTimeMs("getFloatBarViewWrapper", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper3 = a6.f277610r1;
                    SnsMethodCalculate.markEndTimeMs("getFloatBarViewWrapper", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    adLandingFloatBarCompWrapper3.mo131512W();
                    ContentFragment m8 = C94696a.m119887a(C94696a.this).mo132540m8();
                    if (m8 != null) {
                        m8.mo131815a0();
                    }
                } else {
                    C94696a.m119887a(C94696a.this).mo132524Z8();
                }
            }
            SnsMethodCalculate.markEndTimeMs("onStayToTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.a$c */
    public interface C94699c {
    }

    public C94696a(SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        this.f274073a = snsAdNativeLandingPagesUI;
        this.f274075c = snsAdNativeLandingPagesUI;
        C101271i0 n8 = snsAdNativeLandingPagesUI.mo132541n8();
        n8.getClass();
        SnsMethodCalculate.markStartTimeMs("isOpenFromHalfScreenMode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        boolean z = n8.f296638w;
        SnsMethodCalculate.markEndTimeMs("isOpenFromHalfScreenMode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        this.f274078f = z;
        AdLandingPageHalfScreenContainer adLandingPageHalfScreenContainer = (AdLandingPageHalfScreenContainer) snsAdNativeLandingPagesUI.findViewById(C0966R.C0970id.n1d);
        this.f274074b = adLandingPageHalfScreenContainer;
        adLandingPageHalfScreenContainer.setBackgroundColor(-16777216);
        this.f274074b.setHalfScreenModeEnable(true);
        float b = (float) C76577a.m92151b(this.f274075c.getApplicationContext(), 12);
        this.f274074b.mo153905b(b, b, 0.0f, 0.0f);
        this.f274074b.setHalfScreenListener(this.f274079g);
        int a = C7865r3.f26468a.mo8968a();
        int c = C75044y4.m89991c(this.f274075c);
        boolean t = C85875k4.m106205t(this.f274075c, false);
        int o = t ? C85875k4.m106198o(this.f274075c) : 0;
        int ceil = ((int) Math.ceil((double) (((float) a) * 0.75f))) + c;
        this.f274077e = (a - ceil) - o;
        Log.m105924i("AdHalfScreenLandingPageHelper", "screenH=" + a + ", navH=" + c + ", hasCutOut=" + t + ", cutOutH=" + o + ", contentH=" + ceil);
        C85875k4.m106205t(this.f274075c, false);
        AdLandingPageHalfScreenContainer adLandingPageHalfScreenContainer2 = this.f274074b;
        int i = this.f274077e;
        adLandingPageHalfScreenContainer2.getClass();
        SnsMethodCalculate.markStartTimeMs("setStayPosition", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        adLandingPageHalfScreenContainer2.f274055g = i;
        adLandingPageHalfScreenContainer2.f274056h = 0;
        adLandingPageHalfScreenContainer2.mo130335i(i);
        SnsMethodCalculate.markEndTimeMs("setStayPosition", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        View findViewById = snsAdNativeLandingPagesUI.findViewById(C0966R.C0970id.ehi);
        this.f274076d = findViewById;
        findViewById.setOnClickListener(new C94697a());
    }

    /* renamed from: a */
    public static /* synthetic */ SnsAdNativeLandingPagesUI m119887a(C94696a aVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
        SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = aVar.f274073a;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
        return snsAdNativeLandingPagesUI;
    }

    /* renamed from: c */
    public static void m119888c(MMActivity mMActivity) {
        SnsMethodCalculate.markStartTimeMs("setFullScreenForHalfMode", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
        mMActivity.getWindow().getDecorView().setSystemUiVisibility(1280);
        mMActivity.getWindow().setStatusBarColor(0);
        mMActivity.getController().mo177059O0(mMActivity, 0);
        mMActivity.getController().mo177049H0(true);
        mMActivity.getController().mo177103x0(-16777216);
        SnsMethodCalculate.markEndTimeMs("setFullScreenForHalfMode", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
    }

    /* renamed from: b */
    public boolean mo130351b() {
        SnsMethodCalculate.markStartTimeMs("isStayTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
        AdLandingPageHalfScreenContainer adLandingPageHalfScreenContainer = this.f274074b;
        if (adLandingPageHalfScreenContainer != null) {
            adLandingPageHalfScreenContainer.getClass();
            SnsMethodCalculate.markStartTimeMs("isStayTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
            boolean z = adLandingPageHalfScreenContainer.f274061p;
            SnsMethodCalculate.markEndTimeMs("isStayTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
            SnsMethodCalculate.markEndTimeMs("isStayTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
            return z;
        }
        SnsMethodCalculate.markEndTimeMs("isStayTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
        return false;
    }
}
