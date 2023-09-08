package com.tencent.p014mm.plugin.thumbplayer.view.recycler;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.widget.FrameLayout;
import c03.C54600b;
import com.tencent.p014mm.plugin.thumbplayer.view.MMThumbPlayerTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d03.C58010a;
import gy3.C87412m;
import j03.C60695a;
import j03.C60700d;
import kg3.C76577a;
import kotlin.Metadata;
import n03.C61597a;
import n03.C61598b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u00013B\u001b\b\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/B#\b\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b.\u00102J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0016R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010)\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u00064"}, mo182094d2 = {"Lcom/tencent/mm/plugin/thumbplayer/view/recycler/MMRecyclerVideoLayout;", "Landroid/widget/FrameLayout;", "Ln03/a;", "Ld03/a;", "mediaInfo", "Lrx3/b0;", "setMediaInfo", "", "isMute", "setMute", "isLoop", "setLoop", "", "d", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Lj03/d;", "e", "Lj03/d;", "getPlayer$plugin_thumbplayer_release", "()Lj03/d;", "setPlayer$plugin_thumbplayer_release", "(Lj03/d;)V", "player", "Lcom/tencent/mm/plugin/thumbplayer/view/MMThumbPlayerTextureView;", "f", "Lcom/tencent/mm/plugin/thumbplayer/view/MMThumbPlayerTextureView;", "getTextureView$plugin_thumbplayer_release", "()Lcom/tencent/mm/plugin/thumbplayer/view/MMThumbPlayerTextureView;", "setTextureView$plugin_thumbplayer_release", "(Lcom/tencent/mm/plugin/thumbplayer/view/MMThumbPlayerTextureView;)V", "textureView", "Landroid/view/Surface;", "g", "Landroid/view/Surface;", "getSurface$plugin_thumbplayer_release", "()Landroid/view/Surface;", "setSurface$plugin_thumbplayer_release", "(Landroid/view/Surface;)V", "surface", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-thumbplayer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.thumbplayer.view.recycler.MMRecyclerVideoLayout */
public class MMRecyclerVideoLayout extends FrameLayout implements C61597a {

    /* renamed from: d */
    public final String f164653d = ("MicroMsg.TP.MMRecyclerVideoLayout@" + hashCode());

    /* renamed from: e */
    public C60700d f164654e;

    /* renamed from: f */
    public MMThumbPlayerTextureView f164655f;

