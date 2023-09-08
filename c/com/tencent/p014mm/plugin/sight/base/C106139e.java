package com.tencent.p014mm.plugin.sight.base;

import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8480h;
import gy3.C87412m;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p823sg.C48380r;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.sight.base.e */
public final class C106139e {

    /* renamed from: b */
    public static final C106140a f316165b = new C106140a((C8480h) null);

    /* renamed from: c */
    public static final Object f316166c = new Object();

    /* renamed from: a */
    public final int f316167a;

    /* renamed from: com.tencent.mm.plugin.sight.base.e$a */
    public static final class C106140a {
        public C106140a(C8480h hVar) {
        }

        /* renamed from: c */
        public static /* synthetic */ C106139e m142779c(C106140a aVar, int i, int i2, int i3, float f, boolean z, boolean z2, int i4, int i5, int i6, int i7, Object obj) {
            int i8 = i7;
            return aVar.mo151880b(i, i2, i3, f, z, z2, (i8 & 64) != 0 ? -1 : i4, (i8 & 128) != 0 ? -1 : i5, (i8 & 256) != 0 ? -1 : i6);
        }

        /* renamed from: a */
        public final C106139e mo151879a(boolean z) {
            C106139e eVar;
            synchronized (C106139e.f316166c) {
                eVar = new C106139e(SightVideoJNI.initDataBufferForHardRemux(C85456b.m105449b(), C85456b.m105450c(false, z), true, z));
            }
            return eVar;
        }

        /* renamed from: b */
        public final C106139e mo151880b(int i, int i2, int i3, float f, boolean z, boolean z2, int i4, int i5, int i6) {
            C106139e eVar;
            int i7 = z ? 5 : 1;
            synchronized (C106139e.f316166c) {
                eVar = new C106139e(SightVideoJNI.initDataBufferForSoftRemux(i, i2, i3, f, z, i7, 8, 2, 23.0f, true, i4, i5, i6, z2, C85456b.m105449b()));
            }
            return eVar;
        }
    }

    public C106139e(int i) {
        this.f316167a = i;
    }

    /* renamed from: a */
    public static final C106139e m142773a(int i, int i2, int i3, float f, boolean z, boolean z2) {
        C106139e eVar;
        synchronized (f316166c) {
            eVar = new C106139e(SightVideoJNI.initDataBufferForCapture(i, i2, true, i3, f, z ? 5 : 1, 8, 2, 23.0f, true, z, z2, C85456b.m105449b()));
        }
        return eVar;
    }

    /* renamed from: e */
    public static /* synthetic */ void m142774e(C106139e eVar, ByteBuffer byteBuffer, int i, long j, int i2, int i3, int i4, int i5, Object obj) {
        eVar.mo151876d(byteBuffer, i, j, (i5 & 8) != 0 ? -1 : i2, (i5 & 16) != 0 ? -1 : i3, (i5 & 32) != 0 ? -1 : i4);
    }

    /* renamed from: b */
    public final int mo151874b(String str, int i, float f, boolean z, int i2, int i3) {
        synchronized (f316166c) {
            try {
                long currentTicks = Util.currentTicks();
                try {
                    String str2 = str;
                    int muxVideo = SightVideoJNI.muxVideo(this.f316167a, C48380r.m53726a(str, false), i, f, z, i2, i3);
                    C85456b.m105453f(muxVideo, currentTicks);
                    return muxVideo;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final void mo151875c() {
        synchronized (f316166c) {
            SightVideoJNI.releaseBigSightDataBuffer(this.f316167a);
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: d */
    public final void mo151876d(ByteBuffer byteBuffer, int i, long j, int i2, int i3, int i4) {
        synchronized (f316166c) {
            if (i2 != -1) {
                ByteBuffer byteBuffer2 = byteBuffer;
                int i5 = i;
                long j2 = j;
                int i6 = i3;
            } else if (i3 != -1) {
                ByteBuffer byteBuffer3 = byteBuffer;
                int i7 = i;
                long j3 = j;
            } else if (i4 == -1) {
                ByteBuffer byteBuffer4 = byteBuffer;
                int i8 = i;
                long j4 = j;
                SightVideoJNI.writeAACData(this.f316167a, byteBuffer, i, j);
                C13598b0 b0Var = C13598b0.f38549a;
            } else {
                ByteBuffer byteBuffer5 = byteBuffer;
                int i9 = i;
                long j5 = j;
                SightVideoJNI.writeAACDataWithADTS(this.f316167a, byteBuffer, i, j, i2, i3, i4);
                C13598b0 b0Var2 = C13598b0.f38549a;
            }
            int i15 = i4;
            SightVideoJNI.writeAACDataWithADTS(this.f316167a, byteBuffer, i, j, i2, i3, i4);
            C13598b0 b0Var22 = C13598b0.f38549a;
        }
    }

    /* renamed from: f */
    public final void mo151877f(long j) {
        synchronized (f316166c) {
            SightVideoJNI.writeDtsData(this.f316167a, j);
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    public String toString() {
        String format = String.format("bufId:%s", Arrays.copyOf(new Object[]{Integer.valueOf(this.f316167a)}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        return format;
    }
}
