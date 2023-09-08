package li1;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import gi1.C59463a;
import gi1.C59465f;
import gy3.C87412m;
import ii1.C60291e;
import java.util.ArrayList;
import java.util.Iterator;
import ni1.C61753b;
import pi1.C62305h;
import pi1.C62306i;
import pi1.C62307j;
import pi1.C62308k;

/* renamed from: li1.b */
public final class C61291b extends C61289a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61291b(Context context, C60291e eVar, C61753b bVar) {
        super(context, eVar, bVar);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(eVar, "basePlugin");
        C87412m.m108594g(bVar, "service");
    }

    /* renamed from: h */
    public void mo85560h(int i, View view) {
        int i2;
        View view2 = view;
        C87412m.m108594g(view2, "view");
        if (view2 instanceof C62307j) {
            C62307j jVar = (C62307j) view2;
            C59463a k = mo85554b(i);
            boolean z = this.f174403h;
            boolean z2 = this.f174404i;
            int i3 = 2;
            if (this.f174402g.width() > 0 && this.f174402g.height() > 0) {
                Iterator<T> it = this.f174401f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C59463a aVar = (C59463a) it.next();
                    if (aVar.f169895b.f169903g == 2) {
                        int width = this.f174402g.width();
                        C59465f fVar = aVar.f169895b;
                        float f = (float) width;
                        float f2 = fVar.f165729a * f;
                        float f3 = fVar.f165731c * f;
                        float f4 = (f - f2) - f3;
                        Log.m105924i("MicFocusRatioAdapter", "getRightOffestSize margin: " + f4 + " windowWidth:" + f3 + " left: " + f2);
                        i2 = (int) (f3 + f4);
                        break;
                    }
                }
            }
            i2 = 0;
            ArrayList<RectF> arrayList = new ArrayList<>();
            if (this.f174402g.width() > 0 && this.f174402g.height() > 0) {
                int width2 = this.f174402g.width();
                int height = this.f174402g.height();
                for (C59463a aVar2 : this.f174401f) {
                    C59465f fVar2 = aVar2.f169895b;
                    if (fVar2.f169903g == i3) {
                        float f5 = (float) width2;
                        float f6 = fVar2.f165729a * f5;
                        float f7 = (float) height;
                        float f8 = fVar2.f165730b * f7;
                        arrayList.add(new RectF(f6, f8, (fVar2.f165731c * f5) + f6, (fVar2.f165732d * f7) + f8));
                        i3 = 2;
                    }
                }
            }
            jVar.setBindMicData(k);
            jVar.f177119q = z;
            jVar.f177120r = z2;
            jVar.f177121s = i2;
            jVar.setBindLinkMicUser(k.f169894a);
            jVar.f177122t = arrayList;
            boolean z3 = k.f169895b.f169903g == 1;
            jVar.f177123u = z3;
            jVar.mo87376w(z3);
        }
    }

    /* renamed from: i */
    public View mo86269i(C59463a aVar, int i) {
        C87412m.m108594g(aVar, "data");
        return i != 1 ? i != 2 ? i != 3 ? new View(this.f174397b) : new C62305h(this.f174397b, this.f174398c, this.f174399d) : new C62308k(this.f174397b, this.f174398c, this.f174399d) : new C62306i(this.f174397b, this.f174398c, this.f174399d);
    }

    /* renamed from: m */
    public String mo86273m() {
        return "MicFocusRatioAdapter";
    }
}
