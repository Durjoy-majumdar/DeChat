package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import te3.C101802kr2;
import te3.C101804kv2;
import yn2.C102882s0;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$32$$a */
public final /* synthetic */ class SnsCommentDetailUI$32$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsCommentDetailUI.C9550332 f278029d;

    /* renamed from: e */
    public final /* synthetic */ String f278030e;

    /* renamed from: f */
    public final /* synthetic */ AtomicInteger f278031f;

    /* renamed from: g */
    public final /* synthetic */ Map f278032g;

    /* renamed from: h */
    public final /* synthetic */ boolean f278033h;

    /* renamed from: i */
    public final /* synthetic */ List f278034i;

    /* renamed from: j */
    public final /* synthetic */ C101802kr2 f278035j;

    /* renamed from: n */
    public final /* synthetic */ Runnable f278036n;

    public /* synthetic */ SnsCommentDetailUI$32$$a(SnsCommentDetailUI.C9550332 r1, String str, AtomicInteger atomicInteger, Map map, boolean z, List list, C101802kr2 kr22, Runnable runnable) {
        this.f278029d = r1;
        this.f278030e = str;
        this.f278031f = atomicInteger;
        this.f278032g = map;
        this.f278033h = z;
        this.f278034i = list;
        this.f278035j = kr22;
        this.f278036n = runnable;
    }

    public final void run() {
        SnsCommentDetailUI.C9550332 r0 = this.f278029d;
        String str = this.f278030e;
        AtomicInteger atomicInteger = this.f278031f;
        Map map = this.f278032g;
        boolean z = this.f278033h;
        List list = this.f278034i;
        C101802kr2 kr22 = this.f278035j;
        Runnable runnable = this.f278036n;
        r0.getClass();
        SnsMethodCalculate.markStartTimeMs("lambda$onImageFinish$0", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$32");
        Log.m105924i("MicroMsg.SnsCommentDetailUI", "current thread = " + Thread.currentThread() + ", onImageFinish mediaId = " + str + ", finalUnLocalCount = " + atomicInteger.get());
        if (!(atomicInteger.get() == 0 || ((C101804kv2) map.get(str)) == null || !z)) {
            atomicInteger.getAndDecrement();
            map.remove(str);
            Log.m105924i("MicroMsg.SnsCommentDetailUI", "mediaId = " + str + ", download image finish, current unlocal count = " + atomicInteger.get());
        }
        if (atomicInteger.get() == 0) {
            SnsCommentDetailUI snsCommentDetailUI = SnsCommentDetailUI.this;
            int i = SnsCommentDetailUI.f277824M1;
            SnsMethodCalculate.markStartTimeMs("access$4600", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            ArrayList<String> l8 = snsCommentDetailUI.mo132625l8(list);
            SnsMethodCalculate.markEndTimeMs("access$4600", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            C102882s0.f303681a.mo142601m(SnsCommentDetailUI.m121962K7(SnsCommentDetailUI.this), kr22, l8, false);
            runnable.run();
        }
        SnsMethodCalculate.markEndTimeMs("lambda$onImageFinish$0", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$32");
    }
}
