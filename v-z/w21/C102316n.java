package w21;

import android.text.Spannable;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: w21.n */
public class C102316n {

    /* renamed from: a */
    public final ArrayList<C102317a> f301333a = new ArrayList<>();

    /* renamed from: w21.n$a */
    public static class C102317a {

        /* renamed from: a */
        public final C102309g f301334a;

        /* renamed from: b */
        public final C102314l f301335b;

        /* renamed from: c */
        public final boolean f301336c;

        public C102317a(Object obj, C102314l lVar, boolean z) {
            this.f301334a = (C102309g) obj;
            this.f301335b = lVar;
            this.f301336c = z;
        }
    }

    /* renamed from: a */
    public void mo141866a(Spannable spannable) {
        Iterator<C102317a> it = this.f301333a.iterator();
        while (it.hasNext()) {
            C102317a next = it.next();
            C102309g gVar = next.f301334a;
            C102314l lVar = next.f301335b;
            int i = lVar.f300151d;
            int i2 = 34;
            if (next.f301336c) {
                int spanStart = spannable.getSpanStart(gVar);
                if (spanStart > -1 && spanStart < i) {
                    spannable.setSpan(gVar.mo127577a(), spanStart, i, 34);
                }
                spannable.removeSpan(gVar);
            } else {
                int i3 = lVar.f300152e;
                if (!lVar.f301332g || !lVar.mo141479a()) {
                    boolean z = lVar.f301332g;
                    if (z && lVar.f301331f) {
                        i2 = 18;
                    } else if (!z) {
                        i2 = 33;
                    }
                }
                if (i3 > spannable.length()) {
                    i3 = spannable.length();
                }
                spannable.setSpan(gVar, i, i3, i2);
            }
        }
    }

    /* renamed from: b */
    public void mo141867b(ArrayList<Object> arrayList, C102314l lVar) {
        Iterator<Object> it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof C102309g) {
                this.f301333a.add(new C102317a(next, lVar, true));
            }
        }
    }
}
