package hr1;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.plugin.finder.view.FinderBaseMediaBanner;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import ef1.C58556f;
import ef1.C7637b;
import ef1.C7642k;
import er1.C58739j4;
import er1.C58744l;
import er1.C58784w3;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import jq3.C60905o;
import jq3.C9493c;
import kf1.C9833k9;
import qt1.C12932c;
import rs1.C13442s8;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C64689rq2;
import tf0.C13887q1;

/* renamed from: hr1.a */
public final class C60134a {

    /* renamed from: a */
    public final int f171655a = MMApplicationContext.getContext().getResources().getDisplayMetrics().heightPixels;

    /* renamed from: b */
    public RecyclerView f171656b;

    /* renamed from: c */
    public int f171657c = -1;

    /* renamed from: d */
    public C60135a f171658d;

    /* renamed from: e */
    public final Rect f171659e = new Rect();

    /* renamed from: f */
    public C58744l f171660f = new C58744l(false, 0, (String) null, (FeedData) null, 0, 0, (C60905o) null, (C0740i2) null, 255, (C8480h) null);

    /* renamed from: g */
    public int f171661g = 1;

    /* renamed from: h */
    public long f171662h = -1;

    /* renamed from: i */
    public final C12932c f171663i = new C12932c("FinderFeedSelectorAdapter");

    /* renamed from: j */
    public boolean f171664j = true;

    /* renamed from: k */
    public final boolean f171665k = ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13314J9();

    /* renamed from: hr1.a$a */
    public interface C60135a {
        /* renamed from: G */
        void mo79663G(List<? extends C9493c> list, C58744l lVar, C60905o oVar, int i);

        /* renamed from: W0 */
        void mo79664W0(List<? extends C9493c> list, C58744l lVar, C60905o oVar, int i);

        /* renamed from: e */
        void mo79665e(RecyclerView recyclerView, int i);

        /* renamed from: n0 */
        void mo79666n0(List<? extends C9493c> list, C58744l lVar, C60905o oVar, int i);
    }

    /* renamed from: hr1.a$b */
    public static final class C60136b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C58556f f171666d;

        /* renamed from: e */
        public final /* synthetic */ C7637b f171667e;

        public C60136b(C58556f fVar, C7637b bVar) {
            this.f171666d = fVar;
            this.f171667e = bVar;
        }

