package w21;

import android.text.Editable;
import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText;
import java.util.ArrayList;
import java.util.Iterator;
import u21.C101955g;
import u21.C101956h;
import w21.C102316n;

/* renamed from: w21.r */
public class C102321r extends C102315m<Boolean, C102322s> {

    /* renamed from: a */
    public C102316n f301354a = new C102316n();

    /* renamed from: b */
    public int mo141854b() {
        return 3;
    }

    /* renamed from: f */
    public void mo141855f(WXRTEditText wXRTEditText, C101955g gVar, Object obj) {
        Boolean bool = (Boolean) obj;
        Editable text = wXRTEditText.getText();
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        this.f301354a.f301333a.clear();
        ArrayList<C102314l> paragraphs = wXRTEditText.getParagraphs();
        int size = paragraphs.size();
        int i = 0;
        int i2 = 0;
        C102322s sVar = null;
        while (i2 < size) {
            C102314l lVar = paragraphs.get(i2);
            ArrayList<Object> d = mo141859d(text, lVar, C102320q.SPAN_FLAGS);
            this.f301354a.mo141867b(d, lVar);
            C102322s sVar2 = (d.isEmpty() || !(d.get(i) instanceof C102322s)) ? null : (C102322s) d.get(i);
            boolean z = true;
            boolean z2 = sVar2 != null && sVar2.f301360i;
            boolean z3 = (sVar == null || sVar != sVar2 || !z2) ? z2 : false;
            boolean z4 = !d.isEmpty();
            boolean booleanValue = lVar.mo141864c(gVar) ? bool.booleanValue() : z4;
            if (i2 <= 0 || lVar.mo141863b() != 1 || paragraphs.get(i2 - 1).mo141863b() != 1 || bool.booleanValue()) {
                z = false;
            }
            boolean z5 = z ? false : booleanValue;
            if (z5) {
                this.f301354a.f301333a.add(new C102316n.C102317a(new C102322s(z3, C101956h.m134205b(), lVar.mo141479a(), lVar.f301331f, lVar.f301332g), lVar, false));
                C102324u.f301365d.mo141865g(text, lVar, this.f301354a);
                C102324u.f301364c.mo141865g(text, lVar, this.f301354a);
            }
            if (!z5 && z4) {
                Iterator<Object> it = d.iterator();
                while (it.hasNext()) {
                    text.removeSpan(it.next());
                }
            }
            i2++;
            sVar = sVar2;
            i = 0;
        }
        this.f301354a.mo141866a(text);
    }
}
