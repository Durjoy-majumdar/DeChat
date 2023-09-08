package p176jc;

import android.util.SparseArray;
import com.tencent.skyline.IRouteBackCallback;
import com.tencent.skyline.SkylineRuntime;
import gy3.C8480h;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: jc.x */
public final class C87943x {

    /* renamed from: e */
    public static final SparseArray<C87943x> f254511e = new SparseArray<>();

    /* renamed from: a */
    public final SkylineRuntime f254512a;

    /* renamed from: b */
    public final C87942w f254513b = new C87942w(this);

    /* renamed from: c */
    public final AtomicBoolean f254514c = new AtomicBoolean(false);

    /* renamed from: d */
    public final CopyOnWriteArraySet<IRouteBackCallback> f254515d = new CopyOnWriteArraySet<>();

    public C87943x(SkylineRuntime skylineRuntime, C8480h hVar) {
        this.f254512a = skylineRuntime;
    }

    /* renamed from: a */
    public static final C87943x m109443a(SkylineRuntime skylineRuntime) {
        C87943x xVar = null;
        if (!(skylineRuntime == null || 0 == skylineRuntime.getRuntimePtr())) {
            int hashCode = skylineRuntime.hashCode();
            SparseArray<C87943x> sparseArray = f254511e;
            synchronized (sparseArray) {
                C87943x xVar2 = sparseArray.get(hashCode);
                if (xVar2 == null) {
                    xVar2 = new C87943x(skylineRuntime, (C8480h) null);
                    sparseArray.put(hashCode, xVar2);
                }
                xVar = xVar2;
            }
        }
        return xVar;
    }
}
