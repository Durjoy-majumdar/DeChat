package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import f32.C75675d;
import ht1.C60200t1;
import ke3.C88144b;
import org.json.JSONObject;
import te3.C49712hj1;
import te3.C77993rp3;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.s */
public class C69679s implements C7092q.C7093a {

    /* renamed from: a */
    public final /* synthetic */ C77993rp3 f201070a;

    /* renamed from: b */
    public final /* synthetic */ LuckyMoneyDetailUI f201071b;

    public C69679s(LuckyMoneyDetailUI luckyMoneyDetailUI, C77993rp3 rp32) {
        this.f201071b = luckyMoneyDetailUI;
        this.f201070a = rp32;
    }

    public void onClick(View view) {
        Class cls = C60200t1.class;
        Intent intent = new Intent();
        Log.m105925i("MicroMsg.LuckyMoneyDetailUI", "click info.action_type:%s", Integer.valueOf(this.f201070a.f228182j));
        C77993rp3 rp32 = this.f201070a;
        int i = rp32.f228182j;
        C75675d.f222281g = i;
        switch (i) {
            case 1:
                C75228t.m90219L(this.f201071b.getContext(), this.f201070a.f228183n, true);
                break;
            case 2:
                intent.putExtra("Contact_User", rp32.f228184o);
                intent.putExtra("Contact_Scene", WXWebReporter.WXXWEB_PRE_DOWN_ARM32_SUC);
                if (!Util.isNullOrNil(this.f201070a.f228193x)) {
                    String uri = Uri.parse(this.f201070a.f228193x).buildUpon().appendQueryParameter("fromscene", "1").appendQueryParameter("type", "1").build().toString();
                    intent.putExtra("biz_profile_enter_from_luck_money_spring_event_url", uri);
                    C75675d.f222283i = uri;
                }
                intent.putExtra("force_get_contact", true);
                C88144b.m109795m(this.f201071b.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, 2);
                break;
            case 3:
                C75228t.m90224Q(rp32.f228184o, rp32.f228183n, 0, 1100);
                break;
            case 4:
                ((C60200t1) C86312j.m106911c(cls)).mo76842e7(10, 2, 32, intent);
                intent.putExtra("finder_username", this.f201070a.f228184o);
                if (!Util.isNullOrNil(this.f201070a.f228193x)) {
                    String uri2 = Uri.parse(this.f201070a.f228193x).buildUpon().appendQueryParameter("fromscene", "1").appendQueryParameter("type", "2").build().toString();
                    intent.putExtra("key_same_receive_link", uri2);
                    C75675d.f222283i = uri2;
                    Log.m105925i("MicroMsg.LuckyMoneyDetailUI", "same_receive_link is %s", uri2);
                } else {
                    Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "same_receive_link is null");
                }
                intent.putExtra("key_packet_id", this.f201070a.f228186q);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("redbag_scene", 1);
                    jSONObject.put("coverid", this.f201070a.f228186q);
                } catch (Throwable th) {
                    Log.m105921e("MicroMsg.LuckyMoneyDetailUI", "jump finder error, ", th);
                }
                intent.putExtra("key_extra_info", jSONObject.toString());
                ((C60200t1) C86312j.m106911c(cls)).mo76819V1(this.f201071b.getContext(), intent);
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("red_cover_id", this.f201070a.f228186q);
                    jSONObject2.put("finderusername", this.f201070a.f228184o);
                    jSONObject2.put("red_cover_type", 1);
                } catch (Throwable th4) {
                    Log.m105921e("MicroMsg.LuckyMoneyDetailUI", "jump finder error, ", th4);
                }
                ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83788g6("red_cover_link", 1, jSONObject2, (C49712hj1) null);
                this.f201071b.getContext().overridePendingTransition(C0966R.C0968anim.f2503er, C0966R.C0968anim.f2498em);
                break;
            case 5:
                intent.putExtra("uin", rp32.f228189t);
                intent.putExtra("name", this.f201070a.f228184o);
                intent.putExtra("headurl", this.f201070a.f228183n);
                intent.putExtra("extra_scence", 30);
                C88144b.m109791i(this.f201071b.getContext(), "emoji", ".ui.v2.EmojiStoreV2DesignerUI", intent, (Bundle) null);
                break;
            case 6:
                intent.putExtra("extra_id", rp32.f228184o);
                intent.putExtra("preceding_scence", 21);
                C88144b.m109791i(this.f201071b.getContext(), "emoji", ".ui.EmojiStoreDetailUI", intent, (Bundle) null);
                break;
            default:
                Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "unknow type");
                break;
        }
        LuckyMoneyDetailUI luckyMoneyDetailUI = this.f201071b;
        if (!luckyMoneyDetailUI.f199866g) {
            C75675d.m90931a(23, luckyMoneyDetailUI.f199861d2);
            this.f201071b.f199866g = true;
        }
    }
}
