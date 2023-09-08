package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderPostSelectPageActionStruct;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState;
import com.tencent.p014mm.plugin.gallery.model.C93958f;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem;
import com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI;
import com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordMediaReportInfo;
import com.tencent.p014mm.plugin.recordvideo.jumper.VideoCaptureReportInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.vlog.model.FinderVideoShell;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import da0.C58247e;
import di3.C7335d;
import di3.C86312j;
import fq1.C97947b;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import hh2.C8532a;
import ht1.C60165e4;
import ht1.C60200t1;
import ht1.C60206u1;
import i23.C8847a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jh2.C9434j;
import kg3.C76577a;
import kotlin.Metadata;
import nj3.C76879j;
import o40.C61926c;
import org.json.JSONObject;
import p599lr.C61381b;
import qo1.C63291f;
import qo3.C47883u;
import qo3.C77426q;
import qo3.C89779i0;
import qw1.C63339b;
import rd3.C48020a;
import rx3.C13598b0;
import rx3.C13605o;
import sx3.C64197v;
import te3.C49712hj1;
import te3.C64726td1;
import th2.C110992d;
import xb0.C102609h;
import z04.C112551y;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderAlbumUI;", "Lcom/tencent/mm/plugin/gallery/ui/AlbumPreviewUI;", "Lcom/tencent/mm/plugin/recordvideo/jumper/CaptureDataManager$b;", "<init>", "()V", "plugin-vlog-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderAlbumUI */
public final class FinderAlbumUI extends AlbumPreviewUI implements CaptureDataManager.C94403b {

    /* renamed from: F1 */
    public static final /* synthetic */ int f161014F1 = 0;

    /* renamed from: A1 */
    public long f161015A1;

    /* renamed from: B1 */
    public boolean f161016B1;

    /* renamed from: C1 */
    public boolean f161017C1;

    /* renamed from: D1 */
    public long f161018D1;

    /* renamed from: E1 */
    public JSONObject f161019E1;

    /* renamed from: y1 */
    public String f161020y1 = "";

    /* renamed from: z1 */
    public boolean f161021z1;

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderAlbumUI$a */
    public static final class C56325a extends C87413o implements C32227p<Boolean, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f161022d;

        /* renamed from: e */
        public final /* synthetic */ FinderAlbumUI f161023e;

        /* renamed from: f */
        public final /* synthetic */ C64726td1 f161024f;

        /* renamed from: g */
        public final /* synthetic */ C9434j f161025g;

        /* renamed from: h */
        public final /* synthetic */ C89779i0 f161026h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56325a(String str, FinderAlbumUI finderAlbumUI, C64726td1 td12, C9434j jVar, C89779i0 i0Var) {
            super(2);
            this.f161022d = str;
            this.f161023e = finderAlbumUI;
            this.f161024f = td12;
            this.f161025g = jVar;
            this.f161026h = i0Var;
        }

        public Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Log.m105924i("Finder.AlbumUI", "success:" + booleanValue + " , filePath:" + ((String) obj2) + ", fileExist:" + C48020a.m53385b(this.f161022d));
            C61926c.m72668M(new C56408p(booleanValue, this.f161022d, this.f161023e, this.f161024f, this.f161025g, this.f161026h));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderAlbumUI$b */
    public static final class C56326b implements C47883u {

        /* renamed from: a */
        public static final C56326b f161027a = new C56326b();

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderAlbumUI$c */
    public static final class C56327c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderAlbumUI f161028d;

