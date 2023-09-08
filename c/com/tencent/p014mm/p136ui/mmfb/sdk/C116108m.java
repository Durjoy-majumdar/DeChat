package com.tencent.p014mm.p136ui.mmfb.sdk;

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
import com.tencent.p014mm.p136ui.mmfb.sdk.C116102h;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;
import j20.C117292a;
import java.net.MalformedURLException;
import java.net.URL;
import k20.C9556a;
import qo3.C77390c0;

/* renamed from: com.tencent.mm.ui.mmfb.sdk.m */
public class C116108m extends C77390c0 {

    /* renamed from: j */
    public static final FrameLayout.LayoutParams f348449j = new FrameLayout.LayoutParams(-1, -1);

    /* renamed from: d */
    public String f348450d;

    /* renamed from: e */
    public C116102h.C116103a f348451e;

    /* renamed from: f */
    public ProgressDialog f348452f;

    /* renamed from: g */
    public ImageView f348453g;

    /* renamed from: h */
    public WebView f348454h;

    /* renamed from: i */
    public FrameLayout f348455i;

    /* renamed from: com.tencent.mm.ui.mmfb.sdk.m$a */
    public class C116109a extends WebViewClient {

        /* renamed from: a */
        public boolean f348456a = true;

        /* renamed from: com.tencent.mm.ui.mmfb.sdk.m$a$a */
        public class C116110a implements DialogInterface.OnDismissListener {
            public C116110a() {
            }

            public void onDismiss(DialogInterface dialogInterface) {
                C116108m mVar;
                C116109a aVar = C116109a.this;
                if (aVar.f348456a && (mVar = C116108m.this) != null) {
                    mVar.f348451e.onCancel();
                    C116108m.this.dismiss();
                }
            }
        }

        public C116109a(C116107l lVar) {
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            this.f348456a = false;
            try {
                C116108m.this.f348452f.dismiss();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FbDialog", e, "", new Object[0]);
            }
            C116108m.this.f348455i.setBackgroundColor(0);
            C116108m.this.f348454h.setVisibility(0);
            C116108m.this.f348453g.setVisibility(0);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Log.m105918d("Facebook-WebView", "Webview loading URL: " + str);
            super.onPageStarted(webView, str, bitmap);
            try {
                C116108m.this.f348452f.show();
                C116108m.this.f348452f.setOnDismissListener(new C116110a());
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FbDialog", e, "", new Object[0]);
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            this.f348456a = false;
            C116108m.this.f348451e.mo1393d(new C116099e(str, i, str2));
            try {
                C116108m.this.dismiss();
                C116108m.this.f348452f.dismiss();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FbDialog", e, "", new Object[0]);
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Bundle bundle;
            Log.m105918d("Facebook-WebView", "Redirect URL: " + str);
            if (str.startsWith("fbconnect://success")) {
                try {
                    URL url = new URL(str.replace("fbconnect", "http"));
                    bundle = C116106k.m163397a(url.getQuery());
                    bundle.putAll(C116106k.m163397a(url.getRef()));
                } catch (MalformedURLException unused) {
                    bundle = new Bundle();
                }
                String string = bundle.getString("error");
                if (string == null) {
                    string = bundle.getString("error_type");
                }
                if (string == null) {
                    C116108m.this.f348451e.mo1391b(bundle);
                } else if (string.equals("access_denied") || string.equals("OAuthAccessDeniedException")) {
                    C116108m.this.f348451e.onCancel();
                } else {
                    C116108m.this.f348451e.mo1392c(new C116105j(string));
                }
                C116108m.this.dismiss();
                return true;
            } else if (str.startsWith("fbconnect://cancel")) {
                C116108m.this.f348451e.onCancel();
                try {
                    C116108m.this.dismiss();
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.FbDialog", e, "", new Object[0]);
                }
                return true;
            } else if (str.contains("touch")) {
                return false;
            } else {
                Context context = C116108m.this.getContext();
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/ui/mmfb/sdk/FbDialog$FbWebViewClient", "shouldOverrideUrlLoading", "(Lcom/tencent/xweb/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/ui/mmfb/sdk/FbDialog$FbWebViewClient", "shouldOverrideUrlLoading", "(Lcom/tencent/xweb/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            }
        }
    }

    public C116108m(Context context, String str, C116102h.C116103a aVar) {
        super(context, 16973840);
        this.f348450d = str;
        this.f348451e = aVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f348452f = progressDialog;
        progressDialog.requestWindowFeature(1);
        this.f348452f.setMessage(getContext().getString(C0966R.string.cln));
        requestWindowFeature(1);
        this.f348455i = new FrameLayout(getContext());
        ImageView imageView = new ImageView(getContext());
        this.f348453g = imageView;
        imageView.setOnClickListener(new C116107l(this));
        this.f348453g.setImageDrawable(getContext().getResources().getDrawable(C0966R.C0969drawable.bf6));
        this.f348453g.setVisibility(4);
        int intrinsicWidth = this.f348453g.getDrawable().getIntrinsicWidth() / 2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        WebView webView = new WebView(getContext());
        this.f348454h = webView;
        webView.setVerticalScrollBarEnabled(false);
        this.f348454h.setHorizontalScrollBarEnabled(false);
        this.f348454h.setWebViewClient(new C116109a((C116107l) null));
        this.f348454h.getSettings().setJavaScriptEnabled(true);
        this.f348454h.loadUrl(this.f348450d);
        this.f348454h.setLayoutParams(f348449j);
        this.f348454h.setVisibility(4);
        linearLayout.setPadding(intrinsicWidth, intrinsicWidth, intrinsicWidth, intrinsicWidth);
        linearLayout.addView(this.f348454h);
        this.f348455i.addView(linearLayout);
        this.f348455i.addView(this.f348453g, new ViewGroup.LayoutParams(-2, -2));
        addContentView(this.f348455i, new ViewGroup.LayoutParams(-1, -1));
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f348451e.onCancel();
        dismiss();
        return true;
    }
}
