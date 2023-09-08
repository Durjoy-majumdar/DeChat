package com.tencent.p014mm.plugin.websearch.p898ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct;
import com.tencent.p014mm.modelimage.C92822e;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import f83.C97845a;
import f83.C97847b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kg3.C76577a;
import kotlin.Metadata;
import kv1.C99252h;
import o40.C61926c;
import ob0.C117747y;
import p158gt.C76051j;
import p158gt.C98201k;
import p206nj.C117627q;
import p823sg.C90193h;
import rx3.C13598b0;
import sk2.C101643c;
import sk2.C101645e;
import sk2.C101647f;
import sk2.C101648g;
import te3.C48884bn2;
import te3.C64421he;
import te3.C64852yd;
import u73.C101982p;
import u73.C101987v0;
import u73.C14134p0;
import u73.C22613h1;
import zt3.C119157j;
import zt3.C119179t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/websearch/ui/WebSearchImageLoadingUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "ui-websearch_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI */
public final class WebSearchImageLoadingUI extends MMActivity {

    /* renamed from: r */
    public static final /* synthetic */ int f282836r = 0;

    /* renamed from: d */
    public final String f282837d = "MicroMsg.WebSearch.WebSearchImageLoadingUI";

    /* renamed from: e */
    public long f282838e;

    /* renamed from: f */
    public long f282839f;

    /* renamed from: g */
    public String f282840g = "";

    /* renamed from: h */
    public int f282841h;

    /* renamed from: i */
    public long f282842i;

    /* renamed from: j */
    public boolean f282843j;

    /* renamed from: n */
    public boolean f282844n;

    /* renamed from: o */
    public boolean f282845o = true;

    /* renamed from: p */
    public final C96608a f282846p = new C96608a(this);

    /* renamed from: q */
    public long f282847q;

    /* renamed from: com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI$a */
    public static final class C96608a implements C76051j.C76052a {

        /* renamed from: d */
        public final /* synthetic */ WebSearchImageLoadingUI f282848d;

        public C96608a(WebSearchImageLoadingUI webSearchImageLoadingUI) {
            this.f282848d = webSearchImageLoadingUI;
        }

        /* renamed from: T2 */
        public void mo102581T2(long j, long j2, int i, int i2, Object obj, int i3, int i4, String str, C117747y yVar) {
            Log.m105925i(this.f282848d.f282837d, "onImgTaskEnd msgId: %d, imgLocalId: %d, compressType: %d, errType %d, errCode: %d", Long.valueOf(j2), Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i4));
            WebSearchImageLoadingUI webSearchImageLoadingUI = this.f282848d;
            webSearchImageLoadingUI.f282843j = false;
            webSearchImageLoadingUI.mo134704K7(false);
        }

