package th2;

import com.tencent.p014mm.autogen.mmdata.rpt.EditImageReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsChoosePostBussinessReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsClipPageEntranceExposeReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryDoPublishStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryQuitPublishStruct;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordMediaReportInfo;
import gy3.C87412m;

/* renamed from: th2.d */
public final class C110992d {

    /* renamed from: a */
    public static final C110992d f332425a = new C110992d();

    /* renamed from: b */
    public static RecordMediaReportInfo f332426b = new RecordMediaReportInfo();

    /* renamed from: c */
    public static C37111a f332427c = new C37111a();

    /* renamed from: d */
    public static StoryDoPublishStruct f332428d = new StoryDoPublishStruct();

    /* renamed from: e */
    public static C37111a f332429e = new C37111a();

    /* renamed from: f */
    public static int f332430f = -1;

    /* renamed from: g */
    public static StoryQuitPublishStruct f332431g = new StoryQuitPublishStruct();

    /* renamed from: h */
    public static C37111a f332432h = new C37111a();

    /* renamed from: i */
    public static String f332433i = "";

    /* renamed from: j */
    public static String f332434j = "";

    /* renamed from: c */
    public static void m151314c(C110992d dVar, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        dVar.getClass();
        C87412m.m108594g(str, "key");
        f332426b.mo129812c(str, Integer.valueOf(((Integer) f332426b.mo129811b(str, 0)).intValue() + i));
    }

    /* renamed from: a */
    public final void mo162668a(String str, long j) {
        C87412m.m108594g(str, "key");
        f332426b.mo129812c(str, Long.valueOf(((Long) f332426b.mo129811b(str, 0L)).longValue() + j));
    }

    /* renamed from: b */
    public final void mo162669b(int i) {
        f332427c.mo60974a(i);
    }

    /* renamed from: d */
    public final void mo162670d(int i) {
        int i2;
        if (i == 15 && ((i2 = f332430f) == 4 || i2 == 10)) {
            f332430f = i;
            return;
        }
        f332430f = i;
        f332429e.mo60974a(i);
        f332432h.mo60974a(i);
    }

    /* renamed from: e */
    public final void mo162671e(int i) {
        if (i == 3) {
            RecordMediaReportInfo j = mo162676j();
            StoryDoPublishStruct storyDoPublishStruct = f332428d;
            storyDoPublishStruct.f310301n = storyDoPublishStruct.mo86045b("MusicId", String.valueOf(j.mo129811b("KEY_MUSIC_ID_INT", 0)), true);
            StoryDoPublishStruct storyDoPublishStruct2 = f332428d;
            Object b = j.mo129811b("KEY_MUSIC_INDEX_INT", 0L);
            C87412m.m108593f(b, "commonRecordInfo.getRepo…e(KEY_MUSIC_INDEX_INT, 0)");
            storyDoPublishStruct2.f310302o = ((Number) b).longValue();
            StoryDoPublishStruct storyDoPublishStruct3 = f332428d;
            Object b2 = j.mo129811b("KEY_MUSIC_REQ_ID_INT", 0L);
            C87412m.m108593f(b2, "commonRecordInfo.getRepo…(KEY_MUSIC_REQ_ID_INT, 0)");
            storyDoPublishStruct3.f310304q = ((Number) b2).longValue();
            StoryDoPublishStruct storyDoPublishStruct4 = f332428d;
            Object b3 = j.mo129811b("KEY_SEARCH_MUSIC_INT", 0L);
            C87412m.m108593f(b3, "commonRecordInfo.getRepo…(KEY_SEARCH_MUSIC_INT, 0)");
            storyDoPublishStruct4.f310310w = ((Number) b3).longValue();
            StoryDoPublishStruct storyDoPublishStruct5 = f332428d;
            storyDoPublishStruct5.f310307t = storyDoPublishStruct5.mo86045b("ActionTrace", f332429e.mo60975b(), true);
            f332428d.mo86054n();
            f332430f = -1;
        }
        f332428d = new StoryDoPublishStruct();
        f332429e = new C37111a();
    }

