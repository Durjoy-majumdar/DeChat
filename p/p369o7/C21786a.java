package p369o7;

import p333e8.C20540l;
import p333e8.C20541m;
import p333e8.C20549u;
import p355l7.C21392a;

/* renamed from: o7.a */
public final class C21786a implements C21392a {

    /* renamed from: a */
    public final C20541m f61741a = new C20541m();

    /* renamed from: b */
    public final C20540l f61742b = new C20540l();

    /* renamed from: c */
    public C20549u f61743c;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.google.android.exoplayer2.metadata.Metadata$Entry[]} */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v24 */
    /* JADX WARNING: type inference failed for: r6v25 */
    /* JADX WARNING: type inference failed for: r8v9, types: [com.google.android.exoplayer2.metadata.scte35.PrivateCommand] */
    /* JADX WARNING: type inference failed for: r6v26 */
    /* JADX WARNING: type inference failed for: r18v9, types: [com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.metadata.Metadata mo33521a(p355l7.C21395c r52) {
        /*
            r51 = this;
            r0 = r51
            r1 = r52
            e8.u r2 = r0.f61743c
            if (r2 == 0) goto L_0x0012
            long r3 = r1.f60526i
            long r5 = r2.mo32132c()
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0023
        L_0x0012:
            e8.u r2 = new e8.u
            long r3 = r1.f67261g
            r2.<init>(r3)
            r0.f61743c = r2
            long r3 = r1.f67261g
            long r5 = r1.f60526i
            long r3 = r3 - r5
            r2.mo32130a(r3)
        L_0x0023:
            java.nio.ByteBuffer r1 = r1.f67260f
            byte[] r2 = r1.array()
            int r1 = r1.limit()
            e8.m r3 = r0.f61741a
            r3.mo32111v(r2, r1)
            e8.l r3 = r0.f61742b
            r3.f57805a = r2
            r2 = 0
            r3.f57806b = r2
            r3.f57807c = r2
            r3.f57808d = r1
            r1 = 39
            r3.mo32089f(r1)
            e8.l r1 = r0.f61742b
            r3 = 1
            int r1 = r1.mo32087d(r3)
            long r4 = (long) r1
            r1 = 32
            long r4 = r4 << r1
            e8.l r6 = r0.f61742b
            int r6 = r6.mo32087d(r1)
            long r6 = (long) r6
            long r12 = r4 | r6
            e8.l r4 = r0.f61742b
            r5 = 20
            r4.mo32089f(r5)
            e8.l r4 = r0.f61742b
            r5 = 12
            int r4 = r4.mo32087d(r5)
            e8.l r5 = r0.f61742b
            r6 = 8
            int r5 = r5.mo32087d(r6)
            r6 = 0
            e8.m r7 = r0.f61741a
            r8 = 14
            r7.mo32114y(r8)
            if (r5 == 0) goto L_0x0289
            r7 = 255(0xff, float:3.57E-43)
            if (r5 == r7) goto L_0x0274
            r4 = 4
            r14 = 128(0x80, double:6.32E-322)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 == r4) goto L_0x0181
            r4 = 5
            if (r5 == r4) goto L_0x00a1
            r1 = 6
            if (r5 == r1) goto L_0x008d
            goto L_0x028e
        L_0x008d:
            e8.m r1 = r0.f61741a
            e8.u r4 = r0.f61743c
            long r5 = com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand.m16656a(r1, r12)
            long r7 = r4.mo32131b(r5)
            com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand r1 = new com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand
            r1.<init>(r5, r7)
            r6 = r1
            goto L_0x028e
        L_0x00a1:
            e8.m r4 = r0.f61741a
            e8.u r5 = r0.f61743c
            long r19 = r4.mo32104o()
            int r6 = r4.mo32103n()
            r6 = r6 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x00b4
            r21 = 1
            goto L_0x00b6
        L_0x00b4:
            r21 = 0
        L_0x00b6:
            java.util.List r6 = java.util.Collections.emptyList()
            if (r21 != 0) goto L_0x015e
            int r11 = r4.mo32103n()
            r3 = r11 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x00c6
            r3 = 1
            goto L_0x00c7
        L_0x00c6:
            r3 = 0
        L_0x00c7:
            r18 = r11 & 64
            if (r18 == 0) goto L_0x00ce
            r18 = 1
            goto L_0x00d0
        L_0x00ce:
            r18 = 0
        L_0x00d0:
            r22 = r11 & 32
            if (r22 == 0) goto L_0x00d7
            r22 = 1
            goto L_0x00d9
        L_0x00d7:
            r22 = 0
        L_0x00d9:
            r11 = r11 & 16
            if (r11 == 0) goto L_0x00df
            r11 = 1
            goto L_0x00e0
        L_0x00df:
            r11 = 0
        L_0x00e0:
            if (r18 == 0) goto L_0x00e9
            if (r11 != 0) goto L_0x00e9
            long r23 = com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand.m16656a(r4, r12)
            goto L_0x00eb
        L_0x00e9:
            r23 = r16
        L_0x00eb:
            if (r18 != 0) goto L_0x011c
            int r6 = r4.mo32103n()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r6)
            r1 = 0
        L_0x00f7:
            if (r1 >= r6) goto L_0x011b
            int r27 = r4.mo32103n()
            if (r11 != 0) goto L_0x0106
            long r28 = com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand.m16656a(r4, r12)
            r7 = r28
            goto L_0x0108
        L_0x0106:
            r7 = r16
        L_0x0108:
            com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$b r9 = new com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$b
            long r30 = r5.mo32131b(r7)
            r26 = r9
            r28 = r7
            r26.<init>(r27, r28, r30)
            r2.add(r9)
            int r1 = r1 + 1
            goto L_0x00f7
        L_0x011b:
            r6 = r2
        L_0x011c:
            if (r22 == 0) goto L_0x013c
            int r1 = r4.mo32103n()
            long r1 = (long) r1
            long r7 = r1 & r14
            r9 = 0
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 == 0) goto L_0x012d
            r7 = 1
            goto L_0x012e
        L_0x012d:
            r7 = 0
        L_0x012e:
            r8 = 1
            long r1 = r1 & r8
            r8 = 32
            long r1 = r1 << r8
            long r8 = r4.mo32104o()
            long r1 = r1 | r8
            r16 = r1
            goto L_0x013d
        L_0x013c:
            r7 = 0
        L_0x013d:
            int r1 = r4.mo32108s()
            int r2 = r4.mo32103n()
            int r4 = r4.mo32103n()
            r33 = r1
            r34 = r2
            r22 = r3
            r35 = r4
            r29 = r6
            r30 = r7
            r31 = r16
            r1 = r23
            r24 = r11
            r23 = r18
            goto L_0x0172
        L_0x015e:
            r29 = r6
            r1 = r16
            r31 = r1
            r22 = 0
            r23 = 0
            r24 = 0
            r30 = 0
            r33 = 0
            r34 = 0
            r35 = 0
        L_0x0172:
            com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand r6 = new com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand
            r18 = r6
            long r27 = r5.mo32131b(r1)
            r25 = r1
            r18.<init>(r19, r21, r22, r23, r24, r25, r27, r29, r30, r31, r33, r34, r35)
            goto L_0x028e
        L_0x0181:
            e8.m r1 = r0.f61741a
            int r2 = r1.mo32103n()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r4 = 0
        L_0x018d:
            if (r4 >= r2) goto L_0x026e
            long r37 = r1.mo32104o()
            int r5 = r1.mo32103n()
            r5 = r5 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x019e
            r39 = 1
            goto L_0x01a0
        L_0x019e:
            r39 = 0
        L_0x01a0:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            if (r39 != 0) goto L_0x0242
            int r6 = r1.mo32103n()
            r7 = r6 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x01b1
            r7 = 1
            goto L_0x01b2
        L_0x01b1:
            r7 = 0
        L_0x01b2:
            r8 = r6 & 64
            if (r8 == 0) goto L_0x01b8
            r8 = 1
            goto L_0x01b9
        L_0x01b8:
            r8 = 0
        L_0x01b9:
            r6 = r6 & 32
            if (r6 == 0) goto L_0x01bf
            r6 = 1
            goto L_0x01c0
        L_0x01bf:
            r6 = 0
        L_0x01c0:
            if (r8 == 0) goto L_0x01c7
            long r9 = r1.mo32104o()
            goto L_0x01c9
        L_0x01c7:
            r9 = r16
        L_0x01c9:
            if (r8 != 0) goto L_0x01f4
            int r5 = r1.mo32103n()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r5)
            r12 = 0
        L_0x01d5:
            if (r12 >= r5) goto L_0x01f0
            int r13 = r1.mo32103n()
            long r14 = r1.mo32104o()
            r20 = r2
            com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$b r2 = new com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$b
            r2.<init>(r13, r14)
            r11.add(r2)
            int r12 = r12 + 1
            r2 = r20
            r14 = 128(0x80, double:6.32E-322)
            goto L_0x01d5
        L_0x01f0:
            r20 = r2
            r5 = r11
            goto L_0x01f6
        L_0x01f4:
            r20 = r2
        L_0x01f6:
            if (r6 == 0) goto L_0x0218
            int r2 = r1.mo32103n()
            long r11 = (long) r2
            r13 = 128(0x80, double:6.32E-322)
            long r18 = r11 & r13
            r21 = 0
            int r2 = (r18 > r21 ? 1 : (r18 == r21 ? 0 : -1))
            if (r2 == 0) goto L_0x0209
            r2 = 1
            goto L_0x020a
        L_0x0209:
            r2 = 0
        L_0x020a:
            r18 = 1
            long r11 = r11 & r18
            r6 = 32
            long r11 = r11 << r6
            long r23 = r1.mo32104o()
            long r11 = r11 | r23
            goto L_0x0223
        L_0x0218:
            r6 = 32
            r13 = 128(0x80, double:6.32E-322)
            r18 = 1
            r21 = 0
            r11 = r16
            r2 = 0
        L_0x0223:
            int r15 = r1.mo32108s()
            int r23 = r1.mo32103n()
            int r24 = r1.mo32103n()
            r45 = r2
            r42 = r5
            r40 = r7
            r41 = r8
            r43 = r9
            r46 = r11
            r48 = r15
            r49 = r23
            r50 = r24
            goto L_0x025d
        L_0x0242:
            r20 = r2
            r13 = r14
            r6 = 32
            r18 = 1
            r21 = 0
            r42 = r5
            r43 = r16
            r46 = r43
            r40 = 0
            r41 = 0
            r45 = 0
            r48 = 0
            r49 = 0
            r50 = 0
        L_0x025d:
            com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$c r2 = new com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$c
            r36 = r2
            r36.<init>(r37, r39, r40, r41, r42, r43, r45, r46, r48, r49, r50)
            r3.add(r2)
            int r4 = r4 + 1
            r14 = r13
            r2 = r20
            goto L_0x018d
        L_0x026e:
            com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand r6 = new com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand
            r6.<init>(r3)
            goto L_0x028e
        L_0x0274:
            e8.m r1 = r0.f61741a
            long r9 = r1.mo32104o()
            int r4 = r4 + -4
            byte[] r11 = new byte[r4]
            r2 = 0
            r1.mo32091b(r11, r2, r4)
            com.google.android.exoplayer2.metadata.scte35.PrivateCommand r6 = new com.google.android.exoplayer2.metadata.scte35.PrivateCommand
            r8 = r6
            r8.<init>(r9, r11, r12)
            goto L_0x028e
        L_0x0289:
            com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand r6 = new com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand
            r6.<init>()
        L_0x028e:
            if (r6 != 0) goto L_0x0299
            com.google.android.exoplayer2.metadata.Metadata r1 = new com.google.android.exoplayer2.metadata.Metadata
            r2 = 0
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r2 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r2]
            r1.<init>((com.google.android.exoplayer2.metadata.Metadata.Entry[]) r2)
            goto L_0x02a4
        L_0x0299:
            r2 = 0
            com.google.android.exoplayer2.metadata.Metadata r1 = new com.google.android.exoplayer2.metadata.Metadata
            r3 = 1
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r3 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r3]
            r3[r2] = r6
            r1.<init>((com.google.android.exoplayer2.metadata.Metadata.Entry[]) r3)
        L_0x02a4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p369o7.C21786a.mo33521a(l7.c):com.google.android.exoplayer2.metadata.Metadata");
    }
}
