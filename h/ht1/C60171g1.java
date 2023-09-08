package ht1;

import android.view.View;

/* renamed from: ht1.g1 */
public interface C60171g1 {

    /* renamed from: ht1.g1$a */
    public static final class C8767a {
        /* renamed from: a */
        public static /* synthetic */ boolean m8577a(C60171g1 g1Var, Integer num, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    num = null;
                }
                return g1Var.mo51221B(num);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startOrPlay");
        }
    }

    /* renamed from: B */
    boolean mo51221B(Integer num);

    /* renamed from: a */
    boolean mo51223a(double d, boolean z);

    /* renamed from: c */
    void mo78608c();

    /* renamed from: d */
    void mo78609d();

    long getCurrentPlayMs();

    int getCurrentPlaySecond();

    int getVideoDuration();

    long getVideoDurationMs();

    View getVideoView();

    boolean getVideoViewFocused();

    boolean isPlaying();

    boolean pause();

    boolean play();

    void setIMMVideoViewCallback(C60157c5 c5Var);

    void setLoop(boolean z);

    void setMute(boolean z);

    void setVideoViewFocused(boolean z);

    void stop();

    /* renamed from: x */
    boolean mo51233x(double d, boolean z, int i);
}
