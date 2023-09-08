package tk2;

import android.content.res.Configuration;
import android.view.MotionEvent;
import android.view.View;
import sk2.C101644d;
import sk2.C101645e;

/* renamed from: tk2.a */
public interface C101903a {
    /* renamed from: b */
    long mo33385b(C101645e eVar, C101644d dVar, C22543c cVar);

    /* renamed from: c */
    void mo33386c(View view);

    /* renamed from: d */
    boolean mo33387d(long j);

    /* renamed from: g */
    void mo33390g(View view);

    /* renamed from: i */
    boolean mo33392i();

    void onConfigurationChanged(Configuration configuration);

    boolean onDoubleTap(MotionEvent motionEvent);

    void release();
}
