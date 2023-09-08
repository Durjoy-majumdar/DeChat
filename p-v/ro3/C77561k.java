package ro3;

import android.widget.TextView;
import com.tencent.p014mm.p136ui.C85975v4;
import gy3.C87412m;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: ro3.k */
public final class C77561k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C110588j f226125d;

    public C77561k(C110588j jVar) {
        this.f226125d = jVar;
    }

    public final void run() {
        TextView textView = this.f226125d.f330833h;
        C87412m.m108594g(textView, "textView");
        try {
            Field declaredField = TextView.class.getDeclaredField("mEditor");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(textView);
            Method declaredMethod = Class.forName("android.widget.Editor").getDeclaredMethod("stopSelectionActionMode", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(obj, new Object[0]);
        } catch (Throwable th) {
            C85975v4.m106305b("SelectableEditTextHelper", "stopSelectionMode err:%s", th.getMessage());
        }
    }
}
