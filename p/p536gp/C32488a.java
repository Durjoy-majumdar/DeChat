package p536gp;

import com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115884f;
import com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115891k;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import eb0.C86497v5;
import java.util.Map;
import ob0.C35136m;
import sf0.C48374j0;

/* renamed from: gp.a */
public class C32488a implements C86497v5.C31521b {
    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        String g = C48374j0.m53718g(aVar.f94242a.f227631h);
        if (Util.isNullOrNil(g)) {
            Log.m105928w("CheckResUpdateSysCmdMsgListener", "msg content is null");
            return;
        }
        Log.m105918d("MicroMsg.CheckResUpdateNewXmlParser", "receive msg: \n" + g);
        if (!Util.isNullOrNil(g)) {
            Map<String, String> parseXml = XmlParser.parseXml(g, "sysmsg", (String) null);
            C115891k.m163010a(0, 0);
            Object[] objArr = new Object[1];
            objArr[0] = parseXml == null ? "null" : String.valueOf(parseXml.size());
            Log.m105925i("MicroMsg.CheckResUpdateNewXmlParser", "parsed values.size = %s", objArr);
            if (parseXml == null) {
                C115891k.m163010a(0, 30);
            } else {
                C115891k.m163010a(0, 31);
            }
            if (parseXml != null && parseXml.size() > 0 && Util.nullAsNil(parseXml.get(".sysmsg.$type")).equalsIgnoreCase("resourcemgr")) {
                C115884f.m162998c(".sysmsg", "delete", parseXml, true);
                C115884f.m162998c(".sysmsg", XWalkPlugin.PRIVATE_CACHE_DIR_NAME, parseXml, true);
                C115884f.m162998c(".sysmsg", "decrypt", parseXml, true);
            }
        }
    }
}
