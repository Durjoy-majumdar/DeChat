package p687sr;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import di3.C7335d;
import fy3.C32226l;
import java.util.HashMap;
import java.util.Map;
import rx3.C13598b0;

/* renamed from: sr.e */
public interface C64153e extends C7335d {

    /* renamed from: sr.e$a */
    public static final class C64154a {
        /* renamed from: a */
        public static /* synthetic */ C64152d m75480a(C64153e eVar, String str, String str2, String str3, Map map, String str4, Drawable drawable, int i, boolean z, boolean z2, C32226l lVar, int i2, Object obj) {
            int i3 = i2;
            if (obj == null) {
                return eVar.mo88359MQ(str, str2, str3, (i3 & 8) != 0 ? new HashMap() : map, (i3 & 16) != 0 ? null : str4, (i3 & 32) != 0 ? null : drawable, (i3 & 64) != 0 ? 0 : i, (i3 & 128) != 0 ? true : z, (i3 & 256) != 0 ? true : z2, (i3 & 512) != 0 ? null : lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createForceNotifyCommonItem");
        }
    }

    /* renamed from: sr.e$b */
    public interface C64155b {
        /* renamed from: a */
        void mo4980a(boolean z);
    }

    /* renamed from: Et */
    void mo88358Et(C64152d dVar);

    /* renamed from: MQ */
    C64152d mo88359MQ(String str, String str2, String str3, Map<String, String> map, String str4, Drawable drawable, int i, boolean z, boolean z2, C32226l<? super View, C13598b0> lVar);

    /* renamed from: bj */
    C36783f mo88360bj(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12);

    /* renamed from: hD */
    boolean mo88361hD(Context context);

    void jc0(Context context, int i, boolean z, C64155b bVar);

    /* renamed from: mO */
    void mo88363mO(C36783f fVar);
}
