package com.tencent.p014mm.pluginsdk.p133ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.modelavatar.C68092j;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import he3.C76163b;
import java.util.HashSet;
import nj3.C88989a;
import p196ln.C61311l;
import p196ln.C76706g;
import we3.C78592b;

@C88989a(3)
/* renamed from: com.tencent.mm.pluginsdk.ui.ProfileHdHeadImg */
public class ProfileHdHeadImg extends MMSecDataActivity {

    /* renamed from: h */
    public static final /* synthetic */ int f211640h = 0;

    /* renamed from: d */
    public GetHdHeadImageGalleryView f211641d;

    /* renamed from: e */
    public String f211642e = null;

    /* renamed from: f */
    public String f211643f = null;

    /* renamed from: g */
    public C68092j f211644g;

    /* renamed from: com.tencent.mm.pluginsdk.ui.ProfileHdHeadImg$a */
    public class C72737a implements C61311l.C61312a {

        /* renamed from: a */
        public final /* synthetic */ Bitmap f211645a;

        public C72737a(Bitmap bitmap) {
            this.f211645a = bitmap;
        }

        /* renamed from: a */
        public int mo1218a(int i, int i2) {
            Class cls = C76706g.class;
            ProfileHdHeadImg.this.f211644g.mo86278a();
            Log.m105925i("MicroMsg.ProfileHdHeadImg", "onSceneEnd: errType=%d, errCode=%d", Integer.valueOf(i), Integer.valueOf(i2));
            if (i == 0 && i2 == 0) {
                Bitmap k = ((AvatarStorage) ((C76706g) C86312j.m106911c(cls)).mo106826RE()).mo93562k(ProfileHdHeadImg.this.f211642e);
                if (k != null) {
                    ProfileHdHeadImg.this.mo100282H7(k, ((AvatarStorage) ((C76706g) C86312j.m106911c(cls)).mo106826RE()).mo93559h(ProfileHdHeadImg.this.f211642e, true));
                } else {
                    ProfileHdHeadImg.this.mo100282H7(this.f211645a, (String) null);
                }
                return 0;
            }
            ProfileHdHeadImg.this.mo100282H7(this.f211645a, (String) null);
            return 0;
        }
    }

