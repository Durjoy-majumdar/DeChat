package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gc0.C20828a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.c2 */
public final class C40687c2 extends C87413o implements C32226l<Bitmap, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f109302d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f109303e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40687c2(String str, ImageView imageView) {
        super(1);
        this.f109302d = str;
        this.f109303e = imageView;
    }

    public Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", "setForegroundPic requestEffect effectBitmap:" + bitmap);
        C20828a.m22825b().mo32526o(this.f109302d, bitmap);
        this.f109303e.setImageBitmap(bitmap);
        return C13598b0.f38549a;
    }
}
