package com.tencent.p014mm.plugin.finder.p056ui;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import f14.C58901s;
import fy3.C32227p;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C50119ke1;
import te3.C52261zg3;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zc1.C66785b;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.ui.FinderSettingInfoUI$doPrepareUser$1", mo125469f = "FinderSettingInfoUI.kt", mo125470l = {120, 124}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.finder.ui.l3 */
public final class C3857l3 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f17396d;

    /* renamed from: e */
    public int f17397e;

    /* renamed from: f */
    public final /* synthetic */ FinderSettingInfoUI f17398f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.ui.FinderSettingInfoUI$doPrepareUser$1$1$2", mo125469f = "FinderSettingInfoUI.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.ui.l3$a */
    public static final class C3858a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ FinderSettingInfoUI f17399d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3858a(FinderSettingInfoUI finderSettingInfoUI, C15601d<? super C3858a> dVar) {
            super(2, dVar);
            this.f17399d = finderSettingInfoUI;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C3858a(this.f17399d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C3858a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            FinderSettingInfoUI finderSettingInfoUI = this.f17399d;
            int i = FinderSettingInfoUI.f17080o;
            finderSettingInfoUI.mo4116I7(true);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3857l3(FinderSettingInfoUI finderSettingInfoUI, C15601d<? super C3857l3> dVar) {
        super(2, dVar);
        this.f17398f = finderSettingInfoUI;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C3857l3(this.f17398f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C3857l3) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        T t;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f17397e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C66785b bVar = C66785b.f191882e;
            this.f17397e = 1;
            obj2 = bVar.mo90679u0(2, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).m168123unboximpl();
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        FinderSettingInfoUI finderSettingInfoUI = this.f17398f;
        if (Result.m168121isSuccessimpl(obj2)) {
            C50119ke1 ke12 = (C50119ke1) obj2;
            finderSettingInfoUI.f17084g = ke12;
            LinkedList<C52261zg3> linkedList = ke12.f136709z;
            C87412m.m108593f(linkedList, "resp.finder_list");
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                FinderContact finderContact = ((C52261zg3) t).f145918e;
                if (C87412m.m108589b(finderContact != null ? finderContact.username : null, finderSettingInfoUI.f17082e)) {
                    break;
                }
            }
            C52261zg3 zg32 = (C52261zg3) t;
            finderSettingInfoUI.f17085h = zg32 != null ? zg32.f145927q : null;
            C53896h0 h0Var = C53872d1.f151117a;
            C53915k2 k2Var = C58901s.f168555a;
            C3858a aVar2 = new C3858a(finderSettingInfoUI, (C15601d<? super C3858a>) null);
            this.f17396d = obj2;
            this.f17397e = 2;
            if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return C13598b0.f38549a;
    }
}
