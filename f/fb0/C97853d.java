package fb0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.ByteArrayInputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/* renamed from: fb0.d */
public class C97853d {

    /* renamed from: a */
    public C31992c f287021a = null;

    /* renamed from: a */
    public boolean mo137179a() {
        return this.f287021a != null;
    }

    /* renamed from: b */
    public final void mo137180b(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.abtest.AbTestManager", "[Abtest] parse xml faild. xml is null.");
            return;
        }
        Log.m105925i("MicroMsg.abtest.AbTestManager", "[Abtest] parseXML content:%s", str);
        try {
            Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new ByteArrayInputStream(str.getBytes())));
            parse.normalize();
            NodeList elementsByTagName = parse.getDocumentElement().getElementsByTagName("testcase");
            if (elementsByTagName != null) {
                for (int i = 0; i < elementsByTagName.getLength(); i++) {
                    C31992c cVar = new C31992c();
                    NodeList childNodes = elementsByTagName.item(i).getChildNodes();
                    int length = childNodes.getLength();
                    for (int i2 = 0; i2 < length; i2++) {
                        Node item = childNodes.item(i2);
                        if (item != null && item.getNodeName() != null && item.getNodeName().equals("testpoint")) {
                            NamedNodeMap attributes = item.getAttributes();
                            C97854g gVar = new C97854g();
                            if (attributes != null) {
                                Node namedItem = attributes.getNamedItem("id");
                                if (namedItem != null) {
                                    String nodeValue = namedItem.getNodeValue();
                                    Log.m105919d("MicroMsg.abtest.AbTestManager", "[Abtest] idValue:%s", nodeValue);
                                    gVar.f287022a = nodeValue;
                                }
                                Node namedItem2 = attributes.getNamedItem("reportid");
                                if (namedItem2 != null) {
                                    Log.m105919d("MicroMsg.abtest.AbTestManager", "[Abtest] reportIdValue:%s", namedItem2.getNodeValue());
                                }
                            }
                            Log.m105919d("MicroMsg.abtest.AbTestManager", "[Abtest] casePointContent:%s", item.getTextContent());
                            cVar.f85184b.put(gVar.f287022a, gVar);
                        } else if (item != null && item.getNodeName() != null && item.getNodeName().equals("verifymd5")) {
                            Log.m105919d("MicroMsg.abtest.AbTestManager", "[Abtest] verifymd5Content:%s", item.getTextContent());
                        } else if (item != null && item.getNodeName() != null && item.getNodeName().equals("testcaseid")) {
                            String textContent = item.getTextContent();
                            Log.m105919d("MicroMsg.abtest.AbTestManager", "[Abtest] testcaseidContent:%s", textContent);
                            cVar.f85183a = textContent;
                        } else if (item != null && item.getNodeName() != null && item.getNodeName().equals("starttime")) {
                            Log.m105919d("MicroMsg.abtest.AbTestManager", "[Abtest] starttimeContent:%s", item.getTextContent());
                        } else if (!(item == null || item.getNodeName() == null || !item.getNodeName().equals("endtime"))) {
                            Log.m105919d("MicroMsg.abtest.AbTestManager", "[Abtest] endtimeContent:%s", item.getTextContent());
                        }
                    }
                    if (Util.isNullOrNil(cVar.f85183a) || !"0".equals(cVar.f85183a)) {
                        this.f287021a = cVar;
                    }
                }
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.abtest.AbTestManager", "[Abtest] parseXML exception:%s", e.toString());
        }
    }
}
