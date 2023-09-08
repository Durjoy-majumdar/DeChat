package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C39993q1;
import cm1.C55011a;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderMsgContract;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.TouchableLayout;
import gy3.C87412m;
import jq3.C60898l;
import jq3.C60905o;
import kotlin.Metadata;
import p749xh.C66276va;
import uo3.C78253a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$MsgViewCallback$initView$6", "Ljq3/l$c;", "Ljq3/o;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$initView$6 */
public final class FinderMsgContract$MsgViewCallback$initView$6 implements C60898l.C9503c<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ FinderMsgContract.MsgViewCallback f160421d;

    public FinderMsgContract$MsgViewCallback$initView$6(FinderMsgContract.MsgViewCallback msgViewCallback) {
        this.f160421d = msgViewCallback;
    }

    /* renamed from: n */
    public boolean mo759n(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g((C60905o) zVar, "holder");
        int c6 = i - ((C60898l) eVar).mo85796c6();
        if (c6 < 0 || c6 >= this.f160421d.f160389f.f160381i.size()) {
            return true;
        }
        C55011a aVar = this.f160421d.f160389f.f160381i.get(c6);
        C87412m.m108593f(aVar, "presenter.getData()[fixPos]");
        C55011a aVar2 = aVar;
        if (aVar2 instanceof C39993q1) {
            return true;
        }
        C66276va vaVar = aVar2.f154465d;
        String str = this.f160421d.f160387d;
        Log.m105924i(str, "onLongClick " + c6 + " id:" + vaVar.field_id + " commentId:" + vaVar.field_commentId);
        FinderMsgContract.MsgViewCallback msgViewCallback = this.f160421d;
        C78253a aVar3 = msgViewCallback.f160395o;
        if (aVar3 != null) {
            aVar3.mo108266a();
            C78253a aVar4 = msgViewCallback.f160395o;
            if (aVar4 != null) {
                aVar4.mo108273h(view, new FinderMsgContract$MsgViewCallback$onLongClick$1(msgViewCallback, view), new FinderMsgContract$MsgViewCallback$onLongClick$2(msgViewCallback, vaVar, c6), TouchableLayout.f24959d, TouchableLayout.f24960e);
                return true;
            }
            C87412m.m108603p("popupMenu");
            throw null;
        }
        C87412m.m108603p("popupMenu");
        throw null;
    }
}
