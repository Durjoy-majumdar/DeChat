package p661qj;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.performance.jectl.JeVersion;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import yc3.C38992a;

/* renamed from: qj.f */
public class C35907f implements C38992a {

    /* renamed from: a */
    public static final /* synthetic */ int f95798a = 0;

    static {
        C30650a.m39147b(new C35907f(), "//jeversion");
    }

    /* renamed from: a */
    public boolean mo38a(Context context, String[] strArr, String str) {
        MMApplicationContext.getContext().startService(new Intent(MMApplicationContext.getContext(), JeVersion.JeService.class));
        return true;
    }
}
