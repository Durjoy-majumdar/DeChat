package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import os2.C100423z;
import zh3.C91753f;

/* renamed from: com.tencent.mm.plugin.sns.model.e1$$g */
public class e1$$g implements C91753f.C66827b {
    /* renamed from: a */
    public String[] mo6410a() {
        SnsMethodCalculate.markStartTimeMs("getSQLs", "com.tencent.mm.plugin.sns.model.SnsCore$14");
        C100423z.C100424a aVar = C100423z.f294196g;
        SnsMethodCalculate.markStartTimeMs("getSQL_CREATE", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage$Companion");
        SnsMethodCalculate.markStartTimeMs("access$getSQL_CREATE$cp", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        String[] strArr = C100423z.f294197h;
        SnsMethodCalculate.markEndTimeMs("access$getSQL_CREATE$cp", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        SnsMethodCalculate.markEndTimeMs("getSQL_CREATE", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage$Companion");
        SnsMethodCalculate.markEndTimeMs("getSQLs", "com.tencent.mm.plugin.sns.model.SnsCore$14");
        return strArr;
    }
}
