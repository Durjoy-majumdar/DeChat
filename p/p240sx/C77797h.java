package p240sx;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.tencent.p014mm.storage.C72963f4;
import di3.C7335d;
import java.util.List;

/* renamed from: sx.h */
public interface C77797h extends C7335d {

    /* renamed from: sx.h$a */
    public interface C77798a {

        /* renamed from: sx.h$a$a */
        public enum C77799a {
            del,
            trans,
            fav
        }

        /* renamed from: N */
        boolean mo83540N();

        /* renamed from: a */
        void mo83541a(C77799a aVar);

        /* renamed from: b */
        void mo83542b(C77799a aVar);

        /* renamed from: c */
        void mo83543c(C77799a aVar);

        /* renamed from: e0 */
        boolean mo83544e0();

        /* renamed from: g0 */
        void mo83545g0(Bundle bundle);

        /* renamed from: s0 */
        boolean mo83546s0();
    }

    boolean Rb0(Context context, List<? extends C72963f4> list, boolean z, String str, C77798a aVar);

    int Ui0();

    /* renamed from: VR */
    List<C72963f4> mo107937VR();

    Pair<Long, Boolean> Xj0(Context context, String str, boolean z);

    /* renamed from: yb */
    Pair<Long, Boolean> mo107939yb(Context context, String str, boolean z, String str2);
}
