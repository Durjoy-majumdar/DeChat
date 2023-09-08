package g13;

import a14.C0000n0;
import a14.C53934p0;
import androidx.lifecycle.C39622i0;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.event.MvvmEventCenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45252f;
import d14.C45253g;
import e13.C75472a;
import e13.C7583b;
import f40.C86709a0;
import fy3.C32227p;
import gy3.C87412m;
import java.util.LinkedList;
import kotlin.ResultKt;
import ob0.C47350c;
import pb0.C47445a;
import pb0.C47446b;
import qb0.C47798b;
import rx3.C13598b0;
import te3.C49117da2;
import te3.C49256ea2;
import te3.ak4;
import te3.zj4;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: g13.f */
public final class C45876f extends C39622i0 {

    /* renamed from: d */
    public static int f123832d;

    @C91590f(mo125468c = "com.tencent.mm.plugin.translate.model.TranslateInWritingHelper$doTranslateInWritingCgi$1", mo125469f = "TranslateInWritingHelper.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: g13.f$a */
    public static final class C45877a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ String f123833d;

        /* renamed from: e */
        public final /* synthetic */ String f123834e;

        /* renamed from: f */
        public final /* synthetic */ int f123835f;

        /* renamed from: g */
        public final /* synthetic */ String f123836g;

        /* renamed from: h */
        public final /* synthetic */ int f123837h;

        /* renamed from: i */
        public final /* synthetic */ String f123838i;

        /* renamed from: j */
        public final /* synthetic */ C45876f f123839j;

        @C91590f(mo125468c = "com.tencent.mm.plugin.translate.model.TranslateInWritingHelper$doTranslateInWritingCgi$1$2", mo125469f = "TranslateInWritingHelper.kt", mo125470l = {101}, mo125471m = "invokeSuspend")
        /* renamed from: g13.f$a$a */
        public static final class C45878a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f123840d;

            /* renamed from: e */
            public final /* synthetic */ C45252f<C47445a<C49256ea2>> f123841e;

            /* renamed from: f */
            public final /* synthetic */ C45876f f123842f;

            /* renamed from: g13.f$a$a$a */
            public static final class C45879a implements C45253g<C47445a<C49256ea2>> {

                /* renamed from: d */
                public final /* synthetic */ C45876f f123843d;

                public C45879a(C45876f fVar) {
                    this.f123843d = fVar;
                }

                public Object emit(Object obj, C15601d dVar) {
                    C13598b0 b0Var;
                    LinkedList<ak4> linkedList;
                    Class cls = C75472a.class;
                    C47445a aVar = (C47445a) obj;
                    if (aVar.f128348a == C47798b.OnEnd) {
                        Log.m105924i("MicroMsg.Translate.TranslateInWritingHelper", "onTranslateEnd " + aVar.f128349b + ' ' + aVar.f128350c + ' ' + aVar.f128351d);
                        C49256ea2 ea22 = (C49256ea2) aVar.f128353f;
                        if (ea22 == null || (linkedList = ea22.f132827e) == null) {
                            b0Var = null;
                        } else {
                            C45876f fVar = this.f123843d;
                            if (!linkedList.isEmpty()) {
                                String str = linkedList.get(0).f130597e;
                                if (!(str == null || str.length() == 0)) {
                                    ak4 ak4 = linkedList.get(0);
                                    Log.m105924i("MicroMsg.Translate.TranslateInWritingHelper", "onTranslateEndSuccess " + ak4.f130596d + ' ' + ak4.f130597e);
                                    int i = ak4.f130596d;
                                    String str2 = ak4.f130597e;
                                    C87412m.m108593f(str2, "TranslatedText");
                                    fVar.getClass();
                                    ((C75472a) MvvmEventCenter.Companion.getEvent(cls)).publish(new C7583b(i, str2));
                                    b0Var = C13598b0.f38549a;
                                }
                            }
                            Log.m105924i("MicroMsg.Translate.TranslateInWritingHelper", "onTranslateEndSuccess msgList.isEmpty():" + linkedList.isEmpty() + ' ');
                            ((C75472a) MvvmEventCenter.Companion.getEvent(cls)).publish(new C7583b(-1, ""));
                            b0Var = C13598b0.f38549a;
                        }
                        if (b0Var == null) {
                            this.f123843d.getClass();
                            ((C75472a) MvvmEventCenter.Companion.getEvent(cls)).publish(new C7583b(-1, ""));
                        }
                    }
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C45878a(C45252f<C47445a<C49256ea2>> fVar, C45876f fVar2, C15601d<? super C45878a> dVar) {
                super(2, dVar);
                this.f123841e = fVar;
                this.f123842f = fVar2;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C45878a(this.f123841e, this.f123842f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C45878a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f123840d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C45252f<C47445a<C49256ea2>> fVar = this.f123841e;
                    C45879a aVar2 = new C45879a(this.f123842f);
                    this.f123840d = 1;
                    if (fVar.mo31880a(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45877a(String str, String str2, int i, String str3, int i2, String str4, C45876f fVar, C15601d<? super C45877a> dVar) {
            super(2, dVar);
            this.f123833d = str;
            this.f123834e = str2;
            this.f123835f = i;
            this.f123836g = str3;
            this.f123837h = i2;
            this.f123838i = str4;
            this.f123839j = fVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C45877a(this.f123833d, this.f123834e, this.f123835f, this.f123836g, this.f123837h, this.f123838i, this.f123839j, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C45877a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C49117da2 da22 = new C49117da2();
            da22.f132208d = 1;
            da22.f132210f = this.f123833d;
            LinkedList<zj4> linkedList = da22.f132209e;
            zj4 zj4 = new zj4();
            String str = this.f123834e;
            int i = this.f123835f;
            String str2 = this.f123836g;
            int i2 = this.f123837h;
            String str3 = this.f123838i;
            zj4.f146042f = str;
            zj4.f146040d = i;
            zj4.f146045i = str2;
            zj4.f146043g = i2;
            zj4.f146041e = str3;
            linkedList.add(zj4);
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127069d = 631;
            bVar.f127068c = "/cgi-bin/micromsg-bin/gettranstext";
            bVar.f127066a = da22;
            bVar.f127067b = new C49256ea2();
            C45252f a = C47446b.f127269a.mo72464a(bVar.mo72403a());
            LifecycleScope lifecycleScope = C86709a0.m107523b().f251755f.f123611e;
            if (lifecycleScope != null) {
                LifecycleScope.launchDefault$default(lifecycleScope, (C53934p0) null, new C45878a(a, this.f123839j, (C15601d<? super C45878a>) null), 1, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: c3 */
    public final void mo71312c3(int i, String str, String str2, String str3, int i2, String str4) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        C87412m.m108594g(str, "targetLan");
        C87412m.m108594g(str2, "chatRoomId");
        C87412m.m108594g(str7, "prefixContent");
        C87412m.m108594g(str8, "textMsg");
        if (!(str4.length() == 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("doTranslateInWritingCgi clientMsgID:");
            int i3 = i;
            sb.append(i);
            sb.append(" targetLan:");
            sb.append(str);
            sb.append(" chatRoomId:");
            sb.append(str2);
            sb.append(" prefixContent:");
            sb.append(str7);
            sb.append(" scene:");
            sb.append(i2);
            sb.append(" textMsg:");
            sb.append(str8);
            Log.m105924i("MicroMsg.Translate.TranslateInWritingHelper", sb.toString());
            LifecycleScope lifecycleScope = C86709a0.m107523b().f251755f.f123611e;
            if (lifecycleScope != null) {
                LifecycleScope.launchDefault$default(lifecycleScope, (C53934p0) null, new C45877a(str, str2, i, str3, i2, str4, this, (C15601d<? super C45877a>) null), 1, (Object) null);
            }
        }
    }
}
