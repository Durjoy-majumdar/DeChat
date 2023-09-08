package com.tencent.liteav.videoproducer.producer;

import android.util.LongSparseArray;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;

/* renamed from: com.tencent.liteav.videoproducer.producer.e */
public final class C17602e {

    /* renamed from: a */
    public final LongSparseArray<C17603a> f47880a = new LongSparseArray<>();

    /* renamed from: b */
    public long f47881b = -1;

    /* renamed from: c */
    public CaptureSourceInterface.SourceType f47882c = CaptureSourceInterface.SourceType.NONE;

    /* renamed from: d */
    public Rotation f47883d = Rotation.NORMAL;

    /* renamed from: a */
    public final void mo20921a(CaptureSourceInterface.SourceType sourceType) {
        if (sourceType == null) {
            sourceType = CaptureSourceInterface.SourceType.NONE;
        }
        this.f47882c = sourceType;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017 A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo20922b(long r3) {
        /*
            r2 = this;
            android.util.LongSparseArray<com.tencent.liteav.videoproducer.producer.e$a> r0 = r2.f47880a
            java.lang.Object r3 = r0.get(r3)
            com.tencent.liteav.videoproducer.producer.e$a r3 = (com.tencent.liteav.videoproducer.producer.C17602e.C17603a) r3
            r4 = 0
            if (r3 != 0) goto L_0x000c
            return r4
        L_0x000c:
            boolean r0 = r3.f47884a
            r1 = 1
            if (r0 == 0) goto L_0x0019
            com.tencent.liteav.videobase.base.GLConstants$MirrorMode r3 = r3.f47885b
            com.tencent.liteav.videobase.base.GLConstants$MirrorMode r0 = com.tencent.liteav.videobase.base.GLConstants.MirrorMode.DISABLE
            if (r3 == r0) goto L_0x0020
        L_0x0017:
            r4 = 1
            goto L_0x0020
        L_0x0019:
            com.tencent.liteav.videobase.base.GLConstants$MirrorMode r3 = r3.f47885b
            com.tencent.liteav.videobase.base.GLConstants$MirrorMode r0 = com.tencent.liteav.videobase.base.GLConstants.MirrorMode.ENABLE
            if (r3 != r0) goto L_0x0020
            goto L_0x0017
        L_0x0020:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.producer.C17602e.mo20922b(long):boolean");
    }

    /* renamed from: a */
    public final void mo20919a(long j, GLConstants.MirrorMode mirrorMode) {
        mo20918a(j).f47885b = mirrorMode;
    }

    /* renamed from: com.tencent.liteav.videoproducer.producer.e$a */
    public static class C17603a {

        /* renamed from: a */
        public boolean f47884a;

        /* renamed from: b */
        public GLConstants.MirrorMode f47885b;

        /* renamed from: c */
        public boolean f47886c;

        private C17603a() {
            this.f47884a = false;
            this.f47885b = GLConstants.MirrorMode.AUTO;
            this.f47886c = false;
        }

        public /* synthetic */ C17603a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo20920a(long j, boolean z) {
        mo20918a(j).f47886c = z;
    }

    /* renamed from: a */
    public final C17603a mo20918a(long j) {
        C17603a aVar = this.f47880a.get(j);
        if (aVar != null) {
            return aVar;
        }
        C17603a aVar2 = new C17603a((byte) 0);
        this.f47880a.put(j, aVar2);
        return aVar2;
    }
}
