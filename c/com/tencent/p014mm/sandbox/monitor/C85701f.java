package com.tencent.p014mm.sandbox.monitor;

import a70.C112760b;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import com.tencent.p014mm.app.C80594h0;
import com.tencent.p014mm.network.C81035d;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.sdk.storage.ConfigFile;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.xweb.util.FrequentLimiter;
import java.io.File;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import p156gj.C87203t;
import p823sg.C118283d;
import p823sg.C77710q;
import p823sg.C90193h;
import p823sg.C90197s;
import qe3.C89625d;
import zt3.C119157j;

/* renamed from: com.tencent.mm.sandbox.monitor.f */
public final class C85701f {

    /* renamed from: a */
    public static final HashMap<String, Integer> f249717a;

    static {
        HashMap<String, Integer> hashMap = new HashMap<>(16);
        f249717a = hashMap;
        hashMap.put("exception", 10001);
        hashMap.put("anr", 10002);
        hashMap.put("handler", 10003);
        hashMap.put("sql", 10004);
        hashMap.put("permission", 10005);
        hashMap.put("main_thread_watch", 10006);
    }

    /* renamed from: a */
    public static boolean m105852a(String str, byte[] bArr) {
        Map<String, String> parseXml;
        Log.m105920e("MicroMsg.CrashUpload", "doPost : url = " + str + ", data.length = " + bArr.length);
        HttpClient c = C81035d.m98962c();
        HttpPost httpPost = new HttpPost(str);
        try {
            ByteArrayEntity byteArrayEntity = new ByteArrayEntity(bArr);
            byteArrayEntity.setContentType("binary/octet-stream");
            httpPost.setEntity(byteArrayEntity);
            HttpResponse execute = c.execute(httpPost);
            InputStream content = execute.getEntity().getContent();
            int statusCode = execute.getStatusLine().getStatusCode();
            String convertStreamToString = Util.convertStreamToString(content);
            if (!(convertStreamToString == null || convertStreamToString.length() <= 0 || (parseXml = XmlParser.parseXml(convertStreamToString, "Response", (String) null)) == null || !"-1000".equalsIgnoreCase(parseXml.get(".Response.retCode")) || parseXml.get(".Response.url") == null)) {
                ((C119157j) C119157j.f356862d).mo183878i(new C6697e(parseXml), 500);
            }
            C80594h0.m98212a(35);
            Log.m105918d("MicroMsg.CrashUpload", convertStreamToString);
            Log.m105925i("MicroMsg.CrashUpload", "doPost: responseCode %d returnConnection = %s", Integer.valueOf(statusCode), convertStreamToString);
            return statusCode == 200;
        } catch (Exception e) {
            C80594h0.m98212a(36);
            Log.printErrStackTrace("MicroMsg.CrashUpload", e, "", new Object[0]);
            Log.m105921e("MicroMsg.CrashUpload", "doPost e type: %s, msg: %s", e.getClass().getSimpleName(), e.getMessage());
        }
    }

    /* renamed from: b */
    public static int m105853b(String str, String str2, boolean z) {
        String str3;
        String str4 = C72994y1.f212832a + "crash/" + str + "." + str2 + ".crashini";
        long nullAsNil = Util.nullAsNil(ConfigFile.getLongValue(str4, "count"));
        long nowMilliSecond = Util.nowMilliSecond() - Util.nullAsNil(ConfigFile.getLongValue(str4, "lasttime"));
        if (z) {
            str3 = C72994y1.f212832a + "crash/" + str + "." + str2 + ".preventcrashlog";
        } else {
            str3 = C72994y1.f212832a + "crash/" + str + "." + str2 + ".crashlog";
        }
        int e = C85706i.m105869e(str3);
        Log.m105918d("MicroMsg.CrashUpload", "dkcrash count:" + nullAsNil + " t:" + nowMilliSecond + " len:" + e);
        if (e < 5242880) {
            C80594h0.m98212a(28);
            byte[] f = C85706i.m105870f(str3, 0, -1);
            if (!Util.isNullOrNil(f)) {
                int length = f.length;
                String lowerCase = C90193h.m112878f(String.format("weixin#$()%d%d", new Object[]{Integer.valueOf(C89625d.f257841g), Integer.valueOf(length)}).getBytes()).toLowerCase();
                byte[] a = C90197s.m112889a(f);
                PByteArray pByteArray = new PByteArray();
                C118283d.m166849b(pByteArray, a, lowerCase.getBytes());
                ((C119157j) C119157j.f356862d).mo183875f(new C85700d(length, lowerCase, str2, str, pByteArray));
            }
        } else {
            C80594h0.m98212a(29);
        }
        C85706i.m105866b(str3);
        C80594h0.m98212a(30);
        ConfigFile.saveValue(str4, "count", 0);
        ConfigFile.saveValue(str4, "lasttime", Util.nowMilliSecond());
        return 1;
    }

