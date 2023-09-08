package de2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import ce2.C28545b;
import ce2.C28546c;
import com.tencent.p014mm.app.C114663g0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatPermissions;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86011o1;
import com.tencent.xweb.file.XVFSFile;
import f40.C86709a0;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

/* renamed from: de2.c */
public final class C86231c implements C28546c {

    /* renamed from: d */
    public static final String f250818d = C28545b.m38262a("¿´¢¾ «ãª¼ª¢¥±§¯¦« ");

    /* renamed from: e */
    public static final String f250819e;

    /* renamed from: f */
    public static final String f250820f;

    /* renamed from: g */
    public static final String f250821g;

    /* renamed from: h */
    public static final String f250822h;

    /* renamed from: i */
    public static final String f250823i;

    /* renamed from: j */
    public static final String f250824j;

    /* renamed from: n */
    public static final String f250825n;

    /* renamed from: o */
    public static final String f250826o;

    /* renamed from: p */
    public static Map<String, C86243e<Boolean>> f250827p;

    /* renamed from: q */
    public static Map<String, C86243e<Void>> f250828q;

    /* renamed from: r */
    public static MMHandler f250829r = new MMHandler(C28545b.m38262a("©§¨¦¦¹¿­¦ë¡¥µ¡«"));

    /* renamed from: s */
    public static final String f250830s = MMApplicationContext.getContext().getPackageName();

    /* renamed from: de2.c$a */
    public class C86232a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f250831d;

        /* renamed from: e */
        public final /* synthetic */ Map f250832e;

        public C86232a(C86231c cVar, String str, Map map) {
            this.f250831d = str;
            this.f250832e = map;
        }

