package rb1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import ht1.C60167f1;
import java.io.ByteArrayInputStream;
import java.util.LinkedList;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import te3.C101756ae0;
import te3.C101793jd0;
import te3.C101801kd0;
import te3.C101835rd0;
import te3.C101850ud0;
import te3.C101871zc0;
import te3.C52097yc0;
import te3.C77911cd0;
import te3.C90431pc0;

/* renamed from: rb1.c */
public class C101369c {
    /* renamed from: a */
    public static C101801kd0 m133013a(C101801kd0 kd02) {
        if (kd02 == null) {
            return null;
        }
        C101801kd0 kd03 = new C101801kd0();
        if (kd02.f298617e) {
            kd03.mo141219q(kd02.f298616d);
        }
        if (kd02.f298619g) {
            kd03.mo141211f(kd02.f298618f);
        }
        if (kd02.f298621i) {
            kd03.mo141215m(kd02.f298620h);
        }
        if (kd02.f298623n) {
            kd03.mo141221s(kd02.f298622j);
        }
        if (kd02.f298625p) {
            kd03.f298624o = kd02.f298624o;
            kd03.f298625p = true;
        }
        if (kd02.f298627r) {
            kd03.mo141220r(kd02.f298626q);
        }
        if (kd02.f298629t) {
            kd03.mo141212j(kd02.f298628s);
        }
        if (kd02.f298631v) {
            kd03.f298630u = kd02.f298630u;
            kd03.f298631v = true;
        }
        if (kd02.f298633x) {
            kd03.mo141210d(kd02.f298632w);
        }
        if (kd02.f298635z) {
            kd03.mo141218p(kd02.f298634y);
        }
        if (kd02.f298603B) {
            kd03.mo141213k(kd02.f298602A);
        }
        if (kd02.f298605D) {
            kd03.f298604C = kd02.f298604C;
            kd03.f298605D = true;
        }
        if (kd02.f298607F) {
            kd03.mo141222t(kd02.f298606E);
        }
        if (kd02.f298609H) {
            kd03.mo141217o(kd02.f298608G);
        }
        if (kd02.f298611J) {
            kd03.f298610I = kd02.f298610I;
            kd03.f298611J = true;
        }
        if (kd02.f298613L) {
            kd03.mo141216n(kd02.f298612K);
        }
        if (kd02.f298615N) {
            kd03.mo141214l(kd02.f298614M);
        }
        return kd03;
    }

