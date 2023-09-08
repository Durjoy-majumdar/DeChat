package com.tencent.p014mm.plugin.mmplayer.player.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.mmplayer.render.MMSurfaceViewRender;
import com.tencent.p014mm.plugin.mmplayer.render.MMTextureViewRender;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.thumbplayer.api.TPOptionalParam;
import com.tencent.thumbplayer.tplayer.TPPlayer;
import db0.C58248a;
import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.Metadata;
import oa1.C117731d;
import p1081gi.C98121d;
import p1081gi.C98127h;
import rx3.C13598b0;
import u62.C22583d;
import u62.C22595e;
import u62.C22597f;
import u62.C22598g;
import u62.C22599h;
import v62.C22715a;
import y62.C23252a;
import z62.C66734b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001KB\u001b\b\u0016\u0012\u0006\u0010D\u001a\u00020C\u0012\b\u0010F\u001a\u0004\u0018\u00010E¢\u0006\u0004\bG\u0010HB#\b\u0016\u0012\u0006\u0010D\u001a\u00020C\u0012\b\u0010F\u001a\u0004\u0018\u00010E\u0012\u0006\u0010I\u001a\u00020\u0004¢\u0006\u0004\bG\u0010JJ\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0004J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\"\u0010\u0019\u001a\u00028\u00008\u0004@\u0004X.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0004@\u0004X.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010)\u001a\u0004\u0018\u00010\"8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u00101\u001a\u0004\u0018\u00010*8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00108\u001a\u00020\u00048\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010<\u001a\u0002098\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010A\u001a\u0002098\u0014@\u0014X\u000e¢\u0006\u0012\n\u0004\b@\u0010;\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?¨\u0006L"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mmplayer/player/view/MMVideoFrameLayout;", "Lu62/e;", "T", "Landroid/widget/FrameLayout;", "", "scaleType", "Lrx3/b0;", "setScaleType", "", "ratio", "setPlaySpeedRatio", "getPlaySpeedRatio", "", "getCurrentPlayMs", "status", "setBgPrepareStatus", "getBgPrepareStatus", "", "getFTPPTag", "d", "Lu62/e;", "getOnePlayContext", "()Lu62/e;", "setOnePlayContext", "(Lu62/e;)V", "onePlayContext", "Lu62/d;", "e", "Lu62/d;", "getPlayer", "()Lu62/d;", "setPlayer", "(Lu62/d;)V", "player", "Ly62/a;", "f", "Ly62/a;", "getRenderView", "()Ly62/a;", "setRenderView", "(Ly62/a;)V", "renderView", "Lz62/b;", "g", "Lz62/b;", "getMediaSource", "()Lz62/b;", "setMediaSource", "(Lz62/b;)V", "mediaSource", "n", "I", "getRenderViewScaleType", "()I", "setRenderViewScaleType", "(I)V", "renderViewScaleType", "", "o", "Z", "isOnlyAudio", "()Z", "setOnlyAudio", "(Z)V", "r", "isFirstFrameRendered", "setFirstFrameRendered", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "thumbplayer-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout */
public class MMVideoFrameLayout<T extends C22595e> extends FrameLayout {

    /* renamed from: s */
    public static final /* synthetic */ int f53150s = 0;

    /* renamed from: d */
    public T f53151d;

    /* renamed from: e */
    public C22583d f53152e;

    /* renamed from: f */
    public C23252a f53153f;

    /* renamed from: g */
    public C66734b f53154g;

    /* renamed from: h */
    public MMVideoFrameLayout<T>.a f53155h = new C18930a();

    /* renamed from: i */
    public float f53156i = 1.0f;

    /* renamed from: j */
    public final C58248a f53157j = new C58248a(this);

    /* renamed from: n */
    public int f53158n;

    /* renamed from: o */
    public boolean f53159o;

    /* renamed from: p */
    public SurfaceTexture f53160p;

    /* renamed from: q */
    public int f53161q;

    /* renamed from: r */
    public boolean f53162r;

    /* renamed from: com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout$a */
    public final class C18930a implements TextureView.SurfaceTextureListener, C23252a.C23253a, C22583d.C22591h, C22583d.C22584a, C22583d.C22594k, C22583d.C22589f, C22583d.C22593j, C22583d.C22585b, C22583d.C22587d, C22583d.C22588e, C22583d.C22590g, C22583d.C22586c, C22583d.C22592i {
        public C18930a() {
        }

        /* renamed from: a */
        public void mo24011a(Object obj, int i, int i2) {
            C87412m.m108594g(obj, "surface");
            String fTPPTag = MMVideoFrameLayout.this.getFTPPTag();
            Log.m105924i(fTPPTag, "FTPP.onSurfaceChange  surface:" + obj.hashCode() + ' ' + i + ' ' + i2);
        }

