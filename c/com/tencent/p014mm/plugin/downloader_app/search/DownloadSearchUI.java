package com.tencent.p014mm.plugin.downloader_app.search;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wechat.aff.ting.TingClientProto;
import g51.C45880a;

/* renamed from: com.tencent.mm.plugin.downloader_app.search.DownloadSearchUI */
public class DownloadSearchUI extends MMActivity implements C106742j1.C106756o {

    /* renamed from: d */
    public DownloadSearchListView f110405d;

    /* renamed from: e */
    public ProgressBar f110406e;

    /* renamed from: f */
    public TextView f110407f;

    /* renamed from: g */
    public C106742j1 f110408g;

    /* renamed from: h */
    public String f110409h;

    /* renamed from: i */
    public boolean f110410i;

    /* renamed from: com.tencent.mm.plugin.downloader_app.search.DownloadSearchUI$a */
    public class C41018a implements MRecyclerView.C40583d {
        public C41018a() {
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|15|18|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
            r8 = "";
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0048 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo23073a(androidx.recyclerview.widget.RecyclerView r8, android.view.View r9, int r10, long r11) {
            /*
                r7 = this;
                com.tencent.mm.plugin.downloader_app.search.DownloadSearchUI r8 = com.tencent.p014mm.plugin.downloader_app.search.DownloadSearchUI.this
                com.tencent.mm.plugin.downloader_app.search.DownloadSearchListView r8 = r8.f110405d
                h51.a r8 = r8.f110400D1
                java.util.ArrayList<h51.e> r8 = r8.f124054f
                if (r8 == 0) goto L_0x0019
                if (r10 < 0) goto L_0x0019
                int r9 = r8.size()
                if (r10 >= r9) goto L_0x0019
                java.lang.Object r8 = r8.get(r10)
                h51.e r8 = (h51.C46012e) r8
                goto L_0x001a
            L_0x0019:
                r8 = 0
            L_0x001a:
                if (r8 != 0) goto L_0x001d
                return
            L_0x001d:
                int r9 = r8.f124081a
                r10 = 2
                if (r9 != r10) goto L_0x005f
                com.tencent.mm.plugin.downloader_app.search.DownloadSearchUI r9 = com.tencent.p014mm.plugin.downloader_app.search.DownloadSearchUI.this
                com.tencent.mm.plugin.downloader_app.search.DownloadSearchListView r9 = r9.f110405d
                java.lang.String r10 = r8.f124082b
                r9.mo64046B1(r10)
                com.tencent.mm.plugin.downloader_app.search.DownloadSearchUI r9 = com.tencent.p014mm.plugin.downloader_app.search.DownloadSearchUI.this
                com.tencent.mm.ui.tools.j1 r9 = r9.f110408g
                java.lang.String r10 = r8.f124082b
                r9.mo23884r(r10)
                r0 = 13
                r1 = 1302(0x516, float:1.824E-42)
                int r2 = r8.f124090j
                r3 = 2
                java.lang.String r8 = r8.f124082b
                java.lang.String r9 = "search_key_word"
                org.json.JSONObject r10 = new org.json.JSONObject
                r10.<init>()
                r10.put(r9, r8)     // Catch:{ JSONException -> 0x0048 }
            L_0x0048:
                java.lang.String r8 = r10.toString()     // Catch:{ UnsupportedEncodingException -> 0x0054 }
                java.lang.String r9 = "utf-8"
                java.lang.String r8 = java.net.URLEncoder.encode(r8, r9)     // Catch:{ UnsupportedEncodingException -> 0x0054 }
                goto L_0x0056
            L_0x0054:
                java.lang.String r8 = ""
            L_0x0056:
                r6 = r8
                java.lang.String r4 = ""
                java.lang.String r5 = ""
                g51.C45880a.m51163b(r0, r1, r2, r3, r4, r5, r6)
                goto L_0x00a6
            L_0x005f:
                r10 = 3
                if (r9 != r10) goto L_0x00a6
                com.tencent.mm.plugin.downloader_app.search.DownloadSearchUI r9 = com.tencent.p014mm.plugin.downloader_app.search.DownloadSearchUI.this
                com.tencent.mm.plugin.downloader_app.search.DownloadSearchListView r10 = r9.f110405d
                com.tencent.mm.ui.tools.j1 r9 = r9.f110408g
                java.lang.String r9 = r9.mo153855g()
                r10.mo64046B1(r9)
                java.lang.String r9 = r8.f124089i
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r9 != 0) goto L_0x0095
                android.os.Bundle r9 = new android.os.Bundle
                r9.<init>()
                java.lang.String r10 = r8.f124089i
                java.lang.String r11 = "rawUrl"
                r9.putString(r11, r10)
                java.lang.Class<e51.h> r10 = e51.C45547h.class
                di3.d r10 = di3.C86312j.m106911c(r10)
                e51.h r10 = (e51.C45547h) r10
                com.tencent.mm.plugin.downloader_app.search.DownloadSearchUI r11 = com.tencent.p014mm.plugin.downloader_app.search.DownloadSearchUI.this
                androidx.appcompat.app.AppCompatActivity r11 = r11.getContext()
                r10.mo70790RH(r11, r9)
            L_0x0095:
                r0 = 13
                r1 = 1303(0x517, float:1.826E-42)
                int r2 = r8.f124090j
                r3 = 40
                java.lang.String r4 = r8.f124084d
                java.lang.String r5 = ""
                java.lang.String r6 = ""
                g51.C45880a.m51163b(r0, r1, r2, r3, r4, r5, r6)
            L_0x00a6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.downloader_app.search.DownloadSearchUI.C41018a.mo23073a(androidx.recyclerview.widget.RecyclerView, android.view.View, int, long):void");
        }
    }

    /* renamed from: H5 */
    public void mo1321H5() {
        Log.m105924i("MicroMsg.DownloadSearchUI", "onQuitSearch");
        hideVKB();
        onBackPressed();
    }

    /* renamed from: S6 */
    public boolean mo1322S6(String str) {
        Log.m105924i("MicroMsg.DownloadSearchUI", "onSearchKeyDown");
        if (Util.isNullOrNil(str)) {
            return true;
        }
        this.f110405d.mo64046B1(str);
        return true;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7153zx;
    }

    /* renamed from: i7 */
    public void mo1323i7() {
        Log.m105924i("MicroMsg.DownloadSearchUI", "onEnterSearch");
    }

    public void initView() {
        super.initView();
        this.f110405d = (DownloadSearchListView) findViewById(C0966R.C0970id.j6t);
        this.f110406e = (ProgressBar) findViewById(C0966R.C0970id.j6q);
        this.f110407f = (TextView) findViewById(C0966R.C0970id.hgp);
        C106742j1 j1Var = new C106742j1();
        this.f110408g = j1Var;
        j1Var.mo153851c(true);
        this.f110408g.f319122j = this;
        this.f110405d.setOnItemClickListener(new C41018a());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|11|12|13|16|17) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009e, code lost:
        r11 = "";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0092 */
    /* renamed from: l3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1324l3(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = "MicroMsg.DownloadSearchUI"
            java.lang.String r1 = "onSearchChange"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            android.widget.TextView r1 = r10.f110407f
            r2 = 8
            r1.setVisibility(r2)
            java.lang.String r1 = r10.f110409h
            if (r1 == 0) goto L_0x0024
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0024
            java.lang.String r11 = "repeat searchChange"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r11)
            return
        L_0x0024:
            r10.f110409h = r11
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r0 == 0) goto L_0x003a
            android.widget.ProgressBar r11 = r10.f110406e
            r11.setVisibility(r2)
            com.tencent.mm.plugin.downloader_app.search.DownloadSearchListView r11 = r10.f110405d
            r11.mo64050F1()
            r11 = 1
            r10.f110410i = r11
            goto L_0x00a8
        L_0x003a:
            com.tencent.mm.plugin.downloader_app.search.DownloadSearchListView r0 = r10.f110405d
            r0.mo64049E1()
            r0 = 0
            r10.f110410i = r0
            com.tencent.mm.plugin.downloader_app.search.DownloadSearchListView r1 = r10.f110405d
            r1.mo64049E1()
            android.widget.ProgressBar r1 = r10.f110406e
            r1.setVisibility(r0)
            ob0.c$b r1 = new ob0.c$b
            r1.<init>()
            u41.r r2 = new u41.r
            r2.<init>()
            r2.f146542d = r11
            u41.v r3 = new u41.v
            r3.<init>()
            r3.f146553d = r0
            r4 = 5
            r3.f146554e = r4
            r2.f146543e = r3
            r1.f127066a = r2
            u41.s r2 = new u41.s
            r2.<init>()
            r1.f127067b = r2
            java.lang.String r2 = "/cgi-bin/mmgame-bin/getgamesearch"
            r1.f127068c = r2
            r2 = 2688(0xa80, float:3.767E-42)
            r1.f127069d = r2
            ob0.c r1 = r1.mo72403a()
            h51.d r2 = new h51.d
            r2.<init>(r10, r11)
            ob0.C89144l0.m111429e(r1, r2, r0)
            r3 = 13
            r4 = 1301(0x515, float:1.823E-42)
            r5 = 1
            r6 = 2
            java.lang.String r0 = "search_key_word"
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r1.put(r0, r11)     // Catch:{ JSONException -> 0x0092 }
        L_0x0092:
            java.lang.String r11 = r1.toString()     // Catch:{ UnsupportedEncodingException -> 0x009e }
            java.lang.String r0 = "utf-8"
            java.lang.String r11 = java.net.URLEncoder.encode(r11, r0)     // Catch:{ UnsupportedEncodingException -> 0x009e }
            goto L_0x00a0
        L_0x009e:
            java.lang.String r11 = ""
        L_0x00a0:
            r9 = r11
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            g51.C45880a.m51163b(r3, r4, r5, r6, r7, r8, r9)
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.downloader_app.search.DownloadSearchUI.mo1324l3(java.lang.String):void");
    }

    /* renamed from: l5 */
    public void mo1325l5() {
        Log.m105924i("MicroMsg.DownloadSearchUI", "onClickClearText");
        C45880a.m51163b(13, TingClientProto.TingScene.TingScene_ChatHistory_VALUE, 2, 81, "", "", "");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        C45880a.m51163b(13, 0, 0, 1, "", "", "");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.f110408g.mo23882j(this, menu);
        this.f110408g.mo153859q(getString(C0966R.string.c2c));
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        this.f110408g.mo153858m(this, menu);
        return true;
    }

    /* renamed from: y4 */
    public void mo1326y4() {
        Log.m105924i("MicroMsg.DownloadSearchUI", "onSearchEditTextReady");
    }
}
