package b03;

import a70.C112760b;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.ImageView;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import eb0.C31543z5;
import f40.C86709a0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import jq3.C9493c;
import kj2.C117407d;
import lz2.C46922e;
import qy2.C63347a;
import rx3.C13598b0;
import rz2.C48201c;
import sx3.C36907w;
import uz2.C52669b0;
import uz2.C52676d1;
import uz2.C52678e0;
import uz2.C52679e1;
import uz2.C52716t0;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: b03.i */
public final class C39701i extends C39691c {

    /* renamed from: a */
    public static final C39701i f106511a = new C39701i();

    /* renamed from: b */
    public static HashMap<String, C39703b> f106512b = new HashMap<>();

    /* renamed from: c */
    public static C39704c f106513c;

    /* renamed from: d */
    public static final Map<String, Bitmap> f106514d = new LinkedHashMap();

    /* renamed from: e */
    public static final Map<String, Bitmap> f106515e = new LinkedHashMap();

    /* renamed from: f */
    public static final Map<String, Bitmap> f106516f = new LinkedHashMap();

    /* renamed from: g */
    public static final String[] f106517g = {"zh_CN", "en", "zh_HK", "zh_TW"};

    /* renamed from: b03.i$a */
    public static final class C39702a {

        /* renamed from: a */
        public String f106518a;

        /* renamed from: b */
        public List<C39703b> f106519b = new LinkedList();

        /* renamed from: c */
        public final Map<String, String> f106520c = new HashMap();

        public C39702a(String str, Map<String, String> map) {
            C87412m.m108594g(str, "prefix");
            C87412m.m108594g(map, "xmlMap");
            String safeFormatString = Util.safeFormatString(Util.nullAs(map.get(str + ".$categoryId"), ""), "");
            C87412m.m108593f(safeFormatString, "safeFormatString(Util.nu…x.\\$categoryId\"], \"\"),\"\")");
            this.f106518a = safeFormatString;
            String str2 = str + ".iconArray.iconItem";
            String str3 = str2;
            int i = 1;
            while (map.get(str3) != null) {
                C39703b bVar = new C39703b(str3, map);
                str3 = str2 + i;
                i++;
                this.f106519b.add(bVar);
                C39701i.f106511a.getClass();
                C39701i.f106512b.put(bVar.f106521a, bVar);
            }
            C39701i.f106511a.mo62331Y(this.f106520c, map, str + ".description");
        }
    }

    /* renamed from: b03.i$b */
    public static final class C39703b {

        /* renamed from: a */
        public String f106521a;

        /* renamed from: b */
        public long f106522b;

        /* renamed from: c */
        public long f106523c;

        /* renamed from: d */
        public String f106524d;

        /* renamed from: e */
        public int f106525e;

        /* renamed from: f */
        public String f106526f;

        /* renamed from: g */
        public Map<String, String> f106527g = new HashMap();

        /* renamed from: h */
        public Map<String, String> f106528h = new HashMap();

        /* renamed from: i */
        public C39705d f106529i;

