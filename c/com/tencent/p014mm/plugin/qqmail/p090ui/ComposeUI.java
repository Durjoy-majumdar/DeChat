package com.tencent.p014mm.plugin.qqmail.p090ui;

import a70.C112760b;
import ag2.C27896j;
import ag2.C27899n;
import ag2.C27900o;
import ag2.C39595q0;
import ag2.C39596r0;
import ag2.C39598t0;
import ag2.C67037k;
import ag2.C67038p;
import ag2.C67039p0;
import ag2.C67042s;
import ag2.C79540c0;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import bh3.C113177k;
import cg2.C39949e;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C7013o;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.qqmail.p090ui.C70366d;
import com.tencent.p014mm.plugin.qqmail.p090ui.MailAddrsViewControl;
import com.tencent.p014mm.pluginsdk.p133ui.tools.FileExplorerUI;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import e00.C45519s0;
import f12.C7970a;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k20.C9556a;
import nj3.C76879j;
import nj3.C76901s0;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import p140cw.C7138g;
import p447aw.C103918d;
import p910lj.C76701a;
import qo3.C89779i0;
import vo3.C90852c;
import zf2.C16157c;

@C90852c(0)
/* renamed from: com.tencent.mm.plugin.qqmail.ui.ComposeUI */
public class ComposeUI extends MMActivity implements C11385n {

    /* renamed from: Q0 */
    public static List<C67038p> f203091Q0;

    /* renamed from: A */
    public C89779i0 f203092A;

    /* renamed from: B */
    public int f203093B = 1;

    /* renamed from: C */
    public String f203094C;

    /* renamed from: D */
    public String f203095D;

    /* renamed from: E */
    public C76901s0 f203096E;

    /* renamed from: F */
    public boolean f203097F = true;

    /* renamed from: G */
    public boolean f203098G = true;

    /* renamed from: H */
    public String f203099H = "(function() { \nvar imgList = document.getElementsByTagName('img');var result = ''; \nfor (var i = 0; i < imgList.length; i++) {var img = imgList[i];var info = img.id + '@@' + img.src;result += info + '&&'}return result;})()";

    /* renamed from: I */
    public String f203100I = "document.getElementById('history').innerHTML";

    /* renamed from: J */
    public String f203101J = "<div id=\"htmlContent\" contenteditable=\"true\" >";

    /* renamed from: K */
    public String f203102K = "</div>";

    /* renamed from: L */
    public String f203103L = null;

    /* renamed from: M */
    public int f203104M = 20;

    /* renamed from: N */
    public Map<String, String> f203105N = new HashMap();

    /* renamed from: P */
    public String f203106P;

    /* renamed from: Q */
    public List<Bundle> f203107Q;

    /* renamed from: R */
    public List<String> f203108R;

    /* renamed from: S */
    public String f203109S;

    /* renamed from: T */
    public String f203110T;

    /* renamed from: U */
    public String f203111U;

    /* renamed from: V */
    public boolean f203112V;

    /* renamed from: W */
    public MTimerHandler f203113W;

    /* renamed from: X */
    public MTimerHandler f203114X;

    /* renamed from: Y */
    public C67042s.C67044b f203115Y;

    /* renamed from: Z */
    public View.OnClickListener f203116Z;

    /* renamed from: d */
    public ScrollView f203117d;

    /* renamed from: e */
    public MailAddrsViewControl f203118e;

    /* renamed from: f */
    public ImageView f203119f;

    /* renamed from: g */
    public LinearLayout f203120g;

    /* renamed from: h */
    public LinearLayout f203121h;

    /* renamed from: i */
    public MailAddrsViewControl f203122i;

    /* renamed from: j */
    public ImageView f203123j;

    /* renamed from: n */
    public LinearLayout f203124n;

    /* renamed from: o */
    public MailAddrsViewControl f203125o;

    /* renamed from: p */
    public ImageView f203126p;

    /* renamed from: p0 */
    public View.OnClickListener f203127p0;

    /* renamed from: q */
    public EditText f203128q;

    /* renamed from: r */
    public LinearLayout f203129r;

    /* renamed from: s */
    public TextView f203130s;

    /* renamed from: t */
    public ImageView f203131t;

    /* renamed from: u */
    public LinearLayout f203132u;

    /* renamed from: v */
    public EditText f203133v;

    /* renamed from: w */
    public MMWebView f203134w;

    /* renamed from: x */
    public C67042s f203135x;

    /* renamed from: x0 */
    public MenuItem.OnMenuItemClickListener f203136x0;

    /* renamed from: y */
    public C70366d f203137y;

    /* renamed from: y0 */
    public View.OnClickListener f203138y0;

