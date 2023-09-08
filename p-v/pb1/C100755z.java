package pb1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import ht1.C60167f1;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import p272xq.C102713f;
import p749xh.C102666r2;
import rb1.C101367a;
import rb1.C101368b;
import rb1.C101369c;
import rb1.C63379d;
import te3.C101755ad0;
import te3.C101756ae0;
import te3.C101793jd0;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C101835rd0;
import te3.C101846tc0;
import te3.C101850ud0;
import te3.C101871zc0;
import te3.C52097yc0;
import te3.C64682rk1;
import te3.C64853yd0;
import te3.C77911cd0;
import te3.C90431pc0;

/* renamed from: pb1.z */
public class C100755z extends C102666r2 implements C102713f {

    /* renamed from: U0 */
    public static IAutoDBItem.MAutoDBInfo f295169U0 = C102666r2.initAutoDBInfo(C100755z.class);

    /* renamed from: V0 */
    public static C100758c f295170V0 = new C100756a();

    /* renamed from: W0 */
    public static C100758c f295171W0 = new C100757b();

    /* renamed from: Q0 */
    public boolean f295172Q0 = false;

    /* renamed from: R0 */
    public C100755z f295173R0 = null;

    /* renamed from: S0 */
    public String f295174S0 = "";

    /* renamed from: T0 */
    public String f295175T0 = "";

    /* renamed from: pb1.z$a */
    public class C100756a implements C100758c {
        /* renamed from: u */
        public void mo140193u(String str) {
            Log.m105918d("MicroMsg.FavItemInfo", str);
        }

        /* renamed from: v */
        public boolean mo140194v() {
            return false;
        }
    }

    /* renamed from: pb1.z$b */
    public class C100757b implements C100758c {
        /* renamed from: u */
        public void mo140193u(String str) {
            Log.m105924i("MicroMsg.FavItemInfo", str);
        }

        /* renamed from: v */
        public boolean mo140194v() {
            return true;
        }
    }

    /* renamed from: pb1.z$c */
    public interface C100758c {
        /* renamed from: u */
        void mo140193u(String str);

        /* renamed from: v */
        boolean mo140194v();
    }

    public C100755z() {
        this.field_flag = -1;
        this.field_fromUser = "";
        this.field_toUser = "";
        this.field_id = -1;
        this.field_realChatName = "";
        this.field_sourceType = -1;
        this.field_updateTime = -1;
        this.field_type = -1;
        this.field_updateSeq = -1;
        this.field_xml = "";
        this.field_itemStatus = 0;
        mo140178E2();
    }

