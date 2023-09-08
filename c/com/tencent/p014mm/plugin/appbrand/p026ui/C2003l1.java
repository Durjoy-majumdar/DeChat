package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.res.Configuration;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C7007c1;
import com.tencent.p014mm.plugin.appbrand.utils.C2035e1;
import com.tencent.p014mm.protocal.protobuf.RelievedBuyInfo;
import com.tencent.p014mm.protocal.protobuf.RelievedBuySubInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import lb0.C88394b;
import rx3.C13597a0;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.l1 */
public final class C2003l1 extends UIComponent implements View.OnClickListener {

    /* renamed from: d */
    public C2018q4 f11937d;

    /* renamed from: e */
    public FrameLayout f11938e;

    /* renamed from: f */
    public View f11939f;

    /* renamed from: g */
    public final C13601g f11940g;

    /* renamed from: h */
    public View f11941h;

    /* renamed from: i */
    public final C13601g f11942i;

    /* renamed from: j */
    public final C13601g f11943j;

    /* renamed from: n */
    public final C13601g f11944n;

    /* renamed from: o */
    public C1987f1 f11945o;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.l1$a */
    public static final class C2004a {

        /* renamed from: a */
        public final int f11946a;

        /* renamed from: b */
        public final RelievedBuyInfo f11947b;

