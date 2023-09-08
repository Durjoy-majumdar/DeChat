package com.tencent.p014mm.plugin.emojicapture.p841ui;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import com.tencent.p014mm.p136ui.base.MMTextureView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import e71.C107236a;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j71.C108592j;
import kotlin.Metadata;
import rh3.C101383g;
import rx3.C13598b0;
import s62.C110763c;
import s62.C110768l;
import s62.C110770m;
import s62.C110774n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fB!\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010!J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u000b\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000fJ\u0010\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\u0006\u0010\u0017\u001a\u00020\fJ\u0006\u0010\u0019\u001a\u00020\u0018¨\u0006\""}, mo182094d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/EmojiVideoPlayTextureView;", "Lcom/tencent/mm/ui/base/MMTextureView;", "", "path", "Lrx3/b0;", "setVideoPath", "getVideoPath", "Lcom/tencent/mm/pluginsdk/ui/tools/r0$a;", "callback", "setVideoCallback", "Lkotlin/Function0;", "setOnDrawCallback", "", "rate", "setPlayRate", "", "removeBgEnable", "setRemoveBgEnable", "remove", "setRemoveBackground", "Lrh3/g;", "pack", "setSticker", "getPlayRate", "", "getDuration", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-emojicapture_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView */
public final class EmojiVideoPlayTextureView extends MMTextureView {

    /* renamed from: z */
    public static final /* synthetic */ int f269187z = 0;

    /* renamed from: h */
    public final String f269188h = "MicroMsg.EmojiVideoPlayTextureView";

    /* renamed from: i */
    public final C108592j f269189i;

    /* renamed from: j */
    public final C107236a f269190j;

    /* renamed from: n */
    public String f269191n;

    /* renamed from: o */
    public C110768l f269192o;

    /* renamed from: p */
    public int f269193p;

    /* renamed from: q */
    public int f269194q;

    /* renamed from: r */
    public boolean f269195r;

    /* renamed from: s */
    public boolean f269196s;

    /* renamed from: t */
    public Surface f269197t;

    /* renamed from: u */
    public C96875r0.C96876a f269198u;

    /* renamed from: v */
    public C32224a<C13598b0> f269199v;

    /* renamed from: w */
    public boolean f269200w;

    /* renamed from: x */
    public boolean f269201x;

    /* renamed from: y */
    public C110763c f269202y;

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView$a */
    public static final class C93288a extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiVideoPlayTextureView f269203d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93288a(EmojiVideoPlayTextureView emojiVideoPlayTextureView) {
            super(1);
            this.f269203d = emojiVideoPlayTextureView;
        }