        /* renamed from: b */
        public void mo24012b(Object obj) {
            C87412m.m108594g(obj, "surface");
            if (obj instanceof SurfaceTexture) {
                MMVideoFrameLayout.m19906a(MMVideoFrameLayout.this, (SurfaceTexture) obj);
            } else if (obj instanceof SurfaceHolder) {
                MMVideoFrameLayout<T> mMVideoFrameLayout = MMVideoFrameLayout.this;
                SurfaceHolder surfaceHolder = (SurfaceHolder) obj;
                int i = MMVideoFrameLayout.f53150s;
                String fTPPTag = mMVideoFrameLayout.getFTPPTag();
                Log.m105924i(fTPPTag, "FTPP.handleOnSurfaceHolderAvailable() width:" + mMVideoFrameLayout.getWidth() + " height:" + mMVideoFrameLayout.getHeight() + " surfaceHolder:" + surfaceHolder.hashCode());
                mMVideoFrameLayout.getOnePlayContext().setSurface(surfaceHolder.getSurface());
                mMVideoFrameLayout.getPlayer().setSurface(surfaceHolder.getSurface());
                mMVideoFrameLayout.mo23999o();
            } else {
                String fTPPTag2 = MMVideoFrameLayout.this.getFTPPTag();
                Log.m105928w(fTPPTag2, "FTPP.onSurfaceAvailable() width:" + MMVideoFrameLayout.this.getWidth() + " height:" + MMVideoFrameLayout.this.getHeight() + " surface:" + obj);
            }
        }

        /* renamed from: c */
        public void mo24013c(Object obj) {
            C87412m.m108594g(obj, "surface");
        }

        /* renamed from: d */
        public boolean mo24014d(Object obj) {
            C13598b0 b0Var;
            String str;
            C87412m.m108594g(obj, "surface");
            Log.m105924i(MMVideoFrameLayout.this.getFTPPTag(), "FTPP.onSurfaceDestroy  surface:" + obj.hashCode());
            if (obj instanceof SurfaceTexture) {
                return false;
            }
            if (obj instanceof SurfaceHolder) {
                C13598b0 b0Var2 = null;
                MMVideoFrameLayout.this.getPlayer().setSurface((Surface) null);
                MMVideoFrameLayout<T> mMVideoFrameLayout = MMVideoFrameLayout.this;
                C58248a aVar = mMVideoFrameLayout.f53157j;
                C23252a renderView = mMVideoFrameLayout.getRenderView();
                aVar.getClass();
                if ((renderView instanceof MMSurfaceViewRender ? (MMSurfaceViewRender) renderView : null) == null) {
                    Log.m105924i(aVar.mo82999c(), "captureFrame return for renderView:" + renderView + '.');
                    return false;
                }
                if (aVar.f166778a.findViewWithTag("MMSurfaceViewSwitchHelper.COVER_VIEW") != null) {
                    Log.m105928w(aVar.mo82999c(), "showCoverBitmap return for duplicated.");
                    b0Var = C13598b0.f38549a;
                } else {
                    b0Var = null;
                }
                if (b0Var != null) {
                    return false;
                }
                Bitmap bitmap = aVar.f166782e;
                if (bitmap != null) {
                    aVar.mo83000d((View) renderView, bitmap, " captureFrame success.");
                    b0Var2 = C13598b0.f38549a;
                }
                if (b0Var2 != null) {
                    return false;
                }
                View view = (View) renderView;
                Bitmap bitmap2 = aVar.f166781d;
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    str = "captureFrame fail.";
                } else {
                    str = "version:" + i;
                }
                aVar.mo83000d(view, bitmap2, str);
                return false;
            }
            Log.m105928w(MMVideoFrameLayout.this.getFTPPTag(), "FTPP.onSurfaceDestroy() surface:" + obj);
            return false;
        }

        /* renamed from: e */
        public void mo24015e(C66734b bVar, int i, C98121d dVar) {
            C87412m.m108594g(bVar, "mediaSource");
            MMVideoFrameLayout.this.getClass();
        }

        /* renamed from: f */
        public void mo22592f(C22583d dVar, int i, int i2) {
            C87412m.m108594g(dVar, "player");
            String fTPPTag = MMVideoFrameLayout.this.getFTPPTag();
            Log.m105924i(fTPPTag, "FTPP.OnVideoSizeChanged() width:" + i + " height:" + i2);
            C23252a renderView = MMVideoFrameLayout.this.getRenderView();
            if (renderView != null) {
                renderView.mo36719b(i, i2);
            }
            MMVideoFrameLayout.this.mo23997j(i, i2);
        }

        /* renamed from: g */
        public void mo24016g(C66734b bVar) {
            C87412m.m108594g(bVar, "mediaSource");
            MMVideoFrameLayout.this.getClass();
        }

        /* renamed from: h */
        public void mo22593h(C22583d dVar) {
            C87412m.m108594g(dVar, WeChatBrands.Business.GROUP_MP);
            MMVideoFrameLayout<T> mMVideoFrameLayout = MMVideoFrameLayout.this;
            String fTPPTag = mMVideoFrameLayout.getFTPPTag();
            StringBuilder sb = new StringBuilder();
            sb.append("FTPP.onInfo#handleOnSeekComplete ");
            C66734b bVar = mMVideoFrameLayout.f53154g;
            sb.append(bVar != null ? bVar.f191765a : null);
            Log.m105924i(fTPPTag, sb.toString());
        }

