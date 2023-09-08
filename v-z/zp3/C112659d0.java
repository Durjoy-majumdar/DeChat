package zp3;

import android.content.Context;
import com.tencent.p014mm.view.C106853e;
import cq3.C106952a;
import cq3.C106958d;
import eq3.C107283a;
import eq3.C107286b;
import gy3.C87412m;
import me3.C109623f;
import p248ug.C111167t;

/* renamed from: zp3.d0 */
public final class C112659d0 extends C106853e {
    public C112659d0(Context context) {
        super(context);
    }

    /* renamed from: a */
    public C106952a mo154838a() {
        return new C106958d(getContext(), getPresenter());
    }

    /* renamed from: b */
    public C107283a mo154839b() {
        Context context = getContext();
        C87412m.m108593f(context, "context");
        C109623f presenter = getPresenter();
        C87412m.m108593f(presenter, "presenter");
        return new C107286b(context, presenter);
    }

    public C111167t[] getFeatures() {
        if (this.f319933g == null) {
            this.f319933g = new C111167t[]{C111167t.DOODLE, C111167t.EMOJI, C111167t.TEXT, C111167t.MOSAIC, C111167t.CROP_PHOTO};
        }
        C111167t[] tVarArr = this.f319933g;
        C87412m.m108593f(tVarArr, "mFeaturesTypes");
        return tVarArr;
    }
}
