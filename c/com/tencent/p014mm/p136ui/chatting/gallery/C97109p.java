package com.tencent.p014mm.p136ui.chatting.gallery;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import com.davemorrissey.labs.subscaleview.view.ImageSource;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.base.WxImageView;
import com.tencent.p014mm.p136ui.chatting.gallery.C97056h;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import o90.C100301b;
import p158gt.C98201k;
import p823sg.C101611g;
import q90.C101062d;

/* renamed from: com.tencent.mm.ui.chatting.gallery.p */
public class C97109p implements ViewPager.OnPageChangeListener {

    /* renamed from: A */
    public static long f284916A;

    /* renamed from: y */
    public static int f284917y;

    /* renamed from: z */
    public static int f284918z;

    /* renamed from: d */
    public QueueWorkerThread f284919d = new QueueWorkerThread(1, "chatting-image-gallery-lazy-loader");

    /* renamed from: e */
    public SparseArray<WeakReference<View>> f284920e = new SparseArray<>();

    /* renamed from: f */
    public HashMap<String, Integer> f284921f = new HashMap<>();

    /* renamed from: g */
    public SparseArray<String> f284922g = new SparseArray<>();

    /* renamed from: h */
    public SparseArray<Bitmap> f284923h = new SparseArray<>();

    /* renamed from: i */
    public SparseArray<String> f284924i = new SparseArray<>();

    /* renamed from: j */
    public C97048f f284925j;

    /* renamed from: n */
    public int f284926n = 0;

    /* renamed from: o */
    public int f284927o = -1;

    /* renamed from: p */
    public C101611g<String, Bitmap> f284928p;

    /* renamed from: q */
    public C101611g<String, Bitmap> f284929q;

    /* renamed from: r */
    public LinkedList<Integer> f284930r;

    /* renamed from: s */
    public SparseIntArray f284931s;

    /* renamed from: t */
    public LinkedList<String> f284932t;

    /* renamed from: u */
    public LinkedList<Integer> f284933u;

    /* renamed from: v */
    public Bitmap f284934v;

    /* renamed from: w */
    public MMHandler f284935w;

    /* renamed from: x */
    public boolean f284936x;

    /* renamed from: com.tencent.mm.ui.chatting.gallery.p$a */
    public class C97110a implements C101611g.C101612b<String, Bitmap> {
        public C97110a(C97109p pVar) {
        }

