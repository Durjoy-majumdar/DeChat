package com.tencent.p014mm.plugin.scanner.p101ui;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI$$r */
public class ScanTranslationCaptureUI$$r implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ScanTranslationCaptureUI f347096d;

    public ScanTranslationCaptureUI$$r(ScanTranslationCaptureUI scanTranslationCaptureUI) {
        this.f347096d = scanTranslationCaptureUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ScanTranslationCaptureUI scanTranslationCaptureUI = this.f347096d;
        int i = scanTranslationCaptureUI.f347050H;
        if (i == 3) {
            Bitmap bitmap = scanTranslationCaptureUI.f347074u;
            if (bitmap != null) {
                scanTranslationCaptureUI.mo175949Q7(bitmap);
            }
            if (this.f347096d.f347051I.equalsIgnoreCase("zh_CN")) {
                this.f347096d.f347068o.setImageResource(C0966R.raw.translation_result_chinese_highlighted);
            } else {
                this.f347096d.f347068o.setImageResource(C0966R.raw.translation_result_english_highlighted);
            }
            ScanTranslationCaptureUI scanTranslationCaptureUI2 = this.f347096d;
            scanTranslationCaptureUI2.f347050H = 2;
            scanTranslationCaptureUI2.f347056N.f343794j++;
        } else if (i == 2) {
            Bitmap bitmap2 = scanTranslationCaptureUI.f347075v;
            if (bitmap2 != null) {
                scanTranslationCaptureUI.mo175949Q7(bitmap2);
            }
            if (this.f347096d.f347051I.equalsIgnoreCase("zh_CN")) {
                this.f347096d.f347068o.setImageResource(C0966R.C0969drawable.ayn);
            } else {
                this.f347096d.f347068o.setImageResource(C0966R.C0969drawable.ayp);
            }
            this.f347096d.f347050H = 3;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
