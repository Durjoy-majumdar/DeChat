package sf0;

import android.content.Context;
import com.tencent.p014mm.platformtools.ExportFileUtil;
import java.util.concurrent.Callable;

/* renamed from: sf0.w */
public class C101607w implements Callable<String> {

    /* renamed from: d */
    public final /* synthetic */ Context f297450d;

    /* renamed from: e */
    public final /* synthetic */ String f297451e;

    public C101607w(Context context, String str) {
        this.f297450d = context;
        this.f297451e = str;
    }

    public Object call() {
        return ExportFileUtil.m117205c(this.f297450d, this.f297451e, (String) null);
    }
}
