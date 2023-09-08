package com.tencent.p014mm.p136ui.contact;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.tencent.p014mm.p136ui.base.MMTagPanelScrollView;

/* renamed from: com.tencent.mm.ui.contact.LabelContainerView */
public class LabelContainerView extends MMTagPanelScrollView {

    /* renamed from: g */
    public boolean f218595g = true;

    /* renamed from: h */
    public boolean f218596h = false;

    /* renamed from: i */
    public float f218597i;

    /* renamed from: j */
    public float f218598j;

    /* renamed from: n */
    public int f218599n;

    /* renamed from: o */
    public float f218600o;

    /* renamed from: p */
    public float f218601p;

    /* renamed from: q */
    public C74390a f218602q;

    /* renamed from: com.tencent.mm.ui.contact.LabelContainerView$a */
    public interface C74390a {
        /* renamed from: a */
        void mo103375a();

        /* renamed from: b */
        void mo103376b();
    }

    public LabelContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f218599n = scaledTouchSlop * scaledTouchSlop;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = (action & 255) == 6;
        int actionIndex = z ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < pointerCount; i++) {
            if (actionIndex != i) {
                f += motionEvent.getX(i);
                f2 += motionEvent.getY(i);
            }
        }
        if (z) {
            pointerCount--;
        }
        float f3 = (float) pointerCount;
        float f4 = f / f3;
        float f5 = f2 / f3;
        if (action == 0) {
            this.f218600o = f4;
            this.f218601p = f5;
        } else if (action == 2) {
            int i2 = (int) (f4 - this.f218600o);
            int i3 = (int) (f5 - this.f218601p);
            if ((i2 * i2) + (i3 * i3) > this.f218599n) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (r0 != 3) goto L_0x0084;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            int r0 = r11.getAction()
            r1 = r0 & 255(0xff, float:3.57E-43)
            r2 = 0
            r3 = 1
            r4 = 6
            if (r1 != r4) goto L_0x000d
            r1 = 1
            goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            if (r1 == 0) goto L_0x0015
            int r4 = r11.getActionIndex()
            goto L_0x0016
        L_0x0015:
            r4 = -1
        L_0x0016:
            int r5 = r11.getPointerCount()
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x001d:
            if (r8 >= r5) goto L_0x002f
            if (r4 != r8) goto L_0x0022
            goto L_0x002c
        L_0x0022:
            float r9 = r11.getX(r8)
            float r6 = r6 + r9
            float r9 = r11.getY(r8)
            float r7 = r7 + r9
        L_0x002c:
            int r8 = r8 + 1
            goto L_0x001d
        L_0x002f:
            if (r1 == 0) goto L_0x0033
            int r5 = r5 + -1
        L_0x0033:
            float r1 = (float) r5
            float r6 = r6 / r1
            float r7 = r7 / r1
            if (r0 == 0) goto L_0x007c
            if (r0 == r3) goto L_0x0068
            r1 = 2
            if (r0 == r1) goto L_0x0041
            r1 = 3
            if (r0 == r1) goto L_0x0068
            goto L_0x0084
        L_0x0041:
            boolean r0 = r10.f218596h
            if (r0 != 0) goto L_0x004d
            r10.f218595g = r3
            r10.f218597i = r6
            r10.f218598j = r7
            r10.f218596h = r3
        L_0x004d:
            com.tencent.mm.ui.contact.LabelContainerView$a r0 = r10.f218602q
            if (r0 == 0) goto L_0x0054
            r0.mo103376b()
        L_0x0054:
            float r0 = r10.f218597i
            float r6 = r6 - r0
            int r0 = (int) r6
            float r1 = r10.f218598j
            float r7 = r7 - r1
            int r1 = (int) r7
            int r0 = r0 * r0
            int r1 = r1 * r1
            int r0 = r0 + r1
            int r1 = r10.f218599n
            if (r0 <= r1) goto L_0x0084
            r10.f218595g = r2
            goto L_0x0084
        L_0x0068:
            boolean r0 = r10.f218595g
            if (r0 != 0) goto L_0x0070
            boolean r0 = r10.f218596h
            if (r0 != 0) goto L_0x0077
        L_0x0070:
            com.tencent.mm.ui.contact.LabelContainerView$a r0 = r10.f218602q
            if (r0 == 0) goto L_0x0077
            r0.mo103375a()
        L_0x0077:
            r10.f218595g = r3
            r10.f218596h = r2
            goto L_0x0084
        L_0x007c:
            r10.f218595g = r3
            r10.f218597i = r6
            r10.f218598j = r7
            r10.f218596h = r3
        L_0x0084:
            boolean r11 = super.onTouchEvent(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.contact.LabelContainerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setOnLabelContainerListener(C74390a aVar) {
        this.f218602q = aVar;
    }

    public LabelContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f218599n = scaledTouchSlop * scaledTouchSlop;
    }
}
