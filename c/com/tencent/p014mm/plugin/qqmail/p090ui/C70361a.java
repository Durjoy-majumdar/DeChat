package com.tencent.p014mm.plugin.qqmail.p090ui;

import ag2.C67038p;
import android.content.DialogInterface;
import com.tencent.p014mm.plugin.qqmail.p090ui.ComposeUI;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.qqmail.ui.a */
public class C70361a implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MailAddrsViewControl f203243d;

    /* renamed from: e */
    public final /* synthetic */ ComposeUI.C70329o f203244e;

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.a$a */
    public class C70362a implements Runnable {
        public C70362a() {
        }

        public void run() {
            ComposeUI composeUI = ComposeUI.this;
            List<C67038p> list = ComposeUI.f203091Q0;
            composeUI.mo96811J7();
            C70361a.this.f203243d.requestFocus();
            ComposeUI.this.showVKB();
        }
    }

    public C70361a(ComposeUI.C70329o oVar, MailAddrsViewControl mailAddrsViewControl) {
        this.f203244e = oVar;
        this.f203243d = mailAddrsViewControl;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f203243d.f203197f.setText("");
        ComposeUI.this.f203114X.postDelayed(new C70362a(), 150);
    }
}
