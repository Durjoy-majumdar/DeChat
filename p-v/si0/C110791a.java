package si0;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;
import java.io.Serializable;
import js0.C46573p;

/* renamed from: si0.a */
public class C110791a extends Paint implements Serializable {

    /* renamed from: d */
    public C110792a f331431d = C110792a.NORMAL;

    /* renamed from: e */
    public float f331432e;

    /* renamed from: f */
    public int f331433f;

    /* renamed from: g */
    public String f331434g;

    /* renamed from: h */
    public int f331435h;

    /* renamed from: i */
    public float f331436i = Float.MAX_VALUE;

    /* renamed from: j */
    public int f331437j = Integer.MAX_VALUE;

    /* renamed from: si0.a$a */
    public enum C110792a {
        NORMAL,
        TOP,
        BOTTOM,
        MIDDLE
    }

    public C110791a() {
        mo162350c();
    }

    /* renamed from: a */
    public C110791a mo162348a() {
        C110791a aVar = new C110791a();
        aVar.setColor(getColor());
        aVar.setFlags(getFlags());
        aVar.setDither(isDither());
        Shader shader = getShader();
        if (shader != null) {
            Object a = C46573p.m51896a(Shader.class, "copy", shader, new Class[0], new Object[0]);
            if (a != null && (a instanceof Shader)) {
                shader = (Shader) a;
            }
            aVar.setShader(shader);
        }
        aVar.setStrokeJoin(getStrokeJoin());
        aVar.setStrokeMiter(getStrokeMiter());
        aVar.setStrokeWidth(getStrokeWidth());
        aVar.setStrokeCap(getStrokeCap());
        aVar.setStyle(getStyle());
        aVar.setTextSize(getTextSize());
        aVar.setTextAlign(getTextAlign());
        aVar.setTypeface(getTypeface());
        aVar.f331431d = this.f331431d;
        return aVar;
    }

    /* renamed from: b */
    public C110791a mo162349b(C110791a aVar) {
        aVar.setColor(getColor());
        aVar.setFlags(getFlags());
        aVar.setDither(isDither());
        Shader shader = getShader();
        if (shader != null) {
            Object a = C46573p.m51896a(Shader.class, "copy", shader, new Class[0], new Object[0]);
            if (a != null && (a instanceof Shader)) {
                shader = (Shader) a;
            }
            aVar.setShader(shader);
        }
        aVar.setStrokeJoin(getStrokeJoin());
        aVar.setStrokeMiter(getStrokeMiter());
        aVar.setStrokeWidth(getStrokeWidth());
        aVar.setStrokeCap(getStrokeCap());
        aVar.setStyle(getStyle());
        aVar.setTextSize(getTextSize());
        aVar.setTextAlign(getTextAlign());
        aVar.setTypeface(getTypeface());
        aVar.f331431d = this.f331431d;
        return aVar;
    }

    /* renamed from: c */
    public final void mo162350c() {
        this.f331432e = 0.0f;
        this.f331433f = 0;
        this.f331434g = null;
        this.f331435h = 0;
        float f = this.f331436i;
        if (f == Float.MAX_VALUE) {
            float alpha = ((float) getAlpha()) / 255.0f;
            this.f331432e = alpha;
            this.f331436i = alpha;
        } else {
            this.f331432e = f;
        }
        int i = this.f331437j;
        if (i == Integer.MAX_VALUE) {
            int color = getColor();
            this.f331433f = color;
            this.f331437j = color;
            return;
        }
        this.f331433f = i;
    }

    public Object clone() {
        return super.clone();
    }

    /* renamed from: d */
    public void mo162352d(int i) {
        this.f331435h = i;
        setTypeface(Typeface.create(this.f331434g, i));
    }

    public void reset() {
        super.reset();
        this.f331431d = C110792a.NORMAL;
    }

    public void setColor(int i) {
        this.f331433f = i;
        super.setColor((i & 16777215) | ((((int) (((float) Color.alpha(i)) * this.f331432e)) & 255) << 24));
    }
}
