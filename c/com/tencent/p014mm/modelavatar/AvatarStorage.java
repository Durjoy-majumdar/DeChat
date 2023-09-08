package com.tencent.p014mm.modelavatar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MMTrimMemoryEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEvent;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p196ln.C10579k;
import p196ln.C76707h;
import p520fi.C75766h;
import p761yd.C38993b;
import p823sg.C101611g;
import p823sg.C90193h;
import p996kj.C88155a;
import q90.C101062d;
import we3.C78592b;

/* renamed from: com.tencent.mm.modelavatar.AvatarStorage */
public class AvatarStorage implements C10579k {

    /* renamed from: d */
    public static final Map<String, Integer> f195665d;

    /* renamed from: e */
    public static C68079a f195666e = new C68079a(100);

    /* renamed from: a */
    public MStorageEvent<C10579k.C10580a, String> f195667a = new C40352a(this);

    /* renamed from: b */
    public final List<WeakReference<C10579k.C10580a>> f195668b = new ArrayList();

    /* renamed from: c */
    public final C10579k.C10580a f195669c;

    /* renamed from: com.tencent.mm.modelavatar.AvatarStorage$a */
    public class C40352a extends MStorageEvent<C10579k.C10580a, String> {
        public C40352a(AvatarStorage avatarStorage) {
        }

        public void processEvent(Object obj, Object obj2) {
            ((C10579k.C10580a) obj).mo1428X((String) obj2);
        }
    }

    /* renamed from: com.tencent.mm.modelavatar.AvatarStorage$b */
    public class C40353b implements C10579k.C10580a {
        public C40353b() {
        }

        /* renamed from: X */
        public void mo1428X(String str) {
            Log.m105919d("MicroMsg.AvatarStorage", "notifyChanged user:%s clonesize:%d watchers:%d", str, Integer.valueOf(((ArrayList) AvatarStorage.this.f195668b).size()), Integer.valueOf(((ArrayList) AvatarStorage.this.f195668b).size()));
            ArrayList arrayList = new ArrayList();
            synchronized (AvatarStorage.this.f195668b) {
                Iterator it = ((ArrayList) AvatarStorage.this.f195668b).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    if (weakReference != null) {
                        C10579k.C10580a aVar = (C10579k.C10580a) weakReference.get();
                        if (aVar != null) {
                            arrayList.add(aVar);
                        } else {
                            it.remove();
                        }
                    }
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                ((C10579k.C10580a) it4.next()).mo1428X(str);
            }
        }
    }

    /* renamed from: com.tencent.mm.modelavatar.AvatarStorage$MMTrimMemoryEventListener */
    public static class MMTrimMemoryEventListener extends IListener<MMTrimMemoryEvent> {
        public MMTrimMemoryEventListener() {
            super(C40008f.f107254d);
            this.__eventId = 708811463;
        }

