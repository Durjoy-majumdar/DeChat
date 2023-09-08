package qj1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.lifecycle.C0120a0;
import bl3.C39818r;
import bp1.C54519d;
import cl1.C54963d0;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveRootView;
import com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import d60.C58124b;
import di3.C86312j;
import gi1.C59464c;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60171g1;
import ht1.C60200t1;
import j20.C117292a;
import java.io.InputStream;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import l60.C99344b;
import ls3.C61397g;
import o40.C61926c;
import o40.C61937h;
import ok1.C62042e;
import p823sg.C90193h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C11991t;
import pl1.C62367r0;
import r60.C101350i;
import sx3.C110818d0;
import t60.C64207e;
import te3.C49712hj1;
import te3.C64274c60;
import te3.C64640px0;
import te3.C64689rq2;
import te3.C64756up2;
import up1.C27696y;
import x60.C102564a;
import z04.C112551y;

/* renamed from: qj1.w3 */
public final class C63081w3 extends C62660c {

    /* renamed from: p */
    public final C58124b f179013p;

    /* renamed from: q */
    public final String f179014q = "Finder.FinderLiveAudioModePreviewPlugin";

    /* renamed from: r */
    public final ImageView f179015r;

    /* renamed from: s */
    public final FrameLayout f179016s;

    /* renamed from: t */
    public FinderLiveThumbPlayerProxy f179017t;

    /* renamed from: u */
    public final FinderLiveAudioWaveRootView f179018u;

    /* renamed from: v */
    public boolean f179019v;

    /* renamed from: qj1.w3$a */
    public static final class C63082a<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ C63081w3 f179020a;

