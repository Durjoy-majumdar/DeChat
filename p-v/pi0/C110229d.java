package pi0;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import eb0.C86493v0;
import java.util.Stack;
import js0.C88020k;
import ri0.C110571b;
import ri0.C110572c;
import si0.C110791a;

/* renamed from: pi0.d */
public class C110229d implements C110221a {

    /* renamed from: a */
    public C110791a f329744a;

    /* renamed from: b */
    public C110791a f329745b;

    /* renamed from: c */
    public Stack<C110791a> f329746c;

    /* renamed from: d */
    public Stack<C110791a> f329747d;

    /* renamed from: e */
    public Paint f329748e = new Paint();

    /* renamed from: f */
    public Paint f329749f;

    /* renamed from: g */
    public C110230e f329750g;

    /* renamed from: h */
    public C110221a f329751h;

    /* renamed from: i */
    public C82381f f329752i;

    /* renamed from: j */
    public boolean f329753j;

    public C110229d(C110221a aVar) {
        new C86493v0.C86494b((C86493v0.C45632a) null);
        this.f329753j = true;
        this.f329751h = aVar;
        this.f329744a = C110572c.f330728b.mo162065a();
        this.f329745b = this.f329753j ? C110571b.f330727b.mo162065a() : new C110791a();
        this.f329744a.setStyle(Paint.Style.STROKE);
        this.f329745b.setStyle(Paint.Style.FILL);
        this.f329744a.setAntiAlias(true);
        this.f329745b.setAntiAlias(true);
        this.f329744a.setStrokeWidth((float) C88020k.m109553d(1));
        this.f329745b.setStrokeWidth((float) C88020k.m109553d(1));
        this.f329746c = new Stack<>();
        this.f329747d = new Stack<>();
        this.f329748e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    /* renamed from: a */
    public void mo161636a() {
        this.f329746c.clear();
        this.f329747d.clear();
        this.f329744a.reset();
        this.f329745b.reset();
        this.f329744a.setStyle(Paint.Style.STROKE);
        this.f329745b.setStyle(Paint.Style.FILL);
        this.f329744a.setAntiAlias(true);
        this.f329745b.setAntiAlias(true);
        this.f329744a.setStrokeWidth((float) C88020k.m109553d(1));
        this.f329745b.setStrokeWidth((float) C88020k.m109553d(1));
    }

    public void invalidate() {
        this.f329751h.invalidate();
    }
}
