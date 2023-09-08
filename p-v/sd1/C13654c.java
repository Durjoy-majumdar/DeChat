package sd1;

import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import gy3.C87412m;
import java.util.List;
import on1.C11536m;
import on1.C11545o;
import on1.C11575y;
import os1.C11755t;
import wx3.C15601d;

/* renamed from: sd1.c */
public final class C13654c implements C11545o<C0740i2> {

    /* renamed from: d */
    public final String f38683d;

    /* renamed from: e */
    public final C11755t f38684e;

    /* renamed from: sd1.c$a */
    public static final class C13655a extends C11536m<C0740i2> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13655a(List<? extends C0740i2> list) {
            super(list);
            C87412m.m108594g(list, "list");
        }
    }

    public C13654c(String str) {
        C87412m.m108594g(str, "key");
        this.f38683d = str;
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11755t.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…cFeedCacheVM::class.java)");
        this.f38684e = (C11755t) a;
    }

    /* renamed from: a */
    public void mo10079a() {
    }

    /* renamed from: b */
    public void mo10080b(Object obj) {
        C87412m.m108594g((C11575y) obj, "value");
    }

    /* renamed from: c */
    public Object mo11470c(C15601d<? super C11575y<C0740i2>> dVar) {
        return new C13655a(this.f38684e.mo11627c3(this.f38683d).f34415b);
    }

    /* renamed from: f */
    public Object mo10083f(C15601d<? super C11575y<C0740i2>> dVar) {
        return mo11470c(dVar);
    }

    /* renamed from: getKey  reason: collision with other method in class */
    public C11545o.C11546a m168124getKey() {
        return new C11545o.C11546a("");
    }

    public Object getKey() {
        return new C11545o.C11546a("");
    }
}
