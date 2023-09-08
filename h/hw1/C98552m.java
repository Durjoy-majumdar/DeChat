package hw1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gallery.model.C93958f;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import qw1.C101316l;

@C86522b
/* renamed from: hw1.m */
public final class C98552m extends C86301e implements C33105o {
    /* renamed from: P1 */
    public String mo58981P1(String str) {
        C87412m.m108594g(str, "bucketID");
        if (Util.isNullOrNil(str)) {
            return null;
        }
        int safeParseInt = Util.safeParseInt(str);
        if (C101316l.f296816b == safeParseInt) {
            return MMApplicationContext.getContext().getString(C0966R.string.f4x);
        }
        if (C101316l.f296817c == safeParseInt) {
            return MMApplicationContext.getContext().getString(C0966R.string.f4r);
        }
        if (C101316l.f296818d == safeParseInt) {
            return MMApplicationContext.getContext().getString(C0966R.string.f4s);
        }
        if (C101316l.f296819e.contains(Integer.valueOf(safeParseInt))) {
            return MMApplicationContext.getContext().getString(C0966R.string.f4u);
        }
        if (C101316l.f296820f.contains(Integer.valueOf(safeParseInt))) {
            return MMApplicationContext.getContext().getString(C0966R.string.f4v);
        }
        C98550k kVar = C93958f.m118749i().f271166l.get(safeParseInt);
        if (kVar == null) {
            return null;
        }
        String str2 = kVar.f289002a;
        C87412m.m108593f(str2, "albumName.key");
        String lowerCase = str2.toLowerCase();
        C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase()");
        return C87412m.m108589b(lowerCase, "WeChatWork") ? MMApplicationContext.getContext().getString(C0966R.string.f4w) : kVar.f289004c;
    }
}
