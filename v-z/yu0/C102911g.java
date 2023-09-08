package yu0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: yu0.g */
public class C102911g {

    /* renamed from: a */
    public int f303747a = 100;

    /* renamed from: b */
    public int f303748b;

    /* renamed from: c */
    public int f303749c;

    /* renamed from: d */
    public int f303750d;

    /* renamed from: e */
    public long f303751e;

    /* renamed from: f */
    public long f303752f;

    /* renamed from: g */
    public long f303753g;

    /* renamed from: h */
    public long f303754h;

    /* renamed from: i */
    public long f303755i;

    /* renamed from: j */
    public long f303756j;

    /* renamed from: k */
    public long f303757k;

    /* renamed from: l */
    public long f303758l;

    /* renamed from: a */
    public int mo142623a() {
        Log.m105919d("MicroMsg.BackupParameters", "getBackupState hash:%d, state:%d :%s", Integer.valueOf(hashCode()), Integer.valueOf(this.f303747a), Util.getStack());
        return this.f303747a;
    }

    /* renamed from: b */
    public int mo142624b() {
        long j = this.f303754h;
        if (j == 0) {
            return 1;
        }
        double d = (double) ((this.f303751e * 100) / j);
        return (int) (d <= 5.0d ? d * 4.0d : (((d - 5.0d) * 80.0d) / 95.0d) + 20.0d);
    }

    /* renamed from: c */
    public void mo142625c(int i) {
        this.f303750d = i;
    }

    /* renamed from: d */
    public void mo142626d(int i, int i2, int i3) {
        mo142628f(i);
        this.f303748b = i2;
        this.f303749c = i3;
    }

    /* renamed from: e */
    public void mo142627e(long j) {
        this.f303758l = j;
    }

    /* renamed from: f */
    public void mo142628f(int i) {
        this.f303747a = i;
        Log.m105919d("MicroMsg.BackupParameters", "setBackupState hash:%d, state:%d :%s", Integer.valueOf(hashCode()), Integer.valueOf(i), Util.getStack());
    }

    /* renamed from: g */
    public void mo142629g(int i) {
        this.f303749c = i;
    }

    /* renamed from: h */
    public void mo142630h(int i) {
        this.f303748b = i;
    }
}
