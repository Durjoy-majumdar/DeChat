package com.tencent.matrix.batterycanary.stats;

import android.os.Process;
import android.text.TextUtils;
import com.tencent.mmkv.MMKV;
import com.tencent.xweb.file.XVFSFile;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import p723vf.C118672d;
import p981ie.C117159b;
import p981ie.C117186v;

/* renamed from: com.tencent.matrix.batterycanary.stats.a */
public interface C114559a {

    /* renamed from: com.tencent.matrix.batterycanary.stats.a$a */
    public static class C114560a implements C114559a {

        /* renamed from: d */
        public static final C117186v<String> f343346d = new C114561a();

        /* renamed from: e */
        public static final C117186v<DateFormat> f343347e = new C114562b();

        /* renamed from: a */
        public final int f343348a = Process.myPid();

        /* renamed from: b */
        public final MMKV f343349b;

        /* renamed from: c */
        public AtomicInteger f343350c = new AtomicInteger(0);

        /* renamed from: com.tencent.matrix.batterycanary.stats.a$a$a */
        public class C114561a extends C117186v<String> {
            /* renamed from: a */
            public Object mo173739a() {
                String o = C117159b.m165214o();
                return o.contains(XVFSFile.PATH_SEPARATOR) ? o.substring(o.lastIndexOf(XVFSFile.PATH_SEPARATOR) + 1) : FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT;
            }
        }

        /* renamed from: com.tencent.matrix.batterycanary.stats.a$a$b */
        public class C114562b extends C117186v<DateFormat> {
            /* renamed from: a */
            public Object mo173739a() {
                return new SimpleDateFormat("yyyy-MM-dd", Locale.US);
            }
        }

        /* renamed from: com.tencent.matrix.batterycanary.stats.a$a$c */
        public class C114563c implements Comparator<BatteryRecord> {
            public C114563c(C114560a aVar) {
            }

            public int compare(Object obj, Object obj2) {
                return Long.compare(((BatteryRecord) obj).f343325e, ((BatteryRecord) obj2).f343325e);
            }
        }

        public C114560a(MMKV mmkv) {
            this.f343349b = mmkv;
        }

        /* renamed from: a */
        public static String m161173a(int i) {
            Calendar instance = Calendar.getInstance();
            instance.add(5, i);
            return f343347e.mo181110b().format(instance.getTime());
        }

        /* renamed from: b */
        public String mo173737b(String str, String str2) {
            String str3;
            StringBuilder sb = new StringBuilder();
            sb.append("bs-");
            sb.append(str);
            if (TextUtils.isEmpty(str2)) {
                str3 = "";
            } else {
                str3 = "-" + str2;
            }
            sb.append(str3);
            return sb.toString();
        }

        /* renamed from: c */
        public List<BatteryRecord> mo173738c(String str, String str2) {
            String[] allKeys = this.f343349b.allKeys();
            if (allKeys == null || allKeys.length == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList(Math.min(16, allKeys.length));
            String str3 = mo173737b(str, str2) + "-";
            for (String str4 : allKeys) {
                if (str4.startsWith(str3)) {
                    try {
                        byte[] decodeBytes = this.f343349b.decodeBytes(str4);
                        if (decodeBytes != null) {
                            arrayList.add(BatteryRecord.m161169b(decodeBytes));
                        }
                    } catch (Exception e) {
                        C118672d.m167356f("Matrix.battery.recorder", "record decode failed: " + e.getMessage(), new Object[0]);
                    }
                }
            }
            Collections.sort(arrayList, new C114563c(this));
            return arrayList;
        }
    }
}
