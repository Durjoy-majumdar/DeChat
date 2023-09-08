package com.tencent.p014mm.plugin.finder.bullet;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TextureView;
import cm1.C55018j0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import gy3.C87412m;
import he1.C59854m;
import he1.C59861q;
import he1.C59869v;
import ie1.C46237b;
import java.util.ArrayList;
import kotlin.Metadata;
import o40.C61926c;
import p871zj.C66846j;
import pe3.C89349b;
import rs1.C13442s8;
import te3.C49712hj1;
import xl1.C66368a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"B#\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b!\u0010%R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006&"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/bullet/MegaVideoBulletView;", "Landroid/view/TextureView;", "", "d", "Z", "isReuse", "()Z", "setReuse", "(Z)V", "Lcm1/j0;", "e", "Lcm1/j0;", "getFeed", "()Lcm1/j0;", "setFeed", "(Lcm1/j0;)V", "feed", "Lhe1/m;", "f", "Lhe1/m;", "getBulletManager", "()Lhe1/m;", "bulletManager", "Lhe1/v;", "g", "Lhe1/v;", "getPlayStatusListener", "()Lhe1/v;", "playStatusListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.bullet.MegaVideoBulletView */
public final class MegaVideoBulletView extends TextureView {

    /* renamed from: d */
    public boolean f158431d;

    /* renamed from: e */
    public C55018j0 f158432e;

    /* renamed from: f */
    public final C59854m f158433f = new C59854m(this);

    /* renamed from: g */
    public final C59869v f158434g = new C59861q(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MegaVideoBulletView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public final void mo77175a(boolean z) {
        C13442s8 f;
        C59854m mVar = this.f158433f;
        if (!mVar.f170909i && this.f158432e != null) {
            C55018j0 feed = getFeed();
            C87412m.m108594g(feed, "feed");
            Log.m105924i("FinderBulletManager", "onAttach: id = " + C61926c.m72691p(feed.getItemId()) + "， this=" + mVar.hashCode());
            mVar.mo84818e();
            mVar.f170909i = true;
            mVar.f170913p = z;
            C66368a aVar = new C66368a();
            mVar.f170908h = aVar;
            mVar.f170905e = feed;
            C59854m.C59855c cVar = mVar.f170914q;
            Context context = mVar.f170904d.getContext();
            C87412m.m108593f(context, "bulletView.context");
            C87412m.m108594g(cVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            aVar.f191075n = context;
            aVar.f191068d = feed;
            aVar.f191070f = cVar;
            Log.m105924i("FinderBulletLoader", "onAttach " + feed + ' ' + cVar.hashCode());
            C86709a0.m107524d().mo123455a(8560, aVar);
            int length = aVar.f191076o.length;
            for (int i = 0; i < length; i++) {
                aVar.f191076o[i] = 0;
            }
            C66368a aVar2 = mVar.f170908h;
            C49712hj1 hj12 = null;
            if (aVar2 != null) {
                aVar2.f191074j = true;
                long id = aVar2.mo90470c().mo3513o().getId();
                Context context2 = aVar2.f191075n;
                if (!(context2 == null || (f = C13442s8.f38060Q0.mo12873f(context2)) == null)) {
                    hj12 = f.mo12861q3();
                }
                C86709a0.m107524d().mo123460f(new C46237b(id, 0, (C89349b) null, hj12, 0));
                C66846j.C66848b bVar = mVar.f170910j;
                if (bVar != null) {
                    mVar.mo84815b().f192019d.f191979H = bVar;
                }
                mVar.mo84815b().f192019d.f191999t = false;
                if (feed.mo76077q0(mVar.f170913p)) {
                    if (mVar.f170907g >= 0) {
                        mVar.mo84815b().mo90852k(0);
                    }
                    if (!((ArrayList) mVar.mo84816c().f154483h).isEmpty()) {
                        mVar.mo84814a(mVar.mo84816c().f154483h, "onAttach");
                    }
                }
                mVar.f170912o = 1.0f;
                C86709a0.m107524d().mo123455a(7143, mVar);
                return;
            }
            C87412m.m108603p("bulletLoader");
            throw null;
        }
    }

    public final C59854m getBulletManager() {
        return this.f158433f;
    }

    public final C55018j0 getFeed() {
        C55018j0 j0Var = this.f158432e;
        if (j0Var != null) {
            return j0Var;
        }
        C87412m.m108603p("feed");
        throw null;
    }

    public final C59869v getPlayStatusListener() {
        return this.f158434g;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.f158431d) {
            this.f158433f.mo84818e();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        boolean z = false;
        if (motionEvent.getAction() == 0) {
            C66846j b = this.f158433f.mo84815b();
            if (b.f192019d.mo90814a(new Point((int) motionEvent.getX(), ((int) motionEvent.getY()) + ((int) getY())), 0)) {
                z = true;
            }
        }
        if (z) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setFeed(C55018j0 j0Var) {
        C87412m.m108594g(j0Var, "<set-?>");
        this.f158432e = j0Var;
    }

    public final void setReuse(boolean z) {
        this.f158431d = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MegaVideoBulletView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
