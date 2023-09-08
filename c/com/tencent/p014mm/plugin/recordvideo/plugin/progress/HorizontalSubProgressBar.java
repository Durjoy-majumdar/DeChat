package com.tencent.p014mm.plugin.recordvideo.plugin.progress;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import sx3.C64197v;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/progress/HorizontalSubProgressBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "style", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.progress.HorizontalSubProgressBar */
public final class HorizontalSubProgressBar extends View {

    /* renamed from: d */
    public int f20382d = Color.parseColor("#FA9D3B");

    /* renamed from: e */
    public Paint f20383e;

    /* renamed from: f */
    public Paint f20384f;

    /* renamed from: g */
    public Paint f20385g;

    /* renamed from: h */
    public ArrayList<Float> f20386h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalSubProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        int parseColor = Color.parseColor("#ffffff");
        int parseColor2 = Color.parseColor("#FA5151");
        this.f20383e = new Paint();
        this.f20384f = new Paint();
        this.f20385g = new Paint();
        this.f20386h = new ArrayList<>();
        this.f20383e.setStyle(Paint.Style.FILL);
        this.f20383e.setColor(this.f20382d);
        this.f20383e.setAntiAlias(true);
        this.f20384f.setStyle(Paint.Style.FILL);
        this.f20384f.setColor(parseColor);
        this.f20384f.setAntiAlias(true);
        this.f20385g.setStyle(Paint.Style.FILL);
        this.f20385g.setColor(parseColor2);
        this.f20385g.setAntiAlias(true);
    }

    public void onDraw(Canvas canvas) {
        Iterator<Float> it = this.f20386h.iterator();
        int i = 0;
        while (it.hasNext()) {
            Float next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                next.floatValue();
                this.f20386h.size();
                if (canvas != null) {
                    Float f = this.f20386h.get(i);
                    C87412m.m108593f(f, "subProgress[index]");
                    float width = ((float) getWidth()) * f.floatValue();
                    float f2 = (float) 100;
                    canvas.drawRect(new RectF(i == 0 ? 0.0f : (this.f20386h.get(i - 1).floatValue() * ((float) getWidth())) / f2, 0.0f, width / f2, (float) getHeight()), this.f20383e);
                }
                if (!(i == this.f20386h.size() - 1 || canvas == null)) {
                    Float f3 = this.f20386h.get(i);
                    C87412m.m108593f(f3, "subProgress[index]");
                    float width2 = (((float) getWidth()) * f3.floatValue()) / ((float) 100);
                    canvas.drawRect(new RectF(width2 - (((float) getWidth()) * 0.0053f), 0.0f, width2, (float) getHeight()), this.f20384f);
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalSubProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        int parseColor = Color.parseColor("#ffffff");
        int parseColor2 = Color.parseColor("#FA5151");
        this.f20383e = new Paint();
        this.f20384f = new Paint();
        this.f20385g = new Paint();
        this.f20386h = new ArrayList<>();
        this.f20383e.setStyle(Paint.Style.FILL);
        this.f20383e.setColor(this.f20382d);
        this.f20383e.setAntiAlias(true);
        this.f20384f.setStyle(Paint.Style.FILL);
        this.f20384f.setColor(parseColor);
        this.f20384f.setAntiAlias(true);
        this.f20385g.setStyle(Paint.Style.FILL);
        this.f20385g.setColor(parseColor2);
        this.f20385g.setAntiAlias(true);
    }
}
