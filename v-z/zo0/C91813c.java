package zo0;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.modelappbrand.LaunchParamsOptional;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81236c1;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.p014mm.plugin.appbrand.launching.C29567d1;
import com.tencent.p014mm.plugin.appbrand.launching.C29583l3;
import com.tencent.p014mm.plugin.appbrand.launching.C83311e;
import com.tencent.p014mm.plugin.appbrand.launching.C83496u2;
import com.tencent.p014mm.plugin.appbrand.launching.C83515w2;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.report.C68633w;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import gs0.C87324b;
import java.util.Iterator;
import java.util.List;
import kr0.C76629w0;
import p206nj.C117627q;
import p823sg.C77710q;
import u24.C90599h;
import vq0.C90861d;
import wi0.C90982g0;

/* renamed from: zo0.c */
public abstract class C91813c {

    /* renamed from: zo0.c$a */
    public enum C91814a {
        OK,
        ERR_URL_INVALID,
        ERR_UIN_INVALID,
        ERR_DEV_CODE_EXPIRED
    }

    /* renamed from: a */
    public void mo125656a(String str, int i, AppBrandStatObject appBrandStatObject, Bundle bundle, Bundle bundle2) {
        appBrandStatObject.f245533f = i;
        appBrandStatObject.f245534g = C117627q.m165908a(str);
        if (bundle != null) {
            appBrandStatObject.f245534g += XVFSFile.PATH_SEPARATOR + bundle.getString("stat_send_msg_user");
        }
        appBrandStatObject.f245531d = C68633w.m80874a(i, bundle);
        appBrandStatObject.f245532e = C68633w.m80875b(i, bundle);
        if (bundle2 != null) {
            appBrandStatObject.f245540p = bundle2.getBundle("stat_get_a8_key_cgi_speed");
        }
        if (i == 1037 || i == 1018) {
            appBrandStatObject.f245536i = 0;
        } else {
            appBrandStatObject.f245536i = i;
        }
        appBrandStatObject.f245542r = C83311e.m102262a(i, bundle);
    }

