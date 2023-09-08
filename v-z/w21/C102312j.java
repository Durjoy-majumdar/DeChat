package w21;

import android.text.Editable;
import android.util.SparseIntArray;
import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText;
import java.util.ArrayList;
import java.util.Iterator;
import u21.C101955g;
import u21.C101956h;
import w21.C102316n;

/* renamed from: w21.j */
public class C102312j extends C102315m<Boolean, C102313k> {

    /* renamed from: a */
    public C102316n f301325a = new C102316n();

    /* renamed from: b */
    public int mo141854b() {
        return 2;
    }

    /* renamed from: f */
    public void mo141855f(WXRTEditText wXRTEditText, C101955g gVar, Object obj) {
        int i;
        Boolean bool = (Boolean) obj;
        Editable text = wXRTEditText.getText();
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        this.f301325a.f301333a.clear();
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        ArrayList<C102314l> paragraphs = wXRTEditText.getParagraphs();
        int size = paragraphs.size();
        boolean z = true;
        int i2 = 0;
        int i3 = 1;
        while (i2 < size) {
            C102314l lVar = paragraphs.get(i2);
            ArrayList<Object> d = C102324u.f301366e.mo141859d(text, lVar, C102320q.EXACT);
            if (!d.isEmpty()) {
                Iterator<Object> it = d.iterator();
                i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof C102310h) {
                        i += ((Integer) ((C102310h) next).getValue()).intValue();
                    }
                }
            } else {
                i = 0;
            }
            sparseIntArray.put(i3, i);
            ArrayList<Object> d2 = mo141859d(text, lVar, C102320q.SPAN_FLAGS);
            this.f301325a.mo141867b(d2, lVar);
            boolean isEmpty = d2.isEmpty() ^ z;
            if (lVar.mo141864c(gVar)) {
                isEmpty = bool.booleanValue();
            }
            if (i2 > 0 && lVar.mo141863b() == z && paragraphs.get(i2 + -1).mo141863b() == z && !bool.booleanValue()) {
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
                this.f301325a.f301333a.add(new C102316n.C102317a(new C102313k(i4, C101956h.m134205b(), lVar.mo141479a(), lVar.f301331f, lVar.f301332g), lVar, false));
                C102324u.f301364c.mo141865g(text, lVar, this.f301325a);
                C102324u.f301363b.mo141865g(text, lVar, this.f301325a);
            }
            i3++;
            i2++;
            z = true;
        }
        this.f301325a.mo141866a(text);
    }
}
