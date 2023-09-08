package uc1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Size;
import bp3.C104160f;
import bp3.C79758p;
import c30.C26827e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.component.api.jumper.UICustomParam;
import com.tencent.p014mm.modelcdntran.C92755e0;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.C75054z4;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.sight.base.ABAPrams;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.plugin.vlog.model.C106205q0;
import com.tencent.p014mm.plugin.vlog.model.C30517h0;
import com.tencent.p014mm.plugin.vlog.model.C57463v;
import com.tencent.p014mm.plugin.vlog.model.C57465w;
import com.tencent.p014mm.plugin.vlog.model.C57467x;
import com.tencent.p014mm.plugin.vlog.model.C57468y;
import com.tencent.p014mm.plugin.vlog.model.C96536f;
import com.tencent.p014mm.plugin.vlog.model.C96543i;
import com.tencent.p014mm.plugin.vlog.model.C96551o;
import com.tencent.p014mm.plugin.vlog.model.C96552p0;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.json.JSONUtils;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import com.tencent.tav.decoder.CodecHelper;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import com.tencent.xweb.file.XVFSFile;
import d03.C58010a;
import di3.C7335d;
import di3.C86301e;
import di3.C86312j;
import ei2.C31606c;
import ei2.C97651f;
import ei3.C86522b;
import f72.C97842b;
import f80.C107486a;
import f80.C107488c;
import fq1.C59269a;
import fq1.C97947b;
import fy3.C32226l;
import gr1.C107908g2;
import gr1.C32509u2;
import gr1.C59658h2;
import gr1.C98181v0;
import gy3.C87412m;
import h23.C108019a;
import h81.C32735h;
import hd0.C98398h0;
import hd0.C98403m0;
import hi2.C98453h;
import ht1.C60206u1;
import j03.C60700d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l23.C34168k;
import org.json.JSONObject;
import p447aw.C103918d;
import p599lr.C61381b;
import p707tz.C65000f;
import pl1.C100810g0;
import pl1.C62368t0;
import qr1.C101240a;
import qr1.C110446b;
import qr1.C63320d;
import qw1.C63342k;
import r80.C63378g;
import rx3.C13598b0;
import so1.C36752a;
import sp3.C110794b;
import sp3.C110807k;
import sp3.C36777d;
import sx3.C36907w;
import te3.C64346ep3;
import te3.C64689rq2;
import te3.C64899zy;
import u23.C101958b;
import u23.C101959g;
import u23.C111127k;
import u23.C65003a;
import u23.C65005i;
import up1.C27696y;
import wx3.C15601d;
import x70.C102568a;
import x70.C112042c;
import x70.C112043d;
import x80.C102578b;

@C86522b
/* renamed from: uc1.u */
public final class C101996u extends C86301e implements C65000f {
    public Bitmap D40(String str) {
        return C97842b.m126300q(str);
    }

    /* renamed from: Fk */
    public boolean mo89170Fk() {
        String str = C36752a.f97621a;
        Object a = C79758p.f233760a.mo109878a(C104160f.RepairerConfig_Maas_RecordTemplateEnable_Int, -1);
        C87412m.m108592e(a, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) a).intValue();
        if (intValue == 0) {
            return false;
        }
        if (intValue != 1) {
            boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_template_record_enable, false);
            Log.m105924i("MicroMsg.RecordTemplateConfig", "enableTemplate:" + wf);
            if (!wf || !BuildInfo.IS_ARM64) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: MF */
    public C57468y mo89171MF(String str, boolean z) {
        C87412m.m108594g(str, "path");
        return new C106205q0(str, z ? 1 : 2, 0);
    }

    /* renamed from: Oj */
    public RecordConfigProvider mo89172Oj() {
        return C97947b.f287286a.mo137257a();
    }

