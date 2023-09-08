package e41;

import android.os.Message;
import b41.C113144b;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import eb0.C116724d4;
import i41.C117140a;
import i41.C117141b;
import j41.C117298c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k31.C117373a;
import m41.C117535e;
import m41.C117536f;
import ob0.C117747y;
import op3.C117882j;
import p31.C117921a;
import p31.C117924b;
import u24.C90599h;
import u31.C118568a;
import v31.C118641a;

/* renamed from: e41.a */
public class C116692a implements C113144b, C116724d4.C116725a {

    /* renamed from: d */
    public C117140a f349957d;

    /* renamed from: e */
    public MMHandler f349958e = C117536f.m165803e(new a$$a(this));

    /* renamed from: a */
    public final void mo180703a(String str, Map<String, Object> map, List<C117924b> list, long j) {
        C117140a aVar = this.f349957d;
        if (aVar != null) {
            ((C117141b) aVar).getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("cgi_name", str);
            hashMap.putAll(map);
            C117373a xx02 = C117373a.xx0();
            C117921a.C117923b a = C117921a.m166309a();
            a.f352459b = "cgi_req";
            a.mo182705b(hashMap);
            a.mo182706c(list);
            xx02.Gx0(j, a.mo182704a());
            C117298c.m165377a().mo181967b(j, "cgi_req", (Object) null, hashMap);
        }
    }

    /* renamed from: b */
    public final void mo180704b(String str, int i, String str2, Map<String, Object> map, List<C117924b> list, long j) {
        C117140a aVar = this.f349957d;
        if (aVar != null) {
            ((C117141b) aVar).getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("cgi_err_code", Integer.valueOf(i));
            hashMap.put("cgi_err_msg", str2);
            hashMap.put("cgi_name", str);
            hashMap.putAll(map);
            C117373a xx02 = C117373a.xx0();
            C117921a.C117923b a = C117921a.m166309a();
            a.f352459b = "cgi_resp";
            a.mo182705b(hashMap);
            a.mo182706c(list);
            xx02.Gx0(j, a.mo182704a());
            C117298c.m165377a().mo181967b(j, "cgi_resp", (Object) null, hashMap);
        }
    }

    /* renamed from: j2 */
    public C1311n mo180705j2(C1311n nVar, C117747y yVar) {
        return new a$$b(this, nVar);
    }

    /* renamed from: s4 */
    public int mo180706s4(C117747y yVar) {
        C114799u reqResp;
        Map map;
        if (yVar != null && (reqResp = yVar.getReqResp()) != null && C117373a.xx0().Ex0() && !C117535e.m165797h("cgi_req", C117373a.xx0().Bx0(reqResp))) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - C117373a.xx0().yx0(reqResp, "cgi_req") >= C117373a.xx0().Ax0(reqResp, "cgi_req")) {
                C117373a.xx0().Jx0(reqResp, "cgi_req", currentTimeMillis);
                C118641a d = C118568a.m167237d(reqResp, false);
                if (d != null) {
                    String str = null;
                    String[] split = reqResp.getUri().split("/");
                    if (split != null && split.length > 0) {
                        str = split[split.length - 1];
                    }
                    if (!C90599h.m113511d(str)) {
                        HashMap hashMap = new HashMap();
                        Map<String, Object> map2 = d.f355000a;
                        if (map2 != null) {
                            hashMap.putAll(map2);
                        }
                        Map<String, Map<String, Object>> map3 = d.f355001b;
                        if (!(map3 == null || (map = (Map) ((ConcurrentHashMap) map3).get("cgi_req")) == null || map.size() <= 0)) {
                            hashMap.putAll(map);
                        }
                        Map<String, Object> e = C118568a.m167238e(reqResp, "cgi_req");
                        if (e != null && ((HashMap) e).size() > 0) {
                            hashMap.putAll(e);
                        }
                        Message obtainMessage = this.f349958e.obtainMessage(1013);
                        obtainMessage.obj = C117882j.m166286e(str, hashMap, C117373a.xx0().Cx0(reqResp, "cgi_req"), Long.valueOf(currentTimeMillis));
                        this.f349958e.sendMessage(obtainMessage);
                    }
                }
            }
        }
        return 0;
    }
}
