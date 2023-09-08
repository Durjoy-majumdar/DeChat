package com.tencent.p014mm.plugin.finder.floatball;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.view.View;
import aw0.C103928o;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderSeekEvent;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.service.FloatBallHelper;
import com.tencent.p014mm.plugin.finder.megavideo.p053ui.FinderMegaVideoMiniView;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import nc3.C34767b;
import p646pn.C110234e;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11986o0;
import pl1.C11990s0;
import pl1.C62344b0;
import r50.C77486k;
import rs1.C63566lb;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C64689rq2;
import up1.C27696y;

/* renamed from: com.tencent.mm.plugin.finder.floatball.BaseFinderMiniViewHelper */
public abstract class BaseFinderMiniViewHelper extends FloatBallHelper {

    /* renamed from: n */
    public C34767b.C34768c f159066n;

    /* renamed from: o */
    public final C13601g f159067o = C36568h.m40985a(C55851c.f159076d);

    /* renamed from: p */
    public final BaseFinderMiniViewHelper$checkVideoState$1 f159068p;

    /* renamed from: q */
    public final IListener<VoipEvent> f159069q;

    /* renamed from: r */
    public final IListener<?> f159070r;

    /* renamed from: s */
    public final IListener<?> f159071s;

    /* renamed from: t */
    public final IListener<FinderSeekEvent> f159072t;

    /* renamed from: u */
    public long f159073u;

    /* renamed from: com.tencent.mm.plugin.finder.floatball.BaseFinderMiniViewHelper$a */
    public static final class C55849a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ BaseFinderMiniViewHelper f159074d;

