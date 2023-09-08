package qj1;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.finder.live.multistream.CommonCircleIndicator;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: qj1.gb */
public final class C62792gb<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C62772fb f178239d;

    public C62792gb(C62772fb fbVar) {
        this.f178239d = fbVar;
    }

    public void onChanged(Object obj) {
        Integer num = (Integer) obj;
        CommonCircleIndicator commonCircleIndicator = this.f178239d.f178183q;
        C87412m.m108593f(num, LocaleUtil.ITALIAN);
        int intValue = num.intValue();
        if (commonCircleIndicator.f159414d != intValue) {
            commonCircleIndicator.f159414d = intValue;
            commonCircleIndicator.requestLayout();
        }
        Log.m105924i("MultiStreamIndicatorPlugin", "multiChannelParamsList " + this.f178239d.f178184r + " size: " + num);
        if (num.intValue() > 1) {
            C62772fb fbVar = this.f178239d;
            if (fbVar.f178184r) {
                fbVar.mo10792g(0);
                return;
            }
        }
        this.f178239d.mo10792g(8);
    }
}
