package com.tencent.p014mm.plugin.sport.model;

import android.content.Context;
import android.hardware.SensorManager;
import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tav.coremedia.TimeUtil;
import eb0.C31543z5;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import nj3.C76901s0;
import org.json.JSONObject;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.plugin.sport.model.q */
public class C115778q {

    /* renamed from: a */
    public static C76901s0 f347351a;

    /* renamed from: b */
    public static final String[] f347352b = {"_id", "_begin_time", "_end_time", "_mode", "_steps"};

    /* renamed from: c */
    public static final Uri f347353c = Uri.parse("content://com.miui.providers.steps/item");

    /* renamed from: a */
    public static boolean m162832a(Context context) {
        C87412m.m108594g(context, "context");
        if (C11171e.m11044a(19)) {
            Log.m105924i("MicroMsg.Sport.SportKtUtil", "Not Support SDK VERSION");
        } else {
            if (C115774m.f347340a == null) {
                C115774m.f347340a = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.sensor.stepcounter"));
            }
            Boolean bool = C115774m.f347340a;
            Boolean bool2 = Boolean.TRUE;
            if (!C87412m.m108589b(bool, bool2)) {
                Log.m105924i("MicroMsg.Sport.SportKtUtil", "Not Support FEATURE_SENSOR_STEP_COUNTER");
            } else {
                try {
                    if (C115774m.f347341b == null) {
                        Object systemService = MMApplicationContext.getContext().getSystemService("sensor");
                        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
                        C115774m.f347341b = Boolean.valueOf(((SensorManager) systemService).getDefaultSensor(19) != null);
                    }
                    if (!C87412m.m108589b(C115774m.f347341b, bool2)) {
                        Log.m105924i("MicroMsg.Sport.SportKtUtil", "Not Support can not get sensor");
                    } else if (C115769k.m162824c().optInt("deviceStepSwitch") == 1) {
                        return true;
                    } else {
                        Log.m105924i("MicroMsg.Sport.SportKtUtil", "Not Support deviceStepSwitch is off");
                    }
                } catch (Exception unused) {
                    Log.m105924i("MicroMsg.Sport.SportKtUtil", "Not Support can not get sensor Exception");
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m162833b() {
        if (C115769k.m162824c().optInt("extStepApiSwitch") == 1) {
            return true;
        }
        Log.m105924i("MicroMsg.Sport.SportUtil", "Not Support extStepApiSwitch is off");
        return false;
    }

    /* renamed from: c */
    public static boolean m162834c(long j, long j2) {
        if (j == 0 && j2 > 0) {
            return true;
        }
        int i = 500;
        try {
            JSONObject optJSONObject = C115769k.m162824c().optJSONObject("stepCountUploadConfig");
            if (optJSONObject != null) {
                i = optJSONObject.optInt("backgroundStepCountInterval", 500);
            }
        } catch (Exception unused) {
        }
        return j2 - j >= ((long) i);
    }

    /* renamed from: d */
    public static boolean m162835d(long j, long j2) {
        long j3 = 3600000;
        try {
            JSONObject optJSONObject = C115769k.m162824c().optJSONObject("stepCountUploadConfig");
            if (optJSONObject != null) {
                j3 = ((long) (optJSONObject.optInt("backgroundTimeInterval", 60) * 60)) * 1000;
            }
        } catch (Exception unused) {
        }
        return j2 - j >= j3;
    }

    /* renamed from: e */
    public static boolean m162836e() {
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get("gh_43f2581f6fd6");
        boolean s3 = z1Var != null ? z1Var.mo62927s3() : false;
        if (!s3) {
            Log.m105925i("MicroMsg.Sport.SportUtil", "checkUserInstallWeSportPlugin %b", Boolean.valueOf(s3));
        }
        return s3;
    }

    /* renamed from: f */
    public static final String m162837f(long j) {
        return new SimpleDateFormat(TimeUtil.YYYY2MM2DD_HH1MM1SS).format(new Date(j));
    }

    /* renamed from: g */
    public static long m162838g() {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(C31543z5.m39453c());
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance.getTimeInMillis();
    }
}
