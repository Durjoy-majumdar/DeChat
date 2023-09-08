package com.tencent.p014mm.plugin.qqmail.p090ui;

import ag2.C67038p;
import android.content.DialogInterface;
import com.tencent.p014mm.plugin.qqmail.p090ui.ComposeUI;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.qqmail.ui.b */
public class C70363b implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MailAddrsViewControl f203246d;

    /* renamed from: e */
    public final /* synthetic */ ComposeUI.C70329o f203247e;

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.b$a */
    public class C70364a implements Runnable {
        public C70364a() {
        }

        public void run() {
            ComposeUI composeUI = ComposeUI.this;
            List<C67038p> list = ComposeUI.f203091Q0;
            composeUI.mo96811J7();
            C70363b.this.f203246d.requestFocus();
            ComposeUI.this.showVKB();
        }
    }

    public C70363b(ComposeUI.C70329o oVar, MailAddrsViewControl mailAddrsViewControl) {
        this.f203247e = oVar;
        this.f203246d = mailAddrsViewControl;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ComposeUI.this.f203114X.postDelayed(new C70364a(), 150);
    }
}
