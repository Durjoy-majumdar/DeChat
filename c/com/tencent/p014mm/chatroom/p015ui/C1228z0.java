package com.tencent.p014mm.chatroom.p015ui;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import qo3.C77407n;
import te3.C52310zu3;

/* renamed from: com.tencent.mm.chatroom.ui.z0 */
public class C1228z0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C52310zu3 f10269d;

    /* renamed from: e */
    public final /* synthetic */ ManageChatroomUI f10270e;

    public C1228z0(ManageChatroomUI manageChatroomUI, C52310zu3 zu32) {
        this.f10270e = manageChatroomUI;
        this.f10269d = zu32;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/chatroom/ui/ManageChatroomUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f10270e.f108081r.mo140680z();
        ManageChatroomUI manageChatroomUI = this.f10270e;
        C52310zu3 zu32 = this.f10269d;
        C77407n nVar = new C77407n((Context) manageChatroomUI.getContext(), 1, true);
        nVar.mo107568m(Util.safeFormatString(manageChatroomUI.getString(C0966R.string.b4c, new Object[]{zu32.f146230e}), new Object[0]), 17, C76577a.m92151b(manageChatroomUI, 14));
        nVar.f225771i = new C1201a1(manageChatroomUI);
        nVar.f225782p = new C1207b1(manageChatroomUI, zu32, nVar);
        nVar.mo107573q();
        C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/ManageChatroomUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
