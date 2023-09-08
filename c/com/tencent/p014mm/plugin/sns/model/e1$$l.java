package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.memory.BucketPool;
import com.tencent.p014mm.memory.C92708g;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.sns.model.e1$$l */
public class e1$$l extends BucketPool<byte[], Integer>.a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e1$$l(C94866e1 e1Var, C92708g gVar) {
        super(gVar);
        Objects.requireNonNull(gVar);
    }

    /* renamed from: a */
    public int mo126901a() {
        SnsMethodCalculate.markStartTimeMs("getMaxPreLoadNums", "com.tencent.mm.plugin.sns.model.SnsCore$19");
        SnsMethodCalculate.markEndTimeMs("getMaxPreLoadNums", "com.tencent.mm.plugin.sns.model.SnsCore$19");
        return 5;
    }

    /* renamed from: b */
    public long mo126902b() {
        SnsMethodCalculate.markStartTimeMs("getMaxPreloadBytes", "com.tencent.mm.plugin.sns.model.SnsCore$19");
        SnsMethodCalculate.markEndTimeMs("getMaxPreloadBytes", "com.tencent.mm.plugin.sns.model.SnsCore$19");
        return 0;
    }

    /* renamed from: c */
    public Comparable mo126903c() {
        SnsMethodCalculate.markStartTimeMs("getPreLoadSize", "com.tencent.mm.plugin.sns.model.SnsCore$19");
        SnsMethodCalculate.markStartTimeMs("getPreLoadSize", "com.tencent.mm.plugin.sns.model.SnsCore$19");
        SnsMethodCalculate.markEndTimeMs("getPreLoadSize", "com.tencent.mm.plugin.sns.model.SnsCore$19");
        SnsMethodCalculate.markEndTimeMs("getPreLoadSize", "com.tencent.mm.plugin.sns.model.SnsCore$19");
        return 1024;
    }
}
