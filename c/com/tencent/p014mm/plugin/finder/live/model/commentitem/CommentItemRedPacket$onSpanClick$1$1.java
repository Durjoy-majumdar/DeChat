package com.tencent.p014mm.plugin.finder.live.model.commentitem;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import cj1.C54795n5;
import cj1.C54820t;
import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import kotlin.Metadata;
import rx3.C13598b0;
import te3.C51790w61;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemRedPacket$onSpanClick$1$1", "Landroid/os/ResultReceiver;", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.model.commentitem.CommentItemRedPacket$onSpanClick$1$1 */
public final class CommentItemRedPacket$onSpanClick$1$1 extends ResultReceiver {

    /* renamed from: d */
    public final /* synthetic */ CommentItemRedPacket f15092d;

    /* renamed from: e */
    public final /* synthetic */ C51790w61 f15093e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentItemRedPacket$onSpanClick$1$1(CommentItemRedPacket commentItemRedPacket, C51790w61 w612, Handler handler) {
        super(handler);
        this.f15092d = commentItemRedPacket;
        this.f15093e = w612;
    }

    public void onReceiveResult(int i, Bundle bundle) {
        Class cls = C55001u.class;
        Log.m105924i("Finder.LiveCommentPlugin", "openLuckyMoney result:" + i);
        if (i == -1) {
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            finderLiveService.getClass();
            C54795n5 n5Var = FinderLiveService.f159396y;
            if (n5Var != null) {
                ((C54820t) n5Var).mo75758z(((C55001u) this.f15092d.f15089i.mo71262a(cls)).f154420q.f182392d, ((C55001u) this.f15092d.f15089i.mo71262a(cls)).f154416j, ((C55001u) this.f15092d.f15089i.mo71262a(cls)).f154423t, ((C55001u) this.f15092d.f15089i.mo71262a(cls)).f154417n, this.f15093e.f143878d);
            }
            finderLiveService.getClass();
            C56032b bVar = FinderLiveService.f159379g;
            if (bVar != null) {
                C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_RECEIVE_LUCKY_MONEY;
                Bundle bundle2 = new Bundle();
                bundle2.putString("PARAM_FINDER_LIVE_LUCKY_MONEY_SEND_ID", this.f15093e.f143878d);
                C13598b0 b0Var = C13598b0.f38549a;
                bVar.statusChange(bVar2, bundle2);
            }
        } else if (i == 1) {
            FinderLiveService.f159376d.getClass();
            C56032b bVar3 = FinderLiveService.f159379g;
            if (bVar3 != null) {
                C58124b.C58125b bVar4 = C58124b.C58125b.FINDER_LIVE_RECEIVE_LUCKY_MONEY;
                Bundle bundle3 = new Bundle();
                bundle3.putString("PARAM_FINDER_LIVE_LUCKY_MONEY_SEND_ID", this.f15093e.f143878d);
                C13598b0 b0Var2 = C13598b0.f38549a;
                bVar3.statusChange(bVar4, bundle3);
            }
        }
    }
}
