package jq3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;

/* renamed from: jq3.p */
public final class C76437p extends RecyclerView.C0129l {

    /* renamed from: d */
    public final C33630h f223764d;

    /* renamed from: e */
    public final int[] f223765e;

    /* renamed from: f */
    public final Paint f223766f;

    /* renamed from: g */
    public final int f223767g;

    /* renamed from: h */
    public final int f223768h;

    /* renamed from: i */
    public final int f223769i;

    /* renamed from: jq3.p$a */
    public static final class C46569a {

        /* renamed from: a */
        public final Context f125463a;

        /* renamed from: b */
        public final Resources f125464b;

        /* renamed from: c */
        public C33630h f125465c = C33630h.NORMAL;

        /* renamed from: d */
        public int f125466d;

        /* renamed from: e */
        public int f125467e;

        /* renamed from: f */
        public int f125468f;

        /* renamed from: g */
        public int[] f125469g;

        /* renamed from: h */
        public int f125470h;

        public C46569a(Context context) {
            C87412m.m108594g(context, "mContext");
            this.f125463a = context;
            Resources resources = context.getResources();
            C87412m.m108593f(resources, "mContext.resources");
            this.f125464b = resources;
            int[] iArr = new int[1];
            this.f125469g = iArr;
            this.f125467e = 0;
            this.f125468f = 0;
            this.f125466d = 0;
            iArr[0] = -1;
            this.f125470h = -1;
        }
    }

    public C76437p(C33630h hVar, int[] iArr, Paint paint, int i, int i2, int i3) {
        C87412m.m108594g(hVar, "dividerType");
        C87412m.m108594g(iArr, "dividerColors");
        C87412m.m108594g(paint, "backgroundPaint");
        this.f223764d = hVar;
        this.f223765e = iArr;
        this.f223766f = paint;
        this.f223767g = i;
        this.f223768h = i2;
        this.f223769i = i3;
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        super.mo21g(rect, view, recyclerView, wVar);
        rect.bottom = this.f223767g;
    }

    /* renamed from: h */
    public void mo122h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        Canvas canvas2 = canvas;
        RecyclerView recyclerView2 = recyclerView;
        C87412m.m108594g(canvas2, "c");
        C87412m.m108594g(recyclerView2, "parent");
        C87412m.m108594g(wVar, "state");
        int childCount = recyclerView.getChildCount();
        int paddingLeft = recyclerView.getPaddingLeft();
        int i = paddingLeft + this.f223769i;
        int width = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - this.f223768h;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView2.getChildAt(i2);
            float bottom = (float) childAt.getBottom();
            float bottom2 = ((float) childAt.getBottom()) + ((float) this.f223767g);
            if (i2 == childCount - 1) {
                canvas.drawRect((float) paddingLeft, bottom, (float) width, bottom2, this.f223766f);
            } else {
                int ordinal = this.f223764d.ordinal();
                if (ordinal == 0) {
                    Paint paint = new Paint();
                    paint.setColor(this.f223765e[0]);
                    canvas.drawRect((float) i, bottom, (float) width, bottom2, paint);
                } else if (ordinal == 1) {
                    Paint paint2 = new Paint();
                    float f = (float) i;
                    float f2 = (float) width;
                    float f3 = f;
                    float f4 = f2;
                    paint2.setShader(new LinearGradient(f3, 0.0f, f4, 0.0f, this.f223765e, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
                    paint2.setAlpha(255);
                    canvas2.drawRect(new RectF(f, bottom, f2, bottom2), paint2);
                }
            }
        }
    }
}
