package p1091b3;

import android.graphics.Typeface;
import p1050v2.C111325g;
import p1057w2.C118712d;

/* renamed from: b3.a */
public class C113121a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C113134m f338507d;

    /* renamed from: e */
    public final /* synthetic */ Typeface f338508e;

    public C113121a(C113123c cVar, C113134m mVar, Typeface typeface) {
        this.f338507d = mVar;
        this.f338508e = typeface;
    }

    public void run() {
        C113134m mVar = this.f338507d;
        Typeface typeface = this.f338508e;
        C111325g.C111328d dVar = ((C118712d.C118713a) mVar).f355221a;
        if (dVar != null) {
            dVar.mo144404d(typeface);
        }
    }
}
