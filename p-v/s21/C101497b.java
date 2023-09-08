package s21;

import android.text.Spanned;
import android.text.style.CharacterStyle;
import java.util.Comparator;

/* renamed from: s21.b */
public class C101497b implements Comparator<CharacterStyle> {

    /* renamed from: d */
    public final /* synthetic */ Spanned f297205d;

    public C101497b(Spanned spanned) {
        this.f297205d = spanned;
    }

    public int compare(Object obj, Object obj2) {
        CharacterStyle characterStyle = (CharacterStyle) obj;
        CharacterStyle characterStyle2 = (CharacterStyle) obj2;
        int spanStart = this.f297205d.getSpanStart(characterStyle);
        int spanStart2 = this.f297205d.getSpanStart(characterStyle2);
        if (spanStart != spanStart2) {
            return spanStart - spanStart2;
        }
        int spanEnd = this.f297205d.getSpanEnd(characterStyle);
        int spanEnd2 = this.f297205d.getSpanEnd(characterStyle2);
        return spanEnd != spanEnd2 ? spanEnd2 - spanEnd : characterStyle.getClass().getName().compareTo(characterStyle2.getClass().getName());
    }
}
