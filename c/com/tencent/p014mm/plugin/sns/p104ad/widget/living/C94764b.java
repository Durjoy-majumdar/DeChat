package com.tencent.p014mm.plugin.sns.p104ad.widget.living;

import android.content.Context;
import android.view.ViewGroup;
import co2.C92445n;
import com.tencent.p014mm.plugin.sns.p104ad.widget.living.C94762a;
import com.tencent.p014mm.plugin.sns.p104ad.widget.living.LivingDescBarLayout;
import com.tencent.p014mm.plugin.sns.p106ui.C96177r2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import vr2.C102260r;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.living.b */
public class C94764b implements LivingDescBarLayout.C57346b, C94762a.C94763a {

    /* renamed from: a */
    public LivingStatusLayout f274432a;

    /* renamed from: b */
    public LivingDescBarLayout f274433b;

    /* renamed from: c */
    public String f274434c;

    /* renamed from: d */
    public C92445n f274435d;

    /* renamed from: e */
    public C96177r2 f274436e;

    /* renamed from: f */
    public int f274437f = 0;

    public C94764b(ViewGroup viewGroup, LivingDescBarLayout livingDescBarLayout, C96177r2 r2Var) {
        try {
            this.f274432a = (LivingStatusLayout) viewGroup;
            this.f274433b = livingDescBarLayout;
            this.f274436e = r2Var;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: f */
    public static boolean m120042f(int i) {
        SnsMethodCalculate.markStartTimeMs("isLivingNow", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        SnsMethodCalculate.markStartTimeMs("getLivingMainStatus", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        int i2 = i & 127;
        SnsMethodCalculate.markEndTimeMs("getLivingMainStatus", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        boolean z = i2 == 2;
        SnsMethodCalculate.markEndTimeMs("isLivingNow", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        return z;
    }

    /* renamed from: a */
    public String mo80948a(int i) {
        SnsMethodCalculate.markStartTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        List<String> c = mo130555c();
        if (c == null || i < 0 || i >= c.size()) {
            SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            return "";
        }
        String str = c.get(i);
        SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        return str;
    }

    /* renamed from: b */
    public void mo130554b(String str, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onLiveStatusChanged", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        if (this.f274434c.equals(str) && this.f274437f != i2) {
            mo130560h(i2);
        }
        SnsMethodCalculate.markEndTimeMs("onLiveStatusChanged", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
    }

    /* renamed from: c */
    public List<String> mo130555c() {
        List<String> list;
        SnsMethodCalculate.markStartTimeMs("getCurrentStatusDescriptionList", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        int i = this.f274437f & 127;
        C92445n nVar = this.f274435d;
        if (nVar != null) {
            if (i == 1) {
                list = nVar.f264559e;
            } else if (i == 2) {
                list = nVar.f264560f;
            } else if (i == 3) {
                list = nVar.f264561g;
            }
            SnsMethodCalculate.markEndTimeMs("getCurrentStatusDescriptionList", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            return list;
        }
        list = null;
        SnsMethodCalculate.markEndTimeMs("getCurrentStatusDescriptionList", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        return list;
    }

    /* renamed from: d */
    public String mo130556d(int i) {
        Context context;
        SnsMethodCalculate.markStartTimeMs("getString", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        LivingDescBarLayout livingDescBarLayout = this.f274433b;
        if (livingDescBarLayout != null) {
            context = livingDescBarLayout.getContext();
            SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        } else {
            context = null;
            SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        }
        if (context != null) {
            String string = context.getString(i);
            SnsMethodCalculate.markEndTimeMs("getString", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            return string;
        }
        SnsMethodCalculate.markEndTimeMs("getString", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        return "";
    }

    /* renamed from: e */
    public final void mo130557e() {
        SnsMethodCalculate.markStartTimeMs("hideAllLivingUI", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        LivingDescBarLayout livingDescBarLayout = this.f274433b;
        if (livingDescBarLayout != null) {
            livingDescBarLayout.setVisibility(8);
            livingDescBarLayout.mo80932c();
        }
        LivingStatusLayout livingStatusLayout = this.f274432a;
        if (livingStatusLayout != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            LivingStatusLayout livingStatusLayout2 = livingStatusLayout;
            C117292a.m165358d(livingStatusLayout2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/widget/living/SnsAdLivingStatusController", "hideAllLivingUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            livingStatusLayout.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(livingStatusLayout2, "com/tencent/mm/plugin/sns/ad/widget/living/SnsAdLivingStatusController", "hideAllLivingUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markEndTimeMs("hideAllLivingUI", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
    }

    public void finalize() {
        SnsMethodCalculate.markStartTimeMs("finalize", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        super.finalize();
        Log.m105918d("SnsAd.LivingStatusController", "the SnsAdLivingStatusController is going to be gc:  " + this);
        SnsMethodCalculate.markEndTimeMs("finalize", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
    }

    /* renamed from: g */
    public void mo130559g(String str, C92445n nVar) {
        SnsMethodCalculate.markStartTimeMs("setAdLiveInfo", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        this.f274434c = str;
        this.f274435d = nVar;
        SnsMethodCalculate.markEndTimeMs("setAdLiveInfo", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
    }

    public int getCount() {
        SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        List<String> c = mo130555c();
        int size = c != null ? c.size() : 0;
        SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        return size;
    }

    /* renamed from: h */
    public void mo130560h(int i) {
        SnsMethodCalculate.markStartTimeMs("setLiveStatus", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        if (i != this.f274437f) {
            this.f274437f = i;
            if (i == 0) {
                mo130557e();
            } else {
                SnsMethodCalculate.markStartTimeMs("setupLiveStatusContent", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
                LivingStatusLayout livingStatusLayout = this.f274432a;
                if (livingStatusLayout != null) {
                    livingStatusLayout.setVisibility(0);
                    livingStatusLayout.setLiveStatus(i);
                }
                SnsMethodCalculate.markEndTimeMs("setupLiveStatusContent", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
                mo130561i(i);
                mo130562j();
            }
        } else if (i == 0) {
            mo130557e();
        } else {
            SnsMethodCalculate.markStartTimeMs("setupLiveStatusContent", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            LivingStatusLayout livingStatusLayout2 = this.f274432a;
            if (livingStatusLayout2 != null) {
                livingStatusLayout2.setVisibility(0);
                livingStatusLayout2.setLiveStatus(i);
            }
            SnsMethodCalculate.markEndTimeMs("setupLiveStatusContent", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            mo130561i(i);
            SnsMethodCalculate.markStartTimeMs("setupLiveDescLayoutAdapterWhenStatusNotChanged", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            LivingDescBarLayout livingDescBarLayout = this.f274433b;
            if (livingDescBarLayout == null) {
                SnsMethodCalculate.markEndTimeMs("setupLiveDescLayoutAdapterWhenStatusNotChanged", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            } else {
                if (livingDescBarLayout.mo80930a()) {
                    mo130562j();
                } else {
                    livingDescBarLayout.mo80931b();
                }
                SnsMethodCalculate.markEndTimeMs("setupLiveDescLayoutAdapterWhenStatusNotChanged", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            }
        }
        SnsMethodCalculate.markEndTimeMs("setLiveStatus", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo130561i(int r9) {
        /*
            r8 = this;
            java.lang.String r0 = "setupActionButtonStateAndText"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.ui.r2 r2 = r8.f274436e
            if (r2 == 0) goto L_0x00af
            r3 = r9 & 127(0x7f, float:1.78E-43)
            r4 = 65280(0xff00, float:9.1477E-41)
            r9 = r9 & r4
            int r9 = r9 >> 8
            r4 = 2
            r5 = 1
            if (r3 != r5) goto L_0x002b
            if (r9 != r4) goto L_0x0023
            r9 = 2131836776(0x7f113f68, float:1.9306728E38)
            java.lang.String r9 = r8.mo130556d(r9)
            r3 = 0
            goto L_0x004d
        L_0x0023:
            r9 = 2131836802(0x7f113f82, float:1.9306781E38)
            java.lang.String r9 = r8.mo130556d(r9)
            goto L_0x004c
        L_0x002b:
            if (r3 != r4) goto L_0x0035
            r9 = 2131836797(0x7f113f7d, float:1.930677E38)
            java.lang.String r9 = r8.mo130556d(r9)
            goto L_0x004c
        L_0x0035:
            r4 = 3
            if (r3 != r4) goto L_0x004a
            if (r9 != r4) goto L_0x0042
            r9 = 2131836799(0x7f113f7f, float:1.9306775E38)
            java.lang.String r9 = r8.mo130556d(r9)
            goto L_0x004c
        L_0x0042:
            r9 = 2131836801(0x7f113f81, float:1.930678E38)
            java.lang.String r9 = r8.mo130556d(r9)
            goto L_0x004c
        L_0x004a:
            java.lang.String r9 = ""
        L_0x004c:
            r3 = 1
        L_0x004d:
            boolean r4 = android.text.TextUtils.isEmpty(r9)
            if (r4 != 0) goto L_0x00af
            java.lang.String r4 = "updateButtonText"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r6)
            android.widget.Button r7 = r2.f280994n     // Catch:{ all -> 0x0062 }
            if (r7 == 0) goto L_0x0062
            r7.setText(r9)     // Catch:{ all -> 0x0062 }
        L_0x0062:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r6)
            java.lang.String r9 = "updateButtonState"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r6)
            android.widget.Button r4 = r2.f280994n     // Catch:{ all -> 0x00ac }
            if (r4 == 0) goto L_0x00ac
            r4.setEnabled(r5)     // Catch:{ all -> 0x00ac }
            boolean r4 = r2.mo133799k()     // Catch:{ all -> 0x00ac }
            r2.mo133805r(r3)     // Catch:{ all -> 0x00ac }
            boolean r5 = r2.mo133800m()     // Catch:{ all -> 0x00ac }
            if (r5 != 0) goto L_0x00a7
            if (r3 == 0) goto L_0x0094
            android.widget.Button r3 = r2.f280994n     // Catch:{ all -> 0x00ac }
            android.content.Context r2 = r2.f280988e     // Catch:{ all -> 0x00ac }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ all -> 0x00ac }
            r4 = 2131100180(0x7f060214, float:1.7812734E38)
            int r2 = r2.getColor(r4)     // Catch:{ all -> 0x00ac }
            r3.setTextColor(r2)     // Catch:{ all -> 0x00ac }
            goto L_0x00ac
        L_0x0094:
            android.widget.Button r3 = r2.f280994n     // Catch:{ all -> 0x00ac }
            android.content.Context r2 = r2.f280988e     // Catch:{ all -> 0x00ac }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ all -> 0x00ac }
            r4 = 2131099665(0x7f060011, float:1.781169E38)
            int r2 = r2.getColor(r4)     // Catch:{ all -> 0x00ac }
            r3.setTextColor(r2)     // Catch:{ all -> 0x00ac }
            goto L_0x00ac
        L_0x00a7:
            if (r4 == r3) goto L_0x00ac
            r2.mo133806t()     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r6)
        L_0x00af:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.widget.living.C94764b.mo130561i(int):void");
    }

    /* renamed from: j */
    public void mo130562j() {
        Context context;
        SnsMethodCalculate.markStartTimeMs("setupLiveDescLayoutAdapter", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
        LivingDescBarLayout livingDescBarLayout = this.f274433b;
        if (livingDescBarLayout == null) {
            SnsMethodCalculate.markEndTimeMs("setupLiveDescLayoutAdapter", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            return;
        }
        if (getCount() == 0) {
            livingDescBarLayout.setVisibility(4);
            livingDescBarLayout.mo80932c();
        } else {
            livingDescBarLayout.setVisibility(0);
            livingDescBarLayout.setSlideAdapter(this);
            SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            LivingDescBarLayout livingDescBarLayout2 = this.f274433b;
            if (livingDescBarLayout2 != null) {
                context = livingDescBarLayout2.getContext();
                SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            } else {
                context = null;
                SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            }
            if (C102260r.m134842K(context)) {
                livingDescBarLayout.setVisibility(8);
            }
        }
        SnsMethodCalculate.markEndTimeMs("setupLiveDescLayoutAdapter", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
    }
}
