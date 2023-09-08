package t71;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;

/* renamed from: t71.b */
public class C48537b implements Runnable {

    /* renamed from: d */
    public String f129816d;

    /* renamed from: e */
    public C86009m1 f129817e;

    public C48537b(String str, C86009m1 m1Var) {
        this.f129816d = str;
        this.f129817e = m1Var;
    }

    public void run() {
        byte[] httpGet = Util.httpGet(this.f129816d);
        if (httpGet != null) {
            C86013q1.m106438T(this.f129817e.mo119976n(), httpGet, 0, httpGet.length);
        }
    }

    public String toString() {
        return super.toString() + "|DownloadRunnable";
    }
}
