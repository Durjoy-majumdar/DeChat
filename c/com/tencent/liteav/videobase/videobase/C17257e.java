package com.tencent.liteav.videobase.videobase;

import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.videobase.C17260g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.liteav.videobase.videobase.e */
public final class C17257e {

    /* renamed from: a */
    private final Map<C17253a, C17260g> f46651a = new HashMap();

    /* renamed from: b */
    private C17223e f46652b;

    /* renamed from: com.tencent.liteav.videobase.videobase.e$a */
    public interface C17258a {
        void onFrameConverted(int i, PixelFrame pixelFrame);
    }

    /* renamed from: a */
    public final void mo20260a(C17253a aVar, GLConstants.PixelBufferType pixelBufferType, GLConstants.PixelFormatType pixelFormatType, int i, C17258a aVar2) {
        C17260g gVar = this.f46651a.get(aVar);
        if (gVar == null) {
            gVar = new C17260g(aVar);
            C17223e eVar = this.f46652b;
            if (eVar != null) {
                gVar.mo20276a(eVar);
            }
            this.f46651a.put(aVar, gVar);
        }
        List<C17260g.C17262a> list = gVar.f46657e.get(pixelFormatType);
        if (list == null) {
            list = new ArrayList<>();
            gVar.f46657e.put(pixelFormatType, list);
        }
        for (C17260g.C17262a aVar3 : list) {
            if (aVar3.f46666b == i && aVar3.f46667c == aVar2) {
                return;
            }
        }
        list.add(new C17260g.C17262a(pixelBufferType, i, aVar2));
    }

    /* renamed from: a */
    public final void mo20257a(int i, C17258a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.f46651a.entrySet()) {
            ((C17260g) next.getValue()).mo20273a(i, aVar);
            if (!(!((C17260g) next.getValue()).f46657e.isEmpty())) {
                arrayList.add(next.getKey());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C17253a aVar2 = (C17253a) it.next();
            C17260g gVar = this.f46651a.get(aVar2);
            if (gVar != null) {
                gVar.mo20272a();
            }
            this.f46651a.remove(aVar2);
        }
    }

