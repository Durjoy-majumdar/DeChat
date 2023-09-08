package com.tencent.p014mm.plugin.dbbackup;

import a70.C112760b;
import android.content.Context;
import com.tencent.p014mm.vfs.C86013q1;
import qo3.C89779i0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.dbbackup.b$$a */
public final /* synthetic */ class b$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f248138d;

    /* renamed from: e */
    public final /* synthetic */ C89779i0 f248139e;

    /* renamed from: f */
    public final /* synthetic */ Context f248140f;

    public /* synthetic */ b$$a(String str, C89779i0 i0Var, Context context) {
        this.f248138d = str;
        this.f248139e = i0Var;
        this.f248140f = context;
    }

    public final void run() {
        String str = this.f248138d;
        C89779i0 i0Var = this.f248139e;
        Context context = this.f248140f;
        C86013q1.m106461v(C112760b.m154228e0() + "/MicroMsg");
        String s = C86013q1.m106458s(str);
        C86013q1.m106439U(s, C112760b.m154228e0() + "/MicroMsg/corrupted.zip");
        ((C119157j) C119157j.f356862d).mo183895z(new b$$j(i0Var, context));
    }
}
