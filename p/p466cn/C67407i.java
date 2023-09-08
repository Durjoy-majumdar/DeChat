package p466cn;

import android.content.Context;
import di3.C86301e;
import ei3.C86522b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kd0.C21323o;
import kd0.C76537d;
import kd0.C76541g0;
import kd0.C76552z;
import kd0.C99122f0;
import ob0.C77002r;
import p331dj.C75411c;
import p375qh.C22086d;
import p375qh.C77339c;
import p492dn.C75415t;
import p492dn.C75416u;

@C86522b
/* renamed from: cn.i */
public class C67407i extends C86301e implements C75415t, C75416u {
    /* renamed from: DA */
    public C22086d mo91606DA(Context context) {
        return new C21323o(context);
    }

    public float F30(long j) {
        HashMap<String, WeakReference<C77002r>> hashMap = C76552z.f224074a;
        float f = ((float) j) / 1000.0f;
        if (f < 1.0f) {
            f = 1.0f;
        }
        if (f > 60.0f) {
            f = 60.0f;
        }
        return (float) Math.round(f);
    }

    /* renamed from: SQ */
    public String mo91608SQ(String str, String str2) {
        return C76541g0.m92032SQ(str, str2);
    }

    public C77339c Xr0(C75411c cVar) {
        return new C99122f0(cVar);
    }

    /* renamed from: mf */
    public String mo91610mf(String str) {
        return C76552z.m92076n(str, true);
    }

    public C76537d w20(String str) {
        return C76552z.m92073k(str);
    }
}
