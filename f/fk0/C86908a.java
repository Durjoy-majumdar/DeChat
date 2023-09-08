package fk0;

import bi0.C79706a;
import ci0.C0507b;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.wexnet.Options;
import com.tencent.p014mm.wexnet.SessionCreateResult;
import com.tencent.p014mm.wexnet.SessionKeeper;
import com.tencent.p014mm.wexnet.WeXNet;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: fk0.a */
public final class C86908a extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 1091;
    public static final String NAME = "createInferenceSession";

    /* renamed from: fk0.a$a */
    public static final class C86909a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C82381f f252235d;

        /* renamed from: e */
        public final /* synthetic */ int f252236e;

        /* renamed from: f */
        public final /* synthetic */ C86908a f252237f;

        /* renamed from: g */
        public final /* synthetic */ String f252238g;

        /* renamed from: h */
        public final /* synthetic */ int f252239h;

        /* renamed from: i */
        public final /* synthetic */ C86009m1 f252240i;

        /* renamed from: j */
        public final /* synthetic */ boolean f252241j;

        /* renamed from: n */
        public final /* synthetic */ boolean f252242n;

        /* renamed from: o */
        public final /* synthetic */ boolean f252243o;

        /* renamed from: p */
        public final /* synthetic */ int f252244p;

        /* renamed from: q */
        public final /* synthetic */ HashMap<String, int[]> f252245q;

        public C86909a(C82381f fVar, int i, C86908a aVar, String str, int i2, C86009m1 m1Var, boolean z, boolean z2, boolean z3, int i3, HashMap<String, int[]> hashMap) {
            this.f252235d = fVar;
            this.f252236e = i;
            this.f252237f = aVar;
            this.f252238g = str;
            this.f252239h = i2;
            this.f252240i = m1Var;
            this.f252241j = z;
            this.f252242n = z2;
            this.f252243o = z3;
            this.f252244p = i3;
            this.f252245q = hashMap;
        }

        public final void run() {
            int i;
            long j = (long) 1000;
            int nanoTime = (int) (System.nanoTime() / j);
            try {
                C86009m1 m1Var = this.f252240i;
                String str = this.f252238g;
                boolean z = this.f252241j;
                boolean z2 = this.f252242n;
                boolean z3 = this.f252243o;
                int i2 = this.f252244p;
                HashMap<String, int[]> hashMap = this.f252245q;
                long currentTimeMillis = System.currentTimeMillis();
                WeXNet.C86022a aVar = WeXNet.Companion;
                String n = m1Var.mo119976n();
                C87412m.m108593f(n, "modelFile.path");
                Options options = r8;
                Options options2 = new Options(1, str, z, z2, z3, i2, hashMap);
                aVar.getClass();
                aVar.mo120038a();
                SessionCreateResult access$createSession = WeXNet.createSession(n, options);
                Log.m105924i("MicroMsg.JsApiCreateInferenceSession", "tryCreateSession cost[" + (System.currentTimeMillis() - currentTimeMillis) + ']');
                this.f252237f.mo121360w(this.f252238g);
                C79706a aVar2 = (C79706a) this.f252235d.mo109668l(C79706a.class);
                if (aVar2 == null) {
                    Log.m105928w("MicroMsg.JsApiCreateInferenceSession", "AppBrandXNetSessionMgr is null");
                    C82381f fVar = this.f252235d;
                    int i3 = this.f252236e;
                    C86908a aVar3 = this.f252237f;
                    aVar3.getClass();
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("errno", 4);
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                    }
                    fVar.mo109647a(i3, aVar3.mo115115p("fail:internal error", jSONObject));
                    return;
                }
                SessionKeeper sessionKeeper = access$createSession.getSessionKeeper();
                synchronized (aVar2) {
                    C87412m.m108594g(sessionKeeper, "sessionPtr");
                    i = aVar2.f233617d;
                    aVar2.f233617d = i + 1;
                    aVar2.f233618e.put(Integer.valueOf(i), sessionKeeper);
                }
                if (access$createSession.getSuccess()) {
                    C82381f fVar2 = this.f252235d;
                    int i4 = this.f252236e;
                    C86908a aVar4 = this.f252237f;
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("sessionId", "" + i);
                    C13598b0 b0Var = C13598b0.f38549a;
                    aVar4.getClass();
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                    }
                    hashMap2.put("errno", 0);
                    fVar2.mo109647a(i4, aVar4.mo115114o("ok", hashMap2));
                    Log.m105924i("MicroMsg.JsApiCreateInferenceSession", "createInferenceSession invoke cost[" + ((((int) (System.nanoTime() / j)) - nanoTime) + this.f252239h) + ']');
                    return;
                }
                String str2 = "";
                long[] codes = access$createSession.getCodes();
                int length = codes.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length) {
                    long j2 = codes[i5];
                    int i7 = i6 + 1;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(j2);
                    sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
                    sb.append(access$createSession.getDesc().length > i6 ? access$createSession.getDesc()[i6] : "");
                    sb.append(10);
                    str2 = sb.toString();
                    i5++;
                    i6 = i7;
                }
                C82381f fVar3 = this.f252235d;
                int i8 = this.f252236e;
                C86908a aVar5 = this.f252237f;
                String format = String.format("fail:create session fail(%s)", Arrays.copyOf(new Object[]{str2}, 1));
                C87412m.m108593f(format, "format(format, *args)");
                aVar5.getClass();
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 2004001, format);
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("errno", 2004001);
                } catch (Exception e2) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
                }
                fVar3.mo109647a(i8, aVar5.mo115115p(format, jSONObject2));
            } catch (WeXNet.C86022a.C86023a unused) {
                C82381f fVar4 = this.f252235d;
                int i9 = this.f252236e;
                C86908a aVar6 = this.f252237f;
                aVar6.getClass();
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 2004010, "fail:environment not ready");
                }
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("errno", 2004010);
                } catch (Exception e3) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
                }
                fVar4.mo109647a(i9, aVar6.mo115115p("fail:environment not ready", jSONObject3));
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C86009m1 m1Var;
        String str;
        Iterator<String> keys;
        int i2;
        boolean z;
        C82381f fVar2 = fVar;
        JSONObject jSONObject2 = jSONObject;
        int i3 = i;
        if (fVar2 != null) {
            long j = (long) 1000;
            int nanoTime = (int) (System.nanoTime() / j);
            C81415h0 fileSystem = fVar.getFileSystem();
            JSONObject jSONObject3 = null;
            if (fileSystem != null) {
                m1Var = fileSystem.getAbsoluteFile(jSONObject2 != null ? jSONObject2.optString("model") : null);
            } else {
                m1Var = null;
            }
            boolean optBoolean = jSONObject2 != null ? jSONObject2.optBoolean("allowQuantize") : false;
            boolean optBoolean2 = jSONObject2 != null ? jSONObject2.optBoolean("allowGPU") : false;
            boolean optBoolean3 = jSONObject2 != null ? jSONObject2.optBoolean("allowNPU") : false;
            int optInt = jSONObject2 != null ? jSONObject2.optInt("precisionLevel") : 4;
            if (jSONObject2 != null) {
                jSONObject3 = jSONObject2.optJSONObject("typicalShape");
            }
            HashMap hashMap = new HashMap();
            int i4 = optInt;
            boolean z2 = optBoolean3;
            if (!(jSONObject3 == null || (keys = jSONObject3.keys()) == null)) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    boolean z3 = optBoolean2;
                    Object obj = jSONObject3.get(next);
                    JSONObject jSONObject4 = jSONObject3;
                    if (obj instanceof JSONArray) {
                        try {
                            C87412m.m108593f(next, "key");
                            JSONArray jSONArray = (JSONArray) obj;
                            C87412m.m108595h(jSONArray, "$this$toIntArray");
                            int length = jSONArray.length();
                            z = optBoolean;
                            int[] iArr = new int[length];
                            i2 = nanoTime;
                            for (int i5 = 0; i5 < length; i5++) {
                                iArr[i5] = jSONArray.getInt(i5);
                            }
                            hashMap.put(next, iArr);
                        } catch (JSONException unused) {
                            if (BuildInfo.DEBUG) {
                                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 2000001, "fail:AI invalid arguments");
                            }
                            JSONObject jSONObject5 = new JSONObject();
                            try {
                                jSONObject5.put("errno", 2000001);
                            } catch (Exception e) {
                                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                            }
                            fVar2.mo109647a(i3, mo115115p("fail:AI invalid arguments", jSONObject5));
                            return;
                        }
                    } else {
                        i2 = nanoTime;
                        z = optBoolean;
                    }
                    optBoolean2 = z3;
                    jSONObject3 = jSONObject4;
                    optBoolean = z;
                    nanoTime = i2;
                }
            }
            int i6 = nanoTime;
            boolean z4 = optBoolean;
            boolean z5 = optBoolean2;
            if (m1Var == null || !m1Var.mo119978p()) {
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 2004000, "fail:invalid model file path");
                }
                JSONObject jSONObject6 = new JSONObject();
                try {
                    jSONObject6.put("errno", 2004000);
                } catch (Exception e2) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
                }
                fVar2.mo109647a(i3, mo115115p("fail:invalid model file path", jSONObject6));
                return;
            }
            C0507b bVar = (C0507b) fVar2.mo109668l(C0507b.class);
            if (bVar == null || (str = bVar.mo558g0()) == null) {
                str = "";
            }
            String str2 = str;
            Log.m105924i("MicroMsg.JsApiCreateInferenceSession", "modelFile=" + m1Var + "  cachePath=" + str2);
            ((C119157j) C119157j.f356862d).mo183870a(new C86909a(fVar, i, this, str2, ((int) (System.nanoTime() / j)) - i6, m1Var, z4, z5, z2, i4, hashMap));
        }
    }

    /* renamed from: w */
    public final void mo121360w(String str) {
        C86009m1[] u;
        C86009m1 m1Var = new C86009m1(str);
        if (m1Var.mo119977o() && (u = m1Var.mo119984u()) != null) {
            for (C86009m1 m1Var2 : u) {
                if (m1Var2.mo119977o()) {
                    String i = m1Var2.mo119971i();
                    C87412m.m108593f(i, "it.absolutePath");
                    mo121360w(i);
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    C116281f0.C116288h z = m1Var2.mo119989z();
                    if (z.mo177810a()) {
                        z.f348991a.mo119935e(z.f348992b, currentTimeMillis);
                    }
                }
            }
        }
    }
}
