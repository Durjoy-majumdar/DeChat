package com.tencent.p014mm.plugin.websearch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import e83.C45556b;
import e83.C45558d;
import j20.C117292a;
import java.util.HashMap;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import rx3.C13601g;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.websearch.q */
public class C43471q {

    /* renamed from: a */
    public static int f117492a;

    /* renamed from: a */
    public static int m46977a(int i) {
        return m46983g(i).mo71078p0();
    }

    /* renamed from: b */
    public static String m46978b(int i) {
        return m46983g(i).mo71077o();
    }

    /* renamed from: c */
    public static String m46979c() {
        return NetStatusUtil.isWifi(MMApplicationContext.getContext()) ? "wifi" : NetStatusUtil.is4G(MMApplicationContext.getContext()) ? "4g" : NetStatusUtil.is3G(MMApplicationContext.getContext()) ? "3g" : NetStatusUtil.is2G(MMApplicationContext.getContext()) ? "2g" : !NetStatusUtil.isConnected(MMApplicationContext.getContext()) ? "fail" : "";
    }

    /* renamed from: d */
    public static boolean m46980d(Map<String, Object> map, String str, boolean z) {
        String f = m46982f(map, str);
        if (Util.isNullOrNil(f)) {
            return z;
        }
        try {
            if ("1".equals(f)) {
                return true;
            }
            if ("0".equals(f)) {
                return false;
            }
            return Boolean.valueOf(f).booleanValue();
        } catch (Exception unused) {
            return z;
        }
    }

    /* renamed from: e */
    public static int m46981e(Map<String, Object> map, String str, int i) {
        String f = m46982f(map, str);
        if (Util.isNullOrNil(f)) {
            return i;
        }
        try {
            return Integer.valueOf(f).intValue();
        } catch (Exception unused) {
            return i;
        }
    }

    /* renamed from: f */
    public static String m46982f(Map<String, Object> map, String str) {
        return (!map.containsKey(str) || map.get(str) == null) ? "" : map.get(str).toString();
    }

    /* renamed from: g */
    public static C45556b m46983g(int i) {
        C13601g gVar = C45558d.f123238a;
        return (C45556b) ((HashMap) ((C36570n) C45558d.f123238a).getValue()).get(Integer.valueOf(i));
    }

    /* renamed from: h */
    public static boolean m46984h(int i) {
        Log.m105925i("MicroMsg.WebSearch.WebSearchApiLogic", "isFTSH5TemplateAvail exportType:%d, use search default.", Integer.valueOf(i));
        return m46983g(i).mo71060j();
    }

    /* renamed from: i */
    public static void m46985i(Context context, String str, Intent intent) {
        if (intent == null) {
            try {
                intent = new Intent();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.WebSearch.WebSearchApiLogic", "Class Not Found when startActivity %s", e);
                return;
            }
        }
        String str2 = MMApplicationContext.getSourcePackageName() + ".plugin.topstory";
        if (str.startsWith(".")) {
            str = str2 + str;
        }
        intent.setClassName(MMApplicationContext.getPackageName(), str);
        Class.forName(str, false, context.getClassLoader());
        if (context instanceof Activity) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/websearch/WebSearchApiLogic", "startTopStoryActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/websearch/WebSearchApiLogic", "startTopStoryActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        intent.addFlags(268435456);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(intent);
        C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/mm/plugin/websearch/WebSearchApiLogic", "startTopStoryActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar2.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/websearch/WebSearchApiLogic", "startTopStoryActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: j */
    public static void m46986j(Context context, String str, Intent intent, int i) {
        if (intent == null) {
            try {
                intent = new Intent();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.WebSearch.WebSearchApiLogic", "Class Not Found when startActivity %s", e);
                return;
            }
        }
        String str2 = MMApplicationContext.getSourcePackageName() + ".plugin.topstory";
        if (str.startsWith(".")) {
            str = str2 + str;
        }
        intent.setClassName(MMApplicationContext.getPackageName(), str);
        Class.forName(str, false, context.getClassLoader());
        if (context instanceof Activity) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            aVar.mo10233c(intent);
            C117292a.m165364j((Activity) context, aVar.mo10232b(), "com/tencent/mm/plugin/websearch/WebSearchApiLogic", "startTopStoryActivityForResult", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
    }

    /* renamed from: k */
    public static String m46987k(Map<String, ? extends Object> map) {
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry next : map.entrySet()) {
            stringBuffer.append((String) next.getKey());
            stringBuffer.append("=");
            if (next.getValue() != null) {
                stringBuffer.append(next.getValue().toString());
            }
            stringBuffer.append("&");
        }
        return stringBuffer.substring(0, stringBuffer.length() - 1).toString();
    }
}
