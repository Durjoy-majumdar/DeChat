package je0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.ipcinvoker.wx_extension.IPCRunCgi;
import com.tencent.p014mm.openim.api.OpenIMKefuStartConversationRequest;
import com.tencent.p014mm.openim.model.IOpenIMKefuConfirmController;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import he0.C46020f;
import he0.C46021h;
import he0.C46026p;
import he0.C46027q;
import he0.C76161o;
import ie0.C46220j;
import kotlin.Result;
import nj3.C76879j;
import ob0.C47350c;
import org.json.JSONObject;
import p910lj.C76701a;
import pe3.C47465a;
import qo3.C77398g;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import se0.C22361f;
import se0.C77666a;
import se0.C77669c;
import se0.C77680e;
import te3.C51004qs;
import te3.C51147rs;
import te3.C51195s3;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C66447b;
import zt3.C119157j;

/* renamed from: je0.d0 */
public final class C21216d0 implements IOpenIMKefuConfirmController {

    /* renamed from: a */
    public final Activity f59996a;

    /* renamed from: b */
    public C22361f f59997b;

    /* renamed from: c */
    public C22361f.C22362a f59998c;

    /* renamed from: d */
    public OpenIMKefuStartConversationRequest f59999d;

    /* renamed from: e */
    public C46020f f60000e;

    /* renamed from: f */
    public int f60001f = -1;

    /* renamed from: g */
    public final C13601g f60002g = C36568h.m40985a(new C21217a(this));

    /* renamed from: h */
    public final C13601g f60003h = C36568h.m40985a(new C21221e(this));

    /* renamed from: i */
    public final C13601g f60004i = C36568h.m40985a(new C21223h(this));

    /* renamed from: j */
    public final C13601g f60005j = C36568h.m40985a(new C21222g(this));

    /* renamed from: k */
    public boolean f60006k;

    /* renamed from: l */
    public boolean f60007l;

    /* renamed from: m */
    public final C21220d f60008m = new C21220d(this);

    /* renamed from: n */
    public C89779i0 f60009n;

    /* renamed from: o */
    public Intent f60010o;

    /* renamed from: p */
    public final C13601g f60011p = C36568h.m40985a(new C21224i(this));

    /* renamed from: q */
    public final C13601g f60012q = C36568h.m40985a(new C21218b(this));

    /* renamed from: je0.d0$a */
    public static final class C21217a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C21216d0 f60013d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21217a(C21216d0 d0Var) {
            super(0);
            this.f60013d = d0Var;
        }

