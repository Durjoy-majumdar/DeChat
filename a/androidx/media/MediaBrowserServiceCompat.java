package androidx.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.p427v4.media.MediaBrowserCompat;
import android.support.p427v4.media.session.MediaSessionCompat;
import android.support.p427v4.p1171os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p1042u.C111055b;
import p329d3.C58104c;
import p379r3.C89866d;

public abstract class MediaBrowserServiceCompat extends Service {

    /* renamed from: i */
    public static final boolean f338216i = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: d */
    public C112991c f338217d;

    /* renamed from: e */
    public final C112989b f338218e = new C112989b("android.media.session.MediaController", -1, -1, (Bundle) null, (C113002k) null);

    /* renamed from: f */
    public final ArrayList<C112989b> f338219f = new ArrayList<>();

    /* renamed from: g */
    public final C111055b<IBinder, C112989b> f338220g = new C111055b<>();

    /* renamed from: h */
    public final C113004m f338221h = new C113004m(this);

    /* renamed from: androidx.media.MediaBrowserServiceCompat$a */
    public static final class C112988a {

        /* renamed from: a */
        public final String f338222a;

        /* renamed from: b */
        public final Bundle f338223b;

        public C112988a(String str, Bundle bundle) {
            if (str != null) {
                this.f338222a = str;
                this.f338223b = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$b */
    public class C112989b implements IBinder.DeathRecipient {

        /* renamed from: d */
        public final String f338224d;

        /* renamed from: e */
        public final int f338225e;

        /* renamed from: f */
        public final int f338226f;

        /* renamed from: g */
        public final C113002k f338227g;

        /* renamed from: h */
        public final HashMap<String, List<C58104c<IBinder, Bundle>>> f338228h = new HashMap<>();

        /* renamed from: i */
        public C112988a f338229i;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$b$a */
        public class C112990a implements Runnable {
            public C112990a() {
            }

            public void run() {
                C112989b bVar = C112989b.this;
                MediaBrowserServiceCompat.this.f338220g.remove(((C113003l) bVar.f338227g).mo165365a());
            }
        }

        public C112989b(String str, int i, int i2, Bundle bundle, C113002k kVar) {
            this.f338224d = str;
            this.f338225e = i;
            this.f338226f = i2;
            if (str == null) {
                throw new NullPointerException("package shouldn't be null");
            } else if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    new C89866d(str, i, i2);
                }
                this.f338227g = kVar;
            } else {
                throw new IllegalArgumentException("packageName should be nonempty");
            }
        }

        public void binderDied() {
            MediaBrowserServiceCompat.this.f338221h.post(new C112990a());
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$c */
    public interface C112991c {
        void onCreate();
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$d */
    public class C112992d implements C112991c {

        /* renamed from: a */
        public final List<Bundle> f338232a = new ArrayList();

        /* renamed from: b */
        public MediaBrowserService f338233b;

        /* renamed from: c */
        public Messenger f338234c;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$d$a */
        public class C112993a extends MediaBrowserService {
            public C112993a(Context context) {
                attachBaseContext(context);
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x007a  */
            /* JADX WARNING: Removed duplicated region for block: B:13:0x007c  */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x009d  */
            /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public android.service.media.MediaBrowserService.BrowserRoot onGetRoot(java.lang.String r12, int r13, android.os.Bundle r14) {
                /*
                    r11 = this;
                    android.support.p427v4.media.session.MediaSessionCompat.m154359a(r14)
                    androidx.media.MediaBrowserServiceCompat$d r0 = androidx.media.MediaBrowserServiceCompat.C112992d.this
                    r1 = 0
                    if (r14 != 0) goto L_0x000a
                    r2 = r1
                    goto L_0x000f
                L_0x000a:
                    android.os.Bundle r2 = new android.os.Bundle
                    r2.<init>(r14)
                L_0x000f:
                    r14 = -1
                    if (r2 == 0) goto L_0x005a
                    r0.getClass()
                    r3 = 0
                    java.lang.String r4 = "extra_client_version"
                    int r3 = r2.getInt(r4, r3)
                    if (r3 == 0) goto L_0x005a
                    r2.remove(r4)
                    android.os.Messenger r3 = new android.os.Messenger
                    androidx.media.MediaBrowserServiceCompat r4 = androidx.media.MediaBrowserServiceCompat.this
                    androidx.media.MediaBrowserServiceCompat$m r4 = r4.f338221h
                    r3.<init>(r4)
                    r0.f338234c = r3
                    android.os.Bundle r3 = new android.os.Bundle
                    r3.<init>()
                    r4 = 2
                    java.lang.String r5 = "extra_service_version"
                    r3.putInt(r5, r4)
                    android.os.Messenger r4 = r0.f338234c
                    android.os.IBinder r4 = r4.getBinder()
                    java.lang.String r5 = "extra_messenger"
                    r3.putBinder(r5, r4)
                    androidx.media.MediaBrowserServiceCompat r4 = androidx.media.MediaBrowserServiceCompat.this
                    r4.getClass()
                    java.util.List<android.os.Bundle> r4 = r0.f338232a
                    java.util.ArrayList r4 = (java.util.ArrayList) r4
                    r4.add(r3)
                    java.lang.String r4 = "extra_calling_pid"
                    int r14 = r2.getInt(r4, r14)
                    r2.remove(r4)
                    r6 = r14
                    r14 = r3
                    goto L_0x005c
                L_0x005a:
                    r14 = r1
                    r6 = -1
                L_0x005c:
                    androidx.media.MediaBrowserServiceCompat$b r10 = new androidx.media.MediaBrowserServiceCompat$b
                    androidx.media.MediaBrowserServiceCompat r4 = androidx.media.MediaBrowserServiceCompat.this
                    r9 = 0
                    r3 = r10
                    r5 = r12
                    r7 = r13
                    r8 = r2
                    r3.<init>(r5, r6, r7, r8, r9)
                    androidx.media.MediaBrowserServiceCompat r3 = androidx.media.MediaBrowserServiceCompat.this
                    r3.getClass()
                    androidx.media.MediaBrowserServiceCompat r3 = androidx.media.MediaBrowserServiceCompat.this
                    androidx.media.MediaBrowserServiceCompat$a r12 = r3.mo165350b(r12, r13, r2)
                    androidx.media.MediaBrowserServiceCompat r13 = androidx.media.MediaBrowserServiceCompat.this
                    r13.getClass()
                    if (r12 != 0) goto L_0x007c
                    r13 = r1
                    goto L_0x009a
                L_0x007c:
                    android.os.Messenger r13 = r0.f338234c
                    if (r13 == 0) goto L_0x0087
                    androidx.media.MediaBrowserServiceCompat r13 = androidx.media.MediaBrowserServiceCompat.this
                    java.util.ArrayList<androidx.media.MediaBrowserServiceCompat$b> r13 = r13.f338219f
                    r13.add(r10)
                L_0x0087:
                    if (r14 != 0) goto L_0x008c
                    android.os.Bundle r14 = r12.f338223b
                    goto L_0x0093
                L_0x008c:
                    android.os.Bundle r13 = r12.f338223b
                    if (r13 == 0) goto L_0x0093
                    r14.putAll(r13)
                L_0x0093:
                    androidx.media.MediaBrowserServiceCompat$a r13 = new androidx.media.MediaBrowserServiceCompat$a
                    java.lang.String r12 = r12.f338222a
                    r13.<init>(r12, r14)
                L_0x009a:
                    if (r13 != 0) goto L_0x009d
                    goto L_0x00a6
                L_0x009d:
                    android.service.media.MediaBrowserService$BrowserRoot r1 = new android.service.media.MediaBrowserService$BrowserRoot
                    java.lang.String r12 = r13.f338222a
                    android.os.Bundle r13 = r13.f338223b
                    r1.<init>(r12, r13)
                L_0x00a6:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.media.MediaBrowserServiceCompat.C112992d.C112993a.onGetRoot(java.lang.String, int, android.os.Bundle):android.service.media.MediaBrowserService$BrowserRoot");
            }

            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                C112992d dVar = C112992d.this;
                C113000i iVar = new C113000i(result);
                dVar.getClass();
                C113007c cVar = new C113007c(dVar, str, iVar);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                C112989b bVar = mediaBrowserServiceCompat.f338218e;
                mediaBrowserServiceCompat.mo165351c(str, cVar);
                MediaBrowserServiceCompat.this.getClass();
            }
        }

        public C112992d() {
        }

        public void onCreate() {
            C112993a aVar = new C112993a(MediaBrowserServiceCompat.this);
            this.f338233b = aVar;
            aVar.onCreate();
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$e */
    public class C112994e extends C112992d {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$e$a */
        public class C112995a extends C112992d.C112993a {
            public C112995a(Context context) {
                super(context);
            }

            public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                C112994e eVar = C112994e.this;
                C113000i iVar = new C113000i(result);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                C112989b bVar = mediaBrowserServiceCompat.f338218e;
                mediaBrowserServiceCompat.getClass();
                iVar.mo165364a(null);
                MediaBrowserServiceCompat.this.getClass();
            }
        }

        public C112994e() {
            super();
        }

        public void onCreate() {
            C112995a aVar = new C112995a(MediaBrowserServiceCompat.this);
            this.f338233b = aVar;
            aVar.onCreate();
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$f */
    public class C112996f extends C112994e {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$f$a */
        public class C112997a extends C112994e.C112995a {
            public C112997a(Context context) {
                super(context);
            }

            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.m154359a(bundle);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                C112989b bVar = mediaBrowserServiceCompat.f338218e;
                mediaBrowserServiceCompat.getClass();
                C112996f fVar = C112996f.this;
                C113000i iVar = new C113000i(result);
                fVar.getClass();
                C113008d dVar = new C113008d(fVar, str, iVar, bundle);
                MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                C112989b bVar2 = mediaBrowserServiceCompat2.f338218e;
                mediaBrowserServiceCompat2.getClass();
                dVar.f338243c = 1;
                mediaBrowserServiceCompat2.mo165351c(str, dVar);
                MediaBrowserServiceCompat.this.getClass();
                MediaBrowserServiceCompat.this.getClass();
            }
        }

        public C112996f() {
            super();
        }

        public void onCreate() {
            C112997a aVar = new C112997a(MediaBrowserServiceCompat.this);
            this.f338233b = aVar;
            aVar.onCreate();
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$g */
    public class C112998g extends C112996f {
        public C112998g(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            super();
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$h */
    public static class C112999h<T> {

        /* renamed from: a */
        public final Object f338241a;

        /* renamed from: b */
        public boolean f338242b;

        /* renamed from: c */
        public int f338243c;

        public C112999h(Object obj) {
            this.f338241a = obj;
        }

        /* renamed from: a */
        public void mo165362a(T t) {
            throw null;
        }

        /* renamed from: b */
        public void mo165363b(T t) {
            if (!this.f338242b) {
                this.f338242b = true;
                mo165362a(t);
                return;
            }
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f338241a);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$i */
    public static class C113000i<T> {

        /* renamed from: a */
        public MediaBrowserService.Result f338244a;

        public C113000i(MediaBrowserService.Result result) {
            this.f338244a = result;
        }

        /* renamed from: a */
        public void mo165364a(T t) {
            ArrayList arrayList = null;
            if (t instanceof List) {
                MediaBrowserService.Result result = this.f338244a;
                List<Parcel> list = (List) t;
                if (list != null) {
                    arrayList = new ArrayList(list.size());
                    for (Parcel parcel : list) {
                        parcel.setDataPosition(0);
                        arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                        parcel.recycle();
                    }
                }
                result.sendResult(arrayList);
            } else if (t instanceof Parcel) {
                Parcel parcel2 = (Parcel) t;
                parcel2.setDataPosition(0);
                this.f338244a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
                parcel2.recycle();
            } else {
                this.f338244a.sendResult((Object) null);
            }
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$j */
    public class C113001j {
        public C113001j() {
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$k */
    public interface C113002k {
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$l */
    public static class C113003l implements C113002k {

        /* renamed from: a */
        public final Messenger f338246a;

        public C113003l(Messenger messenger) {
            this.f338246a = messenger;
        }

        /* renamed from: a */
        public IBinder mo165365a() {
            return this.f338246a.getBinder();
        }

        /* renamed from: b */
        public void mo165366b(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList(list));
            }
            Message obtain = Message.obtain();
            obtain.what = 3;
            obtain.arg1 = 2;
            obtain.setData(bundle3);
            this.f338246a.send(obtain);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$m */
    public final class C113004m extends Handler {

        /* renamed from: a */
        public final C113001j f338247a;

        public C113004m(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            this.f338247a = new C113001j();
        }

        /* renamed from: a */
        public void mo165367a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public void handleMessage(Message message) {
            Message message2 = message;
            Bundle data = message.getData();
            switch (message2.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.m154359a(bundle);
                    C113001j jVar = this.f338247a;
                    String string = data.getString("data_package_name");
                    int i = data.getInt("data_calling_pid");
                    int i2 = data.getInt("data_calling_uid");
                    C113003l lVar = new C113003l(message2.replyTo);
                    MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                    boolean z = false;
                    if (string == null) {
                        mediaBrowserServiceCompat.getClass();
                    } else {
                        String[] packagesForUid = mediaBrowserServiceCompat.getPackageManager().getPackagesForUid(i2);
                        int length = packagesForUid.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                if (packagesForUid[i3].equals(string)) {
                                    z = true;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                    if (z) {
                        MediaBrowserServiceCompat.this.f338221h.mo165367a(new C113009e(jVar, lVar, string, i, i2, bundle));
                        return;
                    }
                    throw new IllegalArgumentException("Package/uid mismatch: uid=" + i2 + " package=" + string);
                case 2:
                    C113001j jVar2 = this.f338247a;
                    MediaBrowserServiceCompat.this.f338221h.mo165367a(new C113010f(jVar2, new C113003l(message2.replyTo)));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.m154359a(bundle2);
                    C113001j jVar3 = this.f338247a;
                    String string2 = data.getString("data_media_item_id");
                    IBinder binder = data.getBinder("data_callback_token");
                    MediaBrowserServiceCompat.this.f338221h.mo165367a(new C113011g(jVar3, new C113003l(message2.replyTo), string2, binder, bundle2));
                    return;
                case 4:
                    C113001j jVar4 = this.f338247a;
                    String string3 = data.getString("data_media_item_id");
                    IBinder binder2 = data.getBinder("data_callback_token");
                    MediaBrowserServiceCompat.this.f338221h.mo165367a(new C113012h(jVar4, new C113003l(message2.replyTo), string3, binder2));
                    return;
                case 5:
                    C113001j jVar5 = this.f338247a;
                    String string4 = data.getString("data_media_item_id");
                    ResultReceiver resultReceiver = (ResultReceiver) data.getParcelable("data_result_receiver");
                    C113003l lVar2 = new C113003l(message2.replyTo);
                    jVar5.getClass();
                    if (!TextUtils.isEmpty(string4) && resultReceiver != null) {
                        MediaBrowserServiceCompat.this.f338221h.mo165367a(new C113013i(jVar5, lVar2, string4, resultReceiver));
                        return;
                    }
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.m154359a(bundle3);
                    C113001j jVar6 = this.f338247a;
                    C113003l lVar3 = new C113003l(message2.replyTo);
                    String string5 = data.getString("data_package_name");
                    int i4 = data.getInt("data_calling_pid");
                    MediaBrowserServiceCompat.this.f338221h.mo165367a(new C113014j(jVar6, lVar3, data.getInt("data_calling_uid"), string5, i4, bundle3));
                    return;
                case 7:
                    C113001j jVar7 = this.f338247a;
                    MediaBrowserServiceCompat.this.f338221h.mo165367a(new C113015k(jVar7, new C113003l(message2.replyTo)));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.m154359a(bundle4);
                    C113001j jVar8 = this.f338247a;
                    String string6 = data.getString("data_search_query");
                    ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    C113003l lVar4 = new C113003l(message2.replyTo);
                    jVar8.getClass();
                    if (!TextUtils.isEmpty(string6) && resultReceiver2 != null) {
                        MediaBrowserServiceCompat.this.f338221h.mo165367a(new C113016l(jVar8, lVar4, string6, bundle4, resultReceiver2));
                        return;
                    }
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.m154359a(bundle5);
                    C113001j jVar9 = this.f338247a;
                    String string7 = data.getString("data_custom_action");
                    ResultReceiver resultReceiver3 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    C113003l lVar5 = new C113003l(message2.replyTo);
                    jVar9.getClass();
                    if (!TextUtils.isEmpty(string7) && resultReceiver3 != null) {
                        MediaBrowserServiceCompat.this.f338221h.mo165367a(new C113017m(jVar9, lVar5, string7, bundle5, resultReceiver3));
                        return;
                    }
                    return;
                default:
                    message.toString();
                    return;
            }
        }

        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    /* renamed from: a */
    public List<MediaBrowserCompat.MediaItem> mo165349a(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i == -1 && i2 == -1) {
            return list;
        }
        int i3 = i2 * i;
        int i4 = i3 + i2;
        if (i < 0 || i2 < 1 || i3 >= list.size()) {
            return Collections.emptyList();
        }
        if (i4 > list.size()) {
            i4 = list.size();
        }
        return list.subList(i3, i4);
    }

    /* renamed from: b */
    public abstract C112988a mo165350b(String str, int i, Bundle bundle);

    /* renamed from: c */
    public abstract void mo165351c(String str, C112999h<List<MediaBrowserCompat.MediaItem>> hVar);

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public IBinder onBind(Intent intent) {
        return ((C112992d) this.f338217d).f338233b.onBind(intent);
    }

    public void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f338217d = new C112998g(this);
        } else if (i >= 26) {
            this.f338217d = new C112996f();
        } else if (i >= 23) {
            this.f338217d = new C112994e();
        } else {
            this.f338217d = new C112992d();
        }
        this.f338217d.onCreate();
    }
}
