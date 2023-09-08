package com.tencent.p014mm.plugin.gallery.p473ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.base.WxImageView;
import com.tencent.p014mm.plugin.gallery.model.C93958f;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.thumbplayer.view.ThumbPlayerViewContainer;
import com.tencent.p014mm.sdk.platformtools.ForceGpuUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import nj3.C100120b1;
import ow1.C100577n;
import ow1.C100581p;
import ow1.k$$a;
import ow1.q$$a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.gallery.ui.h */
public class C94061h extends C100120b1 {

    /* renamed from: g */
    public Context f271575g;

    /* renamed from: h */
    public ArrayList<String> f271576h = new ArrayList<>();

    /* renamed from: i */
    public ArrayList<GalleryItem$MediaItem> f271577i = new ArrayList<>();

    /* renamed from: j */
    public boolean f271578j;

    /* renamed from: n */
    public HashSet<String> f271579n = new HashSet<>();

    /* renamed from: o */
    public int f271580o = -1;

    /* renamed from: p */
    public View f271581p = null;

    /* renamed from: q */
    public boolean f271582q = false;

    /* renamed from: r */
    public C94063b f271583r;

    /* renamed from: s */
    public final Handler f271584s = new C94062a(Looper.getMainLooper());

    /* renamed from: t */
    public Bitmap f271585t = null;

    /* renamed from: u */
    public HashMap<String, WeakReference<C94065d>> f271586u = new HashMap<>();

    /* renamed from: v */
    public C100581p f271587v = new C100581p(this);

    /* renamed from: w */
    public C100577n f271588w = new C100577n(this);

    /* renamed from: com.tencent.mm.plugin.gallery.ui.h$a */
    public class C94062a extends Handler {
        public C94062a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                C94061h hVar = C94061h.this;
                hVar.f271584s.sendMessageDelayed(hVar.f271584s.obtainMessage(1, (C94065d) message.obj), 500);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.h$b */
    public interface C94063b {
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.h$c */
    public class C94064c implements View.OnClickListener {

        /* renamed from: d */
        public final String f271590d;

        /* renamed from: e */
        public final C94065d f271591e;

        /* renamed from: f */
        public final C94063b f271592f;

