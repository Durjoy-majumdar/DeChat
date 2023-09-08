package com.tencent.p014mm.plugin.p081mv.p082ui;

import a14.C0000n0;
import d14.C45252f;
import d14.C45253g;
import d14.C58057l;
import fy3.C32227p;
import ib2.C60265a;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.ResultKt;
import rx3.C13598b0;
import sb2.C63759f0;
import sb2.C63844s;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.mv.ui.MusicMvMakerUI$onCreate$4$1", mo125469f = "MusicMvMakerUI.kt", mo125470l = {156}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.mv.ui.a */
public final class C56946a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f163106d;

    /* renamed from: e */
    public final /* synthetic */ C63759f0 f163107e;

    /* renamed from: f */
    public final /* synthetic */ C63844s f163108f;

    /* renamed from: g */
    public final /* synthetic */ MusicMvMakerUI f163109g;

    /* renamed from: com.tencent.mm.plugin.mv.ui.a$a */
    public static final class C56947a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ C63844s f163110d;

        /* renamed from: e */
        public final /* synthetic */ MusicMvMakerUI f163111e;

        public C56947a(C63844s sVar, MusicMvMakerUI musicMvMakerUI) {
            this.f163110d = sVar;
            this.f163111e = musicMvMakerUI;
        }

        public Object emit(Object obj, C15601d dVar) {
            boolean z;
            HashSet hashSet = (HashSet) obj;
            boolean z2 = false;
            if (!(hashSet instanceof Collection) || !hashSet.isEmpty()) {
                Iterator it = hashSet.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C60265a) it.next()).f171813e != 0) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            z2 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (this.f163110d.mo88634d3()) {
                MusicMvMakerUI musicMvMakerUI = this.f163111e;
                int i = MusicMvMakerUI.f163030u;
                musicMvMakerUI.mo80367O7(z2);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56946a(C63759f0 f0Var, C63844s sVar, MusicMvMakerUI musicMvMakerUI, C15601d<? super C56946a> dVar) {
        super(2, dVar);
        this.f163107e = f0Var;
        this.f163108f = sVar;
        this.f163109g = musicMvMakerUI;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C56946a(this.f163107e, this.f163108f, this.f163109g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C56946a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f163106d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C45252f<HashSet<C60265a>> fVar = this.f163107e.f180772h.f163011y;
            C56947a aVar2 = new C56947a(this.f163108f, this.f163109g);
            this.f163106d = 1;
            if (((C58057l) fVar).mo31880a(aVar2, this) == aVar) {
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
