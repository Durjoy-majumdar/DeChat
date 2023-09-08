package com.tencent.p014mm.plugin.emoji.model;

import a14.C0000n0;
import a14.C53916l;
import a14.C53921m;
import a14.C53930o0;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C30790w2;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import j61.C46445t;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import ob0.C11385n;
import ob0.C117747y;
import p441aq.C92054g;
import qo3.C89779i0;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C66447b;

/* renamed from: com.tencent.mm.plugin.emoji.model.h */
public final class C41045h {

    /* renamed from: a */
    public final Context f110513a;

    /* renamed from: b */
    public final List<String> f110514b;

    /* renamed from: c */
    public final String f110515c = "MicroMsg.EmojiGroupRemove";

    /* renamed from: d */
    public final C0000n0 f110516d = C53930o0.m60555b();

    /* renamed from: e */
    public C89779i0 f110517e;

    /* renamed from: com.tencent.mm.plugin.emoji.model.h$a */
    public static final class C41046a implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C11385n> f110518d;

        /* renamed from: e */
        public final /* synthetic */ C46445t f110519e;

        /* renamed from: f */
        public final /* synthetic */ C41045h f110520f;

        /* renamed from: g */
        public final /* synthetic */ String f110521g;

        /* renamed from: h */
        public final /* synthetic */ C53916l<Boolean> f110522h;

        public C41046a(C8479f0<C11385n> f0Var, C46445t tVar, C41045h hVar, String str, C53916l<? super Boolean> lVar) {
            this.f110518d = f0Var;
            this.f110519e = tVar;
            this.f110520f = hVar;
            this.f110521g = str;
            this.f110522h = lVar;
        }

        public final void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C86709a0.m107529k().f251779b.mo123470p(413, (C11385n) this.f110518d.f27484d);
            if (!C87412m.m108589b(yVar, this.f110519e)) {
                return;
            }
            if (i == 0 && i2 == 0) {
                String str2 = this.f110520f.f110515c;
                Log.m105924i(str2, "removeOne: " + this.f110521g + " success");
                ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
                C30790w2.m39221h().mo57715b().mo142021Ow(this.f110519e.f125114f);
                C53916l<Boolean> lVar = this.f110522h;
                Result.Companion companion = Result.Companion;
                lVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
                return;
            }
            String str3 = this.f110520f.f110515c;
            Log.m105924i(str3, "removeOne: " + this.f110521g + " fail");
            C53916l<Boolean> lVar2 = this.f110522h;
            Result.Companion companion2 = Result.Companion;
            lVar2.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(new Exception())));
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.model.h$b */
    public static final class C41047b extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C11385n> f110523d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41047b(C8479f0<C11385n> f0Var) {
            super(1);
            this.f110523d = f0Var;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            C86709a0.m107529k().f251779b.mo123470p(413, (C11385n) this.f110523d.f27484d);
            return C13598b0.f38549a;
        }
    }

    public C41045h(Context context, List<String> list) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(list, "groupList");
        this.f110513a = context;
        this.f110514b = list;
    }

    /* renamed from: a */
    public final Object mo64087a(String str, C15601d<? super Boolean> dVar) {
        String str2 = this.f110515c;
        Log.m105924i(str2, "removeOne: " + str);
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        C46445t tVar = new C46445t(str, 2);
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = new C41046a(f0Var, tVar, this, str, mVar);
        C86709a0.m107529k().f251779b.mo123455a(413, (C11385n) f0Var.f27484d);
        mVar.mo74599v(new C41047b(f0Var));
        C86709a0.m107529k().f251779b.mo123460f(tVar);
        return mVar.mo74608o();
    }
}
