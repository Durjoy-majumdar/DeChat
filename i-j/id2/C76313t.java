package id2;

import android.text.TextUtils;
import com.tencent.p014mm.autogen.events.WalletOfflineRealNameNotifyEvent;
import com.tencent.p014mm.plugin.offline.C30326g;
import com.tencent.p014mm.plugin.offline.C69963m;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import f40.C86709a0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kd2.C76559f;
import p281yz.C79173v;
import t14.C77820c;

/* renamed from: id2.t */
public class C76313t {

    /* renamed from: a */
    public List<WeakReference<C76314b>> f223552a = new ArrayList();

    /* renamed from: b */
    public C76315c f223553b = null;

    /* renamed from: c */
    public ArrayList<Long> f223554c = new ArrayList<>();

    /* renamed from: d */
    public HashSet<String> f223555d = new HashSet<>();

    /* renamed from: id2.t$a */
    public class C33291a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f90287d;

        public C33291a(C76313t tVar, boolean z) {
            this.f90287d = z;
        }

        public void run() {
            Log.m105926v("MicroMsg.WalletOfflineMsgManager", "DO NetSceneOfflineAckMsg");
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(new C33286d(this.f90287d));
        }
    }

    /* renamed from: id2.t$b */
    public interface C76314b {
        boolean onNotify(C76317e eVar);
    }

    /* renamed from: id2.t$c */
    public class C76315c extends C76317e {

        /* renamed from: d */
        public String f223556d;

        /* renamed from: e */
        public String f223557e;

        public C76315c(C76313t tVar) {
            super(tVar);
        }
    }

    /* renamed from: id2.t$d */
    public class C76316d extends C76317e {

        /* renamed from: d */
        public String f223558d;

        public C76316d(C76313t tVar, Map<String, String> map) {
            super(tVar);
            this.f223558d = map.get(".sysmsg.paymsg.PayMsgInfo");
        }
    }

    /* renamed from: id2.t$e */
    public class C76317e {

        /* renamed from: a */
        public int f223559a;

        /* renamed from: b */
        public String f223560b;

        /* renamed from: c */
        public String f223561c;

        public C76317e(C76313t tVar) {
        }
    }

    /* renamed from: id2.t$f */
    public class C76318f extends C76317e {

        /* renamed from: d */
        public String f223562d;

        public C76318f(C76313t tVar) {
            super(tVar);
        }
    }

    /* renamed from: id2.t$g */
    public class C76319g extends C76317e {

        /* renamed from: d */
        public String f223563d;

        /* renamed from: e */
        public String f223564e;

        /* renamed from: f */
        public String f223565f;

        /* renamed from: g */
        public String f223566g;

        /* renamed from: h */
        public String f223567h;

        /* renamed from: i */
        public int f223568i;

        /* renamed from: j */
        public String f223569j;

        /* renamed from: k */
        public long f223570k;

        /* renamed from: l */
        public long f223571l;

        public C76319g(C76313t tVar) {
            super(tVar);
        }
    }

    /* renamed from: id2.t$h */
    public class C76320h extends C76317e {

        /* renamed from: d */
        public String f223572d;

        /* renamed from: e */
        public Orders f223573e;

        /* renamed from: f */
        public C76322j f223574f;

        public C76320h(C76313t tVar) {
            super(tVar);
        }
    }

    /* renamed from: id2.t$i */
    public class C76321i extends C76317e {

        /* renamed from: d */
        public String f223575d;

        /* renamed from: e */
        public String f223576e;

        /* renamed from: f */
        public String f223577f;

        /* renamed from: g */
        public int f223578g;

        /* renamed from: h */
        public String f223579h;

        public C76321i(C76313t tVar) {
            super(tVar);
        }
    }

    /* renamed from: id2.t$j */
    public class C76322j {

        /* renamed from: a */
        public String f223580a;

        /* renamed from: b */
        public String f223581b;

        /* renamed from: c */
        public String f223582c;

        /* renamed from: d */
        public String f223583d;

        /* renamed from: e */
        public String f223584e;

        /* renamed from: f */
        public boolean f223585f;

        public C76322j(C76313t tVar, Map<String, String> map) {
            this.f223580a = map.get(".sysmsg.paymsg.guide_flag");
            this.f223581b = map.get(".sysmsg.paymsg.guide_wording");
            this.f223582c = map.get(".sysmsg.paymsg.left_button_wording");
            this.f223583d = map.get(".sysmsg.paymsg.right_button_wording");
            this.f223584e = map.get(".sysmsg.paymsg.upload_credit_url");
            this.f223585f = "1".equals(map.get(".sysmsg.paymsg.guide_block"));
        }
    }

    /* renamed from: id2.t$k */
    public class C76323k extends C76317e {

        /* renamed from: d */
        public C76322j f223586d;

        public C76323k(C76313t tVar, Map<String, String> map) {
            super(tVar);
            this.f223586d = new C76322j(tVar, map);
        }
    }

    public C76313t() {
        Map<String, String> parseXml;
        int i;
        String zx02 = C69963m.wx0().zx0(196631);
        if (!TextUtils.isEmpty(zx02) && (parseXml = XmlParser.parseXml(zx02, "sysmsg", (String) null)) != null && (i = Util.getInt(parseXml.get(".sysmsg.paymsg.PayMsgType"), -1)) >= 0 && i == 4) {
            Log.m105924i("MicroMsg.WalletOfflineMsgManager", "msg type is 4 ");
            mo106547b(mo106548c(parseXml));
        }
        this.f223554c.clear();
    }

    /* renamed from: a */
    public void mo106546a(String str, boolean z) {
        int i = Util.getInt(XmlParser.parseXml(str, "sysmsg", (String) null).get(".sysmsg.paymsg.PayMsgType"), -1);
        HashSet hashSet = new HashSet();
        int i2 = C30326g.f81861c;
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(20);
        hashSet.add(23);
        hashSet.add(24);
        if (hashSet.contains(Integer.valueOf(i))) {
            C86709a0.m107525e().postToWorker(new C33291a(this, z));
        }
    }

    /* renamed from: b */
    public void mo106547b(C76317e eVar) {
        C76314b bVar;
        if (this.f223552a != null) {
            int i = 0;
            while (i < this.f223552a.size()) {
                WeakReference weakReference = this.f223552a.get(i);
                if (weakReference == null || (bVar = (C76314b) weakReference.get()) == null || !bVar.onNotify(eVar)) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public final C76315c mo106548c(Map<String, String> map) {
        if (this.f223553b == null) {
            this.f223553b = new C76315c(this);
        }
        this.f223553b.f223559a = Util.getInt(map.get(".sysmsg.paymsg.PayMsgType"), -1);
        this.f223553b.f223556d = map.get(".sysmsg.paymsg.isfreeze");
        C76315c cVar = this.f223553b;
        String str = map.get(".sysmsg.paymsg.freezetype");
        cVar.getClass();
        this.f223553b.f223557e = map.get(".sysmsg.paymsg.freezemsg");
        return this.f223553b;
    }

    /* renamed from: d */
    public final C76318f mo106549d(Map<String, String> map) {
        C76318f fVar = new C76318f(this);
        fVar.f223559a = Util.getInt(map.get(".sysmsg.paymsg.PayMsgType"), -1);
        fVar.f223562d = map.get(".sysmsg.paymsg.req_key");
        return fVar;
    }

    /* renamed from: e */
    public final C76319g mo106550e(Map<String, String> map) {
        C76319g gVar = new C76319g(this);
        gVar.f223559a = Util.getInt(map.get(".sysmsg.paymsg.PayMsgType"), -1);
        gVar.f223563d = map.get(".sysmsg.paymsg.cftretcode");
        gVar.f223564e = map.get(".sysmsg.paymsg.cftretmsg");
        gVar.f223565f = map.get(".sysmsg.paymsg.wxretcode");
        gVar.f223566g = map.get(".sysmsg.paymsg.wxretmsg");
        gVar.f223567h = map.get(".sysmsg.paymsg.error_detail_url");
        gVar.f223568i = Util.getInt(map.get(".sysmsg.paymsg.pay_cmd"), -1);
        gVar.f223569j = map.get(".sysmsg.paymsg.error_icon_url");
        gVar.f223570k = Util.getLong(map.get(".sysmsg.paymsg.error_icon_lightmode_color"), 0);
        gVar.f223571l = Util.getLong(map.get(".sysmsg.paymsg.error_icon_darkmode_color"), 0);
        return gVar;
    }

    /* renamed from: f */
    public final C76320h mo106551f(Map<String, String> map) {
        Map<String, String> map2;
        C76320h hVar;
        Orders orders;
        Orders.Commodity commodity;
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Orders.Commodity commodity2;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        Map<String, String> map3 = map;
        C76320h hVar2 = new C76320h(this);
        hVar2.f223559a = Util.getInt(map3.get(".sysmsg.paymsg.PayMsgType"), -1);
        hVar2.f223572d = map3.get(".sysmsg.paymsg.transid");
        Orders orders2 = new Orders();
        Orders.Commodity commodity3 = new Orders.Commodity();
        commodity3.f209595d = map3.get(".sysmsg.paymsg.user_roll.buy_uin");
        commodity3.f209596e = map3.get(".sysmsg.paymsg.user_roll.buy_name");
        commodity3.f209597f = map3.get(".sysmsg.paymsg.user_roll.sale_uin");
        commodity3.f209598g = map3.get(".sysmsg.paymsg.user_roll.sale_name");
        commodity3.f209606r = map3.get(".sysmsg.paymsg.user_roll.trans_id");
        commodity3.f209599h = map3.get(".sysmsg.paymsg.user_roll.goods_name");
        commodity3.f209601j = ((double) Util.getInt(map3.get(".sysmsg.paymsg.user_roll.pay_num"), -1)) / 100.0d;
        commodity3.f209603o = map3.get(".sysmsg.paymsg.user_roll.trade_state");
        String str23 = ".sysmsg.paymsg.user_roll.trade_state_name";
        commodity3.f209604p = map3.get(str23);
        commodity3.f209607s = map3.get(".sysmsg.paymsg.user_roll.buy_bank_name");
        commodity3.f209613y = map3.get(".sysmsg.paymsg.user_roll.discount");
        commodity3.f209605q = Util.getInt(map3.get(".sysmsg.paymsg.user_roll.modify_timestamp"), 0);
        commodity3.f209608t = map3.get(".sysmsg.paymsg.user_roll.fee_type");
        commodity3.f209609u = map3.get(".sysmsg.paymsg.user_roll.appusername");
        commodity3.f209611w = map3.get(".sysmsg.paymsg.user_roll.app_telephone");
        commodity3.f209602n = ((double) Util.getInt(map3.get(".sysmsg.paymsg.user_roll.buy_bank_name"), -1)) / 100.0d;
        Orders.Promotions promotions = new Orders.Promotions();
        promotions.f209666f = map3.get(".sysmsg.paymsg.user_roll.subscribe_biz_info.nickname");
        String str24 = map3.get(".sysmsg.paymsg.user_roll.subscribe_biz_info.username");
        promotions.f209669i = str24;
        promotions.f209664d = 0;
        commodity3.f209610v = str24;
        promotions.f209665e = map3.get(".sysmsg.paymsg.user_roll.subscribe_biz_info.logo_round_url");
        promotions.f209668h = map3.get(".sysmsg.paymsg.user_roll.subscribe_biz_info.subscribe_biz_url");
        int i2 = Util.getInt(map3.get(".sysmsg.paymsg.user_roll.subscribe_biz_info.recommend_level"), 1);
        commodity3.f209614z = i2;
        commodity3.f209586B = map3.get(".sysmsg.paymsg.user_roll.rateinfo");
        String str25 = map3.get(".sysmsg.paymsg.user_roll.discount_rateinfo");
        commodity3.f209587C = map3.get(".sysmsg.paymsg.user_roll.original_feeinfo");
        if (!Util.isNullOrNil(promotions.f209666f)) {
            commodity3.f209593I = true;
            ((ArrayList) commodity3.f209592H).add(promotions);
        }
        int i3 = 0;
        while (true) {
            if (i3 >= 255) {
                map2 = map3;
                hVar = hVar2;
                orders = orders2;
                commodity = commodity3;
                str = str23;
                i = i2;
                break;
            }
            Orders.Promotions promotions2 = new Orders.Promotions();
            if (i3 == 0) {
                String str26 = map3.get(".sysmsg.paymsg.user_roll.activity_info.record.wording");
                String str27 = map3.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_type");
                String str28 = map3.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_id");
                String str29 = map3.get(".sysmsg.paymsg.user_roll.activity_info.record.send_record_id");
                String str30 = map3.get(".sysmsg.paymsg.user_roll.activity_info.record.award_id");
                String str31 = map3.get(".sysmsg.paymsg.user_roll.activity_info.record.user_record_id");
                String str32 = map3.get(".sysmsg.paymsg.user_roll.activity_info.record.small_title");
                String str33 = map3.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_tinyapp_username");
                String str34 = map3.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_tinyapp_path");
                String str35 = map3.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_mch_id");
                String str36 = map3.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_tinyapp_version");
                String str37 = map3.get(".sysmsg.paymsg.user_roll.activity_info.record.get_award_params");
                str21 = map3.get(".sysmsg.paymsg.user_roll.activity_info.record.icon");
                str22 = str31;
                str15 = str33;
                str7 = str36;
                str9 = map3.get(".sysmsg.paymsg.user_roll.activity_info.record.query_award_status_params");
                str18 = str26;
                hVar = hVar2;
                str20 = str32;
                str8 = str37;
                String str38 = str29;
                orders = orders2;
                str19 = map3.get(".sysmsg.paymsg.user_roll.activity_info.record.title");
                str12 = str28;
                str = str23;
                str16 = map3.get(".sysmsg.paymsg.user_roll.activity_info.record.url");
                str11 = str38;
                String str39 = str30;
                commodity2 = commodity3;
                str17 = map3.get(".sysmsg.paymsg.user_roll.activity_info.record.type");
                str13 = str27;
                i = i2;
                str14 = map3.get(".sysmsg.paymsg.user_roll.activity_info.record.btn_text");
                str10 = str39;
                String str40 = str35;
                str5 = str34;
                str6 = str40;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(".sysmsg.paymsg.user_roll.activity_info.record");
                sb.append(i3);
                String str41 = map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i3 + ".icon");
                sb.append(".type");
                StringBuilder sb4 = new StringBuilder();
                sb4.append(".sysmsg.paymsg.user_roll.activity_info.record");
                sb4.append(i3);
                String str42 = map3.get(sb.toString());
                sb4.append(".title");
                StringBuilder sb5 = new StringBuilder();
                sb5.append(".sysmsg.paymsg.user_roll.activity_info.record");
                sb5.append(i3);
                String str43 = map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i3 + ".wording");
                sb5.append(".activity_type");
                StringBuilder sb6 = new StringBuilder();
                sb6.append(".sysmsg.paymsg.user_roll.activity_info.record");
                sb6.append(i3);
                String str44 = map3.get(sb5.toString());
                sb6.append(".activity_id");
                StringBuilder sb7 = new StringBuilder();
                sb7.append(".sysmsg.paymsg.user_roll.activity_info.record");
                sb7.append(i3);
                String str45 = map3.get(sb6.toString());
                sb7.append(".send_record_id");
                StringBuilder sb8 = new StringBuilder();
                sb8.append(".sysmsg.paymsg.user_roll.activity_info.record");
                sb8.append(i3);
                String str46 = map3.get(sb7.toString());
                sb8.append(".award_id");
                StringBuilder sb9 = new StringBuilder();
                sb9.append(".sysmsg.paymsg.user_roll.activity_info.record");
                sb9.append(i3);
                String str47 = map3.get(sb8.toString());
                sb9.append(".user_record_id");
                StringBuilder sb10 = new StringBuilder();
                sb10.append(".sysmsg.paymsg.user_roll.activity_info.record");
                sb10.append(i3);
                String str48 = map3.get(sb9.toString());
                sb10.append(".small_title");
                StringBuilder sb11 = new StringBuilder();
                sb11.append(".sysmsg.paymsg.user_roll.activity_info.record");
                sb11.append(i3);
                String str49 = map3.get(sb10.toString());
                sb11.append(".activity_tinyapp_username");
                StringBuilder sb12 = new StringBuilder();
                sb12.append(".sysmsg.paymsg.user_roll.activity_info.record");
                sb12.append(i3);
                String str50 = map3.get(sb11.toString());
                sb12.append(".activity_tinyapp_path");
                StringBuilder sb13 = new StringBuilder();
                sb13.append(".sysmsg.paymsg.user_roll.activity_info.record");
                sb13.append(i3);
                String str51 = map3.get(sb12.toString());
                sb13.append(".activity_mch_id");
                StringBuilder sb14 = new StringBuilder();
                sb14.append(".sysmsg.paymsg.user_roll.activity_info.record");
                sb14.append(i3);
                String str52 = map3.get(sb13.toString());
                sb14.append(".activity_tinyapp_version");
                StringBuilder sb15 = new StringBuilder();
                sb15.append(".sysmsg.paymsg.user_roll.activity_info.record");
                sb15.append(i3);
                String str53 = map3.get(sb14.toString());
                sb15.append(".get_award_params");
                StringBuilder sb16 = new StringBuilder();
                sb16.append(".sysmsg.paymsg.user_roll.activity_info.record");
                sb16.append(i3);
                sb16.append(".query_award_status_params");
                str21 = str41;
                str13 = str44;
                str22 = str48;
                str7 = str53;
                hVar = hVar2;
                orders = orders2;
                str19 = map3.get(sb4.toString());
                str12 = str45;
                str20 = str49;
                str6 = str52;
                commodity2 = commodity3;
                str17 = str42;
                i = i2;
                str14 = map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i3 + ".btn_text");
                str10 = str47;
                str8 = map3.get(sb15.toString());
                str18 = str43;
                str = str23;
                str16 = map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i3 + ".url");
                str11 = str46;
                str9 = map3.get(sb16.toString());
                str15 = str50;
                str5 = str51;
            }
            if (Util.isNullOrNil(str18)) {
                Log.m105925i("MicroMsg.WalletOfflineUtil", "hy: activity end. total size: %d", Integer.valueOf(i3 + 1));
                map2 = map;
                commodity = commodity2;
                break;
            }
            promotions2.f209665e = str21;
            promotions2.f209666f = str18;
            promotions2.f209668h = str16;
            promotions2.f209667g = str14;
            promotions2.f209664d = 1;
            promotions2.f209671n = Util.getInt(str17, 0);
            promotions2.f209670j = str19;
            promotions2.f209673p = Util.getInt(str13, 0);
            promotions2.f209672o = Util.getLong(str12, 0);
            promotions2.f209675r = Util.getInt(str11, 0);
            promotions2.f209674q = Util.getInt(str10, 0);
            promotions2.f209676s = Util.getInt(str22, 0);
            promotions2.f209677t = str20;
            promotions2.f209678u = str15;
            promotions2.f209679v = str5;
            promotions2.f209680w = Util.getLong(str6, 0);
            promotions2.f209681x = Util.getInt(str7, 0);
            promotions2.f209682y = str8;
            promotions2.f209683z = str9;
            Map<String, String> map4 = map;
            C77820c q = C76559f.m92121q(map4, i3);
            if (q != null) {
                promotions2.f209663A = q;
            }
            Orders.Commodity commodity4 = commodity2;
            ((ArrayList) commodity4.f209592H).add(promotions2);
            i3++;
            commodity3 = commodity4;
            hVar2 = hVar;
            i2 = i;
            str23 = str;
            orders2 = orders;
            map3 = map4;
        }
        Orders.C72191b bVar = commodity.f209594J;
        bVar.f209710a = map2.get(".sysmsg.paymsg.user_roll.link_ativity_info.text");
        bVar.f209711b = map2.get(".sysmsg.paymsg.user_roll.link_ativity_info.url");
        String str54 = map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_name");
        String str55 = map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_logo");
        String str56 = map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_desc");
        String str57 = map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_username");
        String str58 = map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_path");
        if (!Util.isNullOrNil(str54) && !Util.isNullOrNil(str55) && !Util.isNullOrNil(str56) && !Util.isNullOrNil(str57)) {
            Orders.RecommendTinyAppInfo recommendTinyAppInfo = new Orders.RecommendTinyAppInfo();
            commodity.f209588D = recommendTinyAppInfo;
            recommendTinyAppInfo.f209684d = str54;
            recommendTinyAppInfo.f209685e = str55;
            recommendTinyAppInfo.f209686f = str56;
            recommendTinyAppInfo.f209687g = str57;
            recommendTinyAppInfo.f209688h = str58;
            recommendTinyAppInfo.f209689i = map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.activity_tinyapp_btn_text");
            commodity.f209588D.f209690j = Util.getLong(map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.activity_id"), 0);
            Orders.RecommendTinyAppInfo recommendTinyAppInfo2 = commodity.f209588D;
            Util.getLong(map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.activity_type"), 0);
            recommendTinyAppInfo2.getClass();
            commodity.f209588D.f209692o = Util.getInt(map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.send_record_id"), 0);
            commodity.f209588D.f209693p = Util.getInt(map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.user_record_id"), 0);
            commodity.f209588D.f209694q = (long) Util.getInt(map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.activity_mch_id"), 0);
            commodity.f209588D.f209691n = (long) Util.getInt(map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.award_id"), 0);
            commodity.f209588D.f209695r = Util.getInt(map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_version"), 0);
        }
        commodity.f209589E = new Orders.FinderInfo();
        int i4 = Util.getInt(map2.get(".sysmsg.paymsg.user_roll.finder_info_view.route_info.type"), 0);
        String str59 = map2.get(".sysmsg.paymsg.user_roll.finder_info_view.route_info.url");
        String str60 = map2.get(".sysmsg.paymsg.user_roll.finder_info_view.route_info.tiny_app_uri.username");
        String str61 = map2.get(".sysmsg.paymsg.user_roll.finder_info_view.route_info.tiny_app_uri.path");
        String str62 = map2.get(".sysmsg.paymsg.user_roll.finder_info_view.route_info.tiny_app_uri.version");
        String str63 = map2.get(".sysmsg.paymsg.user_roll.finder_info_view.logo.url");
        String str64 = map2.get(".sysmsg.paymsg.user_roll.finder_info_view.title");
        String str65 = map2.get(".sysmsg.paymsg.user_roll.finder_info_view.desc");
        int i5 = Util.getInt(map2.get(".sysmsg.paymsg.user_roll.finder_info_view.route_info.finder_uri.type"), -1);
        String str66 = map2.get(".sysmsg.paymsg.user_roll.finder_info_view.route_info.finder_uri.username");
        String str67 = map2.get(".sysmsg.paymsg.user_roll.finder_info_view.sub_logo.dark_mode_url");
        String str68 = map2.get(".sysmsg.paymsg.user_roll.finder_info_view.route_info.finder_uri.feedid");
        String str69 = map2.get(".sysmsg.paymsg.user_roll.finder_info_view.sub_logo.url");
        String str70 = map2.get(".sysmsg.paymsg.user_roll.finder_info_view.route_info.finder_uri.nonceid");
        String str71 = map2.get(".sysmsg.paymsg.user_roll.finder_info_view.logo.dark_mode_url");
        Log.m105925i("MicroMsg.WalletOfflineUtil", "finder jump type：%s", Integer.valueOf(i4));
        Log.m105925i("MicroMsg.WalletOfflineUtil", "finder h5 url：%s", str59);
        Log.m105925i("MicroMsg.WalletOfflineUtil", "finder tinyapp username：%s ，path：%s，version：%s", str60, str61, str62);
        Log.m105925i("MicroMsg.WalletOfflineUtil", "finder finder_logo_normal：%s，finder_title：%s，finder_desc:%s，finder_uri_type：%s，finder_uri_username：%s，finder_uri_feedid：%s,finder_uri_nonceid：%s", str63, str64, str65, Integer.valueOf(i5), str66, str68, str70);
        Orders.FinderInfo finderInfo = commodity.f209589E;
        finderInfo.f209634d = i4;
        finderInfo.f209635e = str59;
        finderInfo.f209636f = str60;
        finderInfo.f209637g = str61;
        finderInfo.f209638h = str62;
        finderInfo.f209639i = str63;
        finderInfo.f209640j = str71;
        finderInfo.f209641n = str69;
        finderInfo.f209642o = str67;
        finderInfo.f209643p = str64;
        finderInfo.f209644q = str65;
        finderInfo.f209645r = i5;
        finderInfo.f209646s = str66;
        finderInfo.f209647t = str68;
        finderInfo.f209648u = str70;
        Orders.LeadTailViewInfo leadTailViewInfo = new Orders.LeadTailViewInfo();
        commodity.f209590F = leadTailViewInfo;
        Map<String, String> map5 = map;
        leadTailViewInfo.f209649d = map5.get(".sysmsg.paymsg.user_roll.lead_tail_view.desc");
        commodity.f209590F.f209650e = map5.get(".sysmsg.paymsg.user_roll.lead_tail_view.settled_logo.url");
        commodity.f209590F.f209651f = map5.get(".sysmsg.paymsg.user_roll.lead_tail_view.settled_logo.dark_mode_url");
        commodity.f209590F.f209652g = map5.get(".sysmsg.paymsg.user_roll.lead_tail_view.unsettled_logo.url");
        commodity.f209590F.f209653h = map5.get(".sysmsg.paymsg.user_roll.lead_tail_view.unsettled_logo.dark_mode_url");
        commodity.f209590F.f209654i = Util.getInt(map5.get(".sysmsg.paymsg.user_roll.lead_tail_view.jump_info.type"), 0);
        commodity.f209590F.f209655j = Util.getInt(map5.get(".sysmsg.paymsg.user_roll.lead_tail_view.jump_info.route_info.type"), 0);
        commodity.f209590F.f209656n = map5.get(".sysmsg.paymsg.user_roll.lead_tail_view.jump_info.route_info.url");
        commodity.f209590F.f209657o = map5.get(".sysmsg.paymsg.user_roll.lead_tail_view.jump_info.route_info.tiny_app_uri.username");
        commodity.f209590F.f209658p = map5.get(".sysmsg.paymsg.user_roll.lead_tail_view.jump_info.route_info.tiny_app_uri.path");
        commodity.f209590F.f209659q = map5.get(".sysmsg.paymsg.user_roll.lead_tail_view.jump_info.route_info.tiny_app_uri.version");
        commodity.f209590F.f209660r = map5.get(".sysmsg.paymsg.user_roll.lead_tail_view.jump_info.cmd_data.busi_param");
        commodity.f209590F.f209661s = map5.get(".sysmsg.paymsg.user_roll.lead_tail_view.jump_info.cmd_data.trans_id");
        commodity.f209590F.f209662t = map5.get(".sysmsg.paymsg.user_roll.lead_tail_view.jump_info.cmd_data.mmpay_mkt_sign");
        ArrayList arrayList = new ArrayList();
        Orders orders3 = orders;
        orders3.f209542M = arrayList;
        arrayList.add(commodity);
        orders3.f209555V = Util.getInt(map5.get(".sysmsg.paymsg.user_roll.is_use_new_paid_succ_page"), 0);
        orders3.f209557W = map5.get(".sysmsg.paymsg.user_roll.pay_succ_btn_wording");
        orders3.f209532C = map5.get(str);
        orders3.f209530A = i;
        orders3.f209563e = map5.get(".sysmsg.req_key");
        orders3.f209559X = Util.getInt(map5.get(".sysmsg.paymsg.user_roll.is_use_show_info"), 0);
        orders3.f209561Z = new ArrayList<>();
        for (int i6 = 0; i6 < 255; i6++) {
            if (i6 == 0) {
                str4 = ".sysmsg.paymsg.user_roll.show_info.record.";
            } else {
                str4 = ".sysmsg.paymsg.user_roll.show_info.record" + i6 + ".";
            }
            Orders.ShowInfo showInfo = new Orders.ShowInfo();
            showInfo.f209698d = map5.get(str4 + "name");
            showInfo.f209699e = map5.get(str4 + "value");
            showInfo.f209700f = map5.get(str4 + "name_color");
            showInfo.f209701g = map5.get(str4 + "value_color");
            String str72 = str4 + "value_attr.";
            showInfo.f209702h = Util.getInt(map5.get(str72 + "link_type"), 0);
            showInfo.f209703i = map5.get(str72 + "link_weapp");
            showInfo.f209704j = map5.get(str72 + "link_addr");
            showInfo.f209705n = map5.get(str72 + "link_url");
            showInfo.f209706o = Util.getInt(map5.get(str72 + "text_attr"), 0);
            if (!Util.isNullOrNil(showInfo.f209698d) || !Util.isNullOrNil(showInfo.f209699e)) {
                orders3.f209561Z.add(showInfo);
            }
        }
        commodity.f209602n = Util.getDouble(map5.get(".sysmsg.paymsg.user_roll.original_total_fee"), -1.0d) / 100.0d;
        if (!TextUtils.isEmpty(map5.get(".sysmsg.paymsg.user_roll.discount_array.record.favor_desc"))) {
            int i7 = 0;
            while (true) {
                String str73 = "";
                if (i7 != 0) {
                    str73 = str73 + i7;
                }
                str2 = ".sysmsg.paymsg.user_roll.discount_array.record" + str73 + ".favor_desc";
                str3 = ".sysmsg.paymsg.user_roll.discount_array.record" + str73 + ".payment_amount";
                if (TextUtils.isEmpty(map5.get(str2)) || TextUtils.isEmpty(map5.get(str3))) {
                    Log.m105920e("MicroMsg.WalletOfflineUtil", "favor_desc_key is " + str2 + ", payment_amount_key is " + str3 + ", break");
                } else {
                    Orders.DiscountInfo discountInfo = new Orders.DiscountInfo();
                    discountInfo.f209633e = map5.get(str2);
                    discountInfo.f209632d = Util.getDouble(map5.get(str3), 0.0d);
                    ((ArrayList) commodity.f209585A).add(discountInfo);
                    i7++;
                }
            }
            Log.m105920e("MicroMsg.WalletOfflineUtil", "favor_desc_key is " + str2 + ", payment_amount_key is " + str3 + ", break");
        } else {
            Log.m105920e("MicroMsg.WalletOfflineUtil", ".sysmsg.paymsg.user_roll.discount_array.record.favor_desc value is empty");
        }
        C76320h hVar3 = hVar;
        hVar3.f223573e = orders3;
        if (((ArrayList) orders3.f209542M).size() > 0) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.BUSINESS_OFFLINE_GETMSG_TRANS_ID_STRING, ((Orders.Commodity) ((ArrayList) hVar3.f223573e.f209542M).get(0)).f209606r);
        }
        if (map5.containsKey(".sysmsg.paymsg.real_name_info")) {
            hVar3.f223574f = new C76322j(this, map5);
        }
        return hVar3;
    }

    /* renamed from: g */
    public final C76321i mo106552g(Map<String, String> map) {
        C76321i iVar = new C76321i(this);
        iVar.f223559a = Util.getInt(map.get(".sysmsg.paymsg.PayMsgType"), -1);
        iVar.f223575d = map.get(".sysmsg.paymsg.good_name");
        iVar.f223576e = map.get(".sysmsg.paymsg.total_fee");
        iVar.f223579h = map.get(".sysmsg.paymsg.req_key");
        iVar.f223577f = map.get(".sysmsg.paymsg.id");
        String str = map.get(".sysmsg.paymsg.confirm_type");
        Log.m105924i("MicroMsg.WalletOfflineMsgManager", "msg confirm_type is" + iVar.f223578g);
        if (TextUtils.isEmpty(str) || !str.equals("1")) {
            iVar.f223578g = 0;
        } else {
            iVar.f223578g = 1;
        }
        return iVar;
    }

    /* renamed from: h */
    public final void mo106553h(String str) {
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.BUSINESS_OFFLINE_GETMSG_ACK_KEY_STRING;
        i.mo119677K(aVar, "");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.BUSINESS_OFFLINE_GETMSG_TRANS_ID_STRING, "");
        C85801v1 i2 = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar2 = C72994y1.C72995a.BUSINESS_OFFLINE_GETMSG_REQ_KEY_STRING;
        i2.mo119677K(aVar2, "");
        Map<String, String> parseXml = XmlParser.parseXml(str, "sysmsg", (String) null);
        if (parseXml != null) {
            int i3 = Util.getInt(parseXml.get(".sysmsg.paymsg.PayMsgType"), -1);
            int i4 = Util.getInt(parseXml.get(".sysmsg.paymsg.pay_cmd"), -1);
            String str2 = parseXml.get(".sysmsg.paymsg.req_key");
            C86709a0.m107535s().mo121142i().mo119677K(aVar, parseXml.get(".sysmsg.paymsg.ack_key"));
            if (i3 < 0) {
                i3 = 0;
            }
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.BUSINESS_OFFLINE_GETMSG_PAYMSG_TYPE_INT, Integer.valueOf(i3));
            C86709a0.m107535s().mo121142i().mo119677K(aVar2, str2);
            int i5 = Util.getInt(parseXml.get(".sysmsg.paymsg.PayMsgType"), -1);
            Log.m105924i("MicroMsg.WalletOfflineMsgManager", "msg type is " + i5);
            Log.m105927v("MicroMsg.WalletOfflineMsgManager", "msg type is type %d xml %s", Integer.valueOf(i5), str);
            if (i5 >= 0 && i5 == 4) {
                mo106547b(mo106548c(parseXml));
                C69963m.wx0().Cx0(196631, str);
            } else if (i5 >= 0 && i5 == 5) {
                if (i4 == 1) {
                    Log.m105924i("MicroMsg.WalletOfflineMsgManager", "payCmd is PAY_CMD_OFFLINE_PAY_REFRESH_TOKEN (value is 1), refresh offline token");
                    C69963m.wx0().Bx0().mo96266a(4, 4);
                }
                mo106547b(mo106550e(parseXml));
            } else if (i5 >= 0 && i5 == 6) {
                String str3 = parseXml.get(".sysmsg.paymsg.transid");
                Log.m105924i("helios", "MSG_TYPE_ORDER trasid=" + str3);
                if (!Util.isNullOrNil(str3)) {
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_ADDRESS_HAS_SHOW_WALLETOFFLINE2_DIALOG_BOOLEAN_SYNC, Boolean.TRUE);
                }
                Log.m105925i("MicroMsg.WalletOfflineMsgManager", "orders xml: %s", str);
                mo106547b(mo106551f(parseXml));
            } else if (i5 >= 0 && i5 == 7) {
                ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91312B();
            } else if (i5 >= 0 && i5 == 8) {
                mo106547b(mo106552g(parseXml));
            } else if (i5 >= 0 && i5 == 10) {
                C69963m.wx0().Bx0().mo96266a(4, 4);
            } else if (i5 >= 0 && i5 == 20) {
                WalletOfflineRealNameNotifyEvent walletOfflineRealNameNotifyEvent = new WalletOfflineRealNameNotifyEvent();
                walletOfflineRealNameNotifyEvent.f194081d.f194082a = new C76322j(this, parseXml);
                walletOfflineRealNameNotifyEvent.publish();
            } else if (i5 >= 0 && i5 == 23) {
                C76318f d = mo106549d(parseXml);
                synchronized (this.f223555d) {
                    if (this.f223555d.contains(d.f223562d)) {
                        Log.m105925i("MicroMsg.WalletOfflineMsgManager", "pass this msg %s", d.f223562d);
                        return;
                    }
                    this.f223555d.add(d.f223562d);
                    mo106547b(d);
                }
            } else if (i5 >= 0 && i5 == 24) {
                mo106547b(mo106554i(parseXml));
            }
        }
    }

    /* renamed from: i */
    public final C76318f mo106554i(Map<String, String> map) {
        C76318f fVar = new C76318f(this);
        fVar.f223559a = Util.getInt(map.get(".sysmsg.paymsg.PayMsgType"), -1);
        fVar.f223562d = map.get(".sysmsg.paymsg.req_key");
        return fVar;
    }

    /* renamed from: j */
    public void mo106555j(C76314b bVar) {
        if (this.f223552a == null) {
            this.f223552a = new ArrayList();
        }
        if (bVar != null) {
            this.f223552a.add(new WeakReference(bVar));
        }
    }

    /* renamed from: k */
    public void mo106556k(C76314b bVar) {
        C76314b bVar2;
        if (this.f223552a != null && bVar != null) {
            int i = 0;
            while (i < this.f223552a.size()) {
                WeakReference weakReference = this.f223552a.get(i);
                if (weakReference == null || (bVar2 = (C76314b) weakReference.get()) == null || !bVar2.equals(bVar)) {
                    i++;
                } else {
                    this.f223552a.remove(weakReference);
                    return;
                }
            }
        }
    }
}
