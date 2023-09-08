package p141db;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fl0.C86920e;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import js0.C88016e;
import org.json.JSONObject;

/* renamed from: db.a$$a */
public final /* synthetic */ class a$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C7257a f250789d;

    /* renamed from: e */
    public final /* synthetic */ String f250790e;

    /* renamed from: f */
    public final /* synthetic */ C81925i2 f250791f;

    /* renamed from: g */
    public final /* synthetic */ int f250792g;

    public /* synthetic */ a$$a(C7257a aVar, String str, C81925i2 i2Var, int i) {
        this.f250789d = aVar;
        this.f250790e = str;
        this.f250791f = i2Var;
        this.f250792g = i;
    }

    public final void run() {
        String[] strArr;
        C7257a aVar = this.f250789d;
        String str = this.f250790e;
        C81925i2 i2Var = this.f250791f;
        int i = this.f250792g;
        aVar.getClass();
        Log.m105925i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont start, in iothread [%s]", str);
        try {
            File file = new File(str);
            if (!C7257a.m7437w(file)) {
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1300014, "fail:Path permission denied");
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("errno", 1300014);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                i2Var.mo109647a(i, aVar.mo115115p("fail:Path permission denied", jSONObject));
                return;
            }
            int i2 = -1;
            if (file.isDirectory()) {
                Log.m105925i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont isDirectory [%s]", str);
                File[] listFiles = file.listFiles();
                HashMap hashMap = new HashMap();
                if (listFiles == null) {
                    strArr = new String[0];
                } else {
                    strArr = new String[listFiles.length];
                    for (int i3 = 0; i3 < listFiles.length; i3++) {
                        strArr[i3] = listFiles[i3].toString();
                    }
                }
                hashMap.put("data", strArr);
                Object[] objArr = new Object[2];
                objArr[0] = str;
                if (listFiles != null) {
                    i2 = listFiles.length;
                }
                objArr[1] = Integer.valueOf(i2);
                Log.m105925i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont isDirectory [%s] [%d]", objArr);
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                }
                hashMap.put("errno", 0);
                i2Var.mo109647a(i, aVar.mo115114o("ok", hashMap));
            } else if (file.isFile()) {
                Log.m105925i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont isFile [%s]", str);
                HashMap hashMap2 = new HashMap();
                try {
                    byte[] b = C88016e.m109545b(new FileInputStream(file));
                    ByteBuffer wrap = b != null ? ByteBuffer.wrap(b) : null;
                    hashMap2.put("data", wrap);
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = str;
                    if (wrap != null) {
                        i2 = wrap.limit();
                    }
                    objArr2[1] = Integer.valueOf(i2);
                    Log.m105925i("MicroMsg.JsApiGetWxCommFont", "getWxCommFont isFile [%s] length = [%d]", objArr2);
                    i2Var.mo109647a(i, aVar.mo115116q(i2Var, C86920e.f252311a, hashMap2));
                } catch (FileNotFoundException e2) {
                    Log.printErrStackTrace("MicroMsg.JsApiGetWxCommFont", e2, "file not found %s", str);
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1103002, "fail:target file not exists");
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("errno", 1103002);
                    } catch (Exception e3) {
                        Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
                    }
                    i2Var.mo109647a(i, aVar.mo115115p("fail:target file not exists", jSONObject2));
                }
            } else {
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1107012, "fail:load resource file fail");
                }
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("errno", 1107012);
                } catch (Exception e4) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e4);
                }
                i2Var.mo109647a(i, aVar.mo115115p("fail:load resource file fail", jSONObject3));
            }
        } catch (Exception unused) {
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
            }
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("errno", 4);
            } catch (Exception e5) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e5);
            }
            i2Var.mo109647a(i, aVar.mo115115p("fail:internal error", jSONObject4));
        }
    }
}
