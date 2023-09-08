package com.tencent.p014mm.plugin.account.bind.p021ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.webkit.ConsoleMessage;
import android.widget.TextView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.xweb.CookieManager;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86312j;
import e00.C45519s0;
import f40.C86709a0;
import gg0.C45912b;
import gg0.C45914d;
import gg0.C45915e;
import gg0.C8275c;
import hg0.C8522h0;
import hg0.C8524u;
import j20.C117292a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI */
public class BindGoogleContactUI extends MMActivity implements C11385n {

    /* renamed from: s */
    public static final /* synthetic */ int f108550s = 0;

    /* renamed from: d */
    public boolean f108551d = false;

    /* renamed from: e */
    public MMWebView f108552e;

    /* renamed from: f */
    public TextView f108553f;

    /* renamed from: g */
    public String f108554g;

    /* renamed from: h */
    public String f108555h;

    /* renamed from: i */
    public String f108556i;

    /* renamed from: j */
    public String f108557j;

    /* renamed from: n */
    public ProgressDialog f108558n;

    /* renamed from: o */
    public C8522h0 f108559o;

    /* renamed from: p */
    public boolean f108560p = false;

    /* renamed from: q */
    public int f108561q;

    /* renamed from: r */
    public boolean f108562r = false;

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI$a */
    public class C40396a implements MenuItem.OnMenuItemClickListener {
        public C40396a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BindGoogleContactUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI$b */
    public class C40397b extends WebViewClient {
        public C40397b() {
        }

