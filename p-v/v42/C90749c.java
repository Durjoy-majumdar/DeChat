package v42;

import a52.C0013b;
import a52.C79466a;
import b52.C79669b;
import b52.C79670c;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import e42.C7594e;
import e42.C86431j;
import f52.C45754a;
import f52.C45757c;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import sx3.C110818d0;
import sx3.C64197v;
import w42.C15037a;
import w42.C15042d;
import w42.C15043e;
import w42.C90896b;
import w42.C90898f;
import z42.C16100a;

/* renamed from: v42.c */
public final class C90749c {

    /* renamed from: a */
    public static final C90749c f260644a = new C90749c();

    /* renamed from: a */
    public final <T extends C7594e> List<C86431j<T>> mo124878a(String str) {
        C87412m.m108594g(str, "bizName");
        List<C86431j<T>> B0 = C110818d0.m150900B0(C64197v.m75537f(new C45754a(str), new C45757c(str), new C52761b(), new C52760a(), new C15042d(), new C79466a(), new C0013b(), new C79670c(), new C79669b()));
        if (C87412m.m108589b(str, MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_BRAND_SERVICE)) {
            ArrayList arrayList = (ArrayList) B0;
            arrayList.addAll(C64197v.m75537f(new C15043e(), new C90898f(), new C15037a(), new C79466a(), new C90896b(), new C16100a()));
        }
        return B0;
    }
}
