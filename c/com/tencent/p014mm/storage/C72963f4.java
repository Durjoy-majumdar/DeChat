package com.tencent.p014mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.p014mm.autogen.events.ReceiveMsgEvent;
import com.tencent.p014mm.autogen.events.SendMsgFailEvent;
import com.tencent.p014mm.autogen.events.SendMsgSuccessEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.xweb.file.XVFSFile;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import junit.framework.Assert;
import lc3.C10485b;
import oa1.C117731d;
import pc0.C77068x;
import rx3.C13598b0;
import s90.C77634p;
import sc0.C36652a;
import te3.C49399fa;
import te3.C50954qg;
import te3.C64679rg;
import xf3.C112147a;

/* renamed from: com.tencent.mm.storage.f4 */
public class C72963f4 extends C77634p {

    /* renamed from: I1 */
    public static final /* synthetic */ int f212661I1 = 0;

    /* renamed from: A1 */
    public C72970g f212662A1;

    /* renamed from: B1 */
    public C49399fa f212663B1 = null;

    /* renamed from: C1 */
    public boolean f212664C1 = false;

    /* renamed from: D1 */
    public boolean f212665D1 = false;

    /* renamed from: E1 */
    public String f212666E1;

    /* renamed from: F1 */
    public String f212667F1;

    /* renamed from: G1 */
    public String f212668G1 = "";

    /* renamed from: H1 */
    public int f212669H1 = 0;

    /* renamed from: y1 */
    public C72966d f212670y1 = null;

    /* renamed from: z1 */
    public C72965c f212671z1;

    /* renamed from: com.tencent.mm.storage.f4$a */
    public class C6709a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f24118d;

        /* renamed from: e */
        public final /* synthetic */ C72963f4 f24119e;

        public C6709a(C72963f4 f4Var, long j, C72963f4 f4Var2) {
            this.f24118d = j;
            this.f24119e = f4Var2;
        }