        public void onPageFinished(WebView webView, String str) {
            Log.m105918d("MicroMsg.GoogleContact.BindGoogleContactUI", "onPageFinished URL:" + str);
            MMWebView mMWebView = BindGoogleContactUI.this.f108552e;
            if (!(mMWebView == null || mMWebView.getVisibility() == 0)) {
                BindGoogleContactUI.this.f108552e.setVisibility(0);
                TextView textView = BindGoogleContactUI.this.f108553f;
                if (textView != null) {
                    textView.setVisibility(4);
                }
            }
            BindGoogleContactUI.this.mo63132J7();
            if (webView != null) {
                String title = webView.getTitle();
                Log.m105919d("MicroMsg.GoogleContact.BindGoogleContactUI", "title:%s", title);
                if (TextUtils.isEmpty(title)) {
                    return;
                }
                if (title.toLowerCase().contains("success")) {
                    MMWebView mMWebView2 = BindGoogleContactUI.this.f108552e;
                    if (mMWebView2 != null) {
                        mMWebView2.setVisibility(4);
                    }
                    ((C45519s0) C86312j.m106911c(C45519s0.class)).l40(BindGoogleContactUI.this.f108552e, "weixin://private/googlegetcode", "document.getElementById('code').value");
                } else if (title.toLowerCase().contains("error")) {
                    Log.m105928w("MicroMsg.GoogleContact.BindGoogleContactUI", "failed." + title.substring(title.indexOf("=")));
                }
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Log.m105919d("MicroMsg.GoogleContact.BindGoogleContactUI", "shouldOverrideUrlLoading, url = %s", str);
            if (!str.toLowerCase().startsWith("weixin://private/googlegetcode")) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            BindGoogleContactUI.m43583H7(BindGoogleContactUI.this, str);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI$c */
    public class C40398c extends WebChromeClient {
        public C40398c() {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String Oq0 = ((C45519s0) C86312j.m106911c(C45519s0.class)).Oq0(consoleMessage != null ? consoleMessage.message() : null);
            if (!Oq0.toLowerCase().startsWith("weixin://private/googlegetcode")) {
                return super.onConsoleMessage(consoleMessage);
            }
            BindGoogleContactUI.m43583H7(BindGoogleContactUI.this, Oq0);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI$d */
    public class C40399d implements DialogInterface.OnCancelListener {
        public C40399d() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            BindGoogleContactUI bindGoogleContactUI = BindGoogleContactUI.this;
            bindGoogleContactUI.f108560p = true;
            if (bindGoogleContactUI.f108559o != null) {
                C86709a0.m107524d().mo123458d(BindGoogleContactUI.this.f108559o);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI$e */
    public class C40400e extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        public String f108567a;

        /* renamed from: b */
        public String f108568b;

        /* renamed from: c */
        public boolean f108569c;

        public C40400e(String str) {
            this.f108567a = str;
        }

        /* renamed from: a */
        public final String mo63140a(String str) {
            return new JSONObject(str).optString(Scopes.EMAIL);
        }

        /* renamed from: b */
        public final String mo63141b(String str) {
            String str2;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://www.googleapis.com/oauth2/v1/userinfo?access_token=" + str).openConnection();
            httpURLConnection.setRequestProperty("Charset", "UTF-8");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(20000);
            httpURLConnection.setReadTimeout(20000);
            int responseCode = httpURLConnection.getResponseCode();
            Log.m105920e("MicroMsg.GoogleContact.BindGoogleContactUI", "responseCode:" + responseCode);
            if (200 == responseCode) {
                StringBuffer stringBuffer = new StringBuffer();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    stringBuffer.append(readLine);
                }
                bufferedReader.close();
                str2 = stringBuffer.toString();
                Log.m105925i("MicroMsg.GoogleContact.BindGoogleContactUI", "get EmailAccount respone:%s", str2);
            } else {
                str2 = "";
            }
            try {
                httpURLConnection.getInputStream().close();
            } catch (Exception e) {
                Log.m105920e("MicroMsg.GoogleContact.BindGoogleContactUI", e.getMessage());
            }
            httpURLConnection.disconnect();
            return str2;
        }

        public Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            Log.m105924i("MicroMsg.GoogleContact.BindGoogleContactUI", "doInBackground");
            try {
                String a = mo63140a(mo63141b(this.f108567a));
                this.f108568b = a;
                if (TextUtils.isEmpty(a)) {
                    return null;
                }
                this.f108569c = true;
                return null;
            } catch (MalformedURLException e) {
                Log.m105921e("MicroMsg.GoogleContact.BindGoogleContactUI", "MalformedURLException:%s", e.getMessage());
                return null;
            } catch (ProtocolException e2) {
                Log.m105921e("MicroMsg.GoogleContact.BindGoogleContactUI", "ProtocolException:%s", e2.getMessage());
                return null;
            } catch (UnsupportedEncodingException e3) {
                Log.m105921e("MicroMsg.GoogleContact.BindGoogleContactUI", "UnsupportedEncodingException:%s", e3.getMessage());
                return null;
            } catch (IOException e4) {
                Log.m105921e("MicroMsg.GoogleContact.BindGoogleContactUI", "IOException:%s", e4.getMessage());
                return null;
            } catch (JSONException e5) {
                Log.printErrStackTrace("MicroMsg.GoogleContact.BindGoogleContactUI", e5, "", new Object[0]);
                return null;
            }
        }

        public void onPostExecute(Object obj) {
            super.onPostExecute((Void) obj);
            Log.m105924i("MicroMsg.GoogleContact.BindGoogleContactUI", "onPostExecute");
            BindGoogleContactUI bindGoogleContactUI = BindGoogleContactUI.this;
            boolean z = this.f108569c;
            String str = this.f108568b;
            if (z) {
                bindGoogleContactUI.getClass();
                if (!TextUtils.isEmpty(str)) {
                    if (TextUtils.isEmpty(bindGoogleContactUI.f108554g) || TextUtils.isEmpty(str) || bindGoogleContactUI.f108554g.equalsIgnoreCase(str)) {
                        bindGoogleContactUI.f108554g = str;
                        bindGoogleContactUI.mo63131I7(0);
                        return;
                    }
                    bindGoogleContactUI.mo63132J7();
                    C76879j.m92750u(bindGoogleContactUI, bindGoogleContactUI.getString(C0966R.string.fdk), "", new C45912b(bindGoogleContactUI, str), new C8275c(bindGoogleContactUI));
                    return;
                }
            }
            bindGoogleContactUI.mo63132J7();
            bindGoogleContactUI.mo63134L7();
        }

        public void onPreExecute() {
            super.onPreExecute();
            Log.m105924i("MicroMsg.GoogleContact.BindGoogleContactUI", "onPreExecute");
            this.f108569c = false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI$f */
    public class C40401f extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        public String f108571a;

        /* renamed from: b */
        public String f108572b;

        /* renamed from: c */
        public String f108573c;

        /* renamed from: d */
        public boolean f108574d;

        public C40401f(String str) {
            this.f108571a = str;
        }

        /* renamed from: a */
        public final String mo63145a(String str) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/token").openConnection();
            httpURLConnection.setRequestProperty("Charset", "UTF-8");
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setConnectTimeout(20000);
            httpURLConnection.setReadTimeout(20000);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("code", str));
            arrayList.add(new BasicNameValuePair("client_id", "369820936870.apps.googleusercontent.com"));
            arrayList.add(new BasicNameValuePair("client_secret", "wcFhvo-s7wNcmQ9Zjr00H06u"));
            arrayList.add(new BasicNameValuePair("redirect_uri", "urn:ietf:wg:oauth:2.0:oob"));
            arrayList.add(new BasicNameValuePair("grant_type", "authorization_code"));
            String a = C8524u.m8418a(arrayList);
            Log.m105925i("MicroMsg.GoogleContact.BindGoogleContactUI", "QueryString:%s", a);
            int length = a.getBytes().length;
            StringBuilder sb = new StringBuilder();
            sb.append(length);
            String str2 = "";
            sb.append(str2);
            httpURLConnection.setRequestProperty("Content-length", sb.toString());
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8"));
            bufferedWriter.write(a);
            bufferedWriter.flush();
            bufferedWriter.close();
            int responseCode = httpURLConnection.getResponseCode();
            Log.m105920e("MicroMsg.GoogleContact.BindGoogleContactUI", "responseCode:" + responseCode);
            if (200 == responseCode) {
                StringBuffer stringBuffer = new StringBuffer();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    stringBuffer.append(readLine);
                }
                bufferedReader.close();
                str2 = stringBuffer.toString();
                Log.m105925i("MicroMsg.GoogleContact.BindGoogleContactUI", "exchange token respone:%s", str2);
            }
            try {
                httpURLConnection.getInputStream().close();
            } catch (Exception e) {
                Log.m105920e("MicroMsg.GoogleContact.BindGoogleContactUI", e.getMessage());
            }
            httpURLConnection.disconnect();
            return str2;
        }

        /* renamed from: b */
        public final String mo63146b(String str) {
            return new JSONObject(str).optString("access_token");
        }

        /* renamed from: c */
        public final String mo63147c(String str) {
            return new JSONObject(str).optString("refresh_token");
        }

        public Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            try {
                String a = mo63145a(this.f108571a);
                this.f108572b = mo63146b(a);
                this.f108573c = mo63147c(a);
                Log.m105925i("MicroMsg.GoogleContact.BindGoogleContactUI", "response:%s", a);
                Log.m105925i("MicroMsg.GoogleContact.BindGoogleContactUI", "mAccessToken:%s", this.f108572b);
                Log.m105925i("MicroMsg.GoogleContact.BindGoogleContactUI", "mRefreshToken:%s", this.f108573c);
                this.f108574d = true;
                return null;
            } catch (MalformedURLException e) {
                Log.m105920e("MicroMsg.GoogleContact.BindGoogleContactUI", "MalformedURLException:%s" + e.getMessage());
                return null;
            } catch (ProtocolException e2) {
                Log.m105920e("MicroMsg.GoogleContact.BindGoogleContactUI", "ProtocolException:%s" + e2.getMessage());
                return null;
            } catch (IOException e3) {
                Log.m105920e("MicroMsg.GoogleContact.BindGoogleContactUI", "IOException:%s" + e3.getMessage());
                return null;
            } catch (JSONException e4) {
                Log.m105920e("MicroMsg.GoogleContact.BindGoogleContactUI", "JSONException:%s" + e4.getMessage());
                return null;
            }
        }

        public void onPostExecute(Object obj) {
            super.onPostExecute((Void) obj);
            Log.m105924i("MicroMsg.GoogleContact.BindGoogleContactUI", "onPostExecute");
            BindGoogleContactUI bindGoogleContactUI = BindGoogleContactUI.this;
            boolean z = this.f108574d;
            String str = this.f108572b;
            String str2 = this.f108573c;
            if (z) {
                bindGoogleContactUI.getClass();
                if (!TextUtils.isEmpty(str)) {
                    bindGoogleContactUI.f108556i = str;
                    bindGoogleContactUI.f108557j = str2;
                    new C40400e(str).execute(new Void[0]);
                    return;
                }
            }
            bindGoogleContactUI.mo63132J7();
            bindGoogleContactUI.mo63134L7();
        }

        public void onPreExecute() {
            super.onPreExecute();
            Log.m105924i("MicroMsg.GoogleContact.BindGoogleContactUI", "onPreExecute");
            this.f108572b = "";
            this.f108573c = "";
            this.f108574d = false;
        }
    }

