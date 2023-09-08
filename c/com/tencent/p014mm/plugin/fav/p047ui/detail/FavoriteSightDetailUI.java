package com.tencent.p014mm.plugin.fav.p047ui.detail;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.MMLoadScrollView;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.fav.p047ui.C93594f1;
import com.tencent.p014mm.plugin.fav.p047ui.C93685p0;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C45612m0;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76879j;
import p182kk.C61104a;
import pb1.C100695a0;
import pb1.C100703e0;
import pb1.C100710h0;
import pb1.C100717j0;
import pb1.C100718j1;
import pb1.C100723m0;
import pb1.C100734q;
import pb1.C100746u;
import pb1.C100755z;
import qo3.C77407n;
import qo3.C89779i0;
import te3.C101834rc0;
import te3.C101849uc0;
import wc3.C78538u;
import xb1.C102612a;
import xb1.C102614d;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI */
public class FavoriteSightDetailUI extends BaseFavDetailReportUI implements C100723m0, MStorage.IOnStorageChange {

    /* renamed from: A */
    public boolean f270127A = false;

    /* renamed from: j */
    public View f270128j;

    /* renamed from: n */
    public ImageView f270129n;

    /* renamed from: o */
    public MMPinProgressBtn f270130o;

    /* renamed from: p */
    public VideoPlayerTextureView f270131p;

    /* renamed from: q */
    public ImageView f270132q;

    /* renamed from: r */
    public C100755z f270133r;

    /* renamed from: s */
    public C101834rc0 f270134s;

    /* renamed from: t */
    public long f270135t;

    /* renamed from: u */
    public boolean f270136u = true;

    /* renamed from: v */
    public boolean f270137v = false;

    /* renamed from: w */
    public boolean f270138w = false;

    /* renamed from: x */
    public boolean f270139x = false;

    /* renamed from: y */
    public C100703e0 f270140y = new C100703e0();