        /* renamed from: f0 */
        public void mo102582f0(long j, long j2, int i, int i2, Object obj, int i3, int i4, C117747y yVar) {
            Log.m105919d(this.f282848d.f282837d, "onImgTaskProgress msgId: %d, imgLocalId: %d, compressType: %d, offset: %d, totalLen: %d", Long.valueOf(j2), Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i4));
        }

        /* renamed from: x4 */
        public void mo102583x4(long j, long j2, int i, int i2, Object obj) {
            Log.m105925i(this.f282848d.f282837d, "onImgTaskCanceled msgId: %d, imgLocalId: %d", Long.valueOf(j2), Long.valueOf(j));
            this.f282848d.f282843j = false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI$b */
    public static final class C96609b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ WebSearchImageLoadingUI f282849d;

        public C96609b(WebSearchImageLoadingUI webSearchImageLoadingUI) {
            this.f282849d = webSearchImageLoadingUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            WebSearchImageLoadingUI webSearchImageLoadingUI = this.f282849d;
            int i = WebSearchImageLoadingUI.f282836r;
            webSearchImageLoadingUI.mo134701H7();
            this.f282849d.finish();
            WebSearchImageLoadingUI webSearchImageLoadingUI2 = this.f282849d;
            webSearchImageLoadingUI2.mo134702I7(11, "", webSearchImageLoadingUI2.f282840g, 0, System.currentTimeMillis());
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI$c */
    public static final class C96610c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f282850d;

        /* renamed from: e */
        public final /* synthetic */ WebSearchImageLoadingUI f282851e;

        /* renamed from: f */
        public final /* synthetic */ int f282852f;

        /* renamed from: g */
        public final /* synthetic */ String f282853g;

        /* renamed from: h */
        public final /* synthetic */ int f282854h;

        /* renamed from: i */
        public final /* synthetic */ long f282855i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96610c(String str, WebSearchImageLoadingUI webSearchImageLoadingUI, int i, String str2, int i2, long j) {
            super(0);
            this.f282850d = str;
            this.f282851e = webSearchImageLoadingUI;
            this.f282852f = i;
            this.f282853g = str2;
            this.f282854h = i2;
            this.f282855i = j;
        }

        public Object invoke() {
            String str = this.f282850d;
            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(this.f282851e.getIntent().getLongExtra("key_msg_id", 0));
            ChatImageWebSearchActionStruct chatImageWebSearchActionStruct = new ChatImageWebSearchActionStruct();
            chatImageWebSearchActionStruct.mo126609u(String.valueOf(b002.mo108774y2()));
            chatImageWebSearchActionStruct.f265370f = this.f282851e.getIntent().getIntExtra("key_source", 0);
            chatImageWebSearchActionStruct.f265369e = this.f282852f;
            chatImageWebSearchActionStruct.f265371g = 67;
            chatImageWebSearchActionStruct.mo126608t("");
            chatImageWebSearchActionStruct.mo126607s("");
            if (C72996z1.m85820U5(b002.mo108768t())) {
                chatImageWebSearchActionStruct.f265374j = 2;
            } else {
                chatImageWebSearchActionStruct.f265374j = 1;
            }
            chatImageWebSearchActionStruct.mo126611w(this.f282853g);
            chatImageWebSearchActionStruct.mo126610v(C90193h.m112876d(str));
            chatImageWebSearchActionStruct.f265378n = this.f282854h;
            chatImageWebSearchActionStruct.f265377m = this.f282855i;
            chatImageWebSearchActionStruct.mo86054n();
            C22613h1.m26490p(chatImageWebSearchActionStruct);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI$d */
    public static final class C96611d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WebSearchImageLoadingUI f282856d;

        /* renamed from: e */
        public final /* synthetic */ String f282857e;

        public C96611d(WebSearchImageLoadingUI webSearchImageLoadingUI, String str) {
            this.f282856d = webSearchImageLoadingUI;
            this.f282857e = str;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/websearch/ui/WebSearchImageLoadingUI$startImageSearch$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((MMAnimateView) this.f282856d.findViewById(C0966R.C0970id.g3d)).setVisibility(0);
            ((TextView) this.f282856d.findViewById(C0966R.C0970id.g3r)).setVisibility(0);
            ((TextView) this.f282856d.findViewById(C0966R.C0970id.f357940cl1)).setVisibility(8);
            ((Button) this.f282856d.findViewById(C0966R.C0970id.cks)).setVisibility(8);
            WebSearchImageLoadingUI webSearchImageLoadingUI = this.f282856d;
            long j = webSearchImageLoadingUI.f282838e;
            int i = webSearchImageLoadingUI.f282841h;
            String str = this.f282857e;
            C87412m.m108593f(str, "imagePath");
            webSearchImageLoadingUI.mo134703J7(j, i, str);
            C117292a.m165361g(this, "com/tencent/mm/plugin/websearch/ui/WebSearchImageLoadingUI$startImageSearch$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI$e */
    public static final class C96612e implements C101648g {

        /* renamed from: a */
        public final /* synthetic */ WebSearchImageLoadingUI f282858a;

        /* renamed from: b */
        public final /* synthetic */ String f282859b;

        /* renamed from: com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI$e$a */
        public static final class C96613a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ WebSearchImageLoadingUI f282860d;

            public C96613a(WebSearchImageLoadingUI webSearchImageLoadingUI) {
                this.f282860d = webSearchImageLoadingUI;
            }

            public final void run() {
                this.f282860d.finish();
            }
        }

        /* renamed from: com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI$e$b */
        public static final class C96614b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ WebSearchImageLoadingUI f282861d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C96614b(WebSearchImageLoadingUI webSearchImageLoadingUI) {
                super(0);
                this.f282861d = webSearchImageLoadingUI;
            }

            public Object invoke() {
                ((MMAnimateView) this.f282861d.findViewById(C0966R.C0970id.g3d)).setVisibility(8);
                ((TextView) this.f282861d.findViewById(C0966R.C0970id.g3r)).setVisibility(8);
                ((TextView) this.f282861d.findViewById(C0966R.C0970id.f357940cl1)).setVisibility(0);
                ((TextView) this.f282861d.findViewById(C0966R.C0970id.cks)).setVisibility(0);
                return C13598b0.f38549a;
            }
        }

        public C96612e(WebSearchImageLoadingUI webSearchImageLoadingUI, String str) {
            this.f282858a = webSearchImageLoadingUI;
            this.f282859b = str;
        }

        /* renamed from: c */
        public final void mo33401c(long j, C101647f fVar) {
            C101647f fVar2 = fVar;
            Class cls = C101982p.class;
            C87412m.m108594g(fVar2, "result");
            Log.m105925i(this.f282858a.f282837d, "uploadImageForSearch callback %s filePath:%s isSucess:%b, session: %s, %s, mBackPressCancel: %s.", fVar2.f297554h, fVar2.f297553g, Boolean.valueOf(fVar2.f297549c), Long.valueOf(j), C99252h.m129298c(j), Boolean.valueOf(this.f282858a.f282844n));
            WebSearchImageLoadingUI webSearchImageLoadingUI = this.f282858a;
            if (!webSearchImageLoadingUI.f282844n) {
                webSearchImageLoadingUI.f282847q = 0;
                if (fVar2.f297549c) {
                    if (fVar2.f297555i == 3) {
                        C14134p0 p0Var = new C14134p0();
                        WebSearchImageLoadingUI webSearchImageLoadingUI2 = this.f282858a;
                        p0Var.f39544a = webSearchImageLoadingUI2;
                        p0Var.f39545b = 67;
                        p0Var.f39547d = fVar2.f297556j;
                        p0Var.f39548e = webSearchImageLoadingUI2.f282840g;
                        p0Var.f39552i = false;
                        p0Var.f39549f = true;
                        ((C101982p) C86312j.m106911c(cls)).mo6877X6(p0Var);
                    } else {
                        C14134p0 p0Var2 = new C14134p0();
                        WebSearchImageLoadingUI webSearchImageLoadingUI3 = this.f282858a;
                        p0Var2.f39544a = webSearchImageLoadingUI3;
                        p0Var2.f39545b = 67;
                        p0Var2.f39547d = "";
                        p0Var2.f39548e = webSearchImageLoadingUI3.f282840g;
                        p0Var2.f39549f = true;
                        p0Var2.f39551h = true;
                        p0Var2.f39552i = false;
                        p0Var2.f39560q = true;
                        p0Var2.f39554k = C76577a.m92153d(webSearchImageLoadingUI3, C0966R.color.al6);
                        p0Var2.f39555l = true;
                        Map<String, String> map = p0Var2.f39550g;
                        C87412m.m108593f(map, "params.extParams");
                        ((HashMap) map).put("chatSearch", "2");
                        try {
                            Map<String, String> map2 = p0Var2.f39550g;
                            C87412m.m108593f(map2, "params.extParams");
                            ((HashMap) map2).put("reqKey", C117627q.m165909b(fVar2.f297554h, "utf8"));
                        } catch (Exception unused) {
                        }
                        String str = "weixin://fts/image?path=" + C86013q1.m106448i(fVar2.f297553g, false);
                        try {
                            Map<String, String> map3 = p0Var2.f39550g;
                            C87412m.m108593f(map3, "params.extParams");
                            ((HashMap) map3).put("cacheImageSrc", C117627q.m165909b(str, "utf8"));
                        } catch (Exception unused2) {
                        }
                        ((C101982p) C86312j.m106911c(cls)).mo6877X6(p0Var2);
                        WebSearchImageLoadingUI webSearchImageLoadingUI4 = this.f282858a;
                        String str2 = fVar2.f297553g;
                        C87412m.m108593f(str2, "result.imagePath");
                        webSearchImageLoadingUI4.mo134702I7(8, str2, this.f282858a.f282840g, 0, System.currentTimeMillis());
                    }
                    C119179t tVar = C119157j.f356862d;
                    C96613a aVar = new C96613a(this.f282858a);
                    C119157j jVar = (C119157j) tVar;
                    jVar.getClass();
                    jVar.mo183892w(aVar, 500, false);
                } else {
                    C61926c.m72668M(new C96614b(webSearchImageLoadingUI));
                }
                WebSearchImageLoadingUI webSearchImageLoadingUI5 = this.f282858a;
                webSearchImageLoadingUI5.mo134702I7(5, this.f282859b, webSearchImageLoadingUI5.f282840g, fVar2.f297551e, System.currentTimeMillis());
            }
        }
    }

    /* renamed from: H7 */
    public final void mo134701H7() {
        Log.m105925i(this.f282837d, "cancelDownloadImage isDownloading: %b, imgLocalId: %d, msgId: %d", Boolean.valueOf(this.f282843j), Long.valueOf(this.f282842i), Long.valueOf(this.f282838e));
        if (this.f282843j || this.f282842i != 0) {
            ((C92822e) ((C98201k) C86312j.m106911c(C98201k.class)).Jp0()).mo127104f(this.f282842i, this.f282838e, 0, this.f282846p);
        }
    }

    /* renamed from: I7 */
    public final void mo134702I7(int i, String str, String str2, int i2, long j) {
        C61926c.m72656A((String) null, new C96610c(str, this, i, str2, i2, j));
    }

    /* renamed from: J7 */
    public final void mo134703J7(long j, int i, String str) {
        C101645e eVar = new C101645e();
        eVar.f297534c = j;
        eVar.f297532a = this.f282839f;
        eVar.f297536e = i;
        eVar.f297537f = 4;
        C64421he heVar = new C64421he();
        eVar.f297538g = heVar;
        heVar.f183478d = C43471q.m46977a(0);
        eVar.f297542k = this.f282845o;
        C48884bn2 g = C101987v0.m134273g();
        if (g != null) {
            C64852yd ydVar = new C64852yd();
            eVar.f297539h = ydVar;
            ydVar.f186491e = g.f131219d;
            ydVar.f186490d = g.f131220e;
            ydVar.f186492f = (float) g.f131221f;
        }
        mo134702I7(2, str, this.f282840g, 0, System.currentTimeMillis());
        long tf = ((C101643c) C86312j.m106911c(C101643c.class)).mo140879tf(eVar, new C96612e(this, str));
        this.f282847q = tf;
        if (tf != 0) {
            mo134702I7(4, str, this.f282840g, 0, System.currentTimeMillis());
        }
    }

    /* renamed from: K7 */
    public final void mo134704K7(boolean z) {
        if (this.f282838e == 0) {
            ((C119157j) C119157j.f356862d).mo183895z(new C97845a(this));
            return;
        }
        String bh02 = ((C101643c) C86312j.m106911c(C101643c.class)).bh0(this.f282838e, false);
        if (C86013q1.m106450k(bh02)) {
            showLoading();
            long j = this.f282838e;
            int i = this.f282841h;
            C87412m.m108593f(bh02, "imagePath");
            mo134703J7(j, i, bh02);
            ((Button) findViewById(C0966R.C0970id.cks)).setOnClickListener(new C96611d(this, bh02));
        } else if (z) {
            long j2 = this.f282838e;
            ((C119157j) C119157j.f356862d).mo183870a(new C97847b(j2, this));
        } else {
            ((C119157j) C119157j.f356862d).mo183895z(new C97845a(this));
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.chq;
    }

    public void onBackPressed() {
        super.onBackPressed();
        mo134701H7();
        mo134702I7(11, "", this.f282840g, 0, System.currentTimeMillis());
        Log.m105919d(this.f282837d, "onBackPressed = %s", Boolean.valueOf(this.f282844n));
        this.f282844n = true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new C96609b(this), C0966R.raw.actionbar_icon_dark_back);
        setMMTitle("");
        this.f282838e = getIntent().getLongExtra("key_msg_id", 0);
        this.f282839f = getIntent().getLongExtra("key_session_id", 0);
        this.f282841h = getIntent().getIntExtra("key_scan_goods_request_type", 0);
        this.f282845o = getIntent().getBooleanExtra("key_upload_image_use_cdn_opt", true);
        String c = C99252h.m129298c(this.f282839f);
        C87412m.m108593f(c, "getUnsignedLong(mSessionId)");
        this.f282840g = c;
        mo134704K7(true);
    }

    public void onDestroy() {
        if (this.f282847q != 0) {
            ((C101643c) C86312j.m106911c(C101643c.class)).mo140880x0(this.f282847q);
        }
        super.onDestroy();
    }

    public final void showLoading() {
        if (C85875k4.m106211z()) {
            ((MMAnimateView) findViewById(C0966R.C0970id.g3d)).setImageResource(C0966R.raw.websearch_dark_loading);
        } else {
            ((MMAnimateView) findViewById(C0966R.C0970id.g3d)).setImageResource(C0966R.raw.websearch_light_loading);
        }
    }
}
