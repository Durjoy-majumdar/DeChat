package com.tencent.p014mm.plugin.finder.feed.p052ui;

import ak1.C0075i;
import ak1.C54067f0;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C0324s;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FinderProfileChangeFeedEvent;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.FinderTopicTimelineUIContract$Loader;
import com.tencent.p014mm.plugin.finder.feed.FinderTopicTimelineUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.feed.model.C2819w0;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C24560g0;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import ht1.C8784m2;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import kf1.C10019vb;
import kf1.C9629ac;
import kf1.C9854m5;
import kotlin.Metadata;
import op3.C117877b;
import op3.C117882j;
import pe3.C89349b;
import rs1.C63575n3;
import rx3.C13598b0;
import t91.C64208c;
import te3.C50141kk1;
import te3.C64311db1;
import tf1.C13913l;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderTopicTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/FinderTopicTimelineUIContract$Loader;", "Lkf1/vb;", "Lcom/tencent/mm/plugin/finder/feed/FinderTopicTimelineUIContract$Presenter;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI */
public final class FinderTopicTimelineUI extends FinderLoaderFeedUI<FinderTopicTimelineUIContract$Loader, C10019vb, FinderTopicTimelineUIContract$Presenter> {

    /* renamed from: A */
    public C89349b f14902A;

    /* renamed from: B */
    public final int f14903B = 9;

    /* renamed from: C */
    public final int f14904C = 2;

    /* renamed from: D */
    public C50141kk1 f14905D;

    /* renamed from: E */
    public FinderProfileChangeFeedEvent f14906E;

    /* renamed from: F */
    public String f14907F;

    /* renamed from: G */
    public boolean f14908G;

    /* renamed from: H */
    public boolean f14909H;

    /* renamed from: I */
    public final C3085c f14910I = new C3085c(this);

    /* renamed from: s */
    public final String f14911s = "Finder.FinderTopicTimelineUI";

    /* renamed from: t */
    public FinderTopicTimelineUIContract$Presenter f14912t;

    /* renamed from: u */
    public C10019vb f14913u;

    /* renamed from: v */
    public FinderTopicTimelineUIContract$Loader f14914v;

    /* renamed from: w */
    public String f14915w = "";

    /* renamed from: x */
    public int f14916x;

    /* renamed from: y */
    public long f14917y;

    /* renamed from: z */
    public C64311db1 f14918z;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI$a */
    public static final class C3083a implements C13913l {

        /* renamed from: a */
        public final /* synthetic */ FinderTopicTimelineUI f14919a;

        /* renamed from: b */
        public final /* synthetic */ FinderTopicTimelineUIContract$Loader f14920b;

        public C3083a(FinderTopicTimelineUI finderTopicTimelineUI, FinderTopicTimelineUIContract$Loader finderTopicTimelineUIContract$Loader) {
            this.f14919a = finderTopicTimelineUI;
            this.f14920b = finderTopicTimelineUIContract$Loader;
        }

