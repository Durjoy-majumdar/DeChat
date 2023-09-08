package zp3;

import android.content.Context;
import com.tencent.p014mm.view.C106853e;
import cq3.C106952a;
import cq3.C106960f;
import eq3.C107283a;
import eq3.C107288d;
import p248ug.C111167t;

/* renamed from: zp3.k0 */
public class C112666k0 extends C106853e {
    public C112666k0(Context context) {
        super(context);
    }

    /* renamed from: a */
    public C106952a mo154838a() {
        return new C106960f(getContext(), getPresenter());
    }

    /* renamed from: b */
    public C107283a mo154839b() {
        return new C107288d(getContext(), getPresenter());
    }

    public C111167t[] getFeatures() {
        if (this.f319933g == null) {
            this.f319933g = new C111167t[]{C111167t.DOODLE, C111167t.EMOJI, C111167t.TEXT, C111167t.CROP_VIDEO};
        }
        return this.f319933g;
    }
}
