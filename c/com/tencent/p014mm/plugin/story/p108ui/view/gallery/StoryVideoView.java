package com.tencent.p014mm.plugin.story.p108ui.view.gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryPreviewReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WCStoryVideoPlayReportStruct;
import com.tencent.p014mm.modelvideo.MMVideoView;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tav.core.AssetExtension;
import com.tencent.xweb.IXWebBroadcastListener;
import cw2.C97399u;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import gw2.C98268m;
import gw2.C98269n;
import gy3.C87412m;
import j20.C117292a;
import jw2.C99069d;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import kw2.C34078m;
import kw2.C99264e;
import kw2.C99265f;
import kw2.C99268i;
import kw2.C99269j;
import p500dy.C97560f;
import te3.bc4;
import vd3.C102168a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\u0002J\u0012\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoView;", "Lcom/tencent/mm/modelvideo/MMVideoView;", "", "getSessionId", "", "mute", "Lrx3/b0;", "setMute", "show", "setNeedShowLoading", "", "getStayTime", "getErrorCode", "getFilePath", "Lcom/tencent/mm/pluginsdk/ui/a$e;", "scaleType", "setScaleType", "", "q1", "J", "getFirstPlayWaitTime", "()J", "setFirstPlayWaitTime", "(J)V", "firstPlayWaitTime", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView */
public final class StoryVideoView extends MMVideoView {

    /* renamed from: s1 */
    public static final /* synthetic */ int f282131s1 = 0;

    /* renamed from: g1 */
    public boolean f282132g1;

    /* renamed from: h1 */
    public boolean f282133h1 = true;

    /* renamed from: i1 */
    public boolean f282134i1;

    /* renamed from: j1 */
    public boolean f282135j1;

    /* renamed from: k1 */
    public String f282136k1;

    /* renamed from: l1 */
    public boolean f282137l1;

    /* renamed from: m1 */
    public RelativeLayout f282138m1;

    /* renamed from: n1 */
    public ImageView f282139n1;

    /* renamed from: o1 */
    public C98268m f282140o1;

    /* renamed from: p1 */
    public long f282141p1;

    /* renamed from: q1 */
    public long f282142q1;

    /* renamed from: r1 */
    public TextView f282143r1;

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView$a */
    public static final class C96439a implements C96875r0.C96876a {

        /* renamed from: d */
        public final /* synthetic */ StoryVideoView f282144d;

        /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView$a$a */
        public static final class C96440a implements C96875r0.C96879e {

            /* renamed from: d */
            public final /* synthetic */ StoryVideoView f282145d;

            /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView$a$a$a */
            public static final class C96441a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ StoryVideoView f282146d;

                public C96441a(StoryVideoView storyVideoView) {
                    this.f282146d = storyVideoView;
                }

                public final void run() {
                    StoryVideoView storyVideoView = this.f282146d;
                    int i = StoryVideoView.f282131s1;
                    Log.m105924i(storyVideoView.f283586e, "onTextureUpdate");
                    StoryVideoView storyVideoView2 = this.f282146d;
                    if (storyVideoView2.f283595q != null) {
                        storyVideoView2.mo135072F();
                        C96875r0 r0Var = this.f282146d.f283595q;
                        C87412m.m108592e(r0Var, "null cannot be cast to non-null type android.view.View");
                        View view = (View) r0Var;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Float.valueOf(1.0f));
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryVideoView$playLocalVideo$1$onPrepared$1$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/story/ui/view/gallery/StoryVideoView$playLocalVideo$1$onPrepared$1$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    }
                }
            }

            public C96440a(StoryVideoView storyVideoView) {
                this.f282145d = storyVideoView;
            }

