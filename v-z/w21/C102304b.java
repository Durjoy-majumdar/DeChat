package w21;

import android.text.Editable;
import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText;
import com.tencent.p014mm.plugin.component.editor.model.nativenote.spans.BoldSpan;
import java.util.Iterator;
import u21.C101955g;

/* renamed from: w21.b */
public class C102304b extends C102307e<Boolean, BoldSpan> {
    /* renamed from: a */
    public void mo141853a(WXRTEditText wXRTEditText, Object obj) {
        Boolean bool = (Boolean) obj;
        C101955g gVar = new C101955g(wXRTEditText);
        int i = gVar.mo141479a() ? 18 : 34;
        Editable text = wXRTEditText.getText();
        Iterator<Object> it = mo141859d(text, gVar, C102320q.SPAN_FLAGS).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            BoldSpan boldSpan = (BoldSpan) next;
            boldSpan.getClass();
            boolean equals = Boolean.TRUE.equals(bool);
            int spanStart = text.getSpanStart(next);
            int i2 = gVar.f300151d;
            if (spanStart < i2) {
                if (equals) {
                    gVar.f300151d = Math.max(0, i2 - (i2 - spanStart));
                    gVar.f300152e += 0;
                    i = 34;
                } else {
                    boldSpan.getClass();
                    text.setSpan(new BoldSpan(), spanStart, gVar.f300151d, 33);
                }
            }
            int spanEnd = text.getSpanEnd(next);
            int i3 = gVar.f300152e;
            if (spanEnd > i3) {
                if (equals) {
                    gVar.f300151d = Math.max(0, gVar.f300151d - 0);
                    gVar.f300152e += spanEnd - i3;
                } else {
                    boldSpan.getClass();
                    text.setSpan(new BoldSpan(), gVar.f300152e, spanEnd, 34);
                }
            }
            text.removeSpan(next);
        }
        if (bool != null && bool.booleanValue()) {
            text.setSpan(new BoldSpan(), gVar.f300151d, gVar.f300152e, i);
        }
    }

    /* renamed from: b */
    public int mo141854b() {
        return 0;
    }
}
