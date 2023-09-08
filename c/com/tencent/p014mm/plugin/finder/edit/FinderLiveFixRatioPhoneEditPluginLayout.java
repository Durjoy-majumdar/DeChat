package com.tencent.p014mm.plugin.finder.edit;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import cf1.C104359b;
import cf1.C104360c;
import cf1.C104361d;
import cf1.C104363e;
import cf1.C104364f;
import cf1.C67357a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.cache.ArtistCacheManager;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.EditPhotoPluginLayout;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.xweb.file.XVFSFile;
import cq3.C106952a;
import er1.C7919x;
import fy3.C32226l;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;
import me3.C109612c;
import me3.C109623f;
import qh2.C101198e;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0014B\u001b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0015"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/edit/FinderLiveFixRatioPhoneEditPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/EditPhotoPluginLayout;", "", "path", "Lrx3/b0;", "setOutputSize", "Landroid/view/ViewGroup;", "w", "Landroid/view/ViewGroup;", "getLayout", "()Landroid/view/ViewGroup;", "setLayout", "(Landroid/view/ViewGroup;)V", "layout", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "plugin-vlog-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout */
public final class FinderLiveFixRatioPhoneEditPluginLayout extends EditPhotoPluginLayout {

    /* renamed from: x */
    public static final C105252a f312705x = new C105252a();

    /* renamed from: w */
    public ViewGroup f312706w;

    /* renamed from: com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout$a */
    public static final class C105252a {
    }

    /* renamed from: com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout$b */
    public static final class C105253b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveFixRatioPhoneEditPluginLayout f312707d;

        public C105253b(FinderLiveFixRatioPhoneEditPluginLayout finderLiveFixRatioPhoneEditPluginLayout) {
            this.f312707d = finderLiveFixRatioPhoneEditPluginLayout;
        }

        public final void run() {
            C101198e.C62622a.m73576a(this.f312707d, C101198e.C101199b.EDIT_PHOTO_CROP, (Bundle) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveFixRatioPhoneEditPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        ArtistCacheManager a = ArtistCacheManager.m140185a();
        f312705x.getClass();
        String str = VFSStrategy.m163776d("finder") + XVFSFile.SEPARATOR_CHAR;
        Log.m105924i("MicroMsg.EditPhotoPluginLayout", "FINDER_DATA_ROOT=" + str);
        String str2 = str + "image/";
        Log.m105924i("MicroMsg.EditPhotoPluginLayout", "FINDER_IMG_DIR=" + str2);
        a.mo148163f(str2 + "cover_edit_for_output");
    }

    private final void setOutputSize(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapUtil.decodeFile(str, options);
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            Log.m105924i("MicroMsg.EditPhotoPluginLayout", "setOutputSize getOption error. path:" + str);
            return;
        }
        Log.m105924i("MicroMsg.EditPhotoPluginLayout", "setOutputSize config[origin[" + options.outWidth + ',' + options.outHeight + "] target[" + 1080 + ',' + 1440 + ']');
        C109623f fVar = getEditPhotoWrapper().f327415o;
        if (fVar != null) {
            ((C109612c) fVar).mo160833q(1080, 1440);
        }
    }

