package tt0;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.p014mm.plugin.location_soso.api.SoSoMapView;
import com.tencent.tencentmap.mapsdk.map.Projection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import pl0.C118080q;

/* renamed from: tt0.c */
public class C118513c {

    /* renamed from: a */
    public LinkedList<C118080q.C118092i> f354683a;

    /* renamed from: b */
    public Marker f354684b;

    /* renamed from: c */
    public SoSoMapView f354685c;

    /* renamed from: d */
    public AnimatorSet f354686d = new AnimatorSet();

    /* renamed from: e */
    public C118517f f354687e = new C118517f();

    /* renamed from: tt0.c$a */
    public class C118514a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C118516e f354688d;

        /* renamed from: e */
        public final /* synthetic */ C118516e f354689e;

        /* renamed from: f */
        public final /* synthetic */ double[] f354690f;

        public C118514a(C118516e eVar, C118516e eVar2, double[] dArr) {
            this.f354688d = eVar;
            this.f354689e = eVar2;
            this.f354690f = dArr;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f354688d.equals(this.f354689e)) {
                double parseDouble = Double.parseDouble(String.valueOf(valueAnimator.getAnimatedValue()));
                C118516e eVar = this.f354688d;
                double d = eVar.f354693a;
                C118516e eVar2 = this.f354689e;
                double d2 = this.f354690f[0];
                double d3 = d + (((eVar2.f354693a - d) * parseDouble) / d2);
                double d4 = eVar.f354694b;
                C118513c cVar = C118513c.this;
                Marker marker = cVar.f354684b;
                cVar.f354687e.getClass();
                marker.setPosition(new LatLng(90.0d - Math.toDegrees(Math.atan(Math.exp(((-(0.5d - ((d4 + (((eVar2.f354694b - d4) * parseDouble) / d2)) / 4.007501668557849E7d))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((d3 / 4.007501668557849E7d) - 0.5d) * 360.0d));
            }
        }
    }

    /* renamed from: tt0.c$b */
    public class C118515b implements ValueAnimator.AnimatorUpdateListener {
        public C118515b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C118513c.this.f354684b.setRotation((float) Double.parseDouble(String.valueOf(valueAnimator.getAnimatedValue())));
        }
    }

    public C118513c(LinkedList<C118080q.C118092i> linkedList, Marker marker, SoSoMapView soSoMapView) {
        this.f354683a = linkedList;
        this.f354684b = marker;
        this.f354685c = soSoMapView;
        ArrayList arrayList = new ArrayList();
        Iterator<C118080q.C118092i> it = this.f354683a.iterator();
        while (it.hasNext()) {
            C118080q.C118092i next = it.next();
            int i = (next.f353020e > 0.0f ? 1 : (next.f353020e == 0.0f ? 0 : -1));
            if (i != 0 && next.f353019d != 0.0d && next.f353018c != 0.0d) {
                ValueAnimator b = mo183234b(next);
                ValueAnimator a = mo183233a(next);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(a).with(b);
                arrayList.add(animatorSet);
            } else if (i != 0) {
                arrayList.add(mo183233a(next));
            } else {
                arrayList.add(mo183234b(next));
            }
        }
        this.f354686d.playSequentially(arrayList);
    }

    /* renamed from: a */
    public ValueAnimator mo183233a(C118080q.C118092i iVar) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f354684b.getRotation(), this.f354684b.getRotation() + iVar.f353020e});
        ofFloat.setDuration((long) iVar.f353021f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new C118515b());
        return ofFloat;
    }

    /* renamed from: b */
    public ValueAnimator mo183234b(C118080q.C118092i iVar) {
        LatLng[] latLngArr = {new LatLng(iVar.f353017b, iVar.f353016a), new LatLng(iVar.f353019d, iVar.f353018c)};
        C118516e a = this.f354687e.mo183239a(latLngArr[0]);
        C118516e a2 = this.f354687e.mo183239a(latLngArr[1]);
        double[] dArr = new double[1];
        Projection projection = this.f354685c.getProjection();
        double d = 0.0d;
        int i = 0;
        while (i < 1) {
            int i2 = i + 1;
            double distanceBetween = projection.distanceBetween(latLngArr[i], latLngArr[i2]);
            dArr[i] = distanceBetween;
            d += distanceBetween;
            i = i2;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration((long) ((((double) iVar.f353021f) * dArr[0]) / d));
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.setFloatValues(new float[]{(float) dArr[0]});
        valueAnimator.addUpdateListener(new C118514a(a, a2, dArr));
        return valueAnimator;
    }
}
