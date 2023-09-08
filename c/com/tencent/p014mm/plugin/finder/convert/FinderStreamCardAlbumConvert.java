package com.tencent.p014mm.plugin.finder.convert;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import com.tencent.p014mm.plugin.finder.view.C56586b2;
import com.tencent.p014mm.plugin.finder.view.FinderFeedAlbumView;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import dp1.C58394n1;
import dp1.C58417y0;
import eb0.C31543z5;
import eo1.C58638b;
import er1.C58684b;
import er1.C58784w3;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hr1.C8730k;
import ht1.C60159d2;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import je1.C46518f;
import je1.C46525m1;
import jq3.C60896i;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kf1.C9833k9;
import le1.C10496h;
import o40.C61926c;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sr1.C64161b;
import sx3.C26236u;
import sx3.C36907w;
import te3.C49173do1;
import te3.C49712hj1;
import te3.C50159kp0;
import te3.C50976ql1;
import te3.C64441i93;
import te3.C64629pl1;
import te3.C64654qd;
import te3.C64689rq2;
import te3.db4;
import te3.op4;
import te3.vd4;
import tf1.C64927s;
import u60.C14121l;
import u60.C65233m;
import up1.C37521f;
import vp1.C65834e;
import zc1.C66785b;
import zp3.C16382e;

/* renamed from: com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert */
public final class FinderStreamCardAlbumConvert extends C60896i<C9833k9> {

    /* renamed from: e */
    public final FinderTimelinePresenter f158435e;

    /* renamed from: f */
    public final int f158436f;

    /* renamed from: g */
    public final C13601g f158437g = C36568h.m40985a(C2417p.f12826d);

    /* renamed from: h */
    public C49712hj1 f158438h;

    /* renamed from: i */
    public final C13601g f158439i = C36568h.m40985a(C29939c.f81093d);

    /* renamed from: j */
    public final C65233m f158440j;

    /* renamed from: n */
    public boolean f158441n;

    /* renamed from: o */
    public final C64927s<C0740i2> f158442o;

    /* renamed from: p */
    public final ArrayList<C64689rq2> f158443p;

    /* renamed from: q */
    public final Rect f158444q;

    /* renamed from: r */
    public final Rect f158445r;

    /* renamed from: s */
    public final C55687q f158446s;

    /* renamed from: t */
    public final FinderStreamCardAlbumConvert$lifecycleObserver$1 f158447t;

    /* renamed from: u */
    public RecyclerView f158448u;

    /* renamed from: v */
    public View f158449v;

    /* renamed from: w */
    public C55675a f158450w;

    /* renamed from: x */
    public boolean f158451x;

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$h */
    public static final class C2414h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f12823d;

        public C2414h(C60905o oVar) {
            this.f12823d = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f12823d.f44854d.findViewById(C0966R.C0970id.ari).callOnClick();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$i */
    public static final class C2415i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f12824d;

        public C2415i(C60905o oVar) {
            this.f12824d = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f12824d.f44854d.findViewById(C0966R.C0970id.ari).callOnClick();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$n */
    public static final class C2416n implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f12825d;

        public C2416n(C60905o oVar) {
            this.f12825d = oVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0059, code lost:
            r8 = (r8 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) sx3.C110818d0.m150917O((r8 = r8.media), 0)).url;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onLongClick(android.view.View r8) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$9"
                java.lang.String r2 = "android/view/View$OnLongClickListener"
                java.lang.String r3 = "onLongClick"
                java.lang.String r4 = "(Landroid/view/View;)Z"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                jq3.o r8 = r7.f12825d
                java.lang.Object r8 = r8.f173503E
                kf1.k9 r8 = (kf1.C9833k9) r8
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "FinderStreamCardFeed="
                r0.append(r1)
                te3.pl1 r1 = r8.f30387d
                java.lang.String r1 = le1.C10496h.m10426a(r1)
                r0.append(r1)
                r1 = 32
                r0.append(r1)
                te3.pl1 r8 = r8.f30387d
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r8 = r8.f184844h
                java.lang.Object r8 = r8.getFirst()
                java.lang.String r1 = "item.card.`object`.first"
                gy3.C87412m.m108593f(r8, r1)
                com.tencent.mm.protocal.protobuf.FinderObject r8 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r8
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r8 = r8.objectDesc
                if (r8 == 0) goto L_0x0062
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r8 = r8.media
                if (r8 == 0) goto L_0x0062
                r1 = 0
                java.lang.Object r8 = sx3.C110818d0.m150917O(r8, r1)
                com.tencent.mm.protocal.protobuf.FinderMedia r8 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r8
                if (r8 == 0) goto L_0x0062
                java.lang.String r8 = r8.url
                if (r8 == 0) goto L_0x0062
                java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r8)
                goto L_0x0063
            L_0x0062:
                r8 = 0
            L_0x0063:
                if (r8 != 0) goto L_0x0067
                java.lang.String r8 = ""
            L_0x0067:
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                java.lang.String r0 = "Finder.FinderStreamCardAlbumConvert"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)
                r8 = 1
                r0 = 1
                java.lang.String r2 = "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$9"
                java.lang.String r3 = "android/view/View$OnLongClickListener"
                java.lang.String r4 = "onLongClick"
                java.lang.String r5 = "(Landroid/view/View;)Z"
                r1 = r7
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderStreamCardAlbumConvert.C2416n.onLongClick(android.view.View):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$p */
    public static final class C2417p extends C87413o implements C32224a<C58638b> {

