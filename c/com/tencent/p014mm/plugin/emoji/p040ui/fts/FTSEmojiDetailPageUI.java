package com.tencent.p014mm.plugin.emoji.p040ui.fts;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import c00.C92330r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.EmojiSyncTaskEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import gc0.C20828a;
import hc0.C20937c;
import i61.C98602h;
import ic0.C98661k;
import ke3.C88144b;
import nj3.C11184p0;
import ob0.C11385n;
import ob0.C117747y;
import p008bq.C39833l0;
import p441aq.C92054g;
import p823sg.C90193h;
import u61.C101964h;
import z51.C39315g;

/* renamed from: com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI */
public class FTSEmojiDetailPageUI extends MMActivity implements C11385n {

    /* renamed from: P */
    public static final /* synthetic */ int f268694P = 0;

    /* renamed from: A */
    public String f268695A;

    /* renamed from: B */
    public String f268696B;

    /* renamed from: C */
    public String f268697C;

    /* renamed from: D */
    public String f268698D;

    /* renamed from: E */
    public String f268699E;

    /* renamed from: F */
    public String f268700F;

    /* renamed from: G */
    public String f268701G;

    /* renamed from: H */
    public int f268702H;

    /* renamed from: I */
    public String f268703I;

    /* renamed from: J */
    public int f268704J;

    /* renamed from: K */
    public IListener f268705K = new IListener<EmojiSyncTaskEvent>(C40008f.f107254d) {
        {
            this.__eventId = 1273581380;
        }

        public boolean callback(IEvent iEvent) {
            EmojiSyncTaskEvent emojiSyncTaskEvent = (EmojiSyncTaskEvent) iEvent;
            EmojiInfo emojiInfo = FTSEmojiDetailPageUI.this.f268719q;
            if (emojiInfo != null && emojiSyncTaskEvent.f107420d.f107422b.equals(emojiInfo.getMd5())) {
                Log.m105925i("MicroMsg.FTS.FTSEmojiDetailPageUI", "emojiDownloadListener callback %s", FTSEmojiDetailPageUI.this.f268719q.getMd5());
                MMHandlerThread.postToMainThread(new C93186h(this));
            }
            return false;
        }
    };

    /* renamed from: L */
    public C39833l0.C39834a f268706L = new C93175b();

    /* renamed from: M */
    public C98661k f268707M = new C93177c();

    /* renamed from: N */
    public C11184p0 f268708N = new C93174a();

    /* renamed from: d */
    public ProgressBar f268709d;

    /* renamed from: e */
    public MMAnimateView f268710e;

    /* renamed from: f */
    public Button f268711f;

    /* renamed from: g */
    public Button f268712g;

    /* renamed from: h */
    public TextView f268713h;

    /* renamed from: i */
    public ImageView f268714i;

    /* renamed from: j */
    public View f268715j;

    /* renamed from: n */
    public C45082x0 f268716n;

    /* renamed from: o */
    public boolean f268717o;

    /* renamed from: p */
    public boolean f268718p;

    /* renamed from: q */
    public EmojiInfo f268719q;

    /* renamed from: r */
    public EmojiInfo f268720r;

    /* renamed from: s */
    public String f268721s;

    /* renamed from: t */
    public int f268722t;

    /* renamed from: u */
    public int f268723u;

    /* renamed from: v */
    public String f268724v;

    /* renamed from: w */
    public int f268725w;

    /* renamed from: x */
    public String f268726x;

    /* renamed from: y */
    public String f268727y;

    /* renamed from: z */
    public String f268728z;

