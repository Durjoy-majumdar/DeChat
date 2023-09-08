package t02;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.OfflineUpdateCardListEvent;
import com.tencent.p014mm.autogen.events.WalletGetUserInfoEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.tav.coremedia.TimeUtil;
import di3.C86312j;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C75700k0;
import id2.C76303b;
import ie3.C76324c;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import kd2.C76559f;
import p02.C35356b;
import te3.C50744ow2;
import te3.C51823we2;
import te3.C51879wu3;
import te3.eh4;
import yq3.C79148e;

/* renamed from: t02.c */
public class C48527c {

    /* renamed from: t02.c$a */
    public class C48528a implements C79148e.C79149a {

        /* renamed from: a */
        public final /* synthetic */ boolean f129789a;

        public C48528a(boolean z) {
            this.f129789a = z;
        }

        public Intent onProcessEnd(int i, Bundle bundle) {
            if (this.f129789a) {
                C115669n.INSTANCE.mo160131h(15191, 0, 0, 0, 0, 0, 0, 0, 0, 1);
            } else {
                C115669n.INSTANCE.mo160131h(15191, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1);
            }
            return new Intent();
        }
    }

    /* renamed from: a */
    public static String m53905a(long j) {
        return C75228t.m90248h("" + j, "100", 2, RoundingMode.HALF_UP).toString();
    }

    /* renamed from: b */
    public static String m53906b(long j) {
        return new SimpleDateFormat(TimeUtil.YYYY2MM2DD_HH1MM1SS).format(new Date(j * 1000));
    }

    /* renamed from: c */
    public static int m53907c(int i) {
        if (i == 1) {
            return C0966R.raw.honey_pay_father_card_icon;
        }
        if (i == 2) {
            return C0966R.raw.honey_pay_mother_card_icon;
        }
        if (i == 3) {
            return C0966R.raw.honey_pay_child_card_icon;
        }
        if (i == 4) {
            return C0966R.raw.honey_pay_relatives_card_icon;
        }
        return -1;
    }

    /* renamed from: d */
    public static int m53908d(int i) {
        return !C85875k4.m106211z() ? C0966R.raw.honey_pay_input_logo : C0966R.raw.honey_pay_input_logo_dm;
    }

    /* renamed from: e */
    public static void m53909e(int i, String str) {
        WalletGetUserInfoEvent walletGetUserInfoEvent = new WalletGetUserInfoEvent();
        walletGetUserInfoEvent.f194038d.f194040a = 8;
        walletGetUserInfoEvent.publish();
        Log.m105924i("MicroMsg.HoneyPayUtil", "trigger offline event");
        OfflineUpdateCardListEvent offlineUpdateCardListEvent = new OfflineUpdateCardListEvent();
        OfflineUpdateCardListEvent.C28784a aVar = offlineUpdateCardListEvent.f78882d;
        aVar.f78883a = i;
        aVar.f78884b = str;
        offlineUpdateCardListEvent.publish();
        if (Util.isNullOrNil(str)) {
            return;
        }
        if (!C76559f.m92115k()) {
            Log.m105924i("MicroMsg.WalletOfflineUtil", "setOfflineBindSerialForHoneyPayCard but offline is not create, ignore");
        } else if (C76559f.m92113i()) {
            Log.m105924i("MicroMsg.WalletOfflineUtil", "offline kinda enable, update default card in kinda");
            ((C76324c) C86312j.m106911c(C76324c.class)).updateOfflinePayDefaultCard(str, "QMF");
        } else {
            if (C76559f.m92110f() == 2) {
                new C76303b(str, "QMF", 0).mo9225i();
            } else {
                C76559f.m92123s(str);
            }
        }
    }