        public void preRemoveCallback(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            Bitmap bitmap = (Bitmap) obj2;
            Bitmap bitmap2 = (Bitmap) obj3;
            if (bitmap != null && !bitmap.isRecycled()) {
                Log.m105925i("MicroMsg.ImageGalleryLazyLoader", "recycle bitmap:%s", bitmap.toString());
                bitmap.recycle();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.p$b */
    public class C97111b implements C101611g.C101612b<String, Bitmap> {
        public C97111b() {
        }

        public void preRemoveCallback(Object obj, Object obj2, Object obj3) {
            Bitmap bitmap = (Bitmap) obj2;
            Bitmap bitmap2 = (Bitmap) obj3;
            Log.m105925i("MicroMsg.ImageGalleryLazyLoader", "preRemoveCallback %s", (String) obj);
            if (bitmap != null && !bitmap.isRecycled() && C97109p.this.f284931s.indexOfKey(bitmap.hashCode()) < 0) {
                if (C97109p.this.f284930r.contains(Integer.valueOf(bitmap.hashCode()))) {
                    C97109p.this.f284930r.remove(Integer.valueOf(bitmap.hashCode()));
                    return;
                }
                Log.m105925i("MicroMsg.ImageGalleryLazyLoader", "recycle bitmap:%s", bitmap.toString());
                bitmap.recycle();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.p$c */
    public class C97112c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f284938d;

        /* renamed from: com.tencent.mm.ui.chatting.gallery.p$c$a */
        public class C97113a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f284940d;

            public C97113a(Bitmap bitmap) {
                this.f284940d = bitmap;
            }

            public void run() {
                C101611g<String, Bitmap> gVar = C97109p.this.f284928p;
                ((C100301b) gVar).put(C97112c.this.f284938d + "", this.f284940d);
            }
        }

        public C97112c(int i) {
            this.f284938d = i;
        }

        public void run() {
            C72963f4 b;
            C97056h.C97067g B;
            C97048f fVar = C97109p.this.f284925j;
            if (fVar == null) {
                Log.m105920e("MicroMsg.ImageGalleryLazyLoader", "loader is null!");
                return;
            }
            int i = this.f284938d;
            C97100o oVar = (C97100o) fVar;
            C97056h hVar = oVar.f284638d;
            Bitmap bitmap = null;
            if (!(hVar == null || (b = hVar.f284715h.mo135942b(i)) == null || (B = C97056h.m124949B(b)) == C97056h.C97067g.video || B == C97056h.C97067g.sight)) {
                String str = oVar.f284891n.get(b);
                if (str == null) {
                    str = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).v10(b.mo108765s2(), true);
                    oVar.f284891n.put(b, str);
                }
                String str2 = str + "hd";
                bitmap = C86013q1.m106450k(str2) ? oVar.mo136001w(str2) : oVar.mo136001w(str);
            }
            if (bitmap != null) {
                C97109p.this.f284935w.post(new C97113a(bitmap));
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.p$d */
    public class C97114d implements QueueWorkerThread.ThreadObject {

        /* renamed from: d */
        public Bitmap f284942d = null;

        /* renamed from: e */
        public boolean f284943e = false;

        /* renamed from: f */
        public final /* synthetic */ String f284944f;

        /* renamed from: g */
        public final /* synthetic */ int f284945g;

        /* renamed from: com.tencent.mm.ui.chatting.gallery.p$d$a */
        public class C97115a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ View f284947d;

            /* renamed from: e */
            public final /* synthetic */ String f284948e;

            public C97115a(View view, String str) {
                this.f284947d = view;
                this.f284948e = str;
            }

            public void run() {
                Bitmap bitmap;
                C97114d dVar = C97114d.this;
                WxImageView wxImageView = (WxImageView) this.f284947d;
                String str = dVar.f284944f;
                String str2 = this.f284948e;
                int i = dVar.f284945g;
                if (C97109p.this.f284925j != null && wxImageView != null) {
                    ImageSource imageSource = null;
                    if (!Util.isNullOrNil(str)) {
                        Object[] objArr = new Object[4];
                        boolean z = false;
                        objArr[0] = Integer.valueOf(i);
                        objArr[1] = Integer.valueOf(C97109p.this.f284927o);
                        objArr[2] = Boolean.valueOf(C97109p.this.f284934v == null);
                        Bitmap bitmap2 = C97109p.this.f284934v;
                        if (bitmap2 != null && bitmap2.isRecycled()) {
                            z = true;
                        }
                        objArr[3] = Boolean.valueOf(z);
                        Log.m105925i("MicroMsg.ImageGalleryLazyLoader", "alvinluo loadWxImageView position: %d, mLastPosition: %d, previewBitmap == null: %b, recycle: %b", objArr);
                        C97109p pVar = C97109p.this;
                        if (i == pVar.f284927o && (bitmap = pVar.f284934v) != null && !bitmap.isRecycled()) {
                            imageSource = ImageSource.cachedBitmap(C97109p.this.f284934v);
                        } else if (!Util.isNullOrNil(str2)) {
                            imageSource = ImageSource.uri(str2);
                        }
                        ((C97100o) C97109p.this.f284925j).getClass();
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        Bitmap d = MMBitmapFactory.m98735d(str, options);
                        if (d != null) {
                            d.recycle();
                        }
                        wxImageView.setOrientation(BackwardSupportUtil.ExifHelper.getExifOrientation(str));
                        int i2 = options.outWidth;
                        int i3 = options.outHeight;
                        wxImageView.f48889h = i2;
                        wxImageView.f48890i = i3;
                        wxImageView.mo26059d();
                        wxImageView.mo21400p(str, imageSource);
                    }
                }
            }
        }

        public C97114d(String str, int i) {
            this.f284944f = str;
            this.f284945g = i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
            r2 = r6.f284946h.f284921f.get(r6.f284944f).intValue();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean doInBackground() {
            /*
                r6 = this;
                com.tencent.mm.ui.chatting.gallery.p r0 = com.tencent.p014mm.p136ui.chatting.gallery.C97109p.this
                com.tencent.mm.ui.chatting.gallery.f r0 = r0.f284925j
                r1 = 0
                if (r0 == 0) goto L_0x0081
                java.lang.String r0 = r6.f284944f
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x0010
                goto L_0x0081
            L_0x0010:
                r0 = 1
                com.tencent.mm.ui.chatting.gallery.p r2 = com.tencent.p014mm.p136ui.chatting.gallery.C97109p.this     // Catch:{ Exception -> 0x006d }
                java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r2.f284921f     // Catch:{ Exception -> 0x006d }
                java.lang.String r3 = r6.f284944f     // Catch:{ Exception -> 0x006d }
                boolean r2 = r2.containsKey(r3)     // Catch:{ Exception -> 0x006d }
                if (r2 == 0) goto L_0x005e
                com.tencent.mm.ui.chatting.gallery.p r2 = com.tencent.p014mm.p136ui.chatting.gallery.C97109p.this     // Catch:{ Exception -> 0x006d }
                java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r2.f284921f     // Catch:{ Exception -> 0x006d }
                java.lang.String r3 = r6.f284944f     // Catch:{ Exception -> 0x006d }
                java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x006d }
                java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x006d }
                int r2 = r2.intValue()     // Catch:{ Exception -> 0x006d }
                com.tencent.mm.ui.chatting.gallery.p r3 = com.tencent.p014mm.p136ui.chatting.gallery.C97109p.this     // Catch:{ Exception -> 0x006d }
                android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> r3 = r3.f284920e     // Catch:{ Exception -> 0x006d }
                java.lang.Object r3 = r3.get(r2)     // Catch:{ Exception -> 0x006d }
                java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch:{ Exception -> 0x006d }
                if (r3 == 0) goto L_0x005e
                java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x006d }
                android.view.View r3 = (android.view.View) r3     // Catch:{ Exception -> 0x006d }
                if (r3 == 0) goto L_0x005e
                boolean r4 = r3 instanceof com.tencent.p014mm.p136ui.base.WxImageView     // Catch:{ Exception -> 0x006d }
                if (r4 == 0) goto L_0x005e
                com.tencent.mm.ui.chatting.gallery.p r4 = com.tencent.p014mm.p136ui.chatting.gallery.C97109p.this     // Catch:{ Exception -> 0x006d }
                android.util.SparseArray<java.lang.String> r4 = r4.f284924i     // Catch:{ Exception -> 0x006d }
                java.lang.Object r2 = r4.get(r2)     // Catch:{ Exception -> 0x006d }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x006d }
                r6.f284943e = r0     // Catch:{ Exception -> 0x006d }
                com.tencent.mm.ui.chatting.gallery.p r4 = com.tencent.p014mm.p136ui.chatting.gallery.C97109p.this     // Catch:{ Exception -> 0x006d }
                com.tencent.mm.sdk.platformtools.MMHandler r4 = r4.f284935w     // Catch:{ Exception -> 0x006d }
                com.tencent.mm.ui.chatting.gallery.p$d$a r5 = new com.tencent.mm.ui.chatting.gallery.p$d$a     // Catch:{ Exception -> 0x006d }
                r5.<init>(r3, r2)     // Catch:{ Exception -> 0x006d }
                r4.post(r5)     // Catch:{ Exception -> 0x006d }
                return r0
            L_0x005e:
                com.tencent.mm.ui.chatting.gallery.p r2 = com.tencent.p014mm.p136ui.chatting.gallery.C97109p.this     // Catch:{ Exception -> 0x006d }
                com.tencent.mm.ui.chatting.gallery.f r2 = r2.f284925j     // Catch:{ Exception -> 0x006d }
                java.lang.String r3 = r6.f284944f     // Catch:{ Exception -> 0x006d }
                com.tencent.mm.ui.chatting.gallery.o r2 = (com.tencent.p014mm.p136ui.chatting.gallery.C97100o) r2     // Catch:{ Exception -> 0x006d }
                android.graphics.Bitmap r2 = r2.mo136001w(r3)     // Catch:{ Exception -> 0x006d }
                r6.f284942d = r2     // Catch:{ Exception -> 0x006d }
                return r0
            L_0x006d:
                r2 = move-exception
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = r2.getMessage()
                r0[r1] = r2
                java.lang.String r2 = "MicroMsg.ImageGalleryLazyLoader"
                java.lang.String r3 = "try to load Bmp fail: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r3, r0)
                r0 = 0
                r6.f284942d = r0
            L_0x0081:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.C97109p.C97114d.doInBackground():boolean");
        }

        public boolean onPostExecute() {
            int i;
            C97109p pVar = C97109p.this;
            pVar.f284936x = false;
            if (!this.f284943e) {
                if (pVar.f284921f.containsKey(this.f284944f)) {
                    int intValue = C97109p.this.f284921f.get(this.f284944f).intValue();
                    C97109p pVar2 = C97109p.this;
                    if (!(pVar2.f284926n == 0)) {
                        pVar2.f284923h.put(intValue, this.f284942d);
                    } else {
                        pVar2.mo136010a(intValue, this.f284942d);
                    }
                }
                C97109p.this.mo136016g(this.f284944f, this.f284942d);
                C97109p.this.mo136012c(this.f284945g, this.f284942d);
                Object[] objArr = new Object[1];
                Bitmap bitmap = this.f284942d;
                if (bitmap == null || bitmap.isRecycled()) {
                    i = 0;
                } else {
                    i = bitmap.getByteCount();
                    if (i < 0) {
                        throw new IllegalStateException("Negative size: " + bitmap);
                    }
                }
                objArr[0] = Integer.valueOf(i);
                Log.m105925i("MicroMsg.ImageGalleryLazyLoader", "bmp size : %s", objArr);
                this.f284942d = null;
            }
            C97109p.this.mo136015f();
            return false;
        }
    }

    public C97109p(C97048f fVar) {
        Class<C97109p> cls = C97109p.class;
        this.f284928p = new C100301b(400, new C97110a(this), cls);
        this.f284929q = new C100301b(5, new C97111b(), cls);
        this.f284930r = new LinkedList<>();
        this.f284931s = new SparseIntArray();
        this.f284932t = new LinkedList<>();
        this.f284933u = new LinkedList<>();
        this.f284935w = new MMHandler();
        this.f284936x = false;
        this.f284925j = fVar;
    }

    /* renamed from: a */
    public final void mo136010a(int i, Bitmap bitmap) {
        if (this.f284920e.get(i) != null) {
            ((C97100o) this.f284925j).mo136002x(0, (View) this.f284920e.get(i).get(), this.f284922g.get(i), bitmap);
            mo136014e(i);
        }
    }

    /* renamed from: b */
    public void mo136011b(ImageView imageView, String str, int i) {
        if (!this.f284932t.contains(str)) {
            int hashCode = imageView.hashCode();
            mo136014e(hashCode);
            this.f284921f.put(str, Integer.valueOf(hashCode));
            this.f284922g.put(hashCode, str);
            this.f284920e.put(hashCode, new WeakReference(imageView));
            this.f284932t.add(str);
            this.f284933u.add(Integer.valueOf(i));
            mo136015f();
        }
    }

    /* renamed from: c */
    public void mo136012c(int i, Bitmap bitmap) {
        int i2 = this.f284927o;
        if (i == i2 || i2 == -1) {
            Log.m105925i("MicroMsg.ImageGalleryLazyLoader", "alvinluo notifyBitmapLoaded cache bitmap, position: %d", Integer.valueOf(i));
            this.f284934v = bitmap;
        }
    }

    /* renamed from: d */
    public final void mo136013d(int i) {
        C101611g<String, Bitmap> gVar = this.f284928p;
        if (!((C101062d) gVar).check(i + "")) {
            C86709a0.m107525e().postToWorkerDelayed(new C97112c(i), 300);
        }
    }

    /* renamed from: e */
    public final void mo136014e(int i) {
        if (this.f284922g.get(i) != null) {
            this.f284920e.remove(i);
            this.f284922g.remove(i);
            this.f284921f.remove(this.f284922g.get(i));
            this.f284923h.remove(i);
        }
    }

    /* renamed from: f */
    public final void mo136015f() {
        if (!this.f284936x && this.f284932t.size() != 0) {
            String removeLast = this.f284932t.removeLast();
            int intValue = this.f284933u.removeLast().intValue();
            if (this.f284921f.containsKey(removeLast)) {
                this.f284936x = true;
                this.f284919d.add(new C97114d(removeLast, intValue));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0057  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo136016g(java.lang.String r8, android.graphics.Bitmap r9) {
        /*
            r7 = this;
            r0 = 0
            if (r9 != 0) goto L_0x0005
        L_0x0003:
            r1 = 0
            goto L_0x004d
        L_0x0005:
            int r1 = r9.getWidth()
            long r1 = (long) r1
            int r3 = r9.getHeight()
            long r3 = (long) r3
            long r1 = r1 * r3
            int r3 = f284918z
            if (r3 == 0) goto L_0x0019
            int r3 = f284917y
            if (r3 != 0) goto L_0x0042
        L_0x0019:
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = r3.widthPixels
            f284917y = r3
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = r3.heightPixels
            f284918z = r3
            int r3 = f284917y
            long r3 = (long) r3
            long r5 = f284916A
            long r3 = r3 * r5
            f284916A = r3
        L_0x0042:
            long r3 = f284916A
            r5 = 2
            long r3 = r3 * r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0003
            r1 = 1
        L_0x004d:
            java.lang.String r2 = "MicroMsg.ImageGalleryLazyLoader"
            if (r1 == 0) goto L_0x0057
            java.lang.String r8 = "file %s too big to cache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)
            return
        L_0x0057:
            sg.g<java.lang.String, android.graphics.Bitmap> r1 = r7.f284929q
            o90.b r1 = (o90.C100301b) r1
            r1.mo139557c(r8, r9)
            com.tencent.mm.ui.chatting.gallery.t r1 = com.tencent.p014mm.p136ui.chatting.gallery.C97128t.C97130b.f284993a
            sg.g<java.lang.String, android.graphics.Bitmap> r1 = r1.f284989a
            q90.d r1 = (q90.C101062d) r1
            boolean r1 = r1.check(r8)
            if (r1 == 0) goto L_0x0083
            java.lang.String r1 = "update origCache and preload cache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            com.tencent.mm.ui.chatting.gallery.t r1 = com.tencent.p014mm.p136ui.chatting.gallery.C97128t.C97130b.f284993a     // Catch:{ Exception -> 0x007a }
            sg.g<java.lang.String, android.graphics.Bitmap> r1 = r1.f284989a     // Catch:{ Exception -> 0x007a }
            o90.b r1 = (o90.C100301b) r1     // Catch:{ Exception -> 0x007a }
            r1.mo139557c(r8, r9)     // Catch:{ Exception -> 0x007a }
            goto L_0x0083
        L_0x007a:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.String r0 = "update preload cache failed"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r8, r0, r9)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.C97109p.mo136016g(java.lang.String, android.graphics.Bitmap):void");
    }

    public void onPageScrollStateChanged(int i) {
        this.f284926n = i;
        if (i == 0) {
            int size = this.f284923h.size();
            int[] iArr = new int[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f284923h.keyAt(i2);
            }
            for (int i3 = 0; i3 < size; i3++) {
                int i4 = iArr[i3];
                mo136010a(i4, this.f284923h.get(i4));
            }
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        if (((C97100o) this.f284925j).f284638d.f284715h.f284748g) {
            int i2 = this.f284927o;
            if (i2 == -1) {
                int i3 = 0;
                while (true) {
                    if (i3 != 0) {
                        int i4 = i + i3;
                        int i5 = i + 3;
                        if (i4 > i5 && i - i3 < Math.max(i - 3, 0)) {
                            break;
                        }
                        if (i4 <= i5) {
                            mo136013d(i4);
                        }
                        int i6 = i - i3;
                        if (i6 >= Math.max(i - 3, 0)) {
                            mo136013d(i6);
                        }
                    } else {
                        mo136013d(i);
                    }
                    i3++;
                }
            } else if (i2 > i) {
                mo136013d(Math.max(i - 3, 0));
            } else if (i2 < i) {
                mo136013d(i + 3);
            }
            this.f284927o = i;
            C97100o oVar = (C97100o) this.f284925j;
            if (oVar == null) {
                return;
            }
            if (oVar.f284638d.mo129059c(i, true) != null) {
                this.f284934v = null;
                return;
            }
            WxImageView f = oVar.f284638d.mo129061f(this.f284927o, true);
            if (f != null) {
                this.f284934v = f.getFullImageBitmap();
            }
        }
    }
}