        public void run() {
            ((C86243e) ((TreeMap) C86231c.f250828q).get(this.f250831d)).mo120658a(this.f250832e);
        }
    }

    /* renamed from: de2.c$b */
    public class C86233b implements C86243e<Boolean> {
        /* renamed from: a */
        public Object mo120658a(Object obj) {
            Map map = (Map) obj;
            String str = C86231c.f250825n;
            return Boolean.valueOf(str.equalsIgnoreCase(NetStatusUtil.isWifi(MMApplicationContext.getContext()) ? str : C86231c.f250826o));
        }
    }

    /* renamed from: de2.c$c */
    public class C86234c implements C86243e<Boolean> {
        /* renamed from: a */
        public Object mo120658a(Object obj) {
            Map map = (Map) obj;
            return Boolean.TRUE;
        }
    }

    /* renamed from: de2.c$d */
    public class C86235d implements C86243e<Void> {
        /* renamed from: a */
        public Object mo120658a(Object obj) {
            Map map = (Map) obj;
            try {
                C86231c.m106839a(C86230b.m106832e());
                return null;
            } catch (Throwable th) {
                Log.printErrStackTrace(C86231c.f250818d, th, "[-] Explained by src 2.", new Object[0]);
                return null;
            }
        }
    }

    /* renamed from: de2.c$e */
    public class C86236e implements C86243e<Void> {
        /* renamed from: a */
        public Object mo120658a(Object obj) {
            Map map = (Map) obj;
            try {
                C86009m1 c = C86230b.m106830c(C28545b.m38262a("©¥¶£ê¯¥§»"), ".zip");
                C86230b.m106829b(C86230b.m106834g(), c, (C86011o1) null, (String) null);
                C86231c.m106839a(c);
            } catch (Throwable th) {
                Log.printErrStackTrace(C86231c.f250818d, th, "[-] Explained by src 3.", new Object[0]);
            }
            return null;
        }
    }

    /* renamed from: de2.c$f */
    public class C86237f implements C86243e<Void> {
        /* renamed from: a */
        public Object mo120658a(Object obj) {
            Map map = (Map) obj;
            try {
                C86009m1 c = C86230b.m106830c(C28545b.m38262a("©¥¶£ê¶¥§»"), ".zip");
                C86230b.m106829b(C86230b.m106835h(), c, (C86011o1) null, (String) null);
                C86231c.m106839a(c);
            } catch (Throwable th) {
                Log.printErrStackTrace(C86231c.f250818d, th, "[-] Explained by src 4.", new Object[0]);
            }
            return null;
        }
    }

    /* renamed from: de2.c$g */
    public class C86238g implements C86243e<Void> {
        /* renamed from: a */
        public Object mo120658a(Object obj) {
            String str = (String) ((Map) obj).get(C86231c.f250822h);
            if (TextUtils.isEmpty(str)) {
                Log.m105920e(C86231c.f250818d, "[-] Explained by src 5.");
            } else {
                try {
                    C86009m1 c = C86230b.m106830c(C28545b.m38262a("§§´¥ì±¬"), ".zip");
                    C86230b.m106829b(C86230b.m106833f(), c, new C31168d(this, Pattern.compile(str)), (String) null);
                    C86231c.m106839a(c);
                } catch (Throwable th) {
                    Log.printErrStackTrace(C86231c.f250818d, th, "[-] Explained by src 6: %s", str);
                }
            }
            return null;
        }
    }

    /* renamed from: de2.c$h */
    public class C86239h implements C86243e<Void> {
        /* renamed from: a */
        public Object mo120658a(Object obj) {
            String str;
            String str2 = (String) ((Map) obj).get(C86231c.f250823i);
            if (str2 == null) {
                str2 = "";
            }
            String e = C86231c.m106840e(str2, XVFSFile.PATH_SEPARATOR_CHAR, true);
            try {
                if (TextUtils.isEmpty(e)) {
                    str = C86231c.f250830s;
                } else {
                    str = C86231c.f250830s + XVFSFile.PATH_SEPARATOR + e;
                }
                Context context = MMApplicationContext.getContext();
                String str3 = C86242k.f250833a;
                Intent intent = new Intent(C86242k.f250834b);
                intent.putExtra("op", 1);
                intent.putExtra(C86242k.f250835c, str);
                context.sendBroadcast(intent, C86242k.f250833a);
                return null;
            } catch (Throwable th) {
                Log.printErrStackTrace(C86231c.f250818d, th, "[-] Explained by src 7: %s", e);
                return null;
            }
        }
    }

    /* renamed from: de2.c$i */
    public class C86240i implements C86243e<Void> {
        /* renamed from: a */
        public Object mo120658a(Object obj) {
            String str;
            String str2 = (String) ((Map) obj).get(C86231c.f250823i);
            if (str2 == null) {
                str2 = "";
            }
            String e = C86231c.m106840e(str2, XVFSFile.PATH_SEPARATOR_CHAR, true);
            try {
                if (TextUtils.isEmpty(e)) {
                    str = C86231c.f250830s;
                } else {
                    str = C86231c.f250830s + XVFSFile.PATH_SEPARATOR + e;
                }
                Context context = MMApplicationContext.getContext();
                String str3 = C86242k.f250833a;
                Intent intent = new Intent(C86242k.f250834b);
                intent.putExtra("op", 2);
                intent.putExtra(C86242k.f250835c, str);
                context.sendBroadcast(intent, C86242k.f250833a);
                return null;
            } catch (Throwable th) {
                Log.printErrStackTrace(C86231c.f250818d, th, "[-] Explained by src 8: %s", e);
                return null;
            }
        }
    }

    /* renamed from: de2.c$j */
    public class C86241j implements C86243e<Void> {
        /* renamed from: a */
        public Object mo120658a(Object obj) {
            String str = (String) ((Map) obj).get(C86231c.f250824j);
            if (TextUtils.isEmpty(str)) {
                Log.m105920e(C86231c.f250818d, "filePath NULL");
            } else {
                try {
                    C86009m1 c = C86230b.m106830c(C28545b.m38262a("µ¾³ì±¬"), ".zip");
                    C86230b.m106829b(new C86009m1(str), c, (C86011o1) null, (String) null);
                    C86231c.m106839a(c);
                } catch (Throwable th) {
                    Log.printErrStackTrace(C86231c.f250818d, th, "[-] faild op %s", str);
                }
            }
            return null;
        }
    }

    /* renamed from: de2.c$k */
    public static class C86242k extends BroadcastReceiver {

        /* renamed from: a */
        public static final String f250833a = WeChatPermissions.PERMISSION_MM_MESSAGE();

        /* renamed from: b */
        public static final String f250834b = ("action" + C86231c.f250819e);

        /* renamed from: c */
        public static final String f250835c = C28545b.m38262a("µ´¨£¤±°");

        /* renamed from: d */
        public static final String f250836d = C28545b.m38262a("­­©£° ¶«");

        /* renamed from: e */
        public static C86242k f250837e = null;

        public void finalize() {
            try {
                MMApplicationContext.getContext().unregisterReceiver(this);
            } catch (Throwable unused) {
            }
            super.finalize();
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            String str = f250834b;
            if (!str.equals(action)) {
                Log.m105921e(C86231c.f250818d, "[-] Explained by src 12: %s", action);
                return;
            }
            int intExtra = intent.getIntExtra("op", 0);
            if (intExtra == 1) {
                String stringExtra = intent.getStringExtra(f250835c);
                if (TextUtils.isEmpty(stringExtra)) {
                    Log.m105920e(C86231c.f250818d, "[-] Explained by src 13.");
                } else if (stringExtra.equals(MMApplicationContext.getProcessName())) {
                    try {
                        C86009m1 i = C86230b.m106836i(stringExtra);
                        C86009m1 c = C86230b.m106830c(stringExtra.replace(XVFSFile.PATH_SEPARATOR_CHAR, '-') + "-" + C28545b.m38262a("­ ²°"), ".zip");
                        C86230b.m106829b(i, c, (C86011o1) null, (String) null);
                        String i2 = c.mo119971i();
                        Intent intent2 = new Intent(str);
                        intent2.putExtra("op", 3);
                        intent2.putExtra(f250836d, i2);
                        context.sendBroadcast(intent2, f250833a);
                    } catch (Throwable th) {
                        Log.printErrStackTrace(C86231c.f250818d, th, "[-] Explained by src 14: %s", stringExtra);
                    }
                }
            } else if (intExtra == 2) {
                String stringExtra2 = intent.getStringExtra(f250835c);
                if (TextUtils.isEmpty(stringExtra2)) {
                    Log.m105920e(C86231c.f250818d, "[-] Explained by src 15.");
                } else if (stringExtra2.equals(MMApplicationContext.getProcessName())) {
                    try {
                        C86009m1 j = C86230b.m106837j(stringExtra2);
                        C86009m1 c2 = C86230b.m106830c(stringExtra2.replace(XVFSFile.PATH_SEPARATOR_CHAR, '-') + "-" + C28545b.m38262a("´­ ²°"), ".zip");
                        C86230b.m106829b(j, c2, (C86011o1) null, (String) null);
                        String i3 = c2.mo119971i();
                        Intent intent3 = new Intent(str);
                        intent3.putExtra("op", 3);
                        intent3.putExtra(f250836d, i3);
                        context.sendBroadcast(intent3, f250833a);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace(C86231c.f250818d, th4, "[-] Explained by src 16: %s", stringExtra2);
                    }
                }
            } else if (intExtra != 3) {
                Log.m105921e(C86231c.f250818d, "[-] Unknown op: %s", Integer.valueOf(intExtra));
            } else if (MMApplicationContext.isMainProcess()) {
                String stringExtra3 = intent.getStringExtra(f250836d);
                if (stringExtra3 == null || stringExtra3.isEmpty()) {
                    Log.m105921e(C86231c.f250818d, "[-] Explained by src 17: %s", stringExtra3);
                    return;
                }
                try {
                    C86231c.m106839a(new C86009m1(stringExtra3));
                } catch (Throwable th5) {
                    Log.printErrStackTrace(C86231c.f250818d, th5, "[-] Explained by src 18.", new Object[0]);
                }
            }
        }
    }

    static {
        String a = C28545b.m38262a("ù³¼¶ý¨¤¯¨¦¦¹¿­¦è¡¥µ¡«");
        f250819e = a;
        f250820f = a + C28545b.m38262a("êá²¦²¦§·");
        f250821g = a + C28545b.m38262a("åà«£³·®°¨");
        f250822h = a + C28545b.m38262a("æí¤ª© µ¥¦§»");
        f250823i = a + C28545b.m38262a("åàµ´¨£¤±°");
        f250824j = a + C28545b.m38262a("çî­­©£° ¶«");
        String a2 = C28545b.m38262a("·¨¤ª");
        f250825n = a2;
        String a3 = C28545b.m38262a(" ¬º");
        f250826o = a3;
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        f250827p = new TreeMap(comparator);
        f250828q = new TreeMap(comparator);
        f250827p.put(a2, new C86233b());
        f250827p.put(a3, new C86234c());
        f250828q.put(C28545b.m38262a("¦¤µ¢í ²¨"), new C86235d());
        f250828q.put(C28545b.m38262a("©¥¶£ê¯¥§»"), new C86236e());
        f250828q.put(C28545b.m38262a("©¥¶£ê¶¥§»"), new C86237f());
        f250828q.put(C28545b.m38262a("§§´¥ì±¬"), new C86238g());
        f250828q.put(C28545b.m38262a("­ ²°"), new C86239h());
        f250828q.put(C28545b.m38262a("´­ ²°"), new C86240i());
        f250828q.put(C28545b.m38262a("µ¾³ì±¬"), new C86241j());
    }

    public C86231c() {
        Context context = MMApplicationContext.getContext();
        String str = C86242k.f250833a;
        synchronized (C86242k.class) {
            if (C86242k.f250837e == null) {
                C86242k.f250837e = new C86242k();
                try {
                    context.registerReceiver(C86242k.f250837e, new IntentFilter(C86242k.f250834b), C86242k.f250833a, (Handler) null);
                } catch (Throwable th) {
                    Log.printErrStackTrace(f250818d, th, "[-] Fail to register receiver.", new Object[0]);
                    Log.appenderFlush();
                }
            } else {
                return;
            }
        }
        return;
    }

    /* renamed from: a */
    public static void m106839a(C86009m1 m1Var) {
        int i;
        try {
            i = C86709a0.m107523b().mo121110g();
        } catch (Throwable unused) {
            i = 0;
        }
        C114663g0.m161243c(m1Var.mo119971i(), 12347, i, (String) null, (String) null, (C114663g0.C114666c) null);
        Log.m105925i(f250818d, "[+] Explained by src 1: %s", m1Var.mo119971i());
    }

    /* renamed from: e */
    public static String m106840e(String str, char c, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i = 0;
        if (str.charAt(0) == c) {
            i = 1;
        }
        while (z && i < str.length() && str.charAt(i) == c) {
            i++;
        }
        return str.substring(i);
    }

    /* renamed from: b */
    public String mo56049b() {
        return f250819e;
    }

    /* renamed from: c */
    public void mo56050c(Map<String, String> map) {
        String str = map.get(f250820f);
        if (Util.isNullOrNil(str)) {
            Log.m105920e(f250818d, "[-] Target is null or empty!");
        } else if (!((TreeMap) f250828q).containsKey(str)) {
            Log.m105920e(f250818d, "[-] Target is absent.");
        } else {
            String str2 = f250821g;
            String str3 = f250825n;
            String str4 = map.get(str2);
            if (str4 == null) {
                str4 = str3;
            }
            if (!((TreeMap) f250827p).containsKey(str4)) {
                Log.m105921e(f250818d, "[-] Explained by src 9: %s", str4);
            } else if (!((Boolean) ((C86243e) ((TreeMap) f250827p).get(str4)).mo120658a(map)).booleanValue()) {
                String str5 = f250818d;
                Object[] objArr = new Object[2];
                if (!NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                    str3 = f250826o;
                }
                objArr[0] = str3;
                objArr[1] = str4;
                Log.m105929w(str5, "[!] Explained by src 10: %s, %s", objArr);
            } else {
                String str6 = f250818d;
                Object[] objArr2 = new Object[3];
                objArr2[0] = str;
                objArr2[1] = str4;
                if (!NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                    str3 = f250826o;
                }
                objArr2[2] = str3;
                Log.m105925i(str6, "[+] Explained by src 11: %s, %s, %s", objArr2);
                f250829r.post(new C86232a(this, str, map));
            }
        }
    }

    /* renamed from: d */
    public void mo56051d() {
    }
}
