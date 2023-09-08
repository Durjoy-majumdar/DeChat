package s21;

import android.text.Html;
import android.text.Spanned;
import android.text.style.ParagraphStyle;
import java.util.regex.Pattern;
import o90.C100308d;
import p823sg.C101611g;
import q90.C101062d;

/* renamed from: s21.a */
public class C101496a {

    /* renamed from: a */
    public static C101611g<String, Spanned> f297203a = new C100308d(30);

    /* renamed from: b */
    public static Spanned f297204b = null;

    /* renamed from: a */
    public static Spanned m133260a(String str) {
        String str2;
        Spanned spanned;
        if (str == null) {
            str = "";
        }
        String replaceAll = Pattern.compile("\n", 2).matcher(str).replaceAll("<br/>");
        if (!replaceAll.startsWith("<html>")) {
            str2 = "<html>" + replaceAll;
        } else {
            str2 = replaceAll;
        }
        if (!str2.endsWith("</html>")) {
            str2 = str2 + "</html>";
        }
        Spanned spanned2 = null;
        try {
            f297204b = null;
            spanned = Html.fromHtml(str2, (Html.ImageGetter) null, new C101499d());
        } catch (Throwable unused) {
            spanned = f297204b;
            if (spanned == null) {
                spanned = null;
            }
        }
        if (spanned != null) {
            int length = spanned.toString().length();
            if (length > 1 && spanned.toString().endsWith("\n") && spanned.getSpans(length, length, ParagraphStyle.class).length > 0) {
                spanned = (Spanned) spanned.subSequence(0, length - 1);
            }
            spanned2 = spanned;
        }
        ((C101062d) f297203a).put(replaceAll, spanned2);
        return spanned2;
    }
}
