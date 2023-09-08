package com.tencent.p014mm.plugin.dbbackup;

import com.tencent.mars.comm.WakerLock;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import eb0.C97625j3;
import f40.C86709a0;
import p156gj.C87203t;
import p823sg.C90193h;

/* renamed from: com.tencent.mm.plugin.dbbackup.m */
public class C93098m implements C93095a {

    /* renamed from: a */
    public int f268221a = 0;

    /* renamed from: b */
    public final /* synthetic */ C86009m1 f268222b;

    /* renamed from: c */
    public final /* synthetic */ C93095a f268223c;

    /* renamed from: d */
    public final /* synthetic */ WakerLock f268224d;

    /* renamed from: e */
    public final /* synthetic */ C115392k f268225e;

    public C93098m(C115392k kVar, C86009m1 m1Var, C93095a aVar, WakerLock wakerLock) {
        this.f268225e = kVar;
        this.f268222b = m1Var;
        this.f268223c = aVar;
        this.f268224d = wakerLock;
    }

    /* renamed from: a */
    public void mo127599a(int i) {
        int i2 = this.f268221a;
        int i3 = 0;
        if (i2 > 0) {
            Log.m105925i("MicroMsg.SubCoreDBBackup", "Recovery stage %d result: %d", Integer.valueOf(i2), Integer.valueOf(i));
        }
        if (i == 0) {
            this.f268222b.mo119966f();
            C115669n.INSTANCE.idkeyStat(181, 29, 1, true);
            C93095a aVar = this.f268223c;
            if (aVar != null) {
                aVar.mo127599a(i);
            }
            this.f268224d.unLock();
        } else if (i == -2) {
            this.f268222b.mo119966f();
            C115669n.INSTANCE.idkeyStat(181, 3, 1, true);
            C93095a aVar2 = this.f268223c;
            if (aVar2 != null) {
                aVar2.mo127599a(i);
            }
            this.f268224d.unLock();
        } else {
            int i4 = this.f268221a + 1;
            this.f268221a = i4;
            if (i4 == 1) {
                Log.m105925i("MicroMsg.SubCoreDBBackup", "Database recovery stage %d: REPAIR", Integer.valueOf(i4));
                i3 = this.f268225e.yx0((String) null, this);
            } else if (i4 == 2) {
                Log.m105925i("MicroMsg.SubCoreDBBackup", "Database recovery stage %d: BACKUP RECOVER", Integer.valueOf(i4));
                this.f268225e.xx0((String) null, this);
            } else if (i4 != 3) {
                this.f268222b.mo119966f();
                C115669n.INSTANCE.idkeyStat(181, 30, 1, true);
                C93095a aVar3 = this.f268223c;
                if (aVar3 != null) {
                    aVar3.mo127599a(i);
                }
                this.f268224d.unLock();
                return;
            } else {
                Log.m105925i("MicroMsg.SubCoreDBBackup", "Database recovery stage %d: DUMP", Integer.valueOf(i4));
                C115392k kVar = this.f268225e;
                kVar.getClass();
                C97625j3.m125812b().getClass();
                C86709a0.m107528h();
                String o = C86709a0.m107535s().mo121148o();
                if (o != null && !o.isEmpty()) {
                    C86009m1 m1Var = new C86009m1(o);
                    if (m1Var.mo119961a()) {
                        String substring = C90193h.m112878f((C87203t.m108270f(true) + C97625j3.m125812b().mo105881G()).getBytes()).substring(0, 7);
                        long r = m1Var.mo119980r() * 2;
                        long dataAvailableSize = Util.getDataAvailableSize();
                        Log.m105925i("MicroMsg.SubCoreDBBackup", "db recover needSize : %d blockSize:%d", Long.valueOf(r), Long.valueOf(dataAvailableSize));
                        if (dataAvailableSize < r) {
                            i3 = -2;
                        } else {
                            C86709a0.m107525e().setHighPriority();
                            C86709a0.m107525e().postAtFrontOfQueueToWorker(new C93096l(kVar, m1Var, substring, this));
                        }
                    }
                }
                i3 = -3;
            }
            if (i3 != 0) {
                mo127599a(i3);
            }
        }
    }
}
