package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import cm1.C55036w0;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLiveTagConstract;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedList;
import jq3.C60898l;
import jq3.C60905o;
import kotlin.Metadata;
import pt1.C35640b;
import rx3.C36570n;
import sx3.C110818d0;
import te3.C64848y91;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderLiveTagConstract$Presenter$onAttach$2$1", "Ljq3/l$b;", "Ljq3/o;", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract$Presenter$onAttach$2$1 */
public final class FinderLiveTagConstract$Presenter$onAttach$2$1 implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveTagConstract.Presenter f160369d;

    public FinderLiveTagConstract$Presenter$onAttach$2$1(FinderLiveTagConstract.Presenter presenter) {
        this.f160369d = presenter;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        LinkedList<C64848y91> linkedList;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g((C60905o) zVar, "holder");
        FinderLiveTagConstract.Presenter presenter = this.f160369d;
        int i2 = FinderLiveTagConstract.Presenter.f160357i;
        presenter.getClass();
        Log.m105924i("FinderLiveTagConstract.Presenter", "selected tagIndex:" + i);
        FinderLiveTagConstract.ViewCallback viewCallback = presenter.f160362h;
        if (viewCallback != null) {
            Intent intent = new Intent();
            intent.setClass(viewCallback.f160363d, (Class) ((C36570n) C35640b.f95309z).getValue());
            intent.putExtra("KEY_HAS_NEXT_ACTION", presenter.f160359e);
            C0740i2 i2Var = (C0740i2) C110818d0.m150917O(presenter.f160358d, i);
            byte[] bArr = null;
            C64848y91 y912 = (i2Var == null || !(i2Var instanceof C55036w0)) ? null : ((C55036w0) i2Var).f154513d;
            StringBuilder sb = new StringBuilder();
            sb.append("tagIndex:");
            sb.append(i);
            sb.append(", selectTag:");
            sb.append(y912 != null ? y912.f186454e : null);
            sb.append(", selectTag.subList:");
            sb.append((y912 == null || (linkedList = y912.f186455f) == null) ? null : Integer.valueOf(linkedList.size()));
            Log.m105924i("FinderLiveTagConstract.Presenter", sb.toString());
            if (y912 != null) {
                bArr = y912.toByteArray();
            }
            intent.putExtra("KEY_TAG_INFO", bArr);
            viewCallback.f160363d.startActivityForResult(intent, 1);
        }
    }
}
