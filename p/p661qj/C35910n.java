package p661qj;

import android.content.Context;
import com.tencent.p014mm.autogen.events.CleanWxFileIndexEvent;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import nj3.C76912y0;
import yc3.C38992a;

/* renamed from: qj.n */
public class C35910n implements C38992a {

    /* renamed from: a */
    public static final /* synthetic */ int f95801a = 0;

    static {
        C30650a.m39147b(new C35910n(), "//cleanwx", "//showfile", "//hidefile");
    }

    /* renamed from: a */
    public boolean mo38a(Context context, String[] strArr, String str) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_CALC_WX_SCAN_SHOW_FILE_INT;
        String str2 = strArr[0];
        str2.getClass();
        char c = 65535;
        switch (str2.hashCode()) {
            case -1470593122:
                if (str2.equals("//hidefile")) {
                    c = 0;
                    break;
                }
                break;
            case -35508263:
                if (str2.equals("//showfile")) {
                    c = 1;
                    break;
                }
                break;
            case 2113467658:
                if (str2.equals("//cleanwx")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                try {
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, 0);
                    C76912y0.makeText(context, (CharSequence) "hide file now.", 0).show();
                } catch (Exception unused) {
                }
                return true;
            case 1:
                try {
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
                    C76912y0.makeText(context, (CharSequence) "show file now.", 0).show();
                } catch (Exception unused2) {
                }
                return true;
            case 2:
                new CleanWxFileIndexEvent().publish();
                C76912y0.makeText(context, (CharSequence) "clean wx file index now.", 0).show();
                return true;
            default:
                return false;
        }
    }
}
