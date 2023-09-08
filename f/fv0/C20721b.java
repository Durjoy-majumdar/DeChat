package fv0;

import com.tencent.p014mm.plugin.backup.backuppcui.BackupMigratePCUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: fv0.b */
public final class C20721b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BackupMigratePCUI f58583d;

    /* renamed from: e */
    public final /* synthetic */ long f58584e;

    /* renamed from: f */
    public final /* synthetic */ C32224a<C13598b0> f58585f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20721b(BackupMigratePCUI backupMigratePCUI, long j, C32224a<C13598b0> aVar) {
        super(0);
        this.f58583d = backupMigratePCUI;
        this.f58584e = j;
        this.f58585f = aVar;
    }

    public Object invoke() {
        Log.m105925i("MicroMsg.BackupMigratePCUI", "isInitData:%b, initChooseConv scan done time:%d", Boolean.valueOf(this.f58583d.f50082g), Long.valueOf(Util.milliSecondsToNow(this.f58584e)));
        BackupMigratePCUI backupMigratePCUI = this.f58583d;
        if (backupMigratePCUI.f50082g) {
            this.f58585f.invoke();
        } else {
            backupMigratePCUI.f50082g = true;
            backupMigratePCUI.mo22694N7().mo140766c();
            this.f58583d.mo22694N7().mo140764a(true);
            this.f58585f.invoke();
        }
        return C13598b0.f38549a;
    }
}
