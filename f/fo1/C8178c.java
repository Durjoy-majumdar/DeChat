package fo1;

import android.content.res.Resources;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import gy3.C87412m;

/* renamed from: fo1.c */
public interface C8178c<T> {

    /* renamed from: fo1.c$a */
    public static final class C8179a {
        /* renamed from: a */
        public static <T> Resources m8259a(C8178c<T> cVar) {
            Resources resources = cVar.getActivity().getResources();
            C87412m.m108591d(resources);
            return resources;
        }
    }

    MMFragmentActivity getActivity();
}
