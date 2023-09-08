package p409b6;

import com.appaac.haptic.sync.VibrationPattern;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p288a6.C23610a;
import p392w5.C26424f;
import p424z5.C26654a;
import p424z5.C26655b;
import p424z5.C26656c;

/* renamed from: b6.b */
public class C23675b {

    /* renamed from: a */
    public long f67854a = -1;

    /* renamed from: b */
    public JSONArray f67855b = null;

    /* renamed from: c */
    public JSONObject f67856c = null;

    /* renamed from: d */
    public String f67857d;

    /* renamed from: e */
    public C23610a f67858e;

    /* renamed from: f */
    public C26654a f67859f;

    public C23675b(String str, C23610a aVar) {
        try {
            this.f67857d = str;
            JSONObject jSONObject = new JSONObject(str);
            try {
                this.f67856c = jSONObject.getJSONObject("Pattern");
            } catch (JSONException unused) {
                this.f67855b = jSONObject.getJSONArray("PatternList");
            }
        } catch (Exception e) {
            e.getMessage();
        }
        this.f67858e = aVar;
        int i = aVar.f67756h;
        if (i > 0 && aVar.f67755g != null) {
            String c = C26424f.m34021c(aVar.f67749a, i);
            if (c != null && c.length() > 0) {
                C23610a aVar2 = this.f67858e;
                this.f67859f = C26424f.m34024f(C26424f.m34021c(aVar2.f67749a, aVar2.f67756h));
            }
            if (C23610a.m28204a(this.f67859f)) {
                this.f67859f.f74226b.get(0).f74227a = this.f67858e.f67756h;
            }
        }
    }

    /* renamed from: a */
    public VibrationPattern mo37210a(long j) {
        long j2;
        if (j < 0) {
            return null;
        }
        this.f67854a = j;
        if (this.f67856c == null || this.f67855b != null) {
            if (this.f67855b != null) {
                C23610a aVar = this.f67858e;
                if (aVar == null || aVar.f67756h <= 0 || !C23610a.m28204a(this.f67859f) || ((long) this.f67859f.f74226b.get(0).f74227a) < j) {
                    int length = this.f67855b.length();
                    int i = 0;
                    while (i < length) {
                        JSONObject jSONObject = this.f67855b.getJSONObject(i);
                        try {
                            j2 = jSONObject.getLong("AbsoluteTime");
                        } catch (JSONException unused) {
                            j2 = jSONObject.getJSONObject("PatternDesc").getLong("AbsoluteTime");
                        }
                        if (j < j2) {
                            break;
                        }
                        i++;
                    }
                    if (i >= 1) {
                        JSONArray jSONArray = this.f67855b.getJSONObject(i - 1).getJSONArray("Pattern");
                        return new VibrationPattern("\"Pattern\":" + jSONArray.toString(), 1, 0);
                    }
                } else {
                    C26654a aVar2 = this.f67859f;
                    if (!C23610a.m28204a(aVar2)) {
                        return null;
                    }
                    C26654a aVar3 = new C26654a();
                    aVar3.f74225a = new C26655b();
                    ArrayList<C26656c> arrayList = new ArrayList<>();
                    aVar3.f74226b = arrayList;
                    arrayList.add(aVar2.f74226b.get(0));
                    StringBuilder sb = new StringBuilder(C26424f.m34020b(aVar3));
                    return new VibrationPattern(sb.substring(sb.indexOf("\"Pattern\""), sb.lastIndexOf("}", sb.lastIndexOf("}"))), 1, 0);
                }
            }
            return null;
        }
        return new VibrationPattern("\"Pattern\":" + this.f67856c.toString(), 1, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r5 = r5.getJSONObject("PatternDesc").getLong("AbsoluteTime");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        r0.getMessage();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0033 A[ExcHandler: Exception (r0v2 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:3:0x0009] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo37211b() {
        /*
            r10 = this;
            java.lang.String r0 = "AbsoluteTime"
            org.json.JSONObject r1 = r10.f67856c
            r2 = -1
            if (r1 == 0) goto L_0x0009
            return r2
        L_0x0009:
            org.json.JSONArray r1 = r10.f67855b     // Catch:{ JSONException -> 0x0038, Exception -> 0x0033 }
            if (r1 == 0) goto L_0x003c
            int r1 = r1.length()     // Catch:{ JSONException -> 0x0038, Exception -> 0x0033 }
            r4 = 0
        L_0x0012:
            if (r4 >= r1) goto L_0x003c
            org.json.JSONArray r5 = r10.f67855b     // Catch:{ JSONException -> 0x0038, Exception -> 0x0033 }
            org.json.JSONObject r5 = r5.getJSONObject(r4)     // Catch:{ JSONException -> 0x0038, Exception -> 0x0033 }
            long r5 = r5.getLong(r0)     // Catch:{ JSONException -> 0x001f, Exception -> 0x0033 }
            goto L_0x0029
        L_0x001f:
            java.lang.String r6 = "PatternDesc"
            org.json.JSONObject r5 = r5.getJSONObject(r6)     // Catch:{ JSONException -> 0x0038, Exception -> 0x0033 }
            long r5 = r5.getLong(r0)     // Catch:{ JSONException -> 0x0038, Exception -> 0x0033 }
        L_0x0029:
            long r7 = r10.f67854a     // Catch:{ JSONException -> 0x0038, Exception -> 0x0033 }
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 >= 0) goto L_0x0030
            return r5
        L_0x0030:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x0033:
            r0 = move-exception
            r0.getMessage()
            goto L_0x003c
        L_0x0038:
            r0 = move-exception
            r0.getMessage()
        L_0x003c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p409b6.C23675b.mo37211b():long");
    }
}
