package ke2;

import android.content.ContentValues;
import android.content.Context;
import android.os.Looper;
import androidx.camera.core.FocusMeteringAction;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.modelimage.C92822e;
import com.tencent.p014mm.plugin.priority.model.c2c.img.C2CImgAutoDownloader;
import com.tencent.p014mm.plugin.priority.model.c2c.img.C94292a;
import com.tencent.p014mm.plugin.priority.model.c2c.img.C94293b;
import com.tencent.p014mm.plugin.priority.model.c2c.img.C94294c;
import com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.wcdb.database.SQLiteDatabase;
import di3.C86312j;
import eb0.C31543z5;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import gy3.C87412m;
import h81.C32735h;
import i21.C98591h;
import i40.C60247c;
import i40.C98597b;
import i40.C98598e;
import java.util.Calendar;
import java.util.HashSet;
import java.util.LinkedList;
import kj2.C117407d;
import lc3.C10485b;
import le2.C99412b;
import ne2.C100112b;
import of3.C100326a;
import p158gt.C98201k;
import p749xh.C102676x0;
import pe2.C100784d;
import pe2.C100785e;
import pe2.C100788h;
import re2.C101371a;
import re2.C101373b;
import re2.C101374c;
import se2.C101585a;
import se2.C101589b;
import se2.C101590c;
import se2.C101591d;
import te2.C101746c;
import te2.C101747e;
import te2.C101750g;
import xe2.C102631b;
import xe2.C102632d;
import xe2.C102633e;
import ye2.C102840c;
import ye2.C102841d;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: ke2.c */
public class C99129c extends C98598e implements C99412b {

    /* renamed from: A */
    public C2CMsgPreDownloader f290655A;

    /* renamed from: B */
    public C75875l.C75877b f290656B = new C99130a();

    /* renamed from: C */
    public MStorageEx.IOnStorageChange f290657C = new C99132b();

    /* renamed from: D */
    public MStorageEx.IOnStorageChange f290658D = new C99133c();

    /* renamed from: i */
    public long f290659i;

    /* renamed from: j */
    public C100785e f290660j;

    /* renamed from: n */
    public C94293b f290661n;

    /* renamed from: o */
    public C101590c f290662o;

    /* renamed from: p */
    public C94294c f290663p;

    /* renamed from: q */
    public C101591d f290664q;

    /* renamed from: r */
    public C101374c f290665r;

    /* renamed from: s */
    public C101373b f290666s;

    /* renamed from: t */
    public C100788h f290667t;

    /* renamed from: u */
    public C94292a f290668u;

    /* renamed from: v */
    public C101589b f290669v;

    /* renamed from: w */
    public C101371a f290670w;

    /* renamed from: x */
    public C2CImgAutoDownloader f290671x;

    /* renamed from: y */
    public C101585a f290672y;

    /* renamed from: z */
    public C102631b f290673z;

    /* renamed from: ke2.c$a */
    public class C99130a implements C75875l.C75877b {

        /* renamed from: ke2.c$a$a */
        public class C99131a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C75875l.C45886e f290675d;

            public C99131a(C75875l.C45886e eVar) {
                this.f290675d = eVar;
            }

            public void run() {
                C99129c.Ax0(C99129c.this, this.f290675d);
            }
        }

        public C99130a() {
        }