        /* renamed from: d */
        public static final C2417p f12826d = new C2417p();

        public C2417p() {
            super(0);
        }

        public Object invoke() {
            return new C58638b(((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Hx0(), "FinderStreamCardAlbum");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$c */
    public static final class C29939c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C29939c f81093d = new C29939c();

        public C29939c() {
            super(0);
        }

        public Object invoke() {
            C37521f.f99374d.getClass();
            boolean z = true;
            if (C37521f.f99447l3.mo60266n().intValue() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$a */
    public static final class C55675a {

        /* renamed from: a */
        public C9833k9 f158452a;

        /* renamed from: b */
        public long f158453b;

        /* renamed from: c */
        public long f158454c;

        /* renamed from: d */
        public long f158455d;

        /* renamed from: e */
        public int f158456e;

        public C55675a(C9833k9 k9Var, long j, long j2, long j3, int i) {
            this.f158452a = k9Var;
            this.f158453b = j;
            this.f158454c = j2;
            this.f158455d = j3;
            this.f158456e = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C55675a)) {
                return false;
            }
            C55675a aVar = (C55675a) obj;
            return C87412m.m108589b(this.f158452a, aVar.f158452a) && this.f158453b == aVar.f158453b && this.f158454c == aVar.f158454c && this.f158455d == aVar.f158455d && this.f158456e == aVar.f158456e;
        }

        public int hashCode() {
            C9833k9 k9Var = this.f158452a;
            int hashCode = k9Var == null ? 0 : k9Var.hashCode();
            long j = this.f158453b;
            long j2 = this.f158454c;
            long j3 = this.f158455d;
            return (((((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f158456e;
        }

        public String toString() {
            return "ExposeItem(item=" + this.f158452a + ", feedId=" + this.f158453b + ", sumTimeMs=" + this.f158454c + ", startTimeMs=" + this.f158455d + ", position=" + this.f158456e + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$b */
    public static final class C55676b extends C87413o implements C32226l<C14121l, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f158457d;

        /* renamed from: e */
        public final /* synthetic */ C9833k9 f158458e;

        /* renamed from: f */
        public final /* synthetic */ FinderStreamCardAlbumConvert$fetchContent$loader$1 f158459f;

        /* renamed from: g */
        public final /* synthetic */ FinderStreamCardAlbumConvert f158460g;

        /* renamed from: h */
        public final /* synthetic */ db4 f158461h;

        /* renamed from: i */
        public final /* synthetic */ C32226l<C9833k9, C13598b0> f158462i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55676b(boolean z, C9833k9 k9Var, FinderStreamCardAlbumConvert$fetchContent$loader$1 finderStreamCardAlbumConvert$fetchContent$loader$1, FinderStreamCardAlbumConvert finderStreamCardAlbumConvert, db4 db4, C32226l<? super C9833k9, C13598b0> lVar) {
            super(1);
            this.f158457d = z;
            this.f158458e = k9Var;
            this.f158459f = finderStreamCardAlbumConvert$fetchContent$loader$1;
            this.f158460g = finderStreamCardAlbumConvert;
            this.f158461h = db4;
            this.f158462i = lVar;
        }

        public Object invoke(Object obj) {
            C50159kp0 kp02;
            LinkedList<db4> linkedList;
            C14121l lVar = (C14121l) obj;
            C87412m.m108594g(lVar, "task");
            Log.m105924i("Finder.FinderStreamCardAlbumConvert", "[fetchContent#execute] isRefresh=" + this.f158457d + ' ' + C10496h.m10426a(this.f158458e.f30387d));
            C50159kp0 kp03 = null;
            if (!this.f158457d) {
                FinderStreamCardAlbumConvert$fetchContent$loader$1 finderStreamCardAlbumConvert$fetchContent$loader$1 = this.f158459f;
                C50976ql1 ql12 = this.f158458e.f30387d.f184835A;
                if (ql12 != null) {
                    kp03 = ql12.f140381f;
                }
                finderStreamCardAlbumConvert$fetchContent$loader$1.f13549q = kp03;
            } else {
                FinderStreamCardAlbumConvert$fetchContent$loader$1 finderStreamCardAlbumConvert$fetchContent$loader$12 = this.f158459f;
                C50976ql1 ql13 = this.f158458e.f30387d.f184837C;
                if (ql13 != null) {
                    kp03 = ql13.f140381f;
                }
                finderStreamCardAlbumConvert$fetchContent$loader$12.f13549q = kp03;
            }
            if (((Boolean) ((C36570n) this.f158460g.f158439i).getValue()).booleanValue()) {
                this.f158459f.setPreload(this.f158460g.f158442o);
            }
            db4 db4 = this.f158461h;
            if (!(db4 == null || (kp02 = this.f158459f.f13549q) == null || (linkedList = kp02.f136926B) == null)) {
                linkedList.add(db4);
            }
            this.f158459f.f13553u = new C2447j(lVar, this.f158458e, this.f158457d, this.f158460g, this.f158462i);
            this.f158459f.requestRefresh();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$d */
    public static final class C55677d extends C87413o implements C32226l<C9833k9, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderStreamCardAlbumConvert f158463d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f158464e;

        /* renamed from: f */
        public final /* synthetic */ int f158465f;

        /* renamed from: g */
        public final /* synthetic */ int f158466g;

        /* renamed from: h */
        public final /* synthetic */ boolean f158467h;

        /* renamed from: i */
        public final /* synthetic */ List<Object> f158468i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55677d(FinderStreamCardAlbumConvert finderStreamCardAlbumConvert, C60905o oVar, int i, int i2, boolean z, List<Object> list) {
            super(1);
            this.f158463d = finderStreamCardAlbumConvert;
            this.f158464e = oVar;
            this.f158465f = i;
            this.f158466g = i2;
            this.f158467h = z;
            this.f158468i = list;
        }

        public Object invoke(Object obj) {
            C9833k9 k9Var = (C9833k9) obj;
            C87412m.m108594g(k9Var, LocaleUtil.ITALIAN);
            if (!k9Var.f30389f.isEmpty()) {
                this.f158463d.mo44e(this.f158464e, k9Var, this.f158465f, this.f158466g, this.f158467h, this.f158468i);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$e */
    public static final class C55678e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderStreamCardAlbumConvert f158469d;

        public C55678e(FinderStreamCardAlbumConvert finderStreamCardAlbumConvert) {
            this.f158469d = finderStreamCardAlbumConvert;
        }

        public final void run() {
            C8730k kVar = this.f158469d.f158435e.f13242B.f161828n;
            if (kVar != null) {
                kVar.mo9563s1("Finder.FinderStreamCardAlbumConvert");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$f */
    public static final class C55679f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ LinearLayout f158470d;

        public C55679f(LinearLayout linearLayout) {
            this.f158470d = linearLayout;
        }

        public final void run() {
            Rect rect = new Rect();
            this.f158470d.getHitRect(rect);
            rect.inset(rect.width(), (-rect.height()) / 2);
            ViewParent parent = this.f158470d.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
            ((View) parent).setTouchDelegate(new TouchDelegate(rect, this.f158470d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$g */
    public static final class C55680g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderStreamCardAlbumConvert f158471d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f158472e;

        /* renamed from: f */
        public final /* synthetic */ int f158473f;

        /* renamed from: com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$g$a */
        public static final class C55681a extends C87413o implements C32226l<C9833k9, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ View f158474d;

            /* renamed from: e */
            public final /* synthetic */ FinderStreamCardAlbumConvert f158475e;

            /* renamed from: f */
            public final /* synthetic */ C60905o f158476f;

            /* renamed from: g */
            public final /* synthetic */ int f158477g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C55681a(View view, FinderStreamCardAlbumConvert finderStreamCardAlbumConvert, C60905o oVar, int i) {
                super(1);
                this.f158474d = view;
                this.f158475e = finderStreamCardAlbumConvert;
                this.f158476f = oVar;
                this.f158477g = i;
            }

            public Object invoke(Object obj) {
                C9833k9 k9Var = (C9833k9) obj;
                C87412m.m108594g(k9Var, LocaleUtil.ITALIAN);
                View findViewById = this.f158474d.findViewById(C0966R.C0970id.ijd);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/FinderStreamCardFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/FinderStreamCardFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById2 = this.f158474d.findViewById(C0966R.C0970id.ijg);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view2 = findViewById2;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/FinderStreamCardFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/FinderStreamCardFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (!k9Var.f30389f.isEmpty()) {
                    FinderStreamCardAlbumConvert finderStreamCardAlbumConvert = this.f158475e;
                    C60905o oVar = this.f158476f;
                    finderStreamCardAlbumConvert.mo44e(oVar, k9Var, oVar.mo17363j(), this.f158477g, true, (List<Object>) null);
                }
                this.f158475e.f158450w.f158455d = System.currentTimeMillis();
                this.f158475e.f158441n = false;
                return C13598b0.f38549a;
            }
        }

        public C55680g(FinderStreamCardAlbumConvert finderStreamCardAlbumConvert, C60905o oVar, int i) {
            this.f158471d = finderStreamCardAlbumConvert;
            this.f158472e = oVar;
            this.f158473f = i;
        }

        public final void onClick(View view) {
            View view2 = view;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view2);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderStreamCardAlbumConvert finderStreamCardAlbumConvert = this.f158471d;
            if (finderStreamCardAlbumConvert.f158441n) {
                Log.m105928w("Finder.FinderStreamCardAlbumConvert", "isRefreshing");
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            finderStreamCardAlbumConvert.f158441n = true;
            C9833k9 k9Var = (C9833k9) this.f158472e.f173503E;
            long currentTimeMillis = System.currentTimeMillis();
            FinderStreamCardAlbumConvert finderStreamCardAlbumConvert2 = this.f158471d;
            long j = currentTimeMillis - finderStreamCardAlbumConvert2.f158450w.f158455d;
            int indexOf = finderStreamCardAlbumConvert2.f158435e.f13285z.getDataListJustForAdapter().indexOf(k9Var);
            C58394n1 n1Var = C58394n1.f167305a;
            String str = k9Var.f30387d.f184841e;
            String str2 = "";
            String str3 = str == null ? str2 : str;
            C49712hj1 hj12 = this.f158471d.f158438h;
            if (hj12 != null) {
                n1Var.mo83233a(str3, k9Var, indexOf, j, hj12);
                C64629pl1 pl12 = k9Var.f30387d;
                String str4 = pl12.f184841e;
                if (str4 != null) {
                    str2 = str4;
                }
                long j2 = pl12.f184854u;
                C49712hj1 hj13 = this.f158471d.f158438h;
                if (hj13 != null) {
                    n1Var.mo83234b(str2, j2, 3, 0, hj13, indexOf);
                    View findViewById = view2.findViewById(C0966R.C0970id.ijd);
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view3 = findViewById;
                    C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View findViewById2 = view2.findViewById(C0966R.C0970id.ijg);
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(0);
                    View view4 = findViewById2;
                    String str5 = "(Landroid/view/View;)V";
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    FinderStreamCardAlbumConvert finderStreamCardAlbumConvert3 = this.f158471d;
                    db4 m = finderStreamCardAlbumConvert3.mo77184m(k9Var);
                    List b = C26236u.m33719b(m);
                    C49712hj1 hj14 = finderStreamCardAlbumConvert3.f158438h;
                    if (hj14 != null) {
                        C46525m1 m1Var = new C46525m1(b, hj14);
                        m1Var.f256791h = true;
                        m1Var.mo9225i();
                        FinderStreamCardAlbumConvert finderStreamCardAlbumConvert4 = this.f158471d;
                        finderStreamCardAlbumConvert4.mo77183l(true, k9Var, m, new C55681a(view2, finderStreamCardAlbumConvert4, this.f158472e, this.f158473f));
                        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", str5);
                        return;
                    }
                    C87412m.m108603p("contextObj");
                    throw null;
                }
                C87412m.m108603p("contextObj");
                throw null;
            }
            C87412m.m108603p("contextObj");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$j */
    public static final class C55682j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f158478d;

        /* renamed from: e */
        public final /* synthetic */ FinderStreamCardAlbumConvert f158479e;

        public C55682j(C60905o oVar, FinderStreamCardAlbumConvert finderStreamCardAlbumConvert) {
            this.f158478d = oVar;
            this.f158479e = finderStreamCardAlbumConvert;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!((C9833k9) this.f158478d.f173503E).f30389f.isEmpty()) {
                FinderStreamCardAlbumConvert finderStreamCardAlbumConvert = this.f158479e;
                Context context = this.f158478d.f173499A;
                C87412m.m108593f(context, "holder.context");
                FinderStreamCardAlbumConvert.m63272k(finderStreamCardAlbumConvert, context, 4, this.f158478d);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$k */
    public static final class C55683k implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f158480d;

        /* renamed from: e */
        public final /* synthetic */ FinderStreamCardAlbumConvert f158481e;

        public C55683k(C60905o oVar, FinderStreamCardAlbumConvert finderStreamCardAlbumConvert) {
            this.f158480d = oVar;
            this.f158481e = finderStreamCardAlbumConvert;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!((C9833k9) this.f158480d.f173503E).f30389f.isEmpty()) {
                FinderStreamCardAlbumConvert finderStreamCardAlbumConvert = this.f158481e;
                Context context = this.f158480d.f173499A;
                C87412m.m108593f(context, "holder.context");
                FinderStreamCardAlbumConvert.m63272k(finderStreamCardAlbumConvert, context, 2, this.f158480d);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$l */
    public static final class C55684l extends C64161b {

        /* renamed from: d */
        public final /* synthetic */ C60905o f158482d;

        /* renamed from: e */
        public final /* synthetic */ FinderStreamCardAlbumConvert f158483e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55684l(C60905o oVar, FinderStreamCardAlbumConvert finderStreamCardAlbumConvert, ArrayList<C64689rq2> arrayList) {
            super(arrayList, true);
            this.f158482d = oVar;
            this.f158483e = finderStreamCardAlbumConvert;
        }

        /* renamed from: f */
        public C9833k9 mo77195f() {
            return (C9833k9) this.f158482d.f173503E;
        }

        /* renamed from: g */
        public FinderVideoCore mo77196g() {
            return this.f158483e.f158435e.f13242B;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$m */
    public static final class C55685m implements C60159d2.C60160a {

        /* renamed from: a */
        public final /* synthetic */ C60905o f158484a;

        /* renamed from: b */
        public final /* synthetic */ FinderStreamCardAlbumConvert f158485b;

        public C55685m(C60905o oVar, FinderStreamCardAlbumConvert finderStreamCardAlbumConvert) {
            this.f158484a = oVar;
            this.f158485b = finderStreamCardAlbumConvert;
        }

        /* renamed from: a */
        public void mo77197a(int i, View view) {
            C87412m.m108594g(view, "view");
            C60905o oVar = this.f158484a;
            C9833k9 k9Var = (C9833k9) oVar.f173503E;
            if (k9Var != null) {
                FinderStreamCardAlbumConvert finderStreamCardAlbumConvert = this.f158485b;
                Log.m105924i("Finder.FinderStreamCardAlbumConvert", "[onClick] position=" + i + ' ' + k9Var.f30387d.f184854u);
                Context context = view.getContext();
                C87412m.m108593f(context, "view.context");
                FinderStreamCardAlbumConvert.m63272k(finderStreamCardAlbumConvert, context, 1, oVar);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$o */
    public static final class C55686o extends C87413o implements C32226l<C14121l, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderStreamCardAlbumConvert f158486d;

        /* renamed from: e */
        public final /* synthetic */ C9833k9 f158487e;

        /* renamed from: f */
        public final /* synthetic */ db4 f158488f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55686o(FinderStreamCardAlbumConvert finderStreamCardAlbumConvert, C9833k9 k9Var, db4 db4) {
            super(1);
            this.f158486d = finderStreamCardAlbumConvert;
            this.f158487e = k9Var;
            this.f158488f = db4;
        }

        public Object invoke(Object obj) {
            LinkedList<db4> linkedList;
            C14121l lVar = (C14121l) obj;
            C87412m.m108594g(lVar, "task");
            C49712hj1 hj12 = this.f158486d.f158438h;
            C50159kp0 kp02 = null;
            if (hj12 != null) {
                FinderStreamCardAlbumConvert$preloadContent$1$loader$1 finderStreamCardAlbumConvert$preloadContent$1$loader$1 = new FinderStreamCardAlbumConvert$preloadContent$1$loader$1(this.f158488f, hj12);
                finderStreamCardAlbumConvert$preloadContent$1$loader$1.register(new C16382e());
                finderStreamCardAlbumConvert$preloadContent$1$loader$1.setPreload(this.f158486d.f158442o);
                C50976ql1 ql12 = this.f158487e.f30387d.f184837C;
                if (ql12 != null) {
                    kp02 = ql12.f140381f;
                }
                finderStreamCardAlbumConvert$preloadContent$1$loader$1.f13549q = kp02;
                db4 db4 = this.f158488f;
                if (!(db4 == null || kp02 == null || (linkedList = kp02.f136926B) == null)) {
                    linkedList.add(db4);
                }
                finderStreamCardAlbumConvert$preloadContent$1$loader$1.requestPreload(new C55691k(this.f158486d, this.f158487e, lVar));
                return C13598b0.f38549a;
            }
            C87412m.m108603p("contextObj");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$q */
    public static final class C55687q extends RecyclerView.C0130p {

        /* renamed from: d */
        public boolean f158489d;

        /* renamed from: e */
        public final /* synthetic */ FinderStreamCardAlbumConvert f158490e;

        /* renamed from: com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$q$a */
        public static final class C55688a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ FinderStreamCardAlbumConvert f158491d;

            /* renamed from: e */
            public final /* synthetic */ C55687q f158492e;

            public C55688a(FinderStreamCardAlbumConvert finderStreamCardAlbumConvert, C55687q qVar) {
                this.f158491d = finderStreamCardAlbumConvert;
                this.f158492e = qVar;
            }

            public final void run() {
                FinderStreamCardAlbumConvert finderStreamCardAlbumConvert = this.f158491d;
                View view = finderStreamCardAlbumConvert.f158449v;
                if (view != null) {
                    C55687q qVar = this.f158492e;
                    boolean j = FinderStreamCardAlbumConvert.m63271j(finderStreamCardAlbumConvert, view);
                    boolean z = qVar.f158489d;
                    if (!z && j) {
                        qVar.f158489d = true;
                        finderStreamCardAlbumConvert.f158450w.f158455d = System.currentTimeMillis();
                    } else if (z && !j) {
                        qVar.f158489d = false;
                        C9833k9 k9Var = finderStreamCardAlbumConvert.f158450w.f158452a;
                        if (k9Var != null) {
                            long currentTimeMillis = System.currentTimeMillis() - finderStreamCardAlbumConvert.f158450w.f158455d;
                            int indexOf = finderStreamCardAlbumConvert.f158435e.f13285z.getDataListJustForAdapter().indexOf(k9Var);
                            C58394n1 n1Var = C58394n1.f167305a;
                            String str = k9Var.f30387d.f184841e;
                            if (str == null) {
                                str = "";
                            }
                            String str2 = str;
                            C49712hj1 hj12 = finderStreamCardAlbumConvert.f158438h;
                            if (hj12 != null) {
                                n1Var.mo83233a(str2, k9Var, indexOf, currentTimeMillis, hj12);
                            } else {
                                C87412m.m108603p("contextObj");
                                throw null;
                            }
                        }
                    }
                }
            }
        }

        public C55687q(FinderStreamCardAlbumConvert finderStreamCardAlbumConvert) {
            this.f158490e = finderStreamCardAlbumConvert;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                recyclerView.post(new C55688a(this.f158490e, this));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    public FinderStreamCardAlbumConvert(FinderTimelinePresenter finderTimelinePresenter, int i) {
        C87412m.m108594g(finderTimelinePresenter, "contract");
        this.f158435e = finderTimelinePresenter;
        this.f158436f = i;
        C65233m mVar = new C65233m("StreamCardFeedLoader");
        mVar.mo89361d();
        this.f158440j = mVar;
        this.f158442o = new C64927s<>(0, 1, (C8480h) null);
        ArrayList<C64689rq2> arrayList = new ArrayList<>(4);
        for (int i2 = 0; i2 < 4; i2++) {
            arrayList.add(new C64689rq2());
        }
        this.f158443p = arrayList;
        this.f158444q = new Rect();
        this.f158445r = new Rect();
        this.f158446s = new C55687q(this);
        this.f158447t = new FinderStreamCardAlbumConvert$lifecycleObserver$1(this);
        this.f158450w = new C55675a((C9833k9) null, 0, 0, 0, -1);
    }

    /* renamed from: j */
    public static final boolean m63271j(FinderStreamCardAlbumConvert finderStreamCardAlbumConvert, View view) {
        view.getHitRect(finderStreamCardAlbumConvert.f158444q);
        RecyclerView recyclerView = finderStreamCardAlbumConvert.f158448u;
        if (recyclerView != null) {
            recyclerView.getLocalVisibleRect(finderStreamCardAlbumConvert.f158445r);
        }
        Rect rect = finderStreamCardAlbumConvert.f158444q;
        int i = rect.top;
        if (i < 0) {
            rect.top = 0;
        } else {
            int i2 = finderStreamCardAlbumConvert.f158445r.bottom;
            if (i > i2) {
                rect.top = i2;
            }
        }
        int i3 = rect.bottom;
        if (i3 < 0) {
            rect.bottom = 0;
        } else {
            int i4 = finderStreamCardAlbumConvert.f158445r.bottom;
            if (i3 > i4) {
                rect.bottom = i4;
            }
        }
        return view.getHeight() > 0 && finderStreamCardAlbumConvert.f158444q.height() > 0 && finderStreamCardAlbumConvert.f158444q.height() >= view.getHeight() / 6;
    }

    /* renamed from: k */
    public static final void m63272k(FinderStreamCardAlbumConvert finderStreamCardAlbumConvert, Context context, int i, C60905o oVar) {
        finderStreamCardAlbumConvert.getClass();
        C9833k9 k9Var = (C9833k9) oVar.f173503E;
        LinkedList<BaseFinderFeed> linkedList = k9Var.f30389f;
        if (!Util.isNullOrNil((List) linkedList)) {
            int indexOf = finderStreamCardAlbumConvert.f158435e.f13285z.getDataListJustForAdapter().indexOf(k9Var);
            C58394n1 n1Var = C58394n1.f167305a;
            C64629pl1 pl12 = k9Var.f30387d;
            String str = pl12.f184841e;
            if (str == null) {
                str = "";
            }
            long j = pl12.f184854u;
            long itemId = linkedList.get(0).getItemId();
            C49712hj1 hj12 = finderStreamCardAlbumConvert.f158438h;
            if (hj12 != null) {
                n1Var.mo83234b(str, j, i, itemId, hj12, indexOf);
                Log.m105924i("Finder.FinderStreamCardAlbumConvert", "[jumpRelatedTimelineUI] parentIndex=" + indexOf + " cardBuffer=" + k9Var.f30387d.f184846j);
                if (linkedList.get(0).getItemId() != 0) {
                    Intent intent = new Intent();
                    intent.putExtra("TITLE_WORDING", k9Var.f30387d.f184841e);
                    intent.putExtra("CARD_ID", k9Var.f30387d.f184854u);
                    intent.putExtra("GET_REL_SCENE", k9Var.f30387d.f184849p);
                    intent.putExtra("STREAM_CARD", k9Var.f30387d.toByteArray());
                    intent.putExtra("COMMENT_SCENE", 51);
                    C58784w3.m68427B1(C58784w3.f168295a, 0, new LinkedList(linkedList), k9Var.f30387d.f184846j, intent, (C2780c) null, 16, (Object) null);
                    ((C58684b) C86312j.m106911c(C58684b.class)).dk0(context, intent);
                    return;
                }
                return;
            }
            C87412m.m108603p("contextObj");
            throw null;
        }
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f6248m;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        this.f158448u = recyclerView;
        C39818r rVar = C39818r.f106831a;
        Context context = recyclerView.getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        this.f158438h = ((C13442s8) rVar.mo62444c((MMActivity) context).mo75002a(C13442s8.class)).mo12853i3(this.f158436f);
        recyclerView.mo17098m1(this.f158446s);
        recyclerView.mo17043c(this.f158446s);
        Context context2 = recyclerView.getContext();
        C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((MMActivity) context2).getLifecycle().removeObserver(this.f158447t);
        Context context3 = recyclerView.getContext();
        C87412m.m108592e(context3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((MMActivity) context3).getLifecycle().addObserver(this.f158447t);
        LinearLayout linearLayout = (LinearLayout) oVar.f44854d.findViewById(C0966R.C0970id.ije);
        linearLayout.post(new C55679f(linearLayout));
        linearLayout.setOnClickListener(new C55680g(this, oVar, i));
        oVar.f44854d.findViewById(C0966R.C0970id.j8c).setOnClickListener(new C2414h(oVar));
        oVar.f44854d.findViewById(C0966R.C0970id.arg).setOnClickListener(new C2415i(oVar));
        C85875k4.m106189j0(((TextView) oVar.f44854d.findViewById(C0966R.C0970id.arg)).getPaint(), 0.8f);
        C85875k4.m106189j0(((TextView) oVar.f44854d.findViewById(C0966R.C0970id.ijc)).getPaint(), 0.8f);
        oVar.f44854d.findViewById(C0966R.C0970id.j8a).setOnClickListener(new C55682j(oVar, this));
        oVar.f44854d.findViewById(C0966R.C0970id.ari).setOnClickListener(new C55683k(oVar, this));
        C55684l lVar = new C55684l(oVar, this, this.f158443p);
        lVar.f181880c = new C55685m(oVar, this);
        ((FinderFeedAlbumView) oVar.f44854d.findViewById(C0966R.C0970id.cy8)).setAdapter(lVar);
        if (BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
            oVar.f44854d.setOnLongClickListener(new C2416n(oVar));
        }
    }

    /* renamed from: g */
    public void mo2296g(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        this.f173479d = false;
        boolean d = this.f158442o.mo89085d();
        Log.m105924i("Finder.FinderStreamCardAlbumConvert", "[onDetachedFromRecyclerView] ret=" + d + " report unReadItem");
        IResponse<T> iResponse = this.f158442o.f186954c;
        if (iResponse != null) {
            C58784w3 w3Var = C58784w3.f168295a;
            int i = this.f158436f;
            List<T> incrementList = iResponse.getIncrementList();
            if (incrementList == null) {
                incrementList = new LinkedList<>();
            }
            C49712hj1 hj12 = this.f158438h;
            if (hj12 != null) {
                w3Var.getClass();
                LinkedList linkedList = new LinkedList();
                for (T t : incrementList) {
                    if (!C65834e.f189316a.mo89873g(i, t.getItemId())) {
                        C49173do1 do12 = new C49173do1();
                        do12.f132446d = t.getItemId();
                        if (t instanceof BaseFinderFeed) {
                            do12.f132447e = ((BaseFinderFeed) t).mo3513o().getObjectNonceId();
                        }
                        do12.f132449g = ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83281Cu(do12.f132446d, hj12.f134675i);
                        do12.f132448f = 4;
                        linkedList.add(do12);
                    }
                }
                if (!linkedList.isEmpty()) {
                    new C46518f(linkedList, hj12).mo9225i();
                    return;
                }
                return;
            }
            C87412m.m108603p("contextObj");
            throw null;
        }
    }

    /* renamed from: l */
    public final void mo77183l(boolean z, C9833k9 k9Var, db4 db4, C32226l<? super C9833k9, C13598b0> lVar) {
        C50159kp0 kp02;
        vd4 vd4;
        StringBuilder sb = new StringBuilder();
        sb.append("[fetchContent] isRefresh=");
        sb.append(z);
        sb.append(" hasCache=");
        sb.append(this.f158442o.f186954c != null);
        sb.append(" card request id=");
        C50976ql1 ql12 = k9Var.f30387d.f184837C;
        sb.append(C61926c.m72691p((ql12 == null || (kp02 = ql12.f140381f) == null || (vd4 = kp02.f136954z) == null) ? 0 : vd4.f143446d));
        sb.append(C10496h.m10426a(k9Var.f30387d));
        Log.m105924i("Finder.FinderStreamCardAlbumConvert", sb.toString());
        C49712hj1 hj12 = this.f158438h;
        if (hj12 != null) {
            FinderStreamCardAlbumConvert$fetchContent$loader$1 finderStreamCardAlbumConvert$fetchContent$loader$1 = new FinderStreamCardAlbumConvert$fetchContent$loader$1(db4, hj12);
            finderStreamCardAlbumConvert$fetchContent$loader$1.register(new C16382e());
            this.f158440j.mo11856a(new C14121l(new C55676b(z, k9Var, finderStreamCardAlbumConvert$fetchContent$loader$1, this, db4, lVar), (String) null, 2, (C8480h) null));
            return;
        }
        C87412m.m108603p("contextObj");
        throw null;
    }

    /* renamed from: m */
    public final db4 mo77184m(C9833k9 k9Var) {
        db4 db4 = new db4();
        db4.f182678f = new op4();
        db4.f182677e = new C64654qd();
        db4.f182679g = new C64441i93();
        C64629pl1 pl12 = k9Var.f30387d;
        db4.f182676d = pl12.f184854u;
        db4.f182684o = pl12.f184855v;
        db4.f182686q = C58784w3.f168295a.mo83890O(this.f158436f);
        db4.f182681i = C66785b.f191882e.mo90662O5();
        db4.f182687r = k9Var.f30390g;
        db4.f182682j = C31543z5.m39453c();
        db4.f182689t = 11;
        return db4;
    }

    /* renamed from: n */
    public void mo44e(C60905o oVar, C9833k9 k9Var, int i, int i2, boolean z, List<Object> list) {
        C60905o oVar2 = oVar;
        C9833k9 k9Var2 = k9Var;
        int i3 = i;
        boolean z2 = z;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(k9Var2, "item");
        Log.m105924i("Finder.FinderStreamCardAlbumConvert", "[onBindViewHolder] isHotPatch=" + z2 + " pos=" + i3 + " item=" + C10496h.m10426a(k9Var2.f30387d) + " rvFeedList isEmpty=" + k9Var2.f30389f.isEmpty());
        this.f158449v = oVar2.f44854d;
        C55675a aVar = this.f158450w;
        aVar.f158453b = k9Var2.f30387d.f184854u;
        aVar.f158456e = i3;
        aVar.f158452a = k9Var2;
        k9Var2.f30391h = i3;
        boolean z3 = true;
        C13598b0 b0Var = null;
        if (!z2 && k9Var2.f30389f.isEmpty()) {
            C50976ql1 ql12 = k9Var2.f30387d.f184835A;
            if (ql12 == null || ql12.f140379d != 1) {
                z3 = false;
            }
            if (z3) {
                mo77183l(false, k9Var2, (db4) null, new C55677d(this, oVar, i, i2, z, list));
            }
        } else if (!k9Var2.f30389f.isEmpty()) {
            this.f158443p.clear();
            ArrayList<C64689rq2> arrayList = this.f158443p;
            LinkedList<BaseFinderFeed> linkedList = k9Var2.f30389f;
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (BaseFinderFeed o : linkedList) {
                arrayList2.add(o.mo3513o().getMediaList().getFirst());
            }
            arrayList.addAll(arrayList2.subList(0, Math.min(4, k9Var2.f30389f.size())));
            FinderFeedAlbumView finderFeedAlbumView = (FinderFeedAlbumView) oVar2.f44854d.findViewById(C0966R.C0970id.cy8);
            finderFeedAlbumView.f162108i = true;
            finderFeedAlbumView.isInLayout();
            finderFeedAlbumView.post(new C56586b2(finderFeedAlbumView));
            finderFeedAlbumView.post(new C55678e(this));
            mo77186o(k9Var2, mo77184m(k9Var2));
        }
        ((NeatTextView) oVar2.f44854d.findViewById(C0966R.C0970id.knx)).mo104279b(k9Var2.f30387d.f184841e);
        ((TextView) oVar2.f44854d.findViewById(C0966R.C0970id.k9f)).setText(k9Var2.f30387d.f184853t);
        String str = k9Var2.f30387d.f184836B;
        if (str != null) {
            View findViewById = oVar2.f44854d.findViewById(C0966R.C0970id.ije);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/feed/FinderStreamCardFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/feed/FinderStreamCardFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((TextView) oVar2.f44854d.findViewById(C0966R.C0970id.ijc)).setText(str);
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            View findViewById2 = oVar2.f44854d.findViewById(C0966R.C0970id.ije);
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/feed/FinderStreamCardFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/feed/FinderStreamCardFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: o */
    public final void mo77186o(C9833k9 k9Var, db4 db4) {
        C50159kp0 kp02;
        vd4 vd4;
        if (((Boolean) ((C36570n) this.f158439i).getValue()).booleanValue()) {
            String str = k9Var.f30387d.f184836B;
            boolean z = false;
            if (!(str == null || str.length() == 0)) {
                if (this.f158442o.f186954c != null) {
                    z = true;
                }
                if (z) {
                    Log.m105928w("Finder.FinderStreamCardAlbumConvert", "has cache never use. just return.");
                } else if (this.f158451x) {
                    Log.m105928w("Finder.FinderStreamCardAlbumConvert", "isPreloadContenting. just return.");
                } else {
                    this.f158451x = true;
                    StringBuilder sb = new StringBuilder();
                    sb.append("[preloadContent] now title=");
                    sb.append(k9Var.f30387d.f184841e);
                    sb.append(" stats=");
                    long j = 0;
                    sb.append(C61926c.m72691p(db4 != null ? db4.f182676d : 0));
                    sb.append(" card request id=");
                    C50976ql1 ql12 = k9Var.f30387d.f184837C;
                    if (!(ql12 == null || (kp02 = ql12.f140381f) == null || (vd4 = kp02.f136954z) == null)) {
                        j = vd4.f143446d;
                    }
                    sb.append(C61926c.m72691p(j));
                    sb.append(' ');
                    sb.append(C10496h.m10426a(k9Var.f30387d));
                    Log.m105924i("Finder.FinderStreamCardAlbumConvert", sb.toString());
                    this.f158440j.mo11856a(new C14121l(new C55686o(this, k9Var, db4), (String) null, 2, (C8480h) null));
                }
            }
        }
    }
}