    /* renamed from: com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI$a */
    public class C93174a implements C11184p0 {
        public C93174a() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            FTSEmojiDetailPageUI.this.f268716n = null;
            int itemId = menuItem.getItemId();
            if (itemId == 1) {
                FTSEmojiDetailPageUI fTSEmojiDetailPageUI = FTSEmojiDetailPageUI.this;
                fTSEmojiDetailPageUI.getClass();
                C86709a0.m107525e().postToWorker(new C93180b(fTSEmojiDetailPageUI));
            } else if (itemId == 2) {
                FTSEmojiDetailPageUI fTSEmojiDetailPageUI2 = FTSEmojiDetailPageUI.this;
                fTSEmojiDetailPageUI2.getClass();
                ((C92330r) C86312j.m106911c(C92330r.class)).mo126126PR(fTSEmojiDetailPageUI2.f268723u, fTSEmojiDetailPageUI2.f268724v, fTSEmojiDetailPageUI2.f268726x, 5, 0, 0, fTSEmojiDetailPageUI2.f268725w);
                Log.m105918d("MicroMsg.FTS.FTSEmojiDetailPageUI", "ApplicationLanguage" + LocaleUtil.getApplicationLanguage());
                Intent intent = new Intent();
                intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, fTSEmojiDetailPageUI2.getString(C0966R.string.c88));
                intent.putExtra("rawUrl", fTSEmojiDetailPageUI2.getString(C0966R.string.f2k) + LocaleUtil.getApplicationLanguage());
                intent.putExtra("showShare", false);
                intent.putExtra("neverGetA8Key", true);
                C88144b.m109791i(fTSEmojiDetailPageUI2, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI$b */
    public class C93175b implements C39833l0.C39834a {

        /* renamed from: com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI$b$a */
        public class C93176a implements Runnable {
            public C93176a() {
            }

            public void run() {
                FTSEmojiDetailPageUI fTSEmojiDetailPageUI = FTSEmojiDetailPageUI.this;
                int i = FTSEmojiDetailPageUI.f268694P;
                fTSEmojiDetailPageUI.mo127782H7(false);
            }
        }

        public C93175b() {
        }

        /* renamed from: a */
        public void mo62471a(boolean z, IEmojiInfo iEmojiInfo) {
            EmojiInfo emojiInfo;
            if (iEmojiInfo == null || !z || (emojiInfo = FTSEmojiDetailPageUI.this.f268719q) == null || !emojiInfo.getMd5().equals(iEmojiInfo.getMd5())) {
                Log.m105924i("MicroMsg.FTS.FTSEmojiDetailPageUI", "somethings error.");
                return;
            }
            Log.m105925i("MicroMsg.FTS.FTSEmojiDetailPageUI", "emojiServiceCallback onDownload %s", FTSEmojiDetailPageUI.this.f268719q.getMd5());
            MMHandlerThread.postToMainThread(new C93176a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI$c */
    public class C93177c implements C98661k {

        /* renamed from: com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI$c$a */
        public class C93178a implements Runnable {
            public C93178a() {
            }

            public void run() {
                FTSEmojiDetailPageUI fTSEmojiDetailPageUI = FTSEmojiDetailPageUI.this;
                int i = FTSEmojiDetailPageUI.f268694P;
                fTSEmojiDetailPageUI.mo127782H7(false);
            }
        }

        public C93177c() {
        }

        /* renamed from: a */
        public void mo6935a(String str, View view, Bitmap bitmap, Object... objArr) {
            Object obj;
            Log.m105925i("MicroMsg.FTS.FTSEmojiDetailPageUI", "imageLoaderListener onImageLoadComplete %s", str);
            if (bitmap != null && objArr != null && objArr.length > 0 && (obj = objArr[0]) != null && (obj instanceof String) && str.equals(FTSEmojiDetailPageUI.this.f268719q.field_encrypturl)) {
                C86009m1 m1Var = new C86009m1(objArr[0].toString());
                if (m1Var.mo119967g()) {
                    FTSEmojiDetailPageUI.this.f268719q.field_md5 = C86013q1.m106456q(m1Var.mo119976n());
                    FTSEmojiDetailPageUI.this.f268721s = EmojiLogic.m117486q(C101964h.m134224f(), "", FTSEmojiDetailPageUI.this.f268719q.field_md5);
                    C86013q1.m106442c(m1Var.mo119971i(), FTSEmojiDetailPageUI.this.f268721s);
                    MMHandlerThread.postToMainThread(new C93178a());
                }
            }
        }
    }

    /* renamed from: H7 */
    public final void mo127782H7(boolean z) {
        Class cls = C39315g.class;
        Class cls2 = C92054g.class;
        if (z) {
            setMMTitle(this.f268719q.getName());
        }
        int i = this.f268722t;
        if (i == 2) {
            C20828a.m22825b().mo32518g(this.f268728z, this.f268714i);
            this.f268713h.setText(this.f268695A);
            if (this.f268702H == 1) {
                this.f268721s = this.f268720r.mo62640K1();
            } else {
                this.f268721s = this.f268719q.mo62640K1();
            }
        } else if (i == 3) {
            C20828a.m22825b().mo32518g(this.f268700F, this.f268714i);
            this.f268713h.setText(this.f268699E);
            if (this.f268702H == 1) {
                this.f268721s = this.f268720r.mo62640K1();
            } else {
                this.f268721s = this.f268719q.mo62640K1();
            }
        } else if (i == 4) {
            this.f268714i.setVisibility(8);
            if (!Util.isNullOrNil(this.f268697C)) {
                this.f268713h.setText(this.f268697C);
            } else {
                this.f268713h.setText(C0966R.string.iha);
            }
        }
        if (C86013q1.m106450k(this.f268721s)) {
            this.f268709d.setVisibility(8);
            this.f268710e.setVisibility(0);
            ((C92054g) C86312j.m106911c(cls2)).getClass();
            EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO(this.f268719q.getMd5());
            if (TO == null || (TO.field_reserved4 & 1) != 1) {
                Log.m105924i("MicroMsg.FTS.FTSEmojiDetailPageUI", "file exist: no decrypt");
                if (TO == null || this.f268702H != 1) {
                    this.f268710e.setImageFilePath(this.f268721s);
                } else {
                    this.f268710e.mo129233t(((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo138036u(TO), "");
                }
            } else {
                Log.m105924i("MicroMsg.FTS.FTSEmojiDetailPageUI", "file exist: decrypt");
                this.f268710e.mo129233t(((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo138036u(TO), "");
            }
            ((C92054g) C86312j.m106911c(cls2)).getClass();
            EmojiInfo TO2 = C30790w2.m39221h().mo57717d().mo142044TO(this.f268719q.getMd5());
            if (TO2 == null) {
                TO2 = this.f268719q;
            }
            if (TO2.field_catalog == 81) {
                this.f268711f.setEnabled(false);
                this.f268711f.setText(C0966R.string.f7568jx);
            } else {
                this.f268711f.setText(C0966R.string.f360373c83);
                if (C86013q1.m106450k(this.f268721s)) {
                    this.f268711f.setEnabled(true);
                } else {
                    this.f268711f.setEnabled(false);
                }
            }
            this.f268712g.setEnabled(true);
        } else if (z) {
            if (this.f268722t == 4) {
                C86009m1 m1Var = new C86009m1(getCacheDir(), C90193h.m112878f(this.f268719q.field_encrypturl.getBytes()));
                if (m1Var.mo119967g()) {
                    this.f268719q.field_md5 = C86013q1.m106456q(m1Var.mo119976n());
                    String q = EmojiLogic.m117486q(C101964h.m134224f(), "", this.f268719q.field_md5);
                    if (!C86013q1.m106450k(q)) {
                        C86013q1.m106442c(m1Var.mo119971i(), q);
                    }
                    this.f268721s = q;
                    mo127782H7(false);
                } else {
                    C20937c.C20939b bVar = new C20937c.C20939b();
                    bVar.f59346b = true;
                    bVar.f59350f = m1Var.mo119971i();
                    bVar.f59368x = new Object[]{m1Var.mo119971i()};
                    ((C92054g) C86312j.m106911c(cls2)).mo62466Nr().mo32521j(this.f268719q.field_encrypturl, (ImageView) null, bVar.mo32666a(), this.f268707M);
                }
            } else {
                this.f268710e.setVisibility(8);
                this.f268709d.setVisibility(0);
                this.f268711f.setText(C0966R.string.f360373c83);
                this.f268712g.setText(C0966R.string.i4e);
                this.f268711f.setEnabled(false);
                this.f268712g.setEnabled(false);
                if (this.f268702H == 1) {
                    ((C92054g) C86312j.m106911c(cls2)).mo62467VJ(this.f268720r);
                } else {
                    ((C92054g) C86312j.m106911c(cls2)).mo62467VJ(this.f268719q);
                }
            }
        }
        if (this.f268717o) {
            this.f268711f.setVisibility(8);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359796at2;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1001 && i2 == -1) {
            C75026b.m89951a(this, getContext().getString(C0966R.string.a2x));
        }
    }

    public void onCreate(Bundle bundle) {
        Class cls = C92330r.class;
        super.onCreate(bundle);
        this.f268711f = (Button) findViewById(C0966R.C0970id.ce6);
        this.f268712g = (Button) findViewById(C0966R.C0970id.chm);
        this.f268710e = (MMAnimateView) findViewById(C0966R.C0970id.cft);
        this.f268709d = (ProgressBar) findViewById(C0966R.C0970id.g3h);
        this.f268713h = (TextView) findViewById(C0966R.C0970id.chp);
        this.f268714i = (ImageView) findViewById(C0966R.C0970id.cho);
        this.f268715j = findViewById(C0966R.C0970id.ag_);
        setBackBtn(new C93181c(this));
        this.f268711f.setOnClickListener(new C93182d(this));
        this.f268712g.setOnClickListener(new C93183e(this));
        this.f268715j.setOnClickListener(new C93184f(this));
        addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C93185g(this));
        this.f268722t = getIntent().getIntExtra("extra_type", 0);
        this.f268723u = getIntent().getIntExtra("extra_scence", 0);
        this.f268702H = getIntent().getIntExtra("extra_gen_sticker", 0);
        EmojiInfo emojiInfo = new EmojiInfo();
        this.f268719q = emojiInfo;
        emojiInfo.field_designerID = getIntent().getStringExtra("id");
        this.f268719q.field_name = getIntent().getStringExtra("extra_emoji_name");
        this.f268719q.field_aeskey = getIntent().getStringExtra("extra_aeskey");
        this.f268719q.field_encrypturl = getIntent().getStringExtra("extra_encrypt_url");
        this.f268719q.field_thumbUrl = getIntent().getStringExtra("extra_thumb_url");
        this.f268719q.field_md5 = getIntent().getStringExtra("extra_md5");
        this.f268719q.field_groupId = getIntent().getStringExtra("extra_product_id");
        if (Util.isNullOrNil(this.f268719q.field_aeskey)) {
            EmojiInfo emojiInfo2 = this.f268719q;
            emojiInfo2.field_cdnUrl = emojiInfo2.field_encrypturl;
        }
        this.f268727y = this.f268719q.field_groupId;
        this.f268695A = getIntent().getStringExtra("extra_product_name");
        this.f268728z = getIntent().getStringExtra("productUrl");
        this.f268696B = getIntent().getStringExtra("extra_article_url");
        this.f268697C = getIntent().getStringExtra("extra_article_name");
        this.f268698D = this.f268719q.field_designerID;
        this.f268699E = getIntent().getStringExtra("name");
        this.f268700F = getIntent().getStringExtra("headurl");
        this.f268701G = getIntent().getStringExtra("biz_user_name");
        this.f268703I = getIntent().getStringExtra("weapp_user_name");
        getIntent().getIntExtra("weapp_version", 0);
        this.f268704J = getIntent().getIntExtra("source_type", 0);
        this.f268724v = getIntent().getStringExtra("searchID");
        this.f268726x = getIntent().getStringExtra("docID");
        this.f268725w = getIntent().getIntExtra("search_type", 0);
        this.f268717o = getIntent().getBooleanExtra("disableAddSticker", false);
        this.f268718p = getIntent().getBooleanExtra("needSavePhotosAlbum", false);
        String stringExtra = getIntent().getStringExtra("activityId");
        if (!Util.isNullOrNil(stringExtra)) {
            this.f268719q.field_activityid = stringExtra;
        }
        this.f268705K.alive();
        if (this.f268702H == 1) {
            EmojiInfo emojiInfo3 = new EmojiInfo();
            this.f268720r = emojiInfo3;
            emojiInfo3.convertFrom(this.f268719q.convertTo(), false);
            EmojiInfo emojiInfo4 = this.f268720r;
            emojiInfo4.field_designerID = "";
            emojiInfo4.field_groupId = "";
        }
        ((C92054g) C86312j.m106911c(C92054g.class)).mo62465NG(this.f268706L);
        ((C92330r) C86312j.m106911c(cls)).bn0(this.f268723u, this.f268724v, this.f268726x, 0, this.f268725w);
        mo127782H7(true);
        Log.m105925i("MicroMsg.FTS.FTSEmojiDetailPageUI", "localPath=%s", this.f268721s);
        ((C92330r) C86312j.m106911c(cls)).bn0(this.f268723u, this.f268724v, this.f268726x, 0, this.f268725w);
    }

    public void onDestroy() {
        this.f268705K.dead();
        ((C92054g) C86312j.m106911c(C92054g.class)).mo62465NG((C39833l0.C39834a) null);
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
        mo127782H7(false);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
    }
}
