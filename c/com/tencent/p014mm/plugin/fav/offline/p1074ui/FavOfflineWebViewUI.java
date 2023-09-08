package com.tencent.p014mm.plugin.fav.offline.p1074ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import cc1.C92413a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.fav.p047ui.C93594f1;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;
import dc1.C7262a;
import di3.C86312j;
import java.io.IOException;
import java.util.LinkedList;
import ke3.C88144b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import pb1.C100703e0;
import pb1.C100718j1;
import pb1.C100734q;
import pb1.C100755z;
import qo3.C77407n;
import te3.C101756ae0;
import te3.C101801kd0;
import xb1.C102614d;
import yb1.C38987b;

/* renamed from: com.tencent.mm.plugin.fav.offline.ui.FavOfflineWebViewUI */
public class FavOfflineWebViewUI extends MMActivity {

    /* renamed from: d */
    public MMWebView f269600d;

    /* renamed from: e */
    public String f269601e;

    /* renamed from: f */
    public C100755z f269602f;

    /* renamed from: g */
    public C92413a f269603g;

    /* renamed from: h */
    public C7262a f269604h;

    /* renamed from: i */
    public boolean f269605i = true;

    /* renamed from: com.tencent.mm.plugin.fav.offline.ui.FavOfflineWebViewUI$a */
    public class C93397a implements MenuItem.OnMenuItemClickListener {
        public C93397a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            FavOfflineWebViewUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.offline.ui.FavOfflineWebViewUI$b */
    public class C93398b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.fav.offline.ui.FavOfflineWebViewUI$b$a */
        public class C93399a implements C11182m0 {
            public C93399a() {
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.mo107150j(2, FavOfflineWebViewUI.this.getString(C0966R.string.cmq), C0966R.raw.icons_filled_share, FavOfflineWebViewUI.this.getResources().getColor(C0966R.color.f2939n), false);
                e0Var.mo107151k(3, FavOfflineWebViewUI.this.getString(C0966R.string.cmr), C0966R.raw.bottomsheet_icon_moment, false);
            }
        }

        /* renamed from: com.tencent.mm.plugin.fav.offline.ui.FavOfflineWebViewUI$b$b */
        public class C93400b implements C11182m0 {
            public C93400b(C93398b bVar) {
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.mo107135b(0, C0966R.string.cmp, C0966R.raw.bottomsheet_icon_addtag);
                e0Var.mo107135b(1, C0966R.string.cmo, C0966R.raw.bottomsheet_icon_del);
            }
        }

        /* renamed from: com.tencent.mm.plugin.fav.offline.ui.FavOfflineWebViewUI$b$c */
        public class C93401c implements C11184p0 {
            public C93401c() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                String str;
                Intent intent = new Intent();
                int itemId = menuItem.getItemId();
                if (itemId == 2) {
                    new LinkedList().add(FavOfflineWebViewUI.this.f269602f);
                    intent.putExtra("Select_Conv_Type", 3);
                    intent.putExtra("scene_from", 1);
                    intent.putExtra("mutil_select_is_ret", true);
                    intent.putExtra("select_fav_local_id", FavOfflineWebViewUI.this.f269602f.field_localId);
                    intent.putExtra("Retr_Msg_Type", 2);
                    C88144b.m109802t(FavOfflineWebViewUI.this, ".ui.transmit.SelectConversationUI", intent, 1);
                } else if (itemId == 3) {
                    C101801kd0 kd02 = FavOfflineWebViewUI.this.f269602f.field_favProto;
                    C101756ae0 ae02 = kd02.f298622j;
                    String str2 = "";
                    if (ae02 != null) {
                        String str3 = kd02.f298626q;
                        if (!Util.isNullOrNil(ae02.f297863d)) {
                            str3 = ae02.f297863d;
                        }
                        str2 = str3;
                        str = ae02.f297869j;
                    } else {
                        str = str2;
                    }
                    intent.putExtra("Ksnsupload_link", FavOfflineWebViewUI.this.f269601e);
                    intent.putExtra("Ksnsupload_title", str2);
                    intent.putExtra("Ksnsupload_imgurl", str);
                    intent.putExtra("Ksnsupload_imgbuf", C86013q1.m106433O(C100734q.m131826Q(C100734q.m131813D(FavOfflineWebViewUI.this.f269602f)), 0, -1));
                    intent.putExtra("Ksnsupload_type", 1);
                    intent.putExtra("need_result", true);
                    C88144b.m109796n(FavOfflineWebViewUI.this, "sns", ".ui.SnsUploadUI", intent, 2, false);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.fav.offline.ui.FavOfflineWebViewUI$b$d */
        public class C93402d implements C11184p0 {
            public C93402d() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                Intent intent = new Intent();
                int itemId = menuItem.getItemId();
                if (itemId == 0) {
                    intent.putExtra("key_fav_scene", 4);
                    intent.putExtra("key_fav_item_id", FavOfflineWebViewUI.this.f269602f.field_localId);
                    C100734q.m131875t0(FavOfflineWebViewUI.this.getContext(), ".ui.FavTagEditUI", intent, (Bundle) null);
                } else if (itemId == 1) {
                    C100734q.m131858l(FavOfflineWebViewUI.this.f269602f, (Runnable) null, 3);
                    FavOfflineWebViewUI.this.finish();
                }
            }
        }

