package com.tencent.p014mm.p136ui.tools;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.p136ui.chatting.ImageDownloadUI;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.tools.d0 */
public class C7009d0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CropImageNewUI f24747d;

    public C7009d0(CropImageNewUI cropImageNewUI) {
        this.f24747d = cropImageNewUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/tools/CropImageNewUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        CropImageNewUI cropImageNewUI = this.f24747d;
        int i = CropImageNewUI.f348463t;
        long longExtra = cropImageNewUI.getIntent().getLongExtra("CropImage_Msg_Id", 0);
        long longExtra2 = cropImageNewUI.getIntent().getLongExtra("CropImage_Msg_Svr_Id", 0);
        String stringExtra = cropImageNewUI.getIntent().getStringExtra("CropImage_Username");
        Intent intent = new Intent(cropImageNewUI, ImageDownloadUI.class);
        intent.putExtra("img_msg_id", longExtra);
        intent.putExtra("img_server_id", longExtra2);
        intent.putExtra("img_download_compress_type", 1);
        intent.putExtra("img_download_username", stringExtra);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        CropImageNewUI cropImageNewUI2 = cropImageNewUI;
        C117292a.m165358d(cropImageNewUI2, aVar.mo10232b(), "com/tencent/mm/ui/tools/CropImageNewUI", "viewHdImg", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        cropImageNewUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(cropImageNewUI2, "com/tencent/mm/ui/tools/CropImageNewUI", "viewHdImg", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/ui/tools/CropImageNewUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