        public void run() {
            ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).xy0(this.f24118d, this.f24119e);
        }
    }

    /* renamed from: com.tencent.mm.storage.f4$b */
    public static final class C72964b {

        /* renamed from: A */
        public String f212672A = "";

        /* renamed from: B */
        public String f212673B = "";

        /* renamed from: C */
        public String f212674C = "";

        /* renamed from: a */
        public String f212675a = "";

        /* renamed from: b */
        public String f212676b = "";

        /* renamed from: c */
        public String f212677c = "";

        /* renamed from: d */
        public String f212678d = "";

        /* renamed from: e */
        public String f212679e = "";

        /* renamed from: f */
        public int f212680f = 0;

        /* renamed from: g */
        public int f212681g = 0;

        /* renamed from: h */
        public String f212682h = "";

        /* renamed from: i */
        public String f212683i = "";

        /* renamed from: j */
        public long f212684j = 0;

        /* renamed from: k */
        public String f212685k = "";

        /* renamed from: l */
        public String f212686l = "";

        /* renamed from: m */
        public String f212687m;

        /* renamed from: n */
        public String f212688n;

        /* renamed from: o */
        public int f212689o;

        /* renamed from: p */
        public String f212690p;

        /* renamed from: q */
        public int f212691q = 0;

        /* renamed from: r */
        public String f212692r = "";

        /* renamed from: s */
        public String f212693s = "";

        /* renamed from: t */
        public String f212694t = "";

        /* renamed from: u */
        public String f212695u = "";

        /* renamed from: v */
        public String f212696v = "";

        /* renamed from: w */
        public String f212697w = "";

        /* renamed from: x */
        public String f212698x = "";

        /* renamed from: y */
        public String f212699y = "";

        /* renamed from: z */
        public String f212700z = "";

        /* renamed from: f */
        public static C72964b m85654f(String str) {
            int indexOf;
            C72964b bVar = new C72964b();
            String trim = Util.nullAs(str, "").trim();
            if (!trim.startsWith("<") && (indexOf = trim.indexOf(XVFSFile.PATH_SEPARATOR)) != -1) {
                trim = trim.substring(indexOf + 1);
            }
            Map<String, String> parseXml = XmlParser.parseXml(trim, "msg", (String) null);
            if (parseXml != null) {
                try {
                    if (parseXml.get(".msg.$fromusername") == null) {
                        bVar.f212675a = parseXml.get(".msg.$username");
                    } else {
                        bVar.f212675a = parseXml.get(".msg.$fromusername");
                    }
                    if (parseXml.get(".msg.$fromnickname") == null) {
                        bVar.f212676b = parseXml.get(".msg.$nickname");
                    } else {
                        bVar.f212676b = parseXml.get(".msg.$fromnickname");
                    }
                    bVar.f212677c = parseXml.get(".msg.$alias");
                    bVar.f212678d = parseXml.get(".msg.$fullpy");
                    bVar.f212679e = parseXml.get(".msg.$shortpy");
                    String str2 = parseXml.get(".msg.$source");
                    bVar.f212680f = Util.getInt(parseXml.get(".msg.$imagestatus"), 0);
                    bVar.f212681g = Util.getInt(parseXml.get(".msg.$scene"), 0);
                    bVar.f212682h = parseXml.get(".msg.$mobileidentify");
                    bVar.f212683i = parseXml.get(".msg.$mobilelongidentify");
                    if (parseXml.get(".msg.$qqnum") != null && parseXml.get(".msg.$qqnum").length() > 0) {
                        bVar.f212684j = Util.getLong(parseXml.get(".msg.$qqnum"), 0);
                    }
                    bVar.f212690p = parseXml.get(".msg.$sign");
                    if (parseXml.get(".msg.$sex") != null && parseXml.get(".msg.$sex").length() > 0) {
                        bVar.f212689o = Util.getInt(parseXml.get(".msg.$sex"), 0);
                    }
                    bVar.f212687m = parseXml.get(".msg.$city");
                    bVar.f212688n = parseXml.get(".msg.$province");
                    bVar.f212685k = parseXml.get(".msg.$qqnickname");
                    bVar.f212686l = parseXml.get(".msg.$qqremark");
                    bVar.f212691q = Util.getInt(TextUtils.isEmpty(parseXml.get(".msg.$certflag")) ? "0" : parseXml.get(".msg.$certflag"), 0);
                    bVar.f212692r = Util.nullAsNil(parseXml.get(".msg.$certinfo"));
                    bVar.f212693s = Util.nullAsNil(parseXml.get(".msg.$brandIconUrl"));
                    bVar.f212694t = Util.nullAsNil(parseXml.get(".msg.$regionCode"));
                    bVar.f212695u = Util.nullAsNil(parseXml.get(".msg.$bigheadimgurl"));
                    bVar.f212696v = Util.nullAsNil(parseXml.get(".msg.$smallheadimgurl"));
                    bVar.f212697w = Util.nullAsNil(parseXml.get(".msg.$googlecontact"));
                    bVar.f212698x = Util.nullAsNil(parseXml.get(".msg.$antispamticket"));
                    bVar.f212699y = Util.nullAsNil(parseXml.get(".msg.$openimappid"));
                    bVar.f212700z = Util.nullAsNil(parseXml.get(".msg.$openimdesc"));
                    bVar.f212672A = Util.nullAsNil(parseXml.get(".msg.$openimdescicon"));
                    bVar.f212673B = Util.nullAsNil(parseXml.get(".msg.$openimcustominfo"));
                    if (C72996z1.m85843n5(bVar.f212675a)) {
                        bVar.f212698x = Util.nullAsNil(parseXml.get(".msg.$ticket"));
                    }
                    m85655g(Util.nullAsNil(parseXml.get(".msg.$biznamecardinfo")), bVar);
                    Log.m105925i("MicroMsg.MsgInfo", "dkverify FriendContent user:[%s] ticket:[%s] big:[%s] sm:[%s]", bVar.f212675a, bVar.f212698x, bVar.f212695u, bVar.f212696v);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.MsgInfo", "exception:%s", Util.stackTraceToString(e));
                }
            }
            return bVar;
        }

        /* renamed from: g */
        public static void m85655g(String str, C72964b bVar) {
            int i = bVar.f212691q;
            Set<String> set = C45628s0.f123410p;
            if (C72996z1.m85810M4(i)) {
                if (!Util.isNullOrNil(str)) {
                    Log.m105925i("MicroMsg.MsgInfo", "parseBizNameCard bizNameCardStr size %d", Integer.valueOf(str.length()));
                    C50954qg qgVar = new C50954qg();
                    try {
                        qgVar.parseFrom(Base64.decode(str, 2));
                        if (!Util.isNullOrNil(qgVar.f140288d)) {
                            C64679rg rgVar = new C64679rg();
                            rgVar.parseFrom(Base64.decode(qgVar.f140288d, 2));
                            if (!Util.isNullOrNil(rgVar.f185167i)) {
                                bVar.f212675a = rgVar.f185167i;
                            }
                            int i2 = rgVar.f185163e;
                            if (i2 > 0) {
                                bVar.f212691q = i2;
                            }
                            if (!Util.isNullOrNil(rgVar.f185162d)) {
                                bVar.f212676b = rgVar.f185162d;
                            }
                            if (!Util.isNullOrNil(rgVar.f185164f)) {
                                bVar.f212674C = rgVar.f185164f;
                            }
                            Log.m105925i("MicroMsg.MsgInfo", "parseBizNameCard user:[%s] nickname:[%s] verifyflag:[%d] verifyName:[%s]", bVar.f212675a, bVar.f212676b, Integer.valueOf(bVar.f212691q), bVar.f212674C);
                        }
                    } catch (Exception e) {
                        Log.m105929w("MicroMsg.MsgInfo", "parseBizNameCard ex %s", e.getMessage());
                    }
                } else {
                    Log.m105924i("MicroMsg.MsgInfo", "parseBizNameCard bizNameCardStr is null");
                    bVar.f212691q = bVar.f212691q & -17 & -513;
                }
            }
        }

        /* renamed from: a */
        public String mo101024a() {
            if (!Util.isNullOrNil(this.f212694t)) {
                String[] split = this.f212694t.split("_");
                if (split.length > 0) {
                    if (split.length > 2) {
                        this.f212687m = RegionCodeDecoder.m124563k().mo135573h(split[0], split[1], split[2]);
                    } else if (split.length == 2) {
                        this.f212687m = RegionCodeDecoder.m124563k().mo135575j(split[0], split[1]);
                    } else {
                        this.f212687m = "";
                    }
                }
            }
            return this.f212687m;
        }

        /* renamed from: b */
        public String mo101025b() {
            if (!TextUtils.isEmpty(this.f212676b)) {
                return this.f212676b;
            }
            if (!TextUtils.isEmpty(this.f212677c)) {
                return this.f212677c;
            }
            Log.m105922f("MicroMsg.MsgInfo", "username is nullOrNil");
            return Util.nullAsNil(this.f212675a);
        }

        /* renamed from: c */
        public String mo101026c() {
            return this.f212675a;
        }

        /* renamed from: d */
        public String mo101027d() {
            if (!Util.isNullOrNil(this.f212694t)) {
                String[] split = this.f212694t.split("_");
                if (split.length > 0) {
                    if (split.length <= 2 || !RegionCodeDecoder.m124565r(split[0])) {
                        this.f212688n = RegionCodeDecoder.m124563k().mo135574i(split[0]);
                    } else {
                        this.f212688n = RegionCodeDecoder.m124563k().mo135575j(split[0], split[1]);
                    }
                }
            }
            return this.f212688n;
        }

        /* renamed from: e */
        public String mo101028e() {
            String str = this.f212686l;
            if (str != null && str.length() > 0) {
                return this.f212686l;
            }
            String str2 = this.f212685k;
            return (str2 == null || str2.length() <= 0) ? Long.toString(this.f212684j) : this.f212685k;
        }
    }

    /* renamed from: com.tencent.mm.storage.f4$c */
    public static class C72965c {

        /* renamed from: a */
        public String f212701a;
    }

    /* renamed from: com.tencent.mm.storage.f4$d */
    public interface C72966d<T> {

        /* renamed from: a */
        public static final C72967a f212702a = new C72967a();

        /* renamed from: com.tencent.mm.storage.f4$d$a */
        public static class C72967a implements C72966d<C72967a> {
            /* renamed from: a */
            public /* bridge */ /* synthetic */ boolean mo82132a(Object obj) {
                C72967a aVar = (C72967a) obj;
                return false;
            }
        }

        /* renamed from: a */
        boolean mo82132a(T t);
    }

    /* renamed from: com.tencent.mm.storage.f4$e */
    public static final class C72968e {

        /* renamed from: a */
        public String f212703a = "";

        /* renamed from: b */
        public double f212704b = 0.0d;

        /* renamed from: c */
        public double f212705c = 0.0d;

        /* renamed from: d */
        public int f212706d = 0;

        /* renamed from: e */
        public String f212707e = "";

        /* renamed from: f */
        public String f212708f = "";

        /* renamed from: g */
        public String f212709g = "";

        /* renamed from: h */
        public String f212710h = null;

        /* renamed from: i */
        public String f212711i = null;

        /* renamed from: j */
        public String f212712j = null;

        /* renamed from: k */
        public String f212713k = "";

        /* renamed from: l */
        public String f212714l = "";

        /* renamed from: m */
        public boolean f212715m = false;

        /* renamed from: n */
        public String f212716n = "";

        /* renamed from: o */
        public String f212717o = "";

        /* renamed from: p */
        public String f212718p = "";

        /* renamed from: q */
        public float f212719q = 0.0f;

        /* renamed from: r */
        public String f212720r = "";

        /* renamed from: s */
        public String f212721s = "";

        /* renamed from: c */
        public static C72968e m85663c(String str) {
            C72968e eVar = new C72968e();
            Map<String, String> parseXml = XmlParser.parseXml(str, "msg", (String) null);
            if (parseXml != null) {
                eVar.f212703a = Util.nullAs(parseXml.get(".msg.location.$fromusername"), "");
                eVar.f212704b = Util.safeParseDouble(parseXml.get(".msg.location.$x"));
                eVar.f212705c = Util.safeParseDouble(parseXml.get(".msg.location.$y"));
                eVar.f212707e = Util.nullAs(parseXml.get(".msg.location.$label"), "");
                eVar.f212709g = Util.nullAs(parseXml.get(".msg.location.$maptype"), "");
                eVar.f212706d = Util.safeParseInt(parseXml.get(".msg.location.$scale"));
                eVar.f212712j = Util.nullAs(parseXml.get(".msg.location.$localLocationen"), "");
                eVar.f212710h = Util.nullAs(parseXml.get(".msg.location.$localLocationcn"), "");
                eVar.f212711i = Util.nullAs(parseXml.get(".msg.location.$localLocationtw"), "");
                eVar.f212708f = Util.nullAs(parseXml.get(".msg.location.$poiname"), "");
                eVar.f212713k = Util.nullAs(parseXml.get(".msg.location.$infourl"), "");
                eVar.f212714l = Util.nullAs(parseXml.get(".msg.location.$poiid"), "");
                eVar.f212715m = Util.getBoolean(parseXml.get(".msg.location.$isFromPoiList"), false);
                eVar.f212716n = Util.nullAs(parseXml.get(".msg.location.$poiCategoryTips"), "");
                eVar.f212717o = Util.nullAs(parseXml.get(".msg.location.$poiBusinessHour"), "");
                eVar.f212718p = Util.nullAs(parseXml.get(".msg.location.$poiPhone"), "");
                eVar.f212719q = Util.safeParseFloat(parseXml.get(".msg.location.$poiPriceTips"));
                eVar.f212720r = Util.nullAs(parseXml.get(".msg.location.$buildingId"), "");
                eVar.f212721s = Util.nullAs(parseXml.get(".msg.location.$floorName"), "");
            }
            return eVar;
        }

        /* renamed from: a */
        public boolean mo101029a() {
            String str = this.f212708f;
            return str != null && !str.equals("") && !this.f212708f.equals("[位置]");
        }

        /* renamed from: b */
        public boolean mo101030b() {
            return Math.abs(this.f212705c) <= 180.0d && Math.abs(this.f212704b) <= 90.0d;
        }

        public String toString() {
            return String.format("%d-%d-%d", new Object[]{Integer.valueOf((int) (this.f212704b * 1000000.0d)), Integer.valueOf((int) (this.f212705c * 1000000.0d)), Integer.valueOf(this.f212706d)});
        }
    }

    /* renamed from: com.tencent.mm.storage.f4$f */
    public static final class C72969f {

        /* renamed from: a */
        public String f212722a = "";

        /* renamed from: b */
        public String f212723b = "";

        /* renamed from: c */
        public String f212724c = "";

        /* renamed from: d */
        public String f212725d = "";

        /* renamed from: e */
        public boolean f212726e = false;

        /* renamed from: f */
        public String f212727f;

        /* renamed from: a */
        public String mo101032a() {
            return this.f212724c;
        }

        /* renamed from: b */
        public String mo101033b() {
            return this.f212722a;
        }
    }

    /* renamed from: com.tencent.mm.storage.f4$g */
    public static class C72970g {

        /* renamed from: a */
        public boolean f212728a;

        /* renamed from: b */
        public long f212729b;
    }

    /* renamed from: com.tencent.mm.storage.f4$h */
    public static final class C72971h {

        /* renamed from: A */
        public String f212730A;

        /* renamed from: B */
        public String f212731B;

        /* renamed from: C */
        public int f212732C;

        /* renamed from: D */
        public String f212733D;

        /* renamed from: E */
        public String f212734E;

        /* renamed from: F */
        public String f212735F;

        /* renamed from: G */
        public String f212736G;

        /* renamed from: a */
        public String f212737a = "";

        /* renamed from: b */
        public String f212738b = "";

        /* renamed from: c */
        public String f212739c = "";

        /* renamed from: d */
        public String f212740d = "";

        /* renamed from: e */
        public String f212741e = "";

        /* renamed from: f */
        public String f212742f = "";

        /* renamed from: g */
        public int f212743g = 0;

        /* renamed from: h */
        public int f212744h = 0;

        /* renamed from: i */
        public String f212745i = "";

        /* renamed from: j */
        public String f212746j = "";

        /* renamed from: k */
        public long f212747k = 0;

        /* renamed from: l */
        public String f212748l = "";

        /* renamed from: m */
        public String f212749m;

        /* renamed from: n */
        public String f212750n;

        /* renamed from: o */
        public int f212751o;

        /* renamed from: p */
        public String f212752p;

        /* renamed from: q */
        public String f212753q;

        /* renamed from: r */
        public int f212754r = 0;

        /* renamed from: s */
        public String f212755s;

        /* renamed from: t */
        public String f212756t;

        /* renamed from: u */
        public String f212757u = "";

        /* renamed from: v */
        public String f212758v = "";

        /* renamed from: w */
        public int f212759w;

        /* renamed from: x */
        public String f212760x;

        /* renamed from: y */
        public String f212761y;

        /* renamed from: z */
        public String f212762z = "";

        /* renamed from: v */
        public static C72971h m85668v(String str) {
            C72971h hVar = new C72971h();
            Map<String, String> parseXml = XmlParser.parseXml(str, "msg", (String) null);
            if (parseXml != null) {
                try {
                    hVar.f212737a = parseXml.get(".msg.$fromusername");
                    hVar.f212738b = parseXml.get(".msg.$alias");
                    hVar.f212739c = parseXml.get(".msg.$fromnickname");
                    hVar.f212740d = parseXml.get(".msg.$fullpy");
                    hVar.f212741e = parseXml.get(".msg.$shortpy");
                    hVar.f212742f = parseXml.get(".msg.$content");
                    hVar.f212743g = Util.getInt(parseXml.get(".msg.$imagestatus"), 0);
                    hVar.f212744h = Util.getInt(parseXml.get(".msg.$scene"), 0);
                    hVar.f212745i = parseXml.get(".msg.$mhash");
                    hVar.f212746j = parseXml.get(".msg.$mfullhash");
                    if (parseXml.get(parseXml.get(".msg.$qqnum")) != null && parseXml.get(parseXml.get(".msg.$qqnum")).length() > 0) {
                        hVar.f212747k = Util.getLong(parseXml.get(".msg.$qqnum"), 0);
                    }
                    hVar.f212748l = parseXml.get(".msg.$qqnickname");
                    String str2 = parseXml.get(".msg.$qqremark");
                    hVar.f212752p = parseXml.get(".msg.$sign");
                    if (parseXml.get(".msg.$sex") != null && parseXml.get(".msg.$sex").length() > 0) {
                        hVar.f212751o = Util.getInt(parseXml.get(".msg.$sex"), 0);
                    }
                    hVar.f212749m = parseXml.get(".msg.$city");
                    hVar.f212750n = parseXml.get(".msg.$province");
                    hVar.f212753q = parseXml.get(".msg.$country");
                    if (parseXml.get(".msg.$snsflag") != null) {
                        hVar.f212754r = Util.getInt(parseXml.get(".msg.$snsflag"), 0);
                        hVar.f212755s = parseXml.get(".msg.$snsbgimgid");
                    }
                    String str3 = parseXml.get(".msg.$ticket");
                    hVar.f212756t = str3;
                    Log.m105919d("MicroMsg.MsgInfo", "dkverify ticket:%s", str3);
                    hVar.f212757u = Util.nullAsNil(parseXml.get(".msg.$bigheadimgurl"));
                    hVar.f212758v = Util.nullAsNil(parseXml.get(".msg.$smallheadimgurl"));
                    hVar.f212759w = Util.getInt(parseXml.get(".msg.$opcode"), 0);
                    hVar.f212760x = Util.nullAsNil(parseXml.get(".msg.$encryptusername"));
                    hVar.f212761y = Util.nullAsNil(parseXml.get(".msg.$googlecontact"));
                    Log.m105919d("MicroMsg.MsgInfo", "dkavatar VerifyContent user:[%s] big:[%s] sm:[%s]", hVar.f212737a, hVar.f212757u, hVar.f212758v);
                    hVar.f212762z = Util.nullAsNil(parseXml.get(".msg.$chatroomusername"));
                    hVar.f212730A = parseXml.get(".msg.$sourceusername");
                    hVar.f212731B = parseXml.get(".msg.$sourcenickname");
                    hVar.f212735F = parseXml.get(".msg.$sharecardusername");
                    hVar.f212736G = parseXml.get(".msg.$sharecardnickname");
                    int i = Util.getInt(parseXml.get(".msg.Antispam.$isSuspiciousUser"), 0);
                    hVar.f212732C = i;
                    if (i == 1) {
                        hVar.f212733D = parseXml.get(".msg.Antispam.safetyWarning");
                        hVar.f212734E = parseXml.get(".msg.Antispam.safetyWarningDetail");
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.MsgInfo", e, "", new Object[0]);
                }
            }
            return hVar;
        }

        /* renamed from: a */
        public String mo101034a() {
            return this.f212738b;
        }

        /* renamed from: b */
        public String mo101035b() {
            return this.f212762z;
        }

        /* renamed from: c */
        public String mo101036c() {
            return (Util.isNullOrNil(this.f212753q) || Util.isNullOrNil(this.f212750n)) ? this.f212749m : Util.isNullOrNil(this.f212749m) ? RegionCodeDecoder.m124563k().mo135575j(this.f212753q, this.f212750n) : RegionCodeDecoder.m124563k().mo135573h(this.f212753q, this.f212750n, this.f212749m);
        }

        /* renamed from: d */
        public String mo101037d() {
            return this.f212742f;
        }

        /* renamed from: e */
        public String mo101038e() {
            String str = this.f212739c;
            if (str != null && str.length() > 0) {
                return this.f212739c;
            }
            Log.m105922f("MicroMsg.MsgInfo", "username is nullOrNil");
            return this.f212737a;
        }

        /* renamed from: f */
        public String mo101039f() {
            return this.f212737a;
        }

        /* renamed from: g */
        public String mo101040g() {
            return this.f212746j;
        }

        /* renamed from: h */
        public String mo101041h() {
            return this.f212761y;
        }

        /* renamed from: i */
        public String mo101042i() {
            return this.f212739c;
        }

        /* renamed from: j */
        public String mo101043j() {
            return this.f212745i;
        }

        /* renamed from: k */
        public String mo101044k() {
            return !Util.isNullOrNil(this.f212753q) ? (Util.isNullOrNil(this.f212750n) || Util.isNullOrNil(this.f212749m) || !RegionCodeDecoder.m124565r(this.f212753q)) ? RegionCodeDecoder.m124563k().mo135574i(this.f212753q) : RegionCodeDecoder.m124563k().mo135575j(this.f212753q, this.f212750n) : this.f212750n;
        }

        /* renamed from: l */
        public String mo101045l() {
            return this.f212741e;
        }

        /* renamed from: m */
        public String mo101046m() {
            return this.f212748l;
        }

        /* renamed from: n */
        public long mo101047n() {
            return this.f212747k;
        }

        /* renamed from: o */
        public String mo101048o() {
            return this.f212740d;
        }

        /* renamed from: p */
        public int mo101049p() {
            return this.f212744h;
        }

        /* renamed from: q */
        public int mo101050q() {
            return this.f212751o;
        }

        /* renamed from: r */
        public String mo101051r() {
            return this.f212752p;
        }

        /* renamed from: s */
        public String mo101052s() {
            return this.f212755s;
        }

        /* renamed from: t */
        public int mo101053t() {
            return this.f212754r;
        }

        /* renamed from: u */
        public String mo101054u() {
            return this.f212756t;
        }
    }

    public C72963f4() {
    }

    /* renamed from: k3 */
    public static void m85592k3(long j) {
        Assert.assertTrue("msgId not in the reasonable scope", 100000000 > j && -10 < j);
    }

    /* renamed from: l3 */
    public static C72963f4 m85593l3(C72963f4 f4Var) {
        if (f4Var == null) {
            Log.m105918d("MicroMsg.MsgInfo", "convertFrom msg is null ");
            return null;
        }
        C72963f4 f4Var2 = new C72963f4();
        f4Var2.setMsgId(f4Var.getMsgId());
        f4Var2.mo108745Y2(f4Var.mo108774y2());
        f4Var2.setType(super.getType());
        f4Var2.mo100991d(f4Var.getStatus());
        f4Var2.mo108740T2(f4Var.mo108769t2());
        f4Var2.mo108741U2(f4Var.mo108770u2());
        f4Var2.mo108733M2(f4Var.getCreateTime());
        f4Var2.mo108749c3(f4Var.mo108768t());
        f4Var2.mo108732L2(f4Var.getContent());
        f4Var2.mo108739S2(f4Var.mo108765s2());
        f4Var2.mo108746Z2(f4Var.mo108775z2());
        f4Var2.mo108742V2(f4Var.mo108771v2());
        f4Var2.mo108758i3(f4Var.mo108727G2());
        f4Var2.f230722E = f4Var.f230722E;
        f4Var2.f230755r = true;
        f4Var2.mo108743W2(f4Var.f230723F);
        f4Var2.mo101012p4(f4Var.f230724G);
        return f4Var2;
    }

    /* renamed from: A3 */
    public boolean mo100961A3() {
        return super.getType() == 268435505;
    }

    /* renamed from: B3 */
    public boolean mo100962B3() {
        return super.getType() == 855638065;
    }

    /* renamed from: C3 */
    public boolean mo100963C3() {
        return super.getType() == 16777265;
    }

    /* renamed from: D3 */
    public boolean mo100964D3() {
        boolean z = !Util.isNullOrNil(this.f230724G) && this.f230724G.contains("notify@all");
        Log.m105919d("MicroMsg.MsgInfo", "isAtAll isAtAll:%s", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: E2 */
    public String mo100965E2() {
        String E2 = super.mo100965E2();
        return TextUtils.isEmpty(E2) ? mo108769t2() == 1 ? mo108768t() : (String) C86709a0.m107535s().mo121142i().mo119684e(2, "") : E2;
    }

    /* renamed from: E3 */
    public boolean mo100966E3(String str) {
        Map<String, String> parseXml;
        if (Util.isNullOrNil(this.f230724G) || Util.isNullOrNil(str) || (parseXml = XmlParser.parseXml(this.f230724G, "msgsource", (String) null)) == null) {
            return false;
        }
        String str2 = parseXml.get(".msgsource.atuserlist");
        if (!Util.isNullOrNil(str2)) {
            for (String trim : str2.split(",")) {
                if (trim.trim().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: F3 */
    public boolean mo100967F3() {
        return super.getType() == 285212721;
    }

    /* renamed from: G3 */
    public boolean mo100968G3() {
        int type = super.getType();
        return type == 55 || type == 57;
    }

    /* renamed from: H3 */
    public boolean mo100969H3() {
        return super.getType() == 436207665;
    }

    /* renamed from: I3 */
    public boolean mo100970I3() {
        return super.getType() == 469762097;
    }

    /* renamed from: J3 */
    public boolean mo100971J3() {
        boolean z = !Util.isNullOrNil(this.f230724G) && this.f230724G.contains("announcement@all");
        Log.m105919d("MicroMsg.MsgInfo", "isAtAll isAtAll:%s", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: K3 */
    public boolean mo100972K3() {
        return (this.f230727J & 1) > 0;
    }

    /* renamed from: L3 */
    public boolean mo100973L3() {
        return super.getType() == 47;
    }

    /* renamed from: M3 */
    public boolean mo100974M3() {
        return super.getType() == 486539313 && this.f212664C1 && this.f212663B1 != null;
    }

    /* renamed from: N3 */
    public boolean mo100975N3() {
        return super.getType() == 42 || super.getType() == 66;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r4.f230724G, "msgsource", (java.lang.String) null);
     */
    /* renamed from: O3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo100976O3() {
        /*
            r4 = this;
            java.lang.String r0 = r4.f230724G
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r1 = 0
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = r4.f230724G
            r2 = 0
            java.lang.String r3 = "msgsource"
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r3, r2)
            if (r0 != 0) goto L_0x0015
            return r1
        L_0x0015:
            java.lang.String r2 = ".msgsource.watchuser"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0025
            r0 = 1
            return r0
        L_0x0025:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C72963f4.mo100976O3():boolean");
    }

    /* renamed from: P3 */
    public boolean mo100977P3() {
        return super.getType() == 805306417;
    }

    /* renamed from: Q3 */
    public boolean mo100978Q3() {
        int i = this.f230723F;
        return ((i & 128) == 0 && (i & 768) == 0) ? false : true;
    }

    /* renamed from: R3 */
    public boolean mo100979R3() {
        int type = super.getType();
        return type == 3 || type == 13 || type == 23 || type == 33 || type == 39;
    }

    /* renamed from: S3 */
    public boolean mo100980S3() {
        return (this.f230723F & 1048576) != 0;
    }

    /* renamed from: T3 */
    public boolean mo100981T3() {
        return super.getType() == 67;
    }

    /* renamed from: U3 */
    public boolean mo100982U3() {
        return super.getType() == 48;
    }

    /* renamed from: V3 */
    public boolean mo100983V3() {
        return super.getType() == 486539313;
    }

    /* renamed from: W3 */
    public boolean mo100984W3() {
        return super.getType() == 64;
    }

    /* renamed from: X3 */
    public boolean mo100985X3() {
        return super.getType() == 10002 || super.getType() == 268445458;
    }

    /* renamed from: Y3 */
    public boolean mo100986Y3() {
        return super.getType() == 889192497 || super.getType() == 922746929;
    }

    /* renamed from: Z3 */
    public boolean mo100987Z3() {
        return super.getType() == 822083633;
    }

    /* renamed from: a4 */
    public boolean mo100988a4() {
        return super.getType() == 301989937;
    }

    /* renamed from: b4 */
    public boolean mo100989b4() {
        return super.getType() == 62;
    }

    @Deprecated
    /* renamed from: c4 */
    public boolean mo100990c4() {
        return super.getType() == 10000;
    }

    public void convertFrom(Cursor cursor) {
        super.convertFrom(cursor);
        String content = getContent();
        if (content != null && content.length() > 2097152) {
            long msgId = getMsgId();
            StringBuilder sb = new StringBuilder(1024);
            sb.append("Very big message: \n");
            sb.append("msgId = ");
            sb.append(msgId);
            sb.append(10);
            sb.append("msgSvrId = ");
            sb.append(mo108774y2());
            sb.append(10);
            sb.append("type = ");
            sb.append(super.getType());
            sb.append(10);
            sb.append("createTime = ");
            sb.append(getCreateTime());
            sb.append(10);
            sb.append("talker = ");
            sb.append(mo108768t());
            sb.append(10);
            sb.append("flag = ");
            sb.append(mo108762o2());
            sb.append(10);
            sb.append("content.length() = ");
            sb.append(content.length());
            sb.append(10);
            sb.append("content = ");
            sb.append(content.substring(0, 256));
            Log.m105920e("MicroMsg.MsgInfo", sb.toString());
            setType(1);
            mo108732L2("");
            C86709a0.m107525e().postToWorker(new C6709a(this, msgId, m85593l3(this)));
        }
        m85592k3(getMsgId());
    }

    public ContentValues convertTo() {
        m85592k3(getMsgId());
        return super.convertTo();
    }

    /* renamed from: d */
    public void mo100991d(int i) {
        super.mo100991d(i);
        if (mo108769t2() == 1) {
            C77068x xVar = C77068x.f225120a;
            int status = getStatus();
            if (status == 2 || status == 5) {
                HashMap<Long, C77068x.C77069a> hashMap = C77068x.f225121b;
                synchronized (hashMap) {
                    C77068x.C77069a aVar = hashMap.get(Long.valueOf(getMsgId()));
                    if (aVar != null && aVar.f225122a && aVar.f225124c == -1) {
                        hashMap.remove(Long.valueOf(getMsgId()));
                        Log.m105924i("MMRevoke.RevokeMsgManager", "onMsgSendFinished() called remove id:" + getMsgId() + " , status:" + status + " preStatus:" + aVar);
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            }
        }
        if (mo108769t2() == 1) {
            if (!mo100993e4() && !mo100982U3() && !mo100975N3()) {
                if (getStatus() == 5) {
                    Log.m105921e("MicroMsg.MsgInfo", "set msg status fail, msgId:%d, type:%d, userName:%s %s", Long.valueOf(getMsgId()), Integer.valueOf(super.getType()), mo108768t(), Util.getStack());
                    SendMsgFailEvent sendMsgFailEvent = new SendMsgFailEvent();
                    sendMsgFailEvent.f193928d.f193929a = this;
                    sendMsgFailEvent.publish();
                    return;
                } else if (getStatus() == 2) {
                    Log.m105919d("MicroMsg.MsgInfo", "successfully send msgId:%d, type:%d", Long.valueOf(getMsgId()), Integer.valueOf(super.getType()));
                    SendMsgSuccessEvent sendMsgSuccessEvent = new SendMsgSuccessEvent();
                    sendMsgSuccessEvent.f193930d.f193931a = this;
                    sendMsgSuccessEvent.publish();
                    return;
                } else {
                    return;
                }
            }
        }
        if (mo108769t2() == 0) {
            ReceiveMsgEvent receiveMsgEvent = new ReceiveMsgEvent();
            receiveMsgEvent.f78913d.f78914a = this;
            receiveMsgEvent.publish();
        }
    }

    /* renamed from: d4 */
    public boolean mo100992d4() {
        return super.getType() == 318767153;
    }

    /* renamed from: e4 */
    public boolean mo100993e4() {
        int type = super.getType();
        return type == 1 || type == 11 || type == 21 || type == 31 || type == 36 || type == 1107296305;
    }

    /* renamed from: f4 */
    public boolean mo100994f4() {
        return super.getType() == 43;
    }

    /* renamed from: g4 */
    public boolean mo100995g4() {
        return super.getType() == 34;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        r3 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r3, "msgsource", (java.lang.String) null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long getCreateTime() {
        /*
            r7 = this;
            r0 = -1
            com.tencent.mm.storage.f4$g r2 = r7.f212662A1     // Catch:{ all -> 0x0046 }
            if (r2 != 0) goto L_0x0046
            com.tencent.mm.storage.f4$g r2 = new com.tencent.mm.storage.f4$g     // Catch:{ all -> 0x0046 }
            r2.<init>()     // Catch:{ all -> 0x0046 }
            r7.f212662A1 = r2     // Catch:{ all -> 0x0046 }
            java.lang.String r3 = r7.f230724G     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = "<share_msg>"
            boolean r3 = r3.contains(r4)     // Catch:{ all -> 0x0046 }
            r2.f212728a = r3     // Catch:{ all -> 0x0046 }
            com.tencent.mm.storage.f4$g r2 = r7.f212662A1     // Catch:{ all -> 0x0046 }
            boolean r3 = r2.f212728a     // Catch:{ all -> 0x0046 }
            if (r3 == 0) goto L_0x0046
            java.lang.String r3 = r7.f230724G     // Catch:{ all -> 0x0046 }
            int r4 = eb0.C75569c4.f221998a     // Catch:{ all -> 0x0046 }
            if (r3 == 0) goto L_0x0043
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ all -> 0x0046 }
            if (r4 != 0) goto L_0x0043
            r4 = 0
            java.lang.String r5 = "msgsource"
            java.util.Map r3 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r3, r5, r4)     // Catch:{ all -> 0x0046 }
            if (r3 == 0) goto L_0x0043
            java.lang.String r4 = ".msgsource.share_msg.createtime"
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x0046 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0046 }
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r3)     // Catch:{ all -> 0x0046 }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            goto L_0x0044
        L_0x0043:
            r3 = r0
        L_0x0044:
            r2.f212729b = r3     // Catch:{ all -> 0x0046 }
        L_0x0046:
            com.tencent.mm.storage.f4$g r2 = r7.f212662A1
            if (r2 == 0) goto L_0x0055
            boolean r3 = r2.f212728a
            if (r3 == 0) goto L_0x0055
            long r2 = r2.f212729b
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x0055
            return r2
        L_0x0055:
            long r0 = super.getCreateTime()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C72963f4.getCreateTime():long");
    }

    public int getType() {
        return super.getType();
    }

    /* renamed from: h4 */
    public boolean mo100998h4() {
        return super.getType() == -1879048189;
    }

    /* renamed from: i4 */
    public boolean mo100999i4() {
        return super.getType() == -1879048190;
    }

    /* renamed from: j3 */
    public boolean mo101000j3() {
        return C117731d.m166007c().mo182440a(new C112147a()) == 1 ? getStatus() <= 2 : getStatus() == 2;
    }

    /* renamed from: j4 */
    public boolean mo101001j4() {
        return super.getType() == -1879048191;
    }

    /* renamed from: k4 */
    public boolean mo101002k4() {
        return super.getType() == 50 || super.getType() == 53;
    }

    /* renamed from: l4 */
    public boolean mo101003l4() {
        return super.getType() == 52;
    }

    /* renamed from: m3 */
    public boolean mo101004m3() {
        return (this.f230723F & 64) != 0;
    }

    /* renamed from: m4 */
    public C36652a mo101005m4() {
        Log.m105924i("MicroMsg.MsgInfo", "[parseNewXmlSysMsg]");
        String content = getContent();
        if (super.getType() == 268445458) {
            content = this.f230762x0;
        }
        C36652a aVar = null;
        Map<String, String> parseXml = XmlParser.parseXml(content, "sysmsg", (String) null);
        HashMap<String, C36652a.C36653a> hashMap = C36652a.C36653a.f97427a;
        if (parseXml == null) {
            Log.m105920e("MicroMsg.BaseNewXmlMsg", "values is null !!!");
        } else {
            String nullAs = Util.nullAs(parseXml.get(".sysmsg.$type"), "");
            synchronized (C36652a.C36653a.f97427a) {
                C36652a.C36653a aVar2 = C36652a.C36653a.f97427a.get(nullAs.toLowerCase());
                if (aVar2 == null) {
                    Log.m105929w("MicroMsg.BaseNewXmlMsg", "TYPE %s is unDefine", nullAs);
                } else {
                    aVar = aVar2.mo58186a(parseXml, this);
                }
            }
        }
        if (aVar != null) {
            Log.m105925i("MicroMsg.MsgInfo", "BaseNewXmlMsg:%s", aVar);
            aVar.mo60785a();
            this.f212666E1 = aVar.f97422e;
        } else {
            Log.m105920e("MicroMsg.MsgInfo", "[parseNewXmlSysMsg] null == pBaseNewXmlMsg");
        }
        return aVar;
    }

    /* renamed from: n3 */
    public boolean mo101006n3() {
        return mo101015s3() && (this.f230723F & 16) > 0;
    }

    /* renamed from: n4 */
    public void mo101007n4(int i) {
        if (i == 0 || i == 1) {
            mo108743W2(i | this.f230723F);
        } else {
            Log.m105928w("MicroMsg.MsgInfo", "Illgeal forwardflag !!!");
        }
    }

    /* renamed from: o3 */
    public String mo101008o3() {
        try {
            if (this.f212671z1 == null) {
                this.f212671z1 = new C72965c();
                this.f212671z1.f212701a = XmlParser.parseXml(getContent(), "sysmsg", (String) null).get(".sysmsg.sysmsgtemplate.content_template.link_list.link2.msgcount");
            }
        } catch (Throwable unused) {
        }
        C72965c cVar = this.f212671z1;
        return cVar != null ? cVar.f212701a : "";
    }

    /* renamed from: o4 */
    public void mo101009o4() {
        mo108743W2(this.f230723F | 512);
    }

    /* renamed from: p2 */
    public String mo101010p2() {
        String p2 = super.mo101010p2();
        return TextUtils.isEmpty(p2) ? mo108769t2() == 1 ? (String) C86709a0.m107535s().mo121142i().mo119684e(2, "") : mo108768t() : p2;
    }

    /* renamed from: p3 */
    public String mo101011p3() {
        if (!mo100985X3()) {
            return "";
        }
        if (this.f212666E1 == null) {
            mo101005m4();
        }
        return this.f212666E1;
    }

    /* renamed from: p4 */
    public void mo101012p4(String str) {
        this.f230724G = str;
        this.f230755r = true;
        this.f212662A1 = null;
    }

    /* renamed from: q3 */
    public boolean mo101013q3() {
        return (this.f230723F & 8192) > 0;
    }

    /* renamed from: q4 */
    public void mo101014q4(boolean z) {
        if (z) {
            mo108743W2(this.f230723F | 524288);
        } else {
            mo108743W2(this.f230723F & -524289);
        }
    }

    /* renamed from: s3 */
    public boolean mo101015s3() {
        boolean z;
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("TranslateMsgOff");
        if (!Util.isNullOrNil(c) && Util.safeParseInt(c) != 0) {
            Log.m105918d("MicroMsg.MsgInfo", "isTranslateFeatureOn false");
            z = false;
        } else {
            z = true;
        }
        return z && !Util.isNullOrNil(mo108727G2());
    }

    /* renamed from: t3 */
    public boolean mo101016t3() {
        return super.getType() == 1124073521;
    }

    /* renamed from: u3 */
    public boolean mo101017u3() {
        return super.getType() == 10000 || super.getType() == 10002 || super.getType() == 570425393 || super.getType() == 64 || super.getType() == 603979825 || super.getType() == 889192497 || super.getType() == 922746929 || super.getType() == 268445456 || super.getType() == 1077936177;
    }

    public void unsetOmittedFailResend() {
        int i = this.f230723F;
        if ((i & 32) > 0) {
            mo108743W2(i & -33);
        }
    }

    /* renamed from: v3 */
    public boolean mo101019v3() {
        return super.getType() == 10000 || super.getType() == 10002 || super.getType() == 570425393 || super.getType() == 64 || super.getType() == 603979825 || super.getType() == 889192497 || super.getType() == 922746929 || super.getType() == 268445456 || super.getType() == 268445458 || super.getType() == -1879048191 || super.getType() == 1077936177;
    }

    /* renamed from: w3 */
    public boolean mo101020w3() {
        return (super.getType() & 65535) == 49 && super.getType() != 1107296305;
    }

    /* renamed from: x3 */
    public boolean mo101021x3() {
        return super.getType() == 503316529;
    }

    /* renamed from: y3 */
    public boolean mo101022y3() {
        return super.getType() == 1048625;
    }

    /* renamed from: z3 */
    public boolean mo101023z3() {
        return super.getType() == 1090519089;
    }

    public C72963f4(String str) {
        mo108749c3(str);
    }
}
