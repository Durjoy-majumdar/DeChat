package com.tencent.p014mm.p136ui.chatting.component;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.component.GroupTodoComponent;
import eb0.C45628s0;

/* renamed from: com.tencent.mm.ui.chatting.component.l2 */
public class C73523l2 implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ GroupTodoComponent.C73354d f215973d;

    public C73523l2(GroupTodoComponent.C73354d dVar) {
        this.f215973d = dVar;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.clear();
        if (C45628s0.m50755T(GroupTodoComponent.this.f215752d.mo91577r())) {
            contextMenu.add(0, 1, 0, GroupTodoComponent.this.f215752d.mo91565f().getResources().getString(C0966R.string.b_d));
        }
        contextMenu.add(0, 2, 0, GroupTodoComponent.this.f215752d.mo91565f().getResources().getString(C0966R.string.b4o));
    }
}
