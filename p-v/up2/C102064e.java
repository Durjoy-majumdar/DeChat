package up2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import co2.C92442i;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.model.C94851d1;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p104ad.timeline.helper.ActionBtnFollowFinderHelper;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import gy3.C8480h;
import ht1.C60187m5;
import ht1.C60208v1;
import j20.C117292a;
import jp2.C98961m;
import jp2.C98963o;
import k20.C9556a;
import ke3.C88144b;
import ko2.C46734a;
import lo2.C34318c;
import lo2.C99542h0;
import lo2.C99552l;
import or2.C100381a;
import p214om.C11502f;
import p749xh.C102646h;
import ps2.C100853b;
import ps2.C100894u;
import sf0.C90188n0;
import vr2.C102236a0;
import vr2.C102260r;

/* renamed from: up2.e */
public class C102064e {

    /* renamed from: a */
    public int f300560a;

    /* renamed from: b */
    public int f300561b;

    /* renamed from: c */
    public int f300562c;

    /* renamed from: d */
    public SnsInfo f300563d;

    /* renamed from: e */
    public Context f300564e;

    /* renamed from: f */
    public C94851d1 f300565f;

    /* renamed from: g */
    public boolean f300566g = false;

    /* renamed from: h */
    public AdClickActionInfo f300567h;

    /* renamed from: i */
    public C98963o f300568i;

    /* renamed from: j */
    public C102068b f300569j;

    /* renamed from: k */
    public C102069c f300570k;

    /* renamed from: l */
    public int f300571l = 0;

    /* renamed from: m */
    public ActionBtnFollowFinderHelper f300572m;

    /* renamed from: up2.e$a */
    public class C102065a implements C60208v1.C60209a {

        /* renamed from: a */
        public final /* synthetic */ SnsAdClick f300573a;

        /* renamed from: up2.e$a$a */
        public class C102066a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f300575d;

            /* renamed from: e */
            public final /* synthetic */ int f300576e;

            public C102066a(int i, int i2) {
                this.f300575d = i;
                this.f300576e = i2;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler$2$1");
                C102064e eVar = C102064e.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                ActionBtnFollowFinderHelper actionBtnFollowFinderHelper = eVar.f300572m;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                if (actionBtnFollowFinderHelper == null) {
                    C102064e eVar2 = C102064e.this;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                    Context context = eVar2.f300564e;
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                    C102064e eVar3 = C102064e.this;
                    SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                    C102069c cVar = eVar3.f300570k;
                    SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                    ViewGroup a = cVar.mo132650a();
                    C102064e eVar4 = C102064e.this;
                    SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                    int i = eVar4.f300561b;
                    SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                    C102064e eVar5 = C102064e.this;
                    SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                    C102068b bVar = eVar5.f300569j;
                    SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                    ActionBtnFollowFinderHelper actionBtnFollowFinderHelper2 = new ActionBtnFollowFinderHelper(context, a, i, bVar);
                    SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                    eVar2.f300572m = actionBtnFollowFinderHelper2;
                    SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                }
                C102064e eVar6 = C102064e.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                ActionBtnFollowFinderHelper actionBtnFollowFinderHelper3 = eVar6.f300572m;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                AdClickActionInfo a2 = C102064e.m134450a(C102064e.this);
                SnsInfo b = C102064e.m134451b(C102064e.this);
                int i2 = this.f300575d;
                int i3 = this.f300576e;
                actionBtnFollowFinderHelper3.getClass();
                SnsMethodCalculate.markStartTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
                Log.m105924i("ActionBtnFollowFinderHelper", "showBottomSheet, followNum=" + i2 + ", feedNum=" + i3 + ", userName=" + a2.finderUsername + ", snsId=" + C102236a0.m134765q0(b.field_snsId));
                actionBtnFollowFinderHelper3.f274164f = a2;
                actionBtnFollowFinderHelper3.f274163e = b;
                SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderFollowInfo");
                C92442i iVar = new C92442i();
                iVar.f264532a = Util.nullAsNil(a2.finderUsername);
                iVar.f264533b = Util.nullAsNil(a2.f273623K);
                iVar.f264534c = Util.nullAsNil(a2.f273624L);
                iVar.f264535d = Util.nullAsNil(a2.f273626N);
                iVar.f264536e = Util.nullAsNil(a2.f273648e0);
                iVar.f264537f = Util.nullAsNil(a2.f273646d0);
                iVar.f264538g = Util.nullAsNil(a2.f273644c0);
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderFollowInfo");
                actionBtnFollowFinderHelper3.f274165g = iVar;
                actionBtnFollowFinderHelper3.mo130397d(iVar, i2, i3);
                SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler$2$1");
            }
        }

