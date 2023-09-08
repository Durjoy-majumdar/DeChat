package wn0;

import com.tencent.p014mm.plugin.brandservice.api.TransferRequestInfo;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import ex0.C45699g;
import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedList;
import kr0.C88267e;
import org.json.JSONObject;
import te3.C52109yf2;
import te3.C52278zk2;

/* renamed from: wn0.b */
public final class C53189b implements C45699g {

    /* renamed from: a */
    public final /* synthetic */ C53190c f148382a;

    /* renamed from: b */
    public final /* synthetic */ int f148383b;

    /* renamed from: c */
    public final /* synthetic */ C88267e f148384c;

    public C53189b(C53190c cVar, int i, C88267e eVar) {
        this.f148382a = cVar;
        this.f148383b = i;
        this.f148384c = eVar;
    }

    /* renamed from: a */
    public boolean mo66580a(TransferRequestInfo transferRequestInfo) {
        return false;
    }

    /* renamed from: b */
    public void mo66581b(int i, String str, C52278zk2 zk22) {
        HashMap hashMap = new HashMap();
        String w = this.f148382a.mo73867w();
        StringBuilder sb = new StringBuilder();
        sb.append("[transferRequest-");
        sb.append(this.f148383b);
        sb.append("] errMsg: ");
        sb.append(str);
        sb.append(", response: ");
        int i2 = -1;
        if (zk22 != null) {
            i2 = zk22.f146051d;
        }
        sb.append(i2);
        Log.m105924i(w, sb.toString());
        if (zk22 != null) {
            hashMap.put("errCode", Integer.valueOf(zk22.f146051d));
            String str2 = zk22.f146053f;
            String str3 = "";
            if (str2 == null) {
                str2 = str3;
            }
            hashMap.put("result", str2);
            LinkedList<C52109yf2> linkedList = zk22.f146054g;
            C87412m.m108593f(linkedList, "response.header");
            if (!linkedList.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                LinkedList<C52109yf2> linkedList2 = zk22.f146054g;
                C87412m.m108593f(linkedList2, "response.header");
                for (C52109yf2 yf22 : linkedList2) {
                    String str4 = yf22.f145258d;
                    if (!(str4 == null || str4.length() == 0)) {
                        jSONObject.put(yf22.f145258d, yf22.f145259e);
                    }
                }
                hashMap.put("header", jSONObject);
            }
            int i3 = zk22.f146051d;
            if (i3 == 0) {
                C88267e eVar = this.f148384c;
                int i4 = this.f148383b;
                C53190c cVar = this.f148382a;
                cVar.getClass();
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                }
                hashMap.put("errno", 0);
                eVar.mo109647a(i4, cVar.mo115114o("ok", hashMap));
                return;
            }
            C88267e eVar2 = this.f148384c;
            int i5 = this.f148383b;
            C53190c cVar2 = this.f148382a;
            String str5 = "fail " + zk22.f146052e;
            cVar2.getClass();
            if (str5 != null) {
                str3 = str5;
            }
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", Integer.valueOf(i3), str3);
            }
            hashMap.put("errno", Integer.valueOf(i3));
            eVar2.mo109647a(i5, cVar2.mo115114o(str3, hashMap));
            return;
        }
        hashMap.put("errCode", -1);
        C88267e eVar3 = this.f148384c;
        int i6 = this.f148383b;
        C53190c cVar3 = this.f148382a;
        cVar3.getClass();
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", -1, "fail");
        }
        hashMap.put("errno", -1);
        eVar3.mo109647a(i6, cVar3.mo115114o("fail", hashMap));
    }
}
