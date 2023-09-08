package nq2;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ao2.C79618h;
import br2.C54550e;
import co2.C92445n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.p136ui.widget.QImageView;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p104ad.widget.adsocial.AdAttitudeAttractView;
import com.tencent.p014mm.plugin.sns.p104ad.widget.adsocial.AdAttitudePlayView;
import com.tencent.p014mm.plugin.sns.p104ad.widget.adsocial.AdSocialAttitudeView;
import com.tencent.p014mm.plugin.sns.p104ad.widget.living.AdLivingStreamContainer;
import com.tencent.p014mm.plugin.sns.p104ad.widget.living.C94764b;
import com.tencent.p014mm.plugin.sns.p104ad.widget.living.FinderLivingAnimWrapper;
import com.tencent.p014mm.plugin.sns.p106ui.C96066m2;
import com.tencent.p014mm.plugin.sns.p106ui.MaskImageView;
import com.tencent.p014mm.plugin.sns.p106ui.OfflineVideoView;
import com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.video.SnsTimelineVideoView;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdBreakFrameVideoView;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdCardVideoEndView;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdTimelineVideoView;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAvatarImageView;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoSightView;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.smiley.C96963p0;
import di3.C86312j;
import h81.C32735h;
import j20.C117292a;
import jp2.C98963o;
import jq2.C98993j;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lo2.C99542h0;
import nu2.C100207g;
import ou2.C100485g;
import p749xh.C66261f3;
import vr2.C102236a0;
import vr2.C102260r;

/* renamed from: nq2.a */
public class C100151a {

    /* renamed from: a */
    public C100155d f293329a;

    /* renamed from: b */
    public ADXml.C95018g f293330b;

    /* renamed from: c */
    public SnsInfo f293331c;

    /* renamed from: d */
    public Context f293332d;

    /* renamed from: e */
    public C98963o f293333e;

    /* renamed from: f */
    public TimeLineObject f293334f;

    /* renamed from: g */
    public C100485g f293335g;

    /* renamed from: h */
    public C94764b f293336h;

    /* renamed from: i */
    public C100156e f293337i;

    /* renamed from: nq2.a$a */
    public class C100152a implements OnlineVideoView.IVideoViewCallback {
        public C100152a() {
        }

