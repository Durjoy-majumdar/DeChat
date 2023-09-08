package iv0;

import android.view.View;
import av0.C16686a;
import com.tencent.p014mm.sdk.platformtools.Log;
import ev0.C20612a;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import yu0.C102910f;

/* renamed from: iv0.b */
public class C21139b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C21140c f59776d;

    public C21139b(C21140c cVar) {
        this.f59776d = cVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/backup/backupui/BackupChatBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i = C102910f.f303738g;
        Log.m105925i("MicroMsg.BackupChatBanner", "backupbanner onclick, backupMode[%d]", Integer.valueOf(i));
        if (i == 1) {
            int a = C20612a.m22480i().mo142622e().mo142623a();
            Log.m105925i("MicroMsg.BackupChatBanner", "backupbanner onclick, backupPcState[%d]", Integer.valueOf(a));
            if (!(a == -25 || a == -4 || a == 12 || a == 28)) {
                if (a != 100) {
                    if (!(a == 4 || a == 5 || a == 14 || a == 15)) {
                        switch (a) {
                            case 22:
                            case 23:
                                break;
                            case 24:
                            case 25:
                                Log.m105925i("MicroMsg.BackupChatBanner", "click backup banner skipToBackupPcUI,BackupPcState[%d]", Integer.valueOf(C20612a.m22480i().mo142622e().mo142623a()));
                                this.f59776d.mo33097i(true);
                                break;
                            default:
                                Log.m105925i("MicroMsg.BackupChatBanner", "click backup banner, BackupPcState[%d]", Integer.valueOf(C20612a.m22480i().mo142622e().mo142623a()));
                                break;
                        }
                    }
                } else {
                    View view2 = this.f59776d.f59777h;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            Log.m105925i("MicroMsg.BackupChatBanner", "click backup banner skipToBackupPcUI,BackupPcState[%d]", Integer.valueOf(C20612a.m22480i().mo142622e().mo142623a()));
            this.f59776d.mo33097i(false);
        } else if (i == 22) {
            int a2 = C16686a.m16193i().mo142622e().mo142623a();
            Log.m105925i("MicroMsg.BackupChatBanner", "backupbanner onclick, backupMoveState[%d]", Integer.valueOf(a2));
            if (!(a2 == -25 || a2 == -4 || a2 == 12 || a2 == 28 || a2 == 52 || a2 == 4 || a2 == 5)) {
                switch (a2) {
                    case 22:
                    case 23:
                        break;
                    case 24:
                    case 25:
                        Log.m105925i("MicroMsg.BackupChatBanner", "click backup banner skipToBackupMoveRecoverUI, backupMoveState[%d]", Integer.valueOf(a2));
                        this.f59776d.mo33096h(true);
                        break;
                    default:
                        Log.m105925i("MicroMsg.BackupChatBanner", "click backup banner,backupMoveState[%d]", Integer.valueOf(a2));
                        break;
                }
            }
            Log.m105925i("MicroMsg.BackupChatBanner", "click backup banner skipToBackupMoveRecoverUI, backupMoveState[%d]", Integer.valueOf(a2));
            this.f59776d.mo33096h(false);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
