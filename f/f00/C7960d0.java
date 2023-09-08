package f00;

import com.tencent.p014mm.plugin.webview.modeltools.C6079b0;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import com.tencent.p014mm.plugin.webview.modeltools.C6081p;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import di3.C86312j;
import eb0.C86497v5;
import java.util.Map;
import ob0.C35136m;
import sf0.C48374j0;
import zt3.C119157j;

/* renamed from: f00.d0 */
public class C7960d0 implements C86497v5.C31521b {

    /* renamed from: f00.d0$a */
    public class C7961a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f26647d;

        /* renamed from: e */
        public final /* synthetic */ C6079b0 f26648e;

        public C7961a(C7960d0 d0Var, String str, C6079b0 b0Var) {
            this.f26647d = str;
            this.f26648e = b0Var;
        }

        public void run() {
            Log.m105918d("WvSysMsgListener", "webview hijack sysMsgListener");
            Map<String, String> parseXml = XmlParser.parseXml(this.f26647d, "sysmsg", (String) null);
            long j = Util.getLong(parseXml.get(".sysmsg.hijackconfig.expiretime"), MAlarmHandler.NEXT_FIRE_INTERVAL);
            int i = 0;
            String str = ".sysmsg.hijackconfig.domainlist.domain";
            while (true) {
                if (i > 0) {
                    str = ".sysmsg.hijackconfig.domainlist.domain" + i;
                }
                i++;
                String str2 = parseXml.get(str);
                if (!Util.isNullOrNil(str2)) {
                    C6081p pVar = new C6081p();
                    pVar.field_expireTime = j;
                    pVar.field_host = str2;
                    this.f26648e.insert(pVar);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        String g = C48374j0.m53718g(aVar.f94242a.f227631h);
        C6080m mVar = (C6080m) C86312j.m106911c(C6080m.class);
        C6079b0 Dx0 = C6080m.Dx0();
        ((C119157j) C119157j.f356862d).mo183884o(new C7961a(this, g, Dx0));
    }
}
