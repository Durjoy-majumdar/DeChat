package com.tencent.p014mm.plugin.magicbrush;

import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$PublicServiceNames;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import f40.C86718e;
import f42.C31904c;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Set;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C48501y0;
import z04.C112551y;

@C86522b
/* renamed from: com.tencent.mm.plugin.magicbrush.d1 */
public final class C30184d1 extends C86301e implements C30180c0 {

    /* renamed from: d */
    public int f81592d;

    /* renamed from: e */
    public final C13601g f81593e = C36568h.m40985a(new C30185a(this));

    /* renamed from: com.tencent.mm.plugin.magicbrush.d1$a */
    public static final class C30185a extends C87413o implements C32224a<Set<? extends C31904c>> {

        /* renamed from: d */
        public final /* synthetic */ C30184d1 f81594d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30185a(C30184d1 d1Var) {
            super(0);
            this.f81594d = d1Var;
        }

        public Object invoke() {
            return C48501y0.m53872g(C30184d1.vx0(this.f81594d, MagicBrushConstants$BizNames.class, false), C30184d1.vx0(this.f81594d, MagicBrushConstants$PublicServiceNames.class, true));
        }
    }

    public static final Set vx0(C30184d1 d1Var, Class cls, boolean z) {
        d1Var.getClass();
        Field[] declaredFields = cls.getDeclaredFields();
        C87412m.m108593f(declaredFields, "clazz.declaredFields");
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            C31904c cVar = null;
            Object obj = field.get((Object) null);
            if (obj instanceof String) {
                String str = (String) obj;
                if (C112551y.m153820t(str, "Magic", false, 2, (Object) null)) {
                    cVar = new C31904c(str, z);
                }
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return C110818d0.m150904D0(arrayList);
    }

    public int getUin() {
        if (this.f81592d == 0) {
            this.f81592d = MMApplicationContext.isMainProcess() ? C86709a0.m107523b().mo121110g() : C86718e.m107549h();
        }
        return this.f81592d;
    }

    /* renamed from: np */
    public Set<C31904c> mo57208np() {
        return (Set) ((C36570n) this.f81593e).getValue();
    }
}