    /* renamed from: c */
    public static void m105854c(String str, ErrLog$Error errLog$Error) {
        if (!new File(str).exists()) {
            int i = MMApplicationContext.getContext().getSharedPreferences("system_config_prefs", 0).getInt("default_uin", 0);
            StringBuilder sb = new StringBuilder();
            if (i == 0) {
                String f = C87203t.m108270f(false);
                if (!Util.isNullOrNil(f)) {
                    sb.append("uin[" + f + "] ");
                } else {
                    String str2 = Build.DEVICE + Build.FINGERPRINT + Build.MANUFACTURER + C87203t.m108275k();
                    sb.append("uin[" + Integer.toString(str2.hashCode()) + "] ");
                }
            } else {
                sb.append("uin[" + C77710q.m93738a(i) + "] ");
            }
            sb.append(Log.getSysInfo());
            sb.append(" BRAND:[" + Build.BRAND + "] ");
            String[] e = C87203t.m108269e();
            if (e.length > 0) {
                sb.append("c1[" + e[0] + "] ");
            }
            if (e.length > 1) {
                sb.append("c2[" + e[1] + "] ");
            }
            sb.append("\n");
            C85706i.m105865a(str, sb.toString().getBytes());
        }
        if (C85706i.m105869e(str) > 10485760) {
            C85706i.m105866b(str);
        }
        C85706i.m105865a(str, (errLog$Error.toString() + "\n").getBytes());
    }

    /* renamed from: d */
    public static int m105855d(String str, String str2, ErrLog$Error errLog$Error, String str3, boolean z) {
        String str4;
        String str5 = str;
        String str6 = str2;
        ErrLog$Error errLog$Error2 = errLog$Error;
        boolean z2 = z;
        if (errLog$Error2 == null || Util.isNullOrNil(errLog$Error.toString())) {
            return -1;
        }
        File file = new File(C72994y1.f212832a + "crash/");
        if (!file.exists()) {
            file.mkdir();
        }
        String str7 = C72994y1.f212832a + "crash/" + str5 + "." + str6 + ".crashini";
        ConfigFile.saveValue(str7, "count", Util.nullAsNil(ConfigFile.getLongValue(str7, "count")) + 1);
        if (Util.nullAsNil(ConfigFile.getLongValue(str7, "lasttime")) == 0) {
            ConfigFile.saveValue(str7, "lasttime", Util.nowMilliSecond());
        }
        if (z2) {
            str4 = C72994y1.f212832a + "crash/" + str5 + "." + str6 + ".preventcrashlog";
        } else {
            str4 = C72994y1.f212832a + "crash/" + str5 + "." + str6 + ".crashlog";
        }
        Log.m105919d("MicroMsg.CrashUpload", "crash:[%s] len:[%d]", str4, Integer.valueOf(errLog$Error.toString().length()));
        if (errLog$Error2.f249705i) {
            File file2 = new File(C112760b.m154219a());
            if (!file2.exists()) {
                file2.mkdirs();
            }
            File[] listFiles = file2.listFiles();
            if (listFiles != null) {
                for (File file3 : listFiles) {
                    if (Util.milliSecondsToNow(file3.lastModified()) > FrequentLimiter.WEEK_MILLS) {
                        Log.m105925i("MicroMsg.CrashUpload", "dealWithSdcardCrash del old file: %s", file3.getPath());
                        file3.delete();
                    }
                }
            }
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
            String str8 = C112760b.m154219a() + "crash_" + simpleDateFormat.format(date) + ".txt";
            Log.m105925i("MicroMsg.CrashUpload", "dealWithSdcardCrash %s", str8);
            m105854c(str8, errLog$Error2);
        }
        m105854c(str4, errLog$Error2);
        if (!Util.isNullOrNil(str3)) {
            C85706i.m105866b(str3);
        }
        m105853b(str5, str6, z2);
        return 1;
    }

    /* renamed from: e */
    public static void m105856e(Intent intent, String str) {
        C80594h0.m98212a(15);
        if (intent != null && !Util.isNullOrNil(str)) {
            File file = new File(C72994y1.f212832a + "crashprevent/");
            if (!file.exists()) {
                file.mkdir();
            }
            try {
                String stringExtra = intent.getStringExtra("tag");
                if (stringExtra == null) {
                    stringExtra = "exception";
                }
                String stringExtra2 = intent.getStringExtra("exceptionMsg");
                String stringExtra3 = intent.getStringExtra("userName");
                boolean booleanExtra = intent.getBooleanExtra("exceptionWriteSdcard", true);
                String stringExtra4 = intent.getStringExtra("exceptionProcess");
                ErrLog$Error errLog$Error = new ErrLog$Error(stringExtra3, stringExtra, Util.nowSecond(), stringExtra2, booleanExtra);
                ErrLog$PreventError errLog$PreventError = new ErrLog$PreventError(stringExtra3, stringExtra, errLog$Error, stringExtra4);
                Parcel obtain = Parcel.obtain();
                obtain.writeParcelable(errLog$PreventError, 0);
                C85706i.m105865a(str, obtain.marshall());
                Log.m105925i("MicroMsg.CrashUpload", "crashPreventPath:[%s] len:[%d]", str, Integer.valueOf(errLog$Error.toString().length()));
                if (MMApplicationContext.isMainProcess()) {
                    Log.m105924i("MicroMsg.CrashSecondReport", "reportWritePreventCrashFile() process:mm");
                    C115669n.INSTANCE.idkeyStat(1185, 31, 1, true);
                } else if (MMApplicationContext.isPushProcess()) {
                    Log.m105924i("MicroMsg.CrashSecondReport", "reportWritePreventCrashFile() process:push");
                    C115669n.INSTANCE.idkeyStat(1185, 32, 1, true);
                } else {
                    Log.m105924i("MicroMsg.CrashSecondReport", "reportWritePreventCrashFile() process:other");
                    C115669n.INSTANCE.idkeyStat(1185, 33, 1, true);
                }
                C80594h0.m98212a(16);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.CrashUpload", e, "", new Object[0]);
            }
        }
    }
}
