package android.support.p427v4.media.session;

import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.p427v4.media.MediaDescriptionCompat;
import p584k4.C108883d;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C103389a();

        /* renamed from: d */
        public ResultReceiver f304925d;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        public class C103389a implements Parcelable.Creator<ResultReceiverWrapper> {
            public Object createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            public Object[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f304925d = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f304925d.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C112820a();

        /* renamed from: d */
        public final Object f337796d = new Object();

        /* renamed from: e */
        public final Object f337797e;

        /* renamed from: f */
        public C112824b f337798f;

        /* renamed from: g */
        public C108883d f337799g;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        public class C112820a implements Parcelable.Creator<Token> {
            public Object createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable((ClassLoader) null), (C112824b) null, (C108883d) null);
            }

            public Object[] newArray(int i) {
                return new Token[i];
            }
        }

        public Token(Object obj, C112824b bVar, C108883d dVar) {
            this.f337797e = obj;
            this.f337798f = bVar;
            this.f337799g = dVar;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f337797e;
            if (obj2 == null) {
                return token.f337797e == null;
            }
            Object obj3 = token.f337797e;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f337797e;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.f337797e, i);
        }
    }

    /* renamed from: a */
    public static void m154359a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C112818a();

        /* renamed from: d */
        public final MediaDescriptionCompat f337794d;

        /* renamed from: e */
        public final long f337795e;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        public class C112818a implements Parcelable.Creator<QueueItem> {
            public Object createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            public Object[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$b */
        public static class C112819b {
            /* renamed from: a */
            public static MediaSession.QueueItem m154360a(MediaDescription mediaDescription, long j) {
                return new MediaSession.QueueItem(mediaDescription, j);
            }

            /* renamed from: b */
            public static MediaDescription m154361b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            /* renamed from: c */
            public static long m154362c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        public QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            } else if (j != -1) {
                this.f337794d = mediaDescriptionCompat;
                this.f337795e = j;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f337794d + ", Id=" + this.f337795e + " }";
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f337794d.writeToParcel(parcel, i);
            parcel.writeLong(this.f337795e);
        }

        public QueueItem(Parcel parcel) {
            this.f337794d = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f337795e = parcel.readLong();
        }
    }
}
