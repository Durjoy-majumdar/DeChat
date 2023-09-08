package com.tencent.p014mm.plugin.textstatus.p112ui;

import android.view.View;
import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import j20.C117292a;
import java.util.ArrayList;
import qy2.C77446d0;
import qy2.C77459z;
import vz2.C78501d;

/* renamed from: com.tencent.mm.plugin.textstatus.ui.i */
public final class C71541i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TextStatusOtherTopicFriendsActivity f207299d;

    public C71541i(TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity) {
        this.f207299d = textStatusOtherTopicFriendsActivity;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusOtherTopicFriendsActivity$onCreate$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C77459z zVar = new C77459z();
        zVar.f229404i = 15;
        zVar.f229418z = IStatusIconHelperKt.m39109a().mo62276F();
        C77446d0.f225875a.mo107616c(this.f207299d.getContext(), zVar, 1001);
        C78501d.m94805g(C78501d.f229945a, 36, (String) null, (String) null, 0, (String) null, 0, 62, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusOtherTopicFriendsActivity$onCreate$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