        public C56327c(FinderAlbumUI finderAlbumUI) {
            this.f161028d = finderAlbumUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderAlbumUI$refreshMaasPermissionTips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderAlbumUI finderAlbumUI = this.f161028d;
            int i = FinderAlbumUI.f161014F1;
            finderAlbumUI.getClass();
            ((C58247e) C86312j.m106911c(C58247e.class)).mo82982Tl().mo71104b("scene_finder", finderAlbumUI, new C56412q(finderAlbumUI), new C56416r(finderAlbumUI));
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderAlbumUI$refreshMaasPermissionTips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a A[RETURN] */
    /* renamed from: H7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo79060H7(com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.tencent.p014mm.plugin.gallery.model.GalleryItem$ImageMediaItem
            r1 = 0
            if (r0 == 0) goto L_0x004b
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r2 = 1
            r0.inJustDecodeBounds = r2
            com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem r9 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$ImageMediaItem) r9
            java.lang.String r9 = r9.f162747d
            com.tencent.p014mm.graphics.MMBitmapFactory.m98735d(r9, r0)
            int r9 = r0.outWidth
            int r0 = r0.outHeight
            if (r9 == 0) goto L_0x0030
            if (r0 != 0) goto L_0x001d
            goto L_0x0030
        L_0x001d:
            float r9 = (float) r9
            float r0 = (float) r0
            float r9 = r9 / r0
            r0 = 1077936128(0x40400000, float:3.0)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0030
            r0 = 1051372203(0x3eaaaaab, float:0.33333334)
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 >= 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r9 = 1
            goto L_0x0031
        L_0x0030:
            r9 = 0
        L_0x0031:
            if (r9 != 0) goto L_0x004a
            r9 = 2131830645(0x7f112775, float:1.9294293E38)
            java.lang.String r3 = r8.getString(r9)
            r9 = 2131821556(0x7f1103f4, float:1.9275859E38)
            java.lang.String r5 = r8.getString(r9)
            r6 = 0
            r7 = 0
            java.lang.String r4 = ""
            r2 = r8
            nj3.C76879j.m92711E(r2, r3, r4, r5, r6, r7)
            return r1
        L_0x004a:
            return r2
        L_0x004b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderAlbumUI.mo79060H7(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0089  */
    /* renamed from: I7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo79061I7(com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem
            r1 = 0
            if (r0 == 0) goto L_0x00c5
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r2 = "key_filter_hdr_video"
            boolean r0 = r0.getBooleanExtra(r2, r1)
            if (r0 == 0) goto L_0x002e
            qw1.i r0 = qw1.C63340i.f179709a
            r2 = r10
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r2 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r2
            java.lang.String r2 = r2.f162747d
            java.lang.String r3 = "item.getOriginalPath()"
            gy3.C87412m.m108593f(r2, r3)
            boolean r0 = r0.mo88238b(r2)
            if (r0 != 0) goto L_0x002e
            r10 = 2131830648(0x7f112778, float:1.92943E38)
            java.lang.String r10 = r9.getString(r10)
            nj3.C76879j.m92729W(r9, r10)
            return r1
        L_0x002e:
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r2 = "key_max_video_duration"
            int r0 = r0.getIntExtra(r2, r1)
            if (r0 <= 0) goto L_0x0050
            r2 = r10
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r2 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r2
            java.lang.String r2 = r2.f162747d
            int r2 = qw1.C101316l.m132902a(r2)
            if (r2 <= r0) goto L_0x0050
            r10 = 2131830652(0x7f11277c, float:1.9294307E38)
            java.lang.String r10 = r9.getString(r10)
            nj3.C76879j.m92729W(r9, r10)
            return r1
        L_0x0050:
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r10 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r10
            int r0 = r10.f162768y
            int r2 = r10.f162767x
            r3 = 1
            if (r0 == 0) goto L_0x006f
            if (r2 != 0) goto L_0x005c
            goto L_0x006f
        L_0x005c:
            float r0 = (float) r0
            float r2 = (float) r2
            float r0 = r0 / r2
            r2 = 1077936128(0x40400000, float:3.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x006f
            r2 = 1051372203(0x3eaaaaab, float:0.33333334)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r0 = 1
            goto L_0x0070
        L_0x006f:
            r0 = 0
        L_0x0070:
            r2 = 2131821556(0x7f1103f4, float:1.9275859E38)
            if (r0 != 0) goto L_0x0089
            r10 = 2131830650(0x7f11277a, float:1.9294303E38)
            java.lang.String r4 = r9.getString(r10)
            java.lang.String r6 = r9.getString(r2)
            r7 = 0
            r8 = 0
            java.lang.String r5 = ""
            r3 = r9
            nj3.C76879j.m92711E(r3, r4, r5, r6, r7, r8)
            return r1
        L_0x0089:
            java.lang.String r0 = r10.f162747d
            java.lang.String r4 = "item.originalPath"
            gy3.C87412m.m108593f(r0, r4)
            zt3.t r4 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.finder.ui.o r5 = new com.tencent.mm.plugin.finder.ui.o
            r5.<init>(r0)
            zt3.j r4 = (zt3.C119157j) r4
            r4.mo183875f(r5)
            qw1.b r0 = qw1.C63339b.f179706a
            r4 = 25
            int r0 = r0.mo88236b(r4, r10)
            if (r0 != 0) goto L_0x00a7
            r1 = 1
        L_0x00a7:
            if (r1 != 0) goto L_0x00c5
            java.lang.String r0 = r10.f162764u
            java.lang.String r3 = r10.f162765v
            java.lang.String r10 = r10.f162747d
            r9.mo79074p8(r0, r3, r10)
            r10 = 2131830624(0x7f112760, float:1.929425E38)
            java.lang.String r4 = r9.getString(r10)
            java.lang.String r6 = r9.getString(r2)
            r7 = 0
            r8 = 0
            java.lang.String r5 = ""
            r3 = r9
            nj3.C76879j.m92711E(r3, r4, r5, r6, r7, r8)
        L_0x00c5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderAlbumUI.mo79061I7(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem):boolean");
    }

    /* renamed from: R7 */
    public void mo79062R7() {
        C7335d c = C86312j.m106911c(C63291f.class);
        C87412m.m108593f(c, "getService(IFinderPostLogicService::class.java)");
        ((C63291f) c).mo83240md(3, false);
        C8847a.m8677a(C8847a.f28097a, 100, 1, System.currentTimeMillis() - this.f161018D1, 0, this.f161019E1, (String) null, (C49712hj1) null, 96, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0033  */
    /* renamed from: S7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo79063S7() {
        /*
            r13 = this;
            java.lang.Class<rw.n> r0 = p232rw.C13586n.class
            java.lang.String r1 = "Finder.AlbumUI"
            java.lang.String r2 = "onHeaderClicked: "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            android.content.Intent r2 = r13.getIntent()
            java.lang.String r3 = "KEY_FINDER_POST_MUSIC_INFO"
            byte[] r2 = r2.getByteArrayExtra(r3)
            te3.td1 r3 = new te3.td1
            r3.<init>()
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L_0x001e
        L_0x001c:
            r10 = r5
            goto L_0x0031
        L_0x001e:
            r3.parseFrom(r2)     // Catch:{ Exception -> 0x0023 }
            r10 = r3
            goto L_0x0031
        L_0x0023:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r6 = 0
            r3[r6] = r2
            java.lang.String r2 = "safeParser"
            java.lang.String r6 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r6, r3)
            goto L_0x001c
        L_0x0031:
            if (r10 != 0) goto L_0x0039
            java.lang.String r0 = "onHeaderClicked: get music info pb error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            return
        L_0x0039:
            androidx.appcompat.app.AppCompatActivity r1 = r13.getContext()
            androidx.appcompat.app.AppCompatActivity r2 = r13.getContext()
            r3 = 2131826680(0x7f1117f8, float:1.9286251E38)
            java.lang.String r2 = r2.getString(r3)
            r3 = 2
            qo3.i0 r12 = qo3.C89779i0.m112248e(r1, r2, r4, r3, r5)
            java.lang.Class<lr.b> r1 = p599lr.C61381b.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            lr.b r1 = (p599lr.C61381b) r1
            java.lang.String r8 = r1.mo78561xg(r10)
            di3.d r1 = di3.C86312j.m106911c(r0)
            rw.n r1 = (p232rw.C13586n) r1
            jh2.j r1 = r1.d70()
            long r2 = java.lang.System.currentTimeMillis()
            int r3 = (int) r2
            r1.mo10147b(r3)
            java.lang.String r2 = r10.f185539i
            r1.mo10148c(r2)
            r1.mo10146a(r8)
            di3.d r0 = di3.C86312j.m106911c(r0)
            rw.n r0 = (p232rw.C13586n) r0
            androidx.appcompat.app.AppCompatActivity r2 = r13.getContext()
            java.lang.String r3 = "context"
            gy3.C87412m.m108593f(r2, r3)
            com.tencent.mm.plugin.finder.ui.FinderAlbumUI$a r3 = new com.tencent.mm.plugin.finder.ui.FinderAlbumUI$a
            r7 = r3
            r9 = r13
            r11 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            r0.Bt0(r2, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderAlbumUI.mo79063S7():void");
    }

    /* renamed from: U5 */
    public void mo79064U5(boolean z, RecordMediaReportInfo recordMediaReportInfo, Bundle bundle) {
    }

    /* renamed from: U7 */
    public void mo77421U7(int i, View view, int i2) {
        C87412m.m108594g(view, "itemView");
        GalleryItem$MediaItem g5 = this.f271290h.mo129050g5(i);
        boolean z = true;
        boolean z2 = false;
        if (g5 == null || Util.isNullOrNil(g5.f162747d)) {
            Object[] objArr = new Object[1];
            if (g5 != null) {
                z = false;
            }
            objArr[0] = Boolean.valueOf(z);
            Log.m105929w("Finder.AlbumUI", "item is null %s, item original path is null", objArr);
        } else if (this.f271272W0 != 25) {
        } else {
            if (g5 instanceof GalleryItem$VideoMediaItem) {
                int max = Math.max(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ultron_album_video_max_select_duration_android, 300), ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83778Y5());
                int j8 = mo79068j8();
                GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = (GalleryItem$VideoMediaItem) g5;
                C87412m.m108593f(galleryItem$VideoMediaItem.f162747d, "item.originalPath");
                if (galleryItem$VideoMediaItem.f162766w < C102609h.Fx0().mo142238c6().f267171i * 1000) {
                    C76879j.m92712F(getContext(), getResources().getString(C0966R.string.f6x, new Object[]{Integer.valueOf(C102609h.Fx0().mo142238c6().f267171i)}), "", false);
                } else if (galleryItem$VideoMediaItem.f162766w > max * 1000) {
                    C76879j.m92712F(getContext(), getResources().getString(C0966R.string.f6y, new Object[]{Integer.valueOf(j8)}), "", false);
                } else {
                    Log.m105924i("Finder.AlbumUI", "onMediaClick, video mime:" + galleryItem$VideoMediaItem.f162764u + ", audio mime:" + galleryItem$VideoMediaItem.f162765v + ", path:" + g5.f162747d);
                    String str = galleryItem$VideoMediaItem.f162747d;
                    C87412m.m108593f(str, "item.originalPath");
                    ((C119157j) C119157j.f356862d).mo183875f(new C56405o(str));
                    if (C63339b.f179706a.mo88236b(25, galleryItem$VideoMediaItem) == 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        mo79074p8(galleryItem$VideoMediaItem.f162764u, galleryItem$VideoMediaItem.f162765v, g5.f162747d);
                        C77426q qVar = new C77426q(getContext());
                        qVar.mo107606r(C76577a.m92166q(getContext(), C0966R.string.f5w));
                        qVar.mo107602n(C76577a.m92166q(getContext(), C0966R.string.f5b));
                        qVar.mo107600l(C56326b.f161027a);
                        qVar.mo107603o();
                        return;
                    }
                    new ArrayList(1).add(g5);
                    ArrayList<GalleryItem$MediaItem> y5 = this.f271290h.mo129056y5(2);
                    C93958f.m118755o(y5);
                    mo79071m8(y5.indexOf(g5));
                }
            } else {
                ArrayList<GalleryItem$MediaItem> y54 = this.f271290h.mo129056y5(g5.getType());
                C93958f.m118755o(y54);
                mo79071m8(y54.indexOf(g5));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v11 */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: V7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo77422V7() {
        /*
            r19 = this;
            r7 = r19
            java.lang.Class<ht1.t1> r0 = ht1.C60200t1.class
            java.lang.Class<ht1.u1> r1 = ht1.C60206u1.class
            java.lang.Class<da0.e> r2 = da0.C58247e.class
            i23.a r8 = i23.C8847a.f28097a
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r7.f161018D1
            long r11 = r3 - r5
            org.json.JSONObject r14 = r7.f161019E1
            r9 = 100
            r10 = 1
            r13 = 1
            r15 = 0
            r16 = 0
            r17 = 96
            r18 = 0
            i23.C8847a.m8677a(r8, r9, r10, r11, r13, r14, r15, r16, r17, r18)
            di3.d r3 = di3.C86312j.m106911c(r2)
            da0.e r3 = (da0.C58247e) r3
            r4 = 0
            r3.P70(r4)
            int r3 = r7.f271272W0
            java.lang.String r5 = "[onSendItemClick] list isEmpty"
            r6 = 0
            java.lang.String r8 = "Finder.AlbumUI"
            r9 = 1
            r10 = 25
            if (r3 != r10) goto L_0x0190
            java.util.ArrayList r10 = new java.util.ArrayList
            com.tencent.mm.plugin.gallery.ui.a r2 = r7.f271290h
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r2 = r2.f271542g
            r10.<init>(r2)
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L_0x004b
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r5)
            return r4
        L_0x004b:
            java.lang.Object r2 = r10.get(r4)
            boolean r3 = r2 instanceof com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem
            if (r3 == 0) goto L_0x0056
            r6 = r2
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r6 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r6
        L_0x0056:
            if (r6 == 0) goto L_0x005b
            int r2 = r6.f162766w
            goto L_0x005c
        L_0x005b:
            r2 = 0
        L_0x005c:
            di3.d r3 = di3.C86312j.m106911c(r1)
            ht1.u1 r3 = (ht1.C60206u1) r3
            int r5 = r3.mo60949UK()
            if (r5 != r9) goto L_0x0149
            int r5 = r10.size()
            if (r5 != r9) goto L_0x0149
            long r5 = (long) r2
            int r8 = r3.Hl0()
            int r8 = r8 + r9
            long r11 = (long) r8
            r13 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 * r13
            int r8 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r8 < 0) goto L_0x0149
            di3.d r8 = di3.C86312j.m106911c(r0)
            ht1.t1 r8 = (ht1.C60200t1) r8
            ht1.z4 r8 = r8.mo76861l7()
            int r8 = r8.mo83778Y5()
            long r11 = (long) r8
            long r11 = r11 * r13
            int r8 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r8 >= 0) goto L_0x0149
            boolean r5 = r7.f161021z1
            if (r5 != 0) goto L_0x0149
            int r0 = r3.mo60953lE()
            if (r0 != r9) goto L_0x00a1
            r7.mo79065f8(r10)
            goto L_0x018f
        L_0x00a1:
            java.lang.Class<qo1.f> r0 = qo1.C63291f.class
            qo3.w r1 = new qo3.w
            androidx.appcompat.app.AppCompatActivity r2 = r19.getContext()
            r1.<init>(r2)
            java.lang.Object r2 = r10.get(r4)
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.plugin.gallery.model.GalleryItem.VideoMediaItem"
            gy3.C87412m.m108592e(r2, r3)
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r2 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r2
            r3 = 2131495419(0x7f0c09fb, float:1.8614374E38)
            r1.mo12470j(r3)
            android.view.View r3 = r1.f36927f
            r4 = 2131301037(0x7f0912ad, float:1.822012E38)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L_0x00d4
            android.text.TextPaint r3 = r3.getPaint()
            r4 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r3, r4)
        L_0x00d4:
            android.view.View r3 = r1.f36927f
            r4 = 2131301005(0x7f09128d, float:1.8220056E38)
            android.view.View r3 = r3.findViewById(r4)
            if (r3 == 0) goto L_0x00e7
            com.tencent.mm.plugin.finder.ui.s r4 = new com.tencent.mm.plugin.finder.ui.s
            r4.<init>(r1)
            r3.setOnClickListener(r4)
        L_0x00e7:
            android.view.View r3 = r1.f36927f
            r4 = 2131308167(0x7f092e87, float:1.8234582E38)
            android.view.View r3 = r3.findViewById(r4)
            if (r3 == 0) goto L_0x00fa
            com.tencent.mm.plugin.finder.ui.t r4 = new com.tencent.mm.plugin.finder.ui.t
            r4.<init>(r7, r1, r2)
            r3.setOnClickListener(r4)
        L_0x00fa:
            android.view.View r2 = r1.f36927f
            r3 = 2131313515(0x7f09436b, float:1.8245429E38)
            android.view.View r2 = r2.findViewById(r3)
            if (r2 == 0) goto L_0x010d
            com.tencent.mm.plugin.finder.ui.u r3 = new com.tencent.mm.plugin.finder.ui.u
            r3.<init>(r7, r1, r10)
            r2.setOnClickListener(r3)
        L_0x010d:
            com.tencent.mm.plugin.finder.ui.v r2 = new com.tencent.mm.plugin.finder.ui.v
            r2.<init>(r7)
            r1.f36937s = r2
            r1.mo5086o()
            di3.d r1 = di3.C86312j.m106911c(r0)
            qo1.f r1 = (qo1.C63291f) r1
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r1 = r1.mo83237Dc()
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0129
            java.lang.String r1 = r1.clickId
            if (r1 != 0) goto L_0x012a
        L_0x0129:
            r1 = r2
        L_0x012a:
            di3.d r0 = di3.C86312j.m106911c(r0)
            qo1.f r0 = (qo1.C63291f) r0
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = r0.mo83237Dc()
            if (r0 == 0) goto L_0x013c
            java.lang.String r0 = r0.postId
            if (r0 != 0) goto L_0x013b
            goto L_0x013c
        L_0x013b:
            r2 = r0
        L_0x013c:
            r3 = 1
            long r4 = eb0.C31543z5.m39453c()
            long r4 = r4 / r13
            r6 = 0
            r0 = r19
            r0.mo79073o8(r1, r2, r3, r4, r6)
            goto L_0x018f
        L_0x0149:
            int r3 = r10.size()
            if (r3 != r9) goto L_0x018c
            if (r2 <= 0) goto L_0x018c
            di3.d r1 = di3.C86312j.m106911c(r1)
            ht1.u1 r1 = (ht1.C60206u1) r1
            int r1 = r1.mo60945Dg()
            if (r1 != r9) goto L_0x018c
            di3.d r0 = di3.C86312j.m106911c(r0)
            java.lang.String r1 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            ht1.t1 r0 = (ht1.C60200t1) r0
            android.content.res.Resources r1 = r19.getResources()
            r2 = 2131830090(0x7f11254a, float:1.9293168E38)
            java.lang.String r2 = r1.getString(r2)
            r3 = 500(0x1f4, double:2.47E-321)
            r5 = 0
            r1 = r19
            ht1.l5 r0 = r0.mo76878tN(r1, r2, r3, r5)
            r0.begin()
            zt3.t r1 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.finder.ui.n r2 = new com.tencent.mm.plugin.finder.ui.n
            r2.<init>(r10, r0, r7)
            zt3.j r1 = (zt3.C119157j) r1
            r1.mo183875f(r2)
            goto L_0x018f
        L_0x018c:
            r7.mo79065f8(r10)
        L_0x018f:
            return r9
        L_0x0190:
            r0 = 32
            if (r3 != r0) goto L_0x025d
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r1 = "min_select_count"
            int r0 = r0.getIntExtra(r1, r4)
            com.tencent.mm.plugin.gallery.ui.a r1 = r7.f271290h
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r1 = r1.f271542g
            int r1 = r1.size()
            if (r1 >= r0) goto L_0x01c9
            androidx.appcompat.app.AppCompatActivity r1 = r19.getContext()
            androidx.appcompat.app.AppCompatActivity r2 = r19.getContext()
            android.content.res.Resources r2 = r2.getResources()
            if (r2 == 0) goto L_0x01c5
            r3 = 2131689488(0x7f0f0010, float:1.9007993E38)
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r5[r4] = r6
            java.lang.String r6 = r2.getQuantityString(r3, r0, r5)
        L_0x01c5:
            nj3.C76879j.m92726T(r1, r6)
            return r4
        L_0x01c9:
            java.util.ArrayList r0 = new java.util.ArrayList
            com.tencent.mm.plugin.gallery.ui.a r1 = r7.f271290h
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r1 = r1.f271542g
            r0.<init>(r1)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x01dc
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r5)
            return r4
        L_0x01dc:
            android.content.Intent r1 = r19.getIntent()
            java.lang.String r3 = "KEY_FINDER_POST_MUSIC_INFO"
            byte[] r1 = r1.getByteArrayExtra(r3)
            r3 = 294(0x126, float:4.12E-43)
            if (r1 != 0) goto L_0x01fd
            java.lang.String r1 = "perform enter template preview ui"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            di3.d r1 = di3.C86312j.m106911c(r2)
            da0.e r1 = (da0.C58247e) r1
            android.content.Intent r2 = r19.getIntent()
            r1.wq0(r7, r3, r0, r2)
            goto L_0x025c
        L_0x01fd:
            java.lang.String r1 = "perform enter music template preview ui"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            java.util.Iterator r1 = r0.iterator()
        L_0x0206:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0220
            java.lang.Object r5 = r1.next()
            r8 = r5
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r8 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r8
            int r8 = r8.getType()
            r10 = 2
            if (r8 != r10) goto L_0x021c
            r8 = 1
            goto L_0x021d
        L_0x021c:
            r8 = 0
        L_0x021d:
            if (r8 == 0) goto L_0x0206
            r6 = r5
        L_0x0220:
            if (r6 != 0) goto L_0x0224
            r1 = 1
            goto L_0x0225
        L_0x0224:
            r1 = 0
        L_0x0225:
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r5 = r7.mo79067i8(r0)
            if (r1 == 0) goto L_0x022d
            r1 = 3
            goto L_0x022e
        L_0x022d:
            r1 = 4
        L_0x022e:
            di3.d r2 = di3.C86312j.m106911c(r2)
            da0.e r2 = (da0.C58247e) r2
            android.content.Intent r6 = r19.getIntent()
            java.lang.Class<ht1.e4> r8 = ht1.C60165e4.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            ht1.e4 r8 = (ht1.C60165e4) r8
            r8.mo85161WM(r7, r6)
            java.lang.String r8 = "KEY_PARAMS_CONFIG"
            r6.putExtra(r8, r5)
            java.lang.String r5 = "KEY_PARAMS_TO_WHERE"
            r6.putExtra(r5, r1)
            java.lang.String r1 = "KEY_PARAMS_EXIT_ANIM"
            r6.putExtra(r1, r4)
            java.lang.String r1 = "KEY_PARAMS_SELECTED_BIZ_INT"
            r6.putExtra(r1, r4)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r2.mo82977HH(r7, r3, r0, r6)
        L_0x025c:
            return r9
        L_0x025d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderAlbumUI.mo77422V7():boolean");
    }

    /* renamed from: f8 */
    public final void mo79065f8(ArrayList<GalleryItem$MediaItem> arrayList) {
        FinderVideoShell finderVideoShell = FinderVideoShell.f82198a;
        Log.m105924i("MicroMsg.FinderVideoShell", "markExitAlbum");
        if (FinderVideoShell.f82203f <= 0) {
            FinderVideoShell.f82203f = Util.currentTicks();
        }
        mo79066g8(arrayList);
    }

    /* renamed from: g8 */
    public final void mo79066g8(ArrayList<GalleryItem$MediaItem> arrayList) {
        String str;
        boolean z;
        T t;
        boolean z2;
        Class cls = C60165e4.class;
        Class cls2 = C58247e.class;
        C60165e4 e4Var = (C60165e4) C86312j.m106911c(cls);
        FinderFeedReportObject Dc = ((C63291f) C86312j.m106911c(C63291f.class)).mo83237Dc();
        if (Dc == null || (str = Dc.flowId) == null) {
            str = "";
        }
        e4Var.mo85149Lb(str);
        Iterator<T> it = arrayList.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((GalleryItem$MediaItem) t).getType() == 2) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        if (t != null) {
            z = false;
        }
        RecordConfigProvider i8 = mo79067i8(arrayList);
        int i = z ? 3 : 4;
        CaptureDataManager.f272890c.f272891a = this;
        if (this.f161021z1 || !((C58247e) C86312j.m106911c(cls2)).yf0().mo8427b() || !((C58247e) C86312j.m106911c(cls2)).mo82982Tl().mo71103a("scene_finder")) {
            C8532a.f27585a.mo9446e(getContext(), JsApiSetAudioState.CTRL_INDEX, 0, 0, i8, i, 0);
            return;
        }
        Intent intent = new Intent();
        ((C60165e4) C86312j.m106911c(cls)).mo85161WM(this, intent);
        intent.putExtra("KEY_PARAMS_CONFIG", i8);
        intent.putExtra("KEY_PARAMS_TO_WHERE", i);
        intent.putExtra("KEY_PARAMS_EXIT_ANIM", 0);
        intent.putExtra("KEY_PARAMS_SELECTED_BIZ_INT", 0);
        C13598b0 b0Var = C13598b0.f38549a;
        ((C58247e) C86312j.m106911c(cls2)).mo82977HH(this, 294, arrayList, intent);
    }

    /* renamed from: i2 */
    public void mo4197i2(Context context, CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel, Bundle bundle) {
        byte[] byteArray;
        ArrayList parcelableArrayList;
        byte[] byteArray2;
        byte[] byteArray3;
        CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel2 = captureVideoNormalModel;
        Bundle bundle2 = bundle;
        Class cls = C61381b.class;
        ((C63291f) C86312j.m106911c(C63291f.class)).mo83238XL(C110992d.f332425a.mo162676j());
        if (captureVideoNormalModel2 != null) {
            Intent intent = new Intent();
            if (this.f161017C1) {
                intent.putExtras(getIntent());
            }
            if (!(bundle2 == null || (byteArray3 = bundle2.getByteArray("MEDIA_EXTRA_MUSIC")) == null)) {
                intent.putExtra("MEDIA_EXTRA_MUSIC", byteArray3);
            }
            if (!(bundle2 == null || (byteArray2 = bundle2.getByteArray("ORIGIN_MUSIC_INFO")) == null)) {
                intent.putExtra("ORIGIN_MUSIC_INFO", byteArray2);
            }
            C61926c.m72684i(intent, bundle2, "ORIGIN_MUSIC_ID");
            C61926c.m72684i(intent, bundle2, "ORIGIN_MUSIC_PATH");
            C61926c.m72684i(intent, bundle2, "ORIGIN_BGM_URL");
            Intent intent2 = intent;
            Bundle bundle3 = bundle;
            C61926c.m72679d(intent2, bundle3, "MEDIA_IS_MUTE", false, 4, (Object) null);
            C61926c.m72679d(intent2, bundle3, "MUSIC_IS_MUTE", false, 4, (Object) null);
            C61926c.m72681f(intent2, bundle3, "SOUND_TRACK_TYPE", 0, 4, (Object) null);
            C61926c.m72684i(intent, bundle2, "MUSIC_FEED_ID");
            if (!(bundle2 == null || (parcelableArrayList = bundle2.getParcelableArrayList("KEY_POST_HALF_RECT_LIST")) == null)) {
                intent.putExtra("KEY_POST_HALF_RECT_LIST", parcelableArrayList);
            }
            ArrayList arrayList = (ArrayList) captureVideoNormalModel.mo129798a().mo129811b("KEY_IMAGE_QUALITY_INT_ARRAY", new ArrayList());
            List<String> list = captureVideoNormalModel2.f272899j;
            if (list == null || list.size() <= 0) {
                if (!(bundle2 == null || (byteArray = bundle2.getByteArray("video_composition")) == null)) {
                    intent.putExtra("video_composition", byteArray);
                }
                intent.putExtra("postType", 4);
                intent.putExtra("postMediaList", C64197v.m75534c(captureVideoNormalModel2.f272894e));
                intent.putExtra("postTypeList", C64197v.m75534c(4));
                intent.putExtra("postThumbList", C64197v.m75534c(captureVideoNormalModel2.f272895f));
                if (arrayList != null && arrayList.size() == 1) {
                    intent.putExtra("key_post_media_quality_list", arrayList);
                }
            } else {
                intent.putExtra("postType", 2);
                List<String> list2 = captureVideoNormalModel2.f272899j;
                C87412m.m108593f(list2, "model.multiImagePath");
                ArrayList arrayList2 = new ArrayList();
                for (String add : list2) {
                    arrayList2.add(add);
                }
                intent.putExtra("postMediaList", arrayList2);
                List<String> list3 = captureVideoNormalModel2.f272899j;
                C87412m.m108593f(list3, "model.multiImagePath");
                ArrayList arrayList3 = new ArrayList();
                for (String str : list3) {
                    arrayList3.add(2);
                }
                intent.putExtra("postTypeList", arrayList3);
                intent.putExtra("postThumbList", C64197v.m75534c(captureVideoNormalModel2.f272895f));
                if (arrayList != null && arrayList.size() == captureVideoNormalModel2.f272899j.size()) {
                    intent.putExtra("key_post_media_quality_list", arrayList);
                }
                C61926c.m72683h(intent, bundle2, "KEY_POST_HALF_IMAGE_LIST");
            }
            intent.putExtra("post_id", this.f161020y1);
            intent.putExtra("edit_id", (String) captureVideoNormalModel.mo129798a().mo129811b("KEY_MULTI_MEDIA_EDIT_ID_STRING", ""));
            C61926c.m72684i(intent, bundle2, "KEY_POST_ORIGIN_FILE_PATH");
            ((C61381b) C86312j.m106911c(cls)).Yp0().mo88196g(intent, getIntent());
            ((C61381b) C86312j.m106911c(cls)).Yp0().mo88189a(this, intent);
            CaptureDataManager.f272890c.f272891a = null;
        }
    }

    /* renamed from: i8 */
    public final RecordConfigProvider mo79067i8(ArrayList<GalleryItem$MediaItem> arrayList) {
        Class cls = C60206u1.class;
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("media_list", arrayList);
        bundle.putString("FINDER_CONTEXT_ID", getIntent().getStringExtra("key_finder_context_id"));
        bundle.putString("FINDER_SESSION_ID", getIntent().getStringExtra("key_finder_session_id"));
        bundle.putString("key_click_tab_context_id", getIntent().getStringExtra("key_click_tab_context_id"));
        bundle.putString("post_id", this.f161020y1);
        bundle.putString("KEY_ORIGIN_MUSIC_ID", getIntent().getStringExtra("KEY_FINDER_POST_ORIGIN_MUSIC_ID"));
        bundle.putString("KEY_ORIGIN_BGM_URL", getIntent().getStringExtra("KEY_FINDER_POST_ORIGIN_BGM_URL"));
        bundle.putString("KEY_ORIGIN_MUSIC_PATH", getIntent().getStringExtra("KEY_FINDER_POST_ORIGIN_MUSIC_PATH"));
        bundle.putString("KEY_ORIGIN_MUSIC_NAME", getIntent().getStringExtra("KEY_FINDER_POST_ORIGIN_MUSIC_NAME"));
        bundle.putByteArray("KEY_ORIGIN_MUSIC_INFO", getIntent().getByteArrayExtra("KEY_FINDER_POST_ORIGIN_MUSIC_INFO"));
        bundle.putBoolean("KEY_BGM_IF_ORIGIN", getIntent().getBooleanExtra("KEY_FINDER_POST_BGM_IF_ORIGIN", false));
        bundle.putBoolean("KEY_FULLSCREEN", true);
        bundle.putInt("KEY_MEDIA_SOURCE_FROM", 1);
        Point h = C85875k4.m106184h(this);
        C13605o<Integer, Integer, Integer> Z5 = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83779Z5(getBaseContext(), h.x, h.y);
        B b = Z5.f38558e;
        C87412m.m108593f(b, "size.second");
        int intValue = ((Number) b).intValue();
        C c = Z5.f38559f;
        C87412m.m108593f(c, "size.third");
        Point point = new Point(intValue, ((Number) c).intValue());
        bundle.putInt("KEY_PREVIEW_WIDTH", point.x);
        bundle.putInt("KEY_PREVIEW_HEIGHT", point.y);
        bundle.putLong("video_max_duration", mo79069k8());
        bundle.putLong("video_track_max_duration", mo79069k8());
        bundle.putInt("image_max_height", ((C60206u1) C86312j.m106911c(cls)).mo60950Yw());
        bundle.putInt("image_max_width", ((C60206u1) C86312j.m106911c(cls)).mo60943Ab());
        bundle.putInt("image_compress_quality", ((C60206u1) C86312j.m106911c(cls)).rh0());
        bundle.putString("output_dir", ((C61381b) C86312j.m106911c(C61381b.class)).mo78541Ea());
        RecordConfigProvider a = C97947b.f287286a.mo137257a();
        a.f272912M = bundle;
        long longExtra = getIntent().getLongExtra("key_ref_feed_id", 0);
        int intExtra = getIntent().getIntExtra("key_ref_comment_scene", 0);
        if (a.f272908I == null) {
            a.f272908I = new VideoCaptureReportInfo();
        }
        VideoCaptureReportInfo videoCaptureReportInfo = a.f272908I;
        if (videoCaptureReportInfo != null) {
            videoCaptureReportInfo.f272944h = longExtra;
        }
        if (videoCaptureReportInfo != null) {
            videoCaptureReportInfo.f272943g = intExtra;
        }
        return a;
    }

    public void initView() {
        Class cls = C58247e.class;
        super.initView();
        boolean z = false;
        removeOptionMenu(0);
        MMActivityController controller = getController();
        controller.f348076Q = true;
        controller.mo177049H0(true);
        controller.mo177051I0();
        addTextOptionMenu(0, mo79070l8(), this.f271295j1, (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        this.f271282d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        mo128958e8(0);
        String stringExtra = getIntent().getStringExtra("KEY_FINDER_POST_ORIGIN_MUSIC_ID");
        if (stringExtra == null || stringExtra.length() == 0) {
            z = true;
        }
        boolean z2 = !z;
        this.f161021z1 = z2;
        if (!z2 && ((C58247e) C86312j.m106911c(cls)).yf0().mo8427b()) {
            if (((C58247e) C86312j.m106911c(cls)).mo82982Tl().mo71103a("scene_finder")) {
                ((C58247e) C86312j.m106911c(cls)).On0();
                Log.m105924i("Finder.AlbumUI", "has maas permission");
            } else if (((C58247e) C86312j.m106911c(cls)).mo82982Tl().mo71105c("scene_finder")) {
                Log.m105924i("Finder.AlbumUI", "requested maas permission and denied");
                mo79072n8(true);
            } else {
                ((C58247e) C86312j.m106911c(cls)).mo82982Tl().mo71104b("scene_finder", this, new C56412q(this), new C56416r(this));
            }
        }
    }

    /* renamed from: j8 */
    public final int mo79068j8() {
        return Math.max(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ultron_album_video_max_select_duration_android, 300), ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83778Y5() - 1);
    }

    /* renamed from: k8 */
    public final long mo79069k8() {
        Class cls = C60206u1.class;
        return ((long) (((C60206u1) C86312j.m106911c(cls)).mo60953lE() == 1 ? ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83778Y5() : ((C60206u1) C86312j.m106911c(cls)).Hl0())) * 1000;
    }

    /* renamed from: l1 */
    public boolean mo4198l1(Context context, Bundle bundle, CaptureDataManager.C94402a aVar) {
        return false;
    }

    /* renamed from: l8 */
    public final String mo79070l8() {
        int size = this.f271290h.f271542g.size();
        if (size > 0) {
            return getContext().getResources().getString(C0966R.string.f360089a13) + '(' + size + XVFSFile.SEPARATOR_CHAR + this.f271257N + ')';
        }
        String string = getContext().getResources().getString(C0966R.string.f360089a13);
        C87412m.m108593f(string, "context.resources.getStr…ui.R.string.app_nextstep)");
        return string;
    }

    /* renamed from: m8 */
    public final void mo79071m8(int i) {
        Intent intent = new Intent(this, ImagePreviewUI.class);
        intent.putStringArrayListExtra("preview_image_list", this.f271290h.mo129055w5());
        intent.putParcelableArrayListExtra("preview_media_item_list", this.f271290h.f271542g);
        intent.putExtra("preview_all", true);
        intent.putExtra("preview_position", i);
        mo128948Q7(i, true);
        intent.putExtra("send_raw_img", this.f271249F);
        intent.putExtra("key_force_hide_edit_image_button", true);
        intent.putExtra("max_select_count", this.f271257N);
        intent.putExtra("GalleryUI_FromUser", this.f271263S);
        intent.putExtra("GalleryUI_ToUser", this.f271265T);
        intent.putExtra("album_business_tag", this.f271275Y);
        intent.putExtra("album_video_max_duration", Math.max(this.f271277Z, mo79068j8()));
        intent.putExtra("album_video_min_duration", this.f271304p0);
        intent.putExtra("media_type", 2);
        intent.putExtra("key_support_max_ratio", 3.0f);
        if (C93958f.m118750j().f271196f == 14) {
            intent.putExtra("key_edit_video_max_time_length", 300500);
        }
        startActivityForResult(intent, 0);
    }

    /* renamed from: n8 */
    public final void mo79072n8(boolean z) {
        int i = 0;
        ((LinearLayout) findViewById(C0966R.C0970id.fkd)).setVisibility(z ? 0 : 8);
        ((TextView) findViewById(C0966R.C0970id.fvj)).setText(C0966R.string.m1y);
        TextView textView = (TextView) findViewById(C0966R.C0970id.f359357ma0);
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
        textView.setOnClickListener(new C56327c(this));
    }

    /* renamed from: o8 */
    public final void mo79073o8(String str, String str2, int i, long j, int i2) {
        FinderPostSelectPageActionStruct finderPostSelectPageActionStruct = new FinderPostSelectPageActionStruct();
        finderPostSelectPageActionStruct.f155817d = finderPostSelectPageActionStruct.mo86045b("ClickId", str, true);
        finderPostSelectPageActionStruct.f155818e = finderPostSelectPageActionStruct.mo86045b("PostId", str2, true);
        finderPostSelectPageActionStruct.f155819f = (long) i;
        finderPostSelectPageActionStruct.f155820g = j;
        finderPostSelectPageActionStruct.f155821h = (long) i2;
        finderPostSelectPageActionStruct.mo86054n();
        StringBuilder sb = new StringBuilder();
        sb.append("report");
        sb.append(21149);
        sb.append(' ');
        String q = finderPostSelectPageActionStruct.mo1006q();
        C87412m.m108593f(q, "struct.toShowString()");
        sb.append(C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
        Log.m105924i("Finder.AlbumUI", sb.toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.Collection] */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onActivityResult requestCode "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = " resultCod "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.AlbumUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r0 = -1
            r1 = 1001(0x3e9, float:1.403E-42)
            if (r6 != r1) goto L_0x002d
            if (r7 != r0) goto L_0x002d
            r5.setResult(r0, r8)
            r5.finish()
            goto L_0x0121
        L_0x002d:
            r1 = 25
            r2 = 0
            if (r7 != r1) goto L_0x005e
            if (r8 == 0) goto L_0x003a
            java.lang.String r6 = "preview_image_list"
            java.util.ArrayList r2 = r8.getStringArrayListExtra(r6)
        L_0x003a:
            if (r2 == 0) goto L_0x0059
            com.tencent.mm.plugin.gallery.ui.a r6 = r5.f271290h
            if (r6 == 0) goto L_0x0059
            java.util.ArrayList r7 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118751k()
            if (r7 != 0) goto L_0x004a
            com.tencent.mm.plugin.gallery.ui.a r7 = r5.f271290h
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r7 = r7.f271541f
        L_0x004a:
            r6.mo129044P5(r2, r7)
            com.tencent.mm.plugin.gallery.ui.a r6 = r5.f271290h
            r6.notifyDataSetChanged()
            int r6 = r2.size()
            r5.mo128958e8(r6)
        L_0x0059:
            r5.mo77422V7()
            goto L_0x0121
        L_0x005e:
            r1 = 291(0x123, float:4.08E-43)
            java.lang.String r3 = "KSEGMENTMEDIAINFO"
            r4 = 1
            if (r1 != r6) goto L_0x0093
            if (r7 != r0) goto L_0x0093
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r4)
            gy3.C87412m.m108591d(r8)
            android.os.Parcelable r7 = r8.getParcelableExtra(r3)
            gy3.C87412m.m108591d(r7)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r7 = (com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.CaptureVideoNormalModel) r7
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r8 = new com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem
            r8.<init>()
            java.lang.String r0 = r7.f272894e
            r8.f162747d = r0
            java.lang.String r0 = r7.f272895f
            r8.f162750g = r0
            java.lang.Long r7 = r7.f272896g
            long r0 = r7.longValue()
            int r7 = (int) r0
            r8.f162766w = r7
            r6.add(r8)
            goto L_0x0121
        L_0x0093:
            r1 = 292(0x124, float:4.09E-43)
            if (r1 != r6) goto L_0x00a9
            if (r8 == 0) goto L_0x00a0
            android.os.Parcelable r6 = r8.getParcelableExtra(r3)
            r2 = r6
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r2 = (com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.CaptureVideoNormalModel) r2
        L_0x00a0:
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r6 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r6 = r6.f272892b
            r5.mo4197i2(r5, r2, r6)
            goto L_0x0121
        L_0x00a9:
            r1 = 293(0x125, float:4.1E-43)
            if (r1 != r6) goto L_0x00b4
            if (r7 != r0) goto L_0x00b4
            r5.finish()
            goto L_0x0121
        L_0x00b4:
            r1 = 294(0x126, float:4.12E-43)
            if (r1 != r6) goto L_0x00cc
            if (r7 != r0) goto L_0x00cc
            java.lang.Class<da0.e> r6 = da0.C58247e.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            da0.e r6 = (da0.C58247e) r6
            r6.Ln0()
            r5.setResult(r0)
            r5.finish()
            goto L_0x0121
        L_0x00cc:
            r7 = 4382(0x111e, float:6.14E-42)
            if (r7 != r6) goto L_0x0115
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            if (r8 == 0) goto L_0x00de
            java.lang.String r7 = "CropImage_OutputPath_List"
            java.util.ArrayList r7 = r8.getStringArrayListExtra(r7)
            goto L_0x00df
        L_0x00de:
            r7 = r2
        L_0x00df:
            if (r8 == 0) goto L_0x00e7
            java.lang.String r0 = "key_select_video_list"
            java.util.ArrayList r2 = r8.getStringArrayListExtra(r0)
        L_0x00e7:
            if (r7 == 0) goto L_0x00ec
            r6.addAll(r7)
        L_0x00ec:
            if (r2 == 0) goto L_0x00f1
            r6.addAll(r2)
        L_0x00f1:
            boolean r7 = r6.isEmpty()
            r7 = r7 ^ r4
            if (r7 == 0) goto L_0x0111
            com.tencent.mm.plugin.gallery.ui.a r7 = r5.f271290h
            if (r7 == 0) goto L_0x0111
            android.net.Uri r8 = com.tencent.p014mm.plugin.gallery.model.C93974o.f271204e
            com.tencent.mm.plugin.gallery.model.o r8 = com.tencent.p014mm.plugin.gallery.model.C93974o.C93984j.f271235a
            java.util.List<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r8 = r8.f271208d
            r7.mo129044P5(r6, r8)
            com.tencent.mm.plugin.gallery.ui.a r7 = r5.f271290h
            r7.notifyDataSetChanged()
            int r6 = r6.size()
            r5.mo128958e8(r6)
        L_0x0111:
            r5.mo77422V7()
            goto L_0x0121
        L_0x0115:
            r7 = 295(0x127, float:4.13E-43)
            if (r7 != r6) goto L_0x0121
            if (r6 != r0) goto L_0x0121
            r5.setResult(r0)
            r5.finish()
        L_0x0121:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderAlbumUI.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            java.lang.Class<ht1.e4> r0 = ht1.C60165e4.class
            java.lang.Class<qo1.f> r1 = qo1.C63291f.class
            super.onCreate(r10)
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r2 = "key_finder_post_id"
            java.lang.String r10 = r10.getStringExtra(r2)
            if (r10 != 0) goto L_0x0033
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            f40.e r2 = f40.C86709a0.m107523b()
            java.lang.String r2 = r2.mo121111i()
            r10.append(r2)
            r2 = 95
            r10.append(r2)
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r10.append(r2)
            java.lang.String r10 = r10.toString()
        L_0x0033:
            r9.f161020y1 = r10
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r2 = "album_from_finder_add_media"
            r3 = 0
            boolean r10 = r10.getBooleanExtra(r2, r3)
            r9.f161017C1 = r10
            di3.d r10 = di3.C86312j.m106911c(r1)
            java.lang.String r2 = "getService(IFinderPostLogicService::class.java)"
            gy3.C87412m.m108593f(r10, r2)
            qo1.f r10 = (qo1.C63291f) r10
            java.lang.String r2 = r9.f161020y1
            r4 = 0
            r10.i20(r2, r4)
            qw1.b r10 = qw1.C63339b.f179706a
            org.json.JSONObject r10 = new org.json.JSONObject
            java.util.HashMap<java.lang.Integer, org.json.JSONObject> r2 = qw1.C63339b.f179707b
            r5 = -1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r2.get(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r10.<init>(r6)
            java.lang.String r6 = "qt-file"
            r7 = 1
            r10.put(r6, r7)
            r6 = 25
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2.put(r6, r10)
            di3.d r10 = di3.C86312j.m106911c(r0)
            java.lang.String r2 = "getService(IFinderReport…atureService::class.java)"
            gy3.C87412m.m108593f(r10, r2)
            ht1.e4 r10 = (ht1.C60165e4) r10
            r2 = 100
            r10.mo85156Qn(r9, r2, r3)
            di3.d r10 = di3.C86312j.m106911c(r0)
            ht1.e4 r10 = (ht1.C60165e4) r10
            di3.d r0 = di3.C86312j.m106911c(r1)
            qo1.f r0 = (qo1.C63291f) r0
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = r0.mo83237Dc()
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x00a0
            java.lang.String r0 = r0.flowId
            if (r0 != 0) goto L_0x00a1
        L_0x00a0:
            r0 = r1
        L_0x00a1:
            r10.mo85149Lb(r0)
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r0 = "KEY_FINDER_POST_MUSIC_INFO"
            byte[] r10 = r10.getByteArrayExtra(r0)
            te3.td1 r0 = new te3.td1
            r0.<init>()
            java.lang.String r2 = "safeParser"
            if (r10 != 0) goto L_0x00b8
            goto L_0x00c4
        L_0x00b8:
            r0.parseFrom(r10)     // Catch:{ Exception -> 0x00bc }
            goto L_0x00c5
        L_0x00bc:
            r10 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r3] = r10
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r1, r0)
        L_0x00c4:
            r0 = r4
        L_0x00c5:
            java.lang.String r10 = "Finder.AlbumUI"
            if (r0 != 0) goto L_0x00cf
            java.lang.String r0 = "onHeaderClicked: get music info pb error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            goto L_0x0135
        L_0x00cf:
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            r9.f161019E1 = r6
            java.lang.String r0 = r0.f185546s
            java.lang.String r8 = "songid"
            r6.put(r8, r0)
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r6 = "key_template_square_chosen_pos"
            int r0 = r0.getIntExtra(r6, r5)
            if (r0 != r5) goto L_0x00eb
            goto L_0x0135
        L_0x00eb:
            android.content.Intent r5 = r9.getIntent()
            java.lang.String r6 = "key_template_square_rsp_pb"
            byte[] r5 = r5.getByteArrayExtra(r6)
            if (r5 != 0) goto L_0x00f9
            byte[] r5 = new byte[r3]
        L_0x00f9:
            te3.y92 r6 = new te3.y92
            r6.<init>()
            r6.parseFrom(r5)     // Catch:{ Exception -> 0x0102 }
            goto L_0x010b
        L_0x0102:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r7]
            r6[r3] = r5
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r1, r6)
            r6 = r4
        L_0x010b:
            if (r6 == 0) goto L_0x010f
            java.util.LinkedList<te3.pr4> r4 = r6.f145188d
        L_0x010f:
            if (r4 != 0) goto L_0x0117
            java.lang.String r0 = "checkMusicTopicPost: template list parse error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            goto L_0x0135
        L_0x0117:
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x0123
            java.lang.String r0 = "checkMusicTopicPost: template list is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            goto L_0x0135
        L_0x0123:
            org.json.JSONObject r10 = r9.f161019E1
            if (r10 == 0) goto L_0x0135
            java.lang.Object r0 = r4.get(r0)
            te3.pr4 r0 = (te3.pr4) r0
            java.lang.String r0 = r0.f139919d
            java.lang.String r1 = "templateid"
            r10.put(r1, r0)
        L_0x0135:
            java.lang.Class<l31.e> r10 = l31.C61212e.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            l31.e r10 = (l31.C61212e) r10
            o31.b r0 = o31.C11345b.FinderAlbumUI
            l31.e r10 = r10.mo86178qr(r9, r0)
            o31.a r0 = o31.C76986a.Finder
            r10.mo86179qs(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderAlbumUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        Class cls = C58247e.class;
        CaptureDataManager.f272890c.f272891a = null;
        if (!this.f161021z1 && ((C58247e) C86312j.m106911c(cls)).yf0().mo8427b() && getIntent().getByteArrayExtra("KEY_FINDER_POST_MUSIC_INFO") == null) {
            ((C58247e) C86312j.m106911c(cls)).Ln0();
        }
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
        this.f161018D1 = System.currentTimeMillis();
        C8847a.m8677a(C8847a.f28097a, 100, 0, 0, 0, this.f161019E1, (String) null, (C49712hj1) null, 108, (Object) null);
    }

    public void onStart() {
        super.onStart();
    }

    /* renamed from: p8 */
    public final void mo79074p8(String str, String str2, String str3) {
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[3];
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        if (str2 == null) {
            str2 = "";
        }
        objArr[1] = str2;
        if (str3 == null) {
            str3 = "";
        }
        objArr[2] = str3;
        nVar.mo160131h(19441, objArr);
        nVar.mo175913w(1253, 33, 1);
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        ((C61381b) C86312j.m106911c(C61381b.class)).mo78543NY(hashSet);
        hashSet.add(C3846k.class);
    }

    public void updateOptionMenuText(int i, String str) {
        super.updateOptionMenuText(i, mo79070l8());
    }
}
