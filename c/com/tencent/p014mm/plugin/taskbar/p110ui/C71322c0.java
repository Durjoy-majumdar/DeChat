package com.tencent.p014mm.plugin.taskbar.p110ui;

import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarViewPresenter;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import p565ir.C60606n;
import te3.C64273c21;
import te3.C64766v41;
import vx2.C37860g;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.c0 */
public final class C71322c0 implements C60606n.C60608b {

    /* renamed from: a */
    public final /* synthetic */ TaskBarViewPresenter f206557a;

    /* renamed from: b */
    public final /* synthetic */ HashMap<Long, C64766v41> f206558b;

    /* renamed from: c */
    public final /* synthetic */ HashMap<Long, MultiTaskInfo> f206559c;

    public C71322c0(TaskBarViewPresenter taskBarViewPresenter, HashMap<Long, C64766v41> hashMap, HashMap<Long, MultiTaskInfo> hashMap2) {
        this.f206557a = taskBarViewPresenter;
        this.f206558b = hashMap;
        this.f206559c = hashMap2;
    }

    /* renamed from: a */
    public void mo83467a(Map<Long, Integer> map, int i) {
        TaskBarViewPresenter.C30482a aVar;
        byte[] bArr;
        FinderObject finderObject;
        C64273c21 c212;
        C87412m.m108594g(map, "map");
        if (i > 0) {
            Log.m105924i("MicroMsg.TaskBarViewPresenter", "new interval:" + i);
            this.f206557a.f206533l = i;
        }
        boolean z = false;
        HashMap<Long, C64766v41> hashMap = this.f206558b;
        HashMap<Long, MultiTaskInfo> hashMap2 = this.f206559c;
        for (Map.Entry next : map.entrySet()) {
            if (((Number) next.getValue()).intValue() == 2) {
                C64766v41 v412 = hashMap.get(next.getKey());
                if (!(v412 == null || (finderObject = v412.f185835n) == null || (c212 = finderObject.liveInfo) == null)) {
                    c212.f182394f = 2;
                }
                MultiTaskInfo multiTaskInfo = hashMap2.get(next.getKey());
                if (multiTaskInfo != null) {
                    Log.m105924i("MicroMsg.TaskBarViewPresenter", "live end: " + multiTaskInfo.mo80305m2().f183751d);
                    if (v412 == null || (bArr = v412.toByteArray()) == null) {
                        bArr = multiTaskInfo.field_data;
                    }
                    multiTaskInfo.field_data = bArr;
                    ((C37860g) C86312j.m106911c(C37860g.class)).mo61365E1(multiTaskInfo.field_id, true, 2);
                    z = true;
                }
            }
        }
        if (z && (aVar = this.f206557a.f206522a) != null) {
            TaskBarView taskBarView = (TaskBarView) aVar;
            taskBarView.post(new C71349y(taskBarView));
        }
    }
}
