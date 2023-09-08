package wk2;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import j20.C117292a;
import java.util.HashMap;
import java.util.List;
import k20.C9556a;
import nj3.C76879j;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import xk2.C15805b;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: wk2.y */
public final class C15507y extends C15805b {

    /* renamed from: f */
    public static final C15507y f42051f = new C15507y();

    /* renamed from: g */
    public static final String f42052g = "startSendMail";

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        String str;
        C13855j jVar2 = jVar;
        C13851h1 h1Var2 = h1Var;
        C87412m.m108594g(jVar2, "env");
        C87412m.m108594g(h1Var2, "msg");
        String str2 = (String) h1Var2.f38983a.get("emailAddr");
        if (str2 == null) {
            str2 = "";
        }
        String obj = C112550d0.m153799i0(str2).toString();
        Log.m105924i("MicroMsg.JsApiStartSendMail", "ScanJsApi-Call doStartSendMail emailAddr: " + obj);
        if (obj == null || C112551y.m153811k(obj)) {
            Log.m105920e("MicroMsg.JsApiStartSendMail", "ScanJsApi-Call doStartSendMail param is empty");
            HashMap hashMap = new HashMap();
            hashMap.put("ret", "1");
            C13849g gVar = jVar2.f39001d;
            String str3 = h1Var2.f38990c;
            gVar.mo10774a(str3, h1Var2.f38996i + ":param invalid", hashMap);
        } else {
            List<String> U = C112550d0.m153785U(obj, new String[]{";"}, false, 0, 6, (Object) null);
            if (U.isEmpty()) {
                Log.m105920e("MicroMsg.JsApiStartSendMail", "ScanJsApi-Call doStartSendMail emailReceivers is empty");
                HashMap hashMap2 = new HashMap();
                hashMap2.put("ret", "1");
                C13849g gVar2 = jVar2.f39001d;
                String str4 = h1Var2.f38990c;
                gVar2.mo10774a(str4, h1Var2.f38996i + ":param invalid", hashMap2);
            } else {
                for (String str5 : U) {
                    Log.m105924i("MicroMsg.JsApiStartSendMail", "ScanJsApi-Call doStartSendMail emailReceiver:" + str5);
                }
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse("mailto:"));
                Object[] array = U.toArray(new String[0]);
                C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                intent.putExtra("android.intent.extra.EMAIL", (String[]) array);
                HashMap hashMap3 = new HashMap();
                try {
                    Context context = jVar2.f38998a;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/box/jsapi/JsApiStartSendMail", "doStartSendMail", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/plugin/scanner/box/jsapi/JsApiStartSendMail", "doStartSendMail", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    str = "ok";
                    hashMap3.put("ret", "0");
                } catch (ActivityNotFoundException e) {
                    Log.printErrStackTrace("MicroMsg.JsApiStartSendMail", e, "", new Object[0]);
                    C76879j.m92742m(jVar2.f38998a, C0966R.string.mde, C0966R.string.a3h, C15506x.f42050d);
                    hashMap3.put("ret", "1");
                    str = "no email app";
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.JsApiStartSendMail", e2, "", new Object[0]);
                    str = e2.getMessage();
                    if (str == null) {
                        str = "fail";
                    }
                    hashMap3.put("ret", "1");
                }
                C13849g gVar3 = jVar2.f39001d;
                String str6 = h1Var2.f38990c;
                gVar3.mo10774a(str6, h1Var2.f38996i + XVFSFile.PATH_SEPARATOR_CHAR + str, hashMap3);
            }
        }
        return true;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f42052g;
    }
}
