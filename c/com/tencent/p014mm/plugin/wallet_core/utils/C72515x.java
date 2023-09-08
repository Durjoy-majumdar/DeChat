package com.tencent.p014mm.plugin.wallet_core.utils;

import android.database.Cursor;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.BankcardScene;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import e63.C75557c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p281yz.C79173v;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.x */
public class C72515x {
    /* renamed from: a */
    public static Bankcard m84847a(BankcardScene bankcardScene) {
        BankcardScene bankcardScene2 = bankcardScene;
        Bankcard bankcard = r1;
        Bankcard bankcard2 = new Bankcard(bankcardScene2.f209449h2, bankcardScene2.f209450i2, bankcardScene2.f209451j2, bankcardScene2.f209452k2, bankcardScene2.f209453l2, bankcardScene2.f209454m2, bankcardScene2.f209455n2, bankcardScene2.f209456o2, bankcardScene2.f209457p2, bankcardScene2.f209458q2, bankcardScene2.f209459r2, bankcardScene2.f209460s2, bankcardScene2.f209461t2, bankcardScene2.f209462u2, bankcardScene2.f209463v2, bankcardScene2.f209464w2, bankcardScene2.f209465x2, bankcardScene2.f209466y2, bankcardScene2.f209467z2, bankcardScene2.f209433A2, bankcardScene2.f209434B2, bankcardScene2.f209435C2, bankcardScene2.f209436D2, bankcardScene2.f209437E2, bankcardScene2.f209438F2, bankcardScene2.f209439G2, bankcardScene2.f209440H2, bankcardScene2.f209441I2, bankcardScene2.f209442J2, bankcardScene2.f209443K2, bankcardScene2.f209444L2, bankcardScene2.f209445M2, bankcardScene2.f209446N2, bankcardScene2.f209447O2, bankcardScene2.f209448P2);
        Bankcard bankcard3 = bankcard;
        bankcard3.field_bindSerial = bankcardScene2.field_bindSerial;
        bankcard3.field_defaultCardState = bankcardScene2.field_defaultCardState;
        bankcard3.field_cardType = bankcardScene2.field_cardType;
        bankcard3.field_bankcardState = bankcardScene2.field_bankcardState;
        bankcard3.field_forbidWord = bankcardScene2.field_forbidWord;
        bankcard3.field_bankName = bankcardScene2.field_bankName;
        bankcard3.field_bankcardType = bankcardScene2.field_bankcardType;
        bankcard3.field_bankcardTypeName = bankcardScene2.field_bankcardTypeName;
        bankcard3.field_bankcardTag = bankcardScene2.field_bankcardTag;
        bankcard3.field_bankcardTail = bankcardScene2.field_bankcardTail;
        bankcard3.field_supportTag = bankcardScene2.field_supportTag;
        bankcard3.field_mobile = bankcardScene2.field_mobile;
        bankcard3.field_trueName = bankcardScene2.field_trueName;
        bankcard3.field_desc = bankcardScene2.field_desc;
        bankcard3.field_bankPhone = bankcardScene2.field_bankPhone;
        bankcard3.field_bizUsername = bankcardScene2.field_bizUsername;
        bankcard3.field_onceQuotaKind = bankcardScene2.field_onceQuotaKind;
        bankcard3.field_onceQuotaVirtual = bankcardScene2.field_onceQuotaVirtual;
        bankcard3.field_dayQuotaKind = bankcardScene2.field_dayQuotaKind;
        bankcard3.field_dayQuotaVirtual = bankcardScene2.field_dayQuotaVirtual;
        bankcard3.field_fetchArriveTime = bankcardScene2.field_fetchArriveTime;
        bankcard3.field_fetchArriveTimeWording = bankcardScene2.field_fetchArriveTimeWording;
        bankcard3.field_repay_url = bankcardScene2.field_repay_url;
        bankcard3.field_wxcreditState = bankcardScene2.field_wxcreditState;
        bankcard3.field_bankcardClientType = bankcardScene2.field_bankcardClientType;
        bankcard3.field_ext_msg = bankcardScene2.field_ext_msg;
        bankcard3.field_support_micropay = bankcardScene2.field_support_micropay;
        bankcard3.field_arrive_type = bankcardScene2.field_arrive_type;
        bankcard3.field_avail_save_wording = bankcardScene2.field_avail_save_wording;
        bankcard3.field_fetch_charge_rate = bankcardScene2.field_fetch_charge_rate;
        bankcard3.field_full_fetch_charge_fee = bankcardScene2.field_full_fetch_charge_fee;
        bankcard3.field_fetch_charge_info = bankcardScene2.field_fetch_charge_info;
        bankcard3.field_tips = bankcardScene2.field_tips;
        bankcard3.field_forbid_title = bankcardScene2.field_forbid_title;
        bankcard3.field_forbid_url = bankcardScene2.field_forbid_url;
        bankcard3.field_no_micro_word = bankcardScene2.field_no_micro_word;
        bankcard3.field_card_bottom_wording = bankcardScene2.field_card_bottom_wording;
        bankcard3.field_support_lqt_turn_in = bankcardScene2.field_support_lqt_turn_in;
        bankcard3.field_support_lqt_turn_out = bankcardScene2.field_support_lqt_turn_out;
        bankcard3.field_is_hightlight_pre_arrive_time_wording = bankcardScene2.field_is_hightlight_pre_arrive_time_wording;
        bankcard3.field_card_state_name = bankcardScene2.field_card_state_name;
        bankcard3.field_prompt_info_prompt_text = bankcardScene2.field_prompt_info_prompt_text;
        bankcard3.field_prompt_info_jump_text = bankcardScene2.field_prompt_info_jump_text;
        bankcard3.field_prompt_info_jump_url = bankcardScene2.field_prompt_info_jump_url;
        return bankcard3;
    }

