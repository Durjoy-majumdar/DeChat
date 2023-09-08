package qj1;

import ak1.C0073g0;
import ak1.C0076j0;
import ak1.C54108o;
import ak1.C54116w;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import c50.C54655b;
import cl1.C0690t1;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32224a;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import hq1.C60085d;
import hq1.C60090e;
import ht1.C8777j5;
import i50.C60251a;
import j20.C117292a;
import j50.C60735a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import ok1.C62042e;
import rx3.C13598b0;
import rx3.C13604l;
import y50.C15936n0;

/* renamed from: qj1.a6 */
public final class C62632a6 extends C62660c {

    /* renamed from: A */
    public final Space f177850A;

    /* renamed from: B */
    public int f177851B;

    /* renamed from: C */
    public final C12237a f177852C;

    /* renamed from: D */
    public final C12237a f177853D;

    /* renamed from: E */
    public final C12237a f177854E;

    /* renamed from: F */
    public final View f177855F;

    /* renamed from: G */
    public final View f177856G;

    /* renamed from: H */
    public final Drawable f177857H;

    /* renamed from: I */
    public final Drawable f177858I;

    /* renamed from: J */
    public final Drawable f177859J;

    /* renamed from: K */
    public int f177860K;

    /* renamed from: L */
    public String f177861L;

    /* renamed from: M */
    public long f177862M;

    /* renamed from: N */
    public int f177863N;

    /* renamed from: P */
    public final int f177864P;

    /* renamed from: Q */
    public final int f177865Q;

    /* renamed from: R */
    public final int f177866R;

    /* renamed from: S */
    public final int f177867S;

    /* renamed from: T */
    public final C12244b f177868T;

    /* renamed from: p */
    public final C58124b f177869p;

    /* renamed from: q */
    public final String f177870q = "Finder.FinderLiveCommonInfoPlugin";

    /* renamed from: r */
    public boolean f177871r;

    /* renamed from: s */
    public final TextView f177872s;

    /* renamed from: t */
    public final TextView f177873t;

    /* renamed from: u */
    public final View f177874u;

    /* renamed from: v */
    public final View f177875v;

    /* renamed from: w */
    public final ImageView f177876w;

    /* renamed from: x */
    public final ImageView f177877x;

    /* renamed from: y */
    public final View f177878y;

    /* renamed from: z */
    public final TextView f177879z;

    /* renamed from: qj1.a6$a */
    public static final class C12243a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62632a6 f35318d;

        public C12243a(C62632a6 a6Var) {
            this.f35318d = a6Var;
        }

