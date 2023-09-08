package rh3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import sx3.C64186f0;

/* renamed from: rh3.g */
public class C101383g {

    /* renamed from: l */
    public static final C101384a f296975l = new C101384a((C8480h) null);

    /* renamed from: a */
    public String f296976a = "";

    /* renamed from: b */
    public double f296977b;

    /* renamed from: c */
    public String f296978c = "";

    /* renamed from: d */
    public String f296979d = "";

    /* renamed from: e */
    public String f296980e = "";

    /* renamed from: f */
    public String f296981f = "";

    /* renamed from: g */
    public C101387h f296982g = new C101387h();

    /* renamed from: h */
    public C101382f f296983h;

    /* renamed from: i */
    public C101382f f296984i;

    /* renamed from: j */
    public C101382f f296985j;

    /* renamed from: k */
    public final ArrayList<C101382f> f296986k = new ArrayList<>();

    /* renamed from: rh3.g$a */
    public static final class C101384a {
        public C101384a(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo140867a(String str) {
            C87412m.m108594g(str, "packDir");
            try {
                if (!C86013q1.m106450k(str + "config.json")) {
                    return false;
                }
                int optInt = new JSONObject(C86013q1.m106432N(str + "config.json")).optInt("cache_version", 0);
                Log.m105924i("MicroMsg.StickerPack", "checkLocalCacheVersion: " + optInt + ", 2");
                if (optInt >= 2) {
                    return true;
                }
                C86013q1.m106445f(str);
                return false;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: rh3.g$b */
    public static final class C101385b extends C87413o implements C32226l<String, List<? extends C101382f>> {

        /* renamed from: d */
        public static final C101385b f296987d = new C101385b();

        public C101385b() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "path");
            String[] s = new C86009m1(str).mo119981s();
            if (s != null) {
                if (!(s.length == 0)) {
                    ArrayList arrayList = new ArrayList(s.length);
                    for (String str2 : s) {
                        C101382f fVar = new C101382f();
                        String str3 = str + str2 + XVFSFile.SEPARATOR_CHAR;
                        C87412m.m108594g(str3, "<set-?>");
                        fVar.f296972d = str3;
                        String str4 = fVar.f296972d + "config.json";
                        C87412m.m108594g(str4, "jsonFile");
                        try {
                            fVar.mo140863b(new JSONObject(C86013q1.m106432N(str4)));
                        } catch (Exception e) {
                            Log.printErrStackTrace("MicroMsg.BaseJsonObject", e, "", new Object[0]);
                        }
                        arrayList.add(fVar);
                    }
                    return arrayList;
                }
            }
            return C64186f0.f181907d;
        }
    }

    /* renamed from: rh3.g$c */
    public static final class C101386c extends C87413o implements C32227p<String, String, C101382f> {

        /* renamed from: d */
        public final /* synthetic */ C101383g f296988d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C101386c(C101383g gVar) {
            super(2);
            this.f296988d = gVar;
        }

        public Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            C87412m.m108594g(str, "type");
            C87412m.m108594g(str2, "path");
            C101382f fVar = new C101382f();
            C101383g gVar = this.f296988d;
            String str3 = gVar.f296976a;
            C87412m.m108594g(str3, "<set-?>");
            fVar.f296969a = str3;
            fVar.f296970b = gVar.f296977b;
            fVar.f296971c = str;
            fVar.f296972d = str2;
            return fVar;
        }
    }

