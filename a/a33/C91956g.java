package a33;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import f72.C97842b;
import gy3.C87412m;
import hi2.C98453h;

/* renamed from: a33.g */
public final class C91956g {

    /* renamed from: a */
    public static final C91956g f263271a = new C91956g();

    /* renamed from: a */
    public final void mo125811a(String str, String str2, int i) {
        C87412m.m108594g(str, "videoPath");
        C87412m.m108594g(str2, "thumbPath");
        if (C86013q1.m106450k(str2)) {
            C86013q1.m106447h(str2);
        }
        Log.m105924i("MicroMsg.RemuxFileUtil", "");
        Bitmap q = C97842b.m126300q(str);
        if (q != null) {
            BitmapUtil.saveBitmapToImage(C98453h.f288774a.mo137807e(q, i), 60, Bitmap.CompressFormat.JPEG, str2, true);
        }
    }

    /* renamed from: b */
    public final void mo125812b(String str) {
        C87412m.m108594g(str, "path");
        long currentTicks = Util.currentTicks();
        SightVideoJNI.optimizeMP4VFS(str);
        Log.m105924i("MicroMsg.RemuxFileUtil", "time cost: " + Util.ticksToNow(currentTicks));
    }
}
