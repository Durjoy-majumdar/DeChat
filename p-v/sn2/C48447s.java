package sn2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.GetA8KeyRedirectEvent;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.shake.p103ui.TVInfoUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import hl0.C87547f;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import lc3.C10485b;
import nn2.C47288f;
import p214om.C11502f;
import rb0.C48009v0;
import sf0.C90188n0;

/* renamed from: sn2.s */
public class C48447s {
    /* renamed from: a */
    public static void m53799a(C36746a0 a0Var, Context context, int i) {
        if (a0Var != null) {
            if (!Util.isNullOrNil(a0Var.field_username) || !Util.isNullOrNil(a0Var.field_deeplink)) {
                m53800b(a0Var.field_username, a0Var.field_deeplink, i, context);
                Log.m105924i("Micromsg.ShakeTVLogic", "doShakeTvHistoryItemClick start do nth");
                return;
            }
            C115669n.INSTANCE.mo160131h(12108, Util.nullAsNil(a0Var.field_username), Integer.valueOf(i), 0);
        }
    }

    /* renamed from: b */
    public static void m53800b(String str, String str2, int i, Context context) {
        if (!Util.isNullOrNil(str2)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str2));
            int i2 = 16;
            if (i == 3 || i == 4) {
                i2 = 17;
            }
            intent.putExtra("translate_link_scene", i2);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/shake/shakemedia/model/ShakeTVLogic", "doShakeTvOpenTempSession", "(Ljava/lang/String;Ljava/lang/String;ILandroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/shake/shakemedia/model/ShakeTVLogic", "doShakeTvOpenTempSession", "(Ljava/lang/String;Ljava/lang/String;ILandroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            Log.m105924i("Micromsg.ShakeTVLogic", "doShakeTvHistoryItemClick start tempsession open deeplink");
            C115669n.INSTANCE.mo160131h(12108, Util.nullAsNil(str), Integer.valueOf(i), 1);
        }
    }

    /* renamed from: c */
    public static void m53801c(C47288f fVar, Context context, boolean z) {
        Class cls = C11502f.class;
        if (fVar != null) {
            int i = 4;
            switch (fVar.field_type) {
                case 6:
                    String str = fVar.field_username;
                    C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str);
                    if (z1Var != null) {
                        Intent intent = new Intent();
                        if (z1Var.mo62927s3() && z1Var.mo62916m3()) {
                            C48009v0.Fx0().mo72757SE(str);
                            if (fVar.field_distance.equals("1")) {
                                intent.putExtra("Chat_User", str);
                                intent.putExtra("finish_direct", true);
                                ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93173f(intent, context);
                                return;
                            }
                        }
                        intent.putExtra("Contact_User", str);
                        intent.putExtra("force_get_contact", true);
                        C88144b.m109791i(context, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
                        return;
                    }
                    return;
                case 7:
                    Intent intent2 = new Intent();
                    int i2 = 18;
                    if (z) {
                        i2 = 26;
                    }
                    intent2.putExtra("geta8key_scene", i2);
                    intent2.putExtra("stastic_scene", 6);
                    intent2.putExtra("KAppId", "wxaf060266bfa9a35c");
                    Bundle bundle = new Bundle();
                    bundle.putString("jsapi_args_appid", "wxaf060266bfa9a35c");
                    intent2.putExtra("jsapiargs", bundle);
                    intent2.putExtra("rawUrl", fVar.field_username);
                    intent2.putExtra("srcUsername", fVar.field_distance);
                    ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93190w(intent2, context);
                    return;
                case 8:
                    Intent intent3 = new Intent();
                    intent3.setClass(context, TVInfoUI.class);
                    intent3.putExtra("key_TV_xml_bytes", fVar.field_lvbuffer);
                    intent3.putExtra("key_TV_come_from_shake", true);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent3);
                    C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/shake/shakemedia/model/ShakeTVLogic", "handleRedirect", "(Lcom/tencent/mm/plugin/shake/model/ShakeItem;Landroid/content/Context;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/plugin/shake/shakemedia/model/ShakeTVLogic", "handleRedirect", "(Lcom/tencent/mm/plugin/shake/model/ShakeItem;Landroid/content/Context;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return;
                case 9:
                    GetA8KeyRedirectEvent getA8KeyRedirectEvent = new GetA8KeyRedirectEvent();
                    GetA8KeyRedirectEvent.C40113a aVar2 = getA8KeyRedirectEvent.f107573d;
                    aVar2.f107575a = 11;
                    aVar2.f107576b = fVar.field_username;
                    aVar2.f107577c = context;
                    getA8KeyRedirectEvent.callback = null;
                    getA8KeyRedirectEvent.asyncPublish(Looper.myLooper());
                    return;
                case 10:
                    Intent intent4 = new Intent();
                    intent4.putExtra("key_product_id", fVar.field_username);
                    intent4.putExtra("key_product_scene", 9);
                    C88144b.m109791i(context, "product", ".ui.MallProductUI", intent4, (Bundle) null);
                    return;
                case 12:
                    if (!z) {
                        i = 3;
                    }
                    m53800b(fVar.field_distance, fVar.field_username, i, context);
                    return;
                case 13:
                    String str2 = fVar.field_username;
                    String str3 = fVar.field_reserved3;
                    int i3 = fVar.field_reserved2;
                    if (Util.isNullOrNil(str2)) {
                        Log.m105924i("Micromsg.ShakeTVLogic", "gotoAppBrand commField.app_brand_user_name is null");
                        return;
                    }
                    StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
                    StartAppBrandUIFromOuterEvent.C1142a aVar3 = startAppBrandUIFromOuterEvent.f9522d;
                    aVar3.f9526a = str2;
                    aVar3.f9527b = Util.nullAs(str3, "");
                    StartAppBrandUIFromOuterEvent.C1142a aVar4 = startAppBrandUIFromOuterEvent.f9522d;
                    aVar4.f9528c = 0;
                    aVar4.f9529d = C87547f.CTRL_INDEX;
                    aVar4.f9534i = i3;
                    startAppBrandUIFromOuterEvent.publish();
                    StartAppBrandUIFromOuterEvent.C1142a aVar5 = startAppBrandUIFromOuterEvent.f9522d;
                    Log.m105925i("Micromsg.ShakeTVLogic", "gotoAppBrand userName:%s, path:%s, scene:%d openType:%d version:%d", aVar5.f9526a, aVar5.f9527b, Integer.valueOf(aVar5.f9529d), Integer.valueOf(startAppBrandUIFromOuterEvent.f9522d.f9528c), Integer.valueOf(startAppBrandUIFromOuterEvent.f9522d.f9534i));
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: d */
    public static boolean m53802d(int i) {
        return 7 == i || 6 == i || 8 == i || 9 == i || 10 == i || 12 == i || 13 == i;
    }

    /* renamed from: e */
    public static boolean m53803e() {
        if (C90188n0.f258943k) {
            return true;
        }
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("ShowShakeTV");
        Log.m105919d("Micromsg.ShakeTVLogic", "DynamicConfig Get ShowShakeTV: %s", c);
        return !Util.isNullOrNil(c) && c.equals("1");
    }
}
