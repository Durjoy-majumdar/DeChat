package eq0;

import c30.C104289g;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81413f0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81428p0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81433r0;
import com.tencent.p014mm.sdk.platformtools.Log;
import cq0.C86091c;
import cq0.C86092d;
import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: eq0.e */
public class C86635e extends C86092d {

    /* renamed from: a */
    public C81413f0 f251599a = null;

    /* renamed from: a */
    public int mo120512a() {
        return 7;
    }

    /* renamed from: b */
    public String mo120517b(C104289g gVar, C86091c cVar) {
        C81925i2 i2Var = cVar.f250575b;
        if (this.f251599a == null) {
            AppBrandRuntime runtime = i2Var.getRuntime();
            if (i2Var.getRuntime().mo113034V() instanceof C81428p0) {
                LinkedList<C81415h0> linkedList = ((C81428p0) runtime.mo113034V()).f238970d;
                int i = 0;
                while (true) {
                    if (i >= linkedList.size()) {
                        break;
                    }
                    C81415h0 h0Var = linkedList.get(i);
                    if (h0Var instanceof C81413f0) {
                        this.f251599a = (C81413f0) h0Var;
                        break;
                    }
                    i++;
                }
            } else {
                throw new IllegalStateException("getFlattenFileSystem not LuggageFileSystemRegistry");
            }
        }
        C81413f0 f0Var = this.f251599a;
        String str = null;
        if (f0Var != null) {
            C81433r0 e = f0Var.f238949g.mo113718e(gVar.optString("path"));
            if (e != null) {
                str = e.f238978e;
            }
        } else {
            Log.m105920e("MicroMsg.GetFullPathOfFlatFSSync", "getFlattenFileSystem null");
        }
        Log.m105919d("MicroMsg.GetFullPathOfFlatFSSync", "path:%s fullPath:%s", gVar.optString("path"), str);
        HashMap hashMap = new HashMap();
        hashMap.put("fullPath", str);
        return cVar.mo120516c(hashMap);
    }
}
