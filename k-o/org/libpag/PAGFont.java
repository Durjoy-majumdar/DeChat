package org.libpag;

import a34.C79461a;
import android.content.res.AssetManager;
import android.util.Xml;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;

public class PAGFont {
    private static final String DefaultLanguage = "zh-Hans";
    private static final Pattern FILENAME_WHITESPACE_PATTERN = Pattern.compile("^[ \\n\\r\\t]+|[ \\n\\r\\t]+$");
    private static final String[] FallbackFontFileNames = {"/system/fonts/NotoSansCJK-Regular.ttc", "/system/fonts/NotoSansSC-Regular.otf", "/system/fonts/DroidSansFallback.ttf"};
    private static final String SystemFontConfigPath_JellyBean = "/system/etc/fallback_fonts.xml";
    private static final String SystemFontConfigPath_Lollipop = "/system/etc/fonts.xml";
    private static final String SystemFontPath = "/system/fonts/";
    private static boolean systemFontLoaded = false;
    public String fontFamily;
    public String fontStyle;

    public static class FontConfig {
        public String fileName;
        public String language;
        public int ttcIndex;
        public int weight;

        private FontConfig() {
            this.language = "";
            this.fileName = "";
            this.ttcIndex = 0;
            this.weight = 400;
        }
    }

    static {
        C79461a.m96419a("pag");
    }

    public PAGFont() {
        this.fontFamily = "";
        this.fontStyle = "";
    }

    private static void RegisterFallbackFonts() {
        if (!systemFontLoaded) {
            systemFontLoaded = true;
            int i = 0;
            FontConfig[] fontConfigArr = new FontConfig[0];
            if (new File(SystemFontConfigPath_Lollipop).exists()) {
                try {
                    fontConfigArr = parseLollipop();
                } catch (Exception unused) {
                }
            } else {
                fontConfigArr = parseJellyBean();
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            FontConfig fontByLanguage = getFontByLanguage(fontConfigArr, DefaultLanguage);
            if (fontByLanguage != null) {
                addFont(fontByLanguage, arrayList, arrayList2);
            }
            for (String str : FallbackFontFileNames) {
                FontConfig fontConfig = new FontConfig();
                fontConfig.fileName = str;
                addFont(fontConfig, arrayList, arrayList2);
            }
            for (FontConfig addFont : fontConfigArr) {
                addFont(addFont, arrayList, arrayList2);
            }
            if (!arrayList.isEmpty()) {
                String[] strArr = new String[arrayList.size()];
                arrayList.toArray(strArr);
                int[] iArr = new int[arrayList2.size()];
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    iArr[i] = ((Integer) it.next()).intValue();
                    i++;
                }
                SetFallbackFontPaths(strArr, iArr);
            }
        }
    }

    public static native PAGFont RegisterFont(AssetManager assetManager, String str, int i, String str2, String str3);

    public static PAGFont RegisterFont(String str) {
        return RegisterFont(str, 0);
    }

    public static native PAGFont RegisterFont(String str, int i, String str2, String str3);

    public static PAGFont RegisterFontBytes(byte[] bArr, int i, int i2) {
        return RegisterFontBytes(bArr, i, i2, "", "");
    }

    private static native PAGFont RegisterFontBytes(byte[] bArr, int i, int i2, String str, String str2);

    private static native void SetFallbackFontPaths(String[] strArr, int[] iArr);

    private static native void UnregisterFont(String str, String str2);

    public static void UnregisterFont(PAGFont pAGFont) {
        UnregisterFont(pAGFont.fontFamily, pAGFont.fontStyle);
    }

    private static void addFont(FontConfig fontConfig, ArrayList<String> arrayList, ArrayList<Integer> arrayList2) {
        if (!arrayList.contains(fontConfig.fileName) && new File(fontConfig.fileName).exists()) {
            arrayList.add(fontConfig.fileName);
            arrayList2.add(Integer.valueOf(fontConfig.ttcIndex));
        }
    }

    private static FontConfig getFontByLanguage(FontConfig[] fontConfigArr, String str) {
        String lowerCase = str.toLowerCase();
        for (FontConfig fontConfig : fontConfigArr) {
            if (fontConfig.language.toLowerCase().equals(lowerCase)) {
                return fontConfig;
            }
        }
        return null;
    }

