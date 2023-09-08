package com.tencent.p014mm.plugin.fav.p047ui.detail;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.MMLoadScrollView;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.fav.p047ui.C93594f1;
import com.tencent.p014mm.plugin.fav.p047ui.C93685p0;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96874n1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import p200lx.C46896e0;
import p200lx.C46900z;
import p996kj.C88155a;
import pb1.C100695a0;
import pb1.C100703e0;
import pb1.C100717j0;
import pb1.C100718j1;
import pb1.C100723m0;
import pb1.C100734q;
import pb1.C100746u;
import pb1.C100755z;
import qo3.C77407n;
import qo3.C89779i0;
import te3.C101834rc0;
import te3.C51216sa2;
import wc3.C78538u;
import xb1.C102612a;
import xb1.C102614d;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI */
public class FavoriteImgDetailUI extends BaseFavDetailReportUI implements C100723m0 {

    /* renamed from: w */
    public static final /* synthetic */ int f270088w = 0;

    /* renamed from: j */
    public LinearLayout f270089j;

    /* renamed from: n */
    public int f270090n = 0;

    /* renamed from: o */
    public C100755z f270091o;

    /* renamed from: p */
    public HashMap<String, C93530h> f270092p = new HashMap<>();

    /* renamed from: q */
    public Bitmap f270093q;

    /* renamed from: r */
    public boolean f270094r = true;

    /* renamed from: s */
    public C46900z f270095s;

    /* renamed from: t */
    public View.OnClickListener f270096t = new C93528f();

    /* renamed from: u */
    public View.OnLongClickListener f270097u = new C93529g();

    /* renamed from: v */
    public IListener f270098v = new IListener<RecogQBarOfImageFileResultEvent>(C40008f.f107254d) {
        {
            this.__eventId = 812146647;
        }

        public boolean callback(IEvent iEvent) {
            RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = (RecogQBarOfImageFileResultEvent) iEvent;
            String str = recogQBarOfImageFileResultEvent.f265015d.f265016a;
            C93530h hVar = null;
            for (C93530h next : FavoriteImgDetailUI.this.f270092p.values()) {
                if (str.equals(C100734q.m131880w(next.f270117a))) {
                    hVar = next;
                }
            }
            if (hVar == null) {
                return true;
            }
            C96874n1 n1Var = C96874n1.f283849a;
            String d = n1Var.mo135195d(recogQBarOfImageFileResultEvent);
            int b = n1Var.mo135193b(recogQBarOfImageFileResultEvent);
            int c = n1Var.mo135194c(recogQBarOfImageFileResultEvent);
            String nullAs = Util.nullAs(d, "");
            hVar.f270121e = nullAs;
            hVar.f270122f = b;
            hVar.f270123g = c;
            if (Util.isNullOrNil(nullAs) || !hVar.f270119c.mo107563h()) {
                return true;
            }
            FavoriteImgDetailUI.m118146K7(FavoriteImgDetailUI.this, hVar);
            return true;
        }
    };

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI$a */
    public class C93518a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Dialog f270100d;

        public C93518a(Dialog dialog) {
            this.f270100d = dialog;
        }

