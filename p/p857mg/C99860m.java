package p857mg;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult;
import com.davemorrissey.labs.subscaleview.view.ImageSource;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.base.WxImageView;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.ForceGpuUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.StringKtKt;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import d20.C20382b;
import gy3.C8477a0;
import gy3.C8479f0;
import gy3.C87412m;
import jq3.C60896i;
import k60.C60979d;
import l60.C99344b;
import oh0.C100353d;
import p1081gi.C98124g;
import p278yh.C102862b;
import p855lg.C61278a;
import ph0.C100792a;
import pr3.C35626b;
import pr3.C89436a;
import th0.C101880a;
import th0.C101888l;

/* renamed from: mg.m */
public class C99860m extends C60896i<C61278a> {

    /* renamed from: e */
    public Bitmap f292628e;

    /* renamed from: mg.m$a */
    public static final class C99861a implements C20382b {

        /* renamed from: a */
        public final /* synthetic */ C8477a0 f292629a;

        /* renamed from: b */
        public final /* synthetic */ WxImageView f292630b;

        /* renamed from: c */
        public final /* synthetic */ C102862b f292631c;

        /* renamed from: d */
        public final /* synthetic */ C99860m f292632d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f292633e;

        public C99861a(C8477a0 a0Var, WxImageView wxImageView, C102862b bVar, C99860m mVar, Bitmap bitmap) {
            this.f292629a = a0Var;
            this.f292630b = wxImageView;
            this.f292631c = bVar;
            this.f292632d = mVar;
            this.f292633e = bitmap;
        }

        public void onImageLoadError(ImageDecodeResult imageDecodeResult) {
            C87412m.m108594g(imageDecodeResult, "result");
            Log.m105918d(StringKtKt.TAG, "wxImageView, on image load err.");
            C35626b.m40780a(imageDecodeResult.errCode);
            if (imageDecodeResult.errCode == 4) {
                this.f292632d.mo139215m(this.f292631c, this.f292633e);
            }
        }

        public void onImageLoaded(Bitmap bitmap) {
            C87412m.m108594g(bitmap, "bitmap");
            Log.m105918d(StringKtKt.TAG, "wxImageView, on image loaded.");
            if (this.f292629a.f27482d) {
                WxImageView wxImageView = this.f292630b;
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                wxImageView.f48889h = width;
                wxImageView.f48890i = height;
                this.f292630b.mo26059d();
            }
            this.f292631c.mo142566b().setImageBitmap((Bitmap) null);
            this.f292631c.mo142566b().setVisibility(4);
        }

        public void onPreviewLoadError(ImageDecodeResult imageDecodeResult) {
            C87412m.m108594g(imageDecodeResult, "result");
            Log.m105918d(StringKtKt.TAG, "wxImageView, on preview load err.");
        }

        public void onPreviewLoaded() {
            Log.m105918d(StringKtKt.TAG, "wxImageView, on preview loaded.");
        }

        public void onPreviewReleased() {
        }

        public void onReady() {
        }

        public void onTileLoadError(ImageDecodeResult imageDecodeResult) {
            C87412m.m108594g(imageDecodeResult, "result");
            Log.m105918d(StringKtKt.TAG, "wxImageView, on tile load err.");
        }
    }

