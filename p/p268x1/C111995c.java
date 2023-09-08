package p268x1;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.PriorityQueue;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C13604l;
import rx3.C36568h;

/* renamed from: x1.c */
public final class C111995c {

    /* renamed from: a */
    public final C13601g f335259a;

    /* renamed from: b */
    public final C13601g f335260b;

    /* renamed from: c */
    public final C13601g f335261c;

    /* renamed from: x1.c$a */
    public static final class C111996a extends C87413o implements C32224a<BoringLayout.Metrics> {

        /* renamed from: d */
        public final /* synthetic */ int f335262d;

        /* renamed from: e */
        public final /* synthetic */ CharSequence f335263e;

        /* renamed from: f */
        public final /* synthetic */ TextPaint f335264f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111996a(int i, CharSequence charSequence, TextPaint textPaint) {
            super(0);
            this.f335262d = i;
            this.f335263e = charSequence;
            this.f335264f = textPaint;
        }

        public Object invoke() {
            TextDirectionHeuristic a = C112011r.m152733a(this.f335262d);
            CharSequence charSequence = this.f335263e;
            TextPaint textPaint = this.f335264f;
            C87412m.m108594g(charSequence, MimeTypes.BASE_TYPE_TEXT);
            if (!a.isRtl(charSequence, 0, charSequence.length())) {
                return BoringLayout.isBoring(charSequence, textPaint, (BoringLayout.Metrics) null);
            }
            return null;
        }
    }

    /* renamed from: x1.c$b */
    public static final class C111997b extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public final /* synthetic */ C111995c f335265d;

        /* renamed from: e */
        public final /* synthetic */ CharSequence f335266e;

        /* renamed from: f */
        public final /* synthetic */ TextPaint f335267f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111997b(C111995c cVar, CharSequence charSequence, TextPaint textPaint) {
            super(0);
            this.f335265d = cVar;
            this.f335266e = charSequence;
            this.f335267f = textPaint;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
            if (p268x1.C112001g.m152722a(r2, p925z1.C112553c.class) == false) goto L_0x0050;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r7 = this;
                x1.c r0 = r7.f335265d
                rx3.g r0 = r0.f335259a
                java.lang.Object r0 = r0.getValue()
                android.text.BoringLayout$Metrics r0 = (android.text.BoringLayout.Metrics) r0
                r1 = 0
                if (r0 == 0) goto L_0x0011
                int r0 = r0.width
                float r0 = (float) r0
                goto L_0x001d
            L_0x0011:
                java.lang.CharSequence r0 = r7.f335266e
                int r2 = r0.length()
                android.text.TextPaint r3 = r7.f335267f
                float r0 = android.text.Layout.getDesiredWidth(r0, r1, r2, r3)
            L_0x001d:
                java.lang.CharSequence r2 = r7.f335266e
                android.text.TextPaint r3 = r7.f335267f
                r4 = 0
                r5 = 1
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 != 0) goto L_0x0029
                r6 = 1
                goto L_0x002a
            L_0x0029:
                r6 = 0
            L_0x002a:
                if (r6 != 0) goto L_0x0050
                boolean r6 = r2 instanceof android.text.Spanned
                if (r6 == 0) goto L_0x0050
                float r3 = r3.getLetterSpacing()
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 != 0) goto L_0x003a
                r3 = 1
                goto L_0x003b
            L_0x003a:
                r3 = 0
            L_0x003b:
                if (r3 == 0) goto L_0x004f
                android.text.Spanned r2 = (android.text.Spanned) r2
                java.lang.Class<z1.d> r3 = p925z1.C112554d.class
                boolean r3 = p268x1.C112001g.m152722a(r2, r3)
                if (r3 != 0) goto L_0x004f
                java.lang.Class<z1.c> r3 = p925z1.C112553c.class
                boolean r2 = p268x1.C112001g.m152722a(r2, r3)
                if (r2 == 0) goto L_0x0050
            L_0x004f:
                r1 = 1
            L_0x0050:
                if (r1 == 0) goto L_0x0055
                r1 = 1056964608(0x3f000000, float:0.5)
                float r0 = r0 + r1
            L_0x0055:
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p268x1.C111995c.C111997b.invoke():java.lang.Object");
        }
    }

    /* renamed from: x1.c$c */
    public static final class C111998c extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public final /* synthetic */ CharSequence f335268d;

        /* renamed from: e */
        public final /* synthetic */ TextPaint f335269e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111998c(CharSequence charSequence, TextPaint textPaint) {
            super(0);
            this.f335268d = charSequence;
            this.f335269e = textPaint;
        }

        public Object invoke() {
            CharSequence charSequence = this.f335268d;
            TextPaint textPaint = this.f335269e;
            C87412m.m108594g(charSequence, MimeTypes.BASE_TYPE_TEXT);
            C87412m.m108594g(textPaint, "paint");
            BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
            lineInstance.setText(new C111993a(charSequence, 0, charSequence.length()));
            PriorityQueue priorityQueue = new PriorityQueue(10, new d$$a());
            int next = lineInstance.next();
            int i = 0;
            while (next != -1) {
                if (priorityQueue.size() < 10) {
                    priorityQueue.add(new C13604l(Integer.valueOf(i), Integer.valueOf(next)));
                } else {
                    C13604l lVar = (C13604l) priorityQueue.peek();
                    if (lVar != null && ((Number) lVar.f38556e).intValue() - ((Number) lVar.f38555d).intValue() < next - i) {
                        priorityQueue.poll();
                        priorityQueue.add(new C13604l(Integer.valueOf(i), Integer.valueOf(next)));
                    }
                }
                int i2 = next;
                next = lineInstance.next();
                i = i2;
            }
            float f = 0.0f;
            Iterator it = priorityQueue.iterator();
            while (it.hasNext()) {
                C13604l lVar2 = (C13604l) it.next();
                f = Math.max(f, Layout.getDesiredWidth(charSequence, ((Number) lVar2.f38555d).intValue(), ((Number) lVar2.f38556e).intValue(), textPaint));
            }
            return Float.valueOf(f);
        }
    }

    public C111995c(CharSequence charSequence, TextPaint textPaint, int i) {
        C87412m.m108594g(charSequence, "charSequence");
        C87412m.m108594g(textPaint, "textPaint");
        C13602i iVar = C13602i.NONE;
        this.f335259a = C36568h.m40986b(iVar, new C111996a(i, charSequence, textPaint));
        this.f335260b = C36568h.m40986b(iVar, new C111998c(charSequence, textPaint));
        this.f335261c = C36568h.m40986b(iVar, new C111997b(this, charSequence, textPaint));
    }
}
