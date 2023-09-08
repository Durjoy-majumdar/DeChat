package el1;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$g;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorWhiteListUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import sk1.C63947a;
import te3.C51946xa1;

/* renamed from: el1.e */
public final class C7744e implements MMFragmentActivity$$g {

    /* renamed from: a */
    public final /* synthetic */ C7741d f26240a;

    public C7744e(C7741d dVar) {
        this.f26240a = dVar;
    }

    /* renamed from: a */
    public final void mo5702a(int i, Intent intent) {
        byte[] byteArrayExtra;
        if (intent != null && (byteArrayExtra = intent.getByteArrayExtra("KEY_PARAMS_WHITE_LIST")) != null) {
            C7741d dVar = this.f26240a;
            C51946xa1 xa12 = new C51946xa1();
            xa12.parseFrom(byteArrayExtra);
            C51946xa1 xa13 = dVar.f26214A.f140582f;
            if (xa13 != null) {
                xa13.f144559f = xa12.f144559f;
                xa13.f144557d = xa12.f144557d;
                xa13.f144558e = xa12.f144558e;
            }
            dVar.mo8865g3();
            dVar.mo8866i3();
            Log.m105924i("FinderLiveChargeWhiteListUIC", "live_charge_step100 onActivityResult liveChargeInfo:" + C63947a.f181274a.mo88724j(dVar.f26214A));
            AppCompatActivity activity = dVar.getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI");
            ((FinderLiveVisitorWhiteListUI) activity).mo3040O7();
        }
    }
}
