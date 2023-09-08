package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.GetA8KeyRedirectEvent;
import com.tencent.p014mm.modelsimple.C40368s;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.p136ui.contact.C74584x;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75597w2;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.LinkedList;
import k20.C9556a;
import ke3.C88144b;
import ob0.C11385n;
import ob0.C117747y;
import p910lj.C76701a;
import rb0.C48009v0;
import te3.C51163rv3;

/* renamed from: com.tencent.mm.ui.CheckCanSubscribeBizUI */
public class CheckCanSubscribeBizUI extends MMActivity implements MStorageEx.IOnStorageChange, C11385n, MStorage.IOnStorageChange {

    /* renamed from: d */
    public String f121112d;

    /* renamed from: e */
    public String f121113e;

    /* renamed from: f */
    public String f121114f;

    /* renamed from: g */
    public int f121115g;

    /* renamed from: h */
    public LinkedList<C51163rv3> f121116h;

    /* renamed from: i */
    public String f121117i;

    /* renamed from: j */
    public int f121118j;

    /* renamed from: n */
    public int f121119n;

    /* renamed from: o */
    public boolean f121120o = false;

    /* renamed from: p */
    public boolean f121121p = false;

    /* renamed from: q */
    public String f121122q;

    /* renamed from: r */
    public boolean f121123r = false;

    /* renamed from: s */
    public boolean f121124s = false;

    /* renamed from: t */
    public boolean f121125t = false;

    /* renamed from: u */
    public int f121126u;

    /* renamed from: v */
    public String f121127v;

    /* renamed from: w */
    public int f121128w = 0;

    /* renamed from: com.tencent.mm.ui.CheckCanSubscribeBizUI$a */
    public class C44677a implements C75597w2.C31525a {

        /* renamed from: com.tencent.mm.ui.CheckCanSubscribeBizUI$a$a */
        public class C44678a implements Runnable {
            public C44678a() {
            }

            public void run() {
                Log.m105924i("MicroMsg.CheckCanSubscribeBizUI", "getContactCallBack fail run");
                CheckCanSubscribeBizUI checkCanSubscribeBizUI = CheckCanSubscribeBizUI.this;
                checkCanSubscribeBizUI.f121125t = true;
                if (!checkCanSubscribeBizUI.f121121p && !checkCanSubscribeBizUI.isDestroyed()) {
                    CheckCanSubscribeBizUI.m49408H7(CheckCanSubscribeBizUI.this);
                }
            }
        }

        public C44677a() {
        }

