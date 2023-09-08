package ww0;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import de3.C31171e;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import h81.C32735h;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import te3.w35;
import u73.C101980n;
import xw0.C38860a;
import xw0.C53452b;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: ww0.j */
public class C53209j extends C86301e implements C78732i {

    /* renamed from: f */
    public static List<Pattern> f148430f = new ArrayList();

    /* renamed from: g */
    public static int[] f148431g = {3, 3, 3, 3, 3, 3, 3, 3, 6, 6, 6, 6, 6, 6, 6, 6};

    /* renamed from: h */
    public static HashMap<String, String> f148432h = new HashMap<>();

    /* renamed from: i */
    public static long f148433i = 0;

    /* renamed from: j */
    public static final int[] f148434j = {64};

    /* renamed from: d */
    public C53203a f148435d = new C53203a();

    /* renamed from: e */
    public boolean f148436e = false;

    /* renamed from: ww0.j$a */
    public class C38311a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f101132d;

        public C38311a(String str) {
            this.f101132d = str;
        }

        public void run() {
            try {
                if (C53204g.m59622j(this.f101132d) == 0) {
                    C53204g.m59614b(true);
                    C53204g.m59619g(C53204g.m59617e(false));
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Box.PluginBox", e, "[updateWordBankRes]", new Object[0]);
            }
        }
    }

    /* renamed from: ww0.j$b */
    public class C38312b implements Runnable {
        public C38312b() {
        }

        public void run() {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                if (!C53209j.this.f148436e) {
                    Log.m105924i("MicroMsg.Box.PluginBox", "start to load flight number");
                    C53209j.this.f148436e = true;
                    if (!C86013q1.m106450k(C53209j.vx0())) {
                        Log.m105924i("MicroMsg.Box.PluginBox", "flight number file not exist");
                        C53209j.this.f148436e = false;
                        return;
                    }
                    String[] split = new String(C86013q1.m106433O(C53209j.vx0(), 0, -1)).split("\n");
                    C31171e eVar = C31171e.f83548d;
                    eVar.f83551c = null;
                    eVar.f83549a = 0;
                    eVar.f83550b = 0;
                    for (int i = 0; i < split.length; i++) {
                        if (!Util.isNullOrNil(split[i])) {
                            C31171e.f83548d.mo58012a(split[i]);
                        }
                    }
                    C53209j.this.getClass();
                    C31171e eVar2 = C31171e.f83548d;
                    Log.m105925i("MicroMsg.Box.PluginBox", "load flight number success NodeCount：%d CharacterCount：%d useTime: %d", Integer.valueOf(eVar2.f83550b), Integer.valueOf(eVar2.f83549a), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                } else {
                    Log.m105924i("MicroMsg.Box.PluginBox", "flight number is loading");
                }
            } catch (Exception e) {
                C38860a.m41966a(0);
                Log.printErrStackTrace("MicroMsg.Box.PluginBox", e, e.getMessage(), new Object[0]);
            } catch (Throwable th) {
                C53209j.this.f148436e = false;
                throw th;
            }
            C53209j.this.f148436e = false;
        }
    }

    /* renamed from: ww0.j$c */
    public class C53210c implements Comparator<w35> {
        public C53210c(C53209j jVar) {
        }

        public int compare(Object obj, Object obj2) {
            return ((w35) obj2).f143846e - ((w35) obj).f143846e;
        }
    }

    static {
        String[] strArr = {"(|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)( )?“(.{2,36}?)”(微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)", "(搜索并关注|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)( )?【(.{2,36}?)】(微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)", "(搜索并关注|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)( )?\\[(.{2,36}?)\\](微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)", "(搜索并关注|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)( )?\\((.{2,36}?)\\)(微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)", "(搜索并关注|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)( )?（(.{2,36}?)）(微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)", "(搜索并关注|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)( )?\"(.{2,36}?)\"(微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)", "(搜索并关注|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)( )?「(.{2,36}?)」(微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)", "(搜索并关注|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)( )?'(.{2,36}?)'(微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)", "(搜索并关注|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)(微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)( )?“(.{2,36}?)”", "(搜索并关注|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)(微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)( )?\"(.{2,36}?)\"", "(搜索并关注|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)(微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)( )?【(.{2,36}?)】", "(搜索并关注|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)(微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)( )?\\[(.{2,36}?)\\]", "(搜索并关注|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)(微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)( )?\\((.{2,36}?)\\)", "(搜索并关注|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)(微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)( )?（(.{2,36}?)）", "(搜索并关注|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)(微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)( )?「(.{2,36}?)」", "(搜索并关注|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)(微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)( )?'(.{2,36}?)'"};
        for (int i = 0; i < 16; i++) {
            f148430f.add(Pattern.compile(strArr[i]));
        }
    }

