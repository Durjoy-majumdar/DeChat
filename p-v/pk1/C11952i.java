package pk1;

import cj1.C0639y1;
import cl1.C54991o;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ig1.C8916d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import ky3.C88334c;
import nk1.C61788m;
import o40.C61926c;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C110823p;
import sx3.C36907w;
import sx3.C64197v;
import te3.C49765hx0;
import te3.C50037ju0;
import te3.C52013xs0;

/* renamed from: pk1.i */
public final class C11952i {

    /* renamed from: a */
    public static final C11952i f34888a = new C11952i();

    /* renamed from: b */
    public static final C11973o[] f34889b;

    /* renamed from: c */
    public static final HashMap<C11973o, C11954b> f34890c;

    /* renamed from: d */
    public static final HashMap<C11973o, C11955c> f34891d = new HashMap<>();

    /* renamed from: pk1.i$a */
    public static final class C11953a implements C11955c {

        /* renamed from: a */
        public final /* synthetic */ Map.Entry<C11973o, C11954b> f34892a;

        public C11953a(Map.Entry<? extends C11973o, C11954b> entry) {
            this.f34892a = entry;
        }

        /* renamed from: a */
        public C11957d mo11820a(int i) {
            C11957d dVar = new C11957d(i);
            String str = this.f34892a.getValue().f34894b;
            C87412m.m108594g(str, "_nickName");
            dVar.f34899e = str;
            C11973o key = this.f34892a.getKey();
            C87412m.m108594g(key, "<set-?>");
            dVar.f34896b = key;
            return dVar;
        }
    }

    /* renamed from: pk1.i$b */
    public static final class C11954b {

        /* renamed from: a */
        public final String f34893a;

        /* renamed from: b */
        public final String f34894b;

