package os3;

import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.p014mm.protocal.protobuf.FinderTipsShowEntranceExtInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.LinkedList;
import pe3.C89349b;
import ps3.C12005b;
import te3.C49170dn1;
import te3.C49448fn1;
import te3.C50705on1;
import te3.C51978xi1;
import te3.C64586nn1;
import te3.C64858yi1;

/* renamed from: os3.a */
public final class C62180a {

    /* renamed from: a */
    public static final C62180a f176786a = new C62180a();

    /* renamed from: b */
    public static C62181a f176787b;

    /* renamed from: os3.a$b */
    public enum C35301b {
        FIND_NEARBY_INDEPENDENT_LIVE_ROOM,
        FIND_NEARBY_INDEPENDENT_LIVE_SQUARE,
        FIND_NEARBY_LIVE_ROOM,
        FIND_NEARBY_LIVE_SQUARE
    }

    /* renamed from: os3.a$a */
    public static final class C62181a {

        /* renamed from: a */
        public long f176788a;

        /* renamed from: b */
        public String f176789b;

        /* renamed from: c */
        public String f176790c;

        /* renamed from: d */
        public String f176791d;

        /* renamed from: e */
        public String f176792e;

        /* renamed from: f */
        public String f176793f;

        /* renamed from: g */
        public String f176794g;

        public C62181a() {
            this(0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (C8480h) null);
        }