        public final void run() {
            this.f171666d.mo8766a(this.f171667e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02eb, code lost:
        if ((r1 != null && r1.getHasBgmInfo()) != false) goto L_0x02f0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03ac A[LOOP:2: B:54:0x0167->B:160:0x03ac, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x011c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03c0 A[EDGE_INSN: B:187:0x03c0->B:162:0x03c0 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011f A[LOOP:1: B:37:0x00f3->B:50:0x011f, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m70028a(hr1.C60134a r37, java.util.Set r38, boolean r39, java.lang.String r40, int r41, java.lang.Object r42) {
        /*
            r0 = r37
            r1 = r41 & 1
            if (r1 == 0) goto L_0x000e
            er1.w3 r1 = er1.C58784w3.f168295a
            r1.getClass()
            java.util.Set<java.lang.Integer> r1 = er1.C58784w3.f168298d
            goto L_0x0010
        L_0x000e:
            r1 = r38
        L_0x0010:
            r2 = r41 & 2
            if (r2 == 0) goto L_0x0016
            r2 = 1
            goto L_0x0018
        L_0x0016:
            r2 = r39
        L_0x0018:
            r4 = 4
            r5 = r41 & 4
            java.lang.String r6 = ""
            if (r5 == 0) goto L_0x0021
            r5 = r6
            goto L_0x0023
        L_0x0021:
            r5 = r40
        L_0x0023:
            qt1.c r7 = r0.f171663i
            java.lang.String r8 = "begin"
            r7.mo12481a(r8)
            androidx.recyclerview.widget.RecyclerView r7 = r0.f171656b
            java.lang.String r8 = "FinderFeedSelectorAdapter"
            if (r7 != 0) goto L_0x0048
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "checkSelectedInternal return for recyclerView:"
            r1.append(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r0.f171656b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
            goto L_0x04a8
        L_0x0048:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r9 = r7.getLayoutManager()
            boolean r10 = r9 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r10 != 0) goto L_0x0057
            java.lang.String r0 = "checkSelectedInternal return for layoutManager must be LinearLayoutManager."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
            goto L_0x04a8
        L_0x0057:
            androidx.recyclerview.widget.LinearLayoutManager r9 = (androidx.recyclerview.widget.LinearLayoutManager) r9
            int r10 = r9.mo16957C()
            int r9 = r9.mo16959E()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "checkSelectedInternal forceCheckSame:"
            r11.append(r12)
            r11.append(r2)
            java.lang.String r12 = " ["
            r11.append(r12)
            r11.append(r10)
            java.lang.String r12 = ", "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r13 = "] from invoke:"
            r11.append(r13)
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
            if (r10 < 0) goto L_0x0488
            if (r9 < r10) goto L_0x0488
            if (r9 >= 0) goto L_0x0095
            goto L_0x0488
        L_0x0095:
            java.util.LinkedList r11 = new java.util.LinkedList
            r11.<init>()
            androidx.recyclerview.widget.RecyclerView$e r12 = r7.getAdapter()
            java.lang.String r13 = "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerAdapter<*>"
            gy3.C87412m.m108592e(r12, r13)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r12 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r12
            java.util.List r13 = r12.getData()
            java.util.List r14 = r12.getData()
            java.util.Iterator r14 = r14.iterator()
            r16 = 0
        L_0x00b3:
            boolean r17 = r14.hasNext()
            r5 = 9
            r3 = 2013(0x7dd, float:2.821E-42)
            r18 = -1
            if (r17 == 0) goto L_0x00e1
            java.lang.Object r17 = r14.next()
            jq3.c r17 = (jq3.C9493c) r17
            int r15 = r17.mo75c()
            if (r15 == r4) goto L_0x00da
            int r15 = r17.mo75c()
            if (r15 == r3) goto L_0x00da
            int r15 = r17.mo75c()
            if (r15 != r5) goto L_0x00d8
            goto L_0x00da
        L_0x00d8:
            r15 = 0
            goto L_0x00db
        L_0x00da:
            r15 = 1
        L_0x00db:
            if (r15 == 0) goto L_0x00de
            goto L_0x00e3
        L_0x00de:
            int r16 = r16 + 1
            goto L_0x00b3
        L_0x00e1:
            r16 = -1
        L_0x00e3:
            int r14 = r12.mo85796c6()
            int r14 = r16 + r14
            java.util.List r15 = r12.getData()
            java.util.Iterator r15 = r15.iterator()
            r16 = 0
        L_0x00f3:
            boolean r17 = r15.hasNext()
            r3 = 2
            if (r17 == 0) goto L_0x0126
            java.lang.Object r17 = r15.next()
            jq3.c r17 = (jq3.C9493c) r17
            int r5 = r17.mo75c()
            if (r5 == r4) goto L_0x0117
            int r5 = r17.mo75c()
            if (r5 == r3) goto L_0x0117
            int r5 = r17.mo75c()
            r3 = 9
            if (r5 != r3) goto L_0x0115
            goto L_0x0119
        L_0x0115:
            r5 = 0
            goto L_0x011a
        L_0x0117:
            r3 = 9
        L_0x0119:
            r5 = 1
        L_0x011a:
            if (r5 == 0) goto L_0x011f
            r18 = r16
            goto L_0x0126
        L_0x011f:
            int r16 = r16 + 1
            r3 = 2013(0x7dd, float:2.821E-42)
            r5 = 9
            goto L_0x00f3
        L_0x0126:
            int r3 = r12.mo85796c6()
            int r3 = r18 + r3
            int r5 = r0.f171655a
            float r12 = (float) r5
            r15 = 1053609165(0x3ecccccd, float:0.4)
            float r12 = r12 * r15
            er1.l r15 = new er1.l
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 255(0xff, float:3.57E-43)
            r29 = 0
            r18 = r15
            r18.<init>(r19, r20, r22, r23, r24, r25, r26, r27, r28, r29)
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            r41 = r6
            qt1.c r6 = r0.f171663i
            r30 = r13
            java.lang.String r13 = "findSelectedFeed begin"
            r6.mo12482c(r13)
            if (r10 > r9) goto L_0x03ba
            r6 = 2147483647(0x7fffffff, float:NaN)
            r31 = r2
            r13 = 0
        L_0x0167:
            androidx.recyclerview.widget.RecyclerView$z r2 = r7.mo17024J0(r10, r13)
            boolean r13 = r2 instanceof jq3.C60905o
            r18 = 0
            if (r13 == 0) goto L_0x0174
            jq3.o r2 = (jq3.C60905o) r2
            goto L_0x0176
        L_0x0174:
            r2 = r18
        L_0x0176:
            if (r2 != 0) goto L_0x017b
            r32 = r7
            goto L_0x018a
        L_0x017b:
            java.lang.Object r13 = r2.f173503E
            r32 = r7
            boolean r7 = r13 instanceof cm1.C0740i2
            if (r7 == 0) goto L_0x0186
            cm1.i2 r13 = (cm1.C0740i2) r13
            goto L_0x0188
        L_0x0186:
            r13 = r18
        L_0x0188:
            if (r13 != 0) goto L_0x0196
        L_0x018a:
            r35 = r1
            r34 = r4
            r19 = r6
            r33 = r9
        L_0x0192:
            r36 = r11
            goto L_0x02b5
        L_0x0196:
            boolean r7 = r0.f171665k
            if (r7 == 0) goto L_0x01ba
            er1.w3 r7 = er1.C58784w3.f168295a
            r7.getClass()
            java.util.Set<java.lang.Integer> r7 = er1.C58784w3.f168299e
            int r19 = r13.mo75c()
            r33 = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r19)
            boolean r7 = r7.contains(r9)
            if (r7 == 0) goto L_0x01bc
            er1.w3$b r7 = new er1.w3$b
            r7.<init>(r13, r2)
            r4.add(r7)
            goto L_0x01bc
        L_0x01ba:
            r33 = r9
        L_0x01bc:
            int r7 = r13.mo75c()
            boolean r9 = r13 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            r34 = r4
            if (r9 != 0) goto L_0x01d6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            boolean r4 = r1.contains(r4)
            if (r4 == 0) goto L_0x01d1
            goto L_0x01d6
        L_0x01d1:
            r35 = r1
            r19 = r6
            goto L_0x0192
        L_0x01d6:
            if (r9 == 0) goto L_0x01ea
            com.tencent.mm.plugin.finder.storage.FeedData$a r4 = com.tencent.p014mm.plugin.finder.storage.FeedData.Companion
            r35 = r1
            r1 = r13
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r1
            com.tencent.mm.plugin.finder.storage.FeedData r1 = r4.mo78883a(r1)
            r19 = r6
            r20 = r7
            r36 = r11
            goto L_0x021b
        L_0x01ea:
            r35 = r1
            boolean r1 = r13 instanceof kf1.C9833k9
            if (r1 == 0) goto L_0x0213
            r1 = r13
            kf1.k9 r1 = (kf1.C9833k9) r1
            com.tencent.mm.plugin.finder.storage.FeedData r4 = new com.tencent.mm.plugin.finder.storage.FeedData
            r4.<init>()
            r36 = r11
            te3.pl1 r11 = r1.f30387d
            r19 = r6
            r20 = r7
            long r6 = r11.f184854u
            r4.setFeedId(r6)
            int r6 = r1.mo75c()
            r4.setMediaType(r6)
            java.util.LinkedList<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r1 = r1.f30389f
            r4.setRvFeedList(r1)
            r1 = r4
            goto L_0x021b
        L_0x0213:
            r19 = r6
            r20 = r7
            r36 = r11
            r1 = r18
        L_0x021b:
            r4 = 2131304482(0x7f092022, float:1.8227108E38)
            if (r9 == 0) goto L_0x0235
            boolean r6 = r13 instanceof cm1.C0729f0
            if (r6 != 0) goto L_0x0235
            android.view.View r6 = r2.mo85812D(r4)
            com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner r6 = (com.tencent.p014mm.plugin.finder.view.FinderBaseMediaBanner) r6
            if (r6 == 0) goto L_0x022d
            goto L_0x0237
        L_0x022d:
            r6 = 2131308186(0x7f092e9a, float:1.823462E38)
            android.view.View r6 = r2.mo85812D(r6)
            goto L_0x0237
        L_0x0235:
            android.view.View r6 = r2.f44854d
        L_0x0237:
            if (r6 != 0) goto L_0x025e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "checkSelectedInternal: mediaView is null, index="
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = ", feedId="
            r1.append(r2)
            long r6 = r13.getItemId()
            java.lang.String r2 = o40.C61926c.m72691p(r6)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r1)
            goto L_0x02b5
        L_0x025e:
            android.graphics.Rect r7 = r0.f171659e
            r7.setEmpty()
            android.graphics.Rect r7 = r0.f171659e
            boolean r7 = r6.getGlobalVisibleRect(r7)
            if (r7 != 0) goto L_0x0282
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "checkSelectedInternal continue for getGlobalVisibleRect() error "
            r1.append(r2)
            android.graphics.Rect r2 = r0.f171659e
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r1)
            goto L_0x02b5
        L_0x0282:
            android.graphics.Rect r7 = r0.f171659e
            int r9 = r7.top
            r11 = 0
            int r9 = p282z2.C16095a.m14980b(r9, r11, r5)
            r7.top = r9
            android.graphics.Rect r7 = r0.f171659e
            int r9 = r7.bottom
            int r9 = p282z2.C16095a.m14980b(r9, r11, r5)
            r7.bottom = r9
            android.graphics.Rect r7 = r0.f171659e
            int r7 = r7.height()
            if (r7 > 0) goto L_0x02bf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "checkSelectedInternal continue for mediaRect.height() error "
            r1.append(r2)
            android.graphics.Rect r2 = r0.f171659e
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r1)
        L_0x02b5:
            r9 = r12
            r6 = r19
            r1 = r33
            r4 = r36
            r2 = 0
            goto L_0x03aa
        L_0x02bf:
            if (r10 != r14) goto L_0x02c7
            if (r3 != r14) goto L_0x02c7
            r9 = r20
            r7 = 0
            goto L_0x02d5
        L_0x02c7:
            android.graphics.Rect r7 = r0.f171659e
            int r7 = r7.top
            float r7 = (float) r7
            float r7 = r12 - r7
            float r7 = java.lang.Math.abs(r7)
            int r7 = (int) r7
            r9 = r20
        L_0x02d5:
            r11 = 4
            if (r9 == r11) goto L_0x02f0
            r11 = 2013(0x7dd, float:2.821E-42)
            if (r9 == r11) goto L_0x02f0
            r11 = 2
            if (r9 != r11) goto L_0x02ee
            if (r1 == 0) goto L_0x02ea
            boolean r9 = r1.getHasBgmInfo()
            r11 = 1
            if (r9 != r11) goto L_0x02ea
            r9 = 1
            goto L_0x02eb
        L_0x02ea:
            r9 = 0
        L_0x02eb:
            if (r9 == 0) goto L_0x02ee
            goto L_0x02f0
        L_0x02ee:
            r11 = 2
            goto L_0x02ff
        L_0x02f0:
            android.graphics.Rect r9 = r0.f171659e
            int r9 = r9.height()
            int r6 = r6.getHeight()
            r11 = 2
            int r6 = r6 / r11
            if (r9 <= r6) goto L_0x02ff
            int r7 = r7 - r5
        L_0x02ff:
            r6 = r19
            if (r7 >= r6) goto L_0x03a4
            int r6 = r13.mo75c()
            r15.f168207e = r6
            r15.f168208f = r10
            r15.f168209g = r2
            r9 = r12
            long r11 = r13.getItemId()
            r15.f168204b = r11
            r15.f168206d = r1
            r15.f168210h = r13
            er1.w3 r6 = er1.C58784w3.f168295a
            android.view.View r2 = r2.mo85812D(r4)
            if (r1 == 0) goto L_0x0325
            java.util.LinkedList r4 = r1.getMediaList()
            goto L_0x0327
        L_0x0325:
            r4 = r18
        L_0x0327:
            er1.j4 r6 = er1.C58739j4.f168176a
            if (r2 == 0) goto L_0x0359
            if (r4 == 0) goto L_0x0359
            com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner r2 = (com.tencent.p014mm.plugin.finder.view.FinderBaseMediaBanner) r2
            int r6 = r2.getFocusPosition()
            if (r6 < 0) goto L_0x0356
            int r6 = r2.getFocusPosition()
            int r11 = r4.size()
            if (r6 >= r11) goto L_0x0356
            int r2 = r2.getFocusPosition()
            java.lang.Object r2 = sx3.C110818d0.m150917O(r4, r2)
            te3.rq2 r2 = (te3.C64689rq2) r2
            if (r2 == 0) goto L_0x034e
            java.lang.String r2 = r2.f185275p
            goto L_0x0350
        L_0x034e:
            r2 = r18
        L_0x0350:
            if (r2 != 0) goto L_0x0354
            r2 = r41
        L_0x0354:
            r15.f168205c = r2
        L_0x0356:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x035b
        L_0x0359:
            r2 = r18
        L_0x035b:
            if (r2 != 0) goto L_0x0380
            if (r1 == 0) goto L_0x0373
            java.util.LinkedList r1 = r1.getMediaList()
            if (r1 == 0) goto L_0x0373
            r2 = 0
            java.lang.Object r1 = sx3.C110818d0.m150917O(r1, r2)
            te3.rq2 r1 = (te3.C64689rq2) r1
            if (r1 == 0) goto L_0x0374
            java.lang.String r1 = r1.f185275p
            r18 = r1
            goto L_0x0374
        L_0x0373:
            r2 = 0
        L_0x0374:
            if (r18 != 0) goto L_0x0379
            r1 = r41
            goto L_0x037b
        L_0x0379:
            r1 = r18
        L_0x037b:
            r15.f168205c = r1
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0381
        L_0x0380:
            r2 = 0
        L_0x0381:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 255(0xff, float:3.57E-43)
            r29 = 0
            r18 = r15
            er1.l r1 = er1.C58744l.m68320a(r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29)
            r4 = r36
            r4.add(r1)
            r6 = r7
            goto L_0x03a8
        L_0x03a4:
            r9 = r12
            r4 = r36
            r2 = 0
        L_0x03a8:
            r1 = r33
        L_0x03aa:
            if (r10 == r1) goto L_0x03c0
            int r10 = r10 + 1
            r11 = r4
            r12 = r9
            r7 = r32
            r4 = r34
            r13 = 0
            r9 = r1
            r1 = r35
            goto L_0x0167
        L_0x03ba:
            r31 = r2
            r32 = r7
            r4 = r11
            r2 = 0
        L_0x03c0:
            qt1.c r1 = r0.f171663i
            java.lang.String r5 = "findSelectedFeed end"
            r1.mo12482c(r5)
            java.util.LinkedList<er1.l> r1 = r15.f168211i
            r1.addAll(r4)
            java.lang.String r1 = "checkPublishFocusView"
            boolean r1 = r0.mo85114e(r15, r1)
            if (r1 == 0) goto L_0x0422
            com.tencent.mm.plugin.finder.storage.FeedData r1 = r15.f168206d
            if (r1 == 0) goto L_0x03e1
            int r1 = r1.getMediaType()
            r4 = 15
            if (r1 != r4) goto L_0x03e1
            r2 = 1
        L_0x03e1:
            if (r2 != 0) goto L_0x03eb
            long r1 = r15.f168204b
            r4 = r32
            r0.mo85115f(r4, r1)
            goto L_0x03ed
        L_0x03eb:
            r4 = r32
        L_0x03ed:
            bl3.r r1 = bl3.C39818r.f106831a
            android.content.Context r2 = r4.getContext()
            java.lang.String r5 = "recyclerView.context"
            gy3.C87412m.m108593f(r2, r5)
            bl3.r$a r1 = r1.mo62443b(r2)
            java.lang.Class<rs1.s8> r2 = rs1.C13442s8.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            rs1.s8 r1 = (rs1.C13442s8) r1
            int r2 = r0.f171657c
            ef1.f r1 = r1.mo12854j3(r2)
            if (r1 == 0) goto L_0x0422
            ef1.m r2 = new ef1.m
            r5 = 1
            r2.<init>(r5)
            int r5 = r15.f168208f
            r2.f25962c = r5
            long r5 = r15.f168204b
            r2.f25963d = r5
            hr1.e r5 = new hr1.e
            r5.<init>(r1, r2)
            r4.post(r5)
        L_0x0422:
            if (r31 == 0) goto L_0x044d
            java.lang.String r1 = "checkSame"
            boolean r1 = r0.mo85114e(r15, r1)
            if (r1 == 0) goto L_0x044d
            er1.l r1 = r0.f171660f
            long r1 = r1.f168204b
            long r4 = r15.f168204b
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x044d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "checkSelectedInternal return for selected same feed:"
            r1.append(r2)
            er1.l r0 = r0.f171660f
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
            goto L_0x04a8
        L_0x044d:
            er1.l r1 = r0.f171660f
            r2 = r30
            r0.mo85112c(r2, r1)
            r0.mo85111b(r2, r15)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "checkSelectedInternal firstFeedIndex="
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " firstVideoFeedIndex="
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = ", selectedFeed["
            r1.append(r2)
            r1.append(r15)
            r2 = 93
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            qt1.c r0 = r0.f171663i
            java.lang.String r1 = "end"
            r0.mo11310b(r1)
            goto L_0x04a8
        L_0x0488:
            r1 = r9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "checkSelectedInternal return for invalid position ["
            r0.append(r2)
            r0.append(r10)
            r0.append(r12)
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
        L_0x04a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hr1.C60134a.m70028a(hr1.a, java.util.Set, boolean, java.lang.String, int, java.lang.Object):void");
    }

    /* renamed from: b */
    public final void mo85111b(List<? extends C9493c> list, C58744l lVar) {
        int i;
        C58744l lVar2 = lVar;
        this.f171663i.mo12482c("onFeedSelected begin");
        if (mo85114e(lVar2, "dispatchOnFeedSelected")) {
            C58744l lVar3 = this.f171660f;
            int i2 = this.f171661g;
            int i3 = lVar3.f168208f;
            if (i3 >= 0 && (i = lVar2.f168208f) >= 0) {
                this.f171661g = i >= i3 ? 1 : 2;
            }
            if (i2 != this.f171661g) {
                Log.m105924i("FinderFeedSelectorAdapter", "checkScrollDirectionChanged direction change from " + i2 + " to " + this.f171661g);
            }
            this.f171660f = C58744l.m68320a(lVar, false, 0, (String) null, (FeedData) null, 0, 0, (C60905o) null, (C0740i2) null, 255, (Object) null);
            C58784w3 w3Var = C58784w3.f168295a;
            long j = lVar2.f168204b;
            w3Var.getClass();
            C58784w3.f168301g = j;
            C60135a aVar = this.f171658d;
            if (aVar != null) {
                C60905o oVar = lVar2.f168209g;
                C87412m.m108591d(oVar);
                List<? extends C9493c> list2 = list;
                aVar.mo79663G(list, lVar2, oVar, lVar2.f168208f);
            }
        }
        this.f171663i.mo12482c("onFeedSelected end");
    }

    /* renamed from: c */
    public final void mo85112c(List<? extends C9493c> list, C58744l lVar) {
        C60135a aVar;
        this.f171663i.mo12482c("onFeedUnSelected begin");
        if (mo85114e(lVar, "dispatchOnFeedUnSelected") && (aVar = this.f171658d) != null) {
            C60905o oVar = lVar.f168209g;
            C87412m.m108591d(oVar);
            aVar.mo79664W0(list, lVar, oVar, lVar.f168208f);
        }
        this.f171663i.mo12482c("onFeedUnSelected end");
    }

    /* renamed from: d */
    public final C58744l mo85113d(int i, C60905o oVar) {
        C60905o oVar2;
        FeedData feedData;
        C13598b0 b0Var;
        LinkedList<C64689rq2> mediaList;
        C64689rq2 rq22;
        int i2 = i;
        String str = null;
        if (oVar == null) {
            RecyclerView recyclerView = this.f171656b;
            RecyclerView.C16631z J0 = recyclerView != null ? recyclerView.mo17024J0(i2, false) : null;
            oVar2 = J0 instanceof C60905o ? (C60905o) J0 : null;
        } else {
            oVar2 = oVar;
        }
        if (oVar2 == null) {
            Log.m105928w("FinderFeedSelectorAdapter", "handleOnPageSelected return for holder:" + oVar2 + " position:" + i2);
            return null;
        }
        Object obj = oVar2.f173503E;
        C0740i2 i2Var = obj instanceof C0740i2 ? (C0740i2) obj : null;
        if (i2Var == null) {
            Log.m105928w("FinderFeedSelectorAdapter", "handleOnPageSelected return for item:" + i2Var + " position:" + i2);
            return null;
        }
        if (i2Var instanceof BaseFinderFeed) {
            feedData = FeedData.Companion.mo78883a((BaseFinderFeed) i2Var);
        } else if (i2Var instanceof C9833k9) {
            C9833k9 k9Var = (C9833k9) i2Var;
            FeedData feedData2 = new FeedData();
            feedData2.setFeedId(k9Var.f30387d.f184854u);
            feedData2.setMediaType(k9Var.mo75c());
            feedData2.setRvFeedList(k9Var.f30389f);
            feedData = feedData2;
        } else {
            feedData = null;
        }
        C58744l lVar = new C58744l(false, 0, (String) null, (FeedData) null, 0, 0, (C60905o) null, (C0740i2) null, 255, (C8480h) null);
        lVar.f168207e = i2Var.mo75c();
        lVar.f168208f = i2;
        lVar.f168209g = oVar2;
        lVar.f168204b = i2Var.getItemId();
        lVar.f168206d = feedData;
        lVar.f168210h = i2Var;
        C58784w3 w3Var = C58784w3.f168295a;
        View D = oVar2.mo85812D(C0966R.C0970id.ol9);
        LinkedList<C64689rq2> mediaList2 = feedData != null ? feedData.getMediaList() : null;
        C58739j4 j4Var = C58739j4.f168176a;
        String str2 = "";
        if (D == null || mediaList2 == null) {
            b0Var = null;
        } else {
            FinderBaseMediaBanner finderBaseMediaBanner = (FinderBaseMediaBanner) D;
            if (finderBaseMediaBanner.getFocusPosition() >= 0 && finderBaseMediaBanner.getFocusPosition() < mediaList2.size()) {
                C64689rq2 rq23 = (C64689rq2) C110818d0.m150917O(mediaList2, finderBaseMediaBanner.getFocusPosition());
                String str3 = rq23 != null ? rq23.f185275p : null;
                if (str3 == null) {
                    str3 = str2;
                }
                lVar.f168205c = str3;
            }
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            if (!(feedData == null || (mediaList = feedData.getMediaList()) == null || (rq22 = (C64689rq2) C110818d0.m150917O(mediaList, 0)) == null)) {
                str = rq22.f185275p;
            }
            if (str != null) {
                str2 = str;
            }
            lVar.f168205c = str2;
        }
        return lVar;
    }

    /* renamed from: e */
    public final boolean mo85114e(C58744l lVar, String str) {
        if (lVar == null) {
            Log.m105928w("FinderFeedSelectorAdapter", str + " checkFeedValid return for feed:" + lVar);
            return false;
        } else if (!lVar.f168203a) {
            Log.m105928w("FinderFeedSelectorAdapter", str + " checkFeedValid return for isValid:" + lVar.f168203a);
            return false;
        } else if (lVar.f168208f < 0) {
            Log.m105928w("FinderFeedSelectorAdapter", str + " checkFeedValid return for position:" + lVar.f168208f);
            return false;
        } else if (lVar.f168204b == 0) {
            Log.m105928w("FinderFeedSelectorAdapter", str + " checkFeedValid return for feedId:" + lVar.f168204b);
            return false;
        } else if (lVar.f168209g != null) {
            return true;
        } else {
            Log.m105928w("FinderFeedSelectorAdapter", str + " checkFeedValid return for holder:" + lVar.f168209g);
            return false;
        }
    }

    /* renamed from: f */
    public final void mo85115f(RecyclerView recyclerView, long j) {
        if (this.f171662h != j) {
            C39818r rVar = C39818r.f106831a;
            Context context = recyclerView.getContext();
            C87412m.m108593f(context, "recyclerView.context");
            C58556f j3 = ((C13442s8) rVar.mo62443b(context).mo75002a(C13442s8.class)).mo12854j3(this.f171657c);
            if (j3 != null) {
                Log.m105924i("FinderFeedSelectorAdapter", "publishFocusView: targetFeedId = " + j + ", lastFocusFeedId = " + this.f171662h);
                C7637b b = j3.mo8587b(recyclerView, 6);
                C87412m.m108592e(b, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.event.base.ScrollEvent");
                this.f171662h = ((C7642k) b).f25958i;
                recyclerView.post(new C60136b(j3, b));
            }
        }
    }
}