    /* renamed from: p2 */
    public static void m131901p2(C101834rc0 rc02, C100758c cVar) {
        cVar.mo140193u("  dataId: " + rc02.f299280T);
        cVar.mo140193u("  dataType: " + rc02.f299258I);
        cVar.mo140193u("  dataSouceId: " + rc02.f299274Q0);
        StringBuilder sb = new StringBuilder();
        sb.append("  desc: ");
        boolean v = cVar.mo140194v();
        String str = rc02.f299301f;
        if (!Log.isDebug() && v) {
            str = Util.secPrint(str);
        }
        sb.append(str);
        cVar.mo140193u(sb.toString());
        cVar.mo140193u("  svrDataStatus: " + rc02.f299291Y0);
        cVar.mo140193u("  notCheckThumbCDN: " + rc02.f299287W0);
        cVar.mo140193u("  cdnThumbUrl: " + rc02.f299305h);
        cVar.mo140193u("  cdnThumbKey: " + rc02.f299309j);
        cVar.mo140193u("  notCheckDataCDN: " + rc02.f299283U0);
        cVar.mo140193u("  cdnDataUrl: " + rc02.f299325s);
        cVar.mo140193u("  cdnDataKey: " + rc02.f299329u);
        cVar.mo140193u("  cdnEncryVer: " + rc02.f299333w);
        cVar.mo140193u("  fullmd5: " + rc02.f299266M);
        cVar.mo140193u("  head256md5: " + rc02.f299271P);
        cVar.mo140193u("  fullsize: " + rc02.f299276R);
        cVar.mo140193u("  thumbMd5: " + rc02.f299288X);
        cVar.mo140193u("  thumbHead256md5: " + rc02.f299292Z);
        cVar.mo140193u("  thumbfullsize: " + rc02.f299336x0);
        cVar.mo140193u("  duration: " + rc02.f299338y);
        cVar.mo140193u("  datafmt: " + rc02.f299262K);
        cVar.mo140193u("  streamWebUrl: " + rc02.f299242A);
        cVar.mo140193u("  streamDataUrl: " + rc02.f299246C);
        cVar.mo140193u("  streamLowBandUrl: " + rc02.f299250E);
        cVar.mo140193u("  ext: " + rc02.f299254G);
        cVar.mo140193u("  msgUuid: " + rc02.f299259I1);
        if (rc02.f299296c1 != null) {
            cVar.mo140193u("  remarktime: " + rc02.f299296c1.f299413o);
            cVar.mo140193u("  ctrlflag: " + rc02.f299296c1.f299415q);
            cVar.mo140193u("  edittime: " + rc02.f299296c1.f299417s);
            if (rc02.f299296c1.f299405d != null) {
                cVar.mo140193u("   ----data source item----");
                C101846tc0 tc02 = rc02.f299296c1.f299405d;
                cVar.mo140193u("    sourceType: " + tc02.f299517d);
                cVar.mo140193u("    fromUser: " + tc02.f299519f);
                cVar.mo140193u("    toUser: " + tc02.f299521h);
                cVar.mo140193u("    realChatName: " + tc02.f299525o);
                cVar.mo140193u("    createTime: " + tc02.f299527q);
                cVar.mo140193u("    msgId: " + tc02.f299529s);
                cVar.mo140193u("    eventId: " + tc02.f299531u);
                cVar.mo140193u("    appId: " + tc02.f299533w);
                cVar.mo140193u("    link: " + tc02.f299535y);
                cVar.mo140193u("    mediaId: " + tc02.f299512A);
                cVar.mo140193u("    brandId: " + tc02.f299513B);
            }
            m131902r2("  ", cVar, rc02.f299296c1.f299406e);
            m131906v2("  ", cVar, rc02.f299296c1.f299407f);
            m131904t2("  ", cVar, rc02.f299296c1.f299408g);
            m131905u2("  ", cVar, rc02.f299296c1.f299409h);
            m131903s2("  ", cVar, rc02.f299296c1.f299419u);
        }
    }

    /* renamed from: r2 */
    public static void m131902r2(String str, C100758c cVar, C101871zc0 zc02) {
        if (zc02 != null) {
            cVar.mo140193u(str + " ----loc item----");
            cVar.mo140193u(str + "  lng: " + zc02.f299950d);
            cVar.mo140193u(str + "  lat: " + zc02.f299952f);
            cVar.mo140193u(str + "  scale: " + zc02.f299954h);
            cVar.mo140193u(str + "  label: " + zc02.f299956j);
            cVar.mo140193u(str + "  poiname: " + zc02.f299958o);
        }
    }

    /* renamed from: s2 */
    public static void m131903s2(String str, C100758c cVar, C77911cd0 cd02) {
        if (cd02 != null) {
            cVar.mo140193u(str + " ----noteInfoItem item----");
            cVar.mo140193u(str + "  author: " + cd02.f227115d);
            cVar.mo140193u(str + "  editor: " + cd02.f227116e);
        }
    }

    /* renamed from: t2 */
    public static void m131904t2(String str, C100758c cVar, C101793jd0 jd02) {
        if (jd02 != null) {
            cVar.mo140193u(str + " ----product item----");
            cVar.mo140193u(str + "  title: " + jd02.f298511d);
            cVar.mo140193u(str + "  desc: " + jd02.f298513f);
            cVar.mo140193u(str + "  thumbUrl: " + jd02.f298515h);
            cVar.mo140193u(str + "  type: " + jd02.f298519o);
        }
    }

    /* renamed from: u2 */
    public static void m131905u2(String str, C100758c cVar, C101850ud0 ud02) {
        if (ud02 != null) {
            cVar.mo140193u(str + " ----tv item----");
            cVar.mo140193u(str + "  title: " + ud02.f299618d);
            cVar.mo140193u(str + "  desc: " + ud02.f299620f);
            cVar.mo140193u(str + "  thumbUrl: " + ud02.f299622h);
        }
    }

    /* renamed from: v2 */
    public static void m131906v2(String str, C100758c cVar, C101756ae0 ae02) {
        if (ae02 != null) {
            cVar.mo140193u(str + " ----url item----");
            cVar.mo140193u(str + "  title: " + ae02.f297863d);
            cVar.mo140193u(str + "  desc: " + ae02.f297865f);
            cVar.mo140193u(str + "  cleanUrl: " + ae02.f297867h);
            cVar.mo140193u(str + "  thumbUrl: " + ae02.f297869j);
            cVar.mo140193u(str + "  opencache: " + ae02.f297871o);
            cVar.mo140193u(str + "  topstory: " + ae02.f297877u);
        }
    }