        public Object invoke(Object obj) {
            SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
            String str = this.f269203d.f269188h;
            Log.m105924i(str, "previewCallback: " + surfaceTexture);
            this.f269203d.f269197t = new Surface(surfaceTexture);
            EmojiVideoPlayTextureView emojiVideoPlayTextureView = this.f269203d;
            C110768l lVar = emojiVideoPlayTextureView.f269192o;
            if (lVar == null || !emojiVideoPlayTextureView.f269195r) {
                emojiVideoPlayTextureView.mo127994E();
            } else {
                lVar.mo162307b(emojiVideoPlayTextureView.f269197t);
                EmojiVideoPlayTextureView emojiVideoPlayTextureView2 = this.f269203d;
                if (emojiVideoPlayTextureView2.f269200w) {
                    C110768l lVar2 = emojiVideoPlayTextureView2.f269192o;
                    if (lVar2 != null) {
                        lVar2.mo162319n();
                    }
                } else {
                    emojiVideoPlayTextureView2.f269201x = true;
                    C110768l lVar3 = emojiVideoPlayTextureView2.f269192o;
                    if (lVar3 != null) {
                        lVar3.mo162316k(true);
                    }
                    C110768l lVar4 = this.f269203d.f269192o;
                    if (lVar4 != null) {
                        lVar4.mo162319n();
                    }
                }
                this.f269203d.f269200w = false;
            }
            this.f269203d.getClass();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView$b */
    public static final class C93289b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiVideoPlayTextureView f269204d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93289b(EmojiVideoPlayTextureView emojiVideoPlayTextureView) {
            super(0);
            this.f269204d = emojiVideoPlayTextureView;
        }

        public Object invoke() {
            C32224a<C13598b0> aVar = this.f269204d.f269199v;
            if (aVar != null) {
                aVar.invoke();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView$c */
    public static final class C93290c implements C110763c {

        /* renamed from: a */
        public final /* synthetic */ EmojiVideoPlayTextureView f269205a;

        public C93290c(EmojiVideoPlayTextureView emojiVideoPlayTextureView) {
            this.f269205a = emojiVideoPlayTextureView;
        }

        /* renamed from: a */
        public void mo128007a(int i, int i2, int i3) {
            Log.m105925i(this.f269205a.f269188h, "video size changed size[%d, %d] degrees[%d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            EmojiVideoPlayTextureView emojiVideoPlayTextureView = this.f269205a;
            emojiVideoPlayTextureView.f269194q = i;
            emojiVideoPlayTextureView.f269193p = i2;
            emojiVideoPlayTextureView.f269190j.f320864d.mo159591u(i, i2);
            EmojiVideoPlayTextureView emojiVideoPlayTextureView2 = this.f269205a;
            C96875r0.C96876a aVar = emojiVideoPlayTextureView2.f269198u;
            if (aVar != null) {
                aVar.mo76226p3(emojiVideoPlayTextureView2.f269194q, emojiVideoPlayTextureView2.f269193p);
            }
        }

        public void onCompletion() {
            C96875r0.C96876a aVar = this.f269205a.f269198u;
            if (aVar != null) {
                aVar.onCompletion();
            }
        }

        public void onError(int i, int i2) {
            C96875r0.C96876a aVar = this.f269205a.f269198u;
            if (aVar != null) {
                aVar.onError(i, i2);
            }
        }

        public void onPrepared() {
            Log.m105924i(this.f269205a.f269188h, "onPrepared: ");
            EmojiVideoPlayTextureView emojiVideoPlayTextureView = this.f269205a;
            emojiVideoPlayTextureView.f269195r = true;
            C96875r0.C96876a aVar = emojiVideoPlayTextureView.f269198u;
            if (aVar != null) {
                aVar.onPrepared();
            }
            this.f269205a.requestLayout();
        }

        public void onSeekComplete() {
            EmojiVideoPlayTextureView emojiVideoPlayTextureView = this.f269205a;
            int i = EmojiVideoPlayTextureView.f269187z;
            emojiVideoPlayTextureView.getClass();
            EmojiVideoPlayTextureView emojiVideoPlayTextureView2 = this.f269205a;
            if (!emojiVideoPlayTextureView2.f269196s) {
                Log.m105918d(emojiVideoPlayTextureView2.f269188h, "player seek done, but don't play now.");
                this.f269205a.f269196s = true;
                return;
            }
            String str = emojiVideoPlayTextureView2.f269188h;
            Object[] objArr = new Object[1];
            C110768l lVar = emojiVideoPlayTextureView2.f269192o;
            objArr[0] = lVar != null ? lVar.mo162309d() : null;
            Log.m105919d(str, "%s player seek done", objArr);
            C110768l lVar2 = this.f269205a.f269192o;
            if (lVar2 != null) {
                lVar2.mo162319n();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView$d */
    public static final class C93291d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiVideoPlayTextureView f269206d;

        /* renamed from: e */
        public final /* synthetic */ boolean f269207e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93291d(EmojiVideoPlayTextureView emojiVideoPlayTextureView, boolean z) {
            super(0);
            this.f269206d = emojiVideoPlayTextureView;
            this.f269207e = z;
        }

        public Object invoke() {
            this.f269206d.f269189i.mo138249e(this.f269207e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView$e */
    public static final class C93292e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiVideoPlayTextureView f269208d;

        /* renamed from: e */
        public final /* synthetic */ C101383g f269209e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93292e(EmojiVideoPlayTextureView emojiVideoPlayTextureView, C101383g gVar) {
            super(0);
            this.f269208d = emojiVideoPlayTextureView;
            this.f269209e = gVar;
        }

        public Object invoke() {
            this.f269208d.f269189i.mo138246a(this.f269209e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView$f */
    public static final class C93293f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiVideoPlayTextureView f269210d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93293f(EmojiVideoPlayTextureView emojiVideoPlayTextureView) {
            super(0);
            this.f269210d = emojiVideoPlayTextureView;
        }

        public Object invoke() {
            this.f269210d.f269189i.mo138248d();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView$g */
    public static final class C93294g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiVideoPlayTextureView f269211d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93294g(EmojiVideoPlayTextureView emojiVideoPlayTextureView) {
            super(0);
            this.f269211d = emojiVideoPlayTextureView;
        }

        public Object invoke() {
            this.f269211d.f269189i.mo138247c();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiVideoPlayTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        C108592j jVar = new C108592j();
        this.f269189i = jVar;
        C107236a aVar = new C107236a(jVar);
        this.f269190j = aVar;
        this.f269191n = "";
        this.f269196s = true;
        setSurfaceTextureListener(aVar);
        setOpaque(false);
        aVar.f320871n = new C93288a(this);
        aVar.f320872o = new C93289b(this);
        this.f269202y = new C93290c(this);
    }

    /* renamed from: E */
    public final void mo127994E() {
        C110768l lVar;
        Surface surface;
        Log.m105925i(this.f269188h, "%d open video [%s]", Integer.valueOf(hashCode()), this.f269191n);
        C110768l lVar2 = this.f269192o;
        if (lVar2 != null) {
            lVar2.f331338g = null;
            lVar2.mo162320o();
            C110768l lVar3 = this.f269192o;
            if (lVar3 != null) {
                lVar3.mo162313h();
            }
            this.f269192o = null;
        }
        if (Util.isNullOrNil(this.f269191n) || this.f269197t == null) {
            Log.m105929w(this.f269188h, "%d open video but path is null or mSurface is null", Integer.valueOf(hashCode()));
            return;
        }
        try {
            this.f269195r = false;
            C110768l lVar4 = new C110768l(Looper.getMainLooper(), false, 0);
            this.f269192o = lVar4;
            lVar4.mo162318m(this.f269191n);
            C110768l lVar5 = this.f269192o;
            if (lVar5 != null) {
                lVar5.mo162317l(false);
            }
            C110768l lVar6 = this.f269192o;
            if (lVar6 != null) {
                lVar6.mo162315j(false);
            }
            C110768l lVar7 = this.f269192o;
            if (lVar7 != null) {
                lVar7.f331338g = this.f269202y;
            }
            if (!(lVar7 == null || (surface = this.f269197t) == null)) {
                C110770m mVar = lVar7.f331337f;
                Log.m105925i("MicroMsg.VideoPlayerImpl", "%s set surface[%d] ", mVar.mo162322a(), Integer.valueOf(surface.hashCode()));
                mVar.f331352l.f331370w = surface;
            }
            C110768l lVar8 = this.f269192o;
            if (lVar8 != null) {
                lVar8.f331337f.f331352l.getClass();
            }
            C110768l lVar9 = this.f269192o;
            if (lVar9 != null) {
                lVar9.mo162316k(true);
            }
            if (this.f269197t != null && (lVar = this.f269192o) != null) {
                lVar.mo162312g();
            }
        } catch (Exception e) {
            Log.printErrStackTrace(this.f269188h, e, "prepare async error %s", e.getMessage());
            C96875r0.C96876a aVar = this.f269198u;
            if (aVar != null) {
                aVar.onError(-1, -1);
            }
        }
    }

    public final int getDuration() {
        C110768l lVar = this.f269192o;
        if (lVar == null) {
            return 0;
        }
        C87412m.m108591d(lVar);
        return (int) lVar.f331337f.f331346f;
    }

    public final float getPlayRate() {
        C110774n nVar;
        C110768l lVar = this.f269192o;
        if (lVar == null) {
            return 1.0f;
        }
        C87412m.m108591d(lVar);
        C110770m mVar = lVar.f331337f;
        if (mVar == null || (nVar = mVar.f331352l) == null) {
            return 1.0f;
        }
        return nVar.f331368C;
    }

    public final String getVideoPath() {
        return this.f269191n;
    }

    public final void setOnDrawCallback(C32224a<C13598b0> aVar) {
        this.f269199v = aVar;
    }

    public final void setPlayRate(float f) {
        C110770m mVar;
        C110774n nVar;
        C110768l lVar = this.f269192o;
        if (lVar != null && (mVar = lVar.f331337f) != null && (nVar = mVar.f331352l) != null && f > 0.0f) {
            nVar.f331368C = f;
        }
    }

    public final void setRemoveBackground(boolean z) {
        this.f269190j.mo157713b(new C93291d(this, z));
    }

    public final void setRemoveBgEnable(boolean z) {
    }

    public final void setSticker(C101383g gVar) {
        this.f269190j.mo157713b(new C93292e(this, gVar));
    }

    public final void setVideoCallback(C96875r0.C96876a aVar) {
        C87412m.m108594g(aVar, "callback");
        this.f269198u = aVar;
    }

    public final void setVideoPath(String str) {
        C87412m.m108594g(str, "path");
        Log.m105925i(this.f269188h, "%d set video path [%s]", Integer.valueOf(hashCode()), str);
        this.f269191n = str;
        mo127994E();
        requestLayout();
    }

    public final boolean start() {
        if (this.f269192o == null || !this.f269195r) {
            String str = this.f269188h;
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(hashCode());
            objArr[1] = Boolean.valueOf(this.f269192o == null);
            objArr[2] = Boolean.valueOf(this.f269195r);
            Log.m105929w(str, "%d player is null[%b] or it prepared [%b]", objArr);
            return false;
        }
        String str2 = this.f269188h;
        Object[] objArr2 = new Object[4];
        objArr2[0] = Integer.valueOf(hashCode());
        objArr2[1] = Boolean.valueOf(this.f269201x);
        objArr2[2] = Boolean.valueOf(this.f269200w);
        objArr2[3] = Boolean.valueOf(this.f269197t != null);
        Log.m105925i(str2, "%d player start pauseWhenUpdated[%b] pauseByDestroyed[%b] surface[%b]", objArr2);
        if (this.f269197t == null) {
            this.f269200w = true;
            return true;
        } else if (this.f269201x) {
            this.f269200w = true;
            this.f269201x = false;
            return true;
        } else {
            C110768l lVar = this.f269192o;
            if (lVar != null) {
                lVar.mo162319n();
            }
            this.f269190j.mo157713b(new C93293f(this));
            return true;
        }
    }

    public final void stop() {
        Log.m105925i(this.f269188h, "%d player stop [%s]", Integer.valueOf(hashCode()), Util.getStack());
        C110768l lVar = this.f269192o;
        if (lVar != null) {
            lVar.f331338g = null;
        }
        if (lVar != null) {
            lVar.mo162320o();
        }
        C110768l lVar2 = this.f269192o;
        if (lVar2 != null) {
            lVar2.mo162313h();
        }
        this.f269190j.mo157713b(new C93294g(this));
        this.f269192o = null;
        this.f269194q = 0;
        this.f269193p = 0;
        this.f269195r = false;
        this.f269191n = "";
        setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiVideoPlayTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        C108592j jVar = new C108592j();
        this.f269189i = jVar;
        C107236a aVar = new C107236a(jVar);
        this.f269190j = aVar;
        this.f269191n = "";
        this.f269196s = true;
        setSurfaceTextureListener(aVar);
        setOpaque(false);
        aVar.f320871n = new C93288a(this);
        aVar.f320872o = new C93289b(this);
        this.f269202y = new C93290c(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiVideoPlayTextureView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        C108592j jVar = new C108592j();
        this.f269189i = jVar;
        C107236a aVar = new C107236a(jVar);
        this.f269190j = aVar;
        this.f269191n = "";
        this.f269196s = true;
        setSurfaceTextureListener(aVar);
        setOpaque(false);
        aVar.f320871n = new C93288a(this);
        aVar.f320872o = new C93289b(this);
        this.f269202y = new C93290c(this);
    }
}
