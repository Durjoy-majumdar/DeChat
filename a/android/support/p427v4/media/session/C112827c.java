package android.support.p427v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p427v4.media.MediaDescriptionCompat;
import android.support.p427v4.media.MediaMetadataCompat;
import android.support.p427v4.media.session.C112822a;
import android.support.p427v4.media.session.MediaSessionCompat;
import android.support.p427v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.c */
public abstract class C112827c implements IBinder.DeathRecipient {

    /* renamed from: d */
    public C112822a f337807d;

    /* renamed from: android.support.v4.media.session.c$a */
    public static class C112828a extends MediaController.Callback {

        /* renamed from: a */
        public final WeakReference<C112827c> f337808a;

        public C112828a(C112827c cVar) {
            this.f337808a = new WeakReference<>(cVar);
        }

        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            if (this.f337808a.get() != null) {
                playbackInfo.getPlaybackType();
                playbackInfo.getAudioAttributes();
                if (Build.VERSION.SDK_INT >= 26) {
                }
                playbackInfo.getVolumeControl();
                playbackInfo.getMaxVolume();
                playbackInfo.getCurrentVolume();
            }
        }

        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m154359a(bundle);
            C112827c cVar = this.f337808a.get();
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            if (this.f337808a.get() != null) {
                Parcelable.Creator<MediaMetadataCompat> creator = MediaMetadataCompat.CREATOR;
                if (mediaMetadata != null) {
                    Parcel obtain = Parcel.obtain();
                    mediaMetadata.writeToParcel(obtain, 0);
                    obtain.setDataPosition(0);
                    obtain.recycle();
                    MediaMetadataCompat.CREATOR.createFromParcel(obtain).getClass();
                }
            }
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            ArrayList arrayList;
            PlaybackStateCompat.CustomAction customAction;
            C112827c cVar = this.f337808a.get();
            if (cVar != null && cVar.f337807d == null) {
                Bundle bundle = null;
                if (playbackState != null) {
                    List<PlaybackState.CustomAction> j = PlaybackStateCompat.C103392b.m137106j(playbackState);
                    if (j != null) {
                        ArrayList arrayList2 = new ArrayList(j.size());
                        for (PlaybackState.CustomAction next : j) {
                            if (next != null) {
                                PlaybackState.CustomAction customAction2 = next;
                                Bundle l = PlaybackStateCompat.C103392b.m137108l(customAction2);
                                MediaSessionCompat.m154359a(l);
                                customAction = new PlaybackStateCompat.CustomAction(PlaybackStateCompat.C103392b.m137102f(customAction2), PlaybackStateCompat.C103392b.m137111o(customAction2), PlaybackStateCompat.C103392b.m137109m(customAction2), l);
                            } else {
                                customAction = null;
                            }
                            arrayList2.add(customAction);
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    if (Build.VERSION.SDK_INT >= 22) {
                        bundle = PlaybackStateCompat.C103393c.m137121a(playbackState);
                        MediaSessionCompat.m154359a(bundle);
                    }
                    new PlaybackStateCompat(PlaybackStateCompat.C103392b.m137114r(playbackState), PlaybackStateCompat.C103392b.m137113q(playbackState), PlaybackStateCompat.C103392b.m137105i(playbackState), PlaybackStateCompat.C103392b.m137112p(playbackState), PlaybackStateCompat.C103392b.m137103g(playbackState), 0, PlaybackStateCompat.C103392b.m137107k(playbackState), PlaybackStateCompat.C103392b.m137110n(playbackState), arrayList, PlaybackStateCompat.C103392b.m137104h(playbackState), bundle);
                }
            }
        }

        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            MediaSessionCompat.QueueItem queueItem;
            if (this.f337808a.get() != null && list != null) {
                ArrayList arrayList = new ArrayList(list.size());
                for (MediaSession.QueueItem next : list) {
                    if (next != null) {
                        MediaSession.QueueItem queueItem2 = next;
                        queueItem = new MediaSessionCompat.QueueItem(queueItem2, MediaDescriptionCompat.m154334a(MediaSessionCompat.QueueItem.C112819b.m154361b(queueItem2)), MediaSessionCompat.QueueItem.C112819b.m154362c(queueItem2));
                    } else {
                        queueItem = null;
                    }
                    arrayList.add(queueItem);
                }
            }
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            C112827c cVar = this.f337808a.get();
        }

        public void onSessionDestroyed() {
            C112827c cVar = this.f337808a.get();
        }

        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m154359a(bundle);
            C112827c cVar = this.f337808a.get();
        }
    }

    /* renamed from: android.support.v4.media.session.c$b */
    public static class C112829b extends C112822a.C112823a {

        /* renamed from: d */
        public final WeakReference<C112827c> f337809d;

        public C112829b(C112827c cVar) {
            this.f337809d = new WeakReference<>(cVar);
        }
    }

    public C112827c() {
        new C112828a(this);
    }

    public void binderDied() {
    }
}
