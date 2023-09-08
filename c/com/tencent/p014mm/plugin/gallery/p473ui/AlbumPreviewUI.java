package com.tencent.p014mm.plugin.gallery.p473ui;

import a70.C112760b;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aw0.C103928o;
import bh3.C113177k;
import cc0.C79995a;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.GalleryOpeReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsTemplateReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.VideoAlbumErrorReportStruct;
import com.tencent.p014mm.component.api.jumper.UICustomParam;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.modelimage.C68118i0;
import com.tencent.p014mm.modelimage.C92806b;
import com.tencent.p014mm.modelimage.C92837k0;
import com.tencent.p014mm.p136ui.C44706b;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.base.DrawedCallBackFrameLayout;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiResumeDownloadTaskForNative;
import com.tencent.p014mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew;
import com.tencent.p014mm.plugin.gallery.model.C93946b;
import com.tencent.p014mm.plugin.gallery.model.C93947c;
import com.tencent.p014mm.plugin.gallery.model.C93951d;
import com.tencent.p014mm.plugin.gallery.model.C93958f;
import com.tencent.p014mm.plugin.gallery.model.C93963i;
import com.tencent.p014mm.plugin.gallery.model.C93964k;
import com.tencent.p014mm.plugin.gallery.model.C93970n;
import com.tencent.p014mm.plugin.gallery.model.C93974o;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$AlbumItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem;
import com.tencent.p014mm.plugin.gallery.model.PrivateAlbumItem;
import com.tencent.p014mm.plugin.gallery.p473ui.C94049a;
import com.tencent.p014mm.plugin.gallery.p473ui.C94057e;
import com.tencent.p014mm.plugin.gallery.p473ui.ImageFolderMgrView;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.jumper.VideoCaptureReportInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96892t1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import da0.C58247e;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75592q0;
import ew1.C31728a;
import ew1.C97754e;
import f40.C86709a0;
import fw1.C98050a;
import fw1.C98052c;
import gw1.C98253a;
import gy3.C24560g0;
import gy3.C87412m;
import h81.C32735h;
import hd0.C98429r0;
import hh2.C8532a;
import hw1.C60218q;
import hw1.C60220r;
import hw1.C60222v;
import hw1.C98551l;
import hw1.C98554s;
import i21.C60242i;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import k20.C60958c;
import k20.C9556a;
import k21.C60960c;
import kg3.C76577a;
import nj3.C76879j;
import nj3.C88989a;
import ow1.C100561b;
import ow1.C100568g;
import ow1.C100571i;
import ow1.C11773j;
import ow1.C62183d;
import ow1.c$$a;
import ow1.c$$b;
import ow1.c$$c;
import ow1.c$$d;
import p156gj.C87203t;
import p158gt.C98201k;
import p166hy.C98561h0;
import p166hy.C98567o0;
import p272xq.C102712e;
import p272xq.C38804g;
import p272xq.C38805i;
import p385u2.C111105a;
import p447aw.C103918d;
import p511ew.C58849b;
import p606mm.C99933h;
import p645pj.C35511a;
import p749xh.C102666r2;
import p90.C100687b;
import p910lj.C76701a;
import p918s2.C90111a;
import pw1.C62569a;
import q90.C101069i;
import qh0.C62619a;
import qo3.C77426q;
import qo3.C89779i0;
import qw1.C101314g;
import qw1.C101316l;
import qw1.C12933a;
import qw1.C63339b;
import qw1.C63340i;
import rx3.C13604l;
import te3.C101834rc0;
import te3.e94;
import uf0.C102016c;
import xb0.C102609h;
import xb1.C102615e;
import xg2.C102635b;
import z51.C102975i;
import zt3.C119143b;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI */
public class AlbumPreviewUI extends BaseMvvmActivity implements C93964k.C93967c {

    /* renamed from: w1 */
    public static long f271242w1;

    /* renamed from: x1 */
    public static final /* synthetic */ int f271243x1 = 0;

    /* renamed from: A */
    public LinearLayout f271244A;

    /* renamed from: B */
    public String f271245B;

    /* renamed from: C */
    public String f271246C;

    /* renamed from: D */
    public String f271247D;

    /* renamed from: E */
    public boolean f271248E = false;

    /* renamed from: F */
    public boolean f271249F = false;

    /* renamed from: G */
    public boolean f271250G;

    /* renamed from: H */
    public boolean f271251H;

    /* renamed from: I */
    public boolean f271252I;

    /* renamed from: J */
    public boolean f271253J;

    /* renamed from: K */
    public String f271254K;

    /* renamed from: L */
    public boolean f271255L = false;

    /* renamed from: M */
    public boolean f271256M = false;

    /* renamed from: N */
    public int f271257N;

    /* renamed from: P */
    public boolean f271258P = false;

    /* renamed from: Q */
    public int f271259Q = 0;

    /* renamed from: Q0 */
    public double f271260Q0;

    /* renamed from: R */
    public int f271261R = 0;

    /* renamed from: R0 */
    public double f271262R0;

    /* renamed from: S */
    public String f271263S;

    /* renamed from: S0 */
    public boolean f271264S0 = true;

    /* renamed from: T */
    public String f271265T;

    /* renamed from: T0 */
    public boolean f271266T0;

    /* renamed from: U */
    public long f271267U = 0;

    /* renamed from: U0 */
    public boolean f271268U0;

    /* renamed from: V */
    public long f271269V;

    /* renamed from: V0 */
    public String f271270V0;

    /* renamed from: W */
    public long f271271W = -1;

    /* renamed from: W0 */
    public int f271272W0;

    /* renamed from: X */
    public int f271273X;

    /* renamed from: X0 */
    public int f271274X0;

    /* renamed from: Y */
    public String f271275Y;

    /* renamed from: Y0 */
    public boolean f271276Y0 = false;

    /* renamed from: Z */
    public int f271277Z;

    /* renamed from: Z0 */
    public boolean f271278Z0 = false;

    /* renamed from: a1 */
    public List<Long> f271279a1 = new ArrayList();

    /* renamed from: b1 */
    public int f271280b1 = 3;

    /* renamed from: c1 */
    public boolean f271281c1;

    /* renamed from: d */
    public RecyclerView f271282d;

    /* renamed from: d1 */
    public boolean f271283d1;

    /* renamed from: e */
    public TextView f271284e;

    /* renamed from: e1 */
    public boolean f271285e1;

    /* renamed from: f */
    public boolean f271286f;

    /* renamed from: f1 */
    public boolean f271287f1 = false;

    /* renamed from: g */
    public boolean f271288g;

    /* renamed from: g1 */
    public final C98253a f271289g1 = new C56804j();

    /* renamed from: h */
    public C94049a f271290h;

    /* renamed from: h1 */
    public C56799c0 f271291h1;

    /* renamed from: i */
    public ProgressDialog f271292i;

    /* renamed from: i1 */
    public volatile long f271293i1 = -1;

    /* renamed from: j */
    public TextView f271294j;

    /* renamed from: j1 */
    public MenuItem.OnMenuItemClickListener f271295j1 = new C56808q();

    /* renamed from: k1 */
    public GalleryItem$AlbumItem f271296k1;

    /* renamed from: l1 */
    public C94049a.C94054k f271297l1;

    /* renamed from: m1 */
    public volatile C94000y f271298m1;

    /* renamed from: n */
    public TextView f271299n;

    /* renamed from: n1 */
    public long f271300n1;

    /* renamed from: o */
    public TextView f271301o;

    /* renamed from: o1 */
    public HashMap<String, Long> f271302o1 = new HashMap<>();

    /* renamed from: p */
    public ImageFolderMgrView f271303p;

    /* renamed from: p0 */
    public int f271304p0;

    /* renamed from: p1 */
    public boolean f271305p1;

    /* renamed from: q */
    public LinearLayout f271306q;

    /* renamed from: q1 */
    public C94049a.C94055l f271307q1 = new C93994l();

    /* renamed from: r */
    public RelativeLayout f271308r;

    /* renamed from: r1 */
    public GalleryItem$MediaItem f271309r1 = null;

    /* renamed from: s */
    public TextView f271310s;

    /* renamed from: s1 */
    public C60218q.C60219a f271311s1 = C60218q.C60219a.IDLE;

    /* renamed from: t */
    public TextView f271312t;

    /* renamed from: t1 */
    public int f271313t1 = -1;

    /* renamed from: u */
    public ImageButton f271314u;

    /* renamed from: u1 */
    public int f271315u1 = -1;

    /* renamed from: v */
    public LinearLayout f271316v;

    /* renamed from: v1 */
    public String f271317v1 = "";

    /* renamed from: w */
    public TextView f271318w;

    /* renamed from: x */
    public LinearLayout f271319x;

    /* renamed from: x0 */
    public String f271320x0;

    /* renamed from: y */
    public ImageButton f271321y;

    /* renamed from: y0 */
    public C93964k.C93966b f271322y0;

    /* renamed from: z */
    public TextView f271323z;

