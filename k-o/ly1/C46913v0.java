package ly1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import qy1.C47890b;
import sw1.C48478n;
import sw1.C48484q;
import sx3.C36907w;
import vx1.C53037a;
import vx1.C53038b;
import vx1.C53039c;
import w10.C53065b;

/* renamed from: ly1.v0 */
public final class C46913v0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List<C48478n.C13793h> f126138d;

    /* renamed from: e */
    public final /* synthetic */ String f126139e;

    /* renamed from: f */
    public final /* synthetic */ C46914w0 f126140f;

    /* renamed from: g */
    public final /* synthetic */ ArrayList<C53037a> f126141g;

    /* renamed from: h */
    public final /* synthetic */ int f126142h;

    /* renamed from: i */
    public final /* synthetic */ C48478n.C48481f f126143i;

    public C46913v0(List<? extends C48478n.C13793h> list, String str, C46914w0 w0Var, ArrayList<C53037a> arrayList, int i, C48478n.C48481f fVar) {
        this.f126138d = list;
        this.f126139e = str;
        this.f126140f = w0Var;
        this.f126141g = arrayList;
        this.f126142h = i;
        this.f126143i = fVar;
    }

    public final void run() {
        Class cls = C48484q.class;
        String i = C86709a0.m107523b().mo121111i();
        C53038b Jx = ((C48484q) C86312j.m106911c(cls)).mo66103Jx();
        C87412m.m108593f(i, "userId");
        ArrayList arrayList = (ArrayList) ((C53039c) Jx).mo73747Yt(i);
        int size = arrayList.size();
        Log.m105918d("MicroMsg.MiniGameVideoProcessor", "gamelog.saveToGameCenterLocal, GameExternalService, curVideoCount = " + size);
        for (C48478n.C13793h next : this.f126138d) {
            if (!C86013q1.m106450k(next.f38919c)) {
                Log.m105920e("MicroMsg.MiniGameVideoProcessor", "gamelog.saveToGameCenterLocal, GameExternalService, file not exist path= " + next.f38919c);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f126139e);
                String str = File.separator;
                sb.append(str);
                String sb4 = sb.toString();
                if (!Util.isNullOrNil(next.f38917a)) {
                    sb4 = sb4 + next.f38917a + str;
                    Log.m105918d("MicroMsg.MiniGameVideoProcessor", "gamelog.saveToGameCenterLocal, GameExternalService, parentPath = " + sb4);
                }
                C53037a a = this.f126140f.mo72119a(next, sb4, i);
                if (a != null) {
                    this.f126141g.add(a);
                }
            }
        }
        if (this.f126141g.size() + size > this.f126142h) {
            List<C53037a> subList = arrayList.subList(0, (size + this.f126141g.size()) - this.f126142h);
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(subList, 10));
            for (C53037a aVar : subList) {
                arrayList2.add(aVar.field_fileId);
            }
            ((C53039c) ((C48484q) C86312j.m106911c(cls)).mo66103Jx()).mo73746Lo(arrayList2);
        }
        ((C53039c) ((C48484q) C86312j.m106911c(cls)).mo66103Jx()).mo73748qq(this.f126141g);
        this.f126140f.mo72120b(this.f126141g, 1);
        List<C53037a> Yt = ((C53039c) ((C48484q) C86312j.m106911c(cls)).mo66103Jx()).mo73747Yt(i);
        Log.m105924i("MicroMsg.MiniGameVideoProcessor", "gamelog.saveToGameCenterLocal, GameExternalService, after insert count  = " + ((ArrayList) Yt).size());
        C48478n.C48481f fVar = this.f126143i;
        if (fVar != null) {
            fVar.onSuccess();
        }
        for (C53037a aVar2 : this.f126141g) {
            C47890b.m53202c(new C53065b(aVar2.field_appId, 0, 1, 3, 3, 0, 0, 0, aVar2.field_extJsonData, 226, (C8480h) null));
        }
    }
}
