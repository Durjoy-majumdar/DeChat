package cp1;

import android.animation.Animator;
import android.content.Context;
import android.util.Size;
import android.view.ViewGroup;
import android.widget.ImageView;
import cj1.C54753e6;
import com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.api.TPPlayerMsg;
import er1.C58739j4;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import kg3.C76577a;
import ok1.C62042e;
import pl1.C62367r0;
import r50.C77486k;
import rx3.C13598b0;
import rx3.C13604l;
import zt3.C119157j;

/* renamed from: cp1.m */
public final class C57952m {

    /* renamed from: a */
    public final FinderLiveThumbPlayerProxy f165852a;

    /* renamed from: b */
    public C54753e6 f165853b;

    /* renamed from: c */
    public final C32227p<Integer, TPPlayerMsg.TPVideoSeiInfo, C13598b0> f165854c = new C57953a(this);

    /* renamed from: cp1.m$a */
    public static final class C57953a extends C87413o implements C32227p<Integer, TPPlayerMsg.TPVideoSeiInfo, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C57952m f165855d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57953a(C57952m mVar) {
            super(2);
            this.f165855d = mVar;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            TPPlayerMsg.TPVideoSeiInfo tPVideoSeiInfo = (TPPlayerMsg.TPVideoSeiInfo) obj2;
            C87412m.m108594g(tPVideoSeiInfo, "seiInfo");
            C57952m mVar = this.f165855d;
            byte[] bArr = tPVideoSeiInfo.seiData;
            ((C119157j) C119157j.f356862d).mo183876g(new C57951l(intValue, bArr, mVar), "Sei_Message_Handler");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cp1.m$b */
    public static final class C57954b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C57952m f165856d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f165857e;

        /* renamed from: f */
        public final /* synthetic */ Size f165858f;

        /* renamed from: g */
        public final /* synthetic */ C96814a.C96817e f165859g;

        /* renamed from: h */
        public final /* synthetic */ boolean f165860h;

        public C57954b(C57952m mVar, ViewGroup viewGroup, Size size, C96814a.C96817e eVar, boolean z) {
            this.f165856d = mVar;
            this.f165857e = viewGroup;
            this.f165858f = size;
            this.f165859g = eVar;
            this.f165860h = z;
        }

        public final void run() {
            C13598b0 b0Var;
            C57952m mVar = this.f165856d;
            ViewGroup viewGroup = this.f165857e;
            Size size = this.f165858f;
            C96814a.C96817e eVar = this.f165859g;
            mVar.getClass();
            C13604l<Integer, Integer> f = eVar == C96814a.C96817e.CONTAIN ? C58739j4.f168176a.mo83707f(ImageView.ScaleType.FIT_CENTER.ordinal(), (float) viewGroup.getWidth(), (float) viewGroup.getHeight(), (float) size.getWidth(), (float) size.getHeight()) : C58739j4.f168176a.mo83707f(ImageView.ScaleType.CENTER_CROP.ordinal(), (float) viewGroup.getWidth(), (float) viewGroup.getHeight(), (float) size.getWidth(), (float) size.getHeight());
            Integer num = null;
            if (f != null) {
                mVar.f165852a.mo78605J(((Number) f.f38555d).intValue(), ((Number) f.f38556e).intValue());
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null && viewGroup.getWidth() > 0 && viewGroup.getHeight() > 0) {
                mVar.f165852a.mo78605J(viewGroup.getWidth(), viewGroup.getHeight());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("resetViewSize:container:");
            sb.append(viewGroup.hashCode());
            sb.append(" mediaSize width = ");
            sb.append(size.getWidth());
            sb.append(", height = ");
            sb.append(size.getHeight());
            sb.append(", container width = ");
            sb.append(viewGroup.getWidth());
            sb.append(", height = ");
            sb.append(viewGroup.getHeight());
            sb.append(", params width = ");
            sb.append(f != null ? (Integer) f.f38555d : null);
            sb.append(", height = ");
            if (f != null) {
                num = (Integer) f.f38556e;
            }
            sb.append(num);
            Log.m105924i("FinderLiveReplayerWidget", sb.toString());
            this.f165856d.f165852a.setVideoViewFocused(true);
            this.f165856d.f165852a.setMute(false);
            this.f165856d.f165852a.setAlpha(1.0f);
            this.f165856d.f165852a.setVisibility(0);
            if (this.f165860h) {
                this.f165856d.f165852a.play();
            }
        }
    }

