package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import a14.C0000n0;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C1303e;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$f;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32227p;
import gy3.C87412m;
import ke3.C88144b;
import kotlin.ResultKt;
import nj3.C76879j;
import p148ei.C7660a;
import p286zl.C16293k;
import q40.C12040d;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90363p0;
import t83.C13851h1;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.webview.ui.tools.jsapi.PrivateCommonApiHandler$doPrivateForgetPassword$1", mo125469f = "PrivateCommonApiHandler.kt", mo125470l = {152}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.y3 */
public final class C6345y3 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f23246d;

    /* renamed from: e */
    public int f23247e;

    /* renamed from: f */
    public final /* synthetic */ C6203a4 f23248f;

    /* renamed from: g */
    public final /* synthetic */ C13851h1 f23249g;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.y3$a */
    public static final class C6346a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C6203a4 f23250d;

        /* renamed from: e */
        public final /* synthetic */ C13851h1 f23251e;

        public C6346a(C6203a4 a4Var, C13851h1 h1Var) {
            this.f23250d = a4Var;
            this.f23251e = h1Var;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f23250d.f22901a.mo7210k5(this.f23251e, "cancel", C90363p0.m113143b(new C13604l("err_msg", "cancel")));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.y3$b */
    public static final class C6347b implements C16293k.C16294a {

        /* renamed from: a */
        public final /* synthetic */ MMFragmentActivity f23252a;

        /* renamed from: b */
        public final /* synthetic */ C6203a4 f23253b;

        /* renamed from: c */
        public final /* synthetic */ C13851h1 f23254c;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.y3$b$a */
        public static final class C6348a implements MMFragmentActivity$$f {

            /* renamed from: a */
            public final /* synthetic */ C6203a4 f23255a;

            /* renamed from: b */
            public final /* synthetic */ C13851h1 f23256b;

            public C6348a(C6203a4 a4Var, C13851h1 h1Var) {
                this.f23255a = a4Var;
                this.f23256b = h1Var;
            }

            public final void mmOnActivityResult(int i, int i2, Intent intent) {
                if (i2 == -1) {
                    this.f23255a.f22901a.mo7210k5(this.f23256b, "ok", C90363p0.m113143b(new C13604l("err_msg", "ok")));
                } else {
                    this.f23255a.f22901a.mo7210k5(this.f23256b, "cancel", C90363p0.m113143b(new C13604l("err_msg", "cancel")));
                }
            }
        }

        public C6347b(MMFragmentActivity mMFragmentActivity, C6203a4 a4Var, C13851h1 h1Var) {
            this.f23252a = mMFragmentActivity;
            this.f23253b = a4Var;
            this.f23254c = h1Var;
        }

        public void onActivityResult(int i, int i2, Intent intent) {
            String str = null;
            if (((C16293k) C86312j.m106911c(C16293k.class)).mo14656pW() != null) {
                C13851h1 h1Var = this.f23254c;
                C6203a4 a4Var = this.f23253b;
                Object obj = h1Var.f38983a.get("liteAppUuid");
                String str2 = obj instanceof String ? (String) obj : null;
                if (str2 == null) {
                    str2 = "0";
                }
                long parseLong = Long.parseLong(str2);
                Object e = C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null);
                C87412m.m108592e(e, "null cannot be cast to non-null type kotlin.String");
                LiteAppCenter.publishGlobalEventToTopPage(parseLong, "onBindMobileChange", C6203a4.m6494a(a4Var, new C13604l("bindMobile", (String) e)));
            }
            if (i2 == -1) {
                if (intent != null) {
                    str = intent.getStringExtra("setpwd_ticket");
                }
                Log.m105925i("MicroMsg.PrivateCommonApiHandler", "get reset pwd ticket %s", str);
                if (!Util.isNullOrNil(str)) {
                    Intent intent2 = new Intent();
                    intent2.addFlags(603979776);
                    intent2.putExtra("setpwd_ticket", str);
                    C88144b.m109804v(this.f23252a, ".plugin.account.ui.RegByMobileSetPwdUI", intent2, 1, new C6348a(this.f23253b, this.f23254c));
                    return;
                }
                this.f23253b.f22901a.mo7210k5(this.f23254c, "cancel", C90363p0.m113143b(new C13604l("err_msg", "cancel")));
                return;
            }
            this.f23253b.f22901a.mo7210k5(this.f23254c, "cancel", C90363p0.m113143b(new C13604l("err_msg", "cancel")));
        }

        public void onCancel() {
            this.f23253b.f22901a.mo7210k5(this.f23254c, "cancel", C90363p0.m113143b(new C13604l("err_msg", "cancel")));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6345y3(C6203a4 a4Var, C13851h1 h1Var, C15601d<? super C6345y3> dVar) {
        super(2, dVar);
        this.f23248f = a4Var;
        this.f23249g = h1Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C6345y3(this.f23248f, this.f23249g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C6345y3) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C89779i0 i0Var;
        C12040d e;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f23247e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Context context = this.f23248f.f22901a.f22697d;
            C89779i0 Q = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), this.f23248f.f22901a.f22697d.getString(C0966R.string.gat), true, false, (DialogInterface.OnCancelListener) null);
            try {
                C1303e eVar = C1303e.f10418a;
                this.f23246d = Q;
                this.f23247e = 1;
                if (eVar.mo1223a(this) == aVar) {
                    return aVar;
                }
                i0Var = Q;
            } catch (C12040d e2) {
                C12040d dVar = e2;
                i0Var = Q;
                e = dVar;
                try {
                    Log.printErrStackTrace("MicroMsg.PrivateCommonApiHandler", e, "", new Object[0]);
                    C7660a a = C7660a.m7782a(e.f35059g);
                    if (a != null) {
                        Log.m105925i("MicroMsg.PrivateCommonApiHandler", "summertips errCode[%d], showType[%d], url[%s], desc[%s]", new Integer(e.f35058f), new Integer(a.f26002c), a.f26000a, a.f26001b);
                        C6203a4 a4Var = this.f23248f;
                        C76879j.m92713G(a4Var.f22901a.f22697d, a.f26001b, a.f26003d, false, new C6346a(a4Var, this.f23249g));
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                    i0Var.dismiss();
                    return b0Var;
                } catch (Throwable th) {
                    th = th;
                    i0Var.dismiss();
                    throw th;
                }
            } catch (Throwable th4) {
                i0Var = Q;
                th = th4;
                i0Var.dismiss();
                throw th;
            }
        } else if (i == 1) {
            i0Var = (C89779i0) this.f23246d;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (C12040d e3) {
                e = e3;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i0Var.dismiss();
        C6203a4 a4Var2 = this.f23248f;
        Context context2 = a4Var2.f22901a.f22697d;
        MMFragmentActivity mMFragmentActivity = context2 instanceof MMFragmentActivity ? (MMFragmentActivity) context2 : null;
        if (mMFragmentActivity != null) {
            ((C16293k) C86312j.m106911c(C16293k.class)).mo14655ZE(mMFragmentActivity, new C6347b(mMFragmentActivity, a4Var2, this.f23249g));
        }
        return C13598b0.f38549a;
    }
}
