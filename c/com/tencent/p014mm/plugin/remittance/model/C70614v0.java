package com.tencent.p014mm.plugin.remittance.model;

import android.text.TextUtils;
import com.tencent.p014mm.message.C40339m;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.pluginsdk.model.app.C96776s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import oi2.C77010f;
import p206nj.C76861g;
import p680ru.C77569h;
import p763ym.C53543s;
import vi2.C78418c;

/* renamed from: com.tencent.mm.plugin.remittance.model.v0 */
public class C70614v0 {

    /* renamed from: a */
    public Object f204299a = new Object();

    /* renamed from: b */
    public HashMap<String, String> f204300b = new HashMap<>();

    /* renamed from: a */
    public void mo97259a(String str) {
        List<String> b = mo97260b();
        ArrayList arrayList = (ArrayList) b;
        arrayList.add(str);
        if (arrayList.size() > 50) {
            b = arrayList.subList(arrayList.size() - 50, arrayList.size());
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String append : b) {
            sb.append(append);
            if (i != b.size() - 1) {
                sb.append(",");
            }
            i++;
        }
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_REMITTANCE_PAYMSGID_STRING_SYNC, sb.toString());
    }

    /* renamed from: b */
    public final List<String> mo97260b() {
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REMITTANCE_PAYMSGID_STRING_SYNC, "");
        ArrayList arrayList = new ArrayList();
        if (!Util.isNullOrNil(str)) {
            String[] split = str.split(",");
            if (split.length > 0) {
                arrayList.addAll(Arrays.asList(split));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public boolean mo97261c(String str, String str2, String str3, String str4) {
        boolean z;
        boolean z2;
        Class cls = C77569h.class;
        Class cls2 = C53543s.class;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str)) {
            Log.m105920e("MicroMsg.RemittanceLocalMsgMgr", "msgxml or toUserName or antiRepeatid is null");
            return false;
        }
        synchronized (this) {
            if (!(Util.isNullOrNil(str) ? false : ((ArrayList) mo97260b()).contains(str))) {
                mo97259a(str);
                z = true;
            } else {
                Log.m105924i("MicroMsg.RemittanceLocalMsgMgr", "it is a duplicate msg");
                z = false;
            }
        }
        if (!z) {
            return false;
        }
        C72963f4 f4Var = new C72963f4();
        f4Var.mo108732L2(str2);
        f4Var.mo100991d(2);
        f4Var.mo108749c3(str3);
        f4Var.mo108733M2(C75604z3.m90843o(str3));
        f4Var.mo108740T2(1);
        f4Var.setType(419430449);
        long my02 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).my0(f4Var);
        if (my02 < 0) {
            Log.m105920e("MicroMsg.RemittanceLocalMsgMgr", C76861g.m92660c() + "insert msg failed :" + my02);
            ArrayList arrayList = (ArrayList) mo97260b();
            arrayList.remove(str);
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                sb.append((String) it.next());
                if (i != arrayList.size() - 1) {
                    sb.append(",");
                }
                i++;
            }
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_REMITTANCE_PAYMSGID_STRING_SYNC, sb.toString());
            return false;
        }
        f4Var.setMsgId(my02);
        if (f4Var.mo101020w3()) {
            ((C77569h) C86312j.m106911c(cls)).mo35239e8(f4Var, C40339m.m43520a(f4Var));
        } else {
            ((C77569h) C86312j.m106911c(cls)).mo35228B1(f4Var);
        }
        C68070l lVar = new C68070l();
        lVar.field_xml = f4Var.getContent();
        String processXml = Util.processXml(str2);
        C68070l.C68072b bVar = null;
        if (!(processXml == null || (bVar = C68070l.C68072b.m80422u(processXml, f4Var.mo108775z2())) == null)) {
            lVar.field_title = bVar.f195570f;
            lVar.field_description = bVar.f195574g;
        }
        lVar.field_type = 2000;
        lVar.field_msgId = my02;
        C68070l a0 = ((C96776s) ((C53543s) C86312j.m106911c(cls2)).mo74023HM()).mo135038a0(my02);
        if (a0 == null || a0.field_msgId != my02) {
            z2 = ((C96776s) ((C53543s) C86312j.m106911c(cls2)).mo74023HM()).mo135039jo(lVar);
            if (!z2) {
                Log.m105920e("MicroMsg.RemittanceLocalMsgMgr", "PinOpenApi.getAppMessageStorage().insert msg failed id:" + my02);
            }
        } else {
            z2 = ((C96776s) ((C53543s) C86312j.m106911c(cls2)).mo74023HM()).mo135037Lo(lVar, new String[0]);
        }
        if (bVar != null) {
            C78418c cVar = new C78418c();
            cVar.field_locaMsgId = f4Var.getMsgId();
            cVar.field_transferId = bVar.f195501J0;
            cVar.field_receiveStatus = -1;
            cVar.field_isSend = true;
            cVar.field_talker = str3;
            cVar.field_receiverName = str4;
            C77010f.vx0().yx0().replace(cVar);
        }
        return z2;
    }

    /* renamed from: d */
    public boolean mo97262d(String str, String str2, String str3) {
        String str4 = this.f204300b.get(str);
        if (!Util.isNullOrNil(str4)) {
            return mo97261c(str, str4, str2, str3);
        }
        Log.m105929w("MicroMsg.RemittanceLocalMsgMgr", "empty transid: %s", str);
        return false;
    }

    /* renamed from: e */
    public boolean mo97263e(String str, String str2, long j) {
        C72963f4 f4Var = new C72963f4();
        f4Var.mo108740T2(0);
        f4Var.mo100991d(6);
        f4Var.mo108749c3(str);
        f4Var.mo108732L2(str2);
        if (j > 0) {
            f4Var.mo108733M2(j);
        } else {
            f4Var.mo108733M2(C75604z3.m90843o(str));
        }
        f4Var.setType(10000);
        long my02 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).my0(f4Var);
        Log.m105924i("MicroMsg.RemittanceLocalMsgMgr", "sendLocalSysMsg msgId:" + my02);
        return my02 >= 0;
    }
}
