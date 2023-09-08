package gq3;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import android.util.Pair;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54208j0;
import androidx.lifecycle.C54219z;
import androidx.lifecycle.LiveData;
import bp3.C54527k;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.QueryImageData;
import com.tencent.p014mm.autogen.mmdata.rpt.IntelligentMsgActionLogStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.xweb.WCWebUpdater;
import eb0.C7626l4;
import fq3.C59270b;
import fy3.C32227p;
import gy3.C87412m;
import ig3.C60281c;
import ig3.C60282d;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import p157gk.C32466a;
import p157gk.C32467x;
import p157gk.C59477b;
import p157gk.C59480d;
import p157gk.C59481e;
import p157gk.C59491j;
import p157gk.C59503r;
import p175j0.C108504h;
import p175j0.C60667k2;
import p863r0.C63352a;
import rx3.C13598b0;
import rx3.C13603j;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C13801s0;
import sx3.C36907w;
import sx3.C64197v;
import sx3.C90364q0;
import ux3.C65486b;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: gq3.h */
public final class C59629h extends C39622i0 {

    /* renamed from: E */
    public static final List<String> f170395E = C64197v.m75537f(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, "27", "28", "152", "153", "156", "157", "159", "160");

    /* renamed from: A */
    public C59477b f170396A;

    /* renamed from: B */
    public boolean f170397B;

    /* renamed from: C */
    public boolean f170398C;

    /* renamed from: D */
    public boolean f170399D;

    /* renamed from: d */
    public final C54219z<ArrayList<C32467x>> f170400d = new C54219z<>();

    /* renamed from: e */
    public final C54219z<C59270b> f170401e = new C54219z<>(C59270b.ALL);

    /* renamed from: f */
    public final C54219z<C59648q> f170402f;

    /* renamed from: g */
    public final LiveData<C59648q> f170403g;

    /* renamed from: h */
    public final C54219z<String> f170404h;

    /* renamed from: i */
    public final C54219z<ArrayList<C59480d>> f170405i;

    /* renamed from: j */
    public final C54219z<Integer> f170406j;

    /* renamed from: n */
    public final C54219z<ArrayList<C32466a>> f170407n;

    /* renamed from: o */
    public final C54219z<C59649r> f170408o;

    /* renamed from: p */
    public final C54219z<String> f170409p;

    /* renamed from: q */
    public final ArrayList<QueryImageData> f170410q;

    /* renamed from: r */
    public final ArrayList<QueryImageData> f170411r;

    /* renamed from: s */
    public final ArrayList<QueryImageData> f170412s;

    /* renamed from: t */
    public final ArrayList<C32466a> f170413t;

    /* renamed from: u */
    public Map<String, ArrayList<QueryImageData>> f170414u;

    /* renamed from: v */
    public final ArrayList<String> f170415v;

    /* renamed from: w */
    public C53973z1 f170416w;

    /* renamed from: x */
    public C53973z1 f170417x;

    /* renamed from: y */
    public boolean f170418y;

    /* renamed from: z */
    public C53973z1 f170419z;

    /* renamed from: gq3.h$a */
    public /* synthetic */ class C59630a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f170420a;

