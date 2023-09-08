package iz0;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import eb0.C86497v5;
import f40.C86709a0;
import hz0.C46153l0;
import java.util.Map;
import ob0.C35136m;
import oz0.C35344d;
import sf0.C48374j0;
import wz0.C22945n;

/* renamed from: iz0.h */
public class C33474h implements C86497v5.C31521b {

    /* renamed from: iz0.h$a */
    public class C33475a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f90656d;

        /* renamed from: e */
        public final /* synthetic */ C35136m.C35137a f90657e;

        public C33475a(C33474h hVar, String str, C35136m.C35137a aVar) {
            this.f90656d = str;
            this.f90657e = aVar;
        }

        public void run() {
            C86709a0.m107523b().mo121108c();
            if (C46153l0.Hx0().f124399o == null) {
                C46153l0.Hx0().f124399o = new C35344d();
            }
            C35344d dVar = C46153l0.Hx0().f124399o;
            String str = this.f90656d;
            dVar.getClass();
            Log.m105924i("MicroMsg.ShareCardMsgMgr", "sharecard onReceiveMsg msgId is " + ("" + this.f90657e.f94242a.f227638r));
            if (!TextUtils.isEmpty(str)) {
                C35344d.C35345a aVar = null;
                Map<String, String> parseXml = XmlParser.parseXml(str, "sysmsg", (String) null);
                if (parseXml != null) {
                    aVar = new C35344d.C35345a(dVar);
                    String str2 = parseXml.get(".sysmsg.notifysharecard.state_flag");
                    if (!TextUtils.isEmpty(str2) && C22945n.m27025y(str2)) {
                        Util.getInt(str2, 0);
                    }
                    String str3 = parseXml.get(".sysmsg.notifysharecard.username");
                    aVar.f94661a = parseXml.get(".sysmsg.notifysharecard.card_id");
                }
                if (aVar == null) {
                    Log.m105920e("MicroMsg.ShareCardMsgMgr", "card msg == null");
                    return;
                }
                if (TextUtils.isEmpty(aVar.f94661a)) {
                    Log.m105920e("MicroMsg.ShareCardMsgMgr", "card id == null");
                }
                Log.m105924i("MicroMsg.ShareCardMsgMgr", "sharecard doSyncNetScene card id is " + aVar.f94661a);
                C46153l0.Kx0().mo60216a();
                C22945n.m26998K();
            }
        }
    }

    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        String g = C48374j0.m53718g(aVar.f94242a.f227631h);
        if (g == null || g.length() == 0) {
            Log.m105920e("MicroMsg.SubCoreCard.notifyShareCardListener", "onReceiveMsg, msgContent is null");
        } else {
            C46153l0.Hx0().f124409y.post(new C33475a(this, g, aVar));
        }
    }
}
