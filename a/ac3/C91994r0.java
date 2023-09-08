package ac3;

import android.content.res.AssetManager;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ac3.r0 */
public final class C91994r0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C91994r0 f263346d = new C91994r0();

    public C91994r0() {
        super(0);
    }

    public Object invoke() {
        AssetManager assets = MMApplicationContext.getContext().getAssets();
        C91992q0 q0Var = C91992q0.f263331a;
        C87412m.m108593f(assets, TPMediaCompositionHelper.XML_TAG_ASSERT);
        StringBuilder sb = new StringBuilder();
        sb.append("xlab/");
        String str = C91992q0.f263336f;
        sb.append(str);
        String sb4 = sb.toString();
        StringBuilder sb5 = new StringBuilder();
        String str2 = C91992q0.f263332b;
        sb5.append(str2);
        sb5.append(XVFSFile.SEPARATOR_CHAR);
        sb5.append(str);
        q0Var.mo125829c(assets, sb4, sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        sb6.append("xlab/");
        String str3 = C91992q0.f263338h;
        sb6.append(str3);
        String sb7 = sb6.toString();
        q0Var.mo125829c(assets, sb7, str2 + XVFSFile.SEPARATOR_CHAR + str3);
        StringBuilder sb8 = new StringBuilder();
        sb8.append("xlab/");
        String str4 = C91992q0.f263339i;
        sb8.append(str4);
        String sb9 = sb8.toString();
        q0Var.mo125829c(assets, sb9, str2 + XVFSFile.SEPARATOR_CHAR + str4);
        return C13598b0.f38549a;
    }
}
