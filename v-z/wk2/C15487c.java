package wk2;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import k20.C9556a;
import nj3.C76875f0;
import qo3.C77407n;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import xk2.C15805b;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: wk2.c */
public final class C15487c extends C15805b {

    /* renamed from: f */
    public static final C15487c f42014f = new C15487c();

    /* renamed from: g */
    public static final String f42015g = "addToAddressBook";

    /* renamed from: e */
    public static final void m14502e(C15487c cVar, Context context, String str) {
        cVar.getClass();
        Intent intent = new Intent("android.intent.action.INSERT_OR_EDIT", ContactsContract.Contacts.CONTENT_URI);
        intent.setType("vnd.android.cursor.item/person");
        intent.putExtra("phone", str);
        if (Util.isIntentAvailable(context, intent, false)) {
            try {
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/box/jsapi/JsApiAddToAddressBook", "phoneModifyContact", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/scanner/box/jsapi/JsApiAddToAddressBook", "phoneModifyContact", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.JsApiOpenDialPad", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        String[] strArr;
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        String str = (String) h1Var.f38983a.get("phoneNum");
        if (str == null) {
            str = "";
        }
        String obj = C112550d0.m153799i0(str).toString();
        Log.m105924i("MicroMsg.JsApiOpenDialPad", "ScanJsApi-Call doAddToAddressBook phoneNum: " + obj);
        boolean z = false;
        if (obj == null || C112551y.m153811k(obj)) {
            Log.m105920e("MicroMsg.JsApiOpenDialPad", "ScanJsApi-Call doAddToAddressBook param is empty");
            HashMap hashMap = new HashMap();
            hashMap.put("ret", "1");
            C13849g gVar = jVar.f39001d;
            String str2 = h1Var.f38990c;
            gVar.mo10774a(str2, h1Var.f38996i + ":param invalid", hashMap);
        } else {
            if (!mo14293f() || !Util.isIntentAvailable(MMApplicationContext.getContext(), new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI), false)) {
                strArr = mo14293f() ? new String[]{jVar.f38998a.getResources().getString(C0966R.string.mdf)} : new String[]{jVar.f38998a.getResources().getString(C0966R.string.mdg)};
            } else {
                strArr = jVar.f38998a.getResources().getStringArray(C0966R.array.f2588a8);
                C87412m.m108593f(strArr, "{\n            env.contex….phone_url_add)\n        }");
            }
            Context context = jVar.f38998a;
            LayoutInflater.from(context);
            C77407n nVar = new C77407n(context, 1, false);
            ArrayList arrayList = new ArrayList();
            new ArrayList();
            C15485a aVar = new C15485a(strArr);
            C15486b bVar = new C15486b(jVar, obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C76875f0 f0Var = (C76875f0) ((MenuItem) it.next());
                f0Var.f224728w = null;
                f0Var.f224729x = null;
            }
            arrayList.clear();
            ArrayList arrayList2 = new ArrayList();
            int length = aVar.f42011d.length;
            for (int i = 0; i < length; i++) {
                String str3 = aVar.f42011d[i];
                C76875f0 f0Var2 = new C76875f0(context, i, 0);
                f0Var2.f224717i = str3;
                arrayList2.add(f0Var2);
            }
            if (arrayList2.size() == 0) {
                z = true;
            }
            if (z) {
                Log.m105928w("MicroMsg.MMSubMenuHelper", "show, menu empty");
            } else {
                nVar.f225771i = aVar;
                nVar.f225782p = bVar;
                nVar.f225761d = null;
                nVar.f225725D = null;
                nVar.mo107573q();
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("ret", "0");
            C13849g gVar2 = jVar.f39001d;
            String str4 = h1Var.f38990c;
            gVar2.mo10774a(str4, h1Var.f38996i + ":ok", hashMap2);
        }
        return true;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f42015g;
    }

    /* renamed from: f */
    public final boolean mo14293f() {
        Context context = MMApplicationContext.getContext();
        Intent intent = new Intent("android.intent.action.INSERT");
        intent.setType("vnd.android.cursor.dir/contact");
        intent.putExtra("phone", "10086");
        return Util.isIntentAvailable(context, intent, false);
    }
}
