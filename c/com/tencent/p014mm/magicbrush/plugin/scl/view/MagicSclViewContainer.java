package com.tencent.p014mm.magicbrush.plugin.scl.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C58105c;
import g70.C87164i;
import gy3.C8480h;
import gy3.C87412m;
import i70.C87667c;
import kotlin.Metadata;
import n70.C47167a;
import o70.C61948a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\b\u0010\u0007\u001a\u00020\u0001H\u0016R(\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@BX\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0015\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006&"}, mo182094d2 = {"Lcom/tencent/mm/magicbrush/plugin/scl/view/MagicSclViewContainer;", "Landroid/widget/FrameLayout;", "Ld42/c;", "", "getFrameSetId", "Lo70/a;", "getCustomViewContainer", "getCoverViewHolder", "Lg70/i;", "<set-?>", "d", "Lg70/i;", "getFrameSet", "()Lg70/i;", "frameSet", "f", "Landroid/widget/FrameLayout;", "getCoverViewRoot", "()Landroid/widget/FrameLayout;", "setCoverViewRoot", "(Landroid/widget/FrameLayout;)V", "coverViewRoot", "", "g", "Z", "getUnbindFrameSetOnDetach", "()Z", "setUnbindFrameSetOnDetach", "(Z)V", "unbindFrameSetOnDetach", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mb-plugin-scl_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer */
public class MagicSclViewContainer extends FrameLayout implements C58105c {

    /* renamed from: d */
    public C87164i f157373d;

    /* renamed from: e */
    public C61948a f157374e;

    /* renamed from: f */
    public FrameLayout f157375f;

    /* renamed from: g */
    public boolean f157376g;

    /* renamed from: h */
    public String f157377h;

    /* renamed from: i */
    public int f157378i;

    /* renamed from: j */
    public Runnable f157379j;

    /* renamed from: com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer$a */
    public static final class C55260a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MagicSclViewContainer f157380d;

        /* renamed from: e */
        public final /* synthetic */ C87667c<?, ?>.a f157381e;

        public C55260a(MagicSclViewContainer magicSclViewContainer, C87667c<?, ?>.a aVar) {
            this.f157380d = magicSclViewContainer;
            this.f157381e = aVar;
        }

        public final void run() {
            Log.m105924i("MicroMsg.MagicSclViewContainer", this.f157380d.hashCode() + " notify bind:" + this.f157381e);
            C87164i frameSet = this.f157380d.getFrameSet();
            if (frameSet != null) {
                frameSet.mo121598b();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MagicSclViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C8480h) null);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MagicSclViewContainer(Context context, AttributeSet attributeSet, int i, int i2, C8480h hVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: a */
    public final void mo76544a(C87667c<?, ?>.a aVar) {
        C87412m.m108594g(aVar, "root");
        if (!(this.f157377h.length() == 0)) {
            C87164i iVar = (C87164i) aVar.mo122101d(this.f157377h).f38555d;
            iVar.mo121603f(this);
            iVar.f252800p = this.f157378i;
            this.f157373d = iVar;
            Log.m105924i("MicroMsg.MagicSclViewContainer", hashCode() + " bind:" + aVar + ' ' + this.f157373d);
            this.f157379j = new C55260a(this, aVar);
            mo76545b();
            return;
        }
        throw new IllegalStateException("frameSet name not set, forgot call resetFrameSet(name)?");
    }

    /* renamed from: b */
    public final void mo76545b() {
        if (getWidth() != 0) {
            C87164i iVar = this.f157373d;
            if (iVar != null) {
                iVar.f252790f = C47167a.m52444a(Integer.valueOf(getWidth()));
            }
            C87164i iVar2 = this.f157373d;
            if (iVar2 != null) {
                iVar2.f252791g = C47167a.m52444a(Integer.valueOf(getHeight()));
            }
            Runnable runnable = this.f157379j;
            if (runnable != null) {
                runnable.run();
                this.f157379j = null;
            }
        }
    }

    /* renamed from: c */
    public final void mo76546c(C87667c<?, ?>.a aVar) {
        C87412m.m108594g(aVar, "root");
        if (!(this.f157377h.length() == 0)) {
            C87164i iVar = (C87164i) aVar.mo122101d(this.f157377h).f38555d;
            iVar.mo121603f(this);
            iVar.f252800p = this.f157378i;
            iVar.mo121600d();
            this.f157373d = iVar;
            return;
        }
        throw new IllegalStateException("frameSet name not set, forgot call resetFrameSet(name)?");
    }

    /* renamed from: d */
    public final void mo76547d() {
        Log.m105924i("MicroMsg.MagicSclViewContainer", hashCode() + " invalidate " + this.f157373d);
        this.f157373d = null;
    }

    /* renamed from: e */
    public final void mo76548e() {
        Log.m105924i("MicroMsg.MagicSclViewContainer", hashCode() + " unbind " + this.f157373d);
        C87164i iVar = this.f157373d;
        if (iVar != null) {
            iVar.mo121604g();
        }
        this.f157373d = null;
    }

    public FrameLayout getCoverViewHolder() {
        FrameLayout frameLayout = this.f157375f;
        C87412m.m108591d(frameLayout);
        return frameLayout;
    }

    public final FrameLayout getCoverViewRoot() {
        return this.f157375f;
    }

    public final C61948a getCustomViewContainer() {
        return this.f157374e;
    }

    public final C87164i getFrameSet() {
        return this.f157373d;
    }

    public final String getFrameSetId() {
        C87164i iVar = this.f157373d;
        if (iVar != null) {
            return iVar.f252786b;
        }
        return null;
    }

    public final boolean getUnbindFrameSetOnDetach() {
        return this.f157376g;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        sb.append(" onAttachedToWindow#");
        C87164i iVar = this.f157373d;
        sb.append(iVar != null ? iVar.f252786b : null);
        Log.m105924i("MicroMsg.MagicSclViewContainer", sb.toString());
        C87164i iVar2 = this.f157373d;
        if (iVar2 != null) {
            iVar2.mo121597a();
        }
        C87164i iVar3 = this.f157373d;
        if (iVar3 != null) {
            iVar3.mo121601e();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        sb.append(" onDetachedFromWindow#");
        C87164i iVar = this.f157373d;
        sb.append(iVar != null ? iVar.f252786b : null);
        sb.append(' ');
        sb.append(this.f157376g);
        Log.m105924i("MicroMsg.MagicSclViewContainer", sb.toString());
        C87164i iVar2 = this.f157373d;
        if (iVar2 != null) {
            iVar2.mo121599c();
        }
        if (this.f157376g) {
            mo76548e();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo76545b();
    }

    public final void setCoverViewRoot(FrameLayout frameLayout) {
        this.f157375f = frameLayout;
    }

    public final void setUnbindFrameSetOnDetach(boolean z) {
        this.f157376g = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MagicSclViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f157376g = true;
        this.f157377h = "";
        setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f157375f = frameLayout;
        this.f157374e = new C61948a(frameLayout);
        addView(this.f157375f, new FrameLayout.LayoutParams(-1, -1));
    }
}
