package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.OCRTranslateReportStruct;
import com.tencent.p014mm.plugin.scanner.model.C115672t;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import gy3.C87412m;
import nj3.C76879j;
import vl2.C118679t;

/* renamed from: com.tencent.mm.plugin.scanner.ui.p */
public final class C115693p implements C118679t.C118681b {

    /* renamed from: a */
    public final /* synthetic */ ScanTranslationResultUI f347144a;

    /* renamed from: b */
    public final /* synthetic */ String f347145b;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.p$a */
    public static final class C115694a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ScanTranslationResultUI f347146d;

        /* renamed from: com.tencent.mm.plugin.scanner.ui.p$a$a */
        public static final class C115695a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ ScanTranslationResultUI f347147d;

            public C115695a(ScanTranslationResultUI scanTranslationResultUI) {
                this.f347147d = scanTranslationResultUI;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                ScanTranslationResultUI scanTranslationResultUI = this.f347147d;
                int i2 = ScanTranslationResultUI.f347102E;
                scanTranslationResultUI.mo175975I7();
            }
        }

        public C115694a(ScanTranslationResultUI scanTranslationResultUI) {
            this.f347146d = scanTranslationResultUI;
        }

        public final void run() {
            ScanTranslationResultUI scanTranslationResultUI = this.f347146d;
            int i = ScanTranslationResultUI.f347102E;
            scanTranslationResultUI.mo175979M7();
            C76879j.m92749t(this.f347146d.getContext(), this.f347146d.getResources().getString(C0966R.string.ien), this.f347146d.getResources().getString(C0966R.string.a3h), new C115695a(this.f347146d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.p$b */
    public static final class C115696b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ScanTranslationResultUI f347148d;

        /* renamed from: com.tencent.mm.plugin.scanner.ui.p$b$a */
        public static final class C115697a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ ScanTranslationResultUI f347149d;

            public C115697a(ScanTranslationResultUI scanTranslationResultUI) {
                this.f347149d = scanTranslationResultUI;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                ScanTranslationResultUI scanTranslationResultUI = this.f347149d;
                int i2 = ScanTranslationResultUI.f347102E;
                scanTranslationResultUI.mo175975I7();
            }
        }

        public C115696b(ScanTranslationResultUI scanTranslationResultUI) {
            this.f347148d = scanTranslationResultUI;
        }

        public final void run() {
            ScanTranslationResultUI scanTranslationResultUI = this.f347148d;
            int i = ScanTranslationResultUI.f347102E;
            scanTranslationResultUI.mo175979M7();
            C76879j.m92749t(this.f347148d.getContext(), this.f347148d.getResources().getString(C0966R.string.cul), this.f347148d.getResources().getString(C0966R.string.a3h), new C115697a(this.f347148d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.p$c */
    public static final class C115698c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ScanTranslationResultUI f347150d;

        /* renamed from: com.tencent.mm.plugin.scanner.ui.p$c$a */
        public static final class C115699a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ ScanTranslationResultUI f347151d;

            public C115699a(ScanTranslationResultUI scanTranslationResultUI) {
                this.f347151d = scanTranslationResultUI;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                ScanTranslationResultUI scanTranslationResultUI = this.f347151d;
                int i2 = ScanTranslationResultUI.f347102E;
                scanTranslationResultUI.mo175975I7();
            }
        }

        public C115698c(ScanTranslationResultUI scanTranslationResultUI) {
            this.f347150d = scanTranslationResultUI;
        }

        public final void run() {
            ScanTranslationResultUI scanTranslationResultUI = this.f347150d;
            int i = ScanTranslationResultUI.f347102E;
            scanTranslationResultUI.mo175979M7();
            C76879j.m92749t(this.f347150d.getContext(), this.f347150d.getResources().getString(C0966R.string.cul), this.f347150d.getResources().getString(C0966R.string.a3h), new C115699a(this.f347150d));
        }
    }

    public C115693p(ScanTranslationResultUI scanTranslationResultUI, String str) {
        this.f347144a = scanTranslationResultUI;
        this.f347145b = str;
    }

    /* renamed from: a */
    public void mo175984a(String str, C118679t.C118682c cVar) {
        C87412m.m108594g(cVar, "result");
        if (!Util.isNullOrNil(str) && C87412m.m108589b(str, this.f347144a.f347121u)) {
            OCRTranslateReportStruct oCRTranslateReportStruct = this.f347144a.f347104B;
            long currentTimeMillis = System.currentTimeMillis();
            ScanTranslationResultUI scanTranslationResultUI = this.f347144a;
            oCRTranslateReportStruct.f343791g = (long) ((int) (currentTimeMillis - scanTranslationResultUI.f347105C[1]));
            Log.m105925i("MicroMsg.ScanTranslationResultUI", "alvinluo scanTranslate upload img cost %d, errCode: %d", Long.valueOf(scanTranslationResultUI.f347104B.f343791g), Integer.valueOf(cVar.f355134a));
            OCRTranslateReportStruct oCRTranslateReportStruct2 = this.f347144a.f347104B;
            oCRTranslateReportStruct2.f343797m = oCRTranslateReportStruct2.mo86045b("FileID", cVar.f355135b, true);
            OCRTranslateReportStruct oCRTranslateReportStruct3 = this.f347144a.f347104B;
            oCRTranslateReportStruct3.f343798n = oCRTranslateReportStruct3.mo86045b("AesKey", cVar.f355136c, true);
            int i = cVar.f355134a;
            if (i == -21009 || i == -21000) {
                MMHandlerThread.postToMainThread(new C115696b(this.f347144a));
                this.f347144a.f347104B.f343790f = 3;
            } else if (i != 0) {
                MMHandlerThread.postToMainThread(new C115698c(this.f347144a));
                this.f347144a.f347104B.f343790f = 3;
            } else {
                if (!Util.isNullOrNil(cVar.f355135b, cVar.f355136c)) {
                    Log.m105925i("MicroMsg.ScanTranslationResultUI", "fileId %s", cVar.f355135b);
                    C86709a0.m107524d().mo123460f(new C115672t(this.f347144a.f347123w, (int) C86013q1.m106451l(this.f347145b), cVar.f355135b, cVar.f355136c, 1, 2));
                } else {
                    MMHandlerThread.postToMainThread(new C115694a(this.f347144a));
                    this.f347144a.f347104B.f343790f = 3;
                }
            }
            ScanTranslationResultUI scanTranslationResultUI2 = this.f347144a;
            if (scanTranslationResultUI2.f347124x == 1 && scanTranslationResultUI2.f347103A != 0) {
                Log.m105924i("delete tmp path %s", this.f347145b);
                C86013q1.m106447h(this.f347145b);
            }
        }
    }
}
