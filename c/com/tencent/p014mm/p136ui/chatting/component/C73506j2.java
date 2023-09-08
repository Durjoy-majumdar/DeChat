package com.tencent.p014mm.p136ui.chatting.component;

import java.util.Comparator;
import p684si.C77711c;

/* renamed from: com.tencent.mm.ui.chatting.component.j2 */
public class C73506j2 implements Comparator<C77711c> {
    public C73506j2(GroupTodoComponent groupTodoComponent) {
    }

    public int compare(Object obj, Object obj2) {
        return Long.compare(((C77711c) obj2).field_updatetime, ((C77711c) obj).field_updatetime);
    }
}
