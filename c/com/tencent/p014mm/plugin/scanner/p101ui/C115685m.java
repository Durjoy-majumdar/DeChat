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
import nj3.C76879j;
import vl2.C118679t;

/* renamed from: com.tencent.mm.plugin.scanner.ui.m */
public class C115685m implements C118679t.C118681b {

    /* renamed from: a */
    public final /* synthetic */ String f347135a;

    /* renamed from: b */
    public final /* synthetic */ ScanTranslationCaptureUI f347136b;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.m$a */
    public class C115686a implements Runnable {
        public C115686a() {
        }

        public void run() {
            ScanTranslationCaptureUI scanTranslationCaptureUI = C115685m.this.f347136b;
            scanTranslationCaptureUI.f347056N.f343790f = 3;
            C76879j.m92726T(scanTranslationCaptureUI, scanTranslationCaptureUI.getString(C0966R.string.ien));
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.m$b */
    public class C115687b implements Runnable {

        /* renamed from: com.tencent.mm.plugin.scanner.ui.m$b$a */
        public class C115688a implements DialogInterface.OnClickListener {
            public C115688a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                ScanTranslationCaptureUI scanTranslationCaptureUI = C115685m.this.f347136b;
                int i2 = ScanTranslationCaptureUI.f347042S;
                scanTranslationCaptureUI.mo175941I7();
            }
        }

        public C115687b() {
        }

        public void run() {
            ScanTranslationCaptureUI scanTranslationCaptureUI = C115685m.this.f347136b;
            C76879j.m92749t(scanTranslationCaptureUI, scanTranslationCaptureUI.getString(C0966R.string.cul), C115685m.this.f347136b.getString(C0966R.string.a3h), new C115688a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.m$c */
    public class C115689c implements Runnable {

        /* renamed from: com.tencent.mm.plugin.scanner.ui.m$c$a */
        public class C115690a implements DialogInterface.OnClickListener {
            public C115690a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                ScanTranslationCaptureUI scanTranslationCaptureUI = C115685m.this.f347136b;
                int i2 = ScanTranslationCaptureUI.f347042S;
                scanTranslationCaptureUI.mo175941I7();
            }
        }

        public C115689c() {
        }

        public void run() {
            ScanTranslationCaptureUI scanTranslationCaptureUI = C115685m.this.f347136b;
            C76879j.m92749t(scanTranslationCaptureUI, scanTranslationCaptureUI.getString(C0966R.string.cul), C115685m.this.f347136b.getString(C0966R.string.a3h), new C115690a());
        }
    }

    public C115685m(ScanTranslationCaptureUI scanTranslationCaptureUI, String str) {
        this.f347136b = scanTranslationCaptureUI;
        this.f347135a = str;
    }

    /* renamed from: a */
    public void mo175984a(String str, C118679t.C118682c cVar) {
        if (!Util.isNullOrNil(str) && str.equals(this.f347136b.f347078y)) {
            OCRTranslateReportStruct oCRTranslateReportStruct = this.f347136b.f347056N;
            long currentTimeMillis = System.currentTimeMillis();
            ScanTranslationCaptureUI scanTranslationCaptureUI = this.f347136b;
            oCRTranslateReportStruct.f343791g = (long) ((int) (currentTimeMillis - scanTranslationCaptureUI.f347057P[1]));
            Log.m105925i("MicroMsg.ScanTranslationCaptureUI", "upload img cost %d", Long.valueOf(scanTranslationCaptureUI.f347056N.f343791g));
            OCRTranslateReportStruct oCRTranslateReportStruct2 = this.f347136b.f347056N;
            oCRTranslateReportStruct2.f343797m = oCRTranslateReportStruct2.mo86045b("FileID", cVar.f355135b, true);
            OCRTranslateReportStruct oCRTranslateReportStruct3 = this.f347136b.f347056N;
            oCRTranslateReportStruct3.f343798n = oCRTranslateReportStruct3.mo86045b("AesKey", cVar.f355136c, true);
            int i = cVar.f355134a;
            if (i == -21009 || i == -21000) {
                MMHandlerThread.postToMainThread(new C115687b());
                this.f347136b.f347056N.f343790f = 3;
            } else if (i != 0) {
                MMHandlerThread.postToMainThread(new C115689c());
                this.f347136b.f347056N.f343790f = 3;
            } else {
                if (!Util.isNullOrNil(cVar.f355135b, cVar.f355136c)) {
                    Log.m105925i("MicroMsg.ScanTranslationCaptureUI", "fileId %s", cVar.f355135b);
                    C86709a0.m107524d().mo123460f(new C115672t(this.f347136b.f347049G, (int) C86013q1.m106451l(this.f347135a), cVar.f355135b, cVar.f355136c, 1, 2));
                } else {
                    MMHandlerThread.postToMainThread(new C115686a());
                }
            }
            ScanTranslationCaptureUI scanTranslationCaptureUI2 = this.f347136b;
            if (scanTranslationCaptureUI2.f347050H == 1 && scanTranslationCaptureUI2.f347055M != 0) {
                Log.m105924i("delete tmp path %s", this.f347135a);
                C86013q1.m106447h(this.f347135a);
            }
        }
    }
}
