package com.tencent.p014mm.p136ui.matrix;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.matrix.trace.view.C80550a;
import com.tencent.matrix.trace.view.FloatFrameView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.matrix.C80992k;
import com.tencent.p014mm.matrix.strategy.MatrixStrategyNotifyBroadcast;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.matrix.MatrixSettingHeaderPreference;
import com.tencent.p014mm.plugin.battery.stats.MMBatteryStatsActivity;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import gm3.C8361d;
import gm3.c$$a;
import gm3.c$$b;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import oa1.C117731d;
import p1029rf.C89938b;
import p1029rf.C89940c;
import p1029rf.C89957f;
import p723vf.C118672d;
import p761yd.C38993b;
import p761yd.C91441c;
import p910lj.C76701a;
import p933be.C113173i;
import p933be.C79691a;
import p961ee.C86507b;
import p965fe.C86853a;
import p995kf.C88146a;
import pj3.C47511g;

/* renamed from: com.tencent.mm.ui.matrix.MatrixSettingUI */
public class MatrixSettingUI extends MMPreference implements MatrixSettingHeaderPreference.C85919c {

    /* renamed from: g */
    public static boolean f250268g;

    /* renamed from: d */
    public MultiProcessMMKV f250269d = MultiProcessMMKV.getMMKV("MatrixDelegate");

    /* renamed from: e */
    public Runnable f250270e;

    /* renamed from: f */
    public Handler f250271f = new Handler(Looper.getMainLooper());

