package xy0;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C116326t0;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.List;
import p213oh.C11412b;
import yy0.C102970a;

/* renamed from: xy0.d */
public final /* synthetic */ class C102789d {
    /* renamed from: a */
    public static void m135840a(List<C102970a> list, C72963f4 f4Var, String str, int i) {
        C86001b0 n = C86013q1.m106453n(str);
        if (n != null) {
            C102970a aVar = new C102970a();
            aVar.field_msgId = f4Var.getMsgId();
            aVar.field_msgType = f4Var.getType();
            aVar.field_username = f4Var.mo108768t();
            aVar.field_msgtime = f4Var.getCreateTime();
            aVar.field_msgSubType = i;
            C116281f0 f0Var = C116281f0.C116289i.f348994a;
            Uri n2 = C116299g2.m163858n(str);
            String path = n2.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n2.getPath().equals(k)) {
                    n2 = n2.buildUpon().path(k).build();
                }
            }
            Uri e = f0Var.mo177792e(n2);
            if (e != null) {
                String path2 = e.getPath();
                if (path2 != null) {
                    String k2 = C116299g2.m163855k(path2, false, false);
                    if (!e.getPath().equals(k2)) {
                        e = e.buildUpon().path(k2).build();
                    }
                }
                aVar.field_path = C116299g2.m163865u(e);
            } else {
                aVar.field_path = str;
            }
            aVar.field_size = n.f250473c;
            aVar.field_diskSpace = n.f250474d;
            if (n instanceof C116326t0) {
                try {
                    aVar.mo142684n2(((C116326t0) n).f349094h);
                } catch (Exception e2) {
                    int i2 = C11412b.f33577a;
                    Log.printErrStackTrace("MicroMsg.CalcWxNewService", e2, "Failed to set UUID", new Object[0]);
                }
            }
            list.add(aVar);
        }
    }
}
