package b63;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p281yz.C79173v;

/* renamed from: b63.h0 */
public class C67188h0 {
    /* renamed from: a */
    public static ArrayList<Bankcard> m79466a(boolean z) {
        Class cls = C79173v.class;
        Log.m105925i("MicroMsg.WalletPayOrderMgr", "sort bankcard isPos: %s", Boolean.valueOf(z));
        ArrayList<Bankcard> c = z ? ((C79173v) C86312j.m106911c(cls)).Ex0().mo91321c(true) : ((C79173v) C86312j.m106911c(cls)).Ex0().mo91319a(true);
        C67205s0 Ex0 = ((C79173v) C86312j.m106911c(cls)).Ex0();
        List<C67180c> list = Ex0.f192959l;
        List<C67180c> list2 = (list == null || list.size() <= 0) ? null : Ex0.f192959l;
        if (list2 == null) {
            Log.m105928w("MicroMsg.WalletPayOrderMgr", "empty bankinfo list");
            return c;
        }
        ArrayList<Bankcard> arrayList = new ArrayList<>();
        for (C67180c next : list2) {
            Iterator<Bankcard> it = c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Bankcard next2 = it.next();
                if (next2.field_bindSerial.equals(next.f192867a)) {
                    c.remove(next2);
                    arrayList.add(next2);
                    break;
                }
            }
        }
        if (!c.isEmpty()) {
            Log.m105928w("MicroMsg.WalletPayOrderMgr", "has unsort bankcard");
            arrayList.addAll(c);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static boolean m79467b(Bankcard bankcard) {
        if (bankcard == null) {
            Log.m105924i("MicroMsg.WalletPayOrderMgr", "canSetAsOfflinePayDefaultCard bankcard is null");
            return false;
        }
        int i = bankcard.field_defaultCardState;
        if (!bankcard.mo99391q2()) {
            return i != 1;
        }
        Log.m105924i("MicroMsg.WalletPayOrderMgr", "canSetAsOfflinePayDefaultCard bankcard is fqf");
        return i == 2;
    }

    /* renamed from: c */
    public static Bankcard m79468c(boolean z) {
        Class cls = C79173v.class;
        ((C79173v) C86312j.m106911c(cls)).Ex0().getClass();
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(196633, (Object) null);
        Log.m105925i("MicroMsg.WalletPayOrderMgr", " defaultLocalOfflineBankcard：%s，needJudgeDefaultCardState：%s", str, Boolean.valueOf(z));
        ArrayList<Bankcard> b = ((C79173v) C86312j.m106911c(cls)).Ex0().mo91320b(true);
        if (b == null) {
            b = ((C79173v) C86312j.m106911c(cls)).Ex0().mo91319a(true);
        }
        Log.m105924i("MicroMsg.WalletPayOrderMgr", "way1：getLastBankcard");
        int i = 0;
        while (!TextUtils.isEmpty(str) && i < b.size()) {
            Bankcard bankcard = b.get(i);
            if (bankcard != null) {
                Log.m105925i("MicroMsg.WalletPayOrderMgr", "compared bankcard: %s status：%s", bankcard.field_bindSerial, Integer.valueOf(bankcard.field_defaultCardState));
            }
            if (bankcard != null && str.equals(bankcard.field_bindSerial)) {
                Log.m105925i("MicroMsg.WalletPayOrderMgr", "find bindSerial:%s，micropay: %s, forbidword: %s，defaultCardState：%s", bankcard.field_bindSerial, Boolean.valueOf(bankcard.field_support_micropay), bankcard.field_forbidWord, Integer.valueOf(bankcard.field_defaultCardState));
                boolean b2 = m79467b(bankcard);
                if (!bankcard.field_support_micropay) {
                    continue;
                } else if (!z) {
                    Log.m105924i("MicroMsg.WalletPayOrderMgr", " final get LastBankcard");
                    return bankcard;
                } else if (b2) {
                    Log.m105924i("MicroMsg.WalletPayOrderMgr", " final get LastBankcard（needJudgeDefaultCardState）");
                    return bankcard;
                }
            }
            i++;
        }
        Log.m105924i("MicroMsg.WalletPayOrderMgr", "clear default bindserial");
        ((C79173v) C86312j.m106911c(cls)).Ex0().mo91315E("");
        Log.m105924i("MicroMsg.WalletPayOrderMgr", "way2：mainBankcard");
        ((C79173v) C86312j.m106911c(cls)).Ex0().getClass();
        Bankcard k = ((C79173v) C86312j.m106911c(cls)).Ex0().mo91329k((ArrayList<Bankcard>) null, (String) null, true, true);
        if (k == null) {
            Log.m105920e("MicroMsg.WalletUserInfoManger", "defaultBankcards == null");
        }
        if (k != null && Util.isNullOrNil(k.field_forbidWord)) {
            Log.m105925i("MicroMsg.WalletPayOrderMgr", "mainBankcard bindSerial：%s, type：%s，defaultCardState：%s", k.field_bindSerial, k.field_bankcardType, Integer.valueOf(k.field_defaultCardState));
            boolean b3 = m79467b(k);
            if (!z) {
                Log.m105924i("MicroMsg.WalletPayOrderMgr", "final get mainBankcard");
                return k;
            } else if (b3) {
                Log.m105924i("MicroMsg.WalletPayOrderMgr", " final get mainBankcard（needJudgeDefaultCardState）");
                return k;
            }
        }
        Log.m105924i("MicroMsg.WalletPayOrderMgr", "way3：get balance");
        Bankcard bankcard2 = ((C79173v) C86312j.m106911c(cls)).Ex0().f192955h;
        if (bankcard2 != null && bankcard2.field_support_micropay) {
            Log.m105925i("MicroMsg.WalletPayOrderMgr", "get balance：%s，type：%s，defaultCardState：%s", bankcard2.field_bindSerial, bankcard2.field_bankcardType, Integer.valueOf(bankcard2.field_defaultCardState));
            boolean b4 = m79467b(bankcard2);
            if (!z) {
                Log.m105924i("MicroMsg.WalletPayOrderMgr", " final get balance");
                return bankcard2;
            } else if (b4) {
                Log.m105924i("MicroMsg.WalletPayOrderMgr", " final get balance（needJudgeDefaultCardState）");
                return bankcard2;
            }
        }
        Log.m105924i("MicroMsg.WalletPayOrderMgr", "way4：get first card");
        for (int i2 = 0; i2 < b.size(); i2++) {
            Bankcard bankcard3 = b.get(i2);
            if (bankcard3 != null && bankcard3.field_support_micropay && !bankcard3.mo99388n2()) {
                Log.m105925i("MicroMsg.WalletPayOrderMgr", "get first card:%s，type：%s，defaultCardState：%s", bankcard3.field_bindSerial, bankcard3.field_bankcardType, Integer.valueOf(bankcard3.field_defaultCardState));
                boolean b5 = m79467b(bankcard3);
                if (!z) {
                    Log.m105924i("MicroMsg.WalletPayOrderMgr", " final get first card");
                    return bankcard3;
                } else if (b5) {
                    Log.m105924i("MicroMsg.WalletPayOrderMgr", " final get first card（needJudgeDefaultCardState）");
                    return bankcard3;
                }
            }
        }
        Log.m105924i("MicroMsg.WalletPayOrderMgr", "way5：get lqt ");
        Bankcard bankcard4 = ((C79173v) C86312j.m106911c(cls)).Ex0().f192960m;
        if (bankcard4 != null && bankcard4.field_support_micropay && Util.isNullOrNil(bankcard4.field_forbidWord)) {
            Log.m105925i("MicroMsg.WalletPayOrderMgr", " get lqt : %s，type：%s，defaultCardState：%s", Integer.valueOf(bankcard4.field_defaultCardState), bankcard4.field_bankcardType, Integer.valueOf(bankcard4.field_defaultCardState));
            boolean b6 = m79467b(bankcard4);
            if (!z) {
                Log.m105924i("MicroMsg.WalletPayOrderMgr", " final get lqt");
                return bankcard4;
            } else if (b6) {
                Log.m105924i("MicroMsg.WalletPayOrderMgr", " final get lqt（needJudgeDefaultCardState）");
                return bankcard4;
            }
        }
        if (z) {
            Log.m105924i("MicroMsg.WalletPayOrderMgr", "final way");
            int i3 = 0;
            while (i3 < b.size()) {
                Bankcard bankcard5 = b.get(i3);
                if (bankcard5 == null || !bankcard5.field_support_micropay) {
                    i3++;
                } else {
                    Log.m105925i("MicroMsg.WalletPayOrderMgr", "final get card：%s，type：%s", bankcard5.field_bindSerial, bankcard5.field_bankcardType);
                    return bankcard5;
                }
            }
        }
        Log.m105924i("MicroMsg.WalletPayOrderMgr", " do not get any card");
        return null;
    }
}
