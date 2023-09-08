package com.tencent.p014mm.plugin.mall.p075ui;

import b63.C67197o;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import ob0.C89132b;
import s52.C48227a;
import te3.C51668va;
import te3.C51676vb3;

/* renamed from: com.tencent.mm.plugin.mall.ui.f */
public class C42559f implements C87581a<Object, C89132b.C89134c<C51668va>> {

    /* renamed from: a */
    public final /* synthetic */ C48227a f115160a;

    /* renamed from: b */
    public final /* synthetic */ MallFunctionSettingsUI f115161b;

    public C42559f(MallFunctionSettingsUI mallFunctionSettingsUI, C48227a aVar) {
        this.f115161b = mallFunctionSettingsUI;
        this.f115160a = aVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.MallFunctionSettingsUI", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b), cVar.f256795c);
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            Log.m105925i("MicroMsg.MallFunctionSettingsUI", "retcode: %s, retmsg: %s", Integer.valueOf(((C51668va) cVar.f256796d).f143404d), ((C51668va) cVar.f256796d).f143405e);
            if (((C51668va) cVar.f256796d).f143404d == 0) {
                return null;
            }
            for (C51676vb3 next : this.f115160a.f129217p) {
                next.f143418e = next.f143418e == 0 ? 1 : 0;
            }
            this.f115161b.f115105h.notifyDataSetChanged();
            C51668va vaVar = (C51668va) cVar.f256796d;
            C67197o.m79488c(vaVar.f143404d, vaVar.f143405e).mo91297a(this.f115161b.getContext(), true);
            return null;
        }
        for (C51676vb3 next2 : this.f115160a.f129217p) {
            next2.f143418e = next2.f143418e == 0 ? 1 : 0;
        }
        this.f115161b.f115105h.notifyDataSetChanged();
        C67197o.m79487b(cVar.f256794b, cVar.f256793a).mo91297a(this.f115161b.getContext(), true);
        return null;
    }
}
