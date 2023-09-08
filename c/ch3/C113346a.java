package ch3;

import bh3.C113177k;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import java.util.List;
import org.xwalk.core.XWalkEnvironment;
import rx3.C13598b0;
import sx3.C26236u;
import sx3.C64197v;

/* renamed from: ch3.a */
public final class C113346a {

    /* renamed from: a */
    public static final HashMap<C113177k.C113179b, C113347b> f339121a;

    /* renamed from: b */
    public static final HashMap<String, C113177k.C113179b> f339122b;

    /* renamed from: c */
    public static final HashMap<String, String> f339123c;

    /* renamed from: d */
    public static final HashMap<String, String> f339124d;

    /* renamed from: ch3.a$a */
    public static final class C54729a {

        /* renamed from: a */
        public final int f153374a;

        /* renamed from: b */
        public final int f153375b;

        /* renamed from: c */
        public final boolean f153376c;

        /* renamed from: d */
        public final List<String> f153377d;

        public C54729a(int i, int i2, boolean z, List<String> list, int i3, C8480h hVar) {
            z = (i3 & 4) != 0 ? true : z;
            list = (i3 & 8) != 0 ? null : list;
            this.f153374a = i;
            this.f153375b = i2;
            this.f153376c = z;
            this.f153377d = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C54729a)) {
                return false;
            }
            C54729a aVar = (C54729a) obj;
            return this.f153374a == aVar.f153374a && this.f153375b == aVar.f153375b && this.f153376c == aVar.f153376c && C87412m.m108589b(this.f153377d, aVar.f153377d);
        }

        public int hashCode() {
            int i = ((this.f153374a * 31) + this.f153375b) * 31;
            boolean z = this.f153376c;
            if (z) {
                z = true;
            }
            int i2 = (i + (z ? 1 : 0)) * 31;
            List<String> list = this.f153377d;
            return i2 + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "BusinessConfigItem(descPrefix=" + this.f153374a + ", descSuffix=" + this.f153375b + ", needCheckSwitch=" + this.f153376c + ", noNeedDialogPageList=" + this.f153377d + ')';
        }
    }

    /* renamed from: ch3.a$b */
    public static final class C113347b {

        /* renamed from: a */
        public Integer f339125a;

        /* renamed from: b */
        public Integer f339126b;

        /* renamed from: c */
        public HashMap<C113177k.C113178a, C54729a> f339127c = new HashMap<>();
    }

    static {
        HashMap<C113177k.C113179b, C113347b> hashMap = new HashMap<>();
        f339121a = hashMap;
        C113177k.C113179b bVar = C113177k.C113179b.LOCAION;
        C113347b bVar2 = new C113347b();
        bVar2.f339125a = Integer.valueOf(C0966R.string.f361276lw2);
        bVar2.f339126b = Integer.valueOf(C0966R.raw.icons_outlined_location);
        HashMap<C113177k.C113178a, C54729a> hashMap2 = bVar2.f339127c;
        C113177k.C113178a aVar = C113177k.C113178a.CHATTING;
        hashMap2.put(aVar, new C54729a(C0966R.string.lwb, C0966R.string.f361277lw3, false, C26236u.m33719b(".ui.chatting.ChattingBizView"), 4, (C8480h) null));
        bVar2.f339127c.put(C113177k.C113178a.RADAR, new C54729a(C0966R.string.lwn, C0966R.string.f361277lw3, false, (List) null, 12, (C8480h) null));
        bVar2.f339127c.put(C113177k.C113178a.FACE2FACE_GROUP, new C54729a(C0966R.string.lwd, C0966R.string.f361277lw3, false, (List) null, 12, (C8480h) null));
        HashMap<C113177k.C113178a, C54729a> hashMap3 = bVar2.f339127c;
        C113177k.C113178a aVar2 = C113177k.C113178a.SNS;
        hashMap3.put(aVar2, new C54729a(C0966R.string.lwr, C0966R.string.f361277lw3, false, (List) null, 12, (C8480h) null));
        HashMap<C113177k.C113178a, C54729a> hashMap4 = bVar2.f339127c;
        C113177k.C113178a aVar3 = C113177k.C113178a.FINDER;
        hashMap4.put(aVar3, new C54729a(C0966R.string.lwf, C0966R.string.f361277lw3, false, C26236u.m33719b("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI"), 4, (C8480h) null));
        HashMap<C113177k.C113178a, C54729a> hashMap5 = bVar2.f339127c;
        C113177k.C113178a aVar4 = C113177k.C113178a.LIVE;
        hashMap5.put(aVar4, new C54729a(C0966R.string.lwh, C0966R.string.f361277lw3, false, (List) null, 12, (C8480h) null));
        HashMap<C113177k.C113178a, C54729a> hashMap6 = bVar2.f339127c;
        C113177k.C113178a aVar5 = C113177k.C113178a.SCAN;
        C113177k.C113178a aVar6 = aVar4;
        C54729a aVar7 = r9;
        C54729a aVar8 = new C54729a(C0966R.string.lwo, C0966R.string.f361277lw3, false, (List) null, 12, (C8480h) null);
        hashMap6.put(aVar5, aVar7);
        HashMap<C113177k.C113178a, C54729a> hashMap7 = bVar2.f339127c;
        C113177k.C113178a aVar9 = C113177k.C113178a.SHAKE;
        C113177k.C113178a aVar10 = aVar5;
        C54729a aVar11 = r9;
        C54729a aVar12 = new C54729a(C0966R.string.lwq, C0966R.string.f361277lw3, false, (List) null, 12, (C8480h) null);
        hashMap7.put(aVar9, aVar11);
        HashMap<C113177k.C113178a, C54729a> hashMap8 = bVar2.f339127c;
        C113177k.C113178a aVar13 = C113177k.C113178a.STORY;
        C113177k.C113178a aVar14 = aVar9;
        C54729a aVar15 = r9;
        C54729a aVar16 = new C54729a(C0966R.string.lwt, C0966R.string.f361277lw3, false, (List) null, 12, (C8480h) null);
        hashMap8.put(aVar13, aVar15);
        HashMap<C113177k.C113178a, C54729a> hashMap9 = bVar2.f339127c;
        C113177k.C113178a aVar17 = C113177k.C113178a.SEARCH;
        hashMap9.put(aVar17, new C54729a(C0966R.string.lwp, C0966R.string.f361277lw3, false, (List) null, 12, (C8480h) null));
        HashMap<C113177k.C113178a, C54729a> hashMap10 = bVar2.f339127c;
        C113177k.C113178a aVar18 = C113177k.C113178a.NEARBY;
        C113177k.C113178a aVar19 = aVar17;
        C54729a aVar20 = r9;
        C54729a aVar21 = new C54729a(C0966R.string.lwk, C0966R.string.f361277lw3, false, (List) null, 12, (C8480h) null);
        hashMap10.put(aVar18, aVar20);
        HashMap<C113177k.C113178a, C54729a> hashMap11 = bVar2.f339127c;
        C113177k.C113178a aVar22 = C113177k.C113178a.GAME;
        hashMap11.put(aVar22, new C54729a(C0966R.string.lwg, C0966R.string.f361277lw3, false, (List) null, 12, (C8480h) null));
        HashMap<C113177k.C113178a, C54729a> hashMap12 = bVar2.f339127c;
        C113177k.C113178a aVar23 = C113177k.C113178a.MINE;
        C113177k.C113178a aVar24 = aVar22;
        C54729a aVar25 = r9;
        C54729a aVar26 = new C54729a(C0966R.string.lwi, C0966R.string.f361277lw3, false, (List) null, 12, (C8480h) null);
        hashMap12.put(aVar23, aVar25);
        HashMap<C113177k.C113178a, C54729a> hashMap13 = bVar2.f339127c;
        C113177k.C113178a aVar27 = C113177k.C113178a.STATUS;
        C113177k.C113178a aVar28 = aVar3;
        C54729a aVar29 = r9;
        C54729a aVar30 = new C54729a(C0966R.string.lws, C0966R.string.f361277lw3, false, (List) null, 12, (C8480h) null);
        hashMap13.put(aVar27, aVar29);
        HashMap<C113177k.C113178a, C54729a> hashMap14 = bVar2.f339127c;
        C113177k.C113178a aVar31 = C113177k.C113178a.FAV;
        C113177k.C113178a aVar32 = aVar27;
        C54729a aVar33 = r9;
        C54729a aVar34 = new C54729a(C0966R.string.lwe, C0966R.string.f361277lw3, false, C64197v.m75537f("com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI", "com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorWithoutAffinityUI"), 4, (C8480h) null);
        hashMap14.put(aVar31, aVar33);
        HashMap<C113177k.C113178a, C54729a> hashMap15 = bVar2.f339127c;
        C113177k.C113178a aVar35 = C113177k.C113178a.CARD;
        C113177k.C113178a aVar36 = aVar31;
        C54729a aVar37 = r9;
        C54729a aVar38 = new C54729a(C0966R.string.lwa, C0966R.string.f361277lw3, false, (List) null, 12, (C8480h) null);
        hashMap15.put(aVar35, aVar37);
        bVar2.f339127c.put(C113177k.C113178a.WIFI_INFO, new C54729a(C0966R.string.lwv, C0966R.string.f361277lw3, false, (List) null, 12, (C8480h) null));
        HashMap<C113177k.C113178a, C54729a> hashMap16 = bVar2.f339127c;
        C113177k.C113178a aVar39 = C113177k.C113178a.PAY;
        hashMap16.put(aVar39, new C54729a(C0966R.string.lwm, C0966R.string.f361277lw3, false, (List) null, 8, (C8480h) null));
        HashMap<C113177k.C113178a, C54729a> hashMap17 = bVar2.f339127c;
        C113177k.C113178a aVar40 = C113177k.C113178a.WECHAT_OUT;
        C113177k.C113178a aVar41 = aVar39;
        C54729a aVar42 = r9;
        C54729a aVar43 = new C54729a(C0966R.string.lwu, C0966R.string.f361277lw3, false, (List) null, 12, (C8480h) null);
        hashMap17.put(aVar40, aVar42);
        HashMap<C113177k.C113178a, C54729a> hashMap18 = bVar2.f339127c;
        C113177k.C113178a aVar44 = C113177k.C113178a.APPBRAND;
        C113177k.C113178a aVar45 = aVar2;
        C54729a aVar46 = r9;
        C54729a aVar47 = new C54729a(-1, -1, false, (List) null, 8, (C8480h) null);
        hashMap18.put(aVar44, aVar46);
        HashMap<C113177k.C113178a, C54729a> hashMap19 = bVar2.f339127c;
        C113177k.C113178a aVar48 = C113177k.C113178a.NEARBY_APPBRAND;
        C113177k.C113178a aVar49 = aVar44;
        C54729a aVar50 = r9;
        C54729a aVar51 = new C54729a(C0966R.string.lwj, C0966R.string.f361277lw3, false, (List) null, 12, (C8480h) null);
        hashMap19.put(aVar48, aVar50);
        bVar2.f339127c.put(C113177k.C113178a.OLYMPIC, new C54729a(C0966R.string.lwl, -1, false, (List) null, 12, (C8480h) null));
        C13598b0 b0Var = C13598b0.f38549a;
        hashMap.put(bVar, bVar2);
        C113177k.C113179b bVar3 = C113177k.C113179b.CONTRACT;
        C113347b bVar4 = new C113347b();
        bVar4.f339125a = Integer.valueOf(C0966R.string.f361274lw0);
        bVar4.f339126b = Integer.valueOf(C0966R.raw.icons_outlined_contacts);
        HashMap<C113177k.C113178a, C54729a> hashMap20 = bVar4.f339127c;
        C113177k.C113178a aVar52 = C113177k.C113178a.ADD_CONTACT;
        C113177k.C113179b bVar5 = bVar;
        C54729a aVar53 = r9;
        C54729a aVar54 = new C54729a(C0966R.string.lvu, -1, false, (List) null, 12, (C8480h) null);
        hashMap20.put(aVar52, aVar53);
        bVar4.f339127c.put(aVar23, new C54729a(C0966R.string.lvw, -1, false, (List) null, 12, (C8480h) null));
        bVar4.f339127c.put(aVar40, new C54729a(C0966R.string.lvx, -1, false, (List) null, 12, (C8480h) null));
        C13598b0 b0Var2 = C13598b0.f38549a;
        hashMap.put(bVar3, bVar4);
        C113177k.C113179b bVar6 = C113177k.C113179b.STORAGE;
        C113347b bVar7 = new C113347b();
        bVar7.f339125a = Integer.valueOf(C0966R.string.lw7);
        bVar7.f339126b = Integer.valueOf(C0966R.raw.icons_outlined_folder);
        bVar7.f339127c.put(aVar, new C54729a(C0966R.string.lxh, C0966R.string.lw8, false, (List) null, 12, (C8480h) null));
        HashMap<C113177k.C113178a, C54729a> hashMap21 = bVar7.f339127c;
        C113177k.C113178a aVar55 = C113177k.C113178a.CONTACT_REMARK;
        C113177k.C113179b bVar8 = bVar3;
        C54729a aVar56 = r9;
        C54729a aVar57 = new C54729a(C0966R.string.lxi, C0966R.string.lw8, false, (List) null, 12, (C8480h) null);
        hashMap21.put(aVar55, aVar56);
        C113177k.C113178a aVar58 = aVar45;
        bVar7.f339127c.put(aVar58, new C54729a(C0966R.string.lxv, C0966R.string.lw8, false, (List) null, 12, (C8480h) null));
        C113177k.C113178a aVar59 = aVar28;
        bVar7.f339127c.put(aVar59, new C54729a(C0966R.string.lxm, C0966R.string.lw8, false, (List) null, 12, (C8480h) null));
        C113177k.C113178a aVar60 = aVar6;
        bVar7.f339127c.put(aVar60, new C54729a(C0966R.string.lxo, C0966R.string.lw8, false, (List) null, 12, (C8480h) null));
        C113177k.C113178a aVar61 = aVar10;
        bVar7.f339127c.put(aVar61, new C54729a(C0966R.string.lxt, C0966R.string.lw8, false, (List) null, 12, (C8480h) null));
        C113177k.C113178a aVar62 = aVar14;
        bVar7.f339127c.put(aVar62, new C54729a(C0966R.string.lxu, C0966R.string.lw8, false, (List) null, 12, (C8480h) null));
        bVar7.f339127c.put(aVar23, new C54729a(C0966R.string.lxq, C0966R.string.lw8, false, (List) null, 12, (C8480h) null));
        C113177k.C113178a aVar63 = aVar32;
        bVar7.f339127c.put(aVar63, new C54729a(C0966R.string.lxx, C0966R.string.lw8, false, (List) null, 12, (C8480h) null));
        C113177k.C113178a aVar64 = aVar36;
        bVar7.f339127c.put(aVar64, new C54729a(C0966R.string.lxl, C0966R.string.lw8, false, (List) null, 12, (C8480h) null));
        HashMap<C113177k.C113178a, C54729a> hashMap22 = bVar7.f339127c;
        C113177k.C113178a aVar65 = C113177k.C113178a.MUSICPLAYER;
        C113177k.C113178a aVar66 = aVar40;
        hashMap22.put(aVar65, new C54729a(C0966R.string.lxr, C0966R.string.lw8, false, (List) null, 12, (C8480h) null));
        HashMap<C113177k.C113178a, C54729a> hashMap23 = bVar7.f339127c;
        C113177k.C113178a aVar67 = C113177k.C113178a.EMOJI;
        C113177k.C113178a aVar68 = aVar55;
        hashMap23.put(aVar67, new C54729a(C0966R.string.lxk, C0966R.string.lw8, false, (List) null, 12, (C8480h) null));
        HashMap<C113177k.C113178a, C54729a> hashMap24 = bVar7.f339127c;
        C113177k.C113178a aVar69 = C113177k.C113178a.SPORT;
        C113177k.C113178a aVar70 = aVar67;
        hashMap24.put(aVar69, new C54729a(C0966R.string.lxw, C0966R.string.lw8, false, (List) null, 12, (C8480h) null));
        HashMap<C113177k.C113178a, C54729a> hashMap25 = bVar7.f339127c;
        C113177k.C113178a aVar71 = C113177k.C113178a.MAIL;
        hashMap25.put(aVar71, new C54729a(C0966R.string.lxp, C0966R.string.lw8, false, (List) null, 12, (C8480h) null));
        C113177k.C113178a aVar72 = aVar71;
        bVar7.f339127c.put(C113177k.C113178a.SAVE_FILE, new C54729a(C0966R.string.lxs, C0966R.string.lw8, false, (List) null, 12, (C8480h) null));
        C113177k.C113178a aVar73 = aVar41;
        bVar7.f339127c.put(aVar73, new C54729a(-1, C0966R.string.lw8, false, (List) null, 8, (C8480h) null));
        C113177k.C113178a aVar74 = aVar73;
        C113177k.C113178a aVar75 = aVar24;
        bVar7.f339127c.put(aVar75, new C54729a(C0966R.string.lxn, C0966R.string.lw8, false, (List) null, 12, (C8480h) null));
        C13598b0 b0Var3 = C13598b0.f38549a;
        hashMap.put(bVar6, bVar7);
        C113177k.C113179b bVar9 = C113177k.C113179b.CAMERA;
        C113347b bVar10 = new C113347b();
        bVar10.f339125a = Integer.valueOf(C0966R.string.lvy);
        bVar10.f339126b = Integer.valueOf(C0966R.raw.icons_outlined_camera);
        C113177k.C113179b bVar11 = bVar6;
        bVar10.f339127c.put(aVar, new C54729a(C0966R.string.lve, C0966R.string.lvz, false, (List) null, 12, (C8480h) null));
        bVar10.f339127c.put(aVar58, new C54729a(C0966R.string.lvr, C0966R.string.lvz, false, (List) null, 12, (C8480h) null));
        bVar10.f339127c.put(aVar59, new C54729a(C0966R.string.lvj, C0966R.string.lvz, false, (List) null, 12, (C8480h) null));
        bVar10.f339127c.put(aVar60, new C54729a(C0966R.string.lvk, C0966R.string.lvz, false, (List) null, 12, (C8480h) null));
        bVar10.f339127c.put(aVar61, new C54729a(C0966R.string.lvo, C0966R.string.lvz, false, (List) null, 12, (C8480h) null));
        C113177k.C113178a aVar76 = aVar19;
        bVar10.f339127c.put(aVar76, new C54729a(C0966R.string.lvp, C0966R.string.lvz, false, (List) null, 12, (C8480h) null));
        bVar10.f339127c.put(aVar62, new C54729a(C0966R.string.lvq, C0966R.string.lvz, false, (List) null, 12, (C8480h) null));
        bVar10.f339127c.put(aVar23, new C54729a(C0966R.string.lvm, C0966R.string.lvz, false, (List) null, 12, (C8480h) null));
        bVar10.f339127c.put(aVar63, new C54729a(C0966R.string.lvt, C0966R.string.lvz, false, (List) null, 12, (C8480h) null));
        bVar10.f339127c.put(aVar64, new C54729a(C0966R.string.lvi, C0966R.string.lvz, false, (List) null, 12, (C8480h) null));
        bVar10.f339127c.put(aVar65, new C54729a(C0966R.string.lvn, C0966R.string.lvz, false, (List) null, 12, (C8480h) null));
        C113177k.C113178a aVar77 = aVar70;
        bVar10.f339127c.put(aVar77, new C54729a(C0966R.string.lvh, C0966R.string.lvz, false, (List) null, 12, (C8480h) null));
        C113177k.C113178a aVar78 = aVar77;
        C113177k.C113178a aVar79 = aVar69;
        bVar10.f339127c.put(aVar79, new C54729a(C0966R.string.lvs, C0966R.string.lvz, false, (List) null, 12, (C8480h) null));
        C113177k.C113178a aVar80 = aVar79;
        C113177k.C113178a aVar81 = aVar72;
        bVar10.f339127c.put(aVar81, new C54729a(C0966R.string.lvl, C0966R.string.lvz, false, (List) null, 12, (C8480h) null));
        C113177k.C113178a aVar82 = aVar75;
        bVar10.f339127c.put(aVar49, new C54729a(-1, -1, false, (List) null, 8, (C8480h) null));
        bVar10.f339127c.put(aVar74, new C54729a(-1, C0966R.string.lvz, false, (List) null, 8, (C8480h) null));
        bVar10.f339127c.put(aVar68, new C54729a(C0966R.string.lvf, C0966R.string.lvz, false, (List) null, 12, (C8480h) null));
        C13598b0 b0Var4 = C13598b0.f38549a;
        hashMap.put(bVar9, bVar10);
        C113177k.C113179b bVar12 = C113177k.C113179b.MICRO_PHONE;
        C113347b bVar13 = new C113347b();
        bVar13.f339125a = Integer.valueOf(C0966R.string.lw4);
        bVar13.f339126b = Integer.valueOf(C0966R.raw.icons_outlined_mike);
        bVar13.f339127c.put(aVar, new C54729a(C0966R.string.lww, C0966R.string.lw5, false, (List) null, 12, (C8480h) null));
        bVar13.f339127c.put(aVar58, new C54729a(C0966R.string.lx6, C0966R.string.lw5, false, (List) null, 12, (C8480h) null));
        bVar13.f339127c.put(aVar59, new C54729a(C0966R.string.f361278lx0, C0966R.string.lw5, false, (List) null, 12, (C8480h) null));
        bVar13.f339127c.put(aVar60, new C54729a(C0966R.string.f361279lx1, C0966R.string.lw5, false, (List) null, 12, (C8480h) null));
        bVar13.f339127c.put(aVar76, new C54729a(C0966R.string.lx4, C0966R.string.lw5, false, (List) null, 12, (C8480h) null));
        bVar13.f339127c.put(aVar62, new C54729a(C0966R.string.lx5, C0966R.string.lw5, false, (List) null, 12, (C8480h) null));
        bVar13.f339127c.put(aVar63, new C54729a(C0966R.string.lx7, C0966R.string.lw5, false, (List) null, 12, (C8480h) null));
        bVar13.f339127c.put(aVar64, new C54729a(C0966R.string.lwz, C0966R.string.lw5, false, (List) null, 12, (C8480h) null));
        bVar13.f339127c.put(aVar65, new C54729a(C0966R.string.f361281lx3, C0966R.string.lw5, false, (List) null, 12, (C8480h) null));
        bVar13.f339127c.put(aVar81, new C54729a(C0966R.string.f361280lx2, C0966R.string.lw5, false, (List) null, 12, (C8480h) null));
        bVar13.f339127c.put(C113177k.C113178a.VOICE_PRINT, new C54729a(C0966R.string.lx8, C0966R.string.lw5, false, (List) null, 12, (C8480h) null));
        C113177k.C113178a aVar83 = aVar82;
        bVar13.f339127c.put(aVar83, new C54729a(C0966R.string.lx8, C0966R.string.lw5, false, (List) null, 12, (C8480h) null));
        bVar13.f339127c.put(aVar78, new C54729a(C0966R.string.lwy, C0966R.string.lw5, false, (List) null, 12, (C8480h) null));
        bVar13.f339127c.put(aVar66, new C54729a(C0966R.string.m5w, C0966R.string.lw5, false, (List) null, 12, (C8480h) null));
        C13598b0 b0Var5 = C13598b0.f38549a;
        hashMap.put(bVar12, bVar13);
        C113177k.C113179b bVar14 = C113177k.C113179b.HEALTHY;
        C113347b bVar15 = new C113347b();
        bVar15.f339125a = Integer.valueOf(C0966R.string.f361275lw1);
        bVar15.f339126b = Integer.valueOf(C0966R.raw.icons_outlined_sports);
        bVar15.f339127c.put(aVar80, new C54729a(C0966R.string.lw_, -1, false, (List) null, 12, (C8480h) null));
        C13598b0 b0Var6 = C13598b0.f38549a;
        hashMap.put(bVar14, bVar15);
        C113177k.C113179b bVar16 = C113177k.C113179b.OVERLAY;
        C113347b bVar17 = new C113347b();
        bVar17.f339125a = Integer.valueOf(C0966R.string.lw6);
        bVar17.f339126b = Integer.valueOf(C0966R.raw.icons_outlined_mini_window);
        bVar17.f339127c.put(aVar, new C54729a(C0966R.string.lx9, -1, false, (List) null, 12, (C8480h) null));
        bVar17.f339127c.put(aVar59, new C54729a(C0966R.string.lxd, -1, false, (List) null, 12, (C8480h) null));
        bVar17.f339127c.put(aVar60, new C54729a(C0966R.string.lxf, -1, false, (List) null, 12, (C8480h) null));
        bVar17.f339127c.put(aVar83, new C54729a(C0966R.string.lxe, -1, false, (List) null, 12, (C8480h) null));
        HashMap<C113177k.C113178a, C54729a> hashMap26 = bVar17.f339127c;
        C113177k.C113179b bVar18 = bVar14;
        C54729a aVar84 = r8;
        C54729a aVar85 = new C54729a(C0966R.string.lxg, -1, false, C26236u.m33719b("com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew"), 4, (C8480h) null);
        hashMap26.put(aVar65, aVar84);
        bVar17.f339127c.put(C113177k.C113178a.WEBVIEW, new C54729a(-1, -1, false, (List) null, 8, (C8480h) null));
        bVar17.f339127c.put(aVar64, new C54729a(C0966R.string.lxc, -1, false, (List) null, 8, (C8480h) null));
        C13598b0 b0Var7 = C13598b0.f38549a;
        hashMap.put(bVar16, bVar17);
        C13598b0 b0Var8 = C13598b0.f38549a;
        HashMap<String, C113177k.C113179b> hashMap27 = new HashMap<>();
        C113177k.C113179b bVar19 = bVar5;
        hashMap27.put("android.permission.ACCESS_COARSE_LOCATION", bVar19);
        hashMap27.put("android.permission.ACCESS_FINE_LOCATION", bVar19);
        hashMap27.put("android.permission.ACCESS_COARSE_LOCATION", bVar19);
        C113177k.C113179b bVar20 = bVar8;
        hashMap27.put("android.permission.READ_CONTACTS", bVar20);
        hashMap27.put("android.permission.WRITE_CONTACTS", bVar20);
        C113177k.C113179b bVar21 = bVar11;
        hashMap27.put("android.permission.READ_EXTERNAL_STORAGE", bVar21);
        hashMap27.put("android.permission.WRITE_EXTERNAL_STORAGE", bVar21);
        hashMap27.put("android.permission.CAMERA", bVar9);
        hashMap27.put("android.permission.RECORD_AUDIO", bVar12);
        hashMap27.put("android.permission.ACTIVITY_RECOGNITION", bVar18);
        C13598b0 b0Var9 = C13598b0.f38549a;
        f339122b = hashMap27;
        HashMap<String, String> hashMap28 = new HashMap<>();
        String string = MMApplicationContext.getContext().getString(C0966R.string.lza);
        C87412m.m108593f(string, "getContext().getString(R…ings_permission_location)");
        hashMap28.put(FirebaseAnalytics.C113379b.LOCATION, string);
        String string2 = MMApplicationContext.getContext().getString(C0966R.string.f361319lz2);
        C87412m.m108593f(string2, "getContext().getString(R…ings_permission_contract)");
        hashMap28.put("contact", string2);
        String string3 = MMApplicationContext.getContext().getString(C0966R.string.lzp);
        C87412m.m108593f(string3, "getContext().getString(R…tings_permission_storage)");
        hashMap28.put("storage", string3);
        String string4 = MMApplicationContext.getContext().getString(C0966R.string.lyz);
        C87412m.m108593f(string4, "getContext().getString(R…ttings_permission_camera)");
        hashMap28.put("camera", string4);
        String string5 = MMApplicationContext.getContext().getString(C0966R.string.lzm);
        C87412m.m108593f(string5, "getContext().getString(R…gs_permission_microphone)");
        hashMap28.put("microphone", string5);
        String string6 = MMApplicationContext.getContext().getString(C0966R.string.f361315ly2);
        C87412m.m108593f(string6, "getContext().getString(R…ngs_permission_bluetooth)");
        hashMap28.put("bluetooth", string6);
        String string7 = MMApplicationContext.getContext().getString(C0966R.string.lz6);
        C87412m.m108593f(string7, "getContext().getString(R…tings_permission_healthy)");
        hashMap28.put("healthy", string7);
        String string8 = MMApplicationContext.getContext().getString(C0966R.string.lzn);
        C87412m.m108593f(string8, "getContext().getString(R…tings_permission_overlay)");
        hashMap28.put("overlay", string8);
        C13598b0 b0Var10 = C13598b0.f38549a;
        f339123c = hashMap28;
        HashMap<String, String> hashMap29 = new HashMap<>();
        String string9 = MMApplicationContext.getContext().getString(C0966R.string.ly7);
        C87412m.m108593f(string9, "getContext().getString(R…ission_business_chatting)");
        hashMap29.put("chatting", string9);
        String string10 = MMApplicationContext.getContext().getString(C0966R.string.lym);
        C87412m.m108593f(string10, "getContext()\n           …ermission_business_radar)");
        hashMap29.put("radar", string10);
        String string11 = MMApplicationContext.getContext().getString(C0966R.string.lyb);
        C87412m.m108593f(string11, "getContext()\n           …business_face2face_group)");
        hashMap29.put("face2face_group", string11);
        String string12 = MMApplicationContext.getContext().getString(C0966R.string.lyr);
        C87412m.m108593f(string12, "getContext()\n           …_permission_business_sns)");
        hashMap29.put("sns", string12);
        String string13 = MMApplicationContext.getContext().getString(C0966R.string.lyd);
        C87412m.m108593f(string13, "getContext()\n           …rmission_business_finder)");
        hashMap29.put("finder", string13);
        String string14 = MMApplicationContext.getContext().getString(C0966R.string.lye);
        C87412m.m108593f(string14, "getContext()\n           …ion_business_finder_live)");
        hashMap29.put(WeChatBrands.Business.GROUP_LIVE, string14);
        String string15 = MMApplicationContext.getContext().getString(C0966R.string.lyo);
        C87412m.m108593f(string15, "getContext()\n           …permission_business_scan)");
        hashMap29.put("scan", string15);
        String string16 = MMApplicationContext.getContext().getString(C0966R.string.lyq);
        C87412m.m108593f(string16, "getContext()\n           …ermission_business_shake)");
        hashMap29.put("shake", string16);
        String string17 = MMApplicationContext.getContext().getString(C0966R.string.lyu);
        C87412m.m108593f(string17, "getContext()\n           …ermission_business_story)");
        hashMap29.put("story", string17);
        String string18 = MMApplicationContext.getContext().getString(C0966R.string.lyp);
        C87412m.m108593f(string18, "getContext()\n           …rmission_business_search)");
        hashMap29.put("search", string18);
        String string19 = MMApplicationContext.getContext().getString(C0966R.string.lyj);
        C87412m.m108593f(string19, "getContext()\n           …rmission_business_nearby)");
        hashMap29.put("nearby", string19);
        String string20 = MMApplicationContext.getContext().getString(C0966R.string.lyf);
        C87412m.m108593f(string20, "getContext()\n           …permission_business_game)");
        hashMap29.put("game", string20);
        String string21 = MMApplicationContext.getContext().getString(C0966R.string.ly4);
        C87412m.m108593f(string21, "getContext()\n           …ission_business_appbrand)");
        hashMap29.put("nearby_appbrand", string21);
        String string22 = MMApplicationContext.getContext().getString(C0966R.string.lyh);
        C87412m.m108593f(string22, "getContext()\n           …permission_business_mine)");
        hashMap29.put("mine", string22);
        String string23 = MMApplicationContext.getContext().getString(C0966R.string.lyt);
        C87412m.m108593f(string23, "getContext()\n           …rmission_business_status)");
        hashMap29.put("status", string23);
        String string24 = MMApplicationContext.getContext().getString(C0966R.string.lyc);
        C87412m.m108593f(string24, "getContext()\n           …_permission_business_fav)");
        hashMap29.put("fav", string24);
        String string25 = MMApplicationContext.getContext().getString(C0966R.string.ly6);
        C87412m.m108593f(string25, "getContext()\n           …permission_business_card)");
        hashMap29.put("card", string25);
        String string26 = MMApplicationContext.getContext().getString(C0966R.string.lyi);
        C87412m.m108593f(string26, "getContext()\n           …ion_business_musicplayer)");
        hashMap29.put("musicplayer", string26);
        String string27 = MMApplicationContext.getContext().getString(C0966R.string.lyk);
        C87412m.m108593f(string27, "getContext()\n           …ssion_business_net_check)");
        hashMap29.put("net_check", string27);
        String string28 = MMApplicationContext.getContext().getString(C0966R.string.lyy);
        C87412m.m108593f(string28, "getContext()\n           …ssion_business_wifi_info)");
        hashMap29.put("wifi_info", string28);
        String string29 = MMApplicationContext.getContext().getString(C0966R.string.ly8);
        C87412m.m108593f(string29, "getContext()\n           …mission_business_contact)");
        hashMap29.put("contact", string29);
        String string30 = MMApplicationContext.getContext().getString(C0966R.string.lya);
        C87412m.m108593f(string30, "getContext()\n           …ermission_business_emoji)");
        hashMap29.put("emoji", string30);
        String string31 = MMApplicationContext.getContext().getString(C0966R.string.lys);
        C87412m.m108593f(string31, "getContext()\n           …ermission_business_sport)");
        hashMap29.put("sport", string31);
        String string32 = MMApplicationContext.getContext().getString(C0966R.string.lyg);
        C87412m.m108593f(string32, "getContext()\n           …permission_business_mail)");
        hashMap29.put("mail", string32);
        String string33 = MMApplicationContext.getContext().getString(C0966R.string.lyv);
        C87412m.m108593f(string33, "getContext()\n           …sion_business_voiceprint)");
        hashMap29.put("voiceprint", string33);
        String string34 = MMApplicationContext.getContext().getString(C0966R.string.f361316ly3);
        C87412m.m108593f(string34, "getContext()\n           …ion_business_add_contact)");
        hashMap29.put("add_contact", string34);
        String string35 = MMApplicationContext.getContext().getString(C0966R.string.ly9);
        C87412m.m108593f(string35, "getContext()\n           …_business_contact_remark)");
        hashMap29.put("contact_remark", string35);
        String string36 = MMApplicationContext.getContext().getString(C0966R.string.lyx);
        C87412m.m108593f(string36, "getContext()\n           …ssion_business_wechatout)");
        hashMap29.put("wechatout", string36);
        String string37 = MMApplicationContext.getContext().getString(C0966R.string.lyn);
        C87412m.m108593f(string37, "getContext()\n           …ission_business_savefile)");
        hashMap29.put("savefile", string37);
        String string38 = MMApplicationContext.getContext().getString(C0966R.string.lyw);
        C87412m.m108593f(string38, "getContext()\n           …mission_business_webview)");
        hashMap29.put("webview", string38);
        String string39 = MMApplicationContext.getContext().getString(C0966R.string.lyl);
        C87412m.m108593f(string39, "getContext()\n           …_permission_business_pay)");
        hashMap29.put(WeChatBrands.Business.GROUP_PAY, string39);
        String string40 = MMApplicationContext.getContext().getString(C0966R.string.ly5);
        C87412m.m108593f(string40, "getContext()\n           …business_appbrand_outher)");
        hashMap29.put(XWalkEnvironment.MODULE_APPBRAND, string40);
        C13598b0 b0Var11 = C13598b0.f38549a;
        f339124d = hashMap29;
    }
}
