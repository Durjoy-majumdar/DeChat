package com.tencent.p014mm.p136ui.tools;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.booter.NotifyReceiver;
import com.tencent.p014mm.modelsimple.C40364n;
import com.tencent.p014mm.opensdk.constants.Build;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p014mm.opensdk.modelmsg.WXFileObject;
import com.tencent.p014mm.opensdk.modelmsg.WXImageObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXTextObject;
import com.tencent.p014mm.opensdk.modelmsg.WXVideoFileObject;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import com.tencent.p014mm.plugin.account.p024ui.SimpleLoginUI;
import com.tencent.p014mm.pluginsdk.model.C96787m0;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import f40.C86718e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ke3.C88144b;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p910lj.C76701a;
import pb1.C100718j1;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C101835rd0;
import te3.C51740vu;

@C88989a(3)
/* renamed from: com.tencent.mm.ui.tools.AddFavoriteUI */
public class AddFavoriteUI extends MMActivity implements C11385n {

    /* renamed from: p */
    public static final /* synthetic */ int f250299p = 0;

    /* renamed from: d */
    public ProgressDialog f250300d = null;

    /* renamed from: e */
    public Intent f250301e = null;

    /* renamed from: f */
    public DoFavoriteEvent f250302f;

    /* renamed from: g */
    public String f250303g = null;

    /* renamed from: h */
    public Uri f250304h = null;

    /* renamed from: i */
    public ArrayList<String> f250305i = null;

    /* renamed from: j */
    public MMHandler f250306j = new C85934d();

    /* renamed from: n */
    public MMHandler f250307n = new C85935e();

    /* renamed from: o */
    public MMHandler f250308o = new C85936f();

    /* renamed from: com.tencent.mm.ui.tools.AddFavoriteUI$a */
    public class C85931a implements DialogInterface.OnClickListener {
        public C85931a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AddFavoriteUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.AddFavoriteUI$b */
    public class C85932b implements C75018a.C75025e {
        public C85932b() {
        }

        /* renamed from: a */
        public void mo6958a() {
        }

        public void onHide() {
            AddFavoriteUI.this.finish();
        }