            /* renamed from: r */
            public final void mo79636r() {
                StoryVideoView storyVideoView = this.f282145d;
                storyVideoView.setFirstPlayWaitTime(Util.ticksToNow(storyVideoView.f282141p1));
                MMHandlerThread.postToMainThreadDelayed(new C96441a(this.f282145d), 50);
            }
        }

        public C96439a(StoryVideoView storyVideoView) {
            this.f282144d = storyVideoView;
        }

        /* renamed from: M0 */
        public int mo76207M0(int i, int i2) {
            C98268m mVar = this.f282144d.f282140o1;
            boolean z = true;
            if (mVar == null || !mVar.mo137567a()) {
                z = false;
            }
            if (z) {
                this.f282144d.getClass();
            }
            return 0;
        }

        public void onCompletion() {
            StoryVideoView storyVideoView = this.f282144d;
            int i = StoryVideoView.f282131s1;
            String str = storyVideoView.f283586e;
            StringBuilder sb = new StringBuilder();
            sb.append("localVideo onCompleted, isFakeVideo:");
            C98268m mVar = this.f282144d.f282140o1;
            sb.append(mVar != null ? Boolean.valueOf(mVar.mo137567a()) : null);
            sb.append(", fakeStartTime:");
            this.f282144d.getClass();
            sb.append(0);
            Log.m105924i(str, sb.toString());
            C98268m mVar2 = this.f282144d.f282140o1;
            boolean z = false;
            if (mVar2 != null && mVar2.mo137567a()) {
                z = true;
            }
            if (z) {
                this.f282144d.getClass();
            }
            this.f282144d.f283595q.mo24787a(0.0d, true);
            StoryVideoView storyVideoView2 = this.f282144d;
            C96814a.C57541b bVar = storyVideoView2.f283598t;
            if (bVar != null) {
                bVar.mo22958L(storyVideoView2.getSessionId(), this.f282144d.getMediaId());
            }
        }

        public void onError(int i, int i2) {
        }

        public void onPrepared() {
            StoryVideoView storyVideoView = this.f282144d;
            int i = StoryVideoView.f282131s1;
            String str = storyVideoView.f283586e;
            StringBuilder sb = new StringBuilder();
            sb.append("localVideo onPrepared, isLocalVideoPause:");
            sb.append(this.f282144d.f282137l1);
            sb.append(", isFakeVideo:");
            C98268m mVar = this.f282144d.f282140o1;
            sb.append(mVar != null ? Boolean.valueOf(mVar.mo137567a()) : null);
            sb.append(", fakeStartTime:");
            this.f282144d.getClass();
            sb.append(0);
            sb.append(", fakeEndTime:");
            this.f282144d.getClass();
            sb.append(0);
            Log.m105924i(str, sb.toString());
            StoryVideoView storyVideoView2 = this.f282144d;
            if (!storyVideoView2.f282137l1) {
                C98268m mVar2 = storyVideoView2.f282140o1;
                boolean z = true;
                if (mVar2 == null || !mVar2.mo137567a()) {
                    z = false;
                }
                if (z) {
                    this.f282144d.getClass();
                }
                this.f282144d.f283595q.start();
                StoryVideoView storyVideoView3 = this.f282144d;
                storyVideoView3.f283595q.setOneTimeVideoTextureUpdateCallback(new C96440a(storyVideoView3));
            }
        }

        /* renamed from: p3 */
        public void mo76226p3(int i, int i2) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView$b */
    public static final class C96442b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ StoryVideoView f282147d;

        /* renamed from: e */
        public final /* synthetic */ WCStoryVideoPlayReportStruct f282148e;

        /* renamed from: f */
        public final /* synthetic */ long f282149f;

        public C96442b(StoryVideoView storyVideoView, WCStoryVideoPlayReportStruct wCStoryVideoPlayReportStruct, long j) {
            this.f282147d = storyVideoView;
            this.f282148e = wCStoryVideoPlayReportStruct;
            this.f282149f = j;
        }

        public final void run() {
            StoryVideoView storyVideoView = this.f282147d;
            int i = StoryVideoView.f282131s1;
            Log.m105924i(storyVideoView.f283586e, "reportStopLocalVideo");
            C94554a Z40 = ((C97560f) C86312j.m106911c(C97560f.class)).Z40(this.f282147d.f267504p0);
            if (Z40 != null) {
                WCStoryVideoPlayReportStruct wCStoryVideoPlayReportStruct = this.f282148e;
                long j = this.f282149f;
                wCStoryVideoPlayReportStruct.f156936h = (long) Z40.f273443a;
                C99269j i2 = StoryCore.f281736t.mo134191i();
                C99268i Yt = j >= 0 ? i2.mo138667Yt((int) j) : i2.mo138664Ow(j);
                wCStoryVideoPlayReportStruct.f156934f = (long) (Yt != null ? Yt.field_readCount : 0);
                wCStoryVideoPlayReportStruct.f156946r = (long) Z40.f273444b;
                wCStoryVideoPlayReportStruct.mo86054n();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        setRootPath(C86013q1.m106448i(StoryCore.f281736t.mo134184b(), true));
        this.f283600v.post(new C102168a(this));
        setIsShowBasicControls(false);
        this.f283592n.setVisibility(8);
        this.f283586e = "MicroMsg.StoryVideoView";
    }

    /* renamed from: E */
    public C96875r0 mo79608E(Context context) {
        StoryVideoPlayTextureView storyVideoPlayTextureView = new StoryVideoPlayTextureView(context);
        storyVideoPlayTextureView.setOpenWithNoneSurface(true);
        storyVideoPlayTextureView.setNeedResetExtractor(mo134415j0());
        storyVideoPlayTextureView.setIsOnlineVideoType(true);
        return storyVideoPlayTextureView;
    }

    /* renamed from: H */
    public void mo79392H() {
        super.mo79392H();
        this.f282138m1 = new RelativeLayout(getContext());
        ImageView imageView = new ImageView(getContext());
        this.f282139n1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ImageView imageView2 = this.f282139n1;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        RelativeLayout relativeLayout = this.f283590i;
        RelativeLayout relativeLayout2 = this.f282138m1;
        if (relativeLayout2 != null) {
            relativeLayout.addView(relativeLayout2, new ViewGroup.LayoutParams(-1, -1));
            this.f283590i.addView(this.f282139n1, 0);
            this.f282143r1 = (TextView) findViewById(C0966R.C0970id.l7q);
            return;
        }
        C87412m.m108603p("fakeLayer");
        throw null;
    }

    /* renamed from: R */
    public void mo129179R() {
        if (this.f282133h1) {
            mo127367S(800);
        }
    }

    /* renamed from: T */
    public void mo127230T(boolean z) {
        String str = this.f283586e;
        Log.printInfoStack(str, mo76634K() + " startTimer, isLocalVideo:" + this.f282134i1, new Object[0]);
        if (!this.f282134i1) {
            super.mo127230T(z);
        }
    }

    /* renamed from: U */
    public void mo127231U() {
        String str = this.f283586e;
        Log.printInfoStack(str, mo76634K() + " stopTimer, isLocalVideo:" + this.f282134i1, new Object[0]);
        super.mo127231U();
    }

    /* renamed from: Y */
    public boolean mo79611Y(int i, PInt pInt, PInt pInt2) {
        String str;
        C87412m.m108594g(pInt, IXWebBroadcastListener.STAGE_START);
        C87412m.m108594g(pInt2, "end");
        pInt.value = Math.max(i, this.f267495W0);
        int i2 = this.f267486Q0;
        if (i2 == 1) {
            pInt.value = i;
            pInt2.value = this.f267496X0 + i;
            str = "step1;";
        } else {
            str = "";
        }
        if (i2 == 2) {
            int i3 = i - 8;
            pInt.value = i3;
            if (i3 < 0) {
                pInt.value = 0;
            }
            pInt2.value = pInt.value + this.f267496X0 + 8;
            str = str + "step2;";
        }
        int i4 = this.f267486Q0;
        if (i4 == 3) {
            pInt.value = this.f267495W0;
            pInt2.value = i + 1 + this.f267500b1.f157765b;
            str = str + "step3;";
        } else if (i4 == 4) {
            pInt.value = this.f267495W0;
            pInt2.value = this.f267496X0 + i + 1 + this.f267500b1.f157765b;
            str = str + "step4;";
        }
        int i5 = pInt2.value;
        int i6 = this.f267488S0;
        if (i5 >= i6 + 1) {
            pInt2.value = i6 + 1;
            str = str + "step5;";
        }
        int i7 = pInt2.value;
        int i8 = pInt.value;
        if (i7 < i8) {
            pInt2.value = i8 + this.f267500b1.f157765b;
            return false;
        }
        Log.m105925i(this.f283586e, "%s calcDownloadRange range[%d, %d] playTime[%d] playStatus[%d] cache[%d, %d] [%s] %s", mo76634K(), Integer.valueOf(pInt.value), Integer.valueOf(pInt2.value), Integer.valueOf(i), Integer.valueOf(this.f267486Q0), Integer.valueOf(this.f267495W0), Integer.valueOf(this.f267496X0), this.f267494W, str);
        return true;
    }

    /* renamed from: Z */
    public boolean mo79612Z(int i) {
        boolean Z = super.mo79612Z(i);
        String str = this.f283586e;
        Log.m105924i(str, "checkCanPlay, cachePlayTime:" + this.f267495W0 + ", ret:" + Z);
        return Z;
    }

    /* renamed from: b */
    public void mo79614b() {
        String str = this.f283586e;
        Log.m105924i(str, "onUIPause, isLocalVideo:" + this.f282134i1);
        if (this.f282134i1) {
            C96875r0 r0Var = this.f283595q;
            if (r0Var != null) {
                r0Var.pause();
                return;
            }
            return;
        }
        super.mo79614b();
    }

    /* renamed from: c */
    public void mo79616c() {
        String str = this.f283586e;
        Log.m105924i(str, "onUIDestroy, isLocalVideo:" + this.f282134i1);
        super.mo79616c();
    }

    /* renamed from: e */
    public void mo76638e(String str, long j, long j2) {
        int i;
        if (Util.isEqual(this.f267494W, str)) {
            String str2 = this.f283586e;
            Log.m105919d(str2, "%s download  onProgress [%d, %d], pauseByLoadData:" + this.f267493V0 + ", playStatus:" + this.f267486Q0 + ", currPosMs:" + getCurrPosMs() + ", isPlyaing:" + this.f283595q.isPlaying(), mo76634K(), Long.valueOf(j), Long.valueOf(j2));
            if ((getCurrPosMs() <= 0 || (i = this.f267486Q0) == 1 || i == 0) && mo127232a0(getCurrPosSec())) {
                mo127230T(true);
            }
        }
    }

    /* renamed from: f */
    public void mo79617f() {
        String str = this.f283586e;
        Log.m105924i(str, "onUIResume, isLocalVideo:" + this.f282134i1);
        if (!this.f282134i1) {
            super.mo79617f();
        }
    }

    /* renamed from: f0 */
    public void mo127234f0() {
        String str = this.f283586e;
        Log.m105924i(str, "prepareVideo, surfaceAvailable:" + this.f282135j1);
        C96875r0 r0Var = this.f283595q;
        if (r0Var != null) {
            C87412m.m108592e(r0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoPlayTextureView");
            ((StoryVideoPlayTextureView) r0Var).setNeedResetExtractor(mo134415j0());
        }
        String str2 = this.f267504p0;
        C87412m.m108593f(str2, "filepath");
        mo134419n0(str2);
        super.mo127234f0();
    }

    public final int getErrorCode() {
        return this.f283584N.f300845k;
    }

    public final String getFilePath() {
        String str = this.f267504p0;
        C87412m.m108593f(str, "filepath");
        return str;
    }

    public final long getFirstPlayWaitTime() {
        return this.f282142q1;
    }

    public String getSessionId() {
        String nullAsNil = Util.nullAsNil(this.f282136k1);
        C87412m.m108593f(nullAsNil, "nullAsNil(sessionId)");
        return nullAsNil;
    }

    public final int getStayTime() {
        return (int) Util.ticksToNow(this.f282141p1);
    }

    /* renamed from: h */
    public void mo76636h(boolean z, String str, int i) {
        super.mo76636h(z, str, i);
    }

    /* renamed from: h0 */
    public void mo79628h0() {
        super.mo79628h0();
        this.f282135j1 = false;
        this.f282136k1 = null;
    }

    /* renamed from: i */
    public boolean mo129198i() {
        if (this.f282134i1) {
            return false;
        }
        return super.mo129198i();
    }

    /* renamed from: j0 */
    public final boolean mo134415j0() {
        if (this.f282134i1) {
            return false;
        }
        try {
            return C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_VIDEO_NEED_RESET_EXTRACTOR_BOOLEAN, false);
        } catch (Exception e) {
            Log.printErrStackTrace(this.f283586e, e, "check need reset error", new Object[0]);
            return false;
        }
    }

    /* renamed from: k */
    public void mo127239k() {
        Log.m105924i(this.f283586e, "onSurfaceAvailable");
        this.f282135j1 = true;
    }

    /* renamed from: k0 */
    public final void mo134416k0(C98268m mVar, String str) {
        C98268m mVar2 = mVar;
        String str2 = str;
        C87412m.m108594g(mVar2, "item");
        TextView textView = this.f282143r1;
        if (textView != null) {
            textView.setVisibility(8);
        }
        this.f282140o1 = mVar2;
        bc4 bc4 = mVar2.f288093f;
        int i = mVar2.f288090c;
        RelativeLayout relativeLayout = this.f282138m1;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
            ImageView imageView = this.f282139n1;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (!(mVar2.f288092e != C98269n.Empty)) {
                Log.m105924i(this.f283586e, "play empty item");
                mo129179R();
                return;
            }
            if (mVar.mo137567a()) {
                Log.m105924i(this.f283586e, "LogStory: play fake video");
            } else {
                Log.m105924i(this.f283586e, "LogStory: play normal video");
                C97399u uVar = C97399u.f285903a;
                String e = uVar.mo136671e(bc4);
                if (C86013q1.m106451l(e) > 0) {
                    String str3 = this.f283586e;
                    Log.m105924i(str3, "play " + e + " downloadDone now can play " + bc4.f297959d);
                    this.f267504p0 = e;
                    if (e != null) {
                        mo134417l0(e);
                    }
                } else {
                    C34078m b = uVar.mo136668b(mVar2);
                    int l = (int) C86013q1.m106451l(b.field_filePath);
                    String str4 = this.f283586e;
                    Log.m105924i(str4, "play " + e + " error try play from url or videoCache " + bc4.f297959d + " fileLength:" + l + " cacheSize:" + b.field_cacheSize);
                    if (l < b.field_cacheSize) {
                        b.field_cacheSize = l;
                        StoryCore.f281736t.mo134193k().mo138677qq(b);
                    }
                    Log.m105924i(this.f283586e, String.valueOf(b));
                    if (!b.mo59431l2() || !C86013q1.m106450k(b.field_filePath)) {
                        if (b.mo59431l2() && !C86013q1.m106450k(b.field_filePath)) {
                            String str5 = this.f283586e;
                            Log.m105924i(str5, "error downloadFinish " + b.mo59431l2() + " ret:" + C86013q1.m106450k(b.field_filePath));
                            b.field_cacheSize = 0;
                            b.field_totalSize = 0;
                            StoryCore.f281736t.mo134193k().mo138677qq(b);
                        }
                        String str6 = this.f283586e;
                        Log.m105924i(str6, "play " + bc4.f297959d + ' ' + str2 + " start online play " + b.field_filePath);
                        mo79628h0();
                        this.f283595q.stop();
                        this.f283595q.setVideoCallback(this);
                        this.f282134i1 = false;
                        this.f283602x = true;
                        setNeedShowLoading(true);
                        super.mo76636h(false, mVar2.f288093f.f297961f, (int) bc4.f297978z);
                        this.f267504p0 = b.field_filePath;
                        this.f267494W = uVar.mo136667a(i, bc4.f297961f);
                        this.f282136k1 = str2;
                        this.f282141p1 = Util.currentTicks();
                        this.f282142q1 = 0;
                        start();
                    } else {
                        String str7 = this.f283586e;
                        Log.m105924i(str7, "play " + bc4.f297959d + " download finish");
                        this.f267504p0 = b.field_filePath;
                        this.f267494W = uVar.mo136667a(i, bc4.f297961f);
                        String str8 = this.f267504p0;
                        C87412m.m108593f(str8, "filepath");
                        mo134417l0(str8);
                    }
                }
            }
            setLoop(true);
            C96875r0 r0Var = this.f283595q;
            C87412m.m108592e(r0Var, "null cannot be cast to non-null type android.view.View");
            View view = (View) r0Var;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(0.0f));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryVideoView", AssetExtension.SCENE_PLAY, "(Lcom/tencent/mm/plugin/story/model/gallery/StoryVideoItem;Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/story/ui/view/gallery/StoryVideoView", AssetExtension.SCENE_PLAY, "(Lcom/tencent/mm/plugin/story/model/gallery/StoryVideoItem;Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            return;
        }
        C87412m.m108603p("fakeLayer");
        throw null;
    }

    /* renamed from: l0 */
    public final void mo134417l0(String str) {
        String str2;
        String str3 = this.f283586e;
        Log.m105924i(str3, "playLocalVideo: " + str + ", isPlayingNow:" + this.f283595q.isPlaying());
        if (this.f283595q == null) {
            this.f283595q = mo79608E(getContext());
        }
        mo79628h0();
        C96875r0 r0Var = this.f283595q;
        if (r0Var != null) {
            r0Var.stop();
        }
        C96875r0 r0Var2 = this.f283595q;
        if (r0Var2 != null) {
            r0Var2.setMute(this.f282132g1);
        }
        this.f283615P = false;
        this.f282134i1 = true;
        setDownloadStatus(3);
        setNeedShowLoading(false);
        C96875r0 r0Var3 = this.f283595q;
        C87412m.m108592e(r0Var3, "null cannot be cast to non-null type com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoPlayTextureView");
        ((StoryVideoPlayTextureView) r0Var3).setNeedResetExtractor(mo134415j0());
        this.f283595q.setVideoPath(str);
        this.f282141p1 = Util.currentTicks();
        this.f282142q1 = 0;
        C98268m mVar = this.f282140o1;
        if (mVar == null || (str2 = mVar.f288091d) == null) {
            str2 = "";
        }
        C99265f g = StoryCore.f281736t.mo134189g();
        C99264e Ow = g.mo138640Ow(str2);
        boolean l2 = Ow.mo138638l2();
        long j = Ow.field_readId;
        long j2 = Ow.field_syncId;
        if (j != j2) {
            Ow.field_readId = j2;
            Ow.field_readTime = C31543z5.m39453c();
            boolean SE = g.mo138641SE(Ow);
            boolean l25 = Ow.mo138638l2();
            if (SE && l2 && !l25) {
                g.doNotify("notify_story_read", 1, Ow);
            }
        }
        this.f283595q.setVideoCallback(new C96439a(this));
        this.f282137l1 = false;
        this.f282136k1 = null;
        mo134419n0(str);
    }

    /* renamed from: m */
    public void mo76640m(String str, int i) {
        super.mo76640m(str, i);
    }

    /* renamed from: m0 */
    public final void mo134418m0() {
        WCStoryVideoPlayReportStruct wCStoryVideoPlayReportStruct = new WCStoryVideoPlayReportStruct();
        C98268m mVar = this.f282140o1;
        wCStoryVideoPlayReportStruct.f156932d = wCStoryVideoPlayReportStruct.mo86045b("StoryId", String.valueOf(mVar != null ? Long.valueOf(mVar.f288089b) : null), true);
        StoryPreviewReportStruct storyPreviewReportStruct = C99069d.f290421d;
        wCStoryVideoPlayReportStruct.f156933e = storyPreviewReportStruct.f266265e;
        long j = 0;
        wCStoryVideoPlayReportStruct.f156935g = storyPreviewReportStruct.f266274n == 1 ? 1 : 0;
        wCStoryVideoPlayReportStruct.f156938j = this.f282142q1;
        wCStoryVideoPlayReportStruct.f156943o = (long) getStayTime();
        wCStoryVideoPlayReportStruct.f156944p = (long) getErrorCode();
        wCStoryVideoPlayReportStruct.f156919Q = 1;
        StoryPreviewReportStruct storyPreviewReportStruct2 = C99069d.f290421d;
        wCStoryVideoPlayReportStruct.f156920R = storyPreviewReportStruct2.f266264d;
        wCStoryVideoPlayReportStruct.f156921S = storyPreviewReportStruct2.f266270j;
        wCStoryVideoPlayReportStruct.f156937i = (long) getCurrPosMs();
        Log.m105919d(this.f283586e, "time distance %d", Long.valueOf(System.currentTimeMillis() - wCStoryVideoPlayReportStruct.f156921S));
        if (System.currentTimeMillis() - wCStoryVideoPlayReportStruct.f156921S >= 500) {
            C98268m mVar2 = this.f282140o1;
            if (mVar2 != null) {
                j = mVar2.f288089b;
            }
            try {
                StoryCore.f281736t.mo134194l().post(new C96442b(this, wCStoryVideoPlayReportStruct, j));
            } catch (Exception e) {
                Log.printErrStackTrace(this.f283586e, e, "reportStopLocalVideo", new Object[0]);
                wCStoryVideoPlayReportStruct.mo86054n();
            }
        }
    }

    /* renamed from: n0 */
    public final void mo134419n0(String str) {
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LOCAL_SIGHT_DEBUGINFO_INT_SYNC, 0);
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Int");
        if (((Integer) f).intValue() == 1) {
            TextView textView = this.f282143r1;
            if (textView != null) {
                textView.setText(((C97560f) C86312j.m106911c(C97560f.class)).mo136825un(str));
            }
            TextView textView2 = this.f282143r1;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        }
    }

    public void onCompletion() {
        String str = this.f283586e;
        Log.m105924i(str, "onCompletion, currPosMs:" + getCurrPosMs() + ", playStatus:" + this.f267486Q0 + ", downloadStatus:" + this.f267506y0);
        if (getCurrPosMs() > 0) {
            C96814a.C57541b bVar = this.f283598t;
            if (bVar != null) {
                bVar.mo22958L(getSessionId(), getMediaId());
            }
            super.onCompletion();
        }
    }

    /* renamed from: p3 */
    public void mo76226p3(int i, int i2) {
        super.mo76226p3(i, i2);
        String str = this.f283586e;
        Log.m105924i(str, "onGetVideoSize, mediaId:" + getMediaId() + ", isLocalVideo:" + this.f282134i1 + ", isPrepareVideo:" + this.f267497Y0 + ", isPrepared:" + this.f283572B + ", playerStatus:" + this.f267486Q0 + ", downloadStatus:" + this.f267506y0);
    }

    public boolean pause() {
        String str = this.f283586e;
        Log.m105924i(str, "pause, isLocalVideo:" + this.f282134i1);
        if (!this.f282134i1) {
            return super.pause();
        }
        this.f282137l1 = true;
        this.f283595q.pause();
        return true;
    }

    /* renamed from: r */
    public void mo79636r() {
        super.mo79636r();
        C96875r0 r0Var = this.f283595q;
        C87412m.m108592e(r0Var, "null cannot be cast to non-null type android.view.View");
        View view = (View) r0Var;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryVideoView", "onTextureUpdate", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/story/ui/view/gallery/StoryVideoView", "onTextureUpdate", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (this.f282142q1 <= 0) {
            this.f282142q1 = Util.ticksToNow(this.f282141p1);
            String str = this.f283586e;
            StringBuilder sb = new StringBuilder();
            sb.append("onTextureUpdate firstPlayWaitTime ");
            sb.append(this.f282142q1);
            sb.append(" storyId: ");
            C98268m mVar = this.f282140o1;
            sb.append(mVar != null ? Long.valueOf(mVar.f288089b) : null);
            Log.m105924i(str, sb.toString());
        }
    }

    public final void setFirstPlayWaitTime(long j) {
        this.f282142q1 = j;
    }

    public void setMute(boolean z) {
        super.setMute(z);
        this.f282132g1 = z;
        C96875r0 r0Var = this.f283595q;
        if (r0Var != null) {
            r0Var.setMute(z);
        }
    }

    public final void setNeedShowLoading(boolean z) {
        String str = this.f283586e;
        Log.m105924i(str, hashCode() + " setNeedShowLoading: " + z);
        this.f282133h1 = z;
        if (!z) {
            mo135072F();
        }
    }

    public void setScaleType(C96814a.C96817e eVar) {
        super.setScaleType(eVar);
    }

    public void start() {
        if (this.f283604z > 0 && !this.f282134i1) {
            Log.m105924i(this.f283586e, "start from onError and not local video");
            C98268m mVar = this.f282140o1;
            if (mVar != null) {
                C34078m b = C97399u.f285903a.mo136668b(mVar);
                if (b.mo59431l2()) {
                    Log.m105924i(this.f283586e, "start from onError and download finish now");
                    String str = b.field_filePath;
                    C87412m.m108593f(str, "videoCache.field_filePath");
                    mo134417l0(str);
                    return;
                }
            }
        }
        String str2 = this.f267504p0;
        C87412m.m108593f(str2, "filepath");
        mo134419n0(str2);
        super.start();
    }

    public void stop() {
        try {
            if (this.f282134i1) {
                mo134418m0();
                this.f283595q.stop();
                mo79628h0();
            } else {
                super.stop();
            }
            ImageView imageView = this.f282139n1;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        } catch (Exception e) {
            Log.printErrStackTrace(this.f283586e, e, "stop error", new Object[0]);
        }
    }

    /* renamed from: z */
    public void mo86881z(boolean z) {
        if (!this.f282134i1) {
            super.mo86881z(z);
        }
    }
}