        public Object invoke() {
            OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = this.f60013d.f59999d;
            return Integer.valueOf(openIMKefuStartConversationRequest != null ? openIMKefuStartConversationRequest.f108519h : 3);
        }
    }

    /* renamed from: je0.d0$b */
    public static final class C21218b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C21216d0 f60014d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21218b(C21216d0 d0Var) {
            super(0);
            this.f60014d = d0Var;
        }

        public Object invoke() {
            OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = this.f60014d.f59999d;
            String str = openIMKefuStartConversationRequest != null ? openIMKefuStartConversationRequest.f108523o : null;
            return str == null ? "" : str;
        }
    }

    /* renamed from: je0.d0$c */
    public static final class C21219c implements C46021h.C46022a {

        /* renamed from: a */
        public final /* synthetic */ C21216d0 f60015a;

        public C21219c(C21216d0 d0Var) {
            this.f60015a = d0Var;
        }

        /* renamed from: a */
        public void mo33215a(C46027q qVar) {
            String str = null;
            C46020f fVar = qVar != null ? qVar.f124111d : null;
            StringBuilder sb = new StringBuilder();
            sb.append("alvinluo fetchConfirmInfo onFinish isValid: ");
            sb.append(fVar != null ? Boolean.valueOf(((C46220j) fVar).f124590Y) : null);
            sb.append(", cancelled: ");
            sb.append(this.f60015a.f60006k);
            sb.append(", confirmType: ");
            sb.append(qVar != null ? Integer.valueOf(qVar.f124112e) : null);
            sb.append(", confirmPageType: ");
            OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = this.f60015a.f59999d;
            sb.append(openIMKefuStartConversationRequest != null ? Integer.valueOf(openIMKefuStartConversationRequest.f108519h) : null);
            sb.append(", ");
            sb.append(fVar != null ? ((C46220j) fVar).mo71632l2() : null);
            Log.m105924i("MicroMsg.OpenIMKefuConfirmController", sb.toString());
            C21216d0 d0Var = this.f60015a;
            d0Var.f60000e = fVar;
            d0Var.f60001f = qVar != null ? qVar.f124112e : 3;
            if (d0Var.f60006k) {
                d0Var.mo33206f();
                C22361f fVar2 = d0Var.f59997b;
                if (fVar2 != null) {
                    fVar2.release();
                }
                d0Var.f59997b = null;
                return;
            }
            if (fVar != null && ((C46220j) fVar).f124590Y) {
                C21220d dVar = d0Var.f60008m;
                dVar.getClass();
                C87412m.m108594g(qVar, "getContactResult");
                C21231p0.m23721c(dVar.f60016a.mo33211j(), dVar.f60016a.mo33212k(), true, 0, "");
                C21216d0 d0Var2 = dVar.f60016a;
                if (d0Var2.f59997b == null || !C76161o.m91464a(d0Var2.f60001f)) {
                    C21216d0 d0Var3 = dVar.f60016a;
                    int i = d0Var3.mo33210i();
                    int i2 = dVar.f60016a.f60001f;
                    Activity activity = d0Var3.f59996a;
                    C87412m.m108594g(activity, "context");
                    d0Var3.f59997b = !C76161o.m91464a(i2) ? new C77666a(activity) : i == 1 ? new C77669c(activity) : i == 2 ? new C77680e(activity) : new C77680e(activity);
                    C21216d0 d0Var4 = dVar.f60016a;
                    C22361f fVar3 = d0Var4.f59997b;
                    if (fVar3 != null) {
                        fVar3.mo35496e(d0Var4);
                    }
                }
                if (C76161o.m91464a(dVar.f60016a.f60001f)) {
                    dVar.f60016a.mo33206f();
                    C21216d0 d0Var5 = dVar.f60016a;
                    C22361f.C22362a aVar = d0Var5.f59998c;
                    if (aVar != null) {
                        aVar.mo21987a(d0Var5.f60001f);
                    }
                    ResultReceiver j = dVar.f60016a.mo33211j();
                    dVar.f60016a.mo33212k();
                    if (j != null) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("result_key_action", 5);
                        C13598b0 b0Var = C13598b0.f38549a;
                        j.send(0, bundle);
                    }
                }
                C21216d0 d0Var6 = dVar.f60016a;
                C22361f fVar4 = d0Var6.f59997b;
                if (fVar4 != null) {
                    fVar4.mo35493b(d0Var6.f60001f, d0Var6.mo33210i(), qVar);
                    return;
                }
                return;
            }
            C21220d dVar2 = d0Var.f60008m;
            int i3 = -1;
            int i4 = qVar != null ? qVar.f124108a : -1;
            if (qVar != null) {
                i3 = qVar.f124109b;
            }
            if (qVar != null) {
                str = qVar.f124110c;
            }
            if (str == null) {
                str = "";
            }
            dVar2.mo33217a(i4, i3, str);
        }

        /* renamed from: b */
        public void mo33216b(String str) {
            Log.m105925i("MicroMsg.OpenIMKefuConfirmController", "alvinluo onTryFetch username: %s", str);
        }
    }

    /* renamed from: je0.d0$d */
    public static final class C21220d {

        /* renamed from: a */
        public final /* synthetic */ C21216d0 f60016a;

        public C21220d(C21216d0 d0Var) {
            this.f60016a = d0Var;
        }

        /* renamed from: a */
        public void mo33217a(int i, int i2, String str) {
            C87412m.m108594g(str, "errMsg");
            C21216d0 d0Var = this.f60016a;
            d0Var.getClass();
            boolean z = true;
            if (i2 == -3601) {
                if (!(str.length() > 0)) {
                    str = d0Var.f59996a.getString(C0966R.string.hfb);
                    C87412m.m108593f(str, "{\n                contex…ct_deleted)\n            }");
                }
                String string = d0Var.f59996a.getString(C0966R.string.f8028zq);
                C87412m.m108593f(string, "context.getString(com.te…mmui.R.string.app_i_know)");
                C77398g y = C76879j.m92754y(d0Var.f59996a, "", str, string, new C21228f0(d0Var));
                if (y != null) {
                    y.setCancelable(false);
                }
                if (y != null) {
                    y.setCanceledOnTouchOutside(false);
                }
            } else {
                z = false;
            }
            if (!z) {
                C21231p0.m23721c(this.f60016a.mo33211j(), this.f60016a.mo33212k(), false, 2, "get contact failed");
                this.f60016a.mo33209h(2, "get contact failed");
            }
        }
    }

    /* renamed from: je0.d0$e */
    public static final class C21221e extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C21216d0 f60017d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21221e(C21216d0 d0Var) {
            super(0);
            this.f60017d = d0Var;
        }

        public Object invoke() {
            OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = this.f60017d.f59999d;
            return Integer.valueOf(openIMKefuStartConversationRequest != null ? openIMKefuStartConversationRequest.f108517f : -1);
        }
    }

    /* renamed from: je0.d0$g */
    public static final class C21222g extends C87413o implements C32224a<ResultReceiver> {

        /* renamed from: d */
        public final /* synthetic */ C21216d0 f60018d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21222g(C21216d0 d0Var) {
            super(0);
            this.f60018d = d0Var;
        }

        public Object invoke() {
            Intent intent = this.f60018d.f59996a.getIntent();
            if (intent != null) {
                return (ResultReceiver) intent.getParcelableExtra("key_result_receiver");
            }
            return null;
        }
    }

    /* renamed from: je0.d0$h */
    public static final class C21223h extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C21216d0 f60019d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21223h(C21216d0 d0Var) {
            super(0);
            this.f60019d = d0Var;
        }

        public Object invoke() {
            OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = this.f60019d.f59999d;
            return Long.valueOf(openIMKefuStartConversationRequest != null ? openIMKefuStartConversationRequest.f108516e : 0);
        }
    }

    /* renamed from: je0.d0$i */
    public static final class C21224i extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C21216d0 f60020d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21224i(C21216d0 d0Var) {
            super(0);
            this.f60020d = d0Var;
        }

        public Object invoke() {
            OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = this.f60020d.f59999d;
            return Boolean.valueOf(openIMKefuStartConversationRequest != null ? openIMKefuStartConversationRequest.f108522n : false);
        }
    }

    /* renamed from: je0.d0$j */
    public static final class C21225j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C21216d0 f60021d;

        public C21225j(C21216d0 d0Var) {
            this.f60021d = d0Var;
        }

        public final void run() {
            if (((String) ((C36570n) this.f60021d.f60012q).getValue()).length() > 0) {
                C21216d0 d0Var = this.f60021d;
                C76701a.makeText((Context) d0Var.f59996a, (CharSequence) (String) ((C36570n) d0Var.f60012q).getValue(), 0).show();
                return;
            }
            Activity activity = this.f60021d.f59996a;
            C76701a.makeText((Context) activity, (CharSequence) activity.getString(C0966R.string.hfa), 0).show();
        }
    }

    /* renamed from: je0.d0$f */
    public static final class C21226f implements C40324j.C40326a {

        /* renamed from: a */
        public final /* synthetic */ C15601d<C13604l<Integer, String>> f60022a;

        public C21226f(C15601d<? super C13604l<Integer, String>> dVar) {
            this.f60022a = dVar;
        }

        /* renamed from: a */
        public final void mo288a(int i, int i2, String str, C47350c cVar) {
            Log.m105925i("MicroMsg.OpenIMKefuConfirmController", "checkAppBrandBindState errType:%d, errCode:%d, errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i == 0 && i2 == 0) {
                if ((cVar != null ? cVar.f127056b.f127083a : null) instanceof C51147rs) {
                    C47465a aVar = cVar.f127056b.f127083a;
                    C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CheckAppCustomerServiceBindResponse");
                    C51147rs rsVar = (C51147rs) aVar;
                    Log.m105925i("MicroMsg.OpenIMKefuConfirmController", "checkAppBrandBindState bindState: %s", Integer.valueOf(rsVar.f141109d));
                    if (rsVar.f141109d == 1) {
                        C15601d<C13604l<Integer, String>> dVar = this.f60022a;
                        Result.Companion companion = Result.Companion;
                        dVar.resumeWith(Result.m168114constructorimpl(new C13604l(0, "")));
                        return;
                    }
                    C15601d<C13604l<Integer, String>> dVar2 = this.f60022a;
                    Result.Companion companion2 = Result.Companion;
                    dVar2.resumeWith(Result.m168114constructorimpl(new C13604l(6, "not bind")));
                    return;
                }
                return;
            }
            C15601d<C13604l<Integer, String>> dVar3 = this.f60022a;
            Result.Companion companion3 = Result.Companion;
            dVar3.resumeWith(Result.m168114constructorimpl(new C13604l(6, "check failed")));
        }
    }

    public C21216d0(Activity activity) {
        C87412m.m108594g(activity, "context");
        this.f59996a = activity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        r6 = r6.f108529u;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0054 A[Catch:{ Exception -> 0x0072 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0062 A[Catch:{ Exception -> 0x0072 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m23702e(je0.C21216d0 r5, wx3.C15601d r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof je0.C21215c0
            if (r0 == 0) goto L_0x0016
            r0 = r6
            je0.c0 r0 = (je0.C21215c0) r0
            int r1 = r0.f59995f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f59995f = r1
            goto L_0x001b
        L_0x0016:
            je0.c0 r0 = new je0.c0
            r0.<init>(r5, r6)
        L_0x001b:
            java.lang.Object r6 = r0.f59993d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f59995f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            kotlin.ResultKt.throwOnFailure(r6)     // Catch:{ Exception -> 0x0072 }
            goto L_0x0070
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r6)
            com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest r6 = r5.f59999d     // Catch:{ Exception -> 0x0072 }
            if (r6 == 0) goto L_0x0045
            android.content.Intent r6 = r6.f108529u     // Catch:{ Exception -> 0x0072 }
            if (r6 == 0) goto L_0x0045
            java.lang.String r2 = "key_appbrand_check_bind_info"
            java.lang.String r6 = r6.getStringExtra(r2)     // Catch:{ Exception -> 0x0072 }
            goto L_0x0046
        L_0x0045:
            r6 = 0
        L_0x0046:
            if (r6 == 0) goto L_0x0051
            int r2 = r6.length()     // Catch:{ Exception -> 0x0072 }
            if (r2 != 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r2 = 0
            goto L_0x0052
        L_0x0051:
            r2 = 1
        L_0x0052:
            if (r2 == 0) goto L_0x0062
            rx3.l r1 = new rx3.l     // Catch:{ Exception -> 0x0072 }
            r5 = 5
            java.lang.Integer r6 = new java.lang.Integer     // Catch:{ Exception -> 0x0072 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r5 = "request invalid"
            r1.<init>(r6, r5)     // Catch:{ Exception -> 0x0072 }
            goto L_0x0089
        L_0x0062:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0072 }
            r2.<init>(r6)     // Catch:{ Exception -> 0x0072 }
            r0.f59995f = r3     // Catch:{ Exception -> 0x0072 }
            java.lang.Object r6 = r5.mo33213l(r2, r0)     // Catch:{ Exception -> 0x0072 }
            if (r6 != r1) goto L_0x0070
            goto L_0x0089
        L_0x0070:
            r1 = r6
            goto L_0x0089
        L_0x0072:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r0 = "MicroMsg.OpenIMKefuConfirmController"
            java.lang.String r1 = "checkAppBrandBindState exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r5, r1, r6)
            rx3.l r1 = new rx3.l
            r5 = 6
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            java.lang.String r5 = "check failed"
            r1.<init>(r6, r5)
        L_0x0089:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: je0.C21216d0.m23702e(je0.d0, wx3.d):java.lang.Object");
    }

    /* renamed from: a */
    public boolean mo33201a() {
        boolean z = C76161o.m91464a(this.f60001f) && this.f60007l;
        Log.m105925i("MicroMsg.OpenIMKefuConfirmController", "alvinluo finishWhenCancel: %s", Boolean.valueOf(z));
        return !z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0091 A[Catch:{ Exception -> 0x00df }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo33202b(int r11) {
        /*
            r10 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "MicroMsg.OpenIMKefuConfirmController"
            java.lang.String r4 = "alvinluo confirm confirmType: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
            r10.f60006k = r3
            se0.f r1 = r10.f59997b
            if (r1 == 0) goto L_0x001a
            r1.mo35492a()
        L_0x001a:
            r1 = 2
            r11 = r11 & r1
            if (r11 == 0) goto L_0x0020
            r11 = 1
            goto L_0x0021
        L_0x0020:
            r11 = 0
        L_0x0021:
            if (r11 == 0) goto L_0x010a
            qo3.i0 r11 = r10.f60009n
            if (r11 == 0) goto L_0x002f
            boolean r11 = r11.isShowing()
            if (r11 != r0) goto L_0x002f
            r11 = 1
            goto L_0x0030
        L_0x002f:
            r11 = 0
        L_0x0030:
            if (r11 != 0) goto L_0x004a
            android.app.Activity r4 = r10.f59996a
            r11 = 2131821739(0x7f1104ab, float:1.927623E38)
            java.lang.String r6 = r4.getString(r11)
            r7 = 0
            r8 = 1
            je0.a0 r9 = new je0.a0
            r9.<init>(r10)
            java.lang.String r5 = ""
            qo3.i0 r11 = nj3.C76879j.m92723Q(r4, r5, r6, r7, r8, r9)
            r10.f60009n = r11
        L_0x004a:
            he0.r r11 = new he0.r
            he0.f r4 = r10.f60000e
            r5 = 0
            if (r4 == 0) goto L_0x0056
            java.lang.String r4 = r4.getUsername()
            goto L_0x0057
        L_0x0056:
            r4 = r5
        L_0x0057:
            java.lang.String r6 = ""
            if (r4 != 0) goto L_0x005c
            r4 = r6
        L_0x005c:
            r11.<init>(r4)
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest r7 = r10.f59999d     // Catch:{ Exception -> 0x00df }
            if (r7 == 0) goto L_0x006b
            te3.s3 r8 = r7.f108520i     // Catch:{ Exception -> 0x00df }
            goto L_0x006c
        L_0x006b:
            r8 = r5
        L_0x006c:
            if (r8 == 0) goto L_0x00e7
            if (r7 == 0) goto L_0x0076
            boolean r7 = r7.f108527s     // Catch:{ Exception -> 0x00df }
            if (r7 != r0) goto L_0x0076
            r7 = 1
            goto L_0x0077
        L_0x0076:
            r7 = 0
        L_0x0077:
            if (r7 == 0) goto L_0x00e7
            he0.f r7 = r10.f60000e     // Catch:{ Exception -> 0x00df }
            if (r7 == 0) goto L_0x0082
            java.lang.String r7 = r7.mo71440K()     // Catch:{ Exception -> 0x00df }
            goto L_0x0083
        L_0x0082:
            r7 = r5
        L_0x0083:
            if (r7 == 0) goto L_0x008e
            int r7 = r7.length()     // Catch:{ Exception -> 0x00df }
            if (r7 != 0) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            r7 = 0
            goto L_0x008f
        L_0x008e:
            r7 = 1
        L_0x008f:
            if (r7 != 0) goto L_0x00cb
            java.lang.String r7 = "alvinluo addKefuConversation updateTicket old: %s, new: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x00df }
            com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest r8 = r10.f59999d     // Catch:{ Exception -> 0x00df }
            if (r8 == 0) goto L_0x00a0
            te3.s3 r8 = r8.f108520i     // Catch:{ Exception -> 0x00df }
            if (r8 == 0) goto L_0x00a0
            java.lang.String r8 = r8.f141287f     // Catch:{ Exception -> 0x00df }
            goto L_0x00a1
        L_0x00a0:
            r8 = r5
        L_0x00a1:
            r1[r3] = r8     // Catch:{ Exception -> 0x00df }
            he0.f r8 = r10.f60000e     // Catch:{ Exception -> 0x00df }
            if (r8 == 0) goto L_0x00ac
            java.lang.String r8 = r8.mo71440K()     // Catch:{ Exception -> 0x00df }
            goto L_0x00ad
        L_0x00ac:
            r8 = r5
        L_0x00ad:
            r1[r0] = r8     // Catch:{ Exception -> 0x00df }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r7, r1)     // Catch:{ Exception -> 0x00df }
            com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest r1 = r10.f59999d     // Catch:{ Exception -> 0x00df }
            if (r1 == 0) goto L_0x00b9
            te3.s3 r1 = r1.f108520i     // Catch:{ Exception -> 0x00df }
            goto L_0x00ba
        L_0x00b9:
            r1 = r5
        L_0x00ba:
            if (r1 != 0) goto L_0x00bd
            goto L_0x00cb
        L_0x00bd:
            he0.f r7 = r10.f60000e     // Catch:{ Exception -> 0x00df }
            if (r7 == 0) goto L_0x00c9
            java.lang.String r7 = r7.mo71440K()     // Catch:{ Exception -> 0x00df }
            if (r7 != 0) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            r6 = r7
        L_0x00c9:
            r1.f141287f = r6     // Catch:{ Exception -> 0x00df }
        L_0x00cb:
            java.lang.String r1 = "key_add_contact_context"
            com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest r6 = r10.f59999d     // Catch:{ Exception -> 0x00df }
            gy3.C87412m.m108591d(r6)     // Catch:{ Exception -> 0x00df }
            te3.s3 r6 = r6.f108520i     // Catch:{ Exception -> 0x00df }
            gy3.C87412m.m108591d(r6)     // Catch:{ Exception -> 0x00df }
            byte[] r6 = r6.toByteArray()     // Catch:{ Exception -> 0x00df }
            r4.putByteArray(r1, r6)     // Catch:{ Exception -> 0x00df }
            goto L_0x00e7
        L_0x00df:
            r1 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r6 = "alvinluo addKefuConversation exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r1, r6, r3)
        L_0x00e7:
            r11.f124116c = r4
            je0.b0 r1 = new je0.b0
            r1.<init>(r10)
            r11.f124117d = r1
            android.content.Intent r1 = r10.f60010o
            if (r1 == 0) goto L_0x00fa
            java.lang.String r2 = "key_spam_context"
            byte[] r5 = r1.getByteArrayExtra(r2)
        L_0x00fa:
            r11.f124118e = r5
            r10.f60007l = r0
            java.lang.Class<he0.h> r0 = he0.C46021h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            he0.h r0 = (he0.C46021h) r0
            r0.Cn0(r11)
            goto L_0x0120
        L_0x010a:
            r10.f60007l = r3
            boolean r11 = r10.f60006k
            if (r11 == 0) goto L_0x0111
            goto L_0x0120
        L_0x0111:
            r10.mo33206f()
            zt3.t r11 = zt3.C119157j.f356862d
            je0.e0 r0 = new je0.e0
            r0.<init>(r10)
            zt3.j r11 = (zt3.C119157j) r11
            r11.mo183895z(r0)
        L_0x0120:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je0.C21216d0.mo33202b(int):void");
    }

    /* renamed from: c */
    public void mo33203c(int i, int i2, Intent intent) {
        Object[] objArr = new Object[2];
        boolean z = false;
        objArr[0] = Integer.valueOf(i);
        if (intent == null) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.OpenIMKefuConfirmController", "alvinluo finishUI resultCode: %d, data == null: %b", objArr);
        if (!(i2 == 0 || i2 == 3 || i2 == 7)) {
            mo33214m();
        }
        this.f59996a.setResult(i, intent);
        this.f59996a.finish();
        mo33206f();
        C22361f fVar = this.f59997b;
        if (fVar != null) {
            fVar.release();
        }
        this.f59997b = null;
    }

    public void cancel() {
        Log.m105925i("MicroMsg.OpenIMKefuConfirmController", "alvinluo cancelConfirmPage confirmPageType: %s, confirmType: %s", Integer.valueOf(mo33210i()), Integer.valueOf(this.f60001f));
        this.f60006k = true;
        ResultReceiver j = mo33211j();
        mo33212k();
        if (j != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("result_key_err_code", 3);
            bundle.putString("result_key_err_msg", "user cancel");
            bundle.putInt("result_key_action", 6);
            C13598b0 b0Var = C13598b0.f38549a;
            j.send(3, bundle);
        }
        C22361f fVar = this.f59997b;
        if (fVar == null) {
            mo33209h(3, "user cancel");
        } else if (fVar != null) {
            fVar.mo35497f();
        }
    }

    /* renamed from: d */
    public boolean mo33205d() {
        OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = this.f59999d;
        if (!(openIMKefuStartConversationRequest != null && openIMKefuStartConversationRequest.f108517f == 1)) {
            if (!(openIMKefuStartConversationRequest != null && openIMKefuStartConversationRequest.f108517f == 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void mo33206f() {
        C89779i0 i0Var;
        C89779i0 i0Var2 = this.f60009n;
        boolean z = true;
        if (i0Var2 == null || !i0Var2.isShowing()) {
            z = false;
        }
        if (z && (i0Var = this.f60009n) != null) {
            i0Var.dismiss();
        }
    }

    /* renamed from: g */
    public final void mo33207g(OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest) {
        int i = openIMKefuStartConversationRequest.f108517f;
        C51195s3 s3Var = openIMKefuStartConversationRequest.f108520i;
        byte[] bArr = null;
        String str = s3Var != null ? s3Var.f141289h : null;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = s3Var != null ? s3Var.f141285d : null;
        if (str3 != null) {
            str2 = str3;
        }
        C46026p pVar = new C46026p(i, str, str2);
        pVar.f124105e = true;
        Intent intent = this.f60010o;
        if (intent != null) {
            bArr = intent.getByteArrayExtra("key_spam_context");
        }
        pVar.f124106f = bArr;
        ((C46021h) C86312j.m106911c(C46021h.class)).R40(pVar, new C21219c(this));
    }

    public int getScene() {
        OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = this.f59999d;
        if (openIMKefuStartConversationRequest != null) {
            return openIMKefuStartConversationRequest.f108517f;
        }
        return -1;
    }

    /* renamed from: h */
    public final void mo33209h(int i, String str) {
        Log.m105921e("MicroMsg.OpenIMKefuConfirmController", "alvinluo finishUI errCode: %s, errMsg: %s", Integer.valueOf(i), str);
        Intent intent = new Intent();
        intent.putExtra("key_result_err_code", i);
        intent.putExtra("key_result_err_msg", str);
        C13598b0 b0Var = C13598b0.f38549a;
        mo33203c(-1, i, intent);
    }

    /* renamed from: i */
    public final int mo33210i() {
        return ((Number) ((C36570n) this.f60002g).getValue()).intValue();
    }

    /* renamed from: j */
    public final ResultReceiver mo33211j() {
        return (ResultReceiver) ((C36570n) this.f60005j).getValue();
    }

    /* renamed from: k */
    public final long mo33212k() {
        return ((Number) ((C36570n) this.f60004i).getValue()).longValue();
    }

    /* renamed from: l */
    public final Object mo33213l(JSONObject jSONObject, C15601d<? super C13604l<Integer, String>> dVar) {
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        Log.m105924i("MicroMsg.OpenIMKefuConfirmController", "checkAppBrandBindState data: " + jSONObject);
        JSONObject jSONObject2 = new JSONObject(jSONObject.optString("extInfo"));
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 6803;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxabusiness/checkappcustomerservicebind";
        C51004qs qsVar = new C51004qs();
        qsVar.f140516f = jSONObject2.optString("url");
        qsVar.f140514d = jSONObject.optString("appId");
        qsVar.f140515e = jSONObject.optString("corpId");
        bVar.f127066a = qsVar;
        bVar.f127067b = new C51147rs();
        IPCRunCgi.m98794a(bVar.mo72403a(), new C21226f(hVar));
        return hVar.mo90314b();
    }

    /* renamed from: m */
    public final void mo33214m() {
        if (((Boolean) ((C36570n) this.f60011p).getValue()).booleanValue()) {
            ((C119157j) C119157j.f356862d).mo183895z(new C21225j(this));
        }
    }
}
