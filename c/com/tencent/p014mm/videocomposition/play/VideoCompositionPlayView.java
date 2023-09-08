package com.tencent.p014mm.videocomposition.play;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.TextureView;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.player.Callback;
import com.tencent.tav.player.Player;
import com.tencent.tav.player.PlayerLayer;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;
import sp3.C110807k;
import wp3.C111823a;
import wp3.C111824b;
import wp3.C111825c;
import wp3.C111826d;
import wp3.C111828f;
import wp3.C111829g;
import yp3.C112478a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0016\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010/\u001a\u00020\u0004¢\u0006\u0004\b0\u00101B\u0019\b\u0016\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b0\u00102J\"\u0010\u0007\u001a\u00020\u00052\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003J\u0010\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0011R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010*\u001a\u00020\u000e8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u00063"}, mo182094d2 = {"Lcom/tencent/mm/videocomposition/play/VideoCompositionPlayView;", "Landroid/view/TextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "Lkotlin/Function2;", "", "Lrx3/b0;", "onSizeChanged", "setOnSizeChangedListener", "Lwp3/a;", "callback", "setPlayerCallback", "Lwp3/c;", "profileCallback", "setPlayerProfileCallback", "", "loop", "setLoop", "", "getPosition", "getLaggingTime", "Lwp3/g;", "d", "Lwp3/g;", "getPlayer", "()Lwp3/g;", "setPlayer", "(Lwp3/g;)V", "player", "Lsp3/k;", "i", "Lsp3/k;", "getComposition", "()Lsp3/k;", "setComposition", "(Lsp3/k;)V", "composition", "q", "Z", "getFirstFrame", "()Z", "setFirstFrame", "(Z)V", "firstFrame", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "video_composition_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
/* renamed from: com.tencent.mm.videocomposition.play.VideoCompositionPlayView */
public class VideoCompositionPlayView extends TextureView implements TextureView.SurfaceTextureListener {

    /* renamed from: d */
    public C111829g f319838d;

    /* renamed from: e */
    public C32227p<? super Integer, ? super Integer, C13598b0> f319839e;

    /* renamed from: f */
    public SurfaceTexture f319840f;

    /* renamed from: g */
    public int f319841g;

    /* renamed from: h */
    public int f319842h;

    /* renamed from: i */
    public C110807k f319843i;

    /* renamed from: j */
    public boolean f319844j;

    /* renamed from: n */
    public boolean f319845n = true;

    /* renamed from: o */
    public C111823a f319846o;

    /* renamed from: p */
    public C111825c f319847p;

    /* renamed from: q */
    public boolean f319848q = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoCompositionPlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108595h(context, "context");
        C87412m.m108595h(attributeSet, "attrs");
        setSurfaceTextureListener(this);
        C112478a.m153625c("VideoCompositionPlayView", "create VLogCompositionPlayView", new Object[0]);
    }

    /* renamed from: b */
    public void mo79504b() {
        C111829g gVar;
        if (this.f319843i != null && this.f319840f != null) {
            C112478a.m153625c("VideoCompositionPlayView", "do createPlayer, composition:" + this.f319843i, new Object[0]);
            C110807k kVar = this.f319843i;
            if (kVar != null) {
                C111829g gVar2 = new C111829g(kVar);
                this.f319838d = gVar2;
                SurfaceTexture surfaceTexture = this.f319840f;
                if (surfaceTexture != null) {
                    int i = this.f319841g;
                    int i2 = this.f319842h;
                    gVar2.f334840e = i;
                    gVar2.f334841f = i2;
                    C112478a.m153625c("VideoCompositionPlayer", "createPlayerLayerBySurfaceTexture: " + surfaceTexture + ", size:[" + i + ", " + i2 + ']', new Object[0]);
                    new PlayerLayer(surfaceTexture, i, i2).setPlayer(gVar2.f334836a);
                    C112478a.m153625c("VideoCompositionPlayer", "setSurfaceTexture: " + surfaceTexture + ", width:" + i + ", height:" + i2, new Object[0]);
                    C111829g gVar3 = this.f319838d;
                    if (gVar3 != null) {
                        gVar3.mo163543b(this.f319845n);
                    }
                    C111823a aVar = this.f319846o;
                    if (!(aVar == null || (gVar = this.f319838d) == null)) {
                        gVar.f334839d = aVar;
                        Player player = gVar.f334836a;
                        if (player != null) {
                            player.setPlayerListener(new C111826d(gVar));
                        }
                    }
                    C111829g gVar4 = this.f319838d;
                    if (gVar4 != null) {
                        gVar4.f334844i = this.f319847p;
                        return;
                    }
                    return;
                }
                C87412m.m108601n();
                throw null;
            }
            C87412m.m108601n();
            throw null;
        }
    }

    /* renamed from: e */
    public final void mo154755e() {
        C111829g gVar = this.f319838d;
        if (gVar != null) {
            C112478a.m153625c("VideoCompositionPlayer", "refreshSurface isStarted:" + gVar.f334842g, new Object[0]);
            if (!gVar.f334842g) {
                SystemClock.elapsedRealtime();
                Player player = gVar.f334836a;
                if (player != null) {
                    player.refreshSurface((Callback) null);
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo154756f() {
        C112478a.m153625c("VideoCompositionPlayView", "release", new Object[0]);
        this.f319844j = false;
        C111829g gVar = this.f319838d;
        if (gVar != null) {
            C112478a.m153625c("VideoCompositionPlayer", "release", new Object[0]);
            Player player = gVar.f334836a;
            if (player != null) {
                player.release();
            }
            gVar.f334836a = null;
            gVar.f334842g = false;
        }
    }

    public final C110807k getComposition() {
        return this.f319843i;
    }

    public final boolean getFirstFrame() {
        return this.f319848q;
    }

    public final long getLaggingTime() {
        C111829g gVar = this.f319838d;
        if (gVar != null) {
            return gVar.f334838c.getLaggingTime();
        }
        return 0;
    }

    public final C111829g getPlayer() {
        return this.f319838d;
    }

    public final long getPosition() {
        C111829g gVar = this.f319838d;
        if (gVar != null) {
            return gVar.mo163542a();
        }
        return 0;
    }

    /* renamed from: h */
    public final void mo154761h() {
        C112478a.m153625c("VideoCompositionPlayView", "resume", new Object[0]);
        this.f319844j = true;
        C111829g gVar = this.f319838d;
        if (gVar != null) {
            gVar.mo163544c();
        }
    }

    /* renamed from: i */
    public final void mo154762i(long j) {
        C112478a.m153625c("VideoCompositionPlayView", "seekTo:" + j, new Object[0]);
        C111829g gVar = this.f319838d;
        if (gVar != null) {
            C112478a.m153625c("VideoCompositionPlayer", "seekTo:" + j + ", isUpdatingComposition:" + gVar.f334843h, new Object[0]);
            if (!gVar.f334843h) {
                long currentTimeMillis = System.currentTimeMillis();
                Player player = gVar.f334836a;
                if (player != null) {
                    player.seekToTime(new CMTime(j, 1000), new C111828f(gVar, currentTimeMillis, j));
                }
            }
        }
    }

    public final boolean isPlaying() {
        Player player;
        C111829g gVar = this.f319838d;
        if (gVar == null || (player = gVar.f334836a) == null) {
            return false;
        }
        return player.isPlaying();
    }

    /* renamed from: j */
    public final void mo154764j(long j, long j2) {
        Player player;
        C111829g gVar = this.f319838d;
        if (gVar != null && (player = gVar.f334836a) != null) {
            player.setPlayRange(new CMTimeRange(new CMTime(j, 1000), new CMTime(j2 - j, 1000)));
        }
    }

    /* renamed from: k */
    public void mo79510k(C110807k kVar) {
        C87412m.m108595h(kVar, "composition");
        C112478a.m153627e("VideoCompositionPlayView", hashCode() + " start, surface:" + this.f319840f + ", player:" + this.f319838d + ", surfaceWidth:" + this.f319841g + ", surfaceHeight:" + this.f319842h + ", composition:" + kVar.hashCode(), new Object[0]);
        if (this.f319838d != null && this.f319840f != null && this.f319841g > 0 && this.f319842h > 0 && (!C87412m.m108589b(kVar, this.f319843i))) {
            C112478a.m153625c("VideoCompositionPlayView", "startWithUpdateComposition", new Object[0]);
            C111829g gVar = this.f319838d;
            if (gVar != null) {
                gVar.mo163545d(kVar, true, false, -1);
            }
            this.f319843i = kVar;
        } else if (!C87412m.m108589b(kVar, this.f319843i)) {
            this.f319843i = kVar;
            if (this.f319840f != null && this.f319841g > 0 && this.f319842h > 0) {
                mo79504b();
            }
            this.f319844j = true;
            C111829g gVar2 = this.f319838d;
            if (gVar2 != null) {
                gVar2.mo163544c();
            }
        } else if (this.f319840f != null) {
            C112478a.m153625c("VideoCompositionPlayView", "same composition directly start", new Object[0]);
            this.f319844j = true;
            C111829g gVar3 = this.f319838d;
            if (gVar3 != null) {
                gVar3.mo163545d(kVar, true, false, -1);
            }
        } else {
            C112478a.m153625c("VideoCompositionPlayView", "same composition but surface is null", new Object[0]);
            this.f319844j = true;
        }
    }

    /* renamed from: l */
    public void mo154765l(C110807k kVar, boolean z, boolean z2, long j) {
        C87412m.m108595h(kVar, "composition");
        C112478a.m153625c("VideoCompositionPlayView", "updateComposition, playAfterUpdate:" + z + ", seekToOriginPosition:" + z2 + ", seekTo:" + j, new Object[0]);
        C111829g gVar = this.f319838d;
        if (gVar != null) {
            gVar.mo163545d(kVar, z, z2, j);
        }
        this.f319843i = kVar;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C111829g gVar;
        C87412m.m108595h(surfaceTexture, "surface");
        C112478a.m153625c("VideoCompositionPlayView", "surfaceAvailable, surfaceTexture:" + getSurfaceTexture() + ", width:" + i + ", height:" + i2, new Object[0]);
        this.f319840f = surfaceTexture;
        this.f319841g = i;
        this.f319842h = i2;
        if (this.f319843i != null) {
            mo79504b();
            if (this.f319844j && (gVar = this.f319838d) != null) {
                gVar.mo163544c();
            }
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C87412m.m108595h(surfaceTexture, "surface");
        C112478a.m153625c("VideoCompositionPlayView", "surfaceDestroy", new Object[0]);
        surfaceTexture.release();
        C111829g gVar = this.f319838d;
        if (gVar != null) {
            C112478a.m153625c("VideoCompositionPlayer", "release", new Object[0]);
            Player player = gVar.f334836a;
            if (player != null) {
                player.release();
            }
            gVar.f334836a = null;
            gVar.f334842g = false;
        }
        this.f319841g = 0;
        this.f319842h = 0;
        this.f319840f = null;
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108595h(surfaceTexture, "surface");
        C112478a.m153625c("VideoCompositionPlayView", "surfaceSizeChanged, surfaceTexture:" + getSurfaceTexture() + ", width:" + i + ", height:" + i2, new Object[0]);
        this.f319841g = i;
        this.f319842h = i2;
        C111829g gVar = this.f319838d;
        if (gVar != null) {
            C112478a.m153625c("VideoCompositionPlayer", "updateDisplaySize:[" + i + ", " + i2 + ']', new Object[0]);
            Player player = gVar.f334836a;
            if (player != null) {
                player.updateViewport(i, i2);
            }
        }
        C32227p<? super Integer, ? super Integer, C13598b0> pVar = this.f319839e;
        if (pVar != null) {
            C13598b0 invoke = pVar.invoke(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C87412m.m108595h(surfaceTexture, "surface");
        if (this.f319848q && this.f319844j) {
            C112478a.m153625c("VideoCompositionPlayView", "onSurfaceTextureUpdated", new Object[0]);
            C111823a aVar = this.f319846o;
            if (aVar != null) {
                aVar.mo79532r();
            }
            this.f319848q = false;
        }
        C111823a aVar2 = this.f319846o;
        if (!(aVar2 instanceof C111824b)) {
            aVar2 = null;
        }
        C111824b bVar = (C111824b) aVar2;
        if (bVar != null) {
            bVar.mo84658n();
        }
    }

    public boolean pause() {
        C112478a.m153625c("VideoCompositionPlayView", "pause", new Object[0]);
        this.f319844j = false;
        C111829g gVar = this.f319838d;
        if (gVar == null) {
            return true;
        }
        C112478a.m153625c("VideoCompositionPlayer", "pause", new Object[0]);
        Player player = gVar.f334836a;
        if (player != null) {
            player.pause();
        }
        gVar.f334842g = false;
        return true;
    }

    public final void setComposition(C110807k kVar) {
        this.f319843i = kVar;
    }

    public final void setFirstFrame(boolean z) {
        this.f319848q = z;
    }

    public final void setLoop(boolean z) {
        C112478a.m153625c("VideoCompositionPlayView", "setLoop:" + z, new Object[0]);
        this.f319845n = z;
        C111829g gVar = this.f319838d;
        if (gVar == null) {
            this.f319845n = z;
        } else if (gVar != null) {
            gVar.mo163543b(z);
        }
    }

    public final void setOnSizeChangedListener(C32227p<? super Integer, ? super Integer, C13598b0> pVar) {
        this.f319839e = pVar;
    }

    public final void setPlayer(C111829g gVar) {
        this.f319838d = gVar;
    }

    public final void setPlayerCallback(C111823a aVar) {
        C111829g gVar = this.f319838d;
        if (gVar != null) {
            gVar.f334839d = aVar;
            Player player = gVar.f334836a;
            if (player != null) {
                player.setPlayerListener(new C111826d(gVar));
            }
        }
        this.f319846o = aVar;
    }

    public final void setPlayerProfileCallback(C111825c cVar) {
        this.f319847p = cVar;
        C111829g gVar = this.f319838d;
        if (gVar != null) {
            gVar.f334844i = cVar;
        }
    }

    public void stop() {
        C112478a.m153625c("VideoCompositionPlayView", "stop", new Object[0]);
        this.f319844j = false;
        this.f319848q = true;
        C111829g gVar = this.f319838d;
        if (gVar != null) {
            C112478a.m153625c("VideoCompositionPlayer", "stop", new Object[0]);
            Player player = gVar.f334836a;
            if (player != null) {
                player.stop();
            }
            gVar.f334842g = false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoCompositionPlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108595h(context, "context");
        C87412m.m108595h(attributeSet, "attrs");
        setSurfaceTextureListener(this);
        C112478a.m153625c("VideoCompositionPlayView", "create VLogCompositionPlayView", new Object[0]);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoCompositionPlayView(Context context) {
        super(context);
        C87412m.m108595h(context, "context");
        setSurfaceTextureListener(this);
        C112478a.m153625c("VideoCompositionPlayView", "create VLogCompositionPlayView", new Object[0]);
    }
}
