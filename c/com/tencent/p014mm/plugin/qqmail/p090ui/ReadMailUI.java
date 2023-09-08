package com.tencent.p014mm.plugin.qqmail.p090ui;

import ag2.C79544u;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.ipcinvoker.type.IPCLong;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C30612f0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44234a0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44243c0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C85585g0;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WebView;
import dg2.C45339o;
import dg2.C45340r;
import dg2.C86280j;
import dg2.C86281k;
import dg2.C86282l;
import dg2.C86285n;
import dg2.C86286p;
import dg2.C86288s;
import di3.C86312j;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import ji3.C9457a;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import nd3.C47223a;
import nj3.C11184p0;
import nj3.C76879j;
import p159gw.C45962f;
import zf2.C16156a;
import zf2.C16158d;
import zf2.C16159e;
import zf2.C16160f;
import zf2.C16161g;
import zf2.C16162i;
import zf2.C16163l;
import zf2.C53777h;
import zf2.C91682b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.qqmail.ui.ReadMailUI */
public class ReadMailUI extends MMActivity {

    /* renamed from: M */
    public static String f248800M = "var mail_css = document.createElement(\"style\");";

    /* renamed from: N */
    public static String f248801N = "";

    /* renamed from: P */
    public static String f248802P = "";

    /* renamed from: Q */
    public static float f248803Q;

    /* renamed from: R */
    public static int f248804R;

    /* renamed from: A */
    public String f248805A;

    /* renamed from: B */
    public String f248806B;

    /* renamed from: C */
    public String f248807C;

    /* renamed from: D */
    public long f248808D = -1;

    /* renamed from: E */
    public int f248809E = 0;

    /* renamed from: F */
    public String f248810F;

    /* renamed from: G */
    public int f248811G = 0;

    /* renamed from: H */
    public int f248812H = 0;

    /* renamed from: I */
    public SharedPreferences f248813I;

    /* renamed from: J */
    public String f248814J;

    /* renamed from: K */
    public int f248815K;

