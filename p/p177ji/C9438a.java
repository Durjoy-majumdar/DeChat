package p177ji;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$f;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f62.C7994b0;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76912y0;
import o40.C61926c;
import ob0.C47350c;
import p225rc.C12969d;
import p530fx.C45819c;
import pe3.C47465a;
import pg3.C47504d;
import pg3.C77084b;
import qo3.C89779i0;
import rx3.C13598b0;
import te3.C48957c5;
import te3.C49096d5;
import te3.C49234e5;
import te3.C49966ja;
import te3.C50722os;
import te3.C50866ps;
import te3.C51062r6;
import te3.C51163rv3;
import te3.C51202s6;
import te3.C51223sc;
import te3.C51290ss;
import te3.C51437ts;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND})
/* renamed from: ji.a */
public final class C9438a extends C86301e implements C7994b0, MMActivity.C6739d {

    /* renamed from: ji.a$a */
    public static final class C9439a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C89779i0> f29466d;

        /* renamed from: e */
        public final /* synthetic */ Context f29467e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9439a(C8479f0<C89779i0> f0Var, Context context) {
            super(0);
            this.f29466d = f0Var;
            this.f29467e = context;
        }

        public Object invoke() {
            C8479f0<C89779i0> f0Var = this.f29466d;
            Context context = this.f29467e;
            f0Var.f27484d = C89779i0.m112248e(context, context.getString(C0966R.string.a4d), true, 3, (DialogInterface.OnCancelListener) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ji.a$b */
    public static final class C9440b implements C40324j.C40326a {

        /* renamed from: a */
        public final /* synthetic */ C8479f0<C89779i0> f29468a;

        /* renamed from: b */
        public final /* synthetic */ C7994b0.C7996b f29469b;

        /* renamed from: c */
        public final /* synthetic */ C7994b0.C7995a f29470c;

        /* renamed from: d */
        public final /* synthetic */ Context f29471d;

        /* renamed from: ji.a$b$a */
        public static final class C9441a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C8479f0<C89779i0> f29472d;

            /* renamed from: e */
            public final /* synthetic */ C47350c f29473e;

            /* renamed from: f */
            public final /* synthetic */ int f29474f;

            /* renamed from: g */
            public final /* synthetic */ int f29475g;

            /* renamed from: h */
            public final /* synthetic */ C7994b0.C7996b f29476h;

            /* renamed from: i */
            public final /* synthetic */ C7994b0.C7995a f29477i;

            /* renamed from: j */
            public final /* synthetic */ Context f29478j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9441a(C8479f0<C89779i0> f0Var, C47350c cVar, int i, int i2, C7994b0.C7996b bVar, C7994b0.C7995a aVar, Context context) {
                super(0);
                this.f29472d = f0Var;
                this.f29473e = cVar;
                this.f29474f = i;
                this.f29475g = i2;
                this.f29476h = bVar;
                this.f29477i = aVar;
                this.f29478j = context;
            }

            public Object invoke() {
                C49966ja baseResponse;
                C51163rv3 rv32;
                C89779i0 i0Var = (C89779i0) this.f29472d.f27484d;
                if (i0Var != null) {
                    i0Var.dismiss();
                }
                C47350c cVar = this.f29473e;
                C47465a aVar = cVar != null ? cVar.f127056b.f127083a : null;
                C49096d5 d5Var = aVar instanceof C49096d5 ? (C49096d5) aVar : null;
                if (this.f29474f == 0 && this.f29475g == 0 && d5Var != null) {
                    ((C45819c) C86312j.m106911c(C45819c.class)).mo71192mK(this.f29476h.f26684j).mo71504o(this.f29476h.f26684j).mo100865c();
                    C7994b0.C7995a aVar2 = this.f29477i;
                    if (aVar2 != null) {
                        aVar2.mo1112a(true, "", d5Var.f132115d);
                    }
                } else {
                    String str = (d5Var == null || (baseResponse = d5Var.getBaseResponse()) == null || (rv32 = baseResponse.f135956e) == null) ? null : rv32.f141175d;
                    if (str == null) {
                        str = this.f29478j.getString(C0966R.string.f360239b40);
                        C87412m.m108593f(str, "context.getString(R.stri…chat_room_open_bind_fail)");
                    }
                    C76912y0.m92767f(MMApplicationContext.getContext(), str);
                    C7994b0.C7995a aVar3 = this.f29477i;
                    if (aVar3 != null) {
                        aVar3.mo1112a(false, str, (String) null);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C9440b(C8479f0<C89779i0> f0Var, C7994b0.C7996b bVar, C7994b0.C7995a aVar, Context context) {
            this.f29468a = f0Var;
            this.f29469b = bVar;
            this.f29470c = aVar;
            this.f29471d = context;
        }

        /* renamed from: a */
        public final void mo288a(int i, int i2, String str, C47350c cVar) {
            C61926c.m72668M(new C9441a(this.f29468a, cVar, i, i2, this.f29469b, this.f29470c, this.f29471d));
        }
    }

    /* renamed from: ji.a$c */
    public static final class C9442c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C89779i0> f29479d;

        /* renamed from: e */
        public final /* synthetic */ Context f29480e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9442c(C8479f0<C89779i0> f0Var, Context context) {
            super(0);
            this.f29479d = f0Var;
            this.f29480e = context;
        }

        public Object invoke() {
            C8479f0<C89779i0> f0Var = this.f29479d;
            Context context = this.f29480e;
            f0Var.f27484d = C89779i0.m112248e(context, context.getString(C0966R.string.f360944g53), true, 3, (DialogInterface.OnCancelListener) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ji.a$d */
    public static final class C9443d extends C47504d {

        /* renamed from: l */
        public final /* synthetic */ C8479f0<C89779i0> f29481l;

        /* renamed from: m */
        public final /* synthetic */ C7994b0.C7997c f29482m;

        /* renamed from: n */
        public final /* synthetic */ Context f29483n;

        public C9443d(C8479f0<C89779i0> f0Var, C7994b0.C7997c cVar, Context context) {
            this.f29481l = f0Var;
            this.f29482m = cVar;
            this.f29483n = context;
        }

        /* renamed from: a */
        public void mo10150a(int i, int i2, String str, C77084b bVar) {
            C47504d dVar = (C47504d) bVar;
            C61926c.m72668M(new C9455b(this.f29481l, i, i2, this, this.f29482m, this.f29483n));
        }
    }

    /* renamed from: ji.a$e */
    public static final class C9444e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C89779i0> f29484d;

        /* renamed from: e */
        public final /* synthetic */ Context f29485e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9444e(C8479f0<C89779i0> f0Var, Context context) {
            super(0);
            this.f29484d = f0Var;
            this.f29485e = context;
        }

        public Object invoke() {
            C8479f0<C89779i0> f0Var = this.f29484d;
            Context context = this.f29485e;
            f0Var.f27484d = C89779i0.m112248e(context, context.getString(C0966R.string.a4d), true, 3, (DialogInterface.OnCancelListener) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ji.a$f */
    public static final class C9445f implements C40324j.C40326a {

        /* renamed from: a */
        public final /* synthetic */ C8479f0<C89779i0> f29486a;

        /* renamed from: b */
        public final /* synthetic */ C7994b0.C7996b f29487b;

        /* renamed from: c */
        public final /* synthetic */ Context f29488c;

        /* renamed from: d */
        public final /* synthetic */ C7994b0.C7997c f29489d;

        /* renamed from: ji.a$f$a */
        public static final class C9446a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C8479f0<C89779i0> f29490d;

            /* renamed from: e */
            public final /* synthetic */ C47350c f29491e;

            /* renamed from: f */
            public final /* synthetic */ int f29492f;

            /* renamed from: g */
            public final /* synthetic */ int f29493g;

            /* renamed from: h */
            public final /* synthetic */ C7994b0.C7996b f29494h;

            /* renamed from: i */
            public final /* synthetic */ Context f29495i;

            /* renamed from: j */
            public final /* synthetic */ C7994b0.C7997c f29496j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9446a(C8479f0<C89779i0> f0Var, C47350c cVar, int i, int i2, C7994b0.C7996b bVar, Context context, C7994b0.C7997c cVar2) {
                super(0);
                this.f29490d = f0Var;
                this.f29491e = cVar;
                this.f29492f = i;
                this.f29493g = i2;
                this.f29494h = bVar;
                this.f29495i = context;
                this.f29496j = cVar2;
            }

            public Object invoke() {
                C49966ja baseResponse;
                C51163rv3 rv32;
                C89779i0 i0Var = (C89779i0) this.f29490d.f27484d;
                if (i0Var != null) {
                    i0Var.dismiss();
                }
                C47350c cVar = this.f29491e;
                C47465a aVar = cVar != null ? cVar.f127056b.f127083a : null;
                C51202s6 s6Var = aVar instanceof C51202s6 ? (C51202s6) aVar : null;
                if (this.f29492f == 0 && this.f29493g == 0 && s6Var != null) {
                    ((C45819c) C86312j.m106911c(C45819c.class)).mo71192mK(this.f29494h.f26684j).mo71504o(this.f29494h.f26684j).mo100865c();
                    C76912y0.m92768g(MMApplicationContext.getContext(), this.f29495i.getString(C0966R.string.b4e));
                    C7994b0.C7997c cVar2 = this.f29496j;
                    if (cVar2 != null) {
                        cVar2.mo1114a(true, "", (String) null);
                    }
                } else {
                    String str = (s6Var == null || (baseResponse = s6Var.getBaseResponse()) == null || (rv32 = baseResponse.f135956e) == null) ? null : rv32.f141175d;
                    if (str == null) {
                        str = this.f29495i.getString(C0966R.string.b4d);
                        C87412m.m108593f(str, "context.getString(R.stri…at_room_open_unbind_fail)");
                    }
                    C76912y0.m92767f(MMApplicationContext.getContext(), str);
                    C7994b0.C7997c cVar3 = this.f29496j;
                    if (cVar3 != null) {
                        cVar3.mo1114a(false, str, (String) null);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C9445f(C8479f0<C89779i0> f0Var, C7994b0.C7996b bVar, Context context, C7994b0.C7997c cVar) {
            this.f29486a = f0Var;
            this.f29487b = bVar;
            this.f29488c = context;
            this.f29489d = cVar;
        }

        /* renamed from: a */
        public final void mo288a(int i, int i2, String str, C47350c cVar) {
            C61926c.m72668M(new C9446a(this.f29486a, cVar, i, i2, this.f29487b, this.f29488c, this.f29489d));
        }
    }

    /* renamed from: ji.a$g */
    public static final class C9447g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C89779i0> f29497d;

        /* renamed from: e */
        public final /* synthetic */ Context f29498e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9447g(C8479f0<C89779i0> f0Var, Context context) {
            super(0);
            this.f29497d = f0Var;
            this.f29498e = context;
        }

        public Object invoke() {
            C8479f0<C89779i0> f0Var = this.f29497d;
            Context context = this.f29498e;
            f0Var.f27484d = C89779i0.m112248e(context, context.getString(C0966R.string.a4d), true, 3, (DialogInterface.OnCancelListener) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ji.a$h */
    public static final class C9448h implements C40324j.C40326a {

        /* renamed from: a */
        public final /* synthetic */ C7994b0.C7996b f29499a;

        /* renamed from: b */
        public final /* synthetic */ MMFragmentActivity f29500b;

        /* renamed from: c */
        public final /* synthetic */ Context f29501c;

        /* renamed from: d */
        public final /* synthetic */ C7994b0.C7995a f29502d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<C89779i0> f29503e;

        /* renamed from: f */
        public final /* synthetic */ C9438a f29504f;

        /* renamed from: ji.a$h$a */
        public static final class C9449a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C8479f0<C89779i0> f29505d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9449a(C8479f0<C89779i0> f0Var) {
                super(0);
                this.f29505d = f0Var;
            }

            public Object invoke() {
                C89779i0 i0Var = (C89779i0) this.f29505d.f27484d;
                if (i0Var != null) {
                    i0Var.dismiss();
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: ji.a$h$b */
        public static final class C9450b implements MMFragmentActivity$$f {

            /* renamed from: a */
            public final /* synthetic */ C7994b0.C7996b f29506a;

            /* renamed from: b */
            public final /* synthetic */ C9438a f29507b;

            /* renamed from: c */
            public final /* synthetic */ Context f29508c;

            /* renamed from: d */
            public final /* synthetic */ C7994b0.C7995a f29509d;

            public C9450b(C7994b0.C7996b bVar, C9438a aVar, Context context, C7994b0.C7995a aVar2) {
                this.f29506a = bVar;
                this.f29507b = aVar;
                this.f29508c = context;
                this.f29509d = aVar2;
            }

            /* JADX WARNING: type inference failed for: r6v1, types: [android.content.Context] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mmOnActivityResult(int r4, int r5, android.content.Intent r6) {
                /*
                    r3 = this;
                    r0 = 15001(0x3a99, float:2.1021E-41)
                    if (r4 != r0) goto L_0x006e
                    r4 = -1
                    if (r5 == r4) goto L_0x0008
                    goto L_0x006e
                L_0x0008:
                    r4 = 0
                    if (r6 == 0) goto L_0x0012
                    java.lang.String r5 = "Select_Conv_User"
                    java.lang.String r5 = r6.getStringExtra(r5)
                    goto L_0x0013
                L_0x0012:
                    r5 = r4
                L_0x0013:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "on select contact return:"
                    r0.append(r1)
                    r0.append(r5)
                    java.lang.String r0 = r0.toString()
                    java.lang.String r1 = "MicroMsg.ChatRoomOpenService"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                    f62.b0$b r0 = r3.f29506a
                    r0.f26684j = r5
                    r5 = 0
                    if (r6 == 0) goto L_0x0036
                    java.lang.String r2 = "key_has_create_new_group"
                    int r5 = r6.getIntExtra(r2, r5)
                L_0x0036:
                    r0.f26685n = r5
                    ji.a r5 = r3.f29507b
                    android.content.Context r6 = r3.f29508c
                    f62.b0$b r0 = r3.f29506a
                    f62.b0$a r2 = r3.f29509d
                    r5.getClass()
                    boolean r5 = r6 instanceof com.tencent.p014mm.p136ui.MMFragmentActivity
                    if (r5 == 0) goto L_0x004a
                    r4 = r6
                    com.tencent.mm.ui.MMFragmentActivity r4 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r4
                L_0x004a:
                    if (r4 != 0) goto L_0x0052
                    java.lang.String r4 = "context is not MMActivity"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r4)
                    goto L_0x006e
                L_0x0052:
                    android.content.Intent r5 = new android.content.Intent
                    r5.<init>()
                    java.lang.String r6 = "com.tencent.mm.chatroom.ui.ChatRoomBindAppUI"
                    r5.setClassName(r4, r6)
                    java.lang.String r6 = "key_bind_param"
                    r5.putExtra(r6, r0)
                    ji.c r6 = new ji.c
                    r6.<init>(r2)
                    r4.setMMOnFragmentActivityResult(r6)
                    r6 = 15002(0x3a9a, float:2.1022E-41)
                    r4.startActivityForResult((android.content.Intent) r5, (int) r6)
                L_0x006e:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p177ji.C9438a.C9448h.C9450b.mmOnActivityResult(int, int, android.content.Intent):void");
            }
        }

        /* renamed from: ji.a$h$c */
        public static final class C9451c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ MMFragmentActivity f29510d;

            /* renamed from: e */
            public final /* synthetic */ String f29511e;

            /* renamed from: f */
            public final /* synthetic */ String f29512f;

            public C9451c(MMFragmentActivity mMFragmentActivity, String str, String str2) {
                this.f29510d = mMFragmentActivity;
                this.f29511e = str;
                this.f29512f = str2;
            }

            public final void run() {
                Intent intent = new Intent();
                MMFragmentActivity mMFragmentActivity = this.f29510d;
                String str = this.f29511e;
                String str2 = this.f29512f;
                intent.setClassName(mMFragmentActivity, "com.tencent.mm.chatroom.ui.ChatRoomOpenErrorInfoUI");
                intent.putExtra("key_error_title", str);
                intent.putExtra("key_error_content", str2);
                MMFragmentActivity mMFragmentActivity2 = this.f29510d;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                MMFragmentActivity mMFragmentActivity3 = mMFragmentActivity2;
                C117292a.m165358d(mMFragmentActivity3, aVar.mo10232b(), "com/tencent/mm/chatroom/api/ChatRoomOpenService$doCheckAppBindChatRoom$2$3", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mMFragmentActivity2.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(mMFragmentActivity3, "com/tencent/mm/chatroom/api/ChatRoomOpenService$doCheckAppBindChatRoom$2$3", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }

        public C9448h(C7994b0.C7996b bVar, MMFragmentActivity mMFragmentActivity, Context context, C7994b0.C7995a aVar, C8479f0<C89779i0> f0Var, C9438a aVar2) {
            this.f29499a = bVar;
            this.f29500b = mMFragmentActivity;
            this.f29501c = context;
            this.f29502d = aVar;
            this.f29503e = f0Var;
            this.f29504f = aVar2;
        }

        /* renamed from: a */
        public final void mo288a(int i, int i2, String str, C47350c cVar) {
            String str2;
            C49966ja baseResponse;
            C51163rv3 rv32;
            C49234e5 e5Var;
            C49234e5 e5Var2;
            C49234e5 e5Var3;
            String str3;
            Log.m105924i("MicroMsg.ChatRoomOpenService", "GetCheckAppBindResp: errType:" + i + ", errCode:" + i2 + ", errMsg:" + str);
            C61926c.m72668M(new C9449a(this.f29503e));
            C47465a aVar = cVar != null ? cVar.f127056b.f127083a : null;
            C50866ps psVar = aVar instanceof C50866ps ? (C50866ps) aVar : null;
            boolean z = true;
            if (i == 0 && i2 == 0 && psVar != null) {
                Log.m105924i("MicroMsg.ChatRoomOpenService", "GetCheckAppBindResp Success");
                C7994b0.C7996b bVar = this.f29499a;
                bVar.f26683i = psVar.f139931d;
                C51223sc scVar = psVar.f139932e;
                if (scVar == null || (str3 = scVar.f141430e) == null) {
                    str3 = "";
                }
                bVar.f26682h = str3;
                Intent intent = new Intent();
                MMFragmentActivity mMFragmentActivity = this.f29500b;
                C7994b0.C7996b bVar2 = this.f29499a;
                intent.setClassName(mMFragmentActivity, "com.tencent.mm.ui.contact.GroupCardSelectUI");
                intent.putExtra("group_select_type", true);
                intent.putExtra("group_select_only_need_self_owner", true);
                intent.putExtra("group_select_need_result", true);
                intent.putExtra("group_select_show_create_new_group", true);
                intent.putExtra("group_select_should_intercept", true);
                intent.putExtra("key_bind_param", bVar2);
                this.f29500b.setMMOnFragmentActivityResult(new C9450b(this.f29499a, this.f29504f, this.f29501c, this.f29502d));
                this.f29500b.startActivityForResult(intent, 15001);
                return;
            }
            String str4 = (psVar == null || (e5Var3 = psVar.f139933f) == null) ? null : e5Var3.f132694d;
            if (!(str4 == null || str4.length() == 0)) {
                z = false;
            }
            String string = z ? this.f29501c.getString(C0966R.string.f360240b41) : (psVar == null || (e5Var2 = psVar.f139933f) == null) ? null : e5Var2.f132694d;
            if (psVar == null || (e5Var = psVar.f139933f) == null || (str2 = e5Var.f132695e) == null) {
                str2 = (psVar == null || (baseResponse = psVar.getBaseResponse()) == null || (rv32 = baseResponse.f135956e) == null) ? null : rv32.f141175d;
                if (str2 == null) {
                    str2 = string;
                }
            }
            C7994b0.C7995a aVar2 = this.f29502d;
            if (aVar2 != null) {
                aVar2.mo1112a(false, str2, (String) null);
            }
            ((C119157j) C119157j.f356862d).mo183895z(new C9451c(this.f29500b, string, str2));
        }
    }

    /* renamed from: ji.a$i */
    public static final class C9452i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C89779i0> f29513d;

        /* renamed from: e */
        public final /* synthetic */ Context f29514e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9452i(C8479f0<C89779i0> f0Var, Context context) {
            super(0);
            this.f29513d = f0Var;
            this.f29514e = context;
        }

        public Object invoke() {
            C8479f0<C89779i0> f0Var = this.f29513d;
            Context context = this.f29514e;
            f0Var.f27484d = C89779i0.m112248e(context, context.getString(C0966R.string.a4d), true, 3, (DialogInterface.OnCancelListener) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ji.a$j */
    public static final class C9453j implements C40324j.C40326a {

        /* renamed from: a */
        public final /* synthetic */ C8479f0<C89779i0> f29515a;

        /* renamed from: b */
        public final /* synthetic */ Context f29516b;

        /* renamed from: ji.a$j$a */
        public static final class C9454a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C8479f0<C89779i0> f29517d;

            /* renamed from: e */
            public final /* synthetic */ C47350c f29518e;

            /* renamed from: f */
            public final /* synthetic */ int f29519f;

            /* renamed from: g */
            public final /* synthetic */ int f29520g;

            /* renamed from: h */
            public final /* synthetic */ Context f29521h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9454a(C8479f0<C89779i0> f0Var, C47350c cVar, int i, int i2, Context context) {
                super(0);
                this.f29517d = f0Var;
                this.f29518e = cVar;
                this.f29519f = i;
                this.f29520g = i2;
                this.f29521h = context;
            }

            public Object invoke() {
                C49234e5 e5Var;
                C49234e5 e5Var2;
                C49234e5 e5Var3;
                C49234e5 e5Var4;
                C89779i0 i0Var = (C89779i0) this.f29517d.f27484d;
                if (i0Var != null) {
                    i0Var.dismiss();
                }
                C47350c cVar = this.f29518e;
                String str = null;
                C47465a aVar = cVar != null ? cVar.f127056b.f127083a : null;
                C51437ts tsVar = aVar instanceof C51437ts ? (C51437ts) aVar : null;
                boolean z = true;
                if (this.f29519f == 0 && this.f29520g == 0 && tsVar != null) {
                    String str2 = tsVar.f142378d;
                    if (!(str2 == null || str2.length() == 0)) {
                        String str3 = tsVar.f142378d;
                        C87412m.m108593f(str3, "joinChatRoomUrl");
                        if (!C12969d.m12408b(str3, "http", true)) {
                            Log.m105924i("MicroMsg.ChatRoomOpenService", "join chat room url is not http:" + str3);
                            str3 = HttpWrapperBase.PROTOCAL_HTTP + str3;
                        }
                        Intent intent = new Intent();
                        intent.putExtra("rawUrl", str3);
                        intent.putExtra(C74928u.C45093i.f122327s, true);
                        Log.m105924i("MicroMsg.ChatRoomOpenService", "join room url:" + str3);
                        C88144b.m109791i(this.f29521h, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                        return C13598b0.f38549a;
                    }
                }
                Intent intent2 = new Intent();
                Context context = this.f29521h;
                intent2.setClassName(context, "com.tencent.mm.chatroom.ui.ChatRoomOpenErrorInfoUI");
                String str4 = (tsVar == null || (e5Var4 = tsVar.f142379e) == null) ? null : e5Var4.f132694d;
                String string = str4 == null || str4.length() == 0 ? context.getString(C0966R.string.b45) : (tsVar == null || (e5Var3 = tsVar.f142379e) == null) ? null : e5Var3.f132694d;
                String str5 = (tsVar == null || (e5Var2 = tsVar.f142379e) == null) ? null : e5Var2.f132695e;
                if (!(str5 == null || str5.length() == 0)) {
                    z = false;
                }
                if (z) {
                    str = string;
                } else if (!(tsVar == null || (e5Var = tsVar.f142379e) == null)) {
                    str = e5Var.f132695e;
                }
                intent2.putExtra("key_error_title", string);
                intent2.putExtra("key_error_content", str);
                Context context2 = this.f29521h;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent2);
                Context context3 = context2;
                C117292a.m165358d(context3, aVar2.mo10232b(), "com/tencent/mm/chatroom/api/ChatRoomOpenService$doCheckAppJoinChatRoom$2$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(context3, "com/tencent/mm/chatroom/api/ChatRoomOpenService$doCheckAppJoinChatRoom$2$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return C13598b0.f38549a;
            }
        }

        public C9453j(C8479f0<C89779i0> f0Var, Context context) {
            this.f29515a = f0Var;
            this.f29516b = context;
        }

        /* renamed from: a */
        public final void mo288a(int i, int i2, String str, C47350c cVar) {
            C61926c.m72668M(new C9454a(this.f29515a, cVar, i, i2, this.f29516b));
        }
    }

    public void J80(Context context, C7994b0.C7996b bVar, C7994b0.C7995a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "param");
        C48957c5 c5Var = new C48957c5();
        c5Var.f131512d = bVar.f26678d;
        c5Var.f131515g = bVar.f26681g;
        c5Var.f131513e = bVar.f26679e;
        c5Var.f131514f = bVar.f26680f;
        c5Var.f131516h = bVar.f26684j;
        c5Var.f131517i = bVar.f26683i;
        c5Var.f131518j = bVar.f26685n;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 5285;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/appbindchatroom";
        bVar2.f127066a = c5Var;
        bVar2.f127067b = new C49096d5();
        C8479f0 f0Var = new C8479f0();
        C61926c.m72668M(new C9439a(f0Var, context));
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar2.mo72403a(), new C9440b(f0Var, bVar, aVar, context));
    }

    /* renamed from: hp */
    public void mo9096hp(Context context, C7994b0.C7996b bVar, C7994b0.C7995a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "param");
        MMFragmentActivity mMFragmentActivity = context instanceof MMFragmentActivity ? (MMFragmentActivity) context : null;
        if (mMFragmentActivity == null) {
            Log.m105920e("MicroMsg.ChatRoomOpenService", "context is not MMActivity");
            return;
        }
        C50722os osVar = new C50722os();
        osVar.f139342d = bVar.f26678d;
        osVar.f139345g = bVar.f26681g;
        osVar.f139343e = bVar.f26679e;
        osVar.f139344f = bVar.f26680f;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 1023;
        bVar2.f127068c = "/cgi-bin/mmbiz-bin/wxabusiness/checkappbindchatroom";
        bVar2.f127066a = osVar;
        bVar2.f127067b = new C50866ps();
        C8479f0 f0Var = new C8479f0();
        C61926c.m72668M(new C9447g(f0Var, context));
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar2.mo72403a(), new C9448h(bVar, mMFragmentActivity, context, aVar, f0Var, this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* renamed from: iq */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9097iq(android.content.Context r11, f62.C7994b0.C7996b r12, java.lang.String r13, f62.C7994b0.C7997c r14) {
        /*
            r10 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "param"
            gy3.C87412m.m108594g(r12, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            r2 = 0
            if (r13 == 0) goto L_0x0020
            int r3 = r13.length()
            if (r3 <= 0) goto L_0x001b
            r3 = 1
            goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            if (r3 != r1) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r3 == 0) goto L_0x006b
            java.lang.String r3 = ","
            java.lang.String[] r5 = new java.lang.String[]{r3}
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r13
            java.util.List r13 = z04.C112550d0.m153785U(r4, r5, r6, r7, r8, r9)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x003b:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L_0x0057
            java.lang.Object r4 = r13.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x0050
            r5 = 1
            goto L_0x0051
        L_0x0050:
            r5 = 0
        L_0x0051:
            if (r5 == 0) goto L_0x003b
            r3.add(r4)
            goto L_0x003b
        L_0x0057:
            java.util.Iterator r13 = r3.iterator()
        L_0x005b:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x006b
            java.lang.Object r1 = r13.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.add(r1)
            goto L_0x005b
        L_0x006b:
            gy3.f0 r13 = new gy3.f0
            r13.<init>()
            ji.a$c r1 = new ji.a$c
            r1.<init>(r13, r11)
            o40.C61926c.m72668M(r1)
            java.lang.Class<fx.c> r1 = p530fx.C45819c.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            fx.c r1 = (p530fx.C45819c) r1
            java.lang.String r2 = "@chatroom"
            og3.c r1 = r1.mo71192mK(r2)
            java.lang.String r2 = r12.f26678d
            java.lang.String r12 = r12.f26683i
            java.lang.String r3 = ""
            com.tencent.mm.roomsdk.model.factory.a r12 = r1.mo71496g(r3, r0, r2, r12)
            ji.a$d r0 = new ji.a$d
            r0.<init>(r13, r14, r11)
            r12.f212615d = r0
            r12.mo100865c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p177ji.C9438a.mo9097iq(android.content.Context, f62.b0$b, java.lang.String, f62.b0$c):void");
    }

    public void l60(Context context, C7994b0.C7996b bVar, C7994b0.C7997c cVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "param");
        C51062r6 r6Var = new C51062r6();
        r6Var.f140717d = bVar.f26678d;
        r6Var.f140718e = bVar.f26684j;
        r6Var.f140719f = bVar.f26686o;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 6892;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/appunbindchatroom";
        bVar2.f127066a = r6Var;
        bVar2.f127067b = new C51202s6();
        C8479f0 f0Var = new C8479f0();
        C61926c.m72668M(new C9444e(f0Var, context));
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar2.mo72403a(), new C9445f(f0Var, bVar, context, cVar));
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
    }

    public void vt0(Context context, C7994b0.C7996b bVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "param");
        C51290ss ssVar = new C51290ss();
        ssVar.f141710d = bVar.f26678d;
        ssVar.f141713g = bVar.f26681g;
        ssVar.f141711e = bVar.f26679e;
        ssVar.f141712f = bVar.f26680f;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 1969;
        bVar2.f127068c = "/cgi-bin/mmbiz-bin/wxabusiness/checkappjoinchatroom";
        bVar2.f127066a = ssVar;
        bVar2.f127067b = new C51437ts();
        C8479f0 f0Var = new C8479f0();
        C61926c.m72668M(new C9452i(f0Var, context));
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar2.mo72403a(), new C9453j(f0Var, context));
    }
}