        public C93398b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105918d("MicroMsg.offline.FavOfflineWebViewUI", "onMenuItemClick click");
            C77407n nVar = new C77407n((Context) FavOfflineWebViewUI.this.getContext(), 0, false);
            nVar.f225771i = new C93399a();
            nVar.f225773j = new C93400b(this);
            nVar.f225782p = new C93401c();
            nVar.f225787r = new C93402d();
            nVar.mo107573q();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.offline.ui.FavOfflineWebViewUI$c */
    public class C93403c extends WebViewClient {
        public C93403c() {
        }

        public void onPageFinished(WebView webView, String str) {
            Log.m105918d("MicroMsg.offline.FavOfflineWebViewUI", "onPageFinished URL:" + str);
            if (webView != null && FavOfflineWebViewUI.this.f269605i) {
                webView.evaluateJavascript("javascript:function setJsAcion(){document.querySelectorAll('img').forEach(function(img){img.addEventListener('click',function(){window.java_obj.doImgPreview(img.src)}) });var div = document.createElement('div');\ndiv.innerHTML = '<div style=\"padding: 8px 16px 4px;background: #FFFFFF;\"><div style=\"padding:12px 16px;background: #F7F7F7;-webkit-border-radius:4px;border-radius:4px;color: rgba(0,0,0,.5);font-size:17px;line-height:1.4;\">当前网络不可用，正在使用离线模式阅读</div></div>';\nvar parentNode = document.getElementById('js_article');\nvar oldNode = document.getElementsByClassName('rich_media_inner')[0];\nparentNode.insertBefore(div.firstChild, oldNode);}", (ValueCallback<String>) null);
                webView.evaluateJavascript("javascript:setJsAcion()", (ValueCallback<String>) null);
                FavOfflineWebViewUI.this.f269605i = false;
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.offline.ui.FavOfflineWebViewUI$d */
    public class C93404d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Dialog f269612d;

        public C93404d(Dialog dialog) {
            this.f269612d = dialog;
        }

        public void run() {
            this.f269612d.dismiss();
            FavOfflineWebViewUI favOfflineWebViewUI = FavOfflineWebViewUI.this;
            C75026b.m89951a(favOfflineWebViewUI, favOfflineWebViewUI.getString(C0966R.string.cmm));
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a75;
    }

    public void initView() {
        super.initView();
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        setBackGroundColorResource(C0966R.color.al6);
        setBackBtn(new C93397a(), C0966R.raw.actionbar_icon_dark_close);
        addIconOptionMenu(0, C0966R.raw.actionbar_icon_dark_more, new C93398b());
        MMWebView mMWebView = (MMWebView) getContentView().findViewById(C0966R.C0970id.lm8);
        mMWebView.getClass();
        this.f269600d = mMWebView;
        FrameLayout frameLayout = (FrameLayout) findViewById(C0966R.C0970id.eui);
        this.f269600d.getSettings().setJavaScriptEnabled(true);
        this.f269600d.getSettings().setAllowFileAccess(true);
        this.f269600d.addJavascriptInterface(this.f269604h, "java_obj");
        this.f269600d.setWebViewClient(new C93403c());
        String uri = FileProviderHelper.getUriForFile(getContext(), new C86009m1(C86013q1.m106448i(C86013q1.m106448i(this.f269603g.field_path, false), false))).toString();
        Log.m105919d("MicroMsg.offline.FavOfflineWebViewUI", "basePath:%s", uri);
        try {
            this.f269600d.loadDataWithBaseURL(uri, C86013q1.m106432N(this.f269603g.field_path), "text/html", "utf-8", (String) null);
        } catch (IOException unused) {
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            String stringExtra = intent.getStringExtra("Select_Conv_User");
            Log.m105919d("MicroMsg.offline.FavOfflineWebViewUI", "select %s for sending", stringExtra);
            if (!Util.isNullOrNil(stringExtra)) {
                if (new C100703e0().mo140134c(this.f269602f)) {
                    Log.m105924i("MicroMsg.offline.FavOfflineWebViewUI", "[onActivityResult], FavSendFilter filter true");
                    C76879j.m92726T(getApplicationContext(), getString(C0966R.string.cqy));
                    return;
                }
                LinkedList linkedList = new LinkedList();
                linkedList.add(this.f269602f);
                C93594f1.m118180h(getContext(), stringExtra, intent.getStringExtra("custom_send_text"), linkedList, new C93404d(C76879j.m92723Q(getContext(), "", getString(C0966R.string.col), true, false, (DialogInterface.OnCancelListener) null)));
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f269601e = getIntent().getStringExtra("key_path");
        long longExtra = getIntent().getLongExtra("key_detail_info_id", 0);
        if (longExtra == 0) {
            Log.m105920e("MicroMsg.offline.FavOfflineWebViewUI", "favLocalId is 0l!!!");
            finish();
            return;
        }
        C92413a Lo = ((C38987b) C86312j.m106911c(C38987b.class)).wx0().mo126415Lo(this.f269601e);
        this.f269603g = Lo;
        if (Lo == null) {
            Log.m105920e("MicroMsg.offline.FavOfflineWebViewUI", "favOffline is null!!!");
            finish();
            return;
        }
        C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142266Yt(longExtra);
        this.f269602f = Yt;
        if (Yt == null) {
            Log.m105920e("MicroMsg.offline.FavOfflineWebViewUI", "curInfo is null!!!");
            finish();
            return;
        }
        Log.m105925i("MicroMsg.offline.FavOfflineWebViewUI", "mUrl : %s", this.f269601e);
        if (Util.isNullOrNil(this.f269601e)) {
            Log.m105920e("MicroMsg.offline.FavOfflineWebViewUI", "mUrl is null!!!");
            finish();
            return;
        }
        this.f269604h = new C7262a(this, this.f269603g);
        initView();
    }
}
