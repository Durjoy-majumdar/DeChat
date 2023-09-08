package com.tencent.p014mm.plugin.sns.model;

import android.graphics.Bitmap;
import com.tencent.p014mm.memory.BucketPool;
import com.tencent.p014mm.memory.C92704c;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.Objects;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.sns.model.e1$$j */
public class e1$$j extends BucketPool<Bitmap, Integer>.a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e1$$j(C94866e1 e1Var, C92704c cVar) {
        super(cVar);
        Objects.requireNonNull(cVar);
    }

    /* renamed from: a */
    public int mo126901a() {
        SnsMethodCalculate.markStartTimeMs("getMaxPreLoadNums", "com.tencent.mm.plugin.sns.model.SnsCore$17");
        SnsMethodCalculate.markEndTimeMs("getMaxPreLoadNums", "com.tencent.mm.plugin.sns.model.SnsCore$17");
        return -1;
    }

    /* renamed from: b */
    public long mo126902b() {
        SnsMethodCalculate.markStartTimeMs("getMaxPreloadBytes", "com.tencent.mm.plugin.sns.model.SnsCore$17");
        SnsMethodCalculate.markEndTimeMs("getMaxPreloadBytes", "com.tencent.mm.plugin.sns.model.SnsCore$17");
        return 10485760;
    }

    /* renamed from: c */
    public Comparable mo126903c() {
        SnsMethodCalculate.markStartTimeMs("getPreLoadSize", "com.tencent.mm.plugin.sns.model.SnsCore$17");
        SnsMethodCalculate.markStartTimeMs("getPreLoadSize", "com.tencent.mm.plugin.sns.model.SnsCore$17");
        Integer valueOf = Integer.valueOf(C76577a.m92151b(MMApplicationContext.getContext(), 120) * C76577a.m92151b(MMApplicationContext.getContext(), 120));
        SnsMethodCalculate.markEndTimeMs("getPreLoadSize", "com.tencent.mm.plugin.sns.model.SnsCore$17");
        SnsMethodCalculate.markEndTimeMs("getPreLoadSize", "com.tencent.mm.plugin.sns.model.SnsCore$17");
        return valueOf;
    }
}
