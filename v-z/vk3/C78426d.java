package vk3;

import com.tencent.p014mm.modelgetchatroommsg.C68111c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import hk3.C76227e;
import java.util.List;

/* renamed from: vk3.d */
public class C78426d implements C68111c.C68114c {

    /* renamed from: a */
    public final /* synthetic */ C76227e.C32942b f229782a;

    /* renamed from: b */
    public final /* synthetic */ C78429g f229783b;

    public C78426d(C78429g gVar, C76227e.C32942b bVar) {
        this.f229783b = gVar;
        this.f229782a = bVar;
    }

    /* renamed from: a */
    public void mo93626a(int i, List<C72963f4> list) {
        if (i < 0 || list.size() <= 0) {
            this.f229783b.mo108376a(this.f229782a);
            return;
        }
        long j = this.f229783b.f229794d;
        C72963f4 f4Var = list.get(list.size() - 1);
        long b = this.f229783b.mo108377b(f4Var.getCreateTime());
        Log.m105924i("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handleLoadBottom] talker:" + this.f229783b.f229791a + " from:" + j + " to:" + b + " addMsg.CreateTime:" + f4Var.getCreateTime());
        C78429g gVar = this.f229783b;
        C75875l LE = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE();
        gVar.f229792b = ((C72972g4) LE).Pq0(this.f229783b.f229791a, j, b, Integer.MAX_VALUE);
        this.f229782a.next();
    }
}