    /* renamed from: H7 */
    public static void m43583H7(BindGoogleContactUI bindGoogleContactUI, String str) {
        bindGoogleContactUI.getClass();
        String substring = str.substring(30);
        Log.m105918d("MicroMsg.GoogleContact.BindGoogleContactUI", "keep_GET_TOKEN_CODE value:" + substring);
        bindGoogleContactUI.mo63135M7();
        new C40401f(substring).execute(new Void[0]);
        Log.m105918d("MicroMsg.GoogleContact.BindGoogleContactUI", "keep_GET_TOKEN_CODE End.");
    }

    /* renamed from: I7 */
    public final void mo63131I7(int i) {
        this.f108559o = new C8522h0(C8522h0.C8523a.MM_BIND_GCONTACT_OPCODE_BIND, this.f108554g, i);
        C86709a0.m107524d().mo123460f(this.f108559o);
        Log.m105925i("MicroMsg.GoogleContact.BindGoogleContactUI", "doScene mAppToken:%s, mWebToke:%s", this.f108555h, this.f108556i);
    }

    /* renamed from: J7 */
    public final void mo63132J7() {
        ProgressDialog progressDialog = this.f108558n;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f108558n.dismiss();
        }
    }

    /* renamed from: K7 */
    public final void mo63133K7() {
        mo63135M7();
        this.f108552e.getSettings().setJavaScriptEnabled(true);
        this.f108552e.setWebViewClient(new C40397b());
        this.f108552e.setWebChromeClient(new C40398c());
        MMWebView mMWebView = this.f108552e;
        Log.m105925i("MicroMsg.GoogleContactLogic", "getRequestCodeUrl:%s", "https://accounts.google.com/o/oauth2/auth?scope=https://www.googleapis.com/auth/userinfo.email https://www.google.com/m8/feeds&redirect_uri=urn:ietf:wg:oauth:2.0:oob&response_type=code&client_id=369820936870.apps.googleusercontent.com");
        mMWebView.loadUrl("https://accounts.google.com/o/oauth2/auth?scope=https://www.googleapis.com/auth/userinfo.email https://www.google.com/m8/feeds&redirect_uri=urn:ietf:wg:oauth:2.0:oob&response_type=code&client_id=369820936870.apps.googleusercontent.com");
    }