        public boolean callback(IEvent iEvent) {
            MMTrimMemoryEvent mMTrimMemoryEvent = (MMTrimMemoryEvent) iEvent;
            Log.m105920e("MicroMsg.AvatarStorage", "received MMTrimMemoryEvent: AvatarStorage");
            if (AvatarStorage.f195666e != null && C38993b.m41993c(C32735h.C32737c.clicfg_matrix_trim_memory_avatar_cache, false)) {
                Log.m105921e("MicroMsg.AvatarStorage", "received MMTrimMemoryEvent: clear [cacheMap][%s]", Integer.valueOf(((C101062d) AvatarStorage.f195666e.f195672a).size()));
                ((C101062d) AvatarStorage.f195666e.f195672a).trimToSize(30);
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.modelavatar.AvatarStorage$c */
    public class C68076c implements BitmapUtil.ImageWriteOSCallback {

        /* renamed from: a */
        public final /* synthetic */ Bitmap f195670a;

        public C68076c(AvatarStorage avatarStorage, Bitmap bitmap) {
            this.f195670a = bitmap;
        }

        public void callback(OutputStream outputStream) {
            try {
                this.f195670a.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AvatarStorage", e, "", new Object[0]);
            } catch (Throwable th) {
                try {
                    outputStream.close();
                } catch (Exception unused) {
                }
                throw th;
            }
            try {
                outputStream.close();
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: com.tencent.mm.modelavatar.AvatarStorage$d */
    public static class C68077d {

        /* renamed from: com.tencent.mm.modelavatar.AvatarStorage$d$a */
        public class C68078a implements BitmapUtil.ImageWriteOSCallback {

            /* renamed from: a */
            public final /* synthetic */ Bitmap f195671a;

            public C68078a(Bitmap bitmap) {
                this.f195671a = bitmap;
            }

            public void callback(OutputStream outputStream) {
                try {
                    this.f195671a.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.AvatarStorage", e, "", new Object[0]);
                } catch (Throwable th) {
                    try {
                        outputStream.close();
                    } catch (Exception unused) {
                    }
                    throw th;
                }
                try {
                    outputStream.close();
                } catch (Exception unused2) {
                }
            }
        }

        /* renamed from: a */
        public static boolean m80462a(String str, String str2, boolean z) {
            Bitmap b = m80463b(str, str2);
            if (b != null && !b.isRecycled()) {
                try {
                    BitmapUtil.getImageWriteOutputStream(str, (BitmapUtil.ImageWriteOSCallback) new C68078a(b));
                    if (!z) {
                        C86013q1.m106447h(str + ".bm");
                    }
                    return true;
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.AvatarStorage", e, "Cannot write avatar file: %s", str);
                }
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:50:0x010c A[SYNTHETIC, Splitter:B:50:0x010c] */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0111 A[Catch:{ Exception -> 0x0114 }] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static android.graphics.Bitmap m80463b(java.lang.String r17, java.lang.String r18) {
            /*
                java.lang.String r1 = "MicroMsg.AvatarStorage"
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r2 = r17
                r0.append(r2)
                java.lang.String r3 = ".bm"
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r4 = 2
                r5 = 0
                r6 = 1
                r7 = 0
                boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)     // Catch:{ Exception -> 0x00f8, OutOfMemoryError -> 0x00e5 }
                if (r0 != 0) goto L_0x0029
                java.lang.String r0 = "SmallBM get bm file not exsit:%s"
                java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x00f8, OutOfMemoryError -> 0x00e5 }
                r2[r7] = r3     // Catch:{ Exception -> 0x00f8, OutOfMemoryError -> 0x00e5 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r0, r2)     // Catch:{ Exception -> 0x00f8, OutOfMemoryError -> 0x00e5 }
                return r5
            L_0x0029:
                long r8 = com.tencent.p014mm.vfs.C86013q1.m106451l(r3)     // Catch:{ Exception -> 0x00f8, OutOfMemoryError -> 0x00e5 }
                int r0 = (int) r8     // Catch:{ Exception -> 0x00f8, OutOfMemoryError -> 0x00e5 }
                if (r0 <= 0) goto L_0x00d2
                r8 = 36880(0x9010, float:5.168E-41)
                r9 = 36864(0x9000, float:5.1657E-41)
                if (r0 == r9) goto L_0x003c
                if (r0 == r8) goto L_0x003c
                goto L_0x00d2
            L_0x003c:
                java.io.InputStream r10 = com.tencent.p014mm.vfs.C86013q1.m106423E(r3)     // Catch:{ Exception -> 0x00f8, OutOfMemoryError -> 0x00e5 }
                java.nio.channels.ReadableByteChannel r11 = java.nio.channels.Channels.newChannel(r10)     // Catch:{ Exception -> 0x00cf, OutOfMemoryError -> 0x00cc }
                java.nio.ByteBuffer r9 = java.nio.ByteBuffer.allocateDirect(r9)     // Catch:{ Exception -> 0x00ca, OutOfMemoryError -> 0x00c8 }
                r11.read(r9)     // Catch:{ Exception -> 0x00ca, OutOfMemoryError -> 0x00c8 }
                r9.position(r7)     // Catch:{ Exception -> 0x00ca, OutOfMemoryError -> 0x00c8 }
                r12 = 3
                if (r0 != r8) goto L_0x0085
                r8 = 16
                java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocateDirect(r8)     // Catch:{ Exception -> 0x00ca, OutOfMemoryError -> 0x00c8 }
                r11.read(r8)     // Catch:{ Exception -> 0x00ca, OutOfMemoryError -> 0x00c8 }
                long r13 = r8.getLong(r7)     // Catch:{ Exception -> 0x00ca, OutOfMemoryError -> 0x00c8 }
                r15 = 1
                int r8 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r8 == 0) goto L_0x0083
                java.lang.String r8 = "SmallBM get bm header invalid flag:%d size:%d file:%s"
                java.lang.Object[] r9 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x00ca, OutOfMemoryError -> 0x00c8 }
                java.lang.Long r12 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x00ca, OutOfMemoryError -> 0x00c8 }
                r9[r7] = r12     // Catch:{ Exception -> 0x00ca, OutOfMemoryError -> 0x00c8 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00ca, OutOfMemoryError -> 0x00c8 }
                r9[r6] = r0     // Catch:{ Exception -> 0x00ca, OutOfMemoryError -> 0x00c8 }
                r9[r4] = r3     // Catch:{ Exception -> 0x00ca, OutOfMemoryError -> 0x00c8 }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r8, r9)     // Catch:{ Exception -> 0x00ca, OutOfMemoryError -> 0x00c8 }
                r11.close()     // Catch:{ Exception -> 0x00ca, OutOfMemoryError -> 0x00c8 }
                r10.close()     // Catch:{ Exception -> 0x00ca, OutOfMemoryError -> 0x00c8 }
                m80464c(r17)     // Catch:{ Exception -> 0x00ca, OutOfMemoryError -> 0x00c8 }
                return r5
            L_0x0083:
                r2 = 0
                goto L_0x0086
            L_0x0085:
                r2 = 1
            L_0x0086:
                java.lang.String r8 = "SmallBM get bm size:%d shouldRemoveCorner:%b file:%s"
                java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x00ca, OutOfMemoryError -> 0x00c8 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00ca, OutOfMemoryError -> 0x00c8 }
                r12[r7] = r0     // Catch:{ Exception -> 0x00ca, OutOfMemoryError -> 0x00c8 }
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x00ca, OutOfMemoryError -> 0x00c8 }
                r12[r6] = r0     // Catch:{ Exception -> 0x00ca, OutOfMemoryError -> 0x00c8 }
                r12[r4] = r3     // Catch:{ Exception -> 0x00ca, OutOfMemoryError -> 0x00c8 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r8, r12)     // Catch:{ Exception -> 0x00ca, OutOfMemoryError -> 0x00c8 }
                r11.close()     // Catch:{ Exception -> 0x00ca, OutOfMemoryError -> 0x00c8 }
                r10.close()     // Catch:{ Exception -> 0x00cf, OutOfMemoryError -> 0x00cc }
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x00f8, OutOfMemoryError -> 0x00e5 }
                r8 = 96
                android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r8, r8, r0)     // Catch:{ Exception -> 0x00f8, OutOfMemoryError -> 0x00e5 }
                r0.copyPixelsFromBuffer(r9)     // Catch:{ Exception -> 0x00f8, OutOfMemoryError -> 0x00e5 }
                if (r2 == 0) goto L_0x00c7
                r2 = 78
                r8 = 9
                android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r0, r8, r8, r2, r2)     // Catch:{ Exception -> 0x00f8, OutOfMemoryError -> 0x00e5 }
                java.lang.String r8 = "recycle bitmap:%s"
                java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x00f8, OutOfMemoryError -> 0x00e5 }
                java.lang.String r10 = r0.toString()     // Catch:{ Exception -> 0x00f8, OutOfMemoryError -> 0x00e5 }
                r9[r7] = r10     // Catch:{ Exception -> 0x00f8, OutOfMemoryError -> 0x00e5 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r8, r9)     // Catch:{ Exception -> 0x00f8, OutOfMemoryError -> 0x00e5 }
                r0.recycle()     // Catch:{ Exception -> 0x00f8, OutOfMemoryError -> 0x00e5 }
                return r2
            L_0x00c7:
                return r0
            L_0x00c8:
                r0 = move-exception
                goto L_0x00e8
            L_0x00ca:
                r0 = move-exception
                goto L_0x00fb
            L_0x00cc:
                r0 = move-exception
                r11 = r5
                goto L_0x00e8
            L_0x00cf:
                r0 = move-exception
                r11 = r5
                goto L_0x00fb
            L_0x00d2:
                m80464c(r17)     // Catch:{ Exception -> 0x00f8, OutOfMemoryError -> 0x00e5 }
                java.lang.String r2 = "SmallBM get bm invalid size:%d file:%s"
                java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00f8, OutOfMemoryError -> 0x00e5 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00f8, OutOfMemoryError -> 0x00e5 }
                r8[r7] = r0     // Catch:{ Exception -> 0x00f8, OutOfMemoryError -> 0x00e5 }
                r8[r6] = r3     // Catch:{ Exception -> 0x00f8, OutOfMemoryError -> 0x00e5 }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r8)     // Catch:{ Exception -> 0x00f8, OutOfMemoryError -> 0x00e5 }
                return r5
            L_0x00e5:
                r0 = move-exception
                r10 = r5
                r11 = r10
            L_0x00e8:
                java.lang.Object[] r2 = new java.lang.Object[r4]
                java.lang.String r0 = r0.getMessage()
                r2[r7] = r0
                r2[r6] = r3
                java.lang.String r0 = "SmallBM get OutOfMemoryError e:%s file:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r2)
                goto L_0x010a
            L_0x00f8:
                r0 = move-exception
                r10 = r5
                r11 = r10
            L_0x00fb:
                java.lang.Object[] r2 = new java.lang.Object[r4]
                java.lang.String r0 = r0.getMessage()
                r2[r7] = r0
                r2[r6] = r3
                java.lang.String r0 = "SmallBM get exception e:%s file:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r2)
            L_0x010a:
                if (r11 == 0) goto L_0x010f
                r11.close()     // Catch:{ Exception -> 0x0114 }
            L_0x010f:
                if (r10 == 0) goto L_0x0114
                r10.close()     // Catch:{ Exception -> 0x0114 }
            L_0x0114:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelavatar.AvatarStorage.C68077d.m80463b(java.lang.String, java.lang.String):android.graphics.Bitmap");
        }

        /* renamed from: c */
        public static boolean m80464c(String str) {
            C86013q1.m106447h(str + ".bm");
            C86013q1.m106447h(str);
            return true;
        }
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f195665d = concurrentHashMap;
        concurrentHashMap.put("voipapp", Integer.valueOf(C0966R.raw.default_voip));
        concurrentHashMap.put("qqmail", Integer.valueOf(C0966R.raw.default_qqmail));
        concurrentHashMap.put("fmessage", Integer.valueOf(C0966R.raw.default_fmessage));
        concurrentHashMap.put("floatbottle", Integer.valueOf(C0966R.raw.default_bottle));
        concurrentHashMap.put("lbsapp", Integer.valueOf(C0966R.raw.default_nearby));
        concurrentHashMap.put("shakeapp", Integer.valueOf(C0966R.raw.default_shake));
        concurrentHashMap.put("medianote", Integer.valueOf(C0966R.raw.default_medianote));
        concurrentHashMap.put("qqfriend", Integer.valueOf(C0966R.raw.default_qqfriend));
        concurrentHashMap.put("masssendapp", Integer.valueOf(C0966R.raw.default_masssend));
        concurrentHashMap.put("feedsapp", Integer.valueOf(C0966R.raw.default_feedsapp));
        concurrentHashMap.put("facebookapp", Integer.valueOf(C0966R.raw.default_facebookapp));
        concurrentHashMap.put("newsapp", Integer.valueOf(C0966R.raw.default_readerapp));
        concurrentHashMap.put("helper_entry", Integer.valueOf(C0966R.raw.default_plugin_icon_contract));
        concurrentHashMap.put("voicevoipapp", Integer.valueOf(C0966R.raw.default_voicevoip));
        concurrentHashMap.put("voiceinputapp", Integer.valueOf(C0966R.raw.default_voiceinput));
        concurrentHashMap.put("findersayhisessionholder", Integer.valueOf(C0966R.C0969drawable.icon_filled_nearby_finder));
        concurrentHashMap.put("textstatussayhisessionholder", Integer.valueOf(C0966R.C0969drawable.icon_filled_nearby_text_status));
        concurrentHashMap.put("officialaccounts", Integer.valueOf(C0966R.raw.default_brand_contact));
        concurrentHashMap.put("service_officialaccounts", Integer.valueOf(C0966R.raw.default_servicebrand_contact));
        concurrentHashMap.put("linkedinplugin", Integer.valueOf(C0966R.raw.default_linkedin));
        concurrentHashMap.put("notifymessage", Integer.valueOf(C0966R.raw.default_notify_message_contact));
        concurrentHashMap.put("appbrandcustomerservicemsg", Integer.valueOf(C0966R.C0969drawable.ckm));
        concurrentHashMap.put("appbrand_notify_message", Integer.valueOf(C0966R.raw.default_app_brand_notify_msg));
        concurrentHashMap.put("downloaderapp", Integer.valueOf(C0966R.raw.default_downloaderapp));
        concurrentHashMap.put("finderaliassessionholder", Integer.valueOf(C0966R.raw.icons_finder_msg_alias_holder));
        concurrentHashMap.put("opencustomerservicemsg", Integer.valueOf(C0966R.raw.default_open_im_kefu_service));
        concurrentHashMap.put("conversationboxservice", Integer.valueOf(C0966R.raw.default_chatroom_box));
        new MMTrimMemoryEventListener().alive();
    }

    public AvatarStorage() {
        C40353b bVar = new C40353b();
        this.f195669c = bVar;
        if (f195666e == null) {
            f195666e = new C68079a(100);
        }
        this.f195667a.add(bVar, (Looper) null);
    }

    /* renamed from: c */
    public static void m80441c(Context context, ImageView imageView, int i) {
        try {
            imageView.setImageBitmap(BitmapUtil.getRoundedCornerBitmap(C88155a.decodeResource(context.getResources(), i, (BitmapFactory.Options) null), true, 1.0f));
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AvatarStorage", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: d */
    public static boolean m80442d(Bitmap bitmap) {
        return bitmap != null && !bitmap.isRecycled();
    }

    /* renamed from: e */
    public static StringBuilder m80443e(StringBuilder sb, String str, boolean z) {
        String f = C90193h.m112878f(str.getBytes());
        sb.append(f.substring(0, 2));
        sb.append(XVFSFile.SEPARATOR_CHAR);
        sb.append(f.substring(2, 4));
        sb.append(XVFSFile.SEPARATOR_CHAR);
        sb.append("user_");
        if (z) {
            sb.append("hd_");
        }
        sb.append(f);
        sb.append(".png");
        return sb;
    }

    /* renamed from: f */
    public static Bitmap m80444f(String str, String str2, boolean z) {
        int width;
        int height;
        Bitmap decodeFileWithSample = C86013q1.m106450k(str) ? z ? BitmapUtil.decodeFileWithSample(str, 940, 940) : BitmapUtil.decodeFile(str, (BitmapFactory.Options) null) : null;
        if (decodeFileWithSample == null) {
            decodeFileWithSample = C68077d.m80463b(str, str2);
        }
        if (m80442d(decodeFileWithSample) && (width = decodeFileWithSample.getWidth()) != (height = decodeFileWithSample.getHeight())) {
            decodeFileWithSample = width > height ? Bitmap.createBitmap(decodeFileWithSample, (width - height) / 2, 0, height, height) : Bitmap.createBitmap(decodeFileWithSample, 0, (height - width) / 2, width, width);
        }
        if (m80442d(decodeFileWithSample)) {
            return decodeFileWithSample;
        }
        return null;
    }

    @Deprecated
    /* renamed from: a */
    public void mo93556a(C10579k.C10580a aVar) {
        this.f195667a.add(aVar, Looper.getMainLooper());
    }

    /* renamed from: b */
    public void mo93557b(C10579k.C10580a aVar) {
        synchronized (this.f195668b) {
            ((ArrayList) this.f195668b).add(new WeakReference(aVar));
        }
    }

    /* renamed from: g */
    public String mo93558g(String str, boolean z, boolean z2) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append(C86709a0.m107535s().f251807e);
        sb.append("avatar/");
        m80443e(sb, str, z);
        String sb4 = sb.toString();
        if (C86013q1.m106461v(C86013q1.m106458s(sb4))) {
            return sb4;
        }
        return null;
    }

    /* renamed from: h */
    public String mo93559h(String str, boolean z) {
        StringBuilder sb = new StringBuilder(64);
        sb.append("wcf://avatar/");
        m80443e(sb, str, z);
        String sb4 = sb.toString();
        C86013q1.m106461v(C86013q1.m106458s(sb4));
        return sb4;
    }

    /* renamed from: i */
    public Bitmap mo93560i(Context context) {
        context.getResources();
        Bitmap j = mo93561j("I_AM_NO_SDCARD_USER_NAME");
        if (m80442d(j) || j == null) {
            return j;
        }
        Log.m105925i("MicroMsg.AvatarStorage", "not cached, recycled=%b, reload=%s", Boolean.valueOf(j.isRecycled()), "I_AM_NO_SDCARD_USER_NAME");
        Bitmap roundedCornerBitmap = BitmapUtil.getRoundedCornerBitmap(j, true, 1.0f);
        mo93569r("I_AM_NO_SDCARD_USER_NAME", roundedCornerBitmap);
        return roundedCornerBitmap;
    }

    /* renamed from: j */
    public Bitmap mo93561j(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        C101611g<String, Bitmap> gVar = f195666e.f195672a;
        Bitmap bitmap = gVar != null ? (Bitmap) ((C101062d) gVar).mo139556b(str) : (Bitmap) C75766h.C75767a.m91020a("avatar_cache", str, null);
        if (bitmap == null) {
            if (!str.startsWith("key")) {
                String A00 = ((C76707h) C86312j.m106911c(C76707h.class)).A00(str, 0.1f);
                C101611g<String, Bitmap> gVar2 = f195666e.f195672a;
                bitmap = gVar2 != null ? (Bitmap) ((C101062d) gVar2).mo139556b(A00) : (Bitmap) C75766h.C75767a.m91020a("avatar_cache", A00, null);
            }
            if (bitmap == null) {
                return null;
            }
        }
        if (!bitmap.isRecycled()) {
            return bitmap;
        }
        f195666e.mo93573a(str);
        return null;
    }

    /* renamed from: k */
    public Bitmap mo93562k(String str) {
        Log.m105919d("MicroMsg.AvatarStorage", "getHDBitmap user:%s", str);
        if (Util.isNullOrNil(str)) {
            return null;
        }
        return BitmapUtil.getBitmapNative(mo93559h(str, true), 1080, 1080);
    }

    /* renamed from: l */
    public Bitmap mo93563l(String str) {
        Map<String, Integer> map = f195665d;
        int intValue = ((ConcurrentHashMap) map).containsKey(str) ? ((Integer) ((ConcurrentHashMap) map).get(str)).intValue() : 0;
        Bitmap bitmap = null;
        if (intValue != 0) {
            C68102u.xx0().getClass();
            bitmap = C88155a.decodeResource(MMApplicationContext.getContext().getResources(), intValue, (BitmapFactory.Options) null);
        }
        return BitmapUtil.getRoundedCornerBitmap(bitmap, true, 1.0f, true);
    }

    /* renamed from: m */
    public final WeakReference<C10579k.C10580a> mo93564m(C10579k.C10580a aVar) {
        synchronized (this.f195668b) {
            for (int i = 0; i < ((ArrayList) this.f195668b).size(); i++) {
                WeakReference<C10579k.C10580a> weakReference = (WeakReference) ((ArrayList) this.f195668b).get(i);
                if (weakReference != null) {
                    C10579k.C10580a aVar2 = weakReference.get();
                    if (aVar2 != null && aVar2.equals(aVar)) {
                        return weakReference;
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: n */
    public boolean mo93565n(String str, boolean z) {
        String h = mo93559h(str, z);
        if (!C86013q1.m106450k(h)) {
            if (!z) {
                if (C86013q1.m106450k(h + ".bm")) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public boolean mo93566o(String str, boolean z) {
        String h = mo93559h(str, z);
        Log.m105925i("MicroMsg.AvatarStorage", "Removed avatar: %s, hd: %b, path: %s", str, Boolean.valueOf(z), h);
        boolean h2 = C86013q1.m106447h(h);
        if (z) {
            return h2;
        }
        C68077d.m80464c(h);
        return h2 | true;
    }

    /* renamed from: p */
    public void mo93567p(C10579k.C10580a aVar) {
        synchronized (this.f195668b) {
            WeakReference<C10579k.C10580a> m = mo93564m(aVar);
            if (m != null) {
                ((ArrayList) this.f195668b).remove(m);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0063 A[SYNTHETIC, Splitter:B:29:0x0063] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0069 A[SYNTHETIC, Splitter:B:34:0x0069] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap mo93568q(java.lang.String r8, byte[] r9) {
        /*
            r7 = this;
            r0 = 156(0x9c, float:2.19E-43)
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeByteArray(r9, r0, r0)
            boolean r1 = m80442d(r0)
            r2 = 0
            r3 = 1
            java.lang.String r4 = "MicroMsg.AvatarStorage"
            r5 = 0
            if (r1 != 0) goto L_0x001b
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r9[r5] = r8
            java.lang.String r8 = "Failed to decode avatar: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r8, r9)
            return r2
        L_0x001b:
            int r1 = r0.getWidth()
            int r6 = r0.getHeight()
            if (r1 == r6) goto L_0x0036
            if (r1 <= r6) goto L_0x002f
            int r1 = r1 - r6
            int r1 = r1 / 2
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r5, r6, r6)
            goto L_0x0036
        L_0x002f:
            int r6 = r6 - r1
            int r6 = r6 / 2
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r5, r6, r1, r1)
        L_0x0036:
            java.lang.String r1 = r7.mo93559h(r8, r5)
            java.io.OutputStream r1 = com.tencent.p014mm.vfs.C86013q1.m106429K(r1, r5)     // Catch:{ IOException -> 0x0056, all -> 0x0054 }
            int r6 = r9.length     // Catch:{ IOException -> 0x0052 }
            r1.write(r9, r5, r6)     // Catch:{ IOException -> 0x0052 }
            r1.close()     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r9[r5] = r8
            java.lang.String r8 = "Saved avatar: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r8, r9)
            return r0
        L_0x004f:
            r8 = move-exception
            r2 = r1
            goto L_0x0067
        L_0x0052:
            r9 = move-exception
            goto L_0x0058
        L_0x0054:
            r8 = move-exception
            goto L_0x0067
        L_0x0056:
            r9 = move-exception
            r1 = r2
        L_0x0058:
            java.lang.String r0 = "Failed to save avatar: %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x004f }
            r3[r5] = r8     // Catch:{ all -> 0x004f }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r9, r0, r3)     // Catch:{ all -> 0x004f }
            if (r1 == 0) goto L_0x0066
            r1.close()     // Catch:{ IOException -> 0x0066 }
        L_0x0066:
            return r2
        L_0x0067:
            if (r2 == 0) goto L_0x006c
            r2.close()     // Catch:{ IOException -> 0x006c }
        L_0x006c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelavatar.AvatarStorage.mo93568q(java.lang.String, byte[]):android.graphics.Bitmap");
    }

    /* renamed from: r */
    public void mo93569r(String str, Bitmap bitmap) {
        C101611g<String, Bitmap> gVar = f195666e.f195672a;
        if (gVar != null) {
            ((C101062d) gVar).mo139557c(str, bitmap);
        } else {
            C75766h.C75767a.m91022c("avatar_cache", str, bitmap);
        }
        C78592b a = C78592b.C53158a.m59566a();
        if (a != null) {
            a.mo108585Rr(str);
        }
        this.f195667a.event(str);
        this.f195667a.doNotify();
        Log.m105919d("MicroMsg.AvatarStorage", "setToCache %s", str);
    }

    /* renamed from: s */
    public boolean mo93570s(String str, Bitmap bitmap) {
        return mo93571t(str, bitmap, 156, 156, 1);
    }

    /* renamed from: t */
    public boolean mo93571t(String str, Bitmap bitmap, int i, int i2, int i3) {
        Bitmap bitmap2;
        if (!m80442d(bitmap)) {
            return false;
        }
        if (bitmap.getWidth() == i2 && bitmap.getHeight() == i) {
            bitmap2 = bitmap;
        } else {
            try {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                if (width != height) {
                    bitmap2 = Bitmap.createScaledBitmap(width > height ? Bitmap.createBitmap(bitmap, (width - height) / 2, 0, height, height) : Bitmap.createBitmap(bitmap, 0, (height - width) / 2, width, width), i2, i, true);
                } else {
                    bitmap2 = Bitmap.createScaledBitmap(bitmap, i2, i, true);
                }
            } catch (OutOfMemoryError unused) {
                Log.m105921e("MicroMsg.AvatarStorage", "kevin updateAvatar fail  %s ", str);
                if (m80442d(bitmap)) {
                    Log.m105925i("MicroMsg.AvatarStorage", "recycle bitmap:%s", bitmap.toString());
                    bitmap.recycle();
                }
                return false;
            }
        }
        if (!(bitmap2 == null || bitmap2 == bitmap)) {
            Log.m105925i("MicroMsg.AvatarStorage", "recycle bitmap:%s", bitmap.toString());
            bitmap.recycle();
            bitmap = bitmap2;
        }
        try {
            BitmapUtil.getImageWriteOutputStream(mo93559h(str, false), (BitmapUtil.ImageWriteOSCallback) new C68076c(this, bitmap));
            mo93569r(str, bitmap);
            return true;
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.AvatarStorage", e, "Failed to save avatar: %s", str);
            return false;
        }
    }

    /* renamed from: u */
    public boolean mo93572u(String str, byte[] bArr) {
        Bitmap q = mo93568q(str, bArr);
        if (!m80442d(q)) {
            return false;
        }
        mo93569r(str, q);
        return true;
    }
}
