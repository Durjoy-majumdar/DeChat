package px0;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import p248ug.C37468y;
import p248ug.C52558c;
import p391w3.C22857b;
import rb0.C48009v0;

/* renamed from: px0.r */
public final class C22058r {

    /* renamed from: a */
    public static final C22058r f62430a = new C22058r();

    /* renamed from: b */
    public static boolean f62431b;

    /* renamed from: a */
    public final Matrix mo35165a(Bitmap bitmap) {
        float f;
        float f2;
        C87412m.m108594g(bitmap, "fgBitmap");
        Matrix matrix = new Matrix();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = C22055p.f62409o;
        int i2 = C22055p.f62409o;
        int i3 = C22055p.f62410p;
        float f3 = 0.0f;
        if (width * i3 > i2 * height) {
            f = ((float) i3) / ((float) height);
            f3 = (((float) i2) - (((float) width) * f)) * 0.5f;
            f2 = 0.0f;
        } else {
            float f4 = ((float) i2) / ((float) width);
            f2 = (((float) i3) - (((float) height) * f4)) * 0.5f;
            f = f4;
        }
        matrix.setScale(f, f);
        matrix.postTranslate(f3, f2);
        return matrix;
    }

    /* renamed from: b */
    public final Paint mo35166b() {
        Paint paint = new Paint();
        int[] iArr = {0, 0, Color.parseColor("#4D000000")};
        int i = C22055p.f62409o;
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, (float) C22055p.f62410p, iArr, new float[]{0.0f, C22055p.f62412r, 1.0f}, Shader.TileMode.CLAMP));
        return paint;
    }

    /* renamed from: c */
    public final Paint mo35167c(Bitmap bitmap) {
        int i;
        C87412m.m108594g(bitmap, "upImageBm");
        C22857b.C22859b bVar = new C22857b.C22859b(bitmap);
        int height = bitmap.getHeight() - 20;
        int width = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        if (bVar.f65702a != null) {
            if (bVar.f65708g == null) {
                bVar.f65708g = new Rect();
            }
            bVar.f65708g.set(0, 0, bVar.f65702a.getWidth(), bVar.f65702a.getHeight());
            if (!bVar.f65708g.intersect(0, height, width, height2)) {
                throw new IllegalArgumentException("The given region must intersect with the Bitmap's dimensions.");
            }
        }
        C22857b.C22862e eVar = bVar.mo36019b().f65701e;
        if (eVar == null) {
            Log.m105928w("MicroMsg.NativeFinderListUtil", "dominantSwatch == null");
            i = -16777216;
        } else {
            i = eVar.f65714d;
        }
        Paint paint = new Paint();
        int[] iArr = {0, 0, i, i};
        int i2 = C22055p.f62409o;
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, (float) C22055p.f62410p, iArr, new float[]{0.0f, C22055p.f62412r, C22055p.f62413s, 1.0f}, Shader.TileMode.CLAMP));
        return paint;
    }

    /* renamed from: d */
    public final void mo35168d(String str, Context context) {
        C87412m.m108594g(str, "bizusername");
        C87412m.m108594g(context, "mContext");
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        C52558c SE = C48009v0.Fx0().mo72757SE(str);
        int i = C22055p.f62409o;
        Log.m105924i("MicroMsg.NativeFinderListHelper", "onUnfollow, username = " + str);
        ((C37468y) C86312j.m106911c(C37468y.class)).mo61116ee(SE, (Activity) context, z1Var, false);
    }
}