    /* renamed from: b */
    public final C91814a mo125657b(Context context, String str, int i, Bundle bundle, Bundle bundle2) {
        C91814a aVar;
        Uri uri;
        String str2;
        String str3;
        C91814a aVar2;
        Iterator<WxaAttributes.WxaPluginCodeInfo> it;
        String str4 = str;
        Bundle bundle3 = bundle;
        C91814a aVar3 = C91814a.ERR_URL_INVALID;
        Log.m105925i("MicroMsg.AppBrand.AbsLinkOpener", "handle url = %s", str4);
        String str5 = null;
        if (Util.isNullOrNil(str)) {
            aVar = aVar3;
            uri = null;
            Bundle bundle4 = bundle3;
            str2 = str4;
        } else {
            int indexOf = str4.indexOf(35);
            int indexOf2 = str4.indexOf(63);
            if (indexOf > 0 && indexOf2 > 0 && indexOf < indexOf2) {
                str4 = str4.substring(0, indexOf) + str4.substring(indexOf2, str.length());
                Log.m105925i("MicroMsg.AppBrand.AbsLinkOpener", "replace url for parsing %s", str4);
            }
            String str6 = str4;
            Uri parse = Uri.parse(str6);
            Class cls = C29583l3.class;
            C91814a aVar4 = C91814a.OK;
            if (Util.getInt(parse.getQueryParameter("debug"), 0) > 0) {
                int i2 = Util.getInt(parse.getQueryParameter("ret"), 0);
                if (i2 == 1) {
                    aVar2 = C91814a.ERR_UIN_INVALID;
                } else if (i2 == 2) {
                    aVar2 = C91814a.ERR_DEV_CODE_EXPIRED;
                } else {
                    String queryParameter = parse.getQueryParameter("appid");
                    String queryParameter2 = parse.getQueryParameter("username");
                    String nullAsNil = Util.nullAsNil(parse.getQueryParameter("path"));
                    String queryParameter3 = parse.getQueryParameter("codeurl");
                    String queryParameter4 = parse.getQueryParameter("md5");
                    str3 = str6;
                    long j = Util.getLong(parse.getQueryParameter("test_lifespan"), 7200);
                    if (Util.isNullOrNil(queryParameter) || Util.isNullOrNil(queryParameter2) || Util.isNullOrNil(queryParameter3)) {
                        Log.m105925i("MicroMsg.AppBrand.AbsLinkOpener", "appId = %s, username = %s, codeURL = %s, invalid, return", queryParameter, queryParameter2, queryParameter3);
                    } else {
                        if (C90599h.m113509b(queryParameter2, "WeApp_Admin") || C90599h.m113509b(queryParameter2, "WeApp_Admin@app") || C90599h.m113509b(queryParameter, "wx1a919f7634c69370")) {
                            C81236c1 vx02 = C81236c1.vx0();
                            vx02.getClass();
                            vx02.wx0("qrcode", queryParameter3, queryParameter4, Util.nowSecond(), Util.nowSecond() + 7200);
                            Bundle bundle5 = bundle3;
                        } else {
                            C81161g2.requireAccountInitializedOnDemand();
                            if (C81161g2.f238471g.mo113526j(queryParameter, 1, queryParameter3, queryParameter4, 0, Util.nowSecond() + j)) {
                                C90861d.m113946a(queryParameter, 1);
                                AppBrandProcessesManager.m103869I().mo111407t(queryParameter, 1);
                                C87324b bVar = (C87324b) C81161g2.Bx0(C87324b.class);
                                bVar.getClass();
                                bVar.mo121719jo(queryParameter, 1, C87324b.C32518b.C32519a.f86360a);
                            }
                            String queryParameter5 = parse.getQueryParameter("json_extinfo");
                            String queryParameter6 = parse.getQueryParameter("ws_endpoint");
                            LaunchParamsOptional launchParamsOptional = new LaunchParamsOptional();
                            launchParamsOptional.f237920f = queryParameter5;
                            launchParamsOptional.f237923i = queryParameter6;
                            Log.m105925i("MicroMsg.AppBrand.AbsLinkOpener", "wsEndpoint:%s", queryParameter6);
                            ((C29567d1) C81161g2.Bx0(C29567d1.class)).mo56814Lo(queryParameter, 1, queryParameter5);
                            if (!Util.isNullOrNil(queryParameter5)) {
                                WxaAttributes.WxaVersionInfo a = C90982g0.m114149a(queryParameter5);
                                List<WxaAttributes.WxaPluginCodeInfo> list = a.f239458j;
                                List<WxaAttributes.WxaVersionModuleInfo> list2 = a.f239460o;
                                if (list2 != null && list2.size() > 0) {
                                    for (WxaAttributes.WxaVersionModuleInfo next : list2) {
                                        List<WxaAttributes.WxaPluginCodeInfo> list3 = next.f239477i;
                                        if (list3 != null && list3.size() > 0) {
                                            Iterator<WxaAttributes.WxaPluginCodeInfo> it4 = next.f239477i.iterator();
                                            while (it4.hasNext()) {
                                                WxaAttributes.WxaPluginCodeInfo next2 = it4.next();
                                                if (!Util.isNullOrNil(next2.f239444n)) {
                                                    it = it4;
                                                    Log.m105925i("MicroMsg.AppBrand.AbsLinkOpener", "handleLinkImpl: module :%s dev plugin provider:%s,versionDesc:%s,devUin:%d saveRet:%b", next.f239472d, next2.f239437d, next2.f239444n, Integer.valueOf(new C77710q(next2.f239443j).f226490d), Boolean.valueOf(((C29583l3) C81161g2.Bx0(cls)).mo56825qq(next2.f239437d, next2.f239444n, next2.f239443j)));
                                                } else {
                                                    it = it4;
                                                }
                                                Bundle bundle6 = bundle;
                                                it4 = it;
                                            }
                                        }
                                        Bundle bundle7 = bundle;
                                    }
                                } else if (list != null && list.size() > 0) {
                                    for (WxaAttributes.WxaPluginCodeInfo next3 : list) {
                                        if (!Util.isNullOrNil(next3.f239444n)) {
                                            Log.m105925i("MicroMsg.AppBrand.AbsLinkOpener", "handleLinkImpl: dev plugin provider:%s,versionDesc:%s,devUin:%d saveRet:%b", next3.f239437d, next3.f239444n, Integer.valueOf(new C77710q(next3.f239443j).f226490d), Boolean.valueOf(((C29583l3) C81161g2.Bx0(cls)).mo56825qq(next3.f239437d, next3.f239444n, next3.f239443j)));
                                        }
                                    }
                                }
                            }
                            AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
                            mo125656a(str3, i, appBrandStatObject, bundle, bundle2);
                            AppBrandLaunchProxyUI.m102164N7(context, queryParameter2, (String) null, nullAsNil, 1, -1, appBrandStatObject, (AppBrandLaunchReferrer) null, launchParamsOptional);
                            Bundle bundle8 = bundle;
                        }
                        aVar3 = aVar4;
                        aVar = aVar3;
                        uri = parse;
                        str2 = str3;
                    }
                }
                aVar3 = aVar2;
                Bundle bundle9 = bundle3;
                str3 = str6;
                aVar = aVar3;
                uri = parse;
                str2 = str3;
            } else {
                str3 = str6;
                String queryParameter7 = parse.getQueryParameter("username");
                if (Util.isNullOrNil(queryParameter7)) {
                    Log.m105925i("MicroMsg.AppBrand.AbsLinkOpener", "username = %s, invalid, return", queryParameter7);
                } else {
                    Bundle bundle10 = bundle;
                    if (bundle10 != null) {
                        str5 = bundle10.getString("stat_app_id");
                    }
                    String str7 = str5;
                    if (Util.isNullOrNil(str7)) {
                        mo125658d(context, str3, parse, i, bundle, queryParameter7, bundle2);
                    } else {
                        C91812b bVar2 = r0;
                        C91812b bVar3 = new C91812b(this, str7, queryParameter7, context, str3, parse, i, bundle, bundle2);
                        C83515w2 w2Var = new C83515w2();
                        w2Var.field_appId = str7;
                        C81161g2.requireAccountInitializedOnDemand();
                        C83496u2 u2Var = C81161g2.f238475n;
                        if (u2Var == null) {
                            Log.m105928w("MicroMsg.AppBrand.WxaBanJumpHelper", "[banjump] shouldBanJump false, wxapp cache storage is null");
                            C91821m.m115337a(bVar2);
                        } else {
                            if (u2Var.get(w2Var, "appId")) {
                                if (w2Var.mo115810n2("banJumpApp") || w2Var.mo115810n2("banJumpGame")) {
                                    ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106884tG(queryParameter7, new C91820l(bVar2, w2Var));
                                }
                            }
                            Log.m105925i("MicroMsg.AppBrand.WxaBanJumpHelper", "[banjump] shouldBanJump, no ban info for appid:%s", str7);
                            C91821m.m115337a(bVar2);
                        }
                    }
                    aVar3 = aVar4;
                    aVar = aVar3;
                    uri = parse;
                    str2 = str3;
                }
            }
            Bundle bundle11 = bundle;
            aVar = aVar3;
            uri = parse;
            str2 = str3;
        }
        mo62044c(str2, uri, i, bundle, aVar);
        return aVar;
    }

