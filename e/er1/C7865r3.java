package er1;

import android.content.Context;
import android.graphics.Point;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: er1.r3 */
public final class C7865r3 {

    /* renamed from: a */
    public static final C7865r3 f26468a = new C7865r3();

    /* renamed from: a */
    public final int mo8968a() {
        Point b = C75044y4.m89990b(MMApplicationContext.getContext());
        int i = b.x;
        int i2 = b.y;
        if (mo8971d()) {
            return i2;
        }
        if (i2 >= i) {
            i = i2;
        }
        return i;
    }

    /* renamed from: b */
    public final int mo8969b(Context context) {
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        int c = C75044y4.m89991c(context);
        Point b = C75044y4.m89990b(MMApplicationContext.getContext());
        int i = b.x;
        int i2 = b.y;
        if (mo8971d()) {
            return i2 - c;
        }
        if (i2 >= i) {
            i = i2;
        }
        return i - c;
    }

    /* renamed from: c */
    public final int mo8970c() {
        C74783i3.C6978a a = C74783i3.m89537a(MMApplicationContext.getContext());
        int i = a.f24704a;
        int i2 = a.f24705b;
        return (!mo8971d() && i > i2) ? i2 : i;
    }

    /* renamed from: d */
    public final boolean mo8971d() {
        long nanoTime = System.nanoTime();
        boolean z = C85875k4.m106208w() || C85875k4.m106157N();
        if (BuildInfo.DEBUG) {
            Log.m105924i("FinderUIToolHelper", "[isFoldableDeviceOrInMagicWindowMode] cost=" + (System.nanoTime() - nanoTime) + "ns");
        }
        return z;
    }
}
