package iu0;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C8480h;
import gy3.C87412m;
import yc3.C38992a;

/* renamed from: iu0.d */
public final class C87815d implements C38992a {

    /* renamed from: a */
    public static final C87816a f254222a = new C87816a((C8480h) null);

    /* renamed from: iu0.d$a */
    public static final class C87816a {
        public C87816a(C8480h hVar) {
        }

        /* renamed from: a */
        public static final MultiProcessMMKV m109273a(C87816a aVar) {
            aVar.getClass();
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("MicroMsg.UseXWebCanvas");
            C87412m.m108593f(mmkv, "getMMKV(TAG)");
            return mmkv;
        }
    }

    /* renamed from: a */
    public boolean mo38a(Context context, String[] strArr, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(strArr, "args");
        C87412m.m108594g(str, "username");
        if (!C87412m.m108589b("//skia", strArr[0]) || strArr.length < 2) {
            return false;
        }
        String str2 = strArr[1];
        if (C87412m.m108589b(str2, "true")) {
            C87816a aVar = f254222a;
            C87816a.m109273a(aVar).putBoolean("use_skia_canvas", true);
            C87816a.m109273a(aVar).commit();
        } else if (C87412m.m108589b(str2, "false")) {
            C87816a aVar2 = f254222a;
            C87816a.m109273a(aVar2).putBoolean("use_skia_canvas", false);
            C87816a.m109273a(aVar2).commit();
        } else {
            C87816a aVar3 = f254222a;
            C87816a.m109273a(aVar3).clear();
            C87816a.m109273a(aVar3).commit();
        }
        return true;
    }
}
