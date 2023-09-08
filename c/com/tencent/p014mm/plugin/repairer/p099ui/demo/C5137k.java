package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import bj2.C0294m;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import fy3.C32226l;
import gy3.C87413o;
import java.util.List;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.k */
public final class C5137k extends C87413o implements C32226l<Integer, C0294m> {

    /* renamed from: d */
    public final /* synthetic */ RepairerMvvmListDemoUI f20520d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5137k(RepairerMvvmListDemoUI repairerMvvmListDemoUI) {
        super(1);
        this.f20520d = repairerMvvmListDemoUI;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) ((List) ((C36570n) this.f20520d.f20463e).getValue()).get(((Number) obj).intValue())).intValue();
        return new C0294m(intValue, FFmpegMetadataRetriever.METADATA_KEY_TITLE + intValue);
    }
}
