package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import fy3.C32226l;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import mp2.C34628a;
import nj3.C76912y0;
import nj3.C88989a;
import p749xh.C102646h;
import ps2.C100894u;
import ps2.C35631d0;
import rq2.C101429o;
import rx3.C13598b0;
import vo2.C65833d;
import vo3.C90852c;
import vr2.C102236a0;

@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI */
public class SnsAdNativeLandingPagesPreviewUI extends MMActivity {

    /* renamed from: g */
    public static final /* synthetic */ int f277483g = 0;

    /* renamed from: d */
    public int f277484d;

    /* renamed from: e */
    public boolean f277485e = false;

    /* renamed from: f */
    public boolean f277486f = false;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$a */
    public class C95418a implements C35631d0.C35635d {

        /* renamed from: a */
        public final /* synthetic */ long f277487a;

        /* renamed from: b */
        public final /* synthetic */ View f277488b;

        /* renamed from: c */
        public final /* synthetic */ Intent f277489c;

        public C95418a(long j, View view, Intent intent) {
            this.f277487a = j;
            this.f277488b = view;
            this.f277489c = intent;
        }

        /* renamed from: a */
        public int mo60346a(boolean z, String str) {
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$1");
            StringBuilder sb = new StringBuilder();
            sb.append("getAdCanvasInfo, isSucc=");
            sb.append(z);
            sb.append(", pageId=");
            sb.append(this.f277487a);
            sb.append(", xml.len=");
            sb.append(str == null ? 0 : str.length());
            Log.m105924i("SnsAdNativeLandingPagesPreviewUI", sb.toString());
            try {
                View view = this.f277488b;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesPreviewUI$1", "callback", "(ZLjava/lang/String;)I", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesPreviewUI$1", "callback", "(ZLjava/lang/String;)I", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (!TextUtils.isEmpty(str)) {
                    this.f277489c.putExtra("sns_landing_pages_xml", str);
                    SnsAdNativeLandingPagesPreviewUI snsAdNativeLandingPagesPreviewUI = SnsAdNativeLandingPagesPreviewUI.this;
                    Intent intent = this.f277489c;
                    int i = SnsAdNativeLandingPagesPreviewUI.f277483g;
                    SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                    boolean L7 = snsAdNativeLandingPagesPreviewUI.mo132493L7(intent, str);
                    SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                    if (!L7) {
                        SnsAdNativeLandingPagesPreviewUI.this.finish();
                        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$1");
                        return 0;
                    }
                    SnsAdNativeLandingPagesPreviewUI snsAdNativeLandingPagesPreviewUI2 = SnsAdNativeLandingPagesPreviewUI.this;
                    Intent intent2 = this.f277489c;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                    snsAdNativeLandingPagesPreviewUI2.mo132492K7(intent2, str);
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                } else {
                    SnsAdNativeLandingPagesPreviewUI snsAdNativeLandingPagesPreviewUI3 = SnsAdNativeLandingPagesPreviewUI.this;
                    int i2 = SnsAdNativeLandingPagesPreviewUI.f277483g;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                    boolean z2 = snsAdNativeLandingPagesPreviewUI3.f277485e;
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                    if (z2) {
                        SnsAdNativeLandingPagesPreviewUI snsAdNativeLandingPagesPreviewUI4 = SnsAdNativeLandingPagesPreviewUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                        boolean z3 = snsAdNativeLandingPagesPreviewUI4.f277486f;
                        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                        if (!z3) {
                            C65833d.m77547b(false);
                        }
                    }
                }
            } catch (Throwable th) {
                Log.m105920e("SnsAdNativeLandingPagesPreviewUI", "getAdCanvasInfo, exp=" + th.toString());
            }
            SnsAdNativeLandingPagesPreviewUI.this.finish();
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$1");
            return 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$b */
    public class C95419b implements C35631d0.C35635d {

        /* renamed from: a */
        public final /* synthetic */ View f277491a;

        /* renamed from: b */
        public final /* synthetic */ Intent f277492b;

        public C95419b(View view, Intent intent) {
            this.f277491a = view;
            this.f277492b = intent;
        }

        /* renamed from: a */
        public int mo60346a(boolean z, String str) {
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$2");
            StringBuilder sb = new StringBuilder();
            sb.append("getUxCanvasInfo, isSucc=");
            sb.append(z);
            sb.append(", canvasId=, canvasId, xml.len=");
            sb.append(str == null ? 0 : str.length());
            Log.m105924i("SnsAdNativeLandingPagesPreviewUI", sb.toString());
            try {
                View view = this.f277491a;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesPreviewUI$2", "callback", "(ZLjava/lang/String;)I", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesPreviewUI$2", "callback", "(ZLjava/lang/String;)I", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (!TextUtils.isEmpty(str)) {
                    this.f277492b.putExtra("sns_landing_pages_xml", str);
                    SnsAdNativeLandingPagesPreviewUI snsAdNativeLandingPagesPreviewUI = SnsAdNativeLandingPagesPreviewUI.this;
                    Intent intent = this.f277492b;
                    int i = SnsAdNativeLandingPagesPreviewUI.f277483g;
                    SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                    boolean L7 = snsAdNativeLandingPagesPreviewUI.mo132493L7(intent, str);
                    SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                    if (!L7) {
                        SnsAdNativeLandingPagesPreviewUI.this.finish();
                        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$2");
                        return 0;
                    }
                    SnsAdNativeLandingPagesPreviewUI snsAdNativeLandingPagesPreviewUI2 = SnsAdNativeLandingPagesPreviewUI.this;
                    Intent intent2 = this.f277492b;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                    snsAdNativeLandingPagesPreviewUI2.mo132492K7(intent2, str);
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                } else {
                    SnsAdNativeLandingPagesPreviewUI snsAdNativeLandingPagesPreviewUI3 = SnsAdNativeLandingPagesPreviewUI.this;
                    int i2 = SnsAdNativeLandingPagesPreviewUI.f277483g;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                    boolean z2 = snsAdNativeLandingPagesPreviewUI3.f277485e;
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                    if (z2) {
                        SnsAdNativeLandingPagesPreviewUI snsAdNativeLandingPagesPreviewUI4 = SnsAdNativeLandingPagesPreviewUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                        boolean z3 = snsAdNativeLandingPagesPreviewUI4.f277486f;
                        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                        if (!z3) {
                            C65833d.m77547b(false);
                        }
                    }
                }
            } catch (Throwable th) {
                Log.m105920e("SnsAdNativeLandingPagesPreviewUI", "getUxCanvasInfo, exp=" + th.toString());
            }
            SnsAdNativeLandingPagesPreviewUI.this.finish();
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$2");
            return 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$c */
    public class C95420c implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Intent f277494d;

        public C95420c(Intent intent) {
            this.f277494d = intent;
        }

        public Object invoke(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$3");
            String str = (String) obj;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$3");
            if (str != null) {
                Log.m105920e("SnsAdNativeLandingPagesPreviewUI", "jump use replaced xml " + str.length());
                SnsAdNativeLandingPagesPreviewUI snsAdNativeLandingPagesPreviewUI = SnsAdNativeLandingPagesPreviewUI.this;
                Intent intent = this.f277494d;
                int i = SnsAdNativeLandingPagesPreviewUI.f277483g;
                SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                snsAdNativeLandingPagesPreviewUI.mo132490I7(intent, str);
                SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
            }
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$3");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$3");
            return b0Var;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$d */
    public class C95421d implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f277496d;

        public C95421d(String str) {
            this.f277496d = str;
        }

        public Object invoke(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$4");
            String str = (String) obj;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$4");
            if (str != null) {
                Log.m105920e("SnsAdNativeLandingPagesPreviewUI", "jump use old xml " + str.length());
                SnsAdNativeLandingPagesPreviewUI snsAdNativeLandingPagesPreviewUI = SnsAdNativeLandingPagesPreviewUI.this;
                String str2 = this.f277496d;
                int i = SnsAdNativeLandingPagesPreviewUI.f277483g;
                SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                snsAdNativeLandingPagesPreviewUI.mo132491J7(str2);
                SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
            }
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$4");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$4");
            return b0Var;
        }
    }

    /* renamed from: H7 */
    public static String m121792H7(String str, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("getXmlValueByTag", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            SnsMethodCalculate.markEndTimeMs("getXmlValueByTag", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
            return "";
        }
        try {
            String str4 = XmlParser.parseXml(str, str2, (String) null).get(str3);
            SnsMethodCalculate.markEndTimeMs("getXmlValueByTag", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
            return str4;
        } catch (Exception e) {
            Log.m105920e("SnsAdNativeLandingPagesPreviewUI", "getXmlValueByTag exp=" + e.toString());
            SnsMethodCalculate.markEndTimeMs("getXmlValueByTag", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0102  */
    /* renamed from: I7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo132490I7(android.content.Intent r16, java.lang.String r17) {
        /*
            r15 = this;
            r8 = r15
            r9 = r16
            r0 = r17
            java.lang.String r10 = "jumpCanvas"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r11)
            java.lang.String r1 = "sns_landing_page_half_screen_mode"
            r12 = 0
            boolean r1 = r9.getBooleanExtra(r1, r12)
            java.lang.String r2 = "SnsAdNativeLandingPagesPreviewUI"
            r3 = 1
            if (r1 != 0) goto L_0x0046
            boolean r4 = vr2.C102260r.m134844M()
            if (r4 == 0) goto L_0x0046
            bp3.p r1 = bp3.C79758p.f233760a
            lf3.a r4 = new lf3.a
            r4.<init>()
            int r1 = r1.mo109883f(r4)
            if (r1 != r3) goto L_0x002f
            r1 = 1
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "debugEnv, mIsHalfScreenMode="
            r4.append(r5)
            boolean r5 = r8.f277485e
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
        L_0x0046:
            java.lang.String r4 = "sns_landing_pages_xml"
            r9.putExtra(r4, r0)
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = "sns_landing_page_start_time"
            r9.putExtra(r6, r4)
            java.lang.String r4 = "isLandingPageNeedAlphaAnim"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r11)
            java.lang.String r5 = "sns_landing_pages_need_enter_and_exit_animation"
            boolean r5 = r9.getBooleanExtra(r5, r12)
            if (r5 != 0) goto L_0x0094
            boolean r5 = com.tencent.p014mm.plugin.sns.storage.ADXml.isTwistAdCanvas(r17)
            if (r5 != 0) goto L_0x0094
            boolean r5 = com.tencent.p014mm.plugin.sns.storage.ADXml.isShakeAdCanvas(r17)
            if (r5 != 0) goto L_0x0094
            boolean r5 = com.tencent.p014mm.plugin.sns.storage.ADXml.isSimpleSharedShakeAd(r17)
            if (r5 != 0) goto L_0x0094
            java.lang.String r5 = "isEggAnimCanvas"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            if (r0 == 0) goto L_0x008b
            java.lang.String r7 = "<eggAnimationInfo>"
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L_0x008b
            r0 = 1
            goto L_0x008c
        L_0x008b:
            r0 = 0
        L_0x008c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            if (r0 == 0) goto L_0x0092
            goto L_0x0094
        L_0x0092:
            r0 = 0
            goto L_0x0095
        L_0x0094:
            r0 = 1
        L_0x0095:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "isLandingPageNeedAlphaAnim, ret="
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r11)
            if (r0 != 0) goto L_0x00b4
            if (r1 == 0) goto L_0x00b2
            goto L_0x00b4
        L_0x00b2:
            r13 = 0
            goto L_0x00b5
        L_0x00b4:
            r13 = 1
        L_0x00b5:
            java.lang.String r0 = "sns_landing_pages_need_alpha_bkg"
            r9.putExtra(r0, r13)
            java.lang.Class<com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI> r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.class
            r9.setClass(r15, r0)
            k20.a r14 = new k20.a
            r14.<init>()
            r14.mo10233c(r9)
            java.lang.Object[] r1 = r14.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesPreviewUI"
            java.lang.String r3 = "jumpCanvas"
            java.lang.String r4 = "(Landroid/content/Intent;Ljava/lang/String;)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r15
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r14.mo10231a(r12)
            android.content.Intent r0 = (android.content.Intent) r0
            r15.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesPreviewUI"
            java.lang.String r2 = "jumpCanvas"
            java.lang.String r3 = "(Landroid/content/Intent;Ljava/lang/String;)V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r15
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            r15.finish()
            if (r13 == 0) goto L_0x0102
            r15.overridePendingTransition(r12, r12)
            goto L_0x011e
        L_0x0102:
            java.lang.String r0 = "sns_landing_page_from_bonus"
            int r0 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getIntExtra(r9, r0, r12)
            if (r0 <= 0) goto L_0x0115
            r0 = 2130772149(0x7f0100b5, float:1.7147408E38)
            r1 = 2130771992(0x7f010018, float:1.714709E38)
            r15.overridePendingTransition(r0, r1)
            goto L_0x011e
        L_0x0115:
            r0 = 2130772182(0x7f0100d6, float:1.7147475E38)
            r1 = 2130772177(0x7f0100d1, float:1.7147465E38)
            r15.overridePendingTransition(r0, r1)
        L_0x011e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesPreviewUI.mo132490I7(android.content.Intent, java.lang.String):void");
    }

    /* renamed from: J7 */
    public final boolean mo132491J7(String str) {
        SnsMethodCalculate.markStartTimeMs("jumpWebPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
        try {
            if (this.f277485e) {
                Log.m105928w("SnsAdNativeLandingPagesPreviewUI", "unknown canvas halfScreenMode, showTip");
                if (!this.f277486f) {
                    C65833d.m77547b(false);
                }
                C76912y0.m92773l(MMApplicationContext.getContext(), getString(C0966R.string.mif));
                finish();
                SnsMethodCalculate.markEndTimeMs("jumpWebPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                return true;
            }
            Log.m105924i("SnsAdNativeLandingPagesPreviewUI", "unknown canvas goto webview, " + str);
            String H7 = m121792H7(str, C102646h.COL_ADXML, ".adxml.adCanvasInfo.shareWebUrl");
            if (TextUtils.isEmpty(H7)) {
                Log.m105920e("SnsAdNativeLandingPagesPreviewUI", "shareWebUrl is empty");
                H7 = m121792H7(str, C102646h.COL_ADXML, ".adxml.adActionLink");
            }
            String H72 = m121792H7(str, C102646h.COL_ADXML, ".adxml.originUxInfo");
            Log.m105924i("SnsAdNativeLandingPagesPreviewUI", "jumpUrl=" + H7 + ", uxInfo=" + H72);
            String b = C102236a0.m134734b(H7, H72);
            if (!TextUtils.isEmpty(b)) {
                Log.m105924i("SnsAdNativeLandingPagesPreviewUI", "jump WebViewUI, url=" + b);
                Intent intent = new Intent();
                intent.putExtra("rawUrl", b);
                intent.putExtra("showShare", true);
                C102236a0.m134732a(intent, 84);
                C88144b.m109791i(this, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                finish();
                overridePendingTransition(C0966R.C0968anim.f2503er, C0966R.C0968anim.f2498em);
                SnsMethodCalculate.markEndTimeMs("jumpWebPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                return true;
            }
            SnsMethodCalculate.markEndTimeMs("jumpWebPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
            return false;
        } catch (Throwable th) {
            Log.m105924i("SnsAdNativeLandingPagesPreviewUI", "jump WebViewUI exp=" + th.toString());
            finish();
        }
    }

    /* renamed from: K7 */
    public final boolean mo132492K7(Intent intent, String str) {
        SnsMethodCalculate.markStartTimeMs("openCanvas", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
        String stringExtra = intent.getStringExtra("sns_landing_pages_extra_param");
        if (C34628a.m40410c(this.f277484d)) {
            C34628a.m40411d(stringExtra, 6);
        }
        boolean z = C101429o.m133111d() && this.f277484d == 5;
        String H7 = m121792H7(str, C102646h.COL_ADXML, ".adxml.canvasShareInfo.canvasId");
        if (z && !Util.isNullOrNil(H7)) {
            C101429o.m133109b(Util.safeParseLong(H7), this.f277484d, m121792H7(str, C102646h.COL_ADXML, ".adxml.canvasShareInfo.uxInfo"), m121792H7(str, C102646h.COL_ADXML, ".adxml.canvasShareInfo.canvasDynamicInfo"), this, str, new C95420c(intent), new C95421d(str));
            SnsMethodCalculate.markEndTimeMs("openCanvas", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
            return true;
        } else if (C100894u.m132239s(str)) {
            if (C34628a.m40410c(this.f277484d)) {
                C34628a.m40411d(stringExtra, 7);
            }
            mo132490I7(intent, str);
            SnsMethodCalculate.markEndTimeMs("openCanvas", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
            return true;
        } else if (mo132491J7(str)) {
            SnsMethodCalculate.markEndTimeMs("openCanvas", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
            return true;
        } else {
            SnsMethodCalculate.markEndTimeMs("openCanvas", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00aa  */
    /* renamed from: L7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo132493L7(android.content.Intent r13, java.lang.String r14) {
        /*
            r12 = this;
            java.lang.String r0 = "protectOverSizeXml"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            r3 = 1
            if (r2 != 0) goto L_0x00b6
            java.lang.String r2 = "preCheckIsXmlOverSize"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
            r5 = 0
            if (r14 == 0) goto L_0x0025
            int r6 = r14.length()
            r7 = 102400(0x19000, float:1.43493E-40)
            if (r6 < r7) goto L_0x0025
            r6 = 1
            goto L_0x0026
        L_0x0025:
            r6 = 0
        L_0x0026:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            if (r6 == 0) goto L_0x00b6
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 1676(0x68c, float:2.349E-42)
            r7 = 17
            r2.mo175911u(r6, r7)
            java.lang.String r2 = "writeTempCanvasXmlToLocal"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            java.lang.String r7 = ""
            if (r6 == 0) goto L_0x0047
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
        L_0x0045:
            r6 = r7
            goto L_0x0095
        L_0x0047:
            java.lang.String r6 = a70.C112760b.m154231g()
            com.tencent.mm.vfs.m1 r8 = new com.tencent.mm.vfs.m1
            java.lang.String r9 = "tmpLargeCanvasDir"
            r8.<init>((java.lang.String) r6, (java.lang.String) r9)
            boolean r6 = r8.mo119967g()
            if (r6 != 0) goto L_0x005c
            r8.mo119987x()
        L_0x005c:
            java.lang.String r6 = "UTF-8"
            byte[] r14 = r14.getBytes(r6)     // Catch:{ Exception -> 0x0089 }
            com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x0089 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0089 }
            r9.<init>()     // Catch:{ Exception -> 0x0089 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0089 }
            r9.append(r10)     // Catch:{ Exception -> 0x0089 }
            r9.append(r7)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0089 }
            r6.<init>((com.tencent.p014mm.vfs.C86009m1) r8, (java.lang.String) r9)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r6 = r6.mo119971i()     // Catch:{ Exception -> 0x0089 }
            int r8 = r14.length     // Catch:{ Exception -> 0x0089 }
            int r14 = com.tencent.p014mm.vfs.C86013q1.m106438T(r6, r14, r5, r8)     // Catch:{ Exception -> 0x0089 }
            if (r14 != 0) goto L_0x0091
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            goto L_0x0095
        L_0x0089:
            java.lang.String r14 = "LandingPageUtil"
            java.lang.String r6 = "writeTempCanvasXmlToLocal fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r6)
        L_0x0091:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            goto L_0x0045
        L_0x0095:
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r14 == 0) goto L_0x00aa
            boolean r13 = r12.f277485e
            if (r13 == 0) goto L_0x00a6
            boolean r13 = r12.f277486f
            if (r13 != 0) goto L_0x00a6
            vo2.C65833d.m77547b(r5)
        L_0x00a6:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r5
        L_0x00aa:
            java.lang.String r14 = "sns_landing_pages_xml"
            r13.putExtra(r14, r7)
            java.lang.String r14 = "sns_landing_pages_too_large_xml_path"
            r13.putExtra(r14, r6)
        L_0x00b6:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesPreviewUI.mo132493L7(android.content.Intent, java.lang.String):boolean");
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
        return C0966R.C0971layout.c1n;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x02ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r28) {
        /*
            r27 = this;
            r11 = r27
            java.lang.String r12 = "onCreate"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r13)
            super.onCreate(r28)
            com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95198o2.m121133e(r27)
            android.content.Intent r6 = r27.getIntent()
            if (r6 != 0) goto L_0x001d
            r27.finish()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            return
        L_0x001d:
            java.lang.String r1 = "sns_landing_pages_xml"
            java.lang.String r2 = r6.getStringExtra(r1)
            java.lang.String r0 = "sns_landing_pages_canvasid"
            boolean r3 = r6.hasExtra(r0)
            java.lang.String r4 = "sns_landing_pages_pageid"
            r7 = 0
            long r9 = r6.getLongExtra(r4, r7)
            java.lang.String r4 = r6.getStringExtra(r0)
            java.lang.String r0 = "sns_landing_pages_canvas_ext"
            java.lang.String r5 = r6.getStringExtra(r0)
            java.lang.String r0 = "sns_landing_pages_no_store"
            r15 = 0
            int r14 = r6.getIntExtra(r0, r15)
            java.lang.String r0 = "sns_landing_page_half_screen_mode"
            boolean r0 = r6.getBooleanExtra(r0, r15)
            r11.f277485e = r0
            java.lang.String r7 = "SnsAdNativeLandingPagesPreviewUI"
            r8 = 1
            if (r0 != 0) goto L_0x0083
            boolean r0 = vr2.C102260r.m134844M()
            if (r0 == 0) goto L_0x0083
            bp3.p r0 = bp3.C79758p.f233760a
            lf3.a r15 = new lf3.a
            r15.<init>()
            int r0 = r0.mo109883f(r15)
            if (r0 != r8) goto L_0x006a
            r0 = 1
            goto L_0x006b
        L_0x006a:
            r0 = 0
        L_0x006b:
            r11.f277485e = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r15 = "debugEnv, mIsHalfScreenMode="
            r0.append(r15)
            boolean r15 = r11.f277485e
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
        L_0x0083:
            java.lang.String r0 = "sns_landing_page_open_from_half_screen_mode"
            r15 = 0
            boolean r0 = r6.getBooleanExtra(r0, r15)
            r11.f277486f = r0
            boolean r0 = r11.f277485e
            if (r0 == 0) goto L_0x009c
            com.tencent.p014mm.plugin.sns.p104ad.landingpage.halfscreen.C94696a.m119888c(r27)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 1898(0x76a, float:2.66E-42)
            r8 = 7
            r0.mo175911u(r15, r8)
        L_0x009c:
            java.lang.String r0 = "sns_landing_page_canvas_dynamicinfo"
            java.lang.String r8 = r6.getStringExtra(r0)
            java.lang.String r0 = "sns_landing_pages_ad_info"
            java.lang.String r0 = r6.getStringExtra(r0)
            java.lang.String r15 = "sns_landig_pages_from_source"
            r24 = r12
            r12 = 0
            int r15 = r6.getIntExtra(r15, r12)
            r11.f277484d = r15
            java.lang.String r0 = vr2.C102260r.m134835D(r0)
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 == 0) goto L_0x00e2
            java.lang.String r0 = "sns_landing_pages_ux_info"
            java.lang.String r0 = r6.getStringExtra(r0)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r15 = "parse uxinfo from adinfoxml failed, source="
            r12.append(r15)
            int r15 = r11.f277484d
            r12.append(r15)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r12)
        L_0x00e2:
            r12 = r0
            int r0 = r11.f277484d
            java.lang.String r15 = "updagteStateBarColor"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r13)
            r25 = r1
            r1 = 24
            if (r0 == r1) goto L_0x00f9
            r1 = 30
            if (r0 != r1) goto L_0x00f6
            goto L_0x00f9
        L_0x00f6:
            r26 = r8
            goto L_0x014f
        L_0x00f9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0133 }
            r1.<init>()     // Catch:{ all -> 0x0133 }
            r26 = r8
            java.lang.String r8 = "updagteStateBarColor， source="
            r1.append(r8)     // Catch:{ all -> 0x0131 }
            r1.append(r0)     // Catch:{ all -> 0x0131 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0131 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)     // Catch:{ all -> 0x0131 }
            android.view.Window r0 = r27.getWindow()     // Catch:{ all -> 0x0131 }
            r1 = 0
            r0.setStatusBarColor(r1)     // Catch:{ all -> 0x0131 }
            com.tencent.mm.ui.MMActivityController r0 = r27.getController()     // Catch:{ all -> 0x0131 }
            r0.mo177059O0(r11, r1)     // Catch:{ all -> 0x0131 }
            com.tencent.mm.ui.MMActivityController r0 = r27.getController()     // Catch:{ all -> 0x0131 }
            r1 = 1
            r0.mo177049H0(r1)     // Catch:{ all -> 0x0131 }
            com.tencent.mm.ui.MMActivityController r0 = r27.getController()     // Catch:{ all -> 0x0131 }
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.mo177103x0(r1)     // Catch:{ all -> 0x0131 }
            goto L_0x014f
        L_0x0131:
            r0 = move-exception
            goto L_0x0136
        L_0x0133:
            r0 = move-exception
            r26 = r8
        L_0x0136:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r8 = "updagteStateBarColor, exp="
            r1.append(r8)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
        L_0x014f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r13)
            int r0 = r11.f277484d
            boolean r0 = mp2.C34628a.m40410c(r0)
            if (r0 == 0) goto L_0x0165
            java.lang.String r0 = "sns_landing_pages_extra_param"
            java.lang.String r0 = r6.getStringExtra(r0)
            r1 = 5
            mp2.C34628a.m40411d(r0, r1)
        L_0x0165:
            ps2.a r8 = new ps2.a
            r8.<init>()
            r1 = 0
            r8.f35001d = r1
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x01db
            r1 = 1
            if (r14 == r1) goto L_0x01bb
            if (r3 != r1) goto L_0x0195
            ps2.d0 r0 = ps2.C35631d0.m40782b()
            r0.getClass()
            java.lang.String r1 = "openForUx"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r15 = 0
            java.lang.String r0 = r0.mo60343d(r4, r5, r15, r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            r2 = r14
            r1 = r25
            r28 = 0
            goto L_0x01b5
        L_0x0195:
            r15 = 0
            ps2.d0 r0 = ps2.C35631d0.m40782b()
            r17 = 0
            r18 = 0
            r19 = 0
            int r1 = r11.f277484d
            r2 = r14
            r14 = r0
            r28 = 0
            r15 = r9
            r20 = r1
            r21 = r12
            r22 = r26
            r23 = r8
            java.lang.String r0 = r14.mo60342c(r15, r17, r18, r19, r20, r21, r22, r23)
            r1 = r25
        L_0x01b5:
            r6.putExtra(r1, r0)
            r1 = r2
            r2 = r0
            goto L_0x01be
        L_0x01bb:
            r1 = r14
            r28 = 0
        L_0x01be:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r14 = 15
            r15 = 1676(0x68c, float:2.349E-42)
            r0.mo175911u(r15, r14)
            boolean r14 = android.text.TextUtils.isEmpty(r2)
            if (r14 != 0) goto L_0x01d2
            r14 = 16
            r0.mo175911u(r15, r14)
        L_0x01d2:
            r14 = 1
            if (r1 != r14) goto L_0x01ec
            r1 = 18
            r0.mo175911u(r15, r1)
            goto L_0x01ec
        L_0x01db:
            r28 = 0
            boolean r0 = r11.mo132493L7(r6, r2)
            if (r0 != 0) goto L_0x01ec
            r27.finish()
            r14 = r24
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r13)
            return
        L_0x01ec:
            r14 = r24
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x02ed
            r0 = 2131311522(0x7f093ba2, float:1.8241387E38)
            android.view.View r0 = r11.findViewById(r0)
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r28)
            r1.mo10233c(r2)
            java.lang.Object[] r16 = r1.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesPreviewUI"
            java.lang.String r18 = "onCreate"
            java.lang.String r19 = "(Landroid/os/Bundle;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r0
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r16 = "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesPreviewUI"
            java.lang.String r17 = "onCreate"
            java.lang.String r18 = "(Landroid/os/Bundle;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            java.lang.String r1 = ", source="
            if (r3 != 0) goto L_0x02a0
            r15 = 0
            int r17 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r17 <= 0) goto L_0x02a0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getAdCanvasInfo, pageId="
            r2.append(r3)
            r2.append(r9)
            r2.append(r1)
            int r1 = r11.f277484d
            r2.append(r1)
            java.lang.String r1 = ",canvasDynamicInfo="
            r2.append(r1)
            r15 = r26
            r2.append(r15)
            java.lang.String r1 = ", uxInfo="
            r2.append(r1)
            r2.append(r12)
            java.lang.String r1 = ", adCanvasParams = "
            r2.append(r1)
            r2.append(r8)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            r7 = 0
            r16 = 0
            int r5 = r11.f277484d
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$a r17 = new com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$a
            r1 = r17
            r2 = r27
            r3 = r9
            r18 = r5
            r5 = r0
            r1.<init>(r3, r5, r6)
            r1 = r9
            r3 = r7
            r4 = r16
            r5 = r18
            r6 = r12
            r7 = r15
            r9 = r17
            r10 = r27
            ps2.C35631d0.m40783e(r1, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x02fa
        L_0x02a0:
            r8 = 1
            if (r3 != r8) goto L_0x02d6
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r3 != 0) goto L_0x02d6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "getUxCanvasInfo, canvasId="
            r3.append(r8)
            r3.append(r4)
            r3.append(r1)
            int r1 = r11.f277484d
            r3.append(r1)
            java.lang.String r1 = ",canvasExt="
            r3.append(r1)
            r3.append(r5)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$b r1 = new com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$b
            r1.<init>(r0, r6)
            ps2.C35631d0.m40784f(r4, r5, r2, r1, r11)
            goto L_0x02fa
        L_0x02d6:
            java.lang.String r0 = "intent without canvas xml, or pageId!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            boolean r0 = r11.f277485e
            if (r0 == 0) goto L_0x02e6
            boolean r0 = r11.f277486f
            if (r0 != 0) goto L_0x02e6
            vo2.C65833d.m77547b(r2)
        L_0x02e6:
            r27.finish()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r13)
            return
        L_0x02ed:
            boolean r0 = r11.mo132492K7(r6, r2)
            if (r0 == 0) goto L_0x02f7
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r13)
            return
        L_0x02f7:
            r27.finish()
        L_0x02fa:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesPreviewUI.onCreate(android.os.Bundle):void");
    }
}
