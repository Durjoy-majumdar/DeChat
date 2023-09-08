package android.support.p427v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.p427v4.media.session.C112824b;
import android.support.p427v4.media.session.MediaControllerCompat$MediaControllerImplApi21;
import android.support.p427v4.media.session.MediaSessionCompat;
import android.support.p427v4.p1171os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import androidx.media.session.MediaButtonReceiver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p1042u.C111055b;
import p379r3.C118217c;
import p584k4.C108883d;

/* renamed from: android.support.v4.media.MediaBrowserCompat */
public final class MediaBrowserCompat {

    /* renamed from: b */
    public static final /* synthetic */ int f337754b = 0;

    /* renamed from: a */
    public final C112803d f337755a;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
    public static class CustomActionResultReceiver extends ResultReceiver {
        /* renamed from: a */
        public void mo883a(int i, Bundle bundle) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    public static class ItemReceiver extends ResultReceiver {
        /* renamed from: a */
        public void mo883a(int i, Bundle bundle) {
            if (bundle != null) {
                MediaSessionCompat.m154359a(bundle);
                try {
                    bundle.isEmpty();
                } catch (BadParcelableException unused) {
                    bundle = null;
                }
            }
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                MediaItem mediaItem = (MediaItem) parcelable;
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
    public static class SearchResultReceiver extends ResultReceiver {
        /* renamed from: a */
        public void mo883a(int i, Bundle bundle) {
            if (bundle != null) {
                MediaSessionCompat.m154359a(bundle);
                try {
                    bundle.isEmpty();
                } catch (BadParcelableException unused) {
                    bundle = null;
                }
            }
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                throw null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            parcelableArray.getClass();
            ArrayList arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            throw null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    public static class C112798a {
        /* renamed from: a */
        public static MediaDescription m154325a(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getDescription();
        }

        /* renamed from: b */
        public static int m154326b(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getFlags();
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    public static class C112799b extends Handler {

        /* renamed from: a */
        public final WeakReference<C112807h> f337758a;

        /* renamed from: b */
        public WeakReference<Messenger> f337759b;

        public C112799b(C112807h hVar) {
            this.f337758a = new WeakReference<>(hVar);
        }

        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f337759b;
            if (weakReference != null && weakReference.get() != null && this.f337758a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.m154359a(data);
                C112807h hVar = this.f337758a.get();
                Messenger messenger = this.f337759b.get();
                try {
                    int i = message.what;
                    if (i == 1) {
                        Bundle bundle = data.getBundle("data_root_hints");
                        MediaSessionCompat.m154359a(bundle);
                        hVar.mo164582c(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                    } else if (i == 2) {
                        hVar.mo164580a(messenger);
                    } else if (i != 3) {
                        message.toString();
                    } else {
                        Bundle bundle2 = data.getBundle("data_options");
                        MediaSessionCompat.m154359a(bundle2);
                        Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                        MediaSessionCompat.m154359a(bundle3);
                        hVar.mo164581b(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                    }
                } catch (BadParcelableException unused) {
                    if (message.what == 1) {
                        hVar.mo164580a(messenger);
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    public static class C112800c {

        /* renamed from: a */
        public final MediaBrowser.ConnectionCallback f337760a = new C112801a();

        /* renamed from: b */
        public C112802b f337761b;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$a */
        public class C112801a extends MediaBrowser.ConnectionCallback {
            public C112801a() {
            }

            public void onConnected() {
                C112802b bVar = C112800c.this.f337761b;
                MediaSessionCompat.Token token = null;
                if (bVar != null) {
                    C112804e eVar = (C112804e) bVar;
                    try {
                        Bundle extras = eVar.f337764b.getExtras();
                        if (extras != null) {
                            extras.getInt("extra_service_version", 0);
                            IBinder binder = extras.getBinder("extra_messenger");
                            if (binder != null) {
                                eVar.f337768f = new C112808i(binder, eVar.f337765c);
                                Messenger messenger = new Messenger(eVar.f337766d);
                                eVar.f337769g = messenger;
                                C112799b bVar2 = eVar.f337766d;
                                bVar2.getClass();
                                bVar2.f337759b = new WeakReference<>(messenger);
                                try {
                                    C112808i iVar = eVar.f337768f;
                                    Context context = eVar.f337763a;
                                    Messenger messenger2 = eVar.f337769g;
                                    iVar.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putString("data_package_name", context.getPackageName());
                                    bundle.putInt("data_calling_pid", Process.myPid());
                                    bundle.putBundle("data_root_hints", iVar.f337772b);
                                    iVar.mo164583a(6, bundle, messenger2);
                                } catch (RemoteException unused) {
                                }
                            }
                            C112824b a = C112824b.C112825a.m154368a(extras.getBinder("extra_session_binder"));
                            if (a != null) {
                                MediaSession.Token sessionToken = eVar.f337764b.getSessionToken();
                                eVar.f337770h = sessionToken != null ? new MediaSessionCompat.Token(sessionToken, a, (C108883d) null) : null;
                            }
                        }
                    } catch (IllegalStateException unused2) {
                    }
                }
                MediaButtonReceiver.C113018a aVar = (MediaButtonReceiver.C113018a) C112800c.this;
                Context context2 = aVar.f338294c;
                C112804e eVar2 = (C112804e) aVar.f338297f.f337755a;
                if (eVar2.f337770h == null) {
                    MediaSession.Token sessionToken2 = eVar2.f337764b.getSessionToken();
                    if (sessionToken2 != null) {
                        token = new MediaSessionCompat.Token(sessionToken2, (C112824b) null, (C108883d) null);
                    }
                    eVar2.f337770h = token;
                }
                MediaSessionCompat.Token token2 = eVar2.f337770h;
                new ConcurrentHashMap();
                if (token2 != null) {
                    MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = new MediaControllerCompat$MediaControllerImplApi21(context2, token2);
                    KeyEvent keyEvent = (KeyEvent) aVar.f338295d.getParcelableExtra("android.intent.extra.KEY_EVENT");
                    if (keyEvent != null) {
                        mediaControllerCompat$MediaControllerImplApi21.f337788a.dispatchMediaButtonEvent(keyEvent);
                        aVar.mo165380a();
                        return;
                    }
                    throw new IllegalArgumentException("KeyEvent may not be null");
                }
                throw new IllegalArgumentException("sessionToken must not be null");
            }

            public void onConnectionFailed() {
                C112802b bVar = C112800c.this.f337761b;
                if (bVar != null) {
                    bVar.getClass();
                }
                ((MediaButtonReceiver.C113018a) C112800c.this).mo165380a();
            }

            public void onConnectionSuspended() {
                C112802b bVar = C112800c.this.f337761b;
                if (bVar != null) {
                    C112804e eVar = (C112804e) bVar;
                    eVar.f337768f = null;
                    eVar.f337769g = null;
                    eVar.f337770h = null;
                    C112799b bVar2 = eVar.f337766d;
                    bVar2.getClass();
                    bVar2.f337759b = new WeakReference<>((Object) null);
                }
                ((MediaButtonReceiver.C113018a) C112800c.this).mo165380a();
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$b */
        public interface C112802b {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$d */
    public interface C112803d {
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$e */
    public static class C112804e implements C112803d, C112807h, C112800c.C112802b {

        /* renamed from: a */
        public final Context f337763a;

        /* renamed from: b */
        public final MediaBrowser f337764b;

        /* renamed from: c */
        public final Bundle f337765c;

        /* renamed from: d */
        public final C112799b f337766d = new C112799b(this);

        /* renamed from: e */
        public final C111055b<String, C112809j> f337767e = new C111055b<>();

        /* renamed from: f */
        public C112808i f337768f;

        /* renamed from: g */
        public Messenger f337769g;

        /* renamed from: h */
        public MediaSessionCompat.Token f337770h;

        public C112804e(Context context, ComponentName componentName, C112800c cVar, Bundle bundle) {
            Bundle bundle2;
            this.f337763a = context;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            this.f337765c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bundle2.putInt("extra_calling_pid", Process.myPid());
            cVar.f337761b = this;
            this.f337764b = new MediaBrowser(context, componentName, cVar.f337760a, bundle2);
        }

        /* renamed from: a */
        public void mo164580a(Messenger messenger) {
        }

        /* renamed from: b */
        public void mo164581b(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (this.f337769g == messenger) {
                C112809j orDefault = this.f337767e.getOrDefault(str, null);
                if (orDefault == null) {
                    int i = MediaBrowserCompat.f337754b;
                    return;
                }
                for (int i2 = 0; i2 < ((ArrayList) orDefault.f337774b).size(); i2++) {
                    if (C118217c.m166771a((Bundle) ((ArrayList) orDefault.f337774b).get(i2), bundle)) {
                        C112810k kVar = (C112810k) ((ArrayList) orDefault.f337773a).get(i2);
                        return;
                    }
                }
            }
        }

        /* renamed from: c */
        public void mo164582c(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$f */
    public static class C112805f extends C112804e {
        public C112805f(Context context, ComponentName componentName, C112800c cVar, Bundle bundle) {
            super(context, componentName, cVar, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$g */
    public static class C112806g extends C112805f {
        public C112806g(Context context, ComponentName componentName, C112800c cVar, Bundle bundle) {
            super(context, componentName, cVar, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$h */
    public interface C112807h {
        /* renamed from: a */
        void mo164580a(Messenger messenger);

        /* renamed from: b */
        void mo164581b(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2);

        /* renamed from: c */
        void mo164582c(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$i */
    public static class C112808i {

        /* renamed from: a */
        public Messenger f337771a;

        /* renamed from: b */
        public Bundle f337772b;

        public C112808i(IBinder iBinder, Bundle bundle) {
            this.f337771a = new Messenger(iBinder);
            this.f337772b = bundle;
        }

        /* renamed from: a */
        public final void mo164583a(int i, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f337771a.send(obtain);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$j */
    public static class C112809j {

        /* renamed from: a */
        public final List<C112810k> f337773a = new ArrayList();

        /* renamed from: b */
        public final List<Bundle> f337774b = new ArrayList();
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$k */
    public static abstract class C112810k {

        /* renamed from: a */
        public final IBinder f337775a = new Binder();

        /* renamed from: android.support.v4.media.MediaBrowserCompat$k$a */
        public class C112811a extends MediaBrowser.SubscriptionCallback {
            public C112811a() {
            }

            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
                C112810k.this.getClass();
                C112810k kVar = C112810k.this;
                MediaItem.m154323a(list);
                kVar.getClass();
            }

            public void onError(String str) {
                C112810k.this.getClass();
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$k$b */
        public class C112812b extends C112811a {
            public C112812b() {
                super();
            }

            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
                MediaSessionCompat.m154359a(bundle);
                C112810k kVar = C112810k.this;
                MediaItem.m154323a(list);
                kVar.getClass();
            }

            public void onError(String str, Bundle bundle) {
                MediaSessionCompat.m154359a(bundle);
                C112810k.this.getClass();
            }
        }

        public C112810k() {
            if (Build.VERSION.SDK_INT >= 26) {
                new C112812b();
            } else {
                new C112811a();
            }
        }
    }

    static {
        Log.isLoggable("MediaBrowserCompat", 3);
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C112800c cVar, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f337755a = new C112806g(context, componentName, cVar, bundle);
        } else if (i >= 23) {
            this.f337755a = new C112805f(context, componentName, cVar, bundle);
        } else {
            this.f337755a = new C112804e(context, componentName, cVar, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new C112797a();

        /* renamed from: d */
        public final int f337756d;

        /* renamed from: e */
        public final MediaDescriptionCompat f337757e;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
        public class C112797a implements Parcelable.Creator<MediaItem> {
            public Object createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            public Object[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.f337778d)) {
                this.f337756d = i;
                this.f337757e = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }

        /* renamed from: a */
        public static List<MediaItem> m154323a(List<?> list) {
            MediaItem mediaItem;
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object next : list) {
                if (next != null) {
                    MediaBrowser.MediaItem mediaItem2 = (MediaBrowser.MediaItem) next;
                    mediaItem = new MediaItem(MediaDescriptionCompat.m154334a(C112798a.m154325a(mediaItem2)), C112798a.m154326b(mediaItem2));
                } else {
                    mediaItem = null;
                }
                arrayList.add(mediaItem);
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{" + "mFlags=" + this.f337756d + ", mDescription=" + this.f337757e + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f337756d);
            this.f337757e.writeToParcel(parcel, i);
        }

        public MediaItem(Parcel parcel) {
            this.f337756d = parcel.readInt();
            this.f337757e = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}
