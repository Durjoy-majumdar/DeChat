package ro3;

import android.view.View;
import com.tencent.p014mm.p136ui.C85975v4;

/* renamed from: ro3.u */
public final class C77567u implements View.OnLayoutChangeListener {

    /* renamed from: d */
    public final /* synthetic */ C110588j f226131d;

    public C77567u(C110588j jVar) {
        this.f226131d = jVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C110588j jVar = this.f226131d;
        int f = jVar.mo162136f();
        jVar.getClass();
        if (f > 0) {
            C110588j jVar2 = this.f226131d;
            int[] iArr = jVar2.f330808I;
            int[] iArr2 = {iArr[0], iArr[1]};
            jVar2.f330833h.getLocationInWindow(iArr);
            C85975v4.m106304a("SelectableEditTextHelper", "LayoutChangeFromWindow l:%d,t:%d,r:%d,b:%d,oldl:%d,oldt:%d,oldr:%d,oldb:%d,oldx:%d, newx:%d, oldy:%d, newy:%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(iArr2[0]), Integer.valueOf(this.f226131d.f330808I[0]), Integer.valueOf(iArr2[1]), Integer.valueOf(this.f226131d.f330808I[1]));
            if (i2 != i6 || i4 != i8 || iArr2[1] != this.f226131d.f330808I[1]) {
                this.f226131d.mo148755a();
            }
        }
    }
}
