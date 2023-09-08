package com.tencent.p014mm.plugin.game.chatroom.view.flow;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import lx1.C99717a;
import lx1.C99718b;
import yw1.C102969o;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.flow.FlowView */
public class FlowView extends ViewGroup {

    /* renamed from: d */
    public int f271668d;

    /* renamed from: e */
    public int f271669e;

    /* renamed from: f */
    public float f271670f;

    /* renamed from: g */
    public int f271671g;

    /* renamed from: h */
    public float f271672h;

    /* renamed from: i */
    public float f271673i;

    /* renamed from: j */
    public ArrayList<float[]> f271674j;

    /* renamed from: n */
    public int f271675n;

    /* renamed from: o */
    public C99717a f271676o;

    /* renamed from: p */
    public C94086a f271677p;

    /* renamed from: q */
    public int f271678q = -1;

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.flow.FlowView$b */
    public interface C4437b {
        /* renamed from: a */
        void mo5360a(int i, View view);
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.flow.FlowView$c */
    public interface C4438c {
        /* renamed from: a */
        boolean mo5361a(int i, View view);
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.flow.FlowView$a */
    public class C94086a extends DataSetObserver {
        public C94086a(C4439a aVar) {
        }

        public void onChanged() {
            super.onChanged();
            FlowView flowView = FlowView.this;
            C99717a aVar = flowView.f271676o;
            if (aVar != null) {
                int a = aVar.mo139068a();
                if (a != 0) {
                    int i = 0;
                    if (flowView.f271675n == 0) {
                        while (i < flowView.f271676o.mo139068a()) {
                            flowView.addView(flowView.mo129105a(i));
                            i++;
                        }
                        return;
                    }
                    for (int i2 = 0; i2 < a; i2++) {
                        if (flowView.f271675n > i2) {
                            View childAt = flowView.getChildAt(i2);
                            C99718b bVar = (C99718b) childAt.getTag();
                            if (bVar == null || flowView.f271676o.mo139069b(i2) != bVar.f292258b) {
                                flowView.removeViewAt(i2);
                                flowView.addView(flowView.mo129105a(i2), i2);
                            } else {
                                flowView.f271676o.mo139070c(i2, childAt, flowView);
                            }
                        } else {
                            flowView.addView(flowView.mo129105a(i2));
                        }
                    }
                    int i3 = flowView.f271675n - a;
                    while (i < i3) {
                        flowView.removeViewAt(a + i);
                        i++;
                    }
                } else if (flowView.f271675n != 0) {
                    flowView.removeAllViews();
                }
            }
        }

        public void onInvalidated() {
            super.onInvalidated();
        }
    }

    public FlowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo129106b(context, attributeSet);
    }

    /* renamed from: a */
    public final View mo129105a(int i) {
        View c = this.f271676o.mo139070c(i, (View) null, this);
        c.setOnClickListener(new C4439a(this, i));
        c.setOnLongClickListener(new C4440b(this, i));
        return c;
    }

