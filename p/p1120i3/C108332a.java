package p1120i3;

import android.view.View;
import com.tencent.p014mm.C0966R;

/* renamed from: i3.a */
public final class C108332a {
    /* renamed from: a */
    public static final C108334c m146751a(View view) {
        C108334c cVar = (C108334c) view.getTag(C0966R.C0970id.n2j);
        if (cVar != null) {
            return cVar;
        }
        C108334c cVar2 = new C108334c();
        view.setTag(C0966R.C0970id.n2j, cVar2);
        return cVar2;
    }
}
