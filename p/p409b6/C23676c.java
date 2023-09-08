package p409b6;

import android.os.Handler;
import android.os.Message;
import android.os.Parcel;
import com.appaac.haptic.sync.VibrationPattern;
import p288a6.C23610a;

/* renamed from: b6.c */
public class C23676c {

    /* renamed from: a */
    public long f67860a = -1;

    /* renamed from: b */
    public Handler f67861b;

    /* renamed from: c */
    public C23675b f67862c;

    /* renamed from: d */
    public long f67863d;

    public C23676c(Handler handler, String str, C23610a aVar) {
        this.f67861b = handler;
        this.f67862c = new C23675b(str, aVar);
    }

    /* renamed from: a */
    public void mo37212a(long j, long j2) {
        synchronized (this) {
            mo37214c(j, j2);
        }
        mo37213b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d A[Catch:{ Exception -> 0x00db }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e A[Catch:{ Exception -> 0x00db }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo37213b() {
        /*
            r12 = this;
            b6.b r0 = r12.f67862c     // Catch:{ Exception -> 0x00db }
            long r0 = r0.mo37211b()     // Catch:{ Exception -> 0x00db }
            r2 = -1
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0027
            long r2 = r12.f67860a     // Catch:{ Exception -> 0x00db }
            long r2 = r0 - r2
            r5 = 20
            long r2 = r2 - r5
            android.os.Handler r5 = r12.f67861b     // Catch:{ Exception -> 0x00db }
            r6 = 100
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x00db }
            android.os.Message r0 = r5.obtainMessage(r6, r4, r4, r0)     // Catch:{ Exception -> 0x00db }
            android.os.Handler r1 = r12.f67861b     // Catch:{ Exception -> 0x00db }
            r1.sendMessageDelayed(r0, r2)     // Catch:{ Exception -> 0x00db }
            goto L_0x00db
        L_0x0027:
            android.os.Handler r0 = r12.f67861b     // Catch:{ Exception -> 0x00db }
            r1 = 102(0x66, float:1.43E-43)
            long r5 = r12.f67863d     // Catch:{ Exception -> 0x00db }
            b6.b r7 = r12.f67862c     // Catch:{ Exception -> 0x00db }
            long r8 = r7.mo37211b()     // Catch:{ Exception -> 0x00db }
            r10 = 1
            int r11 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r11 != 0) goto L_0x0054
            z5.a r2 = r7.f67859f     // Catch:{ Exception -> 0x00db }
            boolean r2 = p288a6.C23610a.m28204a(r2)     // Catch:{ Exception -> 0x00db }
            if (r2 == 0) goto L_0x0054
            z5.a r2 = r7.f67859f     // Catch:{ Exception -> 0x00db }
            boolean r3 = p288a6.C23610a.m28204a(r2)     // Catch:{ Exception -> 0x00db }
            if (r3 == 0) goto L_0x004f
            java.util.ArrayList<z5.c> r2 = r2.f74226b     // Catch:{ Exception -> 0x00db }
            int r2 = r2.size()     // Catch:{ Exception -> 0x00db }
            goto L_0x0050
        L_0x004f:
            r2 = -1
        L_0x0050:
            if (r10 != r2) goto L_0x0054
            r2 = 1
            goto L_0x0055
        L_0x0054:
            r2 = 0
        L_0x0055:
            java.lang.String r3 = r7.f67857d     // Catch:{ Exception -> 0x00db }
            int r3 = p392w5.C26424f.m34027i(r3)     // Catch:{ Exception -> 0x00db }
            if (r10 != r3) goto L_0x006e
            java.lang.String r2 = r7.f67857d     // Catch:{ Exception -> 0x00db }
            y5.a r2 = p392w5.C26424f.m34023e(r2)     // Catch:{ Exception -> 0x00db }
            boolean r3 = p288a6.C23610a.m28204a(r2)     // Catch:{ Exception -> 0x00db }
            if (r3 == 0) goto L_0x00d6
            int r4 = r2.getDuration()     // Catch:{ Exception -> 0x00db }
            goto L_0x00d6
        L_0x006e:
            r8 = 2
            if (r8 != r3) goto L_0x00d6
            if (r2 == 0) goto L_0x008b
            z5.a r2 = r7.f67859f     // Catch:{ Exception -> 0x00db }
            boolean r3 = p288a6.C23610a.m28204a(r2)     // Catch:{ Exception -> 0x00db }
            if (r3 == 0) goto L_0x0080
            java.util.ArrayList<z5.c> r2 = r2.f74226b     // Catch:{ Exception -> 0x00db }
            r2.size()     // Catch:{ Exception -> 0x00db }
        L_0x0080:
            r7.mo37211b()     // Catch:{ Exception -> 0x00db }
            z5.a r2 = r7.f67859f     // Catch:{ Exception -> 0x00db }
            p392w5.C26424f.m34020b(r2)     // Catch:{ Exception -> 0x00db }
            z5.a r2 = r7.f67859f     // Catch:{ Exception -> 0x00db }
            goto L_0x0091
        L_0x008b:
            java.lang.String r2 = r7.f67857d     // Catch:{ Exception -> 0x00db }
            z5.a r2 = p392w5.C26424f.m34024f(r2)     // Catch:{ Exception -> 0x00db }
        L_0x0091:
            boolean r3 = p288a6.C23610a.m28204a(r2)     // Catch:{ Exception -> 0x00db }
            if (r3 == 0) goto L_0x00d6
            java.util.ArrayList<z5.c> r2 = r2.f74226b     // Catch:{ Exception -> 0x00d6 }
            int r3 = r2.size()     // Catch:{ Exception -> 0x00d6 }
            int r3 = r3 - r10
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x00d6 }
            z5.c r2 = (p424z5.C26656c) r2     // Catch:{ Exception -> 0x00d6 }
            java.util.ArrayList<x5.e> r2 = r2.f74228b     // Catch:{ Exception -> 0x00d6 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x00d6 }
            r3 = 0
        L_0x00ab:
            boolean r7 = r2.hasNext()     // Catch:{ Exception -> 0x00d6 }
            if (r7 == 0) goto L_0x00d5
            java.lang.Object r7 = r2.next()     // Catch:{ Exception -> 0x00d6 }
            x5.e r7 = (p421x5.C26536e) r7     // Catch:{ Exception -> 0x00d6 }
            x5.b r8 = r7.f73838a     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r8 = r8.f73830a     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r9 = "continuous"
            boolean r8 = r8.equals(r9)     // Catch:{ Exception -> 0x00d6 }
            if (r8 == 0) goto L_0x00cb
            x5.b r7 = r7.f73838a     // Catch:{ Exception -> 0x00d6 }
            int r8 = r7.f73831b     // Catch:{ Exception -> 0x00d6 }
            int r7 = r7.f73832c     // Catch:{ Exception -> 0x00d6 }
            int r8 = r8 + r7
            goto L_0x00d1
        L_0x00cb:
            x5.b r7 = r7.f73838a     // Catch:{ Exception -> 0x00d6 }
            int r7 = r7.f73831b     // Catch:{ Exception -> 0x00d6 }
            int r8 = r7 + 22
        L_0x00d1:
            if (r8 <= r3) goto L_0x00ab
            r3 = r8
            goto L_0x00ab
        L_0x00d5:
            r4 = r3
        L_0x00d6:
            long r2 = (long) r4
            long r5 = r5 + r2
            r0.sendEmptyMessageDelayed(r1, r5)     // Catch:{ Exception -> 0x00db }
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p409b6.C23676c.mo37213b():void");
    }

    /* renamed from: c */
    public void mo37214c(long j, long j2) {
        try {
            VibrationPattern a = this.f67862c.mo37210a(j2);
            if (a != null && !a.f68204d.isEmpty()) {
                Parcel obtain = Parcel.obtain();
                a.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                Message obtainMessage = this.f67861b.obtainMessage(101, 0, 0, obtain);
                long j3 = 0;
                if (j2 <= j) {
                    this.f67861b.sendMessage(obtainMessage);
                    this.f67863d = 0;
                    return;
                }
                long j4 = j2 - j;
                if (j4 > 20) {
                    j3 = j4 - 20;
                }
                this.f67863d = j3;
                this.f67861b.sendMessageDelayed(obtainMessage, j3);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
