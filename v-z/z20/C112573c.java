package z20;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: z20.c */
public class C112573c implements Cloneable {

    /* renamed from: d */
    public Context f337064d;

    /* renamed from: e */
    public String f337065e;

    /* renamed from: f */
    public IEmojiInfo f337066f;

    /* renamed from: g */
    public Bitmap f337067g;

    /* renamed from: h */
    public Rect f337068h;

    /* renamed from: i */
    public PointF f337069i;

    /* renamed from: j */
    public int f337070j = 0;

    /* renamed from: n */
    public float f337071n = 1.0f;

    /* renamed from: o */
    public float f337072o = 1.0f;

    /* renamed from: p */
    public boolean f337073p;

    /* renamed from: q */
    public PointF f337074q;

    /* renamed from: r */
    public float f337075r;

    /* renamed from: s */
    public float f337076s;

    /* renamed from: t */
    public boolean f337077t = false;

    /* renamed from: u */
    public boolean f337078u = true;

    /* renamed from: v */
    public List<PointF> f337079v = new ArrayList();

    /* renamed from: w */
    public float f337080w;

    /* renamed from: x */
    public float f337081x;

    /* renamed from: z20.c$a */
    public class C112574a {

        /* renamed from: a */
        public float[] f337082a;

        /* renamed from: b */
        public float[] f337083b;

        /* renamed from: c */
        public int f337084c;

        public C112574a(C112573c cVar, List<PointF> list) {
            int size = list.size();
            this.f337084c = size;
            this.f337082a = new float[size];
            this.f337083b = new float[size];
            for (int i = 0; i < this.f337084c; i++) {
                this.f337082a[i] = list.get(i).x;
                this.f337083b[i] = list.get(i).y;
            }
        }
    }

    public C112573c(Context context, Matrix matrix, String str, IEmojiInfo iEmojiInfo, Rect rect) {
        this.f337065e = str;
        this.f337066f = iEmojiInfo;
        this.f337064d = context;
        this.f337068h = rect;
        this.f337069i = new PointF();
        this.f337074q = new PointF();
    }

    /* renamed from: a */
    public C112573c clone() {
        C112573c cVar;
        CloneNotSupportedException e;
        try {
            cVar = (C112573c) super.clone();
            try {
                PointF pointF = this.f337069i;
                cVar.f337069i = new PointF(pointF.x, pointF.y);
                cVar.f337066f = this.f337066f;
            } catch (CloneNotSupportedException e2) {
                e = e2;
            }
        } catch (CloneNotSupportedException e3) {
            CloneNotSupportedException cloneNotSupportedException = e3;
            cVar = null;
            e = cloneNotSupportedException;
            Log.printErrStackTrace("MicroMsg.EmojiItem", e, "", new Object[0]);
            return cVar;
        }
        return cVar;
    }

    /* renamed from: b */
    public void mo164307b(float f, float f2, float f3, int i) {
        this.f337067g = mo164311d(mo164314g());
        this.f337075r = (((float) this.f337068h.width()) * 1.2f) / ((float) this.f337067g.getWidth());
        float width = (((float) this.f337068h.width()) * 0.1f) / ((float) this.f337067g.getWidth());
        float f4 = this.f337075r * f3;
        this.f337075r = f4;
        float f5 = width * f3;
        this.f337076s = f5;
        if (this.f337078u) {
            this.f337072o = (float) (((double) f5) + (((double) (f4 - f5)) * 0.28d));
        } else {
            this.f337072o = 1.0f;
        }
        this.f337070j = i;
        this.f337071n *= this.f337072o;
        Log.m105925i("MicroMsg.EmojiItem", "MAX_SCALE:%s MIN_SCALE:%s mInitScale:%s", Float.valueOf(f4), Float.valueOf(this.f337076s), Float.valueOf(this.f337072o));
        this.f337069i.set(f, f2);
        Log.m105919d("MicroMsg.EmojiItem", "[setPoint] point:%s", this.f337069i);
        mo164318l();
    }

