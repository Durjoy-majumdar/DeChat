package sk3;

import a11.C39479c;
import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53965x0;
import a14.C53973z1;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableString;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C54208j0;
import androidx.lifecycle.C54219z;
import androidx.lifecycle.LiveData;
import bl3.C0317e;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.QueryImageData;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75604z3;
import f14.C58901s;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kv1.C61173o;
import kv1.C99254i;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C99664b;
import lv1.C99672i;
import lv1.C99681n;
import nk3.C61795a;
import nk3.C61796b;
import nk3.C61797d;
import ok3.C62072g;
import ok3.C62074i;
import p157gk.C59479c;
import qk3.C63284d;
import qo3.C89779i0;
import rk3.C63462a;
import rx3.C13598b0;
import sx3.C110818d0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: sk3.v */
public final class C64024v extends UIComponent implements C61173o {

    /* renamed from: A */
    public boolean f181507A;

    /* renamed from: B */
    public boolean f181508B;

    /* renamed from: C */
    public boolean f181509C;

    /* renamed from: D */
    public boolean f181510D;

    /* renamed from: E */
    public C89779i0 f181511E;

    /* renamed from: F */
    public C53973z1 f181512F;

    /* renamed from: G */
    public HashMap<Integer, ArrayList<Long>> f181513G;

    /* renamed from: d */
    public String f181514d = "";

    /* renamed from: e */
    public C99664b f181515e;

    /* renamed from: f */
    public String f181516f = "";

    /* renamed from: g */
    public final C54219z<C62074i> f181517g;

    /* renamed from: h */
    public final LiveData<C62074i> f181518h;

    /* renamed from: i */
    public List<? extends C99681n> f181519i;

    /* renamed from: j */
    public ArrayList<C62072g> f181520j;

    /* renamed from: n */
    public ArrayList<C62072g> f181521n;

    /* renamed from: o */
    public C99672i f181522o;

    /* renamed from: p */
    public C44661m1 f181523p;

    /* renamed from: q */
    public C61797d f181524q;

    /* renamed from: r */
    public final ArrayList<QueryImageData> f181525r;

    /* renamed from: s */
    public final ArrayList<QueryImageData> f181526s;

    /* renamed from: t */
    public boolean f181527t;

    /* renamed from: u */
    public C53973z1 f181528u;

    /* renamed from: v */
    public C59479c f181529v;

    /* renamed from: w */
    public C63284d f181530w;

    /* renamed from: x */
    public C53973z1 f181531x;

    /* renamed from: y */
    public boolean f181532y;

    /* renamed from: z */
    public boolean f181533z;

    @C91590f(mo125468c = "com.tencent.mm.ui.chatting.search.multi.uic.FTSMultiItemAllResultUIC$showDialog$1", mo125469f = "FTSMultiItemAllResultUIC.kt", mo125470l = {168, 172}, mo125471m = "invokeSuspend")
    /* renamed from: sk3.v$a */
    public static final class C64025a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f181534d;

        /* renamed from: e */
        public final /* synthetic */ C64024v f181535e;

