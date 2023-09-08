package db3;

import android.text.Editable;
import bb3.C92230i;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.p014mm.plugin.wenote.model.nativenote.spans.BoldSpan;
import java.util.Iterator;

/* renamed from: db3.b */
public class C97458b extends C97461e<Boolean, BoldSpan> {
    /* renamed from: a */
    public void mo136722a(WXRTEditText wXRTEditText, Object obj) {
        Boolean bool = (Boolean) obj;
        C92230i iVar = new C92230i(wXRTEditText);
        int i = iVar.mo126227a() ? 18 : 34;
        Editable text = wXRTEditText.getText();
        Iterator<Object> it = mo136728d(text, iVar, C97476s.SPAN_FLAGS).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            BoldSpan boldSpan = (BoldSpan) next;
            boldSpan.getClass();
            boolean equals = Boolean.TRUE.equals(bool);
            int spanStart = text.getSpanStart(next);
            int i2 = iVar.f263989d;
            if (spanStart < i2) {
                if (equals) {
                    iVar.f263989d = Math.max(0, i2 - (i2 - spanStart));
                    iVar.f263990e += 0;
                    i = 34;
                } else {
                    boldSpan.getClass();
                    text.setSpan(new BoldSpan(), spanStart, iVar.f263989d, 33);
                }
            }
            int spanEnd = text.getSpanEnd(next);
            int i3 = iVar.f263990e;
            if (spanEnd > i3) {
                if (equals) {
                    iVar.f263989d = Math.max(0, iVar.f263989d - 0);
                    iVar.f263990e += spanEnd - i3;
                } else {
                    boldSpan.getClass();
                    text.setSpan(new BoldSpan(), iVar.f263990e, spanEnd, 34);
                }
            }
            text.removeSpan(next);
        }
        if (bool != null && bool.booleanValue()) {
            text.setSpan(new BoldSpan(), iVar.f263989d, iVar.f263990e, i);
        }
    }

    /* renamed from: b */
    public int mo136723b() {
        return 0;
    }
}
