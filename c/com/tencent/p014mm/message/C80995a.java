package com.tencent.p014mm.message;

import android.text.TextUtils;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p206nj.C117627q;

/* renamed from: com.tencent.mm.message.a */
public class C80995a extends C68066g {

    /* renamed from: A */
    public String f237884A;

    /* renamed from: B */
    public int f237885B = 0;

    /* renamed from: C */
    public String f237886C = "";

    /* renamed from: D */
    public String f237887D = "";

    /* renamed from: E */
    public String f237888E = "";

    /* renamed from: F */
    public String f237889F = "";

    /* renamed from: G */
    public String f237890G = "";

    /* renamed from: H */
    public String f237891H = "";

    /* renamed from: I */
    public boolean f237892I = false;

    /* renamed from: b */
    public boolean f237893b;

    /* renamed from: c */
    public String f237894c;

    /* renamed from: d */
    public int f237895d;

    /* renamed from: e */
    public boolean f237896e;

    /* renamed from: f */
    public String f237897f;

    /* renamed from: g */
    public String f237898g;

    /* renamed from: h */
    public String f237899h;

    /* renamed from: i */
    public String f237900i;

    /* renamed from: j */
    public String f237901j;

    /* renamed from: k */
    public String f237902k;

    /* renamed from: l */
    public int f237903l;

    /* renamed from: m */
    public int f237904m;

    /* renamed from: n */
    public int f237905n = 0;

    /* renamed from: o */
    public int f237906o = 0;

    /* renamed from: p */
    public boolean f237907p;

    /* renamed from: q */
    public int f237908q = 0;

    /* renamed from: r */
    public String f237909r;

    /* renamed from: s */
    public String f237910s;

    /* renamed from: t */
    public int f237911t = 0;

    /* renamed from: u */
    public boolean f237912u;

    /* renamed from: v */
    public String f237913v;

    /* renamed from: w */
    public boolean f237914w;

    /* renamed from: x */
    public int f237915x;

    /* renamed from: y */
    public int f237916y;

    /* renamed from: z */
    public String f237917z;

    /* renamed from: a */
    public C68066g mo7615a() {
        C80995a aVar = new C80995a();
        aVar.f237893b = this.f237893b;
        aVar.f237894c = this.f237894c;
        aVar.f237895d = this.f237895d;
        aVar.f237896e = this.f237896e;
        aVar.f237897f = this.f237897f;
        aVar.f237898g = this.f237898g;
        aVar.f237899h = this.f237899h;
        aVar.f237900i = this.f237900i;
        aVar.f237901j = this.f237901j;
        aVar.f237903l = this.f237903l;
        aVar.f237904m = this.f237904m;
        aVar.f237910s = this.f237910s;
        aVar.f237911t = this.f237911t;
        aVar.f237916y = this.f237916y;
        aVar.f237915x = this.f237915x;
        aVar.f237917z = this.f237917z;
        aVar.f237884A = this.f237884A;
        aVar.f237885B = this.f237885B;
        aVar.f237886C = this.f237886C;
        aVar.f237888E = this.f237888E;
        aVar.f237889F = this.f237889F;
        aVar.f237890G = this.f237890G;
        aVar.f237891H = this.f237891H;
        aVar.f237905n = this.f237905n;
        aVar.f237906o = this.f237906o;
        aVar.f237907p = this.f237907p;
        aVar.f237908q = this.f237908q;
        aVar.f237892I = this.f237892I;
        aVar.f237913v = this.f237913v;
        return aVar;
    }

