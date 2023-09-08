package t22;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import o90.C100301b;
import p823sg.C101611g;
import q90.C101062d;
import we3.C78592b;

@C86522b
/* renamed from: t22.u */
public class C101716u extends C86301e implements C78592b {

    /* renamed from: d */
    public C101611g<String, Bitmap> f297772d = new C100301b(20, C101716u.class);

    /* renamed from: Rr */
    public synchronized void mo108585Rr(String str) {
        Log.m105919d("MicroMsg.TrackAvatarCacheService", "clearCache, tag = %s", str);
        for (String str2 : ((C100301b) this.f297772d).snapshot().keySet()) {
            if (str2.startsWith(str)) {
                ((C100301b) this.f297772d).remove(str2);
            }
        }
    }

    public synchronized void om0(String str, Bitmap bitmap) {
        if (((C100301b) this.f297772d).get(str) != null) {
            Bitmap bitmap2 = (Bitmap) ((C100301b) this.f297772d).get(str);
            if (!bitmap2.isRecycled()) {
                Log.m105925i("MicroMsg.TrackAvatarCacheService", "bitmap recycle %s", bitmap2.toString());
                bitmap2.recycle();
            }
            ((C100301b) this.f297772d).remove(str);
        }
        ((C100301b) this.f297772d).put(str, bitmap);
        Log.m105919d("MicroMsg.TrackAvatarCacheService", "updateCache, tag = %s, cacheSize = %d", str, Integer.valueOf(((C101062d) this.f297772d).size()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap uf0(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ all -> 0x0020 }
            r1 = 0
            if (r0 == 0) goto L_0x000a
            monitor-exit(r2)
            return r1
        L_0x000a:
            sg.g<java.lang.String, android.graphics.Bitmap> r0 = r2.f297772d     // Catch:{ all -> 0x0020 }
            o90.b r0 = (o90.C100301b) r0     // Catch:{ all -> 0x0020 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0020 }
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch:{ all -> 0x0020 }
            if (r3 == 0) goto L_0x001e
            boolean r0 = r3.isRecycled()     // Catch:{ all -> 0x0020 }
            if (r0 != 0) goto L_0x001e
            monitor-exit(r2)
            return r3
        L_0x001e:
            monitor-exit(r2)
            return r1
        L_0x0020:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t22.C101716u.uf0(java.lang.String):android.graphics.Bitmap");
    }
}
