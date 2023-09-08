package p346hh;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p213oh.C11412b;
import p213oh.C89209a;
import p348ih.C21087k;
import p348ih.C21088l;

/* renamed from: hh.g */
public class C32907g {

    /* renamed from: b */
    public static final Long f89457b = 172800000L;

    /* renamed from: c */
    public static final Long f89458c = 86400000L;

    /* renamed from: d */
    public static long f89459d = 0;

    /* renamed from: a */
    public List<String> f89460a = new ArrayList(10);

    /* renamed from: hh.g$a */
    public class C20940a extends C21088l {
        public C20940a(String str, int i) {
            super(str, i);
        }

        public void run() {
            C32907g gVar = C32907g.this;
            gVar.getClass();
            int i = C11412b.f33577a;
            Log.m105925i("MicroMsg.Mix.AudioScanConvertCacheController", "clean mix convert file", (Object[]) null);
            gVar.mo58851a(C89209a.m111502d().mo119976n());
            C21087k.m23343c(this);
        }
    }

    public C32907g(List<String> list) {
        if (list != null && !list.isEmpty()) {
            this.f89460a.addAll(list);
        }
    }

    /* renamed from: a */
    public final void mo58851a(String str) {
        boolean z;
        C86009m1 m1Var = new C86009m1(str);
        if (!m1Var.mo119967g() || !m1Var.mo119977o()) {
            Object[] objArr = {str};
            int i = C11412b.f33577a;
            Log.m105925i("MicroMsg.Mix.AudioScanConvertCacheController", "%s is not exist or not Directory", objArr);
            return;
        }
        String[] s = m1Var.mo119981s();
        if (s == null || s.length == 0) {
            int i2 = C11412b.f33577a;
            Log.m105925i("MicroMsg.Mix.AudioScanConvertCacheController", "none files exist", (Object[]) null);
            return;
        }
        for (String str2 : s) {
            Iterator it = ((ArrayList) this.f89460a).iterator();
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
                int i3 = C11412b.f33577a;
                Log.m105925i("MicroMsg.Mix.AudioScanConvertCacheController", "file is the block file, don't delete", (Object[]) null);
            } else {
                String str3 = str + "/" + str2;
                C86009m1 m1Var2 = new C86009m1(str3);
                if (!m1Var2.mo119967g()) {
                    int i4 = C11412b.f33577a;
                    Log.m105925i("MicroMsg.Mix.AudioScanConvertCacheController", "file not exist", (Object[]) null);
                } else if (m1Var2.mo119977o()) {
                    int i5 = C11412b.f33577a;
                    Log.m105925i("MicroMsg.Mix.AudioScanConvertCacheController", "file is directory, scan and delete subFilePath:%s", str3);
                    mo58851a(str3);
                } else if (System.currentTimeMillis() - m1Var2.mo119979q() > f89457b.longValue()) {
                    Object[] objArr2 = {m1Var2.getName(), m1Var2.mo119971i()};
                    int i6 = C11412b.f33577a;
                    Log.m105921e("MicroMsg.Mix.AudioScanConvertCacheController", "Clean 2 days file in mix convert file name=%s, path:%s", objArr2);
                    m1Var2.mo119966f();
                }
            }
        }
    }
}
