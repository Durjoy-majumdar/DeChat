package fl1;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;
import nj3.C76912y0;
import rx3.C13598b0;

/* renamed from: fl1.h */
public final class C32068h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59161f f85317d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32068h(C59161f fVar) {
        super(0);
        this.f85317d = fVar;
    }

    public Object invoke() {
        AppCompatActivity appCompatActivity = this.f85317d.f166836e;
        C76912y0.makeText((Context) appCompatActivity, (CharSequence) appCompatActivity.getResources().getString(C0966R.string.dsg), 0).show();
        return C13598b0.f38549a;
    }
}
