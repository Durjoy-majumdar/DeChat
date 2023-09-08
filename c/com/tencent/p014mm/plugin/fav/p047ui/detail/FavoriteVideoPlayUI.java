package com.tencent.p014mm.plugin.fav.p047ui.detail;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import aw0.C103928o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C45059m0;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.fav.p047ui.C93594f1;
import com.tencent.p014mm.plugin.fav.p047ui.C93693r;
import com.tencent.p014mm.plugin.fav.p047ui.widget.FavVideoView;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import d62.C7250m;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import nj3.C88989a;
import og2.C77006j;
import p206nj.C11171e;
import qo3.C77407n;
import vo3.C90852c;

@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI */
public class FavoriteVideoPlayUI extends MMActivity {

    /* renamed from: A */
    public String f270172A = "";

    /* renamed from: B */
    public boolean f270173B = true;

    /* renamed from: C */
    public String f270174C;

    /* renamed from: D */
    public long f270175D;

    /* renamed from: E */
    public String f270176E;

    /* renamed from: F */
    public View.OnLongClickListener f270177F = new C93552a();

    /* renamed from: G */
    public boolean f270178G = false;

    /* renamed from: d */
    public Bundle f270179d;

    /* renamed from: e */
    public String f270180e;

    /* renamed from: f */
    public String f270181f;

    /* renamed from: g */
    public int f270182g;

    /* renamed from: h */
    public String f270183h;

    /* renamed from: i */
    public boolean f270184i = true;

    /* renamed from: j */
    public RelativeLayout f270185j;

    /* renamed from: n */
    public ImageView f270186n;

    /* renamed from: o */
    public FavVideoView f270187o;

    /* renamed from: p */
    public LinearLayout f270188p;

    /* renamed from: q */
    public boolean f270189q = false;

    /* renamed from: r */
    public int f270190r = 0;

    /* renamed from: s */
    public int f270191s = 0;

    /* renamed from: t */
    public int f270192t = 0;

    /* renamed from: u */
    public int f270193u = 0;

    /* renamed from: v */
    public boolean f270194v = true;

    /* renamed from: w */
    public C45059m0 f270195w;

    /* renamed from: x */
    public int f270196x;

    /* renamed from: y */
    public boolean f270197y = true;

