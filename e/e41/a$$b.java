package e41;

import android.os.Message;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k31.C117373a;
import m41.C117535e;
import op3.C117881f;
import p31.C117924b;
import u24.C90599h;
import u31.C118568a;
import v31.C118641a;

public final /* synthetic */ class a$$b implements C1311n {

    /* renamed from: d */
    public final /* synthetic */ C116692a f349960d;

    /* renamed from: e */
    public final /* synthetic */ C1311n f349961e;

    public /* synthetic */ a$$b(C116692a aVar, C1311n nVar) {
        this.f349960d = aVar;
        this.f349961e = nVar;
    }

    public final void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Map map;
        C116692a aVar = this.f349960d;
        C1311n nVar = this.f349961e;
        aVar.getClass();
        if (nVar != null) {
            nVar.onGYNetEnd(i, i2, i3, str, uVar, bArr);
        }
        if (uVar != null && C117373a.xx0().Ex0() && !C117535e.m165797h("cgi_resp", C117373a.xx0().Bx0(uVar))) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - C117373a.xx0().yx0(uVar, "cgi_resp") >= C117373a.xx0().Ax0(uVar, "cgi_resp")) {
                C117373a.xx0().Jx0(uVar, "cgi_resp", currentTimeMillis);
                C118641a d = C118568a.m167237d(uVar, false);
                if (d != null) {
                    String str2 = null;
                    String[] split = uVar.getUri().split("/");
                    if (split != null && split.length > 0) {
                        str2 = split[split.length - 1];
                    }
                    if (!C90599h.m113511d(str2)) {
                        HashMap hashMap = new HashMap();
                        Map<String, Object> map2 = d.f355000a;
                        if (map2 != null) {
                            hashMap.putAll(map2);
                        }
                        Map<String, Map<String, Object>> map3 = d.f355001b;
                        if (!(map3 == null || (map = (Map) ((ConcurrentHashMap) map3).get("cgi_resp")) == null || map.size() <= 0)) {
                            hashMap.putAll(map);
                        }
                        Map<String, Object> e = C118568a.m167238e(uVar, "cgi_resp");
                        if (e != null && ((HashMap) e).size() > 0) {
                            hashMap.putAll(e);
                        }
                        Message obtainMessage = aVar.f349958e.obtainMessage(1014);
                        Integer valueOf = Integer.valueOf(i3);
                        List<C117924b> Cx0 = C117373a.xx0().Cx0(uVar, "cgi_resp");
                        Long valueOf2 = Long.valueOf(currentTimeMillis);
                        C117881f fVar = new C117881f();
                        fVar.f352402a = new Object[]{str2, valueOf, str, hashMap, Cx0, valueOf2};
                        obtainMessage.obj = fVar;
                        aVar.f349958e.sendMessage(obtainMessage);
                    }
                }
            }
        }
    }
}
