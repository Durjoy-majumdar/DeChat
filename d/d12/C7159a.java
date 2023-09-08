package d12;

import android.net.Uri;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;

/* renamed from: d12.a */
public final class C7159a {

    /* renamed from: a */
    public static final C7159a f25134a = new C7159a();

    /* renamed from: a */
    public final String mo8346a(String str, String str2, int i) {
        C87412m.m108594g(str, "projectId");
        C87412m.m108594g(str2, "resourceName");
        String str3 = C72994y1.f212835d + XVFSFile.SEPARATOR_CHAR + str + XVFSFile.SEPARATOR_CHAR + str2;
        Uri n = C116299g2.m163858n(str3);
        String path = n.getPath();
        boolean z = false;
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (l.mo177810a()) {
            z = l.f348991a.mo119948x(l.f348992b);
        }
        if (!z) {
            C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
            if (l2.mo177810a()) {
                l2.f348991a.mo119937g(l2.f348992b);
            }
        }
        return str3 + XVFSFile.SEPARATOR_CHAR + i;
    }
}
