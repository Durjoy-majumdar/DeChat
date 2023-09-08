package p419td;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;

/* renamed from: td.h */
public class C26306h {

    /* renamed from: a */
    public C26304g f73275a;

    /* renamed from: b */
    public C26301e f73276b;

    /* renamed from: c */
    public Canvas f73277c;

    /* renamed from: d */
    public C26308j f73278d;

    /* renamed from: e */
    public Paint f73279e;

    /* renamed from: f */
    public C90392c f73280f;

    /* renamed from: g */
    public char[] f73281g = new char[1];

    /* renamed from: h */
    public Rect f73282h = new Rect();

    /* renamed from: i */
    public Paint.FontMetrics f73283i;

    public C26306h(C26301e eVar, C26304g gVar) {
        new Rect();
        new ArrayList();
        this.f73283i = new Paint.FontMetrics();
        this.f73276b = eVar;
        this.f73277c = new Canvas(this.f73276b.f73260a);
        this.f73275a = gVar;
        Paint paint = new Paint(1);
        this.f73279e = paint;
        paint.setTextAlign(Paint.Align.LEFT);
        this.f73279e.setColor(-1);
    }

    /* renamed from: a */
    public float mo53181a(List<C26310k> list) {
        float f = 0.0f;
        if (!(list == null || list.size() == 0)) {
            for (C26310k next : list) {
                if (next != null) {
                    f += next.f73304a;
                }
            }
        }
        return f;
    }
}
