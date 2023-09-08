package com.tencent.p014mm.storage;

import com.tencent.p014mm.model.newabtest.C92722a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import p749xh.C38544d;

/* renamed from: com.tencent.mm.storage.c */
public class C96980c extends C38544d implements Serializable {

    /* renamed from: E */
    public static IAutoDBItem.MAutoDBInfo f284120E = C38544d.initAutoDBInfo(C96980c.class);

    /* renamed from: D */
    public Map<String, String> f284121D = null;

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f284120E;
    }

    public boolean isValid() {
        long nowSecond = Util.nowSecond();
        return nowSecond >= this.field_startTime && nowSecond <= this.field_endTime;
    }

    /* renamed from: l2 */
    public Map<String, String> mo135598l2() {
        if (this.f284121D == null) {
            String str = this.field_rawXML;
            HashMap hashMap = new HashMap();
            Element d = C92722a.m116887d(str);
            if (d == null) {
                Log.m105921e("MicroMsg.ABTestParser", "Raw XML string parsing failed, xml: %s", str);
            } else {
                NodeList elementsByTagName = d.getElementsByTagName("args");
                if (elementsByTagName.getLength() > 0) {
                    NodeList childNodes = elementsByTagName.item(0).getChildNodes();
                    for (int i = 0; i < childNodes.getLength(); i++) {
                        Node item = childNodes.item(i);
                        if (item.getNodeType() == 1 && item.getNodeName().equals("arg")) {
                            Element element = (Element) item;
                            NodeList elementsByTagName2 = element.getElementsByTagName("key");
                            NodeList elementsByTagName3 = element.getElementsByTagName("value");
                            if (!(elementsByTagName2.getLength() == 0 || elementsByTagName3.getLength() == 0)) {
                                hashMap.put(elementsByTagName2.item(0).getTextContent(), elementsByTagName3.item(0).getTextContent());
                            }
                        }
                    }
                }
            }
            this.f284121D = hashMap;
        }
        return this.f284121D;
    }
}
