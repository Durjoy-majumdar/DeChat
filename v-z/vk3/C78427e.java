package vk3;

import com.tencent.p014mm.modelgetchatroommsg.C68111c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import f40.C86709a0;
import f62.C75700k0;
import hk3.C76227e;
import java.util.List;

/* renamed from: vk3.e */
public class C78427e implements C68111c.C68114c {

    /* renamed from: a */
    public final /* synthetic */ C76227e.C32942b f229784a;

    /* renamed from: b */
    public final /* synthetic */ C78429g f229785b;

    public C78427e(C78429g gVar, C76227e.C32942b bVar) {
        this.f229785b = gVar;
        this.f229784a = bVar;
    }

    /* renamed from: a */
    public void mo93626a(int i, List<C72963f4> list) {
        if (i < 0 || list.size() <= 0) {
            Log.m105920e("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handleLoadBottom] null == seqBlock ret:" + i);
            this.f229785b.mo108376a(this.f229784a);
            return;
        }
        long j = this.f229785b.f229794d;
        long b = this.f229785b.mo108377b(list.get(list.size() - 1).getCreateTime());
        Log.m105924i("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handleLoadBottom] talker:" + this.f229785b.f229791a + " from:" + j + " to:" + b + " size:" + list.size());
        this.f229785b.f229792b = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).Pq0(this.f229785b.f229791a, j, b, Integer.MAX_VALUE);
        this.f229784a.next();
    }
}