        /* renamed from: i */
        public void mo22594i(C22583d dVar) {
            C87412m.m108594g(dVar, WeChatBrands.Business.GROUP_MP);
            Log.m105924i(MMVideoFrameLayout.this.getFTPPTag(), "FTPP.onInfo#firstVideoFrameRendered");
            MMVideoFrameLayout<T> mMVideoFrameLayout = MMVideoFrameLayout.this;
            mMVideoFrameLayout.mo23985g("onFirstFrameRendered", mMVideoFrameLayout.f53161q);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.String} */
        /* JADX WARNING: type inference failed for: r7v3 */
        /* JADX WARNING: type inference failed for: r7v4, types: [android.view.View] */
        /* JADX WARNING: type inference failed for: r7v9 */
        /* JADX WARNING: type inference failed for: r7v10 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo22595j(u62.C22583d r3, int r4, long r5, long r7, java.lang.Object r9) {
            /*
                r2 = this;
                java.lang.String r0 = "mp"
                gy3.C87412m.m108594g(r3, r0)
                com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout<T> r3 = com.tencent.p014mm.plugin.mmplayer.player.view.MMVideoFrameLayout.this
                java.lang.String r3 = r3.getFTPPTag()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "FTPP.onInfo() what:"
                r0.append(r1)
                r0.append(r4)
                java.lang.String r1 = " arg1:"
                r0.append(r1)
                r0.append(r5)
                java.lang.String r1 = " arg2:"
                r0.append(r1)
                r0.append(r7)
                java.lang.String r7 = " extraObject:"
                r0.append(r7)
                r0.append(r9)
                java.lang.String r7 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
                r3 = 105(0x69, float:1.47E-43)
                if (r4 == r3) goto L_0x00cf
                r3 = 108(0x6c, float:1.51E-43)
                r7 = 0
                if (r4 == r3) goto L_0x00ae
                r3 = 150(0x96, float:2.1E-43)
                if (r4 == r3) goto L_0x00a8
                r3 = 204(0xcc, float:2.86E-43)
                if (r4 == r3) goto L_0x007b
                r3 = 502(0x1f6, float:7.03E-43)
                if (r4 == r3) goto L_0x0075
                r3 = 1006(0x3ee, float:1.41E-42)
                if (r4 == r3) goto L_0x0052
                goto L_0x00da
            L_0x0052:
                boolean r3 = r9 instanceof com.tencent.thumbplayer.api.TPPlayerMsg.TPDownLoadProgressInfo
                if (r3 == 0) goto L_0x00da
                com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout<T> r3 = com.tencent.p014mm.plugin.mmplayer.player.view.MMVideoFrameLayout.this
                java.lang.String r3 = r3.getFTPPTag()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "FTPP.onInfo#downloadProgressUpdate: "
                r4.append(r5)
                com.tencent.thumbplayer.api.TPPlayerMsg$TPDownLoadProgressInfo r9 = (com.tencent.thumbplayer.api.TPPlayerMsg.TPDownLoadProgressInfo) r9
                long r5 = r9.playableDurationMS
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                goto L_0x00da
            L_0x0075:
                com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout<T> r3 = com.tencent.p014mm.plugin.mmplayer.player.view.MMVideoFrameLayout.this
                r3.getClass()
                goto L_0x00da
            L_0x007b:
                com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout<T> r3 = com.tencent.p014mm.plugin.mmplayer.player.view.MMVideoFrameLayout.this
                int r4 = (int) r5
                r3.getClass()
                java.lang.String r5 = r3.getFTPPTag()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r8 = "FTPP.onInfo#videoDecodeType:"
                r6.append(r8)
                r6.append(r4)
                r4 = 32
                r6.append(r4)
                z62.b r3 = r3.f53154g
                if (r3 == 0) goto L_0x009d
                java.lang.String r7 = r3.f191765a
            L_0x009d:
                r6.append(r7)
                java.lang.String r3 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
                goto L_0x00da
            L_0x00a8:
                com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout<T> r3 = com.tencent.p014mm.plugin.mmplayer.player.view.MMVideoFrameLayout.this
                r3.mo23996i()
                goto L_0x00da
            L_0x00ae:
                com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout<T> r3 = com.tencent.p014mm.plugin.mmplayer.player.view.MMVideoFrameLayout.this
                java.lang.String r3 = r3.getFTPPTag()
                java.lang.String r4 = "FTPP.onInfo#firstVideoFrameRenderedAfterSurfaceChange"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout<T> r3 = com.tencent.p014mm.plugin.mmplayer.player.view.MMVideoFrameLayout.this
                y62.a r4 = r3.f53153f
                boolean r5 = r4 instanceof com.tencent.p014mm.plugin.mmplayer.render.MMSurfaceViewRender
                if (r5 == 0) goto L_0x00c4
                r7 = r4
                com.tencent.mm.plugin.mmplayer.render.MMSurfaceViewRender r7 = (com.tencent.p014mm.plugin.mmplayer.render.MMSurfaceViewRender) r7
            L_0x00c4:
                if (r7 == 0) goto L_0x00da
                x62.a r4 = new x62.a
                r4.<init>(r3)
                r7.post(r4)
                goto L_0x00da
            L_0x00cf:
                com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout<T> r3 = com.tencent.p014mm.plugin.mmplayer.player.view.MMVideoFrameLayout.this
                java.lang.String r3 = r3.getFTPPTag()
                java.lang.String r4 = "FTPP.onInfo#firstAudioFrameRendered"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            L_0x00da:
                com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout<T> r3 = com.tencent.p014mm.plugin.mmplayer.player.view.MMVideoFrameLayout.this
                r3.getClass()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.mmplayer.player.view.MMVideoFrameLayout.C18930a.mo22595j(u62.d, int, long, long, java.lang.Object):void");
        }

        /* renamed from: k */
        public void mo22596k(C22583d dVar, int i, int i2) {
            C87412m.m108594g(dVar, WeChatBrands.Business.GROUP_MP);
            String fTPPTag = MMVideoFrameLayout.this.getFTPPTag();
            Log.m105924i(fTPPTag, "FTPP.onStateChange() preState:" + i + " curState:" + i2);
            Log.m105924i(MMVideoFrameLayout.this.getFTPPTag(), "FTPP.handleOnStateChange");
        }

