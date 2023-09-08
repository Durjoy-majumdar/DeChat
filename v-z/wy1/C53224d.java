package wy1;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import az1.C39669d;
import bz1.C0404k;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.GameLifeSessionStruct;
import com.tencent.p014mm.game.report.C40306c;
import com.tencent.p014mm.game.report.service.C40315a;
import com.tencent.p014mm.p136ui.C45109x3;
import com.tencent.p014mm.p136ui.C45110y3;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.FileReaderHelper;
import com.tencent.xweb.util.WXWebReporter;
import cz1.C45230i;
import cz1.C7143c;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import fz1.C32241f;
import fz1.C75820g;
import gy3.C8477a0;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import iz1.C33484f;
import java.net.URLEncoder;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import js0.C9514m;
import ke3.C88144b;
import lu3.C34379c;
import nr3.C89060f;
import org.json.JSONObject;
import p910lj.C76701a;
import pe3.C89349b;
import qo3.C101218e0;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import sw1.C48478n;
import sx3.C64197v;
import sx3.C90364q0;
import wy1.C53221c;
import xy1.C15912f;
import xy1.C15913g;
import xy1.C53472h;
import xy1.C53474j;
import xy1.C53475k;
import xy1.C79011i;
import zh3.C91753f;
import zt3.C119157j;
import zt3.C119179t;

@C86522b
/* renamed from: wy1.d */
public final class C53224d extends C86301e implements C53221c {

    /* renamed from: d */
    public C91753f f148475d;

    /* renamed from: e */
    public String f148476e;

    /* renamed from: f */
    public final C13601g f148477f = C36568h.m40985a(C15609a.f42232d);

    /* renamed from: g */
    public C0404k f148478g;

    /* renamed from: h */
    public C33484f f148479h;

    /* renamed from: i */
    public C45230i f148480i;

    /* renamed from: j */
    public C75820g f148481j;

    /* renamed from: n */
    public C32241f f148482n;

    /* renamed from: o */
    public Boolean f148483o;

    /* renamed from: p */
    public final MStorage.IOnStorageChange f148484p;

    /* renamed from: wy1.d$a */
    public static final class C15609a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C15609a f42232d = new C15609a();

        public C15609a() {
            super(0);
        }

