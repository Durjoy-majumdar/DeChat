package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.FinderFriendLikeLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import di3.C86312j;
import dp1.C58417y0;
import eb0.C75592q0;
import er1.C58784w3;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kf1.C10061z2;
import kf1.C9621a3;
import kf1.C9854m5;
import kj2.C117407d;
import kotlin.Metadata;
import p629ny.C76979h;
import qo3.C77407n;
import rs1.C13442s8;
import rs1.C63575n3;
import rx3.C13598b0;
import te3.C49712hj1;
import tf1.C13913l;
import vf1.C14840w;
import vf1.C14843x;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderFriendLikeLoader;", "Lkf1/a3;", "Lkf1/z2;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeTimelineUI */
public final class FinderFriendLikeTimelineUI extends FinderLoaderFeedUI<FinderFriendLikeLoader, C9621a3, C10061z2> {

    /* renamed from: z */
    public static final /* synthetic */ int f14346z = 0;

    /* renamed from: s */
    public C10061z2 f14347s;

    /* renamed from: t */
    public C9621a3 f14348t;

    /* renamed from: u */
    public FinderFriendLikeLoader f14349u;

    /* renamed from: v */
    public final int f14350v = 2;

    /* renamed from: w */
    public String f14351w = "";

    /* renamed from: x */
    public String f14352x = "";

    /* renamed from: y */
    public int f14353y = 79;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeTimelineUI$a */
    public static final class C2910a implements C13913l {

        /* renamed from: a */
        public final /* synthetic */ FinderFriendLikeTimelineUI f14354a;

        /* renamed from: b */
        public final /* synthetic */ FinderFriendLikeLoader f14355b;

        public C2910a(FinderFriendLikeTimelineUI finderFriendLikeTimelineUI, FinderFriendLikeLoader finderFriendLikeLoader) {
            this.f14354a = finderFriendLikeTimelineUI;
            this.f14355b = finderFriendLikeLoader;
        }

