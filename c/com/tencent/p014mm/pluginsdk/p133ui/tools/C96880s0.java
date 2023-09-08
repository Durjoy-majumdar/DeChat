package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.fav.p047ui.C68923l0;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer$$i;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;
import mu3.C109639a;
import o90.C100301b;
import p755xs.C102720b;
import p755xs.C102721c;
import p823sg.C101611g;
import p996kj.C88155a;
import sf0.C101592a0;
import sf0.C101594c0;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.s0 */
public class C96880s0 implements C102721c {

    /* renamed from: a */
    public volatile boolean f283850a = false;

    /* renamed from: b */
    public byte[] f283851b = new byte[0];

    /* renamed from: c */
    public MMHandler f283852c;

    /* renamed from: d */
    public MMHandler f283853d;

    /* renamed from: e */
    public HashMap<String, ImageView> f283854e = new HashMap<>();

    /* renamed from: f */
    public HashMap<ImageView, String> f283855f = new HashMap<>();

    /* renamed from: g */
    public C100301b<Bitmap> f283856g;

    /* renamed from: h */
    public SparseArray<Bitmap> f283857h;

    /* renamed from: i */
    public C96887f<C96891i> f283858i;

    /* renamed from: j */
    public C96887f<C96889g> f283859j;

    /* renamed from: k */
    public boolean f283860k = true;

    /* renamed from: l */
    public C102721c.C102722a f283861l = null;

    /* renamed from: m */
    public C101594c0.C101595a f283862m = new C96885e();

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.s0$a */
    public class C96881a extends C96887f<C96891i> {
        public C96881a(int i, C109639a aVar) {
            super(C96880s0.this, i, aVar);
        }

