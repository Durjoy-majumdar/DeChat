package kf1;

import al1.C54130j;
import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.ratio.RatioLayout;
import dl1.C58321a;
import fy3.C32226l;
import gi1.C32458d;
import gi1.C59463a;
import gi1.C59465f;
import gy3.C87412m;
import iq3.C60600b;
import java.util.ArrayList;
import java.util.LinkedList;
import ni1.C61753b;
import o40.C61926c;
import rx3.C13598b0;
import si1.C63907i;
import ti1.C64939a;
import ti1.C64943e;
import ti1.C64944f;

/* renamed from: kf1.t4 */
public final class C61066t4 extends C60600b<C59463a> {

    /* renamed from: b */
    public final int f173906b;

    /* renamed from: c */
    public final C32226l<Boolean, C13598b0> f173907c;

    /* renamed from: d */
    public final String f173908d = "Finder.FinderLiveFeedCoverRatioAdapter";

    /* renamed from: e */
    public LinkedList<C59463a> f173909e = new LinkedList<>();

    /* renamed from: f */
    public int f173910f;

    /* renamed from: g */
    public ArrayList<RectF> f173911g = new ArrayList<>();

    /* renamed from: h */
    public Point f173912h = new Point(0, 0);

    /* renamed from: i */
    public String f173913i = "";

    /* renamed from: j */
    public String f173914j = "";

    /* renamed from: k */
    public C58321a f173915k = C58321a.NORMAL_4_MODE;

    /* renamed from: l */
    public C32458d f173916l;

    /* renamed from: m */
    public C64943e f173917m;

    public C61066t4(int i, C32226l<? super Boolean, C13598b0> lVar) {
        this.f173906b = i;
        this.f173907c = lVar;
    }

    /* renamed from: a */
    public int mo85553a() {
        return this.f173909e.size();
    }

    /* renamed from: b */
    public Object mo85554b(int i) {
        C59463a aVar = this.f173909e.get(i);
        C87412m.m108593f(aVar, "audienceLinkMicDataList[pos]");
        return aVar;
    }

    /* renamed from: c */
    public View mo85555c(int i, Object obj) {
        String str;
        C59463a aVar = (C59463a) obj;
        C87412m.m108594g(aVar, "data");
        String str2 = null;
        if (aVar.f169895b.f169904h) {
            Context context = mo85556d().getContext();
            C87412m.m108593f(context, "layout.context");
            return new C63907i(context, (C61753b) null);
        }
        C54130j jVar = aVar.f169894a;
        if (jVar != null) {
            str2 = jVar.f151997a;
        }
        boolean b = C87412m.m108589b(str2, this.f173913i);
        int i2 = 2;
        boolean z = true;
        if (b) {
            i2 = 3;
        } else {
            C54130j jVar2 = aVar.f169894a;
            if (jVar2 != null && jVar2.f152004h) {
                i2 = 4;
            } else {
                if (jVar2 != null) {
                    C59465f fVar = aVar.f169895b;
                    if (!fVar.f169904h) {
                        if (C61926c.m72696u(fVar.f169905i, 2)) {
                            i2 = 1;
                        }
                    }
                }
                i2 = 0;
            }
        }
        C54130j jVar3 = aVar.f169894a;
        if (!(jVar3 != null && jVar3.f152001e == 1)) {
            if (!(jVar3 != null && jVar3.f152012p)) {
                z = false;
            }
        }
        int i3 = this.f173906b;
        Context context2 = mo85556d().getContext();
        C87412m.m108593f(context2, "layout.context");
        C54130j jVar4 = aVar.f169894a;
        if (jVar4 == null || (str = jVar4.f152011o) == null) {
            str = "";
        }
        C64939a aVar2 = new C64939a(i3, context2, i2, str);
        aVar2.mo89093a(new C64944f(aVar, this.f173915k, z, this.f173910f, this.f173911g, this.f173917m));
        return aVar2;
    }

    /* renamed from: e */
    public RatioLayout.C57914a mo85557e(int i) {
        return this.f173909e.get(i).f169895b;
    }

    /* renamed from: i */
    public final void mo85999i(Point point) {
        C87412m.m108594g(point, "windowSize");
        this.f173912h = point;
        String str = this.f173908d;
        Log.m105924i(str, "setWindowSize: " + point);
    }
}
