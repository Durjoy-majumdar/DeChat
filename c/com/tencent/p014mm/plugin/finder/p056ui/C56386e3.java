package com.tencent.p014mm.plugin.finder.p056ui;

import android.graphics.Bitmap;
import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C64689rq2;

/* renamed from: com.tencent.mm.plugin.finder.ui.e3 */
public final class C56386e3 extends C87413o implements C32227p<Long, Bitmap, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderSelectCoverUI f161205d;

    /* renamed from: e */
    public final /* synthetic */ C64689rq2 f161206e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56386e3(FinderSelectCoverUI finderSelectCoverUI, C64689rq2 rq22) {
        super(2);
        this.f161205d = finderSelectCoverUI;
        this.f161206e = rq22;
    }

    public Object invoke(Object obj, Object obj2) {
        ((Number) obj).longValue();
        Bitmap bitmap = (Bitmap) obj2;
        if (bitmap != null) {
            FinderSelectCoverUI.m64622O7(this.f161205d, this.f161206e, bitmap);
        }
        return C13598b0.f38549a;
    }
}
