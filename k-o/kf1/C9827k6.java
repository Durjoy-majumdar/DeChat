package kf1;

import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.FinderPoiFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.storage.FinderConfigForNewLiveCardStyle;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import di3.C86312j;
import dq1.C7461a;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60896i;
import jq3.C9500j;
import ns3.C11264b;
import ns3.C11266d;
import o40.C61926c;
import p204mr.C11078h;
import rx3.C13598b0;

/* renamed from: kf1.k6 */
public final class C9827k6 extends C9732g {

    /* renamed from: h */
    public C11078h f30378h;

    /* renamed from: i */
    public boolean f30379i;

    /* renamed from: kf1.k6$a */
    public static final class C9828a extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9827k6 f30380d;

        /* renamed from: e */
        public final /* synthetic */ MMActivity f30381e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9828a(C9827k6 k6Var, MMActivity mMActivity) {
            super(1);
            this.f30380d = k6Var;
            this.f30381e = mMActivity;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v38, resolved type: com.tencent.mm.view.RefreshLoadMoreLayout} */
        /* JADX WARNING: type inference failed for: r4v1, types: [com.tencent.mm.view.RefreshLoadMoreLayout] */
        /* JADX WARNING: type inference failed for: r4v2 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r40) {
            /*
                r39 = this;
                r0 = r39
                r1 = r40
                com.tencent.mm.plugin.finder.feed.model.internal.IResponse r1 = (com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse) r1
                java.lang.String r2 = "it"
                gy3.C87412m.m108594g(r1, r2)
                kf1.k6 r2 = r0.f30380d
                kf1.h r2 = r2.f30176f
                boolean r3 = r2 instanceof kf1.C9840l6
                if (r3 == 0) goto L_0x0016
                kf1.l6 r2 = (kf1.C9840l6) r2
                goto L_0x0017
            L_0x0016:
                r2 = 0
            L_0x0017:
                r12 = 0
                if (r2 == 0) goto L_0x05e3
                boolean r5 = r1 instanceof com.tencent.p014mm.plugin.finder.feed.model.FinderPoiFeedLoader.C2728a
                if (r5 != 0) goto L_0x0020
                goto L_0x05e3
            L_0x0020:
                r13 = r1
                com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader$a r13 = (com.tencent.p014mm.plugin.finder.feed.model.FinderPoiFeedLoader.C2728a) r13
                te3.z74 r5 = r13.f13773a
                if (r5 == 0) goto L_0x05e3
                te3.qe3 r14 = r5.f145743d
                if (r14 == 0) goto L_0x05e3
                android.view.View r5 = r2.f30409u
                if (r5 == 0) goto L_0x0039
                r6 = 2131307893(0x7f092d75, float:1.8234026E38)
                android.view.View r5 = r5.findViewById(r6)
                android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
                goto L_0x003a
            L_0x0039:
                r5 = 0
            L_0x003a:
                if (r5 != 0) goto L_0x003d
                goto L_0x0040
            L_0x003d:
                r5.setVisibility(r12)
            L_0x0040:
                android.view.View r5 = r2.f30409u
                if (r5 == 0) goto L_0x004f
                r6 = 2131311084(0x7f0939ec, float:1.8240498E38)
                android.view.View r5 = r5.findViewById(r6)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r6 = r5
                goto L_0x0050
            L_0x004f:
                r6 = 0
            L_0x0050:
                if (r6 == 0) goto L_0x005a
                kf1.s6 r5 = new kf1.s6
                r5.<init>(r2)
                zp3.C23564m.m28138h(r6, r5)
            L_0x005a:
                android.view.View r5 = r2.f30409u
                if (r5 == 0) goto L_0x0069
                r7 = 2131311085(0x7f0939ed, float:1.82405E38)
                android.view.View r5 = r5.findViewById(r7)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r15 = r5
                goto L_0x006a
            L_0x0069:
                r15 = 0
            L_0x006a:
                android.view.View r5 = r2.f30409u
                if (r5 == 0) goto L_0x0079
                r7 = 2131311064(0x7f0939d8, float:1.8240458E38)
                android.view.View r5 = r5.findViewById(r7)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r11 = r5
                goto L_0x007a
            L_0x0079:
                r11 = 0
            L_0x007a:
                android.view.View r5 = r2.f30409u
                if (r5 == 0) goto L_0x0089
                r7 = 2131311077(0x7f0939e5, float:1.8240484E38)
                android.view.View r5 = r5.findViewById(r7)
                com.tencent.mm.ui.widget.imageview.WeImageView r5 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r5
                r10 = r5
                goto L_0x008a
            L_0x0089:
                r10 = 0
            L_0x008a:
                android.view.View r5 = r2.f30409u
                if (r5 == 0) goto L_0x0099
                r7 = 2131311079(0x7f0939e7, float:1.8240488E38)
                android.view.View r5 = r5.findViewById(r7)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r9 = r5
                goto L_0x009a
            L_0x0099:
                r9 = 0
            L_0x009a:
                android.view.View r5 = r2.f30409u
                if (r5 == 0) goto L_0x00a9
                r7 = 2131311083(0x7f0939eb, float:1.8240496E38)
                android.view.View r5 = r5.findViewById(r7)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r8 = r5
                goto L_0x00aa
            L_0x00a9:
                r8 = 0
            L_0x00aa:
                android.view.View r5 = r2.f30409u
                if (r5 == 0) goto L_0x00b9
                r7 = 2131307913(0x7f092d89, float:1.8234067E38)
                android.view.View r5 = r5.findViewById(r7)
                android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
                r7 = r5
                goto L_0x00ba
            L_0x00b9:
                r7 = 0
            L_0x00ba:
                android.view.View r5 = r2.f30409u
                if (r5 == 0) goto L_0x00c8
                r3 = 2131311065(0x7f0939d9, float:1.824046E38)
                android.view.View r3 = r5.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                goto L_0x00c9
            L_0x00c8:
                r3 = 0
            L_0x00c9:
                android.view.View r5 = r2.f30409u
                if (r5 == 0) goto L_0x00d7
                r4 = 2131311082(0x7f0939ea, float:1.8240494E38)
                android.view.View r4 = r5.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                goto L_0x00d8
            L_0x00d7:
                r4 = 0
            L_0x00d8:
                android.view.View r5 = r2.f30409u
                if (r5 == 0) goto L_0x00e7
                r12 = 2131311086(0x7f0939ee, float:1.8240502E38)
                android.view.View r5 = r5.findViewById(r12)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r12 = r5
                goto L_0x00e8
            L_0x00e7:
                r12 = 0
            L_0x00e8:
                android.view.View r5 = r2.f30409u
                r16 = r7
                if (r5 == 0) goto L_0x00f7
                r7 = 2131301075(0x7f0912d3, float:1.8220198E38)
                android.view.View r5 = r5.findViewById(r7)
                r7 = r5
                goto L_0x00f8
            L_0x00f7:
                r7 = 0
            L_0x00f8:
                android.view.View r5 = r2.f30409u
                r17 = r7
                if (r5 == 0) goto L_0x0109
                r7 = 2131316145(0x7f094db1, float:1.8250763E38)
                android.view.View r5 = r5.findViewById(r7)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r7 = r5
                goto L_0x010a
            L_0x0109:
                r7 = 0
            L_0x010a:
                android.view.View r5 = r2.f30409u
                r18 = r7
                if (r5 == 0) goto L_0x011b
                r7 = 2131297776(0x7f0905f0, float:1.8213506E38)
                android.view.View r5 = r5.findViewById(r7)
                android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
                r7 = r5
                goto L_0x011c
            L_0x011b:
                r7 = 0
            L_0x011c:
                android.view.View r5 = r2.f30409u
                r19 = r7
                if (r5 == 0) goto L_0x012d
                r7 = 2131306739(0x7f0928f3, float:1.8231686E38)
                android.view.View r5 = r5.findViewById(r7)
                android.widget.ImageView r5 = (android.widget.ImageView) r5
                r7 = r5
                goto L_0x012e
            L_0x012d:
                r7 = 0
            L_0x012e:
                android.view.View r5 = r2.f30409u
                r20 = r7
                if (r5 == 0) goto L_0x013f
                r7 = 2131315724(0x7f094c0c, float:1.824991E38)
                android.view.View r5 = r5.findViewById(r7)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r7 = r5
                goto L_0x0140
            L_0x013f:
                r7 = 0
            L_0x0140:
                android.view.View r5 = r2.f30409u
                r21 = r7
                if (r5 == 0) goto L_0x0151
                r7 = 2131306738(0x7f0928f2, float:1.8231684E38)
                android.view.View r5 = r5.findViewById(r7)
                android.widget.ImageView r5 = (android.widget.ImageView) r5
                r7 = r5
                goto L_0x0152
            L_0x0151:
                r7 = 0
            L_0x0152:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r22 = r5
                te3.z74 r5 = r13.f13773a
                if (r5 == 0) goto L_0x017e
                int r5 = r5.f145744e
                r2.f30412x = r5
                r23 = r7
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r24 = r8
                java.lang.String r8 = "refreshHeader poiSourceFlag:"
                r7.append(r8)
                r7.append(r5)
                java.lang.String r5 = r7.toString()
                java.lang.String r7 = "Finder.FinderPoiFeedUIContract.PoiFeedViewCallback"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
                rx3.b0 r5 = rx3.C13598b0.f38549a
                goto L_0x0182
            L_0x017e:
                r23 = r7
                r24 = r8
            L_0x0182:
                te3.je3 r5 = r14.f140264d
                if (r5 == 0) goto L_0x0194
                te3.se3 r7 = r5.f136054f
                if (r7 == 0) goto L_0x0194
                float r8 = r7.f141463e
                r2.f30402A = r8
                float r7 = r7.f141462d
                r2.f30403B = r7
                rx3.b0 r7 = rx3.C13598b0.f38549a
            L_0x0194:
                if (r5 == 0) goto L_0x019a
                java.lang.String r5 = r5.f136053e
                r7 = r5
                goto L_0x019b
            L_0x019a:
                r7 = 0
            L_0x019b:
                r8 = 0
                r25 = 0
                r26 = 12
                r27 = 0
                r29 = r22
                r5 = r2
                r30 = r16
                r31 = r17
                r32 = r18
                r33 = r19
                r34 = r20
                r35 = r21
                r36 = r23
                r37 = r24
                r16 = r9
                r9 = r25
                r38 = r10
                r10 = r26
                r0 = r11
                r11 = r27
                kf1.C9840l6.m9580c1(r5, r6, r7, r8, r9, r10, r11)
                java.lang.String r5 = "Name="
                r11 = r29
                r11.append(r5)
                te3.je3 r5 = r14.f140264d
                if (r5 == 0) goto L_0x01d1
                java.lang.String r5 = r5.f136053e
                goto L_0x01d2
            L_0x01d1:
                r5 = 0
            L_0x01d2:
                java.lang.String r17 = ""
                if (r5 != 0) goto L_0x01d8
                r5 = r17
            L_0x01d8:
                r11.append(r5)
                te3.je3 r5 = r14.f140264d
                if (r5 == 0) goto L_0x01e2
                java.lang.String r6 = r5.f136053e
                goto L_0x01e3
            L_0x01e2:
                r6 = 0
            L_0x01e3:
                if (r6 != 0) goto L_0x01e7
                r6 = r17
            L_0x01e7:
                r2.f30404C = r6
                boolean r6 = r13.f13776d
                r10 = 1
                if (r6 != 0) goto L_0x0405
                if (r5 == 0) goto L_0x01f4
                java.lang.String r5 = r5.f136057i
                r7 = r5
                goto L_0x01f5
            L_0x01f4:
                r7 = 0
            L_0x01f5:
                r8 = 0
                r9 = 0
                r18 = 12
                r19 = 0
                r5 = r2
                r6 = r15
                r15 = 1
                r10 = r18
                r15 = r11
                r11 = r19
                kf1.C9840l6.m9580c1(r5, r6, r7, r8, r9, r10, r11)
                te3.je3 r5 = r14.f140264d
                if (r5 == 0) goto L_0x020d
                java.lang.String r5 = r5.f136057i
                goto L_0x020e
            L_0x020d:
                r5 = 0
            L_0x020e:
                if (r5 != 0) goto L_0x0212
                r5 = r17
            L_0x0212:
                r2.f30411w = r5
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                int r6 = r2.f30412x
                r7 = 4
                if (r6 == r7) goto L_0x024b
                te3.je3 r6 = r14.f140264d
                if (r6 == 0) goto L_0x0225
                java.lang.String r6 = r6.f136060o
                goto L_0x0226
            L_0x0225:
                r6 = 0
            L_0x0226:
                if (r6 != 0) goto L_0x022a
                r6 = r17
            L_0x022a:
                r5.append(r6)
                te3.je3 r6 = r14.f140264d
                if (r6 == 0) goto L_0x0234
                java.lang.String r6 = r6.f136061p
                goto L_0x0235
            L_0x0234:
                r6 = 0
            L_0x0235:
                if (r6 != 0) goto L_0x0239
                r6 = r17
            L_0x0239:
                r5.append(r6)
                te3.je3 r6 = r14.f140264d
                if (r6 == 0) goto L_0x0243
                java.lang.String r6 = r6.f136062q
                goto L_0x0244
            L_0x0243:
                r6 = 0
            L_0x0244:
                if (r6 != 0) goto L_0x0248
                r6 = r17
            L_0x0248:
                r5.append(r6)
            L_0x024b:
                te3.je3 r6 = r14.f140264d
                if (r6 == 0) goto L_0x0252
                java.lang.String r6 = r6.f136063r
                goto L_0x0253
            L_0x0252:
                r6 = 0
            L_0x0253:
                if (r6 != 0) goto L_0x0257
                r6 = r17
            L_0x0257:
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                java.lang.String r6 = "sb.toString()"
                gy3.C87412m.m108593f(r5, r6)
                kf1.q6 r6 = new kf1.q6
                r6.<init>(r2, r1)
                boolean r1 = r13.f13777e
                if (r1 == 0) goto L_0x02a1
                if (r0 != 0) goto L_0x0270
                goto L_0x0274
            L_0x0270:
                r1 = 0
                r0.setVisibility(r1)
            L_0x0274:
                if (r0 == 0) goto L_0x027c
                r1 = 0
                r0.setOnClickListener(r1)
                rx3.b0 r1 = rx3.C13598b0.f38549a
            L_0x027c:
                if (r0 != 0) goto L_0x027f
                goto L_0x0286
            L_0x027f:
                te3.je3 r1 = r14.f140264d
                java.lang.String r1 = r1.f136056h
                r0.setText(r1)
            L_0x0286:
                if (r0 == 0) goto L_0x0296
                com.tencent.mm.ui.MMActivity r1 = r2.f30214d
                r5 = 2131099674(0x7f06001a, float:1.7811708E38)
                int r1 = r1.getColor(r5)
                r0.setTextColor(r1)
                rx3.b0 r0 = rx3.C13598b0.f38549a
            L_0x0296:
                r1 = r38
                if (r1 != 0) goto L_0x029b
                goto L_0x02d8
            L_0x029b:
                r0 = 8
                r1.setVisibility(r0)
                goto L_0x02d8
            L_0x02a1:
                r1 = r38
                if (r0 == 0) goto L_0x02b3
                com.tencent.mm.ui.MMActivity r7 = r2.f30214d
                r8 = 2131101252(0x7f060644, float:1.7814908E38)
                int r7 = r7.getColor(r8)
                r0.setTextColor(r7)
                rx3.b0 r7 = rx3.C13598b0.f38549a
            L_0x02b3:
                r7 = 2131829434(0x7f1122ba, float:1.9291837E38)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r2.mo10395b1(r0, r5, r7, r6)
                if (r1 != 0) goto L_0x02c0
                goto L_0x02cc
            L_0x02c0:
                if (r0 == 0) goto L_0x02c7
                int r0 = r0.getVisibility()
                goto L_0x02c9
            L_0x02c7:
                r0 = 8
            L_0x02c9:
                r1.setVisibility(r0)
            L_0x02cc:
                if (r1 == 0) goto L_0x02d8
                kf1.m6 r0 = new kf1.m6
                r0.<init>(r6)
                r1.setOnClickListener(r0)
                rx3.b0 r0 = rx3.C13598b0.f38549a
            L_0x02d8:
                r0 = 124(0x7c, float:1.74E-43)
                r15.append(r0)
                java.lang.String r1 = "Nation="
                r15.append(r1)
                te3.je3 r1 = r14.f140264d
                if (r1 == 0) goto L_0x02e9
                java.lang.String r1 = r1.f136065t
                goto L_0x02ea
            L_0x02e9:
                r1 = 0
            L_0x02ea:
                if (r1 != 0) goto L_0x02ee
                r1 = r17
            L_0x02ee:
                r15.append(r1)
                r15.append(r0)
                java.lang.String r0 = "Province="
                r15.append(r0)
                te3.je3 r0 = r14.f140264d
                if (r0 == 0) goto L_0x0300
                java.lang.String r0 = r0.f136060o
                goto L_0x0301
            L_0x0300:
                r0 = 0
            L_0x0301:
                if (r0 != 0) goto L_0x0305
                r0 = r17
            L_0x0305:
                r15.append(r0)
                te3.ke3 r0 = r14.f140271n
                if (r0 == 0) goto L_0x031b
                java.lang.String r0 = r0.f136719d
                if (r0 == 0) goto L_0x031b
                java.lang.String r1 = "\n"
                java.lang.String r5 = " "
                r6 = 0
                java.lang.String r0 = z04.C112551y.m153814n(r0, r1, r5, r6)
                r7 = r0
                goto L_0x031c
            L_0x031b:
                r7 = 0
            L_0x031c:
                r0 = 2131829436(0x7f1122bc, float:1.9291841E38)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
                r9 = 0
                r10 = 8
                r11 = 0
                r5 = r2
                r6 = r16
                kf1.C9840l6.m9580c1(r5, r6, r7, r8, r9, r10, r11)
                te3.te3 r0 = r14.f140265e
                if (r0 == 0) goto L_0x0346
                java.lang.String r5 = r0.f142173j
                if (r5 == 0) goto L_0x0346
                r0 = 1
                char[] r6 = new char[r0]
                r0 = 59
                r1 = 0
                r6[r1] = r0
                r7 = 0
                r8 = 0
                r9 = 6
                r10 = 0
                java.util.List r0 = z04.C112550d0.m153784T(r5, r6, r7, r8, r9, r10)
                goto L_0x0347
            L_0x0346:
                r0 = 0
            L_0x0347:
                kf1.r6 r1 = new kf1.r6
                r1.<init>(r2)
                if (r0 == 0) goto L_0x0353
                int r5 = r0.size()
                goto L_0x0354
            L_0x0353:
                r5 = 0
            L_0x0354:
                r6 = 2131829439(0x7f1122bf, float:1.9291847E38)
                r11 = 1
                if (r5 <= r11) goto L_0x03bb
                r5 = r37
                if (r5 != 0) goto L_0x0360
                r9 = 0
                goto L_0x036e
            L_0x0360:
                com.tencent.mm.ui.MMActivity r7 = r2.f30214d
                java.lang.Object[] r8 = new java.lang.Object[r11]
                r9 = 0
                r8[r9] = r17
                java.lang.String r6 = r7.getString(r6, r8)
                r5.setText(r6)
            L_0x036e:
                if (r5 != 0) goto L_0x0371
                goto L_0x0374
            L_0x0371:
                r5.setVisibility(r9)
            L_0x0374:
                r7 = r30
                if (r7 != 0) goto L_0x0379
                goto L_0x037c
            L_0x0379:
                r7.setVisibility(r9)
            L_0x037c:
                if (r7 == 0) goto L_0x0383
                r7.removeAllViews()
                rx3.b0 r6 = rx3.C13598b0.f38549a
            L_0x0383:
                if (r0 == 0) goto L_0x03db
                java.util.Iterator r0 = r0.iterator()
            L_0x0389:
                boolean r6 = r0.hasNext()
                if (r6 == 0) goto L_0x03b8
                java.lang.Object r6 = r0.next()
                java.lang.String r6 = (java.lang.String) r6
                android.widget.TextView r8 = new android.widget.TextView
                com.tencent.mm.ui.MMActivity r9 = r2.f30214d
                r8.<init>(r9)
                r8.setText(r6)
                if (r5 == 0) goto L_0x03a8
                android.view.ViewGroup$LayoutParams r9 = r5.getLayoutParams()
                r8.setLayoutParams(r9)
            L_0x03a8:
                if (r7 == 0) goto L_0x03af
                r7.addView(r8)
                rx3.b0 r9 = rx3.C13598b0.f38549a
            L_0x03af:
                kf1.n6 r9 = new kf1.n6
                r9.<init>(r1, r6)
                r2.mo10398f1(r8, r6, r6, r9)
                goto L_0x0389
            L_0x03b8:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                goto L_0x03db
            L_0x03bb:
                r7 = r30
                r5 = r37
                if (r7 != 0) goto L_0x03c2
                goto L_0x03c7
            L_0x03c2:
                r0 = 8
                r7.setVisibility(r0)
            L_0x03c7:
                te3.te3 r0 = r14.f140265e
                if (r0 == 0) goto L_0x03ce
                java.lang.String r0 = r0.f142173j
                goto L_0x03cf
            L_0x03ce:
                r0 = 0
            L_0x03cf:
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                kf1.o6 r7 = new kf1.o6
                r7.<init>(r1, r14)
                r2.mo10395b1(r5, r0, r6, r7)
            L_0x03db:
                te3.te3 r0 = r14.f140265e
                r1 = 0
                if (r0 == 0) goto L_0x03e3
                float r5 = r0.f142168e
                goto L_0x03e4
            L_0x03e3:
                r5 = 0
            L_0x03e4:
                int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r1 <= 0) goto L_0x03f0
                if (r0 == 0) goto L_0x03ee
                java.lang.String r0 = r0.f142181u
                r7 = r0
                goto L_0x03f2
            L_0x03ee:
                r7 = 0
                goto L_0x03f2
            L_0x03f0:
                r7 = r17
            L_0x03f2:
                r0 = 2131829438(0x7f1122be, float:1.9291845E38)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
                r9 = 0
                r10 = 8
                r0 = 0
                r5 = r2
                r6 = r3
                r1 = 1
                r11 = r0
                kf1.C9840l6.m9580c1(r5, r6, r7, r8, r9, r10, r11)
                goto L_0x043d
            L_0x0405:
                r0 = r15
                r5 = r37
                r1 = 1
                r15 = r11
                if (r0 != 0) goto L_0x040f
                r6 = 8
                goto L_0x0414
            L_0x040f:
                r6 = 8
                r0.setVisibility(r6)
            L_0x0414:
                android.view.View r0 = r2.f30409u
                if (r0 == 0) goto L_0x0422
                r7 = 2131312586(0x7f093fca, float:1.8243545E38)
                android.view.View r0 = r0.findViewById(r7)
                android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
                goto L_0x0423
            L_0x0422:
                r0 = 0
            L_0x0423:
                if (r0 != 0) goto L_0x0426
                goto L_0x0429
            L_0x0426:
                r0.setVisibility(r6)
            L_0x0429:
                r0 = r16
                if (r0 != 0) goto L_0x042e
                goto L_0x0431
            L_0x042e:
                r0.setVisibility(r6)
            L_0x0431:
                if (r5 != 0) goto L_0x0434
                goto L_0x0437
            L_0x0434:
                r5.setVisibility(r6)
            L_0x0437:
                if (r3 != 0) goto L_0x043a
                goto L_0x043d
            L_0x043a:
                r3.setVisibility(r6)
            L_0x043d:
                java.lang.String r0 = r15.toString()
                java.lang.String r3 = "sbReport.toString()"
                gy3.C87412m.m108593f(r0, r3)
                r2.f30414z = r0
                java.lang.String r0 = r13.f13775c
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 == 0) goto L_0x045a
                if (r4 != 0) goto L_0x0454
                goto L_0x0469
            L_0x0454:
                r0 = 8
                r4.setVisibility(r0)
                goto L_0x0469
            L_0x045a:
                if (r4 != 0) goto L_0x045d
                goto L_0x0462
            L_0x045d:
                java.lang.String r0 = r13.f13775c
                r4.setText(r0)
            L_0x0462:
                if (r4 != 0) goto L_0x0465
                goto L_0x0469
            L_0x0465:
                r0 = 0
                r4.setVisibility(r0)
            L_0x0469:
                int r0 = r2.f30412x
                r3 = 8
                if (r0 == r3) goto L_0x04ac
                com.tencent.mm.ui.MMActivity r0 = r2.f30214d
                boolean r3 = r0 instanceof com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPoiFeedUI
                if (r3 == 0) goto L_0x0478
                com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI r0 = (com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPoiFeedUI) r0
                goto L_0x0479
            L_0x0478:
                r0 = 0
            L_0x0479:
                if (r0 == 0) goto L_0x04ac
                qo3.n r3 = new qo3.n
                r4 = 0
                r3.<init>((android.content.Context) r0, (int) r1, (boolean) r4)
                vf1.h4 r4 = new vf1.h4
                r4.<init>(r0)
                r3.f225771i = r4
                vf1.i4 r4 = new vf1.i4
                r4.<init>(r0)
                r3.f225782p = r4
                vf1.j4 r4 = new vf1.j4
                r4.<init>(r0)
                r3.f225761d = r4
                vf1.k4 r4 = new vf1.k4
                r4.<init>(r0)
                r3.f225763e = r4
                r4 = 10001(0x2711, float:1.4014E-41)
                r5 = 2131230859(0x7f08008b, float:1.8077783E38)
                vf1.l4 r6 = new vf1.l4
                r6.<init>(r3)
                r0.addIconOptionMenu(r4, r5, r6)
                rx3.b0 r0 = rx3.C13598b0.f38549a
            L_0x04ac:
                r5 = r33
                if (r5 != 0) goto L_0x04b3
                r14 = 0
                goto L_0x0557
            L_0x04b3:
                com.tencent.mm.protocal.protobuf.FinderContact r0 = r13.f13779g
                if (r0 == 0) goto L_0x0551
                r3 = 3
                r4 = 0
                r6 = 0
                fe1.q r0 = fe1.C58960c.m68834f(r0, r6, r4, r3, r6)
                java.lang.Class<pl1.s0> r3 = pl1.C11990s0.class
                java.lang.Class<ht1.t1> r4 = ht1.C60200t1.class
                r6 = r34
                if (r6 == 0) goto L_0x04f5
                bl3.r r7 = bl3.C39818r.f106831a
                bl3.r$a r8 = r7.mo62446e(r4)
                bl3.c r8 = r8.mo62447c(r3)
                pl1.s0 r8 = (pl1.C11990s0) r8
                k60.d r8 = r8.mo11872i2()
                pl1.f r9 = new pl1.f
                java.lang.String r10 = r0.getAvatarUrl()
                r11 = 2
                r14 = 0
                r9.<init>(r10, r14, r11, r14)
                pl1.e0$a r10 = pl1.C11978e0.C11979a.AVATAR
                bl3.r$a r4 = r7.mo62446e(r4)
                bl3.c r3 = r4.mo62447c(r3)
                pl1.s0 r3 = (pl1.C11990s0) r3
                n60.f r3 = r3.mo11867O2(r10)
                r8.mo85957c(r9, r6, r3)
                goto L_0x04f6
            L_0x04f5:
                r14 = 0
            L_0x04f6:
                r3 = r35
                if (r3 != 0) goto L_0x04fb
                goto L_0x0510
            L_0x04fb:
                java.lang.Class<ny.h> r4 = p629ny.C76979h.class
                di3.d r4 = di3.C86312j.m106911c(r4)
                ny.h r4 = (p629ny.C76979h) r4
                com.tencent.mm.ui.MMActivity r6 = r2.f30214d
                java.lang.String r7 = r0.getNickname()
                android.text.SpannableString r4 = r4.mo107057T1(r6, r7)
                r3.setText(r4)
            L_0x0510:
                r3 = r36
                if (r3 != 0) goto L_0x0515
                goto L_0x0534
            L_0x0515:
                com.tencent.mm.protocal.protobuf.FinderAuthInfo r4 = r0.field_authInfo
                if (r4 == 0) goto L_0x052f
                er1.w3 r22 = er1.C58784w3.f168295a
                r25 = 0
                r6 = 0
                te3.cg r26 = fe1.C58960c.m68830b(r0, r6)
                r27 = 4
                r28 = 0
                r23 = r3
                r24 = r4
                er1.C58784w3.m68429F1(r22, r23, r24, r25, r26, r27, r28)
                r4 = 0
                goto L_0x0531
            L_0x052f:
                r4 = 8
            L_0x0531:
                r3.setVisibility(r4)
            L_0x0534:
                kf1.p6 r3 = new kf1.p6
                r3.<init>(r0, r2)
                r5.setOnClickListener(r3)
                rx3.b0 r3 = rx3.C13598b0.f38549a
                java.lang.String r3 = r2.f30404C
                java.lang.String r0 = r0.getUsername()
                r4 = 0
                r2.mo10397e1(r4, r3, r0)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
                int r0 = r0.intValue()
                goto L_0x0554
            L_0x0551:
                r14 = 0
                r0 = 8
            L_0x0554:
                r5.setVisibility(r0)
            L_0x0557:
                if (r12 != 0) goto L_0x055b
                goto L_0x05e0
            L_0x055b:
                boolean r0 = r13.f13774b
                if (r0 == 0) goto L_0x05d7
                r3 = 1
                r2.f30413y = r3
                int r0 = r13.f13778f
                if (r0 <= 0) goto L_0x05d5
                r2.f30405D = r0
                r5 = r31
                if (r5 != 0) goto L_0x056e
                goto L_0x05b1
            L_0x056e:
                k20.a r0 = new k20.a
                r0.<init>()
                java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
                r3 = 0
                java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
                r0.mo10233c(r4)
                java.lang.Object[] r18 = r0.mo10232b()
                java.lang.String r19 = "com/tencent/mm/plugin/finder/feed/FinderPoiFeedUIContract$PoiFeedViewCallback"
                java.lang.String r20 = "refreshHeader"
                java.lang.String r21 = "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V"
                java.lang.String r22 = "android/view/View_EXEC_"
                java.lang.String r23 = "setVisibility"
                java.lang.String r24 = "(I)V"
                r17 = r5
                j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
                r3 = 0
                java.lang.Object r0 = r0.mo10231a(r3)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                r5.setVisibility(r0)
                java.lang.String r18 = "com/tencent/mm/plugin/finder/feed/FinderPoiFeedUIContract$PoiFeedViewCallback"
                java.lang.String r19 = "refreshHeader"
                java.lang.String r20 = "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V"
                java.lang.String r21 = "android/view/View_EXEC_"
                java.lang.String r22 = "setVisibility"
                java.lang.String r23 = "(I)V"
                j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            L_0x05b1:
                r5 = r32
                if (r5 != 0) goto L_0x05b7
                r0 = 0
                goto L_0x05bb
            L_0x05b7:
                r0 = 0
                r5.setVisibility(r0)
            L_0x05bb:
                int r3 = r13.f13778f
                long r3 = (long) r3
                java.lang.String r3 = er1.C7878t0.m8035d(r3)
                if (r5 != 0) goto L_0x05c5
                goto L_0x05d5
            L_0x05c5:
                com.tencent.mm.ui.MMActivity r2 = r2.f30214d
                r4 = 2131829441(0x7f1122c1, float:1.9291851E38)
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r0] = r3
                java.lang.String r0 = r2.getString(r4, r1)
                r5.setText(r0)
            L_0x05d5:
                r0 = 0
                goto L_0x05dd
            L_0x05d7:
                r0 = 0
                r2.f30413y = r0
                r0 = 8
            L_0x05dd:
                r12.setVisibility(r0)
            L_0x05e0:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                goto L_0x05e4
            L_0x05e3:
                r14 = 0
            L_0x05e4:
                r0 = r39
                kf1.k6 r1 = r0.f30380d
                com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r1 = r1.f30175e
                int r1 = r1.getSize()
                if (r1 != 0) goto L_0x0705
                kf1.k6 r1 = r0.f30380d
                kf1.h r1 = r1.f30176f
                if (r1 == 0) goto L_0x06f3
                android.view.View r1 = r1.mo9299m0()
                if (r1 == 0) goto L_0x06f3
                com.tencent.mm.ui.MMActivity r10 = r0.f30381e
                k20.a r11 = new k20.a
                r11.<init>()
                java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
                r2 = 0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                r11.mo10233c(r3)
                java.lang.Object[] r3 = r11.mo10232b()
                java.lang.String r4 = "com/tencent/mm/plugin/finder/feed/FinderPoiFeedUIContract$PoiFeedPresenter$1"
                java.lang.String r5 = "invoke"
                java.lang.String r6 = "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V"
                java.lang.String r7 = "android/view/View_EXEC_"
                java.lang.String r8 = "setVisibility"
                java.lang.String r9 = "(I)V"
                r2 = r1
                j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
                r2 = 0
                java.lang.Object r3 = r11.mo10231a(r2)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r2 = r3.intValue()
                r1.setVisibility(r2)
                java.lang.String r3 = "com/tencent/mm/plugin/finder/feed/FinderPoiFeedUIContract$PoiFeedPresenter$1"
                java.lang.String r4 = "invoke"
                java.lang.String r5 = "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V"
                java.lang.String r6 = "android/view/View_EXEC_"
                java.lang.String r7 = "setVisibility"
                java.lang.String r8 = "(I)V"
                r2 = r1
                j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
                r2 = 2131101688(0x7f0607f8, float:1.7815793E38)
                android.graphics.drawable.Drawable r2 = r10.getDrawable(r2)
                r1.setBackground(r2)
                r2 = 2131301630(0x7f0914fe, float:1.8221323E38)
                android.view.View r2 = r1.findViewById(r2)
                android.widget.TextView r2 = (android.widget.TextView) r2
                if (r2 != 0) goto L_0x0657
                goto L_0x065b
            L_0x0657:
                r3 = 0
                r2.setVisibility(r3)
            L_0x065b:
                r2 = 2131311498(0x7f093b8a, float:1.8241338E38)
                android.view.View r2 = r1.findViewById(r2)
                if (r2 != 0) goto L_0x0665
                goto L_0x06a7
            L_0x0665:
                k20.a r11 = new k20.a
                r11.<init>()
                r3 = 8
                java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
                r11.mo10233c(r4)
                java.lang.Object[] r4 = r11.mo10232b()
                java.lang.String r5 = "com/tencent/mm/plugin/finder/feed/FinderPoiFeedUIContract$PoiFeedPresenter$1"
                java.lang.String r6 = "invoke"
                java.lang.String r7 = "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V"
                java.lang.String r8 = "android/view/View_EXEC_"
                java.lang.String r9 = "setVisibility"
                java.lang.String r10 = "(I)V"
                r3 = r2
                j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
                r3 = 0
                java.lang.Object r4 = r11.mo10231a(r3)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r3 = r4.intValue()
                r2.setVisibility(r3)
                java.lang.String r4 = "com/tencent/mm/plugin/finder/feed/FinderPoiFeedUIContract$PoiFeedPresenter$1"
                java.lang.String r5 = "invoke"
                java.lang.String r6 = "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V"
                java.lang.String r7 = "android/view/View_EXEC_"
                java.lang.String r8 = "setVisibility"
                java.lang.String r9 = "(I)V"
                r3 = r2
                j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
            L_0x06a7:
                r2 = 2131312452(0x7f093f44, float:1.8243273E38)
                android.view.View r1 = r1.findViewById(r2)
                if (r1 != 0) goto L_0x06b1
                goto L_0x06f3
            L_0x06b1:
                k20.a r2 = new k20.a
                r2.<init>()
                r3 = 8
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2.mo10233c(r3)
                java.lang.Object[] r4 = r2.mo10232b()
                java.lang.String r5 = "com/tencent/mm/plugin/finder/feed/FinderPoiFeedUIContract$PoiFeedPresenter$1"
                java.lang.String r6 = "invoke"
                java.lang.String r7 = "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V"
                java.lang.String r8 = "android/view/View_EXEC_"
                java.lang.String r9 = "setVisibility"
                java.lang.String r10 = "(I)V"
                r3 = r1
                j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
                r3 = 0
                java.lang.Object r2 = r2.mo10231a(r3)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r4 = "com/tencent/mm/plugin/finder/feed/FinderPoiFeedUIContract$PoiFeedPresenter$1"
                java.lang.String r5 = "invoke"
                java.lang.String r6 = "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V"
                java.lang.String r7 = "android/view/View_EXEC_"
                java.lang.String r8 = "setVisibility"
                java.lang.String r9 = "(I)V"
                r3 = r1
                j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
            L_0x06f3:
                kf1.k6 r1 = r0.f30380d
                kf1.h r1 = r1.f30176f
                if (r1 == 0) goto L_0x06fc
                com.tencent.mm.view.RefreshLoadMoreLayout r4 = r1.f30220j
                goto L_0x06fd
            L_0x06fc:
                r4 = r14
            L_0x06fd:
                if (r4 != 0) goto L_0x0700
                goto L_0x0756
            L_0x0700:
                r1 = 0
                r4.setEnableLoadMore(r1)
                goto L_0x0756
            L_0x0705:
                kf1.k6 r1 = r0.f30380d
                kf1.h r1 = r1.f30176f
                if (r1 == 0) goto L_0x0710
                android.view.View r4 = r1.mo9299m0()
                r14 = r4
            L_0x0710:
                if (r14 != 0) goto L_0x0713
                goto L_0x0756
            L_0x0713:
                k20.a r1 = new k20.a
                r1.<init>()
                java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
                r2 = 8
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.mo10233c(r2)
                java.lang.Object[] r6 = r1.mo10232b()
                java.lang.String r7 = "com/tencent/mm/plugin/finder/feed/FinderPoiFeedUIContract$PoiFeedPresenter$1"
                java.lang.String r8 = "invoke"
                java.lang.String r9 = "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V"
                java.lang.String r10 = "android/view/View_EXEC_"
                java.lang.String r11 = "setVisibility"
                java.lang.String r12 = "(I)V"
                r5 = r14
                j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
                r2 = 0
                java.lang.Object r1 = r1.mo10231a(r2)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                r14.setVisibility(r1)
                java.lang.String r6 = "com/tencent/mm/plugin/finder/feed/FinderPoiFeedUIContract$PoiFeedPresenter$1"
                java.lang.String r7 = "invoke"
                java.lang.String r8 = "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V"
                java.lang.String r9 = "android/view/View_EXEC_"
                java.lang.String r10 = "setVisibility"
                java.lang.String r11 = "(I)V"
                j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            L_0x0756:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kf1.C9827k6.C9828a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: kf1.k6$b */
    public static final class C9829b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9827k6 f30382d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9829b(C9827k6 k6Var) {
            super(0);
            this.f30382d = k6Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r0.f30226s;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r11 = this;
                kf1.k6 r0 = r11.f30382d
                kf1.h r0 = r0.f30176f
                if (r0 == 0) goto L_0x0012
                android.view.View r0 = r0.f30226s
                if (r0 == 0) goto L_0x0012
                r1 = 2131308009(0x7f092de9, float:1.8234261E38)
                android.view.View r0 = r0.findViewById(r1)
                goto L_0x0013
            L_0x0012:
                r0 = 0
            L_0x0013:
                if (r0 != 0) goto L_0x0016
                goto L_0x0058
            L_0x0016:
                k20.a r9 = new k20.a
                r9.<init>()
                java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
                r10 = 0
                java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
                r9.mo10233c(r1)
                java.lang.Object[] r2 = r9.mo10232b()
                java.lang.String r3 = "com/tencent/mm/plugin/finder/feed/FinderPoiFeedUIContract$PoiFeedPresenter$loadMoreData$1"
                java.lang.String r4 = "invoke"
                java.lang.String r5 = "()V"
                java.lang.String r6 = "android/view/View_EXEC_"
                java.lang.String r7 = "setVisibility"
                java.lang.String r8 = "(I)V"
                r1 = r0
                j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
                java.lang.Object r1 = r9.mo10231a(r10)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                r0.setVisibility(r1)
                java.lang.String r2 = "com/tencent/mm/plugin/finder/feed/FinderPoiFeedUIContract$PoiFeedPresenter$loadMoreData$1"
                java.lang.String r3 = "invoke"
                java.lang.String r4 = "()V"
                java.lang.String r5 = "android/view/View_EXEC_"
                java.lang.String r6 = "setVisibility"
                java.lang.String r7 = "(I)V"
                r1 = r0
                j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            L_0x0058:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kf1.C9827k6.C9829b.invoke():java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9827k6(MMActivity mMActivity, int i, int i2, BaseFinderFeedLoader baseFinderFeedLoader) {
        super(mMActivity, i, i2, baseFinderFeedLoader);
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(baseFinderFeedLoader, "loader");
        BaseFinderFeedLoader baseFinderFeedLoader2 = this.f30175e;
        FinderPoiFeedLoader finderPoiFeedLoader = baseFinderFeedLoader2 instanceof FinderPoiFeedLoader ? (FinderPoiFeedLoader) baseFinderFeedLoader2 : null;
        if (finderPoiFeedLoader != null) {
            finderPoiFeedLoader.f13770i = new C9828a(this, mMActivity);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        r14 = r14.f30226s;
     */
    /* renamed from: A7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2513A7(com.tencent.p014mm.view.RefreshLoadMoreLayout.C7080c<java.lang.Object> r14) {
        /*
            r13 = this;
            java.lang.String r0 = "reason"
            gy3.C87412m.m108594g(r14, r0)
            boolean r0 = r13.f30379i
            if (r0 == 0) goto L_0x0109
            boolean r14 = r14.f24951f
            r0 = 8
            r1 = 2131308009(0x7f092de9, float:1.8234261E38)
            r2 = 0
            r3 = 0
            if (r14 != 0) goto L_0x00ba
            kf1.h r14 = r13.f30176f
            if (r14 == 0) goto L_0x0024
            android.view.View r14 = r14.f30226s
            if (r14 == 0) goto L_0x0024
            r4 = 2131308008(0x7f092de8, float:1.823426E38)
            android.view.View r14 = r14.findViewById(r4)
            goto L_0x0025
        L_0x0024:
            r14 = r2
        L_0x0025:
            if (r14 != 0) goto L_0x0028
            goto L_0x0069
        L_0x0028:
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r12.mo10233c(r4)
            java.lang.Object[] r5 = r12.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/feed/FinderPoiFeedUIContract$PoiFeedPresenter"
            java.lang.String r7 = "onLoadMoreEnd"
            java.lang.String r8 = "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r14
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r4 = r12.mo10231a(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r14.setVisibility(r4)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/feed/FinderPoiFeedUIContract$PoiFeedPresenter"
            java.lang.String r6 = "onLoadMoreEnd"
            java.lang.String r7 = "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r4 = r14
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
        L_0x0069:
            kf1.h r14 = r13.f30176f
            if (r14 == 0) goto L_0x0075
            android.view.View r14 = r14.f30226s
            if (r14 == 0) goto L_0x0075
            android.view.View r2 = r14.findViewById(r1)
        L_0x0075:
            if (r2 != 0) goto L_0x0079
            goto L_0x0109
        L_0x0079:
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14.mo10233c(r0)
            java.lang.Object[] r5 = r14.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/feed/FinderPoiFeedUIContract$PoiFeedPresenter"
            java.lang.String r7 = "onLoadMoreEnd"
            java.lang.String r8 = "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r2
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r14 = r14.mo10231a(r3)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            r2.setVisibility(r14)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/feed/FinderPoiFeedUIContract$PoiFeedPresenter"
            java.lang.String r6 = "onLoadMoreEnd"
            java.lang.String r7 = "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0109
        L_0x00ba:
            kf1.h r14 = r13.f30176f
            if (r14 == 0) goto L_0x00c6
            android.view.View r14 = r14.f30226s
            if (r14 == 0) goto L_0x00c6
            android.view.View r2 = r14.findViewById(r1)
        L_0x00c6:
            if (r2 != 0) goto L_0x00c9
            goto L_0x0109
        L_0x00c9:
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14.mo10233c(r0)
            java.lang.Object[] r5 = r14.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/feed/FinderPoiFeedUIContract$PoiFeedPresenter"
            java.lang.String r7 = "onLoadMoreEnd"
            java.lang.String r8 = "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r2
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r14 = r14.mo10231a(r3)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            r2.setVisibility(r14)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/feed/FinderPoiFeedUIContract$PoiFeedPresenter"
            java.lang.String r6 = "onLoadMoreEnd"
            java.lang.String r7 = "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C9827k6.mo2513A7(com.tencent.mm.view.RefreshLoadMoreLayout$c):void");
    }

    /* renamed from: G */
    public void mo2514G() {
        C11078h hVar = this.f30378h;
        if (hVar != null) {
            hVar.mo11215b();
        }
    }

    /* renamed from: U */
    public C9500j mo2516U() {
        return new FinderConfigForNewLiveCardStyle(this.f30174d, (C7461a) null, 0, (FinderVideoCore) null, 14, (C8480h) null).mo3010b((C32226l<? super Integer, ? extends C60896i<?>>) null);
    }

    /* renamed from: n */
    public void mo2519n() {
        C9753h hVar = this.f30176f;
        if (hVar != null) {
            hVar.mo9297d(this.f30175e.getDataListJustForAdapter());
        }
    }

    /* renamed from: o */
    public void mo2521o() {
        BaseFeedLoader.requestLoadMore$default(this.f30175e, false, 1, (Object) null);
        if (this.f30379i) {
            C61926c.m72668M(new C9829b(this));
        }
    }

    public void onDetach() {
        super.onDetach();
        C11078h hVar = this.f30378h;
        if (hVar != null) {
            hVar.detach();
        }
    }

    /* renamed from: q */
    public void mo2523q() {
        BaseFeedLoader.requestInit$default(this.f30175e, false, 1, (Object) null);
    }

    public void requestRefresh() {
        this.f30175e.requestRefresh();
    }

    /* renamed from: t */
    public void mo2525t(C9753h hVar) {
        RecyclerView recyclerView;
        Class cls = C11266d.class;
        C87412m.m108594g(hVar, "callback");
        super.mo2525t(hVar);
        C9753h hVar2 = this.f30176f;
        if (hVar2 != null && (recyclerView = hVar2.getRecyclerView()) != null) {
            ((C11264b) C39818r.f106831a.mo62446e(cls).mo62447c(C11264b.class)).mo11321n2(this.f30174d);
            MMActivity mMActivity = this.f30174d;
            DataBuffer dataListJustForAdapter = this.f30175e.getDataListJustForAdapter();
            C9753h hVar3 = this.f30176f;
            C87412m.m108591d(hVar3);
            C11078h ft = ((C11266d) C86312j.m106911c(cls)).mo9193ft(mMActivity, recyclerView, dataListJustForAdapter, hVar3.mo10346D());
            this.f30378h = ft;
            if (ft != null) {
                ft.mo11219e();
            }
        }
    }

    /* renamed from: x */
    public void mo2526x() {
        C11078h hVar = this.f30378h;
        if (hVar != null) {
            hVar.mo11214a();
        }
    }
}
