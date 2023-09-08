package kk3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72963f4;
import eb0.C31543z5;
import java.util.Map;
import sc0.C36652a;

/* renamed from: kk3.b */
public class C33931b extends C36652a {

    /* renamed from: l */
    public int f91637l;

    /* renamed from: m */
    public String f91638m;

    /* renamed from: n */
    public long f91639n = 0;

    /* renamed from: o */
    public String f91640o;

    public C33931b(Map<String, String> map, C72963f4 f4Var) {
        super(map, f4Var);
    }

    /* renamed from: b */
    public boolean mo58201b() {
        Map<String, String> map = this.f97418a;
        if (map == null) {
            Log.m105920e("MicroMsg.InvokeMessageNewXmlMsg", "[parseXml] values == null ");
            return false;
        }
        if (map.containsKey(".sysmsg.invokeMessage.preContent")) {
            C72963f4 f4Var = this.f97419b;
            if (f4Var == null || f4Var.getType() == 10002) {
                this.f91638m = this.f97418a.get(".sysmsg.invokeMessage.preContent");
            } else {
                this.f91638m = this.f97419b.getContent();
            }
        }
        if (this.f97418a.containsKey(".sysmsg.invokeMessage.msgSource")) {
            this.f91640o = this.f97418a.get(".sysmsg.invokeMessage.msgSource");
        }
        if (this.f97418a.containsKey(".sysmsg.invokeMessage.timestamp")) {
            this.f91639n = Util.safeParseLong(this.f97418a.get(".sysmsg.invokeMessage.timestamp"));
        }
        if (this.f97418a.containsKey(".sysmsg.invokeMessage.type")) {
            this.f91637l = Util.safeParseInt(this.f97418a.get(".sysmsg.invokeMessage.type"));
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String next : this.f97418a.keySet()) {
            if (next.startsWith(".sysmsg.invokeMessage.text")) {
                if (sb.length() > 0) {
                    sb.insert(0, this.f97418a.get(next));
                } else {
                    sb.append(this.f97418a.get(next));
                }
            } else if (next.startsWith(".sysmsg.invokeMessage.link.text") && !Util.isNullOrNil(this.f97418a.get(next))) {
                String str = this.f97418a.get(next);
                sb.append(str);
                this.f97424g.add(str);
                i = str.length();
            }
        }
        this.f97425h.addFirst(Integer.valueOf(sb.length() - i));
        this.f97426i.add(Integer.valueOf(sb.length()));
        this.f97420c = sb.toString();
        if (C31543z5.m39453c() - this.f91639n < 300000 || Util.isNullOrNil(this.f91638m)) {
            return true;
        }
        ThreadPool.post(new C33930a(this), "[checkExpired]");
        return true;
    }
}
