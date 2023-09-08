package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderEnterSharedCardStruct;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dp1.C58417y0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kf1.C9785i2;
import kf1.C9805j2;
import kf1.C9854m5;
import kotlin.Metadata;
import o40.C61926c;
import pe3.C89349b;
import qo3.C77407n;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49165dm1;
import te3.C49712hj1;
import te3.C50159kp0;
import te3.C50976ql1;
import te3.C64629pl1;
import tf1.C13913l;
import up1.C37521f;
import vf1.C65688b;
import vf1.C65691c;
import vf1.C65693d;
import vp1.C65834e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderAlbumTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderFeedRelTimelineLoader;", "Lkf1/j2;", "Lkf1/i2;", "<init>", "()V", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI */
public final class FinderAlbumTimelineUI extends FinderLoaderFeedUI<FinderFeedRelTimelineLoader, C9805j2, C9785i2> {

    /* renamed from: G */
    public static final /* synthetic */ int f158817G = 0;

    /* renamed from: A */
    public final C13601g f158818A = C36568h.m40985a(new C55785e(this));

    /* renamed from: B */
    public final C13601g f158819B = C36568h.m40985a(new C55794n(this));

    /* renamed from: C */
    public final C13601g f158820C = C36568h.m40985a(new C55793m(this));

    /* renamed from: D */
    public final C13601g f158821D = C36568h.m40985a(new C55784d(this));

    /* renamed from: E */
    public final int f158822E = 101;

    /* renamed from: F */
    public final int f158823F = 102;

    /* renamed from: s */
    public final C13601g f158824s = C36568h.m40985a(new C55792l(this));

    /* renamed from: t */
    public final C13601g f158825t = C36568h.m40985a(new C55797q(this));

    /* renamed from: u */
    public final C13601g f158826u = C36568h.m40985a(new C55783c(this));

    /* renamed from: v */
    public String f158827v;

    /* renamed from: w */
    public final C13601g f158828w = C36568h.m40985a(new C55786f(this));

    /* renamed from: x */
    public final C13601g f158829x = C36568h.m40985a(new C55795o(this));

    /* renamed from: y */
    public final C13601g f158830y = C36568h.m40985a(new C55796p(this));

    /* renamed from: z */
    public final C13601g f158831z = C36568h.m40985a(new C55782b(this));

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$a */
    public static final class C55781a {

        /* renamed from: a */
        public final int f158832a;

        /* renamed from: b */
        public final C50159kp0 f158833b;

