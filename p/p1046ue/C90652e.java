package p1046ue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p1046ue.C90650d;
import p1053ve.C90769b;
import p1053ve.C90771e;

/* renamed from: ue.e */
public class C90652e {

    /* renamed from: f */
    public static final C90652e f260459f = new C90652e();

    /* renamed from: a */
    public final List<C90654b> f260460a = new LinkedList();

    /* renamed from: b */
    public final List<C90650d> f260461b = new LinkedList();

    /* renamed from: c */
    public final List<Long> f260462c = new LinkedList();

    /* renamed from: d */
    public final Map<Long, Set<Long>> f260463d = new HashMap();

    /* renamed from: e */
    public final List<Long> f260464e = new ArrayList();

    /* renamed from: ue.e$a */
    public class C90653a implements Comparator<C90649c> {
        public C90653a(C90652e eVar) {
        }

        public int compare(Object obj, Object obj2) {
            int i = ((((C90649c) obj2).f260440d - ((C90649c) obj).f260440d) > 0 ? 1 : ((((C90649c) obj2).f260440d - ((C90649c) obj).f260440d) == 0 ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i == 0 ? 0 : -1;
        }
    }

    /* renamed from: ue.e$b */
    public interface C90654b {
        /* renamed from: a */
        void mo124799a(C90650d dVar);

        /* renamed from: b */
        void mo124800b(C90650d dVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c5, code lost:
        r0 = r13.f260460a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c7, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r1 = r13.f260460a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d2, code lost:
        if (r1.hasNext() == false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d4, code lost:
        r2 = r1.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00da, code lost:
        if (r2 == null) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00dc, code lost:
        r2.mo124799a(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e1, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo124793a(p1046ue.C90650d r14) {
        /*
            r13 = this;
            if (r14 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.Map<java.lang.Long, java.util.Set<java.lang.Long>> r0 = r13.f260463d
            monitor-enter(r0)
            java.util.Map<java.lang.Long, java.util.Set<java.lang.Long>> r1 = r13.f260463d     // Catch:{ all -> 0x00e8 }
            long r2 = r14.f260448g     // Catch:{ all -> 0x00e8 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00e8 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ all -> 0x00e8 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x00e8 }
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ all -> 0x00e8 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e8 }
            java.util.List<ue.d> r2 = r13.f260461b
            monitor-enter(r2)
            java.util.List<ue.d> r0 = r13.f260461b     // Catch:{ all -> 0x00e5 }
            java.util.LinkedList r0 = (java.util.LinkedList) r0     // Catch:{ all -> 0x00e5 }
            int r0 = r0.indexOf(r14)     // Catch:{ all -> 0x00e5 }
            r3 = 1
            r4 = 0
            r5 = -1
            if (r5 != r0) goto L_0x0069
            if (r1 == 0) goto L_0x0069
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00e5 }
        L_0x002d:
            boolean r6 = r1.hasNext()     // Catch:{ all -> 0x00e5 }
            if (r6 == 0) goto L_0x0069
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00e5 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x00e5 }
            ue.d r12 = new ue.d     // Catch:{ all -> 0x00e5 }
            ue.d$a r7 = r14.f260446e     // Catch:{ all -> 0x00e5 }
            int r8 = r14.f260443b     // Catch:{ all -> 0x00e5 }
            java.lang.String r9 = r14.f260442a     // Catch:{ all -> 0x00e5 }
            long r10 = r0.longValue()     // Catch:{ all -> 0x00e5 }
            r6 = r12
            r6.<init>(r7, r8, r9, r10)     // Catch:{ all -> 0x00e5 }
            java.util.List<ue.d> r6 = r13.f260461b     // Catch:{ all -> 0x00e5 }
            java.util.LinkedList r6 = (java.util.LinkedList) r6     // Catch:{ all -> 0x00e5 }
            int r6 = r6.indexOf(r12)     // Catch:{ all -> 0x00e5 }
            if (r6 == r5) goto L_0x0067
            java.lang.String r14 = "Matrix.ResRecordManager"
            java.lang.String r1 = "del info found with shared context: %d, %s"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x00e5 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00e5 }
            r7[r4] = r8     // Catch:{ all -> 0x00e5 }
            r7[r3] = r0     // Catch:{ all -> 0x00e5 }
            p723vf.C118672d.m167351a(r14, r1, r7)     // Catch:{ all -> 0x00e5 }
            r0 = r6
            goto L_0x0069
        L_0x0067:
            r0 = r6
            goto L_0x002d
        L_0x0069:
            if (r5 != r0) goto L_0x0076
            java.lang.String r14 = "Matrix.ResRecordManager"
            java.lang.String r0 = "del info not found"
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x00e5 }
            p723vf.C118672d.m167351a(r14, r0, r1)     // Catch:{ all -> 0x00e5 }
            monitor-exit(r2)     // Catch:{ all -> 0x00e5 }
            return
        L_0x0076:
            java.util.List<ue.d> r14 = r13.f260461b     // Catch:{ all -> 0x00e5 }
            java.util.LinkedList r14 = (java.util.LinkedList) r14     // Catch:{ all -> 0x00e5 }
            java.lang.Object r14 = r14.get(r0)     // Catch:{ all -> 0x00e5 }
            ue.d r14 = (p1046ue.C90650d) r14     // Catch:{ all -> 0x00e5 }
            if (r14 != 0) goto L_0x0084
            monitor-exit(r2)     // Catch:{ all -> 0x00e5 }
            return
        L_0x0084:
            java.util.concurrent.atomic.AtomicInteger r0 = r14.f260452k     // Catch:{ all -> 0x00e5 }
            int r1 = r0.get()     // Catch:{ all -> 0x00e5 }
            int r1 = r1 - r3
            r0.set(r1)     // Catch:{ all -> 0x00e5 }
            int r0 = r0.get()     // Catch:{ all -> 0x00e5 }
            r1 = 0
            if (r0 != 0) goto L_0x00a3
            long r3 = r14.f260445d     // Catch:{ all -> 0x00e5 }
            com.tencent.matrix.openglleak.hook.OpenGLHook.releaseNative(r3)     // Catch:{ all -> 0x00e5 }
            ve.e$a r0 = r14.f260444c     // Catch:{ all -> 0x00e5 }
            if (r0 == 0) goto L_0x00a3
            r0.mo124896a()     // Catch:{ all -> 0x00e5 }
            r14.f260444c = r1     // Catch:{ all -> 0x00e5 }
        L_0x00a3:
            ue.b r0 = r14.f260447f     // Catch:{ all -> 0x00e5 }
            if (r0 == 0) goto L_0x00bd
            long r3 = r0.f260433i     // Catch:{ all -> 0x00e5 }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00bd
            com.tencent.matrix.openglleak.hook.OpenGLHook.releaseNative(r3)     // Catch:{ all -> 0x00e5 }
            r0.f260433i = r5     // Catch:{ all -> 0x00e5 }
            ve.e$a r3 = r0.f260432h     // Catch:{ all -> 0x00e5 }
            if (r3 == 0) goto L_0x00bd
            r3.mo124896a()     // Catch:{ all -> 0x00e5 }
            r0.f260432h = r1     // Catch:{ all -> 0x00e5 }
        L_0x00bd:
            java.util.List<ue.d> r0 = r13.f260461b     // Catch:{ all -> 0x00e5 }
            java.util.LinkedList r0 = (java.util.LinkedList) r0     // Catch:{ all -> 0x00e5 }
            r0.remove(r14)     // Catch:{ all -> 0x00e5 }
            monitor-exit(r2)     // Catch:{ all -> 0x00e5 }
            java.util.List<ue.e$b> r0 = r13.f260460a
            monitor-enter(r0)
            java.util.List<ue.e$b> r1 = r13.f260460a     // Catch:{ all -> 0x00e2 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00e2 }
        L_0x00ce:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00e2 }
            if (r2 == 0) goto L_0x00e0
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00e2 }
            ue.e$b r2 = (p1046ue.C90652e.C90654b) r2     // Catch:{ all -> 0x00e2 }
            if (r2 == 0) goto L_0x00ce
            r2.mo124799a(r14)     // Catch:{ all -> 0x00e2 }
            goto L_0x00ce
        L_0x00e0:
            monitor-exit(r0)     // Catch:{ all -> 0x00e2 }
            return
        L_0x00e2:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e2 }
            throw r14
        L_0x00e5:
            r14 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00e5 }
            throw r14
        L_0x00e8:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e8 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p1046ue.C90652e.mo124793a(ue.d):void");
    }

    /* renamed from: b */
    public String mo124794b() {
        int i;
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < ((LinkedList) this.f260461b).size(); i2++) {
            C90650d dVar = (C90650d) ((LinkedList) this.f260461b).get(i2);
            int hashCode = dVar.mo124786a().hashCode();
            int hashCode2 = dVar.mo124787b().hashCode();
            C90648b bVar = dVar.f260447f;
            if (bVar == null) {
                i = 0;
            } else {
                C90771e.C90772a aVar = bVar.f260432h;
                i = (aVar == null ? "" : aVar.f260668a).hashCode();
            }
            long hashCode3 = ((long) (hashCode + hashCode2 + (bVar == null ? 0 : bVar.mo124781a().hashCode()) + i)) + dVar.f260448g + ((long) dVar.f260451j.hashCode()) + ((long) dVar.f260442a.hashCode()) + (dVar.mo124788c() ? 1 : 0);
            C90649c cVar = (C90649c) hashMap.get(Long.valueOf(hashCode3));
            if (cVar == null) {
                hashMap.put(Long.valueOf(hashCode3), new C90649c(dVar));
            } else {
                C90650d.C90651a aVar2 = dVar.f260446e;
                C90650d dVar2 = cVar.f260437a;
                boolean z = aVar2 == dVar2.f260446e;
                boolean equals = dVar.f260442a.equals(dVar2.f260442a);
                long j = dVar.f260448g;
                C90650d dVar3 = cVar.f260437a;
                boolean z2 = j == dVar3.f260448g;
                boolean equals2 = dVar.f260451j.equals(dVar3.f260451j);
                boolean z3 = dVar.mo124788c() == cVar.f260437a.mo124788c();
                if (z && equals && z2 && equals2 && z3) {
                    int i3 = dVar.f260443b;
                    cVar.f260441e++;
                    ((ArrayList) cVar.f260438b).add(Integer.valueOf(i3));
                    if (cVar.f260437a.f260447f != null) {
                        cVar.mo124785a(dVar.f260447f);
                        cVar.f260440d += dVar.f260447f.mo124782b();
                    }
                    hashMap.put(Long.valueOf(hashCode3), cVar);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (C90649c cVar2 : hashMap.values()) {
            if (cVar2.f260437a.f260446e == C90650d.C90651a.TEXTURE) {
                arrayList.add(cVar2);
            }
            if (cVar2.f260437a.f260446e == C90650d.C90651a.BUFFER) {
                arrayList2.add(cVar2);
            }
            if (cVar2.f260437a.f260446e == C90650d.C90651a.FRAME_BUFFERS) {
                arrayList3.add(cVar2);
            }
            if (cVar2.f260437a.f260446e == C90650d.C90651a.RENDER_BUFFERS) {
                arrayList4.add(cVar2);
            }
            if (cVar2.f260437a.f260446e == C90650d.C90651a.EGL_CONTEXT) {
                arrayList5.add(cVar2);
            }
        }
        C90653a aVar3 = new C90653a(this);
        Collections.sort(arrayList, aVar3);
        Collections.sort(arrayList2, aVar3);
        Collections.sort(arrayList3, aVar3);
        Collections.sort(arrayList4, aVar3);
        Collections.sort(arrayList5, aVar3);
        C90769b bVar2 = new C90769b();
        StringBuilder sb = bVar2.f260664a;
        sb.append("-------------------------------------------------------------------------");
        sb.append("\n");
        bVar2.mo124894c(String.format("textures Count = %d", new Object[]{Integer.valueOf(arrayList.size())}), 3);
        bVar2.mo124894c(String.format("buffer Count = %d", new Object[]{Integer.valueOf(arrayList2.size())}), 3);
        bVar2.mo124894c(String.format("framebuffer Count = %d", new Object[]{Integer.valueOf(arrayList3.size())}), 3);
        bVar2.mo124894c(String.format("renderbuffer Count = %d", new Object[]{Integer.valueOf(arrayList4.size())}), 3);
        bVar2.mo124894c(String.format("egl context Count = %d", new Object[]{Integer.valueOf(arrayList5.size())}), 3);
        StringBuilder sb4 = bVar2.f260664a;
        sb4.append("-------------------------------------------------------------------------");
        sb4.append("\n");
        bVar2.mo124893b();
        bVar2.mo124894c("texture part :", 3);
        bVar2.mo124893b();
        bVar2.mo124892a(mo124797e(arrayList));
        bVar2.mo124893b();
        bVar2.mo124894c("buffers part :", 3);
        bVar2.mo124893b();
        bVar2.mo124892a(mo124797e(arrayList2));
        bVar2.mo124893b();
        bVar2.mo124894c("renderbuffer part :", 3);
        bVar2.mo124893b();
        bVar2.mo124892a(mo124797e(arrayList4));
        bVar2.mo124893b();
        bVar2.mo124894c("egl context part :", 3);
        bVar2.mo124893b();
        bVar2.mo124892a(mo124797e(arrayList5));
        bVar2.f260664a.append("\n");
        return bVar2.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        return null;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p1046ue.C90650d mo124795c(p1046ue.C90650d.C90651a r7, long r8, int r10) {
        /*
            r6 = this;
            java.util.List<ue.d> r0 = r6.f260461b
            monitor-enter(r0)
            java.util.List<ue.d> r1 = r6.f260461b     // Catch:{ all -> 0x002b }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x002b }
        L_0x0009:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x002b }
            if (r2 == 0) goto L_0x0028
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x002b }
            ue.d r2 = (p1046ue.C90650d) r2     // Catch:{ all -> 0x002b }
            if (r2 != 0) goto L_0x0018
            goto L_0x0028
        L_0x0018:
            ue.d$a r3 = r2.f260446e     // Catch:{ all -> 0x002b }
            if (r7 != r3) goto L_0x0009
            long r3 = r2.f260448g     // Catch:{ all -> 0x002b }
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x0009
            int r3 = r2.f260443b     // Catch:{ all -> 0x002b }
            if (r3 != r10) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return r2
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            r7 = 0
            return r7
        L_0x002b:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p1046ue.C90652e.mo124795c(ue.d$a, long, int):ue.d");
    }

    /* renamed from: d */
    public void mo124796d(C90650d dVar) {
        if (dVar != null) {
            synchronized (this.f260461b) {
                ((LinkedList) this.f260461b).add(dVar);
            }
            synchronized (this.f260460a) {
                for (C90654b next : this.f260460a) {
                    if (next != null) {
                        next.mo124800b(dVar);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final String mo124797e(List<C90649c> list) {
        C90769b bVar = new C90769b();
        for (C90649c next : list) {
            bVar.mo124892a(String.format(" alloc count = %d", new Object[]{Integer.valueOf(next.f260441e)}));
            bVar.mo124892a(String.format(" egl context is release = %s", new Object[]{Boolean.valueOf(next.f260437a.mo124788c())}));
            bVar.mo124892a(String.format(" egl surface is release = %s", new Object[]{Boolean.valueOf(next.f260437a.mo124789d())}));
            bVar.mo124892a(String.format(" total size = %s", new Object[]{Long.valueOf(next.f260440d)}));
            bVar.mo124892a(String.format(" id = %s", new Object[]{next.f260438b.toString()}));
            bVar.mo124892a(String.format(" activity = %s", new Object[]{next.f260437a.f260451j.f260663b}));
            bVar.mo124892a(String.format(" type = %s", new Object[]{next.f260437a.f260446e}));
            bVar.mo124892a(String.format(" eglContext = %s", new Object[]{Long.valueOf(next.f260437a.f260448g)}));
            bVar.mo124892a(String.format(" java stack = %s", new Object[]{next.f260437a.mo124786a()}));
            bVar.mo124892a(String.format(" native stack = %s", new Object[]{next.f260437a.mo124787b()}));
            String str = "";
            if (next.f260437a.f260447f != null) {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb4 = new StringBuilder();
                for (int i = 0; i < ((ArrayList) next.f260439c).size(); i++) {
                    sb4.append(" ");
                    sb4.append((String) ((ArrayList) next.f260439c).get(i));
                    sb4.append("\n");
                }
                sb.append(sb4.toString());
                sb.append("\n");
                Object[] objArr = new Object[1];
                C90771e.C90772a aVar = next.f260437a.f260447f.f260432h;
                if (aVar != null) {
                    str = aVar.f260668a;
                }
                objArr[0] = str;
                sb.append(String.format(" memory java stack = %s", objArr));
                sb.append("\n");
                sb.append(String.format(" memory native stack = %s", new Object[]{next.f260437a.f260447f.mo124781a()}));
                str = sb.toString();
            }
            bVar.mo124892a(str);
            bVar.f260664a.append("\n");
        }
        return bVar.toString();
    }
}
