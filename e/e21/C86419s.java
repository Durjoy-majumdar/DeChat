package e21;

import com.tencent.p014mm.modelavatar.C68082g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import e21.C116645t;
import eb0.C75597w2;
import p196ln.C76705f;
import p196ln.C76706g;
import p196ln.C76708i;

/* renamed from: e21.s */
public class C86419s implements C75597w2.C31525a {

    /* renamed from: a */
    public final /* synthetic */ long f251208a;

    /* renamed from: b */
    public final /* synthetic */ C116645t.C116646a f251209b;

    /* renamed from: c */
    public final /* synthetic */ C116645t.C116647b f251210c;

    public C86419s(C116645t tVar, long j, C116645t.C116646a aVar, C116645t.C116647b bVar) {
        this.f251208a = j;
        this.f251209b = aVar;
        this.f251210c = bVar;
    }

    /* renamed from: a */
    public void mo1109a(String str, boolean z) {
        if (z) {
            Log.m105926v("MicroMsg.CollectPayerMsgAdapter", "getContact suc; cost=" + (Util.nowMilliSecond() - this.f251208a) + " ms");
            ((C76708i) C86312j.m106911c(C76708i.class)).mo106848yE(str, 3);
            ((C68082g) ((C76706g) C86312j.m106911c(C76706g.class)).mo106847uz()).mo93582i(str);
        } else {
            Log.m105928w("MicroMsg.CollectPayerMsgAdapter", "getContact failed");
        }
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(this.f251209b.f349769B, this.f251210c.f349753d);
    }
}
