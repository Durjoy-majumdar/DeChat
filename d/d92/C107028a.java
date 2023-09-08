package d92;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import k92.C108974b;

/* renamed from: d92.a */
public interface C107028a {

    /* renamed from: d92.a$a */
    public interface C45290a {
        /* renamed from: a */
        void mo70814a(MotionEvent motionEvent);

        /* renamed from: b */
        void mo70815b(float f);

        /* renamed from: c */
        boolean mo70816c();

        /* renamed from: d */
        int mo70817d(boolean z);

        boolean enableSwipeBack();

        /* renamed from: f */
        boolean mo70819f(MotionEvent motionEvent);

        /* renamed from: i */
        int mo70820i();

        /* renamed from: j */
        void mo70821j(int i, int i2);
    }

    /* renamed from: d92.a$b */
    public interface C45291b {
        void onComplete(boolean z);
    }

    /* renamed from: a */
    int mo67904a();

    /* renamed from: b */
    ViewGroup mo67905b();

    /* renamed from: c */
    boolean mo70828c();

    /* renamed from: d */
    void mo70829d();

    /* renamed from: e */
    void mo67906e(boolean z, C108974b bVar);

    /* renamed from: f */
    void mo70830f(C108974b bVar);

    /* renamed from: g */
    boolean mo67907g();

    Activity getActivity();

    Bitmap getBitmap();

    View getContentView();

    Intent getIntent();

    View getMaskView();

    /* renamed from: h */
    Bitmap mo70832h(Bitmap bitmap, int i);

    /* renamed from: i */
    boolean mo70833i();

    /* renamed from: j */
    void mo70834j(boolean z);

    /* renamed from: k */
    void mo70835k();

    /* renamed from: l */
    void mo70836l(int i);

    /* renamed from: m */
    void mo67911m(C45290a aVar);

    /* renamed from: n */
    void mo67912n(C45291b bVar);
}