        /* renamed from: l */
        public void mo22597l(C22583d dVar, long j, long j2) {
            C87412m.m108594g(dVar, WeChatBrands.Business.GROUP_MP);
            MMVideoFrameLayout.this.mo23995h(dVar, j, j2);
        }

        /* renamed from: m */
        public void mo24017m(C66734b bVar, int i, int i2) {
            C87412m.m108594g(bVar, "mediaSource");
        }

        /* renamed from: n */
        public void mo22598n(C22583d dVar) {
            C87412m.m108594g(dVar, WeChatBrands.Business.GROUP_MP);
            String fTPPTag = MMVideoFrameLayout.this.getFTPPTag();
            Log.m105924i(fTPPTag, "FTPP.onInfo#onBufferingEnd() pos:" + MMVideoFrameLayout.this.getCurrentPlayMs());
            MMVideoFrameLayout.this.getClass();
        }

        /* renamed from: o */
        public void mo22599o(C22583d dVar) {
            C87412m.m108594g(dVar, "player");
            MMVideoFrameLayout.this.mo23983e();
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surfaceTexture");
            String fTPPTag = MMVideoFrameLayout.this.getFTPPTag();
            Log.m105924i(fTPPTag, "FTPP.onSurfaceTextureAvailable  surfaceTexture:" + surfaceTexture.hashCode() + ' ' + i + ' ' + i2);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surfaceTexture");
            String fTPPTag = MMVideoFrameLayout.this.getFTPPTag();
            Log.m105924i(fTPPTag, "FTPP.onSurfaceTextureDestroyed() surfaceTexture:" + surfaceTexture.hashCode());
            return false;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surfaceTexture");
            String fTPPTag = MMVideoFrameLayout.this.getFTPPTag();
            Log.m105924i(fTPPTag, "FTPP.onSurfaceTextureSizeChanged  surfaceTexture:" + surfaceTexture.hashCode() + ' ' + i + ' ' + i2);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
            MMVideoFrameLayout.this.getClass();
        }

        /* renamed from: p */
        public void mo22600p(C22583d dVar, C22599h hVar) {
            C87412m.m108594g(dVar, WeChatBrands.Business.GROUP_MP);
            C87412m.m108594g(hVar, "mediaInfo");
            MMVideoFrameLayout<T> mMVideoFrameLayout = MMVideoFrameLayout.this;
            mMVideoFrameLayout.getClass();
            Log.m105924i(mMVideoFrameLayout.getFTPPTag(), "FTPP.handleOnPrepared");
            mMVideoFrameLayout.getOnePlayContext().mo35699c();
            if (mMVideoFrameLayout.getOnePlayContext().mo35697a()) {
                MMVideoFrameLayout.m19909n(mMVideoFrameLayout, "onPrepared", 0, 2, (Object) null);
            } else {
                mMVideoFrameLayout.setBgPrepareStatus(1);
            }
        }

        /* renamed from: q */
        public void mo22601q(C22583d dVar, int i, int i2) {
            C87412m.m108594g(dVar, WeChatBrands.Business.GROUP_MP);
            MMVideoFrameLayout.this.mo23984f(dVar, i, i2);
        }

        /* renamed from: r */
        public void mo24022r(C66734b bVar, C98127h hVar, C98121d dVar) {
            C87412m.m108594g(bVar, "mediaSource");
            MMVideoFrameLayout.this.getClass();
        }

        /* renamed from: s */
        public void mo24023s(C66734b bVar, int i, int i2) {
            C87412m.m108594g(bVar, "mediaSource");
            MMVideoFrameLayout.this.getClass();
        }

        /* renamed from: t */
        public void mo24024t(C66734b bVar, int i, int i2, boolean z) {
            C87412m.m108594g(bVar, "mediaSource");
            MMVideoFrameLayout.this.getClass();
        }

        /* renamed from: u */
        public void mo22602u(C22583d dVar) {
            C87412m.m108594g(dVar, WeChatBrands.Business.GROUP_MP);
            String fTPPTag = MMVideoFrameLayout.this.getFTPPTag();
            Log.m105924i(fTPPTag, "FTPP.onInfo#onBufferingStart() pos:" + MMVideoFrameLayout.this.getCurrentPlayMs());
            MMVideoFrameLayout<T> mMVideoFrameLayout = MMVideoFrameLayout.this;
            C66734b mediaSource = mMVideoFrameLayout.getMediaSource();
            mMVideoFrameLayout.mo23982d(mediaSource != null ? mediaSource.f191765a : null);
        }

