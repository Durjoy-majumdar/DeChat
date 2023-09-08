package h11;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.OperationCanceledException;
import di3.C86301e;
import di3.C86312j;
import eb0.C31505r2;
import eb0.C75604z3;
import eb0.C97629n2;
import ei3.C86522b;
import gy3.C87412m;
import i11.C98586h;
import j11.C98895d;
import java.util.ArrayList;
import java.util.List;
import lu3.C34379c;
import p248ug.C65347o0;
import q41.C101028a;
import wy0.C102506a;
import wy0.C102522u;
import zt3.C119157j;
import zt3.C119179t;

@C86522b
/* renamed from: h11.a */
public final class C98307a extends C86301e implements C97629n2 {

    /* renamed from: h11.a$a */
    public static final class C98308a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List<String> f288151d;

        /* renamed from: e */
        public final /* synthetic */ C98312f f288152e;

        /* renamed from: f */
        public final /* synthetic */ long f288153f;

        /* renamed from: g */
        public final /* synthetic */ long f288154g;

        /* renamed from: h */
        public final /* synthetic */ CancellationSignal f288155h;

        public C98308a(List<String> list, C98312f fVar, long j, long j2, CancellationSignal cancellationSignal) {
            this.f288151d = list;
            this.f288152e = fVar;
            this.f288153f = j;
            this.f288154g = j2;
            this.f288155h = cancellationSignal;
        }

        public final void run() {
            Log.m105924i("MicroMsg.CleanService", "Sync delete messages, talker count: " + this.f288151d.size());
            C75604z3.m90838j(this.f288151d, this.f288152e, this.f288153f, this.f288154g, this.f288155h);
        }
    }

    /* renamed from: h11.a$b */
    public static final class C98309b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List<String> f288156d;

        /* renamed from: e */
        public final /* synthetic */ CancellationSignal f288157e;

        /* renamed from: f */
        public final /* synthetic */ C98312f f288158f;

        public C98309b(List<String> list, CancellationSignal cancellationSignal, C98312f fVar) {
            this.f288156d = list;
            this.f288157e = cancellationSignal;
            this.f288158f = fVar;
        }

        public final void run() {
            Log.m105924i("MicroMsg.CleanService", "Delete image query, talker count: " + this.f288156d.size());
            try {
                C65347o0 o0Var = (C65347o0) C86312j.m106911c(C65347o0.class);
                List<String> list = this.f288156d;
                CancellationSignal cancellationSignal = this.f288157e;
                C98312f fVar = this.f288158f;
                for (String str : list) {
                    if (cancellationSignal != null) {
                        cancellationSignal.throwIfCanceled();
                    }
                    o0Var.mo89078iG(str);
                    int[] iArr = fVar.f288166g;
                    iArr[2] = iArr[2] + 1;
                    fVar.mo137603b();
                }
            } catch (OperationCanceledException unused) {
            }
        }
    }

    /* renamed from: h11.a$c */
    public static final class C98310c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List<String> f288159d;

        /* renamed from: e */
        public final /* synthetic */ CancellationSignal f288160e;

        /* renamed from: f */
        public final /* synthetic */ long f288161f;

        /* renamed from: g */
        public final /* synthetic */ C98312f f288162g;

        public C98310c(List<String> list, CancellationSignal cancellationSignal, long j, C98312f fVar) {
            this.f288159d = list;
            this.f288160e = cancellationSignal;
            this.f288161f = j;
            this.f288162g = fVar;
        }

        public final void run() {
            Log.m105924i("MicroMsg.CleanService", "Delete FTS, talker count: " + this.f288159d.size());
            try {
                C31505r2 r2Var = (C31505r2) C86312j.m106911c(C31505r2.class);
                List<String> list = this.f288159d;
                CancellationSignal cancellationSignal = this.f288160e;
                long j = this.f288161f;
                C98312f fVar = this.f288162g;
                for (String str : list) {
                    if (cancellationSignal != null) {
                        cancellationSignal.throwIfCanceled();
                    }
                    r2Var.mo58206XN(str, j);
                    int[] iArr = fVar.f288166g;
                    iArr[3] = iArr[3] + 1;
                    fVar.mo137603b();
                }
            } catch (OperationCanceledException unused) {
            }
        }
    }

    /* renamed from: Zu */
    public void mo136894Zu(List<String> list, C97629n2.C97630a aVar, long j, long j2, boolean z, boolean z2, CancellationSignal cancellationSignal) {
        List<String> list2 = list;
        C97629n2.C97630a aVar2 = aVar;
        CancellationSignal cancellationSignal2 = cancellationSignal;
        C87412m.m108594g(list2, "talkers");
        long currentTimeMillis = System.currentTimeMillis();
        C98312f fVar = new C98312f(list.size(), aVar2, z2);
        C102506a aVar3 = C102506a.f301832a;
        C102506a.f301840i = false;
        Log.m105924i("MicroMsg.CleanService", "Scan WxFileIndex for message delete");
        try {
            aVar3.mo142124j((C102522u) null, cancellationSignal2);
        } catch (OperationCanceledException unused) {
        }
        C101028a.m132398a(true);
        ArrayList arrayList = new ArrayList();
        C119179t tVar = C119157j.f356862d;
        C98586h hVar = r0;
        String str = "MicroMsg.CleanService";
        C98312f fVar2 = fVar;
        C98586h hVar2 = new C98586h(list, (List<C98895d>) null, (int[]) null, j, j2, false, fVar, cancellationSignal);
        ArrayList<C34379c> arrayList2 = arrayList;
        arrayList2.add(((C119157j) tVar).mo183870a(hVar));
        arrayList2.add(((C119157j) C119157j.f356862d).mo183870a(new C98308a(list, fVar2, j, j2, cancellationSignal)));
        C98312f fVar3 = fVar2;
        arrayList2.add(((C119157j) C119157j.f356862d).mo183870a(new C98309b(list2, cancellationSignal2, fVar3)));
        arrayList2.add(((C119157j) C119157j.f356862d).mo183870a(new C98310c(list, cancellationSignal, j2, fVar3)));
        for (C34379c cVar : arrayList2) {
            cVar.get();
        }
        C102506a aVar4 = C102506a.f301832a;
        C102506a.f301840i = true;
        C102506a.m135309i(15, System.currentTimeMillis() - currentTimeMillis, Long.valueOf(fVar3.f288167h), Long.valueOf((long) fVar3.f288168i));
        boolean isCanceled = cancellationSignal2 != null ? cancellationSignal.isCanceled() : false;
        Log.m105924i(str, "Done sync delete messages, time: " + (System.currentTimeMillis() - currentTimeMillis) + ", cancelled: " + isCanceled);
        if (aVar2 != null) {
            aVar2.mo24602b(isCanceled);
        }
    }
}
