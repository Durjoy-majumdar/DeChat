package zk1;

import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.Toast;
import c30.C104289g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.LiveAudienceCommodityLogStruct;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import gy3.C87412m;
import nj3.C76912y0;
import rx3.C36570n;
import z04.C112551y;
import zc1.C66785b;

/* renamed from: zk1.o */
public final class C16272o implements MMSwitchBtn.C7041b {

    /* renamed from: a */
    public final /* synthetic */ C16229h f43563a;

    public C16272o(C16229h hVar) {
        this.f43563a = hVar;
    }

    public final void onStatusChange(boolean z) {
        if (!z || !this.f43563a.mo14767j3().f220433y) {
            ((RelativeLayout) ((C36570n) this.f43563a.f43499w).getValue()).setVisibility(z ? 0 : 8);
            C104289g gVar = new C104289g();
            gVar.put("finderuin", C66785b.f191882e.mo90662O5());
            gVar.mo145953n("result", z ? 1 : 2);
            String gVar2 = gVar.toString();
            C87412m.m108593f(gVar2, "paramsJson.toString()");
            LiveAudienceCommodityLogStruct liveAudienceCommodityLogStruct = new LiveAudienceCommodityLogStruct();
            liveAudienceCommodityLogStruct.mo76270s("click_reserve_wtih_coupon_switch");
            liveAudienceCommodityLogStruct.mo76271t(C112551y.m153814n(gVar2, ",", ";", false));
            liveAudienceCommodityLogStruct.mo86054n();
            return;
        }
        this.f43563a.mo14763e3().setCheck(false);
        Toast makeText = C76912y0.makeText((Context) this.f43563a.getContext(), (CharSequence) this.f43563a.getContext().getResources().getString(C0966R.string.mr7), 0);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }
}
