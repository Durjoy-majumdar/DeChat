package r73;

import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import gy3.C87412m;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import org.json.JSONObject;
import pe3.C47465a;
import r73.C47930c;
import t83.C13854i1;
import te3.C49535ga;
import te3.C49678ha;
import te3.C49837if;
import te3.C49966ja;
import te3.C51163rv3;
import te3.a25;
import te3.z15;

/* renamed from: r73.l */
public final class C47937l extends C47928a<C47940m> {

    /* renamed from: r73.l$a */
    public static final class C47938a implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ C47937l f128623d;

        /* renamed from: e */
        public final /* synthetic */ int f128624e;

        /* renamed from: f */
        public final /* synthetic */ String f128625f;

        public C47938a(C47937l lVar, int i, String str) {
            this.f128623d = lVar;
            this.f128624e = i;
            this.f128625f = str;
        }

        /* renamed from: a */
        public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            C87412m.m108594g(cVar, "rr");
            String str2 = this.f128623d.f128615c;
            Log.m105924i(str2, "do cgi callback cmdId=" + this.f128624e);
            if (Util.isNullOrNil(cVar.f127056b.f127083a.getData())) {
                C47937l lVar = this.f128623d;
                String str3 = this.f128625f;
                lVar.getClass();
                C49837if ifVar = new C49837if();
                C49966ja jaVar = new C49966ja();
                ifVar.BaseResponse = jaVar;
                C51163rv3 rv32 = new C51163rv3();
                rv32.mo73357f("fail response data is empty");
                jaVar.f135956e = rv32;
                ifVar.BaseResponse.f135955d = -1;
                byte[] encode = Base64.encode(ifVar.toByteArray(), 2);
                C87412m.m108593f(encode, "encode(resp.toByteArray(), Base64.NO_WRAP)");
                Charset charset = StandardCharsets.UTF_8;
                C87412m.m108593f(charset, "UTF_8");
                String str4 = new String(encode, charset);
                C47930c.C47931a.m53253a((C47930c) lVar.f128614b, str3, '\'' + str4 + '\'', (ValueCallback) null, 4, (Object) null);
                return 0;
            }
            byte[] encode2 = Base64.encode(cVar.f127056b.f127083a.getData(), 2);
            C87412m.m108593f(encode2, "encode(rr.responseProtoBuf.data, Base64.NO_WRAP)");
            Charset charset2 = StandardCharsets.UTF_8;
            C87412m.m108593f(charset2, "UTF_8");
            String str5 = new String(encode2, charset2);
            String str6 = this.f128625f;
            C47930c.C47931a.m53253a((C47930c) this.f128623d.f128614b, str6, '\'' + str5 + '\'', (ValueCallback) null, 4, (Object) null);
            return 0;
        }
    }

    /* renamed from: r73.l$b */
    public static final class C47939b implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ C47937l f128626d;

        /* renamed from: e */
        public final /* synthetic */ String f128627e;

        public C47939b(C47937l lVar, String str) {
            this.f128626d = lVar;
            this.f128627e = str;
        }

        /* renamed from: a */
        public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            int i3 = i;
            int i4 = i2;
            C47350c cVar2 = cVar;
            String str2 = this.f128626d.f128615c;
            Log.m105924i(str2, "videoPreloadCgi callback " + i3 + XVFSFile.SEPARATOR_CHAR + i3 + ' ' + str);
            if (i3 == 0 && i4 == 0) {
                String str3 = this.f128626d.f128615c;
                StringBuilder sb = new StringBuilder();
                sb.append("resp_str = ");
                C47465a aVar = cVar2.f127056b.f127083a;
                String str4 = null;
                a25 a25 = aVar instanceof a25 ? (a25) aVar : null;
                sb.append(a25 != null ? a25.f130261d : null);
                Log.m105918d(str3, sb.toString());
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errMsg", "ok");
                jSONObject.put("errCode", i4);
                C47465a aVar2 = cVar2.f127056b.f127083a;
                a25 a252 = aVar2 instanceof a25 ? (a25) aVar2 : null;
                if (a252 != null) {
                    str4 = a252.f130261d;
                }
                if (str4 == null) {
                    str4 = "{}";
                }
                try {
                    jSONObject.put("data", new JSONObject(str4));
                } catch (Exception unused) {
                    jSONObject.put("data", str4);
                }
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …             }.toString()");
                C47930c.C47931a.m53253a((C47930c) this.f128626d.f128614b, this.f128627e, jSONObject2, (ValueCallback) null, 4, (Object) null);
                return 0;
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("errMsg", "fail");
            jSONObject3.put("errCode", i4);
            String jSONObject4 = jSONObject3.toString();
            C87412m.m108593f(jSONObject4, "JSONObject().apply {\n   …             }.toString()");
            C47930c.C47931a.m53253a((C47930c) this.f128626d.f128614b, this.f128627e, jSONObject4, (ValueCallback) null, 4, (Object) null);
            return 0;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47937l(C47940m mVar) {
        super("wxJsEngineClient", mVar);
        C87412m.m108594g(mVar, "context");
    }

    @JavascriptInterface
    public final void cgi(int i, String str, String str2, String str3) {
        C87412m.m108594g(str, "cgiUrl");
        C87412m.m108594g(str2, "reqProtoBuf");
        C87412m.m108594g(str3, "callback");
        if (((C47940m) this.f128614b).mo63607d0(i, str)) {
            String str4 = this.f128615c;
            Log.m105924i(str4, "do cgi cmdId=" + i + ", cgiUrl=" + str);
            try {
                C47350c.C47352b bVar = new C47350c.C47352b();
                Charset forName = Charset.forName("UTF-8");
                C87412m.m108593f(forName, "forName(\"UTF-8\")");
                byte[] bytes = str2.getBytes(forName);
                C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                bVar.f127066a = new C49535ga(Base64.decode(bytes, 2));
                bVar.f127067b = new C49678ha();
                bVar.f127068c = str;
                bVar.f127069d = i;
                C89144l0.m111429e(bVar.mo72403a(), new C47938a(this, i, str3), false);
            } catch (Exception e) {
                Log.printErrStackTrace(this.f128615c, e, "do cgi", new Object[0]);
            }
        }
    }

    @JavascriptInterface
    public final void commonCgi(String str, String str2) {
        C87412m.m108594g(str, "request");
        C87412m.m108594g(str2, "callback");
        Log.m105924i(this.f128615c, "[TRACE_VIDEO_PRELOAD] jsapi cgi");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new z15();
        bVar.f127067b = new a25();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/appmsg/web_comm_prefetch";
        bVar.f127069d = 4924;
        C47350c a = bVar.mo72403a();
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.WebCommPrefetchReq");
        ((z15) aVar).f145633d = str;
        C89144l0.m111429e(a, new C47939b(this, str2), false);
    }

    @JavascriptInterface
    public final int getBasePkgVersion() {
        int i0 = ((C47940m) this.f128614b).mo63609i0();
        String str = this.f128615c;
        Log.m105924i(str, "getBasePkgVersion = " + i0);
        return i0;
    }

    @JavascriptInterface
    public final int getBizPkgVersion() {
        int u0 = ((C47940m) this.f128614b).mo63612u0();
        String str = this.f128615c;
        Log.m105924i(str, "getBizPkgVersion = " + u0);
        return u0;
    }

    @JavascriptInterface
    public final String getLocalData(String str) {
        C87412m.m108594g(str, "key");
        return ((C47940m) this.f128614b).getLocalData(str);
    }

    @JavascriptInterface
    public final void invoke(String str, String str2, String str3) {
        C87412m.m108594g(str, "func");
        C87412m.m108594g(str2, StateEvent.Name.MESSAGE);
        C87412m.m108594g(str3, "callback");
        String str4 = this.f128615c;
        Log.m105918d(str4, "invoke: " + str + ' ' + str3 + ' ' + str2);
        ((C47940m) this.f128614b).mo63606B0().mo63613h(C13854i1.m13150c(str, str2, str3), new C47936k(this, str3));
        ((C47940m) this.f128614b).mo63610p0(str, str2);
    }

    @JavascriptInterface
    public final void setLocalData(String str, String str2) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(str2, "data");
        ((C47940m) this.f128614b).setLocalData(str, str2);
    }
}
