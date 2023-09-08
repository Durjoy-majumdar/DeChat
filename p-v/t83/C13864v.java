package t83;

import com.google.android.gms.common.Scopes;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: t83.v */
public class C13864v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f39026d;

    /* renamed from: e */
    public final /* synthetic */ C48590l f39027e;

    public C13864v(C48590l lVar, String str) {
        this.f39027e = lVar;
        this.f39026d = str;
    }

    public void run() {
        C13851h1 h1Var = new C13851h1();
        HashMap hashMap = new HashMap();
        h1Var.f38983a = hashMap;
        hashMap.put("username", this.f39026d);
        h1Var.f38991d = new JSONObject();
        h1Var.f38989b = "call";
        h1Var.f38990c = "";
        h1Var.f38996i = Scopes.PROFILE;
        this.f39027e.f130000e.add(h1Var);
        this.f39027e.mo73247n();
    }
}