    /* renamed from: z */
    public Runnable f270141z = new C93541e();

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI$a */
    public class C93531a implements View.OnClickListener {
        public C93531a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/detail/FavoriteSightDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C61104a.m71669y(view.getContext()) || C61104a.m71665u(view.getContext()) || C61104a.m71649e(view.getContext())) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteSightDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            Log.m105925i("MicroMsg.FavoriteSightDetailUI", "click item favid %d, localid %d, itemstatus %d", Integer.valueOf(FavoriteSightDetailUI.this.f270133r.field_id), Long.valueOf(FavoriteSightDetailUI.this.f270133r.field_localId), Integer.valueOf(FavoriteSightDetailUI.this.f270133r.field_itemStatus));
            if (!FavoriteSightDetailUI.this.f270133r.mo140189x2()) {
                FavoriteSightDetailUI favoriteSightDetailUI = FavoriteSightDetailUI.this;
                C100755z zVar = favoriteSightDetailUI.f270133r;
                if (zVar.field_itemStatus == 8) {
                    if (Util.isNullOrNil(favoriteSightDetailUI.f270134s.f299325s)) {
                        FavoriteSightDetailUI.m118153K7(FavoriteSightDetailUI.this, false, view.getContext());
                        C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteSightDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                } else if (zVar.mo140190y2() || FavoriteSightDetailUI.this.f270133r.mo140175B2()) {
                    if (FavoriteSightDetailUI.this.f270130o.getVisibility() == 8) {
                        FavoriteSightDetailUI.this.mo128438M7(false);
                    }
                    C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteSightDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            } else if (C100734q.m131834Y(FavoriteSightDetailUI.this.f270134s)) {
                C100710h0.m131765b(C100710h0.C100711a.EnterFullScreen, FavoriteSightDetailUI.this.f270133r);
                FavoriteSightDetailUI.m118153K7(FavoriteSightDetailUI.this, true, view.getContext());
                C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteSightDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else if (Util.isNullOrNil(FavoriteSightDetailUI.this.f270134s.f299325s)) {
                FavoriteSightDetailUI.m118153K7(FavoriteSightDetailUI.this, false, view.getContext());
                C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteSightDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                Log.m105928w("MicroMsg.FavoriteSightDetailUI", "? info is done, source file not exist, cdn data url is not null");
            }
            if (FavoriteSightDetailUI.this.f270133r.mo140174A2()) {
                C100734q.m131863n0(FavoriteSightDetailUI.this.f270133r, true);
            } else {
                C100734q.m131861m0(FavoriteSightDetailUI.this.f270133r, true);
            }
            FavoriteSightDetailUI.this.mo128438M7(false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteSightDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI$b */
    public class C93532b implements C96875r0.C96876a {

        /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI$b$a */
        public class C93533a implements Runnable {
            public C93533a() {
            }

            public void run() {
                FavoriteSightDetailUI.this.f270132q.setVisibility(8);
            }
        }

        /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI$b$b */
        public class C93534b implements Runnable {
            public C93534b() {
            }

            public void run() {
                C76879j.m92738i(FavoriteSightDetailUI.this.getContext(), C0966R.string.kae, C0966R.string.f361492kb2);
            }
        }

        public C93532b() {
        }

        /* renamed from: M0 */
        public int mo76207M0(int i, int i2) {
            return 0;
        }

        public void onCompletion() {
            FavoriteSightDetailUI.this.f270131p.mo24788d(0.0d);
        }

        public void onError(int i, int i2) {
            Log.m105921e("MicroMsg.FavoriteSightDetailUI", "VideoPlay: on play video error what %d extra %d.", Integer.valueOf(i), Integer.valueOf(i2));
            if (i == -1) {
                FavoriteSightDetailUI.this.f270131p.stop();
                if (C86013q1.m106450k(C100734q.m131880w(FavoriteSightDetailUI.this.f270134s))) {
                    FavoriteSightDetailUI.this.mo128437L7();
                } else if (C86013q1.m106450k(C100734q.m131826Q(FavoriteSightDetailUI.this.f270134s))) {
                    FavoriteSightDetailUI.this.f270132q.setVisibility(0);
                }
            } else {
                FavoriteSightDetailUI favoriteSightDetailUI = FavoriteSightDetailUI.this;
                if (favoriteSightDetailUI.f270138w) {
                    onCompletion();
                    return;
                }
                favoriteSightDetailUI.f270131p.stop();
                FavoriteSightDetailUI favoriteSightDetailUI2 = FavoriteSightDetailUI.this;
                if (!favoriteSightDetailUI2.f270137v) {
                    favoriteSightDetailUI2.f270137v = true;
                    MMHandlerThread.postToMainThread(new C93534b());
                }
            }
        }

        public void onPrepared() {
            Log.m105924i("MicroMsg.FavoriteSightDetailUI", " onPrepared");
            FavoriteSightDetailUI.this.f270131p.setLoop(true);
            FavoriteSightDetailUI favoriteSightDetailUI = FavoriteSightDetailUI.this;
            favoriteSightDetailUI.f270138w = favoriteSightDetailUI.f270131p.start();
            MMHandlerThread.postToMainThread(new C93533a());
        }

        /* renamed from: p3 */
        public void mo76226p3(int i, int i2) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI$c */
    public class C93535c implements MenuItem.OnMenuItemClickListener {
        public C93535c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            FavoriteSightDetailUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI$d */
    public class C93536d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI$d$a */
        public class C93537a implements C11182m0 {
            public C93537a() {
            }

            /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onCreateMMMenu(nj3.C76874e0 r4) {
                /*
                    r3 = this;
                    com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI$d r0 = com.tencent.p014mm.plugin.fav.p047ui.detail.FavoriteSightDetailUI.C93536d.this
                    com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI r0 = com.tencent.p014mm.plugin.fav.p047ui.detail.FavoriteSightDetailUI.this
                    pb1.z r0 = r0.f270133r
                    boolean r0 = r0.mo140184m2()
                    r1 = 0
                    if (r0 == 0) goto L_0x001d
                    com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI$d r0 = com.tencent.p014mm.plugin.fav.p047ui.detail.FavoriteSightDetailUI.C93536d.this
                    com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI r0 = com.tencent.p014mm.plugin.fav.p047ui.detail.FavoriteSightDetailUI.this
                    pb1.e0 r2 = r0.f270140y
                    pb1.z r0 = r0.f270133r
                    boolean r0 = r2.mo140134c(r0)
                    if (r0 != 0) goto L_0x001d
                    r0 = 1
                    goto L_0x001e
                L_0x001d:
                    r0 = 0
                L_0x001e:
                    if (r0 == 0) goto L_0x0034
                    com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI$d r0 = com.tencent.p014mm.plugin.fav.p047ui.detail.FavoriteSightDetailUI.C93536d.this
                    com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI r0 = com.tencent.p014mm.plugin.fav.p047ui.detail.FavoriteSightDetailUI.this
                    te3.rc0 r2 = r0.f270134s
                    int r2 = r2.f299322q1
                    if (r2 != 0) goto L_0x0034
                    r2 = 2131825778(0x7f111472, float:1.9284422E38)
                    java.lang.String r0 = r0.getString(r2)
                    r4.mo107142f(r1, r0)
                L_0x0034:
                    r0 = 4
                    com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI$d r1 = com.tencent.p014mm.plugin.fav.p047ui.detail.FavoriteSightDetailUI.C93536d.this
                    com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI r1 = com.tencent.p014mm.plugin.fav.p047ui.detail.FavoriteSightDetailUI.this
                    r2 = 2131825765(0x7f111465, float:1.9284395E38)
                    java.lang.String r1 = r1.getString(r2)
                    r4.mo107142f(r0, r1)
                    r0 = 3
                    com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI$d r1 = com.tencent.p014mm.plugin.fav.p047ui.detail.FavoriteSightDetailUI.C93536d.this
                    com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI r1 = com.tencent.p014mm.plugin.fav.p047ui.detail.FavoriteSightDetailUI.this
                    r2 = 2131825647(0x7f1113ef, float:1.9284156E38)
                    java.lang.String r1 = r1.getString(r2)
                    r4.mo107142f(r0, r1)
                    r0 = 2
                    com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI$d r1 = com.tencent.p014mm.plugin.fav.p047ui.detail.FavoriteSightDetailUI.C93536d.this
                    com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI r1 = com.tencent.p014mm.plugin.fav.p047ui.detail.FavoriteSightDetailUI.this
                    androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
                    r2 = 2131821450(0x7f11038a, float:1.9275644E38)
                    java.lang.String r1 = r1.getString(r2)
                    r4.mo107142f(r0, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fav.p047ui.detail.FavoriteSightDetailUI.C93536d.C93537a.onCreateMMMenu(nj3.e0):void");
            }
        }

        /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI$d$b */
        public class C93538b implements C11184p0 {

            /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI$d$b$a */
            public class C93539a implements DialogInterface.OnClickListener {

                /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI$d$b$a$a */
                public class C93540a implements Runnable {

                    /* renamed from: d */
                    public final /* synthetic */ C89779i0 f270151d;

                    public C93540a(C89779i0 i0Var) {
                        this.f270151d = i0Var;
                    }

                    public void run() {
                        FavoriteSightDetailUI.this.f270015g.f295031p = true;
                        this.f270151d.dismiss();
                        Log.m105925i("MicroMsg.FavoriteSightDetailUI", "do del fav file, local id %d, fav id %d", Long.valueOf(FavoriteSightDetailUI.this.f270133r.field_localId), Integer.valueOf(FavoriteSightDetailUI.this.f270133r.field_id));
                        FavoriteSightDetailUI.this.finish();
                    }
                }

                public C93539a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    C100734q.m131856k(FavoriteSightDetailUI.this.f270133r.field_localId, new C93540a(C76879j.m92723Q(FavoriteSightDetailUI.this.getContext(), "", FavoriteSightDetailUI.this.getString(C0966R.string.f7946x3), false, false, (DialogInterface.OnCancelListener) null)), 19);
                }
            }

            public C93538b() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                int itemId = menuItem.getItemId();
                if (itemId == 0) {
                    C100695a0.m131729d(FavoriteSightDetailUI.this.f270133r.field_localId, 1, 0, -1);
                    Intent intent = new Intent();
                    C100717j0.m131780b(intent, FavoriteSightDetailUI.this.f270133r);
                    intent.putExtra("Select_Conv_Type", 3);
                    intent.putExtra("scene_from", 1);
                    intent.putExtra("mutil_select_is_ret", true);
                    intent.putExtra("select_fav_local_id", FavoriteSightDetailUI.this.f270133r.field_localId);
                    C88144b.m109802t(FavoriteSightDetailUI.this.getContext(), ".ui.transmit.SelectConversationUI", intent, 1);
                    FavoriteSightDetailUI favoriteSightDetailUI = FavoriteSightDetailUI.this;
                    favoriteSightDetailUI.f270015g.f295027l++;
                    favoriteSightDetailUI.mo128401H7(3);
                } else if (itemId == 2) {
                    C76879j.m92750u(FavoriteSightDetailUI.this.getContext(), FavoriteSightDetailUI.this.getString(C0966R.string.f7946x3), "", new C93539a(), (DialogInterface.OnClickListener) null);
                    FavoriteSightDetailUI.this.mo128401H7(6);
                } else if (itemId == 3) {
                    FavoriteSightDetailUI.this.f270015g.f295030o++;
                    Intent intent2 = new Intent();
                    intent2.putExtra("key_fav_scene", 2);
                    intent2.putExtra("key_fav_item_id", FavoriteSightDetailUI.this.f270133r.field_localId);
                    C100734q.m131875t0(FavoriteSightDetailUI.this.getContext(), ".ui.FavTagEditUI", intent2, (Bundle) null);
                    FavoriteSightDetailUI.this.mo128401H7(7);
                } else if (itemId == 4) {
                    FavoriteSightDetailUI favoriteSightDetailUI2 = FavoriteSightDetailUI.this;
                    C93685p0.m118380b(favoriteSightDetailUI2, favoriteSightDetailUI2.f270135t, favoriteSightDetailUI2.f270015g);
                    FavoriteSightDetailUI.this.mo128401H7(5);
                }
            }
        }

        public C93536d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C77407n nVar = new C77407n((Context) FavoriteSightDetailUI.this.getContext(), 1, false);
            nVar.f225771i = new C93537a();
            nVar.f225782p = new C93538b();
            nVar.mo107573q();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI$e */
    public class C93541e implements Runnable {
        public C93541e() {
        }

        public void run() {
            VideoPlayerTextureView videoPlayerTextureView;
            if (!FavoriteSightDetailUI.this.f270133r.mo140189x2() || !C100734q.m131834Y(FavoriteSightDetailUI.this.f270134s) || (videoPlayerTextureView = FavoriteSightDetailUI.this.f270131p) == null || !videoPlayerTextureView.isPlaying()) {
                FavoriteSightDetailUI.this.mo128438M7(true);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI$f */
    public class C93542f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f270154d;

        public C93542f(int i) {
            this.f270154d = i;
        }

        public void run() {
            FavoriteSightDetailUI.this.f270130o.setProgress(this.f270154d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI$g */
    public class C93543g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Dialog f270156d;

        public C93543g(FavoriteSightDetailUI favoriteSightDetailUI, Dialog dialog) {
            this.f270156d = dialog;
        }

        public void run() {
            this.f270156d.dismiss();
        }
    }

    /* renamed from: K7 */
    public static void m118153K7(FavoriteSightDetailUI favoriteSightDetailUI, boolean z, Context context) {
        C101834rc0 D = C100734q.m131813D(favoriteSightDetailUI.f270133r);
        if (D == null) {
            Log.m105920e("MicroMsg.FavoriteSightDetailUI", "goPlayView, but dataitem is null , exit");
            return;
        }
        C101849uc0 uc02 = D.f299306h1;
        if (uc02 == null || (Util.isNullOrNil(uc02.f299610d) && Util.isNullOrNil(D.f299306h1.f299613g))) {
            Intent intent = new Intent();
            intent.putExtra("key_detail_info_id", favoriteSightDetailUI.f270133r.field_localId);
            intent.putExtra("key_detail_fav_scene", favoriteSightDetailUI.f270015g.f295016a);
            intent.putExtra("key_detail_fav_sub_scene", favoriteSightDetailUI.f270015g.f295033r);
            intent.putExtra("key_detail_fav_path", C100734q.m131880w(D));
            intent.putExtra("key_detail_fav_thumb_path", C100734q.m131826Q(D));
            intent.putExtra("key_detail_fav_video_duration", D.f299338y);
            intent.putExtra("key_detail_statExtStr", D.f299311k1);
            intent.putExtra("key_detail_data_valid", z);
            intent.putExtra("key_detail_msg_uuid", D.f299259I1);
            C100734q.m131875t0(context, ".ui.detail.FavoriteVideoPlayUI", intent, (Bundle) null);
            return;
        }
        Log.m105924i("MicroMsg.FavoriteSightDetailUI", "it is ad sight.use sight play");
        Intent intent2 = new Intent();
        intent2.putExtra("key_detail_fav_scene", favoriteSightDetailUI.f270015g.f295016a);
        intent2.putExtra("key_detail_fav_sub_scene", favoriteSightDetailUI.f270015g.f295033r);
        intent2.putExtra("key_detail_info_id", favoriteSightDetailUI.f270133r.field_localId);
        intent2.putExtra("key_detail_data_id", D.f299280T);
        intent2.putExtra("key_detail_can_delete", false);
        C100734q.m131875t0(context, ".ui.detail.FavoriteFileDetailUI", intent2, (Bundle) null);
    }

    /* renamed from: I7 */
    public MMLoadScrollView mo128398I7() {
        return (MMLoadScrollView) findViewById(C0966R.C0970id.j48);
    }

    /* renamed from: L7 */
    public final void mo128437L7() {
        String w = C100734q.m131880w(this.f270134s);
        if (C86013q1.m106450k(w)) {
            this.f270131p.stop();
            this.f270131p.setMute(true);
            this.f270131p.setVideoPath(w);
        }
    }

    /* renamed from: M7 */
    public final void mo128438M7(boolean z) {
        if (!this.f270133r.mo140189x2()) {
            C100755z zVar = this.f270133r;
            if (zVar.field_itemStatus == 8) {
                if (Util.isNullOrNil(this.f270134s.f299325s)) {
                    this.f270129n.setImageResource(C0966R.raw.shortvideo_play_btn);
                } else {
                    this.f270129n.setImageResource(C0966R.raw.shortvideo_play_btn);
                    if (z) {
                        C76879j.m92726T(getContext(), getString(C0966R.string.f360348c13));
                    }
                }
            } else if (zVar.mo140174A2()) {
                this.f270129n.setImageResource(C0966R.raw.shortvideo_play_btn);
                if (z) {
                    C76879j.m92726T(getContext(), getString(C0966R.string.cmw));
                }
            } else if (this.f270133r.mo140190y2() || this.f270133r.mo140175B2()) {
                this.f270129n.setVisibility(8);
                this.f270130o.setVisibility(0);
                C100746u Yt = ((C102612a) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128198DE()).mo142252Yt(this.f270134s.f299280T);
                if (Yt != null) {
                    this.f270130o.setProgress((int) Yt.mo140167n2());
                } else {
                    this.f270130o.setProgress(0);
                }
                this.f270132q.setVisibility(0);
                return;
            } else {
                Log.m105928w("MicroMsg.FavoriteSightDetailUI", "other status, not done, downloading, uploading, downloadfail, uploadfail");
                this.f270129n.setImageResource(C0966R.raw.shortvideo_play_btn);
            }
        } else if (C100734q.m131834Y(this.f270134s)) {
            this.f270129n.setVisibility(8);
            this.f270130o.setVisibility(8);
            mo128437L7();
            return;
        } else if (Util.isNullOrNil(this.f270134s.f299325s)) {
            this.f270129n.setImageResource(C0966R.raw.shortvideo_play_btn);
        } else {
            Log.m105928w("MicroMsg.FavoriteSightDetailUI", "? info is done, source file not exist, cdn data url is not null");
            this.f270129n.setImageResource(C0966R.raw.shortvideo_play_btn);
        }
        this.f270129n.setVisibility(0);
        this.f270130o.setVisibility(8);
        this.f270132q.setVisibility(0);
    }

    /* renamed from: R4 */
    public void mo128275R4(C100746u uVar) {
        String str;
        if (uVar == null || (str = uVar.field_dataId) == null) {
            Log.m105928w("MicroMsg.FavoriteSightDetailUI", "on cdn status changed, item is null");
            return;
        }
        Log.m105925i("MicroMsg.FavoriteSightDetailUI", "on cdn status changed, dataID is %s, field id is %s,offset is %d, total is %d,cdn status is %d, cdn type is %d (send or recieve)", this.f270134s.f299280T, str, Integer.valueOf(uVar.field_offset), Integer.valueOf(uVar.field_totalLen), Integer.valueOf(uVar.field_status), Integer.valueOf(uVar.field_type));
        if (uVar.field_offset > uVar.field_totalLen) {
            Log.m105920e("MicroMsg.FavoriteSightDetailUI", "on cdn status changed, cdn offset length > cdn total length, do cdnLengthError()");
            if (1 == uVar.field_type) {
                uVar.field_status = 2;
            } else {
                uVar.field_status = 4;
            }
            ((C102612a) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128198DE()).update(uVar, new String[0]);
            if (uVar.field_type == 0) {
                C100734q.m131810A0(uVar);
            }
            if (uVar.field_type == 1) {
                C100734q.m131883x0(uVar);
            }
        }
        if (uVar.field_dataId.equals(this.f270134s.f299280T)) {
            this.f270130o.post(new C93542f((int) uVar.mo140167n2()));
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a7k;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && -1 == i2) {
            String str = null;
            String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
            if (intent != null) {
                str = intent.getStringExtra("custom_send_text");
            }
            C93594f1.m118181i(getContext(), stringExtra, str, this.f270133r, new C93543g(this, C76879j.m92723Q(getContext(), "", getString(C0966R.string.col), true, false, (DialogInterface.OnCancelListener) null)));
            boolean U5 = C72996z1.m85820U5(stringExtra);
            C100710h0.m131766c(U5 ? C100710h0.C100712b.Chatroom : C100710h0.C100712b.Chat, this.f270133r, C100710h0.C100713c.Samll, U5 ? C45612m0.m50697n(stringExtra) : 0);
            C75026b.m89951a(this, getString(C0966R.string.cmm));
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        Class cls = C100718j1.class;
        supportRequestWindowFeature(109);
        super.onCreate(bundle);
        this.f270135t = getIntent().getLongExtra("key_detail_info_id", -1);
        C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142266Yt(this.f270135t);
        this.f270133r = Yt;
        if (Yt == null) {
            Log.m105929w("MicroMsg.FavoriteSightDetailUI", "id[%d] info is null, return", Long.valueOf(this.f270135t));
            finish();
            return;
        }
        mo128399J7(Yt);
        C100710h0.m131764a(this.f270133r);
        C93575n.m118170a(this, this.f270133r);
        this.f270134s = C100734q.m131813D(this.f270133r);
        this.f270129n = (ImageView) findViewById(C0966R.C0970id.k17);
        this.f270130o = (MMPinProgressBtn) findViewById(C0966R.C0970id.f359492l70);
        this.f270128j = findViewById(C0966R.C0970id.bdp);
        this.f270131p = (VideoPlayerTextureView) findViewById(C0966R.C0970id.l7x);
        this.f270132q = (ImageView) findViewById(C0966R.C0970id.l7k);
        this.f270128j.setOnClickListener(new C93531a());
        this.f270131p.setVideoCallback(new C93532b());
        setMMTitle(getString(C0966R.string.cn9));
        setBackBtn(new C93535c());
        addIconOptionMenu(0, (int) C0966R.string.k3h, (int) C0966R.raw.icons_outlined_more, (MenuItem.OnMenuItemClickListener) new C93536d());
        if (C86013q1.m106450k(C100734q.m131826Q(this.f270134s))) {
            Bitmap i = FavoriteImageServer.m118080i(this.f270134s, this.f270133r);
            if (i != null) {
                int width = i.getWidth();
                int height = i.getHeight();
                if (!this.f270127A) {
                    this.f270127A = true;
                    int i2 = C85875k4.m106184h(getContext()).x;
                    float dimensionPixelOffset = ((float) (getResources().getDimensionPixelOffset(C0966R.dimen.f3799es) * 2)) + 0.5f;
                    ViewGroup.LayoutParams layoutParams = this.f270128j.getLayoutParams();
                    if (layoutParams == null) {
                        Log.m105920e("MicroMsg.FavoriteSightDetailUI", "setViewResize, but params is null");
                    } else {
                        int i3 = i2 - ((int) dimensionPixelOffset);
                        layoutParams.width = i3;
                        layoutParams.height = (i3 * height) / width;
                        this.f270128j.setLayoutParams(layoutParams);
                    }
                }
                this.f270132q.setImageBitmap(i);
                this.f270132q.setVisibility(0);
            }
        } else if (!Util.isNullOrNil(this.f270134s.f299305h)) {
            C100734q.m131857k0(this.f270133r, this.f270134s, true);
        }
        mo128438M7(false);
        ((C100718j1) C86312j.m106911c(cls)).mo128199Jq().add(this);
        ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).mo142255jo(this);
        C78538u.m94868d(this);
    }

    public void onDestroy() {
        Class cls = C100718j1.class;
        VideoPlayerTextureView videoPlayerTextureView = this.f270131p;
        if (videoPlayerTextureView != null) {
            videoPlayerTextureView.setVideoCallback((C96875r0.C96876a) null);
            this.f270131p.stop();
            this.f270131p.getClass();
        }
        ((C100718j1) C86312j.m106911c(cls)).mo128199Jq().remove(this);
        ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).mo142250SE(this);
        super.onDestroy();
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        Class cls = C100718j1.class;
        boolean z = false;
        Log.m105925i("MicroMsg.FavoriteSightDetailUI", "on favitem change, notifyId:%s, curId:%d", str, Long.valueOf(this.f270133r.field_localId));
        C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142266Yt(this.f270133r.field_localId);
        if (Yt == null) {
            Log.m105928w("MicroMsg.FavoriteSightDetailUI", "error, on notify change, cannot find info");
            finish();
            return;
        }
        this.f270133r = Yt;
        this.f270134s = C100734q.m131813D(Yt);
        C100746u Yt2 = ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).mo142252Yt(this.f270134s.f299280T);
        if (Yt2 != null && !this.f270139x) {
            if (Yt2.field_status == 4) {
                if (((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).mo142252Yt(this.f270134s.f299280T).field_extFlag != 0) {
                    C100734q.m131853i0(this.f270133r, this.f270134s, true);
                    this.f270139x = true;
                }
            }
            Log.m105925i("MicroMsg.FavoriteSightDetailUI", "FavoriteFileDetail download, check retry, return %B", Boolean.valueOf(this.f270139x));
            z = this.f270139x;
        }
        if (!z) {
            MMHandlerThread.removeRunnable(this.f270141z);
            MMHandlerThread.postToMainThreadDelayed(this.f270141z, 500);
        }
    }

    public void onPause() {
        VideoPlayerTextureView videoPlayerTextureView = this.f270131p;
        if (videoPlayerTextureView != null) {
            videoPlayerTextureView.stop();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        VideoPlayerTextureView videoPlayerTextureView = this.f270131p;
        if (videoPlayerTextureView != null) {
            if (!this.f270136u) {
                mo128437L7();
            } else if (!videoPlayerTextureView.isPlaying()) {
                this.f270131p.start();
            }
            this.f270136u = false;
        }
    }
}
