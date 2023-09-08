package vk0;

import android.util.Size;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;

/* renamed from: vk0.g */
public interface C90815g extends C82531i.C82535d, C82531i.C82533b, C82531i.C82534c {
    /* renamed from: a */
    void mo22088a();

    /* renamed from: g */
    void mo22091g(boolean z);

    int getCameraId();

    View getView();

    /* renamed from: h */
    void mo22095h(boolean z);

    /* renamed from: i */
    void mo22096i();

    /* renamed from: j */
    void mo22097j(int i, int i2, int i3, int i4);

    /* renamed from: m */
    void mo22099m(String str, boolean z);

    /* renamed from: p */
    void mo22102p();

    void release();

    void setAppId(String str);

    void setCameraId(int i);

    void setCompressRecord(boolean z);

    void setDisplayScreenSize(Size size);

    void setFlash(String str);

    void setFrameLimitSize(int i);

    void setMode(String str);

    void setNeedOutput(boolean z);

    void setOperateCallBack(C90813d dVar);

    void setOutPutCallBack(C90812b bVar);

    void setPage(C82520h hVar);

    void setPageOrientation(boolean z);

    void setPreviewCenterCrop(boolean z);

    void setQuality(String str);

    void setResolution(String str);

    void setScanFreq(int i);

    float setZoom(float f);

    /* renamed from: v */
    void mo22124v();

    /* renamed from: x */
    boolean mo22125x(int i, int i2, boolean z);

    /* renamed from: y */
    void mo22126y(C82381f fVar, String str);
}
