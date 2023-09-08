package com.tencent.p014mm.plugin.scanner.view;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import yk2.C112475a;

/* renamed from: com.tencent.mm.plugin.scanner.view.f */
public final class C106136f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ScanTranslationMaskView f316160d;

    public C106136f(ScanTranslationMaskView scanTranslationMaskView) {
        this.f316160d = scanTranslationMaskView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/scanner/view/ScanTranslationMaskView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105918d("MicroMsg.ScanTranslationMaskView", "alvinluo onCaptureBtn click");
        C112475a scanCamera = this.f316160d.getScanCamera();
        if (scanCamera != null) {
            scanCamera.mo158653o(this.f316160d);
        }
        this.f316160d.f316158y = (long) ((int) (System.currentTimeMillis() - this.f316160d.f316157x[0]));
        C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/view/ScanTranslationMaskView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
