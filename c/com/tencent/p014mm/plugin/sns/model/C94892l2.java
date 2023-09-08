package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.C96071m8;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.sns.model.l2 */
public class C94892l2 implements C94893m {

    /* renamed from: d */
    public List<WeakReference<C94893m>> f274981d = new LinkedList();

    /* renamed from: a */
    public void mo131073a(int i, String str, long j, TimeLineObject timeLineObject, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onItemRemove", "com.tencent.mm.plugin.sns.model.TimelineAREvent");
        for (WeakReference next : this.f274981d) {
            if (!(next == null || next.get() == null)) {
                ((C94893m) next.get()).mo131073a(i, str, j, timeLineObject, z);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onItemRemove", "com.tencent.mm.plugin.sns.model.TimelineAREvent");
    }

    /* renamed from: b */
    public void mo131074b(int i, String str, long j, TimeLineObject timeLineObject, boolean z, C96071m8 m8Var) {
        SnsMethodCalculate.markStartTimeMs("onItemAdd", "com.tencent.mm.plugin.sns.model.TimelineAREvent");
        for (WeakReference next : this.f274981d) {
            if (!(next == null || next.get() == null)) {
                ((C94893m) next.get()).mo131074b(i, str, j, timeLineObject, z, m8Var);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onItemAdd", "com.tencent.mm.plugin.sns.model.TimelineAREvent");
    }

    /* renamed from: c */
    public void mo131075c(C94893m mVar) {
        SnsMethodCalculate.markStartTimeMs("addListener", "com.tencent.mm.plugin.sns.model.TimelineAREvent");
        for (WeakReference next : this.f274981d) {
            if (next != null && next.get() != null && ((C94893m) next.get()).equals(mVar)) {
                SnsMethodCalculate.markEndTimeMs("addListener", "com.tencent.mm.plugin.sns.model.TimelineAREvent");
                return;
            }
        }
        ((LinkedList) this.f274981d).add(new WeakReference(mVar));
        SnsMethodCalculate.markEndTimeMs("addListener", "com.tencent.mm.plugin.sns.model.TimelineAREvent");
    }
}