    /* renamed from: b */
    public static void m133014b(String str, C101801kd0 kd02) {
        NodeList childNodes;
        kd02.f298618f.clear();
        try {
            Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new ByteArrayInputStream(str.getBytes())));
            parse.normalize();
            NodeList elementsByTagName = parse.getDocumentElement().getElementsByTagName("datalist");
            if (elementsByTagName != null && elementsByTagName.getLength() > 0 && elementsByTagName.item(0) != null && (childNodes = elementsByTagName.item(0).getChildNodes()) != null && childNodes.getLength() > 0) {
                int length = childNodes.getLength();
                for (int i = 0; i < length; i++) {
                    try {
                        Node item = childNodes.item(i);
                        String nodeToString = XmlParser.nodeToString(item);
                        if (item instanceof Element) {
                            NodeList elementsByTagName2 = ((Element) item).getElementsByTagName("recordxml");
                            String nodeToString2 = (elementsByTagName2 == null || elementsByTagName2.getLength() <= 0) ? null : XmlParser.nodeToString(elementsByTagName2.item(0).getFirstChild());
                            Map<String, String> parseXml = nodeToString.trim().startsWith("<dataitem") ? XmlParser.parseXml(nodeToString, "dataitem", (String) null) : null;
                            if (parseXml != null) {
                                kd02.f298618f.add(C101367a.m133009c(str, parseXml, nodeToString2));
                            }
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.FavProtoItemParser", e, (String) null, new Object[0]);
                    }
                }
            }
        } catch (Exception e2) {
            Log.m105921e("MicroMsg.FavProtoItemParser", "[parser] parseXML exception:%s", e2.toString());
        }
    }

    /* renamed from: c */
    public static void m133015c(String str, Map<String, String> map, C101801kd0 kd02) {
        kd02.mo141220r(map.get(".favitem.title"));
        kd02.mo141212j(map.get(".favitem.desc"));
        kd02.f298624o = map.get(".favitem.remark");
        kd02.f298625p = true;
        kd02.f298630u = Util.getLong(map.get(".favitem.remark.$time"), 0);
        kd02.f298631v = true;
        kd02.mo141222t(Util.getInt(map.get(".favitem.version"), 0));
        kd02.mo141213k(Util.getLong(map.get(".favitem.edittime"), 0));
        kd02.mo141210d(Util.getInt(map.get(".favitem.ctrlflag"), -1));
        C101835rd0 rd02 = kd02.f298616d;
        rd02.mo141277m(Util.getInt(map.get(".favitem.source.$sourcetype"), 0));
        rd02.mo141278n(map.get(".favitem.source.$sourceid"));
        if (Util.isNullOrNil(rd02.f299352j)) {
            rd02.mo141278n(map.get(".favitem.source.sourceid"));
        }
        rd02.mo141275k(map.get(".favitem.source.fromusr"));
        rd02.mo141279o(map.get(".favitem.source.tousr"));
        rd02.f299354o = map.get(".favitem.source.realchatname");
        rd02.f299355p = true;
        rd02.mo141273f(Util.getLong(map.get(".favitem.source.createtime"), 0));
        rd02.f299358s = map.get(".favitem.source.msgid");
        rd02.f299359t = true;
        rd02.mo141274j(map.get(".favitem.source.eventid"));
        rd02.mo141272d(map.get(".favitem.source.appid"));
        rd02.mo141276l(map.get(".favitem.source.link"));
        rd02.f299344B = map.get(".favitem.source.brandid");
        rd02.f299345C = true;
        m133014b(str, kd02);
        C101871zc0 zc02 = kd02.f298620h;
        if (!Util.isNullOrNil(map.get(".favitem.locitem.label"))) {
            zc02.mo141339v(map.get(".favitem.locitem.label"));
        }
        if (!Util.isNullOrNil(map.get(".favitem.locitem.poiname"))) {
            zc02.mo141322E(map.get(".favitem.locitem.poiname"));
        }
        String str2 = map.get(".favitem.locitem.lng");
        if (!Util.isNullOrNil(str2)) {
            zc02.mo141341x(Util.getDouble(str2, 0.0d));
        }
        String str3 = map.get(".favitem.locitem.lat");
        if (!Util.isNullOrNil(str3)) {
            zc02.mo141340w(Util.getDouble(str3, 0.0d));
        }
        String str4 = map.get(".favitem.locitem.scale");
        if (!Util.isNullOrNil(str4)) {
            if (str4.indexOf(46) != -1) {
                zc02.mo141323F(Util.getInt(str4.substring(0, str4.indexOf(46)), -1));
            } else {
                zc02.mo141323F(Util.getInt(str4, -1));
            }
        }
        if (!Util.isNullOrNil(map.get(".favitem.locitem.poiid"))) {
            zc02.mo141321C(map.get(".favitem.locitem.poiid"));
        }
        if (!Util.isNullOrNil(map.get(".favitem.locitem.poiCategoryTips"))) {
            zc02.mo141343z(map.get(".favitem.locitem.poiCategoryTips"));
        }
        if (!Util.isNullOrNil(map.get(".favitem.locitem.poiBusinessHour"))) {
            zc02.mo141342y(map.get(".favitem.locitem.poiBusinessHour"));
        }
        if (!Util.isNullOrNil(map.get(".favitem.locitem.poiPhone"))) {
            zc02.mo141319A(map.get(".favitem.locitem.poiPhone"));
        }
        String str5 = map.get(".favitem.locitem.poiPriceTips");
        if (!Util.isNullOrNil(str5)) {
            zc02.mo141320B(Util.getFloat(str5, 0.0f));
        }
        String str6 = map.get(".favitem.locitem.isfrompoilist");
        if (!Util.isNullOrNil(str6)) {
            zc02.mo141338u(Util.getInt(str6, 0) == 1);
        }
        zc02.mo141336s(map.get(".favitem.locitem.buildingId"));
        zc02.mo141337t(map.get(".favitem.locitem.floorName"));
        C101756ae0 ae02 = kd02.f298622j;
        ae02.f297867h = map.get(".favitem.weburlitem.clean_url");
        ae02.f297868i = true;
        ae02.mo141194n(map.get(".favitem.weburlitem.pagedesc"));
        ae02.mo141197q(map.get(".favitem.weburlitem.pagethumb_url"));
        ae02.mo141198r(map.get(".favitem.weburlitem.pagetitle"));
        ae02.mo141196p(Util.getInt(map.get(".favitem.weburlitem.opencache"), 0));
        ae02.f297873q = Util.getInt(map.get(".favitem.weburlitem.contentattr"), 0);
        ae02.f297874r = true;
        ae02.f297875s = map.get(".favitem.weburlitem.canvasPageXml");
        ae02.f297876t = true;
        ae02.f297877u = map.get(".favitem.weburlitem.wsVideoFlowXml");
        ae02.f297878v = true;
        ae02.mo141195o(Util.getInt(map.get(".favitem.weburlitem.forwardflag"), 0));
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        try {
            LinkedList<C52097yc0> linkedList = new LinkedList<>();
            Document parse = newInstance.newDocumentBuilder().parse(new InputSource(new ByteArrayInputStream(str.getBytes())));
            parse.normalize();
            NodeList elementsByTagName = parse.getDocumentElement().getElementsByTagName("excerptlist");
            if (!(elementsByTagName == null || elementsByTagName.getLength() <= 0 || elementsByTagName.item(0) == null)) {
                NodeList childNodes = elementsByTagName.item(0).getChildNodes();
                int length = childNodes.getLength();
                for (int i = 0; i < length; i++) {
                    try {
                        Node item = childNodes.item(i);
                        String nodeToString = XmlParser.nodeToString(item);
                        if (item instanceof Element) {
                            Map<String, String> parseXml = nodeToString.trim().startsWith("<excerptitem") ? XmlParser.parseXml(nodeToString, "excerptitem", (String) null) : null;
                            if (parseXml != null) {
                                C52097yc0 yc02 = new C52097yc0();
                                yc02.f145226e = parseXml.get(".excerptitem" + ".content");
                                yc02.f145225d = parseXml.get(".excerptitem" + ".excerptkey");
                                yc02.f145227f = parseXml.get(".excerptitem" + ".excerpturl");
                                linkedList.add(yc02);
                            }
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.FavUrlItemParser", e, (String) null, new Object[0]);
                    }
                }
            }
            ae02.f297881y = linkedList;
            ae02.f297882z = true;
        } catch (Exception e2) {
            Log.m105921e("MicroMsg.FavUrlItemParser", "[setUrlItem] parseXML exception:%s", e2.toString());
        }
        kd02.mo141214l(C60167f1.m70151i(".favitem", map));
        if (kd02.f298612K != null) {
            kd02.mo141216n(C101368b.m133010a(".favitem.weburlitem.appmsgshareitem", map));
        }
        C101793jd0 jd02 = kd02.f298634y;
        jd02.mo141207o(map.get(".favitem.productitem.producttitle"));
        jd02.mo141204l(map.get(".favitem.productitem.productdesc"));
        jd02.mo141206n(map.get(".favitem.productitem.productthumb_url"));
        jd02.mo141205m(map.get(".favitem.productitem.productinfo"));
        jd02.mo141208p(Util.getInt(map.get(".favitem.productitem.$type"), 0));
        C101850ud0 ud02 = kd02.f298604C;
        ud02.mo141318n(map.get(".favitem.tvitem.tvtitle"));
        ud02.mo141315k(map.get(".favitem.tvitem.tvdesc"));
        ud02.mo141317m(map.get(".favitem.tvitem.tvthumb_url"));
        ud02.mo141316l(map.get(".favitem.tvitem.tvinfo"));
        C77911cd0 cd02 = kd02.f298608G;
        cd02.f227115d = map.get(".favitem.noteinfo.noteauthor");
        cd02.f227116e = map.get(".favitem.noteinfo.noteeditor");
        if (map.containsKey(".favitem.appbranditem")) {
            C90431pc0 pc02 = new C90431pc0();
            pc02.f259741d = map.get(".favitem.appbranditem.username");
            pc02.f259742e = map.get(".favitem.appbranditem.appid");
            pc02.f259743f = Util.getInt(map.get(".favitem.appbranditem.pkgtype"), 0);
            pc02.f259744g = map.get(".favitem.appbranditem.iconurl");
            pc02.f259745h = Util.getInt(map.get(".favitem.appbranditem.type"), 0);
            pc02.f259746i = map.get(".favitem.appbranditem.pagepath");
            pc02.f259747j = map.get(".favitem.appbranditem.sourcedisplayname");
            pc02.f259748n = Util.getInt(map.get(".favitem.appbranditem.version"), 0);
            pc02.f259749o = Util.getInt(map.get(".favitem.appbranditem.disableforward"), 0);
            pc02.f259750p = Util.getInt(map.get(".favitem.appbranditem.tradingguaranteeflag"), 0);
            pc02.f259753s = Util.getInt(map.get(".favitem.appbranditem.showRelievedBuyFlag"), 0);
            pc02.f259751q = map.get(".favitem.appbranditem.messageextradata");
            pc02.f259752r = Util.getInt(map.get(".favitem.appbranditem.subtype"), 0);
            kd02.f298610I = pc02;
            kd02.f298611J = true;
        }
        if (kd02.f298612K != null) {
            kd02.mo141216n(C101368b.m133010a(".favitem.weburlitem.appmsgshareitem", map));
        }
    }
}