    /* renamed from: f */
    public static void m53910f(String str, String str2, String str3) {
        Log.m105925i("MicroMsg.HoneyPayUtil", "insert sys msg: %s, %s", str, Boolean.valueOf(Util.isNullOrNil(str2)));
        if (!Util.isNullOrNil(str2) && !Util.isNullOrNil(str)) {
            String j = m53914j(m53914j(str2, str, -1), str3, -1);
            C72963f4 f4Var = new C72963f4();
            f4Var.mo108740T2(0);
            f4Var.mo108749c3(str);
            f4Var.mo100991d(6);
            f4Var.mo108732L2(j);
            f4Var.mo108733M2(C75604z3.m90841m(str, System.currentTimeMillis() / 1000));
            f4Var.setType(10000);
            f4Var.mo108735O2(f4Var.mo108762o2() | 8);
            long my02 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).my0(f4Var);
            Log.m105925i("MicroMsg.HoneyPayUtil", "insert msgId: %s", Long.valueOf(my02));
            if (my02 <= 0) {
                Log.m105928w("MicroMsg.HoneyPayUtil", "insert sys msg fail!");
            }
        }
    }

    /* renamed from: g */
    public static boolean m53911g() {
        int e = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Pay_HoneyPayCross_Int, 0);
        Log.m105925i("MicroMsg.HoneyPayUtil", "isOpenCrossSwitch: %s, %s", Boolean.TRUE, Integer.valueOf(e));
        return e == 0 || e == 1;
    }

    /* renamed from: h */
    public static void m53912h(MMActivity mMActivity, C51879wu3 wu32, String str, int i, eh4 eh4) {
        LinkedList<C50744ow2> linkedList;
        if (wu32 != null && (linkedList = wu32.f144294d) != null && !linkedList.isEmpty()) {
            C48529d dVar = new C48529d(mMActivity, wu32, str, eh4, i);
            if (!Util.isNullOrNil(wu32.f144295e)) {
                mMActivity.addTextOptionMenu(0, wu32.f144295e, (int) C0966R.color.al6, (MenuItem.OnMenuItemClickListener) dVar);
            } else {
                mMActivity.addIconOptionMenu(0, C0966R.raw.icons_outlined_more, dVar);
            }
        }
    }

    /* renamed from: i */
    public static void m53913i(MMActivity mMActivity, Bundle bundle, C51823we2 we22, boolean z) {
        RealnameGuideHelper realnameGuideHelper = new RealnameGuideHelper();
        realnameGuideHelper.mo99373d("" + we22.f143991d, we22.f143992e, we22.f143993f, we22.f143994g, we22.f143995h, 0);
        if (bundle == null) {
            Log.m105928w("MicroMsg.HoneyPayUtil", "bundle is null!");
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        bundle2.putString("realname_verify_process_jump_plugin", "honey_pay");
        realnameGuideHelper.mo99371b(mMActivity, bundle2, (DialogInterface.OnClickListener) null, new C48528a(z), false);
        if (z) {
            C115669n.INSTANCE.mo160131h(15191, 0, 0, 0, 0, 0, 0, 0, 1);
            return;
        }
        C115669n.INSTANCE.mo160131h(15191, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1);
    }

    /* renamed from: j */
    public static String m53914j(String str, String str2, int i) {
        if (i >= 0) {
            return str.replace("$" + str2 + "$", C75228t.m90277z(C75228t.m90268r(str2), i));
        }
        return str.replace("$" + str2 + "$", C75228t.m90268r(str2));
    }

    /* renamed from: k */
    public static void m53915k(String str, String str2, String str3, String str4) {
        Class cls = C75700k0.class;
        Log.m105925i("MicroMsg.HoneyPayUtil", "update msg: %s, %s", str, Boolean.valueOf(Util.isNullOrNil(str2)));
        if (!Util.isNullOrNil(str2) && !Util.isNullOrNil(str)) {
            String j = m53914j(str2, str3, 6);
            if (!Util.isNullOrNil(str4)) {
                j = m53914j(j, str4, 6);
            }
            C36922a aVar = new C36922a();
            aVar.field_payMsgId = str;
            ((C35356b) C86312j.m106911c(C35356b.class)).f94683d.mo59825a().get(aVar, new String[0]);
            long j2 = aVar.field_msgId;
            if (j2 > 0) {
                Log.m105925i("MicroMsg.HoneyPayUtil", "find msg: %s", Long.valueOf(j2));
                C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(aVar.field_msgId);
                if (b002.getMsgId() > 0) {
                    b002.mo108732L2(j);
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(b002.getMsgId(), b002);
                    return;
                }
                Log.m105929w("MicroMsg.HoneyPayUtil", "can't find msg: %s, may be deleted", Long.valueOf(aVar.field_msgId));
            }
        }
    }
}
