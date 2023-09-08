package p345h7;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import p294b7.C16743g;
import p294b7.C16750m;
import p333e8.C20549u;
import p345h7.C20923v;

/* renamed from: h7.t */
public final class C20919t implements C20916q {

    /* renamed from: a */
    public C20549u f59248a;

    /* renamed from: b */
    public C16750m f59249b;

    /* renamed from: c */
    public boolean f59250c;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004a, code lost:
        if (r5 != com.tencent.p014mm.sdk.platformtools.MAlarmHandler.NEXT_FIRE_INTERVAL) goto L_0x004e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo32630a(p333e8.C20541m r12) {
        /*
            r11 = this;
            boolean r0 = r11.f59250c
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 != 0) goto L_0x0029
            e8.u r0 = r11.f59248a
            long r3 = r0.mo32132c()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0014
            return
        L_0x0014:
            b7.m r0 = r11.f59249b
            r3 = 0
            e8.u r4 = r11.f59248a
            long r4 = r4.mo32132c()
            java.lang.String r6 = "application/x-scte35"
            com.google.android.exoplayer2.Format r3 = com.google.android.exoplayer2.Format.m16644e(r3, r6, r4)
            r0.mo17741a(r3)
            r0 = 1
            r11.f59250c = r0
        L_0x0029:
            int r0 = r12.f57811c
            int r3 = r12.f57810b
            int r8 = r0 - r3
            b7.m r0 = r11.f59249b
            r0.mo17742b(r12, r8)
            b7.m r4 = r11.f59249b
            e8.u r12 = r11.f59248a
            long r5 = r12.f57834c
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0041
            long r1 = r12.f57834c
            goto L_0x004d
        L_0x0041:
            long r5 = r12.f57832a
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r12 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r12 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r5 = r1
        L_0x004e:
            r7 = 1
            r9 = 0
            r10 = 0
            r4.mo17744d(r5, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p345h7.C20919t.mo32630a(e8.m):void");
    }

    /* renamed from: c */
    public void mo32631c(C20549u uVar, C16743g gVar, C20923v.C20927d dVar) {
        this.f59248a = uVar;
        dVar.mo32634a();
        dVar.mo32635b();
        C16750m o = gVar.mo17752o(dVar.f59280d, 4);
        this.f59249b = o;
        dVar.mo32635b();
        o.mo17741a(Format.m16645f(dVar.f59281e, MimeTypes.APPLICATION_SCTE35, (String) null, -1, (DrmInitData) null));
    }
}
