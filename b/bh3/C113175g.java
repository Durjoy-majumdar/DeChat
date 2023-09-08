package bh3;

import bh3.C113177k;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sensitive.p135ui.PermissionSwitchCheckUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117293c;
import rx3.C13598b0;

/* renamed from: bh3.g */
public final class C113175g implements C117293c {

    /* renamed from: a */
    public static final C113175g f338625a = new C113175g();

    /* renamed from: bh3.g$a */
    public static final class C28323a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f77933d;

        /* renamed from: e */
        public final /* synthetic */ String f77934e;

        /* renamed from: f */
        public final /* synthetic */ Object f77935f;

        /* renamed from: g */
        public final /* synthetic */ Object[] f77936g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28323a(String str, String str2, Object obj, Object[] objArr) {
            super(1);
            this.f77933d = str;
            this.f77934e = str2;
            this.f77935f = obj;
            this.f77936g = objArr;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                C28320f fVar = C28320f.f77928a;
                String str = this.f77933d;
                C87412m.m108593f(str, "innerClassName");
                String str2 = this.f77934e;
                C87412m.m108593f(str2, "methodName");
                Object obj2 = this.f77935f;
                Object[] objArr = this.f77936g;
                C87412m.m108593f(objArr, "args");
                fVar.mo55918a(str, str2, obj2, objArr, Boolean.TRUE);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final Object mo109570a(String str, String str2, String str3, String str4, String str5, Object obj, Object[] objArr) {
        C28320f fVar = C28320f.f77928a;
        Log.m105924i("ExportFileHooker", "ExportFileHooker");
        PermissionSwitchCheckUtil permissionSwitchCheckUtil = PermissionSwitchCheckUtil.f347926a;
        if (!permissionSwitchCheckUtil.mo176849f() && permissionSwitchCheckUtil.mo176846c(C113177k.C113179b.STORAGE, C113177k.C113178a.SAVE_FILE, new C28323a(str, str4, obj, objArr))) {
            return null;
        }
        C28320f fVar2 = C28320f.f77928a;
        C87412m.m108593f(str, "innerClassName");
        C87412m.m108593f(str4, "methodName");
        C87412m.m108593f(objArr, "args");
        return fVar2.mo55918a(str, str4, obj, objArr, Boolean.FALSE);
    }
}
