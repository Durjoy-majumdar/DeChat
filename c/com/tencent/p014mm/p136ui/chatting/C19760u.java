package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.content.Intent;
import c02.C92331c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import j20.C117292a;
import k20.C9556a;
import k92.C108976d;
import nj3.C76879j;
import p159gw.C98250h;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.ui.chatting.u */
public class C19760u implements C76879j.C76888o {

    /* renamed from: a */
    public final /* synthetic */ AppAttachNewDownloadUI f56181a;

    public C19760u(AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f56181a = appAttachNewDownloadUI;
    }

    /* renamed from: a */
    public void mo5759a(int i, int i2) {
        boolean z;
        int i3 = i2;
        boolean z2 = true;
        boolean z3 = false;
        if (i3 == 20) {
            AppAttachNewDownloadUI appAttachNewDownloadUI = this.f56181a;
            int i4 = AppAttachNewDownloadUI.f55984e1;
            appAttachNewDownloadUI.mo26136d8(2, 7);
            C68070l.C68072b bVar = appAttachNewDownloadUI.f56044y;
            if (bVar == null || (bVar.f195626t == 0 && bVar.f195594l <= 26214400)) {
                z2 = false;
            }
            Intent intent = new Intent(appAttachNewDownloadUI, MsgRetransmitUI.class);
            intent.putExtra("Retr_Msg_content", appAttachNewDownloadUI.f56042x);
            intent.putExtra("Retr_Msg_Type", 2);
            intent.putExtra("Retr_Msg_Id", appAttachNewDownloadUI.f56038t.getMsgId());
            intent.putExtra("Retr_Big_File", z2);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(appAttachNewDownloadUI, aVar.mo10232b(), "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI", "doRestransmitMsg", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            appAttachNewDownloadUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(appAttachNewDownloadUI, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI", "doRestransmitMsg", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (i3 == 29) {
            C108976d dVar = this.f56181a.f56016Y;
            if (dVar != null) {
                dVar.mo67895G(true);
            }
        } else if (i3 == 214) {
            AppAttachNewDownloadUI appAttachNewDownloadUI2 = this.f56181a;
            if (!appAttachNewDownloadUI2.f55995K) {
                C76701a.makeText((Context) appAttachNewDownloadUI2, (CharSequence) appAttachNewDownloadUI2.getString(C0966R.string.k3a), 1).show();
            } else {
                C72683d P7 = appAttachNewDownloadUI2.mo26124P7();
                if (P7 == null) {
                    Log.m105920e("MicroMsg.AppAttachNewDownloadUI", "[-] Fail to get app attach info.");
                    z = false;
                } else {
                    z = true;
                }
                if (z && P7.field_fileFullPath == null) {
                    Log.m105920e("MicroMsg.AppAttachNewDownloadUI", "[-] field_fileFullPath == null");
                    z = false;
                }
                if (!z || C86013q1.m106450k(P7.field_fileFullPath)) {
                    z3 = z;
                } else {
                    Log.m105921e("MicroMsg.AppAttachNewDownloadUI", "[-] [%s] does not exist.", P7.field_fileFullPath);
                }
                if (z3) {
                    ((C98250h) C86312j.m106911c(C98250h.class)).pk0(appAttachNewDownloadUI2, P7.field_fileFullPath, new C19790y(appAttachNewDownloadUI2));
                } else {
                    C76701a.makeText((Context) appAttachNewDownloadUI2, (CharSequence) appAttachNewDownloadUI2.getString(C0966R.string.k3b), 1).show();
                }
            }
        } else if (i3 != 217) {
            switch (i3) {
                case 22:
                    AppAttachNewDownloadUI appAttachNewDownloadUI3 = this.f56181a;
                    int i5 = AppAttachNewDownloadUI.f55984e1;
                    appAttachNewDownloadUI3.mo26121M7();
                    break;
                case 23:
                    AppAttachNewDownloadUI appAttachNewDownloadUI4 = this.f56181a;
                    int i6 = AppAttachNewDownloadUI.f55984e1;
                    appAttachNewDownloadUI4.getClass();
                    Intent intent2 = new Intent(appAttachNewDownloadUI4, AppAttachFileListUI.class);
                    intent2.setFlags(67108864);
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent2);
                    AppAttachNewDownloadUI appAttachNewDownloadUI5 = appAttachNewDownloadUI4;
                    C117292a.m165358d(appAttachNewDownloadUI5, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI", "showFileList", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    appAttachNewDownloadUI4.startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(appAttachNewDownloadUI5, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI", "showFileList", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    C115669n.INSTANCE.mo160131h(11168, 6, 1);
                    break;
                case 24:
                    AppAttachNewDownloadUI appAttachNewDownloadUI6 = this.f56181a;
                    int i7 = AppAttachNewDownloadUI.f55984e1;
                    appAttachNewDownloadUI6.getClass();
                    Intent intent3 = new Intent();
                    intent3.setClassName(appAttachNewDownloadUI6, "com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI");
                    intent3.putExtra("Retr_Msg_Id", appAttachNewDownloadUI6.f56038t.getMsgId());
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(intent3);
                    AppAttachNewDownloadUI appAttachNewDownloadUI7 = appAttachNewDownloadUI6;
                    C117292a.m165358d(appAttachNewDownloadUI7, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI", "doOtherOpenMsg", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    appAttachNewDownloadUI6.startActivity((Intent) aVar3.mo10231a(0));
                    C117292a.m165359e(appAttachNewDownloadUI7, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI", "doOtherOpenMsg", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    break;
            }
        } else if (this.f56181a.f56014X != null) {
            ((C92331c) C86312j.m106911c(C92331c.class)).k00(this.f56181a.f56014X);
        }
        AppAttachNewDownloadUI appAttachNewDownloadUI8 = this.f56181a;
        int i8 = AppAttachNewDownloadUI.f55984e1;
        appAttachNewDownloadUI8.mo26131Y7(i3);
    }
}
