package rs1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import de3.C75367m;
import di0.C86299o;
import di3.C86312j;
import gy3.C87412m;
import jq3.C60905o;
import ke3.C88144b;
import kr0.C76630x0;
import pf1.C11920q;
import pf1.C62262d0;

/* renamed from: rs1.j6 */
public final class C13288j6 implements C75367m {

    /* renamed from: a */
    public final /* synthetic */ int f37715a;

    /* renamed from: b */
    public final /* synthetic */ String f37716b;

    /* renamed from: c */
    public final /* synthetic */ TextView f37717c;

    /* renamed from: d */
    public final /* synthetic */ String f37718d;

    /* renamed from: e */
    public final /* synthetic */ FinderJumpInfo f37719e;

    public C13288j6(int i, String str, TextView textView, String str2, FinderJumpInfo finderJumpInfo) {
        this.f37715a = i;
        this.f37716b = str;
        this.f37717c = textView;
        this.f37718d = str2;
        this.f37719e = finderJumpInfo;
    }

    /* renamed from: a */
    public final void mo12741a(String str) {
        int i = this.f37715a;
        if (i == 0) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f37716b);
            C88144b.m109791i(this.f37717c.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        } else if (i == 1) {
            C86299o oVar = new C86299o();
            oVar.f250930b = this.f37718d;
            oVar.f250934f = this.f37716b;
            oVar.f250939k = 1205;
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(this.f37717c.getContext(), oVar);
        } else if (i != 2) {
            Log.m105920e("MicroMsg.FinderLiveIncomeListUIC", "invalid actionType:" + this.f37715a);
        } else if (this.f37719e != null) {
            C62262d0 d0Var = C62262d0.f176978a;
            Context context = this.f37717c.getContext();
            C87412m.m108593f(context, "context");
            C62262d0.m73168c(d0Var, context, new C11920q(this.f37719e), 0, (C60905o) null, 8, (Object) null);
        } else {
            Log.m105920e("MicroMsg.FinderLiveIncomeListUIC", "invalid jumpInfo is null");
        }
    }
}
