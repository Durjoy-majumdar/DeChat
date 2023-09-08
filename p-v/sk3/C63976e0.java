package sk3;

import a11.C39479c;
import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53930o0;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.WalletQueryHbStatusEvent;
import com.tencent.p014mm.autogen.events.WalletQueryRemittanceStatusEvent;
import com.tencent.p014mm.message.C68062c;
import com.tencent.p014mm.message.C68066g;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.C73760n0;
import com.tencent.p014mm.p136ui.gridviewheaders.C74763a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75592q0;
import eb0.C75604z3;
import f14.C58901s;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32227p;
import gy3.C45983e0;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Date;
import kotlin.ResultKt;
import ok3.C62067b;
import ok3.C62070e;
import ok3.C62071f;
import ok3.C62074i;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.chatting.search.multi.uic.FTSMultiItemPayUIC$updateMatchInfo$1", mo125469f = "FTSMultiItemPayUIC.kt", mo125470l = {184}, mo125471m = "invokeSuspend")
/* renamed from: sk3.e0 */
public final class C63976e0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f181377d;

    /* renamed from: e */
    public /* synthetic */ Object f181378e;

    /* renamed from: f */
    public final /* synthetic */ C63979f0 f181379f;

    /* renamed from: g */
    public final /* synthetic */ ArrayList<C72963f4> f181380g;

    @C91590f(mo125468c = "com.tencent.mm.ui.chatting.search.multi.uic.FTSMultiItemPayUIC$updateMatchInfo$1$2", mo125469f = "FTSMultiItemPayUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: sk3.e0$a */
    public static final class C63977a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C63979f0 f181381d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<C62070e> f181382e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63977a(C63979f0 f0Var, ArrayList<C62070e> arrayList, C15601d<? super C63977a> dVar) {
            super(2, dVar);
            this.f181381d = f0Var;
            this.f181382e = arrayList;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C63977a(this.f181381d, this.f181382e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63977a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C63979f0 f0Var = this.f181381d;
            ArrayList<C62070e> arrayList = this.f181382e;
            f0Var.getClass();
            C87412m.m108594g(arrayList, "<set-?>");
            f0Var.f181421j = arrayList;
            this.f181381d.f181419h.setValue(C62074i.FINISH);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63976e0(C63979f0 f0Var, ArrayList<C72963f4> arrayList, C15601d<? super C63976e0> dVar) {
        super(2, dVar);
        this.f181379f = f0Var;
        this.f181380g = arrayList;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C63976e0 e0Var = new C63976e0(this.f181379f, this.f181380g, dVar);
        e0Var.f181378e = obj;
        return e0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C63976e0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        C8479f0 f0Var;
        C0000n0 n0Var;
        C68070l.C68072b u;
        String str2;
        long j;
        C62071f fVar;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f181377d;
        int i2 = 1;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var2 = (C0000n0) this.f181378e;
            ArrayList arrayList = new ArrayList();
            String str3 = "MicroMsg.FTSMultiItemPayUIC";
            Log.m105924i(str3, "SearchJob start >> " + Thread.currentThread().getName());
            C8479f0 f0Var2 = new C8479f0();
            if (C72996z1.m85820U5(this.f181379f.f181423o)) {
                f0Var2.f27484d = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(this.f181379f.f181423o);
            }
            C45983e0 e0Var = new C45983e0();
            ArrayList<C72963f4> arrayList2 = this.f181380g;
            C63979f0 f0Var3 = this.f181379f;
            for (C72963f4 f4Var : arrayList2) {
                if (!C53930o0.m60560g(n0Var2)) {
                    Log.m105924i(str3, "is no active");
                    return C13598b0.f38549a;
                }
                String content = f4Var.getContent();
                if (content == null || (u = C68070l.C68072b.m80422u(content, (String) null)) == null) {
                    n0Var = n0Var2;
                    f0Var = f0Var2;
                    str = str3;
                } else {
                    long a = C74763a.m89510e().mo103933a(new Date(f4Var.getCreateTime()));
                    if (e0Var.f124000d != a) {
                        arrayList.add(new C62067b(f4Var.getCreateTime()));
                    }
                    boolean U5 = C72996z1.m85820U5(f0Var3.f181423o);
                    String str4 = "";
                    if (f4Var.mo108769t2() == i2) {
                        str2 = C75592q0.m90789s();
                    } else {
                        str2 = U5 ? C75604z3.m90847s(f4Var.getContent()) : str4;
                        if (Util.isNullOrNil(str2)) {
                            str2 = f4Var.mo108768t();
                        }
                    }
                    C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str2);
                    if (f0Var2.f27484d != null) {
                        if (!(str2 == null || str2.length() == 0)) {
                            str4 = ((C44661m1) f0Var2.f27484d).mo69789q2(str2);
                            C87412m.m108593f(str4, "member.getDisplayName(username)");
                        }
                    }
                    String str5 = str4;
                    if (f0Var3.mo88754m3(f4Var.getType())) {
                        fVar = new C62071f(f4Var.getCreateTime(), u.f195582i, u.f195493H0, f4Var.getMsgId(), z1Var != null ? z1Var.getUsername() : null, z1Var != null ? z1Var.mo62909j3() : null, z1Var != null ? z1Var.mo73969n2() : null, str5);
                        WalletQueryRemittanceStatusEvent walletQueryRemittanceStatusEvent = new WalletQueryRemittanceStatusEvent();
                        walletQueryRemittanceStatusEvent.f154909d.f154911a = u.f195501J0;
                        walletQueryRemittanceStatusEvent.publish();
                        boolean z = f4Var.mo108769t2() == 1 ? walletQueryRemittanceStatusEvent.f154910e.f154913b : !walletQueryRemittanceStatusEvent.f154910e.f154913b;
                        int i3 = walletQueryRemittanceStatusEvent.f154910e.f154912a;
                        boolean z2 = i3 == -2 ? false : z;
                        if (i3 <= 0) {
                            i3 = u.f195489G0;
                        }
                        int i4 = i3;
                        n0Var = n0Var2;
                        fVar.f176461f = f0Var3.getActivity().getResources().getString(C0966R.string.jmr, new Object[]{fVar.f176461f});
                        int i5 = -352966;
                        if (i4 != 1 && (i4 == 3 || i4 == 4 || i4 == 5 || i4 == 6)) {
                            i5 = -470621;
                        }
                        fVar.f176466k = i5;
                        int i6 = i4;
                        C72963f4 f4Var2 = f4Var;
                        f0Var = f0Var2;
                        str = str3;
                        j = a;
                        C68070l.C68072b bVar = u;
                        boolean z3 = z2;
                        C68070l.C68072b bVar2 = u;
                        int i7 = i6;
                        fVar.f176465j = C63979f0.m75293j3(f0Var3, f0Var3.getActivity(), f4Var2, bVar, z3, i7);
                        C68070l.C68072b bVar3 = bVar2;
                        fVar.f176464i = C63979f0.m75294k3(f0Var3, f0Var3.getActivity(), f4Var2, bVar3, z3, i7);
                        fVar.f176465j = C63979f0.m75293j3(f0Var3, f0Var3.getActivity(), f4Var2, bVar3, z3, i7);
                        fVar.f176465j = C63979f0.m75293j3(f0Var3, f0Var3.getActivity(), f4Var2, bVar3, z3, i7);
                        fVar.f176464i = C63979f0.m75294k3(f0Var3, f0Var3.getActivity(), f4Var2, bVar3, z3, i7);
                    } else {
                        n0Var = n0Var2;
                        f0Var = f0Var2;
                        str = str3;
                        j = a;
                        C68070l.C68072b bVar4 = u;
                        fVar = new C62071f(f4Var.getCreateTime(), bVar4.f195582i, bVar4.f195584i1, f4Var.getMsgId(), z1Var.getUsername(), z1Var.mo62909j3(), z1Var.mo73969n2(), str5);
                        if (Util.safeParseInt(bVar4.f195604n1) == Util.safeParseInt("1001")) {
                            fVar.f176461f = f0Var3.getActivity().getResources().getString(C0966R.string.jmp, new Object[]{fVar.f176461f});
                            fVar.f176465j = C73760n0.m87362h(bVar4, f4Var.mo108769t2() == 1);
                            fVar.f176466k = C73760n0.m87356b(bVar4, f4Var.mo108769t2() == 1);
                            fVar.f176464i = C73760n0.m87359e(bVar4, f4Var.mo108769t2() == 1);
                        } else {
                            WalletQueryHbStatusEvent walletQueryHbStatusEvent = new WalletQueryHbStatusEvent();
                            walletQueryHbStatusEvent.f154903d.f154905a = bVar4.f195608o1;
                            walletQueryHbStatusEvent.publish();
                            fVar.f176461f = f0Var3.getActivity().getResources().getString(C0966R.string.jmq, new Object[]{fVar.f176461f});
                            WalletQueryHbStatusEvent.C55177b bVar5 = walletQueryHbStatusEvent.f154904e;
                            fVar.f176465j = C73760n0.m87364j(bVar5.f154906a, bVar5.f154907b, bVar5.f154908c, f4Var.mo108769t2() == 1, C72996z1.m85820U5(f0Var3.f181423o), f0Var3.f181423o, bVar4, (TextView) null);
                            C68066g w = bVar4.mo93555w(C68062c.class);
                            C87412m.m108593f(w, "content.piece(AppContentC2cMsgPiece::class.java)");
                            int identifier = f0Var3.getActivity().getResources().getIdentifier(((C68062c) w).f195385b, "drawable", MMApplicationContext.getPackageName());
                            WalletQueryHbStatusEvent.C55177b bVar6 = walletQueryHbStatusEvent.f154904e;
                            int l = C73760n0.m87366l(bVar6.f154907b, bVar6.f154908c, f4Var.mo108769t2() == 1);
                            fVar.f176464i = l;
                            if (l <= 0) {
                                fVar.f176464i = identifier;
                            }
                        }
                    }
                    e0Var.f124000d = j;
                    arrayList.add(fVar);
                }
                n0Var2 = n0Var;
                f0Var2 = f0Var;
                str3 = str;
                i2 = 1;
            }
            C53896h0 h0Var = C53872d1.f151117a;
            C53915k2 k2Var = C58901s.f168555a;
            C63977a aVar2 = new C63977a(this.f181379f, arrayList, (C15601d<? super C63977a>) null);
            this.f181377d = 1;
            if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
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
