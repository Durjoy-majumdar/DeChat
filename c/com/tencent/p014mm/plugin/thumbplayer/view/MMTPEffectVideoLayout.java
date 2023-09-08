package com.tencent.p014mm.plugin.thumbplayer.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.videocomposition.effect.EffectRenderView;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import d03.C58010a;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import j03.C60695a;
import kotlin.Metadata;
import p501dz.C58464f;
import q00.C62570d;
import q00.C62571i;
import rx3.C13598b0;
import vp3.C111580c;
import vp3.C111599l;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u00106\u001a\u000205\u0012\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b9\u0010:B#\b\u0016\u0012\u0006\u00106\u001a\u000205\u0012\b\u00108\u001a\u0004\u0018\u000107\u0012\u0006\u0010;\u001a\u00020\r¢\u0006\u0004\b9\u0010<J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\n\u001a\u0004\u0018\u00010\tR>\u0010\u0014\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R>\u0010\u0018\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R2\u0010 \u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010(\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u00100\u001a\u0004\u0018\u00010)8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0011\u00104\u001a\u0002018F¢\u0006\u0006\u001a\u0004\b2\u00103¨\u0006="}, mo182094d2 = {"Lcom/tencent/mm/plugin/thumbplayer/view/MMTPEffectVideoLayout;", "Landroid/widget/FrameLayout;", "Lvp3/c$a;", "Ld03/a;", "mediaInfo", "Lrx3/b0;", "setMediaInfo", "Lcom/tencent/mm/xeffect/effect/EffectManager;", "getEffectManager", "Landroid/graphics/Bitmap;", "getBitmap", "Lkotlin/Function3;", "Landroid/graphics/SurfaceTexture;", "", "e", "Lfy3/q;", "getOnFrameAvailable", "()Lfy3/q;", "setOnFrameAvailable", "(Lfy3/q;)V", "onFrameAvailable", "f", "getOnFirstFrameAvailable", "setOnFirstFrameAvailable", "onFirstFrameAvailable", "Lkotlin/Function1;", "h", "Lfy3/l;", "getOnSurfaceDestroyListener", "()Lfy3/l;", "setOnSurfaceDestroyListener", "(Lfy3/l;)V", "onSurfaceDestroyListener", "Lj03/a;", "i", "Lj03/a;", "getPlayer", "()Lj03/a;", "setPlayer", "(Lj03/a;)V", "player", "Landroid/view/Surface;", "n", "Landroid/view/Surface;", "getPlayerSurface", "()Landroid/view/Surface;", "setPlayerSurface", "(Landroid/view/Surface;)V", "playerSurface", "Lvp3/l;", "getEffectRenderReport", "()Lvp3/l;", "effectRenderReport", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "thumbplayer-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout */
public class MMTPEffectVideoLayout extends FrameLayout implements C111580c.C111581a {

    /* renamed from: d */
    public final String f164618d = ("MicroMsg.MMTPEffectVideoLayout@" + hashCode());

    /* renamed from: e */
    public C32228q<? super SurfaceTexture, ? super Integer, ? super Integer, C13598b0> f164619e;

    /* renamed from: f */
    public C32228q<? super SurfaceTexture, ? super Integer, ? super Integer, C13598b0> f164620f;

    /* renamed from: g */
    public boolean f164621g = true;

    /* renamed from: h */
    public C32226l<? super SurfaceTexture, C13598b0> f164622h;

    /* renamed from: i */
    public C60695a f164623i;

    /* renamed from: j */
    public final EffectRenderView f164624j;

    /* renamed from: n */
    public Surface f164625n;

    /* renamed from: o */
    public int f164626o;

