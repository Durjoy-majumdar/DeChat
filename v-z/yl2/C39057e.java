package yl2;

import android.content.Context;
import android.os.Message;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import di3.C86312j;
import eb0.C31543z5;
import ei3.C86522b;
import f40.C86709a0;
import gy3.C87412m;
import i21.C33192f;
import i21.C60242i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import mu3.C109639a;
import org.json.JSONArray;
import org.json.JSONObject;
import p749xh.C66261f3;
import sx3.C64197v;
import zl2.C39379b;
import zl2.C39380c;
import zt3.C119157j;
import zt3.C119179t;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: yl2.e */
public final class C39057e extends C86301e implements MMHandler.Callback, C39379b {

    /* renamed from: d */
    public CopyOnWriteArrayList<C39053b> f105150d = new CopyOnWriteArrayList<>();

    /* renamed from: e */
    public final MMHandler f105151e = new MMHandler(C109639a.m148950a("mtimer"), (MMHandler.Callback) this);

    /* renamed from: f */
    public MultiProcessMMKV f105152f;

    /* renamed from: g */
    public C39061i f105153g;

    /* renamed from: h */
    public C33192f f105154h;

    /* renamed from: i */
    public volatile boolean f105155i;

    /* renamed from: j */
    public JSONArray f105156j = new JSONArray();

