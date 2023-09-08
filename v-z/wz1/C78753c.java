package wz1;

import android.util.Pair;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import eb0.C31543z5;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p823sg.C101611g;
import p823sg.C90193h;
import sz1.C77815b;
import xz1.C79013a;
import xz1.C79014b;
import xz1.C79015c;
import zt3.C119157j;

/* renamed from: wz1.c */
public class C78753c {

    /* renamed from: a */
    public ConcurrentHashMap<String, C78755b> f230459a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public ConcurrentLinkedQueue<C78755b> f230460b = new ConcurrentLinkedQueue<>();

    /* renamed from: c */
    public ConcurrentHashMap<String, C79013a> f230461c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public ConcurrentHashMap<String, C79013a> f230462d = new ConcurrentHashMap<>();

    /* renamed from: e */
    public ConcurrentHashMap<String, C78746a> f230463e = new ConcurrentHashMap<>();

    /* renamed from: f */
    public Pattern f230464f;

    /* renamed from: g */
    public Pattern f230465g;

    /* renamed from: h */
    public Pattern f230466h;

    /* renamed from: i */
    public Pattern f230467i;

    /* renamed from: j */
    public Pattern f230468j;

    /* renamed from: k */
    public Pattern f230469k;

    /* renamed from: l */
    public Pattern f230470l;

    /* renamed from: wz1.c$a */
    public class C78754a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f230471d;

        /* renamed from: e */
        public final /* synthetic */ String f230472e;

        public C78754a(C78753c cVar, String str, String str2) {
            this.f230471d = str;
            this.f230472e = str2;
        }

