package xr0;

import com.tencent.p014mm.plugin.appbrand.appusage.C68585h1;
import com.tencent.p014mm.plugin.appbrand.p026ui.collection.AppBrandCollectionDisplayVerticalList;
import di3.C7335d;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C76879j;
import rx3.C13598b0;

/* renamed from: xr0.b */
public final class C78968b implements C76879j.C47267l {

    /* renamed from: a */
    public final /* synthetic */ AppBrandCollectionDisplayVerticalList f231904a;

    /* renamed from: xr0.b$a */
    public static final class C78969a extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public static final C78969a f231905d = new C78969a();

        public C78969a() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "username");
            C7335d c = C86312j.m106911c(C68585h1.class);
            C87412m.m108591d(c);
            ((C68585h1) c).rg0(str, 0);
            return C13598b0.f38549a;
        }
    }

    public C78968b(AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList) {
        this.f231904a = appBrandCollectionDisplayVerticalList;
    }

    public final boolean onFinish(CharSequence charSequence) {
        String obj;
        if (!(charSequence == null || (obj = charSequence.toString()) == null)) {
            AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList = this.f231904a;
            C78969a aVar = C78969a.f231905d;
            int i = AppBrandCollectionDisplayVerticalList.f246623t;
            appBrandCollectionDisplayVerticalList.getClass();
            if (!(obj.length() == 0)) {
                aVar.invoke(obj);
            }
        }
        return true;
    }
}
