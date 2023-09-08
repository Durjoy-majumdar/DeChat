package dj0;

import com.google.android.gms.common.server.response.FastJsonResponse;

/* renamed from: dj0.j */
public class C86334j extends C86328e {

    /* renamed from: f */
    public String f251030f;

    public C86334j(String str, String str2, String str3) {
        super(str, str2);
        this.f251030f = str3;
        mo120723f("SOAPACTION", FastJsonResponse.QUOTE + str2 + "#" + this.f251020b + FastJsonResponse.QUOTE);
        mo120724g();
    }

    /* renamed from: a */
    public String mo120718a() {
        String str = this.f251030f;
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\"?><s:Envelope s:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:s=\"http://schemas.xmlsoap.org/soap/envelope/\"><s:Body>");
        String replace = str.replace("&", "&amp;").replace(FastJsonResponse.QUOTE, "&quot;").replace("<", "&lt;").replace(">", "&gt;").replace(" ", "&nbsp;").replace("'", "&apos;");
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = sb;
        sb4.append("&lt;DIDL-Lite xmlns=&quot;urn:schemas-upnp-org:metadata-1-0/DIDL-Lite/&quot; xmlns:upnp=&quot;urn:schemas-upnp-org:metadata-1-0/upnp/&quot; xmlns:dc=&quot;http://purl.org/dc/elements/1.1/&quot; xmlns:sec=&quot;http://www.sec.co.kr/&quot;&gt;&lt;item id=&quot;123&quot; parentID=&quot;-1&quot; restricted=&quot;1&quot;&gt;&lt;upnp:storageMedium&gt;UNKNOWN&lt;/upnp:storageMedium&gt;&lt;upnp:writeStatus&gt;UNKNOWN&lt;/upnp:writeStatus&gt;&lt;dc:title&gt;Video&lt;/dc:title&gt;&lt;dc:creator&gt;QGame&lt;/dc:creator&gt;&lt;upnp:class&gt;object.item.videoItem&lt;/upnp:class&gt;&lt;res protocolInfo=&quot;http-get:*:video/*:DLNA.ORG_OP=01;DLNA.ORG_CI=0;DLNA.ORG_FLAGS=01700000000000000000000000000000&quot;&gt;");
        sb4.append(replace.replace("&", "&amp;").replace(FastJsonResponse.QUOTE, "&quot;").replace("<", "&lt;").replace(">", "&gt;").replace(" ", "&nbsp;").replace("'", "&apos;"));
        sb4.append("&lt;/res&gt;&lt;/item&gt;&lt;/DIDL-Lite&gt;");
        String sb6 = sb4.toString();
        StringBuilder sb7 = sb5;
        sb7.append("<u:" + this.f251020b + " xmlns:u=\"" + this.f251022d + "\">\n<InstanceID>" + 0 + "</InstanceID>\n<CurrentURI>" + replace + "</CurrentURI>\n<CurrentURIMetaData>" + sb6 + "</CurrentURIMetaData>\n</u:SetAVTransportURI>\n");
        sb7.append("</s:Body></s:Envelope>");
        return sb7.toString();
    }

    /* renamed from: b */
    public String mo120719b() {
        return "SetAVTransportURI";
    }
}
