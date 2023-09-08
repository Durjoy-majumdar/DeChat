package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.util.HashMap;
import junit.framework.Assert;
import p261wl.C38166b;
import zh3.C91753f;

/* renamed from: com.tencent.mm.storage.v1 */
public class C85801v1 extends MStorageEx {

    /* renamed from: k */
    public static final String[] f249892k = {"CREATE TABLE IF NOT EXISTS userinfo ( id INTEGER PRIMARY KEY, type INT, value TEXT )", "CREATE TABLE IF NOT EXISTS userinfo2 ( sid TEXT PRIMARY KEY, type INT, value TEXT )"};

    /* renamed from: l */
    public static final Object f249893l = new Object();

    /* renamed from: c */
    public C91753f f249894c;

    /* renamed from: d */
    public v1$$d<Integer> f249895d = new v1$$d<>(this, "userinfo", "id", 512);

    /* renamed from: e */
    public v1$$d<String> f249896e = new v1$$d<>(this, "userinfo2", TPReportKeys.LiveExKeys.LIVE_EX_STREAM_ID, 512);

    /* renamed from: f */
    public HashMap<Integer, v1$$e> f249897f = new HashMap<>();

    /* renamed from: g */
    public HashMap<String, v1$$e> f249898g = new HashMap<>();

    /* renamed from: h */
    public MMHandler f249899h;

    /* renamed from: i */
    public volatile boolean f249900i;

    /* renamed from: j */
    public final Runnable f249901j = new v1$$b(this);

    public C85801v1(C91753f fVar) {
        this.f249894c = fVar;
        this.f249899h = new MMHandler("ConfigStorage");
    }

    /* renamed from: F */
    public long mo119672F(int i, long j) {
        Long l = (Long) mo119684e(i, (Object) null);
        return l == null ? j : l.longValue();
    }

    /* renamed from: G */
    public long mo119673G(C72994y1.C72995a aVar, long j) {
        Object f = mo119685f(aVar, Long.valueOf(j));
        return (f == null || !(f instanceof Long)) ? j : ((Long) f).longValue();
    }

    /* renamed from: H */
    public String mo119674H(int i, String str) {
        Object e = mo119684e(i, str);
        return (e == null || !(e instanceof String)) ? str : (String) e;
    }

    /* renamed from: I */
    public String mo119675I(C72994y1.C72995a aVar, String str) {
        Object f = mo119685f(aVar, str);
        return (f == null || !(f instanceof String)) ? str : (String) f;
    }

