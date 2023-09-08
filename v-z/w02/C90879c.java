package w02;

import android.content.Context;
import com.tencent.tinker.loader.TinkerRuntimeException;
import p271xn.C91297k;

/* renamed from: w02.c */
public class C90879c implements C91297k {

    /* renamed from: c */
    public static C90879c f260858c;

    /* renamed from: a */
    public final Context f260859a;

    /* renamed from: b */
    public final C90883f f260860b;

    public C90879c(Context context, C90883f fVar, C90880a aVar) {
        this.f260859a = context;
        this.f260860b = fVar;
    }

    /* renamed from: a */
    public static C90879c m113993a(Context context) {
        synchronized (C90879c.class) {
            if (f260858c == null) {
                if (context != null) {
                    f260858c = new C90879c(context, new C90882e(context), (C90880a) null);
                } else {
                    throw new TinkerRuntimeException("Context must not be null.");
                }
            }
        }
        return f260858c;
    }
}
