package xo3;

import android.content.Context;
import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.tencent.neattextview.textview.view.NeatTextView;
import yr3.C79150a;

/* renamed from: xo3.g */
public class C78967g {
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m95468a(android.view.View r8, int r9, int r10, int r11) {
        /*
            boolean r0 = r8 instanceof com.tencent.neattextview.textview.view.NeatTextView
            r1 = 0
            if (r0 == 0) goto L_0x0013
            r2 = r8
            com.tencent.neattextview.textview.view.NeatTextView r2 = (com.tencent.neattextview.textview.view.NeatTextView) r2
            yr3.a r2 = r2.getLayout()
            if (r2 == 0) goto L_0x0025
            int r2 = r2.mo109132p0(r10)
            goto L_0x0026
        L_0x0013:
            boolean r2 = r8 instanceof android.widget.TextView
            if (r2 == 0) goto L_0x0025
            r2 = r8
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.text.Layout r2 = r2.getLayout()
            if (r2 == 0) goto L_0x0025
            int r2 = r2.getLineForVertical(r10)
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r3 = 1
            if (r11 <= 0) goto L_0x0038
            int r4 = m95470c(r8, r11)
            int r5 = r11 + -1
            int r5 = m95470c(r8, r5)
            int r5 = r5 + r3
            if (r4 != r5) goto L_0x0038
            r4 = 1
            goto L_0x0039
        L_0x0038:
            r4 = 0
        L_0x0039:
            if (r4 == 0) goto L_0x004f
            int r4 = r11 + -1
            float r5 = m95475h(r8, r4)
            int r5 = (int) r5
            float r6 = m95471d(r8, r2)
            int r6 = (int) r6
            int r5 = r6 - r5
            int r5 = r5 / 2
            int r6 = r6 - r5
            if (r9 <= r6) goto L_0x004f
            r11 = r4
        L_0x004f:
            int r11 = m95470c(r8, r11)
            int r4 = m95472e(r8, r11)
            if (r0 == 0) goto L_0x0067
            r5 = r8
            com.tencent.neattextview.textview.view.NeatTextView r5 = (com.tencent.neattextview.textview.view.NeatTextView) r5
            yr3.a r5 = r5.getLayout()
            if (r5 == 0) goto L_0x0079
            int r5 = r5.mo109124d(r11)
            goto L_0x007a
        L_0x0067:
            boolean r5 = r8 instanceof android.widget.TextView
            if (r5 == 0) goto L_0x0079
            r5 = r8
            android.widget.TextView r5 = (android.widget.TextView) r5
            android.text.Layout r5 = r5.getLayout()
            if (r5 == 0) goto L_0x0079
            int r5 = r5.getLineBottom(r11)
            goto L_0x007a
        L_0x0079:
            r5 = 0
        L_0x007a:
            int r6 = r5 - r4
            int r6 = r6 / 2
            int r7 = r11 + 1
            if (r2 != r7) goto L_0x0086
            int r5 = r10 - r5
            if (r5 < r6) goto L_0x008d
        L_0x0086:
            int r5 = r11 + -1
            if (r2 != r5) goto L_0x008e
            int r4 = r4 - r10
            if (r4 >= r6) goto L_0x008e
        L_0x008d:
            r2 = r11
        L_0x008e:
            float r10 = (float) r9
            if (r0 == 0) goto L_0x009f
            r11 = r8
            com.tencent.neattextview.textview.view.NeatTextView r11 = (com.tencent.neattextview.textview.view.NeatTextView) r11
            yr3.a r11 = r11.getLayout()
            if (r11 == 0) goto L_0x00b1
            int r10 = r11.mo109131o0(r2, r10)
            goto L_0x00b2
        L_0x009f:
            boolean r11 = r8 instanceof android.widget.TextView
            if (r11 == 0) goto L_0x00b1
            r11 = r8
            android.widget.TextView r11 = (android.widget.TextView) r11
            android.text.Layout r11 = r11.getLayout()
            if (r11 == 0) goto L_0x00b1
            int r10 = r11.getOffsetForHorizontal(r2, r10)
            goto L_0x00b2
        L_0x00b1:
            r10 = 0
        L_0x00b2:
            java.lang.CharSequence r11 = m95477j(r8)
            int r11 = r11.length()
            int r11 = r11 + -1
            if (r10 >= r11) goto L_0x00e4
            int r11 = r10 + 1
            if (r11 <= 0) goto L_0x00d0
            int r0 = m95470c(r8, r11)
            int r4 = r11 + -1
            int r4 = m95470c(r8, r4)
            int r4 = r4 + r3
            if (r0 != r4) goto L_0x00d0
            r1 = 1
        L_0x00d0:
            if (r1 == 0) goto L_0x00e4
            float r0 = m95475h(r8, r10)
            int r0 = (int) r0
            float r8 = m95471d(r8, r2)
            int r8 = (int) r8
            int r0 = r8 - r0
            int r0 = r0 / 2
            int r8 = r8 - r0
            if (r9 <= r8) goto L_0x00e4
            r10 = r11
        L_0x00e4:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: xo3.C78967g.m95468a(android.view.View, int, int, int):int");
    }

    /* renamed from: b */
    public static int m95469b(View view, int i) {
        Layout layout;
        if (view instanceof NeatTextView) {
            C79150a layout2 = ((NeatTextView) view).getLayout();
            if (layout2 != null) {
                return layout2.mo109127k0(i);
            }
            return 0;
        } else if (!(view instanceof TextView) || (layout = ((TextView) view).getLayout()) == null) {
            return 0;
        } else {
            return layout.getLineBaseline(i);
        }
    }

    /* renamed from: c */
    public static int m95470c(View view, int i) {
        Layout layout;
        if (view instanceof NeatTextView) {
            C79150a layout2 = ((NeatTextView) view).getLayout();
            if (layout2 != null) {
                return layout2.mo109123c(i);
            }
            return 0;
        } else if (!(view instanceof TextView) || (layout = ((TextView) view).getLayout()) == null) {
            return 0;
        } else {
            return layout.getLineForOffset(i);
        }
    }

    /* renamed from: d */
    public static float m95471d(View view, int i) {
        Layout layout;
        if (view instanceof NeatTextView) {
            C79150a layout2 = ((NeatTextView) view).getLayout();
            if (layout2 != null) {
                return layout2.mo109125e(i);
            }
            return 0.0f;
        } else if (!(view instanceof TextView) || (layout = ((TextView) view).getLayout()) == null) {
            return 0.0f;
        } else {
            return layout.getLineRight(i);
        }
    }

    /* renamed from: e */
    public static int m95472e(View view, int i) {
        Layout layout;
        if (view instanceof NeatTextView) {
            C79150a layout2 = ((NeatTextView) view).getLayout();
            if (layout2 != null) {
                return layout2.mo109121a(i);
            }
            return 0;
        } else if (!(view instanceof TextView) || (layout = ((TextView) view).getLayout()) == null) {
            return 0;
        } else {
            return layout.getLineTop(i);
        }
    }

    /* renamed from: f */
    public static float m95473f(View view, int i) {
        Layout layout;
        if (view instanceof NeatTextView) {
            C79150a layout2 = ((NeatTextView) view).getLayout();
            if (layout2 != null) {
                return layout2.mo109134r0(i);
            }
            return 0.0f;
        } else if (!(view instanceof TextView) || (layout = ((TextView) view).getLayout()) == null) {
            return 0.0f;
        } else {
            return layout.getLineWidth(i);
        }
    }

    /* renamed from: g */
    public static TextPaint m95474g(View view) {
        if (view instanceof NeatTextView) {
            return ((NeatTextView) view).getPaint();
        }
        if (view instanceof TextView) {
            return ((TextView) view).getPaint();
        }
        return null;
    }

    /* renamed from: h */
    public static float m95475h(View view, int i) {
        Layout layout;
        if (view instanceof NeatTextView) {
            C79150a layout2 = ((NeatTextView) view).getLayout();
            if (layout2 != null) {
                return layout2.mo109120S(i);
            }
            return 0.0f;
        } else if (!(view instanceof TextView) || (layout = ((TextView) view).getLayout()) == null) {
            return 0.0f;
        } else {
            return layout.getPrimaryHorizontal(i);
        }
    }

    /* renamed from: i */
    public static int m95476i(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    /* renamed from: j */
    public static CharSequence m95477j(View view) {
        return view instanceof NeatTextView ? ((NeatTextView) view).mo154968a() : view instanceof TextView ? ((TextView) view).getText() : "";
    }
}
