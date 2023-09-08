package qj1;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: qj1.vf */
public final class C63062vf<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C62979sf f178962d;

    public C63062vf(C62979sf sfVar) {
        this.f178962d = sfVar;
    }

    public void onChanged(Object obj) {
        Float f = (Float) obj;
        if (f != null) {
            C62979sf sfVar = this.f178962d;
            float floatValue = f.floatValue();
            String str = sfVar.f178702s;
            Log.m105924i(str, "initPlugin scrollAlphaData data:" + floatValue);
            sfVar.f178699p.setAlpha(floatValue);
        }
    }
}
