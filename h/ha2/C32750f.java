package ha2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import java.util.ArrayList;
import java.util.Iterator;
import ua2.C101991b;

/* renamed from: ha2.f */
public class C32750f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f89135d;

    /* renamed from: e */
    public final /* synthetic */ C32751g f89136e;

    public C32750f(C32751g gVar, long j) {
        this.f89136e = gVar;
        this.f89135d = j;
    }

    public void run() {
        String str;
        boolean z;
        Class cls = C98327c.class;
        long j = this.f89135d;
        if (C98329e.m127108d()) {
            ((C98327c) C101991b.m134284b(cls)).mo137640I(j);
        }
        C32751g gVar = this.f89136e;
        gVar.getClass();
        Log.m105924i("MicroMsg.Music.PieceCacheCleanController", "clean music piece file");
        String a = C98329e.m127105a();
        if (a.endsWith("/")) {
            str = a + "music";
        } else {
            str = a + "/" + "music";
        }
        C86009m1 m1Var = new C86009m1(str);
        if (!m1Var.mo119967g() || !m1Var.mo119977o()) {
            Log.m105924i("MicroMsg.Music.PieceCacheCleanController", "musicFolder is not exist or not Directory");
            return;
        }
        String[] s = m1Var.mo119981s();
        if (s == null || s.length == 0) {
            Log.m105924i("MicroMsg.Music.PieceCacheCleanController", "none files exist");
            return;
        }
        for (String str2 : s) {
            Iterator it = ((ArrayList) gVar.f89138e).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (str2.contains((String) it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                Log.m105924i("MicroMsg.Music.PieceCacheCleanController", "file is the block file, don't delete");
            } else {
                C86009m1 m1Var2 = new C86009m1(str + "/" + str2);
                if (!m1Var2.mo119967g()) {
                    Log.m105924i("MicroMsg.Music.PieceCacheCleanController", "file not exist");
                } else if (m1Var2.mo119977o()) {
                    Log.m105924i("MicroMsg.Music.PieceCacheCleanController", "file is directory, don't delete");
                } else if (System.currentTimeMillis() - m1Var2.mo119979q() > C32749b.f89131a.longValue()) {
                    Log.m105921e("MicroMsg.Music.PieceCacheCleanController", "Clean 7 days file in music file name=%s, path:%s", m1Var2.getName(), m1Var2.mo119971i());
                    m1Var2.mo119966f();
                    if (str2.startsWith("piece")) {
                        Log.m105920e("MicroMsg.Music.PieceCacheCleanController", "file is piece prefix, delete the piece info in db");
                        if (C98329e.m127108d()) {
                            ((C98327c) C101991b.m134284b(cls)).mo137654x(str2);
                        }
                    }
                } else {
                    Log.m105924i("MicroMsg.Music.PieceCacheCleanController", "not delete the file, file is in valid time for 7 day");
                }
            }
        }
    }
}