    public final ViewGroup getLayout() {
        return this.f312706w;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r1 = r1.f272912M;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo129855l(h90.C98324b r5) {
        /*
            r4 = this;
            super.mo129855l(r5)
            lh2.r r0 = r4.getEditPhotoWrapper()
            me3.f r0 = r0.f327415o
            if (r0 != 0) goto L_0x000c
            goto L_0x0023
        L_0x000c:
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r1 = r4.getConfigProvider()
            if (r1 == 0) goto L_0x001d
            android.os.Bundle r1 = r1.f272912M
            if (r1 == 0) goto L_0x001d
            java.lang.String r2 = "crop_fix_ratio"
            float r1 = r1.getFloat(r2)
            goto L_0x001f
        L_0x001d:
            r1 = 1058013184(0x3f100000, float:0.5625)
        L_0x001f:
            me3.c r0 = (me3.C109612c) r0
            r0.f328166i = r1
        L_0x0023:
            lh2.r r0 = r4.getEditPhotoWrapper()
            me3.f r0 = r0.f327415o
            boolean r1 = r0 instanceof me3.C109612c
            if (r1 == 0) goto L_0x0030
            me3.c r0 = (me3.C109612c) r0
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            if (r0 == 0) goto L_0x0060
            r1 = 1
            r0.f328167j = r1
            java.util.LinkedList<bh.b> r0 = r0.f328161d
            java.util.Iterator r0 = r0.iterator()
        L_0x003c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0060
            java.lang.Object r1 = r0.next()
            bh.b r1 = (p1093bh.C104085b) r1
            boolean r2 = r1 instanceof p1093bh.C104090d
            if (r2 == 0) goto L_0x003c
            bh.d r1 = (p1093bh.C104090d) r1
            r2 = 0
            r1.f307899A = r2
            android.content.res.Resources r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            r3 = 2131165346(0x7f0700a2, float:1.7944907E38)
            float r2 = r2.getDimension(r3)
            int r2 = (int) r2
            r1.f307918o = r2
            goto L_0x003c
        L_0x0060:
            lh2.w r0 = r4.getPhotoControlUI()
            android.view.ViewGroup r0 = r0.f327428d
            r1 = 8
            r0.setVisibility(r1)
            com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout$b r0 = new com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout$b
            r0.<init>(r4)
            r1 = 300(0x12c, double:1.48E-321)
            r4.postDelayed(r0, r1)
            if (r5 == 0) goto L_0x007c
            java.lang.String r5 = r5.f288189j
            r4.setOutputSize(r5)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout.mo129855l(h90.b):void");
    }

    /* renamed from: p */
    public void mo14585p(C101198e.C101199b bVar, Bundle bundle) {
        Bundle bundle2;
        C106952a baseBoardView;
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 67) {
            super.mo14585p(bVar, bundle);
            getPhotoControlUI().f327428d.setVisibility(8);
            View.inflate(getContext(), C0966R.C0971layout.f7201wq, this);
            ViewGroup viewGroup = (ViewGroup) findViewById(C0966R.C0970id.om8);
            this.f312706w = viewGroup;
            if (viewGroup != null) {
                viewGroup.setPadding(0, C75044y4.m89994f(getContext()) + C76577a.m92151b(getContext(), 8), 0, C75044y4.m89991c(getContext()) + C76577a.m92151b(getContext(), 24));
            }
            ImageView imageView = (ImageView) findViewById(C0966R.C0970id.om9);
            Button button = (Button) findViewById(C0966R.C0970id.omd);
            Button button2 = (Button) findViewById(C0966R.C0970id.om_);
            Button button3 = (Button) findViewById(C0966R.C0970id.ome);
            Button button4 = (Button) findViewById(C0966R.C0970id.oma);
            C87412m.m108593f(button4, "finishBtn");
            C7919x.m8091a(button4);
            ViewGroup viewGroup2 = this.f312706w;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
            }
            C109623f fVar = getEditPhotoWrapper().f327415o;
            if (!(fVar == null || (baseBoardView = ((C109612c) fVar).f328158a.getBaseBoardView()) == null)) {
                baseBoardView.setOnTouchListener(new C67357a(button3, this));
            }
            imageView.setOnClickListener(new C104359b(this));
            RecordConfigProvider configProvider = getConfigProvider();
            boolean z = true;
            if (configProvider == null || (bundle2 = configProvider.f272912M) == null || !bundle2.getBoolean("can_show_preview", false)) {
                z = false;
            }
            if (z) {
                button.setVisibility(0);
            } else {
                button.setVisibility(8);
            }
            button.setOnClickListener(new C104360c(this));
            button2.setOnClickListener(new C104361d(this));
            button3.setOnClickListener(new C104363e(this, button3));
            button4.setOnClickListener(new C104364f(this));
        } else if (ordinal != 74 && ordinal != 85) {
            if (ordinal == 80) {
                Context context = getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) context).finish();
            } else if (ordinal != 81) {
                super.mo14585p(bVar, bundle);
            } else {
                getEditPhotoWrapper().mo160569b();
                getEditPhotoWrapper().mo160570c((C32226l<? super CaptureDataManager.CaptureVideoNormalModel, C13598b0>) null);
            }
        }
    }

    public final void setLayout(ViewGroup viewGroup) {
        this.f312706w = viewGroup;
    }
}