        public C55781a(int i, C50159kp0 kp02) {
            C87412m.m108594g(kp02, "request");
            this.f158832a = i;
            this.f158833b = kp02;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C55781a)) {
                return false;
            }
            C55781a aVar = (C55781a) obj;
            return this.f158832a == aVar.f158832a && C87412m.m108589b(this.f158833b, aVar.f158833b);
        }

        public int hashCode() {
            return (this.f158832a * 31) + this.f158833b.hashCode();
        }

        public String toString() {
            return "RelatedRequest(scene=" + this.f158832a + ", request=" + this.f158833b + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$b */
    public static final class C55782b extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ FinderAlbumTimelineUI f158834d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55782b(FinderAlbumTimelineUI finderAlbumTimelineUI) {
            super(0);
            this.f158834d = finderAlbumTimelineUI;
        }

        public Object invoke() {
            return Long.valueOf(this.f158834d.getIntent().getLongExtra("CARD_ID", 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$c */
    public static final class C55783c extends C87413o implements C32224a<C49712hj1> {

        /* renamed from: d */
        public final /* synthetic */ FinderAlbumTimelineUI f158835d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55783c(FinderAlbumTimelineUI finderAlbumTimelineUI) {
            super(0);
            this.f158835d = finderAlbumTimelineUI;
        }

        public Object invoke() {
            return ((C13442s8) C39818r.f106831a.mo62444c(this.f158835d).mo75002a(C13442s8.class)).mo12861q3();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$d */
    public static final class C55784d extends C87413o implements C32224a<FinderAlbumTimelineUI$feedLoader$2$1> {

        /* renamed from: d */
        public final /* synthetic */ FinderAlbumTimelineUI f158836d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55784d(FinderAlbumTimelineUI finderAlbumTimelineUI) {
            super(0);
            this.f158836d = finderAlbumTimelineUI;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
            r0 = r0.f158833b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r10 = this;
                com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI r0 = r10.f158836d
                int r1 = com.tencent.p014mm.plugin.finder.feed.p052ui.FinderAlbumTimelineUI.f158817G
                com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$a r0 = r0.mo77394Y7()
                r1 = 11
                if (r0 == 0) goto L_0x0014
                te3.kp0 r0 = r0.f158833b
                if (r0 == 0) goto L_0x0014
                int r0 = r0.f136943o
                r3 = r0
                goto L_0x0016
            L_0x0014:
                r3 = 11
            L_0x0016:
                com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI r0 = r10.f158836d
                com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$a r0 = r0.mo77394Y7()
                r2 = 0
                if (r0 == 0) goto L_0x0027
                te3.kp0 r0 = r0.f158833b
                if (r0 == 0) goto L_0x0027
                te3.dy1 r0 = r0.f136925A
                r4 = r0
                goto L_0x0028
            L_0x0027:
                r4 = r2
            L_0x0028:
                com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI r0 = r10.f158836d
                com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$a r0 = r0.mo77394Y7()
                if (r0 == 0) goto L_0x0038
                te3.kp0 r0 = r0.f158833b
                if (r0 == 0) goto L_0x0038
                pe3.b r0 = r0.f136936e
                r5 = r0
                goto L_0x0039
            L_0x0038:
                r5 = r2
            L_0x0039:
                com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI r0 = r10.f158836d
                long r6 = r0.mo77392W7()
                te3.db4 r8 = new te3.db4
                r8.<init>()
                te3.op4 r9 = new te3.op4
                r9.<init>()
                r8.f182678f = r9
                te3.qd r9 = new te3.qd
                r9.<init>()
                r8.f182677e = r9
                te3.i93 r9 = new te3.i93
                r9.<init>()
                r8.f182679g = r9
                r8.f182676d = r6
                r6 = 51
                r8.f182686q = r6
                te3.pl1 r0 = r0.mo77395Z7()
                if (r0 == 0) goto L_0x0067
                java.lang.String r2 = r0.f184855v
            L_0x0067:
                r8.f182684o = r2
                zc1.b r0 = zc1.C66785b.f191882e
                java.lang.String r0 = r0.mo90662O5()
                r8.f182681i = r0
                long r6 = eb0.C31543z5.m39453c()
                r8.f182682j = r6
                r8.f182689t = r1
                com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI r0 = r10.f158836d
                te3.hj1 r7 = com.tencent.p014mm.plugin.finder.feed.p052ui.FinderAlbumTimelineUI.m63527V7(r0)
                com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$feedLoader$2$1 r0 = new com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$feedLoader$2$1
                r2 = r0
                r6 = r8
                r2.<init>(r3, r4, r5, r6, r7)
                com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI r1 = r10.f158836d
                te3.pl1 r1 = r1.mo77395Z7()
                if (r1 == 0) goto L_0x0091
                boolean r1 = r1.f184850q
                goto L_0x0092
            L_0x0091:
                r1 = 1
            L_0x0092:
                r0.f13544i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderAlbumTimelineUI.C55784d.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$e */
    public static final class C55785e extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderAlbumTimelineUI f158837d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55785e(FinderAlbumTimelineUI finderAlbumTimelineUI) {
            super(0);
            this.f158837d = finderAlbumTimelineUI;
        }

        public Object invoke() {
            return Integer.valueOf(this.f158837d.getIntent().getIntExtra("FROM_SHARE_SCENE", 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$f */
    public static final class C55786f extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderAlbumTimelineUI f158838d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55786f(FinderAlbumTimelineUI finderAlbumTimelineUI) {
            super(0);
            this.f158838d = finderAlbumTimelineUI;
        }

        public Object invoke() {
            return Integer.valueOf(this.f158838d.getIntent().getIntExtra("GET_REL_SCENE", 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$g */
    public static final class C55787g implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderAlbumTimelineUI f158839d;

        public C55787g(FinderAlbumTimelineUI finderAlbumTimelineUI) {
            this.f158839d = finderAlbumTimelineUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            FinderAlbumTimelineUI finderAlbumTimelineUI = this.f158839d;
            int i = FinderAlbumTimelineUI.f158817G;
            finderAlbumTimelineUI.getClass();
            C77407n nVar = new C77407n((Context) finderAlbumTimelineUI, 0, false);
            nVar.f225771i = new C65688b(finderAlbumTimelineUI);
            nVar.f225782p = new C65691c(finderAlbumTimelineUI);
            nVar.f225761d = new C65693d(finderAlbumTimelineUI);
            nVar.mo107573q();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$h */
    public static final class C55788h implements C13913l {

        /* renamed from: a */
        public final /* synthetic */ FinderAlbumTimelineUI f158840a;

        /* renamed from: b */
        public final /* synthetic */ FinderAlbumTimelineUI$feedLoader$2$1 f158841b;

        public C55788h(FinderAlbumTimelineUI finderAlbumTimelineUI, FinderAlbumTimelineUI$feedLoader$2$1 finderAlbumTimelineUI$feedLoader$2$1) {
            this.f158840a = finderAlbumTimelineUI;
            this.f158841b = finderAlbumTimelineUI$feedLoader$2$1;
        }

        public void call(int i) {
            View view;
            View view2;
            Object obj;
            if (i == 0) {
                view = this.f158840a.findViewById(C0966R.C0970id.cii);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderAlbumTimelineUI$initOnCreate$3$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                obj = aVar.mo10231a(0);
            } else {
                view = this.f158840a.findViewById(C0966R.C0970id.cii);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderAlbumTimelineUI$initOnCreate$3$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                obj = aVar2.mo10231a(0);
            }
            view.setVisibility(((Integer) obj).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderAlbumTimelineUI$initOnCreate$3$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            FinderAlbumTimelineUI finderAlbumTimelineUI = this.f158840a;
            int i2 = FinderAlbumTimelineUI.f158817G;
            RecyclerView.LayoutManager layoutManager = finderAlbumTimelineUI.mo77396a8().getRecyclerView().getLayoutManager();
            if (layoutManager != null) {
                FinderLinearLayoutManager finderLinearLayoutManager = (FinderLinearLayoutManager) layoutManager;
                int initPos = this.f158841b.getInitPos();
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                aVar3.mo10233c(Integer.valueOf(initPos));
                FinderLinearLayoutManager finderLinearLayoutManager2 = finderLinearLayoutManager;
                C117292a.m165358d(finderLinearLayoutManager2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderAlbumTimelineUI$initOnCreate$3$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                finderLinearLayoutManager.mo16973V(((Integer) aVar3.mo10231a(0)).intValue(), ((Integer) aVar3.mo10231a(1)).intValue());
                C117292a.m165359e(finderLinearLayoutManager2, "com/tencent/mm/plugin/finder/feed/ui/FinderAlbumTimelineUI$initOnCreate$3$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$i */
    public static final class C55789i extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderAlbumTimelineUI f158842d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55789i(FinderAlbumTimelineUI finderAlbumTimelineUI) {
            super(1);
            this.f158842d = finderAlbumTimelineUI;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((IResponse) obj, LocaleUtil.ITALIAN);
            FinderAlbumTimelineUI finderAlbumTimelineUI = this.f158842d;
            int i = FinderAlbumTimelineUI.f158817G;
            View loadMoreFooter = finderAlbumTimelineUI.mo77396a8().mo10308D().getLoadMoreFooter();
            View view = null;
            TextView textView = loadMoreFooter != null ? (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t) : null;
            if (textView != null) {
                textView.setVisibility(8);
            }
            View loadMoreFooter2 = this.f158842d.mo77396a8().mo10308D().getLoadMoreFooter();
            if (loadMoreFooter2 != null) {
                view = loadMoreFooter2.findViewById(C0966R.C0970id.g2s);
            }
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderAlbumTimelineUI$initOnCreate$3$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderAlbumTimelineUI$initOnCreate$3$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$j */
    public static final class C55790j extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderAlbumTimelineUI$feedLoader$2$1 f158843d;

        /* renamed from: e */
        public final /* synthetic */ FinderAlbumTimelineUI f158844e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55790j(FinderAlbumTimelineUI$feedLoader$2$1 finderAlbumTimelineUI$feedLoader$2$1, FinderAlbumTimelineUI finderAlbumTimelineUI) {
            super(1);
            this.f158843d = finderAlbumTimelineUI$feedLoader$2$1;
            this.f158844e = finderAlbumTimelineUI;
        }

        public Object invoke(Object obj) {
            View view;
            Object obj2;
            C87412m.m108594g((IResponse) obj, "resp");
            if (this.f158843d.getSize() == 0) {
                view = this.f158844e.findViewById(C0966R.C0970id.cii);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderAlbumTimelineUI$initOnCreate$3$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                obj2 = aVar.mo10231a(0);
            } else {
                view = this.f158844e.findViewById(C0966R.C0970id.cii);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderAlbumTimelineUI$initOnCreate$3$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                obj2 = aVar2.mo10231a(0);
            }
            View view2 = view;
            view2.setVisibility(((Integer) obj2).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderAlbumTimelineUI$initOnCreate$3$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$k */
    public static final class C55791k extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderAlbumTimelineUI$feedLoader$2$1 f158845d;

        /* renamed from: e */
        public final /* synthetic */ FinderAlbumTimelineUI f158846e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55791k(FinderAlbumTimelineUI$feedLoader$2$1 finderAlbumTimelineUI$feedLoader$2$1, FinderAlbumTimelineUI finderAlbumTimelineUI) {
            super(1);
            this.f158845d = finderAlbumTimelineUI$feedLoader$2$1;
            this.f158846e = finderAlbumTimelineUI;
        }

        public Object invoke(Object obj) {
            View view;
            Object obj2;
            C87412m.m108594g((IResponse) obj, "resp");
            if (this.f158845d.getSize() == 0) {
                view = this.f158846e.findViewById(C0966R.C0970id.cii);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderAlbumTimelineUI$initOnCreate$3$4", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                obj2 = aVar.mo10231a(0);
            } else {
                view = this.f158846e.findViewById(C0966R.C0970id.cii);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderAlbumTimelineUI$initOnCreate$3$4", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                obj2 = aVar2.mo10231a(0);
            }
            View view2 = view;
            view2.setVisibility(((Integer) obj2).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderAlbumTimelineUI$initOnCreate$3$4", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$l */
    public static final class C55792l extends C87413o implements C32224a<C9785i2> {

        /* renamed from: d */
        public final /* synthetic */ FinderAlbumTimelineUI f158847d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55792l(FinderAlbumTimelineUI finderAlbumTimelineUI) {
            super(0);
            this.f158847d = finderAlbumTimelineUI;
        }

        public Object invoke() {
            return new C9785i2(this.f158847d, 2, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$m */
    public static final class C55793m extends C87413o implements C32224a<C55781a> {

        /* renamed from: d */
        public final /* synthetic */ FinderAlbumTimelineUI f158848d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55793m(FinderAlbumTimelineUI finderAlbumTimelineUI) {
            super(0);
            this.f158848d = finderAlbumTimelineUI;
        }

        public Object invoke() {
            C50976ql1 ql12;
            C50159kp0 kp02;
            C50976ql1 ql13;
            C50159kp0 kp03;
            FinderAlbumTimelineUI finderAlbumTimelineUI = this.f158848d;
            int i = FinderAlbumTimelineUI.f158817G;
            int X7 = finderAlbumTimelineUI.mo77393X7();
            C89349b bVar = null;
            if (X7 == 10 || X7 == 11) {
                if (this.f158848d.getIntent().hasExtra("STREAM_CARD")) {
                    C64629pl1 Z7 = this.f158848d.mo77395Z7();
                    if (Z7 == null || (ql13 = Z7.f184838D) == null || (kp03 = ql13.f140381f) == null) {
                        return null;
                    }
                    C64629pl1 Z72 = this.f158848d.mo77395Z7();
                    if (Z72 != null) {
                        bVar = Z72.f184846j;
                    }
                    kp03.f136936e = bVar;
                    return new C55781a(1, kp03);
                } else if (!this.f158848d.getIntent().hasExtra("STREAM_TXT_CARD")) {
                    return null;
                } else {
                    C49165dm1 dm12 = new C49165dm1();
                    dm12.parseFrom(this.f158848d.getIntent().getByteArrayExtra("STREAM_TXT_CARD"));
                    LinkedList<C50976ql1> linkedList = dm12.f132419h;
                    if (linkedList == null || (ql12 = linkedList.get(((Number) ((C36570n) this.f158848d.f158830y).getValue()).intValue())) == null || (kp02 = ql12.f140381f) == null) {
                        return null;
                    }
                    return new C55781a(2, kp02);
                }
            } else if (X7 != 14 || !this.f158848d.getIntent().hasExtra("STREAM_CARD_BUFFER")) {
                return null;
            } else {
                C50159kp0 kp04 = new C50159kp0();
                FinderAlbumTimelineUI finderAlbumTimelineUI2 = this.f158848d;
                kp04.f136943o = 14;
                kp04.f136936e = new C89349b(finderAlbumTimelineUI2.getIntent().getByteArrayExtra("STREAM_CARD_BUFFER"));
                C13598b0 b0Var = C13598b0.f38549a;
                return new C55781a(3, kp04);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$n */
    public static final class C55794n extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ FinderAlbumTimelineUI f158849d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55794n(FinderAlbumTimelineUI finderAlbumTimelineUI) {
            super(0);
            this.f158849d = finderAlbumTimelineUI;
        }

        public Object invoke() {
            return this.f158849d.getIntent().getStringExtra("SHARED_USERNAME");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$o */
    public static final class C55795o extends C87413o implements C32224a<C64629pl1> {

        /* renamed from: d */
        public final /* synthetic */ FinderAlbumTimelineUI f158850d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55795o(FinderAlbumTimelineUI finderAlbumTimelineUI) {
            super(0);
            this.f158850d = finderAlbumTimelineUI;
        }

        public Object invoke() {
            byte[] byteArrayExtra = this.f158850d.getIntent().getByteArrayExtra("STREAM_CARD");
            if (byteArrayExtra == null) {
                return null;
            }
            C64629pl1 pl12 = new C64629pl1();
            pl12.parseFrom(byteArrayExtra);
            return pl12;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$p */
    public static final class C55796p extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderAlbumTimelineUI f158851d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55796p(FinderAlbumTimelineUI finderAlbumTimelineUI) {
            super(0);
            this.f158851d = finderAlbumTimelineUI;
        }

        public Object invoke() {
            return Integer.valueOf(this.f158851d.getIntent().getIntExtra("STREAM_TXT_CARD_INDEX", 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$q */
    public static final class C55797q extends C87413o implements C32224a<C9805j2> {

        /* renamed from: d */
        public final /* synthetic */ FinderAlbumTimelineUI f158852d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55797q(FinderAlbumTimelineUI finderAlbumTimelineUI) {
            super(0);
            this.f158852d = finderAlbumTimelineUI;
        }

        public Object invoke() {
            FinderAlbumTimelineUI finderAlbumTimelineUI = this.f158852d;
            int i = FinderAlbumTimelineUI.f158817G;
            this.f158852d.getClass();
            return new C9805j2(finderAlbumTimelineUI, (C9785i2) ((C36570n) finderAlbumTimelineUI.f158824s).getValue(), 2, 51);
        }
    }

    /* renamed from: V7 */
    public static final C49712hj1 m63527V7(FinderAlbumTimelineUI finderAlbumTimelineUI) {
        return (C49712hj1) ((C36570n) finderAlbumTimelineUI.f158826u).getValue();
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 51;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 2;
    }

    /* renamed from: O7 */
    public BaseFinderFeedLoader mo2938O7() {
        return (FinderAlbumTimelineUI$feedLoader$2$1) ((C36570n) this.f158821D).getValue();
    }

    /* renamed from: P7 */
    public FinderLoaderFeedUIContract$Presenter mo2939P7() {
        return (C9785i2) ((C36570n) this.f158824s).getValue();
    }

    /* renamed from: R7 */
    public C9854m5 mo2940R7() {
        return mo77396a8();
    }

    /* renamed from: S7 */
    public void mo2941S7() {
        Class cls = C58417y0.class;
        String stringExtra = getIntent().getStringExtra("TITLE_WORDING");
        String str = "";
        if (stringExtra == null) {
            stringExtra = str;
        }
        this.f158827v = stringExtra;
        setMMTitle(stringExtra);
        C37521f.f99374d.getClass();
        boolean z = false;
        boolean z2 = true;
        if (C37521f.f99439k3.mo60266n().intValue() == 1) {
            addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C55787g(this));
        }
        C64629pl1 Z7 = mo77395Z7();
        if (Z7 != null) {
            C65834e eVar = C65834e.f189316a;
            LinkedList<FinderObject> linkedList = Z7.f184844h;
            C87412m.m108593f(linkedList, "it.`object`");
            eVar.mo89867a(51, linkedList);
            LinkedList<FinderObject> linkedList2 = Z7.f184844h;
            C87412m.m108593f(linkedList2, "it.`object`");
            for (FinderObject finderObject : linkedList2) {
                C87412m.m108593f(finderObject, LocaleUtil.ITALIAN);
                ((C58417y0) C86312j.m106911c(cls)).j80(finderObject, 51);
            }
        }
        C55781a Y7 = mo77394Y7();
        if (Y7 != null && Y7.f158832a == 3) {
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
            int intValue = ((Number) ((C36570n) this.f158818A).getValue()).intValue();
            String str2 = (String) ((C36570n) this.f158819B).getValue();
            C87412m.m108591d(str2);
            long W7 = mo77392W7();
            y0Var.getClass();
            FinderEnterSharedCardStruct finderEnterSharedCardStruct = new FinderEnterSharedCardStruct();
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            if (Wb != null) {
                str = Wb;
            }
            finderEnterSharedCardStruct.f155182d = finderEnterSharedCardStruct.mo86045b("SessionId", str, true);
            finderEnterSharedCardStruct.f155183e = (long) intValue;
            finderEnterSharedCardStruct.f155184f = 5;
            finderEnterSharedCardStruct.f155185g = finderEnterSharedCardStruct.mo86045b("SourceUsr", str2, true);
            finderEnterSharedCardStruct.f155195q = finderEnterSharedCardStruct.mo86045b("ColumnId", C61926c.m72691p(W7), true);
            finderEnterSharedCardStruct.mo86054n();
            y0Var.Ec0(finderEnterSharedCardStruct);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[initOnCreate] relatedRequest=");
        C55781a Y72 = mo77394Y7();
        C89349b bVar = null;
        sb.append(Y72 != null ? Integer.valueOf(Y72.f158832a) : null);
        sb.append(" getRelatedScene=");
        sb.append(mo77393X7());
        sb.append(" title=");
        String str3 = this.f158827v;
        if (str3 != null) {
            sb.append(str3);
            sb.append(" streamCardId=");
            C64629pl1 Z72 = mo77395Z7();
            sb.append(C61926c.m72691p(Z72 != null ? Z72.f184854u : 0));
            sb.append(" cardId=");
            sb.append(C61926c.m72691p(mo77392W7()));
            sb.append(" continueAtTheEnd=");
            C64629pl1 Z73 = mo77395Z7();
            sb.append(Z73 != null ? Boolean.valueOf(Z73.f184850q) : null);
            sb.append(" streamCard cardBuffer=");
            C64629pl1 Z74 = mo77395Z7();
            if (Z74 != null) {
                bVar = Z74.f184846j;
            }
            sb.append(bVar != null);
            Log.m105924i("Finder.AlbumTimelineUI", sb.toString());
            FinderAlbumTimelineUI$feedLoader$2$1 finderAlbumTimelineUI$feedLoader$2$1 = (FinderAlbumTimelineUI$feedLoader$2$1) ((C36570n) this.f158821D).getValue();
            finderAlbumTimelineUI$feedLoader$2$1.initFromCache(getIntent());
            finderAlbumTimelineUI$feedLoader$2$1.setInitDone(new C55788h(this, finderAlbumTimelineUI$feedLoader$2$1));
            finderAlbumTimelineUI$feedLoader$2$1.f13552t = new C55789i(this);
            finderAlbumTimelineUI$feedLoader$2$1.f13553u = new C55790j(finderAlbumTimelineUI$feedLoader$2$1, this);
            finderAlbumTimelineUI$feedLoader$2$1.f13554v = new C55791k(finderAlbumTimelineUI$feedLoader$2$1, this);
            C55781a Y73 = mo77394Y7();
            if (Y73 != null && Y73.f158832a == 3) {
                z = true;
            }
            if (z) {
                ((FinderAlbumTimelineUI$feedLoader$2$1) ((C36570n) this.f158821D).getValue()).requestRefresh();
            }
            FinderAlbumTimelineUI$feedLoader$2$1 finderAlbumTimelineUI$feedLoader$2$12 = (FinderAlbumTimelineUI$feedLoader$2$1) ((C36570n) this.f158821D).getValue();
            C64629pl1 Z75 = mo77395Z7();
            if (Z75 != null) {
                z2 = Z75.f184850q;
            }
            finderAlbumTimelineUI$feedLoader$2$12.f13544i = z2;
            return;
        }
        C87412m.m108603p(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        throw null;
    }

    /* renamed from: W7 */
    public final long mo77392W7() {
        return ((Number) ((C36570n) this.f158831z).getValue()).longValue();
    }

    /* renamed from: X7 */
    public final int mo77393X7() {
        return ((Number) ((C36570n) this.f158828w).getValue()).intValue();
    }

    /* renamed from: Y7 */
    public final C55781a mo77394Y7() {
        return (C55781a) ((C36570n) this.f158820C).getValue();
    }

    /* renamed from: Z7 */
    public final C64629pl1 mo77395Z7() {
        return (C64629pl1) ((C36570n) this.f158829x).getValue();
    }

    /* renamed from: a8 */
    public final C9805j2 mo77396a8() {
        return (C9805j2) ((C36570n) this.f158825t).getValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ab_;
    }
}
