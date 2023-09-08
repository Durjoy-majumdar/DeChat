package eb0;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.modelimage.C92856r0;
import com.tencent.p014mm.modelstat.C29048w;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryUI;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import lu3.C117478d;
import lu3.C88656g;

/* renamed from: eb0.b2 */
public class C97613b2 {

    /* renamed from: a */
    public C97616b f286371a = null;

    /* renamed from: b */
    public boolean f286372b = false;

    /* renamed from: c */
    public String f286373c = "";

    /* renamed from: d */
    public BlockingQueue<C97618d> f286374d = new ArrayBlockingQueue(80);

    /* renamed from: e */
    public C97617c f286375e = null;

    /* renamed from: f */
    public MMHandler f286376f;

    /* renamed from: eb0.b2$a */
    public class C97614a extends MMHandler {

        /* renamed from: eb0.b2$a$a */
        public class C97615a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C97618d f286378d;

            public C97615a(C97618d dVar) {
                this.f286378d = dVar;
            }

            public void run() {
                C97617c cVar = C97613b2.this.f286375e;
                if (cVar != null) {
                    C97618d dVar = this.f286378d;
                    String str = dVar.f286385a;
                    String str2 = dVar.f286386b;
                    int i = dVar.f286388d;
                    GestureGalleryUI gestureGalleryUI = (GestureGalleryUI) cVar;
                    if (gestureGalleryUI.f282296d != null) {
                        if (i == gestureGalleryUI.f282298e.getSelectedItemPosition()) {
                            gestureGalleryUI.f282302g = str2;
                            gestureGalleryUI.f282300f = i;
                            Log.m105919d("MicroMsg.GestureGalleryUI", "onDownSucc, curFilename:%s, url:%s", str2, str);
                            gestureGalleryUI.mo134456U7();
                        }
                        gestureGalleryUI.f282296d.notifyDataSetChanged();
                    }
                }
            }
        }

