package android.support.p427v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C103391a();

    /* renamed from: d */
    public final int f304926d;

    /* renamed from: e */
    public final long f304927e;

    /* renamed from: f */
    public final long f304928f;

    /* renamed from: g */
    public final float f304929g;

    /* renamed from: h */
    public final long f304930h;

    /* renamed from: i */
    public final int f304931i;

    /* renamed from: j */
    public final CharSequence f304932j;

    /* renamed from: n */
    public final long f304933n;

    /* renamed from: o */
    public List<CustomAction> f304934o;

    /* renamed from: p */
    public final long f304935p;

    /* renamed from: q */
    public final Bundle f304936q;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    public class C103391a implements Parcelable.Creator<PlaybackStateCompat> {
        public Object createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        public Object[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$b */
    public static class C103392b {
        /* renamed from: a */
        public static void m137097a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        /* renamed from: b */
        public static PlaybackState.CustomAction m137098b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        /* renamed from: c */
        public static PlaybackState m137099c(PlaybackState.Builder builder) {
            return builder.build();
        }

        /* renamed from: d */
        public static PlaybackState.Builder m137100d() {
            return new PlaybackState.Builder();
        }

        /* renamed from: e */
        public static PlaybackState.CustomAction.Builder m137101e(String str, CharSequence charSequence, int i) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i);
        }

        /* renamed from: f */
        public static String m137102f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        /* renamed from: g */
        public static long m137103g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        /* renamed from: h */
        public static long m137104h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        /* renamed from: i */
        public static long m137105i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        /* renamed from: j */
        public static List<PlaybackState.CustomAction> m137106j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        /* renamed from: k */
        public static CharSequence m137107k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        /* renamed from: l */
        public static Bundle m137108l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        /* renamed from: m */
        public static int m137109m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        /* renamed from: n */
        public static long m137110n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        /* renamed from: o */
        public static CharSequence m137111o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        /* renamed from: p */
        public static float m137112p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        /* renamed from: q */
        public static long m137113q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        /* renamed from: r */
        public static int m137114r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        /* renamed from: s */
        public static void m137115s(PlaybackState.Builder builder, long j) {
            builder.setActions(j);
        }

        /* renamed from: t */
        public static void m137116t(PlaybackState.Builder builder, long j) {
            builder.setActiveQueueItemId(j);
        }

        /* renamed from: u */
        public static void m137117u(PlaybackState.Builder builder, long j) {
            builder.setBufferedPosition(j);
        }

        /* renamed from: v */
        public static void m137118v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        /* renamed from: w */
        public static void m137119w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        /* renamed from: x */
        public static void m137120x(PlaybackState.Builder builder, int i, long j, float f, long j2) {
            builder.setState(i, j, f, j2);
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$c */
    public static class C103393c {
        /* renamed from: a */
        public static Bundle m137121a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        /* renamed from: b */
        public static void m137122b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f304926d = i;
        this.f304927e = j;
        this.f304928f = j2;
        this.f304929g = f;
        this.f304930h = j3;
        this.f304931i = i2;
        this.f304932j = charSequence;
        this.f304933n = j4;
        this.f304934o = new ArrayList(list);
        this.f304935p = j5;
        this.f304936q = bundle;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f304926d + ", position=" + this.f304927e + ", buffered position=" + this.f304928f + ", speed=" + this.f304929g + ", updated=" + this.f304933n + ", actions=" + this.f304930h + ", error code=" + this.f304931i + ", error message=" + this.f304932j + ", custom actions=" + this.f304934o + ", active item id=" + this.f304935p + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f304926d);
        parcel.writeLong(this.f304927e);
        parcel.writeFloat(this.f304929g);
        parcel.writeLong(this.f304933n);
        parcel.writeLong(this.f304928f);
        parcel.writeLong(this.f304930h);
        TextUtils.writeToParcel(this.f304932j, parcel, i);
        parcel.writeTypedList(this.f304934o);
        parcel.writeLong(this.f304935p);
        parcel.writeBundle(this.f304936q);
        parcel.writeInt(this.f304931i);
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C103390a();

        /* renamed from: d */
        public final String f304937d;

        /* renamed from: e */
        public final CharSequence f304938e;

        /* renamed from: f */
        public final int f304939f;

        /* renamed from: g */
        public final Bundle f304940g;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        public class C103390a implements Parcelable.Creator<CustomAction> {
            public Object createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            public Object[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f304937d = str;
            this.f304938e = charSequence;
            this.f304939f = i;
            this.f304940g = bundle;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f304938e + ", mIcon=" + this.f304939f + ", mExtras=" + this.f304940g;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f304937d);
            TextUtils.writeToParcel(this.f304938e, parcel, i);
            parcel.writeInt(this.f304939f);
            parcel.writeBundle(this.f304940g);
        }

        public CustomAction(Parcel parcel) {
            this.f304937d = parcel.readString();
            this.f304938e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f304939f = parcel.readInt();
            this.f304940g = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f304926d = parcel.readInt();
        this.f304927e = parcel.readLong();
        this.f304929g = parcel.readFloat();
        this.f304933n = parcel.readLong();
        this.f304928f = parcel.readLong();
        this.f304930h = parcel.readLong();
        this.f304932j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f304934o = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f304935p = parcel.readLong();
        this.f304936q = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f304931i = parcel.readInt();
    }
}
