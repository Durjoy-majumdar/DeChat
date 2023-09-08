package com.tencent.kinda.framework.widget.base;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Arrays;

public class MMKViewBackgroundBorderDrawable extends Drawable {
    private int backgroundColor = 0;
    private int borderColor = 0;
    private Path borderPath;
    private int borderPressedColor = 0;
    private float borderRadius = 0.0f;
    private float borderWidth = 0.0f;
    private float bottomLeftBorderRadius = 0.0f;
    private float bottomRightBorderRadius = 0.0f;
    private Drawable insetDrawable;
    private Path insetDrawableClipPath;
    private boolean isPressed = false;
    private View mView;
    private Paint paint = new Paint();
    private RectF roundBorderRectF = new RectF();
    private float[] roundBorderradii = new float[8];
    private float topLeftBorderRadius = 0.0f;
    private float topRightBorderRadius = 0.0f;

    public MMKViewBackgroundBorderDrawable(View view) {
        Paint paint2 = new Paint();
        this.paint = paint2;
        paint2.setAntiAlias(true);
        this.borderPath = new Path();
        this.insetDrawableClipPath = new Path();
        this.mView = view;
    }

    private boolean containsPressedState(int[] iArr) {
        for (int i : iArr) {
            if (i == 16842919) {
                return true;
            }
        }
        return false;
    }

    private void drawClipRadiusBorder(Canvas canvas) {
        this.paint.reset();
        this.borderPath.reset();
        this.insetDrawableClipPath.reset();
        this.paint.setAntiAlias(true);
        this.roundBorderRectF.set(getBounds());
        RectF rectF = this.roundBorderRectF;
        float f = this.borderWidth;
        rectF.inset(f / 2.0f, f / 2.0f);
        Arrays.fill(this.roundBorderradii, this.borderRadius);
        float f2 = this.topLeftBorderRadius;
        if (f2 > 0.0f) {
            float[] fArr = this.roundBorderradii;
            fArr[0] = f2;
            fArr[1] = f2;
        }
        float f3 = this.topRightBorderRadius;
        if (f3 > 0.0f) {
            float[] fArr2 = this.roundBorderradii;
            fArr2[2] = f3;
            fArr2[3] = f3;
        }
        float f4 = this.bottomLeftBorderRadius;
        if (f4 > 0.0f) {
            float[] fArr3 = this.roundBorderradii;
            fArr3[4] = f4;
            fArr3[5] = f4;
        }
        float f5 = this.bottomRightBorderRadius;
        if (f5 > 0.0f) {
            float[] fArr4 = this.roundBorderradii;
            fArr4[6] = f5;
            fArr4[7] = f5;
        }
        this.borderPath.addRoundRect(this.roundBorderRectF, this.roundBorderradii, Path.Direction.CCW);
        this.roundBorderRectF.set(getBounds());
        RectF rectF2 = this.roundBorderRectF;
        float f6 = this.borderWidth;
        rectF2.inset(f6, f6);
        Arrays.fill(this.roundBorderradii, this.borderRadius);
        float f7 = this.topLeftBorderRadius;
        if (f7 > 0.0f) {
            float[] fArr5 = this.roundBorderradii;
            fArr5[0] = f7;
            fArr5[1] = f7;
        }
        float f8 = this.topRightBorderRadius;
        if (f8 > 0.0f) {
            float[] fArr6 = this.roundBorderradii;
            fArr6[2] = f8;
            fArr6[3] = f8;
        }
        float f9 = this.bottomLeftBorderRadius;
        if (f9 > 0.0f) {
            float[] fArr7 = this.roundBorderradii;
            fArr7[4] = f9;
            fArr7[5] = f9;
        }
        float f15 = this.bottomRightBorderRadius;
        if (f15 > 0.0f) {
            float[] fArr8 = this.roundBorderradii;
            fArr8[6] = f15;
            fArr8[7] = f15;
        }
        this.insetDrawableClipPath.addRoundRect(this.roundBorderRectF, this.roundBorderradii, Path.Direction.CCW);
        if (this.insetDrawable == null && Color.alpha(this.backgroundColor) > 0) {
            this.paint.setStyle(Paint.Style.FILL);
            this.paint.setColor(this.backgroundColor);
            canvas.drawPath(this.borderPath, this.paint);
        }
        if (Color.alpha(this.borderColor) > 0 && !this.isPressed) {
            this.paint.setColor(this.borderColor);
            this.paint.setStyle(Paint.Style.STROKE);
            canvas.drawPath(this.borderPath, this.paint);
            if (this.insetDrawable != null) {
                canvas.clipPath(this.insetDrawableClipPath);
            }
        } else if (Color.alpha(this.borderPressedColor) <= 0 || !this.isPressed) {
            canvas.clipPath(this.insetDrawableClipPath);
        } else {
            this.paint.setColor(this.borderPressedColor);
            this.paint.setStyle(Paint.Style.STROKE);
            canvas.drawPath(this.borderPath, this.paint);
            if (this.insetDrawable != null) {
                canvas.clipPath(this.insetDrawableClipPath);
            }
        }
    }

