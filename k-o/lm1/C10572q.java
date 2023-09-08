package lm1;

import ak1.C54059a;
import ak1.C54067f0;
import android.os.SystemClock;
import android.view.View;
import cm1.C0797z;
import cm1.C55012e1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderBroadcastEidExposeStruct;
import com.tencent.p014mm.plugin.finder.nearby.base.AbsNearByFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import h81.C59774i;
import java.util.LinkedList;
import java.util.Set;
import jq3.C9493c;
import jq3.C9494d;
import jq3.C9499g;
import kf1.C9833k9;
import ln1.C10583e;
import p565ir.C60606n;
import te3.C51449tu2;

/* renamed from: lm1.q */
public final class C10572q extends C9499g<C9493c> {

    /* renamed from: a */
    public final /* synthetic */ C10554j f31887a;

    public C10572q(C10554j jVar) {
        this.f31887a = jVar;
    }

    /* renamed from: b */
    public void mo752b(Set<C9494d<C9493c>> set) {
        int i;
        String S;
        Object tag;
        Object tag2;
        C87412m.m108594g(set, "recordsSet");
        Log.m105924i("NearbyLiveViewCallback", "onExposeTimeRecorded: size = " + set.size());
        LinkedList linkedList = new LinkedList();
        C10554j jVar = this.f31887a;
        for (C9494d dVar : set) {
            T t = dVar.f29663a;
            if (t instanceof C0797z) {
                C51449tu2 tu22 = new C51449tu2();
                T t2 = dVar.f29663a;
                C87412m.m108592e(t2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderFeedLive");
                C0797z zVar = (C0797z) t2;
                tu22.f142417d = zVar.getItemId();
                C55012e1.f154468d.mo76062f(tu22, jVar.f31845f.getCommentScene(), -1);
                tu22.f142422i = (int) dVar.f29666d;
                tu22.f142423j = dVar.f29667e;
                tu22.f142421h = zVar.mo3526z();
                View view = dVar.f29668f;
                boolean z = false;
                if (view == null || (tag2 = view.getTag(C0966R.C0970id.ha_)) == null) {
                    Integer num = 0;
                    i = num.intValue();
                } else {
                    long longValue = tag2 instanceof Long ? ((Long) tag2).longValue() : 0;
                    i = Integer.valueOf(longValue != 0 ? (int) (SystemClock.elapsedRealtime() - longValue) : 0).intValue();
                }
                tu22.f142424n = i;
                View view2 = dVar.f29668f;
                if (!(view2 == null || (tag = view2.getTag(C0966R.C0970id.had)) == null)) {
                    z = Boolean.valueOf(((Boolean) tag).booleanValue()).booleanValue();
                }
                tu22.f142425o = z;
                linkedList.add(tu22);
                C54059a aVar = jVar.f31856t;
                int i2 = dVar.f29667e;
                C54067f0.C54078q qVar = C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD;
                String valueOf = String.valueOf(jVar.f31845f.getCommentScene());
                AbsNearByFragment absNearByFragment = jVar.f31844e;
                aVar.mo74735d(zVar, i2, qVar, valueOf, (absNearByFragment == null || (S = absNearByFragment.mo3551S()) == null) ? "" : S, jVar.f31858v.mo10830b(dVar.f29667e, dVar.f29668f, "onExpose"));
                Log.m105924i("NearbyLiveViewCallback", "onExposeTimeRecorded pos:" + dVar.f29667e + " feedId: " + tu22.f142417d + " auto_play_time_ms:" + tu22.f142424n + " auto_play_with_sound:" + tu22.f142425o + " exposeTime:" + dVar.f29666d + " nick:" + zVar.mo3513o().getFeedObject().nickname);
            } else if (t instanceof C9833k9) {
                String str = jVar.f31847h.f134672f;
                if (str == null) {
                    str = "";
                }
                FinderBroadcastEidExposeStruct finderBroadcastEidExposeStruct = new FinderBroadcastEidExposeStruct();
                finderBroadcastEidExposeStruct.f9740d = Util.nowMilliSecond();
                finderBroadcastEidExposeStruct.f9741e = finderBroadcastEidExposeStruct.mo86045b("finderusername", "", true);
                finderBroadcastEidExposeStruct.f9742f = finderBroadcastEidExposeStruct.mo86045b("chnl_extra", jVar.f31858v.mo10830b(dVar.f29667e, dVar.f29668f, "onExpose"), true);
                finderBroadcastEidExposeStruct.f9743g = finderBroadcastEidExposeStruct.mo86045b("tab_id", "", true);
                finderBroadcastEidExposeStruct.f9744h = finderBroadcastEidExposeStruct.mo86045b("sub_tab_id", "", true);
                String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
                if (Wb == null) {
                    Wb = "";
                }
                finderBroadcastEidExposeStruct.f9745i = finderBroadcastEidExposeStruct.mo86045b("sessionid", Wb, true);
                finderBroadcastEidExposeStruct.f9746j = finderBroadcastEidExposeStruct.mo86045b("contextid", jVar.f31847h.f134671e, true);
                finderBroadcastEidExposeStruct.f9747k = finderBroadcastEidExposeStruct.mo86045b("commentscene", String.valueOf(jVar.f31847h.f134675i), true);
                finderBroadcastEidExposeStruct.f9748l = finderBroadcastEidExposeStruct.mo86045b("TabContextID", str, true);
                finderBroadcastEidExposeStruct.f9749m = finderBroadcastEidExposeStruct.mo86045b("SubTabContextID", "", true);
                finderBroadcastEidExposeStruct.f9750n = finderBroadcastEidExposeStruct.mo86045b("pg_udf_kv", "", true);
                finderBroadcastEidExposeStruct.f9751o = finderBroadcastEidExposeStruct.mo86045b("ref_commentscene", "", true);
                finderBroadcastEidExposeStruct.f9752p = finderBroadcastEidExposeStruct.mo86045b("eid", "all_my_follow", true);
                finderBroadcastEidExposeStruct.f9753q = finderBroadcastEidExposeStruct.mo86045b("eld_udf_kv", "", true);
                finderBroadcastEidExposeStruct.f9754r = finderBroadcastEidExposeStruct.mo86045b("switch_extra", ((C60606n) C86312j.m106911c(C60606n.class)).tx0(), true);
                finderBroadcastEidExposeStruct.mo86054n();
            } else {
                Log.m105918d("NearbyLiveViewCallback", "onExposeTimeRecorded pos:" + dVar.f29667e + " exposeTime:" + dVar.f29666d);
            }
        }
        C10583e.f31911a.mo10839g(this.f31887a.f31845f.getCommentScene(), linkedList);
        if (!C10542a.f31819v) {
            C55012e1.f154468d.mo76060d(linkedList);
        }
    }

    /* renamed from: c */
    public void mo753c(C9494d<C9493c> dVar) {
        C87412m.m108594g(dVar, "item");
        if (dVar.f29663a instanceof C0797z) {
            C51449tu2 tu22 = new C51449tu2();
            T t = dVar.f29663a;
            C87412m.m108592e(t, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderFeedLive");
            C0797z zVar = (C0797z) t;
            tu22.f142417d = zVar.getItemId();
            tu22.f142422i = (int) dVar.f29664b;
            View view = dVar.f29668f;
            if (view != null) {
                view.setTag(C0966R.C0970id.had, Boolean.FALSE);
            }
            View view2 = dVar.f29668f;
            if (view2 != null) {
                view2.setTag(C0966R.C0970id.ha_, 0L);
            }
            C55012e1.f154468d.mo76062f(tu22, this.f31887a.f31845f.getCommentScene(), -1);
            ((LinkedList) C10583e.f31911a.mo10836d(this.f31887a.f31845f.getCommentScene())).add(tu22);
            Log.m105918d("NearbyLiveViewCallback", "onItemExposeStart pos:" + dVar.f29667e + " id:" + tu22.f142417d + " nick:" + zVar.mo3513o().getFeedObject().nickname);
        }
    }
}
