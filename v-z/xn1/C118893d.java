package xn1;

import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: xn1.d */
public final class C118893d extends C87413o implements C32227p<Long, RecyclerView.C16628w, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f356170d;

    /* renamed from: e */
    public final /* synthetic */ C118894e f356171e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118893d(int i, C118894e eVar) {
        super(2);
        this.f356170d = i;
        this.f356171e = eVar;
    }

    public Object invoke(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        RecyclerView.C16628w wVar = (RecyclerView.C16628w) obj2;
        if (longValue >= ((long) this.f356170d)) {
            boolean z = false;
            if (wVar != null && !wVar.f44838g) {
                z = true;
            }
            if (z && Looper.getMainLooper().isCurrentThread()) {
                C118894e eVar = this.f356171e;
                eVar.f356178j += longValue;
                eVar.f356179n++;
            }
        }
        return C13598b0.f38549a;
    }
}
