package com.tencent.p014mm.plugin.scanner.p101ui;

import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.OCRTranslateReportStruct;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI$$p */
public class ScanTranslationCaptureUI$$p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ScanTranslationCaptureUI f347095d;

    public ScanTranslationCaptureUI$$p(ScanTranslationCaptureUI scanTranslationCaptureUI) {
        this.f347095d = scanTranslationCaptureUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ScanTranslationCaptureUI scanTranslationCaptureUI = this.f347095d;
        scanTranslationCaptureUI.f347062f.mo158653o(scanTranslationCaptureUI);
        OCRTranslateReportStruct oCRTranslateReportStruct = this.f347095d.f347056N;
        long currentTimeMillis = System.currentTimeMillis();
        ScanTranslationCaptureUI scanTranslationCaptureUI2 = this.f347095d;
        oCRTranslateReportStruct.f343789e = (long) ((int) (currentTimeMillis - scanTranslationCaptureUI2.f347057P[0]));
        scanTranslationCaptureUI2.f347056N.f343788d = 1;
        C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
