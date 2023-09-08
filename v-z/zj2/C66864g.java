package zj2;

import a14.C0000n0;
import a14.C53860b3;
import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import nj2.C61765m;
import nj2.C61767o;
import nj2.C61768p;
import rx3.C13598b0;
import wj2.C66129b;
import wj2.C66130c;
import wj2.C66131d;
import wj2.C66132f;
import wj2.C66135h;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.service.RingtoneServiceHelper$startShakeOnly$1", mo125469f = "RingtoneServiceHelper.kt", mo125470l = {151}, mo125471m = "invokeSuspend")
/* renamed from: zj2.g */
public final class C66864g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public long f192076d;

    /* renamed from: e */
    public int f192077e;

    /* renamed from: f */
    public /* synthetic */ Object f192078f;

    /* renamed from: g */
    public final /* synthetic */ C66862f f192079g;

    /* renamed from: h */
    public final /* synthetic */ String f192080h;

    /* renamed from: i */
    public final /* synthetic */ boolean f192081i;

    @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.service.RingtoneServiceHelper$startShakeOnly$1$ringBackMediaInfo$1", mo125469f = "RingtoneServiceHelper.kt", mo125470l = {152}, mo125471m = "invokeSuspend")
    /* renamed from: zj2.g$a */
    public static final class C66865a extends C91594j implements C32227p<C0000n0, C15601d<? super C66132f>, Object> {

        /* renamed from: d */
        public int f192082d;

        /* renamed from: e */
        public final /* synthetic */ String f192083e;

        /* renamed from: f */
        public final /* synthetic */ C66862f f192084f;

        /* renamed from: g */
        public final /* synthetic */ boolean f192085g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66865a(String str, C66862f fVar, boolean z, C15601d<? super C66865a> dVar) {
            super(2, dVar);
            this.f192083e = str;
            this.f192084f = fVar;
            this.f192085g = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C66865a(this.f192083e, this.f192084f, this.f192085g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C66865a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f192082d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.f192083e;
                C66130c cVar = this.f192084f.f192053e;
                boolean z = this.f192085g;
                this.f192082d = 1;
                C61767o oVar = C61767o.f175575a;
                obj = C53895h.m60469g(C53872d1.f151119c, new C61765m(cVar, str, z, (C15601d<? super C61765m>) null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66864g(C66862f fVar, String str, boolean z, C15601d<? super C66864g> dVar) {
        super(2, dVar);
        this.f192079g = fVar;
        this.f192080h = str;
        this.f192081i = z;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C66864g gVar = new C66864g(this.f192079g, this.f192080h, this.f192081i, dVar);
        gVar.f192078f = obj;
        return gVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C66864g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C0000n0 n0Var;
        long j;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f192077e;
        C66131d dVar = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var2 = (C0000n0) this.f192078f;
            long currentTicks = Util.currentTicks();
            long a = C66862f.m78972a(this.f192079g);
            C66865a aVar2 = new C66865a(this.f192080h, this.f192079g, this.f192081i, (C15601d<? super C66865a>) null);
            this.f192078f = n0Var2;
            this.f192076d = currentTicks;
            this.f192077e = 1;
            Object c = C53860b3.m60375c(a, aVar2, this);
            if (c == aVar) {
                return aVar;
            }
            n0Var = n0Var2;
            obj = c;
            j = currentTicks;
        } else if (i == 1) {
            j = this.f192076d;
            n0Var = (C0000n0) this.f192078f;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C66132f fVar = (C66132f) obj;
        if (fVar == null) {
            fVar = C66135h.f190107E.mo90187b();
            C66862f fVar2 = this.f192079g;
            Log.m105928w("MicroMsg.RingtoneServiceHelper", "getRingBackMediaInfo timeout with " + C66862f.m78972a(fVar2) + ", use default ringtone");
        }
        this.f192079g.f192071w = Util.ticksToNow(j);
        C66862f fVar3 = this.f192079g;
        fVar3.f192052d = fVar.f190078a;
        fVar3.f192050b = fVar;
        if (C53930o0.m60560g(n0Var)) {
            this.f192079g.mo90865d(C66129b.SHAKE_ONLY);
        }
        C66862f fVar4 = this.f192079g;
        C66130c cVar = fVar4.f192053e;
        if (cVar != null) {
            dVar = cVar.f190068a;
        }
        if (dVar == C66131d.START_SOUND) {
            String str = this.f192080h;
            if (str != null) {
                fVar4.f192047C = str;
            }
            fVar4.f192066r = System.currentTimeMillis();
            C66862f fVar5 = this.f192079g;
            fVar5.f192072x = fVar.f190090m;
            String unsignedLongString = Util.getUnsignedLongString(fVar.f190092o);
            C87412m.m108593f(unsignedLongString, "getUnsignedLongString(ri…MediaInfo.finderObjectId)");
            fVar5.f192073y = unsignedLongString;
            C66862f fVar6 = this.f192079g;
            fVar6.f192045A = fVar.f190094q;
            fVar6.f192048D = C61768p.f175586a.mo86690b(fVar);
            C66862f fVar7 = this.f192079g;
            fVar7.f192067s = fVar.f190084g;
            String str2 = fVar7.f192047C;
            C87412m.m108594g(str2, "toUser");
            C61768p.f175591f.putString(str2, fVar.mo90183n());
        }
        return C13598b0.f38549a;
    }
}
