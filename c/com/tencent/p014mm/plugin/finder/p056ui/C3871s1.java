package com.tencent.p014mm.plugin.finder.p056ui;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.storage.C72994y1;
import f14.C58901s;
import f40.C86709a0;
import fe1.C58969q;
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

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.ui.FinderModifyNameUI$doPrepareUser$1", mo125469f = "FinderModifyNameUI.kt", mo125470l = {536, 538}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.finder.ui.s1 */
public final class C3871s1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f17421d;

    /* renamed from: e */
    public int f17422e;

    /* renamed from: f */
    public final /* synthetic */ FinderModifyNameUI f17423f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.ui.FinderModifyNameUI$doPrepareUser$1$1$1", mo125469f = "FinderModifyNameUI.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.ui.s1$a */
    public static final class C3872a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C50119ke1 f17424d;

        /* renamed from: e */
        public final /* synthetic */ FinderModifyNameUI f17425e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3872a(C50119ke1 ke12, FinderModifyNameUI finderModifyNameUI, C15601d<? super C3872a> dVar) {
            super(2, dVar);
            this.f17424d = ke12;
            this.f17425e = finderModifyNameUI;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C3872a(this.f17424d, this.f17425e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C3872a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            T t;
            String str2;
            ResultKt.throwOnFailure(obj);
            LinkedList<C52261zg3> linkedList = this.f17424d.f136709z;
            C87412m.m108593f(linkedList, "resp.finder_list");
            FinderModifyNameUI finderModifyNameUI = this.f17425e;
            Iterator<T> it = linkedList.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                FinderContact finderContact = ((C52261zg3) t).f145918e;
                String str3 = finderContact != null ? finderContact.username : null;
                C58969q qVar = finderModifyNameUI.f16955B;
                if (C87412m.m108589b(str3, qVar != null ? qVar.field_username : null)) {
                    break;
                }
            }
            C52261zg3 zg32 = (C52261zg3) t;
            if (!(zg32 == null || (str2 = zg32.f145936z) == null)) {
                boolean z = true;
                if (this.f17425e.f16956C != 1) {
                    z = false;
                }
                if (!z) {
                    str2 = null;
                }
                if (str2 != null) {
                    FinderModifyNameUI.f16952J = str2;
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_NICKNAME_MODIFY_WORD_STRING_SYNC, str2);
                }
            }
            int i = this.f17424d.f136695i;
            if (i > 0) {
                FinderModifyNameUI.f16953K = i;
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_NICKNAME_MODIFY_LIMIT_LENGTH_INT_SYNC, new Integer(this.f17424d.f136695i));
            }
            int i2 = this.f17424d.f136693g;
            if (i2 > 0) {
                this.f17425e.f16958E = i2;
            }
            FinderModifyNameUI finderModifyNameUI2 = this.f17425e;
            if (zg32 != null) {
                str = zg32.f145930t;
            }
            if (str == null) {
                str = "";
            }
            finderModifyNameUI2.f16974z = str;
            finderModifyNameUI2.mo4088Q7();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3871s1(FinderModifyNameUI finderModifyNameUI, C15601d<? super C3871s1> dVar) {
        super(2, dVar);
        this.f17423f = finderModifyNameUI;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C3871s1(this.f17423f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C3871s1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f17422e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C66785b bVar = C66785b.f191882e;
            this.f17422e = 1;
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
        FinderModifyNameUI finderModifyNameUI = this.f17423f;
        if (Result.m168121isSuccessimpl(obj2)) {
            C53896h0 h0Var = C53872d1.f151117a;
            C53915k2 k2Var = C58901s.f168555a;
            C3872a aVar2 = new C3872a((C50119ke1) obj2, finderModifyNameUI, (C15601d<? super C3872a>) null);
            this.f17421d = obj2;
            this.f17422e = 2;
            if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return C13598b0.f38549a;
    }
}
