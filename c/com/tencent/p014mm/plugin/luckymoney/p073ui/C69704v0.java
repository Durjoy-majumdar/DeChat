package com.tencent.p014mm.plugin.luckymoney.p073ui;

import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyHistoryEnvelopeUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import hp3.C87581a;
import java.util.Iterator;
import jq3.C9493c;
import ob0.C89132b;
import qo3.C89779i0;
import te3.C51758vz;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.v0 */
public class C69704v0 implements C87581a<Object, C89132b.C89134c<C51758vz>> {

    /* renamed from: a */
    public final /* synthetic */ C89779i0 f201117a;

    /* renamed from: b */
    public final /* synthetic */ String f201118b;

    /* renamed from: c */
    public final /* synthetic */ LuckyMoneyHistoryEnvelopeUI f201119c;

    public C69704v0(LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI, C89779i0 i0Var, String str) {
        this.f201119c = luckyMoneyHistoryEnvelopeUI;
        this.f201117a = i0Var;
        this.f201118b = str;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        int i = 0;
        Log.m105925i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "do confirm errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        if (this.f201119c.isDestroyed() || this.f201119c.isFinishing()) {
            return null;
        }
        C89779i0 i0Var = this.f201117a;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            Log.m105925i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "retcode: %s", Integer.valueOf(((C51758vz) cVar.f256796d).f143780d));
            C51758vz vzVar = (C51758vz) cVar.f256796d;
            if (vzVar.f143780d == 0) {
                LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI = this.f201119c;
                String str = this.f201118b;
                Iterator<C9493c> it = luckyMoneyHistoryEnvelopeUI.f199984w.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    C9493c next = it.next();
                    if ((next instanceof LuckyMoneyHistoryEnvelopeUI.C69407i) && ((LuckyMoneyHistoryEnvelopeUI.C69407i) next).f200000d.f228202f.equals(str)) {
                        luckyMoneyHistoryEnvelopeUI.f199984w.remove(next);
                        break;
                    }
                    i++;
                }
                if (i < 0) {
                    return null;
                }
                this.f201119c.f199983v.notifyItemRemoved(i);
                return null;
            } else if (Util.isNullOrNil(vzVar.f143781e)) {
                return null;
            } else {
                C75228t.m90211D(this.f201119c.getContext(), ((C51758vz) cVar.f256796d).f143781e);
                return null;
            }
        } else {
            C75228t.m90209B(this.f201119c.getContext(), cVar.f256795c);
            return null;
        }
    }
}
