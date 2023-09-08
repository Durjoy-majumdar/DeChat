package p281yz;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.opensdk.modelpay.PayReq;
import com.tencent.p014mm.opensdk.modelpay.PayResp;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_index.p127ui.C72563f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.wallet_core.p137ui.C75226r;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f32.C45746f;
import f32.C75675d;
import f40.C86709a0;
import f62.C75700k0;
import he0.C76158j;
import java.util.HashMap;
import java.util.regex.Pattern;
import lc3.C10485b;
import oi2.C77010f;
import p02.C35356b;
import p239sv.C77792p;
import p287zz.C79445i;
import re0.C36313j;
import t02.C36922a;
import vi2.C78418c;

@C86522b(dependencies = {C79171t.class})
/* renamed from: yz.z */
public class C79182z extends C86301e implements C79445i {
    /* renamed from: At */
    public boolean mo109179At(Context context, String str, PayResp payResp, PayReq.Options options) {
        return C72563f.m84919a(context, str, payResp, options);
    }

    public void Bg0(int i, String str) {
        C75675d.m90931a(i, str);
    }

    public boolean Cp0(String str) {
        return C69242l1.m81609o(str);
    }

    /* renamed from: Ep */
    public Typeface mo109182Ep(Context context, int i) {
        return C75228t.m90274w(context, i);
    }

    /* renamed from: JQ */
    public String mo109183JQ(String str, String str2) {
        Pattern pattern = C75228t.f221346a;
        if (!C72996z1.m85843n5(str2)) {
            return str;
        }
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str2);
        String wo = ((C76158j) C86312j.m106911c(C76158j.class)).mo106373wo(z1Var.mo73980x2(), z1Var.mo73976t2());
        return Util.isNullOrNil(wo) ? str : wo;
    }

    /* renamed from: Ld */
    public void mo109184Ld(String str, String str2, String str3, String str4, int i, int i2) {
        C75675d.f222275a = str;
        C75675d.f222276b = str3;
        C75675d.f222277c = str4;
        C75675d.f222278d = i;
        C75675d.f222279e = i2;
        C75675d.f222280f = str2;
        Log.m105925i("MicroMsg.LuckyMoneyEnvelopeExposureReport", "setData：openId %s, coverId: %s bizName:%s", str, str4, str2);
    }

    /* renamed from: MR */
    public boolean mo109185MR(String str) {
        Pattern pattern = C75228t.f221346a;
        long Lo = ((C36313j) ((C77792p) C86312j.m106911c(C77792p.class)).T20()).mo60611Lo(str);
        Log.m105925i("MicroMsg.WalletBaseUtil ", "showUnionTransferSessionEntry:%d", Long.valueOf(Lo));
        return (Lo & 8) > 0;
    }

    /* renamed from: Tp */
    public void mo109186Tp(String str, String str2, String str3, String str4, int i, int i2, int i3, String str5) {
        if (!Util.isNullOrNil(str) && !Util.isNullOrNil(str4)) {
            C115669n.INSTANCE.mo160131h(16598, Integer.valueOf(i3), str2, str5, str3, str4, 0, str, Integer.valueOf(i), Integer.valueOf(i2), 0);
            Log.m105925i("MicroMsg.LuckyMoneyEnvelopeExposureReport", "doReportForBubble reportData：openId %s, coverId: %s  bizName:%s url:%s actionType :%s clickJumpType：%s", str, str4, str2, str5, Integer.valueOf(i3), 0);
        }
    }

    /* renamed from: WD */
    public int mo109187WD() {
        Pattern pattern = C75228t.f221346a;
        int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("OpenIMC2BPayTransferMeueGrayscaleStatus", 0);
        Log.m105925i("MicroMsg.WalletBaseUtil ", "getUnionTransferGrayscaleStatus:%d", Integer.valueOf(b));
        return b;
    }

    /* renamed from: ae */
    public boolean mo109188ae() {
        return C69242l1.m81607m();
    }

    /* renamed from: gd */
    public long mo109189gd(String str) {
        C78418c jo = C77010f.vx0().yx0().mo108369jo(str);
        if (jo == null) {
            return -1;
        }
        long j = jo.field_locaMsgId;
        if (j > 0) {
            return j;
        }
        return -1;
    }

    public String l50(String str, String str2) {
        String str3;
        Pattern pattern = C75228t.f221346a;
        if (!C72996z1.m85843n5(str2)) {
            return str;
        }
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str2);
        String wo = ((C76158j) C86312j.m106911c(C76158j.class)).mo106373wo(z1Var.mo73980x2(), z1Var.mo73976t2());
        if (Util.isNullOrNil(wo)) {
            str3 = "";
        } else {
            str3 = "@" + wo;
        }
        return str + str3;
    }

    /* renamed from: mN */
    public void mo109191mN(int i, int i2, String str, String str2) {
        C75226r.m90204d(i, i2, str, str2);
    }

    /* renamed from: mo */
    public int mo109192mo(String str, String str2) {
        Pattern pattern = C75228t.f221346a;
        if (C85875k4.m106211z() && !Util.isNullOrNil(str2)) {
            str = str2;
        }
        if (Util.isNullOrNil(str)) {
            return -1;
        }
        if (str.contains("#")) {
            return Color.parseColor(str);
        }
        long j = Util.getLong(str, -1);
        if (j < 0) {
            return -1;
        }
        return Color.parseColor(String.format("#%08x", new Object[]{Long.valueOf(j)}));
    }

    /* renamed from: nu */
    public long mo109193nu(String str) {
        C36922a aVar = new C36922a();
        aVar.field_payMsgId = str;
        ((C35356b) C86312j.m106911c(C35356b.class)).f94683d.mo59825a().get(aVar, new String[0]);
        return aVar.field_msgId;
    }

    /* renamed from: oB */
    public void mo109194oB(StringBuilder sb, IEmojiInfo iEmojiInfo, int i) {
        C45746f.m51029a(sb, iEmojiInfo, i);
    }

    /* renamed from: vJ */
    public String mo109195vJ(String str, int i) {
        return C75228t.m90267q0(str, i);
    }

    /* renamed from: yg */
    public void mo109196yg(String str, Long l) {
        HashMap<String, Long> hashMap = C69242l1.f199264a;
        synchronized (C69242l1.class) {
            try {
                C69242l1.f199264a.put(str, l);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.LuckyMoneyUtil", e, "", new Object[0]);
            }
        }
    }
}
