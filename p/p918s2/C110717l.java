package p918s2;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: s2.l */
public final class C110717l implements Iterable<Intent> {

    /* renamed from: d */
    public final ArrayList<Intent> f331178d = new ArrayList<>();

    /* renamed from: e */
    public final Context f331179e;

    /* renamed from: s2.l$a */
    public interface C110718a {
        Intent getSupportParentActivityIntent();
    }

    public C110717l(Context context) {
        this.f331179e = context;
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f331178d.iterator();
    }
}
