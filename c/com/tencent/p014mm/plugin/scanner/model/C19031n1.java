package com.tencent.p014mm.plugin.scanner.model;

import com.google.android.gms.common.Scopes;
import com.tencent.map.geolocation.sapp.internal.TencentExtraKeys;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.scanner.model.C19028m1;
import java.io.StringReader;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.tencent.mm.plugin.scanner.model.n1 */
public final class C19031n1 {

    /* renamed from: a */
    public C19028m1 f53513a = new C19028m1();

    /* renamed from: a */
    public void mo24277a(String str) {
        String text;
        XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
        newInstance.setNamespaceAware(true);
        XmlPullParser newPullParser = newInstance.newPullParser();
        newPullParser.setInput(new StringReader(str));
        String str2 = "";
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            if (eventType == 1) {
                C19028m1.f53480v = this.f53513a;
            } else if (eventType == 2) {
                String name = newPullParser.getName();
                if (name.equals("name")) {
                    this.f53513a.f53481a = new C19028m1.C5156b(newPullParser.getAttributeValue((String) null, "firstName"), newPullParser.getAttributeValue((String) null, "middleName"), newPullParser.getAttributeValue((String) null, "lastName"));
                } else if (name.equals("address")) {
                    this.f53513a.f53486f = mo24278b(newPullParser);
                } else if (name.equals("deliveryAddress")) {
                    this.f53513a.f53487g = mo24278b(newPullParser);
                } else if (name.equals("homeAddress")) {
                    this.f53513a.f53488h = mo24278b(newPullParser);
                } else if (name.equals("workAddress")) {
                    this.f53513a.f53489i = mo24278b(newPullParser);
                } else if (name.equals("photo")) {
                    C19028m1 m1Var = this.f53513a;
                    mo24279c(newPullParser);
                    m1Var.getClass();
                } else if (name.equals("logo")) {
                    this.f53513a.f53484d = mo24279c(newPullParser);
                } else if (name.equals("sound")) {
                    C19028m1 m1Var2 = this.f53513a;
                    mo24279c(newPullParser);
                    m1Var2.getClass();
                }
                str2 = name;
            } else if (eventType == 4 && (text = newPullParser.getText()) != null && text.trim().length() > 0) {
                String trim = text.trim();
                if (str2.equals("nickName")) {
                    this.f53513a.f53482b = trim;
                } else if (str2.equals("photoUrl")) {
                    this.f53513a.f53483c = trim;
                } else if (str2.equals("birthday")) {
                    this.f53513a.f53485e = trim;
                } else if (str2.equals("mobilePhoneNumber")) {
                    C19028m1 m1Var3 = this.f53513a;
                    if (m1Var3.f53490j == null) {
                        m1Var3.f53490j = new ArrayList();
                    }
                    if (trim != null && !((ArrayList) m1Var3.f53490j).contains(trim)) {
                        ((ArrayList) m1Var3.f53490j).add(trim);
                    }
                } else if (str2.equals("homePhoneNumber")) {
                    C19028m1 m1Var4 = this.f53513a;
                    if (m1Var4.f53491k == null) {
                        m1Var4.f53491k = new ArrayList();
                    }
                    if (trim != null && !((ArrayList) m1Var4.f53491k).contains(trim)) {
                        ((ArrayList) m1Var4.f53491k).add(trim);
                    }
                } else if (str2.equals("workPhoneNumber")) {
                    C19028m1 m1Var5 = this.f53513a;
                    if (m1Var5.f53492l == null) {
                        m1Var5.f53492l = new ArrayList();
                    }
                    if (trim != null && !((ArrayList) m1Var5.f53492l).contains(trim)) {
                        ((ArrayList) m1Var5.f53492l).add(trim);
                    }
                } else if (str2.equals("telAVPhoneNumber")) {
                    C19028m1 m1Var6 = this.f53513a;
                    if (m1Var6.f53493m == null) {
                        m1Var6.f53493m = new ArrayList();
                    }
                    if (trim != null && !((ArrayList) m1Var6.f53493m).contains(trim)) {
                        ((ArrayList) m1Var6.f53493m).add(trim);
                    }
                } else if (str2.equals("phoneNumber")) {
                    C19028m1 m1Var7 = this.f53513a;
                    if (m1Var7.f53494n == null) {
                        m1Var7.f53494n = new ArrayList();
                    }
                    if (trim != null && !((ArrayList) m1Var7.f53494n).contains(trim)) {
                        ((ArrayList) m1Var7.f53494n).add(trim);
                    }
                } else if (str2.equals(Scopes.EMAIL)) {
                    this.f53513a.f53495o = trim;
                } else if (str2.equals(FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
                    this.f53513a.f53496p = trim;
                } else if (str2.equals("role")) {
                    this.f53513a.f53497q = trim;
                } else if (str2.equals("agent")) {
                    this.f53513a.f53498r = trim;
                } else if (str2.equals("note")) {
                    this.f53513a.f53499s = trim;
                } else if (str2.equals("url")) {
                    this.f53513a.f53500t = trim;
                } else if (str2.equals("organization")) {
                    this.f53513a.f53501u = trim;
                }
            }
        }
        C19028m1.f53480v = this.f53513a;
    }

    /* renamed from: b */
    public final C19028m1.C5155a mo24278b(XmlPullParser xmlPullParser) {
        return new C19028m1.C5155a(xmlPullParser.getAttributeValue((String) null, "postOfficeBox"), xmlPullParser.getAttributeValue((String) null, "extendedAddress"), xmlPullParser.getAttributeValue((String) null, "street"), xmlPullParser.getAttributeValue((String) null, TencentExtraKeys.LOCATION_KEY_LOCALITY), xmlPullParser.getAttributeValue((String) null, "region"), xmlPullParser.getAttributeValue((String) null, "postalCode"), xmlPullParser.getAttributeValue((String) null, "country"));
    }

    /* renamed from: c */
    public final C19028m1.C19029c mo24279c(XmlPullParser xmlPullParser) {
        return new C19028m1.C19029c(xmlPullParser.getAttributeValue((String) null, "type"), xmlPullParser.getAttributeValue((String) null, "buffer"));
    }
}