        /* JADX WARNING: type inference failed for: r2v14, types: [android.view.View] */
        /* JADX WARNING: type inference failed for: r7v7, types: [android.view.View] */
        /* JADX WARNING: type inference failed for: r2v61, types: [android.view.View] */
        /* JADX WARNING: type inference failed for: r7v12, types: [android.view.View] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r24) {
            /*
                r23 = this;
                r6 = r23
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r24
                r0.add(r1)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin$1"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                r4 = r23
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                java.lang.Class<ht1.j5> r0 = ht1.C8777j5.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                java.lang.String r1 = "getService(IHellLiveReport::class.java)"
                gy3.C87412m.m108593f(r0, r1)
                r7 = r0
                ht1.j5 r7 = (ht1.C8777j5) r7
                ak1.g0 r8 = ak1.C0073g0.NET_SPEED_LOW
                r10 = 0
                r11 = 4
                r12 = 0
                java.lang.String r9 = "2"
                ht1.C8777j5.C8778a.m8605f(r7, r8, r9, r10, r11, r12)
                qj1.a6 r0 = r6.f35318d
                int r1 = r0.mo87669c1()
                r2 = 1
                r4 = 6
                r5 = 2131821556(0x7f1103f4, float:1.9275859E38)
                r7 = 0
                if (r1 == r2) goto L_0x03c6
                r2 = 2
                r9 = 2131311240(0x7f093a88, float:1.8240815E38)
                r10 = 2131311241(0x7f093a89, float:1.8240817E38)
                r11 = 2131311243(0x7f093a8b, float:1.824082E38)
                r12 = 2131311242(0x7f093a8a, float:1.8240819E38)
                r13 = 2131311245(0x7f093a8d, float:1.8240825E38)
                r14 = 2131311244(0x7f093a8c, float:1.8240823E38)
                r15 = 2131311248(0x7f093a90, float:1.824083E38)
                r8 = 2131494771(0x7f0c0773, float:1.861306E38)
                r3 = 0
                if (r1 == r2) goto L_0x024e
                r2 = 4
                if (r1 == r2) goto L_0x01e4
                r2 = 8
                if (r1 == r2) goto L_0x006b
                goto L_0x042e
            L_0x006b:
                qo3.e0 r1 = new qo3.e0
                android.view.ViewGroup r2 = r0.f166287d
                android.content.Context r17 = r2.getContext()
                r18 = 2
                r19 = 0
                r20 = 1
                r21 = 0
                r16 = r1
                r16.<init>(r17, r18, r19, r20, r21)
                android.view.ViewGroup r2 = r0.f166287d
                android.content.Context r2 = r2.getContext()
                android.content.res.Resources r2 = r2.getResources()
                java.lang.String r2 = r2.getString(r5)
                r1.mo140677w(r2)
                r1.mo140676v(r4)
                qj1.b6 r2 = new qj1.b6
                r2.<init>(r1)
                r1.f296375F = r2
                android.view.ViewGroup r0 = r0.f166287d
                android.content.Context r0 = r0.getContext()
                android.view.LayoutInflater r0 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r0)
                android.view.View r0 = r0.inflate(r8, r7)
                if (r0 == 0) goto L_0x00b2
                android.view.View r2 = r0.findViewById(r15)
                android.widget.TextView r2 = (android.widget.TextView) r2
                goto L_0x00b3
            L_0x00b2:
                r2 = r7
            L_0x00b3:
                if (r2 != 0) goto L_0x00b6
                goto L_0x00c8
            L_0x00b6:
                android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131828203(0x7f111deb, float:1.928934E38)
                java.lang.String r4 = r4.getString(r5)
                r2.setText(r4)
            L_0x00c8:
                if (r0 == 0) goto L_0x00d1
                android.view.View r2 = r0.findViewById(r14)
                android.widget.TextView r2 = (android.widget.TextView) r2
                goto L_0x00d2
            L_0x00d1:
                r2 = r7
            L_0x00d2:
                if (r2 != 0) goto L_0x00d5
                goto L_0x00e7
            L_0x00d5:
                android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131828201(0x7f111de9, float:1.9289336E38)
                java.lang.String r4 = r4.getString(r5)
                r2.setText(r4)
            L_0x00e7:
                if (r0 == 0) goto L_0x00f0
                android.view.View r2 = r0.findViewById(r13)
                android.widget.TextView r2 = (android.widget.TextView) r2
                goto L_0x00f1
            L_0x00f0:
                r2 = r7
            L_0x00f1:
                if (r2 != 0) goto L_0x00f4
                goto L_0x0106
            L_0x00f4:
                android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131828202(0x7f111dea, float:1.9289338E38)
                java.lang.String r4 = r4.getString(r5)
                r2.setText(r4)
            L_0x0106:
                if (r0 == 0) goto L_0x010f
                android.view.View r2 = r0.findViewById(r12)
                android.widget.TextView r2 = (android.widget.TextView) r2
                goto L_0x0110
            L_0x010f:
                r2 = r7
            L_0x0110:
                if (r2 != 0) goto L_0x0113
                goto L_0x0125
            L_0x0113:
                android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131828199(0x7f111de7, float:1.9289332E38)
                java.lang.String r4 = r4.getString(r5)
                r2.setText(r4)
            L_0x0125:
                if (r0 == 0) goto L_0x012e
                android.view.View r2 = r0.findViewById(r11)
                android.widget.TextView r2 = (android.widget.TextView) r2
                goto L_0x012f
            L_0x012e:
                r2 = r7
            L_0x012f:
                if (r2 != 0) goto L_0x0132
                goto L_0x0144
            L_0x0132:
                android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131828200(0x7f111de8, float:1.9289334E38)
                java.lang.String r4 = r4.getString(r5)
                r2.setText(r4)
            L_0x0144:
                if (r0 == 0) goto L_0x014b
                android.view.View r2 = r0.findViewById(r10)
                goto L_0x014c
            L_0x014b:
                r2 = r7
            L_0x014c:
                if (r2 != 0) goto L_0x014f
                goto L_0x0191
            L_0x014f:
                k20.a r4 = new k20.a
                r4.<init>()
                java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
                java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
                r4.mo10233c(r5)
                java.lang.Object[] r11 = r4.mo10232b()
                java.lang.String r12 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin"
                java.lang.String r13 = "showExceptionTipPanel"
                java.lang.String r14 = "()V"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                r10 = r2
                j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
                java.lang.Object r4 = r4.mo10231a(r3)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r2.setVisibility(r4)
                java.lang.String r11 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin"
                java.lang.String r12 = "showExceptionTipPanel"
                java.lang.String r13 = "()V"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            L_0x0191:
                if (r0 == 0) goto L_0x0197
                android.view.View r7 = r0.findViewById(r9)
            L_0x0197:
                if (r7 != 0) goto L_0x019a
                goto L_0x01dc
            L_0x019a:
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
                java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
                r2.mo10233c(r4)
                java.lang.Object[] r9 = r2.mo10232b()
                java.lang.String r10 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin"
                java.lang.String r11 = "showExceptionTipPanel"
                java.lang.String r12 = "()V"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r15 = "(I)V"
                r8 = r7
                j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
                java.lang.Object r2 = r2.mo10231a(r3)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r7.setVisibility(r2)
                java.lang.String r9 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin"
                java.lang.String r10 = "showExceptionTipPanel"
                java.lang.String r11 = "()V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            L_0x01dc:
                r1.mo140663j(r0)
                r1.mo140655A()
                goto L_0x042e
            L_0x01e4:
                qo3.e0 r1 = new qo3.e0
                android.view.ViewGroup r2 = r0.f166287d
                android.content.Context r18 = r2.getContext()
                r19 = 2
                r20 = 0
                r21 = 1
                r22 = 0
                r17 = r1
                r17.<init>(r18, r19, r20, r21, r22)
                android.view.ViewGroup r2 = r0.f166287d
                android.content.Context r2 = r2.getContext()
                android.content.res.Resources r2 = r2.getResources()
                java.lang.String r2 = r2.getString(r5)
                r1.mo140677w(r2)
                r1.mo140676v(r4)
                qj1.e6 r2 = new qj1.e6
                r2.<init>(r1)
                r1.f296375F = r2
                android.view.ViewGroup r0 = r0.f166287d
                android.content.Context r0 = r0.getContext()
                android.view.LayoutInflater r0 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r0)
                r2 = 2131494813(0x7f0c079d, float:1.8613145E38)
                android.view.View r0 = r0.inflate(r2, r7)
                if (r0 == 0) goto L_0x0231
                r2 = 2131311249(0x7f093a91, float:1.8240833E38)
                android.view.View r2 = r0.findViewById(r2)
                r7 = r2
                android.widget.TextView r7 = (android.widget.TextView) r7
            L_0x0231:
                if (r7 != 0) goto L_0x0234
                goto L_0x0246
            L_0x0234:
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131828908(0x7f1120ac, float:1.929077E38)
                java.lang.String r2 = r2.getString(r3)
                r7.setText(r2)
            L_0x0246:
                r1.mo140663j(r0)
                r1.mo140655A()
                goto L_0x042e
            L_0x024e:
                qo3.e0 r1 = new qo3.e0
                android.view.ViewGroup r2 = r0.f166287d
                android.content.Context r17 = r2.getContext()
                r18 = 2
                r19 = 0
                r20 = 1
                r21 = 0
                r16 = r1
                r16.<init>(r17, r18, r19, r20, r21)
                android.view.ViewGroup r2 = r0.f166287d
                android.content.Context r2 = r2.getContext()
                android.content.res.Resources r2 = r2.getResources()
                java.lang.String r2 = r2.getString(r5)
                r1.mo140677w(r2)
                r1.mo140676v(r4)
                qj1.d6 r2 = new qj1.d6
                r2.<init>(r1)
                r1.f296375F = r2
                android.view.ViewGroup r0 = r0.f166287d
                android.content.Context r0 = r0.getContext()
                android.view.LayoutInflater r0 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r0)
                android.view.View r0 = r0.inflate(r8, r7)
                if (r0 == 0) goto L_0x0295
                android.view.View r2 = r0.findViewById(r15)
                android.widget.TextView r2 = (android.widget.TextView) r2
                goto L_0x0296
            L_0x0295:
                r2 = r7
            L_0x0296:
                if (r2 != 0) goto L_0x0299
                goto L_0x02ab
            L_0x0299:
                android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131828860(0x7f11207c, float:1.9290673E38)
                java.lang.String r4 = r4.getString(r5)
                r2.setText(r4)
            L_0x02ab:
                if (r0 == 0) goto L_0x02b4
                android.view.View r2 = r0.findViewById(r14)
                android.widget.TextView r2 = (android.widget.TextView) r2
                goto L_0x02b5
            L_0x02b4:
                r2 = r7
            L_0x02b5:
                if (r2 != 0) goto L_0x02b8
                goto L_0x02ca
            L_0x02b8:
                android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131828858(0x7f11207a, float:1.9290669E38)
                java.lang.String r4 = r4.getString(r5)
                r2.setText(r4)
            L_0x02ca:
                if (r0 == 0) goto L_0x02d3
                android.view.View r2 = r0.findViewById(r13)
                android.widget.TextView r2 = (android.widget.TextView) r2
                goto L_0x02d4
            L_0x02d3:
                r2 = r7
            L_0x02d4:
                if (r2 != 0) goto L_0x02d7
                goto L_0x02e9
            L_0x02d7:
                android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131828859(0x7f11207b, float:1.929067E38)
                java.lang.String r4 = r4.getString(r5)
                r2.setText(r4)
            L_0x02e9:
                if (r0 == 0) goto L_0x02f2
                android.view.View r2 = r0.findViewById(r12)
                android.widget.TextView r2 = (android.widget.TextView) r2
                goto L_0x02f3
            L_0x02f2:
                r2 = r7
            L_0x02f3:
                if (r2 != 0) goto L_0x02f6
                goto L_0x0308
            L_0x02f6:
                android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131828856(0x7f112078, float:1.9290665E38)
                java.lang.String r4 = r4.getString(r5)
                r2.setText(r4)
            L_0x0308:
                if (r0 == 0) goto L_0x0311
                android.view.View r2 = r0.findViewById(r11)
                android.widget.TextView r2 = (android.widget.TextView) r2
                goto L_0x0312
            L_0x0311:
                r2 = r7
            L_0x0312:
                if (r2 != 0) goto L_0x0315
                goto L_0x0327
            L_0x0315:
                android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131828857(0x7f112079, float:1.9290667E38)
                java.lang.String r4 = r4.getString(r5)
                r2.setText(r4)
            L_0x0327:
                if (r0 == 0) goto L_0x032e
                android.view.View r2 = r0.findViewById(r10)
                goto L_0x032f
            L_0x032e:
                r2 = r7
            L_0x032f:
                if (r2 != 0) goto L_0x0332
                goto L_0x0374
            L_0x0332:
                k20.a r4 = new k20.a
                r4.<init>()
                java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
                java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
                r4.mo10233c(r5)
                java.lang.Object[] r11 = r4.mo10232b()
                java.lang.String r12 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin"
                java.lang.String r13 = "showExceptionTipPanel"
                java.lang.String r14 = "()V"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                r10 = r2
                j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
                java.lang.Object r4 = r4.mo10231a(r3)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r2.setVisibility(r4)
                java.lang.String r11 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin"
                java.lang.String r12 = "showExceptionTipPanel"
                java.lang.String r13 = "()V"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            L_0x0374:
                if (r0 == 0) goto L_0x037a
                android.view.View r7 = r0.findViewById(r9)
            L_0x037a:
                if (r7 != 0) goto L_0x037d
                goto L_0x03bf
            L_0x037d:
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
                java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
                r2.mo10233c(r4)
                java.lang.Object[] r9 = r2.mo10232b()
                java.lang.String r10 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin"
                java.lang.String r11 = "showExceptionTipPanel"
                java.lang.String r12 = "()V"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r15 = "(I)V"
                r8 = r7
                j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
                java.lang.Object r2 = r2.mo10231a(r3)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r7.setVisibility(r2)
                java.lang.String r9 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin"
                java.lang.String r10 = "showExceptionTipPanel"
                java.lang.String r11 = "()V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            L_0x03bf:
                r1.mo140663j(r0)
                r1.mo140655A()
                goto L_0x042e
            L_0x03c6:
                qo3.e0 r1 = new qo3.e0
                android.view.ViewGroup r2 = r0.f166287d
                android.content.Context r18 = r2.getContext()
                r19 = 2
                r20 = 0
                r21 = 1
                r22 = 0
                r17 = r1
                r17.<init>(r18, r19, r20, r21, r22)
                android.view.ViewGroup r2 = r0.f166287d
                android.content.Context r2 = r2.getContext()
                android.content.res.Resources r2 = r2.getResources()
                java.lang.String r2 = r2.getString(r5)
                r1.mo140677w(r2)
                r1.mo140676v(r4)
                qj1.c6 r2 = new qj1.c6
                r2.<init>(r1)
                r1.f296375F = r2
                android.view.ViewGroup r0 = r0.f166287d
                android.content.Context r0 = r0.getContext()
                android.view.LayoutInflater r0 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r0)
                r2 = 2131494813(0x7f0c079d, float:1.8613145E38)
                android.view.View r0 = r0.inflate(r2, r7)
                if (r0 == 0) goto L_0x0413
                r2 = 2131311249(0x7f093a91, float:1.8240833E38)
                android.view.View r2 = r0.findViewById(r2)
                r7 = r2
                android.widget.TextView r7 = (android.widget.TextView) r7
            L_0x0413:
                if (r7 != 0) goto L_0x0416
                goto L_0x0428
            L_0x0416:
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131827960(0x7f111cf8, float:1.9288847E38)
                java.lang.String r2 = r2.getString(r3)
                r7.setText(r2)
            L_0x0428:
                r1.mo140663j(r0)
                r1.mo140655A()
            L_0x042e:
                java.lang.String r0 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin$1"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r6, r0, r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C62632a6.C12243a.onClick(android.view.View):void");
        }
    }

    /* renamed from: qj1.a6$b */
    public static final class C12244b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62632a6 f35319d;

