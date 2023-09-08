package za3;

import android.text.Spanned;
import android.text.style.CharacterStyle;
import java.util.Comparator;

/* renamed from: za3.b */
public class C102989b implements Comparator<CharacterStyle> {

    /* renamed from: d */
    public final /* synthetic */ Spanned f303921d;

    public C102989b(Spanned spanned) {
        this.f303921d = spanned;
    }

    public int compare(Object obj, Object obj2) {
        CharacterStyle characterStyle = (CharacterStyle) obj;
        CharacterStyle characterStyle2 = (CharacterStyle) obj2;
        int spanStart = this.f303921d.getSpanStart(characterStyle);
        int spanStart2 = this.f303921d.getSpanStart(characterStyle2);
        if (spanStart != spanStart2) {
            return spanStart - spanStart2;
        }
        int spanEnd = this.f303921d.getSpanEnd(characterStyle);
        int spanEnd2 = this.f303921d.getSpanEnd(characterStyle2);
        return spanEnd != spanEnd2 ? spanEnd2 - spanEnd : characterStyle.getClass().getName().compareTo(characterStyle2.getClass().getName());
    }
}
