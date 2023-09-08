package zu0;

import android.content.SharedPreferences;
import com.tencent.p014mm.pointers.PLong;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMConditionVariable;
import com.tencent.p014mm.sdk.platformtools.MMStack;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C97625j3;
import gv0.C20842c;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;
import oa1.C117731d;
import pv0.C62556a;
import yu0.C102910f;
import yu0.C23365c;
import yu0.C23367h;
import zt3.C119157j;

/* renamed from: zu0.k */
public class C23584k {

    /* renamed from: q */
    public static C23583j f67611q = new C23583j();

    /* renamed from: a */
    public int f67612a = C117731d.m166007c().mo182443e("clicfg_backup_db_cache_size", 20971520, false, true);

    /* renamed from: b */
    public boolean f67613b = false;

    /* renamed from: c */
    public C23365c f67614c;

    /* renamed from: d */
    public C102910f f67615d;

    /* renamed from: e */
    public int f67616e;

    /* renamed from: f */
    public AtomicLong f67617f = new AtomicLong(0);

    /* renamed from: g */
    public MMConditionVariable f67618g = new MMConditionVariable(true);

    /* renamed from: h */
    public MMConditionVariable f67619h = new MMConditionVariable(true);

    /* renamed from: i */
    public C23590t f67620i;

    /* renamed from: j */
    public C62556a f67621j = new C62556a();

    /* renamed from: k */
    public long f67622k = 0;

    /* renamed from: l */
    public long f67623l = 0;

    /* renamed from: m */
    public PLong f67624m = new PLong();

    /* renamed from: n */
    public PLong f67625n = new PLong();

    /* renamed from: o */
    public boolean f67626o = false;

    /* renamed from: p */
    public LinkedBlockingQueue<Runnable> f67627p = new LinkedBlockingQueue<>();

    public C23584k(C102910f fVar, int i, C23365c cVar) {
        this.f67615d = fVar;
        this.f67616e = i;
        this.f67614c = cVar;
        this.f67613b = false;
    }

    /* renamed from: a */
    public void mo37043a() {
        Log.m105921e("MicroMsg.BackupPackAndSend", "cancel, caller:%s", MMStack.getCaller());
        this.f67613b = true;
        this.f67618g.open();
        this.f67617f.set(0);
        C23583j jVar = f67611q;
        jVar.f67606g = true;
        jVar.mo37042b();
        this.f67626o = false;
        this.f67627p.clear();
        C23590t tVar = this.f67620i;
        if (tVar != null) {
            tVar.f67688d.set(0);
        }
    }

    /* renamed from: b */
    public void mo37044b(boolean z) {
        Log.m105924i("MicroMsg.BackupPackAndSend", "clearContinueBackupData.");
        int i = this.f67616e;
        if (i == 1) {
            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_BACKUP_PC_BACKUPING_BOOLEAN, Boolean.FALSE);
        } else if (i == 2) {
            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_BACKUP_MOVE_BACKUPING_BOOLEAN, Boolean.FALSE);
        }
        SharedPreferences.Editor edit = C102910f.m136016d().edit();
        if (z) {
            int i2 = this.f67616e;
            if (i2 == 1) {
                edit.putInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", 0);
                edit.putInt("BACKUP_PC_CHOOSE_SELECT_CONTENT_TYPE", 0);
                edit.putLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", 0);
                edit.putLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", 0);
            } else if (i2 == 2) {
                edit.putInt("BACKUP_MOVE_CHOOSE_SELECT_TIME_MODE", 0);
                edit.putInt("BACKUP_MOVE_CHOOSE_SELECT_CONTENT_TYPE", 0);
                edit.putLong("BACKUP_MOVE_CHOOSE_SELECT_START_TIME", 0);
                edit.putLong("BACKUP_MOVE_CHOOSE_SELECT_END_TIME", 0);
            }
        }
        edit.commit();
    }

    /* renamed from: c */
    public void mo37045c(Runnable runnable) {
        try {
            this.f67627p.put(runnable);
            this.f67619h.open();
        } catch (InterruptedException unused) {
        }
        if (!this.f67626o) {
            this.f67626o = true;
            ((C119157j) C119157j.f356862d).mo183884o(new k$$c(this));
        }
    }

    /* renamed from: d */
    public void mo37046d(LinkedList<C23367h> linkedList, int i, boolean z) {
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(linkedList == null ? -1 : linkedList.size());
        objArr[1] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.BackupPackAndSend", "startBackup, backupSessionList size[%d], isOnlyText[%b]", objArr);
        long currentTimeMillis = System.currentTimeMillis();
        C20842c.f58882p.mo32562c();
        ((C119157j) C119157j.f356862d).mo183884o(new k$$d(this, linkedList, z, currentTimeMillis));
    }
}