        public C55849a(BaseFinderMiniViewHelper baseFinderMiniViewHelper) {
            this.f159074d = baseFinderMiniViewHelper;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/floatball/BaseFinderMiniViewHelper$generateCloseClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BaseFinderMiniViewHelper baseFinderMiniViewHelper = this.f159074d;
            baseFinderMiniViewHelper.f311726d.f311683H.f311721j = 14;
            baseFinderMiniViewHelper.mo77454E0();
            C63566lb.C13324a.m12677a((C63566lb) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C63566lb.class), false, (Context) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/floatball/BaseFinderMiniViewHelper$generateCloseClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.floatball.BaseFinderMiniViewHelper$b */
    public static final class C55850b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ BaseFinderMiniViewHelper f159075d;

        public C55850b(BaseFinderMiniViewHelper baseFinderMiniViewHelper) {
            this.f159075d = baseFinderMiniViewHelper;
        }

        public final void run() {
            BaseFinderMiniViewHelper baseFinderMiniViewHelper = this.f159075d;
            Log.m105925i("FinderMegaVideoMiniViewHelper", "addMiniView, no ball, ball: %s, view:%s", baseFinderMiniViewHelper.f311726d, baseFinderMiniViewHelper.mo77450A0());
            BaseFinderMiniViewHelper baseFinderMiniViewHelper2 = this.f159075d;
            BallInfo ballInfo = baseFinderMiniViewHelper2.f311726d;
            ballInfo.f311680E = true;
            ballInfo.f311681F = false;
            ballInfo.f311679D = 2048;
            ballInfo.f311689g = baseFinderMiniViewHelper2.mo77450A0();
            BaseFinderMiniViewHelper baseFinderMiniViewHelper3 = this.f159075d;
            BallInfo ballInfo2 = baseFinderMiniViewHelper3.f311726d;
            ballInfo2.f311677B = true;
            ballInfo2.f311692j = 2;
            BallInfo.BallButtonInfo ballButtonInfo = ballInfo2.f311693n;
            ballButtonInfo.f311707e = true;
            ballButtonInfo.f311710h = true;
            baseFinderMiniViewHelper3.mo77456G0();
            this.f159075d.f159068p.alive();
            this.f159075d.f159069q.alive();
            this.f159075d.f159070r.alive();
            this.f159075d.f159071s.alive();
            this.f159075d.f159072t.alive();
            this.f159075d.mo68419u();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.floatball.BaseFinderMiniViewHelper$c */
    public static final class C55851c extends C87413o implements C32224a<FinderMegaVideoMiniView> {

        /* renamed from: d */
        public static final C55851c f159076d = new C55851c();

        public C55851c() {
            super(0);
        }

        public Object invoke() {
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            FinderMegaVideoMiniView finderMegaVideoMiniView = new FinderMegaVideoMiniView(context);
            C77486k kVar = new C77486k((float) C76577a.m92151b(MMApplicationContext.getContext(), 8));
            finderMegaVideoMiniView.setClipToOutline(true);
            finderMegaVideoMiniView.setOutlineProvider(kVar);
            return finderMegaVideoMiniView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.floatball.BaseFinderMiniViewHelper$d */
    public static final class C55852d implements C34767b.C21622a {

        /* renamed from: a */
        public final /* synthetic */ BaseFinderMiniViewHelper f159077a;

        public C55852d(BaseFinderMiniViewHelper baseFinderMiniViewHelper) {
            this.f159077a = baseFinderMiniViewHelper;
        }

        /* renamed from: a */
        public void mo17997a(boolean z) {
            Log.m105924i("BaseFinderMiniViewHelper", "onPause: loss focus");
            this.f159077a.mo77452C0();
        }

        public void onResume() {
            Log.m105924i("BaseFinderMiniViewHelper", "onResume: gain focus");
            this.f159077a.mo77459x0();
        }

        public void onStop() {
            Log.m105924i("BaseFinderMiniViewHelper", "onStop: loss focus");
            this.f159077a.mo77452C0();
        }
    }

    public BaseFinderMiniViewHelper() {
        C40008f fVar = C40008f.f107254d;
        this.f159068p = new BaseFinderMiniViewHelper$checkVideoState$1(this, fVar);
        this.f159069q = new BaseFinderMiniViewHelper$voipCallEvent$1(this, fVar);
        this.f159070r = new BaseFinderMiniViewHelper$multiTalkActionListener$1(this, fVar);
        this.f159071s = new BaseFinderMiniViewHelper$multiTaskCreateListener$1(this, fVar);
        this.f159072t = new BaseFinderMiniViewHelper$finderSeekEventListener$1(this, fVar);
    }

    /* renamed from: A0 */
    public final FinderMegaVideoMiniView mo77450A0() {
        return (FinderMegaVideoMiniView) ((C36570n) this.f159067o).getValue();
    }

    /* renamed from: B0 */
    public final void mo77451B0(boolean z) {
        if (mo90541w()) {
            Log.m105925i("BaseFinderMiniViewHelper", "addMiniView, has ball, but view is different, ballInfo.customView:%s", this.f311726d.f311689g);
            BallInfo ballInfo = this.f311726d;
            ballInfo.f311680E = true;
            ballInfo.f311679D = 2048;
            ballInfo.f311689g = mo77450A0();
            BallInfo ballInfo2 = this.f311726d;
            ballInfo2.f311681F = false;
            ballInfo2.f311677B = true;
            ballInfo2.f311692j = 2;
            BallInfo.BallButtonInfo ballButtonInfo = ballInfo2.f311693n;
            ballButtonInfo.f311707e = true;
            ballButtonInfo.f311710h = true;
            mo77456G0();
            mo68414O();
        } else {
            C55850b bVar = new C55850b(this);
            long j = 200;
            long nowMilliSecond = (this.f159073u + 200) - Util.nowMilliSecond();
            if (nowMilliSecond > 0 || z) {
                Log.m105925i("FinderMegaVideoMiniViewHelper", "addMiniView, no ball, add delayed:%s", Long.valueOf(nowMilliSecond));
                if (!z) {
                    j = nowMilliSecond;
                }
                MMHandlerThread.postToMainThreadDelayed(bVar, j);
            } else {
                bVar.run();
            }
            FinderThumbPlayerProxy videoView = mo77450A0().getVideoView();
            if (videoView != null && videoView.isPlaying()) {
                mo77455F0();
            }
        }
        ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY().mo149141q(false);
        C103928o.m138642b();
    }

    /* renamed from: C0 */
    public void mo77452C0() {
    }

    /* renamed from: D0 */
    public void mo77453D0() {
        this.f159068p.dead();
        this.f159069q.dead();
        this.f159070r.dead();
        this.f159071s.dead();
        this.f159072t.dead();
    }

    /* renamed from: E0 */
    public boolean mo77454E0() {
        Log.m105924i("BaseFinderMiniViewHelper", "abandonAudioFocus");
        C34767b.C34768c cVar = this.f159066n;
        if (cVar != null) {
            ((C34767b) C86312j.m106911c(C34767b.class)).b20(cVar);
        }
        this.f159066n = null;
        if (mo90541w()) {
            Log.m105925i("BaseFinderMiniViewHelper", "removeMiniView, has ball, view:%s", mo77450A0());
            this.f159073u = Util.nowMilliSecond();
            mo77450A0().getClass();
            mo77453D0();
            mo68418k();
            return true;
        }
        Log.m105925i("BaseFinderMiniViewHelper", "removeMiniView, no ball, view:%s", mo77450A0());
        return false;
    }

    /* renamed from: F0 */
    public void mo77455F0() {
        Log.m105924i("BaseFinderMiniViewHelper", "requestAudioFocus");
        this.f159066n = ((C34767b) C86312j.m106911c(C34767b.class)).mo34192el(C34767b.C34769b.C34773f.f93456c, new C55852d(this));
    }

    /* renamed from: G0 */
    public final void mo77456G0() {
        BallInfo ballInfo = this.f311726d;
        if (ballInfo.f311690h == null) {
            ballInfo.f311690h = new Point();
        }
        FinderMegaVideoMiniView.C56148a aVar = FinderMegaVideoMiniView.f160139i;
        Resources resources = MMApplicationContext.getContext().getResources();
        C87412m.m108593f(resources, "getContext().resources");
        Size a = aVar.mo78293a(resources, mo77450A0().getShapeType());
        this.f311726d.f311690h.x = a.getWidth();
        this.f311726d.f311690h.y = a.getHeight();
        Log.m105925i("BaseFinderMiniViewHelper", "setLiveViewSize %s", this.f311726d.f311690h);
    }

    /* renamed from: v0 */
    public final void mo77457v0(C64689rq2 rq22, boolean z) {
        Object obj;
        C87412m.m108594g(rq22, "mediaObj");
        FinderMegaVideoMiniView A0 = mo77450A0();
        View.OnClickListener z0 = mo77461z0();
        View.OnClickListener y0 = mo77460y0();
        A0.getClass();
        C87412m.m108594g(z0, "clickListener");
        C87412m.m108594g(y0, "closeClickListener");
        A0.setOnClickListener(z0);
        mo77450A0().setPadding(0, 0, 0, 0);
        FinderMegaVideoMiniView A02 = mo77450A0();
        A02.getClass();
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C27696y yVar = C27696y.RAW_IMAGE;
        A02.mo78283a();
        A02.f160143g = FinderMegaVideoMiniView.C56150c.MUSIC;
        A02.f160141e.setImageDrawable((Drawable) null);
        if (rq22.f185268f == 9) {
            String str = Util.nullAsNil(rq22.f185283w) + Util.nullAsNil(rq22.f185234A);
            if (Util.isNullOrNil(str)) {
                str = rq22.f185267e + Util.nullAsNil(rq22.f185288z);
            }
            obj = new C11984n0(str, yVar);
        } else if (Util.isNullOrNil(rq22.f185283w)) {
            obj = new C62344b0(rq22, C27696y.THUMB_IMAGE, (String) null, (String) null, 12, (C8480h) null);
        } else {
            obj = new C11986o0(rq22, yVar, (String) null, 4, (C8480h) null);
        }
        C39818r rVar = C39818r.f106831a;
        ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85957c(obj, A02.f160141e, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.DARK_COMMON));
        mo77451B0(z);
    }

    /* renamed from: w0 */
    public final void mo77458w0(boolean z) {
        FinderMegaVideoMiniView A0 = mo77450A0();
        View.OnClickListener z0 = mo77461z0();
        View.OnClickListener y0 = mo77460y0();
        A0.getClass();
        C87412m.m108594g(z0, "clickListener");
        C87412m.m108594g(y0, "closeClickListener");
        A0.setOnClickListener(z0);
        mo77450A0().setPadding(0, 0, 0, 0);
        FinderMegaVideoMiniView A02 = mo77450A0();
        A02.mo78283a();
        A02.f160143g = FinderMegaVideoMiniView.C56150c.ERROR;
        A02.f160140d.setVisibility(0);
        A02.f160140d.setText(C0966R.string.m8v);
        A02.f160141e.setImageDrawable(new ColorDrawable(-16777216));
        A02.setContentDescription(A02.getResources().getString(C0966R.string.m9h));
        BallInfo ballInfo = this.f311726d;
        ballInfo.f311693n.f311706d = false;
        ballInfo.f311694o.f158210a = null;
        mo77451B0(z);
    }

    /* renamed from: x0 */
    public void mo77459x0() {
    }

    /* renamed from: y0 */
    public View.OnClickListener mo77460y0() {
        return new C55849a(this);
    }

    /* renamed from: z0 */
    public abstract View.OnClickListener mo77461z0();
}