        public void onShow() {
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.AddFavoriteUI$c */
    public class C85933c implements DialogInterface.OnCancelListener {
        public C85933c(AddFavoriteUI addFavoriteUI) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.AddFavoriteUI$d */
    public class C85934d extends MMHandler {
        public C85934d() {
        }

        public void handleMessage(Message message) {
            boolean z;
            AddFavoriteUI addFavoriteUI = AddFavoriteUI.this;
            int i = AddFavoriteUI.f250299p;
            addFavoriteUI.mo119836L7();
            AddFavoriteUI addFavoriteUI2 = AddFavoriteUI.this;
            Intent intent = addFavoriteUI2.getIntent();
            addFavoriteUI2.f250301e = intent;
            if (intent == null) {
                Log.m105920e("MicroMsg.AddFavoriteUI", "intent is null");
            } else {
                String stringExtra = IntentUtil.getStringExtra(intent, "android.intent.extra.TEXT");
                if (stringExtra == null || stringExtra.length() == 0) {
                    Log.m105924i("MicroMsg.AddFavoriteUI", "text is null");
                } else {
                    WXMediaMessage wXMediaMessage = new WXMediaMessage(new WXTextObject(stringExtra));
                    wXMediaMessage.description = stringExtra;
                    SendMessageToWX.Req req = new SendMessageToWX.Req();
                    req.transaction = null;
                    req.message = wXMediaMessage;
                    int type = wXMediaMessage.getType();
                    Bundle bundle = new Bundle();
                    req.toBundle(bundle);
                    bundle.putInt(ConstantsAPI.SDK_VERSION, Build.SDK_INT);
                    bundle.putString(ConstantsAPI.APP_PACKAGE, "com.tencent.mm.openapi");
                    bundle.putString("SendAppMessageWrapper_AppId", "wx4310bbd51be7d979");
                    if (!C97625j3.m125820j() || C86718e.m107551r()) {
                        Log.m105928w("MicroMsg.AddFavoriteUI", "not logged in, jump to simple login");
                        MMWizardActivity.m7018M7(addFavoriteUI2, new Intent(addFavoriteUI2, SimpleLoginUI.class), addFavoriteUI2.getIntent().addFlags(67108864));
                        addFavoriteUI2.finish();
                    } else {
                        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                        String str = C86013q1.m106457r(addFavoriteUI2.f250303g) + "." + C86013q1.m106454o(addFavoriteUI2.f250303g);
                        if (type == 1) {
                            C96787m0.m124258l(doFavoriteEvent, stringExtra, 13);
                        } else {
                            C96787m0.m124254h(doFavoriteEvent, 13, addFavoriteUI2.f250303g, str, "", false);
                        }
                        DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
                        aVar.f264684i = addFavoriteUI2;
                        aVar.f264691p = new C85949e(addFavoriteUI2);
                        aVar.f264692q = new C85950f(addFavoriteUI2);
                        addFavoriteUI2.f250302f = doFavoriteEvent;
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(stringExtra);
                        C40364n nVar = new C40364n(5, arrayList, addFavoriteUI2.getCallerPackage());
                        C97625j3.m125815e().mo123455a(837, addFavoriteUI2);
                        C86709a0.m107524d().mo123460f(nVar);
                        addFavoriteUI2.mo119838N7();
                    }
                    z = true;
                    Log.m105925i("MicroMsg.AddFavoriteUI", "dealWithText: %b", Boolean.valueOf(z));
                }
            }
            z = false;
            Log.m105925i("MicroMsg.AddFavoriteUI", "dealWithText: %b", Boolean.valueOf(z));
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.AddFavoriteUI$e */
    public class C85935e extends MMHandler {
        public C85935e() {
        }

        public void handleMessage(Message message) {
            ArrayList arrayList;
            AddFavoriteUI addFavoriteUI = AddFavoriteUI.this;
            int i = AddFavoriteUI.f250299p;
            addFavoriteUI.mo119836L7();
            AddFavoriteUI addFavoriteUI2 = AddFavoriteUI.this;
            Log.m105925i("MicroMsg.AddFavoriteUI", "filepath:[%s]", addFavoriteUI2.f250303g);
            int M7 = addFavoriteUI2.mo119837M7(addFavoriteUI2.getIntent().resolveType(addFavoriteUI2));
            if (M7 == -1) {
                Log.m105920e("MicroMsg.AddFavoriteUI", "launch, msgType is invalid");
                addFavoriteUI2.finish();
                return;
            }
            Log.m105925i("MicroMsg.AddFavoriteUI", "filepath:[%s] dealWithMultiItem msgType is %d", addFavoriteUI2.f250303g, Integer.valueOf(M7));
            if (M7 == 8 && !Util.isNullOrNil(addFavoriteUI2.f250303g)) {
                addFavoriteUI2.mo119835K7(M7, addFavoriteUI2.f250303g, (String) null, false);
            } else if (IntentUtil.getBooleanExtra(addFavoriteUI2.getIntent(), "Intro_Switch", false) || !C97625j3.m125820j() || C86718e.m107551r()) {
                Intent intent = new Intent(addFavoriteUI2, AddFavoriteUI.class);
                intent.setAction("android.intent.action.SEND_MULTIPLE");
                if (Util.isNullOrNil((List) addFavoriteUI2.f250305i)) {
                    arrayList = new ArrayList(0);
                } else {
                    arrayList = new ArrayList(addFavoriteUI2.f250305i.size());
                    Iterator<String> it = addFavoriteUI2.f250305i.iterator();
                    while (it.hasNext()) {
                        arrayList.add(FileProviderHelper.getUriForFile(addFavoriteUI2.getContext(), new C86009m1(it.next())));
                    }
                }
                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                intent.addFlags(268435456).addFlags(32768);
                intent.setType(addFavoriteUI2.getIntent().getType());
                MMWizardActivity.m7018M7(addFavoriteUI2, new Intent(addFavoriteUI2, SimpleLoginUI.class).addFlags(32768).addFlags(268435456), intent);
                addFavoriteUI2.finish();
            } else {
                DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                ArrayList<String> arrayList2 = addFavoriteUI2.f250305i;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    Log.m105928w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or paths is empty");
                    doFavoriteEvent.f264674d.f264687l = C0966R.string.f360421co1;
                } else if (arrayList2.size() > 9) {
                    doFavoriteEvent.f264674d.f264687l = C0966R.string.co8;
                } else {
                    Log.m105925i("MicroMsg.GetFavDataSource", "do fill event info(fav simple images), paths %s sourceType %d", arrayList2, 13);
                    C101801kd0 kd02 = new C101801kd0();
                    C101835rd0 rd02 = new C101835rd0();
                    for (String next : arrayList2) {
                        if (!Util.isNullOrNil(next)) {
                            C101834rc0 rc02 = new C101834rc0();
                            rc02.mo141260p(2);
                            rc02.f299284V = next;
                            rc02.mo141232F(true);
                            kd02.f298618f.add(rc02);
                        }
                    }
                    rd02.mo141275k(C75592q0.m90789s());
                    rd02.mo141279o(C75592q0.m90789s());
                    rd02.mo141277m(13);
                    rd02.mo141273f(Util.nowMilliSecond());
                    kd02.mo141219q(rd02);
                    DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
                    aVar.f264679d = "";
                    aVar.f264676a = kd02;
                    aVar.f264678c = 2;
                }
                DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
                aVar2.f264684i = addFavoriteUI2;
                aVar2.f264691p = new C85954j(addFavoriteUI2);
                aVar2.f264692q = new C85955k(addFavoriteUI2);
                C97625j3.m125815e().mo123455a(837, addFavoriteUI2);
                C86709a0.m107524d().mo123460f(new C40364n(1, addFavoriteUI2.f250305i, addFavoriteUI2.getCallerPackage()));
                addFavoriteUI2.mo119838N7();
                addFavoriteUI2.f250302f = doFavoriteEvent;
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.AddFavoriteUI$f */
    public class C85936f extends MMHandler {
        public C85936f() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0028, code lost:
            if (com.tencent.p014mm.sdk.platformtools.ImgUtil.isImgFile(r1) == false) goto L_0x00b5;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r7) {
            /*
                r6 = this;
                com.tencent.mm.ui.tools.AddFavoriteUI r7 = com.tencent.p014mm.p136ui.tools.AddFavoriteUI.this
                int r0 = com.tencent.p014mm.p136ui.tools.AddFavoriteUI.f250299p
                r7.mo119836L7()
                com.tencent.mm.ui.tools.AddFavoriteUI r7 = com.tencent.p014mm.p136ui.tools.AddFavoriteUI.this
                java.lang.String r7 = r7.f250303g
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                java.lang.String r0 = "MicroMsg.AddFavoriteUI"
                if (r7 != 0) goto L_0x00b5
                com.tencent.mm.ui.tools.AddFavoriteUI r7 = com.tencent.p014mm.p136ui.tools.AddFavoriteUI.this
                java.lang.String r7 = r7.f250303g
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isImageFilename(r7)
                if (r7 == 0) goto L_0x002c
                com.tencent.mm.ui.tools.AddFavoriteUI r7 = com.tencent.p014mm.p136ui.tools.AddFavoriteUI.this
                java.lang.String r1 = r7.f250303g
                r7.getClass()
                boolean r7 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isImgFile(r1)
                if (r7 != 0) goto L_0x002c
                goto L_0x00b5
            L_0x002c:
                com.tencent.mm.ui.tools.AddFavoriteUI r7 = com.tencent.p014mm.p136ui.tools.AddFavoriteUI.this
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                java.lang.String r3 = r7.f250303g
                r4 = 0
                r2[r4] = r3
                java.lang.String r3 = "filepath:[%s]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r2)
                android.content.Intent r2 = r7.getIntent()
                java.lang.String r2 = r2.resolveType(r7)
                int r2 = r7.mo119837M7(r2)
                r3 = -1
                if (r2 != r3) goto L_0x0053
                java.lang.String r1 = "launch, msgType is invalid"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
                r7.finish()
                goto L_0x00b4
            L_0x0053:
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r5 = r7.f250303g
                r3[r4] = r5
                java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
                r3[r1] = r5
                java.lang.String r5 = "filepath:[%s] dealWithSimpleItem msgType is %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r3)
                java.lang.String r0 = r7.f250303g
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 != 0) goto L_0x0074
                java.lang.String r0 = r7.f250303g
                r3 = 0
                r7.mo119835K7(r2, r0, r3, r1)
                goto L_0x00b4
            L_0x0074:
                android.content.Intent r0 = r7.getIntent()
                java.lang.String r1 = "Intro_Switch"
                boolean r0 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getBooleanExtra(r0, r1, r4)
                if (r0 != 0) goto L_0x00ae
                boolean r0 = eb0.C97625j3.m125820j()
                if (r0 == 0) goto L_0x00ae
                boolean r0 = f40.C86718e.m107551r()
                if (r0 != 0) goto L_0x00ae
                com.tencent.mm.autogen.events.DoFavoriteEvent r0 = new com.tencent.mm.autogen.events.DoFavoriteEvent
                r0.<init>()
                r1 = 13
                java.lang.String r2 = r7.f250303g
                com.tencent.p014mm.pluginsdk.model.C96787m0.m124252f(r0, r1, r2)
                com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r0.f264674d
                r1.f264684i = r7
                com.tencent.mm.ui.tools.l r2 = new com.tencent.mm.ui.tools.l
                r2.<init>(r7)
                r1.f264691p = r2
                com.tencent.mm.ui.tools.d r2 = new com.tencent.mm.ui.tools.d
                r2.<init>(r7)
                r1.f264692q = r2
                r0.publish()
                goto L_0x00b4
            L_0x00ae:
                r7.finish()
                r7.mo119839O7()
            L_0x00b4:
                return
            L_0x00b5:
                java.lang.String r7 = "launch : fail, filePath is null or file is not a valid img."
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r7)
                com.tencent.mm.ui.tools.AddFavoriteUI r7 = com.tencent.p014mm.p136ui.tools.AddFavoriteUI.this
                r7.mo119833I7()
                com.tencent.mm.ui.tools.AddFavoriteUI r7 = com.tencent.p014mm.p136ui.tools.AddFavoriteUI.this
                r7.finish()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.AddFavoriteUI.C85936f.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.AddFavoriteUI$g */
    public class C85937g implements Runnable {

        /* renamed from: d */
        public Uri f250314d;

        /* renamed from: e */
        public C85938h f250315e;

        public C85937g(Uri uri, C85938h hVar) {
            this.f250314d = uri;
            this.f250315e = hVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ac, code lost:
            if (r2 == false) goto L_0x00ae;
         */
        /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                r0 = 0
                r1 = 0
                com.tencent.mm.ui.tools.AddFavoriteUI r2 = com.tencent.p014mm.p136ui.tools.AddFavoriteUI.this     // Catch:{ Exception -> 0x00ec }
                android.net.Uri r3 = r6.f250314d     // Catch:{ Exception -> 0x00ec }
                java.lang.String r3 = com.tencent.p014mm.p136ui.tools.AddFavoriteUI.m106245H7(r2, r3)     // Catch:{ Exception -> 0x00ec }
                r2.f250303g = r3     // Catch:{ Exception -> 0x00ec }
                com.tencent.mm.ui.tools.AddFavoriteUI r2 = com.tencent.p014mm.p136ui.tools.AddFavoriteUI.this     // Catch:{ Exception -> 0x00ec }
                java.lang.String r2 = r2.f250303g     // Catch:{ Exception -> 0x00ec }
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ Exception -> 0x00ec }
                if (r2 != 0) goto L_0x00ae
                com.tencent.mm.ui.tools.AddFavoriteUI r2 = com.tencent.p014mm.p136ui.tools.AddFavoriteUI.this     // Catch:{ Exception -> 0x00ec }
                java.lang.String r2 = r2.f250303g     // Catch:{ Exception -> 0x00ec }
                android.net.Uri r2 = com.tencent.p014mm.vfs.C116299g2.m163858n(r2)     // Catch:{ Exception -> 0x00ec }
                java.lang.String r3 = r2.getPath()     // Catch:{ Exception -> 0x00ec }
                if (r3 == 0) goto L_0x003e
                java.lang.String r3 = com.tencent.p014mm.vfs.C116299g2.m163855k(r3, r1, r1)     // Catch:{ Exception -> 0x00ec }
                java.lang.String r4 = r2.getPath()     // Catch:{ Exception -> 0x00ec }
                boolean r4 = r4.equals(r3)     // Catch:{ Exception -> 0x00ec }
                if (r4 != 0) goto L_0x003e
                android.net.Uri$Builder r2 = r2.buildUpon()     // Catch:{ Exception -> 0x00ec }
                android.net.Uri$Builder r2 = r2.path(r3)     // Catch:{ Exception -> 0x00ec }
                android.net.Uri r2 = r2.build()     // Catch:{ Exception -> 0x00ec }
            L_0x003e:
                com.tencent.mm.vfs.f0 r3 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x00ec }
                com.tencent.mm.vfs.f0$h r2 = r3.mo177799l(r2, r0)     // Catch:{ Exception -> 0x00ec }
                boolean r3 = r2.mo177810a()     // Catch:{ Exception -> 0x00ec }
                if (r3 != 0) goto L_0x004c
                r2 = 0
                goto L_0x0054
            L_0x004c:
                com.tencent.mm.vfs.FileSystem$c r3 = r2.f348991a     // Catch:{ Exception -> 0x00ec }
                java.lang.String r2 = r2.f348992b     // Catch:{ Exception -> 0x00ec }
                boolean r2 = r3.mo119948x(r2)     // Catch:{ Exception -> 0x00ec }
            L_0x0054:
                if (r2 == 0) goto L_0x00ae
                int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00ec }
                r3 = 30
                if (r2 < r3) goto L_0x00e5
                com.tencent.mm.ui.tools.AddFavoriteUI r2 = com.tencent.p014mm.p136ui.tools.AddFavoriteUI.this     // Catch:{ Exception -> 0x00ec }
                java.lang.String r2 = r2.f250303g     // Catch:{ Exception -> 0x00ec }
                android.net.Uri r2 = com.tencent.p014mm.vfs.C116299g2.m163858n(r2)     // Catch:{ Exception -> 0x00ec }
                java.lang.String r3 = r2.getPath()     // Catch:{ Exception -> 0x00ec }
                if (r3 == 0) goto L_0x0084
                java.lang.String r3 = com.tencent.p014mm.vfs.C116299g2.m163855k(r3, r1, r1)     // Catch:{ Exception -> 0x00ec }
                java.lang.String r4 = r2.getPath()     // Catch:{ Exception -> 0x00ec }
                boolean r4 = r4.equals(r3)     // Catch:{ Exception -> 0x00ec }
                if (r4 != 0) goto L_0x0084
                android.net.Uri$Builder r2 = r2.buildUpon()     // Catch:{ Exception -> 0x00ec }
                android.net.Uri$Builder r2 = r2.path(r3)     // Catch:{ Exception -> 0x00ec }
                android.net.Uri r2 = r2.build()     // Catch:{ Exception -> 0x00ec }
            L_0x0084:
                com.tencent.mm.vfs.f0 r3 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x00ec }
                com.tencent.mm.vfs.f0$h r2 = r3.mo177799l(r2, r0)     // Catch:{ Exception -> 0x00ec }
                boolean r3 = r2.mo177810a()     // Catch:{ Exception -> 0x00ec }
                if (r3 != 0) goto L_0x0092
                r2 = 0
                goto L_0x00ac
            L_0x0092:
                com.tencent.mm.vfs.FileSystem$c r3 = r2.f348991a     // Catch:{ Exception -> 0x00ec }
                java.lang.String r4 = r2.f348992b     // Catch:{ Exception -> 0x00ec }
                java.lang.String r4 = r3.mo119947w(r4, r1)     // Catch:{ Exception -> 0x00ec }
                if (r4 == 0) goto L_0x00a6
                java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x00ec }
                r2.<init>(r4)     // Catch:{ Exception -> 0x00ec }
                boolean r2 = r2.canRead()     // Catch:{ Exception -> 0x00ec }
                goto L_0x00ac
            L_0x00a6:
                java.lang.String r2 = r2.f348992b     // Catch:{ Exception -> 0x00ec }
                boolean r2 = r3.mo119948x(r2)     // Catch:{ Exception -> 0x00ec }
            L_0x00ac:
                if (r2 != 0) goto L_0x00e5
            L_0x00ae:
                com.tencent.mm.ui.tools.AddFavoriteUI r2 = com.tencent.p014mm.p136ui.tools.AddFavoriteUI.this     // Catch:{ Exception -> 0x00ec }
                android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ Exception -> 0x00ec }
                android.net.Uri r3 = r6.f250314d     // Catch:{ Exception -> 0x00ec }
                java.lang.String r2 = r2.getType(r3)     // Catch:{ Exception -> 0x00ec }
                com.tencent.mm.ui.tools.AddFavoriteUI r3 = com.tencent.p014mm.p136ui.tools.AddFavoriteUI.this     // Catch:{ Exception -> 0x00ec }
                int r2 = r3.mo119837M7(r2)     // Catch:{ Exception -> 0x00ec }
                r3 = 2
                r4 = 1
                if (r2 != r3) goto L_0x00d3
                com.tencent.mm.ui.tools.AddFavoriteUI r2 = com.tencent.p014mm.p136ui.tools.AddFavoriteUI.this     // Catch:{ Exception -> 0x00ec }
                android.content.ContentResolver r3 = r2.getContentResolver()     // Catch:{ Exception -> 0x00ec }
                android.net.Uri r5 = r6.f250314d     // Catch:{ Exception -> 0x00ec }
                java.lang.String r3 = ud3.C90646e.m113613b(r3, r5, r4)     // Catch:{ Exception -> 0x00ec }
                r2.f250303g = r3     // Catch:{ Exception -> 0x00ec }
                goto L_0x00e5
            L_0x00d3:
                com.tencent.mm.ui.tools.AddFavoriteUI r2 = com.tencent.p014mm.p136ui.tools.AddFavoriteUI.this     // Catch:{ Exception -> 0x00ec }
                android.content.ContentResolver r3 = r2.getContentResolver()     // Catch:{ Exception -> 0x00ec }
                android.net.Uri r5 = r6.f250314d     // Catch:{ Exception -> 0x00ec }
                android.util.Pair r3 = ud3.C90646e.m113612a(r3, r5, r4)     // Catch:{ Exception -> 0x00ec }
                java.lang.Object r3 = r3.first     // Catch:{ Exception -> 0x00ec }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x00ec }
                r2.f250303g = r3     // Catch:{ Exception -> 0x00ec }
            L_0x00e5:
                com.tencent.mm.ui.tools.AddFavoriteUI$h r0 = r6.f250315e
                if (r0 == 0) goto L_0x0103
                goto L_0x00fe
            L_0x00ea:
                r0 = move-exception
                goto L_0x0104
            L_0x00ec:
                r2 = move-exception
                java.lang.String r3 = "MicroMsg.AddFavoriteUI"
                java.lang.String r4 = ""
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00ea }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r2, r4, r1)     // Catch:{ all -> 0x00ea }
                com.tencent.mm.ui.tools.AddFavoriteUI r1 = com.tencent.p014mm.p136ui.tools.AddFavoriteUI.this     // Catch:{ all -> 0x00ea }
                r1.f250303g = r0     // Catch:{ all -> 0x00ea }
                com.tencent.mm.ui.tools.AddFavoriteUI$h r0 = r6.f250315e
                if (r0 == 0) goto L_0x0103
            L_0x00fe:
                com.tencent.mm.ui.tools.h r0 = (com.tencent.p014mm.p136ui.tools.C85952h) r0
                r0.mo119859a()
            L_0x0103:
                return
            L_0x0104:
                com.tencent.mm.ui.tools.AddFavoriteUI$h r1 = r6.f250315e
                if (r1 == 0) goto L_0x010d
                com.tencent.mm.ui.tools.h r1 = (com.tencent.p014mm.p136ui.tools.C85952h) r1
                r1.mo119859a()
            L_0x010d:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.AddFavoriteUI.C85937g.run():void");
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.AddFavoriteUI$h */
    public interface C85938h {
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x026e A[SYNTHETIC, Splitter:B:108:0x026e] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0276 A[Catch:{ Exception -> 0x0272 }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x027b A[Catch:{ Exception -> 0x0272 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02aa A[SYNTHETIC, Splitter:B:123:0x02aa] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02b2 A[Catch:{ Exception -> 0x02ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02b7 A[Catch:{ Exception -> 0x02ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02e6 A[SYNTHETIC, Splitter:B:138:0x02e6] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02ee A[Catch:{ Exception -> 0x02ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02f3 A[Catch:{ Exception -> 0x02ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0305 A[SYNTHETIC, Splitter:B:150:0x0305] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x030d A[Catch:{ Exception -> 0x0309 }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0312 A[Catch:{ Exception -> 0x0309 }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:105:0x0253=Splitter:B:105:0x0253, B:135:0x02cb=Splitter:B:135:0x02cb, B:120:0x028f=Splitter:B:120:0x028f} */
    /* renamed from: H7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m106245H7(com.tencent.p014mm.p136ui.tools.AddFavoriteUI r12, android.net.Uri r13) {
        /*
            r12.getClass()
            java.lang.String r0 = r13.getScheme()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r2 = 1
            r3 = 0
            java.lang.String r4 = "MicroMsg.AddFavoriteUI"
            r5 = 0
            if (r1 == 0) goto L_0x001d
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r5] = r13
            java.lang.String r13 = "input uri error. %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r13, r12)
            goto L_0x032f
        L_0x001d:
            java.lang.String r1 = "file"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0053
            java.lang.String r12 = "getFilePath : scheme is SCHEME_FILE"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r12)
            java.lang.String r12 = r13.getPath()
            java.lang.String r3 = ud3.C90646e.m113615d(r12)
            if (r3 == 0) goto L_0x0036
            goto L_0x032f
        L_0x0036:
            java.lang.String r13 = "[-] getFilePath : fail, safePath is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r13)
            java.lang.IllegalAccessException r13 = new java.lang.IllegalAccessException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "safePath is null while process path: "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r13.<init>(r12)
            throw r13
        L_0x0053:
            java.lang.String r1 = "content"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0329
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getFilePath : scheme is SCHEME_CONTENT: "
            r0.append(r1)
            java.lang.String r1 = r13.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            android.content.ContentResolver r6 = r12.getContentResolver()
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r7 = r13
            android.database.Cursor r0 = r6.query(r7, r8, r9, r10, r11)
            if (r0 != 0) goto L_0x0089
            java.lang.String r12 = "getFilePath : fail, cursor is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r12)
            goto L_0x032f
        L_0x0089:
            int r1 = r0.getCount()
            if (r1 <= 0) goto L_0x0320
            boolean r1 = r0.moveToFirst()
            if (r1 != 0) goto L_0x0097
            goto L_0x0320
        L_0x0097:
            java.lang.String r1 = r13.toString()
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r6 = "content://com.android.contacts/contacts/as_vcard"
            boolean r6 = r1.startsWith(r6)
            if (r6 != 0) goto L_0x00d8
            java.lang.String r6 = "content://com.android.contacts/contacts/as_multi_vcard"
            boolean r6 = r1.startsWith(r6)
            if (r6 != 0) goto L_0x00d8
            java.lang.String r6 = "content://com.mediatek.calendarimporter"
            boolean r1 = r1.startsWith(r6)
            if (r1 != 0) goto L_0x00d8
            android.content.Intent r1 = r12.f250301e
            if (r1 == 0) goto L_0x00c8
            java.lang.String r1 = r1.getType()
            java.lang.String r6 = "text/x-vcalendar"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x00d8
        L_0x00c8:
            gj.m r1 = p156gj.C107835h0.f322856m
            int r1 = r1.f322911r
            if (r1 != r2) goto L_0x00cf
            goto L_0x00d8
        L_0x00cf:
            r0.close()
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.getFilePath(r12, r13)
            goto L_0x032f
        L_0x00d8:
            java.lang.String r1 = "_display_name"
            int r1 = r0.getColumnIndex(r1)
            r2 = -1
            if (r1 == r2) goto L_0x0105
            java.lang.String r1 = r0.getString(r1)
            if (r1 == 0) goto L_0x00ef
            java.lang.String r2 = "[^.\\w]+"
            java.lang.String r6 = "_"
            java.lang.String r1 = r1.replaceAll(r2, r6)
        L_0x00ef:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "vcard file name: "
            r2.append(r6)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            goto L_0x0107
        L_0x0105:
            java.lang.String r1 = "contact.vcf"
        L_0x0107:
            r0.close()
            android.content.ContentResolver r0 = r12.getContentResolver()     // Catch:{ FileNotFoundException -> 0x02c7, IOException -> 0x028b, Exception -> 0x024f, all -> 0x024a }
            java.lang.String r2 = "r"
            android.content.res.AssetFileDescriptor r13 = r0.openAssetFileDescriptor(r13, r2)     // Catch:{ FileNotFoundException -> 0x02c7, IOException -> 0x028b, Exception -> 0x024f, all -> 0x024a }
            java.io.FileInputStream r0 = r13.createInputStream()     // Catch:{ FileNotFoundException -> 0x0247, IOException -> 0x0245, Exception -> 0x0243, all -> 0x023e }
            long r6 = r13.getDeclaredLength()     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            int r2 = (int) r6     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            byte[] r6 = new byte[r2]     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            int r7 = r0.read(r6)     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            if (r7 <= 0) goto L_0x021e
            eb0.c r7 = eb0.C97625j3.m125812b()     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            boolean r7 = r7.mo105883I()     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            if (r7 != 0) goto L_0x0179
            r12.deleteFile(r1)     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            java.io.OutputStream r2 = com.tencent.p014mm.vfs.C86013q1.m106429K(r1, r5)     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            r2.write(r6)     // Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x0173, Exception -> 0x0170 }
            r2.flush()     // Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x0173, Exception -> 0x0170 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x0173, Exception -> 0x0170 }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x0173, Exception -> 0x0170 }
            java.io.File r12 = r12.getFilesDir()     // Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x0173, Exception -> 0x0170 }
            java.lang.String r12 = r12.getPath()     // Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x0173, Exception -> 0x0170 }
            r6.append(r12)     // Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x0173, Exception -> 0x0170 }
            java.lang.String r12 = "/"
            r6.append(r12)     // Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x0173, Exception -> 0x0170 }
            r6.append(r1)     // Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x0173, Exception -> 0x0170 }
            java.lang.String r3 = r6.toString()     // Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x0173, Exception -> 0x0170 }
            r0.close()     // Catch:{ Exception -> 0x0164 }
            r13.close()     // Catch:{ Exception -> 0x0164 }
            r2.close()     // Catch:{ Exception -> 0x0164 }
            goto L_0x032f
        L_0x0164:
            r12 = move-exception
            java.lang.String r13 = r12.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r12, r13, r0)
            goto L_0x032f
        L_0x0170:
            r12 = move-exception
            goto L_0x0253
        L_0x0173:
            r12 = move-exception
            goto L_0x028f
        L_0x0176:
            r12 = move-exception
            goto L_0x02cb
        L_0x0179:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            r12.<init>()     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            java.lang.String r7 = a70.C112760b.m154195C()     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            r12.append(r7)     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            java.lang.String r7 = "share"
            r12.append(r7)     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            java.lang.String r12 = r12.toString()     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            r7.<init>()     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            java.lang.String r8 = a70.C112760b.m154195C()     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            r7.append(r8)     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            java.lang.String r8 = "share/"
            r7.append(r8)     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            r7.append(r1)     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            java.lang.String r1 = r7.toString()     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            android.net.Uri r12 = com.tencent.p014mm.vfs.C116299g2.m163858n(r12)     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            java.lang.String r7 = r12.getPath()     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            if (r7 == 0) goto L_0x01cc
            java.lang.String r7 = com.tencent.p014mm.vfs.C116299g2.m163855k(r7, r5, r5)     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            java.lang.String r8 = r12.getPath()     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            boolean r8 = r8.equals(r7)     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            if (r8 != 0) goto L_0x01cc
            android.net.Uri$Builder r12 = r12.buildUpon()     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            android.net.Uri$Builder r12 = r12.path(r7)     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            android.net.Uri r12 = r12.build()     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
        L_0x01cc:
            com.tencent.mm.vfs.f0 r7 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            com.tencent.mm.vfs.f0$h r8 = r7.mo177799l(r12, r3)     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            boolean r9 = r8.mo177810a()     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            if (r9 != 0) goto L_0x01da
            r9 = 0
            goto L_0x01e2
        L_0x01da:
            com.tencent.mm.vfs.FileSystem$c r9 = r8.f348991a     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            java.lang.String r10 = r8.f348992b     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            boolean r9 = r9.mo119948x(r10)     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
        L_0x01e2:
            if (r9 != 0) goto L_0x01f6
            com.tencent.mm.vfs.f0$h r12 = r7.mo177799l(r12, r8)     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            boolean r7 = r12.mo177810a()     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            if (r7 != 0) goto L_0x01ef
            goto L_0x01f6
        L_0x01ef:
            com.tencent.mm.vfs.FileSystem$c r7 = r12.f348991a     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            java.lang.String r12 = r12.f348992b     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            r7.mo119937g(r12)     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
        L_0x01f6:
            com.tencent.mm.vfs.m1 r12 = new com.tencent.mm.vfs.m1     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            r12.<init>((java.lang.String) r1)     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            boolean r7 = r12.mo119967g()     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            if (r7 != 0) goto L_0x0204
            r12.mo119964e()     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
        L_0x0204:
            int r12 = com.tencent.p014mm.vfs.C86013q1.m106438T(r1, r6, r5, r2)     // Catch:{ FileNotFoundException -> 0x023a, IOException -> 0x0237, Exception -> 0x0234, all -> 0x0232 }
            if (r12 != 0) goto L_0x021e
            r0.close()     // Catch:{ Exception -> 0x0211 }
            r13.close()     // Catch:{ Exception -> 0x0211 }
            goto L_0x021b
        L_0x0211:
            r12 = move-exception
            java.lang.String r13 = r12.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r12, r13, r0)
        L_0x021b:
            r3 = r1
            goto L_0x032f
        L_0x021e:
            r0.close()     // Catch:{ Exception -> 0x0226 }
            r13.close()     // Catch:{ Exception -> 0x0226 }
            goto L_0x032f
        L_0x0226:
            r12 = move-exception
            java.lang.String r13 = r12.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r12, r13, r0)
            goto L_0x032f
        L_0x0232:
            r12 = move-exception
            goto L_0x0240
        L_0x0234:
            r12 = move-exception
            r2 = r3
            goto L_0x0253
        L_0x0237:
            r12 = move-exception
            r2 = r3
            goto L_0x028f
        L_0x023a:
            r12 = move-exception
            r2 = r3
            goto L_0x02cb
        L_0x023e:
            r12 = move-exception
            r0 = r3
        L_0x0240:
            r2 = r3
            goto L_0x0302
        L_0x0243:
            r12 = move-exception
            goto L_0x0251
        L_0x0245:
            r12 = move-exception
            goto L_0x028d
        L_0x0247:
            r12 = move-exception
            goto L_0x02c9
        L_0x024a:
            r12 = move-exception
            r13 = r3
            r2 = r13
            goto L_0x0303
        L_0x024f:
            r12 = move-exception
            r13 = r3
        L_0x0251:
            r0 = r3
            r2 = r0
        L_0x0253:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0301 }
            r1.<init>()     // Catch:{ all -> 0x0301 }
            java.lang.String r6 = "vcard uri exception"
            r1.append(r6)     // Catch:{ all -> 0x0301 }
            java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x0301 }
            r1.append(r12)     // Catch:{ all -> 0x0301 }
            java.lang.String r12 = r1.toString()     // Catch:{ all -> 0x0301 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r12)     // Catch:{ all -> 0x0301 }
            if (r0 == 0) goto L_0x0274
            r0.close()     // Catch:{ Exception -> 0x0272 }
            goto L_0x0274
        L_0x0272:
            r12 = move-exception
            goto L_0x0280
        L_0x0274:
            if (r13 == 0) goto L_0x0279
            r13.close()     // Catch:{ Exception -> 0x0272 }
        L_0x0279:
            if (r2 == 0) goto L_0x032f
            r2.close()     // Catch:{ Exception -> 0x0272 }
            goto L_0x032f
        L_0x0280:
            java.lang.String r13 = r12.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r12, r13, r0)
            goto L_0x032f
        L_0x028b:
            r12 = move-exception
            r13 = r3
        L_0x028d:
            r0 = r3
            r2 = r0
        L_0x028f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0301 }
            r1.<init>()     // Catch:{ all -> 0x0301 }
            java.lang.String r6 = "vcard uri ioexception"
            r1.append(r6)     // Catch:{ all -> 0x0301 }
            java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x0301 }
            r1.append(r12)     // Catch:{ all -> 0x0301 }
            java.lang.String r12 = r1.toString()     // Catch:{ all -> 0x0301 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r12)     // Catch:{ all -> 0x0301 }
            if (r0 == 0) goto L_0x02b0
            r0.close()     // Catch:{ Exception -> 0x02ae }
            goto L_0x02b0
        L_0x02ae:
            r12 = move-exception
            goto L_0x02bc
        L_0x02b0:
            if (r13 == 0) goto L_0x02b5
            r13.close()     // Catch:{ Exception -> 0x02ae }
        L_0x02b5:
            if (r2 == 0) goto L_0x032f
            r2.close()     // Catch:{ Exception -> 0x02ae }
            goto L_0x032f
        L_0x02bc:
            java.lang.String r13 = r12.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r12, r13, r0)
            goto L_0x032f
        L_0x02c7:
            r12 = move-exception
            r13 = r3
        L_0x02c9:
            r0 = r3
            r2 = r0
        L_0x02cb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0301 }
            r1.<init>()     // Catch:{ all -> 0x0301 }
            java.lang.String r6 = "vcard uri file not found "
            r1.append(r6)     // Catch:{ all -> 0x0301 }
            java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x0301 }
            r1.append(r12)     // Catch:{ all -> 0x0301 }
            java.lang.String r12 = r1.toString()     // Catch:{ all -> 0x0301 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r12)     // Catch:{ all -> 0x0301 }
            if (r0 == 0) goto L_0x02ec
            r0.close()     // Catch:{ Exception -> 0x02ea }
            goto L_0x02ec
        L_0x02ea:
            r12 = move-exception
            goto L_0x02f7
        L_0x02ec:
            if (r13 == 0) goto L_0x02f1
            r13.close()     // Catch:{ Exception -> 0x02ea }
        L_0x02f1:
            if (r2 == 0) goto L_0x032f
            r2.close()     // Catch:{ Exception -> 0x02ea }
            goto L_0x032f
        L_0x02f7:
            java.lang.String r13 = r12.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r12, r13, r0)
            goto L_0x032f
        L_0x0301:
            r12 = move-exception
        L_0x0302:
            r3 = r0
        L_0x0303:
            if (r3 == 0) goto L_0x030b
            r3.close()     // Catch:{ Exception -> 0x0309 }
            goto L_0x030b
        L_0x0309:
            r13 = move-exception
            goto L_0x0316
        L_0x030b:
            if (r13 == 0) goto L_0x0310
            r13.close()     // Catch:{ Exception -> 0x0309 }
        L_0x0310:
            if (r2 == 0) goto L_0x031f
            r2.close()     // Catch:{ Exception -> 0x0309 }
            goto L_0x031f
        L_0x0316:
            java.lang.String r0 = r13.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r13, r0, r1)
        L_0x031f:
            throw r12
        L_0x0320:
            r0.close()
            java.lang.String r12 = "getFilePath : fail, cursor getCount is 0 or moveToFirst fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r12)
            goto L_0x032f
        L_0x0329:
            java.lang.String r12 = "unknown scheme"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r12)
        L_0x032f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.AddFavoriteUI.m106245H7(com.tencent.mm.ui.tools.AddFavoriteUI, android.net.Uri):java.lang.String");
    }

    /* renamed from: I7 */
    public final void mo119833I7() {
        mo119834J7(0);
        C76701a.makeText((Context) this, (int) C0966R.string.f361356j70, 1).show();
    }

    /* renamed from: J7 */
    public final void mo119834J7(int i) {
        if (i != 1) {
            C76701a.makeText((Context) this, (int) C0966R.string.f361356j70, 1).show();
        } else {
            C76701a.makeText((Context) this, (int) C0966R.string.j6x, 1).show();
        }
    }

    /* renamed from: K7 */
    public final void mo119835K7(int i, String str, String str2, boolean z) {
        WXFileObject wXFileObject;
        C40364n nVar;
        int i2 = i;
        String str3 = str;
        boolean z2 = z;
        Class cls = C100718j1.class;
        if (str3 == null || str.length() == 0) {
            Log.m105920e("MicroMsg.AddFavoriteUI", "dealWithFile fail, filePath is empty");
            return;
        }
        long l = C86013q1.m106451l(str);
        Log.m105925i("MicroMsg.AddFavoriteUI", "filelength: [%d]", Long.valueOf(l));
        if (l == 0) {
            Log.m105920e("MicroMsg.AddFavoriteUI", "dealWithFile fail, fileLength is 0");
            C76701a.makeText((Context) this, (int) C0966R.string.cok, 1).show();
            finish();
            return;
        }
        long zv = ((C100718j1) C86312j.m106911c(cls)).mo128217zv(z2, i2);
        int Jt = ((C100718j1) C86312j.m106911c(cls)).mo128200Jt(z2, i2);
        if (l > zv) {
            Log.m105920e("MicroMsg.AddFavoriteUI", "dealWithFile fail, fileLength is too large");
            C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.f360438cs3, new Object[]{Integer.valueOf(Jt)}), 1).show();
            finish();
        } else if (!C97625j3.m125820j() || C86718e.m107551r()) {
            Log.m105928w("MicroMsg.AddFavoriteUI", "not logged in, jump to simple login");
            finish();
            mo119839O7();
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str3);
            DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
            String str4 = C86013q1.m106457r(str) + "." + C86013q1.m106454o(str);
            if (i2 == 2) {
                WXImageObject wXImageObject = new WXImageObject();
                wXImageObject.setImagePath(str3);
                nVar = new C40364n(1, arrayList, getCallerPackage());
                C96787m0.m124252f(doFavoriteEvent, 13, str3);
                wXFileObject = wXImageObject;
            } else if (i2 != 4) {
                WXFileObject wXFileObject2 = new WXFileObject(str3);
                C96787m0.m124254h(doFavoriteEvent, 13, str, str4, "", z);
                nVar = new C40364n(4, arrayList, getCallerPackage());
                wXFileObject = wXFileObject2;
            } else {
                WXVideoFileObject wXVideoFileObject = new WXVideoFileObject(str3);
                C40364n nVar2 = new C40364n(3, arrayList, getCallerPackage());
                C96787m0.m124253g(doFavoriteEvent, 13, str, (String) null, 0, str4, "", z);
                wXFileObject = wXVideoFileObject;
                nVar = nVar2;
            }
            WXMediaMessage wXMediaMessage = new WXMediaMessage(wXFileObject);
            Uri n = C116299g2.m163858n(str);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            String path2 = n.getPath();
            int lastIndexOf = path2.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                path2 = path2.substring(lastIndexOf + 1);
            }
            wXMediaMessage.title = path2;
            if (Util.isNullOrNil(str2)) {
                wXMediaMessage.description = Util.getSizeKB(l);
            } else {
                wXMediaMessage.description = str2;
            }
            if (l < 30720) {
                wXMediaMessage.thumbData = C86013q1.m106433O(str3, 0, -1);
            } else {
                Log.m105924i("MicroMsg.AddFavoriteUI", "thumb data is exceed 30k, ignore");
            }
            SendMessageToWX.Req req = new SendMessageToWX.Req();
            req.transaction = null;
            req.message = wXMediaMessage;
            Bundle bundle = new Bundle();
            req.toBundle(bundle);
            bundle.putInt(ConstantsAPI.SDK_VERSION, Build.SDK_INT);
            bundle.putString(ConstantsAPI.APP_PACKAGE, "com.tencent.mm.openapi");
            bundle.putString("SendAppMessageWrapper_AppId", "wx4310bbd51be7d979");
            DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
            aVar.f264684i = this;
            aVar.f264691p = new C85931a();
            aVar.f264692q = new C85932b();
            this.f250302f = doFavoriteEvent;
            C86709a0.m107524d().mo123455a(837, this);
            C86709a0.m107524d().mo123460f(nVar);
            mo119838N7();
        }
    }

    /* renamed from: L7 */
    public final void mo119836L7() {
        ProgressDialog progressDialog = this.f250300d;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f250300d.dismiss();
        }
    }

    /* renamed from: M7 */
    public final int mo119837M7(String str) {
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.AddFavoriteUI", "map : mimeType is null");
            return -1;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.contains("image") || lowerCase.equals("application/vnd.google.panorama360+jpg")) {
            return 2;
        }
        if (lowerCase.contains("video")) {
            return 4;
        }
        Log.m105918d("MicroMsg.AddFavoriteUI", "map : unknown mimetype, send as file");
        return 8;
    }

    /* renamed from: N7 */
    public final void mo119838N7() {
        this.f250300d = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, new C85933c(this));
    }

    /* renamed from: O7 */
    public final void mo119839O7() {
        Intent intent = new Intent(this, AddFavoriteUI.class);
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", Util.isNullOrNil(this.f250303g) ? null : FileProviderHelper.getUriForFile(getContext(), new C86009m1(this.f250303g)));
        intent.addFlags(268435456).addFlags(32768);
        intent.setType(getIntent().getType());
        MMWizardActivity.m7018M7(this, new Intent(this, SimpleLoginUI.class).addFlags(32768).addFlags(268435456), intent);
    }

    public int getLayoutId() {
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:93:0x0238 A[EDGE_INSN: B:93:0x0238->B:85:0x0238 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r12 = this;
            android.content.Intent r0 = r12.getIntent()
            r12.f250301e = r0
            java.lang.String r1 = "MicroMsg.AddFavoriteUI"
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = "launch : fail, intent is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            r12.mo119833I7()
            r12.finish()
            goto L_0x0268
        L_0x0017:
            java.lang.String r0 = r0.getAction()
            android.content.Intent r2 = r12.f250301e
            android.os.Bundle r2 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getExtras(r2)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r3 == 0) goto L_0x0034
            java.lang.String r0 = "launch : fail, action is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            r12.mo119833I7()
            r12.finish()
            goto L_0x0268
        L_0x0034:
            java.lang.String r3 = "android.intent.extra.STREAM"
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0072
            android.os.Parcelable r6 = r2.getParcelable(r3)
            boolean r7 = r6 instanceof android.net.Uri
            if (r7 == 0) goto L_0x005f
            android.net.Uri r6 = (android.net.Uri) r6
            r12.f250304h = r6
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isUriSafeToBeCopySrc(r6)
            if (r6 != 0) goto L_0x0072
            java.lang.Object[] r0 = new java.lang.Object[r4]
            android.net.Uri r2 = r12.f250304h
            r0[r5] = r2
            java.lang.String r2 = "launch : fail, not accept, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r0)
            r12.mo119833I7()
            r12.finish()
            goto L_0x0268
        L_0x005f:
            if (r6 == 0) goto L_0x0072
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r6
            java.lang.String r2 = "launch : fail, uri check fail, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r0)
            r12.mo119833I7()
            r12.finish()
            goto L_0x0268
        L_0x0072:
            java.lang.String r6 = "android.intent.action.SEND"
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L_0x00b8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "send signal: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            android.net.Uri r0 = r12.f250304h
            if (r0 != 0) goto L_0x00a2
            r12.mo119838N7()
            com.tencent.mm.ui.tools.g r0 = new com.tencent.mm.ui.tools.g
            r0.<init>(r12)
            java.lang.String r1 = "AddFavoriteUI_dealWithTextHandler"
            com.tencent.p014mm.sdk.thread.ThreadPool.post(r0, r1)
            goto L_0x0268
        L_0x00a2:
            r12.mo119838N7()
            com.tencent.mm.ui.tools.AddFavoriteUI$g r0 = new com.tencent.mm.ui.tools.AddFavoriteUI$g
            android.net.Uri r1 = r12.f250304h
            com.tencent.mm.ui.tools.h r2 = new com.tencent.mm.ui.tools.h
            r2.<init>(r12)
            r0.<init>(r1, r2)
            java.lang.String r1 = "AddFavoriteUI_getFilePath"
            com.tencent.p014mm.sdk.thread.ThreadPool.post(r0, r1)
            goto L_0x0268
        L_0x00b8:
            java.lang.String r6 = "android.intent.action.SEND_MULTIPLE"
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L_0x025d
            if (r2 == 0) goto L_0x025d
            boolean r6 = r2.containsKey(r3)
            if (r6 == 0) goto L_0x025d
            android.content.Intent r6 = r12.getIntent()
            java.lang.String r6 = r6.resolveType(r12)
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r5] = r0
            r8[r4] = r6
            java.lang.String r0 = "send multi: %s, mimeType %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r8)
            java.lang.String r0 = ""
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r0)
            java.lang.String r6 = "image"
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L_0x00f8
            java.lang.String r0 = "launch : fail, mimeType not contains image"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            r12.mo119834J7(r4)
            r12.finish()
            goto L_0x0268
        L_0x00f8:
            java.util.ArrayList r0 = r2.getParcelableArrayList(r3)
            r2 = 0
            if (r0 == 0) goto L_0x0233
            int r3 = r0.size()
            if (r3 <= 0) goto L_0x0233
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x010e:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x022b
            java.lang.Object r6 = r0.next()
            android.os.Parcelable r6 = (android.os.Parcelable) r6
            if (r6 == 0) goto L_0x021e
            boolean r8 = r6 instanceof android.net.Uri
            if (r8 != 0) goto L_0x0122
            goto L_0x021e
        L_0x0122:
            android.net.Uri r6 = (android.net.Uri) r6
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isUriSafeToBeCopySrc(r6)
            if (r8 == 0) goto L_0x0208
            java.lang.String r8 = r6.getScheme()
            if (r8 == 0) goto L_0x0208
            r8 = 30
            boolean r8 = p206nj.C11171e.m11046c(r8)
            if (r8 != 0) goto L_0x0154
            boolean r8 = com.tencent.p014mm.sdk.vendor.Huawei.ifOnlyHUAWEI()
            if (r8 != 0) goto L_0x0146
            com.tencent.mm.sdk.vendor.Honor r8 = com.tencent.p014mm.sdk.vendor.Honor.INSTANCE
            boolean r8 = r8.ifHONOR()
            if (r8 == 0) goto L_0x014f
        L_0x0146:
            r8 = 29
            boolean r8 = p206nj.C11171e.m11046c(r8)
            if (r8 == 0) goto L_0x014f
            goto L_0x0154
        L_0x014f:
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.getFilePath(r12, r6)
            goto L_0x01ac
        L_0x0154:
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.getFilePath(r12, r6)
            if (r8 == 0) goto L_0x01ac
            android.net.Uri r9 = com.tencent.p014mm.vfs.C116299g2.m163858n(r8)
            java.lang.String r10 = r9.getPath()
            if (r10 == 0) goto L_0x017e
            java.lang.String r10 = com.tencent.p014mm.vfs.C116299g2.m163855k(r10, r5, r5)
            java.lang.String r11 = r9.getPath()
            boolean r11 = r11.equals(r10)
            if (r11 != 0) goto L_0x017e
            android.net.Uri$Builder r9 = r9.buildUpon()
            android.net.Uri$Builder r9 = r9.path(r10)
            android.net.Uri r9 = r9.build()
        L_0x017e:
            com.tencent.mm.vfs.f0 r10 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r9 = r10.mo177799l(r9, r2)
            boolean r10 = r9.mo177810a()
            if (r10 != 0) goto L_0x018c
            r9 = 0
            goto L_0x01a6
        L_0x018c:
            com.tencent.mm.vfs.FileSystem$c r10 = r9.f348991a
            java.lang.String r11 = r9.f348992b
            java.lang.String r11 = r10.mo119947w(r11, r5)
            if (r11 == 0) goto L_0x01a0
            java.io.File r9 = new java.io.File
            r9.<init>(r11)
            boolean r9 = r9.canRead()
            goto L_0x01a6
        L_0x01a0:
            java.lang.String r9 = r9.f348992b
            boolean r9 = r10.mo119948x(r9)
        L_0x01a6:
            if (r9 != 0) goto L_0x01ac
            java.lang.String r8 = r6.toString()
        L_0x01ac:
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r6 = r6.toString()
            r9[r5] = r6
            r9[r4] = r8
            int r6 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9[r7] = r6
            java.lang.String r6 = "multiSend uri: %s, original filePath: %s version:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r9)
            java.lang.String r6 = ud3.C90646e.m113615d(r8)
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r8 != 0) goto L_0x0227
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isImageFilename(r6)
            if (r8 == 0) goto L_0x01f3
            boolean r8 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isImgFile(r6)
            if (r8 == 0) goto L_0x01f3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "multisend file path: "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r8)
            r3.add(r6)
            r6 = 1
            goto L_0x0228
        L_0x01f3:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "multisend tries to send illegal img: "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r6)
            goto L_0x0227
        L_0x0208:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "unaccepted uri: "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r6)
            goto L_0x0227
        L_0x021e:
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r8[r5] = r6
            java.lang.String r6 = "getMultiSendFilePath failed, error parcelable, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r6, r8)
        L_0x0227:
            r6 = 0
        L_0x0228:
            if (r6 != 0) goto L_0x010e
            goto L_0x0238
        L_0x022b:
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x0238
            r2 = r3
            goto L_0x0238
        L_0x0233:
            java.lang.String r0 = "getParcelableArrayList failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x0238:
            r12.f250305i = r2
            if (r2 == 0) goto L_0x0251
            int r0 = r2.size()
            if (r0 != 0) goto L_0x0243
            goto L_0x0251
        L_0x0243:
            r12.mo119838N7()
            com.tencent.mm.ui.tools.i r0 = new com.tencent.mm.ui.tools.i
            r0.<init>(r12)
            java.lang.String r1 = "AddFavoriteUI_dealWithMultiItemHandler"
            com.tencent.p014mm.sdk.thread.ThreadPool.post(r0, r1)
            goto L_0x0268
        L_0x0251:
            java.lang.String r0 = "launch : fail, filePathList is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            r12.mo119834J7(r4)
            r12.finish()
            goto L_0x0268
        L_0x025d:
            java.lang.String r0 = "launch : fail, uri is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            r12.mo119833I7()
            r12.finish()
        L_0x0268:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.AddFavoriteUI.initView():void");
    }

    public void onCreate(Bundle bundle) {
        Log.m105924i("MicroMsg.AddFavoriteUI", "on create");
        super.onCreate(bundle);
        setTitleVisibility(8);
        int intExtra = IntentUtil.getIntExtra(getIntent(), "wizard_activity_result_code", 0);
        if (intExtra == -1 || intExtra == 0) {
            NotifyReceiver.m98645c();
            initView();
        } else if (intExtra != 1) {
            Log.m105920e("MicroMsg.AddFavoriteUI", "onCreate, should not reach here, resultCode = " + intExtra);
            finish();
        } else {
            finish();
        }
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.AddFavoriteUI", "on Destroy");
        C97625j3.m125815e().mo123470p(837, this);
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        Log.m105924i("MicroMsg.AddFavoriteUI", "on NewIntent");
        super.onNewIntent(intent);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        Log.m105924i("MicroMsg.AddFavoriteUI", "on RestoreInstanceState");
        super.onRestoreInstanceState(bundle);
    }

    public void onSaveInstanceState(Bundle bundle) {
        Log.m105924i("MicroMsg.AddFavoriteUI", "on SaveInstanceState");
        super.onSaveInstanceState(bundle);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.AddFavoriteUI", "onSceneEnd, errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        mo119836L7();
        if (!(yVar instanceof C40364n)) {
            return;
        }
        if (i == 0 && i2 == 0) {
            DoFavoriteEvent doFavoriteEvent = this.f250302f;
            if (doFavoriteEvent != null) {
                doFavoriteEvent.publish();
                this.f250302f = null;
            }
        } else if (yVar.getReqResp() != null) {
            C51740vu vuVar = (C51740vu) ((C47350c) yVar.getReqResp()).f127056b.f127083a;
            if (vuVar == null || Util.isNullOrNil(vuVar.f143697d)) {
                DoFavoriteEvent doFavoriteEvent2 = this.f250302f;
                if (doFavoriteEvent2 != null) {
                    doFavoriteEvent2.publish();
                    this.f250302f = null;
                    return;
                }
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("rawUrl", vuVar.f143697d);
            intent.putExtra("showShare", false);
            intent.putExtra("show_bottom", false);
            intent.putExtra("needRedirect", false);
            C88144b.m109791i(this, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            finish();
        }
    }
}