        /* renamed from: v */
        public void mo24025v(C66734b bVar, int i, int i2) {
            C87412m.m108594g(bVar, "mediaSource");
            MMVideoFrameLayout.this.getClass();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMVideoFrameLayout(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        m19907k(this, (String) null, 1, (Object) null);
    }

    /* renamed from: a */
    public static final void m19906a(MMVideoFrameLayout mMVideoFrameLayout, SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (!(mMVideoFrameLayout.f53153f instanceof MMTextureViewRender)) {
            String fTPPTag = mMVideoFrameLayout.getFTPPTag();
            Log.m105924i(fTPPTag, "handleOnSurfaceAvailable return for renderView:" + mMVideoFrameLayout.f53153f);
            return;
        }
        String fTPPTag2 = mMVideoFrameLayout.getFTPPTag();
        StringBuilder sb = new StringBuilder();
        sb.append("FTPP.handleOnSurfaceAvailable() width:");
        sb.append(mMVideoFrameLayout.getWidth());
        sb.append(" height:");
        sb.append(mMVideoFrameLayout.getHeight());
        sb.append(" surfaceTexture:");
        sb.append(surfaceTexture.hashCode());
        sb.append(" curSurfaceTexture:");
        SurfaceTexture surfaceTexture3 = mMVideoFrameLayout.f53160p;
        Boolean bool = null;
        sb.append(surfaceTexture3 != null ? Integer.valueOf(surfaceTexture3.hashCode()) : null);
        Log.m105924i(fTPPTag2, sb.toString());
        mMVideoFrameLayout.getOnePlayContext().mo35699c();
        if (mMVideoFrameLayout.getOnePlayContext().getSurface() == null || (surfaceTexture2 = mMVideoFrameLayout.f53160p) == null) {
            mMVideoFrameLayout.f53160p = surfaceTexture;
            mMVideoFrameLayout.getOnePlayContext().setSurface(new Surface(surfaceTexture));
            mMVideoFrameLayout.getPlayer().setSurface(mMVideoFrameLayout.getOnePlayContext().getSurface());
            mMVideoFrameLayout.mo23999o();
            return;
        }
        Boolean valueOf = Build.VERSION.SDK_INT < 26 ? Boolean.FALSE : Boolean.valueOf(surfaceTexture2.isReleased());
        String fTPPTag3 = mMVideoFrameLayout.getFTPPTag();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("FTPP.handleOnSurfaceAvailable() return for surface:");
        Surface surface = mMVideoFrameLayout.getOnePlayContext().getSurface();
        sb4.append(surface != null ? Integer.valueOf(surface.hashCode()) : null);
        sb4.append(" valid:");
        Surface surface2 = mMVideoFrameLayout.getOnePlayContext().getSurface();
        if (surface2 != null) {
            bool = Boolean.valueOf(surface2.isValid());
        }
        sb4.append(bool);
        sb4.append(" released:");
        sb4.append(valueOf);
        Log.m105924i(fTPPTag3, sb4.toString());
        C23252a aVar = mMVideoFrameLayout.f53153f;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender");
        SurfaceTexture surfaceTexture4 = mMVideoFrameLayout.f53160p;
        C87412m.m108591d(surfaceTexture4);
        ((MMTextureViewRender) aVar).setSurfaceTexture(surfaceTexture4);
    }

    /* renamed from: k */
    public static void m19907k(MMVideoFrameLayout mMVideoFrameLayout, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = "MMVideoFrameLayout";
            }
            mMVideoFrameLayout.getClass();
            C87412m.m108594g(str, "tag");
            ConcurrentSkipListSet<Integer> concurrentSkipListSet = C22597f.f64933d;
            StringBuilder sb = new StringBuilder();
            sb.append("MM-OPC.attachVideoView view:");
            sb.append(mMVideoFrameLayout.hashCode());
            sb.append(' ');
            ConcurrentSkipListSet<Integer> concurrentSkipListSet2 = C22597f.f64933d;
            sb.append(concurrentSkipListSet2);
            Log.m105924i("MM-OPC-" + str, sb.toString());
            concurrentSkipListSet2.add(Integer.valueOf(mMVideoFrameLayout.hashCode()));
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            TPPlayer tPPlayer = new TPPlayer(context);
            boolean g = C117731d.m166007c().mo182445g("clicfg_finder_player_use_soft_decoder", false, true);
            Log.m105924i("MMPlayerFactory", "getTPOptionalParam " + g);
            TPOptionalParam buildLong = g ? new TPOptionalParam().buildLong(203, 3) : new TPOptionalParam().buildBoolean(123, false);
            tPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(102, 1000));
            tPPlayer.setPlayerOptionalParam(buildLong);
            mMVideoFrameLayout.setPlayer(new C22598g(new C22715a(tPPlayer, (C8480h) null)));
            mMVideoFrameLayout.getPlayer().mo35666m(mMVideoFrameLayout.f53155h);
            mMVideoFrameLayout.getPlayer().mo35664k(mMVideoFrameLayout.f53155h);
            mMVideoFrameLayout.getPlayer().mo35667n(mMVideoFrameLayout.f53155h);
            mMVideoFrameLayout.getPlayer().mo35661h(mMVideoFrameLayout.f53155h);
            mMVideoFrameLayout.getPlayer().mo35662i(mMVideoFrameLayout.f53155h);
            mMVideoFrameLayout.getPlayer().mo35658g(mMVideoFrameLayout.f53155h);
            mMVideoFrameLayout.getPlayer().mo35656d(mMVideoFrameLayout.f53155h);
            mMVideoFrameLayout.getPlayer().mo35668o(mMVideoFrameLayout.f53155h);
            mMVideoFrameLayout.getPlayer().mo35657e(mMVideoFrameLayout.f53155h);
            mMVideoFrameLayout.getPlayer().mo35665l(mMVideoFrameLayout.f53155h);
            mMVideoFrameLayout.getPlayer().mo35663j(mMVideoFrameLayout.f53155h);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
    }

    /* renamed from: l */
    public static void m19908l(MMVideoFrameLayout mMVideoFrameLayout, boolean z, int i, int i2, int i3, int i4, Rect rect, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 2) != 0) {
                i = 0;
            }
            if ((i5 & 4) != 0) {
                i2 = 0;
            }
            if ((i5 & 8) != 0) {
                i3 = 0;
            }
            if ((i5 & 16) != 0) {
                i4 = 0;
            }
            if ((i5 & 32) != 0) {
                rect = null;
            }
            C23252a aVar = mMVideoFrameLayout.f53153f;
            if (aVar == null) {
                aVar = mMVideoFrameLayout.mo23981c(z, "initRenderView#" + z);
            } else if (z) {
                if (aVar instanceof SurfaceTexture) {
                    aVar = mMVideoFrameLayout.mo23981c(z, "initRenderView#MMTextureViewRender");
                }
            } else if (!(aVar instanceof SurfaceTexture)) {
                aVar = mMVideoFrameLayout.mo23981c(z, "initRenderView#MMSurfaceViewRender");
            }
            mMVideoFrameLayout.f53153f = aVar;
            if ((aVar instanceof View) && ((View) aVar).getParent() != null) {
                C23252a aVar2 = mMVideoFrameLayout.f53153f;
                C87412m.m108592e(aVar2, "null cannot be cast to non-null type android.view.View");
                mMVideoFrameLayout.removeView((View) aVar2);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            C23252a aVar3 = mMVideoFrameLayout.f53153f;
            C87412m.m108592e(aVar3, "null cannot be cast to non-null type android.view.View");
            mMVideoFrameLayout.addView((View) aVar3, layoutParams);
            C23252a aVar4 = mMVideoFrameLayout.f53153f;
            if (aVar4 != null) {
                aVar4.setScaleType(mMVideoFrameLayout.f53158n);
            }
            C23252a aVar5 = mMVideoFrameLayout.f53153f;
            if (aVar5 != null) {
                aVar5.mo36719b(i, i2);
            }
            if (rect != null) {
                C23252a aVar6 = mMVideoFrameLayout.f53153f;
                if (aVar6 != null) {
                    aVar6.setCropRect(new Rect(rect.left, rect.top, rect.right, rect.bottom));
                }
                C23252a aVar7 = mMVideoFrameLayout.f53153f;
                if (aVar7 != null) {
                    aVar7.mo36718a(i3, i4);
                }
            }
            String fTPPTag = mMVideoFrameLayout.getFTPPTag();
            Log.m105924i(fTPPTag, "initTextureView, container[" + i + " x " + i2 + "] video[" + i3 + " x " + i4 + "] cropRect:" + rect);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initRenderView");
    }

    /* renamed from: n */
    public static boolean m19909n(MMVideoFrameLayout mMVideoFrameLayout, String str, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                j = 0;
            }
            mMVideoFrameLayout.getClass();
            C87412m.m108594g(str, "invokeSource");
            if (!mMVideoFrameLayout.getOnePlayContext().mo35697a()) {
                String fTPPTag = mMVideoFrameLayout.getFTPPTag();
                Log.m105924i(fTPPTag, "playWithSource " + str + " return for isViewFocused:" + mMVideoFrameLayout.getOnePlayContext().mo35697a());
                return false;
            }
            int state = mMVideoFrameLayout.getPlayer().getState();
            String fTPPTag2 = mMVideoFrameLayout.getFTPPTag();
            Log.m105924i(fTPPTag2, "playWithSource " + str + " playerState:" + state);
            switch (state) {
                case 0:
                case 10:
                case 11:
                    if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE) {
                        String fTPPTag3 = mMVideoFrameLayout.getFTPPTag();
                        Log.m105924i(fTPPTag3, "playWithSource " + str + " return for error state:" + state);
                        break;
                    }
                case 1:
                case 2:
                    if (mMVideoFrameLayout.f53154g != null) {
                        mMVideoFrameLayout.getOnePlayContext().mo35699c();
                        Surface surface = mMVideoFrameLayout.getOnePlayContext().getSurface();
                        if (surface != null) {
                            mMVideoFrameLayout.getPlayer().setSurface(surface);
                        }
                        Object p = mMVideoFrameLayout.getPlayer().mo35694p();
                        TPPlayer tPPlayer = p instanceof TPPlayer ? (TPPlayer) p : null;
                        if (tPPlayer != null) {
                            tPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(100, j));
                        }
                        C22583d player = mMVideoFrameLayout.getPlayer();
                        C66734b bVar = mMVideoFrameLayout.f53154g;
                        C87412m.m108591d(bVar);
                        player.mo35688f(bVar);
                        mMVideoFrameLayout.getPlayer().prepareAsync();
                        break;
                    } else {
                        Log.m105928w(mMVideoFrameLayout.getFTPPTag(), "prepareInternal return for mediaSource is mull.");
                        break;
                    }
                case 3:
                case 5:
                case 7:
                case 8:
                case 9:
                    String fTPPTag4 = mMVideoFrameLayout.getFTPPTag();
                    Log.m105924i(fTPPTag4, "playWithSource " + str + " return for state:" + state);
                    break;
                case 4:
                case 6:
                    mMVideoFrameLayout.mo23999o();
                    break;
            }
            return true;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: play");
    }

    /* renamed from: b */
    public void mo23980b(T t, C66734b bVar) {
        C87412m.m108594g(t, "onePlayContext");
        C87412m.m108594g(bVar, "mediaSource");
        getPlayer().mo35655c(t);
        C58248a aVar = this.f53157j;
        String a = C22595e.C22596a.m26412a(t, (String) null, 1, (Object) null);
        aVar.getClass();
        C87412m.m108594g(a, "logTag");
        aVar.f166783f = true;
        aVar.f166779b = a + ".MMSurfaceViewSwitchHelper";
        setOnePlayContext(t);
        this.f53154g = bVar;
    }

    /* renamed from: c */
    public final C23252a mo23981c(boolean z, String str) {
        C23252a aVar;
        this.f53160p = null;
        Surface surface = getOnePlayContext().getSurface();
        if (surface != null) {
            surface.release();
        }
        getOnePlayContext().setSurface((Surface) null);
        if (z) {
            Context context = getContext();
            C87412m.m108593f(context, "context");
            aVar = new MMTextureViewRender(context);
        } else {
            Context context2 = getContext();
            C87412m.m108593f(context2, "context");
            aVar = new MMSurfaceViewRender(context2);
        }
        aVar.mo36720c(getOnePlayContext());
        aVar.setOpaqueInfo(true);
        aVar.setSurfaceListener(this.f53155h);
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "createRenderView " + str + " renderView:" + aVar);
        return aVar;
    }

    /* renamed from: d */
    public void mo23982d(String str) {
    }

    /* renamed from: e */
    public void mo23983e() {
        Log.m105924i(getFTPPTag(), "FTPP.onInfo#handleOnCompletion()");
    }

    /* renamed from: f */
    public void mo23984f(C22583d dVar, int i, int i2) {
        C87412m.m108594g(dVar, WeChatBrands.Business.GROUP_MP);
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "FTPP.handleOnError() " + i + ' ' + i2 + " bgPrepareStatus:" + this.f53161q);
        if (i2 == 11030406) {
            getOnePlayContext().mo35701e().mo22525h(i2);
        }
    }

    /* renamed from: g */
    public void mo23985g(String str, int i) {
        C87412m.m108594g(str, "invokeSource");
        if (this.f53162r) {
            String fTPPTag = getFTPPTag();
            Log.m105924i(fTPPTag, "FTPP.handleOnFirstFrameRendered return for " + this.f53162r);
        } else if (C87412m.m108589b(str, "startInternal")) {
            if (i == 2) {
                String fTPPTag2 = getFTPPTag();
                Log.m105924i(fTPPTag2, "FTPP.handleOnFirstFrameRendered rendered for " + i);
                setFirstFrameRendered(true);
                setBgPrepareStatus(0);
                return;
            }
            String fTPPTag3 = getFTPPTag();
            Log.m105928w(fTPPTag3, "FTPP.handleOnFirstFrameRendered " + str + " return for " + i);
        } else if (!C87412m.m108589b(str, "onFirstFrameRendered")) {
            String fTPPTag4 = getFTPPTag();
            Log.m105928w(fTPPTag4, "FTPP.handleOnFirstFrameRendered " + str + " return for " + i);
        } else if (i == 0) {
            Log.m105924i(getFTPPTag(), "FTPP.handleOnFirstFrameRendered onFirstFrameRendered");
            setFirstFrameRendered(true);
        } else if (i != 1) {
            String fTPPTag5 = getFTPPTag();
            Log.m105928w(fTPPTag5, "FTPP.handleOnFirstFrameRendered " + str + " return for " + i);
        } else {
            Log.m105924i(getFTPPTag(), "FTPP.handleOnFirstFrameRendered background prepared first frame");
            setBgPrepareStatus(2);
        }
    }

    public final int getBgPrepareStatus() {
        return this.f53161q;
    }

    public long getCurrentPlayMs() {
        return getPlayer().getCurrentPositionMs();
    }

    public String getFTPPTag() {
        return C22595e.C22596a.m26412a(getOnePlayContext(), (String) null, 1, (Object) null) + ".MMVideoFrameLayout";
    }

    public final C66734b getMediaSource() {
        return this.f53154g;
    }

    public final T getOnePlayContext() {
        T t = this.f53151d;
        if (t != null) {
            return t;
        }
        C87412m.m108603p("onePlayContext");
        throw null;
    }

    public float getPlaySpeedRatio() {
        return this.f53156i;
    }

    public final C22583d getPlayer() {
        C22583d dVar = this.f53152e;
        if (dVar != null) {
            return dVar;
        }
        C87412m.m108603p("player");
        throw null;
    }

    public final C23252a getRenderView() {
        return this.f53153f;
    }

    public final int getRenderViewScaleType() {
        return this.f53158n;
    }

    /* renamed from: h */
    public void mo23995h(C22583d dVar, long j, long j2) {
        C87412m.m108594g(dVar, WeChatBrands.Business.GROUP_MP);
    }

    /* renamed from: i */
    public void mo23996i() {
        Log.m105924i(getFTPPTag(), "FTPP.onInfo#handleOnReplay()");
    }

    /* renamed from: j */
    public void mo23997j(int i, int i2) {
    }

    /* renamed from: m */
    public boolean mo23998m() {
        int state = getPlayer().getState();
        switch (state) {
            case 0:
            case 11:
                if (!BuildInfo.DEBUG && !BuildInfo.IS_FLAVOR_RED && !BuildInfo.IS_FLAVOR_PURPLE) {
                    return true;
                }
                String fTPPTag = getFTPPTag();
                Log.m105924i(fTPPTag, "pause return for error state:" + state);
                return true;
            case 1:
            case 2:
            case 7:
            case 8:
            case 9:
            case 10:
                String fTPPTag2 = getFTPPTag();
                Log.m105924i(fTPPTag2, "pause return for state:" + state);
                return true;
            case 3:
            case 4:
                mo24000p();
                return true;
            case 5:
                this.f53157j.mo82997a(this.f53153f, getOnePlayContext().getSurface(), (Bitmap) null);
                getPlayer().pause();
                Log.m105924i(getFTPPTag(), "FTPP.handleOnPause");
                return true;
            default:
                return true;
        }
    }

    /* renamed from: o */
    public final void mo23999o() {
        Surface surface = getOnePlayContext().getSurface();
        boolean z = true;
        if (!(surface != null && !surface.isValid()) || this.f53159o) {
            int state = getPlayer().getState();
            if (!(state == 4 || state == 5 || state == 6 || state == 7)) {
                z = false;
            }
            if (!z) {
                String fTPPTag = getFTPPTag();
                Log.m105924i(fTPPTag, "startInternal return for state:" + getPlayer().getState());
            } else if (!getOnePlayContext().mo35697a()) {
                Log.m105924i(getFTPPTag(), "startInternal return for isFocused.");
            } else {
                String fTPPTag2 = getFTPPTag();
                Log.m105924i(fTPPTag2, "startInternal playerStatus:" + getPlayer().getState() + " bgPrepareStatus:" + this.f53161q);
                getOnePlayContext().mo35699c();
                getPlayer().start();
                Log.m105924i(getFTPPTag(), "FTPP.handleOnStart");
            }
        } else {
            String fTPPTag3 = getFTPPTag();
            StringBuilder sb = new StringBuilder();
            sb.append("startInternal return for surface:");
            sb.append(getOnePlayContext().getSurface());
            sb.append(" isValid:");
            Surface surface2 = getOnePlayContext().getSurface();
            sb.append(surface2 != null ? Boolean.valueOf(surface2.isValid()) : null);
            Log.m105924i(fTPPTag3, sb.toString());
        }
    }

    /* renamed from: p */
    public void mo24000p() {
        setFirstFrameRendered(false);
        setBgPrepareStatus(0);
        getPlayer().stop();
        getPlayer().reset();
        C58248a aVar = this.f53157j;
        String c = aVar.mo82999c();
        Log.m105924i(c, "detach captureBitmap:" + aVar.f166782e + " defaultBitmap:" + aVar.f166781d);
        aVar.f166783f = false;
        aVar.f166781d = null;
        aVar.mo82998b();
    }

    public final void setBgPrepareStatus(int i) {
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "setBgPrepareStatus " + i + ' ');
        this.f53161q = i;
    }

    public void setFirstFrameRendered(boolean z) {
        this.f53162r = z;
    }

    public final void setMediaSource(C66734b bVar) {
        this.f53154g = bVar;
    }

    public final void setOnePlayContext(T t) {
        C87412m.m108594g(t, "<set-?>");
        this.f53151d = t;
    }

    public final void setOnlyAudio(boolean z) {
        this.f53159o = z;
    }

    public void setPlaySpeedRatio(float f) {
        String fTPPTag = getFTPPTag();
        StringBuilder sb = new StringBuilder();
        sb.append("setPlaySpeed: ratio = ");
        sb.append(f);
        sb.append(", mediaId = ");
        C66734b bVar = this.f53154g;
        sb.append(bVar != null ? bVar.f191765a : null);
        Log.m105924i(fTPPTag, sb.toString());
        getPlayer().setPlaySpeedRatio(f);
        this.f53156i = f;
    }

    public final void setPlayer(C22583d dVar) {
        C87412m.m108594g(dVar, "<set-?>");
        this.f53152e = dVar;
    }

    public final void setRenderView(C23252a aVar) {
        this.f53153f = aVar;
    }

    public final void setRenderViewScaleType(int i) {
        this.f53158n = i;
    }

    public final void setScaleType(int i) {
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "setScaleType scaleType:" + i);
        this.f53158n = i;
        C23252a aVar = this.f53153f;
        if (aVar != null) {
            aVar.setScaleType(i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMVideoFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        m19907k(this, (String) null, 1, (Object) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMVideoFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        m19907k(this, (String) null, 1, (Object) null);
    }
}
