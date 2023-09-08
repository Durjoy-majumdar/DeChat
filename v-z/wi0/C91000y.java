package wi0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p749xh.C38663sa;
import rx3.C13598b0;

/* renamed from: wi0.y */
public final class C91000y extends MAutoStorage<C38164x> {

    /* renamed from: e */
    public static final String[] f261084e = {MAutoStorage.getCreateSQLs(C38164x.f100831t, "WxaWeDataExptInfo")};

    /* renamed from: d */
    public final ISQLiteDatabase f261085d;

    /* renamed from: wi0.y$a */
    public enum C91001a {
        Unknown,
        Launch,
        WxaAttr,
        Polling
    }

    /* renamed from: wi0.y$b */
    public static final class C91002b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f261091d;

        /* renamed from: e */
        public final /* synthetic */ long f261092e;

        /* renamed from: f */
        public final /* synthetic */ String f261093f;

        /* renamed from: g */
        public final /* synthetic */ C91001a f261094g;

        /* renamed from: h */
        public final /* synthetic */ C38164x f261095h;

        /* renamed from: i */
        public final /* synthetic */ C91000y f261096i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91002b(String str, long j, String str2, C91001a aVar, C38164x xVar, C91000y yVar) {
            super(0);
            this.f261091d = str;
            this.f261092e = j;
            this.f261093f = str2;
            this.f261094g = aVar;
            this.f261095h = xVar;
            this.f261096i = yVar;
        }

        public Object invoke() {
            C38164x xVar = new C38164x();
            String str = this.f261091d;
            long j = this.f261092e;
            String str2 = this.f261093f;
            C91001a aVar = this.f261094g;
            xVar.field_appId = str;
            xVar.field_issueTimestampMs = j;
            xVar.field_exptInfo = str2;
            xVar.field_source = aVar.ordinal();
            C38164x xVar2 = this.f261095h;
            C91000y yVar = this.f261096i;
            boolean jo = xVar2 == null ? C91000y.super.insertNotify(xVar, true) : C91000y.super.updateNotify(xVar, true, "appId");
            String str3 = this.f261091d;
            long j2 = this.f261092e;
            C91001a aVar2 = this.f261094g;
            Log.m105924i("Luggage.WeDataExptInfoStorage", "doReplaceExptInfo, appId:" + str3 + ", issueTimestamp:" + j2 + ", source:" + aVar2 + ", ret:" + jo);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91000y(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C38164x.f100831t, "WxaWeDataExptInfo", C38663sa.f103716i);
        C87412m.m108594g(iSQLiteDatabase, "db");
        this.f261085d = iSQLiteDatabase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0167  */
    /* renamed from: Yt */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo125063Yt(java.lang.String r19, java.lang.String r20, wi0.C91000y.C91001a r21) {
        /*
            r18 = this;
            r9 = r19
            r5 = r20
            r10 = r21
            java.lang.String r0 = "source"
            gy3.C87412m.m108594g(r10, r0)
            r12 = 0
            if (r9 == 0) goto L_0x0018
            int r0 = r19.length()
            if (r0 != 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r0 = 0
            goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            java.lang.String r13 = "Luggage.WeDataExptInfoStorage"
            if (r0 == 0) goto L_0x0033
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "updateExptInfo with empty appId, source:"
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            return r12
        L_0x0033:
            if (r5 == 0) goto L_0x003e
            int r0 = r20.length()
            if (r0 != 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            r0 = 0
            goto L_0x003f
        L_0x003e:
            r0 = 1
        L_0x003f:
            java.lang.String r14 = "updateExptInfo("
            if (r0 == 0) goto L_0x005f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            r0.append(r9)
            java.lang.String r1 = ") with empty content, source:"
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            return r12
        L_0x005f:
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r0 = wi0.C38164x.f100831t
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            r0.append(r9)
            r1 = 41
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.lang.String r2 = "Luggage.WeDataExptInfo"
            r15 = -1
            java.lang.String r3 = "optIssueTimestamp("
            if (r5 != 0) goto L_0x0097
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = "), it is null"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            goto L_0x010d
        L_0x0097:
            boolean r0 = r5 instanceof wi0.C38164x
            if (r0 == 0) goto L_0x00a2
            r0 = r5
            wi0.x r0 = (wi0.C38164x) r0
            long r0 = r0.field_issueTimestampMs
        L_0x00a0:
            r7 = r0
            goto L_0x010e
        L_0x00a2:
            boolean r0 = r5 instanceof org.json.JSONObject
            java.lang.String r4 = "), json parse failed "
            if (r0 == 0) goto L_0x00ac
            r0 = r5
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            goto L_0x00b1
        L_0x00ac:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x00f4 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x00f4 }
        L_0x00b1:
            java.lang.String r6 = "expt_ext_info_json"
            java.lang.Object r0 = r0.get(r6)     // Catch:{ Exception -> 0x00d9 }
            boolean r6 = r0 instanceof java.lang.String     // Catch:{ Exception -> 0x00d9 }
            if (r6 == 0) goto L_0x00c3
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00d9 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x00d9 }
            goto L_0x00ca
        L_0x00c3:
            boolean r6 = r0 instanceof org.json.JSONObject     // Catch:{ Exception -> 0x00d9 }
            if (r6 == 0) goto L_0x00d1
            r6 = r0
            org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ Exception -> 0x00d9 }
        L_0x00ca:
            java.lang.String r0 = "issue_time"
            long r0 = r6.getLong(r0)     // Catch:{ Exception -> 0x00d9 }
            goto L_0x00a0
        L_0x00d1:
            org.json.JSONException r0 = new org.json.JSONException     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r6 = "expt_ext_info_json type error"
            r0.<init>(r6)     // Catch:{ Exception -> 0x00d9 }
            throw r0     // Catch:{ Exception -> 0x00d9 }
        L_0x00d9:
            r0 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            r6.append(r1)
            r6.append(r4)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            r0 = r15
            goto L_0x00a0
        L_0x00f4:
            r0 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            r6.append(r1)
            r6.append(r4)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x010d:
            r7 = r15
        L_0x010e:
            wi0.x r0 = r18.mo125064qq(r19)
            if (r0 == 0) goto L_0x0117
            long r1 = r0.field_issueTimestampMs
            goto L_0x0119
        L_0x0117:
            r1 = 0
        L_0x0119:
            r3 = r1
            wi0.y$b r17 = new wi0.y$b
            r1 = r17
            r2 = r19
            r11 = r3
            r3 = r7
            r5 = r20
            r6 = r21
            r9 = r7
            r7 = r0
            r8 = r18
            r1.<init>(r2, r3, r5, r6, r7, r8)
            int r0 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0167
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0136
            goto L_0x0167
        L_0x0136:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            r1 = r19
            r2 = r9
            r0.append(r1)
            java.lang.String r1 = "), issueTimestamp("
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ") vs oldIssueTimestamp:"
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = " check failed, source:"
            r0.append(r1)
            r1 = r21
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            r11 = 0
            goto L_0x016b
        L_0x0167:
            r17.invoke()
            r11 = 1
        L_0x016b:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: wi0.C91000y.mo125063Yt(java.lang.String, java.lang.String, wi0.y$a):boolean");
    }

    /* renamed from: qq */
    public final C38164x mo125064qq(String str) {
        C38164x xVar = new C38164x();
        xVar.field_appId = str;
        if (super.get(xVar, "appId")) {
            return xVar;
        }
        return null;
    }
}
