package ig3;

import com.tencent.p014mm.sdk.platformtools.Log;
import p157gk.C59491j;

/* renamed from: ig3.c */
public final class C60281c {

    /* renamed from: a */
    public static final C60281c f171856a = new C60281c();

    /* renamed from: a */
    public final void mo85258a(boolean z) {
        Log.m105924i("MicroMsg.ImageQueryReportProvider", "reportAllImageDone >> " + z + ", " + C59491j.f169996a);
        if (!C59491j.f169996a) {
            C60282d.f171873q = z ? 1 : 2;
        }
    }

    /* renamed from: b */
    public final void mo85259b(boolean z) {
        Log.m105924i("MicroMsg.ImageQueryReportProvider", "reportImageDone >> " + z + ", " + C59491j.f169996a);
        if (!C59491j.f169996a) {
            C60282d.f171865i = z ? 1 : 2;
        }
    }

    /* renamed from: c */
    public final void mo85260c(int i) {
        Log.m105924i("MicroMsg.ImageQueryReportProvider", "reportInternalReport >> " + i + ", " + C59491j.f169996a);
        if (!C59491j.f169996a) {
            C60282d.f171857a.mo85266c(i);
        }
    }

    /* renamed from: d */
    public final void mo85261d(int i) {
        Log.m105924i("MicroMsg.ImageQueryReportProvider", "reportSearchAllNum >> " + i + ",  " + C59491j.f169996a);
        if (!C59491j.f169996a) {
            Log.m105924i("MicroMsg.ImageQueryReporter", "setSearchImageCnt >> " + i + ' ' + C60282d.f171862f);
            if (!(C60282d.f171862f.length() == 0)) {
                C60282d.f171868l = i;
            }
        }
    }

    /* renamed from: e */
    public final void mo85262e(int i) {
        Log.m105924i("MicroMsg.ImageQueryReportProvider", "reportSearchPeopleAllNum >> " + i + ",  " + C59491j.f169996a);
        if (!C59491j.f169996a) {
            Log.m105924i("MicroMsg.ImageQueryReporter", "setSearchPeopleImageCnt >> " + i + ' ' + C60282d.f171862f);
            if (!(C60282d.f171862f.length() == 0)) {
                C60282d.f171869m = i;
            }
        }
    }

    /* renamed from: f */
    public final void mo85263f(int i) {
        Log.m105924i("MicroMsg.ImageQueryReportProvider", "reportTecSearchImageNum >> " + i + ", " + C59491j.f169996a);
        if (!C59491j.f169996a) {
            C60283e.f171896s = (long) i;
        }
    }
}
