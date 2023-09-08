package com.tencent.p014mm.p136ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.cache.ArtistCacheManager;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.remoteservice.C96905d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import ig3.C108460i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ke3.C88144b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76875f0;
import nj3.C76879j;
import nj3.C88989a;
import p1093bh.C104084a;
import p159gw.C98250h;
import p248ug.C111159e;
import p248ug.C111163p0;
import p248ug.C111164r0;
import p248ug.C111167t;
import p248ug.C111168v;
import p511ew.C58849b;
import p520fi.C107544a;
import p910lj.C76701a;
import qo3.C77407n;
import qo3.C89779i0;

@C88989a(19)
/* renamed from: com.tencent.mm.ui.MMNewPhotoEditUI */
public class MMNewPhotoEditUI extends MMActivity implements C111168v {

    /* renamed from: t */
    public static final /* synthetic */ int f318652t = 0;

    /* renamed from: d */
    public C111164r0 f318653d;

    /* renamed from: e */
    public String f318654e;

    /* renamed from: f */
    public long f318655f;

    /* renamed from: g */
    public String f318656g;

    /* renamed from: h */
    public String f318657h;

    /* renamed from: i */
    public boolean f318658i;

    /* renamed from: j */
    public int f318659j;

    /* renamed from: n */
    public boolean f318660n;

    /* renamed from: o */
    public final C96905d f318661o = new C96905d(this);

    /* renamed from: p */
    public PhotoEditProxy f318662p;

    /* renamed from: q */
    public List<String> f318663q = new ArrayList();

    /* renamed from: r */
    public Dialog f318664r;

    /* renamed from: s */
    public C89779i0 f318665s = null;

    /* renamed from: com.tencent.mm.ui.MMNewPhotoEditUI$a */
    public class C106636a implements Runnable {
        public C106636a() {
        }

        public void run() {
            Log.m105924i("MicroMsg.MMNewPhotoEditUI", "connected!!!");
            MMNewPhotoEditUI mMNewPhotoEditUI = MMNewPhotoEditUI.this;
            int i = MMNewPhotoEditUI.f318652t;
            Intent intent = mMNewPhotoEditUI.getIntent();
            mMNewPhotoEditUI.f318654e = intent.getStringExtra("raw_photo_path");
            mMNewPhotoEditUI.f318655f = intent.getLongExtra("raw_photo_img_id", -1);
            mMNewPhotoEditUI.f318656g = intent.getStringExtra("after_photo_edit");
            mMNewPhotoEditUI.f318659j = intent.getIntExtra("from_scene", 0);
            mMNewPhotoEditUI.f318660n = intent.getBooleanExtra("from_scene_small_preview", false);
            mMNewPhotoEditUI.f318658i = mMNewPhotoEditUI.f318662p.isAutoSave();
            MMNewPhotoEditUI.this.initView();
        }
    }

    /* renamed from: com.tencent.mm.ui.MMNewPhotoEditUI$b */
    public class C106637b implements C111163p0 {
        public C106637b() {
        }

        /* renamed from: a */
        public void mo150361a(C111167t tVar) {
            Log.m105925i("MicroMsg.MMNewPhotoEditUI", "[onSelectedFeature] features:%s", tVar.name());
        }

        /* renamed from: b */
        public void mo150362b(boolean z) {
            if (z) {
                MMNewPhotoEditUI.this.showVKB();
                return;
            }
            MMNewPhotoEditUI mMNewPhotoEditUI = MMNewPhotoEditUI.this;
            mMNewPhotoEditUI.hideVKB(mMNewPhotoEditUI.getContentView());
        }

        /* renamed from: c */
        public void mo150363c(C111167t tVar, int i, Object obj) {
            Log.m105925i("MicroMsg.MMNewPhotoEditUI", "[onSelectedDetailFeature] features:%s index:%s", tVar.name(), Integer.valueOf(i));
        }
    }

