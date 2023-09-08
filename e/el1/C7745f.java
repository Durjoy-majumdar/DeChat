package el1;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$g;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorWhiteListUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import ok1.C62042e;
import sk1.C63947a;
import te3.C51745vv0;
import te3.C51946xa1;

/* renamed from: el1.f */
public final class C7745f implements MMFragmentActivity$$g {

    /* renamed from: a */
    public final /* synthetic */ C7741d f26241a;

    public C7745f(C7741d dVar) {
        this.f26241a = dVar;
    }

    /* renamed from: a */
    public final void mo5702a(int i, Intent intent) {
        List list = null;
        Serializable serializableExtra = intent != null ? intent.getSerializableExtra("KEY_PARAMS_CHOOSE_WHITE_LIST") : null;
        if (serializableExtra instanceof List) {
            list = (List) serializableExtra;
        }
        if (list != null) {
            C7741d dVar = this.f26241a;
            LinkedList<C51745vv0> linkedList = new LinkedList<>();
            C62042e.f176370a.mo87126w1(list, linkedList);
            C51946xa1 xa12 = dVar.f26214A.f140582f;
            if (xa12 != null) {
                xa12.f144560g = linkedList;
                dVar.mo8865g3();
                dVar.mo8866i3();
            }
            Log.m105924i("FinderLiveChargeWhiteListUIC", "live_charge_step101 onSelectWebListActivityResult liveChargeInfo:" + C63947a.f181274a.mo88724j(dVar.f26214A));
            AppCompatActivity activity = dVar.getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI");
            ((FinderLiveVisitorWhiteListUI) activity).mo3040O7();
        }
    }
}