        public C2004a(int i, RelievedBuyInfo relievedBuyInfo) {
            C87412m.m108594g(relievedBuyInfo, "relievedBuyInfo");
            this.f11946a = i;
            this.f11947b = relievedBuyInfo;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.l1$b */
    public static final class C2005b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C2003l1 f11948d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2005b(C2003l1 l1Var) {
            super(0);
            this.f11948d = l1Var;
        }

        public Object invoke() {
            return (TextView) this.f11948d.mo1922e3().findViewById(C0966R.C0970id.m64);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.l1$c */
    public static final class C2006c extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C2003l1 f11949d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2006c(C2003l1 l1Var) {
            super(0);
            this.f11949d = l1Var;
        }

        public Object invoke() {
            return (ImageView) this.f11949d.mo1922e3().findViewById(C0966R.C0970id.f358976m63);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.l1$d */
    public static final class C2007d extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C2003l1 f11950d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2007d(C2003l1 l1Var) {
            super(0);
            this.f11950d = l1Var;
        }

        public Object invoke() {
            return (TextView) this.f11950d.mo1922e3().findViewById(C0966R.C0970id.i6p);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.l1$e */
    public static final class C2008e extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C2003l1 f11951d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2008e(C2003l1 l1Var) {
            super(0);
            this.f11951d = l1Var;
        }

        public Object invoke() {
            return (TextView) this.f11951d.mo1923f3().findViewById(C0966R.C0970id.i6s);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2003l1(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C13602i iVar = C13602i.NONE;
        this.f11940g = C36568h.m40986b(iVar, new C2008e(this));
        this.f11942i = C36568h.m40986b(iVar, new C2006c(this));
        this.f11943j = C36568h.m40986b(iVar, new C2005b(this));
        this.f11944n = C36568h.m40986b(iVar, new C2007d(this));
    }

    /* renamed from: c3 */
    public final FrameLayout mo1920c3() {
        FrameLayout frameLayout;
        FrameLayout frameLayout2 = this.f11938e;
        if (frameLayout2 != null) {
            return frameLayout2;
        }
        try {
            frameLayout = (FrameLayout) getRootView().findViewById(C0966R.C0970id.i6r);
        } catch (C13597a0 unused) {
            frameLayout = null;
        }
        this.f11938e = frameLayout;
        return frameLayout;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x006d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c9  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1921d3(int r27, com.tencent.p014mm.protocal.protobuf.RelievedBuyInfo r28) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            java.lang.Class<h81.h> r3 = h81.C32735h.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            h81.h r3 = (h81.C32735h) r3
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            if (r3 == 0) goto L_0x001c
            h81.h$c r6 = h81.C32735h.C32737c.relievedbuy
            int r3 = r3.mo58779Qe(r6, r4)
            goto L_0x001d
        L_0x001c:
            r3 = 0
        L_0x001d:
            r6 = 1
            if (r1 > 0) goto L_0x0021
            goto L_0x002c
        L_0x0021:
            r7 = r1 & 1
            int r8 = r1 >> 1
            r8 = r8 & r6
            if (r7 != r6) goto L_0x002c
            if (r8 != r6) goto L_0x002c
            r7 = 1
            goto L_0x002d
        L_0x002c:
            r7 = 0
        L_0x002d:
            if (r6 != r3) goto L_0x0033
            if (r7 == 0) goto L_0x0033
            r3 = 1
            goto L_0x0034
        L_0x0033:
            r3 = 0
        L_0x0034:
            r7 = 0
            java.lang.String r8 = "MicroMsg.AppBrand.AppBrandProfileRelievedBuyUIC"
            if (r3 != 0) goto L_0x0040
            java.lang.String r2 = "isNeedExposeRelievedBuy, can not expose relievedBuy"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
            goto L_0x00a8
        L_0x0040:
            if (r2 != 0) goto L_0x0048
            java.lang.String r2 = "isNeedExposeRelievedBuy, relievedBuyInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r2)
            goto L_0x00a8
        L_0x0048:
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.RelievedBuySubInfo> r3 = r2.sub_info
            if (r3 == 0) goto L_0x0055
            boolean r9 = r3.isEmpty()
            if (r9 == 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r9 = 0
            goto L_0x0056
        L_0x0055:
            r9 = 1
        L_0x0056:
            if (r9 == 0) goto L_0x005e
            java.lang.String r2 = "isNeedExposeRelievedBuy, subInfoList is empty, why?"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r2)
            goto L_0x00a8
        L_0x005e:
            java.lang.String r9 = "subInfoList"
            gy3.C87412m.m108593f(r3, r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x006d:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L_0x009d
            java.lang.Object r10 = r3.next()
            com.tencent.mm.protocal.protobuf.RelievedBuySubInfo r10 = (com.tencent.p014mm.protocal.protobuf.RelievedBuySubInfo) r10
            if (r10 != 0) goto L_0x0081
            java.lang.String r10 = "isNeedExposeRelievedBuy, subInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r10)
            goto L_0x0096
        L_0x0081:
            java.lang.String r10 = r10.title
            if (r10 == 0) goto L_0x008e
            int r11 = r10.length()
            if (r11 != 0) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            r11 = 0
            goto L_0x008f
        L_0x008e:
            r11 = 1
        L_0x008f:
            if (r11 == 0) goto L_0x0097
            java.lang.String r10 = "isNeedExposeRelievedBuy, title is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r10)
        L_0x0096:
            r10 = r7
        L_0x0097:
            if (r10 == 0) goto L_0x006d
            r9.add(r10)
            goto L_0x006d
        L_0x009d:
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L_0x00ac
            java.lang.String r2 = "isNeedExposeRelievedBuy, subTypeTitles is empty, why?"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r2)
        L_0x00a8:
            r2 = r7
            r3 = r2
            r9 = 0
            goto L_0x00ba
        L_0x00ac:
            java.lang.String[] r3 = new java.lang.String[r4]
            java.lang.Object[] r3 = r9.toArray(r3)
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            gy3.C87412m.m108592e(r3, r9)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r9 = 1
        L_0x00ba:
            r10 = 8
            if (r9 != 0) goto L_0x00c9
            android.widget.FrameLayout r1 = r26.mo1920c3()
            if (r1 != 0) goto L_0x00c5
            goto L_0x00c8
        L_0x00c5:
            r1.setVisibility(r10)
        L_0x00c8:
            return
        L_0x00c9:
            gy3.C87412m.m108591d(r2)
            gy3.C87412m.m108591d(r3)
            android.widget.FrameLayout r9 = r26.mo1920c3()
            if (r9 != 0) goto L_0x00d6
            goto L_0x00d9
        L_0x00d6:
            r9.setVisibility(r4)
        L_0x00d9:
            android.widget.FrameLayout r9 = r26.mo1920c3()
            if (r9 == 0) goto L_0x00ea
            r11 = 2131297169(0x7f090391, float:1.8212275E38)
            com.tencent.mm.plugin.appbrand.ui.l1$a r12 = new com.tencent.mm.plugin.appbrand.ui.l1$a
            r12.<init>(r1, r2)
            r9.setTag(r11, r12)
        L_0x00ea:
            int r1 = r2.show_flag
            if (r6 != r1) goto L_0x025b
            java.lang.String r1 = "configureFullLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            android.view.View r1 = r26.mo1922e3()
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            r9.mo10233c(r5)
            java.lang.Object[] r12 = r9.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileRelievedBuyUIC"
            java.lang.String r14 = "configureFullLayout"
            java.lang.String r15 = "(Lcom/tencent/mm/protocal/protobuf/RelievedBuyInfo;[Ljava/lang/String;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r5 = r9.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.setVisibility(r5)
            java.lang.String r12 = "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileRelievedBuyUIC"
            java.lang.String r13 = "configureFullLayout"
            java.lang.String r14 = "(Lcom/tencent/mm/protocal/protobuf/RelievedBuyInfo;[Ljava/lang/String;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            android.view.View r5 = r0.f11939f
            if (r5 != 0) goto L_0x0138
            goto L_0x0177
        L_0x0138:
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r9.mo10233c(r11)
            java.lang.Object[] r19 = r9.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileRelievedBuyUIC"
            java.lang.String r21 = "configureFullLayout"
            java.lang.String r22 = "(Lcom/tencent/mm/protocal/protobuf/RelievedBuyInfo;[Ljava/lang/String;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r5
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r9 = r9.mo10231a(r4)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r5.setVisibility(r9)
            java.lang.String r19 = "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileRelievedBuyUIC"
            java.lang.String r20 = "configureFullLayout"
            java.lang.String r21 = "(Lcom/tencent/mm/protocal/protobuf/RelievedBuyInfo;[Ljava/lang/String;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
        L_0x0177:
            r1.setOnClickListener(r0)
            com.tencent.p014mm.p136ui.tools.C7007c1.m7256a(r1)
            rx3.g r5 = r0.f11942i
            java.lang.Object r5 = r5.getValue()
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            if (r5 == 0) goto L_0x01ee
            int r9 = r2.icon_width
            if (r9 <= 0) goto L_0x01dd
            int r9 = r2.icon_height
            if (r9 <= 0) goto L_0x01dd
            android.view.ViewGroup$LayoutParams r9 = r5.getLayoutParams()
            int r11 = r2.icon_width
            float r11 = (float) r11
            int r12 = r2.icon_height
            float r12 = (float) r12
            float r11 = r11 / r12
            int r12 = r9.height
            float r12 = (float) r12
            float r11 = r11 * r12
            int r11 = (int) r11
            r9.width = r11
            r5.setLayoutParams(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "configureFullLayout, width: "
            r9.append(r11)
            android.view.ViewGroup$LayoutParams r11 = r5.getLayoutParams()
            if (r11 == 0) goto L_0x01bc
            int r11 = r11.width
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x01bd
        L_0x01bc:
            r11 = r7
        L_0x01bd:
            r9.append(r11)
            java.lang.String r11 = ", height: "
            r9.append(r11)
            android.view.ViewGroup$LayoutParams r11 = r5.getLayoutParams()
            if (r11 == 0) goto L_0x01d2
            int r11 = r11.height
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x01d3
        L_0x01d2:
            r11 = r7
        L_0x01d3:
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
        L_0x01dd:
            java.lang.String r9 = r2.icon_url
            if (r9 != 0) goto L_0x01e2
            goto L_0x01ee
        L_0x01e2:
            java.lang.String r11 = lb0.C88394b.f255384g
            lb0.b r11 = lb0.C88394b.C88418q.f255427a
            com.tencent.mm.plugin.appbrand.utils.e1 r12 = new com.tencent.mm.plugin.appbrand.utils.e1
            r12.<init>(r9, r5)
            r11.mo122796o(r12, r9, r7)
        L_0x01ee:
            rx3.g r5 = r0.f11943j
            java.lang.Object r5 = r5.getValue()
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x0240
            java.lang.String r7 = r2.icon_desc
            if (r7 == 0) goto L_0x0205
            int r9 = r7.length()
            if (r9 != 0) goto L_0x0203
            goto L_0x0205
        L_0x0203:
            r9 = 0
            goto L_0x0206
        L_0x0205:
            r9 = 1
        L_0x0206:
            if (r9 != 0) goto L_0x023d
            r5.setVisibility(r4)
            r5.setText(r7)
            java.lang.String r2 = r2.icon_desc_color
            if (r2 == 0) goto L_0x0240
            int r7 = r2.length()
            if (r7 <= 0) goto L_0x0219
            r4 = 1
        L_0x0219:
            if (r4 == 0) goto L_0x0240
            int r4 = android.graphics.Color.parseColor(r2)     // Catch:{ IllegalArgumentException -> 0x0223 }
            r5.setTextColor(r4)     // Catch:{ IllegalArgumentException -> 0x0223 }
            goto L_0x0240
        L_0x0223:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "invalid color "
            r4.append(r5)
            r4.append(r2)
            r2 = 93
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r2)
            goto L_0x0240
        L_0x023d:
            r5.setVisibility(r10)
        L_0x0240:
            rx3.g r2 = r0.f11944n
            java.lang.Object r2 = r2.getValue()
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 != 0) goto L_0x0251
            java.lang.String r1 = "configureFullLayout, fullInfoTextView is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r1)
            goto L_0x031e
        L_0x0251:
            com.tencent.mm.plugin.appbrand.ui.m1 r4 = new com.tencent.mm.plugin.appbrand.ui.m1
            r4.<init>(r2, r0, r3)
            r1.post(r4)
            goto L_0x031e
        L_0x025b:
            java.lang.String r1 = "configureLiteLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            android.view.View r1 = r26.mo1923f3()
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r2.mo10233c(r5)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileRelievedBuyUIC"
            java.lang.String r14 = "configureLiteLayout"
            java.lang.String r15 = "([Ljava/lang/String;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileRelievedBuyUIC"
            java.lang.String r13 = "configureLiteLayout"
            java.lang.String r14 = "([Ljava/lang/String;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            android.view.View r2 = r0.f11941h
            if (r2 != 0) goto L_0x02a5
            goto L_0x02e4
        L_0x02a5:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            r5.mo10233c(r6)
            java.lang.Object[] r19 = r5.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileRelievedBuyUIC"
            java.lang.String r21 = "configureLiteLayout"
            java.lang.String r22 = "([Ljava/lang/String;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r2
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r5 = r5.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.setVisibility(r5)
            java.lang.String r19 = "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileRelievedBuyUIC"
            java.lang.String r20 = "configureLiteLayout"
            java.lang.String r21 = "([Ljava/lang/String;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
        L_0x02e4:
            r1.setOnClickListener(r0)
            com.tencent.p014mm.p136ui.tools.C7007c1.m7256a(r1)
            rx3.g r2 = r0.f11940g
            java.lang.Object r2 = r2.getValue()
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 != 0) goto L_0x02fa
            java.lang.String r1 = "configureLiteLayout, liteInfoTextView is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r1)
            goto L_0x031e
        L_0x02fa:
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            boolean r6 = r5 instanceof android.widget.LinearLayout.LayoutParams
            if (r6 == 0) goto L_0x0305
            r7 = r5
            android.widget.LinearLayout$LayoutParams r7 = (android.widget.LinearLayout.LayoutParams) r7
        L_0x0305:
            if (r7 != 0) goto L_0x030d
            java.lang.String r1 = "configureLiteLayout, liteInfoLayoutParams is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r1)
            goto L_0x031e
        L_0x030d:
            r7.width = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r7.weight = r4
            r2.setLayoutParams(r7)
            com.tencent.mm.plugin.appbrand.ui.n1 r4 = new com.tencent.mm.plugin.appbrand.ui.n1
            r4.<init>(r2, r0, r3, r7)
            r1.post(r4)
        L_0x031e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.C2003l1.mo1921d3(int, com.tencent.mm.protocal.protobuf.RelievedBuyInfo):void");
    }

    /* renamed from: e3 */
    public final View mo1922e3() {
        View view = this.f11941h;
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f6441ey, mo1920c3(), false);
            FrameLayout c3 = mo1920c3();
            if (c3 != null) {
                c3.addView(view);
            }
            this.f11941h = view;
        }
        C87412m.m108591d(view);
        return view;
    }

    /* renamed from: f3 */
    public final View mo1923f3() {
        View view = this.f11939f;
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f6444f1, mo1920c3(), false);
            FrameLayout c3 = mo1920c3();
            if (c3 != null) {
                c3.addView(view);
            }
            this.f11939f = view;
        }
        C87412m.m108591d(view);
        return view;
    }

