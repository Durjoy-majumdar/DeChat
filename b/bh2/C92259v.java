package bh2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.opengl.Matrix;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fh2.C97881f;
import gy3.C87412m;
import java.io.IOException;
import java.util.ArrayList;
import o40.C61925b;
import p910lj.C76701a;
import tj3.C111010h;

/* renamed from: bh2.v */
public final class C92259v {

    /* renamed from: e */
    public static final float[] f264052e = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: f */
    public static final float[] f264053f = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: g */
    public static final long f264054g = (((long) 1380) + (300 / ((long) 2)));

    /* renamed from: h */
    public static final long f264055h = 1680;

    /* renamed from: a */
    public final ArrayList<C92261b> f264056a = new ArrayList<>();

    /* renamed from: b */
    public final C104109b f264057b = new C104109b();

    /* renamed from: c */
    public C111010h f264058c;

    /* renamed from: d */
    public boolean f264059d;

    /* renamed from: bh2.v$a */
    public final class C92260a {

        /* renamed from: a */
        public int f264060a = -1;

        /* renamed from: b */
        public float f264061b = 1.0f;

        /* renamed from: c */
        public float f264062c;

        /* renamed from: d */
        public float[] f264063d = new float[16];

        /* renamed from: e */
        public float[] f264064e = new float[16];

        public C92260a(C92259v vVar) {
        }
    }

    /* renamed from: bh2.v$b */
    public final class C92261b {

        /* renamed from: a */
        public Bitmap f264065a;

        /* renamed from: b */
        public Bitmap f264066b;

        /* renamed from: c */
        public int f264067c;

        /* renamed from: d */
        public int f264068d;

        /* renamed from: e */
        public int f264069e;

        /* renamed from: f */
        public int f264070f;

        /* renamed from: g */
        public String f264071g = "";

        public C92261b(C92259v vVar) {
        }
    }

