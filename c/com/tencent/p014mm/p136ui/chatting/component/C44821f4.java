package com.tencent.p014mm.p136ui.chatting.component;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import ke3.C88144b;
import ob0.C89132b;
import te3.C49598gr;

/* renamed from: com.tencent.mm.ui.chatting.component.f4 */
public class C44821f4 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C89132b.C89134c f121637d;

    /* renamed from: e */
    public final /* synthetic */ C44822g4 f121638e;

    public C44821f4(C44822g4 g4Var, C89132b.C89134c cVar) {
        this.f121638e = g4Var;
        this.f121637d = cVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Activity f = this.f121638e.f121640b.f215752d.mo91565f();
        String str = ((C49598gr) this.f121637d.f256796d).f134206g.f130959f;
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", true);
        intent.putExtra("allow_mix_content_mode", false);
        C88144b.m109791i(f, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
    }
}
