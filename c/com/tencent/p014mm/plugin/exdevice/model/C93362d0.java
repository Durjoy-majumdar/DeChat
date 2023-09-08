package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import java.util.ArrayList;
import java.util.LinkedList;
import z71.C53753b;

/* renamed from: com.tencent.mm.plugin.exdevice.model.d0 */
public class C93362d0 implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C93367y f269418d;

    public C93362d0(C93367y yVar) {
        this.f269418d = yVar;
    }

    public boolean onTimerExpired() {
        int size = ((LinkedList) this.f269418d.f269463v).size();
        for (int i = 0; i < size; i++) {
            if (((C53753b) ((LinkedList) this.f269418d.f269463v).get(i)).f150091H.contains("internet_to_device") && ((C53753b) ((LinkedList) this.f269418d.f269463v).get(i)).f150091H.contains("wechat_to_device")) {
                C93367y yVar = this.f269418d;
                if (!((ArrayList) yVar.f269464w).contains(((LinkedList) yVar.f269463v).get(i))) {
                    C93367y yVar2 = this.f269418d;
                    ((ArrayList) yVar2.f269464w).add((C53753b) ((LinkedList) yVar2.f269463v).get(i));
                    C93367y yVar3 = this.f269418d;
                    C93367y.m117899a(yVar3, yVar3.f269464w);
                }
            }
        }
        return true;
    }
}
