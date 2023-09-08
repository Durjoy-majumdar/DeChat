package com.tencent.p014mm.plugin.dbbackup;

import android.net.Uri;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.repair.BackupKit;
import com.tencent.wcdb.repair.RepairKit;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import eb0.C75566c;
import f40.C86709a0;
import java.util.Date;
import p156gj.C87203t;
import p823sg.C48380r;
import p823sg.C90193h;

/* renamed from: com.tencent.mm.plugin.dbbackup.j */
public class C115391j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C93095a f345869d;

    /* renamed from: e */
    public final /* synthetic */ C75566c f345870e;

    /* renamed from: f */
    public final /* synthetic */ String f345871f;

    /* renamed from: g */
    public final /* synthetic */ boolean f345872g;

    /* renamed from: h */
    public final /* synthetic */ SQLiteDatabase f345873h;

    /* renamed from: i */
    public final /* synthetic */ String f345874i;

    /* renamed from: j */
    public final /* synthetic */ String f345875j;

    /* renamed from: n */
    public final /* synthetic */ String f345876n;

    /* renamed from: o */
    public final /* synthetic */ long[] f345877o;

    /* renamed from: p */
    public final /* synthetic */ long[] f345878p;

    /* renamed from: q */
    public final /* synthetic */ int f345879q;

    /* renamed from: r */
    public final /* synthetic */ String[] f345880r;

    /* renamed from: s */
    public final /* synthetic */ String f345881s;

    /* renamed from: t */
    public final /* synthetic */ C115392k f345882t;

    public C115391j(C115392k kVar, C93095a aVar, C75566c cVar, String str, boolean z, SQLiteDatabase sQLiteDatabase, String str2, String str3, String str4, long[] jArr, long[] jArr2, int i, String[] strArr, String str5) {
        this.f345882t = kVar;
        this.f345869d = aVar;
        this.f345870e = cVar;
        this.f345871f = str;
        this.f345872g = z;
        this.f345873h = sQLiteDatabase;
        this.f345874i = str2;
        this.f345875j = str3;
        this.f345876n = str4;
        this.f345877o = jArr;
        this.f345878p = jArr2;
        this.f345879q = i;
        this.f345880r = strArr;
        this.f345881s = str5;
    }

    /* JADX INFO: finally extract failed */
    public void run() {
        long j;
        long j2;
        int i;
        int i2;
        if (!this.f345882t.f345887g) {
            C93095a aVar = this.f345869d;
            if (aVar != null) {
                aVar.mo127599a(1);
                return;
            }
            return;
        }
        this.f345882t.f345884d = null;
        try {
            long nanoTime = System.nanoTime();
            byte[] g = C90193h.m112879g((C87203t.m108270f(true) + this.f345870e.mo105881G()).getBytes());
            C86009m1 m1Var = new C86009m1(this.f345871f);
            if (!this.f345872g || !m1Var.mo119967g()) {
                boolean save = RepairKit.MasterInfo.save(this.f345873h, C48380r.m53726a(this.f345874i, true), g);
                C86009m1 m1Var2 = new C86009m1(this.f345874i);
                if (save) {
                    m1Var.mo119966f();
                    save = m1Var2.mo119988y(m1Var);
                } else {
                    m1Var2.mo119966f();
                }
                long nanoTime2 = System.nanoTime() - nanoTime;
                Object[] objArr = new Object[2];
                objArr[0] = save ? "SUCCEEDED" : "FAILED";
                objArr[1] = Float.valueOf(((float) nanoTime2) / 1.0E9f);
                Log.m105925i("MicroMsg.SubCoreDBBackup", "Master table backup %s, elapsed %.3f", objArr);
                C115669n.INSTANCE.idkeyStat(181, save ? 24 : 25, 1, false);
            }
            Uri n = C116299g2.m163858n(this.f345875j);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
            long j3 = 0;
            if (!l.mo177810a()) {
                j = 0;
            } else {
                C86001b0 q = l.f348991a.mo119945q(l.f348992b);
                j = q == null ? 0 : q.f250473c;
            }
            Uri n2 = C116299g2.m163858n(this.f345876n);
            String path2 = n2.getPath();
            if (path2 != null) {
                String k2 = C116299g2.m163855k(path2, false, false);
                if (!n2.getPath().equals(k2)) {
                    n2 = n2.buildUpon().path(k2).build();
                }
            }
            C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n2, (C116281f0.C116288h) null);
            if (!l2.mo177810a()) {
                j2 = 0;
            } else {
                C86001b0 q2 = l2.f348991a.mo119945q(l2.f348992b);
                j2 = q2 == null ? 0 : q2.f250473c;
            }
            Object[] objArr2 = new Object[3];
            String str = "incremental";
            objArr2[0] = this.f345872g ? str : "new";
            long[] jArr = this.f345877o;
            if (jArr != null) {
                j3 = jArr[0];
            }
            objArr2[1] = Long.valueOf(j3);
            objArr2[2] = Long.valueOf(this.f345878p[0]);
            Log.m105925i("MicroMsg.SubCoreDBBackup", "Backup started [%s, cursor: %d ~ %d]", objArr2);
            int i3 = this.f345872g ? CdnLogic.kMediaTypeBeatificFile : 10000;
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(11098, Integer.valueOf(i3), String.format("%d|%d|%s", new Object[]{Long.valueOf(j), Long.valueOf(j2), this.f345882t.f345889i.format(new Date())}));
            C115669n nVar2 = nVar;
            this.f345882t.f345884d = new BackupKit(this.f345873h, this.f345876n, g, this.f345879q, this.f345880r);
            int run = this.f345882t.f345884d.run();
            long nanoTime3 = System.nanoTime() - nanoTime;
            C86009m1 m1Var3 = new C86009m1(this.f345876n);
            long r = m1Var3.mo119980r();
            if (run == 0) {
                C115392k.vx0(this.f345882t, this.f345875j, this.f345878p);
                C86009m1 m1Var4 = new C86009m1(this.f345881s);
                m1Var4.mo119966f();
                m1Var3.mo119988y(m1Var4);
                if (this.f345872g) {
                    i2 = 10012;
                    i = 19;
                } else {
                    i2 = 10001;
                    i = 16;
                }
            } else {
                m1Var3.mo119966f();
                if (run == 1) {
                    if (this.f345872g) {
                        i2 = 10013;
                        i = 20;
                    } else {
                        i2 = 10002;
                        i = 17;
                    }
                } else if (this.f345872g) {
                    i2 = 10014;
                    i = 21;
                } else {
                    i2 = 10003;
                    i = 18;
                }
            }
            Object[] objArr3 = new Object[3];
            if (!this.f345872g) {
                str = "new";
            }
            objArr3[0] = str;
            objArr3[1] = run == 0 ? "succeeded" : run == 1 ? "canceled" : StateEvent.ProcessResult.FAILED;
            objArr3[2] = Float.valueOf(((float) nanoTime3) / 1.0E9f);
            Log.m105925i("MicroMsg.SubCoreDBBackup", "Database %s backup %s, elapsed %.2f seconds.", objArr3);
            nVar2.idkeyStat(181, (long) i, 1, false);
            nVar2.mo160131h(11098, Integer.valueOf(i2), String.format("%d|%d|%d|%d|%d|%s", new Object[]{Long.valueOf(j), Long.valueOf(j2), Long.valueOf(r), Integer.valueOf(this.f345882t.f345884d.statementCount()), Long.valueOf(nanoTime3 / TimeUtil.SECOND_TO_US), this.f345882t.f345889i.format(new Date())}));
            C93095a aVar2 = this.f345869d;
            if (aVar2 != null) {
                aVar2.mo127599a(run);
            }
            this.f345882t.f345884d.release();
            this.f345882t.f345884d = null;
            StringBuilder sb = new StringBuilder();
            C86709a0.m107528h();
            sb.append(C86709a0.m107535s().f251806d);
            sb.append("dbback");
            C86013q1.m106461v(sb.toString());
            String str2 = this.f345871f;
            StringBuilder sb4 = new StringBuilder();
            C86709a0.m107528h();
            sb4.append(C86709a0.m107535s().f251806d);
            sb4.append("dbback/");
            sb4.append("EnMicroMsg.db");
            sb4.append(".sm");
            C86013q1.m106442c(str2, sb4.toString());
            if (this.f345882t.f345884d != null) {
                this.f345882t.f345884d.release();
                this.f345882t.f345884d = null;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SubCoreDBBackup", e, "Failed to start database backup, path: %s", this.f345875j);
            C93095a aVar3 = this.f345869d;
            if (aVar3 != null) {
                aVar3.mo127599a(-1);
            }
            C115669n.INSTANCE.idkeyStat(181, this.f345872g ? 18 : 21, 1, false);
            if (this.f345882t.f345884d != null) {
                this.f345882t.f345884d.release();
                this.f345882t.f345884d = null;
            }
        } catch (Throwable th) {
            if (this.f345882t.f345884d != null) {
                this.f345882t.f345884d.release();
                this.f345882t.f345884d = null;
            }
            this.f345882t.f345887g = false;
            throw th;
        }
        this.f345882t.f345887g = false;
    }
}
