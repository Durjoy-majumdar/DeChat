package ul1;

import bd1.C54446b;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import o40.C61926c;
import rl1.C13022d0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import te3.C49882ip2;
import te3.C50266li0;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: ul1.c */
public final class C14205c {

    /* renamed from: j */
    public static final int[] f39661j = {2, 1, 3, 4, 5};

    /* renamed from: k */
    public static final ArrayList<C14206a> f39662k;

    /* renamed from: a */
    public boolean f39663a;

    /* renamed from: b */
    public boolean f39664b;

    /* renamed from: c */
    public LinkedList<C14206a> f39665c = new LinkedList<>();

    /* renamed from: d */
    public LinkedList<C14206a> f39666d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C14206a> f39667e = new LinkedList<>();

    /* renamed from: f */
    public final C13601g f39668f = C36568h.m40985a(C14207b.f39677d);

    /* renamed from: g */
    public int f39669g = 1;

    /* renamed from: h */
    public int f39670h = 0;

    /* renamed from: i */
    public boolean f39671i;

    /* renamed from: ul1.c$a */
    public static final class C14206a {

        /* renamed from: a */
        public String f39672a;

        /* renamed from: b */
        public String f39673b;

        /* renamed from: c */
        public int f39674c;

        /* renamed from: d */
        public boolean f39675d;

        /* renamed from: e */
        public boolean f39676e;

        public C14206a() {
            this((String) null, (String) null, 0, false, false, 31, (C8480h) null);
        }

