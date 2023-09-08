package sb2;

import android.app.Activity;
import android.content.Intent;
import android.util.Pair;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import hb2.C59822f;
import hb2.C59833q;
import java.util.LinkedList;
import o40.C61926c;
import te3.C64488kb1;

/* renamed from: sb2.w0 */
public final class C63871w0 implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ C59822f f181057d;

    /* renamed from: e */
    public final /* synthetic */ C63849t0 f181058e;

    /* renamed from: f */
    public final /* synthetic */ C64488kb1 f181059f;

    /* renamed from: g */
    public final /* synthetic */ int f181060g;

    public C63871w0(C59822f fVar, C63849t0 t0Var, C64488kb1 kb12, int i) {
        this.f181057d = fVar;
        this.f181058e = t0Var;
        this.f181059f = kb12;
        this.f181060g = i;
    }

    public final void mmOnActivityResult(int i, int i2, Intent intent) {
        FinderObject d;
        if (i == 1 && i2 == -1 && (d = C59822f.f170752A.mo84779d(this.f181057d)) != null) {
            C63849t0 t0Var = this.f181058e;
            C64488kb1 kb12 = this.f181059f;
            C59822f fVar = this.f181057d;
            int i3 = this.f181060g;
            LinkedList linkedList = new LinkedList();
            String p = C61926c.m72691p(d.f164794id);
            String str = d.objectNonceId;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            linkedList.add(new Pair(p, str));
            ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Tr0(linkedList, false);
            StringBuilder sb = new StringBuilder();
            sb.append("share mv success ");
            sb.append(C61926c.m72691p(d.f164794id));
            sb.append(' ');
            String str3 = d.objectNonceId;
            if (str3 != null) {
                str2 = str3;
            }
            sb.append(str2);
            Log.m105924i("MicroMsg.Mv.MusicMvShareUIC", sb.toString());
            String listToString = Util.listToString(intent.getStringArrayListExtra("SendMsgUsernames"), ";");
            C59833q qVar = C59833q.f170832a;
            Activity context = t0Var.getContext();
            C87412m.m108593f(listToString, "userListStr");
            qVar.mo84801m(context, kb12, fVar, 2, 2, listToString, i3);
        }
    }
}
