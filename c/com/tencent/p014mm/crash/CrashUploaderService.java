package com.tencent.p014mm.crash;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.service.MMIntentService;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import junit.framework.Assert;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import p823sg.C118283d;
import p823sg.C90193h;
import p823sg.C90197s;

/* renamed from: com.tencent.mm.crash.CrashUploaderService */
public class CrashUploaderService extends MMIntentService {

    /* renamed from: j */
    public static final HashMap<String, Integer> f237630j;

    static {
        HashMap<String, Integer> hashMap = new HashMap<>(16);
        f237630j = hashMap;
        hashMap.put("exception", 10001);
        hashMap.put("anr", 10002);
        hashMap.put("handler", 10003);
        hashMap.put("sql", 10004);
        hashMap.put("permission", 10005);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CrashUploaderService() {
        super("CrashUploaderService");
        Class<CrashUploaderService> cls = CrashUploaderService.class;
        if (BuildInfo.DEBUG) {
            Log.m105921e("MicroMsg.CrashUploaderService", "CrashUploaderService Name : %s", cls.getName());
            Assert.assertTrue("CrashUploaderService name mismatch!!!", cls.getName().endsWith(".crash.CrashUploaderService"));
        }
    }

    /* renamed from: l */
    public static boolean m98687l(String str, byte[] bArr, int i, String str2, String str3, String str4) {
        int length = bArr.length;
        String lowerCase = C90193h.m112878f(String.format("weixin#$()%d%d", new Object[]{Integer.valueOf(i), Integer.valueOf(length)}).getBytes()).toLowerCase();
        byte[] a = C90197s.m112889a(bArr);
        PByteArray pByteArray = new PByteArray();
        C118283d.m166849b(pByteArray, a, lowerCase.getBytes());
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append("/cgi-bin/mmsupport-bin/stackreport?version=");
        sb.append(Integer.toHexString(i));
        sb.append("&devicetype=");
        sb.append(str2);
        sb.append("&filelength=");
        sb.append(length);
        sb.append("&sum=");
        sb.append(lowerCase);
        sb.append("&reporttype=1");
        sb.append("&NewReportType=");
        sb.append(Util.nullAsNil(f237630j.get(str4)));
        if (str != null && !str.equals("")) {
            sb.append("&username=");
            sb.append(str);
        }
        try {
            DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
            HttpPost httpPost = new HttpPost(sb.toString());
            ByteArrayEntity byteArrayEntity = new ByteArrayEntity(pByteArray.value);
            byteArrayEntity.setContentType("binary/octet-stream");
            httpPost.setEntity(byteArrayEntity);
            Log.m105924i("MicroMsg.CrashUploaderService", Util.convertStreamToString(defaultHttpClient.execute(httpPost).getEntity().getContent()));
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.CrashUploaderService", e, "", new Object[0]);
            return false;
        }
    }

    /* renamed from: m */
    public static void m98688m(C86009m1 m1Var, String str, String str2, String str3, String str4) {
        String[] split;
        for (C86009m1 m1Var2 : m1Var.mo119984u()) {
            if (!(m1Var2 == null || (split = m1Var2.getName().split("__")) == null || split.length < 2)) {
                byte[] O = C86013q1.m106433O(m1Var2.mo119976n(), 0, -1);
                if (Util.isNullOrNil(O)) {
                    m1Var2.mo119966f();
                } else {
                    if (m98687l(str, O, Integer.parseInt(split[1]), str2, str3, str4)) {
                        m1Var2.mo119966f();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public String mo63928b() {
        return "MicroMsg.CrashUploaderService";
    }

    /* renamed from: j */
    public void mo63929j(Intent intent) {
        int i;
        Intent intent2 = intent;
        if (intent2 != null) {
            String stringExtra = intent2.getStringExtra("INTENT_EXTRA_EXCEPTION_MSG");
            String stringExtra2 = intent2.getStringExtra("INTENT_EXTRA_USER_NAME");
            String stringExtra3 = intent2.getStringExtra("INTENT_EXTRA_SDCARD_PATH");
            String stringExtra4 = intent2.getStringExtra("INTENT_EXTRA_DATA_PATH");
            String stringExtra5 = intent2.getStringExtra("INTENT_EXTRA_UIN");
            try {
                i = Integer.decode(intent2.getStringExtra("INTENT_EXTRA_CLIENT_VERSION")).intValue();
            } catch (Error unused) {
                i = 0;
            }
            String stringExtra6 = intent2.getStringExtra("INTENT_EXTRA_DEVICE_TYPE");
            String stringExtra7 = intent2.getStringExtra("INTENT_EXTRA_HOST");
            String stringExtra8 = intent2.getStringExtra("INTENT_EXTRA_TAG");
            if (stringExtra8 == null || stringExtra8.length() == 0) {
                stringExtra8 = "exception";
            }
            String str = (stringExtra2 + "," + stringExtra6 + "_" + i + "_" + Build.CPU_ABI + ",") + "exception,time_" + Util.nowSecond() + ",error_" + stringExtra;
            try {
                C86009m1 m1Var = new C86009m1(stringExtra3);
                if (!m1Var.mo119967g()) {
                    m1Var.mo119987x();
                } else {
                    C86009m1[] u = m1Var.mo119984u();
                    if (u != null) {
                        for (C86009m1 m1Var2 : u) {
                            if (Util.milliSecondsToNow(m1Var2.mo119979q()) > 2592000000L) {
                                m1Var2.mo119966f();
                            }
                        }
                    }
                }
                Date date = new Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
                mo112594k(stringExtra3 + "crash_" + simpleDateFormat.format(date) + ".txt", str, stringExtra5);
            } catch (Exception unused2) {
            }
            Uri n = C116299g2.m163858n(stringExtra4);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
            if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
                if (l2.mo177810a()) {
                    l2.f348991a.mo119937g(l2.f348992b);
                }
            }
            String str2 = stringExtra4 + stringExtra5;
            C86009m1 m1Var3 = new C86009m1(str2);
            if (m1Var3.mo119967g()) {
                if (m1Var3.mo119980r() > 262144) {
                    m1Var3.mo119966f();
                }
                byte[] O = C86013q1.m106433O(str2, 0, -1);
                if (Util.isNullOrNil(O)) {
                    m1Var3.mo119966f();
                    return;
                } else if (m98687l(stringExtra2, O, i, stringExtra6, stringExtra7, stringExtra8)) {
                    m1Var3.mo119966f();
                }
            }
            String str3 = stringExtra4 + stringExtra5 + "_nf/";
            C86009m1 m1Var4 = new C86009m1(str3);
            if (!m1Var4.mo119967g()) {
                m1Var4.mo119987x();
            }
            mo112594k(str3 + "__" + i + "__" + System.currentTimeMillis(), str, stringExtra5);
            m98688m(m1Var4, stringExtra2, stringExtra6, stringExtra7, stringExtra8);
        }
    }

    /* renamed from: k */
    public final void mo112594k(String str, String str2, String str3) {
        Uri n = C116299g2.m163858n(str);
        String path = n.getPath();
        boolean z = false;
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (l.mo177810a()) {
            z = l.f348991a.mo119948x(l.f348992b);
        }
        if (!z) {
            StringBuilder sb = new StringBuilder();
            if (Util.isNullOrNil(str3) || str3.equals("0")) {
                String str4 = Build.DEVICE + Build.FINGERPRINT + Build.MANUFACTURER + Build.MODEL;
                sb.append("uin[" + Integer.toString(str4.hashCode()) + "] ");
            } else {
                sb.append("uin[" + str3 + "] ");
            }
            sb.append(Log.getSysInfo());
            sb.append(" BRAND:[" + Build.BRAND + "] ");
            sb.append("\n");
            C86013q1.m106440a(str, sb.toString().getBytes());
        }
        C86013q1.m106440a(str, (str2 + "\n").getBytes());
    }
}
