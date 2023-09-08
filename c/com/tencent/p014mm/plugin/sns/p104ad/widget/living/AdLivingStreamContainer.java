package com.tencent.p014mm.plugin.sns.p104ad.widget.living;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53901i0;
import a14.C53921m;
import a14.C53930o0;
import a14.C53934p0;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import br2.C54547a;
import br2.C54548c;
import br2.C54549d;
import c14.C54624g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.SnsAdLivingStreamJumpEvent;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import d14.C45253g;
import d14.C58017a1;
import d14.C58085t0;
import d14.C58100z0;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.CancellationException;
import kg3.C76577a;
import kotlin.Metadata;
import kotlin.ResultKt;
import p204mr.C11078h;
import ps2.C62494p;
import ps2.C62495q;
import rq2.C63505q;
import rx3.C13598b0;
import rx3.C13604l;
import rx3.C90107a;
import te3.C101804kv2;
import te3.C51713vn0;
import te3.C52005xq0;
import wx3.C15601d;
import wx3.C66206a;
import wx3.C66212f;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\b\u0016\u0012\b\u0010§\u0001\u001a\u00030¦\u0001¢\u0006\u0006\b¨\u0001\u0010©\u0001B!\b\u0016\u0012\b\u0010§\u0001\u001a\u00030¦\u0001\u0012\n\u0010«\u0001\u001a\u0005\u0018\u00010ª\u0001¢\u0006\u0006\b¨\u0001\u0010¬\u0001B*\b\u0016\u0012\b\u0010§\u0001\u001a\u00030¦\u0001\u0012\n\u0010«\u0001\u001a\u0005\u0018\u00010ª\u0001\u0012\u0007\u0010­\u0001\u001a\u00020|¢\u0006\u0006\b¨\u0001\u0010®\u0001J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0007\u001a\u00020\u0005H\u0007R$\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0012\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001e\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R$\u0010\"\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u00102\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u0010:\u001a\u0004\u0018\u0001038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010B\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010J\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010R\u001a\u0004\u0018\u00010K8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010Z\u001a\u0004\u0018\u00010S8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010a\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010i\u001a\u00020b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u0017\u0010o\u001a\u00020j8\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\"\u0010s\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bp\u0010\\\u001a\u0004\bq\u0010^\"\u0004\br\u0010`R\"\u0010{\u001a\u00020t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR&\u0010\u0001\u001a\u00020|8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u0010\u0001\"\u0006\b\u0001\u0010\u0001R&\u0010\u0001\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010\\\u001a\u0005\b\u0001\u0010^\"\u0005\b\u0001\u0010`R#\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020\u00050\u00018\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R&\u0010\u0001\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010\\\u001a\u0005\b\u0001\u0010^\"\u0005\b\u0001\u0010`R(\u0010\u0001\u001a\u00020|8\u0006@\u0006X\u000e¢\u0006\u0017\n\u0005\b\u0001\u0010~\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R&\u0010\u0001\u001a\u00020t8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010v\u001a\u0005\b\u0001\u0010x\"\u0005\b\u0001\u0010zR&\u0010\u0001\u001a\u00020t8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010v\u001a\u0005\b\u0001\u0010x\"\u0005\b\u0001\u0010zR&\u0010¡\u0001\u001a\u00020t8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010v\u001a\u0005\b\u0001\u0010x\"\u0005\b \u0001\u0010zR(\u0010¥\u0001\u001a\u00020|8\u0006@\u0006X\u000e¢\u0006\u0017\n\u0005\b¢\u0001\u0010~\u001a\u0006\b£\u0001\u0010\u0001\"\u0006\b¤\u0001\u0010\u0001¨\u0006¯\u0001"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ad/widget/living/AdLivingStreamContainer;", "Landroid/widget/FrameLayout;", "Landroidx/lifecycle/r;", "", "enabled", "Lrx3/b0;", "setEventListenerEnabled", "onUIPause", "e", "Landroid/widget/FrameLayout;", "getMPlayerContainer", "()Landroid/widget/FrameLayout;", "setMPlayerContainer", "(Landroid/widget/FrameLayout;)V", "mPlayerContainer", "f", "getMPlayerContainerBackground", "setMPlayerContainerBackground", "mPlayerContainerBackground", "Landroid/widget/ImageView;", "g", "Landroid/widget/ImageView;", "getMBackgroundMaskView", "()Landroid/widget/ImageView;", "setMBackgroundMaskView", "(Landroid/widget/ImageView;)V", "mBackgroundMaskView", "h", "getMThumbView", "setMThumbView", "mThumbView", "i", "getMStatusIcon", "setMStatusIcon", "mStatusIcon", "Landroid/widget/ProgressBar;", "j", "Landroid/widget/ProgressBar;", "getMLoading", "()Landroid/widget/ProgressBar;", "setMLoading", "(Landroid/widget/ProgressBar;)V", "mLoading", "La14/n0;", "n", "La14/n0;", "getScope", "()La14/n0;", "setScope", "(La14/n0;)V", "scope", "Lmr/h;", "o", "Lmr/h;", "getMPlayer", "()Lmr/h;", "setMPlayer", "(Lmr/h;)V", "mPlayer", "Lcom/tencent/mm/protocal/protobuf/FinderObject;", "p", "Lcom/tencent/mm/protocal/protobuf/FinderObject;", "getMFinderObject", "()Lcom/tencent/mm/protocal/protobuf/FinderObject;", "setMFinderObject", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;)V", "mFinderObject", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "q", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "getMSnsInfo", "()Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "setMSnsInfo", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "mSnsInfo", "Lte3/vn0;", "r", "Lte3/vn0;", "getMGetLiveInfoResp", "()Lte3/vn0;", "setMGetLiveInfoResp", "(Lte3/vn0;)V", "mGetLiveInfoResp", "Lte3/xq0;", "s", "Lte3/xq0;", "getMFinderJoinLiveResp", "()Lte3/xq0;", "setMFinderJoinLiveResp", "(Lte3/xq0;)V", "mFinderJoinLiveResp", "t", "Z", "getMNeedExitAdRoomReq", "()Z", "setMNeedExitAdRoomReq", "(Z)V", "mNeedExitAdRoomReq", "", "u", "J", "getStartEnterAdLiveRoomTime", "()J", "setStartEnterAdLiveRoomTime", "(J)V", "startEnterAdLiveRoomTime", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "w", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "getMmHandler", "()Lcom/tencent/mm/sdk/platformtools/MMHandler;", "mmHandler", "x", "getMIsEnterAdRoom", "setMIsEnterAdRoom", "mIsEnterAdRoom", "", "y", "Ljava/lang/String;", "getMAdData", "()Ljava/lang/String;", "setMAdData", "(Ljava/lang/String;)V", "mAdData", "", "z", "I", "getMSource", "()I", "setMSource", "(I)V", "mSource", "x0", "getMIsPlayCompleted", "setMIsPlayCompleted", "mIsPlayCompleted", "Lkotlin/Function0;", "K", "Lfy3/a;", "getRunnable", "()Lfy3/a;", "runnable", "L", "getMIsAttached", "setMIsAttached", "mIsAttached", "M", "getMPlayerStatus", "setMPlayerStatus", "mPlayerStatus", "S", "getMSnsId", "setMSnsId", "mSnsId", "T", "getMUxInfo", "setMUxInfo", "mUxInfo", "U", "getMAdExtInfo", "setMAdExtInfo", "mAdExtInfo", "V", "getMScene", "setMScene", "mScene", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer */
public final class AdLivingStreamContainer extends FrameLayout implements C0124r {

    /* renamed from: p0 */
    public static final /* synthetic */ int f164243p0 = 0;

    /* renamed from: A */
    public long f164244A;

    /* renamed from: B */
    public long f164245B;

    /* renamed from: C */
    public long f164246C;

    /* renamed from: D */
    public boolean f164247D;

    /* renamed from: E */
    public boolean f164248E;

    /* renamed from: F */
    public final C58085t0<Boolean> f164249F;

    /* renamed from: G */
    public final C58085t0<Boolean> f164250G;

    /* renamed from: H */
    public C54549d f164251H;

    /* renamed from: I */
    public C54548c f164252I;

    /* renamed from: J */
    public boolean f164253J;

    /* renamed from: K */
    public final C32224a<C13598b0> f164254K;

    /* renamed from: L */
    public boolean f164255L;

    /* renamed from: M */
    public int f164256M;

    /* renamed from: N */
    public final C32224a<C13598b0> f164257N;

    /* renamed from: P */
    public final C32224a<C13598b0> f164258P;

    /* renamed from: Q */
    public final C32227p<Integer, Integer, C13598b0> f164259Q;

    /* renamed from: R */
    public final C53901i0 f164260R;

    /* renamed from: S */
    public String f164261S;

    /* renamed from: T */
    public String f164262T;

    /* renamed from: U */
    public String f164263U;

    /* renamed from: V */
    public int f164264V;

    /* renamed from: W */
    public final IListener<SnsAdLivingStreamJumpEvent> f164265W;

    /* renamed from: d */
    public final String f164266d;

    /* renamed from: e */
    public FrameLayout f164267e;

    /* renamed from: f */
    public FrameLayout f164268f;

    /* renamed from: g */
    public ImageView f164269g;