    /* renamed from: w2 */
    public static String m131907w2(C100755z zVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        LinkedList<C52097yc0> linkedList;
        C100755z zVar2 = zVar;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<favitem");
        stringBuffer.append(" type='");
        stringBuffer.append(zVar2.field_type);
        stringBuffer.append("'");
        stringBuffer.append(">");
        C101801kd0 kd02 = zVar2.field_favProto;
        StringBuilder sb = new StringBuilder();
        if (!Util.isNullOrNil(kd02.f298626q)) {
            sb.append("<title>");
            sb.append(Util.escapeStringForXml(kd02.f298626q));
            sb.append("</title>");
        }
        if (!Util.isNullOrNil(kd02.f298628s)) {
            sb.append("<desc>");
            sb.append(Util.escapeStringForXml(kd02.f298628s));
            sb.append("</desc>");
        }
        if (kd02.f298602A > 0) {
            sb.append("<edittime>");
            sb.append(kd02.f298602A);
            sb.append("</edittime>");
        }
        C77911cd0 cd02 = kd02.f298608G;
        if (cd02 != null && !Util.isNullOrNil(cd02.f227116e)) {
            sb.append("<editusr>");
            sb.append(kd02.f298608G.f227116e);
            sb.append("</editusr>");
        }
        if (!Util.isNullOrNil(kd02.f298624o)) {
            sb.append("<remark ");
            if (kd02.f298630u > 0) {
                sb.append(" time ='");
                sb.append(kd02.f298630u);
                sb.append("'");
            }
            sb.append(">");
            sb.append(Util.escapeStringForXml(kd02.f298624o));
            sb.append("</remark>");
        }
        if (kd02.f298633x) {
            sb.append("<ctrlflag>");
            sb.append(kd02.f298632w);
            sb.append("</ctrlflag>");
        }
        if (kd02.f298607F) {
            sb.append("<version>");
            sb.append(kd02.f298606E);
            sb.append("</version>");
        } else if (zVar2.field_type == 18) {
            sb.append("<version>");
            sb.append(1);
            sb.append("</version>");
        }
        C101835rd0 rd02 = kd02.f298616d;
        if (rd02 == null || rd02.computeSize() == 0) {
            Log.m105928w("MicroMsg.FavSourceItemParser", "klem toXml, source item empty");
            str = "";
        } else {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("<source");
            if (rd02.f299347e) {
                stringBuffer2.append(" sourcetype='");
                stringBuffer2.append(rd02.f299346d);
                stringBuffer2.append("'");
            }
            if (rd02.f299353n) {
                stringBuffer2.append(" sourceid='");
                stringBuffer2.append(Util.escapeStringForXml(rd02.f299352j));
                stringBuffer2.append("'");
            }
            stringBuffer2.append(">");
            if (rd02.f299349g) {
                stringBuffer2.append("<fromusr>");
                stringBuffer2.append(Util.escapeStringForXml(rd02.f299348f));
                stringBuffer2.append("</fromusr>");
            }
            if (rd02.f299351i) {
                stringBuffer2.append("<tousr>");
                stringBuffer2.append(Util.escapeStringForXml(rd02.f299350h));
                stringBuffer2.append("</tousr>");
            }
            if (rd02.f299355p) {
                stringBuffer2.append("<realchatname>");
                stringBuffer2.append(Util.escapeStringForXml(rd02.f299354o));
                stringBuffer2.append("</realchatname>");
            }
            if (rd02.f299359t) {
                stringBuffer2.append("<msgid>");
                stringBuffer2.append(rd02.f299358s);
                stringBuffer2.append("</msgid>");
            }
            if (rd02.f299361v) {
                stringBuffer2.append("<eventid>");
                stringBuffer2.append(rd02.f299360u);
                stringBuffer2.append("</eventid>");
            }
            if (rd02.f299363x) {
                stringBuffer2.append("<appid>");
                stringBuffer2.append(rd02.f299362w);
                stringBuffer2.append("</appid>");
            }
            if (rd02.f299353n) {
                stringBuffer2.append("<sourceid>");
                stringBuffer2.append(rd02.f299352j);
                stringBuffer2.append("</sourceid>");
            }
            if (rd02.f299365z) {
                stringBuffer2.append("<link>");
                stringBuffer2.append(Util.escapeStringForXml(rd02.f299364y));
                stringBuffer2.append("</link>");
            }
            if (rd02.f299345C) {
                stringBuffer2.append("<brandid>");
                stringBuffer2.append(Util.escapeStringForXml(rd02.f299344B));
                stringBuffer2.append("</brandid>");
            }
            stringBuffer2.append("</source>");
            str = stringBuffer2.toString();
        }
        sb.append(str);
        sb.append(C101367a.m133008b(kd02.f298618f));
        C101871zc0 zc02 = zVar2.field_favProto.f298620h;
        if (zc02 == null || zc02.computeSize() == 0) {
            str2 = "";
            Log.m105918d("MicroMsg.FavLocItemParser", "klem toXml, loc item empty");
            str3 = str2;
        } else {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("<locitem>");
            if (zc02.f299957n) {
                stringBuffer3.append("<label>");
                stringBuffer3.append(Util.escapeStringForXml(zc02.f299956j));
                stringBuffer3.append("</label>");
            }
            if (zc02.f299953g) {
                stringBuffer3.append("<lat>");
                str2 = "";
                stringBuffer3.append(zc02.f299952f);
                stringBuffer3.append("</lat>");
            } else {
                str2 = "";
            }
            if (zc02.f299951e) {
                stringBuffer3.append("<lng>");
                stringBuffer3.append(zc02.f299950d);
                stringBuffer3.append("</lng>");
            }
            if (zc02.f299955i) {
                stringBuffer3.append("<scale>");
                stringBuffer3.append(zc02.f299954h);
                stringBuffer3.append("</scale>");
            }
            if (zc02.f299959p) {
                stringBuffer3.append("<poiname>");
                stringBuffer3.append(zc02.f299958o);
                stringBuffer3.append("</poiname>");
            }
            if (zc02.f299961r) {
                stringBuffer3.append("<poiid>");
                stringBuffer3.append(zc02.f299960q);
                stringBuffer3.append("</poiid>");
            }
            if (zc02.f299963t) {
                stringBuffer3.append("<poiCategoryTips>");
                stringBuffer3.append(zc02.f299962s);
                stringBuffer3.append("</poiCategoryTips>");
            }
            if (zc02.f299965v) {
                stringBuffer3.append("<poiBusinessHour>");
                stringBuffer3.append(zc02.f299964u);
                stringBuffer3.append("</poiBusinessHour>");
            }
            if (zc02.f299967x) {
                stringBuffer3.append("<poiPhone>");
                stringBuffer3.append(zc02.f299966w);
                stringBuffer3.append("</poiPhone>");
            }
            if (zc02.f299969z) {
                stringBuffer3.append("<poiPriceTips>");
                stringBuffer3.append(zc02.f299968y);
                stringBuffer3.append("</poiPriceTips>");
            }
            if (zc02.f299945B) {
                stringBuffer3.append("<isfrompoilist>");
                stringBuffer3.append(zc02.f299944A ? "1" : "0");
                stringBuffer3.append("</isfrompoilist>");
            }
            if (zc02.f299947D) {
                stringBuffer3.append("<buildingId>");
                stringBuffer3.append(zc02.f299946C);
                stringBuffer3.append("</buildingId>");
            }
            if (zc02.f299949F) {
                stringBuffer3.append("<floorName>");
                stringBuffer3.append(zc02.f299948E);
                stringBuffer3.append("</floorName>");
            }
            stringBuffer3.append("</locitem>");
            str3 = stringBuffer3.toString();
        }
        sb.append(str3);
        C101756ae0 ae02 = zVar2.field_favProto.f298622j;
        if (ae02 == null || ae02.computeSize() == 0) {
            Log.m105918d("MicroMsg.FavUrlItemParser", "klem toXml, url item empty");
            str4 = str2;
        } else {
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("<weburlitem>");
            if (ae02.f297868i) {
                stringBuffer4.append("<clean_url>");
                stringBuffer4.append(Util.escapeStringForXml(ae02.f297867h));
                stringBuffer4.append("</clean_url>");
            }
            if (ae02.f297866g) {
                stringBuffer4.append("<pagedesc>");
                stringBuffer4.append(Util.escapeStringForXml(ae02.f297865f));
                stringBuffer4.append("</pagedesc>");
            }
            if (ae02.f297870n) {
                stringBuffer4.append("<pagethumb_url>");
                stringBuffer4.append(Util.escapeStringForXml(ae02.f297869j));
                stringBuffer4.append("</pagethumb_url>");
            }
            if (ae02.f297864e) {
                stringBuffer4.append("<pagetitle>");
                stringBuffer4.append(Util.escapeStringForXml(ae02.f297863d));
                stringBuffer4.append("</pagetitle>");
            }
            if (ae02.f297872p) {
                stringBuffer4.append("<opencache>");
                stringBuffer4.append(ae02.f297871o);
                stringBuffer4.append("</opencache>");
            }
            if (ae02.f297874r) {
                stringBuffer4.append("<contentattr>");
                stringBuffer4.append(ae02.f297873q);
                stringBuffer4.append("</contentattr>");
            }
            if (ae02.f297876t) {
                stringBuffer4.append("<canvasPageXml>");
                stringBuffer4.append(ae02.f297875s);
                stringBuffer4.append("</canvasPageXml>");
            }
            if (ae02.f297878v) {
                stringBuffer4.append("<wsVideoFlowXml>");
                stringBuffer4.append(Util.escapeStringForXml(ae02.f297877u));
                stringBuffer4.append("</wsVideoFlowXml>");
            }
            stringBuffer4.append("<forwardflag>");
            stringBuffer4.append(ae02.f297879w);
            stringBuffer4.append("</forwardflag>");
            if (!(!ae02.f297882z || (linkedList = ae02.f297881y) == null || linkedList.size() == 0)) {
                stringBuffer4.append("<excerptlist>");
                int i = 0;
                while (i < ae02.f297881y.size()) {
                    C52097yc0 yc02 = ae02.f297881y.get(i);
                    stringBuffer4.append("<excerptitem>");
                    stringBuffer4.append("<content>");
                    stringBuffer4.append(Util.escapeStringForXml(yc02.f145226e));
                    stringBuffer4.append("</content>");
                    stringBuffer4.append("<excerptkey>");
                    stringBuffer4.append(Util.escapeStringForXml(yc02.f145225d));
                    stringBuffer4.append("</excerptkey>");
                    stringBuffer4.append("<excerpturl>");
                    stringBuffer4.append(Util.escapeStringForXml(yc02.f145227f));
                    stringBuffer4.append("</excerpturl>");
                    stringBuffer4.append("</excerptitem>");
                    i++;
                    ae02 = ae02;
                }
                stringBuffer4.append("</excerptlist>");
            }
            stringBuffer4.append(C101368b.m133012c(zVar2.field_favProto.f298612K));
            stringBuffer4.append("</weburlitem>");
            str4 = stringBuffer4.toString();
        }
        sb.append(str4);
        C101793jd0 jd02 = zVar2.field_favProto.f298634y;
        if (jd02 == null || jd02.computeSize() == 0) {
            Log.m105918d("MicroMsg.FavProductItemParser", "klem toXml, product item empty");
            str5 = str2;
        } else {
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append("<productitem");
            if (jd02.f298520p) {
                stringBuffer5.append(" type='");
                stringBuffer5.append(jd02.f298519o);
                stringBuffer5.append("'");
            }
            stringBuffer5.append(">");
            if (jd02.f298512e) {
                stringBuffer5.append("<producttitle>");
                stringBuffer5.append(Util.escapeStringForXml(jd02.f298511d));
                stringBuffer5.append("</producttitle>");
            }
            if (jd02.f298514g) {
                stringBuffer5.append("<productdesc>");
                stringBuffer5.append(Util.escapeStringForXml(jd02.f298513f));
                stringBuffer5.append("</productdesc>");
            }
            if (jd02.f298516i) {
                stringBuffer5.append("<productthumb_url>");
                stringBuffer5.append(Util.escapeStringForXml(jd02.f298515h));
                stringBuffer5.append("</productthumb_url>");
            }
            if (jd02.f298518n) {
                stringBuffer5.append("<productinfo>");
                stringBuffer5.append(Util.escapeStringForXml(jd02.f298517j));
                stringBuffer5.append("</productinfo>");
            }
            stringBuffer5.append("</productitem>");
            str5 = stringBuffer5.toString();
        }
        sb.append(str5);
        C101850ud0 ud02 = zVar2.field_favProto.f298604C;
        if (ud02 == null || ud02.computeSize() == 0) {
            Log.m105918d("MicroMsg.FavTVItemParser", "klem toXml, product item empty");
            str6 = str2;
        } else {
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append("<tvitem>");
            if (ud02.f299619e) {
                stringBuffer6.append("<tvtitle>");
                stringBuffer6.append(Util.escapeStringForXml(ud02.f299618d));
                stringBuffer6.append("</tvtitle>");
            }
            if (ud02.f299621g) {
                stringBuffer6.append("<tvdesc>");
                stringBuffer6.append(Util.escapeStringForXml(ud02.f299620f));
                stringBuffer6.append("</tvdesc>");
            }
            if (ud02.f299623i) {
                stringBuffer6.append("<tvthumb_url>");
                stringBuffer6.append(Util.escapeStringForXml(ud02.f299622h));
                stringBuffer6.append("</tvthumb_url>");
            }
            if (ud02.f299625n) {
                stringBuffer6.append("<tvinfo>");
                stringBuffer6.append(Util.escapeStringForXml(ud02.f299624j));
                stringBuffer6.append("</tvinfo>");
            }
            stringBuffer6.append("</tvitem>");
            str6 = stringBuffer6.toString();
        }
        sb.append(str6);
        C77911cd0 cd03 = kd02.f298608G;
        if (cd03 == null || cd03.computeSize() == 0) {
            Log.m105928w("MicroMsg.FavNoteInfoItemParser", "klem toXml, source item empty");
            str7 = str2;
        } else {
            StringBuffer stringBuffer7 = new StringBuffer();
            stringBuffer7.append("<noteinfo>");
            stringBuffer7.append("<noteauthor>");
            stringBuffer7.append(Util.escapeStringForXml(cd03.f227115d));
            stringBuffer7.append("</noteauthor>");
            stringBuffer7.append("<noteeditor>");
            stringBuffer7.append(Util.escapeStringForXml(cd03.f227116e));
            stringBuffer7.append("</noteeditor>");
            stringBuffer7.append("</noteinfo>");
            str7 = stringBuffer7.toString();
        }
        sb.append(str7);
        sb.append(C60167f1.m70147e(kd02.f298614M));
        C90431pc0 pc02 = zVar2.field_favProto.f298610I;
        if (pc02 == null) {
            str8 = str2;
        } else {
            str8 = "<appbranditem>" + "<username>" + Util.escapeStringForXml(pc02.f259741d) + "</username>" + "<appid>" + Util.escapeStringForXml(pc02.f259742e) + "</appid>" + "<pkgtype>" + pc02.f259743f + "</pkgtype>" + "<iconurl>" + Util.escapeStringForXml(pc02.f259744g) + "</iconurl>" + "<type>" + pc02.f259745h + "</type>" + "<pagepath>" + Util.escapeStringForXml(pc02.f259746i) + "</pagepath>" + "<sourcedisplayname>" + Util.escapeStringForXml(pc02.f259747j) + "</sourcedisplayname>" + "<version>" + pc02.f259748n + "</version>" + "<disableforward>" + pc02.f259749o + "</disableforward>" + "<tradingguaranteeflag>" + pc02.f259750p + "</tradingguaranteeflag>" + "<showRelievedBuyFlag>" + pc02.f259753s + "</showRelievedBuyFlag>" + "<messageextradata>" + String.format("<![CDATA[%s]]>", new Object[]{pc02.f259751q}) + "</messageextradata>" + "<subtype>" + pc02.f259752r + "</subtype>" + "</appbranditem>";
        }
        sb.append(str8);
        stringBuffer.append(sb.toString());
        C64853yd0 yd02 = zVar2.field_tagProto;
        if (yd02 == null || (yd02.f186495e.isEmpty() && yd02.f186494d.isEmpty())) {
            Log.m105926v("MicroMsg.FavTagParser", "tag list toXml data list empty");
            str9 = str2;
        } else {
            StringBuffer stringBuffer8 = new StringBuffer();
            int size = yd02.f186495e.size();
            stringBuffer8.append("<taglist count='");
            stringBuffer8.append(size);
            stringBuffer8.append("'>");
            for (int i2 = 0; i2 < size; i2++) {
                stringBuffer8.append("<tag>");
                stringBuffer8.append(Util.escapeStringForXml(yd02.f186495e.get(i2)));
                stringBuffer8.append("</tag>");
            }
            stringBuffer8.append("</taglist>");
            int size2 = yd02.f186494d.size();
            stringBuffer8.append("<recommendtaglist count='");
            stringBuffer8.append(size2);
            stringBuffer8.append("'>");
            for (int i3 = 0; i3 < size2; i3++) {
                stringBuffer8.append("<tag>");
                stringBuffer8.append(Util.escapeStringForXml(yd02.f186494d.get(i3)));
                stringBuffer8.append("</tag>");
            }
            stringBuffer8.append("</recommendtaglist>");
            str9 = stringBuffer8.toString();
        }
        stringBuffer.append(str9);
        stringBuffer.append("</favitem>");
        return stringBuffer.toString();
    }

