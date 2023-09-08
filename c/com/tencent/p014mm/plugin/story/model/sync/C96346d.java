package com.tencent.p014mm.plugin.story.model.sync;

import android.text.TextUtils;
import com.tencent.p014mm.autogen.events.SnsPermissionNotifyEvent;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import kw2.C99264e;
import kw2.C99265f;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.story.model.sync.d */
public final class C96346d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ SnsPermissionNotifyEvent f281775d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96346d(SnsPermissionNotifyEvent snsPermissionNotifyEvent) {
        super(0);
        this.f281775d = snsPermissionNotifyEvent;
    }

    public Object invoke() {
        SnsPermissionNotifyEvent snsPermissionNotifyEvent = this.f281775d;
        if ((snsPermissionNotifyEvent != null ? snsPermissionNotifyEvent.f107766d : null) != null) {
            SnsPermissionNotifyEvent.C40168a aVar = snsPermissionNotifyEvent.f107766d;
            if (aVar.f107767a && !TextUtils.isEmpty(aVar.f107769c)) {
                ContactSyncFetcher contactSyncFetcher = ContactSyncFetcher.f281758d;
                if (!contactSyncFetcher.mo134204k(this.f281775d.f107766d.f107769c)) {
                    SnsPermissionNotifyEvent.C40168a aVar2 = this.f281775d.f107766d;
                    if (!aVar2.f107770d) {
                        ContactSyncFetcher.f281759e.remove(aVar2.f107769c);
                    } else {
                        C99265f g = StoryCore.f281736t.mo134189g();
                        String str = this.f281775d.f107766d.f107769c;
                        C87412m.m108593f(str, "event.data.username");
                        C99264e jo = g.mo138646jo(str);
                        Map<String, C99264e> map = ContactSyncFetcher.f281759e;
                        C87412m.m108593f(map, "userStateMap");
                        map.put(this.f281775d.f107766d.f107769c, jo);
                    }
                    ContactSyncFetcher.m123592i(contactSyncFetcher);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