    /* renamed from: a */
    public final boolean mo140864a() {
        return (this.f296983h == null && this.f296984i == null && this.f296985j == null && this.f296986k.size() <= 0) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e7 A[Catch:{ Exception -> 0x01ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x012d A[Catch:{ Exception -> 0x01ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0139 A[Catch:{ Exception -> 0x01ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0181 A[Catch:{ Exception -> 0x01ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x018b A[Catch:{ Exception -> 0x01ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo140865b(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.String r0 = "config.json"
            java.lang.String r1 = ""
            java.lang.String r2 = "packDir"
            gy3.C87412m.m108594g(r14, r2)
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ab }
            r3.<init>()     // Catch:{ Exception -> 0x01ab }
            r3.append(r14)     // Catch:{ Exception -> 0x01ab }
            r3.append(r0)     // Catch:{ Exception -> 0x01ab }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01ab }
            java.lang.String r3 = com.tencent.p014mm.vfs.C86013q1.m106432N(r3)     // Catch:{ Exception -> 0x01ab }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x01ab }
            r4.<init>(r3)     // Catch:{ Exception -> 0x01ab }
            java.lang.String r3 = "id"
            java.lang.String r3 = r4.getString(r3)     // Catch:{ Exception -> 0x01ab }
            java.lang.String r5 = "jsonObj.getString(KEY_ID)"
            gy3.C87412m.m108593f(r3, r5)     // Catch:{ Exception -> 0x01ab }
            r13.f296976a = r3     // Catch:{ Exception -> 0x01ab }
            java.lang.String r3 = "version"
            double r5 = r4.getDouble(r3)     // Catch:{ Exception -> 0x01ab }
            r13.f296977b = r5     // Catch:{ Exception -> 0x01ab }
            java.lang.String r3 = "subtitle"
            java.lang.String r3 = r4.optString(r3)     // Catch:{ Exception -> 0x01ab }
            java.lang.String r5 = "jsonObj.optString(KEY_SUBTITLE)"
            gy3.C87412m.m108593f(r3, r5)     // Catch:{ Exception -> 0x01ab }
            r13.f296979d = r3     // Catch:{ Exception -> 0x01ab }
            java.lang.String r3 = "subtitle_color"
            java.lang.String r3 = r4.optString(r3)     // Catch:{ Exception -> 0x01ab }
            java.lang.String r5 = "jsonObj.optString(KEY_SUBTITLE_COLOR)"
            gy3.C87412m.m108593f(r3, r5)     // Catch:{ Exception -> 0x01ab }
            r13.f296980e = r3     // Catch:{ Exception -> 0x01ab }
            java.lang.String r3 = "stroke_color"
            java.lang.String r3 = r4.optString(r3)     // Catch:{ Exception -> 0x01ab }
            java.lang.String r5 = "jsonObj.optString(KEY_SUBTITLE_STROKE_COLOR)"
            gy3.C87412m.m108593f(r3, r5)     // Catch:{ Exception -> 0x01ab }
            r13.f296981f = r3     // Catch:{ Exception -> 0x01ab }
            java.lang.String r3 = "face_track"
            java.lang.String r3 = r4.optString(r3)     // Catch:{ Exception -> 0x01ab }
            java.lang.String r5 = "background"
            java.lang.String r5 = r4.optString(r5)     // Catch:{ Exception -> 0x01ab }
            java.lang.String r6 = "foreground"
            java.lang.String r6 = r4.optString(r6)     // Catch:{ Exception -> 0x01ab }
            java.lang.String r7 = "addition"
            java.lang.String r4 = r4.optString(r7)     // Catch:{ Exception -> 0x01ab }
            r7 = 1
            if (r3 == 0) goto L_0x008b
            int r3 = r3.length()     // Catch:{ Exception -> 0x01ab }
            if (r3 != 0) goto L_0x0089
            goto L_0x008b
        L_0x0089:
            r3 = 0
            goto L_0x008c
        L_0x008b:
            r3 = 1
        L_0x008c:
            java.lang.String r8 = "MicroMsg.BaseJsonObject"
            java.lang.String r9 = "jsonFile"
            java.lang.String r10 = "<set-?>"
            if (r3 != 0) goto L_0x00d9
            rh3.f r3 = new rh3.f     // Catch:{ Exception -> 0x01ab }
            r3.<init>()     // Catch:{ Exception -> 0x01ab }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ab }
            r11.<init>()     // Catch:{ Exception -> 0x01ab }
            r11.append(r14)     // Catch:{ Exception -> 0x01ab }
            java.lang.String r12 = "face_track/"
            r11.append(r12)     // Catch:{ Exception -> 0x01ab }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x01ab }
            gy3.C87412m.m108594g(r11, r10)     // Catch:{ Exception -> 0x01ab }
            r3.f296972d = r11     // Catch:{ Exception -> 0x01ab }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ab }
            r11.<init>()     // Catch:{ Exception -> 0x01ab }
            java.lang.String r12 = r3.f296972d     // Catch:{ Exception -> 0x01ab }
            r11.append(r12)     // Catch:{ Exception -> 0x01ab }
            r11.append(r0)     // Catch:{ Exception -> 0x01ab }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x01ab }
            gy3.C87412m.m108594g(r11, r9)     // Catch:{ Exception -> 0x01ab }
            java.lang.String r11 = com.tencent.p014mm.vfs.C86013q1.m106432N(r11)     // Catch:{ Exception -> 0x00d1 }
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ Exception -> 0x00d1 }
            r12.<init>(r11)     // Catch:{ Exception -> 0x00d1 }
            r3.mo140863b(r12)     // Catch:{ Exception -> 0x00d1 }
            goto L_0x00d7
        L_0x00d1:
            r11 = move-exception
            java.lang.Object[] r12 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x01ab }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r11, r1, r12)     // Catch:{ Exception -> 0x01ab }
        L_0x00d7:
            r13.f296983h = r3     // Catch:{ Exception -> 0x01ab }
        L_0x00d9:
            if (r5 == 0) goto L_0x00e4
            int r3 = r5.length()     // Catch:{ Exception -> 0x01ab }
            if (r3 != 0) goto L_0x00e2
            goto L_0x00e4
        L_0x00e2:
            r3 = 0
            goto L_0x00e5
        L_0x00e4:
            r3 = 1
        L_0x00e5:
            if (r3 != 0) goto L_0x012b
            rh3.f r3 = new rh3.f     // Catch:{ Exception -> 0x01ab }
            r3.<init>()     // Catch:{ Exception -> 0x01ab }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ab }
            r5.<init>()     // Catch:{ Exception -> 0x01ab }
            r5.append(r14)     // Catch:{ Exception -> 0x01ab }
            java.lang.String r11 = "background/"
            r5.append(r11)     // Catch:{ Exception -> 0x01ab }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x01ab }
            gy3.C87412m.m108594g(r5, r10)     // Catch:{ Exception -> 0x01ab }
            r3.f296972d = r5     // Catch:{ Exception -> 0x01ab }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ab }
            r5.<init>()     // Catch:{ Exception -> 0x01ab }
            java.lang.String r11 = r3.f296972d     // Catch:{ Exception -> 0x01ab }
            r5.append(r11)     // Catch:{ Exception -> 0x01ab }
            r5.append(r0)     // Catch:{ Exception -> 0x01ab }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x01ab }
            gy3.C87412m.m108594g(r5, r9)     // Catch:{ Exception -> 0x01ab }
            java.lang.String r5 = com.tencent.p014mm.vfs.C86013q1.m106432N(r5)     // Catch:{ Exception -> 0x0123 }
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Exception -> 0x0123 }
            r11.<init>(r5)     // Catch:{ Exception -> 0x0123 }
            r3.mo140863b(r11)     // Catch:{ Exception -> 0x0123 }
            goto L_0x0129
        L_0x0123:
            r5 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x01ab }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r5, r1, r11)     // Catch:{ Exception -> 0x01ab }
        L_0x0129:
            r13.f296984i = r3     // Catch:{ Exception -> 0x01ab }
        L_0x012b:
            if (r6 == 0) goto L_0x0136
            int r3 = r6.length()     // Catch:{ Exception -> 0x01ab }
            if (r3 != 0) goto L_0x0134
            goto L_0x0136
        L_0x0134:
            r3 = 0
            goto L_0x0137
        L_0x0136:
            r3 = 1
        L_0x0137:
            if (r3 != 0) goto L_0x017d
            rh3.f r3 = new rh3.f     // Catch:{ Exception -> 0x01ab }
            r3.<init>()     // Catch:{ Exception -> 0x01ab }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ab }
            r5.<init>()     // Catch:{ Exception -> 0x01ab }
            r5.append(r14)     // Catch:{ Exception -> 0x01ab }
            java.lang.String r6 = "foreground/"
            r5.append(r6)     // Catch:{ Exception -> 0x01ab }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x01ab }
            gy3.C87412m.m108594g(r5, r10)     // Catch:{ Exception -> 0x01ab }
            r3.f296972d = r5     // Catch:{ Exception -> 0x01ab }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ab }
            r5.<init>()     // Catch:{ Exception -> 0x01ab }
            java.lang.String r6 = r3.f296972d     // Catch:{ Exception -> 0x01ab }
            r5.append(r6)     // Catch:{ Exception -> 0x01ab }
            r5.append(r0)     // Catch:{ Exception -> 0x01ab }
            java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x01ab }
            gy3.C87412m.m108594g(r0, r9)     // Catch:{ Exception -> 0x01ab }
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106432N(r0)     // Catch:{ Exception -> 0x0175 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x0175 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0175 }
            r3.mo140863b(r5)     // Catch:{ Exception -> 0x0175 }
            goto L_0x017b
        L_0x0175:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x01ab }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r1, r5)     // Catch:{ Exception -> 0x01ab }
        L_0x017b:
            r13.f296985j = r3     // Catch:{ Exception -> 0x01ab }
        L_0x017d:
            rh3.g$b r0 = rh3.C101383g.C101385b.f296987d     // Catch:{ Exception -> 0x01ab }
            if (r4 == 0) goto L_0x0189
            int r3 = r4.length()     // Catch:{ Exception -> 0x01ab }
            if (r3 != 0) goto L_0x0188
            goto L_0x0189
        L_0x0188:
            r7 = 0
        L_0x0189:
            if (r7 != 0) goto L_0x01b3
            java.util.ArrayList<rh3.f> r3 = r13.f296986k     // Catch:{ Exception -> 0x01ab }
            r3.clear()     // Catch:{ Exception -> 0x01ab }
            java.util.ArrayList<rh3.f> r3 = r13.f296986k     // Catch:{ Exception -> 0x01ab }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ab }
            r5.<init>()     // Catch:{ Exception -> 0x01ab }
            r5.append(r14)     // Catch:{ Exception -> 0x01ab }
            r5.append(r4)     // Catch:{ Exception -> 0x01ab }
            java.lang.String r14 = r5.toString()     // Catch:{ Exception -> 0x01ab }
            java.lang.Object r14 = r0.invoke(r14)     // Catch:{ Exception -> 0x01ab }
            java.util.Collection r14 = (java.util.Collection) r14     // Catch:{ Exception -> 0x01ab }
            r3.addAll(r14)     // Catch:{ Exception -> 0x01ab }
            goto L_0x01b3
        L_0x01ab:
            r14 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "MicroMsg.StickerPack"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r14, r1, r0)
        L_0x01b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rh3.C101383g.mo140865b(java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r11v2, types: [java.util.HashMap<java.lang.String, rh3.e>, java.util.Map, java.util.HashMap] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0304 A[Catch:{ Exception -> 0x0532 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03d9 A[SYNTHETIC, Splitter:B:120:0x03d9] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0442 A[Catch:{ Exception -> 0x0532 }, LOOP:5: B:123:0x043c->B:125:0x0442, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x04ab A[Catch:{ Exception -> 0x0532 }, LOOP:6: B:127:0x04a5->B:129:0x04ab, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0503 A[Catch:{ Exception -> 0x0532 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0245 A[Catch:{ Exception -> 0x0532 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo140866c(java.lang.String r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.String r2 = "version"
            java.lang.String r3 = "MicroMsg.StickerPack"
            java.lang.String r4 = ""
            java.lang.String r5 = "config.json"
            java.lang.String r6 = "packDir"
            gy3.C87412m.m108594g(r0, r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x053e }
            r7.<init>()     // Catch:{ Exception -> 0x053e }
            r7.append(r0)     // Catch:{ Exception -> 0x053e }
            r7.append(r5)     // Catch:{ Exception -> 0x053e }
            java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x053e }
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106432N(r0)     // Catch:{ Exception -> 0x053e }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x053a }
            r7.<init>(r0)     // Catch:{ Exception -> 0x053a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x053e }
            r0.<init>()     // Catch:{ Exception -> 0x053e }
            java.lang.String r8 = "parseFromPack: "
            r0.append(r8)     // Catch:{ Exception -> 0x053e }
            r0.append(r7)     // Catch:{ Exception -> 0x053e }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x053e }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ Exception -> 0x053e }
            double r8 = r7.getDouble(r2)     // Catch:{ Exception -> 0x053e }
            r1.f296977b = r8     // Catch:{ Exception -> 0x053e }
            java.lang.String r0 = "custom"
            org.json.JSONObject r0 = r7.optJSONObject(r0)     // Catch:{ Exception -> 0x053e }
            java.lang.String r8 = "stroke_color"
            java.lang.String r9 = "subtitle_color"
            java.lang.String r10 = "subtitle"
            if (r0 == 0) goto L_0x0078
            java.lang.String r11 = r0.optString(r10)     // Catch:{ Exception -> 0x053e }
            java.lang.String r12 = "custom.optString(KEY_SUBTITLE)"
            gy3.C87412m.m108593f(r11, r12)     // Catch:{ Exception -> 0x053e }
            r1.f296979d = r11     // Catch:{ Exception -> 0x053e }
            java.lang.String r11 = r0.optString(r9)     // Catch:{ Exception -> 0x053e }
            java.lang.String r12 = "custom.optString(KEY_SUBTITLE_COLOR)"
            gy3.C87412m.m108593f(r11, r12)     // Catch:{ Exception -> 0x053e }
            r1.f296980e = r11     // Catch:{ Exception -> 0x053e }
            java.lang.String r0 = r0.optString(r8)     // Catch:{ Exception -> 0x053e }
            java.lang.String r11 = "custom.optString(KEY_SUBTITLE_STROKE_COLOR)"
            gy3.C87412m.m108593f(r0, r11)     // Catch:{ Exception -> 0x053e }
            r1.f296981f = r0     // Catch:{ Exception -> 0x053e }
        L_0x0078:
            java.lang.String r0 = "params"
            org.json.JSONObject r0 = r7.getJSONObject(r0)     // Catch:{ Exception -> 0x053e }
            java.lang.String r7 = "elements"
            org.json.JSONArray r7 = r0.getJSONArray(r7)     // Catch:{ Exception -> 0x053e }
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ Exception -> 0x053e }
            r11.<init>()     // Catch:{ Exception -> 0x053e }
            java.util.HashMap r12 = new java.util.HashMap     // Catch:{ Exception -> 0x053e }
            r12.<init>()     // Catch:{ Exception -> 0x053e }
            java.util.HashMap r13 = new java.util.HashMap     // Catch:{ Exception -> 0x053e }
            r13.<init>()     // Catch:{ Exception -> 0x053e }
            java.util.HashMap r14 = new java.util.HashMap     // Catch:{ Exception -> 0x053e }
            r14.<init>()     // Catch:{ Exception -> 0x053e }
            java.util.HashMap r15 = new java.util.HashMap     // Catch:{ Exception -> 0x053e }
            r15.<init>()     // Catch:{ Exception -> 0x053e }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ Exception -> 0x053e }
            r6.<init>()     // Catch:{ Exception -> 0x053e }
            r16 = r3
            int r3 = r7.length()     // Catch:{ Exception -> 0x0538 }
            r17 = r4
            r18 = r5
            r4 = 0
        L_0x00ae:
            if (r4 >= r3) goto L_0x0105
            java.lang.String r5 = r7.getString(r4)     // Catch:{ Exception -> 0x0534 }
            r19 = r3
            org.json.JSONObject r3 = r0.getJSONObject(r5)     // Catch:{ Exception -> 0x0534 }
            r20 = r7
            rh3.e r7 = new rh3.e     // Catch:{ Exception -> 0x0534 }
            r7.<init>()     // Catch:{ Exception -> 0x0534 }
            r21 = r8
            java.lang.String r8 = "name"
            gy3.C87412m.m108593f(r5, r8)     // Catch:{ Exception -> 0x0534 }
            java.lang.String r8 = "elementObj"
            gy3.C87412m.m108593f(r3, r8)     // Catch:{ Exception -> 0x0534 }
            r7.mo140862b(r3)     // Catch:{ Exception -> 0x0534 }
            int r3 = r7.f296966d     // Catch:{ Exception -> 0x0534 }
            if (r3 == 0) goto L_0x00f9
            r8 = 1
            if (r3 == r8) goto L_0x00f5
            r8 = 2
            if (r3 == r8) goto L_0x00f1
            r8 = 3
            if (r3 == r8) goto L_0x00ed
            r8 = 4
            if (r3 == r8) goto L_0x00e9
            r8 = 5
            if (r3 == r8) goto L_0x00e5
            goto L_0x00fc
        L_0x00e5:
            r6.put(r5, r7)     // Catch:{ Exception -> 0x0534 }
            goto L_0x00fc
        L_0x00e9:
            r15.put(r5, r7)     // Catch:{ Exception -> 0x0534 }
            goto L_0x00fc
        L_0x00ed:
            r14.put(r5, r7)     // Catch:{ Exception -> 0x0534 }
            goto L_0x00fc
        L_0x00f1:
            r12.put(r5, r7)     // Catch:{ Exception -> 0x0534 }
            goto L_0x00fc
        L_0x00f5:
            r13.put(r5, r7)     // Catch:{ Exception -> 0x0534 }
            goto L_0x00fc
        L_0x00f9:
            r11.put(r5, r7)     // Catch:{ Exception -> 0x0534 }
        L_0x00fc:
            int r4 = r4 + 1
            r3 = r19
            r7 = r20
            r8 = r21
            goto L_0x00ae
        L_0x0105:
            r21 = r8
            java.lang.String r3 = "template_trans_set"
            org.json.JSONObject r0 = r0.optJSONObject(r3)     // Catch:{ Exception -> 0x0534 }
            if (r0 == 0) goto L_0x0115
            rh3.h r3 = r1.f296982g     // Catch:{ Exception -> 0x0534 }
            r3.mo140868b(r0)     // Catch:{ Exception -> 0x0534 }
        L_0x0115:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0534 }
            r3.<init>()     // Catch:{ Exception -> 0x0534 }
            java.lang.String r0 = "id"
            java.lang.String r4 = r1.f296976a     // Catch:{ Exception -> 0x0534 }
            org.json.JSONObject r0 = r3.put(r0, r4)     // Catch:{ Exception -> 0x0534 }
            double r4 = r1.f296977b     // Catch:{ Exception -> 0x0534 }
            org.json.JSONObject r0 = r0.put(r2, r4)     // Catch:{ Exception -> 0x0534 }
            java.lang.String r2 = "cache_version"
            r4 = 2
            org.json.JSONObject r0 = r0.put(r2, r4)     // Catch:{ Exception -> 0x0534 }
            java.lang.String r2 = r1.f296979d     // Catch:{ Exception -> 0x0534 }
            org.json.JSONObject r0 = r0.put(r10, r2)     // Catch:{ Exception -> 0x0534 }
            java.lang.String r2 = r1.f296980e     // Catch:{ Exception -> 0x0534 }
            org.json.JSONObject r0 = r0.put(r9, r2)     // Catch:{ Exception -> 0x0534 }
            java.lang.String r2 = r1.f296981f     // Catch:{ Exception -> 0x0534 }
            r4 = r21
            r0.put(r4, r2)     // Catch:{ Exception -> 0x0534 }
            rh3.g$c r2 = new rh3.g$c     // Catch:{ Exception -> 0x0534 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0534 }
            int r0 = r11.size()     // Catch:{ Exception -> 0x0534 }
            java.lang.String r4 = "obj.toJson().toString()"
            java.lang.String r5 = "MicroMsg.BaseJsonObject"
            java.lang.String r7 = "jsonFile"
            java.lang.String r8 = "this as java.lang.String).getBytes(charset)"
            if (r0 <= 0) goto L_0x0235
            java.lang.String r0 = "Sticker2D"
            java.lang.String r9 = "face_track/"
            java.lang.Object r9 = r2.invoke(r0, r9)     // Catch:{ Exception -> 0x0534 }
            r10 = r9
            rh3.f r10 = (rh3.C101382f) r10     // Catch:{ Exception -> 0x0534 }
            rh3.h r0 = r1.f296982g     // Catch:{ Exception -> 0x0534 }
            r10.getClass()     // Catch:{ Exception -> 0x0232 }
            r23 = r6
            java.lang.String r6 = "<set-?>"
            gy3.C87412m.m108594g(r0, r6)     // Catch:{ Exception -> 0x0232 }
            r10.f296973e = r0     // Catch:{ Exception -> 0x0232 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0534 }
            r0.<init>()     // Catch:{ Exception -> 0x0534 }
            java.lang.String r6 = r1.f296978c     // Catch:{ Exception -> 0x0534 }
            r0.append(r6)     // Catch:{ Exception -> 0x0534 }
            java.lang.String r6 = r10.f296972d     // Catch:{ Exception -> 0x0232 }
            r0.append(r6)     // Catch:{ Exception -> 0x0534 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0534 }
            com.tencent.p014mm.vfs.C86013q1.m106461v(r0)     // Catch:{ Exception -> 0x0534 }
            r10.f296974f = r11     // Catch:{ Exception -> 0x0232 }
            java.util.Set r0 = r11.entrySet()     // Catch:{ Exception -> 0x0534 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0534 }
        L_0x0191:
            boolean r6 = r0.hasNext()     // Catch:{ Exception -> 0x0534 }
            if (r6 == 0) goto L_0x01dc
            java.lang.Object r6 = r0.next()     // Catch:{ Exception -> 0x0534 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ Exception -> 0x0534 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0534 }
            r11.<init>()     // Catch:{ Exception -> 0x0534 }
            r19 = r0
            java.lang.String r0 = r1.f296978c     // Catch:{ Exception -> 0x0534 }
            r11.append(r0)     // Catch:{ Exception -> 0x0534 }
            java.lang.Object r0 = r6.getKey()     // Catch:{ Exception -> 0x0534 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0534 }
            r11.append(r0)     // Catch:{ Exception -> 0x0534 }
            java.lang.String r0 = r11.toString()     // Catch:{ Exception -> 0x0534 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0534 }
            r11.<init>()     // Catch:{ Exception -> 0x0534 }
            r20 = r15
            java.lang.String r15 = r1.f296978c     // Catch:{ Exception -> 0x0534 }
            r11.append(r15)     // Catch:{ Exception -> 0x0534 }
            java.lang.String r15 = r10.f296972d     // Catch:{ Exception -> 0x0534 }
            r11.append(r15)     // Catch:{ Exception -> 0x0534 }
            java.lang.Object r6 = r6.getKey()     // Catch:{ Exception -> 0x0534 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0534 }
            r11.append(r6)     // Catch:{ Exception -> 0x0534 }
            java.lang.String r6 = r11.toString()     // Catch:{ Exception -> 0x0534 }
            com.tencent.p014mm.vfs.C86013q1.m106462w(r0, r6)     // Catch:{ Exception -> 0x0534 }
            r0 = r19
            r15 = r20
            goto L_0x0191
        L_0x01dc:
            r20 = r15
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0534 }
            r0.<init>()     // Catch:{ Exception -> 0x0534 }
            java.lang.String r6 = r1.f296978c     // Catch:{ Exception -> 0x0534 }
            r0.append(r6)     // Catch:{ Exception -> 0x0534 }
            java.lang.String r6 = r10.f296972d     // Catch:{ Exception -> 0x0232 }
            r0.append(r6)     // Catch:{ Exception -> 0x0534 }
            r6 = r18
            r0.append(r6)     // Catch:{ Exception -> 0x0534 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0534 }
            gy3.C87412m.m108594g(r0, r7)     // Catch:{ Exception -> 0x0232 }
            org.json.JSONObject r11 = r10.mo33258a()     // Catch:{ Exception -> 0x0219 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0219 }
            gy3.C87412m.m108593f(r11, r4)     // Catch:{ Exception -> 0x0219 }
            java.nio.charset.Charset r15 = z04.C119027c.f356488a     // Catch:{ Exception -> 0x0219 }
            byte[] r11 = r11.getBytes(r15)     // Catch:{ Exception -> 0x0219 }
            gy3.C87412m.m108593f(r11, r8)     // Catch:{ Exception -> 0x0219 }
            int r15 = r11.length     // Catch:{ Exception -> 0x0219 }
            r18 = r14
            r14 = 0
            com.tencent.p014mm.vfs.C86013q1.m106438T(r0, r11, r14, r15)     // Catch:{ Exception -> 0x0217 }
            r11 = r17
            goto L_0x0224
        L_0x0217:
            r0 = move-exception
            goto L_0x021c
        L_0x0219:
            r0 = move-exception
            r18 = r14
        L_0x021c:
            r11 = 0
            java.lang.Object[] r14 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x0232 }
            r11 = r17
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r11, r14)     // Catch:{ Exception -> 0x0532 }
        L_0x0224:
            java.lang.String r0 = "face_track"
            java.lang.String r10 = r10.f296972d     // Catch:{ Exception -> 0x0532 }
            r3.put(r0, r10)     // Catch:{ Exception -> 0x0532 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x0532 }
            rh3.f r9 = (rh3.C101382f) r9     // Catch:{ Exception -> 0x0532 }
            r1.f296983h = r9     // Catch:{ Exception -> 0x0532 }
            goto L_0x023f
        L_0x0232:
            r0 = move-exception
            goto L_0x0535
        L_0x0235:
            r23 = r6
            r20 = r15
            r11 = r17
            r6 = r18
            r18 = r14
        L_0x023f:
            int r0 = r12.size()     // Catch:{ Exception -> 0x0532 }
            if (r0 <= 0) goto L_0x02fe
            java.lang.String r0 = "Segment"
            java.lang.String r9 = "background/"
            java.lang.Object r9 = r2.invoke(r0, r9)     // Catch:{ Exception -> 0x0532 }
            r10 = r9
            rh3.f r10 = (rh3.C101382f) r10     // Catch:{ Exception -> 0x0532 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0532 }
            r0.<init>()     // Catch:{ Exception -> 0x0532 }
            java.lang.String r14 = r1.f296978c     // Catch:{ Exception -> 0x0532 }
            r0.append(r14)     // Catch:{ Exception -> 0x0532 }
            java.lang.String r14 = r10.f296972d     // Catch:{ Exception -> 0x0532 }
            r0.append(r14)     // Catch:{ Exception -> 0x0532 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0532 }
            com.tencent.p014mm.vfs.C86013q1.m106461v(r0)     // Catch:{ Exception -> 0x0532 }
            r10.f296974f = r12     // Catch:{ Exception -> 0x0532 }
            java.util.Set r0 = r12.entrySet()     // Catch:{ Exception -> 0x0532 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0532 }
        L_0x0270:
            boolean r12 = r0.hasNext()     // Catch:{ Exception -> 0x0532 }
            if (r12 == 0) goto L_0x02b7
            java.lang.Object r12 = r0.next()     // Catch:{ Exception -> 0x0532 }
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch:{ Exception -> 0x0532 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0532 }
            r14.<init>()     // Catch:{ Exception -> 0x0532 }
            java.lang.String r15 = r1.f296978c     // Catch:{ Exception -> 0x0532 }
            r14.append(r15)     // Catch:{ Exception -> 0x0532 }
            java.lang.Object r15 = r12.getKey()     // Catch:{ Exception -> 0x0532 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x0532 }
            r14.append(r15)     // Catch:{ Exception -> 0x0532 }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x0532 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0532 }
            r15.<init>()     // Catch:{ Exception -> 0x0532 }
            r17 = r0
            java.lang.String r0 = r1.f296978c     // Catch:{ Exception -> 0x0532 }
            r15.append(r0)     // Catch:{ Exception -> 0x0532 }
            java.lang.String r0 = r10.f296972d     // Catch:{ Exception -> 0x0532 }
            r15.append(r0)     // Catch:{ Exception -> 0x0532 }
            java.lang.Object r0 = r12.getKey()     // Catch:{ Exception -> 0x0532 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0532 }
            r15.append(r0)     // Catch:{ Exception -> 0x0532 }
            java.lang.String r0 = r15.toString()     // Catch:{ Exception -> 0x0532 }
            com.tencent.p014mm.vfs.C86013q1.m106462w(r14, r0)     // Catch:{ Exception -> 0x0532 }
            r0 = r17
            goto L_0x0270
        L_0x02b7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0532 }
            r0.<init>()     // Catch:{ Exception -> 0x0532 }
            java.lang.String r12 = r1.f296978c     // Catch:{ Exception -> 0x0532 }
            r0.append(r12)     // Catch:{ Exception -> 0x0532 }
            java.lang.String r12 = r10.f296972d     // Catch:{ Exception -> 0x0532 }
            r0.append(r12)     // Catch:{ Exception -> 0x0532 }
            r0.append(r6)     // Catch:{ Exception -> 0x0532 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0532 }
            gy3.C87412m.m108594g(r0, r7)     // Catch:{ Exception -> 0x0532 }
            org.json.JSONObject r12 = r10.mo33258a()     // Catch:{ Exception -> 0x02ea }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x02ea }
            gy3.C87412m.m108593f(r12, r4)     // Catch:{ Exception -> 0x02ea }
            java.nio.charset.Charset r14 = z04.C119027c.f356488a     // Catch:{ Exception -> 0x02ea }
            byte[] r12 = r12.getBytes(r14)     // Catch:{ Exception -> 0x02ea }
            gy3.C87412m.m108593f(r12, r8)     // Catch:{ Exception -> 0x02ea }
            int r14 = r12.length     // Catch:{ Exception -> 0x02ea }
            r15 = 0
            com.tencent.p014mm.vfs.C86013q1.m106438T(r0, r12, r15, r14)     // Catch:{ Exception -> 0x02ea }
            goto L_0x02f1
        L_0x02ea:
            r0 = move-exception
            r12 = 0
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0532 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r11, r14)     // Catch:{ Exception -> 0x0532 }
        L_0x02f1:
            java.lang.String r0 = "background"
            java.lang.String r10 = r10.f296972d     // Catch:{ Exception -> 0x0532 }
            r3.put(r0, r10)     // Catch:{ Exception -> 0x0532 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x0532 }
            rh3.f r9 = (rh3.C101382f) r9     // Catch:{ Exception -> 0x0532 }
            r1.f296984i = r9     // Catch:{ Exception -> 0x0532 }
        L_0x02fe:
            int r0 = r13.size()     // Catch:{ Exception -> 0x0532 }
            if (r0 <= 0) goto L_0x03b9
            java.lang.String r0 = "StickerFixed"
            java.lang.String r9 = "foreground/"
            java.lang.Object r9 = r2.invoke(r0, r9)     // Catch:{ Exception -> 0x0532 }
            r10 = r9
            rh3.f r10 = (rh3.C101382f) r10     // Catch:{ Exception -> 0x0532 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0532 }
            r0.<init>()     // Catch:{ Exception -> 0x0532 }
            java.lang.String r12 = r1.f296978c     // Catch:{ Exception -> 0x0532 }
            r0.append(r12)     // Catch:{ Exception -> 0x0532 }
            java.lang.String r12 = r10.f296972d     // Catch:{ Exception -> 0x0532 }
            r0.append(r12)     // Catch:{ Exception -> 0x0532 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0532 }
            com.tencent.p014mm.vfs.C86013q1.m106461v(r0)     // Catch:{ Exception -> 0x0532 }
            r10.f296974f = r13     // Catch:{ Exception -> 0x0532 }
            java.util.Set r0 = r13.entrySet()     // Catch:{ Exception -> 0x0532 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0532 }
        L_0x032f:
            boolean r12 = r0.hasNext()     // Catch:{ Exception -> 0x0532 }
            if (r12 == 0) goto L_0x0372
            java.lang.Object r12 = r0.next()     // Catch:{ Exception -> 0x0532 }
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch:{ Exception -> 0x0532 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0532 }
            r13.<init>()     // Catch:{ Exception -> 0x0532 }
            java.lang.String r14 = r1.f296978c     // Catch:{ Exception -> 0x0532 }
            r13.append(r14)     // Catch:{ Exception -> 0x0532 }
            java.lang.Object r14 = r12.getKey()     // Catch:{ Exception -> 0x0532 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x0532 }
            r13.append(r14)     // Catch:{ Exception -> 0x0532 }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x0532 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0532 }
            r14.<init>()     // Catch:{ Exception -> 0x0532 }
            java.lang.String r15 = r1.f296978c     // Catch:{ Exception -> 0x0532 }
            r14.append(r15)     // Catch:{ Exception -> 0x0532 }
            java.lang.String r15 = r10.f296972d     // Catch:{ Exception -> 0x0532 }
            r14.append(r15)     // Catch:{ Exception -> 0x0532 }
            java.lang.Object r12 = r12.getKey()     // Catch:{ Exception -> 0x0532 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0532 }
            r14.append(r12)     // Catch:{ Exception -> 0x0532 }
            java.lang.String r12 = r14.toString()     // Catch:{ Exception -> 0x0532 }
            com.tencent.p014mm.vfs.C86013q1.m106462w(r13, r12)     // Catch:{ Exception -> 0x0532 }
            goto L_0x032f
        L_0x0372:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0532 }
            r0.<init>()     // Catch:{ Exception -> 0x0532 }
            java.lang.String r12 = r1.f296978c     // Catch:{ Exception -> 0x0532 }
            r0.append(r12)     // Catch:{ Exception -> 0x0532 }
            java.lang.String r12 = r10.f296972d     // Catch:{ Exception -> 0x0532 }
            r0.append(r12)     // Catch:{ Exception -> 0x0532 }
            r0.append(r6)     // Catch:{ Exception -> 0x0532 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0532 }
            gy3.C87412m.m108594g(r0, r7)     // Catch:{ Exception -> 0x0532 }
            org.json.JSONObject r7 = r10.mo33258a()     // Catch:{ Exception -> 0x03a5 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x03a5 }
            gy3.C87412m.m108593f(r7, r4)     // Catch:{ Exception -> 0x03a5 }
            java.nio.charset.Charset r4 = z04.C119027c.f356488a     // Catch:{ Exception -> 0x03a5 }
            byte[] r4 = r7.getBytes(r4)     // Catch:{ Exception -> 0x03a5 }
            gy3.C87412m.m108593f(r4, r8)     // Catch:{ Exception -> 0x03a5 }
            int r7 = r4.length     // Catch:{ Exception -> 0x03a5 }
            r12 = 0
            com.tencent.p014mm.vfs.C86013q1.m106438T(r0, r4, r12, r7)     // Catch:{ Exception -> 0x03a5 }
            goto L_0x03ac
        L_0x03a5:
            r0 = move-exception
            r4 = 0
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0532 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r11, r7)     // Catch:{ Exception -> 0x0532 }
        L_0x03ac:
            java.lang.String r0 = "foreground"
            java.lang.String r4 = r10.f296972d     // Catch:{ Exception -> 0x0532 }
            r3.put(r0, r4)     // Catch:{ Exception -> 0x0532 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x0532 }
            rh3.f r9 = (rh3.C101382f) r9     // Catch:{ Exception -> 0x0532 }
            r1.f296985j = r9     // Catch:{ Exception -> 0x0532 }
        L_0x03b9:
            java.util.ArrayList<rh3.f> r0 = r1.f296986k     // Catch:{ Exception -> 0x0532 }
            r0.clear()     // Catch:{ Exception -> 0x0532 }
            java.util.ArrayList<rh3.f> r0 = r1.f296986k     // Catch:{ Exception -> 0x0532 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0532 }
            int r5 = r18.size()     // Catch:{ Exception -> 0x0532 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0532 }
            java.util.Set r5 = r18.entrySet()     // Catch:{ Exception -> 0x0532 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x0532 }
        L_0x03d1:
            boolean r7 = r5.hasNext()     // Catch:{ Exception -> 0x0532 }
            java.lang.String r9 = "addition/"
            if (r7 == 0) goto L_0x0426
            java.lang.Object r7 = r5.next()     // Catch:{ Exception -> 0x0532 }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ Exception -> 0x0532 }
            java.lang.String r10 = "FaceDeformation"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0532 }
            r12.<init>()     // Catch:{ Exception -> 0x0532 }
            java.lang.String r13 = r1.f296978c     // Catch:{ Exception -> 0x0532 }
            r12.append(r13)     // Catch:{ Exception -> 0x0532 }
            r12.append(r9)     // Catch:{ Exception -> 0x0532 }
            java.lang.Object r9 = r7.getKey()     // Catch:{ Exception -> 0x0532 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0532 }
            r12.append(r9)     // Catch:{ Exception -> 0x0532 }
            java.lang.String r9 = r12.toString()     // Catch:{ Exception -> 0x0532 }
            java.lang.Object r9 = r2.invoke(r10, r9)     // Catch:{ Exception -> 0x0532 }
            r10 = r9
            rh3.f r10 = (rh3.C101382f) r10     // Catch:{ Exception -> 0x0532 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0532 }
            r12.<init>()     // Catch:{ Exception -> 0x0532 }
            java.lang.String r13 = r1.f296978c     // Catch:{ Exception -> 0x0532 }
            r12.append(r13)     // Catch:{ Exception -> 0x0532 }
            java.lang.Object r7 = r7.getKey()     // Catch:{ Exception -> 0x0532 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0532 }
            r12.append(r7)     // Catch:{ Exception -> 0x0532 }
            java.lang.String r7 = r12.toString()     // Catch:{ Exception -> 0x0532 }
            java.lang.String r10 = r10.f296972d     // Catch:{ Exception -> 0x0532 }
            com.tencent.p014mm.vfs.C86013q1.m106462w(r7, r10)     // Catch:{ Exception -> 0x0532 }
            rx3.b0 r7 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x0532 }
            rh3.f r9 = (rh3.C101382f) r9     // Catch:{ Exception -> 0x0532 }
            r4.add(r9)     // Catch:{ Exception -> 0x0532 }
            goto L_0x03d1
        L_0x0426:
            r0.addAll(r4)     // Catch:{ Exception -> 0x0532 }
            java.util.ArrayList<rh3.f> r0 = r1.f296986k     // Catch:{ Exception -> 0x0532 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0532 }
            int r5 = r20.size()     // Catch:{ Exception -> 0x0532 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0532 }
            java.util.Set r5 = r20.entrySet()     // Catch:{ Exception -> 0x0532 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x0532 }
        L_0x043c:
            boolean r7 = r5.hasNext()     // Catch:{ Exception -> 0x0532 }
            if (r7 == 0) goto L_0x048f
            java.lang.Object r7 = r5.next()     // Catch:{ Exception -> 0x0532 }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ Exception -> 0x0532 }
            java.lang.String r10 = "FaceLiquify"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0532 }
            r12.<init>()     // Catch:{ Exception -> 0x0532 }
            java.lang.String r13 = r1.f296978c     // Catch:{ Exception -> 0x0532 }
            r12.append(r13)     // Catch:{ Exception -> 0x0532 }
            r12.append(r9)     // Catch:{ Exception -> 0x0532 }
            java.lang.Object r13 = r7.getKey()     // Catch:{ Exception -> 0x0532 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x0532 }
            r12.append(r13)     // Catch:{ Exception -> 0x0532 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0532 }
            java.lang.Object r10 = r2.invoke(r10, r12)     // Catch:{ Exception -> 0x0532 }
            r12 = r10
            rh3.f r12 = (rh3.C101382f) r12     // Catch:{ Exception -> 0x0532 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0532 }
            r13.<init>()     // Catch:{ Exception -> 0x0532 }
            java.lang.String r14 = r1.f296978c     // Catch:{ Exception -> 0x0532 }
            r13.append(r14)     // Catch:{ Exception -> 0x0532 }
            java.lang.Object r7 = r7.getKey()     // Catch:{ Exception -> 0x0532 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0532 }
            r13.append(r7)     // Catch:{ Exception -> 0x0532 }
            java.lang.String r7 = r13.toString()     // Catch:{ Exception -> 0x0532 }
            java.lang.String r12 = r12.f296972d     // Catch:{ Exception -> 0x0532 }
            com.tencent.p014mm.vfs.C86013q1.m106462w(r7, r12)     // Catch:{ Exception -> 0x0532 }
            rx3.b0 r7 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x0532 }
            rh3.f r10 = (rh3.C101382f) r10     // Catch:{ Exception -> 0x0532 }
            r4.add(r10)     // Catch:{ Exception -> 0x0532 }
            goto L_0x043c
        L_0x048f:
            r0.addAll(r4)     // Catch:{ Exception -> 0x0532 }
            java.util.ArrayList<rh3.f> r0 = r1.f296986k     // Catch:{ Exception -> 0x0532 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0532 }
            int r5 = r23.size()     // Catch:{ Exception -> 0x0532 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0532 }
            java.util.Set r5 = r23.entrySet()     // Catch:{ Exception -> 0x0532 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x0532 }
        L_0x04a5:
            boolean r7 = r5.hasNext()     // Catch:{ Exception -> 0x0532 }
            if (r7 == 0) goto L_0x04f8
            java.lang.Object r7 = r5.next()     // Catch:{ Exception -> 0x0532 }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ Exception -> 0x0532 }
            java.lang.String r10 = "Sticker3D"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0532 }
            r12.<init>()     // Catch:{ Exception -> 0x0532 }
            java.lang.String r13 = r1.f296978c     // Catch:{ Exception -> 0x0532 }
            r12.append(r13)     // Catch:{ Exception -> 0x0532 }
            r12.append(r9)     // Catch:{ Exception -> 0x0532 }
            java.lang.Object r13 = r7.getKey()     // Catch:{ Exception -> 0x0532 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x0532 }
            r12.append(r13)     // Catch:{ Exception -> 0x0532 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0532 }
            java.lang.Object r10 = r2.invoke(r10, r12)     // Catch:{ Exception -> 0x0532 }
            r12 = r10
            rh3.f r12 = (rh3.C101382f) r12     // Catch:{ Exception -> 0x0532 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0532 }
            r13.<init>()     // Catch:{ Exception -> 0x0532 }
            java.lang.String r14 = r1.f296978c     // Catch:{ Exception -> 0x0532 }
            r13.append(r14)     // Catch:{ Exception -> 0x0532 }
            java.lang.Object r7 = r7.getKey()     // Catch:{ Exception -> 0x0532 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0532 }
            r13.append(r7)     // Catch:{ Exception -> 0x0532 }
            java.lang.String r7 = r13.toString()     // Catch:{ Exception -> 0x0532 }
            java.lang.String r12 = r12.f296972d     // Catch:{ Exception -> 0x0532 }
            com.tencent.p014mm.vfs.C86013q1.m106462w(r7, r12)     // Catch:{ Exception -> 0x0532 }
            rx3.b0 r7 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x0532 }
            rh3.f r10 = (rh3.C101382f) r10     // Catch:{ Exception -> 0x0532 }
            r4.add(r10)     // Catch:{ Exception -> 0x0532 }
            goto L_0x04a5
        L_0x04f8:
            r0.addAll(r4)     // Catch:{ Exception -> 0x0532 }
            java.util.ArrayList<rh3.f> r0 = r1.f296986k     // Catch:{ Exception -> 0x0532 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x0532 }
            if (r0 <= 0) goto L_0x0508
            java.lang.String r0 = "addition"
            r3.put(r0, r9)     // Catch:{ Exception -> 0x0532 }
        L_0x0508:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0532 }
            r0.<init>()     // Catch:{ Exception -> 0x0532 }
            java.lang.String r2 = r1.f296978c     // Catch:{ Exception -> 0x0532 }
            r0.append(r2)     // Catch:{ Exception -> 0x0532 }
            r0.append(r6)     // Catch:{ Exception -> 0x0532 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0532 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0532 }
            java.lang.String r3 = "saveJson.toString()"
            gy3.C87412m.m108593f(r2, r3)     // Catch:{ Exception -> 0x0532 }
            java.nio.charset.Charset r3 = z04.C119027c.f356488a     // Catch:{ Exception -> 0x0532 }
            byte[] r2 = r2.getBytes(r3)     // Catch:{ Exception -> 0x0532 }
            gy3.C87412m.m108593f(r2, r8)     // Catch:{ Exception -> 0x0532 }
            int r3 = r2.length     // Catch:{ Exception -> 0x0532 }
            r4 = 0
            com.tencent.p014mm.vfs.C86013q1.m106438T(r0, r2, r4, r3)     // Catch:{ Exception -> 0x0532 }
            goto L_0x054a
        L_0x0532:
            r0 = move-exception
            goto L_0x0542
        L_0x0534:
            r0 = move-exception
        L_0x0535:
            r11 = r17
            goto L_0x0542
        L_0x0538:
            r0 = move-exception
            goto L_0x0541
        L_0x053a:
            r0 = move-exception
            r16 = r3
            goto L_0x0541
        L_0x053e:
            r0 = move-exception
            r16 = r3
        L_0x0541:
            r11 = r4
        L_0x0542:
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r16
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r11, r2)
        L_0x054a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rh3.C101383g.mo140866c(java.lang.String):void");
    }
}
