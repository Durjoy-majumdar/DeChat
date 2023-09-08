package bt1;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32224a;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C64477jr2;
import te3.C64591nr3;
import te3.zr4;
import uq1.C65433e;

/* renamed from: bt1.r */
public final class C54583r extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54585t f153042d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList<String> f153043e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54583r(C54585t tVar, ArrayList<String> arrayList) {
        super(0);
        this.f153042d = tVar;
        this.f153043e = arrayList;
    }

    public Object invoke() {
        String str;
        Bitmap decodeFile;
        Bitmap decodeFile2;
        this.f153042d.f153058n.clear();
        C54585t tVar = this.f153042d;
        ArrayList<String> arrayList = tVar.f153057m;
        if (arrayList != null) {
            ArrayList<String> arrayList2 = this.f153043e;
            int i = 0;
            for (T next : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    String str2 = (String) next;
                    C94554a j = C54585t.m61347j(tVar, str2);
                    C8477a0 a0Var = new C8477a0();
                    a0Var.f27482d = i == 0;
                    if (arrayList2 == null || arrayList2.size() <= i || Util.isNullOrNil(arrayList2.get(i))) {
                        if (tVar.f153059o.size() > i && tVar.f153059o.get(i) != null) {
                            C64477jr2 jr22 = tVar.f153059o.get(i);
                            C87412m.m108591d(jr22);
                            if (jr22.f183836j != null) {
                                C65433e eVar = C65433e.f188292a;
                                C64477jr2 jr23 = tVar.f153059o.get(i);
                                C87412m.m108591d(jr23);
                                zr4 zr4 = jr23.f183836j;
                                C87412m.m108591d(zr4);
                                str = eVar.mo89558i(str2, zr4);
                            }
                        }
                        Log.m105928w("Finder.PostVideoWidget", "no thumb & no thumbRect");
                        str = C65433e.f188292a.mo89557h(str2);
                    } else {
                        str = arrayList2.get(i);
                    }
                    if (Util.isNullOrNil(tVar.f153062r) && j != null) {
                        try {
                            C64591nr3 a = tVar.f153046B.mo75446a(str2, (long) j.f273443a);
                            if (!TextUtils.isEmpty(a.f184541d)) {
                                String str3 = a.f184541d;
                                C87412m.m108593f(str3, "coverInfo.coverUrl");
                                tVar.f153062r = str3;
                                String str4 = a.f184542e;
                                C87412m.m108593f(str4, "coverInfo.fullCoverUrl");
                                tVar.f153063s = str4;
                                tVar.f153064t = tVar.f153064t;
                                tVar.f153069y = a;
                                Log.m105928w("Finder.PostVideoWidget", "initNormalVideoLogic replace cover quality:" + tVar.f153064t + " path:" + tVar.f153062r);
                            }
                        } catch (Throwable th) {
                            Log.m105928w("Finder.PostVideoWidget", "initNormalVideoLogic replace cover e:" + th);
                        }
                    }
                    Util.isNullOrNil(tVar.f153062r);
                    if (a0Var.f27482d && !Util.isNullOrNil(tVar.f153062r) && C86013q1.m106450k(tVar.f153062r) && (decodeFile2 = BitmapUtil.decodeFile(tVar.f153062r)) != null) {
                        MMHandlerThread.postToMainThread(new C54579p(tVar, decodeFile2));
                        a0Var.f27482d = false;
                    }
                    if (!Util.isNullOrNil(str) && (decodeFile = BitmapUtil.decodeFile(str)) != null) {
                        tVar.f153058n.add(str);
                        Log.m105924i("Finder.PostVideoWidget", "add thumb file, index:" + i);
                        MMHandlerThread.postToMainThread(new C54581q(a0Var, tVar, decodeFile));
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        return C13598b0.f38549a;
    }
}