        public Object invoke() {
            return C86709a0.m107535s().f251806d + "gamelife/avatar/";
        }
    }

    /* renamed from: wy1.d$d */
    public static final class C15610d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C89779i0> f42233d;

        /* renamed from: e */
        public final /* synthetic */ Context f42234e;

        /* renamed from: wy1.d$d$a */
        public static final class C15611a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public static final C15611a f42235d = new C15611a();

            public final void onCancel(DialogInterface dialogInterface) {
            }
        }

        public C15610d(C8479f0<C89779i0> f0Var, Context context) {
            this.f42233d = f0Var;
            this.f42234e = context;
        }

        public final void run() {
            C8479f0<C89779i0> f0Var = this.f42233d;
            Context context = this.f42234e;
            f0Var.f27484d = C89779i0.m112248e(context, context.getResources().getString(C0966R.string.a4d), false, 0, C15611a.f42235d);
        }
    }

    /* renamed from: wy1.d$b */
    public static final class C53225b implements C15913g.C15914a {

        /* renamed from: a */
        public final /* synthetic */ C9514m<Boolean> f148485a;

        /* renamed from: b */
        public final /* synthetic */ C9514m<Boolean> f148486b;

        /* renamed from: c */
        public final /* synthetic */ String f148487c;

        /* renamed from: d */
        public final /* synthetic */ ProgressDialog f148488d;

        /* renamed from: e */
        public final /* synthetic */ C53224d f148489e;

        /* renamed from: f */
        public final /* synthetic */ Context f148490f;

        /* renamed from: g */
        public final /* synthetic */ int f148491g;

        /* renamed from: h */
        public final /* synthetic */ C53221c.C53223b f148492h;

        /* renamed from: i */
        public final /* synthetic */ C53474j f148493i;

        public C53225b(C9514m<Boolean> mVar, C9514m<Boolean> mVar2, String str, ProgressDialog progressDialog, C53224d dVar, Context context, int i, C53221c.C53223b bVar, C53474j jVar) {
            this.f148485a = mVar;
            this.f148486b = mVar2;
            this.f148487c = str;
            this.f148488d = progressDialog;
            this.f148489e = dVar;
            this.f148490f = context;
            this.f148491g = i;
            this.f148492h = bVar;
            this.f148493i = jVar;
        }

        /* renamed from: a */
        public void mo14560a(boolean z, boolean z2) {
            this.f148485a.f29691a = Boolean.valueOf(z2);
            this.f148486b.f29691a = Boolean.valueOf(z);
            Log.m105925i("GameLife.PluginGameLife", "isBlackListAssociateWithWAGame userName:%s,isAssociate:%b,isOwnBlack:%b", this.f148487c, Boolean.valueOf(z), Boolean.valueOf(z2));
            ProgressDialog progressDialog = this.f148488d;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f148488d.dismiss();
                C53224d dVar = this.f148489e;
                Context context = this.f148490f;
                String str = this.f148487c;
                C87412m.m108593f(str, "userName");
                int i = this.f148491g;
                C9514m<Boolean> mVar = this.f148485a;
                C9514m<Boolean> mVar2 = this.f148486b;
                C53221c.C53223b bVar = this.f148492h;
                C53474j jVar = this.f148493i;
                C87412m.m108593f(jVar, "sessionInfo");
                dVar.Gx0(context, str, i, mVar, mVar2, bVar, jVar);
            }
        }
    }

    /* renamed from: wy1.d$c */
    public static final class C53226c extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C34379c<?> f148494d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<C89779i0> f148495e;

        /* renamed from: f */
        public final /* synthetic */ String f148496f;

        /* renamed from: g */
        public final /* synthetic */ String f148497g;

        /* renamed from: h */
        public final /* synthetic */ Context f148498h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53226c(C34379c<?> cVar, C8479f0<C89779i0> f0Var, String str, String str2, Context context) {
            super(1);
            this.f148494d = cVar;
            this.f148495e = f0Var;
            this.f148496f = str;
            this.f148497g = str2;
            this.f148498h = context;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            boolean z = false;
            this.f148494d.cancel(false);
            C89779i0 i0Var = (C89779i0) this.f148495e.f27484d;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            if (str == null || str.length() == 0) {
                z = true;
            }
            if (!z) {
                Log.m105924i("GameLife.PluginGameLife", "[startChattingUI] sessionId=" + str);
                C40306c.f108374a.mo62987d(this.f148496f);
                Intent intent = new Intent();
                String str2 = this.f148497g;
                Context context = this.f148498h;
                intent.putExtra("Chat_Self", str2);
                intent.putExtra("Chat_User", str);
                intent.putExtra("finish_direct", true);
                C88144b.m109801s(context, ".ui.chatting.ChattingUI", intent, (Bundle) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wy1.d$e */
    public static final class C53227e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C53224d f148499d;

        public C53227e(C53224d dVar) {
            this.f148499d = dVar;
        }

        public final void run() {
            C53224d.vx0(this.f148499d);
        }
    }

    /* renamed from: wy1.d$f */
    public static final class C53228f extends C87413o implements C32224a<C39669d> {

        /* renamed from: d */
        public static final C53228f f148500d = new C53228f();

        public C53228f() {
            super(0);
        }

        public Object invoke() {
            return new C39669d();
        }
    }

    /* renamed from: wy1.d$g */
    public static final class C53229g<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ String f148501a;

        /* renamed from: b */
        public final /* synthetic */ String f148502b;

        /* renamed from: c */
        public final /* synthetic */ String f148503c;

        /* renamed from: d */
        public final /* synthetic */ int f148504d;

        /* renamed from: e */
        public final /* synthetic */ long f148505e;

        /* renamed from: f */
        public final /* synthetic */ String f148506f;

        public C53229g(String str, String str2, String str3, int i, long j, String str4) {
            this.f148501a = str;
            this.f148502b = str2;
            this.f148503c = str3;
            this.f148504d = i;
            this.f148505e = j;
            this.f148506f = str4;
        }

        public Object call(Object obj) {
            Void voidR = (Void) obj;
            Class cls = C15913g.class;
            C15912f X3 = ((C15913g) C86312j.m106911c(cls)).mo440X3(this.f148501a);
            if (this.f148502b == null || this.f148503c == null) {
                C40306c.f108374a.mo62986c(this.f148504d, this.f148505e, "", (long) X3.mo422D0(), this.f148501a, 0, "", this.f148506f);
                return null;
            }
            C15912f X32 = ((C15913g) C86312j.m106911c(cls)).mo440X3(this.f148503c);
            if (X32 == null) {
                return null;
            }
            C40306c.f108374a.mo62986c(this.f148504d, this.f148505e, this.f148502b, (long) X3.mo422D0(), this.f148501a, (long) X32.mo422D0(), this.f148503c, this.f148506f);
            return null;
        }
    }

    /* renamed from: wy1.d$h */
    public static final class C53230h<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ String f148507a;

        /* renamed from: b */
        public final /* synthetic */ String f148508b;

        /* renamed from: c */
        public final /* synthetic */ Integer f148509c;

        /* renamed from: d */
        public final /* synthetic */ Boolean f148510d;

        /* renamed from: e */
        public final /* synthetic */ Boolean f148511e;

        /* renamed from: f */
        public final /* synthetic */ int f148512f;

        /* renamed from: g */
        public final /* synthetic */ long f148513g;

        /* renamed from: h */
        public final /* synthetic */ String f148514h;

        public C53230h(String str, String str2, Integer num, Boolean bool, Boolean bool2, int i, long j, String str3) {
            this.f148507a = str;
            this.f148508b = str2;
            this.f148509c = num;
            this.f148510d = bool;
            this.f148511e = bool2;
            this.f148512f = i;
            this.f148513g = j;
            this.f148514h = str3;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
            if (r3.intValue() != 2) goto L_0x0057;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r17) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                java.lang.Void r1 = (java.lang.Void) r1
                java.lang.Class<xy1.g> r1 = xy1.C15913g.class
                di3.d r2 = di3.C86312j.m106911c(r1)
                xy1.g r2 = (xy1.C15913g) r2
                java.lang.String r3 = r0.f148507a
                xy1.f r2 = r2.mo440X3(r3)
                di3.d r1 = di3.C86312j.m106911c(r1)
                xy1.g r1 = (xy1.C15913g) r1
                java.lang.String r3 = r0.f148508b
                xy1.f r1 = r1.mo440X3(r3)
                java.lang.Integer r3 = r0.f148509c
                r4 = 1
                r5 = 2
                java.lang.String r6 = ""
                if (r3 != 0) goto L_0x0029
                goto L_0x004b
            L_0x0029:
                int r3 = r3.intValue()
                if (r3 != r4) goto L_0x004b
                java.lang.Boolean r3 = r0.f148510d
                if (r3 == 0) goto L_0x0057
                boolean r3 = r3.booleanValue()
                if (r3 == 0) goto L_0x0049
                java.lang.Boolean r3 = r0.f148511e
                if (r3 == 0) goto L_0x0057
                boolean r3 = r3.booleanValue()
                if (r3 == 0) goto L_0x0047
                r5 = 3
                java.lang.String r6 = "1"
                goto L_0x0058
            L_0x0047:
                java.lang.String r6 = "0"
            L_0x0049:
                r5 = 1
                goto L_0x0058
            L_0x004b:
                java.lang.Integer r3 = r0.f148509c
                if (r3 != 0) goto L_0x0050
                goto L_0x0057
            L_0x0050:
                int r3 = r3.intValue()
                if (r3 != r5) goto L_0x0057
                goto L_0x0058
            L_0x0057:
                r5 = 0
            L_0x0058:
                int r3 = r0.f148512f
                long r7 = r0.f148513g
                java.lang.String r9 = r0.f148514h
                int r2 = r2.mo422D0()
                long r10 = (long) r2
                java.lang.String r2 = r0.f148507a
                int r1 = r1.mo422D0()
                long r12 = (long) r1
                java.lang.String r1 = r0.f148508b
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.String r14 = "sessionId"
                gy3.C87412m.m108594g(r9, r14)
                java.lang.String r14 = "fromUsername"
                gy3.C87412m.m108594g(r2, r14)
                java.lang.String r14 = "toUsername"
                gy3.C87412m.m108594g(r1, r14)
                long r14 = (long) r3
                r3 = r5
                r4 = 4
                com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct
                r0.<init>()
                r0.f107922d = r4
                r4 = 401(0x191, double:1.98E-321)
                r0.f107923e = r4
                r0.f107924f = r14
                r0.f107925g = r7
                r0.f107926h = r4
                java.lang.String r4 = "SessionId"
                r5 = 1
                java.lang.String r4 = r0.mo86045b(r4, r9, r5)
                r0.f107934p = r4
                r0.f107929k = r10
                java.lang.String r4 = "from_username"
                java.lang.String r2 = r0.mo86045b(r4, r2, r5)
                r0.f107930l = r2
                r0.f107931m = r12
                java.lang.String r2 = "to_username"
                java.lang.String r1 = r0.mo86045b(r2, r1, r5)
                r0.f107932n = r1
                java.lang.String r1 = "ActionStatus"
                java.lang.String r1 = r0.mo86045b(r1, r6, r5)
                r0.f107928j = r1
                if (r3 == 0) goto L_0x00da
                int r1 = r3.intValue()
                if (r1 == 0) goto L_0x00da
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                int r2 = r3.intValue()
                java.lang.String r3 = "role"
                r1.put(r3, r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r1 = java.net.URLEncoder.encode(r1)
                r0.mo62729s(r1)
            L_0x00da:
                r0.mo86054n()
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: wy1.C53224d.C53230h.call(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: wy1.d$i */
    public static final class C53231i implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ C9514m<Boolean> f148515a;

        public C53231i(C9514m<Boolean> mVar) {
            this.f148515a = mVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f148515a.f29691a = Boolean.valueOf(z);
        }
    }

    /* renamed from: wy1.d$j */
    public static final class C53232j implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ C53221c.C53223b f148516a;

        /* renamed from: b */
        public final /* synthetic */ C9514m<Boolean> f148517b;

        /* renamed from: c */
        public final /* synthetic */ C101218e0 f148518c;

        /* renamed from: d */
        public final /* synthetic */ C9514m<Boolean> f148519d;

        /* renamed from: e */
        public final /* synthetic */ C9514m<Boolean> f148520e;

        /* renamed from: f */
        public final /* synthetic */ C53224d f148521f;

        /* renamed from: g */
        public final /* synthetic */ C53474j f148522g;

        /* renamed from: h */
        public final /* synthetic */ int f148523h;

        public C53232j(C53221c.C53223b bVar, C9514m<Boolean> mVar, C101218e0 e0Var, C9514m<Boolean> mVar2, C9514m<Boolean> mVar3, C53224d dVar, C53474j jVar, int i) {
            this.f148516a = bVar;
            this.f148517b = mVar;
            this.f148518c = e0Var;
            this.f148519d = mVar2;
            this.f148520e = mVar3;
            this.f148521f = dVar;
            this.f148522g = jVar;
            this.f148523h = i;
        }

        /* renamed from: a */
        public final void mo2001a() {
            C53221c.C53223b bVar = this.f148516a;
            if (bVar != null) {
                T t = this.f148517b.f29691a;
                C87412m.m108593f(t, "isBlackList.value");
                C45110y3 y3Var = (C45110y3) bVar;
                y3Var.f122379a.runOnUiThread(new C45109x3(y3Var, ((Boolean) t).booleanValue()));
            }
            this.f148518c.mo140680z();
            C9514m<Boolean> mVar = this.f148519d;
            boolean z = false;
            if (mVar != null) {
                T t2 = mVar.f29691a;
                C87412m.m108593f(t2, "isAssociateWithWAGame.value");
                if (((Boolean) t2).booleanValue()) {
                    T t3 = this.f148520e.f29691a;
                    C87412m.m108593f(t3, "dealWaGameAccountTogetherCheckBox.value");
                    if (((Boolean) t3).booleanValue()) {
                        z = true;
                    }
                }
            } else {
                Log.m105920e("GameLife.PluginGameLife", "setBlackListAssociateWithWAGame addBlackList isAssociateWithWAGame null hideDialog");
            }
            C53224d dVar = this.f148521f;
            String sessionId = this.f148522g.getSessionId();
            C87412m.m108593f(sessionId, "sessionInfo.sessionId");
            String t1 = this.f148522g.mo59158t1();
            C87412m.m108593f(t1, "sessionInfo.selfUsername");
            String t4 = this.f148522g.mo59157t();
            C87412m.m108593f(t4, "sessionInfo.talker");
            dVar.Ex0(7, 4, sessionId, t1, t4, Boolean.valueOf(z), Integer.valueOf(this.f148523h), (Boolean) this.f148519d.f29691a);
        }
    }

    /* renamed from: wy1.d$k */
    public static final class C53233k implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ C101218e0 f148524a;

        /* renamed from: b */
        public final /* synthetic */ C9514m<Boolean> f148525b;

        /* renamed from: c */
        public final /* synthetic */ C9514m<Boolean> f148526c;

        /* renamed from: d */
        public final /* synthetic */ String f148527d;

        /* renamed from: e */
        public final /* synthetic */ C53224d f148528e;

        /* renamed from: f */
        public final /* synthetic */ C53474j f148529f;

        /* renamed from: g */
        public final /* synthetic */ int f148530g;

        /* renamed from: h */
        public final /* synthetic */ C9514m<Boolean> f148531h;

        /* renamed from: i */
        public final /* synthetic */ Context f148532i;

        /* renamed from: j */
        public final /* synthetic */ C53221c.C53223b f148533j;

        /* renamed from: wy1.d$k$a */
        public static final class C53234a implements C15913g.C15915b {

            /* renamed from: a */
            public final /* synthetic */ String f148534a;

            /* renamed from: b */
            public final /* synthetic */ C8477a0 f148535b;

            /* renamed from: c */
            public final /* synthetic */ C9514m<Boolean> f148536c;

            /* renamed from: d */
            public final /* synthetic */ Context f148537d;

            /* renamed from: e */
            public final /* synthetic */ C53221c.C53223b f148538e;

            public C53234a(String str, C8477a0 a0Var, C9514m<Boolean> mVar, Context context, C53221c.C53223b bVar) {
                this.f148534a = str;
                this.f148535b = a0Var;
                this.f148536c = mVar;
                this.f148537d = context;
                this.f148538e = bVar;
            }

            /* renamed from: a */
            public final void mo5406a(boolean z) {
                Log.m105925i("GameLife.PluginGameLife", "setBlackListAssociateWithWAGame removeBlackList userName:%s isSuccess:%b, dealWaGameTogether:%b", this.f148534a, Boolean.valueOf(z), Boolean.valueOf(this.f148535b.f27482d));
                if (z) {
                    C9514m<Boolean> mVar = this.f148536c;
                    mVar.f29691a = Boolean.valueOf(!((Boolean) mVar.f29691a).booleanValue());
                } else {
                    C76701a.makeText(this.f148537d, (int) C0966R.string.fd6, 0).show();
                }
                C53221c.C53223b bVar = this.f148538e;
                T t = this.f148536c.f29691a;
                C87412m.m108593f(t, "isBlackList.value");
                C45110y3 y3Var = (C45110y3) bVar;
                y3Var.f122379a.runOnUiThread(new C45109x3(y3Var, ((Boolean) t).booleanValue()));
            }
        }

        public C53233k(C101218e0 e0Var, C9514m<Boolean> mVar, C9514m<Boolean> mVar2, String str, C53224d dVar, C53474j jVar, int i, C9514m<Boolean> mVar3, Context context, C53221c.C53223b bVar) {
            this.f148524a = e0Var;
            this.f148525b = mVar;
            this.f148526c = mVar2;
            this.f148527d = str;
            this.f148528e = dVar;
            this.f148529f = jVar;
            this.f148530g = i;
            this.f148531h = mVar3;
            this.f148532i = context;
            this.f148533j = bVar;
        }

        /* renamed from: a */
        public final void mo2001a() {
            boolean z;
            this.f148524a.mo140680z();
            C8477a0 a0Var = new C8477a0();
            C9514m<Boolean> mVar = this.f148525b;
            if (mVar != null) {
                T t = mVar.f29691a;
                C87412m.m108593f(t, "isAssociateWithWAGame.value");
                if (((Boolean) t).booleanValue()) {
                    T t2 = this.f148526c.f29691a;
                    C87412m.m108593f(t2, "dealWaGameAccountTogetherCheckBox.value");
                    if (((Boolean) t2).booleanValue()) {
                        z = true;
                        a0Var.f27482d = z;
                    }
                }
                z = false;
                a0Var.f27482d = z;
            } else {
                Log.m105920e("GameLife.PluginGameLife", "setBlackListAssociateWithWAGame removeBlackList isAssociateWithWAGame null");
            }
            String str = this.f148527d;
            ((C15913g) C86312j.m106911c(C15913g.class)).mo437Pj(str, false, a0Var.f27482d, new C53234a(str, a0Var, this.f148531h, this.f148532i, this.f148533j));
            C53224d dVar = this.f148528e;
            String sessionId = this.f148529f.getSessionId();
            C87412m.m108593f(sessionId, "sessionInfo.sessionId");
            String t1 = this.f148529f.mo59158t1();
            C87412m.m108593f(t1, "sessionInfo.selfUsername");
            String t3 = this.f148529f.mo59157t();
            C87412m.m108593f(t3, "sessionInfo.talker");
            dVar.Ex0(7, 64, sessionId, t1, t3, Boolean.valueOf(a0Var.f27482d), Integer.valueOf(this.f148530g), (Boolean) this.f148525b.f29691a);
        }
    }

    /* renamed from: wy1.d$l */
    public static final class C53235l implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ C101218e0 f148539a;

        /* renamed from: b */
        public final /* synthetic */ C53221c.C53223b f148540b;

        /* renamed from: c */
        public final /* synthetic */ C9514m<Boolean> f148541c;

        /* renamed from: d */
        public final /* synthetic */ C9514m<Boolean> f148542d;

        /* renamed from: e */
        public final /* synthetic */ C9514m<Boolean> f148543e;

        /* renamed from: f */
        public final /* synthetic */ C53224d f148544f;

        /* renamed from: g */
        public final /* synthetic */ C53474j f148545g;

        /* renamed from: h */
        public final /* synthetic */ int f148546h;

        public C53235l(C101218e0 e0Var, C53221c.C53223b bVar, C9514m<Boolean> mVar, C9514m<Boolean> mVar2, C9514m<Boolean> mVar3, C53224d dVar, C53474j jVar, int i) {
            this.f148539a = e0Var;
            this.f148540b = bVar;
            this.f148541c = mVar;
            this.f148542d = mVar2;
            this.f148543e = mVar3;
            this.f148544f = dVar;
            this.f148545g = jVar;
            this.f148546h = i;
        }

        /* renamed from: a */
        public final void mo2001a() {
            this.f148539a.mo140680z();
            C53221c.C53223b bVar = this.f148540b;
            if (bVar != null) {
                T t = this.f148541c.f29691a;
                C87412m.m108593f(t, "isBlackList.value");
                C45110y3 y3Var = (C45110y3) bVar;
                y3Var.f122379a.runOnUiThread(new C45109x3(y3Var, ((Boolean) t).booleanValue()));
            }
            C9514m<Boolean> mVar = this.f148542d;
            boolean z = false;
            if (mVar != null) {
                T t2 = mVar.f29691a;
                C87412m.m108593f(t2, "isAssociateWithWAGame.value");
                if (((Boolean) t2).booleanValue()) {
                    T t3 = this.f148543e.f29691a;
                    C87412m.m108593f(t3, "dealWaGameAccountTogetherCheckBox.value");
                    if (((Boolean) t3).booleanValue()) {
                        z = true;
                    }
                }
            } else {
                Log.m105920e("GameLife.PluginGameLife", "setBlackListAssociateWithWAGame addBlackList isAssociateWithWAGame null hideDialog");
            }
            C53224d dVar = this.f148544f;
            String sessionId = this.f148545g.getSessionId();
            C87412m.m108593f(sessionId, "sessionInfo.sessionId");
            String t1 = this.f148545g.mo59158t1();
            C87412m.m108593f(t1, "sessionInfo.selfUsername");
            String t4 = this.f148545g.mo59157t();
            C87412m.m108593f(t4, "sessionInfo.talker");
            dVar.Ex0(6, 4, sessionId, t1, t4, Boolean.valueOf(z), Integer.valueOf(this.f148546h), (Boolean) this.f148542d.f29691a);
        }
    }

    /* renamed from: wy1.d$m */
    public static final class C53236m implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ C101218e0 f148547a;

        /* renamed from: b */
        public final /* synthetic */ C9514m<Boolean> f148548b;

        /* renamed from: c */
        public final /* synthetic */ C9514m<Boolean> f148549c;

        /* renamed from: d */
        public final /* synthetic */ String f148550d;

        /* renamed from: e */
        public final /* synthetic */ C53224d f148551e;

        /* renamed from: f */
        public final /* synthetic */ C53474j f148552f;

        /* renamed from: g */
        public final /* synthetic */ int f148553g;

        /* renamed from: h */
        public final /* synthetic */ C9514m<Boolean> f148554h;

        /* renamed from: i */
        public final /* synthetic */ Context f148555i;

        /* renamed from: j */
        public final /* synthetic */ C53221c.C53223b f148556j;

        /* renamed from: wy1.d$m$a */
        public static final class C53237a implements C15913g.C15915b {

            /* renamed from: a */
            public final /* synthetic */ String f148557a;

            /* renamed from: b */
            public final /* synthetic */ C8477a0 f148558b;

            /* renamed from: c */
            public final /* synthetic */ C9514m<Boolean> f148559c;

            /* renamed from: d */
            public final /* synthetic */ Context f148560d;

            /* renamed from: e */
            public final /* synthetic */ C53221c.C53223b f148561e;

            public C53237a(String str, C8477a0 a0Var, C9514m<Boolean> mVar, Context context, C53221c.C53223b bVar) {
                this.f148557a = str;
                this.f148558b = a0Var;
                this.f148559c = mVar;
                this.f148560d = context;
                this.f148561e = bVar;
            }

            /* renamed from: a */
            public final void mo5406a(boolean z) {
                Log.m105925i("GameLife.PluginGameLife", "setBlackListAssociateWithWAGame addBlackList userName:%s isSuccess:%b, dealWaGameTogether:%b ", this.f148557a, Boolean.valueOf(z), Boolean.valueOf(this.f148558b.f27482d));
                if (z) {
                    C9514m<Boolean> mVar = this.f148559c;
                    mVar.f29691a = Boolean.valueOf(!((Boolean) mVar.f29691a).booleanValue());
                } else {
                    C76701a.makeText(this.f148560d, (int) C0966R.string.fcw, 0).show();
                }
                C53221c.C53223b bVar = this.f148561e;
                T t = this.f148559c.f29691a;
                C87412m.m108593f(t, "isBlackList.value");
                C45110y3 y3Var = (C45110y3) bVar;
                y3Var.f122379a.runOnUiThread(new C45109x3(y3Var, ((Boolean) t).booleanValue()));
            }
        }

        public C53236m(C101218e0 e0Var, C9514m<Boolean> mVar, C9514m<Boolean> mVar2, String str, C53224d dVar, C53474j jVar, int i, C9514m<Boolean> mVar3, Context context, C53221c.C53223b bVar) {
            this.f148547a = e0Var;
            this.f148548b = mVar;
            this.f148549c = mVar2;
            this.f148550d = str;
            this.f148551e = dVar;
            this.f148552f = jVar;
            this.f148553g = i;
            this.f148554h = mVar3;
            this.f148555i = context;
            this.f148556j = bVar;
        }

        /* renamed from: a */
        public final void mo2001a() {
            boolean z;
            this.f148547a.mo140680z();
            C8477a0 a0Var = new C8477a0();
            C9514m<Boolean> mVar = this.f148548b;
            if (mVar != null) {
                T t = mVar.f29691a;
                C87412m.m108593f(t, "isAssociateWithWAGame.value");
                if (((Boolean) t).booleanValue()) {
                    T t2 = this.f148549c.f29691a;
                    C87412m.m108593f(t2, "dealWaGameAccountTogetherCheckBox.value");
                    if (((Boolean) t2).booleanValue()) {
                        z = true;
                        a0Var.f27482d = z;
                    }
                }
                z = false;
                a0Var.f27482d = z;
            } else {
                Log.m105920e("GameLife.PluginGameLife", "setBlackListAssociateWithWAGame addBlackList isAssociateWithWAGame null");
            }
            String str = this.f148550d;
            ((C15913g) C86312j.m106911c(C15913g.class)).mo437Pj(str, true, a0Var.f27482d, new C53237a(str, a0Var, this.f148554h, this.f148555i, this.f148556j));
            C53224d dVar = this.f148551e;
            String sessionId = this.f148552f.getSessionId();
            C87412m.m108593f(sessionId, "sessionInfo.sessionId");
            String t1 = this.f148552f.mo59158t1();
            C87412m.m108593f(t1, "sessionInfo.selfUsername");
            String t3 = this.f148552f.mo59157t();
            C87412m.m108593f(t3, "sessionInfo.talker");
            dVar.Ex0(6, 65, sessionId, t1, t3, Boolean.valueOf(a0Var.f27482d), Integer.valueOf(this.f148553g), (Boolean) this.f148548b.f29691a);
        }
    }

    /* renamed from: wy1.d$n */
    public static final class C53238n implements MStorage.IOnStorageChange {

        /* renamed from: d */
        public final /* synthetic */ C53224d f148562d;

        /* renamed from: wy1.d$n$a */
        public static final class C53239a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C53224d f148563d;

            public C53239a(C53224d dVar) {
                this.f148563d = dVar;
            }

            public final void run() {
                C53224d.vx0(this.f148563d);
            }
        }

        public C53238n(C53224d dVar) {
            this.f148562d = dVar;
        }

        public final void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            if (mStorageEventData.obj instanceof C7143c) {
                ((C119157j) C119157j.f356862d).mo183876g(new C53239a(this.f148562d), "reportGameChatUnreadState");
            }
        }
    }

    public C53224d() {
        C36568h.m40985a(C53228f.f148500d);
        this.f148484p = new C53238n(this);
    }

    public static /* synthetic */ void Fx0(C53224d dVar, int i, long j, String str, String str2, String str3, Boolean bool, Integer num, Boolean bool2, int i2, Object obj) {
        int i3 = i2;
        dVar.Ex0(i, j, str, str2, str3, (i3 & 32) != 0 ? null : bool, (i3 & 64) != 0 ? null : num, (i3 & 128) != 0 ? null : bool2);
    }

    public static final void vx0(C53224d dVar) {
        Boolean bool;
        synchronized (dVar) {
            if (dVar.f148483o == null) {
                Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GAME_CHAT_UNREAD_MSG_STATE_BOOLEAN_SYNC, Boolean.FALSE);
                C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Boolean");
                dVar.f148483o = (Boolean) f;
            }
            Boolean bool2 = dVar.f148483o;
            if (bool2 != null) {
                boolean booleanValue = bool2.booleanValue();
                int kd = ((C53472h) C86312j.m106911c(C53472h.class)).mo70730kd();
                if ((kd > 0 && !booleanValue) || (kd == 0 && booleanValue)) {
                    boolean z = kd > 0;
                    Log.m105925i("GameLife.PluginGameLife", "the state of game chat has changed, gameChatUnreadState:%b", Boolean.valueOf(z));
                    C40315a aVar = C40315a.f108386a;
                    Bundle bundle = new Bundle();
                    bundle.putInt(FileReaderHelper.OPEN_FILE_FROM_CMD, 1);
                    bundle.putBoolean("has_unread_msg", z);
                    aVar.mo63007a(bundle);
                    booleanValue = z;
                }
                bool = Boolean.valueOf(booleanValue);
            } else {
                bool = null;
            }
            dVar.f148483o = bool;
        }
    }

    public final C91753f Ax0() {
        C91753f fVar = this.f148475d;
        if (fVar != null) {
            C87412m.m108591d(fVar);
            return fVar;
        }
        Cx0();
        C91753f fVar2 = this.f148475d;
        C87412m.m108591d(fVar2);
        return fVar2;
    }

    public final C33484f Bx0() {
        C86709a0.m107523b().mo121108c();
        C33484f fVar = this.f148479h;
        if (fVar == null) {
            fVar = new C33484f(Ax0());
        }
        this.f148479h = fVar;
        return fVar;
    }

    public final void Cx0() {
        this.f148476e = C86709a0.m107535s().f251807e + "GameLife.db";
        C91753f fVar = this.f148475d;
        if (fVar == null) {
            fVar = new C91753f();
            String str = this.f148476e;
            if (str != null) {
                if (!fVar.mo125626p(str, C90364q0.m113146e(new C13604l(684917266, C15612h.f42236a), new C13604l(-1596213930, C38388i.f101279a), new C13604l(-791091759, C53243j.f148576a), new C13604l(-1647188391, C38389k.f101280a), new C13604l(-214072634, C38390l.f101281a)), true, true)) {
                    Log.m105920e("GameLife.PluginGameLife", "GameLife db init failed!");
                }
            } else {
                C87412m.m108603p("cacheDBPath");
                throw null;
            }
        }
        this.f148475d = fVar;
    }

    public final void Dx0(int i, long j, String str, String str2, String str3, String str4) {
        C89060f.m111322a().mo123060U(new C53229g(str, str2, str3, i, j, str4)).mo123058O();
    }

    public final void Ex0(int i, long j, String str, String str2, String str3, Boolean bool, Integer num, Boolean bool2) {
        C89060f.m111322a().mo123060U(new C53230h(str2, str3, num, bool2, bool, i, j, str)).mo123058O();
    }

    public final void Gx0(Context context, String str, int i, C9514m<Boolean> mVar, C9514m<Boolean> mVar2, C53221c.C53223b bVar, C53474j jVar) {
        String str2;
        int i2 = i;
        C9514m<Boolean> mVar3 = mVar;
        C9514m<Boolean> mVar4 = mVar2;
        C101218e0 e0Var = new C101218e0(context, 1, 2, false);
        e0Var.mo140662i(C0966R.C0971layout.ay5);
        View findViewById = e0Var.f296384g.findViewById(C0966R.C0970id.eoh);
        C87412m.m108593f(findViewById, "dialog.rootView.findView…blacklist_notifymsg_text)");
        TextView textView = (TextView) findViewById;
        View findViewById2 = e0Var.f296384g.findViewById(C0966R.C0970id.eoi);
        C87412m.m108593f(findViewById2, "dialog.rootView.findView…agame_blacklist_checkbox)");
        CheckBox checkBox = (CheckBox) findViewById2;
        View findViewById3 = e0Var.f296384g.findViewById(C0966R.C0970id.eoj);
        C87412m.m108593f(findViewById3, "dialog.rootView.findView…fe_wagame_blacklist_text)");
        TextView textView2 = (TextView) findViewById3;
        C9514m mVar5 = new C9514m();
        mVar5.f29691a = Boolean.TRUE;
        checkBox.setOnCheckedChangeListener(new C53231i(mVar5));
        if (((Boolean) mVar3.f29691a) == null) {
            Log.m105920e("GameLife.PluginGameLife", "showGameLifeDialog isBlackList null");
            return;
        }
        T t = mVar3.f29691a;
        C87412m.m108593f(t, "isBlackList.value");
        if (((Boolean) t).booleanValue()) {
            if (i2 == 1) {
                textView.setText(C0966R.string.f_3);
                if (mVar4 != null) {
                    T t2 = mVar4.f29691a;
                    C87412m.m108593f(t2, "isAssociateWithWAGame.value");
                    if (((Boolean) t2).booleanValue()) {
                        textView2.setText(C0966R.string.f_5);
                    } else {
                        checkBox.setVisibility(8);
                        textView2.setVisibility(8);
                    }
                }
            } else if (i2 == 2) {
                textView.setText(C0966R.string.f_4);
                textView2.setVisibility(8);
                checkBox.setVisibility(8);
            }
            C53232j jVar2 = new C53232j(bVar, mVar, e0Var, mVar2, mVar5, this, jVar, i);
            C53233k kVar = r0;
            C53233k kVar2 = new C53233k(e0Var, mVar2, mVar5, str, this, jVar, i, mVar, context, bVar);
            e0Var.f296373D = jVar2;
            e0Var.f296374E = kVar;
            e0Var.mo140667n(context.getResources().getString(C0966R.string.f7926wf), context.getResources().getString(C0966R.string.f_1));
            e0Var.mo140671q(context.getResources().getString(C0966R.string.f_2));
            e0Var.mo140655A();
            String sessionId = jVar.getSessionId();
            C87412m.m108593f(sessionId, "sessionInfo.sessionId");
            String t1 = jVar.mo59158t1();
            C87412m.m108593f(t1, "sessionInfo.selfUsername");
            String t3 = jVar.mo59157t();
            C87412m.m108593f(t3, "sessionInfo.talker");
            Fx0(this, 7, 1, sessionId, t1, t3, (Boolean) null, (Integer) null, (Boolean) null, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, (Object) null);
            return;
        }
        String str3 = "sessionInfo.sessionId";
        String str4 = "sessionInfo.selfUsername";
        if (i2 != 1) {
            if (i2 == 2) {
                textView.setText(C0966R.string.f9y);
                checkBox.setVisibility(8);
            }
            str2 = str4;
            C9514m<Boolean> mVar6 = mVar2;
        } else {
            textView.setText(C0966R.string.f9x);
            str2 = str4;
            C9514m<Boolean> mVar7 = mVar2;
            if (mVar7 != null) {
                T t4 = mVar7.f29691a;
                C87412m.m108593f(t4, "isAssociateWithWAGame.value");
                if (((Boolean) t4).booleanValue()) {
                    textView2.setText(C0966R.string.f9z);
                } else {
                    checkBox.setVisibility(8);
                    textView2.setVisibility(8);
                }
            }
        }
        C101218e0 e0Var2 = e0Var;
        C53235l lVar = new C53235l(e0Var2, bVar, mVar, mVar2, mVar5, this, jVar, i);
        C53236m mVar8 = r0;
        C53236m mVar9 = new C53236m(e0Var2, mVar2, mVar5, str, this, jVar, i, mVar, context, bVar);
        e0Var.f296373D = lVar;
        e0Var.f296374E = mVar8;
        e0Var.mo140675u(context.getResources().getColor(C0966R.color.a7f));
        e0Var.mo140668o(2);
        e0Var.mo140667n(context.getResources().getString(C0966R.string.f7926wf), context.getResources().getString(C0966R.string.f_0));
        e0Var.mo140671q(context.getResources().getString(C0966R.string.f9w));
        e0Var.mo140655A();
        String sessionId2 = jVar.getSessionId();
        C87412m.m108593f(sessionId2, str3);
        String t15 = jVar.mo59158t1();
        C87412m.m108593f(t15, str2);
        String t5 = jVar.mo59157t();
        C87412m.m108593f(t5, "sessionInfo.talker");
        Fx0(this, 6, 1, sessionId2, t15, t5, (Boolean) null, (Integer) null, (Boolean) null, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, (Object) null);
    }

    public final void Hx0() {
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        ((C53224d) C86312j.m106911c(C53224d.class)).mo73895WQ(context, "U1_BgAAHED13WDGBipLzICG_mkIR7gtkryaxyn7Ed4@gamelife", "U1_BgAAHED13WDGBipLsjCl-jj_DtzKiu7ntwVX5oE@gamelife", 0, (C89349b) null, (String) null);
    }

    /* renamed from: KV */
    public void mo73894KV(Context context, String str, int i) {
        String str2;
        String str3 = str;
        int i2 = i;
        Class cls = C53475k.class;
        if (!(str3 == null || str.length() == 0)) {
            String str4 = "";
            if (i2 == 2) {
                if (C72996z1.m85831b5(str)) {
                    Dx0(2, 7, str, (String) null, (String) null, "1");
                    str2 = str3;
                } else {
                    C53474j G2 = ((C53475k) C86312j.m106911c(cls)).mo59160G2(str3);
                    str2 = G2.mo59157t();
                    C87412m.m108593f(str2, "sessionInfo.talker");
                    String t1 = G2.mo59158t1();
                    C87412m.m108593f(t1, "sessionInfo.selfUsername");
                    Dx0(2, 7, t1, G2.getSessionId(), G2.mo59157t(), "2");
                }
            } else if (i2 == 1) {
                C53474j G22 = ((C53475k) C86312j.m106911c(cls)).mo59160G2(str3);
                str2 = G22.mo59157t();
                C87412m.m108593f(str2, "sessionInfo.talker");
                String sessionId = G22.getSessionId();
                C87412m.m108593f(sessionId, "sessionInfo.sessionId");
                String t15 = G22.mo59158t1();
                C87412m.m108593f(t15, "sessionInfo.selfUsername");
                String t = G22.mo59157t();
                C87412m.m108593f(t, "sessionInfo.talker");
                Fx0(this, 2, 7, sessionId, t15, t, (Boolean) null, (Integer) null, (Boolean) null, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, (Object) null);
            } else {
                str2 = str4;
            }
            C15912f X3 = ((C15913g) C86312j.m106911c(C15913g.class)).mo440X3(str2);
            if (X3 != null) {
                str4 = X3.mo424a();
            }
            if (str4 == null || str4.length() == 0) {
                Log.m105920e("GameLife.PluginGameLife", "userName:%s,jumpUrl null");
                return;
            }
            Log.m105925i("GameLife.PluginGameLife", "userName:%s,jumpUrl:%s", str2, str4);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", str4);
            C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }

    /* renamed from: WQ */
    public void mo73895WQ(Context context, String str, String str2, int i, C89349b bVar, String str3) {
        Context context2 = context;
        String str4 = str;
        String str5 = str2;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str4, "selfUsername");
        C87412m.m108594g(str5, "talker");
        C8479f0 f0Var = new C8479f0();
        C119179t tVar = C119157j.f356862d;
        C15610d dVar = new C15610d(f0Var, context);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        C34379c<?> w = jVar.mo183892w(dVar, 1000, false);
        ((C79011i) C86312j.m106911c(C79011i.class)).mo71417oN();
        C53226c cVar = new C53226c(w, f0Var, str3, str, context);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        LinkedList linkedList = new LinkedList();
        C53242g gVar = new C53242g(atomicInteger, linkedList, cVar);
        String str6 = str2;
        ((C53475k) C86312j.m106911c(C53475k.class)).mo59161fG(str, str6, i, bVar, new C53240e(atomicInteger, cVar, linkedList, gVar));
        ((C15913g) C86312j.m106911c(C15913g.class)).C40(C64197v.m75537f(str4, str5), new C53241f(str, str6, gVar, atomicInteger, cVar));
    }

    /* renamed from: jX */
    public void mo73896jX(Context context, String str, C9514m<Boolean> mVar, C9514m<Boolean> mVar2, C53221c.C53223b bVar) {
        Context context2 = context;
        C9514m<Boolean> mVar3 = mVar;
        C9514m<Boolean> mVar4 = mVar2;
        Class cls = C15913g.class;
        C87412m.m108594g(mVar3, "isBlackList");
        C87412m.m108594g(mVar4, "isAssociateWithWAGame");
        C87412m.m108594g(bVar, "callback");
        if (context2 != null) {
            C53474j G2 = ((C53475k) C86312j.m106911c(C53475k.class)).mo59160G2(str);
            String t = G2.mo59157t();
            String t1 = G2.mo59158t1();
            String sessionId = G2.getSessionId();
            C87412m.m108593f(sessionId, "sessionInfo.sessionId");
            C87412m.m108593f(t1, "selfUserName");
            C87412m.m108593f(t, "talkerName");
            Fx0(this, 5, 2, sessionId, t1, t, (Boolean) null, (Integer) null, (Boolean) null, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, (Object) null);
            C15912f X3 = ((C15913g) C86312j.m106911c(cls)).mo440X3(t);
            int D0 = X3.mo422D0();
            String username = X3.getUsername();
            if (D0 <= 0) {
                C76701a.makeText(context2, (int) C0966R.string.fcv, 0).show();
            } else if (D0 == 2) {
                if (mVar3.f29691a != null && mVar4.f29691a != null) {
                    C87412m.m108593f(username, "userName");
                    Gx0(context, username, D0, mVar, mVar2, bVar, G2);
                }
            } else if (D0 == 1) {
                C89779i0 e = C89779i0.m112248e(context2, context.getResources().getString(C0966R.string.a4d), true, 3, (DialogInterface.OnCancelListener) null);
                e.show();
                ((C15913g) C86312j.m106911c(cls)).mo439VN(username, new C53225b(mVar, mVar2, username, e, this, context, D0, bVar, G2));
            }
        }
    }

    /* renamed from: me */
    public void mo73897me(Context context, String str) {
        C53474j jVar;
        Context context2 = context;
        String str2 = str;
        Class cls = C15913g.class;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(str2, "sessionId");
        Log.m105925i("GameLife.PluginGameLife", "enterSendGift sessionId[%s]", str2);
        C53474j G2 = ((C53475k) C86312j.m106911c(C53475k.class)).mo59160G2(str2);
        if (G2 != null) {
            C15912f X3 = ((C15913g) C86312j.m106911c(cls)).mo440X3(G2.mo59158t1());
            C15912f X32 = ((C15913g) C86312j.m106911c(cls)).mo440X3(G2.mo59157t());
            if (X3 == null || X32 == null) {
                jVar = G2;
            } else {
                String username = X3.getUsername();
                C87412m.m108593f(username, "selfContact.username");
                String username2 = X32.getUsername();
                C87412m.m108593f(username2, "talkerContact.username");
                GameLifeSessionStruct gameLifeSessionStruct = new GameLifeSessionStruct();
                jVar = G2;
                gameLifeSessionStruct.f107922d = 3;
                gameLifeSessionStruct.f107923e = 302;
                gameLifeSessionStruct.f107924f = 2;
                gameLifeSessionStruct.f107925g = 2;
                gameLifeSessionStruct.f107926h = 301;
                gameLifeSessionStruct.f107934p = gameLifeSessionStruct.mo86045b("SessionId", str2, true);
                gameLifeSessionStruct.f107929k = (long) X3.mo422D0();
                gameLifeSessionStruct.f107930l = gameLifeSessionStruct.mo86045b("from_username", username, true);
                gameLifeSessionStruct.f107931m = (long) X32.mo422D0();
                gameLifeSessionStruct.f107932n = gameLifeSessionStruct.mo86045b("to_username", username2, true);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ser_name", 4);
                gameLifeSessionStruct.mo62729s(URLEncoder.encode(jSONObject.toString()));
                gameLifeSessionStruct.mo86054n();
            }
            int PW = ((C48478n) C86312j.m106911c(C48478n.class)).mo65678PW(context2, jVar.mo59158t1(), jVar.mo59157t());
            if (X3 != null && X32 != null) {
                if (PW == 40) {
                    C40306c.C40307a aVar = C40306c.f108374a;
                    String username3 = X3.getUsername();
                    C87412m.m108593f(username3, "selfContact.username");
                    String username4 = X32.getUsername();
                    C87412m.m108593f(username4, "talkerContact.username");
                    aVar.mo62985b(str, (long) X3.mo422D0(), username3, (long) X32.mo422D0(), username4, 40, 4);
                    return;
                }
                C40306c.C40307a aVar2 = C40306c.f108374a;
                String username5 = X3.getUsername();
                C87412m.m108593f(username5, "selfContact.username");
                String username6 = X32.getUsername();
                C87412m.m108593f(username6, "talkerContact.username");
                aVar2.mo62985b(str, (long) X3.mo422D0(), username5, (long) X32.mo422D0(), username6, 71, 4);
            }
        }
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        super.onAccountInitialized(context);
        Log.m105924i("GameLife.PluginGameLife", "Account Init");
        ((C119157j) C119157j.f356862d).mo183878i(new C53227e(this), 1000);
    }

    public final void wx0() {
        C86709a0.m107523b().mo121108c();
        Ax0();
        String str = this.f148476e;
        if (str != null) {
            C86013q1.m106447h(str);
            C91753f fVar = this.f148475d;
            if (fVar != null) {
                fVar.mo124432b();
            }
            this.f148475d = null;
            this.f148478g = null;
            this.f148479h = null;
            this.f148480i = null;
            this.f148482n = null;
            this.f148481j = null;
            Cx0();
            return;
        }
        C87412m.m108603p("cacheDBPath");
        throw null;
    }

    public final C32241f xx0() {
        C86709a0.m107523b().mo121108c();
        C32241f fVar = this.f148482n;
        if (fVar == null) {
            fVar = new C32241f(Ax0());
        }
        this.f148482n = fVar;
        return fVar;
    }

    public final C0404k yx0() {
        C86709a0.m107523b().mo121108c();
        C0404k kVar = this.f148478g;
        if (kVar == null) {
            kVar = new C0404k(Ax0());
        }
        this.f148478g = kVar;
        return kVar;
    }

    public final C45230i zx0() {
        C86709a0.m107523b().mo121108c();
        C45230i iVar = this.f148480i;
        if (iVar == null) {
            iVar = new C45230i(Ax0());
        }
        this.f148480i = iVar;
        return iVar;
    }
}
