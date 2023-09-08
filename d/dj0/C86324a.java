package dj0;

import com.google.android.gms.common.server.response.FastJsonResponse;

/* renamed from: dj0.a */
public class C86324a extends C86328e {
    public C86324a(String str, String str2) {
        super(str, str2);
        mo120723f("SOAPACTION", FastJsonResponse.QUOTE + str2 + "#" + this.f251020b + FastJsonResponse.QUOTE);
        mo120724g();
    }

    /* renamed from: a */
    public String mo120718a() {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\"?><s:Envelope s:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:s=\"http://schemas.xmlsoap.org/soap/envelope/\"><s:Body>");
        sb.append("<u:" + this.f251020b + " xmlns:u=\"" + this.f251022d + "\">\n<InstanceID>" + 0 + "</InstanceID>\n</u:" + this.f251020b + ">\n");
        sb.append("</s:Body></s:Envelope>");
        return sb.toString();
    }

    /* renamed from: b */
    public String mo120719b() {
        return "GetMediaInfo";
    }
}
