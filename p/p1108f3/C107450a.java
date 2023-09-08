package p1108f3;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: f3.a */
public final class C107450a extends ClickableSpan {

    /* renamed from: d */
    public final int f321468d;

    /* renamed from: e */
    public final C107453d f321469e;

    /* renamed from: f */
    public final int f321470f;

    public C107450a(int i, C107453d dVar, int i2) {
        this.f321468d = i;
        this.f321469e = dVar;
        this.f321470f = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f321468d);
        C107453d dVar = this.f321469e;
        dVar.f321473a.performAction(this.f321470f, bundle);
    }
}
