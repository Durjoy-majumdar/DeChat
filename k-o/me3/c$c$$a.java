package me3;

import com.tencent.p014mm.p136ui.MMActivity;
import me3.C109612c;

public final /* synthetic */ class c$c$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C109612c.C109616c f328191d;

    public /* synthetic */ c$c$$a(C109612c.C109616c cVar) {
        this.f328191d = cVar;
    }

    public final void run() {
        C109612c.C109616c cVar = this.f328191d;
        C109612c.this.f328158a.getTextEditView().requestFocus();
        ((MMActivity) C109612c.this.mo160819c()).showVKB();
    }
}
