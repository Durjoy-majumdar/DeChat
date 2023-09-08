package com.tencent.p014mm.plugin.qqmail.p090ui;

import android.text.Editable;
import com.tencent.p014mm.plugin.qqmail.p090ui.ComposeUI;

/* renamed from: com.tencent.mm.plugin.qqmail.ui.c */
public class C70365c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ComposeUI.C70334v f203249d;

    public C70365c(ComposeUI.C70334v vVar) {
        this.f203249d = vVar;
    }

    public void run() {
        if (!ComposeUI.this.f203122i.f203197f.isFocused() && !ComposeUI.this.f203125o.f203197f.isFocused() && ComposeUI.this.f203122i.getMailAddrs().size() == 0 && ComposeUI.this.f203125o.getMailAddrs().size() == 0) {
            Editable text = ComposeUI.this.f203122i.f203197f.getText();
            boolean z = true;
            if (text == null || text.toString().length() <= 0) {
                Editable text2 = ComposeUI.this.f203125o.f203197f.getText();
                if (text2 != null && text2.toString().length() > 0) {
                    z = false;
                }
                if (z) {
                    ComposeUI.this.f203120g.setVisibility(0);
                    ComposeUI.this.f203121h.setVisibility(8);
                    ComposeUI.this.f203124n.setVisibility(8);
                }
            }
        }
    }
}
