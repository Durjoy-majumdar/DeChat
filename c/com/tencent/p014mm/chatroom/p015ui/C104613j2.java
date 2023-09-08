package com.tencent.p014mm.chatroom.p015ui;

import java.util.Comparator;
import p203mi.C109628a;

/* renamed from: com.tencent.mm.chatroom.ui.j2 */
public class C104613j2 implements Comparator<C109628a> {
    public C104613j2(C104608i2 i2Var) {
    }

    public int compare(Object obj, Object obj2) {
        int i = ((C109628a) obj).f328199b;
        int i2 = ((C109628a) obj2).f328199b;
        if (i > i2) {
            return 1;
        }
        return i == i2 ? 0 : -1;
    }
}
