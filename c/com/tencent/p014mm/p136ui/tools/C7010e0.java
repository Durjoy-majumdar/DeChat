package com.tencent.p014mm.p136ui.tools;

import android.content.Intent;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import di3.C86312j;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;
import p140cw.C7138g;

/* renamed from: com.tencent.mm.ui.tools.e0 */
public class C7010e0 implements C76879j.C11180n {

    /* renamed from: a */
    public final /* synthetic */ CropImageNewUI f24748a;

    public C7010e0(CropImageNewUI cropImageNewUI) {
        this.f24748a = cropImageNewUI;
    }

    /* renamed from: j */
    public void mo782j(int i) {
        if (i == 0) {
            CropImageNewUI cropImageNewUI = this.f24748a;
            int i2 = CropImageNewUI.f348463t;
            String stringExtra = cropImageNewUI.getIntent().getStringExtra("CropImage_ImgPath");
            int intExtra = cropImageNewUI.getIntent().getIntExtra("CropImage_CompressType", 0);
            int intExtra2 = cropImageNewUI.getIntent().getIntExtra("CropImage_Msg_Id", -1);
            Intent intent = new Intent(cropImageNewUI, MsgRetransmitUI.class);
            intent.putExtra("Retr_File_Name", stringExtra);
            intent.putExtra("Retr_Msg_Id", intExtra2);
            intent.putExtra("Retr_Msg_Type", 0);
            intent.putExtra("Retr_Compress_Type", intExtra);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            CropImageNewUI cropImageNewUI2 = cropImageNewUI;
            C117292a.m165358d(cropImageNewUI2, aVar.mo10232b(), "com/tencent/mm/ui/tools/CropImageNewUI", "doRestransmitMsg", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            cropImageNewUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(cropImageNewUI2, "com/tencent/mm/ui/tools/CropImageNewUI", "doRestransmitMsg", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (i == 1) {
            CropImageNewUI cropImageNewUI3 = this.f24748a;
            int i3 = CropImageNewUI.f348463t;
            ((C7138g) C86312j.m106911c(C7138g.class)).he0(cropImageNewUI3.getIntent().getStringExtra("CropImage_ImgPath"), cropImageNewUI3);
        }
    }
}