        public C12244b(C62632a6 a6Var) {
            this.f35319d = a6Var;
        }

        public void onClick(View view) {
            C60085d dVar;
            C60090e eVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin$membersGroupVisitorClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f35319d.mo87671e1()) {
                C7335d c = C86312j.m106911c(C54108o.class);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.SEE_GIFT_LIST, String.valueOf(1), (String) null, 4, (Object) null);
            } else {
                ((C54116w) C86312j.m106911c(C54116w.class)).nv0(C0076j0.CLICK_HOT_LIST_SEE_CUR_DOU_YOU, "", 0);
            }
            if (!(!((C54991o) this.f35319d.mo87696x0(C54991o.class)).mo75990Y3() || (dVar = (C60085d) this.f35319d.mo87687E0(C60085d.class)) == null || (eVar = dVar.f171450r) == null)) {
                eVar.mo84955a();
                eVar.mo84957c(2018);
            }
            C58124b.C7172a.m7372a(this.f35319d.f177869p, C58124b.C58125b.FINDER_LIVE_MEMBERS_LOADING, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin$membersGroupVisitorClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.a6$c */
    public static final class C62633c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ List<C13604l<Integer, String>> f177880d;

        /* renamed from: e */
        public final /* synthetic */ boolean f177881e;

        /* renamed from: f */
        public final /* synthetic */ C62632a6 f177882f;

        /* renamed from: g */
        public final /* synthetic */ boolean f177883g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62633c(List<C13604l<Integer, String>> list, boolean z, C62632a6 a6Var, boolean z2) {
            super(0);
            this.f177880d = list;
            this.f177881e = z;
            this.f177882f = a6Var;
            this.f177883g = z2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:109:0x0262, code lost:
            if (r3 == false) goto L_0x087a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r26 = this;
                r0 = r26
                java.lang.Class<cl1.u> r1 = cl1.C55001u.class
                java.lang.Class<cl1.o> r2 = cl1.C54991o.class
                qj1.a6 r3 = r0.f177882f
                int r4 = r3.f177860K
                r5 = 3
                r6 = 2
                r7 = 1
                r8 = 0
                java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
                if (r4 != 0) goto L_0x001c
                android.widget.ImageView r4 = r3.f177876w
                android.graphics.drawable.Drawable r3 = r3.f177857H
                r4.setImageDrawable(r3)
                goto L_0x0037
            L_0x001c:
                if (r4 != r7) goto L_0x0026
                android.widget.ImageView r4 = r3.f177876w
                android.graphics.drawable.Drawable r3 = r3.f177858I
                r4.setImageDrawable(r3)
                goto L_0x0037
            L_0x0026:
                if (r4 != r5) goto L_0x0029
                goto L_0x002b
            L_0x0029:
                if (r4 != r6) goto L_0x002d
            L_0x002b:
                r4 = 1
                goto L_0x002e
            L_0x002d:
                r4 = 0
            L_0x002e:
                if (r4 == 0) goto L_0x0037
                android.widget.ImageView r4 = r3.f177876w
                android.graphics.drawable.Drawable r3 = r3.f177859J
                r4.setImageDrawable(r3)
            L_0x0037:
                qj1.a6 r3 = r0.f177882f
                java.util.List<rx3.l<java.lang.Integer, java.lang.String>> r4 = r0.f177880d
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                java.lang.String r11 = ""
                r10.<init>(r11)
                java.util.Iterator r4 = r4.iterator()
                r11 = 0
                r12 = 0
            L_0x0048:
                boolean r13 = r4.hasNext()
                if (r13 == 0) goto L_0x0222
                java.lang.Object r13 = r4.next()
                rx3.l r13 = (rx3.C13604l) r13
                A r15 = r13.f38555d
                java.lang.Number r15 = (java.lang.Number) r15
                int r15 = r15.intValue()
                java.lang.String r8 = "format(format, *args)"
                java.lang.String r14 = " · "
                if (r15 == r7) goto L_0x01b4
                if (r15 == r6) goto L_0x0155
                if (r15 == r5) goto L_0x00f2
                r5 = 4
                if (r15 == r5) goto L_0x008e
                r5 = 6
                if (r15 == r5) goto L_0x006e
                goto L_0x021c
            L_0x006e:
                int r5 = r10.length()
                if (r5 <= 0) goto L_0x0076
                r5 = 1
                goto L_0x0077
            L_0x0076:
                r5 = 0
            L_0x0077:
                if (r5 == 0) goto L_0x007c
                r10.append(r14)
            L_0x007c:
                android.view.ViewGroup r5 = r3.f166287d
                android.content.Context r5 = r5.getContext()
                r8 = 2131828680(0x7f111fc8, float:1.9290308E38)
                java.lang.String r5 = r5.getString(r8)
                r10.append(r5)
                goto L_0x021c
            L_0x008e:
                int r5 = r10.length()
                if (r5 <= 0) goto L_0x0096
                r5 = 1
                goto L_0x0097
            L_0x0096:
                r5 = 0
            L_0x0097:
                if (r5 == 0) goto L_0x009c
                r10.append(r14)
            L_0x009c:
                B r5 = r13.f38556e
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                if (r5 == 0) goto L_0x00ab
                int r5 = r5.length()
                if (r5 != 0) goto L_0x00a9
                goto L_0x00ab
            L_0x00a9:
                r5 = 0
                goto L_0x00ac
            L_0x00ab:
                r5 = 1
            L_0x00ac:
                if (r5 != 0) goto L_0x00b6
                B r5 = r13.f38556e
                java.lang.String r5 = (java.lang.String) r5
                r10.append(r5)
                goto L_0x00ed
            L_0x00b6:
                android.view.ViewGroup r5 = r3.f166287d
                android.content.Context r5 = r5.getContext()
                r12 = 2131829051(0x7f11213b, float:1.929106E38)
                java.lang.String r5 = r5.getString(r12)
                java.lang.String r12 = "root.context.getString(R…ive_wecoin_amount_in_hot)"
                gy3.C87412m.m108593f(r5, r12)
                java.lang.Object[] r12 = new java.lang.Object[r7]
                ok1.e r13 = ok1.C62042e.f176370a
                androidx.lifecycle.i0 r14 = r3.mo87696x0(r1)
                cl1.u r14 = (cl1.C55001u) r14
                te3.c21 r14 = r14.f154420q
                long r14 = r13.mo87096m0(r14)
                java.lang.String r13 = r13.mo87005G(r14)
                r14 = 0
                r12[r14] = r13
                java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r7)
                java.lang.String r5 = java.lang.String.format(r5, r12)
                gy3.C87412m.m108593f(r5, r8)
                r10.append(r5)
            L_0x00ed:
                r5 = 3
                r8 = 0
                r12 = 1
                goto L_0x0048
            L_0x00f2:
                int r5 = r10.length()
                if (r5 <= 0) goto L_0x00fa
                r5 = 1
                goto L_0x00fb
            L_0x00fa:
                r5 = 0
            L_0x00fb:
                if (r5 == 0) goto L_0x0100
                r10.append(r14)
            L_0x0100:
                B r5 = r13.f38556e
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                if (r5 == 0) goto L_0x010f
                int r5 = r5.length()
                if (r5 != 0) goto L_0x010d
                goto L_0x010f
            L_0x010d:
                r5 = 0
                goto L_0x0110
            L_0x010f:
                r5 = 1
            L_0x0110:
                if (r5 != 0) goto L_0x011a
                B r5 = r13.f38556e
                java.lang.String r5 = (java.lang.String) r5
                r10.append(r5)
                goto L_0x0150
            L_0x011a:
                android.view.ViewGroup r5 = r3.f166287d
                android.content.Context r5 = r5.getContext()
                r11 = 2131827983(0x7f111d0f, float:1.9288894E38)
                java.lang.String r5 = r5.getString(r11)
                java.lang.String r11 = "root.context.getString(R….finder_live_members_tip)"
                gy3.C87412m.m108593f(r5, r11)
                java.lang.Object[] r11 = new java.lang.Object[r7]
                ok1.e r13 = ok1.C62042e.f176370a
                androidx.lifecycle.i0 r14 = r3.mo87696x0(r1)
                cl1.u r14 = (cl1.C55001u) r14
                te3.c21 r14 = r14.f154420q
                int r14 = r14.f182393e
                long r14 = (long) r14
                java.lang.String r13 = r13.mo87005G(r14)
                r14 = 0
                r11[r14] = r13
                java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r7)
                java.lang.String r5 = java.lang.String.format(r5, r11)
                gy3.C87412m.m108593f(r5, r8)
                r10.append(r5)
            L_0x0150:
                r5 = 3
                r8 = 0
                r11 = 1
                goto L_0x0048
            L_0x0155:
                int r5 = r10.length()
                if (r5 <= 0) goto L_0x015d
                r5 = 1
                goto L_0x015e
            L_0x015d:
                r5 = 0
            L_0x015e:
                if (r5 == 0) goto L_0x0163
                r10.append(r14)
            L_0x0163:
                B r5 = r13.f38556e
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                if (r5 == 0) goto L_0x0172
                int r5 = r5.length()
                if (r5 != 0) goto L_0x0170
                goto L_0x0172
            L_0x0170:
                r5 = 0
                goto L_0x0173
            L_0x0172:
                r5 = 1
            L_0x0173:
                if (r5 != 0) goto L_0x017e
                B r5 = r13.f38556e
                java.lang.String r5 = (java.lang.String) r5
                r10.append(r5)
                goto L_0x021c
            L_0x017e:
                android.view.ViewGroup r5 = r3.f166287d
                android.content.Context r5 = r5.getContext()
                r13 = 2131827984(0x7f111d10, float:1.9288896E38)
                java.lang.String r5 = r5.getString(r13)
                java.lang.String r13 = "root.context.getString(c…r_live_members_total_tip)"
                gy3.C87412m.m108593f(r5, r13)
                java.lang.Object[] r13 = new java.lang.Object[r7]
                ok1.e r14 = ok1.C62042e.f176370a
                androidx.lifecycle.i0 r15 = r3.mo87696x0(r2)
                cl1.o r15 = (cl1.C54991o) r15
                int r15 = r15.f154242Q0
                long r6 = (long) r15
                java.lang.String r6 = r14.mo87005G(r6)
                r7 = 0
                r13[r7] = r6
                r6 = 1
                java.lang.Object[] r7 = java.util.Arrays.copyOf(r13, r6)
                java.lang.String r5 = java.lang.String.format(r5, r7)
                gy3.C87412m.m108593f(r5, r8)
                r10.append(r5)
                goto L_0x021c
            L_0x01b4:
                int r5 = r10.length()
                if (r5 <= 0) goto L_0x01bc
                r5 = 1
                goto L_0x01bd
            L_0x01bc:
                r5 = 0
            L_0x01bd:
                if (r5 == 0) goto L_0x01c2
                r10.append(r14)
            L_0x01c2:
                B r5 = r13.f38556e
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                if (r5 == 0) goto L_0x01d1
                int r5 = r5.length()
                if (r5 != 0) goto L_0x01cf
                goto L_0x01d1
            L_0x01cf:
                r5 = 0
                goto L_0x01d2
            L_0x01d1:
                r5 = 1
            L_0x01d2:
                if (r5 != 0) goto L_0x01dc
                B r5 = r13.f38556e
                java.lang.String r5 = (java.lang.String) r5
                r10.append(r5)
                goto L_0x021c
            L_0x01dc:
                android.view.ViewGroup r5 = r3.f166287d
                android.content.Context r5 = r5.getContext()
                r6 = 2131828649(0x7f111fa9, float:1.9290245E38)
                java.lang.String r5 = r5.getString(r6)
                java.lang.String r6 = "root.context.getString(R…purchase_user_count_tips)"
                gy3.C87412m.m108593f(r5, r6)
                r6 = 1
                java.lang.Object[] r7 = new java.lang.Object[r6]
                ok1.e r6 = ok1.C62042e.f176370a
                java.lang.Class<cl1.l> r13 = cl1.C0668l.class
                androidx.lifecycle.i0 r13 = r3.mo87696x0(r13)
                cl1.l r13 = (cl1.C0668l) r13
                te3.e61 r13 = r13.mo630d3()
                if (r13 == 0) goto L_0x0204
                int r13 = r13.f182922f
                goto L_0x0205
            L_0x0204:
                r13 = 0
            L_0x0205:
                long r13 = (long) r13
                java.lang.String r6 = r6.mo87005G(r13)
                r13 = 0
                r7[r13] = r6
                r6 = 1
                java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r6)
                java.lang.String r5 = java.lang.String.format(r5, r7)
                gy3.C87412m.m108593f(r5, r8)
                r10.append(r5)
            L_0x021c:
                r5 = 3
                r6 = 2
                r7 = 1
                r8 = 0
                goto L_0x0048
            L_0x0222:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r11)
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r12)
                java.lang.String r5 = r10.toString()
                java.lang.String r6 = "membersTvSb.toString()"
                gy3.C87412m.m108593f(r5, r6)
                boolean r3 = r3.booleanValue()
                r4.booleanValue()
                boolean r4 = r0.f177881e
                if (r4 != 0) goto L_0x0266
                qj1.a6 r4 = r0.f177882f
                boolean r6 = r4.mo87671e1()
                if (r6 != 0) goto L_0x0261
                boolean r6 = r4.f177871r
                if (r6 == 0) goto L_0x0261
                if (r3 != 0) goto L_0x0261
                androidx.lifecycle.i0 r3 = r4.mo87696x0(r2)
                cl1.o r3 = (cl1.C54991o) r3
                int r3 = r3.f154242Q0
                if (r3 != 0) goto L_0x0261
                int r3 = r4.f177863N
                r6 = 5
                if (r3 >= r6) goto L_0x0261
                r6 = 1
                int r3 = r3 + r6
                r4.f177863N = r3
                r3 = 0
                goto L_0x0262
            L_0x0261:
                r3 = 1
            L_0x0262:
                if (r3 != 0) goto L_0x0266
                goto L_0x087a
            L_0x0266:
                qj1.a6 r3 = r0.f177882f
                android.widget.TextView r3 = r3.f177872s
                r3.setText(r5)
                qj1.a6 r3 = r0.f177882f
                android.view.View r3 = r3.f177874u
                int r3 = r3.getVisibility()
                if (r3 == 0) goto L_0x02b9
                qj1.a6 r3 = r0.f177882f
                android.view.View r3 = r3.f177874u
                k20.a r4 = new k20.a
                r4.<init>()
                java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
                r4.mo10233c(r9)
                java.lang.Object[] r19 = r4.mo10232b()
                java.lang.String r20 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin$refreshViews$1"
                java.lang.String r21 = "invoke"
                java.lang.String r22 = "()V"
                java.lang.String r23 = "android/view/View_EXEC_"
                java.lang.String r24 = "setVisibility"
                java.lang.String r25 = "(I)V"
                r18 = r3
                j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
                r5 = 0
                java.lang.Object r4 = r4.mo10231a(r5)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r3.setVisibility(r4)
                java.lang.String r19 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin$refreshViews$1"
                java.lang.String r20 = "invoke"
                java.lang.String r21 = "()V"
                java.lang.String r22 = "android/view/View_EXEC_"
                java.lang.String r23 = "setVisibility"
                java.lang.String r24 = "(I)V"
                j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            L_0x02b9:
                qj1.a6 r3 = r0.f177882f
                android.view.View r4 = r3.f177874u
                r5 = 2131302554(0x7f09189a, float:1.8223197E38)
                android.widget.TextView r3 = r3.f177872s
                java.lang.CharSequence r3 = r3.getText()
                r4.setTag(r5, r3)
                boolean r3 = r0.f177883g
                r4 = 0
                r5 = 8
                if (r3 == 0) goto L_0x0757
                qj1.a6 r3 = r0.f177882f
                java.lang.Class<ak1.o> r6 = ak1.C54108o.class
                int r7 = r3.f177860K
                r8 = 2
                if (r7 == r8) goto L_0x02e6
                r8 = 3
                if (r7 != r8) goto L_0x02dd
                goto L_0x02e6
            L_0x02dd:
                int r7 = r3.f177851B
                java.util.regex.Pattern r8 = o40.C61926c.f176038a
                r7 = r7 & -9
                r3.f177851B = r7
                goto L_0x02ed
            L_0x02e6:
                int r7 = r3.f177851B
                java.util.regex.Pattern r8 = o40.C61926c.f176038a
                r7 = r7 | r5
                r3.f177851B = r7
            L_0x02ed:
                java.lang.String r7 = "android.intent.action.BATTERY_CHANGED"
                ok1.e r8 = ok1.C62042e.f176370a
                boolean r8 = r8.mo87030O0()
                if (r8 == 0) goto L_0x039b
                int r8 = r3.f177864P
                r10 = -1
                if (r8 <= r10) goto L_0x02fe
                r8 = 1
                goto L_0x02ff
            L_0x02fe:
                r8 = 0
            L_0x02ff:
                if (r8 == 0) goto L_0x039b
                android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0322 }
                android.content.IntentFilter r11 = new android.content.IntentFilter     // Catch:{ all -> 0x0322 }
                r11.<init>(r7)     // Catch:{ all -> 0x0322 }
                android.content.Intent r8 = r8.registerReceiver(r4, r11)     // Catch:{ all -> 0x0322 }
                if (r8 == 0) goto L_0x031c
                java.lang.String r11 = "plugged"
                int r8 = r8.getIntExtra(r11, r10)     // Catch:{ all -> 0x0322 }
                if (r8 != 0) goto L_0x031c
                r8 = 1
                r17 = 1
                goto L_0x031f
            L_0x031c:
                r8 = 1
                r17 = 0
            L_0x031f:
                r10 = r17 ^ 1
                goto L_0x0324
            L_0x0322:
                r10 = 0
            L_0x0324:
                ok1.e r8 = ok1.C62042e.f176370a
                java.lang.Integer r8 = r8.mo87029O()
                if (r8 == 0) goto L_0x0331
                int r8 = r8.intValue()
                goto L_0x0332
            L_0x0331:
                r8 = 0
            L_0x0332:
                android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x034e }
                android.content.IntentFilter r12 = new android.content.IntentFilter     // Catch:{ all -> 0x034e }
                r12.<init>(r7)     // Catch:{ all -> 0x034e }
                android.content.Intent r7 = r11.registerReceiver(r4, r12)     // Catch:{ all -> 0x034e }
                if (r7 == 0) goto L_0x034a
                java.lang.String r11 = "temperature"
                r12 = 0
                int r7 = r7.getIntExtra(r11, r12)     // Catch:{ all -> 0x034e }
                goto L_0x034b
            L_0x034a:
                r7 = 0
            L_0x034b:
                int r7 = r7 / 10
                goto L_0x0350
            L_0x034e:
                r7 = 0
            L_0x0350:
                if (r10 == 0) goto L_0x0363
                r11 = 25
                if (r8 < r11) goto L_0x0363
                int r11 = r3.f177864P
                if (r7 < r11) goto L_0x0363
                int r11 = r3.f177851B
                java.util.regex.Pattern r12 = o40.C61926c.f176038a
                r12 = 4
                r11 = r11 | r12
                r3.f177851B = r11
                goto L_0x036b
            L_0x0363:
                int r11 = r3.f177851B
                java.util.regex.Pattern r12 = o40.C61926c.f176038a
                r11 = r11 & -5
                r3.f177851B = r11
            L_0x036b:
                java.lang.String r11 = r3.f177870q
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "checkErrBarTemperature isCharging:"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r10 = " curBattery:"
                r12.append(r10)
                r12.append(r8)
                java.lang.String r8 = " temperature:"
                r12.append(r8)
                r12.append(r7)
                java.lang.String r7 = " temperatureThreshold:"
                r12.append(r7)
                int r7 = r3.f177864P
                r12.append(r7)
                java.lang.String r7 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r7)
            L_0x039b:
                int r7 = r3.mo87669c1()
                r8 = 1
                if (r7 == r8) goto L_0x0622
                r8 = 2
                if (r7 == r8) goto L_0x0587
                r8 = 4
                if (r7 == r8) goto L_0x04ec
                if (r7 == r5) goto L_0x0431
                android.view.View r7 = r3.f177875v
                k20.a r8 = new k20.a
                r8.<init>()
                java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
                r8.mo10233c(r9)
                java.lang.Object[] r19 = r8.mo10232b()
                java.lang.String r20 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin"
                java.lang.String r21 = "refreshErrBarTip"
                java.lang.String r22 = "()V"
                java.lang.String r23 = "android/view/View_EXEC_"
                java.lang.String r24 = "setVisibility"
                java.lang.String r25 = "(I)V"
                r18 = r7
                j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
                r9 = 0
                java.lang.Object r8 = r8.mo10231a(r9)
                java.lang.Integer r8 = (java.lang.Integer) r8
                int r8 = r8.intValue()
                r7.setVisibility(r8)
                java.lang.String r19 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin"
                java.lang.String r20 = "refreshErrBarTip"
                java.lang.String r21 = "()V"
                java.lang.String r22 = "android/view/View_EXEC_"
                java.lang.String r23 = "setVisibility"
                java.lang.String r24 = "(I)V"
                j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
                android.view.View r7 = r3.f177878y
                k20.a r15 = new k20.a
                r15.<init>()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
                r15.mo10233c(r8)
                java.lang.Object[] r9 = r15.mo10232b()
                java.lang.String r10 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin"
                java.lang.String r11 = "refreshErrBarTip"
                java.lang.String r12 = "()V"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r16 = "(I)V"
                r8 = r7
                r4 = r15
                r15 = r16
                j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
                r8 = 0
                java.lang.Object r4 = r4.mo10231a(r8)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r7.setVisibility(r4)
                java.lang.String r9 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin"
                java.lang.String r10 = "refreshErrBarTip"
                java.lang.String r11 = "()V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                r8 = r7
                j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
                goto L_0x06bb
            L_0x0431:
                android.view.View r4 = r3.f177878y
                int r4 = r4.getVisibility()
                if (r4 == 0) goto L_0x0451
                java.lang.Class<ht1.j5> r4 = ht1.C8777j5.class
                di3.d r4 = di3.C86312j.m106911c(r4)
                java.lang.String r7 = "getService(IHellLiveReport::class.java)"
                gy3.C87412m.m108593f(r4, r7)
                r10 = r4
                ht1.j5 r10 = (ht1.C8777j5) r10
                ak1.g0 r11 = ak1.C0073g0.NET_SPEED_LOW
                r13 = 0
                r14 = 4
                r15 = 0
                java.lang.String r12 = "1"
                ht1.C8777j5.C8778a.m8605f(r10, r11, r12, r13, r14, r15)
            L_0x0451:
                android.view.View r4 = r3.f177878y
                k20.a r7 = new k20.a
                r7.<init>()
                java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
                r7.mo10233c(r9)
                java.lang.Object[] r19 = r7.mo10232b()
                java.lang.String r20 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin"
                java.lang.String r21 = "refreshErrBarTip"
                java.lang.String r22 = "()V"
                java.lang.String r23 = "android/view/View_EXEC_"
                java.lang.String r24 = "setVisibility"
                java.lang.String r25 = "(I)V"
                r18 = r4
                j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
                r8 = 0
                java.lang.Object r7 = r7.mo10231a(r8)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
                r4.setVisibility(r7)
                java.lang.String r19 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin"
                java.lang.String r20 = "refreshErrBarTip"
                java.lang.String r21 = "()V"
                java.lang.String r22 = "android/view/View_EXEC_"
                java.lang.String r23 = "setVisibility"
                java.lang.String r24 = "(I)V"
                j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
                android.widget.TextView r4 = r3.f177879z
                android.view.ViewGroup r7 = r3.f166287d
                android.content.Context r7 = r7.getContext()
                android.content.res.Resources r7 = r7.getResources()
                r8 = 2131828196(0x7f111de4, float:1.9289326E38)
                java.lang.String r7 = r7.getString(r8)
                r4.setText(r7)
                android.view.View r4 = r3.f177875v
                k20.a r7 = new k20.a
                r7.<init>()
                r8 = 4
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r7.mo10233c(r8)
                java.lang.Object[] r9 = r7.mo10232b()
                java.lang.String r10 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin"
                java.lang.String r11 = "refreshErrBarTip"
                java.lang.String r12 = "()V"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r15 = "(I)V"
                r8 = r4
                j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
                r8 = 0
                java.lang.Object r7 = r7.mo10231a(r8)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
                r4.setVisibility(r7)
                java.lang.String r9 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin"
                java.lang.String r10 = "refreshErrBarTip"
                java.lang.String r11 = "()V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                r8 = r4
                j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
                goto L_0x06bb
            L_0x04ec:
                android.view.View r4 = r3.f177878y
                k20.a r7 = new k20.a
                r7.<init>()
                java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
                r7.mo10233c(r9)
                java.lang.Object[] r19 = r7.mo10232b()
                java.lang.String r20 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin"
                java.lang.String r21 = "refreshErrBarTip"
                java.lang.String r22 = "()V"
                java.lang.String r23 = "android/view/View_EXEC_"
                java.lang.String r24 = "setVisibility"
                java.lang.String r25 = "(I)V"
                r18 = r4
                j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
                r8 = 0
                java.lang.Object r7 = r7.mo10231a(r8)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
                r4.setVisibility(r7)
                java.lang.String r19 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin"
                java.lang.String r20 = "refreshErrBarTip"
                java.lang.String r21 = "()V"
                java.lang.String r22 = "android/view/View_EXEC_"
                java.lang.String r23 = "setVisibility"
                java.lang.String r24 = "(I)V"
                j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
                android.widget.TextView r4 = r3.f177879z
                android.view.ViewGroup r7 = r3.f166287d
                android.content.Context r7 = r7.getContext()
                android.content.res.Resources r7 = r7.getResources()
                r8 = 2131828909(0x7f1120ad, float:1.9290772E38)
                java.lang.String r7 = r7.getString(r8)
                r4.setText(r7)
                android.view.View r4 = r3.f177875v
                k20.a r7 = new k20.a
                r7.<init>()
                r8 = 4
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r7.mo10233c(r8)
                java.lang.Object[] r9 = r7.mo10232b()
                java.lang.String r10 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin"
                java.lang.String r11 = "refreshErrBarTip"
                java.lang.String r12 = "()V"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r15 = "(I)V"
                r8 = r4
                j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
                r8 = 0
                java.lang.Object r7 = r7.mo10231a(r8)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
                r4.setVisibility(r7)
                java.lang.String r9 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin"
                java.lang.String r10 = "refreshErrBarTip"
                java.lang.String r11 = "()V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                r8 = r4
                j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
                goto L_0x06bb
            L_0x0587:
                android.view.View r4 = r3.f177878y
                k20.a r7 = new k20.a
                r7.<init>()
                java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
                r7.mo10233c(r9)
                java.lang.Object[] r19 = r7.mo10232b()
                java.lang.String r20 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin"
                java.lang.String r21 = "refreshErrBarTip"
                java.lang.String r22 = "()V"
                java.lang.String r23 = "android/view/View_EXEC_"
                java.lang.String r24 = "setVisibility"
                java.lang.String r25 = "(I)V"
                r18 = r4
                j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
                r8 = 0
                java.lang.Object r7 = r7.mo10231a(r8)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
                r4.setVisibility(r7)
                java.lang.String r19 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin"
                java.lang.String r20 = "refreshErrBarTip"
                java.lang.String r21 = "()V"
                java.lang.String r22 = "android/view/View_EXEC_"
                java.lang.String r23 = "setVisibility"
                java.lang.String r24 = "(I)V"
                j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
                android.widget.TextView r4 = r3.f177879z
                android.view.ViewGroup r7 = r3.f166287d
                android.content.Context r7 = r7.getContext()
                android.content.res.Resources r7 = r7.getResources()
                r8 = 2131827058(0x7f111972, float:1.9287018E38)
                java.lang.String r7 = r7.getString(r8)
                r4.setText(r7)
                android.view.View r4 = r3.f177875v
                k20.a r7 = new k20.a
                r7.<init>()
                r8 = 4
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r7.mo10233c(r8)
                java.lang.Object[] r9 = r7.mo10232b()
                java.lang.String r10 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin"
                java.lang.String r11 = "refreshErrBarTip"
                java.lang.String r12 = "()V"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r15 = "(I)V"
                r8 = r4
                j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
                r8 = 0
                java.lang.Object r7 = r7.mo10231a(r8)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
                r4.setVisibility(r7)
                java.lang.String r9 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin"
                java.lang.String r10 = "refreshErrBarTip"
                java.lang.String r11 = "()V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                r8 = r4
                j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
                goto L_0x06bb
            L_0x0622:
                android.view.View r4 = r3.f177878y
                k20.a r7 = new k20.a
                r7.<init>()
                java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
                r7.mo10233c(r9)
                java.lang.Object[] r19 = r7.mo10232b()
                java.lang.String r20 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin"
                java.lang.String r21 = "refreshErrBarTip"
                java.lang.String r22 = "()V"
                java.lang.String r23 = "android/view/View_EXEC_"
                java.lang.String r24 = "setVisibility"
                java.lang.String r25 = "(I)V"
                r18 = r4
                j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
                r8 = 0
                java.lang.Object r7 = r7.mo10231a(r8)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
                r4.setVisibility(r7)
                java.lang.String r19 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin"
                java.lang.String r20 = "refreshErrBarTip"
                java.lang.String r21 = "()V"
                java.lang.String r22 = "android/view/View_EXEC_"
                java.lang.String r23 = "setVisibility"
                java.lang.String r24 = "(I)V"
                j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
                android.widget.TextView r4 = r3.f177879z
                android.view.ViewGroup r7 = r3.f166287d
                android.content.Context r7 = r7.getContext()
                android.content.res.Resources r7 = r7.getResources()
                r8 = 2131827057(0x7f111971, float:1.9287016E38)
                java.lang.String r7 = r7.getString(r8)
                r4.setText(r7)
                android.view.View r4 = r3.f177875v
                k20.a r7 = new k20.a
                r7.<init>()
                r8 = 4
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r7.mo10233c(r8)
                java.lang.Object[] r9 = r7.mo10232b()
                java.lang.String r10 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin"
                java.lang.String r11 = "refreshErrBarTip"
                java.lang.String r12 = "()V"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r15 = "(I)V"
                r8 = r4
                j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
                r8 = 0
                java.lang.Object r7 = r7.mo10231a(r8)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
                r4.setVisibility(r7)
                java.lang.String r9 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin"
                java.lang.String r10 = "refreshErrBarTip"
                java.lang.String r11 = "()V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                r8 = r4
                j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            L_0x06bb:
                android.widget.TextView r4 = r3.f177873t
                java.lang.String r7 = r3.f177861L
                java.lang.String r7 = java.lang.String.valueOf(r7)
                r4.setText(r7)
                d60.b r4 = r3.f177869p
                int r4 = r4.getLiveRole()
                r7 = 1
                if (r4 != r7) goto L_0x070b
                di3.d r4 = di3.C86312j.m106911c(r6)
                ak1.o r4 = (ak1.C54108o) r4
                r4.getClass()
                ak1.f0 r4 = ak1.C54108o.f151869h
                androidx.lifecycle.i0 r8 = r3.mo87696x0(r1)
                cl1.u r8 = (cl1.C55001u) r8
                te3.c21 r8 = r8.f154420q
                int r8 = r8.f182393e
                long r8 = (long) r8
                r4.f151441W = r8
                di3.d r8 = di3.C86312j.m106911c(r6)
                ak1.o r8 = (ak1.C54108o) r8
                r8.getClass()
                long r8 = r3.f177862M
                r10 = 1000(0x3e8, double:4.94E-321)
                long r8 = r8 * r10
                r4.f151442X = r8
                di3.d r6 = di3.C86312j.m106911c(r6)
                ak1.o r6 = (ak1.C54108o) r6
                r6.getClass()
                androidx.lifecycle.i0 r6 = r3.mo87696x0(r2)
                cl1.o r6 = (cl1.C54991o) r6
                long r8 = r6.f154276X
                r4.f151440V = r8
            L_0x070b:
                androidx.lifecycle.i0 r4 = r3.mo87696x0(r2)
                cl1.o r4 = (cl1.C54991o) r4
                boolean r4 = r4.f154190D
                if (r4 == 0) goto L_0x079d
                android.view.View r3 = r3.f177875v
                k20.a r4 = new k20.a
                r4.<init>()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
                r4.mo10233c(r6)
                java.lang.Object[] r9 = r4.mo10232b()
                java.lang.String r10 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin"
                java.lang.String r11 = "refreshViews$refreshRightCommonInfo"
                java.lang.String r12 = "(Lcom/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin;)V"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r15 = "(I)V"
                r8 = r3
                j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
                r6 = 0
                java.lang.Object r4 = r4.mo10231a(r6)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r3.setVisibility(r4)
                java.lang.String r9 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin"
                java.lang.String r10 = "refreshViews$refreshRightCommonInfo"
                java.lang.String r11 = "(Lcom/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin;)V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
                goto L_0x079d
            L_0x0757:
                r7 = 1
                qj1.a6 r3 = r0.f177882f
                android.view.View r3 = r3.f177875v
                k20.a r4 = new k20.a
                r4.<init>()
                java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
                java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
                r4.mo10233c(r6)
                java.lang.Object[] r9 = r4.mo10232b()
                java.lang.String r10 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin$refreshViews$1"
                java.lang.String r11 = "invoke"
                java.lang.String r12 = "()V"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r15 = "(I)V"
                r8 = r3
                j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
                r6 = 0
                java.lang.Object r4 = r4.mo10231a(r6)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r3.setVisibility(r4)
                java.lang.String r9 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin$refreshViews$1"
                java.lang.String r10 = "invoke"
                java.lang.String r11 = "()V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            L_0x079d:
                qj1.a6 r3 = r0.f177882f
                ok1.e r4 = ok1.C62042e.f176370a
                fj1.b r6 = r3.mo87684A0()
                r4.getClass()
                java.lang.String r8 = "buContext"
                gy3.C87412m.m108594g(r6, r8)
                pe1.c<java.lang.Integer> r8 = gg1.C32444a.f86133d
                java.lang.Object r9 = r8.mo60266n()
                java.lang.Number r9 = (java.lang.Number) r9
                int r9 = r9.intValue()
                if (r9 <= 0) goto L_0x07cc
                java.lang.Object r6 = r8.mo60266n()
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                r8 = 2
                if (r6 != r8) goto L_0x07ca
                r6 = 1
                goto L_0x07d4
            L_0x07ca:
                r6 = 0
                goto L_0x07d4
            L_0x07cc:
                androidx.lifecycle.i0 r6 = r6.mo71262a(r2)
                cl1.o r6 = (cl1.C54991o) r6
                boolean r6 = r6.f154193D3
            L_0x07d4:
                if (r6 != 0) goto L_0x07d7
                goto L_0x0809
            L_0x07d7:
                boolean r6 = r3.mo87671e1()
                if (r6 != 0) goto L_0x080a
                java.lang.Class<cl1.t1> r6 = cl1.C0690t1.class
                androidx.lifecycle.i0 r6 = r3.mo87696x0(r6)
                cl1.t1 r6 = (cl1.C0690t1) r6
                boolean r6 = r6.f1633p
                if (r6 == 0) goto L_0x07ea
                goto L_0x080a
            L_0x07ea:
                androidx.lifecycle.i0 r2 = r3.mo87696x0(r2)
                cl1.o r2 = (cl1.C54991o) r2
                boolean r2 = r2.mo75963I3()
                if (r2 == 0) goto L_0x0809
                androidx.lifecycle.i0 r1 = r3.mo87696x0(r1)
                cl1.u r1 = (cl1.C55001u) r1
                te3.c21 r1 = r1.f154420q
                long r1 = r4.mo87096m0(r1)
                r3 = 0
                int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r6 <= 0) goto L_0x0809
                goto L_0x080a
            L_0x0809:
                r7 = 0
            L_0x080a:
                r1 = 2131302553(0x7f091899, float:1.8223195E38)
                if (r7 == 0) goto L_0x0838
                qj1.a6 r2 = r0.f177882f
                android.view.View r3 = r2.f177874u
                qj1.a6$b r2 = r2.f177868T
                r3.setOnClickListener(r2)
                qj1.a6 r2 = r0.f177882f
                android.view.View r2 = r2.f177874u
                java.lang.String r3 = "finder_live_room_hot_list"
                l31.C10460a.m10392a(r2, r3)
                r3 = 25561(0x63d9, float:3.5819E-41)
                l31.C10460a.m10394c(r2, r5, r3)
                qj1.a6 r2 = r0.f177882f
                android.view.View r2 = r2.f177874u
                java.lang.Boolean r3 = java.lang.Boolean.TRUE
                r2.setTag(r1, r3)
                qj1.a6 r1 = r0.f177882f
                android.widget.ImageView r1 = r1.f177877x
                r2 = 0
                r1.setVisibility(r2)
                goto L_0x0850
            L_0x0838:
                qj1.a6 r2 = r0.f177882f
                android.view.View r2 = r2.f177874u
                r3 = 0
                r2.setOnClickListener(r3)
                qj1.a6 r2 = r0.f177882f
                android.view.View r2 = r2.f177874u
                java.lang.Boolean r3 = java.lang.Boolean.FALSE
                r2.setTag(r1, r3)
                qj1.a6 r1 = r0.f177882f
                android.widget.ImageView r1 = r1.f177877x
                r1.setVisibility(r5)
            L_0x0850:
                qj1.a6 r1 = r0.f177882f
                android.view.View r1 = r1.f177875v
                int r1 = r1.getVisibility()
                if (r1 != r5) goto L_0x086f
                qj1.a6 r1 = r0.f177882f
                android.view.View r1 = r1.f177878y
                int r1 = r1.getVisibility()
                if (r1 != r5) goto L_0x086f
                qj1.a6 r1 = r0.f177882f
                android.widget.Space r1 = r1.f177850A
                if (r1 != 0) goto L_0x086b
                goto L_0x087a
            L_0x086b:
                r1.setVisibility(r5)
                goto L_0x087a
            L_0x086f:
                qj1.a6 r1 = r0.f177882f
                android.widget.Space r1 = r1.f177850A
                if (r1 != 0) goto L_0x0876
                goto L_0x087a
            L_0x0876:
                r2 = 0
                r1.setVisibility(r2)
            L_0x087a:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C62632a6.C62633c.invoke():java.lang.Object");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C62632a6(android.view.ViewGroup r20, d60.C58124b r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.lang.String r3 = "root"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "statusMonitor"
            gy3.C87412m.m108594g(r2, r3)
            r3 = 0
            r0.<init>(r1, r2, r3)
            r0.f177869p = r2
            java.lang.String r2 = "Finder.FinderLiveCommonInfoPlugin"
            r0.f177870q = r2
            gg1.a r4 = gg1.C32444a.f86121a
            pe1.c<java.lang.Integer> r4 = gg1.C32444a.f86166l0
            java.lang.Object r4 = r4.mo60266n()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L_0x002f
            r4 = 1
            goto L_0x0030
        L_0x002f:
            r4 = 0
        L_0x0030:
            r0.f177871r = r4
            r4 = 2131307546(0x7f092c1a, float:1.8233322E38)
            android.view.View r4 = r1.findViewById(r4)
            java.lang.String r7 = "root.findViewById(R.id.l…e_common_info_members_tv)"
            gy3.C87412m.m108593f(r4, r7)
            r10 = r4
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0.f177872s = r10
            r4 = 2131307536(0x7f092c10, float:1.8233302E38)
            android.view.View r4 = r1.findViewById(r4)
            java.lang.String r7 = "root.findViewById(R.id.l…_common_info_duration_tv)"
            gy3.C87412m.m108593f(r4, r7)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0.f177873t = r4
            r7 = 2131307544(0x7f092c18, float:1.8233318E38)
            android.view.View r7 = r1.findViewById(r7)
            java.lang.String r8 = "root.findViewById(R.id.l…ommon_info_members_group)"
            gy3.C87412m.m108593f(r7, r8)
            r0.f177874u = r7
            r8 = 2131307534(0x7f092c0e, float:1.8233298E38)
            android.view.View r8 = r1.findViewById(r8)
            java.lang.String r9 = "root.findViewById(R.id.l…mmon_info_duration_group)"
            gy3.C87412m.m108593f(r8, r9)
            r0.f177875v = r8
            r8 = 2131307535(0x7f092c0f, float:1.82333E38)
            android.view.View r8 = r1.findViewById(r8)
            java.lang.String r9 = "root.findViewById(R.id.l…ommon_info_duration_icon)"
            gy3.C87412m.m108593f(r8, r9)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r0.f177876w = r8
            r8 = 2131307533(0x7f092c0d, float:1.8233296E38)
            android.view.View r8 = r1.findViewById(r8)
            java.lang.String r9 = "root.findViewById(R.id.l…e_common_info_arrow_icon)"
            gy3.C87412m.m108593f(r8, r9)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r0.f177877x = r8
            r8 = 2131307541(0x7f092c15, float:1.8233312E38)
            android.view.View r8 = r1.findViewById(r8)
            java.lang.String r9 = "root.findViewById(R.id.l…mon_info_low_speed_group)"
            gy3.C87412m.m108593f(r8, r9)
            r0.f177878y = r8
            r9 = 2131307543(0x7f092c17, float:1.8233316E38)
            android.view.View r9 = r1.findViewById(r9)
            java.lang.String r11 = "root.findViewById(R.id.l…common_info_low_speed_tv)"
            gy3.C87412m.m108593f(r9, r11)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0.f177879z = r9
            r11 = 2131296972(0x7f0902cc, float:1.8211876E38)
            android.view.View r11 = r1.findViewById(r11)
            android.widget.Space r11 = (android.widget.Space) r11
            r0.f177850A = r11
            qj1.a r11 = new qj1.a
            r12 = 3
            r11.<init>(r6, r3, r12, r3)
            r0.f177852C = r11
            qj1.a r11 = new qj1.a
            r11.<init>(r6, r3, r12, r3)
            r0.f177853D = r11
            qj1.a r11 = new qj1.a
            r11.<init>(r6, r3, r12, r3)
            r0.f177854E = r11
            r11 = 2131296973(0x7f0902cd, float:1.8211878E38)
            android.view.View r15 = r1.findViewById(r11)
            r0.f177855F = r15
            r11 = 2131300043(0x7f090ecb, float:1.8218104E38)
            android.view.View r14 = r1.findViewById(r11)
            r0.f177856G = r14
            r11 = 2131756567(0x7f100617, float:1.9144045E38)
            android.graphics.drawable.Drawable r11 = r0.mo87670d1(r11)
            r0.f177857H = r11
            r11 = 2131756568(0x7f100618, float:1.9144047E38)
            android.graphics.drawable.Drawable r11 = r0.mo87670d1(r11)
            r0.f177858I = r11
            r11 = 2131756566(0x7f100616, float:1.9144043E38)
            android.graphics.drawable.Drawable r11 = r0.mo87670d1(r11)
            r0.f177859J = r11
            r0.f177860K = r6
            java.lang.String r11 = "00:00:00"
            r0.f177861L = r11
            r0.f177863N = r5
            pe1.c<java.lang.Integer> r5 = gg1.C32444a.f86087O1
            java.lang.Object r5 = r5.mo60266n()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r0.f177864P = r5
            pe1.c<java.lang.Integer> r5 = gg1.C32444a.f86090P1
            java.lang.Object r5 = r5.mo60266n()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r0.f177865Q = r5
            pe1.c<java.lang.Integer> r5 = gg1.C32444a.f86093Q1
            java.lang.Object r5 = r5.mo60266n()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r0.f177866R = r5
            pe1.c<java.lang.Integer> r5 = gg1.C32444a.f86096R1
            java.lang.Object r5 = r5.mo60266n()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r0.f177867S = r5
            qj1.a6$b r5 = new qj1.a6$b
            r5.<init>(r0)
            r0.f177868T = r5
            boolean r11 = r19.mo87671e1()
            if (r11 == 0) goto L_0x0153
            r7.setOnClickListener(r5)
            r5 = 2131302553(0x7f091899, float:1.8223195E38)
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r7.setTag(r5, r11)
        L_0x0153:
            qj1.a6$a r5 = new qj1.a6$a
            r5.<init>(r0)
            r8.setOnClickListener(r5)
            android.content.Context r5 = r20.getContext()
            r8 = 12
            int r5 = kg3.C76577a.m92151b(r5, r8)
            float r5 = (float) r5
            r9.setTextSize(r6, r5)
            wc1.b r5 = wc1.C15064b.f41199a
            android.content.Context r9 = r20.getContext()
            java.lang.String r13 = "root.context"
            gy3.C87412m.m108593f(r9, r13)
            r11 = 1096810496(0x41600000, float:14.0)
            r12 = 0
            r16 = 8
            r17 = 0
            r8 = r5
            r3 = r13
            r13 = r16
            r18 = r14
            r14 = r17
            wc1.C15064b.m14230a(r8, r9, r10, r11, r12, r13, r14)
            android.content.Context r12 = r20.getContext()
            gy3.C87412m.m108593f(r12, r3)
            r14 = 1096810496(0x41600000, float:14.0)
            r1 = 0
            r11 = r5
            r13 = r4
            r3 = r15
            r15 = r1
            wc1.C15064b.m14230a(r11, r12, r13, r14, r15, r16, r17)
            boolean r1 = r19.mo82893g0()
            if (r1 != 0) goto L_0x01c2
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            boolean r4 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r4 == 0) goto L_0x01a8
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r1
            goto L_0x01a9
        L_0x01a8:
            r1 = 0
        L_0x01a9:
            if (r1 == 0) goto L_0x01c2
            ok1.e r4 = ok1.C62042e.f176370a
            boolean r4 = r4.mo87027N0()
            if (r4 == 0) goto L_0x01ba
            if (r3 == 0) goto L_0x01c0
            int r6 = r3.getId()
            goto L_0x01c0
        L_0x01ba:
            if (r18 == 0) goto L_0x01c0
            int r6 = r18.getId()
        L_0x01c0:
            r1.f44445f = r6
        L_0x01c2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "filterVisitorResetValue:"
            r1.append(r3)
            boolean r3 = r0.f177871r
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62632a6.<init>(android.view.ViewGroup, d60.b):void");
    }

    /* renamed from: U0 */
    public void mo12048U0() {
        Class cls = C0690t1.class;
        Class cls2 = C54991o.class;
        C62042e eVar = C62042e.f176370a;
        if (!eVar.mo87030O0()) {
            LinkedList linkedList = new LinkedList();
            if (eVar.mo87090j1(mo87684A0())) {
                linkedList.add(new C13604l(6, null));
            } else {
                linkedList.add(new C13604l(2, null));
                if (((C0690t1) mo87696x0(cls)).f1633p || ((C54991o) mo87696x0(cls2)).f154190D) {
                    linkedList.add(new C13604l(3, null));
                }
                if (((C54991o) mo87696x0(cls2)).f154243Q1 && ((C54991o) mo87696x0(cls2)).mo75963I3() && (((C0690t1) mo87696x0(cls)).f1633p || eVar.mo87096m0(((C55001u) mo87696x0(C55001u.class)).f154420q) > 0)) {
                    linkedList.add(new C13604l(4, null));
                }
            }
            mo87672f1(linkedList, false, false);
        }
    }

    /* renamed from: Z0 */
    public final void mo87666Z0(Bundle bundle) {
        int i;
        int i2;
        if (C62042e.f176370a.mo87030O0()) {
            int i3 = bundle != null ? bundle.getInt("NET_STATUS_AUDIO_STATE", 0) : 0;
            boolean z = true;
            if (this.f177865Q > -1) {
                this.f177852C.f35310b.add(Integer.valueOf(i3));
            }
            if (this.f177866R > -1) {
                this.f177853D.f35310b.add(Integer.valueOf(i3));
            }
            if (this.f177867S > -1) {
                this.f177854E.f35310b.add(Integer.valueOf(i3));
            }
            if (this.f177852C.f35310b.size() == this.f177865Q) {
                C12237a aVar = this.f177852C;
                aVar.f35309a = true;
                boolean z2 = true;
                for (Number intValue : aVar.f35310b) {
                    if (intValue.intValue() != 1) {
                        z2 = false;
                    }
                }
                String str = this.f177870q;
                Log.m105924i(str, "checkErrBarSilentAudio silent:" + z2);
                if (z2) {
                    int i4 = this.f177851B;
                    Pattern pattern = C61926c.f176038a;
                    i2 = i4 | 2;
                } else {
                    int i5 = this.f177851B;
                    Pattern pattern2 = C61926c.f176038a;
                    i2 = i5 & -3;
                }
                this.f177851B = i2;
                this.f177852C.f35310b.clear();
                this.f177852C.f35309a = false;
            }
            if (this.f177853D.f35310b.size() == this.f177866R) {
                C12237a aVar2 = this.f177853D;
                aVar2.f35309a = true;
                boolean z3 = false;
                for (Number intValue2 : aVar2.f35310b) {
                    if (intValue2.intValue() == 2) {
                        z3 = true;
                    }
                }
                String str2 = this.f177870q;
                Log.m105924i(str2, "checkErrBarMaxAudio audioOverflow:" + z3);
                if (z3) {
                    int i6 = this.f177851B;
                    Pattern pattern3 = C61926c.f176038a;
                    i = i6 | 1;
                } else {
                    int i7 = this.f177851B;
                    Pattern pattern4 = C61926c.f176038a;
                    i = i7 & -2;
                }
                this.f177851B = i;
                this.f177853D.f35310b.clear();
                this.f177853D.f35309a = false;
            }
            if (this.f177854E.f35310b.size() == this.f177867S) {
                C12237a aVar3 = this.f177854E;
                aVar3.f35309a = true;
                int i8 = 0;
                for (Number intValue3 : aVar3.f35310b) {
                    if (intValue3.intValue() == 3) {
                        i8++;
                    }
                }
                String str3 = this.f177870q;
                Log.m105924i(str3, "checkBreakAudio breakCount:" + i8);
                if (i8 < C32444a.f86099S1.mo60266n().intValue()) {
                    z = false;
                }
                if (z) {
                    C60735a b = C62042e.f176370a.mo87030O0() ? FinderLiveService.f159376d.mo77626b() : FinderLiveService.f159376d.mo77631e0();
                    C54655b bVar = b instanceof C54655b ? (C54655b) b : null;
                    if (bVar != null) {
                        Log.m105924i("MicroMsg.LiveCoreAnchor", "restartAudioDevice");
                        bVar.mo85679W().callExperimentalAPI("");
                    }
                }
                this.f177854E.f35310b.clear();
                this.f177854E.f35309a = false;
            }
        }
    }

    /* renamed from: a1 */
    public final void mo87667a1(int i) {
        if (C86709a0.m107523b().mo121114l()) {
            int e = C31543z5.m39455e() - i;
            this.f177861L = C15936n0.C15937a.m14866a(C15936n0.f42815a, e, XVFSFile.PATH_SEPARATOR, false, false, false, 28, (Object) null);
            this.f177862M = e > 0 ? (long) e : 0;
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: b1 */
    public final void mo87668b1() {
        C62042e eVar = C62042e.f176370a;
        boolean z = false;
        if (eVar.mo87073d1(mo87684A0()) || eVar.mo87035Q0(mo87684A0())) {
            if (C60251a.f171781k1 == null) {
                Log.printInfoStack("MicroMsg.LiveCoreSecondaryDevice", "createInstance", new Object[0]);
                C60251a.f171781k1 = new C60251a();
            }
            C60251a aVar = C60251a.f171781k1;
            C87412m.m108591d(aVar);
            this.f177860K = aVar.f172989A.f166265l;
            return;
        }
        if (C54655b.f153178f1 != null) {
            z = true;
        }
        if (z) {
            if (C54655b.f153178f1 == null) {
                C54655b.f153178f1 = new C54655b();
            }
            C54655b bVar = C54655b.f153178f1;
            C87412m.m108591d(bVar);
            this.f177860K = bVar.f172989A.f166265l;
        }
    }

    /* renamed from: c1 */
    public final int mo87669c1() {
        if (C61926c.m72696u(this.f177851B, 2)) {
            return 2;
        }
        if (C61926c.m72696u(this.f177851B, 8)) {
            return 8;
        }
        if (C61926c.m72696u(this.f177851B, 4)) {
            return 4;
        }
        return C61926c.m72696u(this.f177851B, 1) ? 1 : 0;
    }

    /* renamed from: d1 */
    public final Drawable mo87670d1(int i) {
        Drawable drawable = this.f166287d.getContext().getResources().getDrawable(i);
        C87412m.m108593f(drawable, "root.context.resources.getDrawable(resId)");
        return drawable;
    }

    /* renamed from: e1 */
    public final boolean mo87671e1() {
        return C62042e.f176370a.mo87027N0() || ((C54991o) mo87696x0(C54991o.class)).f154190D;
    }

    /* renamed from: f1 */
    public final void mo87672f1(List<C13604l<Integer, String>> list, boolean z, boolean z2) {
        C87412m.m108594g(list, "refreshMembersConfig");
        C61926c.m72668M(new C62633c(list, z2, this, z));
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }

    /* renamed from: t0 */
    public void mo82897t0() {
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        View findViewById;
        View findViewById2;
        C87412m.m108594g(bVar, "status");
        super.mo3210u0(bVar, bundle);
        int ordinal = bVar.ordinal();
        if (ordinal == 7) {
            mo12048U0();
        } else if (ordinal == 27) {
            mo10792g(8);
        } else if (ordinal != 214) {
            if (ordinal == 215 && !mo82893g0() && (findViewById2 = this.f166287d.findViewById(C0966R.C0970id.np5)) != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = findViewById2;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "statusChange", "(Lcom/tencent/mm/live/plugin/ILiveStatus$LiveStatus;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "statusChange", "(Lcom/tencent/mm/live/plugin/ILiveStatus$LiveStatus;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (!mo82893g0() && (findViewById = this.f166287d.findViewById(C0966R.C0970id.np5)) != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(4);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "statusChange", "(Lcom/tencent/mm/live/plugin/ILiveStatus$LiveStatus;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "statusChange", "(Lcom/tencent/mm/live/plugin/ILiveStatus$LiveStatus;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: v0 */
    public void mo12287v0() {
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        this.f177851B = 0;
        this.f177852C.f35310b.clear();
        this.f177853D.f35310b.clear();
        this.f177854E.f35310b.clear();
    }
}
