package gk3;

import com.tencent.p014mm.autogen.mmdata.rpt.ImageFastEntryDetectStruct;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import gy3.C87412m;
import java.util.HashMap;
import zt3.C119157j;

/* renamed from: gk3.e */
public final class C98136e {

    /* renamed from: a */
    public ImageFastEntryDetectStruct f287729a;

    /* renamed from: b */
    public C98137a f287730b;

    /* renamed from: c */
    public C98138b f287731c;

    /* renamed from: gk3.e$a */
    public static final class C98137a {

        /* renamed from: a */
        public String f287732a = "";

        /* renamed from: b */
        public int f287733b;

        /* renamed from: c */
        public int f287734c;

        /* renamed from: d */
        public long f287735d;

        /* renamed from: e */
        public long f287736e;

        /* renamed from: f */
        public boolean f287737f;
    }

    /* renamed from: gk3.e$b */
    public static final class C98138b {

        /* renamed from: a */
        public String f287738a = "";

        /* renamed from: b */
        public long f287739b;

        /* renamed from: c */
        public int f287740c;

        /* renamed from: d */
        public long f287741d;

        /* renamed from: e */
        public String f287742e = "";

        /* renamed from: f */
        public int f287743f;

        /* renamed from: g */
        public String f287744g = "";

        /* renamed from: h */
        public String f287745h = "";

        /* renamed from: i */
        public String f287746i = "";

        /* renamed from: j */
        public HashMap<String, Boolean> f287747j = new HashMap<>();
    }