    /* renamed from: A2 */
    public boolean mo140174A2() {
        int i = this.field_itemStatus;
        return i == 3 || i == 6 || i == 11 || i == 14 || i == 16 || i == 18;
    }

    /* renamed from: B2 */
    public boolean mo140175B2() {
        int i = this.field_itemStatus;
        return i == 1 || i == 4 || i == 9 || i == 12 || i == 13 || i == 15 || i == 17;
    }

    /* renamed from: C2 */
    public boolean mo140176C2() {
        int i = this.field_itemStatus;
        return i == 12 || i == 13 || i == 14;
    }

    /* renamed from: D2 */
    public C100755z mo140177D2(String str) {
        if (str == null || str.equals("")) {
            Log.m105920e("MicroMsg.FavItemInfo", "klem, FavItemInfo xml null");
            return this;
        }
        Map<String, String> parseXml = XmlParser.parseXml(str, "favitem", (String) null);
        if (parseXml == null) {
            Log.m105920e("MicroMsg.FavItemInfo", "klem, FavItemInfo maps null");
            return this;
        }
        try {
            mo140178E2();
            C101369c.m133015c(str, parseXml, this.field_favProto);
            C101801kd0 kd02 = this.field_favProto;
            C101835rd0 rd02 = kd02.f298616d;
            if (rd02 != null) {
                this.field_sourceId = rd02.f299352j;
                this.field_sourceType = rd02.f299346d;
                this.field_fromUser = rd02.f299348f;
                this.field_toUser = rd02.f299350h;
            }
            this.field_edittime = kd02.f298602A;
            C63379d.m74735a(parseXml, this.field_tagProto);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FavItemInfo", e, "", new Object[0]);
            Log.m105921e("MicroMsg.FavItemInfo", "klem , FavItemInfo exception:+%s", e.toString());
        }
        return this;
    }