        public void call(int i) {
            C10019vb vbVar = this.f14919a.f14913u;
            if (vbVar != null) {
                RecyclerView.LayoutManager layoutManager = vbVar.getRecyclerView().getLayoutManager();
                if (layoutManager != null) {
                    FinderLinearLayoutManager finderLinearLayoutManager = (FinderLinearLayoutManager) layoutManager;
                    int initPos = this.f14920b.getInitPos();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    aVar.mo10233c(Integer.valueOf(initPos));
                    C117292a.m165358d(finderLinearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderTopicTimelineUI$initOnCreate$3$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    finderLinearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                    C117292a.m165359e(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/feed/ui/FinderTopicTimelineUI$initOnCreate$3$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                }
                C2819w0 cache = this.f14920b.getCache();
                C2780c cVar = cache != null ? cache.f14082d : null;
                if (cVar instanceof C9629ac) {
                    FinderTopicTimelineUIContract$Loader finderTopicTimelineUIContract$Loader = this.f14919a.f14914v;
                    if (finderTopicTimelineUIContract$Loader != null) {
                        finderTopicTimelineUIContract$Loader.f13441s = ((C9629ac) cVar).f29949a;
                    } else {
                        C87412m.m108603p("feedLoader");
                        throw null;
                    }
                }
                C63575n3 n3Var = (C63575n3) C39818r.f106831a.mo62444c(this.f14919a).mo75002a(C63575n3.class);
                C10019vb vbVar2 = this.f14919a.f14913u;
                if (vbVar2 != null) {
                    n3Var.mo88422e3(vbVar2.getRecyclerView());
                    if (this.f14919a.f14908G && this.f14920b.getCache() != null) {
                        C10019vb vbVar3 = this.f14919a.f14913u;
                        if (vbVar3 != null) {
                            vbVar3.mo10484I0();
                            C10019vb vbVar4 = this.f14919a.f14913u;
                            if (vbVar4 != null) {
                                RefreshLoadMoreLayout.m66896C(vbVar4.mo10308D(), (RefreshLoadMoreLayout.C7080c) null, 1, (Object) null);
                            } else {
                                C87412m.m108603p("viewCallback");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("viewCallback");
                            throw null;
                        }
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
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI$b */
    public static final class C3084b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderTopicTimelineUI f14921d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3084b(FinderTopicTimelineUI finderTopicTimelineUI) {
            super(0);
            this.f14921d = finderTopicTimelineUI;
        }

        public Object invoke() {
            TextView textView;
            TextView textView2;
            C10019vb vbVar = this.f14921d.f14913u;
            if (vbVar != null) {
                View loadMoreFooter = vbVar.mo10308D().getLoadMoreFooter();
                if (!(loadMoreFooter == null || (textView2 = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                    textView2.setText(C0966R.string.eat);
                }
                C10019vb vbVar2 = this.f14921d.f14913u;
                if (vbVar2 != null) {
                    View loadMoreFooter2 = vbVar2.mo10308D().getLoadMoreFooter();
                    if (!(loadMoreFooter2 == null || (textView = (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t)) == null)) {
                        textView.setTextColor(this.f14921d.getResources().getColor(C0966R.color.FG_2));
                    }
                    C10019vb vbVar3 = this.f14921d.f14913u;
                    if (vbVar3 != null) {
                        View loadMoreFooter3 = vbVar3.mo10308D().getLoadMoreFooter();
                        TextView textView3 = loadMoreFooter3 != null ? (TextView) loadMoreFooter3.findViewById(C0966R.C0970id.g2t) : null;
                        if (textView3 != null) {
                            textView3.setVisibility(8);
                        }
                        C10019vb vbVar4 = this.f14921d.f14913u;
                        if (vbVar4 != null) {
                            RefreshLoadMoreLayout.m66896C(vbVar4.mo10308D(), (RefreshLoadMoreLayout.C7080c) null, 1, (Object) null);
                            C10019vb vbVar5 = this.f14921d.f14913u;
                            if (vbVar5 != null) {
                                vbVar5.mo10308D().mo55513p(C3110r.f14972d);
                                return C13598b0.f38549a;
                            }
                            C87412m.m108603p("viewCallback");
                            throw null;
                        }
                        C87412m.m108603p("viewCallback");
                        throw null;
                    }
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
                C87412m.m108603p("viewCallback");
                throw null;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI$c */
    public static final class C3085c extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ FinderTopicTimelineUI f14922d;

        public C3085c(FinderTopicTimelineUI finderTopicTimelineUI) {
            this.f14922d = finderTopicTimelineUI;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderTopicTimelineUI$onHellScrollerListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderTopicTimelineUI$onHellScrollerListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            String str;
            RecyclerView recyclerView2 = recyclerView;
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView2);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderTopicTimelineUI$onHellScrollerListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView2, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            int i3 = this.f14922d.f14916x;
            C54067f0.C54078q qVar = C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD;
            C64208c.C64209a aVar = C64208c.f181951a;
            C64208c.f181962l = true;
            if (2 == i3) {
                C64208c.f181962l = true;
            } else if (1 == i3) {
                qVar = C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD_LIVING_AVATAR;
                C64208c.f181962l = false;
                str = "9";
                C117877b c = C117882j.m166284c(qVar, str);
                C7335d c2 = C86312j.m106911c(C8777j5.class);
                C87412m.m108593f(c2, "getService(IHellLiveReport::class.java)");
                Object a = c.mo182596a(0);
                C87412m.m108593f(a, "tuple2.`$1`()");
                Object a2 = c.mo182596a(1);
                C87412m.m108593f(a2, "tuple2.`$2`()");
                C8777j5.C8778a.m8602c((C8777j5) c2, recyclerView, (C54067f0.C54078q) a, (String) a2, C0075i.EVENT_ON_SCROLL, 0, 0, 0, 112, (Object) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderTopicTimelineUI$onHellScrollerListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            }
            str = "27";
            C117877b c3 = C117882j.m166284c(qVar, str);
            C7335d c25 = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c25, "getService(IHellLiveReport::class.java)");
            Object a3 = c3.mo182596a(0);
            C87412m.m108593f(a3, "tuple2.`$1`()");
            Object a25 = c3.mo182596a(1);
            C87412m.m108593f(a25, "tuple2.`$2`()");
            C8777j5.C8778a.m8602c((C8777j5) c25, recyclerView, (C54067f0.C54078q) a3, (String) a25, C0075i.EVENT_ON_SCROLL, 0, 0, 0, 112, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderTopicTimelineUI$onHellScrollerListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        int intExtra = getIntent().getIntExtra("key_topic_type", 1);
        if (intExtra == 1) {
            return 9;
        }
        if (intExtra == 7) {
            return 60;
        }
        if (intExtra == 4) {
            return 52;
        }
        if (intExtra == 5) {
            return 64;
        }
        if (intExtra != 15) {
            return intExtra != 16 ? 27 : 172;
        }
        return 139;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 2;
    }

    /* renamed from: O7 */
    public BaseFinderFeedLoader mo2938O7() {
        FinderTopicTimelineUIContract$Loader finderTopicTimelineUIContract$Loader = this.f14914v;
        if (finderTopicTimelineUIContract$Loader != null) {
            return finderTopicTimelineUIContract$Loader;
        }
        C87412m.m108603p("feedLoader");
        throw null;
    }

    /* renamed from: P7 */
    public FinderLoaderFeedUIContract$Presenter mo2939P7() {
        FinderTopicTimelineUIContract$Presenter finderTopicTimelineUIContract$Presenter = this.f14912t;
        if (finderTopicTimelineUIContract$Presenter != null) {
            return finderTopicTimelineUIContract$Presenter;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: R7 */
    public C9854m5 mo2940R7() {
        C10019vb vbVar = this.f14913u;
        if (vbVar != null) {
            return vbVar;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0261  */
    /* renamed from: S7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2941S7() {
        /*
            r26 = this;
            r1 = r26
            o31.a r2 = o31.C76986a.Finder
            java.lang.Class<rs1.l7> r3 = rs1.C13317l7.class
            o31.b r4 = o31.C11345b.FinderTopicTimelineUI
            java.lang.Class<l31.e> r5 = l31.C61212e.class
            di3.d r0 = di3.C86312j.m106911c(r5)
            l31.e r0 = (l31.C61212e) r0
            r0.mo86178qr(r1, r4)
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r6 = "key_topic_type"
            r7 = 1
            int r0 = r0.getIntExtra(r6, r7)
            r1.f14916x = r0
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r6 = "key_topic_title"
            java.lang.String r0 = r0.getStringExtra(r6)
            java.lang.String r6 = ""
            if (r0 != 0) goto L_0x002f
            r0 = r6
        L_0x002f:
            r1.f14915w = r0
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r8 = "KEY_TOPIC_ID"
            r9 = 0
            long r11 = r0.getLongExtra(r8, r9)
            r1.f14917y = r11
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r8 = "KEY_FOLLOW_ID"
            java.lang.String r0 = r0.getStringExtra(r8)
            r1.f14907F = r0
            int r0 = r1.f14916x
            r8 = 16
            r11 = 0
            if (r0 != r8) goto L_0x0054
            r0 = 1
            goto L_0x0055
        L_0x0054:
            r0 = 0
        L_0x0055:
            r1.f14908G = r0
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r8 = "key_ref_object_id"
            long r12 = r0.getLongExtra(r8, r9)
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r8 = "KEY_HOT_TOPIC_BUFFER"
            byte[] r0 = r0.getByteArrayExtra(r8)
            if (r0 == 0) goto L_0x0075
            pe3.b r8 = new pe3.b
            int r14 = r0.length
            r8.<init>(r0, r11, r14)
            r1.f14902A = r8
        L_0x0075:
            te3.db1 r0 = new te3.db1
            r0.<init>()
            r1.f14918z = r0
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r8 = "KEY_FINDER_LOCATION"
            byte[] r0 = r0.getByteArrayExtra(r8)
            java.lang.String r8 = "location"
            r14 = 0
            if (r0 == 0) goto L_0x0097
            te3.db1 r15 = r1.f14918z
            if (r15 == 0) goto L_0x0093
            r15.parseFrom(r0)
            goto L_0x0097
        L_0x0093:
            gy3.C87412m.m108603p(r8)
            throw r14
        L_0x0097:
            te3.kk1 r0 = new te3.kk1
            r0.<init>()
            android.content.Intent r15 = r26.getIntent()
            java.lang.String r14 = "KEY_SECTION_INFO"
            byte[] r14 = r15.getByteArrayExtra(r14)
            if (r14 != 0) goto L_0x00a9
            goto L_0x00b9
        L_0x00a9:
            r0.parseFrom(r14)     // Catch:{ Exception -> 0x00ad }
            goto L_0x00ba
        L_0x00ad:
            r0 = move-exception
            r14 = r0
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r11] = r14
            java.lang.String r14 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r14, r6, r0)
        L_0x00b9:
            r0 = 0
        L_0x00ba:
            r1.f14905D = r0
            java.lang.String r0 = r1.f14911s
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r14 = "type:"
            r6.append(r14)
            int r14 = r1.f14916x
            r6.append(r14)
            java.lang.String r14 = ", topic:"
            r6.append(r14)
            java.lang.String r14 = r1.f14915w
            r6.append(r14)
            r14 = 44
            r6.append(r14)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Presenter r0 = new com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Presenter
            int r6 = r1.f14904C
            int r14 = r1.f14916x
            r0.<init>(r1, r6, r14)
            r1.f14912t = r0
            kf1.vb r6 = new kf1.vb
            int r14 = r1.f14904C
            int r15 = r1.f14903B
            r6.<init>(r1, r0, r14, r15)
            r1.f14913u = r6
            com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Loader r0 = new com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Loader
            int r6 = r1.f14916x
            java.lang.String r14 = r1.f14915w
            r16 = r8
            long r7 = r1.f14917y
            te3.db1 r15 = r1.f14918z
            if (r15 == 0) goto L_0x0261
            tf1.i r22 = tf1.C13908i.FEED_TOPIC_TIMELINE
            te3.kk1 r11 = r1.f14905D
            bl3.r r9 = bl3.C39818r.f106831a
            bl3.r$a r10 = r9.mo62444c(r1)
            r25 = r4
            java.lang.Class<rs1.s8> r4 = rs1.C13442s8.class
            androidx.lifecycle.i0 r4 = r10.mo75002a(r4)
            rs1.s8 r4 = (rs1.C13442s8) r4
            te3.hj1 r24 = r4.mo12861q3()
            r16 = r0
            r17 = r6
            r18 = r14
            r19 = r7
            r21 = r15
            r23 = r11
            r16.<init>(r17, r18, r19, r21, r22, r23, r24)
            android.content.Intent r4 = r26.getIntent()
            r0.initFromCache(r4)
            java.lang.String r4 = r1.f14907F
            r0.f13442t = r4
            com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI$a r4 = new com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI$a
            r4.<init>(r1, r0)
            r0.setInitDone(r4)
            r0.f13440r = r12
            com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI$b r4 = new com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI$b
            r4.<init>(r1)
            r0.f13439q = r4
            int r4 = r0.f13429d
            r6 = 7
            if (r4 != r6) goto L_0x016c
            android.content.Intent r4 = r26.getIntent()
            java.lang.String r7 = "key_activity_id"
            r10 = 0
            long r7 = r4.getLongExtra(r7, r10)
            r0.f13434i = r7
            android.content.Intent r4 = r26.getIntent()
            java.lang.String r7 = "key_activity_inner_tab_type"
            r8 = 1
            int r4 = r4.getIntExtra(r7, r8)
            r0.f13436n = r4
            goto L_0x0179
        L_0x016c:
            android.content.Intent r4 = r26.getIntent()
            java.lang.String r7 = "KEY_INNER_TAB_TYPE"
            r8 = 0
            int r4 = r4.getIntExtra(r7, r8)
            r0.f13436n = r4
        L_0x0179:
            pe3.b r4 = r1.f14902A
            r0.f13437o = r4
            r1.f14914v = r0
            kf1.vb r0 = r1.f14913u
            if (r0 == 0) goto L_0x0259
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI$c r4 = r1.f14910I
            r0.mo17043c(r4)
            int r0 = r1.f14916x
            if (r0 != r6) goto L_0x01a6
            long r6 = r1.f14917y
            bl3.r$a r0 = r9.mo62443b(r1)
            androidx.lifecycle.i0 r0 = r0.mo75002a(r3)
            rs1.l7 r0 = (rs1.C13317l7) r0
            java.lang.String r3 = o40.C61926c.m72691p(r6)
            java.lang.String r4 = "activityid"
            r0.mo12758c3(r4, r3)
            goto L_0x01d3
        L_0x01a6:
            long r6 = r1.f14917y
            java.lang.String r0 = r1.f14915w
            java.lang.String r4 = "topicName"
            gy3.C87412m.m108594g(r0, r4)
            bl3.r$a r4 = r9.mo62443b(r1)
            androidx.lifecycle.i0 r3 = r4.mo75002a(r3)
            rs1.l7 r3 = (rs1.C13317l7) r3
            java.lang.String r4 = o40.C61926c.m72691p(r12)
            java.lang.String r8 = "feedid"
            r3.mo12758c3(r8, r4)
            java.lang.String r4 = o40.C61926c.m72691p(r6)
            java.lang.String r6 = "topicid"
            r3.mo12758c3(r6, r4)
            java.lang.String r4 = "topicname"
            r3.mo12758c3(r4, r0)
        L_0x01d3:
            boolean r0 = r1.f14908G
            if (r0 == 0) goto L_0x020a
            rx3.g r0 = r1.f14619q
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r3 = r1.f14915w
            r0.setText(r3)
            rx3.g r0 = r1.f14619q
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3 = 0
            r0.setVisibility(r3)
            r0 = 2131301630(0x7f0914fe, float:1.8221323E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 != 0) goto L_0x0200
            goto L_0x020a
        L_0x0200:
            r3 = 2131826222(0x7f11162e, float:1.9285322E38)
            java.lang.String r3 = r1.getString(r3)
            r0.setText(r3)
        L_0x020a:
            boolean r0 = r1.f14908G
            if (r0 == 0) goto L_0x0249
            di3.d r0 = di3.C86312j.m106911c(r5)
            l31.e r0 = (l31.C61212e) r0
            o31.b r3 = o31.C11345b.CollectionFeedUI
            r0.mo86178qr(r1, r3)
            di3.d r0 = di3.C86312j.m106911c(r5)
            l31.e r0 = (l31.C61212e) r0
            r0.mo86179qs(r1, r2)
            di3.d r0 = di3.C86312j.m106911c(r5)
            l31.e r0 = (l31.C61212e) r0
            java.lang.String r2 = "CollectionFeedUI"
            r0.mo86136FZ(r1, r2)
            di3.d r0 = di3.C86312j.m106911c(r5)
            l31.e r0 = (l31.C61212e) r0
            r2 = 12
            r3 = 27010(0x6982, float:3.7849E-41)
            r0.mo86148No(r1, r2, r3)
            di3.d r0 = di3.C86312j.m106911c(r5)
            l31.e r0 = (l31.C61212e) r0
            vf1.t5 r2 = new vf1.t5
            r2.<init>(r1)
            r0.E60(r1, r2)
            goto L_0x0258
        L_0x0249:
            di3.d r0 = di3.C86312j.m106911c(r5)
            l31.e r0 = (l31.C61212e) r0
            r3 = r25
            l31.e r0 = r0.mo86178qr(r1, r3)
            r0.mo86179qs(r1, r2)
        L_0x0258:
            return
        L_0x0259:
            java.lang.String r0 = "viewCallback"
            gy3.C87412m.m108603p(r0)
            r2 = 0
            throw r2
        L_0x0261:
            r2 = 0
            gy3.C87412m.m108603p(r16)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTopicTimelineUI.mo2941S7():void");
    }

    /* renamed from: T7 */
    public boolean mo2950T7() {
        return true;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aqw;
    }

    public void onCreate(Bundle bundle) {
        overridePendingTransition(C0966R.C0968anim.f2503er, C0966R.C0968anim.f2498em);
        super.onCreate(bundle);
    }

    public void onDestroy() {
        C10019vb vbVar = this.f14913u;
        if (vbVar != null) {
            vbVar.getRecyclerView().mo17098m1(this.f14910I);
            super.onDestroy();
            return;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPause() {
        /*
            r17 = this;
            r0 = r17
            super.onPause()
            int r1 = r0.f14916x
            ak1.f0$q r2 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD
            t91.c$a r3 = t91.C64208c.f181951a
            r3 = 1
            t91.C64208c.f181962l = r3
            r4 = 2
            r5 = 0
            if (r4 != r1) goto L_0x0015
            t91.C64208c.f181962l = r3
            goto L_0x001e
        L_0x0015:
            if (r3 != r1) goto L_0x001e
            ak1.f0$q r2 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD_LIVING_AVATAR
            t91.C64208c.f181962l = r5
            java.lang.String r1 = "9"
            goto L_0x0020
        L_0x001e:
            java.lang.String r1 = "27"
        L_0x0020:
            op3.b r1 = op3.C117882j.m166284c(r2, r1)
            java.lang.Class<ht1.j5> r2 = ht1.C8777j5.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            java.lang.String r4 = "getService(IHellLiveReport::class.java)"
            gy3.C87412m.m108593f(r2, r4)
            r6 = r2
            ht1.j5 r6 = (ht1.C8777j5) r6
            kf1.vb r2 = r0.f14913u
            if (r2 == 0) goto L_0x0062
            androidx.recyclerview.widget.RecyclerView r7 = r2.getRecyclerView()
            java.lang.Object r2 = r1.mo182596a(r5)
            java.lang.String r4 = "tuple2.`$1`()"
            gy3.C87412m.m108593f(r2, r4)
            r8 = r2
            ak1.f0$q r8 = (ak1.C54067f0.C54078q) r8
            java.lang.Object r1 = r1.mo182596a(r3)
            java.lang.String r2 = "tuple2.`$2`()"
            gy3.C87412m.m108593f(r1, r2)
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            ak1.i r10 = ak1.C0075i.EVENT_ON_PAUSE
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 112(0x70, float:1.57E-43)
            r16 = 0
            ht1.C8777j5.C8778a.m8602c(r6, r7, r8, r9, r10, r11, r12, r14, r15, r16)
            return
        L_0x0062:
            java.lang.String r1 = "viewCallback"
            gy3.C87412m.m108603p(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTopicTimelineUI.onPause():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r17 = this;
            r0 = r17
            super.onResume()
            int r1 = r0.f14916x
            ak1.f0$q r2 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD
            t91.c$a r3 = t91.C64208c.f181951a
            r3 = 1
            t91.C64208c.f181962l = r3
            r4 = 2
            r5 = 0
            if (r4 != r1) goto L_0x0015
            t91.C64208c.f181962l = r3
            goto L_0x001e
        L_0x0015:
            if (r3 != r1) goto L_0x001e
            ak1.f0$q r2 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD_LIVING_AVATAR
            t91.C64208c.f181962l = r5
            java.lang.String r1 = "9"
            goto L_0x0020
        L_0x001e:
            java.lang.String r1 = "27"
        L_0x0020:
            op3.b r1 = op3.C117882j.m166284c(r2, r1)
            java.lang.Class<ht1.j5> r2 = ht1.C8777j5.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            java.lang.String r4 = "getService(IHellLiveReport::class.java)"
            gy3.C87412m.m108593f(r2, r4)
            r6 = r2
            ht1.j5 r6 = (ht1.C8777j5) r6
            kf1.vb r2 = r0.f14913u
            if (r2 == 0) goto L_0x0062
            androidx.recyclerview.widget.RecyclerView r7 = r2.getRecyclerView()
            java.lang.Object r2 = r1.mo182596a(r5)
            java.lang.String r4 = "tuple2.`$1`()"
            gy3.C87412m.m108593f(r2, r4)
            r8 = r2
            ak1.f0$q r8 = (ak1.C54067f0.C54078q) r8
            java.lang.Object r1 = r1.mo182596a(r3)
            java.lang.String r2 = "tuple2.`$2`()"
            gy3.C87412m.m108593f(r1, r2)
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            ak1.i r10 = ak1.C0075i.EVENT_ON_RESUME
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 112(0x70, float:1.57E-43)
            r16 = 0
            ht1.C8777j5.C8778a.m8602c(r6, r7, r8, r9, r10, r11, r12, r14, r15, r16)
            return
        L_0x0062:
            java.lang.String r1 = "viewCallback"
            gy3.C87412m.m108603p(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTopicTimelineUI.onResume():void");
    }

    public void onStop() {
        super.onStop();
        if (this.f14908G && this.f14909H) {
            FinderProfileChangeFeedEvent finderProfileChangeFeedEvent = this.f14906E;
            if (finderProfileChangeFeedEvent != null) {
                finderProfileChangeFeedEvent.publish();
            }
            this.f14906E = null;
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        if (getIntent().getBooleanExtra("key_enable_ringtone_bubble", false)) {
            hashSet.add(C0324s.m265a(C24560g0.m30725a(C8784m2.class)));
        }
    }
}
