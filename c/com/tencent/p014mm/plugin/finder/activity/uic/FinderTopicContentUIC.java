package com.tencent.p014mm.plugin.finder.activity.uic;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import bl3.C54492n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FeedStickyEvent;
import com.tencent.p014mm.plugin.finder.activity.base.uic.FinderBaseContentUIC;
import com.tencent.p014mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter;
import com.tencent.p014mm.plugin.finder.feed.model.FinderTopicFeedLoader;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import kf1.C9965rb;
import kotlin.Metadata;
import te3.C49712hj1;
import te3.C52271zj0;

/* renamed from: com.tencent.mm.plugin.finder.activity.uic.FinderTopicContentUIC */
public abstract class FinderTopicContentUIC extends FinderBaseContentUIC {

    /* renamed from: p */
    public FinderTopicFeedUIContract$TopicFeedPresenter f12524p;

    /* renamed from: q */
    public C9965rb f12525q;

    /* renamed from: r */
    public FinderTopicFeedLoader f12526r;

    /* renamed from: s */
    public TextView f12527s;

    /* renamed from: t */
    public FrameLayout f12528t;

    /* renamed from: u */
    public ProgressBar f12529u;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/activity/uic/FinderTopicContentUIC$FinderHottestFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.activity.uic.FinderTopicContentUIC$FinderHottestFeedLoader */
    public final class FinderHottestFeedLoader extends FinderTopicFeedLoader {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FinderHottestFeedLoader(FinderTopicContentUIC finderTopicContentUIC, int i, String str, C49712hj1 hj12, String str2) {
            super(i, str, hj12, str2);
            C87412m.m108594g(str, "topicContent");
        }

