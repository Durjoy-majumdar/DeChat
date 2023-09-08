package fl1;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import fy3.C32226l;
import gy3.C87413o;
import nj3.C76912y0;
import rx3.C13598b0;

/* renamed from: fl1.g2 */
public final class C32067g2 extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59161f f85316d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32067g2(C59161f fVar) {
        super(1);
        this.f85316d = fVar;
    }

    public Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            AppCompatActivity appCompatActivity = this.f85316d.f166836e;
            C76912y0.makeText((Context) appCompatActivity, (CharSequence) appCompatActivity.getString(C0966R.string.f360595dr0), 0).show();
        }
        return C13598b0.f38549a;
    }
}