    /* renamed from: com.tencent.mm.ui.matrix.MatrixSettingUI$a */
    public class C85920a implements MenuItem.OnMenuItemClickListener {
        public C85920a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            MatrixSettingUI.this.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public static boolean m106233H7() {
        return C117731d.m166007c().mo182444f("clicfg_battery_stats_ui", "0", false, true).equals("1") || WeChatEnvironment.hasDebugger() || WeChatEnvironment.isCoolassistEnv() || BuildInfo.IS_FLAVOR_RED;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 178 */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x02ce  */
    /* renamed from: K7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m106234K7(android.content.Context r24, int r25) {
        /*
            r1 = r24
            r2 = r25
            fe.a r0 = p965fe.C86853a.f252120l
            boolean r3 = r0.mo121316b(r1)
            if (r3 == 0) goto L_0x036f
            java.lang.String r3 = "Matrix.TopThreadIndicator"
            boolean r4 = r0.mo121316b(r1)
            r5 = 0
            if (r4 != 0) goto L_0x0018
        L_0x0015:
            r0 = 0
            goto L_0x02cc
        L_0x0018:
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r24)     // Catch:{ Exception -> 0x02af }
            r7 = 2131495631(0x7f0c0acf, float:1.8614804E38)
            r8 = 0
            android.view.View r4 = r4.inflate(r7, r8)     // Catch:{ Exception -> 0x02af }
            r0.f252125e = r4     // Catch:{ Exception -> 0x02af }
            if (r4 != 0) goto L_0x0030
            java.lang.String r0 = "Can not load indicator view!"
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x02af }
            p723vf.C118672d.m167356f(r3, r0, r4)     // Catch:{ Exception -> 0x02af }
            goto L_0x0015
        L_0x0030:
            int r4 = r4.hashCode()     // Catch:{ Exception -> 0x02af }
            android.content.Context r7 = r24.getApplicationContext()     // Catch:{ Exception -> 0x02af }
            java.lang.String r8 = "window"
            java.lang.Object r7 = r7.getSystemService(r8)     // Catch:{ Exception -> 0x02af }
            android.view.WindowManager r7 = (android.view.WindowManager) r7     // Catch:{ Exception -> 0x02af }
            android.util.DisplayMetrics r8 = new android.util.DisplayMetrics     // Catch:{ Exception -> 0x02af }
            r8.<init>()     // Catch:{ Exception -> 0x02af }
            android.view.Display r9 = r7.getDefaultDisplay()     // Catch:{ Exception -> 0x02af }
            if (r9 == 0) goto L_0x005c
            android.view.Display r9 = r7.getDefaultDisplay()     // Catch:{ Exception -> 0x02af }
            android.util.DisplayMetrics r10 = r0.f252121a     // Catch:{ Exception -> 0x02af }
            r9.getMetrics(r10)     // Catch:{ Exception -> 0x02af }
            android.view.Display r9 = r7.getDefaultDisplay()     // Catch:{ Exception -> 0x02af }
            r9.getMetrics(r8)     // Catch:{ Exception -> 0x02af }
        L_0x005c:
            android.view.WindowManager$LayoutParams r8 = new android.view.WindowManager$LayoutParams     // Catch:{ Exception -> 0x02af }
            r8.<init>()     // Catch:{ Exception -> 0x02af }
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x02af }
            r10 = 26
            if (r9 < r10) goto L_0x006c
            r9 = 2038(0x7f6, float:2.856E-42)
            r8.type = r9     // Catch:{ Exception -> 0x02af }
            goto L_0x0070
        L_0x006c:
            r9 = 2002(0x7d2, float:2.805E-42)
            r8.type = r9     // Catch:{ Exception -> 0x02af }
        L_0x0070:
            r9 = 40
            r8.flags = r9     // Catch:{ Exception -> 0x02af }
            r9 = 8388659(0x800033, float:1.1755015E-38)
            r8.gravity = r9     // Catch:{ Exception -> 0x02af }
            r8.y = r5     // Catch:{ Exception -> 0x02af }
            r9 = -2
            r8.width = r9     // Catch:{ Exception -> 0x02af }
            r8.height = r9     // Catch:{ Exception -> 0x02af }
            r8.format = r9     // Catch:{ Exception -> 0x02af }
            android.view.View r10 = r0.f252125e     // Catch:{ Exception -> 0x02af }
            r7.addView(r10, r8)     // Catch:{ Exception -> 0x02af }
            android.view.View r10 = r0.f252125e     // Catch:{ Exception -> 0x02af }
            r11 = 2131315701(0x7f094bf5, float:1.8249863E38)
            android.view.View r10 = r10.findViewById(r11)     // Catch:{ Exception -> 0x02af }
            android.widget.TextView r10 = (android.widget.TextView) r10     // Catch:{ Exception -> 0x02af }
            d3.c<java.lang.Integer, java.lang.String> r11 = r0.f252124d     // Catch:{ Exception -> 0x02af }
            F r11 = r11.f166179a     // Catch:{ Exception -> 0x02af }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x02af }
            r10.setText(r11)     // Catch:{ Exception -> 0x02af }
            android.view.View r11 = r0.f252125e     // Catch:{ Exception -> 0x02af }
            r12 = 2131315810(0x7f094c62, float:1.8250084E38)
            android.view.View r11 = r11.findViewById(r12)     // Catch:{ Exception -> 0x02af }
            android.widget.TextView r11 = (android.widget.TextView) r11     // Catch:{ Exception -> 0x02af }
            d3.c<java.lang.Integer, java.lang.String> r12 = r0.f252124d     // Catch:{ Exception -> 0x02af }
            S r12 = r12.f166180b     // Catch:{ Exception -> 0x02af }
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12     // Catch:{ Exception -> 0x02af }
            r11.setText(r12)     // Catch:{ Exception -> 0x02af }
            android.view.View r11 = r0.f252125e     // Catch:{ Exception -> 0x02af }
            r12 = 2131299493(0x7f090ca5, float:1.8216989E38)
            android.view.View r11 = r11.findViewById(r12)     // Catch:{ Exception -> 0x02af }
            android.widget.CheckBox r11 = (android.widget.CheckBox) r11     // Catch:{ Exception -> 0x02af }
            boolean r11 = r11.isChecked()     // Catch:{ Exception -> 0x02af }
            r0.f252128h = r11     // Catch:{ Exception -> 0x02af }
            android.view.View r11 = r0.f252125e     // Catch:{ Exception -> 0x02af }
            r12 = 2131307114(0x7f092a6a, float:1.8232446E38)
            android.view.View r11 = r11.findViewById(r12)     // Catch:{ Exception -> 0x02af }
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11     // Catch:{ Exception -> 0x02af }
            r12 = 0
        L_0x00ce:
            r14 = -1
            r15 = 9
            r13 = 1084227584(0x40a00000, float:5.0)
            if (r12 >= r15) goto L_0x014b
            android.content.Context r15 = r11.getContext()     // Catch:{ Exception -> 0x02af }
            android.view.LayoutInflater r15 = android.view.LayoutInflater.from(r15)     // Catch:{ Exception -> 0x02af }
            r6 = 2131495628(0x7f0c0acc, float:1.8614798E38)
            android.view.View r6 = r15.inflate(r6, r11, r5)     // Catch:{ Exception -> 0x02af }
            android.widget.LinearLayout$LayoutParams r15 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x02af }
            r15.<init>(r14, r9)     // Catch:{ Exception -> 0x02af }
            android.content.Context r14 = r11.getContext()     // Catch:{ Exception -> 0x02af }
            android.content.res.Resources r14 = r14.getResources()     // Catch:{ Exception -> 0x02af }
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()     // Catch:{ Exception -> 0x02af }
            r9 = 1
            float r13 = android.util.TypedValue.applyDimension(r9, r13, r14)     // Catch:{ Exception -> 0x02af }
            int r9 = (int) r13     // Catch:{ Exception -> 0x02af }
            r15.topMargin = r9     // Catch:{ Exception -> 0x02af }
            k20.a r9 = new k20.a     // Catch:{ Exception -> 0x02af }
            r9.<init>()     // Catch:{ Exception -> 0x02af }
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a     // Catch:{ Exception -> 0x02af }
            r13 = 8
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x02af }
            r9.mo10233c(r13)     // Catch:{ Exception -> 0x02af }
            java.lang.Object[] r17 = r9.mo10232b()     // Catch:{ Exception -> 0x02af }
            java.lang.String r18 = "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator"
            java.lang.String r19 = "show"
            java.lang.String r20 = "(Landroid/content/Context;)Z"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r6
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x02af }
            java.lang.Object r9 = r9.mo10231a(r5)     // Catch:{ Exception -> 0x02af }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ Exception -> 0x02af }
            int r9 = r9.intValue()     // Catch:{ Exception -> 0x02af }
            r6.setVisibility(r9)     // Catch:{ Exception -> 0x02af }
            java.lang.String r17 = "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator"
            java.lang.String r18 = "show"
            java.lang.String r19 = "(Landroid/content/Context;)Z"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r16 = r6
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x02af }
            r11.addView(r6, r15)     // Catch:{ Exception -> 0x02af }
            int r12 = r12 + 1
            r9 = -2
            goto L_0x00ce
        L_0x014b:
            android.view.View r6 = r0.f252125e     // Catch:{ Exception -> 0x02af }
            r9 = 2131307111(0x7f092a67, float:1.823244E38)
            android.view.View r6 = r6.findViewById(r9)     // Catch:{ Exception -> 0x02af }
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6     // Catch:{ Exception -> 0x02af }
            r9 = 0
        L_0x0157:
            if (r9 >= r15) goto L_0x01d4
            android.content.Context r11 = r6.getContext()     // Catch:{ Exception -> 0x02af }
            android.view.LayoutInflater r11 = android.view.LayoutInflater.from(r11)     // Catch:{ Exception -> 0x02af }
            r12 = 2131495629(0x7f0c0acd, float:1.86148E38)
            android.view.View r11 = r11.inflate(r12, r6, r5)     // Catch:{ Exception -> 0x02af }
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x02af }
            r15 = -2
            r12.<init>(r14, r15)     // Catch:{ Exception -> 0x02af }
            android.content.Context r15 = r6.getContext()     // Catch:{ Exception -> 0x02af }
            android.content.res.Resources r15 = r15.getResources()     // Catch:{ Exception -> 0x02af }
            android.util.DisplayMetrics r15 = r15.getDisplayMetrics()     // Catch:{ Exception -> 0x02af }
            r14 = 1
            float r15 = android.util.TypedValue.applyDimension(r14, r13, r15)     // Catch:{ Exception -> 0x02af }
            int r14 = (int) r15     // Catch:{ Exception -> 0x02af }
            r12.topMargin = r14     // Catch:{ Exception -> 0x02af }
            k20.a r14 = new k20.a     // Catch:{ Exception -> 0x02af }
            r14.<init>()     // Catch:{ Exception -> 0x02af }
            java.lang.ThreadLocal<k20.a> r15 = k20.C60958c.f173611a     // Catch:{ Exception -> 0x02af }
            r15 = 8
            java.lang.Integer r13 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x02af }
            r14.mo10233c(r13)     // Catch:{ Exception -> 0x02af }
            java.lang.Object[] r17 = r14.mo10232b()     // Catch:{ Exception -> 0x02af }
            java.lang.String r18 = "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator"
            java.lang.String r19 = "show"
            java.lang.String r20 = "(Landroid/content/Context;)Z"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r11
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x02af }
            java.lang.Object r13 = r14.mo10231a(r5)     // Catch:{ Exception -> 0x02af }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ Exception -> 0x02af }
            int r13 = r13.intValue()     // Catch:{ Exception -> 0x02af }
            r11.setVisibility(r13)     // Catch:{ Exception -> 0x02af }
            java.lang.String r17 = "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator"
            java.lang.String r18 = "show"
            java.lang.String r19 = "(Landroid/content/Context;)Z"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r16 = r11
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x02af }
            r6.addView(r11, r12)     // Catch:{ Exception -> 0x02af }
            int r9 = r9 + 1
            r13 = 1084227584(0x40a00000, float:5.0)
            r14 = -1
            r15 = 9
            goto L_0x0157
        L_0x01d4:
            android.view.View r6 = r0.f252125e     // Catch:{ Exception -> 0x02af }
            r9 = 2131307113(0x7f092a69, float:1.8232444E38)
            android.view.View r6 = r6.findViewById(r9)     // Catch:{ Exception -> 0x02af }
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6     // Catch:{ Exception -> 0x02af }
            r9 = 0
        L_0x01e0:
            r11 = 29
            if (r9 >= r11) goto L_0x025d
            android.content.Context r11 = r6.getContext()     // Catch:{ Exception -> 0x02af }
            android.view.LayoutInflater r11 = android.view.LayoutInflater.from(r11)     // Catch:{ Exception -> 0x02af }
            r12 = 2131495627(0x7f0c0acb, float:1.8614796E38)
            android.view.View r11 = r11.inflate(r12, r6, r5)     // Catch:{ Exception -> 0x02af }
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x02af }
            r13 = -1
            r14 = -2
            r12.<init>(r13, r14)     // Catch:{ Exception -> 0x02af }
            android.content.Context r15 = r6.getContext()     // Catch:{ Exception -> 0x02af }
            android.content.res.Resources r15 = r15.getResources()     // Catch:{ Exception -> 0x02af }
            android.util.DisplayMetrics r15 = r15.getDisplayMetrics()     // Catch:{ Exception -> 0x02af }
            r13 = 1084227584(0x40a00000, float:5.0)
            r14 = 1
            float r15 = android.util.TypedValue.applyDimension(r14, r13, r15)     // Catch:{ Exception -> 0x02af }
            int r14 = (int) r15     // Catch:{ Exception -> 0x02af }
            r12.topMargin = r14     // Catch:{ Exception -> 0x02af }
            k20.a r14 = new k20.a     // Catch:{ Exception -> 0x02af }
            r14.<init>()     // Catch:{ Exception -> 0x02af }
            java.lang.ThreadLocal<k20.a> r15 = k20.C60958c.f173611a     // Catch:{ Exception -> 0x02af }
            r15 = 8
            java.lang.Integer r13 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x02af }
            r14.mo10233c(r13)     // Catch:{ Exception -> 0x02af }
            java.lang.Object[] r17 = r14.mo10232b()     // Catch:{ Exception -> 0x02af }
            java.lang.String r18 = "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator"
            java.lang.String r19 = "show"
            java.lang.String r20 = "(Landroid/content/Context;)Z"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r11
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x02af }
            java.lang.Object r13 = r14.mo10231a(r5)     // Catch:{ Exception -> 0x02af }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ Exception -> 0x02af }
            int r13 = r13.intValue()     // Catch:{ Exception -> 0x02af }
            r11.setVisibility(r13)     // Catch:{ Exception -> 0x02af }
            java.lang.String r17 = "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator"
            java.lang.String r18 = "show"
            java.lang.String r19 = "(Landroid/content/Context;)Z"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r16 = r11
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x02af }
            r6.addView(r11, r12)     // Catch:{ Exception -> 0x02af }
            int r9 = r9 + 1
            goto L_0x01e0
        L_0x025d:
            fe.b r6 = new fe.b     // Catch:{ Exception -> 0x02af }
            r6.<init>(r0, r8, r7, r4)     // Catch:{ Exception -> 0x02af }
            android.view.View r4 = r0.f252125e     // Catch:{ Exception -> 0x02af }
            r4.setOnTouchListener(r6)     // Catch:{ Exception -> 0x02af }
            fe.c r4 = new fe.c     // Catch:{ Exception -> 0x02af }
            r4.<init>(r0, r10)     // Catch:{ Exception -> 0x02af }
            android.view.View r6 = r0.f252125e     // Catch:{ Exception -> 0x02af }
            r7 = 2131307147(0x7f092a8b, float:1.8232513E38)
            android.view.View r6 = r6.findViewById(r7)     // Catch:{ Exception -> 0x02af }
            r6.setOnClickListener(r4)     // Catch:{ Exception -> 0x02af }
            android.view.View r6 = r0.f252125e     // Catch:{ Exception -> 0x02af }
            r7 = 2131307103(0x7f092a5f, float:1.8232424E38)
            android.view.View r6 = r6.findViewById(r7)     // Catch:{ Exception -> 0x02af }
            r6.setOnClickListener(r4)     // Catch:{ Exception -> 0x02af }
            android.view.View r6 = r0.f252125e     // Catch:{ Exception -> 0x02af }
            r7 = 2131306759(0x7f092907, float:1.8231726E38)
            android.view.View r6 = r6.findViewById(r7)     // Catch:{ Exception -> 0x02af }
            r6.setOnClickListener(r4)     // Catch:{ Exception -> 0x02af }
            android.view.View r6 = r0.f252125e     // Catch:{ Exception -> 0x02af }
            r7 = 2131315773(0x7f094c3d, float:1.8250009E38)
            android.view.View r6 = r6.findViewById(r7)     // Catch:{ Exception -> 0x02af }
            r6.setOnClickListener(r4)     // Catch:{ Exception -> 0x02af }
            android.view.View r6 = r0.f252125e     // Catch:{ Exception -> 0x02af }
            r7 = 2131307087(0x7f092a4f, float:1.8232391E38)
            android.view.View r6 = r6.findViewById(r7)     // Catch:{ Exception -> 0x02af }
            r6.setOnClickListener(r4)     // Catch:{ Exception -> 0x02af }
            android.view.View r0 = r0.f252125e     // Catch:{ Exception -> 0x02af }
            r0.setOnClickListener(r4)     // Catch:{ Exception -> 0x02af }
            r0 = 1
            goto L_0x02cc
        L_0x02af:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Create float view failed:"
            r4.append(r6)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.Object[] r4 = new java.lang.Object[r5]
            p723vf.C118672d.m167356f(r3, r0, r4)
            goto L_0x0015
        L_0x02cc:
            if (r0 == 0) goto L_0x036f
            android.content.Context r0 = r24.getApplicationContext()
            java.lang.Class<im3.a$$c> r1 = im3.a$$c.class
            monitor-enter(r1)
            fe.a r3 = p965fe.C86853a.f252120l     // Catch:{ all -> 0x036d }
            ie.i<com.tencent.matrix.batterycanary.monitor.feature.k0$a$a<com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot>> r4 = r3.f252130j     // Catch:{ all -> 0x036d }
            boolean r6 = r4 instanceof im3.a$$c     // Catch:{ all -> 0x036d }
            if (r6 != 0) goto L_0x02fb
            be.i r6 = p212oe.C117750b.m166047e()     // Catch:{ all -> 0x036d }
            if (r6 == 0) goto L_0x02ed
            ce.g r6 = r6.f338613h     // Catch:{ all -> 0x036d }
            r3.f252126f = r6     // Catch:{ all -> 0x036d }
            ce.f r6 = r6.f339057d     // Catch:{ all -> 0x036d }
            ie.h r6 = r6.f339026A     // Catch:{ all -> 0x036d }
            r3.f252129i = r6     // Catch:{ all -> 0x036d }
        L_0x02ed:
            im3.a$$c r6 = new im3.a$$c     // Catch:{ all -> 0x036d }
            r6.<init>(r4)     // Catch:{ all -> 0x036d }
            r3.f252130j = r6     // Catch:{ all -> 0x036d }
            gm3.c$$c r4 = new gm3.c$$c     // Catch:{ all -> 0x036d }
            r4.<init>(r0)     // Catch:{ all -> 0x036d }
            r3.f252131k = r4     // Catch:{ all -> 0x036d }
        L_0x02fb:
            monitor-exit(r1)     // Catch:{ all -> 0x036d }
            r0 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x0325
            r4 = 1
            if (r2 == r4) goto L_0x0322
            r4 = 2
            if (r2 == r4) goto L_0x031f
            r4 = 3
            if (r2 == r4) goto L_0x031b
            r4 = 4
            if (r2 == r4) goto L_0x0317
            r4 = 5
            if (r2 == r4) goto L_0x0313
            long r6 = (long) r2
            long r6 = r6 * r0
            goto L_0x0326
        L_0x0313:
            r6 = 1800000(0x1b7740, double:8.89318E-318)
            goto L_0x0326
        L_0x0317:
            r6 = 600000(0x927c0, double:2.964394E-318)
            goto L_0x0326
        L_0x031b:
            r6 = 60000(0xea60, double:2.9644E-319)
            goto L_0x0326
        L_0x031f:
            r6 = 10000(0x2710, double:4.9407E-320)
            goto L_0x0326
        L_0x0322:
            r6 = 5000(0x1388, double:2.4703E-320)
            goto L_0x0326
        L_0x0325:
            r6 = r0
        L_0x0326:
            long r6 = r6 / r0
            int r0 = (int) r6
            android.view.View r1 = r3.f252125e
            java.lang.String r2 = "Matrix.TopThreadIndicator"
            if (r1 != 0) goto L_0x0336
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r1 = "Call #prepare first to show the indicator"
            p723vf.C118672d.m167356f(r2, r1, r0)
            goto L_0x036f
        L_0x0336:
            android.util.SparseBooleanArray r4 = r3.f252123c
            int r1 = r1.hashCode()
            boolean r1 = r4.get(r1, r5)
            if (r1 == 0) goto L_0x0344
            r9 = 1
            goto L_0x0345
        L_0x0344:
            r9 = 0
        L_0x0345:
            if (r9 == 0) goto L_0x034f
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r1 = "Already started!"
            p723vf.C118672d.m167356f(r2, r1, r0)
            goto L_0x036f
        L_0x034f:
            android.view.View r1 = r3.f252125e
            int r1 = r1.hashCode()
            android.util.SparseBooleanArray r2 = r3.f252123c
            r2.clear()
            android.util.SparseBooleanArray r2 = r3.f252123c
            r4 = 1
            r2.put(r1, r4)
            java.lang.Class<ee.b> r2 = p961ee.C86507b.class
            fe.f r4 = new fe.f
            r4.<init>(r3, r0, r1)
            p933be.C79691a.m96805b(r2, r4)
            goto L_0x036f
        L_0x036b:
            monitor-exit(r1)     // Catch:{ all -> 0x036d }
            throw r0
        L_0x036d:
            r0 = move-exception
            goto L_0x036b
        L_0x036f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.matrix.MatrixSettingUI.m106234K7(android.content.Context, int):void");
    }

    /* renamed from: I7 */
    public final boolean mo119813I7() {
        return BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG;
    }

    /* renamed from: J7 */
    public final void mo119814J7(String str, boolean z) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra(str, z);
        C80992k.m98890b(MMApplicationContext.getContext(), intent);
        MMApplicationContext.getContext().sendBroadcast(intent, MatrixStrategyNotifyBroadcast.f237879a);
    }

