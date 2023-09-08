package oi1;

import al1.C54130j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import cl1.C54991o;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ni1.C61753b;
import ok1.C62042e;
import qj1.C62660c;
import si1.C63902g;
import te3.C49765hx0;

/* renamed from: oi1.a */
public abstract class C62028a extends C63902g {

    /* renamed from: w */
    public static final /* synthetic */ int f176320w = 0;

    /* renamed from: q */
    public ViewGroup f176321q;

    /* renamed from: r */
    public ViewGroup f176322r;

    /* renamed from: s */
    public ViewGroup f176323s;

    /* renamed from: t */
    public ViewGroup f176324t;

    /* renamed from: u */
    public ViewGroup f176325u;

    /* renamed from: v */
    public ViewGroup f176326v;

    /* renamed from: oi1.a$a */
    public static final class C62029a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62028a f176327d;

        /* renamed from: e */
        public final /* synthetic */ C62660c f176328e;

        public C62029a(C62028a aVar, C62660c cVar) {
            this.f176327d = aVar;
            this.f176328e = cVar;
        }

        public final void onClick(View view) {
            Class cls = C54991o.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/mic/widget/base/FinderLiveMicBaseCoverAnchorWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C62042e.f176370a.mo87027N0()) {
                Log.m105924i(this.f176327d.getTAG(), "click rect area but i am anchor, skipped");
            } else {
                String n4 = ((C54991o) this.f176328e.mo87696x0(cls)).mo76015n4();
                C62028a aVar = this.f176327d;
                int i = C62028a.f176320w;
                C54130j bindLinkMicUser = aVar.getBindLinkMicUser();
                FinderContact finderContact = null;
                if (Util.isEqual(n4, bindLinkMicUser != null ? bindLinkMicUser.f151997a : null)) {
                    Log.m105924i(this.f176327d.getTAG(), "click rect area but is myself, skipped");
                } else {
                    C54130j bindLinkMicUser2 = this.f176327d.getBindLinkMicUser();
                    C49765hx0 hx02 = bindLinkMicUser2 != null ? bindLinkMicUser2.f152014r : null;
                    if (hx02 != null) {
                        FinderObject finderObject = ((C54991o) this.f176328e.mo87696x0(cls)).f154341n;
                        if (finderObject != null) {
                            finderContact = finderObject.contact;
                        }
                        hx02.f134919d = finderContact;
                    }
                    this.f176327d.mo88684s();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/mic/widget/base/FinderLiveMicBaseCoverAnchorWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62028a(Context context, C62660c cVar, C61753b bVar) {
        super(context, cVar, bVar, 3);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(cVar, "basePlugin");
        C87412m.m108594g(bVar, "service");
        mo86921t();
        getRoot().setOnClickListener(new C62029a(this, cVar));
        addView(getRoot());
    }

    /* renamed from: a */
    public void mo86901a() {
        Log.m105924i(getTAG(), "onGiftAnimationStart");
    }

    /* renamed from: b */
    public void mo86902b() {
        Log.m105924i(getTAG(), "onGiftAnimationEnd");
    }

    public ViewGroup getAnchorAudioModeLayout() {
        return getFinderLiveMicAnchorAudioLayout();
    }

    public final ViewGroup getFinderLiveLotteryBubbleRoot() {
        ViewGroup viewGroup = this.f176325u;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("finderLiveLotteryBubbleRoot");
        throw null;
    }

    public final ViewGroup getFinderLiveLuckyMoneyBubbleUiRoot() {
        ViewGroup viewGroup = this.f176323s;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("finderLiveLuckyMoneyBubbleUiRoot");
        throw null;
    }

    public final ViewGroup getFinderLiveMicAnchorAudioLayout() {
        ViewGroup viewGroup = this.f176321q;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("finderLiveMicAnchorAudioLayout");
        throw null;
    }

    public final ViewGroup getFinderLiveMicNewNormalMicGiftItemLayout() {
        ViewGroup viewGroup = this.f176322r;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("finderLiveMicNewNormalMicGiftItemLayout");
        throw null;
    }

    public final ViewGroup getFinderLiveVoteBubbleRoot() {
        ViewGroup viewGroup = this.f176324t;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("finderLiveVoteBubbleRoot");
        throw null;
    }

    public ViewGroup getGiftRootView() {
        return getFinderLiveMicNewNormalMicGiftItemLayout();
    }

    public ViewGroup getLotteryBubbleRootView() {
        return getFinderLiveLotteryBubbleRoot();
    }

    public ViewGroup getLuckyMoneyRootView() {
        return getFinderLiveLuckyMoneyBubbleUiRoot();
    }

    public final ViewGroup getRoot() {
        ViewGroup viewGroup = this.f176326v;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("root");
        throw null;
    }

    public ViewGroup getVoteBubbleRootView() {
        return getFinderLiveVoteBubbleRoot();
    }

    /* renamed from: q */
    public void mo86914q() {
    }

    public final void setFinderLiveLotteryBubbleRoot(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "<set-?>");
        this.f176325u = viewGroup;
    }

    public final void setFinderLiveLuckyMoneyBubbleUiRoot(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "<set-?>");
        this.f176323s = viewGroup;
    }

    public final void setFinderLiveMicAnchorAudioLayout(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "<set-?>");
        this.f176321q = viewGroup;
    }

    public final void setFinderLiveMicNewNormalMicGiftItemLayout(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "<set-?>");
        this.f176322r = viewGroup;
    }

    public final void setFinderLiveVoteBubbleRoot(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "<set-?>");
        this.f176324t = viewGroup;
    }

    public final void setRoot(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "<set-?>");
        this.f176326v = viewGroup;
    }

    /* renamed from: t */
    public abstract void mo86921t();
}