        static {
            int[] iArr = new int[C59270b.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            f170420a = iArr;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.view.page.ImageQueryViewModel$confirmToSearch$2", mo125469f = "ImageQueryViewModel.kt", mo125470l = {160}, mo125471m = "invokeSuspend")
    /* renamed from: gq3.h$b */
    public static final class C59631b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f170421d;

        /* renamed from: e */
        public final /* synthetic */ String f170422e;

        /* renamed from: f */
        public final /* synthetic */ C59629h f170423f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59631b(String str, C59629h hVar, C15601d<? super C59631b> dVar) {
            super(2, dVar);
            this.f170422e = str;
            this.f170423f = hVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C59631b(this.f170422e, this.f170423f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C59631b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f170421d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.f170422e;
                this.f170421d = 1;
                obj = C53895h.m60469g(C53872d1.f151119c, new C7626l4(str, (C15601d<? super C7626l4>) null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Log.m105924i("MicroMsg.ImageQueryViewModel", "RelatedWordDataStore >> thread: " + Thread.currentThread().getName() + ", res: " + booleanValue);
            if (booleanValue) {
                this.f170423f.f170402f.setValue(C59648q.STOP);
                Log.m105924i("MicroMsg.ImageQueryReportProvider", "reportSearchIfDone >> " + 0 + ", " + C59491j.f169996a + ", " + 0);
                if (!C59491j.f169996a) {
                    C60282d dVar = C60282d.f171857a;
                    C60282d.f171864h = 0;
                    dVar.mo85267d(0);
                    dVar.mo85266c(57);
                }
            } else {
                C59629h hVar = this.f170423f;
                List<String> list = C59629h.f170395E;
                hVar.mo84638d3();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gq3.h$c */
    public static final class C59632c<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Integer.valueOf(((ArrayList) ((C13604l) t2).f38556e).size()), Integer.valueOf(((ArrayList) ((C13604l) t).f38556e).size()));
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.view.page.ImageQueryViewModel", mo125469f = "ImageQueryViewModel.kt", mo125470l = {449, 464}, mo125471m = "spiltDataList")
    /* renamed from: gq3.h$d */
    public static final class C59633d extends C66704d {

        /* renamed from: d */
        public Object f170424d;

        /* renamed from: e */
        public Object f170425e;

        /* renamed from: f */
        public Object f170426f;

        /* renamed from: g */
        public Object f170427g;

        /* renamed from: h */
        public Object f170428h;

        /* renamed from: i */
        public Object f170429i;

        /* renamed from: j */
        public int f170430j;

        /* renamed from: n */
        public int f170431n;

        /* renamed from: o */
        public /* synthetic */ Object f170432o;

        /* renamed from: p */
        public final /* synthetic */ C59629h f170433p;

        /* renamed from: q */
        public int f170434q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59633d(C59629h hVar, C15601d<? super C59633d> dVar) {
            super(dVar);
            this.f170433p = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f170432o = obj;
            this.f170434q |= Integer.MIN_VALUE;
            C59629h hVar = this.f170433p;
            List<String> list = C59629h.f170395E;
            return hVar.mo84634G3((ArrayList<QueryImageData>) null, this);
        }
    }

    public C59629h() {
        C54219z<C59648q> zVar = new C54219z<>(C59648q.NO_START);
        this.f170402f = zVar;
        this.f170403g = zVar;
        this.f170404h = new C54219z<>("");
        this.f170405i = new C54219z<>(new ArrayList());
        this.f170406j = new C54219z<>(0);
        this.f170407n = new C54219z<>();
        this.f170408o = new C54219z<>(C59649r.NORMAL);
        this.f170409p = new C54219z<>();
        this.f170410q = new ArrayList<>();
        this.f170411r = new ArrayList<>();
        this.f170412s = new ArrayList<>();
        this.f170413t = new ArrayList<>();
        this.f170414u = new LinkedHashMap();
        this.f170415v = new ArrayList<>();
        this.f170396A = C59477b.NEW;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m69504c3(gq3.C59629h r4, java.util.ArrayList r5, wx3.C15601d r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof gq3.C59647p
            if (r0 == 0) goto L_0x0016
            r0 = r6
            gq3.p r0 = (gq3.C59647p) r0
            int r1 = r0.f170458g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f170458g = r1
            goto L_0x001b
        L_0x0016:
            gq3.p r0 = new gq3.p
            r0.<init>(r4, r6)
        L_0x001b:
            java.lang.Object r6 = r0.f170456e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f170458g
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r4 = r0.f170455d
            gq3.h r4 = (gq3.C59629h) r4
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0070
        L_0x002e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = "updateNormalData >> "
            r6.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r6.append(r2)
            r2 = 32
            r6.append(r2)
            int r2 = r5.size()
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r2 = "MicroMsg.ImageQueryViewModel"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
            r0.f170455d = r4
            r0.f170458g = r3
            java.lang.Object r6 = r4.mo84634G3(r5, r0)
            if (r6 != r1) goto L_0x0070
            goto L_0x00e2
        L_0x0070:
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            androidx.lifecycle.z<fq3.b> r5 = r4.f170401e
            java.lang.Object r5 = r5.getValue()
            fq3.b r5 = (fq3.C59270b) r5
            if (r5 != 0) goto L_0x007e
            r5 = -1
            goto L_0x0086
        L_0x007e:
            int[] r0 = gq3.C59629h.C59630a.f170420a
            int r5 = r5.ordinal()
            r5 = r0[r5]
        L_0x0086:
            java.lang.String r0 = "result[1]"
            if (r5 == r3) goto L_0x00ad
            r1 = 2
            if (r5 == r1) goto L_0x00a0
            r2 = 3
            if (r5 == r2) goto L_0x0091
            goto L_0x00bc
        L_0x0091:
            java.lang.Object r5 = r6.get(r1)
            java.lang.String r1 = "result[2]"
            gy3.C87412m.m108593f(r5, r1)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r4.mo84635I3(r5)
            goto L_0x00bc
        L_0x00a0:
            java.lang.Object r5 = r6.get(r3)
            gy3.C87412m.m108593f(r5, r0)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r4.mo84635I3(r5)
            goto L_0x00bc
        L_0x00ad:
            r5 = 0
            java.lang.Object r5 = r6.get(r5)
            java.lang.String r1 = "result[0]"
            gy3.C87412m.m108593f(r5, r1)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r4.mo84635I3(r5)
        L_0x00bc:
            androidx.lifecycle.z<gq3.r> r5 = r4.f170408o
            java.lang.Object r5 = r5.getValue()
            gq3.r r5 = (gq3.C59649r) r5
            if (r5 == 0) goto L_0x00cb
            java.lang.String r5 = r5.name()
            goto L_0x00cc
        L_0x00cb:
            r5 = 0
        L_0x00cc:
            java.lang.String r1 = "PERSON"
            boolean r5 = gy3.C87412m.m108589b(r5, r1)
            if (r5 == 0) goto L_0x00e0
            java.lang.Object r5 = r6.get(r3)
            gy3.C87412m.m108593f(r5, r0)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r4.mo84640f3(r5)
        L_0x00e0:
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x00e2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gq3.C59629h.m69504c3(gq3.h, java.util.ArrayList, wx3.d):java.lang.Object");
    }

    /* renamed from: F3 */
    public final boolean mo84633F3(String str) {
        C87412m.m108594g(str, "imagePath");
        for (QueryImageData queryImageData : this.f170412s) {
            if (C87412m.m108589b(queryImageData.f154725f, str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: G3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo84634G3(java.util.ArrayList<com.tencent.p014mm.api.QueryImageData> r31, wx3.C15601d<? super java.util.ArrayList<java.util.ArrayList<com.tencent.p014mm.api.QueryImageData>>> r32) {
        /*
            r30 = this;
            r0 = r32
            boolean r1 = r0 instanceof gq3.C59629h.C59633d
            if (r1 == 0) goto L_0x0017
            r1 = r0
            gq3.h$d r1 = (gq3.C59629h.C59633d) r1
            int r2 = r1.f170434q
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f170434q = r2
            r2 = r30
            goto L_0x001e
        L_0x0017:
            gq3.h$d r1 = new gq3.h$d
            r2 = r30
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.f170432o
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r1.f170434q
            r5 = 0
            r6 = 2
            r7 = 0
            r8 = 1
            if (r4 == 0) goto L_0x0084
            if (r4 == r8) goto L_0x005c
            if (r4 != r6) goto L_0x0054
            int r4 = r1.f170431n
            int r9 = r1.f170430j
            java.lang.Object r10 = r1.f170429i
            com.tencent.mm.api.QueryImageData r10 = (com.tencent.p014mm.api.QueryImageData) r10
            java.lang.Object r11 = r1.f170428h
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r12 = r1.f170427g
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.lang.Object r13 = r1.f170426f
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Object r14 = r1.f170425e
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            java.lang.Object r15 = r1.f170424d
            gq3.h r15 = (gq3.C59629h) r15
            kotlin.ResultKt.throwOnFailure(r0)
            r8 = r5
            r5 = r11
            r11 = r10
            r10 = r9
        L_0x0051:
            r9 = r12
            goto L_0x019f
        L_0x0054:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x005c:
            int r4 = r1.f170431n
            int r9 = r1.f170430j
            java.lang.Object r10 = r1.f170429i
            com.tencent.mm.api.QueryImageData r10 = (com.tencent.p014mm.api.QueryImageData) r10
            java.lang.Object r11 = r1.f170428h
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r12 = r1.f170427g
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.lang.Object r13 = r1.f170426f
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Object r14 = r1.f170425e
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            java.lang.Object r15 = r1.f170424d
            gq3.h r15 = (gq3.C59629h) r15
            kotlin.ResultKt.throwOnFailure(r0)
            r29 = r9
            r9 = r4
            r4 = r13
            r13 = r11
            r11 = r10
            r10 = r29
            goto L_0x00d9
        L_0x0084:
            kotlin.ResultKt.throwOnFailure(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r31.iterator()
            r11 = r2
        L_0x009b:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x01d5
            java.lang.Object r12 = r10.next()
            com.tencent.mm.api.QueryImageData r12 = (com.tencent.p014mm.api.QueryImageData) r12
            java.lang.String r13 = r12.f154725f
            java.lang.String r14 = "it.midImagePath"
            gy3.C87412m.m108593f(r13, r14)
            r1.f170424d = r11
            r1.f170425e = r0
            r1.f170426f = r4
            r1.f170427g = r9
            r1.f170428h = r10
            r1.f170429i = r12
            r1.f170430j = r7
            r1.f170431n = r7
            r1.f170434q = r8
            r11.getClass()
            a14.h0 r14 = a14.C53872d1.f151119c
            gq3.m r15 = new gq3.m
            r15.<init>(r13, r5)
            java.lang.Object r13 = a14.C53895h.m60469g(r14, r15, r1)
            if (r13 != r3) goto L_0x00d1
            return r3
        L_0x00d1:
            r14 = r0
            r15 = r11
            r11 = r12
            r0 = r13
            r12 = r9
            r13 = r10
            r9 = 0
            r10 = 0
        L_0x00d9:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01ce
            java.lang.String r0 = r11.f154727h
            java.lang.String r7 = "it.labelId"
            gy3.C87412m.m108593f(r0, r7)
            java.util.ArrayList<java.lang.String> r7 = r15.f170415v
            boolean r7 = r7.isEmpty()
            java.lang.String r22 = "#"
            if (r7 == 0) goto L_0x00f4
        L_0x00f2:
            r0 = 0
            goto L_0x012f
        L_0x00f4:
            java.lang.String[] r17 = new java.lang.String[]{r22}
            r18 = 0
            r19 = 0
            r20 = 6
            r21 = 0
            r16 = r0
            java.util.List r0 = z04.C112550d0.m153785U(r16, r17, r18, r19, r20, r21)
            java.util.Iterator r0 = r0.iterator()
        L_0x010a:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x00f2
            java.lang.Object r7 = r0.next()
            java.lang.String r7 = (java.lang.String) r7
            int r16 = r7.length()
            if (r16 <= 0) goto L_0x011f
            r16 = 1
            goto L_0x0121
        L_0x011f:
            r16 = 0
        L_0x0121:
            if (r16 == 0) goto L_0x010a
            java.util.ArrayList<java.lang.String> r5 = r15.f170415v
            boolean r5 = r5.contains(r7)
            if (r5 == 0) goto L_0x012d
            r0 = 1
            goto L_0x012f
        L_0x012d:
            r5 = 0
            goto L_0x010a
        L_0x012f:
            if (r0 == 0) goto L_0x016a
            java.util.ArrayList<com.tencent.mm.api.QueryImageData> r0 = r15.f170411r
            boolean r0 = r15.mo84648o3(r0, r11)
            if (r0 == 0) goto L_0x013b
            r9 = 1
            goto L_0x016a
        L_0x013b:
            r4.add(r11)
            java.util.ArrayList<com.tencent.mm.api.QueryImageData> r0 = r15.f170411r
            r0.add(r11)
            boolean r0 = r15.f170397B
            if (r0 != 0) goto L_0x0169
            java.lang.String r0 = r11.f154728i
            java.lang.String r5 = "it.cropLabelId"
            gy3.C87412m.m108593f(r0, r5)
            java.lang.String[] r24 = new java.lang.String[]{r22}
            r25 = 0
            r26 = 0
            r27 = 6
            r28 = 0
            r23 = r0
            java.util.List r0 = z04.C112550d0.m153785U(r23, r24, r25, r26, r27, r28)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x0169
            r15.f170397B = r8
        L_0x0169:
            r10 = 1
        L_0x016a:
            java.lang.String r0 = r11.f154729j
            java.lang.String r5 = "it.ocrResult"
            gy3.C87412m.m108593f(r0, r5)
            androidx.lifecycle.z<java.lang.String> r5 = r15.f170404h
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            r1.f170424d = r15
            r1.f170425e = r14
            r1.f170426f = r4
            r1.f170427g = r12
            r1.f170428h = r13
            r1.f170429i = r11
            r1.f170430j = r10
            r1.f170431n = r9
            r1.f170434q = r6
            a14.h0 r7 = a14.C53872d1.f151117a
            gq3.n r6 = new gq3.n
            r8 = 0
            r6.<init>(r5, r0, r8)
            java.lang.Object r0 = a14.C53895h.m60469g(r7, r6, r1)
            if (r0 != r3) goto L_0x019a
            return r3
        L_0x019a:
            r5 = r13
            r13 = r4
            r4 = r9
            goto L_0x0051
        L_0x019f:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01ba
            java.util.ArrayList<com.tencent.mm.api.QueryImageData> r0 = r15.f170412s
            boolean r0 = r15.mo84648o3(r0, r11)
            if (r0 == 0) goto L_0x01b1
            r4 = 1
            goto L_0x01ba
        L_0x01b1:
            r9.add(r11)
            java.util.ArrayList<com.tencent.mm.api.QueryImageData> r0 = r15.f170412s
            r0.add(r11)
            r10 = 1
        L_0x01ba:
            if (r10 == 0) goto L_0x01c6
            if (r4 != 0) goto L_0x01c6
            r14.add(r11)
            java.util.ArrayList<com.tencent.mm.api.QueryImageData> r0 = r15.f170410q
            r0.add(r11)
        L_0x01c6:
            r10 = r5
            r5 = r8
            r4 = r13
            r0 = r14
            r11 = r15
            r6 = 2
            r7 = 0
            goto L_0x01d2
        L_0x01ce:
            r9 = r12
            r10 = r13
            r0 = r14
            r11 = r15
        L_0x01d2:
            r8 = 1
            goto L_0x009b
        L_0x01d5:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r0)
            r1.add(r4)
            r1.add(r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gq3.C59629h.mo84634G3(java.util.ArrayList, wx3.d):java.lang.Object");
    }

    /* renamed from: I3 */
    public final void mo84635I3(ArrayList<QueryImageData> arrayList) {
        Log.m105924i("MicroMsg.ImageQueryViewModel", Thread.currentThread().getName() + " updateDataFromCustom >> data size: " + arrayList.size());
        if (arrayList.isEmpty()) {
            Log.m105924i("MicroMsg.ImageQueryViewModel", "the data is no need, so spilt dataList is empty");
        } else if (this.f170405i.getValue() == null) {
            ArrayList arrayList2 = new ArrayList();
            C54527k.f152883a.mo75391a(arrayList, arrayList2);
            arrayList2.add(0, new C59480d("TOP", new ArrayList()));
            arrayList2.add(new C59480d("BOTTOM", new ArrayList()));
            this.f170405i.setValue(arrayList2);
            this.f170406j.setValue(Integer.valueOf(arrayList2.size() - 1));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(Thread.currentThread().getName());
            sb.append(" updateDataFromCustom current live data size ");
            ArrayList<C59480d> value = this.f170405i.getValue();
            C87412m.m108591d(value);
            sb.append(value.size());
            Log.m105924i("MicroMsg.ImageQueryViewModel", sb.toString());
            ArrayList<C59480d> value2 = this.f170405i.getValue();
            C87412m.m108591d(value2);
            ArrayList arrayList3 = new ArrayList(value2);
            C54527k.f152883a.mo75391a(arrayList, arrayList3);
            if (mo84647n3(arrayList3)) {
                Log.m105924i("MicroMsg.ImageQueryViewModel", "data num before, add top");
                arrayList3.add(0, new C59480d("TOP", new ArrayList()));
            }
            if (!arrayList3.isEmpty()) {
                arrayList3.add(new C59480d("BOTTOM", new ArrayList()));
            }
            this.f170405i.setValue(arrayList3);
            ArrayList<C59480d> value3 = this.f170405i.getValue();
            C87412m.m108591d(value3);
            if (value3.size() > 0) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("data num before ");
                sb4.append(this.f170406j.getValue());
                sb4.append(", ");
                ArrayList<C59480d> value4 = this.f170405i.getValue();
                C87412m.m108591d(value4);
                sb4.append(((C59480d) value4.get(0)).f169960b.size());
                Log.m105924i("MicroMsg.ImageQueryViewModel", sb4.toString());
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("data num before ");
            sb5.append(this.f170406j.getValue());
            sb5.append(", ");
            ArrayList<C59480d> value5 = this.f170405i.getValue();
            C87412m.m108591d(value5);
            sb5.append(((C59480d) value5.get(0)).f169960b.size());
            Log.m105924i("MicroMsg.ImageQueryViewModel", sb5.toString());
            C54219z<Integer> zVar = this.f170406j;
            Integer value6 = zVar.getValue();
            C87412m.m108591d(value6);
            zVar.setValue(Integer.valueOf(value6.intValue() + arrayList.size()));
            Log.m105924i("MicroMsg.ImageQueryViewModel", "data num after " + this.f170406j.getValue());
            C60281c cVar = C60281c.f171856a;
            cVar.mo85261d(this.f170410q.size());
            Log.m105924i("MicroMsg.ImageQueryReportProvider", "reportSearchResultExpose,  " + C59491j.f169996a);
            if (!C59491j.f169996a && !C60282d.f171877u && C60282d.f171868l != 0) {
                IntelligentMsgActionLogStruct intelligentMsgActionLogStruct = new IntelligentMsgActionLogStruct();
                intelligentMsgActionLogStruct.f156328s = intelligentMsgActionLogStruct.mo86045b("Username", C60282d.f171858b, true);
                intelligentMsgActionLogStruct.f156313d = intelligentMsgActionLogStruct.mo86045b("sessionid", C60282d.f171859c, true);
                intelligentMsgActionLogStruct.f156315f = 56;
                intelligentMsgActionLogStruct.f156314e = intelligentMsgActionLogStruct.mo86045b("searchsessionid", C60282d.f171862f, true);
                intelligentMsgActionLogStruct.f156327r = (long) C60282d.f171865i;
                intelligentMsgActionLogStruct.f156331v = (long) C60282d.f171873q;
                C60282d.f171877u = true;
                intelligentMsgActionLogStruct.mo76269s(C60282d.f171863g);
                intelligentMsgActionLogStruct.f156322m = (long) C60282d.f171868l;
                intelligentMsgActionLogStruct.f156326q = System.currentTimeMillis() - C60282d.f171875s;
                Log.m105924i("MicroMsg.ImageQueryReporter", "searchResultExpose >> action: " + intelligentMsgActionLogStruct.f156315f);
                intelligentMsgActionLogStruct.mo86054n();
            }
            C59649r value7 = this.f170408o.getValue();
            if (C87412m.m108589b(value7 != null ? value7.name() : null, "PERSON")) {
                cVar.mo85262e(this.f170411r.size());
            }
        }
    }

    /* renamed from: J3 */
    public final void mo84636J3(String str) {
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        this.f170404h.setValue(str);
        this.f170401e.setValue(C59270b.ALL);
        if (str.length() == 0) {
            this.f170400d.setValue(new ArrayList());
        }
        if (this.f170410q.size() != 0) {
            C60281c cVar = C60281c.f171856a;
            cVar.mo85261d(this.f170410q.size());
            cVar.mo85263f(this.f170410q.size());
            C59649r value = this.f170408o.getValue();
            if (C87412m.m108589b(value != null ? value.name() : null, "PERSON")) {
                cVar.mo85262e(this.f170411r.size());
            }
        }
        Log.m105924i("MicroMsg.ImageQueryReportProvider", "reportSetPrintQuery >> " + str + ", " + C59491j.f169996a);
        if (!C59491j.f169996a) {
            C60282d.f171866j = C112551y.m153814n(str, ",", " ", false);
        }
        if (str.length() > 0) {
            Log.m105924i("MicroMsg.ImageQueryReportProvider", "reportInternalReport >> " + 51 + ", " + C59491j.f169996a);
            if (!C59491j.f169996a) {
                C60282d.f171857a.mo85266c(51);
            }
        }
        C53973z1 z1Var = this.f170417x;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        C53973z1 z1Var2 = this.f170416w;
        if (z1Var2 != null) {
            C53973z1.C53974a.m60623a(z1Var2, (CancellationException) null, 1, (Object) null);
        }
        this.f170405i.setValue(new ArrayList());
        this.f170406j.setValue(0);
        this.f170410q.clear();
        this.f170411r.clear();
        this.f170412s.clear();
        this.f170413t.clear();
        ((LinkedHashMap) this.f170414u).clear();
        this.f170409p.setValue(MMApplicationContext.getString(C0966R.string.m57));
        C53973z1 z1Var3 = this.f170419z;
        if (z1Var3 != null) {
            C53973z1.C53974a.m60623a(z1Var3, (CancellationException) null, 1, (Object) null);
        }
        C59481e eVar = C59491j.f169998c;
        if (eVar != null) {
            eVar.f169969i = null;
            eVar.f169970j = null;
        }
    }

    /* renamed from: K3 */
    public final void mo84637K3(C59270b bVar) {
        ArrayList<QueryImageData> arrayList;
        C87412m.m108594g(bVar, "type");
        this.f170401e.setValue(bVar);
        ArrayList arrayList2 = new ArrayList();
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            arrayList = this.f170410q;
        } else if (ordinal == 1) {
            arrayList = this.f170411r;
        } else if (ordinal == 2) {
            arrayList = this.f170412s;
        } else {
            throw new C13603j();
        }
        C54527k.f152883a.mo75391a(arrayList, arrayList2);
        if (mo84647n3(arrayList2)) {
            arrayList2.add(0, new C59480d("TOP", new ArrayList()));
        }
        if (true ^ arrayList2.isEmpty()) {
            arrayList2.add(new C59480d("BOTTOM", new ArrayList()));
        }
        C59649r value = this.f170408o.getValue();
        String str = null;
        if (C87412m.m108589b(value != null ? value.name() : null, "PERSON")) {
            this.f170407n.setValue(new ArrayList());
            ((LinkedHashMap) this.f170414u).clear();
            this.f170397B = false;
            C59270b value2 = this.f170401e.getValue();
            if (value2 != null) {
                str = value2.name();
            }
            if (!C87412m.m108589b(str, "OCR")) {
                mo84640f3(this.f170411r);
            }
        }
        this.f170406j.setValue(Integer.valueOf(arrayList.size()));
        this.f170405i.setValue(arrayList2);
    }

    /* renamed from: d3 */
    public final void mo84638d3() {
        Log.m105924i("MicroMsg.ImageQueryViewModel", "applyReq");
        ArrayList<String> arrayList = this.f170415v;
        boolean z = false;
        if (!(arrayList == null || arrayList.isEmpty())) {
            Iterator<T> it = f170395E.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (this.f170415v.contains((String) it.next())) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            this.f170408o.setValue(C59649r.PERSON);
            this.f170417x = C53895h.m60466d(C54208j0.m60899a(this), C53872d1.f151117a, (C53934p0) null, new C59639k(this, (C15601d<? super C59639k>) null), 2, (Object) null);
            return;
        }
        this.f170408o.setValue(C59649r.NORMAL);
        Log.m105924i("MicroMsg.ImageQueryViewModel", "applyNormalReq: " + Thread.currentThread().getName());
        this.f170416w = C53895h.m60466d(C54208j0.m60899a(this), C53872d1.f151117a, (C53934p0) null, new C59634i(this, (C15601d<? super C59634i>) null), 2, (Object) null);
    }

    /* renamed from: e3 */
    public final void mo84639e3(String str, List<Integer> list) {
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        this.f170404h.setValue(str);
        this.f170400d.setValue(new ArrayList());
        this.f170402f.setValue(C59648q.START);
        this.f170415v.clear();
        this.f170396A = C59477b.NEW;
        this.f170409p.setValue(MMApplicationContext.getString(C0966R.string.m57));
        C53973z1 z1Var = this.f170419z;
        boolean z = true;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f170419z = C53895h.m60466d(C54208j0.m60899a(this), C53872d1.f151119c, (C53934p0) null, new C59645o(this, (C15601d<? super C59645o>) null), 2, (Object) null);
        if (list != null) {
            ArrayList<String> arrayList = this.f170415v;
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(list, 10));
            for (Number intValue : list) {
                arrayList2.add(String.valueOf(intValue.intValue()));
            }
            arrayList.addAll(arrayList2);
            mo84638d3();
            return;
        }
        if (str.length() == 0) {
            Log.m105924i("MicroMsg.ImageQueryViewModel", "confirmToSearch >> text is empty");
            this.f170402f.setValue(C59648q.STOP);
            return;
        }
        Log.m105924i("MicroMsg.ImageQueryViewModel", "getLabelIdByText: " + str);
        C59503r rVar = C59503r.f170040a;
        ArrayList<Pair<String, ArrayList<Integer>>> g = rVar.mo84586g(str, false);
        HashSet hashSet = new HashSet();
        if (!(g == null || g.isEmpty())) {
            for (Pair pair : g) {
                Object obj = pair.second;
                C87412m.m108593f(obj, "pair.second");
                Iterable<Number> iterable = (Iterable) obj;
                ArrayList arrayList3 = new ArrayList(C36907w.m41090l(iterable, 10));
                for (Number intValue2 : iterable) {
                    arrayList3.add(String.valueOf(intValue2.intValue()));
                }
                hashSet.addAll(arrayList3);
            }
        } else {
            ArrayList<Pair<String, ArrayList<Integer>>> h = rVar.mo84587h(str, false);
            if (h != null) {
                for (Pair pair2 : h) {
                    Object obj2 = pair2.second;
                    C87412m.m108593f(obj2, "pair.second");
                    Iterable<Number> iterable2 = (Iterable) obj2;
                    ArrayList arrayList4 = new ArrayList(C36907w.m41090l(iterable2, 10));
                    for (Number intValue3 : iterable2) {
                        arrayList4.add(String.valueOf(intValue3.intValue()));
                    }
                    hashSet.addAll(arrayList4);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            z = false;
        }
        if (!z) {
            this.f170415v.addAll(hashSet);
            mo84638d3();
            return;
        }
        Log.m105924i("MicroMsg.ImageQueryViewModel", "current query label is null，go to check Intercept");
        C53895h.m60466d(C54208j0.m60899a(this), (C66212f) null, (C53934p0) null, new C59631b(str, this, (C15601d<? super C59631b>) null), 3, (Object) null);
    }

    /* renamed from: f3 */
    public final void mo84640f3(ArrayList<QueryImageData> arrayList) {
        int i;
        Log.m105924i("MicroMsg.ImageQueryViewModel", Thread.currentThread().getName() + " dealPeopleData >> data size: " + arrayList.size());
        Iterator<T> it = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            QueryImageData queryImageData = (QueryImageData) it.next();
            String str = queryImageData.f154728i;
            C87412m.m108593f(str, "it.cropLabelId");
            for (String str2 : C112550d0.m153785U(str, new String[]{"#"}, false, 0, 6, (Object) null)) {
                if (str2.length() > 0) {
                    if (this.f170414u.containsKey(str2)) {
                        ArrayList arrayList2 = this.f170414u.get(str2);
                        if (arrayList2 != null) {
                            arrayList2.add(queryImageData);
                        }
                    } else {
                        Map<String, ArrayList<QueryImageData>> map = this.f170414u;
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(queryImageData);
                        map.put(str2, arrayList3);
                    }
                }
            }
        }
        this.f170414u = C90364q0.m113155n(C90364q0.m113152k(C110818d0.m150943o0(C13801s0.m13103o(this.f170414u), new C59632c())));
        ArrayList arrayList4 = new ArrayList();
        for (T next : this.f170414u.entrySet()) {
            int i2 = i + 1;
            String str3 = null;
            if (i >= 0) {
                Map.Entry entry = (Map.Entry) next;
                if (i <= 9) {
                    String str4 = (String) entry.getKey();
                    Log.m105924i("MicroMsg.ImageQueryViewModel", "getCropImagePath >> labelId: " + str4);
                    Iterator<C32466a> it4 = this.f170413t.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        C32466a next2 = it4.next();
                        if (C87412m.m108589b(next2.f86261a, str4)) {
                            str3 = next2.f86262b;
                            break;
                        }
                    }
                    if (str3 != null) {
                        arrayList4.add(new C32466a((String) entry.getKey(), str3));
                    }
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        Log.m105924i("MicroMsg.ImageQueryViewModel", "dealPeopleData >> personMapSize: " + this.f170414u.size() + ", headerItemListSize: " + arrayList4.size());
        if (!arrayList4.isEmpty()) {
            this.f170397B = true;
        }
        this.f170407n.setValue(arrayList4);
        StringBuilder sb = new StringBuilder();
        sb.append("dealPeopleData >> personCropImageLiveDataSize: ");
        ArrayList<C32466a> value = this.f170407n.getValue();
        C87412m.m108591d(value);
        sb.append(value.size());
        Log.m105924i("MicroMsg.ImageQueryViewModel", sb.toString());
    }

    /* renamed from: g3 */
    public final C60667k2<ArrayList<C59480d>> mo84641g3(C108504h hVar, int i) {
        hVar.mo51557H(-1735455997);
        C60667k2<ArrayList<C59480d>> a = C63352a.m74693a(this.f170405i, new ArrayList(), hVar, 72);
        hVar.mo51565P();
        return a;
    }

    /* renamed from: i3 */
    public final C60667k2<String> mo84642i3(C108504h hVar, int i) {
        hVar.mo51557H(1010966032);
        C60667k2<String> a = C63352a.m74693a(this.f170409p, MMApplicationContext.getString(C0966R.string.m57), hVar, 8);
        hVar.mo51565P();
        return a;
    }

    /* renamed from: j3 */
    public final C60667k2<C59648q> mo84643j3(C108504h hVar, int i) {
        hVar.mo51557H(1660768815);
        C60667k2<C59648q> a = C63352a.m74693a(this.f170402f, C59648q.NO_START, hVar, 56);
        hVar.mo51565P();
        return a;
    }

    /* renamed from: k3 */
    public final C60667k2<String> mo84644k3(C108504h hVar, int i) {
        hVar.mo51557H(-808356205);
        C60667k2<String> a = C63352a.m74693a(this.f170404h, "", hVar, 56);
        hVar.mo51565P();
        return a;
    }

    /* renamed from: l3 */
    public final C60667k2<C59270b> mo84645l3(C108504h hVar, int i) {
        hVar.mo51557H(-1171320090);
        C60667k2<C59270b> a = C63352a.m74693a(this.f170401e, C59270b.ALL, hVar, 56);
        hVar.mo51565P();
        return a;
    }

    /* renamed from: m3 */
    public final C60667k2<C59649r> mo84646m3(C108504h hVar, int i) {
        hVar.mo51557H(866073633);
        C60667k2<C59649r> a = C63352a.m74693a(this.f170408o, C59649r.NORMAL, hVar, 56);
        hVar.mo51565P();
        return a;
    }

    /* renamed from: n3 */
    public final boolean mo84647n3(ArrayList<C59480d> arrayList) {
        return !(arrayList == null || arrayList.isEmpty()) && !C87412m.m108589b(((C59480d) C110818d0.m150914L(arrayList)).f169959a, "TOP");
    }

    /* renamed from: o3 */
    public final boolean mo84648o3(ArrayList<QueryImageData> arrayList, QueryImageData queryImageData) {
        for (QueryImageData queryImageData2 : arrayList) {
            if (C87412m.m108589b(queryImageData2.f154725f, queryImageData.f154725f)) {
                return true;
            }
        }
        return false;
    }
}
