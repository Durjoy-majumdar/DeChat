package com.tencent.p014mm.plugin.sns.p106ui.item.improve.click;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.SnsOtherFeedClickEvent;
import com.tencent.p014mm.plugin.sns.model.C94851d1;
import com.tencent.p014mm.plugin.sns.model.C94895m2;
import com.tencent.p014mm.plugin.sns.p106ui.C95787g0;
import com.tencent.p014mm.plugin.sns.p106ui.C96085n8;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ui/item/improve/click/TimelineItemClickEventCenter$otherFeedClickIListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsOtherFeedClickEvent;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$otherFeedClickIListener$1 */
public final class TimelineItemClickEventCenter$otherFeedClickIListener$1 extends IListener<SnsOtherFeedClickEvent> {
    public TimelineItemClickEventCenter$otherFeedClickIListener$1(C40008f fVar) {
        super(fVar);
    }

    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$otherFeedClickIListener$1");
        SnsOtherFeedClickEvent snsOtherFeedClickEvent = (SnsOtherFeedClickEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$otherFeedClickIListener$1");
        C87412m.m108594g(snsOtherFeedClickEvent, "event");
        SnsOtherFeedClickEvent.C92587a aVar = snsOtherFeedClickEvent.f265177d;
        C95787g0 g0Var = aVar.f265179b;
        View view = aVar.f265180c;
        Context context = view.getContext();
        C94851d1 d1Var = C96085n8.f280582z;
        if (d1Var == null) {
            d1Var = new C94895m2(1);
        }
        int i = snsOtherFeedClickEvent.f265177d.f265178a;
        if (i == 3 || i == 4 || i == 5) {
            C96085n8.m123091J(context, g0Var, view, d1Var, 0);
        } else if (i == 9) {
            C96085n8.m123086E(g0Var, context, d1Var);
        } else if (i == 10) {
            C96085n8.m123102j(g0Var, context, d1Var);
        } else if (i == 17) {
            C96085n8.m123100h(g0Var, context, d1Var);
        } else if (i != 26) {
            if (i != 34) {
                if (i != 41) {
                    if (i != 49) {
                        if (i == 101) {
                            C96085n8.m123112t(context, g0Var);
                        } else if (i != 22) {
                            if (i != 23) {
                                switch (i) {
                                    case 12:
                                        C96085n8.m123082A(context, g0Var, d1Var);
                                        break;
                                    case 13:
                                        C96085n8.m123096d(context, g0Var, d1Var);
                                        break;
                                    case 14:
                                        C96085n8.m123115w(g0Var, context, d1Var);
                                        break;
                                    default:
                                        switch (i) {
                                            case 28:
                                                C96085n8.m123110r(context, g0Var);
                                                break;
                                            case 29:
                                                C96085n8.m123111s(context, g0Var);
                                                break;
                                            case 30:
                                                C96085n8.m123090I(context, g0Var, d1Var);
                                                break;
                                            default:
                                                switch (i) {
                                                    case 36:
                                                        C96085n8.m123109q(context, g0Var);
                                                        break;
                                                    case 37:
                                                        C96085n8.m123107o(context, g0Var);
                                                        break;
                                                    case 38:
                                                        C96085n8.m123106n(context, g0Var);
                                                        break;
                                                    case 39:
                                                        C96085n8.m123105m(context, g0Var);
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 43:
                                                            case 45:
                                                                break;
                                                            case 44:
                                                                C96085n8.m123085D(context, g0Var);
                                                                break;
                                                            case 46:
                                                                C96085n8.m123083B(context, g0Var);
                                                                break;
                                                        }
                                                }
                                        }
                                }
                            } else {
                                C96085n8.m123101i(g0Var, context, d1Var);
                            }
                        }
                    }
                    C96085n8.m123103k(g0Var, context, d1Var);
                } else {
                    C96085n8.m123118z(context, g0Var);
                }
            }
            C96085n8.m123108p(context, g0Var, (View) null);
        } else {
            C96085n8.m123084C(context, g0Var);
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$otherFeedClickIListener$1");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$otherFeedClickIListener$1");
        return true;
    }
}
