package p339fh;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import java.io.IOException;
import java.util.ArrayList;
import p213oh.C11412b;
import p213oh.C89210c;

/* renamed from: fh.e */
public class C45784e {

    /* renamed from: d */
    public static C45784e f123679d;

    /* renamed from: a */
    public ArrayList<String> f123680a = new ArrayList<>();

    /* renamed from: b */
    public String f123681b = "";

    /* renamed from: c */
    public String f123682c;

    /* renamed from: c */
    public static C45784e m51066c() {
        if (f123679d == null) {
            synchronized (C45784e.class) {
                if (f123679d == null) {
                    f123679d = new C45784e();
                }
            }
        }
        return f123679d;
    }

    /* renamed from: a */
    public synchronized boolean mo71257a(String str) {
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioCachePathMgr", "delete path:%s", str);
        String a = C89210c.m111505a("" + str.hashCode());
        if (!this.f123680a.contains(a)) {
            this.f123680a.remove(a);
        }
        return true;
    }

    /* renamed from: b */
    public final C86009m1 mo71258b() {
        C86009m1 m1Var = new C86009m1(this.f123682c);
        if (!m1Var.mo119967g()) {
            try {
                m1Var.mo119964e();
            } catch (IOException e) {
                int i = C11412b.f33577a;
                Log.printErrStackTrace("MicroMsg.Mix.AudioCachePathMgr", e, "getCacheFile", new Object[0]);
            }
        }
        return m1Var;
    }

    /* renamed from: d */
    public synchronized boolean mo71259d(String str) {
        return this.f123680a.contains(C89210c.m111505a("" + str.hashCode()));
    }
}
