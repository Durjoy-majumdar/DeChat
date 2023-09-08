package androidx.work;

import android.content.Context;
import androidx.work.C113038a;
import java.util.Collections;
import java.util.List;
import p1014o4.C117693m;
import p1014o4.C117706v;
import p1109f4.C107471b;
import p1206p4.C117979k;

public final class WorkManagerInitializer implements C107471b<C117706v> {

    /* renamed from: a */
    public static final String f338333a = C117693m.m165967e("WrkMgrInitializer");

    /* renamed from: a */
    public Object mo119723a(Context context) {
        C117693m.m165966c().mo182389a(f338333a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        C117979k.m166387c(context, new C113038a(new C113038a.C113039a()));
        return C117979k.m166386b(context);
    }

    public List<Class<? extends C107471b<?>>> dependencies() {
        return Collections.emptyList();
    }
}
