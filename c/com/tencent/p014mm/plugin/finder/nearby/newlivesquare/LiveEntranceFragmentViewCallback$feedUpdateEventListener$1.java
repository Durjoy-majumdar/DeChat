package com.tencent.p014mm.plugin.finder.nearby.newlivesquare;

import an1.C0091d;
import an1.C0103p;
import cm1.C0797z;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.Iterator;
import kotlin.Metadata;
import mm1.C10934a;
import p565ir.C60606n;
import sx3.C13798c0;
import te3.C51713vn0;
import te3.C64273c21;
import te3.C64337e61;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentViewCallback$feedUpdateEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedUpdateEvent;", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback$feedUpdateEventListener$1 */
public final class LiveEntranceFragmentViewCallback$feedUpdateEventListener$1 extends IListener<FeedUpdateEvent> {

    /* renamed from: d */
    public final /* synthetic */ LiveEntranceFragmentViewCallback f15739d;

    /* renamed from: com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback$feedUpdateEventListener$1$a */
    public static final class C3318a implements C60606n.C60609c {

        /* renamed from: a */
        public final /* synthetic */ C0797z f15740a;

        public C3318a(C0797z zVar) {
            this.f15740a = zVar;
        }

        public void onLiveStatusCallback(long j, int i, Object obj) {
            C64273c21 liveInfo;
            C64273c21 liveInfo2 = this.f15740a.mo3513o().getLiveInfo();
            Object obj2 = null;
            if ((liveInfo2 != null ? liveInfo2.f182392d : 0) != j || !(obj instanceof C51713vn0)) {
                StringBuilder sb = new StringBuilder();
                sb.append("#refreshLiveStatus, local liveId:");
                C64273c21 liveInfo3 = this.f15740a.mo3513o().getLiveInfo();
                if (liveInfo3 != null) {
                    obj2 = Long.valueOf(liveInfo3.f182392d);
                }
                sb.append(obj2);
                sb.append(" resp live id ");
                sb.append(j);
                sb.append(",liveInfoResp:");
                sb.append(obj);
                sb.append('!');
                Log.m105924i("Finder.LiveEntranceFragmentViewCallback", sb.toString());
                return;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("change liveStatus,cur feed:");
            sb4.append(this.f15740a.mo3513o().getNickName());
            sb4.append(" status:");
            C64273c21 liveInfo4 = this.f15740a.mo3513o().getLiveInfo();
            if (liveInfo4 != null) {
                obj2 = Integer.valueOf(liveInfo4.f182394f);
            }
            sb4.append(obj2);
            sb4.append(", liveStatus:");
            sb4.append(i);
            Log.m105924i("Finder.LiveEntranceFragmentViewCallback", sb4.toString());
            if (i > 0 && (liveInfo = this.f15740a.mo3513o().getLiveInfo()) != null) {
                liveInfo.f182394f = i;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveEntranceFragmentViewCallback$feedUpdateEventListener$1(LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback, MMActivity mMActivity) {
        super(mMActivity);
        this.f15739d = liveEntranceFragmentViewCallback;
    }

    public boolean callback(IEvent iEvent) {
        FeedUpdateEvent feedUpdateEvent = (FeedUpdateEvent) iEvent;
        C87412m.m108594g(feedUpdateEvent, "event");
        FeedUpdateEvent.C1041a aVar = feedUpdateEvent.f9173d;
        int i = aVar.f9175b;
        if (i != 8) {
            if (i == 28) {
                Log.m105924i("Finder.LiveEntranceFragmentViewCallback", "TYPE_CHARGE_LIVE_PAY_SUCCESS charge_live id=" + feedUpdateEvent.f9173d.f9174a);
                long j = feedUpdateEvent.f9173d.f9174a;
                if (j != 0) {
                    try {
                        C0797z f = mo3628f(j);
                        C64337e61 e612 = null;
                        if (f != null) {
                            C64273c21 liveInfo = f.mo3513o().getLiveInfo();
                            C64337e61 e613 = liveInfo != null ? liveInfo.f182363I : null;
                            if (e613 != null) {
                                e613.f182921e = true;
                            }
                        }
                        C0797z e = mo3627e(feedUpdateEvent.f9173d.f9174a);
                        if (e != null) {
                            C64273c21 liveInfo2 = e.mo3513o().getLiveInfo();
                            C64337e61 e614 = liveInfo2 != null ? liveInfo2.f182363I : null;
                            if (e614 != null) {
                                e614.f182921e = true;
                            }
                        }
                        C0797z g = mo3629g(feedUpdateEvent.f9173d.f9174a);
                        if (g != null) {
                            C64273c21 liveInfo3 = g.mo3513o().getLiveInfo();
                            if (liveInfo3 != null) {
                                e612 = liveInfo3.f182363I;
                            }
                            if (e612 != null) {
                                e612.f182921e = true;
                            }
                        }
                    } catch (Exception e2) {
                        Log.m105920e("Finder.LiveEntranceFragmentViewCallback", e2.getMessage());
                    }
                }
            }
        } else if (C10934a.f32584b) {
            long j2 = aVar.f9174a;
            if (j2 != 0 && aVar.f9177d == 1) {
                try {
                    C0797z f2 = mo3628f(j2);
                    if (f2 != null) {
                        mo3630h("普通feed", f2);
                    }
                    C0797z e3 = mo3627e(feedUpdateEvent.f9173d.f9174a);
                    if (e3 != null) {
                        mo3630h("大卡片", e3);
                    }
                    C0797z g2 = mo3629g(feedUpdateEvent.f9173d.f9174a);
                    if (g2 != null) {
                        mo3630h("专栏", g2);
                    }
                } catch (Exception e4) {
                    Log.m105920e("Finder.LiveEntranceFragmentViewCallback", e4.getMessage());
                }
            }
        }
        return true;
    }

    /* renamed from: e */
    public final C0797z mo3627e(long j) {
        T t;
        Iterator<T> it = C13798c0.m13102z(this.f15739d.f15710i, C0091d.class).iterator();
        do {
            t = null;
            if (!it.hasNext()) {
                break;
            }
            Iterator<T> it4 = C13798c0.m13102z(((C0091d) it.next()).f529e, C0797z.class).iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                T next = it4.next();
                C64273c21 liveInfo = ((C0797z) next).mo3513o().getLiveInfo();
                boolean z = false;
                if (liveInfo != null && liveInfo.f182392d == j) {
                    z = true;
                    continue;
                }
                if (z) {
                    t = next;
                    break;
                }
            }
            t = (C0797z) t;
        } while (t == null);
        return t;
    }

    /* renamed from: f */
    public final C0797z mo3628f(long j) {
        T t;
        Iterator<T> it = C13798c0.m13102z(this.f15739d.f15710i, C0797z.class).iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            C64273c21 liveInfo = ((C0797z) t).mo3513o().getLiveInfo();
            boolean z = false;
            if (liveInfo != null && liveInfo.f182392d == j) {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (C0797z) t;
    }

    /* renamed from: g */
    public final C0797z mo3629g(long j) {
        T t;
        Iterator<T> it = C13798c0.m13102z(this.f15739d.f15710i, C0103p.class).iterator();
        do {
            t = null;
            if (!it.hasNext()) {
                break;
            }
            Iterator<T> it4 = C13798c0.m13102z(((C0103p) it.next()).f546e, C0797z.class).iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                T next = it4.next();
                C64273c21 liveInfo = ((C0797z) next).mo3513o().getLiveInfo();
                boolean z = false;
                if (liveInfo != null && liveInfo.f182392d == j) {
                    z = true;
                    continue;
                }
                if (z) {
                    t = next;
                    break;
                }
            }
            t = (C0797z) t;
        } while (t == null);
        return t;
    }

    /* renamed from: h */
    public final void mo3630h(String str, C0797z zVar) {
        C87412m.m108594g(str, "prefixTag");
        C87412m.m108594g(zVar, "feed");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-refreshLiveStatus ");
        sb.append(zVar.mo3513o().getNickName());
        sb.append('(');
        C64273c21 liveInfo = zVar.mo3513o().getLiveInfo();
        sb.append(liveInfo != null ? Long.valueOf(liveInfo.f182392d) : null);
        sb.append(')');
        Log.m105924i("Finder.LiveEntranceFragmentViewCallback", sb.toString());
        C60606n nVar = (C60606n) C86312j.m106911c(C60606n.class);
        C64273c21 liveInfo2 = zVar.mo3513o().getLiveInfo();
        nVar.ck0(liveInfo2 != null ? liveInfo2.f182392d : 0, 2, 10000, this.f15739d.f15702a, new C3318a(zVar), 7);
    }
}
