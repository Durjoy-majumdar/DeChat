package xx0;

import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import a70.C112760b;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29770h0;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40789z;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMSlotKt;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import fy3.C32224a;
import g93.C32355a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import hp3.C87581a;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import ob0.C89132b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49336ev;
import te3.C49614gv;
import te3.ah4;
import te3.yg4;
import te3.zg4;
import wx3.C15601d;
import z04.C112551y;
import z04.C66723k;

/* renamed from: xx0.b */
public final class C53458b {

    /* renamed from: a */
    public static final C53458b f150358a = new C53458b();

    /* renamed from: b */
    public static final String f150359b;

    /* renamed from: c */
    public static final String f150360c;

    /* renamed from: d */
    public static final C13601g f150361d = C36568h.m40985a(C38875b.f104782d);

    /* renamed from: e */
    public static final int f150362e = CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;

    /* renamed from: f */
    public static final ConcurrentHashMap<Integer, Long> f150363f = new ConcurrentHashMap<>();

    /* renamed from: g */
    public static final ArrayList<Integer> f150364g = new ArrayList<>();

    /* renamed from: h */
    public static final C13601g f150365h = C36568h.m40985a(C38877e.f104784d);

    /* renamed from: i */
    public static final C13601g f150366i = C36568h.m40985a(C38876c.f104783d);

    /* renamed from: xx0.b$b */
    public static final class C38875b extends C87413o implements C32224a<Integer[]> {

        /* renamed from: d */
        public static final C38875b f104782d = new C38875b();

        public C38875b() {
            super(0);
        }

        public Object invoke() {
            if (C40789z.m44094e(102)) {
                return new Integer[]{5, 6};
            }
            return new Integer[]{0, 4, 6};
        }
    }

    /* renamed from: xx0.b$c */
    public static final class C38876c extends C87413o implements C32224a<C66723k> {

        /* renamed from: d */
        public static final C38876c f104783d = new C38876c();

        public C38876c() {
            super(0);
        }

        public Object invoke() {
            return new C66723k(".*\\.js\\.cachedata.*");
        }
    }

    /* renamed from: xx0.b$e */
    public static final class C38877e extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C38877e f104784d = new C38877e();

