package zh1;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: zh1.i */
public final class C16209i implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ C16203f f43424d;

    /* renamed from: e */
    public final /* synthetic */ ViewGroup f43425e;

    public C16209i(C16203f fVar, ViewGroup viewGroup) {
        this.f43424d = fVar;
        this.f43425e = viewGroup;
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreDraw() {
        /*
            r10 = this;
            zh1.f r0 = r10.f43424d
            android.view.View r0 = r0.f43409d
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeOnPreDrawListener(r10)
            zh1.f r0 = r10.f43424d
            android.view.ViewGroup r1 = r10.f43425e
            r0.getClass()
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.graphics.Point r2 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r2)
            int r2 = r2.x
            int[] r3 = o40.C61926c.m72690o(r1)
            r4 = 1
            r5 = r3[r4]
            androidx.recyclerview.widget.RecyclerView r6 = r0.f43414i
            int r6 = r6.getHeight()
            android.widget.ImageView r7 = r0.f43410e
            int r7 = r7.getHeight()
            int r6 = r6 + r7
            int r5 = r5 - r6
            r6 = 0
            r3 = r3[r6]
            int r1 = r1.getWidth()
            int r1 = r1 / 2
            int r3 = r3 + r1
            android.content.Context r1 = r0.f43406a
            r7 = 16
            int r1 = kg3.C76577a.m92151b(r1, r7)
            androidx.recyclerview.widget.RecyclerView r7 = r0.f43414i
            int r7 = r7.getWidth()
            int r7 = r7 / 2
            int r7 = r3 - r7
            if (r7 >= r1) goto L_0x0051
            r2 = r1
            goto L_0x006f
        L_0x0051:
            androidx.recyclerview.widget.RecyclerView r7 = r0.f43414i
            int r7 = r7.getWidth()
            int r7 = r7 / 2
            int r7 = r7 + r3
            int r2 = r2 - r1
            if (r7 <= r2) goto L_0x0065
            androidx.recyclerview.widget.RecyclerView r7 = r0.f43414i
            int r7 = r7.getWidth()
            int r2 = r2 - r7
            goto L_0x006f
        L_0x0065:
            androidx.recyclerview.widget.RecyclerView r2 = r0.f43414i
            int r2 = r2.getWidth()
            int r2 = r2 / 2
            int r2 = r3 - r2
        L_0x006f:
            androidx.recyclerview.widget.RecyclerView r7 = r0.f43414i
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            boolean r8 = r7 instanceof android.view.ViewGroup.MarginLayoutParams
            r9 = 0
            if (r8 == 0) goto L_0x007d
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            goto L_0x007e
        L_0x007d:
            r7 = r9
        L_0x007e:
            if (r7 == 0) goto L_0x0089
            if (r2 >= r1) goto L_0x0083
            r2 = r1
        L_0x0083:
            r7.leftMargin = r2
            r7.topMargin = r5
            r7.rightMargin = r1
        L_0x0089:
            android.widget.ImageView r1 = r0.f43410e
            android.graphics.drawable.Drawable r1 = r1.getDrawable()
            boolean r2 = r1 instanceof android.graphics.drawable.LayerDrawable
            if (r2 == 0) goto L_0x0096
            android.graphics.drawable.LayerDrawable r1 = (android.graphics.drawable.LayerDrawable) r1
            goto L_0x0097
        L_0x0096:
            r1 = r9
        L_0x0097:
            if (r1 == 0) goto L_0x00b6
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r6)
            if (r1 == 0) goto L_0x00b6
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.content.Context r5 = r0.f43406a
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131100629(0x7f0603d5, float:1.7813645E38)
            int r5 = r5.getColor(r6)
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r5, r6)
            r1.setColorFilter(r2)
        L_0x00b6:
            android.widget.ImageView r1 = r0.f43410e
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x00c3
            r9 = r1
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
        L_0x00c3:
            if (r9 == 0) goto L_0x00d0
            android.widget.ImageView r1 = r0.f43410e
            int r1 = r1.getWidth()
            int r1 = r1 / 2
            int r3 = r3 - r1
            r9.leftMargin = r3
        L_0x00d0:
            android.view.View r1 = r0.f43409d
            r1.requestLayout()
            android.view.View r1 = r0.f43409d
            zh1.h r2 = new zh1.h
            r2.<init>(r0)
            r1.post(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: zh1.C16209i.onPreDraw():boolean");
    }
}
