package sb2;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import hb2.C59822f;
import hb2.C59833q;
import java.util.LinkedList;
import o40.C61926c;
import p910lj.C76701a;
import te3.C64488kb1;

/* renamed from: sb2.v0 */
public final class C63867v0 implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ C63849t0 f181050d;

    /* renamed from: e */
    public final /* synthetic */ C59822f f181051e;

    /* renamed from: f */
    public final /* synthetic */ C64488kb1 f181052f;

    /* renamed from: g */
    public final /* synthetic */ int f181053g;

    public C63867v0(C63849t0 t0Var, C59822f fVar, C64488kb1 kb12, int i) {
        this.f181050d = t0Var;
        this.f181051e = fVar;
        this.f181052f = kb12;
        this.f181053g = i;
    }

    public final void mmOnActivityResult(int i, int i2, Intent intent) {
        if (2 == i && i2 == -1) {
            C76701a.makeText((Context) this.f181050d.getContext(), (CharSequence) this.f181050d.getContext().getResources().getString(C0966R.string.j6i), 0).show();
            FinderObject d = C59822f.f170752A.mo84779d(this.f181051e);
            if (d != null) {
                C63849t0 t0Var = this.f181050d;
                C64488kb1 kb12 = this.f181052f;
                C59822f fVar = this.f181051e;
                int i3 = this.f181053g;
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
                sb.append("share mv to sns success ");
                sb.append(C61926c.m72691p(d.f164794id));
                sb.append(' ');
                String str3 = d.objectNonceId;
                if (str3 != null) {
                    str2 = str3;
                }
                sb.append(str2);
                Log.m105924i("MicroMsg.Mv.MusicMvShareUIC", sb.toString());
                C59833q.f170832a.mo84801m(t0Var.getContext(), kb12, fVar, 2, 1, "", i3);
            }
        }
    }
}
