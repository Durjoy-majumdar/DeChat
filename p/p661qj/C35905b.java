package p661qj;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.Arrays;
import k20.C9556a;
import yc3.C38992a;

/* renamed from: qj.b */
public class C35905b implements C38992a {

    /* renamed from: a */
    public static final /* synthetic */ int f95796a = 0;

    static {
        C30650a.m39147b(new C35905b(), "//diag");
    }

    /* renamed from: a */
    public boolean mo38a(Context context, String[] strArr, String str) {
        Log.m105919d("MicroMsg.DiagnosticCommand", "process Command : %s", Arrays.toString(strArr));
        Intent intent = new Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.performance.diagnostic.DiagnosticSettingsUI");
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/console/command/DiagnosticCommand", "processCommand", "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/console/command/DiagnosticCommand", "processCommand", "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