        public C62181a(long j, String str, String str2, String str3, String str4, String str5, String str6, int i, C8480h hVar) {
            j = (i & 1) != 0 ? 0 : j;
            str = (i & 2) != 0 ? "" : str;
            str2 = (i & 4) != 0 ? "" : str2;
            str3 = (i & 8) != 0 ? "" : str3;
            str4 = (i & 16) != 0 ? "" : str4;
            str5 = (i & 32) != 0 ? "" : str5;
            str6 = (i & 64) != 0 ? "" : str6;
            this.f176788a = j;
            this.f176789b = str;
            this.f176790c = str2;
            this.f176791d = str3;
            this.f176792e = str4;
            this.f176793f = str5;
            this.f176794g = str6;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C62181a)) {
                return false;
            }
            C62181a aVar = (C62181a) obj;
            return this.f176788a == aVar.f176788a && C87412m.m108589b(this.f176789b, aVar.f176789b) && C87412m.m108589b(this.f176790c, aVar.f176790c) && C87412m.m108589b(this.f176791d, aVar.f176791d) && C87412m.m108589b(this.f176792e, aVar.f176792e) && C87412m.m108589b(this.f176793f, aVar.f176793f) && C87412m.m108589b(this.f176794g, aVar.f176794g);
        }

        public int hashCode() {
            long j = this.f176788a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            String str = this.f176789b;
            int i2 = 0;
            int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f176790c;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f176791d;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f176792e;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f176793f;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f176794g;
            if (str6 != null) {
                i2 = str6.hashCode();
            }
            return hashCode5 + i2;
        }

        public String toString() {
            return "feedObjectId: " + this.f176788a + "  redIconUrl: " + this.f176789b + " jumpTabId: " + this.f176790c + " nonceId: " + this.f176791d + " userName: " + this.f176792e + " finderNickName: " + this.f176793f + " coverUrl: " + this.f176794g;
        }
    }

    /* renamed from: a */
    public final void mo87236a(C51978xi1 xi12, boolean z) {
        C64858yi1 c = mo87238c();
        c.f186563x = 1;
        c.f186559t = z ? 1 : 0;
        xi12.f144671f = new C89349b(c.toByteArray());
        LinkedList<C64586nn1> linkedList = new LinkedList<>();
        C64586nn1 d = mo87239d();
        d.f184507i = "NearbyEntrance";
        linkedList.add(d);
        C64586nn1 e = mo87240e();
        e.f184507i = "NearbyLiveTab";
        e.f184508j = "NearbyEntrance";
        linkedList.add(e);
        xi12.f144672g = linkedList;
    }

    /* renamed from: b */
    public final void mo87237b(C51978xi1 xi12, boolean z) {
        C64858yi1 c = mo87238c();
        c.f186563x = 0;
        c.f186559t = z ? 1 : 0;
        xi12.f144671f = new C89349b(c.toByteArray());
        LinkedList<C64586nn1> linkedList = new LinkedList<>();
        C64586nn1 d = mo87239d();
        d.f184507i = "FinderLiveEntrance";
        linkedList.add(d);
        C64586nn1 e = mo87240e();
        e.f184508j = "FinderLiveEntrance";
        e.f184507i = "NearbyLiveTab";
        linkedList.add(e);
        xi12.f144672g = linkedList;
    }

    /* renamed from: c */
    public final C64858yi1 mo87238c() {
        C64858yi1 yi12 = new C64858yi1();
        yi12.f186558s = mo87242g();
        C62181a aVar = f176787b;
        if (aVar != null) {
            yi12.f186549g = aVar.f176788a;
            yi12.f186555p = 12;
            if (aVar != null) {
                yi12.f186554o = aVar.f176791d;
                if (aVar != null) {
                    yi12.f186560u = aVar.f176792e;
                    if (aVar != null) {
                        yi12.f186561v = aVar.f176793f;
                        if (aVar != null) {
                            yi12.f186562w = aVar.f176794g;
                            return yi12;
                        }
                        C87412m.m108603p("currentRedDotData");
                        throw null;
                    }
                    C87412m.m108603p("currentRedDotData");
                    throw null;
                }
                C87412m.m108603p("currentRedDotData");
                throw null;
            }
            C87412m.m108603p("currentRedDotData");
            throw null;
        }
        C87412m.m108603p("currentRedDotData");
        throw null;
    }

    /* renamed from: d */
    public final C64586nn1 mo87239d() {
        C64586nn1 nn12 = new C64586nn1();
        nn12.f184506h = 1;
        C62181a aVar = f176787b;
        if (aVar != null) {
            nn12.f184505g = aVar.f176789b;
            nn12.f184504f = "直播中";
            nn12.f184509n = 1;
            nn12.f184502d = 16;
            FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo = new FinderTipsShowEntranceExtInfo();
            C62181a aVar2 = f176787b;
            if (aVar2 != null) {
                finderTipsShowEntranceExtInfo.object_id = aVar2.f176788a;
                finderTipsShowEntranceExtInfo.tab_type = 12;
                nn12.f184510o = new C89349b(finderTipsShowEntranceExtInfo.toByteArray());
                return nn12;
            }
            C87412m.m108603p("currentRedDotData");
            throw null;
        }
        C87412m.m108603p("currentRedDotData");
        throw null;
    }

    /* renamed from: e */
    public final C64586nn1 mo87240e() {
        C64586nn1 nn12 = new C64586nn1();
        nn12.f184506h = 1;
        nn12.f184509n = 2;
        nn12.f184510o = new C89349b(new C50705on1().toByteArray());
        nn12.f184513r = f176786a.mo87242g();
        nn12.f184502d = 15;
        return nn12;
    }

    /* renamed from: f */
    public final void mo87241f(C35301b bVar) {
        C87412m.m108594g(bVar, "redDotType");
        if (f176787b != null) {
            C51978xi1 xi12 = new C51978xi1();
            xi12.f144669d = 400000;
            xi12.f144674i = 0;
            xi12.f144670e = 16;
            xi12.f144673h = APMidasPayAPI.ENV_TEST;
            C49170dn1 dn12 = new C49170dn1();
            LinkedList<C49448fn1> linkedList = new LinkedList<>();
            C49448fn1 fn12 = new C49448fn1();
            fn12.f133597d = xi12;
            linkedList.add(fn12);
            dn12.f132433d = linkedList;
            int ordinal = bVar.ordinal();
            if (ordinal == 0) {
                mo87237b(xi12, true);
            } else if (ordinal == 1) {
                mo87237b(xi12, false);
            } else if (ordinal == 2) {
                mo87236a(xi12, true);
            } else if (ordinal == 3) {
                mo87236a(xi12, false);
            }
            ((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0().mo77250V5(dn12, "nearbyRedDotGenerateTest");
            ((C12005b) C86312j.m106911c(C12005b.class)).mo11143NJ();
        }
    }

    /* renamed from: g */
    public final int mo87242g() {
        try {
            C62181a aVar = f176787b;
            if (aVar != null) {
                return Integer.parseInt(aVar.f176790c);
            }
            C87412m.m108603p("currentRedDotData");
            throw null;
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("saveCurrentTestRedDot NumberFormatException jumpTabId: ");
            C62181a aVar2 = f176787b;
            if (aVar2 != null) {
                sb.append(aVar2.f176790c);
                Log.m105924i("NearbyRedDotGenerate", sb.toString());
                return 0;
            }
            C87412m.m108603p("currentRedDotData");
            throw null;
        }
    }
}
