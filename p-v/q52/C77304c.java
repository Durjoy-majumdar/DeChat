package q52;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import gy3.C87412m;

/* renamed from: q52.c */
public final class C77304c extends AppCompatButton {

    /* renamed from: f */
    public boolean f225427f;

    /* renamed from: g */
    public float f225428g;

    /* renamed from: h */
    public float f225429h;

    /* renamed from: i */
    public final int[] f225430i = new int[2];

    /* renamed from: j */
    public RectF f225431j = new RectF();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77304c(Context context) {
        super(context, (AttributeSet) null);
        C87412m.m108594g(context, "context");
        setText("vConsole");
        setGravity(17);
        setBackground(new C77303b());
        setTextColor(-1);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (((float) 13) * f);
        setPadding(i, (int) (((float) 4) * f), i, (int) (((float) 6) * f));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getBackground() == null) {
            setBackground(new C77303b());
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancelPendingInputEvents();
        this.f225427f = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r8.f225431j.contains(r9.getRawX(), r9.getRawY()) == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            gy3.C87412m.m108591d(r9)
            int r0 = r9.getAction()
            r1 = 1
            if (r0 == 0) goto L_0x006e
            if (r0 == r1) goto L_0x0049
            r2 = 2
            if (r0 == r2) goto L_0x0011
            goto L_0x0096
        L_0x0011:
            boolean r0 = r8.f225427f
            if (r0 != 0) goto L_0x0025
            float r0 = r9.getRawX()
            float r2 = r9.getRawY()
            android.graphics.RectF r3 = r8.f225431j
            boolean r0 = r3.contains(r0, r2)
            if (r0 != 0) goto L_0x0096
        L_0x0025:
            float r0 = r8.getX()
            float r2 = r9.getRawX()
            float r3 = r8.f225428g
            float r2 = r2 - r3
            float r0 = r0 + r2
            r8.setX(r0)
            float r0 = r8.getY()
            float r2 = r9.getRawY()
            float r3 = r8.f225429h
            float r2 = r2 - r3
            float r0 = r0 + r2
            r8.setY(r0)
            r8.requestLayout()
            r8.f225427f = r1
            goto L_0x0096
        L_0x0049:
            boolean r0 = r8.f225427f
            if (r0 != 0) goto L_0x0061
            float r0 = r9.getRawX()
            float r2 = r9.getRawY()
            android.graphics.RectF r3 = r8.f225431j
            boolean r0 = r3.contains(r0, r2)
            if (r0 == 0) goto L_0x0061
            r8.performClick()
            goto L_0x0096
        L_0x0061:
            r9.getRawX()
            r9.getRawY()
            r9.getX()
            r9.getY()
            goto L_0x0096
        L_0x006e:
            int[] r0 = r8.f225430i
            r8.getLocationOnScreen(r0)
            android.graphics.RectF r0 = new android.graphics.RectF
            int[] r2 = r8.f225430i
            r3 = 0
            r4 = r2[r3]
            float r4 = (float) r4
            r2 = r2[r1]
            float r2 = (float) r2
            int r5 = r8.getWidth()
            float r5 = (float) r5
            float r5 = r5 + r4
            int[] r6 = r8.f225430i
            r6 = r6[r1]
            float r6 = (float) r6
            int r7 = r8.getHeight()
            float r7 = (float) r7
            float r6 = r6 + r7
            r0.<init>(r4, r2, r5, r6)
            r8.f225431j = r0
            r8.f225427f = r3
        L_0x0096:
            float r0 = r9.getRawX()
            r8.f225428g = r0
            float r9 = r9.getRawY()
            r8.f225429h = r9
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q52.C77304c.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