    /* renamed from: h */
    public ImageView f164270h;

    /* renamed from: i */
    public ImageView f164271i;

    /* renamed from: j */
    public ProgressBar f164272j;

    /* renamed from: n */
    public C0000n0 f164273n;

    /* renamed from: o */
    public C11078h f164274o;

    /* renamed from: p */
    public FinderObject f164275p;

    /* renamed from: q */
    public SnsInfo f164276q;

    /* renamed from: r */
    public C51713vn0 f164277r;

    /* renamed from: s */
    public C52005xq0 f164278s;

    /* renamed from: t */
    public boolean f164279t;

    /* renamed from: u */
    public long f164280u;

    /* renamed from: v */
    public long f164281v;

    /* renamed from: w */
    public final MMHandler f164282w;

    /* renamed from: x */
    public boolean f164283x;

    /* renamed from: x0 */
    public boolean f164284x0;

    /* renamed from: y */
    public String f164285y;

    /* renamed from: z */
    public int f164286z;

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$a */
    public static final class C57336a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ AdLivingStreamContainer f164287d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57336a(AdLivingStreamContainer adLivingStreamContainer) {
            super(0);
            this.f164287d = adLivingStreamContainer;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$onFirstFrameRendStartCallback$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$onFirstFrameRendStartCallback$1");
            try {
                AdLivingStreamContainer adLivingStreamContainer = this.f164287d;
                int i = AdLivingStreamContainer.f164243p0;
                SnsMethodCalculate.markStartTimeMs("access$getOnFirstFrameRendStartFlow$p", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
                C58085t0<Boolean> t0Var = adLivingStreamContainer.f164249F;
                SnsMethodCalculate.markEndTimeMs("access$getOnFirstFrameRendStartFlow$p", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
                ((C58100z0) t0Var).mo82832d(Boolean.TRUE);
                Log.m105924i(AdLivingStreamContainer.m66069a(this.f164287d), "onFirstFrameRendStartCallback");
            } catch (Throwable th) {
                String a = AdLivingStreamContainer.m66069a(this.f164287d);
                Log.m105920e(a, "onFirstFrameRendStartCallback, exp is" + th);
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$onFirstFrameRendStartCallback$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$onFirstFrameRendStartCallback$1");
            return b0Var;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$b */
    public static final class C57337b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ AdLivingStreamContainer f164288d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57337b(AdLivingStreamContainer adLivingStreamContainer) {
            super(0);
            this.f164288d = adLivingStreamContainer;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$onLiveFinishCallback$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$onLiveFinishCallback$1");
            try {
                this.f164288d.setMIsPlayCompleted(true);
                this.f164288d.getMmHandler().removeCallbacksAndMessages((Object) null);
                AdLivingStreamContainer adLivingStreamContainer = this.f164288d;
                int i = AdLivingStreamContainer.f164243p0;
                SnsMethodCalculate.markStartTimeMs("access$getMIsPlayerPaused$p", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
                boolean z = adLivingStreamContainer.f164247D;
                SnsMethodCalculate.markEndTimeMs("access$getMIsPlayerPaused$p", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
                if (!z) {
                    this.f164288d.mo80864b();
                }
                FrameLayout mPlayerContainerBackground = this.f164288d.getMPlayerContainerBackground();
                if (mPlayerContainerBackground != null) {
                    mPlayerContainerBackground.setVisibility(8);
                }
                ImageView mStatusIcon = this.f164288d.getMStatusIcon();
                if (mStatusIcon != null) {
                    mStatusIcon.setVisibility(0);
                }
                FrameLayout mPlayerContainer = this.f164288d.getMPlayerContainer();
                if (mPlayerContainer != null) {
                    mPlayerContainer.setVisibility(8);
                }
                ProgressBar mLoading = this.f164288d.getMLoading();
                if (mLoading != null) {
                    mLoading.setVisibility(8);
                }
            } catch (Throwable th) {
                String a = AdLivingStreamContainer.m66069a(this.f164288d);
                Log.m105920e(a, "onLiveFinishCallback, exp is" + th);
            }
            Log.m105924i(AdLivingStreamContainer.m66069a(this.f164288d), "onLiveFinishCallback");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$onLiveFinishCallback$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$onLiveFinishCallback$1");
            return b0Var;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$c */
    public static final class C57338c extends C87413o implements C32227p<Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ AdLivingStreamContainer f164289d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57338c(AdLivingStreamContainer adLivingStreamContainer) {
            super(2);
            this.f164289d = adLivingStreamContainer;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$onSizeChangeCallback$1");
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$onSizeChangeCallback$1");
            try {
                int i = this.f164289d.getLayoutParams().width;
                int i2 = this.f164289d.getLayoutParams().height;
                FrameLayout mPlayerContainer = this.f164289d.getMPlayerContainer();
                ViewGroup.LayoutParams layoutParams = mPlayerContainer != null ? mPlayerContainer.getLayoutParams() : null;
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                if (intValue > intValue2) {
                    int i3 = (i * intValue2) / intValue;
                    int i4 = (i2 - i3) / 2;
                    layoutParams2.width = i;
                    layoutParams2.height = i3;
                    layoutParams2.topMargin = i4;
                    layoutParams2.bottomMargin = i4;
                } else {
                    int i5 = (i2 * intValue) / intValue2;
                    int i6 = (i - i5) / 2;
                    layoutParams2.width = i5;
                    layoutParams2.height = i2;
                    layoutParams2.leftMargin = i6;
                    layoutParams2.rightMargin = i6;
                }
                FrameLayout mPlayerContainer2 = this.f164289d.getMPlayerContainer();
                if (mPlayerContainer2 != null) {
                    mPlayerContainer2.setLayoutParams(layoutParams2);
                }
                AdLivingStreamContainer adLivingStreamContainer = this.f164289d;
                SnsMethodCalculate.markStartTimeMs("access$getOnSizeChangedFlow$p", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
                C58085t0<Boolean> t0Var = adLivingStreamContainer.f164250G;
                SnsMethodCalculate.markEndTimeMs("access$getOnSizeChangedFlow$p", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
                ((C58100z0) t0Var).mo82832d(Boolean.TRUE);
                String a = AdLivingStreamContainer.m66069a(this.f164289d);
                Log.m105924i(a, "onSizeChangeCallback, container width is " + i + ", container height is " + i2 + ", size width is " + intValue + ", size height is " + intValue2);
            } catch (Throwable th) {
                String a2 = AdLivingStreamContainer.m66069a(this.f164289d);
                Log.m105920e(a2, "onSizeChangeCallback, exp is" + th);
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$onSizeChangeCallback$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$onSizeChangeCallback$1");
            return b0Var;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$d */
    public static final class C57339d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ AdLivingStreamContainer f164290d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57339d(AdLivingStreamContainer adLivingStreamContainer) {
            super(0);
            this.f164290d = adLivingStreamContainer;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$runnable$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$runnable$1");
            this.f164290d.mo80867e();
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$runnable$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$runnable$1");
            return b0Var;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$e */
    public static final class C57340e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f164291d;

        public C57340e(C32224a aVar) {
            this.f164291d = aVar;
        }

        public final /* synthetic */ void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$sam$java_lang_Runnable$0");
            this.f164291d.invoke();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$sam$java_lang_Runnable$0");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1", mo125469f = "AdLivingStreamContainer.kt", mo125470l = {263, 299}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$f */
    public static final class C57341f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f164292d;

        /* renamed from: e */
        public Object f164293e;

        /* renamed from: f */
        public Object f164294f;

        /* renamed from: g */
        public int f164295g;

        /* renamed from: h */
        public final /* synthetic */ AdLivingStreamContainer f164296h;

        /* renamed from: i */
        public final /* synthetic */ C101804kv2 f164297i;

        /* renamed from: j */
        public final /* synthetic */ Integer f164298j;

        /* renamed from: n */
        public final /* synthetic */ Integer f164299n;

        @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1$2", mo125469f = "AdLivingStreamContainer.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$f$b */
        public static final class C30400b extends C91594j implements C32228q<Boolean, Boolean, C15601d<? super C13604l<? extends Boolean, ? extends Boolean>>, Object> {

            /* renamed from: d */
            public /* synthetic */ Object f81998d;

            /* renamed from: e */
            public /* synthetic */ Object f81999e;

            public C30400b(C15601d<? super C30400b> dVar) {
                super(3, dVar);
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1$2");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1$2");
                C30400b bVar = new C30400b((C15601d) obj3);
                bVar.f81998d = (Boolean) obj;
                bVar.f81999e = (Boolean) obj2;
                Object invokeSuspend = bVar.invokeSuspend(C13598b0.f38549a);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1$2");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1$2");
                return invokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1$2");
                ResultKt.throwOnFailure(obj);
                C13604l lVar = new C13604l((Boolean) this.f81998d, (Boolean) this.f81999e);
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1$2");
                return lVar;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1$1", mo125469f = "AdLivingStreamContainer.kt", mo125470l = {269}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$f$a */
        public static final class C57342a extends C91594j implements C32227p<C0000n0, C15601d<? super Bitmap>, Object> {

            /* renamed from: d */
            public Object f164300d;

            /* renamed from: e */
            public int f164301e;

            /* renamed from: f */
            public final /* synthetic */ C101804kv2 f164302f;

            /* renamed from: g */
            public final /* synthetic */ Integer f164303g;

            /* renamed from: h */
            public final /* synthetic */ Integer f164304h;

            /* renamed from: i */
            public final /* synthetic */ AdLivingStreamContainer f164305i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57342a(C101804kv2 kv22, Integer num, Integer num2, AdLivingStreamContainer adLivingStreamContainer, C15601d<? super C57342a> dVar) {
                super(2, dVar);
                this.f164302f = kv22;
                this.f164303g = num;
                this.f164304h = num2;
                this.f164305i = adLivingStreamContainer;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1$1");
                C57342a aVar = new C57342a(this.f164302f, this.f164303g, this.f164304h, this.f164305i, dVar);
                SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1$1");
                return aVar;
            }

            public Object invoke(Object obj, Object obj2) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1$1");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1$1");
                Object invokeSuspend = ((C57342a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1$1");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1$1");
                return invokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                MMBitmapFactory.Options options;
                Integer num;
                Integer num2;
                SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1$1");
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f164301e;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MMBitmapFactory.Options options2 = new MMBitmapFactory.Options();
                    options2.inJustDecodeBounds = false;
                    options2.inSampleSize = 2;
                    String str = this.f164302f.f298694i;
                    C87412m.m108593f(str, "mediaObj.Thumb");
                    this.f164300d = options2;
                    this.f164301e = 1;
                    SnsMethodCalculate.markStartTimeMs("downloadImgWithPath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2");
                    C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                    mVar.mo74609p();
                    C62495q.f177534a.mo87528a(str, new C62494p(mVar));
                    Object o = mVar.mo74608o();
                    SnsMethodCalculate.markEndTimeMs("downloadImgWithPath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2");
                    if (o == aVar) {
                        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1$1");
                        return aVar;
                    }
                    options = options2;
                    obj = o;
                } else if (i == 1) {
                    options = (MMBitmapFactory.Options) this.f164300d;
                    ResultKt.throwOnFailure(obj);
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1$1");
                    throw illegalStateException;
                }
                Bitmap d = MMBitmapFactory.m98735d((String) obj, options);
                if (d == null || d.getHeight() <= 0 || (num = this.f164303g) == null || num.intValue() <= 0 || (num2 = this.f164304h) == null || num2.intValue() <= 0) {
                    Log.m105920e(AdLivingStreamContainer.m66069a(this.f164305i), "download error or height is <= 0, return null");
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1$1");
                    return null;
                }
                float intValue = ((float) this.f164303g.intValue()) / ((float) this.f164304h.intValue());
                Bitmap createBitmap = ((float) ((((double) d.getWidth()) + 0.0d) / ((double) d.getHeight()))) > intValue ? Bitmap.createBitmap(d, (int) ((((float) d.getWidth()) - (((float) d.getHeight()) * intValue)) / ((float) 2)), 0, (int) (((float) d.getHeight()) * intValue), d.getHeight()) : Bitmap.createBitmap(d, 0, (int) ((((float) d.getHeight()) - (((float) d.getWidth()) / intValue)) / ((float) 2)), d.getWidth(), (int) (((float) d.getWidth()) / intValue));
                Log.m105924i(AdLivingStreamContainer.m66069a(this.f164305i), "return fastblur bitmap");
                Bitmap fastblur = BitmapUtil.fastblur(createBitmap, 54);
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1$1");
                return fastblur;
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$f$c */
        public static final class C57343c<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ AdLivingStreamContainer f164306d;

            /* renamed from: e */
            public final /* synthetic */ C8479f0<Bitmap> f164307e;

            public C57343c(AdLivingStreamContainer adLivingStreamContainer, C8479f0<Bitmap> f0Var) {
                this.f164306d = adLivingStreamContainer;
                this.f164307e = f0Var;
            }

            public Object emit(Object obj, C15601d dVar) {
                ImageView mBackgroundMaskView;
                SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1$3");
                C13604l lVar = (C13604l) obj;
                SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1$3");
                String a = AdLivingStreamContainer.m66069a(this.f164306d);
                Log.m105924i(a, "after double flow, flowResult is " + lVar.f38555d + " and " + lVar.f38556e);
                A a2 = lVar.f38555d;
                Boolean bool = Boolean.TRUE;
                if (C87412m.m108589b(a2, bool) && C87412m.m108589b(lVar.f38556e, bool)) {
                    ProgressBar mLoading = this.f164306d.getMLoading();
                    if (mLoading != null) {
                        mLoading.setVisibility(8);
                    }
                    FrameLayout mPlayerContainer = this.f164306d.getMPlayerContainer();
                    if (mPlayerContainer != null) {
                        mPlayerContainer.setVisibility(0);
                    }
                    FrameLayout mPlayerContainerBackground = this.f164306d.getMPlayerContainerBackground();
                    if (mPlayerContainerBackground != null) {
                        mPlayerContainerBackground.setVisibility(0);
                    }
                    if (!(this.f164307e.f27484d == null || (mBackgroundMaskView = this.f164306d.getMBackgroundMaskView()) == null)) {
                        mBackgroundMaskView.setImageBitmap((Bitmap) this.f164307e.f27484d);
                    }
                }
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1$3");
                SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1$3");
                return b0Var;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57341f(AdLivingStreamContainer adLivingStreamContainer, C101804kv2 kv22, Integer num, Integer num2, C15601d<? super C57341f> dVar) {
            super(2, dVar);
            this.f164296h = adLivingStreamContainer;
            this.f164297i = kv22;
            this.f164298j = num;
            this.f164299n = num2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1");
            C57341f fVar = new C57341f(this.f164296h, this.f164297i, this.f164298j, this.f164299n, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1");
            return fVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1");
            Object invokeSuspend = ((C57341f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1");
            return invokeSuspend;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x00a6  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x010e  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0112  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                java.lang.String r2 = "invokeSuspend"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBlurBkg$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
                int r4 = r0.f164295g
                java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper"
                java.lang.String r6 = "access$getBitmapCache$cp"
                java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper$Companion"
                java.lang.String r8 = "getBitmapCache"
                r9 = 2
                r10 = 1
                if (r4 == 0) goto L_0x0041
                if (r4 == r10) goto L_0x002d
                if (r4 != r9) goto L_0x0022
                kotlin.ResultKt.throwOnFailure(r21)
                goto L_0x0116
            L_0x0022:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r4)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                throw r1
            L_0x002d:
                java.lang.Object r4 = r0.f164294f
                gy3.f0 r4 = (gy3.C8479f0) r4
                java.lang.Object r11 = r0.f164293e
                gy3.f0 r11 = (gy3.C8479f0) r11
                java.lang.Object r12 = r0.f164292d
                java.lang.String r12 = (java.lang.String) r12
                kotlin.ResultKt.throwOnFailure(r21)
                r19 = r5
                r5 = r21
                goto L_0x009c
            L_0x0041:
                kotlin.ResultKt.throwOnFailure(r21)
                com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer r4 = r0.f164296h
                com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r4.getMSnsInfo()
                java.lang.String r12 = vr2.C102236a0.m134728W(r4)
                gy3.f0 r4 = new gy3.f0
                r4.<init>()
                br2.e$a r11 = br2.C54550e.f152917e
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r7)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r5)
                com.tencent.mm.sdk.platformtools.LruCache<java.lang.String, android.graphics.Bitmap> r11 = br2.C54550e.f152918f
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r7)
                java.lang.Object r11 = r11.get(r12)
                r4.f27484d = r11
                if (r11 != 0) goto L_0x00a0
                a14.h0 r11 = a14.C53872d1.f151119c
                com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$f$a r15 = new com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$f$a
                te3.kv2 r14 = r0.f164297i
                java.lang.Integer r13 = r0.f164298j
                java.lang.Integer r9 = r0.f164299n
                com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer r10 = r0.f164296h
                r18 = 0
                r16 = r13
                r13 = r15
                r19 = r5
                r5 = r15
                r15 = r16
                r16 = r9
                r17 = r10
                r13.<init>(r14, r15, r16, r17, r18)
                r0.f164292d = r12
                r0.f164293e = r4
                r0.f164294f = r4
                r9 = 1
                r0.f164295g = r9
                java.lang.Object r5 = a14.C53895h.m60469g(r11, r5, r0)
                if (r5 != r1) goto L_0x009b
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                return r1
            L_0x009b:
                r11 = r4
            L_0x009c:
                r4.f27484d = r5
                r4 = r11
                goto L_0x00a2
            L_0x00a0:
                r19 = r5
            L_0x00a2:
                T r5 = r4.f27484d
                if (r5 == 0) goto L_0x00bd
                br2.e$a r5 = br2.C54550e.f152917e
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r7)
                r5 = r19
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r5)
                com.tencent.mm.sdk.platformtools.LruCache<java.lang.String, android.graphics.Bitmap> r9 = br2.C54550e.f152918f
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r7)
                T r5 = r4.f27484d
                r9.put(r12, r5)
            L_0x00bd:
                com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer r5 = r0.f164296h
                java.lang.String r5 = com.tencent.p014mm.plugin.sns.p104ad.widget.living.AdLivingStreamContainer.m66069a(r5)
                java.lang.String r6 = "before double flow"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
                com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer r5 = r0.f164296h
                java.lang.String r6 = "access$getOnFirstFrameRendStartFlow$p"
                java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
                d14.t0<java.lang.Boolean> r5 = r5.f164249F
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
                com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer r6 = r0.f164296h
                java.lang.String r8 = "access$getOnSizeChangedFlow$p"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r7)
                d14.t0<java.lang.Boolean> r6 = r6.f164250G
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r7)
                com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$f$b r7 = new com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$f$b
                r8 = 0
                r7.<init>(r8)
                com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$f$c r9 = new com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$f$c
                com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer r10 = r0.f164296h
                r9.<init>(r10, r4)
                r0.f164292d = r8
                r0.f164293e = r8
                r0.f164294f = r8
                r4 = 2
                r0.f164295g = r4
                d14.f[] r4 = new d14.C45252f[r4]
                r10 = 0
                r4[r10] = r5
                r5 = 1
                r4[r5] = r6
                d14.s0 r5 = d14.C45256s0.f122599d
                d14.r0 r6 = new d14.r0
                r6.<init>(r7, r8)
                java.lang.Object r4 = e14.C58499p.m67934a(r9, r4, r5, r6, r0)
                if (r4 != r1) goto L_0x010e
                goto L_0x0110
            L_0x010e:
                rx3.b0 r4 = rx3.C13598b0.f38549a
            L_0x0110:
                if (r4 != r1) goto L_0x0116
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                return r1
            L_0x0116:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.widget.living.AdLivingStreamContainer.C57341f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$g */
    public static final class C57344g extends C66206a implements C53901i0 {

        /* renamed from: d */
        public final /* synthetic */ AdLivingStreamContainer f164308d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57344g(C53901i0.C39480a aVar, AdLivingStreamContainer adLivingStreamContainer) {
            super(aVar);
            this.f164308d = adLivingStreamContainer;
        }

        public void handleException(C66212f fVar, Throwable th) {
            SnsMethodCalculate.markStartTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$special$$inlined$CoroutineExceptionHandler$1");
            String a = AdLivingStreamContainer.m66069a(this.f164308d);
            Log.m105920e(a, "error = " + C90107a.m112736b(th));
            if (BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
                SnsMethodCalculate.markEndTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$special$$inlined$CoroutineExceptionHandler$1");
                throw th;
            }
            AdLivingStreamContainer adLivingStreamContainer = this.f164308d;
            SnsMethodCalculate.markStartTimeMs("access$setMHasError$p", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
            adLivingStreamContainer.f164253J = true;
            SnsMethodCalculate.markEndTimeMs("access$setMHasError$p", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
            FrameLayout mPlayerContainer = this.f164308d.getMPlayerContainer();
            if (mPlayerContainer != null) {
                mPlayerContainer.setVisibility(0);
            }
            SnsMethodCalculate.markEndTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$special$$inlined$CoroutineExceptionHandler$1");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AdLivingStreamContainer(Context context) {
        this(context, (AttributeSet) null);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public static final /* synthetic */ String m66069a(AdLivingStreamContainer adLivingStreamContainer) {
        SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        String str = adLivingStreamContainer.f164266d;
        SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        return str;
    }

    /* renamed from: b */
    public final void mo80864b() {
        SnsMethodCalculate.markStartTimeMs("calcEnterAdLiveRoomParams", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        Log.m105924i(this.f164266d, "calcEnterAdLiveRoomParams, startEnterAdLiveRoomTime is " + this.f164280u + ", enterAdLiveRoomTimeInterval is " + this.f164281v + ", update enterAdLiveRoomTimeInterval is " + (System.currentTimeMillis() - this.f164280u));
        if (this.f164280u > 0) {
            this.f164281v += System.currentTimeMillis() - this.f164280u;
            this.f164280u = 0;
        }
        SnsMethodCalculate.markEndTimeMs("calcEnterAdLiveRoomParams", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    /* renamed from: c */
    public final void mo80865c() {
        SnsMethodCalculate.markStartTimeMs("doAdChannelReport", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        boolean z = this.f164248E;
        String str = this.f164266d;
        Log.m105924i(str, "doAdChannelReport, snsId is " + this.f164261S + ", uxInfo is " + this.f164262T + ", adExtInfo is " + this.f164263U + ", scene is " + this.f164264V + ", mTotalPlayTime is " + this.f164244A + ", joinLiveFlag is " + (z ? 1 : 0) + ", mJoinLiveStartTimestamp is " + this.f164245B + ", mJoinLiveEndTimestamp is " + this.f164246C);
        C54547a aVar = new C54547a();
        String str2 = this.f164261S;
        String str3 = this.f164262T;
        String str4 = this.f164263U;
        int i = this.f164264V;
        Long valueOf = Long.valueOf(this.f164244A);
        Integer valueOf2 = Integer.valueOf(z);
        Long valueOf3 = Long.valueOf(this.f164245B);
        Long valueOf4 = Long.valueOf(this.f164246C);
        SnsMethodCalculate.markStartTimeMs("setData", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderLiveStreamData");
        aVar.f152907a = str2;
        aVar.f152908b = str3;
        aVar.f152909c = str4;
        aVar.f152910d = i;
        aVar.f152911e = valueOf;
        aVar.f152912f = valueOf2;
        aVar.f152913g = valueOf3;
        aVar.f152914h = valueOf4;
        SnsMethodCalculate.markEndTimeMs("setData", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderLiveStreamData");
        C63505q.m74843b(aVar);
        SnsMethodCalculate.markEndTimeMs("doAdChannelReport", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        r4 = r4.f143588w;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80866d() {
        /*
            r10 = this;
            java.lang.String r0 = "doEnterAdLiveRoom"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            long r2 = r10.f164280u
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0015
            long r2 = java.lang.System.currentTimeMillis()
            r10.f164280u = r2
        L_0x0015:
            java.lang.String r2 = r10.f164266d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "doEnterAdLiveRoom, enable is "
            r3.append(r4)
            te3.vn0 r4 = r10.f164277r
            r5 = 0
            if (r4 == 0) goto L_0x0031
            te3.op2 r4 = r4.f143588w
            if (r4 == 0) goto L_0x0031
            boolean r4 = r4.f139308d
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L_0x0032
        L_0x0031:
            r4 = r5
        L_0x0032:
            r3.append(r4)
            java.lang.String r4 = ", mIsEnterAdRoom is "
            r3.append(r4)
            boolean r4 = r10.f164283x
            r3.append(r4)
            java.lang.String r4 = ", startEnterAdLiveRoomTime is "
            r3.append(r4)
            long r6 = r10.f164280u
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            te3.vn0 r2 = r10.f164277r
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x005f
            te3.op2 r6 = r2.f143588w
            if (r6 == 0) goto L_0x005f
            boolean r6 = r6.f139308d
            if (r6 != r3) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r3 = 0
        L_0x0060:
            if (r3 == 0) goto L_0x00c0
            boolean r3 = r10.f164283x
            if (r3 == 0) goto L_0x006a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x006a:
            if (r2 == 0) goto L_0x0072
            te3.op2 r2 = r2.f143588w
            if (r2 == 0) goto L_0x0072
            int r4 = r2.f139309e
        L_0x0072:
            int r4 = r4 * 1000
            java.lang.String r2 = r10.f164266d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "doEnterAdLiveRoom, timeInterval is "
            r3.append(r6)
            r3.append(r4)
            java.lang.String r6 = ", enterAdLiveRoomTimeInterval is "
            r3.append(r6)
            long r6 = r10.f164281v
            r3.append(r6)
            java.lang.String r6 = ", remainTime is "
            r3.append(r6)
            long r6 = (long) r4
            long r8 = r10.f164281v
            long r8 = r6 - r8
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            long r2 = r10.f164281v
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x00ae
            r10.mo80867e()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x00ae:
            long r6 = r6 - r2
            com.tencent.mm.sdk.platformtools.MMHandler r2 = r10.f164282w
            r2.removeCallbacksAndMessages(r5)
            com.tencent.mm.sdk.platformtools.MMHandler r2 = r10.f164282w
            fy3.a<rx3.b0> r3 = r10.f164254K
            com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$e r4 = new com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$e
            r4.<init>(r3)
            r2.postDelayed(r4, r6)
        L_0x00c0:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.widget.living.AdLivingStreamContainer.mo80866d():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0059 A[SYNTHETIC, Splitter:B:31:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007d A[Catch:{ all -> 0x017d }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00cd A[Catch:{ all -> 0x017d }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00cf A[Catch:{ all -> 0x017d }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d2 A[Catch:{ all -> 0x017d }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80867e() {
        /*
            r35 = this;
            r1 = r35
            java.lang.String r2 = "enterAdLiveRoom"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            te3.vn0 r0 = r1.f164277r     // Catch:{ all -> 0x017d }
            r4 = 0
            if (r0 == 0) goto L_0x0015
            long r5 = r0.f143589x     // Catch:{ all -> 0x017d }
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x017d }
            goto L_0x0016
        L_0x0015:
            r0 = r4
        L_0x0016:
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r1.f164276q     // Catch:{ all -> 0x017d }
            if (r5 == 0) goto L_0x002f
            com.tencent.mm.plugin.sns.storage.ADXml r5 = r5.getAdXml()     // Catch:{ all -> 0x017d }
            if (r5 == 0) goto L_0x002f
            co2.j r5 = r5.adFinderLiveStreamInfo     // Catch:{ all -> 0x017d }
            if (r5 == 0) goto L_0x002f
            co2.j$a r5 = r5.mo76116a()     // Catch:{ all -> 0x017d }
            if (r5 == 0) goto L_0x002f
            java.lang.Long r5 = r5.mo76117a()     // Catch:{ all -> 0x017d }
            goto L_0x0030
        L_0x002f:
            r5 = r4
        L_0x0030:
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r1.f164276q     // Catch:{ all -> 0x017d }
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo"
            if (r6 == 0) goto L_0x0052
            com.tencent.mm.plugin.sns.storage.ADXml r6 = r6.getAdXml()     // Catch:{ all -> 0x017d }
            if (r6 == 0) goto L_0x0052
            co2.j r6 = r6.adFinderLiveStreamInfo     // Catch:{ all -> 0x017d }
            if (r6 == 0) goto L_0x0052
            co2.j$a r6 = r6.mo76116a()     // Catch:{ all -> 0x017d }
            if (r6 == 0) goto L_0x0052
            java.lang.String r8 = "getFinderLiveFeedNonceId"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r7)     // Catch:{ all -> 0x017d }
            java.lang.String r6 = r6.f154587c     // Catch:{ all -> 0x017d }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r7)     // Catch:{ all -> 0x017d }
            r13 = r6
            goto L_0x0053
        L_0x0052:
            r13 = r4
        L_0x0053:
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r1.f164276q     // Catch:{ all -> 0x017d }
            java.lang.String r8 = ""
            if (r6 == 0) goto L_0x0078
            com.tencent.mm.plugin.sns.storage.ADXml r6 = r6.getAdXml()     // Catch:{ all -> 0x017d }
            if (r6 == 0) goto L_0x0078
            co2.j r6 = r6.adFinderLiveStreamInfo     // Catch:{ all -> 0x017d }
            if (r6 == 0) goto L_0x0078
            co2.j$a r6 = r6.mo76116a()     // Catch:{ all -> 0x017d }
            if (r6 == 0) goto L_0x0078
            java.lang.String r9 = "getFinderUsername"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r7)     // Catch:{ all -> 0x017d }
            java.lang.String r6 = r6.f154588d     // Catch:{ all -> 0x017d }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r7)     // Catch:{ all -> 0x017d }
            if (r6 != 0) goto L_0x0076
            goto L_0x0078
        L_0x0076:
            r15 = r6
            goto L_0x0079
        L_0x0078:
            r15 = r8
        L_0x0079:
            te3.vn0 r6 = r1.f164277r     // Catch:{ all -> 0x017d }
            if (r6 == 0) goto L_0x0084
            java.lang.String r6 = r6.f143591z     // Catch:{ all -> 0x017d }
            if (r6 != 0) goto L_0x0082
            goto L_0x0084
        L_0x0082:
            r14 = r6
            goto L_0x0085
        L_0x0084:
            r14 = r8
        L_0x0085:
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r1.f164276q     // Catch:{ all -> 0x017d }
            if (r6 == 0) goto L_0x0093
            int r7 = r1.f164286z     // Catch:{ all -> 0x017d }
            com.tencent.mm.plugin.sns.storage.ADInfo r6 = r6.getAdInfo(r7)     // Catch:{ all -> 0x017d }
            if (r6 == 0) goto L_0x0093
            java.lang.String r4 = r6.uxInfo     // Catch:{ all -> 0x017d }
        L_0x0093:
            java.lang.String r6 = r1.f164266d     // Catch:{ all -> 0x017d }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x017d }
            r7.<init>()     // Catch:{ all -> 0x017d }
            java.lang.String r8 = "enterAdLiveRoom, liveId is "
            r7.append(r8)     // Catch:{ all -> 0x017d }
            r7.append(r5)     // Catch:{ all -> 0x017d }
            java.lang.String r8 = ", objectId is "
            r7.append(r8)     // Catch:{ all -> 0x017d }
            r7.append(r0)     // Catch:{ all -> 0x017d }
            java.lang.String r8 = ", nonceId is "
            r7.append(r8)     // Catch:{ all -> 0x017d }
            r7.append(r13)     // Catch:{ all -> 0x017d }
            java.lang.String r8 = ", finderUsername is "
            r7.append(r8)     // Catch:{ all -> 0x017d }
            r7.append(r15)     // Catch:{ all -> 0x017d }
            java.lang.String r8 = ", sessionBuffer is "
            r7.append(r8)     // Catch:{ all -> 0x017d }
            r7.append(r14)     // Catch:{ all -> 0x017d }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x017d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)     // Catch:{ all -> 0x017d }
            r6 = 0
            r7 = 1
            if (r5 != 0) goto L_0x00cf
            r8 = 1
            goto L_0x00d0
        L_0x00cf:
            r8 = 0
        L_0x00d0:
            if (r8 != 0) goto L_0x0179
            if (r0 != 0) goto L_0x00d5
            r6 = 1
        L_0x00d5:
            if (r6 == 0) goto L_0x00d9
            goto L_0x0179
        L_0x00d9:
            r1.f164279t = r7     // Catch:{ all -> 0x017d }
            r1.f164248E = r7     // Catch:{ all -> 0x017d }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x017d }
            r6 = 1000(0x3e8, float:1.401E-42)
            long r10 = (long) r6     // Catch:{ all -> 0x017d }
            long r8 = r8 / r10
            r1.f164245B = r8     // Catch:{ all -> 0x017d }
            r1.f164283x = r7     // Catch:{ all -> 0x017d }
            java.lang.String r6 = r1.f164266d     // Catch:{ all -> 0x017d }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x017d }
            r7.<init>()     // Catch:{ all -> 0x017d }
            java.lang.String r8 = "do joinLiveRequest, mJoinLiveStartTimestamp is "
            r7.append(r8)     // Catch:{ all -> 0x017d }
            long r8 = r1.f164245B     // Catch:{ all -> 0x017d }
            r7.append(r8)     // Catch:{ all -> 0x017d }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x017d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)     // Catch:{ all -> 0x017d }
            br2.d r6 = new br2.d     // Catch:{ all -> 0x017d }
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x017d }
            r7.<init>(r1)     // Catch:{ all -> 0x017d }
            r6.<init>(r7)     // Catch:{ all -> 0x017d }
            r1.f164251H = r6     // Catch:{ all -> 0x017d }
            java.lang.Class<ir.n> r6 = p565ir.C60606n.class
            di3.d r6 = di3.C86312j.m106911c(r6)     // Catch:{ all -> 0x017d }
            ir.n r6 = (p565ir.C60606n) r6     // Catch:{ all -> 0x017d }
            pe3.b r29 = pe3.C89349b.m111675b(r4)     // Catch:{ all -> 0x017d }
            br2.d r4 = r1.f164251H     // Catch:{ all -> 0x017d }
            java.lang.String r7 = "getService(IFinderLiveFeatureService::class.java)"
            gy3.C87412m.m108593f(r6, r7)     // Catch:{ all -> 0x017d }
            long r7 = r5.longValue()     // Catch:{ all -> 0x017d }
            long r10 = r0.longValue()     // Catch:{ all -> 0x017d }
            java.lang.String r31 = "37"
            r9 = 0
            r12 = 2
            java.lang.String r28 = ""
            r16 = 11
            r17 = 0
            r18 = 4
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r30 = 37
            r33 = r14
            r34 = r15
            r15 = r28
            r32 = r4
            r6.mo85007Gk(r7, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r28, r29, r30, r31, r32)     // Catch:{ all -> 0x017d }
            java.lang.Class<mr.m> r4 = p204mr.C61568m.class
            di3.d r4 = di3.C86312j.m106911c(r4)     // Catch:{ all -> 0x017d }
            java.lang.String r6 = "getService(IHellLiveVisitorReoprter::class.java)"
            gy3.C87412m.m108593f(r4, r6)     // Catch:{ all -> 0x017d }
            mr.m r4 = (p204mr.C61568m) r4     // Catch:{ all -> 0x017d }
            long r5 = r5.longValue()     // Catch:{ all -> 0x017d }
            long r7 = r0.longValue()     // Catch:{ all -> 0x017d }
            java.lang.String r11 = "37"
            java.lang.String r0 = r1.f164285y     // Catch:{ all -> 0x017d }
            java.lang.String r12 = ""
            r14 = 997(0x3e5, double:4.926E-321)
            r9 = r34
            r10 = r12
            r13 = r33
            r16 = r0
            r4.h10(r5, r7, r9, r10, r11, r12, r13, r14, r16)     // Catch:{ all -> 0x017d }
            goto L_0x0194
        L_0x0179:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)     // Catch:{ all -> 0x017d }
            return
        L_0x017d:
            r0 = move-exception
            java.lang.String r4 = r1.f164266d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "enterAdLiveRoom, exp is"
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x0194:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.widget.living.AdLivingStreamContainer.mo80867e():void");
    }

    /* renamed from: f */
    public final void mo80868f() {
        SnsMethodCalculate.markStartTimeMs("pausePlayerStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        try {
            String str = this.f164266d;
            Log.m105924i(str, "pausePlayerStream, mIsPlayCompleted is " + this.f164284x0);
            if (this.f164284x0) {
                SnsMethodCalculate.markEndTimeMs("pausePlayerStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
                return;
            }
            this.f164282w.removeCallbacksAndMessages((Object) null);
            this.f164247D = true;
            ImageView imageView = this.f164271i;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ProgressBar progressBar = this.f164272j;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            mo80864b();
            C11078h hVar = this.f164274o;
            if (hVar != null) {
                hVar.mo11220f();
            }
            SnsMethodCalculate.markEndTimeMs("pausePlayerStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        } catch (Throwable th) {
            String str2 = this.f164266d;
            Log.m105920e(str2, "pausePlayerStream, exp is" + th);
        }
    }

    /* renamed from: g */
    public final void mo80869g() {
        SnsMethodCalculate.markStartTimeMs("removeObserver", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        try {
            if (getContext() instanceof C0125s) {
                Context context = getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                ((C0125s) context).getLifecycle().removeObserver(this);
            }
        } catch (Throwable th) {
            String str = this.f164266d;
            Log.m105920e(str, "removeObserver, exp is" + th);
        }
        SnsMethodCalculate.markEndTimeMs("removeObserver", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    public final String getMAdData() {
        SnsMethodCalculate.markStartTimeMs("getMAdData", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        String str = this.f164285y;
        SnsMethodCalculate.markEndTimeMs("getMAdData", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        return str;
    }

    public final String getMAdExtInfo() {
        SnsMethodCalculate.markStartTimeMs("getMAdExtInfo", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        String str = this.f164263U;
        SnsMethodCalculate.markEndTimeMs("getMAdExtInfo", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        return str;
    }

    public final ImageView getMBackgroundMaskView() {
        SnsMethodCalculate.markStartTimeMs("getMBackgroundMaskView", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        ImageView imageView = this.f164269g;
        SnsMethodCalculate.markEndTimeMs("getMBackgroundMaskView", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        return imageView;
    }

    public final C52005xq0 getMFinderJoinLiveResp() {
        SnsMethodCalculate.markStartTimeMs("getMFinderJoinLiveResp", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        C52005xq0 xq02 = this.f164278s;
        SnsMethodCalculate.markEndTimeMs("getMFinderJoinLiveResp", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        return xq02;
    }

    public final FinderObject getMFinderObject() {
        SnsMethodCalculate.markStartTimeMs("getMFinderObject", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        FinderObject finderObject = this.f164275p;
        SnsMethodCalculate.markEndTimeMs("getMFinderObject", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        return finderObject;
    }

    public final C51713vn0 getMGetLiveInfoResp() {
        SnsMethodCalculate.markStartTimeMs("getMGetLiveInfoResp", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        C51713vn0 vn02 = this.f164277r;
        SnsMethodCalculate.markEndTimeMs("getMGetLiveInfoResp", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        return vn02;
    }

    public final boolean getMIsAttached() {
        SnsMethodCalculate.markStartTimeMs("getMIsAttached", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        boolean z = this.f164255L;
        SnsMethodCalculate.markEndTimeMs("getMIsAttached", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        return z;
    }

    public final boolean getMIsEnterAdRoom() {
        SnsMethodCalculate.markStartTimeMs("getMIsEnterAdRoom", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        boolean z = this.f164283x;
        SnsMethodCalculate.markEndTimeMs("getMIsEnterAdRoom", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        return z;
    }

    public final boolean getMIsPlayCompleted() {
        SnsMethodCalculate.markStartTimeMs("getMIsPlayCompleted", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        boolean z = this.f164284x0;
        SnsMethodCalculate.markEndTimeMs("getMIsPlayCompleted", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        return z;
    }

    public final ProgressBar getMLoading() {
        SnsMethodCalculate.markStartTimeMs("getMLoading", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        ProgressBar progressBar = this.f164272j;
        SnsMethodCalculate.markEndTimeMs("getMLoading", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        return progressBar;
    }

    public final boolean getMNeedExitAdRoomReq() {
        SnsMethodCalculate.markStartTimeMs("getMNeedExitAdRoomReq", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        boolean z = this.f164279t;
        SnsMethodCalculate.markEndTimeMs("getMNeedExitAdRoomReq", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        return z;
    }

    public final C11078h getMPlayer() {
        SnsMethodCalculate.markStartTimeMs("getMPlayer", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        C11078h hVar = this.f164274o;
        SnsMethodCalculate.markEndTimeMs("getMPlayer", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        return hVar;
    }

    public final FrameLayout getMPlayerContainer() {
        SnsMethodCalculate.markStartTimeMs("getMPlayerContainer", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        FrameLayout frameLayout = this.f164267e;
        SnsMethodCalculate.markEndTimeMs("getMPlayerContainer", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        return frameLayout;
    }

    public final FrameLayout getMPlayerContainerBackground() {
        SnsMethodCalculate.markStartTimeMs("getMPlayerContainerBackground", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        FrameLayout frameLayout = this.f164268f;
        SnsMethodCalculate.markEndTimeMs("getMPlayerContainerBackground", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        return frameLayout;
    }

    public final int getMPlayerStatus() {
        SnsMethodCalculate.markStartTimeMs("getMPlayerStatus", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        int i = this.f164256M;
        SnsMethodCalculate.markEndTimeMs("getMPlayerStatus", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        return i;
    }

    public final int getMScene() {
        SnsMethodCalculate.markStartTimeMs("getMScene", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        int i = this.f164264V;
        SnsMethodCalculate.markEndTimeMs("getMScene", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        return i;
    }

    public final String getMSnsId() {
        SnsMethodCalculate.markStartTimeMs("getMSnsId", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        String str = this.f164261S;
        SnsMethodCalculate.markEndTimeMs("getMSnsId", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        return str;
    }

    public final SnsInfo getMSnsInfo() {
        SnsMethodCalculate.markStartTimeMs("getMSnsInfo", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        SnsInfo snsInfo = this.f164276q;
        SnsMethodCalculate.markEndTimeMs("getMSnsInfo", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        return snsInfo;
    }

    public final int getMSource() {
        SnsMethodCalculate.markStartTimeMs("getMSource", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        int i = this.f164286z;
        SnsMethodCalculate.markEndTimeMs("getMSource", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        return i;
    }

    public final ImageView getMStatusIcon() {
        SnsMethodCalculate.markStartTimeMs("getMStatusIcon", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        ImageView imageView = this.f164271i;
        SnsMethodCalculate.markEndTimeMs("getMStatusIcon", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        return imageView;
    }

    public final ImageView getMThumbView() {
        SnsMethodCalculate.markStartTimeMs("getMThumbView", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        ImageView imageView = this.f164270h;
        SnsMethodCalculate.markEndTimeMs("getMThumbView", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        return imageView;
    }

    public final String getMUxInfo() {
        SnsMethodCalculate.markStartTimeMs("getMUxInfo", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        String str = this.f164262T;
        SnsMethodCalculate.markEndTimeMs("getMUxInfo", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        return str;
    }

    public final MMHandler getMmHandler() {
        SnsMethodCalculate.markStartTimeMs("getMmHandler", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        MMHandler mMHandler = this.f164282w;
        SnsMethodCalculate.markEndTimeMs("getMmHandler", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        return mMHandler;
    }

    public final C32224a<C13598b0> getRunnable() {
        SnsMethodCalculate.markStartTimeMs("getRunnable", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        C32224a<C13598b0> aVar = this.f164254K;
        SnsMethodCalculate.markEndTimeMs("getRunnable", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        return aVar;
    }

    public final C0000n0 getScope() {
        SnsMethodCalculate.markStartTimeMs("getScope", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        C0000n0 n0Var = this.f164273n;
        SnsMethodCalculate.markEndTimeMs("getScope", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        return n0Var;
    }

    public final long getStartEnterAdLiveRoomTime() {
        SnsMethodCalculate.markStartTimeMs("getStartEnterAdLiveRoomTime", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        long j = this.f164280u;
        SnsMethodCalculate.markEndTimeMs("getStartEnterAdLiveRoomTime", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        return j;
    }

    /* renamed from: h */
    public final void mo80896h() {
        SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        try {
            this.f164276q = null;
            setEventListenerEnabled(false);
            C58085t0<Boolean> t0Var = this.f164249F;
            Boolean bool = Boolean.FALSE;
            ((C58100z0) t0Var).mo82832d(bool);
            ((C58100z0) this.f164250G).mo82832d(bool);
            mo80899k();
            this.f164282w.removeCallbacksAndMessages((Object) null);
            this.f164256M = 0;
            this.f164275p = null;
            this.f164253J = false;
        } catch (Throwable th) {
            String str = this.f164266d;
            Log.m105920e(str, "reset, exp is" + th);
        }
        SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    /* renamed from: i */
    public final void mo80897i(C101804kv2 kv22, Integer num, Integer num2) {
        SnsMethodCalculate.markStartTimeMs("setBlurBkg", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        if (this.f164269g == null) {
            SnsMethodCalculate.markEndTimeMs("setBlurBkg", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        } else if (kv22 == null) {
            SnsMethodCalculate.markEndTimeMs("setBlurBkg", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        } else {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            Float valueOf = layoutParams != null ? Float.valueOf((float) layoutParams.width) : null;
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            Float valueOf2 = layoutParams2 != null ? Float.valueOf((float) layoutParams2.height) : null;
            boolean z = false;
            if (!(valueOf == null)) {
                if (valueOf2 == null) {
                    z = true;
                }
                if (!z && !C87412m.m108588a(valueOf, 0.0f) && !C87412m.m108588a(valueOf2, 0.0f)) {
                    SnsMethodCalculate.markStartTimeMs("cancelScope", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
                    C0000n0 n0Var = this.f164273n;
                    if (n0Var != null) {
                        C53930o0.m60556c(n0Var, (CancellationException) null);
                    }
                    this.f164273n = null;
                    SnsMethodCalculate.markEndTimeMs("cancelScope", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
                    C53896h0 h0Var = C53872d1.f151117a;
                    this.f164273n = C53930o0.m60554a(C58901s.f168555a.plus(this.f164260R));
                    Log.m105924i(this.f164266d, "scope launch");
                    C0000n0 n0Var2 = this.f164273n;
                    if (n0Var2 != null) {
                        C53895h.m60466d(n0Var2, (C66212f) null, (C53934p0) null, new C57341f(this, kv22, num, num2, (C15601d<? super C57341f>) null), 3, (Object) null);
                    }
                    SnsMethodCalculate.markEndTimeMs("setBlurBkg", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
                    return;
                }
            }
            SnsMethodCalculate.markEndTimeMs("setBlurBkg", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r2 = r2.liveInfo;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80898j() {
        /*
            r9 = this;
            java.lang.String r0 = "startPlayerStream"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r9.f164275p     // Catch:{ all -> 0x00ba }
            if (r2 != 0) goto L_0x0018
            java.lang.String r2 = r9.f164266d     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = "startPlayerStream but mFinderObject is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r3)     // Catch:{ all -> 0x00ba }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)     // Catch:{ all -> 0x00ba }
            return
        L_0x0018:
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0026
            te3.c21 r2 = r2.liveInfo     // Catch:{ all -> 0x00ba }
            if (r2 == 0) goto L_0x0026
            int r2 = r2.f182394f     // Catch:{ all -> 0x00ba }
            if (r2 != r4) goto L_0x0026
            r2 = 1
            goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            if (r2 != 0) goto L_0x005b
            r9.f164284x0 = r4     // Catch:{ all -> 0x00ba }
            java.lang.String r2 = r9.f164266d     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r3.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = "startPlayerStream but mFinderObject liveStatus is "
            r3.append(r4)     // Catch:{ all -> 0x00ba }
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r9.f164275p     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x0047
            te3.c21 r4 = r4.liveInfo     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x0047
            int r4 = r4.f182394f     // Catch:{ all -> 0x00ba }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00ba }
            goto L_0x0048
        L_0x0047:
            r4 = 0
        L_0x0048:
            r3.append(r4)     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = ", not open"
            r3.append(r4)     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00ba }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r3)     // Catch:{ all -> 0x00ba }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)     // Catch:{ all -> 0x00ba }
            return
        L_0x005b:
            mr.h r2 = r9.f164274o     // Catch:{ all -> 0x00ba }
            if (r2 != 0) goto L_0x0079
            java.lang.Class<mr.k> r2 = p204mr.C11080k.class
            di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ all -> 0x00ba }
            mr.k r2 = (p204mr.C11080k) r2     // Catch:{ all -> 0x00ba }
            android.content.Context r5 = r9.getContext()     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"
            gy3.C87412m.m108592e(r5, r6)     // Catch:{ all -> 0x00ba }
            androidx.appcompat.app.AppCompatActivity r5 = (androidx.appcompat.app.AppCompatActivity) r5     // Catch:{ all -> 0x00ba }
            mr.h r2 = r2.Jk0(r5)     // Catch:{ all -> 0x00ba }
            r9.f164274o = r2     // Catch:{ all -> 0x00ba }
        L_0x0079:
            android.widget.ImageView r2 = r9.f164271i     // Catch:{ all -> 0x00ba }
            if (r2 != 0) goto L_0x007e
            goto L_0x0083
        L_0x007e:
            r5 = 8
            r2.setVisibility(r5)     // Catch:{ all -> 0x00ba }
        L_0x0083:
            boolean r2 = r9.f164253J     // Catch:{ all -> 0x00ba }
            if (r2 != 0) goto L_0x008f
            android.widget.ProgressBar r2 = r9.f164272j     // Catch:{ all -> 0x00ba }
            if (r2 != 0) goto L_0x008c
            goto L_0x008f
        L_0x008c:
            r2.setVisibility(r3)     // Catch:{ all -> 0x00ba }
        L_0x008f:
            r9.mo80866d()     // Catch:{ all -> 0x00ba }
            r9.f164256M = r4     // Catch:{ all -> 0x00ba }
            r9.f164247D = r3     // Catch:{ all -> 0x00ba }
            boolean r2 = r9.f164255L     // Catch:{ all -> 0x00ba }
            if (r2 != 0) goto L_0x00a3
            r9.f164255L = r4     // Catch:{ all -> 0x00ba }
            mr.h r2 = r9.f164274o     // Catch:{ all -> 0x00ba }
            if (r2 == 0) goto L_0x00a3
            r2.mo11219e()     // Catch:{ all -> 0x00ba }
        L_0x00a3:
            android.widget.FrameLayout r5 = r9.f164267e     // Catch:{ all -> 0x00ba }
            if (r5 == 0) goto L_0x00d2
            mr.h r3 = r9.f164274o     // Catch:{ all -> 0x00ba }
            if (r3 == 0) goto L_0x00d2
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r9.f164275p     // Catch:{ all -> 0x00ba }
            gy3.C87412m.m108591d(r4)     // Catch:{ all -> 0x00ba }
            fy3.a<rx3.b0> r6 = r9.f164257N     // Catch:{ all -> 0x00ba }
            fy3.a<rx3.b0> r7 = r9.f164258P     // Catch:{ all -> 0x00ba }
            fy3.p<java.lang.Integer, java.lang.Integer, rx3.b0> r8 = r9.f164259Q     // Catch:{ all -> 0x00ba }
            r3.mo11217d(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00ba }
            goto L_0x00d2
        L_0x00ba:
            r2 = move-exception
            java.lang.String r3 = r9.f164266d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "startPlayerStream, exp is"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
        L_0x00d2:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.widget.living.AdLivingStreamContainer.mo80898j():void");
    }

    /* renamed from: k */
    public final void mo80899k() {
        SnsMethodCalculate.markStartTimeMs("stopPlayerStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        try {
            SnsMethodCalculate.markStartTimeMs("cancelScope", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
            C0000n0 n0Var = this.f164273n;
            if (n0Var != null) {
                C53930o0.m60556c(n0Var, (CancellationException) null);
            }
            this.f164273n = null;
            SnsMethodCalculate.markEndTimeMs("cancelScope", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
            SnsMethodCalculate.markStartTimeMs("stopPlayer", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
            FrameLayout frameLayout = this.f164268f;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            ImageView imageView = this.f164271i;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ProgressBar progressBar = this.f164272j;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            C11078h hVar = this.f164274o;
            if (hVar != null) {
                hVar.mo11216c();
            }
            SnsMethodCalculate.markEndTimeMs("stopPlayer", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
            C11078h hVar2 = this.f164274o;
            if (hVar2 != null) {
                hVar2.detach();
            }
            this.f164255L = false;
            Log.m105924i(this.f164266d, "stopPlayerStream");
        } catch (Throwable th) {
            String str = this.f164266d;
            Log.m105920e(str, "stopPlayerStream, exp is" + th);
        }
        SnsMethodCalculate.markEndTimeMs("stopPlayerStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        super.onDetachedFromWindow();
        Log.m105924i(this.f164266d, "onDetachedFromWindow");
        try {
            if (this.f164286z != 0) {
                mo80868f();
                FrameLayout frameLayout = this.f164268f;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                C58085t0<Boolean> t0Var = this.f164249F;
                Boolean bool = Boolean.FALSE;
                ((C58100z0) t0Var).mo82832d(bool);
                ((C58100z0) this.f164250G).mo82832d(bool);
                SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
                return;
            }
            mo80896h();
            SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        } catch (Throwable th) {
            String str = this.f164266d;
            Log.m105920e(str, "onDetachedFromWindow, exp is" + th);
        }
    }

    public void onFinishInflate() {
        SnsMethodCalculate.markStartTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        super.onFinishInflate();
        try {
            this.f164267e = (FrameLayout) findViewById(C0966R.C0970id.fwx);
            this.f164268f = (FrameLayout) findViewById(C0966R.C0970id.k_y);
            this.f164269g = (ImageView) findViewById(C0966R.C0970id.eg9);
            this.f164270h = (ImageView) findViewById(C0966R.C0970id.kk9);
            ImageView imageView = (ImageView) findViewById(C0966R.C0970id.k1a);
            this.f164271i = imageView;
            if (imageView != null) {
                imageView.setImageDrawable(C76577a.m92158i(getContext(), C0966R.raw.shortvideo_play_btn));
            }
            this.f164272j = (ProgressBar) findViewById(C0966R.C0970id.l6a);
            ImageView imageView2 = this.f164271i;
            if (imageView2 != null) {
                imageView2.setContentDescription(getContext().getString(C0966R.string.f361136hk0));
            }
            if (getContext() instanceof C0125s) {
                Context context = getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                ((C0125s) context).getLifecycle().addObserver(this);
            }
        } catch (Throwable th) {
            String str = this.f164266d;
            Log.m105920e(str, "onFinishInflate, exp is" + th);
        }
        SnsMethodCalculate.markEndTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    public void onStartTemporaryDetach() {
        SnsMethodCalculate.markStartTimeMs("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        super.onStartTemporaryDetach();
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                Log.m105918d(this.f164266d, "onStartTemporaryDetach");
            } else if (this.f164286z != 0) {
                mo80868f();
                FrameLayout frameLayout = this.f164268f;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                C58085t0<Boolean> t0Var = this.f164249F;
                Boolean bool = Boolean.FALSE;
                ((C58100z0) t0Var).mo82832d(bool);
                ((C58100z0) this.f164250G).mo82832d(bool);
                SnsMethodCalculate.markEndTimeMs("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
                return;
            } else {
                mo80896h();
                Log.m105924i(this.f164266d, "onStartTemporaryDetach");
            }
        } catch (Throwable th) {
            String str = this.f164266d;
            Log.m105920e(str, "onStartTemporaryDetach, exp is" + th);
        }
        SnsMethodCalculate.markEndTimeMs("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public final void onUIPause() {
        SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        try {
            mo80868f();
            Log.m105924i(this.f164266d, "onUIPause");
        } catch (Throwable th) {
            String str = this.f164266d;
            Log.m105920e(str, "onUIPause, exp is" + th);
        }
        SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    public final void setEventListenerEnabled(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setEventListenerEnabled", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        try {
            String str = this.f164266d;
            Log.m105924i(str, "setEventListenerEnabled: " + z);
            if (z) {
                if (getContext() instanceof MMActivity) {
                    Context context = getContext();
                    C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    MMActivity mMActivity = (MMActivity) context;
                    if (mMActivity.isFinishing() || mMActivity.isDestroyed()) {
                        Log.m105928w(this.f164266d, "setEventListenerEnabled, but activity isFinishing or isDestroyed");
                        SnsMethodCalculate.markEndTimeMs("setEventListenerEnabled", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
                        return;
                    }
                }
                this.f164265W.alive();
            } else {
                this.f164265W.dead();
            }
        } catch (Throwable th) {
            String str2 = this.f164266d;
            Log.m105920e(str2, "setEventListenerEnabled, exp is" + th);
        }
        SnsMethodCalculate.markEndTimeMs("setEventListenerEnabled", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    public final void setMAdData(String str) {
        SnsMethodCalculate.markStartTimeMs("setMAdData", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        C87412m.m108594g(str, "<set-?>");
        this.f164285y = str;
        SnsMethodCalculate.markEndTimeMs("setMAdData", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    public final void setMAdExtInfo(String str) {
        SnsMethodCalculate.markStartTimeMs("setMAdExtInfo", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        C87412m.m108594g(str, "<set-?>");
        this.f164263U = str;
        SnsMethodCalculate.markEndTimeMs("setMAdExtInfo", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    public final void setMBackgroundMaskView(ImageView imageView) {
        SnsMethodCalculate.markStartTimeMs("setMBackgroundMaskView", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        this.f164269g = imageView;
        SnsMethodCalculate.markEndTimeMs("setMBackgroundMaskView", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    public final void setMFinderJoinLiveResp(C52005xq0 xq02) {
        SnsMethodCalculate.markStartTimeMs("setMFinderJoinLiveResp", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        this.f164278s = xq02;
        SnsMethodCalculate.markEndTimeMs("setMFinderJoinLiveResp", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    public final void setMFinderObject(FinderObject finderObject) {
        SnsMethodCalculate.markStartTimeMs("setMFinderObject", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        this.f164275p = finderObject;
        SnsMethodCalculate.markEndTimeMs("setMFinderObject", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    public final void setMGetLiveInfoResp(C51713vn0 vn02) {
        SnsMethodCalculate.markStartTimeMs("setMGetLiveInfoResp", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        this.f164277r = vn02;
        SnsMethodCalculate.markEndTimeMs("setMGetLiveInfoResp", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    public final void setMIsAttached(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setMIsAttached", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        this.f164255L = z;
        SnsMethodCalculate.markEndTimeMs("setMIsAttached", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    public final void setMIsEnterAdRoom(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setMIsEnterAdRoom", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        this.f164283x = z;
        SnsMethodCalculate.markEndTimeMs("setMIsEnterAdRoom", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    public final void setMIsPlayCompleted(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setMIsPlayCompleted", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        this.f164284x0 = z;
        SnsMethodCalculate.markEndTimeMs("setMIsPlayCompleted", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    public final void setMLoading(ProgressBar progressBar) {
        SnsMethodCalculate.markStartTimeMs("setMLoading", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        this.f164272j = progressBar;
        SnsMethodCalculate.markEndTimeMs("setMLoading", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    public final void setMNeedExitAdRoomReq(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setMNeedExitAdRoomReq", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        this.f164279t = z;
        SnsMethodCalculate.markEndTimeMs("setMNeedExitAdRoomReq", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    public final void setMPlayer(C11078h hVar) {
        SnsMethodCalculate.markStartTimeMs("setMPlayer", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        this.f164274o = hVar;
        SnsMethodCalculate.markEndTimeMs("setMPlayer", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    public final void setMPlayerContainer(FrameLayout frameLayout) {
        SnsMethodCalculate.markStartTimeMs("setMPlayerContainer", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        this.f164267e = frameLayout;
        SnsMethodCalculate.markEndTimeMs("setMPlayerContainer", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    public final void setMPlayerContainerBackground(FrameLayout frameLayout) {
        SnsMethodCalculate.markStartTimeMs("setMPlayerContainerBackground", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        this.f164268f = frameLayout;
        SnsMethodCalculate.markEndTimeMs("setMPlayerContainerBackground", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    public final void setMPlayerStatus(int i) {
        SnsMethodCalculate.markStartTimeMs("setMPlayerStatus", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        this.f164256M = i;
        SnsMethodCalculate.markEndTimeMs("setMPlayerStatus", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    public final void setMScene(int i) {
        SnsMethodCalculate.markStartTimeMs("setMScene", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        this.f164264V = i;
        SnsMethodCalculate.markEndTimeMs("setMScene", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    public final void setMSnsId(String str) {
        SnsMethodCalculate.markStartTimeMs("setMSnsId", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        C87412m.m108594g(str, "<set-?>");
        this.f164261S = str;
        SnsMethodCalculate.markEndTimeMs("setMSnsId", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    public final void setMSnsInfo(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("setMSnsInfo", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        this.f164276q = snsInfo;
        SnsMethodCalculate.markEndTimeMs("setMSnsInfo", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    public final void setMSource(int i) {
        SnsMethodCalculate.markStartTimeMs("setMSource", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        this.f164286z = i;
        SnsMethodCalculate.markEndTimeMs("setMSource", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    public final void setMStatusIcon(ImageView imageView) {
        SnsMethodCalculate.markStartTimeMs("setMStatusIcon", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        this.f164271i = imageView;
        SnsMethodCalculate.markEndTimeMs("setMStatusIcon", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    public final void setMThumbView(ImageView imageView) {
        SnsMethodCalculate.markStartTimeMs("setMThumbView", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        this.f164270h = imageView;
        SnsMethodCalculate.markEndTimeMs("setMThumbView", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    public final void setMUxInfo(String str) {
        SnsMethodCalculate.markStartTimeMs("setMUxInfo", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        C87412m.m108594g(str, "<set-?>");
        this.f164262T = str;
        SnsMethodCalculate.markEndTimeMs("setMUxInfo", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    public final void setScope(C0000n0 n0Var) {
        SnsMethodCalculate.markStartTimeMs("setScope", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        this.f164273n = n0Var;
        SnsMethodCalculate.markEndTimeMs("setScope", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    public final void setStartEnterAdLiveRoomTime(long j) {
        SnsMethodCalculate.markStartTimeMs("setStartEnterAdLiveRoomTime", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        this.f164280u = j;
        SnsMethodCalculate.markEndTimeMs("setStartEnterAdLiveRoomTime", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AdLivingStreamContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdLivingStreamContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f164266d = "MicroMsg.AdLivingStreamContainer";
        this.f164279t = true;
        this.f164282w = new MMHandler(Looper.getMainLooper());
        this.f164285y = "";
        this.f164247D = true;
        C54624g gVar = C54624g.DROP_OLDEST;
        this.f164249F = C58017a1.m67172a(1, 0, gVar);
        this.f164250G = C58017a1.m67172a(1, 0, gVar);
        this.f164254K = new C57339d(this);
        this.f164257N = new C57336a(this);
        this.f164258P = new C57337b(this);
        this.f164259Q = new C57338c(this);
        int i2 = C53901i0.f151153a0;
        this.f164260R = new C57344g(C53901i0.C39480a.f106019d, this);
        this.f164261S = "";
        this.f164262T = "";
        this.f164263U = "";
        this.f164265W = new AdLivingStreamContainer$mSnsAdLivingStreamJumpEventListener$1(this, C40008f.f107254d);
    }
}
