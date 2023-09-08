package com.tencent.p014mm.plugin.scanner.p101ui;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.scanner.C115674p;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import p159gw.C98250h;

/* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI$$s */
public class ScanTranslationCaptureUI$$s implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ScanTranslationCaptureUI f347097d;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI$$s$a */
    public class C115677a implements C98250h.C98251a {
        public C115677a() {
        }

        /* renamed from: a */
        public void mo2055a(String str, String str2) {
            ScanTranslationCaptureUI scanTranslationCaptureUI = ScanTranslationCaptureUI$$s.this.f347097d;
            C75026b.m89951a(scanTranslationCaptureUI, scanTranslationCaptureUI.getString(C0966R.string.ier));
        }

        /* renamed from: b */
        public void mo2056b(String str, String str2) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI$$s$b */
    public class C115678b implements C98250h.C98251a {
        public C115678b() {
        }

        /* renamed from: a */
        public void mo2055a(String str, String str2) {
            ScanTranslationCaptureUI scanTranslationCaptureUI = ScanTranslationCaptureUI$$s.this.f347097d;
            C75026b.m89951a(scanTranslationCaptureUI, scanTranslationCaptureUI.getString(C0966R.string.ier));
        }

        /* renamed from: b */
        public void mo2056b(String str, String str2) {
        }
    }

    public ScanTranslationCaptureUI$$s(ScanTranslationCaptureUI scanTranslationCaptureUI) {
        this.f347097d = scanTranslationCaptureUI;
    }

    public void onClick(View view) {
        Class cls = C98250h.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ScanTranslationCaptureUI scanTranslationCaptureUI = this.f347097d;
        int i = scanTranslationCaptureUI.f347050H;
        if (i == 2) {
            try {
                scanTranslationCaptureUI.f347056N.f343796l = 1;
                ScanTranslationCaptureUI scanTranslationCaptureUI2 = this.f347097d;
                ((C98250h) C86312j.m106911c(cls)).mo137346Zv(scanTranslationCaptureUI2, scanTranslationCaptureUI2.f347076w, new C115677a());
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ScanTranslationCaptureUI", e, "copy to gallery error", new Object[0]);
            }
        } else if (i == 3) {
            try {
                scanTranslationCaptureUI.f347056N.f343795k = 1;
                if (scanTranslationCaptureUI.f347054L == 0) {
                    try {
                        scanTranslationCaptureUI.f347077x = ((C115674p) C86312j.m106911c(C115674p.class)).Ax0("jpg");
                        ScanTranslationCaptureUI scanTranslationCaptureUI3 = this.f347097d;
                        BitmapUtil.saveBitmapToImage(scanTranslationCaptureUI3.f347075v, 80, Bitmap.CompressFormat.JPEG, scanTranslationCaptureUI3.f347077x, false);
                    } catch (IOException e2) {
                        Log.printErrStackTrace("MicroMsg.ScanTranslationCaptureUI", e2, "save translate result file error", new Object[0]);
                    }
                }
                ScanTranslationCaptureUI scanTranslationCaptureUI4 = this.f347097d;
                ((C98250h) C86312j.m106911c(cls)).mo137346Zv(scanTranslationCaptureUI4, scanTranslationCaptureUI4.f347077x, new C115678b());
            } catch (Exception e3) {
                Log.printErrStackTrace("MicroMsg.ScanTranslationCaptureUI", e3, "save to gallery error", new Object[0]);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