    /* renamed from: c */
    public void mo164308c(Canvas canvas) {
        Bitmap bitmap = this.f337067g;
        if (bitmap == null || bitmap.isRecycled()) {
            Log.m105928w("MicroMsg.EmojiItem", "[draw] null == bitmap || bitmap isRecycled");
            return;
        }
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        float f = this.f337075r;
        float f2 = this.f337071n;
        if (f < f2) {
            this.f337071n = f;
        } else {
            float f3 = this.f337076s;
            if (f3 > f2) {
                this.f337071n = f3;
            }
        }
        canvas.save();
        PointF pointF = this.f337069i;
        canvas.translate(pointF.x, pointF.y);
        canvas.rotate((float) this.f337070j);
        float f4 = this.f337071n;
        canvas.scale(f4, f4);
        canvas.setDensity(this.f337067g.getDensity());
        if (this.f337073p) {
            canvas.drawBitmap(this.f337067g, (float) ((-mo164313f()) / 2), (float) ((-mo164312e()) / 2), (Paint) null);
        } else {
            canvas.clipRect(((float) ((-mo164313f()) / 2)) + 40.0f, ((float) ((-mo164312e()) / 2)) + 40.0f, ((float) (this.f337067g.getWidth() / 2)) - 40.0f, ((float) (this.f337067g.getHeight() / 2)) - 40.0f);
            canvas.drawBitmap(this.f337067g, (float) ((-mo164313f()) / 2), (float) ((-mo164312e()) / 2), (Paint) null);
        }
        canvas.restore();
        canvas.setDrawFilter((DrawFilter) null);
    }

    public void clear() {
        Log.m105924i("MicroMsg.EmojiItem", "[clear]");
        Bitmap bitmap = this.f337067g;
        if (bitmap != null && !bitmap.isRecycled()) {
            Log.m105925i("MicroMsg.EmojiItem", "bitmap recycle %s", this.f337067g.toString());
            this.f337067g.recycle();
            this.f337067g = null;
        }
    }

