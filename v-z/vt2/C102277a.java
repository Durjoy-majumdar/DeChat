package vt2;

import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gu2.C98214b;
import iu2.C98799a;

/* renamed from: vt2.a */
public final class C102277a extends C102278b {
    /* renamed from: a */
    public final void mo141839a(MvvmList<C98799a> mvvmList, C98214b bVar) {
        SnsMethodCalculate.markStartTimeMs("handleDelete", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataDelete");
        C98214b bVar2 = new C98214b();
        bVar2.convertFrom(bVar.mo142397l2(), false);
        mvvmList.mo129612p(new C98799a(bVar2));
        SnsMethodCalculate.markEndTimeMs("handleDelete", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataDelete");
    }
}