        public C94064c(C94065d dVar, String str, C94063b bVar) {
            this.f271590d = str;
            this.f271591e = dVar;
            this.f271592f = bVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/ImageAdapter$VideoItemClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C94063b bVar = this.f271592f;
            if (bVar != null) {
                ImagePreviewUI imagePreviewUI = ((q$$a) bVar).f294693a;
                int i = ImagePreviewUI.f271368h1;
                imagePreviewUI.mo128985J7();
            }
            if (!C86013q1.m106450k(this.f271590d)) {
                Log.m105928w("MicroMsg.ImageAdapter", "File doesn't exists anymore");
                C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/ImageAdapter$VideoItemClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            ((C119157j) C119157j.f356862d).mo183884o(new k$$a(this));
            C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/ImageAdapter$VideoItemClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.h$d */
    public static class C94065d {

        /* renamed from: a */
        public boolean f271594a = false;

        /* renamed from: b */
        public MultiTouchImageView f271595b;

        /* renamed from: c */
        public WxImageView f271596c;

        /* renamed from: d */
        public ImageView f271597d;

        /* renamed from: e */
        public TextView f271598e;

        /* renamed from: f */
        public ThumbPlayerViewContainer f271599f;
    }

    public C94061h(Context context) {
        this.f271575g = context;
    }

    /* renamed from: c */
    public MultiTouchImageView mo129059c(int i, boolean z) {
        View e = mo139420e(i);
        if (e == null) {
            Log.m105921e("MicroMsg.ImageAdapter", "position : %d getMultiTouchImageViewByPosition view is null.", Integer.valueOf(i));
            return null;
        }
        C94065d dVar = (C94065d) e.getTag();
        if (dVar == null) {
            Log.m105921e("MicroMsg.ImageAdapter", "position : %d getMultiTouchImageViewByPosition holder is null.", Integer.valueOf(i));
            return null;
        } else if (!z || dVar.f271595b.getVisibility() != 8) {
            return dVar.f271595b;
        } else {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: com.tencent.mm.plugin.gallery.ui.h$d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo129060d(int r30, android.view.View r31, android.view.ViewGroup r32) {
        /*
            r29 = this;
            r6 = r29
            r7 = r30
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r0 = 0
            r1 = 8
            r2 = 4
            r10 = 0
            if (r31 != 0) goto L_0x0059
            android.content.Context r3 = r6.f271575g
            r4 = 2131495998(0x7f0c0c3e, float:1.8615548E38)
            android.view.View r3 = android.view.View.inflate(r3, r4, r0)
            com.tencent.mm.plugin.gallery.ui.h$d r4 = new com.tencent.mm.plugin.gallery.ui.h$d
            r4.<init>()
            r5 = 2131306251(0x7f09270b, float:1.8230696E38)
            android.view.View r5 = r3.findViewById(r5)
            com.tencent.mm.ui.base.MultiTouchImageView r5 = (com.tencent.p014mm.p136ui.base.MultiTouchImageView) r5
            r4.f271595b = r5
            r5 = 2131317277(0x7f09521d, float:1.825306E38)
            android.view.View r5 = r3.findViewById(r5)
            com.tencent.mm.ui.base.WxImageView r5 = (com.tencent.p014mm.p136ui.base.WxImageView) r5
            r4.f271596c = r5
            r5 = 2131316187(0x7f094ddb, float:1.8250848E38)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r4.f271597d = r5
            r5 = 2131309079(0x7f093217, float:1.8236432E38)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r4.f271598e = r5
            r5 = 2131316244(0x7f094e14, float:1.8250964E38)
            android.view.View r5 = r3.findViewById(r5)
            com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer r5 = (com.tencent.p014mm.plugin.thumbplayer.view.ThumbPlayerViewContainer) r5
            r4.f271599f = r5
            r3.setTag(r4)
            r11 = r3
            goto L_0x0079
        L_0x0059:
            java.lang.Object r3 = r31.getTag()
            r4 = r3
            com.tencent.mm.plugin.gallery.ui.h$d r4 = (com.tencent.p014mm.plugin.gallery.p473ui.C94061h.C94065d) r4
            com.tencent.mm.ui.base.MultiTouchImageView r3 = r4.f271595b
            r3.setVisibility(r2)
            com.tencent.mm.ui.base.WxImageView r3 = r4.f271596c
            r3.setVisibility(r2)
            android.widget.ImageView r3 = r4.f271597d
            r3.setVisibility(r10)
            android.widget.TextView r3 = r4.f271598e
            r3.setVisibility(r1)
            r6.mo129064l(r4)
            r11 = r31
        L_0x0079:
            r12 = r4
            r16 = -1
            boolean r3 = r6.f271578j
            if (r3 == 0) goto L_0x0097
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r3 = r6.f271577i
            java.lang.Object r3 = r3.get(r7)
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r3 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r3
            java.lang.String r4 = r3.f162747d
            java.lang.String r5 = r3.f162750g
            int r13 = r3.getType()
            r28 = r5
            r5 = r4
            r4 = r13
            r13 = r28
            goto L_0x00d8
        L_0x0097:
            java.util.ArrayList<java.lang.String> r3 = r6.f271576h
            java.lang.Object r3 = r3.get(r7)
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            java.util.ArrayList r3 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118751k()
            if (r3 == 0) goto L_0x00d3
            r18 = 0
            r19 = 0
            java.lang.String r23 = ""
            r21 = r4
            r22 = r4
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r3 = com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem.m65488c(r18, r19, r21, r22, r23)
            java.util.ArrayList r5 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118751k()
            int r3 = r5.indexOf(r3)
            if (r3 < 0) goto L_0x00d3
            java.util.ArrayList r5 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118751k()
            java.lang.Object r3 = r5.get(r3)
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r3 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r3
            int r5 = r3.getType()
            r13 = r0
            r28 = r5
            r5 = r4
            r4 = r28
            goto L_0x00d8
        L_0x00d3:
            r3 = -1
            r3 = r0
            r13 = r3
            r5 = r4
            r4 = -1
        L_0x00d8:
            java.lang.String r14 = "image/gif"
            java.lang.String r15 = "MicroMsg.ImageAdapter"
            r18 = 0
            r2 = 2
            if (r3 == 0) goto L_0x0179
            int r0 = r3.getType()
            if (r0 != r2) goto L_0x0179
            r12.f271594a = r10
            android.widget.ImageView r0 = r12.f271597d
            r0.setVisibility(r10)
            android.widget.TextView r0 = r12.f271598e
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r12.f271597d
            com.tencent.mm.plugin.gallery.ui.h$c r1 = new com.tencent.mm.plugin.gallery.ui.h$c
            com.tencent.mm.plugin.gallery.ui.h$b r2 = r6.f271583r
            r1.<init>(r12, r5, r2)
            r0.setOnClickListener(r1)
            com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer r0 = r12.f271599f
            r0.mo24847j()
            com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer r0 = r12.f271599f
            l03.s r1 = new l03.s
            com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct
            r2.<init>()
            r24 = r11
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r25 = r4
            r4 = 3
            r1.<init>(r2, r10, r4)
            r0.mo24836c(r1)
            com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer r0 = r12.f271599f
            com.tencent.mm.plugin.gallery.ui.f r1 = new com.tencent.mm.plugin.gallery.ui.f
            r1.<init>(r6, r12)
            r0.setVideoCallback(r1)
            com.tencent.mm.plugin.gallery.model.n r0 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
            int r0 = r0.f271196f
            r1 = 4
            if (r0 == r1) goto L_0x013e
            com.tencent.mm.plugin.gallery.model.n r0 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
            int r0 = r0.f271196f
            r1 = 14
            if (r0 != r1) goto L_0x013a
            goto L_0x013e
        L_0x013a:
            r26 = r8
            goto L_0x020f
        L_0x013e:
            hw1.w r0 = new hw1.w
            java.lang.String r1 = r3.f162747d
            r2 = r3
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r2 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r2
            com.tencent.mm.plugin.gallery.ui.g r4 = new com.tencent.mm.plugin.gallery.ui.g
            r4.<init>(r6, r12)
            r0.<init>(r1, r7, r2, r4)
            android.widget.TextView r1 = r12.f271598e
            java.lang.Object r1 = r1.getTag()
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x016c
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r1 = 16842794(0x101002a, float:2.3693676E-38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "analysis of path[%s] has already been added in ThreadPool"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r1, r0)
            goto L_0x013a
        L_0x016c:
            android.widget.TextView r1 = r12.f271598e
            r1.setTag(r0)
            zt3.t r1 = zt3.C119157j.f356862d
            zt3.j r1 = (zt3.C119157j) r1
            r1.mo183875f(r0)
            goto L_0x013a
        L_0x0179:
            r25 = r4
            r24 = r11
            com.tencent.mm.plugin.gallery.model.n r0 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
            int r0 = r0.f271196f
            r2 = 3
            if (r0 != r2) goto L_0x01f8
            if (r3 == 0) goto L_0x01f8
            java.lang.String r0 = r3.f162755o
            boolean r0 = r0.equalsIgnoreCase(r14)
            if (r0 == 0) goto L_0x01f8
            android.widget.TextView r0 = r12.f271598e
            android.content.Context r2 = r6.f271575g
            r4 = 1
            java.lang.Object[] r10 = new java.lang.Object[r4]
            android.net.Uri r4 = com.tencent.p014mm.vfs.C116299g2.m163858n(r5)
            java.lang.String r11 = r4.getPath()
            if (r11 == 0) goto L_0x01bc
            r1 = 0
            java.lang.String r11 = com.tencent.p014mm.vfs.C116299g2.m163855k(r11, r1, r1)
            java.lang.String r1 = r4.getPath()
            boolean r1 = r1.equals(r11)
            if (r1 != 0) goto L_0x01bc
            android.net.Uri$Builder r1 = r4.buildUpon()
            android.net.Uri$Builder r1 = r1.path(r11)
            android.net.Uri r4 = r1.build()
        L_0x01bc:
            com.tencent.mm.vfs.f0 r1 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r11 = 0
            com.tencent.mm.vfs.f0$h r1 = r1.mo177799l(r4, r11)
            boolean r4 = r1.mo177810a()
            if (r4 != 0) goto L_0x01ca
            goto L_0x01d4
        L_0x01ca:
            com.tencent.mm.vfs.FileSystem$c r4 = r1.f348991a
            java.lang.String r1 = r1.f348992b
            com.tencent.mm.vfs.b0 r1 = r4.mo119945q(r1)
            if (r1 != 0) goto L_0x01d9
        L_0x01d4:
            r26 = r8
            r7 = r18
            goto L_0x01dd
        L_0x01d9:
            r26 = r8
            long r7 = r1.f250473c
        L_0x01dd:
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r7)
            r4 = 0
            r10[r4] = r1
            r1 = 2131830599(0x7f112747, float:1.92942E38)
            java.lang.String r1 = r2.getString(r1, r10)
            r0.setText(r1)
            android.widget.TextView r0 = r12.f271598e
            r0.setVisibility(r4)
            r12.f271594a = r4
            r1 = 8
            goto L_0x0204
        L_0x01f8:
            r26 = r8
            android.widget.TextView r0 = r12.f271598e
            r1 = 8
            r0.setVisibility(r1)
            r0 = 1
            r12.f271594a = r0
        L_0x0204:
            android.widget.ImageView r0 = r12.f271597d
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r12.f271597d
            r1 = 0
            r0.setOnClickListener(r1)
        L_0x020f:
            com.tencent.mm.plugin.gallery.model.n r0 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
            int r0 = r0.f271196f
            r1 = 3
            if (r0 != r1) goto L_0x0280
            if (r3 != 0) goto L_0x0220
            boolean r0 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isGif((java.lang.String) r5)
            if (r0 != 0) goto L_0x022a
        L_0x0220:
            if (r3 == 0) goto L_0x0280
            java.lang.String r0 = r3.f162755o
            boolean r0 = r0.equalsIgnoreCase(r14)
            if (r0 == 0) goto L_0x0280
        L_0x022a:
            com.tencent.mm.ui.base.MultiTouchImageView r0 = r12.f271595b
            r1 = 0
            r0.setVisibility(r1)
            com.tencent.mm.ui.base.WxImageView r0 = r12.f271596c
            r2 = 4
            r0.setVisibility(r2)
            com.tencent.mm.ui.base.MultiTouchImageView r0 = r12.f271595b
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.setMaxZoomLimit(r2)
            com.tencent.mm.ui.base.MultiTouchImageView r0 = r12.f271595b
            r0.setEnableHorLongBmpMode(r1)
            com.tencent.mm.ui.base.MultiTouchImageView r0 = r12.f271595b
            r0.setGifPath(r5)
            com.tencent.mm.ui.base.MultiTouchImageView r0 = r12.f271595b
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r0.setImageViewMatrix(r1)
            com.tencent.mm.ui.base.MultiTouchImageView r0 = r12.f271595b
            r0.mo26058c()
            com.tencent.mm.ui.base.MultiTouchImageView r0 = r12.f271595b
            int r1 = r0.getImageWidth()
            com.tencent.mm.ui.base.MultiTouchImageView r2 = r12.f271595b
            int r2 = r2.getImageHeight()
            com.tencent.p014mm.sdk.platformtools.ForceGpuUtil.decideLayerType(r0, r1, r2)
            com.tencent.mm.ui.base.MultiTouchImageView r0 = r12.f271595b
            boolean r1 = r0.f348270M
            if (r1 == 0) goto L_0x027b
            android.graphics.drawable.Drawable r1 = r0.f348271N
            if (r1 == 0) goto L_0x027b
            ul3.b r1 = (ul3.C102053b) r1
            r1.stop()
            android.graphics.drawable.Drawable r0 = r0.f348271N
            ul3.b r0 = (ul3.C102053b) r0
            r0.start()
        L_0x027b:
            r7 = r15
        L_0x027c:
            r11 = 1
            r13 = 2
            goto L_0x0381
        L_0x0280:
            if (r3 != 0) goto L_0x0285
            r19 = r18
            goto L_0x0289
        L_0x0285:
            long r0 = r3.f162752i
            r19 = r0
        L_0x0289:
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 0
            r1[r0] = r5
            java.lang.String r0 = "initImageView, filePath: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r0, r1)
            ow1.n r0 = r6.f271588w
            sg.g<java.lang.String, android.graphics.Bitmap> r0 = r0.f294681g
            q90.d r0 = (q90.C101062d) r0
            boolean r0 = r0.check(r5)
            if (r0 == 0) goto L_0x02bf
            ow1.n r0 = r6.f271588w
            sg.g<java.lang.String, android.graphics.Bitmap> r0 = r0.f294681g
            o90.b r0 = (o90.C100301b) r0
            java.lang.Object r0 = r0.mo139556b(r5)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            boolean r1 = r0.isRecycled()
            if (r1 != 0) goto L_0x02b6
            r6.mo129066n(r12, r0)
            goto L_0x027b
        L_0x02b6:
            ow1.n r0 = r6.f271588w
            sg.g<java.lang.String, android.graphics.Bitmap> r0 = r0.f294681g
            o90.b r0 = (o90.C100301b) r0
            r0.remove(r5)
        L_0x02bf:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r0 == 0) goto L_0x02c7
            r14 = r5
            goto L_0x02c8
        L_0x02c7:
            r14 = r13
        L_0x02c8:
            com.tencent.mm.plugin.gallery.model.c r13 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118747g()
            r18 = 0
            r7 = r15
            r15 = r5
            android.graphics.Bitmap r0 = r13.mo128877e(r14, r15, r16, r18, r19)
            if (r0 == 0) goto L_0x02df
            boolean r1 = r0.isRecycled()
            if (r1 == 0) goto L_0x02dd
            goto L_0x02df
        L_0x02dd:
            r8 = r0
            goto L_0x02fb
        L_0x02df:
            android.graphics.Bitmap r0 = r6.f271585t
            if (r0 == 0) goto L_0x02e9
            boolean r0 = r0.isRecycled()
            if (r0 == 0) goto L_0x02f8
        L_0x02e9:
            android.content.Context r0 = r6.f271575g
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131234404(0x7f080e64, float:1.8084973E38)
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r1)
            r6.f271585t = r0
        L_0x02f8:
            android.graphics.Bitmap r0 = r6.f271585t
            goto L_0x02dd
        L_0x02fb:
            r0 = 0
            java.lang.String r1 = com.tencent.p014mm.vfs.C86013q1.m106448i(r5, r0)
            boolean r1 = pr3.C89436a.m111810b(r1)
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            r3[r0] = r4
            r4 = 1
            r3[r4] = r5
            java.lang.String r9 = "isSupport: %s, path: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r3)
            if (r1 == 0) goto L_0x035f
            com.tencent.mm.ui.base.MultiTouchImageView r1 = r12.f271595b
            r3 = 4
            r1.setVisibility(r3)
            com.tencent.mm.ui.base.WxImageView r1 = r12.f271596c
            r1.setVisibility(r0)
            android.graphics.BitmapFactory$Options r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r5)
            if (r0 == 0) goto L_0x027c
            int r1 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.getExifOrientation(r5)
            com.tencent.mm.ui.base.WxImageView r3 = r12.f271596c
            int r9 = r0.outWidth
            int r0 = r0.outHeight
            r3.f48889h = r9
            r3.f48890i = r0
            r3.setOrientation(r1)
            com.tencent.mm.ui.base.WxImageView r0 = r12.f271596c
            r0.mo26059d()
            com.tencent.mm.ui.base.WxImageView r9 = r12.f271596c
            com.tencent.mm.plugin.gallery.ui.i r10 = new com.tencent.mm.plugin.gallery.ui.i
            r11 = 1
            r0 = r10
            r1 = r29
            r13 = 2
            r2 = r12
            r3 = r8
            r14 = r25
            r4 = r5
            r15 = r5
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r9.setOnImageLoadEventListener(r10)
            com.tencent.mm.ui.base.WxImageView r0 = r12.f271596c
            com.davemorrissey.labs.subscaleview.view.ImageSource r1 = com.davemorrissey.labs.subscaleview.view.ImageSource.cachedBitmap(r8)
            r0.mo21400p(r15, r1)
            goto L_0x0381
        L_0x035f:
            r15 = r5
            r14 = r25
            r11 = 1
            r13 = 2
            r6.mo129066n(r12, r8)
            java.util.HashSet<java.lang.String> r0 = r6.f271579n
            boolean r0 = r0.contains(r15)
            if (r0 == 0) goto L_0x0370
            goto L_0x0381
        L_0x0370:
            java.util.HashSet<java.lang.String> r0 = r6.f271579n
            r0.add(r15)
            com.tencent.mm.ui.base.MultiTouchImageView r0 = r12.f271595b
            r0.setTag(r12)
            ow1.n r0 = r6.f271588w
            com.tencent.mm.ui.base.MultiTouchImageView r1 = r12.f271595b
            r0.mo140042b(r1, r15, r14)
        L_0x0381:
            java.lang.Object[] r0 = new java.lang.Object[r13]
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r26)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r30)
            r0[r11] = r1
            java.lang.String r1 = "test get view: %d position:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r7, r1, r0)
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.p473ui.C94061h.mo129060d(int, android.view.View, android.view.ViewGroup):java.lang.Object");
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (this.f271578j) {
            viewGroup.removeView((View) obj);
            super.destroyItem(viewGroup, i, obj);
        } else if (obj == null) {
            Log.m105921e("MicroMsg.ImageAdapter", "[destroyItem] position:%s", Integer.valueOf(i));
        } else {
            if (this.f271581p != null) {
                Log.m105925i("MicroMsg.ImageAdapter", "[destroyItem] position:%s object:%s lastVisibleView:%s", Integer.valueOf(i), Integer.valueOf(obj.hashCode()), Integer.valueOf(this.f271581p.hashCode()));
            }
            if (obj != this.f271581p || !this.f271582q) {
                super.destroyItem(viewGroup, i, obj);
                viewGroup.removeView((View) obj);
                return;
            }
            Log.m105918d("MicroMsg.ImageAdapter", "[isSwap-destroyItem]");
        }
    }

    /* renamed from: f */
    public WxImageView mo129061f(int i, boolean z) {
        View e = mo139420e(i);
        if (e == null) {
            Log.m105921e("MicroMsg.ImageAdapter", "position : %d getWxImageViewByPosition view is null.", Integer.valueOf(i));
            return null;
        }
        C94065d dVar = (C94065d) e.getTag();
        if (dVar == null) {
            Log.m105921e("MicroMsg.ImageAdapter", "position : %d getWxImageViewByPosition holder is null.", Integer.valueOf(i));
            return null;
        } else if (!z || dVar.f271596c.getVisibility() != 8) {
            return dVar.f271596c;
        } else {
            return null;
        }
    }

    public int getCount() {
        return this.f271578j ? this.f271577i.size() : this.f271576h.size();
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.f271578j) {
            return super.instantiateItem(viewGroup, i);
        }
        Log.m105925i("MicroMsg.ImageAdapter", "[instantiateItem] position:%s %s", Integer.valueOf(i), Integer.valueOf(this.f271580o));
        if (i != this.f271580o || !this.f271582q) {
            return super.instantiateItem(viewGroup, i);
        }
        Log.m105918d("MicroMsg.ImageAdapter", "[isSwap-instantiateItem]");
        this.f293275e.put(this.f271581p, Integer.valueOf(this.f271580o));
        this.f293276f.put(this.f271580o, this.f271581p);
        this.f271580o = -1;
        this.f271582q = false;
        return this.f271581p;
    }

    /* renamed from: j */
    public String mo129062j(int i) {
        if (this.f271578j) {
            if (i >= 0 && i < this.f271577i.size()) {
                return this.f271577i.get(i).f162747d;
            }
            Log.m105929w("MicroMsg.ImageAdapter", "error position %d, mediaitems size %d", Integer.valueOf(i), Integer.valueOf(this.f271577i.size()));
            return "";
        } else if (i >= 0 && i < this.f271576h.size()) {
            return this.f271576h.get(i);
        } else {
            Log.m105929w("MicroMsg.ImageAdapter", "error position %d, imagePaths size %d", Integer.valueOf(i), Integer.valueOf(this.f271576h.size()));
            return "";
        }
    }

    /* renamed from: k */
    public GalleryItem$MediaItem mo129063k(int i) {
        int indexOf;
        GalleryItem$MediaItem galleryItem$MediaItem = null;
        if (this.f271578j) {
            if (i >= 0 && i < this.f271577i.size()) {
                return this.f271577i.get(i);
            }
            Log.m105929w("MicroMsg.ImageAdapter", "error position %d mediaitems size", Integer.valueOf(i), Integer.valueOf(this.f271577i.size()));
            return null;
        } else if (i < 0 || i >= this.f271576h.size()) {
            Log.m105929w("MicroMsg.ImageAdapter", "error position %d, imagePaths size %d", Integer.valueOf(i), Integer.valueOf(this.f271576h.size()));
            return null;
        } else {
            String str = this.f271576h.get(i);
            GalleryItem$MediaItem c = GalleryItem$MediaItem.m65488c(0, 0, str, str, "");
            if (C93958f.m118751k() != null && (indexOf = C93958f.m118751k().indexOf(c)) >= 0) {
                galleryItem$MediaItem = C93958f.m118751k().get(indexOf);
            }
            if (galleryItem$MediaItem != null || C93958f.m118752l().isEmpty()) {
                return galleryItem$MediaItem;
            }
            Iterator<GalleryItem$MediaItem> it = C93958f.m118752l().iterator();
            while (it.hasNext()) {
                GalleryItem$MediaItem next = it.next();
                if (next.equals(c)) {
                    return next;
                }
            }
            return galleryItem$MediaItem;
        }
    }

    /* renamed from: l */
    public final void mo129064l(C94065d dVar) {
        dVar.f271599f.setVisibility(8);
        dVar.f271597d.setVisibility(0);
        dVar.f271596c.setVisibility(0);
        dVar.f271595b.setVisibility(0);
        this.f271584s.removeMessages(1);
    }

    /* renamed from: m */
    public void mo129065m(ArrayList<String> arrayList) {
        this.f271576h.clear();
        this.f271576h.addAll(arrayList);
        mo139421i();
        notifyDataSetChanged();
    }

    /* renamed from: n */
    public void mo129066n(C94065d dVar, Bitmap bitmap) {
        Log.m105925i("MicroMsg.ImageAdapter", "showImage, trace: %s.", Util.getStack());
        dVar.f271595b.setVisibility(0);
        dVar.f271596c.setVisibility(4);
        dVar.f271595b.setMaxZoomLimit(4.5f);
        dVar.f271595b.setEnableHorLongBmpMode(false);
        ForceGpuUtil.decideLayerType(dVar.f271595b, bitmap.getWidth(), bitmap.getHeight());
        MultiTouchImageView multiTouchImageView = dVar.f271595b;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        multiTouchImageView.f348280o = width;
        multiTouchImageView.f348281p = height;
        dVar.f271595b.setImageBitmap(bitmap);
        dVar.f271595b.requestLayout();
    }

    /* renamed from: o */
    public void mo129067o() {
        Log.m105928w("MicroMsg.ImageAdapter", "stop all video");
        SparseArray<Object> sparseArray = this.f293276f;
        for (int i = 0; i < sparseArray.size(); i++) {
            Object valueAt = sparseArray.valueAt(i);
            if (valueAt instanceof View) {
                C94065d dVar = (C94065d) ((View) valueAt).getTag();
                if (dVar.f271599f.isInitialized()) {
                    dVar.f271599f.stop();
                    mo129064l(dVar);
                }
            }
        }
        this.f271584s.removeMessages(1);
    }
}
