package db3;

import android.text.Spannable;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: db3.p */
public class C97472p {

    /* renamed from: a */
    public final ArrayList<C97473a> f286087a = new ArrayList<>();

    /* renamed from: db3.p$a */
    public static class C97473a {

        /* renamed from: a */
        public final C97462f f286088a;

        /* renamed from: b */
        public final C97470n f286089b;

        /* renamed from: c */
        public final boolean f286090c;

        public C97473a(Object obj, C97470n nVar, boolean z) {
            this.f286088a = (C97462f) obj;
            this.f286089b = nVar;
            this.f286090c = z;
        }
    }

    /* renamed from: a */
    public void mo136738a(Spannable spannable) {
        Iterator<C97473a> it = this.f286087a.iterator();
        while (it.hasNext()) {
            C97473a next = it.next();
            C97462f fVar = next.f286088a;
            C97470n nVar = next.f286089b;
            int i = nVar.f263989d;
            int i2 = 34;
            if (next.f286090c) {
                int spanStart = spannable.getSpanStart(fVar);
                if (spanStart > -1 && spanStart < i) {
                    spannable.setSpan(fVar.mo134917a(), spanStart, i, 34);
                }
                spannable.removeSpan(fVar);
            } else {
                int i3 = nVar.f263990e;
                if (!nVar.f286086g || !nVar.mo126227a()) {
                    boolean z = nVar.f286086g;
                    if (z && nVar.f286085f) {
                        i2 = 18;
                    } else if (!z) {
                        i2 = 33;
                    }
                }
                if (i3 > spannable.length()) {
                    i3 = spannable.length();
                }
                spannable.setSpan(fVar, i, i3, i2);
            }
        }
    }

    /* renamed from: b */
    public void mo136739b(ArrayList<Object> arrayList, C97470n nVar) {
        Iterator<Object> it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof C97462f) {
                this.f286087a.add(new C97473a(next, nVar, true));
            }
        }
    }
}
