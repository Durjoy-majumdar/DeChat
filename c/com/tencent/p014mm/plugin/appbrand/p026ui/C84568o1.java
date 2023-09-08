package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.appbrand.appusage.C68585h1;
import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.plugin.appbrand.config.WxaProfileAttributes;
import com.tencent.p014mm.plugin.appbrand.launching.teenmode.C83472a;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sendtowework.AppBrandData;
import di3.C86312j;
import java.util.HashMap;
import ke3.C88144b;
import ky2.C10432i;
import nj3.C11184p0;
import org.xwalk.core.XWalkEnvironment;
import xr0.C78972i;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.o1 */
public class C84568o1 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ AppBrandProfileUI f246769d;

    public C84568o1(AppBrandProfileUI appBrandProfileUI) {
        this.f246769d = appBrandProfileUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Class cls = C10432i.class;
        int itemId = menuItem.getItemId();
        int i2 = 2;
        if (itemId == 2) {
            AppBrandProfileUI appBrandProfileUI = this.f246769d;
            int i3 = AppBrandProfileUI.f246424V;
            appBrandProfileUI.getClass();
            Intent putExtra = new Intent(appBrandProfileUI, AppBrandAuthorizeUI.class).putExtra("key_username", appBrandProfileUI.f246448d);
            putExtra.putExtra("key_app_authorize_profile", true);
            C88144b.m109791i(appBrandProfileUI, XWalkEnvironment.MODULE_APPBRAND, ".ui.AppBrandAuthorizeUI", putExtra, (Bundle) null);
            appBrandProfileUI.mo117090L7(10, 1);
        } else if (itemId == 3) {
            AppBrandProfileUI appBrandProfileUI2 = this.f246769d;
            int i4 = AppBrandProfileUI.f246424V;
            appBrandProfileUI2.getClass();
            boolean l8 = ((C68585h1) C86312j.m106911c(C68585h1.class)).mo94243l8(appBrandProfileUI2.f246448d, 0);
            if (!l8) {
                if (!(!((C10432i) C86312j.m106911c(cls)).mo10750e() || ((C10432i) C86312j.m106911c(cls)).Oh0() == 1)) {
                    ((C10432i) C86312j.m106911c(cls)).mo10755m4(appBrandProfileUI2.getContext());
                    C83472a.m102435d(appBrandProfileUI2.f246448d);
                    return;
                }
            }
            boolean a = C78972i.m95479a(l8, appBrandProfileUI2, appBrandProfileUI2.f246448d, 0);
            int i5 = l8 ? 12 : 11;
            if (a) {
                i2 = 1;
            }
            appBrandProfileUI2.mo117090L7(i5, i2);
        } else if (itemId == 4) {
            AppBrandProfileUI.m104015H7(this.f246769d, 20);
        } else if (itemId == 5) {
            AppBrandProfileUI appBrandProfileUI3 = this.f246769d;
            WxaProfileAttributes b = C81661j.m100177b(appBrandProfileUI3.f246448d, false);
            if (b == null) {
                Log.m105928w("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "shareApp, attrs is null");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("desc", "");
            hashMap.put("type", 1);
            hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, b.f239577f);
            hashMap.put("img_url", b.f239579h);
            Intent intent = new Intent();
            intent.putExtra("Select_Conv_Type", 35);
            intent.putExtra("mutil_select_is_ret", true);
            intent.putExtra("select_is_ret", true);
            intent.putExtra("scene_from", 3);
            intent.putExtra("appbrand_params", hashMap);
            intent.putExtra("Retr_Msg_Type", 2);
            intent.putExtra("from_scene_forward_to_wework", 6);
            intent.putExtra("content_type_forward_to_wework", 5);
            String str = appBrandProfileUI3.f246448d;
            String str2 = b.f239579h;
            String str3 = b.f239577f;
            intent.putExtra("Select_Data_Send_To_WeWork", new AppBrandData(str, (String) null, str2, (String) null, str3, str3, 1));
            C88144b.m109803u(appBrandProfileUI3, ".ui.transmit.SelectConversationUI", intent, 1, new C84571p1(appBrandProfileUI3, b));
        }
    }
}
