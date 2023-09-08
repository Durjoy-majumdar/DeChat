package com.tencent.p014mm.plugin.game.media;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.modelcdntran.C92755e0;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.game.commlib.util.C41872f;
import com.tencent.p014mm.plugin.game.commlib.view.CycleProgressView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import gc0.C20828a;
import hc0.C20937c;
import ic0.C21070h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import jc0.C21210b;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import ly1.C99744i0;
import ly1.C99751j0;
import ly1.C99753k0;
import ly1.C99755l0;
import ly1.C99757m0;
import ly1.C99762n0;
import ly1.C99775t0;
import nj3.C76879j;
import nj3.C88989a;
import p1081gi.C98127h;
import p682rz.C101487r;
import p763ym.C39072t;
import sw1.C101703s;
import uy1.C52642c;
import w10.C15032a;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.game.media.GameVideoDownloadUI */
public class GameVideoDownloadUI extends MMActivity {

    /* renamed from: s */
    public static final String f271750s = (C41872f.m45392b(C41872f.C41873a.ONE_WEEK) + "haowan/");

    /* renamed from: d */
    public int f271751d;

    /* renamed from: e */
    public C99775t0 f271752e = new C99757m0(this);

    /* renamed from: f */
    public Context f271753f;

    /* renamed from: g */
    public String f271754g;

    /* renamed from: h */
    public int f271755h;

    /* renamed from: i */
    public String f271756i;

    /* renamed from: j */
    public String f271757j;

    /* renamed from: n */
    public String f271758n;

    /* renamed from: o */
    public long f271759o = 0;

    /* renamed from: p */
    public CycleProgressView f271760p;

    /* renamed from: q */
    public C94107f f271761q;

    /* renamed from: r */
    public int f271762r = 0;

    /* renamed from: com.tencent.mm.plugin.game.media.GameVideoDownloadUI$a */
    public class C94101a implements View.OnClickListener {
        public C94101a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/media/GameVideoDownloadUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            GameVideoDownloadUI gameVideoDownloadUI = GameVideoDownloadUI.this;
            String str = GameVideoDownloadUI.f271750s;
            gameVideoDownloadUI.mo129160I7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/media/GameVideoDownloadUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.GameVideoDownloadUI$b */
    public class C94102b implements C21070h {

        /* renamed from: a */
        public final /* synthetic */ ImageView f271764a;

        /* renamed from: b */
        public final /* synthetic */ ImageView f271765b;

        /* renamed from: com.tencent.mm.plugin.game.media.GameVideoDownloadUI$b$a */
        public class C94103a implements Runnable {
            public C94103a() {
            }

            public void run() {
                C94102b.this.f271764a.setVisibility(0);
                C94102b.this.f271765b.setVisibility(8);
            }
        }

        public C94102b(GameVideoDownloadUI gameVideoDownloadUI, ImageView imageView, ImageView imageView2) {
            this.f271764a = imageView;
            this.f271765b = imageView2;
        }

        /* renamed from: a */
        public void mo6676a(String str, View view) {
        }

        /* renamed from: b */
        public void mo6677b(String str, View view, C21210b bVar) {
            MMHandlerThread.postToMainThread(new C94103a());
        }

