package com.tencent.p014mm.p136ui.conversation;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import xd3.C78802b;

/* renamed from: com.tencent.mm.ui.conversation.h0 */
public final class C74692h0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FolderHelper f219587d;

    /* renamed from: e */
    public final /* synthetic */ C78802b f219588e;

    public C74692h0(FolderHelper folderHelper, C78802b bVar) {
        this.f219587d = folderHelper;
        this.f219588e = bVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/conversation/FolderHelper$initBanner$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = System.currentTimeMillis();
        FolderHelper folderHelper = this.f219587d;
        if (currentTimeMillis - folderHelper.f219404K < 1000) {
            C117292a.m165361g(this, "com/tencent/mm/ui/conversation/FolderHelper$initBanner$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        folderHelper.f219404K = currentTimeMillis;
        if (this.f219588e.mo7970e()) {
            Log.m105924i("MicroMsg.FolderHelper", "fold banner clicked !");
            this.f219587d.mo103800w();
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/conversation/FolderHelper$initBanner$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
