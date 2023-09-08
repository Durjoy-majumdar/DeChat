package tn3;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.mmfb.sdk.C116099e;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;
import f40.C86709a0;
import j20.C117292a;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import k20.C9556a;
import qo3.C77390c0;
import tn3.C101905a;

/* renamed from: tn3.f */
public class C118501f extends C77390c0 {

    /* renamed from: j */
    public static final FrameLayout.LayoutParams f354659j = new FrameLayout.LayoutParams(-1, -1);

    /* renamed from: d */
    public String f354660d;

    /* renamed from: e */
    public C118502a f354661e;

    /* renamed from: f */
    public ProgressDialog f354662f;

    /* renamed from: g */
    public ImageView f354663g;

    /* renamed from: h */
    public WebView f354664h;

    /* renamed from: i */
    public FrameLayout f354665i;

    /* renamed from: tn3.f$a */
    public interface C118502a {
    }

    /* renamed from: tn3.f$b */
    public class C118503b extends WebViewClient {

        /* renamed from: a */
        public boolean f354666a = true;

        /* renamed from: tn3.f$b$a */
        public class C118504a implements DialogInterface.OnDismissListener {
            public C118504a() {
            }

            public void onDismiss(DialogInterface dialogInterface) {
                C118501f fVar;
                C118503b bVar = C118503b.this;
                if (bVar.f354666a && (fVar = C118501f.this) != null) {
                    ((C118493b) fVar.f354661e).mo183215c();
                    C118501f.this.dismiss();
                }
            }
        }

        public C118503b(C118500e eVar) {
        }

        /* renamed from: J */
        public Bundle mo183227J(String str) {
            Bundle bundle = new Bundle();
            if (str != null) {
                for (String split : str.split("&")) {
                    String[] split2 = split.split("=");
                    bundle.putString(URLDecoder.decode(split2[0]), URLDecoder.decode(split2[1]));
                }
            }
            return bundle;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            this.f354666a = false;
            try {
                C118501f.this.f354662f.dismiss();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.TwitterDialog", e, "", new Object[0]);
            }
            C118501f.this.f354665i.setBackgroundColor(0);
            C118501f.this.f354664h.setVisibility(0);
            C118501f.this.f354663g.setVisibility(0);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Log.m105918d("Twitter-WebView", "Webview loading URL: " + str);
            super.onPageStarted(webView, str, bitmap);
            try {
                C118501f.this.f354662f.show();
                C118501f.this.f354662f.setOnDismissListener(new C118504a());
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.TwitterDialog", e, "", new Object[0]);
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            this.f354666a = false;
            C118502a aVar = C118501f.this.f354661e;
            new C116099e(str, i, str2);
            C118493b bVar = (C118493b) aVar;
            bVar.mo183216d(false);
            bVar.mo183213a(C101905a.C101908c.Failed);
            C115669n.INSTANCE.idkeyStat(583, 2, 1, false);
            try {
                C118501f.this.dismiss();
                C118501f.this.f354662f.dismiss();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.TwitterDialog", e, "", new Object[0]);
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Bundle bundle;
            Log.m105918d("Twitter-WebView", "Redirect URL: " + str);
            if (str.startsWith("wechatapp://sign-in-twitter.wechatapp.com/")) {
                try {
                    URL url = new URL(str.replace("wechatapp", "http"));
                    bundle = mo183227J(url.getQuery());
                    bundle.putAll(mo183227J(url.getRef()));
                } catch (MalformedURLException unused) {
                    bundle = new Bundle();
                }
                if (bundle.getString("denied") == null) {
                    C118493b bVar = (C118493b) C118501f.this.f354661e;
                    bVar.getClass();
                    C86709a0.m107525e().postToWorker(new C118497d(bVar, bundle));
                } else {
                    ((C118493b) C118501f.this.f354661e).mo183215c();
                }
                C118501f.this.dismiss();
                return true;
            }
            Context context = C118501f.this.getContext();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/ui/twitter/TwitterDialog$TwitterWebViewClient", "shouldOverrideUrlLoading", "(Lcom/tencent/xweb/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/ui/twitter/TwitterDialog$TwitterWebViewClient", "shouldOverrideUrlLoading", "(Lcom/tencent/xweb/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    }

    public C118501f(Context context, String str, C118502a aVar) {
        super(context, 16973840);
        this.f354660d = str;
        this.f354661e = aVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f354662f = progressDialog;
        progressDialog.requestWindowFeature(1);
        this.f354662f.setMessage(getContext().getString(C0966R.string.f361476k62));
        requestWindowFeature(1);
        this.f354665i = new FrameLayout(getContext());
        ImageView imageView = new ImageView(getContext());
        this.f354663g = imageView;
        imageView.setOnClickListener(new C118500e(this));
        this.f354663g.setImageDrawable(getContext().getResources().getDrawable(C0966R.C0969drawable.bf6));
        this.f354663g.setVisibility(4);
        int intrinsicWidth = this.f354663g.getDrawable().getIntrinsicWidth() / 2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        WebView webView = new WebView(getContext());
        this.f354664h = webView;
        webView.setVerticalScrollBarEnabled(false);
        this.f354664h.setHorizontalScrollBarEnabled(false);
        this.f354664h.setWebViewClient(new C118503b((C118500e) null));
        this.f354664h.getSettings().setJavaScriptEnabled(true);
        this.f354664h.loadUrl(this.f354660d);
        this.f354664h.setLayoutParams(f354659j);
        this.f354664h.setVisibility(4);
        linearLayout.setPadding(intrinsicWidth, intrinsicWidth, intrinsicWidth, intrinsicWidth);
        linearLayout.addView(this.f354664h);
        this.f354665i.addView(linearLayout);
        this.f354665i.addView(this.f354663g, new ViewGroup.LayoutParams(-2, -2));
        addContentView(this.f354665i, new ViewGroup.LayoutParams(-1, -1));
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        ((C118493b) this.f354661e).mo183215c();
        dismiss();
        return true;
    }
}