    public static String vx0() {
        return new C86009m1(new C86009m1(C43471q.m46983g(2).mo71077o()).mo119974l(), "flight.txt").mo119971i();
    }

    public static void yx0(String str, boolean z) {
        int i;
        Uri.Builder builder;
        int c = C53204g.m59615c();
        C86009m1 m1Var = new C86009m1(MMApplicationContext.getContext().getCacheDir(), "wordBank/temp");
        if (m1Var.mo119967g()) {
            C86013q1.m106445f(m1Var.mo119971i());
        }
        m1Var.mo119987x();
        int R = C86013q1.m106436R(str, m1Var.mo119971i());
        if (R < 0) {
            Log.m105920e("MicroMsg.HotWordSearchUtil", "unzip fail, ret = " + R + ", zipFilePath = " + str + ", unzipPath = " + m1Var.mo119971i());
            i = -1;
        } else {
            Uri uri = m1Var.f250486d;
            if (uri == null) {
                builder = new Uri.Builder().path("config.conf");
            } else {
                builder = uri.buildUpon();
                builder.appendPath("config.conf");
            }
            Uri build = builder.build();
            String path = build.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!build.getPath().equals(k)) {
                    build = builder.path(k).build();
                }
            }
            Properties properties = new Properties();
            InputStream inputStream = null;
            try {
                inputStream = C86013q1.m106421C(build, C116281f0.C116289i.f348994a.mo177799l(build, (C116281f0.C116288h) null));
                properties.load(inputStream);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.HotWordSearchUtil", e, "[getWordBankVersionFromZip] %s", str);
            } catch (Throwable th) {
                C116299g2.m163847c(inputStream);
                throw th;
            }
            C116299g2.m163847c(inputStream);
            i = Integer.parseInt(properties.getProperty(ProviderConstants.API_COLNAME_FEATURE_VERSION, String.valueOf(1)).trim());
        }
        if (i >= c || z) {
            Log.m105925i("MicroMsg.Box.PluginBox", "[updateWordBankRes] currVersion=%s, recvVersion: %d, start to update", Integer.valueOf(c), Integer.valueOf(i));
            ((C119157j) C119157j.f356862d).mo183876g(new C38311a(str), "box.HotWordSearchModel");
            return;
        }
        Log.m105925i("MicroMsg.Box.PluginBox", "[updateWordBankRes] currVersion=%s, recvVersion: %d, pass", Integer.valueOf(c), Integer.valueOf(i));
    }

    public String I80() {
        AtomicBoolean atomicBoolean = C53204g.f148408a;
        return C53204g.m59615c() + "_" + C53204g.f148414g;
    }

    public String Lp0(String str) {
        Matcher matcher = C53452b.f150354a.matcher(str);
        if (matcher.find()) {
            String group = matcher.group();
            if (group.length() <= 15 && group.length() >= 13) {
                return "$Express$";
            }
        }
        String wx02 = wx0(str);
        if (!Util.isNullOrNil(wx02)) {
            return wx02;
        }
        LinkedList<w35> f = C53204g.m59618f(str);
        Collections.sort(f, new C53207h());
        return f.size() > 0 ? f.get(0).f143845d : "";
    }

    /* renamed from: MS */
    public int mo73878MS() {
        return Math.max(C53204g.f148421n, 1);
    }

    public String Sg0(String str, String str2) {
        if ("$Express$".equals(str)) {
            Matcher matcher = C53452b.f150354a.matcher(str2);
            if (matcher.find()) {
                String group = matcher.group();
                if (group.length() <= 15 && group.length() >= 13) {
                    return group;
                }
            }
        }
        String wx02 = wx0(str2);
        return !Util.isNullOrNil(wx02) ? wx02 : str;
    }

    public String js0(String str) {
        return "$Express$".equals(str) ? ((C101980n) C86312j.m106911c(C101980n.class)).mo134682BU("express") : str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006e A[LOOP:0: B:15:0x0068->B:17:0x006e, LOOP_END] */
    /* renamed from: ka */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ww0.C78732i.C53208a mo73881ka(java.lang.String r11) {
        /*
            r10 = this;
            ww0.i$a r0 = new ww0.i$a
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.regex.Pattern r3 = xw0.C53452b.f150354a
            java.util.regex.Matcher r3 = r3.matcher(r11)
            boolean r4 = r3.find()
            r5 = 1
            java.lang.String r6 = "$Express$"
            r7 = 0
            if (r4 == 0) goto L_0x003e
            java.lang.String r3 = r3.group()
            int r4 = r3.length()
            r8 = 15
            if (r4 > r8) goto L_0x003e
            int r3 = r3.length()
            r4 = 13
            if (r3 < r4) goto L_0x003e
            r1.add(r6)
            java.lang.String r3 = "2"
            r2.add(r3)
            r3 = 2
            r4 = 1
            goto L_0x0042
        L_0x003e:
            java.lang.String r6 = ""
            r3 = -1
            r4 = 0
        L_0x0042:
            java.lang.String r8 = r10.wx0(r11)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r9 != 0) goto L_0x0058
            r1.add(r8)
            if (r4 != 0) goto L_0x0053
            r3 = 3
            r6 = r8
        L_0x0053:
            java.lang.String r8 = "3"
            r2.add(r8)
        L_0x0058:
            java.util.LinkedList r11 = ww0.C53204g.m59618f(r11)
            ww0.j$c r8 = new ww0.j$c
            r8.<init>(r10)
            java.util.Collections.sort(r11, r8)
            java.util.Iterator r8 = r11.iterator()
        L_0x0068:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x007f
            java.lang.Object r9 = r8.next()
            te3.w35 r9 = (te3.w35) r9
            java.lang.String r9 = r9.f143845d
            r1.add(r9)
            java.lang.String r9 = "1"
            r2.add(r9)
            goto L_0x0068
        L_0x007f:
            int r8 = r11.size()
            if (r8 <= 0) goto L_0x0090
            if (r4 != 0) goto L_0x0090
            java.lang.Object r11 = r11.get(r7)
            te3.w35 r11 = (te3.w35) r11
            java.lang.String r6 = r11.f143845d
            goto L_0x0091
        L_0x0090:
            r5 = r3
        L_0x0091:
            java.lang.String r11 = "|"
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r1, r11)
            r0.f148428c = r1
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r2, r11)
            r0.f148429d = r11
            r0.f148426a = r6
            r0.f148427b = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ww0.C53209j.mo73881ka(java.lang.String):ww0.i$a");
    }

    public void onAccountInitialized(Context context) {
        xx0();
        ((C119157j) C119157j.f356862d).mo183876g(C53204g.f148420m, "box.HotWordSearchModel");
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("MicroMsg.Box.PluginBox");
        long decodeLong = singleMMKV.decodeLong("last_check_res_time", 0);
        long currentTimeMillis = System.currentTimeMillis();
        long abs = Math.abs(currentTimeMillis - decodeLong);
        if (abs < 86400000) {
            Log.m105925i("MicroMsg.Box.PluginBox", "manualCheckRes return lastCheckTime %d, current %d, gap %d", Long.valueOf(decodeLong), Long.valueOf(currentTimeMillis), Long.valueOf(abs));
            return;
        }
        singleMMKV.encode("last_check_res_time", currentTimeMillis);
        Log.m105924i("MicroMsg.Box.PluginBox", "manualCheckRes");
        MMHandlerThread.postToMainThreadDelayed(new C38313k(this), 3000);
    }

    public final String wx0(String str) {
        boolean z;
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_hotword_tmp_match_outshow_switch, 0);
        Log.m105919d("MicroMsg.Box.PluginBox", "isSupportHotWordPrioritySwt() swt:%s", Integer.valueOf(Qe));
        if (!(Qe == 1)) {
            return null;
        }
        if (f148432h.containsKey(str)) {
            Log.m105925i("MicroMsg.Box.PluginBox", " getHotWordHighPriority text = %s, hit = %s.", str, f148432h.get(str));
            return f148432h.get(str);
        }
        if (f148432h.size() > 32 || f148433i > 500) {
            f148432h.clear();
            f148433i = 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ((ArrayList) f148430f).size(); i++) {
            int i2 = f148431g[i];
            Matcher matcher = ((Pattern) ((ArrayList) f148430f).get(i)).matcher(str);
            if (matcher.find() && i2 <= matcher.groupCount()) {
                String group = matcher.group(i2);
                if (!Util.isNullOrNil(group) && !arrayList.contains(group)) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayList.size()) {
                            z = false;
                            break;
                        }
                        String str2 = (String) arrayList.get(i3);
                        if (!Util.isNullOrNil(str2) && str2.contains(group)) {
                            z = true;
                            break;
                        }
                        i3++;
                    }
                    if (z) {
                        arrayList.remove(i3);
                        arrayList.add(i3, group);
                    } else {
                        arrayList.add(group);
                    }
                }
            }
        }
        Log.m105924i("MicroMsg.Box.PluginBox", "getHotWordHighPriority time = " + (System.currentTimeMillis() - currentTimeMillis));
        if (arrayList.size() < 1 || Util.isNullOrNil((String) arrayList.get(0))) {
            return null;
        }
        f148433i += (long) ((String) arrayList.get(0)).length();
        f148432h.put(str, (String) arrayList.get(0));
        return (String) arrayList.get(0);
    }

    public void xx0() {
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_flight_num_flag, 0) != 0) {
            ((C119157j) C119157j.f356862d).mo183876g(new C38312b(), "Box.LoadFlightNumberAsync");
        }
    }
}
