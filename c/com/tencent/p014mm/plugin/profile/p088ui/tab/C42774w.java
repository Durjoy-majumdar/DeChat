package com.tencent.p014mm.plugin.profile.p088ui.tab;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.BizPlaceTopChangeEvent;
import com.tencent.p014mm.p136ui.transmit.SelectConversationUI;
import com.tencent.p014mm.plugin.profile.p088ui.ContactInfoUI;
import com.tencent.p014mm.plugin.profile.p088ui.newbizinfo.NewBizInfoSettingUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45618p;
import eb0.C45628s0;
import gy3.C87412m;
import j20.C117292a;
import java.util.Arrays;
import k20.C9556a;
import ke3.C88144b;
import kf2.C46723f;
import nj3.C11184p0;
import nj3.C76879j;
import p214om.C11502f;
import rb0.C47984k;
import wc3.C15141z;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.w */
public final class C42774w implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ ContactWidgetTabBizInfo f115819d;

    public C42774w(ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
        this.f115819d = contactWidgetTabBizInfo;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        ContactWidgetTabBizInfo contactWidgetTabBizInfo = this.f115819d;
        String str = null;
        if (itemId == contactWidgetTabBizInfo.f115595N) {
            Intent intent = new Intent();
            C72996z1 z1Var = contactWidgetTabBizInfo.f115610i;
            intent.putExtra("Select_Talker_Name", z1Var != null ? z1Var.getUsername() : null);
            C72996z1 z1Var2 = contactWidgetTabBizInfo.f115610i;
            intent.putExtra("Select_block_List", z1Var2 != null ? z1Var2.getUsername() : null);
            intent.putExtra("Select_Send_Card", true);
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("mutil_select_is_ret", true);
            C15141z yM = ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM();
            int i2 = contactWidgetTabBizInfo.f115603W;
            ContactInfoUI contactInfoUI = contactWidgetTabBizInfo.f115605d;
            ((C67654r1) yM).getClass();
            intent.setClass(contactInfoUI, SelectConversationUI.class);
            contactInfoUI.startActivityForResult(intent, i2);
            C72996z1 z1Var3 = contactWidgetTabBizInfo.f115610i;
            if (z1Var3 != null) {
                str = z1Var3.getUsername();
            }
            C46723f.m52019a(str, 800, contactWidgetTabBizInfo.f115612n, contactWidgetTabBizInfo.f115608g, contactWidgetTabBizInfo.f115605d.getIntent());
        } else if (itemId == contactWidgetTabBizInfo.f115596P) {
            Intent intent2 = new Intent();
            intent2.setClass(contactWidgetTabBizInfo.f115605d, NewBizInfoSettingUI.class);
            C72996z1 z1Var4 = contactWidgetTabBizInfo.f115610i;
            if (z1Var4 != null) {
                str = z1Var4.getUsername();
            }
            intent2.putExtra("Contact_User", str);
            intent2.putExtra("key_start_biz_profile_setting_from_scene", 2);
            intent2.putExtra("key_profile_enter_timestamp", contactWidgetTabBizInfo.f115608g);
            if (contactWidgetTabBizInfo.f115605d.getIntent() != null) {
                intent2.putExtras(contactWidgetTabBizInfo.f115605d.getIntent());
            }
            ContactInfoUI contactInfoUI2 = contactWidgetTabBizInfo.f115605d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent2);
            ContactInfoUI contactInfoUI3 = contactInfoUI2;
            C117292a.m165358d(contactInfoUI3, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizInfo", "jumpToSettingUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            contactInfoUI2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(contactInfoUI3, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizInfo", "jumpToSettingUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (itemId == contactWidgetTabBizInfo.f115597Q) {
            C72996z1 z1Var5 = contactWidgetTabBizInfo.f115610i;
            String username = z1Var5 != null ? z1Var5.getUsername() : null;
            ContactWidgetTabBizInfo contactWidgetTabBizInfo2 = this.f115819d;
            C46723f.m52019a(username, 903, contactWidgetTabBizInfo2.f115612n, contactWidgetTabBizInfo2.f115608g, contactWidgetTabBizInfo2.f115605d.getIntent());
            C72996z1 z1Var6 = this.f115819d.f115610i;
            C45618p.m50718b(z1Var6 != null ? z1Var6.getUsername() : null, true);
            ContactWidgetTabBizInfo contactWidgetTabBizInfo3 = this.f115819d;
            contactWidgetTabBizInfo3.getClass();
            BizPlaceTopChangeEvent bizPlaceTopChangeEvent = new BizPlaceTopChangeEvent();
            BizPlaceTopChangeEvent.C40041a aVar2 = bizPlaceTopChangeEvent.f107373d;
            C72996z1 z1Var7 = contactWidgetTabBizInfo3.f115610i;
            aVar2.f107374a = z1Var7 != null ? z1Var7.getUsername() : null;
            bizPlaceTopChangeEvent.publish();
            C72996z1 z1Var8 = this.f115819d.f115610i;
            if (z1Var8 != null) {
                str = z1Var8.getUsername();
            }
            if (C47984k.m53340n(str)) {
                ContactInfoUI contactInfoUI4 = this.f115819d.f115605d;
                C76879j.m92726T(contactInfoUI4, contactInfoUI4.getString(C0966R.string.gm4));
            }
        } else if (itemId == contactWidgetTabBizInfo.f115598R) {
            C72996z1 z1Var9 = contactWidgetTabBizInfo.f115610i;
            C45628s0.m50803u0(z1Var9 != null ? z1Var9.getUsername() : null, true);
            C72996z1 z1Var10 = this.f115819d.f115610i;
            String username2 = z1Var10 != null ? z1Var10.getUsername() : null;
            ContactWidgetTabBizInfo contactWidgetTabBizInfo4 = this.f115819d;
            C46723f.m52019a(username2, 904, contactWidgetTabBizInfo4.f115612n, contactWidgetTabBizInfo4.f115608g, contactWidgetTabBizInfo4.f115605d.getIntent());
            ContactWidgetTabBizInfo contactWidgetTabBizInfo5 = this.f115819d;
            contactWidgetTabBizInfo5.getClass();
            BizPlaceTopChangeEvent bizPlaceTopChangeEvent2 = new BizPlaceTopChangeEvent();
            BizPlaceTopChangeEvent.C40041a aVar3 = bizPlaceTopChangeEvent2.f107373d;
            C72996z1 z1Var11 = contactWidgetTabBizInfo5.f115610i;
            aVar3.f107374a = z1Var11 != null ? z1Var11.getUsername() : null;
            bizPlaceTopChangeEvent2.publish();
            C72996z1 z1Var12 = this.f115819d.f115610i;
            if (z1Var12 != null) {
                str = z1Var12.getUsername();
            }
            if (C47984k.m53340n(str)) {
                ContactInfoUI contactInfoUI5 = this.f115819d.f115605d;
                C76879j.m92726T(contactInfoUI5, contactInfoUI5.getString(C0966R.string.apt));
            }
        } else if (itemId == contactWidgetTabBizInfo.f115599S) {
            C72996z1 z1Var13 = contactWidgetTabBizInfo.f115610i;
            if (z1Var13 != null && !Util.isNullOrNil(z1Var13.getUsername())) {
                C72996z1 z1Var14 = contactWidgetTabBizInfo.f115610i;
                C46723f.m52019a(z1Var14 != null ? z1Var14.getUsername() : null, 601, contactWidgetTabBizInfo.f115612n, contactWidgetTabBizInfo.f115608g, contactWidgetTabBizInfo.f115605d.getIntent());
                Intent intent3 = new Intent();
                String str2 = contactWidgetTabBizInfo.f115604X;
                Object[] objArr = new Object[1];
                C72996z1 z1Var15 = contactWidgetTabBizInfo.f115610i;
                objArr[0] = z1Var15 != null ? z1Var15.getUsername() : null;
                String format = String.format(str2, Arrays.copyOf(objArr, 1));
                C87412m.m108593f(format, "format(format, *args)");
                intent3.putExtra("rawUrl", format);
                intent3.putExtra("key_menu_hide_expose", true);
                C88144b.m109791i(contactWidgetTabBizInfo.f115605d, "webview", ".ui.tools.WebViewUI", intent3, (Bundle) null);
            }
        } else if (itemId == contactWidgetTabBizInfo.f115600T) {
            ContactWidgetTabBizHeaderController contactWidgetTabBizHeaderController = contactWidgetTabBizInfo.f115620v;
            if (contactWidgetTabBizHeaderController != null) {
                contactWidgetTabBizHeaderController.mo66827e();
            }
        } else {
            Log.m105928w("MicroMsg.ContactWidgetTabBizInfo", "default onMMMenuItemSelected err");
        }
    }
}