    /* renamed from: d */
    public final Bitmap mo164311d(Bitmap bitmap) {
        int width = (int) (((float) bitmap.getWidth()) + 80.0f);
        int height = (int) (((float) bitmap.getHeight()) + 80.0f);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        createBitmap.setDensity(bitmap.getDensity());
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, 40.0f, 40.0f, (Paint) null);
        NinePatchDrawable ninePatchDrawable = new NinePatchDrawable(this.f337064d.getResources(), BitmapFactory.decodeResource(this.f337064d.getResources(), C0966R.C0969drawable.emoji_box), BitmapFactory.decodeResource(this.f337064d.getResources(), C0966R.C0969drawable.emoji_box).getNinePatchChunk(), new Rect(), (String) null);
        ninePatchDrawable.setBounds(0, 0, width, height);
        ninePatchDrawable.draw(canvas);
        return createBitmap;
    }

    /* renamed from: e */
    public final int mo164312e() {
        Bitmap bitmap = this.f337067g;
        if (bitmap != null) {
            return bitmap.getHeight();
        }
        return 0;
    }

    /* renamed from: f */
    public int mo164313f() {
        Bitmap bitmap = this.f337067g;
        if (bitmap != null) {
            return bitmap.getWidth();
        }
        return 0;
    }

    /* renamed from: g */
    public Bitmap mo164314g() {
        Bitmap bitmap = this.f337067g;
        if (bitmap == null || bitmap.isRecycled()) {
            this.f337067g = this.f337066f.mo62657d1(this.f337064d, 480);
        }
        if (this.f337067g == null) {
            Log.m105920e("MicroMsg.EmojiItem", "[getEmojiBitmap] NULL!");
            new BitmapUtil();
            this.f337067g = BitmapUtil.createBitmap(120, 120, Bitmap.Config.ARGB_4444);
            new Canvas(this.f337067g).drawColor(-7829368);
        }
        return this.f337067g;
    }

    /* renamed from: h */
    public final PointF mo164315h(float f) {
        float f2 = (this.f337071n / this.f337072o) / 2.0f;
        double f3 = (double) (((((float) mo164313f()) * 1.0f) / 2.0f) * f2);
        double e = (double) (((((float) mo164312e()) * 1.0f) / 2.0f) * f2);
        this.f337081x = (float) Math.sqrt((f3 * f3) + (e * e));
        PointF pointF = new PointF();
        double d = (((double) (((float) this.f337070j) + f)) * 3.141592653589793d) / 180.0d;
        pointF.x = this.f337069i.x + ((float) (((double) this.f337081x) * Math.cos(d)));
        pointF.y = this.f337069i.y + ((float) (((double) this.f337081x) * Math.sin(d)));
        return pointF;
    }

    /* renamed from: j */
    public void mo164316j(Rect rect) {
        float f = this.f337071n;
        double f2 = (double) ((((float) (mo164313f() / 2)) - 40.0f) * 1.0f * f);
        double e = (double) ((((float) (mo164312e() / 2)) - 40.0f) * 1.0f * f);
        double d = (((double) ((((float) this.f337070j) + this.f337080w) - 180.0f)) * 3.141592653589793d) / 180.0d;
        double sqrt = (double) ((float) Math.sqrt((f2 * f2) + (e * e)));
        int cos = (int) (this.f337069i.x + ((float) (Math.cos(d) * sqrt)));
        double d2 = (((double) (((float) this.f337070j) - this.f337080w)) * 3.141592653589793d) / 180.0d;
        int sin = (int) (this.f337069i.y + ((float) (Math.sin(d2) * sqrt)));
        double d3 = (((double) ((((float) this.f337070j) - this.f337080w) + 180.0f)) * 3.141592653589793d) / 180.0d;
        double d4 = (((double) (((float) this.f337070j) + this.f337080w)) * 3.141592653589793d) / 180.0d;
        rect.set(Math.min(cos, (int) (this.f337069i.x + ((float) (sqrt * Math.cos(d3))))), Math.min((int) (this.f337069i.y + ((float) (Math.sin(d) * sqrt))), sin), Math.max((int) (this.f337069i.x + ((float) (Math.cos(d2) * sqrt))), (int) (this.f337069i.x + ((float) (Math.cos(d4) * sqrt)))), Math.max((int) (this.f337069i.y + ((float) (Math.sin(d3) * sqrt))), (int) (this.f337069i.y + ((float) (sqrt * Math.sin(d4))))));
    }

    /* renamed from: k */
    public boolean mo164317k() {
        Log.m105918d("MicroMsg.EmojiItem", "[recycleBitmap]");
        Bitmap bitmap = this.f337067g;
        if (bitmap == null || bitmap.isRecycled()) {
            return false;
        }
        Log.m105925i("MicroMsg.EmojiItem", "bitmap recycle %s", this.f337067g.toString());
        this.f337067g.recycle();
        return true;
    }

    /* renamed from: l */
    public void mo164318l() {
        float f = this.f337072o;
        double f2 = (double) (((((float) mo164313f()) * 1.0f) / 2.0f) * f);
        double e = (double) (((((float) mo164312e()) * 1.0f) / 2.0f) * f);
        this.f337081x = (float) Math.sqrt((f2 * f2) + (e * e));
        this.f337080w = (float) Math.toDegrees(Math.atan(e / f2));
    }

    /* renamed from: m */
    public void mo164319m(boolean z) {
        this.f337073p = z;
    }

    public C112573c(Context context, Matrix matrix, String str, Rect rect) {
        this.f337065e = str;
        this.f337064d = context;
        this.f337068h = rect;
        this.f337069i = new PointF();
        this.f337074q = new PointF();
    }
}