        public C39703b(String str, Map<String, String> map) {
            C87412m.m108594g(str, "prefix");
            C87412m.m108594g(map, "xmlMap");
            String safeFormatString = Util.safeFormatString(Util.nullAs(map.get(str + ".$iconId"), ""), "");
            C87412m.m108593f(safeFormatString, "safeFormatString(Util.nu…efix.\\$iconId\"], \"\"), \"\")");
            this.f106521a = safeFormatString;
            this.f106522b = Util.safeParseLong(map.get(str + ".effectTime"));
            this.f106523c = Util.safeParseLong(map.get(str + ".expireTime"));
            String safeFormatString2 = Util.safeFormatString(Util.nullAs(map.get(str + ".useOriginalImage"), ""), "");
            C87412m.m108593f(safeFormatString2, "safeFormatString(Util.nu…OriginalImage\"], \"\"), \"\")");
            this.f106524d = safeFormatString2;
            this.f106525e = Util.safeParseInt(Util.nullAs(map.get(str + ".residentAfterPublish"), ""));
            String safeFormatString3 = Util.safeFormatString(Util.nullAs(map.get(str + ".residentCategoryId"), ""), "");
            C87412m.m108593f(safeFormatString3, "safeFormatString(Util.nu…entCategoryId\"], \"\"), \"\")");
            this.f106526f = safeFormatString3;
            this.f106529i = new C39705d(str + ".styleArray", map);
            C39701i iVar = C39701i.f106511a;
            Map<String, String> map2 = this.f106527g;
            iVar.mo62331Y(map2, map, str + ".description");
            Map<String, String> map3 = this.f106528h;
            iVar.mo62331Y(map3, map, str + ".sameFriendsTip");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
            if ((r0.length() > 0) == true) goto L_0x004d;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo62333a() {
            /*
                r5 = this;
                java.lang.String r0 = r5.f106521a
                java.lang.String r1 = "userdefine"
                boolean r0 = gy3.C87412m.m108589b(r0, r1)
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x002c
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_TEXT_STATUS_CUSTOM_STATUS_NAME_STRING
                java.lang.String r4 = ""
                java.lang.String r0 = r0.mo119675I(r3, r4)
                if (r0 == 0) goto L_0x0028
                int r3 = r0.length()
                if (r3 != 0) goto L_0x0026
                goto L_0x0028
            L_0x0026:
                r3 = 0
                goto L_0x0029
            L_0x0028:
                r3 = 1
            L_0x0029:
                if (r3 != 0) goto L_0x002c
                return r0
            L_0x002c:
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getCurrentLanguage(r0)
                java.util.Map<java.lang.String, java.lang.String> r3 = r5.f106527g
                java.util.HashMap r3 = (java.util.HashMap) r3
                java.lang.Object r0 = r3.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                if (r0 == 0) goto L_0x004c
                int r3 = r0.length()
                if (r3 <= 0) goto L_0x0048
                r3 = 1
                goto L_0x0049
            L_0x0048:
                r3 = 0
            L_0x0049:
                if (r3 != r1) goto L_0x004c
                goto L_0x004d
            L_0x004c:
                r1 = 0
            L_0x004d:
                if (r1 == 0) goto L_0x0050
                goto L_0x005c
            L_0x0050:
                java.util.Map<java.lang.String, java.lang.String> r0 = r5.f106527g
                java.util.HashMap r0 = (java.util.HashMap) r0
                java.lang.String r1 = "en"
                java.lang.Object r0 = r0.get(r1)
                java.lang.String r0 = (java.lang.String) r0
            L_0x005c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: b03.C39701i.C39703b.mo62333a():java.lang.String");
        }

        /* renamed from: b */
        public final boolean mo62334b() {
            long j = this.f106522b;
            long j2 = j < 0 ? 0 : j;
            long j3 = this.f106523c;
            if (j3 <= 0 || j3 <= j) {
                j3 = MAlarmHandler.NEXT_FIRE_INTERVAL;
            }
            long e = (long) C31543z5.m39455e();
            return j2 <= e && e <= j3;
        }
    }

    /* renamed from: b03.i$c */
    public static final class C39704c {

        /* renamed from: a */
        public int f106530a;

        /* renamed from: b */
        public List<C39702a> f106531b = new LinkedList();

        /* renamed from: c */
        public List<C39703b> f106532c;

        public C39704c(Map<String, String> map) {
            C87412m.m108594g(map, "xmlMap");
            this.f106530a = Util.safeParseInt(map.get(".textStateResource.version"));
            String str = ".textStateResource.categoryArray.categoryItem";
            int i = 1;
            while (map.get(str) != null) {
                C39702a aVar = new C39702a(str, map);
                str = ".textStateResource.categoryArray.categoryItem" + i;
                i++;
                this.f106531b.add(aVar);
            }
            this.f106532c = new LinkedList();
            String str2 = ".textStateResource.otherIcons.iconArray.iconItem";
            int i2 = 1;
            while (map.get(str2) != null) {
                C39703b bVar = new C39703b(str2, map);
                str2 = ".textStateResource.otherIcons.iconArray.iconItem" + i2;
                i2++;
                this.f106532c.add(bVar);
                C39701i.f106511a.getClass();
                C39701i.f106512b.put(bVar.f106521a, bVar);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("InitStatusResItem categories:");
            sb.append(this.f106531b.size());
            sb.append(" iconItemMap:");
            C39701i.f106511a.getClass();
            sb.append(C39701i.f106512b.size());
            sb.append(" hideItems:");
            sb.append(this.f106532c.size());
            Log.m105924i("MicroMsg.TextStatus.StatusIconHelper", sb.toString());
        }
    }

    /* renamed from: b03.i$d */
    public static final class C39705d {

        /* renamed from: a */
        public List<C39706e> f106533a = new LinkedList();

        public C39705d(String str, Map<String, String> map) {
            C87412m.m108594g(str, "prefix");
            C87412m.m108594g(map, "xmlMap");
            String str2 = str + ".styleItem";
            int i = 1;
            while (map.get(str2) != null) {
                C39706e eVar = new C39706e(str2, map);
                str2 = str + i;
                i++;
                this.f106533a.add(eVar);
            }
        }
    }

    /* renamed from: b03.i$e */
    public static final class C39706e {

        /* renamed from: a */
        public int f106534a;

        /* renamed from: b */
        public long f106535b;

        /* renamed from: c */
        public long f106536c;

        public C39706e(String str, Map<String, String> map) {
            C87412m.m108594g(str, "prefix");
            C87412m.m108594g(map, "xmlMap");
            this.f106534a = Util.safeParseInt(Util.nullAs(map.get(str + ".$styleId"), ""));
            this.f106535b = Util.safeParseLong(map.get(str + ".beginTime"));
            this.f106536c = Util.safeParseLong(map.get(str + ".endTime"));
        }
    }

    /* renamed from: A */
    public boolean mo62271A() {
        return false;
    }

    /* renamed from: B */
    public boolean mo62272B() {
        return false;
    }

    /* renamed from: C */
    public boolean mo62273C() {
        return false;
    }

    /* renamed from: D */
    public boolean mo62274D() {
        return false;
    }

    /* renamed from: E */
    public boolean mo62275E() {
        return false;
    }

    /* renamed from: F */
    public boolean mo62276F() {
        return false;
    }

    /* renamed from: G */
    public boolean mo62277G() {
        return false;
    }

    /* renamed from: H */
    public boolean mo62278H() {
        return false;
    }

    /* renamed from: I */
    public boolean mo62279I() {
        return false;
    }

    /* renamed from: J */
    public boolean mo62280J(String str) {
        return false;
    }

    /* renamed from: K */
    public void mo62281K() {
        super.mo62281K();
        long c = C31543z5.m39453c();
        String str = C112760b.m154225d() + "textstatus/icon";
        if (!C86013q1.m106450k(str)) {
            C86013q1.m106461v(str);
        }
        int T = mo62326T(str);
        byte[] O = C86013q1.m106433O("assets:///text_status_res/TextStatus.zip", 0, -1);
        C86009m1 m1Var = new C86009m1(MMApplicationContext.getContext().getCacheDir(), "TextStatus");
        C86013q1.m106461v(m1Var.mo119971i());
        C86009m1 m1Var2 = new C86009m1(m1Var, "asset.zip");
        if (m1Var2.mo119967g()) {
            m1Var2.mo119966f();
        }
        C86013q1.m106437S(m1Var2.mo119971i(), O);
        String i = m1Var2.mo119971i();
        C87412m.m108593f(i, "tempOutputZip.absolutePath");
        int V = mo62328V(i);
        if (V > T) {
            C117407d.INSTANCE.idkeyStat(1629, 14, 1, false);
            String i2 = m1Var2.mo119971i();
            C87412m.m108593f(i2, "tempOutputZip.absolutePath");
            mo62330X(i2, V);
        } else {
            C117407d.INSTANCE.idkeyStat(1629, 15, 1, false);
            mo62329W();
            Log.m105924i("MicroMsg.TextStatus.StatusIconHelper", "initTextStatusResource no need to updateVersion currentVersion:" + T + " assetVersion:" + V);
        }
        m1Var2.mo119966f();
        Log.m105924i("MicroMsg.TextStatus.StatusIconHelper", "initTextStatusResource cost:" + (C31543z5.m39453c() - c));
    }

    /* renamed from: L */
    public void mo62282L() {
        super.mo62282L();
    }

    /* renamed from: N */
    public void mo62284N(Integer num) {
    }

    /* renamed from: O */
    public void mo62285O(ImageView imageView, String str, C63347a.C47893d dVar, C63347a.C47891b bVar, C48201c cVar) {
        C87412m.m108594g(dVar, "iconType");
        C87412m.m108594g(bVar, "iconColor");
    }

    /* renamed from: P */
    public void mo62286P(long j) {
    }

    /* renamed from: Q */
    public void mo62287Q(String str) {
        C87412m.m108594g(str, "iconId");
    }

    /* renamed from: R */
    public void mo62288R(ImageView imageView, String str, C63347a.C47893d dVar, C63347a.C47891b bVar, C48201c cVar, boolean z, boolean z2) {
        C87412m.m108594g(dVar, "iconType");
        C87412m.m108594g(bVar, "iconColor");
        Drawable U = mo62327U(str, C63347a.C47893d.FILLED, C63347a.C47891b.DEFAULT);
        if (imageView != null) {
            imageView.setImageDrawable(U);
        }
    }

    /* renamed from: T */
    public final int mo62326T(String str) {
        C87412m.m108594g(str, "folderPath");
        String str2 = str + "/TextStateIconConfig.xml";
        ArrayList arrayList = null;
        if (C86013q1.m106450k(str2)) {
            Map<String, String> parseXml = XmlParser.parseXml(C86013q1.m106432N(new C86009m1(str2).mo119971i()), "textStateResource", "");
            if (parseXml == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("getFolderResVersion fail xmlMap is null:");
                sb.append(str);
                sb.append(' ');
                Iterable<C86001b0> t = C86013q1.m106459t(str, false);
                if (t != null) {
                    arrayList = new ArrayList(C36907w.m41090l(t, 10));
                    for (C86001b0 b0Var : t) {
                        arrayList.add(b0Var.f250472b);
                    }
                }
                sb.append(arrayList);
                Log.m105924i("MicroMsg.TextStatus.StatusIconHelper", sb.toString());
                return -1;
            }
            int safeParseInt = Util.safeParseInt(parseXml.get(".textStateResource.version"));
            Log.m105924i("MicroMsg.TextStatus.StatusIconHelper", "getFolderResVersion unzipVersion " + safeParseInt);
            return safeParseInt;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("getFolderResVersion fail not exist configPath:");
        sb4.append(str);
        sb4.append(' ');
        Iterable<C86001b0> t2 = C86013q1.m106459t(str, false);
        if (t2 != null) {
            arrayList = new ArrayList(C36907w.m41090l(t2, 10));
            for (C86001b0 b0Var2 : t2) {
                arrayList.add(b0Var2.f250472b);
            }
        }
        sb4.append(arrayList);
        Log.m105924i("MicroMsg.TextStatus.StatusIconHelper", sb4.toString());
        return -1;
    }

    /* renamed from: U */
    public final Drawable mo62327U(String str, C63347a.C47893d dVar, C63347a.C47891b bVar) {
        String str2;
        C13598b0 b0Var;
        C63347a.C47893d dVar2 = dVar;
        C63347a.C47891b bVar2 = bVar;
        C63347a.C47893d dVar3 = C63347a.C47893d.READ;
        C87412m.m108594g(dVar2, "iconType");
        C87412m.m108594g(bVar2, "iconColor");
        String str3 = null;
        if (str != null) {
            String str4 = str.length() > 0 ? str : null;
            if (str4 != null) {
                C39703b bVar3 = f106512b.get(str4);
                if (bVar3 != null) {
                    long j = bVar3.f106522b;
                    if (j < 0) {
                        j = 0;
                    }
                    long e = (long) C31543z5.m39455e();
                    if (!(j <= e && e <= MAlarmHandler.NEXT_FIRE_INTERVAL)) {
                        return null;
                    }
                    str2 = bVar3.f106521a;
                    for (C39706e eVar : bVar3.f106529i.f106533a) {
                        long j2 = eVar.f106535b;
                        long j3 = j2 < 0 ? 0 : j2;
                        long j4 = eVar.f106536c;
                        if (j4 <= 0 || j4 <= j2) {
                            j4 = MAlarmHandler.NEXT_FIRE_INTERVAL;
                        }
                        long e2 = (long) C31543z5.m39455e();
                        if (j3 <= e2 && e2 <= j4) {
                            str2 = str2 + '_' + eVar.f106534a;
                        }
                    }
                    b0Var = C13598b0.f38549a;
                } else {
                    b0Var = null;
                    str2 = str4;
                }
                if (b0Var == null) {
                    return null;
                }
                C39701i iVar = f106511a;
                iVar.getClass();
                C39703b bVar4 = f106512b.get(str4);
                C63347a.C47893d dVar4 = (!Util.isEqual(bVar4 != null ? bVar4.f106524d : null, "1") || bVar2 != C63347a.C47891b.GREY) ? dVar2 : dVar3;
                int ordinal = dVar4.ordinal();
                Bitmap bitmap = ordinal != 0 ? ordinal != 2 ? (Bitmap) ((LinkedHashMap) f106515e).get(str2) : (Bitmap) ((LinkedHashMap) f106516f).get(str2) : (Bitmap) ((LinkedHashMap) f106514d).get(str2);
                if (bitmap == null || bitmap.isRecycled()) {
                    String str5 = C112760b.m154225d() + "textstatus/icon";
                    if (!C86013q1.m106450k(str5)) {
                        C86013q1.m106461v(str5);
                    }
                    C86009m1 m1Var = new C86009m1(String.valueOf(str5));
                    if (!TextUtils.isEmpty(str2) && m1Var.mo119967g()) {
                        int ordinal2 = dVar4.ordinal();
                        bitmap = BitmapUtil.decodeFile(new C86009m1(m1Var, str2 + (ordinal2 != 1 ? ordinal2 != 2 ? "_filled" : "_read" : "_outlined") + ".png").mo119971i(), (BitmapFactory.Options) null);
                        if (bitmap != null) {
                            bitmap.setDensity(C0947jz.f2205e);
                            if (dVar4 == C63347a.C47893d.FILLED) {
                                f106514d.put(str2, bitmap);
                            } else if (dVar4 == dVar3) {
                                f106516f.put(str2, bitmap);
                            } else {
                                f106515e.put(str2, bitmap);
                            }
                        }
                    }
                } else {
                    Log.m105924i("MicroMsg.TextStatus.StatusIconHelper", "cache icon " + str2);
                }
                if (bitmap != null) {
                    C39703b bVar5 = f106512b.get(str4);
                    if (bVar5 != null) {
                        str3 = bVar5.f106524d;
                    }
                    return iVar.mo62297i(bitmap, Util.isEqual(str3, "1"), dVar2, bVar2);
                }
            }
        }
        return null;
    }

    /* renamed from: V */
    public final int mo62328V(String str) {
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        C86009m1 m1Var = new C86009m1(MMApplicationContext.getContext().getCacheDir(), "TextStatus/temp");
        if (m1Var.mo119967g()) {
            C86013q1.m106445f(m1Var.mo119971i());
        }
        C86013q1.m106461v(m1Var.mo119971i());
        int R = C86013q1.m106436R(str, m1Var.mo119971i());
        int i = -1;
        if (R == 0) {
            String i2 = m1Var.mo119971i();
            C87412m.m108593f(i2, "tempOutputFolder.absolutePath");
            i = mo62326T(i2);
        } else {
            Log.m105924i("MicroMsg.TextStatus.StatusIconHelper", "getZipVersion unzip fail " + R + ' ' + str);
        }
        C86013q1.m106445f(m1Var.mo119971i());
        return i;
    }

    /* renamed from: W */
    public final void mo62329W() {
        if (IStatusIconHelperKt.f82191a) {
            f106512b.clear();
            ((LinkedHashMap) f106514d).clear();
            ((LinkedHashMap) f106515e).clear();
            ((LinkedHashMap) f106516f).clear();
            StringBuilder sb = new StringBuilder();
            String str = C112760b.m154225d() + "textstatus/icon";
            if (!C86013q1.m106450k(str)) {
                C86013q1.m106461v(str);
            }
            sb.append(str);
            sb.append("/TextStateIconConfig.xml");
            String sb4 = sb.toString();
            if (C86013q1.m106450k(sb4)) {
                Map<String, String> parseXml = XmlParser.parseXml(C86013q1.m106432N(new C86009m1(sb4).mo119971i()), "textStateResource", "");
                if (parseXml != null) {
                    C39704c cVar = new C39704c(parseXml);
                    f106511a.getClass();
                    for (C39703b bVar : cVar.f106532c) {
                        if (bVar.f106525e == 1) {
                            C39701i iVar = f106511a;
                            String str2 = bVar.f106521a;
                            iVar.getClass();
                            String I = C86709a0.m107535s().mo121142i().mo119675I(C72994y1.C72995a.USERINFO_TEXT_STATUS_RESIDENT_CONFIG_STRING, "");
                            String str3 = '<' + str2 + ":1>";
                            C87412m.m108593f(I, "residentConfig");
                            if (C112550d0.m153801u(I, str3, false) && bVar.mo62334b()) {
                                Iterator<T> it = cVar.f106531b.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    C39702a aVar = (C39702a) it.next();
                                    if (C87412m.m108589b(aVar.f106518a, bVar.f106526f)) {
                                        ((LinkedList) aVar.f106519b).add(bVar);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    f106513c = cVar;
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append("initTextStatusResItem version:");
                C39704c cVar2 = f106513c;
                sb5.append(cVar2 != null ? cVar2.f106530a : -1);
                Log.m105924i("MicroMsg.TextStatus.StatusIconHelper", sb5.toString());
                C117407d.INSTANCE.idkeyStat(1629, 8, 1, false);
                return;
            }
            Log.m105924i("MicroMsg.TextStatus.StatusIconHelper", "initTextStatusResItem fail config path not exist " + sb4);
            C117407d.INSTANCE.idkeyStat(1629, 7, 1, false);
        }
    }

    /* renamed from: X */
    public final void mo62330X(String str, int i) {
        String str2 = str;
        C87412m.m108594g(str2, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        String str3 = C112760b.m154225d() + "textstatus/icon";
        if (!C86013q1.m106450k(str3)) {
            C86013q1.m106461v(str3);
        }
        C86013q1.m106445f(str3);
        if (!C86013q1.m106450k(str3)) {
            C86013q1.m106461v(str3);
        }
        int R = C86013q1.m106436R(str2, str3);
        StringBuilder sb = new StringBuilder();
        sb.append("replaceTextStatusResource updateVersion currentVersion:");
        C39704c cVar = f106513c;
        sb.append(cVar != null ? Integer.valueOf(cVar.f106530a) : null);
        sb.append(" updateVersion:");
        sb.append(i);
        sb.append(" unzipRet:");
        sb.append(R);
        Log.m105924i("MicroMsg.TextStatus.StatusIconHelper", sb.toString());
        if (R == 0) {
            C117407d.INSTANCE.idkeyStat(1629, 12, 1, false);
            mo62329W();
            return;
        }
        C117407d.INSTANCE.idkeyStat(1629, 13, 1, false);
    }

    /* renamed from: Y */
    public final void mo62331Y(Map<String, String> map, Map<String, String> map2, String str) {
        C87412m.m108594g(map, "valuesMap");
        C87412m.m108594g(map2, "xmlMap");
        C87412m.m108594g(str, "prefix");
        for (String str2 : f106517g) {
            String safeFormatString = Util.safeFormatString(Util.nullAs(map2.get(str + '.' + str2), ""), "");
            C87412m.m108593f(safeFormatString, "safeFormatString(Util.nu…\"$prefix.${it}\"],\"\"), \"\")");
            map.put(str2, safeFormatString);
        }
    }

    /* renamed from: Z */
    public final void mo62332Z(String str) {
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        Log.m105924i("MicroMsg.TextStatus.StatusIconHelper", "updateTextStatusResource " + str + ' ' + C86013q1.m106451l(str));
        int V = mo62328V(str);
        C39704c cVar = f106513c;
        if ((cVar != null ? cVar.f106530a : -1) < V) {
            C117407d.INSTANCE.idkeyStat(1629, 10, 1, false);
            mo62330X(str, V);
            return;
        }
        C117407d.INSTANCE.idkeyStat(1629, 11, 1, false);
        Log.m105924i("MicroMsg.TextStatus.StatusIconHelper", "updateTextStatusResource no need to updateVersion currentVersion:-1 updateVersion:" + V);
    }

    /* renamed from: a */
    public boolean mo62289a(String str) {
        return false;
    }

    /* renamed from: b */
    public C52679e1 mo62290b() {
        return new C52679e1();
    }

    /* renamed from: c */
    public String mo62291c(C52678e0 e0Var, int i, String str, int i2) {
        C87412m.m108594g(str, "name");
        if (i2 == 1) {
            String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.k0j, new Object[]{Integer.valueOf(i), str});
            C87412m.m108593f(string, "getContext().resources.g…too, sameTopicSize, name)");
            return string;
        } else if (i2 != 2) {
            return "";
        } else {
            String string2 = MMApplicationContext.getContext().getResources().getString(C0966R.string.k0g, new Object[]{Integer.valueOf(i), str});
            C87412m.m108593f(string2, "getContext().resources.g…ame, sameTopicSize, name)");
            return string2;
        }
    }

    /* renamed from: d */
    public C52679e1 mo62292d() {
        return new C52679e1();
    }

    /* renamed from: e */
    public String mo62293e() {
        return null;
    }

    /* renamed from: f */
    public String mo62294f() {
        return "";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<jq3.C9493c> mo62295g() {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            qz2.c r1 = new qz2.c
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 2131837942(0x7f1143f6, float:1.9309093E38)
            java.lang.String r2 = r2.getString(r3)
            r1.<init>(r2)
            r0.add(r1)
            b03.i$c r1 = f106513c
            if (r1 == 0) goto L_0x00ae
            java.util.List<b03.i$a> r1 = r1.f106531b
            java.util.Iterator r1 = r1.iterator()
        L_0x0022:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00ae
            java.lang.Object r2 = r1.next()
            b03.i$a r2 = (b03.C39701i.C39702a) r2
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.util.List<b03.i$b> r4 = r2.f106519b
            java.util.Iterator r4 = r4.iterator()
        L_0x0039:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x004f
            java.lang.Object r5 = r4.next()
            b03.i$b r5 = (b03.C39701i.C39703b) r5
            boolean r6 = r5.mo62334b()
            if (r6 == 0) goto L_0x0039
            r3.add(r5)
            goto L_0x0039
        L_0x004f:
            int r4 = r3.size()
            if (r4 <= 0) goto L_0x0022
            qz2.b r4 = new qz2.b
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getCurrentLanguage(r5)
            java.util.Map<java.lang.String, java.lang.String> r6 = r2.f106520c
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.lang.Object r5 = r6.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L_0x0079
            int r8 = r5.length()
            if (r8 <= 0) goto L_0x0075
            r8 = 1
            goto L_0x0076
        L_0x0075:
            r8 = 0
        L_0x0076:
            if (r8 != r7) goto L_0x0079
            r6 = 1
        L_0x0079:
            if (r6 == 0) goto L_0x007c
            goto L_0x0089
        L_0x007c:
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f106520c
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.String r5 = "en"
            java.lang.Object r2 = r2.get(r5)
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
        L_0x0089:
            r4.<init>(r5)
            r0.add(r4)
            java.util.Iterator r2 = r3.iterator()
        L_0x0093:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0022
            java.lang.Object r3 = r2.next()
            b03.i$b r3 = (b03.C39701i.C39703b) r3
            qz2.d r4 = new qz2.d
            java.lang.String r5 = r3.mo62333a()
            java.lang.String r3 = r3.f106521a
            r4.<init>(r5, r3)
            r0.add(r4)
            goto L_0x0093
        L_0x00ae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b03.C39701i.mo62295g():java.util.ArrayList");
    }

    /* renamed from: h */
    public ArrayList<C9493c> mo62296h() {
        return new ArrayList<>();
    }

    /* renamed from: j */
    public C52676d1 mo62298j(String str) {
        return null;
    }

    /* renamed from: k */
    public ImageSpan mo62299k(View view, String str, C63347a.C47893d dVar, C63347a.C47891b bVar, C63347a.C47892c cVar, int i, C48201c cVar2) {
        C87412m.m108594g(dVar, "iconType");
        C87412m.m108594g(bVar, "iconColor");
        Drawable U = mo62327U(str, dVar, bVar);
        if (U == null) {
            return null;
        }
        U.setBounds(0, 0, i, i);
        return new C39714m(U, 1, cVar2, cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r2 = r2.mo62333a();
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo62300l(java.lang.String r2) {
        /*
            r1 = this;
            java.util.HashMap<java.lang.String, b03.i$b> r0 = f106512b
            java.lang.Object r2 = r0.get(r2)
            b03.i$b r2 = (b03.C39701i.C39703b) r2
            if (r2 == 0) goto L_0x0010
            java.lang.String r2 = r2.mo62333a()
            if (r2 != 0) goto L_0x0012
        L_0x0010:
            java.lang.String r2 = ""
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b03.C39701i.mo62300l(java.lang.String):java.lang.String");
    }

    /* renamed from: m */
    public String mo62301m(C52678e0 e0Var) {
        if (e0Var == null) {
            return "";
        }
        if (!C87412m.m108589b(e0Var.f147088e, "userdefine")) {
            return mo62300l(e0Var.f147088e);
        }
        String str = e0Var.f147092i;
        return str == null ? "" : str;
    }

    /* renamed from: n */
    public long mo62302n() {
        C39704c cVar = f106513c;
        return (long) (cVar != null ? cVar.f106530a : -1);
    }

    /* renamed from: o */
    public C52669b0 mo62303o() {
        return new C52669b0();
    }

    /* renamed from: p */
    public void mo62304p(C52716t0 t0Var) {
        C87412m.m108594g(t0Var, "rsp");
    }

    /* renamed from: q */
    public void mo62305q(C52716t0 t0Var) {
        C87412m.m108594g(t0Var, "rsp");
    }

    /* renamed from: r */
    public void mo62306r(C52716t0 t0Var) {
        C87412m.m108594g(t0Var, "rsp");
    }

    /* renamed from: s */
    public boolean mo62307s(C52716t0 t0Var, C46922e eVar) {
        C87412m.m108594g(t0Var, "rsp");
        return false;
    }

    /* renamed from: t */
    public void mo62308t() {
    }

    /* renamed from: u */
    public boolean mo62309u() {
        return false;
    }

    /* renamed from: v */
    public boolean mo62310v() {
        return false;
    }

    /* renamed from: w */
    public boolean mo62311w() {
        return false;
    }

    /* renamed from: x */
    public boolean mo62312x() {
        return false;
    }

    /* renamed from: y */
    public boolean mo62313y(String str) {
        C39703b bVar;
        return !(str == null || C112551y.m153811k(str)) && (bVar = f106512b.get(str)) != null && bVar.mo62334b();
    }

    /* renamed from: z */
    public boolean mo62314z(C48201c cVar) {
        return true;
    }
}
