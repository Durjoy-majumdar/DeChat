package jl2;

import com.tencent.p014mm.autogen.events.ScanTranslationEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.OCRTranslateReportStruct;
import com.tencent.p014mm.plugin.scanner.C115674p;
import com.tencent.p014mm.plugin.scanner.model.C115672t;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import java.util.HashMap;
import vl2.C118679t;

/* renamed from: jl2.l */
public class C117358l implements C118679t.C118681b {

    /* renamed from: a */
    public final /* synthetic */ String f351346a;

    /* renamed from: b */
    public final /* synthetic */ OCRTranslateReportStruct f351347b;

    /* renamed from: c */
    public final /* synthetic */ long f351348c;

    /* renamed from: d */
    public final /* synthetic */ ScanTranslationEvent f351349d;

    /* renamed from: e */
    public final /* synthetic */ String f351350e;

    /* renamed from: f */
    public final /* synthetic */ HashMap f351351f;

    /* renamed from: g */
    public final /* synthetic */ HashMap f351352g;

    public C117358l(C117359m mVar, String str, OCRTranslateReportStruct oCRTranslateReportStruct, long j, ScanTranslationEvent scanTranslationEvent, String str2, HashMap hashMap, HashMap hashMap2) {
        this.f351346a = str;
        this.f351347b = oCRTranslateReportStruct;
        this.f351348c = j;
        this.f351349d = scanTranslationEvent;
        this.f351350e = str2;
        this.f351351f = hashMap;
        this.f351352g = hashMap2;
    }

    /* renamed from: a */
    public void mo175984a(String str, C118679t.C118682c cVar) {
        Class cls = C115674p.class;
        if (!Util.isNullOrNil(str) && str.equals(this.f351346a)) {
            this.f351347b.f343791g = System.currentTimeMillis() - this.f351348c;
            Log.m105925i("ScanTranslationListener", "upload img cost %d", Long.valueOf(this.f351347b.f343791g));
            OCRTranslateReportStruct oCRTranslateReportStruct = this.f351347b;
            oCRTranslateReportStruct.f343797m = oCRTranslateReportStruct.mo86045b("FileID", cVar.f355135b, true);
            OCRTranslateReportStruct oCRTranslateReportStruct2 = this.f351347b;
            oCRTranslateReportStruct2.f343798n = oCRTranslateReportStruct2.mo86045b("AesKey", cVar.f355136c, true);
            if (cVar.f355134a != 0) {
                OCRTranslateReportStruct oCRTranslateReportStruct3 = this.f351347b;
                oCRTranslateReportStruct3.f343790f = 3;
                oCRTranslateReportStruct3.f343793i = System.currentTimeMillis() - this.f351348c;
                this.f351347b.mo86054n();
                this.f351351f.remove(Integer.valueOf(this.f351349d.f265085d.f265087b));
                this.f351352g.remove(Integer.valueOf(this.f351349d.f265085d.f265087b));
                Log.m105925i("ScanTranslationListener", "translationReports size %d, translationUpload size %d, errCode: %s", Integer.valueOf(this.f351351f.size()), Integer.valueOf(this.f351352g.size()), Integer.valueOf(cVar.f355134a));
                ((C115674p) C86312j.m106911c(cls)).Dx0(this.f351349d.f265085d.f265087b);
                return;
            }
            if (!Util.isNullOrNil(cVar.f355135b, cVar.f355136c)) {
                Log.m105925i("ScanTranslationListener", "upload img success, fileId %s", cVar.f355135b);
                ScanTranslationEvent.C92559a aVar = this.f351349d.f265085d;
                C86709a0.m107524d().mo123460f(new C115672t(aVar.f265086a, aVar.f265087b, (int) C86013q1.m106451l(this.f351350e), cVar.f355135b, cVar.f355136c, 1, 2));
                return;
            }
            OCRTranslateReportStruct oCRTranslateReportStruct4 = this.f351347b;
            oCRTranslateReportStruct4.f343790f = 3;
            oCRTranslateReportStruct4.f343793i = System.currentTimeMillis() - this.f351348c;
            this.f351347b.mo86054n();
            this.f351351f.remove(Integer.valueOf(this.f351349d.f265085d.f265087b));
            this.f351352g.remove(Integer.valueOf(this.f351349d.f265085d.f265087b));
            Log.m105925i("ScanTranslationListener", "translationReports size %d, translationUpload size %d", Integer.valueOf(this.f351351f.size()), Integer.valueOf(this.f351352g.size()));
            ((C115674p) C86312j.m106911c(cls)).Dx0(this.f351349d.f265085d.f265087b);
        }
    }
}