        public C38877e() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_biz_article_fast_load_tmpl_keep_count, 3));
        }
    }

    /* renamed from: xx0.b$a */
    public static final class C53459a {

        /* renamed from: a */
        public boolean f150367a;

        /* renamed from: b */
        public String f150368b;

        /* renamed from: c */
        public String f150369c;

        /* renamed from: d */
        public boolean f150370d;

        /* renamed from: e */
        public Exception f150371e;
    }

    /* renamed from: xx0.b$d */
    public static final class C53460d<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ LinkedList<C49336ev> f150372a;

        /* renamed from: b */
        public final /* synthetic */ int f150373b;

        public C53460d(LinkedList<C49336ev> linkedList, int i) {
            this.f150372a = linkedList;
            this.f150373b = i;
        }

        public Object call(Object obj) {
            T t;
            boolean z;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.Preload.TmplInfoManager", "callback, errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b), cVar.f256795c);
            Iterator<C49336ev> it = this.f150372a.iterator();
            while (it.hasNext()) {
                C53458b.f150364g.remove(Integer.valueOf(it.next().f133128d));
            }
            if (cVar.f256793a == 0 && cVar.f256794b == 0 && (t = cVar.f256796d) != null) {
                int i = ((C49614gv) t).f134298i;
                if (i > 0) {
                    C40716j0.m43979g().putLong("_check_time_colddown", (long) (i * 1000));
                }
                LinkedList<zg4> linkedList = ((C49614gv) cVar.f256796d).f134297h;
                if (linkedList == null || linkedList.isEmpty()) {
                    Log.m105928w("MicroMsg.Preload.TmplInfoManager", "cgi back tmplInfoList is empty, return");
                } else {
                    Iterator<zg4> it4 = ((C49614gv) cVar.f256796d).f134297h.iterator();
                    while (it4.hasNext()) {
                        zg4 next = it4.next();
                        if (next != null) {
                            int i2 = this.f150373b;
                            synchronized (C53458b.class) {
                                if (!C40716j0.m43982j(next)) {
                                    Log.m105920e("MicroMsg.Preload.TmplInfoManager", "isTmplInfoExist() tmplInfo is invalid, return false");
                                } else if (C53458b.m59913g(next.f145937d).f145938e == next.f145938e) {
                                    if (!C40716j0.m43981i(C40716j0.m43973a(next))) {
                                        Log.m105928w("MicroMsg.Preload.TmplInfoManager", "[isTmplInfoExist]file isn't exist, may be delete");
                                    } else {
                                        z = true;
                                    }
                                }
                                z = false;
                            }
                            if (z) {
                                C29770h0.m38873a("MicroMsg.Preload.TmplInfoManager", next.f145945o + " exist, only see for debug");
                            } else {
                                int i3 = next.f145937d;
                                C53458b bVar = C53458b.f150358a;
                                C53465g gVar = new C53465g(i3);
                                String str = next.f145939f;
                                if (str == null || C112551y.m153811k(str)) {
                                    Log.m105924i("MicroMsg.Preload.TmplInfoManager", "[addDownloadTask] TmplInfo is null, return");
                                } else {
                                    Log.m105924i("MicroMsg.Preload.TmplInfoManager", "start download:" + bVar.mo74090e(next));
                                    C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C53463e(next, i2, gVar, (C15601d<? super C53463e>) null), 2, (Object) null);
                                }
                            }
                            String e = C40716j0.m43977e(next);
                            String str2 = next.f145945o;
                            MultiProcessMMKV g = C40716j0.m43979g();
                            int i4 = next.f145937d;
                            g.putString("_tmpl_info_latest_responsed_-" + i4, str2);
                            C40716j0.m43979g().removeValueForKey(C40716j0.m43975c(next));
                            C40716j0.m43979g().removeValueForKey(C40716j0.m43976d(next));
                            C40716j0.m43979g().encode(e, next.toByteArray());
                            String f = C40716j0.m43978f(next);
                            MultiProcessMMKV g2 = C40716j0.m43979g();
                            Set stringSet = C40716j0.m43979g().getStringSet(f, (Set<String>) null);
                            if (stringSet == null) {
                                stringSet = new HashSet();
                            }
                            stringSet.add(next.f145945o);
                            C13598b0 b0Var = C13598b0.f38549a;
                            g2.putStringSet(f, stringSet);
                        }
                    }
                    C32355a.m39689a(1);
                }
            } else {
                C32355a.m39689a(2);
            }
            return null;
        }
    }

    static {
        String str = C32355a.f85865a;
        f150359b = str;
        f150360c = str;
        for (int i = 0; i < 3; i++) {
            String str2 = "_webview_tmpl_cache_slot_" + i;
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV(str2);
            long j = mmkv.totalSize();
            if (j > 0) {
                String[] allKeys = mmkv.allKeys();
                boolean z = true;
                if (allKeys != null) {
                    if (!(allKeys.length == 0)) {
                        z = false;
                    }
                }
                if (!z) {
                    mmkv.clearAll();
                    Log.m105924i("MicroMsg.Preload.TmplInfoManager", "clear " + str2 + " totalSize:" + j);
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m59909a(LinkedList<C49336ev> linkedList, int i, String str) {
        C32355a.m39689a(0);
        for (C49336ev evVar : linkedList) {
            f150364g.add(Integer.valueOf(evVar.f133128d));
        }
        new C53457a(linkedList, i, str).mo9225i().mo123420E(new C53460d(linkedList, i));
    }

    /* renamed from: b */
    public static final boolean m59910b(ArrayList<String> arrayList, C86009m1 m1Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(m1Var.mo119971i());
        sb.append(m1Var.mo119977o() ? "/" : "");
        return arrayList.contains(sb.toString());
    }

    /* renamed from: c */
    public static final void m59911c() {
        C40716j0.m43979g().clear();
        C86013q1.m106446g(m59915j(), true);
        C86013q1.m106445f(C112760b.m154225d() + "/jscache/");
    }

    /* renamed from: d */
    public static final ah4 m59912d(int i) {
        String str;
        zg4 k = m59916k(f150358a, i, (String) null, 2, (Object) null);
        if (!C40716j0.m43982j(k)) {
            Log.m105920e("MicroMsg.Preload.TmplInfoManager", "[createTmplParams]type:" + i + " localTmplInfo is null");
            C32355a.m39689a(100);
            return null;
        }
        String b = C40716j0.m43974b(k);
        if (!C40716j0.m43980h(b)) {
            Log.m105920e("MicroMsg.Preload.TmplInfoManager", "[createTmplParams]filePath:" + b + " is null");
            int i2 = k.f145942i;
            if (i2 > 0) {
                C32355a.m39690b(i2, 100, 1, true);
            }
            return null;
        }
        ah4 ah4 = new ah4();
        ah4.f130536d = i;
        ah4.f130537e = k.f145938e;
        ah4.f130540h = k.f145940g;
        ah4.f130539g = b;
        StringBuilder sb = new StringBuilder();
        String str2 = f150359b;
        sb.append(str2);
        sb.append(i);
        sb.append('_');
        sb.append(k.f145945o);
        sb.append(".html");
        String str3 = f150360c;
        if (!C87412m.m108589b(str3, str2)) {
            str = "?prefix=" + URLEncoder.encode(str3);
        } else {
            str = "";
        }
        sb.append(str);
        ah4.f130538f = sb.toString();
        ah4.f130545p = k.f145939f;
        ah4.f130544o = k.f145942i;
        ah4.f130543n = C40716j0.m43979g().getLong("_tmpl_download_time_" + k.f145937d, 0);
        ah4.f130541i = k.f145945o;
        LinkedList<yg4> linkedList = k.f145943j;
        C87412m.m108593f(linkedList, "tmplInfo.HttpHeaderList");
        StringBuilder sb4 = new StringBuilder();
        for (yg4 yg4 : linkedList) {
            sb4.append(10 + yg4.f145293d + XVFSFile.PATH_SEPARATOR_CHAR + yg4.f145294e);
        }
        ah4.f130542j = sb4.toString();
        return ah4;
    }

    /* renamed from: g */
    public static final zg4 m59913g(int i) {
        zg4 zg4 = new zg4();
        MultiProcessMMKV g = C40716j0.m43979g();
        String string = g.getString("_tmpl_info_latest_responsed_-" + i, (String) null);
        if (string != null) {
            f150358a.mo74094m(zg4, i, string);
        }
        return zg4;
    }

    /* renamed from: i */
    public static final LinkedList<C49336ev> m59914i(boolean z) {
        boolean z2;
        LinkedList<C49336ev> linkedList = new LinkedList<>();
        Integer[] numArr = (Integer[]) ((C36570n) f150361d).getValue();
        ArrayList arrayList = new ArrayList();
        int length = numArr.length;
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= length) {
                break;
            }
            Integer num = numArr[i];
            int intValue = num.intValue();
            if (!z) {
                if (C29783w.m38875a().getBoolean("preload_tmpl_always_check_tmpl_ver", false)) {
                    z2 = true;
                } else {
                    long j = 0;
                    ConcurrentHashMap<Integer, Long> concurrentHashMap = f150363f;
                    if (concurrentHashMap.containsKey(Integer.valueOf(intValue))) {
                        Long l = concurrentHashMap.get(Integer.valueOf(intValue));
                        C87412m.m108591d(l);
                        j = l.longValue();
                    }
                    if (f150364g.contains(Integer.valueOf(intValue))) {
                        Log.m105927v("MicroMsg.Preload.TmplInfoManager", "[checkTmplVer] %d already check", Integer.valueOf(intValue));
                        z2 = false;
                    } else {
                        z2 = MMSlotKt.isExpire(j, C40716j0.m43979g().getLong("_check_time_colddown", (long) f150362e));
                    }
                }
                if (!z2) {
                    z3 = false;
                }
            }
            if (z3) {
                arrayList.add(num);
            }
            i++;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue2 = ((Number) it.next()).intValue();
            f150363f.put(Integer.valueOf(intValue2), Long.valueOf(System.currentTimeMillis()));
            C49336ev evVar = new C49336ev();
            evVar.f133128d = intValue2;
            evVar.f133131g = ((Number) ((C36570n) C40716j0.f109362a).getValue()).longValue();
            linkedList.add(evVar);
            ArrayList arrayList2 = null;
            zg4 k = m59916k(f150358a, intValue2, (String) null, 2, (Object) null);
            if (C40716j0.m43982j(k)) {
                if (C40716j0.m43981i(C40716j0.m43973a(k))) {
                    evVar.f133130f = k.f145945o;
                }
                Set<String> stringSet = C40716j0.m43979g().getStringSet(C40716j0.m43978f(k), (Set<String>) null);
                if (stringSet != null) {
                    arrayList2 = new ArrayList();
                    for (T next : stringSet) {
                        String str = (String) next;
                        C53458b bVar = f150358a;
                        zg4 zg4 = new zg4();
                        C87412m.m108593f(str, LocaleUtil.ITALIAN);
                        bVar.mo74094m(zg4, intValue2, str);
                        if (bVar.mo74096o(zg4, k)) {
                            arrayList2.add(next);
                        }
                    }
                }
                if (!(arrayList2 == null || arrayList2.isEmpty())) {
                    evVar.f133129e.addAll(arrayList2);
                }
            }
        }
        return linkedList;
    }

    /* renamed from: j */
    public static final String m59915j() {
        String str = C112760b.m154225d() + "webview_tmpl/";
        if (C29783w.m38875a().getBoolean("preload_save_type", false)) {
            str = C112760b.m154195C();
            C87412m.m108593f(str, "DATAROOT_SDCARD_PATH()");
        }
        if (!C112551y.m153808h(str, "/", false, 2, (Object) null)) {
            str = str + XVFSFile.SEPARATOR_CHAR;
        }
        String str2 = str + "tmpls/";
        FilePathGenerator.checkMkdir(str2);
        return str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006d, code lost:
        if (gy3.C87412m.m108589b(r1.f145945o, r6) == false) goto L_0x006f;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static te3.zg4 m59916k(xx0.C53458b r4, int r5, java.lang.String r6, int r7, java.lang.Object r8) {
        /*
            r7 = r7 & 2
            if (r7 == 0) goto L_0x0006
            java.lang.String r6 = ""
        L_0x0006:
            r4.getClass()
            te3.zg4 r4 = m59913g(r5)
            boolean r7 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43982j(r4)
            if (r7 == 0) goto L_0x00b2
            java.lang.String r7 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43973a(r4)
            boolean r7 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43981i(r7)
            if (r7 == 0) goto L_0x0027
            java.lang.String r7 = r4.f145945o
            boolean r7 = gy3.C87412m.m108589b(r7, r6)
            if (r7 != 0) goto L_0x0027
            goto L_0x00b7
        L_0x0027:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r7 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43979g()
            java.lang.String r8 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43975c(r4)
            r0 = 0
            java.lang.String r7 = r7.getString(r8, r0)
            if (r7 == 0) goto L_0x0071
            xx0.b r8 = f150358a
            te3.zg4 r1 = new te3.zg4
            r1.<init>()
            r8.mo74094m(r1, r5, r7)
            boolean r7 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43982j(r1)
            if (r7 == 0) goto L_0x0071
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r7 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43979g()
            java.lang.String r8 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43976d(r1)
            r2 = 0
            long r7 = r7.getLong(r8, r2)
            r2 = 3600000(0x36ee80, float:5.044674E-39)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.MMSlotKt.isExpire((long) r7, (int) r2)
            if (r7 != 0) goto L_0x0071
            java.lang.String r7 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43973a(r1)
            boolean r7 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43981i(r7)
            if (r7 == 0) goto L_0x0071
            java.lang.String r7 = r1.f145945o
            boolean r7 = gy3.C87412m.m108589b(r7, r6)
            if (r7 != 0) goto L_0x0071
        L_0x006f:
            r4 = r1
            goto L_0x00b7
        L_0x0071:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r7 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43979g()
            java.lang.String r8 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43978f(r4)
            java.util.Set r7 = r7.getStringSet(r8, r0)
            if (r7 == 0) goto L_0x00b2
            ux3.e r8 = ux3.C22667e.f65198d
            java.util.List r7 = sx3.C110818d0.m150943o0(r7, r8)
            java.util.Iterator r7 = r7.iterator()
        L_0x0089:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00b2
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r0 = gy3.C87412m.m108589b(r8, r6)
            if (r0 != 0) goto L_0x0089
            xx0.b r0 = f150358a
            te3.zg4 r1 = new te3.zg4
            r1.<init>()
            java.lang.String r2 = "uid"
            gy3.C87412m.m108593f(r8, r2)
            r0.mo74094m(r1, r5, r8)
            boolean r8 = r0.mo74096o(r1, r4)
            if (r8 == 0) goto L_0x0089
            goto L_0x006f
        L_0x00b2:
            te3.zg4 r4 = new te3.zg4
            r4.<init>()
        L_0x00b7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: xx0.C53458b.m59916k(xx0.b, int, java.lang.String, int, java.lang.Object):te3.zg4");
    }

    /* renamed from: e */
    public final String mo74090e(zg4 zg4) {
        return "Type:" + zg4.f145937d + " Version:" + zg4.f145938e + " CdnUrl:" + zg4.f145939f + " Md5:" + zg4.f145940g;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(1:2)|3|4|5|6|7|8|(3:12|(2:15|13)|82)|16|(10:18|19|(3:20|21|(1:23)(1:83))|24|25|26|(2:28|(1:30)(3:31|(1:37)(1:36)|38))|32|(0)(0)|38)(2:48|(1:50)(2:51|(1:53)))|54|55|56|(1:58)|59|60|81) */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0142, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0143, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r0 = r13.getInputStream();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0148, code lost:
        if (r0 != null) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x014a, code lost:
        r0.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x013c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x014d */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f9  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:59:0x013c=Splitter:B:59:0x013c, B:70:0x014d=Splitter:B:70:0x014d} */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final xx0.C53458b.C53459a mo74091f(int r17, java.lang.String r18, java.util.Map<java.lang.String, java.lang.String> r19, java.lang.String r20) {
        /*
            r16 = this;
            r1 = r17
            r2 = r18
            r0 = r19
            r3 = r20
            java.lang.String r4 = "Server return code:"
            java.lang.String r5 = "Cache-Control"
            java.lang.String r6 = " \nurl:"
            java.lang.String r7 = "MicroMsg.Preload.TmplInfoManager"
            xx0.b$a r8 = new xx0.b$a
            r8.<init>()
            com.tencent.mm.vfs.m1 r9 = new com.tencent.mm.vfs.m1
            r9.<init>((java.lang.String) r3)
            boolean r10 = r9.mo119967g()
            if (r10 == 0) goto L_0x0023
            r9.mo119966f()
        L_0x0023:
            r11 = 0
            r12 = 1
            java.net.URL r13 = new java.net.URL     // Catch:{ FileNotFoundException -> 0x017e, IOException -> 0x0151 }
            r13.<init>(r2)     // Catch:{ FileNotFoundException -> 0x017e, IOException -> 0x0151 }
            java.net.URLConnection r13 = r13.openConnection()     // Catch:{ FileNotFoundException -> 0x017e, IOException -> 0x0151 }
            java.lang.String r14 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            gy3.C87412m.m108592e(r13, r14)     // Catch:{ FileNotFoundException -> 0x017e, IOException -> 0x0151 }
            java.net.HttpURLConnection r13 = (java.net.HttpURLConnection) r13     // Catch:{ FileNotFoundException -> 0x017e, IOException -> 0x0151 }
            java.lang.String r14 = "no-cache"
            r13.setRequestProperty(r5, r14)     // Catch:{ all -> 0x0140 }
            java.lang.String r14 = "no-store"
            r13.setRequestProperty(r5, r14)     // Catch:{ all -> 0x0140 }
            r13.setDefaultUseCaches(r11)     // Catch:{ all -> 0x0140 }
            if (r0 == 0) goto L_0x007a
            boolean r5 = r19.isEmpty()     // Catch:{ all -> 0x0140 }
            r5 = r5 ^ r12
            if (r5 == 0) goto L_0x007a
            java.lang.String r5 = "headers.size:%d"
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch:{ all -> 0x0140 }
            int r15 = r19.size()     // Catch:{ all -> 0x0140 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0140 }
            r14[r11] = r15     // Catch:{ all -> 0x0140 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r5, r14)     // Catch:{ all -> 0x0140 }
            java.util.Set r5 = r19.keySet()     // Catch:{ all -> 0x0140 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0140 }
        L_0x0064:
            boolean r14 = r5.hasNext()     // Catch:{ all -> 0x0140 }
            if (r14 == 0) goto L_0x007a
            java.lang.Object r14 = r5.next()     // Catch:{ all -> 0x0140 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0140 }
            java.lang.Object r15 = r0.get(r14)     // Catch:{ all -> 0x0140 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x0140 }
            r13.setRequestProperty(r14, r15)     // Catch:{ all -> 0x0140 }
            goto L_0x0064
        L_0x007a:
            r13.setUseCaches(r11)     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = "GET"
            r13.setRequestMethod(r0)     // Catch:{ all -> 0x0140 }
            r0 = 10000(0x2710, float:1.4013E-41)
            r13.setReadTimeout(r0)     // Catch:{ all -> 0x0140 }
            r0 = 3000(0xbb8, float:4.204E-42)
            r13.setConnectTimeout(r0)     // Catch:{ all -> 0x0140 }
            r13.connect()     // Catch:{ all -> 0x0140 }
            int r0 = r13.getResponseCode()     // Catch:{ all -> 0x0140 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0140 }
            r5.<init>()     // Catch:{ all -> 0x0140 }
            r5.append(r4)     // Catch:{ all -> 0x0140 }
            r5.append(r0)     // Catch:{ all -> 0x0140 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0140 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r5)     // Catch:{ all -> 0x0140 }
            r5 = 200(0xc8, float:2.8E-43)
            if (r0 != r5) goto L_0x010c
            r9.mo119964e()     // Catch:{ all -> 0x0140 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0140 }
            java.io.InputStream r4 = r13.getInputStream()     // Catch:{ all -> 0x0140 }
            java.io.OutputStream r5 = com.tencent.p014mm.vfs.C86013q1.m106426H(r9)     // Catch:{ all -> 0x0140 }
            r14 = 0
        L_0x00b9:
            int r15 = r4.read(r0)     // Catch:{ all -> 0x0103 }
            r10 = -1
            if (r15 == r10) goto L_0x00c4
            r5.write(r0, r11, r15)     // Catch:{ all -> 0x0103 }
            goto L_0x00b9
        L_0x00c4:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0103 }
            cy3.C58003b.m67160a(r5, r14)     // Catch:{ all -> 0x0140 }
            r8.f150367a = r12     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = "X-WECHAT-MPBASEFULLVERSION"
            java.lang.String r0 = r13.getHeaderField(r0)     // Catch:{ all -> 0x0140 }
            r8.f150368b = r0     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = "X-WECHAT-MPPATCHMD5"
            java.lang.String r0 = r13.getHeaderField(r0)     // Catch:{ all -> 0x0140 }
            r8.f150369c = r0     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = "X-WECHAT-MPCONTROLFLAG"
            java.lang.String r0 = r13.getHeaderField(r0)     // Catch:{ all -> 0x0140 }
            if (r0 == 0) goto L_0x00ec
            boolean r4 = z04.C112551y.m153811k(r0)     // Catch:{ all -> 0x0140 }
            if (r4 == 0) goto L_0x00ea
            goto L_0x00ec
        L_0x00ea:
            r4 = 0
            goto L_0x00ed
        L_0x00ec:
            r4 = 1
        L_0x00ed:
            if (r4 != 0) goto L_0x00f9
            java.lang.String r4 = "0"
            boolean r0 = gy3.C87412m.m108589b(r4, r0)     // Catch:{ all -> 0x0140 }
            if (r0 != 0) goto L_0x00f9
            r0 = 1
            goto L_0x00fa
        L_0x00f9:
            r0 = 0
        L_0x00fa:
            r8.f150370d = r0     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = "save file end"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r0)     // Catch:{ all -> 0x0140 }
            goto L_0x0131
        L_0x0103:
            r0 = move-exception
            r4 = r0
            throw r4     // Catch:{ all -> 0x0106 }
        L_0x0106:
            r0 = move-exception
            r10 = r0
            cy3.C58003b.m67160a(r5, r4)     // Catch:{ all -> 0x0140 }
            throw r10     // Catch:{ all -> 0x0140 }
        L_0x010c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0140 }
            r5.<init>()     // Catch:{ all -> 0x0140 }
            r5.append(r4)     // Catch:{ all -> 0x0140 }
            r5.append(r0)     // Catch:{ all -> 0x0140 }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0140 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r4)     // Catch:{ all -> 0x0140 }
            r4 = 500(0x1f4, float:7.0E-43)
            if (r0 <= r4) goto L_0x0128
            r0 = 11
            g93.C32355a.m39690b(r1, r0, r12, r12)     // Catch:{ all -> 0x0140 }
            goto L_0x0131
        L_0x0128:
            r4 = 400(0x190, float:5.6E-43)
            if (r0 <= r4) goto L_0x0131
            r0 = 10
            g93.C32355a.m39690b(r1, r0, r12, r12)     // Catch:{ all -> 0x0140 }
        L_0x0131:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0140 }
            java.io.InputStream r0 = r13.getInputStream()     // Catch:{ all -> 0x013c }
            if (r0 == 0) goto L_0x013c
            r0.close()     // Catch:{ all -> 0x013c }
        L_0x013c:
            r13.disconnect()     // Catch:{ FileNotFoundException -> 0x017e, IOException -> 0x0151 }
            goto L_0x01aa
        L_0x0140:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0142 }
        L_0x0142:
            r0 = move-exception
            r4 = r0
            java.io.InputStream r0 = r13.getInputStream()     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x014d
            r0.close()     // Catch:{ all -> 0x014d }
        L_0x014d:
            r13.disconnect()     // Catch:{ FileNotFoundException -> 0x017e, IOException -> 0x0151 }
            throw r4     // Catch:{ FileNotFoundException -> 0x017e, IOException -> 0x0151 }
        L_0x0151:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "download file:"
            r4.append(r5)
            r4.append(r3)
            r4.append(r6)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object[] r3 = new java.lang.Object[r11]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r2, r3)
            r8.f150371e = r0
            r2 = 7
            g93.C32355a.m39690b(r1, r2, r12, r12)
            boolean r0 = r9.mo119967g()
            if (r0 == 0) goto L_0x01aa
            r9.mo119966f()
            goto L_0x01aa
        L_0x017e:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "not found file:"
            r4.append(r5)
            r4.append(r3)
            r4.append(r6)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object[] r3 = new java.lang.Object[r11]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r2, r3)
            r8.f150371e = r0
            r2 = 7
            g93.C32355a.m39690b(r1, r2, r12, r12)
            boolean r0 = r9.mo119967g()
            if (r0 == 0) goto L_0x01aa
            r9.mo119966f()
        L_0x01aa:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xx0.C53458b.mo74091f(int, java.lang.String, java.util.Map, java.lang.String):xx0.b$a");
    }

    /* renamed from: h */
    public final String mo74092h() {
        String str = "";
        for (Integer intValue : (Integer[]) ((C36570n) f150361d).getValue()) {
            int intValue2 = intValue.intValue();
            zg4 g = m59913g(intValue2);
            str = str + intValue2 + XVFSFile.PATH_SEPARATOR_CHAR + g.f145938e + 10;
        }
        return str;
    }

    /* renamed from: l */
    public final void mo74093l(ah4 ah4, boolean z) {
        C87412m.m108594g(ah4, "tmplParams");
        String str = "_tmpl_info_inject_fail_-" + ah4.f130536d + '-' + ah4.f130541i;
        if (z) {
            C40716j0.m43979g().removeValueForKey(str);
            return;
        }
        int i = C40716j0.m43979g().getInt(str, 0) + 1;
        C40716j0.m43979g().putInt(str, i);
        Log.m105920e("MicroMsg.Preload.TmplInfoManager", "store tmpl inject fail:" + ah4.f130536d + ',' + ah4.f130541i + ',' + i);
        if (i > 2) {
            C32355a.m39689a(219);
            Log.m105920e("MicroMsg.Preload.TmplInfoManager", "clear tmpl for too many inject fail:" + ah4.f130536d + ',' + ah4.f130541i + ',' + i);
        }
    }

    /* renamed from: m */
    public final zg4 mo74094m(zg4 zg4, int i, String str) {
        zg4.f145937d = i;
        zg4.f145945o = str;
        byte[] decodeBytes = C40716j0.m43979g().decodeBytes(C40716j0.m43977e(zg4));
        if (!(decodeBytes == null || decodeBytes.length == 0)) {
            try {
                zg4.parseFrom(decodeBytes);
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.Preload.TmplInfoManager", th, "decode TmplInfo:" + i + ", " + str, new Object[0]);
            }
        }
        return zg4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00dc, code lost:
        r5.flush();
        r3 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        cy3.C58003b.m67160a(r5, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        cy3.C58003b.m67160a(r2, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00eb, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        cy3.C58003b.m67160a(r5, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ef, code lost:
        throw r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f2, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        cy3.C58003b.m67160a(r2, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f6, code lost:
        throw r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fd, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00fe, code lost:
        cy3.C58003b.m67160a(r0, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0101, code lost:
        throw r14;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo74095n(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile
            r0.<init>(r13)
            java.util.Enumeration r13 = r0.entries()     // Catch:{ all -> 0x00fb }
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x00fb }
        L_0x000d:
            boolean r2 = r13.hasMoreElements()     // Catch:{ all -> 0x00fb }
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x00f7
            java.lang.Object r2 = r13.nextElement()     // Catch:{ all -> 0x00fb }
            java.util.zip.ZipEntry r2 = (java.util.zip.ZipEntry) r2     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r2.getName()     // Catch:{ all -> 0x00fb }
            java.lang.String r5 = "name"
            gy3.C87412m.m108593f(r11, r5)     // Catch:{ all -> 0x00fb }
            java.lang.String r6 = "../"
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r5 = r11
            int r5 = z04.C112550d0.m153769E(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00fb }
            r6 = -1
            r7 = 0
            if (r5 == r6) goto L_0x0040
            java.lang.String r2 = "MicroMsg.Preload.TmplInfoManager"
            java.lang.String r4 = "skip unzip break through file:%s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00fb }
            r3[r7] = r11     // Catch:{ all -> 0x00fb }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r4, r3)     // Catch:{ all -> 0x00fb }
            goto L_0x000d
        L_0x0040:
            com.tencent.mm.vfs.m1 r3 = new com.tencent.mm.vfs.m1     // Catch:{ all -> 0x00fb }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fb }
            r5.<init>()     // Catch:{ all -> 0x00fb }
            r5.append(r14)     // Catch:{ all -> 0x00fb }
            r5.append(r11)     // Catch:{ all -> 0x00fb }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00fb }
            r3.<init>((java.lang.String) r5)     // Catch:{ all -> 0x00fb }
            java.lang.String r5 = r3.mo119973k()     // Catch:{ all -> 0x00fb }
            gy3.C87412m.m108591d(r5)     // Catch:{ all -> 0x00fb }
            android.net.Uri r5 = com.tencent.p014mm.vfs.C116299g2.m163858n(r5)     // Catch:{ all -> 0x00fb }
            java.lang.String r6 = r5.getPath()     // Catch:{ all -> 0x00fb }
            if (r6 == 0) goto L_0x007f
            java.lang.String r6 = com.tencent.p014mm.vfs.C116299g2.m163855k(r6, r7, r7)     // Catch:{ all -> 0x00fb }
            java.lang.String r8 = r5.getPath()     // Catch:{ all -> 0x00fb }
            boolean r8 = r8.equals(r6)     // Catch:{ all -> 0x00fb }
            if (r8 != 0) goto L_0x007f
            android.net.Uri$Builder r5 = r5.buildUpon()     // Catch:{ all -> 0x00fb }
            android.net.Uri$Builder r5 = r5.path(r6)     // Catch:{ all -> 0x00fb }
            android.net.Uri r5 = r5.build()     // Catch:{ all -> 0x00fb }
        L_0x007f:
            com.tencent.mm.vfs.f0 r6 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ all -> 0x00fb }
            com.tencent.mm.vfs.f0$h r6 = r6.mo177799l(r5, r4)     // Catch:{ all -> 0x00fb }
            boolean r8 = r6.mo177810a()     // Catch:{ all -> 0x00fb }
            if (r8 != 0) goto L_0x008d
            r8 = 0
            goto L_0x0095
        L_0x008d:
            com.tencent.mm.vfs.FileSystem$c r8 = r6.f348991a     // Catch:{ all -> 0x00fb }
            java.lang.String r9 = r6.f348992b     // Catch:{ all -> 0x00fb }
            boolean r8 = r8.mo119948x(r9)     // Catch:{ all -> 0x00fb }
        L_0x0095:
            if (r8 != 0) goto L_0x00ab
            com.tencent.mm.vfs.f0 r8 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ all -> 0x00fb }
            com.tencent.mm.vfs.f0$h r5 = r8.mo177799l(r5, r6)     // Catch:{ all -> 0x00fb }
            boolean r6 = r5.mo177810a()     // Catch:{ all -> 0x00fb }
            if (r6 != 0) goto L_0x00a4
            goto L_0x00ab
        L_0x00a4:
            com.tencent.mm.vfs.FileSystem$c r6 = r5.f348991a     // Catch:{ all -> 0x00fb }
            java.lang.String r5 = r5.f348992b     // Catch:{ all -> 0x00fb }
            r6.mo119937g(r5)     // Catch:{ all -> 0x00fb }
        L_0x00ab:
            boolean r5 = r2.isDirectory()     // Catch:{ all -> 0x00fb }
            if (r5 == 0) goto L_0x00bc
            boolean r2 = r3.mo119967g()     // Catch:{ all -> 0x00fb }
            if (r2 != 0) goto L_0x000d
            r3.mo119987x()     // Catch:{ all -> 0x00fb }
            goto L_0x000d
        L_0x00bc:
            boolean r5 = r3.mo119967g()     // Catch:{ all -> 0x00fb }
            if (r5 != 0) goto L_0x00c5
            r3.mo119964e()     // Catch:{ all -> 0x00fb }
        L_0x00c5:
            java.io.InputStream r2 = r0.getInputStream(r2)     // Catch:{ all -> 0x00fb }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00f0 }
            java.io.OutputStream r3 = com.tencent.p014mm.vfs.C86013q1.m106426H(r3)     // Catch:{ all -> 0x00f0 }
            r5.<init>(r3)     // Catch:{ all -> 0x00f0 }
        L_0x00d2:
            int r3 = r2.read(r1)     // Catch:{ all -> 0x00e9 }
            if (r3 <= 0) goto L_0x00dc
            r5.write(r1, r7, r3)     // Catch:{ all -> 0x00e9 }
            goto L_0x00d2
        L_0x00dc:
            r5.flush()     // Catch:{ all -> 0x00e9 }
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00e9 }
            cy3.C58003b.m67160a(r5, r4)     // Catch:{ all -> 0x00f0 }
            cy3.C58003b.m67160a(r2, r4)     // Catch:{ all -> 0x00fb }
            goto L_0x000d
        L_0x00e9:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x00eb }
        L_0x00eb:
            r14 = move-exception
            cy3.C58003b.m67160a(r5, r13)     // Catch:{ all -> 0x00f0 }
            throw r14     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x00f2 }
        L_0x00f2:
            r14 = move-exception
            cy3.C58003b.m67160a(r2, r13)     // Catch:{ all -> 0x00fb }
            throw r14     // Catch:{ all -> 0x00fb }
        L_0x00f7:
            cy3.C58003b.m67160a(r0, r4)
            return r3
        L_0x00fb:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x00fd }
        L_0x00fd:
            r14 = move-exception
            cy3.C58003b.m67160a(r0, r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: xx0.C53458b.mo74095n(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bf  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo74096o(te3.zg4 r9, te3.zg4 r10) {
        /*
            r8 = this;
            java.lang.String r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43973a(r9)
            boolean r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43981i(r0)
            r1 = 0
            java.lang.String r2 = "MicroMsg.Preload.TmplInfoManager"
            if (r0 == 0) goto L_0x012b
            boolean r0 = gy3.C87412m.m108589b(r9, r10)
            java.lang.String r3 = "tmpl "
            r4 = 1
            if (r0 == 0) goto L_0x001e
            int r0 = r9.f145938e
            if (r0 == 0) goto L_0x001e
        L_0x001b:
            r0 = 1
            goto L_0x00a4
        L_0x001e:
            int r0 = r10.f145941h
            int r5 = com.tencent.p014mm.sdk.platformtools.Log.getLogLevel()
            if (r5 != 0) goto L_0x0035
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r6 = -1
            java.lang.String r7 = "preload_tmpl_lowerbound"
            int r5 = r5.getInt(r7, r6)
            if (r5 <= 0) goto L_0x0035
            r0 = r5
        L_0x0035:
            int r5 = r9.f145938e
            if (r5 >= r0) goto L_0x0061
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r6 = r9.f145945o
            r5.append(r6)
            java.lang.String r6 = " version:"
            r5.append(r6)
            int r6 = r9.f145938e
            r5.append(r6)
            java.lang.String r6 = " < "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            r0 = 0
            goto L_0x00a4
        L_0x0061:
            java.util.LinkedList<te3.bh4> r0 = r10.f145946p
            java.lang.String r5 = "standard.VersionControlList"
            gy3.C87412m.m108593f(r0, r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x006d:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x001b
            java.lang.Object r5 = r0.next()
            te3.bh4 r5 = (te3.bh4) r5
            java.lang.String r6 = r5.f131125d
            java.lang.String r7 = r9.f145945o
            boolean r6 = gy3.C87412m.m108589b(r6, r7)
            if (r6 == 0) goto L_0x006d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r6 = r5.f131125d
            r0.append(r6)
            java.lang.String r6 = " matchControls in forceH5:"
            r0.append(r6)
            boolean r6 = r5.f131126e
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            boolean r0 = r5.f131126e
            r0 = r0 ^ r4
        L_0x00a4:
            if (r0 == 0) goto L_0x00bf
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r10 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43979g()
            java.lang.String r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43975c(r9)
            java.lang.String r1 = r9.f145945o
            r10.putString(r0, r1)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r10 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43979g()
            java.lang.String r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43976d(r9)
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40744p.m44017c(r10, r9)
            return r4
        L_0x00bf:
            java.lang.String r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43977e(r9)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43979g()
            java.lang.String r5 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43975c(r9)
            r6 = 0
            java.lang.String r4 = r4.getString(r5, r6)
            boolean r0 = gy3.C87412m.m108589b(r0, r4)
            if (r0 == 0) goto L_0x00ec
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43979g()
            java.lang.String r4 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43975c(r9)
            r0.removeValueForKey(r4)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43979g()
            java.lang.String r4 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43976d(r9)
            r0.removeValueForKey(r4)
        L_0x00ec:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43979g()
            java.lang.String r4 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43977e(r9)
            r0.remove(r4)
            java.lang.String r10 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43978f(r10)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43979g()
            java.util.Set r0 = r0.getStringSet(r10, r6)
            if (r0 == 0) goto L_0x0111
            java.lang.String r4 = r9.f145945o
            r0.remove(r4)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43979g()
            r4.putStringSet(r10, r0)
        L_0x0111:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r3)
            java.lang.String r9 = r9.f145945o
            r10.append(r9)
            java.lang.String r9 = " is invalid"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r9)
            goto L_0x0141
        L_0x012b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "no tmpl file:"
            r10.append(r0)
            java.lang.String r9 = r9.f145945o
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r9)
        L_0x0141:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xx0.C53458b.mo74096o(te3.zg4, te3.zg4):boolean");
    }

    /* renamed from: p */
    public final boolean mo74097p(String str, C86009m1 m1Var) {
        String q = C86013q1.m106456q(m1Var.mo119976n());
        if (!Util.isNullOrNil(str) && C87412m.m108589b(str, q)) {
            return true;
        }
        Log.m105920e("MicroMsg.Preload.TmplInfoManager", "checkTmpl MD5 not match md5=" + str + ", fileMd5=" + q + ", filePath=" + m1Var.mo119971i() + ", fileSize=" + m1Var.mo119980r());
        return false;
    }
}