    /* renamed from: c */
    public abstract void mo62044c(String str, Uri uri, int i, Bundle bundle, C91814a aVar);

    /* renamed from: d */
    public final void mo125658d(Context context, String str, Uri uri, int i, Bundle bundle, String str2, Bundle bundle2) {
        Uri uri2 = uri;
        Bundle bundle3 = bundle;
        String str3 = str2;
        String nullAsNil = Util.nullAsNil(uri2.getQueryParameter("path"));
        int i2 = Util.getInt(uri2.getQueryParameter(ProviderConstants.API_COLNAME_FEATURE_VERSION), 0);
        int i3 = Util.getInt(uri2.getQueryParameter("type"), 0);
        AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
        mo125656a(str, i, appBrandStatObject, bundle, bundle2);
        if (!(bundle3 == null || bundle2 == null)) {
            String string = bundle3.getString("stat_chat_talker_username", "");
            String string2 = bundle3.getString("stat_send_msg_user", "");
            int i4 = bundle3.getInt("pay_qrcode_session_type", 0);
            if (i4 == 3) {
                WCPaySessionInfoRecorder.f210858a.mo99898a(str3, new WCPaySessionInfoRecorder.JsApiPayInfo(string2, bundle3.getString("pay_qrcode_timeline_objid")));
            } else {
                WCPaySessionInfoRecorder.f210858a.mo99898a(str3, new WCPaySessionInfoRecorder.JsApiPayInfo(string, string2, i4, bundle3.getString("pay_qrcode_session_name")));
            }
        }
        AppBrandLaunchProxyUI.m102164N7(context, str2, (String) null, nullAsNil, i3, i2, appBrandStatObject, (AppBrandLaunchReferrer) null, (LaunchParamsOptional) null);
    }
}