    /* renamed from: j */
    public static final void m130383j(C99860m mVar, C102862b bVar, C61278a aVar, Bitmap bitmap, int i) {
        C99860m mVar2 = mVar;
        C102862b bVar2 = bVar;
        C61278a aVar2 = aVar;
        Bitmap bitmap2 = bitmap;
        int i2 = i;
        mVar.getClass();
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = "";
        C100792a aVar3 = C100792a.f295260a;
        String d = aVar3.mo140233d(aVar2.f174389h, aVar2.f174390i);
        C98124g gVar = new C98124g();
        gVar.f287660d = "task_AlbumDownload";
        C72963f4 f4Var = aVar2.f174390i;
        Long l = null;
        gVar.field_chattype = C72996z1.m85820U5(f4Var != null ? f4Var.mo108768t() : null) ? 1 : 0;
        if (C101888l.f300029a.mo141359i(aVar2.f174389h, aVar2.f174390i)) {
            f0Var.f27484d = aVar3.mo140245q(aVar2.f174389h, aVar2.f174390i);
            String p = aVar3.mo140244p(aVar2.f174389h.mo55264K());
            C72963f4 f4Var2 = aVar2.f174390i;
            gVar.field_mediaId = aVar3.mo140242n(p, f4Var2 != null ? f4Var2.getMsgId() : 0, true);
            gVar.field_fileType = aVar2.f174389h.mo55306f0();
            gVar.field_fullpath = (String) f0Var.f27484d;
            gVar.field_totalLen = (int) aVar2.f174389h.mo55300c0();
            gVar.field_aesKey = aVar2.f174389h.mo55296a0();
            gVar.field_fileId = aVar2.f174389h.mo55302d0();
            gVar.field_filemd5 = aVar2.f174389h.mo55298b0();
        } else if (Util.isNullOrNil(aVar2.f174389h.mo55250D()) || !Util.isNullOrNil(aVar2.f174389h.mo55302d0())) {
            f0Var.f27484d = aVar3.mo140250v(aVar2.f174389h, aVar2.f174390i);
            String u = aVar3.mo140249u(aVar2.f174389h.mo55264K());
            C72963f4 f4Var3 = aVar2.f174390i;
            gVar.field_mediaId = aVar3.mo140242n(u, f4Var3 != null ? f4Var3.getMsgId() : 0, true);
            gVar.field_fileType = aVar2.f174389h.mo55336u0();
            gVar.field_totalLen = (int) aVar2.f174389h.mo55344y0();
            gVar.field_aesKey = aVar2.f174389h.mo55254F();
            gVar.field_fileId = aVar2.f174389h.mo55256G();
            gVar.field_filemd5 = aVar2.f174389h.mo55338v0();
            gVar.field_fullpath = (String) f0Var.f27484d;
        } else {
            f0Var.f27484d = aVar3.mo140238j(aVar2.f174389h, aVar2.f174390i);
            String K = aVar2.f174389h.mo55264K();
            C72963f4 f4Var4 = aVar2.f174390i;
            gVar.field_mediaId = aVar3.mo140242n(K, f4Var4 != null ? f4Var4.getMsgId() : 0, true);
            gVar.field_fileType = aVar2.f174389h.mo55282T();
            gVar.field_fullpath = (String) f0Var.f27484d;
            gVar.field_totalLen = (int) aVar2.f174389h.mo55268M();
            gVar.field_aesKey = aVar2.f174389h.mo55248C();
            gVar.field_fileId = aVar2.f174389h.mo55250D();
            gVar.field_filemd5 = aVar2.f174389h.mo55286V();
        }
        if (C86013q1.m106450k(d)) {
            mVar2.mo139214l(aVar2, bVar2, d, bitmap2);
            StringBuilder sb = new StringBuilder();
            sb.append("localPath is exist, msgId: ");
            C72963f4 f4Var5 = aVar2.f174390i;
            if (f4Var5 != null) {
                l = Long.valueOf(f4Var5.getMsgId());
            }
            sb.append(l);
            sb.append(", position: ");
            sb.append(i2);
            Log.m105918d(StringKtKt.TAG, sb.toString());
        } else if (C86013q1.m106450k((String) f0Var.f27484d)) {
            mVar2.mo139214l(aVar2, bVar2, (String) f0Var.f27484d, bitmap2);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("localPath is exist, msgId: ");
            C72963f4 f4Var6 = aVar2.f174390i;
            if (f4Var6 != null) {
                l = Long.valueOf(f4Var6.getMsgId());
            }
            sb4.append(l);
            sb4.append(", position: ");
            sb4.append(i2);
            Log.m105918d(StringKtKt.TAG, sb4.toString());
        } else {
            mVar2.mo139215m(bVar2, bitmap2);
            C60979d<C100353d> dVar = C101880a.f299980e;
            C72963f4 f4Var7 = aVar2.f174390i;
            long msgId = f4Var7 != null ? f4Var7.getMsgId() : 0;
            C72963f4 f4Var8 = aVar2.f174390i;
            if (f4Var8 != null) {
                l = f4Var8.mo108768t();
            }
            C99344b<C100353d, Bitmap> a = dVar.mo85955a(new C100353d(msgId, l == null ? "" : l, aVar2.f174389h, (String) f0Var.f27484d, C101880a.f299978c, gVar));
            a.f291320d = new C99851c(mVar, aVar, bVar, f0Var, bitmap);
            a.mo85951a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r1 != false) goto L_0x000f;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Bitmap m130384k(p857mg.C99860m r2) {
        /*
            android.graphics.Bitmap r0 = r2.f292628e
            if (r0 == 0) goto L_0x000f
            r1 = 1
            boolean r0 = r0.isRecycled()
            if (r0 != r1) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            if (r1 == 0) goto L_0x001d
        L_0x000f:
            java.lang.String r0 = "#ff000000"
            int r0 = android.graphics.Color.parseColor(r0)
            r1 = 480(0x1e0, float:6.73E-43)
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createColorBitmap(r0, r1, r1)
            r2.f292628e = r0
        L_0x001d:
            android.graphics.Bitmap r2 = r2.f292628e
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p857mg.C99860m.m130384k(mg.m):android.graphics.Bitmap");
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.d78;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01f8  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r19, jq3.C9493c r20, int r21, int r22, boolean r23, java.util.List r24) {
        /*
            r18 = this;
            r0 = r19
            r5 = r21
            r4 = r20
            lg.a r4 = (p855lg.C61278a) r4
            java.lang.String r1 = "holder"
            gy3.C87412m.m108594g(r0, r1)
            java.lang.String r1 = "item"
            gy3.C87412m.m108594g(r4, r1)
            yh.b r3 = new yh.b
            android.view.View r1 = r0.f44854d
            r3.<init>(r1)
            com.tencent.mm.ui.base.WxImageView r2 = r3.mo142565a()
            mg.d r6 = new mg.d
            r6.<init>(r3)
            r2.setGestureDetectorListener(r6)
            com.tencent.mm.ui.base.WxImageView r2 = r3.mo142565a()
            mg.e r6 = new mg.e
            r6.<init>(r0)
            r2.setOnLongClickListener(r6)
            com.tencent.mm.ui.base.MultiTouchImageView r0 = r3.mo142566b()
            mg.f r2 = new mg.f
            r2.<init>(r3)
            r0.setOnClickListener(r2)
            com.tencent.mm.ui.base.MultiTouchImageView r0 = r3.mo142566b()
            r2 = 0
            r0.setVisibility(r2)
            com.tencent.mm.ui.anim.transition.view.AnimMultiTouchImage r0 = r3.f303620c
            if (r0 != 0) goto L_0x0055
            r0 = 2131296989(0x7f0902dd, float:1.821191E38)
            android.view.View r0 = r1.findViewById(r0)
            com.tencent.mm.ui.anim.transition.view.AnimMultiTouchImage r0 = (com.tencent.p014mm.p136ui.anim.transition.view.AnimMultiTouchImage) r0
            r3.f303620c = r0
        L_0x0055:
            com.tencent.mm.ui.anim.transition.view.AnimMultiTouchImage r0 = r3.f303620c
            com.tencent.mm.storage.f4 r6 = r4.f174390i
            if (r6 == 0) goto L_0x0060
            long r6 = r6.getMsgId()
            goto L_0x0062
        L_0x0060:
            r6 = -1
        L_0x0062:
            java.lang.String r6 = com.tencent.p014mm.p136ui.C74928u.C57854a.m66842a(r5, r6)
            java.lang.String r7 = "getShareElementName(posi… item.msgInfo?.msgId?:-1)"
            gy3.C87412m.m108593f(r6, r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            android.widget.RelativeLayout r8 = r3.f303621d
            if (r8 != 0) goto L_0x007e
            r8 = 2131311816(0x7f093cc8, float:1.8241983E38)
            android.view.View r1 = r1.findViewById(r8)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r3.f303621d = r1
        L_0x007e:
            android.widget.RelativeLayout r1 = r3.f303621d
            java.lang.String r8 = "uiBinding.realLayout"
            gy3.C87412m.m108593f(r1, r8)
            r0.getClass()
            r0.f284204P = r1
            gj3.C59476i.m69399a(r0, r6, r7)
            android.content.Context r1 = r0.getContext()
            boolean r6 = r1 instanceof android.app.Activity
            r7 = 0
            if (r6 == 0) goto L_0x009a
            android.app.Activity r1 = (android.app.Activity) r1
            goto L_0x009b
        L_0x009a:
            r1 = r7
        L_0x009b:
            r6 = 1
            if (r1 == 0) goto L_0x00b3
            com.tencent.mm.ui.anim.transition.MMTransitionHelper r8 = com.tencent.p014mm.p136ui.anim.transition.MMTransitionHelper.f165034a
            com.tencent.mm.ui.anim.transition.MMTransitionHelper$a r1 = r8.mo81991b(r1)
            boolean r8 = r1.f165038b
            if (r8 == 0) goto L_0x00ae
            boolean r1 = r1.f165042f
            if (r1 != 0) goto L_0x00ae
            r1 = 1
            goto L_0x00af
        L_0x00ae:
            r1 = 0
        L_0x00af:
            if (r1 != r6) goto L_0x00b3
            r1 = 1
            goto L_0x00b4
        L_0x00b3:
            r1 = 0
        L_0x00b4:
            if (r1 != 0) goto L_0x00b9
            r0.mo81999g(r6)
        L_0x00b9:
            com.tencent.mm.storage.f4 r0 = r4.f174390i
            if (r0 == 0) goto L_0x00c4
            int r0 = r0.mo108769t2()
            if (r0 != r6) goto L_0x00c4
            r2 = 1
        L_0x00c4:
            if (r2 == 0) goto L_0x0143
            ph0.a r0 = ph0.C100792a.f295260a
            ig.d r1 = r4.f174389h
            com.tencent.mm.storage.f4 r2 = r4.f174390i
            java.lang.String r2 = r0.mo140233d(r1, r2)
            ig.d r1 = r4.f174389h
            com.tencent.mm.storage.f4 r6 = r4.f174390i
            java.lang.String r1 = r0.mo140245q(r1, r6)
            th0.l r6 = th0.C101888l.f300029a
            ig.d r7 = r4.f174389h
            com.tencent.mm.storage.f4 r8 = r4.f174390i
            boolean r6 = r6.mo141359i(r7, r8)
            if (r6 != 0) goto L_0x00ec
            ig.d r1 = r4.f174389h
            com.tencent.mm.storage.f4 r6 = r4.f174390i
            java.lang.String r1 = r0.mo140238j(r1, r6)
        L_0x00ec:
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r6 != 0) goto L_0x00fa
            ig.d r1 = r4.f174389h
            com.tencent.mm.storage.f4 r6 = r4.f174390i
            java.lang.String r1 = r0.mo140250v(r1, r6)
        L_0x00fa:
            r11 = r1
            k60.d<oh0.d> r0 = th0.C101880a.f299980e
            oh0.d r1 = new oh0.d
            com.tencent.mm.storage.f4 r6 = r4.f174390i
            long r7 = r6.getMsgId()
            com.tencent.mm.storage.f4 r6 = r4.f174390i
            java.lang.String r9 = r6.mo108768t()
            java.lang.String r6 = "item.msgInfo.talker"
            gy3.C87412m.m108593f(r9, r6)
            ig.d r10 = r4.f174389h
            n60.f r12 = th0.C101880a.f299978c
            r13 = 0
            r14 = 32
            r15 = 0
            r6 = r1
            r6.<init>(r7, r9, r10, r11, r12, r13, r14, r15)
            k60.c r0 = (k60.C99100c) r0
            r0.getClass()
            l60.a r6 = new l60.a
            x60.a r7 = new x60.a
            x60.b r8 = x60.C102565b.LOCAL_PATH
            r7.<init>((x60.C15627c) r1, (x60.C102565b) r8)
            n60.e<T, android.graphics.Bitmap> r0 = r0.f173682a
            r6.<init>(r7, r0)
            mg.i r7 = new mg.i
            r0 = r7
            r1 = r18
            r5 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f291320d = r7
            r6.mo85951a()
            r2 = r18
            goto L_0x0211
        L_0x0143:
            ph0.a r0 = ph0.C100792a.f295260a
            ig.d r1 = r4.f174389h
            com.tencent.mm.storage.f4 r2 = r4.f174390i
            java.lang.String r1 = r0.mo140245q(r1, r2)
            th0.l r2 = th0.C101888l.f300029a
            ig.d r8 = r4.f174389h
            com.tencent.mm.storage.f4 r9 = r4.f174390i
            boolean r2 = r2.mo141359i(r8, r9)
            if (r2 != 0) goto L_0x0161
            ig.d r1 = r4.f174389h
            com.tencent.mm.storage.f4 r2 = r4.f174390i
            java.lang.String r1 = r0.mo140238j(r1, r2)
        L_0x0161:
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            r8 = 0
            if (r2 != 0) goto L_0x01da
            ig.d r1 = r4.f174389h
            com.tencent.mm.storage.f4 r2 = r4.f174390i
            java.lang.String r1 = r0.mo140250v(r1, r2)
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r2 != 0) goto L_0x01da
            gi.g r2 = new gi.g
            r2.<init>()
            java.lang.String r10 = "task_AlbumDownload"
            r2.f287660d = r10
            com.tencent.mm.storage.f4 r10 = r4.f174390i
            if (r10 == 0) goto L_0x018a
            java.lang.String r10 = r10.mo108768t()
            goto L_0x018b
        L_0x018a:
            r10 = r7
        L_0x018b:
            boolean r10 = com.tencent.p014mm.storage.C72996z1.m85820U5(r10)
            r2.field_chattype = r10
            ig.d r10 = r4.f174389h
            java.lang.String r10 = r10.mo55264K()
            java.lang.String r10 = r0.mo140249u(r10)
            com.tencent.mm.storage.f4 r11 = r4.f174390i
            if (r11 == 0) goto L_0x01a4
            long r11 = r11.getMsgId()
            goto L_0x01a5
        L_0x01a4:
            r11 = r8
        L_0x01a5:
            java.lang.String r0 = r0.mo140242n(r10, r11, r6)
            r2.field_mediaId = r0
            ig.d r0 = r4.f174389h
            int r0 = r0.mo55336u0()
            r2.field_fileType = r0
            ig.d r0 = r4.f174389h
            long r10 = r0.mo55344y0()
            int r0 = (int) r10
            r2.field_totalLen = r0
            ig.d r0 = r4.f174389h
            java.lang.String r0 = r0.mo55254F()
            r2.field_aesKey = r0
            ig.d r0 = r4.f174389h
            java.lang.String r0 = r0.mo55256G()
            r2.field_fileId = r0
            ig.d r0 = r4.f174389h
            java.lang.String r0 = r0.mo55338v0()
            r2.field_filemd5 = r0
            r2.field_fullpath = r1
            r15 = r1
            r17 = r2
            goto L_0x01dd
        L_0x01da:
            r15 = r1
            r17 = r7
        L_0x01dd:
            k60.d<oh0.d> r0 = th0.C101880a.f299980e
            oh0.d r1 = new oh0.d
            com.tencent.mm.storage.f4 r2 = r4.f174390i
            if (r2 == 0) goto L_0x01e9
            long r8 = r2.getMsgId()
        L_0x01e9:
            r11 = r8
            com.tencent.mm.storage.f4 r2 = r4.f174390i
            if (r2 == 0) goto L_0x01f2
            java.lang.String r7 = r2.mo108768t()
        L_0x01f2:
            if (r7 != 0) goto L_0x01f8
            java.lang.String r2 = ""
            r13 = r2
            goto L_0x01f9
        L_0x01f8:
            r13 = r7
        L_0x01f9:
            ig.d r14 = r4.f174389h
            n60.f r16 = th0.C101880a.f299978c
            r10 = r1
            r10.<init>(r11, r13, r14, r15, r16, r17)
            l60.b r0 = r0.mo85955a(r1)
            mg.l r1 = new mg.l
            r2 = r18
            r1.<init>(r2, r3, r4, r5)
            r0.f291320d = r1
            r0.mo85951a()
        L_0x0211:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p857mg.C99860m.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: l */
    public final void mo139214l(C61278a aVar, C102862b bVar, String str, Bitmap bitmap) {
        C87412m.m108594g(aVar, "item");
        C87412m.m108594g(bVar, "uiBinding");
        C87412m.m108594g(str, "localPath");
        WxImageView a = bVar.mo142565a();
        C87412m.m108593f(a, "uiBinding.albumImg");
        mo139215m(bVar, bitmap);
        boolean z = false;
        Log.m105925i(StringKtKt.TAG, "isSupport: %s, path: %s.", Boolean.valueOf(C89436a.m111810b(C86013q1.m106448i(str, false))), str);
        bVar.mo142566b().setVisibility(0);
        bVar.mo142565a().setVisibility(0);
        a.setOrientation(BackwardSupportUtil.ExifHelper.getExifOrientation(str));
        BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(str);
        C8477a0 a0Var = new C8477a0();
        if (imageOptions != null) {
            int i = imageOptions.outWidth;
            int i2 = imageOptions.outHeight;
            a.f48889h = i;
            a.f48890i = i2;
            if (i <= 0 || i2 <= 0) {
                z = true;
            }
            a0Var.f27482d = z;
        }
        a.mo26059d();
        a.setOnImageLoadEventListener(new C99861a(a0Var, a, bVar, this, bitmap));
        a.mo21400p(str, ImageSource.cachedBitmap(bitmap));
    }

    /* renamed from: m */
    public final void mo139215m(C102862b bVar, Bitmap bitmap) {
        C87412m.m108594g(bVar, "uiBinding");
        int i = 0;
        bVar.mo142566b().setVisibility(0);
        bVar.mo142565a().setVisibility(4);
        bVar.mo142566b().setMaxZoomLimit(4.5f);
        bVar.mo142566b().setEnableHorLongBmpMode(false);
        ForceGpuUtil.decideLayerType(bVar.mo142566b(), bitmap != null ? bitmap.getWidth() : 0, bitmap != null ? bitmap.getHeight() : 0);
        MultiTouchImageView b = bVar.mo142566b();
        int width = bitmap != null ? bitmap.getWidth() : 0;
        if (bitmap != null) {
            i = bitmap.getHeight();
        }
        b.f348280o = width;
        b.f348281p = i;
        bVar.mo142566b().setImageBitmap(bitmap);
        bVar.mo142566b().requestLayout();
    }
}
