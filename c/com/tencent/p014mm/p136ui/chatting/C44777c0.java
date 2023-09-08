package com.tencent.p014mm.p136ui.chatting;

import android.app.Activity;
import android.content.DialogInterface;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.pluginsdk.model.app.C44551e1;
import com.tencent.p014mm.pluginsdk.model.app.C44573l1;
import sw1.C48477m;

/* renamed from: com.tencent.mm.ui.chatting.c0 */
public class C44777c0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C68070l.C68072b f121528d;

    /* renamed from: e */
    public final /* synthetic */ String f121529e;

    /* renamed from: f */
    public final /* synthetic */ int f121530f;

    /* renamed from: g */
    public final /* synthetic */ C44851e0 f121531g;

    public C44777c0(C44851e0 e0Var, C68070l.C68072b bVar, String str, int i) {
        this.f121531g = e0Var;
        this.f121528d = bVar;
        this.f121529e = str;
        this.f121530f = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C44851e0.m49715a(this.f121531g, new C44551e1(2, new C44573l1(this.f121528d.f195562d, 0, "0")));
        C48477m a = C48477m.C13789a.m13091a();
        if (a != null) {
            Activity f = this.f121531g.f121692e.mo91565f();
            String str = this.f121529e;
            C68070l.C68072b bVar = this.f121528d;
            a.mo65666bX(f, str, bVar.f195562d, bVar.f195582i, this.f121530f, bVar.f195536V, 2);
        }
    }
}
