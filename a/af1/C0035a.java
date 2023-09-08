package af1;

import android.content.Context;
import com.tencent.p014mm.plugin.finder.view.sidebar.DraggableConstraintLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import nj3.C76912y0;
import yc3.C38992a;

/* renamed from: af1.a */
public final class C0035a implements C38992a {

    /* renamed from: a */
    public static final C0035a f42a = new C0035a();

    /* renamed from: a */
    public boolean mo38a(Context context, String[] strArr, String str) {
        if (Log.getLogLevel() > 1) {
            return false;
        }
        String str2 = strArr != null ? strArr[1] : null;
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != 111126) {
                if (hashCode != 113650) {
                    if (hashCode == 3445005 && str2.equals("pmsc")) {
                        if (MultiProcessMMKV.getMMKV("MMKV_KEY_EXPT_VALUE").getBoolean("MMKV_KEY_EXPT_PERMISSION_DIALOG", true)) {
                            C76912y0.makeText(context, (CharSequence) "正在使用旧版权限弹窗", 0).show();
                        } else {
                            C76912y0.makeText(context, (CharSequence) "正在使用新版权限弹窗", 0).show();
                        }
                    }
                } else if (str2.equals("sba")) {
                    int parseInt = Integer.parseInt(strArr[2]);
                    int i = DraggableConstraintLayout.f312947L;
                    DraggableConstraintLayout.f312947L = parseInt;
                }
            } else if (str2.equals("pms")) {
                boolean z = Integer.parseInt(strArr[2]) != 1;
                MultiProcessMMKV.getMMKV("MMKV_KEY_EXPT_VALUE").putBoolean("MMKV_KEY_EXPT_PERMISSION_DIALOG", z);
                if (z) {
                    C76912y0.makeText(context, (CharSequence) "使用旧版权限弹窗", 0).show();
                } else {
                    C76912y0.makeText(context, (CharSequence) "使用新版权限弹窗", 0).show();
                }
            }
        }
        return true;
    }
}
