package db3;

import android.text.Editable;
import bb3.C92219b;
import bb3.C92230i;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import db3.C97472p;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: db3.j */
public class C97466j extends C97471o<Boolean, C97467k> {

    /* renamed from: a */
    public C97472p f286071a = new C97472p();

    /* renamed from: b */
    public int mo136723b() {
        return 3;
    }

    /* renamed from: f */
    public void mo136724f(WXRTEditText wXRTEditText, C92230i iVar, Object obj) {
        Boolean bool = (Boolean) obj;
        Editable text = wXRTEditText.getText();
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        this.f286071a.f286087a.clear();
        ArrayList<C97470n> paragraphs = wXRTEditText.getParagraphs();
        int size = paragraphs.size();
        int i = 0;
        int i2 = 0;
        C97467k kVar = null;
        while (i2 < size) {
            C97470n nVar = paragraphs.get(i2);
            ArrayList<Object> d = mo136728d(text, nVar, C97476s.SPAN_FLAGS);
            this.f286071a.mo136739b(d, nVar);
            C97467k kVar2 = (d.isEmpty() || !(d.get(i) instanceof C97467k)) ? null : (C97467k) d.get(i);
            boolean z = true;
            boolean z2 = kVar2 != null && kVar2.f286077i;
            boolean z3 = (kVar == null || kVar != kVar2 || !z2) ? z2 : false;
            boolean z4 = !d.isEmpty();
            boolean booleanValue = nVar.mo136736c(iVar) ? bool.booleanValue() : z4;
            if (i2 <= 0 || nVar.mo136735b() != 1 || paragraphs.get(i2 - 1).mo136735b() != 1 || bool.booleanValue()) {
                z = false;
            }
            boolean z5 = z ? false : booleanValue;
            if (z5) {
                this.f286071a.f286087a.add(new C97472p.C97473a(new C97467k(z3, C92219b.m115909b(), nVar.mo126227a(), nVar.f286085f, nVar.f286086g), nVar, false));
                C97478u.f286111d.mo136737g(text, nVar, this.f286071a);
                C97478u.f286110c.mo136737g(text, nVar, this.f286071a);
            }
            if (!z5 && z4) {
                Iterator<Object> it = d.iterator();
                while (it.hasNext()) {
                    text.removeSpan(it.next());
                }
            }
            i2++;
            kVar = kVar2;
            i = 0;
        }
        this.f286071a.mo136738a(text);
    }
}
