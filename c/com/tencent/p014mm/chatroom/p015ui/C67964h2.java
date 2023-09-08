package com.tencent.p014mm.chatroom.p015ui;

import com.tencent.p014mm.chatroom.p015ui.SelectServiceNotifySenderUI;
import com.tencent.p014mm.storage.C72996z1;
import java.util.Comparator;
import sf0.C77691f;

/* renamed from: com.tencent.mm.chatroom.ui.h2 */
public class C67964h2 implements Comparator<SelectServiceNotifySenderUI.C67941e> {

    /* renamed from: d */
    public final /* synthetic */ SelectServiceNotifySenderUI.C67939d f195089d;

    public C67964h2(SelectServiceNotifySenderUI.C67939d dVar) {
        this.f195089d = dVar;
    }

    public int compare(Object obj, Object obj2) {
        SelectServiceNotifySenderUI.C67939d dVar = this.f195089d;
        C72996z1 z1Var = ((SelectServiceNotifySenderUI.C67941e) obj).f195033a;
        dVar.getClass();
        String a = C77691f.m93686a(z1Var.mo62909j3());
        SelectServiceNotifySenderUI.C67939d dVar2 = this.f195089d;
        C72996z1 z1Var2 = ((SelectServiceNotifySenderUI.C67941e) obj2).f195033a;
        dVar2.getClass();
        return a.compareToIgnoreCase(C77691f.m93686a(z1Var2.mo62909j3()));
    }
}
