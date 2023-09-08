package com.tencent.p014mm.plugin.fts.p059ui;

import android.content.Context;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39630m0;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.SearchClickBizItemEvent;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import kv1.C99260q;
import kv1.C99261r;
import p420ur.C65465l;
import pv1.C22019b;
import te3.C50044jw;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS})
/* renamed from: com.tencent.mm.plugin.fts.ui.g0 */
public class C18848g0 extends C86301e implements C0123n0, C99261r {
    public C39630m0 getViewModelStore() {
        return ((C65465l) C86312j.m106911c(C65465l.class)).f188387d.f152776f;
    }

    /* renamed from: hN */
    public void mo23817hN(C22019b bVar) {
        int i = bVar.f62323a;
        if (i == 4) {
            SearchClickBizItemEvent searchClickBizItemEvent = new SearchClickBizItemEvent();
            SearchClickBizItemEvent.C17690a aVar = searchClickBizItemEvent.f48124d;
            C50044jw jwVar = new C50044jw();
            jwVar.f136356e = bVar.mo35132d();
            jwVar.f136355d = 5;
            jwVar.f136357f = bVar.f62331i;
            aVar.f48125a = jwVar;
            searchClickBizItemEvent.publish();
        } else if (i == 9) {
            SearchClickBizItemEvent searchClickBizItemEvent2 = new SearchClickBizItemEvent();
            SearchClickBizItemEvent.C17690a aVar2 = searchClickBizItemEvent2.f48124d;
            C50044jw jwVar2 = new C50044jw();
            jwVar2.f136356e = bVar.mo35132d();
            jwVar2.f136355d = 19;
            jwVar2.f136357f = bVar.f62331i;
            aVar2.f48125a = jwVar2;
            searchClickBizItemEvent2.publish();
        } else if (i == 17) {
            SearchClickBizItemEvent searchClickBizItemEvent3 = new SearchClickBizItemEvent();
            SearchClickBizItemEvent.C17690a aVar3 = searchClickBizItemEvent3.f48124d;
            C50044jw jwVar3 = new C50044jw();
            jwVar3.f136356e = bVar.mo35132d();
            jwVar3.f136355d = 31;
            jwVar3.f136357f = bVar.f62331i;
            aVar3.f48125a = jwVar3;
            searchClickBizItemEvent3.publish();
        }
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
    }

    public void onAccountReleased(Context context) {
        Class cls = C99260q.class;
        super.onAccountReleased(context);
        ((C99260q) C86312j.m106911c(cls)).mo128745Ry(16);
        ((C99260q) C86312j.m106911c(cls)).mo128745Ry(32);
        ((C99260q) C86312j.m106911c(cls)).mo128745Ry(48);
        ((C99260q) C86312j.m106911c(cls)).mo128745Ry(64);
        ((C99260q) C86312j.m106911c(cls)).mo128745Ry(112);
        ((C99260q) C86312j.m106911c(cls)).mo128745Ry(4112);
        ((C99260q) C86312j.m106911c(cls)).mo128745Ry(4128);
        ((C99260q) C86312j.m106911c(cls)).mo128745Ry(4176);
        ((C99260q) C86312j.m106911c(cls)).mo128745Ry(8192);
        ((C99260q) C86312j.m106911c(cls)).mo128745Ry(160);
        ((C99260q) C86312j.m106911c(cls)).mo128745Ry(256);
    }

    public void rv0(String str, String str2, String str3, int i) {
        ((C119157j) C119157j.f356862d).mo183876g(new g0$$a(str, str2, str3, i), "FTSBizClickFlow");
    }
}