        /* renamed from: a */
        public Object mo135203a() {
            return new C96891i((C96881a) null);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.s0$b */
    public class C96882b extends C96887f<C96889g> {
        public C96882b(int i, C109639a aVar) {
            super(C96880s0.this, i, aVar);
        }

        /* renamed from: a */
        public Object mo135203a() {
            return new C96889g((C96881a) null);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.s0$c */
    public class C96883c implements C101611g.C101612b<String, Bitmap> {
        public C96883c(C96880s0 s0Var) {
        }

        public void preRemoveCallback(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            Bitmap bitmap = (Bitmap) obj2;
            Bitmap bitmap2 = (Bitmap) obj3;
            if (bitmap != null) {
                Log.m105925i("MicroMsg.ImageEngine", "recycle bitmap:%s", bitmap.toString());
                bitmap.recycle();
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.s0$d */
    public class C96884d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ SparseArray f283865d;

        /* renamed from: e */
        public final /* synthetic */ C100301b f283866e;

        public C96884d(C96880s0 s0Var, SparseArray sparseArray, C100301b bVar) {
            this.f283865d = sparseArray;
            this.f283866e = bVar;
        }

        public void run() {
            Log.m105924i("MicroMsg.ImageEngine", "begin do recycled");
            for (int i = 0; i < this.f283865d.size(); i++) {
                Bitmap bitmap = (Bitmap) this.f283865d.valueAt(i);
                if (bitmap != null) {
                    Log.m105919d("MicroMsg.ImageEngine", "recycled def bmp %s", bitmap.toString());
                    bitmap.recycle();
                }
            }
            this.f283865d.clear();
            Log.m105924i("MicroMsg.ImageEngine", "clear drawable cache");
            this.f283866e.clear();
            Log.m105924i("MicroMsg.ImageEngine", "end do recycled");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.s0$e */
    public class C96885e implements C101594c0.C101595a {

        /* renamed from: com.tencent.mm.pluginsdk.ui.tools.s0$e$a */
        public class C96886a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ImageView f283868d;

            /* renamed from: e */
            public final /* synthetic */ Bitmap f283869e;

            public C96886a(C96885e eVar, ImageView imageView, Bitmap bitmap) {
                this.f283868d = imageView;
                this.f283869e = bitmap;
            }

            public void run() {
                C96890h.m124460a(this.f283868d, this.f283869e);
            }
        }

        public C96885e() {
        }

        /* renamed from: j3 */
        public void mo24656j3(String str, Bitmap bitmap) {
            Object[] objArr = new Object[2];
            boolean z = false;
            objArr[0] = str;
            if (bitmap == null) {
                z = true;
            }
            objArr[1] = Boolean.valueOf(z);
            Log.m105927v("MicroMsg.ImageEngine", "on get picture finish, notifyKey[%s], bitmap is null[%B]", objArr);
            if (bitmap != null) {
                C96880s0.this.f283856g.put(str, bitmap);
                ImageView imageView = C96880s0.this.f283854e.get(str);
                if (imageView != null) {
                    C96880s0.this.f283855f.remove(imageView);
                    C96880s0.this.f283853d.post(new C96886a(this, imageView, bitmap));
                }
                C96880s0.this.f283854e.remove(str);
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.s0$f */
    public abstract class C96887f<T> {

        /* renamed from: a */
        public final int f283870a;

        /* renamed from: b */
        public LinkedList<T> f283871b = new LinkedList<>();

        /* renamed from: c */
        public MMHandler f283872c;

        /* renamed from: com.tencent.mm.pluginsdk.ui.tools.s0$f$a */
        public class C96888a extends MMHandler {
            public C96888a(C109639a aVar, C96880s0 s0Var) {
                super(aVar);
            }

            public void handleMessage(Message message) {
                C96887f fVar = C96887f.this;
                Object obj = message.obj;
                if (obj == null) {
                    fVar.getClass();
                } else if (fVar.f283871b.size() < fVar.f283870a) {
                    fVar.f283871b.add(obj);
                }
            }
        }

        public C96887f(C96880s0 s0Var, int i, C109639a aVar) {
            this.f283870a = Math.max(1, i);
            this.f283872c = new C96888a(aVar, s0Var);
        }

        /* renamed from: a */
        public abstract T mo135203a();
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.s0$g */
    public class C96889g implements Runnable {

        /* renamed from: d */
        public String[] f283874d;

        /* renamed from: e */
        public String f283875e;

        /* renamed from: f */
        public String f283876f;

        /* renamed from: g */
        public int f283877g;

        /* renamed from: h */
        public int f283878h;

        public C96889g(C96881a aVar) {
        }

        /* renamed from: a */
        public final Bitmap mo135206a(String str) {
            if (str == null) {
                return null;
            }
            if (this.f283878h <= 0 || this.f283877g <= 0) {
                Vector<WeakReference<C102720b.C78973a>> vector = C101594c0.f297416a;
                return C101594c0.C101596b.m133443e(str);
            }
            C96880s0.this.getClass();
            String str2 = str + "_" + this.f283877g + "_" + this.f283878h;
            int i = this.f283877g;
            int i2 = this.f283878h;
            Vector<WeakReference<C102720b.C78973a>> vector2 = C101594c0.f297416a;
            Bitmap f = C101594c0.C101596b.m133444f(str2, i, i2);
            if (f != null) {
                return f;
            }
            int exifOrientation = BackwardSupportUtil.ExifHelper.getExifOrientation(str);
            Bitmap extractThumbNail = (90 == exifOrientation || 270 == exifOrientation) ? BitmapUtil.extractThumbNail(str, this.f283877g, this.f283878h, true) : BitmapUtil.extractThumbNail(str, this.f283878h, this.f283877g, true);
            if (extractThumbNail == null) {
                return extractThumbNail;
            }
            Bitmap rotate = BitmapUtil.rotate(extractThumbNail, (float) exifOrientation);
            try {
                BitmapUtil.saveBitmapToImage(rotate, 100, Bitmap.CompressFormat.PNG, str2, false);
                return rotate;
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.ImageEngine", e, "", new Object[0]);
                return rotate;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
            r0 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
            if (r7.f283874d == null) goto L_0x0080;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
            r1 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
            r4 = r7.f283874d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
            if (r1 >= r4.length) goto L_0x0080;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
            if (r1 != 0) goto L_0x0051;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
            r0 = mo135206a(r4[0]);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
            if (r0 == null) goto L_0x007d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
            r7.f283879i.f283856g.put(r7.f283876f, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
            r0 = com.tencent.p014mm.pluginsdk.p133ui.tools.C96880s0.m124450c(r4[r1], r7.f283875e, r7.f283877g, r7.f283878h);
            r4 = r7.f283879i.f283856g.get(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
            if (r4 != null) goto L_0x0071;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
            r4 = mo135206a(r7.f283874d[r1]);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
            if (r4 == null) goto L_0x007c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
            r7.f283879i.f283856g.put(r0, r4);
            r0 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
            r0 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
            r1 = r1 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0080, code lost:
            if (r0 != null) goto L_0x00a7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0088, code lost:
            if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r7.f283875e) != false) goto L_0x00a7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x008a, code lost:
            r0 = sf0.C101594c0.m133439c(r7.f283879i.mo135201d(r7.f283876f, r7.f283875e, r7.f283877g, r7.f283878h));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x009c, code lost:
            if (r0 == null) goto L_0x00a7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x009e, code lost:
            r7.f283879i.f283856g.put(r7.f283876f, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a7, code lost:
            if (r0 == null) goto L_0x00f5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a9, code lost:
            r1 = r7.f283879i.f283851b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ad, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
            r2 = r7.f283879i.f283854e.get(r7.f283876f);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ba, code lost:
            if (r2 == null) goto L_0x00e7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bc, code lost:
            r7.f283879i.f283855f.remove(r2);
            r4 = r7.f283879i.f283858i;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cd, code lost:
            if (r4.f283871b.isEmpty() == false) goto L_0x00d4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cf, code lost:
            r4 = r4.mo135203a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d4, code lost:
            r4 = r4.f283871b.removeFirst();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00da, code lost:
            r4 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C96880s0.C96891i) r4;
            r4.f283883d = r2;
            r4.f283884e = r0;
            r7.f283879i.f283853d.post(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e7, code lost:
            r7.f283879i.f283854e.remove(r7.f283876f);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f0, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f5, code lost:
            r0 = r7.f283879i.f283859j.f283872c;
            r0.sendMessage(r0.obtainMessage(1, r7));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0102, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                com.tencent.mm.pluginsdk.ui.tools.s0 r0 = com.tencent.p014mm.pluginsdk.p133ui.tools.C96880s0.this
                boolean r0 = r0.f283850a
                if (r0 == 0) goto L_0x000f
                java.lang.String r0 = "MicroMsg.ImageEngine"
                java.lang.String r1 = "on load image jog, isQuit, return"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
                return
            L_0x000f:
                com.tencent.mm.pluginsdk.ui.tools.s0 r0 = com.tencent.p014mm.pluginsdk.p133ui.tools.C96880s0.this
                byte[] r0 = r0.f283851b
                monitor-enter(r0)
                com.tencent.mm.pluginsdk.ui.tools.s0 r1 = com.tencent.p014mm.pluginsdk.p133ui.tools.C96880s0.this     // Catch:{ all -> 0x0103 }
                java.util.HashMap<java.lang.String, android.widget.ImageView> r1 = r1.f283854e     // Catch:{ all -> 0x0103 }
                java.lang.String r2 = r7.f283876f     // Catch:{ all -> 0x0103 }
                java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0103 }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x0031
                java.lang.String r1 = "MicroMsg.ImageEngine"
                java.lang.String r4 = "check before decode, no match wait to render view, renderKey is %s, return"
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0103 }
                java.lang.String r5 = r7.f283876f     // Catch:{ all -> 0x0103 }
                r3[r2] = r5     // Catch:{ all -> 0x0103 }
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r4, r3)     // Catch:{ all -> 0x0103 }
                monitor-exit(r0)     // Catch:{ all -> 0x0103 }
                return
            L_0x0031:
                monitor-exit(r0)     // Catch:{ all -> 0x0103 }
                r0 = 0
                java.lang.String[] r1 = r7.f283874d
                if (r1 == 0) goto L_0x0080
                r1 = 0
            L_0x0038:
                java.lang.String[] r4 = r7.f283874d
                int r5 = r4.length
                if (r1 >= r5) goto L_0x0080
                if (r1 != 0) goto L_0x0051
                r0 = r4[r2]
                android.graphics.Bitmap r0 = r7.mo135206a(r0)
                if (r0 == 0) goto L_0x007d
                com.tencent.mm.pluginsdk.ui.tools.s0 r1 = com.tencent.p014mm.pluginsdk.p133ui.tools.C96880s0.this
                o90.b<android.graphics.Bitmap> r1 = r1.f283856g
                java.lang.String r2 = r7.f283876f
                r1.put(r2, r0)
                goto L_0x0080
            L_0x0051:
                r0 = r4[r1]
                java.lang.String r4 = r7.f283875e
                int r5 = r7.f283877g
                int r6 = r7.f283878h
                java.lang.String r0 = com.tencent.p014mm.pluginsdk.p133ui.tools.C96880s0.m124450c(r0, r4, r5, r6)
                com.tencent.mm.pluginsdk.ui.tools.s0 r4 = com.tencent.p014mm.pluginsdk.p133ui.tools.C96880s0.this
                o90.b<android.graphics.Bitmap> r4 = r4.f283856g
                java.lang.Object r4 = r4.get(r0)
                android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
                if (r4 != 0) goto L_0x0071
                java.lang.String[] r4 = r7.f283874d
                r4 = r4[r1]
                android.graphics.Bitmap r4 = r7.mo135206a(r4)
            L_0x0071:
                if (r4 == 0) goto L_0x007c
                com.tencent.mm.pluginsdk.ui.tools.s0 r1 = com.tencent.p014mm.pluginsdk.p133ui.tools.C96880s0.this
                o90.b<android.graphics.Bitmap> r1 = r1.f283856g
                r1.put(r0, r4)
                r0 = r4
                goto L_0x0080
            L_0x007c:
                r0 = r4
            L_0x007d:
                int r1 = r1 + 1
                goto L_0x0038
            L_0x0080:
                if (r0 != 0) goto L_0x00a7
                java.lang.String r1 = r7.f283875e
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 != 0) goto L_0x00a7
                com.tencent.mm.pluginsdk.ui.tools.s0 r0 = com.tencent.p014mm.pluginsdk.p133ui.tools.C96880s0.this
                java.lang.String r1 = r7.f283876f
                java.lang.String r2 = r7.f283875e
                int r4 = r7.f283877g
                int r5 = r7.f283878h
                sf0.a0 r0 = r0.mo135201d(r1, r2, r4, r5)
                android.graphics.Bitmap r0 = sf0.C101594c0.m133439c(r0)
                if (r0 == 0) goto L_0x00a7
                com.tencent.mm.pluginsdk.ui.tools.s0 r1 = com.tencent.p014mm.pluginsdk.p133ui.tools.C96880s0.this
                o90.b<android.graphics.Bitmap> r1 = r1.f283856g
                java.lang.String r2 = r7.f283876f
                r1.put(r2, r0)
            L_0x00a7:
                if (r0 == 0) goto L_0x00f5
                com.tencent.mm.pluginsdk.ui.tools.s0 r1 = com.tencent.p014mm.pluginsdk.p133ui.tools.C96880s0.this
                byte[] r1 = r1.f283851b
                monitor-enter(r1)
                com.tencent.mm.pluginsdk.ui.tools.s0 r2 = com.tencent.p014mm.pluginsdk.p133ui.tools.C96880s0.this     // Catch:{ all -> 0x00f2 }
                java.util.HashMap<java.lang.String, android.widget.ImageView> r2 = r2.f283854e     // Catch:{ all -> 0x00f2 }
                java.lang.String r4 = r7.f283876f     // Catch:{ all -> 0x00f2 }
                java.lang.Object r2 = r2.get(r4)     // Catch:{ all -> 0x00f2 }
                android.widget.ImageView r2 = (android.widget.ImageView) r2     // Catch:{ all -> 0x00f2 }
                if (r2 == 0) goto L_0x00e7
                com.tencent.mm.pluginsdk.ui.tools.s0 r4 = com.tencent.p014mm.pluginsdk.p133ui.tools.C96880s0.this     // Catch:{ all -> 0x00f2 }
                java.util.HashMap<android.widget.ImageView, java.lang.String> r4 = r4.f283855f     // Catch:{ all -> 0x00f2 }
                r4.remove(r2)     // Catch:{ all -> 0x00f2 }
                com.tencent.mm.pluginsdk.ui.tools.s0 r4 = com.tencent.p014mm.pluginsdk.p133ui.tools.C96880s0.this     // Catch:{ all -> 0x00f2 }
                com.tencent.mm.pluginsdk.ui.tools.s0$f<com.tencent.mm.pluginsdk.ui.tools.s0$i> r4 = r4.f283858i     // Catch:{ all -> 0x00f2 }
                java.util.LinkedList<T> r5 = r4.f283871b     // Catch:{ all -> 0x00f2 }
                boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x00f2 }
                if (r5 == 0) goto L_0x00d4
                java.lang.Object r4 = r4.mo135203a()     // Catch:{ all -> 0x00f2 }
                goto L_0x00da
            L_0x00d4:
                java.util.LinkedList<T> r4 = r4.f283871b     // Catch:{ all -> 0x00f2 }
                java.lang.Object r4 = r4.removeFirst()     // Catch:{ all -> 0x00f2 }
            L_0x00da:
                com.tencent.mm.pluginsdk.ui.tools.s0$i r4 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C96880s0.C96891i) r4     // Catch:{ all -> 0x00f2 }
                r4.f283883d = r2     // Catch:{ all -> 0x00f2 }
                r4.f283884e = r0     // Catch:{ all -> 0x00f2 }
                com.tencent.mm.pluginsdk.ui.tools.s0 r0 = com.tencent.p014mm.pluginsdk.p133ui.tools.C96880s0.this     // Catch:{ all -> 0x00f2 }
                com.tencent.mm.sdk.platformtools.MMHandler r0 = r0.f283853d     // Catch:{ all -> 0x00f2 }
                r0.post(r4)     // Catch:{ all -> 0x00f2 }
            L_0x00e7:
                com.tencent.mm.pluginsdk.ui.tools.s0 r0 = com.tencent.p014mm.pluginsdk.p133ui.tools.C96880s0.this     // Catch:{ all -> 0x00f2 }
                java.util.HashMap<java.lang.String, android.widget.ImageView> r0 = r0.f283854e     // Catch:{ all -> 0x00f2 }
                java.lang.String r2 = r7.f283876f     // Catch:{ all -> 0x00f2 }
                r0.remove(r2)     // Catch:{ all -> 0x00f2 }
                monitor-exit(r1)     // Catch:{ all -> 0x00f2 }
                goto L_0x00f5
            L_0x00f2:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x00f2 }
                throw r0
            L_0x00f5:
                com.tencent.mm.pluginsdk.ui.tools.s0 r0 = com.tencent.p014mm.pluginsdk.p133ui.tools.C96880s0.this
                com.tencent.mm.pluginsdk.ui.tools.s0$f<com.tencent.mm.pluginsdk.ui.tools.s0$g> r0 = r0.f283859j
                com.tencent.mm.sdk.platformtools.MMHandler r0 = r0.f283872c
                android.os.Message r1 = r0.obtainMessage(r3, r7)
                r0.sendMessage(r1)
                return
            L_0x0103:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0103 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.C96880s0.C96889g.run():void");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.s0$h */
    public static class C96890h extends Drawable {

        /* renamed from: c */
        public static final Paint f283880c = new Paint(6);

        /* renamed from: a */
        public final Rect f283881a = new Rect();

        /* renamed from: b */
        public WeakReference<Bitmap> f283882b = new WeakReference<>((Object) null);

        /* renamed from: a */
        public static void m124460a(ImageView imageView, Bitmap bitmap) {
            C96890h hVar = imageView.getDrawable() instanceof C96890h ? (C96890h) imageView.getDrawable() : new C96890h();
            hVar.getClass();
            hVar.f283882b = new WeakReference<>(bitmap);
            imageView.getScaleType();
            ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
            imageView.getScaleType();
            ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER_CROP;
            imageView.setImageDrawable(hVar);
            imageView.postInvalidate();
        }

        public void draw(Canvas canvas) {
            Bitmap bitmap = this.f283882b.get();
            if (bitmap != null && !bitmap.isRecycled()) {
                copyBounds(this.f283881a);
                canvas.drawBitmap(bitmap, (Rect) null, this.f283881a, f283880c);
            }
        }

        public int getOpacity() {
            return 0;
        }

        public void setAlpha(int i) {
        }

        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.s0$i */
    public class C96891i implements Runnable {

        /* renamed from: d */
        public ImageView f283883d;

        /* renamed from: e */
        public Bitmap f283884e;

        public C96891i(C96881a aVar) {
        }

        public void run() {
            if (this.f283883d != null) {
                Bitmap bitmap = this.f283884e;
                if (bitmap == null || !bitmap.isRecycled()) {
                    C96890h.m124460a(this.f283883d, this.f283884e);
                } else {
                    C96890h.m124460a(this.f283883d, (Bitmap) null);
                }
            }
            this.f283883d = null;
            this.f283884e = null;
            MMHandler mMHandler = C96880s0.this.f283858i.f283872c;
            mMHandler.sendMessage(mMHandler.obtainMessage(1, this));
        }
    }

    public C96880s0(int i) {
        C109639a a = C109639a.m148950a("ImageEngine");
        this.f283852c = new MMHandler(a);
        this.f283853d = new MMHandler(Looper.getMainLooper());
        this.f283858i = new C96881a(16, a);
        this.f283859j = new C96882b(16, C109639a.m148951b());
        this.f283857h = new SparseArray<>();
        this.f283856g = new C100301b<>(i, new C96883c(this), getClass());
        C101594c0.C101595a aVar = this.f283862m;
        C101594c0.f297417b.remove(aVar);
        C101594c0.f297417b.add(aVar);
    }

    /* renamed from: c */
    public static String m124450c(String str, String str2, int i, int i2) {
        return Util.nullAs(str, "null") + "_" + Util.nullAs(str2, "null") + "_" + i + "_" + i2;
    }

    /* renamed from: a */
    public void mo135199a(ImageView imageView, String[] strArr, String str, int i, int i2, int i3) {
        ImageView imageView2 = imageView;
        String[] strArr2 = strArr;
        String str2 = str;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        boolean z = false;
        Log.m105925i("MicroMsg.ImageEngine", "attach thumb image %s url %s", Integer.valueOf(imageView.hashCode()), str2);
        if (this.f283860k) {
            if (this.f283850a) {
                Log.m105928w("MicroMsg.ImageEngine", "on attach, isQuit, return");
            } else if ((strArr2 == null || strArr2.length <= 0) && Util.isNullOrNil(str)) {
                Log.m105928w("MicroMsg.ImageEngine", "attach from file path fail, path and url are null or empty");
                mo135202e(imageView2, i4);
            } else {
                String c = m124450c((strArr2 == null || strArr2.length <= 0) ? null : strArr2[0], str2, i5, i6);
                synchronized (this.f283851b) {
                    String str3 = this.f283855f.get(imageView2);
                    if (str3 != null) {
                        this.f283854e.remove(str3);
                    }
                    this.f283855f.put(imageView2, c);
                }
                Bitmap l = this.f283856g.get(c);
                if (l == null || l.isRecycled()) {
                    Log.m105927v("MicroMsg.ImageEngine", "get first render bmp fail, key[%s]", c);
                    if (strArr2 != null && strArr2.length > 1) {
                        int i7 = 1;
                        while (true) {
                            if (i7 >= strArr2.length) {
                                break;
                            }
                            Bitmap l2 = this.f283856g.get(m124450c(strArr2[i7], str2, i5, i6));
                            Object[] objArr = new Object[2];
                            objArr[0] = c;
                            objArr[1] = Boolean.valueOf(l2 != null);
                            Log.m105927v("MicroMsg.ImageEngine", "get next render bmp, key[%s], result[%B]", objArr);
                            if (l2 != null) {
                                C96890h.m124460a(imageView2, l2);
                                z = true;
                                break;
                            }
                            i7++;
                        }
                    }
                    if (!z) {
                        Log.m105926v("MicroMsg.ImageEngine", "use default res to render");
                        mo135202e(imageView2, i4);
                    }
                    synchronized (this.f283851b) {
                        this.f283854e.put(c, imageView2);
                    }
                    C96887f fVar = this.f283859j;
                    C96889g gVar = (C96889g) (fVar.f283871b.isEmpty() ? fVar.mo135203a() : fVar.f283871b.removeFirst());
                    gVar.f283874d = strArr2;
                    gVar.f283875e = str2;
                    gVar.f283876f = c;
                    gVar.f283877g = i5;
                    gVar.f283878h = i6;
                    this.f283852c.postAtFrontOfQueue(gVar);
                    return;
                }
                Log.m105925i("MicroMsg.ImageEngine", "doRender from cache %s key %s", Integer.valueOf(imageView.hashCode()), c);
                C96890h.m124460a(imageView2, l);
            }
        }
    }

    /* renamed from: b */
    public void mo135200b() {
        Log.m105918d("MicroMsg.ImageEngine", "do destroy");
        this.f283850a = true;
        this.f283852c.getSerial().f328238b.mo182313f();
        C101594c0.f297417b.remove(this.f283862m);
        SparseArray<Bitmap> sparseArray = this.f283857h;
        C100301b<Bitmap> bVar = this.f283856g;
        this.f283857h = new SparseArray<>();
        this.f283856g = new C100301b<>(1, getClass());
        C96884d dVar = new C96884d(this, sparseArray, bVar);
        ThreadPool.post(dVar, "ImageEngine_destroy_" + System.currentTimeMillis());
    }

    /* renamed from: d */
    public C101592a0 mo135201d(String str, String str2, int i, int i2) {
        C102721c.C102722a aVar = this.f283861l;
        if (aVar == null) {
            return null;
        }
        ((FavoriteImageServer$$i) aVar).getClass();
        return new C68923l0(str, str2, i, i2);
    }

    /* renamed from: e */
    public final void mo135202e(ImageView imageView, int i) {
        if (i == 0) {
            C96890h.m124460a(imageView, (Bitmap) null);
            return;
        }
        Bitmap bitmap = this.f283857h.get(i);
        if (bitmap == null) {
            bitmap = C88155a.decodeResource(imageView.getResources(), i, (BitmapFactory.Options) null);
            this.f283857h.put(i, bitmap);
        }
        C96890h.m124460a(imageView, bitmap);
    }
}