    public C57952m(Context context, long j) {
        C87412m.m108594g(context, "context");
        FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = new FinderLiveThumbPlayerProxy(context);
        this.f165852a = finderLiveThumbPlayerProxy;
        finderLiveThumbPlayerProxy.setFullScreenEnjoy(true);
        finderLiveThumbPlayerProxy.setLoop(false);
        finderLiveThumbPlayerProxy.setMute(false);
        Log.m105924i("FinderLiveReplayerWidget", "init " + hashCode() + " playerView:" + finderLiveThumbPlayerProxy.hashCode());
    }

    /* renamed from: a */
    public final void mo82755a(C62367r0 r0Var, String str, boolean z, FeedData feedData) {
        C87412m.m108594g(r0Var, "data");
        C87412m.m108594g(str, "key");
        C87412m.m108594g(feedData, "feedData");
        Log.m105924i("FinderLiveReplayerWidget", "bindMediaInfo " + hashCode() + " key:" + str + ", playerView:" + this.f165852a.hashCode() + ",newContainer:" + r0Var.f177253e.f185275p);
        this.f165852a.setDecryptionKey(str);
        this.f165852a.mo78639o(r0Var, z, feedData);
    }

    /* renamed from: b */
    public final void mo82756b(ViewGroup viewGroup, Integer num, Size size, C96814a.C96817e eVar, boolean z) {
        C87412m.m108594g(viewGroup, "newContainer");
        C87412m.m108594g(size, "mediaSize");
        C87412m.m108594g(eVar, "scaleType");
        boolean isPlaying = this.f165852a.isPlaying();
        Log.m105924i("FinderLiveReplayerWidget", "moveToNewContainer " + hashCode() + " playerView:" + this.f165852a.hashCode() + ",newContainer:" + viewGroup.hashCode() + ",isPlaying:" + isPlaying + ",index:" + num + ",scaleType:" + eVar);
        FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = this.f165852a;
        finderLiveThumbPlayerProxy.f160750E = true;
        finderLiveThumbPlayerProxy.animate().cancel();
        finderLiveThumbPlayerProxy.animate().setListener((Animator.AnimatorListener) null);
        C62042e.f176370a.mo87010H1(this.f165852a);
        if (z) {
            this.f165852a.setClipToOutline(true);
            this.f165852a.setOutlineProvider(new C77486k((float) C76577a.m92151b(MMApplicationContext.getContext(), 8)));
        } else {
            this.f165852a.setClipToOutline(false);
        }
        if (viewGroup.indexOfChild(this.f165852a) == -1) {
            if (num != null) {
                viewGroup.addView(this.f165852a, num.intValue(), new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroup.addView(this.f165852a, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        viewGroup.post(new C57954b(this, viewGroup, size, eVar, isPlaying));
    }

    /* renamed from: c */
    public final void mo82757c(ViewGroup viewGroup, Size size, C96814a.C96817e eVar, boolean z) {
        C87412m.m108594g(viewGroup, "newContainer");
        C87412m.m108594g(size, "mediaSize");
        C87412m.m108594g(eVar, "scaleType");
        mo82756b(viewGroup, 0, size, eVar, z);
    }

    /* renamed from: d */
    public final void mo82758d() {
        Log.m105924i("FinderLiveReplayerWidget", "pauseVideo " + hashCode() + " playerView:" + this.f165852a.hashCode());
        this.f165852a.pause();
    }

    /* renamed from: e */
    public final void mo82759e(Integer num) {
        Log.m105924i("FinderLiveReplayerWidget", "playVideo " + hashCode() + " playerView:" + this.f165852a.hashCode() + ",offset:" + num);
        this.f165852a.setMute(false);
        this.f165852a.setVideoViewFocused(true);
        this.f165852a.mo51221B(num);
    }

    /* renamed from: f */
    public final void mo82760f() {
        Log.m105924i("FinderLiveReplayerWidget", "release " + hashCode() + " playerView:" + this.f165852a.hashCode());
        this.f165852a.mo78608c();
        this.f165852a.mo78609d();
    }

    /* renamed from: g */
    public final void mo82761g() {
        Log.m105924i("FinderLiveReplayerWidget", "setFillScaleType " + hashCode() + " playerView:" + this.f165852a.hashCode());
        this.f165852a.setScaleType(C96814a.C96817e.COVER);
    }

    /* renamed from: h */
    public final void mo82762h() {
        Log.m105924i("FinderLiveReplayerWidget", "setFitScaleType " + hashCode() + " playerView:" + this.f165852a.hashCode());
        this.f165852a.setScaleType(C96814a.C96817e.CONTAIN);
    }

    /* renamed from: i */
    public final void mo82763i() {
        Log.m105924i("FinderLiveReplayerWidget", "stopVideo " + hashCode() + " playerView:" + this.f165852a.hashCode());
        this.f165852a.stop();
    }
}
