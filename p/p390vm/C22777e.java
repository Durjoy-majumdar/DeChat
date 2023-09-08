package p390vm;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.pluginsdk.model.C19444f1;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C19568o0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;
import java.util.HashSet;
import p262wm.C22923f;
import vd3.C22744b0;
import vd3.C22751q;

@C86522b
/* renamed from: vm.e */
public class C22777e extends C86301e implements C22923f {
    /* renamed from: AT */
    public void mo35896AT(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        C19444f1.m20778r(context, str, str2, str3, str4, str5, str6);
    }

    /* renamed from: CW */
    public int mo35897CW(String str) {
        String[] strArr = C19444f1.f54906a;
        int i = 0;
        if (!C85875k4.m106211z()) {
            return C19444f1.m20775o(str, false);
        }
        String p = C19444f1.m20776p(str);
        int i2 = -1;
        while (true) {
            String[] strArr2 = C19444f1.f54906a;
            if (i >= 12) {
                break;
            }
            if (strArr2[i].equals(p)) {
                i2 = i;
            }
            i++;
        }
        return i2 != -1 ? C19444f1.f54915j[i2] : C0966R.raw.app_attach_file_icon_unknow_dark;
    }

    /* renamed from: Db */
    public boolean mo35898Db(Context context) {
        return C19444f1.m20777q(context);
    }

    /* renamed from: LV */
    public boolean mo35899LV(String str) {
        return ((HashSet) C19444f1.f54910e).contains(str);
    }

    public boolean Ot0(String str) {
        return C19444f1.m20773m(str);
    }

    public void Q40(Context context, String str, String str2, String str3, String str4, String str5, String str6, C22923f.C22924a aVar) {
        C19444f1.m20779s(context, str, str2, str3, str4, str5, str6, aVar);
    }

    /* renamed from: RU */
    public C22751q mo35902RU(Context context, String str, String str2, String str3, String str4, String str5, C19568o0 o0Var) {
        return new C22744b0(context, str, str2, str3, str4, str5, o0Var);
    }

    public boolean Rf0(String str, String str2) {
        return C19444f1.m20772l(str, str2);
    }

    /* renamed from: Ro */
    public String mo35904Ro() {
        String[] strArr = C19444f1.f54906a;
        return "com.tencent.mtt";
    }

    /* renamed from: dQ */
    public boolean mo35905dQ(String str, String str2) {
        boolean z;
        String[] strArr = C19444f1.f54909d;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                Log.m105925i("MicroMsg.QQBrowserHelper", "isSupportMimeType is false : mimeType:%s", str);
                z = false;
                break;
            } else if (strArr[i].equals(str)) {
                Log.m105925i("MicroMsg.QQBrowserHelper", "isSupportMimeType is true : mimeType:%s", str);
                z = true;
                break;
            } else {
                i++;
            }
        }
        return z && !str2.equals("rm");
    }

    public boolean g20(String str) {
        String[] strArr = C19444f1.f54906a;
        if (Util.isNullOrNil(str)) {
            return false;
        }
        return ((HashSet) C19444f1.f54908c).contains(str);
    }

    public int qd0(String str) {
        String p = C19444f1.m20776p(str);
        int i = 0;
        int i2 = -1;
        while (true) {
            String[] strArr = C19444f1.f54906a;
            if (i >= 12) {
                break;
            }
            if (strArr[i].equals(p)) {
                i2 = i;
            }
            i++;
        }
        return i2 != -1 ? C85875k4.m106211z() ? C19444f1.f54917l[i2] : C19444f1.f54916k[i2] : C85875k4.m106211z() ? C0966R.raw.app_attach_file_icon_simple_dark : C0966R.raw.app_attach_file_icon_simple;
    }

    /* renamed from: u8 */
    public int mo35908u8(String str) {
        return C19444f1.m20775o(str, false);
    }

    /* renamed from: zS */
    public boolean mo35909zS(String str) {
        String[] strArr = C19444f1.f54906a;
        if (Util.isNullOrNil(str)) {
            return false;
        }
        return C19444f1.f54907b.contains(str);
    }
}