    /* renamed from: b */
    public static BankcardScene m84848b(Bankcard bankcard) {
        Bankcard bankcard2 = bankcard;
        BankcardScene bankcardScene = r1;
        BankcardScene bankcardScene2 = new BankcardScene(bankcard2.f209409d2, bankcard2.f209410e2, bankcard2.f209411f2, bankcard2.f209412g2, bankcard2.f209413h2, bankcard2.f209414i2, bankcard2.f209415j2, bankcard2.f209416k2, bankcard2.f209417l2, bankcard2.f209418m2, bankcard2.f209419n2, bankcard2.f209420o2, bankcard2.f209421p2, bankcard2.f209422q2, bankcard2.f209423r2, bankcard2.f209424s2, bankcard2.f209425t2, bankcard2.f209426u2, bankcard2.f209427v2, bankcard2.f209428w2, bankcard2.f209429x2, bankcard2.f209430y2, bankcard2.f209431z2, bankcard2.f209388A2, bankcard2.f209389B2, bankcard2.f209390C2, bankcard2.f209391D2, bankcard2.f209392E2, bankcard2.f209393F2, bankcard2.f209394G2, bankcard2.f209395H2, bankcard2.f209396I2, bankcard2.f209397J2, bankcard2.f209398K2, bankcard2.f209399L2);
        BankcardScene bankcardScene3 = bankcardScene;
        bankcardScene3.field_bindSerial = bankcard2.field_bindSerial;
        bankcardScene3.field_defaultCardState = bankcard2.field_defaultCardState;
        bankcardScene3.field_cardType = bankcard2.field_cardType;
        bankcardScene3.field_bankcardState = bankcard2.field_bankcardState;
        bankcardScene3.field_forbidWord = bankcard2.field_forbidWord;
        bankcardScene3.field_bankName = bankcard2.field_bankName;
        bankcardScene3.field_bankcardType = bankcard2.field_bankcardType;
        bankcardScene3.field_bankcardTypeName = bankcard2.field_bankcardTypeName;
        bankcardScene3.field_bankcardTag = bankcard2.field_bankcardTag;
        bankcardScene3.field_bankcardTail = bankcard2.field_bankcardTail;
        bankcardScene3.field_supportTag = bankcard2.field_supportTag;
        bankcardScene3.field_mobile = bankcard2.field_mobile;
        bankcardScene3.field_trueName = bankcard2.field_trueName;
        bankcardScene3.field_desc = bankcard2.field_desc;
        bankcardScene3.field_bankPhone = bankcard2.field_bankPhone;
        bankcardScene3.field_bizUsername = bankcard2.field_bizUsername;
        bankcardScene3.field_onceQuotaKind = bankcard2.field_onceQuotaKind;
        bankcardScene3.field_onceQuotaVirtual = bankcard2.field_onceQuotaVirtual;
        bankcardScene3.field_dayQuotaKind = bankcard2.field_dayQuotaKind;
        bankcardScene3.field_dayQuotaVirtual = bankcard2.field_dayQuotaVirtual;
        bankcardScene3.field_fetchArriveTime = bankcard2.field_fetchArriveTime;
        bankcardScene3.field_fetchArriveTimeWording = bankcard2.field_fetchArriveTimeWording;
        bankcardScene3.field_repay_url = bankcard2.field_repay_url;
        bankcardScene3.field_wxcreditState = bankcard2.field_wxcreditState;
        bankcardScene3.field_bankcardClientType = bankcard2.field_bankcardClientType;
        bankcardScene3.field_ext_msg = bankcard2.field_ext_msg;
        bankcardScene3.field_support_micropay = bankcard2.field_support_micropay;
        bankcardScene3.field_arrive_type = bankcard2.field_arrive_type;
        bankcardScene3.field_avail_save_wording = bankcard2.field_avail_save_wording;
        bankcardScene3.field_fetch_charge_rate = bankcard2.field_fetch_charge_rate;
        bankcardScene3.field_full_fetch_charge_fee = bankcard2.field_full_fetch_charge_fee;
        bankcardScene3.field_fetch_charge_info = bankcard2.field_fetch_charge_info;
        bankcardScene3.field_tips = bankcard2.field_tips;
        bankcardScene3.field_forbid_title = bankcard2.field_forbid_title;
        bankcardScene3.field_forbid_url = bankcard2.field_forbid_url;
        bankcardScene3.field_no_micro_word = bankcard2.field_no_micro_word;
        bankcardScene3.field_card_bottom_wording = bankcard2.field_card_bottom_wording;
        bankcardScene3.field_support_lqt_turn_in = bankcard2.field_support_lqt_turn_in;
        bankcardScene3.field_support_lqt_turn_out = bankcard2.field_support_lqt_turn_out;
        bankcardScene3.field_is_hightlight_pre_arrive_time_wording = bankcard2.field_is_hightlight_pre_arrive_time_wording;
        bankcardScene3.field_card_state_name = bankcard2.field_card_state_name;
        bankcardScene3.field_prompt_info_prompt_text = bankcard2.field_prompt_info_prompt_text;
        bankcardScene3.field_prompt_info_jump_text = bankcard2.field_prompt_info_jump_text;
        bankcardScene3.field_prompt_info_jump_url = bankcard2.field_prompt_info_jump_url;
        return bankcardScene3;
    }

