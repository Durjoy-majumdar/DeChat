package android.support.p427v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C112813a();

    /* renamed from: d */
    public final String f337778d;

    /* renamed from: e */
    public final CharSequence f337779e;

    /* renamed from: f */
    public final CharSequence f337780f;

    /* renamed from: g */
    public final CharSequence f337781g;

    /* renamed from: h */
    public final Bitmap f337782h;

    /* renamed from: i */
    public final Uri f337783i;

    /* renamed from: j */
    public final Bundle f337784j;

    /* renamed from: n */
    public final Uri f337785n;

    /* renamed from: o */
    public MediaDescription f337786o;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    public class C112813a implements Parcelable.Creator<MediaDescriptionCompat> {
        public Object createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.m154334a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        public Object[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    public static class C112814b {
        /* renamed from: a */
        public static MediaDescription m154335a(MediaDescription.Builder builder) {
            return builder.build();
        }

        /* renamed from: b */
        public static MediaDescription.Builder m154336b() {
            return new MediaDescription.Builder();
        }

        /* renamed from: c */
        public static CharSequence m154337c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        /* renamed from: d */
        public static Bundle m154338d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        /* renamed from: e */
        public static Bitmap m154339e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        /* renamed from: f */
        public static Uri m154340f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        /* renamed from: g */
        public static String m154341g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        /* renamed from: h */
        public static CharSequence m154342h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        /* renamed from: i */
        public static CharSequence m154343i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        /* renamed from: j */
        public static void m154344j(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        /* renamed from: k */
        public static void m154345k(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        /* renamed from: l */
        public static void m154346l(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        /* renamed from: m */
        public static void m154347m(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        /* renamed from: n */
        public static void m154348n(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        /* renamed from: o */
        public static void m154349o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        /* renamed from: p */
        public static void m154350p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$c */
    public static class C112815c {
        /* renamed from: a */
        public static Uri m154351a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        /* renamed from: b */
        public static void m154352b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f337778d = str;
        this.f337779e = charSequence;
        this.f337780f = charSequence2;
        this.f337781g = charSequence3;
        this.f337782h = bitmap;
        this.f337783i = uri;
        this.f337784j = bundle;
        this.f337785n = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p427v4.media.MediaDescriptionCompat m154334a(java.lang.Object r14) {
        /*
            r0 = 0
            if (r14 == 0) goto L_0x0068
            int r1 = android.os.Build.VERSION.SDK_INT
            android.media.MediaDescription r14 = (android.media.MediaDescription) r14
            java.lang.String r3 = android.support.p427v4.media.MediaDescriptionCompat.C112814b.m154341g(r14)
            java.lang.CharSequence r4 = android.support.p427v4.media.MediaDescriptionCompat.C112814b.m154343i(r14)
            java.lang.CharSequence r5 = android.support.p427v4.media.MediaDescriptionCompat.C112814b.m154342h(r14)
            java.lang.CharSequence r6 = android.support.p427v4.media.MediaDescriptionCompat.C112814b.m154337c(r14)
            android.graphics.Bitmap r7 = android.support.p427v4.media.MediaDescriptionCompat.C112814b.m154339e(r14)
            android.net.Uri r8 = android.support.p427v4.media.MediaDescriptionCompat.C112814b.m154340f(r14)
            android.os.Bundle r2 = android.support.p427v4.media.MediaDescriptionCompat.C112814b.m154338d(r14)
            if (r2 == 0) goto L_0x002e
            android.support.p427v4.media.session.MediaSessionCompat.m154359a(r2)
            r2.isEmpty()     // Catch:{ BadParcelableException -> 0x002c }
            goto L_0x002e
        L_0x002c:
            r2 = r0
        L_0x002e:
            java.lang.String r9 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x0039
            android.os.Parcelable r10 = r2.getParcelable(r9)
            android.net.Uri r10 = (android.net.Uri) r10
            goto L_0x003a
        L_0x0039:
            r10 = r0
        L_0x003a:
            if (r10 == 0) goto L_0x0053
            java.lang.String r11 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r12 = r2.containsKey(r11)
            if (r12 == 0) goto L_0x004d
            int r12 = r2.size()
            r13 = 2
            if (r12 != r13) goto L_0x004d
            r9 = r0
            goto L_0x0054
        L_0x004d:
            r2.remove(r9)
            r2.remove(r11)
        L_0x0053:
            r9 = r2
        L_0x0054:
            if (r10 == 0) goto L_0x0057
            goto L_0x0060
        L_0x0057:
            r2 = 23
            if (r1 < r2) goto L_0x005f
            android.net.Uri r0 = android.support.p427v4.media.MediaDescriptionCompat.C112815c.m154351a(r14)
        L_0x005f:
            r10 = r0
        L_0x0060:
            android.support.v4.media.MediaDescriptionCompat r0 = new android.support.v4.media.MediaDescriptionCompat
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.f337786o = r14
        L_0x0068:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p427v4.media.MediaDescriptionCompat.m154334a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f337779e + ", " + this.f337780f + ", " + this.f337781g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle;
        int i2 = Build.VERSION.SDK_INT;
        MediaDescription mediaDescription = this.f337786o;
        if (mediaDescription == null) {
            MediaDescription.Builder b = C112814b.m154336b();
            C112814b.m154348n(b, this.f337778d);
            C112814b.m154350p(b, this.f337779e);
            C112814b.m154349o(b, this.f337780f);
            C112814b.m154344j(b, this.f337781g);
            C112814b.m154346l(b, this.f337782h);
            C112814b.m154347m(b, this.f337783i);
            if (i2 >= 23 || this.f337785n == null) {
                C112814b.m154345k(b, this.f337784j);
            } else {
                if (this.f337784j == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                } else {
                    bundle = new Bundle(this.f337784j);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f337785n);
                C112814b.m154345k(b, bundle);
            }
            if (i2 >= 23) {
                C112815c.m154352b(b, this.f337785n);
            }
            mediaDescription = C112814b.m154335a(b);
            this.f337786o = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i);
    }
}
