package com.tencent.p014mm.plugin.finder.feed.p052ui;

import cm1.C0734g2;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderFavTopicUpdateEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import o40.C61926c;
import org.json.JSONObject;
import rs1.C13442s8;
import te3.C51270sn1;
import vf1.C14753e1;
import vf1.C14844x0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$Presenter$onAttach$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderFavTopicUpdateEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderInteractionSearchUIContract$Presenter$onAttach$1 */
public final class FinderInteractionSearchUIContract$Presenter$onAttach$1 extends IListener<FinderFavTopicUpdateEvent> {

    /* renamed from: d */
    public final /* synthetic */ C14844x0 f14444d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderInteractionSearchUIContract$Presenter$onAttach$1(C14844x0 x0Var, C40008f fVar) {
        super(fVar);
        this.f14444d = x0Var;
    }

    public boolean callback(IEvent iEvent) {
        FinderFavTopicUpdateEvent finderFavTopicUpdateEvent = (FinderFavTopicUpdateEvent) iEvent;
        C87412m.m108594g(finderFavTopicUpdateEvent, "event");
        ArrayList arrayList = finderFavTopicUpdateEvent.f9200d.f9201a;
        C87412m.m108592e(arrayList, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.protocal.protobuf.FinderTopicInfo>{ kotlin.collections.TypeAliasesKt.ArrayList<com.tencent.mm.protocal.protobuf.FinderTopicInfo> }");
        this.f14444d.f40844e.clear();
        C14844x0 x0Var = this.f14444d;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x0Var.f40844e.add(new C0734g2((C51270sn1) it.next(), 2));
        }
        FinderInteractionSearchUIContract$ViewCallback finderInteractionSearchUIContract$ViewCallback = this.f14444d.f40846g;
        if (finderInteractionSearchUIContract$ViewCallback != null) {
            C61926c.m72668M(new C14753e1(finderInteractionSearchUIContract$ViewCallback));
            ArrayList<C0734g2> arrayList2 = finderInteractionSearchUIContract$ViewCallback.f14446e.f40844e;
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder();
            for (C0734g2 g2Var : arrayList2) {
                String str = g2Var.f1749d.f141617d;
                if (str == null) {
                    str = "";
                }
                sb.append(str);
                sb.append(";");
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            jSONObject.put("tag", String.valueOf(sb));
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "udf.toString()");
            C13442s8 f = C13442s8.f38060Q0.mo12873f(finderInteractionSearchUIContract$ViewCallback.f14445d);
            y0Var.Cx0(0, "fav_tag", jSONObject2, f != null ? f.mo12861q3() : null);
        }
        return true;
    }
}
