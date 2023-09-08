package com.tencent.p014mm.p136ui.chatting.component;

import android.view.View;
import android.widget.PopupWindow;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.component.GroupTodoComponent;

/* renamed from: com.tencent.mm.ui.chatting.component.n2 */
public class C73554n2 implements PopupWindow.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ View f216054d;

    public C73554n2(GroupTodoComponent.C73354d dVar, View view) {
        this.f216054d = view;
    }

    public void onDismiss() {
        this.f216054d.setBackgroundResource(C0966R.C0969drawable.f4763m9);
    }
}
