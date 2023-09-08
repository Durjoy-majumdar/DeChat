package tl2;

import android.graphics.Canvas;
import com.tencent.p014mm.plugin.scanner.model.ScanPoint;

/* renamed from: tl2.c */
public interface C111016c {

    /* renamed from: tl2.c$a */
    public interface C111017a {
        /* renamed from: a */
        void mo162697a(C111016c cVar);

        void onAnimationStart();
    }

    /* renamed from: a */
    boolean mo162699a();

    /* renamed from: b */
    void mo162700b(ScanPoint[] scanPointArr, int i);

    /* renamed from: c */
    void mo162701c(C111017a aVar);

    /* renamed from: d */
    void mo162702d(int i, int i2, boolean z);

    /* renamed from: e */
    void mo162703e(Canvas canvas);

    void release();

    void setDuration(long j);

    void stopAnimation();
}
