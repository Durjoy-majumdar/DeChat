package ml3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.bizchat.BizChatFavUI;
import com.tencent.p014mm.p136ui.conversation.presenter.BaseBizConversationUI;
import com.tencent.p014mm.p136ui.tools.C74866y0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import ob0.C117747y;
import p910lj.C76701a;
import qo3.C89779i0;
import rb0.C47964c0;
import rb0.C47969h;
import rb0.C48009v0;
import sb0.C48334c;
import sb0.C48353j;
import sb0.C48359n;
import te3.C50254lf;
import ub0.C52509c;

/* renamed from: ml3.f */
public class C47067f implements MenuItem.OnMenuItemClickListener, MMActivity.C6739d, C47964c0 {

    /* renamed from: d */
    public final MMFragmentActivity f126488d;

    /* renamed from: e */
    public C74866y0 f126489e;

    /* renamed from: f */
    public C89779i0 f126490f;

    /* renamed from: g */
    public String f126491g;

    /* renamed from: h */
    public C47969h f126492h;

    /* renamed from: i */
    public String f126493i;

    /* renamed from: j */
    public C48353j f126494j;

    /* renamed from: n */
    public C52509c f126495n = new C52509c();

    /* renamed from: ml3.f$a */
    public class C47068a implements C11182m0 {
        public C47068a() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            String str;
            C47067f fVar = C47067f.this;
            C47969h hVar = fVar.f126492h;
            boolean z = false;
            boolean z2 = true;
            if (!(hVar != null && hVar.field_hide_create_chat) && fVar.mo72216a()) {
                z = true;
            }
            if (z) {
                e0Var.mo107135b(1, C0966R.string.arj, C0966R.raw.actionbar_create_biz_chat_icon);
            }
            try {
                z2 = C48009v0.Ex0().mo72749jo(C47067f.this.f126491g).field_hide_colleage_invite;
            } catch (Throwable unused) {
            }
            if (!z2) {
                try {
                    C47969h jo = C48009v0.Ex0().mo72749jo(C47067f.this.f126491g);
                    C50254lf lfVar = new C50254lf();
                    lfVar.parseFrom(jo.field_raw_attrs);
                    str = lfVar.f137370f;
                } catch (Throwable unused2) {
                    str = "";
                }
                if (Util.isNullOrNil(str)) {
                    e0Var.mo107135b(2, C0966R.string.ari, C0966R.raw.ofm_add_icon);
                } else {
                    e0Var.mo107144g(2, str, C0966R.raw.ofm_add_icon);
                }
            }
            if (z) {
                e0Var.mo107152l(4, C47067f.this.f126488d.getResources().getString(C0966R.string.arh), C74933u4.m89768e(C47067f.this.f126488d, C0966R.raw.actionbar_facefriend_icon, -1));
            }
            e0Var.mo107152l(3, C47067f.this.f126488d.getResources().getString(C0966R.string.f7375ef), C74933u4.m89768e(C47067f.this.f126488d, C0966R.raw.actionbar_setting_white_icon, -1));
        }
    }

    /* renamed from: ml3.f$b */
    public class C47069b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ boolean f126497d;

        /* renamed from: e */
        public final /* synthetic */ String f126498e;

        public C47069b(boolean z, String str) {
            this.f126497d = z;
            this.f126498e = str;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C48353j jVar;
            int itemId = menuItem.getItemId();
            boolean z = false;
            if (itemId == 1) {
                C47067f fVar = C47067f.this;
                if (!fVar.mo72216a()) {
                    C76701a.makeText((Context) fVar.f126488d, (CharSequence) fVar.mo72217b(C0966R.string.ark), 0).show();
                    String Pk = C48009v0.Bx0().mo73076Pk(fVar.f126493i);
                    C48353j jVar2 = C48009v0.Bx0().get(Pk);
                    fVar.f126494j = jVar2;
                    Object[] objArr = new Object[3];
                    objArr[0] = fVar.f126493i;
                    objArr[1] = Pk;
                    if (jVar2 == null) {
                        z = true;
                    }
                    objArr[2] = Boolean.valueOf(z);
                    Log.m105925i("EnterpriseConversationDropMenuPresenter", "updateBizChatMyUserInfo: %s:%s,myBizChatUserInfo is null:%s", objArr);
                    if (Util.isNullOrNil(Pk) || (jVar = fVar.f126494j) == null || jVar.mo73074m2() || Util.isNullOrNil(fVar.f126494j.field_addMemberUrl)) {
                        C48009v0.yx0().mo73062h(fVar.f126493i, fVar);
                        fVar.f126490f = C76879j.m92723Q(fVar.f126488d, fVar.mo72217b(C0966R.string.a3h), fVar.mo72217b(C0966R.string.a4d), true, true, new C47070g(fVar));
                        return;
                    }
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra("rawUrl", fVar.f126494j.field_addMemberUrl);
                Log.m105925i("EnterpriseConversationDropMenuPresenter", "KRawUrl :%s", fVar.f126494j.field_addMemberUrl);
                intent.putExtra("useJs", true);
                intent.addFlags(67108864);
                MMFragmentActivity mMFragmentActivity = fVar.f126488d;
                if (mMFragmentActivity instanceof MMActivity) {
                    ((MMActivity) mMFragmentActivity).mmSetOnActivityResultCallback(fVar);
                } else if (mMFragmentActivity instanceof BaseBizConversationUI) {
                    ((BaseBizConversationUI) mMFragmentActivity).f122061d = fVar;
                }
                C88144b.m109795m(fVar.f126488d, "webview", ".ui.tools.WebViewUI", intent, 1);
            } else if (itemId != 2) {
                if (itemId == 3) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("Contact_User", C47067f.this.f126491g);
                    C88144b.m109791i(C47067f.this.f126488d, Scopes.PROFILE, ".ui.ContactInfoUI", intent2, (Bundle) null);
                } else if (itemId == 4) {
                    if (!Util.isNullOrNil(C47067f.this.f126493i)) {
                        Intent intent3 = new Intent(C47067f.this.f126488d, BizChatFavUI.class);
                        intent3.putExtra("Contact_User", C47067f.this.f126493i);
                        intent3.addFlags(67108864);
                        MMFragmentActivity mMFragmentActivity2 = C47067f.this.f126488d;
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent3);
                        MMFragmentActivity mMFragmentActivity3 = mMFragmentActivity2;
                        C117292a.m165358d(mMFragmentActivity3, aVar.mo10232b(), "com/tencent/mm/ui/conversation/presenter/EnterpriseConversationDropMenuPresenter$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        mMFragmentActivity2.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(mMFragmentActivity3, "com/tencent/mm/ui/conversation/presenter/EnterpriseConversationDropMenuPresenter$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return;
                    }
                    Log.m105920e("EnterpriseConversationDropMenuPresenter", "brandUserName null");
                }
            } else if (this.f126497d) {
                Intent intent4 = new Intent();
                intent4.putExtra("rawUrl", this.f126498e);
                Log.m105925i("EnterpriseConversationDropMenuPresenter", "KRawUrl :%s", this.f126498e);
                intent4.putExtra("useJs", true);
                intent4.addFlags(67108864);
                C88144b.m109795m(C47067f.this.f126488d, "webview", ".ui.tools.WebViewUI", intent4, 0);
            } else {
                C47067f fVar2 = C47067f.this;
                fVar2.f126495n.mo73443a(fVar2.f126491g);
                C47067f fVar3 = C47067f.this;
                fVar3.f126495n.mo73444b(fVar3.f126488d);
            }
        }
    }

    public C47067f(MMFragmentActivity mMFragmentActivity, String str) {
        this.f126488d = mMFragmentActivity;
        this.f126491g = str;
        C47969h jo = C48009v0.Ex0().mo72749jo(str);
        this.f126492h = jo;
        if (jo == null) {
            Log.m105929w("EnterpriseConversationDropMenuPresenter", "init fatherAttr is null, username=%s", str);
        }
        this.f126493i = C48009v0.Fx0().mo72758TE(str);
    }

    /* renamed from: a */
    public final boolean mo72216a() {
        C48353j jVar = C48009v0.Bx0().get(C48009v0.Bx0().mo73076Pk(this.f126493i));
        this.f126494j = jVar;
        return jVar != null && !Util.isNullOrNil(jVar.field_addMemberUrl);
    }

    /* renamed from: b */
    public final String mo72217b(int i) {
        return this.f126488d.getString(i);
    }

    /* renamed from: c */
    public final void mo72218c(long j) {
        if (this.f126488d instanceof BaseBizConversationUI) {
            Bundle bundle = new Bundle();
            bundle.putLong("key_biz_chat_id", j);
            bundle.putBoolean("finish_direct", false);
            bundle.putBoolean("key_need_send_video", false);
            bundle.putBoolean("key_is_biz_chat", true);
            ((BaseBizConversationUI) this.f126488d).startChatting(this.f126493i, bundle, true);
        }
    }

    /* renamed from: c7 */
    public void mo7311c7(int i, C117747y yVar) {
        C89779i0 i0Var = this.f126490f;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f126490f = null;
        }
        if (yVar.getType() == 1355) {
            C48334c Lo = C48009v0.Ax0().mo73039Lo(((C48359n) yVar).mo73080j1().f144378e.f143623d.f144611d);
            if (Lo == null) {
                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) mo72217b(C0966R.string.f361211i61), 0).show();
            } else {
                mo72218c(Lo.field_bizChatLocalId);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mmOnActivityResult(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            r0 = -1
            if (r8 != r0) goto L_0x0087
            if (r9 != 0) goto L_0x0007
            goto L_0x0087
        L_0x0007:
            r8 = 1
            if (r7 == r8) goto L_0x000b
            return
        L_0x000b:
            java.lang.String r7 = "result_data"
            android.os.Bundle r7 = r9.getBundleExtra(r7)
            r9 = 0
            if (r7 == 0) goto L_0x0074
            java.lang.String r0 = "EnterpriseConversationDropMenuPresenter"
            java.lang.String r1 = "bundle != null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.lang.String r0 = "enterprise_members"
            java.lang.String r7 = r7.getString(r0)
            te3.vq1 r0 = new te3.vq1
            r0.<init>()
            sb0.c r1 = new sb0.c
            r1.<init>()
            sb0.j r2 = r6.f126494j
            r3 = 0
            if (r2 == 0) goto L_0x0033
            java.lang.String r2 = r2.field_addMemberUrl
            goto L_0x0034
        L_0x0033:
            r2 = r3
        L_0x0034:
            r1.field_addMemberUrl = r2
            java.lang.String r2 = r6.f126493i
            r1.field_brandUserName = r2
            boolean r7 = sb0.C48340e.m53660a(r1, r7, r3, r0)
            if (r7 == 0) goto L_0x0074
            long r1 = r1.field_bizChatLocalId
            r3 = -1
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x004c
            r6.mo72218c(r1)
            goto L_0x0075
        L_0x004c:
            sb0.h r7 = rb0.C48009v0.yx0()
            java.lang.String r1 = r6.f126493i
            sb0.n r7 = r7.mo73058e(r1, r0, r6)
            com.tencent.mm.ui.MMFragmentActivity r0 = r6.f126488d
            r1 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r1 = r6.mo72217b(r1)
            r2 = 2131821739(0x7f1104ab, float:1.927623E38)
            java.lang.String r2 = r6.mo72217b(r2)
            r3 = 1
            r4 = 1
            ml3.h r5 = new ml3.h
            r5.<init>(r6, r7)
            qo3.i0 r7 = nj3.C76879j.m92723Q(r0, r1, r2, r3, r4, r5)
            r6.f126490f = r7
            goto L_0x0075
        L_0x0074:
            r8 = 0
        L_0x0075:
            if (r8 != 0) goto L_0x0087
            com.tencent.mm.ui.MMFragmentActivity r7 = r6.f126488d
            r8 = 2131834929(0x7f113831, float:1.9302982E38)
            java.lang.String r8 = r6.mo72217b(r8)
            android.widget.Toast r7 = p910lj.C76701a.makeText((android.content.Context) r7, (java.lang.CharSequence) r8, (int) r9)
            r7.show()
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ml3.C47067f.mmOnActivityResult(int, int, android.content.Intent):void");
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        String str;
        try {
            C47969h jo = C48009v0.Ex0().mo72749jo(this.f126491g);
            C50254lf lfVar = new C50254lf();
            lfVar.parseFrom(jo.field_raw_attrs);
            str = lfVar.f137371g;
        } catch (Throwable unused) {
            str = "";
        }
        boolean z = !Util.isNullOrNil(str);
        if (!z) {
            this.f126495n.mo73443a(this.f126491g);
        }
        C74866y0 y0Var = this.f126489e;
        if (y0Var != null) {
            y0Var.mo104068a();
            this.f126489e = null;
        }
        C74866y0 y0Var2 = new C74866y0(this.f126488d);
        this.f126489e = y0Var2;
        y0Var2.f220117u = new C47068a();
        y0Var2.f220118v = new C47069b(z, str);
        y0Var2.mo103923d();
        return false;
    }
}
