package oi0;

import com.tencent.p014mm.sdk.platformtools.Log;
import es0.C58801k;
import f40.C86709a0;
import ob0.C117747y;
import oi0.C62022m;
import te3.C49335eu3;
import te3.C50644o72;
import te3.C64716sw;

/* renamed from: oi0.l */
public class C62020l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f176309d;

    /* renamed from: e */
    public final /* synthetic */ C64716sw f176310e;

    /* renamed from: f */
    public final /* synthetic */ long f176311f;

    /* renamed from: g */
    public final /* synthetic */ int f176312g;

    /* renamed from: h */
    public final /* synthetic */ long f176313h;

    /* renamed from: i */
    public final /* synthetic */ C62022m.C62023a f176314i;

    /* renamed from: oi0.l$a */
    public class C62021a extends C62022m {
        public C62021a(int i, C64716sw swVar, long j, int i2) {
            super(i, swVar, j, i2);
        }

        /* renamed from: h */
        public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
            C50644o72 o722 = (C50644o72) eu32;
            if (!C86709a0.m107522a()) {
                Log.m105920e("MicroMsg.Recommend.CgiGetRecommendWxa", "account nor ready");
                return;
            }
            long currentTimeMillis = (System.currentTimeMillis() / 1000) - C62020l.this.f176313h;
            Log.m105925i("MicroMsg.Recommend.CgiGetRecommendWxa", "CgiGetRecommendWxa errType:%d, errCode:%d, errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i != 0 || i2 != 0) {
                Log.m105920e("MicroMsg.Recommend.CgiGetRecommendWxa", "fetch fail");
                C62022m.C62023a aVar = C62020l.this.f176314i;
                if (aVar != null) {
                    aVar.mo86898a();
                }
                C58801k.m68583a(currentTimeMillis, (C50644o72) null);
            } else if (o722 == null) {
                Log.m105920e("MicroMsg.Recommend.CgiGetRecommendWxa", "response is null");
                C62022m.C62023a aVar2 = C62020l.this.f176314i;
                if (aVar2 != null) {
                    aVar2.mo86898a();
                }
                C58801k.m68583a(currentTimeMillis, (C50644o72) null);
            } else if (C62020l.this.f176314i != null) {
                Log.m105920e("MicroMsg.Recommend.CgiGetRecommendWxa", "get data success");
                C62020l.this.f176314i.mo86899b(o722);
                C58801k.m68583a(currentTimeMillis, o722);
            }
        }
    }

    public C62020l(int i, C64716sw swVar, long j, int i2, long j2, C62022m.C62023a aVar) {
        this.f176309d = i;
        this.f176310e = swVar;
        this.f176311f = j;
        this.f176312g = i2;
        this.f176313h = j2;
        this.f176314i = aVar;
    }

    public void run() {
        new C62021a(this.f176309d, this.f176310e, this.f176311f, this.f176312g).mo9225i();
    }
}