    /* renamed from: a */
    public final void mo137415a(int i) {
        C98137a aVar = this.f287730b;
        if (aVar != null) {
            aVar.f287733b = i;
        }
        if (aVar != null) {
            aVar.f287736e = System.currentTimeMillis();
        }
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i);
        C98137a aVar2 = this.f287730b;
        String str = null;
        objArr[1] = aVar2 != null ? Long.valueOf(aVar2.f287736e) : null;
        Log.m105925i("MicroMsg.ImageScanButtonReporter", "alvinluo clickFinish clickResult: %d, %s", objArr);
        C98137a aVar3 = this.f287730b;
        if (!(aVar3 != null && aVar3.f287737f)) {
            if (aVar3 != null) {
                aVar3.f287737f = true;
            }
            if (!(aVar3 != null && aVar3.f287733b == 1) && aVar3 != null) {
                aVar3.f287733b = 2;
            }
            if (aVar3 != null) {
                Log.m105927v("MicroMsg.ImageScanButtonReporter", "reportFastEntryClick sessionId: %s, clickResult: %s, iconType: %d, clickIconTime: %s, clickFinishTime: %s, diff: %s", aVar3.f287732a, Integer.valueOf(aVar3.f287733b), Integer.valueOf(aVar3.f287734c), Long.valueOf(aVar3.f287735d), Long.valueOf(aVar3.f287736e), Long.valueOf(aVar3.f287736e - aVar3.f287735d));
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr2 = new Object[7];
                objArr2[0] = aVar3.f287732a;
                objArr2[1] = Integer.valueOf(aVar3.f287733b);
                objArr2[2] = Integer.valueOf(aVar3.f287734c);
                objArr2[3] = Long.valueOf(aVar3.f287735d);
                objArr2[4] = Long.valueOf(aVar3.f287736e);
                ImageFastEntryDetectStruct imageFastEntryDetectStruct = this.f287729a;
                objArr2[5] = imageFastEntryDetectStruct != null ? imageFastEntryDetectStruct.f265644j : null;
                if (imageFastEntryDetectStruct != null) {
                    str = imageFastEntryDetectStruct.f265645k;
                }
                objArr2[6] = str;
                nVar.mo160131h(19778, objArr2);
            }
        }
    }

    /* renamed from: b */
    public final void mo137416b(int i) {
        Log.m105925i("MicroMsg.ImageScanButtonReporter", "alvinluo clickScanButton iconType: %d", Integer.valueOf(i));
        C98137a aVar = new C98137a();
        this.f287730b = aVar;
        aVar.f287732a = "";
        aVar.f287733b = 0;
        aVar.f287734c = 0;
        aVar.f287735d = 0;
        aVar.f287736e = 0;
        aVar.f287737f = false;
        ImageFastEntryDetectStruct imageFastEntryDetectStruct = this.f287729a;
        C87412m.m108591d(imageFastEntryDetectStruct);
        String str = imageFastEntryDetectStruct.f265640f;
        C87412m.m108593f(str, "fastEntryDetectStruct!!.sessionId");
        aVar.f287732a = str;
        aVar.f287734c = i;
        aVar.f287735d = System.currentTimeMillis();
    }

    /* renamed from: c */
    public final void mo137417c(int i, int i2) {
        HashMap<String, Boolean> hashMap;
        C98138b bVar = this.f287731c;
        boolean z = false;
        if (!(bVar != null && bVar.f287741d == 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(',');
            sb.append(i2);
            String sb4 = sb.toString();
            if (i == 1) {
                C98138b bVar2 = this.f287731c;
                if (!(bVar2 == null || (hashMap = bVar2.f287747j) == null)) {
                    z = C87412m.m108589b(hashMap.get(sb4), Boolean.TRUE);
                }
                if (z) {
                    return;
                }
            }
            C98138b bVar3 = this.f287731c;
            if (bVar3 != null) {
                bVar3.f287747j.put(sb4, Boolean.TRUE);
            }
            long currentTimeMillis = System.currentTimeMillis();
            C98138b bVar4 = this.f287731c;
            if (bVar4 != null) {
                ((C119157j) C119157j.f356862d).mo183871b(new C98139f(bVar4, i, i2, currentTimeMillis), "ReportSearchButtonAction");
            }
        }
    }

    /* renamed from: d */
    public final void mo137418d(int i) {
        ImageFastEntryDetectStruct imageFastEntryDetectStruct = this.f287729a;
        if (imageFastEntryDetectStruct != null && imageFastEntryDetectStruct.f265643i == ((long) i)) {
            if (!(imageFastEntryDetectStruct != null && imageFastEntryDetectStruct.f265641g == 0)) {
                return;
            }
        }
        Log.m105927v("MicroMsg.ImageScanButtonReporter", "setShowIcon iconType: %d", Integer.valueOf(i));
        ImageFastEntryDetectStruct imageFastEntryDetectStruct2 = this.f287729a;
        if (imageFastEntryDetectStruct2 != null) {
            imageFastEntryDetectStruct2.f265643i = (long) i;
        }
        if (imageFastEntryDetectStruct2 != null) {
            imageFastEntryDetectStruct2.f265641g = System.currentTimeMillis();
        }
    }

    /* renamed from: e */
    public final void mo137419e(int i, C92836k kVar) {
        this.f287729a = new ImageFastEntryDetectStruct();
        Log.m105927v("MicroMsg.ImageScanButtonReporter", "startSession picType: %d", Integer.valueOf(i));
        ImageFastEntryDetectStruct imageFastEntryDetectStruct = this.f287729a;
        C87412m.m108591d(imageFastEntryDetectStruct);
        imageFastEntryDetectStruct.f265643i = 1;
        imageFastEntryDetectStruct.f265642h = 1;
        imageFastEntryDetectStruct.f265638d = System.currentTimeMillis();
        imageFastEntryDetectStruct.f265639e = (long) i;
        imageFastEntryDetectStruct.f265640f = imageFastEntryDetectStruct.mo86045b("SessionId", C75592q0.m90789s() + '_' + imageFastEntryDetectStruct.f265638d, true);
        String str = null;
        imageFastEntryDetectStruct.f265644j = imageFastEntryDetectStruct.mo86045b("FileID", kVar != null ? kVar.mo127136g() : null, true);
        if (kVar != null) {
            str = kVar.mo127133d();
        }
        imageFastEntryDetectStruct.f265645k = imageFastEntryDetectStruct.mo86045b("AesKey", str, true);
        C87412m.m108593f(imageFastEntryDetectStruct.f265640f, "sessionId");
        C98138b bVar = new C98138b();
        bVar.f287739b = System.currentTimeMillis();
        this.f287731c = bVar;
    }
}
