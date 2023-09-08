package k61;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import te3.C101800k70;

/* renamed from: k61.c */
public class C99105c {
    /* renamed from: a */
    public static ArrayList<C101800k70> m129076a(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.emoji.EmojiBackupXMLParser", "[backup emotion parser] parse xml faild. xml is null.");
            return null;
        }
        try {
            Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new ByteArrayInputStream(str.getBytes())));
            parse.normalize();
            NodeList elementsByTagName = parse.getDocumentElement().getElementsByTagName("EmojiMd5");
            if (elementsByTagName != null && elementsByTagName.getLength() > 0) {
                ArrayList<C101800k70> arrayList = new ArrayList<>();
                int length = elementsByTagName.getLength();
                for (int i = 0; i < length; i++) {
                    Node item = elementsByTagName.item(i);
                    C101800k70 k702 = new C101800k70();
                    String lowerCase = item.getTextContent().toLowerCase();
                    NamedNodeMap attributes = item.getAttributes();
                    Node namedItem = attributes.getNamedItem("thumburl");
                    if (namedItem != null) {
                        k702.f298588f = namedItem.getNodeValue();
                    }
                    Node namedItem2 = attributes.getNamedItem("cdnurl");
                    if (namedItem2 != null) {
                        k702.f298587e = namedItem2.getNodeValue();
                    }
                    Node namedItem3 = attributes.getNamedItem("productid");
                    if (namedItem3 != null) {
                        k702.f298592j = namedItem3.getNodeValue();
                    }
                    Node namedItem4 = attributes.getNamedItem("designerid");
                    if (namedItem4 != null) {
                        k702.f298589g = namedItem4.getNodeValue();
                    }
                    Node namedItem5 = attributes.getNamedItem("aeskey");
                    if (namedItem5 != null) {
                        k702.f298591i = namedItem5.getNodeValue();
                    }
                    Node namedItem6 = attributes.getNamedItem("encrypturl");
                    if (namedItem6 != null) {
                        k702.f298590h = namedItem6.getNodeValue();
                    }
                    Node namedItem7 = attributes.getNamedItem("activityid");
                    if (namedItem7 != null) {
                        k702.f298595p = namedItem7.getNodeValue();
                    }
                    k702.f298586d = lowerCase;
                    arrayList.add(k702);
                }
                return arrayList;
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.emoji.EmojiBackupXMLParser", "[parser] parseXML exception:%s", e.toString());
        }
        return null;
    }
}
