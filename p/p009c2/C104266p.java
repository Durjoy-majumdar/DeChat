package p009c2;

import android.view.inputmethod.ExtractedText;
import gy3.C87412m;
import p735w1.C38006x;
import z04.C112550d0;

/* renamed from: c2.p */
public final class C104266p {
    /* renamed from: a */
    public static final ExtractedText m139163a(C28482z zVar) {
        C87412m.m108594g(zVar, "<this>");
        ExtractedText extractedText = new ExtractedText();
        String str = zVar.f78285a.f100413d;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = C38006x.m41698f(zVar.f78286b);
        extractedText.selectionEnd = C38006x.m41697e(zVar.f78286b);
        extractedText.flags = C112550d0.m153802v(zVar.f78285a.f100413d, 10, false, 2, (Object) null) ^ true ? 1 : 0;
        return extractedText;
    }
}