    /* renamed from: f */
    public final void mo162672f() {
        EditImageReportStruct editImageReportStruct = new EditImageReportStruct();
        RecordMediaReportInfo j = mo162676j();
        Object b = j.mo129811b("KEY_NET_TYPE_INT", -1L);
        C87412m.m108593f(b, "info.getReportValue(KEY_NET_TYPE_INT,-1)");
        editImageReportStruct.f310135d = ((Number) b).longValue();
        Object b2 = j.mo129811b("KEY_FROM_SCENE_INT", -1L);
        C87412m.m108593f(b2, "info.getReportValue(KEY_FROM_SCENE_INT,-1)");
        editImageReportStruct.f310136e = ((Number) b2).longValue();
        Object b3 = j.mo129811b("KEY_ENTER_TIME_MS_LONG", -1L);
        C87412m.m108593f(b3, "info.getReportValue(KEY_ENTER_TIME_MS_LONG,-1)");
        editImageReportStruct.f310137f = ((Number) b3).longValue();
        Object b4 = j.mo129811b("KEY_EXIT_TIME_MS_LONG", Long.valueOf(System.currentTimeMillis()));
        C87412m.m108593f(b4, "info.getReportValue(KEY_…stem.currentTimeMillis())");
        editImageReportStruct.f310138g = ((Number) b4).longValue();
        Object b5 = j.mo129811b("KEY_MEDIA_SOURCE_INT", -1L);
        C87412m.m108593f(b5, "info.getReportValue(KEY_MEDIA_SOURCE_INT,-1)");
        editImageReportStruct.f310139h = ((Number) b5).longValue();
        Object b6 = j.mo129811b("KEY_MEDIA_TYPE_INT", -1L);
        C87412m.m108593f(b6, "info.getReportValue(KEY_MEDIA_TYPE_INT,-1)");
        editImageReportStruct.f310140i = ((Number) b6).longValue();
        Object b7 = j.mo129811b("KEY_START_RECORD_MS_LONG", -1L);
        C87412m.m108593f(b7, "info.getReportValue(KEY_START_RECORD_MS_LONG,-1)");
        editImageReportStruct.f310141j = ((Number) b7).longValue();
        Object b8 = j.mo129811b("KEY_ORIGIN_MEDIA_DURATION_MS_LONG", -1L);
        C87412m.m108593f(b8, "info.getReportValue(KEY_…EDIA_DURATION_MS_LONG,-1)");
        editImageReportStruct.f310142k = ((Number) b8).longValue();
        Object b9 = j.mo129811b("KEY_ORIGIN_MEDIA_WIDTH_INT", -1L);
        C87412m.m108593f(b9, "info.getReportValue(KEY_ORIGIN_MEDIA_WIDTH_INT,-1)");
        editImageReportStruct.f310143l = ((Number) b9).longValue();
        Object b15 = j.mo129811b("KEY_ORIGIN_MEDIA_HEIGHT_INT", -1L);
        C87412m.m108593f(b15, "info.getReportValue(KEY_…IGIN_MEDIA_HEIGHT_INT,-1)");
        editImageReportStruct.f310144m = ((Number) b15).longValue();
        Object b16 = j.mo129811b("KEY_ENTER_CROP_PAGE_TIME_MS_LONG", -1L);
        C87412m.m108593f(b16, "info.getReportValue(KEY_…ROP_PAGE_TIME_MS_LONG,-1)");
        editImageReportStruct.f310145n = ((Number) b16).longValue();
        Object b17 = j.mo129811b("KEY_EXIT_CROP_PAGE_TIME_MS_LONG", -1L);
        C87412m.m108593f(b17, "info.getReportValue(KEY_…ROP_PAGE_TIME_MS_LONG,-1)");
        editImageReportStruct.f310146o = ((Number) b17).longValue();
        Object b18 = j.mo129811b("KEY_ENTER_EDIT_PAGE_TIME_MS_LONG", -1L);
        C87412m.m108593f(b18, "info.getReportValue(KEY_…DIT_PAGE_TIME_MS_LONG,-1)");
        editImageReportStruct.f310147p = ((Number) b18).longValue();
        Object b19 = j.mo129811b("KEY_CLICK_EMOJI_COUNT_INT", 0L);
        C87412m.m108593f(b19, "info.getReportValue(KEY_CLICK_EMOJI_COUNT_INT,0)");
        editImageReportStruct.f310148q = ((Number) b19).longValue();
        Object b25 = j.mo129811b("KEY_ADD_EMOJI_COUNT_INT", 0L);
        C87412m.m108593f(b25, "info.getReportValue(KEY_ADD_EMOJI_COUNT_INT,0)");
        editImageReportStruct.f310149r = ((Number) b25).longValue();
        Object b26 = j.mo129811b("KEY_CLICK_TEXT_COUNT_INT", 0L);
        C87412m.m108593f(b26, "info.getReportValue(KEY_CLICK_TEXT_COUNT_INT,0)");
        editImageReportStruct.f310150s = ((Number) b26).longValue();
        Object b27 = j.mo129811b("KEY_ADD_TEXT_COUNT_INT", 0L);
        C87412m.m108593f(b27, "info.getReportValue(KEY_ADD_TEXT_COUNT_INT,0)");
        editImageReportStruct.f310151t = ((Number) b27).longValue();
        Object b28 = j.mo129811b("KEY_CLICK_DOODLE_COUNT_INT", 0L);
        C87412m.m108593f(b28, "info.getReportValue(KEY_CLICK_DOODLE_COUNT_INT,0)");
        editImageReportStruct.f310152u = ((Number) b28).longValue();
        Object b29 = j.mo129811b("KEY_ADD_DOODLE_COUNT_INT", 0L);
        C87412m.m108593f(b29, "info.getReportValue(KEY_ADD_DOODLE_COUNT_INT,0)");
        editImageReportStruct.f310153v = ((Number) b29).longValue();
        Object b35 = j.mo129811b("KEY_ADD_DOODLE_COLOR_COUNT_INT", 0L);
        C87412m.m108593f(b35, "info.getReportValue(KEY_…DOODLE_COLOR_COUNT_INT,0)");
        editImageReportStruct.f310154w = ((Number) b35).longValue();
        Object b36 = j.mo129811b("KEY_CLICK_MOSAIC_COUNT_INT", 0L);
        C87412m.m108593f(b36, "info.getReportValue(KEY_CLICK_MOSAIC_COUNT_INT,0)");
        editImageReportStruct.f310155x = ((Number) b36).longValue();
        Object b37 = j.mo129811b("KEY_CLICK_BRUSH_COUNT_INT", 0L);
        C87412m.m108593f(b37, "info.getReportValue(KEY_CLICK_BRUSH_COUNT_INT,0)");
        editImageReportStruct.f310156y = ((Number) b37).longValue();
        Object b38 = j.mo129811b("KEY_ADD_MOSAIC_COUNT_INT", 0L);
        C87412m.m108593f(b38, "info.getReportValue(KEY_ADD_MOSAIC_COUNT_INT,0)");
        editImageReportStruct.f310157z = ((Number) b38).longValue();
        Object b39 = j.mo129811b("KEY_CLICK_CROP_COUNT_INT", 0L);
        C87412m.m108593f(b39, "info.getReportValue(KEY_CLICK_CROP_COUNT_INT,0)");
        editImageReportStruct.f310108A = ((Number) b39).longValue();
        Object b44 = j.mo129811b("KEY_CROP_MEDIA_HEIGHT_INT", -1L);
        C87412m.m108593f(b44, "info.getReportValue(KEY_CROP_MEDIA_HEIGHT_INT,-1)");
        editImageReportStruct.f310110C = ((Number) b44).longValue();
        Object b45 = j.mo129811b("KEY_CROP_MEDIA_WIDTH_INT", -1L);
        C87412m.m108593f(b45, "info.getReportValue(KEY_CROP_MEDIA_WIDTH_INT,-1)");
        editImageReportStruct.f310109B = ((Number) b45).longValue();
        Object b46 = j.mo129811b("KEY_ROTATE_INT", -1L);
        C87412m.m108593f(b46, "info.getReportValue(KEY_ROTATE_INT,-1)");
        editImageReportStruct.f310111D = ((Number) b46).longValue();
        Object b47 = j.mo129811b("KEY_CLICK_MUSIC_COUNT_INT", 0L);
        C87412m.m108593f(b47, "info.getReportValue(KEY_CLICK_MUSIC_COUNT_INT,0)");
        editImageReportStruct.f310112E = ((Number) b47).longValue();
        Object b48 = j.mo129811b("KEY_MUSIC_ID_INT", -1L);
        C87412m.m108593f(b48, "info.getReportValue(KEY_MUSIC_ID_INT,-1)");
        editImageReportStruct.f310113F = ((Number) b48).longValue();
        Object b49 = j.mo129811b("KEY_MUSIC_INDEX_INT", -1L);
        C87412m.m108593f(b49, "info.getReportValue(KEY_MUSIC_INDEX_INT,-1)");
        editImageReportStruct.f310114G = ((Number) b49).longValue();
        Object b54 = j.mo129811b("KEY_SELECT_MUSIC_INT", -1L);
        C87412m.m108593f(b54, "info.getReportValue(KEY_SELECT_MUSIC_INT,-1)");
        editImageReportStruct.f310115H = ((Number) b54).longValue();
        Object b55 = j.mo129811b("KEY_SELECT_ORIGIN_INT", -1L);
        C87412m.m108593f(b55, "info.getReportValue(KEY_SELECT_ORIGIN_INT,-1)");
        editImageReportStruct.f310116I = ((Number) b55).longValue();
        Object b56 = j.mo129811b("KEY_MUSIC_REQ_ID_INT", -1L);
        C87412m.m108593f(b56, "info.getReportValue(KEY_MUSIC_REQ_ID_INT,-1)");
        editImageReportStruct.f310117J = ((Number) b56).longValue();
        Object b57 = j.mo129811b("KEY_SEARCH_MUSIC_INT", -1L);
        C87412m.m108593f(b57, "info.getReportValue(KEY_SEARCH_MUSIC_INT,-1)");
        editImageReportStruct.f310118K = ((Number) b57).longValue();
        Object b58 = j.mo129811b("KEY_CLICK_VIDEO_CROP_COUNT_INT", 0L);
        C87412m.m108593f(b58, "info.getReportValue(KEY_…K_VIDEO_CROP_COUNT_INT,0)");
        editImageReportStruct.f310119L = ((Number) b58).longValue();
        Object b59 = j.mo129811b("KEY_VIDEO_CROP_DURATION_MS_INT", -1L);
        C87412m.m108593f(b59, "info.getReportValue(KEY_…_CROP_DURATION_MS_INT,-1)");
        editImageReportStruct.f310120M = ((Number) b59).longValue();
        Object b64 = j.mo129811b("KEY_AFTER_EDIT_INT", -1L);
        C87412m.m108593f(b64, "info.getReportValue(KEY_AFTER_EDIT_INT,-1)");
        editImageReportStruct.f310121N = ((Number) b64).longValue();
        Object b65 = j.mo129811b("KEY_EDIT_PUBLISHID_INT", -1L);
        C87412m.m108593f(b65, "info.getReportValue(KEY_EDIT_PUBLISHID_INT,-1)");
        editImageReportStruct.f310122O = ((Number) b65).longValue();
        Object b66 = j.mo129811b("KEY_IS_SHOW_WESEE_BTN", 0L);
        C87412m.m108593f(b66, "info.getReportValue(KEY_IS_SHOW_WESEE_BTN, 0)");
        editImageReportStruct.f310124Q = ((Number) b66).longValue();
        Object b67 = j.mo129811b("KEY_IS_CLICK_WESEE_BTN", 0L);
        C87412m.m108593f(b67, "info.getReportValue(KEY_IS_CLICK_WESEE_BTN, 0)");
        editImageReportStruct.f310125R = ((Number) b67).longValue();
        Object b68 = j.mo129811b("KEY_IS_INSTALL_WESEE", 0L);
        C87412m.m108593f(b68, "info.getReportValue(KEY_IS_INSTALL_WESEE, 0)");
        editImageReportStruct.f310126S = ((Number) b68).longValue();
        Object b69 = j.mo129811b("KEY_WESEE_DIALOG_OPERATION", 0L);
        C87412m.m108593f(b69, "info.getReportValue(KEY_WESEE_DIALOG_OPERATION, 0)");
        editImageReportStruct.f310127T = ((Number) b69).longValue();
        editImageReportStruct.f310123P = editImageReportStruct.mo86045b("ActionTrace", f332427c.mo60975b(), true);
        Object b74 = j.mo129811b("KEY_SEARCH_MUSIC_COUNT_INT", 0L);
        C87412m.m108593f(b74, "info.getReportValue(KEY_SEARCH_MUSIC_COUNT_INT, 0)");
        editImageReportStruct.f310128U = ((Number) b74).longValue();
        editImageReportStruct.f310129V = editImageReportStruct.mo86045b("SearchMusicList", (String) j.mo129811b("KEY_SEARCH_MUSIC_LIST_STRING", ""), true);
        editImageReportStruct.f310130W = editImageReportStruct.mo86045b("TextWidgetContentList", (String) j.mo129811b("KEY_TEXT_WIDGET_CONTENT_STRING", ""), true);
        editImageReportStruct.f310132Y = editImageReportStruct.mo86045b("moment_sessionid", (String) j.mo129811b("moment_sessionid_", ""), true);
        editImageReportStruct.f310134a0 = editImageReportStruct.mo86045b("CameraSessionID", (String) j.mo129811b("KEY_CAMERA_SESSION_ID", ""), true);
        Object b75 = j.mo129811b("KEY_ZOOM_IN_OUT_COUNT", 0L);
        C87412m.m108593f(b75, "info.getReportValue(KEY_ZOOM_IN_OUT_COUNT, 0)");
        editImageReportStruct.f310133Z = ((Number) b75).longValue();
        editImageReportStruct.mo86054n();
        int i = (int) editImageReportStruct.f310136e;
        f332426b = new RecordMediaReportInfo();
        f332427c = new C37111a();
        f332425a.mo162677k("KEY_FROM_SCENE_INT", Integer.valueOf(i));
    }

