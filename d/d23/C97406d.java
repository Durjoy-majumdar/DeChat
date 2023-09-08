package d23;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.vlog.model.C106205q0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: d23.d */
public final class C97406d extends C87413o implements C32227p<Long, Bitmap, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C106205q0 f285914d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<Bitmap> f285915e;

    /* renamed from: f */
    public final /* synthetic */ Object f285916f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97406d(C106205q0 q0Var, C8479f0<Bitmap> f0Var, Object obj) {
        super(2);
        this.f285914d = q0Var;
        this.f285915e = f0Var;
        this.f285916f = obj;
    }

    public Object invoke(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        T t = (Bitmap) obj2;
        StringBuilder sb = new StringBuilder();
        sb.append("requestFrames finish, timeMs:");
        sb.append(longValue);
        sb.append(", bitmap:");
        sb.append(t);
        sb.append(", size:[");
        Integer num = null;
        sb.append(t != null ? Integer.valueOf(t.getWidth()) : null);
        sb.append(", ");
        if (t != null) {
            num = Integer.valueOf(t.getHeight());
        }
        sb.append(num);
        sb.append("], source size:[");
        sb.append(this.f285914d.f316501l.f331471i);
        sb.append(", ");
        sb.append(this.f285914d.f316501l.f331472j);
        sb.append(']');
        Log.m105924i("MicroMsg.LocalEffectManager", sb.toString());
        this.f285915e.f27484d = t;
        Object obj3 = this.f285916f;
        synchronized (obj3) {
            try {
                obj3.notifyAll();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.LocalEffectManager", e, "", new Object[0]);
            }
        }
        return C13598b0.f38549a;
    }
}
