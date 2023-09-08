package rd2;

import android.content.Intent;
import com.tencent.p014mm.plugin.order.p889ui.MallOrderDetailInfoUI;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import nj3.C76879j;

/* renamed from: rd2.d */
public class C77513d implements C76879j.C11180n {

    /* renamed from: a */
    public final /* synthetic */ MallOrderDetailInfoUI f226014a;

    public C77513d(MallOrderDetailInfoUI mallOrderDetailInfoUI) {
        this.f226014a = mallOrderDetailInfoUI;
    }

    /* renamed from: j */
    public void mo782j(int i) {
        if (i == 0) {
            MallOrderDetailInfoUI mallOrderDetailInfoUI = this.f226014a;
            String str = mallOrderDetailInfoUI.f202182h.f202077f;
            Intent intent = new Intent();
            intent.putExtra("rawUrl", str);
            intent.putExtra("showShare", false);
            intent.putExtra("pay_channel", 1);
            C75228t.m90217J(mallOrderDetailInfoUI, intent);
        }
    }
}
