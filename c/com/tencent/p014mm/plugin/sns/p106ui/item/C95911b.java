package com.tencent.p014mm.plugin.sns.p106ui.item;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C0125s;
import br2.C54550e;
import bv2.C92312b;
import bv2.C92313c;
import co2.C55058p;
import co2.C92445n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.C85878m2;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.p136ui.widget.QImageView;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p104ad.widget.countdown.PromotionBarLayout;
import com.tencent.p014mm.plugin.sns.p104ad.widget.living.AdLivingStreamContainer;
import com.tencent.p014mm.plugin.sns.p104ad.widget.living.C94762a;
import com.tencent.p014mm.plugin.sns.p104ad.widget.living.C94764b;
import com.tencent.p014mm.plugin.sns.p104ad.widget.living.FinderLivingAnimWrapper;
import com.tencent.p014mm.plugin.sns.p104ad.widget.living.LivingDescBarLayout;
import com.tencent.p014mm.plugin.sns.p106ui.AsyncNormalTextView;
import com.tencent.p014mm.plugin.sns.p106ui.BaseTimeLine;
import com.tencent.p014mm.plugin.sns.p106ui.C96066m2;
import com.tencent.p014mm.plugin.sns.p106ui.C96177r2;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.C96319y2;
import com.tencent.p014mm.plugin.sns.p106ui.MaskImageView;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.video.C96254a;
import com.tencent.p014mm.plugin.sns.p106ui.video.SnsTimelineVideoView;
import com.tencent.p014mm.plugin.sns.p106ui.widget.AdViewComponent;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsCardAdTagListView;
import com.tencent.p014mm.plugin.sns.p106ui.widget.p804ad.AdRoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.smiley.C96963p0;
import com.tencent.p014mm.storage.C96983o3;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tav.core.AssetExtension;
import com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol;
import cq2.C97354d;
import j20.C117292a;
import java.util.ArrayList;
import jp2.C98957g;
import jp2.C98963o;
import jq2.C60893t;
import jq2.C99008w;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lo2.C88617x;
import lo2.C99542h0;
import lo2.C99556n;
import os2.C100417r0;
import ps2.C100880k;
import ps2.C100891r;
import qq2.C101236c;
import qq2.C101237d;
import qq2.C101238e;
import rq2.C101432s;
import te3.C101789j00;
import te3.C101804kv2;
import te3.C101817mv2;
import up2.C102064e;
import vr2.C102236a0;
import vr2.C102260r;

/* renamed from: com.tencent.mm.plugin.sns.ui.item.b */
public class C95911b extends BaseTimeLineItem implements C92312b, C98957g {

    /* renamed from: A */
    public C102064e.C102069c f280020A = new C95913b();

    /* renamed from: q */
    public C95915d f280021q;

    /* renamed from: r */
    public C96177r2 f280022r;

    /* renamed from: s */
    public C96319y2 f280023s;

    /* renamed from: t */
    public C94764b f280024t;

    /* renamed from: u */
    public C60893t f280025u;

    /* renamed from: v */
    public boolean f280026v = false;

    /* renamed from: w */
    public SnsInfo f280027w;

    /* renamed from: x */
    public String f280028x = "";

    /* renamed from: y */
    public C54550e f280029y;

    /* renamed from: z */
    public AdViewComponent<SnsInfo> f280030z;

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.b$a */
    public class C95912a implements C100880k.C100881a {

        /* renamed from: a */
        public final /* synthetic */ C95915d f280031a;

