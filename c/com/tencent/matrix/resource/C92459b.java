package com.tencent.matrix.resource;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: com.tencent.matrix.resource.b */
public final class C92459b {

    /* renamed from: a */
    public static Pair<ViewGroup, ArrayList<View>> f264617a;

    /* renamed from: b */
    public static boolean f264618b;

    /* renamed from: a */
    public static void m116306a(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            m116307b(viewGroup.getChildAt(i));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:56|(1:58)|59|60|(1:62)|63|64|65|66|67|68|69|70) */
    /* JADX WARNING: Can't wrap try/catch for region: R(30:5|6|7|8|9|10|11|12|13|14|15|16|17|(2:18|19)|21|(1:23)|24|(3:26|(1:28)|29)|30|(5:32|(3:34|(2:36|86)(1:87)|37)|85|38|(4:40|41|42|(1:44)))|46|(4:48|(1:50)|51|(1:53))|54|(13:56|(1:58)|59|60|(1:62)|63|64|65|66|67|68|69|70)|72|(1:76)|77|(1:81)|82|(2:84|88)(1:89)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(31:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|21|(1:23)|24|(3:26|(1:28)|29)|30|(5:32|(3:34|(2:36|86)(1:87)|37)|85|38|(4:40|41|42|(1:44)))|46|(4:48|(1:50)|51|(1:53))|54|(13:56|(1:58)|59|60|(1:62)|63|64|65|66|67|68|69|70)|72|(1:76)|77|(1:81)|82|(2:84|88)(1:89)) */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00e5, code lost:
        r0 = (android.widget.FrameLayout) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00f8, code lost:
        r0 = (android.widget.LinearLayout) r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0019 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x001c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0022 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0025 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x00d3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x00d6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x00d9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x00dc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0016 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m116307b(android.view.View r6) {
        /*
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            android.content.Context r0 = r6.getContext()
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            boolean r0 = r6.isClickable()
            boolean r1 = r6.isLongClickable()
            r2 = 0
            r6.setOnClickListener(r2)     // Catch:{ all -> 0x0016 }
        L_0x0016:
            r6.setOnCreateContextMenuListener(r2)     // Catch:{ all -> 0x0019 }
        L_0x0019:
            r6.setOnFocusChangeListener(r2)     // Catch:{ all -> 0x001c }
        L_0x001c:
            r6.setOnKeyListener(r2)     // Catch:{ all -> 0x001f }
        L_0x001f:
            r6.setOnLongClickListener(r2)     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r6.setOnClickListener(r2)     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r6.setOnTouchListener(r2)     // Catch:{ all -> 0x0029 }
            goto L_0x002a
        L_0x0029:
        L_0x002a:
            android.graphics.drawable.Drawable r3 = r6.getBackground()
            if (r3 == 0) goto L_0x0038
            com.tencent.matrix.resource.a r3 = new com.tencent.matrix.resource.a
            r3.<init>()
            r6.addOnAttachStateChangeListener(r3)
        L_0x0038:
            r6.setClickable(r0)
            r6.setLongClickable(r1)
            boolean r0 = r6 instanceof android.widget.ImageView
            if (r0 == 0) goto L_0x0051
            r0 = r6
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            if (r1 == 0) goto L_0x004e
            r1.setCallback(r2)
        L_0x004e:
            r0.setImageDrawable(r2)
        L_0x0051:
            boolean r0 = r6 instanceof android.widget.TextView
            if (r0 == 0) goto L_0x009b
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.graphics.drawable.Drawable[] r1 = r0.getCompoundDrawables()
            int r3 = r1.length
            r4 = 0
        L_0x005e:
            if (r4 >= r3) goto L_0x006a
            r5 = r1[r4]
            if (r5 == 0) goto L_0x0067
            r5.setCallback(r2)
        L_0x0067:
            int r4 = r4 + 1
            goto L_0x005e
        L_0x006a:
            r0.setCompoundDrawables(r2, r2, r2, r2)
            r0.setOnEditorActionListener(r2)
            r0.setKeyListener(r2)
            r0.setMovementMethod(r2)
            boolean r1 = r0 instanceof android.widget.EditText
            if (r1 == 0) goto L_0x009b
            java.lang.String r1 = ""
            r0.setHint(r1)     // Catch:{ all -> 0x009a }
            java.lang.Class<android.widget.TextView> r1 = android.widget.TextView.class
            java.lang.String r3 = "mListeners"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch:{ all -> 0x009a }
            r3 = 1
            r1.setAccessible(r3)     // Catch:{ all -> 0x009a }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x009a }
            boolean r1 = r0 instanceof java.util.ArrayList     // Catch:{ all -> 0x009a }
            if (r1 == 0) goto L_0x009b
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x009a }
            r0.clear()     // Catch:{ all -> 0x009a }
            goto L_0x009b
        L_0x009a:
        L_0x009b:
            boolean r0 = r6 instanceof android.widget.ProgressBar
            if (r0 == 0) goto L_0x00ba
            r0 = r6
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            android.graphics.drawable.Drawable r1 = r0.getProgressDrawable()
            if (r1 == 0) goto L_0x00ae
            r0.setProgressDrawable(r2)
            r1.setCallback(r2)
        L_0x00ae:
            android.graphics.drawable.Drawable r1 = r0.getIndeterminateDrawable()
            if (r1 == 0) goto L_0x00ba
            r0.setIndeterminateDrawable(r2)
            r1.setCallback(r2)
        L_0x00ba:
            boolean r0 = r6 instanceof android.widget.ListView
            if (r0 == 0) goto L_0x00e1
            r0 = r6
            android.widget.ListView r0 = (android.widget.ListView) r0
            android.graphics.drawable.Drawable r1 = r0.getSelector()
            if (r1 == 0) goto L_0x00ca
            r1.setCallback(r2)
        L_0x00ca:
            android.widget.ListAdapter r1 = r0.getAdapter()     // Catch:{ all -> 0x00d3 }
            if (r1 == 0) goto L_0x00d3
            r0.setAdapter(r2)     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            r0.setOnScrollListener(r2)     // Catch:{ all -> 0x00d6 }
        L_0x00d6:
            r0.setOnItemClickListener(r2)     // Catch:{ all -> 0x00d9 }
        L_0x00d9:
            r0.setOnItemLongClickListener(r2)     // Catch:{ all -> 0x00dc }
        L_0x00dc:
            r0.setOnItemSelectedListener(r2)     // Catch:{ all -> 0x00e0 }
            goto L_0x00e1
        L_0x00e0:
        L_0x00e1:
            boolean r0 = r6 instanceof android.widget.FrameLayout
            if (r0 == 0) goto L_0x00f4
            r0 = r6
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            android.graphics.drawable.Drawable r1 = r0.getForeground()
            if (r1 == 0) goto L_0x00f4
            r1.setCallback(r2)
            r0.setForeground(r2)
        L_0x00f4:
            boolean r0 = r6 instanceof android.widget.LinearLayout
            if (r0 == 0) goto L_0x0107
            r0 = r6
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            android.graphics.drawable.Drawable r1 = r0.getDividerDrawable()
            if (r1 == 0) goto L_0x0107
            r1.setCallback(r2)
            r0.setDividerDrawable(r2)
        L_0x0107:
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0110
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            m116306a(r6)
        L_0x0110:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.resource.C92459b.m116307b(android.view.View):void");
    }
}
