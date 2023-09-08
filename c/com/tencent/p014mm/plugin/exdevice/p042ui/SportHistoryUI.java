package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import ob0.C11385n;
import ob0.C117747y;
import sx3.C64197v;
import t71.C48549k;
import te3.C49397f92;
import te3.C49534g92;
import te3.C51477u10;
import te3.oa4;
import te3.pa4;
import zp3.C23555k;
import zp3.C23564m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/exdevice/ui/SportHistoryUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lob0/n;", "<init>", "()V", "a", "b", "feature-exdevice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.exdevice.ui.SportHistoryUI */
public final class SportHistoryUI extends MMSecDataActivity implements C11385n {

    /* renamed from: d */
    public WxRecyclerView f111278d;

    /* renamed from: e */
    public C48549k f111279e;

    /* renamed from: f */
    public ArrayList<C41310a> f111280f = new ArrayList<>();

    /* renamed from: g */
    public String f111281g = "";

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.SportHistoryUI$a */
    public final class C41310a implements C9493c {

        /* renamed from: d */
        public final long f111282d;

        /* renamed from: e */
        public final C51477u10 f111283e;

        public C41310a(SportHistoryUI sportHistoryUI, long j, C51477u10 u102) {
            C87412m.m108594g(u102, "record");
            this.f111282d = j;
            this.f111283e = u102;
        }

        /* renamed from: c */
        public int mo75c() {
            return 5;
        }