        public void run() {
            ((C77815b) C86312j.m106911c(C77815b.class)).xx0().mo108980Ow(this.f230471d, this.f230472e, true);
        }
    }

    /* renamed from: wz1.c$b */
    public class C78755b {

        /* renamed from: a */
        public String f230473a;

        /* renamed from: b */
        public int f230474b;

        public C78755b(C78753c cVar, String str, int i) {
            this.f230473a = str;
            this.f230474b = i;
        }

        public boolean equals(Object obj) {
            return Util.isEqual(this.f230473a, ((C78755b) obj).f230473a);
        }

        public int hashCode() {
            return this.f230473a.hashCode();
        }
    }

    public C78753c() {
        Class cls = C32735h.class;
        C101611g<Integer, C79013a> gVar = C78747b.f230457a;
        String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_android_solitaire_content_regex, "^([0-9]{1,3})(\\s*)([[)]．.,~。，、:;\\-_#@!&*%）：；\\—\\—！])(\\s*)");
        Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireHelp", "mainBodyRegex:%s", Y60);
        this.f230464f = Pattern.compile(Y60);
        String Y602 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_android_solitaire_example_regex, "(例|例如|如|格式|格式如)(\\s*)([,.:，：、 ])(.+)");
        Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireHelp", "exampleRegex:%s", Y602);
        this.f230465g = Pattern.compile(Y602);
        String Y603 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_android_solitaire_separator_regex, "^([0-9]{1,3})(\\s*)([[)]．.,~。，、:;\\-_#@!&*%）：；\\—\\—！])");
        Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireHelp", "separatorRegex:%s", Y603);
        this.f230466h = Pattern.compile(Y603);
        String Y604 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_android_solitaire_num_regex, "^\\d{1,3}");
        Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireHelp", "numRegex:%s", Y604);
        this.f230467i = Pattern.compile(Y604);
        String Y605 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_android_solitaire_content_separator_regex, "([0-9]{1,3})(\\s*)([.。;；、:,，])");
        Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireHelp", "contentSeparatorRegex:%s", Y605);
        this.f230468j = Pattern.compile(Y605);
        String Y606 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_android_solitaire_content_num_regex, "\\d{1,3}");
        Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireHelp", "contentNumRegex:%s", Y606);
        this.f230469k = Pattern.compile(Y606);
        String Y607 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_android_solitaire_single_num_regex, "^\\d{1,3}$");
        Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireHelp", "SingleNum:%s", Y607);
        this.f230470l = Pattern.compile(Y607);
        try {
            if (MultiProcessMMKV.getMMKV("group_solitatire").containsKey("analyze_crash_content_num")) {
                MultiProcessMMKV.getMMKV("group_solitatire").remove("analyze_crash_content_num");
            }
            String[] split = MultiProcessMMKV.getMMKV("group_solitatire").getString("analyze_crash_content_num_new", "").split(";");
            if (split != null) {
                int i = 0;
                for (int length = split.length - 1; length >= 0; length--) {
                    String str = split[length];
                    if (!Util.isNullOrNil(str)) {
                        i++;
                        if (i <= 20) {
                            String[] split2 = str.split(",");
                            if (split2 != null && split2.length == 2) {
                                C78755b bVar = new C78755b(this, split2[0], Util.getInt(split2[1], 0));
                                this.f230459a.put(split2[0], bVar);
                                this.f230460b.add(bVar);
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.groupsolitaire.GroupSolitatireManager", "GroupSolitatireManager %s %s", e.getClass().getSimpleName(), e.getMessage());
        }
    }

    /* renamed from: d */
    public static String m95127d(String str) {
        if (str.length() > 200) {
            str = str.substring(0, WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE);
        }
        return C90193h.m112878f(str.getBytes());
    }

    /* renamed from: a */
    public final void mo108664a(String str) {
        if (!Util.isNullOrNil(str)) {
            String d = m95127d(str);
            if (this.f230459a.containsKey(d)) {
                this.f230459a.get(d).f230474b++;
            } else {
                C78755b bVar = new C78755b(this, d, 1);
                this.f230459a.put(d, bVar);
                this.f230460b.add(bVar);
            }
            mo108675m();
        }
    }

    /* renamed from: b */
    public void mo108665b(String str, String str2) {
        Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireManager", "deleteGroupSolitatireInCache() username:%s key:%s", str, str2);
        ConcurrentHashMap<String, C79013a> concurrentHashMap = this.f230461c;
        concurrentHashMap.remove(str + str2);
    }

    /* renamed from: c */
    public C78746a mo108666c(String str) {
        Class cls = C77815b.class;
        Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireManager", "getChatRoomGroupSolitatire() username:%s", str);
        if (Util.isNullOrNil(str)) {
            return null;
        }
        C78746a aVar = this.f230463e.get(str);
        if (aVar == null) {
            aVar = new C78746a();
            aVar.f230456e = (long) C31543z5.m39455e();
            List<C79013a> qq = ((C77815b) C86312j.m106911c(cls)).xx0().mo108985qq(str, 0);
            List<C79013a> qq4 = ((C77815b) C86312j.m106911c(cls)).xx0().mo108985qq(str, 1);
            ArrayList arrayList = (ArrayList) qq;
            if (arrayList.size() > C78747b.m95119s()) {
                aVar.f230454c = false;
                aVar.f230455d = ((C79013a) arrayList.get(C78747b.m95119s() - 1)).field_lastActiveTime;
            } else {
                aVar.f230454c = true;
                aVar.f230455d = ((long) C31543z5.m39455e()) - (((long) C78747b.m95116p()) * C79015c.f232017f.longValue());
            }
            ArrayList arrayList2 = (ArrayList) qq4;
            if (arrayList2.size() > C78747b.m95118r()) {
                aVar.f230452a = false;
                aVar.f230453b = ((C79013a) arrayList2.get(C78747b.m95118r() - 1)).field_lastActiveTime;
            } else {
                aVar.f230452a = true;
                aVar.f230453b = ((long) C31543z5.m39455e()) - (((long) 5) * C79015c.f232016e.longValue());
            }
            this.f230463e.put(str, aVar);
        } else if (aVar.f230456e - ((long) C31543z5.m39455e()) > 10) {
            aVar.f230456e = (long) C31543z5.m39455e();
            Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireManager", "updateMatchChatRoomGroupSolitatire() username:%s", str);
            if (!Util.isNullOrNil(str)) {
                long e = ((long) C31543z5.m39455e()) - (((long) C78747b.m95116p()) * C79015c.f232017f.longValue());
                if (aVar.f230454c) {
                    aVar.f230455d = e;
                } else if (aVar.f230455d < e) {
                    aVar.f230454c = true;
                    aVar.f230455d = e;
                }
            }
            Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireManager", "updateActiveChatRoomGroupSolitatire() username:%s", str);
            if (!Util.isNullOrNil(str)) {
                long e2 = (long) C31543z5.m39455e();
                C101611g<Integer, C79013a> gVar = C78747b.f230457a;
                long longValue = e2 - (((long) 5) * C79015c.f232016e.longValue());
                if (aVar.f230452a) {
                    aVar.f230453b = longValue;
                } else if (aVar.f230453b < longValue) {
                    aVar.f230452a = true;
                    aVar.f230453b = longValue;
                }
            }
        }
        return aVar;
    }

    /* renamed from: e */
    public final int mo108667e(String str) {
        if (!Util.isNullOrNil(str)) {
            String d = m95127d(str);
            if (this.f230459a.containsKey(d)) {
                return this.f230459a.get(d).f230474b;
            }
        }
        return 0;
    }

    /* renamed from: f */
    public C79013a mo108668f(String str, String str2) {
        int i;
        Class cls = C77815b.class;
        Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireManager", "getGroupSolitatireFromCache() username:%s key:%s", str, str2);
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            return null;
        }
        ConcurrentHashMap<String, C79013a> concurrentHashMap = this.f230461c;
        C79013a aVar = concurrentHashMap.get(str + str2);
        if (aVar == null) {
            aVar = ((C77815b) C86312j.m106911c(cls)).xx0().mo108980Ow(str, str2, true);
            if (aVar != null) {
                ConcurrentHashMap<String, C79013a> concurrentHashMap2 = this.f230461c;
                concurrentHashMap2.put(str + str2, aVar);
            }
        } else {
            C78746a c = ((C77815b) C86312j.m106911c(cls)).vx0().mo108666c(str);
            if (c != null && (((i = aVar.field_active) == 1 && aVar.field_lastActiveTime < c.f230453b) || (i == 0 && aVar.field_lastActiveTime < c.f230455d))) {
                mo108665b(str, str2);
                ((C119157j) C119157j.f356862d).mo183875f(new C78754a(this, str, str2));
                return null;
            }
        }
        return aVar;
    }

    /* renamed from: g */
    public final List<C79014b> mo108669g(C79013a aVar, String str) {
        C79014b bVar;
        ArrayList arrayList = new ArrayList();
        C79014b bVar2 = new C79014b();
        Matcher matcher = this.f230466h.matcher(str.trim());
        Matcher matcher2 = this.f230467i.matcher(str.trim());
        if (matcher.find()) {
            Matcher matcher3 = this.f230467i.matcher(matcher.group(0).trim());
            if (matcher3.find()) {
                bVar2.f232015f = Util.getInt(matcher3.group(0), 0);
            }
            bVar2.f232012c = matcher3.replaceFirst("").trim();
            bVar2.f232014e = matcher.replaceFirst("").trim();
        } else if (matcher2.find()) {
            bVar2.f232015f = Util.getInt(matcher2.group(0), 0);
            String trim = matcher2.replaceFirst("").trim();
            bVar2.f232014e = trim;
            if (Util.isNullOrNil(trim) || Util.isNullOrNil(bVar2.f232014e.trim())) {
                return null;
            }
        }
        if (aVar != null) {
            Matcher matcher4 = this.f230468j.matcher(bVar2.f232014e);
            if (matcher4.find()) {
                int indexOf = bVar2.f232014e.indexOf(matcher4.group(0));
                if (indexOf != -1) {
                    String substring = bVar2.f232014e.substring(0, indexOf);
                    if (Util.isNullOrNil(substring) || Util.isNullOrNil(substring.trim())) {
                        arrayList.add(bVar2);
                    } else {
                        int i = 1;
                        while (true) {
                            if (i > aVar.f232007N.size()) {
                                bVar = null;
                                break;
                            } else if (C79014b.m95553c(aVar.f232007N.get(Integer.valueOf(i)).f232014e, substring.trim())) {
                                bVar = aVar.f232007N.get(Integer.valueOf(i));
                                break;
                            } else {
                                i++;
                            }
                        }
                        if (bVar != null) {
                            String str2 = bVar2.f232014e;
                            bVar2.f232014e = bVar.f232014e;
                            arrayList.add(bVar2);
                            String substring2 = str2.substring(indexOf);
                            if (!Util.isNullOrNil(substring2) && !Util.isNullOrNil(substring2.trim())) {
                                mo108670h(arrayList, aVar, substring2.trim());
                            }
                        } else {
                            arrayList.add(bVar2);
                        }
                    }
                } else {
                    arrayList.add(bVar2);
                }
            } else {
                arrayList.add(bVar2);
            }
        } else {
            arrayList.add(bVar2);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: h */
    public final void mo108670h(List<C79014b> list, C79013a aVar, String str) {
        if (!Util.isNullOrNil(str)) {
            C79014b bVar = new C79014b();
            Matcher matcher = this.f230468j.matcher(str);
            if (matcher.find()) {
                Matcher matcher2 = this.f230469k.matcher(matcher.group(0).trim());
                if (matcher2.find()) {
                    bVar.f232015f = Util.getInt(matcher2.group(0), 0);
                }
                bVar.f232012c = matcher2.replaceFirst("").trim();
                String trim = matcher.replaceFirst("").trim();
                bVar.f232014e = trim;
                Matcher matcher3 = this.f230468j.matcher(trim);
                if (matcher3.find()) {
                    int indexOf = bVar.f232014e.indexOf(matcher3.group(0));
                    if (indexOf != -1) {
                        String substring = bVar.f232014e.substring(0, indexOf);
                        if (Util.isNullOrNil(substring) || Util.isNullOrNil(substring.trim())) {
                            list.add(bVar);
                            return;
                        }
                        C79014b bVar2 = null;
                        int i = 1;
                        while (true) {
                            if (i > aVar.f232007N.size()) {
                                break;
                            } else if (Util.isEqual(aVar.f232007N.get(Integer.valueOf(i)).f232014e, substring.trim())) {
                                bVar2 = aVar.f232007N.get(Integer.valueOf(i));
                                break;
                            } else {
                                i++;
                            }
                        }
                        if (bVar2 != null) {
                            String str2 = bVar.f232014e;
                            bVar.f232014e = bVar2.f232014e;
                            list.add(bVar);
                            String substring2 = str2.substring(indexOf);
                            if (!Util.isNullOrNil(substring2) && !Util.isNullOrNil(substring2.trim())) {
                                mo108670h(list, aVar, substring2.trim());
                                return;
                            }
                            return;
                        }
                        list.add(bVar);
                        return;
                    }
                    list.add(bVar);
                    return;
                }
                list.add(bVar);
            }
        }
    }

    /* renamed from: i */
    public final Pair<Boolean, C79013a> mo108671i(String str, String[] strArr) {
        boolean z;
        int i;
        boolean z2;
        int length;
        int i2;
        int length2 = str.length();
        int length3 = strArr.length - 1;
        while (true) {
            z = false;
            if (length3 < 0) {
                i = 0;
                length3 = 0;
                z2 = false;
                break;
            }
            String str2 = strArr[length3];
            int length4 = length2 - str2.length();
            if (this.f230470l.matcher(str2.trim()).find()) {
                i = str.indexOf(str2, length4);
                z2 = true;
                break;
            }
            length2 = length4 - 1;
            length3--;
        }
        if (!z2) {
            return new Pair<>(Boolean.FALSE, (Object) null);
        }
        C79013a aVar = new C79013a();
        if (i >= 0 && i <= str.length()) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i3 >= length3) {
                    i2 = -1;
                    break;
                }
                String str3 = strArr[i3];
                Matcher matcher = this.f230465g.matcher(str3.trim());
                if (matcher.find()) {
                    String group = matcher.group(0);
                    i2 = Util.isNullOrNil(group) ? str.indexOf(str3, i4) : str.indexOf(group, i4);
                } else {
                    i4 = i4 + str3.length() + 1;
                    i3++;
                }
            }
            if (i2 != 0) {
                if (i2 == -1) {
                    aVar.f232001H = str.substring(0, i).trim();
                } else {
                    aVar.f232001H = str.substring(0, i2).trim();
                }
            }
            if (C78747b.m95094F(aVar.f232001H)) {
                return new Pair<>(Boolean.FALSE, (Object) null);
            }
            if (i2 >= 0 && i2 <= i) {
                aVar.f232002I = str.substring(i2, i).trim();
            }
        }
        if (length3 >= 0 && length3 < strArr.length && (length = i + strArr[length3].length()) > 0 && length < str.length()) {
            aVar.f232003J = str.substring(length).trim();
        }
        if (C78747b.m95125y(aVar.f232003J) > C78747b.m95120t() * 2) {
            z = true;
        }
        if (z) {
            return new Pair<>(Boolean.FALSE, (Object) null);
        }
        aVar.f232009Q++;
        return new Pair<>(Boolean.TRUE, aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:339:0x08b9  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x08c7  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x0949  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x09a1  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair<java.lang.Integer, xz1.C79013a> mo108672j(java.lang.String r45, int r46, java.lang.String r47) {
        /*
            r44 = this;
            r1 = r44
            r0 = r47
            java.lang.Class<sz1.b> r2 = sz1.C77815b.class
            java.lang.String r3 = "matchGroupSolitatire() internal:%s size:%s groupItem:%s"
            java.lang.String r4 = "MicroMsg.groupsolitaire.GroupSolitatireManager"
            java.lang.String r5 = "matchGroupSolitatire()"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r45)
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r8 = 0
            if (r5 == 0) goto L_0x0021
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r7, r8)
            return r0
        L_0x0021:
            java.lang.String r5 = r45.trim()
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r9 == 0) goto L_0x0031
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r7, r8)
            return r0
        L_0x0031:
            java.lang.String r9 = "\n"
            java.lang.String[] r9 = r5.split(r9)
            int r10 = r9.length
            r11 = 1000(0x3e8, float:1.401E-42)
            if (r10 <= r11) goto L_0x0047
            java.lang.String r0 = "matchGroupSolitatire() contentArray.length > 1000"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r7, r8)
            return r0
        L_0x0047:
            int r10 = r1.mo108667e(r5)
            r11 = 3
            if (r10 <= r11) goto L_0x0059
            java.lang.String r0 = "matchGroupSolitatire() getCrashNum() > 3"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r7, r8)
            return r0
        L_0x0059:
            long r12 = eb0.C31543z5.m39454d()
            xz1.a r10 = new xz1.a
            r10.<init>()
            r16 = 3000(0xbb8, double:1.482E-320)
            r18 = 2000(0x7d0, double:9.88E-321)
            r20 = 1000(0x3e8, double:4.94E-321)
            r22 = 5000(0x1388, double:2.4703E-320)
            r1.mo108664a(r5)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            r8 = 0
            r15 = 0
            r27 = 0
            r28 = -1
        L_0x0073:
            int r11 = r9.length     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            if (r15 >= r11) goto L_0x0105
            r11 = r9[r15]     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            java.util.regex.Pattern r6 = r1.f230464f     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            java.lang.String r14 = r11.trim()     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            java.util.regex.Matcher r6 = r6.matcher(r14)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            boolean r14 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            if (r14 == 0) goto L_0x0095
            java.lang.String r14 = "str(first):%s"
            r31 = r2
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            r2 = 0
            r0[r2] = r11     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r14, r0)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            goto L_0x0097
        L_0x0095:
            r31 = r2
        L_0x0097:
            boolean r0 = r6.find()     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            if (r2 == 0) goto L_0x00af
            java.lang.String r2 = "mainBody(first) result:%s"
            r6 = 1
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            r29 = 0
            r14[r29] = r6     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r2, r14)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
        L_0x00af:
            if (r0 == 0) goto L_0x00b8
            int r0 = r5.indexOf(r11, r8)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            r2 = r0
            r0 = 1
            goto L_0x010a
        L_0x00b8:
            if (r27 != 0) goto L_0x00f5
            java.util.regex.Pattern r0 = r1.f230465g     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            java.lang.String r2 = r11.trim()     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            java.util.regex.Matcher r0 = r0.matcher(r2)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            boolean r27 = r0.find()     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            if (r2 == 0) goto L_0x00df
            java.lang.String r2 = "example str:%s hasExample:%s"
            r6 = 2
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            r6 = 0
            r14[r6] = r11     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r27)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            r30 = 1
            r14[r30] = r6     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r2, r14)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
        L_0x00df:
            if (r27 == 0) goto L_0x00f5
            r2 = 0
            java.lang.String r0 = r0.group(r2)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            if (r2 == 0) goto L_0x00f1
            int r28 = r5.indexOf(r11, r8)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            goto L_0x00f5
        L_0x00f1:
            int r28 = r5.indexOf(r0, r8)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
        L_0x00f5:
            int r0 = r11.length()     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            int r8 = r8 + r0
            r2 = 1
            int r8 = r8 + r2
            int r15 = r15 + 1
            r0 = r47
            r2 = r31
            r6 = 0
            goto L_0x0073
        L_0x0105:
            r31 = r2
            r0 = 0
            r2 = 0
            r15 = 0
        L_0x010a:
            if (r0 != 0) goto L_0x01bc
            android.util.Pair r0 = r1.mo108671i(r5, r9)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            java.lang.Object r2 = r0.first     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            if (r2 == 0) goto L_0x0125
            java.lang.Object r0 = r0.second     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            xz1.a r0 = (xz1.C79013a) r0     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            r10 = r0
            r15 = r3
            r2 = r4
            r36 = r12
            goto L_0x07c1
        L_0x0125:
            r1.mo108674l(r5)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            r2 = 0
            r0.<init>(r7, r2)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            long r5 = eb0.C31543z5.m39454d()
            long r5 = r5 - r12
            int r2 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r2 > 0) goto L_0x0145
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r32 = 1174(0x496, double:5.8E-321)
            r34 = 0
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)
            goto L_0x019c
        L_0x0145:
            int r2 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r2 > 0) goto L_0x0157
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r32 = 1174(0x496, double:5.8E-321)
            r34 = 1
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)
            goto L_0x019c
        L_0x0157:
            int r2 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r2 > 0) goto L_0x0169
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 1174(0x496, double:5.8E-321)
            r14 = 2
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)
            goto L_0x019c
        L_0x0169:
            r7 = 4000(0xfa0, double:1.9763E-320)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x017d
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 1174(0x496, double:5.8E-321)
            r14 = 3
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)
            goto L_0x019c
        L_0x017d:
            int r2 = (r5 > r22 ? 1 : (r5 == r22 ? 0 : -1))
            if (r2 > 0) goto L_0x018f
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 1174(0x496, double:5.8E-321)
            r14 = 4
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)
            goto L_0x019c
        L_0x018f:
            com.tencent.mm.plugin.report.service.n r19 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r20 = 1174(0x496, double:5.8E-321)
            r22 = 5
            r24 = 1
            r26 = 0
            r19.idkeyStat(r20, r22, r24, r26)
        L_0x019c:
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 0
            r2[r6] = r5
            java.util.HashMap<java.lang.Integer, xz1.b> r5 = r10.f232007N
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 1
            r2[r6] = r5
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r6 = 2
            r2[r6] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r2)
            return r0
        L_0x01bc:
            int r0 = r5.length()     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            int r6 = r9.length     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            r8 = 1
            int r6 = r6 - r8
        L_0x01c3:
            if (r6 < r15) goto L_0x0218
            r8 = r9[r6]     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            int r11 = r8.length()     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            int r0 = r0 - r11
            boolean r11 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            if (r11 == 0) goto L_0x01df
            java.lang.String r11 = "str(last):%s"
            r27 = r15
            r14 = 1
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            r14 = 0
            r15[r14] = r8     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r11, r15)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            goto L_0x01e1
        L_0x01df:
            r27 = r15
        L_0x01e1:
            java.util.regex.Pattern r11 = r1.f230464f     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            java.lang.String r14 = r8.trim()     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            java.util.regex.Matcher r11 = r11.matcher(r14)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            boolean r11 = r11.find()     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            boolean r14 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            if (r14 == 0) goto L_0x0206
            java.lang.String r14 = "mainBody(last) result:%s"
            r32 = r9
            r15 = 1
            java.lang.Object[] r9 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r11)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            r29 = 0
            r9[r29] = r15     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r14, r9)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            goto L_0x0208
        L_0x0206:
            r32 = r9
        L_0x0208:
            if (r11 == 0) goto L_0x020f
            int r0 = r5.indexOf(r8, r0)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            goto L_0x021e
        L_0x020f:
            int r0 = r0 + -1
            int r6 = r6 + -1
            r15 = r27
            r9 = r32
            goto L_0x01c3
        L_0x0218:
            r32 = r9
            r27 = r15
            r0 = 0
            r6 = 0
        L_0x021e:
            if (r2 <= 0) goto L_0x02f1
            int r8 = r5.length()     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            if (r2 > r8) goto L_0x02f1
            r15 = r28
            if (r15 == 0) goto L_0x0244
            r8 = -1
            if (r15 != r8) goto L_0x0239
            r8 = 0
            java.lang.String r9 = r5.substring(r8, r2)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            java.lang.String r8 = r9.trim()     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            r10.f232001H = r8     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            goto L_0x0244
        L_0x0239:
            r8 = 0
            java.lang.String r9 = r5.substring(r8, r15)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            java.lang.String r8 = r9.trim()     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            r10.f232001H = r8     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
        L_0x0244:
            java.lang.String r8 = r10.f232001H     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            boolean r8 = wz1.C78747b.m95094F(r8)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            if (r8 == 0) goto L_0x02e3
            r1.mo108674l(r5)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            r2 = 0
            r0.<init>(r7, r2)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            long r5 = eb0.C31543z5.m39454d()
            long r5 = r5 - r12
            int r2 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r2 > 0) goto L_0x026c
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r32 = 1174(0x496, double:5.8E-321)
            r34 = 0
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)
            goto L_0x02c3
        L_0x026c:
            int r2 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r2 > 0) goto L_0x027e
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r32 = 1174(0x496, double:5.8E-321)
            r34 = 1
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)
            goto L_0x02c3
        L_0x027e:
            int r2 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r2 > 0) goto L_0x0290
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 1174(0x496, double:5.8E-321)
            r14 = 2
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)
            goto L_0x02c3
        L_0x0290:
            r7 = 4000(0xfa0, double:1.9763E-320)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x02a4
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 1174(0x496, double:5.8E-321)
            r14 = 3
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)
            goto L_0x02c3
        L_0x02a4:
            int r2 = (r5 > r22 ? 1 : (r5 == r22 ? 0 : -1))
            if (r2 > 0) goto L_0x02b6
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 1174(0x496, double:5.8E-321)
            r14 = 4
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)
            goto L_0x02c3
        L_0x02b6:
            com.tencent.mm.plugin.report.service.n r19 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r20 = 1174(0x496, double:5.8E-321)
            r22 = 5
            r24 = 1
            r26 = 0
            r19.idkeyStat(r20, r22, r24, r26)
        L_0x02c3:
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 0
            r2[r6] = r5
            java.util.HashMap<java.lang.Integer, xz1.b> r5 = r10.f232007N
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 1
            r2[r6] = r5
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r6 = 2
            r2[r6] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r2)
            return r0
        L_0x02e3:
            if (r15 < 0) goto L_0x02f1
            if (r15 > r2) goto L_0x02f1
            java.lang.String r2 = r5.substring(r15, r2)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            java.lang.String r2 = r2.trim()     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            r10.f232002I = r2     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
        L_0x02f1:
            r2 = r32[r6]     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            int r2 = r2.length()     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            int r0 = r0 + r2
            if (r0 <= 0) goto L_0x030a
            int r2 = r5.length()     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            if (r0 >= r2) goto L_0x030a
            java.lang.String r2 = r5.substring(r0)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            java.lang.String r2 = r2.trim()     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            r10.f232003J = r2     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
        L_0x030a:
            java.lang.String r2 = r10.f232003J     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            int r2 = wz1.C78747b.m95125y(r2)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            int r8 = wz1.C78747b.m95120t()     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            r9 = 2
            int r8 = r8 * 2
            if (r2 <= r8) goto L_0x031b
            r2 = 1
            goto L_0x031c
        L_0x031b:
            r2 = 0
        L_0x031c:
            if (r2 == 0) goto L_0x03b5
            r1.mo108674l(r5)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            r2 = 0
            r0.<init>(r7, r2)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            long r5 = eb0.C31543z5.m39454d()
            long r5 = r5 - r12
            int r2 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r2 > 0) goto L_0x033e
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r32 = 1174(0x496, double:5.8E-321)
            r34 = 0
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)
            goto L_0x0395
        L_0x033e:
            int r2 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r2 > 0) goto L_0x0350
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r32 = 1174(0x496, double:5.8E-321)
            r34 = 1
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)
            goto L_0x0395
        L_0x0350:
            int r2 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r2 > 0) goto L_0x0362
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 1174(0x496, double:5.8E-321)
            r14 = 2
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)
            goto L_0x0395
        L_0x0362:
            r7 = 4000(0xfa0, double:1.9763E-320)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x0376
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 1174(0x496, double:5.8E-321)
            r14 = 3
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)
            goto L_0x0395
        L_0x0376:
            int r2 = (r5 > r22 ? 1 : (r5 == r22 ? 0 : -1))
            if (r2 > 0) goto L_0x0388
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 1174(0x496, double:5.8E-321)
            r14 = 4
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)
            goto L_0x0395
        L_0x0388:
            com.tencent.mm.plugin.report.service.n r19 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r20 = 1174(0x496, double:5.8E-321)
            r22 = 5
            r24 = 1
            r26 = 0
            r19.idkeyStat(r20, r22, r24, r26)
        L_0x0395:
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 0
            r2[r6] = r5
            java.util.HashMap<java.lang.Integer, xz1.b> r5 = r10.f232007N
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 1
            r2[r6] = r5
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r6 = 2
            r2[r6] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r2)
            return r0
        L_0x03b5:
            java.lang.String r2 = wz1.C78747b.m95115o(r10)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            di3.d r8 = di3.C86312j.m106911c(r31)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            sz1.b r8 = (sz1.C77815b) r8     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            xz1.c r8 = r8.xx0()     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            r9 = r47
            xz1.a r8 = r8.mo108981Yt(r9, r2)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            int r11 = r10.f232005L     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            java.lang.String r14 = ""
            if (r11 != 0) goto L_0x03e1
            r11 = 1
            r10.f232005L = r11     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            r10.f232001H = r14     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            goto L_0x03e1
        L_0x03d5:
            r15 = r3
            r2 = r4
            r36 = r12
            goto L_0x093f
        L_0x03db:
            r15 = r3
            r2 = r4
            r36 = r12
            goto L_0x088f
        L_0x03e1:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            r11.<init>()     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            r15 = r32[r27]     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            int r15 = r5.indexOf(r15)     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            r46 = r8
            r8 = r15
            r15 = r27
            r27 = 0
        L_0x03f3:
            if (r15 > r6) goto L_0x05f9
            int r28 = r15 + 1
            r33 = r32[r15]     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            int r33 = r33.length()     // Catch:{ Exception -> 0x088c, all -> 0x0889 }
            int r33 = r8 + r33
            r30 = 1
            int r33 = r33 + 1
            r34 = r11
            r11 = r28
            r28 = r3
            r3 = r33
        L_0x040b:
            if (r11 > r6) goto L_0x0456
            r33 = r32[r11]     // Catch:{ Exception -> 0x044e, all -> 0x0446 }
            r35 = r4
            java.util.regex.Pattern r4 = r1.f230467i     // Catch:{ Exception -> 0x043d, all -> 0x0434 }
            r36 = r12
            java.lang.String r12 = r33.trim()     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            java.util.regex.Matcher r4 = r4.matcher(r12)     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            boolean r4 = r4.find()     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            if (r4 == 0) goto L_0x0424
            goto L_0x045a
        L_0x0424:
            r4 = r32[r11]     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            int r4 = r4.length()     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            int r3 = r3 + r4
            r4 = 1
            int r3 = r3 + r4
            int r11 = r11 + 1
            r4 = r35
            r12 = r36
            goto L_0x040b
        L_0x0434:
            r0 = move-exception
            r36 = r12
        L_0x0437:
            r15 = r28
            r2 = r35
            goto L_0x093f
        L_0x043d:
            r0 = move-exception
            r36 = r12
        L_0x0440:
            r15 = r28
            r2 = r35
            goto L_0x088f
        L_0x0446:
            r0 = move-exception
            r36 = r12
            r2 = r4
            r15 = r28
            goto L_0x093f
        L_0x044e:
            r0 = move-exception
            r36 = r12
            r2 = r4
            r15 = r28
            goto L_0x088f
        L_0x0456:
            r35 = r4
            r36 = r12
        L_0x045a:
            if (r11 <= r6) goto L_0x0471
            int r3 = r5.length()     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            if (r0 <= r3) goto L_0x0466
            int r0 = r5.length()     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
        L_0x0466:
            r3 = r32[r15]     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            int r3 = r5.indexOf(r3, r8)     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            java.lang.String r3 = r5.substring(r3, r0)     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            goto L_0x0488
        L_0x0471:
            int r4 = r5.length()     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            if (r3 < r4) goto L_0x0478
            r3 = r8
        L_0x0478:
            r4 = r32[r15]     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            int r4 = r5.indexOf(r4, r8)     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            r12 = r32[r11]     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            int r3 = r5.indexOf(r12, r3)     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            java.lang.String r3 = r5.substring(r4, r3)     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
        L_0x0488:
            int r4 = r3.length()     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            int r8 = r8 + r4
            java.lang.String r4 = wz1.C78747b.m95115o(r10)     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r2, (java.lang.String) r4)     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            if (r12 != 0) goto L_0x04a6
            di3.d r12 = di3.C86312j.m106911c(r31)     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            sz1.b r12 = (sz1.C77815b) r12     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            xz1.c r12 = r12.xx0()     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            xz1.a r4 = r12.mo108981Yt(r9, r4)     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            goto L_0x04a8
        L_0x04a6:
            r4 = r46
        L_0x04a8:
            int r12 = r10.f232005L     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            if (r12 != 0) goto L_0x04b1
            r12 = 1
            r10.f232005L = r12     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            r10.f232001H = r14     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
        L_0x04b1:
            java.util.List r3 = r1.mo108669g(r4, r3)     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            if (r3 != 0) goto L_0x04c4
            r46 = r4
            r15 = r11
            r3 = r28
            r11 = r34
            r4 = r35
            r12 = r36
            goto L_0x03f3
        L_0x04c4:
            r12 = 0
        L_0x04c5:
            r13 = r3
            java.util.ArrayList r13 = (java.util.ArrayList) r13     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            int r15 = r13.size()     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            if (r12 >= r15) goto L_0x05de
            java.lang.Object r13 = r13.get(r12)     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            xz1.b r13 = (xz1.C79014b) r13     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            java.lang.String r15 = r13.f232014e     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            boolean r15 = wz1.C78747b.m95093E(r15)     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            if (r15 == 0) goto L_0x0578
            r1.mo108674l(r5)     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            r2 = 0
            r0.<init>(r7, r2)     // Catch:{ Exception -> 0x05f6, all -> 0x05f3 }
            long r2 = eb0.C31543z5.m39454d()
            long r2 = r2 - r36
            int r4 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r4 > 0) goto L_0x04fd
            com.tencent.mm.plugin.report.service.n r36 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r37 = 1174(0x496, double:5.8E-321)
            r39 = 0
            r41 = 1
            r43 = 0
            r36.idkeyStat(r37, r39, r41, r43)
            goto L_0x0554
        L_0x04fd:
            int r4 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r4 > 0) goto L_0x050f
            com.tencent.mm.plugin.report.service.n r36 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r37 = 1174(0x496, double:5.8E-321)
            r39 = 1
            r41 = 1
            r43 = 0
            r36.idkeyStat(r37, r39, r41, r43)
            goto L_0x0554
        L_0x050f:
            int r4 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r4 > 0) goto L_0x0521
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 1174(0x496, double:5.8E-321)
            r14 = 2
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)
            goto L_0x0554
        L_0x0521:
            r4 = 4000(0xfa0, double:1.9763E-320)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0535
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 1174(0x496, double:5.8E-321)
            r14 = 3
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)
            goto L_0x0554
        L_0x0535:
            int r4 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1))
            if (r4 > 0) goto L_0x0547
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 1174(0x496, double:5.8E-321)
            r14 = 4
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)
            goto L_0x0554
        L_0x0547:
            com.tencent.mm.plugin.report.service.n r19 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r20 = 1174(0x496, double:5.8E-321)
            r22 = 5
            r24 = 1
            r26 = 0
            r19.idkeyStat(r20, r22, r24, r26)
        L_0x0554:
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 0
            r4[r3] = r2
            java.util.HashMap<java.lang.Integer, xz1.b> r2 = r10.f232007N
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r4[r3] = r2
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r3 = 2
            r4[r3] = r2
            r15 = r28
            r2 = r35
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r15, r4)
            return r0
        L_0x0578:
            r46 = r2
            r15 = r28
            r2 = r35
            r28 = r0
            java.util.HashMap<java.lang.Integer, xz1.b> r0 = r10.f232007N     // Catch:{ Exception -> 0x0887 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x0887 }
            if (r0 != 0) goto L_0x058c
            java.lang.String r0 = r13.f232012c     // Catch:{ Exception -> 0x0887 }
            r10.f232004K = r0     // Catch:{ Exception -> 0x0887 }
        L_0x058c:
            if (r12 != 0) goto L_0x0596
            java.lang.String r0 = r13.f232014e     // Catch:{ Exception -> 0x0887 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0887 }
            if (r0 != 0) goto L_0x05a2
        L_0x0596:
            java.lang.String r0 = r13.f232014e     // Catch:{ Exception -> 0x0887 }
            java.lang.String r0 = r0.trim()     // Catch:{ Exception -> 0x0887 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0887 }
            if (r0 == 0) goto L_0x05bb
        L_0x05a2:
            int r0 = r10.f232009Q     // Catch:{ Exception -> 0x0887 }
            r30 = 1
            int r0 = r0 + 1
            r10.f232009Q = r0     // Catch:{ Exception -> 0x0887 }
            int r0 = r13.f232015f     // Catch:{ Exception -> 0x0887 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0887 }
            r13 = r34
            r13.add(r0)     // Catch:{ Exception -> 0x0887 }
            r33 = r3
            r34 = r4
            r0 = r13
            goto L_0x05cc
        L_0x05bb:
            r33 = r3
            r0 = r34
            java.util.HashMap<java.lang.Integer, xz1.b> r3 = r10.f232007N     // Catch:{ Exception -> 0x0887 }
            int r27 = r27 + 1
            r34 = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r27)     // Catch:{ Exception -> 0x0887 }
            r3.put(r4, r13)     // Catch:{ Exception -> 0x0887 }
        L_0x05cc:
            int r12 = r12 + 1
            r35 = r2
            r3 = r33
            r4 = r34
            r2 = r46
            r34 = r0
            r0 = r28
            r28 = r15
            goto L_0x04c5
        L_0x05de:
            r15 = r28
            r28 = r0
            r0 = r34
            r34 = r4
            r3 = r15
            r46 = r34
            r4 = r35
            r12 = r36
            r15 = r11
            r11 = r0
            r0 = r28
            goto L_0x03f3
        L_0x05f3:
            r0 = move-exception
            goto L_0x0437
        L_0x05f6:
            r0 = move-exception
            goto L_0x0440
        L_0x05f9:
            r15 = r3
            r2 = r4
            r0 = r11
            r36 = r12
            java.util.HashMap<java.lang.Integer, xz1.b> r3 = r10.f232007N     // Catch:{ Exception -> 0x0887 }
            int r3 = r3.size()     // Catch:{ Exception -> 0x0887 }
            int r4 = r0.size()     // Catch:{ Exception -> 0x0887 }
            int r3 = r3 + r4
            r4 = 4
            if (r3 < r4) goto L_0x07a0
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ Exception -> 0x0887 }
            r3.<init>()     // Catch:{ Exception -> 0x0887 }
            r4 = 0
            r6 = 1
        L_0x0613:
            java.util.HashMap<java.lang.Integer, xz1.b> r8 = r10.f232007N     // Catch:{ Exception -> 0x0887 }
            int r8 = r8.size()     // Catch:{ Exception -> 0x0887 }
            if (r6 > r8) goto L_0x06dd
            java.util.HashMap<java.lang.Integer, xz1.b> r8 = r10.f232007N     // Catch:{ Exception -> 0x0887 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0887 }
            java.lang.Object r8 = r8.get(r9)     // Catch:{ Exception -> 0x0887 }
            xz1.b r8 = (xz1.C79014b) r8     // Catch:{ Exception -> 0x0887 }
            int r9 = r8.f232015f     // Catch:{ Exception -> 0x0887 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0887 }
            boolean r9 = r3.contains(r9)     // Catch:{ Exception -> 0x0887 }
            if (r9 == 0) goto L_0x06d0
            int r4 = r4 + 1
            r8 = 2
            if (r4 < r8) goto L_0x06d9
            r1.mo108674l(r5)     // Catch:{ Exception -> 0x0887 }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ Exception -> 0x0887 }
            r3 = 0
            r0.<init>(r7, r3)     // Catch:{ Exception -> 0x0887 }
            long r3 = eb0.C31543z5.m39454d()
            long r3 = r3 - r36
            int r5 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r5 > 0) goto L_0x0659
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r32 = 1174(0x496, double:5.8E-321)
            r34 = 0
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)
            goto L_0x06b0
        L_0x0659:
            int r5 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r5 > 0) goto L_0x066b
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r32 = 1174(0x496, double:5.8E-321)
            r34 = 1
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)
            goto L_0x06b0
        L_0x066b:
            int r5 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r5 > 0) goto L_0x067d
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r32 = 1174(0x496, double:5.8E-321)
            r34 = 2
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)
            goto L_0x06b0
        L_0x067d:
            r5 = 4000(0xfa0, double:1.9763E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0691
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r32 = 1174(0x496, double:5.8E-321)
            r34 = 3
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)
            goto L_0x06b0
        L_0x0691:
            int r5 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r5 > 0) goto L_0x06a3
            com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 1174(0x496, double:5.8E-321)
            r19 = 4
            r21 = 1
            r23 = 0
            r16.idkeyStat(r17, r19, r21, r23)
            goto L_0x06b0
        L_0x06a3:
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r32 = 1174(0x496, double:5.8E-321)
            r34 = 5
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)
        L_0x06b0:
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 0
            r5[r4] = r3
            java.util.HashMap<java.lang.Integer, xz1.b> r3 = r10.f232007N
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 1
            r5[r4] = r3
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r4 = 2
            r5[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r15, r5)
            return r0
        L_0x06d0:
            int r8 = r8.f232015f     // Catch:{ Exception -> 0x0887 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0887 }
            r3.add(r8)     // Catch:{ Exception -> 0x0887 }
        L_0x06d9:
            int r6 = r6 + 1
            goto L_0x0613
        L_0x06dd:
            r6 = 0
        L_0x06de:
            int r8 = r0.size()     // Catch:{ Exception -> 0x0887 }
            if (r6 >= r8) goto L_0x07a0
            java.lang.Object r8 = r0.get(r6)     // Catch:{ Exception -> 0x0887 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ Exception -> 0x0887 }
            int r8 = r8.intValue()     // Catch:{ Exception -> 0x0887 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0887 }
            boolean r9 = r3.contains(r9)     // Catch:{ Exception -> 0x0887 }
            if (r9 == 0) goto L_0x0795
            int r4 = r4 + 1
            r8 = 2
            if (r4 < r8) goto L_0x079c
            r1.mo108674l(r5)     // Catch:{ Exception -> 0x0887 }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ Exception -> 0x0887 }
            r3 = 0
            r0.<init>(r7, r3)     // Catch:{ Exception -> 0x0887 }
            long r3 = eb0.C31543z5.m39454d()
            long r3 = r3 - r36
            int r5 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r5 > 0) goto L_0x071e
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r32 = 1174(0x496, double:5.8E-321)
            r34 = 0
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)
            goto L_0x0775
        L_0x071e:
            int r5 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r5 > 0) goto L_0x0730
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r32 = 1174(0x496, double:5.8E-321)
            r34 = 1
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)
            goto L_0x0775
        L_0x0730:
            int r5 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r5 > 0) goto L_0x0742
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r32 = 1174(0x496, double:5.8E-321)
            r34 = 2
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)
            goto L_0x0775
        L_0x0742:
            r5 = 4000(0xfa0, double:1.9763E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0756
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r32 = 1174(0x496, double:5.8E-321)
            r34 = 3
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)
            goto L_0x0775
        L_0x0756:
            int r5 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r5 > 0) goto L_0x0768
            com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 1174(0x496, double:5.8E-321)
            r19 = 4
            r21 = 1
            r23 = 0
            r16.idkeyStat(r17, r19, r21, r23)
            goto L_0x0775
        L_0x0768:
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r32 = 1174(0x496, double:5.8E-321)
            r34 = 5
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)
        L_0x0775:
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 0
            r5[r4] = r3
            java.util.HashMap<java.lang.Integer, xz1.b> r3 = r10.f232007N
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 1
            r5[r4] = r3
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r4 = 2
            r5[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r15, r5)
            return r0
        L_0x0795:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0887 }
            r3.add(r8)     // Catch:{ Exception -> 0x0887 }
        L_0x079c:
            int r6 = r6 + 1
            goto L_0x06de
        L_0x07a0:
            java.lang.String r0 = r10.f232004K     // Catch:{ Exception -> 0x0887 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0887 }
            if (r0 == 0) goto L_0x07c1
            java.util.HashMap<java.lang.Integer, xz1.b> r0 = r10.f232007N     // Catch:{ Exception -> 0x0887 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x0887 }
            r3 = 1
            if (r0 < r3) goto L_0x07c1
            java.util.HashMap<java.lang.Integer, xz1.b> r0 = r10.f232007N     // Catch:{ Exception -> 0x0887 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0887 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ Exception -> 0x0887 }
            xz1.b r0 = (xz1.C79014b) r0     // Catch:{ Exception -> 0x0887 }
            java.lang.String r0 = r0.f232012c     // Catch:{ Exception -> 0x0887 }
            r10.f232004K = r0     // Catch:{ Exception -> 0x0887 }
        L_0x07c1:
            java.lang.String r0 = r10.f232004K     // Catch:{ Exception -> 0x0887 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0887 }
            if (r0 != 0) goto L_0x07d5
            java.lang.String r0 = r10.f232004K     // Catch:{ Exception -> 0x0887 }
            java.lang.String r0 = r0.trim()     // Catch:{ Exception -> 0x0887 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0887 }
            if (r0 == 0) goto L_0x07d9
        L_0x07d5:
            java.lang.String r0 = "."
            r10.f232004K = r0     // Catch:{ Exception -> 0x0887 }
        L_0x07d9:
            r1.mo108674l(r5)     // Catch:{ Exception -> 0x0887 }
            long r3 = eb0.C31543z5.m39454d()
            long r3 = r3 - r36
            int r0 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r0 > 0) goto L_0x07f4
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r32 = 1174(0x496, double:5.8E-321)
            r34 = 0
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)
            goto L_0x084b
        L_0x07f4:
            int r0 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r0 > 0) goto L_0x0806
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r32 = 1174(0x496, double:5.8E-321)
            r34 = 1
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)
            goto L_0x084b
        L_0x0806:
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x0818
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r32 = 1174(0x496, double:5.8E-321)
            r34 = 2
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)
            goto L_0x084b
        L_0x0818:
            r5 = 4000(0xfa0, double:1.9763E-320)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x082c
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r32 = 1174(0x496, double:5.8E-321)
            r34 = 3
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)
            goto L_0x084b
        L_0x082c:
            int r0 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r0 > 0) goto L_0x083e
            com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 1174(0x496, double:5.8E-321)
            r19 = 4
            r21 = 1
            r23 = 0
            r16.idkeyStat(r17, r19, r21, r23)
            goto L_0x084b
        L_0x083e:
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r32 = 1174(0x496, double:5.8E-321)
            r34 = 5
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)
        L_0x084b:
            r5 = 3
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 0
            r0[r4] = r3
            java.util.HashMap<java.lang.Integer, xz1.b> r3 = r10.f232007N
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 1
            r0[r5] = r3
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r6 = 2
            r0[r6] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r15, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x0877
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r10
            java.lang.String r3 = "matchGroupSolitatire() groupSolitatire:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r3, r0)
        L_0x0877:
            android.util.Pair r0 = new android.util.Pair
            java.util.HashMap<java.lang.Integer, xz1.b> r2 = r10.f232007N
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.<init>(r2, r10)
            return r0
        L_0x0887:
            r0 = move-exception
            goto L_0x088f
        L_0x0889:
            r0 = move-exception
            goto L_0x03d5
        L_0x088c:
            r0 = move-exception
            goto L_0x03db
        L_0x088f:
            java.lang.String r3 = "matchGroupSolitatire Exception：%s %s"
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x093e }
            java.lang.Class r4 = r0.getClass()     // Catch:{ all -> 0x093e }
            java.lang.String r4 = r4.getSimpleName()     // Catch:{ all -> 0x093e }
            r6 = 0
            r5[r6] = r4     // Catch:{ all -> 0x093e }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x093e }
            r4 = 1
            r5[r4] = r0     // Catch:{ all -> 0x093e }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r5)     // Catch:{ all -> 0x093e }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x093e }
            r3 = 0
            r0.<init>(r7, r3)     // Catch:{ all -> 0x093e }
            long r3 = eb0.C31543z5.m39454d()
            long r3 = r3 - r36
            int r5 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r5 > 0) goto L_0x08c7
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r32 = 1174(0x496, double:5.8E-321)
            r34 = 0
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)
            goto L_0x091e
        L_0x08c7:
            int r5 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r5 > 0) goto L_0x08d9
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r32 = 1174(0x496, double:5.8E-321)
            r34 = 1
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)
            goto L_0x091e
        L_0x08d9:
            int r5 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r5 > 0) goto L_0x08eb
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r32 = 1174(0x496, double:5.8E-321)
            r34 = 2
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)
            goto L_0x091e
        L_0x08eb:
            r5 = 4000(0xfa0, double:1.9763E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x08ff
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r32 = 1174(0x496, double:5.8E-321)
            r34 = 3
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)
            goto L_0x091e
        L_0x08ff:
            int r5 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r5 > 0) goto L_0x0911
            com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 1174(0x496, double:5.8E-321)
            r19 = 4
            r21 = 1
            r23 = 0
            r16.idkeyStat(r17, r19, r21, r23)
            goto L_0x091e
        L_0x0911:
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r32 = 1174(0x496, double:5.8E-321)
            r34 = 5
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)
        L_0x091e:
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 0
            r5[r4] = r3
            java.util.HashMap<java.lang.Integer, xz1.b> r3 = r10.f232007N
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 1
            r5[r4] = r3
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r4 = 2
            r5[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r15, r5)
            return r0
        L_0x093e:
            r0 = move-exception
        L_0x093f:
            long r3 = eb0.C31543z5.m39454d()
            long r3 = r3 - r36
            int r5 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x09a1
            int r5 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r5 <= 0) goto L_0x0993
            int r5 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x0985
            r5 = 4000(0xfa0, double:1.9763E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0977
            int r5 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r5 > 0) goto L_0x0969
            com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 1174(0x496, double:5.8E-321)
            r19 = 4
            r21 = 1
            r23 = 0
            r16.idkeyStat(r17, r19, r21, r23)
            goto L_0x09ae
        L_0x0969:
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r32 = 1174(0x496, double:5.8E-321)
            r34 = 5
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)
            goto L_0x09ae
        L_0x0977:
            com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 1174(0x496, double:5.8E-321)
            r19 = 3
            r21 = 1
            r23 = 0
            r16.idkeyStat(r17, r19, r21, r23)
            goto L_0x09ae
        L_0x0985:
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r32 = 1174(0x496, double:5.8E-321)
            r34 = 2
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)
            goto L_0x09ae
        L_0x0993:
            com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 1174(0x496, double:5.8E-321)
            r19 = 1
            r21 = 1
            r23 = 0
            r16.idkeyStat(r17, r19, r21, r23)
            goto L_0x09ae
        L_0x09a1:
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r32 = 1174(0x496, double:5.8E-321)
            r34 = 0
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)
        L_0x09ae:
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 0
            r5[r4] = r3
            java.util.HashMap<java.lang.Integer, xz1.b> r3 = r10.f232007N
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 1
            r5[r4] = r3
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r4 = 2
            r5[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r15, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wz1.C78753c.mo108672j(java.lang.String, int, java.lang.String):android.util.Pair");
    }

    /* renamed from: k */
    public void mo108673k(String str, C79013a aVar) {
        if (aVar != null && !Util.isNullOrNil(aVar.field_key)) {
            Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireManager", "putTempGroupSolitatireToCache() username:%s key:%s", str, aVar.field_key);
            ConcurrentHashMap<String, C79013a> concurrentHashMap = this.f230462d;
            concurrentHashMap.put(str + aVar.field_key, aVar);
        }
    }

    /* renamed from: l */
    public final void mo108674l(String str) {
        if (!Util.isNullOrNil(str)) {
            this.f230460b.remove(this.f230459a.remove(m95127d(str)));
            mo108675m();
        }
    }

    /* renamed from: m */
    public final void mo108675m() {
        StringBuilder sb = new StringBuilder();
        Iterator<C78755b> it = this.f230460b.iterator();
        while (it.hasNext()) {
            C78755b next = it.next();
            sb.append(next.f230473a);
            sb.append(",");
            sb.append(next.f230474b);
            sb.append(";");
        }
        MultiProcessMMKV.getMMKV("group_solitatire").edit().putString("analyze_crash_content_num_new", sb.toString());
    }
}
