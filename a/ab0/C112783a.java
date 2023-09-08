package ab0;

import bb0.C113157b;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ab0.a */
public final class C112783a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C113157b f337698d;

    /* renamed from: e */
    public final /* synthetic */ String f337699e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112783a(C113157b bVar, String str) {
        super(0);
        this.f337698d = bVar;
        this.f337699e = str;
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: a */
    public static final boolean m154285a(java.lang.String r8, bb0.C113157b r9, java.lang.String r10, bb0.C113157b r11) {
        /*
            bb0.c r0 = ab0.C112784b.f337701b
            java.lang.String r1 = r11.field_mediaId
            java.lang.String r2 = "mediaCache.field_mediaId"
            gy3.C87412m.m108593f(r1, r2)
            boolean r0 = r0.Ft0(r1)
            java.lang.String r1 = " cache:"
            java.lang.String r2 = " mediaId:"
            java.lang.String r3 = "Finder.MediaCacheLogic"
            r4 = 0
            if (r0 == 0) goto L_0x007a
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = ab0.C112784b.f337703d
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r0.readLock()
            int r6 = r0.getWriteHoldCount()
            if (r6 != 0) goto L_0x0027
            int r6 = r0.getReadHoldCount()
            goto L_0x0028
        L_0x0027:
            r6 = 0
        L_0x0028:
            r7 = 0
        L_0x0029:
            if (r7 >= r6) goto L_0x0031
            r5.unlock()
            int r7 = r7 + 1
            goto L_0x0029
        L_0x0031:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            bb0.c r7 = ab0.C112784b.f337701b     // Catch:{ all -> 0x006d }
            boolean r11 = r7.mo165663qq(r11)     // Catch:{ all -> 0x006d }
        L_0x003e:
            if (r4 >= r6) goto L_0x0046
            r5.lock()
            int r4 = r4 + 1
            goto L_0x003e
        L_0x0046:
            r0.unlock()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r10 = " update "
            r0.append(r10)
            r0.append(r11)
            r0.append(r2)
            r0.append(r8)
            r0.append(r1)
            r0.append(r9)
            java.lang.String r8 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)
            goto L_0x00d0
        L_0x006d:
            r8 = move-exception
        L_0x006e:
            if (r4 >= r6) goto L_0x0076
            r5.lock()
            int r4 = r4 + 1
            goto L_0x006e
        L_0x0076:
            r0.unlock()
            throw r8
        L_0x007a:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = ab0.C112784b.f337703d
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r0.readLock()
            int r6 = r0.getWriteHoldCount()
            if (r6 != 0) goto L_0x008b
            int r6 = r0.getReadHoldCount()
            goto L_0x008c
        L_0x008b:
            r6 = 0
        L_0x008c:
            r7 = 0
        L_0x008d:
            if (r7 >= r6) goto L_0x0095
            r5.unlock()
            int r7 = r7 + 1
            goto L_0x008d
        L_0x0095:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            bb0.c r7 = ab0.C112784b.f337701b     // Catch:{ all -> 0x00d1 }
            boolean r11 = r7.insert(r11)     // Catch:{ all -> 0x00d1 }
        L_0x00a2:
            if (r4 >= r6) goto L_0x00aa
            r5.lock()
            int r4 = r4 + 1
            goto L_0x00a2
        L_0x00aa:
            r0.unlock()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r10 = " insert "
            r0.append(r10)
            r0.append(r11)
            r0.append(r2)
            r0.append(r8)
            r0.append(r1)
            r0.append(r9)
            java.lang.String r8 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)
        L_0x00d0:
            return r11
        L_0x00d1:
            r8 = move-exception
        L_0x00d2:
            if (r4 >= r6) goto L_0x00da
            r5.lock()
            int r4 = r4 + 1
            goto L_0x00d2
        L_0x00da:
            r0.unlock()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ab0.C112783a.m154285a(java.lang.String, bb0.b, java.lang.String, bb0.b):boolean");
    }

    public Object invoke() {
        C113157b bVar = this.f337698d;
        if (bVar != null) {
            m154285a(this.f337699e, bVar, "syncMemoryCacheToDB from cache", bVar);
        } else {
            C112784b bVar2 = C112784b.f337700a;
            String str = this.f337699e;
            C113157b bVar3 = C112784b.f337702c.get(str);
            if (bVar3 != null) {
                m154285a(str, bVar, "syncMemoryCacheToDB from id", bVar3);
            } else {
                Log.m105928w("Finder.MediaCacheLogic", "syncMemoryCacheToDB noting for cache mediaId:" + str + " cache:" + bVar);
            }
        }
        return C13598b0.f38549a;
    }
}
