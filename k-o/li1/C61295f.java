package li1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import iq3.C60599a;
import java.util.LinkedList;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: li1.f */
public final class C61295f implements C60599a {

    /* renamed from: a */
    public final C13601g f174406a = C36568h.m40985a(C61297b.f174410d);

    /* renamed from: b */
    public final LinkedList<C61296a> f174407b = new LinkedList<>();

    /* renamed from: li1.f$a */
    public static final class C61296a {

        /* renamed from: a */
        public final PointF f174408a;

        /* renamed from: b */
        public final PointF f174409b;

        public C61296a(PointF pointF, PointF pointF2) {
            C87412m.m108594g(pointF, "startPointF");
            C87412m.m108594g(pointF2, "endPointF");
            this.f174408a = pointF;
            this.f174409b = pointF2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C61296a)) {
                return false;
            }
            C61296a aVar = (C61296a) obj;
            return C87412m.m108589b(this.f174408a, aVar.f174408a) && C87412m.m108589b(this.f174409b, aVar.f174409b);
        }

        public int hashCode() {
            return (this.f174408a.hashCode() * 31) + this.f174409b.hashCode();
        }

        public String toString() {
            return "LinePoint(startPointF=" + this.f174408a + ", endPointF=" + this.f174409b + ')';
        }
    }

    /* renamed from: li1.f$b */
    public static final class C61297b extends C87413o implements C32224a<Paint> {

        /* renamed from: d */
        public static final C61297b f174410d = new C61297b();

        public C61297b() {
            super(0);
        }

        public Object invoke() {
            Paint paint = new Paint();
            paint.setColor(MMApplicationContext.getResources().getColor(C0966R.color.f3434w));
            paint.setStrokeWidth(2.0f);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            return paint;
        }
    }

    /* renamed from: a */
    public void mo85552a(Canvas canvas, ViewGroup viewGroup) {
        C87412m.m108594g(canvas, "c");
        C87412m.m108594g(viewGroup, "parent");
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        for (C61296a aVar : this.f174407b) {
            PointF pointF = aVar.f174408a;
            float f = (float) width;
            float f2 = pointF.x * f;
            float f3 = (float) height;
            PointF pointF2 = aVar.f174409b;
            canvas.drawLine(f2, pointF.y * f3, pointF2.x * f, pointF2.y * f3, (Paint) ((C36570n) this.f174406a).getValue());
        }
    }

    /* renamed from: b */
    public final void mo86274b(LinkedList<C61296a> linkedList) {
        C87412m.m108594g(linkedList, "points");
        this.f174407b.clear();
        this.f174407b.addAll(linkedList);
    }
}
