package com.tencent.p014mm.plugin.qqmail.p090ui;

import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.qqmail.p090ui.ComposeUI;
import com.tencent.p014mm.plugin.qqmail.p090ui.MailAddrsViewControl;

/* renamed from: com.tencent.mm.plugin.qqmail.ui.f */
public class C70376f implements View.OnFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ MailAddrsViewControl f203276d;

    public C70376f(MailAddrsViewControl mailAddrsViewControl) {
        this.f203276d = mailAddrsViewControl;
    }

    public void onFocusChange(View view, boolean z) {
        MailAddrsViewControl.C70355f fVar = this.f203276d.f203200i;
        if (fVar != null) {
            ComposeUI.C70334v vVar = (ComposeUI.C70334v) fVar;
            ComposeUI composeUI = ComposeUI.this;
            int i = 4;
            composeUI.f203119f.setVisibility(4);
            composeUI.f203123j.setVisibility(4);
            composeUI.f203126p.setVisibility(4);
            ComposeUI.this.getClass();
            ImageView imageView = vVar.f203168a;
            if (z) {
                i = 0;
            }
            imageView.setVisibility(i);
            int i2 = vVar.f203169b;
            if ((i2 == 1 || i2 == 2) && !z) {
                ComposeUI.this.f203120g.postDelayed(new C70365c(vVar), 10);
            }
        }
        String obj = this.f203276d.f203197f.getEditableText().toString();
        if (!z && obj.trim().length() > 0) {
            this.f203276d.mo96854e(obj, false);
        }
        View view2 = this.f203276d.f203202n;
        if (view2 != null && view2.isSelected()) {
            this.f203276d.f203202n.setSelected(z);
            this.f203276d.f203202n = null;
        }
        this.f203276d.mo96850a();
    }
}