    /* renamed from: E2 */
    public void mo140178E2() {
        this.field_favProto = new C101801kd0();
        C101835rd0 rd02 = new C101835rd0();
        rd02.mo141277m(1);
        this.field_favProto.mo141219q(rd02);
        this.field_favProto.mo141221s(new C101756ae0());
        this.field_favProto.mo141216n(new C101755ad0());
        this.field_favProto.mo141215m(new C101871zc0());
        this.field_favProto.mo141218p(new C101793jd0());
        C101801kd0 kd02 = this.field_favProto;
        kd02.f298604C = new C101850ud0();
        kd02.f298605D = true;
        this.field_favProto.mo141214l(new C64682rk1());
        this.field_favProto.mo141210d(-1);
        this.field_tagProto = new C64853yd0();
        this.field_favProto.mo141217o(new C77911cd0());
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f295169U0;
    }

    public int getId() {
        return this.field_id;
    }

    public long getLocalId() {
        return this.field_localId;
    }

    public int getType() {
        return this.field_type;
    }

    /* renamed from: l2 */
    public boolean mo140183l2(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        Iterator<String> it = this.field_tagProto.f186495e.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next())) {
                return false;
            }
        }
        this.field_tagProto.f186495e.add(str);
        return true;
    }

    /* renamed from: m2 */
    public boolean mo140184m2() {
        return (this.field_favProto.f298632w & 1) != 0;
    }

    /* renamed from: n2 */
    public boolean mo140185n2() {
        return (this.field_favProto.f298632w & 2) != 0;
    }

    /* renamed from: o2 */
    public C100755z clone() {
        C100755z zVar = new C100755z();
        zVar.field_favProto = this.field_favProto;
        zVar.field_sourceId = this.field_sourceId;
        zVar.field_edittime = this.field_edittime;
        zVar.field_ext = this.field_ext;
        zVar.field_flag = this.field_flag;
        zVar.field_fromUser = this.field_fromUser;
        zVar.field_id = this.field_id;
        zVar.field_itemStatus = this.field_itemStatus;
        zVar.field_localId = this.field_localId;
        zVar.field_localSeq = this.field_localSeq;
        zVar.field_realChatName = this.field_realChatName;
        zVar.field_tagProto = this.field_tagProto;
        zVar.field_sourceCreateTime = this.field_sourceCreateTime;
        zVar.field_updateSeq = this.field_updateSeq;
        zVar.field_toUser = this.field_toUser;
        zVar.field_updateTime = this.field_updateTime;
        zVar.field_type = this.field_type;
        zVar.field_xml = this.field_xml;
        zVar.field_datatotalsize = this.field_datatotalsize;
        zVar.f295172Q0 = this.f295172Q0;
        zVar.f295173R0 = this.f295173R0;
        zVar.f295174S0 = this.f295174S0;
        return zVar;
    }

    /* renamed from: q2 */
    public final void mo140187q2(String str, C100758c cVar) {
        cVar.mo140193u("----dump favitem from[" + str + "] beg----");
        StringBuilder sb = new StringBuilder();
        sb.append("type: ");
        sb.append(this.field_type);
        cVar.mo140193u(sb.toString());
        cVar.mo140193u("favId: " + this.field_id);
        cVar.mo140193u("localId: " + this.field_localId);
        cVar.mo140193u("itemStatus: " + this.field_itemStatus);
        cVar.mo140193u("localSeq: " + this.field_localSeq);
        cVar.mo140193u("updateSeq: " + this.field_updateSeq);
        cVar.mo140193u("ctrlFlag: " + this.field_flag);
        cVar.mo140193u("sourceId: " + this.field_sourceId);
        cVar.mo140193u("sourceType: " + this.field_sourceType);
        cVar.mo140193u("sourceCreateTime: " + this.field_sourceCreateTime);
        cVar.mo140193u("updateTime: " + this.field_updateTime);
        cVar.mo140193u("editTime: " + this.field_edittime);
        cVar.mo140193u("fromuser: " + this.field_fromUser);
        cVar.mo140193u("toUser: " + this.field_toUser);
        cVar.mo140193u("realChatName: " + this.field_realChatName);
        if (this.field_favProto != null) {
            cVar.mo140193u("remarktime: " + this.field_favProto.f298630u);
            cVar.mo140193u("dataitemCount: " + this.field_favProto.f298618f.size());
            if (this.field_favProto.f298616d != null) {
                cVar.mo140193u(" ----source item----");
                C101835rd0 rd02 = this.field_favProto.f298616d;
                cVar.mo140193u("  sourceType: " + rd02.f299346d);
                cVar.mo140193u("  fromUser: " + rd02.f299348f);
                cVar.mo140193u("  toUser: " + rd02.f299350h);
                cVar.mo140193u("  sourceId: " + rd02.f299352j);
                cVar.mo140193u("  realChatName: " + rd02.f299354o);
                cVar.mo140193u("  createTime: " + rd02.f299356q);
                cVar.mo140193u("  msgId: " + rd02.f299358s);
                cVar.mo140193u("  eventId: " + rd02.f299360u);
                cVar.mo140193u("  appId: " + rd02.f299362w);
                cVar.mo140193u("  link: " + rd02.f299364y);
                cVar.mo140193u("  mediaId: " + rd02.f299343A);
                cVar.mo140193u("  brandId: " + rd02.f299344B);
            }
            int i = 0;
            Iterator<C101834rc0> it = this.field_favProto.f298618f.iterator();
            while (it.hasNext()) {
                cVar.mo140193u(" ----data item " + i + "----");
                m131901p2(it.next(), cVar);
                i++;
            }
            m131902r2("", cVar, this.field_favProto.f298620h);
            m131906v2("", cVar, this.field_favProto.f298622j);
            m131904t2("", cVar, this.field_favProto.f298634y);
            m131905u2("", cVar, this.field_favProto.f298604C);
            m131903s2("  ", cVar, this.field_favProto.f298608G);
        }
        cVar.mo140193u("----dump favitem end----");
    }

    /* renamed from: w0 */
    public C101801kd0 mo140188w0() {
        return this.field_favProto;
    }

    /* renamed from: x2 */
    public boolean mo140189x2() {
        return this.field_itemStatus == 10;
    }

    /* renamed from: y2 */
    public boolean mo140190y2() {
        return this.field_itemStatus == 7;
    }

    /* renamed from: z */
    public boolean mo140191z() {
        return this.f295172Q0;
    }

    /* renamed from: z2 */
    public boolean mo140192z2() {
        int i = this.field_itemStatus;
        return i == 15 || i == 16;
    }
}
