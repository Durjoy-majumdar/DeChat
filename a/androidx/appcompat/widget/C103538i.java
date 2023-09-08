package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import p1162x2.C112023e;

/* renamed from: androidx.appcompat.widget.i */
public class C103538i {

    /* renamed from: c */
    public static final int[] f305744c = {16843067, 16843068};

    /* renamed from: a */
    public final ProgressBar f305745a;

    /* renamed from: b */
    public Bitmap f305746b;

    public C103538i(ProgressBar progressBar) {
        this.f305745a = progressBar;
    }

    /* renamed from: a */
    public void mo144349a(AttributeSet attributeSet, int i) {
        C103533f0 l = C103533f0.m137562l(this.f305745a.getContext(), attributeSet, f305744c, i, 0);
        Drawable f = l.mo144337f(0);
        if (f != null) {
            ProgressBar progressBar = this.f305745a;
            if (f instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) f;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable b = mo144350b(animationDrawable.getFrame(i2), true);
                    b.setLevel(10000);
                    animationDrawable2.addFrame(b, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                f = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(f);
        }
        Drawable f2 = l.mo144337f(1);
        if (f2 != null) {
            this.f305745a.setProgressDrawable(mo144350b(f2, false));
        }
        l.mo144343m();
    }

    /* renamed from: b */
    public final Drawable mo144350b(Drawable drawable, boolean z) {
        if (drawable instanceof C112023e) {
            C112023e eVar = (C112023e) drawable;
            Drawable b = eVar.mo163694b();
            if (b != null) {
                eVar.mo163693a(mo144350b(b, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = mo144350b(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f305746b == null) {
                this.f305746b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }
}
