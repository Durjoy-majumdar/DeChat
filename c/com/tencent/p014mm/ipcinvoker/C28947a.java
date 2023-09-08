package com.tencent.p014mm.ipcinvoker;

import android.os.Parcelable;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.ipcinvoker.a */
public final class C28947a {

    /* renamed from: com.tencent.mm.ipcinvoker.a$a */
    public static final class C28948a<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C32226l<ResultType, C13598b0> f79410d;

        public C28948a(C32226l<? super ResultType, C13598b0> lVar) {
            this.f79410d = lVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Parcelable parcelable = (Parcelable) obj;
            C32226l<ResultType, C13598b0> lVar = this.f79410d;
            C87412m.m108593f(parcelable, "data");
            lVar.invoke(parcelable);
        }
    }

    /* renamed from: a */
    public static final <InputType extends Parcelable, ResultType extends Parcelable> void m38500a(String str, InputType inputtype, C80883e<InputType, ResultType> eVar, C32226l<? super ResultType, C13598b0> lVar) {
        C87412m.m108594g(str, "targetProcessName");
        C87412m.m108594g(eVar, "process");
        C80907o.m98781d(str, inputtype, eVar.getClass(), lVar != null ? new C28948a(lVar) : null);
    }

    /* renamed from: b */
    public static final <InputType extends Parcelable, ResultType extends Parcelable> ResultType m38501b(String str, InputType inputtype, C80916r<InputType, ResultType> rVar) {
        C87412m.m108594g(str, "targetProcessName");
        C87412m.m108594g(rVar, "process");
        return C80907o.m98783f(str, inputtype, rVar.getClass());
    }
}
