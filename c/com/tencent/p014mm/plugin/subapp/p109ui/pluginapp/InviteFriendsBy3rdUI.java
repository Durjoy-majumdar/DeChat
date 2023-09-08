package com.tencent.p014mm.plugin.subapp.p109ui.pluginapp;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import ax2.C0231e;
import ax2.C0232f;
import ax2.C0233g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import eb0.C97625j3;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import pc0.C11885n;
import pc0.C62259q;
import pj3.C47511g;
import tn3.C101905a;
import tn3.C118493b;
import vc0.C52809a;
import wd3.C15153w0;
import wd3.C78575u;

/* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI */
public class InviteFriendsBy3rdUI extends MMPreference implements C11385n, C101905a.C101907b, C101905a.C101906a {

    /* renamed from: d */
    public int f21338d;

    /* renamed from: e */
    public int f21339e = 0;

    /* renamed from: f */
    public ProgressDialog f21340f = null;

    /* renamed from: g */
    public ProgressDialog f21341g = null;

    /* renamed from: h */
    public View f21342h;

    /* renamed from: i */
    public ImageView f21343i = null;

    /* renamed from: j */
    public ProgressBar f21344j = null;

    /* renamed from: n */
    public EditText f21345n = null;

    /* renamed from: o */
    public C118493b f21346o = new C118493b();

    /* renamed from: p */
    public boolean f21347p = false;

    /* renamed from: q */
    public boolean f21348q = false;

    /* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI$a */
    public class C5509a implements C15153w0 {

        /* renamed from: a */
        public final /* synthetic */ String f21349a;

        /* renamed from: b */
        public final /* synthetic */ int f21350b;

        public C5509a(String str, int i) {
            this.f21349a = str;
            this.f21350b = i;
        }

