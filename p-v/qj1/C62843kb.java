package qj1;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import b50.C54421g;
import cj1.C54847z3;
import cl1.C0678p1;
import cl1.C54951d;
import cl1.C54991o;
import cl1.C55001u;
import cl1.C55004v1;
import com.tencent.p014mm.live.core.view.LiveVideoView;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout;
import com.tencent.p014mm.plugin.finder.live.multistream.FinderLiveMultiStreamWidget;
import com.tencent.p014mm.plugin.finder.live.multistream.FinderLiveMultiStreamWidget$liveLayoutManager$1;
import com.tencent.p014mm.plugin.finder.live.multistream.MultiStreamRecyclerView;
import com.tencent.p014mm.plugin.finder.live.multistream.adapter.MultiStreamItemConvertFactory;
import com.tencent.p014mm.plugin.finder.live.multistream.panel.FinderLiveMultiStreamBottomPanelWidget;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import d50.C58113g;
import d50.C58114h;
import d50.C7170j;
import d60.C58124b;
import f50.C58924d;
import fh1.C59079s2;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import j50.C60735a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import mj1.C61487b;
import nj1.C61754a;
import nj1.C61755b;
import o40.C61926c;
import oj1.C62034b;
import ok1.C62042e;
import p50.C62197e;
import pj1.C35515b;
import pj1.C35516c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49712hj1;
import te3.C51493u41;
import te3.C52066y41;
import te3.C64239aq2;
import te3.C64733to;
import te3.C64890zp2;
import z04.C119027c;

/* renamed from: qj1.kb */
public final class C62843kb extends C62660c implements C61755b, C61754a {

    /* renamed from: p */
    public final C58124b f178345p;

    /* renamed from: q */
    public final C13601g f178346q;

    /* renamed from: r */
    public final C13601g f178347r;

    /* renamed from: s */
    public long f178348s;

    /* renamed from: t */
    public boolean f178349t;

    /* renamed from: qj1.kb$a */
    public /* synthetic */ class C62844a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f178350a;

