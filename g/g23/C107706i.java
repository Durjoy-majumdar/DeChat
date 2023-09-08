package g23;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: g23.i */
public final class C107706i {

    /* renamed from: a */
    public static final C107706i f322258a = new C107706i();

    /* renamed from: b */
    public static final ConcurrentHashMap<String, C107696a> f322259b = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static void m145888b(C107706i iVar, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        String str2 = str;
        int i9 = i8;
        boolean z = false;
        int i15 = (i9 & 8) != 0 ? 0 : i3;
        int i16 = (i9 & 16) != 0 ? -1 : i4;
        int i17 = (i9 & 32) != 0 ? -1 : i5;
        int i18 = (i9 & 64) != 0 ? -1 : i6;
        int i19 = (i9 & 128) != 0 ? -1 : i7;
        iVar.getClass();
        C87412m.m108594g(str, "path");
        if (str.length() > 0) {
            z = true;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("putCache, path:");
            sb.append(str);
            sb.append(", width:");
            int i25 = i;
            sb.append(i);
            sb.append(", height:height, rotate:");
            sb.append(i15);
            sb.append(", cropLeft:");
            sb.append(i16);
            sb.append(", cropTop:");
            sb.append(i17);
            sb.append(", cropRight:");
            sb.append(i18);
            sb.append(", cropBottom:");
            sb.append(i19);
            Log.m105924i("MicroMsg.VLogMaterialsInfoCache", sb.toString());
            f322259b.put(str, new C107696a(i, i2, i15, i16, i17, i18, i19));
        }
    }

    /* renamed from: a */
    public final C107696a mo158113a(String str) {
        C87412m.m108594g(str, "path");
        if (str.length() == 0) {
            return null;
        }
        return f322259b.get(str);
    }
}
