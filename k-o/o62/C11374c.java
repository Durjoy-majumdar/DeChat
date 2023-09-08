package o62;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C7241k;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import ob0.C35136m;
import p261wl.C38166b;

/* renamed from: o62.c */
public class C11374c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f33497d;

    /* renamed from: e */
    public final /* synthetic */ Map f33498e;

    /* renamed from: f */
    public final /* synthetic */ C35136m.C35137a f33499f;

    /* renamed from: g */
    public final /* synthetic */ C11373b f33500g;

    public C11374c(C11373b bVar, String str, Map map, C35136m.C35137a aVar) {
        this.f33500g = bVar;
        this.f33497d = str;
        this.f33498e = map;
        this.f33499f = aVar;
    }

    public void run() {
        C11373b bVar = this.f33500g;
        String str = this.f33497d;
        Map map = this.f33498e;
        C35136m.C35137a aVar = this.f33499f;
        bVar.getClass();
        int i = 0;
        while (true) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(i == 0 ? "" : Integer.valueOf(i));
                String str2 = (String) map.get((".sysmsg.sysmsgtemplate.content_template" + sb.toString()) + ".$type");
                if (!Util.isNullOrNil(str2)) {
                    HashSet hashSet = (HashSet) ((HashMap) bVar.f33481f).get(str2);
                    if (hashSet != null) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ((C7241k.C7249h) it.next()).mo7772K0(str, map, aVar);
                        }
                    }
                    C38166b.m41756c(C7241k.C7248g.class, str2, new b$$a(str, map, aVar));
                    i++;
                } else {
                    return;
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.SysMsgTemplateImp", e, "", new Object[0]);
                return;
            }
        }
    }
}
