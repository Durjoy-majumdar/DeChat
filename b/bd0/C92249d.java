package bd0;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import p375qh.C101193k;
import p827uh.C52575d;

/* renamed from: bd0.d */
public class C92249d implements QueueWorkerThread.ThreadObject {

    /* renamed from: d */
    public String f264035d = null;

    /* renamed from: e */
    public BlockingQueue<C101193k.C101194a> f264036e = new ArrayBlockingQueue(1024);

    /* renamed from: a */
    public boolean mo126245a(int i, int i2, int i3) {
        Log.m105924i("MicroMsg.SpeexEncoderWorker", "init ");
        ((ArrayBlockingQueue) this.f264036e).clear();
        int i4 = C39755e.f106663g;
        this.f264035d = String.format("%s%d_%d_%d_%d", new Object[]{i4 != 1 ? i4 != 2 ? "single_" : "app_" : "chatroom_", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(System.currentTimeMillis())});
        return true;
    }

    /* renamed from: b */
    public void mo126246b(byte[] bArr) {
        Log.m105918d("MicroMsg.SpeexEncoderWorker", "push into queue queueLen:" + ((ArrayBlockingQueue) this.f264036e).size());
        if (bArr != null && bArr.length > 0) {
            ((ArrayBlockingQueue) this.f264036e).add(new C101193k.C101194a(bArr, bArr.length));
        }
    }

    public boolean doInBackground() {
        Log.m105918d("MicroMsg.SpeexEncoderWorker", "doEncode");
        C52575d dVar = new C52575d();
        String a = C28298b.m38156a();
        try {
            Log.m105924i("MicroMsg.SpeexEncoderWorker", "path " + a);
            Uri n = C116299g2.m163858n(a);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0 f0Var = C116281f0.C116289i.f348994a;
            C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
            if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
                if (l2.mo177810a()) {
                    l2.f348991a.mo119937g(l2.f348992b);
                }
            }
            dVar.mo73537a(a + this.f264035d + ".temp");
            while (((ArrayBlockingQueue) this.f264036e).size() > 0) {
                C101193k.C101194a aVar = (C101193k.C101194a) ((ArrayBlockingQueue) this.f264036e).poll();
                if (aVar.f296199a != null && aVar.f296200b > 0) {
                    dVar.mo73538b(aVar, 0);
                }
            }
            dVar.mo73541e();
            try {
                Uri n2 = C116299g2.m163858n(a + this.f264035d + ".temp");
                String path2 = n2.getPath();
                if (path2 != null) {
                    String k2 = C116299g2.m163855k(path2, false, false);
                    if (!n2.getPath().equals(k2)) {
                        n2 = n2.buildUpon().path(k2).build();
                    }
                }
                Uri n3 = C116299g2.m163858n(a + this.f264035d + ".spx");
                String path3 = n3.getPath();
                if (path3 != null) {
                    String k3 = C116299g2.m163855k(path3, false, false);
                    if (!n3.getPath().equals(k3)) {
                        n3 = n3.buildUpon().path(k3).build();
                    }
                }
                C116281f0 f0Var2 = C116281f0.C116289i.f348994a;
                C116281f0.C116288h l3 = f0Var2.mo177799l(n2, (C116281f0.C116288h) null);
                C116281f0.C116288h l4 = f0Var2.mo177799l(n3, (C116281f0.C116288h) null);
                if (l3.mo177810a() && l4.mo177810a()) {
                    try {
                        l4.f348991a.mo119946t(l4.f348992b, l3.f348991a, l3.f348992b);
                    } catch (IOException unused) {
                    }
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.SpeexEncoderWorker", "exception:%s", Util.stackTraceToString(e));
            }
            C92250f.m115988b().mo126248c();
        } catch (Exception e2) {
            Log.m105921e("MicroMsg.SpeexEncoderWorker", "filename open failed, ", e2);
        }
        return true;
    }

    public boolean onPostExecute() {
        return false;
    }
}