        @C91590f(mo125468c = "com.tencent.mm.ui.chatting.search.multi.uic.FTSMultiItemAllResultUIC$showDialog$1$1", mo125469f = "FTSMultiItemAllResultUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: sk3.v$a$a */
        public static final class C64026a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C64024v f181536d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C64026a(C64024v vVar, C15601d<? super C64026a> dVar) {
                super(2, dVar);
                this.f181536d = vVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C64026a(this.f181536d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C64026a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                Log.m105924i("MicroMsg.FTSMultiItemAllResultUIC", "go to show " + this.f181536d.f181516f);
                C89779i0 i0Var = this.f181536d.f181511E;
                if (i0Var != null) {
                    i0Var.show();
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64025a(C64024v vVar, C15601d<? super C64025a> dVar) {
            super(2, dVar);
            this.f181535e = vVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C64025a(this.f181535e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C64025a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f181534d;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f181534d = 1;
                if (C53965x0.m60607b(300, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C89779i0 i0Var = this.f181535e.f181511E;
            if (i0Var == null || !i0Var.isShowing()) {
                z = false;
            }
            if (z) {
                return C13598b0.f38549a;
            }
            C53896h0 h0Var = C53872d1.f151117a;
            C53915k2 k2Var = C58901s.f168555a;
            C64026a aVar2 = new C64026a(this.f181535e, (C15601d<? super C64026a>) null);
            this.f181534d = 2;
            if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                return aVar;
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64024v(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C54219z<C62074i> zVar = new C54219z<>(C62074i.IDLE);
        this.f181517g = zVar;
        this.f181518h = zVar;
        this.f181519i = new ArrayList();
        this.f181520j = new ArrayList<>();
        this.f181521n = new ArrayList<>();
        this.f181525r = new ArrayList<>();
        this.f181526s = new ArrayList<>();
        this.f181529v = C59479c.INIT;
        this.f181530w = new C63284d();
        this.f181513G = new HashMap<>();
    }

    /* renamed from: c3 */
    public static final ArrayList m75347c3(C64024v vVar, ArrayList arrayList, ArrayList arrayList2) {
        vVar.getClass();
        Log.m105924i("MicroMsg.FTSMultiItemAllResultUIC", "getInsetDataFromFlow >> " + arrayList.size() + ' ' + arrayList2.size());
        if (arrayList2.isEmpty()) {
            Log.m105924i("MicroMsg.FTSMultiItemAllResultUIC", "picImageList is empty");
            return arrayList;
        }
        ArrayList arrayList3 = new ArrayList();
        long j = ((QueryImageData) C110818d0.m150923U(arrayList2)).f154724e;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            QueryImageData queryImageData = (QueryImageData) it.next();
            if (queryImageData.f154724e < j) {
                arrayList3.add(queryImageData);
            }
        }
        Log.m105924i("MicroMsg.FTSMultiItemAllResultUIC", "getInsetDataFromFlow >> " + j + ", " + arrayList3.size());
        return arrayList3;
    }

    /* renamed from: H0 */
    public void mo293H0(C10656l lVar) {
        C10656l lVar2 = lVar;
        Class cls = C64009r0.class;
        C62074i iVar = C62074i.FINISH;
        Class cls2 = C63995m.class;
        C87412m.m108594g(lVar2, "ftsResult");
        Log.m105924i("MicroMsg.FTSMultiItemAllResultUIC", "onFTSSearchEnd >> resultCode: " + lVar2.f32074c + ", resultSize:" + lVar2.f32076e.size() + ", " + Thread.currentThread().getName());
        int i = lVar2.f32074c;
        if (i == -3 || i == -2 || i == -1) {
            this.f181519i = new ArrayList();
            this.f181517g.postValue(iVar);
            C63462a aVar = C63462a.f180011a;
            aVar.mo88334i();
            C39818r rVar = C39818r.f106831a;
            if (((C64009r0) rVar.mo62444c(getActivity()).mo75002a(cls)).f181466p == 0) {
                aVar.mo88331f(0, ((C63995m) rVar.mo62444c(getActivity()).mo75002a(cls2)).mo88764f3(), ((C63995m) rVar.mo62444c(getActivity()).mo75002a(cls2)).mo88762d3());
            }
            if (!((C63995m) rVar.mo62444c(getActivity()).mo75002a(cls2)).f181434o || !((C63995m) rVar.mo62444c(getActivity()).mo75002a(cls2)).f181433n) {
                this.f181527t = true;
            }
        } else if (i == 0) {
            this.f181519i = new ArrayList(lVar2.f32076e);
            C99672i iVar2 = lVar2.f32075d;
            this.f181522o = iVar2;
            C61797d dVar = this.f181524q;
            if (dVar != null) {
                dVar.f175708h = iVar2;
            }
            ArrayList arrayList = new ArrayList(this.f181519i);
            ArrayList<C62072g> arrayList2 = new ArrayList<>();
            Log.m105924i("MicroMsg.FTSMultiItemAllResultUIC", "dealMatchInfo >> itemSize: " + this.f181520j.size() + ", matchInfoSize: " + arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C99681n nVar = (C99681n) it.next();
                C62072g gVar = r9;
                C62072g gVar2 = new C62072g(C61795a.NORMAL, (C61796b) null, (String) null, (String) null, (CharSequence) null, (CharSequence) null, (String) null, (String) null, nVar.f292150d, nVar, this.f181522o, nVar.f292152f, 254, (C8480h) null);
                arrayList2.add(gVar);
            }
            this.f181520j = arrayList2;
            this.f181532y = true;
            Log.m105924i("MicroMsg.FTSMultiItemAllResultUIC", "onFTSSearchEnd >> " + this.f181529v + ' ' + this.f181510D);
            C39818r rVar2 = C39818r.f106831a;
            if (!((C63995m) rVar2.mo62444c(getActivity()).mo75002a(cls2)).f181434o || !((C63995m) rVar2.mo62444c(getActivity()).mo75002a(cls2)).f181433n || this.f181510D) {
                C63462a aVar2 = C63462a.f180011a;
                aVar2.mo88334i();
                this.f181521n.addAll(this.f181520j);
                this.f181517g.setValue(iVar);
                this.f181527t = true;
                if (((C64009r0) rVar2.mo62444c(getActivity()).mo75002a(cls)).f181466p == 0) {
                    aVar2.mo88331f(this.f181521n.size(), ((C63995m) rVar2.mo62444c(getActivity()).mo75002a(cls2)).mo88764f3(), ((C63995m) rVar2.mo62444c(getActivity()).mo75002a(cls2)).mo88762d3());
                }
            }
            this.f181528u = C53895h.m60466d(C54208j0.m60899a(this), C53872d1.f151119c, (C53934p0) null, new C64014s(this, (C15601d<? super C64014s>) null), 2, (Object) null);
        }
    }

    /* renamed from: d3 */
    public final void mo88779d3() {
        Log.m105924i("MicroMsg.FTSMultiItemAllResultUIC", "dismissDialog " + this.f181516f);
        C53973z1 z1Var = this.f181512F;
        boolean z = true;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        C89779i0 i0Var = this.f181511E;
        if (i0Var == null || !i0Var.isShowing()) {
            z = false;
        }
        if (z) {
            Log.m105924i("MicroMsg.FTSMultiItemAllResultUIC", "go to dismiss " + this.f181516f);
            C89779i0 i0Var2 = this.f181511E;
            if (i0Var2 != null) {
                i0Var2.dismiss();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: com.tencent.mm.api.QueryImageData} */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0070, code lost:
        if (r0.f181527t != false) goto L_0x001e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0075  */
    /* renamed from: e3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<ok3.C62072g> mo88780e3() {
        /*
            r18 = this;
            r0 = r18
            java.lang.Class<sk3.m> r1 = sk3.C63995m.class
            bl3.r r2 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r3 = r18.getActivity()
            bl3.r$a r3 = r2.mo62444c(r3)
            androidx.lifecycle.i0 r3 = r3.mo75002a(r1)
            sk3.m r3 = (sk3.C63995m) r3
            boolean r3 = r3.f181434o
            java.lang.String r4 = "MicroMsg.FTSMultiItemAllResultUIC"
            java.lang.String r5 = ", "
            r6 = 0
            r7 = 1
            if (r3 != 0) goto L_0x0020
        L_0x001e:
            r3 = 0
            goto L_0x0073
        L_0x0020:
            androidx.appcompat.app.AppCompatActivity r3 = r18.getActivity()
            bl3.r$a r3 = r2.mo62444c(r3)
            androidx.lifecycle.i0 r3 = r3.mo75002a(r1)
            sk3.m r3 = (sk3.C63995m) r3
            boolean r3 = r3.f181433n
            if (r3 != 0) goto L_0x0033
            goto L_0x001e
        L_0x0033:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "checkToGetImage >>  "
            r3.append(r8)
            boolean r8 = r0.f181527t
            r3.append(r8)
            r3.append(r5)
            boolean r8 = r0.f181509C
            r3.append(r8)
            r3.append(r5)
            boolean r8 = r0.f181510D
            r3.append(r8)
            r3.append(r5)
            boolean r8 = r0.f181508B
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            boolean r3 = r0.f181510D
            if (r3 == 0) goto L_0x0067
        L_0x0065:
            r3 = 1
            goto L_0x0073
        L_0x0067:
            boolean r3 = r0.f181508B
            if (r3 == 0) goto L_0x006e
            r0.f181508B = r6
            goto L_0x0065
        L_0x006e:
            boolean r3 = r0.f181527t
            if (r3 == 0) goto L_0x0065
            goto L_0x001e
        L_0x0073:
            if (r3 == 0) goto L_0x0256
            java.util.ArrayList r3 = new java.util.ArrayList
            androidx.appcompat.app.AppCompatActivity r8 = r18.getActivity()
            bl3.r$a r8 = r2.mo62444c(r8)
            androidx.lifecycle.i0 r8 = r8.mo75002a(r1)
            sk3.m r8 = (sk3.C63995m) r8
            gq3.h r8 = r8.mo88763e3()
            java.util.ArrayList<com.tencent.mm.api.QueryImageData> r8 = r8.f170411r
            r3.<init>(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            androidx.appcompat.app.AppCompatActivity r9 = r18.getActivity()
            bl3.r$a r2 = r2.mo62444c(r9)
            androidx.lifecycle.i0 r2 = r2.mo75002a(r1)
            sk3.m r2 = (sk3.C63995m) r2
            gq3.h r2 = r2.mo88763e3()
            java.util.ArrayList<com.tencent.mm.api.QueryImageData> r2 = r2.f170412s
            r8.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = "dealImageList before >> "
            r2.append(r9)
            int r9 = r3.size()
            r2.append(r9)
            r2.append(r5)
            int r9 = r8.size()
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = "getToInsetPicList >> "
            r3.append(r9)
            int r9 = r2.size()
            r3.append(r9)
            r3.append(r5)
            java.util.ArrayList<com.tencent.mm.api.QueryImageData> r9 = r0.f181525r
            int r9 = r9.size()
            r3.append(r9)
            r3.append(r5)
            boolean r9 = r0.f181509C
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList<com.tencent.mm.api.QueryImageData> r9 = r0.f181525r
            boolean r9 = r9.isEmpty()
            java.util.ArrayList<com.tencent.mm.api.QueryImageData> r10 = r0.f181525r
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x010f
            r10 = 0
            goto L_0x0117
        L_0x010f:
            java.util.ArrayList<com.tencent.mm.api.QueryImageData> r10 = r0.f181525r
            java.lang.Object r10 = sx3.C110818d0.m150923U(r10)
            com.tencent.mm.api.QueryImageData r10 = (com.tencent.p014mm.api.QueryImageData) r10
        L_0x0117:
            java.util.Iterator r12 = r2.iterator()
        L_0x011b:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0142
            java.lang.Object r13 = r12.next()
            com.tencent.mm.api.QueryImageData r13 = (com.tencent.p014mm.api.QueryImageData) r13
            if (r9 == 0) goto L_0x012d
            r3.add(r13)
            goto L_0x013d
        L_0x012d:
            if (r10 == 0) goto L_0x013d
            long r13 = r13.f154723d
            r16 = r12
            long r11 = r10.f154723d
            int r17 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r17 != 0) goto L_0x013f
            r12 = r16
            r9 = 1
            goto L_0x011b
        L_0x013d:
            r16 = r12
        L_0x013f:
            r12 = r16
            goto L_0x011b
        L_0x0142:
            java.util.ArrayList<com.tencent.mm.api.QueryImageData> r9 = r0.f181525r
            r9.clear()
            java.util.ArrayList<com.tencent.mm.api.QueryImageData> r9 = r0.f181525r
            r9.addAll(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "getToInsetOcrList >> "
            r8.append(r9)
            int r9 = r2.size()
            r8.append(r9)
            r8.append(r5)
            java.util.ArrayList<com.tencent.mm.api.QueryImageData> r9 = r0.f181526s
            int r9 = r9.size()
            r8.append(r9)
            r8.append(r5)
            boolean r9 = r0.f181509C
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList<com.tencent.mm.api.QueryImageData> r9 = r0.f181526s
            boolean r9 = r9.isEmpty()
            java.util.ArrayList<com.tencent.mm.api.QueryImageData> r10 = r0.f181526s
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x0192
            r11 = 0
            goto L_0x019b
        L_0x0192:
            java.util.ArrayList<com.tencent.mm.api.QueryImageData> r10 = r0.f181526s
            java.lang.Object r10 = sx3.C110818d0.m150923U(r10)
            r11 = r10
            com.tencent.mm.api.QueryImageData r11 = (com.tencent.p014mm.api.QueryImageData) r11
        L_0x019b:
            java.util.Iterator r10 = r2.iterator()
        L_0x019f:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x01bd
            java.lang.Object r12 = r10.next()
            com.tencent.mm.api.QueryImageData r12 = (com.tencent.p014mm.api.QueryImageData) r12
            if (r9 == 0) goto L_0x01b1
            r8.add(r12)
            goto L_0x019f
        L_0x01b1:
            if (r11 == 0) goto L_0x019f
            long r12 = r12.f154723d
            long r14 = r11.f154723d
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 != 0) goto L_0x019f
            r9 = 1
            goto L_0x019f
        L_0x01bd:
            java.util.ArrayList<com.tencent.mm.api.QueryImageData> r9 = r0.f181526s
            r9.clear()
            java.util.ArrayList<com.tencent.mm.api.QueryImageData> r9 = r0.f181526s
            r9.addAll(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = "dealImageList after >> "
            r2.append(r9)
            int r9 = r3.size()
            r2.append(r9)
            r2.append(r5)
            int r9 = r8.size()
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.ArrayList<ok3.g> r9 = r0.f181521n
            r2.<init>(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "dealImageList before >> targetListSize: "
            r9.append(r10)
            int r10 = r2.size()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
            nk3.a r9 = nk3.C61795a.IMAGE_PIC
            r0.mo88782g3(r3, r9, r2)
            nk3.a r3 = nk3.C61795a.IMAGE_OCR
            r0.mo88782g3(r8, r3, r2)
            r0.f181521n = r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "dealImageList after >> targetListSize: "
            r3.append(r8)
            int r2 = r2.size()
            r3.append(r2)
            r3.append(r5)
            java.util.ArrayList<ok3.g> r2 = r0.f181521n
            int r2 = r2.size()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            bl3.r r2 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r3 = r18.getActivity()
            bl3.r$a r2 = r2.mo62444c(r3)
            androidx.lifecycle.i0 r1 = r2.mo75002a(r1)
            sk3.m r1 = (sk3.C63995m) r1
            androidx.lifecycle.LiveData<gq3.q> r1 = r1.f181432j
            java.lang.Object r1 = r1.getValue()
            gq3.q r2 = gq3.C59648q.STOP
            if (r1 != r2) goto L_0x0256
            r0.f181527t = r7
            r0.f181510D = r6
        L_0x0256:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.ArrayList<ok3.g> r2 = r0.f181521n
            r1.<init>(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sk3.C64024v.mo88780e3():java.util.ArrayList");
    }

    /* renamed from: f3 */
    public final C62072g mo88781f3(QueryImageData queryImageData, C61795a aVar) {
        String str;
        QueryImageData queryImageData2 = queryImageData;
        Class cls = C75700k0.class;
        String str2 = ((C64004q0) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C64004q0.class)).f181449f;
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(queryImageData2.f154723d);
        boolean U5 = C72996z1.m85820U5(this.f181514d);
        String str3 = "";
        if (b002.mo108769t2() == 1) {
            str = C75592q0.m90789s();
        } else {
            str = U5 ? C75604z3.m90847s(b002.getContent()) : str3;
            if (Util.isNullOrNil(str)) {
                str = b002.mo108768t();
            }
        }
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str);
        boolean z = false;
        if (this.f181523p != null) {
            if (!(str == null || str.length() == 0)) {
                C44661m1 m1Var = this.f181523p;
                C87412m.m108591d(m1Var);
                str3 = m1Var.mo69789q2(str);
            }
        }
        if (str3 == null || str3.length() == 0) {
            str3 = z1Var != null ? z1Var.mo73969n2() : null;
        }
        if (str3 == null || str3.length() == 0) {
            z = true;
        }
        if (z) {
            str3 = z1Var != null ? z1Var.mo62909j3() : null;
        }
        String str4 = str3;
        SpannableString m = C99254i.m129316m(getString(aVar == C61795a.IMAGE_PIC ? C0966R.string.mhd : C0966R.string.mhc), getString(C0966R.string.mhe), str2);
        C61796b bVar = C61796b.IMAGE;
        long j = queryImageData2.f154724e;
        long j2 = queryImageData2.f154723d;
        C72963f4 f4Var = b002;
        return new C62072g(aVar, bVar, f4Var.mo108768t(), str4, m, C72715f.m85112e(getContext(), queryImageData2.f154724e, true), queryImageData2.f154725f, z1Var != null ? z1Var.getUsername() : null, j2, (C99681n) null, this.f181522o, j, 512, (C8480h) null);
    }

    /* renamed from: g3 */
    public final void mo88782g3(ArrayList<QueryImageData> arrayList, C61795a aVar, ArrayList<C62072g> arrayList2) {
        boolean z;
        C87412m.m108594g(arrayList, "list");
        C87412m.m108594g(aVar, "type");
        C87412m.m108594g(arrayList2, "targetList");
        Log.m105924i("MicroMsg.FTSMultiItemAllResultUIC", "size: " + arrayList.size() + ", " + aVar + ", " + arrayList2.size());
        if (arrayList2.isEmpty()) {
            for (QueryImageData f3 : arrayList) {
                arrayList2.add(mo88781f3(f3, aVar));
            }
            return;
        }
        for (QueryImageData queryImageData : arrayList) {
            int size = arrayList2.size();
            boolean z2 = false;
            int i = 0;
            while (true) {
                z = true;
                if (i >= size) {
                    break;
                } else if (queryImageData.f154724e == arrayList2.get(i).f176478l) {
                    Log.m105924i("MicroMsg.FTSMultiItemAllResultUIC", "insetImageToResult find similar");
                    break;
                } else if (queryImageData.f154724e > arrayList2.get(i).f176478l) {
                    Log.m105924i("MicroMsg.FTSMultiItemAllResultUIC", "insetImageToResult find inset");
                    arrayList2.add(i, mo88781f3(queryImageData, aVar));
                    z2 = true;
                    break;
                } else {
                    i++;
                }
            }
            z = false;
            if (!z2 && !z) {
                Log.m105924i("MicroMsg.FTSMultiItemAllResultUIC", "insetImageToResult in last");
                arrayList2.add(arrayList2.size(), mo88781f3(queryImageData, aVar));
            }
        }
    }

    /* renamed from: i3 */
    public final void mo88783i3() {
        Log.m105924i("MicroMsg.FTSMultiItemAllResultUIC", "showDialog " + this.f181516f);
        this.f181512F = C0317e.launch$default(this, (C66212f) null, (C53934p0) null, new C64025a(this, (C15601d<? super C64025a>) null), 3, (Object) null);
    }

    /* renamed from: j3 */
    public final void mo88784j3(C59479c cVar) {
        C87412m.m108594g(cVar, "type");
        Log.m105924i("MicroMsg.FTSMultiItemAllResultUIC", "updateCurrentIdentifyType >> " + cVar);
        this.f181529v = cVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("detail_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f181514d = stringExtra;
        this.f181523p = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(this.f181514d);
        this.f181511E = C89779i0.m112246c(getActivity(), getString(C0966R.string.mpa), false, 3, (DialogInterface.OnCancelListener) null);
        C63462a aVar = C63462a.f180011a;
        String str = this.f181514d;
        C87412m.m108594g(str, "userName");
        Log.m105924i("MicroMsg.FTSMultiReporter", "reset");
        C63462a.f180012b = "";
        C63462a.f180013c = "";
        C63462a.f180014d = "";
        C63462a.f180015e = 0;
        C63462a.f180016f = "";
        C63462a.f180017g = 1;
        C63462a.f180018h = 0;
        C63462a.f180019i = 0;
        C63462a.f180020j.clear();
        C63462a.f180022l = false;
        C63462a.f180021k = 0;
        C63462a.f180024n = 0;
        C63462a.f180012b = String.valueOf(System.currentTimeMillis());
        Log.m105924i("MicroMsg.FTSMultiReporter", "setUserName >> " + str + ", setSessionId >> " + C63462a.f180012b);
        C63462a.f180014d = str;
        aVar.mo88330e(1);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f181515e != null) {
            ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki(this.f181515e);
        }
        C53973z1 z1Var = this.f181528u;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        C53973z1 z1Var2 = this.f181512F;
        if (z1Var2 != null) {
            C53973z1.C53974a.m60623a(z1Var2, (CancellationException) null, 1, (Object) null);
        }
        C53973z1 z1Var3 = this.f181531x;
        if (z1Var3 != null) {
            C53973z1.C53974a.m60623a(z1Var3, (CancellationException) null, 1, (Object) null);
        }
        C63284d dVar = this.f181530w;
        dVar.getClass();
        Log.m105924i("MicroMsg.LoadMoreImageDataModel", "destroy");
        dVar.f179617a = null;
        C53973z1 z1Var4 = dVar.f179619c;
        if (z1Var4 != null) {
            C53973z1.C53974a.m60623a(z1Var4, (CancellationException) null, 1, (Object) null);
        }
        C53930o0.m60558e(dVar.f179618b, (CancellationException) null, 1, (Object) null);
        this.f181513G.clear();
    }
}
