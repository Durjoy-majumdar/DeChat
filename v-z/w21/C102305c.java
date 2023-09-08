package w21;

import android.text.Editable;
import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText;
import java.util.ArrayList;
import u21.C101955g;
import u21.C101956h;
import w21.C102316n;

/* renamed from: w21.c */
public class C102305c extends C102315m<Boolean, C102306d> {

    /* renamed from: a */
    public C102316n f301320a = new C102316n();

    /* renamed from: b */
    public int mo141854b() {
        return 1;
    }

    /* renamed from: f */
    public void mo141855f(WXRTEditText wXRTEditText, C101955g gVar, Object obj) {
        Boolean bool = (Boolean) obj;
        Editable text = wXRTEditText.getText();
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        this.f301320a.f301333a.clear();
        ArrayList<C102314l> paragraphs = wXRTEditText.getParagraphs();
        int size = paragraphs.size();
        for (int i = 0; i < size; i++) {
            C102314l lVar = paragraphs.get(i);
            ArrayList<Object> d = mo141859d(text, lVar, C102320q.SPAN_FLAGS);
            this.f301320a.mo141867b(d, lVar);
            boolean z = true;
            boolean z2 = !d.isEmpty();
            if (lVar.mo141864c(gVar)) {
                z2 = bool.booleanValue();
            }
            if (i <= 0 || lVar.mo141863b() != 1 || paragraphs.get(i - 1).mo141863b() != 1 || bool.booleanValue()) {
                z = false;
            }
            if (z) {
                z2 = false;
            }
            if (z2) {
                this.f301320a.f301333a.add(new C102316n.C102317a(new C102306d(C101956h.m134205b(), lVar.mo141479a(), lVar.f301331f, lVar.f301332g), lVar, false));
                C102324u.f301365d.mo141865g(text, lVar, this.f301320a);
                C102324u.f301363b.mo141865g(text, lVar, this.f301320a);
            }
        }
        this.f301320a.mo141866a(text);
    }
}
