package gr1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.View;
import com.tencent.p014mm.plugin.thumbplayer.view.MMTPEffectVideoLayout;
import com.tencent.xweb.file.XVFSFile;
import d03.C58010a;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j03.C60695a;
import pl1.C62367r0;
import rx3.C13598b0;
import te3.C64689rq2;
import up1.C27696y;

/* renamed from: gr1.w0 */
public final class C59680w0 implements C59664m2 {

    /* renamed from: a */
    public final MMTPEffectVideoLayout f170501a;

    /* renamed from: gr1.w0$a */
    public static final class C59681a extends C87413o implements C32228q<SurfaceTexture, Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59680w0 f170502d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f170503e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59681a(C59680w0 w0Var, C32224a<C13598b0> aVar) {
            super(3);
            this.f170502d = w0Var;
            this.f170503e = aVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
            ((Number) obj2).intValue();
            ((Number) obj3).intValue();
            C60695a player = this.f170502d.f170501a.getPlayer();
            if (player != null) {
                player.mo85604b(false);
            }
            this.f170503e.invoke();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gr1.w0$b */
    public static final class C59682b extends C87413o implements C32228q<SurfaceTexture, Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Long, C13598b0> f170504d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59682b(C32226l<? super Long, C13598b0> lVar) {
            super(3);
            this.f170504d = lVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
            ((Number) obj2).intValue();
            ((Number) obj3).intValue();
            this.f170504d.invoke(0L);
            return C13598b0.f38549a;
        }
    }

    public C59680w0(Context context, C64689rq2 rq22) {
        Context context2 = context;
        C64689rq2 rq23 = rq22;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(rq23, "media");
        MMTPEffectVideoLayout mMTPEffectVideoLayout = new MMTPEffectVideoLayout(context2);
        this.f170501a = mMTPEffectVideoLayout;
        C62367r0 r0Var = new C62367r0(rq22, C27696y.V10_VIDEO, "xV10", 0, 0, (String) null, 56, (C8480h) null);
        String b = r0Var.mo11841b();
        String path = r0Var.getPath();
        C58010a aVar = new C58010a(b, path, r0Var.getUrl() + XVFSFile.SEPARATOR_CHAR + r0Var.getUrlToken(), (int) rq23.f185270h, (int) rq23.f185271i);
        aVar.f165932d = rq23.f185284x;
        mMTPEffectVideoLayout.mo81100f();
        mMTPEffectVideoLayout.setMediaInfo(aVar);
        C60695a player = mMTPEffectVideoLayout.getPlayer();
        if (player != null) {
            player.mo85614i(true);
        }
        C60695a player2 = mMTPEffectVideoLayout.getPlayer();
        if (player2 != null) {
            player2.setMute(true);
        }
        C60695a player3 = mMTPEffectVideoLayout.getPlayer();
        if (player3 != null) {
            player3.mo85619m();
        }
    }

    /* renamed from: a */
    public void mo84652a(C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2, C32226l<? super Long, C13598b0> lVar) {
        C87412m.m108594g(aVar, "onReady");
        C87412m.m108594g(aVar2, "onDestroy");
        C87412m.m108594g(lVar, "onSeekFrame");
        this.f170501a.setOnFirstFrameAvailable(new C59681a(this, aVar));
        this.f170501a.setOnFrameAvailable(new C59682b(lVar));
    }

    public void destroy() {
        C60695a player = this.f170501a.getPlayer();
        if (player != null) {
            player.stopAsync();
        }
        C60695a player2 = this.f170501a.getPlayer();
        if (player2 != null) {
            player2.recycle();
        }
        this.f170501a.mo81101g();
    }

    public Bitmap getBitmap() {
        return this.f170501a.getBitmap();
    }

    public long getCurrentPositionMs() {
        C60695a player = this.f170501a.getPlayer();
        if (player != null) {
            return player.getCurrentPositionMs();
        }
        return 0;
    }

    public View getView() {
        return this.f170501a;
    }

    public void seekTo(long j) {
        C60695a player = this.f170501a.getPlayer();
        if (player != null) {
            C60695a.C60696a.m70999b(player, (int) j, true, (C32226l) null, 4, (Object) null);
        }
    }
}
