package cw2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xv2.C79002b;
import xv2.C79003c;

/* renamed from: cw2.f */
public final class C75307f implements C79002b {

    /* renamed from: a */
    public static final C75307f f221459a = new C75307f();

    /* renamed from: b */
    public static final List<WeakReference<C79003c>> f221460b = Collections.synchronizedList(new ArrayList());

    /* renamed from: c */
    public static int f221461c;

    /* renamed from: d */
    public static boolean f221462d;

    /* renamed from: a */
    public void mo105641a() {
        Log.m105925i("MicroMsg.FavourUserChecker", "setFavourStoryRead:%s", Integer.valueOf(f221461c));
        if (f221461c != 0) {
            f221461c = 2;
        }
    }

    /* renamed from: b */
    public void mo105642b(List<String> list) {
        if (list != null) {
            ThreadPool.post(C75306e.f221458d, "FavourUserChecker_StoryStateChecker");
        }
    }

    /* renamed from: c */
    public void mo105643c(WeakReference<C79003c> weakReference) {
        if (weakReference != null) {
            List<WeakReference<C79003c>> list = f221460b;
            if (!list.contains(weakReference)) {
                list.add(weakReference);
            }
        }
    }

    /* renamed from: d */
    public int mo105644d() {
        return f221461c;
    }
}
