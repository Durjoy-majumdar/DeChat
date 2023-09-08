package com.tencent.p014mm.p136ui.chatting.component;

import android.content.DialogInterface;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import he0.C46024k;
import hp3.C87581a;
import nj3.C76879j;
import ob0.C89132b;
import qo3.C101218e0;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.ui.chatting.component.q3 */
public final class C44836q3<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C89779i0 f121666a;

    /* renamed from: b */
    public final /* synthetic */ String f121667b;

    /* renamed from: c */
    public final /* synthetic */ OpenIMArchiveComponent f121668c;

    public C44836q3(C89779i0 i0Var, String str, OpenIMArchiveComponent openIMArchiveComponent) {
        this.f121666a = i0Var;
        this.f121667b = str;
        this.f121668c = openIMArchiveComponent;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        C89779i0 i0Var = this.f121666a;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        boolean z = false;
        Log.m105925i("MicroMsg.OpenIMArchiveComponent", "doubleBtnClick callback errType:%s, errCode:%s, reqTalkerName:%s rsp:%s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b), this.f121667b, cVar.f256796d);
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C101218e0 e0Var = this.f121668c.f121543f;
            if (e0Var != null) {
                e0Var.mo140680z();
            }
            ((C46024k) C86312j.m106911c(C46024k.class)).mo58604ma(this.f121667b);
        } else {
            String str = cVar.f256795c;
            if (str == null || str.length() == 0) {
                z = true;
            }
            if (!z) {
                C67391b bVar = this.f121668c.f215752d;
                C76879j.m92754y(bVar != null ? bVar.mo91565f() : null, cVar.f256795c, "", this.f121668c.f215752d.mo91565f().getString(C0966R.string.a18), (DialogInterface.OnClickListener) null);
            }
        }
        return C13598b0.f38549a;
    }
}
