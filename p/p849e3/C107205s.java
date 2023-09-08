package p849e3;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: e3.s */
public final class C107205s {

    /* renamed from: a */
    public Object f320807a;

    public C107205s(Object obj) {
        this.f320807a = obj;
    }

    /* renamed from: a */
    public static C107205s m145159a(Context context, int i) {
        return Build.VERSION.SDK_INT >= 24 ? new C107205s(PointerIcon.getSystemIcon(context, i)) : new C107205s((Object) null);
    }
}