        public long getItemId() {
            return this.f111282d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.SportHistoryUI$b */
    public final class C41311b extends C60896i<C41310a> {
        public C41311b() {
        }

        /* renamed from: c */
        public int mo43c() {
            return C0966R.C0971layout.c5i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:138:0x042b  */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo44e(jq3.C60905o r24, jq3.C9493c r25, int r26, int r27, boolean r28, java.util.List r29) {
            /*
                r23 = this;
                r0 = r23
                r1 = r24
                r2 = r25
                com.tencent.mm.plugin.exdevice.ui.SportHistoryUI$a r2 = (com.tencent.p014mm.plugin.exdevice.p042ui.SportHistoryUI.C41310a) r2
                java.lang.Class<kr0.w0> r3 = kr0.C76629w0.class
                java.lang.String r4 = "holder"
                gy3.C87412m.m108594g(r1, r4)
                java.lang.String r4 = "item"
                gy3.C87412m.m108594g(r2, r4)
                r4 = 2131300712(0x7f091168, float:1.8219461E38)
                android.view.View r4 = r1.mo85812D(r4)
                com.tencent.mm.plugin.exdevice.ui.SportHistoryUI r5 = com.tencent.p014mm.plugin.exdevice.p042ui.SportHistoryUI.this
                android.widget.TextView r4 = (android.widget.TextView) r4
                te3.u10 r6 = r2.f111283e
                int r6 = r6.f142536d
                r5.getClass()
                long r6 = (long) r6
                r8 = 1000(0x3e8, double:4.94E-321)
                long r8 = r8 * r6
                long r10 = com.tencent.p014mm.plugin.sport.model.C115778q.m162838g()
                int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r12 < 0) goto L_0x0041
                r6 = 2131825352(0x7f1112c8, float:1.9283558E38)
                java.lang.String r5 = r5.getString(r6)
                java.lang.String r6 = "{\n            getString(…exdevice_today)\n        }"
                gy3.C87412m.m108593f(r5, r6)
                goto L_0x006c
            L_0x0041:
                long r10 = com.tencent.p014mm.plugin.sport.model.C115778q.m162838g()
                r12 = 86400000(0x5265c00, double:4.2687272E-316)
                long r10 = r10 - r12
                int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r12 < 0) goto L_0x005b
                r6 = 2131825368(0x7f1112d8, float:1.928359E38)
                java.lang.String r5 = r5.getString(r6)
                java.lang.String r6 = "{\n            getString(…evice_yestoday)\n        }"
                gy3.C87412m.m108593f(r5, r6)
                goto L_0x006c
            L_0x005b:
                r8 = 2131830311(0x7f112627, float:1.9293616E38)
                java.lang.String r5 = r5.getString(r8)
                java.lang.String r5 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85111d(r5, r6)
                java.lang.String r6 = "{\n            TimeUtil.f… time.toLong())\n        }"
                gy3.C87412m.m108593f(r5, r6)
            L_0x006c:
                r4.setText(r5)
                android.text.TextPaint r4 = r4.getPaint()
                com.tencent.p014mm.p136ui.C85875k4.m106191k0(r4)
                rx3.b0 r4 = rx3.C13598b0.f38549a
                te3.u10 r4 = r2.f111283e
                te3.r85 r4 = r4.f142537e
                r5 = 0
                if (r4 == 0) goto L_0x0082
                int r4 = r4.f140768e
                goto L_0x0083
            L_0x0082:
                r4 = 0
            L_0x0083:
                r6 = 2131314358(0x7f0946b6, float:1.8247139E38)
                android.view.View r7 = r1.mo85812D(r6)
                android.widget.TextView r7 = (android.widget.TextView) r7
                java.lang.String r8 = java.lang.String.valueOf(r4)
                r7.setText(r8)
                r7 = 10000(0x2710, float:1.4013E-41)
                if (r4 < r7) goto L_0x00aa
                android.view.View r4 = r1.mo85812D(r6)
                android.widget.TextView r4 = (android.widget.TextView) r4
                com.tencent.mm.plugin.exdevice.ui.SportHistoryUI r6 = com.tencent.p014mm.plugin.exdevice.p042ui.SportHistoryUI.this
                r7 = 2131100485(0x7f060345, float:1.7813353E38)
                int r6 = kg3.C76577a.m92153d(r6, r7)
                r4.setTextColor(r6)
                goto L_0x00bc
            L_0x00aa:
                android.view.View r4 = r1.mo85812D(r6)
                android.widget.TextView r4 = (android.widget.TextView) r4
                com.tencent.mm.plugin.exdevice.ui.SportHistoryUI r6 = com.tencent.p014mm.plugin.exdevice.p042ui.SportHistoryUI.this
                r7 = 2131100484(0x7f060344, float:1.781335E38)
                int r6 = kg3.C76577a.m92153d(r6, r7)
                r4.setTextColor(r6)
            L_0x00bc:
                r4 = 2131307275(0x7f092b0b, float:1.8232773E38)
                android.view.View r4 = r1.mo85812D(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                te3.u10 r6 = r2.f111283e
                int r6 = r6.f142539g
                java.lang.String r6 = java.lang.String.valueOf(r6)
                r4.setText(r6)
                te3.u10 r4 = r2.f111283e
                boolean r4 = r4.f142541i
                r6 = 2131307282(0x7f092b12, float:1.8232787E38)
                if (r4 == 0) goto L_0x00e6
                android.view.View r4 = r1.mo85812D(r6)
                android.widget.ImageView r4 = (android.widget.ImageView) r4
                r6 = 2131755504(0x7f1001f0, float:1.914189E38)
                r4.setImageResource(r6)
                goto L_0x00f2
            L_0x00e6:
                android.view.View r4 = r1.mo85812D(r6)
                android.widget.ImageView r4 = (android.widget.ImageView) r4
                r6 = 2131755505(0x7f1001f1, float:1.9141891E38)
                r4.setImageResource(r6)
            L_0x00f2:
                com.tencent.mm.plugin.exdevice.ui.SportHistoryUI r4 = com.tencent.p014mm.plugin.exdevice.p042ui.SportHistoryUI.this
                te3.u10 r6 = r2.f111283e
                java.util.LinkedList r4 = com.tencent.p014mm.plugin.exdevice.p042ui.SportHistoryUI.m44707H7(r4, r6)
                r6 = 2131314266(0x7f09465a, float:1.8246952E38)
                android.view.View r6 = r1.mo85812D(r6)
                android.view.ViewGroup r6 = (android.view.ViewGroup) r6
                r6.removeAllViews()
                com.tencent.mm.plugin.exdevice.ui.SportHistoryUI r13 = com.tencent.p014mm.plugin.exdevice.p042ui.SportHistoryUI.this
                java.util.Iterator r4 = r4.iterator()
            L_0x010c:
                boolean r7 = r4.hasNext()
                if (r7 == 0) goto L_0x04a5
                java.lang.Object r7 = r4.next()
                r14 = r7
                java.util.LinkedList r14 = (java.util.LinkedList) r14
                android.content.Context r7 = r1.f173499A
                android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
                r8 = 2131494283(0x7f0c058b, float:1.861207E38)
                r15 = 0
                android.view.View r12 = r7.inflate(r8, r15)
                r7 = 2131297263(0x7f0903ef, float:1.8212466E38)
                android.view.View r7 = r12.findViewById(r7)
                r11 = r7
                android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
                r7 = 2131297245(0x7f0903dd, float:1.821243E38)
                android.view.View r7 = r12.findViewById(r7)
                com.tencent.mm.ui.widget.imageview.WeImageView r7 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r7
                r8 = 2131297253(0x7f0903e5, float:1.8212446E38)
                android.view.View r8 = r12.findViewById(r8)
                android.widget.TextView r8 = (android.widget.TextView) r8
                if (r14 == 0) goto L_0x014e
                boolean r9 = r14.isEmpty()
                if (r9 == 0) goto L_0x014c
                goto L_0x014e
            L_0x014c:
                r9 = 0
                goto L_0x014f
            L_0x014e:
                r9 = 1
            L_0x014f:
                if (r9 == 0) goto L_0x0153
                goto L_0x04a5
            L_0x0153:
                java.lang.Object r9 = r14.get(r5)
                java.lang.String r5 = "list[0]"
                gy3.C87412m.m108593f(r9, r5)
                r5 = r9
                te3.pa4 r5 = (te3.pa4) r5
                int r9 = r5.f139686o
                r15 = 2131099806(0x7f06009e, float:1.7811976E38)
                if (r9 != 0) goto L_0x0383
                java.lang.String r9 = r5.f139678d
                java.lang.String r10 = "21f9d636b41b25be"
                boolean r9 = gy3.C87412m.m108589b(r10, r9)
                if (r9 != 0) goto L_0x018d
                di3.d r9 = di3.C86312j.m106911c(r3)
                kr0.w0 r9 = (kr0.C76629w0) r9
                java.lang.String r10 = r5.f139678d
                com.tencent.mm.plugin.exdevice.ui.m1 r15 = new com.tencent.mm.plugin.exdevice.ui.m1
                r15.<init>(r13, r8, r7)
                r9.Ws0(r10, r15)
                r19 = r2
                r20 = r4
                r17 = r6
                r22 = r12
                r6 = r13
                r18 = r14
                goto L_0x0375
            L_0x018d:
                if (r8 == 0) goto L_0x0197
                r9 = 2131837361(0x7f1141b1, float:1.9307915E38)
                r8.setText(r9)
                rx3.b0 r9 = rx3.C13598b0.f38549a
            L_0x0197:
                if (r7 == 0) goto L_0x01a1
                r9 = 2131756220(0x7f1004bc, float:1.9143341E38)
                r7.setImageResource(r9)
                rx3.b0 r9 = rx3.C13598b0.f38549a
            L_0x01a1:
                if (r7 == 0) goto L_0x01b0
                androidx.appcompat.app.AppCompatActivity r9 = r13.getContext()
                int r9 = kg3.C76577a.m92153d(r9, r15)
                r7.setColorFilter(r9)
                rx3.b0 r9 = rx3.C13598b0.f38549a
            L_0x01b0:
                te3.u10 r9 = r2.f111283e
                java.util.LinkedList<te3.oa4> r9 = r9.f142542j
                if (r9 == 0) goto L_0x01c0
                boolean r9 = r9.isEmpty()
                r10 = 1
                r9 = r9 ^ r10
                if (r9 != r10) goto L_0x01c0
                r9 = 1
                goto L_0x01c1
            L_0x01c0:
                r9 = 0
            L_0x01c1:
                if (r9 != 0) goto L_0x01ed
                te3.u10 r9 = r2.f111283e
                java.util.LinkedList<te3.oa4> r9 = r9.f142542j
                if (r9 == 0) goto L_0x01d2
                int r9 = r9.size()
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                goto L_0x01d3
            L_0x01d2:
                r9 = 0
            L_0x01d3:
                gy3.C87412m.m108591d(r9)
                int r9 = r9.intValue()
                r10 = 3
                if (r9 < r10) goto L_0x01de
                goto L_0x01ed
            L_0x01de:
                r19 = r2
                r20 = r4
                r17 = r6
                r4 = r7
                r22 = r12
                r21 = r13
                r18 = r14
                goto L_0x0363
            L_0x01ed:
                android.content.Context r9 = r1.f173499A
                android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
                r10 = 2131494281(0x7f0c0589, float:1.8612066E38)
                r15 = 0
                android.view.View r9 = r9.inflate(r10, r15)
                r10 = 2131314265(0x7f094659, float:1.824695E38)
                android.view.View r10 = r9.findViewById(r10)
                android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
                te3.u10 r15 = r2.f111283e
                java.util.LinkedList<te3.oa4> r15 = r15.f142542j
                if (r15 == 0) goto L_0x02e9
                java.util.Iterator r18 = r15.iterator()
            L_0x020e:
                boolean r19 = r18.hasNext()
                if (r19 == 0) goto L_0x02dc
                java.lang.Object r19 = r18.next()
                r0 = r19
                te3.oa4 r0 = (te3.oa4) r0
                r19 = r2
                android.content.Context r2 = r1.f173499A
                android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
                r20 = r4
                r17 = r6
                r4 = 2131494284(0x7f0c058c, float:1.8612072E38)
                r6 = 0
                android.view.View r2 = r2.inflate(r4, r6)
                android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
                if (r2 == 0) goto L_0x0240
                r6 = 2131311996(0x7f093d7c, float:1.8242348E38)
                android.view.View r16 = r2.findViewById(r6)
                android.widget.TextView r16 = (android.widget.TextView) r16
                r4 = r16
                goto L_0x0241
            L_0x0240:
                r4 = 0
            L_0x0241:
                r6 = 1096810496(0x41600000, float:14.0)
                if (r4 == 0) goto L_0x024f
                java.lang.String r1 = r0.f139074j
                r4.setText(r1)
                com.tencent.p014mm.plugin.exdevice.p042ui.SportHistoryUI.m44708I7(r13, r4, r6)
                rx3.b0 r1 = rx3.C13598b0.f38549a
            L_0x024f:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r4 = r7
                double r6 = r0.f139070f
                int r6 = (int) r6
                r1.append(r6)
                r6 = 47
                r1.append(r6)
                double r6 = r0.f139071g
                int r6 = (int) r6
                r1.append(r6)
                java.lang.String r1 = r1.toString()
                if (r2 == 0) goto L_0x02b0
                r6 = 2131311997(0x7f093d7d, float:1.824235E38)
                android.view.View r7 = r2.findViewById(r6)
                android.widget.TextView r7 = (android.widget.TextView) r7
                if (r7 == 0) goto L_0x02b0
                r7.setText(r1)
                android.text.TextPaint r1 = r7.getPaint()
                com.tencent.p014mm.p136ui.C85875k4.m106191k0(r1)
                int r1 = r0.f139072h
                if (r1 == 0) goto L_0x0297
                r6 = 1
                if (r1 == r6) goto L_0x0293
                r6 = 2
                if (r1 == r6) goto L_0x028f
                r1 = 2131100166(0x7f060206, float:1.7812706E38)
                goto L_0x029a
            L_0x028f:
                r1 = 2131100472(0x7f060338, float:1.7813326E38)
                goto L_0x029a
            L_0x0293:
                r1 = 2131100473(0x7f060339, float:1.7813328E38)
                goto L_0x029a
            L_0x0297:
                r1 = 2131100474(0x7f06033a, float:1.781333E38)
            L_0x029a:
                android.content.Context r6 = r7.getContext()
                android.content.res.Resources r6 = r6.getResources()
                int r1 = r6.getColor(r1)
                r7.setTextColor(r1)
                r1 = 1099431936(0x41880000, float:17.0)
                com.tencent.p014mm.plugin.exdevice.p042ui.SportHistoryUI.m44708I7(r13, r7, r1)
                rx3.b0 r1 = rx3.C13598b0.f38549a
            L_0x02b0:
                if (r2 == 0) goto L_0x02bc
                r1 = 2131312008(0x7f093d88, float:1.8242372E38)
                android.view.View r6 = r2.findViewById(r1)
                android.widget.TextView r6 = (android.widget.TextView) r6
                goto L_0x02c0
            L_0x02bc:
                r1 = 2131312008(0x7f093d88, float:1.8242372E38)
                r6 = 0
            L_0x02c0:
                if (r6 == 0) goto L_0x02ce
                java.lang.String r0 = r0.f139075n
                r6.setText(r0)
                r0 = 1096810496(0x41600000, float:14.0)
                com.tencent.p014mm.plugin.exdevice.p042ui.SportHistoryUI.m44708I7(r13, r6, r0)
                rx3.b0 r0 = rx3.C13598b0.f38549a
            L_0x02ce:
                r10.addView(r2)
                r1 = r24
                r7 = r4
                r6 = r17
                r2 = r19
                r4 = r20
                goto L_0x020e
            L_0x02dc:
                r19 = r2
                r20 = r4
                r17 = r6
                r4 = r7
                r1 = 2131312008(0x7f093d88, float:1.8242372E38)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                goto L_0x02f3
            L_0x02e9:
                r19 = r2
                r20 = r4
                r17 = r6
                r4 = r7
                r1 = 2131312008(0x7f093d88, float:1.8242372E38)
            L_0x02f3:
                r0 = 2131305701(0x7f0924e5, float:1.822958E38)
                android.view.View r0 = r9.findViewById(r0)
                com.tencent.mm.plugin.exdevice.ui.ColorfulCircleProgress r0 = (com.tencent.p014mm.plugin.exdevice.p042ui.ColorfulCircleProgress) r0
                if (r0 == 0) goto L_0x0356
                if (r15 == 0) goto L_0x034d
                java.util.Iterator r2 = r15.iterator()
            L_0x0304:
                boolean r6 = r2.hasNext()
                if (r6 == 0) goto L_0x0344
                java.lang.Object r6 = r2.next()
                te3.oa4 r6 = (te3.oa4) r6
                int r7 = r6.f139072h
                r10 = r2
                double r1 = r6.f139070f
                r18 = r14
                double r14 = r6.f139071g
                r6 = 1135869952(0x43b40000, float:360.0)
                r22 = r12
                r21 = r13
                double r12 = (double) r6
                double r1 = r1 / r14
                double r12 = r12 * r1
                int r1 = (int) r12
                if (r7 == 0) goto L_0x0336
                r2 = 1
                if (r7 == r2) goto L_0x0332
                r2 = 2
                if (r7 == r2) goto L_0x032f
                r0.f312585g = r1
                goto L_0x0339
            L_0x032f:
                r0.f312585g = r1
                goto L_0x0339
            L_0x0332:
                r2 = 2
                r0.f312584f = r1
                goto L_0x0339
            L_0x0336:
                r2 = 2
                r0.f312583e = r1
            L_0x0339:
                r2 = r10
                r14 = r18
                r13 = r21
                r12 = r22
                r1 = 2131312008(0x7f093d88, float:1.8242372E38)
                goto L_0x0304
            L_0x0344:
                r22 = r12
                r21 = r13
                r18 = r14
                rx3.b0 r0 = rx3.C13598b0.f38549a
                goto L_0x0353
            L_0x034d:
                r22 = r12
                r21 = r13
                r18 = r14
            L_0x0353:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                goto L_0x035c
            L_0x0356:
                r22 = r12
                r21 = r13
                r18 = r14
            L_0x035c:
                if (r11 == 0) goto L_0x0363
                r11.addView(r9)
                rx3.b0 r0 = rx3.C13598b0.f38549a
            L_0x0363:
                di3.d r0 = di3.C86312j.m106911c(r3)
                kr0.w0 r0 = (kr0.C76629w0) r0
                java.lang.String r1 = r5.f139678d
                com.tencent.mm.plugin.exdevice.ui.n1 r2 = new com.tencent.mm.plugin.exdevice.ui.n1
                r6 = r21
                r2.<init>(r6, r8, r4)
                r0.Ws0(r1, r2)
            L_0x0375:
                com.tencent.mm.plugin.exdevice.ui.o1 r0 = new com.tencent.mm.plugin.exdevice.ui.o1
                r0.<init>(r5, r6)
                r1 = r22
                r1.setOnClickListener(r0)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                goto L_0x0413
            L_0x0383:
                r19 = r2
                r20 = r4
                r17 = r6
                r4 = r7
                r1 = r12
                r6 = r13
                r18 = r14
                r10 = 1
                if (r9 != r10) goto L_0x0413
                if (r8 != 0) goto L_0x0394
                goto L_0x0399
            L_0x0394:
                java.lang.String r0 = r5.f139679e
                r8.setText(r0)
            L_0x0399:
                hc0.c$b r0 = new hc0.c$b
                r0.<init>()
                r0.f59345a = r10
                r0.f59346b = r10
                r0.f59364t = r10
                hc0.c r0 = r0.mo32666a()
                gc0.a r2 = gc0.C20828a.m22825b()
                java.lang.String r7 = r5.f139685n
                r2.mo32519h(r7, r4, r0)
                java.lang.String r0 = r5.f139684j
                if (r0 == 0) goto L_0x03be
                int r0 = r0.length()
                if (r0 != 0) goto L_0x03bc
                goto L_0x03be
            L_0x03bc:
                r0 = 0
                goto L_0x03bf
            L_0x03be:
                r0 = 1
            L_0x03bf:
                if (r0 != 0) goto L_0x0413
                org.json.JSONObject r0 = new org.json.JSONObject
                java.lang.String r2 = r5.f139684j
                r0.<init>(r2)
                java.lang.String r2 = "jump_type"
                int r9 = r0.optInt(r2)
                if (r9 == 0) goto L_0x03d2
                r2 = 1
                goto L_0x03d3
            L_0x03d2:
                r2 = 0
            L_0x03d3:
                androidx.appcompat.app.AppCompatActivity r7 = r6.getContext()
                java.lang.String r12 = "context"
                gy3.C87412m.m108593f(r7, r12)
                if (r2 == 0) goto L_0x03e6
                r12 = 2131099851(0x7f0600cb, float:1.7812067E38)
                int r7 = kg3.C76577a.m92153d(r7, r12)
                goto L_0x03ea
            L_0x03e6:
                int r7 = kg3.C76577a.m92153d(r7, r15)
            L_0x03ea:
                d81.d r12 = new d81.d
                r12.<init>(r8, r7, r4)
                zp3.C23564m.m28136f(r12)
                com.tencent.mm.plugin.exdevice.ui.p1 r4 = new com.tencent.mm.plugin.exdevice.ui.p1
                r7 = r4
                r8 = r2
                r2 = 1
                r12 = 2131494284(0x7f0c058c, float:1.8612072E38)
                r13 = 2131312008(0x7f093d88, float:1.8242372E38)
                r14 = 2131311997(0x7f093d7d, float:1.824235E38)
                r15 = 2131311996(0x7f093d7c, float:1.8242348E38)
                r10 = r0
                r0 = r11
                r11 = r5
                r5 = 2131494284(0x7f0c058c, float:1.8612072E38)
                r12 = r6
                r7.<init>(r8, r9, r10, r11, r12)
                r1.setOnClickListener(r4)
                rx3.b0 r4 = rx3.C13598b0.f38549a
                goto L_0x0421
            L_0x0413:
                r0 = r11
                r2 = 1
                r5 = 2131494284(0x7f0c058c, float:1.8612072E38)
                r13 = 2131312008(0x7f093d88, float:1.8242372E38)
                r14 = 2131311997(0x7f093d7d, float:1.824235E38)
                r15 = 2131311996(0x7f093d7c, float:1.8242348E38)
            L_0x0421:
                java.util.Iterator r4 = r18.iterator()
            L_0x0425:
                boolean r7 = r4.hasNext()
                if (r7 == 0) goto L_0x0492
                java.lang.Object r7 = r4.next()
                te3.pa4 r7 = (te3.pa4) r7
                java.lang.String r8 = r7.f139681g
                if (r8 == 0) goto L_0x043e
                int r8 = r8.length()
                if (r8 != 0) goto L_0x043c
                goto L_0x043e
            L_0x043c:
                r10 = 0
                goto L_0x043f
            L_0x043e:
                r10 = 1
            L_0x043f:
                if (r10 != 0) goto L_0x048f
                r8 = r24
                android.content.Context r9 = r8.f173499A
                android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
                r10 = 0
                android.view.View r9 = r9.inflate(r5, r10)
                java.lang.String r11 = "null cannot be cast to non-null type android.view.ViewGroup"
                gy3.C87412m.m108592e(r9, r11)
                android.view.ViewGroup r9 = (android.view.ViewGroup) r9
                android.view.View r11 = r9.findViewById(r15)
                android.widget.TextView r11 = (android.widget.TextView) r11
                if (r11 != 0) goto L_0x045e
                goto L_0x0463
            L_0x045e:
                java.lang.String r12 = r7.f139681g
                r11.setText(r12)
            L_0x0463:
                android.view.View r11 = r9.findViewById(r14)
                android.widget.TextView r11 = (android.widget.TextView) r11
                if (r11 == 0) goto L_0x047d
                int r12 = r7.f139682h
                java.lang.String r12 = java.lang.String.valueOf(r12)
                r11.setText(r12)
                android.text.TextPaint r11 = r11.getPaint()
                com.tencent.p014mm.p136ui.C85875k4.m106191k0(r11)
                rx3.b0 r11 = rx3.C13598b0.f38549a
            L_0x047d:
                android.view.View r11 = r9.findViewById(r13)
                android.widget.TextView r11 = (android.widget.TextView) r11
                if (r11 != 0) goto L_0x0486
                goto L_0x048b
            L_0x0486:
                java.lang.String r7 = r7.f139683i
                r11.setText(r7)
            L_0x048b:
                r0.addView(r9)
                goto L_0x0425
            L_0x048f:
                r8 = r24
                goto L_0x0425
            L_0x0492:
                r8 = r24
                r7 = r17
                r7.addView(r1)
                r0 = r23
                r13 = r6
                r6 = r7
                r1 = r8
                r2 = r19
                r4 = r20
                r5 = 0
                goto L_0x010c
            L_0x04a5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.p042ui.SportHistoryUI.C41311b.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
        }

        /* renamed from: f */
        public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(oVar, "holder");
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.SportHistoryUI$c */
    public static final class C41312c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ SportHistoryUI f111285d;

        public C41312c(SportHistoryUI sportHistoryUI) {
            this.f111285d = sportHistoryUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f111285d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.SportHistoryUI$d */
    public static final class C41313d extends RecyclerView.C0129l {

        /* renamed from: d */
        public final /* synthetic */ SportHistoryUI f111286d;

        public C41313d(SportHistoryUI sportHistoryUI) {
            this.f111286d = sportHistoryUI;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
            r4 = r4.getAdapter();
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo121f(android.graphics.Rect r2, int r3, androidx.recyclerview.widget.RecyclerView r4) {
            /*
                r1 = this;
                java.lang.String r0 = "outRect"
                gy3.C87412m.m108594g(r2, r0)
                java.lang.String r0 = "parent"
                gy3.C87412m.m108594g(r4, r0)
                com.tencent.mm.plugin.exdevice.ui.SportHistoryUI r4 = r1.f111286d
                com.tencent.mm.view.recyclerview.WxRecyclerView r4 = r4.f111278d
                r0 = 1
                if (r4 == 0) goto L_0x001e
                androidx.recyclerview.widget.RecyclerView$e r4 = r4.getAdapter()
                if (r4 == 0) goto L_0x001e
                int r4 = r4.getItemCount()
                goto L_0x001f
            L_0x001e:
                r4 = 1
            L_0x001f:
                int r4 = r4 - r0
                if (r3 != r4) goto L_0x002c
                com.tencent.mm.plugin.exdevice.ui.SportHistoryUI r3 = r1.f111286d
                r4 = 16
                int r3 = kg3.C76577a.m92151b(r3, r4)
                r2.bottom = r3
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.p042ui.SportHistoryUI.C41313d.mo121f(android.graphics.Rect, int, androidx.recyclerview.widget.RecyclerView):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.SportHistoryUI$e */
    public static final class C41314e extends C23555k.C23558c {

        /* renamed from: a */
        public final /* synthetic */ SportHistoryUI f111287a;

        public C41314e(SportHistoryUI sportHistoryUI) {
            this.f111287a = sportHistoryUI;
        }

        /* renamed from: d */
        public boolean mo777d() {
            return false;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.tencent.mm.plugin.exdevice.ui.SportHistoryUI$a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo778e(android.view.View r18, java.util.List<? extends androidx.recyclerview.widget.RecyclerView.C16631z> r19) {
            /*
                r17 = this;
                java.lang.String r0 = "parent"
                r1 = r18
                gy3.C87412m.m108594g(r1, r0)
                java.lang.String r0 = "exposedHolders"
                r1 = r19
                gy3.C87412m.m108594g(r1, r0)
                r2 = r17
                com.tencent.mm.plugin.exdevice.ui.SportHistoryUI r3 = r2.f111287a
                java.util.Iterator r1 = r19.iterator()
            L_0x0017:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L_0x0185
                java.lang.Object r0 = r1.next()
                androidx.recyclerview.widget.RecyclerView$z r0 = (androidx.recyclerview.widget.RecyclerView.C16631z) r0
                boolean r4 = r0 instanceof jq3.C60905o
                r5 = 0
                if (r4 == 0) goto L_0x002b
                jq3.o r0 = (jq3.C60905o) r0
                goto L_0x002c
            L_0x002b:
                r0 = r5
            L_0x002c:
                if (r0 == 0) goto L_0x0017
                java.lang.Object r0 = r0.f173503E
                boolean r4 = r0 instanceof com.tencent.p014mm.plugin.exdevice.p042ui.SportHistoryUI.C41310a
                if (r4 == 0) goto L_0x0037
                r5 = r0
                com.tencent.mm.plugin.exdevice.ui.SportHistoryUI$a r5 = (com.tencent.p014mm.plugin.exdevice.p042ui.SportHistoryUI.C41310a) r5
            L_0x0037:
                if (r5 == 0) goto L_0x0017
                te3.u10 r0 = r5.f111283e
                java.util.LinkedList r0 = com.tencent.p014mm.plugin.exdevice.p042ui.SportHistoryUI.m44707H7(r3, r0)
                java.util.Iterator r4 = r0.iterator()
            L_0x0043:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L_0x0017
                java.lang.Object r0 = r4.next()
                java.util.LinkedList r0 = (java.util.LinkedList) r0
                java.util.Iterator r6 = r0.iterator()
            L_0x0053:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L_0x0043
                java.lang.Object r0 = r6.next()
                te3.pa4 r0 = (te3.pa4) r0
                bl3.r r7 = bl3.C39818r.f106831a
                androidx.appcompat.app.AppCompatActivity r8 = r3.getContext()
                java.lang.String r9 = "context"
                gy3.C87412m.m108593f(r8, r9)
                bl3.r$a r8 = r7.mo62444c(r8)
                java.lang.Class<c81.u> r9 = c81.C0436u.class
                androidx.lifecycle.i0 r8 = r8.mo75002a(r9)
                c81.u r8 = (c81.C0436u) r8
                r9 = 3
                java.lang.String r15 = r3.f111281g
                te3.u10 r10 = r5.f111283e
                int r10 = r10.f142536d
                r8.getClass()
                java.lang.String r11 = "userName"
                gy3.C87412m.m108594g(r15, r11)
                java.lang.String r11 = "sportRecord"
                gy3.C87412m.m108594g(r0, r11)
                androidx.appcompat.app.AppCompatActivity r11 = r8.getActivity()
                bl3.r$a r7 = r7.mo62444c(r11)
                java.lang.Class<yk3.d> r11 = yk3.C53531d.class
                androidx.lifecycle.i0 r7 = r7.mo75002a(r11)
                java.lang.String r11 = "UICProvider.of(activity)…MsgReportUIC::class.java)"
                gy3.C87412m.m108593f(r7, r11)
                yk3.d r7 = (yk3.C53531d) r7
                java.lang.String r11 = r0.f139679e
                r14 = 0
                r12 = 1
                if (r11 == 0) goto L_0x00b0
                int r11 = r11.length()
                if (r11 != 0) goto L_0x00ae
                goto L_0x00b0
            L_0x00ae:
                r11 = 0
                goto L_0x00b1
            L_0x00b0:
                r11 = 1
            L_0x00b1:
                if (r11 == 0) goto L_0x00ca
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r10)
                java.lang.String r13 = "appId:"
                r11.append(r13)
                java.lang.String r13 = r0.f139678d
                r11.append(r13)
                java.lang.String r11 = r11.toString()
                goto L_0x00e0
            L_0x00ca:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r10)
                java.lang.String r13 = "appName:"
                r11.append(r13)
                java.lang.String r13 = r0.f139679e
                r11.append(r13)
                java.lang.String r11 = r11.toString()
            L_0x00e0:
                r13 = r11
                java.lang.Object[] r11 = new java.lang.Object[r12]
                r11[r14] = r13
                r16 = r15
                java.lang.String r15 = "SportScrollReportUIC"
                java.lang.String r14 = "report: key:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r14, r11)
                java.util.Set r11 = r7.mo74203d3()
                boolean r11 = r11.contains(r13)
                if (r11 != 0) goto L_0x0176
                int r11 = r0.f139686o
                if (r11 != 0) goto L_0x0132
                java.lang.String r11 = r0.f139678d
                java.lang.String r12 = "21f9d636b41b25be"
                boolean r11 = gy3.C87412m.m108589b(r12, r11)
                if (r11 == 0) goto L_0x011c
                d81.c r10 = d81.C20448c.f57466a
                r12 = 1
                r0 = 2131837361(0x7f1141b1, float:1.9307915E38)
                java.lang.String r0 = r8.getString(r0)
                r14 = 2
                r15 = 2
                r11 = 3
                r8 = r13
                r13 = r0
                r0 = r16
                r10.mo31991a(r11, r12, r13, r14, r15, r16)
                goto L_0x016d
            L_0x011c:
                r8 = r13
                r14 = r16
                java.lang.Class<kr0.w0> r11 = kr0.C76629w0.class
                di3.d r11 = di3.C86312j.m106911c(r11)
                kr0.w0 r11 = (kr0.C76629w0) r11
                java.lang.String r12 = r0.f139678d
                c81.r r13 = new c81.r
                r13.<init>(r10, r9, r14, r0)
                r11.Ws0(r12, r13)
                goto L_0x016d
            L_0x0132:
                r8 = r13
                r14 = r16
                if (r11 != r12) goto L_0x016d
                org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0165 }
                java.lang.String r10 = r0.f139684j     // Catch:{ JSONException -> 0x0165 }
                r9.<init>(r10)     // Catch:{ JSONException -> 0x0165 }
                java.lang.String r10 = "finder_username"
                java.lang.String r9 = r9.optString(r10)     // Catch:{ JSONException -> 0x0165 }
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)     // Catch:{ JSONException -> 0x0165 }
                if (r9 != 0) goto L_0x014c
                r9 = 1
                goto L_0x014d
            L_0x014c:
                r9 = 2
            L_0x014d:
                d81.c r10 = d81.C20448c.f57466a     // Catch:{ JSONException -> 0x0165 }
                r12 = 2
                java.lang.String r13 = r0.f139679e     // Catch:{ JSONException -> 0x0165 }
                java.lang.String r0 = "sportRecord.appName"
                gy3.C87412m.m108593f(r13, r0)     // Catch:{ JSONException -> 0x0165 }
                r0 = 2
                r11 = 3
                r16 = r14
                r14 = r9
                r9 = r15
                r15 = r0
                r10.mo31991a(r11, r12, r13, r14, r15, r16)     // Catch:{ JSONException -> 0x0163 }
                goto L_0x016d
            L_0x0163:
                r0 = move-exception
                goto L_0x0167
            L_0x0165:
                r0 = move-exception
                r9 = r15
            L_0x0167:
                r10 = 0
                java.lang.Object[] r10 = new java.lang.Object[r10]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r9, r10)
            L_0x016d:
                java.util.Set r0 = r7.mo74203d3()
                r0.add(r8)
                goto L_0x0053
            L_0x0176:
                r8 = r13
                r9 = r15
                r10 = 0
                java.lang.Object[] r0 = new java.lang.Object[r12]
                r0[r10] = r8
                java.lang.String r7 = "report:contanins %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r7, r0)
                goto L_0x0053
            L_0x0185:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.p042ui.SportHistoryUI.C41314e.mo778e(android.view.View, java.util.List):void");
        }
    }

    /* renamed from: H7 */
    public static final LinkedList m44707H7(SportHistoryUI sportHistoryUI, C51477u10 u102) {
        sportHistoryUI.getClass();
        LinkedList linkedList = new LinkedList();
        LinkedList<pa4> linkedList2 = u102.f142538f;
        C87412m.m108593f(linkedList2, "record.sportrecord");
        boolean z = true;
        LinkedList linkedList3 = null;
        String str = null;
        String str2 = null;
        LinkedList linkedList4 = null;
        boolean z2 = false;
        for (pa4 pa4 : linkedList2) {
            int i = pa4.f139686o;
            if (i == 0) {
                if (str == null || !C87412m.m108589b(str, pa4.f139678d)) {
                    if (linkedList3 != null && (linkedList3.isEmpty() ^ true)) {
                        if (linkedList3 != null) {
                            linkedList.add(linkedList3);
                        }
                        linkedList3 = new LinkedList();
                    }
                    if (linkedList4 != null && (linkedList4.isEmpty() ^ true)) {
                        C87412m.m108591d(linkedList4);
                        linkedList.add(linkedList4);
                    }
                    linkedList4 = new LinkedList();
                    str = pa4.f139678d;
                }
                if (linkedList4 != null) {
                    linkedList4.add(pa4);
                }
                if (C87412m.m108589b(pa4.f139678d, "21f9d636b41b25be")) {
                    z2 = true;
                }
            } else if (i == 1) {
                if (str2 == null || !C87412m.m108589b(str2, pa4.f139679e)) {
                    if (linkedList4 != null && (linkedList4.isEmpty() ^ true)) {
                        if (linkedList4 != null) {
                            linkedList.add(linkedList4);
                        }
                        linkedList4 = new LinkedList();
                    }
                    if (linkedList3 != null && (linkedList3.isEmpty() ^ true)) {
                        C87412m.m108591d(linkedList3);
                        linkedList.add(linkedList3);
                    }
                    linkedList3 = new LinkedList();
                    str2 = pa4.f139679e;
                }
                if (linkedList3 != null) {
                    linkedList3.add(pa4);
                }
            }
        }
        if (linkedList3 != null && (linkedList3.isEmpty() ^ true)) {
            C87412m.m108591d(linkedList3);
            linkedList.add(linkedList3);
        }
        if (linkedList4 != null && (linkedList4.isEmpty() ^ true)) {
            C87412m.m108591d(linkedList4);
            linkedList.add(linkedList4);
        }
        LinkedList linkedList5 = new LinkedList();
        if (!z2) {
            LinkedList<oa4> linkedList6 = u102.f142542j;
            if (linkedList6 != null && !linkedList6.isEmpty()) {
                z = false;
            }
            if (!z) {
                pa4 pa42 = new pa4();
                pa42.f139678d = "21f9d636b41b25be";
                pa42.f139686o = 0;
                pa42.f139681g = null;
                linkedList5.add(pa42);
                linkedList.add(linkedList5);
            }
        }
        return linkedList;
    }

    /* renamed from: I7 */
    public static final void m44708I7(SportHistoryUI sportHistoryUI, TextView textView, float f) {
        AppCompatActivity context = sportHistoryUI.getContext();
        C87412m.m108593f(context, "context");
        Object systemService = context.getSystemService("window");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        textView.setTextSize(1, (f * displayMetrics.density) / context.getResources().getDisplayMetrics().density);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c5j;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.cft);
        setBackBtn(new C41312c(this));
        WxRecyclerView wxRecyclerView = (WxRecyclerView) findViewById(C0966R.C0970id.iiq);
        this.f111278d = wxRecyclerView;
        if (wxRecyclerView != null) {
            wxRecyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        }
        WxRecyclerView wxRecyclerView2 = this.f111278d;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setAdapter(new WxRecyclerAdapter(new SportHistoryUI$buildItemConverts$1(this), this.f111280f, false));
        }
        WxRecyclerView wxRecyclerView3 = this.f111278d;
        if (wxRecyclerView3 != null) {
            wxRecyclerView3.mo17085h0(new C41313d(this));
        }
        WxRecyclerView wxRecyclerView4 = this.f111278d;
        if (wxRecyclerView4 != null) {
            C23564m.m28137g(wxRecyclerView4, new C41314e(this));
        }
        C86709a0.m107524d().mo123455a(4835, this);
        C49397f92 f922 = new C49397f92();
        String stringExtra = getIntent().getStringExtra("username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f111281g = stringExtra;
        f922.f133362d = stringExtra;
        this.f111279e = new C48549k(f922);
        C86709a0.m107524d().mo123460f(this.f111279e);
    }

    public void onDestroy() {
        C48549k kVar = this.f111279e;
        if (kVar != null) {
            C86709a0.m107524d().mo123458d(kVar);
        }
        C86709a0.m107524d().mo123470p(4835, this);
        super.onDestroy();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        RecyclerView.C16613e adapter;
        C49534g92 g922;
        LinkedList<C51477u10> linkedList;
        if (i == 0 && i2 == 0) {
            C48549k kVar = this.f111279e;
            if (!(kVar == null || (g922 = kVar.f129866f) == null || (linkedList = g922.f133940d) == null)) {
                int i3 = 0;
                for (T next : linkedList) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        C51477u10 u102 = (C51477u10) next;
                        ArrayList<C41310a> arrayList = this.f111280f;
                        C87412m.m108593f(u102, "dailySportRecord");
                        arrayList.add(new C41310a(this, (long) i3, u102));
                        i3 = i4;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
            }
            WxRecyclerView wxRecyclerView = this.f111278d;
            if (!(wxRecyclerView == null || (adapter = wxRecyclerView.getAdapter()) == null)) {
                adapter.notifyDataSetChanged();
            }
        }
        View findViewById = findViewById(C0966R.C0970id.f358619g33);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/exdevice/ui/SportHistoryUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/exdevice/ui/SportHistoryUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f111279e = null;
    }
}
