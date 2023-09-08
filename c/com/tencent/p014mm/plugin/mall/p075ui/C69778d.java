package com.tencent.p014mm.plugin.mall.p075ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.Layout;
import android.text.StaticLayout;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import c63.C67347d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.wallet_core.model.mall.MallNews;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import te3.C64891zq1;
import te3.my4;
import v52.C14411b;

/* renamed from: com.tencent.mm.plugin.mall.ui.d */
public class C69778d extends BaseAdapter {

    /* renamed from: d */
    public List<ArrayList<C69782d>> f201364d = new ArrayList();

    /* renamed from: e */
    public SparseArray<String> f201365e = null;

    /* renamed from: f */
    public C69783e f201366f;

    /* renamed from: g */
    public Context f201367g;

    /* renamed from: h */
    public LayoutInflater f201368h;

    /* renamed from: i */
    public int f201369i;

    /* renamed from: j */
    public boolean f201370j = false;

    /* renamed from: com.tencent.mm.plugin.mall.ui.d$a */
    public class C69779a extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ int f201371g;

        /* renamed from: h */
        public final /* synthetic */ C64891zq1 f201372h;

        public C69779a(int i, C64891zq1 zq12) {
            this.f201371g = i;
            this.f201372h = zq12;
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x00c7  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00c9  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00dd  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x01c5  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2066a(android.view.View r24) {
            /*
                r23 = this;
                r0 = r23
                java.lang.String r1 = "MicroMsg.FunctionListAdapterNew"
                java.lang.String r2 = "on Click"
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r1, r2)
                com.tencent.mm.plugin.mall.ui.d r1 = com.tencent.p014mm.plugin.mall.p075ui.C69778d.this
                com.tencent.mm.plugin.mall.ui.d$e r1 = r1.f201366f
                if (r1 == 0) goto L_0x0341
                int r2 = r0.f201371g
                te3.zq1 r3 = r0.f201372h
                com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2$$d r1 = (com.tencent.p014mm.plugin.mall.p075ui.MallIndexBaseUIv2$$d) r1
                r1.getClass()
                java.lang.String r4 = "MicorMsg.MallIndexBaseUIv2"
                r5 = 0
                r6 = 1
                if (r3 == 0) goto L_0x0332
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                te3.py4 r8 = r3.f186829d
                int r8 = r8.f184923d
                r7.append(r8)
                java.lang.String r8 = ""
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                boolean r7 = c63.C67345b.C0426a.m369a(r7)
                if (r7 != 0) goto L_0x0043
                java.lang.String r7 = r3.f186834i
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                if (r7 != 0) goto L_0x0043
                r7 = 1
                goto L_0x0044
            L_0x0043:
                r7 = 0
            L_0x0044:
                r11 = 2
                if (r7 == 0) goto L_0x02f9
                java.lang.Object[] r7 = new java.lang.Object[r6]
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                te3.py4 r13 = r3.f186829d
                int r13 = r13.f184923d
                r12.append(r13)
                r12.append(r8)
                java.lang.String r12 = r12.toString()
                r7[r5] = r12
                java.lang.String r12 = "onFunctionItemClick show disclaimer funcId=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r12, r7)
                com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2 r7 = r1.f201200a
                r7.getClass()
                java.lang.Class<h81.h> r12 = h81.C32735h.class
                di3.d r12 = di3.C86312j.m106911c(r12)
                h81.h r12 = (h81.C32735h) r12
                h81.h$c r13 = h81.C32735h.C32737c.clicfg_appbrand_dialog_optimize_switch
                int r12 = r12.mo58779Qe(r13, r6)
                if (r12 != r6) goto L_0x007a
                r12 = 1
                goto L_0x007b
            L_0x007a:
                r12 = 0
            L_0x007b:
                if (r12 != 0) goto L_0x0084
                java.lang.String r7 = "handleFunctionByAppBrand clicfg_appbrand_dialog_optimize_switch close"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
                goto L_0x02b2
            L_0x0084:
                te3.oy4 r12 = r3.f186831f
                if (r12 != 0) goto L_0x0093
                int r12 = r12.f184722g
                if (r12 == r11) goto L_0x0093
                java.lang.String r7 = "functionItem.Entrance == null"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
                goto L_0x02b2
            L_0x0093:
                if (r2 < 0) goto L_0x018b
                te3.my4 r12 = r3.f186830e
                r15 = 4294967295(0xffffffff, double:2.1219957905E-314)
                if (r12 == 0) goto L_0x00c2
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                te3.my4 r13 = r3.f186830e
                int r13 = r13.f184407d
                r12.append(r13)
                r12.append(r8)
                java.lang.String r12 = r12.toString()
                boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
                if (r12 != 0) goto L_0x00c2
                te3.my4 r12 = r3.f186830e
                int r12 = r12.f184407d
                long r12 = (long) r12
                long r12 = r12 & r15
                java.lang.String r12 = java.lang.Long.toString(r12)
                goto L_0x00c3
            L_0x00c2:
                r12 = r8
            L_0x00c3:
                java.util.ArrayList<te3.zq1> r13 = r7.f201190n
                if (r13 != 0) goto L_0x00c9
                r13 = 0
                goto L_0x00cd
            L_0x00c9:
                int r13 = r13.size()
            L_0x00cd:
                boolean r17 = com.tencent.p014mm.plugin.mall.p075ui.C69778d.m82214b(r3)
                int r14 = r7.f201193q
                android.util.SparseArray r14 = c63.C67345b.m79689c(r14)
                int r18 = r14.size()
                if (r18 == 0) goto L_0x018b
                int r9 = r3.f186836n
                r19 = r7
                long r6 = (long) r9
                java.lang.Object r9 = r14.get(r9)
                java.util.ArrayList r9 = (java.util.ArrayList) r9
                int r14 = r9.size()
                r10 = 0
            L_0x00ed:
                int r15 = r9.size()
                if (r10 >= r15) goto L_0x010f
                java.lang.Object r15 = r9.get(r10)
                java.lang.Integer r15 = (java.lang.Integer) r15
                if (r15 != 0) goto L_0x00fc
                goto L_0x010b
            L_0x00fc:
                te3.py4 r5 = r3.f186829d
                int r5 = r5.f184923d
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                int r5 = r15.compareTo(r5)
                if (r5 != 0) goto L_0x010b
                goto L_0x0110
            L_0x010b:
                int r10 = r10 + 1
                r5 = 0
                goto L_0x00ed
            L_0x010f:
                r10 = 0
            L_0x0110:
                java.lang.Object[] r5 = new java.lang.Object[r11]
                r9 = 0
                r5[r9] = r12
                te3.py4 r9 = r3.f186829d
                int r9 = r9.f184923d
                r22 = r12
                long r11 = (long) r9
                r20 = 4294967295(0xffffffff, double:2.1219957905E-314)
                long r11 = r11 & r20
                java.lang.String r9 = java.lang.Long.toString(r11)
                r11 = 1
                r5[r11] = r9
                java.lang.String r9 = "click report activityId:%s,FunctionID：%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r9, r5)
                com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r9 = 10
                java.lang.Object[] r9 = new java.lang.Object[r9]
                te3.py4 r11 = r3.f186829d
                int r11 = r11.f184923d
                long r11 = (long) r11
                long r11 = r11 & r20
                java.lang.String r11 = java.lang.Long.toString(r11)
                r12 = 0
                r9[r12] = r11
                java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
                r13 = 1
                r9[r13] = r11
                java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
                r12 = 2
                r9[r12] = r11
                java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
                r13 = 3
                r9[r13] = r11
                r11 = 4
                r9[r11] = r22
                r11 = 5
                if (r17 == 0) goto L_0x0160
                r13 = 2
                goto L_0x0161
            L_0x0160:
                r13 = 1
            L_0x0161:
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r9[r11] = r13
                r11 = 6
                java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
                r9[r11] = r13
                r11 = 7
                java.lang.Long r6 = java.lang.Long.valueOf(r6)
                r9[r11] = r6
                r6 = 8
                java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
                r9[r6] = r7
                r6 = 9
                java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
                r9[r6] = r7
                r6 = 10881(0x2a81, float:1.5248E-41)
                r5.mo160131h(r6, r9)
                goto L_0x018d
            L_0x018b:
                r19 = r7
            L_0x018d:
                c63.c r5 = c63.C67346c.m79699b()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                te3.py4 r7 = r3.f186829d
                int r7 = r7.f184923d
                r6.append(r7)
                r6.append(r8)
                java.lang.String r6 = r6.toString()
                r5.mo91481f(r6)
                c63.d r5 = c63.C67347d.m79705b()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                te3.py4 r7 = r3.f186829d
                int r7 = r7.f184923d
                r6.append(r7)
                r6.append(r8)
                java.lang.String r6 = r6.toString()
                r5.mo91485d(r6)
                te3.my4 r5 = r3.f186830e
                if (r5 == 0) goto L_0x0208
                com.tencent.mm.plugin.wallet_core.model.mall.MallFunction r5 = new com.tencent.mm.plugin.wallet_core.model.mall.MallFunction
                r5.<init>()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                te3.py4 r7 = r3.f186829d
                int r7 = r7.f184923d
                r6.append(r7)
                r6.append(r8)
                java.lang.String r6 = r6.toString()
                r5.f209731d = r6
                te3.py4 r7 = r3.f186829d
                java.lang.String r7 = r7.f184924e
                r5.f209732e = r7
                com.tencent.mm.plugin.wallet_core.model.mall.MallNews r7 = new com.tencent.mm.plugin.wallet_core.model.mall.MallNews
                r7.<init>((java.lang.String) r6)
                r5.f209739o = r7
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                te3.my4 r9 = r3.f186830e
                int r9 = r9.f184407d
                r6.append(r9)
                r6.append(r8)
                java.lang.String r6 = r6.toString()
                r7.f209746g = r6
                c63.c r6 = c63.C67346c.m79699b()
                r6.mo91480d(r5)
            L_0x0208:
                r5 = 3
                java.lang.Object[] r6 = new java.lang.Object[r5]
                te3.py4 r5 = r3.f186829d
                int r5 = r5.f184923d
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r7 = 0
                r6[r7] = r5
                te3.py4 r5 = r3.f186829d
                java.lang.String r5 = r5.f184924e
                r7 = 1
                r6[r7] = r5
                te3.oy4 r5 = r3.f186831f
                int r5 = r5.f184722g
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r7 = 2
                r6[r7] = r5
                java.lang.String r5 = "handleFunctionNew id：%s，name：%s，type：%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r6)
                r5 = 3
                java.lang.Object[] r6 = new java.lang.Object[r5]
                te3.oy4 r5 = r3.f186831f
                te3.bz4 r5 = r5.f184721f
                java.lang.String r7 = r5.f182349d
                r9 = 0
                r6[r9] = r7
                java.lang.String r7 = r5.f182350e
                r9 = 1
                r6[r9] = r7
                int r5 = r5.f182351f
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r7 = 2
                r6[r7] = r5
                java.lang.String r5 = "handleFunctionNew functionItem.Entrance.URLWeApp.username：%s,functionItem.Entrance.URLWeApp.pagepath:%s,functionItem.Entrance.URLWeApp.version:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r6)
                di0.o r5 = new di0.o
                r5.<init>()
                te3.oy4 r6 = r3.f186831f
                te3.bz4 r6 = r6.f184721f
                java.lang.String r7 = r6.f182349d
                r5.f250929a = r7
                int r7 = r6.f182351f
                r5.f250932d = r7
                java.lang.String r6 = r6.f182350e
                r5.f250934f = r6
                r6 = 0
                r5.f250931c = r6
                r6 = 1019(0x3fb, float:1.428E-42)
                r5.f250939k = r6
                r6 = r19
                r7 = 2131832762(0x7f112fba, float:1.9298587E38)
                java.lang.String r9 = r6.getString(r7)
                r7 = 2131821556(0x7f1103f4, float:1.9275859E38)
                java.lang.String r10 = r6.getString(r7)
                com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle r7 = new com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle
                r7.<init>()
                r11 = 2
                r7.f157919d = r11
                r7.f157921f = r9
                java.lang.String r9 = r3.f186834i
                r7.f157922g = r9
                r7.f157923h = r10
                r9 = 0
                r7.f157924i = r9
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                te3.py4 r10 = r3.f186829d
                int r10 = r10.f184923d
                r9.append(r10)
                r9.append(r8)
                java.lang.String r8 = r9.toString()
                r7.f157920e = r8
                r5.f250951w = r7
                java.lang.Class<kr0.x0> r7 = kr0.C76630x0.class
                di3.d r7 = di3.C86312j.m106911c(r7)
                kr0.x0 r7 = (kr0.C76630x0) r7
                androidx.appcompat.app.AppCompatActivity r6 = r6.getContext()
                r7.mo106898tv(r6, r5)
                r5 = 1
            L_0x02b2:
                if (r5 != 0) goto L_0x02fe
                com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2 r5 = r1.f201200a
                androidx.appcompat.app.AppCompatActivity r5 = r5.getContext()
                qo3.a r6 = new qo3.a
                r6.<init>()
                com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2 r7 = r1.f201200a
                r8 = 2131832762(0x7f112fba, float:1.9298587E38)
                java.lang.String r7 = r7.getString(r8)
                com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2 r8 = r1.f201200a
                r9 = 2131821556(0x7f1103f4, float:1.9275859E38)
                java.lang.String r8 = r8.getString(r9)
                r6.f225644a = r7
                java.lang.String r7 = r3.f186834i
                r6.f225660q = r7
                r6.f225663t = r8
                com.tencent.mm.plugin.mall.ui.l r7 = new com.tencent.mm.plugin.mall.ui.l
                r7.<init>(r1, r3, r2)
                r6.f225620C = r7
                r2 = 1
                r6.f225668y = r2
                com.tencent.mm.plugin.mall.ui.m r2 = new com.tencent.mm.plugin.mall.ui.m
                r2.<init>(r1, r3)
                r6.f225622E = r2
                qo3.g r2 = new qo3.g
                r7 = 2131887328(0x7f1204e0, float:1.940926E38)
                r2.<init>(r5, r7)
                r2.mo107525e(r6)
                r2.show()
                goto L_0x02fe
            L_0x02f9:
                com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2 r5 = r1.f201200a
                com.tencent.p014mm.plugin.mall.p075ui.MallIndexBaseUIv2.m82089I7(r5, r3, r2)
            L_0x02fe:
                r2 = 1
                java.lang.Object[] r5 = new java.lang.Object[r2]
                int r2 = r3.f186836n
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r6 = 0
                r5[r6] = r2
                java.lang.String r2 = "type: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r2, r5)
                com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r4 = 14419(0x3853, float:2.0205E-41)
                r5 = 3
                java.lang.Object[] r5 = new java.lang.Object[r5]
                com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2 r1 = r1.f201200a
                java.lang.String r1 = r1.f201188i
                r5[r6] = r1
                r1 = 4
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r7 = 1
                r5[r7] = r1
                int r1 = r3.f186836n
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r3 = 2
                r5[r3] = r1
                r2.mo160131h(r4, r5)
                goto L_0x0341
            L_0x0332:
                r6 = 0
                r7 = 1
                java.lang.Object[] r1 = new java.lang.Object[r7]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1[r6] = r2
                java.lang.String r2 = "onFunctionItemClick functionItem null; pos=%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r2, r1)
            L_0x0341:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.mall.p075ui.C69778d.C69779a.mo2066a(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.d$b */
    public class C69780b {

        /* renamed from: a */
        public View f201374a = null;

        /* renamed from: b */
        public ImageView f201375b = null;

        /* renamed from: c */
        public ImageView f201376c = null;

        /* renamed from: d */
        public TextView f201377d = null;

        /* renamed from: e */
        public TextView f201378e = null;

        /* renamed from: f */
        public String f201379f = null;

        /* renamed from: g */
        public String f201380g = null;

        public C69780b(C69778d dVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.d$c */
    public class C69781c {

        /* renamed from: a */
        public LinearLayout f201381a;

        /* renamed from: b */
        public TextView f201382b;

        /* renamed from: c */
        public View f201383c;

        /* renamed from: d */
        public View f201384d;

        /* renamed from: e */
        public View f201385e;

        public C69781c(C69778d dVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.d$d */
    public class C69782d {

        /* renamed from: a */
        public C64891zq1 f201386a;

        /* renamed from: b */
        public int f201387b;

        public C69782d(C69778d dVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.d$e */
    public interface C69783e {
    }

    public C69778d(Context context, int i) {
        this.f201367g = context;
        this.f201369i = i;
        this.f201368h = LayoutInflater.from(context);
    }

    /* renamed from: b */
    public static boolean m82214b(C64891zq1 zq12) {
        my4 my4 = zq12.f186830e;
        if (my4 == null || my4.f184408e == null || !m82215f(zq12)) {
            return false;
        }
        C67347d b = C67347d.m79705b();
        StringBuilder sb = new StringBuilder();
        sb.append(zq12.f186829d.f184923d);
        sb.append("");
        return b.mo91484c(sb.toString()) != null;
    }

    /* renamed from: f */
    public static boolean m82215f(C64891zq1 zq12) {
        C67347d b = C67347d.m79705b();
        MallNews c = b.mo91484c(zq12.f186829d.f184923d + "");
        if (c != null && !Util.isNullOrNil(c.f209746g)) {
            String str = c.f209746g;
            if (str.equals(zq12.f186830e.f184407d + "")) {
                if (!"0".equals(c.f209743d)) {
                    Log.m105918d("MicroMsg.FunctionListAdapterNew", "still old news or clicked, then should not show");
                    return false;
                }
                Log.m105918d("MicroMsg.FunctionListAdapterNew", "still old news and should show");
                return true;
            }
        }
        Log.m105919d("MicroMsg.FunctionListAdapterNew", "old news null or should be replaced %s %s", Integer.valueOf(zq12.f186830e.f184407d), zq12.f186829d.f184924e);
        MallNews mallNews = new MallNews(zq12.f186829d.f184923d + "");
        mallNews.f209746g = zq12.f186830e.f184407d + "";
        C67347d.m79705b().mo91483a(mallNews);
        return true;
    }

    /* renamed from: a */
    public final void mo95996a(View view, C69782d dVar) {
        if (view != null) {
            C69780b bVar = (C69780b) view.getTag();
            C64891zq1 zq12 = dVar.f201386a;
            int i = dVar.f201387b;
            if (C85875k4.m106211z()) {
                bVar.f201379f = zq12.f186829d.f184925f.f185698e;
            } else {
                bVar.f201379f = zq12.f186829d.f184925f.f185697d;
            }
            C14411b.m13704a(bVar.f201375b, bVar.f201379f, C0966R.raw.mall_index_icon_default);
            bVar.f201377d.setText(zq12.f186829d.f184924e);
            mo95997d(bVar.f201377d, C69770b.f201324e);
            String str = zq12.f186835j;
            if (str != null) {
                bVar.f201378e.setText(str);
                bVar.f201378e.setVisibility(0);
                mo95997d(bVar.f201378e, C69770b.f201324e);
                this.f201370j = true;
            } else {
                bVar.f201378e.setText("");
                bVar.f201378e.setVisibility(8);
            }
            my4 my4 = zq12.f186830e;
            if (my4 == null || my4.f184408e == null || !m82215f(zq12)) {
                bVar.f201376c.setImageBitmap((Bitmap) null);
                bVar.f201376c.setVisibility(8);
            } else {
                if (C85875k4.m106211z()) {
                    bVar.f201380g = zq12.f186830e.f184408e.f185698e;
                } else {
                    bVar.f201380g = zq12.f186830e.f184408e.f185697d;
                }
                C14411b.m13704a(bVar.f201376c, bVar.f201380g, 0);
                bVar.f201376c.setVisibility(0);
                ((RelativeLayout.LayoutParams) bVar.f201376c.getLayoutParams()).setMargins((C69770b.f201324e / 2) - 1, C76577a.m92151b(MMApplicationContext.getContext(), 7), 0, 0);
                int i2 = zq12.f186829d.f184923d;
            }
            View view2 = bVar.f201374a;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "fillFunctionItem", "(Landroid/view/View;Lcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$MallFunctionWrapper;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "fillFunctionItem", "(Landroid/view/View;Lcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$MallFunctionWrapper;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            bVar.f201374a.setOnClickListener(new C69779a(i, zq12));
        }
    }

    /* renamed from: d */
    public final void mo95997d(TextView textView, int i) {
        textView.setMaxEms(new StaticLayout(textView.getText(), textView.getPaint(), i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineEnd(0));
    }

    public int getCount() {
        return ((ArrayList) this.f201364d).size();
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r28, android.view.View r29, android.view.ViewGroup r30) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            if (r29 != 0) goto L_0x0050
            com.tencent.mm.plugin.mall.ui.d$c r4 = new com.tencent.mm.plugin.mall.ui.d$c
            r4.<init>(r0)
            android.view.LayoutInflater r5 = r0.f201368h
            r6 = 2131496426(0x7f0c0dea, float:1.8616417E38)
            r7 = r30
            android.view.View r5 = r5.inflate(r6, r7, r2)
            r6 = 2131308880(0x7f093150, float:1.8236028E38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r4.f201381a = r6
            r6 = 2131308879(0x7f09314f, float:1.8236026E38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r4.f201382b = r6
            r6 = 2131307304(0x7f092b28, float:1.8232832E38)
            android.view.View r6 = r5.findViewById(r6)
            r4.f201383c = r6
            r6 = 2131298214(0x7f0907a6, float:1.8214395E38)
            android.view.View r6 = r5.findViewById(r6)
            r4.f201384d = r6
            r6 = 2131310338(0x7f093702, float:1.8238985E38)
            android.view.View r6 = r5.findViewById(r6)
            r4.f201385e = r6
            r5.setTag(r4)
            goto L_0x0058
        L_0x0050:
            java.lang.Object r4 = r29.getTag()
            com.tencent.mm.plugin.mall.ui.d$c r4 = (com.tencent.p014mm.plugin.mall.p075ui.C69778d.C69781c) r4
            r5 = r29
        L_0x0058:
            android.widget.LinearLayout r6 = r4.f201381a
            r6.setVisibility(r2)
            java.util.List<java.util.ArrayList<com.tencent.mm.plugin.mall.ui.d$d>> r6 = r0.f201364d
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r6 = r6.get(r1)
            java.util.List r6 = (java.util.List) r6
            int r7 = r6.size()
            r8 = 8
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r11 = 1
            if (r7 <= 0) goto L_0x01b6
            java.lang.Object r7 = r6.get(r2)
            com.tencent.mm.plugin.mall.ui.d$d r7 = (com.tencent.p014mm.plugin.mall.p075ui.C69778d.C69782d) r7
            te3.zq1 r7 = r7.f201386a
            int r7 = r7.f186836n
            android.util.SparseArray<java.lang.String> r12 = r0.f201365e
            if (r12 != 0) goto L_0x0084
            r12 = 0
            goto L_0x008a
        L_0x0084:
            java.lang.Object r12 = r12.get(r7)
            java.lang.String r12 = (java.lang.String) r12
        L_0x008a:
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r13 != 0) goto L_0x00e6
            if (r1 != 0) goto L_0x0093
            goto L_0x00bb
        L_0x0093:
            java.util.List<java.util.ArrayList<com.tencent.mm.plugin.mall.ui.d$d>> r13 = r0.f201364d
            int r14 = r1 + -1
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Object r13 = r13.get(r14)
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            int r13 = r13.size()
            if (r13 <= 0) goto L_0x00bd
            java.util.List<java.util.ArrayList<com.tencent.mm.plugin.mall.ui.d$d>> r13 = r0.f201364d
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Object r13 = r13.get(r14)
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Object r13 = r13.get(r2)
            com.tencent.mm.plugin.mall.ui.d$d r13 = (com.tencent.p014mm.plugin.mall.p075ui.C69778d.C69782d) r13
            te3.zq1 r13 = r13.f201386a
            int r13 = r13.f186836n
            if (r7 == r13) goto L_0x00bd
        L_0x00bb:
            r13 = 1
            goto L_0x00be
        L_0x00bd:
            r13 = 0
        L_0x00be:
            java.util.List<java.util.ArrayList<com.tencent.mm.plugin.mall.ui.d$d>> r14 = r0.f201364d
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            int r14 = r14.size()
            int r14 = r14 - r11
            if (r1 != r14) goto L_0x00ca
            goto L_0x00e2
        L_0x00ca:
            java.util.List<java.util.ArrayList<com.tencent.mm.plugin.mall.ui.d$d>> r14 = r0.f201364d
            int r15 = r1 + 1
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            java.lang.Object r14 = r14.get(r15)
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            java.lang.Object r14 = r14.get(r2)
            com.tencent.mm.plugin.mall.ui.d$d r14 = (com.tencent.p014mm.plugin.mall.p075ui.C69778d.C69782d) r14
            te3.zq1 r14 = r14.f201386a
            int r14 = r14.f186836n
            if (r7 == r14) goto L_0x00e4
        L_0x00e2:
            r7 = 1
            goto L_0x00e8
        L_0x00e4:
            r7 = 0
            goto L_0x00e8
        L_0x00e6:
            r7 = 0
            r13 = 0
        L_0x00e8:
            if (r13 == 0) goto L_0x0172
            android.widget.TextView r9 = r4.f201382b
            r9.setText(r12)
            android.widget.TextView r9 = r4.f201382b
            r9.setVisibility(r2)
            android.view.View r9 = r4.f201383c
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            r15.mo10233c(r3)
            java.lang.Object[] r13 = r15.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2"
            java.lang.String r16 = "fillFunctionsLine"
            java.lang.String r17 = "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r12 = r9
            r10 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r10 = r10.mo10231a(r2)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r9.setVisibility(r10)
            java.lang.String r13 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2"
            java.lang.String r14 = "fillFunctionsLine"
            java.lang.String r15 = "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            android.view.View r9 = r4.f201383c
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            android.content.Context r10 = r0.f201367g
            int r10 = kg3.C76577a.m92151b(r10, r8)
            float r10 = (float) r10
            float r12 = com.tencent.p014mm.plugin.mall.p075ui.C69770b.f201327h
            float r10 = r10 * r12
            int r10 = (int) r10
            r9.height = r10
            android.view.View r10 = r4.f201383c
            r10.setLayoutParams(r9)
            android.widget.TextView r9 = r4.f201382b
            android.content.Context r10 = r0.f201367g
            r12 = 48
            int r10 = kg3.C76577a.m92151b(r10, r12)
            float r10 = (float) r10
            float r12 = com.tencent.p014mm.plugin.mall.p075ui.C69770b.f201327h
            float r10 = r10 * r12
            int r10 = (int) r10
            r9.setMinHeight(r10)
            android.view.View r9 = r4.f201383c
            int r10 = com.tencent.p014mm.plugin.mall.p075ui.C69803z.m82223a()
            r9.setBackgroundColor(r10)
            goto L_0x01fa
        L_0x0172:
            android.widget.TextView r10 = r4.f201382b
            r10.setVisibility(r8)
            android.view.View r10 = r4.f201383c
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            r15.mo10233c(r9)
            java.lang.Object[] r13 = r15.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2"
            java.lang.String r9 = "fillFunctionsLine"
            java.lang.String r16 = "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r10
            r11 = r15
            r15 = r9
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r9 = r11.mo10231a(r2)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r10.setVisibility(r9)
            java.lang.String r13 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2"
            java.lang.String r14 = "fillFunctionsLine"
            java.lang.String r15 = "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x01fa
        L_0x01b6:
            android.widget.TextView r7 = r4.f201382b
            r7.setVisibility(r8)
            android.view.View r7 = r4.f201383c
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            r15.mo10233c(r9)
            java.lang.Object[] r11 = r15.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2"
            java.lang.String r13 = "fillFunctionsLine"
            java.lang.String r14 = "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r7
            r8 = r15
            r15 = r9
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r8 = r8.mo10231a(r2)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r7.setVisibility(r8)
            java.lang.String r11 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2"
            java.lang.String r12 = "fillFunctionsLine"
            java.lang.String r13 = "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            r7 = 0
        L_0x01fa:
            android.widget.LinearLayout r8 = r4.f201381a
            r9 = 1
            r8.setFocusable(r9)
            int r9 = com.tencent.p014mm.plugin.mall.p075ui.C69770b.f201322c
            int r9 = r9 / 2
            r8.setPadding(r9, r2, r9, r2)
            r9 = 0
        L_0x0208:
            r10 = 4
            if (r9 >= r10) goto L_0x04a7
            int r11 = r8.getChildCount()
            if (r9 >= r11) goto L_0x02e3
            android.view.View r11 = r8.getChildAt(r9)
            if (r11 == 0) goto L_0x02e3
            android.view.View r11 = r8.getChildAt(r9)
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            r12.mo10233c(r3)
            java.lang.Object[] r20 = r12.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2"
            java.lang.String r22 = "fillFunctionsLine"
            java.lang.String r23 = "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r11
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r12 = r12.mo10231a(r2)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r11.setVisibility(r12)
            java.lang.String r20 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2"
            java.lang.String r21 = "fillFunctionsLine"
            java.lang.String r22 = "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            int r12 = r6.size()
            if (r9 >= r12) goto L_0x0266
            java.lang.Object r12 = r6.get(r9)
            com.tencent.mm.plugin.mall.ui.d$d r12 = (com.tencent.p014mm.plugin.mall.p075ui.C69778d.C69782d) r12
            r0.mo95996a(r11, r12)
            goto L_0x02c5
        L_0x0266:
            android.view.View r12 = r8.getChildAt(r9)
            r13 = 1
            r12.setFocusable(r13)
            android.view.View r12 = r8.getChildAt(r9)
            r13 = 0
            r12.setOnClickListener(r13)
            android.view.View r12 = r8.getChildAt(r9)
            java.lang.Object r12 = r12.getTag()
            com.tencent.mm.plugin.mall.ui.d$b r12 = (com.tencent.p014mm.plugin.mall.p075ui.C69778d.C69780b) r12
            android.view.View r12 = r12.f201374a
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            r13.mo10233c(r14)
            java.lang.Object[] r20 = r13.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2"
            java.lang.String r22 = "fillFunctionsLine"
            java.lang.String r23 = "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r12
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r13 = r13.mo10231a(r2)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r12.setVisibility(r13)
            java.lang.String r20 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2"
            java.lang.String r21 = "fillFunctionsLine"
            java.lang.String r22 = "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            r11.setEnabled(r2)
            r11.setClickable(r2)
        L_0x02c5:
            android.view.ViewGroup$LayoutParams r12 = r11.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r12 = (android.widget.LinearLayout.LayoutParams) r12
            int r13 = com.tencent.p014mm.plugin.mall.p075ui.C69770b.f201324e
            int r14 = com.tencent.p014mm.plugin.mall.p075ui.C69770b.f201322c
            int r13 = r13 + r14
            r12.width = r13
            int r13 = com.tencent.p014mm.plugin.mall.p075ui.C69770b.f201323d
            r11.setMinimumHeight(r13)
            int r13 = com.tencent.p014mm.plugin.mall.p075ui.C69770b.f201322c
            int r13 = r13 / 2
            r11.setPadding(r13, r2, r13, r2)
            r11.setLayoutParams(r12)
            goto L_0x03ac
        L_0x02e3:
            com.tencent.mm.plugin.mall.ui.d$b r11 = new com.tencent.mm.plugin.mall.ui.d$b
            r11.<init>(r0)
            android.view.LayoutInflater r12 = r0.f201368h
            r13 = 2131496433(0x7f0c0df1, float:1.861643E38)
            android.view.View r12 = r12.inflate(r13, r8, r2)
            r13 = 2131308890(0x7f09315a, float:1.8236048E38)
            android.view.View r13 = r12.findViewById(r13)
            r11.f201374a = r13
            r13 = 2131308887(0x7f093157, float:1.8236042E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r11.f201375b = r13
            r13 = 2131308892(0x7f09315c, float:1.8236052E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r11.f201377d = r13
            r13 = 2131308886(0x7f093156, float:1.823604E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r11.f201378e = r13
            r13 = 2131310186(0x7f09366a, float:1.8238677E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r11.f201376c = r13
            r12.setTag(r11)
            int r11 = r6.size()
            if (r9 >= r11) goto L_0x033a
            java.lang.Object r11 = r6.get(r9)
            com.tencent.mm.plugin.mall.ui.d$d r11 = (com.tencent.p014mm.plugin.mall.p075ui.C69778d.C69782d) r11
            r0.mo95996a(r12, r11)
            r11 = 0
            goto L_0x038f
        L_0x033a:
            r11 = 1
            r12.setFocusable(r11)
            java.lang.Object r11 = r12.getTag()
            com.tencent.mm.plugin.mall.ui.d$b r11 = (com.tencent.p014mm.plugin.mall.p075ui.C69778d.C69780b) r11
            android.view.View r11 = r11.f201374a
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r14 = k20.C60958c.f173611a
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            r13.mo10233c(r14)
            java.lang.Object[] r20 = r13.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2"
            java.lang.String r22 = "fillFunctionsLine"
            java.lang.String r23 = "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r11
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r13 = r13.mo10231a(r2)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r11.setVisibility(r13)
            java.lang.String r20 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2"
            java.lang.String r21 = "fillFunctionsLine"
            java.lang.String r22 = "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            r11 = 0
            r12.setOnClickListener(r11)
            r12.setEnabled(r2)
            r12.setClickable(r2)
        L_0x038f:
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            int r14 = com.tencent.p014mm.plugin.mall.p075ui.C69770b.f201324e
            int r15 = com.tencent.p014mm.plugin.mall.p075ui.C69770b.f201322c
            int r14 = r14 + r15
            r15 = 1065353216(0x3f800000, float:1.0)
            r11 = -1
            r13.<init>(r14, r11, r15)
            int r11 = com.tencent.p014mm.plugin.mall.p075ui.C69770b.f201323d
            r12.setMinimumHeight(r11)
            int r11 = com.tencent.p014mm.plugin.mall.p075ui.C69770b.f201322c
            int r11 = r11 / 2
            r12.setPadding(r11, r2, r11, r2)
            r8.addView(r12, r13)
            r11 = r12
        L_0x03ac:
            r12 = 2131233975(0x7f080cb7, float:1.8084103E38)
            r13 = 2131233976(0x7f080cb8, float:1.8084105E38)
            if (r7 == 0) goto L_0x0473
            r14 = 2131233974(0x7f080cb6, float:1.80841E38)
            r15 = 16
            if (r9 != 0) goto L_0x03fe
            android.content.Context r10 = r0.f201367g
            android.content.res.Resources r10 = r10.getResources()
            r12 = 2131233972(0x7f080cb4, float:1.8084097E38)
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r12)
            r11.setBackground(r10)
            android.view.View r10 = r4.f201385e
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            boolean r11 = r0.f201370j
            if (r11 == 0) goto L_0x03e0
            android.content.Context r11 = r0.f201367g
            r12 = 8
            int r11 = kg3.C76577a.m92151b(r11, r12)
            r10.height = r11
            goto L_0x03e8
        L_0x03e0:
            android.content.Context r11 = r0.f201367g
            int r11 = kg3.C76577a.m92151b(r11, r15)
            r10.height = r11
        L_0x03e8:
            android.view.View r11 = r4.f201385e
            r11.setLayoutParams(r10)
            android.view.View r10 = r4.f201385e
            android.content.Context r11 = r0.f201367g
            android.content.res.Resources r11 = r11.getResources()
            android.graphics.drawable.Drawable r11 = r11.getDrawable(r14)
            r10.setBackground(r11)
            goto L_0x04a2
        L_0x03fe:
            r2 = 1
            if (r9 != r2) goto L_0x0431
            android.content.Context r2 = r0.f201367g
            android.content.res.Resources r2 = r2.getResources()
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r13)
            r11.setBackground(r2)
            android.view.View r2 = r4.f201385e
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.content.Context r11 = r0.f201367g
            int r10 = kg3.C76577a.m92151b(r11, r10)
            r2.height = r10
            android.view.View r10 = r4.f201385e
            r10.setLayoutParams(r2)
            android.view.View r2 = r4.f201385e
            android.content.Context r10 = r0.f201367g
            android.content.res.Resources r10 = r10.getResources()
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r12)
            r2.setBackground(r10)
            goto L_0x04a2
        L_0x0431:
            android.content.Context r2 = r0.f201367g
            android.content.res.Resources r2 = r2.getResources()
            r10 = 2131233973(0x7f080cb5, float:1.8084099E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r10)
            r11.setBackground(r2)
            android.view.View r2 = r4.f201385e
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            boolean r10 = r0.f201370j
            if (r10 == 0) goto L_0x0456
            android.content.Context r10 = r0.f201367g
            r11 = 8
            int r10 = kg3.C76577a.m92151b(r10, r11)
            r2.height = r10
            goto L_0x045e
        L_0x0456:
            android.content.Context r10 = r0.f201367g
            int r10 = kg3.C76577a.m92151b(r10, r15)
            r2.height = r10
        L_0x045e:
            android.view.View r10 = r4.f201385e
            r10.setLayoutParams(r2)
            android.view.View r2 = r4.f201385e
            android.content.Context r10 = r0.f201367g
            android.content.res.Resources r10 = r10.getResources()
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r14)
            r2.setBackground(r10)
            goto L_0x04a2
        L_0x0473:
            android.content.Context r2 = r0.f201367g
            android.content.res.Resources r2 = r2.getResources()
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r13)
            r11.setBackground(r2)
            android.view.View r2 = r4.f201385e
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.content.Context r11 = r0.f201367g
            int r10 = kg3.C76577a.m92151b(r11, r10)
            r2.height = r10
            android.view.View r10 = r4.f201385e
            r10.setLayoutParams(r2)
            android.view.View r2 = r4.f201385e
            android.content.Context r10 = r0.f201367g
            android.content.res.Resources r10 = r10.getResources()
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r12)
            r2.setBackground(r10)
        L_0x04a2:
            int r9 = r9 + 1
            r2 = 0
            goto L_0x0208
        L_0x04a7:
            int r2 = r27.getCount()
            r6 = 1
            int r2 = r2 - r6
            if (r1 != r2) goto L_0x050b
            android.view.View r1 = r4.f201384d
            int r2 = com.tencent.p014mm.plugin.mall.p075ui.C69803z.m82223a()
            r1.setBackgroundColor(r2)
            android.view.View r1 = r4.f201384d
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r2.mo10233c(r3)
            java.lang.Object[] r7 = r2.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2"
            java.lang.String r9 = "getView"
            java.lang.String r10 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r1
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r7 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2"
            java.lang.String r8 = "getView"
            java.lang.String r9 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            android.view.View r1 = r4.f201384d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.content.Context r2 = r0.f201367g
            r3 = 12
            int r2 = kg3.C76577a.m92151b(r2, r3)
            r1.height = r2
            android.view.View r2 = r4.f201384d
            r2.setLayoutParams(r1)
            goto L_0x054e
        L_0x050b:
            android.view.View r1 = r4.f201384d
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r3)
            java.lang.Object[] r7 = r2.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2"
            java.lang.String r9 = "getView"
            java.lang.String r10 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r1
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r7 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2"
            java.lang.String r8 = "getView"
            java.lang.String r9 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
        L_0x054e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.mall.p075ui.C69778d.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
