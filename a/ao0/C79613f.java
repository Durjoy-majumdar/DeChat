package ao0;

import java.util.List;

/* renamed from: ao0.f */
public class C79613f {

    /* renamed from: a */
    public String f233458a = "ok";

    /* renamed from: b */
    public List<C79612e> f233459b = null;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("mErrorMsg:");
        sb.append(this.f233458a);
        sb.append(" mWifiList:");
        List<C79612e> list = this.f233459b;
        if (list == null || list.size() <= 0) {
            sb.append("null:");
        } else {
            for (C79612e append : this.f233459b) {
                sb.append(" WiFiItem:");
                sb.append(append);
            }
        }
        return sb.toString();
    }
}
