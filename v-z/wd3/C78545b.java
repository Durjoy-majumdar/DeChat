package wd3;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.RegionCodeDecoder;
import d62.C45286l;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import gc0.C20828a;
import hc0.C20937c;
import java.util.LinkedList;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p011cm.C39989b;
import p196ln.C10579k;
import p196ln.C76706g;
import p196ln.C76708i;
import p629ny.C76979h;
import qo3.C77389a;
import qo3.C77398g;
import sf0.C48374j0;
import te3.C77967mx3;
import te3.mq4;
import wc3.C15130a;

/* renamed from: wd3.b */
public class C78545b implements C10579k.C10580a, C39989b.C0705b, C15152t0 {

    /* renamed from: d */
    public Context f230067d;

    /* renamed from: e */
    public int f230068e;

    /* renamed from: f */
    public String f230069f;

    /* renamed from: g */
    public String f230070g;

    /* renamed from: h */
    public int f230071h;

    /* renamed from: i */
    public int f230072i = 0;

    /* renamed from: j */
    public C78574s0 f230073j;

    /* renamed from: n */
    public ProgressDialog f230074n;

    /* renamed from: o */
    public C77398g f230075o;

    /* renamed from: p */
    public C11385n f230076p = null;

    /* renamed from: q */
    public C72996z1 f230077q;

    /* renamed from: r */
    public String f230078r;

    /* renamed from: s */
    public boolean f230079s = true;

    /* renamed from: t */
    public boolean f230080t = true;

    /* renamed from: u */
    public String f230081u;

    /* renamed from: v */
    public boolean f230082v;

