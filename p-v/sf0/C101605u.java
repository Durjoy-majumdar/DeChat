package sf0;

import android.content.Context;
import com.tencent.p014mm.platformtools.ExportFileUtil;
import java.util.concurrent.Callable;

/* renamed from: sf0.u */
public class C101605u implements Callable<String> {

    /* renamed from: d */
    public final /* synthetic */ Context f297445d;

    /* renamed from: e */
    public final /* synthetic */ String f297446e;

    public C101605u(Context context, String str) {
        this.f297445d = context;
        this.f297446e = str;
    }

    public Object call() {
        return ExportFileUtil.m117204b(this.f297445d, this.f297446e, (String) null);
    }
}
