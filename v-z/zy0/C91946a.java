package zy0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C24560g0;
import gy3.C24570s;
import gy3.C87412m;
import ny3.C89104m;
import p225rc.C89918i;
import te3.C90429p4;
import te3.gp4;

/* renamed from: zy0.a */
public final class C91946a {

    /* renamed from: a */
    public static final C91946a f263217a = new C91946a();

    /* renamed from: b */
    public static final /* synthetic */ C89104m<Object>[] f263218b;

    /* renamed from: c */
    public static final C89918i f263219c;

    /* renamed from: d */
    public static final C89918i f263220d;

    /* renamed from: e */
    public static final C89918i f263221e;

    /* renamed from: f */
    public static gp4 f263222f;

    static {
        Class<C91946a> cls = C91946a.class;
        f263218b = new C89104m[]{C24560g0.m30726b(new C24570s(cls, "halfScreenAuthPrivacySubDesc", "getHalfScreenAuthPrivacySubDesc()Ljava/lang/String;", 0)), C24560g0.m30726b(new C24570s(cls, "halfScreenAuthPrivacyThirdPartyDeclaration", "getHalfScreenAuthPrivacyThirdPartyDeclaration()Lcom/tencent/mm/protocal/protobuf/AlertPrivacyInfo;", 0)), C24560g0.m30726b(new C24570s(cls, "createPlatePrivacyDesc", "getCreatePlatePrivacyDesc()Ljava/lang/String;", 0))};
        String string = MMApplicationContext.getString(C0966R.string.avd);
        C87412m.m108593f(string, "getString(R.string.car_l…e_choose_sub_description)");
        f263219c = new C89918i(string, "MMCarLicensePlateWordings");
        C90429p4 p4Var = new C90429p4();
        if (BuildInfo.DEBUG) {
            p4Var.f259729d = true;
            p4Var.f259730e = "你授权后，小程序开发者将获得你微信绑定的包含昵称、头像、地区及性别等用户信息，为你提供相关服务。小程序开发者严格按照<a href=\"https://mp.weixin.qq.com/wxawap/waprivacyinfo?action=show&appid=wx40f8626ddf43d362#wechat_redirect\">《广州store商城阳光旗舰店--1号店小程序隐私保护指引》</a>收集、使用你的信息，如你发现开发者不当收集、使用你的信息，可进行<a href=\"https://mp.weixin.qq.com/mp/wacomplain?action=show&appid=wx40f8626ddf43d362&from=6#wechat_redirect\">投诉</a>。";
        } else {
            p4Var.f259729d = false;
        }
        f263220d = new C89918i(p4Var, "MMCarLicensePlateWordings");
        String string2 = MMApplicationContext.getString(C0966R.string.ave);
        C87412m.m108593f(string2, "getString(R.string.car_l…eate_privacy_description)");
        f263221e = new C89918i(string2, "MMCarLicensePlateWordings");
    }
}