        /* renamed from: up2.e$a$b */
        public class C102067b implements Runnable {
            public C102067b() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler$2$2");
                int c = C99542h0.m129905c(C102064e.m134450a(C102064e.this).f273639a);
                ADInfo adInfo = C102064e.m134451b(C102064e.this).getAdInfo();
                C102064e eVar = C102064e.this;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                Context context = eVar.f300564e;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                C99542h0.m129907e(context, C102064e.m134451b(C102064e.this).getUxinfo(), C102064e.m134450a(C102064e.this).finderUsername, C102064e.m134450a(C102064e.this).f273644c0, C102064e.m134450a(C102064e.this).f273646d0, C102064e.m134451b(C102064e.this).field_snsId, adInfo.preloadFinderFeed, c);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler$2$2");
            }
        }

        public C102065a(SnsAdClick snsAdClick) {
            this.f300573a = snsAdClick;
        }

        /* renamed from: a */
        public void mo78737a(C60187m5 m5Var) {
            SnsMethodCalculate.markStartTimeMs("onDone", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler$2");
            if (m5Var != null) {
                int followFlag = m5Var.getFollowFlag();
                int k2 = m5Var.mo84186k2();
                int feedCount = m5Var.getFeedCount();
                Log.m105924i("AdClickActionHandler", "handleQuickAddFinder, getFinderContact onDone, followFlg=" + followFlag + ", followNum=" + k2 + ", feedNum=" + feedCount);
                if (followFlag == 0) {
                    this.f300573a.f267473h = 47;
                    MMHandlerThread.postToMainThread(new C102066a(k2, feedCount));
                } else {
                    this.f300573a.f267473h = 37;
                    MMHandlerThread.postToMainThread(new C102067b());
                }
                C102236a0.m134773u0(this.f300573a);
            } else {
                Log.m105920e("AdClickActionHandler", "handleQuickAddFinder, getFinderContact onDone, iLocalFinderContact==null");
            }
            SnsMethodCalculate.markEndTimeMs("onDone", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler$2");
        }
    }

    /* renamed from: up2.e$b */
    public interface C102068b {
    }

    /* renamed from: up2.e$c */
    public interface C102069c {
        /* renamed from: a */
        ViewGroup mo132650a();

        /* renamed from: b */
        void mo132651b();
    }

    public C102064e(Context context, int i, C98963o oVar, C102068b bVar, C102069c cVar) {
        this.f300564e = context;
        this.f300561b = i;
        this.f300568i = oVar;
        this.f300569j = bVar;
        this.f300570k = cVar;
    }

    /* renamed from: a */
    public static /* synthetic */ AdClickActionInfo m134450a(C102064e eVar) {
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        AdClickActionInfo adClickActionInfo = eVar.f300567h;
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        return adClickActionInfo;
    }

    /* renamed from: b */
    public static /* synthetic */ SnsInfo m134451b(C102064e eVar) {
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        SnsInfo snsInfo = eVar.f300563d;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        return snsInfo;
    }

    /* renamed from: c */
    public static Intent m134452c(SnsInfo snsInfo, Activity activity, int i, View view, int i2) {
        SnsMethodCalculate.markStartTimeMs("getNativeLandingPageUIIntent", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        if (C100894u.m132239s(snsInfo.getAdSnsInfo().field_adxml)) {
            Intent intent = new Intent();
            intent.putExtra("sns_landing_pages_share_sns_id", snsInfo.getSnsId());
            intent.putExtra("sns_landing_pages_rawSnsId", snsInfo.getTimeLine().f283893Id);
            intent.putExtra("sns_landing_pages_ux_info", snsInfo.getUxinfo());
            intent.setClass(activity, SnsAdNativeLandingPagesUI.class);
            boolean z = true;
            intent.putExtra("sns_landig_pages_from_source", i == 2 ? 16 : i == 1 ? 2 : 1);
            intent.putExtra("sns_landing_pages_xml", snsInfo.getAdSnsInfo().field_adxml);
            intent.putExtra("sns_landing_pages_rec_src", snsInfo.getAdRecSrc());
            intent.putExtra("sns_landing_pages_xml_prefix", C102646h.COL_ADXML);
            intent.putExtra("sns_landing_page_start_time", System.currentTimeMillis());
            if (view != null) {
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                int width = view.getWidth();
                int height = view.getHeight();
                intent.putExtra("img_gallery_left", iArr[0]);
                intent.putExtra("img_gallery_top", iArr[1]);
                intent.putExtra("img_gallery_width", width);
                intent.putExtra("img_gallery_height", height);
                intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
            } else {
                intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
            }
            TimeLineObject timeLine = snsInfo.getTimeLine();
            if (timeLine.ContentObj.f298424e != 15 || timeLine.sightFolded == 1) {
                z = false;
            }
            intent.putExtra("sns_landing_is_native_sight_ad", z);
            intent.putExtra("sns_landing_pages_from_outer_index", i2);
            SnsMethodCalculate.markEndTimeMs("getNativeLandingPageUIIntent", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            return intent;
        }
        Log.m105920e("AdClickActionHandler", "adxml is invalid, snsId=" + C102236a0.m134765q0(snsInfo.field_snsId));
        SnsMethodCalculate.markEndTimeMs("getNativeLandingPageUIIntent", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        return null;
    }

    /* renamed from: k */
    public static void m134453k(Activity activity, String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("jumpCardDetail", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        Log.m105924i("AdClickActionHandler", "jumpCardDetail, cardTpId=" + str + ", cardExt=" + str2);
        Intent intent = new Intent();
        intent.putExtra("key_card_id", str);
        intent.putExtra("key_card_ext", str2);
        intent.putExtra("key_from_scene", 21);
        intent.putExtra("key_stastic_scene", 15);
        C88144b.m109791i(activity, "card", ".ui.CardDetailUI", intent, (Bundle) null);
        SnsMethodCalculate.markEndTimeMs("jumpCardDetail", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }

    /* renamed from: m */
    public static boolean m134454m(SnsInfo snsInfo, SnsAdClick snsAdClick, int i, Context context) {
        SnsMethodCalculate.markStartTimeMs("jumpUpdateWebUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        try {
            String adInfoLink = snsInfo.getAdInfoLink();
            if (TextUtils.isEmpty(adInfoLink)) {
                adInfoLink = snsInfo.getAdLink();
            }
            if (TextUtils.isEmpty(adInfoLink)) {
                Log.m105920e("AdClickActionHandler", "jumpUpdateWebUI both url is empty");
                SnsMethodCalculate.markEndTimeMs("jumpUpdateWebUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                return false;
            }
            m134455n(adInfoLink, snsInfo, snsAdClick, i, context);
            SnsMethodCalculate.markEndTimeMs("jumpUpdateWebUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            return true;
        } catch (Throwable th) {
            Log.m105920e("AdClickActionHandler", "jumpUpdateWebUI, exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("jumpUpdateWebUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            return false;
        }
    }

    /* renamed from: n */
    public static void m134455n(String str, SnsInfo snsInfo, SnsAdClick snsAdClick, int i, Context context) {
        ADInfo adInfo;
        SnsMethodCalculate.markStartTimeMs("jumpWebUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        Log.m105924i("AdClickActionHandler", "jumpWebUI, url=" + str + ", source=" + i + ", snsInfo=" + snsInfo);
        if (TextUtils.isEmpty(str) || snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("jumpWebUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            return;
        }
        Intent intent = new Intent();
        boolean z = false;
        boolean z2 = snsInfo.getAdXml().webrightBar == 0;
        if (!C90188n0.f258957y) {
            z = z2;
        }
        if (snsInfo.isAd() && (adInfo = snsInfo.getAdInfo(i)) != null) {
            intent.putExtra("KsnsViewId", adInfo.viewId);
            str = C46734a.m52032e(C102236a0.m134734b(str, adInfo.uxInfo));
            C102236a0.m134736c(intent, adInfo.uxInfo);
        }
        intent.putExtra("KRightBtn", z);
        Bundle bundle = new Bundle();
        if (snsAdClick != null) {
            bundle.putParcelable("KSnsAdTag", snsAdClick);
        }
        bundle.putString("key_snsad_statextstr", snsInfo.getTimeLine().statExtStr);
        intent.putExtra("jsapiargs", bundle);
        intent.putExtra("rawUrl", str);
        intent.putExtra("useJs", true);
        intent.putExtra("srcUsername", snsInfo.field_userName);
        intent.putExtra("stastic_scene", 15);
        intent.putExtra("KPublisherId", "sns_" + C102236a0.m134765q0(snsInfo.field_snsId));
        intent.putExtra("pre_username", snsInfo.field_userName);
        intent.putExtra("prePublishId", "sns_" + C102236a0.m134765q0(snsInfo.field_snsId));
        intent.putExtra("preUsername", snsInfo.field_userName);
        if (i == 0) {
            C102236a0.m134732a(intent, 81);
        } else {
            C102236a0.m134732a(intent, 82);
        }
        ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93190w(intent, context);
        SnsMethodCalculate.markEndTimeMs("jumpWebUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }

    /* renamed from: d */
    public final void mo141555d(C44668u3 u3Var, C72996z1 z1Var, SnsAdClick snsAdClick) {
        SnsMethodCalculate.markStartTimeMs("handleAddBrand", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        if (z1Var != null) {
            try {
                if (z1Var.mo62927s3()) {
                    C100381a.m131292f(this.f300564e, this.f300563d, snsAdClick, this.f300561b, this.f300567h);
                    SnsMethodCalculate.markEndTimeMs("handleAddBrand", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                }
            } catch (Throwable th) {
                Log.m105920e("AdClickActionHandler", th.toString());
            }
        }
        new C100381a().mo139669i(this.f300564e, this.f300563d, this.f300567h, this.f300561b, u3Var, z1Var, this.f300569j);
        SnsMethodCalculate.markEndTimeMs("handleAddBrand", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: com.tencent.mm.storage.z1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v20, resolved type: com.tencent.mm.storage.z1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v45, resolved type: com.tencent.mm.storage.z1} */
    /* JADX WARNING: type inference failed for: r14v9 */
    /* JADX WARNING: type inference failed for: r14v33 */
    /* JADX WARNING: type inference failed for: r14v36 */
    /* JADX WARNING: type inference failed for: r14v41 */
    /* JADX WARNING: type inference failed for: r14v47 */
    /* JADX WARNING: type inference failed for: r14v48 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0457 A[Catch:{ Exception -> 0x0468 }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x045e A[Catch:{ Exception -> 0x0468 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo141556e(android.view.View r29) {
        /*
            r28 = this;
            r8 = r28
            java.lang.String r9 = "AdClickActionHandler"
            java.lang.String r10 = "handleClick"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r11)
            int r0 = r8.f300560a     // Catch:{ Exception -> 0x0468 }
            r1 = 39
            r2 = 11
            r3 = 37
            r5 = 26
            r6 = 21
            r7 = 3
            r12 = 2
            r13 = 1
            if (r0 != r13) goto L_0x001d
            goto L_0x005c
        L_0x001d:
            if (r0 != r12) goto L_0x0022
            r5 = 33
            goto L_0x005c
        L_0x0022:
            if (r0 != r7) goto L_0x0027
            r5 = 34
            goto L_0x005c
        L_0x0027:
            r14 = 4
            if (r0 != r14) goto L_0x002d
            r5 = 35
            goto L_0x005c
        L_0x002d:
            r14 = 5
            if (r0 != r14) goto L_0x0033
            r5 = 1001(0x3e9, float:1.403E-42)
            goto L_0x005c
        L_0x0033:
            r14 = 6
            if (r0 != r14) goto L_0x0039
            r5 = 1002(0x3ea, float:1.404E-42)
            goto L_0x005c
        L_0x0039:
            r14 = 7
            if (r0 == r14) goto L_0x005a
            r14 = 8
            if (r0 != r14) goto L_0x0041
            goto L_0x005a
        L_0x0041:
            r14 = 9
            if (r0 != r14) goto L_0x0048
            r5 = 37
            goto L_0x005c
        L_0x0048:
            r14 = 10
            if (r0 != r14) goto L_0x004e
            r5 = 3
            goto L_0x005c
        L_0x004e:
            if (r0 != r2) goto L_0x0053
            r5 = 39
            goto L_0x005c
        L_0x0053:
            r14 = 12
            if (r0 != r14) goto L_0x005c
            r5 = 40
            goto L_0x005c
        L_0x005a:
            r5 = 21
        L_0x005c:
            com.tencent.mm.modelsns.SnsAdClick r15 = new com.tencent.mm.modelsns.SnsAdClick     // Catch:{ Exception -> 0x0468 }
            int r0 = r8.f300561b     // Catch:{ Exception -> 0x0468 }
            if (r0 != 0) goto L_0x0065
            r16 = 1
            goto L_0x0067
        L_0x0065:
            r16 = 2
        L_0x0067:
            com.tencent.mm.plugin.sns.storage.SnsInfo r14 = r8.f300563d     // Catch:{ Exception -> 0x0468 }
            long r12 = r14.field_snsId     // Catch:{ Exception -> 0x0468 }
            r20 = 0
            r14 = r15
            r4 = r15
            r15 = r0
            r17 = r12
            r19 = r5
            r14.<init>(r15, r16, r17, r19, r20)     // Catch:{ Exception -> 0x0468 }
            jp2.o r0 = r8.f300568i     // Catch:{ Exception -> 0x0468 }
            com.tencent.mm.plugin.sns.storage.SnsInfo r12 = r8.f300563d     // Catch:{ Exception -> 0x0468 }
            int r13 = r8.f300562c     // Catch:{ Exception -> 0x0468 }
            vr2.C102260r.m134865e(r4, r0, r12, r5, r13)     // Catch:{ Exception -> 0x0468 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0438 }
            r0.<init>()     // Catch:{ Exception -> 0x0438 }
            java.lang.String r5 = "handleClick, type="
            r0.append(r5)     // Catch:{ Exception -> 0x0438 }
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r5 = r8.f300567h     // Catch:{ Exception -> 0x0438 }
            int r5 = r5.f273641b     // Catch:{ Exception -> 0x0438 }
            r0.append(r5)     // Catch:{ Exception -> 0x0438 }
            java.lang.String r5 = ", snsId="
            r0.append(r5)     // Catch:{ Exception -> 0x0438 }
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r8.f300563d     // Catch:{ Exception -> 0x0438 }
            long r13 = r5.field_snsId     // Catch:{ Exception -> 0x0438 }
            java.lang.String r5 = vr2.C102236a0.m134765q0(r13)     // Catch:{ Exception -> 0x0438 }
            r0.append(r5)     // Catch:{ Exception -> 0x0438 }
            java.lang.String r5 = ", scene="
            r0.append(r5)     // Catch:{ Exception -> 0x0438 }
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r5 = r8.f300567h     // Catch:{ Exception -> 0x0438 }
            int r5 = r5.f273639a     // Catch:{ Exception -> 0x0438 }
            r0.append(r5)     // Catch:{ Exception -> 0x0438 }
            java.lang.String r5 = ", subPos="
            r0.append(r5)     // Catch:{ Exception -> 0x0438 }
            int r5 = r8.f300562c     // Catch:{ Exception -> 0x0438 }
            r0.append(r5)     // Catch:{ Exception -> 0x0438 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0438 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)     // Catch:{ Exception -> 0x0438 }
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r0 = r8.f300567h     // Catch:{ Exception -> 0x0438 }
            int r5 = r0.f273641b     // Catch:{ Exception -> 0x0438 }
            java.lang.String r13 = ""
            r14 = 0
            switch(r5) {
                case 0: goto L_0x03cf;
                case 1: goto L_0x0386;
                case 2: goto L_0x0357;
                case 3: goto L_0x033b;
                case 4: goto L_0x0309;
                case 5: goto L_0x02f7;
                case 6: goto L_0x02a3;
                case 7: goto L_0x0265;
                case 8: goto L_0x00c8;
                case 9: goto L_0x00c8;
                case 10: goto L_0x00c8;
                case 11: goto L_0x00c8;
                case 12: goto L_0x023c;
                case 13: goto L_0x0230;
                case 14: goto L_0x020b;
                case 15: goto L_0x01ed;
                case 16: goto L_0x019d;
                case 17: goto L_0x00c8;
                case 18: goto L_0x0193;
                case 19: goto L_0x0188;
                case 20: goto L_0x0144;
                case 21: goto L_0x010c;
                case 22: goto L_0x00ce;
                default: goto L_0x00c8;
            }
        L_0x00c8:
            r14 = r4
            r1 = 0
            android.content.Context r0 = r8.f300564e     // Catch:{ Exception -> 0x03df }
            goto L_0x03e1
        L_0x00ce:
            r0 = 54
            r4.f267473h = r0     // Catch:{ Exception -> 0x02f3 }
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r8.f300563d     // Catch:{ Exception -> 0x02f3 }
            int r1 = r8.f300561b     // Catch:{ Exception -> 0x02f3 }
            com.tencent.mm.plugin.sns.storage.ADInfo r0 = r0.getAdInfo(r1)     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r15 = r0.uxInfo     // Catch:{ Exception -> 0x02f3 }
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r8.f300563d     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r16 = r0.getAid()     // Catch:{ Exception -> 0x02f3 }
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r8.f300563d     // Catch:{ Exception -> 0x02f3 }
            long r0 = r0.field_snsId     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r17 = vr2.C102236a0.m134765q0(r0)     // Catch:{ Exception -> 0x02f3 }
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r0 = r8.f300567h     // Catch:{ Exception -> 0x02f3 }
            co2.u r13 = r0.f273670p0     // Catch:{ Exception -> 0x02f3 }
            if (r13 == 0) goto L_0x018f
            android.content.Context r0 = r8.f300564e     // Catch:{ Exception -> 0x02f3 }
            boolean r1 = r0 instanceof com.tencent.p014mm.p136ui.MMActivity     // Catch:{ Exception -> 0x02f3 }
            if (r1 == 0) goto L_0x018f
            r14 = r0
            com.tencent.mm.ui.MMActivity r14 = (com.tencent.p014mm.p136ui.MMActivity) r14     // Catch:{ Exception -> 0x02f3 }
            int r0 = r8.f300561b     // Catch:{ Exception -> 0x02f3 }
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = r8.f300563d     // Catch:{ Exception -> 0x02f3 }
            com.tencent.mm.plugin.sns.storage.ADXml r1 = r1.getAdXml()     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r1 = r1.adExtInfo     // Catch:{ Exception -> 0x02f3 }
            r18 = r0
            r19 = r1
            lo2.C61326u.m71941e(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x02f3 }
            goto L_0x018f
        L_0x010c:
            r0 = 53
            r4.f267473h = r0     // Catch:{ Exception -> 0x02f3 }
            int r0 = r8.f300561b     // Catch:{ Exception -> 0x02f3 }
            if (r0 == 0) goto L_0x0116
            r0 = 2
            goto L_0x0117
        L_0x0116:
            r0 = 1
        L_0x0117:
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = r8.f300563d     // Catch:{ Exception -> 0x02f3 }
            long r1 = r1.field_snsId     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r1 = vr2.C102236a0.m134765q0(r1)     // Catch:{ Exception -> 0x02f3 }
            up2.f$a r2 = new up2.f$a     // Catch:{ Exception -> 0x02f3 }
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = r8.f300563d     // Catch:{ Exception -> 0x02f3 }
            int r5 = r8.f300561b     // Catch:{ Exception -> 0x02f3 }
            com.tencent.mm.plugin.sns.storage.ADInfo r3 = r3.getAdInfo(r5)     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r3 = r3.uxInfo     // Catch:{ Exception -> 0x02f3 }
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r8.f300563d     // Catch:{ Exception -> 0x02f3 }
            com.tencent.mm.plugin.sns.storage.ADXml r5 = r5.getAdXml()     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r5 = r5.adExtInfo     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)     // Catch:{ Exception -> 0x02f3 }
            r2.<init>(r3, r1, r0, r5)     // Catch:{ Exception -> 0x02f3 }
            android.content.Context r0 = r8.f300564e     // Catch:{ Exception -> 0x02f3 }
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r1 = r8.f300567h     // Catch:{ Exception -> 0x02f3 }
            co2.e r1 = r1.f273668o0     // Catch:{ Exception -> 0x02f3 }
            up2.C78269f.m94560a(r0, r1, r2)     // Catch:{ Exception -> 0x02f3 }
            goto L_0x018f
        L_0x0144:
            r4.f267473h = r6     // Catch:{ Exception -> 0x02f3 }
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r8.f300563d     // Catch:{ Exception -> 0x02f3 }
            int r1 = r8.f300561b     // Catch:{ Exception -> 0x02f3 }
            com.tencent.mm.plugin.sns.storage.ADInfo r0 = r0.getAdInfo(r1)     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r0 = r0.uxInfo     // Catch:{ Exception -> 0x02f3 }
            android.content.Context r1 = r8.f300564e     // Catch:{ Exception -> 0x02f3 }
            boolean r2 = r1 instanceof com.tencent.p014mm.p136ui.MMActivity     // Catch:{ Exception -> 0x02f3 }
            if (r2 == 0) goto L_0x018f
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r2 = r8.f300567h     // Catch:{ Exception -> 0x02f3 }
            long r14 = r2.f273662l0     // Catch:{ Exception -> 0x02f3 }
            int r3 = r8.f300561b     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r5 = r2.f273664m0     // Catch:{ Exception -> 0x02f3 }
            r19 = r1
            com.tencent.mm.ui.MMActivity r19 = (com.tencent.p014mm.p136ui.MMActivity) r19     // Catch:{ Exception -> 0x02f3 }
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = r8.f300563d     // Catch:{ Exception -> 0x02f3 }
            jp2.o r6 = r8.f300568i     // Catch:{ Exception -> 0x02f3 }
            int r7 = r8.f300562c     // Catch:{ Exception -> 0x02f3 }
            com.tencent.mm.plugin.sns.model.d1 r13 = r8.f300565f     // Catch:{ Exception -> 0x02f3 }
            int r2 = r2.f273639a     // Catch:{ Exception -> 0x02f3 }
            int r12 = r8.f300571l     // Catch:{ Exception -> 0x02f3 }
            r16 = r3
            r17 = r0
            r18 = r5
            r20 = r1
            r21 = r6
            r22 = r7
            r23 = r29
            r24 = r13
            r25 = r2
            r26 = r12
            r27 = r4
            rq2.C101429o.m133113h(r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ Exception -> 0x02f3 }
            goto L_0x018f
        L_0x0188:
            android.content.Context r1 = r8.f300564e     // Catch:{ Exception -> 0x02f3 }
            int r2 = r8.f300561b     // Catch:{ Exception -> 0x02f3 }
            jq2.C98984f.m128890a(r1, r0, r2, r4)     // Catch:{ Exception -> 0x02f3 }
        L_0x018f:
            r14 = r4
        L_0x0190:
            r1 = 0
            goto L_0x041e
        L_0x0193:
            vp2.h r1 = vp2.C65842h.f189343a     // Catch:{ Exception -> 0x02f3 }
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r8.f300563d     // Catch:{ Exception -> 0x02f3 }
            android.content.Context r3 = r8.f300564e     // Catch:{ Exception -> 0x02f3 }
            r1.mo89888b(r0, r2, r3, r4)     // Catch:{ Exception -> 0x02f3 }
            goto L_0x018f
        L_0x019d:
            co2.a r0 = r0.f273654h0     // Catch:{ Exception -> 0x02f3 }
            if (r0 == 0) goto L_0x01e6
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r8.f300563d     // Catch:{ Exception -> 0x02f3 }
            if (r0 == 0) goto L_0x01e6
            long r0 = r0.field_snsId     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r0 = vr2.C102236a0.m134765q0(r0)     // Catch:{ Exception -> 0x02f3 }
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r1 = r8.f300567h     // Catch:{ Exception -> 0x02f3 }
            co2.a r1 = r1.f273654h0     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r1 = lo2.C99516a.m129866c(r0, r1)     // Catch:{ Exception -> 0x02f3 }
            int r2 = r8.f300561b     // Catch:{ Exception -> 0x02f3 }
            if (r2 != 0) goto L_0x01b9
            r13 = 0
            goto L_0x01ba
        L_0x01b9:
            r13 = 1
        L_0x01ba:
            sq2.a r2 = new sq2.a     // Catch:{ Exception -> 0x02f3 }
            android.content.Context r3 = r8.f300564e     // Catch:{ Exception -> 0x02f3 }
            r2.<init>(r3, r13)     // Catch:{ Exception -> 0x02f3 }
            up2.e$b r3 = r8.f300569j     // Catch:{ Exception -> 0x02f3 }
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r5 = r8.f300567h     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r6 = "setActionBtnParam"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)     // Catch:{ Exception -> 0x02f3 }
            r2.f297750v = r3     // Catch:{ Exception -> 0x02f3 }
            r2.f297751w = r5     // Catch:{ Exception -> 0x02f3 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)     // Catch:{ Exception -> 0x02f3 }
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = r8.f300563d     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r3 = r3.getUxinfo()     // Catch:{ Exception -> 0x02f3 }
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r5 = r8.f300567h     // Catch:{ Exception -> 0x02f3 }
            co2.a r5 = r5.f273654h0     // Catch:{ Exception -> 0x02f3 }
            r2.mo141151g(r0, r3, r5, r1)     // Catch:{ Exception -> 0x02f3 }
            r0 = 50
            r4.f267473h = r0     // Catch:{ Exception -> 0x02f3 }
            goto L_0x018f
        L_0x01e6:
            java.lang.String r0 = "onClick ACTION_TYPE_APPOINTMENT, param err"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)     // Catch:{ Exception -> 0x02f3 }
            goto L_0x018f
        L_0x01ed:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x02f3 }
            r0.<init>()     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r1 = "title"
            android.content.Context r2 = r8.f300564e     // Catch:{ Exception -> 0x02f3 }
            r3 = 2131836758(0x7f113f56, float:1.9306692E38)
            java.lang.String r2 = r2.getString(r3)     // Catch:{ Exception -> 0x02f3 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x02f3 }
            android.content.Context r1 = r8.f300564e     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r2 = "card"
            java.lang.String r3 = ".ui.v4.CouponAndGiftCardListV4UI"
            ke3.C88144b.m109791i(r1, r2, r3, r0, r14)     // Catch:{ Exception -> 0x02f3 }
            goto L_0x018f
        L_0x020b:
            java.lang.String r0 = r0.finderUsername     // Catch:{ Exception -> 0x02f3 }
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = r8.f300563d     // Catch:{ Exception -> 0x02f3 }
            long r1 = r1.field_snsId     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r1 = vr2.C102236a0.m134765q0(r1)     // Catch:{ Exception -> 0x02f3 }
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r2 = r8.f300567h     // Catch:{ Exception -> 0x02f3 }
            int r2 = r2.f273639a     // Catch:{ Exception -> 0x02f3 }
            int r2 = lo2.C99542h0.m129905c(r2)     // Catch:{ Exception -> 0x02f3 }
            android.content.Context r3 = r8.f300564e     // Catch:{ Exception -> 0x02f3 }
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r8.f300563d     // Catch:{ Exception -> 0x02f3 }
            com.tencent.mm.plugin.sns.storage.ADInfo r5 = r5.getAdInfo()     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r5 = r5.uxInfo     // Catch:{ Exception -> 0x02f3 }
            lo2.C99542h0.m129909g(r3, r0, r5, r1, r2)     // Catch:{ Exception -> 0x02f3 }
            r0 = 41
            r4.f267473h = r0     // Catch:{ Exception -> 0x02f3 }
            goto L_0x018f
        L_0x0230:
            r8.mo141558g(r4)     // Catch:{ Exception -> 0x0237 }
            r14 = r4
            r13 = 1
            goto L_0x041f
        L_0x0237:
            r0 = move-exception
            r14 = r4
            r13 = 1
            goto L_0x043c
        L_0x023c:
            java.lang.String r14 = r0.finderUsername     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r15 = r0.f273644c0     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r1 = r0.f273646d0     // Catch:{ Exception -> 0x02f3 }
            int r0 = r0.f273639a     // Catch:{ Exception -> 0x02f3 }
            int r20 = lo2.C99542h0.m129905c(r0)     // Catch:{ Exception -> 0x02f3 }
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r8.f300563d     // Catch:{ Exception -> 0x02f3 }
            com.tencent.mm.plugin.sns.storage.ADInfo r0 = r0.getAdInfo()     // Catch:{ Exception -> 0x02f3 }
            android.content.Context r12 = r8.f300564e     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r13 = r0.uxInfo     // Catch:{ Exception -> 0x02f3 }
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r8.f300563d     // Catch:{ Exception -> 0x02f3 }
            long r5 = r2.field_snsId     // Catch:{ Exception -> 0x02f3 }
            boolean r0 = r0.preloadFinderFeed     // Catch:{ Exception -> 0x02f3 }
            r16 = r1
            r17 = r5
            r19 = r0
            lo2.C99542h0.m129907e(r12, r13, r14, r15, r16, r17, r19, r20)     // Catch:{ Exception -> 0x02f3 }
            r4.f267473h = r3     // Catch:{ Exception -> 0x02f3 }
            goto L_0x018f
        L_0x0265:
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)     // Catch:{ all -> 0x0299 }
            f62.k0 r0 = (f62.C75700k0) r0     // Catch:{ all -> 0x0299 }
            com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()     // Catch:{ all -> 0x0299 }
            if (r0 == 0) goto L_0x0285
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r2 = r8.f300567h     // Catch:{ all -> 0x0299 }
            java.lang.String r2 = r2.f273679y     // Catch:{ all -> 0x0299 }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ all -> 0x0299 }
            if (r2 != 0) goto L_0x0285
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r2 = r8.f300567h     // Catch:{ all -> 0x0299 }
            java.lang.String r2 = r2.f273679y     // Catch:{ all -> 0x0299 }
            com.tencent.mm.storage.z1 r14 = r0.get(r2)     // Catch:{ all -> 0x0299 }
        L_0x0285:
            if (r14 == 0) goto L_0x0290
            boolean r2 = r14.mo62927s3()     // Catch:{ all -> 0x0299 }
            if (r2 == 0) goto L_0x0290
            r4.f267473h = r1     // Catch:{ all -> 0x0299 }
            goto L_0x0294
        L_0x0290:
            r1 = 38
            r4.f267473h = r1     // Catch:{ all -> 0x0299 }
        L_0x0294:
            r8.mo141555d(r0, r14, r4)     // Catch:{ all -> 0x0299 }
            goto L_0x018f
        L_0x0299:
            r0 = move-exception
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02f3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)     // Catch:{ Exception -> 0x02f3 }
            goto L_0x018f
        L_0x02a3:
            r1 = 33
            r4.f267473h = r1     // Catch:{ Exception -> 0x02f3 }
            long r0 = r0.f273672r     // Catch:{ all -> 0x02e8 }
            long r2 = eb0.C31543z5.m39451a()     // Catch:{ all -> 0x02e8 }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r5
            r5 = 0
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x02c6
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 > 0) goto L_0x02bb
            goto L_0x02c6
        L_0x02bb:
            android.content.Context r0 = r8.f300564e     // Catch:{ all -> 0x02e8 }
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r1 = r8.f300567h     // Catch:{ all -> 0x02e8 }
            java.lang.String r1 = r1.f273673s     // Catch:{ all -> 0x02e8 }
            nj3.C76912y0.m92767f(r0, r1)     // Catch:{ all -> 0x02e8 }
            goto L_0x018f
        L_0x02c6:
            android.content.Context r3 = r8.f300564e     // Catch:{ all -> 0x02e8 }
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r0 = r8.f300567h     // Catch:{ all -> 0x02e8 }
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r8.f300563d     // Catch:{ all -> 0x02e8 }
            int r6 = r8.f300561b     // Catch:{ all -> 0x02e8 }
            java.lang.String r7 = "sendSubscribeInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r11)     // Catch:{ all -> 0x02e8 }
            up2.d r12 = new up2.d     // Catch:{ all -> 0x02e8 }
            r1 = r12
            r2 = r28
            r14 = r4
            r4 = r0
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x02e6 }
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r12)     // Catch:{ all -> 0x02e6 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r11)     // Catch:{ all -> 0x02e6 }
            goto L_0x0190
        L_0x02e6:
            r0 = move-exception
            goto L_0x02ea
        L_0x02e8:
            r0 = move-exception
            r14 = r4
        L_0x02ea:
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x03df }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)     // Catch:{ Exception -> 0x03df }
            goto L_0x0190
        L_0x02f3:
            r0 = move-exception
            r14 = r4
            goto L_0x043b
        L_0x02f7:
            r14 = r4
            r1 = 32
            r14.f267473h = r1     // Catch:{ Exception -> 0x03df }
            java.lang.String r0 = r0.f273643c     // Catch:{ Exception -> 0x03df }
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = r8.f300563d     // Catch:{ Exception -> 0x03df }
            int r2 = r8.f300561b     // Catch:{ Exception -> 0x03df }
            android.content.Context r3 = r8.f300564e     // Catch:{ Exception -> 0x03df }
            m134455n(r0, r1, r14, r2, r3)     // Catch:{ Exception -> 0x03df }
            goto L_0x0190
        L_0x0309:
            r14 = r4
            r1 = 31
            r14.f267473h = r1     // Catch:{ Exception -> 0x03df }
            java.lang.String r1 = r0.f273645d     // Catch:{ Exception -> 0x03df }
            java.lang.String r0 = r0.f273647e     // Catch:{ Exception -> 0x03df }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03df }
            r2.<init>()     // Catch:{ Exception -> 0x03df }
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r3 = r8.f300567h     // Catch:{ Exception -> 0x03df }
            int r3 = r3.f273649f     // Catch:{ Exception -> 0x03df }
            r2.append(r3)     // Catch:{ Exception -> 0x03df }
            r2.append(r13)     // Catch:{ Exception -> 0x03df }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x03df }
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = r8.f300563d     // Catch:{ Exception -> 0x03df }
            int r4 = r8.f300561b     // Catch:{ Exception -> 0x03df }
            com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122991o(r1, r0, r2, r3, r4)     // Catch:{ Exception -> 0x03df }
            android.content.Context r0 = r8.f300564e     // Catch:{ all -> 0x0190 }
            cq2.d r0 = cq2.C97354d.m125367c(r0)     // Catch:{ all -> 0x0190 }
            int r1 = r8.f300561b     // Catch:{ all -> 0x0190 }
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r8.f300563d     // Catch:{ all -> 0x0190 }
            r0.mo136622a(r1, r2)     // Catch:{ all -> 0x0190 }
            goto L_0x0190
        L_0x033b:
            r14 = r4
            r14.f267473h = r6     // Catch:{ Exception -> 0x03df }
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r8.f300563d     // Catch:{ Exception -> 0x03df }
            android.content.Context r0 = r8.f300564e     // Catch:{ Exception -> 0x03df }
            r3 = r0
            android.app.Activity r3 = (android.app.Activity) r3     // Catch:{ Exception -> 0x03df }
            int r4 = r8.f300561b     // Catch:{ Exception -> 0x03df }
            up2.e$c r0 = r8.f300570k     // Catch:{ Exception -> 0x03df }
            android.view.ViewGroup r5 = r0.mo132650a()     // Catch:{ Exception -> 0x03df }
            int r7 = r8.f300562c     // Catch:{ Exception -> 0x03df }
            r1 = r28
            r6 = r14
            r1.mo141562l(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x03df }
            goto L_0x0190
        L_0x0357:
            r14 = r4
            java.lang.String r2 = r0.f273674t     // Catch:{ Exception -> 0x03df }
            java.lang.String r3 = r0.f273675u     // Catch:{ Exception -> 0x03df }
            java.lang.String r4 = r0.f273676v     // Catch:{ Exception -> 0x03df }
            int r6 = r8.f300562c     // Catch:{ all -> 0x036b }
            r1 = r28
            r5 = r14
            int r0 = r1.mo141557f(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x036b }
            r14.f267473h = r0     // Catch:{ all -> 0x036b }
            goto L_0x0190
        L_0x036b:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03df }
            r1.<init>()     // Catch:{ Exception -> 0x03df }
            java.lang.String r2 = "handleDownload, exp="
            r1.append(r2)     // Catch:{ Exception -> 0x03df }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x03df }
            r1.append(r0)     // Catch:{ Exception -> 0x03df }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x03df }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)     // Catch:{ Exception -> 0x03df }
            goto L_0x0190
        L_0x0386:
            r14 = r4
            r14.f267473h = r2     // Catch:{ Exception -> 0x03df }
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r8.f300563d     // Catch:{ Exception -> 0x03df }
            com.tencent.mm.plugin.sns.storage.ADInfo r0 = r0.getAdInfo()     // Catch:{ Exception -> 0x03df }
            if (r0 == 0) goto L_0x03a0
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.mappedCanvasCardExt     // Catch:{ Exception -> 0x03df }
            if (r0 == 0) goto L_0x03a0
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r1 = r8.f300567h     // Catch:{ Exception -> 0x03df }
            java.lang.String r1 = r1.f273677w     // Catch:{ Exception -> 0x03df }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x03df }
            r13 = r0
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x03df }
        L_0x03a0:
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ Exception -> 0x03df }
            if (r0 == 0) goto L_0x03c2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03df }
            r0.<init>()     // Catch:{ Exception -> 0x03df }
            java.lang.String r1 = "cardExt is not found in adInfo, tpid="
            r0.append(r1)     // Catch:{ Exception -> 0x03df }
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r1 = r8.f300567h     // Catch:{ Exception -> 0x03df }
            java.lang.String r1 = r1.f273677w     // Catch:{ Exception -> 0x03df }
            r0.append(r1)     // Catch:{ Exception -> 0x03df }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x03df }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)     // Catch:{ Exception -> 0x03df }
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r0 = r8.f300567h     // Catch:{ Exception -> 0x03df }
            java.lang.String r13 = r0.f273678x     // Catch:{ Exception -> 0x03df }
        L_0x03c2:
            android.content.Context r0 = r8.f300564e     // Catch:{ Exception -> 0x03df }
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ Exception -> 0x03df }
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r1 = r8.f300567h     // Catch:{ Exception -> 0x03df }
            java.lang.String r1 = r1.f273677w     // Catch:{ Exception -> 0x03df }
            m134453k(r0, r1, r13)     // Catch:{ Exception -> 0x03df }
            goto L_0x0190
        L_0x03cf:
            r14 = r4
            r1 = 0
            r14.f267473h = r1     // Catch:{ Exception -> 0x03df }
            java.lang.String r0 = r0.f273643c     // Catch:{ Exception -> 0x03df }
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r8.f300563d     // Catch:{ Exception -> 0x03df }
            int r3 = r8.f300561b     // Catch:{ Exception -> 0x03df }
            android.content.Context r4 = r8.f300564e     // Catch:{ Exception -> 0x03df }
            m134455n(r0, r2, r14, r3, r4)     // Catch:{ Exception -> 0x03df }
            goto L_0x041e
        L_0x03df:
            r0 = move-exception
            goto L_0x043b
        L_0x03e1:
            java.lang.String r2 = "makeActionButtonAction"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)     // Catch:{ Exception -> 0x03df }
            tp2.c r0 = tp2.C101911a.m134112a(r7, r0)     // Catch:{ Exception -> 0x03df }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)     // Catch:{ Exception -> 0x03df }
            tp2.d r2 = new tp2.d     // Catch:{ Exception -> 0x03df }
            r2.<init>()     // Catch:{ Exception -> 0x03df }
            java.lang.String r3 = "snsAdClick"
            r2.mo141404b(r3, r14)     // Catch:{ Exception -> 0x03df }
            java.lang.String r3 = "scene"
            int r4 = r8.f300560a     // Catch:{ Exception -> 0x03df }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x03df }
            r2.mo141404b(r3, r4)     // Catch:{ Exception -> 0x03df }
            java.lang.String r3 = "subClickPos"
            int r4 = r8.f300562c     // Catch:{ Exception -> 0x03df }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x03df }
            r2.mo141404b(r3, r4)     // Catch:{ Exception -> 0x03df }
            if (r0 == 0) goto L_0x041e
            int r3 = r8.f300561b     // Catch:{ Exception -> 0x03df }
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r8.f300563d     // Catch:{ Exception -> 0x03df }
            r5 = r29
            r0.mo126055b(r5, r3, r4, r2)     // Catch:{ Exception -> 0x03df }
        L_0x041e:
            r13 = 0
        L_0x041f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0436 }
            r0.<init>()     // Catch:{ Exception -> 0x0436 }
            java.lang.String r1 = "clickAction="
            r0.append(r1)     // Catch:{ Exception -> 0x0436 }
            int r1 = r14.f267473h     // Catch:{ Exception -> 0x0436 }
            r0.append(r1)     // Catch:{ Exception -> 0x0436 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0436 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)     // Catch:{ Exception -> 0x0436 }
            goto L_0x0455
        L_0x0436:
            r0 = move-exception
            goto L_0x043c
        L_0x0438:
            r0 = move-exception
            r14 = r4
            r1 = 0
        L_0x043b:
            r13 = 0
        L_0x043c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0468 }
            r1.<init>()     // Catch:{ Exception -> 0x0468 }
            java.lang.String r2 = "onClick exp="
            r1.append(r2)     // Catch:{ Exception -> 0x0468 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0468 }
            r1.append(r0)     // Catch:{ Exception -> 0x0468 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0468 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)     // Catch:{ Exception -> 0x0468 }
        L_0x0455:
            if (r13 != 0) goto L_0x045a
            vr2.C102236a0.m134773u0(r14)     // Catch:{ Exception -> 0x0468 }
        L_0x045a:
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r0 = r8.f300567h     // Catch:{ Exception -> 0x0468 }
            if (r0 == 0) goto L_0x0482
            android.content.Context r1 = r8.f300564e     // Catch:{ Exception -> 0x0468 }
            java.lang.String r2 = r0.f273650f0     // Catch:{ Exception -> 0x0468 }
            java.lang.String r0 = r0.f273652g0     // Catch:{ Exception -> 0x0468 }
            lo2.C34318c.m40322a(r1, r2, r0)     // Catch:{ Exception -> 0x0468 }
            goto L_0x0482
        L_0x0468:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onClick report exp="
            r1.append(r2)
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
        L_0x0482:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: up2.C102064e.mo141556e(android.view.View):void");
    }

    /* renamed from: f */
    public int mo141557f(String str, String str2, String str3, SnsAdClick snsAdClick, int i) {
        boolean z;
        ADInfo.C95009b bVar;
        boolean z2;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10 = str;
        String str11 = str2;
        SnsAdClick snsAdClick2 = snsAdClick;
        SnsMethodCalculate.markStartTimeMs("handleDownload", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        Log.m105924i("AdClickActionHandler", "handleDownload, appPageUrl=" + str3 + ", pkg=" + str11 + ", appId=" + str10);
        String str12 = "";
        if (C100853b.m132142e().mo140323g(MMApplicationContext.getContext(), str11)) {
            Log.m105924i("AdClickActionHandler", "handleDownload, isPkgInstalled==true, openApp");
            SnsInfo snsInfo = this.f300563d;
            if (snsInfo != null) {
                ADInfo adInfo = snsInfo.getAdInfo(this.f300561b);
                if (adInfo != null) {
                    String nullAsNil = Util.nullAsNil(adInfo.uxInfo);
                    String nullAsNil2 = Util.nullAsNil(adInfo.aid);
                    str5 = Util.nullAsNil(adInfo.traceid);
                    str9 = nullAsNil2;
                    str6 = nullAsNil;
                    str7 = Util.nullAsNil(adInfo.pId);
                } else {
                    str7 = str12;
                    str6 = str7;
                    str9 = str6;
                    str5 = str9;
                }
                try {
                    str4 = Util.nullAsNil(this.f300563d.getAdXml().adExtInfo);
                    try {
                        str8 = String.valueOf(C102260r.m134863c0(Util.nullAsNil(this.f300563d.getSnsId())));
                    } catch (Throwable th) {
                        th = th;
                        Log.m105920e("AdClickActionHandler", th.toString());
                        str8 = str12;
                        str12 = str9;
                        C99552l.m129933i(true, this.f300563d, this.f300561b);
                        C102260r.m134849R(this.f300564e, str, str2, "", str3, str6, str4, str8, 0, 0, new C98961m(str12, str5, str7));
                        SnsMethodCalculate.markEndTimeMs("handleDownload", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                        return 34;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    str4 = str12;
                    Log.m105920e("AdClickActionHandler", th.toString());
                    str8 = str12;
                    str12 = str9;
                    C99552l.m129933i(true, this.f300563d, this.f300561b);
                    C102260r.m134849R(this.f300564e, str, str2, "", str3, str6, str4, str8, 0, 0, new C98961m(str12, str5, str7));
                    SnsMethodCalculate.markEndTimeMs("handleDownload", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                    return 34;
                }
                str12 = str9;
            } else {
                str8 = str12;
                str7 = str8;
                str6 = str7;
                str5 = str6;
                str4 = str5;
            }
            C99552l.m129933i(true, this.f300563d, this.f300561b);
            C102260r.m134849R(this.f300564e, str, str2, "", str3, str6, str4, str8, 0, 0, new C98961m(str12, str5, str7));
            SnsMethodCalculate.markEndTimeMs("handleDownload", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            return 34;
        } else if (C100853b.m132142e().mo140322f(str10)) {
            Log.m105924i("AdClickActionHandler", "handleDownload, isApkExist==true, installApp");
            C99552l.m129933i(false, this.f300563d, this.f300561b);
            C34318c.m40323b(str2, str3);
            AdLandingPagesProxy.getInstance().installApp(this.f300564e, str, str2, "", "");
            SnsMethodCalculate.markEndTimeMs("handleDownload", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            return 21;
        } else {
            SnsInfo snsInfo2 = this.f300563d;
            if (snsInfo2 == null) {
                Log.m105920e("AdClickActionHandler", "handleDownload, mSnsInfo==null");
                SnsMethodCalculate.markEndTimeMs("handleDownload", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                return 21;
            }
            try {
                ADInfo adInfo2 = snsInfo2.getAdInfo(this.f300561b);
                Context context = this.f300564e;
                SnsInfo snsInfo3 = this.f300563d;
                int i2 = this.f300561b;
                SnsMethodCalculate.markStartTimeMs("processAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                z2 = C102260r.m134861b0(context, snsInfo3, adInfo2, i2, 0);
                SnsMethodCalculate.markEndTimeMs("processAdAppMarket", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            } catch (Throwable th5) {
                Log.m105920e("AdClickActionHandler", "handleDownload, jumpAppMarket exp=" + th5.toString());
            }
            if (z2) {
                Log.m105924i("AdClickActionHandler", "handleDownload, jumpAppMarket");
                C34318c.m40323b(str2, str3);
                SnsMethodCalculate.markEndTimeMs("handleDownload", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                return 36;
            }
            C99552l.m129933i(false, this.f300563d, this.f300561b);
            SnsInfo snsInfo4 = this.f300563d;
            Activity activity = (Activity) this.f300564e;
            int i3 = this.f300561b;
            ViewGroup a = this.f300570k.mo132650a();
            SnsMethodCalculate.markStartTimeMs("jumpNativeLandingPageUIForDownload", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            StringBuilder sb = new StringBuilder();
            sb.append("jumpNativeLandingPageUIForDownload, snsId=");
            if (snsInfo4 != null) {
                str12 = C102236a0.m134765q0(snsInfo4.field_snsId);
            }
            sb.append(str12);
            Log.m105924i("AdClickActionHandler", sb.toString());
            Intent c = m134452c(snsInfo4, activity, i3, a, i);
            if (c != null) {
                this.f300570k.mo132651b();
                c.putExtra("sns_landing_pages_auto_download_for_action_btn", true);
                C9556a aVar = new C9556a();
                aVar.mo10233c(c);
                Activity activity2 = activity;
                C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/AdClickActionHandler", "jumpNativeLandingPageUIForDownload", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Landroid/app/Activity;ILandroid/view/View;I)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(activity2, "com/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/AdClickActionHandler", "jumpNativeLandingPageUIForDownload", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Landroid/app/Activity;ILandroid/view/View;I)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.overridePendingTransition(0, 0);
                SnsMethodCalculate.markEndTimeMs("jumpNativeLandingPageUIForDownload", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                z = true;
            } else {
                SnsMethodCalculate.markEndTimeMs("jumpNativeLandingPageUIForDownload", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                z = false;
            }
            if (z) {
                Log.m105924i("AdClickActionHandler", "handleDownload, jumpNativeLandingPageUI");
                SnsMethodCalculate.markEndTimeMs("handleDownload", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                return 21;
            }
            ADInfo adInfo3 = this.f300563d.getAdInfo(this.f300561b);
            if (adInfo3 == null || adInfo3.adActionType != 4 || (bVar = adInfo3.actionExtWeApp) == null || !TimelineClickListener.m122991o(bVar.f275645a, bVar.f275646b, bVar.f275647c, this.f300563d, this.f300561b)) {
                snsAdClick2.f267473h = 0;
                if (m134454m(this.f300563d, snsAdClick2, this.f300561b, this.f300564e)) {
                    Log.m105924i("AdClickActionHandler", "handleDownload, jumpH5");
                    SnsMethodCalculate.markEndTimeMs("handleDownload", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                    return 0;
                }
                Log.m105924i("AdClickActionHandler", "handleDownload, do nothing");
                SnsMethodCalculate.markEndTimeMs("handleDownload", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                return 21;
            }
            Log.m105924i("AdClickActionHandler", "handleDownload, jumpWeApp");
            SnsMethodCalculate.markEndTimeMs("handleDownload", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            return 31;
        }
    }

    /* renamed from: g */
    public void mo141558g(SnsAdClick snsAdClick) {
        SnsMethodCalculate.markStartTimeMs("handleQuickAddFinder", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        Log.m105924i("AdClickActionHandler", "onClick handleQuickAddFinder");
        ((C60208v1) C86312j.m106911c(C60208v1.class)).Aw0(this.f300567h.finderUsername, new C102065a(snsAdClick), 4);
        SnsMethodCalculate.markEndTimeMs("handleQuickAddFinder", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }

    /* renamed from: h */
    public void mo141559h(AdClickActionInfo adClickActionInfo, SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        mo141561j(new C102062c(adClickActionInfo, snsInfo, 0, (C94851d1) null, false, 0, 60, (C8480h) null));
        SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }

    /* renamed from: i */
    public void mo141560i(AdClickActionInfo adClickActionInfo, SnsInfo snsInfo, int i) {
        SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        mo141561j(new C102062c(adClickActionInfo, snsInfo, i, (C94851d1) null));
        SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }

    /* renamed from: j */
    public void mo141561j(C102062c cVar) {
        SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        cVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        AdClickActionInfo adClickActionInfo = cVar.f300549a;
        SnsMethodCalculate.markEndTimeMs("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        this.f300567h = adClickActionInfo;
        SnsMethodCalculate.markStartTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        SnsInfo snsInfo = cVar.f300550b;
        SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        this.f300563d = snsInfo;
        AdClickActionInfo adClickActionInfo2 = this.f300567h;
        if (adClickActionInfo2 != null) {
            this.f300560a = adClickActionInfo2.f273639a;
        }
        SnsMethodCalculate.markStartTimeMs("getSubClickPos", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        int i = cVar.f300551c;
        SnsMethodCalculate.markEndTimeMs("getSubClickPos", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        this.f300562c = i;
        SnsMethodCalculate.markStartTimeMs("getSnsContext", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        C94851d1 d1Var = cVar.f300552d;
        SnsMethodCalculate.markEndTimeMs("getSnsContext", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        this.f300565f = d1Var;
        SnsMethodCalculate.markStartTimeMs("getForceUseNormalAnim", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        boolean z = cVar.f300553e;
        SnsMethodCalculate.markEndTimeMs("getForceUseNormalAnim", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        this.f300566g = z;
        SnsMethodCalculate.markStartTimeMs("getNativeSightType", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        int i2 = cVar.f300554f;
        SnsMethodCalculate.markEndTimeMs("getNativeSightType", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        this.f300571l = i2;
        SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }

    /* renamed from: l */
    public void mo141562l(SnsInfo snsInfo, Activity activity, int i, View view, SnsAdClick snsAdClick, int i2) {
        SnsInfo snsInfo2 = snsInfo;
        Activity activity2 = activity;
        SnsMethodCalculate.markStartTimeMs("jumpNativeLandingPageUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        StringBuilder sb = new StringBuilder();
        sb.append("jumpNativeLandingPageUI, snsId=");
        sb.append(snsInfo2 == null ? 0 : snsInfo2.field_snsId);
        Log.m105924i("AdClickActionHandler", sb.toString());
        Intent c = m134452c(snsInfo, activity, i, view, i2);
        if (c != null) {
            this.f300570k.mo132651b();
            if (this.f300566g) {
                c.putExtra("sns_landing_pages_is_normal_ad_animation", true);
            }
            C9556a aVar = new C9556a();
            aVar.mo10233c(c);
            C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/AdClickActionHandler", "jumpNativeLandingPageUI", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Landroid/app/Activity;ILandroid/view/View;Lcom/tencent/mm/modelsns/SnsAdClick;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(activity, "com/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/AdClickActionHandler", "jumpNativeLandingPageUI", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Landroid/app/Activity;ILandroid/view/View;Lcom/tencent/mm/modelsns/SnsAdClick;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.overridePendingTransition(0, 0);
        } else {
            m134454m(this.f300563d, snsAdClick, this.f300561b, this.f300564e);
        }
        SnsMethodCalculate.markEndTimeMs("jumpNativeLandingPageUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }
}
