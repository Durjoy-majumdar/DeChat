package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.Intent;
import android.view.View;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p140cw.C7138g;

/* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI$$q */
public class ScanTranslationCaptureUI$$q implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ScanTranslationCaptureUI f248931d;

    public ScanTranslationCaptureUI$$q(ScanTranslationCaptureUI scanTranslationCaptureUI) {
        this.f248931d = scanTranslationCaptureUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((C7138g) C86312j.m106911c(C7138g.class)).mo8324nq(this.f248931d, 561, 1, 0, 1, false, (Intent) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