    /* renamed from: b */
    public final void mo129106b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        this.f271670f = -1.0f;
        this.f271671g = -1;
        this.f271678q = 0;
        this.f271672h = 10.0f;
        this.f271673i = 10.0f;
        this.f271668d = 1;
        this.f271669e = 5;
        this.f271674j = new ArrayList<>();
        if (attributeSet != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C102969o.f303860a)) != null) {
            this.f271668d = obtainStyledAttributes.getInt(4, this.f271668d);
            this.f271669e = obtainStyledAttributes.getInt(5, this.f271669e);
            this.f271670f = obtainStyledAttributes.getDimension(0, this.f271670f);
            this.f271672h = obtainStyledAttributes.getDimension(1, this.f271672h);
            this.f271673i = obtainStyledAttributes.getDimension(3, this.f271673i);
            this.f271671g = obtainStyledAttributes.getInt(2, this.f271671g);
            obtainStyledAttributes.recycle();
        }
    }

    public int getCurrentLinesNum() {
        return this.f271678q;
    }

    public float getFlowHeight() {
        return this.f271670f;
    }

    public int getFlowMaxRow() {
        return this.f271671g;
    }

    public int getHorizontalAlign() {
        return this.f271668d;
    }

    public float getHorizontalSpace() {
        return this.f271672h;
    }

    public int getVerticalAlign() {
        return this.f271669e;
    }

    public float getVerticalSpace() {
        return this.f271673i;
    }

    public void onDetachedFromWindow() {
        C99717a aVar = this.f271676o;
        if (aVar != null) {
            C94086a aVar2 = this.f271677p;
            if (aVar2 != null) {
                aVar.f292256a.unregisterObserver(aVar2);
            }
            this.f271676o = null;
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        /*
            r16 = this;
            r0 = r16
            lx1.a r1 = r0.f271676o
            if (r1 == 0) goto L_0x00d5
            int r1 = r16.getChildCount()
            if (r1 != 0) goto L_0x000e
            goto L_0x00d5
        L_0x000e:
            int r1 = r16.getPaddingTop()
            float r1 = (float) r1
            r2 = 0
            r3 = 0
        L_0x0015:
            java.util.ArrayList<float[]> r4 = r0.f271674j
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x00d5
            int r4 = r0.f271671g
            r5 = -1
            if (r4 == r5) goto L_0x0029
            if (r4 < 0) goto L_0x0029
            int r5 = r3 + 1
            if (r4 >= r5) goto L_0x0029
            return
        L_0x0029:
            int r4 = r0.f271678q
            r5 = 1
            int r4 = r4 + r5
            r0.f271678q = r4
            java.util.ArrayList<float[]> r4 = r0.f271674j
            java.lang.Object r4 = r4.get(r3)
            float[] r4 = (float[]) r4
            r6 = r4[r2]
            int r6 = (int) r6
            r7 = r4[r5]
            int r7 = (int) r7
            r8 = 2
            r4 = r4[r8]
            int r9 = r0.f271668d
            r10 = 1073741824(0x40000000, float:2.0)
            if (r9 != r5) goto L_0x004c
            int r8 = r16.getPaddingLeft()
        L_0x004a:
            float r8 = (float) r8
            goto L_0x007c
        L_0x004c:
            r9 = 0
            r11 = 0
        L_0x004e:
            if (r9 >= r6) goto L_0x0060
            int r12 = r9 + r7
            int r12 = r12 + r5
            int r12 = r12 - r6
            android.view.View r12 = r0.getChildAt(r12)
            int r12 = r12.getMeasuredWidth()
            int r11 = r11 + r12
            int r9 = r9 + 1
            goto L_0x004e
        L_0x0060:
            float r9 = (float) r11
            int r11 = r6 + -1
            float r11 = (float) r11
            float r12 = r0.f271672h
            float r11 = r11 * r12
            float r9 = r9 + r11
            int r9 = (int) r9
            int r11 = r0.f271668d
            if (r11 != r8) goto L_0x0074
            int r8 = r20 - r18
            int r8 = r8 - r9
            float r8 = (float) r8
            float r8 = r8 / r10
            goto L_0x007c
        L_0x0074:
            int r8 = r16.getPaddingRight()
            int r8 = r20 - r8
            int r8 = r8 - r9
            goto L_0x004a
        L_0x007c:
            r9 = 0
        L_0x007d:
            if (r9 >= r6) goto L_0x00cc
            int r11 = r9 + r7
            int r11 = r11 + r5
            int r11 = r11 - r6
            android.view.View r11 = r0.getChildAt(r11)
            int r12 = r11.getMeasuredWidth()
            int r13 = r11.getMeasuredHeight()
            float r14 = r0.f271670f
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 != 0) goto L_0x00b8
            float r13 = (float) r13
            int r14 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r14 >= 0) goto L_0x00ad
            int r14 = r0.f271669e
            r15 = 5
            if (r14 != r15) goto L_0x00a6
            float r14 = r4 - r13
            float r14 = r14 / r10
            float r14 = r14 + r1
            goto L_0x00ae
        L_0x00a6:
            r15 = 6
            if (r14 != r15) goto L_0x00ad
            float r14 = r1 + r4
            float r14 = r14 - r13
            goto L_0x00ae
        L_0x00ad:
            r14 = r1
        L_0x00ae:
            int r15 = (int) r8
            int r2 = (int) r14
            int r5 = r15 + r12
            float r14 = r14 + r13
            int r13 = (int) r14
            r11.layout(r15, r2, r5, r13)
            goto L_0x00c2
        L_0x00b8:
            int r2 = (int) r8
            int r5 = (int) r1
            int r13 = r2 + r12
            float r14 = r1 + r4
            int r14 = (int) r14
            r11.layout(r2, r5, r13, r14)
        L_0x00c2:
            float r2 = (float) r12
            float r5 = r0.f271672h
            float r2 = r2 + r5
            float r8 = r8 + r2
            int r9 = r9 + 1
            r2 = 0
            r5 = 1
            goto L_0x007d
        L_0x00cc:
            float r2 = r0.f271673i
            float r4 = r4 + r2
            float r1 = r1 + r4
            int r3 = r3 + 1
            r2 = 0
            goto L_0x0015
        L_0x00d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.chatroom.view.flow.FlowView.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (this.f271676o == null || getChildCount() == 0) {
            if (mode != 1073741824) {
                size2 = getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(size, size2);
            return;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        this.f271674j.clear();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        float f9 = 0.0f;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), 0);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i7 = i3 + measuredWidth;
            if (i7 <= paddingLeft) {
                i4++;
                if (i5 < measuredHeight) {
                    i5 = measuredHeight;
                }
                float f15 = (float) i7;
                float f16 = this.f271672h;
                if (f15 <= ((float) paddingLeft) - f16) {
                    int i8 = (int) (f15 + f16);
                    if (i6 == childCount - 1) {
                        float f17 = this.f271670f;
                        if (f17 == -1.0f) {
                            float f18 = (float) i5;
                            this.f271674j.add(new float[]{(float) i4, (float) i6, f18});
                            f7 = f9 + f18;
                            f8 = this.f271673i;
                        } else {
                            this.f271674j.add(new float[]{(float) i4, (float) i6, f17});
                            f7 = f9 + this.f271670f;
                            f8 = this.f271673i;
                        }
                        f9 = f7 + f8;
                    }
                    i3 = i8;
                } else {
                    float f19 = this.f271670f;
                    if (f19 == -1.0f) {
                        float f25 = (float) i5;
                        this.f271674j.add(new float[]{(float) i4, (float) i6, f25});
                        f5 = f9 + f25;
                        f6 = this.f271673i;
                    } else {
                        this.f271674j.add(new float[]{(float) i4, (float) i6, f19});
                        f5 = f9 + this.f271670f;
                        f6 = this.f271673i;
                    }
                    f9 = f5 + f6;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                }
            } else {
                float f26 = this.f271670f;
                if (f26 == -1.0f) {
                    float f27 = (float) i5;
                    this.f271674j.add(new float[]{(float) i4, (float) (i6 - 1), f27});
                    f = f9 + f27;
                    f2 = this.f271673i;
                } else {
                    this.f271674j.add(new float[]{(float) i4, (float) (i6 - 1), f26});
                    f = f9 + this.f271670f;
                    f2 = this.f271673i;
                }
                f9 = f + f2;
                int i9 = (int) (((float) measuredWidth) + this.f271672h);
                if (i6 == childCount - 1) {
                    float f28 = this.f271670f;
                    if (f28 == -1.0f) {
                        i4 = 1;
                        float f29 = (float) measuredHeight;
                        this.f271674j.add(new float[]{(float) 1, (float) i6, f29});
                        f3 = f9 + f29;
                        f4 = this.f271673i;
                    } else {
                        i4 = 1;
                        this.f271674j.add(new float[]{(float) 1, (float) i6, f28});
                        f3 = f9 + this.f271670f;
                        f4 = this.f271673i;
                    }
                    f9 = f3 + f4;
                } else {
                    i4 = 1;
                }
                i3 = i9;
                i5 = measuredHeight;
            }
        }
        int i15 = this.f271671g;
        if (i15 != -1 && i15 >= 0 && this.f271674j.size() > this.f271671g) {
            float f35 = 0.0f;
            for (int i16 = 0; i16 < this.f271671g; i16++) {
                f35 += this.f271674j.get(i16)[2] + this.f271673i;
            }
            f9 = f35;
        }
        int paddingTop = (int) ((f9 - this.f271673i) + ((float) getPaddingTop()) + ((float) getPaddingBottom()));
        if (mode != 1073741824) {
            size2 = paddingTop;
        }
        setMeasuredDimension(size, size2);
    }

    public void setAdapter(C99717a aVar) {
        C94086a aVar2;
        C99717a aVar3 = this.f271676o;
        if (!(aVar3 == null || (aVar2 = this.f271677p) == null)) {
            aVar3.f292256a.unregisterObserver(aVar2);
        }
        removeAllViews();
        this.f271676o = aVar;
        if (aVar != null) {
            C94086a aVar4 = new C94086a((C4439a) null);
            this.f271677p = aVar4;
            this.f271676o.f292256a.registerObserver(aVar4);
            int a = this.f271676o.mo139068a();
            this.f271675n = a;
            if (a > 0) {
                for (int i = 0; i < this.f271676o.mo139068a(); i++) {
                    addView(mo129105a(i));
                }
            }
        }
    }

    public void setFlowHeight(float f) {
        this.f271670f = f;
    }

    public void setHorizontalAlign(int i) {
        this.f271668d = i;
    }

    public void setHorizontalSpace(float f) {
        this.f271672h = f;
    }

    public void setMaxRow(int i) {
        this.f271671g = i;
    }

    public void setOnItemClickListener(C4437b bVar) {
    }

    public void setOnItemLongClickListener(C4438c cVar) {
    }

    public void setVerticalAlign(int i) {
        this.f271669e = i;
    }

    public void setVerticalSpace(float f) {
        this.f271673i = f;
    }

    public FlowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo129106b(context, attributeSet);
    }
}
