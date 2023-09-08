package com.tencent.p014mm.plugin.finder.view.snscover;

import android.graphics.SurfaceTexture;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32228q;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.view.snscover.b */
public final class C93813b extends C87413o implements C32228q<SurfaceTexture, Integer, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ SnsFinderVideoBackPreview f270752d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93813b(SnsFinderVideoBackPreview snsFinderVideoBackPreview) {
        super(3);
        this.f270752d = snsFinderVideoBackPreview;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
        ((Number) obj2).intValue();
        ((Number) obj3).intValue();
        this.f270752d.getThumbView().setVisibility(8);
        Log.m105924i(this.f270752d.TAG, "onFrameAvailable");
        return C13598b0.f38549a;
    }
}