        public boolean interceptPostStart() {
            return true;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/activity/uic/FinderTopicContentUIC$FinderNewestLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.activity.uic.FinderTopicContentUIC$FinderNewestLoader */
    public final class FinderNewestLoader extends FinderTopicFeedLoader {

        /* renamed from: A */
        public final /* synthetic */ FinderTopicContentUIC f12530A;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FinderNewestLoader(FinderTopicContentUIC finderTopicContentUIC, int i, String str, C49712hj1 hj12, String str2) {
            super(i, str, hj12, str2);
            C87412m.m108594g(str, "topicContent");
            this.f12530A = finderTopicContentUIC;
        }

        public void onPostStart(long j) {
            super.onPostStart(j);
            FinderTabUIC.m65393a4(this.f12530A.mo318f3(), this.f12530A.mo2199e3(), false, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderTopicContentUIC(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    /* renamed from: k3 */
    public void mo521k3(FeedStickyEvent feedStickyEvent) {
        if (feedStickyEvent != null && feedStickyEvent.f9169d.f9172c == 1001 && this.f12457d == 1) {
            FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter = this.f12524p;
            if (finderTopicFeedUIContract$TopicFeedPresenter != null) {
                finderTopicFeedUIContract$TopicFeedPresenter.requestRefresh();
            } else {
                C87412m.m108603p("presenter");
                throw null;
            }
        }
    }

    /* renamed from: l3 */
    public void mo522l3() {
        TextView textView = this.f12527s;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    /* renamed from: m3 */
    public void mo523m3(C52271zj0 zj02) {
        setCoveredStyle();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0112, code lost:
        r0 = r0.getView();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r6 = r18
            super.onCreate(r19)
            java.lang.Class<rs1.s8> r7 = rs1.C13442s8.class
            bl3.r r8 = bl3.C39818r.f106831a
            androidx.fragment.app.Fragment r0 = r18.getFragment()
            gy3.C87412m.m108591d(r0)
            bl3.r$a r0 = r8.mo62445d(r0)
            androidx.lifecycle.i0 r0 = r0.mo75002a(r7)
            rs1.s8 r0 = (rs1.C13442s8) r0
            te3.hj1 r4 = r0.mo12861q3()
            boolean r0 = r18.mo2200j3()
            r9 = 0
            java.lang.String r11 = "key_feed_ref_id"
            if (r0 == 0) goto L_0x005e
            com.tencent.mm.plugin.finder.activity.uic.FinderTopicContentUIC$FinderNewestLoader r12 = new com.tencent.mm.plugin.finder.activity.uic.FinderTopicContentUIC$FinderNewestLoader
            int r0 = r6.f12457d
            int r2 = r6.mo316c3(r0)
            java.lang.String r3 = r6.f12458e
            java.lang.String r5 = r6.f12459f
            r0 = r12
            r1 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            android.content.Intent r0 = r18.getIntent()
            r12.initFromCache(r0)
            long r0 = r6.f12460g
            r12.f13905r = r0
            java.lang.String r0 = r6.f12461h
            r12.f13906s = r0
            int r0 = r6.f12457d
            r12.f13907t = r0
            android.content.Intent r0 = r18.getIntent()
            long r0 = r0.getLongExtra(r11, r9)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r12.f13900j = r0
            r6.f12526r = r12
            goto L_0x0093
        L_0x005e:
            com.tencent.mm.plugin.finder.activity.uic.FinderTopicContentUIC$FinderHottestFeedLoader r12 = new com.tencent.mm.plugin.finder.activity.uic.FinderTopicContentUIC$FinderHottestFeedLoader
            int r0 = r6.f12457d
            int r2 = r6.mo316c3(r0)
            java.lang.String r3 = r6.f12458e
            java.lang.String r5 = r6.f12459f
            r0 = r12
            r1 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            android.content.Intent r0 = r18.getIntent()
            r12.initFromCache(r0)
            long r0 = r6.f12460g
            r12.f13905r = r0
            java.lang.String r0 = r6.f12461h
            r12.f13906s = r0
            int r0 = r6.f12457d
            r12.f13907t = r0
            android.content.Intent r0 = r18.getIntent()
            long r0 = r0.getLongExtra(r11, r9)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r12.f13900j = r0
            r6.f12526r = r12
        L_0x0093:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "feedLoader : "
            r0.append(r1)
            com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader r1 = r6.f12526r
            java.lang.String r2 = "feedLoader"
            r3 = 0
            if (r1 == 0) goto L_0x021b
            r0.append(r1)
            java.lang.String r1 = " this.innerTabType : "
            r0.append(r1)
            com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader r1 = r6.f12526r
            if (r1 == 0) goto L_0x0217
            int r1 = r1.f13907t
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SimpleUIComponent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            int r0 = r18.mo320i3()
            int r12 = r18.mo317d3()
            com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter r1 = new com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter
            androidx.appcompat.app.AppCompatActivity r4 = r18.getActivity()
            java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r4, r5)
            com.tencent.mm.ui.MMActivity r4 = (com.tencent.p014mm.p136ui.MMActivity) r4
            com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader r9 = r6.f12526r
            if (r9 == 0) goto L_0x0213
            r2 = 2
            r1.<init>(r4, r2, r12, r9)
            java.lang.String r2 = r6.f12458e
            java.lang.String r4 = "<set-?>"
            gy3.C87412m.m108594g(r2, r4)
            r1.f13398n = r2
            r1.f13396i = r0
            r6.f12524p = r1
            int r1 = r6.f12457d
            kf1.rb r2 = new kf1.rb
            androidx.appcompat.app.AppCompatActivity r9 = r18.getActivity()
            gy3.C87412m.m108592e(r9, r5)
            r10 = r9
            com.tencent.mm.ui.MMActivity r10 = (com.tencent.p014mm.p136ui.MMActivity) r10
            boolean r14 = r6 instanceof ud1.C14174s
            r15 = 0
            r16 = 40
            r17 = 0
            r11 = 2
            r13 = 0
            r9 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r5 = r6.f12458e
            gy3.C87412m.m108594g(r5, r4)
            r2.f30629E = r5
            r2.f30627C = r0
            androidx.fragment.app.Fragment r0 = r18.getFragment()
            if (r0 == 0) goto L_0x0122
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L_0x0122
            r4 = 2131312597(0x7f093fd5, float:1.8243567E38)
            android.view.View r0 = r0.findViewById(r4)
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = (com.tencent.p014mm.view.RefreshLoadMoreLayout) r0
            goto L_0x0123
        L_0x0122:
            r0 = r3
        L_0x0123:
            if (r0 != 0) goto L_0x0137
            rx3.g r0 = r6.f12463j
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            ye1.c r0 = (ye1.C15968c) r0
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r0.f42865a
            java.lang.String r4 = "uiBinding.rlLayout"
            gy3.C87412m.m108593f(r0, r4)
        L_0x0137:
            r2.f30220j = r0
            r4 = 1
            r0.setSuperNestedScroll(r4)
            android.content.Intent r0 = r18.getIntent()
            r4 = 0
            java.lang.String r5 = "key_has_cover"
            boolean r0 = r0.getBooleanExtra(r5, r4)
            if (r0 == 0) goto L_0x0152
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r2.f30220j
            r4 = 2131101688(0x7f0607f8, float:1.7815793E38)
            r0.setBackgroundResource(r4)
        L_0x0152:
            r2.f30633I = r1
            androidx.fragment.app.Fragment r0 = r18.getFragment()
            r1 = 2131301640(0x7f091508, float:1.8221344E38)
            if (r0 == 0) goto L_0x0168
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L_0x0168
            android.view.View r0 = r0.findViewById(r1)
            goto L_0x0169
        L_0x0168:
            r0 = r3
        L_0x0169:
            r2.f30636L = r0
            r6.f12525q = r2
            androidx.fragment.app.Fragment r0 = r18.getFragment()
            java.lang.String r2 = "viewCallback"
            if (r0 == 0) goto L_0x01b9
            kf1.rb r4 = r6.f12525q
            if (r4 == 0) goto L_0x01b5
            bl3.r$a r5 = r8.mo62445d(r0)
            androidx.lifecycle.i0 r5 = r5.mo75002a(r7)
            java.lang.String r7 = "UICProvider.of(fragment)…rReporterUIC::class.java)"
            gy3.C87412m.m108593f(r5, r7)
            rs1.s8 r5 = (rs1.C13442s8) r5
            rs1.s8$a r7 = rs1.C13442s8.f38060Q0
            r7 = -1
            ef1.f r5 = r5.mo12854j3(r7)
            if (r5 == 0) goto L_0x019b
            com.tencent.mm.view.RefreshLoadMoreLayout r7 = r4.f30220j
            androidx.recyclerview.widget.RecyclerView r7 = r7.getRecyclerView()
            r5.mo83455c(r7)
        L_0x019b:
            r4.f30634J = r0
            long r4 = r6.f12460g
            bl3.r$a r0 = r8.mo62445d(r0)
            java.lang.Class<rs1.l7> r7 = rs1.C13317l7.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r7)
            rs1.l7 r0 = (rs1.C13317l7) r0
            java.lang.String r4 = o40.C61926c.m72691p(r4)
            java.lang.String r5 = "activityid"
            r0.mo12758c3(r5, r4)
            goto L_0x01b9
        L_0x01b5:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x01b9:
            kf1.rb r0 = r6.f12525q
            if (r0 == 0) goto L_0x020f
            com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter r4 = r6.f12524p
            java.lang.String r5 = "presenter"
            if (r4 == 0) goto L_0x020b
            r0.f30222o = r4
            if (r4 == 0) goto L_0x0207
            if (r0 == 0) goto L_0x0203
            r4.mo2525t(r0)
            androidx.appcompat.app.AppCompatActivity r0 = r18.getActivity()
            r2 = 2131312452(0x7f093f44, float:1.8243273E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.f12527s = r0
            androidx.appcompat.app.AppCompatActivity r0 = r18.getActivity()
            android.view.View r0 = r0.findViewById(r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r6.f12528t = r0
            androidx.appcompat.app.AppCompatActivity r0 = r18.getActivity()
            r1 = 2131296608(0x7f090160, float:1.8211137E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r6.f12529u = r0
            android.widget.TextView r0 = r6.f12527s
            if (r0 == 0) goto L_0x0202
            ce1.h0 r1 = new ce1.h0
            r1.<init>(r6)
            r0.setOnClickListener(r1)
        L_0x0202:
            return
        L_0x0203:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x0207:
            gy3.C87412m.m108603p(r5)
            throw r3
        L_0x020b:
            gy3.C87412m.m108603p(r5)
            throw r3
        L_0x020f:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x0213:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x0217:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x021b:
            gy3.C87412m.m108603p(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.activity.uic.FinderTopicContentUIC.onCreate(android.os.Bundle):void");
    }

    public void onPause() {
        super.onPause();
        int n3 = mo318f3().mo80060n3();
        int i = this.f12457d;
        Integer num = null;
        if (i - 1 == n3) {
            FinderTopicFeedLoader finderTopicFeedLoader = this.f12526r;
            if (finderTopicFeedLoader != null) {
                finderTopicFeedLoader.f13908u = i;
            } else {
                C87412m.m108603p("feedLoader");
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("onPause check visible activeIndex :");
        sb.append(n3);
        sb.append(" empty View :");
        C9965rb rbVar = this.f12525q;
        if (rbVar != null) {
            View m0 = rbVar.mo9299m0();
            if (m0 != null) {
                num = Integer.valueOf(m0.getVisibility());
            }
            sb.append(num);
            Log.m105924i(C54492n.TAG, sb.toString());
            return;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    public void onPreDestroyed() {
        super.onPreDestroyed();
        FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter = this.f12524p;
        if (finderTopicFeedUIContract$TopicFeedPresenter != null) {
            finderTopicFeedUIContract$TopicFeedPresenter.onDetach();
        } else {
            C87412m.m108603p("presenter");
            throw null;
        }
    }

    public void onResume() {
        super.onResume();
        Log.m105924i(C54492n.TAG, "onResume");
        FinderTopicFeedLoader finderTopicFeedLoader = this.f12526r;
        if (finderTopicFeedLoader != null) {
            finderTopicFeedLoader.f13908u = -1;
        } else {
            C87412m.m108603p("feedLoader");
            throw null;
        }
    }

    public void setCoveredStyle() {
        String str;
        C52271zj0 zj02 = this.f12462i;
        if (zj02 == null || (str = zj02.f146010i) == null) {
            str = "";
        }
        if (!Util.isNullOrNil(str)) {
            C9965rb rbVar = this.f12525q;
            if (rbVar != null) {
                TextView textView = (TextView) rbVar.f30220j.findViewById(C0966R.C0970id.g2t);
                if (textView != null) {
                    textView.setTextColor(getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_3));
                }
                C9965rb rbVar2 = this.f12525q;
                if (rbVar2 != null) {
                    View findViewById = rbVar2.f30220j.findViewById(C0966R.C0970id.fms);
                    if (findViewById != null) {
                        findViewById.setBackgroundColor(getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_1));
                    }
                    C9965rb rbVar3 = this.f12525q;
                    if (rbVar3 != null) {
                        View findViewById2 = rbVar3.f30220j.findViewById(C0966R.C0970id.itl);
                        if (findViewById2 != null) {
                            findViewById2.setBackgroundColor(getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_1));
                        }
                        C9965rb rbVar4 = this.f12525q;
                        if (rbVar4 != null) {
                            View findViewById3 = rbVar4.f30220j.findViewById(C0966R.C0970id.aym);
                            if (findViewById3 != null) {
                                findViewById3.setBackgroundResource(C0966R.C0969drawable.f5113x8);
                            }
                            C9965rb rbVar5 = this.f12525q;
                            if (rbVar5 != null) {
                                TextView textView2 = (TextView) rbVar5.f30220j.findViewById(C0966R.C0970id.cj7);
                                if (textView2 != null) {
                                    textView2.setTextColor(getContext().getResources().getColor(C0966R.color.f3585yj));
                                }
                                C9965rb rbVar6 = this.f12525q;
                                if (rbVar6 != null) {
                                    TextView textView3 = (TextView) rbVar6.f30220j.findViewById(C0966R.C0970id.is_);
                                    if (textView3 != null) {
                                        textView3.setTextColor(getContext().getResources().getColor(C0966R.color.f3585yj));
                                        return;
                                    }
                                    return;
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
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }
}
