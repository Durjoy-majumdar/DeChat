package p522fo;

import com.tencent.p014mm.plugin.magicbrush.C30183d0;
import di3.C86312j;
import gy3.C87412m;
import java.util.HashSet;
import java.util.List;
import p150eo.C86596j;
import p163ho.C8620a;
import p172io.C9213a;
import p172io.C9214b;
import p183ko.C10367a;
import p971go.C87273a;
import p989jo.C87991a;
import p989jo.C87992b;
import sx3.C110818d0;
import sx3.C110826x0;

/* renamed from: fo.a */
public final class C32139a {

    /* renamed from: a */
    public static final C32139a f85452a = new C32139a();

    /* renamed from: a */
    public final <T extends C86596j> C32140b<T> mo58503a(String str) {
        C87412m.m108594g(str, "bizName");
        List Ep0 = ((C30183d0) C86312j.m106911c(C30183d0.class)).Ep0(str);
        HashSet b = C110826x0.m151014b(new C87992b(), new C87991a(), new C87273a(), new C8620a(), new C9213a(), new C9214b(), new C10367a());
        C110818d0.m150949u0(Ep0, b);
        return new C32140b<>(b, new HashSet());
    }
}
