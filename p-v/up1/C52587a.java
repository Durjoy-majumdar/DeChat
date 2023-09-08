package up1;

import com.tencent.youtu.sdkkitframework.common.StateEvent;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import org.json.JSONObject;
import z04.C112551y;

/* renamed from: up1.a */
public final class C52587a {

    /* renamed from: a */
    public static final C52587a f146882a = new C52587a();

    /* renamed from: up1.a$a */
    public static final class C52588a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ JSONObject f146883d;

        /* renamed from: e */
        public final /* synthetic */ String f146884e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52588a(JSONObject jSONObject, String str) {
            super(0);
            this.f146883d = jSONObject;
            this.f146884e = str;
        }

        public Object invoke() {
            this.f146883d.put("result", 1);
            this.f146883d.put("cacheDbPath", this.f146884e);
            String jSONObject = this.f146883d.toString();
            C87412m.m108593f(jSONObject, "json.toString()");
            return C112551y.m153814n(jSONObject, ",", ";", false);
        }
    }

    /* renamed from: up1.a$b */
    public static final class C52589b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ JSONObject f146885d;

        /* renamed from: e */
        public final /* synthetic */ String f146886e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52589b(JSONObject jSONObject, String str) {
            super(0);
            this.f146885d = jSONObject;
            this.f146886e = str;
        }

        public Object invoke() {
            this.f146885d.put("result", 2);
            this.f146885d.put("cacheDbPath", this.f146886e);
            String jSONObject = this.f146885d.toString();
            C87412m.m108593f(jSONObject, "json.toString()");
            return C112551y.m153814n(jSONObject, ",", ";", false);
        }
    }

    /* renamed from: up1.a$c */
    public static final class C52590c extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ JSONObject f146887d;

        /* renamed from: e */
        public final /* synthetic */ String f146888e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52590c(JSONObject jSONObject, String str) {
            super(0);
            this.f146887d = jSONObject;
            this.f146888e = str;
        }

        public Object invoke() {
            this.f146887d.put("result", 3);
            this.f146887d.put("cacheDbPath", this.f146888e);
            String jSONObject = this.f146887d.toString();
            C87412m.m108593f(jSONObject, "json.toString()");
            return C112551y.m153814n(jSONObject, ",", ";", false);
        }
    }

    /* renamed from: up1.a$d */
    public static final class C52591d extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ JSONObject f146889d;

        /* renamed from: e */
        public final /* synthetic */ String f146890e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52591d(JSONObject jSONObject, String str) {
            super(0);
            this.f146889d = jSONObject;
            this.f146890e = str;
        }

        public Object invoke() {
            this.f146889d.put("result", -1);
            this.f146889d.put("cacheDbPath", this.f146890e);
            String jSONObject = this.f146889d.toString();
            C87412m.m108593f(jSONObject, "json.toString()");
            return C112551y.m153814n(jSONObject, ",", ";", false);
        }
    }

    /* renamed from: up1.a$e */
    public static final class C52592e extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ JSONObject f146891d;

        /* renamed from: e */
        public final /* synthetic */ String f146892e;

        /* renamed from: f */
        public final /* synthetic */ Throwable f146893f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52592e(JSONObject jSONObject, String str, Throwable th) {
            super(0);
            this.f146891d = jSONObject;
            this.f146892e = str;
            this.f146893f = th;
        }

        public Object invoke() {
            this.f146891d.put("result", -2);
            this.f146891d.put("cacheDbPath", this.f146892e);
            this.f146891d.put(StateEvent.Name.MESSAGE, this.f146893f.getMessage());
            String jSONObject = this.f146891d.toString();
            C87412m.m108593f(jSONObject, "json.toString()");
            return C112551y.m153814n(jSONObject, ",", ";", false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x013b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final zh3.C91753f mo73547a(java.lang.String r17, java.util.HashMap<java.lang.Integer, zh3.C91753f.C66827b> r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            java.lang.String r0 = "cacheDbPath"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "factories"
            gy3.C87412m.m108594g(r2, r0)
            zh3.f r5 = new zh3.f
            r5.<init>()
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x012a }
            boolean r0 = r5.mo125626p(r1, r2, r3, r4)     // Catch:{ all -> 0x0026 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0026 }
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x0026 }
            goto L_0x0031
        L_0x0026:
            r0 = move-exception
            kotlin.Result$Companion r6 = kotlin.Result.Companion     // Catch:{ all -> 0x012a }
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)     // Catch:{ all -> 0x012a }
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x012a }
        L_0x0031:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x012a }
            boolean r7 = kotlin.Result.m168120isFailureimpl(r0)     // Catch:{ all -> 0x012a }
            if (r7 == 0) goto L_0x003a
            r0 = r6
        L_0x003a:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x012a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x005c
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x012a }
            r0.<init>()     // Catch:{ all -> 0x012a }
            ft1.a r6 = ft1.C59319a.f169618b     // Catch:{ all -> 0x012a }
            java.lang.String r7 = "Finder.DbInitFixer"
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            up1.a$a r12 = new up1.a$a     // Catch:{ all -> 0x012a }
            r12.<init>(r0, r1)     // Catch:{ all -> 0x012a }
            r13 = 28
            r14 = 0
            o40.C11348f.C11349a.m11178b(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x012a }
            goto L_0x0120
        L_0x005c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x012a }
            r0.<init>()     // Catch:{ all -> 0x012a }
            r0.append(r1)     // Catch:{ all -> 0x012a }
            java.lang.String r6 = "-wal"
            r0.append(r6)     // Catch:{ all -> 0x012a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x012a }
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106447h(r0)     // Catch:{ all -> 0x012a }
            zh3.f r6 = new zh3.f     // Catch:{ all -> 0x012a }
            r6.<init>()     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x00bb
            boolean r0 = r6.mo125626p(r1, r2, r3, r4)     // Catch:{ all -> 0x0085 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0085 }
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x0085 }
            goto L_0x0090
        L_0x0085:
            r0 = move-exception
            kotlin.Result$Companion r5 = kotlin.Result.Companion     // Catch:{ all -> 0x0127 }
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)     // Catch:{ all -> 0x0127 }
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x0127 }
        L_0x0090:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0127 }
            boolean r7 = kotlin.Result.m168120isFailureimpl(r0)     // Catch:{ all -> 0x0127 }
            if (r7 == 0) goto L_0x0099
            r0 = r5
        L_0x0099:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0127 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0127 }
            if (r0 == 0) goto L_0x00bb
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0127 }
            r0.<init>()     // Catch:{ all -> 0x0127 }
            ft1.a r7 = ft1.C59319a.f169618b     // Catch:{ all -> 0x0127 }
            java.lang.String r8 = "Finder.DbInitFixer"
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            up1.a$b r13 = new up1.a$b     // Catch:{ all -> 0x0127 }
            r13.<init>(r0, r1)     // Catch:{ all -> 0x0127 }
            r14 = 28
            r15 = 0
            o40.C11348f.C11349a.m11178b(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0127 }
            r5 = r6
            goto L_0x0120
        L_0x00bb:
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106447h(r17)     // Catch:{ all -> 0x0127 }
            zh3.f r5 = new zh3.f     // Catch:{ all -> 0x0127 }
            r5.<init>()     // Catch:{ all -> 0x0127 }
            if (r0 == 0) goto L_0x0108
            boolean r0 = r5.mo125626p(r1, r2, r3, r4)     // Catch:{ all -> 0x00d3 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00d3 }
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x00d3 }
            goto L_0x00de
        L_0x00d3:
            r0 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch:{ all -> 0x012a }
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)     // Catch:{ all -> 0x012a }
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x012a }
        L_0x00de:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x012a }
            boolean r3 = kotlin.Result.m168120isFailureimpl(r0)     // Catch:{ all -> 0x012a }
            if (r3 == 0) goto L_0x00e7
            r0 = r2
        L_0x00e7:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x012a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x0108
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x012a }
            r0.<init>()     // Catch:{ all -> 0x012a }
            ft1.a r6 = ft1.C59319a.f169618b     // Catch:{ all -> 0x012a }
            java.lang.String r7 = "Finder.DbInitFixer"
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            up1.a$c r12 = new up1.a$c     // Catch:{ all -> 0x012a }
            r12.<init>(r0, r1)     // Catch:{ all -> 0x012a }
            r13 = 28
            r14 = 0
            o40.C11348f.C11349a.m11178b(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x012a }
            goto L_0x0120
        L_0x0108:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x012a }
            r0.<init>()     // Catch:{ all -> 0x012a }
            ft1.a r6 = ft1.C59319a.f169618b     // Catch:{ all -> 0x012a }
            java.lang.String r7 = "Finder.DbInitFixer"
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            up1.a$d r12 = new up1.a$d     // Catch:{ all -> 0x012a }
            r12.<init>(r0, r1)     // Catch:{ all -> 0x012a }
            r13 = 28
            r14 = 0
            o40.C11348f.C11349a.m11178b(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x012a }
        L_0x0120:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x012a }
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x012a }
            goto L_0x0135
        L_0x0127:
            r0 = move-exception
            r5 = r6
            goto L_0x012b
        L_0x012a:
            r0 = move-exception
        L_0x012b:
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
        L_0x0135:
            java.lang.Throwable r0 = kotlin.Result.m168117exceptionOrNullimpl(r0)
            if (r0 == 0) goto L_0x0153
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            ft1.a r6 = ft1.C59319a.f169618b
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            up1.a$e r12 = new up1.a$e
            r12.<init>(r2, r1, r0)
            r13 = 28
            r14 = 0
            java.lang.String r7 = "Finder.DbInitFixer"
            o40.C11348f.C11349a.m11178b(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0153:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: up1.C52587a.mo73547a(java.lang.String, java.util.HashMap, boolean, boolean):zh3.f");
    }
}
