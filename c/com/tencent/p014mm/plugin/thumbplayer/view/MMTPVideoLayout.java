package com.tencent.p014mm.plugin.thumbplayer.view;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import d03.C58010a;
import fy3.C32224a;
import fy3.C32226l;
import g03.C107681p;
import g03.C59338a;
import gy3.C87412m;
import j03.C60695a;
import j03.C60699c;
import j03.C60700d;
import kotlin.Metadata;
import m03.C61427h;
import m03.C61428i;
import m03.C61429j;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u00014B\u001b\b\u0016\u0012\u0006\u0010,\u001a\u00020+\u0012\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100B#\b\u0016\u0012\u0006\u0010,\u001a\u00020+\u0012\b\u0010.\u001a\u0004\u0018\u00010-\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\b/\u00103J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R2\u0010*\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010#\u0012\u0004\u0012\u00020\u0005\u0018\u00010\"8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u00065"}, mo182094d2 = {"Lcom/tencent/mm/plugin/thumbplayer/view/MMTPVideoLayout;", "Landroid/widget/FrameLayout;", "Lj03/c;", "Ld03/a;", "mediaInfo", "Lrx3/b0;", "setMediaInfo", "", "enable", "setEnableEffect", "Lj03/a;", "e", "Lj03/a;", "getPlayer", "()Lj03/a;", "setPlayer", "(Lj03/a;)V", "player", "Lcom/tencent/mm/plugin/thumbplayer/view/MMThumbPlayerTextureView;", "f", "Lcom/tencent/mm/plugin/thumbplayer/view/MMThumbPlayerTextureView;", "getTextureView", "()Lcom/tencent/mm/plugin/thumbplayer/view/MMThumbPlayerTextureView;", "setTextureView", "(Lcom/tencent/mm/plugin/thumbplayer/view/MMThumbPlayerTextureView;)V", "textureView", "Lg03/a;", "g", "Lg03/a;", "getEffector", "()Lg03/a;", "setEffector", "(Lg03/a;)V", "effector", "Lkotlin/Function1;", "Landroid/graphics/SurfaceTexture;", "o", "Lfy3/l;", "getOnFrameAvailable", "()Lfy3/l;", "setOnFrameAvailable", "(Lfy3/l;)V", "onFrameAvailable", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-thumbplayer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.thumbplayer.view.MMTPVideoLayout */
public final class MMTPVideoLayout extends FrameLayout implements C60699c {

    /* renamed from: p */
    public static final /* synthetic */ int f164629p = 0;

    /* renamed from: d */
    public final String f164630d = ("MicroMsg.TP.MMTPVideoLayout@" + hashCode());

    /* renamed from: e */
    public C60695a f164631e;

    /* renamed from: f */
    public MMThumbPlayerTextureView f164632f;

    /* renamed from: g */
    public C59338a f164633g = new C107681p();

    /* renamed from: h */
    public SurfaceTexture f164634h;

    /* renamed from: i */
    public boolean f164635i = true;

    /* renamed from: j */
    public SurfaceTexture f164636j;

    /* renamed from: n */
    public Surface f164637n;