    /* renamed from: g3 */
    public final void mo1924g3(RelievedBuyInfo relievedBuyInfo) {
        C1987f1 f1Var = this.f11945o;
        if (f1Var == null) {
            f1Var = new C1987f1(getContext());
            this.f11945o = f1Var;
        }
        C87412m.m108594g(relievedBuyInfo, "relievedBuyInfo");
        Log.m105924i(f1Var.f11902b, "attachRelievedBuyInfo");
        if (C87412m.m108589b(f1Var.f11911k, relievedBuyInfo)) {
            Log.m105924i(f1Var.f11902b, "attachRelievedBuyInfo, already attached");
        } else {
            f1Var.f11911k = relievedBuyInfo;
            boolean z = true;
            if (1 == relievedBuyInfo.show_flag) {
                LinearLayout linearLayout = f1Var.f11904d;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                TextView textView = f1Var.f11907g;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = f1Var.f11905e;
                if (imageView != null) {
                    if (relievedBuyInfo.bottom_sheet_icon_width > 0 && relievedBuyInfo.bottom_sheet_icon_height > 0) {
                        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                        layoutParams.width = (int) ((((float) relievedBuyInfo.bottom_sheet_icon_width) / ((float) relievedBuyInfo.bottom_sheet_icon_height)) * ((float) layoutParams.height));
                        imageView.setLayoutParams(layoutParams);
                        StringBuilder sb = new StringBuilder();
                        sb.append("attachRelievedBuyInfo, width: ");
                        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                        sb.append(layoutParams2 != null ? Integer.valueOf(layoutParams2.width) : null);
                        sb.append(", height: ");
                        ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
                        sb.append(layoutParams3 != null ? Integer.valueOf(layoutParams3.height) : null);
                        Log.m105924i("MicroMsg.AppBrand.AppBrandProfileRelievedBuyHalfScreenComponent", sb.toString());
                    }
                    String str = relievedBuyInfo.bottom_sheet_icon_url;
                    if (str != null) {
                        String str2 = C88394b.f255384g;
                        C88394b.C88418q.f255427a.mo122796o(new C2035e1(str, imageView), str, (C88394b.C88408j) null);
                    }
                }
                TextView textView2 = f1Var.f11906f;
                if (textView2 != null) {
                    String str3 = relievedBuyInfo.bottom_sheet_icon_desc;
                    if (!(str3 == null || str3.length() == 0)) {
                        textView2.setVisibility(0);
                        textView2.setText(str3);
                        String str4 = relievedBuyInfo.bottom_sheet_icon_desc_color;
                        if (str4 != null) {
                            if (str4.length() > 0) {
                                try {
                                    textView2.setTextColor(Color.parseColor(str4));
                                } catch (IllegalArgumentException unused) {
                                    Log.m105928w("MicroMsg.AppBrand.AppBrandProfileRelievedBuyHalfScreenComponent", "invalid color " + str4 + ']');
                                }
                            }
                        }
                    } else {
                        textView2.setVisibility(8);
                    }
                }
            } else {
                LinearLayout linearLayout2 = f1Var.f11904d;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                TextView textView3 = f1Var.f11907g;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
            }
            TextView textView4 = f1Var.f11908h;
            if (textView4 != null) {
                textView4.setText(relievedBuyInfo.subtitle);
            }
            String str5 = relievedBuyInfo.click_wording;
            if (!(str5 == null || str5.length() == 0)) {
                z = false;
            }
            if (!z) {
                TextView textView5 = f1Var.f11909i;
                if (textView5 != null) {
                    textView5.setVisibility(0);
                }
                TextView textView6 = f1Var.f11909i;
                if (textView6 != null) {
                    textView6.setText(str5);
                }
                C7007c1.m7256a(f1Var.f11909i);
                TextView textView7 = f1Var.f11909i;
                if (textView7 != null) {
                    textView7.setOnClickListener(new C2002k1(f1Var, relievedBuyInfo));
                }
            } else {
                TextView textView8 = f1Var.f11909i;
                if (textView8 != null) {
                    textView8.setVisibility(8);
                }
            }
            C1995i1 i1Var = f1Var.f11910j;
            LinkedList<RelievedBuySubInfo> linkedList = relievedBuyInfo.sub_info;
            C87412m.m108593f(linkedList, "relievedBuyInfo.sub_info");
            i1Var.getClass();
            i1Var.f11919f = linkedList;
            i1Var.notifyDataSetChanged();
        }
        Log.m105924i(f1Var.f11902b, "show");
        f1Var.f11903c.show();
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/AppBrandProfileRelievedBuyUIC", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.AppBrand.AppBrandProfileRelievedBuyUIC", "onClick");
        C2018q4 q4Var = this.f11937d;
        if (q4Var != null) {
            AppBrandProfileUI appBrandProfileUI = ((C2024v1) q4Var).f11972a;
            int i = AppBrandProfileUI.f246424V;
            appBrandProfileUI.mo117090L7(28, 1);
        }
        FrameLayout c3 = mo1920c3();
        C2004a aVar = null;
        Object tag = c3 != null ? c3.getTag(C0966R.C0970id.f6018v0) : null;
        if (tag instanceof C2004a) {
            aVar = (C2004a) tag;
        }
        if (aVar == null) {
            Log.m105928w("MicroMsg.AppBrand.AppBrandProfileRelievedBuyUIC", "onClick, relievedBuyInfoPack is null");
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileRelievedBuyUIC", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        mo1924g3(aVar.f11947b);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileRelievedBuyUIC", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Log.m105924i("MicroMsg.AppBrand.AppBrandProfileRelievedBuyUIC", "onConfigurationChanged");
        FrameLayout c3 = mo1920c3();
        Object tag = c3 != null ? c3.getTag(C0966R.C0970id.f6018v0) : null;
        C2004a aVar = tag instanceof C2004a ? (C2004a) tag : null;
        if (aVar != null) {
            mo1921d3(aVar.f11946a, aVar.f11947b);
            C1987f1 f1Var = this.f11945o;
            this.f11945o = null;
            boolean z = true;
            if (f1Var == null || true != f1Var.f11903c.isShowing()) {
                z = false;
            }
            if (z) {
                Log.m105924i(f1Var.f11902b, "hide");
                f1Var.f11903c.dismiss();
                mo1924g3(aVar.f11947b);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("MicroMsg.AppBrand.AppBrandProfileRelievedBuyUIC", "onDestroy");
        C1987f1 f1Var = this.f11945o;
        if (f1Var != null) {
            Log.m105924i(f1Var.f11902b, "hide");
            f1Var.f11903c.dismiss();
        }
    }
}