        /* renamed from: w5 */
        public void mo26106w5(C75875l lVar, C75875l.C45886e eVar) {
            if (!CrashReportFactory.isBackupMerge()) {
                if (((C32735h) C86312j.m106911c(C32735h.class)).mo58782dM(new C100326a()) == 1) {
                    ((C119157j) C119157j.f356862d).mo183876g(new C99131a(eVar), "C2CPreloadThread");
                    return;
                }
                C99129c.Ax0(C99129c.this, eVar);
            }
        }
    }

    /* renamed from: ke2.c$b */
    public class C99132b implements MStorageEx.IOnStorageChange {
        public C99132b() {
        }

        public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
            String str = (String) obj;
            if (!Util.isNullOrNil(str) && i == 5) {
                C99129c cVar = C99129c.this;
                cVar.requireAccountInitialized();
                if (cVar.f290667t != null) {
                    C99129c cVar2 = C99129c.this;
                    cVar2.requireAccountInitialized();
                    cVar2.f290667t.mo140229a(new C102841d(str));
                }
            }
        }
    }

    /* renamed from: ke2.c$c */
    public class C99133c implements MStorageEx.IOnStorageChange {
        public C99133c() {
        }

        public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
            String str = (String) obj;
            if (!Util.isNullOrNil(str) && i == 5) {
                C99129c cVar = C99129c.this;
                cVar.requireAccountInitialized();
                if (cVar.f290667t != null) {
                    C99129c cVar2 = C99129c.this;
                    cVar2.requireAccountInitialized();
                    cVar2.f290667t.mo140229a(new C102841d(str));
                }
            }
        }
    }

    /* renamed from: ke2.c$d */
    public class C99134d implements Runnable {
        public C99134d(C99130a aVar) {
        }

        public void run() {
            C39622i0 a;
            C39622i0 a2;
            Class<C60247c> cls = C60247c.class;
            Class cls2 = C102632d.class;
            long currentTimeMillis = System.currentTimeMillis();
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_PRIORITY_DB_VERSION_INT;
            int j = i.mo119689j(aVar, 0);
            if (j != 7) {
                Log.m105925i("MicroMsg.Priority.PluginPriority", "New DB FILE %d %d", Integer.valueOf(j), 7);
                C86709a0.m107528h();
                C86013q1.m106447h(new C86009m1(C86709a0.m107535s().f251807e, "MicroMsgPriority.db").mo119971i());
                C86709a0.m107535s().mo121142i().mo119677K(aVar, 7);
            }
            C99129c cVar = C99129c.this;
            C86709a0.m107528h();
            cVar.f290660j = new C100785e(C86709a0.m107535s().f251807e);
            C99129c cVar2 = C99129c.this;
            cVar2.f290659i = cVar2.f290660j.mo140223e(16777217, 0);
            C99129c cVar3 = C99129c.this;
            if (cVar3.f290659i == 0) {
                cVar3.f290659i = System.currentTimeMillis();
                C99129c cVar4 = C99129c.this;
                cVar4.f290660j.mo140227i(16777217, cVar4.f290659i);
            }
            Log.m105925i("MicroMsg.Priority.PluginPriority", "install priority time %s", C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, C99129c.this.f290659i / 1000));
            C99129c cVar5 = C99129c.this;
            cVar5.f290661n = new C94293b(cVar5.f290660j);
            C99129c cVar6 = C99129c.this;
            cVar6.f290662o = new C101590c(cVar6.f290660j);
            C99129c cVar7 = C99129c.this;
            cVar7.f290663p = new C94294c(cVar7.f290660j);
            C99129c cVar8 = C99129c.this;
            cVar8.f290664q = new C101591d(cVar8.f290660j);
            C99129c cVar9 = C99129c.this;
            cVar9.f290665r = new C101374c(cVar9.f290660j);
            C99129c cVar10 = C99129c.this;
            cVar10.f290666s = new C101373b(cVar10.f290660j);
            C99129c.this.f290667t = new C100788h();
            C99129c cVar11 = C99129c.this;
            cVar11.f290668u = new C94292a();
            cVar11.f290669v = new C101589b();
            cVar11.f290671x = new C2CImgAutoDownloader();
            C99129c cVar12 = C99129c.this;
            cVar12.f290672y = new C101585a();
            cVar12.f290670w = new C101371a();
            C85801v1 i2 = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_PREDOWNLOAD_CHECK_DB_VERSION_INT;
            String str = C86709a0.m107535s().f251807e + "PreDownloadCheck.db";
            if (!C87412m.m108589b(i2.mo119685f(aVar2, 0), 2)) {
                Log.m105924i("MicroMsg.PreDownloadCheckDB", "diff version, delete old db;");
                C86013q1.m106447h(str);
            }
            byte[] bArr = C60247c.f171776h;
            synchronized (bArr) {
                C86709a0.m107523b().mo121108c();
                if (cls.isAssignableFrom(cls2)) {
                    a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls2);
                } else {
                    throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
            }
            if (((C102632d) a).mo85232c3(str)) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar2, 2);
            }
            C99129c cVar13 = C99129c.this;
            synchronized (bArr) {
                C86709a0.m107523b().mo121108c();
                if (cls.isAssignableFrom(cls2)) {
                    a2 = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls2);
                } else {
                    throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
            }
            cVar13.f290673z = (C102631b) ((C102632d) a2).mo85233d3(C102631b.class);
            C102631b bVar = C99129c.this.f290673z;
            bVar.getClass();
            SingleTable singleTable = C102676x0.f303129u;
            ContentValues contentValues = new ContentValues();
            contentValues.put("Status", 1);
            Log.m105924i("MicroMsg.C2CPreDownloadStorage", "c2c pre download update downloading msg count : " + singleTable.update(contentValues).where(C102676x0.f303133y.equal((Number) 2)).build().run(bVar.getDbProvider().getDB()));
            C102631b bVar2 = C99129c.this.f290673z;
            bVar2.getClass();
            Log.m105924i("MicroMsg.C2CPreDownloadStorage", "delete old pre download msg, res:" + singleTable.delete().log("MicroMsg.C2CPreDownloadStorage").where(C102676x0.f303110C.smallerThan((Number) Long.valueOf(C31543z5.m39453c() - 7776000000L))).build().run(bVar2.getDbProvider().getDB()));
            C99129c.this.f290655A = new C2CMsgPreDownloader();
            C99129c.this.f290655A.f272437i.alive();
            C100788h hVar = C99129c.this.f290667t;
            hVar.getClass();
            Log.m105924i("MicroMsg.Priority.PriorityTaskRunner", "start tick");
            C100788h.C100789a aVar3 = hVar.f295257b;
            if (aVar3 != null) {
                aVar3.sendEmptyMessageDelayed(2, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
            }
            C100788h.C100789a aVar4 = hVar.f295257b;
            if (aVar4 != null) {
                aVar4.sendEmptyMessage(0);
            }
            long e = C99129c.this.f290660j.mo140223e(16777218, -1);
            long j2 = (long) Calendar.getInstance().get(5);
            if (j2 != e) {
                String format = String.format("%d,%d", new Object[]{Long.valueOf(Util.nullAs((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_AUTOGETBIG_IMG_CURRENT_LONG, (Object) null), 0)), Long.valueOf((long) Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("ChatImgAutoDownloadMax"), 0))});
                Log.m105925i("MicroMsg.Priority.PriorityReportLogic", "report16341 %s", format);
                C117407d.INSTANCE.kvStat(16341, format);
                C99129c.this.f290660j.mo140227i(16777218, j2);
            }
            ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101137qq(C99129c.this.f290656B, (Looper) null);
            C94293b bVar3 = C99129c.this.f290661n;
            bVar3.getClass();
            bVar3.f272421a.mo140222d(String.format("DELETE FROM %s WHERE createtime < ?", new Object[]{"C2CMsgAutoDownloadRes"}), new String[]{String.valueOf(System.currentTimeMillis() - 7776000000L)});
            C99129c.this.f290667t.mo140229a(new C102840c());
            Log.m105925i("MicroMsg.Priority.PluginPriority", "Init Priority Use Time %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public static void Ax0(C99129c cVar, C75875l.C45886e eVar) {
        cVar.getClass();
        Class cls = C99129c.class;
        Class cls2 = C98591h.class;
        int i = 0;
        if (eVar.f123845b.equals("insert")) {
            while (i < eVar.f123846c.size()) {
                C72963f4 f4Var = eVar.f123846c.get(i);
                if (f4Var.mo108769t2() == 0) {
                    cVar.Bx0().mo141175i3(f4Var);
                }
                if (f4Var.mo108769t2() != 0 || !f4Var.mo100979R3()) {
                    if (f4Var.mo108769t2() == 0 && f4Var.mo101020w3() && C101750g.f297828a.mo141183c(4, f4Var.mo108768t()) == 0) {
                        ((C98591h) C86312j.m106911c(cls2)).mo137976tH(f4Var);
                    }
                } else if (C101750g.f297828a.mo141183c(1, f4Var.mo108768t()) == 0) {
                    ((C98591h) C86312j.m106911c(cls2)).mo137972lk(f4Var);
                }
                cVar.requireAccountInitialized();
                if (cVar.f290670w != null) {
                    if (f4Var.mo108769t2() == 1) {
                        cVar.requireAccountInitialized();
                        C101371a aVar = cVar.f290670w;
                        String t = f4Var.mo108768t();
                        aVar.getClass();
                        C99129c cVar2 = (C99129c) C86312j.m106911c(cls);
                        cVar2.requireAccountInitialized();
                        cVar2.f290667t.mo140229a(new C101371a.C101372a(aVar, t, 1));
                    } else {
                        cVar.requireAccountInitialized();
                        C101371a aVar2 = cVar.f290670w;
                        String t2 = f4Var.mo108768t();
                        aVar2.getClass();
                        C99129c cVar3 = (C99129c) C86312j.m106911c(cls);
                        cVar3.requireAccountInitialized();
                        cVar3.f290667t.mo140229a(new C101371a.C101372a(aVar2, t2, 3));
                    }
                }
                i++;
            }
        } else if (eVar.f123845b.equals("update")) {
            while (i < eVar.f123846c.size()) {
                C72963f4 f4Var2 = eVar.f123846c.get(i);
                if (f4Var2.mo108769t2() == 0) {
                    if (f4Var2.mo101020w3()) {
                        cVar.Bx0().mo141175i3(f4Var2);
                    }
                    if (f4Var2.getType() == 268445456) {
                        cVar.Bx0().mo141176j3(f4Var2);
                    }
                }
                i++;
            }
        } else if (eVar.f123845b.equals("delete")) {
            while (i < eVar.f123846c.size()) {
                C72963f4 f4Var3 = eVar.f123846c.get(i);
                if (f4Var3.mo108769t2() == 0) {
                    cVar.Bx0().mo141176j3(f4Var3);
                }
                i++;
            }
        }
    }

    public C101746c Bx0() {
        return (C101746c) C98597b.f289091e.mo85231a(this, C101746c.class);
    }

    public C102633e Cx0() {
        return (C102633e) C98597b.f289091e.mo85231a(this, C102633e.class);
    }

    /* renamed from: Gp */
    public void mo138503Gp() {
        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101137qq(this.f290656B, (Looper) null);
    }

    /* renamed from: IG */
    public C100112b mo138504IG() {
        return this.f290671x;
    }

    /* renamed from: Wa */
    public void mo138505Wa() {
        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).sy0(this.f290656B);
    }

    public void wx0(HashSet<Class<? extends C98597b>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        hashSet.add(C101747e.class);
        hashSet.add(C102633e.class);
        hashSet.add(C101746c.class);
    }

    public void yx0(Context context) {
        Class cls = C75700k0.class;
        new C99134d((C99130a) null).run();
        C30650a.m39147b(new C100784d(), "//priority");
        ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku().add(this.f290657C);
        ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().add(this.f290658D);
    }

    public void zx0() {
        Class cls = C75700k0.class;
        ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku().remove(this.f290657C);
        ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().remove(this.f290658D);
        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).sy0(this.f290656B);
        C2CMsgPreDownloader c2CMsgPreDownloader = this.f290655A;
        if (c2CMsgPreDownloader != null) {
            c2CMsgPreDownloader.f272437i.dead();
        }
        C2CImgAutoDownloader c2CImgAutoDownloader = this.f290671x;
        if (c2CImgAutoDownloader != null) {
            c2CImgAutoDownloader.f272409d = 0;
            ((C92822e) ((C98201k) C86312j.m106911c(C98201k.class)).Jp0()).mo127102d(c2CImgAutoDownloader);
            c2CImgAutoDownloader.f272417o.dead();
            this.f290671x = null;
        }
        C94292a aVar = this.f290668u;
        if (aVar != null) {
            aVar.getClass();
            this.f290668u = null;
        }
        C100788h hVar = this.f290667t;
        if (hVar != null) {
            ((LinkedList) hVar.f295256a).clear();
            hVar.f295257b.removeCallbacksAndMessages((Object) null);
            hVar.f295257b.quit();
            hVar.f295257b = null;
            this.f290667t = null;
        }
        C94293b bVar = this.f290661n;
        if (bVar != null) {
            bVar.f272422b.close();
            bVar.f272423c.close();
            bVar.f272425e.close();
            bVar.f272426f.close();
            bVar.f272427g.close();
            bVar.f272428h.close();
            bVar.f272424d.close();
            this.f290661n = null;
        }
        C94294c cVar = this.f290663p;
        if (cVar != null) {
            cVar.f296008b.close();
            cVar.f296009c.close();
            cVar.f296010d.close();
        }
        C100785e eVar = this.f290660j;
        if (eVar != null) {
            Object[] objArr = new Object[2];
            SQLiteDatabase sQLiteDatabase = eVar.f295252a;
            objArr[0] = sQLiteDatabase;
            objArr[1] = Boolean.valueOf(sQLiteDatabase == null ? false : sQLiteDatabase.isOpen());
            Log.m105929w("MicroMsg.Priority.PriorityDB", "close db:%s isOpen:%b ", objArr);
            SQLiteDatabase sQLiteDatabase2 = eVar.f295252a;
            if (sQLiteDatabase2 != null && sQLiteDatabase2.isOpen()) {
                Log.m105929w("MicroMsg.Priority.PriorityDB", "close in trans :%b ", Boolean.valueOf(eVar.f295252a.inTransaction()));
                while (eVar.f295252a.inTransaction()) {
                    eVar.f295252a.endTransaction();
                }
                eVar.f295253b.close();
                eVar.f295254c.close();
                eVar.f295255d.close();
                eVar.f295252a.close();
                eVar.f295252a = null;
            }
            this.f290660j = null;
        }
    }
}