    /* renamed from: a */
    public final void mo20259a(C17223e eVar) {
        this.f46652b = eVar;
        for (C17260g a : this.f46651a.values()) {
            a.mo20276a(eVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00ec A[EDGE_INSN: B:85:0x00ec->B:37:0x00ec ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20258a(long r25, com.tencent.liteav.videobase.frame.C17222d r27) {
        /*
            r24 = this;
            r0 = r24
            r7 = r25
            java.util.Map<com.tencent.liteav.videobase.videobase.a, com.tencent.liteav.videobase.videobase.g> r1 = r0.f46651a
            int r1 = r1.size()
            if (r1 > 0) goto L_0x0013
            java.lang.String r1 = "FrameConverter"
            java.lang.String r2 = "process frame without SameParamsConverter."
            com.tencent.liteav.base.util.LiteavLog.m16905w(r1, r2)
        L_0x0013:
            java.util.Map<com.tencent.liteav.videobase.videobase.a, com.tencent.liteav.videobase.videobase.g> r1 = r0.f46651a
            java.util.Collection r1 = r1.values()
            java.util.Iterator r9 = r1.iterator()
        L_0x001d:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x01f5
            java.lang.Object r1 = r9.next()
            r10 = r1
            com.tencent.liteav.videobase.videobase.g r10 = (com.tencent.liteav.videobase.videobase.C17260g) r10
            boolean r1 = r10.f46660h
            if (r1 == 0) goto L_0x01f1
            int r1 = r27.mo20197b()
            com.tencent.liteav.videobase.videobase.a r2 = r10.f46656d
            int r2 = r2.f46643a
            if (r1 != r2) goto L_0x0053
            int r1 = r27.mo20198c()
            com.tencent.liteav.videobase.videobase.a r2 = r10.f46656d
            int r3 = r2.f46644b
            if (r1 != r3) goto L_0x0053
            com.tencent.liteav.videobase.utils.Rotation r1 = r2.f46645c
            com.tencent.liteav.videobase.utils.Rotation r3 = com.tencent.liteav.videobase.utils.Rotation.NORMAL
            if (r1 != r3) goto L_0x0053
            boolean r1 = r2.f46646d
            if (r1 != 0) goto L_0x0053
            r27.retain()
            r11 = r27
            r12 = r11
            goto L_0x00bd
        L_0x0053:
            com.tencent.liteav.videobase.frame.j r1 = r10.f46659g
            if (r1 != 0) goto L_0x0064
            com.tencent.liteav.videobase.frame.j r1 = new com.tencent.liteav.videobase.frame.j
            com.tencent.liteav.videobase.videobase.a r2 = r10.f46656d
            int r3 = r2.f46643a
            int r2 = r2.f46644b
            r1.<init>(r3, r2)
            r10.f46659g = r1
        L_0x0064:
            java.lang.Object r1 = com.tencent.liteav.videobase.utils.OpenGlUtils.getCurrentContext()
            r11 = r27
            com.tencent.liteav.videobase.frame.PixelFrame r1 = r11.mo20196a(r1)
            com.tencent.liteav.videobase.videobase.a r2 = r10.f46656d
            com.tencent.liteav.videobase.utils.Rotation r2 = r2.f46645c
            com.tencent.liteav.videobase.utils.Rotation r3 = com.tencent.liteav.videobase.utils.Rotation.ROTATION_90
            if (r2 == r3) goto L_0x008a
            com.tencent.liteav.videobase.utils.Rotation r3 = com.tencent.liteav.videobase.utils.Rotation.ROTATION_270
            if (r2 != r3) goto L_0x007b
            goto L_0x008a
        L_0x007b:
            int r2 = r27.mo20197b()
            r1.setWidth(r2)
            int r2 = r27.mo20198c()
            r1.setHeight(r2)
            goto L_0x0098
        L_0x008a:
            int r2 = r27.mo20198c()
            r1.setWidth(r2)
            int r2 = r27.mo20197b()
            r1.setHeight(r2)
        L_0x0098:
            com.tencent.liteav.videobase.videobase.a r2 = r10.f46656d
            com.tencent.liteav.videobase.utils.Rotation r2 = r2.f46645c
            r1.setRotation(r2)
            com.tencent.liteav.videobase.videobase.a r2 = r10.f46656d
            boolean r2 = r2.f46646d
            r1.setMirrorHorizontal(r2)
            com.tencent.liteav.videobase.frame.e r2 = r10.f46662j
            com.tencent.liteav.videobase.videobase.a r3 = r10.f46656d
            int r4 = r3.f46643a
            int r3 = r3.f46644b
            com.tencent.liteav.videobase.frame.d r2 = r2.mo20199a((int) r4, (int) r3)
            com.tencent.liteav.videobase.frame.j r3 = r10.f46659g
            com.tencent.liteav.videobase.base.GLConstants$GLScaleType r4 = com.tencent.liteav.videobase.base.GLConstants.GLScaleType.CENTER_CROP
            r3.mo20210a((com.tencent.liteav.videobase.frame.PixelFrame) r1, (com.tencent.liteav.videobase.base.GLConstants.GLScaleType) r4, (com.tencent.liteav.videobase.frame.C17222d) r2)
            r1.release()
            r12 = r2
        L_0x00bd:
            java.lang.Object r1 = com.tencent.liteav.videobase.utils.OpenGlUtils.getCurrentContext()
            com.tencent.liteav.videobase.frame.PixelFrame r1 = r12.mo20196a(r1)
            r10.mo20275a((com.tencent.liteav.videobase.frame.PixelFrame) r1, (long) r7)
            r1.release()
            com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r1 = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.RGBA
            com.tencent.liteav.videobase.frame.PixelFrame r1 = r10.mo20271a((long) r7, (com.tencent.liteav.videobase.frame.C17222d) r12, (com.tencent.liteav.videobase.base.GLConstants.PixelFormatType) r1)
            if (r1 == 0) goto L_0x00d6
            r1.release()
        L_0x00d6:
            r1 = -1
            r3 = 0
        L_0x00d8:
            com.tencent.liteav.videobase.base.GLConstants$PixelFormatType[] r4 = com.tencent.liteav.videobase.videobase.C17260g.f46653a
            int r5 = r4.length
            if (r3 >= r5) goto L_0x00ec
            java.util.Map<com.tencent.liteav.videobase.base.GLConstants$PixelFormatType, java.util.List<com.tencent.liteav.videobase.videobase.g$a>> r5 = r10.f46657e
            r6 = r4[r3]
            boolean r5 = r5.containsKey(r6)
            if (r5 == 0) goto L_0x00e9
            r1 = r3
            goto L_0x00ec
        L_0x00e9:
            int r3 = r3 + 1
            goto L_0x00d8
        L_0x00ec:
            if (r1 < 0) goto L_0x01ec
            int r6 = r12.mo20197b()
            int r5 = r12.mo20198c()
            com.tencent.liteav.videobase.frame.e r3 = r10.f46662j
            com.tencent.liteav.videobase.frame.d r3 = r3.mo20199a((int) r6, (int) r5)
            r13 = r4[r1]
            r15 = 0
            if (r13 != 0) goto L_0x0103
        L_0x0101:
            r14 = r15
            goto L_0x0151
        L_0x0103:
            java.util.Map<com.tencent.liteav.videobase.base.GLConstants$PixelFormatType, com.tencent.liteav.videobase.a.b> r14 = r10.f46658f
            java.lang.Object r14 = r14.get(r13)
            com.tencent.liteav.videobase.a.b r14 = (com.tencent.liteav.videobase.p309a.C17189b) r14
            if (r14 != 0) goto L_0x0151
            int[] r14 = com.tencent.liteav.videobase.videobase.C17260g.C172611.f46664a
            int r16 = r13.ordinal()
            r14 = r14[r16]
            r2 = 1
            if (r14 == r2) goto L_0x012c
            r2 = 2
            if (r14 == r2) goto L_0x0125
            r2 = 3
            if (r14 == r2) goto L_0x011f
            goto L_0x0101
        L_0x011f:
            com.tencent.liteav.videobase.d.h r2 = new com.tencent.liteav.videobase.d.h
            r2.<init>()
            goto L_0x012a
        L_0x0125:
            com.tencent.liteav.videobase.d.g r2 = new com.tencent.liteav.videobase.d.g
            r2.<init>()
        L_0x012a:
            r14 = r2
            goto L_0x0140
        L_0x012c:
            com.tencent.liteav.videobase.videobase.a r2 = r10.f46656d
            int r2 = r2.f46644b
            int r2 = r2 % 16
            if (r2 != 0) goto L_0x013a
            com.tencent.liteav.videobase.d.e r2 = new com.tencent.liteav.videobase.d.e
            r2.<init>()
            goto L_0x012a
        L_0x013a:
            com.tencent.liteav.videobase.d.f r2 = new com.tencent.liteav.videobase.d.f
            r2.<init>()
            goto L_0x012a
        L_0x0140:
            r14.initialize(r15)
            com.tencent.liteav.videobase.videobase.a r2 = r10.f46656d
            int r15 = r2.f46643a
            int r2 = r2.f46644b
            r14.onOutputSizeChanged(r15, r2)
            java.util.Map<com.tencent.liteav.videobase.base.GLConstants$PixelFormatType, com.tencent.liteav.videobase.a.b> r2 = r10.f46658f
            r2.put(r13, r14)
        L_0x0151:
            if (r14 == 0) goto L_0x01ec
            r2 = 0
            com.tencent.liteav.videobase.utils.OpenGlUtils.glViewport(r2, r2, r6, r5)
            int r2 = r12.mo20195a()
            java.nio.FloatBuffer r13 = r10.f46654b
            java.nio.FloatBuffer r15 = r10.f46655c
            r14.onDraw(r2, r3, r13, r15)
            r2 = r4[r1]
            com.tencent.liteav.videobase.frame.PixelFrame r19 = r10.mo20271a((long) r7, (com.tencent.liteav.videobase.frame.C17222d) r3, (com.tencent.liteav.videobase.base.GLConstants.PixelFormatType) r2)
            r3.release()
            com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r2 = r19.getPixelBufferType()
            com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r3 = com.tencent.liteav.videobase.base.GLConstants.PixelBufferType.BYTE_BUFFER
            if (r2 != r3) goto L_0x0178
            java.nio.ByteBuffer r2 = r19.getBuffer()
            goto L_0x017c
        L_0x0178:
            byte[] r2 = r19.getData()
        L_0x017c:
            r20 = r2
            int r1 = r1 + 1
            r4 = r1
        L_0x0181:
            com.tencent.liteav.videobase.base.GLConstants$PixelFormatType[] r1 = com.tencent.liteav.videobase.videobase.C17260g.f46653a
            int r2 = r1.length
            if (r4 >= r2) goto L_0x01e9
            r2 = r1[r4]
            com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r3 = com.tencent.liteav.videobase.base.GLConstants.PixelBufferType.BYTE_BUFFER
            int r21 = r10.mo20270a((com.tencent.liteav.videobase.base.GLConstants.PixelFormatType) r2, (com.tencent.liteav.videobase.base.GLConstants.PixelBufferType) r3)
            r2 = r1[r4]
            com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r13 = com.tencent.liteav.videobase.base.GLConstants.PixelBufferType.BYTE_ARRAY
            int r22 = r10.mo20270a((com.tencent.liteav.videobase.base.GLConstants.PixelFormatType) r2, (com.tencent.liteav.videobase.base.GLConstants.PixelBufferType) r13)
            if (r21 == 0) goto L_0x01a2
            com.tencent.liteav.videobase.frame.i r2 = r10.f46661i
            r1 = r1[r4]
            com.tencent.liteav.videobase.frame.PixelFrame r1 = r2.mo20206a(r6, r5, r3, r1)
        L_0x01a0:
            r2 = r1
            goto L_0x01ae
        L_0x01a2:
            if (r22 == 0) goto L_0x01ad
            com.tencent.liteav.videobase.frame.i r2 = r10.f46661i
            r1 = r1[r4]
            com.tencent.liteav.videobase.frame.PixelFrame r1 = r2.mo20206a(r6, r5, r13, r1)
            goto L_0x01a0
        L_0x01ad:
            r2 = 0
        L_0x01ae:
            if (r2 == 0) goto L_0x01df
            com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r13 = r19.getPixelFormatType()
            com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r15 = r2.getPixelFormatType()
            java.nio.ByteBuffer r16 = r2.getBuffer()
            r14 = r20
            r23 = 0
            r17 = r6
            r18 = r5
            com.tencent.liteav.videobase.utils.OpenGlUtils.convertYuvFormat(r13, r14, r15, r16, r17, r18)
            r10.mo20275a((com.tencent.liteav.videobase.frame.PixelFrame) r2, (long) r7)
            r1 = r10
            r17 = r2
            r2 = r25
            r13 = r4
            r4 = r17
            r14 = r5
            r5 = r21
            r15 = r6
            r6 = r22
            r1.mo20274a(r2, r4, r5, r6)
            r17.release()
            goto L_0x01e4
        L_0x01df:
            r13 = r4
            r14 = r5
            r15 = r6
            r23 = 0
        L_0x01e4:
            int r4 = r13 + 1
            r5 = r14
            r6 = r15
            goto L_0x0181
        L_0x01e9:
            r19.release()
        L_0x01ec:
            r12.release()
            goto L_0x001d
        L_0x01f1:
            r11 = r27
            goto L_0x001d
        L_0x01f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videobase.videobase.C17257e.mo20258a(long, com.tencent.liteav.videobase.frame.d):void");
    }

    /* renamed from: a */
    public final void mo20256a() {
        for (C17260g a : this.f46651a.values()) {
            a.mo20272a();
        }
    }
}
