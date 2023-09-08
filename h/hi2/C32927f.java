package hi2;

import com.tencent.p014mm.autogen.mmdata.rpt.MediaFileReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;

/* renamed from: hi2.f */
public final class C32927f {

    /* renamed from: a */
    public static final C32927f f89501a = new C32927f();

    /* renamed from: b */
    public static final C13601g f89502b = C36568h.m40985a(C32928a.f89503d);

    /* renamed from: hi2.f$a */
    public static final class C32928a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C32928a f89503d = new C32928a();

        public C32928a() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getDefault();
        }
    }

    /* renamed from: a */
    public final void mo58867a(String str, int i) {
        MediaFileReportStruct mediaFileReportStruct = new MediaFileReportStruct();
        mediaFileReportStruct.f79136i = i;
        C86009m1 m1Var = new C86009m1(str);
        mediaFileReportStruct.f79131d = mediaFileReportStruct.mo86045b("MediaDirPath", m1Var.mo119973k(), true);
        mediaFileReportStruct.f79132e = mediaFileReportStruct.mo86045b("MediaFilePath", m1Var.getName(), true);
        long q = m1Var.mo119979q();
        mediaFileReportStruct.f79134g = q;
        mediaFileReportStruct.mo86046c("ModifiedTimeMs", q);
        mediaFileReportStruct.f79133f = mediaFileReportStruct.mo86045b("ModifiedTimeStr", new Date(m1Var.mo119979q()).toString(), true);
        mediaFileReportStruct.f79135h = m1Var.mo119980r();
        Log.m105924i("MicroMsg.MediaFileReporter", "report type:" + i + " path:" + str + " modified time:" + mediaFileReportStruct.f79133f + " size:" + mediaFileReportStruct.f79135h);
        mediaFileReportStruct.mo86054n();
    }

    /* renamed from: b */
    public final MultiProcessMMKV mo58868b() {
        return (MultiProcessMMKV) ((C36570n) f89502b).getValue();
    }

    /* renamed from: c */
    public final void mo58869c(String str) {
        C87412m.m108594g(str, SharePatchInfo.OAT_DIR);
        Log.m105924i("MicroMsg.MediaFileReporter", "registerDailyReport dir:" + str);
        Set<String> decodeStringSet = mo58868b().decodeStringSet("MicroMsg.MediaFileReporter", new HashSet());
        decodeStringSet.add(str);
        mo58868b().encode("MicroMsg.MediaFileReporter", decodeStringSet);
        int i = 0;
        for (T next : decodeStringSet) {
            int i2 = i + 1;
            if (i >= 0) {
                Log.m105924i("MicroMsg.MediaFileReporter", "currernt register index:" + i + " dir:" + ((String) next));
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }
}
