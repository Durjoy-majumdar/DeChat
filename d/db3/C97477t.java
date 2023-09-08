package db3;

import android.text.Spannable;
import bb3.C92230i;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import db3.C97463g;
import java.util.ArrayList;

/* renamed from: db3.t */
public abstract class C97477t<V, C extends C97463g<V>> {
    /* renamed from: a */
    public abstract void mo136722a(WXRTEditText wXRTEditText, V v);

    /* renamed from: b */
    public abstract int mo136723b();

    /* renamed from: c */
    public abstract C92230i mo136727c(WXRTEditText wXRTEditText);

    /* renamed from: d */
    public abstract ArrayList<Object> mo136728d(Spannable spannable, C92230i iVar, C97476s sVar);

    /* renamed from: e */
    public boolean mo136742e(int i, int... iArr) {
        for (int i2 : iArr) {
            if ((i & i2) == i2) {
                return true;
            }
        }
        return false;
    }
}