        public void call(int i) {
            View findViewById;
            C9621a3 a3Var = this.f14354a.f14348t;
            if (a3Var != null) {
                RecyclerView.LayoutManager layoutManager = a3Var.getRecyclerView().getLayoutManager();
                if (layoutManager != null) {
                    FinderLinearLayoutManager finderLinearLayoutManager = (FinderLinearLayoutManager) layoutManager;
                    int initPos = this.f14355b.getInitPos();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    aVar.mo10233c(Integer.valueOf(initPos));
                    C117292a.m165358d(finderLinearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeTimelineUI$initOnCreate$2$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    finderLinearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                    C117292a.m165359e(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeTimelineUI$initOnCreate$2$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                }
                if (i > 0 && (findViewById = this.f14354a.findViewById(C0966R.C0970id.g3e)) != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view = findViewById;
                    C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeTimelineUI$initOnCreate$2$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeTimelineUI$initOnCreate$2$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C63575n3 n3Var = (C63575n3) C39818r.f106831a.mo62444c(this.f14354a).mo75002a(C63575n3.class);
                C9621a3 a3Var2 = this.f14354a.f14348t;
                if (a3Var2 != null) {
                    n3Var.mo88422e3(a3Var2.getRecyclerView());
                } else {
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
            } else {
                C87412m.m108603p("viewCallback");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeTimelineUI$b */
    public static final class C2911b extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderFriendLikeTimelineUI f14356d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2911b(FinderFriendLikeTimelineUI finderFriendLikeTimelineUI) {
            super(1);
            this.f14356d = finderFriendLikeTimelineUI;
        }

        public Object invoke(Object obj) {
            View findViewById;
            View findViewById2;
            IResponse iResponse = (IResponse) obj;
            C87412m.m108594g(iResponse, LocaleUtil.ITALIAN);
            View findViewById3 = this.f14356d.findViewById(C0966R.C0970id.g3e);
            if (findViewById3 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(findViewById3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeTimelineUI$initOnCreate$2$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById3, "com/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeTimelineUI$initOnCreate$2$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            List incrementList = iResponse.getIncrementList();
            boolean z = true;
            if (incrementList == null || !incrementList.isEmpty()) {
                z = false;
            }
            if (z) {
                C9621a3 a3Var = this.f14356d.f14348t;
                if (a3Var != null) {
                    a3Var.mo10308D().setVisibility(8);
                    C9621a3 a3Var2 = this.f14356d.f14348t;
                    if (a3Var2 != null) {
                        View x = a3Var2.mo5184x();
                        if (x != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(0);
                            C117292a.m165358d(x, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeTimelineUI$initOnCreate$2$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            x.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(x, "com/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeTimelineUI$initOnCreate$2$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        C9621a3 a3Var3 = this.f14356d.f14348t;
                        if (a3Var3 != null) {
                            View x2 = a3Var3.mo5184x();
                            if (!(x2 == null || (findViewById2 = x2.findViewById(C0966R.C0970id.cio)) == null)) {
                                findViewById2.setOnClickListener(new C3103b(this.f14356d));
                            }
                            C9621a3 a3Var4 = this.f14356d.f14348t;
                            if (a3Var4 != null) {
                                View x3 = a3Var4.mo5184x();
                                if (!(x3 == null || (findViewById = x3.findViewById(C0966R.C0970id.cin)) == null)) {
                                    findViewById.setOnClickListener(new C3104c(this.f14356d));
                                }
                            } else {
                                C87412m.m108603p("viewCallback");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("viewCallback");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("viewCallback");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeTimelineUI$c */
    public static final class C2912c extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderFriendLikeTimelineUI f14357d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2912c(FinderFriendLikeTimelineUI finderFriendLikeTimelineUI) {
            super(1);
            this.f14357d = finderFriendLikeTimelineUI;
        }

        /* JADX WARNING: Removed duplicated region for block: B:74:0x0239  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0243  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                com.tencent.mm.plugin.finder.feed.model.internal.IResponse r1 = (com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse) r1
                java.lang.String r2 = "it"
                gy3.C87412m.m108594g(r1, r2)
                com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeTimelineUI r2 = r0.f14357d
                kf1.a3 r2 = r2.f14348t
                java.lang.String r3 = "viewCallback"
                if (r2 == 0) goto L_0x0261
                com.tencent.mm.view.RefreshLoadMoreLayout r2 = r2.mo10308D()
                android.view.View r2 = r2.getLoadMoreFooter()
                r5 = 2131308010(0x7f092dea, float:1.8234263E38)
                if (r2 == 0) goto L_0x002f
                android.view.View r2 = r2.findViewById(r5)
                android.widget.TextView r2 = (android.widget.TextView) r2
                if (r2 == 0) goto L_0x002f
                r6 = 2131829092(0x7f112164, float:1.9291143E38)
                r2.setText(r6)
            L_0x002f:
                com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeTimelineUI r2 = r0.f14357d
                kf1.a3 r2 = r2.f14348t
                if (r2 == 0) goto L_0x025c
                com.tencent.mm.view.RefreshLoadMoreLayout r2 = r2.mo10308D()
                android.view.View r2 = r2.getLoadMoreFooter()
                if (r2 == 0) goto L_0x0057
                android.view.View r2 = r2.findViewById(r5)
                android.widget.TextView r2 = (android.widget.TextView) r2
                if (r2 == 0) goto L_0x0057
                com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeTimelineUI r6 = r0.f14357d
                android.content.res.Resources r6 = r6.getResources()
                r7 = 2131099806(0x7f06009e, float:1.7811976E38)
                int r6 = r6.getColor(r7)
                r2.setTextColor(r6)
            L_0x0057:
                com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeTimelineUI r2 = r0.f14357d
                kf1.a3 r2 = r2.f14348t
                if (r2 == 0) goto L_0x0257
                com.tencent.mm.view.RefreshLoadMoreLayout r2 = r2.mo10308D()
                android.view.View r2 = r2.getLoadMoreFooter()
                if (r2 == 0) goto L_0x006e
                android.view.View r2 = r2.findViewById(r5)
                android.widget.TextView r2 = (android.widget.TextView) r2
                goto L_0x006f
            L_0x006e:
                r2 = 0
            L_0x006f:
                r5 = 8
                if (r2 != 0) goto L_0x0074
                goto L_0x0077
            L_0x0074:
                r2.setVisibility(r5)
            L_0x0077:
                com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeTimelineUI r2 = r0.f14357d
                kf1.a3 r2 = r2.f14348t
                if (r2 == 0) goto L_0x0252
                com.tencent.mm.view.RefreshLoadMoreLayout r2 = r2.mo10308D()
                android.view.View r2 = r2.getLoadMoreFooter()
                r6 = 2131308008(0x7f092de8, float:1.823426E38)
                if (r2 == 0) goto L_0x008f
                android.view.View r2 = r2.findViewById(r6)
                goto L_0x0090
            L_0x008f:
                r2 = 0
            L_0x0090:
                r15 = 0
                if (r2 != 0) goto L_0x0094
                goto L_0x00d7
            L_0x0094:
                k20.a r14 = new k20.a
                r14.<init>()
                java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
                java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
                r14.mo10233c(r7)
                java.lang.Object[] r8 = r14.mo10232b()
                java.lang.String r9 = "com/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeTimelineUI$initOnCreate$2$3"
                java.lang.String r10 = "invoke"
                java.lang.String r11 = "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r16 = "(I)V"
                r7 = r2
                r6 = r14
                r14 = r16
                j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                java.lang.Object r6 = r6.mo10231a(r15)
                java.lang.Integer r6 = (java.lang.Integer) r6
                int r6 = r6.intValue()
                r2.setVisibility(r6)
                java.lang.String r8 = "com/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeTimelineUI$initOnCreate$2$3"
                java.lang.String r9 = "invoke"
                java.lang.String r10 = "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            L_0x00d7:
                com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeTimelineUI r2 = r0.f14357d
                kf1.a3 r2 = r2.f14348t
                if (r2 == 0) goto L_0x024d
                com.tencent.mm.view.RefreshLoadMoreLayout r2 = r2.mo10308D()
                android.view.View r2 = r2.getLoadMoreFooter()
                r6 = 2131306870(0x7f092976, float:1.8231951E38)
                if (r2 == 0) goto L_0x00ef
                android.view.View r2 = r2.findViewById(r6)
                goto L_0x00f0
            L_0x00ef:
                r2 = 0
            L_0x00f0:
                if (r2 != 0) goto L_0x00f3
                goto L_0x0135
            L_0x00f3:
                k20.a r14 = new k20.a
                r14.<init>()
                java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r14.mo10233c(r5)
                java.lang.Object[] r8 = r14.mo10232b()
                java.lang.String r9 = "com/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeTimelineUI$initOnCreate$2$3"
                java.lang.String r10 = "invoke"
                java.lang.String r11 = "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r5 = "(I)V"
                r7 = r2
                r4 = r14
                r14 = r5
                j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                java.lang.Object r4 = r4.mo10231a(r15)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r2.setVisibility(r4)
                java.lang.String r8 = "com/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeTimelineUI$initOnCreate$2$3"
                java.lang.String r9 = "invoke"
                java.lang.String r10 = "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            L_0x0135:
                java.util.List r2 = r1.getIncrementList()
                if (r2 == 0) goto L_0x01d7
                java.util.List r1 = r1.getIncrementList()
                if (r1 == 0) goto L_0x014a
                int r1 = r1.size()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                goto L_0x014b
            L_0x014a:
                r1 = 0
            L_0x014b:
                gy3.C87412m.m108591d(r1)
                int r1 = r1.intValue()
                if (r1 <= 0) goto L_0x01d7
                com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeTimelineUI r1 = r0.f14357d
                kf1.a3 r1 = r1.f14348t
                if (r1 == 0) goto L_0x01d2
                com.tencent.mm.view.RefreshLoadMoreLayout r1 = r1.mo10308D()
                android.view.View r1 = r1.getLoadMoreFooter()
                if (r1 == 0) goto L_0x01d0
                android.view.View r1 = r1.findViewById(r6)
                if (r1 == 0) goto L_0x01d0
                com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeTimelineUI r2 = r0.f14357d
                k20.a r4 = new k20.a
                r4.<init>()
                java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
                java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
                r4.mo10233c(r5)
                java.lang.Object[] r8 = r4.mo10232b()
                java.lang.String r9 = "com/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeTimelineUI$initOnCreate$2$3"
                java.lang.String r10 = "invoke"
                java.lang.String r11 = "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                r7 = r1
                j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                java.lang.Object r4 = r4.mo10231a(r15)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r1.setVisibility(r4)
                java.lang.String r8 = "com/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeTimelineUI$initOnCreate$2$3"
                java.lang.String r9 = "invoke"
                java.lang.String r10 = "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
                com.tencent.mm.plugin.finder.feed.ui.d r4 = new com.tencent.mm.plugin.finder.feed.ui.d
                r4.<init>(r2)
                zp3.C23564m.m28138h(r1, r4)
                kf1.a3 r1 = r2.f14348t
                if (r1 == 0) goto L_0x01cb
                com.tencent.mm.view.RefreshLoadMoreLayout r1 = r1.mo10308D()
                android.view.View r1 = r1.getLoadMoreFooter()
                if (r1 == 0) goto L_0x0233
                com.tencent.mm.plugin.finder.feed.ui.e r4 = new com.tencent.mm.plugin.finder.feed.ui.e
                r4.<init>(r2)
                r1.setOnClickListener(r4)
                goto L_0x0233
            L_0x01cb:
                gy3.C87412m.m108603p(r3)
                r1 = 0
                throw r1
            L_0x01d0:
                r1 = 0
                goto L_0x0233
            L_0x01d2:
                r1 = 0
                gy3.C87412m.m108603p(r3)
                throw r1
            L_0x01d7:
                com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeTimelineUI r1 = r0.f14357d
                kf1.a3 r1 = r1.f14348t
                if (r1 == 0) goto L_0x0248
                com.tencent.mm.view.RefreshLoadMoreLayout r1 = r1.mo10308D()
                android.view.View r1 = r1.getLoadMoreFooter()
                if (r1 == 0) goto L_0x01ef
                r2 = 2131308008(0x7f092de8, float:1.823426E38)
                android.view.View r1 = r1.findViewById(r2)
                goto L_0x01f0
            L_0x01ef:
                r1 = 0
            L_0x01f0:
                if (r1 != 0) goto L_0x01f3
                goto L_0x0233
            L_0x01f3:
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
                java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
                r2.mo10233c(r4)
                java.lang.Object[] r5 = r2.mo10232b()
                java.lang.String r6 = "com/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeTimelineUI$initOnCreate$2$3"
                java.lang.String r7 = "invoke"
                java.lang.String r8 = "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V"
                java.lang.String r9 = "android/view/View_EXEC_"
                java.lang.String r10 = "setVisibility"
                java.lang.String r11 = "(I)V"
                r4 = r1
                j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
                java.lang.Object r2 = r2.mo10231a(r15)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r5 = "com/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeTimelineUI$initOnCreate$2$3"
                java.lang.String r6 = "invoke"
                java.lang.String r7 = "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V"
                java.lang.String r8 = "android/view/View_EXEC_"
                java.lang.String r9 = "setVisibility"
                java.lang.String r10 = "(I)V"
                j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            L_0x0233:
                com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeTimelineUI r1 = r0.f14357d
                kf1.a3 r1 = r1.f14348t
                if (r1 == 0) goto L_0x0243
                com.tencent.mm.view.RefreshLoadMoreLayout r1 = r1.mo10308D()
                r1.setHasBottomMore(r15)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            L_0x0243:
                gy3.C87412m.m108603p(r3)
                r1 = 0
                throw r1
            L_0x0248:
                r1 = 0
                gy3.C87412m.m108603p(r3)
                throw r1
            L_0x024d:
                r1 = 0
                gy3.C87412m.m108603p(r3)
                throw r1
            L_0x0252:
                r1 = 0
                gy3.C87412m.m108603p(r3)
                throw r1
            L_0x0257:
                r1 = 0
                gy3.C87412m.m108603p(r3)
                throw r1
            L_0x025c:
                r1 = 0
                gy3.C87412m.m108603p(r3)
                throw r1
            L_0x0261:
                r1 = 0
                gy3.C87412m.m108603p(r3)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderFriendLikeTimelineUI.C2912c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeTimelineUI$d */
    public static final class C2913d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderFriendLikeTimelineUI f14358d;

        public C2913d(FinderFriendLikeTimelineUI finderFriendLikeTimelineUI) {
            this.f14358d = finderFriendLikeTimelineUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            FinderFriendLikeTimelineUI finderFriendLikeTimelineUI = this.f14358d;
            int i = FinderFriendLikeTimelineUI.f14346z;
            finderFriendLikeTimelineUI.getClass();
            C77407n nVar = new C77407n((Context) finderFriendLikeTimelineUI, 1, false);
            nVar.f225771i = C14840w.f40839d;
            nVar.f225782p = new C14843x(finderFriendLikeTimelineUI);
            nVar.mo107573q();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeTimelineUI$e */
    public static final class C2914e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderFriendLikeTimelineUI f14359d;

        public C2914e(FinderFriendLikeTimelineUI finderFriendLikeTimelineUI) {
            this.f14359d = finderFriendLikeTimelineUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeTimelineUI$initOnCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderFriendLikeTimelineUI finderFriendLikeTimelineUI = this.f14359d;
            int i = FinderFriendLikeTimelineUI.f14346z;
            finderFriendLikeTimelineUI.getClass();
            C77407n nVar = new C77407n((Context) finderFriendLikeTimelineUI, 1, false);
            nVar.f225771i = C14840w.f40839d;
            nVar.f225782p = new C14843x(finderFriendLikeTimelineUI);
            nVar.mo107573q();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeTimelineUI$initOnCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: V7 */
    public static final void m2783V7(FinderFriendLikeTimelineUI finderFriendLikeTimelineUI) {
        finderFriendLikeTimelineUI.getClass();
        Class cls = C60200t1.class;
        C115669n.INSTANCE.mo160131h(22010, finderFriendLikeTimelineUI.f14351w, 2);
        C117407d.INSTANCE.idkeyStat(1279, 0, 1, false);
        Intent intent = new Intent();
        String e7 = ((C60200t1) C86312j.m106911c(cls)).mo76842e7(14, 10, 18, intent);
        intent.putExtra("KEY_FINDER_POST_FINISH_JUMP_FRIEND_TAB", true);
        AppCompatActivity context = finderFriendLikeTimelineUI.getContext();
        C87412m.m108593f(context, "context");
        ((C60200t1) C86312j.m106911c(cls)).Hm0(context, intent);
        ((C58417y0) C86312j.m106911c(C58417y0.class)).N40(e7, "Enter");
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return this.f14353y;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 2;
    }

    /* renamed from: O7 */
    public BaseFinderFeedLoader mo2938O7() {
        FinderFriendLikeLoader finderFriendLikeLoader = this.f14349u;
        if (finderFriendLikeLoader != null) {
            return finderFriendLikeLoader;
        }
        C87412m.m108603p("feedLoader");
        throw null;
    }

    /* renamed from: P7 */
    public FinderLoaderFeedUIContract$Presenter mo2939P7() {
        C10061z2 z2Var = this.f14347s;
        if (z2Var != null) {
            return z2Var;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: R7 */
    public C9854m5 mo2940R7() {
        C9621a3 a3Var = this.f14348t;
        if (a3Var != null) {
            return a3Var;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: S7 */
    public void mo2941S7() {
        String stringExtra = getIntent().getStringExtra("KEY_USERNAME");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f14351w = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("KEY_NICKNAME");
        String str = stringExtra2 == null ? "" : stringExtra2;
        this.f14352x = str;
        this.f14352x = C58784w3.m68433S(C58784w3.f168295a, this.f14351w, str, false, 4, (Object) null);
        setMMTitle((CharSequence) ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(getContext(), getContext().getString(C0966R.string.lob, new Object[]{this.f14352x})));
        C10061z2 z2Var = new C10061z2(this, this.f14350v);
        this.f14347s = z2Var;
        this.f14348t = new C9621a3(this, z2Var, this.f14350v, this.f14353y);
        String str2 = this.f14351w;
        C49712hj1 q3 = ((C13442s8) C39818r.f106831a.mo62444c(this).mo75002a(C13442s8.class)).mo12861q3();
        q3.f134675i = this.f14353y;
        C13598b0 b0Var = C13598b0.f38549a;
        FinderFriendLikeLoader finderFriendLikeLoader = new FinderFriendLikeLoader(str2, q3);
        finderFriendLikeLoader.initFromCache(getIntent());
        finderFriendLikeLoader.setInitDone(new C2910a(this, finderFriendLikeLoader));
        finderFriendLikeLoader.f13616f = new C2911b(this);
        finderFriendLikeLoader.f13615e = new C2912c(this);
        TextView textView = (TextView) findViewById(C0966R.C0970id.jxo);
        if (textView != null) {
            textView.setText(getString(C0966R.string.lo_));
        }
        this.f14349u = finderFriendLikeLoader;
        if (C87412m.m108589b(this.f14351w, C75592q0.m90789s())) {
            addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C2913d(this));
            View findViewById = findViewById(C0966R.C0970id.gz9);
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeTimelineUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeTimelineUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById2 = findViewById(C0966R.C0970id.gz9);
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(new C2914e(this));
            }
        }
    }

    /* renamed from: T7 */
    public boolean mo2950T7() {
        return true;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359692ac0;
    }

    public void onCreate(Bundle bundle) {
        this.f14353y = getIntent().getIntExtra("KEY_COMMENT_SCENE", 79);
        super.onCreate(bundle);
    }
}