        public void run() {
            this.f270100d.dismiss();
            FavoriteImgDetailUI favoriteImgDetailUI = FavoriteImgDetailUI.this;
            C75026b.m89951a(favoriteImgDetailUI, favoriteImgDetailUI.getString(C0966R.string.cmm));
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI$b */
    public class C93519b implements MenuItem.OnMenuItemClickListener {
        public C93519b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            FavoriteImgDetailUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI$c */
    public class C93520c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ long f270103d;

        /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI$c$a */
        public class C93521a implements C11182m0 {
            public C93521a() {
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                FavoriteImgDetailUI favoriteImgDetailUI = FavoriteImgDetailUI.this;
                if (favoriteImgDetailUI.f270094r) {
                    e0Var.mo107142f(2, favoriteImgDetailUI.getString(C0966R.string.crb));
                }
                e0Var.mo107142f(3, FavoriteImgDetailUI.this.getString(C0966R.string.cqz));
                e0Var.mo107142f(0, FavoriteImgDetailUI.this.getString(C0966R.string.cnr));
                e0Var.mo107142f(1, FavoriteImgDetailUI.this.getContext().getString(C0966R.string.f7944x1));
            }
        }

        /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI$c$b */
        public class C93522b implements C11184p0 {

            /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI$c$b$a */
            public class C93523a implements DialogInterface.OnClickListener {

                /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI$c$b$a$a */
                public class C93524a implements Runnable {

                    /* renamed from: d */
                    public final /* synthetic */ C89779i0 f270108d;

                    public C93524a(C89779i0 i0Var) {
                        this.f270108d = i0Var;
                    }

                    public void run() {
                        FavoriteImgDetailUI.this.f270015g.f295031p = true;
                        this.f270108d.dismiss();
                        Log.m105919d("MicroMsg.FavoriteImgDetailUI", "do del, local id %d", Long.valueOf(FavoriteImgDetailUI.this.f270091o.field_localId));
                        FavoriteImgDetailUI.this.finish();
                    }
                }

                public C93523a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    C100734q.m131856k(FavoriteImgDetailUI.this.f270091o.field_localId, new C93524a(C76879j.m92723Q(FavoriteImgDetailUI.this.getContext(), "", FavoriteImgDetailUI.this.getString(C0966R.string.f7946x3), false, false, (DialogInterface.OnCancelListener) null)), 16);
                }
            }

            public C93522b() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                int itemId = menuItem.getItemId();
                if (itemId == 0) {
                    Intent intent = new Intent();
                    intent.putExtra("key_fav_scene", 2);
                    intent.putExtra("key_fav_item_id", FavoriteImgDetailUI.this.f270091o.field_localId);
                    C100734q.m131875t0(FavoriteImgDetailUI.this.getContext(), ".ui.FavTagEditUI", intent, (Bundle) null);
                    FavoriteImgDetailUI favoriteImgDetailUI = FavoriteImgDetailUI.this;
                    favoriteImgDetailUI.f270015g.f295030o++;
                    favoriteImgDetailUI.mo128401H7(7);
                } else if (itemId == 1) {
                    C76879j.m92750u(FavoriteImgDetailUI.this.getContext(), FavoriteImgDetailUI.this.getString(C0966R.string.f7946x3), "", new C93523a(), (DialogInterface.OnClickListener) null);
                    FavoriteImgDetailUI.this.mo128401H7(6);
                } else if (itemId == 2) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("Select_Conv_Type", 3);
                    intent2.putExtra("scene_from", 1);
                    intent2.putExtra("mutil_select_is_ret", true);
                    intent2.putExtra("select_fav_local_id", FavoriteImgDetailUI.this.f270091o.field_localId);
                    C100717j0.m131779a(intent2, FavoriteImgDetailUI.this.f270091o);
                    C88144b.m109802t(FavoriteImgDetailUI.this, ".ui.transmit.SelectConversationUI", intent2, 1);
                    C100695a0.m131729d(FavoriteImgDetailUI.this.f270091o.field_localId, 1, 0, -1);
                    FavoriteImgDetailUI favoriteImgDetailUI2 = FavoriteImgDetailUI.this;
                    favoriteImgDetailUI2.f270015g.f295027l++;
                    favoriteImgDetailUI2.mo128401H7(3);
                } else if (itemId == 3) {
                    C93520c cVar = C93520c.this;
                    FavoriteImgDetailUI favoriteImgDetailUI3 = FavoriteImgDetailUI.this;
                    C93685p0.m118380b(favoriteImgDetailUI3, cVar.f270103d, favoriteImgDetailUI3.f270015g);
                    FavoriteImgDetailUI.this.mo128401H7(5);
                }
            }
        }

        public C93520c(long j) {
            this.f270103d = j;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C77407n nVar = new C77407n((Context) FavoriteImgDetailUI.this.getContext(), 1, false);
            nVar.f225771i = new C93521a();
            nVar.f225782p = new C93522b();
            nVar.mo107573q();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI$d */
    public class C93525d implements C46900z.C46902b {
        public C93525d() {
        }

        /* renamed from: a */
        public void mo72110a(String str, C51216sa2 sa22) {
            C77407n nVar;
            Log.m105925i("MicroMsg.FavoriteImgDetailUI", "alvinluo onFetchedCodeInfo codeStr: %s", str);
            C93530h hVar = null;
            for (C93530h next : FavoriteImgDetailUI.this.f270092p.values()) {
                if (str.equals(next.f270121e)) {
                    hVar = next;
                }
            }
            if (hVar != null && (nVar = hVar.f270119c) != null && nVar.mo107563h()) {
                FavoriteImgDetailUI.m118146K7(FavoriteImgDetailUI.this, hVar);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI$e */
    public class C93526e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C93530h f270111d;

        /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI$e$a */
        public class C93527a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f270113d;

            public C93527a(Bitmap bitmap) {
                this.f270113d = bitmap;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
                return;
             */
            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x011a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r7 = this;
                    com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI$e r0 = com.tencent.p014mm.plugin.fav.p047ui.detail.FavoriteImgDetailUI.C93526e.this
                    com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI r1 = com.tencent.p014mm.plugin.fav.p047ui.detail.FavoriteImgDetailUI.this
                    com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI$h r0 = r0.f270111d
                    android.graphics.Bitmap r2 = r7.f270113d
                    int r3 = com.tencent.p014mm.plugin.fav.p047ui.detail.FavoriteImgDetailUI.f270088w
                    r1.getClass()
                    if (r2 != 0) goto L_0x0015
                    te3.rc0 r2 = r0.f270117a
                    android.graphics.Bitmap r2 = r1.mo128424L7(r2)
                L_0x0015:
                    r3 = 2
                    if (r2 == 0) goto L_0x004d
                    r4 = 3
                    java.lang.Object[] r4 = new java.lang.Object[r4]
                    r5 = 0
                    int r6 = r2.getWidth()
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                    r4[r5] = r6
                    r5 = 1
                    int r6 = r2.getHeight()
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                    r4[r5] = r6
                    int r5 = r1.f270090n
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                    r4[r3] = r5
                    java.lang.String r5 = "MicroMsg.FavoriteImgDetailUI"
                    java.lang.String r6 = "update view bmp[%d, %d], displayWidth %d"
                    com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r6, r4)
                    int r4 = r2.getWidth()
                    r0.f270125i = r4
                    int r4 = r2.getHeight()
                    r0.f270126j = r4
                L_0x004d:
                    android.widget.ImageView r4 = r0.f270118b     // Catch:{ all -> 0x0125 }
                    android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()     // Catch:{ all -> 0x0125 }
                    r5 = -1
                    r4.width = r5     // Catch:{ all -> 0x0125 }
                    int r5 = r2.getWidth()     // Catch:{ all -> 0x0125 }
                    int r1 = r1.f270090n     // Catch:{ all -> 0x0125 }
                    int r6 = r1 / 3
                    if (r5 <= r6) goto L_0x00a4
                    float r1 = (float) r1     // Catch:{ all -> 0x0125 }
                    int r5 = r2.getWidth()     // Catch:{ all -> 0x0125 }
                    float r5 = (float) r5     // Catch:{ all -> 0x0125 }
                    float r1 = r1 / r5
                    int r5 = r2.getHeight()     // Catch:{ all -> 0x0125 }
                    float r5 = (float) r5     // Catch:{ all -> 0x0125 }
                    float r1 = r1 * r5
                    int r1 = (int) r1     // Catch:{ all -> 0x0125 }
                    r4.height = r1     // Catch:{ all -> 0x0125 }
                    int r5 = com.tencent.p014mm.sdk.platformtools.ForceGpuUtil.getMaxTextureSize()     // Catch:{ all -> 0x0125 }
                    if (r1 <= r5) goto L_0x009c
                    int r1 = r2.getWidth()     // Catch:{ all -> 0x0125 }
                    int r5 = r2.getHeight()     // Catch:{ all -> 0x0125 }
                    boolean r1 = com.tencent.p014mm.sdk.platformtools.ForceGpuUtil.canUseHardwareAcceleration(r1, r5)     // Catch:{ all -> 0x0125 }
                    if (r1 != 0) goto L_0x0094
                    int r1 = com.tencent.p014mm.sdk.platformtools.ForceGpuUtil.getMaxTextureSize()     // Catch:{ all -> 0x0125 }
                    int r1 = r1 >> r3
                    r4.height = r1     // Catch:{ all -> 0x0125 }
                    android.widget.ImageView r1 = r0.f270118b     // Catch:{ all -> 0x0125 }
                    android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ all -> 0x0125 }
                    r1.setScaleType(r3)     // Catch:{ all -> 0x0125 }
                    goto L_0x00d8
                L_0x0094:
                    android.widget.ImageView r1 = r0.f270118b     // Catch:{ all -> 0x0125 }
                    android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ all -> 0x0125 }
                    r1.setScaleType(r3)     // Catch:{ all -> 0x0125 }
                    goto L_0x00d8
                L_0x009c:
                    android.widget.ImageView r1 = r0.f270118b     // Catch:{ all -> 0x0125 }
                    android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ all -> 0x0125 }
                    r1.setScaleType(r3)     // Catch:{ all -> 0x0125 }
                    goto L_0x00d8
                L_0x00a4:
                    int r1 = r2.getHeight()     // Catch:{ all -> 0x0125 }
                    int r5 = com.tencent.p014mm.sdk.platformtools.ForceGpuUtil.getMaxTextureSize()     // Catch:{ all -> 0x0125 }
                    if (r1 <= r5) goto L_0x00bd
                    int r1 = com.tencent.p014mm.sdk.platformtools.ForceGpuUtil.getMaxTextureSize()     // Catch:{ all -> 0x0125 }
                    int r1 = r1 >> r3
                    r4.height = r1     // Catch:{ all -> 0x0125 }
                    android.widget.ImageView r1 = r0.f270118b     // Catch:{ all -> 0x0125 }
                    android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ all -> 0x0125 }
                    r1.setScaleType(r3)     // Catch:{ all -> 0x0125 }
                    goto L_0x00d8
                L_0x00bd:
                    android.widget.ImageView r1 = r0.f270118b     // Catch:{ all -> 0x0125 }
                    int r1 = r1.getMinimumWidth()     // Catch:{ all -> 0x0125 }
                    int r3 = r2.getWidth()     // Catch:{ all -> 0x0125 }
                    if (r1 <= r3) goto L_0x00d1
                    android.widget.ImageView r1 = r0.f270118b     // Catch:{ all -> 0x0125 }
                    int r1 = r1.getMinimumWidth()     // Catch:{ all -> 0x0125 }
                    r4.width = r1     // Catch:{ all -> 0x0125 }
                L_0x00d1:
                    android.widget.ImageView r1 = r0.f270118b     // Catch:{ all -> 0x0125 }
                    android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ all -> 0x0125 }
                    r1.setScaleType(r3)     // Catch:{ all -> 0x0125 }
                L_0x00d8:
                    android.widget.ImageView r1 = r0.f270118b     // Catch:{ all -> 0x0125 }
                    int r3 = r2.getWidth()     // Catch:{ all -> 0x0125 }
                    int r4 = r2.getHeight()     // Catch:{ all -> 0x0125 }
                    com.tencent.p014mm.sdk.platformtools.ForceGpuUtil.decideLayerType(r1, r3, r4)     // Catch:{ all -> 0x0125 }
                    te3.rc0 r1 = r0.f270117a     // Catch:{ all -> 0x0125 }
                    java.lang.String r1 = pb1.C100734q.m131880w(r1)     // Catch:{ all -> 0x0125 }
                    boolean r3 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isGif((java.lang.String) r1)     // Catch:{ all -> 0x0125 }
                    if (r3 == 0) goto L_0x0120
                    java.lang.Class<bq.g0> r3 = p008bq.C92279g0.class
                    di3.d r3 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x011a }
                    bq.g0 r3 = (p008bq.C92279g0) r3     // Catch:{ Exception -> 0x011a }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011a }
                    r4.<init>()     // Catch:{ Exception -> 0x011a }
                    r4.append(r1)     // Catch:{ Exception -> 0x011a }
                    java.lang.String r5 = "_detail"
                    r4.append(r5)     // Catch:{ Exception -> 0x011a }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x011a }
                    qz1.b r1 = r3.mo126019w(r4, r1)     // Catch:{ Exception -> 0x011a }
                    android.widget.ImageView r3 = r0.f270118b     // Catch:{ Exception -> 0x011a }
                    r3.setImageDrawable(r1)     // Catch:{ Exception -> 0x011a }
                    r1.stop()     // Catch:{ Exception -> 0x011a }
                    r1.start()     // Catch:{ Exception -> 0x011a }
                    goto L_0x0125
                L_0x011a:
                    android.widget.ImageView r0 = r0.f270118b     // Catch:{ all -> 0x0125 }
                    r0.setImageBitmap(r2)     // Catch:{ all -> 0x0125 }
                    goto L_0x0125
                L_0x0120:
                    android.widget.ImageView r0 = r0.f270118b     // Catch:{ all -> 0x0125 }
                    r0.setImageBitmap(r2)     // Catch:{ all -> 0x0125 }
                L_0x0125:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fav.p047ui.detail.FavoriteImgDetailUI.C93526e.C93527a.run():void");
            }

            public String toString() {
                return super.toString() + "|renderView";
            }
        }

        public C93526e(C93530h hVar) {
            this.f270111d = hVar;
        }

        public void run() {
            Bitmap g = FavoriteImageServer.m118078g(this.f270111d.f270117a, FavoriteImgDetailUI.this.f270091o, true);
            if (g == null) {
                Log.m105918d("MicroMsg.FavoriteImgDetailUI", "get big img fail");
                g = FavoriteImgDetailUI.this.mo128424L7(this.f270111d.f270117a);
            }
            MMHandlerThread.postToMainThread(new C93527a(g));
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI$f */
    public class C93528f implements View.OnClickListener {
        public C93528f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/detail/FavoriteImgDetailUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("key_detail_info_id", FavoriteImgDetailUI.this.f270091o.field_localId);
            intent.putExtra("key_detail_data_id", ((C101834rc0) view.getTag()).f299280T);
            C100734q.m131875t0(FavoriteImgDetailUI.this.getContext(), ".ui.FavImgGalleryUI", intent, (Bundle) null);
            FavoriteImgDetailUI.this.f270015g.f295026k++;
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteImgDetailUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI$g */
    public class C93529g implements View.OnLongClickListener {
        public C93529g() {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/detail/FavoriteImgDetailUI$6", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C93530h hVar = FavoriteImgDetailUI.this.f270092p.get(((C101834rc0) view.getTag()).f299280T);
            FavoriteImgDetailUI.m118146K7(FavoriteImgDetailUI.this, hVar);
            if (!hVar.f270120d) {
                FavoriteImgDetailUI.this.getClass();
                RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new RecogQBarOfImageFileEvent();
                recogQBarOfImageFileEvent.f107731d.f107733b = C100734q.m131880w(hVar.f270117a);
                recogQBarOfImageFileEvent.f107731d.f107732a = System.currentTimeMillis();
                recogQBarOfImageFileEvent.f107731d.f107737f = 2;
                recogQBarOfImageFileEvent.publish();
                hVar.f270120d = true;
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteImgDetailUI$6", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI$h */
    public class C93530h {

        /* renamed from: a */
        public C101834rc0 f270117a;

        /* renamed from: b */
        public ImageView f270118b;

        /* renamed from: c */
        public C77407n f270119c;

        /* renamed from: d */
        public boolean f270120d = false;

        /* renamed from: e */
        public String f270121e = null;

        /* renamed from: f */
        public int f270122f = 0;

        /* renamed from: g */
        public int f270123g = 0;

        /* renamed from: h */
        public boolean f270124h;

        /* renamed from: i */
        public int f270125i = 0;

        /* renamed from: j */
        public int f270126j = 0;

        public C93530h(FavoriteImgDetailUI favoriteImgDetailUI, C93519b bVar) {
            this.f270119c = new C77407n((Context) favoriteImgDetailUI.getContext(), 1, false);
        }
    }

    /* renamed from: K7 */
    public static void m118146K7(FavoriteImgDetailUI favoriteImgDetailUI, C93530h hVar) {
        favoriteImgDetailUI.getClass();
        C77407n nVar = hVar.f270119c;
        nVar.f225771i = new C93572k(favoriteImgDetailUI, nVar, hVar);
        nVar.f225782p = new C93573l(favoriteImgDetailUI, hVar);
        nVar.f225761d = new C93574m(favoriteImgDetailUI, hVar);
        if (!favoriteImgDetailUI.getContext().isFinishing()) {
            nVar.mo107573q();
        }
    }

    /* renamed from: I7 */
    public MMLoadScrollView mo128398I7() {
        return (MMLoadScrollView) findViewById(C0966R.C0970id.j48);
    }

    /* renamed from: L7 */
    public final Bitmap mo128424L7(C101834rc0 rc02) {
        Bitmap i = FavoriteImageServer.m118080i(rc02, this.f270091o);
        boolean z = true;
        Object[] objArr = new Object[1];
        if (i == null) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        Log.m105919d("MicroMsg.FavoriteImgDetailUI", "get thumb ok ? %B", objArr);
        if (i != null) {
            return i;
        }
        if (this.f270093q == null) {
            this.f270093q = C88155a.decodeResource(getResources(), C0966R.raw.fav_list_img_default, (BitmapFactory.Options) null);
        }
        return this.f270093q;
    }

    /* renamed from: M7 */
    public final void mo128425M7(C93530h hVar) {
        C86709a0.m107525e().postToWorker(new C93526e(hVar));
    }

    /* renamed from: N7 */
    public final void mo128426N7() {
        int dimensionPixelOffset = C85875k4.m106184h(getContext()).x - (getResources().getDimensionPixelOffset(C0966R.dimen.f3799es) * 2);
        this.f270090n = dimensionPixelOffset;
        int max = Math.max(dimensionPixelOffset, 0);
        this.f270090n = max;
        Log.m105919d("MicroMsg.FavoriteImgDetailUI", "update display width %d", Integer.valueOf(max));
    }

    /* renamed from: R4 */
    public void mo128275R4(C100746u uVar) {
        if (uVar != null && uVar.mo140168o2()) {
            Log.m105925i("MicroMsg.FavoriteImgDetailUI", "on cdn status change, dataid[%s]", uVar.field_dataId);
            C93530h hVar = this.f270092p.get(uVar.field_dataId);
            if (hVar != null) {
                mo128425M7(hVar);
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a7j;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (1 == i) {
            if (-1 == i2) {
                if (new C100703e0().mo140132a(this.f270091o)) {
                    C76879j.m92726T(getContext(), getString(C0966R.string.f7260k));
                    return;
                }
                String stringExtra = intent.getStringExtra("Select_Conv_User");
                String stringExtra2 = intent.getStringExtra("custom_send_text");
                Log.m105919d("MicroMsg.FavoriteImgDetailUI", "select %s for sending", stringExtra);
                C93594f1.m118181i(getContext(), stringExtra, stringExtra2, this.f270091o, new C93518a(C76879j.m92723Q(getContext(), "", getString(C0966R.string.col), true, false, (DialogInterface.OnCancelListener) null)));
            } else {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo128426N7();
        for (Map.Entry<String, C93530h> value : this.f270092p.entrySet()) {
            mo128425M7((C93530h) value.getValue());
        }
    }

    public void onCreate(Bundle bundle) {
        Class cls = C100718j1.class;
        supportRequestWindowFeature(109);
        super.onCreate(bundle);
        mo128426N7();
        this.f270089j = (LinearLayout) findViewById(C0966R.C0970id.cvi);
        long longExtra = getIntent().getLongExtra("key_detail_info_id", -1);
        C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142266Yt(longExtra);
        this.f270091o = Yt;
        if (Yt == null) {
            finish();
            return;
        }
        mo128399J7(Yt);
        Iterator<C101834rc0> it = this.f270091o.field_favProto.f298618f.iterator();
        int i = 0;
        while (it.hasNext()) {
            C101834rc0 next = it.next();
            Log.m105919d("MicroMsg.FavoriteImgDetailUI", "index[%d], dataid[%s]", Integer.valueOf(i), next.f299280T);
            C93530h hVar = new C93530h(this, (C93519b) null);
            hVar.f270117a = next;
            int i2 = i + 1;
            ImageView imageView = new ImageView(getContext());
            int dimensionPixelSize = getResources().getDimensionPixelSize(C0966R.dimen.f3956le);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            if (i > 0) {
                layoutParams.topMargin = dimensionPixelSize;
            }
            this.f270089j.addView(imageView, layoutParams);
            imageView.setTag(next);
            int i3 = dimensionPixelSize / 2;
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setPadding(i3, i3, i3, i3);
            imageView.setMinimumWidth(C76577a.m92151b(getContext(), 50));
            imageView.setMinimumHeight(C76577a.m92151b(getContext(), 50));
            imageView.setImageResource(C0966R.raw.fav_list_img_default);
            imageView.setOnClickListener(this.f270096t);
            imageView.setOnLongClickListener(this.f270097u);
            imageView.setOnTouchListener(new C93571j(this, next, imageView, i3));
            hVar.f270118b = imageView;
            this.f270092p.put(next.f299280T, hVar);
            mo128425M7(hVar);
            if (next.f299322q1 != 0) {
                this.f270094r = false;
            }
            i = i2;
        }
        setMMTitle(getString(C0966R.string.cn9));
        C93575n.m118170a(this, this.f270091o);
        setBackBtn(new C93519b());
        addIconOptionMenu(0, (int) C0966R.string.k3h, (int) C0966R.raw.actionbar_icon_dark_more, (MenuItem.OnMenuItemClickListener) new C93520c(longExtra));
        C78538u.m94868d(this);
        ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).mo142255jo(this);
        this.f270098v.alive();
        this.f270095s = ((C46896e0) C86312j.m106911c(C46896e0.class)).Mp0(this, new C93525d());
    }

    public void onDestroy() {
        ((C102612a) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128198DE()).mo142250SE(this);
        this.f270098v.dead();
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
        for (Map.Entry<String, C93530h> value : this.f270092p.entrySet()) {
            mo128425M7((C93530h) value.getValue());
        }
    }
}
