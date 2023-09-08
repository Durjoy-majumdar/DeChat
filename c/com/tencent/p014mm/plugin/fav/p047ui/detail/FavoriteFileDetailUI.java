package com.tencent.p014mm.plugin.fav.p047ui.detail;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import c02.C92331c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMImageView;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.fav.p047ui.C93594f1;
import com.tencent.p014mm.plugin.handoff.model.AbsHandOffFile;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96895y1;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import d62.C7250m;
import di3.C86312j;
import eb0.C45612m0;
import eb0.C45628s0;
import f40.C86709a0;
import h81.C32735h;
import ic1.C87694a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nc1.C100111a;
import nj3.C11184p0;
import nj3.C76879j;
import p206nj.C76861g;
import p206nj.C88955f;
import p645pj.C77092c;
import pb1.C100702d1;
import pb1.C100703e0;
import pb1.C100710h0;
import pb1.C100718j1;
import pb1.C100723m0;
import pb1.C100734q;
import pb1.C100746u;
import pb1.C100752x0;
import pb1.C100755z;
import qc0.C101093a;
import qo3.C89779i0;
import rb1.C101369c;
import te3.C101801kd0;
import te3.C101811md0;
import te3.C101834rc0;
import te3.C101849uc0;
import uo3.C78253a;
import xb1.C102612a;
import xb1.C102614d;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI */
public class FavoriteFileDetailUI extends BaseFavDetailReportUI implements C100723m0, MStorage.IOnStorageChange {

    /* renamed from: X */
    public static final long f270038X = C77092c.m93047i();

    /* renamed from: Y */
    public static final /* synthetic */ int f270039Y = 0;

    /* renamed from: A */
    public MMHandler f270040A;

    /* renamed from: B */
    public C100755z f270041B;

    /* renamed from: C */
    public C101834rc0 f270042C;

    /* renamed from: D */
    public C100703e0 f270043D = new C100703e0();

    /* renamed from: E */
    public boolean f270044E = false;

    /* renamed from: F */
    public boolean f270045F = false;

    /* renamed from: G */
    public boolean f270046G = true;

    /* renamed from: H */
    public String f270047H;

    /* renamed from: I */
    public long f270048I;

    /* renamed from: J */
    public String f270049J;

    /* renamed from: K */
    public boolean f270050K = false;

    /* renamed from: L */
    public boolean f270051L = false;

    /* renamed from: M */
    public boolean f270052M = false;

    /* renamed from: N */
    public AbsHandOffFile f270053N;

    /* renamed from: P */
    public C87694a f270054P;

    /* renamed from: Q */
    public C100111a f270055Q;

    /* renamed from: R */
    public C78253a f270056R = null;

    /* renamed from: S */
    public int f270057S;

    /* renamed from: T */
    public int f270058T;

    /* renamed from: U */
    public C11184p0 f270059U = new C93516l();

    /* renamed from: V */
    public View.OnTouchListener f270060V = new C68904b();

    /* renamed from: W */
    public View.OnLongClickListener f270061W = new C68905c();

    /* renamed from: j */
    public Button f270062j;

    /* renamed from: n */
    public Button f270063n;

    /* renamed from: o */
    public Button f270064o;

    /* renamed from: p */
    public MMImageView f270065p;

    /* renamed from: q */
    public TextView f270066q;

    /* renamed from: r */
    public TextView f270067r;

    /* renamed from: s */
    public ProgressBar f270068s;

    /* renamed from: t */
    public TextView f270069t;

    /* renamed from: u */
    public View f270070u;

    /* renamed from: v */
    public View f270071v;

    /* renamed from: w */
    public C96875r0 f270072w = null;

    /* renamed from: x */
    public TextView f270073x;

    /* renamed from: y */
    public ImageView f270074y;