        /* renamed from: a */
        public void mo5557a(boolean z) {
            if (z) {
                EditText editText = InviteFriendsBy3rdUI.this.f21345n;
                String obj = editText == null ? this.f21349a : editText.getText().toString();
                InviteFriendsBy3rdUI inviteFriendsBy3rdUI = InviteFriendsBy3rdUI.this;
                int i = this.f21350b;
                inviteFriendsBy3rdUI.getClass();
                C62259q qVar = new C62259q(i, obj);
                inviteFriendsBy3rdUI.f21340f = C76879j.m92723Q(inviteFriendsBy3rdUI, inviteFriendsBy3rdUI.getString(C0966R.string.a3h), inviteFriendsBy3rdUI.getString(C0966R.string.a2w), true, true, new C0231e(inviteFriendsBy3rdUI, qVar));
                C97625j3.m125815e().mo123460f(qVar);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI$b */
    public class C5510b implements MenuItem.OnMenuItemClickListener {
        public C5510b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            InviteFriendsBy3rdUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI$c */
    public class C5511c implements DialogInterface.OnClickListener {
        public C5511c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C88144b.m109791i(InviteFriendsBy3rdUI.this.getContext(), "account", ".ui.FacebookAuthUI", new Intent(), (Bundle) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI$d */
    public class C5512d implements DialogInterface.OnClickListener {
        public C5512d(InviteFriendsBy3rdUI inviteFriendsBy3rdUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI$e */
    public class C5513e implements DialogInterface.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI$e$a */
        public class C5514a implements DialogInterface.OnCancelListener {
            public C5514a(C5513e eVar) {
            }

            public void onCancel(DialogInterface dialogInterface) {
            }
        }

        public C5513e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            InviteFriendsBy3rdUI inviteFriendsBy3rdUI = InviteFriendsBy3rdUI.this;
            inviteFriendsBy3rdUI.f21341g = C76879j.m92723Q(inviteFriendsBy3rdUI.getContext(), InviteFriendsBy3rdUI.this.getContext().getString(C0966R.string.a3h), InviteFriendsBy3rdUI.this.getContext().getString(C0966R.string.f361476k62), true, true, new C5514a(this));
            InviteFriendsBy3rdUI inviteFriendsBy3rdUI2 = InviteFriendsBy3rdUI.this;
            inviteFriendsBy3rdUI2.f21346o.mo183214b(inviteFriendsBy3rdUI2, inviteFriendsBy3rdUI2.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI$f */
    public class C5515f implements DialogInterface.OnClickListener {
        public C5515f(InviteFriendsBy3rdUI inviteFriendsBy3rdUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI$g */
    public class C5516g implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C11885n f21355d;

        public C5516g(InviteFriendsBy3rdUI inviteFriendsBy3rdUI, C11885n nVar) {
            this.f21355d = nVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C97625j3.m125815e().mo123458d(this.f21355d);
        }
    }

    /* renamed from: H7 */
    public final void mo6546H7(int i) {
        C11885n nVar = new C11885n(i);
        this.f21340f = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.gas), true, true, new C5516g(this, nVar));
        C97625j3.m125815e().mo123460f(nVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053 A[SYNTHETIC, Splitter:B:17:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0062 A[SYNTHETIC, Splitter:B:28:0x0062] */
    /* renamed from: I7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo6547I7() {
        /*
            r8 = this;
            java.lang.String r0 = eb0.C75592q0.m90789s()
            eb0.c r1 = eb0.C97625j3.m125812b()
            r1.getClass()
            java.lang.String r2 = f12.C7970a.m8127a()
            eb0.c r1 = eb0.C97625j3.m125812b()
            r1.getClass()
            java.lang.String r3 = f12.C7970a.m8128b()
            byte[] r0 = r0.getBytes()
            java.lang.String r5 = p823sg.C90193h.m112878f(r0)
            r7 = 1
            java.lang.String r4 = "qr_"
            java.lang.String r6 = ".png"
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.FilePathGenerator.defGenPathWithOld(r2, r3, r4, r5, r6, r7)
            r1 = 0
            r2 = 0
            java.io.RandomAccessFile r0 = com.tencent.p014mm.vfs.C86013q1.m106420B(r0, r1)     // Catch:{ Exception -> 0x0046, all -> 0x0044 }
            long r3 = r0.length()     // Catch:{ Exception -> 0x0042 }
            int r4 = (int) r3     // Catch:{ Exception -> 0x0042 }
            byte[] r3 = new byte[r4]     // Catch:{ Exception -> 0x0042 }
            r0.read(r3)     // Catch:{ Exception -> 0x0042 }
            r0.close()     // Catch:{ Exception -> 0x0057 }
            goto L_0x0057
        L_0x003f:
            r1 = move-exception
            r2 = r0
            goto L_0x005f
        L_0x0042:
            r3 = move-exception
            goto L_0x0048
        L_0x0044:
            r0 = move-exception
            goto L_0x0060
        L_0x0046:
            r3 = move-exception
            r0 = r2
        L_0x0048:
            java.lang.String r4 = "MicroMsg.InviteFriendsBy3rdUI"
            java.lang.String r5 = ""
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x003f }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r3, r5, r1)     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0056
            r0.close()     // Catch:{ Exception -> 0x0056 }
        L_0x0056:
            r3 = r2
        L_0x0057:
            if (r3 != 0) goto L_0x005a
            return r2
        L_0x005a:
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeByteArray(r3)
            return r0
        L_0x005f:
            r0 = r1
        L_0x0060:
            if (r2 == 0) goto L_0x0065
            r2.close()     // Catch:{ Exception -> 0x0065 }
        L_0x0065:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.subapp.p109ui.pluginapp.InviteFriendsBy3rdUI.mo6547I7():android.graphics.Bitmap");
    }

    /* renamed from: J7 */
    public final void mo6548J7(int i, String str, String str2) {
        View inflate = View.inflate(getContext(), C0966R.C0971layout.f7041vw, (ViewGroup) null);
        this.f21342h = inflate;
        this.f21345n = (EditText) inflate.findViewById(C0966R.C0970id.blm);
        this.f21343i = (ImageView) this.f21342h.findViewById(C0966R.C0970id.blj);
        this.f21344j = (ProgressBar) this.f21342h.findViewById(C0966R.C0970id.g3h);
        View view = (View) this.f21343i.getParent();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/subapp/ui/pluginapp/InviteFriendsBy3rdUI", "showConfirmDialog", "(ILjava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/subapp/ui/pluginapp/InviteFriendsBy3rdUI", "showConfirmDialog", "(ILjava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f21345n.setText(str);
        Bitmap I7 = mo6547I7();
        if (I7 == null) {
            C97625j3.m125815e().mo123460f(new C52809a(C75592q0.m90789s(), Util.nullAsNil((Integer) C97625j3.m125812b().mo105906u().mo119684e(66561, (Object) null)), 0));
            ((ProgressBar) this.f21342h.findViewById(C0966R.C0970id.g3h)).setVisibility(0);
        } else {
            ImageView imageView = this.f21343i;
            if (imageView != null) {
                imageView.setImageBitmap(I7);
            }
        }
        C78575u.m94942k(this.mController, str2, this.f21342h, getResources().getString(C0966R.string.a2s), new C5509a(str, i));
    }

    /* renamed from: Y6 */
    public void mo5555Y6(C101905a.C101908c cVar) {
        ProgressDialog progressDialog = this.f21341g;
        if (progressDialog != null) {
            progressDialog.cancel();
        }
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            C76879j.m92743n(getContext(), C0966R.string.k64, C0966R.string.a3h, new C0232f(this), new C0233g(this));
        } else if (ordinal == 1) {
            C76879j.m92743n(getContext(), C0966R.string.f361477k63, C0966R.string.a3h, new C0232f(this), new C0233g(this));
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8908b4;
    }

    /* renamed from: o5 */
    public void mo5556o5(C101905a.C101908c cVar) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0066, code lost:
        if (r0 != false) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            r6 = 2131825950(0x7f11151e, float:1.928477E38)
            r5.setMMTitle((int) r6)
            android.content.Intent r6 = r5.getIntent()
            java.lang.String r0 = "Invite_friends"
            r1 = 4
            int r6 = r6.getIntExtra(r0, r1)
            r5.f21338d = r6
            java.lang.Class<lc3.b> r6 = lc3.C10485b.class
            k40.a r6 = f40.C86709a0.m107533q(r6)
            lc3.b r6 = (lc3.C10485b) r6
            pj.f r6 = r6.vh0()
            java.lang.String r0 = "InviteFriendsInviteFlags"
            java.lang.String r6 = r6.mo107405c(r0)
            r0 = 0
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r0)
            pj3.g r1 = r5.getPreferenceScreen()
            r2 = r6 & 2
            if (r2 > 0) goto L_0x003a
            java.lang.String r2 = "invite_friends_by_message"
            r1.mo72531o(r2)
        L_0x003a:
            r2 = r6 & 1
            if (r2 > 0) goto L_0x0043
            java.lang.String r2 = "invite_friends_by_mail"
            r1.mo72531o(r2)
        L_0x0043:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r2 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.Global3rdSrv
            boolean r2 = r2.banned()
            if (r2 != 0) goto L_0x0068
            r2 = r6 & 4
            if (r2 <= 0) goto L_0x0068
            androidx.appcompat.app.AppCompatActivity r2 = r5.getContext()
            java.lang.String r3 = "com.whatsapp"
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 == 0) goto L_0x005c
            goto L_0x0066
        L_0x005c:
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0066 }
            r4 = 8192(0x2000, float:1.14794E-41)
            r2.getApplicationInfo(r3, r4)     // Catch:{ NameNotFoundException -> 0x0066 }
            r0 = 1
        L_0x0066:
            if (r0 != 0) goto L_0x006d
        L_0x0068:
            java.lang.String r0 = "invite_friends_by_whatsapp"
            r1.mo72531o(r0)
        L_0x006d:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.Global3rdSrv
            boolean r2 = r0.banned()
            java.lang.String r3 = "invite_friends_by_facebook"
            if (r2 != 0) goto L_0x0081
            r2 = r6 & 8
            if (r2 <= 0) goto L_0x0081
            boolean r2 = eb0.C75592q0.m90755C()
            if (r2 != 0) goto L_0x0084
        L_0x0081:
            r1.mo72531o(r3)
        L_0x0084:
            r1.mo72531o(r3)
            boolean r0 = r0.banned()
            if (r0 != 0) goto L_0x0091
            r6 = r6 & 16
            if (r6 > 0) goto L_0x0096
        L_0x0091:
            java.lang.String r6 = "invite_friends_by_twitter"
            r1.mo72531o(r6)
        L_0x0096:
            r1.notifyDataSetChanged()
            ob0.b0 r6 = eb0.C97625j3.m125815e()
            r0 = 1803(0x70b, float:2.527E-42)
            r6.mo123455a(r0, r5)
            ob0.b0 r6 = eb0.C97625j3.m125815e()
            r0 = 1804(0x70c, float:2.528E-42)
            r6.mo123455a(r0, r5)
            ob0.b0 r6 = eb0.C97625j3.m125815e()
            r0 = 168(0xa8, float:2.35E-43)
            r6.mo123455a(r0, r5)
            com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI$b r6 = new com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI$b
            r6.<init>()
            r5.setBackBtn(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.subapp.p109ui.pluginapp.InviteFriendsBy3rdUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        C97625j3.m125815e().mo123470p(1803, this);
        C97625j3.m125815e().mo123470p(1804, this);
        C97625j3.m125815e().mo123470p(168, this);
        int i = this.f21339e;
        if (i == 0) {
            C115669n.INSTANCE.mo160131h(14035, Integer.valueOf(i), 0, Integer.valueOf(this.f21338d));
        }
        super.onDestroy();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        if ("invite_friends_by_message".equals(preference.f121285r)) {
            this.f21339e = 2;
            mo6546H7(2);
            return true;
        } else if ("invite_friends_by_mail".equals(preference.f121285r)) {
            this.f21339e = 1;
            mo6546H7(1);
            return true;
        } else if ("invite_friends_by_whatsapp".equals(preference.f121285r)) {
            this.f21339e = 3;
            mo6546H7(4);
            return true;
        } else if ("invite_friends_by_facebook".equals(preference.f121285r)) {
            this.f21339e = 4;
            if (C75592q0.m90792v()) {
                this.f21348q = true;
                mo6546H7(8);
            } else {
                C76879j.m92743n(getContext(), C0966R.string.f361298is2, C0966R.string.a3h, new C5511c(), new C5512d(this));
            }
            return true;
        } else {
            boolean equals = "invite_friends_by_twitter".equals(preference.f121285r);
            boolean z = false;
            if (!equals) {
                return false;
            }
            this.f21339e = 5;
            if (this.f21346o.f354643b != null) {
                z = true;
            }
            if (z) {
                this.f21347p = true;
                mo6546H7(16);
            } else {
                C76879j.m92743n(getContext(), C0966R.string.j19, C0966R.string.a3h, new C5513e(), new C5515f(this));
            }
            return true;
        }
    }

    /* JADX WARNING: type inference failed for: r15v4 */
    /* JADX WARNING: type inference failed for: r15v6 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r15v3, types: [boolean, int] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0371  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r29, int r30, java.lang.String r31, ob0.C117747y r32) {
        /*
            r28 = this;
            r9 = r28
            r10 = r29
            r11 = r30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onSceneEnd: errType = "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = " errCode = "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = " errMsg = "
            r0.append(r1)
            r1 = r31
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r12 = "MicroMsg.InviteFriendsBy3rdUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            android.app.ProgressDialog r0 = r9.f21340f
            r1 = 0
            if (r0 == 0) goto L_0x0038
            r0.dismiss()
            r9.f21340f = r1
        L_0x0038:
            r13 = 0
            r14 = 3
            r15 = 14035(0x36d3, float:1.9667E-41)
            r16 = 2
            r8 = 1
            if (r10 != 0) goto L_0x0043
            if (r11 == 0) goto L_0x0060
        L_0x0043:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r14]
            int r3 = r9.f21339e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r13] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r2[r8] = r3
            int r3 = r9.f21338d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r16] = r3
            r0.mo160131h(r15, r2)
        L_0x0060:
            int r0 = r32.getType()
            r2 = 1803(0x70b, float:2.527E-42)
            r7 = 2131821704(0x7f110488, float:1.9276159E38)
            if (r0 != r2) goto L_0x0365
            if (r10 != 0) goto L_0x0357
            if (r11 == 0) goto L_0x0071
            goto L_0x0357
        L_0x0071:
            r0 = r32
            pc0.n r0 = (pc0.C11885n) r0
            java.lang.String r2 = r0.f34731f
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x007f
            r2 = r1
            goto L_0x0081
        L_0x007f:
            java.lang.String r2 = r0.f34731f
        L_0x0081:
            java.lang.String r3 = r0.f34732g
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x008b
            r3 = r1
            goto L_0x008d
        L_0x008b:
            java.lang.String r3 = r0.f34732g
        L_0x008d:
            java.lang.String r4 = eb0.C75592q0.m90773c()
            eb0.c r5 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r5 = r5.mo105906u()
            r6 = 6
            java.lang.Object r1 = r5.mo119684e(r6, r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 == 0) goto L_0x00a9
            r17 = r1
            goto L_0x00ab
        L_0x00a9:
            r17 = r4
        L_0x00ab:
            int r6 = r0.f34733h
            r0 = r6 & 1
            java.lang.String r5 = "android.intent.extra.TEXT"
            java.lang.String r4 = "android.intent.action.SEND"
            if (r0 <= 0) goto L_0x0171
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r0 == 0) goto L_0x00ce
            r0 = 2131831478(0x7f112ab6, float:1.9295983E38)
            java.lang.String r0 = r9.getString(r0)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.String r2 = eb0.C75592q0.m90783m()
            r1[r13] = r2
            java.lang.String r2 = java.lang.String.format(r0, r1)
        L_0x00ce:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r0 == 0) goto L_0x00e3
            r0 = 2131831477(0x7f112ab5, float:1.929598E38)
            java.lang.String r0 = r9.getString(r0)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r13] = r17
            java.lang.String r3 = java.lang.String.format(r0, r1)
        L_0x00e3:
            r0 = r3
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r4)
            java.lang.String r3 = "android.intent.extra.SUBJECT"
            r1.putExtra(r3, r2)
            r1.putExtra(r5, r0)
            java.lang.String r2 = "plain/text"
            r1.setType(r2)
            r2 = 2131831471(0x7f112aaf, float:1.9295969E38)
            java.lang.String r2 = r9.getString(r2)
            android.content.Intent r1 = android.content.Intent.createChooser(r1, r2)
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r1)
            java.lang.Object[] r2 = r3.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/subapp/ui/pluginapp/InviteFriendsBy3rdUI"
            java.lang.String r19 = "onSceneEnd"
            java.lang.String r20 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r21 = "Undefined"
            java.lang.String r22 = "startActivity"
            java.lang.String r23 = "(Landroid/content/Intent;)V"
            r1 = r28
            r15 = r3
            r3 = r18
            r24 = r4
            r4 = r19
            r25 = r5
            r5 = r20
            r26 = r6
            r6 = r21
            r7 = r22
            r18 = 1
            r8 = r23
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r15.mo10231a(r13)
            android.content.Intent r1 = (android.content.Intent) r1
            r9.startActivity(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/subapp/ui/pluginapp/InviteFriendsBy3rdUI"
            java.lang.String r3 = "onSceneEnd"
            java.lang.String r4 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r1 = r28
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r14]
            int r3 = r9.f21339e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r13] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r18)
            r15 = 1
            r2[r15] = r3
            int r3 = r9.f21338d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r16] = r3
            r3 = 14035(0x36d3, float:1.9667E-41)
            r1.mo160131h(r3, r2)
            r3 = r0
            goto L_0x0178
        L_0x0171:
            r24 = r4
            r25 = r5
            r26 = r6
            r15 = 1
        L_0x0178:
            r8 = r26
            r0 = r8 & 2
            r7 = 2131831479(0x7f112ab7, float:1.9295985E38)
            if (r0 <= 0) goto L_0x0233
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r0 == 0) goto L_0x0193
            java.lang.String r0 = r9.getString(r7)
            java.lang.Object[] r1 = new java.lang.Object[r15]
            r1[r13] = r17
            java.lang.String r3 = java.lang.String.format(r0, r1)
        L_0x0193:
            r6 = r3
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1)
            java.lang.String r1 = "sms_body"
            r0.putExtra(r1, r6)
            java.lang.String r1 = "vnd.android-dir/mms-sms"
            r0.setType(r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isIntentAvailable(r9, r0, r13)
            if (r1 == 0) goto L_0x0202
            k20.a r5 = new k20.a     // Catch:{ Exception -> 0x01f5 }
            r5.<init>()     // Catch:{ Exception -> 0x01f5 }
            r5.mo10233c(r0)     // Catch:{ Exception -> 0x01f5 }
            java.lang.Object[] r2 = r5.mo10232b()     // Catch:{ Exception -> 0x01f5 }
            java.lang.String r3 = "com/tencent/mm/plugin/subapp/ui/pluginapp/InviteFriendsBy3rdUI"
            java.lang.String r4 = "onSceneEnd"
            java.lang.String r0 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r18 = "Undefined"
            java.lang.String r19 = "startActivity"
            java.lang.String r20 = "(Landroid/content/Intent;)V"
            r1 = r28
            r14 = r5
            r5 = r0
            r22 = r6
            r6 = r18
            r7 = r19
            r27 = r8
            r8 = r20
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x01f3 }
            java.lang.Object r0 = r14.mo10231a(r13)     // Catch:{ Exception -> 0x01f3 }
            android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ Exception -> 0x01f3 }
            r9.startActivity(r0)     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r2 = "com/tencent/mm/plugin/subapp/ui/pluginapp/InviteFriendsBy3rdUI"
            java.lang.String r3 = "onSceneEnd"
            java.lang.String r4 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r1 = r28
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x01f3 }
            goto L_0x0210
        L_0x01f3:
            r0 = move-exception
            goto L_0x01fa
        L_0x01f5:
            r0 = move-exception
            r22 = r6
            r27 = r8
        L_0x01fa:
            java.lang.Object[] r1 = new java.lang.Object[r13]
            java.lang.String r2 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r2, r1)
            goto L_0x0210
        L_0x0202:
            r22 = r6
            r27 = r8
            r0 = 2131835573(0x7f113ab5, float:1.9304288E38)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r9, (int) r0, (int) r15)
            r0.show()
        L_0x0210:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 3
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r1 = r9.f21339e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r13] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r2[r15] = r1
            int r1 = r9.f21338d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r16] = r1
            r1 = 14035(0x36d3, float:1.9667E-41)
            r0.mo160131h(r1, r2)
            r3 = r22
            goto L_0x0235
        L_0x0233:
            r27 = r8
        L_0x0235:
            r12 = r27
            r0 = r12 & 4
            if (r0 <= 0) goto L_0x02c5
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r0 == 0) goto L_0x0250
            r1 = 2131831479(0x7f112ab7, float:1.9295985E38)
            java.lang.String r0 = r9.getString(r1)
            java.lang.Object[] r1 = new java.lang.Object[r15]
            r1[r13] = r17
            java.lang.String r3 = java.lang.String.format(r0, r1)
        L_0x0250:
            r0 = r3
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r2 = r24
            r1.setAction(r2)
            r2 = r25
            r1.putExtra(r2, r0)
            java.lang.String r2 = "text/plain"
            r1.setType(r2)
            java.lang.String r2 = "com.whatsapp"
            r1.setPackage(r2)
            k20.a r14 = new k20.a
            r14.<init>()
            r14.mo10233c(r1)
            java.lang.Object[] r2 = r14.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/subapp/ui/pluginapp/InviteFriendsBy3rdUI"
            java.lang.String r4 = "onSceneEnd"
            java.lang.String r5 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r28
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r14.mo10231a(r13)
            android.content.Intent r1 = (android.content.Intent) r1
            r9.startActivity(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/subapp/ui/pluginapp/InviteFriendsBy3rdUI"
            java.lang.String r3 = "onSceneEnd"
            java.lang.String r4 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r1 = r28
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            int r2 = r9.f21339e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r13] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r3[r15] = r2
            int r2 = r9.f21338d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r16] = r2
            r2 = 14035(0x36d3, float:1.9667E-41)
            r1.mo160131h(r2, r3)
            r3 = r0
        L_0x02c5:
            r0 = r12 & 8
            r1 = 2131831476(0x7f112ab4, float:1.9295979E38)
            r2 = 2131831475(0x7f112ab3, float:1.9295977E38)
            if (r0 <= 0) goto L_0x0305
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r0 == 0) goto L_0x02f5
            java.lang.String r0 = eb0.C75592q0.m90773c()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x02e4
            java.lang.String r0 = r9.getString(r1)
            goto L_0x02f4
        L_0x02e4:
            java.lang.String r0 = r9.getString(r2)
            java.lang.Object[] r3 = new java.lang.Object[r15]
            java.lang.String r4 = eb0.C75592q0.m90773c()
            r3[r13] = r4
            java.lang.String r0 = java.lang.String.format(r0, r3)
        L_0x02f4:
            r3 = r0
        L_0x02f5:
            r0 = 2131831468(0x7f112aac, float:1.9295962E38)
            java.lang.String r0 = r9.getString(r0)
            boolean r4 = r9.f21348q
            if (r4 != r15) goto L_0x0305
            r9.mo6548J7(r12, r3, r0)
            r9.f21348q = r13
        L_0x0305:
            r0 = r12 & 16
            if (r0 <= 0) goto L_0x0353
            tn3.b r0 = r9.f21346o
            boolean r4 = r0.f354646e
            if (r4 == 0) goto L_0x0310
            goto L_0x031e
        L_0x0310:
            r0.f354648g = r9
            r0.f354646e = r15
            tn3.c r4 = new tn3.c
            r4.<init>(r0)
            java.lang.String r0 = "Twitter_validationAccessToken"
            com.tencent.p014mm.sdk.thread.ThreadPool.post(r4, r0)
        L_0x031e:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r0 == 0) goto L_0x0343
            java.lang.String r0 = eb0.C75592q0.m90773c()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0333
            java.lang.String r3 = r9.getString(r1)
            goto L_0x0343
        L_0x0333:
            java.lang.String r0 = r9.getString(r2)
            java.lang.Object[] r1 = new java.lang.Object[r15]
            java.lang.String r2 = eb0.C75592q0.m90773c()
            r1[r13] = r2
            java.lang.String r3 = java.lang.String.format(r0, r1)
        L_0x0343:
            r0 = 2131831473(0x7f112ab1, float:1.9295973E38)
            java.lang.String r0 = r9.getString(r0)
            boolean r1 = r9.f21347p
            if (r1 != r15) goto L_0x0353
            r9.mo6548J7(r12, r3, r0)
            r9.f21347p = r13
        L_0x0353:
            r2 = 2131821704(0x7f110488, float:1.9276159E38)
            goto L_0x0369
        L_0x0357:
            androidx.appcompat.app.AppCompatActivity r0 = r28.getContext()
            r1 = 2131832195(0x7f112d83, float:1.9297437E38)
            r2 = 2131821704(0x7f110488, float:1.9276159E38)
            nj3.C76879j.m92738i(r0, r1, r2)
            return
        L_0x0365:
            r2 = 2131821704(0x7f110488, float:1.9276159E38)
            r15 = 1
        L_0x0369:
            int r0 = r32.getType()
            r1 = 1804(0x70c, float:2.528E-42)
            if (r0 != r1) goto L_0x03b0
            if (r10 != 0) goto L_0x03a5
            if (r11 == 0) goto L_0x0376
            goto L_0x03a5
        L_0x0376:
            android.content.res.Resources r0 = r28.getResources()
            r1 = 2131824012(0x7f110d8c, float:1.928084E38)
            java.lang.String r0 = r0.getString(r1)
            nj3.C76879j.m92726T(r9, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r9.f21339e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r13] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r1[r15] = r2
            int r2 = r9.f21338d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r16] = r2
            r2 = 14035(0x36d3, float:1.9667E-41)
            r0.mo160131h(r2, r1)
            goto L_0x03b0
        L_0x03a5:
            androidx.appcompat.app.AppCompatActivity r0 = r28.getContext()
            r1 = 2131835640(0x7f113af8, float:1.9304424E38)
            nj3.C76879j.m92738i(r0, r1, r2)
            return
        L_0x03b0:
            int r0 = r32.getType()
            r1 = 168(0xa8, float:2.35E-43)
            if (r0 != r1) goto L_0x03d3
            if (r10 != 0) goto L_0x03d3
            if (r11 == 0) goto L_0x03bd
            goto L_0x03d3
        L_0x03bd:
            android.widget.ImageView r0 = r9.f21343i
            if (r0 == 0) goto L_0x03d3
            android.widget.ProgressBar r0 = r9.f21344j
            if (r0 == 0) goto L_0x03ca
            r1 = 8
            r0.setVisibility(r1)
        L_0x03ca:
            android.widget.ImageView r0 = r9.f21343i
            android.graphics.Bitmap r1 = r28.mo6547I7()
            r0.setImageBitmap(r1)
        L_0x03d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.subapp.p109ui.pluginapp.InviteFriendsBy3rdUI.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