    /* renamed from: z */
    public C85397h f203139z = new C85397h(this);

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ComposeUI$d */
    public class C5027d implements View.OnTouchListener {
        public C5027d(ComposeUI composeUI) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/ComposeUI$13", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            int action = motionEvent.getAction();
            if ((action == 0 || action == 1) && !view.hasFocus()) {
                view.requestFocus();
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/qqmail/ui/ComposeUI$13", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ComposeUI$g */
    public class C5028g implements DialogInterface.OnClickListener {
        public C5028g() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(ComposeUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ComposeUI$t */
    public class C42785t extends WebChromeClient {
        public C42785t(C70325k kVar) {
        }

        @Deprecated
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Log.m105925i("MicroMsg.Mail.ComposeUI", "console, consoleMessage: %s", consoleMessage);
            String Oq0 = ((C45519s0) C86312j.m106911c(C45519s0.class)).Oq0(consoleMessage != null ? consoleMessage.message() : null);
            if (Oq0.startsWith(ComposeUI.this.f203111U)) {
                ComposeUI.this.hideVKB();
                try {
                    String[] split = URLDecoder.decode(Oq0.substring(ComposeUI.this.f203111U.length()), "utf-8").split("@@");
                    String[] split2 = split[0].split(XVFSFile.PATH_SEPARATOR);
                    String str = split2[0];
                    Log.m105925i("MicroMsg.Mail.ComposeUI", "img onclick, src: %s, msgLocalId: %s, msgSvrId: %s", split[1], str, split2[1]);
                    C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00((long) Integer.valueOf(str).intValue());
                    Intent intent = new Intent(ComposeUI.this, MailImageDownloadUI.class);
                    intent.putExtra("img_msg_id", b002.getMsgId());
                    intent.putExtra("img_server_id", b002.mo108774y2());
                    intent.putExtra("img_download_compress_type", 0);
                    intent.putExtra("img_download_username", b002.mo108768t());
                    ComposeUI composeUI = ComposeUI.this;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(composeUI, aVar.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/ComposeUI$ContentChromeClient", "onConsoleMessage", "(Landroid/webkit/ConsoleMessage;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    composeUI.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(composeUI, "com/tencent/mm/plugin/qqmail/ui/ComposeUI$ContentChromeClient", "onConsoleMessage", "(Landroid/webkit/ConsoleMessage;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return true;
                } catch (Exception e) {
                    Log.m105929w("MicroMsg.Mail.ComposeUI", "consoleMessage IMG_ONCLICK, ex = %s", e.getMessage());
                }
            } else if (Oq0.startsWith(ComposeUI.this.f203110T)) {
                try {
                    ComposeUI composeUI2 = ComposeUI.this;
                    composeUI2.f203106P = URLDecoder.decode(Oq0.substring(composeUI2.f203110T.length()), "utf-8");
                } catch (Exception e2) {
                    Log.m105929w("MicroMsg.Mail.ComposeUI", "consoleMessage GET_MAIL_CONTENT, ex = %s", e2.getMessage());
                }
                ComposeUI.this.getClass();
                return true;
            } else {
                if (Oq0.startsWith(ComposeUI.this.f203109S)) {
                    ((HashMap) ComposeUI.this.f203105N).clear();
                    try {
                        String[] split3 = URLDecoder.decode(Oq0.substring(ComposeUI.this.f203109S.length()), "utf-8").split("&&");
                        for (String split4 : split3) {
                            String[] split5 = split4.split("@@");
                            if (split5.length >= 2) {
                                String str2 = split5[0];
                                String str3 = split5[1];
                                if (str3.startsWith("file://")) {
                                    str3 = str3.replaceFirst("file://", "");
                                }
                                Log.m105925i("MicroMsg.Mail.ComposeUI", "put msgImgInfoMap, fileName: %s, path: %s", str2, str3);
                                ((HashMap) ComposeUI.this.f203105N).put(str2, str3);
                            }
                        }
                        ComposeUI.this.getClass();
                        return true;
                    } catch (Exception e3) {
                        Log.m105929w("MicroMsg.Mail.ComposeUI", "consoleMessage GET_IMG_INFO, ex = %s", e3.getMessage());
                        return true;
                    }
                }
                return super.onConsoleMessage(consoleMessage);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ComposeUI$u */
    public class C42786u extends WebViewClient {

        /* renamed from: a */
        public boolean f115834a = false;

        public C42786u(C70325k kVar) {
        }

        public void onPageFinished(WebView webView, String str) {
            Class cls = C45519s0.class;
            Log.m105919d("MicroMsg.Mail.ComposeUI", "onPageFinished, url = %s, firstTimeLoaded = %b", str, Boolean.valueOf(this.f115834a));
            if (!this.f115834a) {
                this.f115834a = true;
                ComposeUI composeUI = ComposeUI.this;
                ((C45519s0) C86312j.m106911c(cls)).l40(composeUI.f203134w, composeUI.f203110T, composeUI.f203100I);
                if (ComposeUI.this.getIntent().getBooleanExtra("mail_edit_mode", false)) {
                    ComposeUI composeUI2 = ComposeUI.this;
                    ((C45519s0) C86312j.m106911c(cls)).l40(composeUI2.f203134w, composeUI2.f203109S, composeUI2.f203099H);
                }
            }
            super.onPageFinished(webView, str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (!ComposeUI.this.f203112V) {
                ((C45519s0) C86312j.m106911c(C45519s0.class)).mo70771uT(ComposeUI.this.f203134w);
                ComposeUI.this.f203112V = true;
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Log.m105919d("MicroMsg.Mail.ComposeUI", "shouldOverrideUrlLoading, url = %s", str);
            if (str.startsWith(ComposeUI.this.f203111U)) {
                ComposeUI.this.hideVKB();
                try {
                    String[] split = URLDecoder.decode(str.substring(ComposeUI.this.f203111U.length()), "utf-8").split("@@");
                    String[] split2 = split[0].split(XVFSFile.PATH_SEPARATOR);
                    String str2 = split2[0];
                    Log.m105925i("MicroMsg.Mail.ComposeUI", "img onclick, src: %s, msgLocalId: %s, msgSvrId: %s", split[1], str2, split2[1]);
                    C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00((long) Integer.valueOf(str2).intValue());
                    Intent intent = new Intent(ComposeUI.this, MailImageDownloadUI.class);
                    intent.putExtra("img_msg_id", b002.getMsgId());
                    intent.putExtra("img_server_id", b002.mo108774y2());
                    intent.putExtra("img_download_compress_type", 0);
                    intent.putExtra("img_download_username", b002.mo108768t());
                    ComposeUI composeUI = ComposeUI.this;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(composeUI, aVar.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/ComposeUI$ContentClient", "shouldOverrideUrlLoading", "(Lcom/tencent/xweb/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    composeUI.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(composeUI, "com/tencent/mm/plugin/qqmail/ui/ComposeUI$ContentClient", "shouldOverrideUrlLoading", "(Lcom/tencent/xweb/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return true;
                } catch (Exception e) {
                    Log.m105929w("MicroMsg.Mail.ComposeUI", "shouldOverrideUrlLoading IMG_ONCLICK, ex = %s", e.getMessage());
                }
            } else if (str.startsWith(ComposeUI.this.f203110T)) {
                try {
                    ComposeUI composeUI2 = ComposeUI.this;
                    composeUI2.f203106P = URLDecoder.decode(str.substring(composeUI2.f203110T.length()), "utf-8");
                } catch (Exception e2) {
                    Log.m105929w("MicroMsg.Mail.ComposeUI", "shouldOverrideUrlLoading GET_MAIL_CONTENT, ex = %s", e2.getMessage());
                }
                ComposeUI.this.getClass();
                return true;
            } else {
                if (str.startsWith(ComposeUI.this.f203109S)) {
                    ((HashMap) ComposeUI.this.f203105N).clear();
                    try {
                        String[] split3 = URLDecoder.decode(str.substring(ComposeUI.this.f203109S.length()), "utf-8").split("&&");
                        for (String split4 : split3) {
                            String[] split5 = split4.split("@@");
                            if (split5.length >= 2) {
                                String str3 = split5[0];
                                String str4 = split5[1];
                                if (str4.startsWith("file://")) {
                                    str4 = str4.replaceFirst("file://", "");
                                }
                                Log.m105925i("MicroMsg.Mail.ComposeUI", "put msgImgInfoMap, fileName: %s, path: %s", str3, str4);
                                ((HashMap) ComposeUI.this.f203105N).put(str3, str4);
                            }
                        }
                        ComposeUI.this.getClass();
                        return true;
                    } catch (Exception e3) {
                        Log.m105929w("MicroMsg.Mail.ComposeUI", "shouldOverrideUrlLoading GET_IMG_INFO, ex = %s", e3.getMessage());
                    }
                }
                return true;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ComposeUI$a */
    public class C70311a implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ ImageView f203140d;

        public C70311a(ImageView imageView) {
            this.f203140d = imageView;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ComposeUI composeUI = ComposeUI.this;
            int i4 = 4;
            if (composeUI.f203098G) {
                ImageView imageView = this.f203140d;
                if (composeUI.f203128q.getText().length() > 0) {
                    i4 = 0;
                }
                imageView.setVisibility(i4);
                return;
            }
            this.f203140d.setVisibility(4);
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ComposeUI$b */
    public class C70312b implements View.OnClickListener {
        public C70312b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/ComposeUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ComposeUI.this.f203128q.getText().clear();
            ComposeUI.this.f203128q.requestFocus();
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/ComposeUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ComposeUI$c */
    public class C70313c implements MenuItem.OnMenuItemClickListener {
        public C70313c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ComposeUI.this.f203138y0.onClick((View) null);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ComposeUI$e */
    public class C70314e implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.qqmail.ui.ComposeUI$e$a */
        public class C70315a implements Runnable {
            public C70315a() {
            }

            public void run() {
                ComposeUI.this.f203121h.requestFocus();
                ComposeUI.this.f203122i.mo96850a();
                ComposeUI.this.f203125o.mo96850a();
            }
        }

        public C70314e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/ComposeUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ComposeUI.this.f203120g.setVisibility(8);
            ComposeUI.this.f203121h.setVisibility(0);
            ComposeUI.this.f203124n.setVisibility(0);
            ComposeUI.this.f203120g.post(new C70315a());
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/ComposeUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ComposeUI$f */
    public class C70316f implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.qqmail.ui.ComposeUI$f$a */
        public class C70317a implements C76879j.C11180n {

            /* renamed from: com.tencent.mm.plugin.qqmail.ui.ComposeUI$f$a$a */
            public class C70318a implements C113177k.C113181e {

                /* renamed from: a */
                public final /* synthetic */ Intent f203148a;

                public C70318a(Intent intent) {
                    this.f203148a = intent;
                }

                public void onOp(Boolean bool) {
                    if (bool.booleanValue()) {
                        ComposeUI.this.startActivityForResult(this.f203148a, 5);
                    }
                }
            }

            public C70317a() {
            }

            /* renamed from: j */
            public void mo782j(int i) {
                if (i == 0) {
                    boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(ComposeUI.this.getContext(), "android.permission.CAMERA", 16, "", "");
                    Log.m105925i("MicroMsg.Mail.ComposeUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", Boolean.valueOf(z1), Util.getStack(), ComposeUI.this.getContext());
                    if (z1) {
                        ComposeUI composeUI = ComposeUI.this;
                        List<C67038p> list = ComposeUI.f203091Q0;
                        composeUI.mo96817P7();
                    }
                } else if (i == 1) {
                    ((C7138g) C86312j.m106911c(C7138g.class)).mo8329zT(ComposeUI.this, 4, (Intent) null);
                } else if (i == 2) {
                    Intent intent = new Intent(ComposeUI.this, FileExplorerUI.class);
                    if (!((C113177k) C86312j.m106911c(C113177k.class)).mo165704UG(C113177k.C113179b.STORAGE, new C70318a(intent))) {
                        ComposeUI.this.startActivityForResult(intent, 5);
                    }
                }
            }
        }

        public C70316f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/ComposeUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ComposeUI composeUI = ComposeUI.this;
            C76879j.m92736g(composeUI, (String) null, new String[]{composeUI.getString(C0966R.string.hkm), ComposeUI.this.getString(C0966R.string.hkj), ComposeUI.this.getString(C0966R.string.hkk)}, (String) null, new C70317a());
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/ComposeUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ComposeUI$h */
    public class C70319h implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.qqmail.ui.ComposeUI$h$a */
        public class C70320a implements DialogInterface.OnClickListener {
            public C70320a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                ComposeUI.this.setResult(0);
                ComposeUI.this.finish();
            }
        }

        public C70319h() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (!ComposeUI.m82864H7(ComposeUI.this, false) || ComposeUI.this.f203104M != 20) {
                ComposeUI composeUI = ComposeUI.this;
                if (composeUI.f203104M != 21) {
                    composeUI.setResult(0);
                    ComposeUI.this.finish();
                    return true;
                }
            }
            C76879j.m92707A(ComposeUI.this.getContext(), ComposeUI.this.getString(C0966R.string.hkt), "", ComposeUI.this.getString(C0966R.string.hkv), ComposeUI.this.getString(C0966R.string.f7926wf), new C70320a(), (DialogInterface.OnClickListener) null);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ComposeUI$i */
    public class C70321i implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.qqmail.ui.ComposeUI$i$a */
        public class C70322a implements DialogInterface.OnCancelListener {
            public C70322a() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                ComposeUI.this.f203137y.mo96894a();
                ComposeUI.this.f203137y.f203257n = null;
            }
        }

        /* renamed from: com.tencent.mm.plugin.qqmail.ui.ComposeUI$i$b */
        public class C70323b implements C70366d.C70374g {
            public C70323b() {
            }
        }

        public C70321i() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x00af  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00b3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r19) {
            /*
                r18 = this;
                r6 = r18
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r19
                r0.add(r1)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/qqmail/ui/ComposeUI$18"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                r4 = r18
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                com.tencent.mm.plugin.qqmail.ui.ComposeUI r0 = com.tencent.p014mm.plugin.qqmail.p090ui.ComposeUI.this
                r0.hideVKB()
                com.tencent.mm.plugin.qqmail.ui.ComposeUI r0 = com.tencent.p014mm.plugin.qqmail.p090ui.ComposeUI.this
                android.widget.EditText r0 = r0.f203128q
                android.text.Editable r0 = r0.getText()
                r0.toString()
                com.tencent.mm.plugin.qqmail.ui.ComposeUI r0 = com.tencent.p014mm.plugin.qqmail.p090ui.ComposeUI.this
                r0.mo96813L7()
                com.tencent.mm.plugin.qqmail.ui.ComposeUI r0 = com.tencent.p014mm.plugin.qqmail.p090ui.ComposeUI.this
                com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl r1 = r0.f203118e
                r2 = 0
                boolean r1 = r1.mo96856g(r2)
                r3 = 1
                if (r1 != 0) goto L_0x004e
                r1 = 2131834068(0x7f1134d4, float:1.9301236E38)
                android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (int) r1, (int) r3)
                r0.show()
            L_0x004c:
                r0 = 0
                goto L_0x00a4
            L_0x004e:
                com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl r1 = r0.f203122i
                boolean r1 = r1.mo96856g(r2)
                if (r1 != 0) goto L_0x0061
                r1 = 2131834059(0x7f1134cb, float:1.9301218E38)
                android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (int) r1, (int) r3)
                r0.show()
                goto L_0x004c
            L_0x0061:
                com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl r1 = r0.f203125o
                boolean r1 = r1.mo96856g(r2)
                if (r1 != 0) goto L_0x0074
                r1 = 2131834057(0x7f1134c9, float:1.9301214E38)
                android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (int) r1, (int) r3)
                r0.show()
                goto L_0x004c
            L_0x0074:
                com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl r1 = r0.f203118e
                java.util.LinkedList r1 = r1.getMailAddrs()
                int r1 = r1.size()
                com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl r4 = r0.f203122i
                java.util.LinkedList r4 = r4.getMailAddrs()
                int r4 = r4.size()
                int r1 = r1 + r4
                com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl r4 = r0.f203125o
                java.util.LinkedList r4 = r4.getMailAddrs()
                int r4 = r4.size()
                int r1 = r1 + r4
                r4 = 20
                if (r1 <= r4) goto L_0x00a3
                r1 = 2131834075(0x7f1134db, float:1.930125E38)
                android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (int) r1, (int) r3)
                r0.show()
                goto L_0x004c
            L_0x00a3:
                r0 = 1
            L_0x00a4:
                java.lang.String r1 = "(Landroid/view/View;)V"
                java.lang.String r4 = "onClick"
                java.lang.String r5 = "android/view/View$OnClickListener"
                java.lang.String r7 = "com/tencent/mm/plugin/qqmail/ui/ComposeUI$18"
                if (r0 != 0) goto L_0x00b3
                j20.C117292a.m165361g(r6, r7, r5, r4, r1)
                return
            L_0x00b3:
                com.tencent.mm.plugin.qqmail.ui.ComposeUI r0 = com.tencent.p014mm.plugin.qqmail.p090ui.ComposeUI.this
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f203105N
                java.util.HashMap r0 = (java.util.HashMap) r0
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L_0x00c1:
                boolean r8 = r0.hasNext()
                if (r8 == 0) goto L_0x0134
                java.lang.Object r8 = r0.next()
                java.util.Map$Entry r8 = (java.util.Map.Entry) r8
                com.tencent.mm.plugin.qqmail.ui.ComposeUI r9 = com.tencent.p014mm.plugin.qqmail.p090ui.ComposeUI.this
                com.tencent.mm.plugin.qqmail.ui.d r9 = r9.f203137y
                java.lang.Object r8 = r8.getValue()
                java.lang.String r8 = (java.lang.String) r8
                r9.getClass()
                java.lang.Object[] r10 = new java.lang.Object[r3]
                r10[r2] = r8
                java.lang.String r11 = "MicroMsg.Mail.FileUploadHelper"
                java.lang.String r12 = "uploadContentImage path=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r12, r10)
                if (r8 == 0) goto L_0x00c1
                int r10 = r8.length()
                if (r10 == 0) goto L_0x00c1
                java.util.Map<java.lang.String, ag2.p0> r10 = r9.f203254h
                java.util.HashMap r10 = (java.util.HashMap) r10
                boolean r10 = r10.containsKey(r8)
                if (r10 == 0) goto L_0x00f9
                goto L_0x00c1
            L_0x00f9:
                com.tencent.mm.vfs.m1 r10 = new com.tencent.mm.vfs.m1
                r10.<init>((java.lang.String) r8)
                boolean r11 = r10.mo119967g()
                if (r11 == 0) goto L_0x00c1
                boolean r11 = r10.mo119978p()
                if (r11 != 0) goto L_0x010b
                goto L_0x00c1
            L_0x010b:
                ag2.p0 r11 = new ag2.p0
                r11.<init>()
                r11.f192579d = r8
                java.lang.String r12 = r10.getName()
                r11.f192580e = r12
                long r12 = r10.mo119980r()
                r11.f192581f = r12
                r11.f192582g = r2
                java.util.Map<java.lang.String, ag2.p0> r10 = r9.f203254h
                java.util.HashMap r10 = (java.util.HashMap) r10
                r10.put(r8, r11)
                int r8 = r11.f192582g
                if (r8 != 0) goto L_0x00c1
                java.lang.String r8 = r11.f192579d
                long r8 = r9.mo96896c(r8)
                r11.f192583h = r8
                goto L_0x00c1
            L_0x0134:
                com.tencent.mm.plugin.qqmail.ui.ComposeUI r0 = com.tencent.p014mm.plugin.qqmail.p090ui.ComposeUI.this
                r2 = 2131821704(0x7f110488, float:1.9276159E38)
                java.lang.String r13 = r0.getString(r2)
                com.tencent.mm.plugin.qqmail.ui.ComposeUI r2 = com.tencent.p014mm.plugin.qqmail.p090ui.ComposeUI.this
                r3 = 2131834045(0x7f1134bd, float:1.930119E38)
                java.lang.String r14 = r2.getString(r3)
                r15 = 1
                r16 = 1
                com.tencent.mm.plugin.qqmail.ui.ComposeUI$i$a r2 = new com.tencent.mm.plugin.qqmail.ui.ComposeUI$i$a
                r2.<init>()
                r12 = r0
                r17 = r2
                qo3.i0 r2 = nj3.C76879j.m92723Q(r12, r13, r14, r15, r16, r17)
                r0.f203092A = r2
                com.tencent.mm.plugin.qqmail.ui.ComposeUI r0 = com.tencent.p014mm.plugin.qqmail.p090ui.ComposeUI.this
                com.tencent.mm.plugin.qqmail.ui.d r0 = r0.f203137y
                boolean r0 = r0.mo96899f()
                if (r0 != 0) goto L_0x017b
                com.tencent.mm.plugin.qqmail.ui.ComposeUI r0 = com.tencent.p014mm.plugin.qqmail.p090ui.ComposeUI.this
                qo3.i0 r2 = r0.f203092A
                r3 = 2131834042(0x7f1134ba, float:1.9301183E38)
                java.lang.String r0 = r0.getString(r3)
                r2.setMessage(r0)
                com.tencent.mm.plugin.qqmail.ui.ComposeUI r0 = com.tencent.p014mm.plugin.qqmail.p090ui.ComposeUI.this
                com.tencent.mm.plugin.qqmail.ui.d r0 = r0.f203137y
                com.tencent.mm.plugin.qqmail.ui.ComposeUI$i$b r2 = new com.tencent.mm.plugin.qqmail.ui.ComposeUI$i$b
                r2.<init>()
                r0.f203257n = r2
                goto L_0x0183
            L_0x017b:
                com.tencent.mm.plugin.qqmail.ui.ComposeUI r0 = com.tencent.p014mm.plugin.qqmail.p090ui.ComposeUI.this
                java.lang.String r2 = com.tencent.p014mm.plugin.qqmail.p090ui.ComposeUI.m82865I7(r0)
                r0.f203095D = r2
            L_0x0183:
                j20.C117292a.m165361g(r6, r7, r5, r4, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.qqmail.p090ui.ComposeUI.C70321i.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ComposeUI$j */
    public class C70324j implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f203155d;

        /* renamed from: e */
        public final /* synthetic */ C86009m1 f203156e;

        /* renamed from: f */
        public final /* synthetic */ String f203157f;

        public C70324j(int i, C86009m1 m1Var, String str) {
            this.f203155d = i;
            this.f203156e = m1Var;
            this.f203157f = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (ComposeUI.this.f203137y.mo96897d() + this.f203155d > 52428800) {
                C76879j.m92742m(ComposeUI.this, C0966R.string.hlh, C0966R.string.a3h, (DialogInterface.OnClickListener) null);
                return;
            }
            if (ComposeUI.this.f203128q.getText().toString().trim().length() == 0) {
                String trim = this.f203156e.getName().trim();
                int lastIndexOf = trim.lastIndexOf(".");
                EditText editText = ComposeUI.this.f203128q;
                if (lastIndexOf <= 0) {
                    lastIndexOf = trim.length();
                }
                editText.setText(trim.substring(0, lastIndexOf));
            }
            Log.m105925i("MicroMsg.Mail.ComposeUI", "in upload file mode = %d", Integer.valueOf(ComposeUI.this.f203104M));
            C70366d dVar = ComposeUI.this.f203137y;
            String str = this.f203157f;
            dVar.getClass();
            if (str != null && str.length() != 0 && !((HashMap) dVar.f203254h).containsKey(str)) {
                C86009m1 m1Var = new C86009m1(str);
                if (m1Var.mo119967g() && m1Var.mo119978p()) {
                    C67039p0 p0Var = new C67039p0();
                    p0Var.f192579d = str;
                    p0Var.f192580e = m1Var.getName();
                    p0Var.f192581f = m1Var.mo119980r();
                    p0Var.f192582g = 0;
                    ((HashMap) dVar.f203254h).put(str, p0Var);
                    dVar.mo96901h(p0Var);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ComposeUI$k */
    public class C70325k implements MTimerHandler.CallBack {
        public C70325k() {
        }

        public boolean onTimerExpired() {
            ComposeUI composeUI = ComposeUI.this;
            composeUI.enableOptionMenu(ComposeUI.m82864H7(composeUI, true));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ComposeUI$l */
    public class C70326l implements MTimerHandler.CallBack {
        public C70326l() {
        }

        public boolean onTimerExpired() {
            ComposeUI composeUI = ComposeUI.this;
            if (!composeUI.f203097F || !ComposeUI.m82864H7(composeUI, false)) {
                return true;
            }
            ComposeUI composeUI2 = ComposeUI.this;
            if (composeUI2.f203104M != 20) {
                return true;
            }
            C67037k kVar = new C67037k();
            kVar.f192565d = composeUI2.f203093B;
            kVar.f192566e = composeUI2.f203094C;
            kVar.f192567f = composeUI2.f203118e.getMailAddrs();
            kVar.f192568g = composeUI2.f203122i.getMailAddrs();
            kVar.f192569h = composeUI2.f203125o.getMailAddrs();
            kVar.f192571j = composeUI2.f203128q.getText().toString();
            kVar.f192570i = composeUI2.f203137y.mo96898e();
            int i = composeUI2.f203104M;
            if (i != 21 && i == 20) {
                kVar.f192572n = composeUI2.mo96813L7();
                kVar.f192573o = composeUI2.f203104M;
                Log.m105924i("MicroMsg.Mail.ComposeUI", "save draft mail as normal mode");
            }
            C27896j jVar = ((C27900o) C86312j.m106911c(C27900o.class)).mo55677fI().f233203c;
            jVar.getClass();
            try {
                jVar.f77063a.mo55675a();
                C27899n nVar = jVar.f77063a;
                String str = jVar.f77063a.f77070a + jVar.mo55674a(kVar.f192566e, kVar.f192565d);
                byte[] byteArray = kVar.toByteArray();
                nVar.getClass();
                Util.isEqual(C86013q1.m106438T(str, byteArray, 0, byteArray.length), 0);
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.DraftBoxMgr", e, "", new Object[0]);
            }
            C76901s0 s0Var = ComposeUI.this.f203096E;
            if (s0Var != null) {
                s0Var.dismiss();
            }
            ComposeUI composeUI3 = ComposeUI.this;
            composeUI3.f203096E = C76912y0.m92775n(composeUI3, composeUI3.getString(C0966R.string.hkn), 2000);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ComposeUI$m */
    public class C70327m extends C67042s.C67044b {
        public C70327m() {
        }

        /* renamed from: a */
        public void mo91029a() {
            Log.m105924i("MicroMsg.Mail.ComposeUI", "sync addr complete");
            ComposeUI composeUI = ComposeUI.this;
            MailAddrsViewControl.C70352e eVar = new MailAddrsViewControl.C70352e(composeUI, composeUI.f203135x.mo91026e((String) null));
            ComposeUI.this.f203118e.setAddrsAdapter(eVar);
            ComposeUI.this.f203122i.setAddrsAdapter(eVar);
            ComposeUI.this.f203125o.setAddrsAdapter(eVar);
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ComposeUI$n */
    public class C70328n implements Runnable {
        public C70328n() {
        }

        public void run() {
            ComposeUI.this.f203117d.fullScroll(130);
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ComposeUI$o */
    public class C70329o implements MailAddrsViewControl.C70351d {
        public C70329o() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ComposeUI$p */
    public class C70330p implements View.OnClickListener {
        public C70330p() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/ComposeUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(ComposeUI.this, MailAddrListUI.class);
            intent.putExtra("INIT_SELECTED_ADDRS_INTENT_EXTRA", ComposeUI.this.f203118e.getMailAddrStringArray());
            intent.putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2469dt);
            intent.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2393bw);
            ComposeUI.this.startActivityForResult(intent, 0);
            BackwardSupportUtil.AnimationHelper.overridePendingTransition(ComposeUI.this, C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2394bx);
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/ComposeUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ComposeUI$q */
    public class C70331q implements View.OnClickListener {
        public C70331q() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/ComposeUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(ComposeUI.this, MailAddrListUI.class);
            intent.putExtra("INIT_SELECTED_ADDRS_INTENT_EXTRA", ComposeUI.this.f203122i.getMailAddrStringArray());
            intent.putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2469dt);
            intent.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2393bw);
            ComposeUI.this.startActivityForResult(intent, 1);
            BackwardSupportUtil.AnimationHelper.overridePendingTransition(ComposeUI.this, C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2394bx);
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/ComposeUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ComposeUI$r */
    public class C70332r implements View.OnClickListener {
        public C70332r() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/ComposeUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(ComposeUI.this, MailAddrListUI.class);
            intent.putExtra("INIT_SELECTED_ADDRS_INTENT_EXTRA", ComposeUI.this.f203125o.getMailAddrStringArray());
            intent.putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2469dt);
            intent.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2393bw);
            ComposeUI.this.startActivityForResult(intent, 2);
            BackwardSupportUtil.AnimationHelper.overridePendingTransition(ComposeUI.this, C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2394bx);
            C117292a.m165361g(this, "com/tencent/mm/plugin/qqmail/ui/ComposeUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ComposeUI$s */
    public class C70333s implements View.OnFocusChangeListener {
        public C70333s() {
        }

        public void onFocusChange(View view, boolean z) {
            if (z) {
                EditText editText = ComposeUI.this.f203128q;
                editText.setSelection(editText.getText().length());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.ui.ComposeUI$v */
    public class C70334v extends MailAddrsViewControl.C70355f {

        /* renamed from: a */
        public ImageView f203168a;

        /* renamed from: b */
        public int f203169b;

        public C70334v(ImageView imageView, int i) {
            this.f203168a = imageView;
            this.f203169b = i;
        }
    }

    public ComposeUI() {
        ((C27900o) C86312j.m106911c(C27900o.class)).mo55678vT();
        this.f203106P = null;
        this.f203107Q = null;
        this.f203108R = null;
        this.f203109S = "weixin://get_img_info/";
        this.f203110T = "weixin://get_mail_content/";
        this.f203111U = "weixin://img_onclick/";
        this.f203112V = false;
        this.f203113W = new MTimerHandler(new C70325k(), true);
        this.f203114X = new MTimerHandler(new C70326l(), true);
        this.f203115Y = new C70327m();
        this.f203116Z = new C70314e();
        this.f203127p0 = new C70316f();
        this.f203136x0 = new C70319h();
        this.f203138y0 = new C70321i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0098 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: H7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m82864H7(com.tencent.p014mm.plugin.qqmail.p090ui.ComposeUI r2, boolean r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x0040
            com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl r3 = r2.f203118e
            java.util.LinkedList r3 = r3.getMailAddrs()
            int r3 = r3.size()
            if (r3 != 0) goto L_0x0040
            com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl r3 = r2.f203122i
            java.util.LinkedList r3 = r3.getMailAddrs()
            int r3 = r3.size()
            if (r3 != 0) goto L_0x0040
            com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl r3 = r2.f203125o
            java.util.LinkedList r3 = r3.getMailAddrs()
            int r3 = r3.size()
            if (r3 != 0) goto L_0x0040
            com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl r3 = r2.f203118e
            boolean r3 = r3.mo96853d()
            if (r3 != 0) goto L_0x0040
            com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl r3 = r2.f203122i
            boolean r3 = r3.mo96853d()
            if (r3 != 0) goto L_0x0040
            com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl r3 = r2.f203125o
            boolean r3 = r3.mo96853d()
            if (r3 != 0) goto L_0x0040
            goto L_0x0099
        L_0x0040:
            int r3 = r2.f203104M
            r1 = 20
            if (r3 != r1) goto L_0x0073
            android.widget.EditText r3 = r2.f203128q
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r3.trim()
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0098
            com.tencent.mm.plugin.qqmail.ui.d r3 = r2.f203137y
            java.util.LinkedList r3 = r3.mo96898e()
            int r3 = r3.size()
            if (r3 != 0) goto L_0x0098
            android.widget.EditText r2 = r2.f203133v
            android.text.Editable r2 = r2.getText()
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0098
            goto L_0x0099
        L_0x0073:
            r1 = 21
            if (r3 != r1) goto L_0x0098
            android.widget.EditText r3 = r2.f203128q
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r3.trim()
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0098
            com.tencent.mm.plugin.qqmail.ui.d r2 = r2.f203137y
            java.util.LinkedList r2 = r2.mo96898e()
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r0 = 1
        L_0x0099:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.qqmail.p090ui.ComposeUI.m82864H7(com.tencent.mm.plugin.qqmail.ui.ComposeUI, boolean):boolean");
    }

    /* renamed from: I7 */
    public static String m82865I7(ComposeUI composeUI) {
        String str;
        String str2;
        String str3;
        String str4;
        ComposeUI composeUI2 = composeUI;
        composeUI.getClass();
        composeUI2.f203095D = "SendMail_" + System.currentTimeMillis();
        Bundle bundle = new Bundle();
        bundle.putString("mail_id", composeUI2.f203094C);
        int i = composeUI2.f203093B;
        bundle.putInt("mail_send_type", i != 2 ? i != 3 ? 1 : 3 : 2);
        String obj = composeUI2.f203128q.getText().toString();
        if (obj.trim().length() <= 0) {
            String L7 = composeUI.mo96813L7();
            int i2 = composeUI2.f203104M;
            int i3 = 40;
            if (i2 == 20) {
                if (L7.length() > 0) {
                    if (L7.length() <= 40) {
                        i3 = L7.length();
                    }
                    obj = L7.substring(0, i3);
                }
            } else if (i2 == 21 && !Util.isNullOrNil(L7)) {
                if (L7.length() <= 40) {
                    i3 = L7.length();
                }
                obj = L7.substring(0, i3);
            }
            obj = composeUI2.getString(C0966R.string.hku);
        }
        bundle.putString("mail_subject", obj);
        bundle.putString("mail_content", composeUI.mo96813L7());
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = new Bundle();
        String str5 = C79540c0.f233199g;
        String str6 = ((IPCString) C80907o.m98783f(MMApplicationContext.getPackageName(), new IPCVoid(), C16157c.class)).f10315d;
        if (Util.isNullOrNil(str6)) {
            Log.m105928w("MicroMsg.Mail.ComposeUI", "bindMail is null");
            C76701a.makeText((Context) composeUI2, (int) C0966R.string.hkc, 1).show();
            C89779i0 i0Var = composeUI2.f203092A;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            return composeUI2.f203095D;
        }
        String str7 = "item_addr";
        bundle2.putString(str7, str6);
        arrayList.add(bundle2);
        bundle.putParcelableArrayList("mail_from_list", arrayList);
        String str8 = "mail_to_list";
        bundle.putParcelableArrayList(str8, composeUI2.mo96816O7(composeUI2.f203118e.getMailAddrs()));
        String str9 = "mail_cc_list";
        bundle.putParcelableArrayList(str9, composeUI2.mo96816O7(composeUI2.f203122i.getMailAddrs()));
        String str10 = "mail_bcc_list";
        bundle.putParcelableArrayList(str10, composeUI2.mo96816O7(composeUI2.f203125o.getMailAddrs()));
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<C67039p0> it = composeUI2.f203137y.mo96898e().iterator();
        while (true) {
            str = "attach_path";
            str2 = str10;
            str3 = str9;
            if (!it.hasNext()) {
                break;
            }
            Iterator<C67039p0> it4 = it;
            C67039p0 next = it.next();
            String str11 = str8;
            Bundle bundle3 = new Bundle();
            String str12 = str7;
            bundle3.putString("attach_fileId", next.f192584i);
            bundle3.putString("attach_name", next.f192580e);
            bundle3.putString(str, next.f192579d);
            bundle3.putInt("attach_size", (int) next.f192581f);
            if (!((HashMap) composeUI2.f203105N).containsKey(next.f192580e)) {
                arrayList2.add(bundle3);
            } else {
                arrayList3.add(bundle3);
            }
            str8 = str11;
            str10 = str2;
            str9 = str3;
            it = it4;
            str7 = str12;
        }
        String str13 = str8;
        String str14 = str7;
        bundle.putParcelableArrayList("mail_normal_attach", arrayList2);
        bundle.putParcelableArrayList("mail_image_attach", arrayList3);
        String str15 = composeUI2.f203095D;
        C39598t0 t0Var = new C39598t0();
        t0Var.f106304d = bundle.getInt("mail_send_type");
        t0Var.f106313p = bundle.getString("mail_id");
        t0Var.f106309i = bundle.getString("mail_subject");
        String string = bundle.getString("mail_content");
        t0Var.f106310j = string;
        Log.m105925i("MicroMsg.Mail.NormalMailAppService", "parseSendMailContent before content:%s", string);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("mail_image_attach");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            Iterator it5 = parcelableArrayList.iterator();
            while (it5.hasNext()) {
                Bundle bundle4 = (Bundle) it5.next();
                String string2 = bundle4.getString("attach_fileId", "");
                String string3 = bundle4.getString("attach_name", "");
                String string4 = bundle4.getString(str, "");
                String str16 = t0Var.f106310j;
                Iterator it6 = it5;
                t0Var.f106310j = str16.replaceAll(String.format("src=\"%s\"", new Object[]{"file://" + string4}), String.format("src=\"/attach/preview?bizid=50&fileid=%s&name=%s\"", new Object[]{string2, string3}));
                ComposeUI composeUI3 = composeUI;
                it5 = it6;
                str = str;
            }
        }
        Log.m105925i("MicroMsg.Mail.NormalMailAppService", "parseSendMailContent after content:%s", t0Var.f106310j);
        t0Var.f106314q = true;
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("mail_from_list");
        if (parcelableArrayList2 == null || parcelableArrayList2.isEmpty()) {
            str4 = str14;
        } else {
            C39596r0 r0Var = new C39596r0();
            t0Var.f106305e = r0Var;
            r0Var.f106289f = (long) C86709a0.m107523b().mo121110g();
            str4 = str14;
            t0Var.f106305e.f106288e = ((Bundle) parcelableArrayList2.get(0)).getString(str4);
            t0Var.f106305e.f106287d = ((Bundle) parcelableArrayList2.get(0)).getString(FirebaseAnalytics.C113379b.ITEM_NAME);
            Log.m105925i("MicroMsg.Mail.NormalMailAppService", "from addr %s", t0Var.f106305e.f106288e);
        }
        ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(str13);
        if (parcelableArrayList3 != null && !parcelableArrayList3.isEmpty()) {
            Iterator it7 = parcelableArrayList3.iterator();
            while (it7.hasNext()) {
                Bundle bundle5 = (Bundle) it7.next();
                C39596r0 r0Var2 = new C39596r0();
                r0Var2.f106288e = bundle5.getString(str4);
                r0Var2.f106287d = bundle5.getString(FirebaseAnalytics.C113379b.ITEM_NAME);
                t0Var.f106306f.add(r0Var2);
                Log.m105925i("MicroMsg.Mail.NormalMailAppService", "to addr %s", r0Var2.f106288e);
            }
        }
        ArrayList parcelableArrayList4 = bundle.getParcelableArrayList(str3);
        if (parcelableArrayList4 != null && !parcelableArrayList4.isEmpty()) {
            Iterator it8 = parcelableArrayList4.iterator();
            while (it8.hasNext()) {
                Bundle bundle6 = (Bundle) it8.next();
                C39596r0 r0Var3 = new C39596r0();
                r0Var3.f106288e = bundle6.getString(str4);
                r0Var3.f106287d = bundle6.getString(FirebaseAnalytics.C113379b.ITEM_NAME);
                t0Var.f106307g.add(r0Var3);
                Log.m105925i("MicroMsg.Mail.NormalMailAppService", "cc addr %s", r0Var3.f106288e);
            }
        }
        ArrayList parcelableArrayList5 = bundle.getParcelableArrayList(str2);
        if (parcelableArrayList5 != null && !parcelableArrayList5.isEmpty()) {
            Iterator it9 = parcelableArrayList5.iterator();
            while (it9.hasNext()) {
                Bundle bundle7 = (Bundle) it9.next();
                C39596r0 r0Var4 = new C39596r0();
                r0Var4.f106288e = bundle7.getString(str4);
                r0Var4.f106287d = bundle7.getString(FirebaseAnalytics.C113379b.ITEM_NAME);
                t0Var.f106308h.add(r0Var4);
                Log.m105925i("MicroMsg.Mail.NormalMailAppService", "bcc addr %s", r0Var4.f106288e);
            }
        }
        ArrayList parcelableArrayList6 = bundle.getParcelableArrayList("mail_normal_attach");
        if (parcelableArrayList6 != null && !parcelableArrayList6.isEmpty()) {
            Iterator it10 = parcelableArrayList6.iterator();
            while (it10.hasNext()) {
                Bundle bundle8 = (Bundle) it10.next();
                C39595q0 q0Var = new C39595q0();
                q0Var.f106280d = bundle8.getString("attach_fileId");
                q0Var.f106285i = bundle8.getString("attach_key");
                q0Var.f106281e = bundle8.getString("attach_name");
                q0Var.f106282f = bundle8.getInt("attach_size");
                q0Var.f106284h = bundle8.getString("attach_download_url");
                q0Var.f106283g = bundle8.getString("attach_type");
                t0Var.f106311n.add(q0Var);
                Log.m105925i("MicroMsg.Mail.NormalMailAppService", "attach %s,%s,%s", q0Var.f106280d, q0Var.f106281e, q0Var.f106284h);
            }
        }
        ArrayList parcelableArrayList7 = bundle.getParcelableArrayList("mail_big_attach");
        if (parcelableArrayList7 != null && !parcelableArrayList7.isEmpty()) {
            Iterator it11 = parcelableArrayList7.iterator();
            while (it11.hasNext()) {
                Bundle bundle9 = (Bundle) it11.next();
                C39595q0 q0Var2 = new C39595q0();
                q0Var2.f106280d = bundle9.getString("attach_fileId");
                q0Var2.f106285i = bundle9.getString("attach_key");
                q0Var2.f106281e = bundle9.getString("attach_name");
                q0Var2.f106282f = bundle9.getInt("attach_size");
                q0Var2.f106284h = bundle9.getString("attach_download_url");
                q0Var2.f106283g = bundle9.getString("attach_type");
                t0Var.f106312o.add(q0Var2);
                Log.m105925i("MicroMsg.Mail.NormalMailAppService", "big attach %s,%s,%s", q0Var2.f106280d, q0Var2.f106281e, q0Var2.f106284h);
            }
        }
        C86709a0.m107524d().mo123460f(new C39949e(str15, t0Var));
        return composeUI.f203095D;
    }

    /* renamed from: J7 */
    public final void mo96811J7() {
        this.f203118e.clearFocus();
        this.f203122i.clearFocus();
        this.f203125o.clearFocus();
    }

    /* renamed from: K7 */
    public final void mo96812K7(String str) {
        C86009m1 m1Var = new C86009m1(str);
        if (m1Var.mo119967g()) {
            if (((HashMap) this.f203137y.f203254h).containsKey(str)) {
                C76879j.m92738i(getContext(), C0966R.string.hlf, C0966R.string.a3h);
                return;
            }
            int r = (int) m1Var.mo119980r();
            if (r > 20971520) {
                C76879j.m92742m(this, C0966R.string.hlg, C0966R.string.a3h, (DialogInterface.OnClickListener) null);
                return;
            }
            C76879j.m92750u(this, getString(C0966R.string.hli, new Object[]{Util.getSizeKB((long) r)}), getString(C0966R.string.a3h), new C70324j(r, m1Var, str), (DialogInterface.OnClickListener) null);
        }
    }

    /* renamed from: L7 */
    public final String mo96813L7() {
        StringBuilder sb = new StringBuilder(this.f203133v.getText().toString());
        ((C45519s0) C86312j.m106911c(C45519s0.class)).l40(this.f203134w, this.f203110T, this.f203100I);
        if (!Util.isNullOrNil(this.f203106P)) {
            int indexOf = this.f203106P.indexOf(this.f203101J);
            int lastIndexOf = this.f203106P.lastIndexOf(this.f203102K);
            if (indexOf == -1 || lastIndexOf == -1) {
                sb.append("\n");
                sb.append(this.f203106P);
            } else {
                String substring = this.f203106P.substring(indexOf + this.f203101J.length(), lastIndexOf + this.f203102K.length());
                sb.append("\n");
                sb.append(substring);
            }
        }
        return sb.toString();
    }

    /* renamed from: M7 */
    public final void mo96814M7() {
        MMWebView mMWebView = this.f203134w;
        if (mMWebView != null) {
            mMWebView.clearFocus();
            this.f203134w.getSettings().setJavaScriptEnabled(true);
            this.f203134w.setWebViewClient(new C42786u((C70325k) null));
            this.f203134w.setWebChromeClient(new C42785t((C70325k) null));
            this.f203134w.setOnTouchListener(new C5027d(this));
        }
    }

    /* renamed from: N7 */
    public final List<C67038p> mo96815N7(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        if (strArr != null) {
            for (String str : strArr) {
                C67038p pVar = null;
                if (!Util.isNullOrNil(str)) {
                    String trim = str.trim();
                    int lastIndexOf = trim.trim().lastIndexOf(" ");
                    if (lastIndexOf != -1) {
                        pVar = new C67038p();
                        pVar.f192575e = trim.substring(0, lastIndexOf);
                        pVar.f192576f = trim.substring(lastIndexOf + 1);
                    }
                }
                if (pVar != null) {
                    arrayList.add(pVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: O7 */
    public final ArrayList<Bundle> mo96816O7(List<C67038p> list) {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        for (C67038p next : list) {
            Bundle bundle = new Bundle();
            bundle.putString("item_addr", next.f192576f);
            bundle.putString(FirebaseAnalytics.C113379b.ITEM_NAME, next.f192575e);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: P7 */
    public final void mo96817P7() {
        String l = C112760b.m154240l();
        if (!((C7138g) C86312j.m106911c(C7138g.class)).Gl0(this, l, "microMsg." + System.currentTimeMillis() + ".jpg", 3)) {
            C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.ik5), 1).show();
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359932bp0;
    }

    public void initView() {
        int i;
        Class cls = C27900o.class;
        this.f203117d = (ScrollView) findViewById(C0966R.C0970id.i_3);
        this.f203118e = (MailAddrsViewControl) findViewById(C0966R.C0970id.i9z);
        this.f203119f = (ImageView) findViewById(C0966R.C0970id.i9u);
        this.f203120g = (LinearLayout) findViewById(C0966R.C0970id.i_2);
        this.f203121h = (LinearLayout) findViewById(C0966R.C0970id.i9y);
        this.f203122i = (MailAddrsViewControl) findViewById(C0966R.C0970id.i9x);
        this.f203123j = (ImageView) findViewById(C0966R.C0970id.i9t);
        this.f203124n = (LinearLayout) findViewById(C0966R.C0970id.i9w);
        this.f203125o = (MailAddrsViewControl) findViewById(C0966R.C0970id.i9v);
        this.f203126p = (ImageView) findViewById(C0966R.C0970id.i9s);
        this.f203128q = (EditText) findViewById(C0966R.C0970id.i_7);
        this.f203129r = (LinearLayout) findViewById(C0966R.C0970id.i9r);
        this.f203133v = (EditText) findViewById(C0966R.C0970id.i_4);
        MMWebView mMWebView = (MMWebView) findViewById(C0966R.C0970id.i_5);
        mMWebView.getClass();
        this.f203134w = mMWebView;
        this.f203130s = (TextView) findViewById(C0966R.C0970id.i_1);
        this.f203131t = (ImageView) findViewById(C0966R.C0970id.i_0);
        this.f203132u = (LinearLayout) findViewById(C0966R.C0970id.f358933hy3);
        this.f203118e.setEditable(true);
        this.f203122i.setEditable(true);
        this.f203125o.setEditable(true);
        String stringExtra = getIntent().getStringExtra("mail_content");
        this.f203107Q = getIntent().getParcelableArrayListExtra("mail_attach");
        this.f203108R = getIntent().getStringArrayListExtra("mail_attach_file");
        C27896j jVar = ((C27900o) C86312j.m106911c(cls)).mo55677fI().f233203c;
        String str = this.f203094C;
        int i2 = this.f203093B;
        C27899n nVar = jVar.f77063a;
        nVar.getClass();
        byte[] O = C86013q1.m106433O(jVar.f77063a.f77070a + jVar.mo55674a(str, i2), 0, -1);
        C67037k kVar = null;
        if (!(O == null || O.length == 0)) {
            try {
                kVar = (C67037k) new C67037k().parseFrom(O);
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.DraftBoxMgr", e, "", new Object[0]);
            }
        }
        this.f203137y = new C70366d(this, this.f203130s, this.f203131t, this.f203132u);
        if (!Util.isNullOrNil(stringExtra)) {
            int i3 = this.f203104M;
            if (i3 == 21) {
                mo96814M7();
                this.f203118e.requestFocus();
                String format = String.format(this.f203103L, new Object[]{stringExtra});
                this.f203106P = format;
                this.f203134w.loadDataWithBaseURL("", format, "text/html", "utf-8", "");
                this.f203134w.setVisibility(0);
            } else if (i3 == 20) {
                this.f203133v.setVisibility(0);
                this.f203134w.setVisibility(8);
                if (stringExtra.indexOf("<div>") != -1) {
                    Log.m105924i("MicroMsg.Mail.ComposeUI", "set content in html format");
                    this.f203133v.setText(Html.fromHtml(stringExtra));
                } else {
                    this.f203133v.setText(stringExtra);
                }
            }
        } else if (kVar == null || this.f203104M != 21) {
            Log.m105924i("MicroMsg.Mail.ComposeUI", "no extra or draf mail content");
            int i4 = this.f203104M;
            if (i4 == 21) {
                mo96814M7();
                this.f203118e.requestFocus();
                String format2 = String.format(this.f203103L, new Object[]{""});
                this.f203106P = format2;
                this.f203134w.loadDataWithBaseURL("", format2, "text/html", "utf-8", "");
                this.f203133v.setVisibility(8);
                this.f203134w.setVisibility(0);
            } else if (i4 == 20) {
                this.f203134w.setVisibility(8);
                this.f203133v.setVisibility(0);
            }
        } else {
            Log.m105924i("MicroMsg.Mail.ComposeUI", "read mail from draftMail");
            this.f203118e.mo96852c(kVar.f192567f, false);
            this.f203122i.mo96852c(kVar.f192568g, false);
            this.f203125o.mo96852c(kVar.f192569h, false);
            this.f203128q.setText(kVar.f192571j);
            String str2 = kVar.f192572n;
            this.f203104M = 20;
            if (str2.indexOf("<div>") != -1) {
                Log.m105924i("MicroMsg.Mail.ComposeUI", "set content in html format");
                this.f203133v.setText(Html.fromHtml(str2));
            } else {
                this.f203133v.setText(str2);
            }
            this.f203137y.mo96902i(kVar.f192570i);
            this.f203137y.mo96895b();
            this.f203134w.setVisibility(8);
            this.f203133v.setVisibility(0);
        }
        if (this.f203093B != 1) {
            String[] stringArrayExtra = getIntent().getStringArrayExtra("toList");
            String[] stringArrayExtra2 = getIntent().getStringArrayExtra("ccList");
            String[] stringArrayExtra3 = getIntent().getStringArrayExtra("bccList");
            String stringExtra2 = getIntent().getStringExtra("subject");
            this.f203118e.mo96852c(mo96815N7(stringArrayExtra), false);
            this.f203122i.mo96852c(mo96815N7(stringArrayExtra2), false);
            this.f203125o.mo96852c(mo96815N7(stringArrayExtra3), false);
            if (!Util.isNullOrNil(stringExtra2)) {
                EditText editText = this.f203128q;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f203093B == 2 ? "Re:" : "Fwd:");
                sb.append(stringExtra2);
                editText.setText(sb.toString());
            }
            if (this.f203107Q != null) {
                ArrayList arrayList = new ArrayList();
                for (Bundle next : this.f203107Q) {
                    C67039p0 p0Var = new C67039p0();
                    p0Var.f192580e = next.getString("attach_name");
                    p0Var.f192579d = ((C27900o) C86312j.m106911c(cls)).mo55677fI().mo109595d() + p0Var.f192580e;
                    p0Var.f192582g = 2;
                    p0Var.f192581f = (long) next.getInt("attach_size");
                    p0Var.f192584i = next.getString("attach_fileId");
                    arrayList.add(p0Var);
                }
                if (!arrayList.isEmpty()) {
                    this.f203137y.mo96902i(arrayList);
                }
            }
        } else {
            String stringExtra3 = getIntent().getStringExtra("subject");
            if (!Util.isNullOrNil(stringExtra3)) {
                this.f203128q.setText(stringExtra3);
            }
            List<String> list = this.f203108R;
            if (list != null) {
                for (String K7 : list) {
                    mo96812K7(K7);
                }
            }
        }
        if (this.f203122i.getMailAddrs().size() > 0 || this.f203125o.getMailAddrs().size() > 0) {
            this.f203120g.setVisibility(8);
            this.f203121h.setVisibility(0);
            this.f203124n.setVisibility(0);
        }
        if (this.f203093B == 2 && (i = this.f203104M) != 21 && i == 20) {
            this.f203133v.requestFocus();
            this.f203133v.setSelection(0);
            this.f203117d.postDelayed(new C70328n(), 1000);
        }
        this.f203118e.setOnActionListener(new C70334v(this.f203119f, 0));
        this.f203122i.setOnActionListener(new C70334v(this.f203123j, 1));
        this.f203125o.setOnActionListener(new C70334v(this.f203126p, 2));
        C70329o oVar = new C70329o();
        this.f203118e.setInvalidMailAddrListener(oVar);
        this.f203122i.setInvalidMailAddrListener(oVar);
        this.f203125o.setInvalidMailAddrListener(oVar);
        this.f203119f.setOnClickListener(new C70330p());
        this.f203123j.setOnClickListener(new C70331q());
        this.f203126p.setOnClickListener(new C70332r());
        this.f203120g.setOnClickListener(this.f203116Z);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.i_6);
        if (this.f203098G && this.f203128q.getText().length() > 0) {
            imageView.setVisibility(0);
        }
        this.f203128q.setOnFocusChangeListener(new C70333s());
        this.f203128q.addTextChangedListener(new C70311a(imageView));
        imageView.setOnClickListener(new C70312b());
        this.f203129r.setOnClickListener(this.f203127p0);
        setMMTitle((int) C0966R.string.hky);
        setBackBtn(this.f203136x0);
        addTextOptionMenu(0, getString(C0966R.string.a2s), new C70313c());
        enableOptionMenu(false);
        mo96811J7();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String b;
        if (i2 == -1) {
            if (i == 0) {
                MailAddrsViewControl mailAddrsViewControl = this.f203118e;
                List<C67038p> list = f203091Q0;
                if (list != null) {
                    mailAddrsViewControl.setMailAdds(list);
                }
                showVKB();
            } else if (i == 1) {
                MailAddrsViewControl mailAddrsViewControl2 = this.f203122i;
                List<C67038p> list2 = f203091Q0;
                if (list2 != null) {
                    mailAddrsViewControl2.setMailAdds(list2);
                }
                showVKB();
            } else if (i == 2) {
                MailAddrsViewControl mailAddrsViewControl3 = this.f203125o;
                List<C67038p> list3 = f203091Q0;
                if (list3 != null) {
                    mailAddrsViewControl3.setMailAdds(list3);
                }
                showVKB();
            } else if (i == 3) {
                String g6 = ((C7138g) C86312j.m106911c(C7138g.class)).mo8319g6(this, intent, C7970a.m8127a());
                if (g6 != null) {
                    mo96812K7(g6);
                    mo96811J7();
                }
            } else if (i != 4) {
                if (i == 5 && intent != null) {
                    mo96812K7(intent.getStringExtra("choosed_file_path"));
                    mo96811J7();
                }
            } else if (intent != null && (b = C7013o.m7260b(this, intent, C7970a.m8127a())) != null && b.length() > 0) {
                mo96812K7(b);
                mo96811J7();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f203103L = this.f203101J + "%s" + this.f203102K;
        this.f203112V = false;
        this.f203093B = getIntent().getIntExtra("composeType", 1);
        String stringExtra = getIntent().getStringExtra("mailid");
        this.f203094C = stringExtra;
        if (stringExtra == null) {
            this.f203094C = "";
        }
        int intExtra = getIntent().getIntExtra("mail_mode", 20);
        this.f203104M = intExtra;
        Log.m105919d("MicroMsg.Mail.ComposeUI", "onCreate, mode = %d", Integer.valueOf(intExtra));
        initView();
        C67042s sVar = ((C27900o) C86312j.m106911c(C27900o.class)).mo55677fI().f233202b;
        this.f203135x = sVar;
        sVar.mo91023b(this.f203115Y);
        this.f203135x.mo91025d();
        this.f203114X.startTimer(ApkDownloadManager.INTERVAL);
        C86709a0.m107524d().mo123455a(11166, this);
    }

    public void onDestroy() {
        super.onDestroy();
        if (f203091Q0 != null) {
            f203091Q0 = null;
        }
        this.f203137y.mo96894a();
        C70366d dVar = this.f203137y;
        dVar.getClass();
        C86709a0.m107529k().f251779b.mo123470p(11665, dVar);
        this.f203135x.mo91027f(this.f203115Y);
        this.f203139z.mo118714a();
        C86709a0.m107524d().mo123470p(11166, this);
        this.f203114X.stopTimer();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        ((C70319h) this.f203136x0).onMenuItemClick((MenuItem) null);
        return true;
    }

    public void onPause() {
        super.onPause();
        hideVKB();
        this.f203113W.stopTimer();
        C76901s0 s0Var = this.f203096E;
        if (s0Var != null) {
            s0Var.dismiss();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.Mail.ComposeUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.Mail.ComposeUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 16) {
            if (iArr[0] == 0) {
                mo96817P7();
                return;
            }
            C76879j.m92709C(this, getString(C0966R.string.hhq), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new C5028g(), (DialogInterface.OnClickListener) null);
        }
    }

    public void onResume() {
        super.onResume();
        this.f203113W.startTimer(1500);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.Mail.ComposeUI", "errType %d, errCode %d, errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (!((C39949e) yVar).f107095f.equals(this.f203095D)) {
            Log.m105928w("MicroMsg.Mail.ComposeUI", "not current request, ignore");
            return;
        }
        C89779i0 i0Var = this.f203092A;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        if (i == 0 && i2 == 0) {
            C76701a.makeText((Context) this, (int) C0966R.string.hke, 1).show();
            C27896j jVar = ((C27900o) C86312j.m106911c(C27900o.class)).mo55677fI().f233203c;
            String str2 = this.f203094C;
            int i3 = this.f203093B;
            C86009m1 m1Var = new C86009m1(jVar.f77063a.f77070a + jVar.mo55674a(str2, i3));
            if (m1Var.mo119967g()) {
                m1Var.mo119966f();
            }
            this.f203135x.mo91024c(this.f203118e.getMailAddrs());
            this.f203135x.mo91024c(this.f203122i.getMailAddrs());
            this.f203135x.mo91024c(this.f203125o.getMailAddrs());
            setResult(-1);
            finish();
            return;
        }
        if (Util.isNullOrNil(str)) {
            str = getString(C0966R.string.hkc);
        }
        C76701a.makeText((Context) this, (CharSequence) str, 1).show();
    }

    public void setRequestedOrientation(int i) {
    }
}
