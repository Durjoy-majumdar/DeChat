package com.tencent.p014mm.chatroom.p015ui;

import com.tencent.p014mm.chatroom.p015ui.SelectMemberUI;
import java.util.Comparator;
import sf0.C77691f;

/* renamed from: com.tencent.mm.chatroom.ui.e2 */
public class C40260e2 implements Comparator<SelectMemberUI.C40249f> {

    /* renamed from: d */
    public final /* synthetic */ SelectMemberUI.C40250g f108271d;

    public C40260e2(SelectMemberUI.C40250g gVar) {
        this.f108271d = gVar;
    }

    public int compare(Object obj, Object obj2) {
        return C77691f.m93686a(this.f108271d.mo62796a(((SelectMemberUI.C40249f) obj).f108239b)).compareToIgnoreCase(C77691f.m93686a(this.f108271d.mo62796a(((SelectMemberUI.C40249f) obj2).f108239b)));
    }
}
