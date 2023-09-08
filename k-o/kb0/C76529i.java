package kb0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import di3.C7335d;
import lb0.C88394b;

/* renamed from: kb0.i */
public interface C76529i extends C7335d {

    /* renamed from: kb0.i$a */
    public enum C76530a {
        DECODE_TYPE_DEFAULT,
        DECODE_TYPE_ORIGIN
    }

    /* renamed from: kb0.i$b */
    public interface C76531b {
        /* renamed from: a */
        void mo94358a(int i);
    }

    /* renamed from: kb0.i$c */
    public interface C76532c {
        /* renamed from: a */
        void mo104153a(boolean z);

        /* renamed from: b */
        void mo104154b();
    }

    /* renamed from: Hc */
    C88394b.C88405h mo106759Hc(int i, int i2, C76530a aVar);

    /* renamed from: I7 */
    View mo106760I7(Context context, Bundle bundle, boolean z, C76532c cVar);

    C88394b.C88405h Ij0(int i, int i2);

    /* renamed from: jI */
    boolean mo106762jI(String str, View view, Bundle bundle);

    /* renamed from: kb */
    void mo106763kb(int i, Bundle bundle);

    void ks0(String str, View view);

    boolean sh0(String str, View view, Bundle bundle, C76531b bVar);

    /* renamed from: ul */
    C88394b.C88408j mo106766ul(int i, int i2);
}
