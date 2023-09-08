package ay2;

import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import java.util.ArrayList;
import java.util.List;
import z04.C112550d0;

/* renamed from: ay2.f */
public final class C67121f {

    /* renamed from: e */
    public static final C28169a f192724e = new C28169a((C8480h) null);

    /* renamed from: f */
    public static final C67121f f192725f = new C67121f(-1, new int[0]);

    /* renamed from: a */
    public final int f192726a;

    /* renamed from: b */
    public final int[] f192727b;

    /* renamed from: c */
    public List<MultiTaskInfo> f192728c = new ArrayList();

    /* renamed from: d */
    public final List<MultiTaskInfo> f192729d = new ArrayList();

    /* renamed from: ay2.f$a */
    public static final class C28169a {
        public C28169a(C8480h hVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0045 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo55825a(int r6) {
            /*
                r5 = this;
                java.lang.Class<ky2.i> r0 = ky2.C10432i.class
                di3.d r1 = di3.C86312j.m106911c(r0)
                ky2.i r1 = (ky2.C10432i) r1
                boolean r1 = r1.mo10750e()
                r2 = 0
                if (r1 != 0) goto L_0x0010
                return r2
            L_0x0010:
                r1 = 2
                r3 = 1
                if (r6 == r3) goto L_0x0039
                if (r6 == r1) goto L_0x002c
                r4 = 21
                if (r6 == r4) goto L_0x001f
                r4 = 22
                if (r6 == r4) goto L_0x001f
                goto L_0x0046
            L_0x001f:
                di3.d r6 = di3.C86312j.m106911c(r0)
                ky2.i r6 = (ky2.C10432i) r6
                int r6 = r6.mo10740Mn()
                if (r6 != r1) goto L_0x0046
                goto L_0x0045
            L_0x002c:
                di3.d r6 = di3.C86312j.m106911c(r0)
                ky2.i r6 = (ky2.C10432i) r6
                int r6 = r6.mo10751fd()
                if (r6 != r1) goto L_0x0046
                goto L_0x0045
            L_0x0039:
                di3.d r6 = di3.C86312j.m106911c(r0)
                ky2.i r6 = (ky2.C10432i) r6
                int r6 = r6.Oh0()
                if (r6 != r1) goto L_0x0046
            L_0x0045:
                r2 = 1
            L_0x0046:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: ay2.C67121f.C28169a.mo55825a(int):boolean");
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0060  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo55826b(int r10) {
            /*
                r9 = this;
                java.lang.Class<h81.h> r0 = h81.C32735h.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                h81.h r0 = (h81.C32735h) r0
                h81.h$c r1 = h81.C32735h.C32737c.clicfg_taskbar_disable_snapshot_show
                java.lang.String r2 = "-1"
                java.lang.String r3 = r0.Y60(r1, r2)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "block expt: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "MicroMsg.TaskBarSectionViewModel"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                r0 = 1
                r2 = 0
                java.lang.String r4 = "expt"
                gy3.C87412m.m108593f(r3, r4)     // Catch:{ all -> 0x0053 }
                java.lang.String r4 = ","
                java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch:{ all -> 0x0053 }
                r5 = 0
                r6 = 0
                r7 = 6
                r8 = 0
                java.util.List r3 = z04.C112550d0.m153785U(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0053 }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0053 }
            L_0x003f:
                boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0053 }
                if (r4 == 0) goto L_0x005d
                java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0053 }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0053 }
                int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ all -> 0x0053 }
                if (r10 != r4) goto L_0x003f
                r1 = 1
                goto L_0x005e
            L_0x0053:
                r3 = move-exception
                java.lang.Object[] r4 = new java.lang.Object[r0]
                r4[r2] = r3
                java.lang.String r3 = "failed"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r4)
            L_0x005d:
                r1 = 0
            L_0x005e:
                if (r1 != 0) goto L_0x006f
                r1 = 2
                if (r10 == r1) goto L_0x006b
                r1 = 3
                if (r10 == r1) goto L_0x006b
                r1 = 4
                if (r10 == r1) goto L_0x006b
                r10 = 0
                goto L_0x006c
            L_0x006b:
                r10 = 1
            L_0x006c:
                if (r10 == 0) goto L_0x006f
                goto L_0x0070
            L_0x006f:
                r0 = 0
            L_0x0070:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ay2.C67121f.C28169a.mo55826b(int):boolean");
        }

        /* renamed from: c */
        public final ArrayList<Integer> mo55827c() {
            ArrayList<Integer> arrayList = new ArrayList<>();
            String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_taskbar_disable_other_type_show, "-1");
            try {
                C87412m.m108593f(Y60, "expt");
                for (String parseInt : C112550d0.m153785U(Y60, new String[]{","}, false, 0, 6, (Object) null)) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(parseInt)));
                }
            } catch (Throwable th) {
                Log.m105925i("MicroMsg.TaskBarSectionViewModel", StateEvent.ProcessResult.FAILED, th);
            }
            Log.m105924i("MicroMsg.TaskBarSectionViewModel", "block expt: " + Y60);
            return arrayList;
        }
    }

    public C67121f(int i, int[] iArr) {
        C87412m.m108594g(iArr, "multiTaskTypes");
        this.f192726a = i;
        this.f192727b = iArr;
    }
}
