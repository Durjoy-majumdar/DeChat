package oi0;

import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C47350c;
import ob0.C89132b;
import te3.C50644o72;
import te3.C50854po;
import te3.C64571n72;
import te3.C64716sw;

/* renamed from: oi0.m */
public class C62022m extends C89132b<C50644o72> {

    /* renamed from: oi0.m$a */
    public interface C62023a {
        /* renamed from: a */
        void mo86898a();

        /* renamed from: b */
        void mo86899b(C50644o72 o722);
    }

    public C62022m(int i, C64716sw swVar, long j, int i2) {
        Log.m105925i("MicroMsg.Recommend.CgiGetRecommendWxa", "pageNum:%d, filterType:%d, sessionId:%d, strategy:%d", Integer.valueOf(i), 5, Long.valueOf(j), Integer.valueOf(i2));
        C47350c.C47352b bVar = new C47350c.C47352b();
        C64571n72 n722 = new C64571n72();
        n722.f184438d = i;
        n722.f184439e = 5;
        n722.f184440f = new C50854po();
        n722.f184441g = j;
        n722.f184442h = swVar;
        n722.f184443i = i2;
        bVar.f127066a = n722;
        bVar.f127067b = new C50644o72();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxabusiness/getrecommendwxa";
        bVar.f127069d = 2778;
        mo123453j(bVar.mo72403a());
    }
}
