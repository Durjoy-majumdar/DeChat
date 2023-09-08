package j53;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C47350c;
import ob0.C89132b;
import te3.am4;
import te3.bm4;
import te3.uk4;

/* renamed from: j53.d */
public class C46424d extends C89132b<bm4> {
    public C46424d(LinkedList<uk4> linkedList) {
        am4 am4 = new am4();
        am4.f130640d = linkedList;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = am4;
        bVar.f127067b = new bm4();
        bVar.f127069d = 2638;
        bVar.f127068c = "/cgi-bin/mmpay-bin/updateunipayorder";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        mo123453j(bVar.mo72403a());
        Log.m105924i("MicroMsg.CgiUpdateUniPayOrder", "update uni pay order");
    }
}
