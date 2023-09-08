package es2;

import a70.C112760b;
import android.graphics.BitmapFactory;
import android.util.SparseArray;
import com.tencent.p014mm.memory.C92714n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.C94994j;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import es2.C97696c;
import os2.C100408j0;
import tc2.C118418g;
import te3.C101804kv2;
import vr2.C102236a0;
import vr2.C102268v;

/* renamed from: es2.j */
public class C97706j extends C97704h {

    /* renamed from: m */
    public boolean f286630m = false;

    public C97706j(C97696c.C97699b bVar, C97694a aVar) {
        super(bVar, aVar);
        C115669n.INSTANCE.idkeyStat(150, 10, 1, true);
    }

    /* renamed from: l */
    public int mo136974l() {
        SnsMethodCalculate.markStartTimeMs("getMediaType", "com.tencent.mm.plugin.sns.model.download.SnsDownloadThumb");
        SnsMethodCalculate.markEndTimeMs("getMediaType", "com.tencent.mm.plugin.sns.model.download.SnsDownloadThumb");
        return 3;
    }

    /* renamed from: q */
    public boolean mo136976q() {
        int queryQuality;
        SnsMethodCalculate.markStartTimeMs("processData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadThumb");
        if (this.f286589f.f286544h != null) {
            String X = C102236a0.m134729X(this.f286590g);
            boolean CZ = C100408j0.m131379CZ(this.f286589f.mo136951c() + this.f286589f.mo136954f());
            this.f286630m = CZ;
            if (CZ) {
                C115669n.INSTANCE.idkeyStat(22, 64, 1, true);
            }
            String str = this.f286589f.mo136951c() + this.f286589f.mo136954f();
            this.f286589f.f286550n = C102236a0.m134709D(str);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapUtil.decodeFile(str, options);
            String str2 = options.outMimeType;
            String lowerCase = str2 != null ? str2.toLowerCase() : "";
            String str3 = options.outMimeType;
            if (str3 == null || Util.isNullOrNil(str3)) {
                C115669n.INSTANCE.idkeyStat(150, 35, 1, true);
            }
            int i = ((lowerCase.contains("jpg") || lowerCase.contains("jpeg")) && (queryQuality = MMNativeJpeg.queryQuality(str)) != 0) ? queryQuality : -1;
            long l = C86013q1.m106451l(str);
            if (l <= 0) {
                Log.m105921e("MicroMsg.SnsDownloadThumb", "processData!!! file err!!! [%s].", str);
                C115669n.INSTANCE.idkeyStat(150, 23, 1, true);
            }
            long currentTicks = Util.currentTicks();
            String V = C102236a0.m134727V(this.f286590g);
            C86013q1.m106435Q(this.f286589f.mo136951c(), this.f286589f.mo136954f(), V);
            StringBuilder sb = new StringBuilder();
            sb.append("file src");
            sb.append(C86013q1.m106450k(this.f286589f.mo136951c() + V));
            Log.m105926v("MicroMsg.SnsDownloadThumb", sb.toString());
            long currentTicks2 = Util.currentTicks();
            if (!C100408j0.m131392kD(this.f286589f.mo136951c(), V, X, (float) C94866e1.Ox0())) {
                Log.m105920e("MicroMsg.SnsDownloadThumb", "decodeInfo createThumb failed");
                C115669n.INSTANCE.idkeyStat(150, 27, 1, true);
            }
            Log.m105924i("MicroMsg.SnsDownloadThumb", "processData execute step1.");
            long ticksToNow = Util.ticksToNow(currentTicks2);
            boolean k = C86013q1.m106450k(this.f286589f.mo136951c() + V);
            long ticksToNow2 = Util.ticksToNow(currentTicks);
            if (!C86013q1.m106450k(this.f286589f.mo136951c() + X)) {
                Log.m105925i("MicroMsg.SnsDownloadThumb", "fileExists is false %s", Long.valueOf(C86013q1.m106451l(this.f286589f.mo136951c() + X)));
                C115669n nVar = C115669n.INSTANCE;
                nVar.idkeyStat(150, 31, 1, true);
                if (k) {
                    if (!C86013q1.m106450k(this.f286589f.mo136951c() + X)) {
                        boolean jt = C118418g.INSTANCE.mo175824jt();
                        Log.m105925i("MicroMsg.SnsDownloadThumb", "let me see Is DuplicatedApp? %s", Boolean.valueOf(jt));
                        nVar.idkeyStat(150, 32, 1, true);
                        if (jt) {
                            nVar.idkeyStat(150, 33, 1, true);
                        }
                    }
                }
            }
            C115669n nVar2 = C115669n.INSTANCE;
            C94866e1.Ex0();
            nVar2.mo160131h(11696, 3, Long.valueOf(ticksToNow2), Integer.valueOf(this.f286593j), Thread.currentThread().getName(), "", C112760b.m154230f0());
            Log.m105924i("MicroMsg.SnsDownloadThumb", "processData execute step2.");
            if (this.f286589f.f286544h.mo141829a() == 0 || this.f286589f.f286544h.mo141829a() == 5) {
                String g0 = C102236a0.m134745g0(this.f286590g);
                C100408j0.m131393mI(this.f286589f.mo136951c(), X, g0, (float) C94866e1.Hx0());
                X = g0;
            }
            String str4 = "MicroMsg.SnsDownloadThumb";
            C94994j.m120749c(this.f286589f.mo136951c() + X, this.f286589f.f286539c, 1, options.outMimeType, options.outWidth, options.outHeight, i, l, ticksToNow);
            Log.m105924i(str4, "processData execute step3.");
            C92714n n = C102236a0.m134758n(this.f286589f.mo136951c() + X);
            this.f286587d = n;
            boolean f = C102236a0.m134742f(n);
            Log.m105924i(str4, "download decode bitmap done : succ: " + f + " isWebp: " + this.f286630m + " srcImgFileSize: " + l);
            if (!f) {
                nVar2.idkeyStat(150, 65, 1, true);
                nVar2.idkeyStat(150, 51, 1, true);
            }
            if (this.f286630m && !f) {
                nVar2.idkeyStat(22, 65, 1, true);
            }
        }
        SnsMethodCalculate.markEndTimeMs("processData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadThumb");
        return true;
    }

