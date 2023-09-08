package p935cb;

import android.content.Context;
import com.tencent.magicbrush.C80301a;
import java.util.LinkedList;
import java.util.Queue;
import p1006mb.C88722b;

/* renamed from: cb.i */
public class C79980i {

    /* renamed from: a */
    public Context f234264a;

    /* renamed from: b */
    public C79977g f234265b;

    /* renamed from: c */
    public volatile C79973e f234266c;

    /* renamed from: d */
    public volatile int f234267d = 0;

    /* renamed from: e */
    public final Queue<String> f234268e = new LinkedList();

    /* renamed from: f */
    public C80301a f234269f;

    /* renamed from: g */
    public C79984d f234270g = new C79984d((C79979h) null);

    /* renamed from: cb.i$a */
    public class C79981a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f234271d;

        public C79981a(String str) {
            this.f234271d = str;
        }

        public void run() {
            if (C79980i.this.f234266c != null) {
                C79973e eVar = C79980i.this.f234266c;
                String str = this.f234271d;
                if (eVar.f234253g) {
                    eVar.mo110151b(str);
                    return;
                }
                if (eVar.f234252f == null) {
                    eVar.f234252f = new LinkedList<>();
                }
                eVar.f234252f.add(str);
            }
        }
    }

    /* renamed from: cb.i$b */
    public enum C79982b {
        INFO,
        ERROR
    }

    /* renamed from: cb.i$c */
    public interface C79983c {
    }

    /* renamed from: cb.i$d */
    public static class C79984d extends C88722b<Object> {
        public C79984d(C79979h hVar) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r6 != 3) goto L_0x001b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo110167a(p935cb.C79980i.C79982b r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "MicroMsg.GameInspector"
            if (r6 == 0) goto L_0x005a
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r1 == 0) goto L_0x000b
            goto L_0x005a
        L_0x000b:
            int r6 = r6.ordinal()
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            if (r6 == 0) goto L_0x001b
            if (r6 == r3) goto L_0x001f
            if (r6 == r2) goto L_0x001d
            if (r6 == r1) goto L_0x0020
        L_0x001b:
            r1 = 0
            goto L_0x0020
        L_0x001d:
            r1 = 2
            goto L_0x0020
        L_0x001f:
            r1 = 1
        L_0x0020:
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.lang.String r2 = "level"
            r6.put(r2, r1)     // Catch:{ JSONException -> 0x0051 }
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0051 }
            r1.<init>()     // Catch:{ JSONException -> 0x0051 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0051 }
            r2.<init>()     // Catch:{ JSONException -> 0x0051 }
            java.lang.String r3 = "wxClient: "
            r2.append(r3)     // Catch:{ JSONException -> 0x0051 }
            r2.append(r7)     // Catch:{ JSONException -> 0x0051 }
            java.lang.String r7 = r2.toString()     // Catch:{ JSONException -> 0x0051 }
            r1.put(r7)     // Catch:{ JSONException -> 0x0051 }
            java.lang.String r7 = "logs"
            r6.put(r7, r1)     // Catch:{ JSONException -> 0x0051 }
            java.lang.String r6 = r6.toString()
            r5.mo110168b(r6)
            goto L_0x0059
        L_0x0051:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.String r1 = "hy: vConsole json error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r6, r1, r7)
        L_0x0059:
            return
        L_0x005a:
            java.lang.String r6 = "hy: not valid console!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p935cb.C79980i.mo110167a(cb.i$b, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r5.f234266c != null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        r0 = r5.f234266c;
        r0.f234247a.getView().post(new p935cb.C79980i.C79981a(r5, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo110168b(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "MicroMsg.GameInspector"
            java.lang.String r1 = "hy: on js logged : %s"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r3)
            java.util.Queue<java.lang.String> r0 = r5.f234268e
            monitor-enter(r0)
            int r1 = r5.f234267d     // Catch:{ all -> 0x0034 }
            if (r1 == r2) goto L_0x001d
            java.util.Queue<java.lang.String> r1 = r5.f234268e     // Catch:{ all -> 0x0034 }
            java.util.LinkedList r1 = (java.util.LinkedList) r1     // Catch:{ all -> 0x0034 }
            r1.add(r6)     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            cb.e r0 = r5.f234266c
            if (r0 != 0) goto L_0x0023
            return
        L_0x0023:
            cb.e r0 = r5.f234266c
            cb.i$a r1 = new cb.i$a
            r1.<init>(r6)
            cb.k r6 = r0.f234247a
            android.view.View r6 = r6.getView()
            r6.post(r1)
            return
        L_0x0034:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p935cb.C79980i.mo110168b(java.lang.String):void");
    }
}
