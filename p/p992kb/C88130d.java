package p992kb;

import p992kb.C88127c;

/* renamed from: kb.d */
public class C88130d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f254897d;

    /* renamed from: e */
    public final /* synthetic */ C88127c f254898e;

    public C88130d(C88127c cVar, long j) {
        this.f254898e = cVar;
        this.f254897d = j;
    }

    public void run() {
        if (this.f254897d > 0) {
            synchronized (this.f254898e.f254894j) {
                long j = this.f254897d;
                if (j < 5120) {
                    if (this.f254898e.f254894j.mo122523a(0)) {
                        C88127c.C88129b bVar = this.f254898e.f254894j;
                        bVar.put(0, bVar.get(0) + 1);
                    } else {
                        this.f254898e.f254894j.put(0, 1);
                    }
                } else if (j < 10240) {
                    if (this.f254898e.f254894j.mo122523a(1)) {
                        C88127c.C88129b bVar2 = this.f254898e.f254894j;
                        bVar2.put(1, bVar2.get(1) + 1);
                    } else {
                        this.f254898e.f254894j.put(1, 1);
                    }
                } else if (j < 20480) {
                    if (this.f254898e.f254894j.mo122523a(2)) {
                        C88127c.C88129b bVar3 = this.f254898e.f254894j;
                        bVar3.put(2, bVar3.get(2) + 1);
                    } else {
                        this.f254898e.f254894j.put(2, 1);
                    }
                } else if (j < 51200) {
                    if (this.f254898e.f254894j.mo122523a(3)) {
                        C88127c.C88129b bVar4 = this.f254898e.f254894j;
                        bVar4.put(3, bVar4.get(3) + 1);
                    } else {
                        this.f254898e.f254894j.put(3, 1);
                    }
                } else if (j < 102400) {
                    if (this.f254898e.f254894j.mo122523a(4)) {
                        C88127c.C88129b bVar5 = this.f254898e.f254894j;
                        bVar5.put(4, bVar5.get(4) + 1);
                    } else {
                        this.f254898e.f254894j.put(4, 1);
                    }
                } else if (j < 153600) {
                    if (this.f254898e.f254894j.mo122523a(5)) {
                        C88127c.C88129b bVar6 = this.f254898e.f254894j;
                        bVar6.put(5, bVar6.get(5) + 1);
                    } else {
                        this.f254898e.f254894j.put(5, 1);
                    }
                } else if (j < 204800) {
                    if (this.f254898e.f254894j.mo122523a(6)) {
                        C88127c.C88129b bVar7 = this.f254898e.f254894j;
                        bVar7.put(6, bVar7.get(6) + 1);
                    } else {
                        this.f254898e.f254894j.put(6, 1);
                    }
                } else if (j < 512000) {
                    if (this.f254898e.f254894j.mo122523a(7)) {
                        C88127c.C88129b bVar8 = this.f254898e.f254894j;
                        bVar8.put(7, bVar8.get(7) + 1);
                    } else {
                        this.f254898e.f254894j.put(7, 1);
                    }
                } else if (j < 1048576) {
                    if (this.f254898e.f254894j.mo122523a(8)) {
                        C88127c.C88129b bVar9 = this.f254898e.f254894j;
                        bVar9.put(8, bVar9.get(8) + 1);
                    } else {
                        this.f254898e.f254894j.put(8, 1);
                    }
                } else if (j < 2097152) {
                    if (this.f254898e.f254894j.mo122523a(9)) {
                        C88127c.C88129b bVar10 = this.f254898e.f254894j;
                        bVar10.put(9, bVar10.get(9) + 1);
                    } else {
                        this.f254898e.f254894j.put(9, 1);
                    }
                } else if (j < 3145728) {
                    if (this.f254898e.f254894j.mo122523a(10)) {
                        C88127c.C88129b bVar11 = this.f254898e.f254894j;
                        bVar11.put(10, bVar11.get(10) + 1);
                    } else {
                        this.f254898e.f254894j.put(10, 1);
                    }
                } else if (this.f254898e.f254894j.mo122523a(11)) {
                    C88127c.C88129b bVar12 = this.f254898e.f254894j;
                    bVar12.put(11, bVar12.get(11) + 1);
                } else {
                    this.f254898e.f254894j.put(11, 1);
                }
            }
        }
    }
}
