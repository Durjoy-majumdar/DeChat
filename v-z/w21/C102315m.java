package w21;

import android.text.Spannable;
import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText;
import java.util.ArrayList;
import java.util.Iterator;
import u21.C101955g;
import u21.C101956h;
import w21.C102310h;

/* renamed from: w21.m */
public abstract class C102315m<V, C extends C102310h<V>> extends C102323t<V, C> {
    /* renamed from: a */
    public final void mo141853a(WXRTEditText wXRTEditText, V v) {
        int i;
        C101955g paragraphsInSelection = wXRTEditText.getParagraphsInSelection();
        if (wXRTEditText.f268138L && wXRTEditText.getSelection().f300151d == (i = paragraphsInSelection.f300151d) && i > 1) {
            ArrayList<Object> d = mo141859d(wXRTEditText.getText(), paragraphsInSelection, C102320q.SPAN_FLAGS);
            if (!d.isEmpty() && wXRTEditText.getLayout().getPrimaryHorizontal(wXRTEditText.getSelection().f300151d) == ((float) C101956h.m134205b())) {
                Iterator<Object> it = d.iterator();
                while (it.hasNext()) {
                    wXRTEditText.getText().removeSpan(it.next());
                }
                wXRTEditText.getText().insert(paragraphsInSelection.f300151d - 1, "\n");
            }
        }
        mo141855f(wXRTEditText, paragraphsInSelection, v);
        C102324u.m134968b(wXRTEditText, this);
    }

    /* renamed from: c */
    public final C101955g mo141858c(WXRTEditText wXRTEditText) {
        return wXRTEditText.getParagraphsInSelection();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        if (r12 == r13) goto L_0x0066;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008b A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<java.lang.Object> mo141859d(android.text.Spannable r17, u21.C101955g r18, w21.C102320q r19) {
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
            int r5 = r2.f300151d
            int r7 = r2.f300152e
            java.lang.Object[] r4 = r1.getSpans(r5, r7, r4)
            int r5 = r4.length
            r7 = 0
            r8 = 0
        L_0x002f:
            if (r8 >= r5) goto L_0x008e
            r9 = r4[r8]
            int r10 = r1.getSpanStart(r9)
            int r11 = r1.getSpanEnd(r9)
            int r12 = r2.f300151d
            int r13 = r2.f300152e
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
            w21.q r14 = w21.C102320q.EXACT
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
            boolean r10 = r0.mo141873e(r10, r11)
            goto L_0x0086
        L_0x007d:
            int[] r11 = new int[r13]
            r11 = {17, 18} // fill-array
            boolean r10 = r0.mo141873e(r10, r11)
        L_0x0086:
            if (r10 == 0) goto L_0x008b
            r3.add(r9)
        L_0x008b:
            int r8 = r8 + 1
            goto L_0x002f
        L_0x008e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w21.C102315m.mo141859d(android.text.Spannable, u21.g, w21.q):java.util.ArrayList");
    }

    /* renamed from: f */
    public abstract void mo141855f(WXRTEditText wXRTEditText, C101955g gVar, V v);

    /* renamed from: g */
    public void mo141865g(Spannable spannable, C102314l lVar, C102316n nVar) {
        nVar.mo141867b(mo141859d(spannable, lVar, C102320q.EXACT), lVar);
    }
}
