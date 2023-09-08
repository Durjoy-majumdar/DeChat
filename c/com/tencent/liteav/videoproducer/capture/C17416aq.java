package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.tencent.liteav.videoproducer.capture.aq */
public final class C17416aq implements CaptureSourceInterface.C17399a {

    /* renamed from: a */
    public final Set<CaptureSourceInterface.C17399a> f47265a = new HashSet();

    /* renamed from: a */
    public final void mo20571a(CaptureSourceInterface.C17399a aVar) {
        if (aVar != null) {
            this.f47265a.add(aVar);
        }
    }

    /* renamed from: b */
    public final void mo20573b(CaptureSourceInterface.C17399a aVar) {
        this.f47265a.remove(aVar);
    }

    /* renamed from: c */
    public final void mo20535c(boolean z) {
        for (CaptureSourceInterface.C17399a next : this.f47265a) {
            if (next != null) {
                next.mo20535c(z);
            }
        }
    }

    /* renamed from: d */
    public final void mo20536d(boolean z) {
        for (CaptureSourceInterface.C17399a next : this.f47265a) {
            if (next != null) {
                next.mo20536d(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo20533a(boolean z) {
        for (CaptureSourceInterface.C17399a next : this.f47265a) {
            if (next != null) {
                next.mo20533a(z);
            }
        }
    }

    /* renamed from: b */
    public final int mo20572b() {
        return this.f47265a.size();
    }

    /* renamed from: b */
    public final void mo20534b(boolean z) {
        for (CaptureSourceInterface.C17399a next : this.f47265a) {
            if (next != null) {
                next.mo20534b(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo20532a(CaptureSourceInterface captureSourceInterface, PixelFrame pixelFrame) {
        for (CaptureSourceInterface.C17399a next : this.f47265a) {
            if (next != null) {
                next.mo20532a((CaptureSourceInterface) null, pixelFrame);
            }
        }
    }

    /* renamed from: a */
    public final void mo20531a() {
        for (CaptureSourceInterface.C17399a next : this.f47265a) {
            if (next != null) {
                next.mo20531a();
            }
        }
    }
}
