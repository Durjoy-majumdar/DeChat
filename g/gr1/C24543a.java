package gr1;

import android.content.Context;
import android.os.Looper;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.tav.core.AssetExtension;
import gy3.C87412m;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: gr1.a */
public final class C24543a extends FinderThumbPlayerProxy {

    /* renamed from: gr1.a$a */
    public static final class C24544a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Runnable f70131d;

        public C24544a(Runnable runnable) {
            this.f70131d = runnable;
        }

        public final void run() {
            this.f70131d.run();
        }
    }

    /* renamed from: gr1.a$b */
    public static final class C24545b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C24543a f70132d;

        /* renamed from: e */
        public final /* synthetic */ int f70133e;

        public C24545b(C24543a aVar, int i) {
            this.f70132d = aVar;
            this.f70133e = i;
        }

        public final void run() {
            C24543a.super.mo51222E(this.f70133e);
        }
    }

    /* renamed from: gr1.a$c */
    public static final class C24546c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C24543a f70134d;

        public C24546c(C24543a aVar) {
            this.f70134d = aVar;
        }

        public final void run() {
            boolean unused = C24543a.super.pause();
        }
    }

    /* renamed from: gr1.a$d */
    public static final class C24547d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C24543a f70135d;

        public C24547d(C24543a aVar) {
            this.f70135d = aVar;
        }

        public final void run() {
            int unused = C24543a.super.mo51226q();
        }
    }

    /* renamed from: gr1.a$e */
    public static final class C24548e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C24543a f70136d;

        public C24548e(C24543a aVar) {
            this.f70136d = aVar;
        }

        public final void run() {
            boolean unused = C24543a.super.play();
        }
    }

    /* renamed from: gr1.a$f */
    public static final class C24549f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C24543a f70137d;

        public C24549f(C24543a aVar) {
            this.f70137d = aVar;
        }

        public final void run() {
            boolean unused = C24543a.super.mo51228s();
        }
    }

    /* renamed from: gr1.a$g */
    public static final class C24550g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C24543a f70138d;

        public C24550g(C24543a aVar) {
            this.f70138d = aVar;
        }

        public final void run() {
            C24543a.super.mo51232t();
        }
    }

    /* renamed from: gr1.a$h */
    public static final class C24551h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C24543a f70139d;

        /* renamed from: e */
        public final /* synthetic */ double f70140e;

        /* renamed from: f */
        public final /* synthetic */ boolean f70141f;

        public C24551h(C24543a aVar, double d, boolean z) {
            this.f70139d = aVar;
            this.f70140e = d;
            this.f70141f = z;
        }

        public final void run() {
            this.f70139d.mo51233x(this.f70140e, this.f70141f, 1);
        }
    }

    /* renamed from: gr1.a$i */
    public static final class C24552i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C24543a f70142d;

        /* renamed from: e */
        public final /* synthetic */ double f70143e;

        /* renamed from: f */
        public final /* synthetic */ boolean f70144f;

        /* renamed from: g */
        public final /* synthetic */ int f70145g;

        public C24552i(C24543a aVar, double d, boolean z, int i) {
            this.f70142d = aVar;
            this.f70143e = d;
            this.f70144f = z;
            this.f70145g = i;
        }

        public final void run() {
            boolean unused = C24543a.super.mo51233x(this.f70143e, this.f70144f, this.f70145g);
        }
    }

    /* renamed from: gr1.a$j */
    public static final class C24553j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C24543a f70146d;

        /* renamed from: e */
        public final /* synthetic */ boolean f70147e;

        public C24553j(C24543a aVar, boolean z) {
            this.f70146d = aVar;
            this.f70147e = z;
        }

        public final void run() {
            C24543a.super.setLoop(this.f70147e);
        }
    }

    /* renamed from: gr1.a$k */
    public static final class C24554k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C24543a f70148d;

        /* renamed from: e */
        public final /* synthetic */ boolean f70149e;

        public C24554k(C24543a aVar, boolean z) {
            this.f70148d = aVar;
            this.f70149e = z;
        }

        public final void run() {
            C24543a.super.setMute(this.f70149e);
        }
    }

    /* renamed from: gr1.a$l */
    public static final class C24555l implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C24543a f70150d;

        /* renamed from: e */
        public final /* synthetic */ Integer f70151e;

        public C24555l(C24543a aVar, Integer num) {
            this.f70150d = aVar;
            this.f70151e = num;
        }

        public final void run() {
            boolean unused = C24543a.super.mo51221B(this.f70151e);
        }
    }

    /* renamed from: gr1.a$m */
    public static final class C24556m implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C24543a f70152d;

        public C24556m(C24543a aVar) {
            this.f70152d = aVar;
        }

        public final void run() {
            C24543a.super.stop();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24543a(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: B */
    public boolean mo51221B(Integer num) {
        mo51227q0("startOrPlay", new C24555l(this, num));
        return true;
    }

    /* renamed from: E */
    public void mo51222E(int i) {
        C24545b bVar = new C24545b(this, i);
        if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {
            bVar.run();
        } else {
            ((C119157j) C119157j.f356862d).mo183895z(bVar).get();
        }
    }

    /* renamed from: a */
    public boolean mo51223a(double d, boolean z) {
        mo51227q0("seekTo", new C24551h(this, d, z));
        return true;
    }

    public boolean pause() {
        mo51227q0("pause", new C24546c(this));
        return true;
    }

    public boolean play() {
        mo51227q0(AssetExtension.SCENE_PLAY, new C24548e(this));
        return true;
    }

    /* renamed from: q */
    public int mo51226q() {
        mo51227q0("pauseWithCancel", new C24547d(this));
        return 0;
    }

    /* renamed from: q0 */
    public final void mo51227q0(String str, Runnable runnable) {
        if (Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId()) {
            runnable.run();
            return;
        }
        C119179t tVar = C119157j.f356862d;
        C24544a aVar = new C24544a(runnable);
        ((C119157j) tVar).mo183876g(aVar, "FinderAsyncVideoView#" + hashCode());
    }

    /* renamed from: s */
    public boolean mo51228s() {
        mo51227q0("prepareToPlay", new C24549f(this));
        return true;
    }

    public void setLoop(boolean z) {
        mo51227q0("setLoop", new C24553j(this, z));
    }

    public void setMute(boolean z) {
        mo51227q0("setMute", new C24554k(this, z));
    }

    public void stop() {
        mo51227q0("stop", new C24556m(this));
    }

    /* renamed from: t */
    public void mo51232t() {
        mo51227q0("prepareforReuse", new C24550g(this));
    }

    /* renamed from: x */
    public boolean mo51233x(double d, boolean z, int i) {
        mo51227q0("seekTo", new C24552i(this, d, z, i));
        return true;
    }
}
