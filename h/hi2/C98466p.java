package hi2;

import com.tencent.p014mm.sdk.platformtools.Log;
import di2.C97480a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: hi2.p */
public final class C98466p {

    /* renamed from: a */
    public static final C98466p f288808a = new C98466p();

    /* renamed from: b */
    public static final ArrayList<C97480a> f288809b = new ArrayList<>();

    /* renamed from: c */
    public static final String f288810c = "MicroMsg.MemLeakUtil";

    /* renamed from: a */
    public final void mo137836a() {
        Log.m105924i(f288810c, "release panel ");
        Iterator<C97480a> it = f288809b.iterator();
        while (it.hasNext()) {
            C97480a next = it.next();
            String str = f288810c;
            Log.m105924i(str, "release panel " + next);
            next.f293962c.mo100189b();
        }
        f288809b.clear();
    }
}