        public C95912a(C95911b bVar, C95915d dVar) {
            this.f280031a = dVar;
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$2");
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$2");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$2");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$2");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            Bitmap decodeFile;
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$2");
            Log.m105925i("MiroMsg.CardAdTimeLineItem", "download img %s", str);
            if (!Util.isNullOrNil((String) this.f280031a.f280041M0.getTag(), str) && str.equals(C100891r.m132217l("adId", (String) this.f280031a.f280041M0.getTag())) && (decodeFile = BitmapUtil.decodeFile(str, (BitmapFactory.Options) null)) != null) {
                View view = this.f280031a.f280041M0;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem$2", "onDownloaded", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem$2", "onDownloaded", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f280031a.f280042N0.setImageBitmap(decodeFile);
                this.f280031a.f280042N0.setVisibility(0);
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.b$b */
    public class C95913b implements C102064e.C102069c {
        public C95913b() {
        }

        /* renamed from: a */
        public ViewGroup mo132650a() {
            SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$3");
            SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$3");
            return null;
        }

        /* renamed from: b */
        public void mo132651b() {
            SnsMethodCalculate.markStartTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$3");
            C95911b bVar = C95911b.this;
            bVar.f279906g.f278572f.mo133540C(C95911b.m122813C(bVar));
            SnsMethodCalculate.markEndTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.b$c */
    public class C95914c implements SnsTimelineVideoView.C96253d {
        public C95914c() {
        }

        /* renamed from: O3 */
        public void mo133426O3(String str) {
            SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$4");
            StringBuilder sb = new StringBuilder();
            sb.append("timelineVideoView setUICallback onDestroy, the tlId is ");
            sb.append(str);
            sb.append(", the timelineId is ");
            C95911b bVar = C95911b.this;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            String str2 = bVar.f280028x;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            sb.append(str2);
            Log.m105928w("MiroMsg.CardAdTimeLineItem", sb.toString());
            if (!Util.isNullOrNil(str)) {
                C95911b bVar2 = C95911b.this;
                SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
                String str3 = bVar2.f280028x;
                SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
                if (str.equals(str3)) {
                    C95911b bVar3 = C95911b.this;
                    SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
                    bVar3.f280026v = false;
                    SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
                    C95911b bVar4 = C95911b.this;
                    SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
                    bVar4.mo133423K();
                    SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
                }
            }
            SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$4");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.b$d */
    public static class C95915d extends BaseTimeLineItem.BaseViewHolder {

        /* renamed from: F0 */
        public ViewGroup f280034F0;

        /* renamed from: G0 */
        public ViewGroup f280035G0;

        /* renamed from: H0 */
        public ViewGroup f280036H0;

        /* renamed from: I0 */
        public MaskImageView f280037I0;

        /* renamed from: J0 */
        public View f280038J0;

        /* renamed from: K0 */
        public Button f280039K0;

        /* renamed from: L0 */
        public Button f280040L0;

        /* renamed from: M0 */
        public View f280041M0;

        /* renamed from: N0 */
        public ImageView f280042N0;

        /* renamed from: O0 */
        public TextView f280043O0;

        /* renamed from: P0 */
        public SnsCardAdTagListView f280044P0;

        /* renamed from: Q0 */
        public View f280045Q0;

        /* renamed from: R0 */
        public ImageView f280046R0;

        /* renamed from: S0 */
        public TextView f280047S0;

        /* renamed from: T0 */
        public ImageView f280048T0;

        /* renamed from: U0 */
        public TextView f280049U0;

        /* renamed from: V0 */
        public TextView f280050V0;

        /* renamed from: W0 */
        public View f280051W0;

        /* renamed from: X0 */
        public boolean f280052X0;

        /* renamed from: Y0 */
        public ViewGroup f280053Y0;

        /* renamed from: Z0 */
        public boolean f280054Z0;

        /* renamed from: a1 */
        public PromotionBarLayout f280055a1;

        /* renamed from: b1 */
        public LivingDescBarLayout f280056b1;

        /* renamed from: c1 */
        public ViewGroup f280057c1;

        /* renamed from: d1 */
        public LivingDescBarLayout f280058d1;

        /* renamed from: e1 */
        public ViewStub f280059e1;

        /* renamed from: f1 */
        public FinderLivingAnimWrapper f280060f1;

        /* renamed from: g1 */
        public ViewStub f280061g1;

        /* renamed from: h1 */
        public AdLivingStreamContainer f280062h1;
    }

    /* renamed from: C */
    public static /* synthetic */ C95915d m122813C(C95911b bVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        C95915d dVar = bVar.f280021q;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        return dVar;
    }

    /* renamed from: D */
    public final void mo133416D(SnsInfo snsInfo, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        C98963o oVar;
        BaseTimeLine baseTimeLine;
        SnsMethodCalculate.markStartTimeMs("addOnRemovedListener", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        SnsMethodCalculate.markStartTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        if (snsTimeLineBaseAdapter == null || (baseTimeLine = snsTimeLineBaseAdapter.f278568b) == null || (oVar = baseTimeLine.f276699f) == null) {
            Activity activity = this.f279904e;
            oVar = activity instanceof SnsTimeLineUI ? ((SnsTimeLineUI) activity).mo132956s8() : null;
        }
        SnsMethodCalculate.markEndTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        if (oVar != null) {
            String W = C102236a0.m134728W(snsInfo);
            if (!TextUtils.isEmpty(W) && !"0".equals(W)) {
                oVar.mo138294a(W, this);
            }
        }
        SnsMethodCalculate.markEndTimeMs("addOnRemovedListener", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
    }

    /* renamed from: E */
    public final void mo133417E(C92445n nVar, String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("checkShowLivingAnim", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        if (FinderLivingAnimWrapper.m120030e(nVar, z)) {
            C95915d dVar = this.f280021q;
            if (dVar.f280060f1 == null) {
                dVar.f280060f1 = (FinderLivingAnimWrapper) dVar.f280059e1.inflate();
            }
            Log.m105918d("MiroMsg.CardAdTimeLineItem", "checkShowLivingAnim, snsId=" + str);
            if (this.f280021q.f280060f1 != null) {
                int b = C76577a.m92151b(this.f279904e, 60);
                int height = this.f280021q.f280034F0.getHeight();
                int height2 = this.f280021q.f280035G0.getHeight();
                if (height <= 0 || height2 <= 0) {
                    Log.m105928w("MiroMsg.CardAdTimeLineItem", "checkShowLivingAnim, contentH==0");
                } else {
                    this.f280021q.f280060f1.mo130549d(nVar, str, b, (height - height2) + C76577a.m92151b(this.f279904e, 8));
                    this.f280021q.f280060f1.setVisibility(0);
                }
            }
        } else {
            FinderLivingAnimWrapper finderLivingAnimWrapper = this.f280021q.f280060f1;
            if (finderLivingAnimWrapper != null) {
                finderLivingAnimWrapper.setVisibility(8);
            }
        }
        SnsMethodCalculate.markEndTimeMs("checkShowLivingAnim", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
    }

    /* renamed from: F */
    public boolean mo133418F() {
        BaseTimeLine baseTimeLine;
        C98963o oVar;
        SnsMethodCalculate.markStartTimeMs("doPause", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        int i = this.f280021q.timeLineObject.ContentObj.f298424e;
        if (i == 5 || i == 15) {
            boolean a = C54550e.m61296a(this.f280027w);
            Log.m105925i("MiroMsg.CardAdTimeLineItem", "%s cardAd doPause", this);
            if (a) {
                C54550e eVar = this.f280029y;
                if (eVar != null) {
                    eVar.mo75432g();
                }
                SnsMethodCalculate.markEndTimeMs("doPause", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
                return false;
            }
            SnsInfo snsInfo = this.f280027w;
            SnsMethodCalculate.markStartTimeMs("pauseStaticVideoPlay", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = this.f279906g;
            if (!(snsTimeLineBaseAdapter == null || (baseTimeLine = snsTimeLineBaseAdapter.f278568b) == null || (oVar = baseTimeLine.f276699f) == null || snsInfo == null)) {
                oVar.mo138314u(snsInfo.field_snsId);
            }
            SnsMethodCalculate.markEndTimeMs("pauseStaticVideoPlay", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            this.f280026v = false;
            SnsMethodCalculate.markEndTimeMs("doPause", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("doPause", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        return false;
    }

    /* renamed from: G */
    public final void mo133419G(C95915d dVar, SnsInfo snsInfo, C101804kv2 kv22, int i, int i2) {
        C95915d dVar2 = dVar;
        int i3 = i;
        int i4 = i2;
        SnsMethodCalculate.markStartTimeMs("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        if (dVar2 == null) {
            SnsMethodCalculate.markEndTimeMs("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            return;
        }
        ViewStub viewStub = dVar2.f280061g1;
        if (viewStub != null && dVar2.f280062h1 == null) {
            dVar2.f280062h1 = (AdLivingStreamContainer) C101432s.m133125g(viewStub);
        }
        if (dVar2.f280062h1 == null) {
            SnsMethodCalculate.markEndTimeMs("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            return;
        }
        dVar2.f280039K0.setTag(dVar2);
        dVar2.f280040L0.setTag(dVar2);
        dVar2.f279953e0.f280505h.setTag(dVar2);
        View view = dVar2.f279953e0.f280501d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        String str = "fillAdLivingStreamViewInfo";
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem", "fillAdLivingStreamViewInfo", "(Lcom/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem$CardAdViewHolder;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/protocal/protobuf/MediaObj;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem", "fillAdLivingStreamViewInfo", "(Lcom/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem$CardAdViewHolder;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/protocal/protobuf/MediaObj;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        dVar2.f279953e0.f280506i.setVisibility(8);
        dVar2.f279953e0.f280507j.setVisibility(8);
        dVar2.f280053Y0.setVisibility(8);
        dVar2.f280037I0.setVisibility(8);
        C101432s.m133131m(dVar2.f279953e0.f280501d, i3, i4);
        C101432s.m133131m(dVar2.f280062h1, i3, i4);
        if (this.f280029y == null) {
            this.f280029y = new C54550e(dVar2.f280062h1);
        }
        this.f280029y.mo75429d(snsInfo, 0, kv22, Integer.valueOf(i), Integer.valueOf(i2));
        SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
    }

    /* renamed from: H */
    public final void mo133420H(SnsInfo snsInfo) {
        ViewStub viewStub;
        ViewStub viewStub2;
        SnsMethodCalculate.markStartTimeMs("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        try {
            if (mo133424a(snsInfo)) {
                TimeLineObject timeLine = snsInfo.getTimeLine();
                C95915d dVar = this.f280021q;
                if (dVar.f280057c1 == null && (viewStub2 = (ViewStub) dVar.f280034F0.findViewById(C0966R.C0970id.f5555i9)) != null) {
                    this.f280021q.f280057c1 = (ViewGroup) C101432s.m133125g(viewStub2);
                    Log.m105924i("MiroMsg.CardAdTimeLineItem", "inflate the living status");
                }
                C95915d dVar2 = this.f280021q;
                if (dVar2.f280056b1 == null && (viewStub = (ViewStub) dVar2.f280034F0.findViewById(C0966R.C0970id.f5552i6)) != null) {
                    this.f280021q.f280056b1 = (LivingDescBarLayout) C101432s.m133125g(viewStub);
                    Log.m105924i("MiroMsg.CardAdTimeLineItem", "inflate the living des bar");
                }
                C95915d dVar3 = this.f280021q;
                ViewGroup viewGroup = dVar3.f280057c1;
                if (viewGroup != null) {
                    LivingDescBarLayout livingDescBarLayout = dVar3.f280056b1;
                    if (livingDescBarLayout != null) {
                        if (this.f280024t == null) {
                            this.f280024t = new C94764b(viewGroup, livingDescBarLayout, this.f280022r);
                        }
                        if (!(timeLine == null || this.f280024t == null)) {
                            C92445n nVar = snsInfo.getAdXml().adLiveInfo;
                            int c = C94762a.m120036c(timeLine.f283893Id, nVar.f264555a);
                            this.f280024t.mo130559g(timeLine.f283893Id, nVar);
                            this.f280024t.mo130560h(c);
                            C94762a.m120034a(timeLine.f283893Id, this.f280024t);
                            if (!C54550e.m61296a(this.f280027w)) {
                                C97354d.m125367c(this.f279904e).mo136623b(0, snsInfo);
                            }
                            mo133417E(nVar, timeLine.f283893Id, C94764b.m120042f(c));
                        }
                        if (C102260r.m134842K(this.f279904e)) {
                            this.f280021q.f280056b1.setVisibility(8);
                        }
                    }
                }
                Log.m105920e("MiroMsg.CardAdTimeLineItem", "the livingStatusLayout or livingDescBar is null!!");
                SnsMethodCalculate.markEndTimeMs("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
                return;
            }
            ViewGroup viewGroup2 = this.f280021q.f280057c1;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
            LivingDescBarLayout livingDescBarLayout2 = this.f280021q.f280056b1;
            if (livingDescBarLayout2 != null) {
                livingDescBarLayout2.setVisibility(8);
            }
            FinderLivingAnimWrapper finderLivingAnimWrapper = this.f280021q.f280060f1;
            if (finderLivingAnimWrapper != null) {
                finderLivingAnimWrapper.setVisibility(8);
            }
        } catch (Throwable th) {
            Log.m105920e("MiroMsg.CardAdTimeLineItem", "fillLivingViewInfo, exp=" + android.util.Log.getStackTraceString(th));
        }
        SnsMethodCalculate.markEndTimeMs("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00a0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00c4 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e A[Catch:{ all -> 0x00d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bf A[Catch:{ all -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c8 A[Catch:{ all -> 0x00d3 }] */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo133421I(com.tencent.p014mm.plugin.sns.storage.SnsInfo r10) {
        /*
            r9 = this;
            java.lang.String r0 = "fillPromotionalBar"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "shouldShowPromotionalBar"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)     // Catch:{ all -> 0x00d3 }
            r3 = 0
            if (r10 == 0) goto L_0x0038
            com.tencent.mm.plugin.sns.storage.ADXml r4 = r10.getAdXml()     // Catch:{ all -> 0x00d3 }
            if (r4 != 0) goto L_0x0017
            goto L_0x0038
        L_0x0017:
            com.tencent.mm.plugin.sns.storage.ADXml r4 = r10.getAdXml()     // Catch:{ all -> 0x00d3 }
            co2.o r4 = r4.adPromotionInfo     // Catch:{ all -> 0x00d3 }
            if (r4 == 0) goto L_0x0033
            long r5 = r4.f264567a     // Catch:{ all -> 0x00d3 }
            long r7 = r4.f264568b     // Catch:{ all -> 0x00d3 }
            boolean r4 = rq2.C101426m.m133105c(r5, r7)     // Catch:{ all -> 0x00d3 }
            if (r4 == 0) goto L_0x0033
            android.app.Activity r4 = r9.f279904e     // Catch:{ all -> 0x00d3 }
            boolean r4 = vr2.C102260r.m134842K(r4)     // Catch:{ all -> 0x00d3 }
            if (r4 != 0) goto L_0x0033
            r4 = 1
            goto L_0x0034
        L_0x0033:
            r4 = 0
        L_0x0034:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)     // Catch:{ all -> 0x00d3 }
            goto L_0x003c
        L_0x0038:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)     // Catch:{ all -> 0x00d3 }
            r4 = 0
        L_0x003c:
            if (r4 == 0) goto L_0x00c8
            com.tencent.mm.plugin.sns.storage.ADXml r10 = r10.getAdXml()     // Catch:{ all -> 0x00d3 }
            co2.o r10 = r10.adPromotionInfo     // Catch:{ all -> 0x00d3 }
            com.tencent.mm.plugin.sns.ui.item.b$d r2 = r9.f280021q     // Catch:{ all -> 0x00d3 }
            com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout r4 = r2.f280055a1     // Catch:{ all -> 0x00d3 }
            if (r4 != 0) goto L_0x0068
            android.view.ViewGroup r2 = r2.f280034F0     // Catch:{ all -> 0x00d3 }
            r4 = 2131296644(0x7f090184, float:1.821121E38)
            android.view.View r2 = r2.findViewById(r4)     // Catch:{ all -> 0x00d3 }
            android.view.ViewStub r2 = (android.view.ViewStub) r2     // Catch:{ all -> 0x00d3 }
            if (r2 == 0) goto L_0x0068
            com.tencent.mm.plugin.sns.ui.item.b$d r4 = r9.f280021q     // Catch:{ all -> 0x00d3 }
            android.view.View r2 = rq2.C101432s.m133125g(r2)     // Catch:{ all -> 0x00d3 }
            com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout r2 = (com.tencent.p014mm.plugin.sns.p104ad.widget.countdown.PromotionBarLayout) r2     // Catch:{ all -> 0x00d3 }
            r4.f280055a1 = r2     // Catch:{ all -> 0x00d3 }
            java.lang.String r2 = "MiroMsg.CardAdTimeLineItem"
            java.lang.String r4 = "inflate the promotionBar"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)     // Catch:{ all -> 0x00d3 }
        L_0x0068:
            com.tencent.mm.plugin.sns.ui.item.b$d r2 = r9.f280021q     // Catch:{ all -> 0x00d3 }
            com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout r2 = r2.f280055a1     // Catch:{ all -> 0x00d3 }
            if (r2 == 0) goto L_0x00d3
            r2.setVisibility(r3)     // Catch:{ all -> 0x00d3 }
            com.tencent.mm.plugin.sns.ui.item.b$d r2 = r9.f280021q     // Catch:{ all -> 0x00d3 }
            com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout r2 = r2.f280055a1     // Catch:{ all -> 0x00d3 }
            java.lang.String r3 = r10.f264571e     // Catch:{ all -> 0x00d3 }
            r2.setPromotionalPrice(r3)     // Catch:{ all -> 0x00d3 }
            com.tencent.mm.plugin.sns.ui.item.b$d r2 = r9.f280021q     // Catch:{ all -> 0x00d3 }
            com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout r2 = r2.f280055a1     // Catch:{ all -> 0x00d3 }
            java.lang.String r3 = r10.f264572f     // Catch:{ all -> 0x00d3 }
            r2.setRightTitle(r3)     // Catch:{ all -> 0x00d3 }
            com.tencent.mm.plugin.sns.ui.item.b$d r2 = r9.f280021q     // Catch:{ all -> 0x00d3 }
            com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout r2 = r2.f280055a1     // Catch:{ all -> 0x00d3 }
            java.lang.String r3 = r10.f264570d     // Catch:{ all -> 0x00d3 }
            java.lang.String r4 = r10.f264569c     // Catch:{ all -> 0x00d3 }
            java.lang.String r3 = rq2.C13098l.m12545c(r3, r4)     // Catch:{ all -> 0x00d3 }
            java.lang.String r4 = "setBackgroundColor"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.utils.ViewUtils"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)     // Catch:{ all -> 0x00d3 }
            int r3 = android.graphics.Color.parseColor(r3)     // Catch:{ all -> 0x00a0 }
            if (r2 == 0) goto L_0x00a0
            r2.setBackgroundColor(r3)     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)     // Catch:{ all -> 0x00d3 }
            com.tencent.mm.plugin.sns.ui.item.b$d r2 = r9.f280021q     // Catch:{ all -> 0x00d3 }
            com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout r2 = r2.f280055a1     // Catch:{ all -> 0x00d3 }
            xq2.b r3 = new xq2.b     // Catch:{ all -> 0x00d3 }
            long r4 = r10.f264567a     // Catch:{ all -> 0x00d3 }
            long r6 = r10.f264568b     // Catch:{ all -> 0x00d3 }
            r3.<init>(r4, r6)     // Catch:{ all -> 0x00d3 }
            r2.getClass()     // Catch:{ all -> 0x00d3 }
            java.lang.String r10 = "startCountDown"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r4)     // Catch:{ all -> 0x00d3 }
            xq2.a r5 = r2.f274368h     // Catch:{ all -> 0x00c4 }
            if (r5 == 0) goto L_0x00c2
            r5.mo142513a(r3)     // Catch:{ all -> 0x00c4 }
        L_0x00c2:
            r2.f274367g = r3     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r4)     // Catch:{ all -> 0x00d3 }
            goto L_0x00d3
        L_0x00c8:
            com.tencent.mm.plugin.sns.ui.item.b$d r10 = r9.f280021q     // Catch:{ all -> 0x00d3 }
            com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout r10 = r10.f280055a1     // Catch:{ all -> 0x00d3 }
            if (r10 == 0) goto L_0x00d3
            r2 = 8
            r10.setVisibility(r2)     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.item.C95911b.mo133421I(com.tencent.mm.plugin.sns.storage.SnsInfo):void");
    }

    /* renamed from: J */
    public final void mo133422J(SnsInfo snsInfo) {
        ViewStub viewStub;
        SnsMethodCalculate.markStartTimeMs("fillRollViewInfo", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        try {
            SnsMethodCalculate.markStartTimeMs("shouldShowRollView", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            boolean z = (snsInfo == null || snsInfo.getAdXml() == null || snsInfo.getAdXml().adRollInfo == null) ? false : true;
            SnsMethodCalculate.markEndTimeMs("shouldShowRollView", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            if (z) {
                C55058p pVar = snsInfo.getAdXml().adRollInfo;
                C95915d dVar = this.f280021q;
                if (dVar.f280058d1 == null && (viewStub = (ViewStub) dVar.f280034F0.findViewById(C0966R.C0970id.f5562if)) != null) {
                    this.f280021q.f280058d1 = (LivingDescBarLayout) C101432s.m133125g(viewStub);
                    Log.m105924i("MiroMsg.CardAdTimeLineItem", "inflate the rollTextBar");
                }
                LivingDescBarLayout livingDescBarLayout = this.f280021q.f280058d1;
                if (livingDescBarLayout != null) {
                    if (pVar != null) {
                        if (this.f280025u == null) {
                            this.f280025u = new C60893t(livingDescBarLayout);
                        }
                        C60893t tVar = this.f280025u;
                        tVar.getClass();
                        SnsMethodCalculate.markStartTimeMs("setAdRollInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
                        tVar.f173474b = pVar;
                        SnsMethodCalculate.markEndTimeMs("setAdRollInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
                        this.f280025u.mo85785b();
                        this.f280025u.mo85787d();
                        this.f280025u.mo85788e();
                        if (C102260r.m134842K(this.f279904e)) {
                            this.f280021q.f280058d1.setVisibility(8);
                        }
                    }
                }
                Log.m105920e("MiroMsg.CardAdTimeLineItem", "the rollingBar or adRollInfo is null!!");
                SnsMethodCalculate.markEndTimeMs("fillRollViewInfo", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
                return;
            }
            LivingDescBarLayout livingDescBarLayout2 = this.f280021q.f280058d1;
            if (livingDescBarLayout2 != null) {
                livingDescBarLayout2.setVisibility(8);
            }
        } catch (Throwable th) {
            Log.m105920e("MiroMsg.CardAdTimeLineItem", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("fillRollViewInfo", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
    }

    /* renamed from: K */
    public final void mo133423K() {
        SnsMethodCalculate.markStartTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        Log.m105924i("MiroMsg.CardAdTimeLineItem", "try show play btn");
        C95915d dVar = this.f280021q;
        if (!(dVar == null || dVar.f279953e0 == null || this.f280026v)) {
            Log.m105924i("MiroMsg.CardAdTimeLineItem", "show play btn");
            this.f280021q.f279953e0.f280506i.setVisibility(0);
            this.f280021q.f279953e0.f280507j.setVisibility(8);
            this.f280021q.f279953e0.f280506i.setImageDrawable(C76577a.m92158i(this.f279904e, C0966R.raw.shortvideo_play_btn));
            this.f280021q.f279953e0.f280506i.setContentDescription(this.f279904e.getString(C0966R.string.f361136hk0));
        }
        SnsMethodCalculate.markEndTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
    }

    /* renamed from: a */
    public final boolean mo133424a(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("shouldShowLivingView", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        if (snsInfo == null || snsInfo.getAdXml() == null || snsInfo.getAdXml().adLiveInfo == null) {
            SnsMethodCalculate.markEndTimeMs("shouldShowLivingView", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            return false;
        }
        SnsMethodCalculate.markEndTimeMs("shouldShowLivingView", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        return true;
    }

    /* renamed from: b */
    public void mo126294b() {
        SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        Log.m105924i("MiroMsg.CardAdTimeLineItem", "onUIPause");
        mo133418F();
        SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
    }

    /* renamed from: d */
    public void mo133425d(String str) {
        C54550e eVar;
        SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        if (C54550e.m61296a(this.f280027w) && (eVar = this.f280029y) != null) {
            eVar.mo75427b();
        }
        SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
    }

    /* renamed from: e */
    public void mo126295e(BaseTimeLineItem.BaseViewHolder baseViewHolder, int i) {
        BaseTimeLineItem.BaseViewHolder baseViewHolder2 = baseViewHolder;
        SnsMethodCalculate.markStartTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        int i2 = baseViewHolder2.timeLineObject.ContentObj.f298424e;
        if (i2 == 5 || i2 == 15) {
            boolean a = C54550e.m61296a(this.f280027w);
            Log.m105925i("MiroMsg.CardAdTimeLineItem", "%s cardAd autoPlay pos %d", this, Integer.valueOf(i));
            C92313c.m116089a().mo126301d();
            Log.m105929w("MiroMsg.CardAdTimeLineItem", "%s cardAd autoPlay pos %d", this, Integer.valueOf(i));
            SnsInfo snsInfo = this.f280027w;
            C101804kv2 a2 = C99008w.m128937a(baseViewHolder);
            String c = C99008w.m128939c(baseViewHolder);
            C98963o b = C99008w.m128938b(this.f279906g);
            C95915d dVar = (C95915d) baseViewHolder2;
            if (a) {
                C96254a.m123394d().mo133938k();
                C92313c.m116089a().mo126302e(this);
                C54550e eVar = this.f280029y;
                if (eVar != null) {
                    eVar.mo75434i();
                }
                SnsMethodCalculate.markEndTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
                return;
            }
            ViewGroup viewGroup = dVar.f280053Y0;
            String str = baseViewHolder2.f279956g;
            if (!(snsInfo == null || a2 == null || viewGroup == null)) {
                Log.m105928w("MiroMsg.CardAdTimeLineItem", "the sns info is " + snsInfo + " the media is " + a2);
                C101238e eVar2 = new C101238e("MiroMsg.CardAdTimeLineItem");
                SnsMethodCalculate.markStartTimeMs("container", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
                eVar2.f296440e = viewGroup;
                SnsMethodCalculate.markEndTimeMs("container", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
                SnsMethodCalculate.markStartTimeMs("mediaObject", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
                eVar2.f296439d = a2;
                SnsMethodCalculate.markEndTimeMs("mediaObject", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
                SnsMethodCalculate.markStartTimeMs("snsInfo", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
                eVar2.f296438c = snsInfo;
                SnsMethodCalculate.markEndTimeMs("snsInfo", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
                SnsMethodCalculate.markStartTimeMs("snsLocalId", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
                eVar2.f296442g = str;
                SnsMethodCalculate.markEndTimeMs("snsLocalId", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
                SnsMethodCalculate.markStartTimeMs("timelineId", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
                eVar2.f296441f = c;
                SnsMethodCalculate.markEndTimeMs("timelineId", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
                SnsMethodCalculate.markStartTimeMs(TencentMapServiceProtocol.SERVICE_NAME_STATISTIC, "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
                eVar2.f296437b = b;
                SnsMethodCalculate.markEndTimeMs(TencentMapServiceProtocol.SERVICE_NAME_STATISTIC, "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
                eVar2.mo140703a(3, new C95914c());
            }
            SnsMethodCalculate.markStartTimeMs("hidePlayBtn", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            Log.m105924i("MiroMsg.CardAdTimeLineItem", "try hide play btn");
            C95915d dVar2 = this.f280021q;
            if (!(dVar2 == null || dVar2.f279953e0 == null)) {
                Log.m105924i("MiroMsg.CardAdTimeLineItem", "hide play btn");
                this.f280021q.f279953e0.f280506i.setVisibility(8);
                this.f280021q.f279953e0.f280507j.setVisibility(8);
            }
            SnsMethodCalculate.markEndTimeMs("hidePlayBtn", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            this.f280026v = true;
            if (baseViewHolder2 instanceof C95915d) {
                dVar.f280052X0 = false;
            }
        }
        SnsMethodCalculate.markEndTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
    }

    public Rect getDisplayRect() {
        ViewGroup viewGroup;
        SnsMethodCalculate.markStartTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        C95915d dVar = this.f280021q;
        if (dVar == null || (viewGroup = dVar.f280035G0) == null) {
            SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            return null;
        }
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        Rect rect = new Rect(i, i2, this.f280021q.f280035G0.getMeasuredWidth() + i, this.f280021q.f280035G0.getMeasuredHeight() + i2);
        SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        return rect;
    }

    /* renamed from: h */
    public void mo81014h(ViewStub viewStub, BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        this.f280021q = (C95915d) baseViewHolder;
        if (BaseTimeLineItem.m122773q(baseViewHolder) != null) {
            BaseTimeLineItem.m122773q(baseViewHolder).setLayoutResource(C0966R.C0971layout.c0l);
            if (!baseViewHolder.f279976q) {
                this.f280021q.f280034F0 = (ViewGroup) BaseTimeLineItem.m122773q(baseViewHolder).inflate();
                baseViewHolder.f279976q = true;
            }
        } else if (!baseViewHolder.f279976q) {
            this.f280021q.f280034F0 = (ViewGroup) baseViewHolder.f279960i.findViewById(C0966R.C0970id.f5532hl);
            baseViewHolder.f279976q = true;
        }
        SnsMethodCalculate.markStartTimeMs("initActionButtonComponent", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        Activity activity = this.f279904e;
        this.f280030z = new C95910a(this, "actionButtonLayoutRoot", activity instanceof C0125s ? (C0125s) activity : null, this.f280021q.f280034F0);
        SnsMethodCalculate.markEndTimeMs("initActionButtonComponent", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        C95915d dVar = this.f280021q;
        dVar.f280035G0 = (ViewGroup) dVar.f280034F0.findViewById(C0966R.C0970id.f358728gq1);
        ViewGroup viewGroup = this.f280021q.f280035G0;
        if (viewGroup instanceof RoundedCornerFrameLayout) {
            ((RoundedCornerFrameLayout) viewGroup).setRadius((float) C76577a.m92151b(this.f279904e, 4));
        }
        C95915d dVar2 = this.f280021q;
        dVar2.f280036H0 = (ViewGroup) dVar2.f280034F0.findViewById(C0966R.C0970id.hpq);
        C95915d dVar3 = this.f280021q;
        dVar3.f280037I0 = (MaskImageView) dVar3.f280034F0.findViewById(C0966R.C0970id.jrs);
        this.f280021q.f280037I0.setOnClickListener(this.f279906g.f278572f.f280385o);
        C95915d dVar4 = this.f280021q;
        dVar4.f280050V0 = (TextView) dVar4.f280034F0.findViewById(C0966R.C0970id.c28);
        this.f280021q.f280050V0.setClickable(false);
        this.f280021q.f280050V0.setLongClickable(false);
        C95915d dVar5 = this.f280021q;
        dVar5.f280049U0 = (TextView) dVar5.f280034F0.findViewById(C0966R.C0970id.c27);
        this.f280021q.f280049U0.setClickable(false);
        this.f280021q.f280049U0.setLongClickable(false);
        this.f280021q.f279953e0 = new C96066m2();
        C95915d dVar6 = this.f280021q;
        dVar6.f279953e0.f280505h = dVar6.f280034F0.findViewById(C0966R.C0970id.jru);
        C96066m2 m2Var = this.f280021q.f279953e0;
        View view = m2Var.f280505h;
        m2Var.f280501d = view;
        view.setOnClickListener(this.f279906g.f278572f.f280353I);
        C96066m2 m2Var2 = this.f280021q.f279953e0;
        m2Var2.f280503f = (ImageView) m2Var2.f280505h.findViewById(C0966R.C0970id.kk6);
        C96066m2 m2Var3 = this.f280021q.f279953e0;
        m2Var3.f280506i = (ImageView) m2Var3.f280505h.findViewById(C0966R.C0970id.k17);
        C96066m2 m2Var4 = this.f280021q.f279953e0;
        m2Var4.f280507j = (MMPinProgressBtn) m2Var4.f280505h.findViewById(C0966R.C0970id.i7j);
        C96066m2 m2Var5 = this.f280021q.f279953e0;
        m2Var5.f280509l = (TextView) m2Var5.f280505h.findViewById(C0966R.C0970id.f357936ck1);
        C96066m2 m2Var6 = this.f280021q.f279953e0;
        m2Var6.f280508k = (TextView) m2Var6.f280505h.findViewById(C0966R.C0970id.ckr);
        C95915d dVar7 = this.f280021q;
        dVar7.f280041M0 = dVar7.f280034F0.findViewById(C0966R.C0970id.jof);
        C95915d dVar8 = this.f280021q;
        dVar8.f280042N0 = (ImageView) dVar8.f280034F0.findViewById(C0966R.C0970id.joe);
        C95915d dVar9 = this.f280021q;
        dVar9.f280043O0 = (TextView) dVar9.f280034F0.findViewById(C0966R.C0970id.jog);
        C95915d dVar10 = this.f280021q;
        dVar10.f280045Q0 = dVar10.f280034F0.findViewById(C0966R.C0970id.axq);
        C95915d dVar11 = this.f280021q;
        dVar11.f280046R0 = (ImageView) dVar11.f280034F0.findViewById(C0966R.C0970id.llq);
        C95915d dVar12 = this.f280021q;
        dVar12.f280048T0 = (ImageView) dVar12.f280034F0.findViewById(C0966R.C0970id.lls);
        C95915d dVar13 = this.f280021q;
        dVar13.f280047S0 = (TextView) dVar13.f280034F0.findViewById(C0966R.C0970id.llt);
        C95915d dVar14 = this.f280021q;
        dVar14.f280038J0 = dVar14.f280034F0.findViewById(C0966R.C0970id.asr);
        C95915d dVar15 = this.f280021q;
        dVar15.f280039K0 = (Button) dVar15.f280034F0.findViewById(C0966R.C0970id.ass);
        C95915d dVar16 = this.f280021q;
        dVar16.f280040L0 = (Button) dVar16.f280034F0.findViewById(C0966R.C0970id.ast);
        this.f280021q.f280039K0.setOnClickListener(this.f279906g.f278572f.f280363S);
        this.f280021q.f280040L0.setOnClickListener(this.f279906g.f278572f.f280364T);
        C95915d dVar17 = this.f280021q;
        dVar17.f280044P0 = (SnsCardAdTagListView) dVar17.f280034F0.findViewById(C0966R.C0970id.arz);
        this.f280021q.f280044P0.setActivityContext(this.f279904e);
        C95915d dVar18 = this.f280021q;
        dVar18.f280053Y0 = (ViewGroup) dVar18.f280034F0.findViewById(C0966R.C0970id.jrt);
        C95915d dVar19 = this.f280021q;
        dVar19.f280051W0 = dVar19.f280034F0.findViewById(C0966R.C0970id.f5394dz);
        C95915d dVar20 = this.f280021q;
        dVar20.f280059e1 = (ViewStub) dVar20.f280034F0.findViewById(C0966R.C0970id.f5546i0);
        C95915d dVar21 = this.f280021q;
        dVar21.f280061g1 = (ViewStub) dVar21.f280034F0.findViewById(C0966R.C0970id.oop);
        Log.m105918d("MiroMsg.CardAdTimeLineItem", "the card ad build layout is end");
        SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
    }

    /* renamed from: o */
    public void mo81015o(BaseTimeLineItem.BaseViewHolder baseViewHolder, int i, C96275w6 w6Var, TimeLineObject timeLineObject, int i2, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        String str;
        int i3;
        TimeLineObject timeLine;
        boolean z;
        int b;
        ViewStub viewStub;
        BaseTimeLineItem.BaseViewHolder baseViewHolder2 = baseViewHolder;
        int i4 = i;
        C96275w6 w6Var2 = w6Var;
        TimeLineObject timeLineObject2 = timeLineObject;
        SnsTimeLineBaseAdapter snsTimeLineBaseAdapter2 = snsTimeLineBaseAdapter;
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        if (baseViewHolder2.f279985u0) {
            Log.m105924i("MiroMsg.CardAdTimeLineItem", "holder is busy");
            SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            return;
        }
        Log.m105924i("MiroMsg.CardAdTimeLineItem", "ad fillItem, cardAd, pos=" + i4 + ", snsId=" + timeLineObject2.f283893Id + ", hash=" + hashCode());
        baseViewHolder2.f279985u0 = true;
        String str2 = timeLineObject2.f283893Id;
        if (str2 == null) {
            str2 = "";
        }
        this.f280028x = str2;
        C95915d dVar = (C95915d) baseViewHolder2;
        SnsInfo i5 = snsTimeLineBaseAdapter2.mo132919i(i4);
        this.f280027w = i5;
        View view = dVar.f280045Q0;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        String str3 = "fillItem";
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view3 = dVar.f280038J0;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        dVar.f280044P0.setVisibility(8);
        View view5 = dVar.f280041M0;
        C9556a aVar3 = new C9556a();
        C60958c.m71442b(8, aVar3);
        View view6 = view5;
        C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        dVar.f280041M0.setTag("");
        int i6 = dVar.timeLineObject.ContentObj.f298424e;
        if (i6 == 5 || i6 == 15) {
            Object tag = dVar.f279953e0.f280503f.getTag();
            if (tag instanceof String) {
                String str4 = (String) tag;
                if (Util.isNullOrNil(str4) || !str4.equals(this.f280028x)) {
                    C101432s.m133132n(dVar.f279953e0.f280503f, false);
                    dVar.f279953e0.f280503f.setImageDrawable((Drawable) null);
                }
            } else {
                C101432s.m133132n(dVar.f279953e0.f280503f, false);
                dVar.f279953e0.f280503f.setImageDrawable((Drawable) null);
            }
        } else {
            C101432s.m133132n(dVar.f279953e0.f280503f, false);
            dVar.f279953e0.f280503f.setImageDrawable((Drawable) null);
        }
        C96319y2 y2Var = this.f280023s;
        if (y2Var != null) {
            y2Var.mo134155b();
        }
        ViewGroup viewGroup = dVar.f280034F0;
        if (viewGroup instanceof AdRoundedCornerFrameLayout) {
            AdRoundedCornerFrameLayout adRoundedCornerFrameLayout = (AdRoundedCornerFrameLayout) viewGroup;
            adRoundedCornerFrameLayout.setIsReportTouchDownPositon(true);
            adRoundedCornerFrameLayout.mo134108c(this.f280027w, 1);
        }
        AsyncNormalTextView asyncNormalTextView = baseViewHolder2.f279968m;
        if (asyncNormalTextView != null) {
            asyncNormalTextView.setVisibility(8);
        }
        WindowManager windowManager = (WindowManager) this.f279904e.getSystemService("window");
        int min = Math.min(windowManager.getDefaultDisplay().getWidth(), windowManager.getDefaultDisplay().getHeight());
        dVar.f279972o.setOnClickListener(snsTimeLineBaseAdapter2.f278572f.f280365U);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(((min - C76577a.m92151b(this.f279904e, 56)) - C76577a.m92151b(this.f279904e, 14)) - this.f279904e.getResources().getDimensionPixelSize(C0966R.dimen.f3926j6), -2);
        StringBuilder sb = new StringBuilder();
        sb.append("fillItem, init contentLayoutParams width is ");
        sb.append(layoutParams.width);
        String str5 = "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem";
        sb.append(", contentLayoutParams height is ");
        sb.append(layoutParams.height);
        Log.m105924i("MiroMsg.CardAdTimeLineItem", sb.toString());
        if (C85875k4.m106197n0() && ((C85875k4.m106156M(MMApplicationContext.getContext()) || C85875k4.m106155L(MMApplicationContext.getContext().getContentResolver())) && !C85878m2.m106213b(this.f279904e.getTaskId()))) {
            layoutParams = new LinearLayout.LayoutParams(C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.avl), -2);
            Log.m105924i("MiroMsg.CardAdTimeLineItem", "fillItem, init contentLayoutParams but it becomes magic window");
        }
        layoutParams.topMargin = this.f279904e.getResources().getDimensionPixelSize(C0966R.dimen.f3913iq);
        layoutParams.bottomMargin = C76577a.m92151b(this.f279904e, 2);
        dVar.f280034F0.setLayoutParams(layoutParams);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("fillItem, init contentLayoutParams width is ");
        sb4.append(layoutParams.width);
        sb4.append(", contentLayoutParams height is ");
        sb4.append(layoutParams.height);
        sb4.append(", contentLayoutParams topMargin is ");
        sb4.append(layoutParams.topMargin);
        sb4.append(", contentLayoutParams bottomMargin is ");
        String str6 = ", contentLayoutParams bottomMargin is ";
        sb4.append(layoutParams.bottomMargin);
        Log.m105924i("MiroMsg.CardAdTimeLineItem", sb4.toString());
        TextView textView = dVar.f280050V0;
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (dVar.f280049U0 != null) {
            if (!Util.isNullOrNil(i5.getAdXml().adCardTitle)) {
                dVar.f280049U0.setVisibility(0);
            } else {
                dVar.f280049U0.setVisibility(8);
            }
        }
        dVar.f280054Z0 = true;
        dVar.f280046R0.setTag("");
        if (dVar.f280046R0.getVisibility() == 0) {
            dVar.f280046R0.setVisibility(4);
        }
        ADInfo adInfo = i5.getAdInfo();
        if (adInfo == null || !adInfo.isWeapp() || i5.isTurnCardAd()) {
            str = ", contentLayoutParams topMargin is ";
            if (C99542h0.m129910h(i5.getAdXml(), adInfo)) {
                View view7 = dVar.f280045Q0;
                C9556a aVar4 = new C9556a();
                C60958c.m71442b(0, aVar4);
                View view8 = view7;
                C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                dVar.f280047S0.setText(C0966R.string.d0s);
            }
        } else {
            View view9 = dVar.f280045Q0;
            C9556a aVar5 = new C9556a();
            str = ", contentLayoutParams topMargin is ";
            C60958c.m71442b(0, aVar5);
            View view10 = view9;
            C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            dVar.f280047S0.setText(C0966R.string.j9n);
            C88617x.m110484b(adInfo.actionExtWeApp.f275645a, dVar.f280046R0, adInfo);
        }
        if (dVar.f280045Q0.getVisibility() == 0) {
            if (C85875k4.m106211z()) {
                if (C99542h0.m129910h(this.f280027w.getAdXml(), this.f280027w.getAdInfo())) {
                    dVar.f280048T0.setImageResource(C0966R.raw.album_ad_finder_link_dark_icon);
                } else {
                    dVar.f280048T0.setImageResource(C0966R.raw.album_ad_link_tag_weapp_dark);
                }
            } else if (C99542h0.m129910h(this.f280027w.getAdXml(), this.f280027w.getAdInfo())) {
                dVar.f280048T0.setImageResource(C0966R.raw.album_ad_finder_link_icon);
            } else {
                dVar.f280048T0.setImageResource(C0966R.raw.album_ad_link_tag_weapp);
            }
        }
        String str7 = Util.isNullOrNil(i5.getAdXml().adCardDesc) ? timeLineObject2.ContentDesc : i5.getAdXml().adCardDesc;
        if (!Util.isNullOrNil(str7)) {
            dVar.f280050V0.setText(C96963p0.wx0().mo83004M(dVar.f280050V0.getContext(), str7));
            dVar.f280050V0.setVisibility(0);
            i3 = 8;
        } else {
            i3 = 8;
            dVar.f280050V0.setVisibility(8);
        }
        String str8 = i5.getAdXml().adCardTitle;
        if (Util.isNullOrNil(str8)) {
            dVar.f280049U0.setVisibility(i3);
        } else {
            dVar.f280049U0.setText(C96963p0.wx0().mo83004M(dVar.f280049U0.getContext(), str8));
            dVar.f280049U0.setVisibility(0);
        }
        try {
            if (!i5.getAdXml().adCardTagInfo.f82061a.equals(dVar.f280044P0.getTag())) {
                dVar.f280044P0.removeAllViews();
                if (((ArrayList) i5.getAdXml().adCardTagInfo.f82061a).size() > 0) {
                    dVar.f280044P0.setVisibility(0);
                    dVar.f280044P0.setTagSpace(C76577a.m92151b(this.f279904e, 8));
                    dVar.f280044P0.mo134071a(i5.getAdXml().adCardTagInfo.f82061a);
                    Log.m105918d("MiroMsg.CardAdTimeLineItem", "adCardTagList refreshed");
                }
                dVar.f280044P0.setTag(i5.getAdXml().adCardTagInfo.f82061a);
            } else if (((ArrayList) i5.getAdXml().adCardTagInfo.f82061a).size() > 0) {
                dVar.f280044P0.setVisibility(0);
                Log.m105918d("MiroMsg.CardAdTimeLineItem", "adCardTagList not refreshed");
            }
        } catch (Exception e) {
            Log.m105920e("MiroMsg.CardAdTimeLineItem", e.toString());
        }
        if (C102260r.m134842K(this.f279904e)) {
            dVar.f280044P0.setVisibility(8);
        }
        if (!Util.isNullOrNil(i5.getAdXml().adCard3dHeadTitle)) {
            View view11 = dVar.f280041M0;
            C9556a aVar6 = new C9556a();
            C60958c.m71442b(0, aVar6);
            View view12 = view11;
            C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view12, "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            dVar.f280043O0.setVisibility(0);
            dVar.f280043O0.setText(i5.getAdXml().adCard3dHeadTitle);
        } else {
            dVar.f280043O0.setVisibility(4);
        }
        if (i5.getAdXml().adMediaDisplayMode == 1) {
            int b2 = ((((min - C76577a.m92151b(this.f279904e, 54)) - C76577a.m92151b(this.f279904e, 54)) - this.f279904e.getResources().getDimensionPixelSize(C0966R.dimen.f3906ig)) - this.f279904e.getResources().getDimensionPixelSize(C0966R.dimen.f3926j6)) - this.f279904e.getResources().getDimensionPixelSize(C0966R.dimen.f3956le);
            Log.m105924i("MiroMsg.CardAdTimeLineItem", "adMediaDisplayMode is center and adMediaDisplayWidth is " + b2);
            if (C85875k4.m106197n0() && ((C85875k4.m106156M(MMApplicationContext.getContext()) || C85875k4.m106155L(MMApplicationContext.getContext().getContentResolver())) && !C85878m2.m106213b(this.f279904e.getTaskId()))) {
                b2 = C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.avl);
                Log.m105924i("MiroMsg.CardAdTimeLineItem", "adMediaDisplayMode is center but it becomes magic window and adMediaDisplayWidth is " + b2);
            }
            baseViewHolder2.f279968m.setContentWidth(b2);
            baseViewHolder2.f279968m.mo132052e();
        } else if (i5.getAdXml().adMediaDisplayMode == 2) {
            int b3 = (((min - C76577a.m92151b(this.f279904e, 54)) - this.f279904e.getResources().getDimensionPixelSize(C0966R.dimen.f3906ig)) - this.f279904e.getResources().getDimensionPixelSize(C0966R.dimen.f3926j6)) - this.f279904e.getResources().getDimensionPixelSize(C0966R.dimen.f3956le);
            Log.m105924i("MiroMsg.CardAdTimeLineItem", "adMediaDisplayMode is right and adMediaDisplayWidth is " + b3);
            if (C85875k4.m106197n0() && ((C85875k4.m106156M(MMApplicationContext.getContext()) || C85875k4.m106155L(MMApplicationContext.getContext().getContentResolver())) && !C85878m2.m106213b(this.f279904e.getTaskId()))) {
                b3 = C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.avl);
                Log.m105924i("MiroMsg.CardAdTimeLineItem", "adMediaDisplayMode is right but it becomes magic window and adMediaDisplayWidth is " + b3);
            }
            baseViewHolder2.f279968m.setContentWidth(b3);
            baseViewHolder2.f279968m.mo132052e();
        }
        dVar.f280041M0.setTag(i5.getAdXml().adCard3dHeadUrl);
        if (!Util.isNullOrNil(i5.getAdXml().adCard3dHeadUrl)) {
            C100891r.m132206a(i5.getAdXml().adCard3dHeadUrl, false, 41, 0, new C95912a(this, dVar));
        } else {
            dVar.f280042N0.setVisibility(4);
        }
        if (i5.getAdXml().hasSelectInfo() || i5.getAdXml().hasVoteInfo()) {
            if (i5.getAdXml().isNewStyleVote()) {
                if (this.f280023s == null && (viewStub = (ViewStub) dVar.f280034F0.findViewById(C0966R.C0970id.joi)) != null) {
                    View g = C101432s.m133125g(viewStub);
                    Log.m105924i("MiroMsg.CardAdTimeLineItem", "inflate new style vote button");
                    if (g != null) {
                        this.f280023s = new C96319y2(this.f279904e, dVar.f280034F0, snsTimeLineBaseAdapter2.f278572f);
                        Log.m105924i("MiroMsg.CardAdTimeLineItem", "initialize SnsAdCardVoteCtrl");
                    }
                }
                C96319y2 y2Var2 = this.f280023s;
                if (y2Var2 != null) {
                    y2Var2.mo134157d();
                    this.f280023s.mo134156c(i5, dVar);
                }
                View view13 = dVar.f280038J0;
                C9556a aVar7 = new C9556a();
                C60958c.m71442b(8, aVar7);
                C117292a.m165358d(view13, aVar7.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view13.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view13, "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TextView textView2 = dVar.f280050V0;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                TextView textView3 = dVar.f280049U0;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
            } else {
                C96319y2 y2Var3 = this.f280023s;
                if (y2Var3 != null) {
                    y2Var3.mo134155b();
                }
                View view14 = dVar.f280038J0;
                C9556a aVar8 = new C9556a();
                C60958c.m71442b(0, aVar8);
                C117292a.m165358d(view14, aVar8.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view14.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                C117292a.m165359e(view14, "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int color = this.f279904e.getResources().getColor(C0966R.color.f3144gt);
                int color2 = this.f279904e.getResources().getColor(C0966R.color.BW_0_Alpha_0_2);
                if (!i5.getAdXml().hasVoteInfo() || (b = C100417r0.m131413b(i5.getAdXml().adVoteInfo.f275731a, i5.getUxinfo())) <= 0 || b > 2) {
                    z = true;
                } else {
                    if (b == 1) {
                        dVar.f280040L0.setTextColor(color2);
                        dVar.f280040L0.setText(i5.getAdXml().adVoteInfo.mo131458a(1));
                        dVar.f280039K0.setTextColor(color);
                        dVar.f280039K0.setText(i5.getAdXml().adVoteInfo.mo131459b(0));
                    } else if (b == 2) {
                        dVar.f280039K0.setTextColor(color2);
                        dVar.f280039K0.setText(i5.getAdXml().adVoteInfo.mo131458a(0));
                        dVar.f280040L0.setTextColor(color);
                        dVar.f280040L0.setText(i5.getAdXml().adVoteInfo.mo131459b(1));
                    }
                    z = false;
                }
                if (z) {
                    dVar.f280039K0.setTextColor(color);
                    dVar.f280040L0.setTextColor(color);
                    dVar.f280039K0.setText(i5.getAdXml().getCardSelectLeftTitle());
                    dVar.f280040L0.setText(i5.getAdXml().getCardSelectRightTitle());
                }
            }
        }
        dVar.f280037I0.setScaleType(QImageView.C97274a.CENTER_CROP);
        C101789j00 j002 = timeLineObject2.ContentObj;
        C101804kv2 kv22 = (j002 == null || j002.f298427h.size() < 1) ? null : timeLineObject2.ContentObj.f298427h.get(0);
        C94901o Fx0 = C94866e1.Fx0();
        baseViewHolder2.f279953e0.mo133598a(timeLineObject2, i4, w6Var2.f281381h, w6Var2.f281391r);
        baseViewHolder2.f279953e0.f280508k.setVisibility(8);
        C101236c cVar = new C101236c("MiroMsg.CardAdTimeLineItem");
        cVar.mo140699c(dVar.f280053Y0);
        cVar.mo140700d(timeLineObject2);
        cVar.mo140701e(dVar.f280054Z0);
        cVar.mo140697a();
        mo133416D(i5, snsTimeLineBaseAdapter2);
        if (kv22 != null) {
            int dimensionPixelSize = (layoutParams.width - this.f279904e.getResources().getDimensionPixelSize(C0966R.dimen.f3956le)) - this.f279904e.getResources().getDimensionPixelSize(C0966R.dimen.f3956le);
            C101817mv2 mv22 = kv22.f298698p;
            int i7 = (int) ((((float) dimensionPixelSize) * mv22.f298876e) / mv22.f298875d);
            Log.m105924i("MiroMsg.CardAdTimeLineItem", "fillItem, adMediaDisplayWidth is " + dimensionPixelSize + ", adMediaDisplayHeight is " + i7);
            Log.m105924i("MiroMsg.CardAdTimeLineItem", "fillItem, contentLayoutParams width is " + layoutParams.width + ", contentLayoutParams height is " + layoutParams.height + str + layoutParams.topMargin + str6 + layoutParams.bottomMargin);
            C101432s.m133132n(dVar.f280053Y0, false);
            int i8 = baseViewHolder2.timeLineObject.ContentObj.f298424e;
            if (i8 == 1) {
                dVar.f280037I0.setVisibility(0);
                View view15 = dVar.f279953e0.f280501d;
                C9556a aVar9 = new C9556a();
                C60958c.m71442b(4, aVar9);
                View view16 = view15;
                C117292a.m165358d(view16, aVar9.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view15.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                C117292a.m165359e(view16, "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ViewGroup.LayoutParams layoutParams2 = dVar.f280037I0.getLayoutParams();
                layoutParams2.width = dimensionPixelSize;
                layoutParams2.height = i7;
                dVar.f280037I0.setLayoutParams(layoutParams2);
                dVar.f279953e0.f280501d.setLayoutParams(layoutParams2);
                C94901o Fx02 = C94866e1.Fx0();
                MaskImageView maskImageView = dVar.f280037I0;
                int hashCode = this.f279904e.hashCode();
                C96983o3 c = C96983o3.m124651c();
                c.f284145b = timeLineObject2.CreateTime;
                Fx02.mo131114e0(kv22, maskImageView, -1, hashCode, c);
                dVar.f280037I0.setTag(dVar);
                dVar.f280039K0.setTag(dVar);
                dVar.f280040L0.setTag(dVar);
                dVar.f280037I0.setOnClickListener(snsTimeLineBaseAdapter2.f278572f.f280385o);
                dVar.f280052X0 = false;
                AdLivingStreamContainer adLivingStreamContainer = dVar.f280062h1;
                if (adLivingStreamContainer != null) {
                    adLivingStreamContainer.setVisibility(8);
                }
                C54550e eVar = this.f280029y;
                if (eVar != null) {
                    eVar.mo75433h();
                }
            } else if (i8 != 5 && i8 != 15) {
                baseViewHolder2.f279953e0.f280509l.setVisibility(8);
                AdLivingStreamContainer adLivingStreamContainer2 = dVar.f280062h1;
                if (adLivingStreamContainer2 != null) {
                    adLivingStreamContainer2.setVisibility(8);
                }
                C54550e eVar2 = this.f280029y;
                if (eVar2 != null) {
                    eVar2.mo75433h();
                }
            } else if (C54550e.m61296a(i5)) {
                mo133420H(i5);
                mo133419G(dVar, i5, kv22, dimensionPixelSize, i7);
            } else {
                AdLivingStreamContainer adLivingStreamContainer3 = dVar.f280062h1;
                if (adLivingStreamContainer3 != null) {
                    adLivingStreamContainer3.setVisibility(8);
                }
                C54550e eVar3 = this.f280029y;
                if (eVar3 != null) {
                    eVar3.mo75433h();
                }
                C101432s.m133132n(dVar.f280053Y0, true);
                View view17 = dVar.f279953e0.f280501d;
                C9556a aVar10 = new C9556a();
                C60958c.m71442b(0, aVar10);
                View view18 = view17;
                C117292a.m165358d(view18, aVar10.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view17.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                C117292a.m165359e(view18, "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                dVar.f280037I0.setVisibility(4);
                ViewGroup.LayoutParams layoutParams3 = dVar.f279953e0.f280501d.getLayoutParams();
                layoutParams3.width = dimensionPixelSize;
                layoutParams3.height = i7;
                dVar.f279953e0.f280501d.setLayoutParams(layoutParams3);
                if (dVar.f280054Z0) {
                    C99556n.m129940c(i5, kv22);
                }
                long nanoTime = System.nanoTime();
                boolean x = Fx0.mo131141x(kv22);
                Log.m105925i("MiroMsg.CardAdTimeLineItem", "isMediaSightExist %b duration %s", Boolean.valueOf(x), Long.valueOf(System.nanoTime() - nanoTime));
                C96066m2 m2Var = dVar.f279953e0;
                if (!x) {
                    if (Fx0.mo131140w(kv22)) {
                        m2Var.f280506i.setVisibility(8);
                        m2Var.f280507j.setVisibility(0);
                        m2Var.f280507j.mo153891a();
                    } else if (Fx0.mo131133p(i5) == 5) {
                        Fx0.mo131097Q(kv22);
                        m2Var.f280506i.setVisibility(8);
                        m2Var.f280507j.setVisibility(0);
                        m2Var.f280507j.mo153891a();
                    } else if (Fx0.mo131137t(kv22)) {
                        m2Var.f280507j.setVisibility(8);
                        m2Var.f280506i.setImageResource(C0966R.raw.shortvideo_play_icon_err);
                        m2Var.f280506i.setVisibility(0);
                    } else {
                        Fx0.mo131098R(kv22);
                        m2Var.f280506i.setVisibility(0);
                        m2Var.f280507j.setVisibility(8);
                        m2Var.f280506i.setImageDrawable(C76577a.m92158i(this.f279904e, C0966R.raw.shortvideo_play_btn));
                        m2Var.f280506i.setContentDescription(this.f279904e.getString(C0966R.string.f361136hk0));
                        if (Fx0.mo131133p(i5) == 4) {
                            m2Var.f280508k.setVisibility(0);
                        }
                    }
                } else if (Fx0.mo131143z(kv22)) {
                    m2Var.f280506i.setVisibility(0);
                    m2Var.f280507j.setVisibility(8);
                    m2Var.f280506i.setImageDrawable(C76577a.m92158i(this.f279904e, C0966R.raw.shortvideo_play_btn));
                    m2Var.f280506i.setContentDescription(this.f279904e.getString(C0966R.string.f361136hk0));
                } else if (Fx0.mo131139v(kv22)) {
                    m2Var.f280506i.setVisibility(8);
                    m2Var.f280507j.setVisibility(8);
                } else if (Fx0.mo131133p(i5) > 5) {
                    Fx0.mo131098R(kv22);
                    m2Var.f280506i.setVisibility(0);
                    m2Var.f280507j.setVisibility(8);
                    m2Var.f280506i.setImageDrawable(C76577a.m92158i(this.f279904e, C0966R.raw.shortvideo_play_btn));
                    m2Var.f280506i.setContentDescription(this.f279904e.getString(C0966R.string.f361136hk0));
                } else if (!dVar.f280052X0) {
                    Log.m105924i("MiroMsg.CardAdTimeLineItem", "fillItem, showPlayBtn");
                    mo133423K();
                }
                dVar.f280039K0.setTag(dVar);
                dVar.f280040L0.setTag(dVar);
                m2Var.f280505h.setTag(dVar);
                C101432s.m133131m(dVar.f279953e0.f280503f, dimensionPixelSize, i7);
                dVar.f279953e0.f280503f.requestLayout();
                C94901o Fx03 = C94866e1.Fx0();
                ImageView imageView = dVar.f279953e0.f280503f;
                int hashCode2 = this.f279904e.hashCode();
                C96983o3 c2 = C96983o3.m124651c();
                c2.mo135628a(timeLineObject2.CreateTime);
                Fx03.mo131114e0(kv22, imageView, -1, hashCode2, c2);
                dVar.f279953e0.f280503f.setTag(this.f280028x);
                C101432s.m133132n(dVar.f279953e0.f280503f, true);
                String e2 = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d);
                String T = C102236a0.m134725T(kv22);
                if (C86013q1.m106450k(e2 + T)) {
                    snsTimeLineBaseAdapter2.f278568b.f276699f.mo138292G(w6Var2.f281383j, (int) kv22.f298684R, true);
                    C99556n.m129942e();
                } else {
                    snsTimeLineBaseAdapter2.f278568b.f276699f.mo138292G(w6Var2.f281383j, (int) kv22.f298684R, false);
                }
                snsTimeLineBaseAdapter2.f278568b.f276699f.mo138290E(w6Var2.f281383j, C94866e1.Fx0().mo131133p(i5) == 5, 1);
                if (dVar.f280054Z0) {
                    Log.m105918d("MiroMsg.CardAdTimeLineItem", "in fillitem, the user online video is true");
                    C101432s.m133131m(dVar.f280053Y0, dimensionPixelSize, i7);
                    ViewGroup viewGroup2 = dVar.f280053Y0;
                    C101237d dVar2 = new C101237d("MiroMsg.CardAdTimeLineItem");
                    SnsMethodCalculate.markStartTimeMs("container", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
                    dVar2.f296432b = viewGroup2;
                    SnsMethodCalculate.markEndTimeMs("container", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
                    SnsMethodCalculate.markStartTimeMs("mediaObject", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
                    dVar2.f296434d = kv22;
                    SnsMethodCalculate.markEndTimeMs("mediaObject", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
                    SnsMethodCalculate.markStartTimeMs("timelineObject", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
                    dVar2.f296433c = timeLineObject2;
                    SnsMethodCalculate.markEndTimeMs("timelineObject", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
                    String str9 = baseViewHolder2.f279956g;
                    SnsMethodCalculate.markStartTimeMs("snsLocalId", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
                    dVar2.f296435e = str9;
                    SnsMethodCalculate.markEndTimeMs("snsLocalId", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
                    SnsMethodCalculate.markStartTimeMs("layout", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
                    try {
                        dVar2.mo140702a();
                    } catch (Throwable unused) {
                    }
                    SnsMethodCalculate.markEndTimeMs("layout", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
                    C101432s.m133132n(dVar.f279953e0.f280507j, false);
                }
            }
        }
        if (this.f280030z != null) {
            Log.m105924i("MiroMsg.CardAdTimeLineItem", "bindActionButton " + i5.getSnsId());
            this.f280030z.mo133971d(i5);
        }
        mo133421I(i5);
        if (!C54550e.m61296a(i5)) {
            mo133420H(i5);
        } else if (!(!mo133424a(i5) || (timeLine = i5.getTimeLine()) == null || this.f280024t == null)) {
            int c3 = C94762a.m120036c(timeLine.f283893Id, i5.getAdXml().adLiveInfo.f264555a);
            C94764b bVar = this.f280024t;
            C96177r2 r2Var = this.f280022r;
            bVar.getClass();
            SnsMethodCalculate.markStartTimeMs("setSnsAdCardActionBtnCtrl", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            bVar.f274436e = r2Var;
            SnsMethodCalculate.markEndTimeMs("setSnsAdCardActionBtnCtrl", "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController");
            this.f280024t.mo130561i(c3);
        }
        mo133422J(i5);
        baseViewHolder2.f279985u0 = false;
        mo133391g(w6Var2, 3);
        SnsMethodCalculate.markEndTimeMs(str3, str5);
    }

    public void pause() {
        SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        Log.m105924i("MiroMsg.CardAdTimeLineItem", "pause");
        if (mo133418F()) {
            mo133423K();
        }
        SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
    }

    public void stop() {
        C54550e eVar;
        SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        Log.m105925i("MiroMsg.CardAdTimeLineItem", "%s cardAd stop", this);
        this.f280026v = false;
        if (C54550e.m61296a(this.f280027w) && (eVar = this.f280029y) != null) {
            eVar.mo75431f();
        }
        SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
    }

    /* renamed from: t */
    public String mo81016t() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        return "CardAdTimeLineItem";
    }
}
