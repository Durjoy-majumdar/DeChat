package com.tencent.p014mm.plugin.finder.live.view;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import cj1.C54795n5;
import cl1.C55001u;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import java.util.LinkedList;
import kotlin.Metadata;
import rx3.C13598b0;
import te3.C51790w61;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/live/view/GetLuckMoneyCallback$onCgiBack$1$2$1", "Landroid/os/ResultReceiver;", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.GetLuckMoneyCallback$onCgiBack$1$2$1 */
public final class GetLuckMoneyCallback$onCgiBack$1$2$1 extends ResultReceiver {

    /* renamed from: d */
    public final /* synthetic */ C56032b f159837d;

    /* renamed from: e */
    public final /* synthetic */ LinkedList<C51790w61> f159838e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetLuckMoneyCallback$onCgiBack$1$2$1(C56032b bVar, LinkedList<C51790w61> linkedList, Handler handler) {
        super(handler);
        this.f159837d = bVar;
        this.f159838e = linkedList;
    }

    public void onReceiveResult(int i, Bundle bundle) {
        Class cls = C55001u.class;
        C56032b.Companion.getClass();
        String access$getTAG$cp = C56032b.TAG;
        Log.m105924i(access$getTAG$cp, "openLuckyMoney result:" + i);
        String str = null;
        if (i == -1) {
            C54795n5 finderLiveAssistant = this.f159837d.getFinderLiveAssistant();
            if (finderLiveAssistant != null) {
                long j = ((C55001u) this.f159837d.business(cls)).f154420q.f182392d;
                long j2 = ((C55001u) this.f159837d.business(cls)).f154416j;
                String str2 = ((C55001u) this.f159837d.business(cls)).f154423t;
                byte[] bArr = ((C55001u) this.f159837d.business(cls)).f154417n;
                C51790w61 w612 = this.f159838e.get(0);
                finderLiveAssistant.mo75758z(j, j2, str2, bArr, w612 != null ? w612.f143878d : null);
            }
            C56032b bVar = this.f159837d;
            C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_RECEIVE_LUCKY_MONEY;
            Bundle bundle2 = new Bundle();
            C51790w61 w613 = this.f159838e.get(0);
            if (w613 != null) {
                str = w613.f143878d;
            }
            bundle2.putString("PARAM_FINDER_LIVE_LUCKY_MONEY_SEND_ID", str);
            C13598b0 b0Var = C13598b0.f38549a;
            bVar.statusChange(bVar2, bundle2);
        } else if (i == 1) {
            C56032b bVar3 = this.f159837d;
            C58124b.C58125b bVar4 = C58124b.C58125b.FINDER_LIVE_RECEIVE_LUCKY_MONEY;
            Bundle bundle3 = new Bundle();
            C51790w61 w614 = this.f159838e.get(0);
            if (w614 != null) {
                str = w614.f143878d;
            }
            bundle3.putString("PARAM_FINDER_LIVE_LUCKY_MONEY_SEND_ID", str);
            C13598b0 b0Var2 = C13598b0.f38549a;
            bVar3.statusChange(bVar4, bundle3);
        }
    }
}
