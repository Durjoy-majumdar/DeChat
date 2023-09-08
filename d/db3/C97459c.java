package db3;

import android.text.Editable;
import bb3.C92219b;
import bb3.C92230i;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import db3.C97472p;
import java.util.ArrayList;

/* renamed from: db3.c */
public class C97459c extends C97471o<Boolean, C97460d> {

    /* renamed from: a */
    public C97472p f286067a = new C97472p();

    /* renamed from: b */
    public int mo136723b() {
        return 1;
    }

    /* renamed from: f */
    public void mo136724f(WXRTEditText wXRTEditText, C92230i iVar, Object obj) {
        Boolean bool = (Boolean) obj;
        Editable text = wXRTEditText.getText();
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        this.f286067a.f286087a.clear();
        ArrayList<C97470n> paragraphs = wXRTEditText.getParagraphs();
        int size = paragraphs.size();
        for (int i = 0; i < size; i++) {
            C97470n nVar = paragraphs.get(i);
            ArrayList<Object> d = mo136728d(text, nVar, C97476s.SPAN_FLAGS);
            this.f286067a.mo136739b(d, nVar);
            boolean z = true;
            boolean z2 = !d.isEmpty();
            if (nVar.mo136736c(iVar)) {
                z2 = bool.booleanValue();
            }
            if (i <= 0 || nVar.mo136735b() != 1 || paragraphs.get(i - 1).mo136735b() != 1 || bool.booleanValue()) {
                z = false;
            }
            if (z) {
                z2 = false;
            }
            if (z2) {
                this.f286067a.f286087a.add(new C97472p.C97473a(new C97460d(C92219b.m115909b(), nVar.mo126227a(), nVar.f286085f, nVar.f286086g), nVar, false));
                C97478u.f286111d.mo136737g(text, nVar, this.f286067a);
                C97478u.f286109b.mo136737g(text, nVar, this.f286067a);
            }
        }
        this.f286067a.mo136738a(text);
    }
}