        public C14206a(String str, String str2, int i, boolean z, boolean z2) {
            C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C87412m.m108594g(str2, "desc");
            this.f39672a = str;
            this.f39673b = str2;
            this.f39674c = i;
            this.f39675d = z;
            this.f39676e = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14206a)) {
                return false;
            }
            C14206a aVar = (C14206a) obj;
            return C87412m.m108589b(this.f39672a, aVar.f39672a) && C87412m.m108589b(this.f39673b, aVar.f39673b) && this.f39674c == aVar.f39674c && this.f39675d == aVar.f39675d && this.f39676e == aVar.f39676e;
        }

        public int hashCode() {
            int hashCode = ((((this.f39672a.hashCode() * 31) + this.f39673b.hashCode()) * 31) + this.f39674c) * 31;
            boolean z = this.f39675d;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f39676e;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        public String toString() {
            return "title:" + this.f39672a + "-:desc:" + this.f39673b + "-type:" + this.f39674c + "-state:" + this.f39675d + "-choose:" + this.f39676e;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C14206a(java.lang.String r4, java.lang.String r5, int r6, boolean r7, boolean r8, int r9, gy3.C8480h r10) {
            /*
                r3 = this;
                r10 = r9 & 1
                java.lang.String r0 = ""
                if (r10 == 0) goto L_0x0008
                r10 = r0
                goto L_0x0009
            L_0x0008:
                r10 = r4
            L_0x0009:
                r4 = r9 & 2
                if (r4 == 0) goto L_0x000e
                goto L_0x000f
            L_0x000e:
                r0 = r5
            L_0x000f:
                r4 = r9 & 4
                r5 = 0
                if (r4 == 0) goto L_0x0016
                r1 = 0
                goto L_0x0017
            L_0x0016:
                r1 = r6
            L_0x0017:
                r4 = r9 & 8
                if (r4 == 0) goto L_0x001d
                r2 = 0
                goto L_0x001e
            L_0x001d:
                r2 = r7
            L_0x001e:
                r4 = r9 & 16
                if (r4 == 0) goto L_0x0024
                r9 = 0
                goto L_0x0025
            L_0x0024:
                r9 = r8
            L_0x0025:
                r4 = r3
                r5 = r10
                r6 = r0
                r7 = r1
                r8 = r2
                r4.<init>(r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ul1.C14205c.C14206a.<init>(java.lang.String, java.lang.String, int, boolean, boolean, int, gy3.h):void");
        }
    }

    /* renamed from: ul1.c$b */
    public static final class C14207b extends C87413o implements C32224a<ArrayList<C14206a>> {

        /* renamed from: d */
        public static final C14207b f39677d = new C14207b();

        public C14207b() {
            super(0);
        }

        public Object invoke() {
            return C14205c.f39662k;
        }
    }

    static {
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.mnd);
        C87412m.m108593f(string, "getContext().resources.g…ottery_claim_prize_type1)");
        String string2 = MMApplicationContext.getContext().getResources().getString(C0966R.string.mna);
        C87412m.m108593f(string2, "getContext().resources.g…ery_claim_prize_subtype1)");
        String string3 = MMApplicationContext.getContext().getResources().getString(C0966R.string.mne);
        C87412m.m108593f(string3, "getContext().resources.g…ottery_claim_prize_type2)");
        String string4 = MMApplicationContext.getContext().getResources().getString(C0966R.string.mnb);
        C87412m.m108593f(string4, "getContext().resources.g…ery_claim_prize_subtype2)");
        String string5 = MMApplicationContext.getContext().getResources().getString(C0966R.string.mnf);
        C87412m.m108593f(string5, "getContext().resources.g…ottery_claim_prize_type3)");
        String string6 = MMApplicationContext.getContext().getResources().getString(C0966R.string.mnc);
        C87412m.m108593f(string6, "getContext().resources.g…ery_claim_prize_subtype3)");
        f39662k = C64197v.m75534c(new C14206a(string, string2, 0, true, true), new C14206a(string3, string4, 1, true, false), new C14206a(string5, string6, 2, true, false));
    }

    public C14205c() {
        C50266li0 li02;
        C49882ip2 ip22;
        C50266li0 li03;
        C49882ip2 ip23;
        Class cls = C54991o.class;
        C45795b bVar = C45795b.f123698n;
        this.f39663a = !C61926c.m72696u(bVar != null ? ((C54991o) bVar.mo71262a(cls)).f154354q : 0, 512);
        C45795b bVar2 = C45795b.f123698n;
        this.f39664b = !C61926c.m72696u(bVar2 != null ? ((C54991o) bVar2.mo71262a(cls)).f154354q : 0, 8);
        C66785b bVar3 = C66785b.f191882e;
        C54446b c = C66783a.C66784a.m78800c(bVar3, false, 1, (Object) null);
        int i = (c == null || (li03 = c.field_liveInfo) == null || (ip23 = li03.f137434h) == null) ? 0 : ip23.f135572e;
        this.f39669g = i == 0 ? 1 : i;
        C54446b c2 = C66783a.C66784a.m78800c(bVar3, false, 1, (Object) null);
        long j = (c2 == null || (li02 = c2.field_liveInfo) == null || (ip22 = li02.f137434h) == null) ? 0 : ip22.f135571d;
        boolean u = C61926c.m72696u((int) j, 1);
        Log.m105924i("FinderLiveLotteryCreateConfig", "setEnableRepeatLottery enableRepeatLottery:" + u);
        this.f39671i = u;
        Log.m105924i("FinderLiveLotteryCreateConfig", "initLiveLotterySetting lotteryType:" + i + ", setting_flag:" + j);
        mo13580c();
        this.f39670h = 0;
        mo13581d(0);
        Log.m105924i("FinderLiveLotteryCreateConfig", "init enableLike:" + this.f39663a + ",enableComment:" + this.f39664b + ",enableRepeatLottery:" + this.f39671i + ",currentLotteryType:" + this.f39669g);
    }

    /* renamed from: a */
    public final C14206a mo13578a() {
        if (this.f39665c.isEmpty()) {
            mo13580c();
        }
        C14206a aVar = null;
        for (C14206a aVar2 : this.f39665c) {
            if (aVar2.f39674c == this.f39669g) {
                aVar = aVar2;
            }
        }
        if (aVar == null && (!this.f39665c.isEmpty())) {
            C14206a aVar3 = this.f39665c.get(0);
            this.f39669g = this.f39665c.get(0).f39674c;
            aVar = aVar3;
        }
        Log.m105924i("FinderLiveLotteryCreateConfig", "getLastLotteryType currentLotteryTypeItem:" + aVar);
        return aVar;
    }

    /* renamed from: b */
    public final int mo13579b() {
        C13598b0 b0Var;
        int i;
        C49882ip2 ip22;
        C45795b.C32059a aVar = C45795b.f123697j;
        C45795b bVar = C45795b.f123698n;
        if (bVar == null || (ip22 = ((C13022d0) bVar.mo71262a(C13022d0.class)).f37103s) == null) {
            b0Var = null;
            i = 0;
        } else {
            i = this.f39671i ? ((int) ip22.f135571d) | 1 : ((int) ip22.f135571d) & -2;
            b0Var = C13598b0.f38549a;
        }
        return b0Var == null ? this.f39671i ? i | 1 : i & -2 : i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ae  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13580c() {
        /*
            r23 = this;
            r0 = r23
            java.util.LinkedList<ul1.c$a> r1 = r0.f39667e
            r1.clear()
            java.util.LinkedList<ul1.c$a> r1 = r0.f39665c
            r1.clear()
            java.util.LinkedList<ul1.c$a> r1 = r0.f39666d
            r1.clear()
            android.content.res.Resources r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            int[] r2 = f39661j
            r4 = 1
            r5 = 0
            r14 = 1
        L_0x001a:
            java.lang.String r6 = "FinderLiveLotteryCreateConfig"
            r7 = 5
            if (r5 >= r7) goto L_0x01a0
            r9 = r2[r5]
            if (r9 == r4) goto L_0x015b
            r8 = 2
            if (r9 == r8) goto L_0x0129
            r8 = 3
            if (r9 == r8) goto L_0x0103
            r8 = 4
            if (r9 == r8) goto L_0x00dc
            if (r9 == r7) goto L_0x0030
            goto L_0x019c
        L_0x0030:
            up1.f r7 = up1.C37521f.f99374d
            r7.getClass()
            pe1.c<java.lang.Integer> r7 = up1.C37521f.f99126A6
            java.lang.Object r7 = r7.mo60266n()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r7 != r4) goto L_0x0045
            r7 = 1
            goto L_0x0046
        L_0x0045:
            r7 = 0
        L_0x0046:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "initLotteryTypeList isFanLotteryEnable: "
            r8.append(r10)
            r8.append(r7)
            r10 = 32
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
            fj1.b$a r6 = fj1.C45795b.f123697j
            fj1.b r6 = fj1.C45795b.f123698n
            if (r6 == 0) goto L_0x00b0
            java.lang.Class<cl1.x> r8 = cl1.C0696x.class
            androidx.lifecycle.i0 r6 = r6.mo71262a(r8)
            cl1.x r6 = (cl1.C0696x) r6
            te3.ly0 r8 = r6.f1644g
            if (r8 == 0) goto L_0x0091
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "isShowFunClub "
            r8.append(r10)
            te3.ly0 r10 = r6.f1644g
            if (r10 != 0) goto L_0x0081
            java.lang.String r10 = ""
        L_0x0081:
            org.json.JSONObject r10 = o40.C61937h.m72709h(r10)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            java.lang.String r10 = "LiveFansClubSlice"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r8)
        L_0x0091:
            te3.ly0 r6 = r6.f1644g
            if (r6 == 0) goto L_0x009b
            boolean r8 = r6.f137710h
            if (r8 != r4) goto L_0x009b
            r8 = 1
            goto L_0x009c
        L_0x009b:
            r8 = 0
        L_0x009c:
            if (r8 == 0) goto L_0x00ab
            if (r6 == 0) goto L_0x00a6
            boolean r6 = r6.f137707e
            if (r6 != r4) goto L_0x00a6
            r6 = 1
            goto L_0x00a7
        L_0x00a6:
            r6 = 0
        L_0x00a7:
            if (r6 == 0) goto L_0x00ab
            r6 = 1
            goto L_0x00ac
        L_0x00ab:
            r6 = 0
        L_0x00ac:
            if (r6 != r4) goto L_0x00b0
            r6 = 1
            goto L_0x00b1
        L_0x00b0:
            r6 = 0
        L_0x00b1:
            if (r6 == 0) goto L_0x019c
            if (r7 == 0) goto L_0x019c
            java.util.LinkedList<ul1.c$a> r6 = r0.f39665c
            ul1.c$a r7 = new ul1.c$a
            r8 = 2131827790(0x7f111c4e, float:1.9288503E38)
            java.lang.String r8 = r1.getString(r8)
            java.lang.String r10 = "res.getString(R.string.f…_chooser_type_fan_member)"
            gy3.C87412m.m108593f(r8, r10)
            r19 = 1
            r20 = 0
            r21 = 16
            r22 = 0
            java.lang.String r17 = ""
            r15 = r7
            r16 = r8
            r18 = r9
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r6.add(r7)
            goto L_0x019c
        L_0x00dc:
            java.util.LinkedList<ul1.c$a> r6 = r0.f39665c
            ul1.c$a r7 = new ul1.c$a
            r8 = 2131827791(0x7f111c4f, float:1.9288505E38)
            java.lang.String r8 = r1.getString(r8)
            java.lang.String r10 = "res.getString(R.string.f…tery_chooser_type_follow)"
            gy3.C87412m.m108593f(r8, r10)
            r19 = 1
            r20 = 0
            r21 = 16
            r22 = 0
            java.lang.String r17 = ""
            r15 = r7
            r16 = r8
            r18 = r9
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r6.add(r7)
            goto L_0x019c
        L_0x0103:
            if (r14 == 0) goto L_0x019c
            java.util.LinkedList<ul1.c$a> r15 = r0.f39665c
            ul1.c$a r13 = new ul1.c$a
            r6 = 2131827793(0x7f111c51, float:1.9288509E38)
            java.lang.String r7 = r1.getString(r6)
            java.lang.String r6 = "res.getString(R.string.f…ser_type_special_comment)"
            gy3.C87412m.m108593f(r7, r6)
            r11 = 0
            r12 = 16
            r16 = 0
            java.lang.String r8 = ""
            r6 = r13
            r10 = r14
            r3 = r13
            r13 = r16
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r15.add(r3)
            goto L_0x019c
        L_0x0129:
            ul1.c$a r3 = new ul1.c$a
            r6 = 2131827792(0x7f111c50, float:1.9288507E38)
            java.lang.String r6 = r1.getString(r6)
            java.lang.String r7 = "res.getString(R.string.f…ottery_chooser_type_like)"
            gy3.C87412m.m108593f(r6, r7)
            boolean r7 = r0.f39663a
            r20 = 0
            r21 = 16
            r22 = 0
            java.lang.String r17 = ""
            r15 = r3
            r16 = r6
            r18 = r9
            r19 = r7
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            boolean r6 = r0.f39663a
            if (r6 == 0) goto L_0x0155
            java.util.LinkedList<ul1.c$a> r6 = r0.f39665c
            r6.add(r3)
            goto L_0x019c
        L_0x0155:
            java.util.LinkedList<ul1.c$a> r6 = r0.f39666d
            r6.add(r3)
            goto L_0x019c
        L_0x015b:
            ul1.c$a r3 = new ul1.c$a
            r6 = 2131827788(0x7f111c4c, float:1.9288499E38)
            java.lang.String r6 = r1.getString(r6)
            java.lang.String r7 = "res.getString(R.string.f…chooser_type_any_comment)"
            gy3.C87412m.m108593f(r6, r7)
            boolean r7 = r0.f39664b
            r20 = 0
            r21 = 16
            r22 = 0
            java.lang.String r17 = ""
            r15 = r3
            r16 = r6
            r18 = r9
            r19 = r7
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            boolean r6 = r0.f39664b
            if (r6 == 0) goto L_0x0188
            java.util.LinkedList<ul1.c$a> r6 = r0.f39665c
            r6.add(r3)
            r14 = 1
            goto L_0x019c
        L_0x0188:
            r6 = 2131827789(0x7f111c4d, float:1.92885E38)
            java.lang.String r6 = r1.getString(r6)
            java.lang.String r7 = "res.getString(R.string.f…ser_type_disable_comment)"
            gy3.C87412m.m108593f(r6, r7)
            r3.f39672a = r6
            java.util.LinkedList<ul1.c$a> r6 = r0.f39666d
            r6.add(r3)
            r14 = 0
        L_0x019c:
            int r5 = r5 + 1
            goto L_0x001a
        L_0x01a0:
            java.util.LinkedList<ul1.c$a> r1 = r0.f39667e
            java.util.LinkedList<ul1.c$a> r2 = r0.f39665c
            r1.addAll(r2)
            java.util.LinkedList<ul1.c$a> r1 = r0.f39667e
            java.util.LinkedList<ul1.c$a> r2 = r0.f39666d
            r1.addAll(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "generateLotteryTypeList lotteryList:"
            r1.append(r2)
            java.util.LinkedList<ul1.c$a> r2 = r0.f39667e
            r1.append(r2)
            java.lang.String r2 = ",enableList:"
            r1.append(r2)
            java.util.LinkedList<ul1.c$a> r2 = r0.f39665c
            int r2 = r2.size()
            r1.append(r2)
            java.lang.String r2 = ",disableList:"
            r1.append(r2)
            java.util.LinkedList<ul1.c$a> r2 = r0.f39666d
            int r2 = r2.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ul1.C14205c.mo13580c():void");
    }

    /* renamed from: d */
    public final void mo13581d(int i) {
        this.f39670h = i;
        for (C14206a aVar : (ArrayList) ((C36570n) this.f39668f).getValue()) {
            aVar.f39676e = aVar.f39674c == i;
        }
    }
}