        /* renamed from: a */
        public void mo1109a(String str, boolean z) {
            Log.m105924i("MicroMsg.CheckCanSubscribeBizUI", "hasConcerned  getContactCallBack  succ:" + z);
            if (!z) {
                new MMHandler().post(new C44678a());
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.CheckCanSubscribeBizUI$b */
    public class C44679b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f121131d;

        public C44679b(String str) {
            this.f121131d = str;
        }

        public void run() {
            Log.m105918d("MicroMsg.CheckCanSubscribeBizUI", "onNotifyChange toUserName = " + CheckCanSubscribeBizUI.this.f121113e + ", userName = " + this.f121131d);
            if (CheckCanSubscribeBizUI.this.f121113e.equals(this.f121131d)) {
                CheckCanSubscribeBizUI checkCanSubscribeBizUI = CheckCanSubscribeBizUI.this;
                checkCanSubscribeBizUI.f121120o = true;
                if (!checkCanSubscribeBizUI.f121121p) {
                    CheckCanSubscribeBizUI.m49408H7(checkCanSubscribeBizUI);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* renamed from: H7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m49408H7(com.tencent.p014mm.p136ui.CheckCanSubscribeBizUI r9) {
        /*
            monitor-enter(r9)
            java.lang.String r0 = "MicroMsg.CheckCanSubscribeBizUI"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            r1.<init>()     // Catch:{ all -> 0x00bd }
            java.lang.String r2 = "dealSuccess..,canJump = "
            r1.append(r2)     // Catch:{ all -> 0x00bd }
            boolean r2 = r9.f121120o     // Catch:{ all -> 0x00bd }
            r1.append(r2)     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00bd }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x00bd }
            int r0 = r9.f121126u     // Catch:{ all -> 0x00bd }
            r1 = 1
            if (r0 != r1) goto L_0x003f
            java.lang.String r0 = "MicroMsg.CheckCanSubscribeBizUI"
            java.lang.String r1 = "dealSuccess  MM_CHECK_CAN_SUBSCRIBE_BIZ_SCENE_WEBVIEW"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x00bd }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x00bd }
            r0.<init>()     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = "rawUrl"
            java.lang.String r2 = r9.f121127v     // Catch:{ all -> 0x00bd }
            r0.putExtra(r1, r2)     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = "webview"
            java.lang.String r2 = ".ui.tools.WebViewUI"
            r3 = 0
            ke3.C88144b.m109791i(r9, r1, r2, r0, r3)     // Catch:{ all -> 0x00bd }
            r9.finish()     // Catch:{ all -> 0x00bd }
            monitor-exit(r9)
            goto L_0x00bc
        L_0x003f:
            if (r0 != 0) goto L_0x0090
            int r0 = r9.f121128w     // Catch:{ all -> 0x00bd }
            if (r0 != r1) goto L_0x0090
            java.lang.String r0 = "MicroMsg.CheckCanSubscribeBizUI"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            r2.<init>()     // Catch:{ all -> 0x00bd }
            java.lang.String r3 = "dealSuccess  MM_CHECK_CAN_SUBSCRIBE_BIZ_SCENE_PROFILE  extInfo:"
            r2.append(r3)     // Catch:{ all -> 0x00bd }
            java.lang.String r3 = r9.f121114f     // Catch:{ all -> 0x00bd }
            r2.append(r3)     // Catch:{ all -> 0x00bd }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00bd }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ all -> 0x00bd }
            boolean r0 = r9.f121124s     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x006a
            java.lang.String r0 = "MicroMsg.CheckCanSubscribeBizUI"
            java.lang.String r1 = "has jump ignore this scene"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x00bd }
            monitor-exit(r9)
            goto L_0x00bc
        L_0x006a:
            r9.f121124s = r1     // Catch:{ all -> 0x00bd }
            ob0.b0 r0 = eb0.C97625j3.m125815e()     // Catch:{ all -> 0x00bd }
            r1 = 233(0xe9, float:3.27E-43)
            r0.mo123455a(r1, r9)     // Catch:{ all -> 0x00bd }
            com.tencent.mm.modelsimple.s r0 = new com.tencent.mm.modelsimple.s     // Catch:{ all -> 0x00bd }
            java.lang.String r3 = r9.f121114f     // Catch:{ all -> 0x00bd }
            r4 = 0
            r5 = 4
            r6 = 0
            int r7 = qe3.C12212g.m11775a()     // Catch:{ all -> 0x00bd }
            r1 = 0
            byte[] r8 = new byte[r1]     // Catch:{ all -> 0x00bd }
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00bd }
            ob0.b0 r1 = eb0.C97625j3.m125815e()     // Catch:{ all -> 0x00bd }
            r1.mo123460f(r0)     // Catch:{ all -> 0x00bd }
            monitor-exit(r9)
            goto L_0x00bc
        L_0x0090:
            boolean r0 = r9.mo69832J7()     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x00a5
            boolean r0 = r9.f121120o     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x00a5
            java.lang.String r0 = "MicroMsg.CheckCanSubscribeBizUI"
            java.lang.String r1 = "dealSuccess  jumpToChattingUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x00bd }
            r9.mo69833K7()     // Catch:{ all -> 0x00bd }
            goto L_0x00bb
        L_0x00a5:
            boolean r0 = r9.f121120o     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x00b4
            java.lang.String r0 = "MicroMsg.CheckCanSubscribeBizUI"
            java.lang.String r1 = "dealSuccess  jumpToContactInfoUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x00bd }
            r9.mo69834L7()     // Catch:{ all -> 0x00bd }
            goto L_0x00bb
        L_0x00b4:
            java.lang.String r0 = "MicroMsg.CheckCanSubscribeBizUI"
            java.lang.String r1 = "dealSuccess  not canJump"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x00bd }
        L_0x00bb:
            monitor-exit(r9)
        L_0x00bc:
            return
        L_0x00bd:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.CheckCanSubscribeBizUI.m49408H7(com.tencent.mm.ui.CheckCanSubscribeBizUI):void");
    }

    /* renamed from: I7 */
    public final void mo69831I7(int i, int i2, String str) {
        C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.k9t), 1).show();
        if (this.f121118j == 1) {
            LauncherUI.m85941U7(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ce, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0098  */
    /* renamed from: J7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo69832J7() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)     // Catch:{ all -> 0x00ed }
            f62.k0 r0 = (f62.C75700k0) r0     // Catch:{ all -> 0x00ed }
            com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()     // Catch:{ all -> 0x00ed }
            java.lang.String r1 = r6.f121113e     // Catch:{ all -> 0x00ed }
            com.tencent.mm.storage.z1 r0 = r0.get(r1)     // Catch:{ all -> 0x00ed }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001f
            long r3 = r0.f108320R1     // Catch:{ all -> 0x00ed }
            int r4 = (int) r3     // Catch:{ all -> 0x00ed }
            if (r4 != 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            goto L_0x003b
        L_0x001f:
            java.lang.String r3 = "MicroMsg.CheckCanSubscribeBizUI"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ed }
            r4.<init>()     // Catch:{ all -> 0x00ed }
            java.lang.String r5 = "contact is null == "
            r4.append(r5)     // Catch:{ all -> 0x00ed }
            if (r0 != 0) goto L_0x002f
            r5 = 1
            goto L_0x0030
        L_0x002f:
            r5 = 0
        L_0x0030:
            r4.append(r5)     // Catch:{ all -> 0x00ed }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00ed }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r4)     // Catch:{ all -> 0x00ed }
            r3 = 1
        L_0x003b:
            boolean r4 = r6.f121125t     // Catch:{ all -> 0x00ed }
            r5 = 5
            if (r4 == 0) goto L_0x0098
            if (r0 != 0) goto L_0x006b
            java.lang.String r0 = "MicroMsg.CheckCanSubscribeBizUI"
            java.lang.String r3 = "hasConcerned  contact == null  return false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ all -> 0x00ed }
            r6.f121120o = r1     // Catch:{ all -> 0x00ed }
            r6.setResult(r5)     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = "MicroMsg.CheckCanSubscribeBizUI"
            java.lang.String r3 = "showErrToast"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)     // Catch:{ all -> 0x00ed }
            r0 = 2131834621(0x7f1136fd, float:1.9302357E38)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r6, (int) r0, (int) r2)     // Catch:{ all -> 0x00ed }
            r0.show()     // Catch:{ all -> 0x00ed }
            int r0 = r6.f121118j     // Catch:{ all -> 0x00ed }
            if (r0 != r2) goto L_0x0066
            com.tencent.p014mm.p136ui.LauncherUI.m85941U7(r6)     // Catch:{ all -> 0x00ed }
        L_0x0066:
            r6.finish()     // Catch:{ all -> 0x00ed }
            monitor-exit(r6)
            return r1
        L_0x006b:
            java.lang.String r3 = "MicroMsg.CheckCanSubscribeBizUI"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ed }
            r4.<init>()     // Catch:{ all -> 0x00ed }
            java.lang.String r5 = "hasConcerned  isContact :"
            r4.append(r5)     // Catch:{ all -> 0x00ed }
            boolean r5 = r0.mo62927s3()     // Catch:{ all -> 0x00ed }
            r4.append(r5)     // Catch:{ all -> 0x00ed }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00ed }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)     // Catch:{ all -> 0x00ed }
            r6.f121120o = r2     // Catch:{ all -> 0x00ed }
            r6.f121121p = r2     // Catch:{ all -> 0x00ed }
            boolean r0 = r0.mo62927s3()     // Catch:{ all -> 0x00ed }
            if (r0 != 0) goto L_0x00e0
            java.lang.String r0 = "MicroMsg.CheckCanSubscribeBizUI"
            java.lang.String r2 = "hasConcerned  return false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ all -> 0x00ed }
            monitor-exit(r6)
            return r1
        L_0x0098:
            if (r3 == 0) goto L_0x00cf
            java.lang.String r0 = "MicroMsg.CheckCanSubscribeBizUI"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ed }
            r2.<init>()     // Catch:{ all -> 0x00ed }
            java.lang.String r3 = "hasConcerned  needToAddOrUpdateContact = true  canJump"
            r2.append(r3)     // Catch:{ all -> 0x00ed }
            boolean r3 = r6.f121120o     // Catch:{ all -> 0x00ed }
            r2.append(r3)     // Catch:{ all -> 0x00ed }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00ed }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ all -> 0x00ed }
            boolean r0 = r6.f121120o     // Catch:{ all -> 0x00ed }
            if (r0 == 0) goto L_0x00bd
            r6.setResult(r5)     // Catch:{ all -> 0x00ed }
            r6.finish()     // Catch:{ all -> 0x00ed }
            goto L_0x00cd
        L_0x00bd:
            eb0.w2 r0 = eb0.C31519v2.m39436a()     // Catch:{ all -> 0x00ed }
            java.lang.String r2 = r6.f121113e     // Catch:{ all -> 0x00ed }
            java.lang.String r3 = ""
            com.tencent.mm.ui.CheckCanSubscribeBizUI$a r4 = new com.tencent.mm.ui.CheckCanSubscribeBizUI$a     // Catch:{ all -> 0x00ed }
            r4.<init>()     // Catch:{ all -> 0x00ed }
            r0.mo55988e(r2, r3, r4)     // Catch:{ all -> 0x00ed }
        L_0x00cd:
            monitor-exit(r6)
            return r1
        L_0x00cf:
            boolean r0 = r0.mo62927s3()     // Catch:{ all -> 0x00ed }
            if (r0 != 0) goto L_0x00e0
            java.lang.String r0 = "MicroMsg.CheckCanSubscribeBizUI"
            java.lang.String r3 = "is not contact."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r3)     // Catch:{ all -> 0x00ed }
            r6.f121120o = r2     // Catch:{ all -> 0x00ed }
            monitor-exit(r6)
            return r1
        L_0x00e0:
            java.lang.String r0 = "MicroMsg.CheckCanSubscribeBizUI"
            java.lang.String r1 = "hasConcerned  return true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x00ed }
            r6.f121120o = r2     // Catch:{ all -> 0x00ed }
            r6.f121121p = r2     // Catch:{ all -> 0x00ed }
            monitor-exit(r6)
            return r2
        L_0x00ed:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.CheckCanSubscribeBizUI.mo69832J7():boolean");
    }

    /* renamed from: K7 */
    public final void mo69833K7() {
        if (!this.f121124s) {
            Log.m105924i("MicroMsg.CheckCanSubscribeBizUI", "jump to ChattingUI");
            Intent putExtra = new Intent().putExtra("Chat_User", this.f121113e);
            putExtra.putExtra("finish_direct", true);
            if (Util.isNullOrNil(this.f121113e)) {
                C74584x.m89302e(putExtra, this.f121113e);
            }
            putExtra.setClass(this, ChattingUI.class);
            if (!this.f121123r) {
                setResult(-1);
                this.f121124s = true;
                C9556a aVar = new C9556a();
                aVar.mo10233c(putExtra);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/ui/CheckCanSubscribeBizUI", "jumpToChattingUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/ui/CheckCanSubscribeBizUI", "jumpToChattingUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                finish();
            }
        }
    }

    /* renamed from: L7 */
    public final void mo69834L7() {
        if (!this.f121124s) {
            Log.m105924i("MicroMsg.CheckCanSubscribeBizUI", "jump to ContactInfoUI");
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f121113e);
            Intent intent = new Intent();
            intent.putExtra("Contact_Scene", this.f121119n);
            intent.putExtra("Verify_ticket", this.f121122q);
            intent.putExtra("force_get_contact", true);
            intent.putExtra("key_use_new_contact_profile", true);
            if (z1Var != null) {
                intent.putExtra("Contact_Alias", z1Var.mo62913l2());
                intent.putExtra("Contact_Nick", z1Var.getNickname());
                intent.putExtra("Contact_Signature", z1Var.f149516U);
                intent.putExtra("Contact_RegionCode", z1Var.f149556y0);
                intent.putExtra("Contact_Sex", z1Var.f149500H);
                intent.putExtra("Contact_VUser_Info", z1Var.f149554x0);
                intent.putExtra("Contact_VUser_Info_Flag", z1Var.mo73953E2());
                intent.putExtra("Contact_KWeibo_flag", z1Var.mo73955G2());
                intent.putExtra("Contact_KWeibo", z1Var.f149545p0);
                intent.putExtra("Contact_KWeiboNick", z1Var.mo73956H2());
            }
            intent.putExtra("Contact_User", this.f121113e);
            if (!this.f121123r) {
                setResult(-1);
                this.f121124s = true;
                C88144b.m109791i(this, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
                finish();
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b2z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x018e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            super.onCreate(r15)
            r14.hideTitleView()
            boolean r15 = eb0.C97625j3.m125820j()
            if (r15 == 0) goto L_0x01b0
            boolean r15 = f40.C86718e.m107551r()
            if (r15 == 0) goto L_0x0014
            goto L_0x01b0
        L_0x0014:
            ob0.b0 r15 = eb0.C97625j3.m125815e()
            r0 = 605(0x25d, float:8.48E-43)
            r15.mo123455a(r0, r14)
            java.lang.Class<f62.k0> r15 = f62.C75700k0.class
            k40.a r15 = f40.C86709a0.m107533q(r15)
            f62.k0 r15 = (f62.C75700k0) r15
            com.tencent.mm.storage.u3 r15 = r15.mo96097Ni()
            r15.add(r14)
            rb0.j r15 = rb0.C48009v0.Fx0()
            r15.add(r14)
            android.content.Intent r15 = r14.getIntent()
            r1 = 2
            java.lang.String r2 = "MicroMsg.CheckCanSubscribeBizUI"
            r3 = 0
            r4 = 1
            if (r15 != 0) goto L_0x0045
            java.lang.String r15 = "intent is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r15)
            goto L_0x011b
        L_0x0045:
            java.lang.String r5 = "appId"
            java.lang.String r5 = r15.getStringExtra(r5)
            r14.f121112d = r5
            java.lang.String r5 = "toUserName"
            java.lang.String r5 = r15.getStringExtra(r5)
            r14.f121113e = r5
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x0062
            java.lang.String r15 = "toUserName is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r15)
            goto L_0x011b
        L_0x0062:
            java.lang.String r5 = "extInfo"
            java.lang.String r5 = r15.getStringExtra(r5)
            r14.f121114f = r5
            r5 = -1
            java.lang.String r6 = "source"
            int r5 = r15.getIntExtra(r6, r5)
            r14.f121118j = r5
            java.lang.String r5 = "scene"
            int r5 = r15.getIntExtra(r5, r3)
            r14.f121126u = r5
            java.lang.String r5 = "jump_profile_type"
            int r5 = r15.getIntExtra(r5, r3)
            r14.f121128w = r5
            int r5 = r14.f121118j
            if (r5 == r4) goto L_0x009e
            if (r5 == r1) goto L_0x0098
            java.lang.Object[] r15 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r15[r3] = r5
            java.lang.String r5 = "source(%d) is invalidated."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r5, r15)
            goto L_0x011b
        L_0x0098:
            r5 = 69
            r14.f121119n = r5
            goto L_0x010c
        L_0x009e:
            java.lang.String r5 = r14.f121112d
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x00ad
            java.lang.String r15 = "appId is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r15)
            goto L_0x011b
        L_0x00ad:
            r5 = 68
            r14.f121119n = r5
            java.lang.String r5 = "androidPackNameList"
            java.util.ArrayList r5 = r15.getStringArrayListExtra(r5)
            if (r5 == 0) goto L_0x0116
            int r6 = r5.size()
            if (r6 != 0) goto L_0x00c0
            goto L_0x0116
        L_0x00c0:
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            r14.f121116h = r6
            r6 = 0
        L_0x00c8:
            int r7 = r5.size()
            if (r6 >= r7) goto L_0x00f6
            java.lang.Object r7 = r5.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r8 == 0) goto L_0x00db
            goto L_0x00f3
        L_0x00db:
            java.lang.Object[] r8 = new java.lang.Object[r1]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r8[r3] = r9
            r8[r4] = r7
            java.lang.String r9 = "packName(%d) : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r9, r8)
            java.util.LinkedList<te3.rv3> r8 = r14.f121116h
            te3.rv3 r7 = sf0.C48374j0.m53720i(r7)
            r8.add(r7)
        L_0x00f3:
            int r6 = r6 + 1
            goto L_0x00c8
        L_0x00f6:
            java.util.LinkedList<te3.rv3> r5 = r14.f121116h
            int r5 = r5.size()
            if (r5 != 0) goto L_0x0104
            java.lang.String r15 = "androidPackNameList is nil."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r15)
            goto L_0x011b
        L_0x0104:
            java.util.LinkedList<te3.rv3> r5 = r14.f121116h
            int r5 = r5.size()
            r14.f121115g = r5
        L_0x010c:
            java.lang.String r5 = "fromURL"
            java.lang.String r15 = r15.getStringExtra(r5)
            r14.f121117i = r15
            r15 = 1
            goto L_0x011c
        L_0x0116:
            java.lang.String r15 = "androidPackNameList is null or nil."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r15)
        L_0x011b:
            r15 = 0
        L_0x011c:
            if (r15 == 0) goto L_0x018e
            java.lang.String r15 = "onCreate initData  doCheckCanSubscribeBiz"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r15)
            java.lang.String r15 = r14.f121112d
            java.lang.String r5 = r14.f121113e
            java.lang.String r6 = r14.f121114f
            int r7 = r14.f121115g
            java.util.LinkedList<te3.rv3> r8 = r14.f121116h
            java.lang.String r9 = r14.f121117i
            int r10 = r14.f121118j
            int r11 = r14.f121126u
            ob0.c$b r12 = new ob0.c$b
            r12.<init>()
            te3.jt r13 = new te3.jt
            r13.<init>()
            r12.f127066a = r13
            te3.kt r13 = new te3.kt
            r13.<init>()
            r12.f127067b = r13
            java.lang.String r13 = "/cgi-bin/micromsg-bin/checkcansubscribebiz"
            r12.f127068c = r13
            r12.f127069d = r0
            ob0.c r0 = r12.mo72403a()
            ob0.c$c r12 = r0.f127055a
            pe3.a r12 = r12.f127080a
            te3.jt r12 = (te3.C50033jt) r12
            r12.f136304g = r15
            r12.f136302e = r5
            r12.f136303f = r6
            r12.f136305h = r7
            r12.f136306i = r8
            r8 = 0
            r12.f136307j = r8
            r12.f136308n = r9
            r12.f136301d = r10
            r12.f136309o = r11
            r8 = 5
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r3] = r15
            r8[r4] = r5
            r8[r1] = r6
            r15 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r8[r15] = r1
            r15 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r8[r15] = r1
            java.lang.String r15 = "appId(%s) , toUsername(%s) , extInfo(%s) , packNum(%d), scene(%d)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r15, r8)
            com.tencent.mm.ui.r r15 = new com.tencent.mm.ui.r
            r15.<init>(r14)
            ob0.C89144l0.m111429e(r0, r15, r3)
            goto L_0x01af
        L_0x018e:
            java.lang.String r15 = "onCreate initData fail, RESULT_CODE_PARAMETER_ERROR"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r15)
            r14.setResult(r1)
            java.lang.String r15 = "showErrToast"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r15)
            r15 = 2131834621(0x7f1136fd, float:1.9302357E38)
            android.widget.Toast r15 = p910lj.C76701a.makeText((android.content.Context) r14, (int) r15, (int) r4)
            r15.show()
            int r15 = r14.f121118j
            if (r15 != r4) goto L_0x01ac
            com.tencent.p014mm.p136ui.LauncherUI.m85941U7(r14)
        L_0x01ac:
            r14.finish()
        L_0x01af:
            return
        L_0x01b0:
            android.content.Intent r15 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.account.ui.SimpleLoginUI> r0 = com.tencent.p014mm.plugin.account.p024ui.SimpleLoginUI.class
            r15.<init>(r14, r0)
            android.content.Intent r0 = r14.getIntent()
            com.tencent.p014mm.p136ui.MMWizardActivity.m7018M7(r14, r15, r0)
            r14.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.CheckCanSubscribeBizUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        LinkedList<C51163rv3> linkedList = this.f121116h;
        if (linkedList != null) {
            linkedList.clear();
        }
        if (C97625j3.m125811a()) {
            C97625j3.m125815e().mo123470p(605, this);
            C48009v0.Fx0().remove(this);
            ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().remove(this);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getRepeatCount() == 0) {
            this.f121123r = true;
            if (this.f121124s) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        new MMHandler().post(new C44679b(str));
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105918d("MicroMsg.CheckCanSubscribeBizUI", "onSceneEnd, errType = " + i + ", errCode = " + i2);
        if (yVar.getType() == 605) {
            Log.m105924i("MicroMsg.CheckCanSubscribeBizUI", "onSceneEnd, MMFunc_CheckCanSubscribeBiz  do nothing");
        } else if (yVar.getType() == 233) {
            Log.m105924i("MicroMsg.CheckCanSubscribeBizUI", "onSceneEnd, MMFunc_GetA8Key");
            C97625j3.m125815e().mo123470p(233, this);
            if (i == 0 && i2 == 0) {
                C40368s sVar = (C40368s) yVar;
                int K = sVar.mo63058K();
                Log.m105925i("MicroMsg.CheckCanSubscribeBizUI", "geta8key, action code = %d", Integer.valueOf(K));
                if (K == 15) {
                    String R = sVar.mo63062R();
                    Log.m105919d("MicroMsg.CheckCanSubscribeBizUI", "actionCode = %s, url = %s", Integer.valueOf(K), R);
                    GetA8KeyRedirectEvent getA8KeyRedirectEvent = new GetA8KeyRedirectEvent();
                    GetA8KeyRedirectEvent.C40113a aVar = getA8KeyRedirectEvent.f107573d;
                    aVar.f107575a = K;
                    aVar.f107576b = R;
                    aVar.f107577c = this;
                    getA8KeyRedirectEvent.asyncPublish(Looper.myLooper());
                    finish();
                    return;
                }
                Log.m105920e("MicroMsg.CheckCanSubscribeBizUI", "onSceneEnd, geta8key  actionCode = " + K);
                mo69831I7(i, i2, str);
                return;
            }
            Log.m105921e("MicroMsg.CheckCanSubscribeBizUI", "onSceneEnd, geta8key  errType = %d, errCode = %d", Integer.valueOf(i), Integer.valueOf(i2));
            mo69831I7(i, i2, str);
        } else {
            Log.m105921e("MicroMsg.CheckCanSubscribeBizUI", "un support scene type : %d", Integer.valueOf(yVar.getType()));
        }
    }

    public void onStart() {
        super.onStart();
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        if (obj == null || !(obj instanceof String)) {
            Log.m105919d("MicroMsg.CheckCanSubscribeBizUI", "onNotifyChange obj not String event:%d stg:%s obj:%s", Integer.valueOf(i), mStorageEx, obj);
            return;
        }
        onNotifyChange((String) obj, (MStorageEventData) null);
    }
}
