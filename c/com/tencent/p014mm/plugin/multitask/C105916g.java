package com.tencent.p014mm.plugin.multitask;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import gy3.C87412m;
import java.util.List;
import l92.C109294b;

/* renamed from: com.tencent.mm.plugin.multitask.g */
public final class C105916g implements C109294b {

    /* renamed from: a */
    public final /* synthetic */ C1256g<MultiTaskListParcel> f315110a;

    public C105916g(C1256g<MultiTaskListParcel> gVar) {
        this.f315110a = gVar;
    }

    /* renamed from: a */
    public void mo114815a(List<? extends MultiTaskInfo> list) {
        C87412m.m108594g(list, "multiTaskInfoList");
        this.f315110a.mo894a(new MultiTaskListParcel(list));
    }
}
