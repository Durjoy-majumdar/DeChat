package yn2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.p014mm.mj_template.api.MaasAlbumTemplateSnsFeedInfo;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C82607s;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gy3.C24564k0;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import hi2.C32925e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import o40.C61926c;
import p599lr.C61381b;
import sx3.C36907w;
import te3.C101802kr2;
import te3.C64311db1;
import te3.C64899zy;
import te3.hi4;
import th2.C110992d;
import zt3.C119157j;

/* renamed from: yn2.s0 */
public final class C102882s0 {

    /* renamed from: a */
    public static final C102882s0 f303681a = new C102882s0();

    /* renamed from: b */
    public static final HashMap<String, C102886u0> f303682b = new HashMap<>();

    /* renamed from: c */
    public static final MultiProcessMMKV f303683c;

    /* renamed from: d */
    public static int f303684d;

    /* renamed from: yn2.s0$a */
    public static final class C102883a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C64899zy f303685d;

        public C102883a(C64899zy zyVar) {
            this.f303685d = zyVar;
        }

        public final void run() {
            T t;
            boolean z;
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.SnsFinderPostManager$saveFinderPostData$1");
            LinkedList<hi4> linkedList = this.f303685d.f186899d;
            C87412m.m108593f(linkedList, "compositionInfo.tracks");
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((hi4) t).f183505e == 2) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            hi4 hi4 = (hi4) t;
            if (hi4 == null) {
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.SnsFinderPostManager$saveFinderPostData$1");
                return;
            }
            String d = C32925e.m39859d(C32925e.f89499a, (String) null, (String) null, 3, (Object) null);
            C86013q1.m106442c(hi4.f183504d, d);
            hi4.f183504d = d;
            Log.m105924i("MicroMsg.SnsFinderPostManager", "compositionInfo copy finish");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.SnsFinderPostManager$saveFinderPostData$1");
        }
    }

    /* renamed from: yn2.s0$b */
    public static final class C102884b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f303686d;

        /* renamed from: e */
        public final /* synthetic */ String f303687e;

        public C102884b(String str, String str2) {
            this.f303686d = str;
            this.f303687e = str2;
        }

        public final void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.SnsFinderPostManager$saveFinderPostData$2");
            String d = C32925e.m39859d(C32925e.f89499a, (String) null, (String) null, 3, (Object) null);
            C86013q1.m106442c(this.f303686d, d);
            SnsMethodCalculate.markStartTimeMs("access$getFinderData$p", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
            HashMap<String, C102886u0> hashMap = C102882s0.f303682b;
            SnsMethodCalculate.markEndTimeMs("access$getFinderData$p", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
            C102886u0 u0Var = hashMap.get(this.f303687e);
            if (u0Var != null) {
                SnsMethodCalculate.markStartTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.SnsPostFinderData");
                u0Var.f303691c = d;
                SnsMethodCalculate.markEndTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.SnsPostFinderData");
            }
            Log.m105924i("MicroMsg.SnsFinderPostManager", "video path copy finish");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.SnsFinderPostManager$saveFinderPostData$2");
        }
    }

    static {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("details_finder_entry");
        C87412m.m108593f(mmkv, "getMMKV(MMKV_NAME)");
        f303683c = mmkv;
    }

    /* renamed from: a */
    public final boolean mo142589a(String str) {
        SnsMethodCalculate.markStartTimeMs("appendDetailsShowCount", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        SnsMethodCalculate.markStartTimeMs("getKVKey", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        String str2 = "details_sc_" + str;
        SnsMethodCalculate.markEndTimeMs("getKVKey", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        MultiProcessMMKV multiProcessMMKV = f303683c;
        boolean z = false;
        int i = multiProcessMMKV.getInt(str2, 0);
        if (i >= f303684d) {
            Log.m105924i("MicroMsg.SnsFinderPostManager", "[checkDetailsShowCount] showCount touch limit: showCount = " + i + ", maxCount = " + f303684d);
        } else {
            int i2 = i + 1;
            multiProcessMMKV.putInt(str2, i2);
            Log.m105924i("MicroMsg.SnsFinderPostManager", "[checkDetailsShowCount] showCount inc: showCount = " + i2 + ", maxCount = " + f303684d);
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("appendDetailsShowCount", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        return z;
    }

    /* renamed from: b */
    public final boolean mo142590b(String str) {
        C102886u0 u0Var;
        SnsMethodCalculate.markStartTimeMs("canShowSnsPostEntrance", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        SnsMethodCalculate.markStartTimeMs("getFinderPostData", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        if (str == null) {
            u0Var = null;
            SnsMethodCalculate.markEndTimeMs("getFinderPostData", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        } else {
            u0Var = f303682b.get(str);
            SnsMethodCalculate.markEndTimeMs("getFinderPostData", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        }
        boolean z = false;
        if (u0Var != null) {
            C61381b bVar = (C61381b) C86312j.m106911c(C61381b.class);
            SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.SnsPostFinderData");
            C102887v0 v0Var = u0Var.f303689a;
            SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.SnsPostFinderData");
            if (v0Var == C102887v0.Photo) {
                z = true;
            }
            z = bVar.mo78537Cb(z);
        }
        Log.m105924i("MicroMsg.SnsFinderPostManager", "canShowSnsPostEntrance: result=" + z + ", localSnsId=" + str + ", containData=" + mo142592d(str));
        SnsMethodCalculate.markEndTimeMs("canShowSnsPostEntrance", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        return z;
    }

    /* renamed from: c */
    public final void mo142591c() {
        SnsMethodCalculate.markStartTimeMs("clearCacheData", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        Log.m105924i("MicroMsg.SnsFinderPostManager", "clearCacheData: ");
        f303682b.clear();
        SnsMethodCalculate.markEndTimeMs("clearCacheData", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
    }

    /* renamed from: d */
    public final boolean mo142592d(String str) {
        SnsMethodCalculate.markStartTimeMs("contains", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        boolean containsKey = f303682b.containsKey(str);
        SnsMethodCalculate.markEndTimeMs("contains", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        return containsKey;
    }

    /* renamed from: e */
    public final MaasAlbumTemplateSnsFeedInfo mo142593e(String str, long j, long j2, String str2) {
        String str3 = str2;
        SnsMethodCalculate.markStartTimeMs("getMaasSnsInfo", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        String str4 = str;
        C87412m.m108594g(str, "desc");
        HashMap<String, C102886u0> hashMap = f303682b;
        C101802kr2 kr22 = null;
        if (hashMap.get(str3) == null) {
            SnsMethodCalculate.markEndTimeMs("getMaasSnsInfo", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
            return null;
        }
        C102886u0 u0Var = hashMap.get(str3);
        if (u0Var != null) {
            SnsMethodCalculate.markStartTimeMs(C82607s.NAME, "com.tencent.mm.plugin.sns.SnsPostFinderData");
            kr22 = u0Var.f303692d;
            SnsMethodCalculate.markEndTimeMs(C82607s.NAME, "com.tencent.mm.plugin.sns.SnsPostFinderData");
        }
        C64311db1 db12 = new C64311db1();
        if (kr22 != null) {
            db12.f182661d = kr22.f298647d;
            db12.f182662e = kr22.f298648e;
            db12.f182663f = kr22.f298649f;
            db12.f182664g = kr22.f298650g;
            db12.f182665h = kr22.f298651h;
            db12.f182666i = kr22.f298652i;
            db12.f182667j = kr22.f298653j;
            db12.f182670p = kr22.f298662v;
        }
        SnsMethodCalculate.markStartTimeMs("getVideoSourceScene$default", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        int g = mo142595g(false);
        SnsMethodCalculate.markEndTimeMs("getVideoSourceScene$default", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        MaasAlbumTemplateSnsFeedInfo maasAlbumTemplateSnsFeedInfo = new MaasAlbumTemplateSnsFeedInfo(str, g, C61926c.m72699x(db12), j, j2, ((C61381b) C86312j.m106911c(C61381b.class)).mo78540ER());
        SnsMethodCalculate.markEndTimeMs("getMaasSnsInfo", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        return maasAlbumTemplateSnsFeedInfo;
    }

    /* renamed from: f */
    public final ArrayList<GalleryItem$MediaItem> mo142594f(String str) {
        SnsMethodCalculate.markStartTimeMs("getPhotosDataAsMediaItem", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        ArrayList<GalleryItem$MediaItem> arrayList = null;
        if (str == null) {
            SnsMethodCalculate.markEndTimeMs("getPhotosDataAsMediaItem", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
            return null;
        }
        C102886u0 u0Var = f303682b.get(str);
        if (u0Var != null) {
            SnsMethodCalculate.markStartTimeMs("getPhotos", "com.tencent.mm.plugin.sns.SnsPostFinderData");
            ArrayList<String> arrayList2 = u0Var.f303694f;
            SnsMethodCalculate.markEndTimeMs("getPhotos", "com.tencent.mm.plugin.sns.SnsPostFinderData");
            if (arrayList2 != null) {
                ArrayList arrayList3 = new ArrayList(C36907w.m41090l(arrayList2, 10));
                for (String str2 : arrayList2) {
                    arrayList3.add(GalleryItem$MediaItem.m65488c(1, 0, str2, str2, ""));
                }
                arrayList = new ArrayList<>(arrayList3);
            }
        }
        SnsMethodCalculate.markEndTimeMs("getPhotosDataAsMediaItem", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        return arrayList;
    }

    /* renamed from: g */
    public final int mo142595g(boolean z) {
        SnsMethodCalculate.markStartTimeMs("getVideoSourceScene", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        if (z) {
            SnsMethodCalculate.markEndTimeMs("getVideoSourceScene", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
            return 5;
        }
        Integer num = (Integer) C110992d.f332425a.mo162676j().mo129811b("KEY_MEDIA_SOURCE_INT", -1);
        int i = 2;
        if (num == null || num.intValue() != 1) {
            i = (num != null && num.intValue() == 2) ? 3 : 1;
        }
        SnsMethodCalculate.markEndTimeMs("getVideoSourceScene", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x040b  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x047f A[Catch:{ all -> 0x05ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0583 A[SYNTHETIC, Splitter:B:184:0x0583] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x05ec  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x066a  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x06e6  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x06ed  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo142596h(android.content.Context r52, java.lang.String r53, java.lang.String r54, long r55, long r57, te3.e94 r59, boolean r60) {
        /*
            r51 = this;
            r0 = r51
            r1 = r53
            r2 = r59
            r3 = r60
            java.lang.String r4 = "getVideoStart"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ABAVideoInfo"
            java.lang.Class<lr.b> r6 = p599lr.C61381b.class
            java.lang.String r7 = "postFinderVideo"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.SnsFinderPostManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            java.lang.String r9 = "context"
            r11 = r52
            gy3.C87412m.m108594g(r11, r9)
            java.lang.String r9 = "desc"
            r14 = r54
            gy3.C87412m.m108594g(r14, r9)
            java.util.HashMap<java.lang.String, yn2.u0> r9 = f303682b
            java.lang.Object r9 = r9.get(r1)
            yn2.u0 r9 = (yn2.C102886u0) r9
            r10 = 0
            if (r9 != 0) goto L_0x0033
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return r10
        L_0x0033:
            java.lang.String r12 = "getLocation"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.SnsPostFinderData"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r13)
            te3.kr2 r15 = r9.f303692d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            te3.db1 r12 = new te3.db1
            r12.<init>()
            if (r15 == 0) goto L_0x0066
            float r10 = r15.f298647d
            r12.f182661d = r10
            float r10 = r15.f298648e
            r12.f182662e = r10
            java.lang.String r10 = r15.f298649f
            r12.f182663f = r10
            java.lang.String r10 = r15.f298650g
            r12.f182664g = r10
            java.lang.String r10 = r15.f298651h
            r12.f182665h = r10
            java.lang.String r10 = r15.f298652i
            r12.f182666i = r10
            int r10 = r15.f298653j
            r12.f182667j = r10
            java.lang.String r10 = r15.f298662v
            r12.f182670p = r10
        L_0x0066:
            java.lang.String r10 = "getVideoPath"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r13)
            java.lang.String r15 = r9.f303691c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r13)
            boolean r15 = com.tencent.p014mm.vfs.C86013q1.m106450k(r15)
            java.lang.String r3 = "MicroMsg.SnsFinderPostManager"
            java.lang.String r11 = "getVideoSourceScene"
            r17 = r12
            r12 = 0
            r1 = 1
            if (r15 == 0) goto L_0x00ed
            java.lang.String r4 = "postSnsOriginVideoDirectly"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            di3.d r4 = di3.C86312j.m106911c(r6)
            java.lang.String r5 = "getService(com.tencent.m…atureService::class.java)"
            gy3.C87412m.m108593f(r4, r5)
            lr.b r4 = (p599lr.C61381b) r4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r13)
            java.lang.String r5 = r9.f303691c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r13)
            gy3.C87412m.m108591d(r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r13)
            int r6 = r9.f303693e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r13)
            if (r2 == 0) goto L_0x00d1
            java.lang.String r9 = r2.f182943e
            java.lang.String r10 = "it.templateId"
            gy3.C87412m.m108593f(r9, r10)
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x00b4
            r10 = 1
            goto L_0x00b5
        L_0x00b4:
            r10 = 0
        L_0x00b5:
            if (r10 == 0) goto L_0x00b8
            goto L_0x00b9
        L_0x00b8:
            r2 = r12
        L_0x00b9:
            if (r2 == 0) goto L_0x00d1
            te3.ap1 r9 = new te3.ap1
            r9.<init>()
            java.lang.String r10 = r2.f182943e
            r9.f182115d = r10
            java.lang.String r2 = r2.f182944f
            r9.f182121j = r2
            r9.f182116e = r1
            r2 = 9
            r9.f182119h = r2
            r20 = r9
            goto L_0x00d3
        L_0x00d1:
            r20 = r12
        L_0x00d3:
            android.content.Intent r21 = new android.content.Intent
            r21.<init>()
            r10 = r4
            r11 = r52
            r2 = r17
            r12 = r5
            r13 = r54
            r14 = r6
            r15 = r2
            r16 = r55
            r18 = r57
            r10.mo78554lj(r11, r12, r13, r14, r15, r16, r18, r20, r21)
            r0 = r7
            r2 = 1
            goto L_0x0713
        L_0x00ed:
            r2 = r17
            java.lang.String r10 = "getCompositionInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r13)
            byte[] r15 = r9.f303690b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r13)
            if (r15 == 0) goto L_0x0715
            java.lang.String r15 = "postSnsVideoByComposition"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r13)
            byte[] r15 = r9.f303690b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r13)
            gy3.C87412m.m108591d(r15)
            java.lang.String r10 = "handleMuxVideoParam"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r8)
            hi2.e r1 = hi2.C32925e.f89499a
            r14 = 3
            java.lang.String r1 = hi2.C32925e.m39859d(r1, r12, r12, r14, r12)
            di3.d r14 = di3.C86312j.m106911c(r6)
            lr.b r14 = (p599lr.C61381b) r14
            com.tencent.mm.modelcontrol.VideoTransPara r14 = r14.mo78546Vy()
            te3.zy r12 = new te3.zy
            r12.<init>()
            r12.parseFrom(r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r59 = r2
            java.lang.String r2 = "out path:"
            r15.append(r2)
            r15.append(r1)
            java.lang.String r2 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.graphics.Point r2 = com.tencent.p014mm.p136ui.C85875k4.m106184h(r2)
            int r15 = r2.x
            int r2 = r2.y
            r18 = r9
            java.util.LinkedList<te3.hi4> r9 = r12.f186899d
            r19 = r11
            java.lang.String r11 = "compositionInfo.tracks"
            gy3.C87412m.m108593f(r9, r11)
            java.util.Iterator r9 = r9.iterator()
        L_0x015c:
            boolean r11 = r9.hasNext()
            r20 = r13
            r13 = 2
            if (r11 == 0) goto L_0x017d
            java.lang.Object r11 = r9.next()
            r22 = r9
            r9 = r11
            te3.hi4 r9 = (te3.hi4) r9
            int r9 = r9.f183505e
            if (r9 != r13) goto L_0x0174
            r9 = 1
            goto L_0x0175
        L_0x0174:
            r9 = 0
        L_0x0175:
            if (r9 == 0) goto L_0x0178
            goto L_0x017e
        L_0x0178:
            r13 = r20
            r9 = r22
            goto L_0x015c
        L_0x017d:
            r11 = 0
        L_0x017e:
            te3.hi4 r11 = (te3.hi4) r11
            if (r11 == 0) goto L_0x0185
            java.lang.String r9 = r11.f183504d
            goto L_0x0186
        L_0x0185:
            r9 = 0
        L_0x0186:
            if (r9 != 0) goto L_0x018c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r8)
            goto L_0x0197
        L_0x018c:
            com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker r11 = com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker.f273077a
            rw.m$a r9 = r11.mo129930b(r9)
            if (r9 != 0) goto L_0x019f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r8)
        L_0x0197:
            r23 = r6
            r24 = r7
            r2 = 1
            r12 = 0
            goto L_0x06e4
        L_0x019f:
            int r11 = r9.f180530f
            r13 = 90
            if (r11 == r13) goto L_0x01b0
            r13 = 270(0x10e, float:3.78E-43)
            if (r11 != r13) goto L_0x01aa
            goto L_0x01b0
        L_0x01aa:
            int r11 = r9.f180525a
            float r11 = (float) r11
            int r9 = r9.f180526b
            goto L_0x01b5
        L_0x01b0:
            int r11 = r9.f180526b
            float r11 = (float) r11
            int r9 = r9.f180525a
        L_0x01b5:
            float r9 = (float) r9
            float r11 = r11 / r9
            float r9 = (float) r15
            float r9 = r9 / r11
            float r11 = (float) r2
            float r11 = r11 - r9
            r23 = r6
            r13 = 2
            float r6 = (float) r13
            float r11 = r11 / r6
            float r9 = r9 + r11
            android.graphics.Rect r6 = new android.graphics.Rect
            int r11 = (int) r11
            int r9 = (int) r9
            r13 = 0
            r6.<init>(r13, r11, r15, r9)
            android.util.Size r9 = new android.util.Size
            r9.<init>(r15, r2)
            java.lang.String r2 = "chooseExportConfig"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r8)
            te3.az r11 = new te3.az
            r11.<init>()
            int r13 = r9.getWidth()
            if (r13 == 0) goto L_0x01e4
            int r13 = r9.getHeight()
            if (r13 != 0) goto L_0x01e9
        L_0x01e4:
            java.lang.String r13 = "chooseExportConfig previewSize == 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r13)
        L_0x01e9:
            com.tencent.mm.modelcontrol.VideoTransPara r13 = new com.tencent.mm.modelcontrol.VideoTransPara
            r13.<init>((com.tencent.p014mm.modelcontrol.VideoTransPara) r14)
            int r15 = r13.f267166d
            r24 = r7
            float r7 = (float) r15
            r25 = r10
            int r10 = r9.getHeight()
            float r10 = (float) r10
            r26 = r4
            int r4 = r9.getWidth()
            float r4 = (float) r4
            float r10 = r10 / r4
            float r7 = r7 * r10
            int r4 = (int) r7
            r13.f267166d = r15
            r13.f267167e = r4
            r11.f297896d = r1
            int r1 = r9.getWidth()
            if (r1 == 0) goto L_0x0216
            int r1 = r9.getWidth()
            goto L_0x0218
        L_0x0216:
            int r1 = ih2.C60287a.f171906a
        L_0x0218:
            int r1 = r0.mo142599k(r1)
            r11.f297897e = r1
            int r1 = r9.getHeight()
            if (r1 == 0) goto L_0x0229
            int r1 = r9.getHeight()
            goto L_0x022b
        L_0x0229:
            int r1 = ih2.C60287a.f171907b
        L_0x022b:
            int r1 = r0.mo142599k(r1)
            r11.f297898f = r1
            te3.ep3 r1 = new te3.ep3
            r1.<init>()
            hi2.C98467v.m127917a(r6, r1)
            r11.f297899g = r1
            int r1 = r13.f267166d
            int r1 = r0.mo142599k(r1)
            r11.f297901i = r1
            int r1 = r13.f267166d
            int r4 = r6.height()
            int r1 = r1 * r4
            int r4 = r6.width()
            int r1 = r1 / r4
            int r1 = r0.mo142599k(r1)
            r11.f297902j = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "originWidth:"
            r1.append(r4)
            int r4 = r11.f297901i
            r1.append(r4)
            java.lang.String r4 = " originHeight:"
            r1.append(r4)
            int r4 = r11.f297898f
            r1.append(r4)
            java.lang.String r4 = " targetWidth:"
            r1.append(r4)
            int r4 = r11.f297901i
            r1.append(r4)
            java.lang.String r4 = " targetHeight:"
            r1.append(r4)
            int r4 = r11.f297902j
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            java.lang.String r1 = "videoParamsToOutputConfig"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r8)
            int r4 = r14.f267169g
            r11.f297903n = r4
            int r4 = r14.f267168f
            r11.f297904o = r4
            int r4 = r14.f267172j
            r11.f297905p = r4
            int r4 = r14.f267173n
            r11.f297906q = r4
            int r4 = r14.f267174o
            r11.f297907r = r4
            int r4 = r14.f267175p
            r11.f297908s = r4
            int r4 = r14.f267180u
            r11.f297910u = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "videoBitrate:"
            r4.append(r7)
            int r7 = r14.f267169g
            r4.append(r7)
            java.lang.String r7 = " fps:"
            r4.append(r7)
            int r7 = r14.f267168f
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r8)
            java.util.LinkedList<te3.hi4> r1 = r12.f186899d
            java.lang.String r4 = "composition.tracks"
            gy3.C87412m.m108593f(r1, r4)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x02e1:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x02fc
            java.lang.Object r9 = r1.next()
            r10 = r9
            te3.hi4 r10 = (te3.hi4) r10
            int r10 = r10.f183505e
            r13 = 2
            if (r10 != r13) goto L_0x02f5
            r10 = 1
            goto L_0x02f6
        L_0x02f5:
            r10 = 0
        L_0x02f6:
            if (r10 == 0) goto L_0x02e1
            r7.add(r9)
            goto L_0x02e1
        L_0x02fc:
            int r1 = r7.size()
            java.lang.String r7 = "it.path"
            r9 = 1000(0x3e8, float:1.401E-42)
            r10 = 1
            if (r1 != r10) goto L_0x0376
            java.util.LinkedList<te3.hi4> r1 = r12.f186899d
            gy3.C87412m.m108593f(r1, r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x0311:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L_0x036b
            java.lang.Object r10 = r1.next()
            te3.hi4 r10 = (te3.hi4) r10
            int r13 = r10.f183505e
            r15 = 2
            if (r13 != r15) goto L_0x0324
            r13 = 1
            goto L_0x0325
        L_0x0324:
            r13 = 0
        L_0x0325:
            if (r13 == 0) goto L_0x0311
            com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker r1 = com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker.f273077a
            java.lang.String r10 = r10.f183504d
            java.lang.String r13 = "firstVideoTrack.path"
            gy3.C87412m.m108593f(r10, r13)
            rw.m$a r1 = r1.mo129930b(r10)
            if (r1 == 0) goto L_0x03d7
            int r10 = r1.f180525a
            if (r10 <= 0) goto L_0x03d7
            int r10 = r1.f180526b
            if (r10 <= 0) goto L_0x03d7
            float r10 = r1.f180527c
            r13 = 0
            int r13 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r13 <= 0) goto L_0x03d7
            int r13 = r11.f297906q
            int r15 = r1.f180532h
            if (r13 <= r15) goto L_0x034d
            r11.f297906q = r15
        L_0x034d:
            int r13 = r11.f297907r
            int r15 = r1.f180534j
            if (r13 <= r15) goto L_0x0357
            if (r15 <= r9) goto L_0x0357
            r11.f297907r = r15
        L_0x0357:
            int r13 = r11.f297904o
            int r10 = (int) r10
            int r10 = java.lang.Math.min(r13, r10)
            r11.f297904o = r10
            int r1 = r1.f180533i
            r10 = 2
            int r1 = java.lang.Math.min(r1, r10)
            r11.f297908s = r1
            goto L_0x03d7
        L_0x036b:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r3 = "Collection contains no element matching the predicate."
            r1.<init>(r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r8)
            throw r1
        L_0x0376:
            java.util.LinkedList<te3.hi4> r1 = r12.f186899d
            gy3.C87412m.m108593f(r1, r4)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0384:
            boolean r13 = r1.hasNext()
            if (r13 == 0) goto L_0x03a1
            java.lang.Object r13 = r1.next()
            r15 = r13
            te3.hi4 r15 = (te3.hi4) r15
            int r15 = r15.f183505e
            r9 = 2
            if (r15 != r9) goto L_0x0398
            r9 = 1
            goto L_0x0399
        L_0x0398:
            r9 = 0
        L_0x0399:
            if (r9 == 0) goto L_0x039e
            r10.add(r13)
        L_0x039e:
            r9 = 1000(0x3e8, float:1.401E-42)
            goto L_0x0384
        L_0x03a1:
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L_0x03a8
            goto L_0x03d1
        L_0x03a8:
            java.util.Iterator r1 = r10.iterator()
        L_0x03ac:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x03d1
            java.lang.Object r9 = r1.next()
            te3.hi4 r9 = (te3.hi4) r9
            com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker r10 = com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker.f273077a
            java.lang.String r9 = r9.f183504d
            gy3.C87412m.m108593f(r9, r7)
            rw.m$a r9 = r10.mo129930b(r9)
            if (r9 == 0) goto L_0x03cc
            int r9 = r9.f180533i
            r10 = 1
            if (r9 != r10) goto L_0x03cc
            r9 = 1
            goto L_0x03cd
        L_0x03cc:
            r9 = 0
        L_0x03cd:
            if (r9 == 0) goto L_0x03ac
            r1 = 1
            goto L_0x03d2
        L_0x03d1:
            r1 = 0
        L_0x03d2:
            if (r1 == 0) goto L_0x03d9
            r1 = 1
            r11.f297908s = r1
        L_0x03d7:
            r1 = 2
            goto L_0x03dc
        L_0x03d9:
            r1 = 2
            r11.f297908s = r1
        L_0x03dc:
            int r9 = r11.f297908s
            int r9 = java.lang.Math.min(r9, r1)
            r11.f297908s = r9
            java.lang.String r1 = ", "
            int r9 = r11.f297901i
            int r10 = r11.f297902j
            te3.yy r13 = r12.f186906n
            java.util.LinkedList<te3.ea> r13 = r13.f186611e
            boolean r13 = r13.isEmpty()
            java.lang.String r15 = "getABAResult"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r8)
            java.util.LinkedList<te3.hi4> r0 = r12.f186899d
            gy3.C87412m.m108593f(r0, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0405:
            boolean r28 = r0.hasNext()
            if (r28 == 0) goto L_0x0454
            java.lang.Object r28 = r0.next()
            r29 = r0
            r0 = r28
            te3.hi4 r0 = (te3.hi4) r0
            r44 = r12
            int r12 = r0.f183505e
            r45 = r2
            r2 = 2
            if (r12 != r2) goto L_0x043b
            yn2.b r2 = new yn2.b
            java.lang.String r12 = r0.f183504d
            gy3.C87412m.m108593f(r12, r7)
            r46 = r6
            r28 = r7
            long r6 = r0.f183508h
            r47 = r1
            long r0 = r0.f183509i
            r30 = r2
            r31 = r12
            r32 = r6
            r34 = r0
            r30.<init>(r31, r32, r34)
            goto L_0x0442
        L_0x043b:
            r47 = r1
            r46 = r6
            r28 = r7
            r2 = 0
        L_0x0442:
            if (r2 == 0) goto L_0x0447
            r4.add(r2)
        L_0x0447:
            r7 = r28
            r0 = r29
            r12 = r44
            r2 = r45
            r6 = r46
            r1 = r47
            goto L_0x0405
        L_0x0454:
            r47 = r1
            r45 = r2
            r46 = r6
            r44 = r12
            java.lang.String r0 = "getABAResult$default"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r8)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r6 = r4.isEmpty()     // Catch:{ all -> 0x05ba }
            r7 = 1
            r6 = r6 ^ r7
            if (r6 == 0) goto L_0x0578
            int r6 = r14.f267180u     // Catch:{ all -> 0x05ba }
            if (r6 != r7) goto L_0x0578
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x05ba }
        L_0x0479:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x05ba }
            if (r6 == 0) goto L_0x0578
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x05ba }
            yn2.b r6 = (yn2.C39089b) r6     // Catch:{ all -> 0x05ba }
            int r7 = r14.f267154A     // Catch:{ all -> 0x05ba }
            r12 = 1
            if (r7 != r12) goto L_0x0490
            float r7 = r14.f267182w     // Catch:{ all -> 0x05ba }
            r36 = r7
            r12 = 2
            goto L_0x049a
        L_0x0490:
            r12 = 2
            if (r7 != r12) goto L_0x0498
            float r7 = r14.f267183x     // Catch:{ all -> 0x05ba }
            r36 = r7
            goto L_0x049a
        L_0x0498:
            r36 = 1065353216(0x3f800000, float:1.0)
        L_0x049a:
            r6.getClass()     // Catch:{ all -> 0x05ba }
            java.lang.String r7 = "getPath"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r5)     // Catch:{ all -> 0x05ba }
            java.lang.String r12 = r6.f105220a     // Catch:{ all -> 0x05ba }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r5)     // Catch:{ all -> 0x05ba }
            int r7 = r14.f267168f     // Catch:{ all -> 0x05ba }
            int r2 = r14.f267169g     // Catch:{ all -> 0x05ba }
            r48 = r4
            java.lang.String r4 = "getVideoEnd"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)     // Catch:{ all -> 0x05ba }
            r49 = r0
            r50 = r1
            long r0 = r6.f105222c     // Catch:{ all -> 0x05bc }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)     // Catch:{ all -> 0x05bc }
            r4 = r26
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)     // Catch:{ all -> 0x05bc }
            r32 = r2
            r26 = r3
            long r2 = r6.f105221b     // Catch:{ all -> 0x0575 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)     // Catch:{ all -> 0x0575 }
            long r0 = r0 - r2
            float r0 = (float) r0     // Catch:{ all -> 0x0575 }
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r33 = r0 / r1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)     // Catch:{ all -> 0x0575 }
            long r2 = r6.f105221b     // Catch:{ all -> 0x0575 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)     // Catch:{ all -> 0x0575 }
            float r0 = (float) r2     // Catch:{ all -> 0x0575 }
            float r34 = r0 / r1
            int r0 = r14.f267184y     // Catch:{ all -> 0x0575 }
            int r1 = r14.f267185z     // Catch:{ all -> 0x0575 }
            int r2 = r14.f267154A     // Catch:{ all -> 0x0575 }
            int r3 = r14.f267155B     // Catch:{ all -> 0x0575 }
            int r6 = r14.f267156C     // Catch:{ all -> 0x0575 }
            r35 = 4
            r37 = 0
            r28 = r12
            r29 = r10
            r30 = r9
            r31 = r7
            r38 = r0
            r39 = r1
            r40 = r2
            r41 = r3
            r42 = r6
            r43 = r13
            com.tencent.mm.plugin.sight.base.ABAPrams r0 = com.tencent.p014mm.plugin.sight.base.AdaptiveAdjustBitrate.m119557b(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x0575 }
            int r1 = r14.f267169g     // Catch:{ all -> 0x0575 }
            if (r0 == 0) goto L_0x050d
            int r1 = r0.outputKbps     // Catch:{ all -> 0x0575 }
            r3 = 1000(0x3e8, float:1.401E-42)
            int r1 = r1 * 1000
            r6 = r1
            r1 = 0
            goto L_0x0511
        L_0x050d:
            r3 = 1000(0x3e8, float:1.401E-42)
            r6 = r1
            r1 = -1
        L_0x0511:
            if (r0 == 0) goto L_0x051f
            int r7 = r0.resolutionAdjust     // Catch:{ all -> 0x0575 }
            if (r7 <= 0) goto L_0x051f
            int r1 = r0.outputWidth     // Catch:{ all -> 0x0575 }
            int r7 = r0.outputHeight     // Catch:{ all -> 0x0575 }
            r12 = r7
            r7 = r1
            r1 = 0
            goto L_0x0521
        L_0x051f:
            r7 = r9
            r12 = r10
        L_0x0521:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0575 }
            r3.<init>()     // Catch:{ all -> 0x0575 }
            java.lang.String r2 = "ABA:  finder video bitrate:"
            r3.append(r2)     // Catch:{ all -> 0x0575 }
            r3.append(r6)     // Catch:{ all -> 0x0575 }
            java.lang.String r2 = " width: "
            r3.append(r2)     // Catch:{ all -> 0x0575 }
            r3.append(r7)     // Catch:{ all -> 0x0575 }
            java.lang.String r2 = " height:"
            r3.append(r2)     // Catch:{ all -> 0x0575 }
            r3.append(r12)     // Catch:{ all -> 0x0575 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0575 }
            r3 = r26
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)     // Catch:{ all -> 0x05bc }
            com.tencent.mm.modelcdntran.e0 r2 = hd0.C98398h0.xx0()     // Catch:{ all -> 0x05bc }
            if (r2 == 0) goto L_0x0550
            r2.mo126991o(r0)     // Catch:{ all -> 0x05bc }
        L_0x0550:
            r2 = -1
            if (r1 == r2) goto L_0x056a
            yn2.a r2 = new yn2.a     // Catch:{ all -> 0x05bc }
            r38 = r2
            r39 = r1
            r40 = r7
            r41 = r12
            r42 = r6
            r43 = r0
            r38.<init>(r39, r40, r41, r42, r43)     // Catch:{ all -> 0x05bc }
            r0 = r50
            r0.add(r2)     // Catch:{ all -> 0x05bc }
            goto L_0x056c
        L_0x056a:
            r0 = r50
        L_0x056c:
            r1 = r0
            r26 = r4
            r4 = r48
            r0 = r49
            goto L_0x0479
        L_0x0575:
            r3 = r26
            goto L_0x05bc
        L_0x0578:
            r49 = r0
            r0 = r1
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x05bc }
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x05a5
            int r1 = r14.f267180u     // Catch:{ all -> 0x05bd }
            if (r1 != r2) goto L_0x05a5
            java.lang.String r1 = "sortVideoBitrate"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r8)     // Catch:{ all -> 0x05bd }
            yn2.t0<T> r4 = yn2.C102885t0.f303688d     // Catch:{ all -> 0x05bd }
            sx3.C77813z.m93909o(r0, r4)     // Catch:{ all -> 0x05bd }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r8)     // Catch:{ all -> 0x05bd }
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x05bd }
            java.lang.String r1 = "abaParamList[0]"
            gy3.C87412m.m108593f(r0, r1)     // Catch:{ all -> 0x05bd }
            yn2.a r0 = (yn2.C102873a) r0     // Catch:{ all -> 0x05bd }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r8)     // Catch:{ all -> 0x05bd }
            goto L_0x05d1
        L_0x05a5:
            yn2.a r0 = new yn2.a     // Catch:{ all -> 0x05bd }
            r27 = -1
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r26 = r0
            r26.<init>(r27, r28, r29, r30, r31)     // Catch:{ all -> 0x05bd }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r8)     // Catch:{ all -> 0x05bd }
            goto L_0x05d1
        L_0x05ba:
            r49 = r0
        L_0x05bc:
            r2 = 1
        L_0x05bd:
            yn2.a r0 = new yn2.a
            r33 = -1
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r32 = r0
            r32.<init>(r33, r34, r35, r36, r37)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r8)
        L_0x05d1:
            r1 = r49
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r8)
            java.lang.String r1 = "abaResultToOutputConfig"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r8)
            java.lang.String r4 = "getErrCode"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ABAResult"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            int r6 = r0.f303669a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            if (r6 != 0) goto L_0x066a
            java.lang.String r4 = "getWidth"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            int r6 = r0.f303670b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            if (r6 <= 0) goto L_0x0650
            java.lang.String r6 = "getHeight"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r5)
            int r7 = r0.f303671c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
            if (r7 <= 0) goto L_0x0650
            int r7 = r0.mo142585a()
            if (r7 <= 0) goto L_0x0650
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            int r7 = r0.f303670b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            r11.f297901i = r7
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r5)
            int r4 = r0.f303671c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
            r11.f297902j = r4
            int r4 = r0.mo142585a()
            r11.f297903n = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "video abaResult, width:"
            r4.append(r6)
            int r6 = r11.f297901i
            r4.append(r6)
            java.lang.String r6 = ", height:"
            r4.append(r6)
            int r6 = r11.f297902j
            r4.append(r6)
            r6 = r47
            r4.append(r6)
            int r7 = r11.f297903n
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            goto L_0x0652
        L_0x0650:
            r6 = r47
        L_0x0652:
            java.lang.String r4 = "getAbaParams"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            com.tencent.mm.plugin.sight.base.ABAPrams r0 = r0.f303673e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            if (r0 == 0) goto L_0x066c
            java.util.List r0 = r0.transToList()
            if (r0 == 0) goto L_0x066c
            java.util.LinkedList<java.lang.Integer> r4 = r11.f297909t
            r4.addAll(r0)
            goto L_0x066c
        L_0x066a:
            r6 = r47
        L_0x066c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r8)
            r0 = 1065353216(0x3f800000, float:1.0)
            r11.f297900h = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getExportConfig: origin: "
            r0.append(r1)
            int r1 = r11.f297897e
            r0.append(r1)
            r0.append(r6)
            int r1 = r11.f297898f
            r0.append(r1)
            r0.append(r6)
            te3.ep3 r1 = r11.f297899g
            r0.append(r1)
            java.lang.String r1 = " target: "
            r0.append(r1)
            int r1 = r11.f297901i
            r0.append(r1)
            r0.append(r6)
            int r1 = r11.f297902j
            r0.append(r1)
            java.lang.String r1 = ", audio:"
            r0.append(r1)
            int r1 = r11.f297908s
            r0.append(r1)
            r1 = 44
            r0.append(r1)
            int r4 = r11.f297906q
            r0.append(r4)
            r0.append(r1)
            int r1 = r11.f297907r
            r0.append(r1)
            java.lang.String r1 = ", cropRect:"
            r0.append(r1)
            r1 = r46
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            r0 = r45
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r8)
            r0 = r44
            r0.f186904i = r11
            byte[] r0 = r0.toByteArray()
            r1 = r25
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r8)
            r12 = r0
        L_0x06e4:
            if (r12 != 0) goto L_0x06ed
            r0 = r24
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r8)
            r1 = 0
            return r1
        L_0x06ed:
            r0 = r24
            di3.d r1 = di3.C86312j.m106911c(r23)
            r10 = r1
            lr.b r10 = (p599lr.C61381b) r10
            r1 = r19
            r4 = r20
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r4)
            r9 = r18
            int r15 = r9.f303693e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
            java.lang.String r13 = ""
            r11 = r52
            r14 = r54
            r16 = r59
            r17 = r55
            r19 = r57
            r10.mo78538DI(r11, r12, r13, r14, r15, r16, r17, r19)
        L_0x0713:
            r10 = 1
            goto L_0x0718
        L_0x0715:
            r0 = r7
            r1 = 0
            r10 = 0
        L_0x0718:
            java.util.HashMap<java.lang.String, yn2.u0> r1 = f303682b
            java.util.Map r1 = gy3.C24564k0.m30739c(r1)
            r2 = r53
            r1.remove(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "[postFinderVideo] skipCheck = "
            r1.append(r4)
            r4 = r3
            r3 = r60
            r1.append(r3)
            java.lang.String r5 = ", ret = "
            r1.append(r5)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            if (r3 != 0) goto L_0x074c
            if (r10 == 0) goto L_0x074c
            r1 = r51
            r1.mo142589a(r2)
            goto L_0x074e
        L_0x074c:
            r1 = r51
        L_0x074e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: yn2.C102882s0.mo142596h(android.content.Context, java.lang.String, java.lang.String, long, long, te3.e94, boolean):boolean");
    }

    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* renamed from: i */
    public final boolean mo142597i(Context context, String str, long j, long j2, String str2, boolean z) {
        C101802kr2 kr22;
        String str3 = str2;
        boolean z2 = z;
        SnsMethodCalculate.markStartTimeMs("postSnsPhotos", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "desc");
        HashMap<String, C102886u0> hashMap = f303682b;
        ? r8 = 0;
        if (hashMap.get(str3) == null) {
            SnsMethodCalculate.markEndTimeMs("postSnsPhotos", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
            return false;
        }
        C102886u0 u0Var = hashMap.get(str3);
        if (u0Var != null) {
            SnsMethodCalculate.markStartTimeMs("getPhotos", "com.tencent.mm.plugin.sns.SnsPostFinderData");
            ArrayList<String> arrayList = u0Var.f303694f;
            SnsMethodCalculate.markEndTimeMs("getPhotos", "com.tencent.mm.plugin.sns.SnsPostFinderData");
            if (arrayList != null) {
                C102886u0 u0Var2 = hashMap.get(str3);
                if (u0Var2 != null) {
                    SnsMethodCalculate.markStartTimeMs(C82607s.NAME, "com.tencent.mm.plugin.sns.SnsPostFinderData");
                    kr22 = u0Var2.f303692d;
                    SnsMethodCalculate.markEndTimeMs(C82607s.NAME, "com.tencent.mm.plugin.sns.SnsPostFinderData");
                } else {
                    kr22 = null;
                }
                C64311db1 db12 = new C64311db1();
                if (kr22 != null) {
                    db12.f182661d = kr22.f298647d;
                    db12.f182662e = kr22.f298648e;
                    db12.f182663f = kr22.f298649f;
                    db12.f182664g = kr22.f298650g;
                    db12.f182665h = kr22.f298651h;
                    db12.f182666i = kr22.f298652i;
                    db12.f182667j = kr22.f298653j;
                    db12.f182670p = kr22.f298662v;
                }
                SnsMethodCalculate.markStartTimeMs("getVideoSourceScene$default", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
                int g = mo142595g(false);
                SnsMethodCalculate.markEndTimeMs("getVideoSourceScene$default", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    String str4 = arrayList.get(i);
                    C87412m.m108593f(str4, "imagePathList[i]");
                    String str5 = str4;
                    Object[] objArr = new Object[2];
                    objArr[r8] = str5;
                    Uri n = C116299g2.m163858n(str5);
                    int i2 = size;
                    String path = n.getPath();
                    if (path != null) {
                        String k = C116299g2.m163855k(path, r8, r8);
                        if (!n.getPath().equals(k)) {
                            n = n.buildUpon().path(k).build();
                        }
                    }
                    C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                    objArr[1] = Boolean.valueOf(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b));
                    Log.m105921e("MicroMsg.SnsFinderPostManager", "mediaPath = %s, isExist = %s", objArr);
                    i++;
                    size = i2;
                    r8 = 0;
                }
                ((C61381b) C86312j.m106911c(C61381b.class)).mo78547WG(context, arrayList, str, g, db12, j, j2);
                C24564k0.m30739c(f303682b).remove(str3);
                Log.m105924i("MicroMsg.SnsFinderPostManager", "[postSnsPhotos] skipCheck = " + z2);
                if (!z2) {
                    mo142589a(str3);
                }
                SnsMethodCalculate.markEndTimeMs("postSnsPhotos", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
                return true;
            }
        }
        SnsMethodCalculate.markEndTimeMs("postSnsPhotos", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        return false;
    }

    /* renamed from: j */
    public final void mo142598j() {
        SnsMethodCalculate.markStartTimeMs("pullMaxShowCount", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        f303684d = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_sns_details_show_finder_max_count, 1);
        Log.m105924i("MicroMsg.SnsFinderPostManager", "[pullMaxShowCount] maxShowCount = " + f303684d);
        SnsMethodCalculate.markEndTimeMs("pullMaxShowCount", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
    }

    /* renamed from: k */
    public final int mo142599k(int i) {
        SnsMethodCalculate.markStartTimeMs("resize2Even", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        if (i % 2 != 0) {
            i--;
        }
        SnsMethodCalculate.markEndTimeMs("resize2Even", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        return i;
    }

    /* renamed from: l */
    public final void mo142600l(String str, C101802kr2 kr22, Intent intent, boolean z) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = str;
        C101802kr2 kr23 = kr22;
        Intent intent2 = intent;
        Class cls = C61381b.class;
        SnsMethodCalculate.markStartTimeMs("saveFinderPostData", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        C87412m.m108594g(intent2, "intent");
        if (str6 == null) {
            SnsMethodCalculate.markEndTimeMs("saveFinderPostData", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
            return;
        }
        int g = mo142595g(z);
        String str7 = " videoSource:";
        if (intent2.hasExtra("key_composition_info")) {
            byte[] byteArrayExtra = intent2.getByteArrayExtra("key_composition_info");
            C64899zy zyVar = new C64899zy();
            zyVar.parseFrom(byteArrayExtra);
            int i = g;
            String str8 = "newVideoPostData";
            String str9 = "com.tencent.mm.plugin.sns.SnsPostFinderData$Companion";
            long j = zyVar.f186901f - zyVar.f186900e;
            if (!((C61381b) C86312j.m106911c(cls)).mo78544QE(j)) {
                Log.m105924i("MicroMsg.SnsFinderPostManager", "saveFinderPostData: localSnsId=" + str6 + ", durationMs=" + j + ", video duration is too short, 1");
                f303682b.remove(str6);
                SnsMethodCalculate.markEndTimeMs("saveFinderPostData", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
                return;
            }
            HashMap<String, C102886u0> hashMap = f303682b;
            String str10 = str9;
            String str11 = str8;
            SnsMethodCalculate.markStartTimeMs(str11, str10);
            C64899zy zyVar2 = zyVar;
            str5 = "saveFinderPostData";
            str4 = "com.tencent.mm.plugin.sns.SnsFinderPostManager";
            String str12 = "MicroMsg.SnsFinderPostManager";
            C102886u0 u0Var = new C102886u0(C102887v0.VideoComposition, zyVar.toByteArray(), (String) null, kr22, i, (ArrayList) null, 36, (C8480h) null);
            SnsMethodCalculate.markEndTimeMs(str11, str10);
            hashMap.put(str6, u0Var);
            StringBuilder sb = new StringBuilder();
            sb.append("saveFinderPostData with composition info localSnsId=");
            sb.append(str6);
            sb.append(str7);
            sb.append(i);
            sb.append(" location:");
            sb.append(kr23 != null ? kr23.f298650g : null);
            Log.m105924i(str12, sb.toString());
            ((C119157j) C119157j.f356862d).mo183875f(new C102883a(zyVar2));
        } else {
            str5 = "saveFinderPostData";
            str4 = "com.tencent.mm.plugin.sns.SnsFinderPostManager";
            int i2 = g;
            String str13 = str7;
            String str14 = "MicroMsg.SnsFinderPostManager";
            String str15 = "com.tencent.mm.plugin.sns.SnsPostFinderData$Companion";
            String str16 = "newVideoPostData";
            if (intent2.hasExtra("KSightPath")) {
                String stringExtra = intent2.getStringExtra("KSightPath");
                int i3 = 0;
                boolean booleanExtra = intent2.getBooleanExtra("intent_skip_video_duration_check", false);
                C32925e.m39859d(C32925e.f89499a, (String) null, (String) null, 3, (Object) null);
                C94554a c = C94555d.m119567c(stringExtra, true);
                if (c != null) {
                    i3 = c.f273443a;
                }
                Log.m105924i(str14, "saveFinderPostData: skipCheck = " + booleanExtra);
                if (booleanExtra || ((C61381b) C86312j.m106911c(cls)).mo78544QE((long) i3)) {
                    String str17 = str5;
                    String str18 = str4;
                    if (stringExtra == null) {
                        SnsMethodCalculate.markEndTimeMs(str17, str18);
                        return;
                    }
                    HashMap<String, C102886u0> hashMap2 = f303682b;
                    SnsMethodCalculate.markStartTimeMs(str16, str15);
                    C102886u0 u0Var2 = r1;
                    String str19 = str17;
                    String str20 = str18;
                    String str21 = str14;
                    C102886u0 u0Var3 = new C102886u0(C102887v0.VideoPath, (byte[]) null, stringExtra, kr22, i2, (ArrayList) null, 34, (C8480h) null);
                    SnsMethodCalculate.markEndTimeMs(str16, str15);
                    hashMap2.put(str6, u0Var2);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("saveFinderPostData with video path:");
                    sb4.append(stringExtra);
                    sb4.append(" localSnsId=");
                    sb4.append(str6);
                    sb4.append(str13);
                    sb4.append(i2);
                    sb4.append(" location:");
                    C101802kr2 kr24 = kr22;
                    sb4.append(kr24 != null ? kr24.f298650g : null);
                    Log.m105924i(str21, sb4.toString());
                    ((C119157j) C119157j.f356862d).mo183875f(new C102884b(stringExtra, str6));
                    str2 = str19;
                    str3 = str20;
                    SnsMethodCalculate.markEndTimeMs(str2, str3);
                }
                Log.m105924i(str14, "saveFinderPostData: localSnsId=" + str6 + ", durationMs=" + i3 + ", video duration is too short, 2");
                f303682b.remove(str6);
                SnsMethodCalculate.markEndTimeMs(str5, str4);
                return;
            }
        }
        str2 = str5;
        str3 = str4;
        SnsMethodCalculate.markEndTimeMs(str2, str3);
    }

    /* renamed from: m */
    public final void mo142601m(String str, C101802kr2 kr22, ArrayList<String> arrayList, boolean z) {
        String str2 = str;
        SnsMethodCalculate.markStartTimeMs("saveFinderPostDataOfPhotos", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        C87412m.m108594g(arrayList, "photos");
        if (str2 == null) {
            SnsMethodCalculate.markEndTimeMs("saveFinderPostDataOfPhotos", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
            return;
        }
        HashMap<String, C102886u0> hashMap = f303682b;
        SnsMethodCalculate.markStartTimeMs("newPhotoPostData", "com.tencent.mm.plugin.sns.SnsPostFinderData$Companion");
        C102886u0 u0Var = new C102886u0(C102887v0.Photo, (byte[]) null, (String) null, kr22, 0, arrayList, 22, (C8480h) null);
        SnsMethodCalculate.markEndTimeMs("newPhotoPostData", "com.tencent.mm.plugin.sns.SnsPostFinderData$Companion");
        hashMap.put(str2, u0Var);
        SnsMethodCalculate.markEndTimeMs("saveFinderPostDataOfPhotos", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
    }
}
