package hp1;

import cm1.C0740i2;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.search.FinderFeedSearchUI;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import fy3.C32224a;
import gy3.C87413o;
import java.util.Iterator;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import vp1.C65834e;
import vq1.C65866w;

/* renamed from: hp1.r */
public final class C8683r extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FeedUpdateEvent f27875d;

    /* renamed from: e */
    public final /* synthetic */ FinderFeedSearchUI f27876e;

    /* renamed from: f */
    public final /* synthetic */ WxRecyclerAdapter<C0740i2> f27877f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8683r(FeedUpdateEvent feedUpdateEvent, FinderFeedSearchUI finderFeedSearchUI, WxRecyclerAdapter<C0740i2> wxRecyclerAdapter) {
        super(0);
        this.f27875d = feedUpdateEvent;
        this.f27876e = finderFeedSearchUI;
        this.f27877f = wxRecyclerAdapter;
    }

    public Object invoke() {
        Log.m105924i("Finder.FinderFeedSearchUI", "feedChangeListener " + this.f27875d.f9173d.f9174a);
        FeedUpdateEvent feedUpdateEvent = this.f27875d;
        FeedUpdateEvent.C1041a aVar = feedUpdateEvent.f9173d;
        int i = aVar.f9175b;
        if (i != 0) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 25) {
                        if (i == 26 && aVar.f9174a != 0) {
                            Iterator<E> it = this.f27876e.f16513x.iterator();
                            int i2 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i2 = -1;
                                    break;
                                }
                                C0740i2 i2Var = (C0740i2) it.next();
                                if ((i2Var instanceof BaseFinderFeed) && ((BaseFinderFeed) i2Var).mo3513o().getId() == feedUpdateEvent.f9173d.f9174a) {
                                    break;
                                }
                                i2++;
                            }
                            if (i2 != -1) {
                                this.f27877f.notifyItemRangeChanged(i2, 1, new C13604l(32, this.f27875d));
                            }
                        }
                    } else if (aVar.f9174a != 0) {
                        Iterator<E> it4 = this.f27876e.f16513x.iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                i3 = -1;
                                break;
                            }
                            C0740i2 i2Var2 = (C0740i2) it4.next();
                            if ((i2Var2 instanceof BaseFinderFeed) && ((BaseFinderFeed) i2Var2).mo3513o().getId() == feedUpdateEvent.f9173d.f9174a) {
                                break;
                            }
                            i3++;
                        }
                        if (i3 != -1) {
                            this.f27877f.notifyItemRangeChanged(i3, 1, new C13604l(31, this.f27875d));
                        }
                    }
                } else if (aVar.f9174a != 0) {
                    Iterator<E> it5 = this.f27876e.f16513x.iterator();
                    int i4 = 0;
                    while (true) {
                        if (!it5.hasNext()) {
                            i4 = -1;
                            break;
                        }
                        C0740i2 i2Var3 = (C0740i2) it5.next();
                        if ((i2Var3 instanceof BaseFinderFeed) && ((BaseFinderFeed) i2Var3).mo3513o().getId() == feedUpdateEvent.f9173d.f9174a) {
                            break;
                        }
                        i4++;
                    }
                    if (i4 != -1) {
                        this.f27877f.notifyItemRangeChanged(i4, 1, new C13604l(4, 1));
                        this.f27877f.notifyItemRangeChanged(i4, 1, new C13604l(9, 1));
                        if (this.f27875d.f9173d.f9185l > 0) {
                            this.f27877f.notifyItemRangeChanged(i4, 1, new C13604l(35, this.f27875d));
                        }
                    }
                }
            } else if (aVar.f9174a != 0) {
                Iterator<E> it6 = this.f27876e.f16513x.iterator();
                int i5 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i5 = -1;
                        break;
                    }
                    C0740i2 i2Var4 = (C0740i2) it6.next();
                    if ((i2Var4 instanceof BaseFinderFeed) && ((BaseFinderFeed) i2Var4).mo3513o().getId() == feedUpdateEvent.f9173d.f9174a) {
                        break;
                    }
                    i5++;
                }
                if (i5 != -1) {
                    if (this.f27875d.f9173d.f9177d == 1) {
                        Object O = C110818d0.m150917O(this.f27876e.f16513x, i5);
                        BaseFinderFeed baseFinderFeed = O instanceof BaseFinderFeed ? (BaseFinderFeed) O : null;
                        if (baseFinderFeed != null) {
                            int i6 = this.f27875d.f9173d.f9178e;
                            int likeFlag = baseFinderFeed.mo3513o().getLikeFlag();
                            if (likeFlag != i6) {
                                if (likeFlag == 0) {
                                    FinderItem o = baseFinderFeed.mo3513o();
                                    o.setLikeCount(o.getLikeCount() + 1);
                                } else if (i6 == 0) {
                                    FinderItem o2 = baseFinderFeed.mo3513o();
                                    o2.setLikeCount(o2.getLikeCount() - 1);
                                }
                                if (i6 == 1) {
                                    FinderItem o3 = baseFinderFeed.mo3513o();
                                    o3.setFriendLikeCount(o3.getFriendLikeCount() + 1);
                                    C65866w.f189407h.mo89903a(baseFinderFeed.mo3513o().getLikeList());
                                } else if (likeFlag == 1) {
                                    FinderItem o4 = baseFinderFeed.mo3513o();
                                    o4.setFriendLikeCount(o4.getFriendLikeCount() - 1);
                                    C65866w.f189407h.mo89912k(baseFinderFeed.mo3513o().getLikeList());
                                }
                                this.f27877f.notifyItemRangeChanged(i5, 1, new C13604l(3, 1));
                            }
                        }
                    } else {
                        this.f27877f.notifyItemRangeChanged(i5, 1, new C13604l(3, 1));
                    }
                    if (this.f27875d.f9173d.f9185l > 0) {
                        this.f27877f.notifyItemRangeChanged(i5, 1, new C13604l(35, this.f27875d));
                    }
                }
            }
        } else if (!(aVar.f9174a == 0 || C65834e.f189316a.mo89871e(aVar.f9174a) == null)) {
            FinderFeedSearchUI finderFeedSearchUI = this.f27876e;
            WxRecyclerAdapter<C0740i2> wxRecyclerAdapter = this.f27877f;
            FeedUpdateEvent feedUpdateEvent2 = this.f27875d;
            Iterator<E> it7 = finderFeedSearchUI.f16513x.iterator();
            int i7 = 0;
            while (true) {
                if (!it7.hasNext()) {
                    i7 = -1;
                    break;
                }
                C0740i2 i2Var5 = (C0740i2) it7.next();
                if ((i2Var5 instanceof BaseFinderFeed) && ((BaseFinderFeed) i2Var5).mo3513o().getId() == feedUpdateEvent2.f9173d.f9174a) {
                    break;
                }
                i7++;
            }
            if (i7 != -1) {
                wxRecyclerAdapter.notifyItemRangeChanged(i7, 1, 1);
            }
        }
        return C13598b0.f38549a;
    }
}
