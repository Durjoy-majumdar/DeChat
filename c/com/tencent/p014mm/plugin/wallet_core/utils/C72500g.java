package com.tencent.p014mm.plugin.wallet_core.utils;

import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import hp3.C87581a;
import java.util.LinkedList;
import java.util.List;
import lp3.C46888b;
import lp3.C88643g;
import v53.C52767f;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.g */
public class C72500g implements C87581a<Object, List<Bankcard>> {

    /* renamed from: a */
    public final /* synthetic */ BankcardLogoHelper f210901a;

    public C72500g(BankcardLogoHelper bankcardLogoHelper) {
        this.f210901a = bankcardLogoHelper;
    }

    public Object call(Object obj) {
        List list = (List) obj;
        if (list == null || list.size() <= 0) {
            return null;
        }
        int size = list.size();
        this.f210901a.f210842d = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            Bankcard bankcard = (Bankcard) list.get(i);
            if (bankcard.mo99388n2()) {
                Log.m105924i("MicroMsg.BankcardLogoHelper", "ignore balance!!");
            } else {
                this.f210901a.f210842d.add(bankcard.field_bankcardType);
            }
        }
        if (this.f210901a.f210842d.size() <= 0) {
            return null;
        }
        Log.m105925i("MicroMsg.BankcardLogoHelper", "need fetch bank logo, %s", Integer.valueOf(this.f210901a.f210842d.size()));
        C46888b b = C88643g.m110544b();
        C52767f fVar = new C52767f(this.f210901a.f210842d);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(1650, new C72498f(this, b));
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(fVar);
        b.mo72092b();
        return null;
    }
}
