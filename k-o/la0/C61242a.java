package la0;

import android.view.Surface;
import androidx.lifecycle.LiveData;
import bl3.C0316c;
import com.tencent.maas.instamovie.MJExportSettings;
import com.tencent.maas.model.MJChannelEventConfig;
import com.tencent.maas.model.MJMusicInfo;
import com.tencent.maas.model.MJMusicOptions;
import com.tencent.maas.model.MJTemplateInfo;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d14.C45252f;
import gy3.C87412m;
import ha0.C59807w0;
import java.util.List;
import rx3.C13598b0;
import te3.pr4;
import wx3.C15601d;

/* renamed from: la0.a */
public interface C61242a extends C0316c {

    /* renamed from: la0.a$b */
    public interface C61243b {
        /* renamed from: a */
        LiveData<Boolean> mo86229a();

        /* renamed from: b */
        LiveData<MJMusicInfo> mo86230b();

        /* renamed from: c */
        LiveData<List<MJMusicInfo>> mo86231c();

        /* renamed from: d */
        LiveData<Boolean> mo86232d();
    }

    /* renamed from: la0.a$a */
    public interface C61244a {
        /* renamed from: a */
        MJExportSettings mo86233a();
    }

    /* renamed from: la0.a$c */
    public static final class C61245c {

        /* renamed from: a */
        public final String f174314a;

        /* renamed from: b */
        public final boolean f174315b;

        /* renamed from: c */
        public final boolean f174316c;

        /* renamed from: d */
        public final int f174317d;

        /* renamed from: e */
        public final boolean f174318e;

        /* renamed from: f */
        public final List<String> f174319f;

        /* renamed from: g */
        public final int f174320g;

        /* renamed from: h */
        public final boolean f174321h;

        /* renamed from: i */
        public final List<String> f174322i;

        /* renamed from: j */
        public final boolean f174323j;

        public C61245c(String str, boolean z, boolean z2, int i, boolean z3, List<String> list, int i2, boolean z4, List<String> list2, boolean z5) {
            C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            C87412m.m108594g(list, "defaultTemplateIDs");
            this.f174314a = str;
            this.f174315b = z;
            this.f174316c = z2;
            this.f174317d = i;
            this.f174318e = z3;
            this.f174319f = list;
            this.f174320g = i2;
            this.f174321h = z4;
            this.f174322i = list2;
            this.f174323j = z5;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C61245c)) {
                return false;
            }
            C61245c cVar = (C61245c) obj;
            return C87412m.m108589b(this.f174314a, cVar.f174314a) && this.f174315b == cVar.f174315b && this.f174316c == cVar.f174316c && this.f174317d == cVar.f174317d && this.f174318e == cVar.f174318e && C87412m.m108589b(this.f174319f, cVar.f174319f) && this.f174320g == cVar.f174320g && this.f174321h == cVar.f174321h && C87412m.m108589b(this.f174322i, cVar.f174322i) && this.f174323j == cVar.f174323j;
        }

        public int hashCode() {
            int hashCode = this.f174314a.hashCode() * 31;
            boolean z = this.f174315b;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f174316c;
            if (z3) {
                z3 = true;
            }
            int i2 = (((i + (z3 ? 1 : 0)) * 31) + this.f174317d) * 31;
            boolean z4 = this.f174318e;
            if (z4) {
                z4 = true;
            }
            int hashCode2 = (((((i2 + (z4 ? 1 : 0)) * 31) + this.f174319f.hashCode()) * 31) + this.f174320g) * 31;
            boolean z5 = this.f174321h;
            if (z5) {
                z5 = true;
            }
            int i3 = (hashCode2 + (z5 ? 1 : 0)) * 31;
            List<String> list = this.f174322i;
            int hashCode3 = (i3 + (list == null ? 0 : list.hashCode())) * 31;
            boolean z6 = this.f174323j;
            if (!z6) {
                z2 = z6;
            }
            return hashCode3 + (z2 ? 1 : 0);
        }

        public String toString() {
            return "MaasMovieSessionInitialParams(scene=" + this.f174314a + ", musicMuted=" + this.f174315b + ", originMuted=" + this.f174316c + ", maxDurationInSeconds=" + this.f174317d + ", shouldRetainOriginalMediaDuration=" + this.f174318e + ", defaultTemplateIDs=" + this.f174319f + ", retainOriginalMediaDurationThresholdInSeconds=" + this.f174320g + ", shouldAutoRecommendBGM=" + this.f174321h + ", initialTmplList=" + this.f174322i + ", shouldAutoRecommendBGMForAutoRecommendTemplate=" + this.f174323j + ')';
        }
    }

    /* renamed from: la0.a$d */
    public interface C61246d {
        /* renamed from: W1 */
        void mo86237W1();

        /* renamed from: d0 */
        void mo86238d0();

        /* renamed from: f0 */
        Object mo75243f0(C15601d<? super C13598b0> dVar);

        /* renamed from: p */
        void mo75247p(String str);

        /* renamed from: w */
        void mo86239w(float f);
    }

    /* renamed from: A1 */
    Object mo86202A1(String str, C15601d<? super C45252f<Float>> dVar);

    /* renamed from: B2 */
    List<String> mo86203B2();

    /* renamed from: E2 */
    void mo86204E2(C61244a aVar);

    /* renamed from: G1 */
    Object mo86205G1(List<? extends pr4> list, C15601d<? super List<? extends pr4>> dVar);

    /* renamed from: G2 */
    Object mo86206G2(String str, C15601d<? super C45252f<Float>> dVar);

    /* renamed from: H1 */
    void mo86207H1(boolean z, boolean z2);

    /* renamed from: I2 */
    void mo86208I2();

    /* renamed from: J0 */
    void mo86209J0(boolean z, boolean z2);

    /* renamed from: L0 */
    void mo86210L0(C61245c cVar);

    /* renamed from: M */
    LiveData<C59807w0> mo86211M();

    /* renamed from: N2 */
    Object mo86212N2(String str, C15601d<? super C45252f<Float>> dVar);

    /* renamed from: O1 */
    void mo86213O1(Surface surface);

    /* renamed from: Q2 */
    Object mo86214Q2(boolean z, boolean z2, C15601d<? super C13598b0> dVar);

    /* renamed from: U0 */
    MJMusicOptions mo86215U0();

    /* renamed from: U2 */
    LiveData<List<MJTemplateInfo>> mo86216U2();

    /* renamed from: Z0 */
    C61243b mo86217Z0();

    /* renamed from: b1 */
    void mo86218b1(C61246d dVar);

    /* renamed from: c0 */
    long mo86219c0();

    /* renamed from: d1 */
    void mo86220d1(String str, String str2);

    /* renamed from: d2 */
    void mo86221d2(boolean z);

    double getVideoRatio();

    /* renamed from: l1 */
    MJChannelEventConfig mo86223l1();

    void notifySurfaceChanged(int i, int i2, int i3);

    /* renamed from: p0 */
    Object mo86225p0(C15601d<? super C45252f<Float>> dVar);

    /* renamed from: s0 */
    void mo86226s0(boolean z);

    void setMediaList(List<? extends GalleryItem$MediaItem> list);

    /* renamed from: y2 */
    void mo86228y2(boolean z);
}
