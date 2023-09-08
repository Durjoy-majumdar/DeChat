package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80995a;
import com.tencent.p014mm.message.C80996q;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.C83727p2;
import com.tencent.p014mm.plugin.appbrand.config.WxaProfileAttributes;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82967h0;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82970i0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C45628s0;
import eb0.C86493v0;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.p1 */
public class C84571p1 implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ WxaProfileAttributes f246771d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandProfileUI f246772e;

    public C84571p1(AppBrandProfileUI appBrandProfileUI, WxaProfileAttributes wxaProfileAttributes) {
        this.f246772e = appBrandProfileUI;
        this.f246771d = wxaProfileAttributes;
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (i == 1) {
            boolean z = intent2 != null && intent2.getBooleanExtra("finish_by_forward_to_wework", false);
            Log.m105925i("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "mmOnActivityResult, finishByForwardToWeWork: %b", Boolean.valueOf(z));
            if (z) {
                C82970i0 i0Var = new C82970i0();
                i0Var.f242600a = C82967h0.m101762a(this.f246771d.f239576e, 0).toString();
                i0Var.f242601b = 0;
                WxaProfileAttributes wxaProfileAttributes = this.f246771d;
                i0Var.f242602c = wxaProfileAttributes.f239577f;
                i0Var.f242604e = wxaProfileAttributes.f239579h;
                AppBrandProfileUI appBrandProfileUI = this.f246772e;
                long nowSecond = Util.nowSecond();
                int i3 = AppBrandProfileUI.f246424V;
                appBrandProfileUI.mo117091M7(33, 1, nowSecond, i0Var);
                AppBrandProfileUI appBrandProfileUI2 = this.f246772e;
                C76879j.m92726T(appBrandProfileUI2, appBrandProfileUI2.getResources().getString(C0966R.string.f360099a34));
            } else if (i2 == -1) {
                String stringExtra = intent2 == null ? null : intent2.getStringExtra("Select_Conv_User");
                if (stringExtra == null || stringExtra.length() == 0) {
                    Log.m105924i("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "mmOnActivityResult fail, toUser is null");
                    return;
                }
                Log.m105925i("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "result success toUser : %s ", stringExtra);
                String stringExtra2 = intent2.getStringExtra("custom_send_text");
                String str = this.f246771d.f239576e;
                C86493v0.C86495c c = C86493v0.m107224d().mo120947c(C86493v0.m107223a("wxapp_" + str), true);
                c.mo120962i("prePublishId", "wxapp_" + str);
                C68070l.C68072b bVar = new C68070l.C68072b();
                bVar.f195570f = this.f246771d.f239577f;
                bVar.f195582i = 33;
                bVar.f195573f2 = this.f246772e.f246448d;
                bVar.f195577g2 = str;
                bVar.f195581h2 = 1;
                bVar.f195494H1 = "wxapp_" + str;
                bVar.f195646y = this.f246771d.f239579h;
                bVar.f195586j = C83727p2.m102773c(str);
                bVar.f195634v = this.f246772e.f246448d;
                bVar.f195638w = this.f246771d.f239577f;
                C80995a aVar = new C80995a();
                WxaProfileAttributes wxaProfileAttributes2 = this.f246771d;
                aVar.f237905n = wxaProfileAttributes2.f239583o;
                aVar.f237906o = wxaProfileAttributes2.f239584p;
                bVar.mo93545f(aVar);
                int i4 = 0;
                for (String next : Util.stringsToList(stringExtra.split(","))) {
                    int i5 = i4 + 1;
                    bVar.f195589j2 = C82967h0.m101762a(str, i4).toString();
                    String str2 = next;
                    C80996q.C1279a.m1369a().mo112827qE(bVar, str, this.f246771d.f239577f, next, (String) null, (byte[]) null);
                    if (!Util.isNullOrNil(stringExtra2)) {
                        SendMsgEvent sendMsgEvent = new SendMsgEvent();
                        SendMsgEvent.C1132a aVar2 = sendMsgEvent.f9496d;
                        aVar2.f9497a = str2;
                        aVar2.f9498b = stringExtra2;
                        aVar2.f9499c = C45628s0.m50810y(str2);
                        sendMsgEvent.f9496d.f9500d = 0;
                        sendMsgEvent.publish();
                    }
                    int i6 = str2.endsWith("@chatroom") ? 31 : 30;
                    C82970i0 i0Var2 = new C82970i0();
                    i0Var2.f242600a = bVar.f195589j2;
                    i0Var2.f242601b = 0;
                    i0Var2.f242602c = bVar.f195570f;
                    i0Var2.f242604e = bVar.f195646y;
                    this.f246772e.mo117091M7(i6, 1, Util.nowSecond(), i0Var2);
                    i4 = i5;
                }
                AppBrandProfileUI appBrandProfileUI3 = this.f246772e;
                C76879j.m92726T(appBrandProfileUI3, appBrandProfileUI3.getResources().getString(C0966R.string.f360099a34));
            }
        } else {
            AppBrandProfileUI appBrandProfileUI4 = this.f246772e;
            int i7 = AppBrandProfileUI.f246424V;
            appBrandProfileUI4.mo117090L7(30, 2);
        }
    }
}
