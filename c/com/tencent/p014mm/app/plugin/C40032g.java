package com.tencent.p014mm.app.plugin;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import de3.C45330b;
import de3.C7304v;
import di3.C86301e;
import ei3.C86522b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import wc3.C15132d0;
import wd3.C53155r0;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.app.plugin.g */
public class C40032g extends C86301e implements C15132d0 {

    /* renamed from: com.tencent.mm.app.plugin.g$a */
    public class C40033a implements Comparator<C53155r0> {
        public C40033a(C40032g gVar) {
        }

        public int compare(Object obj, Object obj2) {
            int i = ((C53155r0) obj).f148310a;
            int i2 = ((C53155r0) obj2).f148310a;
            if (i < i2) {
                return -1;
            }
            return i > i2 ? 1 : 0;
        }
    }

    /* renamed from: U0 */
    public boolean mo14081U0(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return str.endsWith("@mailto@") || str.endsWith("@tel@");
    }

    /* renamed from: XP */
    public String mo14082XP(Context context, String str) {
        String str2;
        ArrayList<C53155r0> b = C45330b.m50241b(context, str);
        if (b.size() == 0) {
            return str;
        }
        Collections.sort(b, new C40033a(this));
        Iterator<C53155r0> it = b.iterator();
        String str3 = str;
        while (true) {
            if (!it.hasNext()) {
                str = str3;
                break;
            }
            C53155r0 next = it.next();
            String str4 = null;
            int i = next.f148310a;
            int i2 = next.f148311b;
            int i3 = next.f148313d;
            if (i3 == 1) {
                str4 = "<a href=\"%s\">%s</a>";
            } else if (i3 == 24) {
                str4 = "<a href=\"%s@mailto@\">%s</a>";
            } else if (i3 == 25) {
                str4 = "<a href=\"%s@tel@\">%s</a>";
            }
            if (str4 != null) {
                String str5 = next.f148312c;
                if (i3 != 1 || str5.startsWith(HttpWrapperBase.PROTOCAL_HTTP)) {
                    str2 = String.format(str4, new Object[]{str5.trim(), str5.trim()});
                } else {
                    str2 = String.format(str4, new Object[]{HttpWrapperBase.PROTOCAL_HTTP + str5.trim(), str5.trim()});
                }
                if (!Util.isNullOrNil(str3) && !Util.isNullOrNil(str2) && i < i2) {
                    StringBuilder sb = new StringBuilder();
                    try {
                        sb.append(str3.subSequence(0, i + 0));
                        sb.append(str2);
                        sb.append(str3.subSequence(i2 + 0, str3.length()));
                        str2.length();
                        str3 = sb.toString();
                    } catch (Exception e) {
                        Log.m105920e("MicroMsg.QrCodeURLHelper", e.getMessage());
                        str3 = "";
                    }
                }
                if (str3.length() == 0) {
                    break;
                }
            }
        }
        Log.m105919d("MicroMsg.QrCodeURLHelper", "formatQRString, result:%s", str);
        return str;
    }

    /* renamed from: hX */
    public boolean mo14083hX(Context context, String str, DialogInterface.OnDismissListener onDismissListener) {
        Log.m105919d("MicroMsg.QrCodeURLHelper", "tryHandleEvents, url:%s", str);
        if (Util.isNullOrNil(str)) {
            return false;
        }
        if (str.endsWith("@mailto@")) {
            C7304v.m7460d(context, str.substring(0, str.length() - 8), onDismissListener);
        } else if (!str.endsWith("@tel@")) {
            return false;
        } else {
            String substring = str.substring(0, str.length() - 5);
            Bundle bundle = new Bundle();
            bundle.putInt("fromScene", 3);
            C7304v.m7461e(context, substring, onDismissListener, bundle);
        }
        return true;
    }
}