    public int getResourceId() {
        return C0966R.xml.f8917bb;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        boolean z = false;
        C118672d.m167353c("Matrix.SettingUI", "requestCode:%s resultCode:%s", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 2) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) getPreferenceScreen().mo72519a("fps_decorator_preference");
            if (!(Build.VERSION.SDK_INT >= 23 ? Settings.canDrawOverlays(this) : true)) {
                C76701a.makeText((Context) this, (CharSequence) getResources().getString(C0966R.string.gpy), 1).show();
                checkBoxPreference.mo6805K(false);
            } else {
                checkBoxPreference.mo6805K(true);
                mo119814J7("ENABLE_FPS_FLOAT", checkBoxPreference.mo6804J());
                ((CheckBoxPreference) getPreferenceScreen().mo72519a("fps_preference")).mo6805K(true);
                mo119814J7("ENABLE_FPS", true);
            }
            getPreferenceScreen().notifyDataSetChanged();
        } else if (i == 3 && ((CheckBoxPreference) getPreferenceScreen().mo72519a("battery_top_preference")).mo6804J()) {
            if (C86853a.f252120l.f252125e != null) {
                z = true;
            }
            if (!z) {
                m106234K7(this, MultiProcessMMKV.getDefault().getInt("matrix_top_thread_interval", 1));
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(getContext().getResources().getString(C0966R.string.gqd));
        setBackBtn(new C85920a());
        if (!C91441c.m114729c()) {
            Log.m105920e("Matrix.SettingUI", "Matrix is not installed!");
            return;
        }
        ((MatrixSettingHeaderPreference) getPreferenceScreen().mo72519a("matrix_header_pref")).f250261J = (f250268g || !mo119813I7()) ? null : this;
        MatrixSettingJankSeekBarPreference matrixSettingJankSeekBarPreference = (MatrixSettingJankSeekBarPreference) getPreferenceScreen().mo72519a("matrix_jank_seek_bar");
        int i = this.f250269d.getInt("clicfg_matrix_trace_evil_method_threshold", 700);
        matrixSettingJankSeekBarPreference.f56341R = i;
        matrixSettingJankSeekBarPreference.mo26275J((int) ((((float) i) * 100.0f) / 5000.0f));
        matrixSettingJankSeekBarPreference.f56339Q = new c$$a(this);
        MatrixSettingTopThreadSeekBarPreference matrixSettingTopThreadSeekBarPreference = (MatrixSettingTopThreadSeekBarPreference) getPreferenceScreen().mo72519a("matrix_top_indicator_seek_bar");
        matrixSettingTopThreadSeekBarPreference.mo26275J(MultiProcessMMKV.getDefault().getInt("matrix_top_thread_interval", 1));
        matrixSettingTopThreadSeekBarPreference.f56339Q = new c$$b(this);
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        boolean z = false;
        if (!C91441c.m114729c()) {
            return false;
        }
        String str = preference.f121285r;
        if (str.equalsIgnoreCase("startup_preference")) {
            mo119814J7("ENABLE_START_UP", ((CheckBoxPreference) preference).mo6804J());
        } else if (str.equalsIgnoreCase("jank_preference")) {
            mo119814J7("ENABLE_EVIL_METHOD", ((CheckBoxPreference) preference).mo6804J());
        } else if (str.equalsIgnoreCase("anr_preference")) {
            mo119814J7("ENABLE_ANR", ((CheckBoxPreference) preference).mo6804J());
        } else if (str.equalsIgnoreCase("fps_preference")) {
            mo119814J7("ENABLE_FPS", ((CheckBoxPreference) preference).mo6804J());
        } else if (str.equalsIgnoreCase("methodBeat_preference")) {
            mo119814J7("ENABLE_METHOD_BEAT", ((CheckBoxPreference) preference).mo6804J());
        } else if (str.equalsIgnoreCase("make_leak_preference")) {
            ((CheckBoxPreference) preference).mo6804J();
        } else if (str.equalsIgnoreCase("fps_decorator_preference")) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) preference;
            if (!(Build.VERSION.SDK_INT >= 23 ? Settings.canDrawOverlays(this) : true)) {
                startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + getPackageName())), 2);
            } else {
                CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) getPreferenceScreen().mo72519a("fps_preference");
                if (checkBoxPreference.mo6804J()) {
                    checkBoxPreference2.mo6805K(true);
                    mo119814J7("ENABLE_FPS", true);
                }
                mo119814J7("ENABLE_FPS_FLOAT", checkBoxPreference.mo6804J());
            }
        } else if (str.equalsIgnoreCase("trace_dev_log_preference")) {
            mo119814J7("ENABLE_DEV_LOG", ((CheckBoxPreference) preference).mo6804J());
        } else if (str.equalsIgnoreCase("battery_preference")) {
            mo119814J7("ENABLE_BATTERY", ((CheckBoxPreference) preference).mo6804J());
        } else if (str.equalsIgnoreCase("battery_top_preference")) {
            if (((CheckBoxPreference) preference).mo6804J()) {
                C86853a aVar = C86853a.f252120l;
                if (aVar.f252125e != null) {
                    z = true;
                }
                if (!z) {
                    if (aVar.mo121316b(this)) {
                        m106234K7(this, MultiProcessMMKV.getDefault().getInt("matrix_top_thread_interval", 1));
                    } else if (!aVar.mo121316b(this) && Build.VERSION.SDK_INT >= 23) {
                        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + getPackageName()));
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar2.mo10233c(3);
                        aVar2.mo10233c(intent);
                        C117292a.m165364j(this, aVar2.mo10232b(), "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator", "requestPermission", "(Landroid/content/Context;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                    }
                }
            } else {
                C86853a aVar3 = C86853a.f252120l;
                View view = aVar3.f252125e;
                if (view != null) {
                    if (view != null) {
                        aVar3.f252123c.put(view.hashCode(), false);
                    }
                    aVar3.mo121317c();
                }
            }
        } else if (str.equalsIgnoreCase("thread_preference")) {
            mo119814J7("ENABLE_THREAD", ((CheckBoxPreference) preference).mo6804J());
        } else if (str.equalsIgnoreCase("battery_stats_ui")) {
            if (m106233H7()) {
                Intent intent2 = new Intent(this, MMBatteryStatsActivity.class);
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(intent2);
                C117292a.m165358d(this, aVar4.mo10232b(), "com/tencent/mm/ui/matrix/MatrixSettingUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar4.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/ui/matrix/MatrixSettingUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        } else if (str.equalsIgnoreCase("dump_memory")) {
            if (C38993b.m41995e("clicfg_matrix_setting_show_dump_memory_entry", true) || BuildInfo.DEBUG || WeChatEnvironment.hasDebugger()) {
                Log.m105918d("Matrix.SettingUI", "dump_memory");
                Intent intent3 = new Intent(this, MatrixMemoryInfoUI.class);
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(intent3);
                C117292a.m165358d(this, aVar5.mo10232b(), "com/tencent/mm/ui/matrix/MatrixSettingUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar5.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/ui/matrix/MatrixSettingUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        return true;
    }

    public void onStart() {
        TextView textView;
        super.onStart();
        boolean z = false;
        if (mo119813I7()) {
            addIconOptionMenu(0, C0966R.C0969drawable.f357091bt3, new C8361d(this));
        }
        getPreferenceScreen().mo72529n("thread_preference", true);
        getPreferenceScreen().mo72529n("methodBeat_preference", !f250268g);
        getPreferenceScreen().mo72529n("make_leak_preference", !f250268g);
        getPreferenceScreen().mo72529n("matrix_dev_wording", !f250268g);
        getPreferenceScreen().mo72529n("trace_dev_log_preference", !f250268g);
        C88146a aVar = (C88146a) C91441c.m114730d().mo125377a(C88146a.class);
        C113173i iVar = (C113173i) C91441c.m114730d().mo125377a(C113173i.class);
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) getPreferenceScreen().mo72519a("anr_preference");
        checkBoxPreference.mo69932y(f250268g && aVar != null);
        checkBoxPreference.mo6805K(true);
        CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) getPreferenceScreen().mo72519a("startup_preference");
        checkBoxPreference2.mo69932y(mo119813I7() && aVar != null);
        if (aVar == null) {
            checkBoxPreference2.mo6805K(false);
        } else {
            C89957f fVar = aVar.f254917j;
            checkBoxPreference2.mo6805K(fVar != null && fVar.f258529d);
        }
        CheckBoxPreference checkBoxPreference3 = (CheckBoxPreference) getPreferenceScreen().mo72519a("trace_dev_log_preference");
        checkBoxPreference3.mo69932y(mo119813I7() && aVar != null);
        if (aVar == null) {
            checkBoxPreference3.mo6805K(false);
        } else {
            checkBoxPreference3.mo6805K(AppMethodBeat.isDev);
        }
        CheckBoxPreference checkBoxPreference4 = (CheckBoxPreference) getPreferenceScreen().mo72519a("fps_preference");
        checkBoxPreference4.mo69932y(true);
        if (aVar == null) {
            checkBoxPreference4.mo6805K(false);
        } else {
            C89940c cVar = aVar.f254918n;
            Object[] objArr = new Object[1];
            objArr[0] = Boolean.valueOf(cVar != null && cVar.f258529d);
            Log.m105925i("Matrix.SettingUI", "[fps_preference] isEnable=%s", objArr);
            checkBoxPreference4.mo6805K(cVar != null && cVar.f258529d);
        }
        CheckBoxPreference checkBoxPreference5 = (CheckBoxPreference) getPreferenceScreen().mo72519a("fps_decorator_preference");
        checkBoxPreference5.mo69932y(aVar != null);
        if (aVar == null) {
            checkBoxPreference5.mo6805K(false);
        } else {
            C80550a f = C80550a.m98158f(MMApplicationContext.getContext());
            String processName = MMApplicationContext.getProcessName();
            FloatFrameView floatFrameView = f.f235624d;
            if (!(floatFrameView == null || (textView = (TextView) floatFrameView.findViewById(C0966R.C0970id.f357954co3)) == null)) {
                textView.setText(processName);
            }
            f.f235627g = this.f250269d.getInt("ENABLE_FPS_FLOAT", 0) == 1;
            Log.m105924i("Matrix.SettingUI", "decorator is enable=" + f.f235627g);
            checkBoxPreference5.mo6805K(f.f235627g);
            if (f.f235627g && !f.f235623c) {
                if (Build.VERSION.SDK_INT >= 23 ? Settings.canDrawOverlays(this) : true) {
                    Log.m105928w("Matrix.SettingUI", "fallback to show float!");
                    mo119814J7("ENABLE_FPS", true);
                    mo119814J7("ENABLE_FPS_FLOAT", true);
                } else {
                    Log.m105928w("Matrix.SettingUI", "has no permission! fallback to dismiss float!");
                    mo119814J7("ENABLE_FPS_FLOAT", false);
                }
            }
        }
        CheckBoxPreference checkBoxPreference6 = (CheckBoxPreference) getPreferenceScreen().mo72519a("jank_preference");
        checkBoxPreference6.mo69932y(aVar != null);
        if (aVar == null) {
            checkBoxPreference6.mo6805K(false);
        } else {
            C89938b bVar = aVar.f254916i;
            checkBoxPreference6.mo6805K(bVar != null && bVar.f258529d);
        }
        CheckBoxPreference checkBoxPreference7 = (CheckBoxPreference) getPreferenceScreen().mo72519a("battery_preference");
        checkBoxPreference7.mo69932y(mo119813I7() && iVar != null);
        if (iVar == null) {
            checkBoxPreference7.mo6805K(false);
        } else {
            checkBoxPreference7.mo6805K(iVar.f261039g == 2);
        }
        CheckBoxPreference checkBoxPreference8 = (CheckBoxPreference) getPreferenceScreen().mo72519a("methodBeat_preference");
        if (aVar != null) {
            checkBoxPreference8.mo6805K(AppMethodBeat.getInstance().isAlive());
            ((CheckBoxPreference) getPreferenceScreen().mo72519a("trace_dev_log_preference")).mo6805K(aVar.f254915h.f255604i);
        }
        CheckBoxPreference checkBoxPreference9 = (CheckBoxPreference) getPreferenceScreen().mo72519a("battery_top_preference");
        if (iVar == null) {
            checkBoxPreference9.mo69932y(false);
            checkBoxPreference9.mo6805K(false);
        } else {
            checkBoxPreference9.mo69932y(C79691a.m96804a(C86507b.class) != null);
            if (C86853a.f252120l.f252125e != null) {
                z = true;
            }
            checkBoxPreference9.mo6805K(z);
        }
        getPreferenceScreen().notifyDataSetChanged();
    }
}
