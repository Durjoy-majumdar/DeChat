package b50;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.p014mm.plugin.mmplayer.player.view.MMVideoFrameLayout;
import d50.C58114h;
import d50.C58115i;
import u62.C22597f;

/* renamed from: b50.d */
public interface C54408d {

    /* renamed from: b50.d$a */
    public static final class C54409a {
        /* renamed from: a */
        public static /* synthetic */ int m61121a(C54408d dVar, Context context, boolean z, boolean z2, int i, int i2, Bitmap bitmap, boolean z3, MMVideoFrameLayout mMVideoFrameLayout, int i3, Object obj) {
            int i4 = i3;
            if (obj == null) {
                boolean z4 = true;
                boolean z5 = (i4 & 2) != 0 ? true : z;
                if ((i4 & 4) == 0) {
                    z4 = z2;
                }
                int i5 = (i4 & 8) != 0 ? 2 : i;
                int i6 = (i4 & 16) != 0 ? 12 : i2;
                MMVideoFrameLayout mMVideoFrameLayout2 = null;
                Bitmap bitmap2 = (i4 & 32) != 0 ? null : bitmap;
                boolean z6 = (i4 & 64) != 0 ? false : z3;
                if ((i4 & 128) == 0) {
                    mMVideoFrameLayout2 = mMVideoFrameLayout;
                }
                return dVar.mo75216e(context, z5, z4, i5, i6, bitmap2, z6, mMVideoFrameLayout2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: floatMode");
        }

        /* renamed from: b */
        public static /* synthetic */ int m61122b(C54408d dVar, C58114h hVar, boolean z, boolean z2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = true;
                }
                if ((i & 4) != 0) {
                    z2 = false;
                }
                return dVar.mo75213F(hVar, z, z2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setup");
        }

        /* renamed from: c */
        public static /* synthetic */ void m61123c(C54408d dVar, Bitmap bitmap, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    i = 5;
                }
                dVar.mo75219k(bitmap, i);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateMuteVideoImage");
        }
    }

    /* renamed from: A */
    void mo75211A(int i, String str, boolean z, int i2, TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver);

    /* renamed from: E */
    int mo75212E();

    /* renamed from: F */
    int mo75213F(C58114h hVar, boolean z, boolean z2);

    /* renamed from: J */
    void mo75214J(int i);

    /* renamed from: a */
    void mo75215a(Bitmap bitmap);

    /* renamed from: e */
    int mo75216e(Context context, boolean z, boolean z2, int i, int i2, Bitmap bitmap, boolean z3, MMVideoFrameLayout<C22597f> mMVideoFrameLayout);

    C58115i getLiveStatus();

    /* renamed from: i */
    void mo75218i(C54410e eVar);

    /* renamed from: k */
    void mo75219k(Bitmap bitmap, int i);

    /* renamed from: r */
    void mo75220r(float f, float f2);
}
