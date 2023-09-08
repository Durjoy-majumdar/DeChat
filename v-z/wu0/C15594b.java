package wu0;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: wu0.b */
public final class C15594b extends C87413o implements C32224a<MMHandler> {

    /* renamed from: d */
    public static final C15594b f42224d = new C15594b();

    public C15594b() {
        super(0);
    }

    public Object invoke() {
        return new MMHandler(Looper.getMainLooper());
    }
}
