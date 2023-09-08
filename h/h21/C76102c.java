package h21;

import com.tencent.p014mm.p136ui.base.MMPullDownView;
import com.tencent.p014mm.plugin.collect.p038ui.CollectBillListUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: h21.c */
public class C76102c implements MMPullDownView.C73179f {

    /* renamed from: d */
    public final /* synthetic */ CollectBillListUI f223018d;

    public C76102c(CollectBillListUI collectBillListUI) {
        this.f223018d = collectBillListUI;
    }

    /* renamed from: C7 */
    public boolean mo64409C7() {
        Log.m105919d("MicroMsg.CollectBillListUI", "bottomLoad, isLoading: %s, isFinish: %s", Boolean.valueOf(this.f223018d.f197759n), Boolean.valueOf(this.f223018d.f197761p));
        CollectBillListUI collectBillListUI = this.f223018d;
        if (collectBillListUI.f197759n || collectBillListUI.f197761p) {
            return true;
        }
        collectBillListUI.f197756h.setBottomViewVisible(true);
        this.f223018d.mo94676H7();
        return false;
    }
}
