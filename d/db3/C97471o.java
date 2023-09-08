package db3;

import android.text.Spannable;
import bb3.C92219b;
import bb3.C92230i;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import db3.C97463g;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: db3.o */
public abstract class C97471o<V, C extends C97463g<V>> extends C97477t<V, C> {
    /* renamed from: a */
    public final void mo136722a(WXRTEditText wXRTEditText, V v) {
        int i;
        C92230i paragraphsInSelection = wXRTEditText.getParagraphsInSelection();
        if (wXRTEditText.f283156L && wXRTEditText.getSelection().f263989d == (i = paragraphsInSelection.f263989d) && i > 1) {
            ArrayList<Object> d = mo136728d(wXRTEditText.getText(), paragraphsInSelection, C97476s.SPAN_FLAGS);
            if (!d.isEmpty() && wXRTEditText.getLayout().getPrimaryHorizontal(wXRTEditText.getSelection().f263989d) == ((float) C92219b.m115909b())) {
                Iterator<Object> it = d.iterator();
                while (it.hasNext()) {
                    wXRTEditText.getText().removeSpan(it.next());
                }
                wXRTEditText.getText().insert(paragraphsInSelection.f263989d - 1, "\n");
            }
        }
        mo136724f(wXRTEditText, paragraphsInSelection, v);
        C97478u.m125554b(wXRTEditText, this);
    }

    /* renamed from: c */
    public final C92230i mo136727c(WXRTEditText wXRTEditText) {
        return wXRTEditText.getParagraphsInSelection();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        if (r12 == r13) goto L_0x0066;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008b A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<java.lang.Object> mo136728d(android.text.Spannable r17, bb3.C92230i r18, db3.C97476s r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.Class r4 = r16.getClass()
            java.lang.reflect.Type r4 = r4.getGenericSuperclass()
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            if (r4 != 0) goto L_0x001d
            r1 = 0
            return r1
        L_0x001d:
            int r5 = r4.length
            r6 = 1
            int r5 = r5 - r6
            r4 = r4[r5]
            java.lang.Class r4 = (java.lang.Class) r4
            int r5 = r2.f263989d
            int r7 = r2.f263990e
            java.lang.Object[] r4 = r1.getSpans(r5, r7, r4)
            int r5 = r4.length
            r7 = 0
            r8 = 0
        L_0x002f:
            if (r8 >= r5) goto L_0x008e
            r9 = r4[r8]
            int r10 = r1.getSpanStart(r9)
            int r11 = r1.getSpanEnd(r9)
            int r12 = r2.f263989d
            int r13 = r2.f263990e
            int r14 = java.lang.Math.max(r10, r12)
            int r15 = java.lang.Math.min(r11, r13)
            if (r14 <= r15) goto L_0x004c
            r15 = r19
            goto L_0x0068
        L_0x004c:
            if (r14 >= r15) goto L_0x0051
        L_0x004e:
            r15 = r19
            goto L_0x0066
        L_0x0051:
            if (r10 <= r12) goto L_0x0055
            if (r11 < r13) goto L_0x004e
        L_0x0055:
            if (r12 <= r10) goto L_0x005a
            if (r13 >= r11) goto L_0x005a
            goto L_0x004e
        L_0x005a:
            db3.s r14 = db3.C97476s.EXACT
            r15 = r19
            if (r15 != r14) goto L_0x006a
            if (r10 != r12) goto L_0x0068
            if (r11 != r13) goto L_0x0068
            if (r12 != r13) goto L_0x0068
        L_0x0066:
            r10 = 1
            goto L_0x0086
        L_0x0068:
            r10 = 0
            goto L_0x0086
        L_0x006a:
            int r10 = r1.getSpanFlags(r9)
            r10 = r10 & 51
            r13 = 2
            if (r11 != r12) goto L_0x007d
            int[] r11 = new int[r13]
            r11 = {34, 18} // fill-array
            boolean r10 = r0.mo136742e(r10, r11)
            goto L_0x0086
        L_0x007d:
            int[] r11 = new int[r13]
            r11 = {17, 18} // fill-array
            boolean r10 = r0.mo136742e(r10, r11)
        L_0x0086:
            if (r10 == 0) goto L_0x008b
            r3.add(r9)
        L_0x008b:
            int r8 = r8 + 1
            goto L_0x002f
        L_0x008e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: db3.C97471o.mo136728d(android.text.Spannable, bb3.i, db3.s):java.util.ArrayList");
    }

    /* renamed from: f */
    public abstract void mo136724f(WXRTEditText wXRTEditText, C92230i iVar, V v);

    /* renamed from: g */
    public void mo136737g(Spannable spannable, C97470n nVar, C97472p pVar) {
        pVar.mo136739b(mo136728d(spannable, nVar, C97476s.EXACT), nVar);
    }
}
