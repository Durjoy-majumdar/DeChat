package p01;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import r01.C36234b;
import v01.C37640c;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: p01.a */
public class C35351a extends C86301e implements C36234b {

    /* renamed from: d */
    public C37640c f94672d;

    public C37640c ga0() {
        requireAccountInitialized();
        return this.f94672d;
    }

    public void onAccountInitialized(Context context) {
        this.f94672d = new C37640c(C86709a0.m107535s().f251811i);
    }
}
