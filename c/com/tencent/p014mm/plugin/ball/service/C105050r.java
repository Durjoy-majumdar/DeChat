package com.tencent.p014mm.plugin.ball.service;

import aw0.C103925l;
import aw0.C103926n;
import c02.C92331c;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import kg3.C76577a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p733vy.C37873b;
import xv0.C112184g;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.ball.service.r */
public class C105050r implements C112184g {

    /* renamed from: d */
    public static List<BallInfo> f311800d = new Vector();

    /* renamed from: e */
    public static int f311801e = 0;

    /* renamed from: f */
    public static int f311802f = C103926n.f307302l;

    /* renamed from: g */
    public static int f311803g = 0;

    /* renamed from: h */
    public static boolean f311804h = false;

    /* renamed from: i */
    public static C105050r f311805i;

    /* renamed from: com.tencent.mm.plugin.ball.service.r$a */
    public class C105051a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ BallInfo f311806d;

        /* renamed from: e */
        public final /* synthetic */ boolean f311807e;

        public C105051a(C105050r rVar, BallInfo ballInfo, boolean z) {
            this.f311806d = ballInfo;
            this.f311807e = z;
        }

        public void run() {
            BallInfo ballInfo = this.f311806d;
            ballInfo.f311683H.f311721j = 15;
            C105034a.m140878d(ballInfo, this.f311807e);
        }
    }

    public C105050r() {
        BallInfo c;
        Class cls = C92331c.class;
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.FloatBallStorage", "initFloatBallStorage account not ready");
            return;
        }
        synchronized (this) {
            try {
                mo149195e();
                f311801e = MultiProcessMMKV.getMMKV(mo149194c()).decodeInt("pos_x", 0);
                f311802f = MultiProcessMMKV.getMMKV(mo149194c()).decodeInt("pos_y", C103926n.f307302l);
                MultiProcessMMKV.getMMKV(mo149194c()).decodeInt("anim_pos_x", f311801e);
                MultiProcessMMKV.getMMKV(mo149194c()).decodeInt("anim_pos_y", f311802f);
                if (MultiProcessMMKV.getMMKV(mo149194c()).contains("dock_left")) {
                    f311804h = MultiProcessMMKV.getMMKV(mo149194c()).decodeBool("dock_left", false);
                } else {
                    f311804h = f311801e < C76577a.m92145A(MMApplicationContext.getContext()) / 2;
                }
                f311803g = MultiProcessMMKV.getMMKV(mo149194c()).decodeInt("collapse_state", 0);
                MultiProcessMMKV.getMMKV(mo149194c()).decodeInt("ball_width", 0);
                MultiProcessMMKV.getMMKV(mo149194c()).decodeInt("ball_height", 0);
                String decodeString = MultiProcessMMKV.getMMKV(mo149194c()).decodeString("balls");
                if (Util.isNullOrNil(decodeString)) {
                    f311800d = new Vector();
                    Log.m105925i("MicroMsg.FloatBallStorage", "load, ballPosition:[%s, %s], ballInfoList is empty", Integer.valueOf(f311801e), Integer.valueOf(f311802f));
                } else {
                    boolean e = ((C37873b) C86312j.m106911c(C37873b.class)).mo61224e();
                    Log.m105925i("MicroMsg.FloatBallStorage", "load, savedBalls:%s, isTeenMode: %s, collapseState: %d, sBallDockLeft: %s", decodeString, Boolean.valueOf(e), Integer.valueOf(f311803g), Boolean.valueOf(f311804h));
                    BallInfo ballInfo = null;
                    try {
                        f311800d = new Vector();
                        JSONArray jSONArray = new JSONArray(decodeString);
                        if (jSONArray.length() > 0) {
                            for (int i = 0; i < jSONArray.length(); i++) {
                                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                                if (!(optJSONObject == null || (c = BallInfo.m140723c(optJSONObject)) == null)) {
                                    if (!c.f311680E || (c.f311686d == 16 && !e)) {
                                        c.f311681F = false;
                                        c.f311679D = 0;
                                        f311800d.add(c);
                                    } else {
                                        mo149196f(c);
                                    }
                                    if (c.f311686d == 20) {
                                        ballInfo = c;
                                    }
                                }
                            }
                        }
                        mo149192a(ballInfo, f311800d.isEmpty());
                        mo149193b();
                        Log.m105925i("MicroMsg.FloatBallStorage", "load, ballPosition:[%s, %s], ballInfoList:%s", Integer.valueOf(f311801e), Integer.valueOf(f311802f), f311800d);
                    } catch (JSONException e2) {
                        Log.printErrStackTrace("MicroMsg.FloatBallStorage", e2, "load fail, exception:%s", e2);
                    }
                }
            } catch (UnsatisfiedLinkError e3) {
                f311801e = 0;
                f311802f = C103926n.f307302l;
                f311804h = false;
                f311800d = new Vector();
                f311803g = 0;
                Log.printErrStackTrace("MicroMsg.FloatBallStorage", e3, "load fail, error:%s", e3);
            }
        }
        if (C86312j.m106911c(cls) != null) {
            ((C92331c) C86312j.m106911c(cls)).V70(f311800d);
            return;
        }
        return;
    }

    /* renamed from: d */
    public static C105050r m140969d() {
        if (f311805i == null) {
            synchronized (C105050r.class) {
                if (f311805i == null) {
                    f311805i = new C105050r();
                }
            }
        }
        return f311805i;
    }

    /* renamed from: B */
    public void mo145544B(List<BallInfo> list, BallInfo ballInfo) {
        f311800d = list;
        synchronized (this) {
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            try {
                if (C103925l.m138627a(f311800d)) {
                    int i2 = 0;
                    for (int i3 = 0; i3 < f311800d.size(); i3++) {
                        BallInfo ballInfo2 = f311800d.get(i3);
                        JSONObject a = BallInfo.m140721a(ballInfo2);
                        if (a != null) {
                            int i4 = i2 + 1;
                            jSONArray.put(i2, a);
                            mo149197g(ballInfo2, a);
                            i2 = i4;
                        }
                    }
                }
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.FloatBallStorage", e, "saveBallInfoList fail, exception:%s", e);
            }
            String jSONArray2 = jSONArray.toString();
            MultiProcessMMKV.getMMKV(mo149194c()).encode("balls", jSONArray2);
            Log.m105925i("MicroMsg.FloatBallStorage", "saveBallInfoList, savedBalls:%s", jSONArray2);
            List<BallInfo> d = C103925l.m138630d(f311800d);
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV(mo149194c());
            if (C103925l.m138627a(d)) {
                i = ((Vector) d).size();
            }
            mmkv.encode("ActiveCount", i);
        }
    }

    /* renamed from: a */
    public final void mo149192a(BallInfo ballInfo, boolean z) {
        if (ballInfo != null && ballInfo.f311686d == 20) {
            ((C119157j) C119157j.f356862d).mo183870a(new C105051a(this, ballInfo, z));
        }
    }

    /* renamed from: b */
    public final void mo149193b() {
        boolean z;
        String[] allKeys = MultiProcessMMKV.getMMKV(mo149194c()).allKeys();
        int length = allKeys != null ? allKeys.length : 0;
        for (int i = 0; i < length; i++) {
            String str = allKeys[i];
            if (!Util.isEqual(str, "pos_x") && !Util.isEqual(str, "pos_y") && !Util.isEqual(str, "balls") && !Util.isEqual(str, "ActiveCount") && !Util.isEqual(str, "req_perm_cnt")) {
                Iterator<BallInfo> it = f311800d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (Util.isEqual(str, it.next().mo149041e())) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    Log.m105925i("MicroMsg.FloatBallStorage", "fixExistedKeyValues, key:%s", str);
                    MultiProcessMMKV.getMMKV(mo149194c()).remove(str).commit();
                }
            }
        }
    }

    /* renamed from: c */
    public final String mo149194c() {
        if (!C86709a0.m107522a() || !C86709a0.m107522a()) {
            return "float_ball_storage";
        }
        return C86709a0.m107523b().mo121111i() + "#" + "float_ball_storage";
    }

    /* renamed from: e */
    public final void mo149195e() {
        String[] allKeys = MultiProcessMMKV.getMMKV(mo149194c()).allKeys();
        int length = allKeys != null ? allKeys.length : 0;
        Log.m105925i("MicroMsg.FloatBallStorage", "printExistedKeyValues, size:%s", Integer.valueOf(length));
        for (int i = 0; i < length; i++) {
            Log.m105925i("MicroMsg.FloatBallStorage", "printExistedKeyValues, key:%s", allKeys[i]);
        }
    }

    /* renamed from: f */
    public synchronized void mo149196f(BallInfo ballInfo) {
        if (ballInfo != null) {
            Log.m105925i("MicroMsg.FloatBallStorage", ">>>>>> removeBallInfo, dataKey:%s <<<<<<", ballInfo.mo149041e());
            MultiProcessMMKV.getMMKV(mo149194c()).remove(ballInfo.mo149041e()).commit();
        }
    }

    /* renamed from: g */
    public synchronized void mo149197g(BallInfo ballInfo, JSONObject jSONObject) {
        if (ballInfo != null) {
            if (jSONObject != null) {
                Log.m105925i("MicroMsg.FloatBallStorage", ">>>>>> saveBallInfo, dataKey:%s <<<<<<", ballInfo.mo149041e());
                MultiProcessMMKV.getMMKV(mo149194c()).encode(ballInfo.mo149041e(), jSONObject.toString());
            } else {
                Log.m105925i("MicroMsg.FloatBallStorage", ">>>>>> saveBallInfo, clear value, dataKey:%s <<<<<<", ballInfo.mo149041e());
                MultiProcessMMKV.getMMKV(mo149194c()).encode(ballInfo.mo149041e(), "");
            }
        }
    }
}
