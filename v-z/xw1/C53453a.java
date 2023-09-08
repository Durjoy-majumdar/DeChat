package xw1;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C47350c;
import vw1.C53003a;
import vw1.C53005b;
import vw1.C53009d;

/* renamed from: xw1.a */
public final class C53453a extends C53456c<C53009d> {
    public C53453a(LinkedList<String> linkedList) {
        C53005b bVar = new C53005b();
        C53009d dVar = new C53009d();
        C53003a aVar = new C53003a();
        aVar.f147916d = linkedList;
        bVar.f147919d = aVar;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = bVar;
        bVar2.f127067b = dVar;
        bVar2.f127069d = 4647;
        bVar2.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/batchgetcontentinfobycontentid";
        bVar2.f127070e = 0;
        bVar2.f127071f = 0;
        mo123453j(bVar2.mo72403a());
        Object[] objArr = new Object[1];
        objArr[0] = linkedList != null ? Integer.valueOf(linkedList.size()) : null;
        Log.m105925i("MicroMsg.CgiGetInteractiveMsgContentRequest", "contentIdList。size: %d", objArr);
    }
}
