package dq1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55724w;
import com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.protocal.protobuf.FinderTipsShowEntranceExtInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import com.tenpay.android.wechat.PayuSecureEncrypt;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75592q0;
import er1.C58684b;
import er1.C58759o4;
import er1.C58784w3;
import f40.C86709a0;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import ht1.C60152b4;
import ht1.C60200t1;
import java.util.ArrayList;
import nj3.C76912y0;
import org.json.JSONObject;
import os1.C11739f;
import os1.C11759w;
import p682rz.C36594q;
import pe1.C35469d;
import rx3.C13598b0;
import se1.C36665a;
import sx3.C64197v;
import te3.C51978xi1;
import te3.C64586nn1;
import ue1.C37429f0;
import ue1.C52528f;
import up1.C37521f;
import up1.C52593j;
import vp1.C14937o;
import xp1.C15869b;
import z04.C119027c;
import zc1.C66785b;
import zt3.C119157j;

/* renamed from: dq1.c */
public final class C31252c {

    /* renamed from: a */
    public static final C31252c f83719a = new C31252c();

    /* renamed from: dq1.c$d */
    public static final class C7462d extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C7462d f25675d = new C7462d();

        public C7462d() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_FIRST_SHOW_FULL_SCREEN_TAB_BOOLEAN_SYNC, Boolean.FALSE);
            C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) "已清除全屏tab红点标记", 0).show();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dq1.c$f */
    public static final class C7463f extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C7463f f25676d = new C7463f();

        public C7463f() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C11739f fVar = (C11739f) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class);
            fVar.getClass();
            C86709a0.m107535s().mo121142i().mo119677K(fVar.mo11601d3(3), 0);
            C86709a0.m107535s().mo121142i().mo119677K(fVar.mo11601d3(1), 0);
            C86709a0.m107535s().mo121142i().mo119677K(fVar.mo11601d3(4), 0);
            C86709a0.m107535s().mo121142i().mo119677K(fVar.mo11601d3(2), 0);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_TIP_COLLAPSIBLE_INT, 0);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_HAS_CLICK_FAV_BOOLEAN_SYNC, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dq1.c$h */
    public static final class C7464h extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C7464h f25677d = new C7464h();

        public C7464h() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            if (activity == null) {
                C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) "退出页面再重试下", 0).show();
            } else {
                Intent intent = new Intent();
                intent.putExtra("TITLE", "通用选择器");
                intent.putExtra("BIZ_SCENE", 1);
                byte[] bytes = "{\"status_id\":\"1000\",\"status_tags\":[\"1888\"],\"status_word\":\"美滋滋\",\"status_description\":\"#1888\"}".getBytes(C119027c.f356488a);
                C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                intent.putExtra("EXT_BUFF", bytes);
                ArrayList arrayList = new ArrayList();
                arrayList.add(1);
                arrayList.add(2);
                arrayList.add(3);
                arrayList.add(4);
                arrayList.add(5);
                C13598b0 b0Var = C13598b0.f38549a;
                intent.putIntegerArrayListExtra("TAB_LIST", arrayList);
                ((C58684b) C86312j.m106911c(C58684b.class)).Jx0(activity, intent, 0);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dq1.c$i */
    public static final class C7465i extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C7465i f25678d = new C7465i();

        public C7465i() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            ((C11739f) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class)).mo11605i3();
            C14937o.f40972a.mo13982c();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dq1.c$j */
    public static final class C7466j extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C7466j f25679d = new C7466j();

        public C7466j() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Dx0().f39913g.rawQuery("DELETE FROM FinderFeedItem  WHERE localFlag IN (0, 1, 2);", (String[]) null, 2);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dq1.c$l */
    public static final class C7467l extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C7467l f25680d = new C7467l();

        public C7467l() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C11759w wVar = (C11759w) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11759w.class);
            wVar.f34424e.clear();
            wVar.f34425f.clear();
            wVar.f34426g.clear();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dq1.c$m */
    public static final class C7468m extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C7468m f25681d = new C7468m();

        public C7468m() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_NEVER_SCROLL_IN_LIVE_SQUARE_CNT_BOOLEAN_SYNC, Boolean.TRUE);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FIRST_SHOW_NEARBY_LIVE_SQUARE_SCROLL_GUIDE_CNT_INT_SYNC, 0);
            ((C11739f) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class)).mo11605i3();
            if (activity != null) {
                C76912y0.makeText((Context) activity, (CharSequence) "已清除，可重新测试", 0).show();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dq1.c$n */
    public static final class C7469n extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C7469n f25682d = new C7469n();

        public C7469n() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LOCAL_RED_DOT_INT_SYNC, 0);
            C60152b4.C8759a.m8562b(((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0(), -1, (String) null, 2, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dq1.c$a */
    public static final class C31253a extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C31253a f83720d = new C31253a();

        public C31253a() {
            super(1);
        }

        public Object invoke(Object obj) {
            ((C119157j) C119157j.f356862d).mo183875f(new C31250b((Activity) obj));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dq1.c$b */
    public static final class C31254b extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C31254b f83721d = new C31254b();

        public C31254b() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            FinderRedDotManager.f158523z = true;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dq1.c$c */
    public static final class C31255c extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C31255c f83722d = new C31255c();

        public C31255c() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C58784w3 w3Var = C58784w3.f168295a;
            w3Var.mo83958r();
            w3Var.mo83964t();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dq1.c$g */
    public static final class C31256g extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C31256g f83723d = new C31256g();

        public C31256g() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            FinderItem.Companion.getClass();
            FinderItem.debugOnlySelfSee = true;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dq1.c$o */
    public static final class C31257o extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C31257o f83724d = new C31257o();

        public C31257o() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("localIdentifier", "content://media/external/video/media/3426");
            jSONObject.put("remoteUrl", "https://1500000419.vod2.myqcloud.com/6c9781f6vodcq1500000419/fcc5b21b5285890810062810511/NZQdSMAkg1AA.mp4");
            jSONObject.put("fromAppType", 2);
            jSONObject.put("paramsJson", "{\"file_id\":\"5285890810062810511\",\"media_source\":2,\"media_type\":\"video\",\"act_style\":11010,\"service_type\":2,\"media_scene\":1,\"service\":\"build\"}");
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "extInfo.toString()");
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76744Dl("businessType", "appid", jSONObject2);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dq1.c$p */
    public static final class C31258p extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C31258p f83725d = new C31258p();

        public C31258p() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("localIdentifier", "content://media/external/video/media/3426");
            jSONObject.put("remoteUrl", "");
            jSONObject.put("fromAppType", 1);
            jSONObject.put("paramsJson", "");
            jSONObject.put("miaojianExtInfo", "DQp7InRlbXBsYXRlSWQiOiJ5dWFuc2hlbmdfaF8yXzlfMTYiLCJtdXNpY0tleSI6IjE6MTM2NDg4Nzk2ODIwOTEyOTQ3MjoxIn0=");
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "extInfo.toString()");
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76744Dl("businessType", "wxa5e0de08d96cc09d", jSONObject2);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dq1.c$q */
    public static final class C31259q extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C31259q f83726d = new C31259q();

        public C31259q() {
            super(1);
        }

        public Object invoke(Object obj) {
            ((C60200t1) C86312j.m106911c(C60200t1.class)).fi0().mo83752c((Activity) obj, "wxa5e0de08d96cc09d", "content://media/external/video/media/3426", FFmpegMetadataRetriever.METADATA_KEY_TITLE, "", "{\"jumpType\": 2,\"wording\": \"跳转文案，透传\",\"reportInfo\": \"上报用\",\"iconurl\": \"http://ent.chinadaily.com.cn/att/site1/20140818/0023ae72898c155ba5db5b.jpeg\",\"miniAppInfo\": {\"appusername\": \"小程序appusername\",\"path\": \"跳转路径\"},\"html5Info\": {\"url\": \"h5跳转链接\"}}", "");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dq1.c$r */
    public static final class C31260r extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C31260r f83727d = new C31260r();

        public C31260r() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("短视频录制:");
            C37521f fVar = C37521f.f99374d;
            sb4.append(fVar.mo61162P());
            sb4.append("\n-----------------\n");
            sb.append(sb4.toString());
            sb.append("短视频相册:" + fVar.mo61161O() + "\n-----------------\n");
            StringBuilder sb5 = new StringBuilder();
            sb5.append("长视频:");
            sb5.append(C31252c.f83719a.mo58041a());
            sb.append(sb5.toString());
            if (activity != null) {
                C15869b bVar = C15869b.f42722a;
                String sb6 = sb.toString();
                C87412m.m108593f(sb6, "sb.toString()");
                bVar.mo14523a(activity, sb6, "");
            } else {
                C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) sb.toString(), 1).show();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dq1.c$k */
    public static final class C31261k extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C31261k f83728d = new C31261k();

        public C31261k() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            Class cls = FinderCommonFeatureService.class;
            C37429f0 f0Var = new C37429f0();
            f0Var.field_talker = C75592q0.m90789s();
            C52528f a = C52593j.f146894e.mo73554a();
            a.field_talker = C75592q0.m90789s();
            for (int i = 0; i < 50001; i++) {
                f0Var.field_sessionId = C31543z5.m39451a() + '_' + i + "@findermsg";
                a.field_sessionId = C31543z5.m39451a() + '_' + i + "@findermsg";
                if (i % 2 == 0) {
                    StringBuilder sb = new StringBuilder();
                    C66785b bVar = C66785b.f191882e;
                    sb.append(bVar.mo90662O5());
                    sb.append('_');
                    sb.append(i);
                    f0Var.field_talker = sb.toString();
                    a.field_talker = bVar.mo90662O5() + '_' + i;
                } else {
                    f0Var.field_talker = C75592q0.m90789s() + '_' + i;
                    a.field_talker = C75592q0.m90789s() + '_' + i;
                }
                boolean insert = ((FinderCommonFeatureService) C86312j.m106911c(cls)).mo76736Au().insert(f0Var);
                boolean insert2 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).mo76776L4().insert(a);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(i);
                sb4.append(',');
                sb4.append(insert);
                sb4.append(' ');
                sb4.append(insert2);
                Log.m105924i("FINDER_INSERT_10W_FAKE_SESSIONINFO", sb4.toString());
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dq1.c$e */
    public static final class C31262e extends C87413o implements C32227p<Integer, Context, C13598b0> {

        /* renamed from: d */
        public static final C31262e f83729d = new C31262e();

        public C31262e() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            Context context = (Context) obj2;
            C55724w wVar = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().f158524a;
            wVar.getClass();
            Log.m105924i("Finder.RedDotCtrInfoStorage", "insertData :" + intValue);
            for (int i = 0; i < intValue; i++) {
                if (i % 2 == 0) {
                    long c = C31543z5.m39453c();
                    FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo = new FinderTipsShowEntranceExtInfo();
                    C51978xi1 xi12 = new C51978xi1();
                    xi12.f144673h = String.valueOf(C31543z5.m39453c());
                    xi12.f144669d = 100000;
                    xi12.f144670e = -1;
                    C64586nn1 nn12 = new C64586nn1();
                    nn12.f184502d = 1;
                    nn12.f184506h = 1;
                    nn12.f184507i = "FinderEntrance";
                    xi12.f144672g.add(nn12);
                    C64586nn1 nn13 = new C64586nn1();
                    nn13.f184502d = 1;
                    nn13.f184506h = 1;
                    nn13.f184507i = "TLPersonalCenter";
                    nn13.f184508j = "FinderEntrance";
                    xi12.f144672g.add(nn13);
                    C64586nn1 nn14 = new C64586nn1();
                    nn14.f184502d = 1;
                    nn14.f184506h = 1;
                    nn14.f184507i = "TLCamera";
                    nn14.f184508j = "TLPersonalCenter";
                    xi12.f144672g.add(nn14);
                    C55718s0 s0Var = new C55718s0();
                    s0Var.mo77305l2(xi12, 0);
                    s0Var.field_time = c;
                    s0Var.field_tipsShowEntranceExtInfo = finderTipsShowEntranceExtInfo;
                    s0Var.mo77314v2(wVar, true);
                } else {
                    long c2 = C31543z5.m39453c();
                    FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo2 = new FinderTipsShowEntranceExtInfo();
                    C51978xi1 xi13 = new C51978xi1();
                    xi13.f144673h = String.valueOf(C31543z5.m39453c());
                    xi13.f144669d = 100000;
                    xi13.f144670e = 2;
                    C64586nn1 nn15 = new C64586nn1();
                    nn15.f184502d = 2;
                    nn15.f184506h = 1;
                    nn15.f184507i = "AuthorProfileNotify";
                    nn15.f184503e = 17;
                    xi13.f144672g.add(nn15);
                    C64586nn1 nn16 = new C64586nn1();
                    nn16.f184502d = 2;
                    nn16.f184506h = 1;
                    nn16.f184507i = "NotificitionCenterNotify";
                    nn16.f184503e = 5;
                    xi13.f144672g.add(nn16);
                    C55718s0 s0Var2 = new C55718s0();
                    s0Var2.mo77305l2(xi13, 0);
                    s0Var2.field_time = c2;
                    s0Var2.field_tipsShowEntranceExtInfo = finderTipsShowEntranceExtInfo2;
                    s0Var2.mo77314v2(wVar, true);
                }
            }
            C76912y0 y0Var = new C76912y0(MMApplicationContext.getContext());
            y0Var.setText((int) C0966R.string.esc);
            y0Var.cancel();
            y0Var.f224777g.stopTimer();
            y0Var.f224772b = ((int) (y0Var.f224773c / 70)) + 1;
            y0Var.f224777g.startTimer(70);
            return C13598b0.f38549a;
        }
    }

    static {
        new C35469d("发表相机红点重置", C7469n.f25682d);
        new C35469d("生效一次，收到红点会去掉（朋友/关注）发现页红点", C31254b.f83721d);
        new C35469d("清除全屏tab红点标记", C7462d.f25675d).f94897p = "T5";
        new C35469d("清理首页文件缓存", C7465i.f25678d);
        new C35469d("附近直播清理首页文件缓存", C7467l.f25680d);
        new C35469d("清理发表队列", C7466j.f25679d);
        new C35469d("查看Finder缓存大小", C31253a.f83720d);
        new C35469d("插入10W条假session", C31261k.f83728d);
        new C35469d("显示视频编码配置", C31260r.f83727d);
        new C35469d("双击与展开教育/收藏红点重置", C7463f.f25676d);
        new C35469d("清除直播广场的滑动引导", C7468m.f25681d).f94897p = "T5";
        new C35469d("跳通用选择器页面", C7464h.f25677d).f94897p = "T6";
        new C35469d("游戏sdk分享测试", C31257o.f83724d);
        new C35469d("秒剪sdk分享测试", C31258p.f83725d);
        new C35469d("OPENSDK DEEPLINK分享测试", C31259q.f83726d);
        new C35469d("把所有feed改为仅自己可见", C31256g.f83723d);
        new C36665a(0, "红点数据库插入数据count", C31262e.f83729d).mo60268b("DEBUG_FINDER_INSERT_RED_DOT_DB", new ArrayList(C64197v.m75537f(30, 100, 500, 1000, 5000)), C64197v.m75537f(PayuSecureEncrypt.ENCRYPT_VERSION_HASH, "100", "500", "1000", "5000"));
        new C35469d("清空通知lastBuffer", C31255c.f83722d);
    }

    /* renamed from: a */
    public final VideoTransPara mo58041a() {
        VideoTransPara bW = ((C36594q) C86312j.m106911c(C36594q.class)).mo60736bW(C58759o4.f168229a.mo83778Y5());
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_long_video_max_bitrate, 0);
        if (Qe > 0) {
            bW.f267169g = Qe;
        }
        C87412m.m108593f(bW, "params");
        return bW;
    }
}
