package w21;

import android.text.Spannable;
import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText;
import java.util.ArrayList;
import u21.C101955g;
import w21.C102310h;

/* renamed from: w21.t */
public abstract class C102323t<V, C extends C102310h<V>> {
    /* renamed from: a */
    public abstract void mo141853a(WXRTEditText wXRTEditText, V v);

    /* renamed from: b */
    public abstract int mo141854b();

    /* renamed from: c */
    public abstract C101955g mo141858c(WXRTEditText wXRTEditText);

    /* renamed from: d */
    public abstract ArrayList<Object> mo141859d(Spannable spannable, C101955g gVar, C102320q qVar);

    /* renamed from: e */
    public boolean mo141873e(int i, int... iArr) {
        for (int i2 : iArr) {
            if ((i & i2) == i2) {
                return true;
            }
        }
        return false;
    }
}
