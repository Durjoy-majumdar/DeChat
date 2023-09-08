package p207nl;

import c30.C104289g;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.emotion.SmileyInfo;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import java.io.InputStream;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import p490dl.C107049j;
import p490dl.C97484a;
import uc0.C90638g;

/* renamed from: nl.k */
public class C100134k {
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bb, code lost:
        if (r5 != null) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d3, code lost:
        if (r5 == null) goto L_0x00d6;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<com.tencent.p014mm.storage.emotion.SmileyPanelConfigInfo> m130827a(com.tencent.p014mm.vfs.C86009m1 r11) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.EmojiResHelper"
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            javax.xml.parsers.DocumentBuilderFactory r3 = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            r4 = 0
            r5 = 0
            java.io.InputStream r5 = com.tencent.p014mm.vfs.C86013q1.m106422D(r11)     // Catch:{ Exception -> 0x00c3 }
            javax.xml.parsers.DocumentBuilder r11 = r3.newDocumentBuilder()     // Catch:{ Exception -> 0x00c3 }
            org.w3c.dom.Document r11 = r11.parse(r5)     // Catch:{ Exception -> 0x00c3 }
            r11.normalize()     // Catch:{ Exception -> 0x00c3 }
            org.w3c.dom.Element r11 = r11.getDocumentElement()     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r3 = "item"
            org.w3c.dom.NodeList r11 = r11.getElementsByTagName(r3)     // Catch:{ Exception -> 0x00c3 }
            if (r11 == 0) goto L_0x00bb
            int r3 = r11.getLength()     // Catch:{ Exception -> 0x00c3 }
            if (r3 <= 0) goto L_0x00bb
            int r3 = r11.getLength()     // Catch:{ Exception -> 0x00c3 }
            r6 = 0
        L_0x0036:
            if (r6 >= r3) goto L_0x00bb
            org.w3c.dom.Node r7 = r11.item(r6)     // Catch:{ Exception -> 0x00c3 }
            if (r7 == 0) goto L_0x00b7
            java.lang.String r8 = r7.getTextContent()     // Catch:{ Exception -> 0x00c3 }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ Exception -> 0x00c3 }
            if (r8 != 0) goto L_0x00b7
            java.lang.String r7 = r7.getTextContent()     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r8 = "\""
            java.lang.String r7 = r7.replaceAll(r8, r0)     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r8 = "^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$"
            boolean r8 = r7.matches(r8)     // Catch:{ Exception -> 0x00c3 }
            if (r8 == 0) goto L_0x0064
            java.lang.String r8 = new java.lang.String     // Catch:{ Exception -> 0x00c3 }
            byte[] r7 = android.util.Base64.decode(r7, r4)     // Catch:{ Exception -> 0x00c3 }
            r8.<init>(r7)     // Catch:{ Exception -> 0x00c3 }
            r7 = r8
        L_0x0064:
            java.lang.String r8 = "\\\\u"
            boolean r8 = r7.startsWith(r8)     // Catch:{ Exception -> 0x00c3 }
            if (r8 == 0) goto L_0x0099
            r8 = 3
            java.lang.String r7 = r7.substring(r8)     // Catch:{ Exception -> 0x00c3 }
            r8 = 16
            int r7 = java.lang.Integer.parseInt(r7, r8)     // Catch:{ Exception -> 0x00c3 }
            char[] r7 = java.lang.Character.toChars(r7)     // Catch:{ Exception -> 0x00c3 }
            r8 = r0
            r9 = 0
        L_0x007d:
            int r10 = r7.length     // Catch:{ Exception -> 0x00c3 }
            if (r9 >= r10) goto L_0x0098
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c3 }
            r10.<init>()     // Catch:{ Exception -> 0x00c3 }
            r10.append(r8)     // Catch:{ Exception -> 0x00c3 }
            char r8 = r7[r9]     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x00c3 }
            r10.append(r8)     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r8 = r10.toString()     // Catch:{ Exception -> 0x00c3 }
            int r9 = r9 + 1
            goto L_0x007d
        L_0x0098:
            r7 = r8
        L_0x0099:
            com.tencent.mm.storage.emotion.SmileyPanelConfigInfo r8 = new com.tencent.mm.storage.emotion.SmileyPanelConfigInfo     // Catch:{ Exception -> 0x00c3 }
            r8.<init>(r6, r7)     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r7 = r8.field_key     // Catch:{ Exception -> 0x00c3 }
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)     // Catch:{ Exception -> 0x00c3 }
            if (r7 == 0) goto L_0x00ad
            java.lang.String r7 = "key is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r7)     // Catch:{ Exception -> 0x00c3 }
            goto L_0x00b0
        L_0x00ad:
            r2.add(r8)     // Catch:{ Exception -> 0x00c3 }
        L_0x00b0:
            java.lang.String r7 = r8.toString()     // Catch:{ Exception -> 0x00c3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r7)     // Catch:{ Exception -> 0x00c3 }
        L_0x00b7:
            int r6 = r6 + 1
            goto L_0x0036
        L_0x00bb:
            if (r5 == 0) goto L_0x00d6
        L_0x00bd:
            r5.close()     // Catch:{ IOException -> 0x00d6 }
            goto L_0x00d6
        L_0x00c1:
            r11 = move-exception
            goto L_0x00d7
        L_0x00c3:
            r11 = move-exception
            java.lang.String r0 = "parseSmileyPanelConfig parseXML exception:%s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00c1 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00c1 }
            r3[r4] = r11     // Catch:{ all -> 0x00c1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r3)     // Catch:{ all -> 0x00c1 }
            if (r5 == 0) goto L_0x00d6
            goto L_0x00bd
        L_0x00d6:
            return r2
        L_0x00d7:
            if (r5 == 0) goto L_0x00dc
            r5.close()     // Catch:{ IOException -> 0x00dc }
        L_0x00dc:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p207nl.C100134k.m130827a(com.tencent.mm.vfs.m1):java.util.ArrayList");
    }

    /* renamed from: b */
    public static C90638g m130828b(C86009m1 m1Var) {
        try {
            C107049j jVar = new C107049j();
            C97484a.f286123a.mo136755a(m1Var.mo119971i(), jVar);
            C90638g gVar = jVar.f320464c;
            Log.m105925i("MicroMsg.EmojiResHelper", "parserEmojiEggConfig: %s", Integer.valueOf(gVar.f260401d.size()));
            return gVar;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.EmojiResHelper", e, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    public static ArrayList<SmileyInfo> m130829c(C86009m1 m1Var) {
        ArrayList<SmileyInfo> arrayList = new ArrayList<>();
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        try {
            InputStream D = C86013q1.m106422D(m1Var);
            try {
                Document parse = newInstance.newDocumentBuilder().parse(D);
                parse.normalize();
                NodeList elementsByTagName = parse.getDocumentElement().getElementsByTagName("emoji");
                if (elementsByTagName != null && elementsByTagName.getLength() > 0) {
                    int length = elementsByTagName.getLength();
                    for (int i = 0; i < length; i++) {
                        NodeList childNodes = elementsByTagName.item(i).getChildNodes();
                        if (childNodes != null && childNodes.getLength() > 0) {
                            SmileyInfo smileyInfo = new SmileyInfo();
                            int i2 = 0;
                            while (true) {
                                int i3 = -1;
                                if (i2 >= childNodes.getLength()) {
                                    break;
                                }
                                Node item = childNodes.item(i2);
                                String nodeName = item.getNodeName();
                                if (nodeName.equalsIgnoreCase("key")) {
                                    smileyInfo.field_key = item.getTextContent();
                                } else if (nodeName.equalsIgnoreCase("cn-value")) {
                                    if (!Util.isNullOrNil(item.getTextContent())) {
                                        if (!"null".equalsIgnoreCase(item.getTextContent())) {
                                            smileyInfo.field_cnValue = item.getTextContent();
                                        }
                                    }
                                    smileyInfo.field_cnValue = smileyInfo.field_key;
                                } else if (nodeName.equalsIgnoreCase("qq-value")) {
                                    if (!Util.isNullOrNil(item.getTextContent())) {
                                        if (!"null".equalsIgnoreCase(item.getTextContent())) {
                                            smileyInfo.field_qqValue = item.getTextContent();
                                        }
                                    }
                                    smileyInfo.field_qqValue = smileyInfo.field_key;
                                } else if (nodeName.equalsIgnoreCase("en-value")) {
                                    if (!Util.isNullOrNil(item.getTextContent())) {
                                        if (!"null".equalsIgnoreCase(item.getTextContent())) {
                                            smileyInfo.field_enValue = item.getTextContent();
                                        }
                                    }
                                    smileyInfo.field_enValue = smileyInfo.field_key;
                                } else if (nodeName.equalsIgnoreCase("tw-value")) {
                                    if (!Util.isNullOrNil(item.getTextContent())) {
                                        if (!"null".equalsIgnoreCase(item.getTextContent())) {
                                            smileyInfo.field_twValue = item.getTextContent();
                                        }
                                    }
                                    smileyInfo.field_twValue = smileyInfo.field_key;
                                } else if (nodeName.equalsIgnoreCase("th-value")) {
                                    if (!Util.isNullOrNil(item.getTextContent())) {
                                        if (!"null".equalsIgnoreCase(item.getTextContent())) {
                                            smileyInfo.field_thValue = item.getTextContent();
                                        }
                                    }
                                    smileyInfo.field_thValue = smileyInfo.field_key;
                                } else if (nodeName.equalsIgnoreCase(DownloadInfo.FILENAME)) {
                                    smileyInfo.field_fileName = item.getTextContent();
                                } else if (nodeName.equalsIgnoreCase("eggIndex")) {
                                    i3 = Integer.valueOf(item.getTextContent()).intValue();
                                    smileyInfo.field_eggIndex = i3;
                                }
                                i2++;
                            }
                            smileyInfo.field_position = -1;
                            Log.m105918d("MicroMsg.EmojiResHelper", smileyInfo.toString());
                            if (Util.isNullOrNil(smileyInfo.field_key)) {
                                Log.m105924i("MicroMsg.EmojiResHelper", "key is empty");
                            } else {
                                arrayList.add(smileyInfo);
                            }
                        }
                    }
                }
                if (D != null) {
                    D.close();
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.EmojiResHelper", Util.stackTraceToString(e));
            } catch (Throwable th) {
                if (D != null) {
                    D.close();
                }
                throw th;
            }
        } catch (Exception e2) {
            Log.m105921e("MicroMsg.EmojiResHelper", "parserSmileyConfig parseXML exception:%s", e2.toString());
        } catch (Throwable th4) {
            th.addSuppressed(th4);
        }
        if (arrayList.size() == 0) {
            Log.m105928w("MicroMsg.EmojiResHelper", "parserSmileyConfig empty!");
        }
        return arrayList;
    }

    /* renamed from: d */
    public static int m130830d(String str) {
        int i = -1;
        if (C86013q1.m106450k(str)) {
            try {
                i = new C104289g(C86013q1.m106432N(str)).optInt(ProviderConstants.API_COLNAME_FEATURE_VERSION, -1);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.EmojiResHelper", e, "readConfigVersion fail", new Object[0]);
            }
        }
        Log.m105925i("MicroMsg.EmojiResHelper", "readConfigVersion: %s, %s", Integer.valueOf(i), str);
        return i;
    }
}