    /* renamed from: g */
    public Surface f164656g;

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.recycler.MMRecyclerVideoLayout$a */
    public final class C57462a implements TextureView.SurfaceTextureListener {
        public C57462a() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surfaceTexture");
            String tag = MMRecyclerVideoLayout.this.getTAG();
            StringBuilder sb = new StringBuilder();
            sb.append("onSurfaceTextureAvailable, surface:");
            Surface surface$plugin_thumbplayer_release = MMRecyclerVideoLayout.this.getSurface$plugin_thumbplayer_release();
            sb.append(surface$plugin_thumbplayer_release != null ? surface$plugin_thumbplayer_release.hashCode() : 0);
            sb.append(", width:");
            sb.append(i);
            sb.append(", height:");
            sb.append(i2);
            Log.m105924i(tag, sb.toString());
            MMRecyclerVideoLayout.this.setSurface$plugin_thumbplayer_release(new Surface(surfaceTexture));
            C60700d player$plugin_thumbplayer_release = MMRecyclerVideoLayout.this.getPlayer$plugin_thumbplayer_release();
            if (player$plugin_thumbplayer_release != null) {
                player$plugin_thumbplayer_release.mo85606d(MMRecyclerVideoLayout.this.getSurface$plugin_thumbplayer_release(), true);
            }
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
            String tag = MMRecyclerVideoLayout.this.getTAG();
            Log.m105924i(tag, "onSurfaceTextureDestroyed, surface:" + surfaceTexture.hashCode());
            C60700d player$plugin_thumbplayer_release = MMRecyclerVideoLayout.this.getPlayer$plugin_thumbplayer_release();
            if (player$plugin_thumbplayer_release == null) {
                return true;
            }
            C60695a.C60696a.m71000c(player$plugin_thumbplayer_release, (Surface) null, false, 2, (Object) null);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surface");
            String tag = MMRecyclerVideoLayout.this.getTAG();
            Log.m105924i(tag, "onSurfaceTextureSizeChanged, surface:" + surfaceTexture.hashCode() + ", width:" + i + ", height:" + i2 + ", layout size:[" + MMRecyclerVideoLayout.this.getWidth() + ',' + MMRecyclerVideoLayout.this.getHeight() + ']');
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
            MMThumbPlayerTextureView mMThumbPlayerTextureView = MMRecyclerVideoLayout.this.f164655f;
            if (mMThumbPlayerTextureView != null) {
                mMThumbPlayerTextureView.setAlpha(1.0f);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMRecyclerVideoLayout(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public void mo81155a() {
        Bundle bundle;
        C58010a aVar;
        C58010a aVar2;
        C58010a aVar3;
        C58010a aVar4;
        C58010a aVar5;
        MMThumbPlayerTextureView mMThumbPlayerTextureView = this.f164655f;
        String str = null;
        if ((mMThumbPlayerTextureView != null ? mMThumbPlayerTextureView.getParent() : null) != null) {
            removeView(this.f164655f);
        }
        MMThumbPlayerTextureView mMThumbPlayerTextureView2 = this.f164655f;
        if (mMThumbPlayerTextureView2 != null) {
            mMThumbPlayerTextureView2.setTextureListenerCallback(new C57462a());
        }
        C60700d dVar = this.f164654e;
        boolean z = true;
        if (dVar == null || (aVar5 = dVar.f172873d) == null || !aVar5.f165934f) {
            z = false;
        }
        if (z) {
            int i = (dVar == null || (aVar4 = dVar.f172873d) == null) ? 0 : aVar4.f165950v;
            int i2 = (dVar == null || (aVar3 = dVar.f172873d) == null) ? 0 : aVar3.f165951w;
            int A = C76577a.m92145A(MMApplicationContext.getContext());
            float f = ((float) i2) / (((float) i) / ((float) A));
            bundle = new Bundle();
            bundle.putInt("width", A);
            bundle.putInt("height", (int) f);
        } else {
            C54600b bVar = C54600b.f153106a;
            Context context = getContext();
            C87412m.m108593f(context, "context");
            C60700d dVar2 = this.f164654e;
            bundle = bVar.mo75506a(context, (dVar2 == null || (aVar2 = dVar2.f172873d) == null) ? 0 : aVar2.f165950v, (dVar2 == null || (aVar = dVar2.f172873d) == null) ? 0 : aVar.f165951w);
        }
        int i3 = bundle.getInt("width", 0);
        int i4 = bundle.getInt("height", 0);
        MMThumbPlayerTextureView mMThumbPlayerTextureView3 = this.f164655f;
        if (mMThumbPlayerTextureView3 != null) {
            mMThumbPlayerTextureView3.mo81140b(i3, i4);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.gravity = 17;
        addView(this.f164655f, layoutParams);
        String str2 = this.f164653d;
        StringBuilder sb = new StringBuilder();
        sb.append("initTextureView() ");
        C60700d dVar3 = this.f164654e;
        if (dVar3 != null) {
            str = dVar3.mo85605c();
        }
        sb.append(str);
        sb.append(", layout size:[");
        sb.append(i3);
        sb.append(',');
        sb.append(i4);
        sb.append(']');
        Log.m105924i(str2, sb.toString());
    }

    /* renamed from: b */
    public void mo81156b() {
        Context context = getContext();
        C87412m.m108593f(context, "context");
        this.f164654e = new C60700d(context);
        MMThumbPlayerTextureView mMThumbPlayerTextureView = new MMThumbPlayerTextureView(getContext());
        this.f164655f = mMThumbPlayerTextureView;
        mMThumbPlayerTextureView.setAlpha(1.0f);
    }

    /* renamed from: c */
    public void mo81157c(C61598b bVar) {
        C87412m.m108594g(bVar, "recycler");
        bVar.mo86535a(this);
    }

    public final C60700d getPlayer$plugin_thumbplayer_release() {
        return this.f164654e;
    }

    public final Surface getSurface$plugin_thumbplayer_release() {
        return this.f164656g;
    }

    public final String getTAG() {
        return this.f164653d;
    }

    public final MMThumbPlayerTextureView getTextureView$plugin_thumbplayer_release() {
        return this.f164655f;
    }

    public void setLoop(boolean z) {
        C60700d dVar = this.f164654e;
        if (dVar != null) {
            dVar.setLoop(z);
        }
    }

    public void setMediaInfo(C58010a aVar) {
        C87412m.m108594g(aVar, "mediaInfo");
        String str = this.f164653d;
        Log.m105924i(str, "setMediaInfo:" + aVar);
        C60700d dVar = this.f164654e;
        if (dVar != null) {
            dVar.setMediaInfo(aVar);
        }
    }

    public void setMute(boolean z) {
        C60700d dVar = this.f164654e;
        if (dVar != null) {
            dVar.setMute(z);
        }
    }

    public final void setPlayer$plugin_thumbplayer_release(C60700d dVar) {
        this.f164654e = dVar;
    }

    public final void setSurface$plugin_thumbplayer_release(Surface surface) {
        this.f164656g = surface;
    }

    public final void setTextureView$plugin_thumbplayer_release(MMThumbPlayerTextureView mMThumbPlayerTextureView) {
        this.f164655f = mMThumbPlayerTextureView;
    }

    public void start() {
        C60700d dVar = this.f164654e;
        if (dVar != null) {
            dVar.f172880k = true;
        }
        if (dVar != null) {
            dVar.mo85619m();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMRecyclerVideoLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMRecyclerVideoLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
