package la3;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C86497v5;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import ob0.C35136m;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import qa3.C101087a;
import ra3.C118229a;
import sf0.C48374j0;
import ta3.C118415d;
import te3.C51163rv3;
import te3.C77949j3;

/* renamed from: la3.h */
public class C99368h implements C86497v5.C31521b {
    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        C77949j3 j3Var;
        C51163rv3 rv32;
        Element element;
        int i;
        if (aVar == null || (j3Var = aVar.f94242a) == null || (rv32 = j3Var.f227631h) == null) {
            Log.m105924i("MicroMsg.WelabNewMsgLsn", "recv null msg");
            return;
        }
        String g = C48374j0.m53718g(rv32);
        Log.m105924i("MicroMsg.WelabNewMsgLsn", "recv addMsg " + g);
        Log.m105927v("MicroMsg.Welabparser", "ABTest msg content: %s", g);
        String replaceAll = g.replaceAll(">\n+\\s*<", "><");
        C118229a aVar2 = new C118229a();
        try {
            InputSource inputSource = new InputSource(new ByteArrayInputStream(replaceAll.getBytes()));
            DocumentBuilder documentBuilder = C117472m.f351560a;
            if (documentBuilder == null) {
                documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
                C117472m.f351560a = documentBuilder;
            }
            Document parse = documentBuilder.parse(inputSource);
            parse.normalize();
            element = parse.getDocumentElement();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.Welabparser", e.toString());
            element = null;
        }
        if (element == null) {
            Log.m105921e("MicroMsg.Welabparser", "Msg parsing failed, msg: %s", replaceAll);
        } else {
            NamedNodeMap attributes = element.getAttributes();
            if (attributes == null) {
                aVar2 = null;
            } else {
                Node namedItem = attributes.getNamedItem("type");
                if (namedItem == null || !"newabtestlabs".equals(namedItem.getNodeValue())) {
                    Log.m105924i("MicroMsg.Welabparser", "recv illegal type msg");
                } else {
                    NodeList elementsByTagName = element.getElementsByTagName("prioritylevel");
                    int i2 = elementsByTagName.getLength() > 0 ? Util.getInt(elementsByTagName.item(0).getTextContent(), 1) : 1;
                    NodeList elementsByTagName2 = element.getElementsByTagName("status");
                    if (elementsByTagName2.getLength() > 0) {
                        aVar2.field_status = Util.getInt(elementsByTagName2.item(0).getTextContent(), 1);
                    }
                    aVar2.field_prioritylevel = i2;
                    NodeList childNodes = element.getChildNodes();
                    for (int i3 = 0; i3 < childNodes.getLength(); i3++) {
                        Node item = childNodes.item(i3);
                        if (item != null && item.getNodeType() == 1 && item.getNodeName().equals("expinfo")) {
                            try {
                                C117472m.m165702c((Element) item, aVar2);
                            } catch (Exception e2) {
                                Log.m105920e("MicroMsg.Welabparser", e2.getMessage());
                            }
                        }
                    }
                }
            }
        }
        if (aVar2 != null && aVar2.isValid()) {
            if (aVar2.field_status == 1) {
                C117468g.f351552c.mo182174c().delete(aVar2, "expId");
            } else {
                C117468g gVar = C117468g.f351552c;
                C101087a c = gVar.mo182174c();
                if (!c.replace(aVar2)) {
                    c.insert(aVar2);
                }
                C118415d.f353896c.mo183209c(aVar2);
                int i4 = aVar2.field_idkey;
                if (i4 > 0 && (i = aVar2.field_idkeyValue) >= 0) {
                    C115669n.INSTANCE.idkeyStat((long) i4, (long) i, 1, false);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(aVar2);
                gVar.mo182177f(arrayList);
            }
            C117470l.m165698a(aVar2.field_LabsAppId, 6, false);
        }
    }
}
