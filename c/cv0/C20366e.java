package cv0;

import av0.C16686a;
import com.tencent.p014mm.plugin.backup.backupmoveui.BackupMoveQRCodeUI;
import sv0.C22399a;

/* renamed from: cv0.e */
public class C20366e implements C22399a {

    /* renamed from: a */
    public final /* synthetic */ BackupMoveQRCodeUI f57069a;

    public C20366e(BackupMoveQRCodeUI backupMoveQRCodeUI) {
        this.f57069a = backupMoveQRCodeUI;
    }

    /* renamed from: a */
    public void mo17691a(String str, String str2) {
        C16686a.m16193i().mo17662k().f45196q.mo75111c(str, str2);
        C16686a.m16193i().mo17662k().mo17699c(this.f57069a.f50009j);
        ((BackupMoveQRCodeUI.C18073a) this.f57069a.f50009j).mo17667K(C16686a.m16193i().mo142622e().mo142623a());
    }

    public void onFailed(int i) {
        C16686a.m16193i().mo17662k().f45196q.mo75111c((String) null, (String) null);
        C16686a.m16193i().mo17662k().mo17699c(this.f57069a.f50009j);
        ((BackupMoveQRCodeUI.C18073a) this.f57069a.f50009j).mo17667K(C16686a.m16193i().mo142622e().mo142623a());
    }
}
