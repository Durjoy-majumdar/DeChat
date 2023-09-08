package j03;

import android.view.Surface;
import com.tencent.thumbplayer.api.ITPPlayer;
import d03.C58010a;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import i03.C60238a;
import k34.C117388a;
import m03.C61431n;
import rx3.C13598b0;

/* renamed from: j03.a */
public interface C60695a {

    /* renamed from: j03.a$a */
    public static final class C60696a {

        /* renamed from: j03.a$a$a */
        public static final class C60697a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public static final C60697a f172863d = new C60697a();

            public C60697a() {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                return C13598b0.f38549a;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m70998a(C60695a aVar, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = true;
                }
                aVar.mo85604b(z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pause");
        }

        /* renamed from: b */
        public static /* synthetic */ void m70999b(C60695a aVar, int i, boolean z, C32226l lVar, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    z = false;
                }
                if ((i2 & 4) != 0) {
                    lVar = null;
                }
                aVar.mo85618l(i, z, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: seekTo");
        }

        /* renamed from: c */
        public static /* synthetic */ void m71000c(C60695a aVar, Surface surface, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = false;
                }
                aVar.mo85606d(surface, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSurface");
        }

        /* renamed from: d */
        public static /* synthetic */ void m71001d(C60695a aVar, C32224a aVar2, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    aVar2 = C60697a.f172863d;
                }
                aVar.mo85617k(aVar2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopCdnDownload");
        }
    }

    /* renamed from: a */
    void mo85603a(long j, long j2);

    /* renamed from: b */
    void mo85604b(boolean z);

    /* renamed from: c */
    String mo85605c();

    /* renamed from: d */
    void mo85606d(Surface surface, boolean z);

    /* renamed from: e */
    boolean mo85607e();

    /* renamed from: f */
    int mo85608f();

    /* renamed from: g */
    void mo85609g();

    long getCurrentPositionMs();

    C60698b getPlayer();

    C60238a getReportInfo();

    /* renamed from: h */
    void mo85613h(C32226l<? super C60695a, C13598b0> lVar);

    /* renamed from: i */
    void mo85614i(boolean z);

    boolean isPlaying();

    /* renamed from: j */
    C117388a mo85616j();

    /* renamed from: k */
    void mo85617k(C32224a<C13598b0> aVar);

    /* renamed from: l */
    void mo85618l(int i, boolean z, C32226l<? super ITPPlayer, C13598b0> lVar);

    /* renamed from: m */
    void mo85619m();

    /* renamed from: n */
    void mo85620n(C61431n nVar, long j);

    /* renamed from: o */
    C58010a mo85621o();

    void prepare();

    void recycle();

    void setLoop(boolean z);

    void setMediaInfo(C58010a aVar);

    void setMute(boolean z);

    void stop();

    void stopAsync();
}
