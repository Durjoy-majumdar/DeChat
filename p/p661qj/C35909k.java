package p661qj;

import android.content.Context;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.IXWebBroadcastListener;
import p910lj.C76701a;
import sf0.C90188n0;
import yc3.C38992a;

/* renamed from: qj.k */
public class C35909k implements C38992a {

    /* renamed from: a */
    public static final /* synthetic */ int f95800a = 0;

    static {
        C30650a.m39147b(new C35909k(), "//warpgate");
    }

    /* renamed from: a */
    public boolean mo38a(Context context, String[] strArr, String str) {
        if (Log.getLogLevel() > 1) {
            return false;
        }
        if (strArr.length < 2) {
            return true;
        }
        String str2 = strArr[1];
        str2.getClass();
        char c = 65535;
        switch (str2.hashCode()) {
            case 3551:
                if (str2.equals("on")) {
                    c = 0;
                    break;
                }
                break;
            case 109935:
                if (str2.equals("off")) {
                    c = 1;
                    break;
                }
                break;
            case 3540994:
                if (str2.equals("stop")) {
                    c = 2;
                    break;
                }
                break;
            case 109757538:
                if (str2.equals(IXWebBroadcastListener.STAGE_START)) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                boolean z = C90188n0.f258933a;
                break;
            case 1:
                boolean z2 = C90188n0.f258933a;
                break;
            case 2:
                try {
                    Class.forName("com.tencent.mm.plugin.sl_warpgate.server.WarpGateHttpServer").getMethod("stopServer", new Class[0]).invoke((Object) null, new Object[0]);
                    C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "stop server", 1).show();
                    break;
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.WarpgateCommand", e, "", new Object[0]);
                    break;
                }
            case 3:
                int i = 8888;
                if (strArr.length >= 3) {
                    i = Util.getInt(strArr[2], 8888);
                }
                try {
                    Class.forName("com.tencent.mm.plugin.sl_warpgate.server.WarpGateHttpServer").getMethod("startServer", new Class[]{Integer.TYPE}).invoke((Object) null, new Object[]{Integer.valueOf(i)});
                    Context context2 = MMApplicationContext.getContext();
                    C76701a.makeText(context2, (CharSequence) "start server on " + i, 1).show();
                    break;
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.WarpgateCommand", e2, "", new Object[0]);
                    break;
                }
        }
        return true;
    }
}
