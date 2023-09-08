package g92;

import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.multitask.animation.swipeahead.FloatMultiTaskIndicatorView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: g92.a */
public final class C107787a implements C107791e {

    /* renamed from: a */
    public final /* synthetic */ C107789c f322606a;

    public C107787a(C107789c cVar) {
        this.f322606a = cVar;
    }

    /* renamed from: a */
    public void mo158204a(boolean z) {
        Log.m105925i("MicroMsg.FloatMultiTaskIndicatorController", "onOrientationChanged, isLandscape:%s", Boolean.valueOf(z));
        C107789c cVar = this.f322606a;
        cVar.getClass();
        Log.m105925i("MicroMsg.FloatMultiTaskIndicatorController", "updateOrientation, isLandscape:%b", Boolean.valueOf(z));
        cVar.f322614g = z;
        cVar.mo158208d();
        C107789c cVar2 = this.f322606a;
        FrameLayout.LayoutParams layoutParams = cVar2.f322613f;
        if (layoutParams != null) {
            layoutParams.bottomMargin = cVar2.f322612e;
        }
        if (layoutParams != null) {
            layoutParams.rightMargin = cVar2.f322611d;
        }
        FloatMultiTaskIndicatorView floatMultiTaskIndicatorView = cVar2.f322610c;
        if (floatMultiTaskIndicatorView != null) {
            floatMultiTaskIndicatorView.setLayoutParams(layoutParams);
        }
        Object[] objArr = new Object[2];
        FrameLayout.LayoutParams layoutParams2 = this.f322606a.f322613f;
        Integer num = null;
        objArr[0] = layoutParams2 != null ? Integer.valueOf(layoutParams2.rightMargin) : null;
        FrameLayout.LayoutParams layoutParams3 = this.f322606a.f322613f;
        if (layoutParams3 != null) {
            num = Integer.valueOf(layoutParams3.bottomMargin);
        }
        objArr[1] = num;
        Log.m105925i("MicroMsg.FloatMultiTaskIndicatorController", "onOrientationChanged layoutParams, right:%s, bottom:%s", objArr);
    }
}
