package com.tencent.p014mm.p136ui.widget.seekbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.tencent.p014mm.p136ui.C74942w4;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/seekbar/BothSidesSeekBar;", "Landroidx/appcompat/widget/AppCompatSeekBar;", "", "g", "Z", "isBothSidesMode", "()Z", "setBothSidesMode", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "weui-native-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar */
public final class BothSidesSeekBar extends AppCompatSeekBar {

    /* renamed from: e */
    public int f319723e;

    /* renamed from: f */
    public Paint f319724f;

    /* renamed from: g */
    public boolean f319725g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BothSidesSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public final void mo154682a(int i) {
        this.f319723e = i;
        this.f319724f.setStrokeWidth((float) i);
    }

    public synchronized void onDraw(Canvas canvas) {
        synchronized (this) {
            C87412m.m108594g(canvas, "canvas");
            this.f319724f.setColor(1308622847);
            this.f319724f.setShader((Shader) null);
            canvas.drawLine(((float) getThumbOffset()) + 0.0f, ((float) getHeight()) / 2.0f, ((float) getWidth()) - ((float) getThumbOffset()), ((float) getHeight()) / 2.0f, this.f319724f);
            if (this.f319725g) {
                int max = getMax() / 2;
                if (getProgress() > max) {
                    float thumbOffset = ((float) getThumbOffset()) + (((float) getWidth()) / 2.0f);
                    float height = ((float) getHeight()) / 2.0f;
                    float thumbOffset2 = ((float) getThumbOffset()) + (((float) getWidth()) / 2.0f) + ((float) (((getWidth() - (getThumbOffset() * 2)) / getMax()) * (getProgress() - max)));
                    float height2 = ((float) getHeight()) / 2.0f;
                    Paint paint = this.f319724f;
                    paint.reset();
                    paint.setStrokeCap(Paint.Cap.ROUND);
                    paint.setStrokeWidth((float) this.f319723e);
                    this.f319724f.setShader(new LinearGradient(thumbOffset, height, thumbOffset2, height2, new int[]{Color.parseColor("#63E7A0"), Color.parseColor("#2AAE67")}, (float[]) null, Shader.TileMode.CLAMP));
                    canvas.drawLine(thumbOffset, height, thumbOffset2, height2, this.f319724f);
                }
                if (getProgress() < max) {
                    float width = ((((float) getWidth()) / 2.0f) - ((float) (((getWidth() - (getThumbOffset() * 2)) / getMax()) * (max - getProgress())))) - ((float) getThumbOffset());
                    float height3 = ((float) getHeight()) / 2.0f;
                    float width2 = ((float) getWidth()) / 2.0f;
                    float height4 = ((float) getHeight()) / 2.0f;
                    Paint paint2 = this.f319724f;
                    paint2.reset();
                    paint2.setStrokeCap(Paint.Cap.ROUND);
                    paint2.setStrokeWidth((float) this.f319723e);
                    this.f319724f.setShader(new LinearGradient(width, height3, width2, height4, new int[]{Color.parseColor("#63E7A0"), Color.parseColor("#2AAE67")}, (float[]) null, Shader.TileMode.CLAMP));
                    canvas.drawLine(width, height3, width2, height4, this.f319724f);
                }
            } else {
                float thumbOffset3 = ((float) getThumbOffset()) + 0.0f;
                float height5 = ((float) getHeight()) / 2.0f;
                float thumbOffset4 = ((float) getThumbOffset()) + (((float) (getWidth() - (getThumbOffset() * 2))) * (((float) getProgress()) / ((float) getMax())));
                float height6 = ((float) getHeight()) / 2.0f;
                Paint paint3 = this.f319724f;
                paint3.reset();
                paint3.setStrokeCap(Paint.Cap.ROUND);
                paint3.setStrokeWidth((float) this.f319723e);
                this.f319724f.setShader(new LinearGradient(thumbOffset3, height5, thumbOffset4, height6, new int[]{Color.parseColor("#63E7A0"), Color.parseColor("#2AAE67")}, (float[]) null, Shader.TileMode.CLAMP));
                canvas.drawLine(thumbOffset3, height5, thumbOffset4, height6, this.f319724f);
            }
            super.onDraw(canvas);
        }
    }

    public final void setBothSidesMode(boolean z) {
        this.f319725g = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BothSidesSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f319723e = C74942w4.m89784a(getContext(), 4);
        Paint paint = new Paint();
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth((float) this.f319723e);
        this.f319724f = paint;
    }
}