    /* renamed from: a */
    public final C92260a mo126252a(long j) {
        long j2 = j;
        C92260a aVar = new C92260a(this);
        if (this.f264056a.size() == 0) {
            return null;
        }
        if (this.f264056a.size() == 1) {
            aVar.f264060a = 0;
            aVar.f264061b = 0.0f;
            aVar.f264062c = 1.0f;
            float[] fArr = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
            float f = ((((float) j2) / ((float) 15000)) / ((float) 2)) + 1.0f;
            fArr[0] = f;
            fArr[5] = f;
            float[] fArr2 = aVar.f264063d;
            float[] fArr3 = f264052e;
            float[] fArr4 = f264053f;
            Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr4, 0);
            Matrix.multiplyMM(aVar.f264064e, 0, fArr, 0, fArr4, 0);
            if (this.f264059d) {
                Matrix.scaleM(aVar.f264063d, 0, 1.0f, -1.0f, 1.0f);
                Matrix.scaleM(aVar.f264064e, 0, 1.0f, -1.0f, 1.0f);
            }
            return aVar;
        }
        float[] fArr5 = aVar.f264063d;
        float[] fArr6 = f264052e;
        float[] fArr7 = f264053f;
        Matrix.multiplyMM(fArr5, 0, fArr6, 0, fArr7, 0);
        Matrix.multiplyMM(aVar.f264064e, 0, fArr6, 0, fArr7, 0);
        long j3 = f264054g;
        long j4 = f264055h;
        boolean z = j2 < (((long) (this.f264056a.size() - 1)) * j4) + j3;
        long size = j2 > j3 ? (((j2 - j3) / j4) + 1) % ((long) this.f264056a.size()) : 0;
        aVar.f264060a = (int) size;
        if (size != 0 || !z) {
            if (j2 > j3) {
                j2 = (j2 - j3) % j4;
            }
            if (j2 < 300) {
                float f2 = ((float) j2) / ((float) 300);
                aVar.f264062c = f2;
                aVar.f264061b = 1.0f - f2;
            } else {
                aVar.f264061b = 0.0f;
                aVar.f264062c = 1.0f;
            }
        } else {
            aVar.f264061b = 0.0f;
            aVar.f264062c = 1.0f;
        }
        if (this.f264059d) {
            Matrix.scaleM(aVar.f264063d, 0, 1.0f, -1.0f, 1.0f);
            Matrix.scaleM(aVar.f264064e, 0, 1.0f, -1.0f, 1.0f);
        }
        return aVar;
    }

    /* renamed from: b */
    public final void mo126253b(C92261b bVar) {
        C92261b bVar2 = bVar;
        if (bVar2.f264065a == null || bVar2.f264066b == null) {
            C61925b bVar3 = new C61925b("addImage");
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(bVar2.f264071g, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            C97881f fVar = C97881f.f287137a;
            options.inSampleSize = BitmapUtil.calculateInSampleSize(i, i2, fVar.mo137201a(), fVar.mo137201a());
            int i3 = 0;
            options.inJustDecodeBounds = false;
            Bitmap c = mo126254c(MMBitmapFactory.m98735d(bVar2.f264071g, options));
            Log.m105924i("MicroMsg.Story.StoryImagePlayer", "resizeBitmap first " + bVar3);
            long currentTimeMillis = System.currentTimeMillis();
            options.inSampleSize = BitmapUtil.calculateInSampleSize(i, i2, fVar.mo137201a() / 2, fVar.mo137201a() / 2);
            Bitmap c2 = mo126254c(MMBitmapFactory.m98735d(bVar2.f264071g, options));
            try {
                if (this.f264058c == null) {
                    this.f264058c = new C111010h(MMApplicationContext.getContext());
                }
                C111010h hVar = this.f264058c;
                C87412m.m108591d(hVar);
                hVar.mo162692b(c2, 4.0f);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Story.StoryImagePlayer", e, "rsblur exception", new Object[0]);
                Log.m105925i("MicroMsg.Story.StoryImagePlayer", "rsblur exception, path:%s", bVar2.f264071g);
                if (Log.getLogLevel() >= 1) {
                    C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "RenderScript Exception", 0).show();
                }
                Point b = C97881f.f287137a.mo137202b();
                c2 = BitmapUtil.createColorBitmap(Color.parseColor("#ff000000"), b.x, b.y);
                C87412m.m108593f(c2, "createColorBitmap(Color.…0000\"), point.x, point.y)");
            }
            Bitmap bitmap = c2;
            Log.m105925i("MicroMsg.Story.StoryImagePlayer", "fastblur cost:%s, sampleSize:%s, width:%s, height:%s resizeBitmap second " + bVar3, Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(options.inSampleSize), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
            if (c != null) {
                String str = bVar2.f264071g;
                C87412m.m108594g(str, "path");
                try {
                    i3 = BackwardSupportUtil.ExifHelper.getExifOrientation(str);
                } catch (IOException e2) {
                    Log.printErrStackTrace("MicroMsg.Story.StoryImagePlayer", e2, "readPictureDegree", new Object[0]);
                }
                if (i3 != 0) {
                    android.graphics.Matrix matrix = new android.graphics.Matrix();
                    matrix.postRotate((float) i3);
                    Bitmap createBitmap = Bitmap.createBitmap(c, 0, 0, c.getWidth(), c.getHeight(), matrix, true);
                    Bitmap createBitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    bVar2.f264065a = createBitmap;
                    C87412m.m108591d(createBitmap);
                    bVar2.f264067c = createBitmap.getWidth();
                    Bitmap bitmap2 = bVar2.f264065a;
                    C87412m.m108591d(bitmap2);
                    bVar2.f264068d = bitmap2.getHeight();
                    bVar2.f264066b = createBitmap2;
                    return;
                }
                bVar2.f264065a = c;
                bVar2.f264066b = bitmap;
                bVar2.f264067c = c.getWidth();
                Bitmap bitmap3 = bVar2.f264065a;
                C87412m.m108591d(bitmap3);
                bVar2.f264068d = bitmap3.getHeight();
            }
        }
    }

    /* renamed from: c */
    public final Bitmap mo126254c(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        if (bitmap.getWidth() % 2 != 1) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth() + 1, bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        C87412m.m108591d(createBitmap);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return createBitmap;
    }
}