    /* renamed from: J */
    public void mo119676J(int i, Object obj) {
        v1$$e v1__e;
        Assert.assertNotNull("db is null", this.f249894c);
        if (obj == null) {
            obj = f249893l;
        }
        if (!obj.equals(this.f249895d.put(Integer.valueOf(i), obj))) {
            Object obj2 = f249893l;
            if (obj == obj2) {
                v1__e = null;
            } else {
                v1__e = v1$$e.m106018a(obj);
                if (v1__e == null) {
                    return;
                }
            }
            synchronized (this) {
                this.f249897f.put(Integer.valueOf(i), v1__e);
                if (!this.f249900i) {
                    this.f249900i = true;
                    this.f249899h.postDelayed(this.f249901j, 30000);
                }
            }
            doNotify(obj == obj2 ? 5 : 4, this, Integer.valueOf(i));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SET: ");
        sb.append(i);
        sb.append(" => ");
        sb.append(obj == f249893l ? "(DELETED)" : obj.toString());
        Log.m105924i("MicroMsg.ConfigStorage", sb.toString());
    }

    /* renamed from: K */
    public void mo119677K(C72994y1.C72995a aVar, Object obj) {
        boolean z;
        v1$$e v1__e;
        if (aVar != null) {
            String name = aVar.name();
            if (!Util.isNullOrNil(name)) {
                String[] split = name.split("_");
                String str = split[split.length - 1];
                if (str.equals("SYNC")) {
                    str = split[split.length - 2];
                    z = true;
                } else {
                    z = false;
                }
                if (mo119682b(str, obj, true)) {
                    String substring = name.substring(0, name.lastIndexOf(str) + str.length());
                    if (obj == null) {
                        obj = f249893l;
                    }
                    if (!obj.equals(this.f249896e.put(substring, obj))) {
                        Object obj2 = f249893l;
                        if (obj == obj2) {
                            v1__e = null;
                        } else {
                            v1__e = v1$$e.m106018a(obj);
                            if (v1__e == null) {
                                return;
                            }
                        }
                        synchronized (this) {
                            this.f249898g.put(substring, v1__e);
                            if (z) {
                                mo119681a(true);
                            } else if (!this.f249900i) {
                                this.f249900i = true;
                                this.f249899h.postDelayed(this.f249901j, 30000);
                            }
                        }
                        doNotify(obj == obj2 ? 5 : 4, this, aVar);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("SET: ");
                    sb.append(substring);
                    sb.append(" => ");
                    sb.append(obj == f249893l ? "(DELETED)" : obj.toString());
                    Log.m105924i("MicroMsg.ConfigStorage", sb.toString());
                }
            }
        }
    }

    /* renamed from: L */
    public void mo119678L(String str, Object obj) {
        boolean z;
        v1$$e v1__e;
        if (!Util.isNullOrNil(str)) {
            String[] split = str.split("_");
            String str2 = split[split.length - 1];
            if (str2.equals("SYNC")) {
                str2 = split[split.length - 2];
                z = true;
            } else {
                z = false;
            }
            if (mo119682b(str2, obj, true)) {
                String substring = str.substring(0, str.lastIndexOf(str2) + str2.length());
                if (obj == null) {
                    obj = f249893l;
                }
                if (!obj.equals(this.f249896e.put(substring, obj))) {
                    Object obj2 = f249893l;
                    if (obj == obj2) {
                        v1__e = null;
                    } else {
                        v1__e = v1$$e.m106018a(obj);
                        if (v1__e == null) {
                            return;
                        }
                    }
                    synchronized (this) {
                        this.f249898g.put(substring, v1__e);
                        if (z) {
                            mo119681a(true);
                        } else if (!this.f249900i) {
                            this.f249900i = true;
                            this.f249899h.postDelayed(this.f249901j, 30000);
                        }
                    }
                    doNotify(obj == obj2 ? 5 : 4, this, str);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("SET: ");
                sb.append(substring);
                sb.append(" => ");
                sb.append(obj == f249893l ? "(DELETED)" : obj.toString());
                Log.m105924i("MicroMsg.ConfigStorage", sb.toString());
            }
        }
    }

    /* renamed from: M */
    public void mo119679M(int i, int i2) {
        mo119676J(i, Integer.valueOf(i2));
    }

    /* renamed from: N */
    public void mo119680N(int i, long j) {
        mo119676J(i, Long.valueOf(j));
    }

    /* renamed from: a */
    public void mo119681a(boolean z) {
        synchronized (this) {
            this.f249899h.removeCallbacks(this.f249901j);
            this.f249899h.post(this.f249901j);
            this.f249900i = true;
        }
        Log.m105924i("MicroMsg.ConfigStorage", "Posted appendAllToDisk");
    }

    /* renamed from: b */
    public final boolean mo119682b(String str, Object obj, boolean z) {
        if (obj == null && z) {
            return true;
        }
        if (str.equals("INT") && (obj instanceof Integer)) {
            return true;
        }
        if (str.equals("LONG") && (obj instanceof Long)) {
            return true;
        }
        if (str.equals("STRING") && (obj instanceof String)) {
            return true;
        }
        if (str.equals("BOOLEAN") && (obj instanceof Boolean)) {
            return true;
        }
        if (str.equals("FLOAT") && (obj instanceof Float)) {
            return true;
        }
        if (str.equals("DOUBLE") && (obj instanceof Double)) {
            return true;
        }
        if (obj != null && CrashReportFactory.hasDebuger()) {
            Assert.assertTrue("checkType failed, input type and value[" + str + ", " + obj + "] are not match", false);
        }
        if (z) {
            Log.m105921e("MicroMsg.ConfigStorage", "checkType failed, input type and value[%s, %s] are not match", str, obj);
        }
        return false;
    }

    /* renamed from: d */
    public Object mo119683d(int i) {
        return mo119684e(i, (Object) null);
    }

    public void doNotify(int i, MStorageEx mStorageEx, Object obj) {
        super.doNotify(i, mStorageEx, obj);
        C38166b.m41755b(v1$$c.class, new v1$$a(i, mStorageEx, obj));
    }

    /* renamed from: e */
    public Object mo119684e(int i, Object obj) {
        Assert.assertNotNull("db is null", this.f249894c);
        Object obj2 = this.f249895d.get(Integer.valueOf(i));
        return (obj2 == null || obj2 == f249893l) ? obj : obj2;
    }

    /* renamed from: f */
    public Object mo119685f(C72994y1.C72995a aVar, Object obj) {
        return aVar == null ? obj : mo119687h(aVar.name(), obj);
    }

    /* renamed from: g */
    public boolean mo119686g(C72994y1.C72995a aVar, boolean z) {
        Object f = mo119685f(aVar, Boolean.valueOf(z));
        return (f == null || !(f instanceof Boolean)) ? z : ((Boolean) f).booleanValue();
    }

    /* renamed from: h */
    public Object mo119687h(String str, Object obj) {
        Util.isNullOrNil(str);
        String[] split = str.split("_");
        String str2 = split[split.length - 1];
        if (str2.equals("SYNC")) {
            str2 = split[split.length - 2];
        }
        String substring = str.substring(0, str.lastIndexOf(str2) + str2.length());
        Assert.assertNotNull("db is null", this.f249894c);
        Object obj2 = this.f249896e.get(substring);
        if (obj2 == null || obj2 == f249893l) {
            obj2 = obj;
        }
        return !mo119682b(str2, obj2, false) ? obj : obj2;
    }

    /* renamed from: i */
    public int mo119688i(int i, int i2) {
        Integer num = (Integer) mo119684e(i, (Object) null);
        return num == null ? i2 : num.intValue();
    }

    /* renamed from: j */
    public int mo119689j(C72994y1.C72995a aVar, int i) {
        Object f = mo119685f(aVar, Integer.valueOf(i));
        return (f == null || !(f instanceof Integer)) ? i : ((Integer) f).intValue();
    }

    public boolean shouldProcessEvent() {
        C91753f fVar = this.f249894c;
        if (fVar != null && !fVar.isClose()) {
            return true;
        }
        Object[] objArr = new Object[1];
        C91753f fVar2 = this.f249894c;
        objArr[0] = fVar2 == null ? "null" : Boolean.valueOf(fVar2.isClose());
        Log.m105929w("MicroMsg.ConfigStorage", "shouldProcessEvent db is close :%s", objArr);
        return false;
    }
}