    /* renamed from: r */
    public boolean mo136977r(int i) {
        String str;
        int queryQuality;
        int i2 = i;
        String str2 = "processGroupDownloadSuccessData";
        SnsMethodCalculate.markStartTimeMs(str2, "com.tencent.mm.plugin.sns.model.download.SnsDownloadThumb");
        SparseArray<C102268v> sparseArray = this.f286589f.f286553q;
        if (sparseArray == null || sparseArray.size() <= 0) {
            str = "com.tencent.mm.plugin.sns.model.download.SnsDownloadThumb";
        } else {
            C102268v vVar = this.f286589f.f286553q.get(i2);
            C101804kv2 kv22 = this.f286589f.f286552p.get(i2);
            if (vVar == null || kv22 == null) {
                Log.m105920e("MicroMsg.SnsDownloadThumb", "decodeElement or media is null.");
                SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.model.download.SnsDownloadThumb");
                return false;
            }
            Log.m105925i("MicroMsg.SnsDownloadThumb", "In processGroupDownloadSuccessData ing, %d.", Integer.valueOf(i));
            String str3 = this.f286589f.mo136949a(kv22.f298689d) + this.f286589f.mo136950b(kv22);
            String X = C102236a0.m134729X(kv22);
            boolean CZ = C100408j0.m131379CZ(str3);
            this.f286630m = CZ;
            if (CZ) {
                C115669n.INSTANCE.idkeyStat(22, 64, 1, true);
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapUtil.decodeFile(str3, options);
            String str4 = options.outMimeType;
            String lowerCase = str4 != null ? str4.toLowerCase() : "";
            String str5 = options.outMimeType;
            if (str5 == null || Util.isNullOrNil(str5)) {
                C115669n.INSTANCE.idkeyStat(150, 35, 1, true);
            }
            int i3 = ((lowerCase.contains("jpg") || lowerCase.contains("jpeg")) && (queryQuality = MMNativeJpeg.queryQuality(str3)) != 0) ? queryQuality : -1;
            this.f286589f.f286550n = C102236a0.m134709D(str3);
            long l = C86013q1.m106451l(str3);
            if (l <= 0) {
                Log.m105921e("MicroMsg.SnsDownloadThumb", "processGroupDownloadSuccessData!!! file err!!! [%s].", str3);
                C115669n.INSTANCE.idkeyStat(150, 23, 1, true);
            }
            long currentTicks = Util.currentTicks();
            String V = C102236a0.m134727V(kv22);
            StringBuilder sb = new StringBuilder();
            String str6 = str2;
            sb.append(this.f286589f.mo136949a(kv22.f298689d));
            sb.append(V);
            C86013q1.m106442c(str3, sb.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("file exist ");
            StringBuilder sb5 = new StringBuilder();
            String str7 = "com.tencent.mm.plugin.sns.model.download.SnsDownloadThumb";
            sb5.append(this.f286589f.mo136949a(kv22.f298689d));
            sb5.append(V);
            sb4.append(C86013q1.m106450k(sb5.toString()));
            Log.m105926v("MicroMsg.SnsDownloadThumb", sb4.toString());
            long currentTicks2 = Util.currentTicks();
            if (!C100408j0.m131392kD(this.f286589f.mo136949a(kv22.f298689d), this.f286589f.mo136950b(kv22), X, (float) C94866e1.Ox0())) {
                Log.m105920e("MicroMsg.SnsDownloadThumb", "decodeInfo createThumb failed");
                C115669n.INSTANCE.idkeyStat(150, 27, 1, true);
            }
            long ticksToNow = Util.ticksToNow(currentTicks2);
            boolean k = C86013q1.m106450k(str3);
            C86013q1.m106447h(str3);
            long ticksToNow2 = Util.ticksToNow(currentTicks);
            if (!C86013q1.m106450k(this.f286589f.mo136949a(kv22.f298689d) + X)) {
                Log.m105925i("MicroMsg.SnsDownloadThumb", "fileExists is false %s.", Long.valueOf(C86013q1.m106451l(this.f286589f.mo136951c() + X)));
                C115669n nVar = C115669n.INSTANCE;
                nVar.idkeyStat(150, 31, 1, true);
                if (k) {
                    if (!C86013q1.m106450k(this.f286589f.mo136949a(kv22.f298689d) + X)) {
                        boolean jt = C118418g.INSTANCE.mo175824jt();
                        Log.m105925i("MicroMsg.SnsDownloadThumb", "let me see Is DuplicatedApp? %s", Boolean.valueOf(jt));
                        nVar.idkeyStat(150, 32, 1, true);
                        if (jt) {
                            nVar.idkeyStat(150, 33, 1, true);
                        }
                    }
                }
            }
            C115669n nVar2 = C115669n.INSTANCE;
            C94866e1.Ex0();
            nVar2.mo160131h(11696, 3, Long.valueOf(ticksToNow2), Integer.valueOf(this.f286593j), Thread.currentThread().getName(), "", C112760b.m154230f0());
            if (vVar.mo141829a() == 0 || this.f286589f.f286544h.mo141829a() == 5) {
                String g0 = C102236a0.m134745g0(kv22);
                C100408j0.m131393mI(this.f286589f.mo136949a(kv22.f298689d), X, g0, (float) C94866e1.Hx0());
                X = g0;
            }
            C94994j.m120749c(this.f286589f.mo136949a(kv22.f298689d) + X, kv22.f298694i, 1, options.outMimeType, options.outWidth, options.outHeight, i3, l, ticksToNow);
            C92714n n = C102236a0.m134758n(this.f286589f.mo136949a(kv22.f298689d) + X);
            this.f286587d = n;
            this.f286588e.put(i2, n);
            boolean f = C102236a0.m134742f(this.f286587d);
            Log.m105924i("MicroMsg.SnsDownloadThumb", "download decode bitmap done : succ: " + f + " isWebp: " + this.f286630m + " srcImgFileSize: " + l + " index: " + i2);
            if (!f) {
                nVar2.idkeyStat(150, 65, 1, true);
                nVar2.idkeyStat(150, 51, 1, true);
            }
            if (this.f286630m && !f) {
                nVar2.idkeyStat(22, 65, 1, true);
            }
            str2 = str6;
            str = str7;
        }
        SnsMethodCalculate.markEndTimeMs(str2, str);
        return true;
    }
}
