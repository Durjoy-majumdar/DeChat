package y33;

import android.os.Bundle;

/* renamed from: y33.a */
public interface C112390a {

    /* renamed from: y33.a$a */
    public static final class C112391a {
        /* renamed from: a */
        public static /* synthetic */ void m153348a(C112390a aVar, C112392b bVar, Bundle bundle, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    bundle = null;
                }
                aVar.mo152898v(bVar, bundle);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: statusChange");
        }
    }

    /* renamed from: y33.a$b */
    public enum C112392b {
        UNKOWN,
        MINI_ICON_CLICK,
        SPLIT_BTN_CLICK,
        MUTE_BTN_CLICK,
        SPEAKER_BTN_CLICK,
        IGNORE_BTN_CLICK,
        CANCEL_INVITE_CLICK,
        ACCEPT_BTN_CLICK,
        REJECT_BTN_CLICK,
        HANGUP_BTN_CLICK,
        ACCEPT_USE_VOICE,
        SWITCH_TO_VOICE_BTN_CLICK,
        SWITCH_CAMERA_BTN_CLICK
    }

    /* renamed from: v */
    void mo152898v(C112392b bVar, Bundle bundle);
}