        /* renamed from: a */
        public void mo132395a(int i) {
            SnsMethodCalculate.markStartTimeMs(C66261f3.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$1");
            if (C100151a.m130849a(C100151a.this) != null) {
                C100151a.m130849a(C100151a.this).mo133435a(i, true);
            }
            SnsMethodCalculate.markEndTimeMs(C66261f3.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$1");
        }

        /* renamed from: b */
        public void mo132396b(int i) {
            SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$1");
            Log.m105924i("FullCardAdWrapper", "online, onStart:" + i);
            if (C100151a.m130849a(C100151a.this) != null) {
                C100151a.m130849a(C100151a.this).mo133436b(i, true);
            }
            SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$1");
        }

        public void onCompletion() {
            SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$1");
            Log.m105924i("FullCardAdWrapper", "online, onCompletion");
            if (C100151a.m130849a(C100151a.this) != null) {
                C100151a.m130849a(C100151a.this).mo133438d(true);
            }
            SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$1");
        }
    }

    /* renamed from: nq2.a$b */
    public class C100153b implements OfflineVideoView.C95361h {
        public C100153b() {
        }

        /* renamed from: a */
        public void mo131754a(int i) {
            SnsMethodCalculate.markStartTimeMs(C66261f3.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$2");
            if (C100151a.m130849a(C100151a.this) != null) {
                C100151a.m130849a(C100151a.this).mo133435a(i, false);
            }
            SnsMethodCalculate.markEndTimeMs(C66261f3.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$2");
        }

        /* renamed from: b */
        public void mo131755b(int i) {
            SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$2");
            Log.m105924i("FullCardAdWrapper", "offline, onStart:" + i);
            if (C100151a.m130849a(C100151a.this) != null) {
                C100151a.m130849a(C100151a.this).mo133436b(i, false);
            }
            SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$2");
        }

        /* renamed from: c */
        public boolean mo131756c(PString pString, PString pString2) {
            SnsMethodCalculate.markStartTimeMs("downloadVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$2");
            Log.m105924i("FullCardAdWrapper", "offline, downloadVideo");
            SnsMethodCalculate.markEndTimeMs("downloadVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$2");
            return false;
        }

        public void onCompletion() {
            SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$2");
            Log.m105924i("FullCardAdWrapper", "offline, onCompletion");
            if (C100151a.m130849a(C100151a.this) != null) {
                C100151a.m130849a(C100151a.this).mo133438d(false);
            }
            SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper$2");
        }
    }

    /* renamed from: nq2.a$c */
    public static class C100154c {

        /* renamed from: a */
        public int f293340a;

        /* renamed from: b */
        public boolean f293341b = false;

        /* renamed from: c */
        public boolean f293342c;

        /* renamed from: d */
        public volatile boolean f293343d;

        /* renamed from: e */
        public C100207g f293344e;
    }

    /* renamed from: nq2.a$d */
    public static class C100155d {

        /* renamed from: A */
        public LinearLayout f293345A;

        /* renamed from: B */
        public LinearLayout f293346B;

        /* renamed from: C */
        public ViewStub f293347C;

        /* renamed from: D */
        public AdSocialAttitudeView f293348D;

        /* renamed from: E */
        public ViewStub f293349E;

        /* renamed from: F */
        public AdAttitudeAttractView f293350F;

        /* renamed from: G */
        public ViewStub f293351G;

        /* renamed from: H */
        public AdAttitudePlayView f293352H;

        /* renamed from: I */
        public View f293353I;

        /* renamed from: J */
        public AdLivingStreamContainer f293354J;

        /* renamed from: K */
        public C100154c f293355K = new C100154c();

        /* renamed from: a */
        public View f293356a;

        /* renamed from: b */
        public View f293357b;

        /* renamed from: c */
        public MaskImageView f293358c;

        /* renamed from: d */
        public TextView f293359d;

        /* renamed from: e */
        public TextView f293360e;

        /* renamed from: f */
        public TextView f293361f;

        /* renamed from: g */
        public TextView f293362g;

        /* renamed from: h */
        public View f293363h;

        /* renamed from: i */
        public ImageView f293364i;

        /* renamed from: j */
        public TextView f293365j;

        /* renamed from: k */
        public ImageView f293366k;

        /* renamed from: l */
        public ImageView f293367l;

        /* renamed from: m */
        public C96066m2 f293368m;

        /* renamed from: n */
        public SnsAdCardVideoEndView f293369n;

        /* renamed from: o */
        public SnsAdBreakFrameVideoView f293370o;

        /* renamed from: p */
        public ViewStub f293371p;

        /* renamed from: q */
        public ViewGroup f293372q;

        /* renamed from: r */
        public ViewStub f293373r;

        /* renamed from: s */
        public FinderLivingAnimWrapper f293374s;

        /* renamed from: t */
        public ViewGroup f293375t;

        /* renamed from: u */
        public SnsTimelineVideoView f293376u;

        /* renamed from: v */
        public View f293377v;

        /* renamed from: w */
        public View f293378w;

        /* renamed from: x */
        public View f293379x;

        /* renamed from: y */
        public SnsAvatarImageView f293380y;

        /* renamed from: z */
        public ViewGroup f293381z;
    }

    /* renamed from: nq2.a$e */
    public interface C100156e {
        /* renamed from: a */
        void mo133435a(int i, boolean z);

        /* renamed from: b */
        void mo133436b(int i, boolean z);

        /* renamed from: c */
        void mo133437c();

        /* renamed from: d */
        void mo133438d(boolean z);
    }

    /* renamed from: a */
    public static /* synthetic */ C100156e m130849a(C100151a aVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        C100156e eVar = aVar.f293337i;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        return eVar;
    }

    /* renamed from: g */
    public static C100155d m130850g(View view) {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        C100155d dVar = new C100155d();
        dVar.f293356a = view.findViewById(C0966R.C0970id.kri);
        dVar.f293357b = view.findViewById(C0966R.C0970id.agt);
        dVar.f293359d = (TextView) view.findViewById(C0966R.C0970id.krk);
        dVar.f293360e = (TextView) view.findViewById(C0966R.C0970id.krj);
        dVar.f293361f = (TextView) view.findViewById(C0966R.C0970id.agv);
        dVar.f293362g = (TextView) view.findViewById(C0966R.C0970id.agu);
        float z = C102260r.m134886z(C0966R.dimen.anw);
        float z2 = C102260r.m134886z(C0966R.dimen.anr);
        dVar.f293359d.setTextSize(0, z);
        dVar.f293360e.setTextSize(0, z2);
        dVar.f293361f.setTextSize(0, z);
        dVar.f293362g.setTextSize(0, z2);
        dVar.f293363h = view.findViewById(C0966R.C0970id.f357559ah3);
        dVar.f293364i = (ImageView) view.findViewById(C0966R.C0970id.gu5);
        dVar.f293365j = (TextView) view.findViewById(C0966R.C0970id.gu6);
        MaskImageView maskImageView = (MaskImageView) view.findViewById(C0966R.C0970id.egi);
        dVar.f293358c = maskImageView;
        maskImageView.setScaleType(QImageView.C97274a.CENTER_CROP);
        C96066m2 m2Var = new C96066m2();
        dVar.f293368m = m2Var;
        m2Var.f280505h = view.findViewById(C0966R.C0970id.egl);
        C96066m2 m2Var2 = dVar.f293368m;
        View view2 = m2Var2.f280505h;
        m2Var2.f280501d = view2;
        m2Var2.f280502e = (VideoSightView) view2.findViewById(C0966R.C0970id.f39);
        C96066m2 m2Var3 = dVar.f293368m;
        m2Var3.f280504g = (SnsAdTimelineVideoView) m2Var3.f280505h.findViewById(C0966R.C0970id.hlh);
        dVar.f293368m.f280504g.setMute(true);
        dVar.f293368m.f280506i = (ImageView) view.findViewById(C0966R.C0970id.egk);
        C96066m2 m2Var4 = dVar.f293368m;
        m2Var4.f280507j = (MMPinProgressBtn) m2Var4.f280505h.findViewById(C0966R.C0970id.i7j);
        C96066m2 m2Var5 = dVar.f293368m;
        m2Var5.f280509l = (TextView) m2Var5.f280505h.findViewById(C0966R.C0970id.f357936ck1);
        C96066m2 m2Var6 = dVar.f293368m;
        m2Var6.f280508k = (TextView) m2Var6.f280505h.findViewById(C0966R.C0970id.ckr);
        dVar.f293366k = (ImageView) view.findViewById(C0966R.C0970id.f358327eg2);
        dVar.f293367l = (ImageView) view.findViewById(C0966R.C0970id.cjt);
        dVar.f293371p = (ViewStub) view.findViewById(C0966R.C0970id.f5555i9);
        dVar.f293373r = (ViewStub) view.findViewById(C0966R.C0970id.f5546i0);
        dVar.f293375t = (ViewGroup) view.findViewById(C0966R.C0970id.egj);
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        return dVar;
    }

    /* renamed from: l */
    public static void m130851l(int i) {
        SnsMethodCalculate.markStartTimeMs("updateAbTestCfg", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        try {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_timeline_full_card_item_new, 0);
            Log.m105924i("FullCardAdWrapper", "updateFullCardExptCfg, expt=" + Qe + ", snene=" + i);
            if (i == 1) {
                C115669n.INSTANCE.mo175911u(1697, 21);
            }
        } catch (Throwable th) {
            Log.m105920e("FullCardAdWrapper", "updateAbTestCfg, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("updateAbTestCfg", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
    }

    /* renamed from: m */
    public static boolean m130852m(ADXml aDXml) {
        SnsMethodCalculate.markStartTimeMs("useOnlineVideoView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        if (aDXml != null && aDXml.isLongPressGestureAd()) {
            Log.m105924i("FullCardAdWrapper", "fullcard useOnlineVideoView false, longPressAd disable");
            SnsMethodCalculate.markEndTimeMs("useOnlineVideoView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
            return false;
        } else if (aDXml != null && aDXml.isAdBreakFrameVideo()) {
            Log.m105924i("FullCardAdWrapper", "fullcard useOnlineVideoView false, isAdBreakFrameVideo disable");
            SnsMethodCalculate.markEndTimeMs("useOnlineVideoView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
            return false;
        } else if (aDXml == null || !aDXml.isAdIpInteractVideo()) {
            int i = C79618h.f233469a;
            if (i == 1) {
                Log.m105924i("FullCardAdWrapper", "fullcard useOnlineVideoView false, force offline");
                SnsMethodCalculate.markEndTimeMs("useOnlineVideoView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
                return false;
            } else if (i == 2) {
                Log.m105924i("FullCardAdWrapper", "fullcard useOnlineVideoView true, force online");
                SnsMethodCalculate.markEndTimeMs("useOnlineVideoView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
                return true;
            } else {
                SnsMethodCalculate.markStartTimeMs("isExptUseOnlineVideoView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
                SnsMethodCalculate.markEndTimeMs("isExptUseOnlineVideoView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
                if (!C98993j.m128901c(aDXml)) {
                    Log.m105924i("FullCardAdWrapper", "fullcard useOnlineVideoView false, adXml StreamingMode disable");
                    SnsMethodCalculate.markEndTimeMs("useOnlineVideoView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
                    return false;
                }
                Log.m105924i("FullCardAdWrapper", "fullcard useOnlineVideoView true");
                SnsMethodCalculate.markEndTimeMs("useOnlineVideoView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
                return true;
            }
        } else {
            Log.m105924i("FullCardAdWrapper", "fullcard useOnlineVideoView false, isAdIpInteractVideo disable");
            SnsMethodCalculate.markEndTimeMs("useOnlineVideoView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
            return false;
        }
    }

    /* renamed from: b */
    public final void mo139442b(C92445n nVar, String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("checkShowLivingAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        if (FinderLivingAnimWrapper.m120030e(nVar, z)) {
            C100155d dVar = this.f293329a;
            if (dVar.f293374s == null) {
                dVar.f293374s = (FinderLivingAnimWrapper) dVar.f293373r.inflate();
            }
            if (this.f293329a.f293374s != null) {
                this.f293329a.f293374s.mo130549d(nVar, str, C76577a.m92151b(this.f293332d, 60), C76577a.m92151b(this.f293332d, 35));
                this.f293329a.f293374s.setVisibility(0);
            }
        } else {
            FinderLivingAnimWrapper finderLivingAnimWrapper = this.f293329a.f293374s;
            if (finderLivingAnimWrapper != null) {
                finderLivingAnimWrapper.setVisibility(8);
            }
        }
        SnsMethodCalculate.markEndTimeMs("checkShowLivingAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
    }

    /* renamed from: c */
    public ViewGroup.LayoutParams mo139443c(int i) {
        ViewStub viewStub;
        int i2 = i;
        SnsMethodCalculate.markStartTimeMs("fillItemStyle", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        View view = this.f293329a.f293356a;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/timeline/item/fullcard/FullCardAdWrapper", "fillItemStyle", "(I)Landroid/view/ViewGroup$LayoutParams;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ad/timeline/item/fullcard/FullCardAdWrapper", "fillItemStyle", "(I)Landroid/view/ViewGroup$LayoutParams;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f293329a.f293359d.setVisibility(8);
        this.f293329a.f293360e.setVisibility(8);
        View view2 = this.f293329a.f293357b;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ad/timeline/item/fullcard/FullCardAdWrapper", "fillItemStyle", "(I)Landroid/view/ViewGroup$LayoutParams;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ad/timeline/item/fullcard/FullCardAdWrapper", "fillItemStyle", "(I)Landroid/view/ViewGroup$LayoutParams;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f293329a.f293361f.setVisibility(8);
        this.f293329a.f293362g.setVisibility(8);
        View view3 = this.f293329a.f293363h;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(8);
        C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ad/timeline/item/fullcard/FullCardAdWrapper", "fillItemStyle", "(I)Landroid/view/ViewGroup$LayoutParams;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ad/timeline/item/fullcard/FullCardAdWrapper", "fillItemStyle", "(I)Landroid/view/ViewGroup$LayoutParams;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ADXml.C95018g gVar = this.f293330b;
        if (!(gVar == null || gVar.f275695k == null)) {
            C100155d dVar = this.f293329a;
            if (dVar.f293369n == null && (viewStub = (ViewStub) dVar.f293379x.findViewById(C0966R.C0970id.f359253jt3)) != null) {
                this.f293329a.f293369n = (SnsAdCardVideoEndView) viewStub.inflate();
            }
        }
        ViewGroup.LayoutParams layoutParams = null;
        ADXml.C95018g gVar2 = this.f293330b;
        if (gVar2 != null) {
            int i3 = gVar2.f275685a;
            if (i3 == 0) {
                layoutParams = new ViewGroup.LayoutParams(-2, -2);
                layoutParams.width = i2;
                layoutParams.height = (int) (((float) i2) * 0.75f);
            } else if (i3 == 1) {
                layoutParams = new ViewGroup.LayoutParams(-2, -2);
                layoutParams.width = i2;
                layoutParams.height = i2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("fillItemStyle, hash=");
            sb.append(this.f293329a.hashCode());
            sb.append(", snsId=");
            SnsInfo snsInfo = this.f293331c;
            sb.append(snsInfo == null ? "" : C102236a0.m134765q0(snsInfo.field_snsId));
            Log.m105924i("FullCardAdWrapper", sb.toString());
            if (layoutParams != null) {
                mo139449j(this.f293329a.f293379x, layoutParams.width, layoutParams.height);
                ((RoundedCornerFrameLayout) this.f293329a.f293379x).setRadius((float) C76577a.m92151b(this.f293332d, 8));
                mo139449j(this.f293329a.f293358c, layoutParams.width, layoutParams.height);
                mo139449j(this.f293329a.f293368m.f280504g, layoutParams.width, layoutParams.height);
                mo139449j(this.f293329a.f293375t, layoutParams.width, layoutParams.height);
                mo139449j(this.f293329a.f293366k, layoutParams.width, layoutParams.height);
                mo139449j(this.f293329a.f293367l, layoutParams.width, layoutParams.height);
                SnsAdCardVideoEndView snsAdCardVideoEndView = this.f293329a.f293369n;
                if (snsAdCardVideoEndView != null) {
                    mo139449j(snsAdCardVideoEndView, layoutParams.width, layoutParams.height);
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("mediaLayout==null, snsId=");
                SnsInfo snsInfo2 = this.f293331c;
                Object obj = "";
                if (snsInfo2 != null) {
                    obj = Long.valueOf(snsInfo2.field_snsId);
                }
                sb4.append(obj);
                Log.m105920e("FullCardAdWrapper", sb4.toString());
            }
            ADXml.C95018g gVar3 = this.f293330b;
            int i4 = gVar3.f275689e;
            if (i4 == 0) {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.argb((int) (((float) gVar3.f275688d) * 2.55f), 0, 0, 0), Color.argb(0, 0, 0, 0)});
                gradientDrawable.setGradientType(0);
                this.f293329a.f293356a.setBackground(gradientDrawable);
                if (!Util.isNullOrNil(this.f293330b.f275686b) || !Util.isNullOrNil(this.f293330b.f275687c)) {
                    View view4 = this.f293329a.f293356a;
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(0);
                    View view5 = view4;
                    C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/plugin/sns/ad/timeline/item/fullcard/FullCardAdWrapper", "fillItemStyle", "(I)Landroid/view/ViewGroup$LayoutParams;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/sns/ad/timeline/item/fullcard/FullCardAdWrapper", "fillItemStyle", "(I)Landroid/view/ViewGroup$LayoutParams;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (!Util.isNullOrNil(this.f293330b.f275686b)) {
                    this.f293329a.f293359d.setVisibility(0);
                    this.f293329a.f293359d.setText(C96963p0.wx0().mo83004M(this.f293329a.f293359d.getContext(), this.f293330b.f275686b));
                }
                if (!Util.isNullOrNil(this.f293330b.f275687c)) {
                    this.f293329a.f293360e.setVisibility(0);
                    this.f293329a.f293360e.setText(C96963p0.wx0().mo83004M(this.f293329a.f293360e.getContext(), this.f293330b.f275687c));
                }
            } else if (i4 == 1) {
                GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{Color.argb((int) (((float) gVar3.f275688d) * 2.55f), 0, 0, 0), Color.argb(0, 0, 0, 0)});
                gradientDrawable2.setGradientType(0);
                this.f293329a.f293357b.setBackground(gradientDrawable2);
                if (!Util.isNullOrNil(this.f293330b.f275686b) || !Util.isNullOrNil(this.f293330b.f275687c)) {
                    View view6 = this.f293329a.f293357b;
                    C9556a aVar5 = new C9556a();
                    aVar5.mo10233c(0);
                    View view7 = view6;
                    C117292a.m165358d(view7, aVar5.mo10232b(), "com/tencent/mm/plugin/sns/ad/timeline/item/fullcard/FullCardAdWrapper", "fillItemStyle", "(I)Landroid/view/ViewGroup$LayoutParams;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(view7, "com/tencent/mm/plugin/sns/ad/timeline/item/fullcard/FullCardAdWrapper", "fillItemStyle", "(I)Landroid/view/ViewGroup$LayoutParams;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f293329a.f293363h.getLayoutParams();
                    layoutParams2.topMargin = C76577a.m92151b(this.f293329a.f293379x.getContext(), 4);
                    this.f293329a.f293363h.setLayoutParams(layoutParams2);
                }
                if (!Util.isNullOrNil(this.f293330b.f275686b)) {
                    this.f293329a.f293361f.setVisibility(0);
                    this.f293329a.f293361f.setText(C96963p0.wx0().mo83004M(this.f293329a.f293361f.getContext(), this.f293330b.f275686b));
                }
                if (!Util.isNullOrNil(this.f293330b.f275687c)) {
                    this.f293329a.f293362g.setVisibility(0);
                    this.f293329a.f293362g.setText(C96963p0.wx0().mo83004M(this.f293329a.f293362g.getContext(), this.f293330b.f275687c));
                }
            }
            if (this.f293331c.getAdInfo().isWeapp() || C99542h0.m129910h(this.f293331c.getAdXml(), this.f293331c.getAdInfo())) {
                GradientDrawable gradientDrawable3 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{Color.argb((int) (((float) this.f293330b.f275688d) * 2.55f), 0, 0, 0), Color.argb(0, 0, 0, 0)});
                gradientDrawable3.setGradientType(0);
                this.f293329a.f293357b.setBackground(gradientDrawable3);
                View view8 = this.f293329a.f293357b;
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(0);
                C117292a.m165358d(view8, aVar6.mo10232b(), "com/tencent/mm/plugin/sns/ad/timeline/item/fullcard/FullCardAdWrapper", "fillItemStyle", "(I)Landroid/view/ViewGroup$LayoutParams;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/sns/ad/timeline/item/fullcard/FullCardAdWrapper", "fillItemStyle", "(I)Landroid/view/ViewGroup$LayoutParams;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view9 = this.f293329a.f293363h;
                C9556a aVar7 = new C9556a();
                aVar7.mo10233c(0);
                C117292a.m165358d(view9, aVar7.mo10232b(), "com/tencent/mm/plugin/sns/ad/timeline/item/fullcard/FullCardAdWrapper", "fillItemStyle", "(I)Landroid/view/ViewGroup$LayoutParams;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view9, "com/tencent/mm/plugin/sns/ad/timeline/item/fullcard/FullCardAdWrapper", "fillItemStyle", "(I)Landroid/view/ViewGroup$LayoutParams;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (this.f293331c.getAdInfo().isWeapp()) {
                    this.f293329a.f293365j.setText(C0966R.string.j9n);
                    this.f293329a.f293364i.setImageResource(C0966R.C0969drawable.c8m);
                } else {
                    this.f293329a.f293365j.setText(C0966R.string.d0s);
                    this.f293329a.f293364i.setImageResource(C0966R.C0969drawable.bt9);
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("fillItemStyle", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        return layoutParams;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a A[Catch:{ all -> 0x00a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0090 A[Catch:{ all -> 0x00a5 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo139444d(com.tencent.p014mm.plugin.sns.storage.SnsInfo r9) {
        /*
            r8 = this;
            java.lang.String r0 = "fillLivingViewInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "shouldShowLivingView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)     // Catch:{ all -> 0x00a5 }
            r3 = 0
            if (r9 == 0) goto L_0x0024
            com.tencent.mm.plugin.sns.storage.ADXml r4 = r9.getAdXml()     // Catch:{ all -> 0x00a5 }
            if (r4 == 0) goto L_0x0024
            com.tencent.mm.plugin.sns.storage.ADXml r4 = r9.getAdXml()     // Catch:{ all -> 0x00a5 }
            co2.n r4 = r4.adLiveInfo     // Catch:{ all -> 0x00a5 }
            if (r4 != 0) goto L_0x001f
            goto L_0x0024
        L_0x001f:
            r4 = 1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)     // Catch:{ all -> 0x00a5 }
            goto L_0x0028
        L_0x0024:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)     // Catch:{ all -> 0x00a5 }
            r4 = 0
        L_0x0028:
            if (r4 == 0) goto L_0x0090
            com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r9.getTimeLine()     // Catch:{ all -> 0x00a5 }
            nq2.a$d r4 = r8.f293329a     // Catch:{ all -> 0x00a5 }
            android.view.ViewGroup r5 = r4.f293372q     // Catch:{ all -> 0x00a5 }
            if (r5 != 0) goto L_0x003e
            android.view.ViewStub r5 = r4.f293371p     // Catch:{ all -> 0x00a5 }
            android.view.View r5 = r5.inflate()     // Catch:{ all -> 0x00a5 }
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5     // Catch:{ all -> 0x00a5 }
            r4.f293372q = r5     // Catch:{ all -> 0x00a5 }
        L_0x003e:
            com.tencent.mm.plugin.sns.ad.widget.living.b r4 = r8.f293336h     // Catch:{ all -> 0x00a5 }
            if (r4 != 0) goto L_0x004e
            com.tencent.mm.plugin.sns.ad.widget.living.b r4 = new com.tencent.mm.plugin.sns.ad.widget.living.b     // Catch:{ all -> 0x00a5 }
            nq2.a$d r5 = r8.f293329a     // Catch:{ all -> 0x00a5 }
            android.view.ViewGroup r5 = r5.f293372q     // Catch:{ all -> 0x00a5 }
            r6 = 0
            r4.<init>(r5, r6, r6)     // Catch:{ all -> 0x00a5 }
            r8.f293336h = r4     // Catch:{ all -> 0x00a5 }
        L_0x004e:
            if (r2 == 0) goto L_0x00c0
            com.tencent.mm.plugin.sns.ad.widget.living.b r4 = r8.f293336h     // Catch:{ all -> 0x00a5 }
            if (r4 == 0) goto L_0x00c0
            com.tencent.mm.plugin.sns.storage.ADXml r4 = r9.getAdXml()     // Catch:{ all -> 0x00a5 }
            co2.n r4 = r4.adLiveInfo     // Catch:{ all -> 0x00a5 }
            java.lang.String r5 = r2.f283893Id     // Catch:{ all -> 0x00a5 }
            int r6 = r4.f264555a     // Catch:{ all -> 0x00a5 }
            int r5 = com.tencent.p014mm.plugin.sns.p104ad.widget.living.C94762a.m120036c(r5, r6)     // Catch:{ all -> 0x00a5 }
            com.tencent.mm.plugin.sns.ad.widget.living.b r6 = r8.f293336h     // Catch:{ all -> 0x00a5 }
            java.lang.String r7 = r2.f283893Id     // Catch:{ all -> 0x00a5 }
            r6.mo130559g(r7, r4)     // Catch:{ all -> 0x00a5 }
            com.tencent.mm.plugin.sns.ad.widget.living.b r6 = r8.f293336h     // Catch:{ all -> 0x00a5 }
            r6.mo130560h(r5)     // Catch:{ all -> 0x00a5 }
            java.lang.String r6 = r2.f283893Id     // Catch:{ all -> 0x00a5 }
            com.tencent.mm.plugin.sns.ad.widget.living.b r7 = r8.f293336h     // Catch:{ all -> 0x00a5 }
            com.tencent.p014mm.plugin.sns.p104ad.widget.living.C94762a.m120034a(r6, r7)     // Catch:{ all -> 0x00a5 }
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r8.f293331c     // Catch:{ all -> 0x00a5 }
            boolean r6 = br2.C54550e.m61296a(r6)     // Catch:{ all -> 0x00a5 }
            if (r6 != 0) goto L_0x0086
            android.content.Context r6 = r8.f293332d     // Catch:{ all -> 0x00a5 }
            cq2.d r6 = cq2.C97354d.m125367c(r6)     // Catch:{ all -> 0x00a5 }
            r6.mo136623b(r3, r9)     // Catch:{ all -> 0x00a5 }
        L_0x0086:
            boolean r9 = com.tencent.p014mm.plugin.sns.p104ad.widget.living.C94764b.m120042f(r5)     // Catch:{ all -> 0x00a5 }
            java.lang.String r2 = r2.f283893Id     // Catch:{ all -> 0x00a5 }
            r8.mo139442b(r4, r2, r9)     // Catch:{ all -> 0x00a5 }
            goto L_0x00c0
        L_0x0090:
            nq2.a$d r9 = r8.f293329a     // Catch:{ all -> 0x00a5 }
            android.view.ViewGroup r9 = r9.f293372q     // Catch:{ all -> 0x00a5 }
            r2 = 8
            if (r9 == 0) goto L_0x009b
            r9.setVisibility(r2)     // Catch:{ all -> 0x00a5 }
        L_0x009b:
            nq2.a$d r9 = r8.f293329a     // Catch:{ all -> 0x00a5 }
            com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper r9 = r9.f293374s     // Catch:{ all -> 0x00a5 }
            if (r9 == 0) goto L_0x00c0
            r9.setVisibility(r2)     // Catch:{ all -> 0x00a5 }
            goto L_0x00c0
        L_0x00a5:
            r9 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "fillLivingViewInfo, exp="
            r2.append(r3)
            java.lang.String r9 = android.util.Log.getStackTraceString(r9)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            java.lang.String r2 = "FullCardAdWrapper"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r9)
        L_0x00c0:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nq2.C100151a.mo139444d(com.tencent.mm.plugin.sns.storage.SnsInfo):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:154:0x0772  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x03d2  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo139445e(te3.C101804kv2 r36, com.tencent.p014mm.plugin.sns.model.C94901o r37, int r38, boolean r39) {
        /*
            r35 = this;
            r1 = r35
            r8 = r36
            r0 = r37
            r9 = r39
            java.lang.String r10 = "fillMediaContent"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r11)
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r1.f293331c
            long r2 = r2.field_snsId
            com.tencent.mm.protocal.protobuf.TimeLineObject r4 = r1.f293334f
            te3.j00 r4 = r4.ContentObj
            int r4 = r4.f298424e
            r5 = 4
            r12 = 1
            r13 = 0
            if (r4 != r12) goto L_0x0091
            nq2.a$d r2 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.MaskImageView r2 = r2.f293358c
            r2.setVisibility(r13)
            nq2.a$d r2 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.m2 r2 = r2.f293368m
            android.view.View r2 = r2.f280501d
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r3.mo10233c(r4)
            java.lang.Object[] r15 = r3.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/sns/ad/timeline/item/fullcard/FullCardAdWrapper"
            java.lang.String r17 = "fillMediaContent"
            java.lang.String r18 = "(Lcom/tencent/mm/protocal/protobuf/MediaObj;Lcom/tencent/mm/plugin/sns/model/LazyerImageLoader2;IZ)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r2
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r3 = r3.mo10231a(r13)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r15 = "com/tencent/mm/plugin/sns/ad/timeline/item/fullcard/FullCardAdWrapper"
            java.lang.String r16 = "fillMediaContent"
            java.lang.String r17 = "(Lcom/tencent/mm/protocal/protobuf/MediaObj;Lcom/tencent/mm/plugin/sns/model/LazyerImageLoader2;IZ)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            nq2.a$d r2 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.MaskImageView r4 = r2.f293358c
            r5 = -1
            android.content.Context r2 = r1.f293332d
            int r6 = r2.hashCode()
            com.tencent.mm.storage.o3 r7 = com.tencent.p014mm.storage.C96983o3.m124651c()
            com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r1.f293334f
            int r2 = r2.CreateTime
            r7.f284145b = r2
            r2 = r37
            r3 = r36
            r2.mo131114e0(r3, r4, r5, r6, r7)
            nq2.a$d r0 = r1.f293329a
            nq2.a$c r0 = r0.f293355K
            r0.f293341b = r13
        L_0x008d:
            r24 = r10
            goto L_0x076a
        L_0x0091:
            r6 = 15
            r14 = 5
            if (r4 == r6) goto L_0x0098
            if (r4 != r14) goto L_0x008d
        L_0x0098:
            nq2.a$d r4 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.m2 r4 = r4.f293368m
            com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView r4 = r4.f280504g
            r4.setVisibility(r13)
            nq2.a$d r4 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.m2 r4 = r4.f293368m
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r4 = r4.f280502e
            r6 = 8
            r4.setVisibility(r6)
            com.tencent.mm.plugin.sns.storage.ADXml$g r4 = r1.f293330b
            if (r4 == 0) goto L_0x00c4
            java.lang.String r4 = r4.f275691g
            nq2.a$d r7 = r1.f293329a
            android.widget.ImageView r7 = r7.f293366k
            jq2.C60890q.m71305d(r4, r7)
            com.tencent.mm.plugin.sns.storage.ADXml$g r4 = r1.f293330b
            java.lang.String r4 = r4.f275693i
            nq2.a$d r7 = r1.f293329a
            android.widget.ImageView r7 = r7.f293367l
            jq2.C60890q.m71305d(r4, r7)
        L_0x00c4:
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r1.f293331c
            lo2.C99556n.m129940c(r4, r8)
            long r15 = java.lang.System.nanoTime()
            boolean r4 = r0.mo131141x(r8)
            long r17 = java.lang.System.nanoTime()
            long r14 = r17 - r15
            r7 = 2
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r4)
            r5[r13] = r17
            java.lang.Long r17 = java.lang.Long.valueOf(r14)
            r5[r12] = r17
            java.lang.String r7 = "FullCardAdWrapper"
            java.lang.String r12 = "isMediaSightExist %b duration %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r12, r5)
            nq2.a$d r5 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.m2 r12 = r5.f293368m
            if (r4 != 0) goto L_0x017a
            boolean r4 = r0.mo131140w(r8)
            if (r4 == 0) goto L_0x010d
            android.widget.ImageView r4 = r12.f280506i
            r4.setVisibility(r6)
            com.tencent.mm.ui.widget.MMPinProgressBtn r4 = r12.f280507j
            r4.setVisibility(r13)
            com.tencent.mm.ui.widget.MMPinProgressBtn r4 = r12.f280507j
            r4.mo153891a()
        L_0x0109:
            r24 = r10
            goto L_0x02f4
        L_0x010d:
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r1.f293331c
            int r4 = r0.mo131133p(r4)
            r5 = 5
            if (r4 != r5) goto L_0x0129
            r0.mo131097Q(r8)
            android.widget.ImageView r4 = r12.f280506i
            r4.setVisibility(r6)
            com.tencent.mm.ui.widget.MMPinProgressBtn r4 = r12.f280507j
            r4.setVisibility(r13)
            com.tencent.mm.ui.widget.MMPinProgressBtn r4 = r12.f280507j
            r4.mo153891a()
            goto L_0x0109
        L_0x0129:
            boolean r4 = r0.mo131137t(r8)
            if (r4 == 0) goto L_0x0142
            com.tencent.mm.ui.widget.MMPinProgressBtn r4 = r12.f280507j
            r4.setVisibility(r6)
            android.widget.ImageView r4 = r12.f280506i
            r5 = 2131756959(0x7f10079f, float:1.914484E38)
            r4.setImageResource(r5)
            android.widget.ImageView r4 = r12.f280506i
            r4.setVisibility(r13)
            goto L_0x0109
        L_0x0142:
            r0.mo131098R(r8)
            android.widget.ImageView r4 = r12.f280506i
            r4.setVisibility(r13)
            com.tencent.mm.ui.widget.MMPinProgressBtn r4 = r12.f280507j
            r4.setVisibility(r6)
            android.widget.ImageView r4 = r12.f280506i
            android.content.Context r5 = r1.f293332d
            r6 = 2131756957(0x7f10079d, float:1.9144836E38)
            android.graphics.drawable.Drawable r5 = kg3.C76577a.m92158i(r5, r6)
            r4.setImageDrawable(r5)
            android.widget.ImageView r4 = r12.f280506i
            android.content.Context r5 = r1.f293332d
            r6 = 2131834031(0x7f1134af, float:1.930116E38)
            java.lang.String r5 = r5.getString(r6)
            r4.setContentDescription(r5)
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r1.f293331c
            int r4 = r0.mo131133p(r4)
            r5 = 4
            if (r4 != r5) goto L_0x0109
            android.widget.TextView r4 = r12.f280508k
            r4.setVisibility(r13)
            goto L_0x0109
        L_0x017a:
            boolean r4 = r0.mo131143z(r8)
            if (r4 == 0) goto L_0x01ab
            android.widget.ImageView r4 = r12.f280506i
            r4.setVisibility(r13)
            com.tencent.mm.ui.widget.MMPinProgressBtn r4 = r12.f280507j
            r5 = 8
            r4.setVisibility(r5)
            android.widget.ImageView r4 = r12.f280506i
            android.content.Context r5 = r1.f293332d
            r6 = 2131756957(0x7f10079d, float:1.9144836E38)
            android.graphics.drawable.Drawable r5 = kg3.C76577a.m92158i(r5, r6)
            r4.setImageDrawable(r5)
            android.widget.ImageView r4 = r12.f280506i
            android.content.Context r5 = r1.f293332d
            r6 = 2131834031(0x7f1134af, float:1.930116E38)
            java.lang.String r5 = r5.getString(r6)
            r4.setContentDescription(r5)
        L_0x01a8:
            r13 = 2
            goto L_0x0242
        L_0x01ab:
            boolean r4 = r0.mo131139v(r8)
            if (r4 == 0) goto L_0x01be
            android.widget.ImageView r4 = r12.f280506i
            r5 = 8
            r4.setVisibility(r5)
            com.tencent.mm.ui.widget.MMPinProgressBtn r4 = r12.f280507j
            r4.setVisibility(r5)
            goto L_0x01a8
        L_0x01be:
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r1.f293331c
            int r4 = r0.mo131133p(r4)
            r5 = 5
            if (r4 > r5) goto L_0x0215
            nq2.a$d r4 = r1.f293329a
            nq2.a$c r5 = r4.f293355K
            int r6 = r5.f293340a
            r13 = 1
            if (r6 == r13) goto L_0x0201
            r13 = 2
            if (r6 != r13) goto L_0x01d4
            goto L_0x0202
        L_0x01d4:
            boolean r4 = r5.f293341b
            if (r4 != 0) goto L_0x0242
            nq2.a$e r4 = r1.f293337i
            if (r4 == 0) goto L_0x0242
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r1.f293331c
            if (r4 == 0) goto L_0x01f6
            boolean r4 = r4.isBreakFrameAd()
            if (r4 != 0) goto L_0x0242
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r1.f293331c
            boolean r4 = r4.isAdIpInteractVideo()
            if (r4 != 0) goto L_0x0242
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r1.f293331c
            boolean r4 = br2.C54550e.m61296a(r4)
            if (r4 != 0) goto L_0x0242
        L_0x01f6:
            java.lang.String r4 = "fillItem, showPlayBtn"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
            nq2.a$e r4 = r1.f293337i
            r4.mo133437c()
            goto L_0x0242
        L_0x0201:
            r13 = 2
        L_0x0202:
            com.tencent.mm.plugin.sns.ui.m2 r4 = r4.f293368m
            android.widget.ImageView r4 = r4.f280506i
            r5 = 8
            r4.setVisibility(r5)
            nq2.a$d r4 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.m2 r4 = r4.f293368m
            com.tencent.mm.ui.widget.MMPinProgressBtn r4 = r4.f280507j
            r4.setVisibility(r5)
            goto L_0x0242
        L_0x0215:
            r5 = 8
            r13 = 2
            r0.mo131098R(r8)
            android.widget.ImageView r4 = r12.f280506i
            r6 = 0
            r4.setVisibility(r6)
            com.tencent.mm.ui.widget.MMPinProgressBtn r4 = r12.f280507j
            r4.setVisibility(r5)
            android.widget.ImageView r4 = r12.f280506i
            android.content.Context r5 = r1.f293332d
            r6 = 2131756957(0x7f10079d, float:1.9144836E38)
            android.graphics.drawable.Drawable r5 = kg3.C76577a.m92158i(r5, r6)
            r4.setImageDrawable(r5)
            android.widget.ImageView r4 = r12.f280506i
            android.content.Context r5 = r1.f293332d
            r6 = 2131834031(0x7f1134af, float:1.930116E38)
            java.lang.String r5 = r5.getString(r6)
            r4.setContentDescription(r5)
        L_0x0242:
            if (r9 == 0) goto L_0x0255
            nq2.a$d r4 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r4 = r4.f293376u
            if (r4 == 0) goto L_0x0251
            boolean r4 = r4.mo132368t()
            r24 = r10
            goto L_0x0282
        L_0x0251:
            r24 = r10
            r4 = 0
            goto L_0x0282
        L_0x0255:
            com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView r4 = r12.f280504g
            r4.getClass()
            java.lang.String r5 = "isError"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r24 = r10
            java.lang.String r10 = "isError="
            r13.append(r10)
            boolean r10 = r4.f277122o
            r13.append(r10)
            java.lang.String r10 = r13.toString()
            java.lang.String r13 = "MicroMsg.SnsAdTimelineVideoView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r10)
            boolean r4 = r4.f277122o
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
        L_0x0282:
            if (r4 == 0) goto L_0x02f4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "play video error "
            r4.append(r5)
            java.lang.String r5 = r8.f298689d
            r4.append(r5)
            java.lang.String r5 = " "
            r4.append(r5)
            java.lang.String r6 = r8.f298692g
            r4.append(r6)
            r4.append(r5)
            java.lang.String r6 = r8.f298694i
            r4.append(r6)
            r4.append(r5)
            r5 = r38
            r4.append(r5)
            java.lang.String r5 = ", online="
            r4.append(r5)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r4)
            r0.mo131098R(r8)
            android.widget.ImageView r4 = r12.f280506i
            r5 = 0
            r4.setVisibility(r5)
            com.tencent.mm.ui.widget.MMPinProgressBtn r4 = r12.f280507j
            r5 = 8
            r4.setVisibility(r5)
            android.widget.ImageView r4 = r12.f280506i
            android.content.Context r5 = r1.f293332d
            r6 = 2131756957(0x7f10079d, float:1.9144836E38)
            android.graphics.drawable.Drawable r5 = kg3.C76577a.m92158i(r5, r6)
            r4.setImageDrawable(r5)
            android.widget.ImageView r4 = r12.f280506i
            android.content.Context r5 = r1.f293332d
            r6 = 2131834031(0x7f1134af, float:1.930116E38)
            java.lang.String r5 = r5.getString(r6)
            r4.setContentDescription(r5)
            if (r9 != 0) goto L_0x02f4
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 18
            r6 = 1697(0x6a1, float:2.378E-42)
            r4.mo175911u(r6, r5)
        L_0x02f4:
            nq2.a$d r4 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.MaskImageView r4 = r4.f293358c
            r5 = 4
            r4.setVisibility(r5)
            com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView r4 = r12.f280504g
            r4.setTag(r12)
            com.tencent.mm.plugin.sns.storage.ADXml$g r4 = r1.f293330b
            nq2.a$d r5 = r1.f293329a
            android.widget.ImageView r6 = r5.f293366k
            android.widget.ImageView r5 = r5.f293367l
            r10 = 0
            jq2.C60890q.m71304c(r4, r10, r6, r5)
            java.lang.String r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            java.lang.String r5 = r8.f298689d
            java.lang.String r4 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r4, r5)
            java.lang.String r5 = vr2.C102236a0.m134725T(r36)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            float r5 = r8.f298684R
            int r5 = (int) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "media videoDuration="
            r6.append(r10)
            r6.append(r14)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r4 == 0) goto L_0x0352
            jp2.o r4 = r1.f293333e
            r6 = 1
            r4.mo138292G(r2, r5, r6)
            lo2.C99556n.m129942e()
            goto L_0x0358
        L_0x0352:
            jp2.o r4 = r1.f293333e
            r6 = 0
            r4.mo138292G(r2, r5, r6)
        L_0x0358:
            com.tencent.mm.plugin.sns.model.o r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r1.f293331c
            int r4 = r4.mo131133p(r5)
            r10 = 5
            if (r4 != r10) goto L_0x0367
            r4 = 1
            goto L_0x0368
        L_0x0367:
            r4 = 0
        L_0x0368:
            jp2.o r5 = r1.f293333e
            r6 = 1
            r5.mo138290E(r2, r4, r6)
            r13 = 0
            r14 = 3
            if (r9 == 0) goto L_0x056a
            nq2.a$d r0 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r0.f293376u
            if (r0 != 0) goto L_0x0380
            java.lang.String r0 = "new onlineVideoView for init"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
        L_0x037e:
            r0 = 1
            goto L_0x03d0
        L_0x0380:
            boolean r0 = r0.f281254N1
            if (r0 == 0) goto L_0x0394
            java.lang.String r0 = "new onlineVideoView for waitDestroy"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 20
            r3 = 1697(0x6a1, float:2.378E-42)
            r0.mo175911u(r3, r2)
            goto L_0x037e
        L_0x0394:
            r3 = 1697(0x6a1, float:2.378E-42)
            nq2.a$d r0 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r0.f293376u
            boolean r0 = r0.mo132368t()
            if (r0 == 0) goto L_0x03ae
            java.lang.String r0 = "new onlineVideoView for hasError"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 19
            r0.mo175911u(r3, r2)
            goto L_0x037e
        L_0x03ae:
            nq2.a$d r0 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r0.f293376u
            java.lang.String r0 = r0.getLocalId()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x03cf
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r1.f293331c
            java.lang.String r2 = r2.getLocalid()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x03cf
            java.lang.String r0 = "video path change , new video"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            goto L_0x037e
        L_0x03cf:
            r0 = 0
        L_0x03d0:
            if (r0 == 0) goto L_0x04c8
            long r2 = java.lang.System.currentTimeMillis()
            nq2.a$d r0 = r1.f293329a
            android.view.ViewGroup r0 = r0.f293375t
            rq2.C101432s.m133121c(r0)
            nq2.a$d r0 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r0.f293376u
            if (r0 == 0) goto L_0x0411
            java.lang.String r0 = "needNewVideoView, clear old"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)     // Catch:{ all -> 0x03f8 }
            nq2.a$d r0 = r1.f293329a     // Catch:{ all -> 0x03f8 }
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r0.f293376u     // Catch:{ all -> 0x03f8 }
            r0.mo132356s()     // Catch:{ all -> 0x03f8 }
            nq2.a$d r0 = r1.f293329a     // Catch:{ all -> 0x03f8 }
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r0.f293376u     // Catch:{ all -> 0x03f8 }
            r0.setVideoCallback(r13)     // Catch:{ all -> 0x03f8 }
            goto L_0x0411
        L_0x03f8:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "clear onlineVideo exp="
            r4.append(r5)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
        L_0x0411:
            nq2.a$d r0 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r4 = new com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView
            android.content.Context r5 = r1.f293332d
            r6 = 1
            r4.<init>((android.content.Context) r5, (boolean) r6)
            r0.f293376u = r4
            nq2.a$d r0 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r0.f293376u
            r4 = 0
            r0.mo132372y(r4)
            nq2.a$d r0 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r0.f293376u
            com.tencent.mm.pluginsdk.ui.a$e r4 = com.tencent.p014mm.pluginsdk.p133ui.C96814a.C96817e.COVER
            r0.setVideoScaleType(r4)
            nq2.a$d r0 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r0.f293376u
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_CROP
            r0.setThumbViewScaleType(r4)
            nq2.a$d r0 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r0.f293376u
            r0.getClass()
            java.lang.String r4 = "alwaysShowThumb"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.OnlineVideoView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            r6 = 1
            r0.f277148B1 = r6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            nq2.a$d r0 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r0.f293376u
            r0.mo132370w()
            nq2.a$d r0 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r0.f293376u
            r4 = -1
            rq2.C101432s.m133131m(r0, r4, r4)
            nq2.a$d r0 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r0.f293376u
            r5 = 1
            rq2.C101432s.m133132n(r0, r5)
            nq2.a$d r0 = r1.f293329a
            android.view.ViewGroup r5 = r0.f293375t
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r0.f293376u
            rq2.C101432s.m133120b(r5, r0, r4)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "onlineVideoView, inner VideoViewType="
            r0.append(r2)
            java.lang.String r2 = "getInnerVideoViewType"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r11)
            nq2.a$d r3 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r3 = r3.f293376u
            android.view.View r3 = r3.getInnerVideoView()
            boolean r6 = r3 instanceof com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView
            if (r6 == 0) goto L_0x0491
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r11)
            r14 = 1
            goto L_0x04a6
        L_0x0491:
            boolean r6 = r3 instanceof com.tencent.p014mm.pluginsdk.p133ui.tools.VideoTextureView
            if (r6 == 0) goto L_0x049a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r11)
            r14 = 2
            goto L_0x04a6
        L_0x049a:
            boolean r3 = r3 instanceof com.tencent.p014mm.plugin.thumbplayer.view.ThumbPlayerVideoView
            if (r3 == 0) goto L_0x04a2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r11)
            goto L_0x04a6
        L_0x04a2:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r11)
            r14 = 0
        L_0x04a6:
            r0.append(r14)
            java.lang.String r2 = ", hash="
            r0.append(r2)
            nq2.a$d r2 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r2 = r2.f293376u
            int r2 = r2.hashCode()
            r0.append(r2)
            java.lang.String r2 = ", cost="
            r0.append(r2)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
        L_0x04c8:
            nq2.a$d r0 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r0.f293376u
            r2 = 1
            r0.setMute(r2)
            nq2.a$d r0 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r0.f293376u
            r2 = 0
            r0.setThumbViewVisibility(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "onlineVideoView setVideoData, hash="
            r0.append(r2)
            nq2.a$d r2 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r2 = r2.f293376u
            int r2 = r2.hashCode()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            nq2.a$d r0 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r0.f293376u
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r1.f293331c
            java.lang.String r2 = r2.getLocalid()
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = r1.f293331c
            com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r3.getTimeLine()
            int r3 = r3.CreateTime
            r0.mo132324P(r8, r2, r3)
            nq2.a$d r0 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r0.f293376u
            com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r1.f293334f
            java.lang.String r2 = r2.f283893Id
            r0.f281251K1 = r2
            r0.mo132334a()
            nq2.a$d r0 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.m2 r0 = r0.f293368m
            android.view.View r2 = r0.f280501d
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.mo10233c(r3)
            java.lang.Object[] r14 = r0.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/sns/ad/timeline/item/fullcard/FullCardAdWrapper"
            java.lang.String r16 = "fillMediaContent"
            java.lang.String r17 = "(Lcom/tencent/mm/protocal/protobuf/MediaObj;Lcom/tencent/mm/plugin/sns/model/LazyerImageLoader2;IZ)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r2
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            r3 = 0
            java.lang.Object r0 = r0.mo10231a(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.setVisibility(r0)
            java.lang.String r3 = "com/tencent/mm/plugin/sns/ad/timeline/item/fullcard/FullCardAdWrapper"
            java.lang.String r4 = "fillMediaContent"
            java.lang.String r5 = "(Lcom/tencent/mm/protocal/protobuf/MediaObj;Lcom/tencent/mm/plugin/sns/model/LazyerImageLoader2;IZ)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            nq2.a$d r0 = r1.f293329a
            android.view.ViewGroup r0 = r0.f293375t
            r2 = 0
            r0.setVisibility(r2)
            goto L_0x0751
        L_0x056a:
            r2 = 0
            nq2.a$d r3 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.m2 r3 = r3.f293368m
            android.view.View r3 = r3.f280501d
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r4.mo10233c(r5)
            java.lang.Object[] r26 = r4.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/sns/ad/timeline/item/fullcard/FullCardAdWrapper"
            java.lang.String r28 = "fillMediaContent"
            java.lang.String r29 = "(Lcom/tencent/mm/protocal/protobuf/MediaObj;Lcom/tencent/mm/plugin/sns/model/LazyerImageLoader2;IZ)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r3
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r2 = 0
            java.lang.Object r4 = r4.mo10231a(r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r2 = r4.intValue()
            r3.setVisibility(r2)
            java.lang.String r26 = "com/tencent/mm/plugin/sns/ad/timeline/item/fullcard/FullCardAdWrapper"
            java.lang.String r27 = "fillMediaContent"
            java.lang.String r28 = "(Lcom/tencent/mm/protocal/protobuf/MediaObj;Lcom/tencent/mm/plugin/sns/model/LazyerImageLoader2;IZ)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
            nq2.a$d r2 = r1.f293329a
            android.view.ViewGroup r2 = r2.f293375t
            r3 = 8
            r2.setVisibility(r3)
            com.tencent.mm.plugin.sns.storage.SnsInfo r15 = r1.f293331c
            com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView r7 = r12.f280504g
            com.tencent.mm.storage.o3 r6 = com.tencent.p014mm.storage.C96983o3.m124651c()
            com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r1.f293334f
            int r2 = r2.CreateTime
            r6.f284145b = r2
            java.lang.String r5 = "readySnsSightOffline"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r11)
            if (r15 == 0) goto L_0x05f3
            boolean r2 = r15.isBreakFrameAd()
            if (r2 != 0) goto L_0x05de
            boolean r2 = r15.isAdIpInteractVideo()
            if (r2 == 0) goto L_0x05f3
        L_0x05de:
            ou2.g r2 = r1.f293335g
            if (r2 == 0) goto L_0x05f3
            r3 = r15
            r4 = r37
            r0 = r5
            r5 = r36
            r8 = r6
            r6 = r7
            r7 = r8
            r2.mo139964c(r3, r4, r5, r6, r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r11)
            goto L_0x0751
        L_0x05f3:
            r34 = r6
            r6 = r5
            r5 = r34
            android.content.Context r2 = r1.f293332d
            int r16 = r2.hashCode()
            java.lang.String r4 = "setSnsSight"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            java.lang.String r2 = r8.f298689d
            if (r2 == 0) goto L_0x0745
            java.lang.String r10 = ""
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L_0x0614
            goto L_0x0745
        L_0x0614:
            java.lang.String r2 = r8.f298689d
            r10 = 1
            java.lang.String r2 = vr2.C102236a0.m134780y(r10, r2)
            java.lang.String r10 = r15.getSnsId()
            r20 = 0
            r38 = r2
            r2 = r37
            r13 = r3
            r3 = r10
            r10 = r4
            r4 = r36
            r22 = r5
            r5 = r38
            r33 = r6
            r6 = r22
            r23 = r7
            r17 = 2
            r7 = r20
            r2.mo131088H(r3, r4, r5, r6, r7)
            r5 = 1
            r6 = -1
            r3 = r23
            r4 = r38
            r7 = r16
            r2.mo131128l0(r3, r4, r5, r6, r7)
            java.lang.String r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            java.lang.String r3 = r8.f298689d
            java.lang.String r2 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r2, r3)
            java.lang.String r3 = vr2.C102236a0.m134729X(r36)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r4 != 0) goto L_0x068b
            vr2.v r4 = new vr2.v
            r4.<init>((te3.C101804kv2) r8)
            r5 = 1
            r4.mo141832d(r5)
            java.lang.String r5 = r8.f298689d
            r4.mo141833e(r5)
            com.tencent.mm.plugin.sns.model.e r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Vx0()
            int r6 = r8.f298690e
            r7 = 6
            if (r6 != r7) goto L_0x0684
            r7 = r22
            r6 = 5
            goto L_0x0687
        L_0x0684:
            r7 = r22
            r6 = 1
        L_0x0687:
            r5.mo130979d(r8, r6, r4, r7)
            goto L_0x068d
        L_0x068b:
            r7 = r22
        L_0x068d:
            r4 = 1
            java.lang.String r5 = r0.mo131083C(r15, r8, r7, r4)
            java.lang.Object[] r6 = new java.lang.Object[r14]
            r14 = r38
            r15 = 0
            r6[r15] = r14
            r6[r4] = r5
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r6[r17] = r4
            java.lang.String r4 = "MicroMsg.LazyerImageLoader2"
            java.lang.String r15 = "SnsAdTimelineVideoView, setsight %s sightPath %s isAd %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r15, r6)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r6 != 0) goto L_0x06ec
            boolean r6 = r0.mo131143z(r8)
            if (r6 != 0) goto L_0x06ec
            java.lang.String r0 = r23.getVideoPath()
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x06d9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r0)
            r2 = r23
            r2.setThumbBmp(r0)
            r3 = 1
            r2.mo134053x(r3)
            goto L_0x06db
        L_0x06d9:
            r2 = r23
        L_0x06db:
            r2.setVideoPath(r5)
            java.lang.String r0 = r8.f298689d
            ks2.C99181f.m129208m(r0)
            java.lang.String r0 = r8.f298689d
            ks2.C99181f.m129209o(r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r13)
            goto L_0x074c
        L_0x06ec:
            r2 = r23
            r3 = 1
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r15 = 0
            r6[r15] = r5
            java.lang.String r5 = "SnsAdTimelineVideoView, sightPath %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r6)
            r5 = 0
            r2.setVideoPath(r5)
            r2.mo134051v()
            java.lang.String r6 = r8.f298689d
            com.tencent.mm.memory.n r6 = r0.mo131121i(r14, r6)
            boolean r16 = vr2.C102236a0.m134742f(r6)
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r16)
            r5[r15] = r3
            java.lang.String r3 = "SnsAdTimelineVideoView, setsight thumb  %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r4, r3, r5)
            if (r16 != 0) goto L_0x0733
            r3 = 0
            r2.setThumbBmp(r3)
            java.util.Set<java.lang.String> r2 = r0.f275018x
            java.util.HashSet r2 = (java.util.HashSet) r2
            boolean r2 = r2.contains(r14)
            if (r2 == 0) goto L_0x072b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r13)
            goto L_0x074c
        L_0x072b:
            r2 = 1
            r0.mo131084D(r2, r8, r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r13)
            goto L_0x074c
        L_0x0733:
            r3 = 0
            r0.mo131094N(r2, r14, r6, r3)
            java.lang.String r0 = r8.f298689d
            ks2.C99181f.m129208m(r0)
            java.lang.String r0 = r8.f298689d
            ks2.C99181f.m129209o(r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r13)
            goto L_0x074c
        L_0x0745:
            r13 = r3
            r10 = r4
            r33 = r6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r13)
        L_0x074c:
            r0 = r33
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r11)
        L_0x0751:
            if (r9 == 0) goto L_0x0760
            nq2.a$d r0 = r1.f293329a
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r0.f293376u
            nq2.a$a r2 = new nq2.a$a
            r2.<init>()
            r0.setVideoCallback(r2)
            goto L_0x076a
        L_0x0760:
            com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView r0 = r12.f280504g
            nq2.a$b r2 = new nq2.a$b
            r2.<init>()
            r0.setVideoCallback(r2)
        L_0x076a:
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r1.f293331c
            boolean r0 = br2.C54550e.m61296a(r0)
            if (r0 != 0) goto L_0x0777
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r1.f293331c
            r1.mo139444d(r0)
        L_0x0777:
            r2 = r24
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nq2.C100151a.mo139445e(te3.kv2, com.tencent.mm.plugin.sns.model.o, int, boolean):void");
    }

    /* renamed from: f */
    public void mo139446f(C100155d dVar) {
        SnsMethodCalculate.markStartTimeMs("initRootView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        if (dVar != null) {
            try {
                View view = dVar.f293377v;
                if (view != null) {
                    dVar.f293380y = (SnsAvatarImageView) view.findViewById(C0966R.C0970id.f5678lm);
                    dVar.f293381z = (ViewGroup) dVar.f293377v.findViewById(C0966R.C0970id.a7q);
                    dVar.f293345A = (LinearLayout) dVar.f293377v.findViewById(C0966R.C0970id.lvp);
                    dVar.f293346B = (LinearLayout) dVar.f293377v.findViewById(C0966R.C0970id.jwn);
                    dVar.f293351G = (ViewStub) dVar.f293377v.findViewById(C0966R.C0970id.lwv);
                    dVar.f293347C = (ViewStub) dVar.f293377v.findViewById(C0966R.C0970id.lwu);
                    dVar.f293349E = (ViewStub) dVar.f293377v.findViewById(C0966R.C0970id.o3o);
                }
            } catch (Throwable unused) {
            }
        }
        SnsMethodCalculate.markEndTimeMs("initRootView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
    }

    /* renamed from: h */
    public void mo139447h(boolean z, boolean z2) {
        C100485g gVar;
        SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        SnsInfo snsInfo = this.f293331c;
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        } else if (C54550e.m61296a(snsInfo)) {
            SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        } else {
            SnsInfo snsInfo2 = this.f293331c;
            if (snsInfo2 == null || ((!snsInfo2.isBreakFrameAd() && !this.f293331c.isAdIpInteractVideo()) || (gVar = this.f293335g) == null)) {
                Log.m105924i("FullCardAdWrapper", "pausePlay, onlineVideo=" + z);
                if (z) {
                    SnsTimelineVideoView snsTimelineVideoView = this.f293329a.f293376u;
                    if (snsTimelineVideoView != null && snsTimelineVideoView.mo132371x()) {
                        this.f293329a.f293376u.mo132317G();
                    }
                } else {
                    this.f293329a.f293368m.f280504g.setShouldPlayWhenPrepared(false);
                    SnsAdTimelineVideoView snsAdTimelineVideoView = this.f293329a.f293368m.f280504g;
                    snsAdTimelineVideoView.getClass();
                    SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
                    Log.m105924i("MicroMsg.SnsAdTimelineVideoView", "pause");
                    snsAdTimelineVideoView.mo132300r();
                    SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
                }
                SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
                return;
            }
            gVar.mo139965d(z, z2);
            SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        }
    }

    /* renamed from: i */
    public void mo139448i(boolean z) {
        C100485g gVar;
        SnsMethodCalculate.markStartTimeMs("restartPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        SnsInfo snsInfo = this.f293331c;
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("restartPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        } else if (C54550e.m61296a(snsInfo)) {
            SnsMethodCalculate.markEndTimeMs("restartPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        } else {
            SnsInfo snsInfo2 = this.f293331c;
            if (snsInfo2 == null || ((!snsInfo2.isBreakFrameAd() && !this.f293331c.isAdIpInteractVideo()) || (gVar = this.f293335g) == null)) {
                Log.m105924i("FullCardAdWrapper", "restartPlay, onlineVideo=" + z);
                if (z) {
                    SnsTimelineVideoView snsTimelineVideoView = this.f293329a.f293376u;
                    if (snsTimelineVideoView != null) {
                        snsTimelineVideoView.mo132322N(0, true);
                    }
                } else {
                    this.f293329a.f293368m.f280504g.mo134052w();
                }
                SnsMethodCalculate.markEndTimeMs("restartPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
                return;
            }
            gVar.mo139963b(z);
            SnsMethodCalculate.markEndTimeMs("restartPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        }
    }

    /* renamed from: j */
    public void mo139449j(View view, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("setViewLayoutParams", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams == null || (layoutParams.width == i && layoutParams.height == i2))) {
            layoutParams.width = i;
            layoutParams.height = i2;
            view.setLayoutParams(layoutParams);
        }
        SnsMethodCalculate.markEndTimeMs("setViewLayoutParams", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
    }

    /* renamed from: k */
    public void mo139450k(boolean z) {
        C100485g gVar;
        SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        SnsInfo snsInfo = this.f293331c;
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        } else if (C54550e.m61296a(snsInfo)) {
            SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        } else {
            SnsInfo snsInfo2 = this.f293331c;
            if (snsInfo2 == null || ((!snsInfo2.isBreakFrameAd() && !this.f293331c.isAdIpInteractVideo()) || (gVar = this.f293335g) == null)) {
                Log.m105924i("FullCardAdWrapper", "startPlay, onlineVideo=" + z);
                if (z) {
                    SnsTimelineVideoView snsTimelineVideoView = this.f293329a.f293376u;
                    if (snsTimelineVideoView != null) {
                        if (snsTimelineVideoView.mo132371x() || this.f293329a.f293376u.mo133919h0()) {
                            Log.m105924i("FullCardAdWrapper", "onlineVideo, resumePlay, hash=" + hashCode());
                            this.f293329a.f293376u.mo130404K();
                        } else {
                            Log.m105924i("FullCardAdWrapper", "onlineVideo, onResume, hash=" + hashCode());
                            this.f293329a.f293376u.mo130403E();
                        }
                    }
                } else {
                    this.f293329a.f293368m.f280504g.setShouldPlayWhenPrepared(true);
                    this.f293329a.f293368m.f280504g.mo132296n();
                }
                SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
                return;
            }
            gVar.mo139962a(z);
            SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        }
    }
}