        public C63082a(C63081w3 w3Var) {
            this.f179020a = w3Var;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            C61926c.m72668M(new C63044v3((Bitmap) obj, this.f179020a));
        }
    }

    /* renamed from: qj1.w3$b */
    public static final class C63083b<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C63081w3 f179021d;

        public C63083b(C63081w3 w3Var) {
            this.f179021d = w3Var;
        }

        public void onChanged(Object obj) {
            C64756up2 up22 = (C64756up2) obj;
            if (up22 != null) {
                C63081w3 w3Var = this.f179021d;
                boolean z = true;
                if (!C62042e.f176370a.mo87097m1(up22)) {
                    z = false;
                }
                if (z) {
                    C63081w3.m74375Z0(w3Var, up22);
                    return;
                }
                String str = w3Var.f179014q;
                Log.m105924i(str, "liveRoomImg invaild = " + C61937h.m72709h(up22));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63081w3(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f179013p = bVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.de7);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.f…_live_audio_mode_preview)");
        this.f179015r = (ImageView) findViewById;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.n8m);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.f…audio_mode_video_preview)");
        this.f179016s = (FrameLayout) findViewById2;
        View findViewById3 = viewGroup.findViewById(C0966R.C0970id.n8n);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.f…der_live_audio_wave_root)");
        this.f179018u = (FinderLiveAudioWaveRootView) findViewById3;
    }

    /* renamed from: Z0 */
    public static final void m74375Z0(C63081w3 w3Var, C64756up2 up22) {
        String str;
        String str2;
        String str3 = w3Var.f179014q;
        Log.m105924i(str3, "[showLiveRoomImg] info = " + C61937h.m72709h(up22));
        w3Var.mo88020g1();
        int i = up22.f185784f;
        String str4 = "";
        if (i == 0) {
            w3Var.f179016s.removeAllViews();
            w3Var.f179016s.setVisibility(8);
            w3Var.f179015r.setVisibility(0);
            String str5 = up22.f185782d;
            if (str5 != null) {
                str4 = str5;
            }
            w3Var.mo88015b1(str4);
        } else if (i != 1) {
            Log.m105924i(w3Var.f179014q, "[showLiveRoomImg] unknown img type");
        } else {
            C64274c60 c602 = up22.f185783e;
            if (!(c602 == null || (str2 = c602.f182416e) == null)) {
                str4 = str2;
            }
            w3Var.mo88015b1(str4);
            w3Var.f179016s.removeAllViews();
            if (w3Var.f179019v) {
                Log.m105924i(w3Var.f179014q, "plugin has unmount, dont new player");
                return;
            }
            Context context = w3Var.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = new FinderLiveThumbPlayerProxy(context);
            finderLiveThumbPlayerProxy.setFullScreenEnjoy(true);
            finderLiveThumbPlayerProxy.setLoop(true);
            finderLiveThumbPlayerProxy.setMute(true);
            finderLiveThumbPlayerProxy.setScaleType(C96814a.C96817e.COVER);
            C64689rq2 rq22 = new C64689rq2();
            C64274c60 c603 = up22.f185783e;
            String str6 = c603 != null ? c603.f182415d : null;
            rq22.f185266d = str6;
            rq22.f185267e = c603 != null ? c603.f182416e : null;
            rq22.f185275p = C90193h.m112876d(str6);
            C62367r0 r0Var = new C62367r0(rq22, C27696y.V0_VIDEO, "xV0", 0, 0, (String) null, 56, (C8480h) null);
            C64274c60 c604 = up22.f185783e;
            finderLiveThumbPlayerProxy.mo78639o(r0Var, (c604 == null || (str = c604.f182415d) == null || C112551y.m153819s(str, "http", false)) ? false : true, new FeedData());
            w3Var.f179017t = finderLiveThumbPlayerProxy;
            finderLiveThumbPlayerProxy.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            String str7 = w3Var.f179014q;
            Log.m105924i(str7, "playerView new " + w3Var.f179017t);
            w3Var.f179016s.addView(w3Var.f179017t);
            FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy2 = w3Var.f179017t;
            if (finderLiveThumbPlayerProxy2 != null) {
                finderLiveThumbPlayerProxy2.setVideoViewFocused(true);
            }
            FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy3 = w3Var.f179017t;
            if (finderLiveThumbPlayerProxy3 != null) {
                C60171g1.C8767a.m8577a(finderLiveThumbPlayerProxy3, (Integer) null, 1, (Object) null);
            }
            w3Var.f179016s.setVisibility(0);
        }
    }

    /* renamed from: a1 */
    public final void mo88014a1() {
        C59464c value = ((C54963d0) mo87696x0(C54963d0.class)).f154077t.getValue();
        if (value != null && value.f169898c == 1) {
            Log.m105924i(this.f179014q, "checkMicForceMode alpha 0");
            mo88019f1(this.f179015r, false);
            mo88019f1(this.f179016s, false);
            mo88019f1(this.f179018u, false);
            return;
        }
        Log.m105924i(this.f179014q, "checkMicForceMode alpha 1");
        mo88019f1(this.f179015r, true);
        mo88019f1(this.f179016s, true);
        mo88019f1(this.f179018u, true);
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: b1 */
    public final void mo88015b1(String str) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        if (!C112551y.m153819s(str, "http", false)) {
            Uri n = C116299g2.m163858n(str);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            InputStream C = C86013q1.m106421C(n, C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null));
            C87412m.m108593f(C, "openRead(this)");
            Bitmap decodeStream = BitmapUtil.decodeStream(C, 0.0f, C76577a.m92145A(this.f166287d.getContext()), C76577a.m92159j(this.f166287d.getContext()), true);
            this.f179015r.setImageDrawable(new BitmapDrawable(this.f166287d.getContext().getResources(), decodeStream));
            ((C54991o) mo87696x0(C54991o.class)).f154254S2 = decodeStream;
            return;
        }
        C99344b<C100810g0, Bitmap> a = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85955a(new C11991t(str));
        C63082a aVar = new C63082a(this);
        a.getClass();
        a.f291320d = aVar;
        a.mo138758f(((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.LIVE_AUDIO_BG));
        a.mo85951a();
    }

    /* renamed from: c1 */
    public final void mo88016c1(boolean z) {
        FinderLiveAudioWaveRootView finderLiveAudioWaveRootView = this.f179018u;
        String str = finderLiveAudioWaveRootView.f159492d;
        Log.m105924i(str, "[showAnim] isQuickMode:" + z);
        finderLiveAudioWaveRootView.f159495g.changeMode(z);
        finderLiveAudioWaveRootView.f159496h.changeMode(z);
    }

    /* renamed from: d1 */
    public final void mo88017d1() {
        FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = this.f179017t;
        FinderLiveAudioWaveRootView finderLiveAudioWaveRootView = null;
        if (finderLiveThumbPlayerProxy != null) {
            if (!finderLiveThumbPlayerProxy.isPlaying()) {
                finderLiveThumbPlayerProxy = null;
            }
            if (finderLiveThumbPlayerProxy != null) {
                finderLiveThumbPlayerProxy.pause();
            }
        }
        FinderLiveAudioWaveRootView finderLiveAudioWaveRootView2 = this.f179018u;
        if (finderLiveAudioWaveRootView2.isShown()) {
            finderLiveAudioWaveRootView = finderLiveAudioWaveRootView2;
        }
        if (finderLiveAudioWaveRootView != null) {
            finderLiveAudioWaveRootView.mo77689a();
        }
    }

    /* renamed from: e1 */
    public final void mo88018e1(boolean z, boolean z2) {
        if (!z || (!z2 && !((C61397g) C86312j.m106911c(C61397g.class)).Da0(((C54519d) mo87696x0(C54519d.class)).mo75372e3()))) {
            this.f179018u.mo77689a();
            return;
        }
        FinderLiveAudioWaveRootView finderLiveAudioWaveRootView = this.f179018u;
        finderLiveAudioWaveRootView.f159495g.setWaveStart(true, false);
        finderLiveAudioWaveRootView.f159496h.setWaveStart(true, true);
    }

    /* renamed from: f1 */
    public final void mo88019f1(View view, boolean z) {
        float f = z ? 1.0f : 0.0f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAudioModePreviewPlugin", "setViewAlpha", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAudioModePreviewPlugin", "setViewAlpha", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    /* renamed from: g1 */
    public final void mo88020g1() {
        String str = this.f179014q;
        Log.m105924i(str, "playerView stopAndReleasePlayerView " + this.f179017t);
        FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = this.f179017t;
        if (finderLiveThumbPlayerProxy != null) {
            finderLiveThumbPlayerProxy.stop();
        }
        FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy2 = this.f179017t;
        if (finderLiveThumbPlayerProxy2 != null) {
            finderLiveThumbPlayerProxy2.mo78608c();
        }
        FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy3 = this.f179017t;
        if (finderLiveThumbPlayerProxy3 != null) {
            finderLiveThumbPlayerProxy3.mo78609d();
        }
        this.f179017t = null;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return false;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
        this.f179019v = false;
        if (((C61397g) C86312j.m106911c(C61397g.class)).Da0(((C54519d) mo87696x0(C54519d.class)).mo75372e3())) {
            ((C54991o) mo87696x0(C54991o.class)).f154237P.observe(this, new C63083b(this));
        }
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11992m0(java.util.LinkedHashMap<java.lang.String, android.graphics.Rect> r8) {
        /*
            r7 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            java.lang.String r1 = "micUserMap"
            gy3.C87412m.m108594g(r8, r1)
            r7.mo88014a1()
            java.lang.Class<cl1.u> r1 = cl1.C55001u.class
            androidx.lifecycle.i0 r1 = r7.mo87696x0(r1)
            cl1.u r1 = (cl1.C55001u) r1
            te3.bq2 r1 = r1.f154419p
            java.lang.String r1 = r1.f182319n
            java.lang.Object r1 = r8.get(r1)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            if (r1 != 0) goto L_0x0023
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
        L_0x0023:
            android.view.ViewGroup r2 = r7.f166287d
            android.view.ViewParent r2 = r2.getParent()
            boolean r3 = r2 instanceof android.view.View
            r4 = 0
            if (r3 == 0) goto L_0x0031
            android.view.View r2 = (android.view.View) r2
            goto L_0x0032
        L_0x0031:
            r2 = r4
        L_0x0032:
            if (r2 == 0) goto L_0x0039
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            goto L_0x003a
        L_0x0039:
            r2 = r4
        L_0x003a:
            boolean r3 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r3 == 0) goto L_0x0041
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            goto L_0x0042
        L_0x0041:
            r2 = r4
        L_0x0042:
            r3 = 0
            if (r2 == 0) goto L_0x0048
            int r2 = r2.topMargin
            goto L_0x0049
        L_0x0048:
            r2 = 0
        L_0x0049:
            android.view.ViewGroup r5 = r7.f166287d
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            boolean r6 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r6 == 0) goto L_0x0056
            r4 = r5
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
        L_0x0056:
            if (r4 == 0) goto L_0x0076
            int r5 = r1.left
            r4.leftMargin = r5
            int r5 = r1.top
            int r5 = r5 - r2
            com.tencent.mm.plugin.finder.live.view.b r2 = r7.mo14484z0()
            int r2 = r2.getVideoSpaceHeight()
            int r5 = r5 - r2
            r4.topMargin = r5
            int r2 = r1.width()
            r4.width = r2
            int r1 = r1.height()
            r4.height = r1
        L_0x0076:
            int r8 = r8.size()
            r1 = 1
            if (r8 > r1) goto L_0x009a
            androidx.lifecycle.i0 r8 = r7.mo87696x0(r0)
            cl1.o r8 = (cl1.C54991o) r8
            boolean r8 = r8.mo75960G3()
            androidx.lifecycle.i0 r0 = r7.mo87696x0(r0)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r0 = r0.mo75999e4()
            r7.mo88018e1(r8, r0)
            com.tencent.mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveRootView r8 = r7.f179018u
            r8.setVisibility(r3)
            return
        L_0x009a:
            com.tencent.mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveRootView r8 = r7.f179018u
            r0 = 4
            r8.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C63081w3.mo11992m0(java.util.LinkedHashMap):void");
    }

    /* renamed from: s0 */
    public void mo3209s0() {
        Class cls = C54991o.class;
        mo88018e1(((C54991o) mo87696x0(cls)).mo75960G3(), ((C54991o) mo87696x0(cls)).mo75999e4());
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        String str;
        FinderObjectDesc finderObjectDesc;
        LinkedList<FinderMedia> linkedList;
        FinderMedia finderMedia;
        String str2;
        FinderObjectDesc finderObjectDesc2;
        C64640px0 px02;
        FinderObjectDesc finderObjectDesc3;
        LinkedList<FinderMedia> linkedList2;
        FinderMedia finderMedia2;
        FinderObjectDesc finderObjectDesc4;
        C64640px0 px03;
        Class cls = C54991o.class;
        C87412m.m108594g(bVar, "status");
        super.mo3210u0(bVar, bundle);
        int ordinal = bVar.ordinal();
        boolean z = false;
        if (ordinal == 5) {
            this.f179018u.setVisibility(0);
        } else if (ordinal != 6) {
            if (ordinal == 7 || ordinal == 165) {
                this.f179018u.setVisibility(0);
                mo88018e1(((C54991o) mo87696x0(cls)).mo75960G3(), true);
            } else if (ordinal == 169) {
                boolean z2 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false) : false;
                boolean z3 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", false) : false;
                String str3 = this.f179014q;
                StringBuilder sb = new StringBuilder();
                sb.append("checkAudioMode isAudioMode:");
                sb.append(z2);
                sb.append(" business(LiveCommonSlice::class.java).audioModeHolderBm:");
                sb.append(((C54991o) mo87696x0(cls)).f154254S2);
                sb.append(" liveDesc.cover:");
                FinderObject finderObject = ((C54991o) mo87696x0(cls)).f154341n;
                String str4 = null;
                sb.append((finderObject == null || (finderObjectDesc4 = finderObject.objectDesc) == null || (px03 = finderObjectDesc4.liveDesc) == null) ? null : px03.f184911d);
                sb.append(" media.url:");
                FinderObject finderObject2 = ((C54991o) mo87696x0(cls)).f154341n;
                sb.append((finderObject2 == null || (finderObjectDesc3 = finderObject2.objectDesc) == null || (linkedList2 = finderObjectDesc3.media) == null || (finderMedia2 = (FinderMedia) C110818d0.m150916N(linkedList2)) == null) ? null : finderMedia2.url);
                Log.m105924i(str3, sb.toString());
                if (C62042e.f176370a.mo87030O0()) {
                    if (z2) {
                        C61926c.m72668M(new C63004u3(this, ((C54991o) mo87696x0(cls)).mo75973N3(), ((C54991o) mo87696x0(cls)).f154249R2.f151970a, ((C54991o) mo87696x0(cls)).f154249R2.f151971b, ((C54991o) mo87696x0(cls)).f154249R2.f151972c));
                    } else {
                        mo10792g(4);
                    }
                } else if (z2) {
                    FinderObject finderObject3 = ((C54991o) mo87696x0(cls)).f154341n;
                    if (!(finderObject3 == null || (finderObjectDesc2 = finderObject3.objectDesc) == null || (px02 = finderObjectDesc2.liveDesc) == null)) {
                        str4 = px02.f184911d;
                    }
                    if (str4 == null || str4.length() == 0) {
                        z = true;
                    }
                    if (z) {
                        FinderObject finderObject4 = ((C54991o) mo87696x0(cls)).f154341n;
                        str = (finderObject4 == null || (finderObjectDesc = finderObject4.objectDesc) == null || (linkedList = finderObjectDesc.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) == null || (str2 = finderMedia.url) == null) ? "" : str2;
                    } else {
                        str = str4;
                    }
                    C61926c.m72668M(new C63004u3(this, ((C54991o) mo87696x0(cls)).mo75973N3(), str, "", ""));
                } else {
                    mo10792g(4);
                }
                if (!z2) {
                    mo88020g1();
                }
                mo88014a1();
                mo88018e1(z2, ((C54991o) mo87696x0(cls)).mo75999e4());
                if (z3) {
                    mo10792g(4);
                }
                String str5 = this.f179014q;
                Log.m105924i(str5, "FINDER_LIVE_MODE_SWITCH isAudioMode:" + z2);
            }
        } else if (((C54991o) mo87696x0(cls)).mo75960G3()) {
            this.f179018u.setVisibility(4);
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        this.f179019v = true;
        mo88020g1();
    }
}
