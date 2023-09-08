package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.TalkRoomUitlEvent;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.modelavatar.C1295s;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C7013o;
import com.tencent.p014mm.pluginsdk.p133ui.GetHdHeadImageGalleryView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C7624i3;
import f12.C7970a;
import f40.C86709a0;
import nj3.C76912y0;
import p196ln.C10579k;
import p196ln.C117475p;
import p196ln.C61311l;
import p196ln.C76706g;
import p196ln.C76708i;
import p220pr.C77288i;
import qo3.C77407n;
import tm2.C14049d;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg */
public class PreviewHdHeadImg extends MMActivity {

    /* renamed from: i */
    public static final /* synthetic */ int f205624i = 0;

    /* renamed from: d */
    public GetHdHeadImageGalleryView f205625d;

    /* renamed from: e */
    public String f205626e;

    /* renamed from: f */
    public C61311l f205627f;

    /* renamed from: g */
    public String f205628g;

    /* renamed from: h */
    public boolean f205629h = false;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg$a */
    public class C5238a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f20733d;

        public C5238a(Bitmap bitmap) {
            this.f20733d = bitmap;
        }

        public void run() {
            Log.m105919d("MicroMsg.PreviewHdHeadImg", "updateHeadImg hasUin:%b user:%s", Boolean.valueOf(C86709a0.m107522a()), C75592q0.m90789s());
            if (C86709a0.m107522a()) {
                if (this.f20733d != null) {
                    C10579k RE = ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE();
                    PreviewHdHeadImg.m83514H7(this.f20733d, ((AvatarStorage) RE).mo93558g(C75592q0.m90789s() + ".last", true, false));
                }
                C7624i3.f25910c.mo8754b(((C76708i) C86312j.m106911c(C76708i.class)).eg0(C75592q0.m90789s(), false, true));
                ((C77288i) C86312j.m106911c(C77288i.class)).ex0();
            }
            PreviewHdHeadImg previewHdHeadImg = PreviewHdHeadImg.this;
            int i = PreviewHdHeadImg.f205624i;
            previewHdHeadImg.mo97699J7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg$b */
    public class C71042b implements MenuItem.OnMenuItemClickListener {
        public C71042b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            PreviewHdHeadImg previewHdHeadImg = PreviewHdHeadImg.this;
            int i = PreviewHdHeadImg.f205624i;
            previewHdHeadImg.getClass();
            C77407n nVar = new C77407n((Context) previewHdHeadImg, 1, false);
            nVar.f225771i = new C71155t(previewHdHeadImg);
            nVar.f225782p = new C5402u(previewHdHeadImg);
            nVar.mo107573q();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg$c */
    public class C71043c implements MenuItem.OnMenuItemClickListener {
        public C71043c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            PreviewHdHeadImg.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg$d */
    public class C71044d implements Runnable {
        public C71044d() {
        }

        public void run() {
            PreviewHdHeadImg previewHdHeadImg = PreviewHdHeadImg.this;
            int i = PreviewHdHeadImg.f205624i;
            previewHdHeadImg.getClass();
            C77407n nVar = new C77407n((Context) previewHdHeadImg, 1, false);
            nVar.f225771i = new C71155t(previewHdHeadImg);
            nVar.f225782p = new C5402u(previewHdHeadImg);
            nVar.mo107573q();
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg$e */
    public class C71045e implements C61311l.C61312a {

        /* renamed from: a */
        public final /* synthetic */ Bitmap f205633a;

        public C71045e(Bitmap bitmap) {
            this.f205633a = bitmap;
        }

        /* renamed from: a */
        public int mo1218a(int i, int i2) {
            Class cls = C76706g.class;
            PreviewHdHeadImg.this.f205627f.mo86278a();
            Log.m105925i("MicroMsg.PreviewHdHeadImg", "onSceneEnd: errType=%d, errCode=%d", Integer.valueOf(i), Integer.valueOf(i2));
            if (i == 0 && i2 == 0) {
                Bitmap k = ((AvatarStorage) ((C76706g) C86312j.m106911c(cls)).mo106826RE()).mo93562k(PreviewHdHeadImg.this.f205626e);
                if (k != null) {
                    PreviewHdHeadImg.this.mo97698I7(k, ((AvatarStorage) ((C76706g) C86312j.m106911c(cls)).mo106826RE()).mo93559h(PreviewHdHeadImg.this.f205626e, true));
                } else {
                    PreviewHdHeadImg.this.mo97698I7(this.f205633a, (String) null);
                }
                return 0;
            }
            PreviewHdHeadImg.this.mo97698I7(this.f205633a, (String) null);
            return 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg$f */
    public class C71046f implements Runnable {
        public C71046f(PreviewHdHeadImg previewHdHeadImg) {
        }

        public void run() {
            TalkRoomUitlEvent talkRoomUitlEvent = new TalkRoomUitlEvent();
            talkRoomUitlEvent.f193954d.f193956b = true;
            talkRoomUitlEvent.publish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg$g */
    public class C71047g implements Runnable {
        public C71047g(PreviewHdHeadImg previewHdHeadImg) {
        }

        public void run() {
            TalkRoomUitlEvent talkRoomUitlEvent = new TalkRoomUitlEvent();
            talkRoomUitlEvent.f193954d.f193956b = true;
            talkRoomUitlEvent.publish();
        }
    }

    /* renamed from: H7 */
    public static boolean m83514H7(Bitmap bitmap, String str) {
        if (str != null && !str.equals("")) {
            try {
                BitmapUtil.saveBitmapToImage(bitmap, 100, Bitmap.CompressFormat.PNG, str, true);
                return true;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.PreviewHdHeadImg", e, "", new Object[0]);
                Log.m105920e("MicroMsg.PreviewHdHeadImg", "saveBitmapToImage failed:" + e.toString());
            }
        }
        return false;
    }

    /* renamed from: I7 */
    public final void mo97698I7(Bitmap bitmap, String str) {
        Bitmap bitmap2;
        if (bitmap != null) {
            try {
                if (bitmap.getWidth() < 480) {
                    float width = 480.0f / ((float) bitmap.getWidth());
                    Matrix matrix = new Matrix();
                    matrix.postScale(width, width);
                    bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                } else {
                    bitmap2 = bitmap;
                }
                Log.m105919d("MicroMsg.PreviewHdHeadImg", "dkhdbm old[%d %d] new[%d %d]", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Integer.valueOf(bitmap2.getWidth()), Integer.valueOf(bitmap2.getHeight()));
                this.f205625d.setHdHeadImage(bitmap2);
                this.f205625d.setHdHeadImagePath(str);
                this.f205628g = str;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.PreviewHdHeadImg", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: J7 */
    public final void mo97699J7() {
        Class cls = C76706g.class;
        if (!C86709a0.m107535s().mo121147n()) {
            C76912y0.m92771j(getContext(), (View) null);
            mo97698I7(((AvatarStorage) ((C76706g) C86312j.m106911c(cls)).mo106826RE()).mo93560i(getContext()), (String) null);
            return;
        }
        Bitmap Fj = ((C76708i) C86312j.m106911c(C76708i.class)).mo106820Fj(this.f205626e, true);
        if (Fj == null) {
            Fj = BitmapFactory.decodeResource(getResources(), C0966R.C0969drawable.bfa);
        }
        if (Fj == null || Fj.isRecycled()) {
            Log.m105925i("MicroMsg.PreviewHdHeadImg", "The avatar of %s is not in the cache, use default avatar", this.f205626e);
        } else {
            Log.m105925i("MicroMsg.PreviewHdHeadImg", "The avatar of %s is in the cache", this.f205626e);
            this.f205625d.setThumbImage(Fj);
        }
        Bitmap k = ((AvatarStorage) ((C76706g) C86312j.m106911c(cls)).mo106826RE()).mo93562k(this.f205626e);
        if (k == null || k.isRecycled()) {
            C61311l hl02 = ((C76706g) C86312j.m106911c(cls)).hl0();
            this.f205627f = hl02;
            hl02.mo86279b(this.f205626e, new C71045e(Fj));
            return;
        }
        Log.m105925i("MicroMsg.PreviewHdHeadImg", "The HDAvatar of %s is already exists", this.f205626e);
        mo97698I7(k, ((AvatarStorage) ((C76706g) C86312j.m106911c(cls)).mo106826RE()).mo93559h(this.f205626e, true));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ayc;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.iqr);
        setActionbarColor(getResources().getColor(C0966R.color.ahf));
        setNavigationbarColor(getResources().getColor(C0966R.color.BW_0));
        this.f205626e = C75592q0.m90789s();
        this.f205629h = getIntent().getBooleanExtra("need_show_menu_choose", false);
        GetHdHeadImageGalleryView getHdHeadImageGalleryView = (GetHdHeadImageGalleryView) findViewById(C0966R.C0970id.ehh);
        this.f205625d = getHdHeadImageGalleryView;
        getHdHeadImageGalleryView.setUsername(this.f205626e);
        mo97699J7();
        addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C71042b());
        setBackBtn(new C71043c());
        if (this.f205629h) {
            this.f205625d.postDelayed(new C71044d(), 150);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105925i("MicroMsg.PreviewHdHeadImg", "onAcvityResult requestCode:%d, resultCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (intent == null) {
            Log.m105920e("MicroMsg.PreviewHdHeadImg", "wtf!!! data is null!!!");
        }
        if (i2 != -1) {
            if (i == 2 || i == 4) {
                new MMHandler(Looper.getMainLooper()).post(new C71046f(this));
            }
        } else if (i != 2) {
            if (i == 4) {
                new MMHandler(Looper.getMainLooper()).post(new C71047g(this));
                if (intent != null) {
                    String stringExtra = intent.getStringExtra("CropImage_OutputPath");
                    Bitmap bitmapNative = BitmapUtil.getBitmapNative(this.f205628g);
                    if (stringExtra == null) {
                        Log.m105920e("MicroMsg.PreviewHdHeadImg", "crop picture failed");
                        return;
                    }
                    mo97698I7(BitmapUtil.getBitmapNative(stringExtra), (String) null);
                    boolean booleanExtra = intent.getBooleanExtra("CropImage_NeedCompress", true);
                    ((C1295s) ((C117475p) C86312j.m106911c(C117475p.class)).mo182091fC(getContext(), stringExtra, false)).mo1220b(1, new C5238a(bitmapNative), booleanExtra);
                }
            }
        } else if (intent != null) {
            Intent intent2 = new Intent();
            intent2.putExtra("CropImageMode", 1);
            intent2.putExtra("CropImage_Filter", true);
            C10579k RE = ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE();
            intent2.putExtra("CropImage_OutputPath", ((AvatarStorage) RE).mo93559h(C75592q0.m90789s() + ".crop", true));
            intent2.putExtra("CropImage_ImgPath", (String) null);
            intent2.putExtra("CropImage_from_scene", 3);
            ((C67654r1) C14049d.m13403b()).mo93179l(this, intent, intent2, C7970a.m8127a(), 4, (C7013o.C7017c) null);
        }
    }

    public void onCreate(Bundle bundle) {
        customfixStatusbar(true);
        super.onCreate(bundle);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        initView();
    }
}