    /* renamed from: g */
    public final void mo162673g(int i) {
        if (i == 3) {
            f332431g.f310318h = System.currentTimeMillis();
            StoryQuitPublishStruct storyQuitPublishStruct = f332431g;
            storyQuitPublishStruct.f310325o = storyQuitPublishStruct.mo86045b("NewActionTrace", f332432h.mo60975b(), true);
            f332431g.mo86054n();
        }
        f332431g = new StoryQuitPublishStruct();
        f332432h = new C37111a();
    }

    /* renamed from: h */
    public final void mo162674h(long j) {
        SnsChoosePostBussinessReportStruct snsChoosePostBussinessReportStruct = new SnsChoosePostBussinessReportStruct();
        snsChoosePostBussinessReportStruct.f265953e = 2;
        snsChoosePostBussinessReportStruct.f265954f = j;
        snsChoosePostBussinessReportStruct.f265952d = snsChoosePostBussinessReportStruct.mo86045b("sessionid", f332434j, true);
        snsChoosePostBussinessReportStruct.mo86054n();
    }

    /* renamed from: i */
    public final void mo162675i(long j) {
        SnsClipPageEntranceExposeReportStruct snsClipPageEntranceExposeReportStruct = new SnsClipPageEntranceExposeReportStruct();
        snsClipPageEntranceExposeReportStruct.f156852e = j;
        snsClipPageEntranceExposeReportStruct.f156851d = snsClipPageEntranceExposeReportStruct.mo86045b("sessionid", f332433i, true);
        snsClipPageEntranceExposeReportStruct.mo86054n();
    }

    /* renamed from: j */
    public final RecordMediaReportInfo mo162676j() {
        f332426b.mo129812c("KEY_ACTION_TRACE_STRING", f332427c.mo60975b());
        return f332426b;
    }

    /* renamed from: k */
    public final void mo162677k(String str, Object obj) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(obj, "value");
        f332426b.mo129812c(str, obj);
    }
}