    /* renamed from: wd3.b$a */
    public class C78546a implements DialogInterface.OnCancelListener {
        public C78546a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            ProgressDialog progressDialog = C78545b.this.f230074n;
            if (progressDialog != null) {
                progressDialog.dismiss();
                C78545b.this.f230074n = null;
            }
        }
    }

    /* renamed from: wd3.b$b */
    public class C78547b implements C65953v0 {

        /* renamed from: a */
        public final /* synthetic */ C72996z1 f230084a;

        public C78547b(C72996z1 z1Var) {
            this.f230084a = z1Var;
        }

        /* renamed from: a */
        public void mo23a(boolean z, String str, int i) {
            if (z) {
                C78545b.this.mo108516c(this.f230084a);
            } else {
                C78545b.this.mo108515b(0);
            }
            C78545b.this.f230075o.dismiss();
        }
    }

    /* renamed from: wd3.b$c */
    public class C78548c implements Runnable {
        public C78548c() {
        }

        public void run() {
            ImageView imageView = (ImageView) C78545b.this.f230075o.getContentView().findViewById(C0966R.C0970id.bln);
            if (imageView != null) {
                Bitmap N50 = ((C76708i) C86312j.m106911c(C76708i.class)).N50(C78545b.this.f230077q.getUsername());
                if (N50 != null && C78545b.this.f230077q.mo62916m3()) {
                    N50 = BitmapUtil.getRoundedCornerBitmap(N50, false, (float) (N50.getWidth() / 2));
                }
                if (N50 != null && !N50.isRecycled()) {
                    imageView.setImageBitmap(N50);
                    imageView.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: wd3.b$d */
    public class C78549d implements C11385n {
        public C78549d() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            Class cls = C75700k0.class;
            ProgressDialog progressDialog = C78545b.this.f230074n;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            if (C78545b.this.f230076p != null) {
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123470p(106, C78545b.this.f230076p);
            }
            C78545b bVar = C78545b.this;
            if (bVar.f230074n == null && !bVar.f230082v) {
                Log.m105920e("MicroMsg.AddContactDialog", "has cancel the loading dialog");
                C78545b.this.mo108515b(0);
            } else if (i == 0 && i2 == 0) {
                Context context = bVar.f230067d;
                if (context == null) {
                    Log.m105920e("MicroMsg.AddContactDialog", "searchContact, context is null, msghandler has already been detached!");
                    C78545b.this.mo108515b(-1);
                } else if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                    C77967mx3 l0 = ((C45286l) yVar).mo70811l0();
                    String g = C48374j0.m53718g(l0.f227857d);
                    if (Util.isNullOrNil(g)) {
                        Log.m105920e("MicroMsg.AddContactDialog", "searchContact, user is null");
                        Context context2 = C78545b.this.f230067d;
                        C76879j.m92727U(context2, context2.getResources().getString(C0966R.string.f361653lm2), 1);
                        C78545b.this.mo108515b(-1);
                        return;
                    }
                    String str2 = C78545b.this.f230078r;
                    if (str2 == null || !str2.equals(g)) {
                        Log.m105929w("MicroMsg.AddContactDialog", "user not the same, %s, %s", C78545b.this.f230078r, g);
                    }
                    C78545b bVar2 = C78545b.this;
                    C86709a0.m107528h();
                    bVar2.f230077q = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(g);
                    C72996z1 z1Var = C78545b.this.f230077q;
                    if (z1Var == null || ((int) z1Var.f108320R1) == 0) {
                        Log.m105924i("MicroMsg.AddContactDialog", "searchContact, no contact with username = " + g + ", try get by alias");
                        C78545b bVar3 = C78545b.this;
                        C86709a0.m107528h();
                        bVar3.f230077q = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69730y3(g);
                        C72996z1 z1Var2 = C78545b.this.f230077q;
                        if (z1Var2 == null || ((int) z1Var2.f108320R1) == 0) {
                            Log.m105924i("MicroMsg.AddContactDialog", "searchContact, no contact with alias, new Contact");
                            C78545b.this.f230077q = new C72996z1(g);
                            C78545b.this.f230077q.mo62857I2(l0.f227870t);
                            C78545b.this.f230077q.mo62878U2(C48374j0.m53718g(l0.f227858e));
                            C78545b.this.f230077q.mo62882W2(C48374j0.m53718g(l0.f227859f));
                            C78545b.this.f230077q.mo62884X2(C48374j0.m53718g(l0.f227860g));
                            C78545b.this.f230077q.mo62900f4(l0.f227861h);
                            C78545b.this.f230077q.mo62893c4(RegionCodeDecoder.m124564q(l0.f227842A, l0.f227863j, l0.f227864n));
                            C78545b.this.f230077q.mo62902g4(l0.f227865o);
                            C78545b.this.f230077q.mo62894d3(l0.f227867q);
                            C78545b.this.f230077q.mo62925q4(l0.f227868r);
                            C78545b.this.f230077q.mo62896e3(l0.f227872v);
                            C78545b.this.f230077q.mo62899f3(l0.f227871u);
                            C78545b.this.f230077q.mo62928s4(l0.f227869s);
                        }
                    } else {
                        Log.m105925i("MicroMsg.AddContactDialog", "searchContact, contact in db, %s", g);
                    }
                    C78545b bVar4 = C78545b.this;
                    bVar4.mo108520g(bVar4.f230077q);
                } else {
                    Log.m105920e("MicroMsg.AddContactDialog", "searchContact, context isFinishing");
                    C78545b.this.mo108515b(-1);
                }
            } else {
                Log.m105921e("MicroMsg.AddContactDialog", "searchContact onSceneEnd, errType = %d, errCode = %d", Integer.valueOf(i), Integer.valueOf(i2));
                C78545b.this.mo108515b(-1);
            }
        }
    }

    public C78545b(Context context, String str, int i, C78574s0 s0Var) {
        this.f230067d = context;
        this.f230078r = str;
        this.f230068e = i;
        this.f230073j = s0Var;
    }

    /* renamed from: X */
    public void mo1428X(String str) {
        C72996z1 z1Var = this.f230077q;
        if (z1Var != null) {
            boolean z = true;
            boolean z2 = z1Var.getUsername() != null && this.f230077q.getUsername().equals(str);
            if (this.f230077q.mo62913l2() == null || !this.f230077q.mo62913l2().equals(str)) {
                z = false;
            }
            if (!z2 && !z) {
                return;
            }
        } else {
            String str2 = this.f230078r;
            if (str2 == null || !str2.equals(str)) {
                return;
            }
        }
        C77398g gVar = this.f230075o;
        if (gVar != null && gVar.isShowing()) {
            MMHandlerThread.postToMainThread(new C78548c());
        }
    }

    /* renamed from: a */
    public void mo677a(boolean z, boolean z2, String str, String str2) {
        Class cls = C75700k0.class;
        ProgressDialog progressDialog = this.f230074n;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (z) {
            this.f230077q.mo62868O3();
            this.f230077q.setUsername(str);
            if (((int) this.f230077q.f108320R1) == 0) {
                C86709a0.m107528h();
                ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69667P3(this.f230077q);
            } else {
                C86709a0.m107528h();
                ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69719p3(this.f230077q.getUsername(), this.f230077q);
            }
            if (this.f230080t) {
                Context context = this.f230067d;
                C76879j.m92727U(context, context.getResources().getString(C0966R.string.lm7), 1);
            }
            mo108515b(1);
            return;
        }
        mo108515b(-1);
    }

    /* renamed from: b */
    public final void mo108515b(int i) {
        C78574s0 s0Var = this.f230073j;
        if (s0Var != null) {
            s0Var.mo708a(i);
        }
    }

    /* renamed from: c */
    public final void mo108516c(C72996z1 z1Var) {
        ProgressDialog progressDialog = this.f230074n;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (!this.f230082v) {
            Context context = this.f230067d;
            this.f230074n = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), this.f230067d.getString(C0966R.string.f361654lm3), true, true, (DialogInterface.OnCancelListener) null);
        }
        C78543a aVar = new C78543a(this.f230067d, this);
        LinkedList linkedList = new LinkedList();
        linkedList.add(Integer.valueOf(this.f230068e));
        mq4 mq4 = new mq4();
        mq4.f138159e = this.f230069f;
        mq4.f138162h = this.f230070g;
        mq4.f138158d = this.f230071h;
        aVar.f230029C = mq4;
        aVar.f230051w = !this.f230082v;
        aVar.mo108501b(z1Var.getUsername(), linkedList, false, this.f230081u);
    }

    /* renamed from: d */
    public final void mo108517d(C15130a aVar) {
        if (aVar != null) {
            this.f230079s = aVar.f41261f;
            this.f230081u = aVar.f41256a;
            this.f230072i = aVar.f41257b;
            this.f230069f = aVar.f41258c;
            this.f230070g = aVar.f41259d;
            this.f230071h = aVar.f41260e;
            this.f230080t = aVar.f41262g;
        }
    }

    /* renamed from: e */
    public final void mo108518e(String str) {
        Log.m105925i("MicroMsg.AddContactDialog", "searchContact %s", str);
        if (this.f230076p == null) {
            this.f230076p = new C78549d();
        }
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(106, this.f230076p);
        C45286l lVar = new C45286l(str, this.f230072i);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(lVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004a  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo108519f() {
        /*
            r11 = this;
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            java.lang.String r1 = "MicroMsg.AddContactDialog"
            android.content.Context r2 = r11.f230067d
            java.lang.Class<ug.c0> r3 = p248ug.C52570c0.class
            r4 = 0
            r5 = 1
            k40.a r6 = f40.C86709a0.m107533q(r3)     // Catch:{ Exception -> 0x0035 }
            ug.c0 r6 = (p248ug.C52570c0) r6     // Catch:{ Exception -> 0x0035 }
            boolean r6 = r6.mo58180ND()     // Catch:{ Exception -> 0x0035 }
            if (r6 != 0) goto L_0x003d
            java.lang.String r6 = "addContact checkTeenModeAllow false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)     // Catch:{ Exception -> 0x0035 }
            java.lang.Class<ky2.i> r6 = ky2.C10432i.class
            di3.d r6 = di3.C86312j.m106911c(r6)     // Catch:{ Exception -> 0x0035 }
            ky2.i r6 = (ky2.C10432i) r6     // Catch:{ Exception -> 0x0035 }
            r6.mo10755m4(r2)     // Catch:{ Exception -> 0x0035 }
            k40.a r2 = f40.C86709a0.m107533q(r3)     // Catch:{ Exception -> 0x0035 }
            ug.c0 r2 = (p248ug.C52570c0) r2     // Catch:{ Exception -> 0x0035 }
            r3 = 8
            java.lang.String r6 = ""
            r2.mo58184vU(r3, r6)     // Catch:{ Exception -> 0x0035 }
            r2 = 0
            goto L_0x003e
        L_0x0035:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r6 = "checkTeenModeAllow exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r6, r3)
        L_0x003d:
            r2 = 1
        L_0x003e:
            r3 = -1
            if (r2 != 0) goto L_0x004a
            java.lang.String r0 = "checkTeenModeAllow false, can not add contact"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            r11.mo108515b(r3)
            return
        L_0x004a:
            f40.C86709a0.m107528h()
            k40.a r2 = f40.C86709a0.m107533q(r0)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.u3 r2 = r2.mo96097Ni()
            java.lang.String r6 = r11.f230078r
            com.tencent.mm.storage.z1 r2 = r2.get(r6)
            r11.f230077q = r2
            if (r2 == 0) goto L_0x0086
            long r6 = r2.f108320R1
            int r2 = (int) r6
            if (r2 > 0) goto L_0x0086
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r6 = r11.f230078r
            r2[r4] = r6
            java.lang.String r4 = "dealAddContact get by username fail, try alias, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r2)
            f40.C86709a0.m107528h()
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()
            java.lang.String r2 = r11.f230078r
            com.tencent.mm.storage.z1 r0 = r0.mo69730y3(r2)
            r11.f230077q = r0
        L_0x0086:
            com.tencent.mm.storage.z1 r0 = r11.f230077q
            r2 = 2131840265(0x7f114d09, float:1.9313805E38)
            r4 = 2131821704(0x7f110488, float:1.9276159E38)
            if (r0 == 0) goto L_0x0130
            long r6 = r0.f108320R1
            int r0 = (int) r6
            if (r0 <= 0) goto L_0x0130
            java.lang.String r0 = "The contact already exists, so go to dealAddContact."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.storage.z1 r0 = r11.f230077q
            if (r0 != 0) goto L_0x00a8
            java.lang.String r0 = "dealAddContact fail, contact is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            r11.mo108515b(r3)
            goto L_0x0156
        L_0x00a8:
            java.lang.String r0 = r0.getUsername()
            com.tencent.mm.storage.z1 r6 = r11.f230077q
            boolean r6 = r6.mo62916m3()
            if (r6 != 0) goto L_0x010d
            java.lang.Class<ug.z> r5 = p248ug.C52574z.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ug.z r5 = (p248ug.C52574z) r5
            boolean r5 = r5.mo73530Ht(r0)
            if (r5 == 0) goto L_0x00e0
            boolean r1 = r11.f230082v
            if (r1 != 0) goto L_0x00db
            android.content.Context r5 = r11.f230067d
            java.lang.String r6 = r5.getString(r4)
            android.content.Context r1 = r11.f230067d
            java.lang.String r7 = r1.getString(r2)
            r8 = 1
            r9 = 1
            r10 = 0
            qo3.i0 r1 = nj3.C76879j.m92723Q(r5, r6, r7, r8, r9, r10)
            r11.f230074n = r1
        L_0x00db:
            r11.mo108518e(r0)
            goto L_0x0156
        L_0x00e0:
            android.content.Context r4 = r11.f230067d
            boolean r0 = r4 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r0 == 0) goto L_0x0156
            r0 = 2131840264(0x7f114d08, float:1.9313803E38)
            java.lang.String r5 = r4.getString(r0)
            android.content.Context r0 = r11.f230067d
            r2 = 2131821556(0x7f1103f4, float:1.9275859E38)
            java.lang.String r7 = r0.getString(r2)
            r8 = 0
            wd3.c r9 = new wd3.c
            r9.<init>(r11)
            java.lang.String r6 = ""
            qo3.g r0 = nj3.C76879j.m92711E(r4, r5, r6, r7, r8, r9)
            if (r0 != 0) goto L_0x0156
            java.lang.String r0 = "dealAddContact fail, connot show dialog"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            r11.mo108515b(r3)
            goto L_0x0156
        L_0x010d:
            com.tencent.mm.storage.z1 r0 = r11.f230077q
            boolean r0 = r0.mo62927s3()
            if (r0 == 0) goto L_0x012a
            android.content.Context r0 = r11.f230067d
            android.content.res.Resources r1 = r0.getResources()
            r2 = 2131840270(0x7f114d0e, float:1.9313815E38)
            java.lang.String r1 = r1.getString(r2)
            nj3.C76879j.m92727U(r0, r1, r5)
            r0 = -2
            r11.mo108515b(r0)
            goto L_0x0156
        L_0x012a:
            com.tencent.mm.storage.z1 r0 = r11.f230077q
            r11.mo108520g(r0)
            goto L_0x0156
        L_0x0130:
            android.content.Context r1 = r11.f230067d
            if (r1 != 0) goto L_0x0135
            return
        L_0x0135:
            boolean r0 = r11.f230082v
            if (r0 != 0) goto L_0x0151
            java.lang.String r0 = r1.getString(r4)
            android.content.Context r3 = r11.f230067d
            java.lang.String r3 = r3.getString(r2)
            r4 = 1
            r5 = 1
            wd3.b$a r6 = new wd3.b$a
            r6.<init>()
            r2 = r0
            qo3.i0 r0 = nj3.C76879j.m92723Q(r1, r2, r3, r4, r5, r6)
            r11.f230074n = r0
        L_0x0151:
            java.lang.String r0 = r11.f230078r
            r11.mo108518e(r0)
        L_0x0156:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wd3.C78545b.mo108519f():void");
    }

    /* renamed from: g */
    public final void mo108520g(C72996z1 z1Var) {
        Class cls = C76706g.class;
        if (z1Var == null) {
            Log.m105920e("MicroMsg.AddContactDialog", "showContact fail, contact is null");
            mo108515b(-1);
            return;
        }
        String string = this.f230067d.getString(C0966R.string.f361652lm1);
        Bitmap N50 = ((C76708i) C86312j.m106911c(C76708i.class)).N50(z1Var.getUsername());
        if (N50 == null) {
            ((AvatarStorage) ((C76706g) C86312j.m106911c(cls)).mo106826RE()).mo93557b(this);
        }
        if (N50 != null && z1Var.mo62916m3()) {
            N50 = BitmapUtil.getRoundedCornerBitmap(N50, false, (float) (N50.getWidth() / 2));
        }
        String nickname = z1Var.getNickname();
        C77398g gVar = null;
        this.f230075o = null;
        if (this.f230067d instanceof MMActivity) {
            if (!this.f230079s) {
                mo108516c(z1Var);
                return;
            }
            C68097n Lo = ((C68098o) ((C76706g) C86312j.m106911c(cls)).mo106832eg()).mo93607Lo(z1Var.getUsername());
            String f = (Lo == null || Util.isNullOrNil(Lo.mo93597f())) ? null : Lo.mo93597f();
            MMActivityController controller = ((MMActivity) this.f230067d).getController();
            C78547b bVar = new C78547b(z1Var);
            Class cls2 = C76979h.class;
            if ((string == null || string.length() == 0) && (nickname == null || nickname.length() == 0)) {
                Log.m105920e("MicroMsg.MMConfirmDialog", "showDialogItem6 fail, title message both are empty");
            } else {
                View c = C78575u.m94934c(controller.mo177096t(), C0966R.C0971layout.f7044vz);
                C77398g.C77402i iVar = new C77398g.C77402i(controller.mo177096t());
                C77389a aVar = iVar.f225714b;
                aVar.f225668y = false;
                aVar.f225669z = false;
                C78575u.m94938g(c, false);
                C78575u.m94937f(controller, iVar, bVar, c, controller.mo177096t().getResources().getString(C0966R.string.bjw));
                TextView textView = (TextView) c.findViewById(C0966R.C0970id.blp);
                textView.setText(((C76979h) C86312j.m106911c(cls2)).yp0(controller.mo177096t(), string, textView.getTextSize()));
                textView.getPaint().setFakeBoldText(true);
                TextView textView2 = (TextView) c.findViewById(C0966R.C0970id.bll);
                textView2.setText(((C76979h) C86312j.m106911c(cls2)).yp0(controller.mo177096t(), nickname, textView2.getTextSize()));
                ImageView imageView = (ImageView) c.findViewById(C0966R.C0970id.bln);
                if (imageView != null) {
                    if (N50 != null && !N50.isRecycled()) {
                        imageView.setImageBitmap(N50);
                        iVar.f225714b.f225623F = new C78587x(N50);
                    } else if (!Util.isNullOrNil(f)) {
                        C20828a b = C20828a.m22825b();
                        C20937c.C20939b bVar2 = new C20937c.C20939b();
                        bVar2.f59359o = C0966R.C0969drawable.be5;
                        bVar2.f59347c = true;
                        bVar2.f59364t = true;
                        b.mo32519h(f, imageView, bVar2.mo32666a());
                    } else {
                        imageView.setImageResource(C0966R.C0969drawable.be5);
                    }
                }
                iVar.f225714b.f225627J = c;
                gVar = iVar.mo107548a();
                gVar.show();
            }
            this.f230075o = gVar;
        }
        if (this.f230075o == null) {
            Log.m105920e("MicroMsg.AddContactDialog", "showContact fail, cannot show dialog");
            mo108515b(-1);
        }
    }
}
