package vl2;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.scanner.model.C94474a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;

/* renamed from: vl2.y */
public class C102216y {

    /* renamed from: vl2.y$a */
    public static class C102217a {

        /* renamed from: a */
        public LinkedList<C94474a> f300996a;

        /* renamed from: b */
        public C102218a f300997b;
        public String field_certification;
        public String field_certificationurl;
        public String field_detailurl;
        public String field_exposeurl;
        public String field_extinfo;
        public String field_feedbackurl;
        public int field_functionType;
        public int field_getaction;
        public String field_headerbackgroundurl;
        public String field_headermask;
        public String field_introlink;
        public String field_introtitle;
        public String field_playurl;
        public String field_productid;
        public String field_shareurl;
        public String field_source;
        public String field_subtitle;
        public String field_thumburl;
        public String field_title;
        public int field_type;
        public String field_xml;
        public int field_xmlType;

        /* renamed from: vl2.y$a$a */
        public static class C102218a {

            /* renamed from: a */
            public LinkedList<C102219a> f300998a;

            /* renamed from: b */
            public LinkedList<C102220b> f300999b;

            /* renamed from: vl2.y$a$a$a */
            public static class C102219a {

                /* renamed from: a */
                public String f301000a;
            }

            /* renamed from: vl2.y$a$a$b */
            public static class C102220b {

                /* renamed from: a */
                public String f301001a;

                /* renamed from: b */
                public String f301002b;
            }
        }
    }

    /* renamed from: vl2.y$b */
    public static class C102221b {

        /* renamed from: a */
        public String f301003a;

        public C102221b(String str) {
            this.f301003a = str;
        }
    }

    /* renamed from: vl2.y$c */
    public static class C102222c {

        /* renamed from: a */
        public String f301004a;

        public C102222c(String str, String str2) {
            this.f301004a = str;
        }
    }

    /* renamed from: a */
    public static String m134691a(C102217a aVar) {
        StringBuilder sb = new StringBuilder(256);
        if (!Util.isNullOrNil(aVar.field_productid)) {
            sb.append("<productInfo><product type=\"" + aVar.field_type + "\">");
            sb.append("<id>" + Util.escapeStringForXml(aVar.field_productid) + "</id>");
            sb.append("<title>" + Util.escapeStringForXml(aVar.field_title) + "</title>");
            sb.append("<subtitle>" + Util.escapeStringForXml(aVar.field_subtitle) + "</subtitle>");
            sb.append("<thumburl>" + Util.escapeStringForXml(aVar.field_thumburl) + "</thumburl>");
            sb.append("<source>" + Util.escapeStringForXml(aVar.field_source) + "</source>");
            sb.append("<shareurl>" + Util.escapeStringForXml(aVar.field_shareurl) + "</shareurl>");
            sb.append("<playurl>" + Util.escapeStringForXml(aVar.field_playurl) + "</playurl>");
            sb.append("<extinfo>" + Util.escapeStringForXml(aVar.field_extinfo) + "</extinfo>");
            StringBuilder sb4 = new StringBuilder();
            sb4.append("<getaction>");
            sb4.append(Util.escapeStringForXml(aVar.field_getaction + ""));
            sb4.append("</getaction>");
            sb.append(sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("<certification>");
            sb5.append(Util.escapeStringForXml(aVar.field_certification + ""));
            sb5.append("</certification>");
            sb.append(sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append("<headerbackgroundurl>");
            sb6.append(Util.escapeStringForXml(aVar.field_headerbackgroundurl + ""));
            sb6.append("</headerbackgroundurl>");
            sb.append(sb6.toString());
            StringBuilder sb7 = new StringBuilder();
            sb7.append("<headermask>");
            sb7.append(Util.escapeStringForXml(aVar.field_headermask + ""));
            sb7.append("</headermask>");
            sb.append(sb7.toString());
            StringBuilder sb8 = new StringBuilder();
            sb8.append("<detailurl>");
            sb8.append(Util.escapeStringForXml(aVar.field_detailurl + ""));
            sb8.append("</detailurl>");
            sb.append(sb8.toString());
            StringBuilder sb9 = new StringBuilder();
            sb9.append("<certificationurl>");
            sb9.append(Util.escapeStringForXml(aVar.field_certificationurl + ""));
            sb9.append("</certificationurl>");
            sb.append(sb9.toString());
            sb.append("</product>");
            sb.append("<functionType>" + aVar.field_functionType + "</functionType>");
            sb.append("</productInfo>");
        } else {
            String str = aVar.field_xml;
            if (str == null) {
                Log.m105920e("MicroMsg.Scanner.ScanXmlHelper", "product.field_xml == null in getProductInfoXml()");
                return "";
            } else if (str.startsWith("<productInfo")) {
                return aVar.field_xml;
            } else {
                sb.append("<productInfo>");
                sb.append(aVar.field_xml);
                sb.append("<functionType>" + aVar.field_functionType + "</functionType>");
                sb.append("</productInfo>");
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m134692b(Context context, int i) {
        if (context == null || i < 0) {
            return "";
        }
        if (i == 0) {
            context.getString(C0966R.string.ieb);
        } else if (i == 1) {
            context.getString(C0966R.string.ie5);
        } else if (i == 2) {
            context.getString(C0966R.string.iea);
        } else if (i == 3) {
            context.getString(C0966R.string.ie6);
        }
        return context.getString(C0966R.string.ieb);
    }

    /* renamed from: c */
    public static int m134693c(String str) {
        if (str == null) {
            return 0;
        }
        String trim = str.trim();
        if (trim.startsWith("<user")) {
            return 1;
        }
        if (trim.startsWith("<url")) {
            return 2;
        }
        if (trim.startsWith("<product")) {
            return 3;
        }
        return trim.startsWith("<search") ? 4 : 0;
    }
}
