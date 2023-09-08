package bh3;

import bh3.C113177k;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sensitive.p135ui.PermissionSwitchCheckUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117293c;
import rx3.C13598b0;

/* renamed from: bh3.h */
public final class C113176h implements C117293c {

    /* renamed from: a */
    public static final C113176h f338626a = new C113176h();

    /* renamed from: bh3.h$a */
    public static final class C28324a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f77937d;

        /* renamed from: e */
        public final /* synthetic */ String f77938e;

        /* renamed from: f */
        public final /* synthetic */ Object f77939f;

        /* renamed from: g */
        public final /* synthetic */ Object[] f77940g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28324a(String str, String str2, Object obj, Object[] objArr) {
            super(1);
            this.f77937d = str;
            this.f77938e = str2;
            this.f77939f = obj;
            this.f77940g = objArr;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                C28320f fVar = C28320f.f77928a;
                String str = this.f77937d;
                C87412m.m108593f(str, "innerClassName");
                String str2 = this.f77938e;
                C87412m.m108593f(str2, "methodName");
                Object obj2 = this.f77939f;
                Object[] objArr = this.f77940g;
                C87412m.m108593f(objArr, "args");
                fVar.mo55919b(str, str2, obj2, objArr, Boolean.TRUE);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final Object mo109570a(String str, String str2, String str3, String str4, String str5, Object obj, Object[] objArr) {
        C28320f fVar = C28320f.f77928a;
        Log.m105924i("ExportFileHooker", "saveBitmapToImage");
        PermissionSwitchCheckUtil permissionSwitchCheckUtil = PermissionSwitchCheckUtil.f347926a;
        if (!permissionSwitchCheckUtil.mo176849f() && permissionSwitchCheckUtil.mo176846c(C113177k.C113179b.STORAGE, C113177k.C113178a.SAVE_FILE, new C28324a(str, str4, obj, objArr))) {
            return null;
        }
        C28320f fVar2 = C28320f.f77928a;
        C87412m.m108593f(str, "innerClassName");
        C87412m.m108593f(str4, "methodName");
        C87412m.m108593f(objArr, "args");
        return fVar2.mo55919b(str, str4, obj, objArr, Boolean.FALSE);
    }
}
