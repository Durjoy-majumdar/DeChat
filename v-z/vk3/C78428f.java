package vk3;

import com.tencent.p014mm.modelgetchatroommsg.C68111c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75871e;
import g62.C75875l;
import hk3.C76227e;
import java.util.List;

/* renamed from: vk3.f */
public class C78428f implements C68111c.C68114c {

    /* renamed from: a */
    public final /* synthetic */ long f229786a;

    /* renamed from: b */
    public final /* synthetic */ C75871e f229787b;

    /* renamed from: c */
    public final /* synthetic */ long f229788c;

    /* renamed from: d */
    public final /* synthetic */ C76227e.C32942b f229789d;

    /* renamed from: e */
    public final /* synthetic */ C78429g f229790e;

    public C78428f(C78429g gVar, long j, C75871e eVar, long j2, C76227e.C32942b bVar) {
        this.f229790e = gVar;
        this.f229786a = j;
        this.f229787b = eVar;
        this.f229788c = j2;
        this.f229789d = bVar;
    }

    /* renamed from: a */
    public void mo93626a(int i, List<C72963f4> list) {
        Class cls = C75700k0.class;
        if (i >= 0) {
            long j = this.f229786a;
            if (list.size() > 0) {
                j = list.get(0).getCreateTime();
            }
            if (this.f229787b.mo101217w(this.f229790e.f229791a, j) == null && list.size() < 18) {
                j = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).ky0(this.f229790e.f229791a, j, 18 - list.size());
            }
            if (j <= 0) {
                j = this.f229786a;
            }
            long j2 = j;
            Log.m105924i("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handleLoadTop#fetch] talker:" + this.f229790e.f229791a + " firstCreateTime:" + this.f229786a + " lastCreateTime:" + this.f229788c + " from:" + j2);
            C78429g gVar = this.f229790e;
            C75875l LE = ((C75700k0) C86709a0.m107533q(cls)).mo96095LE();
            C78429g gVar2 = this.f229790e;
            gVar.f229792b = ((C72972g4) LE).Pq0(gVar2.f229791a, j2, gVar2.f229795e, gVar2.f229797g + 18);
            this.f229789d.next();
            return;
        }
        this.f229790e.mo108376a(this.f229789d);
    }
}