        public C97614a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            try {
                if (C97613b2.this.f286375e != null) {
                    C97618d dVar = (C97618d) message.obj;
                    if (dVar.f286387c && C92856r0.m117121g()) {
                        String str = dVar.f286385a;
                        String str2 = null;
                        try {
                            if (C92856r0.m117120f(str)) {
                                String lowerCase = Uri.parse(str).getQueryParameter("wxtype").toLowerCase();
                                if (!Util.isNullOrNil(lowerCase)) {
                                    str2 = lowerCase.toLowerCase();
                                }
                            }
                        } catch (Exception unused) {
                        }
                        Log.m105919d("MicroMsg.GetPicService", "convert webp, originPicFormat:%s, file:%s, url:%s", str2, dVar.f286386b, dVar.f286385a);
                        Bitmap bitmapNative = BitmapUtil.getBitmapNative(dVar.f286386b);
                        if (bitmapNative == null) {
                            Log.m105918d("MicroMsg.GetPicService", "decode webp picture failed");
                            C97613b2.m125791a(C97613b2.this, 14, 1);
                        } else if (!Util.isNullOrNil(str2)) {
                            if (str2.toLowerCase().contains("png")) {
                                Log.m105918d("MicroMsg.GetPicService", "convert webp to png");
                                BitmapUtil.saveBitmapToImage(bitmapNative, 100, Bitmap.CompressFormat.PNG, dVar.f286386b, true);
                            } else {
                                Log.m105918d("MicroMsg.GetPicService", "convert webp to jpg");
                                BitmapUtil.saveBitmapToImage(bitmapNative, 100, Bitmap.CompressFormat.JPEG, dVar.f286386b, true);
                            }
                        }
                    }
                    int l = (int) C86013q1.m106451l(dVar.f286386b);
                    if (l > 0 && C86709a0.m107522a()) {
                        ((C29048w.C29055f) C31519v2.f84271a).mo56422a(l, 0, 0);
                    }
                    MMHandlerThread.postToMainThread(new C97615a(dVar));
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.GetPicService", "exception:%s", Util.stackTraceToString(e));
            }
        }
    }

    /* renamed from: eb0.b2$b */
    public class C97616b implements C88656g, C117478d {

        /* renamed from: d */
        public boolean f286380d = true;

        /* renamed from: e */
        public C97618d f286381e = null;

        /* renamed from: f */
        public int f286382f = 0;

        /* renamed from: g */
        public Future<?> f286383g;

        public C97616b() {
        }

        /* renamed from: a */
        public final boolean mo136886a() {
            return this.f286382f == 0;
        }

        /* renamed from: b */
        public final boolean mo136887b(int i) {
            return C97613b2.this.f286372b && this.f286382f < 15 && (i == 301 || i == 302);
        }

        /* renamed from: g */
        public void mo121152g(Future<?> future) {
            this.f286383g = future;
        }

        public String getKey() {
            return "GetPicService_getPic";
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: com.tencent.mm.network.b0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: com.tencent.mm.network.b0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: com.tencent.mm.network.b0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: com.tencent.mm.network.d0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: com.tencent.mm.network.b0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: com.tencent.mm.network.b0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v39, resolved type: com.tencent.mm.network.b0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v40, resolved type: com.tencent.mm.network.b0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v41, resolved type: com.tencent.mm.network.b0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v42, resolved type: com.tencent.mm.network.b0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v43, resolved type: com.tencent.mm.network.b0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v44, resolved type: com.tencent.mm.network.b0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v45, resolved type: com.tencent.mm.network.b0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v46, resolved type: com.tencent.mm.network.b0} */
        /* JADX WARNING: type inference failed for: r4v2, types: [boolean, int] */
        /* JADX WARNING: type inference failed for: r7v0 */
        /* JADX WARNING: type inference failed for: r7v1, types: [java.io.OutputStream] */
        /* JADX WARNING: type inference failed for: r7v2 */
        /* JADX WARNING: type inference failed for: r7v3, types: [com.tencent.mm.network.c0] */
        /* JADX WARNING: type inference failed for: r7v4 */
        /* JADX WARNING: type inference failed for: r7v5 */
        /* JADX WARNING: type inference failed for: r8v9 */
        /* JADX WARNING: type inference failed for: r8v10 */
        /* JADX WARNING: type inference failed for: r8v11 */
        /* JADX WARNING: type inference failed for: r4v26 */
        /* JADX WARNING: type inference failed for: r4v31 */
        /* JADX WARNING: type inference failed for: r7v11 */
        /* JADX WARNING: type inference failed for: r8v28 */
        /* JADX WARNING: type inference failed for: r8v29 */
        /* JADX WARNING: type inference failed for: r8v30 */
        /* JADX WARNING: type inference failed for: r8v31 */
        /* JADX WARNING: type inference failed for: r7v12 */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:72|(3:73|74|(1:76)(1:187))|77|(2:79|(1:81))|82|(2:84|(1:86))|87|(2:91|92)|93|94) */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x036a, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x036b, code lost:
            r8 = null;
            r9 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x036f, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:0x0370, code lost:
            r5 = null;
            r9 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
            r8.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x03b0, code lost:
            r9.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:0x03b5, code lost:
            r7.disconnect();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
            r7.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x03c4, code lost:
            r9.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x03c9, code lost:
            r5.disconnect();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x0281 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:137:0x036f A[ExcHandler: all (th java.lang.Throwable), Splitter:B:9:0x0019] */
        /* JADX WARNING: Removed duplicated region for block: B:149:0x03a7 A[SYNTHETIC, Splitter:B:149:0x03a7] */
        /* JADX WARNING: Removed duplicated region for block: B:154:0x03b0 A[Catch:{ Exception -> 0x03ab }] */
        /* JADX WARNING: Removed duplicated region for block: B:156:0x03b5 A[Catch:{ Exception -> 0x03ab }] */
        /* JADX WARNING: Removed duplicated region for block: B:161:0x03bf A[SYNTHETIC, Splitter:B:161:0x03bf] */
        /* JADX WARNING: Removed duplicated region for block: B:164:0x03c4 A[Catch:{ Exception -> 0x03cc }] */
        /* JADX WARNING: Removed duplicated region for block: B:166:0x03c9 A[Catch:{ Exception -> 0x03cc }] */
        /* JADX WARNING: Removed duplicated region for block: B:182:0x000a A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r28 = this;
                r1 = r28
                java.lang.String r2 = ".tmp"
                java.lang.String r3 = "MicroMsg.GetPicService"
                r4 = 0
                r1.f286380d = r4
            L_0x0009:
                r5 = 0
            L_0x000a:
                boolean r0 = r1.f286380d
                if (r0 != 0) goto L_0x03cd
                r0 = 10
                r6 = 1
                if (r5 <= r0) goto L_0x0016
                r1.f286380d = r6
                return
            L_0x0016:
                r7 = 0
                r8 = 1
                boolean r0 = r28.mo136886a()     // Catch:{ Exception -> 0x0373, all -> 0x036f }
                if (r0 == 0) goto L_0x003e
                eb0.b2 r0 = eb0.C97613b2.this     // Catch:{ Exception -> 0x0373, all -> 0x036f }
                java.util.concurrent.BlockingQueue<eb0.b2$d> r0 = r0.f286374d     // Catch:{ Exception -> 0x0373, all -> 0x036f }
                r10 = 500(0x1f4, double:2.47E-321)
                java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x0373, all -> 0x036f }
                java.util.concurrent.ArrayBlockingQueue r0 = (java.util.concurrent.ArrayBlockingQueue) r0     // Catch:{ Exception -> 0x0373, all -> 0x036f }
                java.lang.Object r0 = r0.poll(r10, r12)     // Catch:{ Exception -> 0x0373, all -> 0x036f }
                eb0.b2$d r0 = (eb0.C97613b2.C97618d) r0     // Catch:{ Exception -> 0x0373, all -> 0x036f }
                r1.f286381e = r0     // Catch:{ Exception -> 0x0373, all -> 0x036f }
                if (r0 == 0) goto L_0x003b
                java.lang.String r0 = r0.f286385a     // Catch:{ Exception -> 0x0373, all -> 0x036f }
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0373, all -> 0x036f }
                if (r0 == 0) goto L_0x003e
            L_0x003b:
                int r5 = r5 + 1
                goto L_0x000a
            L_0x003e:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                r0.<init>()     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                java.lang.String r5 = "Thread get :"
                r0.append(r5)     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                eb0.b2$d r5 = r1.f286381e     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                java.lang.String r5 = r5.f286385a     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                r0.append(r5)     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                java.lang.String r5 = " file:"
                r0.append(r5)     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                eb0.b2$d r5 = r1.f286381e     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                java.lang.String r5 = r5.f286386b     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                r0.append(r5)     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r0)     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                eb0.b2$d r0 = r1.f286381e     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                java.lang.String r0 = r0.f286386b     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                if (r0 == 0) goto L_0x0085
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                r0.<init>()     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                java.lang.String r5 = "Thread exist file:"
                r0.append(r5)     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                eb0.b2$d r5 = r1.f286381e     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                java.lang.String r5 = r5.f286386b     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                r0.append(r5)     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r0)     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                goto L_0x0009
            L_0x0085:
                eb0.b2 r0 = eb0.C97613b2.this     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                r10 = 0
                eb0.C97613b2.m125791a(r0, r10, r8)     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                long r10 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                java.lang.String r0 = "get GetPicRunnable, run, url:%s"
                java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                eb0.b2$d r12 = r1.f286381e     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                java.lang.String r12 = r12.f286385a     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                r5[r4] = r12     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r0, r5)     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                long r12 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                java.lang.Class<h81.h> r0 = h81.C32735h.class
                di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                h81.h r0 = (h81.C32735h) r0     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                h81.h$c r5 = h81.C32735h.C32737c.clicfg_webview_download_preview_pic_use_sys_host     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                java.lang.String r14 = "wxwork.szairport.com"
                java.lang.String r0 = r0.Y60(r5, r14)     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                eb0.b2$d r5 = r1.f286381e     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                java.lang.String r5 = r5.f286385a     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.getHost(r5)     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                if (r14 != 0) goto L_0x00e1
                boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                if (r14 != 0) goto L_0x00e1
                java.lang.String r14 = ":"
                java.lang.String[] r0 = r0.split(r14)     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                int r14 = r0.length     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                r15 = 0
                r16 = 1
            L_0x00d0:
                if (r15 >= r14) goto L_0x00e3
                r8 = r0[r15]     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.equals(r5, r8)     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                if (r8 == 0) goto L_0x00dc
                r16 = 0
            L_0x00dc:
                int r15 = r15 + 1
                r8 = 1
                goto L_0x00d0
            L_0x00e1:
                r16 = 1
            L_0x00e3:
                if (r16 == 0) goto L_0x00f2
                eb0.b2$d r0 = r1.f286381e     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                java.lang.String r0 = r0.f286385a     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                com.tencent.mm.network.d0 r5 = com.tencent.p014mm.network.C81035d.m98964e(r0, r7)     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                r0 = 1222(0x4c6, float:1.712E-42)
                r5.f238062r = r0     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                goto L_0x00fa
            L_0x00f2:
                eb0.b2$d r0 = r1.f286381e     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                java.lang.String r0 = r0.f286385a     // Catch:{ Exception -> 0x036a, all -> 0x036f }
                com.tencent.mm.network.b0 r5 = com.tencent.p014mm.network.C81035d.m98963d(r0, r7)     // Catch:{ Exception -> 0x036a, all -> 0x036f }
            L_0x00fa:
                com.tencent.mm.plugin.report.service.n r17 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                r18 = 1222(0x4c6, double:6.037E-321)
                r20 = 106(0x6a, double:5.24E-322)
                r22 = 1
                r24 = 0
                r17.idkeyStat(r18, r20, r22, r24)     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                boolean r0 = com.tencent.p014mm.modelimage.C92856r0.m117121g()     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                if (r0 == 0) goto L_0x012a
                eb0.b2$d r0 = r1.f286381e     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                java.lang.String r0 = r0.f286385a     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                boolean r0 = com.tencent.p014mm.modelimage.C92856r0.m117122h(r0)     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                if (r0 == 0) goto L_0x012a
                int r0 = qe3.C89625d.f257841g     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                java.lang.String r0 = com.tencent.p014mm.modelimage.C92856r0.m117116b(r0)     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                java.lang.String r8 = "webp referer:%s"
                java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                r9[r4] = r0     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r8, r9)     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                r5.mo112917b(r0)     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
            L_0x012a:
                eb0.b2 r0 = eb0.C97613b2.this     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                boolean r8 = r0.f286372b     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                if (r8 == 0) goto L_0x014d
                java.lang.String r0 = r0.f286373c     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                if (r0 != 0) goto L_0x014d
                java.lang.String r0 = "isFromWebview referer:%s"
                java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                eb0.b2 r9 = eb0.C97613b2.this     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                java.lang.String r9 = r9.f286373c     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                r8[r4] = r9     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r0, r8)     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                eb0.b2 r0 = eb0.C97613b2.this     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                java.lang.String r0 = r0.f286373c     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                r5.mo112917b(r0)     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
            L_0x014d:
                java.lang.String r0 = "getCookie = %s, url = %s"
                r8 = 2
                java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                eb0.b2$d r14 = r1.f286381e     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                java.lang.String r15 = r14.f286389e     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                r9[r4] = r15     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                java.lang.String r14 = r14.f286385a     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                r9[r6] = r14     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r9)     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                eb0.b2$d r0 = r1.f286381e     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                java.lang.String r0 = r0.f286389e     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                if (r0 != 0) goto L_0x0172
                java.lang.String r0 = "Cookie"
                eb0.b2$d r9 = r1.f286381e     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                java.lang.String r9 = r9.f286389e     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                r5.mo112921e(r0, r9)     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
            L_0x0172:
                r5.mo112918c(r6)     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                r0 = 3000(0xbb8, float:4.204E-42)
                r5.mo112919d(r0)     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                r0 = 10000(0x2710, float:1.4013E-41)
                r5.mo112923g(r0)     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                int r0 = r5.mo112916a()     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                boolean r9 = r1.mo136887b(r0)     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                if (r9 == 0) goto L_0x01ad
                eb0.b2$d r9 = r1.f286381e     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                java.lang.String r14 = "location"
                java.lang.String r14 = r5.mo112922f(r14)     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                r9.f286385a = r14     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                int r9 = r1.f286382f     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                int r9 = r9 + r6
                r1.f286382f = r9     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                r14 = 15
                if (r9 >= r14) goto L_0x01a7
                r1.f286380d = r4     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                r5.disconnect()     // Catch:{ Exception -> 0x01a4 }
                goto L_0x0009
            L_0x01a4:
                goto L_0x0009
            L_0x01a7:
                r1.f286380d = r6     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                r1.f286382f = r4     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                r9 = r7
                goto L_0x01b3
            L_0x01ad:
                java.io.InputStream r9 = r5.getInputStream()     // Catch:{ Exception -> 0x0365, all -> 0x0361 }
                r1.f286382f = r4     // Catch:{ Exception -> 0x035e, all -> 0x0291 }
            L_0x01b3:
                java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x035e, all -> 0x0291 }
                r14.<init>()     // Catch:{ Exception -> 0x035e, all -> 0x0291 }
                java.lang.String r15 = "read check: is = "
                r14.append(r15)     // Catch:{ Exception -> 0x035e, all -> 0x0291 }
                if (r9 != 0) goto L_0x01c2
                r15 = 1
                goto L_0x01c3
            L_0x01c2:
                r15 = 0
            L_0x01c3:
                r14.append(r15)     // Catch:{ Exception -> 0x035e, all -> 0x0291 }
                java.lang.String r15 = ", stop = "
                r14.append(r15)     // Catch:{ Exception -> 0x035e, all -> 0x0291 }
                boolean r15 = r1.f286380d     // Catch:{ Exception -> 0x035e, all -> 0x0291 }
                r14.append(r15)     // Catch:{ Exception -> 0x035e, all -> 0x0291 }
                java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x035e, all -> 0x0291 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r14)     // Catch:{ Exception -> 0x035e, all -> 0x0291 }
                if (r9 == 0) goto L_0x0294
                r14 = 1024(0x400, float:1.435E-42)
                byte[] r14 = new byte[r14]     // Catch:{ Exception -> 0x035e, all -> 0x0291 }
                java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x035e, all -> 0x0291 }
                r15.<init>()     // Catch:{ Exception -> 0x035e, all -> 0x0291 }
                eb0.b2$d r8 = r1.f286381e     // Catch:{ Exception -> 0x035e, all -> 0x0291 }
                java.lang.String r8 = r8.f286386b     // Catch:{ Exception -> 0x035e, all -> 0x0291 }
                r15.append(r8)     // Catch:{ Exception -> 0x035e, all -> 0x0291 }
                r15.append(r2)     // Catch:{ Exception -> 0x035e, all -> 0x0291 }
                java.lang.String r8 = r15.toString()     // Catch:{ Exception -> 0x035e, all -> 0x0291 }
                java.io.OutputStream r8 = com.tencent.p014mm.vfs.C86013q1.m106429K(r8, r4)     // Catch:{ Exception -> 0x035e, all -> 0x0291 }
            L_0x01f4:
                int r15 = r9.read(r14)     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                r6 = -1
                if (r15 == r6) goto L_0x0200
                r8.write(r14, r4, r15)     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                r6 = 1
                goto L_0x01f4
            L_0x0200:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                r6.<init>()     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                eb0.b2$d r14 = r1.f286381e     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                java.lang.String r14 = r14.f286386b     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                r6.append(r14)     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                r6.append(r2)     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                android.net.Uri r6 = com.tencent.p014mm.vfs.C116299g2.m163858n(r6)     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                java.lang.String r14 = r6.getPath()     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                if (r14 == 0) goto L_0x0237
                java.lang.String r14 = com.tencent.p014mm.vfs.C116299g2.m163855k(r14, r4, r4)     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                java.lang.String r15 = r6.getPath()     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                boolean r15 = r15.equals(r14)     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                if (r15 != 0) goto L_0x0237
                android.net.Uri$Builder r6 = r6.buildUpon()     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                android.net.Uri$Builder r6 = r6.path(r14)     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                android.net.Uri r6 = r6.build()     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
            L_0x0237:
                eb0.b2$d r14 = r1.f286381e     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                java.lang.String r14 = r14.f286386b     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                android.net.Uri r14 = com.tencent.p014mm.vfs.C116299g2.m163858n(r14)     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                java.lang.String r15 = r14.getPath()     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                if (r15 == 0) goto L_0x025f
                java.lang.String r15 = com.tencent.p014mm.vfs.C116299g2.m163855k(r15, r4, r4)     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                java.lang.String r4 = r14.getPath()     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                boolean r4 = r4.equals(r15)     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                if (r4 != 0) goto L_0x025f
                android.net.Uri$Builder r4 = r14.buildUpon()     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                android.net.Uri$Builder r4 = r4.path(r15)     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                android.net.Uri r14 = r4.build()     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
            L_0x025f:
                com.tencent.mm.vfs.f0 r4 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                com.tencent.mm.vfs.f0$h r6 = r4.mo177799l(r6, r7)     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                com.tencent.mm.vfs.f0$h r4 = r4.mo177799l(r14, r7)     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                boolean r7 = r6.mo177810a()     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                if (r7 == 0) goto L_0x0281
                boolean r7 = r4.mo177810a()     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                if (r7 != 0) goto L_0x0276
                goto L_0x0281
            L_0x0276:
                com.tencent.mm.vfs.FileSystem$c r7 = r4.f348991a     // Catch:{ IOException -> 0x0281 }
                java.lang.String r4 = r4.f348992b     // Catch:{ IOException -> 0x0281 }
                com.tencent.mm.vfs.FileSystem$c r14 = r6.f348991a     // Catch:{ IOException -> 0x0281 }
                java.lang.String r6 = r6.f348992b     // Catch:{ IOException -> 0x0281 }
                r7.mo119946t(r4, r14, r6)     // Catch:{ IOException -> 0x0281 }
            L_0x0281:
                java.lang.String r7 = r5.getContentType()     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                java.lang.String r4 = "contentType:%s"
                r6 = 1
                java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                r6 = 0
                r14[r6] = r7     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r14)     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                goto L_0x0295
            L_0x0291:
                r0 = move-exception
                goto L_0x03bd
            L_0x0294:
                r8 = r7
            L_0x0295:
                r4 = 200(0xc8, float:2.8E-43)
                if (r0 != r4) goto L_0x02d0
                long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                long r14 = r14 - r12
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                r21 = 1222(0x4c6, double:6.037E-321)
                r23 = 109(0x6d, double:5.4E-322)
                r27 = 0
                r20 = r0
                r25 = r14
                r20.idkeyStat(r21, r23, r25, r27)     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                r21 = 1222(0x4c6, double:6.037E-321)
                r23 = 107(0x6b, double:5.3E-322)
                r25 = 1
                r27 = 0
                r20 = r0
                r20.idkeyStat(r21, r23, r25, r27)     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                java.lang.String r0 = "http use cronet(%b) time %d"
                r4 = 2
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r16)     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                r12 = 0
                r4[r12] = r6     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                java.lang.Long r6 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                r12 = 1
                r4[r12] = r6     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r4)     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
            L_0x02d0:
                boolean r0 = com.tencent.p014mm.modelimage.C92856r0.m117121g()     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                if (r0 == 0) goto L_0x0303
                eb0.b2$d r0 = r1.f286381e     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                java.lang.String r0 = r0.f286385a     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                boolean r0 = com.tencent.p014mm.modelimage.C92856r0.m117122h(r0)     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                if (r0 == 0) goto L_0x0303
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                if (r0 != 0) goto L_0x0303
                java.lang.String r0 = "image/webp"
                boolean r0 = r7.equals(r0)     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                if (r0 == 0) goto L_0x0303
                java.lang.String r0 = "receive a webp picture"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r0)     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                eb0.b2$d r0 = r1.f286381e     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                r4 = 1
                r0.f286387c = r4     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                eb0.b2 r0 = eb0.C97613b2.this     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                r6 = 13
                r12 = 1
                eb0.C97613b2.m125791a(r0, r6, r12)     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                goto L_0x0308
            L_0x0303:
                eb0.b2$d r0 = r1.f286381e     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                r4 = 0
                r0.f286387c = r4     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
            L_0x0308:
                android.os.Message r0 = new android.os.Message     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                r0.<init>()     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                eb0.b2$d r4 = r1.f286381e     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                r0.obj = r4     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                int r4 = r4.f286388d     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                r0.arg1 = r4     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                eb0.b2 r4 = eb0.C97613b2.this     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                com.tencent.mm.sdk.platformtools.MMHandler r4 = r4.f286376f     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                r4.sendMessage(r0)     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                long r6 = r6 - r10
                java.lang.String r0 = "download image used: %dms"
                r4 = 1
                java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                r11 = 0
                r10[r11] = r4     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r0, r10)     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                eb0.b2 r0 = eb0.C97613b2.this     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                r10 = 4
                eb0.C97613b2.m125791a(r0, r10, r6)     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                eb0.b2$d r0 = r1.f286381e     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                if (r0 == 0) goto L_0x0346
                boolean r0 = r0.f286387c     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                if (r0 == 0) goto L_0x0346
                eb0.b2 r0 = eb0.C97613b2.this     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
                r10 = 17
                eb0.C97613b2.m125791a(r0, r10, r6)     // Catch:{ Exception -> 0x035c, all -> 0x0359 }
            L_0x0346:
                if (r8 == 0) goto L_0x034e
                r8.close()     // Catch:{ Exception -> 0x034c }
                goto L_0x034e
            L_0x034c:
                goto L_0x0356
            L_0x034e:
                if (r9 == 0) goto L_0x0353
                r9.close()     // Catch:{ Exception -> 0x034c }
            L_0x0353:
                r5.disconnect()     // Catch:{ Exception -> 0x034c }
            L_0x0356:
                r4 = 0
                goto L_0x0009
            L_0x0359:
                r0 = move-exception
                goto L_0x03bc
            L_0x035c:
                r0 = move-exception
                goto L_0x0368
            L_0x035e:
                r0 = move-exception
                r8 = r7
                goto L_0x0368
            L_0x0361:
                r0 = move-exception
                r9 = r7
                goto L_0x03bd
            L_0x0365:
                r0 = move-exception
                r8 = r7
                r9 = r8
            L_0x0368:
                r7 = r5
                goto L_0x036d
            L_0x036a:
                r0 = move-exception
                r8 = r7
                r9 = r8
            L_0x036d:
                r5 = 0
                goto L_0x0376
            L_0x036f:
                r0 = move-exception
                r5 = r7
                r9 = r5
                goto L_0x03bd
            L_0x0373:
                r0 = move-exception
                r8 = r7
                r9 = r8
            L_0x0376:
                r4 = 0
                r1.f286382f = r4     // Catch:{ all -> 0x03ba }
                java.lang.String r6 = "exception:%s"
                r10 = 1
                java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x03ba }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x03ba }
                r10[r4] = r0     // Catch:{ all -> 0x03ba }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r6, r10)     // Catch:{ all -> 0x03ba }
                eb0.b2 r0 = eb0.C97613b2.this     // Catch:{ all -> 0x03ba }
                r10 = 2
                r12 = 1
                eb0.C97613b2.m125791a(r0, r10, r12)     // Catch:{ all -> 0x03ba }
                eb0.b2$d r0 = r1.f286381e     // Catch:{ all -> 0x03ba }
                if (r0 == 0) goto L_0x03a5
                java.lang.String r0 = r0.f286385a     // Catch:{ all -> 0x03ba }
                boolean r0 = com.tencent.p014mm.modelimage.C92856r0.m117122h(r0)     // Catch:{ all -> 0x03ba }
                if (r0 == 0) goto L_0x03a5
                eb0.b2 r0 = eb0.C97613b2.this     // Catch:{ all -> 0x03ba }
                r10 = 15
                r12 = 1
                eb0.C97613b2.m125791a(r0, r10, r12)     // Catch:{ all -> 0x03ba }
            L_0x03a5:
                if (r8 == 0) goto L_0x03ae
                r8.close()     // Catch:{ Exception -> 0x03ab }
                goto L_0x03ae
            L_0x03ab:
                goto L_0x000a
            L_0x03ae:
                if (r9 == 0) goto L_0x03b3
                r9.close()     // Catch:{ Exception -> 0x03ab }
            L_0x03b3:
                if (r7 == 0) goto L_0x000a
                r7.disconnect()     // Catch:{ Exception -> 0x03ab }
                goto L_0x000a
            L_0x03ba:
                r0 = move-exception
                r5 = r7
            L_0x03bc:
                r7 = r8
            L_0x03bd:
                if (r7 == 0) goto L_0x03c2
                r7.close()     // Catch:{ Exception -> 0x03cc }
            L_0x03c2:
                if (r9 == 0) goto L_0x03c7
                r9.close()     // Catch:{ Exception -> 0x03cc }
            L_0x03c7:
                if (r5 == 0) goto L_0x03cc
                r5.disconnect()     // Catch:{ Exception -> 0x03cc }
            L_0x03cc:
                throw r0
            L_0x03cd:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: eb0.C97613b2.C97616b.run():void");
        }
    }

    /* renamed from: eb0.b2$c */
    public interface C97617c {
    }

    /* renamed from: eb0.b2$d */
    public class C97618d {

        /* renamed from: a */
        public String f286385a;

        /* renamed from: b */
        public String f286386b;

        /* renamed from: c */
        public boolean f286387c = false;

        /* renamed from: d */
        public int f286388d;

        /* renamed from: e */
        public String f286389e;

        public C97618d(C97613b2 b2Var, String str, String str2, int i, String str3) {
            this.f286385a = str;
            if (b2Var.f286372b) {
                this.f286385a = C92856r0.m117118d(str);
            }
            this.f286386b = str2;
            this.f286388d = i;
            this.f286387c = false;
            this.f286389e = str3;
        }
    }

    public C97613b2(boolean z, String str) {
        C86709a0.m107528h();
        this.f286376f = new C97614a(C86709a0.m107525e().getLooper());
        this.f286371a = null;
        this.f286372b = z;
        this.f286373c = str;
        Log.m105919d("MicroMsg.GetPicService", "getPicService, isFromWebView:%b isFromWebViewReffer:%s", Boolean.valueOf(z), str);
    }

    /* renamed from: a */
    public static void m125791a(C97613b2 b2Var, long j, long j2) {
        if (b2Var.f286372b) {
            Log.m105919d("MicroMsg.GetPicService", "doIdKeyStat, key:%d, val:%d", Long.valueOf(j), Long.valueOf(j2));
            C115669n.INSTANCE.idkeyStat(86, j, j2, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0131, code lost:
        if ((r0 != null && !r0.isDone()) == false) goto L_0x0133;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ad  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo136884b(java.lang.String r15, int r16, int r17, java.lang.String r18) {
        /*
            r14 = this;
            r7 = r14
            r3 = r15
            r1 = r16
            java.lang.String r8 = "exception:%s"
            java.lang.String r0 = "wxtype"
            r9 = 0
            r10 = 1
            java.lang.String r11 = "MicroMsg.GetPicService"
            r12 = 0
            if (r3 != 0) goto L_0x0013
            r4 = r9
            goto L_0x00d5
        L_0x0013:
            android.net.Uri r2 = android.net.Uri.parse(r15)     // Catch:{ Exception -> 0x0028 }
            if (r2 == 0) goto L_0x0037
            java.lang.String r4 = r2.getQueryParameter(r0)     // Catch:{ Exception -> 0x0028 }
            if (r4 == 0) goto L_0x0037
            java.lang.String r0 = r2.getQueryParameter(r0)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r0 = r0.toLowerCase()     // Catch:{ Exception -> 0x0028 }
            goto L_0x0039
        L_0x0028:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r10]
            java.lang.String r4 = r0.getMessage()
            r2[r12] = r4
            java.lang.String r4 = "parse image type error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r4, r2)
        L_0x0037:
            java.lang.String r0 = ""
        L_0x0039:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x004f
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r2 = "png"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = ".png"
            goto L_0x0051
        L_0x004f:
            java.lang.String r0 = ".jpg"
        L_0x0051:
            boolean r2 = f40.C86709a0.m107522a()
            java.lang.String r4 = "_"
            java.lang.String r5 = "/reader_"
            if (r2 != 0) goto L_0x00ad
            java.lang.String r2 = "genFileName, account not ready"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            f40.o r13 = f40.C86709a0.m107535s()
            java.lang.String r13 = r13.f251805c
            r6.append(r13)
            java.lang.String r13 = "/imagecache"
            r6.append(r13)
            java.lang.String r6 = r6.toString()
            r2.<init>((java.lang.String) r6)
            boolean r6 = r2.mo119967g()
            if (r6 != 0) goto L_0x0085
            r2.mo119987x()
        L_0x0085:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = r2.mo119971i()
            r6.append(r2)
            r6.append(r5)
            r6.append(r1)
            r6.append(r4)
            byte[] r2 = r15.getBytes()
            java.lang.String r2 = p823sg.C90193h.m112878f(r2)
            r6.append(r2)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            goto L_0x00d4
        L_0x00ad:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = f12.C7970a.m8127a()
            r2.append(r6)
            r2.append(r5)
            r2.append(r1)
            r2.append(r4)
            byte[] r4 = r15.getBytes()
            java.lang.String r4 = p823sg.C90193h.m112878f(r4)
            r2.append(r4)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L_0x00d4:
            r4 = r0
        L_0x00d5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getPicfileByUrl type:"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = " url:"
            r0.append(r1)
            r0.append(r15)
            java.lang.String r1 = " filename:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r0)
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)     // Catch:{ Exception -> 0x0100 }
            if (r0 == 0) goto L_0x010d
            return r4
        L_0x0100:
            r0 = move-exception
            r1 = r0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)
            r0[r12] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r8, r0)
        L_0x010d:
            java.util.concurrent.BlockingQueue<eb0.b2$d> r0 = r7.f286374d     // Catch:{ Exception -> 0x014d }
            eb0.b2$d r13 = new eb0.b2$d     // Catch:{ Exception -> 0x014d }
            r1 = r13
            r2 = r14
            r3 = r15
            r5 = r17
            r6 = r18
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x014d }
            java.util.concurrent.ArrayBlockingQueue r0 = (java.util.concurrent.ArrayBlockingQueue) r0     // Catch:{ Exception -> 0x014d }
            r0.add(r13)     // Catch:{ Exception -> 0x014d }
            eb0.b2$b r0 = r7.f286371a     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x0133
            java.util.concurrent.Future<?> r0 = r0.f286383g     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x0130
            boolean r0 = r0.isDone()     // Catch:{ Exception -> 0x014d }
            if (r0 != 0) goto L_0x0130
            r0 = 1
            goto L_0x0131
        L_0x0130:
            r0 = 0
        L_0x0131:
            if (r0 != 0) goto L_0x0159
        L_0x0133:
            eb0.b2$b r0 = r7.f286371a     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x013e
            java.util.concurrent.Future<?> r0 = r0.f286383g     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x013e
            r0.cancel(r12)     // Catch:{ Exception -> 0x014d }
        L_0x013e:
            eb0.b2$b r0 = new eb0.b2$b     // Catch:{ Exception -> 0x014d }
            r0.<init>()     // Catch:{ Exception -> 0x014d }
            r7.f286371a = r0     // Catch:{ Exception -> 0x014d }
            zt3.t r1 = zt3.C119157j.f356862d     // Catch:{ Exception -> 0x014d }
            zt3.j r1 = (zt3.C119157j) r1     // Catch:{ Exception -> 0x014d }
            r1.mo183875f(r0)     // Catch:{ Exception -> 0x014d }
            goto L_0x0159
        L_0x014d:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r1[r12] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r8, r1)
        L_0x0159:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: eb0.C97613b2.mo136884b(java.lang.String, int, int, java.lang.String):java.lang.String");
    }
}
