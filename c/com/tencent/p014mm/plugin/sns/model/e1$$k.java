package com.tencent.p014mm.plugin.sns.model;

import android.graphics.Bitmap;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.memory.BucketPool;
import com.tencent.p014mm.memory.C92716o;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.sns.model.e1$$k */
public class e1$$k extends BucketPool<Bitmap, C92716o.C92718b>.a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e1$$k(C94866e1 e1Var, C92716o oVar) {
        super(oVar);
        Objects.requireNonNull(oVar);
    }

    /* renamed from: a */
    public int mo126901a() {
        SnsMethodCalculate.markStartTimeMs("getMaxPreLoadNums", "com.tencent.mm.plugin.sns.model.SnsCore$18");
        SnsMethodCalculate.markEndTimeMs("getMaxPreLoadNums", "com.tencent.mm.plugin.sns.model.SnsCore$18");
        return 3;
    }

    /* renamed from: b */
    public long mo126902b() {
        SnsMethodCalculate.markStartTimeMs("getMaxPreloadBytes", "com.tencent.mm.plugin.sns.model.SnsCore$18");
        SnsMethodCalculate.markEndTimeMs("getMaxPreloadBytes", "com.tencent.mm.plugin.sns.model.SnsCore$18");
        return -1;
    }

    /* renamed from: c */
    public Comparable mo126903c() {
        SnsMethodCalculate.markStartTimeMs("getPreLoadSize", "com.tencent.mm.plugin.sns.model.SnsCore$18");
        SnsMethodCalculate.markStartTimeMs("getPreLoadSize", "com.tencent.mm.plugin.sns.model.SnsCore$18");
        C92716o.C92718b bVar = new C92716o.C92718b(C0947jz.f2205e, 240);
        SnsMethodCalculate.markEndTimeMs("getPreLoadSize", "com.tencent.mm.plugin.sns.model.SnsCore$18");
        SnsMethodCalculate.markEndTimeMs("getPreLoadSize", "com.tencent.mm.plugin.sns.model.SnsCore$18");
        return bVar;
    }
}