    /* renamed from: p */
    public int f164627p;

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout$a */
    public static final class C57459a extends C87413o implements C32226l<C60695a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MMTPEffectVideoLayout f164628d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57459a(MMTPEffectVideoLayout mMTPEffectVideoLayout) {
            super(1);
            this.f164628d = mMTPEffectVideoLayout;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0042  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0049  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r7) {
            /*
                r6 = this;
                j03.a r7 = (j03.C60695a) r7
                java.lang.String r0 = "it"
                gy3.C87412m.m108594g(r7, r0)
                j03.b r0 = r7.getPlayer()
                if (r0 == 0) goto L_0x0014
                r1 = 205(0xcd, float:2.87E-43)
                long r0 = r0.getPropertyLong(r1)
                goto L_0x0016
            L_0x0014:
                r0 = 0
            L_0x0016:
                r2 = 90
                r4 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 == 0) goto L_0x0026
                r2 = 270(0x10e, double:1.334E-321)
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 != 0) goto L_0x0024
                goto L_0x0026
            L_0x0024:
                r2 = 0
                goto L_0x0027
            L_0x0026:
                r2 = 1
            L_0x0027:
                j03.b r3 = r7.getPlayer()
                if (r2 == 0) goto L_0x0034
                if (r3 == 0) goto L_0x003b
                int r3 = r3.getVideoHeight()
                goto L_0x003c
            L_0x0034:
                if (r3 == 0) goto L_0x003b
                int r3 = r3.getVideoWidth()
                goto L_0x003c
            L_0x003b:
                r3 = 0
            L_0x003c:
                j03.b r7 = r7.getPlayer()
                if (r2 == 0) goto L_0x0049
                if (r7 == 0) goto L_0x004f
                int r4 = r7.getVideoWidth()
                goto L_0x004f
            L_0x0049:
                if (r7 == 0) goto L_0x004f
                int r4 = r7.getVideoHeight()
            L_0x004f:
                com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout r7 = r6.f164628d
                com.tencent.mm.videocomposition.effect.EffectRenderView r7 = r7.f164624j
                int r1 = (int) r0
                r7.mo82358a(r3, r4, r1)
                rx3.b0 r7 = rx3.C13598b0.f38549a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.thumbplayer.view.MMTPEffectVideoLayout.C57459a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    static {
        ((C62570d) C86312j.m106911c(C62570d.class)).Up0();
        ((C62571i) C86312j.m106911c(C62571i.class)).mo87569Ra();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMTPEffectVideoLayout(Context context, boolean z) {
        super(context);
        C87412m.m108594g(context, "context");
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        this.f164624j = new EffectRenderView(context2);
        mo81098d(z);
    }

    /* renamed from: a */
    public void mo81095a(SurfaceTexture surfaceTexture) {
        String str = this.f164618d;
        StringBuilder sb = new StringBuilder();
        sb.append("onSurfaceTextureDestroyed, surface:");
        sb.append(surfaceTexture != null ? surfaceTexture.hashCode() : 0);
        Log.m105924i(str, sb.toString());
        Surface surface = this.f164625n;
        if (surface != null) {
            surface.release();
        }
        C60695a aVar = this.f164623i;
        if (aVar != null) {
            C60695a.C60696a.m71000c(aVar, (Surface) null, false, 2, (Object) null);
        }
        C32226l<? super SurfaceTexture, C13598b0> lVar = this.f164622h;
        if (lVar != null) {
            lVar.invoke(surfaceTexture);
        }
        this.f164621g = true;
    }

    /* renamed from: b */
    public void mo81096b(SurfaceTexture surfaceTexture, int i, int i2) {
        String str = this.f164618d;
        StringBuilder sb = new StringBuilder();
        sb.append("onSurfaceAvailable, surface:");
        boolean z = false;
        sb.append(surfaceTexture != null ? surfaceTexture.hashCode() : 0);
        sb.append(", width:");
        sb.append(i);
        sb.append(", height:");
        sb.append(i2);
        sb.append(", layout size:[");
        sb.append(getWidth());
        sb.append(',');
        sb.append(getHeight());
        sb.append(']');
        Log.m105924i(str, sb.toString());
        Surface surface = new Surface(surfaceTexture);
        this.f164625n = surface;
        this.f164626o = i;
        this.f164627p = i2;
        C60695a aVar = this.f164623i;
        if (aVar != null) {
            if (aVar != null && aVar.isPlaying()) {
                z = true;
            }
            aVar.mo85606d(surface, z);
        }
        mo81099e();
    }

    /* renamed from: c */
    public void mo81097c(SurfaceTexture surfaceTexture) {
        Surface surface = this.f164625n;
        boolean z = true;
        if (surface == null || !surface.isValid()) {
            z = false;
        }
        if (z) {
            this.f164624j.setAlpha(1.0f);
            if (this.f164621g) {
                C32228q<? super SurfaceTexture, ? super Integer, ? super Integer, C13598b0> qVar = this.f164620f;
                if (qVar != null) {
                    qVar.invoke(surfaceTexture, Integer.valueOf(this.f164626o), Integer.valueOf(this.f164627p));
                }
                this.f164620f = null;
                this.f164621g = false;
            }
            C32228q<? super SurfaceTexture, ? super Integer, ? super Integer, C13598b0> qVar2 = this.f164619e;
            if (qVar2 != null) {
                qVar2.invoke(surfaceTexture, Integer.valueOf(this.f164626o), Integer.valueOf(this.f164627p));
            }
        }
    }

    /* renamed from: d */
    public final void mo81098d(boolean z) {
        if (z) {
            Context context = getContext();
            C87412m.m108593f(context, "context");
            this.f164623i = ((C58464f) C86312j.m106911c(C58464f.class)).mo82801jf(context);
            mo81099e();
        }
        this.f164624j.setAlpha(1.0f);
        this.f164624j.setSurfaceCallback(this);
        addView(this.f164624j, new FrameLayout.LayoutParams(-1, -1));
        String str = this.f164618d;
        StringBuilder sb = new StringBuilder();
        sb.append("init ");
        C60695a aVar = this.f164623i;
        sb.append(aVar != null ? aVar.mo85605c() : null);
        sb.append(", layout size:[");
        sb.append(getWidth());
        sb.append(',');
        sb.append(getHeight());
        sb.append(']');
        Log.m105924i(str, sb.toString());
    }

    /* renamed from: e */
    public final void mo81099e() {
        C60695a aVar = this.f164623i;
        if (aVar != null) {
            aVar.mo85613h(new C57459a(this));
        }
    }

    /* renamed from: f */
    public final void mo81100f() {
        String str = this.f164618d;
        StringBuilder sb = new StringBuilder();
        sb.append("recreatePlayer, this.player:");
        C60695a aVar = this.f164623i;
        int i = 0;
        sb.append(aVar != null ? aVar.hashCode() : 0);
        sb.append(", mediaInfo:");
        C60695a aVar2 = this.f164623i;
        sb.append(aVar2 != null ? aVar2.mo85621o() : null);
        Log.m105924i(str, sb.toString());
        C60695a aVar3 = this.f164623i;
        if (aVar3 != null) {
            C60695a.C60696a.m71001d(aVar3, (C32224a) null, 1, (Object) null);
        }
        C60695a aVar4 = this.f164623i;
        if (aVar4 != null) {
            aVar4.mo85609g();
        }
        C60695a aVar5 = this.f164623i;
        if (aVar5 != null) {
            aVar5.stopAsync();
        }
        C60695a aVar6 = this.f164623i;
        if (aVar6 != null) {
            aVar6.recycle();
        }
        this.f164623i = null;
        Context context = getContext();
        C87412m.m108593f(context, "context");
        this.f164623i = ((C58464f) C86312j.m106911c(C58464f.class)).mo82801jf(context);
        mo81099e();
        String str2 = this.f164618d;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("recreatePlayer finished, this.player:");
        C60695a aVar7 = this.f164623i;
        if (aVar7 != null) {
            i = aVar7.hashCode();
        }
        sb4.append(i);
        sb4.append(", playerSurface:");
        sb4.append(this.f164625n);
        Log.m105924i(str2, sb4.toString());
    }

    /* renamed from: g */
    public final void mo81101g() {
        this.f164624j.f165561e.mo163270f();
    }

    public final Bitmap getBitmap() {
        return this.f164624j.getBitmap();
    }

    public final EffectManager getEffectManager() {
        return this.f164624j.getEffectManager();
    }

    public final C111599l getEffectRenderReport() {
        return this.f164624j.getReportData();
    }

    public final C32228q<SurfaceTexture, Integer, Integer, C13598b0> getOnFirstFrameAvailable() {
        return this.f164620f;
    }

    public final C32228q<SurfaceTexture, Integer, Integer, C13598b0> getOnFrameAvailable() {
        return this.f164619e;
    }

    public final C32226l<SurfaceTexture, C13598b0> getOnSurfaceDestroyListener() {
        return this.f164622h;
    }

    public final C60695a getPlayer() {
        return this.f164623i;
    }

    public final Surface getPlayerSurface() {
        return this.f164625n;
    }

    public void setMediaInfo(C58010a aVar) {
        C87412m.m108594g(aVar, "mediaInfo");
        C60695a aVar2 = this.f164623i;
        if (aVar2 != null) {
            aVar2.setMediaInfo(aVar);
        }
        String str = this.f164618d;
        Log.m105924i(str, "setMediaInfo:" + aVar);
        Surface surface = this.f164625n;
        if (surface != null) {
            surface.release();
        }
        this.f164625n = null;
        mo81099e();
    }

    public final void setOnFirstFrameAvailable(C32228q<? super SurfaceTexture, ? super Integer, ? super Integer, C13598b0> qVar) {
        this.f164620f = qVar;
    }

    public final void setOnFrameAvailable(C32228q<? super SurfaceTexture, ? super Integer, ? super Integer, C13598b0> qVar) {
        this.f164619e = qVar;
    }

    public final void setOnSurfaceDestroyListener(C32226l<? super SurfaceTexture, C13598b0> lVar) {
        this.f164622h = lVar;
    }

    public final void setPlayer(C60695a aVar) {
        this.f164623i = aVar;
    }

    public final void setPlayerSurface(Surface surface) {
        this.f164625n = surface;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMTPEffectVideoLayout(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        this.f164624j = new EffectRenderView(context2);
        mo81098d(true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMTPEffectVideoLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        this.f164624j = new EffectRenderView(context2);
        mo81098d(true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMTPEffectVideoLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        this.f164624j = new EffectRenderView(context2);
        mo81098d(true);
    }
}
