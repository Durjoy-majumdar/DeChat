package com.tencent.p014mm.plugin;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.JSApiOpenSpecificViewEvent;
import com.tencent.p014mm.plugin.finder.p056ui.FinderBlackListUI;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import kotlin.Metadata;
import z04.C112551y;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/FinderCommonBaseFeatureService$openSpecificViewEvent$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/JSApiOpenSpecificViewEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.FinderCommonBaseFeatureService$openSpecificViewEvent$1 */
public final class FinderCommonBaseFeatureService$openSpecificViewEvent$1 extends IListener<JSApiOpenSpecificViewEvent> {
    public FinderCommonBaseFeatureService$openSpecificViewEvent$1(C40008f fVar) {
        super(fVar);
    }

    public boolean callback(IEvent iEvent) {
        JSApiOpenSpecificViewEvent jSApiOpenSpecificViewEvent = (JSApiOpenSpecificViewEvent) iEvent;
        C87412m.m108594g(jSApiOpenSpecificViewEvent, "event");
        if (C112551y.m153809i(jSApiOpenSpecificViewEvent.f107614d.f107617b, "channel/contact_setting", true)) {
            if (!Util.isNullOrNil(C66785b.f191882e.mo90662O5())) {
                Intent intent = new Intent();
                intent.putExtra("key_from_comment_scene", 39);
                intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76836bn(context, intent, 20, 2);
            } else {
                jSApiOpenSpecificViewEvent.f107615e.f107619b = true;
            }
            jSApiOpenSpecificViewEvent.f107615e.f107620c = true;
            return true;
        } else if (!C112551y.m153809i(jSApiOpenSpecificViewEvent.f107614d.f107617b, "channel/black_list", true)) {
            return false;
        } else {
            if (!Util.isNullOrNil(C66785b.f191882e.mo90662O5())) {
                Intent intent2 = new Intent();
                intent2.setClass(MMApplicationContext.getContext(), FinderBlackListUI.class);
                jSApiOpenSpecificViewEvent.f107615e.f107618a = intent2;
            } else {
                jSApiOpenSpecificViewEvent.f107615e.f107619b = true;
            }
            jSApiOpenSpecificViewEvent.f107615e.f107620c = true;
            return true;
        }
    }
}
