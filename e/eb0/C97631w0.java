package eb0;

import com.tencent.p014mm.autogen.events.DeletePackageEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.ByteArrayInputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import ob0.C35136m;
import ob0.C35141t;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import p872ah.C67046a;
import sf0.C48374j0;
import te3.C77949j3;

/* renamed from: eb0.w0 */
public class C97631w0 implements C35141t {
    /* renamed from: Fg */
    public C35136m.C35139b mo56403Fg(C35136m.C35137a aVar) {
        NamedNodeMap attributes;
        Node namedItem;
        C77949j3 j3Var = aVar.f94242a;
        if (j3Var == null || j3Var.f227631h == null) {
            Log.m105922f("MicroMsg.DeletePackageMsgExtension", "[oneliang]DeletePackageMsgExtension failed, invalid cmdAM");
            return null;
        }
        Log.m105924i("MicroMsg.DeletePackageMsgExtension", "[oneliang]DeletePackageMsgExtension start");
        try {
            Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new ByteArrayInputStream(C48374j0.m53718g(j3Var.f227631h).getBytes("utf-8"))));
            parse.normalize();
            NodeList elementsByTagName = parse.getDocumentElement().getElementsByTagName("deletepackage");
            if (elementsByTagName != null && elementsByTagName.getLength() == 1) {
                NodeList childNodes = elementsByTagName.item(0).getChildNodes();
                int length = childNodes.getLength();
                for (int i = 0; i < length; i++) {
                    Node item = childNodes.item(i);
                    if (!(item == null || item.getNodeName() == null || !item.getNodeName().equals("pack") || (attributes = item.getAttributes()) == null || (namedItem = attributes.getNamedItem("type")) == null)) {
                        int i2 = Util.getInt(namedItem.getNodeValue(), 0);
                        DeletePackageEvent deletePackageEvent = new DeletePackageEvent();
                        deletePackageEvent.f264672d.f264673a = i2;
                        deletePackageEvent.publish();
                    }
                }
            }
            Log.m105924i("MicroMsg.DeletePackageMsgExtension", "[oneliang]DeletePackageMsgExtension end");
            return null;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.DeletePackageMsgExtension", "exception:%s", Util.stackTraceToString(e));
            return null;
        }
    }

    /* renamed from: ld */
    public void mo56404ld(C35136m.C35138c cVar) {
    }

    /* renamed from: nA */
    public /* synthetic */ boolean mo56405nA(C67046a aVar, String str, long j, String str2, String str3, String str4, int i, String str5, String str6, String str7, int i2) {
        return false;
    }
}