    /* renamed from: c */
    public static ArrayList<Bankcard> m84849c(int i) {
        ArrayList arrayList;
        C75557c wx02 = ((C79173v) C86312j.m106911c(C79173v.class)).wx0();
        wx02.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("select * from WalletBankcardScene where (cardType <= 7 OR cardType & ");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = BankcardScene.f209432Q2;
        sb.append(256);
        sb.append(" != 0 OR ");
        sb.append("cardType");
        sb.append(" & ");
        sb.append(128);
        sb.append(" != 0) and ");
        sb.append(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        sb.append("=");
        sb.append(i);
        Cursor rawQuery = wx02.f221976d.rawQuery(sb.toString(), (String[]) null, 2);
        if (rawQuery == null) {
            arrayList = null;
        } else {
            if (rawQuery.moveToFirst()) {
                arrayList = new ArrayList();
                do {
                    BankcardScene bankcardScene = new BankcardScene();
                    bankcardScene.convertFrom(rawQuery);
                    arrayList.add(bankcardScene);
                } while (rawQuery.moveToNext());
            } else {
                arrayList = null;
            }
            rawQuery.close();
        }
        if (arrayList == null) {
            return null;
        }
        ArrayList<Bankcard> arrayList2 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(m84847a((BankcardScene) it.next()));
        }
        return arrayList2;
    }

    /* renamed from: d */
    public static boolean m84850d(Bankcard bankcard, int i) {
        Class cls = C79173v.class;
        if (bankcard == null) {
            return false;
        }
        if (i != 8 && i != 12 && i != 26) {
            return ((C79173v) C86312j.m106911c(cls)).xx0().insert(bankcard);
        }
        BankcardScene b = m84848b(bankcard);
        b.field_scene = i;
        return ((C79173v) C86312j.m106911c(cls)).wx0().insert(b);
    }

    /* renamed from: e */
    public static boolean m84851e(List<Bankcard> list, int i) {
        Class cls = C79173v.class;
        if (list == null) {
            return false;
        }
        if (i == 8 || i == 12 || i == 26) {
            ArrayList arrayList = new ArrayList();
            for (Bankcard b : list) {
                BankcardScene b2 = m84848b(b);
                b2.field_scene = i;
                arrayList.add(b2);
            }
            ((C79173v) C86312j.m106911c(cls)).wx0().mo105862Lo(arrayList);
            return true;
        }
        ((C79173v) C86312j.m106911c(cls)).xx0().mo105867qq(list);
        return true;
    }
}