    /* renamed from: L */
    public MTimerHandler f248816L = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C85385d(), true);

    /* renamed from: d */
    public long f248817d = -1;

    /* renamed from: e */
    public C79544u f248818e;

    /* renamed from: f */
    public MMWebView f248819f;

    /* renamed from: g */
    public ProgressBar f248820g;

    /* renamed from: h */
    public ImageView f248821h;

    /* renamed from: i */
    public MailAddrsViewControl f248822i;

    /* renamed from: j */
    public MailAddrsViewControl f248823j;

    /* renamed from: n */
    public MailAddrsViewControl f248824n;

    /* renamed from: o */
    public TextView f248825o;

    /* renamed from: p */
    public View f248826p;

    /* renamed from: q */
    public TextView f248827q;

    /* renamed from: r */
    public TextView f248828r;

    /* renamed from: s */
    public TextView f248829s;

    /* renamed from: t */
    public LinearLayout f248830t;

    /* renamed from: u */
    public MailAttachListLinearLayout f248831u;

    /* renamed from: v */
    public View f248832v;

    /* renamed from: w */
    public TextView f248833w;

    /* renamed from: x */
    public TextView f248834x;

    /* renamed from: y */
    public View f248835y;

    /* renamed from: z */
    public boolean f248836z;

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ReadMailUI$e */
    public class C42799e implements View.OnClickListener {
        public C42799e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/ReadMailUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ReadMailUI readMailUI = ReadMailUI.this;
            int i = readMailUI.f248812H;
            if (i == 0) {
                ReadMailUI.m105394H7(readMailUI, 11288, 2);
                if (Util.isNullOrNil(ReadMailUI.this.f248806B) || Util.isNullOrNil(ReadMailUI.this.f248807C)) {
                    ReadMailUI readMailUI2 = ReadMailUI.this;
                    readMailUI2.getClass();
                    ((C119157j) C119157j.f356862d).mo183876g(new C86282l(readMailUI2), "initQQMailDownloadUrlAndMD5");
                } else {
                    ReadMailUI.m105395I7(ReadMailUI.this);
                }
            } else if (i == 1) {
                ReadMailUI.m105394H7(readMailUI, 11288, 1);
                Log.m105921e("MicroMsg.ReadMailUI", "cancel_download_task:fail_apilevel_too_low downloadId = %d", Long.valueOf(ReadMailUI.this.f248808D));
            } else if (i == 2) {
                ReadMailUI.m105394H7(readMailUI, 11288, 3);
                ReadMailUI readMailUI3 = ReadMailUI.this;
                Log.m105925i("MicroMsg.ReadMailUI", "try to install %s", readMailUI3.f248810F);
                if (!Util.isNullOrNil(readMailUI3.f248810F)) {
                    ((C45962f) C86312j.m106911c(C45962f.class)).go0(readMailUI3, readMailUI3.f248810F, (C47223a) null, false);
                }
            } else if (i == 3) {
                ReadMailUI.m105394H7(readMailUI, 11288, 4);
                ReadMailUI readMailUI4 = ReadMailUI.this;
                readMailUI4.getClass();
                Intent intent = new Intent();
                if (Util.isNullOrNil(readMailUI4.f248814J)) {
                    Log.m105928w("MicroMsg.ReadMailUI", "mQQMailSchemeForUnread is null");
                    Intent launchIntentForPackage = readMailUI4.getPackageManager().getLaunchIntentForPackage("com.tencent.androidqqmail");
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(launchIntentForPackage);
                    ReadMailUI readMailUI5 = readMailUI4;
                    C117292a.m165358d(readMailUI5, aVar.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/ReadMailUI", "openQQMail", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    readMailUI4.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(readMailUI5, "com/tencent/mm/plugin/qqmail/ui/ReadMailUI", "openQQMail", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    String str = readMailUI4.f248814J;
                    Log.m105919d("MicroMsg.ReadMailUI", "qq mail scheme:%s", str);
                    intent.setData(Uri.parse(str));
                    intent.addFlags(268435456);
                    intent.addFlags(32768);
                    if (Util.isIntentAvailable(readMailUI4, intent, false)) {
                        C9457a.m9137a(new C45339o(readMailUI4, intent));
                    } else {
                        Log.m105928w("MicroMsg.ReadMailUI", "schema failed");
                        C9457a.m9137a(new C45340r(readMailUI4));
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ReadMailUI$l */
    public class C42800l {
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ReadMailUI$a */
    public class C85382a implements C1256g<Bundle> {
        public C85382a() {
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            ((C119157j) C119157j.f356862d).mo183895z(new C85399i(this, (Bundle) obj));
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ReadMailUI$b */
    public class C85383b implements C1256g<IPCInteger> {
        public C85383b() {
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            IPCInteger iPCInteger = (IPCInteger) obj;
            if (!ReadMailUI.this.isFinishing() && !ReadMailUI.this.isDestroyed()) {
                ReadMailUI.this.f248815K = iPCInteger.f10313d;
                MMHandlerThread.postToMainThread(new C85400j(this));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ReadMailUI$c */
    public class C85384c implements C1256g<Bundle> {
        public C85384c() {
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            ((C119157j) C119157j.f356862d).mo183895z(new C85401k(this, (Bundle) obj));
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ReadMailUI$d */
    public class C85385d implements MTimerHandler.CallBack {
        public C85385d() {
        }

        public boolean onTimerExpired() {
            ReadMailUI readMailUI = ReadMailUI.this;
            String str = ReadMailUI.f248800M;
            readMailUI.getClass();
            C80907o.m98781d(MMApplicationContext.getPackageName(), new IPCLong(readMailUI.f248808D), C16158d.class, new C86285n(readMailUI));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ReadMailUI$f */
    public class C85386f implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.qqmail.ui.ReadMailUI$f$a */
        public class C85387a implements Runnable {
            public C85387a() {
            }

            public void run() {
                ReadMailUI.this.f248824n.mo96850a();
                ReadMailUI.this.f248823j.mo96850a();
            }
        }

        public C85386f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/ReadMailUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (ReadMailUI.this.f248826p.getVisibility() == 8) {
                ReadMailUI.this.f248825o.setText(C0966R.string.hrz);
                View view2 = ReadMailUI.this.f248826p;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ReadMailUI.this.f248826p.post(new C85387a());
                ReadMailUI.this.f248829s.setVisibility(0);
            } else {
                ReadMailUI.this.f248825o.setText(C0966R.string.f361162hs0);
                View view4 = ReadMailUI.this.f248826p;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view5 = view4;
                C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ReadMailUI.this.f248829s.setVisibility(8);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ReadMailUI$g */
    public class C85388g implements View.OnClickListener {
        public C85388g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/ReadMailUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ReadMailUI.this.f248821h.setVisibility(8);
            ReadMailUI.m105396J7(ReadMailUI.this);
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ReadMailUI$h */
    public class C85389h implements View.OnClickListener {
        public C85389h() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/ReadMailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ReadMailUI readMailUI = ReadMailUI.this;
            String str = ReadMailUI.f248800M;
            readMailUI.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("mail_id", readMailUI.f248818e.f233213a);
            bundle.putInt("mail_status", 2);
            C80907o.m98781d(MMApplicationContext.getPackageName(), bundle, C16163l.class, new C86280j(readMailUI));
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ReadMailUI$i */
    public class C85390i implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.qqmail.ui.ReadMailUI$i$a */
        public class C85391a implements C76879j.C11180n {
            public C85391a() {
            }

            /* renamed from: j */
            public void mo782j(int i) {
                int i2 = i;
                if (i2 == 3) {
                    ReadMailUI readMailUI = ReadMailUI.this;
                    String str = ReadMailUI.f248800M;
                    readMailUI.getClass();
                    C80907o.m98781d(MMApplicationContext.getPackageName(), new IPCLong(readMailUI.f248817d), C16156a.class, (C1256g) null);
                    readMailUI.finish();
                    return;
                }
                Intent intent = new Intent();
                intent.setClass(ReadMailUI.this, ComposeUI.class);
                intent.putExtra("mailid", ReadMailUI.this.f248818e.f233213a);
                intent.putExtra("subject", ReadMailUI.this.f248818e.f233215c);
                String[] mailAddrStringArray = ReadMailUI.this.f248822i.getMailAddrStringArray();
                String[] mailAddrStringArray2 = ReadMailUI.this.f248824n.getMailAddrStringArray();
                String[] mailAddrStringArray3 = ReadMailUI.this.f248823j.getMailAddrStringArray();
                if (i2 == 0) {
                    intent.putExtra("composeType", 2);
                    intent.putExtra("toList", mailAddrStringArray);
                } else if (i2 == 1) {
                    intent.putExtra("composeType", 2);
                    String[] strArr = new String[(mailAddrStringArray.length + mailAddrStringArray2.length)];
                    int length = mailAddrStringArray.length;
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < length) {
                        strArr[i4] = mailAddrStringArray[i3];
                        i3++;
                        i4++;
                    }
                    int length2 = mailAddrStringArray2.length;
                    int i5 = 0;
                    while (i5 < length2) {
                        strArr[i4] = mailAddrStringArray2[i5];
                        i5++;
                        i4++;
                    }
                    intent.putExtra("toList", strArr);
                    intent.putExtra("ccList", mailAddrStringArray3);
                } else if (i2 == 2) {
                    intent.putExtra("mail_content", ReadMailUI.this.f248818e.f233221i);
                    intent.putExtra("mail_attach", ReadMailUI.this.f248818e.f233219g);
                    intent.putExtra("mail_mode", 21);
                    intent.putExtra("composeType", 3);
                } else {
                    return;
                }
                ReadMailUI readMailUI2 = ReadMailUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                ReadMailUI readMailUI3 = readMailUI2;
                C117292a.m165358d(readMailUI3, aVar.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$7$1", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                readMailUI2.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(readMailUI3, "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$7$1", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }

        public C85390i() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ReadMailUI readMailUI = ReadMailUI.this;
            if (readMailUI.f248818e == null) {
                Log.m105928w("MicroMsg.ReadMailUI", "mailObject is null!");
                return true;
            }
            String[] stringArray = readMailUI.getResources().getStringArray(C0966R.array.f2583r);
            ReadMailUI readMailUI2 = ReadMailUI.this;
            C76879j.m92737h(readMailUI2, (String) null, stringArray, readMailUI2.getResources().getString(C0966R.string.hs4), false, new C85391a());
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ReadMailUI$j */
    public class C85392j implements MenuItem.OnMenuItemClickListener {
        public C85392j() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ReadMailUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ReadMailUI$k */
    public class C85393k implements C44243c0 {

        /* renamed from: com.tencent.mm.plugin.qqmail.ui.ReadMailUI$k$a */
        public class C85394a implements Runnable {
            public C85394a() {
            }

            public void run() {
                ReadMailUI.this.f248819f.getSettings().setLoadsImagesAutomatically(true);
                ReadMailUI.this.f248819f.getSettings().setSupportZoom(true);
                ReadMailUI.this.f248819f.getSettings().setBuiltInZoomControls(true);
                ((C85585g0) ReadMailUI.this.f248819f).mo119049v();
                ((C85585g0) ReadMailUI.this.f248819f).mo119050x();
            }
        }

        /* renamed from: com.tencent.mm.plugin.qqmail.ui.ReadMailUI$k$b */
        public class C85395b implements Runnable {
            public C85395b() {
            }

            public void run() {
                Log.m105918d("MicroMsg.ReadMailUI", ReadMailUI.this.f248819f.getContentHeight() + "," + ReadMailUI.this.f248819f.getHeight() + "," + ReadMailUI.this.f248819f.getScale());
                if (Math.abs(((int) (((float) ReadMailUI.this.f248819f.getContentHeight()) * ReadMailUI.this.f248819f.getScale())) - ReadMailUI.this.f248819f.getHeight()) < 10) {
                    ((C85585g0) ReadMailUI.this.f248819f).mo119039P(true);
                }
            }
        }

        public C85393k() {
        }

        /* renamed from: a */
        public void mo63036a(MMWebView mMWebView, String str) {
        }

        /* renamed from: b */
        public boolean mo63037b(String str) {
            Log.m105919d("MicroMsg.ReadMailUI", "url:%s", str);
            if (str != null && str.startsWith("mailto:")) {
                String replace = str.trim().replace("mailto:", "");
                Intent intent = new Intent(ReadMailUI.this, ComposeUI.class);
                intent.putExtra("composeType", 4);
                intent.putExtra("toList", new String[]{replace + " " + replace});
                ReadMailUI readMailUI = ReadMailUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                ReadMailUI readMailUI2 = readMailUI;
                C117292a.m165358d(readMailUI2, aVar.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$9", "handleUrlLoading", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                readMailUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(readMailUI2, "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$9", "handleUrlLoading", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (str == null || !str.startsWith("tel:")) {
                if (str != null && !str.startsWith("data:")) {
                    if (((C85585g0) ReadMailUI.this.f248819f).mo119038H()) {
                        ((C85585g0) ReadMailUI.this.f248819f).mo119046i();
                        return true;
                    } else if (str.startsWith("http")) {
                        Intent intent2 = new Intent();
                        intent2.putExtra("rawUrl", str);
                        intent2.putExtra("geta8key_scene", 16);
                        C88144b.m109791i(ReadMailUI.this, "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
                    }
                }
                return false;
            } else {
                Intent intent3 = new Intent("android.intent.action.DIAL", Uri.parse(str));
                intent3.addFlags(268435456);
                ReadMailUI readMailUI3 = ReadMailUI.this;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent3);
                ReadMailUI readMailUI4 = readMailUI3;
                C117292a.m165358d(readMailUI4, aVar2.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$9", "handleUrlLoading", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                readMailUI3.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(readMailUI4, "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$9", "handleUrlLoading", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            return true;
        }

        /* renamed from: c */
        public void mo63038c(MMWebView mMWebView, String str) {
            mMWebView.evaluateJavascript("javascript:var meta = document.createElement(\"meta\");meta.name=\"viewport\";meta.id=\"viewport\";meta.content=\"initial-scale=1,user-scalable=yes,maximum-scale=3.0\";document.head.appendChild(meta);", (ValueCallback<String>) null);
            mMWebView.evaluateJavascript("javascript:" + ReadMailUI.f248800M, (ValueCallback<String>) null);
            mMWebView.evaluateJavascript("javascript:" + ReadMailUI.f248801N, (ValueCallback<String>) null);
            mMWebView.evaluateJavascript("javascript:" + ReadMailUI.f248802P, (ValueCallback<String>) null);
            new MMHandler(ReadMailUI.this.getMainLooper()).postDelayed(new C85394a(), 200);
            new MMHandler(ReadMailUI.this.getMainLooper()).postDelayed(new C85395b(), 400);
        }

        public boolean callback(int i, Bundle bundle) {
            return false;
        }

        /* renamed from: d */
        public boolean mo63040d(Bundle bundle) {
            return false;
        }
    }

    /* renamed from: H7 */
    public static void m105394H7(ReadMailUI readMailUI, int i, int i2) {
        readMailUI.getClass();
        Bundle bundle = new Bundle();
        bundle.putInt("kv_report_key", i);
        bundle.putInt("kv_report_value", i2);
        C80907o.m98781d(MMApplicationContext.getPackageName(), bundle, C16162i.class, (C1256g) null);
    }

    /* renamed from: I7 */
    public static void m105395I7(ReadMailUI readMailUI) {
        readMailUI.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("download_url", readMailUI.f248806B);
        bundle.putString("download_md5", readMailUI.f248807C);
        C80907o.m98781d(MMApplicationContext.getPackageName(), bundle, C91682b.class, new C86281k(readMailUI));
    }

    /* renamed from: J7 */
    public static void m105396J7(ReadMailUI readMailUI) {
        readMailUI.f248820g.setVisibility(0);
        C80907o.m98781d(MMApplicationContext.getPackageName(), new IPCString(readMailUI.f248818e.f233213a), C53777h.class, new C86288s(readMailUI));
    }

    /* renamed from: K7 */
    public final void mo118702K7() {
        C80907o.m98781d(MMApplicationContext.getPackageName(), null, C16159e.class, new C85382a());
        C80907o.m98781d(MMApplicationContext.getPackageName(), null, C16161g.class, new C85383b());
        if (C72688j0.m85020f(this, "com.tencent.androidqqmail")) {
            this.f248812H = 3;
            mo118703L7();
            return;
        }
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("QQMAIL", 4);
        this.f248813I = sharedPreferences;
        if (sharedPreferences != null) {
            this.f248808D = sharedPreferences.getLong("qqmail_downloadid", -1);
            C80907o.m98781d(MMApplicationContext.getPackageName(), new IPCLong(this.f248808D), C16158d.class, new C85384c());
        }
    }

    /* renamed from: L7 */
    public final void mo118703L7() {
        int i = this.f248812H;
        if (i == 0) {
            this.f248834x.setText(C0966R.string.hs8);
        } else if (i == 1) {
            this.f248834x.setText(C0966R.string.hs6);
        } else if (i == 2) {
            this.f248834x.setText(C0966R.string.hs7);
        } else if (i == 3) {
            int i2 = this.f248815K;
            String num = i2 > 99 ? "99+" : i2 > 0 ? Integer.toString(i2) : "";
            if (Util.isNullOrNil(num)) {
                this.f248834x.setText(C0966R.string.hs9);
            } else {
                this.f248834x.setText(String.format(C76577a.m92166q(this, C0966R.string.hs_), new Object[]{num}));
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bpu;
    }

    public void initView() {
        this.f248822i = (MailAddrsViewControl) findViewById(C0966R.C0970id.i__);
        this.f248824n = (MailAddrsViewControl) findViewById(C0966R.C0970id.i_a);
        this.f248823j = (MailAddrsViewControl) findViewById(C0966R.C0970id.i_9);
        this.f248825o = (TextView) findViewById(C0966R.C0970id.ie6);
        this.f248826p = findViewById(C0966R.C0970id.ie8);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.ie5);
        this.f248827q = (TextView) findViewById(C0966R.C0970id.iea);
        this.f248828r = (TextView) findViewById(C0966R.C0970id.ieb);
        this.f248829s = (TextView) findViewById(C0966R.C0970id.ie_);
        this.f248830t = (LinearLayout) findViewById(C0966R.C0970id.ie4);
        this.f248831u = (MailAttachListLinearLayout) findViewById(C0966R.C0970id.f359013ie3);
        this.f248820g = (ProgressBar) findViewById(C0966R.C0970id.ie7);
        this.f248821h = (ImageView) findViewById(C0966R.C0970id.ie9);
        TextView textView = (TextView) findViewById(C0966R.C0970id.iec);
        setMMTitle("");
        setActionbarColor(getResources().getColor(C0966R.color.f2975b6));
        MMWebView a = C30612f0.C30613a.f82426a.mo57506a(this);
        this.f248819f = a;
        a.setBackgroundColor(getResources().getColor(C0966R.color.f2975b6));
        ((FrameLayout) findViewById(C0966R.C0970id.idw)).addView(this.f248819f);
        this.f248835y = findViewById(C0966R.C0970id.gkk);
        this.f248832v = findViewById(C0966R.C0970id.gke);
        this.f248834x = (TextView) findViewById(C0966R.C0970id.gkh);
        this.f248833w = (TextView) findViewById(C0966R.C0970id.gkg);
        this.f248832v.setOnClickListener(new C42799e());
        this.f248825o.setOnClickListener(new C85386f());
        this.f248821h.setOnClickListener(new C85388g());
        this.f248829s.setOnClickListener(new C85389h());
        addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C85390i());
        setBackBtn(new C85392j());
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        f248803Q = ((float) displayMetrics.widthPixels) / displayMetrics.scaledDensity;
        f248804R = displayMetrics.heightPixels;
        this.f248819f.getSettings().setDefaultTextEncodingName("utf-8");
        this.f248819f.getSettings().setSupportZoom(false);
        this.f248819f.getSettings().setBuiltInZoomControls(false);
        this.f248819f.getSettings().setDisplayZoomControls(false);
        this.f248819f.getSettings().setLoadsImagesAutomatically(false);
        this.f248819f.getSettings().setUseWideViewPort(true);
        this.f248819f.mo70469W();
        ((C85585g0) this.f248819f).setEmbeddedTitleBarCompat(this.f248835y);
        ((C85585g0) this.f248819f).setEmbeddedBottomBar(this.f248832v);
        Intent intent = getContext().getIntent();
        byte[] bArr = new byte[112];
        bArr[25] = 1;
        bArr[16] = 1;
        bArr[57] = 1;
        bArr[63] = 1;
        bArr[61] = 1;
        bArr[70] = 1;
        bArr[68] = 1;
        bArr[82] = 1;
        bArr[111] = 1;
        intent.putExtra("hardcode_jspermission", new JsapiPermissionWrapper(bArr));
        getContext().setIntent(intent);
        MMWebView mMWebView = this.f248819f;
        mMWebView.setWebViewClient(C44234a0.C30609a.f82424a.mo68941nM(mMWebView, true, new C85393k()));
        if (f248801N.equals("")) {
            try {
                f248801N += Util.convertStreamToString(getAssets().open("mail/lib.js"));
                f248802P += Util.convertStreamToString(getAssets().open("mail/readmail.js"));
                f248800M += "mail_css.innerHTML='" + Util.convertStreamToString(getAssets().open("mail/qmail_webview.css")) + "'; document.head.appendChild(mail_css);";
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.ReadMailUI", e, "", new Object[0]);
                Log.m105920e("MicroMsg.ReadMailUI", "evaluateJavascript error " + e.getMessage());
            }
        }
        registerForContextMenu(this.f248819f);
        new C45082x0(this).mo70438d(this.f248819f, this, (C11184p0) null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        long longExtra = getIntent().getLongExtra("msgid", -1);
        this.f248817d = longExtra;
        Log.m105925i("MicroMsg.ReadMailUI", "onCreate msgId %d", Long.valueOf(longExtra));
        initView();
        mo118702K7();
        C80907o.m98781d(MMApplicationContext.getPackageName(), new IPCLong(this.f248817d), C16160f.class, new C86286p(this));
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        if (view instanceof WebView) {
            WebView.HitTestResult hitTestResult = ((WebView) view).getHitTestResult();
            if (hitTestResult.getType() == 5 || hitTestResult.getType() == 8) {
                return;
            }
        }
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f248819f.setVisibility(8);
        this.f248819f.destroy();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        if (this.f248836z) {
            mo118702K7();
        }
    }

    public void onStop() {
        super.onStop();
        this.f248819f.stopLoading();
    }
}
