package yx0;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import android.util.Base64;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C28947a;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.network.C114766b;
import com.tencent.p014mm.plugin.brandservice.api.TransferRequestInfo;
import com.tencent.p014mm.plugin.brandservice.api.TransferResultInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import eb0.C31543z5;
import ex0.C45698f;
import ex0.C45699g;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import kotlin.Metadata;
import org.json.JSONObject;
import q20.C89449a;
import rx3.C13598b0;
import te3.C52109yf2;
import te3.C52129yk2;
import te3.C52278zk2;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: yx0.d */
public final class C53620d implements C45698f {

    /* renamed from: d */
    public static final C0000n0 f150663d = C53930o0.m60554a(((C53884f2) C53959v2.m60598a((C53973z1) null, 1, (Object) null)).plus(C53872d1.f151119c));

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, mo182094d2 = {"Lyx0/d$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/brandservice/api/TransferRequestInfo;", "Lcom/tencent/mm/plugin/brandservice/api/TransferResultInfo;", "<init>", "()V", "a", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: yx0.d$a */
    public static final class C53621a implements C80883e<TransferRequestInfo, TransferResultInfo> {

        /* renamed from: yx0.d$a$a */
        public static final class C53622a {
            public C53622a(C8480h hVar) {
            }
        }

        static {
            new C53622a((C8480h) null);
        }

        public void invoke(Object obj, C1256g gVar) {
            TransferRequestInfo transferRequestInfo = (TransferRequestInfo) obj;
            if (transferRequestInfo != null) {
                C53895h.m60466d(C53620d.f150663d, (C66212f) null, (C53934p0) null, new C53617c(transferRequestInfo, new C53624e(gVar), (C15601d<? super C53617c>) null), 3, (Object) null);
            } else if (gVar != null) {
                TransferResultInfo transferResultInfo = new TransferResultInfo();
                transferResultInfo.f109036d = 1;
                transferResultInfo.f109037e = "request invalid";
                gVar.mo894a(transferResultInfo);
            }
        }
    }

    /* renamed from: yx0.d$b */
    public static final class C53623b extends C87413o implements C32226l<TransferResultInfo, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C45699g f150664d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53623b(C45699g gVar) {
            super(1);
            this.f150664d = gVar;
        }

        public Object invoke(Object obj) {
            TransferResultInfo transferResultInfo = (TransferResultInfo) obj;
            C87412m.m108594g(transferResultInfo, "result");
            C45699g gVar = this.f150664d;
            if (gVar != null) {
                gVar.mo66581b(transferResultInfo.f109036d, transferResultInfo.f109037e, transferResultInfo.f109038f);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: RT */
    public void mo71195RT(TransferRequestInfo transferRequestInfo, C45699g gVar) {
        if (transferRequestInfo == null) {
            if (gVar != null) {
                gVar.mo66581b(1, "invalid requestInfo", (C52278zk2) null);
            }
        } else if (gVar != null && gVar.mo66580a(transferRequestInfo)) {
            Log.m105928w("MicroMsg.TransferRequestServiceImpl", "transferRequest intercepted");
        } else if (MMApplicationContext.isMainProcess()) {
            C53895h.m60466d(f150663d, (C66212f) null, (C53934p0) null, new C53617c(transferRequestInfo, gVar, (C15601d<? super C53617c>) null), 3, (Object) null);
        } else {
            String str = WeChatProcess.PROCESS_MAIN;
            C87412m.m108593f(str, "PROCESS_MAIN");
            C28947a.m38500a(str, transferRequestInfo, new C53621a(), new C53623b(gVar));
        }
    }

    /* renamed from: YC */
    public void mo71196YC(JSONObject jSONObject, C45699g gVar) {
        TransferRequestInfo transferRequestInfo;
        if (jSONObject != null) {
            try {
                transferRequestInfo = new TransferRequestInfo();
                transferRequestInfo.f109024d = jSONObject.optInt("type", -1);
                transferRequestInfo.f109025e = jSONObject.optString("h5Url");
                transferRequestInfo.f109026f = jSONObject.optString("scope");
                C52129yk2 yk22 = new C52129yk2();
                transferRequestInfo.f109028h = yk22;
                yk22.f145341d = jSONObject.optString("reqUrl");
                transferRequestInfo.f109028h.f145343f = jSONObject.optInt("cgiCmdId");
                transferRequestInfo.f109028h.f145342e = jSONObject.getJSONObject("reqBody").toString();
                transferRequestInfo.f109028h.f145345h = jSONObject.optInt(FirebaseAnalytics.C113379b.METHOD);
                transferRequestInfo.f109031n = jSONObject.optBoolean("needVerifySignature", false);
                transferRequestInfo.f109029i = jSONObject.optBoolean("is_security_check", false);
                if (jSONObject.has("signText") && !Util.isNullOrNil(jSONObject.optString("signText"))) {
                    String str = "|" + C31543z5.m39451a() + "|" + ((!jSONObject.has("shortPrefix") || !transferRequestInfo.f109025e.contains(jSONObject.optString("shortPrefix"))) ? jSONObject.optString("h5Url") : jSONObject.optString("shortPrefix"));
                    String c = C114766b.f344135e.mo174418c(jSONObject.optString("signText") + str);
                    if (!Util.isNullOrNil(c)) {
                        String encodeToString = Base64.encodeToString(c.getBytes(StandardCharsets.ISO_8859_1), 2);
                        C52109yf2 yf22 = new C52109yf2();
                        yf22.f145258d = jSONObject.optString("signSignatureHeaderKey", "X-WXGAME-TRANSFER-SIGATURE");
                        yf22.f145259e = encodeToString;
                        transferRequestInfo.f109028h.f145344g.push(yf22);
                        C52109yf2 yf23 = new C52109yf2();
                        yf23.f145258d = jSONObject.optString("signSuffixHeaderKey", "X-WXGAME-TRANSFER-SIGATURE-SUFFIX");
                        yf23.f145259e = str;
                        transferRequestInfo.f109028h.f145344g.push(yf23);
                    }
                }
                String optString = jSONObject.optString("header");
                if (!Util.isNullOrNil(optString)) {
                    JSONObject jSONObject2 = new JSONObject(optString);
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String optString2 = jSONObject2.optString(next);
                        C52109yf2 yf24 = new C52109yf2();
                        yf24.f145258d = next;
                        yf24.f145259e = optString2;
                        transferRequestInfo.f109028h.f145344g.push(yf24);
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.TransferRequestInfo", e, "parseTransferRequestInfo from json exception", new Object[0]);
                transferRequestInfo = null;
            }
            mo71195RT(transferRequestInfo, gVar);
        }
    }
}