    /* renamed from: o */
    public C32226l<? super SurfaceTexture, C13598b0> f164638o;

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.MMTPVideoLayout$a */
    public final class C57460a implements TextureView.SurfaceTextureListener {
        public C57460a() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surface");
            String str = MMTPVideoLayout.this.f164630d;
            Log.m105924i(str, "onSurfaceTextureAvailable, surface:" + surfaceTexture.hashCode() + ", width:" + i + ", height:" + i2 + ", enableEffect:" + MMTPVideoLayout.this.f164635i);
            MMTPVideoLayout mMTPVideoLayout = MMTPVideoLayout.this;
            mMTPVideoLayout.f164634h = surfaceTexture;
            mMTPVideoLayout.getClass();
            MMTPVideoLayout.this.getClass();
            MMTPVideoLayout.this.getEffector().mo84447h(i, i2);
            MMTPVideoLayout mMTPVideoLayout2 = MMTPVideoLayout.this;
            if (mMTPVideoLayout2.f164635i) {
                mMTPVideoLayout2.getEffector().mo84442d(surfaceTexture);
                return;
            }
            mMTPVideoLayout2.f164636j = surfaceTexture;
            Surface surface = mMTPVideoLayout2.f164637n;
            if (!(surface == null || surface == null)) {
                surface.release();
            }
            MMTPVideoLayout.this.f164637n = new Surface(MMTPVideoLayout.this.f164636j);
            C60695a player = MMTPVideoLayout.this.getPlayer();
            if (player != null) {
                player.mo85606d(MMTPVideoLayout.this.f164637n, true);
            }
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            Surface surface;
            C87412m.m108594g(surfaceTexture, "surface");
            String str = MMTPVideoLayout.this.f164630d;
            Log.m105924i(str, "onSurfaceTextureDestroyed, surface:" + surfaceTexture.hashCode() + ", enableEffect:" + MMTPVideoLayout.this.f164635i);
            MMTPVideoLayout mMTPVideoLayout = MMTPVideoLayout.this;
            mMTPVideoLayout.f164634h = null;
            if (!mMTPVideoLayout.f164635i && (surface = mMTPVideoLayout.f164637n) != null) {
                surface.release();
            }
            C60695a player = MMTPVideoLayout.this.getPlayer();
            if (player == null) {
                return true;
            }
            C60695a.C60696a.m71000c(player, (Surface) null, false, 2, (Object) null);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surface");
            String str = MMTPVideoLayout.this.f164630d;
            Log.m105924i(str, "onSurfaceTextureSizeChanged, surface:" + surfaceTexture.hashCode() + ", width:" + i + ", height:" + i2 + ", layout size:[" + MMTPVideoLayout.this.getWidth() + ',' + MMTPVideoLayout.this.getHeight() + ']');
            MMTPVideoLayout mMTPVideoLayout = MMTPVideoLayout.this;
            mMTPVideoLayout.f164634h = surfaceTexture;
            mMTPVideoLayout.getClass();
            MMTPVideoLayout.this.getClass();
            MMTPVideoLayout.this.getEffector().mo84447h(i, i2);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
            MMTPVideoLayout mMTPVideoLayout = MMTPVideoLayout.this;
            int i = MMTPVideoLayout.f164629p;
            MMThumbPlayerTextureView textureView = mMTPVideoLayout.getTextureView();
            if (textureView != null) {
                textureView.setAlpha(1.0f);
            }
            MMTPVideoLayout.this.f164634h = surfaceTexture;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMTPVideoLayout(Context context, boolean z) {
        super(context);
        C87412m.m108594g(context, "context");
        mo81118c(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003e, code lost:
        r2 = r2.mo85621o();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo81116a() {
        /*
            r5 = this;
            com.tencent.mm.plugin.thumbplayer.view.MMThumbPlayerTextureView r0 = r5.getTextureView()
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0011
            com.tencent.mm.plugin.thumbplayer.view.MMThumbPlayerTextureView r0 = r5.getTextureView()
            r5.removeView(r0)
        L_0x0011:
            com.tencent.mm.plugin.thumbplayer.view.MMThumbPlayerTextureView r0 = r5.getTextureView()
            com.tencent.mm.plugin.thumbplayer.view.MMTPVideoLayout$a r1 = new com.tencent.mm.plugin.thumbplayer.view.MMTPVideoLayout$a
            r1.<init>()
            r0.setTextureListenerCallback(r1)
            boolean r0 = r5.f164635i
            r1 = -1
            if (r0 == 0) goto L_0x002c
            com.tencent.mm.plugin.thumbplayer.view.MMThumbPlayerTextureView r0 = r5.getTextureView()
            r2 = 2
            r0.setScaleType(r2)
            r0 = -1
            goto L_0x0070
        L_0x002c:
            c03.b r0 = c03.C54600b.f153106a
            android.content.Context r1 = r5.getContext()
            java.lang.String r2 = "context"
            gy3.C87412m.m108593f(r1, r2)
            j03.a r2 = r5.getPlayer()
            r3 = 0
            if (r2 == 0) goto L_0x0047
            d03.a r2 = r2.mo85621o()
            if (r2 == 0) goto L_0x0047
            int r2 = r2.f165950v
            goto L_0x0048
        L_0x0047:
            r2 = 0
        L_0x0048:
            j03.a r4 = r5.getPlayer()
            if (r4 == 0) goto L_0x0057
            d03.a r4 = r4.mo85621o()
            if (r4 == 0) goto L_0x0057
            int r4 = r4.f165951w
            goto L_0x0058
        L_0x0057:
            r4 = 0
        L_0x0058:
            android.os.Bundle r0 = r0.mo75506a(r1, r2, r4)
            java.lang.String r1 = "width"
            int r1 = r0.getInt(r1, r3)
            java.lang.String r2 = "height"
            int r0 = r0.getInt(r2, r3)
            com.tencent.mm.plugin.thumbplayer.view.MMThumbPlayerTextureView r2 = r5.getTextureView()
            r2.mo81140b(r1, r0)
        L_0x0070:
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r1, r0)
            com.tencent.mm.plugin.thumbplayer.view.MMThumbPlayerTextureView r0 = r5.getTextureView()
            r5.addView(r0, r2)
            java.lang.String r0 = r5.f164630d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "initTextureView() "
            r1.append(r2)
            j03.a r2 = r5.getPlayer()
            if (r2 == 0) goto L_0x0093
            java.lang.String r2 = r2.mo85605c()
            goto L_0x0094
        L_0x0093:
            r2 = 0
        L_0x0094:
            r1.append(r2)
            java.lang.String r2 = ", layout size:["
            r1.append(r2)
            int r2 = r5.getWidth()
            r1.append(r2)
            r2 = 44
            r1.append(r2)
            int r2 = r5.getHeight()
            r1.append(r2)
            r2 = 93
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.thumbplayer.view.MMTPVideoLayout.mo81116a():void");
    }

    /* renamed from: b */
    public void mo81117b() {
        String str = this.f164630d;
        StringBuilder sb = new StringBuilder();
        sb.append("recreatePlayer, this.player:");
        C60695a player = getPlayer();
        int i = 0;
        sb.append(player != null ? player.hashCode() : 0);
        sb.append(", mediaInfo:");
        C60695a player2 = getPlayer();
        sb.append(player2 != null ? player2.mo85621o() : null);
        Log.m105924i(str, sb.toString());
        C60695a player3 = getPlayer();
        if (player3 != null) {
            player3.mo85609g();
        }
        C60695a player4 = getPlayer();
        if (player4 != null) {
            C60695a.C60696a.m71001d(player4, (C32224a) null, 1, (Object) null);
        }
        C60695a player5 = getPlayer();
        if (player5 != null) {
            player5.stopAsync();
        }
        C60695a player6 = getPlayer();
        if (player6 != null) {
            player6.recycle();
        }
        setPlayer((C60695a) null);
        Surface surface = this.f164637n;
        if (surface != null) {
            surface.release();
        }
        this.f164637n = null;
        this.f164636j = null;
        Context context = getContext();
        C87412m.m108593f(context, "context");
        C60700d dVar = new C60700d(context);
        getEffector().mo84441c(dVar);
        setPlayer(dVar);
        String str2 = this.f164630d;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("recreatePlayer finished, this.player:");
        C60695a player7 = getPlayer();
        if (player7 != null) {
            i = player7.hashCode();
        }
        sb4.append(i);
        sb4.append(", playerSurface:");
        sb4.append(this.f164637n);
        Log.m105924i(str2, sb4.toString());
    }

    /* renamed from: c */
    public final void mo81118c(boolean z) {
        if (z) {
            Context context = getContext();
            C87412m.m108593f(context, "context");
            C60700d dVar = new C60700d(context);
            getEffector().mo84441c(dVar);
            setPlayer(dVar);
        }
        setTextureView(new MMThumbPlayerTextureView(getContext()));
        getTextureView().setAlpha(1.0f);
        if (this.f164635i) {
            getEffector().mo84444f(new C61427h(this));
            getEffector().mo84449j(new C61428i(this));
        }
    }

    public C59338a getEffector() {
        return this.f164633g;
    }

    public C32226l<SurfaceTexture, C13598b0> getOnFrameAvailable() {
        return this.f164638o;
    }

    public C60695a getPlayer() {
        return this.f164631e;
    }

    public final MMThumbPlayerTextureView getTextureView() {
        MMThumbPlayerTextureView mMThumbPlayerTextureView = this.f164632f;
        if (mMThumbPlayerTextureView != null) {
            return mMThumbPlayerTextureView;
        }
        C87412m.m108603p("textureView");
        throw null;
    }

    public void setEffector(C59338a aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f164633g = aVar;
    }

    public void setEnableEffect(boolean z) {
        String str = this.f164630d;
        Log.m105924i(str, "setEnableEffect:" + z + ", surfaceTexture:" + this.f164634h);
        if (this.f164635i != z) {
            this.f164635i = z;
            if (z) {
                getTextureView().setScaleType(2);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                if (getTextureView().getParent() == null) {
                    addView(getTextureView(), layoutParams);
                } else {
                    getTextureView().setLayoutParams(layoutParams);
                    getTextureView().requestLayout();
                }
                getEffector().mo84444f(new C61427h(this));
                getEffector().mo84449j(new C61428i(this));
            }
        }
    }

    public void setMediaInfo(C58010a aVar) {
        C87412m.m108594g(aVar, "mediaInfo");
        C60695a player = getPlayer();
        if (player != null) {
            player.setMediaInfo(aVar);
        }
        String str = this.f164630d;
        Log.m105924i(str, "setMediaInfo:" + aVar);
        getEffector().setMediaInfo(aVar);
        getTextureView().mo81140b(aVar.f165950v, aVar.f165951w);
        Surface surface = this.f164637n;
        if (surface != null) {
            surface.release();
        }
        this.f164637n = null;
        this.f164636j = null;
        getEffector().mo84445g(new C61429j(this));
    }

    public void setOnFrameAvailable(C32226l<? super SurfaceTexture, C13598b0> lVar) {
        this.f164638o = lVar;
    }

    public void setPlayer(C60695a aVar) {
        this.f164631e = aVar;
    }

    public final void setTextureView(MMThumbPlayerTextureView mMThumbPlayerTextureView) {
        C87412m.m108594g(mMThumbPlayerTextureView, "<set-?>");
        this.f164632f = mMThumbPlayerTextureView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMTPVideoLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        mo81118c(true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMTPVideoLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        mo81118c(true);
    }
}
