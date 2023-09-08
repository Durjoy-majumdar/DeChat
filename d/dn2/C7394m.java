package dn2;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ke3.C88144b;
import rx3.C13598b0;

/* renamed from: dn2.m */
public final class C7394m extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C7373a f25533d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7394m(C7373a aVar) {
        super(1);
        this.f25533d = aVar;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, LocaleUtil.ITALIAN);
        Intent intent = new Intent();
        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 8);
        intent.putExtra("select_is_ret", true);
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("image_path", str);
        intent.putExtra("Retr_Msg_Type", 0);
        C7373a aVar = this.f25533d;
        C88144b.m109803u(aVar.f25505a, ".ui.transmit.SelectConversationUI", intent, 1, new C75417l(aVar, str));
        return C13598b0.f38549a;
    }
}