    /* renamed from: com.tencent.mm.ui.MMNewPhotoEditUI$c */
    public class C106638c implements C11182m0 {
        public C106638c() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107142f(0, MMNewPhotoEditUI.this.getString(C0966R.string.i4e));
            e0Var.mo107142f(1, MMNewPhotoEditUI.this.getString(C0966R.string.f361137hk2));
            e0Var.mo107142f(2, MMNewPhotoEditUI.this.getString(C0966R.string.iam));
        }
    }

    /* renamed from: com.tencent.mm.ui.MMNewPhotoEditUI$d */
    public class C106639d implements C11184p0 {

        /* renamed from: com.tencent.mm.ui.MMNewPhotoEditUI$d$a */
        public class C106640a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f318670d;

            public C106640a(int i) {
                this.f318670d = i;
            }

            public void run() {
                MMNewPhotoEditUI mMNewPhotoEditUI = MMNewPhotoEditUI.this;
                int i = this.f318670d;
                int i2 = MMNewPhotoEditUI.f318652t;
                mMNewPhotoEditUI.mo153392K7(true);
                mMNewPhotoEditUI.f318653d.mo162898g(new C106714l2(mMNewPhotoEditUI, i));
            }
        }

        /* renamed from: com.tencent.mm.ui.MMNewPhotoEditUI$d$b */
        public class C106641b implements Runnable {
            public C106641b() {
            }

            public void run() {
                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMNewPhotoEditUI.this.getResources().getString(C0966R.string.cbl), 1).show();
            }
        }

        public C106639d() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            ((C98250h) C86312j.m106911c(C98250h.class)).mo137341Iy(MMNewPhotoEditUI.this, new C106640a(i), new C106641b());
        }
    }

    /* renamed from: H7 */
    public static void m143993H7(MMNewPhotoEditUI mMNewPhotoEditUI, String str) {
        mMNewPhotoEditUI.getClass();
        Intent intent = new Intent();
        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 8);
        intent.putExtra("select_is_ret", true);
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("image_path", str);
        intent.putExtra("Retr_Msg_Type", 0);
        C88144b.m109802t(mMNewPhotoEditUI, ".ui.transmit.SelectConversationUI", intent, 1);
    }

    /* renamed from: I7 */
    public static void m143994I7(MMNewPhotoEditUI mMNewPhotoEditUI, int i) {
        MMNewPhotoEditUI mMNewPhotoEditUI2 = mMNewPhotoEditUI;
        int i2 = mMNewPhotoEditUI2.f318659j;
        int i3 = (i2 == 290 || i2 == 291) ? 1 : (i2 == 4 || i2 == 293) ? 2 : 0;
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(13858, Integer.valueOf(i3), 1, 1, Integer.valueOf(i));
        int b = ((C108460i) mMNewPhotoEditUI2.f318653d.mo162893b()).mo159002b();
        int e = ((C108460i) mMNewPhotoEditUI2.f318653d.mo162893b()).mo159005e();
        int c = ((C108460i) mMNewPhotoEditUI2.f318653d.mo162893b()).mo159003c();
        int a = ((C108460i) mMNewPhotoEditUI2.f318653d.mo162893b()).mo159001a();
        ((C108460i) mMNewPhotoEditUI2.f318653d.mo162893b()).getClass();
        C107544a aVar = (C107544a) ArtistCacheManager.m140185a().mo148160c(C104084a.CROP_PHOTO);
        int i4 = (aVar != null && aVar.mo157975D1(true) > 0) ? 1 : 0;
        boolean h = ((C108460i) mMNewPhotoEditUI2.f318653d.mo162893b()).mo159008h();
        int f = ((C108460i) mMNewPhotoEditUI2.f318653d.mo162893b()).mo159006f();
        Object[] objArr = new Object[8];
        objArr[0] = Integer.valueOf(b);
        objArr[1] = Integer.valueOf(e);
        objArr[2] = Integer.valueOf(c);
        objArr[3] = Integer.valueOf(a);
        objArr[4] = Integer.valueOf(i4);
        objArr[5] = Integer.valueOf(f);
        objArr[6] = Integer.valueOf(mMNewPhotoEditUI2.f318660n ? 5 : 4);
        objArr[7] = Boolean.valueOf(h);
        Log.m105925i("MicroMsg.MMNewPhotoEditUI", "[reportPhotoEdit] emojiCount:%s,textCount:%s,mosaicCount:%s,penCount:%s,isCrop:%s,undoCount:%s,mSmallPreview:%s isRotaion:%s", objArr);
        Object[] objArr2 = new Object[11];
        objArr2[0] = 0;
        objArr2[1] = 1;
        objArr2[2] = Integer.valueOf(b);
        objArr2[3] = Integer.valueOf(e);
        int i5 = 4;
        objArr2[4] = Integer.valueOf(c);
        objArr2[5] = Integer.valueOf(a);
        objArr2[6] = Integer.valueOf(i4);
        objArr2[7] = Integer.valueOf(f);
        objArr2[8] = 1;
        if (mMNewPhotoEditUI2.f318660n) {
            i5 = 5;
        }
        objArr2[9] = Integer.valueOf(i5);
        objArr2[10] = Integer.valueOf(h ? 1 : 0);
        nVar.mo160131h(13857, objArr2);
    }

    /* renamed from: J7 */
    public static void m143995J7(MMNewPhotoEditUI mMNewPhotoEditUI, String str) {
        mMNewPhotoEditUI.getClass();
        boolean z = true;
        Log.m105925i("MicroMsg.MMNewPhotoEditUI", "[gotoImagePreviewUI] :%s", str);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<String> stringArrayListExtra = mMNewPhotoEditUI.getIntent().getStringArrayListExtra("preview_image_list");
        ArrayList<String> stringArrayListExtra2 = mMNewPhotoEditUI.getIntent().getStringArrayListExtra("preview_select_image_list");
        int i = 0;
        while (stringArrayListExtra != null && i < stringArrayListExtra.size()) {
            String str2 = stringArrayListExtra.get(i);
            if (str2.equalsIgnoreCase(Util.nullAsNil(mMNewPhotoEditUI.f318654e)) || str2.equalsIgnoreCase(Util.nullAsNil(mMNewPhotoEditUI.f318656g))) {
                str2 = str;
            }
            arrayList.add(str2);
            i++;
        }
        int i2 = 0;
        while (stringArrayListExtra2 != null && i2 < stringArrayListExtra2.size()) {
            String str3 = stringArrayListExtra2.get(i2);
            if (str3.equalsIgnoreCase(Util.nullAsNil(mMNewPhotoEditUI.f318654e)) || str3.equalsIgnoreCase(Util.nullAsNil(mMNewPhotoEditUI.f318656g))) {
                str3 = str;
            }
            arrayList2.add(str3);
            i2++;
        }
        String str4 = null;
        if (!mMNewPhotoEditUI.f318658i) {
            str4 = C86013q1.m106448i("wcf://temp/photoEdited_" + System.currentTimeMillis(), true);
            C86013q1.m106442c(str, str4);
        }
        C86013q1.m106447h(mMNewPhotoEditUI.f318656g);
        Intent intent = new Intent();
        intent.addFlags(67108864);
        intent.putExtra("max_select_count", mMNewPhotoEditUI.getIntent().getIntExtra("max_select_count", 9));
        intent.putExtra("isPreviewPhoto", true);
        intent.putExtra("raw_photo_path", mMNewPhotoEditUI.f318654e);
        intent.putExtra("raw_photo_img_id", mMNewPhotoEditUI.f318655f);
        intent.putExtra("after_photo_edit", str);
        intent.putExtra("tmp_photo_edit", str4);
        Bundle bundle = new Bundle();
        bundle.putString("raw_photo_path", mMNewPhotoEditUI.f318654e);
        bundle.putString("after_photo_edit", str);
        bundle.putInt("report_info_emotion_count", ((C108460i) mMNewPhotoEditUI.f318653d.mo162893b()).mo159002b());
        bundle.putInt("report_info_text_count", ((C108460i) mMNewPhotoEditUI.f318653d.mo162893b()).mo159005e());
        bundle.putInt("report_info_mosaic_count", ((C108460i) mMNewPhotoEditUI.f318653d.mo162893b()).mo159003c());
        bundle.putInt("report_info_doodle_count", ((C108460i) mMNewPhotoEditUI.f318653d.mo162893b()).mo159001a());
        ((C108460i) mMNewPhotoEditUI.f318653d.mo162893b()).getClass();
        C107544a aVar = (C107544a) ArtistCacheManager.m140185a().mo148160c(C104084a.CROP_PHOTO);
        if (aVar == null || aVar.mo157975D1(true) <= 0) {
            z = false;
        }
        bundle.putBoolean("report_info_iscrop", z);
        bundle.putInt("report_info_undo_count", ((C108460i) mMNewPhotoEditUI.f318653d.mo162893b()).mo159006f());
        bundle.putBoolean("report_info_is_rotation", ((C108460i) mMNewPhotoEditUI.f318653d.mo162893b()).mo159008h());
        intent.putExtra("report_info", bundle);
        String stringExtra = mMNewPhotoEditUI.getIntent().getStringExtra("GalleryUI_FromUser");
        String stringExtra2 = mMNewPhotoEditUI.getIntent().getStringExtra("GalleryUI_ToUser");
        if (!Util.isNullOrNil(stringExtra)) {
            intent.putExtra("GalleryUI_FromUser", stringExtra);
        }
        if (!Util.isNullOrNil(stringExtra2)) {
            intent.putExtra("GalleryUI_ToUser", stringExtra2);
        }
        intent.putStringArrayListExtra("preview_image_list", arrayList);
        intent.putStringArrayListExtra("preview_select_image_list", arrayList2);
        mMNewPhotoEditUI.setResult(-1, intent);
        mMNewPhotoEditUI.mo153392K7(false);
        mMNewPhotoEditUI.finish();
    }

    /* renamed from: K7 */
    public final void mo153392K7(boolean z) {
        Log.m105925i("MicroMsg.MMNewPhotoEditUI", "[setProgress] isVisible:%s", Boolean.valueOf(z));
        if (z) {
            this.f318665s = C89779i0.m112248e(this, getString(C0966R.string.f361143hn1), true, 0, (DialogInterface.OnCancelListener) null);
            return;
        }
        C89779i0 i0Var = this.f318665s;
        if (i0Var != null && i0Var.isShowing()) {
            this.f318665s.dismiss();
            this.f318665s = null;
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bkv;
    }

    public void initView() {
        FrameLayout frameLayout = (FrameLayout) findViewById(C0966R.C0970id.br8);
        C111164r0 ZD = ((C58849b) C86312j.m106911c(C58849b.class)).mo58069ZD();
        this.f318653d = ZD;
        C111164r0.C111165a aVar = new C111164r0.C111165a();
        int i = this.f318659j;
        aVar.f332925b = (i == 291 || i == 293) ? false : true;
        aVar.f332926c = true;
        aVar.f332924a = C111164r0.C111166b.PHOTO;
        aVar.f332927d = this.f318654e;
        ZD.mo162895d(aVar);
        C111159e c = this.f318653d.mo162894c(getContext());
        c.setActionBarCallback(this);
        frameLayout.addView(c, new FrameLayout.LayoutParams(-1, -1));
        c.setSelectedFeatureListener(new C106637b());
    }

    /* renamed from: o0 */
    public void mo79182o0() {
        onBackPressed();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1 && intent != null) {
            String stringExtra = intent.getStringExtra("Select_Conv_User");
            Log.m105919d("MicroMsg.MMNewPhotoEditUI", "select %s for sending imagePath:%s", stringExtra, this.f318657h);
            this.f318664r = C76879j.m92723Q(getContext(), "", getString(C0966R.string.hit), true, false, (DialogInterface.OnCancelListener) null);
            String stringExtra2 = intent.getStringExtra("custom_send_text");
            PhotoEditProxy photoEditProxy = this.f318662p;
            photoEditProxy.sendImage(stringExtra2, this.f318657h, photoEditProxy.getSelfUsername(), stringExtra);
            Dialog dialog = this.f318664r;
            if (dialog != null) {
                dialog.dismiss();
            }
            if (!this.f318658i) {
                C86013q1.m106447h(this.f318657h);
            } else {
                AndroidMediaUtil.refreshMediaScanner(this.f318657h, this);
            }
            finish();
        } else if (intent == null && !Util.isNullOrNil(this.f318657h) && this.f318659j == 291) {
            C86013q1.m106447h(this.f318657h);
        }
    }

    public void onBackPressed() {
        if (!this.f318653d.mo162896e()) {
            int i = this.f318659j;
            if (i == 290 || i == 291) {
                C115669n.INSTANCE.mo160131h(13859, 1, 2);
            } else if (i == 4 || i == 293) {
                C115669n.INSTANCE.mo160131h(13859, 2, 2);
            } else {
                C115669n.INSTANCE.mo160131h(13859, 0, 2);
            }
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fullScreenNoTitleBar(true, 0);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(67108864);
        C74779i.m89536a(this, false);
        this.f318662p = new PhotoEditProxy(this.f318661o);
        this.f318661o.mo135257a(new C106636a());
    }

    public void onDestroy() {
        super.onDestroy();
        this.f318653d.mo162897f();
        this.f318661o.mo135260d();
    }

    public void onFinish() {
        int i = this.f318659j;
        if (i == 290 || i == 291) {
            C115669n.INSTANCE.mo160131h(13859, 1, 1);
        } else if (i == 4 || i == 293) {
            C115669n.INSTANCE.mo160131h(13859, 2, 1);
        } else {
            C115669n.INSTANCE.mo160131h(13859, 0, 1);
        }
        int i2 = this.f318659j;
        if (i2 == 291 || i2 == 293) {
            AppCompatActivity context = getContext();
            LayoutInflater.from(context);
            C77407n nVar = new C77407n((Context) context, 1, false);
            ArrayList arrayList = new ArrayList();
            new ArrayList();
            C106638c cVar = new C106638c();
            C106639d dVar = new C106639d();
            AppCompatActivity context2 = getContext();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C76875f0 f0Var = (C76875f0) ((MenuItem) it.next());
                f0Var.f224728w = null;
                f0Var.f224729x = null;
            }
            arrayList.clear();
            C76874e0 e0Var = new C76874e0(context);
            cVar.onCreateMMMenu(e0Var);
            if (e0Var.mo107176v()) {
                Log.m105928w("MicroMsg.MMSubMenuHelper", "show, menu empty");
            } else {
                nVar.f225771i = cVar;
                nVar.f225782p = dVar;
                nVar.f225761d = null;
                nVar.f225725D = null;
                nVar.mo107573q();
            }
            C76879j.m92730a(context2, (Dialog) null);
            return;
        }
        mo153392K7(true);
        this.f318653d.mo162898g(new C106714l2(this, -1));
    }
}
