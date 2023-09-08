package com.tencent.p014mm.modelimage;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47355o;
import p158gt.C76051j;

/* renamed from: com.tencent.mm.modelimage.e */
public class C92822e implements C11385n, C47355o, C76051j {

    /* renamed from: d */
    public final List<C92823a> f267315d = Collections.synchronizedList(new LinkedList());

    /* renamed from: e */
    public HashSet<C92823a> f267316e = new HashSet<>();

    /* renamed from: f */
    public C92823a f267317f = null;

    /* renamed from: g */
    public C92805a0 f267318g = null;

    /* renamed from: h */
    public boolean f267319h = false;

    /* renamed from: com.tencent.mm.modelimage.e$a */
    public static class C92823a {

        /* renamed from: a */
        public long f267320a;

        /* renamed from: b */
        public long f267321b;

        /* renamed from: c */
        public int f267322c;

        /* renamed from: d */
        public int f267323d;

        /* renamed from: e */
        public List<C92824b> f267324e;

        /* renamed from: f */
        public int f267325f = 0;

        public C92823a(long j, long j2, int i) {
            this.f267320a = j;
            this.f267321b = j2;
            this.f267322c = i;
            this.f267323d = 0;
        }

        /* renamed from: a */
        public boolean mo127107a(C76051j.C76052a aVar, Object obj) {
            if (this.f267324e == null) {
                this.f267324e = Collections.synchronizedList(new LinkedList());
            }
            C92824b bVar = new C92824b(aVar, obj);
            if (this.f267324e.contains(bVar)) {
                Log.m105918d("ModelImage.DownloadImgService.Task", "task item already exists");
                return false;
            }
            this.f267324e.add(bVar);
            return true;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C92823a)) {
                return false;
            }
            C92823a aVar = (C92823a) obj;
            return aVar.f267320a == this.f267320a && aVar.f267321b == this.f267321b && aVar.f267322c == this.f267322c;
        }

        public int hashCode() {
            if (this.f267325f == 0) {
                this.f267325f = (this.f267320a + "_" + this.f267321b + "_" + this.f267322c).hashCode();
            }
            return this.f267325f;
        }
    }

    /* renamed from: com.tencent.mm.modelimage.e$b */
    public static class C92824b {

        /* renamed from: a */
        public C76051j.C76052a f267326a;

        /* renamed from: b */
        public Object f267327b;

        public C92824b(C76051j.C76052a aVar, Object obj) {
            this.f267326a = aVar;
            this.f267327b = obj;
        }

        public boolean equals(Object obj) {
            return obj != null && (obj instanceof C92824b) && this.f267326a == ((C92824b) obj).f267326a;
        }
    }

    public C92822e() {
        C86709a0.m107529k().f251779b.mo123455a(109, this);
    }

    /* renamed from: a */
    public final void mo127099a(C92823a aVar) {
        if (aVar == null) {
            Log.m105920e("ModelImage.DownloadImgService", "task is null");
            return;
        }
        List<C92824b> list = aVar.f267324e;
        if (list == null) {
            Log.m105920e("ModelImage.DownloadImgService", "task callback list is null");
            return;
        }
        for (C92824b next : list) {
            C76051j.C76052a aVar2 = next.f267326a;
            if (aVar2 != null) {
                aVar2.mo102583x4(aVar.f267320a, aVar.f267321b, aVar.f267322c, aVar.f267323d, next.f267327b);
            }
        }
    }

    /* renamed from: b */
    public int mo127100b(long j, long j2, int i, Object obj, int i2, C76051j.C76052a aVar, int i3, boolean z) {
        Object obj2 = obj;
        C76051j.C76052a aVar2 = aVar;
        if (aVar2 == null) {
            Log.m105920e("ModelImage.DownloadImgService", "listener is null");
            return -1;
        }
        C92823a aVar3 = new C92823a(j, j2, i);
        aVar3.f267323d = i2;
        if (this.f267316e.contains(aVar3)) {
            Log.m105920e("ModelImage.DownloadImgService", "[" + aVar.hashCode() + "] add failed, task already done");
            return -2;
        }
        C92823a aVar4 = this.f267317f;
        if (aVar4 != null && aVar3.equals(aVar4)) {
            return this.f267317f.mo127107a(aVar2, obj2) ? 0 : -3;
        }
        int indexOf = this.f267315d.indexOf(aVar3);
        if (-1 < indexOf && indexOf < this.f267315d.size()) {
            return this.f267315d.get(indexOf).mo127107a(aVar2, obj2) ? 0 : -4;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(aVar.hashCode());
        sb.append("] no found task, create a new task(");
        long j3 = j;
        sb.append(j);
        sb.append(" ");
        sb.append(j2);
        sb.append(" ");
        sb.append(i);
        sb.append(") mLockStart: %s callbackDuration %s");
        Log.m105925i("ModelImage.DownloadImgService", sb.toString(), Boolean.valueOf(this.f267319h), Integer.valueOf(i3));
        aVar3.mo127107a(aVar2, obj2);
        if (!z || this.f267315d.size() <= 0) {
            this.f267315d.add(aVar3);
        } else {
            this.f267315d.add(0, aVar3);
        }
        mo127106h(i3);
        return 0;
    }

    /* renamed from: c */
    public boolean mo127101c(long j, long j2, int i, Object obj, int i2, C76051j.C76052a aVar) {
        return mo127100b(j, j2, i, obj, i2, aVar, -1, false) >= 0;
    }

    /* renamed from: d */
    public void mo127102d(C76051j.C76052a aVar) {
        String str;
        if (aVar == null) {
            Log.m105920e("ModelImage.DownloadImgService", "listener is null");
            return;
        }
        Log.m105924i("ModelImage.DownloadImgService", "[" + aVar.hashCode() + "] cancel all tasks of listener");
        this.f267319h = true;
        if (this.f267317f != null) {
            Log.m105925i("ModelImage.DownloadImgService", "cancelAllTaskByListener CurTaskInfo %s mTodoList %s mLockStart %s", this.f267317f.f267320a + ", " + this.f267317f.f267321b + ", " + this.f267317f.f267322c, Integer.valueOf(this.f267315d.size()), Boolean.valueOf(this.f267319h));
            mo127103e(this.f267317f);
        }
        LinkedList<C92823a> linkedList = new LinkedList<>();
        synchronized (this.f267315d) {
            linkedList.addAll(this.f267315d);
        }
        for (C92823a aVar2 : linkedList) {
            if (aVar2 != null) {
                C92824b bVar = new C92824b(aVar, (Object) null);
                if (aVar2.f267324e.contains(bVar)) {
                    aVar2.f267324e.remove(bVar);
                }
                if (aVar2.f267324e.size() <= 0) {
                    mo127103e(aVar2);
                }
            }
        }
        this.f267319h = false;
        mo127106h(-1);
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(aVar.hashCode());
        if (this.f267317f == null) {
            str = "mCurTaskInfo is null";
        } else {
            str = this.f267317f.f267320a + ", " + this.f267317f.f267321b + ", " + this.f267317f.f267322c;
        }
        objArr[1] = str;
        Log.m105925i("ModelImage.DownloadImgService", "[ %s ] cancelAllTaskByListener done mCurTaskInfo %s", objArr);
    }

    /* renamed from: e */
    public final boolean mo127103e(C92823a aVar) {
        if (aVar == null) {
            Log.m105920e("ModelImage.DownloadImgService", "task is null");
            return false;
        }
        Log.m105924i("ModelImage.DownloadImgService", "cancel scene, (" + aVar.f267320a + ", " + aVar.f267321b + ", " + aVar.f267322c + ")");
        C92823a aVar2 = this.f267317f;
        if (aVar2 != null && aVar2.equals(aVar)) {
            C86709a0.m107529k().f251779b.mo123458d(this.f267318g);
            this.f267318g = null;
            Log.m105925i("ModelImage.DownloadImgService", "cancelNetScene reset curTaskInfo (%s %s %s)", Long.valueOf(aVar.f267320a), Long.valueOf(aVar.f267321b), Integer.valueOf(aVar.f267322c));
            mo127099a(this.f267317f);
            this.f267317f = null;
            mo127106h(-1);
            return true;
        } else if (!this.f267315d.contains(aVar)) {
            return false;
        } else {
            if (this.f267315d.remove(aVar)) {
                mo127099a(aVar);
            }
            return true;
        }
    }

    /* renamed from: f */
    public boolean mo127104f(long j, long j2, int i, C76051j.C76052a aVar) {
        C92823a aVar2;
        if (aVar == null) {
            Log.m105920e("ModelImage.DownloadImgService", "listener is null");
            return false;
        }
        C92823a aVar3 = new C92823a(j, j2, i);
        C92823a aVar4 = this.f267317f;
        if (aVar4 == null || !aVar4.equals(aVar3)) {
            int indexOf = this.f267315d.indexOf(aVar3);
            aVar2 = -1 != indexOf ? this.f267315d.get(indexOf) : null;
        } else {
            aVar2 = this.f267317f;
        }
        if (aVar2 != null) {
            C92824b bVar = new C92824b(aVar, (Object) null);
            if (aVar2.f267324e.contains(bVar)) {
                aVar2.f267324e.remove(bVar);
            }
            if (aVar2.f267324e.size() <= 0) {
                mo127103e(aVar2);
            }
            Log.m105924i("ModelImage.DownloadImgService", "[" + aVar.hashCode() + "] task has been canceled, (" + j + ", " + j2 + ", " + i + ")");
            return true;
        }
        Log.m105920e("ModelImage.DownloadImgService", "[" + aVar.hashCode() + "] task no found, (" + j + ", " + j2 + ", " + i + ")");
        return false;
    }

    /* renamed from: g */
    public boolean mo127105g(long j, long j2, int i) {
        C92823a aVar = new C92823a(j, j2, i);
        C92823a aVar2 = this.f267317f;
        return (aVar2 != null && aVar2.equals(aVar)) || this.f267315d.indexOf(aVar) >= 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r1 != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105928w("ModelImage.DownloadImgService", "null == mCurTaskInfo");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        r1 = new com.tencent.p014mm.modelimage.C92805a0(r1.f267320a, r1.f267321b, r1.f267322c, r9, r10);
        r9.f267318g = r1;
        r1.f267229z = r9.f267317f.f267323d;
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("ModelImage.DownloadImgService", "do scene, (" + r9.f267317f.f267320a + ", " + r9.f267317f.f267321b + ", " + r9.f267317f.f267322c + ")");
        f40.C86709a0.m107529k().f251779b.mo123460f(r9.f267318g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0084, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo127106h(int r10) {
        /*
            r9 = this;
            java.util.List<com.tencent.mm.modelimage.e$a> r0 = r9.f267315d
            monitor-enter(r0)
            com.tencent.mm.modelimage.e$a r1 = r9.f267317f     // Catch:{ all -> 0x00d9 }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0085
            java.util.List<com.tencent.mm.modelimage.e$a> r1 = r9.f267315d     // Catch:{ all -> 0x00d9 }
            int r1 = r1.size()     // Catch:{ all -> 0x00d9 }
            if (r1 <= 0) goto L_0x0085
            boolean r1 = r9.f267319h     // Catch:{ all -> 0x00d9 }
            if (r2 != r1) goto L_0x0016
            goto L_0x0085
        L_0x0016:
            java.util.List<com.tencent.mm.modelimage.e$a> r1 = r9.f267315d     // Catch:{ all -> 0x00d9 }
            java.lang.Object r1 = r1.remove(r3)     // Catch:{ all -> 0x00d9 }
            com.tencent.mm.modelimage.e$a r1 = (com.tencent.p014mm.modelimage.C92822e.C92823a) r1     // Catch:{ all -> 0x00d9 }
            r9.f267317f = r1     // Catch:{ all -> 0x00d9 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d9 }
            if (r1 != 0) goto L_0x002c
            java.lang.String r10 = "ModelImage.DownloadImgService"
            java.lang.String r0 = "null == mCurTaskInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            return
        L_0x002c:
            com.tencent.mm.modelimage.a0 r0 = new com.tencent.mm.modelimage.a0
            long r2 = r1.f267320a
            long r4 = r1.f267321b
            int r6 = r1.f267322c
            r1 = r0
            r7 = r9
            r8 = r10
            r1.<init>(r2, r4, r6, r7, r8)
            r9.f267318g = r0
            com.tencent.mm.modelimage.e$a r10 = r9.f267317f
            int r10 = r10.f267323d
            r0.f267229z = r10
            java.lang.String r10 = "ModelImage.DownloadImgService"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "do scene, ("
            r0.append(r1)
            com.tencent.mm.modelimage.e$a r1 = r9.f267317f
            long r1 = r1.f267320a
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            com.tencent.mm.modelimage.e$a r1 = r9.f267317f
            long r1 = r1.f267321b
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            com.tencent.mm.modelimage.e$a r1 = r9.f267317f
            int r1 = r1.f267322c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            f40.g r10 = f40.C86709a0.m107529k()
            ob0.b0 r10 = r10.f251779b
            com.tencent.mm.modelimage.a0 r0 = r9.f267318g
            r10.mo123460f(r0)
            return
        L_0x0085:
            java.lang.String r10 = "ModelImage.DownloadImgService"
            java.lang.String r1 = "mCurTaskInfo %s mTodoList %s mLockStart %s"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x00d9 }
            com.tencent.mm.modelimage.e$a r5 = r9.f267317f     // Catch:{ all -> 0x00d9 }
            if (r5 != 0) goto L_0x0095
            java.lang.String r5 = "mCurTaskInfo is null"
            goto L_0x00bd
        L_0x0095:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d9 }
            r5.<init>()     // Catch:{ all -> 0x00d9 }
            com.tencent.mm.modelimage.e$a r6 = r9.f267317f     // Catch:{ all -> 0x00d9 }
            long r6 = r6.f267320a     // Catch:{ all -> 0x00d9 }
            r5.append(r6)     // Catch:{ all -> 0x00d9 }
            java.lang.String r6 = ", "
            r5.append(r6)     // Catch:{ all -> 0x00d9 }
            com.tencent.mm.modelimage.e$a r6 = r9.f267317f     // Catch:{ all -> 0x00d9 }
            long r6 = r6.f267321b     // Catch:{ all -> 0x00d9 }
            r5.append(r6)     // Catch:{ all -> 0x00d9 }
            java.lang.String r6 = ", "
            r5.append(r6)     // Catch:{ all -> 0x00d9 }
            com.tencent.mm.modelimage.e$a r6 = r9.f267317f     // Catch:{ all -> 0x00d9 }
            int r6 = r6.f267322c     // Catch:{ all -> 0x00d9 }
            r5.append(r6)     // Catch:{ all -> 0x00d9 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00d9 }
        L_0x00bd:
            r4[r3] = r5     // Catch:{ all -> 0x00d9 }
            java.util.List<com.tencent.mm.modelimage.e$a> r3 = r9.f267315d     // Catch:{ all -> 0x00d9 }
            int r3 = r3.size()     // Catch:{ all -> 0x00d9 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00d9 }
            r4[r2] = r3     // Catch:{ all -> 0x00d9 }
            r2 = 2
            boolean r3 = r9.f267319h     // Catch:{ all -> 0x00d9 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x00d9 }
            r4[r2] = r3     // Catch:{ all -> 0x00d9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r4)     // Catch:{ all -> 0x00d9 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d9 }
            return
        L_0x00d9:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d9 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelimage.C92822e.mo127106h(int):void");
    }

    /* renamed from: m */
    public void mo26221m(int i, int i2, C117747y yVar) {
        if (this.f267318g != yVar) {
            Log.m105918d("ModelImage.DownloadImgService", "scene changed");
            return;
        }
        C92823a aVar = this.f267317f;
        if (aVar != null && aVar.f267324e != null) {
            Iterator it = new ArrayList(this.f267317f.f267324e).iterator();
            while (it.hasNext()) {
                C92824b bVar = (C92824b) it.next();
                C76051j.C76052a aVar2 = bVar.f267326a;
                if (aVar2 != null) {
                    C92823a aVar3 = this.f267317f;
                    aVar2.mo102582f0(aVar3.f267320a, aVar3.f267321b, aVar3.f267322c, aVar3.f267323d, bVar.f267327b, i, i2, yVar);
                }
            }
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (this.f267318g != yVar) {
            Log.m105918d("ModelImage.DownloadImgService", "scene changed");
            return;
        }
        C92823a aVar = this.f267317f;
        if (aVar != null && aVar.f267324e != null) {
            this.f267316e.add(new C92823a(aVar.f267320a, aVar.f267321b, aVar.f267322c));
            Log.m105924i("ModelImage.DownloadImgService", "scene end, (" + this.f267317f.f267320a + ", " + this.f267317f.f267321b + ", " + this.f267317f.f267322c + ")");
            Iterator it = new ArrayList(this.f267317f.f267324e).iterator();
            while (it.hasNext()) {
                C92824b bVar = (C92824b) it.next();
                C76051j.C76052a aVar2 = bVar.f267326a;
                if (aVar2 != null) {
                    C92823a aVar3 = this.f267317f;
                    aVar2.mo102581T2(aVar3.f267320a, aVar3.f267321b, aVar3.f267322c, aVar3.f267323d, bVar.f267327b, i, i2, str, yVar);
                }
            }
            if (!(i == 0 && i2 == 0)) {
                this.f267316e.remove(this.f267317f);
            }
            this.f267317f = null;
            this.f267318g = null;
            mo127106h(-1);
        }
    }
}
