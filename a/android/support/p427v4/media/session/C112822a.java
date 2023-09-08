package android.support.p427v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.support.p427v4.media.MediaMetadataCompat;
import android.support.p427v4.media.session.MediaSessionCompat;
import java.util.List;

/* renamed from: android.support.v4.media.session.a */
public interface C112822a extends IInterface {

    /* renamed from: android.support.v4.media.session.a$a */
    public static abstract class C112823a extends Binder implements C112822a {
        public C112823a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.support.v4.media.MediaMetadataCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: android.support.v4.media.session.ParcelableVolumeInfo} */
        /* JADX WARNING: type inference failed for: r0v1 */
        /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.CharSequence] */
        /* JADX WARNING: type inference failed for: r0v14 */
        /* JADX WARNING: type inference failed for: r0v15 */
        /* JADX WARNING: type inference failed for: r0v16 */
        /* JADX WARNING: type inference failed for: r0v17 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
            /*
                r3 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "android.support.v4.media.session.IMediaControllerCallback"
                if (r4 == r0) goto L_0x0106
                r0 = 0
                switch(r4) {
                    case 1: goto L_0x00e6;
                    case 2: goto L_0x00df;
                    case 3: goto L_0x00c2;
                    case 4: goto L_0x00ac;
                    case 5: goto L_0x009f;
                    case 6: goto L_0x0089;
                    case 7: goto L_0x0073;
                    case 8: goto L_0x005d;
                    case 9: goto L_0x004b;
                    case 10: goto L_0x0044;
                    case 11: goto L_0x0032;
                    case 12: goto L_0x0020;
                    case 13: goto L_0x0011;
                    default: goto L_0x000c;
                }
            L_0x000c:
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L_0x0011:
                r5.enforceInterface(r2)
                r4 = r3
                android.support.v4.media.session.c$b r4 = (android.support.p427v4.media.session.C112827c.C112829b) r4
                java.lang.ref.WeakReference<android.support.v4.media.session.c> r4 = r4.f337809d
                java.lang.Object r4 = r4.get()
                android.support.v4.media.session.c r4 = (android.support.p427v4.media.session.C112827c) r4
                return r1
            L_0x0020:
                r5.enforceInterface(r2)
                r5.readInt()
                r4 = r3
                android.support.v4.media.session.c$b r4 = (android.support.p427v4.media.session.C112827c.C112829b) r4
                java.lang.ref.WeakReference<android.support.v4.media.session.c> r4 = r4.f337809d
                java.lang.Object r4 = r4.get()
                android.support.v4.media.session.c r4 = (android.support.p427v4.media.session.C112827c) r4
                return r1
            L_0x0032:
                r5.enforceInterface(r2)
                r5.readInt()
                r4 = r3
                android.support.v4.media.session.c$b r4 = (android.support.p427v4.media.session.C112827c.C112829b) r4
                java.lang.ref.WeakReference<android.support.v4.media.session.c> r4 = r4.f337809d
                java.lang.Object r4 = r4.get()
                android.support.v4.media.session.c r4 = (android.support.p427v4.media.session.C112827c) r4
                return r1
            L_0x0044:
                r5.enforceInterface(r2)
                r5.readInt()
                return r1
            L_0x004b:
                r5.enforceInterface(r2)
                r5.readInt()
                r4 = r3
                android.support.v4.media.session.c$b r4 = (android.support.p427v4.media.session.C112827c.C112829b) r4
                java.lang.ref.WeakReference<android.support.v4.media.session.c> r4 = r4.f337809d
                java.lang.Object r4 = r4.get()
                android.support.v4.media.session.c r4 = (android.support.p427v4.media.session.C112827c) r4
                return r1
            L_0x005d:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x006f
                android.os.Parcelable$Creator<android.support.v4.media.session.ParcelableVolumeInfo> r4 = android.support.p427v4.media.session.ParcelableVolumeInfo.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.support.v4.media.session.ParcelableVolumeInfo r0 = (android.support.p427v4.media.session.ParcelableVolumeInfo) r0
            L_0x006f:
                r3.mo164601ZC(r0)
                return r1
            L_0x0073:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0085
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0085:
                r3.mo164602bF(r0)
                return r1
            L_0x0089:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x009b
                android.os.Parcelable$Creator r4 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            L_0x009b:
                r3.Rq0(r0)
                return r1
            L_0x009f:
                r5.enforceInterface(r2)
                android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$QueueItem> r4 = android.support.p427v4.media.session.MediaSessionCompat.QueueItem.CREATOR
                java.util.ArrayList r4 = r5.createTypedArrayList(r4)
                r3.mo164599RQ(r4)
                return r1
            L_0x00ac:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00be
                android.os.Parcelable$Creator<android.support.v4.media.MediaMetadataCompat> r4 = android.support.p427v4.media.MediaMetadataCompat.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.support.v4.media.MediaMetadataCompat r0 = (android.support.p427v4.media.MediaMetadataCompat) r0
            L_0x00be:
                r3.mo164603qy(r0)
                return r1
            L_0x00c2:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00d3
                android.os.Parcelable$Creator<android.support.v4.media.session.PlaybackStateCompat> r4 = android.support.p427v4.media.session.PlaybackStateCompat.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                android.support.v4.media.session.PlaybackStateCompat r4 = (android.support.p427v4.media.session.PlaybackStateCompat) r4
            L_0x00d3:
                r4 = r3
                android.support.v4.media.session.c$b r4 = (android.support.p427v4.media.session.C112827c.C112829b) r4
                java.lang.ref.WeakReference<android.support.v4.media.session.c> r4 = r4.f337809d
                java.lang.Object r4 = r4.get()
                android.support.v4.media.session.c r4 = (android.support.p427v4.media.session.C112827c) r4
                return r1
            L_0x00df:
                r5.enforceInterface(r2)
                r3.mo164604rU()
                return r1
            L_0x00e6:
                r5.enforceInterface(r2)
                r5.readString()
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00fa
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                android.os.Bundle r4 = (android.os.Bundle) r4
            L_0x00fa:
                r4 = r3
                android.support.v4.media.session.c$b r4 = (android.support.p427v4.media.session.C112827c.C112829b) r4
                java.lang.ref.WeakReference<android.support.v4.media.session.c> r4 = r4.f337809d
                java.lang.Object r4 = r4.get()
                android.support.v4.media.session.c r4 = (android.support.p427v4.media.session.C112827c) r4
                return r1
            L_0x0106:
                r6.writeString(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p427v4.media.session.C112822a.C112823a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: RQ */
    void mo164599RQ(List<MediaSessionCompat.QueueItem> list);

    void Rq0(CharSequence charSequence);

    /* renamed from: ZC */
    void mo164601ZC(ParcelableVolumeInfo parcelableVolumeInfo);

    /* renamed from: bF */
    void mo164602bF(Bundle bundle);

    /* renamed from: qy */
    void mo164603qy(MediaMetadataCompat mediaMetadataCompat);

    /* renamed from: rU */
    void mo164604rU();
}
