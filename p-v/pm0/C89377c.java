package pm0;

import android.net.Uri;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81439t0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.IOException;
import kr0.C88267e;
import org.json.JSONObject;
import xj0.C91237o;

/* renamed from: pm0.c */
public abstract class C89377c extends C82268c<C88267e> {

    /* renamed from: pm0.c$b */
    public class C89379b {

        /* renamed from: a */
        public String f257371a;

        /* renamed from: b */
        public String f257372b;

        public C89379b(C89377c cVar, String str, String str2, C89378a aVar) {
            this.f257371a = str;
            this.f257372b = str2;
        }
    }

    /* renamed from: A */
    public C89379b mo123719A(C88267e eVar, String str, String str2, boolean z, boolean z2) {
        Log.m105925i("MicroMsg.GameRecord.JsApiScreenRecorderBase", "hy: request saveFileToClientData: %s, %b, %b", str, Boolean.valueOf(z), Boolean.valueOf(z2));
        if (!C86013q1.m106450k(str)) {
            Log.m105928w("MicroMsg.GameRecord.JsApiScreenRecorderBase", "hy: src file not exists!");
            return null;
        }
        String x = mo123721x(eVar, str2);
        if (x == null) {
            Log.m105928w("MicroMsg.GameRecord.JsApiScreenRecorderBase", "hy: can not generate dest file!");
            return null;
        }
        if (C86013q1.m106450k(x)) {
            Log.m105929w("MicroMsg.GameRecord.JsApiScreenRecorderBase", "hy: file already exists, auto delete: %b", Boolean.valueOf(z));
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
            if (!C86013q1.m106462w(C116299g2.m163865u(n2), C116299g2.m163865u(n))) {
                Log.m105928w("MicroMsg.GameRecord.JsApiScreenRecorderBase", "hy: rename failed!");
                return null;
            }
        } else if (C86013q1.m106443d(str, x, false) <= 0) {
            Log.m105928w("MicroMsg.GameRecord.JsApiScreenRecorderBase", "hy: copy failed!");
            return null;
        }
        return new C89379b(this, x, "wxfile://clientdata/" + str2, (C89378a) null);
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        if (eVar.mo114344o0() == null) {
            Log.m105920e("MicroMsg.GameRecord.JsApiScreenRecorderBase", "hy: no page context");
        } else if (jSONObject == null) {
            eVar.mo109647a(i, mo115109j("fail:data is null or nil"));
        } else {
            mo123717z(eVar, jSONObject, i);
        }
    }

    /* renamed from: w */
    public C89379b mo123720w(C88267e eVar, String str, boolean z) {
        String x = mo123721x(eVar, str);
        if (x == null) {
            Log.m105920e("MicroMsg.GameRecord.JsApiScreenRecorderBase", "hy: can not generate!");
            return null;
        }
        Log.m105925i("MicroMsg.GameRecord.JsApiScreenRecorderBase", "hy: creating file: %s", x);
        if (C86013q1.m106450k(x)) {
            Log.m105929w("MicroMsg.GameRecord.JsApiScreenRecorderBase", "hy: file already exists, auto delete: %b", Boolean.valueOf(z));
            if (!z) {
                return null;
            }
            C86013q1.m106447h(x);
        }
        C86009m1 m1Var = new C86009m1(x);
        C86013q1.m106461v(C86013q1.m106458s(x));
        try {
            if (!m1Var.mo119964e()) {
                Log.m105928w("MicroMsg.GameRecord.JsApiScreenRecorderBase", "hy: create file failed!");
                return null;
            }
            String i = m1Var.mo119971i();
            return new C89379b(this, i, "wxfile://clientdata/" + str, (C89378a) null);
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.GameRecord.JsApiScreenRecorderBase", e, "hy: create file failed!", new Object[0]);
            return null;
        }
    }

    /* renamed from: x */
    public final String mo123721x(C88267e eVar, String str) {
        if (eVar == null || Util.isNullOrNil(str)) {
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(eVar == null);
            objArr[1] = str;
            Log.m105929w("MicroMsg.GameRecord.JsApiScreenRecorderBase", "hy: param error %b, %s", objArr);
            return null;
        }
        C82419d1 d1Var = (C82419d1) eVar.getFileSystem();
        if (d1Var == null) {
            Log.m105928w("MicroMsg.GameRecord.JsApiScreenRecorderBase", "hy: fs is null");
            return null;
        }
        String str2 = ((C81439t0) d1Var.mo113747a("wxfile://clientdata")).f238992d;
        if (!str2.endsWith("/")) {
            str2 = str2 + "/";
        }
        C86009m1 m1Var = new C86009m1(str2 + FilePathGenerator.NO_MEDIA_FILENAME);
        if (!m1Var.mo119967g()) {
            Log.m105924i("MicroMsg.GameRecord.JsApiScreenRecorderBase", "hy: no nomedia file. trigger new");
            try {
                m1Var.mo119964e();
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.GameRecord.JsApiScreenRecorderBase", e, "hy: create no media file failed!", new Object[0]);
            }
        }
        return str2 + str;
    }

    /* renamed from: y */
    public C91237o mo123722y(C88267e eVar) {
        return C91237o.m114472b("1234", eVar);
    }

    /* renamed from: z */
    public abstract void mo123717z(C88267e eVar, JSONObject jSONObject, int i);
}
