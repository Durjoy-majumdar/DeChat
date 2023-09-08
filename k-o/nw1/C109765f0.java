package nw1;

import android.graphics.RectF;
import com.tencent.p014mm.plugin.gallery.picker.view.WxMediaCropLayout;
import fy3.C32227p;
import gy3.C87413o;

/* renamed from: nw1.f0 */
public final class C109765f0 extends C87413o implements C32227p<Integer, Integer, Object> {

    /* renamed from: d */
    public final /* synthetic */ WxMediaCropLayout f328516d;

    /* renamed from: e */
    public final /* synthetic */ long f328517e;

    /* renamed from: f */
    public final /* synthetic */ String f328518f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109765f0(WxMediaCropLayout wxMediaCropLayout, WxMediaCropLayout.C4426b bVar, long j, String str) {
        super(2);
        this.f328516d = wxMediaCropLayout;
        this.f328517e = j;
        this.f328518f = str;
    }

    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        this.f328516d.getMediaWH()[0] = intValue;
        this.f328516d.getMediaWH()[1] = intValue2;
        RectF rectF = new RectF(this.f328516d.f313195i);
        WxMediaCropLayout wxMediaCropLayout = this.f328516d;
        return WxMediaCropLayout.m141518d(wxMediaCropLayout, wxMediaCropLayout.getImageView(), intValue, intValue2, rectF, this.f328517e, this.f328518f, 2);
    }
}
