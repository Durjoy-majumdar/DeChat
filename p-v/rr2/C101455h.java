package rr2;

import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import qh2.C101198e;
import rx3.C13598b0;

/* renamed from: rr2.h */
public final class C101455h extends C87413o implements C32228q<SurfaceTexture, Integer, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f297123d;

    /* renamed from: e */
    public final /* synthetic */ C101452g f297124e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101455h(String str, C101452g gVar) {
        super(3);
        this.f297123d = str;
        this.f297124e = gVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin$prepareAndPlayVideo$1");
        SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
        ((Number) obj2).intValue();
        ((Number) obj3).intValue();
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin$prepareAndPlayVideo$1");
        C94554a c = C94555d.m119567c(this.f297123d, true);
        if (c != null) {
            C101452g gVar = this.f297124e;
            int i = c.f273443a;
            SnsMethodCalculate.markStartTimeMs("access$getConfigProvider$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
            RecordConfigProvider recordConfigProvider = gVar.f297120h;
            SnsMethodCalculate.markEndTimeMs("access$getConfigProvider$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
            if (recordConfigProvider == null) {
                C87412m.m108603p("configProvider");
                throw null;
            } else if (i > recordConfigProvider.f272935w + 500) {
                C101198e eVar = gVar.f291492d;
                C87412m.m108592e(eVar, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) eVar).findViewById(C0966R.C0970id.jsi).performClick();
                Bundle bundle = new Bundle();
                bundle.putInt("EDIT_CROP_VIDEO_LENGTH_START_TIME_INT", 0);
                SnsMethodCalculate.markStartTimeMs("access$getConfigProvider$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
                RecordConfigProvider recordConfigProvider2 = gVar.f297120h;
                SnsMethodCalculate.markEndTimeMs("access$getConfigProvider$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
                if (recordConfigProvider2 != null) {
                    bundle.putInt("EDIT_CROP_VIDEO_LENGTH_END_TIME_INT", recordConfigProvider2.f272935w);
                    gVar.f291492d.mo14585p(C101198e.C101199b.EDIT_CROP_VIDEO_LENGTH, bundle);
                } else {
                    C87412m.m108603p("configProvider");
                    throw null;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin$prepareAndPlayVideo$1");
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin$prepareAndPlayVideo$1");
        return b0Var;
    }
}