    /* renamed from: Ol */
    public RecordConfigProvider mo89173Ol(boolean z) {
        Class cls = C32735h.class;
        C97947b bVar = C97947b.f287286a;
        Log.m105924i("Finder.FinderVideoEditorConfig", "getRecordProvider");
        VideoTransPara g1 = ((C60206u1) C86312j.m106911c(C60206u1.class)).mo60951g1();
        if (C34168k.f92165a.mo59471a()) {
            g1.f267167e = (int) (((float) g1.f267166d) / 0.75f);
        }
        Log.m105924i("Finder.FinderVideoEditorConfig", "videoParams " + g1);
        RecordConfigProvider f = RecordConfigProvider.m119436f(((C61381b) C86312j.m106911c(C61381b.class)).G20(), "", g1, g1.f267170h * 1000, 11);
        boolean wf = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_template_record_param_degrade_enable, true);
        Log.m105924i("Finder.FinderVideoEditorConfig", "recordDegradeCheck enable:" + wf);
        if (wf) {
            try {
                VideoTransPara videoTransPara = f.f272926n;
                if (videoTransPara != null) {
                    int i = videoTransPara.f267166d;
                    int supportMaxParallelCount = CodecHelper.getSupportMaxParallelCount(i, (i * 16) / 9, 30, (long) videoTransPara.f267169g, "video/avc");
                    String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_template_record_param_degrade_setting, "\n       [{\"count\":1,\"width\":540,\"height\":960,\"fps\":30},{\"count\":2,\"width\":720,\"height\":1280,\"fps\":30}]\n    ");
                    Log.m105924i("Finder.FinderVideoEditorConfig", "count:" + supportMaxParallelCount + " setting:" + Y60);
                    JSONUtils.forEach(new C26827e(Y60), new C59269a(supportMaxParallelCount, videoTransPara));
                }
            } catch (Exception e) {
                Log.printErrStackTrace("Finder.FinderVideoEditorConfig", e, "recordDegradeCheck error", new Object[0]);
            }
        }
        f.f272934v = Boolean.FALSE;
        f.f272931s = Boolean.valueOf(!(((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_finder_record_enable_add_audio, 0) == 1));
        f.f272915Q.f318441e = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_effect_finder_enable_beautify, true);
        f.f272915Q.f318443g = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_effect_finder_beautify_skin_smooth, -1);
        f.f272915Q.f318444h = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_effect_finder_beautify_eye_morph, -1);
        f.f272915Q.f318445i = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_effect_finder_beautify_face_morph, -1);
        f.f272915Q.f318446j = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_effect_finder_beautify_skin_bright, -1);
        f.f272915Q.f318447n = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_effect_finder_beautify_eye_bright, -1);
        f.f272928p = C96814a.C96817e.CONTAIN;
        UICustomParam uICustomParam = new UICustomParam();
        ((HashMap) uICustomParam.f266575h).put("plugin_filter", Boolean.TRUE);
        if (C34168k.f92165a.mo59471a()) {
            uICustomParam.f266586v = 0.75f;
        } else {
            uICustomParam.f266586v = 0.85714287f;
        }
        uICustomParam.f266583s = MMApplicationContext.getContext().getResources().getColor(C0966R.color.f2939n);
        uICustomParam.f266576i = C0966R.C0969drawable.f4653j6;
        uICustomParam.f266577j = 0;
        uICustomParam.f266579o = "";
        uICustomParam.f266578n = 0;
        f.f272927o = uICustomParam;
        ((HashMap) uICustomParam.f266575h).put("plugin_poi", true);
        ((HashMap) uICustomParam.f266575h).put("plugin_tip", true);
        ((HashMap) uICustomParam.f266575h).put("plugin_photo_crop", Boolean.TRUE);
        ((HashMap) uICustomParam.f266575h).put("plugin_menu", false);
        ((HashMap) uICustomParam.f266575h).put("plugin_filter", true);
        bVar.mo137258b(f, z);
        return f;
    }

    public void Oo0(String str) {
        C98453h.f288774a.mo137821s(str);
    }

    /* renamed from: Ov */
    public JSONObject mo89175Ov(String str) {
        try {
            return new JSONObject(SightVideoJNI.getVideoMetaData(str));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SightUtil", e, "getVideoMetaData error:%s", e.getMessage());
            return null;
        }
    }

    /* renamed from: SM */
    public int mo89176SM() {
        return 3;
    }

    /* renamed from: TB */
    public boolean mo89177TB(String str, String str2) {
        C87412m.m108594g(str, "src");
        C87412m.m108594g(str2, "dest");
        return C108019a.f323464a.mo158414a(str, str2);
    }

    /* renamed from: Tj */
    public int mo89178Tj() {
        return 1;
    }

    /* renamed from: Ue */
    public C58010a mo89179Ue(C65003a aVar) {
        C87412m.m108594g(aVar, "info");
        C63320d dVar = aVar instanceof C63320d ? (C63320d) aVar : null;
        if (dVar != null) {
            return dVar.f179677n;
        }
        return null;
    }

    /* renamed from: Wk */
    public boolean mo89180Wk(C65003a aVar) {
        C87412m.m108594g(aVar, "info");
        return aVar instanceof C63320d;
    }

    /* renamed from: XD */
    public void mo89181XD(ABAPrams aBAPrams) {
        C87412m.m108594g(aBAPrams, "abaPrams");
        C92755e0 xx02 = C98398h0.xx0();
        if (xx02 != null) {
            xx02.mo126991o(aBAPrams);
        }
    }

    public int Ye0() {
        return 2;
    }

    /* renamed from: Yp */
    public C94554a mo89183Yp(String str) {
        return C94555d.m119567c(str, true);
    }

    public C110807k bo0(C64899zy zyVar, EffectManager effectManager, C31606c cVar, Rect rect, int i) {
        C87412m.m108594g(zyVar, TPReportKeys.Common.COMMON_PROTO);
        C87412m.m108594g(effectManager, "effectMgr");
        C87412m.m108594g(cVar, "frame");
        C96552p0 d = C96551o.m123874d(zyVar, effectManager);
        d.mo134622s(cVar);
        if (rect != null) {
            d.mo81183b(rect);
        }
        if (i > 0) {
            Log.m105924i("MicroMsg.VLogComposition", "setFpsUpperLimit:" + i);
            if (i > 0) {
                d.f282577j = i;
            }
        }
        return d.mo134611h();
    }

    /* renamed from: bt */
    public C65003a mo89185bt(C57468y yVar) {
        C87412m.m108594g(yVar, FFmpegMetadataRetriever.METADATA_KEY_TRACK);
        return new C101959g((C106205q0) yVar);
    }

    /* renamed from: bx */
    public int mo89186bx() {
        return 0;
    }

    public C63378g c20(String str, String str2, int i, String str3, Rect rect, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, long j2, boolean z, boolean z2, int i9, int i15, boolean z3, int i16, C32226l<? super Float, C13598b0> lVar, C32226l<? super String, C13598b0> lVar2, int i17, int i18) {
        String str4 = str;
        C87412m.m108594g(str2, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        C87412m.m108594g(str3, "outputFilePath");
        return new C107908g2(str, str2, i, str3, rect, i2, i3, i4, i5, i6, i7, i8, j, j2, z, z2, i9, i15, z3, i16, lVar, lVar2, i17, i18);
    }

    public String ca0() {
        String ca02 = C98398h0.wx0().ca0();
        C87412m.m108593f(ca02, "getCore().accVideoPath");
        return ca02;
    }

    /* renamed from: ec */
    public void mo89189ec(Context context, String str, boolean z) {
        Size size;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "key");
        C107486a aVar = C107488c.f321596a;
        Point a = C75054z4.m90003a(context);
        float f = (((float) 16) * 1.0f) / ((float) 9);
        float f2 = (float) a.y;
        float f3 = (float) a.x;
        if ((1.0f * f2) / f3 > f) {
            size = new Size(a.x, (int) (f * f3));
        } else {
            size = new Size((int) (f2 * f), a.y);
        }
        if (!((C103918d) C86312j.m106911c(C103918d.class)).Gd0(context, "android.permission.CAMERA")) {
            Log.m105920e("MicroMsg.Camera.Preload", "jump preload for no camera permission!");
            return;
        }
        C112043d dVar = (C112043d) C107488c.f321597b.mo157914d(str);
        dVar.getClass();
        dVar.mo163062D("setUpCamera", new C112042c(dVar, context, (C15601d<? super C112042c>) null));
        dVar.mo163066c(size.getWidth(), size.getHeight());
        dVar.mo163062D("preOpenCamera", new C102568a(z, dVar, (C15601d<? super C102568a>) null));
    }

    /* renamed from: f3 */
    public int mo89190f3(int i) {
        return C97842b.m126284a(i);
    }

    /* renamed from: gp */
    public C31606c mo89191gp(C64899zy zyVar) {
        C87412m.m108594g(zyVar, TPReportKeys.Common.COMMON_PROTO);
        return C96551o.m123875e(zyVar);
    }

    public void hn0(String str) {
        C87412m.m108594g(str, "key");
        C107486a aVar = C107488c.f321596a;
        C107488c.f321597b.mo157915e(str);
    }

    /* renamed from: i3 */
    public String mo89193i3(String str) {
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        String i3 = ((C102578b) C86312j.m106911c(C102578b.class)).mo141938i3(str);
        return i3 == null ? "" : i3;
    }

    /* renamed from: iu */
    public boolean mo89194iu(String str) {
        C87412m.m108594g(str, "filepath");
        return C98403m0.m127702b(str);
    }

    public C65003a jt0(C57468y yVar) {
        C87412m.m108594g(yVar, FFmpegMetadataRetriever.METADATA_KEY_TRACK);
        return new C111127k((C106205q0) yVar);
    }

    /* renamed from: la */
    public C57467x mo89196la(List<? extends C57468y> list) {
        C87412m.m108594g(list, "trackList");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (C57468y yVar : list) {
            C87412m.m108592e(yVar, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.VLogCompositionTrack");
            arrayList.add((C106205q0) yVar);
        }
        return new C96552p0((List<C106205q0>) arrayList);
    }

    /* renamed from: mk */
    public C65005i mo89197mk() {
        return new C101240a();
    }

    /* renamed from: mn */
    public C57463v mo89198mn() {
        return new C96536f();
    }

    public C36777d mv0(C64689rq2 rq22, int i, int i2, Object obj) {
        C87412m.m108594g(rq22, "media");
        C64899zy zyVar = rq22.f185235B;
        if (!(true ^ (zyVar != null && zyVar.f186905j)) && zyVar != null) {
            EffectManager effectManager = new EffectManager();
            C96552p0 d = C96551o.m123874d(zyVar, effectManager);
            C31606c e = C96551o.m123875e(zyVar);
            ((C97651f) e).start();
            d.mo134622s(e);
            return new C32509u2(d.mo134615l(), C110794b.f331445i.mo162359b(d.mo134611h()), new C59658h2(e, effectManager));
        } else if (C86013q1.m106450k(rq22.f185266d)) {
            return new C98181v0(rq22);
        } else {
            C7335d c = C86312j.m106911c(C62368t0.class);
            C87412m.m108593f(c, "getService(IFinderLoaderDataService::class.java)");
            C100810g0 o7 = ((C62368t0) c).mo87413o7(rq22, C27696y.V10_VIDEO, "xV10", 0);
            String b = o7.mo11841b();
            String path = o7.getPath();
            C58010a aVar = new C58010a(b, path, o7.getUrl() + XVFSFile.SEPARATOR_CHAR + o7.getUrlToken(), (int) rq22.f185270h, (int) rq22.f185271i);
            aVar.f165932d = rq22.f185284x;
            C63320d dVar = new C63320d(aVar);
            dVar.f187121a = i;
            dVar.f187122b = i2;
            return new C110446b(dVar, obj instanceof C60700d.C60701a ? (C60700d.C60701a) obj : null);
        }
    }

    /* renamed from: py */
    public void mo89200py(String str) {
        C87412m.m108594g(str, "path");
        C98453h hVar = C98453h.f288774a;
        C98453h.f288778e.remove(str);
        Log.m105924i("MicroMsg.MediaFileUtil", "removeIgnorePath: " + str);
    }

    /* renamed from: rK */
    public C65005i mo89201rK() {
        return new C101958b();
    }

    public void su0(String str) {
        C87412m.m108594g(str, "path");
        C98453h hVar = C98453h.f288774a;
        C98453h.f288778e.add(str);
        Log.m105924i("MicroMsg.MediaFileUtil", "addIgnorePath: " + str);
    }

    public C94554a tg0(String str) {
        return C63342k.f179710a.mo88239a(str);
    }

    /* renamed from: uV */
    public C65003a mo89204uV(C58010a aVar) {
        C87412m.m108594g(aVar, "mediaInfo");
        return new C63320d(aVar);
    }

    public void uw0(String str) {
        C98453h.f288774a.mo137815m(str);
    }

    public boolean vm0(boolean z, long j) {
        return C30517h0.m39117f(z, j) || C30517h0.m39116e();
    }

    /* renamed from: wN */
    public C57465w mo89207wN(C57467x xVar) {
        C87412m.m108594g(xVar, "vlogComposition");
        return new C96543i((C96552p0) xVar);
    }

    /* renamed from: wj */
    public boolean mo89208wj(String str) {
        C87412m.m108594g(str, "filepath");
        return C98403m0.m127703c(str);
    }

    /* renamed from: x8 */
    public void mo89209x8(C64346ep3 ep32, Rect rect) {
        C87412m.m108594g(rect, "rect");
        C96551o.m123876f(ep32, rect);
    }
}