    /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$a */
    public class C56795a implements View.OnClickListener {
        public C56795a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            AlbumPreviewUI albumPreviewUI = AlbumPreviewUI.this;
            albumPreviewUI.f271286f = true;
            if (albumPreviewUI.mo128947P7()) {
                AlbumPreviewUI.this.mo128949T7(-1, false);
            } else {
                Intent intent = new Intent(AlbumPreviewUI.this, ImagePreviewUI.class);
                C93958f.m118755o(AlbumPreviewUI.this.f271290h.f271542g);
                intent.putStringArrayListExtra("preview_image_list", AlbumPreviewUI.this.f271290h.mo129055w5());
                intent.putParcelableArrayListExtra("preview_media_item_list", AlbumPreviewUI.this.f271290h.f271542g);
                intent.putExtra("key_edit_video_max_time_length", AlbumPreviewUI.this.getIntent().getIntExtra("key_edit_video_max_time_length", 10));
                intent.putExtra("max_select_count", AlbumPreviewUI.this.f271257N);
                intent.putExtra("send_raw_img", AlbumPreviewUI.this.f271249F);
                intent.putExtra("isSelectAlbum", AlbumPreviewUI.this.f271276Y0);
                intent.putExtra("key_force_hide_edit_image_button", AlbumPreviewUI.this.f271250G);
                intent.putExtra("key_force_show_raw_image_button", AlbumPreviewUI.this.f271252I);
                intent.putExtra("key_is_raw_image_button_disable", AlbumPreviewUI.this.f271253J);
                intent.putExtra("GalleryUI_FromUser", AlbumPreviewUI.this.f271263S);
                intent.putExtra("GalleryUI_ToUser", AlbumPreviewUI.this.f271265T);
                intent.putExtra("key_filter_hdr_video", AlbumPreviewUI.this.getIntent().getBooleanExtra("key_filter_hdr_video", false));
                intent.putExtra("select_type_tag", AlbumPreviewUI.this.f271280b1);
                intent.putExtra("album_business_tag", AlbumPreviewUI.this.f271275Y);
                intent.putExtra("album_video_max_duration", AlbumPreviewUI.this.f271277Z);
                intent.putExtra("album_video_min_duration", AlbumPreviewUI.this.f271304p0);
                AlbumPreviewUI.this.startActivityForResult(intent, 0);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$a0 */
    public static class C56796a0 implements Runnable {

        /* renamed from: d */
        public WeakReference<C94049a> f162784d;

        /* renamed from: e */
        public WeakReference<ProgressDialog> f162785e;

        /* renamed from: f */
        public WeakReference<TextView> f162786f;

        /* renamed from: g */
        public WeakReference<RecyclerView> f162787g;

        /* renamed from: h */
        public LinkedList<GalleryItem$MediaItem> f162788h;

        /* renamed from: i */
        public String f162789i;

        /* renamed from: j */
        public WeakReference<ImageFolderMgrView> f162790j;

        /* renamed from: n */
        public boolean f162791n = false;

        /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$a0$a */
        public class C56797a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ TextView f162792d;

            /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$a0$a$a */
            public class C56798a implements Runnable {
                public C56798a() {
                }

                public void run() {
                    C56797a.this.f162792d.setVisibility(8);
                    C56797a.this.f162792d.setAlpha(1.0f);
                }
            }

            public C56797a(C56796a0 a0Var, TextView textView) {
                this.f162792d = textView;
            }

            public void run() {
                if (8 != this.f162792d.getVisibility()) {
                    this.f162792d.animate().alpha(0.0f).setDuration(300).withEndAction(new C56798a());
                }
            }
        }

        public C56796a0(C56804j jVar) {
        }

        public void run() {
            RecyclerView recyclerView;
            TextView textView;
            ImageFolderMgrView imageFolderMgrView;
            GalleryItem$MediaItem next;
            int indexOf;
            Object[] objArr = new Object[1];
            LinkedList<GalleryItem$MediaItem> linkedList = this.f162788h;
            objArr[0] = Integer.valueOf(linkedList == null ? -1 : linkedList.size());
            Log.m105919d("MicroMsg.AlbumPreviewUI", "on NotifyMediaItemsChanged, size %d", objArr);
            LinkedList<GalleryItem$MediaItem> linkedList2 = this.f162788h;
            int i = AlbumPreviewUI.f271243x1;
            if (linkedList2 == null) {
                Log.m105920e("MicroMsg.AlbumPreviewUI", "[filterEditMediaItem] mMediaItems is null!");
            } else {
                HashSet<GalleryItem$MediaItem> h = C93958f.m118748h();
                if (h == null || h.isEmpty()) {
                    Log.m105924i("MicroMsg.AlbumPreviewUI", "editedMediaSet is invalid.");
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    Log.m105925i("MicroMsg.AlbumPreviewUI", "[filterEditMediaItem] size:%s", Integer.valueOf(linkedList2.size()));
                    Iterator<GalleryItem$MediaItem> it = h.iterator();
                    while (it.hasNext() && -1 != (indexOf = linkedList2.indexOf(next))) {
                        GalleryItem$MediaItem galleryItem$MediaItem = linkedList2.get(indexOf);
                        if (galleryItem$MediaItem != null && (next = it.next()).f162755o.equals("edit") && !galleryItem$MediaItem.f162755o.equals("edit")) {
                            Log.m105919d("MicroMsg.AlbumPreviewUI", "item:%s, editItem:%s", galleryItem$MediaItem, next);
                            linkedList2.set(indexOf, next);
                        }
                    }
                    Log.m105919d("MicroMsg.AlbumPreviewUI", "[filterEditMediaItem] cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                }
            }
            WeakReference<C94049a> weakReference = this.f162784d;
            if (weakReference == null) {
                Log.m105928w("MicroMsg.AlbumPreviewUI", "null == adapterRef");
                return;
            }
            C94049a aVar = weakReference.get();
            if (aVar == null) {
                Log.m105928w("MicroMsg.AlbumPreviewUI", "null == adapter");
                return;
            }
            WeakReference<RecyclerView> weakReference2 = this.f162787g;
            if (weakReference2 != null && (recyclerView = weakReference2.get()) != null) {
                Log.m105919d("MicroMsg.AlbumPreviewUI", "isSwitchAlbum: %s.", Boolean.valueOf(this.f162791n));
                C98554s sVar = C98554s.f289007d;
                C98554s sVar2 = C98554s.f289007d;
                sVar2.mo137930d(this.f162788h);
                if (this.f162791n) {
                    this.f162791n = false;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    C117292a.m165358d(recyclerView, aVar2.mo10232b(), "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$NotifyMediaItemsChanged", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                    recyclerView.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$NotifyMediaItemsChanged", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                    aVar.mo129051m4(this.f162788h);
                    C60218q.C60219a aVar3 = C60218q.C60219a.IDLE;
                    int i2 = 32;
                    if (this.f162788h.size() <= 32) {
                        i2 = this.f162788h.size();
                    }
                    sVar2.mo137928b(aVar3, 0, i2, aVar.mo129053u5());
                } else {
                    LinkedList<GalleryItem$MediaItem> linkedList3 = this.f162788h;
                    int itemCount = aVar.getItemCount() - aVar.mo129039G4();
                    int size = linkedList3.size();
                    if (itemCount < size) {
                        aVar.f271541f.addAll(linkedList3.subList(itemCount, size));
                        aVar.notifyItemRangeInserted(aVar.mo129039G4() + itemCount, aVar.getItemCount());
                    }
                }
                WeakReference<ProgressDialog> weakReference3 = this.f162785e;
                if (weakReference3 != null) {
                    ProgressDialog progressDialog = weakReference3.get();
                    if (progressDialog != null && progressDialog.isShowing()) {
                        progressDialog.dismiss();
                        Log.m105925i("MicroMsg.AlbumPreviewUI", "[NotifyMediaItemsChanged] cost:%s", Long.valueOf(System.currentTimeMillis() - AlbumPreviewUI.f271242w1));
                    }
                    WeakReference<ImageFolderMgrView> weakReference4 = this.f162790j;
                    if (!(weakReference4 == null || (imageFolderMgrView = weakReference4.get()) == null)) {
                        imageFolderMgrView.setFavItemCount(this.f162788h.size());
                    }
                    if (this.f162786f != null && !Util.isNullOrNil(this.f162789i) && (textView = this.f162786f.get()) != null) {
                        String O4 = aVar.mo129042O4(((GridLayoutManager) recyclerView.getLayoutManager()).mo16957C());
                        if (!Util.isNullOrNil(O4) && O4.equals("album_business_bubble_media_by_coordinate")) {
                            textView.setVisibility(0);
                            textView.setText(this.f162789i.concat("附近的照片和视频"));
                            textView.postDelayed(new C56797a(this, textView), 2000);
                        }
                    }
                }
            }
        }

        public String toString() {
            return super.toString() + "|NotifyMediaItemsChanged";
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$c0 */
    public static class C56799c0 implements Runnable {

        /* renamed from: d */
        public WeakReference<C94049a> f162794d;

        /* renamed from: e */
        public WeakReference<ProgressDialog> f162795e;

        /* renamed from: f */
        public WeakReference<ImageFolderMgrView> f162796f;

        /* renamed from: g */
        public List<Long> f162797g;

        /* renamed from: h */
        public boolean f162798h;

        /* renamed from: i */
        public int f162799i;

        /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$c0$a */
        public class C56800a implements C93964k.C93967c {
            public C56800a() {
            }

            /* renamed from: B3 */
            public void mo80207B3(LinkedList<GalleryItem$MediaItem> linkedList, long j, boolean z) {
                Log.m105925i("MicroMsg.AlbumPreviewUI", "RetrieveFavMediaTask onQueryMediaFinished cancelUINotify: %s.", Boolean.valueOf(C56799c0.this.f162798h));
                if (!C56799c0.this.f162798h) {
                    LinkedList<GalleryItem$MediaItem> linkedList2 = new LinkedList<>();
                    if (linkedList != null) {
                        linkedList2.addAll(linkedList);
                    }
                    Iterator<GalleryItem$MediaItem> it = linkedList2.iterator();
                    while (it.hasNext()) {
                        GalleryItem$MediaItem next = it.next();
                        Log.m105919d("MicroMsg.AlbumPreviewUI", "type: %s path: %s", next.f162755o, next.f162747d);
                    }
                    C56796a0 a0Var = new C56796a0((C56804j) null);
                    C56799c0 c0Var = C56799c0.this;
                    a0Var.f162784d = c0Var.f162794d;
                    a0Var.f162785e = c0Var.f162795e;
                    a0Var.f162788h = linkedList2;
                    a0Var.f162790j = c0Var.f162796f;
                    C93958f.m118753m().mo128895c(a0Var);
                }
            }
        }

        public C56799c0(C56804j jVar) {
        }

        public void run() {
            String str;
            List<Long> list;
            C93974o oVar;
            int i;
            int i2;
            int i3;
            int i4;
            Uri uri = C93974o.f271204e;
            C93974o oVar2 = C93974o.C93984j.f271235a;
            C56800a aVar = new C56800a();
            List<Long> list2 = this.f162797g;
            int i5 = this.f162799i;
            char c = 0;
            oVar2.f271207c = false;
            LinkedList linkedList = new LinkedList();
            boolean isNullOrNil = Util.isNullOrNil((List) list2);
            String str2 = "MicroMsg.SmartGalleryQueryUtil";
            int i6 = 1;
            ArrayList arrayList = list2;
            if (isNullOrNil) {
                Log.m105924i(str2, "query fav media id list now.");
                Log.m105925i(str2, "query fav media id, type: %d.", Integer.valueOf(i5));
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (i5 == 1) {
                    arrayList3.add(2);
                } else if (i5 == 2) {
                    arrayList3.add(4);
                } else if (i5 != 3) {
                    arrayList3.add(2);
                } else {
                    arrayList3.add(21);
                }
                ArrayList<Long> Lo = ((C102615e) ((C38805i) C86312j.m106911c(C38805i.class)).mo61575Y3()).mo142274Lo((List<String>) null, (List<String>) null, arrayList3);
                if (!Util.isNullOrNil((List) Lo)) {
                    Log.m105924i(str2, "fav list contains img or video.");
                    arrayList2.addAll(Lo);
                }
                boolean isNullOrNil2 = Util.isNullOrNil((List) arrayList2);
                arrayList = arrayList2;
                if (isNullOrNil2) {
                    Log.m105924i(str2, "fav list do not contain img or video.");
                    aVar.mo80207B3(linkedList, -1, true);
                    return;
                }
            }
            int size = arrayList.size();
            Log.m105925i(str2, "fav count: %d.", Integer.valueOf(size));
            int min = Math.min(size, 100);
            int i7 = min + 0;
            int i8 = 0;
            boolean z = true;
            List<Long> list3 = arrayList;
            while (!oVar2.f271207c) {
                Object[] objArr = new Object[i6];
                objArr[c] = Integer.valueOf(min);
                Log.m105925i(str2, "get fav, count: %d.", objArr);
                List<Long> subList = list3.subList(i8, i7);
                Class cls = C102712e.class;
                ArrayList arrayList4 = new ArrayList();
                if (Util.isNullOrNil((List) subList)) {
                    Log.m105924i(str2, "getFavMediaItemByIds, ids is invalid.");
                    oVar = oVar2;
                    list = list3;
                    i = i7;
                    str = str2;
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    int i9 = 0;
                    List<Long> list4 = list3;
                    while (true) {
                        oVar = oVar2;
                        list = list4;
                        int min2 = Math.min(i9 + 20, subList.size());
                        str = str2;
                        ArrayList<? extends C102666r2> x802 = ((C38804g) C86312j.m106911c(C38804g.class)).x80(subList.subList(i9, min2), false);
                        if (x802 != null && x802.size() > 0) {
                            arrayList5.addAll(x802);
                        }
                        if (min2 >= subList.size()) {
                            break;
                        }
                        List<Long> list5 = subList;
                        int i15 = i7;
                        list4 = list;
                        str2 = str;
                        subList = list5;
                        i9 = min2;
                        oVar2 = oVar;
                    }
                    Iterator it = arrayList5.iterator();
                    while (it.hasNext()) {
                        C102666r2 r2Var = (C102666r2) it.next();
                        if (r2Var.field_favProto.f298618f.size() != 0) {
                            int size2 = r2Var.field_favProto.f298618f.size() - 1;
                            while (size2 >= 0) {
                                C101834rc0 rc02 = r2Var.field_favProto.f298618f.get(size2);
                                if (C86013q1.m106450k(((C102712e) C86312j.m106911c(cls)).mo142091L2(rc02))) {
                                    if (i5 != 1) {
                                        int i16 = 2;
                                        if (i5 == 2) {
                                            i4 = i7;
                                            int i17 = rc02.f299258I;
                                            if (i17 == 4 || i17 == 15) {
                                                GalleryItem$MediaItem c2 = GalleryItem$MediaItem.m65488c(2, -1, ((C102712e) C86312j.m106911c(cls)).mo142091L2(rc02), "", "video/fav");
                                                c2.f162752i = r2Var.field_updateTime;
                                                arrayList4.add(c2);
                                            }
                                        } else if (i5 == 3) {
                                            int i18 = rc02.f299258I;
                                            if (i18 != 2) {
                                                if (i18 == 4 || i18 == 15) {
                                                    i16 = 2;
                                                }
                                            }
                                            if (i18 == i16) {
                                                GalleryItem$MediaItem c3 = GalleryItem$MediaItem.m65488c(1, -1, ((C102712e) C86312j.m106911c(cls)).mo142091L2(rc02), "", "image/fav");
                                                i4 = i7;
                                                c3.f162752i = r2Var.field_updateTime;
                                                arrayList4.add(c3);
                                            } else {
                                                i4 = i7;
                                                GalleryItem$MediaItem c4 = GalleryItem$MediaItem.m65488c(2, -1, ((C102712e) C86312j.m106911c(cls)).mo142091L2(rc02), "", "video/fav");
                                                c4.f162752i = r2Var.field_updateTime;
                                                arrayList4.add(c4);
                                            }
                                        }
                                    } else {
                                        i4 = i7;
                                        if (rc02.f299258I == 2) {
                                            GalleryItem$MediaItem c5 = GalleryItem$MediaItem.m65488c(1, -1, ((C102712e) C86312j.m106911c(cls)).mo142091L2(rc02), "", "image/fav");
                                            i3 = i4;
                                            c5.f162752i = r2Var.field_updateTime;
                                            arrayList4.add(c5);
                                            size2--;
                                            i7 = i3;
                                        }
                                    }
                                    i3 = i4;
                                    size2--;
                                    i7 = i3;
                                }
                                i4 = i7;
                                i3 = i4;
                                size2--;
                                i7 = i3;
                            }
                        }
                    }
                    i = i7;
                }
                linkedList.addAll(arrayList4);
                aVar.mo80207B3(linkedList, -1, z);
                if (z) {
                    z = false;
                }
                int size3 = size - linkedList.size();
                if (size3 > 0) {
                    int min3 = Math.min(size3, 100);
                    i2 = i + min3;
                    min = min3;
                    i8 = i;
                } else {
                    i2 = i;
                }
                if (i2 < size) {
                    i7 = i2;
                    oVar2 = oVar;
                    list3 = list;
                    str2 = str;
                    c = 0;
                    i6 = 1;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$d */
    public class C56801d extends RecyclerView.C0130p {

        /* renamed from: d */
        public Runnable f162801d = new C56802a();

        /* renamed from: e */
        public final /* synthetic */ GridLayoutManager f162802e;

        /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$d$a */
        public class C56802a implements Runnable {

            /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$d$a$a */
            public class C56803a implements Runnable {
                public C56803a() {
                }

                public void run() {
                    AlbumPreviewUI.this.f271294j.setVisibility(4);
                }
            }

            public C56802a() {
            }

            public void run() {
                if (AlbumPreviewUI.this.f271294j.getVisibility() == 0) {
                    AlbumPreviewUI.this.f271294j.animate().alpha(0.0f).setDuration(300).withEndAction(new C56803a()).start();
                }
            }
        }

        public C56801d(GridLayoutManager gridLayoutManager) {
            this.f162802e = gridLayoutManager;
        }

        /* renamed from: a */
        public final String mo80208a() {
            String O4 = AlbumPreviewUI.this.f271290h.mo129042O4(this.f162802e.mo16957C());
            if (Util.isNullOrNil(O4) || !O4.equals("album_business_bubble_media_by_coordinate")) {
                return O4;
            }
            return AlbumPreviewUI.this.f271320x0 + "附近的照片和视频";
        }

        /* renamed from: b */
        public final void mo80209b(boolean z) {
            if (z) {
                AlbumPreviewUI.this.f271294j.removeCallbacks(this.f162801d);
                if (AlbumPreviewUI.this.f271294j.getVisibility() != 0) {
                    AlbumPreviewUI.this.f271294j.setText(mo80208a());
                    AlbumPreviewUI.this.f271294j.setVisibility(0);
                    AlbumPreviewUI.this.f271294j.setAlpha(0.0f);
                    AlbumPreviewUI.this.f271294j.animate().alpha(1.0f).setDuration(300).start();
                    return;
                }
                return;
            }
            AlbumPreviewUI.this.f271294j.removeCallbacks(this.f162801d);
            AlbumPreviewUI.this.f271294j.postDelayed(this.f162801d, 256);
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            int i2 = i;
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$13", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            Log.m105919d("MicroMsg.AlbumPreviewUI", "scroll state[%d]", Integer.valueOf(i));
            if (1 == i2) {
                mo80209b(true);
                AlbumPreviewUI.this.f271299n.setVisibility(8);
                C93958f.m118747g().mo128874b();
            } else if (i2 == 0) {
                mo80209b(false);
                AlbumPreviewUI.this.f271313t1 = this.f162802e.mo16957C();
                AlbumPreviewUI.this.f271315u1 = this.f162802e.mo16959E();
                Log.m105919d("MicroMsg.AlbumPreviewUI", "cancelTask logic, firstVisibleItem: %s lastVisibleItem: %s.", Integer.valueOf(AlbumPreviewUI.this.f271313t1), Integer.valueOf(AlbumPreviewUI.this.f271315u1));
                C98554s sVar = C98554s.f289007d;
                C98554s sVar2 = C98554s.f289007d;
                C60218q.C60219a aVar = C60218q.C60219a.IDLE;
                AlbumPreviewUI albumPreviewUI = AlbumPreviewUI.this;
                sVar2.mo137928b(aVar, albumPreviewUI.f271313t1, albumPreviewUI.f271315u1, albumPreviewUI.f271290h.mo129053u5());
            } else if (2 == i2) {
                C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcAlbumScrollEnable(), AlbumPreviewUI.this.f271273X);
                AlbumPreviewUI.this.f271273X = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcAlbumScrollEnable(), C40318k.m43492a().getHcAlbumScrollDelay(), C40318k.m43492a().getHcAlbumScrollCPU(), C40318k.m43492a().getHcAlbumScrollIO(), C40318k.m43492a().getHcAlbumScrollThr() ? Process.myTid() : 0, C40318k.m43492a().getHcAlbumScrollTimeout(), 702, C40318k.m43492a().getHcAlbumScrollAction(), "MicroMsg.AlbumPreviewUI");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$13", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$13", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            AlbumPreviewUI.this.f271294j.setText(mo80208a());
            int C = this.f162802e.mo16957C();
            int E = this.f162802e.mo16959E();
            Log.m105919d("MicroMsg.AlbumPreviewUI", "pennqin, onScrolled, %s %s %s %s.", Integer.valueOf(C), Integer.valueOf(E), Integer.valueOf(AlbumPreviewUI.this.f271313t1), Integer.valueOf(AlbumPreviewUI.this.f271315u1));
            AlbumPreviewUI albumPreviewUI = AlbumPreviewUI.this;
            if (!(albumPreviewUI.f271313t1 == C && albumPreviewUI.f271315u1 == E)) {
                albumPreviewUI.f271313t1 = C;
                albumPreviewUI.f271315u1 = E;
                ArrayList arrayList2 = new ArrayList();
                int i3 = AlbumPreviewUI.this.f271313t1;
                while (true) {
                    AlbumPreviewUI albumPreviewUI2 = AlbumPreviewUI.this;
                    if (i3 > albumPreviewUI2.f271315u1) {
                        break;
                    }
                    GalleryItem$MediaItem g5 = albumPreviewUI2.f271290h.mo129050g5(i3);
                    if (g5 != null) {
                        arrayList2.add(C101316l.m132905d(g5.mo80159e(), (C93974o.C93980f) null, -1));
                    }
                    i3++;
                }
                Log.m105919d("MicroMsg.AlbumPreviewUI", "cancelTask, legalPaths size: %s.", Integer.valueOf(arrayList2.size()));
                C93958f.m118747g().mo128875c(arrayList2);
                if (i2 != 0) {
                    if (i2 < 0) {
                        AlbumPreviewUI.this.f271311s1 = C60218q.C60219a.UP;
                    } else {
                        AlbumPreviewUI.this.f271311s1 = C60218q.C60219a.DOWN;
                    }
                    Log.m105919d("MicroMsg.AlbumPreviewUI", "onScrolled, dy: %s state: %s.", Integer.valueOf(i2), AlbumPreviewUI.this.f271311s1);
                    C98554s sVar = C98554s.f289007d;
                    C98554s sVar2 = C98554s.f289007d;
                    AlbumPreviewUI albumPreviewUI3 = AlbumPreviewUI.this;
                    sVar2.mo137928b(albumPreviewUI3.f271311s1, albumPreviewUI3.f271313t1, albumPreviewUI3.f271315u1, albumPreviewUI3.f271290h.mo129053u5());
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$13", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$j */
    public class C56804j implements C98253a {
        public C56804j() {
        }

        /* renamed from: a */
        public ArrayList<GalleryItem$MediaItem> mo80212a() {
            C94049a aVar = AlbumPreviewUI.this.f271290h;
            if (aVar == null) {
                return null;
            }
            return aVar.f271542g;
        }

        /* renamed from: b */
        public boolean mo80213b() {
            return true;
        }

        /* renamed from: c */
        public void mo80214c(int i) {
            AlbumPreviewUI.this.mo128957d8(i);
        }

        public AppCompatActivity getActivity() {
            return AlbumPreviewUI.this;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$k */
    public class C56805k implements DialogInterface.OnClickListener {
        public C56805k() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(AlbumPreviewUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$n */
    public class C56806n implements View.OnClickListener {
        public C56806n() {
        }

        public void onClick(View view) {
            Class cls = C103918d.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!C90111a.m112742f(AlbumPreviewUI.this, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                ((C103918d) C86312j.m106911c(cls)).mo125783j7(AlbumPreviewUI.this.getContext());
            } else {
                AlbumPreviewUI albumPreviewUI = AlbumPreviewUI.this;
                AlbumPreviewUI albumPreviewUI2 = AlbumPreviewUI.this;
                albumPreviewUI.f271281c1 = ((C103918d) C86312j.m106911c(cls)).Uu0(albumPreviewUI2, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 145, albumPreviewUI2.getString(C0966R.string.hif), AlbumPreviewUI.this.getString(C0966R.string.f5g));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$o */
    public class C56807o implements View.OnClickListener {
        public C56807o() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$28", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            AlbumPreviewUI albumPreviewUI = AlbumPreviewUI.this;
            int i = AlbumPreviewUI.f271243x1;
            albumPreviewUI.mo128951X7();
            AlbumPreviewUI.this.getClass();
            C93958f.m118750j().mo128908e();
            AlbumPreviewUI.this.mo128950W7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$28", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$q */
    public class C56808q implements MenuItem.OnMenuItemClickListener {
        public C56808q() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            Log.m105919d("MicroMsg.AlbumPreviewUI", "mId: %d.", Integer.valueOf(itemId));
            if (1 != itemId) {
                return AlbumPreviewUI.this.mo77422V7();
            }
            Log.m105924i("MicroMsg.AlbumPreviewUI", "go smart gallery.");
            C97754e.C97756b.f286807a.f286784c = 1;
            Uri uri = C93974o.f271204e;
            C93974o oVar = C93974o.C93984j.f271235a;
            ArrayList<GalleryItem$MediaItem> arrayList = AlbumPreviewUI.this.f271290h.f271542g;
            oVar.getClass();
            Log.m105924i("MicroMsg.SmartGalleryQueryUtil", "clearSelectedMediaPath");
            ((ArrayList) oVar.f271208d).clear();
            ((ArrayList) oVar.f271208d).addAll(arrayList);
            Intent intent = new Intent(AlbumPreviewUI.this, SmartGalleryUI.class);
            intent.putExtra("select_type_tag", 2);
            intent.putExtras(AlbumPreviewUI.this.getIntent());
            intent.removeExtra("album_query_session_id");
            intent.putExtra("send_raw_img", AlbumPreviewUI.this.f271249F);
            AlbumPreviewUI.this.startActivityForResult(intent, 4382);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$r */
    public class C56809r implements View.OnClickListener {
        public C56809r() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C98567o0) C86312j.m106911c(C98567o0.class)).mo137587DW(AlbumPreviewUI.this);
            C60960c.f173618a.mo85926j("SnsPublishProcess", "ifMiaojian", 1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$s */
    public class C56810s implements View.OnClickListener {
        public C56810s() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            AlbumPreviewUI.this.f271314u.performClick();
            AlbumPreviewUI albumPreviewUI = AlbumPreviewUI.this;
            if (albumPreviewUI.f271249F) {
                albumPreviewUI.f271310s.setContentDescription(albumPreviewUI.getResources().getString(C0966R.string.f4o));
            } else {
                albumPreviewUI.f271310s.setContentDescription(albumPreviewUI.getResources().getString(C0966R.string.f4q));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$u */
    public class C56811u implements View.OnClickListener {
        public C56811u(AlbumPreviewUI albumPreviewUI) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$v */
    public class C56812v implements View.OnClickListener {
        public C56812v() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            AlbumPreviewUI.this.f271321y.performClick();
            C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$w */
    public class C56813w implements View.OnClickListener {
        public C56813w() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            AlbumPreviewUI albumPreviewUI = AlbumPreviewUI.this;
            boolean z = !albumPreviewUI.f271276Y0;
            albumPreviewUI.f271276Y0 = z;
            if (z) {
                albumPreviewUI.f271321y.setImageResource(C0966R.raw.radio_on);
            } else {
                albumPreviewUI.f271321y.setImageResource(C0966R.raw.radio_off);
            }
            AlbumPreviewUI albumPreviewUI2 = AlbumPreviewUI.this;
            albumPreviewUI2.f271278Z0 = albumPreviewUI2.f271276Y0;
            AppCompatActivity context = albumPreviewUI2.getContext();
            AlbumPreviewUI albumPreviewUI3 = AlbumPreviewUI.this;
            int i = albumPreviewUI3.f271272W0;
            int g0 = albumPreviewUI3.f271290h.mo129049g0();
            AlbumPreviewUI albumPreviewUI4 = AlbumPreviewUI.this;
            int i2 = albumPreviewUI4.f271257N;
            String str = albumPreviewUI4.f271275Y;
            boolean z2 = albumPreviewUI4.f271276Y0;
            C94049a aVar = albumPreviewUI4.f271290h;
            albumPreviewUI2.updateOptionMenuText(0, C101316l.m132909h(context, i, g0, i2, str, z2, aVar == null ? null : aVar.f271542g));
            C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$i */
    public class C68993i implements Runnable {
        public C68993i(AlbumPreviewUI albumPreviewUI) {
        }

        public void run() {
            C68118i0 i0Var = (C68118i0) ((C98201k) C86312j.m106911c(C98201k.class)).mo137272AW();
            i0Var.getClass();
            ArrayList arrayList = new ArrayList();
            Class cls = C102975i.class;
            Iterator<C68118i0.C68123e> it = i0Var.f195778e.iterator();
            while (it.hasNext()) {
                C68118i0.C68123e next = it.next();
                next.getClass();
                if (!arrayList.contains((Object) null)) {
                    next.f195786c = false;
                    String TY = C92837k0.Bx0().mo127174TY((String) null, "", ".jpg", false);
                    String TY2 = C92837k0.Bx0().mo127174TY((String) null, "", ".jpg", false);
                    String wt = ((C102975i) C86312j.m106911c(cls)).mo141702wt(TY);
                    String TY3 = C92837k0.Bx0().mo127174TY((String) null, "th_", "", false);
                    if (!next.f195786c) {
                        C86013q1.m106447h(TY);
                        C86013q1.m106447h(wt);
                        if (!Util.isNullOrNil(TY2)) {
                            C86013q1.m106447h(TY2);
                        }
                        C86013q1.m106447h(TY3);
                        Log.m105925i("MicroMsg.SendImgSpeeder", "confirmFinalImgTask: delete %s, %s, %s", TY, wt, TY3);
                        it.remove();
                    } else {
                        throw null;
                    }
                } else if (!Util.isNullOrNil((String) null)) {
                    throw null;
                } else if (Util.isNullOrNil((String) null)) {
                    boolean a = C75592q0.m90771a((String) null, (String) null, true);
                    if (a && C92806b.m116987a((String) null)) {
                        Log.m105924i("MicroMsg.SendImgSpeeder", "getCompressType send no compress as bigImg");
                        a = true;
                    }
                    if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_image2_delete_unused_img_flag, 0) == 1) {
                        if (next.f195784a != a) {
                            next.f195786c = true;
                            String TY4 = C92837k0.Bx0().mo127174TY((String) null, "", ".jpg", false);
                            String wt4 = ((C102975i) C86312j.m106911c(cls)).mo141702wt(TY4);
                            String TY5 = C92837k0.Bx0().mo127174TY((String) null, "", ".jpg", false);
                            if (next.f195784a == 1) {
                                C86013q1.m106447h(TY4);
                                C86013q1.m106447h(TY5);
                                Log.m105925i("MicroMsg.SendImgSpeeder", "delete big&mid img %s %s", TY4, TY5);
                            } else {
                                C86013q1.m106447h(TY4);
                                C86013q1.m106447h(wt4);
                                Log.m105925i("MicroMsg.SendImgSpeeder", "delete big img %s %s", TY4, wt4);
                            }
                        }
                    }
                    next.f195784a = a ? 1 : 0;
                } else {
                    throw null;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                String str = (String) it4.next();
                Iterator<C68118i0.C68123e> it5 = i0Var.f195778e.iterator();
                if (it5.hasNext()) {
                    it5.next().getClass();
                    throw null;
                }
            }
            i0Var.f195778e.clear();
            i0Var.f195778e.addAll(arrayList2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$b */
    public class C93986b implements ImageFolderMgrView.C94003b {
        public C93986b() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$b0 */
    public static class C93987b0 implements Runnable {

        /* renamed from: d */
        public String f271325d;

        /* renamed from: e */
        public WeakReference<C94049a> f271326e;

        /* renamed from: f */
        public WeakReference<ProgressDialog> f271327f;

        /* renamed from: g */
        public WeakReference<RecyclerView> f271328g;

        /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$b0$a */
        public class C93988a {
            public C93988a() {
            }

            /* renamed from: a */
            public void mo128961a(List<C93974o.C93982h> list, boolean z) {
                C94049a aVar;
                WeakReference<C94049a> weakReference = C93987b0.this.f271326e;
                if (!(weakReference == null || (aVar = weakReference.get()) == null)) {
                    if (z || aVar.mo129053u5() > list.size()) {
                        C93987b0.m118825a(C93987b0.this, list);
                    } else {
                        C93987b0.m118825a(C93987b0.this, list.subList(aVar.mo129053u5(), list.size()));
                    }
                }
                LinkedList<GalleryItem$MediaItem> linkedList = new LinkedList<>();
                for (C93974o.C93982h next : list) {
                    if (next.f271232c.contains("image")) {
                        GalleryItem$MediaItem c = GalleryItem$MediaItem.m65488c(1, next.f271230a, next.f271231b, "", next.f271232c);
                        c.f162752i = next.f271233d;
                        linkedList.add(c);
                    } else if (next.f271232c.contains("video")) {
                        GalleryItem$MediaItem c2 = GalleryItem$MediaItem.m65488c(2, next.f271230a, next.f271231b, "", next.f271232c);
                        c2.f162752i = next.f271233d;
                        linkedList.add(c2);
                    }
                }
                C56796a0 a0Var = new C56796a0((C56804j) null);
                C93987b0 b0Var = C93987b0.this;
                a0Var.f162784d = b0Var.f271326e;
                a0Var.f162785e = b0Var.f271327f;
                a0Var.f162788h = linkedList;
                a0Var.f162787g = b0Var.f271328g;
                a0Var.f162791n = z;
                C93958f.m118753m().mo128895c(a0Var);
                Log.m105924i("QuerySmartGalleryAlbumMediaTask", "finish page query.");
            }
        }

        public C93987b0(String str, C94049a aVar, ProgressDialog progressDialog, RecyclerView recyclerView) {
            this.f271325d = str;
            this.f271326e = new WeakReference<>(aVar);
            this.f271327f = new WeakReference<>(progressDialog);
            this.f271328g = new WeakReference<>(recyclerView);
        }

        /* renamed from: a */
        public static void m118825a(C93987b0 b0Var, List list) {
            b0Var.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Log.m105919d("QuerySmartGalleryAlbumMediaTask", "filterNonExistMedia size: %s.", Integer.valueOf(list.size()));
            LinkedList linkedList = new LinkedList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C93974o.C93982h hVar = (C93974o.C93982h) it.next();
                if (!C86013q1.m106450k(hVar.f271231b)) {
                    Log.m105929w("QuerySmartGalleryAlbumMediaTask", "filter non exist media: %s.", hVar.f271231b);
                    linkedList.add(hVar);
                }
            }
            Iterator it4 = linkedList.iterator();
            while (it4.hasNext()) {
                list.remove((C93974o.C93982h) it4.next());
            }
            Log.m105919d("QuerySmartGalleryAlbumMediaTask", "filterNonExistMedia cost: %s.", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }

        public void run() {
            boolean z;
            if (!Util.isNullOrNil(this.f271325d)) {
                Log.m105924i("QuerySmartGalleryAlbumMediaTask", "start query.");
                Uri uri = C93974o.f271204e;
                C93974o oVar = C93974o.C93984j.f271235a;
                String str = this.f271325d;
                C93988a aVar = new C93988a();
                oVar.getClass();
                if (!((C103918d) C86312j.m106911c(C103918d.class)).Lb0(MMApplicationContext.getContext(), "android.permission.READ_EXTERNAL_STORAGE")) {
                    Log.m105924i("MicroMsg.SmartGalleryQueryUtil", "queryAlbum without READ_EXTERNAL_STORAGE.");
                    return;
                }
                Log.m105924i("MicroMsg.SmartGalleryQueryUtil", "has permiss.");
                oVar.f271206b = false;
                ArrayList arrayList = new ArrayList();
                Cursor query = oVar.f271205a.query(C93974o.f271204e.buildUpon().appendEncodedPath("albumInfo").build(), new String[]{"_id", "_data", "mime_type", "date_modified", "datetaken", "latitude", "longitude"}, "albumID".concat("=?"), new String[]{str}, (String) null);
                if (query != null) {
                    int columnIndex = query.getColumnIndex("_id");
                    int columnIndex2 = query.getColumnIndex("_data");
                    int columnIndex3 = query.getColumnIndex("mime_type");
                    int columnIndex4 = query.getColumnIndex("datetaken");
                    boolean z2 = true;
                    while (query.moveToNext()) {
                        if (!oVar.f271206b) {
                            C93974o.C93982h hVar = new C93974o.C93982h();
                            hVar.f271230a = Util.safeParseLong(query.getString(columnIndex));
                            hVar.f271231b = query.getString(columnIndex2);
                            hVar.f271232c = query.getString(columnIndex3);
                            hVar.f271233d = Util.safeParseLong(query.getString(columnIndex4));
                            int i = columnIndex;
                            Log.m105919d("MicroMsg.SmartGalleryQueryUtil", "mediaID:%d data:%s type:%s.", Long.valueOf(hVar.f271230a), hVar.f271231b, hVar.f271232c);
                            arrayList.add(hVar);
                            if (arrayList.size() % 100 == 0) {
                                aVar.mo128961a(arrayList, z2);
                                if (z2) {
                                    columnIndex = i;
                                    z2 = false;
                                }
                            }
                            columnIndex = i;
                        } else {
                            return;
                        }
                    }
                    query.close();
                    z = z2;
                } else {
                    z = true;
                }
                aVar.mo128961a(arrayList, z);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$c */
    public class C93989c implements ImageFolderMgrView.C94005d {
        public C93989c() {
        }

        /* renamed from: a */
        public void mo128962a(boolean z) {
            if (z) {
                AlbumPreviewUI albumPreviewUI = AlbumPreviewUI.this;
                if (albumPreviewUI.f271305p1) {
                    albumPreviewUI.setSmartGalleryEntryVisibility(false);
                    return;
                }
                return;
            }
            AlbumPreviewUI albumPreviewUI2 = AlbumPreviewUI.this;
            if (albumPreviewUI2.f271305p1 && !albumPreviewUI2.f271303p.getSelectedAlbumName().equalsIgnoreCase(AlbumPreviewUI.this.getString(C0966R.string.f57))) {
                AlbumPreviewUI.this.setSmartGalleryEntryVisibility(true);
            }
            AlbumPreviewUI albumPreviewUI3 = AlbumPreviewUI.this;
            if (albumPreviewUI3.f271296k1 == null) {
                return;
            }
            if (!Util.nullAs(albumPreviewUI3.f271246C, "").equals(AlbumPreviewUI.this.f271296k1.f271096d)) {
                AlbumPreviewUI albumPreviewUI4 = AlbumPreviewUI.this;
                albumPreviewUI4.mo128952Y7(albumPreviewUI4.f271296k1);
                return;
            }
            AlbumPreviewUI.this.playActionBarOperationAreaAnim();
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$e */
    public class C93990e implements C94057e.C94058a {
        public C93990e() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0123, code lost:
            r9 = r8.f271331d;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo128709a(int r9, int r10, int r11, int r12) {
            /*
                r8 = this;
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r0 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                com.tencent.mm.plugin.gallery.ui.a r0 = r0.f271290h
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r0 = r0.mo129050g5(r10)
                if (r0 != 0) goto L_0x000b
                return
            L_0x000b:
                r1 = 5
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
                r3 = 0
                r1[r3] = r2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
                r4 = 1
                r1[r4] = r2
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r2 = 2
                r1[r2] = r11
                java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
                r5 = 3
                r1[r5] = r11
                r11 = 4
                java.lang.String r6 = r0.f162747d
                r1[r11] = r6
                java.lang.String r11 = "MicroMsg.AlbumPreviewUI"
                java.lang.String r6 = "onSelectItemChanged selectedCount:%s position:%s selectPosition:%s type:%s path:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r6, r1)
                if (r12 != 0) goto L_0x0106
                int r12 = r0.getType()
                if (r12 != r4) goto L_0x00c4
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r12 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                boolean r12 = r12.mo79060H7(r0)
                if (r12 != 0) goto L_0x0050
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r9 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                com.tencent.mm.plugin.gallery.ui.a r9 = r9.f271290h
                r9.mo129043O5(r0)
                goto L_0x011b
            L_0x0050:
                ew1.e r12 = ew1.C97754e.C97756b.f286807a
                java.lang.String r1 = r0.f162747d
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r6 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                int r6 = r6.f271280b1
                r12.mo137083b(r1, r6, r10)
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r12 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                int r1 = r12.f271272W0
                if (r1 != r5) goto L_0x00b9
                boolean r1 = r12.f271249F
                if (r1 == 0) goto L_0x00b9
                java.lang.String r1 = r0.f162747d
                long r6 = com.tencent.p014mm.vfs.C86013q1.m106451l(r1)
                int r1 = (int) r6
                r6 = 26214400(0x1900000, float:5.2897246E-38)
                if (r6 >= r1) goto L_0x00b9
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r3] = r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                r2[r4] = r0
                java.lang.String r0 = "[checkRawImageItem] item:%s file size:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r11, r0, r2)
                boolean r11 = hd0.C98429r0.m127830u()
                if (r11 == 0) goto L_0x009b
                r11 = 2131830565(0x7f112725, float:1.929413E38)
                java.lang.Object[] r0 = new java.lang.Object[r4]
                r6 = 26214400(0x1900000, double:1.29516345E-316)
                java.lang.String r2 = qw1.C101316l.m132906e(r6)
                r0[r3] = r2
                java.lang.String r11 = r12.getString(r11, r0)
                r12.mo128955b8(r11)
                goto L_0x00a5
            L_0x009b:
                r11 = 2131830646(0x7f112776, float:1.9294295E38)
                java.lang.String r11 = r12.getString(r11)
                nj3.C76879j.m92729W(r12, r11)
            L_0x00a5:
                com.tencent.mm.autogen.mmdata.rpt.VideoAlbumErrorReportStruct r11 = new com.tencent.mm.autogen.mmdata.rpt.VideoAlbumErrorReportStruct
                r11.<init>()
                java.lang.String r12 = r12.f271265T
                r11.mo126631s(r12)
                r6 = 3
                r11.f266442e = r6
                long r0 = (long) r1
                r11.f266443f = r0
                r11.mo86054n()
            L_0x00b9:
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r11 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                r11.mo128958e8(r9)
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r9 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                r9.mo128948Q7(r10, r4)
                goto L_0x011b
            L_0x00c4:
                int r11 = r0.getType()
                if (r11 != r2) goto L_0x00f0
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r11 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                boolean r11 = r11.mo79061I7(r0)
                if (r11 != 0) goto L_0x00da
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r9 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                com.tencent.mm.plugin.gallery.ui.a r9 = r9.f271290h
                r9.mo129043O5(r0)
                goto L_0x011b
            L_0x00da:
                ew1.e r11 = ew1.C97754e.C97756b.f286807a
                java.lang.String r12 = r0.f162747d
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r0 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                int r0 = r0.f271280b1
                r11.mo137083b(r12, r0, r10)
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r11 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                r11.mo128958e8(r9)
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r9 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                r9.mo128948Q7(r10, r4)
                goto L_0x011b
            L_0x00f0:
                ew1.e r11 = ew1.C97754e.C97756b.f286807a
                java.lang.String r12 = r0.f162747d
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r0 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                int r0 = r0.f271280b1
                r11.mo137083b(r12, r0, r10)
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r11 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                r11.mo128958e8(r9)
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r9 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                r9.mo128948Q7(r10, r4)
                goto L_0x011b
            L_0x0106:
                ew1.e r11 = ew1.C97754e.C97756b.f286807a
                java.lang.String r12 = r0.f162747d
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r0 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                int r0 = r0.f271280b1
                r11.mo137083b(r12, r0, r10)
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r11 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                r11.mo128958e8(r9)
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r9 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                r9.mo128948Q7(r10, r3)
            L_0x011b:
                boolean r9 = hd0.C98429r0.m127830u()
                r10 = 8
                if (r9 == 0) goto L_0x0157
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r9 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                int r11 = r9.f271272W0
                if (r11 == r5) goto L_0x012d
                r12 = 16
                if (r11 != r12) goto L_0x0157
            L_0x012d:
                boolean r11 = r9.f271249F
                if (r11 == 0) goto L_0x0157
                java.lang.String r9 = r9.mo128944M7()
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r11 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                android.widget.TextView r11 = r11.f271312t
                boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r12 == 0) goto L_0x0140
                goto L_0x0141
            L_0x0140:
                r10 = 0
            L_0x0141:
                r11.setVisibility(r10)
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r10 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                android.widget.TextView r11 = r10.f271312t
                r12 = 2131830576(0x7f112730, float:1.9294153E38)
                java.lang.Object[] r0 = new java.lang.Object[r4]
                r0[r3] = r9
                java.lang.String r9 = r10.getString(r12, r0)
                r11.setText(r9)
                goto L_0x015e
            L_0x0157:
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r9 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                android.widget.TextView r9 = r9.f271312t
                r9.setVisibility(r10)
            L_0x015e:
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r9 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                com.tencent.mm.plugin.gallery.ui.a r9 = r9.f271290h
                java.util.ArrayList r9 = r9.mo129055w5()
                com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.C93990e.mo128709a(int, int, int, int):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$f */
    public class C93991f implements C93964k.C93966b {

        /* renamed from: a */
        public final /* synthetic */ double f271332a;

        public C93991f(double d) {
            this.f271332a = d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$g */
    public class C93992g implements MenuItem.OnMenuItemClickListener {
        public C93992g() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105924i("MicroMsg.AlbumPreviewUI", "backBtn");
            AlbumPreviewUI.this.mo79062R7();
            AlbumPreviewUI albumPreviewUI = AlbumPreviewUI.this;
            albumPreviewUI.mo128953Z7(-2, albumPreviewUI.getIntent().putExtra("send_raw_img", AlbumPreviewUI.this.f271249F));
            AlbumPreviewUI albumPreviewUI2 = AlbumPreviewUI.this;
            ImageFolderMgrView imageFolderMgrView = albumPreviewUI2.f271303p;
            if (imageFolderMgrView == null || !imageFolderMgrView.f271358i) {
                albumPreviewUI2.getClass();
                AlbumPreviewUI.this.finish();
                return true;
            }
            imageFolderMgrView.mo128973b();
            AlbumPreviewUI.this.playActionBarOperationAreaAnim();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$h */
    public class C93993h implements DrawedCallBackFrameLayout.C96994a {
        public C93993h() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$l */
    public class C93994l implements C94049a.C94055l {
        public C93994l() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$m */
    public class C93995m implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ GalleryItem$MediaItem f271337d;

        /* renamed from: e */
        public final /* synthetic */ int f271338e;

        public C93995m(GalleryItem$MediaItem galleryItem$MediaItem, int i) {
            this.f271337d = galleryItem$MediaItem;
            this.f271338e = i;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.AlbumPreviewUI", "ShowAlert");
            Intent intent = new Intent();
            intent.setData(Uri.parse("file://" + Uri.encode(this.f271337d.f162747d)));
            AlbumPreviewUI albumPreviewUI = AlbumPreviewUI.this;
            int i2 = AlbumPreviewUI.f271243x1;
            albumPreviewUI.mo128953Z7(-1, intent);
            C97754e.C97756b.f286807a.mo137083b(this.f271337d.f162747d, AlbumPreviewUI.this.f271280b1, this.f271338e);
            AlbumPreviewUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$p */
    public class C93996p implements Runnable {
        public C93996p() {
        }

        public void run() {
            Log.m105918d("MicroMsg.AlbumPreviewUI", "onCreate, post delay, dialog show.");
            if (C94000y.SKIP != AlbumPreviewUI.this.f271298m1) {
                AlbumPreviewUI.this.f271292i.show();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$t */
    public class C93997t implements View.OnClickListener {
        public C93997t() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:62:0x01af, code lost:
            r0 = r6.f271341d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r17) {
            /*
                r16 = this;
                r6 = r16
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r17
                r0.add(r1)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$6"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                r4 = r16
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r0 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                boolean r1 = r0.f271249F
                r2 = 1
                r1 = r1 ^ r2
                r0.f271249F = r1
                boolean r0 = hd0.C98429r0.m127830u()
                r1 = 3
                if (r0 == 0) goto L_0x003f
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r0 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                int r3 = r0.f271272W0
                if (r3 != r1) goto L_0x003f
                com.tencent.mm.plugin.gallery.ui.a r3 = r0.f271290h
                boolean r0 = r0.f271249F
                r3.f271548p = r0
                r3.notifyDataSetChanged()
            L_0x003f:
                boolean r0 = hd0.C98429r0.m127830u()
                r3 = 26214400(0x1900000, double:1.29516345E-316)
                r5 = 2
                r7 = 2131830565(0x7f112725, float:1.929413E38)
                r8 = 0
                if (r0 == 0) goto L_0x00c4
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r0 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                com.tencent.mm.plugin.gallery.ui.a r9 = r0.f271290h
                if (r9 != 0) goto L_0x0055
                goto L_0x0175
            L_0x0055:
                boolean r9 = hd0.C98429r0.m127830u()
                if (r9 == 0) goto L_0x0175
                boolean r9 = r0.f271249F
                if (r9 == 0) goto L_0x0175
                int r9 = r0.f271272W0
                if (r9 != r1) goto L_0x0175
                com.tencent.mm.plugin.gallery.ui.a r9 = r0.f271290h
                int r9 = r9.mo129049g0()
                r0.mo128958e8(r9)
                com.tencent.mm.plugin.gallery.ui.a r9 = r0.f271290h
                java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r9 = r9.f271542g
                java.util.Iterator r9 = r9.iterator()
            L_0x0074:
                boolean r10 = r9.hasNext()
                if (r10 == 0) goto L_0x0175
                java.lang.Object r10 = r9.next()
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r10 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r10
                if (r10 != 0) goto L_0x0083
                goto L_0x0074
            L_0x0083:
                java.lang.String r11 = r10.f162747d
                long r11 = com.tencent.p014mm.vfs.C86013q1.m106451l(r11)
                int r13 = r10.getType()
                if (r13 != r5) goto L_0x00a9
                long r13 = r0.f271271W
                int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r15 <= 0) goto L_0x00a9
                r3 = 2131830566(0x7f112726, float:1.9294133E38)
                java.lang.Object[] r4 = new java.lang.Object[r2]
                java.lang.String r5 = qw1.C101316l.m132906e(r13)
                r4[r8] = r5
                java.lang.String r3 = r0.getString(r3, r4)
                r0.mo128955b8(r3)
                goto L_0x0175
            L_0x00a9:
                int r10 = r10.getType()
                if (r10 != r2) goto L_0x0074
                int r10 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
                if (r10 <= 0) goto L_0x0074
                java.lang.Object[] r5 = new java.lang.Object[r2]
                java.lang.String r3 = qw1.C101316l.m132906e(r3)
                r5[r8] = r3
                java.lang.String r3 = r0.getString(r7, r5)
                r0.mo128955b8(r3)
                goto L_0x0175
            L_0x00c4:
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r0 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                boolean r9 = r0.f271249F
                if (r9 == 0) goto L_0x0175
                com.tencent.mm.plugin.gallery.ui.a r9 = r0.f271290h
                java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r9 = r9.f271542g
                java.util.Iterator r9 = r9.iterator()
                r10 = 0
                r11 = 0
            L_0x00d4:
                boolean r12 = r9.hasNext()
                if (r12 == 0) goto L_0x0120
                java.lang.Object r12 = r9.next()
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r12 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r12
                if (r12 == 0) goto L_0x011a
                int r13 = r12.getType()
                if (r13 != r2) goto L_0x011a
                java.lang.String r13 = r12.f162747d
                long r13 = com.tencent.p014mm.vfs.C86013q1.m106451l(r13)
                int r15 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
                if (r15 >= 0) goto L_0x0118
                java.lang.Object[] r15 = new java.lang.Object[r5]
                r15[r8] = r12
                java.lang.Long r12 = java.lang.Long.valueOf(r13)
                r15[r2] = r12
                java.lang.String r12 = "MicroMsg.AlbumPreviewUI"
                java.lang.String r5 = "[onClick] item:%s file size:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r5, r15)
                int r10 = r10 + 1
                com.tencent.mm.autogen.mmdata.rpt.VideoAlbumErrorReportStruct r5 = new com.tencent.mm.autogen.mmdata.rpt.VideoAlbumErrorReportStruct
                r5.<init>()
                java.lang.String r12 = r0.f271265T
                r5.mo126631s(r12)
                r7 = 3
                r5.f266442e = r7
                r5.f266443f = r13
                r5.mo86054n()
            L_0x0118:
                int r11 = r11 + 1
            L_0x011a:
                r5 = 2
                r7 = 2131830565(0x7f112725, float:1.929413E38)
                r8 = 0
                goto L_0x00d4
            L_0x0120:
                if (r10 <= 0) goto L_0x0175
                if (r11 != r10) goto L_0x014d
                boolean r5 = hd0.C98429r0.m127830u()
                if (r5 == 0) goto L_0x0142
                int r5 = r0.f271272W0
                if (r5 != r1) goto L_0x0142
                java.lang.Object[] r5 = new java.lang.Object[r2]
                java.lang.String r3 = qw1.C101316l.m132906e(r3)
                r4 = 0
                r5[r4] = r3
                r3 = 2131830565(0x7f112725, float:1.929413E38)
                java.lang.String r3 = r0.getString(r3, r5)
                r0.mo128955b8(r3)
                goto L_0x0175
            L_0x0142:
                r3 = 2131830646(0x7f112776, float:1.9294295E38)
                java.lang.String r3 = r0.getString(r3)
                nj3.C76879j.m92729W(r0, r3)
                goto L_0x0175
            L_0x014d:
                boolean r5 = hd0.C98429r0.m127830u()
                if (r5 == 0) goto L_0x016b
                int r5 = r0.f271272W0
                if (r5 != r1) goto L_0x016b
                java.lang.Object[] r5 = new java.lang.Object[r2]
                java.lang.String r3 = qw1.C101316l.m132906e(r3)
                r4 = 0
                r5[r4] = r3
                r3 = 2131830565(0x7f112725, float:1.929413E38)
                java.lang.String r3 = r0.getString(r3, r5)
                r0.mo128955b8(r3)
                goto L_0x0175
            L_0x016b:
                r3 = 2131830638(0x7f11276e, float:1.929428E38)
                java.lang.String r3 = r0.getString(r3)
                nj3.C76879j.m92729W(r0, r3)
            L_0x0175:
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r0 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                android.widget.TextView r3 = r0.f271310s
                androidx.appcompat.app.AppCompatActivity r0 = r0.getContext()
                r4 = 2131830617(0x7f112759, float:1.9294236E38)
                java.lang.String r0 = r0.getString(r4)
                r3.setText(r0)
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r0 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                boolean r3 = r0.f271249F
                r4 = 8
                if (r3 == 0) goto L_0x01ec
                android.widget.ImageButton r0 = r0.f271314u
                r3 = 2131756876(0x7f10074c, float:1.9144672E38)
                r0.setImageResource(r3)
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r0 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                android.widget.ImageButton r3 = r0.f271314u
                android.content.res.Resources r0 = r0.getResources()
                r5 = 2131830560(0x7f112720, float:1.929412E38)
                java.lang.String r0 = r0.getString(r5)
                r3.setContentDescription(r0)
                boolean r0 = hd0.C98429r0.m127830u()
                if (r0 == 0) goto L_0x01e4
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r0 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                int r3 = r0.f271272W0
                if (r3 == r1) goto L_0x01b9
                r1 = 16
                if (r3 != r1) goto L_0x01e4
            L_0x01b9:
                boolean r1 = r0.f271249F
                if (r1 == 0) goto L_0x01e4
                java.lang.String r0 = r0.mo128944M7()
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r1 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                android.widget.TextView r1 = r1.f271312t
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r3 == 0) goto L_0x01cc
                goto L_0x01cd
            L_0x01cc:
                r4 = 0
            L_0x01cd:
                r1.setVisibility(r4)
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r1 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                android.widget.TextView r3 = r1.f271312t
                r4 = 2131830576(0x7f112730, float:1.9294153E38)
                java.lang.Object[] r5 = new java.lang.Object[r2]
                r7 = 0
                r5[r7] = r0
                java.lang.String r0 = r1.getString(r4, r5)
                r3.setText(r0)
                goto L_0x021e
            L_0x01e4:
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r0 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                android.widget.TextView r0 = r0.f271312t
                r0.setVisibility(r4)
                goto L_0x021e
            L_0x01ec:
                android.widget.ImageButton r0 = r0.f271314u
                r1 = 2131756874(0x7f10074a, float:1.9144668E38)
                r0.setImageResource(r1)
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r0 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                android.widget.ImageButton r1 = r0.f271314u
                android.content.res.Resources r0 = r0.getResources()
                r3 = 2131830562(0x7f112722, float:1.9294125E38)
                java.lang.String r0 = r0.getString(r3)
                r1.setContentDescription(r0)
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r0 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                android.widget.TextView r0 = r0.f271312t
                r0.setVisibility(r4)
                boolean r0 = hd0.C98429r0.m127830u()
                if (r0 == 0) goto L_0x021e
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r0 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                com.tencent.mm.plugin.gallery.ui.a r1 = r0.f271290h
                int r1 = r1.mo129049g0()
                r0.mo128958e8(r1)
            L_0x021e:
                boolean r0 = hd0.C98429r0.m127830u()
                if (r0 != 0) goto L_0x0238
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r0 = com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.this
                com.tencent.mm.plugin.gallery.ui.a r1 = r0.f271290h
                java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r1 = r1.f271542g
                int r1 = r1.size()
                if (r1 <= 0) goto L_0x0234
                r0.enableOptionMenu(r2)
                goto L_0x0238
            L_0x0234:
                r1 = 0
                r0.enableOptionMenu(r1)
            L_0x0238:
                java.lang.String r0 = "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$6"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r6, r0, r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.C93997t.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$x */
    public static class C93998x implements Runnable {

        /* renamed from: d */
        public WeakReference<AlbumPreviewUI> f271342d;

        /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$x$a */
        public class C93999a implements Runnable {
            public C93999a() {
            }

            public void run() {
                AlbumPreviewUI albumPreviewUI;
                WeakReference<AlbumPreviewUI> weakReference = C93998x.this.f271342d;
                if (weakReference != null && (albumPreviewUI = weakReference.get()) != null) {
                    albumPreviewUI.setSmartGalleryEntryVisibility(true);
                    albumPreviewUI.f271305p1 = true;
                }
            }
        }

        public C93998x(AlbumPreviewUI albumPreviewUI) {
            this.f271342d = new WeakReference<>(albumPreviewUI);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x00c0  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00c4  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00e9  */
        /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r14 = this;
                long r0 = java.lang.System.currentTimeMillis()
                android.net.Uri r2 = com.tencent.p014mm.plugin.gallery.model.C93974o.f271204e
                com.tencent.mm.plugin.gallery.model.o r2 = com.tencent.p014mm.plugin.gallery.model.C93974o.C93984j.f271235a
                java.lang.ref.WeakReference<com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI> r3 = r14.f271342d
                java.lang.Object r3 = r3.get()
                android.content.Context r3 = (android.content.Context) r3
                r2.getClass()
                java.lang.String r4 = "isSmartGalleryAvailable"
                java.lang.Class<aw.d> r5 = p447aw.C103918d.class
                di3.d r5 = di3.C86312j.m106911c(r5)
                aw.d r5 = (p447aw.C103918d) r5
                java.lang.String r6 = "android.permission.READ_EXTERNAL_STORAGE"
                boolean r3 = r5.Lb0(r3, r6)
                java.lang.String r5 = "MicroMsg.SmartGalleryQueryUtil"
                r6 = 0
                r7 = 1
                if (r3 != 0) goto L_0x0031
                java.lang.String r2 = "isCategoryInfoValid without READ_EXTERNAL_STORAGE."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
                goto L_0x008c
            L_0x0031:
                java.lang.String r3 = "has permiss."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
                android.content.ContentResolver r3 = r2.f271205a     // Catch:{ Exception -> 0x0054 }
                android.net.Uri r8 = com.tencent.p014mm.plugin.gallery.model.C93974o.f271204e     // Catch:{ Exception -> 0x0054 }
                r9 = 0
                android.os.Bundle r3 = r3.call(r8, r4, r9, r9)     // Catch:{ Exception -> 0x0054 }
                if (r3 == 0) goto L_0x0055
                boolean r3 = r3.getBoolean(r4)     // Catch:{ Exception -> 0x0054 }
                java.lang.String r4 = "isCategoryInfoValid res: %s."
                java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0054 }
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x0054 }
                r8[r6] = r9     // Catch:{ Exception -> 0x0054 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r8)     // Catch:{ Exception -> 0x0054 }
                goto L_0x008d
            L_0x0054:
            L_0x0055:
                android.net.Uri r3 = com.tencent.p014mm.plugin.gallery.model.C93974o.f271204e
                android.net.Uri$Builder r3 = r3.buildUpon()
                java.lang.String r4 = "albums"
                android.net.Uri$Builder r3 = r3.appendEncodedPath(r4)
                android.net.Uri r9 = r3.build()
                android.content.ContentResolver r8 = r2.f271205a
                java.lang.String[] r10 = r2.mo128917b()
                r11 = 0
                r12 = 0
                r13 = 0
                android.database.Cursor r2 = r8.query(r9, r10, r11, r12, r13)
                if (r2 == 0) goto L_0x008c
                java.lang.String r3 = "cursor not null."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
                boolean r3 = r2.moveToNext()
                if (r3 == 0) goto L_0x0087
                java.lang.String r3 = "isCategoryInfoValid"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
                r3 = 1
                goto L_0x0088
            L_0x0087:
                r3 = 0
            L_0x0088:
                r2.close()
                goto L_0x008d
            L_0x008c:
                r3 = 0
            L_0x008d:
                long r4 = java.lang.System.currentTimeMillis()
                long r4 = r4 - r0
                r0 = 2
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
                r1[r6] = r2
                java.lang.Long r2 = java.lang.Long.valueOf(r4)
                r1[r7] = r2
                java.lang.String r2 = "MicroMsg.AlbumPreviewUI"
                java.lang.String r8 = "smart gallery isValid: %s, dur: %s."
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r8, r1)
                com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r2 = 19165(0x4add, float:2.6856E-41)
                java.lang.Object[] r8 = new java.lang.Object[r7]
                java.lang.Long r9 = java.lang.Long.valueOf(r4)
                r8[r6] = r9
                r1.mo160131h(r2, r8)
                r8 = 3000(0xbb8, double:1.482E-320)
                r2 = 1297(0x511, float:1.817E-42)
                int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r10 > 0) goto L_0x00c4
                r1.mo175911u(r2, r6)
                goto L_0x00e7
            L_0x00c4:
                r8 = 5000(0x1388, double:2.4703E-320)
                int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r6 > 0) goto L_0x00ce
                r1.mo175911u(r2, r7)
                goto L_0x00e7
            L_0x00ce:
                r8 = 10000(0x2710, double:4.9407E-320)
                int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r6 > 0) goto L_0x00d8
                r1.mo175911u(r2, r0)
                goto L_0x00e7
            L_0x00d8:
                r8 = 15000(0x3a98, double:7.411E-320)
                int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r0 > 0) goto L_0x00e3
                r0 = 3
                r1.mo175911u(r2, r0)
                goto L_0x00e7
            L_0x00e3:
                r0 = 4
                r1.mo175911u(r2, r0)
            L_0x00e7:
                if (r3 == 0) goto L_0x00f9
                ew1.e r0 = ew1.C97754e.C97756b.f286807a
                r0.f286783b = r7
                com.tencent.mm.plugin.gallery.model.i r0 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118753m()
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$x$a r1 = new com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$x$a
                r1.<init>()
                r0.mo128895c(r1)
            L_0x00f9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.C93998x.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$y */
    public enum C94000y {
        CREATE,
        SKIP
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$z */
    public static class C94001z implements Runnable {

        /* renamed from: d */
        public int f271347d;

        /* renamed from: e */
        public WeakReference<ImageFolderMgrView> f271348e;

        /* renamed from: f */
        public GalleryItem$MediaItem f271349f;

        public C94001z(C56804j jVar) {
        }

        public void run() {
            LinkedList<GalleryItem$AlbumItem> linkedList;
            WeakReference<ImageFolderMgrView> weakReference = this.f271348e;
            if (weakReference != null && weakReference.get() != null) {
                GalleryItem$MediaItem galleryItem$MediaItem = this.f271349f;
                int i = this.f271347d;
                C100571i iVar = this.f271348e.get().f271357h;
                if (Util.isNullOrNil(iVar.f294660f) || (linkedList = iVar.f294659e) == null || linkedList.size() == 0) {
                    Log.m105919d("MicroMsg.GalleryAdapter", "refresh album count: %s", iVar.f294660f + ", mAlbumFolder = " + iVar.f294659e);
                    return;
                }
                int i2 = 0;
                while (i2 < iVar.f294659e.size()) {
                    GalleryItem$AlbumItem galleryItem$AlbumItem = iVar.f294659e.get(i2);
                    if (galleryItem$AlbumItem == null || galleryItem$AlbumItem.f271102j || galleryItem$AlbumItem.f271103n || !iVar.f294660f.equals(galleryItem$AlbumItem.f271096d)) {
                        i2++;
                    } else {
                        if (i != galleryItem$AlbumItem.f271098f) {
                            galleryItem$AlbumItem.f271098f = i;
                            Log.m105919d("MicroMsg.GalleryAdapter", "refresh album count: %s", Integer.valueOf(i));
                        }
                        galleryItem$AlbumItem.f271104o = false;
                        if (galleryItem$MediaItem != null && galleryItem$AlbumItem.f271101i != null && !Util.isNullOrNil(galleryItem$MediaItem.mo80159e()) && !galleryItem$AlbumItem.mo128861e().equals(galleryItem$MediaItem.mo80159e())) {
                            galleryItem$AlbumItem.f271101i.f162750g = galleryItem$MediaItem.mo80159e();
                            Log.m105918d("MicroMsg.GalleryAdapter", "refresh album image.");
                        }
                        iVar.notifyDataSetChanged();
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: B3 */
    public void mo80207B3(LinkedList<GalleryItem$MediaItem> linkedList, long j, boolean z) {
        if (C98429r0.m127830u() && this.f271271W < 0) {
            this.f271271W = C101316l.m132908g();
        }
        if (j != this.f271293i1) {
            Log.m105929w("MicroMsg.AlbumPreviewUI", "%s %s, not my query, ignore.", Long.valueOf(j), Long.valueOf(this.f271293i1));
            Log.m105928w("MicroMsg.AlbumPreviewUI", "If you saw too mush this log, maybe user had too many photos. This can be optimized.");
            return;
        }
        Log.m105919d("MicroMsg.AlbumPreviewUI", "onQueryMediaFinished: %s %s %s.", Boolean.valueOf(z), Integer.valueOf(this.f271290h.mo129053u5()), Integer.valueOf(linkedList.size()));
        if (z || this.f271290h.mo129053u5() > linkedList.size()) {
            mo128943L7(linkedList);
        } else {
            mo128943L7(linkedList.subList(this.f271290h.mo129053u5(), linkedList.size()));
        }
        LinkedList<GalleryItem$MediaItem> linkedList2 = new LinkedList<>(linkedList);
        Object[] objArr = new Object[2];
        objArr[0] = Boolean.valueOf(this.f271290h == null);
        objArr[1] = Util.getStack().toString();
        Log.m105925i("MicroMsg.AlbumPreviewUI", "[onQueryMediaFinished] adapter is null?:%s %s", objArr);
        if (this.f271290h != null) {
            C56796a0 a0Var = new C56796a0((C56804j) null);
            a0Var.f162784d = new WeakReference<>(this.f271290h);
            a0Var.f162785e = new WeakReference<>(this.f271292i);
            a0Var.f162786f = new WeakReference<>(this.f271299n);
            a0Var.f162787g = new WeakReference<>(this.f271282d);
            a0Var.f162788h = linkedList2;
            a0Var.f162789i = this.f271320x0;
            a0Var.f162791n = z;
            if (C94000y.CREATE == this.f271298m1) {
                this.f271298m1 = C94000y.SKIP;
            }
            C93958f.m118753m().mo128895c(a0Var);
            C94001z zVar = new C94001z((C56804j) null);
            zVar.f271347d = linkedList2.size();
            if (linkedList2.size() >= 1) {
                zVar.f271349f = linkedList2.get(0);
            } else {
                zVar.f271349f = null;
                Log.m105918d("MicroMsg.AlbumPreviewUI", "onQueryMediaFinished, newMediaItems size = 0.");
            }
            zVar.f271348e = new WeakReference<>(this.f271303p);
            C93958f.m118753m().mo128895c(zVar);
        }
    }

    /* renamed from: H7 */
    public boolean mo79060H7(GalleryItem$MediaItem galleryItem$MediaItem) {
        int l;
        if (galleryItem$MediaItem == null) {
            Log.m105920e("MicroMsg.AlbumPreviewUI", "[checkSelectedVideo] item is null!");
            return false;
        } else if (this.f271272W0 != 3 || !this.f271249F || 26214400 >= (l = (int) C86013q1.m106451l(galleryItem$MediaItem.f162747d))) {
            return true;
        } else {
            Log.m105929w("MicroMsg.AlbumPreviewUI", "[checkRawImageItem] item:%s file size:%s", galleryItem$MediaItem, Integer.valueOf(l));
            if (C98429r0.m127830u()) {
                mo128955b8(getString(C0966R.string.lup, new Object[]{C101316l.m132906e(26214400)}));
            } else {
                C76879j.m92729W(this, getString(C0966R.string.f6g));
            }
            VideoAlbumErrorReportStruct videoAlbumErrorReportStruct = new VideoAlbumErrorReportStruct();
            videoAlbumErrorReportStruct.mo126631s(this.f271265T);
            videoAlbumErrorReportStruct.f266442e = 3;
            videoAlbumErrorReportStruct.f266443f = (long) l;
            videoAlbumErrorReportStruct.mo86054n();
            return false;
        }
    }

    /* renamed from: I7 */
    public boolean mo79061I7(GalleryItem$MediaItem galleryItem$MediaItem) {
        int b;
        GalleryItem$MediaItem galleryItem$MediaItem2 = galleryItem$MediaItem;
        if (galleryItem$MediaItem2 == null) {
            Log.m105920e("MicroMsg.AlbumPreviewUI", "[checkSelectedVideo] item is null!");
            return false;
        }
        int i = this.f271272W0;
        if (i != 3 || (b = C63339b.f179706a.mo88236b(i, galleryItem$MediaItem2)) == 0) {
            Uri n = C116299g2.m163858n(galleryItem$MediaItem2.f162747d);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
            if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                C76879j.m92729W(this, getString(C0966R.string.f6h));
                return false;
            }
            boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_sns_video_enable_hdr_lut, 1) == 1 && this.f271272W0 == 4 && !mo128947P7();
            if (!getIntent().getBooleanExtra("key_filter_hdr_video", false) || z || C63340i.f179709a.mo88238b(galleryItem$MediaItem2.f162747d)) {
                int i2 = this.f271272W0;
                if (i2 == 3) {
                    int videoMsToSec = galleryItem$MediaItem2 instanceof GalleryItem$VideoMediaItem ? Util.videoMsToSec((long) ((GalleryItem$VideoMediaItem) galleryItem$MediaItem2).f162766w) : C101316l.m132902a(galleryItem$MediaItem2.f162747d);
                    int a = C35511a.f94971a.mo60283a();
                    if (videoMsToSec > a) {
                        Log.m105924i("MicroMsg.AlbumPreviewUI", "select video duration too long");
                        C115669n.INSTANCE.idkeyStat(106, 50, 1, false);
                        if (C98429r0.m127830u()) {
                            Object[] objArr = new Object[1];
                            String[] strArr = C101316l.f296815a;
                            objArr[0] = a > 3600 ? String.format("%d小时", new Object[]{Integer.valueOf((a / 60) / 60)}) : a > 60 ? String.format("%d分钟", new Object[]{Integer.valueOf(a / 60)}) : a > 0 ? String.format("%d秒", new Object[]{Integer.valueOf(a)}) : "";
                            mo128955b8(getString(C0966R.string.lur, objArr));
                        } else {
                            C76879j.m92729W(this, getString(C0966R.string.f6l));
                        }
                        VideoAlbumErrorReportStruct videoAlbumErrorReportStruct = new VideoAlbumErrorReportStruct();
                        videoAlbumErrorReportStruct.f266442e = 2;
                        videoAlbumErrorReportStruct.mo126631s(this.f271265T);
                        videoAlbumErrorReportStruct.f266443f = (long) videoMsToSec;
                        videoAlbumErrorReportStruct.mo86054n();
                        return false;
                    }
                    long l2 = C86013q1.m106451l(galleryItem$MediaItem2.f162747d);
                    if (this.f271271W <= 0) {
                        this.f271271W = C101316l.m132908g();
                    }
                    if (this.f271271W <= 0) {
                        this.f271271W = 26214400;
                    }
                    if (l2 > this.f271271W && C98429r0.m127830u() && this.f271249F) {
                        Log.m105924i("MicroMsg.AlbumPreviewUI", "select video file length to large");
                        mo128955b8(getString(C0966R.string.luq, new Object[]{C101316l.m132906e(this.f271271W)}));
                        VideoAlbumErrorReportStruct videoAlbumErrorReportStruct2 = new VideoAlbumErrorReportStruct();
                        videoAlbumErrorReportStruct2.f266442e = 1;
                        videoAlbumErrorReportStruct2.mo126631s(this.f271265T);
                        videoAlbumErrorReportStruct2.f266443f = l2;
                        videoAlbumErrorReportStruct2.mo86054n();
                        return false;
                    }
                } else if (i2 == 4) {
                    if (C101316l.m132902a(galleryItem$MediaItem2.f162747d) > C35511a.f94971a.mo60284b() / 1000) {
                        C76879j.m92729W(this, getString(C0966R.string.f6l));
                        return false;
                    }
                } else if ((i2 == 14 || i2 == 22) && C101316l.m132902a(galleryItem$MediaItem2.f162747d) > 300) {
                    C76879j.m92729W(this, getString(C0966R.string.f6l));
                    return false;
                }
                int intExtra = getIntent().getIntExtra("key_max_video_duration", 0);
                if (intExtra <= 0 || C101316l.m132902a(galleryItem$MediaItem2.f162747d) <= intExtra) {
                    return true;
                }
                C76879j.m92729W(this, getString(C0966R.string.f6l));
                return false;
            }
            C76879j.m92729W(this, getString(C0966R.string.lr6));
            return false;
        }
        if (b == 202) {
            Log.m105924i("MicroMsg.AlbumPreviewUI", "select video duration too long");
            C115669n.INSTANCE.idkeyStat(106, 50, 1, false);
        }
        if (mo128942K7()) {
            C101314g.f296814a.mo140781a(this, b, this.f271272W0);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        if (r7 < r0) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r7 > r1) goto L_0x0051;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* renamed from: J7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo128941J7(int r9, com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem r10) {
        /*
            r8 = this;
            android.content.Intent r0 = r8.getIntent()
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.String r2 = "album_min_ratio_limit"
            float r0 = r0.getFloatExtra(r2, r1)
            android.content.Intent r2 = r8.getIntent()
            java.lang.String r3 = "album_max_ratio_limit"
            float r1 = r2.getFloatExtra(r3, r1)
            r2 = 0
            r3 = 1
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x0024
            int r6 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r6 < 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r4 = 1
            goto L_0x0051
        L_0x0024:
            boolean r6 = r10 instanceof com.tencent.p014mm.plugin.gallery.model.GalleryItem$ImageMediaItem
            if (r6 == 0) goto L_0x0039
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options
            r6.<init>()
            r6.inJustDecodeBounds = r3
            java.lang.String r7 = r10.f162747d
            com.tencent.p014mm.graphics.MMBitmapFactory.m98735d(r7, r6)
            int r7 = r6.outWidth
            int r6 = r6.outHeight
            goto L_0x003b
        L_0x0039:
            r6 = 0
            r7 = 0
        L_0x003b:
            if (r7 == 0) goto L_0x0051
            if (r6 != 0) goto L_0x0040
            goto L_0x0051
        L_0x0040:
            float r7 = (float) r7
            float r6 = (float) r6
            float r7 = r7 / r6
            if (r5 < 0) goto L_0x0049
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0051
        L_0x0049:
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0022
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0022
        L_0x0051:
            java.lang.String r0 = "MicroMsg.AlbumPreviewUI"
            if (r4 != 0) goto L_0x0075
            java.lang.String r9 = "not support ratio"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r9)
            r9 = 0
            boolean r10 = r10 instanceof com.tencent.p014mm.plugin.gallery.model.GalleryItem$ImageMediaItem
            if (r10 == 0) goto L_0x006b
            android.content.res.Resources r9 = r8.getResources()
            r10 = 2131830645(0x7f112775, float:1.9294293E38)
            java.lang.String r9 = r9.getString(r10)
        L_0x006b:
            if (r9 == 0) goto L_0x0074
            androidx.appcompat.app.AppCompatActivity r10 = r8.getContext()
            nj3.C76879j.m92726T(r10, r9)
        L_0x0074:
            return
        L_0x0075:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            int r2 = r10.getType()
            r4 = 2
            if (r2 != r4) goto L_0x008f
            java.lang.String r2 = "is_video"
            r1.putExtra(r2, r3)
            java.lang.String r2 = r10.f162747d
            java.lang.String r3 = "video_full_path"
            r1.putExtra(r3, r2)
        L_0x008f:
            int r2 = r8.f271272W0
            r3 = 10
            if (r2 != r3) goto L_0x009c
            java.lang.String r2 = r10.f162747d
            java.lang.String r3 = "CropImage_OutputPath"
            r1.putExtra(r3, r2)
        L_0x009c:
            java.lang.String r2 = r10.f162747d
            java.lang.String r2 = android.net.Uri.encode(r2)
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1.setData(r2)
            java.lang.String r2 = "getItem ok"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            r0 = -1
            r8.mo128953Z7(r0, r1)
            ew1.e r0 = ew1.C97754e.C97756b.f286807a
            java.lang.String r10 = r10.f162747d
            int r1 = r8.f271280b1
            r0.mo137083b(r10, r1, r9)
            r8.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.mo128941J7(int, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem):void");
    }

    /* renamed from: K7 */
    public final boolean mo128942K7() {
        C94049a aVar = this.f271290h;
        if (aVar == null || !aVar.f271554v) {
            return false;
        }
        if (Util.milliSecondsToNow(this.f271300n1) > 1000) {
            this.f271300n1 = System.currentTimeMillis();
            C94049a aVar2 = this.f271290h;
            if (aVar2 == null || !aVar2.f271554v) {
                return true;
            }
            MMHandlerThread.postToMainThreadDelayed(new C100561b(aVar2), 200);
            return true;
        }
        this.f271300n1 = System.currentTimeMillis();
        return false;
    }

    /* renamed from: L7 */
    public final void mo128943L7(List<GalleryItem$MediaItem> list) {
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105919d("MicroMsg.AlbumPreviewUI", "filterNonExistMedia size: %s.", Integer.valueOf(list.size()));
        LinkedList linkedList = new LinkedList();
        for (GalleryItem$MediaItem next : list) {
            if (!C86013q1.m106450k(next.f162747d)) {
                Log.m105929w("MicroMsg.AlbumPreviewUI", "filter non exist media: %s.", next.f162747d);
                linkedList.add(next);
            }
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            list.remove((GalleryItem$MediaItem) it.next());
        }
        Log.m105919d("MicroMsg.AlbumPreviewUI", "filterNonExistMedia cost: %s.", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: M7 */
    public final String mo128944M7() {
        Iterator<String> it = this.f271290h.mo129055w5().iterator();
        long j = 0;
        while (it.hasNext()) {
            String next = it.next();
            if (!this.f271302o1.containsKey(next)) {
                long l = C86013q1.m106451l(next);
                this.f271302o1.put(next, Long.valueOf(l));
                j += l;
            } else {
                j += this.f271302o1.get(next).longValue();
            }
        }
        if (j > 1073741824) {
            return String.format("%.1fGB", new Object[]{Float.valueOf(((((float) j) / 1024.0f) / 1024.0f) / 1024.0f)});
        } else if (j > 1048576) {
            return String.format("%dMB", new Object[]{Integer.valueOf((int) ((((float) j) / 1024.0f) / 1024.0f))});
        } else if (j <= 0) {
            return "";
        } else {
            return String.format("%dKB", new Object[]{Long.valueOf(j / 1024)});
        }
    }

    /* renamed from: N7 */
    public final void mo128945N7(List<String> list, List<String> list2, int[] iArr) {
        int i;
        int i2 = 0;
        Iterator<GalleryItem$MediaItem> it = this.f271290h.f271542g.iterator();
        while (it.hasNext()) {
            GalleryItem$MediaItem next = it.next();
            if (next.getType() == 1) {
                if (!next.f162755o.equals("edit") || Util.isNullOrNil(next.f162749f)) {
                    if (list != null) {
                        list.add(next.f162747d);
                    }
                } else if (list != null) {
                    list.add(next.f162749f);
                }
                i = i2 + 1;
                iArr[i2] = 1;
            } else if (next.getType() == 2) {
                if (list2 != null) {
                    list2.add(next.f162747d);
                }
                i = i2 + 1;
                iArr[i2] = 2;
            }
            i2 = i;
        }
    }

    /* renamed from: O7 */
    public void mo128946O7() {
        View findViewById = findViewById(C0966R.C0970id.mgd);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI", "hideNoPermissioView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI", "hideNoPermissioView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        RecyclerView recyclerView = this.f271282d;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
    }

    /* renamed from: P7 */
    public final boolean mo128947P7() {
        if (!this.f271287f1) {
            return C98052c.f287486a.mo137356b();
        }
        return MJTemplateHandleNew.f271089u && MJTemplateHandleNew.f271075d.mo128850c();
    }

    /* renamed from: Q7 */
    public void mo128948Q7(int i, boolean z) {
        boolean z2;
        int i2 = this.f271274X0;
        if ((i2 != 1 && i2 != 3) || Util.isNullOrNil(this.f271263S) || "medianote".equals(this.f271265T)) {
            return;
        }
        if (Util.currentTicks() - this.f271267U < 1000) {
            Log.m105928w("MicroMsg.AlbumPreviewUI", "sendImg btn event frequency limit");
            return;
        }
        Log.m105924i("MicroMsg.AlbumPreviewUI", "notifyMM switch to SendImgProxyUI");
        GalleryItem$MediaItem galleryItem$MediaItem = this.f271290h.f271541f.get(i);
        if (galleryItem$MediaItem.getType() != 2) {
            try {
                long j = galleryItem$MediaItem.f162751h;
                String str = galleryItem$MediaItem.f162747d;
                String str2 = this.f271265T;
                if (!this.f271248E) {
                    if (this.f271249F) {
                        z2 = false;
                        C101316l.m132911j(this, j, str, str2, z2, 0, z);
                    }
                }
                z2 = true;
                C101316l.m132911j(this, j, str, str2, z2, 0, z);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: R7 */
    public void mo79062R7() {
        C86709a0.m107525e().postToWorker(new C68993i(this));
    }

    /* renamed from: S7 */
    public void mo79063S7() {
    }

    /* renamed from: T7 */
    public final void mo128949T7(int i, boolean z) {
        if (z) {
            C93958f.m118755o(this.f271290h.f271541f);
        } else {
            C93958f.m118755o(this.f271290h.f271542g);
        }
        Intent intent = new Intent(this, ImagePreviewUI.class);
        intent.putExtra("key_edit_video_max_time_length", getIntent().getIntExtra("key_edit_video_max_time_length", 10));
        intent.putExtra("query_source_type", this.f271272W0);
        intent.putStringArrayListExtra("preview_image_list", this.f271290h.mo129055w5());
        intent.putExtra("key_filter_hdr_video", getIntent().getBooleanExtra("key_filter_hdr_video", false));
        intent.putParcelableArrayListExtra("preview_media_item_list", this.f271290h.f271542g);
        intent.putExtra("preview_all", z);
        if (i > 0) {
            int G4 = i - this.f271290h.mo129039G4();
            intent.putExtra("preview_position", G4);
            mo128948Q7(G4, true);
        }
        intent.putExtra("send_raw_img", this.f271249F);
        intent.putExtra("isSelectAlbum", this.f271276Y0);
        if (!mo128947P7()) {
            intent.putExtra("key_force_hide_edit_image_button", this.f271250G);
        } else if (this.f271283d1) {
            intent.putExtra("key_force_hide_edit_image_button", false);
            intent.putExtra("key_force_hide_edit_video_button", false);
        } else {
            intent.putExtra("key_force_hide_edit_image_button", true);
            intent.putExtra("key_force_hide_edit_video_button", true);
        }
        intent.putExtra("key_force_show_raw_image_button", this.f271252I);
        intent.putExtra("key_is_raw_image_button_disable", this.f271253J);
        intent.putExtra("max_select_count", this.f271257N);
        intent.putExtra("GalleryUI_FromUser", this.f271263S);
        intent.putExtra("GalleryUI_ToUser", this.f271265T);
        intent.putExtra("album_business_tag", this.f271275Y);
        intent.putExtra("album_video_max_duration", this.f271277Z);
        intent.putExtra("album_video_min_duration", this.f271304p0);
        intent.putExtra("select_type_tag", this.f271280b1);
        startActivityForResult(intent, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0288  */
    /* renamed from: U7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo77421U7(int r37, android.view.View r38, int r39) {
        /*
            r36 = this;
            r8 = r36
            r0 = r37
            java.lang.Class<com.tencent.mm.plugin.gallery.ui.ImagePreviewUI> r1 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.class
            com.tencent.mm.plugin.gallery.ui.a r2 = r8.f271290h
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r2 = r2.mo129050g5(r0)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r4 = 0
            r5 = 1
            java.lang.String r6 = "MicroMsg.AlbumPreviewUI"
            if (r2 == 0) goto L_0x081b
            java.lang.String r7 = r2.f162747d
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x001e
            goto L_0x081b
        L_0x001e:
            r8.f271309r1 = r2
            com.tencent.mm.plugin.gallery.model.n r7 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
            int r7 = r7.f271196f
            r9 = 31
            r10 = 5
            if (r7 == r10) goto L_0x003d
            com.tencent.mm.plugin.gallery.model.n r7 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
            int r7 = r7.f271196f
            if (r7 == r9) goto L_0x003d
            com.tencent.mm.plugin.gallery.model.n r7 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
            int r7 = r7.f271196f
            r11 = 33
            if (r7 != r11) goto L_0x0056
        L_0x003d:
            java.lang.String r7 = r2.f162755o
            java.lang.String r11 = "image/gif"
            boolean r7 = r7.equalsIgnoreCase(r11)
            if (r7 == 0) goto L_0x0056
            androidx.appcompat.app.AppCompatActivity r0 = r36.getContext()
            r1 = 2131830641(0x7f112771, float:1.9294285E38)
            java.lang.String r1 = r8.getString(r1)
            nj3.C76879j.m92726T(r0, r1)
            return
        L_0x0056:
            int r7 = r8.f271274X0
            r11 = 2
            if (r5 != r7) goto L_0x0079
            java.lang.String r7 = r2.f162755o
            java.lang.String r7 = r7.toLowerCase()
            java.lang.String r12 = "video"
            boolean r7 = r7.contains(r12)
            if (r7 == 0) goto L_0x0098
            androidx.appcompat.app.AppCompatActivity r0 = r36.getContext()
            r1 = 2131830643(0x7f112773, float:1.929429E38)
            java.lang.String r1 = r8.getString(r1)
            nj3.C76879j.m92726T(r0, r1)
            return
        L_0x0079:
            if (r11 != r7) goto L_0x0098
            java.lang.String r7 = r2.f162755o
            java.lang.String r7 = r7.toLowerCase()
            java.lang.String r12 = "image"
            boolean r7 = r7.contains(r12)
            if (r7 == 0) goto L_0x0098
            androidx.appcompat.app.AppCompatActivity r0 = r36.getContext()
            r1 = 2131830642(0x7f112772, float:1.9294287E38)
            java.lang.String r1 = r8.getString(r1)
            nj3.C76879j.m92726T(r0, r1)
            return
        L_0x0098:
            com.tencent.mm.plugin.gallery.ui.a r7 = r8.f271290h
            int r7 = r7.mo129039G4()
            int r7 = r0 - r7
            java.lang.Object[] r12 = new java.lang.Object[r11]
            int r13 = r8.f271272W0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r4] = r13
            r12[r5] = r2
            java.lang.String r13 = "onMediaClick, querySource %s item %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r13, r12)
            int r12 = r8.f271272W0
            if (r12 == 0) goto L_0x07e8
            if (r12 == r10) goto L_0x07e8
            r10 = 10
            if (r12 == r10) goto L_0x07e8
            r13 = 11
            if (r12 == r13) goto L_0x07e8
            r13 = 27
            if (r12 != r13) goto L_0x00c6
            goto L_0x07e8
        L_0x00c6:
            if (r12 != r9) goto L_0x00e5
            int r1 = r2.getType()
            if (r1 != r11) goto L_0x00e0
            qw1.b r1 = qw1.C63339b.f179706a
            int r3 = r8.f271272W0
            int r1 = r1.mo88236b(r3, r2)
            if (r1 == 0) goto L_0x00e0
            qw1.g r0 = qw1.C101314g.f296814a
            int r2 = r8.f271272W0
            r0.mo140781a(r8, r1, r2)
            return
        L_0x00e0:
            r8.mo128941J7(r0, r2)
            goto L_0x081a
        L_0x00e5:
            java.lang.String r9 = "isSelectAlbum"
            java.lang.String r13 = "select_type_tag"
            java.lang.String r14 = "GalleryUI_ToUser"
            java.lang.String r15 = "GalleryUI_FromUser"
            java.lang.String r10 = "max_select_count"
            java.lang.String r4 = "key_is_raw_image_button_disable"
            java.lang.String r11 = "key_force_show_raw_image_button"
            java.lang.String r5 = "key_force_hide_edit_image_button"
            r18 = r13
            java.lang.String r13 = "send_raw_img"
            r19 = r14
            java.lang.String r14 = "preview_position"
            r20 = r15
            java.lang.String r15 = "preview_all"
            r21 = r10
            java.lang.String r10 = "preview_media_item_list"
            r22 = r4
            java.lang.String r4 = "preview_image_list"
            r23 = r11
            java.lang.String r11 = "key_edit_text_color"
            r24 = r5
            java.lang.String r5 = "key_edit_video_max_time_length"
            r25 = r9
            r9 = 4
            r26 = r13
            if (r12 != r9) goto L_0x0326
            boolean r9 = r8.f271287f1
            if (r9 == 0) goto L_0x012d
            boolean r9 = com.tencent.p014mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew.f271089u
            r12 = 1
            goto L_0x013c
        L_0x012d:
            fw1.c r9 = fw1.C98052c.f287486a
            fw1.a r9 = fw1.C98052c.f287487b
            if (r9 == 0) goto L_0x013a
            boolean r9 = r9.f287475f
            r12 = 1
            if (r9 != r12) goto L_0x013b
            r9 = 1
            goto L_0x013c
        L_0x013a:
            r12 = 1
        L_0x013b:
            r9 = 0
        L_0x013c:
            if (r9 == 0) goto L_0x0142
            r8.mo128949T7(r0, r12)
            return
        L_0x0142:
            boolean r9 = qw1.C101316l.m132912k()
            if (r9 != 0) goto L_0x016a
            int r12 = r2.getType()
            r13 = 2
            if (r12 != r13) goto L_0x016a
            com.tencent.mm.plugin.gallery.ui.a r12 = r8.f271290h
            int r12 = r12.mo129049g0()
            if (r12 == 0) goto L_0x016a
            androidx.appcompat.app.AppCompatActivity r0 = r36.getContext()
            androidx.appcompat.app.AppCompatActivity r1 = r36.getContext()
            r2 = 2131830608(0x7f112750, float:1.9294218E38)
            java.lang.String r1 = kg3.C76577a.m92166q(r1, r2)
            nj3.C76879j.m92726T(r0, r1)
            return
        L_0x016a:
            if (r9 == 0) goto L_0x017b
            com.tencent.mm.plugin.gallery.ui.a r12 = r8.f271290h
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r12 = r12.f271542g
            r13 = 1
            boolean r12 = qw1.C101316l.m132910i(r12, r13)
            if (r12 == 0) goto L_0x017c
            r28 = r7
            r12 = 1
            goto L_0x017f
        L_0x017b:
            r13 = 1
        L_0x017c:
            r28 = r7
            r12 = 0
        L_0x017f:
            r13 = 2
            java.lang.Object[] r7 = new java.lang.Object[r13]
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r9)
            r27 = 0
            r7[r27] = r16
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r12)
            r17 = 1
            r7[r17] = r16
            java.lang.String r13 = "enableSnsVLog:%s skipEditVideo:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r13, r7)
            int r7 = r2.getType()
            r13 = 2
            if (r7 != r13) goto L_0x0265
            if (r12 != 0) goto L_0x0265
            boolean r1 = r2 instanceof com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem
            if (r1 == 0) goto L_0x01b6
            qw1.b r1 = qw1.C63339b.f179706a
            int r4 = r8.f271272W0
            int r1 = r1.mo88236b(r4, r2)
            if (r1 == 0) goto L_0x01b6
            qw1.g r0 = qw1.C101314g.f296814a
            int r2 = r8.f271272W0
            r0.mo140781a(r8, r1, r2)
            return
        L_0x01b6:
            android.content.Intent r1 = r36.getIntent()
            java.lang.String r4 = "key_check_third_party_video"
            r7 = 0
            boolean r1 = r1.getBooleanExtra(r4, r7)
            java.lang.Class<hy.o0> r4 = p166hy.C98567o0.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            hy.o0 r4 = (p166hy.C98567o0) r4
            rx3.l r4 = r4.qa0()
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]
            A r10 = r4.f38555d
            r9[r7] = r10
            B r7 = r4.f38556e
            r10 = 1
            r9[r10] = r7
            java.lang.String r7 = "edit video path:%s thumb path:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r9)
            java.lang.Class<hy.h0> r6 = p166hy.C98561h0.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            r9 = r6
            hy.h0 r9 = (p166hy.C98561h0) r9
            java.lang.String r10 = r2.f162747d
            android.content.Intent r6 = r36.getIntent()
            r7 = 10
            int r5 = r6.getIntExtra(r5, r7)
            int r11 = r5 * 1000
            A r5 = r4.f38555d
            r12 = r5
            java.lang.String r12 = (java.lang.String) r12
            B r4 = r4.f38556e
            r13 = r4
            java.lang.String r13 = (java.lang.String) r13
            r14 = 33
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r4 = r9.rs0(r10, r11, r12, r13, r14)
            com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo r5 = new com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo
            r5.<init>()
            r6 = 1
            r5.f272940d = r6
            r4.f272908I = r5
            r4.f272918T = r1
            com.tencent.mm.component.api.jumper.UICustomParam r1 = new com.tencent.mm.component.api.jumper.UICustomParam
            r1.<init>()
            java.util.Map<java.lang.String, java.lang.Boolean> r5 = r1.f266575h
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.String r6 = "plugin_filter"
            r5.put(r6, r3)
            java.util.Map<java.lang.String, java.lang.Boolean> r5 = r1.f266575h
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.String r6 = "plugin_poi"
            r5.put(r6, r3)
            java.util.Map<java.lang.String, java.lang.Boolean> r5 = r1.f266575h
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.String r6 = "plugin_tip"
            r5.put(r6, r3)
            java.util.Map<java.lang.String, java.lang.Boolean> r5 = r1.f266575h
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.String r6 = "plugin_menu"
            r5.put(r6, r3)
            r4.f272927o = r1
            ew1.e r1 = ew1.C97754e.C97756b.f286807a
            java.lang.String r3 = r2.f162747d
            int r5 = r8.f271280b1
            r1.mo137083b(r3, r5, r0)
            java.lang.String r0 = r2.f162747d
            r8.f271317v1 = r0
            hh2.a r18 = hh2.C8532a.f27585a
            androidx.appcompat.app.AppCompatActivity r19 = r36.getContext()
            r20 = 4379(0x111b, float:6.136E-42)
            r21 = 2130772171(0x7f0100cb, float:1.7147453E38)
            r22 = -1
            r24 = 2
            r25 = 0
            r23 = r4
            r18.mo9446e(r19, r20, r21, r22, r23, r24, r25)
            return
        L_0x0265:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "jump from sns : "
            r0.append(r3)
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "leextime"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r0)
            if (r9 == 0) goto L_0x0288
            com.tencent.mm.plugin.gallery.ui.a r0 = r8.f271290h
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r0 = r0.f271541f
            goto L_0x0292
        L_0x0288:
            com.tencent.mm.plugin.gallery.ui.a r0 = r8.f271290h
            int r3 = r2.getType()
            java.util.ArrayList r0 = r0.mo129056y5(r3)
        L_0x0292:
            com.tencent.p014mm.plugin.gallery.model.C93958f.m118755o(r0)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r8, r1)
            android.content.Intent r1 = r36.getIntent()
            java.lang.String r6 = "key_filter_hdr_video"
            r7 = 0
            boolean r1 = r1.getBooleanExtra(r6, r7)
            r3.putExtra(r6, r1)
            android.content.Intent r1 = r36.getIntent()
            r6 = 10
            int r1 = r1.getIntExtra(r5, r6)
            r3.putExtra(r5, r1)
            android.content.Intent r1 = r36.getIntent()
            java.lang.String r1 = r1.getStringExtra(r11)
            r3.putExtra(r11, r1)
            com.tencent.mm.plugin.gallery.ui.a r1 = r8.f271290h
            java.util.ArrayList r1 = r1.mo129055w5()
            r3.putStringArrayListExtra(r4, r1)
            com.tencent.mm.plugin.gallery.ui.a r1 = r8.f271290h
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r1 = r1.f271542g
            r3.putParcelableArrayListExtra(r10, r1)
            r1 = 1
            r3.putExtra(r15, r1)
            int r0 = r0.indexOf(r2)
            r3.putExtra(r14, r0)
            r7 = r28
            r8.mo128948Q7(r7, r1)
            boolean r0 = r8.f271249F
            r9 = r26
            r3.putExtra(r9, r0)
            boolean r0 = r8.f271276Y0
            r13 = r25
            r3.putExtra(r13, r0)
            boolean r0 = r8.f271250G
            r1 = r24
            r3.putExtra(r1, r0)
            boolean r0 = r8.f271252I
            r1 = r23
            r3.putExtra(r1, r0)
            boolean r0 = r8.f271253J
            r1 = r22
            r3.putExtra(r1, r0)
            int r0 = r8.f271257N
            r1 = r21
            r3.putExtra(r1, r0)
            java.lang.String r0 = r8.f271263S
            r1 = r20
            r3.putExtra(r1, r0)
            java.lang.String r0 = r8.f271265T
            r1 = r19
            r3.putExtra(r1, r0)
            int r0 = r8.f271280b1
            r1 = r18
            r3.putExtra(r1, r0)
            r0 = 0
            r8.startActivityForResult((android.content.Intent) r3, (int) r0)
            goto L_0x081a
        L_0x0326:
            r3 = r22
            r13 = r23
            r0 = r24
            r9 = r26
            r22 = r21
            r21 = r20
            r20 = r19
            r19 = r18
            r18 = r6
            r6 = 14
            if (r12 != r6) goto L_0x04f4
            int r6 = r2.getType()
            r12 = 2
            if (r6 != r12) goto L_0x035e
            com.tencent.mm.plugin.gallery.ui.a r6 = r8.f271290h
            int r6 = r6.mo129049g0()
            if (r6 == 0) goto L_0x035e
            androidx.appcompat.app.AppCompatActivity r0 = r36.getContext()
            androidx.appcompat.app.AppCompatActivity r1 = r36.getContext()
            r2 = 2131830608(0x7f112750, float:1.9294218E38)
            java.lang.String r1 = kg3.C76577a.m92166q(r1, r2)
            nj3.C76879j.m92726T(r0, r1)
            return
        L_0x035e:
            int r6 = r2.getType()
            r12 = 1
            if (r6 != r12) goto L_0x03e7
            com.tencent.mm.plugin.gallery.ui.a r6 = r8.f271290h
            int r12 = r2.getType()
            java.util.ArrayList r6 = r6.mo129056y5(r12)
            com.tencent.p014mm.plugin.gallery.model.C93958f.m118755o(r6)
            android.content.Intent r12 = new android.content.Intent
            r12.<init>(r8, r1)
            android.content.Intent r1 = r36.getIntent()
            r23 = r3
            r3 = 10
            int r1 = r1.getIntExtra(r5, r3)
            r12.putExtra(r5, r1)
            android.content.Intent r1 = r36.getIntent()
            java.lang.String r1 = r1.getStringExtra(r11)
            r12.putExtra(r11, r1)
            com.tencent.mm.plugin.gallery.ui.a r1 = r8.f271290h
            java.util.ArrayList r1 = r1.mo129055w5()
            r12.putStringArrayListExtra(r4, r1)
            com.tencent.mm.plugin.gallery.ui.a r1 = r8.f271290h
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r1 = r1.f271542g
            r12.putParcelableArrayListExtra(r10, r1)
            r1 = 1
            r12.putExtra(r15, r1)
            int r2 = r6.indexOf(r2)
            r12.putExtra(r14, r2)
            r8.mo128948Q7(r7, r1)
            boolean r1 = r8.f271249F
            r12.putExtra(r9, r1)
            boolean r1 = r8.f271250G
            r12.putExtra(r0, r1)
            boolean r0 = r8.f271252I
            r12.putExtra(r13, r0)
            boolean r0 = r8.f271253J
            r3 = r23
            r12.putExtra(r3, r0)
            int r0 = r8.f271257N
            r1 = r22
            r12.putExtra(r1, r0)
            java.lang.String r0 = r8.f271263S
            r1 = r21
            r12.putExtra(r1, r0)
            java.lang.String r0 = r8.f271265T
            r1 = r20
            r12.putExtra(r1, r0)
            int r0 = r8.f271280b1
            r1 = r19
            r12.putExtra(r1, r0)
            r0 = 0
            r8.startActivityForResult((android.content.Intent) r12, (int) r0)
            goto L_0x081a
        L_0x03e7:
            r0 = 0
            boolean r1 = r2 instanceof com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem
            if (r1 == 0) goto L_0x081a
            r1 = r2
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r1 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r1
            int r3 = r1.f162766w
            r4 = 2000(0x7d0, float:2.803E-42)
            if (r3 > r4) goto L_0x0424
            r4 = 1
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r1[r0] = r2
            java.lang.String r0 = "select story video, duration too long, duration:%s"
            r3 = r18
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r1)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1005(0x3ed, double:4.965E-321)
            r12 = 53
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            androidx.appcompat.app.AppCompatActivity r0 = r36.getContext()
            androidx.appcompat.app.AppCompatActivity r1 = r36.getContext()
            r2 = 2131830634(0x7f11276a, float:1.929427E38)
            java.lang.String r1 = kg3.C76577a.m92166q(r1, r2)
            nj3.C76879j.m92726T(r0, r1)
            return
        L_0x0424:
            r3 = r18
            int r0 = r1.f162762B
            r4 = 1
            if (r0 > r4) goto L_0x04ae
            if (r0 < 0) goto L_0x04ae
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6 = 0
            r7[r6] = r0
            java.lang.String r0 = r1.f162747d
            r7[r4] = r0
            java.lang.String r0 = "select story video, videoFrameRate too small:%s, videoPath:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r7)
            int r0 = r1.f162762B
            if (r0 > r4) goto L_0x0478
            java.lang.String r0 = r1.f162747d     // Catch:{ Exception -> 0x0477 }
            java.lang.String r0 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.getSimpleMp4InfoVFS(r0)     // Catch:{ Exception -> 0x0477 }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0477 }
            if (r4 != 0) goto L_0x0478
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0477 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0477 }
            java.lang.String r0 = "videoFPS"
            double r6 = r4.optDouble(r0)     // Catch:{ Exception -> 0x0477 }
            java.lang.String r0 = "update from getSimpleMp4Info videoFPS:%s"
            r4 = 1
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0477 }
            java.lang.Double r4 = java.lang.Double.valueOf(r6)     // Catch:{ Exception -> 0x0477 }
            r10 = 0
            r9[r10] = r4     // Catch:{ Exception -> 0x0477 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r9)     // Catch:{ Exception -> 0x0477 }
            r9 = 0
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0478
            int r0 = (int) r6     // Catch:{ Exception -> 0x0477 }
            r1.f162762B = r0     // Catch:{ Exception -> 0x0477 }
            goto L_0x0478
        L_0x0477:
        L_0x0478:
            int r0 = r1.f162762B
            r4 = 1
            if (r0 >= r4) goto L_0x04ae
            r6 = 2
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5 = 0
            r2[r5] = r0
            java.lang.String r0 = r1.f162747d
            r2[r4] = r0
            java.lang.String r0 = "final videoFrameRate:%s, too small, videoPath:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r2)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1005(0x3ed, double:4.965E-321)
            r12 = 54
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            androidx.appcompat.app.AppCompatActivity r0 = r36.getContext()
            androidx.appcompat.app.AppCompatActivity r1 = r36.getContext()
            r2 = 2131830624(0x7f112760, float:1.929425E38)
            java.lang.String r1 = kg3.C76577a.m92166q(r1, r2)
            nj3.C76879j.m92726T(r0, r1)
            return
        L_0x04ae:
            android.content.Intent r0 = r36.getIntent()
            r4 = 10
            int r0 = r0.getIntExtra(r5, r4)
            int r0 = r0 * 1000
            int r0 = r0 + 500
            long r4 = (long) r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 0
            r0[r5] = r4
            java.lang.String r4 = "maxDuration=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r3 = r1.f162747d
            java.lang.String r4 = "K_SEGMENTVIDEOPATH"
            r0.putExtra(r4, r3)
            java.lang.String r1 = r1.f162750g
            java.lang.String r3 = "KSEGMENTVIDEOTHUMBPATH"
            r0.putExtra(r3, r1)
            r1 = -1
            r8.mo128953Z7(r1, r0)
            ew1.e r0 = ew1.C97754e.C97756b.f286807a
            java.lang.String r1 = r2.f162747d
            int r2 = r8.f271280b1
            r3 = r37
            r0.mo137083b(r1, r2, r3)
            r36.finish()
            goto L_0x081a
        L_0x04f4:
            r6 = 29
            if (r12 != r6) goto L_0x0588
            int r6 = r2.getType()
            r12 = 1
            if (r6 != r12) goto L_0x081a
            com.tencent.mm.plugin.gallery.ui.a r6 = r8.f271290h
            int r12 = r2.getType()
            java.util.ArrayList r6 = r6.mo129056y5(r12)
            com.tencent.p014mm.plugin.gallery.model.C93958f.m118755o(r6)
            android.content.Intent r12 = new android.content.Intent
            r12.<init>(r8, r1)
            android.content.Intent r1 = r36.getIntent()
            r23 = r3
            r3 = 10
            int r1 = r1.getIntExtra(r5, r3)
            r12.putExtra(r5, r1)
            android.content.Intent r1 = r36.getIntent()
            java.lang.String r1 = r1.getStringExtra(r11)
            r12.putExtra(r11, r1)
            com.tencent.mm.plugin.gallery.ui.a r1 = r8.f271290h
            java.util.ArrayList r1 = r1.mo129055w5()
            r12.putStringArrayListExtra(r4, r1)
            com.tencent.mm.plugin.gallery.ui.a r1 = r8.f271290h
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r1 = r1.f271542g
            r12.putParcelableArrayListExtra(r10, r1)
            r1 = 1
            r12.putExtra(r15, r1)
            int r2 = r6.indexOf(r2)
            r12.putExtra(r14, r2)
            r8.mo128948Q7(r7, r1)
            boolean r1 = r8.f271249F
            r12.putExtra(r9, r1)
            boolean r1 = r8.f271276Y0
            r3 = r25
            r12.putExtra(r3, r1)
            boolean r1 = r8.f271250G
            r12.putExtra(r0, r1)
            boolean r0 = r8.f271252I
            r12.putExtra(r13, r0)
            boolean r0 = r8.f271253J
            r6 = r23
            r12.putExtra(r6, r0)
            int r0 = r8.f271257N
            r1 = r22
            r12.putExtra(r1, r0)
            java.lang.String r0 = r8.f271263S
            r1 = r21
            r12.putExtra(r1, r0)
            java.lang.String r0 = r8.f271265T
            r1 = r20
            r12.putExtra(r1, r0)
            int r0 = r8.f271280b1
            r1 = r19
            r12.putExtra(r1, r0)
            r0 = 0
            r8.startActivityForResult((android.content.Intent) r12, (int) r0)
            goto L_0x081a
        L_0x0588:
            r29 = r19
            r30 = r20
            r31 = r21
            r32 = r22
            r22 = r3
            r3 = r25
            r6 = 30
            if (r12 != r6) goto L_0x0628
            int r6 = r2.getType()
            r12 = 1
            if (r6 != r12) goto L_0x081a
            com.tencent.mm.plugin.gallery.ui.a r6 = r8.f271290h
            int r12 = r2.getType()
            java.util.ArrayList r6 = r6.mo129056y5(r12)
            com.tencent.p014mm.plugin.gallery.model.C93958f.m118755o(r6)
            android.content.Intent r12 = new android.content.Intent
            r12.<init>(r8, r1)
            android.content.Intent r1 = r36.getIntent()
            r23 = r13
            r13 = 10
            int r1 = r1.getIntExtra(r5, r13)
            r12.putExtra(r5, r1)
            android.content.Intent r1 = r36.getIntent()
            java.lang.String r1 = r1.getStringExtra(r11)
            r12.putExtra(r11, r1)
            com.tencent.mm.plugin.gallery.ui.a r1 = r8.f271290h
            java.util.ArrayList r1 = r1.mo129055w5()
            r12.putStringArrayListExtra(r4, r1)
            com.tencent.mm.plugin.gallery.ui.a r1 = r8.f271290h
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r1 = r1.f271542g
            r12.putParcelableArrayListExtra(r10, r1)
            r1 = 1
            r12.putExtra(r15, r1)
            int r2 = r6.indexOf(r2)
            r12.putExtra(r14, r2)
            r8.mo128948Q7(r7, r1)
            boolean r1 = r8.f271249F
            r12.putExtra(r9, r1)
            boolean r1 = r8.f271276Y0
            r12.putExtra(r3, r1)
            boolean r1 = r8.f271250G
            r12.putExtra(r0, r1)
            boolean r0 = r8.f271252I
            r6 = r23
            r12.putExtra(r6, r0)
            boolean r0 = r8.f271253J
            r11 = r22
            r12.putExtra(r11, r0)
            int r0 = r8.f271257N
            r13 = r32
            r12.putExtra(r13, r0)
            java.lang.String r0 = r8.f271263S
            r1 = r31
            r12.putExtra(r1, r0)
            java.lang.String r0 = r8.f271265T
            r1 = r30
            r12.putExtra(r1, r0)
            int r0 = r8.f271280b1
            r1 = r29
            r12.putExtra(r1, r0)
            r0 = 0
            r8.startActivityForResult((android.content.Intent) r12, (int) r0)
            goto L_0x081a
        L_0x0628:
            r38 = r5
            r6 = r13
            r11 = r22
            r19 = r29
            r20 = r30
            r12 = r31
            r13 = r32
            boolean r5 = r8.f271255L
            r21 = r12
            java.lang.String r12 = "album_video_min_duration"
            r37 = r12
            java.lang.String r12 = "album_video_max_duration"
            r22 = r12
            java.lang.String r12 = "album_business_tag"
            r23 = r12
            java.lang.String r12 = "query_source_type"
            if (r5 == 0) goto L_0x0757
            int r5 = r2.getType()
            r24 = r12
            r12 = 2
            if (r5 != r12) goto L_0x0655
            r5 = 1
            goto L_0x0657
        L_0x0655:
            int r5 = r8.f271257N
        L_0x0657:
            int r12 = r8.f271272W0
            r38 = r5
            r5 = 16
            if (r12 != r5) goto L_0x069a
            int r12 = r8.f271274X0
            r5 = 2
            if (r12 == r5) goto L_0x0667
            r5 = 3
            if (r12 != r5) goto L_0x069a
        L_0x0667:
            com.tencent.mm.plugin.gallery.ui.a r5 = r8.f271290h
            int r5 = r5.mo129049g0()
            if (r5 <= 0) goto L_0x0697
            com.tencent.mm.plugin.gallery.ui.a r5 = r8.f271290h
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r5 = r5.f271542g
            r12 = 0
            java.lang.Object r5 = r5.get(r12)
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r5 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r5
            int r5 = r5.getType()
            int r12 = r2.getType()
            if (r5 == r12) goto L_0x0697
            androidx.appcompat.app.AppCompatActivity r0 = r36.getContext()
            androidx.appcompat.app.AppCompatActivity r1 = r36.getContext()
            r2 = 2131830608(0x7f112750, float:1.9294218E38)
            java.lang.String r1 = kg3.C76577a.m92166q(r1, r2)
            nj3.C76879j.m92726T(r0, r1)
            return
        L_0x0697:
            int r5 = r8.f271257N
            goto L_0x06be
        L_0x069a:
            int r5 = r2.getType()
            r12 = 2
            if (r5 != r12) goto L_0x06bc
            com.tencent.mm.plugin.gallery.ui.a r5 = r8.f271290h
            int r5 = r5.mo129049g0()
            if (r5 == 0) goto L_0x06bc
            androidx.appcompat.app.AppCompatActivity r0 = r36.getContext()
            androidx.appcompat.app.AppCompatActivity r1 = r36.getContext()
            r2 = 2131830608(0x7f112750, float:1.9294218E38)
            java.lang.String r1 = kg3.C76577a.m92166q(r1, r2)
            nj3.C76879j.m92726T(r0, r1)
            return
        L_0x06bc:
            r5 = r38
        L_0x06be:
            int r12 = r8.f271272W0
            r25 = r5
            r5 = 15
            if (r12 != r5) goto L_0x06ce
            int r5 = r2.getType()
            r12 = 2
            if (r5 != r12) goto L_0x06ce
            return
        L_0x06ce:
            com.tencent.mm.plugin.gallery.ui.a r5 = r8.f271290h
            int r12 = r2.getType()
            java.util.ArrayList r5 = r5.mo129056y5(r12)
            com.tencent.p014mm.plugin.gallery.model.C93958f.m118755o(r5)
            android.content.Intent r12 = new android.content.Intent
            r12.<init>(r8, r1)
            com.tencent.mm.plugin.gallery.ui.a r1 = r8.f271290h
            java.util.ArrayList r1 = r1.mo129055w5()
            r12.putStringArrayListExtra(r4, r1)
            com.tencent.mm.plugin.gallery.ui.a r1 = r8.f271290h
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r1 = r1.f271542g
            r12.putParcelableArrayListExtra(r10, r1)
            r1 = 1
            r12.putExtra(r15, r1)
            int r2 = r5.indexOf(r2)
            r12.putExtra(r14, r2)
            r8.mo128948Q7(r7, r1)
            boolean r1 = r8.f271249F
            r12.putExtra(r9, r1)
            boolean r1 = r8.f271276Y0
            r12.putExtra(r3, r1)
            boolean r1 = r8.f271250G
            r12.putExtra(r0, r1)
            boolean r0 = r8.f271252I
            r12.putExtra(r6, r0)
            boolean r0 = r8.f271253J
            r12.putExtra(r11, r0)
            r5 = r25
            r12.putExtra(r13, r5)
            int r0 = r8.f271272W0
            r1 = 16
            if (r0 != r1) goto L_0x0727
            r2 = r24
            r12.putExtra(r2, r0)
        L_0x0727:
            java.lang.String r0 = r8.f271263S
            r5 = r21
            r12.putExtra(r5, r0)
            java.lang.String r0 = r8.f271265T
            r1 = r20
            r12.putExtra(r1, r0)
            int r0 = r8.f271280b1
            r1 = r19
            r12.putExtra(r1, r0)
            java.lang.String r0 = r8.f271275Y
            r1 = r23
            r12.putExtra(r1, r0)
            int r0 = r8.f271277Z
            r1 = r22
            r12.putExtra(r1, r0)
            int r0 = r8.f271304p0
            r1 = r37
            r12.putExtra(r1, r0)
            r0 = 0
            r8.startActivityForResult((android.content.Intent) r12, (int) r0)
            goto L_0x081a
        L_0x0757:
            r33 = r37
            r2 = r12
            r5 = r21
            r34 = r22
            r35 = r23
            com.tencent.mm.plugin.gallery.ui.a r12 = r8.f271290h
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r12 = r12.f271541f
            com.tencent.p014mm.plugin.gallery.model.C93958f.m118755o(r12)
            android.content.Intent r12 = new android.content.Intent
            r12.<init>(r8, r1)
            int r1 = r8.f271272W0
            r12.putExtra(r2, r1)
            boolean r1 = r8.f271276Y0
            r12.putExtra(r3, r1)
            com.tencent.mm.plugin.gallery.ui.a r1 = r8.f271290h
            java.util.ArrayList r1 = r1.mo129055w5()
            r12.putStringArrayListExtra(r4, r1)
            com.tencent.mm.plugin.gallery.ui.a r1 = r8.f271290h
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r1 = r1.f271542g
            r12.putParcelableArrayListExtra(r10, r1)
            r1 = 1
            r12.putExtra(r15, r1)
            r12.putExtra(r14, r7)
            r8.mo128948Q7(r7, r1)
            boolean r1 = r8.f271249F
            r12.putExtra(r9, r1)
            boolean r1 = r8.f271250G
            r12.putExtra(r0, r1)
            boolean r0 = r8.f271252I
            r12.putExtra(r6, r0)
            boolean r0 = r8.f271253J
            r12.putExtra(r11, r0)
            int r0 = r8.f271257N
            r12.putExtra(r13, r0)
            java.lang.String r0 = r8.f271263S
            r12.putExtra(r5, r0)
            java.lang.String r0 = r8.f271265T
            r1 = r20
            r12.putExtra(r1, r0)
            java.lang.String r0 = r8.f271275Y
            r1 = r35
            r12.putExtra(r1, r0)
            int r0 = r8.f271277Z
            r1 = r34
            r12.putExtra(r1, r0)
            int r0 = r8.f271304p0
            r1 = r33
            r12.putExtra(r1, r0)
            com.tencent.mm.plugin.gallery.model.n r0 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
            int r0 = r0.f271196f
            r1 = 14
            if (r0 != r1) goto L_0x07dc
            r0 = 300500(0x495d4, float:4.2109E-40)
            r1 = r38
            r12.putExtra(r1, r0)
        L_0x07dc:
            int r0 = r8.f271280b1
            r1 = r19
            r12.putExtra(r1, r0)
            r0 = 0
            r8.startActivityForResult((android.content.Intent) r12, (int) r0)
            goto L_0x081a
        L_0x07e8:
            r3 = r0
            int r0 = r8.f271274X0
            r1 = 2
            if (r0 != r1) goto L_0x0817
            r1 = 1
            r0 = 2131830660(0x7f112784, float:1.9294324E38)
            java.lang.String r4 = r8.getString(r0)
            r0 = 2131821677(0x7f11046d, float:1.9276104E38)
            java.lang.String r5 = r8.getString(r0)
            r0 = 2131821426(0x7f110372, float:1.9275595E38)
            java.lang.String r6 = r8.getString(r0)
            com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$m r7 = new com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI$m
            r7.<init>(r2, r3)
            r9 = 0
            java.lang.String r3 = ""
            r0 = r36
            r2 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r9
            nj3.C76879j.m92717K(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x081a
        L_0x0817:
            r8.mo128941J7(r3, r2)
        L_0x081a:
            return
        L_0x081b:
            r3 = r6
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            if (r2 != 0) goto L_0x0823
            r5 = 1
            goto L_0x0824
        L_0x0823:
            r5 = 0
        L_0x0824:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "item is null %s, item original path is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.mo77421U7(int, android.view.View, int):void");
    }

    /* renamed from: V7 */
    public boolean mo77422V7() {
        String str;
        String str2;
        int i;
        char c;
        int i2;
        Boolean valueOf = Boolean.valueOf(this.f271248E);
        Boolean bool = Boolean.TRUE;
        Log.m105919d("MicroMsg.AlbumPreviewUI", "send image, previewImageCount:%d, chooseForTimeline:%b", Integer.valueOf(C93958f.m118749i().f271162h.size()), valueOf);
        ((C58247e) C86312j.m106911c(C58247e.class)).P70(false);
        int i3 = this.f271248E ? 3 : 2;
        C101316l.m132914m(11610, i3 + "," + C93958f.m118749i().f271162h.size());
        if (this.f271271W < 0) {
            this.f271271W = C101316l.m132908g();
        }
        C93958f.m118749i().f271162h.clear();
        if (this.f271290h.mo129055w5().size() == 0) {
            Log.m105924i("MicroMsg.AlbumPreviewUI", "onMenuItemClick");
            mo128953Z7(-2, (Intent) null);
            finish();
            return true;
        }
        Intent intent = new Intent();
        int i4 = this.f271274X0;
        boolean z = this.f271255L;
        if (z) {
            if (z && this.f271272W0 == 16) {
                Iterator<GalleryItem$MediaItem> it = this.f271290h.f271542g.iterator();
                if (it.hasNext()) {
                    GalleryItem$MediaItem next = it.next();
                    if (next.getType() != 1 && next.getType() == 2) {
                        i4 = 2;
                    }
                }
            }
            i4 = 1;
        }
        String str3 = "plugin_filter";
        if (22 == C93958f.m118750j().f271196f) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int[] iArr = new int[this.f271257N];
            mo128945N7(arrayList, arrayList2, iArr);
            if (!this.f271268U0 || arrayList2.size() <= 0) {
                boolean l = C101316l.m132913l();
                if (C102635b.f302228j.mo142293a(-1, arrayList, arrayList2) != 4 || !l) {
                    intent.putStringArrayListExtra("key_select_video_list", arrayList2);
                    intent.putStringArrayListExtra("key_select_image_list", arrayList);
                    mo128953Z7(-1, intent);
                    finish();
                    return true;
                }
                VLogPreloadUI.f162815d.mo80225a(this, arrayList2, arrayList, iArr, (Point) null);
                return true;
            }
            RecordConfigProvider c2 = RecordConfigProvider.m119433c((String) arrayList2.get(0), "", "");
            c2.f272935w = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_story_album_duration, 15) * 1000;
            c2.f272905F = 2;
            UICustomParam uICustomParam = new UICustomParam();
            ((HashMap) uICustomParam.f266575h).put(str3, bool);
            ((HashMap) uICustomParam.f266575h).put("plugin_poi", bool);
            ((HashMap) uICustomParam.f266575h).put("plugin_tip", bool);
            ((HashMap) uICustomParam.f266575h).put("plugin_menu", bool);
            c2.f272927o = uICustomParam;
            c2.f272910K = false;
            c2.f272911L = false;
            c2.f272913N = true;
            c2.f272930r = bool;
            c2.f272929q = 4;
            c2.f272926n = C102609h.Fx0().ai0();
            if (!TextUtils.isEmpty(this.f271270V0)) {
                c2.mo129804a(2, this.f271270V0);
            }
            C8532a.f27585a.mo9446e(getContext(), 4383, C0966R.C0968anim.f2492eg, -1, c2, 2, 0);
            return true;
        } else if (this.f271272W0 == 28) {
            ArrayList<GalleryItem$MediaItem> arrayList3 = this.f271290h.f271542g;
            if (arrayList3.size() > 0) {
                mo128941J7(0, arrayList3.get(0));
            }
            return true;
        } else {
            if (this.f271287f1) {
                C93958f.m118744d(this.f271290h.mo129055w5());
                if (MJTemplateHandleNew.f271075d.mo128851d(this.f271290h.f271542g, new c$$a(this))) {
                    return true;
                }
            } else if (C98052c.f287486a.mo137357c(this.f271290h.f271542g, new c$$b(this))) {
                return true;
            }
            String str4 = "com.tencent.mm.ui.chatting.SendImgProxyUI";
            String str5 = "edit";
            Object obj = "plugin_menu";
            Object obj2 = "plugin_tip";
            Boolean bool2 = bool;
            Object obj3 = "plugin_poi";
            if (i4 == 1) {
                intent.putExtra("CropImage_Compress_Img", this.f271248E || !this.f271249F);
                ArrayList<GalleryItem$MediaItem> arrayList4 = this.f271290h.f271542g;
                ArrayList arrayList5 = new ArrayList();
                Iterator<GalleryItem$MediaItem> it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    GalleryItem$MediaItem next2 = it4.next();
                    if (!next2.f162755o.equals(str5) || Util.isNullOrNil(next2.f162749f)) {
                        arrayList5.add(next2.f162747d);
                    } else {
                        arrayList5.add(next2.f162749f);
                    }
                }
                intent.putStringArrayListExtra("CropImage_OutputPath_List", arrayList5);
                intent.putExtra("KSelectImgUseTime", System.currentTimeMillis() - this.f271269V);
                this.f271269V = 0;
                if (!Util.isNullOrNil(this.f271275Y) && this.f271275Y.equals("album_business_bubble_media_by_coordinate")) {
                    intent.putExtra("CropImage_Compress_Img", false);
                }
                if (Util.currentTicks() - this.f271267U < 1000) {
                    Log.m105928w("MicroMsg.AlbumPreviewUI", "sendImg btn event frequency limit");
                    return true;
                }
                Log.m105924i("MicroMsg.AlbumPreviewUI", "QUERY_TYPE_IMAGE switch to SendImgProxyUI");
                this.f271267U = Util.currentTicks();
                if (Util.isNullOrNil(this.f271263S) || "medianote".equals(this.f271265T)) {
                    mo128953Z7(-1, intent);
                    finish();
                    return true;
                }
                intent.setClassName(this, str4);
                intent.putExtra("GalleryUI_FromUser", this.f271263S);
                intent.putExtra("GalleryUI_ToUser", this.f271265T);
                startActivityForResult(intent, 4373);
                return true;
            } else if (i4 == 2) {
                Log.m105924i("MicroMsg.AlbumPreviewUI", "onMenuItemClick video");
                if (getIntent().getBooleanExtra("GalleryUI_SkipVideoSizeLimit", false)) {
                    c = 0;
                    i = 0;
                } else {
                    String str6 = this.f271290h.mo129055w5().get(0);
                    long j = this.f271271W;
                    if (Util.isNullOrNil(str6)) {
                        Log.m105928w("MicroMsg.VideoBoundaryCheck", "dz[check video but path is null or nil]");
                    }
                    boolean is2G = NetStatusUtil.is2G(MMApplicationContext.getContext());
                    boolean a = C102016c.m134339a(str6);
                    int i5 = 10485760;
                    if (a) {
                        i2 = SightVideoJNI.shouldRemuxingVFS(str6, JsApiResumeDownloadTaskForNative.CTRL_INDEX, 500, is2G ? 10485760 : (int) j, is2G ? 60000.0d : (double) j, 1000000);
                    } else {
                        int l2 = (int) C86013q1.m106451l(str6);
                        if (!is2G) {
                            i5 = 26214400;
                        }
                        i2 = l2 > i5 ? -1 : 1;
                    }
                    i = 0;
                    Log.m105925i("MicroMsg.VideoBoundaryCheck", "check should remuxing, ret %d, isMp4 %b", Integer.valueOf(i2), Boolean.valueOf(a));
                    switch (i2) {
                        case -6:
                        case -5:
                        case -4:
                        case -3:
                        case -2:
                            break;
                        case -1:
                            c = 2;
                            break;
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            c = 0;
                            break;
                        default:
                            Log.m105921e("MicroMsg.VideoBoundaryCheck", "unknown check type %d", Integer.valueOf(i2));
                            break;
                    }
                    c = 1;
                }
                if (c == 0) {
                    intent.setData(FileProviderHelper.getUriForFile(getContext(), new C86009m1(this.f271290h.mo129055w5().get(i))));
                    intent.putStringArrayListExtra("key_select_video_list", this.f271290h.mo129055w5());
                    intent.putExtra("CropImage_Compress_Img", !this.f271249F);
                    mo128953Z7(-1, intent);
                    finish();
                    return true;
                } else if (c == 2) {
                    C76879j.m92738i(this, C0966R.string.ka9, C0966R.string.f6s);
                    Log.m105928w("MicroMsg.AlbumPreviewUI", "video is import error");
                    return true;
                } else {
                    if (C98429r0.m127830u()) {
                        long j2 = this.f271271W;
                        if (j2 <= 0) {
                            j2 = 1073741824;
                        }
                        C76879j.m92729W(this, getString(C0966R.string.luq, new Object[]{C101316l.m132906e(j2)}));
                    } else {
                        C76879j.m92738i(this, C0966R.string.f6r, C0966R.string.f6s);
                    }
                    Log.m105928w("MicroMsg.AlbumPreviewUI", "video is over size");
                    return true;
                }
            } else if (i4 == 3) {
                if (Util.isNullOrNil(this.f271275Y) || !this.f271275Y.equals("album_business_bubble_media_by_coordinate")) {
                    String str7 = "GalleryUI_FromUser";
                    if (Util.currentTicks() - this.f271267U < 1000) {
                        Log.m105928w("MicroMsg.AlbumPreviewUI", "sendImg btn event frequency limit");
                        return true;
                    }
                    this.f271267U = Util.currentTicks();
                    ArrayList<GalleryItem$MediaItem> arrayList6 = this.f271290h.f271542g;
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    String str8 = "GalleryUI_ToUser";
                    int[] iArr2 = new int[this.f271257N];
                    Iterator<GalleryItem$MediaItem> it5 = arrayList6.iterator();
                    int i6 = 0;
                    while (it5.hasNext()) {
                        Iterator<GalleryItem$MediaItem> it6 = it5;
                        GalleryItem$MediaItem next3 = it5.next();
                        String str9 = str7;
                        String str10 = str4;
                        if (next3.getType() == 1) {
                            if (this.f271272W0 != 3 || !C98429r0.m127830u() || !this.f271249F || C86013q1.m106451l(next3.f162747d) <= 26214400) {
                                if (!next3.f162755o.equals(str5) || Util.isNullOrNil(next3.f162749f)) {
                                    arrayList8.add(next3.f162747d);
                                    arrayList9.add(next3.f162747d);
                                } else {
                                    arrayList8.add(next3.f162749f);
                                    arrayList9.add(next3.f162749f);
                                }
                                iArr2[i6] = 1;
                                i6++;
                            } else {
                                mo128955b8(getString(C0966R.string.lup, new Object[]{C101316l.m132906e(26214400)}));
                                return false;
                            }
                        } else if (next3.getType() == 2) {
                            if (this.f271272W0 != 3 || !C98429r0.m127830u() || !this.f271249F) {
                                str = str5;
                                str2 = str3;
                            } else {
                                long l3 = C86013q1.m106451l(next3.f162747d);
                                str2 = str3;
                                long j3 = this.f271271W;
                                if (l3 > j3) {
                                    mo128955b8(getString(C0966R.string.luq, new Object[]{C101316l.m132906e(j3)}));
                                    return false;
                                }
                                str = str5;
                            }
                            arrayList7.add(next3.f162747d);
                            arrayList9.add(next3.f162747d);
                            iArr2[i6] = 2;
                            i6++;
                            str3 = str2;
                            str7 = str9;
                            it5 = it6;
                            str4 = str10;
                            str5 = str;
                        }
                        str = str5;
                        str2 = str3;
                        str3 = str2;
                        str7 = str9;
                        it5 = it6;
                        str4 = str10;
                        str5 = str;
                    }
                    String str11 = str7;
                    String str12 = str4;
                    String str13 = str3;
                    intent.putExtra("CropImage_Compress_Img", this.f271248E || !this.f271249F);
                    intent.putStringArrayListExtra("key_select_video_list", arrayList7);
                    intent.putStringArrayListExtra("key_select_mix_media_list", arrayList9);
                    intent.putExtra("key_select_media_idex_list", iArr2);
                    intent.putExtra("isSelectAlbum", this.f271276Y0);
                    intent.putExtra("KSelectImgUseTime", System.currentTimeMillis() - this.f271269V);
                    C97754e.C97756b.f286807a.f286791j = arrayList8.size();
                    C97754e.C97756b.f286807a.f286792k = arrayList7.size();
                    C97754e eVar = C97754e.C97756b.f286807a;
                    boolean z2 = this.f271276Y0;
                    eVar.f286795n = z2 ? 1 : 0;
                    eVar.f286796o = 1;
                    if (this.f271248E) {
                        if (arrayList7.size() == 0) {
                            C93958f.m118744d(arrayList8);
                            intent.putStringArrayListExtra("CropImage_OutputPath_List", arrayList8);
                            intent.putExtra("KSelectImgUseTime", System.currentTimeMillis() - this.f271269V);
                            this.f271269V = 0;
                            mo128953Z7(-1, intent);
                            finish();
                            return true;
                        }
                        C60960c.f173618a.mo85927k("SnsPublishProcess", "actionTrace_", 5, C60242i.ACTIONTRACE);
                        if (C102635b.f302228j.mo142293a(-1, arrayList8, arrayList7) == 4) {
                            VLogPreloadUI.f162815d.mo80225a(this, arrayList7, arrayList8, iArr2, (Point) null);
                            return true;
                        }
                        C93958f.m118743c();
                        C13604l<String, String> qa02 = ((C98567o0) C86312j.m106911c(C98567o0.class)).qa0();
                        Log.m105925i("MicroMsg.AlbumPreviewUI", "edit video path:%s thumb path:%s", qa02.f38555d, qa02.f38556e);
                        RecordConfigProvider rs02 = ((C98561h0) C86312j.m106911c(C98561h0.class)).rs0((String) arrayList7.get(0), getIntent().getIntExtra("key_edit_video_max_time_length", 10) * 1000, (String) qa02.f38555d, (String) qa02.f38556e, 33);
                        VideoCaptureReportInfo videoCaptureReportInfo = new VideoCaptureReportInfo();
                        videoCaptureReportInfo.f272940d = 1;
                        rs02.f272908I = videoCaptureReportInfo;
                        UICustomParam uICustomParam2 = new UICustomParam();
                        ((HashMap) uICustomParam2.f266575h).put(str13, Boolean.TRUE);
                        Boolean bool3 = bool2;
                        ((HashMap) uICustomParam2.f266575h).put(obj3, bool3);
                        ((HashMap) uICustomParam2.f266575h).put(obj2, bool3);
                        ((HashMap) uICustomParam2.f266575h).put(obj, bool3);
                        rs02.f272927o = uICustomParam2;
                        boolean booleanExtra = getIntent().getBooleanExtra("key_check_third_party_video", false);
                        rs02.f272918T = booleanExtra;
                        Log.m105925i("MicroMsg.AlbumPreviewUI", "checkThirdPartyVideo:%b", Boolean.valueOf(booleanExtra));
                        C8532a.f27585a.mo9446e(getContext(), 4379, C0966R.C0968anim.f2492eg, -1, rs02, 2, 0);
                        return true;
                    } else if (z2) {
                        intent.setClassName(this, str12);
                        intent.putStringArrayListExtra("CropImage_OutputPath_List", arrayList8);
                        intent.putExtra(str11, this.f271263S);
                        intent.putExtra(str8, this.f271265T);
                        intent.putExtra("CropImage_limit_Img_Size", 26214400);
                        C62619a aVar = new C62619a();
                        aVar.f177829d = this.f271254K;
                        aVar.f177833h = 1;
                        ((C99933h) C86312j.m106911c(C99933h.class)).mo84399BM(18, "album_enter_from_scene", aVar, new c$$c());
                        Log.m105925i("MicroMsg.AlbumPreviewUI", "QUERY_TYPE_IMAGE_AND_VIDEO switch to SendImgProxyUI, send img size: %d, video size: %d", Integer.valueOf(arrayList8.size()), Integer.valueOf(arrayList7.size()));
                        startActivityForResult(intent, 4386);
                        return true;
                    } else {
                        String str14 = str11;
                        String str15 = str8;
                        String str16 = str12;
                        this.f271269V = 0;
                        if (arrayList8.size() > 0) {
                            intent.setClassName(this, str16);
                            intent.putStringArrayListExtra("CropImage_OutputPath_List", arrayList8);
                            intent.putExtra(str14, this.f271263S);
                            intent.putExtra(str15, this.f271265T);
                            intent.putExtra("CropImage_limit_Img_Size", 26214400);
                            Log.m105925i("MicroMsg.AlbumPreviewUI", "QUERY_TYPE_IMAGE_AND_VIDEO switch to SendImgProxyUI, send img size: %d", Integer.valueOf(arrayList8.size()));
                            startActivityForResult(intent, 4373);
                            return true;
                        }
                        Log.m105924i("MicroMsg.AlbumPreviewUI", "QueryTypeImageAndVideo");
                        mo128953Z7(-1, intent);
                        finish();
                        return true;
                    }
                } else {
                    ArrayList<GalleryItem$MediaItem> arrayList10 = this.f271290h.f271542g;
                    ArrayList arrayList11 = new ArrayList();
                    ArrayList arrayList12 = new ArrayList();
                    Iterator<GalleryItem$MediaItem> it7 = arrayList10.iterator();
                    while (it7.hasNext()) {
                        GalleryItem$MediaItem next4 = it7.next();
                        if (next4.getType() == 1) {
                            if (!next4.f162755o.equals(str5) || Util.isNullOrNil(next4.f162749f)) {
                                arrayList12.add(next4.f162747d);
                            } else {
                                arrayList12.add(next4.f162749f);
                            }
                        } else if (next4.getType() == 2) {
                            arrayList11.add(next4.f162747d);
                        }
                    }
                    intent.putExtra("CropImage_Compress_Img", false);
                    intent.putStringArrayListExtra("CropImage_OutputPath_List", arrayList12);
                    intent.putStringArrayListExtra("key_select_video_list", arrayList11);
                    intent.putExtra("KSelectImgUseTime", System.currentTimeMillis() - this.f271269V);
                    intent.putExtra("longitude", this.f271262R0);
                    intent.putExtra("latitude", this.f271260Q0);
                    this.f271269V = 0;
                    mo128953Z7(-1, intent);
                    finish();
                    return true;
                }
            } else if (i4 == 19) {
                intent.putStringArrayListExtra("CropImage_OutputPath_List", new ArrayList());
                mo128953Z7(-1, intent);
                finish();
                return true;
            } else {
                Log.m105924i("MicroMsg.AlbumPreviewUI", "onMenuItemClick default");
                mo128953Z7(-2, (Intent) null);
                finish();
                return true;
            }
        }
    }

    /* renamed from: W7 */
    public final void mo128950W7() {
        if (this.f271266T0) {
            C94049a aVar = this.f271290h;
            Uri uri = C93974o.f271204e;
            List<GalleryItem$MediaItem> list = C93974o.C93984j.f271235a.f271208d;
            aVar.f271542g.clear();
            aVar.f271542g.addAll(list);
            C93958f.m118752l().addAll(this.f271290h.f271542g);
            mo128958e8(this.f271290h.mo129049g0());
            String stringExtra = getIntent().getStringExtra("album_id_from_smart_gallery");
            if (Util.isNullOrNil(stringExtra)) {
                Log.m105920e("MicroMsg.AlbumPreviewUI", "album id is invalid.");
            } else {
                C93963i m = C93958f.m118753m();
                C93987b0 b0Var = new C93987b0(stringExtra, this.f271290h, this.f271292i, this.f271282d);
                ExecutorService executorService = m.f271182f;
                if (executorService != null) {
                    ((C119143b) executorService).execute(b0Var);
                }
            }
            this.f271292i.show();
        } else {
            ((C101069i) C100687b.m131710a(C100687b.f295006d)).mo140531a(1.0d);
            if (getIntent().hasExtra("gallery_report_tag")) {
                C97754e.C97756b.f286807a.mo137084c(getIntent().getIntExtra("gallery_report_tag", 3));
            } else {
                C97754e.C97756b.f286807a.mo137084c(this.f271272W0);
            }
            Log.m105925i("MicroMsg.AlbumPreviewUI", "start queryMediaInAlbums %s", this);
            C93958f.m118750j().mo128902C5(this);
            this.f271293i1 = System.currentTimeMillis();
            C93958f.m118750j().mo128911o1(this.f271246C, this.f271293i1);
            getContentView().postDelayed(new C93996p(), 300);
            C98554s sVar = C98554s.f289007d;
            sVar.mo137927a(new C60220r());
            sVar.mo137927a(new C60222v());
        }
        int i = this.f271272W0;
        if (i == 3 || i == 19 || i == 20 || i == 21 || i == 23 || i == 26) {
            C5139t.m5183e(3, 11);
        } else if (i == 4 || i == 17 || i == 31 || i == 14 || i == 22) {
            C5139t.m5183e(12, 11);
        } else if (i == 25 || i == 28 || i == 32 || i == 30) {
            C5139t.m5183e(5, 11);
        } else {
            C5139t.m5183e(22, 11);
        }
    }

    /* renamed from: X7 */
    public final void mo128951X7() {
        C93963i m = C93958f.m118753m();
        C93998x xVar = new C93998x(this);
        if (m.f271179c == null && m.f271177a != null) {
            m.f271179c = new MMHandler(m.f271177a.getLooper());
        }
        MMHandler mMHandler = m.f271179c;
        if (mMHandler != null) {
            mMHandler.post(xVar);
        } else {
            Log.m105928w("MicroMsg.GalleryHandlerThread", "other handler is null.");
        }
    }

    /* renamed from: Y7 */
    public final void mo128952Y7(GalleryItem$AlbumItem galleryItem$AlbumItem) {
        if (galleryItem$AlbumItem != null) {
            if (galleryItem$AlbumItem.f271102j) {
                this.f271280b1 = 3;
            } else {
                this.f271280b1 = 4;
            }
            String str = "";
            if (Util.nullAs(this.f271246C, str).equals(galleryItem$AlbumItem.f271096d)) {
                Log.m105928w("MicroMsg.AlbumPreviewUI", "want to reset folder, same folder, return");
                return;
            }
            C93958f.m118752l().addAll(this.f271290h.f271542g);
            Log.m105925i("MicroMsg.AlbumPreviewUI", "reset folder[%s], path[%s]", galleryItem$AlbumItem.f271096d, galleryItem$AlbumItem.mo128861e());
            String e = galleryItem$AlbumItem.mo128861e();
            this.f271245B = e;
            this.f271246C = galleryItem$AlbumItem.f271096d;
            if (Util.isNullOrNil(e)) {
                Log.m105928w("MicroMsg.AlbumPreviewUI", "reset folder path failed");
                this.f271245B = this.f271246C;
            }
            if (!Util.isNullOrNil(this.f271246C)) {
                C94049a aVar = this.f271290h;
                C94049a.C94054k kVar = this.f271297l1;
                if (kVar == null) {
                    aVar.getClass();
                    Log.m105928w("MicroMsg.AlbumAdapter", "removeHeader error, header is null");
                } else {
                    aVar.f271550r.remove(kVar);
                }
            } else if (getIntent().getBooleanExtra("show_header_view", true)) {
                C94049a aVar2 = this.f271290h;
                C94049a.C94054k kVar2 = this.f271297l1;
                if (kVar2 == null) {
                    aVar2.getClass();
                    Log.m105928w("MicroMsg.AlbumAdapter", "addHeader error, header is null");
                } else {
                    aVar2.f271550r.remove(kVar2);
                    aVar2.f271550r.add(kVar2);
                }
            }
            String str2 = galleryItem$AlbumItem.f271097e;
            if (Util.isNullOrNil(str2)) {
                int i = this.f271274X0;
                str2 = i == 3 ? getString(C0966R.string.f4z) : i == 1 ? getString(C0966R.string.f4y) : getString(C0966R.string.f360829f50);
            }
            updateActionBarOperationAreaTxt(str2);
            mo128958e8(this.f271290h.mo129049g0());
            this.f271292i.show();
            f271242w1 = System.currentTimeMillis();
            String str3 = this.f271246C;
            int i2 = this.f271274X0;
            if (str3.equals(getString(C0966R.string.f360829f50))) {
                i2 = 2;
            } else {
                str = str3;
            }
            boolean z = galleryItem$AlbumItem instanceof PrivateAlbumItem;
            if (z) {
                C93964k kVar3 = C93958f.m118750j().f271195e;
                if (kVar3 != null) {
                    ((C93946b) kVar3).f271112g = true;
                }
                this.f271293i1 = System.currentTimeMillis();
                Uri uri = C93974o.f271204e;
                C93974o.C93984j.f271235a.f271206b = true;
                String str4 = ((PrivateAlbumItem) galleryItem$AlbumItem).f271105p.f271210c;
                if (Util.isNullOrNil(str4)) {
                    Log.m105920e("MicroMsg.AlbumPreviewUI", "album id is invalid.");
                } else {
                    C93958f.m118753m().mo128896d(new C93987b0(str4, this.f271290h, this.f271292i, this.f271282d));
                }
            } else {
                C56799c0 c0Var = this.f271291h1;
                if (c0Var != null) {
                    c0Var.f162798h = true;
                }
                Uri uri2 = C93974o.f271204e;
                C93974o oVar = C93974o.C93984j.f271235a;
                oVar.f271207c = true;
                oVar.f271206b = true;
                this.f271293i1 = System.currentTimeMillis();
                C93958f.m118750j().mo128909f(str, i2, this.f271293i1);
            }
            try {
                C115669n.INSTANCE.mo160131h(18269, URLEncoder.encode(z ? "private" : "public", "utf-8"), URLEncoder.encode(galleryItem$AlbumItem.f271097e, "utf-8"));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: Z7 */
    public final void mo128953Z7(int i, Intent intent) {
        Log.m105925i("MicroMsg.AlbumPreviewUI", "setResultInternal requestCode:%s, sessionId:%s", Integer.valueOf(i), this.f271254K);
        if (Util.isNullOrNil(this.f271254K)) {
            setResult(i, intent);
            return;
        }
        C31728a aVar = C31728a.f84717a;
        String str = this.f271254K;
        C87412m.m108594g(str, "sessionId");
        StringBuilder sb = new StringBuilder();
        sb.append("dispatch: count ");
        HashMap<String, C31728a.C31729a> hashMap = C31728a.f84718b;
        sb.append(hashMap.size());
        Log.m105924i("MicroMsg.AlbumResultDispatcher", sb.toString());
        C31728a.C31729a aVar2 = hashMap.get(str);
        if (aVar2 != null) {
            aVar2.mo58325A3(str, i, intent);
        }
        aVar.mo58324a(str);
    }

    /* renamed from: a8 */
    public void mo128954a8(Boolean bool) {
        View findViewById = findViewById(C0966R.C0970id.mgd);
        if (findViewById == null || this.f271282d == null) {
            Log.m105924i("MicroMsg.AlbumPreviewUI", "[showNoPermissionView] view found null, return");
            return;
        }
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI", "showNoPermissionView", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI", "showNoPermissionView", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f271282d.setVisibility(8);
        TextView textView = (TextView) findViewById.findViewById(C0966R.C0970id.kol);
        TextView textView2 = (TextView) findViewById.findViewById(C0966R.C0970id.kzq);
        C85875k4.m106189j0(textView2.getPaint(), 0.8f);
        if (bool.booleanValue()) {
            textView.setText(C0966R.string.lsr);
            textView2.setOnClickListener(new C56806n());
            return;
        }
        textView.setText(getString(C0966R.string.lri, new Object[]{((C113177k) C86312j.m106911c(C113177k.class)).A90()}));
        textView2.setOnClickListener(new C56807o());
    }

    /* renamed from: b8 */
    public final void mo128955b8(String str) {
        if (mo128942K7()) {
            C77426q qVar = new C77426q(this);
            qVar.mo107606r(str);
            qVar.mo107602n(getString(C0966R.string.f5b));
            qVar.mo107600l(new c$$d());
            qVar.mo107603o();
        }
    }

    /* renamed from: c8 */
    public final void mo128956c8() {
        AppCompatActivity context = getContext();
        String K = C112760b.m154203K();
        if (!C96892t1.m124468h(context, K, "microMsg." + System.currentTimeMillis() + ".jpg", 4369)) {
            C76701a.makeText((Context) getContext(), (CharSequence) getString(C0966R.string.ik5), 1).show();
        } else {
            System.gc();
        }
    }

    /* renamed from: d8 */
    public void mo128957d8(int i) {
        if (i > 0) {
            this.f271257N = i;
            int i2 = this.f271272W0;
            int g0 = this.f271290h.mo129049g0();
            int i3 = this.f271257N;
            String str = this.f271275Y;
            boolean z = this.f271276Y0;
            C94049a aVar = this.f271290h;
            updateOptionMenuText(0, C101316l.m132909h(this, i2, g0, i3, str, z, aVar == null ? null : aVar.f271542g));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0130  */
    /* renamed from: e8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo128958e8(int r12) {
        /*
            r11 = this;
            java.lang.Class<hg.d> r0 = p548hg.C98450d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            hg.d r0 = (p548hg.C98450d) r0
            java.lang.String r1 = r11.f271265T
            boolean r0 = r0.mo137798ep(r1)
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x00c1
            int r0 = r11.f271257N
            r4 = 9
            if (r0 != r4) goto L_0x001b
            goto L_0x00c1
        L_0x001b:
            r4 = 300(0x12c, double:1.48E-321)
            java.lang.String r0 = "<this>"
            if (r12 > r3) goto L_0x0056
            r11.f271276Y0 = r1
            android.widget.ImageButton r6 = r11.f271321y
            r7 = 2131756874(0x7f10074a, float:1.9144668E38)
            r6.setImageResource(r7)
            android.widget.LinearLayout r6 = r11.f271319x
            ej3.p r7 = ej3.C97653p.f286458a
            ow1.f r8 = new ow1.f
            r8.<init>(r11)
            gy3.C87412m.m108594g(r6, r0)
            ej3.r r0 = new ej3.r
            r0.<init>(r7)
            r0.f123474d = r6
            boolean r6 = r0.mo71168f()
            if (r6 == 0) goto L_0x0049
            r8.invoke()
            goto L_0x00c1
        L_0x0049:
            android.view.View r6 = r0.f123474d
            if (r6 == 0) goto L_0x00c1
            ej3.d r7 = new ej3.d
            r7.<init>(r0, r4, r8)
            r6.post(r7)
            goto L_0x00c1
        L_0x0056:
            r6 = 10
            r7 = 8
            if (r12 >= r6) goto L_0x0091
            boolean r6 = r11.f271278Z0
            if (r6 != 0) goto L_0x0062
            r11.f271276Y0 = r1
        L_0x0062:
            android.widget.LinearLayout r6 = r11.f271319x
            ej3.p r8 = ej3.C97653p.f286458a
            gy3.C87412m.m108594g(r6, r0)
            ej3.q r0 = new ej3.q
            r0.<init>(r8)
            r0.f123474d = r6
            boolean r6 = r0.mo136913g()
            if (r6 == 0) goto L_0x0077
            goto L_0x0086
        L_0x0077:
            r0.mo71166f()
            android.view.View r6 = r0.f123474d
            if (r6 == 0) goto L_0x0086
            ej3.d r8 = new ej3.d
            r8.<init>(r0, r4, r2)
            r6.post(r8)
        L_0x0086:
            android.widget.LinearLayout r0 = r11.f271316v
            r0.setVisibility(r1)
            android.widget.TextView r0 = r11.f271318w
            r0.setVisibility(r7)
            goto L_0x00c1
        L_0x0091:
            r11.f271276Y0 = r3
            android.widget.LinearLayout r6 = r11.f271316v
            r6.setVisibility(r7)
            android.widget.TextView r6 = r11.f271318w
            r6.setVisibility(r1)
            android.widget.LinearLayout r6 = r11.f271319x
            ej3.p r7 = ej3.C97653p.f286458a
            gy3.C87412m.m108594g(r6, r0)
            ej3.q r0 = new ej3.q
            r0.<init>(r7)
            r0.f123474d = r6
            boolean r6 = r0.mo136913g()
            if (r6 == 0) goto L_0x00b2
            goto L_0x00c1
        L_0x00b2:
            r0.mo71166f()
            android.view.View r6 = r0.f123474d
            if (r6 == 0) goto L_0x00c1
            ej3.d r7 = new ej3.d
            r7.<init>(r0, r4, r2)
            r6.post(r7)
        L_0x00c1:
            if (r12 != 0) goto L_0x00cd
            android.widget.TextView r0 = r11.f271284e
            r0.setEnabled(r1)
            r11.enableOptionMenu(r1)
            goto L_0x0138
        L_0x00cd:
            android.widget.TextView r0 = r11.f271284e
            r0.setEnabled(r3)
            r11.enableOptionMenu(r3)
            boolean r0 = hd0.C98429r0.m127830u()
            if (r0 != 0) goto L_0x00dc
            goto L_0x012d
        L_0x00dc:
            boolean r0 = r11.f271249F
            if (r0 != 0) goto L_0x00e1
            goto L_0x012d
        L_0x00e1:
            com.tencent.mm.plugin.gallery.ui.a r0 = r11.f271290h
            if (r0 != 0) goto L_0x00e6
            goto L_0x012e
        L_0x00e6:
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r0 = r0.f271542g
            int r4 = r0.size()
            if (r4 != 0) goto L_0x00ef
            goto L_0x012e
        L_0x00ef:
            int r4 = r11.f271272W0
            r5 = 3
            if (r4 == r5) goto L_0x00f5
            goto L_0x012d
        L_0x00f5:
            java.util.Iterator r0 = r0.iterator()
        L_0x00f9:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x012d
            java.lang.Object r4 = r0.next()
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r4 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r4
            int r5 = r4.getType()
            if (r5 != r3) goto L_0x0119
            java.lang.String r5 = r4.f162747d
            long r5 = com.tencent.p014mm.vfs.C86013q1.m106451l(r5)
            r7 = 26214400(0x1900000, double:1.29516345E-316)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0119
            goto L_0x012e
        L_0x0119:
            int r5 = r4.getType()
            r6 = 2
            if (r5 != r6) goto L_0x00f9
            java.lang.String r4 = r4.f162747d
            long r4 = com.tencent.p014mm.vfs.C86013q1.m106451l(r4)
            long r6 = r11.f271271W
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x00f9
            goto L_0x012e
        L_0x012d:
            r3 = 0
        L_0x012e:
            if (r3 == 0) goto L_0x0138
            android.widget.TextView r0 = r11.f271284e
            r0.setEnabled(r1)
            r11.enableOptionMenu(r1)
        L_0x0138:
            r0 = 2131830618(0x7f11275a, float:1.9294238E38)
            if (r12 != 0) goto L_0x0143
            android.widget.TextView r3 = r11.f271284e
            r3.setText(r0)
            goto L_0x0165
        L_0x0143:
            android.widget.TextView r3 = r11.f271284e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = r11.getString(r0)
            r4.append(r0)
            java.lang.String r0 = "("
            r4.append(r0)
            r4.append(r12)
            java.lang.String r0 = ")"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.setText(r0)
        L_0x0165:
            boolean r0 = r11.f271248E
            if (r0 == 0) goto L_0x0180
            boolean r0 = r11.f271287f1
            if (r0 == 0) goto L_0x0177
            com.tencent.mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew r0 = com.tencent.p014mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew.f271075d
            com.tencent.mm.plugin.gallery.ui.a r3 = r11.f271290h
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r3 = r3.f271542g
            r0.mo128854g(r3)
            goto L_0x0180
        L_0x0177:
            fw1.c r0 = fw1.C98052c.f287486a
            com.tencent.mm.plugin.gallery.ui.a r3 = r11.f271290h
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r3 = r3.f271542g
            r0.mo137359e(r3)
        L_0x0180:
            int r5 = r11.f271272W0
            int r7 = r11.f271257N
            java.lang.String r8 = r11.f271275Y
            boolean r9 = r11.f271276Y0
            com.tencent.mm.plugin.gallery.ui.a r0 = r11.f271290h
            if (r0 != 0) goto L_0x018d
            goto L_0x018f
        L_0x018d:
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r2 = r0.f271542g
        L_0x018f:
            r10 = r2
            r4 = r11
            r6 = r12
            java.lang.String r12 = qw1.C101316l.m132909h(r4, r5, r6, r7, r8, r9, r10)
            r11.updateOptionMenuText(r1, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.mo128958e8(int):void");
    }

    public void finish() {
        getIntent().putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2469dt);
        getIntent().putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2333y);
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2469dt);
        C60960c.f173618a.mo85927k("SnsPublishProcess", "selectionPageStaytime_", Long.valueOf(getActivityBrowseTimeMs()), C60242i.APPEND);
    }

    public int getCustomBounceId() {
        return C0966R.C0970id.gqb;
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.buu;
    }

    public void initView() {
        String str;
        int i;
        e94 e94;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            for (String next : extras.keySet()) {
                Log.m105919d("MicroMsg.AlbumPreviewUI", "key=%s | value=%s", next, extras.get(next));
            }
        } else {
            Log.m105920e("MicroMsg.AlbumPreviewUI", "initView, oops! no extras data!");
        }
        this.f271275Y = getIntent().getStringExtra("album_business_tag");
        this.f271277Z = getIntent().getIntExtra("album_video_max_duration", 10);
        this.f271304p0 = getIntent().getIntExtra("album_video_min_duration", 0);
        this.f271263S = getIntent().getStringExtra("GalleryUI_FromUser");
        this.f271265T = getIntent().getStringExtra("GalleryUI_ToUser");
        this.f271257N = getIntent().getIntExtra("max_select_count", 9);
        this.f271248E = this.f271272W0 == 4;
        this.f271245B = getIntent().getStringExtra("folder_path");
        this.f271246C = getIntent().getStringExtra("folder_name");
        if (Util.isNullOrNil(this.f271245B)) {
            Log.m105929w("MicroMsg.AlbumPreviewUI", "folder path invalid, assign folderName: %s.", this.f271246C);
            this.f271245B = this.f271246C;
        }
        this.f271249F = getIntent().getBooleanExtra("key_send_raw_image", false) || getIntent().getBooleanExtra("send_raw_img", false);
        this.f271250G = getIntent().getBooleanExtra("key_force_hide_edit_image_button", false);
        this.f271251H = getIntent().getBooleanExtra("key_force_hide_edit_image_button_after_album_take_image", false);
        this.f271252I = getIntent().getBooleanExtra("key_force_show_raw_image_button", false);
        this.f271253J = getIntent().getBooleanExtra("key_is_raw_image_button_disable", false);
        this.f271255L = getIntent().getBooleanExtra("key_can_select_video_and_pic", false);
        this.f271306q = (LinearLayout) findViewById(C0966R.C0970id.bw4);
        this.f271308r = (RelativeLayout) findViewById(C0966R.C0970id.ky5);
        TextView textView = (TextView) findViewById(C0966R.C0970id.hp8);
        this.f271310s = textView;
        textView.setTextSize(0, (float) C76577a.m92155f(this, C0966R.dimen.f3927j7));
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.m5r);
        this.f271312t = textView2;
        textView2.setTextSize(0, (float) C76577a.m92155f(this, C0966R.dimen.f3723cd));
        int intExtra = getIntent().getIntExtra("KSnsFrom", -1);
        if (((C98567o0) C86312j.m106911c(C98567o0.class)).mo137589Mr() && (intExtra == 1 || intExtra == 3)) {
            LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.j7n);
            this.f271244A = linearLayout;
            linearLayout.setVisibility(0);
            this.f271244A.setOnClickListener(new C56809r());
        }
        this.f271314u = (ImageButton) findViewById(C0966R.C0970id.hp6);
        this.f271310s.setOnClickListener(new C56810s());
        if (this.f271272W0 == 3 || this.f271252I) {
            this.f271306q.setVisibility(0);
            this.f271308r.setVisibility(0);
        } else {
            this.f271306q.setVisibility(8);
            this.f271308r.setVisibility(8);
        }
        if (this.f271249F) {
            this.f271314u.setImageResource(C0966R.raw.radio_on);
            this.f271314u.setContentDescription(getResources().getString(C0966R.string.f4o));
        } else {
            this.f271314u.setImageResource(C0966R.raw.radio_off);
            this.f271314u.setContentDescription(getResources().getString(C0966R.string.f4q));
        }
        if (this.f271253J) {
            this.f271314u.setImageResource(C0966R.raw.radio_default_on);
        }
        this.f271314u.setEnabled(!this.f271253J);
        this.f271310s.setEnabled(!this.f271253J);
        this.f271314u.setOnClickListener(new C93997t());
        this.f271282d = (RecyclerView) findViewById(C0966R.C0970id.gqb);
        this.f271294j = (TextView) findViewById(C0966R.C0970id.f5770o6);
        this.f271299n = (TextView) findViewById(C0966R.C0970id.f5771o7);
        this.f271301o = (TextView) findViewById(C0966R.C0970id.f5743ne);
        TextView textView3 = (TextView) findViewById(C0966R.C0970id.gqm);
        this.f271284e = textView3;
        textView3.setTextSize(0, (float) C76577a.m92155f(this, C0966R.dimen.f3927j7));
        this.f271321y = (ImageButton) findViewById(C0966R.C0970id.czv);
        this.f271323z = (TextView) findViewById(C0966R.C0970id.det);
        this.f271316v = (LinearLayout) findViewById(C0966R.C0970id.edx);
        this.f271318w = (TextView) findViewById(C0966R.C0970id.f357455fq1);
        this.f271319x = (LinearLayout) findViewById(C0966R.C0970id.f357454fq0);
        this.f271316v.setOnClickListener(new C56811u(this));
        this.f271323z.setOnClickListener(new C56812v());
        this.f271321y.setOnClickListener(new C56813w());
        String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_smart_gallery_black_list, "");
        String lowerCase = Build.MANUFACTURER.toLowerCase();
        String lowerCase2 = C87203t.m108275k().toLowerCase();
        Log.m105925i("MicroMsg.AlbumPreviewUI", "pennqin, manufacturer: %s, model: %s, smartGalleryBlackList: %s.", lowerCase, lowerCase2, Y60);
        boolean z = !Y60.contains(lowerCase) && !Y60.contains(lowerCase2) && !"album_business_bubble_media_by_jsapi_chooseimage".equals(this.f271275Y) && !"album_business_bubble_media_by_jsapi_choosevideo".equals(this.f271275Y);
        Log.m105925i("MicroMsg.AlbumPreviewUI", "pennqin, isFromSmartGallery: %s showSmartGallery: %s.", Boolean.valueOf(this.f271266T0), Boolean.valueOf(z));
        if (this.f271266T0 || (!z && !BuildInfo.IS_FLAVOR_RED && !BuildInfo.IS_FLAVOR_PURPLE)) {
            str = "";
        } else {
            str = "";
            addTextOptionMenu(1, (String) null, this.f271295j1, (View.OnLongClickListener) null, MMActivityController.C73075r.SMART_GALLERY_SEARCH_ENTRY);
            if (this.f271281c1) {
                mo128951X7();
            }
        }
        int i2 = this.f271272W0;
        if (i2 == 0 || i2 == 5 || i2 == 10 || i2 == 11 || i2 == 24 || i2 == 27) {
            i = C0966R.C0970id.f5713ml;
            View findViewById = findViewById(C0966R.C0970id.f5713ml);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f271282d.getLayoutParams();
            layoutParams.bottomMargin = 0;
            this.f271282d.setLayoutParams(layoutParams);
            if (getBounceView() != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getBounceView().getView().getLayoutParams();
                layoutParams2.bottomMargin = 0;
                getBounceView().getView().setLayoutParams(layoutParams2);
            }
        } else {
            this.f271284e.setVisibility(0);
            this.f271284e.setOnClickListener(new C56795a());
            int i3 = this.f271274X0;
            if ((i3 == 1 || i3 == 2 || i3 == 3) && this.f271257N >= 1) {
                if (!Util.isNullOrNil(this.f271247D)) {
                    addTextOptionMenu(0, this.f271247D, this.f271295j1);
                } else {
                    int i4 = this.f271272W0;
                    int i5 = this.f271257N;
                    String str2 = this.f271275Y;
                    boolean z2 = this.f271276Y0;
                    C94049a aVar2 = this.f271290h;
                    ArrayList<GalleryItem$MediaItem> arrayList = aVar2 == null ? null : aVar2.f271542g;
                    String str3 = str2;
                    i = C0966R.C0970id.f5713ml;
                    String h = C101316l.m132909h(this, i4, 0, i5, str3, z2, arrayList);
                    int i6 = this.f271272W0;
                    if (i6 == 15) {
                        addTextOptionMenu(0, h, this.f271295j1, (View.OnLongClickListener) null, MMActivityController.C73075r.YELLOW);
                    } else if (i6 == 25) {
                        addTextOptionMenu(0, h, this.f271295j1, (View.OnLongClickListener) null, MMActivityController.C73075r.ORANGE);
                    } else if (i6 != 28) {
                        addTextOptionMenu(0, h, this.f271295j1, (View.OnLongClickListener) null, MMActivityController.C73075r.DARK_GREEN_MODE);
                    } else {
                        addTextOptionMenu(0, h, this.f271295j1, (View.OnLongClickListener) null, MMActivityController.C73075r.FINDER_LIVE);
                    }
                }
            }
            i = C0966R.C0970id.f5713ml;
        }
        ImageFolderMgrView imageFolderMgrView = (ImageFolderMgrView) findViewById(C0966R.C0970id.f49);
        this.f271303p = imageFolderMgrView;
        imageFolderMgrView.setListener(new C93986b());
        this.f271303p.setOnFolderStateChanged(new C93989c());
        ImageFolderMgrView imageFolderMgrView2 = this.f271303p;
        boolean z3 = this.f271281c1;
        imageFolderMgrView2.getClass();
        Log.m105925i("MicroMsg.ImageFolderMgrView", "attach, %s.", imageFolderMgrView2);
        C93958f.m118750j().f271191a.remove(imageFolderMgrView2);
        C93958f.m118750j().f271191a.add(imageFolderMgrView2);
        C93958f.m118750j().f271192b.remove(imageFolderMgrView2.f271360n);
        C93958f.m118750j().f271192b.add(imageFolderMgrView2.f271360n);
        if (z3) {
            C93958f.m118750j().mo128908e();
        }
        this.f271247D = getIntent().getStringExtra("send_btn_string");
        String stringExtra = getIntent().getStringExtra("album_footer_info_str");
        if (getIntent().getBooleanExtra("is_hide_album_footer", false) || !TextUtils.isEmpty(stringExtra)) {
            View findViewById2 = findViewById(i);
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!TextUtils.isEmpty(stringExtra)) {
                View findViewById3 = findViewById(C0966R.C0970id.lvr);
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(0);
                View view3 = findViewById3;
                C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((TextView) findViewById(C0966R.C0970id.lvq)).setText(stringExtra);
            }
        }
        enableOptionMenu(false);
        C62183d dVar = new C62183d(this, getContext(), 4, containUIC(C62569a.class) ? C74783i3.m89537a(this).f24705b / 2 : 0);
        this.f271282d.setLayoutManager(dVar);
        AppCompatActivity context = getContext();
        Resources resources = context.getResources();
        this.f271282d.mo17085h0(new C11773j(resources.getDimensionPixelSize(C0966R.dimen.aal), resources.getDimensionPixelSize(C0966R.dimen.aal), C111105a.m151500b(context, C0966R.color.f3496v_), false, (C11773j.C11774a) null));
        this.f271282d.mo17043c(new C56801d(dVar));
        C94049a aVar5 = new C94049a(this.f271285e1, getContext(), new C93990e());
        this.f271290h = aVar5;
        aVar5.f271549q = this.f271265T;
        aVar5.f271537D = this.f271307q1;
        if (!Util.isNullOrNil(this.f271275Y)) {
            Log.m105919d("MicroMsg.AlbumPreviewUI", "businessTag=%s", this.f271275Y);
            C94049a aVar6 = this.f271290h;
            String str4 = this.f271275Y;
            aVar6.f271546n = str4;
            aVar6.f271547o = this.f271277Z;
            if (str4.equals("album_business_bubble_media_by_coordinate")) {
                this.f271290h.f271551s = false;
                C93946b bVar = (C93946b) C93958f.m118750j().f271195e;
                bVar.f271111f = true;
                bVar.f271109d = 1000;
                this.f271320x0 = getIntent().getStringExtra("album_business_bubble_media_by_coordinate_posname");
                double doubleExtra = getIntent().getDoubleExtra("album_business_bubble_media_by_coordinate_distance", -1.0d);
                this.f271262R0 = getIntent().getDoubleExtra("album_business_bubble_media_by_coordinate_longitude", 181.0d);
                this.f271260Q0 = getIntent().getDoubleExtra("album_business_bubble_media_by_coordinate_latitude", 91.0d);
                if (doubleExtra >= 0.0d && C79995a.m97219b(this.f271262R0) && C79995a.m97218a(this.f271260Q0)) {
                    this.f271322y0 = new C93991f(doubleExtra);
                    C93970n j = C93958f.m118750j();
                    C93964k.C93966b bVar2 = this.f271322y0;
                    if (bVar2 != null) {
                        j.f271194d.add(bVar2);
                    } else {
                        j.getClass();
                    }
                }
            }
        }
        if (this.f271255L) {
            this.f271290h.f271551s = true;
        }
        this.f271297l1 = new C94049a.C94052i(0);
        if (getIntent().getBooleanExtra("show_header_view", true)) {
            C94049a aVar7 = this.f271290h;
            C94049a.C94054k kVar = this.f271297l1;
            if (kVar == null) {
                aVar7.getClass();
                Log.m105928w("MicroMsg.AlbumAdapter", "addHeader error, header is null");
            } else {
                aVar7.f271550r.remove(kVar);
                aVar7.f271550r.add(kVar);
            }
        }
        C94049a aVar8 = this.f271290h;
        aVar8.f271545j = this.f271274X0;
        aVar8.f271539d = this.f271257N;
        Log.m105924i("MicroMsg.AlbumPreviewUI", "limit count = " + this.f271257N);
        this.f271282d.setAdapter(this.f271290h);
        if (this.f271266T0) {
            setActionbarColor(getResources().getColor(C0966R.color.f3496v_));
            setMMTitle(getIntent().getStringExtra("title_from_smart_gallery"));
        } else {
            setActionbarColor(getResources().getColor(C0966R.color.f3496v_));
            initActionBarOperationArea();
            int i7 = this.f271274X0;
            if (i7 == 3) {
                initActionBarOperationAreaTxt(getString(C0966R.string.f4z));
            } else if (i7 == 1) {
                initActionBarOperationAreaTxt(getString(C0966R.string.f4y));
            } else {
                initActionBarOperationAreaTxt(getString(C0966R.string.f360829f50));
            }
        }
        setNavigationbarColor(getResources().getColor(C0966R.color.f3496v_));
        setActionBarOperationAreaClickListener(new C100568g(this));
        this.f271303p.setFolderAlbumDialogDismiss(new C94056d(this));
        setBackBtn(new C93992g(), this.f271266T0 ? C0966R.C0969drawable.f4387b5 : C0966R.raw.actionbar_icon_close_black);
        ViewGroup viewGroup = (ViewGroup) findViewById(C0966R.C0970id.iwc);
        if (viewGroup instanceof DrawedCallBackFrameLayout) {
            ((DrawedCallBackFrameLayout) viewGroup).setListener(new C93993h());
        }
        C56799c0 c0Var = new C56799c0((C56804j) null);
        this.f271291h1 = c0Var;
        c0Var.f162794d = new WeakReference<>(this.f271290h);
        this.f271291h1.f162795e = new WeakReference<>(this.f271292i);
        this.f271291h1.f162796f = new WeakReference<>(this.f271303p);
        C56799c0 c0Var2 = this.f271291h1;
        c0Var2.f162797g = this.f271279a1;
        c0Var2.f162799i = this.f271274X0;
        TextView textView4 = (TextView) findViewById(C0966R.C0970id.f5690ly);
        if (C44706b.m49450a()) {
            C44706b.m49451b(textView4, C0966R.dimen.f3635t);
        } else if (textView4 != null && C76577a.m92147C(getContext())) {
            textView4.setTextSize(0, ((float) C76577a.m92155f(getContext(), C0966R.dimen.f3635t)) * C76577a.m92161l(getContext()));
        }
        if (!this.f271248E) {
            return;
        }
        if (this.f271287f1) {
            MJTemplateHandleNew mJTemplateHandleNew = MJTemplateHandleNew.f271075d;
            MJTemplateHandleNew.f271089u = getIntent().getBooleanExtra("key_sns_publish_template", false);
            MJTemplateHandleNew.f271090v = new WeakReference<>(this);
            byte[] byteArrayExtra = getIntent().getByteArrayExtra("album_template_info");
            if (byteArrayExtra != null) {
                e94 = new e94();
                try {
                    e94.parseFrom(byteArrayExtra);
                } catch (Exception e) {
                    Log.printDebugStack("safeParser", str, e);
                }
            } else {
                e94 = null;
            }
            MJTemplateHandleNew.f271079h = e94;
            MJTemplateHandleNew.f271075d.mo128848a(this.f271289g1);
            this.f271290h.f271553u = this.f271287f1;
            return;
        }
        C98052c cVar = C98052c.f287486a;
        C60960c.C60961a aVar9 = C60960c.f173618a;
        String e2 = C24560g0.m30725a(SnsTemplateReportStruct.class).mo51262e();
        C87412m.m108591d(e2);
        aVar9.mo85925i("SnsTemplate", e2);
        C98052c.f287495j = false;
        Log.m105924i("MicroMsg.MJTemplateHandle", '[' + cVar.hashCode() + " init ui]");
        cVar.mo137355a(this);
    }

    public boolean isActionbarCenterLayoutMode() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0800, code lost:
        if (r8 < r1) goto L_0x080a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0808, code lost:
        if (r8 > r4) goto L_0x080a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x08ae, code lost:
        if (r1 == false) goto L_0x08b1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0810  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x082c  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x08da  */
    /* JADX WARNING: Removed duplicated region for block: B:350:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r25, int r26, android.content.Intent r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            super.onActivityResult(r25, r26, r27)
            r4 = 3
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r25)
            r7 = 0
            r5[r7] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r26)
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r9 = 1
            r5[r9] = r6
            r6 = 2
            r5[r6] = r0
            java.lang.String r10 = "MicroMsg.AlbumPreviewUI"
            java.lang.String r11 = "on activity result, requestCode[%d] resultCode[%d] %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r5)
            java.lang.String r5 = "preview_image_list"
            r11 = -1
            java.lang.String r12 = "isSelectAlbum"
            java.lang.String r13 = "send_raw_img"
            r14 = 4370(0x1112, float:6.124E-42)
            r15 = 4369(0x1111, float:6.122E-42)
            if (r15 != r1) goto L_0x0113
            if (r11 == r2) goto L_0x003c
            return
        L_0x003c:
            androidx.appcompat.app.AppCompatActivity r1 = r24.getContext()
            android.content.Context r1 = r1.getApplicationContext()
            java.lang.String r2 = a70.C112760b.m154240l()
            java.lang.String r1 = com.tencent.p014mm.pluginsdk.p133ui.tools.C96892t1.m124462b(r1, r3, r2)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 == 0) goto L_0x0059
            java.lang.String r1 = "take photo, but result is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r1)
            return
        L_0x0059:
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r2[r7] = r1
            java.lang.String r4 = "take photo, result[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r4, r2)
            int r2 = r0.f271272W0
            if (r2 == 0) goto L_0x00e4
            r4 = 5
            if (r2 == r4) goto L_0x00e4
            r4 = 11
            if (r2 == r4) goto L_0x00e4
            r4 = 24
            if (r2 != r4) goto L_0x0073
            goto L_0x00e4
        L_0x0073:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r9)
            r2.add(r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.gallery.ui.ImagePreviewUI> r4 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.class
            r1.<init>(r0, r4)
            java.lang.String r4 = "isTakePhoto"
            r1.putExtra(r4, r9)
            java.lang.String r4 = "max_select_count"
            r1.putExtra(r4, r9)
            boolean r4 = r0.f271249F
            r1.putExtra(r13, r4)
            boolean r4 = r0.f271276Y0
            r1.putExtra(r12, r4)
            boolean r4 = r0.f271250G
            if (r4 != 0) goto L_0x00a3
            boolean r4 = r0.f271251H
            if (r4 == 0) goto L_0x00a1
            goto L_0x00a3
        L_0x00a1:
            r4 = 0
            goto L_0x00a4
        L_0x00a3:
            r4 = 1
        L_0x00a4:
            java.lang.String r6 = "key_force_hide_edit_image_button"
            r1.putExtra(r6, r4)
            boolean r4 = r0.f271252I
            java.lang.String r6 = "key_force_show_raw_image_button"
            r1.putExtra(r6, r4)
            boolean r4 = r0.f271253J
            java.lang.String r6 = "key_is_raw_image_button_disable"
            r1.putExtra(r6, r4)
            r1.putStringArrayListExtra(r5, r2)
            com.tencent.mm.plugin.gallery.ui.a r2 = r0.f271290h
            if (r2 == 0) goto L_0x00c9
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r2 = r2.f271542g
            java.lang.String r4 = "preview_media_item_list"
            r1.putParcelableArrayListExtra(r4, r2)
        L_0x00c9:
            java.lang.String r2 = r0.f271263S
            java.lang.String r4 = "GalleryUI_FromUser"
            r1.putExtra(r4, r2)
            java.lang.String r2 = r0.f271265T
            java.lang.String r4 = "GalleryUI_ToUser"
            r1.putExtra(r4, r2)
            int r2 = r0.f271280b1
            java.lang.String r4 = "select_type_tag"
            r1.putExtra(r4, r2)
            r0.startActivityForResult((android.content.Intent) r1, (int) r14)
            goto L_0x08cd
        L_0x00e4:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "file://"
            r4.append(r5)
            java.lang.String r1 = android.net.Uri.encode(r1)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r2.setData(r1)
            java.lang.String r1 = "take photo finish"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            r0.mo128953Z7(r11, r2)
            r24.finish()
            goto L_0x08cd
        L_0x0113:
            java.lang.String r15 = "GalleryUI_IsSendImgBackground"
            java.lang.String r4 = "CropImage_OutputPath_List"
            if (r14 != r1) goto L_0x0154
            if (r11 == r2) goto L_0x011c
            return
        L_0x011c:
            boolean r1 = r3.getBooleanExtra(r15, r7)
            if (r1 == 0) goto L_0x012f
            java.lang.String r1 = "test onActivityResult"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            r0.mo128953Z7(r11, r3)
            r24.finish()
            return
        L_0x012f:
            java.util.ArrayList r1 = r3.getStringArrayListExtra(r4)
            if (r1 == 0) goto L_0x014d
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x013c
            goto L_0x014d
        L_0x013c:
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r2[r7] = r1
            java.lang.String r1 = "gallery photo:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r2)
            r0.mo128953Z7(r11, r3)
            r24.finish()
            goto L_0x08cd
        L_0x014d:
            java.lang.String r1 = "send filepath is null or nil"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r1)
            return
        L_0x0154:
            r14 = 4371(0x1113, float:6.125E-42)
            if (r14 != r1) goto L_0x0173
            if (r11 == r2) goto L_0x015b
            return
        L_0x015b:
            if (r3 == 0) goto L_0x0162
            java.lang.String r1 = "from_record"
            r3.putExtra(r1, r9)
        L_0x0162:
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r7] = r3
            java.lang.String r2 = "custom record video, result[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r2, r1)
            r0.mo128953Z7(r11, r3)
            r24.finish()
            goto L_0x08cd
        L_0x0173:
            r14 = 4372(0x1114, float:6.126E-42)
            java.lang.String r6 = "key_select_video_list"
            if (r14 != r1) goto L_0x01ba
            if (r11 == r2) goto L_0x017d
            return
        L_0x017d:
            if (r3 != 0) goto L_0x0185
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            goto L_0x0186
        L_0x0185:
            r1 = r3
        L_0x0186:
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r2[r7] = r1
            java.lang.String r3 = "system record video, result[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.content.Intent r3 = r24.getIntent()
            java.lang.String r4 = "video_full_path"
            java.lang.String r3 = r3.getStringExtra(r4)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 != 0) goto L_0x01b2
            r2.add(r3)
            r1.putExtra(r6, r2)
            java.lang.String r2 = "key_selected_video_is_from_sys_camera"
            r1.putExtra(r2, r9)
        L_0x01b2:
            r0.mo128953Z7(r11, r1)
            r24.finish()
            goto L_0x08ce
        L_0x01ba:
            r14 = 4373(0x1115, float:6.128E-42)
            java.lang.String r7 = "send img background, data is null!!"
            if (r14 != r1) goto L_0x01d8
            if (r3 == 0) goto L_0x01c9
            r3.putExtra(r15, r9)
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r7)
        L_0x01c9:
            java.lang.String r1 = "Request code sendimg proxy"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            r0.mo128953Z7(r11, r3)
            r0.f271258P = r9
            r24.finish()
            goto L_0x08cd
        L_0x01d8:
            r14 = 4378(0x111a, float:6.135E-42)
            java.lang.String r9 = "sight capture record video, result[%s]"
            java.lang.String r11 = "KSEGMENTMEDIAINFO"
            r16 = r12
            java.lang.String r12 = "sight capture result is null!"
            r17 = r5
            r5 = 0
            if (r14 != r1) goto L_0x024a
            r14 = -1
            if (r14 == r2) goto L_0x01ed
            return
        L_0x01ed:
            if (r3 != 0) goto L_0x01f5
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            goto L_0x01f6
        L_0x01f5:
            r1 = r3
        L_0x01f6:
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r7 = 0
            r3[r7] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r9, r3)
            android.os.Parcelable r3 = r1.getParcelableExtra(r11)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r3 = (com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.CaptureVideoNormalModel) r3
            if (r3 != 0) goto L_0x0211
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r12)
            r0.mo128953Z7(r2, r5)
            r24.finish()
            return
        L_0x0211:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r5 = r3.f272894e
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r7 != 0) goto L_0x0224
            r2.add(r5)
            r1.putExtra(r6, r2)
        L_0x0224:
            java.lang.Boolean r2 = r3.f272897h
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0241
            java.lang.String r2 = r3.f272895f
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0241
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r3 = r3.f272895f
            r2.add(r3)
            r1.putStringArrayListExtra(r4, r2)
        L_0x0241:
            r14 = -1
            r0.mo128953Z7(r14, r1)
            r24.finish()
            goto L_0x08ce
        L_0x024a:
            r14 = -1
            r5 = 4375(0x1117, float:6.13E-42)
            r19 = r7
            java.lang.String r7 = "key_req_result"
            if (r5 != r1) goto L_0x02b1
            if (r14 == r2) goto L_0x0257
            return
        L_0x0257:
            if (r3 != 0) goto L_0x025f
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            goto L_0x0260
        L_0x025f:
            r1 = r3
        L_0x0260:
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r5 = 0
            r3[r5] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r9, r3)
            android.os.Parcelable r3 = r1.getParcelableExtra(r7)
            com.tencent.mm.plugin.mmsight.SightCaptureResult r3 = (com.tencent.p014mm.plugin.mmsight.SightCaptureResult) r3
            if (r3 != 0) goto L_0x027c
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r12)
            r1 = 0
            r0.mo128953Z7(r2, r1)
            r24.finish()
            return
        L_0x027c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r5 = r3.f201517g
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r7 != 0) goto L_0x028f
            r2.add(r5)
            r1.putExtra(r6, r2)
        L_0x028f:
            boolean r2 = r3.f201515e
            if (r2 == 0) goto L_0x02a8
            java.lang.String r2 = r3.f201523p
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x02a8
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r3 = r3.f201523p
            r2.add(r3)
            r1.putStringArrayListExtra(r4, r2)
        L_0x02a8:
            r5 = -1
            r0.mo128953Z7(r5, r1)
            r24.finish()
            goto L_0x08ce
        L_0x02b1:
            r5 = -1
            r9 = 4376(0x1118, float:6.132E-42)
            if (r9 != r1) goto L_0x02e2
            if (r5 == r2) goto L_0x02c2
            java.lang.String r1 = "REQUEST_SELECT_FOLDER goBack!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            r24.finish()
            goto L_0x08cd
        L_0x02c2:
            if (r3 == 0) goto L_0x08cd
            java.lang.String r1 = "select_folder_name"
            android.os.Parcelable r1 = r3.getParcelableExtra(r1)
            com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem r1 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$AlbumItem) r1
            r0.mo128952Y7(r1)
            java.lang.String r1 = r1.f271096d
            r2 = 2131830589(0x7f11273d, float:1.929418E38)
            java.lang.String r2 = r0.getString(r2)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r2)
            r0.setMMTitle((java.lang.String) r1)
            goto L_0x08cd
        L_0x02e2:
            r5 = 4377(0x1119, float:6.133E-42)
            if (r5 != r1) goto L_0x02f1
            r5 = -1
            if (r2 != r5) goto L_0x08cd
            r0.mo128953Z7(r5, r3)
            r24.finish()
            goto L_0x08cd
        L_0x02f1:
            java.lang.String r5 = ""
            java.lang.String r9 = "KSEGMENTVIDEOTHUMBPATH"
            java.lang.String r12 = "K_SEGMENTVIDEOPATH"
            java.lang.String r14 = "key_extra_data"
            r20 = r4
            r4 = 4379(0x111b, float:6.136E-42)
            r21 = r15
            java.lang.String r15 = "KSEGMENTMEDIAEDITID"
            r22 = r7
            r7 = -2
            if (r1 != r4) goto L_0x037d
            r4 = -1
            if (r2 != r4) goto L_0x0363
            if (r3 == 0) goto L_0x0363
            android.os.Parcelable r1 = r3.getParcelableExtra(r11)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r1 = (com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.CaptureVideoNormalModel) r1
            android.os.Bundle r4 = r3.getBundleExtra(r14)
            r3.putExtra(r14, r4)
            java.lang.String r4 = r1.f272894e
            r3.putExtra(r12, r4)
            java.lang.String r4 = r1.f272895f
            r3.putExtra(r9, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo r6 = r1.mo129798a()
            r8 = -1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            java.lang.String r8 = "KEY_EDIT_PUBLISHID_INT"
            java.lang.Object r6 = r6.mo129811b(r8, r9)
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.putExtra(r15, r4)
            java.lang.Class<hy.o0> r4 = p166hy.C98567o0.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            hy.o0 r4 = (p166hy.C98567o0) r4
            java.lang.String r1 = r1.f272894e
            android.os.Bundle r5 = r3.getBundleExtra(r14)
            java.lang.String r6 = "key_edit_safe_strategy_emotion_info_list"
            r4.mo137592an(r1, r5, r6)
            r1 = 1
            r0.f271288g = r1
            r1 = -1
            r0.mo128953Z7(r1, r3)
            r24.finish()
            goto L_0x0368
        L_0x0363:
            if (r2 != r7) goto L_0x0368
            r24.finish()
        L_0x0368:
            if (r2 == 0) goto L_0x036c
            if (r7 != r2) goto L_0x08cd
        L_0x036c:
            java.lang.String r1 = r0.f271317v1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x08cd
            ew1.e r1 = ew1.C97754e.C97756b.f286807a
            java.lang.String r2 = r0.f271317v1
            r1.mo137082a(r2)
            goto L_0x08cd
        L_0x037d:
            r4 = 4383(0x111f, float:6.142E-42)
            java.lang.String r7 = "key_select_image_list"
            if (r1 != r4) goto L_0x03db
            r4 = -1
            if (r2 != r4) goto L_0x03c0
            if (r3 == 0) goto L_0x03c0
            android.os.Parcelable r1 = r3.getParcelableExtra(r11)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r1 = (com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.CaptureVideoNormalModel) r1
            android.os.Bundle r4 = r3.getBundleExtra(r14)
            r3.putExtra(r14, r4)
            java.lang.String r4 = r1.f272894e
            r3.putExtra(r12, r4)
            java.lang.String r1 = r1.f272895f
            r3.putExtra(r9, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r0.f271257N
            int[] r5 = new int[r5]
            r0.mo128945N7(r1, r4, r5)
            r3.putStringArrayListExtra(r6, r4)
            r3.putStringArrayListExtra(r7, r1)
            r1 = -1
            r0.mo128953Z7(r1, r3)
            r24.finish()
            r1 = -2
            goto L_0x03c6
        L_0x03c0:
            r1 = -2
            if (r2 != r1) goto L_0x03c6
            r24.finish()
        L_0x03c6:
            if (r2 == 0) goto L_0x03ca
            if (r1 != r2) goto L_0x08cd
        L_0x03ca:
            java.lang.String r1 = r0.f271317v1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x08cd
            ew1.e r1 = ew1.C97754e.C97756b.f286807a
            java.lang.String r2 = r0.f271317v1
            r1.mo137082a(r2)
            goto L_0x08cd
        L_0x03db:
            r4 = 4382(0x111e, float:6.14E-42)
            r11 = 2131756874(0x7f10074a, float:1.9144668E38)
            if (r4 != r1) goto L_0x04df
            java.lang.String r1 = "back from smart gallery."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            if (r3 == 0) goto L_0x046c
            android.os.Bundle r1 = r27.getExtras()
            boolean r4 = r0.f271249F
            boolean r4 = r3.getBooleanExtra(r13, r4)
            r0.f271249F = r4
            if (r4 == 0) goto L_0x0410
            android.widget.ImageButton r4 = r0.f271314u
            r5 = 2131756876(0x7f10074c, float:1.9144672E38)
            r4.setImageResource(r5)
            android.widget.ImageButton r4 = r0.f271314u
            android.content.res.Resources r5 = r24.getResources()
            r6 = 2131830560(0x7f112720, float:1.929412E38)
            java.lang.String r5 = r5.getString(r6)
            r4.setContentDescription(r5)
            goto L_0x0425
        L_0x0410:
            android.widget.ImageButton r4 = r0.f271314u
            r4.setImageResource(r11)
            android.widget.ImageButton r4 = r0.f271314u
            android.content.res.Resources r5 = r24.getResources()
            r6 = 2131830562(0x7f112722, float:1.9294125E38)
            java.lang.String r5 = r5.getString(r6)
            r4.setContentDescription(r5)
        L_0x0425:
            boolean r4 = r0.f271253J
            if (r4 == 0) goto L_0x0431
            android.widget.ImageButton r4 = r0.f271314u
            r5 = 2131756872(0x7f100748, float:1.9144664E38)
            r4.setImageResource(r5)
        L_0x0431:
            android.widget.ImageButton r4 = r0.f271314u
            boolean r5 = r0.f271253J
            r6 = 1
            r5 = r5 ^ r6
            r4.setEnabled(r5)
            android.widget.TextView r4 = r0.f271310s
            boolean r5 = r0.f271253J
            r5 = r5 ^ r6
            r4.setEnabled(r5)
            if (r1 == 0) goto L_0x046c
            java.util.Set r4 = r1.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x044c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x046c
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r6 = 0
            r7[r6] = r5
            java.lang.Object r5 = r1.get(r5)
            r6 = 1
            r7[r6] = r5
            java.lang.String r5 = "key: %s, value: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r5, r7)
            goto L_0x044c
        L_0x046c:
            r6 = 1
            r1 = -2
            if (r1 == r2) goto L_0x0482
            if (r2 == 0) goto L_0x0482
            if (r6 != r2) goto L_0x0475
            goto L_0x0482
        L_0x0475:
            r1 = -1
            if (r1 != r2) goto L_0x047a
            r0.f271288g = r6
        L_0x047a:
            r0.mo128953Z7(r2, r3)
            r24.finish()
            goto L_0x08cd
        L_0x0482:
            java.lang.String r1 = "just back from SmartGalleryUI."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            u.d r1 = new u.d
            r1.<init>()
            r7 = 0
        L_0x048e:
            com.tencent.mm.plugin.gallery.ui.a r3 = r0.f271290h
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r3 = r3.f271542g
            int r3 = r3.size()
            if (r7 >= r3) goto L_0x04b7
            com.tencent.mm.plugin.gallery.ui.a r3 = r0.f271290h
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r3 = r3.f271542g
            java.lang.Object r3 = r3.get(r7)
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r3 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r3
            com.tencent.mm.plugin.gallery.ui.a r4 = r0.f271290h
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r4 = r4.f271541f
            int r3 = r4.indexOf(r3)
            r4 = -1
            if (r3 == r4) goto L_0x04b4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.add(r3)
        L_0x04b4:
            int r7 = r7 + 1
            goto L_0x048e
        L_0x04b7:
            com.tencent.mm.plugin.gallery.ui.a r3 = r0.f271290h
            android.net.Uri r4 = com.tencent.p014mm.plugin.gallery.model.C93974o.f271204e
            com.tencent.mm.plugin.gallery.model.o r4 = com.tencent.p014mm.plugin.gallery.model.C93974o.C93984j.f271235a
            java.util.List<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r4 = r4.f271208d
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r5 = r3.f271542g
            r5.clear()
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r3 = r3.f271542g
            r3.addAll(r4)
            r3 = 1
            if (r3 != r2) goto L_0x04d0
            r24.mo77422V7()
            goto L_0x04de
        L_0x04d0:
            com.tencent.mm.plugin.gallery.ui.a r2 = r0.f271290h
            int r2 = r2.mo129049g0()
            r0.mo128958e8(r2)
            com.tencent.mm.plugin.gallery.ui.a r2 = r0.f271290h
            r2.mo129041N5(r1)
        L_0x04de:
            return
        L_0x04df:
            r4 = 4381(0x111d, float:6.139E-42)
            r13 = 10
            r11 = 22
            if (r1 != r4) goto L_0x0571
            r4 = -1
            if (r2 != r4) goto L_0x0564
            boolean r1 = r0.f271248E
            if (r1 == 0) goto L_0x0554
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r1 = com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider.m119434d(r5, r5)
            android.content.Intent r2 = r24.getIntent()
            java.lang.String r3 = "key_edit_video_max_time_length"
            int r2 = r2.getIntExtra(r3, r13)
            int r2 = r2 * 1000
            r1.f272935w = r2
            r2 = 2
            r1.f272905F = r2
            com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo r2 = new com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo
            r2.<init>()
            r3 = 1
            r2.f272940d = r3
            r1.f272908I = r2
            com.tencent.mm.component.api.jumper.UICustomParam r2 = new com.tencent.mm.component.api.jumper.UICustomParam
            r2.<init>()
            java.util.Map<java.lang.String, java.lang.Boolean> r3 = r2.f266575h
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.String r4 = "plugin_filter"
            r3.put(r4, r8)
            java.util.Map<java.lang.String, java.lang.Boolean> r3 = r2.f266575h
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.String r4 = "plugin_poi"
            r3.put(r4, r8)
            java.util.Map<java.lang.String, java.lang.Boolean> r3 = r2.f266575h
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.String r4 = "plugin_tip"
            r3.put(r4, r8)
            java.util.Map<java.lang.String, java.lang.Boolean> r3 = r2.f266575h
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.String r4 = "plugin_menu"
            r3.put(r4, r8)
            r1.f272927o = r2
            hh2.a r16 = hh2.C8532a.f27585a
            androidx.appcompat.app.AppCompatActivity r17 = r24.getContext()
            r18 = 4379(0x111b, float:6.136E-42)
            r19 = 2130772171(0x7f0100cb, float:1.7147453E38)
            r20 = -1
            r22 = 4
            r23 = 0
            r21 = r1
            r16.mo9446e(r17, r18, r19, r20, r21, r22, r23)
            return
        L_0x0554:
            com.tencent.mm.plugin.gallery.model.n r1 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
            int r1 = r1.f271196f
            if (r11 != r1) goto L_0x08cd
            r4 = -1
            r0.mo128953Z7(r4, r3)
            r24.finish()
            return
        L_0x0564:
            r1 = 2131832195(0x7f112d83, float:1.9297437E38)
            r5 = 1
            android.widget.Toast r1 = p910lj.C76701a.makeText((android.content.Context) r0, (int) r1, (int) r5)
            r1.show()
            goto L_0x08cd
        L_0x0571:
            r4 = -1
            r5 = 1
            r8 = 17
            if (r1 != r8) goto L_0x05c4
            if (r2 == r4) goto L_0x057b
            goto L_0x08cd
        L_0x057b:
            int r1 = r0.f271272W0
            java.lang.String r2 = "query_source_type"
            r3.putExtra(r2, r1)
            java.lang.String r1 = "isSightCapture"
            r3.putExtra(r1, r5)
            r1 = r22
            android.os.Parcelable r1 = r3.getParcelableExtra(r1)
            com.tencent.mm.plugin.mmsight.SightCaptureResult r1 = (com.tencent.p014mm.plugin.mmsight.SightCaptureResult) r1
            if (r1 == 0) goto L_0x05be
            boolean r2 = r1.f201515e
            if (r2 == 0) goto L_0x05b7
            com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem r2 = new com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem
            r2.<init>()
            java.lang.String r1 = r1.f201523p
            r2.f162747d = r1
            com.tencent.mm.plugin.gallery.ui.a r1 = r0.f271290h
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r1 = r1.f271542g
            int r1 = r1.size()
            r4 = 9
            if (r1 >= r4) goto L_0x05b3
            com.tencent.mm.plugin.gallery.ui.a r1 = r0.f271290h
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r1 = r1.f271542g
            r1.add(r2)
        L_0x05b3:
            r24.mo77422V7()
            goto L_0x05be
        L_0x05b7:
            r1 = -1
            r0.mo128953Z7(r1, r3)
            r24.finish()
        L_0x05be:
            r1 = 0
            r0.overridePendingTransition(r1, r1)
            goto L_0x08cd
        L_0x05c4:
            r4 = 4384(0x1120, float:6.143E-42)
            if (r1 != r4) goto L_0x0645
            java.lang.String r1 = "REQUEST_CODE_TEMPLATE_VIDEO callback "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            if (r3 == 0) goto L_0x08cd
            java.lang.String r1 = "key_export_video_path"
            java.lang.String r1 = r3.getStringExtra(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x05e6
            java.lang.String r1 = "template video path is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r1)
            r24.finish()
            return
        L_0x05e6:
            android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x0638 }
            r2.<init>()     // Catch:{ Exception -> 0x0638 }
            java.lang.String r4 = "KSightPath"
            r2.putExtra(r4, r1)     // Catch:{ Exception -> 0x0638 }
            hi2.e r2 = hi2.C32925e.f89499a     // Catch:{ Exception -> 0x0638 }
            java.lang.String r4 = "other"
            r5 = 0
            java.lang.String r2 = r2.mo58863c(r4, r5)     // Catch:{ Exception -> 0x0638 }
            android.graphics.Bitmap r4 = f72.C97842b.m126300q(r1)     // Catch:{ Exception -> 0x0638 }
            r5 = 60
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0638 }
            r7 = 1
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r4, r5, r6, r2, r7)     // Catch:{ Exception -> 0x0638 }
            android.os.Bundle r4 = r3.getBundleExtra(r14)     // Catch:{ Exception -> 0x0638 }
            r3.putExtra(r14, r4)     // Catch:{ Exception -> 0x0638 }
            r3.putExtra(r12, r1)     // Catch:{ Exception -> 0x0638 }
            r3.putExtra(r9, r2)     // Catch:{ Exception -> 0x0638 }
            java.lang.Class<hy.s0> r2 = p166hy.C8830s0.class
            di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x0638 }
            hy.s0 r2 = (p166hy.C8830s0) r2     // Catch:{ Exception -> 0x0638 }
            java.lang.String r2 = r2.N00()     // Catch:{ Exception -> 0x0638 }
            r3.putExtra(r15, r2)     // Catch:{ Exception -> 0x0638 }
            boolean r2 = r0.f271287f1     // Catch:{ Exception -> 0x0638 }
            if (r2 == 0) goto L_0x062c
            com.tencent.mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew r2 = com.tencent.p014mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew.f271075d     // Catch:{ Exception -> 0x0638 }
            r2.mo128852e()     // Catch:{ Exception -> 0x0638 }
            goto L_0x0631
        L_0x062c:
            fw1.c r2 = fw1.C98052c.f287486a     // Catch:{ Exception -> 0x0638 }
            r2.mo137358d()     // Catch:{ Exception -> 0x0638 }
        L_0x0631:
            r2 = -1
            r0.mo128953Z7(r2, r3)     // Catch:{ Exception -> 0x0638 }
            r24.finish()     // Catch:{ Exception -> 0x0638 }
        L_0x0638:
            r4 = 1
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r5 = 0
            r2[r5] = r1
            java.lang.String r1 = "REQUEST_CODE_TEMPLATE_VIDEO path:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r2)
            goto L_0x08cd
        L_0x0645:
            r4 = 1
            r5 = 4386(0x1122, float:6.146E-42)
            if (r1 != r5) goto L_0x065d
            if (r3 == 0) goto L_0x0656
            r1 = r21
            r3.putExtra(r1, r4)
            r1 = r19
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r1)
        L_0x0656:
            r0.f271258P = r4
            r24.finish()
            goto L_0x08cd
        L_0x065d:
            r1 = -2
            if (r2 == r1) goto L_0x08c5
            r1 = -1
            if (r2 == r1) goto L_0x079d
            if (r2 == 0) goto L_0x0673
            r1 = 25
            if (r2 == r1) goto L_0x066b
            goto L_0x08cd
        L_0x066b:
            r0.mo128953Z7(r2, r3)
            r24.finish()
            goto L_0x08cd
        L_0x0673:
            if (r3 == 0) goto L_0x08cd
            r1 = r17
            java.util.ArrayList r1 = r3.getStringArrayListExtra(r1)
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]
            if (r1 != 0) goto L_0x0682
            r2 = 0
            goto L_0x0686
        L_0x0682:
            int r2 = r1.size()
        L_0x0686:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5 = 0
            r4[r5] = r2
            java.lang.String r2 = "paths size: %d."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r2, r4)
            if (r1 == 0) goto L_0x06e8
            com.tencent.mm.plugin.gallery.ui.a r2 = r0.f271290h
            if (r2 == 0) goto L_0x06e8
            u.d r2 = new u.d
            r2.<init>()
            r4 = 0
        L_0x069f:
            com.tencent.mm.plugin.gallery.ui.a r5 = r0.f271290h
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r5 = r5.f271542g
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x06c8
            com.tencent.mm.plugin.gallery.ui.a r5 = r0.f271290h
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r5 = r5.f271542g
            java.lang.Object r5 = r5.get(r4)
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r5 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r5
            com.tencent.mm.plugin.gallery.ui.a r6 = r0.f271290h
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r6 = r6.f271541f
            int r5 = r6.indexOf(r5)
            r6 = -1
            if (r5 == r6) goto L_0x06c5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2.add(r5)
        L_0x06c5:
            int r4 = r4 + 1
            goto L_0x069f
        L_0x06c8:
            com.tencent.mm.plugin.gallery.ui.a r4 = r0.f271290h
            java.util.ArrayList r5 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118751k()
            if (r5 == 0) goto L_0x06d5
            java.util.ArrayList r5 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118751k()
            goto L_0x06d9
        L_0x06d5:
            com.tencent.mm.plugin.gallery.ui.a r5 = r0.f271290h
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r5 = r5.f271541f
        L_0x06d9:
            r4.mo129044P5(r1, r5)
            com.tencent.mm.plugin.gallery.ui.a r4 = r0.f271290h
            r4.mo129041N5(r2)
            int r1 = r1.size()
            r0.mo128958e8(r1)
        L_0x06e8:
            java.lang.String r1 = "CropImage_Compress_Img"
            r2 = 1
            boolean r1 = r3.getBooleanExtra(r1, r2)
            r1 = r1 ^ r2
            r0.f271249F = r1
            boolean r1 = hd0.C98429r0.m127830u()
            if (r1 == 0) goto L_0x0706
            int r1 = r0.f271272W0
            r2 = 3
            if (r1 != r2) goto L_0x0706
            com.tencent.mm.plugin.gallery.ui.a r1 = r0.f271290h
            boolean r2 = r0.f271249F
            r1.f271548p = r2
            r1.notifyDataSetChanged()
        L_0x0706:
            boolean r1 = r0.f271249F
            r2 = 8
            if (r1 == 0) goto L_0x0761
            android.widget.ImageButton r1 = r0.f271314u
            r4 = 2131756876(0x7f10074c, float:1.9144672E38)
            r1.setImageResource(r4)
            android.widget.ImageButton r1 = r0.f271314u
            android.content.res.Resources r4 = r24.getResources()
            r5 = 2131830560(0x7f112720, float:1.929412E38)
            java.lang.String r4 = r4.getString(r5)
            r1.setContentDescription(r4)
            boolean r1 = hd0.C98429r0.m127830u()
            if (r1 == 0) goto L_0x075b
            int r1 = r0.f271272W0
            r4 = 3
            if (r1 == r4) goto L_0x0733
            r4 = 16
            if (r1 != r4) goto L_0x075b
        L_0x0733:
            boolean r1 = r0.f271249F
            if (r1 == 0) goto L_0x075b
            java.lang.String r1 = r24.mo128944M7()
            android.widget.TextView r4 = r0.f271312t
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r5 == 0) goto L_0x0744
            goto L_0x0745
        L_0x0744:
            r2 = 0
        L_0x0745:
            r4.setVisibility(r2)
            android.widget.TextView r2 = r0.f271312t
            r4 = 2131830576(0x7f112730, float:1.9294153E38)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r5 = 0
            r6[r5] = r1
            java.lang.String r1 = r0.getString(r4, r6)
            r2.setText(r1)
            goto L_0x077e
        L_0x075b:
            android.widget.TextView r1 = r0.f271312t
            r1.setVisibility(r2)
            goto L_0x077e
        L_0x0761:
            android.widget.ImageButton r1 = r0.f271314u
            r4 = 2131756874(0x7f10074a, float:1.9144668E38)
            r1.setImageResource(r4)
            android.widget.ImageButton r1 = r0.f271314u
            android.content.res.Resources r4 = r24.getResources()
            r5 = 2131830562(0x7f112722, float:1.9294125E38)
            java.lang.String r4 = r4.getString(r5)
            r1.setContentDescription(r4)
            android.widget.TextView r1 = r0.f271312t
            r1.setVisibility(r2)
        L_0x077e:
            boolean r1 = r0.f271253J
            if (r1 == 0) goto L_0x078a
            android.widget.ImageButton r1 = r0.f271314u
            r2 = 2131756872(0x7f100748, float:1.9144664E38)
            r1.setImageResource(r2)
        L_0x078a:
            android.widget.ImageButton r1 = r0.f271314u
            boolean r2 = r0.f271253J
            r4 = 1
            r2 = r2 ^ r4
            r1.setEnabled(r2)
            android.widget.TextView r1 = r0.f271310s
            boolean r2 = r0.f271253J
            r2 = r2 ^ r4
            r1.setEnabled(r2)
            goto L_0x08cd
        L_0x079d:
            r2 = r16
            r1 = 0
            r4 = 1
            boolean r2 = r3.getBooleanExtra(r2, r1)
            if (r2 == 0) goto L_0x07ae
            r0.f271288g = r4
            r24.finish()
            goto L_0x08cd
        L_0x07ae:
            r2 = r20
            java.util.ArrayList r2 = r3.getStringArrayListExtra(r2)
            int r4 = r0.f271272W0
            r5 = 28
            if (r4 != r5) goto L_0x0853
            int r4 = r2.size()
            if (r4 <= 0) goto L_0x0853
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            android.content.Intent r1 = r24.getIntent()
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.String r5 = "album_min_ratio_limit"
            float r1 = r1.getFloatExtra(r5, r4)
            android.content.Intent r5 = r24.getIntent()
            java.lang.String r6 = "album_max_ratio_limit"
            float r4 = r5.getFloatExtra(r6, r4)
            r5 = 0
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x07e5
            int r7 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x080d
        L_0x07e5:
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x080c }
            r7.<init>()     // Catch:{ all -> 0x080c }
            r8 = 1
            r7.inJustDecodeBounds = r8     // Catch:{ all -> 0x080c }
            com.tencent.p014mm.graphics.MMBitmapFactory.m98735d(r2, r7)     // Catch:{ all -> 0x080c }
            int r8 = r7.outWidth     // Catch:{ all -> 0x080c }
            int r7 = r7.outHeight     // Catch:{ all -> 0x080c }
            if (r8 == 0) goto L_0x080a
            if (r7 != 0) goto L_0x07f9
            goto L_0x080a
        L_0x07f9:
            float r8 = (float) r8
            float r7 = (float) r7
            float r8 = r8 / r7
            if (r6 < 0) goto L_0x0802
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x080a
        L_0x0802:
            int r1 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x080d
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x080d
        L_0x080a:
            r1 = 0
            goto L_0x080e
        L_0x080c:
        L_0x080d:
            r1 = 1
        L_0x080e:
            if (r1 != 0) goto L_0x082c
            java.lang.String r1 = "not support ratio"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            android.content.res.Resources r1 = r24.getResources()
            r2 = 2131830645(0x7f112775, float:1.9294293E38)
            java.lang.String r1 = r1.getString(r2)
            if (r1 == 0) goto L_0x08cd
            androidx.appcompat.app.AppCompatActivity r2 = r24.getContext()
            nj3.C76879j.m92726T(r2, r1)
            goto L_0x08cd
        L_0x082c:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            int r4 = r0.f271272W0
            if (r4 != r13) goto L_0x083a
            java.lang.String r4 = "CropImage_OutputPath"
            r1.putExtra(r4, r2)
        L_0x083a:
            java.lang.String r2 = android.net.Uri.encode(r2)
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1.setData(r2)
            java.lang.String r2 = "getItem ok"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            r2 = -1
            r0.mo128953Z7(r2, r1)
            r24.finish()
            goto L_0x08cd
        L_0x0853:
            int r1 = r0.f271272W0
            if (r1 != r11) goto L_0x08b1
            boolean r1 = r0.f271268U0
            if (r1 == 0) goto L_0x08b1
            java.util.ArrayList r1 = r3.getStringArrayListExtra(r6)
            if (r1 == 0) goto L_0x08ad
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x08ad
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r1 = r0.f271309r1
            if (r1 == 0) goto L_0x08ad
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r4 = r0.f271309r1
            r1.add(r4)
            com.tencent.mm.plugin.gallery.ui.a r4 = r0.f271290h
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r5 = r4.f271542g
            r5.clear()
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r4 = r4.f271542g
            r4.addAll(r1)
            com.tencent.mm.plugin.gallery.ui.a r1 = r0.f271290h
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r1 = r1.f271541f
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r4 = r0.f271309r1
            int r1 = r1.indexOf(r4)
            r4 = -1
            if (r1 == r4) goto L_0x08ad
            u.d r4 = new u.d
            r4.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.add(r1)
            com.tencent.mm.plugin.gallery.ui.a r1 = r0.f271290h
            r1.mo129041N5(r4)
            com.tencent.mm.plugin.gallery.ui.a r1 = r0.f271290h
            int r1 = r1.mo129049g0()
            r0.mo128958e8(r1)
            r24.mo77422V7()
            r1 = 1
            goto L_0x08ae
        L_0x08ad:
            r1 = 0
        L_0x08ae:
            if (r1 == 0) goto L_0x08b1
            goto L_0x08cd
        L_0x08b1:
            r3.putStringArrayListExtra(r7, r2)
            java.lang.String r1 = "onActivity Result ok"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            r1 = 1
            r0.f271288g = r1
            r1 = -1
            r0.mo128953Z7(r1, r3)
            r24.finish()
            goto L_0x08cd
        L_0x08c5:
            java.lang.String r1 = "WTF!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r1)
            r24.finish()
        L_0x08cd:
            r1 = r3
        L_0x08ce:
            if (r1 == 0) goto L_0x091e
            java.lang.String r2 = "show_photo_edit_tip"
            r3 = 0
            boolean r1 = r1.getBooleanExtra(r2, r3)
            if (r1 == 0) goto L_0x091e
            java.lang.String r1 = "photo_edit_pref"
            android.content.SharedPreferences r1 = r0.getSharedPreferences(r1, r3)
            java.lang.String r2 = "has_show_tip"
            boolean r4 = r1.getBoolean(r2, r3)
            if (r4 != 0) goto L_0x091e
            android.widget.TextView r4 = r0.f271301o
            r4.setVisibility(r3)
            android.widget.TextView r3 = r0.f271301o
            r4 = 2131833988(0x7f113484, float:1.9301074E38)
            java.lang.String r4 = r0.getString(r4)
            r3.setText(r4)
            androidx.appcompat.app.AppCompatActivity r3 = r24.getContext()
            r4 = 2130772057(0x7f010059, float:1.7147222E38)
            android.view.animation.Animation r3 = android.view.animation.AnimationUtils.loadAnimation(r3, r4)
            android.widget.TextView r4 = r0.f271301o
            r4.startAnimation(r3)
            ow1.e r4 = new ow1.e
            r4.<init>(r0)
            r3.setAnimationListener(r4)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r3 = 1
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r2, r3)
            r1.apply()
        L_0x091e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onBackPressed() {
        super.onBackPressed();
        mo79062R7();
    }

    public void onBusinessPermissionDenied(String str) {
        if ("camera" == str) {
            this.f271256M = false;
        } else if ("storage" == str) {
            mo128954a8(Boolean.FALSE);
        }
    }

    public void onBusinessPermissionGranted(String str) {
        if ("camera" == str) {
            mo128956c8();
        } else if ("storage" == str) {
            mo128950W7();
            mo128946O7();
        }
    }

    public void onCreate(Bundle bundle) {
        Class cls = C32735h.class;
        super.onCreate(bundle);
        Log.m105925i("MicroMsg.AlbumPreviewUI", "onCreate, %s.", this);
        setRequestedOrientation(1);
        boolean Uu0 = ((C103918d) C86312j.m106911c(C103918d.class)).Uu0(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 145, getString(C0966R.string.hif), getString(C0966R.string.f5g));
        this.f271281c1 = Uu0;
        Log.m105919d("MicroMsg.AlbumPreviewUI", "checkPermission checkMediaStorage[%b]", Boolean.valueOf(Uu0));
        this.f271269V = System.currentTimeMillis();
        f271242w1 = System.currentTimeMillis();
        this.f271292i = C89779i0.m112246c(this, getString(C0966R.string.a4d), false, 0, (DialogInterface.OnCancelListener) null);
        this.f271298m1 = C94000y.CREATE;
        if (bundle != null) {
            Log.m105924i("MicroMsg.AlbumPreviewUI", "savedInstanceState not null");
            this.f271272W0 = bundle.getInt("constants_key_query_source");
            this.f271274X0 = bundle.getInt("constants_key_query_type");
        } else {
            this.f271272W0 = getIntent().getIntExtra("query_source_type", 3);
            this.f271274X0 = getIntent().getIntExtra("query_media_type", 1);
        }
        C93958f.m118750j().f271196f = this.f271272W0;
        C93958f.m118750j().mo128903I(this.f271274X0);
        Log.m105924i("MicroMsg.AlbumPreviewUI", "query source: " + this.f271272W0 + ", queryType: " + this.f271274X0);
        this.f271280b1 = getIntent().getIntExtra("select_type_tag", 3);
        this.f271264S0 = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_jump_to_record_media, true);
        C98052c cVar = C98052c.f287486a;
        this.f271283d1 = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_sns_template_video_edit_enable, true);
        this.f271285e1 = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_gallery_image_edit_icon_hide, true);
        this.f271266T0 = getIntent().getBooleanExtra("is_from_smart_gallery", false);
        this.f271254K = getIntent().getStringExtra("album_query_session_id");
        this.f271268U0 = getIntent().getBooleanExtra("album_is_from_text_status", false);
        this.f271270V0 = getIntent().getStringExtra("edt_video_layout_from_text_status");
        MJTemplateHandleNew mJTemplateHandleNew = MJTemplateHandleNew.f271075d;
        this.f271287f1 = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_sns_mj_template_handle_refactor_update, true);
        initView();
        if (this.f271281c1) {
            mo128950W7();
        } else {
            this.f271282d.setVisibility(8);
        }
        C93958f.m118754n();
        C97754e eVar = C97754e.C97756b.f286807a;
        eVar.f286797p = this.f271254K;
        eVar.f286798q = C31543z5.m39453c();
        C60960c.f173618a.mo85927k("SnsPublishProcess", "actionTrace_", 7, C60242i.ACTIONTRACE);
    }

    public void onDestroy() {
        int i;
        int i2;
        Class cls = C58247e.class;
        super.onDestroy();
        char c = 0;
        int i3 = 1;
        if (this.f271248E) {
            if (this.f271287f1) {
                MJTemplateHandleNew.f271075d.mo128853f(this.f271289g1, !this.f271266T0);
            } else {
                C98052c cVar = C98052c.f287486a;
                boolean z = !this.f271266T0;
                Log.m105924i("MicroMsg.MJTemplateHandle", "unbind release maas: " + z);
                C98052c.f287489d = null;
                if (!C98052c.f287495j) {
                    C98050a aVar = C98052c.f287487b;
                    if (aVar != null && aVar.mo137352a()) {
                        cVar.mo137358d();
                    }
                }
                C98050a aVar2 = C98052c.f287487b;
                if (aVar2 != null) {
                    aVar2.f287473d = null;
                }
                C98052c.f287487b = null;
                if (z) {
                    ((C58247e) C86312j.m106911c(cls)).Ln0();
                }
                C98052c.f287490e = null;
                C98052c.f287491f = null;
            }
        }
        if (this.f271248E) {
            C93958f.m118743c();
        }
        Log.m105925i("MicroMsg.AlbumPreviewUI", "onDestroy, %s.", this);
        ((C58247e) C86312j.m106911c(cls)).P70(true);
        if (C93958f.m118750j() != null) {
            C93958f.m118750j().mo128910i0(this);
            C93970n j = C93958f.m118750j();
            C93964k.C93966b bVar = this.f271322y0;
            if (bVar != null) {
                j.f271194d.remove(bVar);
            } else {
                j.getClass();
            }
        }
        int i4 = this.f271259Q;
        if (i4 > 0 || this.f271261R > 0) {
            Log.m105919d("MicroMsg.AlbumPreviewUI", "report click camera count[%d], click folder count[%d]", Integer.valueOf(i4), Integer.valueOf(this.f271261R));
            C101316l.m132914m(11187, this.f271259Q + "," + this.f271261R);
        } else {
            Log.m105918d("MicroMsg.AlbumPreviewUI", "not click camera or folder.");
        }
        if (this.f271267U > 0 || this.f271288g) {
            String str = this.f271247D;
            ArrayList<GalleryItem$MediaItem> arrayList = this.f271290h.f271542g;
            int[] iArr = new int[4];
            iArr[0] = arrayList.size();
            Iterator<GalleryItem$MediaItem> it = arrayList.iterator();
            while (it.hasNext()) {
                GalleryItem$MediaItem next = it.next();
                if (next != null) {
                    if (!Util.isNullOrNil(next.f162755o) && next.f162755o.equalsIgnoreCase("image/gif")) {
                        iArr[2] = iArr[2] + 1;
                    } else if (next.getType() == 2) {
                        iArr[3] = iArr[3] + 1;
                    } else if (next.getType() == 1) {
                        iArr[1] = iArr[1] + 1;
                    }
                }
            }
            boolean z2 = this.f271249F;
            boolean z3 = this.f271286f;
            int i5 = C93958f.m118750j().f271196f;
            int i6 = i5 != 3 ? i5 != 4 ? (i5 == 7 || i5 == 8 || i5 == 15) ? 3 : 0 : (Util.isNullOrNil(str) || !str.equals(MMApplicationContext.getContext().getString(C0966R.string.cmx))) ? 2 : 6 : 1;
            Log.m105925i("MicroMsg.GalleryCore", "[handleSelectImagePreviewReport] source:%s", Integer.valueOf(i5));
            C101316l.m132914m(14205, i6 + "," + i6 + "," + iArr[0] + "," + iArr[1] + "," + iArr[2] + "," + iArr[3] + "," + z2 + "," + z3 + "," + C93958f.f271149m + "," + C93958f.f271150n + "," + C93958f.f271151o + "," + C93958f.f271152p);
            C93958f.f271149m = false;
            C93958f.f271150n = false;
            C93958f.f271151o = false;
            C93958f.f271152p = false;
        }
        int g0 = this.f271290h.mo129049g0();
        boolean z4 = this.f271249F;
        boolean z5 = this.f271267U > 0 || this.f271288g;
        Log.m105925i("MicroMsg.GalleryCore", "[handlePhotoEditInfo] selectSize:%s isSendRaw:%s", Integer.valueOf(g0), Boolean.valueOf(z4));
        int i7 = C93958f.m118750j().f271196f == 3 ? 1 : C93958f.m118750j().f271196f == 4 ? 2 : 0;
        int size = C93958f.m118748h() != null ? C93958f.m118748h().size() : 0;
        Log.m105925i("MicroMsg.GalleryCore", "[reportPhotoEdit] fromScene:%s,selectSize:%s,editSize:%s", Integer.valueOf(i7), Integer.valueOf(g0), Integer.valueOf(size));
        if (size > 0) {
            C101316l.m132914m(13858, i7 + "," + g0 + "," + size + "," + 0);
        }
        String[] strArr = C101316l.f296815a;
        C86709a0.m107528h();
        Log.m105925i("MicroMsg.GalleryCore", "[handlePhotoEditInfo] imageState:%s", Boolean.valueOf(!C86709a0.m107523b().mo121114l() ? false : C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, true)));
        Iterator<Bundle> it4 = C93958f.m118749i().f271161g.iterator();
        while (it4.hasNext()) {
            Bundle next2 = it4.next();
            String string = next2.getString("after_photo_edit");
            if (!z5) {
                Object[] objArr = new Object[i3];
                objArr[c] = string;
                Log.m105925i("MicroMsg.GalleryCore", "[handlePhotoEditInfo] delete file:%s", objArr);
                C86013q1.m106447h(string);
                AndroidMediaUtil.refreshMediaScanner(string, MMApplicationContext.getContext());
            }
            int i8 = next2.getInt("report_info_emotion_count");
            int i9 = next2.getInt("report_info_text_count");
            int i15 = next2.getInt("report_info_mosaic_count");
            int i16 = next2.getInt("report_info_doodle_count");
            boolean z6 = next2.getBoolean("report_info_iscrop");
            int i17 = next2.getInt("report_info_undo_count");
            Iterator<Bundle> it5 = it4;
            boolean z7 = next2.getBoolean("report_info_is_rotation");
            boolean z8 = z5;
            Log.m105925i("MicroMsg.GalleryCore", "[reportPhotoEdit] emojiCount:%s,textCount:%s,mosaicCount:%s,penCount:%s,isCrop:%s,undoCount:%s,isRotation:%s", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(z6 ? 1 : 0), Integer.valueOf(i17), Integer.valueOf(z7 ? 1 : 0));
            if (size > 0) {
                C101316l.m132914m(13857, i7 + "," + z4 + "," + i8 + "," + i9 + "," + i15 + "," + i16 + "," + z6 + "," + i17 + "," + 2 + "" + z7);
            }
            z5 = z8;
            it4 = it5;
            c = 0;
            i3 = 1;
        }
        ((C58849b) C86312j.m106911c(C58849b.class)).mo58069ZD().mo162892a();
        C93958f.m118748h().clear();
        C93958f.m118749i().f271161g.clear();
        C93958f.m118752l().clear();
        if (this.f271266T0) {
            Uri uri = C93974o.f271204e;
            i = 1;
            C93974o.C93984j.f271235a.f271206b = true;
        } else {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            mo128945N7(arrayList2, arrayList3, new int[this.f271257N]);
            C97754e.C97756b.f286807a.f286791j = arrayList2.size();
            C97754e.C97756b.f286807a.f286792k = arrayList3.size();
            C97754e eVar = C97754e.C97756b.f286807a;
            eVar.f286795n = this.f271276Y0 ? 1 : 0;
            Iterator it6 = arrayList2.iterator();
            int i18 = 0;
            while (it6.hasNext()) {
                if (((HashSet) eVar.f286805x).contains((String) it6.next())) {
                    i18++;
                }
            }
            Iterator it7 = arrayList3.iterator();
            int i19 = 0;
            while (it7.hasNext()) {
                if (((HashSet) eVar.f286805x).contains((String) it7.next())) {
                    i19++;
                }
            }
            eVar.f286793l = i18;
            eVar.f286794m = i19;
            C97754e eVar2 = C97754e.C97756b.f286807a;
            eVar2.f286786e = ((ArrayList) eVar2.f286799r).size();
            eVar2.f286787f = ((ArrayList) eVar2.f286800s).size();
            eVar2.f286788g = ((ArrayList) eVar2.f286801t).size();
            eVar2.f286789h = ((ArrayList) eVar2.f286802u).size();
            eVar2.f286790i = ((ArrayList) eVar2.f286803v).size();
            long max = Math.max(C31543z5.m39453c() - eVar2.f286798q, 0);
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, Integer> value : eVar2.f286804w.entrySet()) {
                sb.append(value.getValue());
                sb.append("|");
            }
            Log.m105919d("MicroMsg.GalleryReporter", "poiStr: %s.", sb);
            GalleryOpeReportStruct galleryOpeReportStruct = new GalleryOpeReportStruct();
            galleryOpeReportStruct.f265600d = (long) eVar2.f286782a;
            galleryOpeReportStruct.f265601e = (long) eVar2.f286783b;
            galleryOpeReportStruct.f265602f = (long) eVar2.f286784c;
            galleryOpeReportStruct.f265603g = (long) eVar2.f286785d;
            galleryOpeReportStruct.f265604h = (long) eVar2.f286786e;
            galleryOpeReportStruct.f265605i = (long) eVar2.f286787f;
            galleryOpeReportStruct.f265606j = (long) eVar2.f286788g;
            galleryOpeReportStruct.f265607k = (long) eVar2.f286789h;
            galleryOpeReportStruct.f265608l = (long) eVar2.f286790i;
            galleryOpeReportStruct.f265609m = galleryOpeReportStruct.mo86045b("sendMediaPoi", sb.toString(), true);
            galleryOpeReportStruct.f265610n = (long) eVar2.f286791j;
            galleryOpeReportStruct.f265611o = (long) eVar2.f286792k;
            galleryOpeReportStruct.f265612p = (long) eVar2.f286795n;
            galleryOpeReportStruct.f265613q = (long) eVar2.f286796o;
            galleryOpeReportStruct.f265614r = galleryOpeReportStruct.mo86045b("SendSessionID", eVar2.f286797p, true);
            galleryOpeReportStruct.f265617u = max;
            galleryOpeReportStruct.f265615s = (long) eVar2.f286793l;
            galleryOpeReportStruct.f265616t = (long) eVar2.f286794m;
            galleryOpeReportStruct.mo86054n();
            if (Log.isDebug()) {
                i2 = 0;
                Log.m105919d("MicroMsg.GalleryReporter", "report%s %s", 18077, galleryOpeReportStruct.mo1006q().replace(APLogFileUtil.SEPARATOR_LINE, " "));
            } else {
                i2 = 0;
            }
            eVar2.f286782a = i2;
            eVar2.f286783b = i2;
            eVar2.f286784c = i2;
            eVar2.f286785d = i2;
            eVar2.f286786e = i2;
            eVar2.f286787f = i2;
            eVar2.f286788g = i2;
            eVar2.f286789h = i2;
            eVar2.f286790i = i2;
            eVar2.f286791j = i2;
            eVar2.f286792k = i2;
            eVar2.f286795n = i2;
            eVar2.f286796o = i2;
            eVar2.f286797p = "";
            ((ArrayList) eVar2.f286799r).clear();
            ((ArrayList) eVar2.f286800s).clear();
            ((ArrayList) eVar2.f286801t).clear();
            ((ArrayList) eVar2.f286802u).clear();
            ((ArrayList) eVar2.f286803v).clear();
            eVar2.f286804w.clear();
            ((HashSet) eVar2.f286805x).clear();
            Uri uri2 = C93974o.f271204e;
            i = 1;
            C93974o.C93984j.f271235a.f271207c = true;
            C93964k kVar = C93958f.m118750j().f271195e;
            if (kVar != null) {
                ((C93946b) kVar).f271112g = true;
            }
        }
        if (C93958f.m118742b()) {
            C101069i iVar = (C101069i) C100687b.m131710a(C100687b.f295006d);
            Object[] objArr2 = new Object[i];
            objArr2[0] = Integer.valueOf(iVar.f295883c.f295869a);
            Log.m105925i("MicroMsg.UsageLruMap", "resetSize %s", objArr2);
            iVar.f295881a.setMaxSize(iVar.f295883c.f295869a);
            C94049a.C56820m.f162821h.clear();
        }
        if (!Util.isNullOrNil(this.f271254K)) {
            C31728a.f84717a.mo58324a(this.f271254K);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getRepeatCount() == 0) {
            Log.m105924i("MicroMsg.AlbumPreviewUI", "onKeyDown");
            mo128953Z7(-2, (Intent) null);
            ImageFolderMgrView imageFolderMgrView = this.f271303p;
            if (imageFolderMgrView == null || !imageFolderMgrView.f271358i) {
                onBackPressed();
                return true;
            }
            imageFolderMgrView.mo128973b();
            playActionBarOperationAreaAnim();
            return true;
        } else if (i != 82) {
            return super.onKeyDown(i, keyEvent);
        } else {
            this.f271261R++;
            ImageFolderMgrView imageFolderMgrView2 = this.f271303p;
            if (imageFolderMgrView2 != null) {
                imageFolderMgrView2.mo128973b();
            }
            return true;
        }
    }

    public void onPause() {
        ImageFolderMgrView imageFolderMgrView;
        boolean z;
        super.onPause();
        Log.m105925i("MicroMsg.AlbumPreviewUI", "on onPause, %s.", this);
        C103928o.m138642b();
        this.f271256M = true;
        if (!isFinishing() && !isDestroyed() && (imageFolderMgrView = this.f271303p) != null && z) {
            if (!(z = imageFolderMgrView.f271358i)) {
                Log.m105928w("MicroMsg.ImageFolderMgrView", "want to close, but it was closed");
            } else if (imageFolderMgrView.f271359j) {
                Log.m105918d("MicroMsg.ImageFolderMgrView", "want to close, but it is in animation");
            } else {
                imageFolderMgrView.f271354e.setVisibility(8);
                imageFolderMgrView.f271358i = false;
                ImageFolderMgrView.C94005d dVar = imageFolderMgrView.f271363q;
                if (dVar != null) {
                    ((C93989c) dVar).mo128962a(false);
                }
            }
        }
        C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcAlbumScrollEnable(), this.f271273X);
        this.f271273X = 0;
        if (this.f271266T0) {
            Uri uri = C93974o.f271204e;
            C93974o oVar = C93974o.C93984j.f271235a;
            ArrayList<GalleryItem$MediaItem> arrayList = this.f271290h.f271542g;
            oVar.getClass();
            Log.m105924i("MicroMsg.SmartGalleryQueryUtil", "clearSelectedMediaPath");
            ((ArrayList) oVar.f271208d).clear();
            ((ArrayList) oVar.f271208d).addAll(arrayList);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.AlbumPreviewUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.AlbumPreviewUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i != 16) {
            if (i == 145) {
                if (iArr[0] == 0) {
                    mo128946O7();
                    mo128951X7();
                    C93958f.m118750j().mo128908e();
                    mo128950W7();
                    return;
                }
                mo128954a8(Boolean.TRUE);
            }
        } else if (iArr[0] == 0) {
            mo128956c8();
        } else {
            C76879j.m92709C(this, getString(C0966R.string.hhq), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f360830f51), false, new C56805k(), (DialogInterface.OnClickListener) null);
        }
    }

    public void onResume() {
        super.onResume();
        Log.m105925i("MicroMsg.AlbumPreviewUI", "onResume, %s.", this);
        C103928o.m138641a(true, true, true);
        this.f271256M = false;
        C60960c.f173618a.mo85927k("SnsPublishProcess", "selectPagetimes", 1, C60242i.APPEND);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Log.m105925i("MicroMsg.AlbumPreviewUI", "onSaveInstanceState, %s.", this);
        bundle.putInt("constants_key_query_source", this.f271272W0);
        bundle.putInt("constants_key_query_type", this.f271274X0);
    }

    public void onStart() {
        super.onStart();
        Log.m105925i("MicroMsg.AlbumPreviewUI", "onStart, %s.", this);
        if (C93958f.m118750j().f271196f != this.f271272W0) {
            C93958f.m118750j().f271196f = this.f271272W0;
        }
        if (C93958f.m118750j().f271197g != this.f271274X0) {
            C93958f.m118750j().mo128903I(this.f271274X0);
        }
        if (this.f271248E && !this.f271287f1) {
            C98052c.f287486a.mo137355a(this);
        }
    }

    public void onStop() {
        super.onStop();
        Log.m105925i("MicroMsg.AlbumPreviewUI", "onStop, %s.", this);
        if (!this.f271266T0) {
            C93947c g = C93958f.m118747g();
            HashMap<String, C93947c.C93950c> hashMap = g.f271116d;
            if (hashMap != null && !hashMap.isEmpty()) {
                for (Map.Entry<String, C93947c.C93950c> value : g.f271116d.entrySet()) {
                    C93947c.C93950c cVar = (C93947c.C93950c) value.getValue();
                    if (cVar != null) {
                        cVar.f271138p = true;
                    }
                }
                C98551l<String> lVar = g.f271115c;
                if (lVar != null) {
                    lVar.clear();
                }
                HashMap<String, C93947c.C93950c> hashMap2 = g.f271116d;
                if (hashMap2 != null && !hashMap2.isEmpty()) {
                    g.f271116d.clear();
                }
                C93951d dVar = g.f271113a;
                dVar.f271144d.clear();
                dVar.f271145e.clear();
            }
            C93958f.m118747g().mo128874b();
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C12933a.class);
    }
}
