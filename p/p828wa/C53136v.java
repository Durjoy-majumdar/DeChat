package p828wa;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: wa.v */
public class C53136v {

    /* renamed from: a */
    public static ConcurrentHashMap<Integer, C53133t> f148255a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static C53133t m59532a(Context context, Integer num) {
        if (num == null || !f148255a.containsKey(num)) {
            return null;
        }
        C53133t remove = f148255a.remove(num);
        remove.mo73823k(context);
        remove.mo73822j();
        Log.m105925i(C53136v.class.getSimpleName(), "retrieve, holding size: %d", Integer.valueOf(f148255a.size()));
        return remove;
    }
}
