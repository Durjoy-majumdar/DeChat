package com.tencent.p014mm.plugin.thumbplayer.view;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import d03.C58010a;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import g03.C107681p;
import g03.C59338a;
import gy3.C87412m;
import gy3.C87413o;
import i03.C60240c;
import j03.C60695a;
import j03.C60700d;
import java.util.List;
import kotlin.Metadata;
import m03.C109456e;
import m03.C109457f;
import m03.C109458k;
import m03.C109459m;
import m03.C61430l;
import m03.C61431n;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0004\u0001\u0001B\u001d\b\u0016\u0012\u0006\u0010}\u001a\u00020|\u0012\b\u0010\u001a\u0004\u0018\u00010~¢\u0006\u0006\b\u0001\u0010\u0001B&\b\u0016\u0012\u0006\u0010}\u001a\u00020|\u0012\b\u0010\u001a\u0004\u0018\u00010~\u0012\u0007\u0010\u0001\u001a\u00020\u001c¢\u0006\u0006\b\u0001\u0010\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010,\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00103\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u0010;\u001a\u0004\u0018\u0001048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010K\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010S\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR6\u0010[\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010T8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010b\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010f\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bc\u0010]\u001a\u0004\bd\u0010_\"\u0004\be\u0010aR\"\u0010n\u001a\u00020g8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010r\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bo\u0010.\u001a\u0004\bp\u00100\"\u0004\bq\u00102R\u001a\u0010s\u001a\u00020\u001c8\u0006XD¢\u0006\f\n\u0004\bs\u0010\u001e\u001a\u0004\bt\u0010 R$\u0010v\u001a\u0004\u0018\u00010u8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{¨\u0006\u0001"}, mo182094d2 = {"Lcom/tencent/mm/plugin/thumbplayer/view/MMMvVideoLayout;", "Landroid/widget/FrameLayout;", "", "enable", "Lrx3/b0;", "setEnableEffect", "Lcom/tencent/mm/plugin/thumbplayer/view/MMMvVideoLayout$a;", "listener", "setFirstFrameDrawCallback", "", "interval", "setProgressUpdateInterval", "Lj03/d;", "e", "Lj03/d;", "getCurrentPlayer", "()Lj03/d;", "setCurrentPlayer", "(Lj03/d;)V", "currentPlayer", "Lcom/tencent/mm/plugin/thumbplayer/view/MMThumbPlayerTextureView;", "f", "Lcom/tencent/mm/plugin/thumbplayer/view/MMThumbPlayerTextureView;", "getTextureView", "()Lcom/tencent/mm/plugin/thumbplayer/view/MMThumbPlayerTextureView;", "setTextureView", "(Lcom/tencent/mm/plugin/thumbplayer/view/MMThumbPlayerTextureView;)V", "textureView", "", "g", "I", "getCurrentPlayIndex", "()I", "setCurrentPlayIndex", "(I)V", "currentPlayIndex", "", "Ld03/a;", "h", "Ljava/util/List;", "getMediaInfoList", "()Ljava/util/List;", "setMediaInfoList", "(Ljava/util/List;)V", "mediaInfoList", "i", "J", "getTotalLength", "()J", "setTotalLength", "(J)V", "totalLength", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "j", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "getPlayTimer", "()Lcom/tencent/mm/sdk/platformtools/MMHandler;", "setPlayTimer", "(Lcom/tencent/mm/sdk/platformtools/MMHandler;)V", "playTimer", "Lg03/p;", "n", "Lg03/p;", "getEffector", "()Lg03/p;", "setEffector", "(Lg03/p;)V", "effector", "Lm03/m;", "o", "Lm03/m;", "getMediaChangeListener", "()Lm03/m;", "setMediaChangeListener", "(Lm03/m;)V", "mediaChangeListener", "Lm03/k;", "p", "Lm03/k;", "getMvMusicProxy", "()Lm03/k;", "setMvMusicProxy", "(Lm03/k;)V", "mvMusicProxy", "Lkotlin/Function2;", "v", "Lfy3/p;", "getOnProgressUpdate", "()Lfy3/p;", "setOnProgressUpdate", "(Lfy3/p;)V", "onProgressUpdate", "w", "Z", "getPauseVideoOnPlay", "()Z", "setPauseVideoOnPlay", "(Z)V", "pauseVideoOnPlay", "x", "getLogFrameRender", "setLogFrameRender", "logFrameRender", "Li03/c;", "y", "Li03/c;", "getReportInfo", "()Li03/c;", "setReportInfo", "(Li03/c;)V", "reportInfo", "A", "getLastPauseMvPosition", "setLastPauseMvPosition", "lastPauseMvPosition", "COMPLETE", "getCOMPLETE", "Lm03/l;", "playerActionListener", "Lm03/l;", "getPlayerActionListener", "()Lm03/l;", "setPlayerActionListener", "(Lm03/l;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "plugin-thumbplayer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout */
public final class MMMvVideoLayout extends FrameLayout {

    /* renamed from: A */
    public long f316354A = -1;

    /* renamed from: d */
    public final String f316355d = ("MicroMsg.TP.MMMvVideoLayout@" + hashCode());

    /* renamed from: e */
    public C60700d f316356e;

    /* renamed from: f */
    public MMThumbPlayerTextureView f316357f;

    /* renamed from: g */
    public int f316358g;

    /* renamed from: h */
    public List<? extends C58010a> f316359h;

    /* renamed from: i */
    public long f316360i;

    /* renamed from: j */
    public MMHandler f316361j;

    /* renamed from: n */
    public C107681p f316362n = new C107681p();

    /* renamed from: o */
    public C109459m f316363o;

    /* renamed from: p */
    public C109458k f316364p;

    /* renamed from: q */
    public SurfaceTexture f316365q;

    /* renamed from: r */
    public boolean f316366r = true;

    /* renamed from: s */
    public SurfaceTexture f316367s;

    /* renamed from: t */
    public Surface f316368t;

    /* renamed from: u */
    public long f316369u = 200;

    /* renamed from: v */
    public C32227p<? super Long, ? super Long, C13598b0> f316370v;

    /* renamed from: w */
    public volatile boolean f316371w;

    /* renamed from: x */
    public volatile boolean f316372x;

    /* renamed from: y */
    public C60240c f316373y = new C60240c();

    /* renamed from: z */
    public long f316374z = -1;

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout$a */
    public interface C106183a {
        /* renamed from: a */
        void mo152059a();
    }

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout$b */
    public final class C106184b implements TextureView.SurfaceTextureListener {
        public C106184b() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surface");
            String str = MMMvVideoLayout.this.f316355d;
            Log.m105924i(str, "onSurfaceTextureAvailable, surface:" + surfaceTexture.hashCode() + ", width:" + i + ", height:" + i2 + ", enableEffect:" + MMMvVideoLayout.this.f316366r);
            MMMvVideoLayout mMMvVideoLayout = MMMvVideoLayout.this;
            mMMvVideoLayout.f316365q = surfaceTexture;
            mMMvVideoLayout.getEffector().mo84447h(i, i2);
            MMMvVideoLayout mMMvVideoLayout2 = MMMvVideoLayout.this;
            if (mMMvVideoLayout2.f316366r) {
                mMMvVideoLayout2.getEffector().mo84442d(surfaceTexture);
                return;
            }
            mMMvVideoLayout2.f316367s = surfaceTexture;
            Surface surface = mMMvVideoLayout2.f316368t;
            if (!(surface == null || surface == null)) {
                surface.release();
            }
            MMMvVideoLayout.this.f316368t = new Surface(MMMvVideoLayout.this.f316367s);
            C60700d currentPlayer = MMMvVideoLayout.this.getCurrentPlayer();
            if (currentPlayer != null) {
                currentPlayer.mo85606d(MMMvVideoLayout.this.f316368t, true);
            }
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            Surface surface;
            C87412m.m108594g(surfaceTexture, "surface");
            String str = MMMvVideoLayout.this.f316355d;
            Log.m105924i(str, "onSurfaceTextureDestroyed, surface:" + surfaceTexture.hashCode() + ' ' + MMMvVideoLayout.this.mo152024c());
            MMMvVideoLayout mMMvVideoLayout = MMMvVideoLayout.this;
            mMMvVideoLayout.f316365q = null;
            if (!mMMvVideoLayout.f316366r && (surface = mMMvVideoLayout.f316368t) != null) {
                surface.release();
            }
            C60700d currentPlayer = MMMvVideoLayout.this.getCurrentPlayer();
            if (currentPlayer == null) {
                return true;
            }
            C60695a.C60696a.m71000c(currentPlayer, (Surface) null, false, 2, (Object) null);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surface");
            String str = MMMvVideoLayout.this.f316355d;
            Log.m105924i(str, "onSurfaceTextureSizeChanged " + surfaceTexture + ", size:[" + i + ',' + i2 + ']');
            MMMvVideoLayout mMMvVideoLayout = MMMvVideoLayout.this;
            mMMvVideoLayout.f316365q = surfaceTexture;
            mMMvVideoLayout.getEffector().mo84447h(i, i2);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
            MMThumbPlayerTextureView mMThumbPlayerTextureView = MMMvVideoLayout.this.f316357f;
            if (mMThumbPlayerTextureView != null) {
                mMThumbPlayerTextureView.setAlpha(1.0f);
            }
            MMMvVideoLayout.this.f316365q = surfaceTexture;
        }
    }

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout$c */
    public static final class C106185c implements MMHandler.Callback {

        /* renamed from: d */
        public final /* synthetic */ MMMvVideoLayout f316376d;

        public C106185c(MMMvVideoLayout mMMvVideoLayout) {
            this.f316376d = mMMvVideoLayout;
        }

        public final boolean handleMessage(Message message) {
            C58010a aVar;
            C58010a aVar2;
            C87412m.m108594g(message, LocaleUtil.ITALIAN);
            if (message.what == this.f316376d.getCOMPLETE()) {
                MMMvVideoLayout mMMvVideoLayout = this.f316376d;
                C60700d currentPlayer = mMMvVideoLayout.getCurrentPlayer();
                String str = mMMvVideoLayout.f316355d;
                Log.m105924i(str, "onCompletion " + currentPlayer + ' ' + mMMvVideoLayout.mo152024c());
                String str2 = mMMvVideoLayout.f316355d;
                StringBuilder sb = new StringBuilder();
                sb.append("seekToNext ");
                sb.append(mMMvVideoLayout.mo152024c());
                Log.m105924i(str2, sb.toString());
                long currentTicks = Util.currentTicks();
                String str3 = mMMvVideoLayout.f316355d;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("recreatePlayer currentPlayer:");
                sb4.append(mMMvVideoLayout.f316356e);
                sb4.append(", playerSurface:");
                Surface surface = mMMvVideoLayout.f316368t;
                sb4.append(surface != null ? surface.hashCode() : 0);
                Log.m105924i(str3, sb4.toString());
                C60700d dVar = mMMvVideoLayout.f316356e;
                if (dVar != null) {
                    dVar.mo85613h((C32226l<? super C60695a, C13598b0>) null);
                    dVar.mo85609g();
                    C60695a.C60696a.m71001d(dVar, (C32224a) null, 1, (Object) null);
                    dVar.stopAsync();
                    dVar.recycle();
                    mMMvVideoLayout.f316373y.mo85227a(mMMvVideoLayout.f316358g, dVar.f172867D);
                }
                Log.m105924i(mMMvVideoLayout.f316355d, "removeCompleteTimer");
                C60700d dVar2 = mMMvVideoLayout.f316356e;
                if (dVar2 != null) {
                    dVar2.mo85620n((C61431n) null, 200);
                }
                MMHandler mMHandler = mMMvVideoLayout.f316361j;
                if (mMHandler != null) {
                    mMHandler.removeCallbacksAndMessages((Object) null);
                }
                Context context = mMMvVideoLayout.getContext();
                C87412m.m108593f(context, "context");
                C60700d dVar3 = new C60700d(context);
                mMMvVideoLayout.f316362n.mo84441c(dVar3);
                mMMvVideoLayout.f316356e = dVar3;
                String str4 = mMMvVideoLayout.f316355d;
                Log.m105924i(str4, "recreatePlayer finished, cost:" + Util.ticksToNow(currentTicks));
                mMMvVideoLayout.f316358g = mMMvVideoLayout.f316358g + 1;
                List<? extends C58010a> list = mMMvVideoLayout.f316359h;
                if ((list != null ? list.size() : 0) <= mMMvVideoLayout.f316358g) {
                    mMMvVideoLayout.f316358g = 0;
                }
                List<? extends C58010a> list2 = mMMvVideoLayout.f316359h;
                if (!(list2 == null || (aVar = (C58010a) list2.get(mMMvVideoLayout.f316358g)) == null)) {
                    C60700d dVar4 = mMMvVideoLayout.f316356e;
                    if (dVar4 != null) {
                        dVar4.setMediaInfo(aVar);
                    }
                    C60700d dVar5 = mMMvVideoLayout.f316356e;
                    long currentTicks2 = Util.currentTicks();
                    String str5 = mMMvVideoLayout.f316355d;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("initPlayer ");
                    sb5.append(mMMvVideoLayout.mo152024c());
                    sb5.append(", playerSurface:");
                    Surface surface2 = mMMvVideoLayout.f316368t;
                    sb5.append(surface2 != null ? surface2.hashCode() : 0);
                    sb5.append(", player:");
                    sb5.append(dVar5 != null ? dVar5.hashCode() : 0);
                    Log.m105924i(str5, sb5.toString());
                    if (dVar5 != null) {
                        dVar5.f172880k = true;
                    }
                    if (dVar5 != null) {
                        dVar5.setMute(true);
                    }
                    if (dVar5 != null) {
                        C58010a aVar3 = dVar5.f172873d;
                        dVar5.setLoop(aVar3 != null ? aVar3.f165940l : false);
                    }
                    if (!(dVar5 == null || (aVar2 = dVar5.f172873d) == null)) {
                        dVar5.f172869F = aVar2.f165944p;
                        C109459m mVar = mMMvVideoLayout.f316363o;
                        if (mVar != null) {
                            mVar.mo80357a(mMMvVideoLayout.f316358g, aVar2);
                        }
                    }
                    if (dVar5 != null) {
                        dVar5.mo85620n(new C109456e(mMMvVideoLayout, dVar5), mMMvVideoLayout.f316369u);
                    }
                    Log.m105924i(mMMvVideoLayout.f316355d, "start recreatePlayerSurface");
                    long currentTicks3 = Util.currentTicks();
                    Surface surface3 = mMMvVideoLayout.f316368t;
                    if (surface3 != null) {
                        surface3.release();
                    }
                    mMMvVideoLayout.f316368t = null;
                    mMMvVideoLayout.f316367s = null;
                    mMMvVideoLayout.f316362n.mo84445g(new C109457f(mMMvVideoLayout, dVar5, currentTicks3));
                    mMMvVideoLayout.f316372x = false;
                    if (dVar5 != null) {
                        mMMvVideoLayout.getClass();
                        dVar5.getClass();
                    }
                    String str6 = mMMvVideoLayout.f316355d;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("initPlayer ");
                    sb6.append(dVar5 != null ? dVar5.mo85605c() : null);
                    sb6.append(", currentPlayIndex:");
                    sb6.append(mMMvVideoLayout.f316358g);
                    sb6.append(", cost:");
                    sb6.append(Util.ticksToNow(currentTicks2));
                    Log.m105924i(str6, sb6.toString());
                    mMMvVideoLayout.f316374z = Util.currentTicks();
                    C60700d dVar6 = mMMvVideoLayout.f316356e;
                    if (dVar6 != null) {
                        dVar6.mo85619m();
                    }
                    MMMvVideoLayout.m142849d(mMMvVideoLayout, false, false, 2, (Object) null);
                    String str7 = mMMvVideoLayout.f316355d;
                    Log.m105924i(str7, "start play " + mMMvVideoLayout.mo152024c());
                    C60240c cVar = mMMvVideoLayout.f316373y;
                    cVar.getClass();
                    cVar.f171751b = Util.currentTicks();
                }
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout$d */
    public static final class C106186d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MMMvVideoLayout f316377d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106186d(MMMvVideoLayout mMMvVideoLayout) {
            super(0);
            this.f316377d = mMMvVideoLayout;
        }

        public Object invoke() {
            String str = this.f316377d.f316355d;
            StringBuilder sb = new StringBuilder();
            sb.append("initEffector finished, currentPlayer:");
            C60700d currentPlayer = this.f316377d.getCurrentPlayer();
            sb.append(currentPlayer != null ? currentPlayer.hashCode() : 0);
            Log.m105924i(str, sb.toString());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout$e */
    public static final class C106187e extends C87413o implements C32226l<Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MMMvVideoLayout f316378d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106187e(MMMvVideoLayout mMMvVideoLayout) {
            super(1);
            this.f316378d = mMMvVideoLayout;
        }

        public Object invoke(Object obj) {
            long longValue = ((Number) obj).longValue();
            MMThumbPlayerTextureView mMThumbPlayerTextureView = this.f316378d.f316357f;
            if (mMThumbPlayerTextureView != null) {
                mMThumbPlayerTextureView.setAlpha(1.0f);
            }
            this.f316378d.getClass();
            if (this.f316378d.getPauseVideoOnPlay()) {
                String str = this.f316378d.f316355d;
                Log.m105924i(str, "pauseVideoOnPlay, timestamp:" + longValue);
                MMMvVideoLayout mMMvVideoLayout = this.f316378d;
                C109458k kVar = mMMvVideoLayout.f316364p;
                if (kVar != null) {
                    mMMvVideoLayout.f316354A = kVar.getCurrentPosition();
                    C60700d dVar = mMMvVideoLayout.f316356e;
                    if (dVar != null) {
                        C60695a.C60696a.m70998a(dVar, false, 1, (Object) null);
                    }
                    Log.m105924i(mMMvVideoLayout.f316355d, "removeCompleteTimer");
                    C60700d dVar2 = mMMvVideoLayout.f316356e;
                    if (dVar2 != null) {
                        dVar2.mo85620n((C61431n) null, 200);
                    }
                    MMHandler mMHandler = mMMvVideoLayout.f316361j;
                    if (mMHandler != null) {
                        mMHandler.removeCallbacksAndMessages((Object) null);
                    }
                }
                String str2 = mMMvVideoLayout.f316355d;
                Log.m105924i(str2, "pause lastPauseMvPosition:" + mMMvVideoLayout.f316354A);
                this.f316378d.setPauseVideoOnPlay(false);
            }
            if (!this.f316378d.getLogFrameRender()) {
                Log.m105924i(this.f316378d.f316355d, "first frame render");
                this.f316378d.setLogFrameRender(true);
            }
            MMMvVideoLayout mMMvVideoLayout2 = this.f316378d;
            if (mMMvVideoLayout2.f316374z > 0) {
                String str3 = mMMvVideoLayout2.f316355d;
                Log.m105924i(str3, "first frame render cost:" + Util.ticksToNow(this.f316378d.f316374z));
                this.f316378d.f316374z = -1;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout$f */
    public static final class C106188f implements C59338a.C59339a {

        /* renamed from: a */
        public final /* synthetic */ MMMvVideoLayout f316379a;

        public C106188f(MMMvVideoLayout mMMvVideoLayout) {
            this.f316379a = mMMvVideoLayout;
        }

        /* renamed from: a */
        public long mo84452a() {
            C60700d currentPlayer = this.f316379a.getCurrentPlayer();
            if (currentPlayer != null) {
                return currentPlayer.getCurrentPositionMs();
            }
            return -1;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMMvVideoLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        mo152022a();
    }

    /* renamed from: d */
    public static void m142849d(MMMvVideoLayout mMMvVideoLayout, boolean z, boolean z2, int i, Object obj) {
        C60700d dVar;
        C58010a aVar;
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        C109458k kVar = mMMvVideoLayout.f316364p;
        if (kVar != null && (dVar = mMMvVideoLayout.f316356e) != null && (aVar = dVar.f172873d) != null) {
            long j = 0;
            long currentPosition = kVar.getCurrentPosition();
            long j2 = aVar.f165942n;
            long j3 = aVar.f165943o;
            long j4 = j2 + j3;
            if (!z) {
                MMHandler mMHandler = mMMvVideoLayout.f316361j;
                if (mMHandler != null) {
                    mMHandler.removeCallbacksAndMessages((Object) null);
                }
                MMHandler mMHandler2 = mMMvVideoLayout.f316361j;
                if (mMHandler2 != null) {
                    mMHandler2.sendEmptyMessageAtTime(0, SystemClock.uptimeMillis() + j3);
                }
                j = j3;
            } else if (j4 > currentPosition) {
                j = j4 - currentPosition;
                MMHandler mMHandler3 = mMMvVideoLayout.f316361j;
                if (mMHandler3 != null) {
                    mMHandler3.removeCallbacksAndMessages((Object) null);
                }
                MMHandler mMHandler4 = mMMvVideoLayout.f316361j;
                if (mMHandler4 != null) {
                    mMHandler4.sendEmptyMessageAtTime(0, SystemClock.uptimeMillis() + j);
                }
            }
            if (z2) {
                String str = mMMvVideoLayout.f316355d;
                Log.m105924i(str, "updateCompleteTimer currentMusicPosition:" + currentPosition + " endPosition:" + j4 + " waitTime:" + j);
            }
        }
    }

    /* renamed from: a */
    public final void mo152022a() {
        this.f316373y.f171750a = this.f316362n.f322159c;
        MMThumbPlayerTextureView mMThumbPlayerTextureView = new MMThumbPlayerTextureView(getContext());
        this.f316357f = mMThumbPlayerTextureView;
        mMThumbPlayerTextureView.setTextureListenerCallback(new C106184b());
        MMThumbPlayerTextureView mMThumbPlayerTextureView2 = this.f316357f;
        if (mMThumbPlayerTextureView2 != null) {
            mMThumbPlayerTextureView2.setAlpha(1.0f);
        }
        this.f316361j = new MMHandler(Looper.getMainLooper(), (MMHandler.Callback) new C106185c(this));
        if (this.f316366r) {
            mo152023b();
        }
    }

    /* renamed from: b */
    public final void mo152023b() {
        this.f316362n.mo84444f(new C106186d(this));
        C107681p pVar = this.f316362n;
        C106187e eVar = new C106187e(this);
        pVar.getClass();
        pVar.f322153D = eVar;
        this.f316362n.f322158b = new C106188f(this);
    }

    /* renamed from: c */
    public final String mo152024c() {
        StringBuilder sb = new StringBuilder();
        C60700d dVar = this.f316356e;
        sb.append(dVar != null ? dVar.mo85605c() : null);
        sb.append(" layout:");
        sb.append(hashCode());
        sb.append(" currentPlayIndex:");
        sb.append(this.f316358g);
        return sb.toString();
    }

    public final int getCOMPLETE() {
        return 0;
    }

    public final int getCurrentPlayIndex() {
        return this.f316358g;
    }

    public final C60700d getCurrentPlayer() {
        return this.f316356e;
    }

    public final C107681p getEffector() {
        return this.f316362n;
    }

    public final long getLastPauseMvPosition() {
        return this.f316354A;
    }

    public final boolean getLogFrameRender() {
        return this.f316372x;
    }

    public final C109459m getMediaChangeListener() {
        return this.f316363o;
    }

    public final List<C58010a> getMediaInfoList() {
        return this.f316359h;
    }

    public final C109458k getMvMusicProxy() {
        return this.f316364p;
    }

    public final C32227p<Long, Long, C13598b0> getOnProgressUpdate() {
        return this.f316370v;
    }

    public final boolean getPauseVideoOnPlay() {
        return this.f316371w;
    }

    public final MMHandler getPlayTimer() {
        return this.f316361j;
    }

    public final C61430l getPlayerActionListener() {
        return null;
    }

    public final C60240c getReportInfo() {
        return this.f316373y;
    }

    public final MMThumbPlayerTextureView getTextureView() {
        return this.f316357f;
    }

    public final long getTotalLength() {
        return this.f316360i;
    }

    public final void setCurrentPlayIndex(int i) {
        this.f316358g = i;
    }

    public final void setCurrentPlayer(C60700d dVar) {
        this.f316356e = dVar;
    }

    public final void setEffector(C107681p pVar) {
        C87412m.m108594g(pVar, "<set-?>");
        this.f316362n = pVar;
    }

    public final void setEnableEffect(boolean z) {
        String str = this.f316355d;
        Log.m105924i(str, "setEnableEffect:" + z + ", enableEffect:" + this.f316366r + ", surfaceTexture:" + this.f316365q);
        if (this.f316366r != z) {
            this.f316366r = z;
            if (z) {
                MMThumbPlayerTextureView mMThumbPlayerTextureView = this.f316357f;
                if (mMThumbPlayerTextureView != null) {
                    mMThumbPlayerTextureView.setScaleType(2);
                }
                MMThumbPlayerTextureView mMThumbPlayerTextureView2 = this.f316357f;
                ViewGroup.LayoutParams layoutParams = null;
                ViewGroup.LayoutParams layoutParams2 = mMThumbPlayerTextureView2 != null ? mMThumbPlayerTextureView2.getLayoutParams() : null;
                if (layoutParams2 != null) {
                    layoutParams2.width = -1;
                }
                MMThumbPlayerTextureView mMThumbPlayerTextureView3 = this.f316357f;
                if (mMThumbPlayerTextureView3 != null) {
                    layoutParams = mMThumbPlayerTextureView3.getLayoutParams();
                }
                if (layoutParams != null) {
                    layoutParams.height = -1;
                }
                MMThumbPlayerTextureView mMThumbPlayerTextureView4 = this.f316357f;
                if (mMThumbPlayerTextureView4 != null) {
                    mMThumbPlayerTextureView4.requestLayout();
                }
                mo152023b();
            }
        }
    }

    public final void setFirstFrameDrawCallback(C106183a aVar) {
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    public final void setLastPauseMvPosition(long j) {
        this.f316354A = j;
    }

    public final void setLogFrameRender(boolean z) {
        this.f316372x = z;
    }

    public final void setMediaChangeListener(C109459m mVar) {
        this.f316363o = mVar;
    }

    public final void setMediaInfoList(List<? extends C58010a> list) {
        this.f316359h = list;
    }

    public final void setMvMusicProxy(C109458k kVar) {
        this.f316364p = kVar;
    }

    public final void setOnProgressUpdate(C32227p<? super Long, ? super Long, C13598b0> pVar) {
        this.f316370v = pVar;
    }

    public final void setPauseVideoOnPlay(boolean z) {
        this.f316371w = z;
    }

    public final void setPlayTimer(MMHandler mMHandler) {
        this.f316361j = mMHandler;
    }

    public final void setPlayerActionListener(C61430l lVar) {
    }

    public final void setProgressUpdateInterval(long j) {
        if (j > 0) {
            this.f316369u = j;
        }
    }

    public final void setReportInfo(C60240c cVar) {
        C87412m.m108594g(cVar, "<set-?>");
        this.f316373y = cVar;
    }

    public final void setTextureView(MMThumbPlayerTextureView mMThumbPlayerTextureView) {
        this.f316357f = mMThumbPlayerTextureView;
    }

    public final void setTotalLength(long j) {
        this.f316360i = j;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMMvVideoLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        mo152022a();
    }
}
