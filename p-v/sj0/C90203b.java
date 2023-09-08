package sj0;

import android.net.Uri;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81439t0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.IOException;
import kr0.C88267e;
import xj0.C91258z;

/* renamed from: sj0.b */
public abstract class C90203b extends C82268c<C88267e> {

    /* renamed from: sj0.b$b */
    public class C90205b implements C91258z {

        /* renamed from: a */
        public String f258967a;

        /* renamed from: b */
        public String f258968b;

        public C90205b(C90203b bVar, String str, String str2, C90204a aVar) {
            this.f258967a = str;
            this.f258968b = str2;
        }
    }

    /* renamed from: w */
    public C90205b mo124444w(C88267e eVar, String str, boolean z) {
        String x = mo124445x(eVar, str);
        if (x == null) {
            Log.m105920e("MicroMsg.WAGameJsApiScreenRecorderBase", "hy: can not generate!");
            return null;
        }
        Log.m105925i("MicroMsg.WAGameJsApiScreenRecorderBase", "hy: creating file: %s", x);
        if (C86013q1.m106450k(x)) {
            Log.m105929w("MicroMsg.WAGameJsApiScreenRecorderBase", "hy: file already exists, auto delete: %b", Boolean.valueOf(z));
            if (!z) {
                return null;
            }
            C86013q1.m106447h(x);
        }
        C86009m1 m1Var = new C86009m1(x);
        C86013q1.m106461v(C86013q1.m106458s(x));
        try {
            if (!m1Var.mo119964e()) {
                Log.m105928w("MicroMsg.WAGameJsApiScreenRecorderBase", "hy: create file failed!");
                return null;
            }
            String i = m1Var.mo119971i();
            return new C90205b(this, i, "wxfile://clientdata/" + str, (C90204a) null);
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.WAGameJsApiScreenRecorderBase", e, "hy: create file failed!", new Object[0]);
            return null;
        }
    }

    /* renamed from: x */
    public final String mo124445x(C88267e eVar, String str) {
        if (eVar == null || Util.isNullOrNil(str)) {
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(eVar == null);
            objArr[1] = str;
            Log.m105929w("MicroMsg.WAGameJsApiScreenRecorderBase", "hy: param error %b, %s", objArr);
            return null;
        }
        C82419d1 d1Var = (C82419d1) eVar.getFileSystem();
        if (d1Var == null) {
            Log.m105928w("MicroMsg.WAGameJsApiScreenRecorderBase", "hy: fs is null");
            return null;
        }
        String str2 = ((C81439t0) d1Var.mo113747a("wxfile://clientdata")).f238992d;
        if (!str2.endsWith("/")) {
            str2 = str2 + "/";
        }
        C86009m1 m1Var = new C86009m1(str2 + FilePathGenerator.NO_MEDIA_FILENAME);
        if (!m1Var.mo119967g()) {
            Log.m105924i("MicroMsg.WAGameJsApiScreenRecorderBase", "hy: no nomedia file. trigger new");
            try {
                m1Var.mo119964e();
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.WAGameJsApiScreenRecorderBase", e, "hy: create no media file failed!", new Object[0]);
            }
        }
        return str2 + str;
    }

    /* renamed from: y */
    public C90205b mo124446y(C88267e eVar, String str, String str2, boolean z, boolean z2) {
        Log.m105925i("MicroMsg.WAGameJsApiScreenRecorderBase", "hy: request saveFileToClientData: %s, %b, %b", str, Boolean.valueOf(z), Boolean.valueOf(z2));
        if (!C86013q1.m106450k(str)) {
            Log.m105928w("MicroMsg.WAGameJsApiScreenRecorderBase", "hy: src file not exists!");
            return null;
        }
        String x = mo124445x(eVar, str2);
        if (x == null) {
            Log.m105928w("MicroMsg.WAGameJsApiScreenRecorderBase", "hy: can not generate dest file!");
            return null;
        }
        if (C86013q1.m106450k(x)) {
            Log.m105929w("MicroMsg.WAGameJsApiScreenRecorderBase", "hy: file already exists, auto delete: %b", Boolean.valueOf(z));
            if (!z) {
                return null;
            }
            C86013q1.m106447h(x);
        }
        Uri n = C116299g2.m163858n(x);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        if (z2) {
            Uri n2 = C116299g2.m163858n(str);
            String path2 = n2.getPath();
            if (path2 != null) {
                String k2 = C116299g2.m163855k(path2, false, false);
                if (!n2.getPath().equals(k2)) {
                    n2 = n2.buildUpon().path(k2).build();
                }
            }
            if (!C86013q1.m106463x(C116299g2.m163865u(n2), C116299g2.m163865u(n))) {
                Log.m105928w("MicroMsg.WAGameJsApiScreenRecorderBase", "hy: rename failed!");
                return null;
            }
        } else if (C86013q1.m106443d(str, x, false) <= 0) {
            Log.m105928w("MicroMsg.WAGameJsApiScreenRecorderBase", "hy: copy failed!");
            return null;
        }
        return new C90205b(this, x, "wxfile://clientdata/" + str2, (C90204a) null);
    }
}