    /* renamed from: z */
    public boolean f270198z = false;

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI$a */
    public class C93552a implements View.OnLongClickListener {
        public C93552a() {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/detail/FavoriteVideoPlayUI$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            FavoriteVideoPlayUI favoriteVideoPlayUI = FavoriteVideoPlayUI.this;
            if (!favoriteVideoPlayUI.f270187o.f270544w) {
                Log.m105924i("MicroMsg.FavoriteVideoPlayUI", "longClickListener onClick isPrepared:false");
            } else {
                C77407n nVar = new C77407n((Context) favoriteVideoPlayUI.getContext(), 1, false);
                nVar.f225771i = new C93578q(favoriteVideoPlayUI);
                nVar.f225782p = new C93579r(favoriteVideoPlayUI);
                nVar.mo107573q();
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteVideoPlayUI$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI$b */
    public class C93553b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Dialog f270200d;

        public C93553b(FavoriteVideoPlayUI favoriteVideoPlayUI, Dialog dialog) {
            this.f270200d = dialog;
        }

        public void run() {
            this.f270200d.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI$c */
    public class C93554c implements C45059m0.C45068i {

        /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI$c$a */
        public class C93555a implements Runnable {
            public C93555a() {
            }

            public void run() {
                FavoriteVideoPlayUI.this.finish();
                FavoriteVideoPlayUI.this.overridePendingTransition(0, 0);
            }
        }

        public C93554c() {
        }

        public void onAnimationEnd() {
            new MMHandler().post(new C93555a());
        }

        public void onAnimationStart() {
        }
    }

    /* renamed from: H7 */
    public final void mo128456H7(ImageView imageView) {
        if (this.f270173B) {
            this.f270187o.mo128635h(this.f270181f, this.f270198z, this.f270172A);
            if (imageView != null) {
                if (C86013q1.m106450k(this.f270180e)) {
                    imageView.setImageBitmap(BackwardSupportUtil.BitmapFactory.decodeFile(this.f270180e, 1.0f));
                } else {
                    imageView.setImageResource(C0966R.C0969drawable.byg);
                }
            }
        } else {
            String stringExtra = getIntent().getStringExtra("record_xml");
            if (Util.isNullOrNil(stringExtra)) {
                C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(this.f270175D);
                C68070l.C68072b u = C68070l.C68072b.m80422u(b002.getContent(), b002.mo108775z2());
                if (u != null) {
                    stringExtra = u.f195571f0;
                }
            }
            ((C77006j) C86312j.m106911c(C77006j.class)).mo107328GL(stringExtra, this.f270175D, this.f270174C, true);
            this.f270187o.mo128635h(this.f270181f, true, this.f270174C);
            this.f270187o.setThumbView(this.f270180e);
        }
        Log.m105925i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay: fullPath is not null,but not exist videoView.setVideoData(null) isDataExist:%s thumbPathExist:%s", Boolean.valueOf(this.f270173B), Boolean.valueOf(C86013q1.m106450k(this.f270180e)));
    }

    /* renamed from: I7 */
    public void mo128457I7() {
        int i;
        this.f270188p.setVisibility(8);
        int width = this.f270185j.getWidth();
        int height = this.f270185j.getHeight();
        int i2 = this.f270192t;
        if (!(i2 == 0 || (i = this.f270193u) == 0)) {
            height = (int) ((((float) width) / ((float) i2)) * ((float) i));
        }
        C45059m0 m0Var = this.f270195w;
        m0Var.f122226f = width;
        m0Var.f122227g = height;
        m0Var.mo70410e(this.f270191s, this.f270190r, i2, this.f270193u);
        this.f270195w.mo70409d(this.f270187o, this.f270186n, new C93554c(), (C45059m0.C45066g) null);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a7f;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && -1 == i2) {
            String str = null;
            String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
            if (intent != null) {
                str = intent.getStringExtra("custom_send_text");
            }
            C93553b bVar = new C93553b(this, C76879j.m92723Q(getContext(), "", getString(C0966R.string.col), true, false, (DialogInterface.OnCancelListener) null));
            if (!Util.isNullOrNil(stringExtra)) {
                for (String next : Util.stringsToList(stringExtra.split(","))) {
                    C93594f1.m118182j(getContext(), next, this.f270181f, this.f270180e, this.f270182g, this.f270183h, bVar, this.f270176E);
                    if (!Util.isNullOrNil(str)) {
                        C7250m.m7431a().mo136257Tm(next, str, C45628s0.m50810y(next), 0);
                    }
                }
                C75026b.m89951a(this, getString(C0966R.string.cmm));
                return;
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        mo128457I7();
    }

    public void onCreate(Bundle bundle) {
        Bitmap b;
        super.onCreate(bundle);
        hideTitleView();
        if (C11171e.m11046c(19)) {
            getWindow().setFlags(201327616, 201327616);
        } else {
            getWindow().setFlags(1024, 1024);
        }
        this.f270179d = bundle;
        getWindow().addFlags(128);
        this.f270194v = getIntent().getBooleanExtra("key_detail_data_valid", true);
        this.f270181f = getIntent().getStringExtra("key_detail_fav_path");
        this.f270180e = getIntent().getStringExtra("key_detail_fav_thumb_path");
        this.f270182g = getIntent().getIntExtra("key_detail_fav_video_duration", 0);
        this.f270183h = getIntent().getStringExtra("key_detail_statExtStr");
        this.f270196x = getIntent().getIntExtra("key_detail_fav_video_scene_from", 0);
        this.f270197y = getIntent().getBooleanExtra("show_share", true);
        this.f270198z = getIntent().getBooleanExtra("key_detail_fav_video_show_download_status", false);
        this.f270172A = getIntent().getStringExtra("key_detail_data_id");
        this.f270173B = getIntent().getBooleanExtra("key_detail_is_data_exist", true);
        this.f270174C = getIntent().getStringExtra("record_data_id");
        this.f270175D = getIntent().getLongExtra("message_id", -1);
        this.f270176E = getIntent().getStringExtra("key_detail_msg_uuid");
        String str = "";
        if (!C86013q1.m106450k(this.f270180e) && (b = C93693r.m118401b(this.f270181f)) != null) {
            try {
                Log.m105924i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay: create thumbpath bitmap, saveBitmapToImage ");
                BitmapUtil.saveBitmapToImage(b, 60, Bitmap.CompressFormat.JPEG, this.f270180e, true);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FavoriteVideoPlayUI", e, str, new Object[0]);
            }
        }
        Object[] objArr = new Object[3];
        objArr[0] = Boolean.valueOf(this.f270194v);
        objArr[1] = Util.isNullOrNil(this.f270180e) ? str : this.f270180e;
        if (!Util.isNullOrNil(this.f270181f)) {
            str = this.f270181f;
        }
        objArr[2] = str;
        Log.m105925i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay: init data, isVideoValid: %B. thumbPath: %s, fullPath: %s", objArr);
        this.f270185j = (RelativeLayout) findViewById(C0966R.C0970id.l7w);
        this.f270187o = (FavVideoView) findViewById(C0966R.C0970id.l7x);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.l7k);
        this.f270186n = (ImageView) findViewById(C0966R.C0970id.ehi);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.f357986cv3);
        this.f270188p = linearLayout;
        if (!this.f270194v && linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        if (Util.isNullOrNil(this.f270181f)) {
            mo128456H7(imageView);
        } else if (C86013q1.m106450k(this.f270181f)) {
            this.f270187o.setVideoData(this.f270181f);
            Log.m105924i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay:  videoView.setVideoData(fullPath)");
        } else {
            mo128456H7(imageView);
        }
        if (this.f270197y) {
            this.f270187o.setOnLongClickListener(this.f270177F);
        }
        this.f270195w = new C45059m0((Context) null);
        this.f270187o.setCallback(new C93576o(this));
        this.f270187o.setOnClickListener(new C93577p(this));
        if (C85875k4.m106157N()) {
            this.f270187o.setVideoScaleType(C96814a.C96817e.CONTAIN);
        } else {
            this.f270187o.setVideoScaleType(C96814a.C96817e.DEFAULT);
        }
    }

    public void onDestroy() {
        setResult(0, getIntent().putExtra("key_activity_browse_time", getActivityBrowseTimeMs()));
        this.f270187o.mo128629d();
        getWindow().clearFlags(128);
        super.onDestroy();
    }

    public void onPause() {
        getWindow().setFlags(2048, 2048);
        if (this.f270187o.mo128628c()) {
            this.f270178G = true;
        }
        FavVideoView favVideoView = this.f270187o;
        Log.m105924i(favVideoView.f270528d, "VideoPlay:   onPause()");
        favVideoView.mo128636i();
        if (favVideoView.f270531g.isPlaying()) {
            Log.m105924i(favVideoView.f270528d, "VideoPlay: pausePlay()");
            favVideoView.f270531g.pause();
        }
        favVideoView.f270523F.stopTimer();
        favVideoView.setVideoStateIv(true);
        favVideoView.f270524G.stopTimer();
        super.onPause();
        C103928o.m138642b();
    }

    public void onResume() {
        getWindow().clearFlags(2048);
        Log.m105925i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay:  onResume,hadOnStart is %B", Boolean.valueOf(this.f270184i));
        this.f270184i = false;
        super.onResume();
        if (this.f270178G) {
            FavVideoView favVideoView = this.f270187o;
            favVideoView.mo128632g(favVideoView.f270536o.getmPosition());
            favVideoView.f270523F.startTimer(500);
            favVideoView.setVideoStateIv(false);
            if (favVideoView.f270545x) {
                favVideoView.f270524G.startTimer(4000);
            }
        }
        C103928o.m138641a(true, true, true);
    }

    public void onStart() {
        Bundle bundle = this.f270179d;
        if (!this.f270189q) {
            this.f270189q = true;
            this.f270190r = getIntent().getIntExtra("img_gallery_top", 0);
            this.f270191s = getIntent().getIntExtra("img_gallery_left", 0);
            this.f270192t = getIntent().getIntExtra("img_gallery_width", 0);
            int intExtra = getIntent().getIntExtra("img_gallery_height", 0);
            this.f270193u = intExtra;
            this.f270195w.mo70410e(this.f270191s, this.f270190r, this.f270192t, intExtra);
            if (bundle == null) {
                this.f270187o.getViewTreeObserver().addOnPreDrawListener(new C93582t(this));
            }
        }
        super.onStart();
    }
}