    /* renamed from: L7 */
    public final void mo63134L7() {
        MMWebView mMWebView = this.f108552e;
        if (mMWebView != null) {
            mMWebView.setVisibility(4);
        }
        TextView textView = this.f108553f;
        if (textView != null) {
            textView.setVisibility(0);
        }
        this.f108553f.setText(!NetStatusUtil.isConnected((Context) this) ? getString(C0966R.string.fdl) : getString(C0966R.string.fdd));
    }

    /* renamed from: M7 */
    public final void mo63135M7() {
        ProgressDialog progressDialog = this.f108558n;
        if (progressDialog == null || !progressDialog.isShowing()) {
            this.f108558n = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, new C40399d());
        }
    }

    /* renamed from: N7 */
    public void mo63136N7() {
        if (this.f108551d) {
            this.f108552e.setVisibility(8);
            mo63135M7();
            startActivityForResult(new Intent("com.tencent.mm.gms.ACTION_CHOOSE_ACCOUNT"), 1003);
            return;
        }
        this.f108553f.setVisibility(4);
        this.f108552e.setVisibility(0);
        mo63133K7();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6569il;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.fdc);
        setBackBtn(new C40396a());
        MMWebView mMWebView = (MMWebView) findViewById(C0966R.C0970id.eoz);
        mMWebView.getClass();
        this.f108552e = mMWebView;
        this.f108553f = (TextView) findViewById(C0966R.C0970id.cig);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105925i("MicroMsg.GoogleContact.BindGoogleContactUI", "requestCode:%d, resultCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i2 == -1) {
            switch (i) {
                case 1003:
                    int intExtra = intent.getIntExtra(StateEvent.Name.ERROR_CODE, -1);
                    Log.m105925i("MicroMsg.GoogleContact.BindGoogleContactUI", "errorCode:%d ", Integer.valueOf(intExtra));
                    if (intExtra == 0) {
                        this.f108554g = intent.getStringExtra("account");
                        if (this.f108560p) {
                            mo63132J7();
                            return;
                        }
                        Log.m105918d("MicroMsg.GoogleContact.BindGoogleContactUI", "startAcitivtyForGetToken");
                        Intent intent2 = new Intent("com.tencent.mm.gms.ACTION_GET_TOKEN");
                        intent2.putExtra("gmail", this.f108554g);
                        intent2.putExtra("scope", "oauth2:https://www.googleapis.com/auth/userinfo.email https://www.google.com/m8/feeds");
                        startActivityForResult(intent2, 1004);
                        return;
                    }
                    mo63132J7();
                    mo63134L7();
                    return;
                case 1004:
                    int intExtra2 = intent.getIntExtra(StateEvent.Name.ERROR_CODE, -1);
                    Log.m105925i("MicroMsg.GoogleContact.BindGoogleContactUI", "errorCode:%d errorMsg:%s", Integer.valueOf(intExtra2), intent.getStringExtra("error_msg"));
                    if (intExtra2 == 0) {
                        this.f108555h = intent.getStringExtra(XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
                        mo63131I7(0);
                        return;
                    } else if (intExtra2 == -3) {
                        mo63132J7();
                        mo63134L7();
                        return;
                    } else {
                        mo63132J7();
                        mo63134L7();
                        return;
                    }
                case 1005:
                    this.f108551d = intent.getBooleanExtra("gpservices", false);
                    mo63136N7();
                    return;
                default:
                    return;
            }
        } else if (i == 1005) {
            this.f108551d = intent.getBooleanExtra("gpservices", false);
            mo63136N7();
        } else {
            mo63132J7();
            mo63134L7();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f108561q = getIntent().getIntExtra("enter_scene", 0);
        this.f108562r = getIntent().getBooleanExtra("KEnterFromBanner", false);
        this.f108551d = C8524u.m8419b(this);
        this.f108554g = (String) C86709a0.m107535s().mo121142i().mo119684e(208903, (Object) null);
        initView();
        if (this.f108551d) {
            startActivityForResult(new Intent("com.tencent.mm.gms.CHECK_GP_SERVICES"), 1005);
        } else {
            mo63136N7();
        }
    }

    public void onPause() {
        super.onPause();
        C86709a0.m107524d().mo123470p(487, this);
    }

    public void onResume() {
        super.onResume();
        C86709a0.m107524d().mo123455a(487, this);
        C85801v1 i = C86709a0.m107535s().mo121142i();
        Boolean bool = Boolean.FALSE;
        if (((Boolean) i.mo119684e(208905, bool)).booleanValue()) {
            try {
                CookieManager.getInstance().removeAllCookie();
            } catch (Exception unused) {
                Log.m105918d("Google Login", "Clear cookie failed");
            }
            C86709a0.m107535s().mo121142i().mo119676J(208905, bool);
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        objArr[2] = str;
        Log.m105925i("MicroMsg.GoogleContact.BindGoogleContactUI", "[onSceneEnd] errType:%d,errCode:%d,errMsg:%s", objArr);
        mo63132J7();
        if (i == 0 && i2 == 0) {
            if (this.f108551d) {
                C86709a0.m107535s().mo121142i().mo119676J(208903, this.f108554g);
                C86709a0.m107535s().mo121142i().mo119676J(208901, this.f108555h);
            } else {
                C86709a0.m107535s().mo121142i().mo119676J(208903, this.f108554g);
                C86709a0.m107535s().mo121142i().mo119676J(208902, this.f108556i);
                C86709a0.m107535s().mo121142i().mo119676J(208904, this.f108557j);
            }
            C86709a0.m107535s().mo121142i().mo119681a(true);
            Intent intent = new Intent(this, GoogleFriendUI.class);
            intent.putExtra("enter_scene", this.f108561q);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/account/bind/ui/BindGoogleContactUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/account/bind/ui/BindGoogleContactUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
            if (this.f108562r) {
                C115669n.INSTANCE.mo160131h(ErrorCode.ERROR_OUTOF_MEMORY, 6, 6);
            }
        } else if (i2 == -85) {
            C76879j.m92750u(this, getString(C0966R.string.fdj), "", new C45914d(this), new C45915e(this));
        } else {
            mo63134L7();
        }
    }
}
