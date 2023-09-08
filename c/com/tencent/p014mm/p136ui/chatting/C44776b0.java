package com.tencent.p014mm.p136ui.chatting;

import android.app.Activity;
import android.content.DialogInterface;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.pluginsdk.model.app.C44551e1;
import com.tencent.p014mm.pluginsdk.model.app.C44573l1;
import sw1.C48477m;

/* renamed from: com.tencent.mm.ui.chatting.b0 */
public class C44776b0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C68070l.C68072b f121524d;

    /* renamed from: e */
    public final /* synthetic */ String f121525e;

    /* renamed from: f */
    public final /* synthetic */ int f121526f;

    /* renamed from: g */
    public final /* synthetic */ C44851e0 f121527g;

    public C44776b0(C44851e0 e0Var, C68070l.C68072b bVar, String str, int i) {
        this.f121527g = e0Var;
        this.f121524d = bVar;
        this.f121525e = str;
        this.f121526f = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C44851e0.m49715a(this.f121527g, new C44551e1(2, new C44573l1(this.f121524d.f195562d, 0, "1")));
        C48477m a = C48477m.C13789a.m13091a();
        if (a != null) {
            Activity f = this.f121527g.f121692e.mo91565f();
            String str = this.f121525e;
            C68070l.C68072b bVar = this.f121524d;
            a.mo65666bX(f, str, bVar.f195562d, bVar.f195582i, this.f121526f, bVar.f195536V, 1);
        }
    }
}
