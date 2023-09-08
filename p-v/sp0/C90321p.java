package sp0;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import sp0.C90280d;
import sp0.C90322q;

/* renamed from: sp0.p */
public class C90321p implements C90280d.C90281a {

    /* renamed from: a */
    public final /* synthetic */ String f259281a;

    /* renamed from: b */
    public final /* synthetic */ C90322q f259282b;

    public C90321p(C90322q qVar, String str) {
        this.f259282b = qVar;
        this.f259281a = str;
    }

    /* renamed from: a */
    public void mo114287a(JSONObject jSONObject) {
    }

    /* renamed from: b */
    public void mo114288b(int i, String str, int i2) {
    }

    /* renamed from: c */
    public void mo114289c(int i, long j, long j2) {
    }

    /* renamed from: d */
    public void mo114290d(int i, String str, String str2, int i2, long j, Map map) {
        if (i != -1) {
            synchronized (this.f259282b.f259291i) {
                Map<String, C90322q.C90324b> map2 = this.f259282b.f259291i;
                String str3 = this.f259281a;
                ((HashMap) map2).put(str3, new C90322q.C90324b(str2, str, str3, i2, j));
            }
        }
    }
}
