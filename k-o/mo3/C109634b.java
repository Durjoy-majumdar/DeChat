package mo3;

import android.text.Layout;
import android.text.NoCopySpan;
import android.text.Spannable;
import android.text.method.MetaKeyKeyListener;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: mo3.b */
public class C109634b {

    /* renamed from: mo3.b$a */
    public static class C109635a implements NoCopySpan {

        /* renamed from: d */
        public float f328226d;

        /* renamed from: e */
        public float f328227e;

        /* renamed from: f */
        public int f328228f;

        /* renamed from: g */
        public int f328229g;

        /* renamed from: h */
        public boolean f328230h;

        /* renamed from: i */
        public boolean f328231i;

        public C109635a(float f, float f2, int i, int i2) {
            this.f328226d = f;
            this.f328227e = f2;
            this.f328228f = i;
            this.f328229g = i2;
        }
    }

    /* renamed from: a */
    public static boolean m148943a(CustomTextView customTextView, Spannable spannable, MotionEvent motionEvent) {
        float f;
        float f2;
        float f3;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            C109635a[] aVarArr = (C109635a[]) spannable.getSpans(0, spannable.length(), C109635a.class);
            for (C109635a removeSpan : aVarArr) {
                spannable.removeSpan(removeSpan);
            }
            spannable.setSpan(new C109635a(motionEvent.getX(), motionEvent.getY(), customTextView.getScrollX(), customTextView.getScrollY()), 0, 0, 17);
            return true;
        } else if (actionMasked != 1) {
            if (actionMasked == 2) {
                C109635a[] aVarArr2 = (C109635a[]) spannable.getSpans(0, spannable.length(), C109635a.class);
                if (aVarArr2.length > 0) {
                    if (!aVarArr2[0].f328230h) {
                        float scaledTouchSlop = (float) ViewConfiguration.get(customTextView.getContext()).getScaledTouchSlop();
                        if (Math.abs(motionEvent.getX() - aVarArr2[0].f328226d) >= scaledTouchSlop || Math.abs(motionEvent.getY() - aVarArr2[0].f328227e) >= scaledTouchSlop) {
                            aVarArr2[0].f328230h = true;
                        }
                    }
                    C109635a aVar = aVarArr2[0];
                    if (aVar.f328230h) {
                        aVar.f328231i = true;
                        if (((motionEvent.getMetaState() & 1) == 0 && MetaKeyKeyListener.getMetaState(spannable, 1) != 1 && MetaKeyKeyListener.getMetaState(spannable, 2048) == 0) ? false : true) {
                            f = motionEvent.getX() - aVarArr2[0].f328226d;
                            f3 = motionEvent.getY();
                            f2 = aVarArr2[0].f328227e;
                        } else {
                            f = aVarArr2[0].f328226d - motionEvent.getX();
                            f3 = aVarArr2[0].f328227e;
                            f2 = motionEvent.getY();
                        }
                        aVarArr2[0].f328226d = motionEvent.getX();
                        aVarArr2[0].f328227e = motionEvent.getY();
                        int scrollX = customTextView.getScrollX() + ((int) f);
                        int scrollY = customTextView.getScrollY() + ((int) (f3 - f2));
                        int totalPaddingTop = customTextView.getTotalPaddingTop() + customTextView.getTotalPaddingBottom();
                        Layout layout = customTextView.getLayout();
                        int max = Math.max(Math.min(scrollY, layout.getHeight() - (customTextView.getHeight() - totalPaddingTop)), 0);
                        int scrollX2 = customTextView.getScrollX();
                        int scrollY2 = customTextView.getScrollY();
                        m148944b(customTextView, layout, scrollX, max);
                        if (!(scrollX2 == customTextView.getScrollX() && scrollY2 == customTextView.getScrollY())) {
                            customTextView.cancelLongPress();
                        }
                        return true;
                    }
                }
            }
            return false;
        } else {
            C109635a[] aVarArr3 = (C109635a[]) spannable.getSpans(0, spannable.length(), C109635a.class);
            for (C109635a removeSpan2 : aVarArr3) {
                spannable.removeSpan(removeSpan2);
            }
            return aVarArr3.length > 0 && aVarArr3[0].f328231i;
        }
    }

    /* renamed from: b */
    public static void m148944b(CustomTextView customTextView, Layout layout, int i, int i2) {
        int i3;
        int i4;
        int width = customTextView.getWidth() - (customTextView.getTotalPaddingLeft() + customTextView.getTotalPaddingRight());
        int lineForVertical = layout.getLineForVertical(i2);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(lineForVertical);
        int i5 = 0;
        boolean z = layout.getParagraphDirection(lineForVertical) > 0;
        if (customTextView.getHorizontallyScrolling()) {
            int lineForVertical2 = layout.getLineForVertical((customTextView.getHeight() + i2) - (customTextView.getTotalPaddingTop() + customTextView.getTotalPaddingBottom()));
            i5 = Integer.MAX_VALUE;
            i3 = 0;
            while (lineForVertical <= lineForVertical2) {
                i5 = (int) Math.min((float) i5, layout.getLineLeft(lineForVertical));
                i3 = (int) Math.max((float) i3, layout.getLineRight(lineForVertical));
                lineForVertical++;
            }
        } else {
            i3 = width;
        }
        int i6 = i3 - i5;
        if (i6 < width) {
            if (paragraphAlignment == Layout.Alignment.ALIGN_CENTER) {
                i4 = (width - i6) / 2;
            } else if ((z && paragraphAlignment == Layout.Alignment.ALIGN_OPPOSITE) || (!z && paragraphAlignment == Layout.Alignment.ALIGN_NORMAL)) {
                Log.m105924i("Touch", "scrollto may err");
                i4 = width - i6;
            }
            i5 -= i4;
        } else {
            i5 = Math.max(Math.min(i, i3 - width), i5);
        }
        customTextView.scrollTo(i5, i2);
    }
}
