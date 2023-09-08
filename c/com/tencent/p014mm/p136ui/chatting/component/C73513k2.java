package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.p136ui.chatting.component.GroupTodoComponent;
import p684si.C77711c;

/* renamed from: com.tencent.mm.ui.chatting.component.k2 */
public class C73513k2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C77711c f215955d;

    /* renamed from: e */
    public final /* synthetic */ int f215956e;

    /* renamed from: f */
    public final /* synthetic */ GroupTodoComponent.C73354d f215957f;

    public C73513k2(GroupTodoComponent.C73354d dVar, C77711c cVar, int i) {
        this.f215957f = dVar;
        this.f215955d = cVar;
        this.f215956e = i;
    }

    public void run() {
        GroupTodoComponent.this.f215556q.add(new GroupTodoComponent.C73365j(this.f215955d, 1, 0, this.f215956e + 1));
    }
}
