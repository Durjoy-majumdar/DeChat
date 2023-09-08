package android.support.p427v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p427v4.media.MediaMetadataCompat;
import android.support.p427v4.media.session.C112827c;
import android.support.p427v4.media.session.MediaSessionCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
public class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a */
    public final MediaController f337788a;

    /* renamed from: b */
    public final Object f337789b = new Object();

    /* renamed from: c */
    public final List<C112827c> f337790c = new ArrayList();

    /* renamed from: d */
    public HashMap<C112827c, C112817a> f337791d = new HashMap<>();

    /* renamed from: e */
    public final MediaSessionCompat.Token f337792e;

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: d */
        public WeakReference<MediaControllerCompat$MediaControllerImplApi21> f337793d;

        public ExtraBinderRequestResultReceiver(MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21) {
            super((Handler) null);
            this.f337793d = new WeakReference<>(mediaControllerCompat$MediaControllerImplApi21);
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:458)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
            */
        public void onReceiveResult(int r5, android.os.Bundle r6) {
            /*
                r4 = this;
                java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21> r5 = r4.f337793d
                java.lang.Object r5 = r5.get()
                android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 r5 = (android.support.p427v4.media.session.MediaControllerCompat$MediaControllerImplApi21) r5
                if (r5 == 0) goto L_0x0064
                if (r6 != 0) goto L_0x000d
                goto L_0x0064
            L_0x000d:
                java.lang.Object r0 = r5.f337789b
                monitor-enter(r0)
                android.support.v4.media.session.MediaSessionCompat$Token r1 = r5.f337792e     // Catch:{ all -> 0x0061 }
                java.lang.String r2 = "android.support.v4.media.session.EXTRA_BINDER"
                android.os.IBinder r2 = r6.getBinder(r2)     // Catch:{ all -> 0x0061 }
                android.support.v4.media.session.b r2 = android.support.p427v4.media.session.C112824b.C112825a.m154368a(r2)     // Catch:{ all -> 0x0061 }
                java.lang.Object r3 = r1.f337796d     // Catch:{ all -> 0x0061 }
                monitor-enter(r3)     // Catch:{ all -> 0x0061 }
                r1.f337798f = r2     // Catch:{ all -> 0x005e }
                monitor-exit(r3)     // Catch:{ all -> 0x005e }
                android.support.v4.media.session.MediaSessionCompat$Token r1 = r5.f337792e     // Catch:{ all -> 0x0061 }
                java.lang.String r2 = "android.support.v4.media.session.SESSION_TOKEN2"
                r3 = 0
                android.os.Parcelable r6 = r6.getParcelable(r2)     // Catch:{ RuntimeException -> 0x0050 }
                android.os.Bundle r6 = (android.os.Bundle) r6     // Catch:{ RuntimeException -> 0x0050 }
                if (r6 != 0) goto L_0x0030
                goto L_0x0050
            L_0x0030:
                java.lang.Class<k4.a> r2 = p584k4.C33824a.class
                java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ RuntimeException -> 0x0050 }
                r6.setClassLoader(r2)     // Catch:{ RuntimeException -> 0x0050 }
                java.lang.String r2 = "a"
                android.os.Parcelable r6 = r6.getParcelable(r2)     // Catch:{ RuntimeException -> 0x0050 }
                boolean r2 = r6 instanceof androidx.versionedparcelable.ParcelImpl     // Catch:{ RuntimeException -> 0x0050 }
                if (r2 == 0) goto L_0x0048
                androidx.versionedparcelable.ParcelImpl r6 = (androidx.versionedparcelable.ParcelImpl) r6     // Catch:{ RuntimeException -> 0x0050 }
                k4.d r3 = r6.f306789d     // Catch:{ RuntimeException -> 0x0050 }
                goto L_0x0050
            L_0x0048:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ RuntimeException -> 0x0050 }
                java.lang.String r2 = "Invalid parcel"
                r6.<init>(r2)     // Catch:{ RuntimeException -> 0x0050 }
                throw r6     // Catch:{ RuntimeException -> 0x0050 }
            L_0x0050:
                java.lang.Object r6 = r1.f337796d     // Catch:{ all -> 0x0061 }
                monitor-enter(r6)     // Catch:{ all -> 0x0061 }
                r1.f337799g = r3     // Catch:{ all -> 0x005b }
                monitor-exit(r6)     // Catch:{ all -> 0x005b }
                r5.mo164597a()     // Catch:{ all -> 0x0061 }
                monitor-exit(r0)     // Catch:{ all -> 0x0061 }
                return
            L_0x005b:
                r5 = move-exception
                monitor-exit(r6)     // Catch:{ all -> 0x005b }
                throw r5     // Catch:{ all -> 0x0061 }
            L_0x005e:
                r5 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x005e }
                throw r5     // Catch:{ all -> 0x0061 }
            L_0x0061:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0061 }
                throw r5
            L_0x0064:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p427v4.media.session.MediaControllerCompat$MediaControllerImplApi21.ExtraBinderRequestResultReceiver.onReceiveResult(int, android.os.Bundle):void");
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
    public static class C112817a extends C112827c.C112829b {
        public C112817a(C112827c cVar) {
            super(cVar);
        }

        /* renamed from: RQ */
        public void mo164599RQ(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }

        public void Rq0(CharSequence charSequence) {
            throw new AssertionError();
        }

        /* renamed from: ZC */
        public void mo164601ZC(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        /* renamed from: bF */
        public void mo164602bF(Bundle bundle) {
            throw new AssertionError();
        }

        /* renamed from: qy */
        public void mo164603qy(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }

        /* renamed from: rU */
        public void mo164604rU() {
            throw new AssertionError();
        }
    }

    public MediaControllerCompat$MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
        C112824b bVar;
        this.f337792e = token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) token.f337797e);
        this.f337788a = mediaController;
        synchronized (token.f337796d) {
            bVar = token.f337798f;
        }
        if (bVar == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", (Bundle) null, new ExtraBinderRequestResultReceiver(this));
        }
    }

    /* renamed from: a */
    public void mo164597a() {
        C112824b bVar;
        C112824b bVar2;
        MediaSessionCompat.Token token = this.f337792e;
        synchronized (token.f337796d) {
            bVar = token.f337798f;
        }
        if (bVar != null) {
            Iterator it = ((ArrayList) this.f337790c).iterator();
            while (it.hasNext()) {
                C112827c cVar = (C112827c) it.next();
                C112817a aVar = new C112817a(cVar);
                this.f337791d.put(cVar, aVar);
                cVar.f337807d = aVar;
                try {
                    MediaSessionCompat.Token token2 = this.f337792e;
                    synchronized (token2.f337796d) {
                        bVar2 = token2.f337798f;
                    }
                    bVar2.f00(aVar);
                } catch (RemoteException unused) {
                }
            }
            ((ArrayList) this.f337790c).clear();
        }
    }
}
