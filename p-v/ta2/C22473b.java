package ta2;

import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: ta2.b */
public class C22473b {

    /* renamed from: a */
    public static final NumberFormat f63642a;

    static {
        NumberFormat instance = NumberFormat.getInstance(Locale.US);
        f63642a = instance;
        instance.setMinimumFractionDigits(2);
        instance.setMaximumFractionDigits(2);
        instance.setGroupingUsed(false);
    }
}