        static {
            int[] iArr = new int[C58124b.C58125b.values().length];
            C58124b.C58125b bVar = C58124b.C58125b.UNKNOWN;
            iArr[7] = 1;
            f178350a = iArr;
        }
    }

    /* renamed from: qj1.kb$b */
    public static final class C62845b extends C87413o implements C32224a<FinderLiveMultiStreamBottomPanelWidget> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f178351d;

        /* renamed from: e */
        public final /* synthetic */ C62843kb f178352e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62845b(ViewGroup viewGroup, C62843kb kbVar) {
            super(0);
            this.f178351d = viewGroup;
            this.f178352e = kbVar;
        }

        public Object invoke() {
            Context context = this.f178351d.getContext();
            C87412m.m108593f(context, "root.context");
            return new FinderLiveMultiStreamBottomPanelWidget(context, this.f178352e);
        }
    }

    /* renamed from: qj1.kb$c */
    public static final class C62846c extends C87413o implements C32224a<FinderLiveMultiStreamWidget> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f178353d;

        /* renamed from: e */
        public final /* synthetic */ C62843kb f178354e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62846c(ViewGroup viewGroup, C62843kb kbVar) {
            super(0);
            this.f178353d = viewGroup;
            this.f178354e = kbVar;
        }

        public Object invoke() {
            return new FinderLiveMultiStreamWidget(this.f178353d, this.f178354e);
        }
    }

    /* renamed from: qj1.kb$d */
    public static final class C62847d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ LiveVideoView f178355d;

        /* renamed from: e */
        public final /* synthetic */ C55004v1 f178356e;

        /* renamed from: f */
        public final /* synthetic */ int f178357f;

        public C62847d(LiveVideoView liveVideoView, C55004v1 v1Var, int i) {
            this.f178355d = liveVideoView;
            this.f178356e = v1Var;
            this.f178357f = i;
        }

        public final void run() {
            int[] iArr = new int[2];
            this.f178355d.getLocationOnScreen(iArr);
            this.f178356e.f154436g.postValue(new C55004v1.C55005a(this.f178357f, iArr[0], iArr[1], this.f178355d.getHeight()));
        }
    }

    /* renamed from: qj1.kb$e */
    public static final class C62848e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LinkedList<C64239aq2> f178358d;

        /* renamed from: e */
        public final /* synthetic */ C62843kb f178359e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62848e(LinkedList<C64239aq2> linkedList, C62843kb kbVar) {
            super(0);
            this.f178358d = linkedList;
            this.f178359e = kbVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:62:0x0279, code lost:
            if (r6 == null) goto L_0x027b;
         */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0132  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0134  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x013a  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x01ba A[LOOP:2: B:30:0x01b2->B:32:0x01ba, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x01d4  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x01e3  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x01f7  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x031e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r20 = this;
                r0 = r20
                java.lang.Class<cl1.v1> r1 = cl1.C55004v1.class
                java.util.LinkedList<te3.aq2> r2 = r0.f178358d
                qj1.kb r3 = r0.f178359e
                java.util.ArrayList r4 = new java.util.ArrayList
                r5 = 10
                int r6 = sx3.C36907w.m41090l(r2, r5)
                r4.<init>(r6)
                java.util.Iterator r2 = r2.iterator()
            L_0x0017:
                boolean r6 = r2.hasNext()
                if (r6 == 0) goto L_0x0036
                java.lang.Object r6 = r2.next()
                te3.aq2 r6 = (te3.C64239aq2) r6
                oj1.b r7 = new oj1.b
                java.lang.Class<cl1.o> r8 = cl1.C54991o.class
                androidx.lifecycle.i0 r8 = r3.mo87696x0(r8)
                cl1.o r8 = (cl1.C54991o) r8
                java.lang.String r8 = r8.f154345o
                r7.<init>(r8, r6)
                r4.add(r7)
                goto L_0x0017
            L_0x0036:
                qj1.kb r2 = r0.f178359e
                androidx.lifecycle.i0 r2 = r2.mo87696x0(r1)
                cl1.v1 r2 = (cl1.C55004v1) r2
                com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<java.lang.Integer> r2 = r2.f154441o
                java.util.LinkedList<te3.aq2> r3 = r0.f178358d
                int r3 = r3.size()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2.postValue(r3)
                qj1.kb r2 = r0.f178359e
                com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamWidget r2 = r2.mo87804b1()
                qj1.kb r3 = r0.f178359e
                androidx.lifecycle.i0 r3 = r3.mo87696x0(r1)
                cl1.v1 r3 = (cl1.C55004v1) r3
                int r3 = r3.f154437h
                r2.getClass()
                int r6 = r4.size()
                int r6 = r6 * 10000
                int r6 = r6 + r3
                java.util.LinkedList<oj1.b> r7 = r2.f159430c
                int r8 = r7.size()
                int r9 = r4.size()
                r10 = 1
                r11 = 0
                if (r8 == r9) goto L_0x0077
                goto L_0x00f3
            L_0x0077:
                int r8 = r7.size()
                r9 = 0
            L_0x007c:
                if (r9 >= r8) goto L_0x00f8
                java.lang.Object r12 = r7.get(r9)
                oj1.b r12 = (oj1.C62034b) r12
                te3.aq2 r12 = r12.f176355b
                java.lang.String r12 = r12.f182132e
                java.lang.Object r13 = r4.get(r9)
                oj1.b r13 = (oj1.C62034b) r13
                te3.aq2 r13 = r13.f176355b
                java.lang.String r13 = r13.f182132e
                boolean r12 = gy3.C87412m.m108589b(r12, r13)
                if (r12 == 0) goto L_0x00f0
                java.lang.Object r12 = r7.get(r9)
                oj1.b r12 = (oj1.C62034b) r12
                te3.aq2 r12 = r12.f176355b
                java.lang.String r12 = r12.f182134g
                java.lang.Object r13 = r4.get(r9)
                oj1.b r13 = (oj1.C62034b) r13
                te3.aq2 r13 = r13.f176355b
                java.lang.String r13 = r13.f182134g
                boolean r12 = gy3.C87412m.m108589b(r12, r13)
                if (r12 == 0) goto L_0x00f0
                java.lang.Object r12 = r7.get(r9)
                oj1.b r12 = (oj1.C62034b) r12
                te3.aq2 r12 = r12.f176355b
                java.lang.String r12 = r12.f182133f
                java.lang.Object r13 = r4.get(r9)
                oj1.b r13 = (oj1.C62034b) r13
                te3.aq2 r13 = r13.f176355b
                java.lang.String r13 = r13.f182133f
                boolean r12 = gy3.C87412m.m108589b(r12, r13)
                if (r12 == 0) goto L_0x00f0
                java.lang.Object r12 = r7.get(r9)
                oj1.b r12 = (oj1.C62034b) r12
                te3.aq2 r12 = r12.f176355b
                te3.zp2 r12 = r12.f182131d
                java.util.LinkedList<te3.to> r12 = r12.f186812j
                int r12 = r12.size()
                java.lang.Object r13 = r4.get(r9)
                oj1.b r13 = (oj1.C62034b) r13
                te3.aq2 r13 = r13.f176355b
                te3.zp2 r13 = r13.f182131d
                java.util.LinkedList<te3.to> r13 = r13.f186812j
                int r13 = r13.size()
                if (r12 != r13) goto L_0x00f0
                r12 = 1
                goto L_0x00f1
            L_0x00f0:
                r12 = 0
            L_0x00f1:
                if (r12 != 0) goto L_0x00f5
            L_0x00f3:
                r7 = 0
                goto L_0x00f9
            L_0x00f5:
                int r9 = r9 + 1
                goto L_0x007c
            L_0x00f8:
                r7 = 1
            L_0x00f9:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "updateWidget size: "
                r8.append(r9)
                int r9 = r4.size()
                r8.append(r9)
                java.lang.String r9 = " lastPos: "
                r8.append(r9)
                r8.append(r3)
                java.lang.String r3 = " pos: "
                r8.append(r3)
                r8.append(r6)
                java.lang.String r3 = " isSame: "
                r8.append(r3)
                r8.append(r7)
                java.lang.String r3 = r8.toString()
                java.lang.String r8 = "MultiStreamWidget"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
                int r3 = r4.size()
                if (r3 <= r10) goto L_0x0134
                r3 = 1
                goto L_0x0135
            L_0x0134:
                r3 = 0
            L_0x0135:
                r2.f159438k = r3
                if (r7 == 0) goto L_0x013a
                goto L_0x018b
            L_0x013a:
                java.util.LinkedList<oj1.b> r3 = r2.f159430c
                r3.clear()
                java.util.LinkedList<oj1.b> r3 = r2.f159430c
                r3.addAll(r4)
                com.tencent.mm.plugin.finder.live.multistream.MultiStreamRecyclerView r3 = r2.f159429b
                k20.a r7 = new k20.a
                r7.<init>()
                java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r7.mo10233c(r6)
                java.lang.Object[] r13 = r7.mo10232b()
                java.lang.String r14 = "com/tencent/mm/plugin/finder/live/multistream/FinderLiveMultiStreamWidget"
                java.lang.String r15 = "updateWidget"
                java.lang.String r16 = "(Ljava/util/List;I)V"
                java.lang.String r17 = "Undefined"
                java.lang.String r18 = "scrollToPosition"
                java.lang.String r19 = "(I)V"
                r12 = r3
                j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
                java.lang.Object r6 = r7.mo10231a(r11)
                java.lang.Integer r6 = (java.lang.Integer) r6
                int r6 = r6.intValue()
                r3.mo17115r1(r6)
                java.lang.String r13 = "com/tencent/mm/plugin/finder/live/multistream/FinderLiveMultiStreamWidget"
                java.lang.String r14 = "updateWidget"
                java.lang.String r15 = "(Ljava/util/List;I)V"
                java.lang.String r16 = "Undefined"
                java.lang.String r17 = "scrollToPosition"
                java.lang.String r18 = "(I)V"
                j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
                mj1.a r2 = r2.f159431d
                r2.notifyDataSetChanged()
            L_0x018b:
                qj1.kb r2 = r0.f178359e
                com.tencent.mm.plugin.finder.live.multistream.panel.FinderLiveMultiStreamBottomPanelWidget r2 = r2.mo87803a1()
                qj1.kb r3 = r0.f178359e
                androidx.lifecycle.i0 r1 = r3.mo87696x0(r1)
                cl1.v1 r1 = (cl1.C55004v1) r1
                int r1 = r1.f154437h
                r2.getClass()
                java.util.ArrayList<com.tencent.mm.plugin.finder.live.multistream.adapter.MultiStreamItemConvertFactory$a> r3 = r2.f159464o
                r3.clear()
                java.util.ArrayList<com.tencent.mm.plugin.finder.live.multistream.adapter.MultiStreamItemConvertFactory$a> r3 = r2.f159464o
                java.util.ArrayList r6 = new java.util.ArrayList
                int r7 = sx3.C36907w.m41090l(r4, r5)
                r6.<init>(r7)
                java.util.Iterator r7 = r4.iterator()
            L_0x01b2:
                boolean r8 = r7.hasNext()
                r9 = 2
                r12 = 0
                if (r8 == 0) goto L_0x01c9
                java.lang.Object r8 = r7.next()
                oj1.b r8 = (oj1.C62034b) r8
                com.tencent.mm.plugin.finder.live.multistream.adapter.MultiStreamItemConvertFactory$a r13 = new com.tencent.mm.plugin.finder.live.multistream.adapter.MultiStreamItemConvertFactory$a
                r13.<init>(r8, r11, r9, r12)
                r6.add(r13)
                goto L_0x01b2
            L_0x01c9:
                r3.addAll(r6)
                java.util.ArrayList<com.tencent.mm.plugin.finder.live.multistream.adapter.MultiStreamItemConvertFactory$a> r3 = r2.f159464o
                int r3 = r3.size()
                if (r3 > r9) goto L_0x01e3
                android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.graphics.Point r3 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r3)
                int r3 = r3.y
                float r3 = (float) r3
                r6 = 1052938076(0x3ec28f5c, float:0.38)
                goto L_0x01f1
            L_0x01e3:
                android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.graphics.Point r3 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r3)
                int r3 = r3.y
                float r3 = (float) r3
                r6 = 1057300152(0x3f051eb8, float:0.52)
            L_0x01f1:
                float r3 = r3 * r6
                android.view.View r6 = r2.f159461i
                if (r6 == 0) goto L_0x031e
                android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
                if (r6 == 0) goto L_0x0222
                android.content.Context r7 = r2.f28306d
                android.content.res.Resources r7 = r7.getResources()
                android.content.res.Configuration r7 = r7.getConfiguration()
                int r7 = r7.orientation
                if (r7 != r9) goto L_0x020f
                r3 = -1
                r6.height = r3
                goto L_0x0222
            L_0x020f:
                int r3 = (int) r3
                android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r7 = r7.getResources()
                r8 = 2131165363(0x7f0700b3, float:1.794494E38)
                int r7 = r7.getDimensionPixelSize(r8)
                int r3 = r3 - r7
                r6.height = r3
            L_0x0222:
                r2.f159466q = r1
                int r3 = r4.size()
                if (r1 >= r3) goto L_0x0236
                java.util.ArrayList<com.tencent.mm.plugin.finder.live.multistream.adapter.MultiStreamItemConvertFactory$a> r1 = r2.f159464o
                int r3 = r2.f159466q
                java.lang.Object r1 = r1.get(r3)
                com.tencent.mm.plugin.finder.live.multistream.adapter.MultiStreamItemConvertFactory$a r1 = (com.tencent.p014mm.plugin.finder.live.multistream.adapter.MultiStreamItemConvertFactory.C55940a) r1
                r1.f159458e = r10
            L_0x0236:
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.plugin.finder.live.multistream.adapter.MultiStreamItemConvertFactory$a> r1 = r2.f159463n
                if (r1 == 0) goto L_0x023d
                r1.notifyDataSetChanged()
            L_0x023d:
                int r1 = r2.f159466q
                r2.mo77679r(r1)
                java.util.ArrayList<oj1.a> r1 = r2.f159465p
                r1.clear()
                java.util.ArrayList<oj1.a> r1 = r2.f159465p
                java.util.ArrayList<com.tencent.mm.plugin.finder.live.multistream.adapter.MultiStreamItemConvertFactory$a> r3 = r2.f159464o
                java.util.ArrayList r4 = new java.util.ArrayList
                int r5 = sx3.C36907w.m41090l(r3, r5)
                r4.<init>(r5)
                java.util.Iterator r3 = r3.iterator()
            L_0x0258:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L_0x0318
                java.lang.Object r5 = r3.next()
                com.tencent.mm.plugin.finder.live.multistream.adapter.MultiStreamItemConvertFactory$a r5 = (com.tencent.p014mm.plugin.finder.live.multistream.adapter.MultiStreamItemConvertFactory.C55940a) r5
                oj1.b r6 = r5.f159457d
                te3.aq2 r6 = r6.f176355b
                java.lang.String r6 = r6.f182134g
                if (r6 == 0) goto L_0x027b
                int r7 = r6.length()
                if (r7 <= 0) goto L_0x0274
                r7 = 1
                goto L_0x0275
            L_0x0274:
                r7 = 0
            L_0x0275:
                if (r7 == 0) goto L_0x0278
                goto L_0x0279
            L_0x0278:
                r6 = r12
            L_0x0279:
                if (r6 != 0) goto L_0x0281
            L_0x027b:
                nj1.b r6 = r2.f159460h
                java.lang.String r6 = r6.mo86662y()
            L_0x0281:
                oj1.b r7 = r5.f159457d
                te3.aq2 r8 = r7.f176355b
                te3.zp2 r8 = r8.f182131d
                java.util.LinkedList<te3.to> r8 = r8.f186812j
                int r8 = r8.size()
                r9 = 5
                r13 = 0
                r14 = 0
            L_0x0290:
                if (r13 >= r8) goto L_0x02b0
                te3.aq2 r15 = r7.f176355b
                te3.zp2 r15 = r15.f182131d
                java.util.LinkedList<te3.to> r15 = r15.f186812j
                java.lang.Object r15 = r15.get(r13)
                te3.to r15 = (te3.C64733to) r15
                int r15 = r15.f185627j
                if (r10 > r15) goto L_0x02a7
                if (r15 >= r9) goto L_0x02a7
                r16 = 1
                goto L_0x02a9
            L_0x02a7:
                r16 = 0
            L_0x02a9:
                if (r16 == 0) goto L_0x02ad
                r14 = r13
                r9 = r15
            L_0x02ad:
                int r13 = r13 + 1
                goto L_0x0290
            L_0x02b0:
                te3.aq2 r8 = r7.f176355b
                te3.zp2 r8 = r8.f182131d
                java.util.LinkedList<te3.to> r8 = r8.f186812j
                java.lang.Object r8 = r8.get(r14)
                te3.to r8 = (te3.C64733to) r8
                if (r8 == 0) goto L_0x02f5
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r15 = "getLowPlayUrl video_quality_level: "
                r13.append(r15)
                r13.append(r9)
                java.lang.String r9 = " index: "
                r13.append(r9)
                r13.append(r14)
                java.lang.String r9 = " rate: "
                r13.append(r9)
                int r9 = r8.f185625h
                r13.append(r9)
                java.lang.String r9 = " desc: "
                r13.append(r9)
                java.lang.String r8 = r8.f185624g
                r13.append(r8)
                r8 = 125(0x7d, float:1.75E-43)
                r13.append(r8)
                java.lang.String r8 = r13.toString()
                java.lang.String r9 = "MultiStreamData"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            L_0x02f5:
                te3.aq2 r7 = r7.f176355b
                te3.zp2 r7 = r7.f182131d
                java.util.LinkedList<te3.to> r7 = r7.f186812j
                java.lang.Object r7 = r7.get(r14)
                te3.to r7 = (te3.C64733to) r7
                java.lang.String r7 = r7.f185622e
                java.lang.String r8 = "channelParamsDesc.channe…_trans_info[minIndex].url"
                gy3.C87412m.m108593f(r7, r8)
                oj1.b r5 = r5.f159457d
                te3.aq2 r5 = r5.f176355b
                te3.zp2 r5 = r5.f182131d
                oj1.a r8 = new oj1.a
                r8.<init>(r6, r7, r5)
                r4.add(r8)
                goto L_0x0258
            L_0x0318:
                r1.addAll(r4)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            L_0x031e:
                java.lang.String r1 = "rootView"
                gy3.C87412m.m108603p(r1)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C62843kb.C62848e.invoke():java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62843kb(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178345p = bVar;
        this.f178346q = C36568h.m40985a(new C62846c(viewGroup, this));
        this.f178347r = C36568h.m40985a(new C62845b(viewGroup, this));
        mo10792g(8);
    }

    /* renamed from: Z0 */
    public static final void m73930Z0(C62843kb kbVar, LinkedList linkedList) {
        Class cls = C55004v1.class;
        C55004v1 v1Var = (C55004v1) kbVar.mo87696x0(cls);
        if (linkedList.size() > 0) {
            Log.m105924i("MultiStreamPlugin", "notifyMultiStreamUpdate before pos: " + ((C55004v1) v1Var.business(cls)).f154437h);
            if (((C55004v1) v1Var.business(cls)).f154437h >= linkedList.size()) {
                ((C55004v1) v1Var.business(cls)).f154437h = 0;
            }
            LinkedList<C64239aq2> linkedList2 = v1Var.f154438i;
            int i = ((C55004v1) v1Var.business(cls)).f154437h;
            String str = null;
            C64239aq2 aq22 = i >= linkedList2.size() ? null : linkedList2.get(i);
            String str2 = aq22 != null ? aq22.f182132e : null;
            int i2 = ((C55004v1) v1Var.business(cls)).f154437h;
            C64239aq2 aq23 = i2 >= linkedList.size() ? null : (C64239aq2) linkedList.get(i2);
            if (aq23 != null) {
                str = aq23.f182132e;
            }
            if (!C87412m.m108589b(str2, str)) {
                C55004v1 v1Var2 = (C55004v1) v1Var.business(cls);
                Iterator it = linkedList.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                        break;
                    } else if (C87412m.m108589b(((C64239aq2) it.next()).f182132e, str2)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                v1Var2.f154437h = i3;
            }
            if (((C55004v1) v1Var.business(cls)).f154437h < 0) {
                ((C55004v1) v1Var.business(cls)).f154437h = 0;
            }
            Log.m105924i("MultiStreamPlugin", "notifyMultiStreamUpdate pos: " + ((C55004v1) v1Var.business(cls)).f154437h);
        }
        v1Var.f154438i = linkedList;
        Iterator it4 = linkedList.iterator();
        while (it4.hasNext()) {
            C64890zp2 zp22 = ((C64239aq2) it4.next()).f182131d;
            zp22.f186798S = v1Var.f154444r;
            zp22.f186799T = v1Var.f154445s;
            zp22.f186800U = v1Var.f154446t;
        }
        kbVar.mo87805c1(linkedList);
    }

    /* renamed from: B */
    public void mo86648B(int i) {
        Class cls = C54991o.class;
        ((C54991o) mo87696x0(cls)).f154286Z = !((C54991o) mo87696x0(cls)).f154286Z;
        Bundle bundle = new Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", ((C54991o) mo87696x0(cls)).f154286Z);
        this.f178345p.statusChange(C58124b.C58125b.FINDER_LIVE_CLEAR_SCREEN, bundle);
    }

    /* renamed from: G */
    public void mo86649G(int i, C62034b bVar, C58924d dVar, LiveVideoView liveVideoView, boolean z) {
        C62707db dbVar;
        C58113g gVar;
        int i2 = i;
        C62034b bVar2 = bVar;
        C58924d dVar2 = dVar;
        LiveVideoView liveVideoView2 = liveVideoView;
        Class cls = C63170ze.class;
        Class cls2 = C55001u.class;
        C87412m.m108594g(bVar2, "curStream");
        C87412m.m108594g(liveVideoView2, "view");
        Log.m105924i("MultiStreamPlugin", "onMultiStreamChange isUnMount: " + this.f178349t + " hashCode: " + hashCode() + " player: " + dVar2 + " view: " + liveVideoView2 + " data: " + bVar2 + ' ');
        if (!this.f178349t) {
            String str = bVar2.f176355b.f182131d.f186807e;
            if (str == null || str.length() == 0) {
                C64239aq2 aq22 = bVar2.f176355b;
                aq22.f182131d.f186807e = aq22.f182132e;
            }
            HashMap<Integer, C7170j> hashMap = new HashMap<>();
            LinkedList<C64733to> linkedList = bVar2.f176355b.f182131d.f186812j;
            if (linkedList != null) {
                for (C64733to toVar : linkedList) {
                    Integer valueOf = Integer.valueOf(toVar.f185623f);
                    String str2 = toVar.f185622e;
                    C87412m.m108593f(str2, "it.url");
                    hashMap.put(valueOf, new C7170j(str2, toVar.f185627j, toVar.f185628n));
                }
            }
            C54991o oVar = (C54991o) mo87696x0(C54991o.class);
            oVar.f154332k1 = bVar2.f176355b.f182131d.f186819s;
            if (oVar.mo75992a4()) {
                oVar.f154332k1 = 1;
            }
            C58114h hVar = ((C55001u) mo87696x0(cls2)).f154421r;
            if (!(hVar == null || (gVar = hVar.f166251b) == null)) {
                gVar.f166241k = hashMap;
                C64890zp2 zp22 = bVar2.f176355b.f182131d;
                C87412m.m108593f(zp22, "curStream.channelParamsDesc.channel_params");
                gVar.f166244n = zp22;
                gVar.f166243m = bVar2.f176355b.f182131d.f186822v;
                ((C0678p1) mo87696x0(C0678p1.class)).f1596f = C61926c.m72696u(gVar.f166243m, 2);
            }
            C63170ze zeVar = (C63170ze) mo87687E0(cls);
            if (zeVar != null) {
                zeVar.f179244r = liveVideoView2;
                zeVar.mo88093e1();
            }
            FinderLiveService.f159376d.getClass();
            C60735a aVar = FinderLiveService.f159378f;
            C62197e eVar = aVar instanceof C62197e ? (C62197e) aVar : null;
            if (eVar != null) {
                C54421g gVar2 = eVar.f176822Y0;
                gVar2.f152627a = dVar2;
                Log.m105924i("MicroMsg.LiveCdnPlayerManager", "setTXLivePlayer: " + gVar2.f152627a);
                C63170ze zeVar2 = (C63170ze) mo87687E0(cls);
                if (!(zeVar2 != null && zeVar2.f179247u) && dVar2 != null) {
                    dVar2.setPlayListener(eVar);
                }
                eVar.mo87270J0(((C55001u) mo87696x0(cls2)).f154420q.f182392d, dVar2, liveVideoView2);
            }
            C64890zp2 zp23 = bVar2.f176355b.f182131d;
            if (zp23.f186801V > 0 && zp23.f186802W > 0) {
                Bundle bundle = new Bundle();
                bundle.putInt("EVT_PARAM1", zp23.f186801V);
                bundle.putInt("EVT_PARAM2", zp23.f186802W);
                this.f178345p.statusChange(C58124b.C58125b.LIVE_STATUS_RESOLUTION, bundle);
            }
            C55004v1 v1Var = (C55004v1) mo87696x0(C55004v1.class);
            v1Var.f154437h = i2;
            liveVideoView2.post(new C62847d(liveVideoView2, v1Var, i2));
            FinderLiveMultiStreamBottomPanelWidget a1 = mo87803a1();
            a1.f159466q = i2;
            int size = a1.f159464o.size();
            int i3 = 0;
            while (i3 < size) {
                a1.f159464o.get(i3).f159458e = i3 == a1.f159466q;
                i3++;
            }
            WxRecyclerAdapter<MultiStreamItemConvertFactory.C55940a> wxRecyclerAdapter = a1.f159463n;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyDataSetChanged();
            }
            a1.mo77679r(a1.f159466q);
            if (!z && (dbVar = (C62707db) mo87687E0(C62707db.class)) != null) {
                dbVar.mo87721c1();
            }
        }
    }

    /* renamed from: H */
    public boolean mo86653H() {
        return ((C54951d) mo87696x0(C54951d.class)).mo75869e3();
    }

    /* renamed from: L */
    public int mo86654L(int i, int i2) {
        int j0 = C62042e.f176370a.mo87089j0(i, i2);
        C59079s2 s2Var = (C59079s2) mo87685B0(C59079s2.class);
        return j0 + (s2Var != null ? s2Var.f169029p : 0);
    }

    /* renamed from: M */
    public void mo86650M(int i) {
        FinderLiveMultiStreamWidget b1 = mo87804b1();
        int size = (b1.f159430c.size() * 10000) + i;
        Log.m105924i("MultiStreamWidget", "notifySelected position: " + i + " pos: " + size);
        MultiStreamRecyclerView multiStreamRecyclerView = b1.f159429b;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(size));
        MultiStreamRecyclerView multiStreamRecyclerView2 = multiStreamRecyclerView;
        C117292a.m165358d(multiStreamRecyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/multistream/FinderLiveMultiStreamWidget", "notifySelected", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        multiStreamRecyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(multiStreamRecyclerView2, "com/tencent/mm/plugin/finder/live/multistream/FinderLiveMultiStreamWidget", "notifySelected", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        b1.f159442o = true;
    }

    /* renamed from: O */
    public boolean mo86655O() {
        return !((C54951d) mo87696x0(C54951d.class)).mo75869e3();
    }

    /* renamed from: O0 */
    public void mo12017O0(Configuration configuration) {
        FinderLiveMultiStreamWidget b1 = mo87804b1();
        b1.getClass();
        if (C85875k4.m106157N()) {
            int childCount = b1.f159429b.getChildCount();
            if (childCount >= 0) {
                int i = 0;
                while (true) {
                    Log.m105924i("MultiStreamWidget", "multistream onConfigurationChanged pos: " + i);
                    View childAt = b1.f159429b.getChildAt(i);
                    FinderLiveMultiStreamViewLayout finderLiveMultiStreamViewLayout = childAt instanceof FinderLiveMultiStreamViewLayout ? (FinderLiveMultiStreamViewLayout) childAt : null;
                    if (finderLiveMultiStreamViewLayout != null) {
                        finderLiveMultiStreamViewLayout.mo77670f(true);
                    }
                    if (i == childCount) {
                        break;
                    }
                    i++;
                }
            }
            MultiStreamRecyclerView multiStreamRecyclerView = b1.f159429b;
            int i2 = b1.f159440m;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i2));
            MultiStreamRecyclerView multiStreamRecyclerView2 = multiStreamRecyclerView;
            C117292a.m165358d(multiStreamRecyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/multistream/FinderLiveMultiStreamWidget", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Undefined", "scrollToPosition", "(I)V");
            multiStreamRecyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(multiStreamRecyclerView2, "com/tencent/mm/plugin/finder/live/multistream/FinderLiveMultiStreamWidget", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Undefined", "scrollToPosition", "(I)V");
        }
    }

    /* renamed from: S */
    public boolean mo86656S() {
        T t;
        boolean z;
        Iterator<T> it = ((C55004v1) mo87696x0(C55004v1.class)).f154438i.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            C64890zp2 zp22 = ((C64239aq2) t).f182131d;
            if (zp22.f186801V < zp22.f186802W) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return t != null;
    }

    /* renamed from: a1 */
    public final FinderLiveMultiStreamBottomPanelWidget mo87803a1() {
        return (FinderLiveMultiStreamBottomPanelWidget) ((C36570n) this.f178347r).getValue();
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: b1 */
    public final FinderLiveMultiStreamWidget mo87804b1() {
        return (FinderLiveMultiStreamWidget) ((C36570n) this.f178346q).getValue();
    }

    /* renamed from: c */
    public void mo86651c(float f) {
        if (!mo82893g0()) {
            ((C55004v1) mo87696x0(C55004v1.class)).f154442p.postValue(Float.valueOf(f));
        }
    }

    /* renamed from: c1 */
    public final void mo87805c1(LinkedList<C64239aq2> linkedList) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("updateMultiStream size: ");
        sb.append(linkedList.size());
        sb.append(" multiStreamData =  ");
        StringBuilder sb4 = new StringBuilder();
        for (C64239aq2 aq22 : linkedList) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("stream_id: ");
            sb5.append(aq22.f182132e);
            sb5.append(" desc: ");
            String str2 = aq22.f182133f;
            if (str2 != null) {
                byte[] decode = Base64.decode(str2, 0);
                C87412m.m108593f(decode, "decode(it, Base64.DEFAULT)");
                str = new String(decode, C119027c.f356488a);
            } else {
                str = "";
            }
            sb5.append(str);
            sb5.append(" cdnSize: ");
            sb5.append(aq22.f182131d.f186812j.size());
            sb5.append(10);
            sb4.append(sb5.toString());
        }
        String sb6 = sb4.toString();
        C87412m.m108593f(sb6, "sb.toString()");
        sb.append(sb6);
        Log.m105924i("MultiStreamPlugin", sb.toString());
        if (linkedList.size() > 0) {
            C61926c.m72668M(new C62848e(linkedList, this));
        }
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        super.mo10792g(i);
        if (i == 0) {
            mo87689H0(this.f166287d, "MultiStreamPlugin");
        }
    }

    public C61754a getEvent() {
        return this;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return false;
    }

    /* renamed from: i */
    public void mo86652i(float f) {
        ((C55004v1) mo87696x0(C55004v1.class)).f154443q.postValue(Float.valueOf(f));
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
        Log.m105924i("MultiStreamPlugin", "multiStreamMount: " + hashCode());
        this.f178349t = false;
    }

    /* renamed from: j */
    public TXCloudVideoView mo86658j() {
        C63170ze zeVar = (C63170ze) mo87687E0(C63170ze.class);
        if (zeVar != null) {
            return zeVar.mo88092d1();
        }
        return null;
    }

    /* renamed from: l */
    public int mo86659l() {
        return this.f166287d.getWidth();
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: o */
    public C58924d mo86660o() {
        C63170ze zeVar = (C63170ze) mo87687E0(C63170ze.class);
        if (zeVar != null) {
            return zeVar.mo88091c1();
        }
        return null;
    }

    /* renamed from: u */
    public C54421g mo86661u() {
        C62197e e0 = FinderLiveService.f159376d.mo77631e0();
        if (e0 != null) {
            return e0.f176822Y0;
        }
        return null;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        if (C62844a.f178350a[bVar.ordinal()] == 1) {
            Class cls = C55004v1.class;
            LinkedList<C64239aq2> linkedList = ((C55004v1) mo87696x0(cls)).f154438i;
            Log.m105924i("MultiStreamPlugin", "initPlugin multiChannelParamsList: " + linkedList.size());
            if (linkedList.size() > 0) {
                FinderLiveService finderLiveService = FinderLiveService.f159376d;
                finderLiveService.getClass();
                C54847z3 z3Var = FinderLiveService.f159383n;
                z3Var.mo75800f(13);
                finderLiveService.getClass();
                C52066y41 y412 = new C52066y41();
                y412.f145110d = this.f178348s;
                C13598b0 b0Var = C13598b0.f38549a;
                z3Var.mo75799e(13, y412, new C62923pb(this, C51493u41.class), false);
                mo10792g(0);
                FinderLiveMultiStreamWidget b1 = mo87804b1();
                b1.getClass();
                Log.m105924i("MultiStreamWidget", "initWidget");
                FinderLiveMultiStreamWidget$liveLayoutManager$1 finderLiveMultiStreamWidget$liveLayoutManager$1 = b1.f159432e;
                finderLiveMultiStreamWidget$liveLayoutManager$1.f159780y = -1;
                finderLiveMultiStreamWidget$liveLayoutManager$1.f159778w = 0;
                finderLiveMultiStreamWidget$liveLayoutManager$1.f159779x = false;
                b1.f159438k = true;
                b1.f159433f = -1;
                b1.f159434g = false;
                b1.f159435h = -1;
                b1.f159436i = -1;
                b1.f159437j = false;
                b1.f159441n = true;
                b1.f159439l = "";
                mo87805c1(linkedList);
            } else {
                mo10792g(8);
            }
            ((C55004v1) mo87696x0(cls)).f154435f.observe(this, new C62871lb(this));
            ((C55004v1) mo87696x0(cls)).f154439j.observe(this, new C62894nb(this));
            ((C55004v1) mo87696x0(cls)).f154440n.observe(this, new C62915ob(this));
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        Log.m105924i("MultiStreamPlugin", "multiStreamUnMount: " + hashCode());
        this.f178349t = true;
        FinderLiveService.f159376d.getClass();
        FinderLiveService.f159383n.mo75800f(13);
        FinderLiveMultiStreamWidget b1 = mo87804b1();
        b1.getClass();
        HashMap<String, C58924d> hashMap = C61487b.f174813a;
        C58924d o = b1.f159428a.mo86660o();
        Log.m105924i("MultiStreamPlayerManager", "onDestroy curPlayer: " + o);
        for (Map.Entry next : C61487b.f174813a.entrySet()) {
            if (!C87412m.m108589b(next.getValue(), o)) {
                ((C58924d) next.getValue()).stopPlay(true);
            }
        }
        C61487b.f174813a.clear();
        b1.f159438k = false;
        b1.f159433f = -1;
        b1.f159434g = false;
        b1.f159435h = -1;
        b1.f159436i = -1;
        b1.f159437j = false;
        b1.f159441n = true;
        b1.f159439l = "";
        C35516c cVar = mo87803a1().mo77678q().f177134g;
        cVar.f94976c.post(new C35515b(cVar));
    }

    /* renamed from: y */
    public String mo86662y() {
        Class cls = C54991o.class;
        return ((C54991o) ((C54991o) mo87696x0(cls)).business(cls)).mo75969L3();
    }
}