    private void drawClipRectBorder(Canvas canvas) {
        Rect bounds = getBounds();
        int i = bounds.top;
        int i2 = bounds.left;
        int width = bounds.width();
        int height = bounds.height();
        this.paint.reset();
        if (this.isPressed) {
            this.paint.setColor(this.borderPressedColor);
        } else {
            this.paint.setColor(this.borderColor);
        }
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setAntiAlias(true);
        this.borderPath.reset();
        float f = (float) i2;
        float f2 = (float) i;
        this.borderPath.moveTo(f, f2);
        this.borderPath.lineTo(this.borderWidth + f, f2);
        float f3 = (float) (i + height);
        this.borderPath.lineTo(this.borderWidth + f, f3);
        this.borderPath.lineTo(f, f3);
        this.borderPath.lineTo(f, f2);
        canvas.drawPath(this.borderPath, this.paint);
        this.borderPath.reset();
        this.borderPath.moveTo(this.borderWidth + f, f2);
        float f4 = (float) (i2 + width);
        this.borderPath.lineTo(f4, f2);
        this.borderPath.lineTo(f4, this.borderWidth + f2);
        Path path = this.borderPath;
        float f5 = this.borderWidth;
        path.lineTo(f + f5, f5 + f2);
        this.borderPath.lineTo(this.borderWidth + f, f2);
        canvas.drawPath(this.borderPath, this.paint);
        this.borderPath.reset();
        this.borderPath.moveTo(f4, f2);
        this.borderPath.lineTo(f4, f3);
        this.borderPath.lineTo(f4 - this.borderWidth, f3);
        this.borderPath.lineTo(f4 - this.borderWidth, f2);
        this.borderPath.lineTo(f4, f2);
        canvas.drawPath(this.borderPath, this.paint);
        this.borderPath.reset();
        Path path2 = this.borderPath;
        float f6 = this.borderWidth;
        path2.moveTo(f + f6, f3 - f6);
        this.borderPath.lineTo(f4, f3 - this.borderWidth);
        this.borderPath.lineTo(f4, f3);
        this.borderPath.lineTo(this.borderWidth + f, f3);
        Path path3 = this.borderPath;
        float f7 = this.borderWidth;
        path3.lineTo(f + f7, f3 - f7);
        canvas.drawPath(this.borderPath, this.paint);
        this.paint.setAntiAlias(false);
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width > 0 && height > 0) {
            this.paint.reset();
            if (this.borderRadius > 0.0f || this.topLeftBorderRadius > 0.0f || this.topRightBorderRadius > 0.0f || this.bottomLeftBorderRadius > 0.0f || this.bottomRightBorderRadius > 0.0f) {
                drawClipRadiusBorder(canvas);
                Drawable drawable = this.insetDrawable;
                if (drawable != null) {
                    drawable.draw(canvas);
                    return;
                }
                return;
            }
            Drawable drawable2 = this.insetDrawable;
            if (drawable2 == null) {
                canvas.drawARGB(Color.alpha(this.backgroundColor), Color.red(this.backgroundColor), Color.green(this.backgroundColor), Color.blue(this.backgroundColor));
            } else {
                drawable2.draw(canvas);
            }
            if (this.borderWidth > 0.0f) {
                drawClipRectBorder(canvas);
            }
        }
    }

    public int getOpacity() {
        Drawable drawable = this.insetDrawable;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        int i = this.backgroundColor;
        if (i == 0) {
            return -2;
        }
        return Color.alpha(i) > 0 ? -3 : -1;
    }

    public boolean isStateful() {
        Drawable drawable = this.insetDrawable;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return false;
    }

    public boolean onStateChange(int[] iArr) {
        View view = this.mView;
        if (view != null && !view.isEnabled() && containsPressedState(iArr) && !this.isPressed) {
            return false;
        }
        if (containsPressedState(iArr)) {
            this.isPressed = true;
        } else {
            this.isPressed = false;
        }
        Drawable drawable = this.insetDrawable;
        if (drawable == null) {
            return super.onStateChange(iArr);
        }
        boolean state = drawable.setState(iArr);
        invalidateSelf();
        return state;
    }

    public void setAlpha(int i) {
        Drawable drawable = this.insetDrawable;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    public void setBackgroundColor(int i) {
        if (this.backgroundColor != i) {
            this.backgroundColor = i;
            invalidateSelf();
        }
    }

    public void setBorderColor(int i) {
        if (this.borderColor != i) {
            this.borderColor = i;
            invalidateSelf();
        }
    }

    public void setBorderPressedColor(int i) {
        if (this.borderPressedColor != i) {
            this.borderPressedColor = i;
            invalidateSelf();
        }
    }

    public void setBorderRadius(float f) {
        if (this.borderRadius != f) {
            this.borderRadius = f;
            invalidateSelf();
        }
    }

    public void setBorderWidth(float f) {
        if (this.borderWidth != f) {
            this.borderWidth = f;
            invalidateSelf();
        }
    }

    public void setBottomLeftBorderRadius(float f) {
        if (this.bottomLeftBorderRadius != f) {
            this.bottomLeftBorderRadius = f;
            invalidateSelf();
        }
    }

    public void setBottomRightBorderRadius(float f) {
        if (this.bottomRightBorderRadius != f) {
            this.bottomRightBorderRadius = f;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.insetDrawable;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    public void setInsetDrawable(Drawable drawable) {
        this.insetDrawable = drawable;
        invalidateSelf();
    }

    public void setTopLeftBorderRadius(float f) {
        if (this.topLeftBorderRadius != f) {
            this.topLeftBorderRadius = f;
            invalidateSelf();
        }
    }

    public void setTopRightBorderRadius(float f) {
        if (this.topRightBorderRadius != f) {
            this.topRightBorderRadius = f;
            invalidateSelf();
        }
    }
}
