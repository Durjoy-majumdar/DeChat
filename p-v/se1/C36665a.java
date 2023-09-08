package se1;

import android.app.Activity;
import android.content.Context;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import pe1.C35464c;
import rx3.C13598b0;

/* renamed from: se1.a */
public class C36665a extends C35464c<Integer> {

    /* renamed from: r */
    public final C32227p<Integer, Context, C13598b0> f97451r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36665a(int i, String str, C32227p<? super Integer, ? super Context, C13598b0> pVar) {
        super(Integer.valueOf(i), str);
        C87412m.m108594g(str, "_title");
        this.f97451r = pVar;
    }

    /* renamed from: k */
    public void mo60264k(int i) {
        super.mo60264k(i);
        C32227p<Integer, Context, C13598b0> pVar = this.f97451r;
        if (pVar != null) {
            Object n = mo60266n();
            WeakReference<Activity> weakReference = this.f94905f;
            pVar.invoke(n, weakReference != null ? weakReference.get() : null);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C36665a(int i, String str, C32227p pVar, int i2, C8480h hVar) {
        this(i, str, (i2 & 4) != 0 ? null : pVar);
    }
}
