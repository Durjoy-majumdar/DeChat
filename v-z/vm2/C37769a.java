package vm2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C86497v5;
import f40.C86709a0;
import java.text.SimpleDateFormat;
import java.util.Map;
import l20.C21388a;
import ob0.C35136m;
import p327ct.C20362d;
import p327ct.C30914c;
import qe3.C89625d;
import sf0.C48374j0;
import tm2.C78046e;

/* renamed from: vm2.a */
public class C37769a implements C86497v5.C31521b {
    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        Class cls = C30914c.class;
        String g = C48374j0.m53718g(aVar.f94242a.f227631h);
        if (g == null || g.length() == 0) {
            Log.m105920e("MicroMsg.CrowdTestListener", "onReceiveMsg, crowdtest msgContent is null");
            return;
        }
        Map<String, String> parseXml = XmlParser.parseXml(g, "sysmsg", (String) null);
        if (parseXml != null) {
            boolean z = false;
            int i = Util.getInt(parseXml.get(".sysmsg.crowdtest.$clientversion"), 0);
            if (i > C89625d.f257841g) {
                long j = 0;
                try {
                    j = new SimpleDateFormat("yyyy-MM-dd").parse(parseXml.get(".sysmsg.crowdtest.apply.$expire")).getTime();
                } catch (Exception unused) {
                }
                if (j < System.currentTimeMillis()) {
                    C78046e.vx0();
                    return;
                }
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CROWDTEST_CLIENT_VERSION_INT, Integer.valueOf(i));
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CROWDTEST_APPLY_EXPIRE_LONG, Long.valueOf(j));
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CROWDTEST_APPLY_LINK_STRING, parseXml.get(".sysmsg.crowdtest.apply.link"));
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CROWDTEST_FEEDBACK_LINK_STRING, parseXml.get(".sysmsg.crowdtest.feedback.link"));
                int i2 = Util.getInt(parseXml.get(".sysmsg.crowdtest.apply.reddotlevel"), 0);
                C20362d sM = ((C30914c) C86312j.m106911c(cls)).mo17862sM();
                if (i2 >= 1) {
                    z = true;
                }
                ((C21388a) sM).mo33507p(262157, z);
                if (i2 < 3) {
                    ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33499h(262157, 266261);
                }
                if (i2 < 2) {
                    ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33499h(262157, 266262);
                }
            }
        }
    }
}
