package com.tencent.p014mm.sdk.platformtools;

import java.util.Map;

/* renamed from: com.tencent.mm.sdk.platformtools.EasyXml */
public class EasyXml {
    public static String INVALID_TAG = "]]>";
    public String mprevTag = "";

    /* renamed from: sb */
    public StringBuffer f249797sb = new StringBuffer();

    public EasyXml() {
    }

    public static String filterId(String str) {
        return (!Util.isNullOrNil(str) && isNumeric(str)) ? str : "";
    }

    private static String filterNull(String str) {
        return str == null ? "" : str;
    }

    public static boolean isNumeric(String str) {
        return str.matches("\\d*");
    }

    public void addTag(String str, String str2) {
        startTag(str);
        setText(str2);
        endTag(str);
    }

    public void endTag(String str) {
        StringBuffer stringBuffer = this.f249797sb;
        stringBuffer.append("</" + str + ">");
    }

    public String getXml() {
        if (!Util.isNullOrNil(this.mprevTag)) {
            endTag(this.mprevTag);
            this.mprevTag = "";
        }
        return this.f249797sb.toString();
    }

    public void setText(String str) {
        if (Util.isNullOrNil(str)) {
            this.f249797sb.append("");
        } else if (str.contains(INVALID_TAG)) {
            StringBuffer stringBuffer = this.f249797sb;
            stringBuffer.append("<![CDATA[" + Util.escapeStringForXml(str) + "]]>");
        } else {
            StringBuffer stringBuffer2 = this.f249797sb;
            stringBuffer2.append("<![CDATA[" + str + "]]>");
        }
    }

    public void startTag(String str) {
        StringBuffer stringBuffer = this.f249797sb;
        stringBuffer.append("<" + str + ">");
    }

    public void text(String str) {
        setText(str);
    }

    public void startTag(String str, Map<String, String> map) {
        StringBuffer stringBuffer = this.f249797sb;
        stringBuffer.append("<" + str);
        for (String next : map.keySet()) {
            StringBuffer stringBuffer2 = this.f249797sb;
            stringBuffer2.append(" " + next + " =  \"" + map.get(next) + "\" ");
        }
        this.f249797sb.append(">");
        map.clear();
    }

    public void text(int i) {
        setText(i);
    }

    public EasyXml(String str) {
        this.mprevTag = str;
        startTag(str);
    }

    public void addTag(String str, int i) {
        startTag(str);
        setText(i);
        endTag(str);
    }

    public void setText(int i) {
        this.f249797sb.append(i);
    }
}