        public C11954b(String str, String str2) {
            C87412m.m108594g(str, "giftId");
            C87412m.m108594g(str2, "name");
            this.f34893a = str;
            this.f34894b = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11954b)) {
                return false;
            }
            C11954b bVar = (C11954b) obj;
            return C87412m.m108589b(this.f34893a, bVar.f34893a) && C87412m.m108589b(this.f34894b, bVar.f34894b);
        }

        public int hashCode() {
            return (this.f34893a.hashCode() * 31) + this.f34894b.hashCode();
        }

        public String toString() {
            return "GiftInfo(giftId=" + this.f34893a + ", name=" + this.f34894b + ')';
        }
    }

    /* renamed from: pk1.i$c */
    public interface C11955c {

        /* renamed from: pk1.i$c$a */
        public static final class C11956a {
            /* renamed from: a */
            public static /* synthetic */ C11957d m11660a(C11955c cVar, int i, int i2, Object obj) {
                if (obj == null) {
                    if ((i2 & 1) != 0) {
                        i = 1;
                    }
                    return cVar.mo11820a(i);
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
            }
        }

        /* renamed from: a */
        C11957d mo11820a(int i);
    }

    /* renamed from: pk1.i$d */
    public static final class C11957d {

        /* renamed from: a */
        public int f34895a;

        /* renamed from: b */
        public C11973o f34896b;

        /* renamed from: c */
        public String f34897c;

        /* renamed from: d */
        public long f34898d;

        /* renamed from: e */
        public String f34899e;

        /* renamed from: f */
        public boolean f34900f;

        /* renamed from: g */
        public String f34901g;

        /* renamed from: h */
        public String f34902h;

        public C11957d() {
            this(1);
        }

        /* renamed from: a */
        public final C61788m.C11208b mo11824a() {
            String str;
            C50037ju0 ju02 = new C50037ju0();
            C61788m.C11209c cVar = C61788m.C11209c.NORMAL_GIFT_SOLO;
            String str2 = null;
            if (Util.isNullOrNil(this.f34897c)) {
                StringBuilder sb = new StringBuilder();
                C11954b bVar = C11952i.f34890c.get(this.f34896b);
                sb.append(bVar != null ? bVar.f34894b : null);
                sb.append('_');
                sb.append(UUID.randomUUID());
                str = sb.toString();
            } else {
                str = this.f34897c;
            }
            C52013xs0 xs02 = new C52013xs0();
            C49765hx0 hx02 = new C49765hx0();
            xs02.f144914s = hx02;
            hx02.f134919d = new FinderContact();
            C49765hx0 hx03 = xs02.f144914s;
            FinderContact finderContact = hx03 != null ? hx03.f134919d : null;
            if (finderContact != null) {
                String str3 = this.f34899e;
                if (str3 == null) {
                    str3 = "测试" + C88334c.f255322d.mo122717f();
                }
                finderContact.nickname = str3;
            }
            C49765hx0 hx04 = xs02.f144914s;
            if (hx04 != null) {
                C45795b bVar2 = C45795b.f123698n;
                hx04.f134930r = bVar2 != null ? ((C54991o) bVar2.mo71262a(C54991o.class)).f154320h : null;
            }
            xs02.f144904f = this.f34902h;
            HashMap<C11973o, C11954b> hashMap = C11952i.f34890c;
            C11954b bVar3 = hashMap.get(this.f34896b);
            ju02.f136329d = bVar3 != null ? bVar3.f34893a : null;
            C61788m.C11208b bVar4 = new C61788m.C11208b(xs02);
            bVar4.f33041e = cVar;
            bVar4.f33043g = ju02;
            bVar4.f33044h = str;
            boolean z = false;
            bVar4.f33045i = 0;
            bVar4.f33046j = this.f34895a;
            bVar4.f33047n = C110823p.m151009y(C11952i.f34889b, this.f34896b);
            bVar4.f33049p = this.f34900f;
            C11954b bVar5 = hashMap.get(this.f34896b);
            if (bVar5 != null) {
                str2 = bVar5.f34893a;
            }
            bVar4.f33050q = str2;
            String str4 = this.f34901g;
            C87412m.m108594g(str4, "<set-?>");
            bVar4.f33051r = str4;
            if (!Util.isNullOrNil(str) && (bVar4.f33045i > 1 || bVar4.f33046j > 1)) {
                z = true;
            }
            if (this.f34900f) {
                cVar = bVar4.f33047n ? z ? C61788m.C11209c.SELF_PRECIOUS_GIFT_COMBO : C61788m.C11209c.SELF_PRECIOUS_GIFT_SOLO : z ? C61788m.C11209c.SELF_NORMAL_GIFT_COMBO : C61788m.C11209c.SELF_NORMAL_GIFT_SOLO;
            } else if (bVar4.f33047n) {
                cVar = z ? C61788m.C11209c.PRECIOUS_GIFT_COMBO : C61788m.C11209c.PRECIOUS_GIFT_SOLO;
            } else if (z) {
                cVar = C61788m.C11209c.NORMAL_GIFT_COMBO;
            }
            bVar4.f33041e = cVar;
            return bVar4;
        }

        /* renamed from: b */
        public final C11957d mo11825b(String str) {
            if (str == null) {
                str = "";
            }
            this.f34902h = str;
            return this;
        }

        /* renamed from: c */
        public final C11957d mo11826c(String str) {
            if (str == null) {
                str = "";
            }
            this.f34901g = str;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("giftName = ");
            C0639y1 y1Var = C0639y1.f1510a;
            Map<String, C8916d> map = C0639y1.f1513d;
            C11952i iVar = C11952i.f34888a;
            HashMap<C11973o, C11954b> hashMap = C11952i.f34890c;
            C11954b bVar = hashMap.get(this.f34896b);
            String str = null;
            C8916d dVar = map.get(bVar != null ? bVar.f34893a : null);
            sb4.append(dVar != null ? dVar.field_name : null);
            sb.append(sb4.toString());
            sb.append(", ");
            sb.append("comboId = " + this.f34897c);
            sb.append(", ");
            sb.append("count = " + this.f34895a);
            sb.append(", ");
            sb.append("executeInMainThread = false");
            sb.append(", ");
            sb.append("nickname = " + this.f34899e + " ,");
            sb.append("isSelfSend = " + this.f34900f + " ,");
            StringBuilder sb5 = new StringBuilder();
            sb5.append("giftLocalName = ");
            C11954b bVar2 = hashMap.get(this.f34896b);
            if (bVar2 != null) {
                str = bVar2.f34894b;
            }
            sb5.append(str);
            sb5.append(", ");
            sb.append(sb5.toString());
            sb.append("executeDelayMs = " + this.f34898d);
            sb.append(", ");
            sb.append("targetUserName = " + this.f34901g);
            sb.append("\n");
            String sb6 = sb.toString();
            C87412m.m108593f(sb6, "StringBuilder()\n        …              .toString()");
            return sb6;
        }

        public C11957d(int i) {
            this.f34895a = i;
            this.f34896b = C11973o.LOVE;
            this.f34897c = "";
            this.f34901g = "";
            this.f34902h = "";
        }
    }

    /* renamed from: pk1.i$e */
    public static final class C11958e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ List<C61788m.C11208b> f34903d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11958e(List<C61788m.C11208b> list) {
            super(0);
            this.f34903d = list;
        }

        public Object invoke() {
            C61788m mVar;
            Class cls = C54991o.class;
            StringBuilder sb = new StringBuilder();
            sb.append("executeBatchMockCommand thread ");
            C45795b bVar = C45795b.f123698n;
            sb.append(bVar != null ? ((C54991o) bVar.mo71262a(cls)).f154316g : null);
            Log.m105924i("Finder.FinderLiveGiftMockUtil", sb.toString());
            C45795b bVar2 = C45795b.f123698n;
            if (!(bVar2 == null || (mVar = ((C54991o) bVar2.mo71262a(cls)).f154316g) == null)) {
                mVar.addAll(this.f34903d);
            }
            return C13598b0.f38549a;
        }
    }

    static {
        C11973o oVar = C11973o.OX;
        C11973o oVar2 = C11973o.ROCKET;
        C11973o oVar3 = C11973o.STAR;
        C11973o oVar4 = C11973o.ISLAND;
        C11973o oVar5 = C11973o.HEYTEA;
        C11973o oVar6 = C11973o.HUGHUG;
        C11973o oVar7 = C11973o.BALLOON;
        f34889b = new C11973o[]{oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7};
        HashMap<C11973o, C11954b> hashMap = new HashMap<>();
        hashMap.put(C11973o.LOVE, new C11954b("MMFinderLiveGift100001", "test_爱心"));
        hashMap.put(C11973o.CHEERS, new C11954b("MMFinderLiveGift100002", "test_干杯"));
        hashMap.put(C11973o.BARBECUE, new C11954b("MMFinderLiveGift100003", "test_撸串"));
        hashMap.put(oVar5, new C11954b("MMFinderLiveGift100004", "test_奶茶"));
        hashMap.put(oVar, new C11954b("MMFinderLiveGift100013_special", "test_牛气冲天"));
        hashMap.put(oVar2, new C11954b("MMFinderLiveGift100006", "test_火箭"));
        hashMap.put(oVar3, new C11954b("MMFinderLiveGift100014_special", "test_摘星星"));
        hashMap.put(oVar4, new C11954b("MMFinderLiveGift100007", "test_桃花岛"));
        hashMap.put(oVar6, new C11954b("MMFinderLiveGift100015", "test_抱抱"));
        hashMap.put(oVar7, new C11954b("MMFinderLiveGift100016", "test_告白气球"));
        f34890c = hashMap;
        for (Map.Entry next : hashMap.entrySet()) {
            f34891d.put(next.getKey(), new C11953a(next));
        }
    }

    /* renamed from: a */
    public final void mo11819a(List<C11957d> list, boolean z) {
        C87412m.m108594g(list, "commandList");
        Log.m105924i("Finder.FinderLiveGiftMockUtil", "executeBatchMockCommand: " + list);
        int i = 0;
        if (z) {
            ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
            for (C11957d a : list) {
                arrayList.add(a.mo11824a());
            }
            List B0 = C110818d0.m150900B0(arrayList);
            C11957d dVar = list.get(0);
            dVar.getClass();
            C61926c.m72663H("FinderLiveGiftMockUtil" + (C88334c.f255322d.mo122717f() % 4), false, new C11958e(B0), dVar.f34898d, 2, (Object) null);
            return;
        }
        for (T next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C11957d dVar2 = (C11957d) next;
                dVar2.getClass();
                C61926c.m72663H("FinderLiveGiftMockUtil" + (i % 4), false, new C11959j(dVar2), dVar2.f34898d, 2, (Object) null);
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }
}
