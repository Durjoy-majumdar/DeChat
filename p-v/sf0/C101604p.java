package sf0;

import com.tencent.p014mm.platformtools.ExportFileUtil;
import nd3.C88930e;

/* renamed from: sf0.p */
public class C101604p implements C88930e {

    /* renamed from: a */
    public final /* synthetic */ Runnable f297443a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f297444b;

    public C101604p(Runnable runnable, Runnable runnable2) {
        this.f297443a = runnable;
        this.f297444b = runnable2;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr[0] == 0) {
            ExportFileUtil.m117203a(this.f297443a);
        } else {
            ExportFileUtil.m117203a(this.f297444b);
        }
    }
}
