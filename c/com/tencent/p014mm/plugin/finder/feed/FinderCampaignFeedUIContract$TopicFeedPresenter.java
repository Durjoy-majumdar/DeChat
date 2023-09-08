package com.tencent.p014mm.plugin.finder.feed;

import a14.C53934p0;
import android.view.View;
import bl3.C0317e;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.autogen.events.ActivityFeedRemoveEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.activity.uic.FinderActivityTabUIC;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.event.IListener;
import er1.C58784w3;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9500j;
import kf1.C9864n;
import kf1.C9897o;
import kf1.C9914ob;
import on1.C11548q;
import on1.C11567u;
import on1.C11570v;
import rx3.C13598b0;
import te3.C51270sn1;
import ve1.C14590p;
import ve1.C14599p3;
import wx3.C15601d;
import wx3.C66212f;
import zp3.C23564m;

/* renamed from: com.tencent.mm.plugin.finder.feed.FinderCampaignFeedUIContract$TopicFeedPresenter */
public final class FinderCampaignFeedUIContract$TopicFeedPresenter extends C9864n<C0740i2> {

    /* renamed from: h */
    public int f13016h;

    /* renamed from: i */
    public String f13017i = "";

    /* renamed from: j */
    public final C9914ob f13018j;

    /* renamed from: n */
    public IListener<ActivityFeedRemoveEvent> f13019n;

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderCampaignFeedUIContract$TopicFeedPresenter$a */
    public static final class C2496a extends C87413o implements C32226l<Integer, C60896i<?>> {

