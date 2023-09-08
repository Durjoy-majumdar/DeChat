package fj0;

import android.text.TextUtils;
import android.util.Xml;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import ej0.C86524b;
import ej0.C86531f;
import hj0.C87531a;
import hj0.C87532b;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: fj0.u */
public class C86907u {

    /* renamed from: a */
    public XmlPullParser f252234a = Xml.newPullParser();

    /* renamed from: a */
    public static C86907u m107925a() {
        return new C86907u();
    }

    /* renamed from: b */
    public HashMap<String, C87531a> mo121357b(String str) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        HashMap<String, C87531a> hashMap = new HashMap<>();
        try {
            this.f252234a.setInput(byteArrayInputStream, "utf-8");
            this.f252234a.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            int eventType = this.f252234a.getEventType();
            while (eventType != 1) {
                String name = this.f252234a.getName();
                if (name == null) {
                    eventType = this.f252234a.next();
                } else {
                    if (eventType == 2) {
                        C87531a aVar = new C87531a();
                        int attributeCount = this.f252234a.getAttributeCount();
                        for (int i = 0; i < attributeCount; i++) {
                            aVar.f253587b.mo122002b(this.f252234a.getAttributeName(i), this.f252234a.getAttributeValue(i));
                        }
                        int next = this.f252234a.next();
                        if (next == 2) {
                            hashMap.put(name, aVar);
                            eventType = next;
                        } else if (next == 4) {
                            aVar.f253586a = this.f252234a.getText().trim();
                            hashMap.put(name, aVar);
                        } else if (next == 3) {
                            hashMap.put(name, aVar);
                        }
                    }
                    eventType = this.f252234a.next();
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
        return hashMap;
    }

    /* renamed from: c */
    public C86524b mo121358c(InputStream inputStream) {
        C86524b bVar;
        synchronized (C86907u.class) {
            C86524b bVar2 = null;
            try {
                this.f252234a.setInput(inputStream, "utf-8");
                int eventType = this.f252234a.getEventType();
                bVar = new C86524b();
                C86531f fVar = null;
                while (eventType != 1) {
                    if (eventType == 2) {
                        String name = this.f252234a.getName();
                        if ("major".equalsIgnoreCase(name)) {
                            String nextText = this.f252234a.nextText();
                            if (!TextUtils.isEmpty(nextText)) {
                                bVar.f251375d = Integer.parseInt(nextText);
                            }
                        } else if ("minor".equalsIgnoreCase(name)) {
                            String nextText2 = this.f252234a.nextText();
                            if (!TextUtils.isEmpty(nextText2)) {
                                bVar.f251376e = Integer.parseInt(nextText2);
                            }
                        } else if ("deviceType".equalsIgnoreCase(name)) {
                            bVar.f251377f = this.f252234a.nextText();
                        } else if ("friendlyName".equalsIgnoreCase(name)) {
                            bVar.f251378g = this.f252234a.nextText();
                        } else if ("UDN".equalsIgnoreCase(name)) {
                            bVar.f251380i = this.f252234a.nextText();
                        } else if ("manufacturer".equalsIgnoreCase(name)) {
                            bVar.f251379h = this.f252234a.nextText();
                        } else if ("service".equalsIgnoreCase(name)) {
                            fVar = new C86531f();
                        } else if ("serviceType".equalsIgnoreCase(name)) {
                            if (fVar != null) {
                                fVar.f251396a = this.f252234a.nextText();
                            }
                        } else if ("serviceId".equalsIgnoreCase(name)) {
                            if (fVar != null) {
                                fVar.f251397b = this.f252234a.nextText();
                            }
                        } else if ("controlURL".equalsIgnoreCase(name)) {
                            if (fVar != null) {
                                fVar.f251399d = this.f252234a.nextText();
                            }
                        } else if ("eventSubURL".equalsIgnoreCase(name)) {
                            if (fVar != null) {
                                fVar.f251400e = this.f252234a.nextText();
                            }
                        } else if ("SCPDURL".equalsIgnoreCase(name) && fVar != null) {
                            fVar.f251398c = this.f252234a.nextText();
                        }
                    } else if (eventType == 3) {
                        try {
                            if ("service".equalsIgnoreCase(this.f252234a.getName()) && fVar != null) {
                                bVar.f251381j.add(fVar);
                                fVar = null;
                            }
                        } catch (IOException | XmlPullParserException unused) {
                            bVar2 = bVar;
                            bVar = bVar2;
                            return bVar;
                        }
                    }
                    eventType = this.f252234a.next();
                }
            } catch (IOException | XmlPullParserException unused2) {
                bVar = bVar2;
                return bVar;
            }
        }
        return bVar;
    }

    /* renamed from: d */
    public C87532b mo121359d(String str) {
        C87532b bVar = null;
        if (str == null) {
            return null;
        }
        if (str.startsWith("NOTIFY") || str.startsWith("HTTP")) {
            bVar = new C87532b();
            String[] split = str.split(APLogFileUtil.SEPARATOR_LINE);
            if (split.length > 0) {
                String[] split2 = split[0].split(" ");
                if (split2[0].startsWith("HTTP")) {
                    bVar.mo122002b("VERSION", split2[0]);
                    bVar.mo122002b("RESPONSE_CODE", split2[1]);
                    bVar.mo122002b("RESPONSE_DESCRIPTION", split2[2]);
                } else {
                    bVar.mo122002b("METHOD", split2[0]);
                    bVar.mo122002b("PATH", split2[1]);
                    bVar.mo122002b("VERSION", split2[2]);
                }
            }
            for (int i = 1; i < split.length; i++) {
                String str2 = split[i];
                int indexOf = str2.indexOf(XVFSFile.PATH_SEPARATOR);
                bVar.mo122002b(str2.substring(0, indexOf).toUpperCase(), str2.substring(indexOf + 1, str2.length()).trim());
            }
        }
        return bVar;
    }
}
