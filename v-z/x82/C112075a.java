package x82;

import android.os.Bundle;

/* renamed from: x82.a */
public interface C112075a {

    /* renamed from: x82.a$a */
    public static final class C112076a {
        /* renamed from: a */
        public static /* synthetic */ void m152803a(C112075a aVar, C112077b bVar, Bundle bundle, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    bundle = null;
                }
                aVar.mo163772c(bVar, bundle);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: statusChange");
        }
    }

    /* renamed from: x82.a$b */
    public enum C112077b {
        START_PROJECTOR,
        STOP_PROJECTOR,
        SHOW_DOODLE_LAYOUT,
        HIDE_DOODLE_LAYOUT,
        CLEAR_SCREEN,
        AVATAR_READY,
        AVATAR_HIDE,
        THUMB_VIEW_PAGE_FLIP,
        SCREEN_ON_CLICK,
        SLIDE_CONTENT_LEFT,
        SLIDE_CONTENT_RIGHT,
        REQUEST_THUMB_REFRESH,
        SCREEN_READY_UI_FINISH,
        SAVE_TO_PICTURE,
        SAVE_TO_FAV,
        SEND_TO_FRIEND
    }

    /* renamed from: a */
    int mo163770a();

    /* renamed from: b */
    int mo163771b();

    /* renamed from: c */
    void mo163772c(C112077b bVar, Bundle bundle);

    /* renamed from: d */
    boolean mo163773d();

    /* renamed from: e */
    boolean mo163774e();

    boolean getCurrentStatus();
}