    /* renamed from: z */
    public TextView f270075z;

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI$b */
    public class C68904b implements View.OnTouchListener {
        public C68904b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                FavoriteFileDetailUI.this.f270057S = (int) motionEvent.getRawX();
                FavoriteFileDetailUI.this.f270058T = (int) motionEvent.getRawY();
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI$c */
    public class C68905c implements View.OnLongClickListener {
        public C68905c() {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$11", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            Log.m105918d("MicroMsg.FavoriteFileDetailUI", "onLongClick");
            FavoriteFileDetailUI favoriteFileDetailUI = FavoriteFileDetailUI.this;
            if (favoriteFileDetailUI.f270056R == null) {
                favoriteFileDetailUI.f270056R = new C78253a(favoriteFileDetailUI.getContext());
            }
            FavoriteFileDetailUI favoriteFileDetailUI2 = FavoriteFileDetailUI.this;
            favoriteFileDetailUI2.f270056R.mo108273h(view, favoriteFileDetailUI2, favoriteFileDetailUI2.f270059U, favoriteFileDetailUI2.f270057S, favoriteFileDetailUI2.f270058T);
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$11", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI$i */
    public class C68906i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f198008d;

        public C68906i(String str) {
            this.f198008d = str;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105919d("MicroMsg.FavoriteFileDetailUI", "start video preview, fav id %d, fav local id %d", Integer.valueOf(FavoriteFileDetailUI.this.f270041B.field_id), Long.valueOf(FavoriteFileDetailUI.this.f270041B.field_localId));
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f198008d);
            intent.putExtra("is_favorite_item", true);
            intent.putExtra("fav_local_id", FavoriteFileDetailUI.this.f270041B.field_localId);
            intent.putExtra("geta8key_scene", 14);
            intent.putExtra("geta8key_scene", 14);
            C88144b.m109791i(FavoriteFileDetailUI.this.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI$a */
    public class C93507a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f270076d;

        /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI$a$a */
        public class C93508a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Intent f270078d;

            public C93508a(Intent intent) {
                this.f270078d = intent;
            }

            public void run() {
                C88144b.m109791i(FavoriteFileDetailUI.this, "webview", ".ui.tools.WebViewUI", this.f270078d, (Bundle) null);
                FavoriteFileDetailUI.this.finish();
            }
        }

        public C93507a(String str) {
            this.f270076d = str;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putString("key_snsad_statextstr", FavoriteFileDetailUI.this.f270042C.f299311k1);
            intent.putExtra("jsapiargs", bundle);
            intent.putExtra("rawUrl", this.f270076d);
            intent.putExtra("useJs", true);
            new MMHandler(Looper.getMainLooper()).post(new C93508a(intent));
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI$d */
    public class C93509d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Dialog f270080d;

        public C93509d(FavoriteFileDetailUI favoriteFileDetailUI, Dialog dialog) {
            this.f270080d = dialog;
        }

        public void run() {
            this.f270080d.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI$e */
    public class C93510e implements Runnable {
        public C93510e() {
        }

        public void run() {
            FavoriteFileDetailUI favoriteFileDetailUI = FavoriteFileDetailUI.this;
            int i = FavoriteFileDetailUI.f270039Y;
            favoriteFileDetailUI.mo128410O7(true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI$f */
    public class C93511f implements View.OnClickListener {
        public C93511f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C100710h0.m131765b(C100710h0.C100711a.EnterCompleteVideo, FavoriteFileDetailUI.this.f270041B);
            C101834rc0 rc02 = FavoriteFileDetailUI.this.f270042C;
            C101849uc0 uc02 = rc02.f299306h1;
            String Q = C100734q.m131826Q(rc02);
            Intent intent = new Intent();
            intent.putExtra("KFromTimeLine", false);
            intent.putExtra("KStremVideoUrl", uc02.f299610d);
            intent.putExtra("StreamWording", uc02.f299612f);
            intent.putExtra("StremWebUrl", uc02.f299613g);
            intent.putExtra("KBlockFav", true);
            intent.putExtra("KThumUrl", uc02.f299615i);
            intent.putExtra("KThumbPath", Q);
            intent.putExtra("KMediaId", "fakeid_" + FavoriteFileDetailUI.this.f270041B.field_id);
            intent.putExtra("KMediaVideoTime", uc02.f299611e);
            intent.putExtra("KMediaTitle", FavoriteFileDetailUI.this.f270042C.f299297d);
            intent.putExtra("KSta_StremVideoAduxInfo", uc02.f299616j);
            intent.putExtra("KSta_StremVideoPublishId", uc02.f299617n);
            intent.putExtra("KSta_SourceType", 1);
            intent.putExtra("KSta_Scene", 5);
            intent.putExtra("KSta_FromUserName", FavoriteFileDetailUI.this.f270041B.field_fromUser);
            intent.putExtra("KSta_FavID", FavoriteFileDetailUI.this.f270041B.field_id);
            intent.putExtra("KSta_SnsStatExtStr", FavoriteFileDetailUI.this.f270042C.f299311k1);
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_landing_page_new_stream_video, 1) > 0) {
                C88144b.m109791i(FavoriteFileDetailUI.this, "sns", ".ui.SnsAdStreamVideoPlayUI", intent, (Bundle) null);
                Log.m105924i("MicroMsg.FavoriteFileDetailUI", "use new stream video play UI");
            } else {
                C88144b.m109791i(FavoriteFileDetailUI.this, "sns", ".ui.VideoAdPlayerUI", intent, (Bundle) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI$g */
    public class C93512g implements MenuItem.OnMenuItemClickListener {
        public C93512g() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C100710h0.m131765b(C100710h0.C100711a.LeavelFullScreen, FavoriteFileDetailUI.this.f270041B);
            C100111a aVar = FavoriteFileDetailUI.this.f270055Q;
            if (aVar != null && aVar.mo67896U(1, false)) {
                return true;
            }
            C87694a aVar2 = FavoriteFileDetailUI.this.f270054P;
            if (aVar2 != null && aVar2.mo64004y0(1)) {
                return true;
            }
            FavoriteFileDetailUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI$h */
    public class C93513h implements View.OnClickListener {
        public C93513h() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String w = C100734q.m131880w(FavoriteFileDetailUI.this.f270042C);
            if (4 == FavoriteFileDetailUI.this.mo128407L7()) {
                FavoriteFileDetailUI favoriteFileDetailUI = FavoriteFileDetailUI.this;
                favoriteFileDetailUI.f270050K = false;
                favoriteFileDetailUI.mo128412Q7();
            } else {
                FavoriteFileDetailUI favoriteFileDetailUI2 = FavoriteFileDetailUI.this;
                favoriteFileDetailUI2.f270015g.f295026k++;
                ((C100702d1) C86312j.m106911c(C100702d1.class)).mo123898aV(favoriteFileDetailUI2, w, favoriteFileDetailUI2.f270042C.f299262K);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI$j */
    public class C93514j implements View.OnClickListener {
        public C93514j() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105925i("MicroMsg.FavoriteFileDetailUI", "click item favid %d, localid %d, itemstatus %d", Integer.valueOf(FavoriteFileDetailUI.this.f270041B.field_id), Long.valueOf(FavoriteFileDetailUI.this.f270041B.field_localId), Integer.valueOf(FavoriteFileDetailUI.this.f270041B.field_itemStatus));
            if (!C88955f.m111058b()) {
                C76879j.m92738i(FavoriteFileDetailUI.this.getContext(), C0966R.string.cpf, C0966R.string.cmx);
                C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (FavoriteFileDetailUI.this.f270041B.mo140174A2() || Util.isNullOrNil(FavoriteFileDetailUI.this.f270042C.f299325s)) {
                C100734q.m131863n0(FavoriteFileDetailUI.this.f270041B, true);
            } else {
                FavoriteFileDetailUI favoriteFileDetailUI = FavoriteFileDetailUI.this;
                if (!favoriteFileDetailUI.f270045F) {
                    C100734q.m131853i0(favoriteFileDetailUI.f270041B, favoriteFileDetailUI.f270042C, true);
                } else {
                    favoriteFileDetailUI.f270041B.field_itemStatus = 7;
                    C100734q.m131855j0(favoriteFileDetailUI.f270042C, true, 18, -1);
                }
            }
            FavoriteFileDetailUI.this.mo128408M7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI$k */
    public class C93515k implements View.OnClickListener {
        public C93515k() {
        }

        public void onClick(View view) {
            Class cls = C100718j1.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (FavoriteFileDetailUI.this.f270041B.mo140190y2()) {
                C101834rc0 rc02 = FavoriteFileDetailUI.this.f270042C;
                HashMap<Long, ArrayList<String>> hashMap = C100734q.f295126a;
                C100746u Yt = ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).mo142252Yt(rc02.f299280T);
                if (!(Yt == null || Yt.field_status == 3)) {
                    Yt.field_status = 2;
                    ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).update(Yt, "dataId");
                    ((C100718j1) C86312j.m106911c(cls)).mo128212cl().mo140155D0(rc02.f299280T);
                }
                C100746u Yt2 = ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).mo142252Yt(C100734q.m131825P(rc02.f299280T));
                if (!(Yt2 == null || Yt2.field_status == 3)) {
                    Yt2.field_status = 2;
                    ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).update(Yt2, "dataId");
                    ((C100718j1) C86312j.m106911c(cls)).mo128212cl().mo140155D0(C100734q.m131825P(rc02.f299280T));
                }
                FavoriteFileDetailUI.this.f270064o.setText(C0966R.string.f360426cp1);
            } else {
                C100755z zVar = FavoriteFileDetailUI.this.f270041B;
                HashMap<Long, ArrayList<String>> hashMap2 = C100734q.f295126a;
                if (!zVar.mo140175B2()) {
                    Log.m105920e("MicroMsg.Fav.FavApiLogic", "pauseItemUpload, not uploading");
                } else {
                    Log.m105927v("MicroMsg.Fav.FavApiLogic", "pauseItemUpload, itemStatu:%d", Integer.valueOf(zVar.field_itemStatus));
                    Iterator<C101834rc0> it = zVar.field_favProto.f298618f.iterator();
                    while (it.hasNext()) {
                        C101834rc0 next = it.next();
                        C100746u Yt3 = ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).mo142252Yt(next.f299280T);
                        if (!(Yt3 == null || Yt3.field_status == 3)) {
                            Yt3.field_status = 2;
                            ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).update(Yt3, "dataId");
                            ((C100718j1) C86312j.m106911c(cls)).mo128212cl().mo140156G0(next.f299280T);
                        }
                        C100746u Yt4 = ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).mo142252Yt(C100734q.m131825P(next.f299280T));
                        if (!(Yt4 == null || Yt4.field_status == 3)) {
                            Yt4.field_status = 2;
                            ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).update(Yt4, "dataId");
                            ((C100718j1) C86312j.m106911c(cls)).mo128212cl().mo140156G0(C100734q.m131825P(next.f299280T));
                        }
                    }
                    C100755z Yt5 = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142266Yt(zVar.field_localId);
                    Log.m105927v("MicroMsg.Fav.FavApiLogic", "pauseItemUpload, after pause data itemStatu:%d", Integer.valueOf(Yt5.field_itemStatus));
                    int i = Yt5.field_itemStatus;
                    if (i == 1) {
                        ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142272mL(3, Yt5.field_localId);
                        Log.m105927v("MicroMsg.Fav.FavApiLogic", "pauseItemUpload, final itemStatu:%d", 3);
                    } else if (i == 4) {
                        ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142272mL(6, Yt5.field_localId);
                        Log.m105927v("MicroMsg.Fav.FavApiLogic", "pauseItemUpload, final itemStatu:%d", 6);
                    } else if (i == 9) {
                        ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142272mL(11, Yt5.field_localId);
                        Log.m105927v("MicroMsg.Fav.FavApiLogic", "pauseItemUpload, final itemStatu:%d", 11);
                    } else if (i == 12) {
                        ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142272mL(14, Yt5.field_localId);
                        Log.m105927v("MicroMsg.Fav.FavApiLogic", "pauseItemUpload, final itemStatu:%d", 14);
                    } else if (i == 15) {
                        ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142272mL(16, Yt5.field_localId);
                        Log.m105927v("MicroMsg.Fav.FavApiLogic", "pauseItemUpload, final itemStatu:%d", 16);
                    } else if (i == 17) {
                        ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142272mL(18, Yt5.field_localId);
                        Log.m105927v("MicroMsg.Fav.FavApiLogic", "pauseItemUpload, final itemStatu:%d", 18);
                    }
                }
                FavoriteFileDetailUI.this.f270064o.setText(C0966R.string.f360427cp2);
            }
            FavoriteFileDetailUI.this.mo128411P7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI$l */
    public class C93516l implements C11184p0 {
        public C93516l() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            ClipboardHelper.setText(MMApplicationContext.getContext(), (CharSequence) null, Util.isNullOrNil(FavoriteFileDetailUI.this.f270042C.f299297d) ? FavoriteFileDetailUI.this.getString(C0966R.string.hfk) : FavoriteFileDetailUI.this.f270042C.f299297d);
            FavoriteFileDetailUI favoriteFileDetailUI = FavoriteFileDetailUI.this;
            C76879j.m92726T(favoriteFileDetailUI, favoriteFileDetailUI.getString(C0966R.string.f7938wv));
        }
    }

    /* renamed from: K7 */
    public MMActivity getContext() {
        return (MMActivity) super.getContext();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        r0 = r0.f299306h1;
     */
    /* renamed from: L7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo128407L7() {
        /*
            r7 = this;
            te3.rc0 r0 = r7.f270042C
            r1 = 8
            java.lang.String r2 = "MicroMsg.FavoriteFileDetailUI"
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "get type but data item is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            return r1
        L_0x000e:
            int r3 = r0.f299258I
            r4 = 4
            r5 = 15
            if (r3 != 0) goto L_0x0053
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3 = 0
            pb1.z r6 = r7.f270041B
            int r6 = r6.field_type
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0[r3] = r6
            java.lang.String r3 = "get data type, but data item type is 0, info type %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r3, r0)
            pb1.z r0 = r7.f270041B
            int r0 = r0.field_type
            if (r4 != r0) goto L_0x002f
            return r4
        L_0x002f:
            r2 = 16
            if (r2 != r0) goto L_0x0052
            te3.rc0 r0 = r7.f270042C
            if (r0 == 0) goto L_0x0051
            te3.uc0 r0 = r0.f299306h1
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = r0.f299610d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0044
            return r5
        L_0x0044:
            te3.rc0 r0 = r7.f270042C
            te3.uc0 r0 = r0.f299306h1
            java.lang.String r0 = r0.f299613g
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0051
            return r5
        L_0x0051:
            return r4
        L_0x0052:
            return r1
        L_0x0053:
            if (r3 != r5) goto L_0x0072
            if (r0 == 0) goto L_0x0071
            te3.uc0 r0 = r0.f299306h1
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = r0.f299610d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0064
            return r5
        L_0x0064:
            te3.rc0 r0 = r7.f270042C
            te3.uc0 r0 = r0.f299306h1
            java.lang.String r0 = r0.f299613g
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0071
            return r5
        L_0x0071:
            return r4
        L_0x0072:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fav.p047ui.detail.FavoriteFileDetailUI.mo128407L7():int");
    }

    /* renamed from: M7 */
    public final void mo128408M7() {
        int i;
        int i2;
        int i3;
        this.f270064o.setVisibility(8);
        this.f270062j.setVisibility(8);
        this.f270063n.setVisibility(8);
        this.f270067r.setVisibility(8);
        View view = this.f270070u;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initDownloadingStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initDownloadingStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C100746u Yt = ((C102612a) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128198DE()).mo142252Yt(this.f270042C.f299280T);
        if (Yt != null) {
            i2 = (int) Yt.mo140167n2();
            i = Yt.field_offset;
            i3 = Yt.field_totalLen;
        } else {
            i3 = (int) this.f270042C.f299276R;
            i2 = 0;
            i = 0;
        }
        if (!this.f270041B.mo140175B2() || !Util.isNullOrNil(this.f270042C.f299325s)) {
            this.f270040A.post(new C93560e(this, (float) i2, getString(C0966R.string.cno, new Object[]{C100734q.m131818I((float) i), C100734q.m131818I((float) i3)})));
            return;
        }
        this.f270040A.post(new C93560e(this, (float) i2, getString(C0966R.string.cs6, new Object[]{C100734q.m131818I((float) i), C100734q.m131818I((float) i3)})));
    }

    /* renamed from: N7 */
    public final void mo128409N7() {
        this.f270065p.setVisibility(8);
        this.f270066q.setVisibility(8);
        this.f270064o.setVisibility(8);
        this.f270062j.setVisibility(8);
        this.f270063n.setVisibility(8);
        View view = this.f270070u;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initOutOfDateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initOutOfDateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f270067r.setVisibility(8);
        this.f270074y.setVisibility(0);
        this.f270075z.setVisibility(0);
        if (this.f270042C.f299258I == 4) {
            this.f270067r.setGravity(17);
            this.f270067r.setText(C0966R.string.cpm);
            return;
        }
        this.f270067r.setGravity(17);
        this.f270067r.setText(C0966R.string.cpl);
        if (this.f270042C.f299322q1 == 2) {
            this.f270075z.setText(C0966R.string.cna);
        } else {
            this.f270075z.setText(C0966R.string.cnb);
        }
    }

    /* renamed from: O7 */
    public final void mo128410O7(boolean z) {
        C101849uc0 uc02;
        Class cls = C100752x0.class;
        boolean Y = C100734q.m131834Y(this.f270042C);
        boolean z2 = false;
        Log.m105925i("MicroMsg.FavoriteFileDetailUI", "init status, info type %d, exist:%B path:%s", Integer.valueOf(this.f270041B.field_itemStatus), Boolean.valueOf(Y), C100734q.m131880w(this.f270042C));
        if (this.f270042C.f299322q1 != 0) {
            mo128409N7();
        } else if (!this.f270041B.mo140189x2() && !Y && Util.isNullOrNil(this.f270042C.f299325s)) {
            C100755z zVar = this.f270041B;
            if (zVar.field_itemStatus == 8) {
                z2 = true;
            }
            if (z2) {
                if (Util.isNullOrNil(this.f270042C.f299325s)) {
                    mo128409N7();
                    if (z) {
                        int L7 = mo128407L7();
                        C76879j.m92726T(getContext(), getString((4 == L7 || 15 == L7) ? C0966R.string.cqn : C0966R.string.cq_));
                        return;
                    }
                    return;
                }
                mo128411P7();
                if (z) {
                    C76879j.m92726T(getContext(), getString(C0966R.string.f360348c13));
                }
            } else if (zVar.mo140174A2()) {
                mo128411P7();
                if (z) {
                    C76879j.m92726T(getContext(), getString(C0966R.string.cmw));
                }
            } else if (this.f270041B.mo140190y2() || this.f270041B.mo140175B2()) {
                mo128408M7();
            } else {
                Log.m105928w("MicroMsg.FavoriteFileDetailUI", "other status, not done, downloading, uploading, downloadfail, uploadfail");
                mo128411P7();
            }
        } else if (Y) {
            if (mo128407L7() == 15 && (uc02 = this.f270042C.f299306h1) != null && !Util.isNullOrNil(uc02.f299610d) && !Util.isNullOrNil(this.f270042C.f299306h1.f299613g)) {
                this.f270051L = true;
                this.f270065p.setVisibility(8);
                View view = this.f270070u;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f270064o.setVisibility(8);
                this.f270062j.setVisibility(8);
                this.f270063n.setVisibility(8);
                this.f270067r.setVisibility(8);
                String w = C100734q.m131880w(this.f270042C);
                Log.m105918d("MicroMsg.FavoriteFileDetailUI", C76861g.m92659b() + " initView: fullpath:" + w);
                this.f270072w = C96895y1.m124471a(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(13);
                ((ViewGroup) findViewById(C0966R.C0970id.f359485l50)).addView((View) this.f270072w, 0, layoutParams);
                this.f270072w.setVideoCallback(new C93556b(this));
                Log.m105918d("MicroMsg.FavoriteFileDetailUI", C76861g.m92659b() + " initView :" + w);
                if (w != null) {
                    this.f270072w.stop();
                    this.f270072w.setVideoPath(w);
                }
                Log.m105918d("MicroMsg.FavoriteFileDetailUI", C76861g.m92659b() + " initView");
                C101093a.m132490l();
                C115669n.INSTANCE.mo160131h(11444, 4);
            }
            if (mo128407L7() == 15 || mo128407L7() == 4) {
                if (!this.f270051L) {
                    View view3 = this.f270070u;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f270064o.setVisibility(8);
                    this.f270062j.setVisibility(8);
                    this.f270063n.setVisibility(0);
                    this.f270063n.setText(C0966R.string.f360425cp0);
                    this.f270067r.setVisibility(8);
                    mo128412Q7();
                }
                C86709a0.m107525e().postToWorker(new C93558c(this));
            } else {
                if (C100734q.m131834Y(this.f270042C) && C100734q.m131835Z(this.f270042C)) {
                    View view5 = this.f270070u;
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(8);
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f270064o.setVisibility(8);
                    this.f270062j.setVisibility(0);
                    this.f270063n.setVisibility(8);
                    this.f270067r.setVisibility(8);
                    this.f270062j.setOnClickListener(new C93559d(this));
                } else {
                    View view7 = this.f270070u;
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                    aVar4.mo10233c(8);
                    View view8 = view7;
                    C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view8, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f270064o.setVisibility(8);
                    if (Util.isNullOrNil(this.f270042C.f299242A)) {
                        this.f270062j.setVisibility(8);
                    } else {
                        this.f270062j.setVisibility(0);
                    }
                    this.f270063n.setVisibility(0);
                    this.f270015g.f295025j = true;
                    this.f270067r.setVisibility(0);
                }
            }
            if (this.f270053N.getFileStatus() != 1) {
                this.f270053N.setFileStatus(1);
                ((C92331c) C86312j.m106911c(C92331c.class)).Gg0(this.f270053N);
            }
            int intExtra = getIntent().getIntExtra("key_detail_open_way", 0);
            if (Util.isEqual(intExtra, 1)) {
                C101811md0 md02 = new C101811md0();
                md02.f298819j = 2;
                ((C100752x0) C86312j.m106911c(cls)).mo140172DJ(getContext(), this.f270041B, md02);
            } else if (Util.isEqual(intExtra, 2)) {
                C101811md0 md03 = new C101811md0();
                md03.f298819j = 2;
                C101834rc0 rc02 = this.f270042C;
                if (rc02.f299258I != 8 || !Util.isEqual(rc02.f299280T, this.f270049J)) {
                    ((C100752x0) C86312j.m106911c(cls)).mo140172DJ(getContext(), this.f270041B, md03);
                    return;
                }
                C100755z o2 = this.f270041B.clone();
                o2.field_type = 8;
                o2.f295172Q0 = true;
                o2.f295173R0 = this.f270041B;
                o2.f295174S0 = this.f270041B.field_localId + "_" + this.f270049J;
                o2.f295175T0 = this.f270049J;
                C101801kd0 a = C101369c.m133013a(this.f270041B.field_favProto);
                o2.field_favProto = a;
                a.f298618f = new LinkedList<>();
                o2.field_favProto.f298618f.add(this.f270042C);
                o2.field_favProto.mo141220r(this.f270042C.f299297d);
                ((C100752x0) C86312j.m106911c(cls)).mo140172DJ(getContext(), o2, md03);
            }
        } else if (Util.isNullOrNil(this.f270042C.f299325s)) {
            mo128409N7();
        } else {
            Log.m105928w("MicroMsg.FavoriteFileDetailUI", "? info is done, source file not exist, cdn data url is not null");
            mo128411P7();
        }
    }

    /* renamed from: P7 */
    public final void mo128411P7() {
        View view = this.f270070u;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initWaitDownloadStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initWaitDownloadStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f270063n.setVisibility(8);
        if (Util.isNullOrNil(this.f270042C.f299242A)) {
            this.f270062j.setVisibility(8);
        } else {
            this.f270062j.setVisibility(0);
        }
        this.f270064o.setVisibility(0);
        C100746u Yt = ((C102612a) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128198DE()).mo142252Yt(this.f270042C.f299280T);
        if (Yt == null || Yt.field_offset <= 0) {
            this.f270064o.setText(this.f270041B.mo140174A2() ? C0966R.string.f360428cp3 : C0966R.string.coy);
        } else {
            this.f270064o.setText(this.f270041B.mo140174A2() ? C0966R.string.f360427cp2 : C0966R.string.f360426cp1);
        }
        this.f270067r.setVisibility(8);
    }

    /* renamed from: Q7 */
    public final void mo128412Q7() {
        if (!this.f270050K) {
            this.f270015g.f295026k++;
            this.f270050K = true;
            Intent intent = new Intent();
            intent.putExtra("key_detail_info_id", this.f270048I);
            intent.putExtra("key_detail_fav_path", C100734q.m131880w(this.f270042C));
            intent.putExtra("key_detail_fav_thumb_path", C100734q.m131826Q(this.f270042C));
            intent.putExtra("key_detail_fav_video_duration", this.f270042C.f299338y);
            intent.putExtra("key_detail_statExtStr", this.f270042C.f299311k1);
            intent.putExtra("key_detail_msg_uuid", this.f270042C.f299259I1);
            C100734q.m131875t0(this, ".ui.detail.FavoriteVideoPlayUI", intent, (Bundle) null);
            finish();
        }
    }

    /* renamed from: R4 */
    public void mo128275R4(C100746u uVar) {
        String str;
        if (uVar == null || (str = uVar.field_dataId) == null) {
            Log.m105928w("MicroMsg.FavoriteFileDetailUI", "on cdn status changed, item is null");
            return;
        }
        Log.m105919d("MicroMsg.FavoriteFileDetailUI", "on cdn status changed, dataID is %s, field id is %s", this.f270042C.f299280T, str);
        if (!uVar.field_dataId.equals(this.f270042C.f299280T)) {
            return;
        }
        if (!this.f270041B.mo140175B2() || !Util.isNullOrNil(this.f270042C.f299325s)) {
            this.f270040A.post(new C93560e(this, uVar.mo140167n2(), getString(C0966R.string.cno, new Object[]{C100734q.m131818I((float) uVar.field_offset), C100734q.m131818I((float) uVar.field_totalLen)})));
            if (this.f270045F && C86013q1.m106450k(uVar.field_path)) {
                this.f270041B.field_itemStatus = 10;
                onNotifyChange("", (MStorageEventData) null);
                return;
            }
            return;
        }
        this.f270040A.post(new C93560e(this, uVar.mo140167n2(), getString(C0966R.string.cs6, new Object[]{C100734q.m131818I((float) uVar.field_offset), C100734q.m131818I((float) uVar.field_totalLen)})));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: R7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo128413R7() {
        /*
            r5 = this;
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "key_detail_data_id"
            java.lang.String r0 = r0.getStringExtra(r1)
            r5.f270049J = r0
            pb1.z r1 = r5.f270041B
            java.lang.String r2 = ""
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r2)
            java.lang.String r2 = "itemInfo"
            gy3.C87412m.m108594g(r1, r2)
            java.lang.String r2 = "dataId"
            gy3.C87412m.m108594g(r0, r2)
            te3.kd0 r1 = r1.field_favProto
            if (r1 == 0) goto L_0x0052
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            if (r1 == 0) goto L_0x0052
            java.util.Iterator r1 = r1.iterator()
        L_0x002c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0052
            java.lang.Object r2 = r1.next()
            te3.rc0 r2 = (te3.C101834rc0) r2
            java.lang.String r3 = r2.f299280T
            boolean r3 = gy3.C87412m.m108589b(r3, r0)
            if (r3 == 0) goto L_0x0041
            goto L_0x0053
        L_0x0041:
            int r3 = r2.f299258I
            r4 = 17
            if (r3 != r4) goto L_0x002c
            pb1.s$a r3 = pb1.C100740s.f295145a
            te3.kd0 r2 = r2.f299275Q1
            te3.rc0 r2 = r3.mo140166a(r2, r0)
            if (r2 == 0) goto L_0x002c
            goto L_0x0053
        L_0x0052:
            r2 = 0
        L_0x0053:
            r5.f270042C = r2
            if (r2 != 0) goto L_0x005f
            pb1.z r0 = r5.f270041B
            te3.rc0 r0 = pb1.C100734q.m131813D(r0)
            r5.f270042C = r0
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fav.p047ui.detail.FavoriteFileDetailUI.mo128413R7():void");
    }

    public void finish() {
        C87694a aVar = this.f270054P;
        if (aVar != null) {
            aVar.mo149068c0();
        }
        super.finish();
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a7i;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((C100702d1) C86312j.m106911c(C100702d1.class)).mo123897Ri(this, i, i2, intent, true, C0966R.string.h9s, C0966R.string.h9t);
        if (i2 == -1 && i == 1) {
            String str = null;
            String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
            if (intent != null) {
                str = intent.getStringExtra("custom_send_text");
            }
            C89779i0 Q = C76879j.m92723Q(getContext(), "", getString(C0966R.string.col), true, false, (DialogInterface.OnCancelListener) null);
            Log.m105919d("MicroMsg.FavoriteFileDetailUI", "do share msg, fav msg type %d", Integer.valueOf(mo128407L7()));
            C93509d dVar = new C93509d(this, Q);
            int L7 = mo128407L7();
            if (!Util.isNullOrNil(stringExtra)) {
                for (String next : Util.stringsToList(stringExtra.split(","))) {
                    if (L7 == 4 || L7 == 15) {
                        C93594f1.m118183k(getContext(), next, this.f270042C, dVar);
                        boolean U5 = C72996z1.m85820U5(next);
                        C100710h0.m131766c(U5 ? C100710h0.C100712b.Chatroom : C100710h0.C100712b.Chat, this.f270041B, C100710h0.C100713c.Full, U5 ? C45612m0.m50697n(next) : 0);
                    } else {
                        C93594f1.m118178f(getContext(), next, this.f270041B, this.f270042C, dVar);
                    }
                    if (!Util.isNullOrNil(str)) {
                        C7250m.m7431a().mo136257Tm(next, str, C45628s0.m50810y(next), 0);
                    }
                }
                C75026b.m89951a(this, getString(C0966R.string.cmm));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x02ca, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r4) == 0) goto L_0x02e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x02db, code lost:
        if (r12.f270041B.mo140184m2() == false) goto L_0x02de;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            super.onCreate(r13)
            com.tencent.mm.sdk.platformtools.MMHandler r13 = new com.tencent.mm.sdk.platformtools.MMHandler
            r13.<init>()
            r12.f270040A = r13
            android.content.Intent r13 = r12.getIntent()
            java.lang.String r0 = "key_detail_info_id"
            r1 = -1
            long r0 = r13.getLongExtra(r0, r1)
            r12.f270048I = r0
            android.content.Intent r13 = r12.getIntent()
            java.lang.String r0 = "fav_open_from_wnnote"
            r1 = 0
            boolean r13 = r13.getBooleanExtra(r0, r1)
            r12.f270045F = r13
            android.content.Intent r13 = r12.getIntent()
            java.lang.String r0 = "show_share"
            r2 = 1
            boolean r13 = r13.getBooleanExtra(r0, r2)
            r12.f270046G = r13
            android.content.Intent r13 = r12.getIntent()
            java.lang.String r0 = "fav_note_xml"
            java.lang.String r13 = r13.getStringExtra(r0)
            r12.f270047H = r13
            java.lang.Class<pb1.j1> r13 = pb1.C100718j1.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            pb1.j1 r13 = (pb1.C100718j1) r13
            pb1.w0 r13 = r13.mo128199Jq()
            long r3 = r12.f270048I
            xb1.d r13 = (xb1.C102614d) r13
            pb1.z r13 = r13.mo142266Yt(r3)
            r12.f270041B = r13
            boolean r13 = r12.f270045F
            if (r13 == 0) goto L_0x006c
            java.lang.String r13 = r12.f270047H
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 != 0) goto L_0x006c
            java.lang.String r13 = r12.f270047H
            r0 = 18
            pb1.z r13 = pb1.C100734q.m131886z(r13, r0)
            r12.f270041B = r13
        L_0x006c:
            pb1.z r13 = r12.f270041B
            java.lang.String r0 = "MicroMsg.FavoriteFileDetailUI"
            if (r13 != 0) goto L_0x007b
            java.lang.String r13 = "error, cannot find download info"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r13)
            r12.finish()
            return
        L_0x007b:
            r12.mo128399J7(r13)
            pb1.z r13 = r12.f270041B
            pb1.C100710h0.m131764a(r13)
            r12.mo128413R7()
            r13 = 2131311255(0x7f093a97, float:1.8240845E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.Button r13 = (android.widget.Button) r13
            r12.f270062j = r13
            r13 = 2131310531(0x7f0937c3, float:1.8239377E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.Button r13 = (android.widget.Button) r13
            r12.f270063n = r13
            r13 = 2131301156(0x7f091324, float:1.8220362E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.Button r13 = (android.widget.Button) r13
            r12.f270064o = r13
            r13 = 2131306206(0x7f0926de, float:1.8230605E38)
            android.view.View r13 = r12.findViewById(r13)
            com.tencent.mm.ui.MMImageView r13 = (com.tencent.p014mm.p136ui.MMImageView) r13
            r12.f270065p = r13
            r13 = 2131309967(0x7f09358f, float:1.8238233E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r12.f270066q = r13
            r13 = 2131315352(0x7f094a98, float:1.8249155E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r12.f270067r = r13
            r13 = 2131301187(0x7f091343, float:1.8220425E38)
            android.view.View r13 = r12.findViewById(r13)
            r12.f270071v = r13
            r13 = 2131301182(0x7f09133e, float:1.8220415E38)
            android.view.View r13 = r12.findViewById(r13)
            r12.f270070u = r13
            r13 = 2131301180(0x7f09133c, float:1.822041E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.ProgressBar r13 = (android.widget.ProgressBar) r13
            r12.f270068s = r13
            r13 = 2131301184(0x7f091340, float:1.8220419E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r12.f270069t = r13
            r13 = 2131313523(0x7f094373, float:1.8245445E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r12.f270073x = r13
            r13 = 2131302145(0x7f091701, float:1.8222368E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r12.f270074y = r13
            r13 = 2131302146(0x7f091702, float:1.822237E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r12.f270075z = r13
            android.widget.TextView r13 = r12.f270066q
            android.view.View$OnTouchListener r3 = r12.f270060V
            r13.setOnTouchListener(r3)
            android.widget.TextView r13 = r12.f270066q
            android.view.View$OnLongClickListener r3 = r12.f270061W
            r13.setOnLongClickListener(r3)
            int r13 = r12.mo128407L7()
            r3 = 2131825817(0x7f111499, float:1.92845E38)
            r4 = 15
            r5 = 4
            r6 = 8
            if (r5 != r13) goto L_0x0131
            r12.setMMTitle((int) r3)
            goto L_0x014f
        L_0x0131:
            if (r4 != r13) goto L_0x0149
            r12.setMMTitle((int) r3)
            r13 = 2131316141(0x7f094dad, float:1.8250755E38)
            android.view.View r13 = r12.findViewById(r13)
            r3 = 2131100166(0x7f060206, float:1.7812706E38)
            r13.setBackgroundResource(r3)
            android.widget.TextView r13 = r12.f270066q
            r13.setVisibility(r6)
            goto L_0x014f
        L_0x0149:
            r13 = 2131825676(0x7f11140c, float:1.9284215E38)
            r12.setMMTitle((int) r13)
        L_0x014f:
            te3.rc0 r13 = r12.f270042C
            int r13 = r13.f299258I
            if (r13 != r5) goto L_0x015e
            com.tencent.mm.ui.MMImageView r13 = r12.f270065p
            r3 = 2131755116(0x7f10006c, float:1.9141102E38)
            r13.setImageResource(r3)
            goto L_0x0173
        L_0x015e:
            com.tencent.mm.ui.MMImageView r13 = r12.f270065p
            java.lang.Class<pb1.d1> r3 = pb1.C100702d1.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            pb1.d1 r3 = (pb1.C100702d1) r3
            te3.rc0 r7 = r12.f270042C
            java.lang.String r7 = r7.f299262K
            int r3 = r3.z20(r7)
            r13.setImageResource(r3)
        L_0x0173:
            android.widget.TextView r13 = r12.f270066q
            te3.rc0 r3 = r12.f270042C
            java.lang.String r3 = r3.f299297d
            r13.setText(r3)
            te3.rc0 r13 = r12.f270042C
            te3.uc0 r13 = r13.f299306h1
            if (r13 != 0) goto L_0x0189
            android.widget.TextView r13 = r12.f270073x
            r13.setVisibility(r6)
            goto L_0x0254
        L_0x0189:
            java.lang.String r3 = r13.f299610d
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x01c3
            java.lang.String r3 = " there is no attachurl, show more info btn"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            java.lang.String r3 = r13.f299612f
            java.lang.String r13 = r13.f299613g
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r7 != 0) goto L_0x01bc
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r7 != 0) goto L_0x01bc
            android.widget.TextView r7 = r12.f270073x
            r7.setText(r3)
            android.widget.TextView r3 = r12.f270073x
            r3.setVisibility(r1)
            android.widget.TextView r3 = r12.f270073x
            com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI$a r7 = new com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI$a
            r7.<init>(r13)
            r3.setOnClickListener(r7)
            goto L_0x0254
        L_0x01bc:
            android.widget.TextView r13 = r12.f270073x
            r13.setVisibility(r6)
            goto L_0x0254
        L_0x01c3:
            android.content.res.Resources r3 = r12.getResources()
            r7 = 2131836822(0x7f113f96, float:1.9306822E38)
            java.lang.String r3 = r3.getString(r7)
            int r7 = r13.f299611e
            int r7 = r7 / 60
            if (r7 <= 0) goto L_0x01fa
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            android.content.res.Resources r3 = r12.getResources()
            r8 = 2131836824(0x7f113f98, float:1.9306826E38)
            java.lang.Object[] r9 = new java.lang.Object[r2]
            int r10 = r13.f299611e
            int r10 = r10 / 60
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9[r1] = r10
            java.lang.String r3 = r3.getString(r8, r9)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
        L_0x01fa:
            int r7 = r13.f299611e
            int r7 = r7 % 60
            if (r7 <= 0) goto L_0x0226
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            android.content.res.Resources r3 = r12.getResources()
            r8 = 2131836825(0x7f113f99, float:1.9306828E38)
            java.lang.Object[] r9 = new java.lang.Object[r2]
            int r13 = r13.f299611e
            int r13 = r13 % 60
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r9[r1] = r13
            java.lang.String r13 = r3.getString(r8, r9)
            r7.append(r13)
            java.lang.String r3 = r7.toString()
        L_0x0226:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r3)
            android.content.res.Resources r3 = r12.getResources()
            r7 = 2131836823(0x7f113f97, float:1.9306824E38)
            java.lang.String r3 = r3.getString(r7)
            r13.append(r3)
            java.lang.String r13 = r13.toString()
            android.widget.TextView r3 = r12.f270073x
            r3.setText(r13)
            android.widget.TextView r13 = r12.f270073x
            r13.setVisibility(r1)
            android.widget.TextView r13 = r12.f270073x
            com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI$f r3 = new com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI$f
            r3.<init>()
            r13.setOnClickListener(r3)
        L_0x0254:
            com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI$g r13 = new com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI$g
            r13.<init>()
            r12.setBackBtn(r13)
            android.widget.Button r13 = r12.f270063n
            com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI$h r3 = new com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI$h
            r3.<init>()
            r13.setOnClickListener(r3)
            te3.rc0 r13 = r12.f270042C
            java.lang.String r13 = r13.f299242A
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r3 != 0) goto L_0x027a
            android.widget.Button r3 = r12.f270062j
            com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI$i r7 = new com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI$i
            r7.<init>(r13)
            r3.setOnClickListener(r7)
        L_0x027a:
            android.widget.Button r13 = r12.f270064o
            com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI$j r3 = new com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI$j
            r3.<init>()
            r13.setOnClickListener(r3)
            android.view.View r13 = r12.f270071v
            com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI$k r3 = new com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI$k
            r3.<init>()
            r13.setOnClickListener(r3)
            boolean r13 = r12.f270046G
            if (r13 == 0) goto L_0x02f4
            android.content.Intent r13 = r12.getIntent()
            java.lang.String r3 = "key_detail_can_delete"
            boolean r13 = r13.getBooleanExtra(r3, r2)
            int r3 = r12.mo128407L7()
            if (r3 != r6) goto L_0x02aa
            pb1.z r4 = r12.f270041B
            boolean r4 = r4.mo140184m2()
            goto L_0x02e1
        L_0x02aa:
            if (r3 != r4) goto L_0x02cd
            java.lang.Class<lc3.b> r4 = lc3.C10485b.class
            k40.a r4 = f40.C86709a0.m107533q(r4)
            lc3.b r4 = (lc3.C10485b) r4
            pj.f r4 = r4.vh0()
            java.lang.String r7 = "SIGHTCannotTransmitForFav"
            java.lang.String r4 = r4.mo107405c(r7)
            pb1.z r7 = r12.f270041B
            boolean r7 = r7.mo140184m2()
            if (r7 == 0) goto L_0x02de
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r4)
            if (r4 != 0) goto L_0x02de
            goto L_0x02e0
        L_0x02cd:
            pb1.z r4 = r12.f270041B
            boolean r4 = r4.mo140185n2()
            if (r4 != 0) goto L_0x02e0
            pb1.z r4 = r12.f270041B
            boolean r4 = r4.mo140184m2()
            if (r4 == 0) goto L_0x02de
            goto L_0x02e0
        L_0x02de:
            r4 = 0
            goto L_0x02e1
        L_0x02e0:
            r4 = 1
        L_0x02e1:
            if (r4 != 0) goto L_0x02e6
            if (r13 != 0) goto L_0x02e6
            goto L_0x02f4
        L_0x02e6:
            r7 = 2131838048(0x7f114460, float:1.9309308E38)
            r8 = 2131756370(0x7f100552, float:1.9143646E38)
            com.tencent.mm.plugin.fav.ui.detail.g r9 = new com.tencent.mm.plugin.fav.ui.detail.g
            r9.<init>(r12, r4, r13, r3)
            r12.addIconOptionMenu((int) r1, (int) r7, (int) r8, (android.view.MenuItem.OnMenuItemClickListener) r9)
        L_0x02f4:
            java.lang.Class<c02.c> r13 = c02.C92331c.class
            pb1.z r3 = r12.f270041B
            r4 = 0
            if (r3 == 0) goto L_0x0302
            int r3 = r3.field_id
            java.lang.String r3 = java.lang.String.valueOf(r3)
            goto L_0x0303
        L_0x0302:
            r3 = r4
        L_0x0303:
            java.lang.Class<at.b> r7 = p444at.C92087b.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            at.b r7 = (p444at.C92087b) r7
            te3.rc0 r8 = r12.f270042C
            java.lang.String r9 = pb1.C100734q.m131880w(r8)
            com.tencent.mm.plugin.handoff.model.AbsHandOffFile r3 = r7.mo126070NN(r8, r3, r4, r9)
            r12.f270053N = r3
            te3.rc0 r3 = r12.f270042C
            boolean r3 = pb1.C100734q.m131834Y(r3)
            r4 = 3
            r7 = 2
            if (r3 == 0) goto L_0x0327
            com.tencent.mm.plugin.handoff.model.AbsHandOffFile r3 = r12.f270053N
            r3.setFileStatus(r2)
            goto L_0x033c
        L_0x0327:
            te3.rc0 r3 = r12.f270042C
            java.lang.String r3 = r3.f299325s
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0337
            com.tencent.mm.plugin.handoff.model.AbsHandOffFile r3 = r12.f270053N
            r3.setFileStatus(r4)
            goto L_0x033c
        L_0x0337:
            com.tencent.mm.plugin.handoff.model.AbsHandOffFile r3 = r12.f270053N
            r3.setFileStatus(r7)
        L_0x033c:
            di3.d r3 = di3.C86312j.m106911c(r13)
            c02.c r3 = (c02.C92331c) r3
            com.tencent.mm.plugin.handoff.model.AbsHandOffFile r8 = r12.f270053N
            r3.mo58377tt(r8)
            di3.d r13 = di3.C86312j.m106911c(r13)
            c02.c r13 = (c02.C92331c) r13
            com.tencent.mm.plugin.handoff.model.AbsHandOffFile r3 = r12.f270053N
            r13.mo58375rt(r3)
            r12.mo128410O7(r1)
            int r13 = r12.mo128407L7()
            if (r13 != r6) goto L_0x0476
            te3.rc0 r13 = r12.f270042C
            java.lang.String r13 = pb1.C100734q.m131880w(r13)
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r13)
            if (r3 == 0) goto L_0x0469
            ic1.a r6 = new ic1.a
            ic1.b r8 = new ic1.b
            com.tencent.mm.ui.MMActivity r9 = r12.getContext()
            r8.<init>(r9)
            r6.<init>(r8)
            r12.f270054P = r6
            te3.rc0 r8 = r12.f270042C
            java.lang.String r8 = r8.f299262K
            java.lang.Object[] r9 = new java.lang.Object[r4]
            r9[r1] = r13
            r9[r2] = r8
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r9[r7] = r10
            java.lang.String r10 = "onCreate, filePath:%s fileExt:%s sence:%s"
            java.lang.String r11 = "MicroMsg.FilesFloatBall.FavoriteFilePFloatBallHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r10, r9)
            r6.f253970s = r13
            java.lang.String r9 = aw0.C79635e.m96715c(r13)
            r6.mo35648A(r5, r9)
            com.tencent.mm.plugin.ball.model.BallInfo r9 = r6.f311726d
            android.os.Bundle r9 = r9.f311678C
            if (r9 == 0) goto L_0x03ca
            java.lang.String r11 = "filePath"
            r9.putString(r11, r13)
            com.tencent.mm.plugin.ball.model.BallInfo r9 = r6.f311726d
            android.os.Bundle r9 = r9.f311678C
            java.lang.String r11 = "ifAppAttachDownloadUI"
            r9.putBoolean(r11, r1)
            com.tencent.mm.plugin.ball.model.BallInfo r9 = r6.f311726d
            android.os.Bundle r9 = r9.f311678C
            java.lang.String r11 = "fileExt"
            r9.putString(r11, r8)
            com.tencent.mm.plugin.ball.model.BallInfo r8 = r6.f311726d
            android.os.Bundle r8 = r8.f311678C
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            int r9 = r9.intValue()
            java.lang.String r11 = "sence"
            r8.putInt(r11, r9)
            r6.mo68414O()
        L_0x03ca:
            ic1.a r6 = r12.f270054P
            te3.rc0 r8 = r12.f270042C
            java.lang.String r9 = r8.f299262K
            java.lang.String r8 = r8.f299297d
            r6.getClass()
            java.lang.Integer r9 = aw0.C92162m.m115833a(r9)
            if (r9 != 0) goto L_0x03e2
            java.lang.String r9 = "unknown"
            java.lang.Integer r9 = aw0.C92162m.m115833a(r9)
        L_0x03e2:
            com.tencent.mm.plugin.ball.model.BallInfo r11 = r6.f311726d
            int r9 = r9.intValue()
            r11.f311698s = r9
            com.tencent.mm.plugin.ball.model.BallInfo r9 = r6.f311726d
            r9.f311699t = r8
            r6.mo68414O()
            nc1.a r6 = new nc1.a
            d92.c r8 = new d92.c
            com.tencent.mm.ui.MMActivity r9 = r12.getContext()
            r8.<init>(r9)
            r6.<init>(r8)
            r12.f270055Q = r6
            te3.rc0 r8 = r12.f270042C
            java.lang.String r8 = r8.f299262K
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r13
            r4[r2] = r8
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r4[r7] = r9
            java.lang.String r9 = "MicroMsg.FilesFloatBall.FavoriteFilePMultiTaskHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r10, r4)
            r6.f293261u = r13
            java.lang.String r4 = aw0.C79635e.m96715c(r13)
            r6.mo35809D(r5, r4)
            te3.pe0 r4 = r6.f293262v
            r4.f299161e = r13
            long r10 = com.tencent.p014mm.vfs.C86013q1.m106451l(r13)
            r4.f299167n = r10
            te3.pe0 r13 = r6.f293262v
            r13.f299162f = r8
            r13.f299165i = r7
            r13.f299160d = r1
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r4 = r6.f326418a     // Catch:{ IOException -> 0x043a }
            byte[] r13 = r13.toByteArray()     // Catch:{ IOException -> 0x043a }
            r4.field_data = r13     // Catch:{ IOException -> 0x043a }
            goto L_0x0444
        L_0x043a:
            r13 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r1] = r13
            java.lang.String r13 = "handleMultiTaskInfoClicked"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r13, r4)
        L_0x0444:
            r6.mo160075M()
            nc1.a r13 = r12.f270055Q
            te3.rc0 r4 = r12.f270042C
            java.lang.String r5 = r4.f299262K
            java.lang.String r4 = r4.f299297d
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r6 = r13.f326418a
            te3.j13 r7 = r6.mo80305m2()
            r7.f183752e = r4
            te3.j13 r4 = r6.mo80305m2()
            r4.f183755h = r5
            r13.mo160075M()
            com.tencent.mm.plugin.handoff.model.AbsHandOffFile r13 = r12.f270053N
            nc1.a r4 = r12.f270055Q
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r4 = r4.f326418a
            r13.saveToMultiTaskInfo(r4)
        L_0x0469:
            java.lang.Object[] r13 = new java.lang.Object[r2]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            r13[r1] = r2
            java.lang.String r1 = "initFloatBallHelper() ifSupportFB:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r13)
        L_0x0476:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fav.p047ui.detail.FavoriteFileDetailUI.onCreate(android.os.Bundle):void");
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 0, 0, getString(C0966R.string.f7936wt));
    }

    public void onDestroy() {
        setResult(0, getIntent().putExtra("key_activity_browse_time", getActivityBrowseTimeMs()));
        C96875r0 r0Var = this.f270072w;
        if (r0Var != null) {
            r0Var.setVideoCallback((C96875r0.C96876a) null);
            this.f270072w.stop();
            this.f270072w.onDetach();
        }
        C87694a aVar = this.f270054P;
        if (aVar != null) {
            aVar.mo67996A0();
        }
        C100111a aVar2 = this.f270055Q;
        if (aVar2 != null) {
            aVar2.getClass();
        }
        if (this.f270053N != null) {
            ((C92331c) C86312j.m106911c(C92331c.class)).A70(this.f270053N);
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C87694a aVar;
        C100111a aVar2;
        Log.m105925i("MicroMsg.FavoriteFileDetailUI", "onKeyDown keyCode %d", Integer.valueOf(i));
        if (i == 4 && (aVar2 = this.f270055Q) != null && aVar2.mo67896U(2, false)) {
            return true;
        }
        if (i != 4 || (aVar = this.f270054P) == null || !aVar.mo64004y0(2)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        Class cls = C100718j1.class;
        boolean z = false;
        Log.m105925i("MicroMsg.FavoriteFileDetailUI", "on favitem change, notifyId:%s, curId:%d", str, Long.valueOf(this.f270041B.field_localId));
        C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142266Yt(this.f270041B.field_localId);
        if (Yt != null || this.f270045F) {
            if (!this.f270045F) {
                this.f270041B = Yt;
            }
            mo128413R7();
            C100746u Yt2 = ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).mo142252Yt(this.f270042C.f299280T);
            if (Yt2 != null) {
                int i = Yt2.field_status;
                if (i == 1) {
                    z = true;
                } else if (this.f270042C.f299258I != 8 && !this.f270052M) {
                    if (i == 4) {
                        if (((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).mo142252Yt(this.f270042C.f299280T).field_extFlag != 0) {
                            C100734q.m131853i0(this.f270041B, this.f270042C, true);
                            this.f270052M = true;
                        }
                    }
                    Log.m105925i("MicroMsg.FavoriteFileDetailUI", "FavoriteFileDetail download, check retry, return %B", Boolean.valueOf(this.f270052M));
                    z = this.f270052M;
                }
            }
            if (!z) {
                this.f270040A.post(new C93510e());
                return;
            }
            return;
        }
        Log.m105928w("MicroMsg.FavoriteFileDetailUI", "error, on notify change, cannot find info");
        finish();
    }

    public void onPause() {
        Class cls = C100718j1.class;
        super.onPause();
        ((C100718j1) C86312j.m106911c(cls)).mo128199Jq().remove(this);
        ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).mo142250SE(this);
        C96875r0 r0Var = this.f270072w;
        if (r0Var != null) {
            r0Var.stop();
        }
        C87694a aVar = this.f270054P;
        if (aVar != null) {
            aVar.mo64001C();
        }
        C100111a aVar2 = this.f270055Q;
        if (aVar2 != null) {
            aVar2.mo74189F();
        }
    }

    public void onResume() {
        Class cls = C100718j1.class;
        super.onResume();
        ((C100718j1) C86312j.m106911c(cls)).mo128199Jq().add(this);
        ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).mo142255jo(this);
        C96875r0 r0Var = this.f270072w;
        if (r0Var != null) {
            r0Var.start();
        }
        C87694a aVar = this.f270054P;
        if (aVar != null) {
            aVar.mo64003o();
        }
        C100111a aVar2 = this.f270055Q;
        if (aVar2 != null) {
            aVar2.mo74188E();
        }
    }
}
