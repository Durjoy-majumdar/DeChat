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

/* renamed from: vk3.c */
public class C78425c implements C68111c.C68114c {

    /* renamed from: a */
    public final /* synthetic */ C76227e.C32942b f229780a;

    /* renamed from: b */
    public final /* synthetic */ C78429g f229781b;

    public C78425c(C78429g gVar, C76227e.C32942b bVar) {
        this.f229781b = gVar;
        this.f229780a = bVar;
    }

    /* renamed from: a */
    public void mo93626a(int i, List<C72963f4> list) {
        if (i < 0 || list.size() <= 0) {
            this.f229781b.mo108376a(this.f229780a);
            return;
        }
        long c = this.f229781b.mo108378c();
        long d = this.f229781b.mo108379d();
        Log.m105924i("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handleBottomAfterEnter] talker:" + this.f229781b.f229791a + " from:" + c + " to:" + d);
        C78429g gVar = this.f229781b;
        C75875l LE = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE();
        gVar.f229792b = ((C72972g4) LE).Pq0(this.f229781b.f229791a, c, d, 18);
        this.f229780a.next();
    }
}
