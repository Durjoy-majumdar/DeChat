package p339fh;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C45115u1;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Iterator;
import p213oh.C11412b;
import p343gh.C20835e;

/* renamed from: fh.c */
public class C45782c implements C20835e {

    /* renamed from: a */
    public final /* synthetic */ C45784e f123677a;

    public C45782c(C45784e eVar) {
        this.f123677a = eVar;
    }

    /* renamed from: a */
    public void mo32433a() {
        C45784e eVar = this.f123677a;
        synchronized (eVar) {
            if (eVar.f123680a.isEmpty()) {
                int i = C11412b.f33577a;
                Log.m105925i("MicroMsg.Mix.AudioCachePathMgr", "data is empty", (Object[]) null);
                return;
            }
            try {
                Uri n = C116299g2.m163858n(eVar.f123682c);
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                if (l.mo177810a()) {
                    l.f348991a.mo119933c(l.f348992b);
                }
                BufferedWriter bufferedWriter = new BufferedWriter(new C45115u1(eVar.mo71258b()));
                Iterator<String> it = eVar.f123680a.iterator();
                while (it.hasNext()) {
                    bufferedWriter.newLine();
                    bufferedWriter.write(it.next());
                }
                Object[] objArr = {Integer.valueOf(eVar.f123680a.size())};
                int i2 = C11412b.f33577a;
                Log.m105925i("MicroMsg.Mix.AudioCachePathMgr", "line count:%s", objArr);
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (IOException e) {
                int i3 = C11412b.f33577a;
                Log.printErrStackTrace("MicroMsg.Mix.AudioCachePathMgr", e, "asyncRead", new Object[0]);
            }
            Log.m105925i("MicroMsg.Mix.AudioCachePathMgr", "save end", (Object[]) null);
        }
    }

    /* renamed from: b */
    public void mo32434b() {
    }
}