    /* JADX WARNING: type inference failed for: r5v0, types: [boolean] */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* renamed from: Wq */
    public boolean mo61898Wq(String str, int i, C39380c cVar, boolean z, boolean z2) {
        C39053b bVar;
        String str2;
        String str3;
        ? r5;
        int i2;
        boolean z3;
        long j;
        double d;
        long j2;
        int i3;
        String str4 = str;
        C39380c cVar2 = cVar;
        C87412m.m108594g(str4, "sessionId");
        C87412m.m108594g(cVar2, "callback");
        if (!this.f105155i) {
            return false;
        }
        Iterator<C39053b> it = this.f105150d.iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            bVar = it.next();
            if (C87412m.m108589b(bVar.f105140a, str4)) {
                break;
            }
        }
        if (bVar != null) {
            Log.m105921e("MicroMsg.MTimer", "set sessionId:%s is duplicate", str4);
            return false;
        }
        C39053b vx02 = vx0(str4, cVar2);
        if (vx02 == null) {
            C39061i yx02 = yx0();
            long c = (C31543z5.m39453c() + ((long) TimeZone.getDefault().getRawOffset())) % 86400000;
            long j3 = ((long) (3600000 * i)) + c;
            if (!z) {
                c = 0;
            } else if (j3 > 86400000) {
                j3 = 86400000;
            }
            int i4 = yx02.f105167e;
            if (c < ((long) yx02.f105168f) && ((long) i4) <= c) {
                str2 = "MicroMsg.MTimer";
                i2 = (int) ((c - ((long) i4)) / ((long) yx02.f105165c));
            } else {
                str2 = "MicroMsg.MTimer";
                i2 = -1;
            }
            int i5 = i2;
            while (true) {
                if (i2 == -1 || i5 >= yx02.f105166d.size()) {
                    z3 = false;
                } else {
                    i5++;
                    if (!yx02.f105166d.get(i2).f105161a) {
                        z3 = true;
                        break;
                    }
                    i2 = (i2 + 1) % yx02.f105166d.size();
                }
            }
            z3 = false;
            if (z3) {
                if (z) {
                    j2 = yx02.mo61909a() + ((long) yx02.f105166d.get(i2).f105162b);
                    d = Math.random();
                    i3 = yx02.f105165c;
                } else {
                    j2 = yx02.mo61909a() + 86400000 + ((long) yx02.f105166d.get(i2).f105162b);
                    d = Math.random();
                    i3 = yx02.f105165c;
                }
                j = j2 + ((long) ((int) (d * ((double) i3))));
            } else {
                j = ((long) ((int) (Math.random() * ((double) (j3 - c))))) + yx02.mo61909a() + c;
            }
            vx02 = new C39053b(str, i, cVar, j, z2);
        } else {
            str2 = "MicroMsg.MTimer";
        }
        this.f105150d.add(vx02);
        if (!this.f105155i) {
            str3 = str2;
            r5 = 1;
        } else {
            String jSONObject = vx02.mo61891a().toString();
            C87412m.m108593f(jSONObject, "task.toJson().toString()");
            MultiProcessMMKV xx02 = xx0();
            C87412m.m108591d(xx02);
            xx02.encode(vx02.f105140a, jSONObject);
            C33192f wx02 = wx0();
            if (wx02 != null) {
                wx02.Zr0("MTimerReport", "setTask", jSONObject, C60242i.APPEND);
            }
            C16051f.m14950a(this.f105156j, vx02.f105140a);
            this.f105156j.put(vx02.f105140a);
            MultiProcessMMKV xx03 = xx0();
            C87412m.m108591d(xx03);
            xx03.encode("_mtimer_list", this.f105156j.toString());
            r5 = 1;
            str3 = str2;
            Log.m105925i(str3, "saveKV sessionId:%s keyList:%d", vx02.f105140a, Integer.valueOf(this.f105156j.length()));
        }
        Object[] objArr = new Object[3];
        objArr[0] = str4;
        objArr[r5] = Long.valueOf(vx02.f105143d);
        objArr[2] = Integer.valueOf(this.f105150d.size());
        Log.m105925i(str3, "set sessionId:%s time:%d, sessionIdList:%d", objArr);
        return r5;
    }

    public boolean handleMessage(Message message) {
        char c;
        int i;
        int i2;
        int i3;
        Iterator it;
        long j;
        C39053b bVar;
        long j2;
        boolean z;
        boolean z2;
        long j3;
        double d;
        int i4;
        Message message2 = message;
        C87412m.m108594g(message2, "msg");
        int i5 = 2;
        char c2 = 1;
        if (message2.what != 1) {
            c = 0;
        } else if (!this.f105155i) {
            i = 2;
            c = 0;
            Object[] objArr = new Object[i];
            objArr[c] = 120000L;
            objArr[1] = toString();
            Log.m105925i("MicroMsg.MTimer", "handleMessage nextTime:%d, :%s", objArr);
            this.f105151e.sendEmptyMessageDelayed(1, 120000);
            return true;
        } else {
            long c3 = C31543z5.m39453c();
            Iterator<C39053b> it4 = this.f105150d.iterator();
            C87412m.m108593f(it4, "taskList.iterator()");
            ArrayList arrayList = new ArrayList();
            while (it4.hasNext()) {
                C39053b next = it4.next();
                if (next.f105143d <= c3) {
                    String jSONObject = next.mo61891a().put("currentTime", c3).toString();
                    C87412m.m108593f(jSONObject, "task.toJson().put(\"curre…, currentTime).toString()");
                    Object[] objArr2 = new Object[i5];
                    objArr2[0] = jSONObject;
                    objArr2[c2] = Long.valueOf(c3);
                    Log.m105925i("MicroMsg.MTimer", "executeTask taskStr:%s, currentTime:%d", objArr2);
                    C33192f wx02 = wx0();
                    if (wx02 != null) {
                        wx02.mo59013j8("MTimerReport", "executeTask", jSONObject);
                    }
                    C33192f wx03 = wx0();
                    if (wx03 != null) {
                        wx03.mo59013j8("MTimerReport", "executeTaskTime", Long.valueOf(c3));
                    }
                    long j4 = next.f105143d;
                    String str = next.f105140a;
                    C119179t tVar = C119157j.f356862d;
                    C39056d dVar = r6;
                    C39056d dVar2 = new C39056d(next, str, j4, c3);
                    ((C119157j) tVar).mo183875f(dVar);
                    arrayList.add(next);
                    i5 = 2;
                    c2 = 1;
                }
            }
            Log.m105925i("MicroMsg.MTimer", "postTask %d, executeList size:%d, task size:%d", Long.valueOf(c3), Integer.valueOf(arrayList.size()), Integer.valueOf(this.f105150d.size()));
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                C39053b bVar2 = (C39053b) it5.next();
                C87412m.m108594g(bVar2, "task");
                if (!this.f105155i) {
                    it = it5;
                } else {
                    long c4 = C31543z5.m39453c();
                    it = it5;
                    if (c4 - bVar2.f105143d >= ((long) yx0().f105165c)) {
                        C39061i yx02 = yx0();
                        long j5 = bVar2.f105143d;
                        bVar = bVar2;
                        long rawOffset = (((long) TimeZone.getDefault().getRawOffset()) + c4) % 86400000;
                        j = c4;
                        long rawOffset2 = (j5 + ((long) TimeZone.getDefault().getRawOffset())) % 86400000;
                        int i6 = 0;
                        boolean z3 = false;
                        while (true) {
                            if (!(((long) yx02.f105167e) <= rawOffset2 && rawOffset2 <= rawOffset) || i6 > yx02.f105166d.size()) {
                                break;
                            }
                            long j6 = rawOffset;
                            int i7 = (int) ((rawOffset2 - ((long) yx02.f105167e)) / ((long) yx02.f105165c));
                            if (i7 >= yx02.f105166d.size()) {
                                break;
                            }
                            if (i7 > -1 && i7 < yx02.f105166d.size()) {
                                yx02.f105166d.get(i7).f105161a = true;
                                z3 = true;
                            }
                            i6++;
                            rawOffset2 += (long) yx02.f105165c;
                            rawOffset = j6;
                        }
                        if (z3) {
                            yx02.f105164b.encode("time_zone", yx02.mo61910b());
                        }
                    } else {
                        bVar = bVar2;
                        j = c4;
                    }
                    C39061i yx03 = yx0();
                    C39053b bVar3 = bVar;
                    int i8 = bVar3.f105141b;
                    int parseLong = (int) ((Long.parseLong(yx03.f105163a) + C31543z5.m39453c()) % ((long) yx03.f105166d.size()));
                    Log.m105925i("MicroMsg.MTimer", "calcNextTime defaultIndex:%d", Integer.valueOf(parseLong));
                    if (i8 != 24) {
                        j2 = C31543z5.m39453c() + ((long) (i8 * 3600000));
                    } else {
                        int i9 = 0;
                        while (true) {
                            if (i9 >= yx03.f105166d.size()) {
                                z = false;
                                break;
                            }
                            i9++;
                            if (!yx03.f105166d.get(parseLong).f105161a) {
                                z = true;
                                break;
                            }
                            parseLong = (parseLong + 1) % yx03.f105166d.size();
                        }
                        if (z) {
                            long c5 = C31543z5.m39453c() + 86400000;
                            z2 = z;
                            j3 = (c5 - ((((long) TimeZone.getDefault().getRawOffset()) + c5) % 86400000)) + ((long) yx03.f105166d.get(parseLong).f105162b);
                            d = Math.random();
                            i4 = yx03.f105165c;
                        } else {
                            z2 = z;
                            long c6 = C31543z5.m39453c() + 86400000;
                            j3 = ((long) yx03.f105168f) + (c6 - ((((long) TimeZone.getDefault().getRawOffset()) + c6) % 86400000));
                            d = Math.random() * ((double) 3600) * ((double) 1000);
                            i4 = yx03.f105169g;
                        }
                        j2 = ((long) ((int) (d * ((double) i4)))) + j3;
                        Log.m105925i("MicroMsg.MTimer", "calcNextTime:%d, interval:%d, isFind:%b, index:%d, count:%d", Long.valueOf(j2), Integer.valueOf(i8), Boolean.valueOf(z2), Integer.valueOf(parseLong), Integer.valueOf(i9));
                    }
                    bVar3.f105143d = j2;
                    String jSONObject2 = bVar3.mo61891a().toString();
                    C87412m.m108593f(jSONObject2, "task.toJson().toString()");
                    MultiProcessMMKV xx02 = xx0();
                    C87412m.m108591d(xx02);
                    xx02.encode(bVar3.f105140a, jSONObject2);
                    StringBuilder sb = new StringBuilder();
                    sb.append(bVar3.mo61891a().put("nextInterval", (bVar3.f105143d - j) / ((long) 3600000)).toString());
                    sb.append('#');
                    C39061i yx04 = yx0();
                    StringBuffer stringBuffer = new StringBuffer();
                    Iterator<C39060h> it6 = yx04.f105166d.iterator();
                    int i15 = 0;
                    while (it6.hasNext()) {
                        C39060h next2 = it6.next();
                        int i16 = i15 + 1;
                        if (i15 >= 0) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append('[');
                            sb4.append(i15);
                            sb4.append(',');
                            sb4.append(next2.f105161a);
                            sb4.append(']');
                            stringBuffer.append(sb4.toString());
                            i15 = i16;
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                    String stringBuffer2 = stringBuffer.toString();
                    C87412m.m108593f(stringBuffer2, "sliceStr.toString()");
                    sb.append(stringBuffer2);
                    String sb5 = sb.toString();
                    C33192f wx04 = wx0();
                    if (wx04 != null) {
                        wx04.mo59013j8("MTimerReport", C66261f3.COL_UPDATETIME, sb5);
                    }
                    Log.m105925i("MicroMsg.MTimer", "updateState:%s", sb5);
                }
                it5 = it;
            }
            C39061i yx05 = yx0();
            long c7 = (C31543z5.m39453c() + ((long) TimeZone.getDefault().getRawOffset())) % 86400000;
            int i17 = yx05.f105167e;
            if (!(c7 <= ((long) yx05.f105168f) && ((long) i17) <= c7) || (i2 = (int) ((c7 - ((long) i17)) / ((long) yx05.f105165c))) <= -1 || i2 >= yx05.f105166d.size()) {
                i3 = 1;
                i2 = -1;
            } else {
                i3 = 1;
            }
            Object[] objArr3 = new Object[i3];
            c = 0;
            objArr3[0] = Integer.valueOf(i2);
            Log.m105925i("MicroMsg.MTimer", "canEnableZone index:%d", objArr3);
            if (i2 != -1) {
                yx05.f105166d.get(i2).f105161a = false;
                yx05.f105164b.encode("time_zone", yx05.mo61910b());
            }
        }
        i = 2;
        Object[] objArr4 = new Object[i];
        objArr4[c] = 120000L;
        objArr4[1] = toString();
        Log.m105925i("MicroMsg.MTimer", "handleMessage nextTime:%d, :%s", objArr4);
        this.f105151e.sendEmptyMessageDelayed(1, 120000);
        return true;
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        String i = C86709a0.m107523b().mo121111i();
        this.f105154h = (C33192f) C86312j.m106911c(C33192f.class);
        Log.m105925i("MicroMsg.MTimer", "onAccountInitialized uin:%s", i);
        this.f105152f = MultiProcessMMKV.getMMKV("mtimer_" + i);
        C87412m.m108593f(i, "uin");
        MultiProcessMMKV xx02 = xx0();
        C87412m.m108591d(xx02);
        this.f105153g = new C39061i(i, xx02);
        this.f105155i = true;
        C39061i yx02 = yx0();
        MultiProcessMMKV multiProcessMMKV = yx02.f105164b;
        String string = multiProcessMMKV.getString(yx02.f105163a + "_time_zone", "");
        if (Util.isNullOrNil(string)) {
            for (int i2 = yx02.f105167e; i2 <= yx02.f105168f; i2 += yx02.f105165c) {
                yx02.f105166d.add(new C39060h(false, i2));
            }
        } else if (string != null) {
            JSONArray jSONArray = new JSONArray(string);
            int length = jSONArray.length();
            for (int i3 = 0; i3 < length; i3++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i3);
                if (jSONObject != null) {
                    yx02.f105166d.add(new C39060h(jSONObject.getBoolean("disable"), jSONObject.getInt("time")));
                }
            }
        }
        MultiProcessMMKV xx03 = xx0();
        C87412m.m108591d(xx03);
        String string2 = xx03.getString("_mtimer_list", "");
        C33192f wx02 = wx0();
        if (wx02 != null) {
            C87412m.m108591d(string2);
            wx02.mo59013j8("MTimerReport", "initOfflineTask", string2);
        }
        Log.m105925i("MicroMsg.MTimer", "tastListJson:%s", string2);
        if (!Util.isNullOrNil(string2)) {
            try {
                ArrayList arrayList = new ArrayList();
                this.f105156j = new JSONArray(string2);
                JSONArray jSONArray2 = new JSONArray(string2);
                int length2 = jSONArray2.length();
                for (int i4 = 0; i4 < length2; i4++) {
                    String string3 = jSONArray2.getString(i4);
                    if (!Util.isNullOrNil(string3)) {
                        if (!arrayList.contains(string3)) {
                            arrayList.add(string3);
                            C87412m.m108593f(string3, "key");
                            C39053b vx02 = vx0(string3, (C39380c) null);
                            if (vx02 != null) {
                                Log.m105925i("MicroMsg.MTimer", "sessionId:%s, taskList add task", string3);
                                this.f105150d.add(vx02);
                                C33192f wx03 = wx0();
                                if (wx03 != null) {
                                    String jSONObject2 = vx02.mo61891a().toString();
                                    C87412m.m108593f(jSONObject2, "task.toJson().toString()");
                                    wx03.Zr0("MTimerReport", "setTask", jSONObject2, C60242i.APPEND);
                                }
                            }
                        }
                    }
                }
                this.f105156j = new JSONArray(arrayList);
                if (jSONArray2.length() != this.f105156j.length()) {
                    Log.m105921e("MicroMsg.MTimer", "new tastListJson:%s", this.f105156j.toString());
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MTimer", e, "init error", new Object[0]);
            }
        }
        this.f105151e.sendEmptyMessageDelayed(1, 1);
        ((C39379b) C86312j.m106911c(C39379b.class)).mo61898Wq("mtimer_test", 24, new C39055c(), true, true);
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        this.f105155i = false;
    }

    public final C39053b vx0(String str, C39380c cVar) {
        if (!this.f105155i) {
            return null;
        }
        MultiProcessMMKV xx02 = xx0();
        C87412m.m108591d(xx02);
        String string = xx02.getString(str, "");
        Log.m105925i("MicroMsg.MTimer", "getKV sessionId:%s json:%s", str, string);
        if (Util.isNullOrNil(string)) {
            zx0(str);
            return null;
        }
        JSONObject jSONObject = new JSONObject(string);
        if (cVar != null) {
            return C39053b.f105139f.mo61895a(jSONObject, cVar);
        }
        if (jSONObject.getBoolean("o")) {
            C39053b a = C39053b.f105139f.mo61895a(jSONObject, cVar);
            if (a != null) {
                return a;
            }
            zx0(str);
        }
        return null;
    }

    public final C33192f wx0() {
        if (C86709a0.m107522a()) {
            requireAccountInitialized();
        }
        return this.f105154h;
    }

    public final MultiProcessMMKV xx0() {
        if (C86709a0.m107522a()) {
            requireAccountInitialized();
        }
        return this.f105152f;
    }

    public final C39061i yx0() {
        C39061i iVar = this.f105153g;
        if (iVar != null) {
            return iVar;
        }
        C87412m.m108603p("userTimeSlicing");
        throw null;
    }

    public final boolean zx0(String str) {
        C33192f wx02;
        Object a = C16051f.m14950a(this.f105156j, str);
        if (!(a == null || (wx02 = wx0()) == null)) {
            wx02.Zr0("MTimerReport", "unsetTask", a, C60242i.APPEND);
        }
        MultiProcessMMKV xx02 = xx0();
        C87412m.m108591d(xx02);
        xx02.remove(str);
        MultiProcessMMKV xx03 = xx0();
        C87412m.m108591d(xx03);
        xx03.encode("_mtimer_list", this.f105156j.toString());
        Log.m105925i("MicroMsg.MTimer", "unset key:%s keyList:%d", str, Integer.valueOf(this.f105156j.length()));
        return a != null;
    }
}
