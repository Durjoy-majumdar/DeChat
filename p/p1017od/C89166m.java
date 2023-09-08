package p1017od;

import com.tencent.magicbrush.C80301a;
import com.tencent.magicbrush.handler.p940fs.IMBFileSystem;
import gy3.C8480h;
import ny3.C89104m;
import p1017od.C89167n;
import p1052vd.C90765a;
import p419td.C26307i;
import rx3.C13598b0;

/* renamed from: od.m */
public class C89166m extends C89167n {
    /* renamed from: k */
    public C80301a mo123512k() {
        int i = C80301a.f235092p;
        boolean z = true;
        try {
            C89167n.C89168a aVar = this.f256984q;
            C89104m<Object>[] mVarArr = C89167n.f256956L;
            double floatValue = (double) ((Number) aVar.mo125227a(this, mVarArr[10])).floatValue();
            if (!(0.0d <= floatValue && floatValue <= 1.0d)) {
                throw new IllegalStateException(("GcFactor must in [0, 1], but " + ((Number) this.f256984q.mo125227a(this, mVarArr[10])).floatValue()).toString());
            } else if (this.f256968a == null) {
                throw new IllegalStateException("AndroidContext invalid.".toString());
            } else if (this.f256969b == null) {
                throw new IllegalStateException("JsThreadHandler invalid.".toString());
            } else if (this.f256970c != null) {
                C90765a.m113825b(this);
                C90765a.m113826c(this);
                if (((IMBFileSystem) this.f256974g.mo125227a(this, mVarArr[3])) == null) {
                    C90765a.m113824a(this, "FileSystem invalid, BindingFileSystem can not use. BE CAUTIOUS!");
                    C13598b0 b0Var = C13598b0.f38549a;
                }
                C90765a.m113827d(this);
                if (this.f256977j == null) {
                    this.f256977j = new C26307i();
                }
                if (!z) {
                    return null;
                }
                return new C80301a(this, (C8480h) null);
            } else {
                throw new IllegalStateException("v8RawPointer invalid. Please define which JsEngine magicbrush should use.".toString());
            }
        } catch (Exception e) {
            if (!this.f256987t) {
                z = false;
            } else {
                throw e;
            }
        }
    }
}
