package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.tencent.p014mm.C0966R;

public class AppCompatImageButton extends ImageButton {

    /* renamed from: d */
    public final C103523d f305450d;

    /* renamed from: e */
    public final C103536h f305451e;

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.f2840pc);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C103523d dVar = this.f305450d;
        if (dVar != null) {
            dVar.mo144312a();
        }
        C103536h hVar = this.f305451e;
        if (hVar != null) {
            hVar.mo144345a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C103523d dVar = this.f305450d;
        if (dVar != null) {
            return dVar.mo144313b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C103523d dVar = this.f305450d;
        if (dVar != null) {
            return dVar.mo144314c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C103524d0 d0Var;
        C103536h hVar = this.f305451e;
        if (hVar == null || (d0Var = hVar.f305740b) == null) {
            return null;
        }
        return d0Var.f305710a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C103524d0 d0Var;
        C103536h hVar = this.f305451e;
        if (hVar == null || (d0Var = hVar.f305740b) == null) {
            return null;
        }
        return d0Var.f305711b;
    }

    public boolean hasOverlappingRendering() {
        return ((this.f305451e.f305739a.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C103523d dVar = this.f305450d;
        if (dVar != null) {
            dVar.mo144316e(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C103523d dVar = this.f305450d;
        if (dVar != null) {
            dVar.mo144317f(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C103536h hVar = this.f305451e;
        if (hVar != null) {
            hVar.mo144345a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C103536h hVar = this.f305451e;
        if (hVar != null) {
            hVar.mo144345a();
        }
    }

    public void setImageResource(int i) {
        this.f305451e.mo144347c(i);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C103536h hVar = this.f305451e;
        if (hVar != null) {
            hVar.mo144345a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C103523d dVar = this.f305450d;
        if (dVar != null) {
            dVar.mo144319h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C103523d dVar = this.f305450d;
        if (dVar != null) {
            dVar.mo144320i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C103536h hVar = this.f305451e;
        if (hVar != null) {
            if (hVar.f305740b == null) {
                hVar.f305740b = new C103524d0();
            }
            C103524d0 d0Var = hVar.f305740b;
            d0Var.f305710a = colorStateList;
            d0Var.f305713d = true;
            hVar.mo144345a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C103536h hVar = this.f305451e;
        if (hVar != null) {
            if (hVar.f305740b == null) {
                hVar.f305740b = new C103524d0();
            }
            C103524d0 d0Var = hVar.f305740b;
            d0Var.f305711b = mode;
            d0Var.f305712c = true;
            hVar.mo144345a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C103522c0.m137532a(context);
        C103523d dVar = new C103523d(this);
        this.f305450d = dVar;
        dVar.mo144315d(attributeSet, i);
        C103536h hVar = new C103536h(this);
        this.f305451e = hVar;
        hVar.mo144346b(attributeSet, i);
    }
}
