package p269xe;

import org.json.JSONObject;
import p1060we.C90970b;

/* renamed from: xe.g */
public class C91185g {

    /* renamed from: a */
    public int f261443a;

    /* renamed from: b */
    public String f261444b;

    /* renamed from: c */
    public String f261445c;

    /* renamed from: d */
    public JSONObject f261446d;

    /* renamed from: e */
    public C90970b f261447e;

    public C91185g() {
    }

    public String toString() {
        JSONObject jSONObject = this.f261446d;
        return String.format("tag[%s]type[%d];key[%s];content[%s]", new Object[]{this.f261444b, Integer.valueOf(this.f261443a), this.f261445c, jSONObject != null ? jSONObject.toString() : ""});
    }

    public C91185g(int i) {
        this.f261443a = i;
    }
}
