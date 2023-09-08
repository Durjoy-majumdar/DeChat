package ks2;

import android.text.Layout;
import com.tencent.p014mm.autogen.mmdata.rpt.WC_MOMENTS_INPUT_ARER_LOGStruct;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C8480h;
import java.util.LinkedList;

/* renamed from: ks2.z */
public final class C99205z {

    /* renamed from: j */
    public static final C99206a f290902j = new C99206a((C8480h) null);

    /* renamed from: k */
    public static final LinkedList<C99205z> f290903k = new LinkedList<>();

    /* renamed from: a */
    public String f290904a = "";

    /* renamed from: b */
    public String f290905b = "";

    /* renamed from: c */
    public String f290906c = "";

    /* renamed from: d */
    public int f290907d;

    /* renamed from: e */
    public int f290908e;

    /* renamed from: f */
    public int f290909f;

    /* renamed from: g */
    public String f290910g = "";

    /* renamed from: h */
    public int f290911h;

    /* renamed from: i */
    public int f290912i;

    /* renamed from: ks2.z$a */
    public static final class C99206a {
        public C99206a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C99205z mo138557a() {
            SnsMethodCalculate.markStartTimeMs("getCurrentReporter", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter$Companion");
            if (C99205z.m129216a().isEmpty()) {
                SnsMethodCalculate.markEndTimeMs("getCurrentReporter", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter$Companion");
                return null;
            }
            C99205z zVar = (C99205z) C99205z.m129216a().removeFirst();
            SnsMethodCalculate.markEndTimeMs("getCurrentReporter", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter$Companion");
            return zVar;
        }

        /* renamed from: b */
        public final C99205z mo138558b() {
            SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter$Companion");
            C99205z zVar = new C99205z();
            SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter$Companion");
            return zVar;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ LinkedList m129216a() {
        SnsMethodCalculate.markStartTimeMs("access$getReporterList$cp", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
        LinkedList<C99205z> linkedList = f290903k;
        SnsMethodCalculate.markEndTimeMs("access$getReporterList$cp", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
        return linkedList;
    }

    /* renamed from: b */
    public final void mo138554b() {
        SnsMethodCalculate.markStartTimeMs("doReport", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
        WC_MOMENTS_INPUT_ARER_LOGStruct wC_MOMENTS_INPUT_ARER_LOGStruct = new WC_MOMENTS_INPUT_ARER_LOGStruct();
        wC_MOMENTS_INPUT_ARER_LOGStruct.f266547d = this.f290907d;
        wC_MOMENTS_INPUT_ARER_LOGStruct.f266553j = this.f290909f;
        wC_MOMENTS_INPUT_ARER_LOGStruct.f266552i = this.f290908e;
        wC_MOMENTS_INPUT_ARER_LOGStruct.f266555l = this.f290911h;
        wC_MOMENTS_INPUT_ARER_LOGStruct.f266554k = wC_MOMENTS_INPUT_ARER_LOGStruct.mo86045b("contextScreenHeightRatio", this.f290910g, true);
        wC_MOMENTS_INPUT_ARER_LOGStruct.f266550g = wC_MOMENTS_INPUT_ARER_LOGStruct.mo86045b("commentID", this.f290906c, true);
        wC_MOMENTS_INPUT_ARER_LOGStruct.f266549f = wC_MOMENTS_INPUT_ARER_LOGStruct.mo86045b("feedID", this.f290905b, true);
        wC_MOMENTS_INPUT_ARER_LOGStruct.f266548e = wC_MOMENTS_INPUT_ARER_LOGStruct.mo86045b("sessionID", this.f290904a, true);
        wC_MOMENTS_INPUT_ARER_LOGStruct.f266551h = this.f290912i;
        wC_MOMENTS_INPUT_ARER_LOGStruct.mo86054n();
        SnsMethodCalculate.markStartTimeMs("removeReporter", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter$Companion");
        m129216a().remove(this);
        SnsMethodCalculate.markEndTimeMs("removeReporter", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter$Companion");
        SnsMethodCalculate.markEndTimeMs("doReport", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
    }

    /* renamed from: c */
    public final void mo138555c(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("prepareDoReport", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
        this.f290907d = i;
        this.f290912i = i2;
        SnsMethodCalculate.markStartTimeMs("offerReporter", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter$Companion");
        m129216a().offerFirst(this);
        SnsMethodCalculate.markEndTimeMs("offerReporter", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter$Companion");
        SnsMethodCalculate.markEndTimeMs("prepareDoReport", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
    }

    /* renamed from: d */
    public final void mo138556d(Layout layout) {
        SnsMethodCalculate.markStartTimeMs("setTextReportData", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
        if (layout == null) {
            SnsMethodCalculate.markEndTimeMs("setTextReportData", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
            return;
        }
        int height = layout.getHeight();
        int i = C75044y4.m89990b(MMApplicationContext.getContext()).y;
        int length = layout.getText().length();
        int lineCount = layout.getLineCount();
        SnsMethodCalculate.markStartTimeMs("setTextReportData", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
        this.f290908e = length;
        this.f290909f = lineCount;
        this.f290910g = String.valueOf(((double) height) / ((double) i));
        Log.m105918d("MicroMsg.SnsInputAreaReporter", "setTextReportData: wordCnt=" + length + ", lineCnt:" + lineCount + ", contextHeight ratio:" + this.f290910g);
        SnsMethodCalculate.markEndTimeMs("setTextReportData", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
        SnsMethodCalculate.markEndTimeMs("setTextReportData", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
    }
}