    /* renamed from: H7 */
    public final void mo100282H7(Bitmap bitmap, String str) {
        try {
            Bitmap roundedCornerBitmap = BitmapUtil.getRoundedCornerBitmap(bitmap, false, 0.1f);
            C78592b.C53158a.m59566a().om0(this.f211642e, roundedCornerBitmap);
            if (bitmap.getWidth() < 480) {
                float width = (float) (480 / bitmap.getWidth());
                Matrix matrix = new Matrix();
                matrix.postScale(width, width);
                roundedCornerBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            }
            Log.m105919d("MicroMsg.ProfileHdHeadImg", "dkhdbm old[%d %d] new[%d %d]", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Integer.valueOf(roundedCornerBitmap.getWidth()), Integer.valueOf(roundedCornerBitmap.getHeight()));
            this.f211641d.setHdHeadImage(roundedCornerBitmap);
            this.f211641d.setHdHeadImagePath(str);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ProfileHdHeadImg", e, "", new Object[0]);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ayc;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e0 A[SYNTHETIC, Splitter:B:29:0x00e0] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x018c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void init() {
        /*
            r12 = this;
            java.lang.Class<ln.g> r0 = p196ln.C76706g.class
            r1 = 2131305324(0x7f09236c, float:1.8228816E38)
            android.view.View r1 = r12.findViewById(r1)
            com.tencent.mm.pluginsdk.ui.GetHdHeadImageGalleryView r1 = (com.tencent.p014mm.pluginsdk.p133ui.GetHdHeadImageGalleryView) r1
            r12.f211641d = r1
            java.lang.String r2 = r12.f211642e
            r1.setUsername(r2)
            com.tencent.mm.pluginsdk.ui.GetHdHeadImageGalleryView r1 = r12.f211641d
            vd3.t$$a r2 = new vd3.t$$a
            r2.<init>(r12)
            r1.setSingleClickOverListener(r2)
            f40.o r1 = f40.C86709a0.m107535s()
            boolean r1 = r1.mo121147n()
            r2 = 0
            if (r1 != 0) goto L_0x003e
            nj3.C76912y0.m92771j(r12, r2)
            di3.d r0 = di3.C86312j.m106911c(r0)
            ln.g r0 = (p196ln.C76706g) r0
            ln.k r0 = r0.mo106826RE()
            com.tencent.mm.modelavatar.AvatarStorage r0 = (com.tencent.p014mm.modelavatar.AvatarStorage) r0
            android.graphics.Bitmap r0 = r0.mo93560i(r12)
            r12.mo100282H7(r0, r2)
            return
        L_0x003e:
            oa1.d r1 = oa1.C117731d.m166007c()
            tf3.c r3 = new tf3.c
            r3.<init>()
            int r1 = r1.mo182440a(r3)
            r3 = 1
            if (r1 != r3) goto L_0x008a
            java.lang.String r1 = r12.f211642e
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85799F5(r1)
            if (r1 != 0) goto L_0x008a
            bl3.r r0 = bl3.C39818r.f106831a
            bl3.r$a r0 = r0.mo62444c(r12)
            java.lang.Class<he3.b> r1 = he3.C76163b.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            java.lang.String r1 = "UICProvider.of(activity)…oadHdHeadUIC::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            he3.b r0 = (he3.C76163b) r0
            java.lang.String r1 = r12.f211642e
            vd3.t$$b r4 = new vd3.t$$b
            r4.<init>(r12)
            java.lang.String r5 = "username"
            gy3.C87412m.m108594g(r1, r5)
            rx3.g r5 = r0.f223096d
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            com.tencent.mm.sdk.coroutines.LifecycleScope r5 = (com.tencent.p014mm.sdk.coroutines.LifecycleScope) r5
            he3.a r6 = new he3.a
            r6.<init>(r1, r0, r4, r2)
            com.tencent.p014mm.sdk.coroutines.LifecycleScope.launchDefault$default(r5, r2, r6, r3, r2)
            goto L_0x023f
        L_0x008a:
            java.lang.String r1 = r12.f211643f
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            java.lang.String r4 = ""
            r5 = 0
            if (r1 != 0) goto L_0x0196
            java.lang.String r1 = r12.f211642e
            java.lang.String r6 = r12.f211643f
            r7 = 2131234288(0x7f080df0, float:1.8084738E38)
            f40.o r8 = f40.C86709a0.m107535s()
            boolean r8 = r8.mo121147n()
            java.lang.String r9 = "MicroMsg.BrandLogic"
            if (r8 != 0) goto L_0x00eb
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.bindlowMemeryOption(r1)
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x00dd }
            android.content.res.Resources r6 = r6.getResources()     // Catch:{ all -> 0x00dd }
            java.io.InputStream r6 = r6.openRawResource(r7)     // Catch:{ all -> 0x00dd }
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r6, r2, r1)     // Catch:{ all -> 0x00da }
            if (r6 == 0) goto L_0x00cc
            r6.close()     // Catch:{ IOException -> 0x00c6 }
            goto L_0x00cc
        L_0x00c6:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r6, r4, r7)
        L_0x00cc:
            if (r1 == 0) goto L_0x01a4
            int r6 = r1.getWidth()
            int r6 = r6 >> r3
            float r6 = (float) r6
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r1, r5, r6)
            goto L_0x01a4
        L_0x00da:
            r0 = move-exception
            r2 = r6
            goto L_0x00de
        L_0x00dd:
            r0 = move-exception
        L_0x00de:
            if (r2 == 0) goto L_0x00ea
            r2.close()     // Catch:{ IOException -> 0x00e4 }
            goto L_0x00ea
        L_0x00e4:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r1, r4, r2)
        L_0x00ea:
            throw r0
        L_0x00eb:
            if (r1 == 0) goto L_0x0194
            f40.e r7 = f40.C86709a0.m107523b()
            boolean r7 = r7.mo121114l()
            if (r7 != 0) goto L_0x00f9
            goto L_0x0194
        L_0x00f9:
            if (r6 != 0) goto L_0x0103
            java.lang.String r6 = rb0.C48011x.m53371a(r1, r2)
            if (r6 != 0) goto L_0x0103
            goto L_0x0194
        L_0x0103:
            rb0.x$a r7 = rb0.C48009v0.Lx0()
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.graphics.Bitmap>> r8 = r7.f128792c
            java.util.HashMap r8 = (java.util.HashMap) r8
            boolean r8 = r8.containsKey(r1)
            java.lang.String r10 = "not found brand icon local"
            if (r8 == 0) goto L_0x0150
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.graphics.Bitmap>> r8 = r7.f128792c
            java.util.HashMap r8 = (java.util.HashMap) r8
            java.lang.Object r8 = r8.get(r1)
            java.lang.ref.WeakReference r8 = (java.lang.ref.WeakReference) r8
            java.lang.Object r8 = r8.get()
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            if (r8 == 0) goto L_0x012b
            boolean r8 = r8.isRecycled()
            if (r8 == 0) goto L_0x0174
        L_0x012b:
            java.lang.String r8 = rb0.C48011x.m53371a(r1, r6)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            java.lang.String r8 = r7.mo72797a(r8)
            android.graphics.Bitmap r8 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((java.lang.String) r8)
            if (r8 != 0) goto L_0x014c
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            goto L_0x0187
        L_0x014c:
            r7.mo72798b(r1, r8)
            goto L_0x0174
        L_0x0150:
            java.lang.String r8 = rb0.C48011x.m53371a(r1, r6)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            java.lang.String r8 = r7.mo72797a(r8)
            android.graphics.Bitmap r8 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((java.lang.String) r8)
            if (r8 != 0) goto L_0x0171
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            goto L_0x0187
        L_0x0171:
            r7.mo72798b(r1, r8)
        L_0x0174:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.graphics.Bitmap>> r7 = r7.f128792c
            java.util.HashMap r7 = (java.util.HashMap) r7
            java.lang.Object r7 = r7.get(r1)
            java.lang.ref.WeakReference r7 = (java.lang.ref.WeakReference) r7
            if (r7 == 0) goto L_0x0187
            java.lang.Object r7 = r7.get()
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            goto L_0x0188
        L_0x0187:
            r7 = r2
        L_0x0188:
            if (r7 == 0) goto L_0x018c
            r1 = r7
            goto L_0x01a4
        L_0x018c:
            rb0.w r7 = new rb0.w
            r7.<init>(r1, r6)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r7)
        L_0x0194:
            r1 = r2
            goto L_0x01a4
        L_0x0196:
            java.lang.Class<ln.i> r1 = p196ln.C76708i.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ln.i r1 = (p196ln.C76708i) r1
            java.lang.String r6 = r12.f211642e
            android.graphics.Bitmap r1 = r1.mo106820Fj(r6, r3)
        L_0x01a4:
            if (r1 != 0) goto L_0x01b1
            android.content.res.Resources r1 = r12.getResources()
            r6 = 2131231871(0x7f08047f, float:1.8079835E38)
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeResource(r1, r6)
        L_0x01b1:
            java.lang.String r6 = "MicroMsg.ProfileHdHeadImg"
            if (r1 == 0) goto L_0x01cc
            boolean r7 = r1.isRecycled()
            if (r7 != 0) goto L_0x01cc
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.String r8 = r12.f211642e
            r7[r5] = r8
            java.lang.String r8 = "The avatar of %s is in the cache"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r7)
            com.tencent.mm.pluginsdk.ui.GetHdHeadImageGalleryView r7 = r12.f211641d
            r7.setThumbImage(r1)
            goto L_0x01d7
        L_0x01cc:
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.String r8 = r12.f211642e
            r7[r5] = r8
            java.lang.String r8 = "The avatar of %s is not in the cache, use default avatar"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r7)
        L_0x01d7:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r7 != 0) goto L_0x01df
            r12.f211642e = r2
        L_0x01df:
            di3.d r2 = di3.C86312j.m106911c(r0)
            ln.g r2 = (p196ln.C76706g) r2
            ln.k r2 = r2.mo106826RE()
            java.lang.String r7 = r12.f211642e
            com.tencent.mm.modelavatar.AvatarStorage r2 = (com.tencent.p014mm.modelavatar.AvatarStorage) r2
            android.graphics.Bitmap r2 = r2.mo93562k(r7)
            if (r2 == 0) goto L_0x021a
            boolean r7 = r2.isRecycled()
            if (r7 != 0) goto L_0x021a
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r4 = r12.f211642e
            r1[r5] = r4
            java.lang.String r4 = "The HDAvatar of %s is already exists"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r1)
            di3.d r0 = di3.C86312j.m106911c(r0)
            ln.g r0 = (p196ln.C76706g) r0
            ln.k r0 = r0.mo106826RE()
            java.lang.String r1 = r12.f211642e
            com.tencent.mm.modelavatar.AvatarStorage r0 = (com.tencent.p014mm.modelavatar.AvatarStorage) r0
            java.lang.String r0 = r0.mo93559h(r1, r3)
            r12.mo100282H7(r2, r0)
            return
        L_0x021a:
            com.tencent.mm.modelavatar.j r0 = new com.tencent.mm.modelavatar.j
            r0.<init>()
            r12.f211644g = r0
            java.lang.String r2 = r12.f211642e
            com.tencent.mm.pluginsdk.ui.ProfileHdHeadImg$a r3 = new com.tencent.mm.pluginsdk.ui.ProfileHdHeadImg$a
            r3.<init>(r1)
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85799F5(r2)
            if (r1 == 0) goto L_0x023c
            java.lang.Class<qy2.u> r1 = qy2.C47902u.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            qy2.u r1 = (qy2.C47902u) r1
            java.lang.String r4 = r12.f211642e
            java.lang.String r4 = r1.mo72653aY(r4)
        L_0x023c:
            r0.mo93589c(r2, r3, r4)
        L_0x023f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.ProfileHdHeadImg.init():void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo91104o();
        }
        this.f211642e = getIntent().getStringExtra("username");
        this.f211643f = getIntent().getStringExtra("brand_icon_url");
        setActionbarColor(getResources().getColor(C0966R.color.BW_0));
        setNavigationbarColor(getResources().getColor(C0966R.color.BW_0));
        init();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C76163b.class);
    }
}
