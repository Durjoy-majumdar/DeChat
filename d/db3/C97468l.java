package db3;

import android.text.Editable;
import android.util.SparseIntArray;
import bb3.C92219b;
import bb3.C92230i;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import db3.C97472p;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: db3.l */
public class C97468l extends C97471o<Boolean, C97469m> {

    /* renamed from: a */
    public C97472p f286079a = new C97472p();

    /* renamed from: b */
    public int mo136723b() {
        return 2;
    }

    /* renamed from: f */
    public void mo136724f(WXRTEditText wXRTEditText, C92230i iVar, Object obj) {
        int i;
        Boolean bool = (Boolean) obj;
        Editable text = wXRTEditText.getText();
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        this.f286079a.f286087a.clear();
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        ArrayList<C97470n> paragraphs = wXRTEditText.getParagraphs();
        int size = paragraphs.size();
        boolean z = true;
        int i2 = 0;
        int i3 = 1;
        while (i2 < size) {
            C97470n nVar = paragraphs.get(i2);
            ArrayList<Object> d = C97478u.f286112e.mo136728d(text, nVar, C97476s.EXACT);
            if (!d.isEmpty()) {
                Iterator<Object> it = d.iterator();
                i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof C97463g) {
                        i += ((Integer) ((C97463g) next).getValue()).intValue();
                    }
                }
            } else {
                i = 0;
            }
            sparseIntArray.put(i3, i);
            ArrayList<Object> d2 = mo136728d(text, nVar, C97476s.SPAN_FLAGS);
            this.f286079a.mo136739b(d2, nVar);
            boolean isEmpty = d2.isEmpty() ^ z;
            if (nVar.mo136736c(iVar)) {
                isEmpty = bool.booleanValue();
            }
            if (i2 > 0 && nVar.mo136735b() == z && paragraphs.get(i2 + -1).mo136735b() == z && !bool.booleanValue()) {
                isEmpty = false;
            }
            if (isEmpty) {
                int i4 = 1;
                for (int i5 = 1; i5 < i3; i5++) {
                    int i6 = sparseIntArray.get(i5);
                    int i7 = sparseIntArray2.get(i5);
                    if (i6 >= i) {
                        if (i6 == i) {
                            if (i7 != 0) {
                                i4 = i7 + 1;
                            }
                        }
                    }
                    i4 = 1;
                }
                sparseIntArray2.put(i3, i4);
                this.f286079a.f286087a.add(new C97472p.C97473a(new C97469m(i4, C92219b.m115909b(), nVar.mo126227a(), nVar.f286085f, nVar.f286086g), nVar, false));
                C97478u.f286110c.mo136737g(text, nVar, this.f286079a);
                C97478u.f286109b.mo136737g(text, nVar, this.f286079a);
            }
            i3++;
            i2++;
            z = true;
        }
        this.f286079a.mo136738a(text);
    }
}