    private static FontConfig[] parseJellyBean() {
        FontConfig[] fontConfigArr = new FontConfig[0];
        try {
            FileInputStream fileInputStream = new FileInputStream(SystemFontConfigPath_JellyBean);
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(fileInputStream, (String) null);
                newPullParser.nextTag();
                return readFamiliesJellyBean(newPullParser);
            } finally {
                fileInputStream.close();
            }
        } catch (IOException unused) {
            return fontConfigArr;
        }
    }

    private static FontConfig[] parseLollipop() {
        FontConfig[] fontConfigArr = new FontConfig[0];
        try {
            FileInputStream fileInputStream = new FileInputStream(SystemFontConfigPath_Lollipop);
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(fileInputStream, (String) null);
                newPullParser.nextTag();
                return readFamilies(newPullParser);
            } finally {
                fileInputStream.close();
            }
        } catch (IOException unused) {
            return fontConfigArr;
        }
    }

    private static FontConfig[] readFamilies(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        xmlPullParser.require(2, (String) null, "familyset");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("family")) {
                    readFamily(xmlPullParser, arrayList);
                } else {
                    skip(xmlPullParser);
                }
            }
        }
        FontConfig[] fontConfigArr = new FontConfig[arrayList.size()];
        arrayList.toArray(fontConfigArr);
        return fontConfigArr;
    }

    private static FontConfig[] readFamiliesJellyBean(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        xmlPullParser.require(2, (String) null, "familyset");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("family")) {
                    while (xmlPullParser.next() != 3) {
                        if (xmlPullParser.getEventType() == 2) {
                            if (xmlPullParser.getName().equals("fileset")) {
                                readFileset(xmlPullParser, arrayList);
                            } else {
                                skip(xmlPullParser);
                            }
                        }
                    }
                } else {
                    skip(xmlPullParser);
                }
            }
        }
        FontConfig[] fontConfigArr = new FontConfig[arrayList.size()];
        arrayList.toArray(fontConfigArr);
        return fontConfigArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: org.libpag.PAGFont$FontConfig} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void readFamily(org.xmlpull.v1.XmlPullParser r6, java.util.ArrayList<org.libpag.PAGFont.FontConfig> r7) {
        /*
            r0 = 0
            java.lang.String r1 = "name"
            r6.getAttributeValue(r0, r1)
            java.lang.String r1 = "lang"
            java.lang.String r1 = r6.getAttributeValue(r0, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0013:
            int r3 = r6.next()
            r4 = 3
            if (r3 == r4) goto L_0x003a
            int r3 = r6.getEventType()
            r4 = 2
            if (r3 == r4) goto L_0x0022
            goto L_0x0013
        L_0x0022:
            java.lang.String r3 = r6.getName()
            java.lang.String r4 = "font"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0036
            org.libpag.PAGFont$FontConfig r3 = readFont(r6)
            r2.add(r3)
            goto L_0x0013
        L_0x0036:
            skip(r6)
            goto L_0x0013
        L_0x003a:
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L_0x0041
            return
        L_0x0041:
            java.util.Iterator r6 = r2.iterator()
        L_0x0045:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x0058
            java.lang.Object r3 = r6.next()
            org.libpag.PAGFont$FontConfig r3 = (org.libpag.PAGFont.FontConfig) r3
            int r4 = r3.weight
            r5 = 400(0x190, float:5.6E-43)
            if (r4 != r5) goto L_0x0045
            r0 = r3
        L_0x0058:
            if (r0 != 0) goto L_0x0062
            r6 = 0
            java.lang.Object r6 = r2.get(r6)
            r0 = r6
            org.libpag.PAGFont$FontConfig r0 = (org.libpag.PAGFont.FontConfig) r0
        L_0x0062:
            java.lang.String r6 = r0.fileName
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0073
            if (r1 != 0) goto L_0x006e
            java.lang.String r1 = ""
        L_0x006e:
            r0.language = r1
            r7.add(r0)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.libpag.PAGFont.readFamily(org.xmlpull.v1.XmlPullParser, java.util.ArrayList):void");
    }

    private static void readFileset(XmlPullParser xmlPullParser, ArrayList<FontConfig> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("file")) {
                    arrayList2.add(readFont(xmlPullParser));
                } else {
                    skip(xmlPullParser);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            FontConfig fontConfig = null;
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                FontConfig fontConfig2 = (FontConfig) it.next();
                if (fontConfig2.weight == 400) {
                    fontConfig = fontConfig2;
                    break;
                }
            }
            if (fontConfig == null) {
                fontConfig = (FontConfig) arrayList2.get(0);
            }
            if (!fontConfig.fileName.isEmpty()) {
                arrayList.add(fontConfig);
            }
        }
    }

    private static FontConfig readFont(XmlPullParser xmlPullParser) {
        FontConfig fontConfig = new FontConfig();
        String attributeValue = xmlPullParser.getAttributeValue((String) null, FirebaseAnalytics.C113379b.INDEX);
        fontConfig.ttcIndex = attributeValue == null ? 0 : Integer.parseInt(attributeValue);
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "weight");
        fontConfig.weight = attributeValue2 == null ? 400 : Integer.parseInt(attributeValue2);
        StringBuilder sb = new StringBuilder();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 4) {
                sb.append(xmlPullParser.getText());
            }
            if (xmlPullParser.getEventType() == 2) {
                skip(xmlPullParser);
            }
        }
        fontConfig.fileName = SystemFontPath + FILENAME_WHITESPACE_PATTERN.matcher(sb).replaceAll("");
        return fontConfig;
    }

    private static void skip(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static PAGFont RegisterFont(AssetManager assetManager, String str) {
        return RegisterFont(assetManager, str, 0);
    }

    public static PAGFont RegisterFont(AssetManager assetManager, String str, int i) {
        return RegisterFont(assetManager, str, i, "", "");
    }

    public PAGFont(String str, String str2) {
        this.fontFamily = str;
        this.fontStyle = str2;
    }

    public static PAGFont RegisterFont(String str, int i) {
        return RegisterFont(str, i, "", "");
    }
}
