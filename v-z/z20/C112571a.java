package z20;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: z20.a */
public class C112571a implements Cloneable {

    /* renamed from: h */
    public static int f337043h = ((int) MMApplicationContext.getResources().getDimension(C0966R.dimen.f4186vh));

    /* renamed from: i */
    public static int f337044i = ((int) MMApplicationContext.getResources().getDimension(C0966R.dimen.f4185vg));

    /* renamed from: j */
    public static float f337045j = MMApplicationContext.getResources().getDimension(C0966R.dimen.f4298zr);

    /* renamed from: n */
    public static float f337046n = MMApplicationContext.getResources().getDimension(C0966R.dimen.f4297zq);

    /* renamed from: o */
    public static Path f337047o = new Path();

    /* renamed from: p */
    public static Path f337048p = new Path();

    /* renamed from: q */
    public static Paint f337049q = new Paint();

    /* renamed from: r */
    public static Paint f337050r = new Paint();

    /* renamed from: s */
    public static Paint f337051s = new Paint();

    /* renamed from: t */
    public static Paint f337052t = new Paint();

    /* renamed from: u */
    public static Paint f337053u = new Paint();

    /* renamed from: v */
    public static Rect f337054v = new Rect();

    /* renamed from: d */
    public Rect f337055d;

    /* renamed from: e */
    public Rect f337056e = new Rect();

    /* renamed from: f */
    public Matrix f337057f = new Matrix();

    /* renamed from: g */
    public int f337058g = 1;

    static {
        f337051s.setColor(-16777216);
        f337049q.setColor(-1);
        f337049q.setStrokeWidth((float) f337043h);
        f337049q.setStyle(Paint.Style.STROKE);
        f337049q.setAntiAlias(true);
        f337052t.set(f337049q);
        f337052t.setStrokeWidth((float) f337044i);
        f337053u.set(f337049q);
        f337053u.setStrokeWidth(f337045j);
        f337050r.set(f337049q);
        f337050r.setStrokeWidth((float) (f337043h * 7));
        f337050r.setColor(549174203);
    }

    public C112571a(Rect rect) {
        new Rect();
        this.f337055d = rect;
    }

    public Object clone() {
        return super.clone();
    }

    public C112571a() {
        new Rect();
    }
}