        /* renamed from: d */
        public final /* synthetic */ FinderCampaignFeedUIContract$TopicFeedPresenter f13020d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2496a(FinderCampaignFeedUIContract$TopicFeedPresenter finderCampaignFeedUIContract$TopicFeedPresenter) {
            super(1);
            this.f13020d = finderCampaignFeedUIContract$TopicFeedPresenter;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            if (intValue == -6) {
                return new C14599p3(new C2631a(this.f13020d));
            }
            C58784w3.f168295a.mo83916b("Finder.FinderCampaginFeedUIContract.TopicFeedPresenter", intValue);
            return new C14590p();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderCampaignFeedUIContract$TopicFeedPresenter$b */
    public static final class C2497b extends C87413o implements C32228q<C60905o, BaseFinderFeed, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderCampaignFeedUIContract$TopicFeedPresenter f13021d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2497b(FinderCampaignFeedUIContract$TopicFeedPresenter finderCampaignFeedUIContract$TopicFeedPresenter) {
            super(3);
            this.f13021d = finderCampaignFeedUIContract$TopicFeedPresenter;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C60905o oVar = (C60905o) obj;
            int intValue = ((Number) obj3).intValue();
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g((BaseFinderFeed) obj2, "item");
            View view = oVar.f44854d;
            C87412m.m108593f(view, "holder.itemView");
            C23564m.m28138h(view, new C2633b(this.f13021d, intValue));
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderCampaignFeedUIContract$TopicFeedPresenter(MMActivity mMActivity, int i, int i2, C11548q<C0740i2> qVar) {
        super(mMActivity, i, i2, qVar);
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(qVar, "loader");
        C9914ob obVar = new C9914ob((C51270sn1) null, 1, (C8480h) null);
        obVar.f30538a = (C51270sn1) ((FinderActivityTabUIC) C39818r.f106831a.mo62444c(mMActivity).mo75002a(FinderActivityTabUIC.class)).f33558t;
        this.f13018j = obVar;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2387e(com.tencent.p014mm.plugin.finder.feed.FinderCampaignFeedUIContract$TopicFeedPresenter r24, on1.C11507a r25) {
        /*
            r0 = r24
            r1 = r25
            r24.getClass()
            int r2 = r1.f33811i
            r3 = 0
            if (r2 != 0) goto L_0x03ce
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "setNoMoreForActivity: size:"
            r2.append(r4)
            on1.q<T> r4 = r0.f30443e
            java.util.List<T> r4 = r4.f33886d
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r4 = r4.size()
            r2.append(r4)
            java.lang.String r4 = " size: "
            r2.append(r4)
            java.util.List<T> r1 = r1.f33959a
            int r1 = r1.size()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "Finder.FinderCampaginFeedUIContract.TopicFeedPresenter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            kf1.o<T> r1 = r0.f30444f
            boolean r2 = r1 instanceof kf1.C10048y
            if (r2 == 0) goto L_0x0044
            kf1.y r1 = (kf1.C10048y) r1
            goto L_0x0045
        L_0x0044:
            r1 = r3
        L_0x0045:
            if (r1 == 0) goto L_0x03db
            on1.q<T> r0 = r0.f30443e
            java.util.List<T> r0 = r0.f33886d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            com.tencent.mm.view.RefreshLoadMoreLayout r2 = r1.f30513h
            android.view.View r2 = r2.getLoadMoreFooter()
            if (r2 == 0) goto L_0x03db
            bl3.r r4 = bl3.C39818r.f106831a
            android.content.Context r5 = r2.getContext()
            java.lang.String r6 = "context"
            gy3.C87412m.m108593f(r5, r6)
            bl3.r$a r4 = r4.mo62443b(r5)
            java.lang.Class<ce1.g> r5 = ce1.C0465g.class
            androidx.lifecycle.i0 r4 = r4.mo75002a(r5)
            ce1.g r4 = (ce1.C0465g) r4
            r4.getClass()
            boolean r12 = od1.C11405h.C11406a.m11253a(r4)
            android.view.View r1 = r1.f30793t
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "setNoMoreForActivity size:"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "Finder.FinderTopicFeedUIContract.TopicFeedViewCallback"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            r13 = 8
            r15 = 2131099697(0x7f060031, float:1.7811755E38)
            r11 = 0
            if (r0 <= 0) goto L_0x0225
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r0.mo10233c(r3)
            java.lang.Object[] r5 = r0.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback"
            java.lang.String r7 = "setNoMoreForActivity"
            java.lang.String r8 = "(I)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r3 = "(I)V"
            r4 = r2
            r14 = 0
            r11 = r3
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r0 = r0.mo10231a(r14)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.setVisibility(r0)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback"
            java.lang.String r6 = "setNoMoreForActivity"
            java.lang.String r7 = "(I)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            r0 = 2131308010(0x7f092dea, float:1.8234263E38)
            android.view.View r0 = r2.findViewById(r0)
            if (r0 != 0) goto L_0x00e6
            goto L_0x0127
        L_0x00e6:
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r11.mo10233c(r3)
            java.lang.Object[] r4 = r11.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback"
            java.lang.String r6 = "setNoMoreForActivity"
            java.lang.String r7 = "(I)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r0
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r3 = r11.mo10231a(r14)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.setVisibility(r3)
            java.lang.String r4 = "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback"
            java.lang.String r5 = "setNoMoreForActivity"
            java.lang.String r6 = "(I)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r3 = r0
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
        L_0x0127:
            r0 = 2131308008(0x7f092de8, float:1.823426E38)
            android.view.View r0 = r2.findViewById(r0)
            if (r0 != 0) goto L_0x0131
            goto L_0x0172
        L_0x0131:
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
            r11.mo10233c(r3)
            java.lang.Object[] r4 = r11.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback"
            java.lang.String r6 = "setNoMoreForActivity"
            java.lang.String r7 = "(I)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r0
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r3 = r11.mo10231a(r14)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.setVisibility(r3)
            java.lang.String r4 = "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback"
            java.lang.String r5 = "setNoMoreForActivity"
            java.lang.String r6 = "(I)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r3 = r0
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
        L_0x0172:
            if (r1 != 0) goto L_0x0175
            goto L_0x01b5
        L_0x0175:
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r0.mo10233c(r3)
            java.lang.Object[] r5 = r0.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback"
            java.lang.String r7 = "setNoMoreForActivity"
            java.lang.String r8 = "(I)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r1
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r0 = r0.mo10231a(r14)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.setVisibility(r0)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback"
            java.lang.String r6 = "setNoMoreForActivity"
            java.lang.String r7 = "(I)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
        L_0x01b5:
            r0 = 2131312503(0x7f093f77, float:1.8243376E38)
            r1 = 2131307234(0x7f092ae2, float:1.823269E38)
            r3 = 2131298939(0x7f090a7b, float:1.8215865E38)
            if (r12 == 0) goto L_0x01f1
            android.content.res.Resources r4 = r2.getResources()
            int r4 = r4.getColor(r15)
            android.view.View r3 = r2.findViewById(r3)
            if (r3 != 0) goto L_0x01cf
            goto L_0x01dd
        L_0x01cf:
            android.content.res.Resources r5 = r2.getResources()
            r6 = 2131232444(0x7f0806bc, float:1.8080997E38)
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r6)
            r3.setBackground(r5)
        L_0x01dd:
            android.view.View r1 = r2.findViewById(r1)
            if (r1 == 0) goto L_0x01e6
            r1.setBackgroundColor(r4)
        L_0x01e6:
            android.view.View r0 = r2.findViewById(r0)
            if (r0 == 0) goto L_0x03db
            r0.setBackgroundColor(r4)
            goto L_0x03db
        L_0x01f1:
            android.content.res.Resources r4 = r2.getResources()
            r5 = 2131099806(0x7f06009e, float:1.7811976E38)
            int r4 = r4.getColor(r5)
            android.view.View r3 = r2.findViewById(r3)
            if (r3 != 0) goto L_0x0203
            goto L_0x0211
        L_0x0203:
            android.content.res.Resources r5 = r2.getResources()
            r6 = 2131232446(0x7f0806be, float:1.8081001E38)
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r6)
            r3.setBackground(r5)
        L_0x0211:
            android.view.View r1 = r2.findViewById(r1)
            if (r1 == 0) goto L_0x021a
            r1.setBackgroundColor(r4)
        L_0x021a:
            android.view.View r0 = r2.findViewById(r0)
            if (r0 == 0) goto L_0x03db
            r0.setBackgroundColor(r4)
            goto L_0x03db
        L_0x0225:
            r14 = 0
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r0.mo10233c(r4)
            java.lang.Object[] r5 = r0.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback"
            java.lang.String r7 = "setNoMoreForActivity"
            java.lang.String r8 = "(I)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r2
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r0 = r0.mo10231a(r14)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.setVisibility(r0)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback"
            java.lang.String r6 = "setNoMoreForActivity"
            java.lang.String r7 = "(I)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            if (r1 != 0) goto L_0x026b
            goto L_0x02ab
        L_0x026b:
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            r0.mo10233c(r4)
            java.lang.Object[] r5 = r0.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback"
            java.lang.String r7 = "setNoMoreForActivity"
            java.lang.String r8 = "(I)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r1
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r0 = r0.mo10231a(r14)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.setVisibility(r0)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback"
            java.lang.String r6 = "setNoMoreForActivity"
            java.lang.String r7 = "(I)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
        L_0x02ab:
            r0 = 2131301630(0x7f0914fe, float:1.8221323E38)
            if (r1 == 0) goto L_0x02b6
            android.view.View r4 = r1.findViewById(r0)
            r5 = r4
            goto L_0x02b7
        L_0x02b6:
            r5 = r3
        L_0x02b7:
            if (r5 != 0) goto L_0x02ba
            goto L_0x02fb
        L_0x02ba:
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)
            r4.mo10233c(r6)
            java.lang.Object[] r17 = r4.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback"
            java.lang.String r19 = "setNoMoreForActivity"
            java.lang.String r20 = "(I)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r5
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r4 = r4.mo10231a(r14)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5.setVisibility(r4)
            java.lang.String r6 = "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback"
            java.lang.String r7 = "setNoMoreForActivity"
            java.lang.String r8 = "(I)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
        L_0x02fb:
            if (r1 == 0) goto L_0x0306
            r4 = 2131312452(0x7f093f44, float:1.8243273E38)
            android.view.View r4 = r1.findViewById(r4)
            r5 = r4
            goto L_0x0307
        L_0x0306:
            r5 = r3
        L_0x0307:
            if (r5 != 0) goto L_0x030a
            goto L_0x034b
        L_0x030a:
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r4.mo10233c(r6)
            java.lang.Object[] r17 = r4.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback"
            java.lang.String r19 = "setNoMoreForActivity"
            java.lang.String r20 = "(I)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r5
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r4 = r4.mo10231a(r14)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5.setVisibility(r4)
            java.lang.String r6 = "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback"
            java.lang.String r7 = "setNoMoreForActivity"
            java.lang.String r8 = "(I)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
        L_0x034b:
            if (r1 == 0) goto L_0x0354
            r3 = 2131311498(0x7f093b8a, float:1.8241338E38)
            android.view.View r3 = r1.findViewById(r3)
        L_0x0354:
            if (r3 != 0) goto L_0x0357
            goto L_0x039a
        L_0x0357:
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r11.mo10233c(r4)
            java.lang.Object[] r5 = r11.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback"
            java.lang.String r7 = "setNoMoreForActivity"
            java.lang.String r8 = "(I)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r4 = r3
            r15 = r11
            r11 = r13
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r4 = r15.mo10231a(r14)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback"
            java.lang.String r6 = "setNoMoreForActivity"
            java.lang.String r7 = "(I)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r4 = r3
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
        L_0x039a:
            if (r12 == 0) goto L_0x03b5
            if (r1 == 0) goto L_0x03db
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x03db
            android.content.res.Resources r1 = r2.getResources()
            r2 = 2131099697(0x7f060031, float:1.7811755E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            goto L_0x03db
        L_0x03b5:
            if (r1 == 0) goto L_0x03db
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x03db
            android.content.res.Resources r1 = r2.getResources()
            r2 = 2131099806(0x7f06009e, float:1.7811976E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            goto L_0x03db
        L_0x03ce:
            kf1.o<T> r0 = r0.f30444f
            if (r0 == 0) goto L_0x03d4
            com.tencent.mm.view.RefreshLoadMoreLayout r3 = r0.f30513h
        L_0x03d4:
            if (r3 != 0) goto L_0x03d7
            goto L_0x03db
        L_0x03d7:
            r0 = 1
            r3.setEnableLoadMore(r0)
        L_0x03db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderCampaignFeedUIContract$TopicFeedPresenter.m2387e(com.tencent.mm.plugin.finder.feed.FinderCampaignFeedUIContract$TopicFeedPresenter, on1.a):void");
    }

    /* renamed from: U */
    public C9500j mo2476U() {
        return this.f13016h == 7 ? new C2498x90b89741(this) : new C2499xc01f5f21(this, new C2496a(this), new C2497b(this));
    }

    /* renamed from: n */
    public void mo2477n() {
        C9897o<T> oVar = this.f30444f;
        if (oVar != null) {
            List<T> list = this.f30443e.f33886d;
            C87412m.m108592e(list, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.plugin.finder.model.RVFeed>{ kotlin.collections.TypeAliasesKt.ArrayList<com.tencent.mm.plugin.finder.model.RVFeed> }");
            oVar.mo10436d((ArrayList) list);
        }
    }

    /* renamed from: o */
    public void mo2478o() {
        C11548q<T> qVar = this.f30443e;
        qVar.getClass();
        C0317e.launch$default(qVar, (C66212f) null, (C53934p0) null, new C11567u(qVar, (C15601d<? super C11567u>) null), 3, (Object) null);
    }

    public void onDetach() {
        super.onDetach();
        IListener<ActivityFeedRemoveEvent> iListener = this.f13019n;
        if (iListener != null) {
            iListener.dead();
        }
    }

    public void requestRefresh() {
        C11548q<T> qVar = this.f30443e;
        qVar.getClass();
        C0317e.launch$default(qVar, (C66212f) null, (C53934p0) null, new C11570v(qVar, (C15601d<? super C11570v>) null), 3, (Object) null);
    }
}
