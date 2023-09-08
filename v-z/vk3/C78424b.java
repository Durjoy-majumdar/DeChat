package vk3;

import com.tencent.p014mm.modelgetchatroommsg.C68111c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import f40.C86709a0;
import f62.C75700k0;
import hk3.C76227e;
import java.util.List;

/* renamed from: vk3.b */
public class C78424b implements C68111c.C68114c {

    /* renamed from: a */
    public final /* synthetic */ long f229776a;

    /* renamed from: b */
    public final /* synthetic */ long f229777b;

    /* renamed from: c */
    public final /* synthetic */ C76227e.C32942b f229778c;

    /* renamed from: d */
    public final /* synthetic */ C78429g f229779d;

    public C78424b(C78429g gVar, long j, long j2, C76227e.C32942b bVar) {
        this.f229779d = gVar;
        this.f229776a = j;
        this.f229777b = j2;
        this.f229778c = bVar;
    }

    /* renamed from: a */
    public void mo93626a(int i, List<C72963f4> list) {
        if (i < 0 || list.size() <= 0) {
            this.f229779d.mo108376a(this.f229778c);
            return;
        }
        Log.m105924i("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handlePosition] talker:" + this.f229779d.f229791a + " fromCreateTime:" + this.f229776a + " toCreateTime:" + this.f229777b + " addSize:" + list.size());
        long j = this.f229777b;
        if (list.size() <= 18) {
            j = this.f229779d.mo108377b(list.get(list.size() - 1).getCreateTime());
        }
        C78429g gVar = this.f229779d;
        C72972g4 g4Var = (C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE();
        gVar.f229792b = g4Var.Pq0(this.f229779d.f229791a, this.f229776a, j, 36);
        this.f229778c.next();
    }
}