    /* renamed from: b */
    public void mo93543b(C98124g gVar, C68070l.C68072b bVar) {
        if (bVar.f195582i == 48 && Util.isNullOrNil(this.f237890G) && !Util.isNullOrNil(this.f237886C)) {
            gVar.field_appType = 213;
            String str = this.f237886C;
            gVar.field_fullpath = str;
            gVar.field_filemd5 = this.f237887D;
            gVar.field_fileType = CdnLogic.kMediaTypeAppVideo;
            gVar.field_totalLen = (int) C86013q1.m106451l(str);
            gVar.field_needStorage = true;
            gVar.field_isStreamMedia = false;
            gVar.field_force_aeskeycdn = false;
            gVar.field_trysafecdn = true;
            gVar.field_bzScene = 2;
        }
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        sb.append("<weappinfo>");
        if (!Util.isNullOrNil(bVar.f195569e2)) {
            sb.append("<pagepath>" + C68070l.C68072b.m80417g(bVar.f195569e2) + "</pagepath>");
        }
        sb.append("<username>" + Util.escapeStringForXml(bVar.f195573f2) + "</username>");
        sb.append("<appid>" + Util.escapeStringForXml(bVar.f195577g2) + "</appid>");
        if (bVar.f195467A2 != 0) {
            sb.append("<version>" + bVar.f195467A2 + "</version>");
        }
        if (bVar.f195581h2 != 0) {
            sb.append("<type>" + bVar.f195581h2 + "</type>");
        }
        if (!Util.isNullOrNil(bVar.f195471B2)) {
            sb.append("<weappiconurl>" + C68070l.C68072b.m80417g(bVar.f195471B2) + "</weappiconurl>");
        }
        if (!Util.isNullOrNil(this.f237913v)) {
            sb.append("<weapppagethumbrawurl>" + C68070l.C68072b.m80417g(this.f237913v) + "</weapppagethumbrawurl>");
        }
        if (!Util.isNullOrNil(bVar.f195589j2)) {
            sb.append("<shareId>" + C68070l.C68072b.m80417g(bVar.f195589j2) + "</shareId>");
        }
        int i3 = bVar.f195653z2;
        if (i3 == 1 || i3 == 2) {
            sb.append("<pkginfo>");
            sb.append("<type>");
            sb.append(bVar.f195653z2);
            sb.append("</type>");
            sb.append("<md5>");
            sb.append(bVar.f195585i2);
            sb.append("</md5>");
            sb.append("</pkginfo>");
        }
        if (!Util.isNullOrNil(bVar.f195593k2)) {
            sb.append("<sharekey>" + C68070l.C68072b.m80417g(bVar.f195593k2) + "</sharekey>");
        }
        if (!Util.isNullOrNil(this.f237910s)) {
            sb.append("<messageextradata>");
            sb.append(C68070l.C68072b.m80417g(this.f237910s));
            sb.append("</messageextradata>");
        }
        if (this.f237893b) {
            sb.append("<wadynamicpageinfo>");
            sb.append("<shouldUseDynamicPage>1</shouldUseDynamicPage>");
            sb.append("<cacheKey>");
            sb.append(C68070l.C68072b.m80417g(this.f237894c));
            sb.append("</cacheKey>");
            sb.append("</wadynamicpageinfo>");
        }
        if (this.f237896e) {
            sb.append("<waupdatablemsginfov3>");
            sb.append("<shoulduseupdatablemsg>1</shoulduseupdatablemsg>");
            sb.append("<updatablemsgperiod>");
            sb.append(this.f237903l);
            sb.append("</updatablemsgperiod>");
            sb.append("<updatablemsgstate>");
            sb.append(this.f237904m);
            sb.append("</updatablemsgstate>");
            sb.append("<updatablemsgcontent>");
            sb.append(C68070l.C68072b.m80417g(this.f237897f));
            sb.append("</updatablemsgcontent>");
            sb.append("<updatablemsgcontentcolor>");
            sb.append(C68070l.C68072b.m80417g(this.f237898g));
            sb.append("</updatablemsgcontentcolor>");
            sb.append("<subscribeentrycontent>");
            sb.append(C68070l.C68072b.m80417g(this.f237899h));
            sb.append("</subscribeentrycontent>");
            sb.append("<subscribeentrybuttonwording>");
            sb.append(C68070l.C68072b.m80417g(this.f237900i));
            sb.append("</subscribeentrybuttonwording>");
            sb.append("<subscribeconfirmedcontent>");
            sb.append(C68070l.C68072b.m80417g(this.f237901j));
            sb.append("</subscribeconfirmedcontent>");
            sb.append("<expiredsubscribewording>");
            sb.append(C68070l.C68072b.m80417g(this.f237902k));
            sb.append("</expiredsubscribewording>");
            sb.append("</waupdatablemsginfov3>");
        }
        sb.append("<appservicetype>" + this.f237895d + "</appservicetype>");
        if (bVar.f195605n2 != 0) {
            sb.append("<disableforward>" + bVar.f195605n2 + "</disableforward>");
        }
        sb.append("<secflagforsinglepagemode>" + bVar.f195617q2 + "</secflagforsinglepagemode>");
        if (bVar.mo93554q(true)) {
            sb.append("<nativeappinfo>");
            sb.append("<type>" + bVar.f195597l2 + "</type>");
            sb.append("<appnamemultilanguagekey>" + C68070l.C68072b.m80417g(bVar.f195601m2) + "</appnamemultilanguagekey>");
            sb.append("<sourcename>" + C68070l.C68072b.m80417g(bVar.f195609o2) + "</sourcename>");
            sb.append("<sourceiconurl>" + C68070l.C68072b.m80417g(bVar.f195613p2) + "</sourceiconurl>");
            sb.append("</nativeappinfo>");
        }
        sb.append("<videopageinfo>");
        StringBuilder sb4 = new StringBuilder();
        sb4.append("<thumbwidth>");
        if (i == 0) {
            i = this.f237915x;
        }
        sb4.append(i);
        sb4.append("</thumbwidth>");
        sb.append(sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append("<thumbheight>");
        if (i2 == 0) {
            i2 = this.f237916y;
        }
        sb5.append(i2);
        sb5.append("</thumbheight>");
        sb.append(sb5.toString());
        if (!Util.isNullOrNil(this.f237917z)) {
            sb.append("<videosource>" + C68070l.C68072b.m80417g(this.f237917z) + "</videosource>");
        }
        if (!Util.isNullOrNil(this.f237884A)) {
            sb.append("<appthumburl>" + C68070l.C68072b.m80417g(this.f237884A) + "</appthumburl>");
        }
        sb.append("<fromopensdk>" + this.f237885B + "</fromopensdk>");
        sb.append("</videopageinfo>");
        if (!Util.isNullOrNil(this.f237888E) || !Util.isNullOrNil(this.f237886C)) {
            sb.append("<screenvideoinfo>");
            sb.append("<videobuttontext>");
            sb.append(C68070l.C68072b.m80417g(this.f237889F));
            sb.append("</videobuttontext>");
            if (dVar != null && !Util.isNullOrNil(dVar.field_fileUrl)) {
                C86013q1.m106447h(this.f237886C);
                this.f237888E = dVar.field_fileUrl;
                this.f237887D = dVar.field_filemd5;
                this.f237890G = dVar.field_thumbUrl;
            }
            if (Util.isNullOrNil(this.f237888E)) {
                sb.append("<videotemplocalpath>");
                sb.append(C68070l.C68072b.m80417g(this.f237886C));
                sb.append("</videotemplocalpath>");
            }
            sb.append("<videomd5>");
            sb.append(C68070l.C68072b.m80417g(this.f237887D));
            sb.append("</videomd5>");
            sb.append("<videoremoteurl>");
            sb.append(C68070l.C68072b.m80417g(this.f237888E));
            sb.append("</videoremoteurl>");
            sb.append("<videothumburl>");
            sb.append(C68070l.C68072b.m80417g(this.f237890G));
            sb.append("</videothumburl>");
            sb.append("<videoplaydesc>");
            sb.append(C68070l.C68072b.m80417g(this.f237891H));
            sb.append("</videoplaydesc>");
            sb.append("</screenvideoinfo>");
        }
        if (this.f237905n != 0) {
            sb.append("<tradingguaranteeflag>");
            sb.append(this.f237905n);
            sb.append("</tradingguaranteeflag>");
        }
        if (this.f237906o != 0) {
            sb.append("<showRelievedBuyFlag>");
            sb.append(this.f237906o);
            sb.append("</showRelievedBuyFlag>");
        }
        if (this.f237907p) {
            sb.append("<hasRelievedBuyPlugin>1</hasRelievedBuyPlugin>");
        }
        if (this.f237908q != 0) {
            sb.append("<showFlagshipFlag>");
            sb.append(this.f237908q);
            sb.append("</showFlagshipFlag>");
        }
        if (this.f237911t != 0) {
            sb.append("<subType>");
            sb.append(this.f237911t);
            sb.append("</subType>");
        }
        if (!TextUtils.isEmpty(this.f237909r)) {
            sb.append("<todoactivityid>");
            sb.append(C68070l.C68072b.m80417g(this.f237909r));
            sb.append("</todoactivityid>");
        }
        sb.append("</weappinfo>");
        if (this.f237892I) {
            sb.append("<roomtoolsflag>1</roomtoolsflag>");
        }
        if (this.f237912u) {
            sb.append("<isprivatemessage>1</isprivatemessage>");
        }
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        boolean z = false;
        this.f237893b = Util.getInt(map.get(".msg.appmsg.weappinfo.wadynamicpageinfo.shouldUseDynamicPage"), 0) == 1;
        this.f237894c = map.get(".msg.appmsg.weappinfo.wadynamicpageinfo.cacheKey");
        this.f237895d = Util.getInt(map.get(".msg.appmsg.weappinfo.appservicetype"), this.f237895d);
        this.f237910s = map.get(".msg.appmsg.weappinfo.messageextradata");
        this.f237911t = Util.getInt(map.get(".msg.appmsg.weappinfo.subType"), this.f237911t);
        this.f237896e = Util.getInt(map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.shoulduseupdatablemsg"), 0) == 1;
        this.f237897f = map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.updatablemsgcontent");
        this.f237898g = map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.updatablemsgcontentcolor");
        this.f237899h = map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.subscribeentrycontent");
        this.f237900i = map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.subscribeentrybuttonwording");
        this.f237901j = map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.subscribeconfirmedcontent");
        this.f237902k = map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.expiredsubscribewording");
        this.f237904m = Util.getInt(map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.updatablemsgstate"), 1);
        this.f237903l = (int) Util.getLong(map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.updatablemsgperiod"), 10);
        this.f237915x = Util.getInt(map.get(".msg.appmsg.weappinfo.videopageinfo.thumbwidth"), 0);
        this.f237916y = Util.getInt(map.get(".msg.appmsg.weappinfo.videopageinfo.thumbheight"), 0);
        this.f237917z = map.get(".msg.appmsg.weappinfo.videopageinfo.videosource");
        this.f237884A = map.get(".msg.appmsg.weappinfo.videopageinfo.appthumburl");
        this.f237885B = Util.getInt(map.get(".msg.appmsg.weappinfo.videopageinfo.fromopensdk"), 0);
        this.f237886C = map.get(".msg.appmsg.weappinfo.screenvideoinfo.videotemplocalpath");
        this.f237887D = map.get(".msg.appmsg.weappinfo.screenvideoinfo.videomd5");
        this.f237888E = map.get(".msg.appmsg.weappinfo.screenvideoinfo.videoremoteurl");
        this.f237889F = map.get(".msg.appmsg.weappinfo.screenvideoinfo.videobuttontext");
        this.f237890G = map.get(".msg.appmsg.weappinfo.screenvideoinfo.videothumburl");
        this.f237891H = map.get(".msg.appmsg.weappinfo.screenvideoinfo.videoplaydesc");
        this.f237905n = Util.getInt(map.get(".msg.appmsg.weappinfo.tradingguaranteeflag"), 0);
        this.f237906o = Util.getInt(map.get(".msg.appmsg.weappinfo.showRelievedBuyFlag"), 0);
        this.f237907p = Util.getInt(map.get(".msg.appmsg.weappinfo.hasRelievedBuyPlugin"), 0) == 1;
        this.f237908q = Util.getInt(map.get(".msg.appmsg.weappinfo.showFlagshipFlag"), 0);
        this.f237909r = map.get(".msg.appmsg.weappinfo.todoactivityid");
        this.f237892I = Util.getInt(map.get(".msg.appmsg.roomtoolsflag"), 0) == 1;
        if (Util.getInt(map.get(".msg.appmsg.weappinfo.isprivatemessage"), 0) == 1) {
            z = true;
        }
        this.f237912u = z;
        this.f237913v = map.get(".msg.appmsg.weappinfo.weapppagethumbrawurl");
    }

    /* renamed from: e */
    public void mo93544e(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        if (bVar != null && bVar.f195582i == 48) {
            String str2 = bVar.f195577g2;
            if (dVar == null || Util.isNullOrNil(str2) || Util.isNullOrNil(dVar.field_fileUrl) || Util.isNullOrNil(dVar.field_thumbUrl)) {
                Log.m105918d("MicroMsg.AppContentAppBrandPiece", "hy: no cdn result or info missing. ignore");
                return;
            }
            try {
                String str3 = HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.flk) + "/cgi-bin/h5/static/minigame/video/index.html?url=%s&cover=%s&appid=%s&extWording=%s&btnWording=%s&shareTitle=%s";
                Object[] objArr = new Object[6];
                objArr[0] = C117627q.m165909b(dVar.field_fileUrl, "utf-8");
                objArr[1] = C117627q.m165909b(dVar.field_thumbUrl, "utf-8");
                objArr[2] = C117627q.m165909b(str2, "utf-8");
                String str4 = "";
                objArr[3] = !Util.isNullOrNil(bVar.f195574g) ? C117627q.m165909b(bVar.f195574g, "utf-8") : str4;
                objArr[4] = !Util.isNullOrNil(this.f237889F) ? C117627q.m165909b(this.f237889F, "utf-8") : str4;
                if (!Util.isNullOrNil(bVar.f195570f)) {
                    str4 = C117627q.m165909b(bVar.f195570f, "utf-8");
                }
                objArr[5] = str4;
                String format = String.format(str3, objArr);
                Log.m105925i("MicroMsg.AppContentAppBrandPiece", "hy: formatted url is %s", format);
                bVar.f195586j = format;
                String str5 = dVar.field_thumbUrl;
                bVar.f195646y = str5;
                bVar.f195503K = str5;
            } catch (UnsupportedEncodingException e) {
                Log.printErrStackTrace("MicroMsg.AppContentAppBrandPiece", e, "hy: not support utf-8!", new Object[0]);
            }
        }
    }
}
