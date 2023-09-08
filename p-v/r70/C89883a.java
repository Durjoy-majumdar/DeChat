package r70;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.xweb.IXWebBroadcastListener;
import f40.C86709a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r70.C89888c;
import zh3.C119118e;
import zh3.C91753f;
import zh3.e$$g;
import zt3.C119157j;

/* renamed from: r70.a */
public class C89883a implements C89888c.C89891c {

    /* renamed from: a */
    public static long f258331a;

    /* renamed from: r70.a$a */
    public class C89884a implements Runnable {
        public void run() {
            C89883a.f258331a = (long) Process.myTid();
        }
    }

    /* renamed from: r70.a$b */
    public class C89885b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ JSONObject f258332d;

        public C89885b(C89883a aVar, JSONObject jSONObject) {
            this.f258332d = jSONObject;
        }

        public void run() {
            Log.m105925i("MicroMsg.AnrReportListener", "[happen] %s", this.f258332d.toString());
        }
    }

    static {
        new Handler(Looper.getMainLooper()).post(new C89884a());
    }

    /* renamed from: a */
    public void mo124174a(C89888c.C89889a aVar) {
        String str = aVar.f261444b;
        String str2 = aVar.f261445c;
        JSONObject jSONObject = aVar.f261446d;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (str.equals("Trace")) {
            try {
                if (aVar.f261444b.equalsIgnoreCase("Trace_EvilMethod") && jSONObject.getString("detail").equalsIgnoreCase("ANR")) {
                    mo124175b(Util.safeParseLong(str2), Util.safeParseLong(jSONObject.getString("cost")), jSONObject);
                }
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.AnrReportListener", e, "", new Object[0]);
            } finally {
                Log.m105925i("MicroMsg.AnrReportListener", "[report] cost:%sms", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            }
        }
    }

    /* renamed from: b */
    public final void mo124175b(long j, long j2, JSONObject jSONObject) {
        JSONObject jSONObject2;
        C119118e eVar;
        SQLiteDatabase sQLiteDatabase;
        int i;
        String str;
        long j3;
        JSONObject jSONObject3;
        int i2;
        long j4;
        long j5 = j2;
        JSONObject jSONObject4 = jSONObject;
        if (C86709a0.m107522a()) {
            C91753f fVar = C86709a0.m107535s().f251811i;
            if (fVar == null || (eVar = fVar.f262815b) == null) {
                jSONObject2 = jSONObject4;
                Log.m105928w("MicroMsg.AnrReportListener", "sqliteDB is null!");
            } else {
                eVar.getClass();
                e$$g e__g = C119118e.f356733m;
                synchronized (e__g) {
                    sQLiteDatabase = e__g.f262810a;
                    i = e__g.f262811b;
                    str = e__g.f262812c;
                    j3 = e__g.f262813d;
                }
                Log.m105925i("MicroMsg.AnrReportListener", "[happen] threadStatus:%s sql:%s time:%s db:%s", Integer.valueOf(i), str, Long.valueOf(j3), sQLiteDatabase);
                if (sQLiteDatabase != null) {
                    long currentTimeMillis = (System.currentTimeMillis() - j5) - (SystemClock.uptimeMillis() - (j + j5));
                    JSONObject jSONObject5 = new JSONObject();
                    JSONObject dumpJSON = sQLiteDatabase.dumpJSON(false);
                    Log.m105925i("MicroMsg.AnrReportListener", "[happen] db raw json:%s", dumpJSON);
                    JSONArray jSONArray = dumpJSON.getJSONArray("availableNonPrimary");
                    long j6 = 0;
                    long j7 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < jSONArray.length()) {
                        JSONObject jSONObject6 = jSONArray.getJSONObject(i3);
                        JSONArray jSONArray2 = jSONObject6.getJSONArray("operations");
                        JSONArray jSONArray3 = new JSONArray();
                        JSONObject jSONObject7 = dumpJSON;
                        jSONObject6.put("operations", jSONArray3);
                        if (i3 == 0 && i == 3) {
                            JSONObject jSONObject8 = new JSONObject();
                            jSONArray2.put(jSONObject8);
                            jSONObject8.put(IXWebBroadcastListener.STAGE_START, j3);
                            jSONObject3 = jSONObject5;
                            jSONObject8.put("duration", Math.min(j5, (currentTimeMillis + j5) - j3));
                            jSONObject8.put("tid", f258331a);
                            i2 = i;
                            Log.m105925i("MicroMsg.AnrReportListener", "[happen] add executing:%s", jSONObject8);
                        } else {
                            jSONObject3 = jSONObject5;
                            i2 = i;
                        }
                        int i5 = 0;
                        while (i5 < jSONArray2.length()) {
                            JSONObject jSONObject9 = jSONArray2.getJSONObject(i5);
                            long j8 = jSONObject9.getLong(IXWebBroadcastListener.STAGE_START);
                            long j9 = jSONObject9.getLong("duration");
                            long j15 = jSONObject9.getLong("tid");
                            if (currentTimeMillis <= j8) {
                                i4++;
                                j7 += j9;
                                j4 = j3;
                                if (((float) j9) >= ((float) j5) * 0.1f) {
                                    jSONArray3.put(jSONObject9);
                                }
                                if (f258331a == j15) {
                                    j6 += j9;
                                }
                            } else {
                                j4 = j3;
                            }
                            i5++;
                            j3 = j4;
                        }
                        long j16 = j3;
                        i3++;
                        dumpJSON = jSONObject7;
                        jSONObject5 = jSONObject3;
                        JSONObject jSONObject10 = jSONObject;
                        i = i2;
                    }
                    JSONObject jSONObject11 = jSONObject5;
                    JSONObject jSONObject12 = dumpJSON;
                    long j17 = j6;
                    boolean z = ((float) j17) >= ((float) j5) * 0.5f;
                    JSONObject jSONObject13 = jSONObject11;
                    jSONObject13.put("isDbBusy", z);
                    jSONObject2 = jSONObject;
                    jSONObject2.put("isDbBusy", z);
                    jSONObject13.put("execSqlCount", i4);
                    jSONObject13.put("mainThreadAllSqlCost", j17);
                    jSONObject13.put("allSqlCost", j7);
                    jSONObject13.put("detail", z ? jSONObject12 : new JSONObject());
                    jSONObject2.put("dbInfo", jSONObject13);
                } else {
                    jSONObject2 = jSONObject4;
                    Log.m105924i("MicroMsg.AnrReportListener", "has't any db operation in time!");
                }
            }
            ((C119157j) C119157j.f356862d).mo183875f(new C89885b(this, jSONObject2));
            return;
        }
    }
}