        /* renamed from: c */
        public Bitmap mo6678c(String str, View view, C21210b bVar) {
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.GameVideoDownloadUI$c */
    public class C94104c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f271767d;

        public C94104c(String str) {
            this.f271767d = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            GameVideoDownloadUI gameVideoDownloadUI = GameVideoDownloadUI.this;
            String str = this.f271767d;
            String str2 = GameVideoDownloadUI.f271750s;
            gameVideoDownloadUI.mo129159H7(str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.GameVideoDownloadUI$d */
    public class C94105d implements DialogInterface.OnClickListener {
        public C94105d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            GameVideoDownloadUI gameVideoDownloadUI = GameVideoDownloadUI.this;
            int i2 = gameVideoDownloadUI.f271755h;
            if (i2 == 3) {
                GameVideoDownloadUI gameVideoDownloadUI2 = GameVideoDownloadUI.this;
                ((C39072t) C86312j.m106911c(C39072t.class)).r10(gameVideoDownloadUI2.f271756i, "video download cancel", gameVideoDownloadUI2.f271757j, -2, "video download cancel");
            } else if (i2 == 5) {
                gameVideoDownloadUI.setResult(-1, new Intent().putExtra("webview_callback_err", 1));
            }
            GameVideoDownloadUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.GameVideoDownloadUI$e */
    public class C94106e implements C101703s.C101704a {

        /* renamed from: a */
        public final /* synthetic */ View f271770a;

        /* renamed from: com.tencent.mm.plugin.game.media.GameVideoDownloadUI$e$a */
        public class C30097a implements Runnable {
            public C30097a() {
            }

            public void run() {
                View view = C94106e.this.f271770a;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/media/GameVideoDownloadUI$5$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/game/media/GameVideoDownloadUI$5$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        public C94106e(View view) {
            this.f271770a = view;
        }

        /* renamed from: a */
        public void mo129166a(String str, int i, int i2) {
            if (str != null && str.endsWith(".temp")) {
                String replace = str.replace(".temp", "");
                C86013q1.m106463x(str, replace);
                Log.m105925i("MicroMsg.Haowan.GameVideoDownloadUI", "download videoPath:%s", replace);
                str = replace;
            }
            if (i == 0) {
                GameVideoDownloadUI gameVideoDownloadUI = GameVideoDownloadUI.this;
                C40314g.m43487f(gameVideoDownloadUI.f271753f, 87, 8760, 0, 48, gameVideoDownloadUI.f271757j, gameVideoDownloadUI.f271762r, C15032a.m14200a(gameVideoDownloadUI.f271755h, gameVideoDownloadUI.mo129161J7(0)));
                MMHandlerThread.postToMainThread(new C30097a());
                Intent intent = new Intent();
                intent.putExtras(GameVideoDownloadUI.this.getIntent().getExtras());
                intent.putExtra("video_path", str);
                C88144b.m109795m(GameVideoDownloadUI.this.f271753f, "game", ".media.GameVideoEditorProxyUI", intent, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_FROM_WEB);
            } else if (i == 2) {
                GameVideoDownloadUI gameVideoDownloadUI2 = GameVideoDownloadUI.this;
                C40314g.m43487f(gameVideoDownloadUI2.f271753f, 87, 8760, 0, 56, gameVideoDownloadUI2.f271757j, gameVideoDownloadUI2.f271762r, C15032a.m14200a(gameVideoDownloadUI2.f271755h, gameVideoDownloadUI2.mo129161J7(i2)));
                GameVideoDownloadUI gameVideoDownloadUI3 = GameVideoDownloadUI.this;
                int i3 = gameVideoDownloadUI3.f271755h;
                if (i3 == 3) {
                    ((C39072t) C86312j.m106911c(C39072t.class)).r10(GameVideoDownloadUI.this.f271756i, "video download err:" + i2, GameVideoDownloadUI.this.f271757j, -3, "video download err:" + i2);
                } else if (i3 == 5) {
                    gameVideoDownloadUI3.setResult(-1, new Intent().putExtra("webview_callback_err", 2));
                }
                GameVideoDownloadUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.GameVideoDownloadUI$f */
    public class C94107f implements Runnable {

        /* renamed from: d */
        public C98127h f271772d;

        public C94107f(GameVideoDownloadUI gameVideoDownloadUI, C98127h hVar) {
            this.f271772d = hVar;
        }

        public void run() {
            if (this.f271772d != null) {
                ((C92755e0) ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6()).mo126981e(this.f271772d, false);
            }
        }
    }

    /* renamed from: H7 */
    public final void mo129159H7(String str) {
        C94106e eVar = new C94106e(findViewById(C0966R.C0970id.g3t));
        long currentTimeMillis = System.currentTimeMillis();
        C98127h hVar = new C98127h();
        hVar.f287660d = "task_GameVideoDownloadUI";
        hVar.field_mediaId = this.f271754g;
        hVar.f287705p0 = str;
        hVar.f287689V = 0;
        hVar.f287655L = 3;
        hVar.f287696Y0 = 4;
        C86013q1.m106461v(C86013q1.m106458s(this.f271758n));
        hVar.field_fullpath = this.f271758n;
        hVar.f287704f1 = new C99762n0(this, currentTimeMillis, str, eVar);
        this.f271759o = System.currentTimeMillis();
        C94107f fVar = new C94107f(this, hVar);
        this.f271761q = fVar;
        MMHandlerThread.postToMainThreadDelayed(fVar, 500);
    }

    /* renamed from: I7 */
    public final void mo129160I7() {
        Log.m105924i("MicroMsg.Haowan.GameVideoDownloadUI", "cancel video download!");
        C40314g.m43487f(this.f271753f, 87, 8760, 1, 2, this.f271757j, this.f271762r, C15032a.m14200a(this.f271755h, mo129161J7(0)));
        int i = this.f271755h;
        if (i == 3) {
            ((C39072t) C86312j.m106911c(C39072t.class)).r10(this.f271756i, "video download cancel", this.f271757j, -2, "video download cancel");
        } else if (i == 5) {
            setResult(-1, new Intent().putExtra("webview_callback_err", 1));
        }
        finish();
    }

    /* renamed from: J7 */
    public final Map mo129161J7(int i) {
        long j = 0;
        if (this.f271759o != 0) {
            j = System.currentTimeMillis() - this.f271759o;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("costtime", Long.valueOf(j));
        hashMap.put("failid", Integer.valueOf(i));
        return hashMap;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359817ay0;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        boolean z = false;
        Log.m105925i("MicroMsg.Haowan.GameVideoDownloadUI", "requestCode:%d, resultCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (this.f271751d == 11) {
            z = true;
        }
        if (!z && i == 223) {
            setResult(i2, intent);
            finish();
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        if (this.f271751d == 11) {
            ((C99757m0) this.f271752e).mo139119a();
        } else {
            mo129160I7();
        }
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        setSelfNavigationBarVisible(8);
        getWindow().addFlags(2097280);
        getWindow().setFlags(201327616, 201327616);
        this.f271753f = this;
        int intExtra = getIntent().getIntExtra("game_from", -1);
        this.f271751d = intExtra;
        if (intExtra == 11) {
            C99757m0 m0Var = (C99757m0) this.f271752e;
            String stringExtra = m0Var.f292365a.getIntent().getStringExtra("video_url");
            String stringExtra2 = m0Var.f292365a.getIntent().getStringExtra("thumb_url");
            m0Var.f292368d = (CycleProgressView) m0Var.f292365a.findViewById(C0966R.C0970id.byp);
            m0Var.f292365a.findViewById(C0966R.C0970id.c9q).setOnClickListener(new C99744i0(m0Var));
            ImageView imageView = (ImageView) m0Var.f292365a.findViewById(C0966R.C0970id.f359490l62);
            ImageView imageView2 = (ImageView) m0Var.f292365a.findViewById(C0966R.C0970id.l5a);
            int h = C52642c.m58990h(m0Var.f292365a);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView2.getLayoutParams();
            layoutParams.width = h;
            layoutParams.height = (h * 1080) / 1920;
            imageView2.setLayoutParams(layoutParams);
            imageView.setVisibility(8);
            imageView2.setVisibility(0);
            C20828a b = C20828a.m22825b();
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59346b = true;
            b.mo32520i(stringExtra2, imageView, bVar.mo32666a(), new C99751j0(m0Var, imageView, imageView2));
            m0Var.f292367c = C99757m0.f292364f + "MMVideo_" + MD5Util.getMD5String(stringExtra) + ".mp4";
            StringBuilder sb = new StringBuilder();
            sb.append("MMVideo_");
            sb.append(MD5Util.getMD5String(stringExtra));
            m0Var.f292366b = sb.toString();
            if (!NetStatusUtil.isWifi((Context) m0Var.f292365a)) {
                MMActivity mMActivity = m0Var.f292365a;
                C76879j.m92709C(mMActivity, mMActivity.getString(C0966R.string.fch), "", m0Var.f292365a.getString(C0966R.string.fcf), m0Var.f292365a.getString(C0966R.string.fce), false, new C99753k0(m0Var, stringExtra), new C99755l0(m0Var));
            } else {
                m0Var.mo139120b(stringExtra);
            }
            Log.m105924i("MicroMsg.GameVideoDownloadPerform", "onCreate");
            return;
        }
        this.f271755h = getIntent().getIntExtra("from", -1);
        this.f271756i = getIntent().getStringExtra("business_type");
        this.f271757j = getIntent().getStringExtra("appid");
        String stringExtra3 = getIntent().getStringExtra("video_url");
        String stringExtra4 = getIntent().getStringExtra("thumb_url");
        this.f271762r = getIntent().getIntExtra("game_haowan_source_scene_id", 0);
        this.f271760p = (CycleProgressView) findViewById(C0966R.C0970id.byp);
        findViewById(C0966R.C0970id.c9q).setOnClickListener(new C94101a());
        ImageView imageView3 = (ImageView) findViewById(C0966R.C0970id.f359490l62);
        ImageView imageView4 = (ImageView) findViewById(C0966R.C0970id.l5a);
        int h2 = C52642c.m58990h(this.f271753f);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView4.getLayoutParams();
        layoutParams2.width = h2;
        layoutParams2.height = (h2 * 1080) / 1920;
        imageView4.setLayoutParams(layoutParams2);
        imageView3.setVisibility(8);
        imageView4.setVisibility(0);
        C20828a b2 = C20828a.m22825b();
        C20937c.C20939b bVar2 = new C20937c.C20939b();
        bVar2.f59346b = true;
        b2.mo32520i(stringExtra4, imageView3, bVar2.mo32666a(), new C94102b(this, imageView3, imageView4));
        Bundle bundleExtra = getIntent().getBundleExtra("ext_data");
        if (bundleExtra != null) {
            this.f271758n = bundleExtra.getString("key_video_cache_path");
            this.f271754g = bundleExtra.getString("key_video_media_id");
        }
        Log.m105925i("MicroMsg.Haowan.GameVideoDownloadUI", "video cache path:%s", this.f271758n);
        if (!C86013q1.m106450k(this.f271758n)) {
            this.f271758n = f271750s + "MMVideo_" + MD5Util.getMD5String(stringExtra3) + ".mp4";
        }
        if (Util.isNullOrNil(this.f271754g)) {
            this.f271754g = "MMVideo_" + MD5Util.getMD5String(stringExtra3);
        }
        if (NetStatusUtil.isWifi((Context) this) || this.f271755h != 3) {
            mo129159H7(stringExtra3);
        } else {
            C76879j.m92709C(this, getString(C0966R.string.fci), "", getString(C0966R.string.fcf), getString(C0966R.string.fce), false, new C94104c(stringExtra3), new C94105d());
        }
        Log.m105924i("MicroMsg.Haowan.GameVideoDownloadUI", "onCreate");
        C40314g.m43487f(this, 87, 8760, 0, 1, this.f271757j, this.f271762r, C15032a.m14200a(this.f271755h, (Map) null));
    }

    public void onDestroy() {
        Class cls = C101487r.class;
        super.onDestroy();
        if (this.f271751d == 11) {
            C99757m0 m0Var = (C99757m0) this.f271752e;
            C99757m0.C99760b bVar = m0Var.f292369e;
            if (bVar != null) {
                MMHandlerThread.removeRunnable(bVar);
            }
            ((C92755e0) ((C101487r) C86312j.m106911c(cls)).mo140795W6()).mo126983g(m0Var.f292366b, (Object[]) null);
            return;
        }
        C94107f fVar = this.f271761q;
        if (fVar != null) {
            MMHandlerThread.removeRunnable(fVar);
        }
        ((C92755e0) ((C101487r) C86312j.m106911c(cls)).mo140795W6()).mo126983g(this.f271754g, (Object[]) null);
    }
}
