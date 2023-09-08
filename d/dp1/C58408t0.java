package dp1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.autogen.events.FinderPostStatusEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderPostMentionInfoStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderPostStruct;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordMediaReportInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.protocal.protobuf.FinderMediaReportInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C31543z5;
import er1.C58741j5;
import er1.C58775t;
import er1.C7888v2;
import f40.C86709a0;
import fp1.C59266a;
import fp1.C59267b;
import fp1.C59268c;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import o40.C61926c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p707tz.C64999e;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C64589nq2;
import uq1.C65464w;
import vp1.C65834e;
import wp1.C15585f;
import z04.C112551y;
import zc1.C66785b;

/* renamed from: dp1.t0 */
public final class C58408t0 {

    /* renamed from: a */
    public static final C58408t0 f167336a = new C58408t0();

    /* renamed from: b */
    public static FinderFeedReportObject f167337b;

    /* renamed from: c */
    public static C65464w f167338c = new C58409a();

    /* renamed from: dp1.t0$a */
    public static final class C58409a implements C65464w {
        public void onPostEnd(long j, boolean z) {
            FinderItem d = C15585f.f42211a.mo14341d(j);
            if (d != null) {
                C58408t0.f167336a.mo83262h(d, false);
            }
            FinderPostStatusEvent finderPostStatusEvent = new FinderPostStatusEvent();
            FinderPostStatusEvent.C28746a aVar = finderPostStatusEvent.f78800d;
            aVar.f78801a = j;
            aVar.f78802b = false;
            finderPostStatusEvent.publish();
        }

        public void onPostNotify(long j, boolean z) {
            if (!z) {
                FinderPostStatusEvent finderPostStatusEvent = new FinderPostStatusEvent();
                FinderPostStatusEvent.C28746a aVar = finderPostStatusEvent.f78800d;
                aVar.f78801a = j;
                aVar.f78802b = false;
                finderPostStatusEvent.publish();
            }
        }

        public void onPostOk(long j, long j2) {
            C58408t0 t0Var = C58408t0.f167336a;
            Class cls = C64999e.class;
            FinderItem e = C65834e.f189316a.mo89871e(j2);
            if (e != null) {
                C64999e eVar = (C64999e) C86312j.m106911c(cls);
                FinderFeedReportObject finderFeedReportObject = e.field_reportObject;
                eVar.mo89160bf(finderFeedReportObject != null ? (long) finderFeedReportObject.uploadCost : 0);
                ((C64999e) C86312j.m106911c(cls)).mo89163kC();
                t0Var.mo83262h(e, true);
                C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
                y0Var.getClass();
                FinderFeedReportObject finderFeedReportObject2 = e.field_reportObject;
                if (finderFeedReportObject2 != null) {
                    FinderPostMentionInfoStruct finderPostMentionInfoStruct = new FinderPostMentionInfoStruct();
                    finderPostMentionInfoStruct.f155807d = finderPostMentionInfoStruct.mo86045b("FeedId", y0Var.xx0(e.getId()), true);
                    finderPostMentionInfoStruct.f155808e = finderPostMentionInfoStruct.mo86045b("SessionId", finderFeedReportObject2.sessionId, true);
                    finderPostMentionInfoStruct.f155809f = finderPostMentionInfoStruct.mo86045b("PostUsername", e.getFeedObject().username, true);
                    C58775t tVar = C58775t.f168276a;
                    LinkedList<C64589nq2> linkedList = e.field_postinfo.f185656r;
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    Iterator<C64589nq2> it = linkedList.iterator();
                    while (it.hasNext()) {
                        C64589nq2 next = it.next();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(FirebaseAnalytics.C113379b.INDEX, next.f184536j);
                        jSONObject2.put("type", next.f184535i);
                        jSONArray.put(jSONObject2);
                    }
                    jSONObject.put("atcontent", jSONArray);
                    jSONObject.put("num", linkedList.size());
                    String jSONObject3 = jSONObject.toString();
                    C87412m.m108593f(jSONObject3, "report.toString()");
                    finderPostMentionInfoStruct.f155810g = finderPostMentionInfoStruct.mo86045b("mentionedDetailInfo", C112551y.m153814n(jSONObject3, ",", ";", false), true);
                    finderPostMentionInfoStruct.mo86054n();
                    y0Var.Ec0(finderPostMentionInfoStruct);
                }
            }
            FinderItem e2 = C65834e.f189316a.mo89871e(j2);
            if (e2 != null) {
                FinderPostStatusEvent finderPostStatusEvent = new FinderPostStatusEvent();
                FinderPostStatusEvent.C28746a aVar = finderPostStatusEvent.f78800d;
                aVar.f78801a = j;
                aVar.f78802b = true;
                aVar.f78803c = C7888v2.f26513a.mo9010h(e2, true);
                finderPostStatusEvent.publish();
            }
        }

        public void onPostStart(long j) {
        }
    }

    /* renamed from: dp1.t0$b */
    public static final class C58410b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f167339d;

        /* renamed from: e */
        public final /* synthetic */ FinderFeedReportObject f167340e;

        /* renamed from: f */
        public final /* synthetic */ int f167341f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58410b(boolean z, FinderFeedReportObject finderFeedReportObject, int i) {
            super(0);
            this.f167339d = z;
            this.f167340e = finderFeedReportObject;
            this.f167341f = i;
        }

        public Object invoke() {
            String str;
            String str2 = "";
            if (this.f167339d) {
                try {
                    String str3 = C58741j5.f168194k + "postdraft.info";
                    if (C86013q1.m106450k(str3)) {
                        this.f167340e.parseFrom(C86013q1.m106433O(str3, 0, -1));
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("Finder.FinderPostReportLogic", e, str2, new Object[0]);
                }
                Log.m105924i("Finder.FinderPostReportLogic", "read draft " + this.f167340e.lbsFlag);
            }
            this.f167340e.sessionId = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            FinderFeedReportObject finderFeedReportObject = this.f167340e;
            finderFeedReportObject.enterScene = this.f167341f;
            finderFeedReportObject.draft = this.f167339d ? 1 : 0;
            finderFeedReportObject.flowId = C31543z5.m39453c() + '_' + C66785b.f191882e.mo90662O5();
            C59266a aVar = C59266a.f169452a;
            FinderFeedReportObject finderFeedReportObject2 = C58408t0.f167337b;
            if (!(finderFeedReportObject2 == null || (str = finderFeedReportObject2.flowId) == null)) {
                str2 = str;
            }
            aVar.mo84410b(str2, C59267b.f169453a);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final String mo83255a(List<? extends FinderMediaReportInfo> list) {
        C87412m.m108594g(list, "multiMediaInfo");
        JSONArray jSONArray = new JSONArray();
        for (FinderMediaReportInfo finderMediaReportInfo : list) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("w", finderMediaReportInfo.width);
            jSONObject.put("h", finderMediaReportInfo.height);
            jSONObject.put(V2TXJSAdapterConstants.PUSHER_KEY_FPS, finderMediaReportInfo.fps);
            jSONObject.put("audiobitrate", finderMediaReportInfo.audioBitrate);
            jSONObject.put("videobitrate", finderMediaReportInfo.videoBitrate);
            jSONArray.put(jSONObject);
        }
        String jSONArray2 = jSONArray.toString();
        C87412m.m108593f(jSONArray2, "array.toString()");
        return jSONArray2;
    }

    /* renamed from: b */
    public final void mo83256b(FinderPostStruct finderPostStruct) {
        String str;
        FinderFeedReportObject finderFeedReportObject = f167337b;
        if (finderFeedReportObject != null && (str = finderFeedReportObject.clientKvReportInfo) != null) {
            if (!(str.length() == 0)) {
                try {
                    finderPostStruct.f155868l0 = finderPostStruct.mo86045b("vst_id", new JSONObject(str).optString("vstId"), true);
                } catch (Exception e) {
                    Log.m105920e("Finder.FinderPostReportLogic", e.getMessage());
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo83257c(RecordMediaReportInfo recordMediaReportInfo) {
        C87412m.m108594g(recordMediaReportInfo, "reportInfo");
        FinderFeedReportObject finderFeedReportObject = f167337b;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.videoMusicId = String.valueOf(recordMediaReportInfo.mo129811b("KEY_MUSIC_ID_INT", 0));
            Object b = recordMediaReportInfo.mo129811b("KEY_SEARCH_MUSIC_INT", 0);
            C87412m.m108593f(b, "reportInfo.getReportValue(KEY_SEARCH_MUSIC_INT, 0)");
            finderFeedReportObject.videoMusicSearch = ((Number) b).intValue();
            Object b2 = recordMediaReportInfo.mo129811b("KEY_MUSIC_INDEX_INT", 0);
            C87412m.m108593f(b2, "reportInfo.getReportValue(KEY_MUSIC_INDEX_INT, 0)");
            finderFeedReportObject.videoMusicIndex = ((Number) b2).intValue();
            Object b3 = recordMediaReportInfo.mo129811b("KEY_ADD_EMOJI_COUNT_INT", 0);
            C87412m.m108593f(b3, "reportInfo.getReportValu…Y_ADD_EMOJI_COUNT_INT, 0)");
            finderFeedReportObject.videoEmojiCount = ((Number) b3).intValue();
            Object b4 = recordMediaReportInfo.mo129811b("KEY_ADD_TEXT_COUNT_INT", 0);
            C87412m.m108593f(b4, "reportInfo.getReportValu…EY_ADD_TEXT_COUNT_INT, 0)");
            finderFeedReportObject.videoWordingCount = ((Number) b4).intValue();
            Object b5 = recordMediaReportInfo.mo129811b("KEY_ENTER_EDIT_PAGE_TIME_MS_LONG", 0L);
            C87412m.m108593f(b5, "reportInfo.getReportValu…IT_PAGE_TIME_MS_LONG, 0L)");
            finderFeedReportObject.enterVideoEditTime = ((Number) b5).longValue();
            Object b6 = recordMediaReportInfo.mo129811b("KEY_VIDEO_SUB_TYPE_INT", 0);
            C87412m.m108593f(b6, "reportInfo.getReportValu…EY_VIDEO_SUB_TYPE_INT, 0)");
            finderFeedReportObject.videoSubType = ((Number) b6).intValue();
            finderFeedReportObject.postId = (String) recordMediaReportInfo.mo129811b("KEY_MULTI_MEDIA_POST_ID_STRING", "");
            finderFeedReportObject.editId = (String) recordMediaReportInfo.mo129811b("KEY_MULTI_MEDIA_EDIT_ID_STRING", "");
            Object b7 = recordMediaReportInfo.mo129811b("KEY_IS_SUB_RECORD_BOOLEAN", Boolean.FALSE);
            C87412m.m108593f(b7, "reportInfo.getReportValu…UB_RECORD_BOOLEAN, false)");
            finderFeedReportObject.isMultiShot = ((Boolean) b7).booleanValue() ? 1 : 0;
            Object b8 = recordMediaReportInfo.mo129811b("KEY_CHANGE_SUB_RECORD_TAB_INT", 0);
            C87412m.m108593f(b8, "reportInfo.getReportValu…GE_SUB_RECORD_TAB_INT, 0)");
            finderFeedReportObject.multiShotChangeCnt = ((Number) b8).intValue();
            Object b9 = recordMediaReportInfo.mo129811b("KEY_SUB_VIDEO_RECORD_CLICK_INT", 0);
            C87412m.m108593f(b9, "reportInfo.getReportValu…IDEO_RECORD_CLICK_INT, 0)");
            finderFeedReportObject.multiShotClickCnt = ((Number) b9).intValue();
            Object b15 = recordMediaReportInfo.mo129811b("KEY_SUB_VIDEO_RECORD_SUCCESS_INT", 0);
            C87412m.m108593f(b15, "reportInfo.getReportValu…EO_RECORD_SUCCESS_INT, 0)");
            finderFeedReportObject.multiShotSuccessCnt = ((Number) b15).intValue();
            Object b16 = recordMediaReportInfo.mo129811b("KEY_SUB_VIDEO_NUM_INT", 0);
            C87412m.m108593f(b16, "reportInfo.getReportValu…KEY_SUB_VIDEO_NUM_INT, 0)");
            finderFeedReportObject.multiShotVideoCnt = ((Number) b16).intValue();
        }
    }

    /* renamed from: d */
    public final void mo83258d(RecordMediaReportInfo recordMediaReportInfo) {
        C87412m.m108594g(recordMediaReportInfo, "reportInfo");
        FinderFeedReportObject finderFeedReportObject = f167337b;
        if (finderFeedReportObject != null) {
            Boolean bool = Boolean.FALSE;
            Object b = recordMediaReportInfo.mo129811b("KEY_RECORD_IS_BEAUTIFY", bool);
            C87412m.m108593f(b, "reportInfo.getReportValu…ECORD_IS_BEAUTIFY, false)");
            finderFeedReportObject.isBeauty = ((Boolean) b).booleanValue() ? 1 : 0;
            Object b2 = recordMediaReportInfo.mo129811b("KEY_ORIGIN_MEDIA_DURATION_MS_LONG", 0L);
            C87412m.m108593f(b2, "reportInfo.getReportValu…DIA_DURATION_MS_LONG, 0L)");
            finderFeedReportObject.videoRecordTime = ((Number) b2).longValue();
            finderFeedReportObject.videoSource = ((Number) recordMediaReportInfo.mo129811b("KEY_MEDIA_SOURCE_INT", 0)).intValue() + 1;
            finderFeedReportObject.videoMusicId = String.valueOf(recordMediaReportInfo.mo129811b("KEY_MUSIC_ID_INT", 0));
            Object b3 = recordMediaReportInfo.mo129811b("KEY_SEARCH_MUSIC_INT", 0);
            C87412m.m108593f(b3, "reportInfo.getReportValue(KEY_SEARCH_MUSIC_INT, 0)");
            finderFeedReportObject.videoMusicSearch = ((Number) b3).intValue();
            Object b4 = recordMediaReportInfo.mo129811b("KEY_MUSIC_INDEX_INT", 0);
            C87412m.m108593f(b4, "reportInfo.getReportValue(KEY_MUSIC_INDEX_INT, 0)");
            finderFeedReportObject.videoMusicIndex = ((Number) b4).intValue();
            Object b5 = recordMediaReportInfo.mo129811b("KEY_ADD_EMOJI_COUNT_INT", 0);
            C87412m.m108593f(b5, "reportInfo.getReportValu…Y_ADD_EMOJI_COUNT_INT, 0)");
            finderFeedReportObject.videoEmojiCount = ((Number) b5).intValue();
            Object b6 = recordMediaReportInfo.mo129811b("KEY_ADD_TEXT_COUNT_INT", 0);
            C87412m.m108593f(b6, "reportInfo.getReportValu…EY_ADD_TEXT_COUNT_INT, 0)");
            finderFeedReportObject.videoWordingCount = ((Number) b6).intValue();
            Object b7 = recordMediaReportInfo.mo129811b("KEY_ENTER_EDIT_PAGE_TIME_MS_LONG", 0L);
            C87412m.m108593f(b7, "reportInfo.getReportValu…IT_PAGE_TIME_MS_LONG, 0L)");
            finderFeedReportObject.enterVideoEditTime = ((Number) b7).longValue();
            Object b8 = recordMediaReportInfo.mo129811b("KEY_ENTER_TIME_MS_LONG", 0L);
            C87412m.m108593f(b8, "reportInfo.getReportValu…Y_ENTER_TIME_MS_LONG, 0L)");
            finderFeedReportObject.enterTakePhotoTime = ((Number) b8).longValue();
            Object b9 = recordMediaReportInfo.mo129811b("KEY_IS_SUB_RECORD_BOOLEAN", bool);
            C87412m.m108593f(b9, "reportInfo.getReportValu…UB_RECORD_BOOLEAN, false)");
            finderFeedReportObject.isMultiShot = ((Boolean) b9).booleanValue() ? 1 : 0;
            Object b15 = recordMediaReportInfo.mo129811b("KEY_CHANGE_SUB_RECORD_TAB_INT", 0);
            C87412m.m108593f(b15, "reportInfo.getReportValu…GE_SUB_RECORD_TAB_INT, 0)");
            finderFeedReportObject.multiShotChangeCnt = ((Number) b15).intValue();
            Object b16 = recordMediaReportInfo.mo129811b("KEY_SUB_VIDEO_RECORD_CLICK_INT", 0);
            C87412m.m108593f(b16, "reportInfo.getReportValu…IDEO_RECORD_CLICK_INT, 0)");
            finderFeedReportObject.multiShotClickCnt = ((Number) b16).intValue();
            Object b17 = recordMediaReportInfo.mo129811b("KEY_SUB_VIDEO_RECORD_SUCCESS_INT", 0);
            C87412m.m108593f(b17, "reportInfo.getReportValu…EO_RECORD_SUCCESS_INT, 0)");
            finderFeedReportObject.multiShotSuccessCnt = ((Number) b17).intValue();
            Object b18 = recordMediaReportInfo.mo129811b("KEY_SUB_VIDEO_NUM_INT", 0);
            C87412m.m108593f(b18, "reportInfo.getReportValu…KEY_SUB_VIDEO_NUM_INT, 0)");
            finderFeedReportObject.multiShotVideoCnt = ((Number) b18).intValue();
        }
    }

    /* renamed from: e */
    public final JSONObject mo83259e(JSONObject jSONObject, String str, int i) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put(str, i);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: f */
    public final void mo83260f(int i) {
        FinderFeedReportObject finderFeedReportObject = f167337b;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.videoSource = i;
        }
    }

    /* renamed from: g */
    public final void mo83261g(boolean z, int i) {
        Class cls = FinderCommonFeatureService.class;
        int i2 = 1;
        boolean z2 = C66785b.f191882e.mo90662O5().length() > 0;
        String str = C86709a0.m107523b().mo121111i() + '_' + Util.nowMilliSecond();
        int i3 = (((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("TLPostCamera") == null && ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("TLCamera") == null) ? 0 : 1;
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[5];
        objArr[0] = str;
        objArr[1] = Integer.valueOf(z ? 1 : 2);
        objArr[2] = Integer.valueOf(i);
        if (!z2) {
            i2 = 2;
        }
        objArr[3] = Integer.valueOf(i2);
        objArr[4] = Integer.valueOf(i3);
        nVar.mo160131h(20949, objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0561, code lost:
        if (r0 == null) goto L_0x0563;
     */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x053f  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0566  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0599  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x05b2  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x05cd  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x05e9  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x05f7  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0617  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x062a  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x06c1  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x06d0  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x06f2  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x06f4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x02ac A[Catch:{ JSONException -> 0x0308 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x02b3 A[Catch:{ JSONException -> 0x0308 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x02cc A[Catch:{ Exception -> 0x02d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x02ce A[Catch:{ Exception -> 0x02d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x02d1 A[Catch:{ Exception -> 0x02d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02e5 A[Catch:{ JSONException -> 0x0308 }] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo83262h(com.tencent.p014mm.plugin.finder.storage.FinderItem r33, boolean r34) {
        /*
            r32 = this;
            r1 = r33
            r2 = r34
            java.lang.Class<dp1.y0> r3 = dp1.C58417y0.class
            java.util.LinkedList r0 = r33.getMediaList()
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = sx3.C36907w.m41090l(r0, r5)
            r4.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.String r7 = ""
            r8 = r7
            r9 = 0
        L_0x0022:
            boolean r10 = r0.hasNext()
            r11 = 1
            if (r10 == 0) goto L_0x005c
            java.lang.Object r9 = r0.next()
            te3.rq2 r9 = (te3.C64689rq2) r9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r8)
            int r8 = r9.f185268f
            r10.append(r8)
            r8 = 59
            r10.append(r8)
            int r8 = r9.f185269g
            r10.append(r8)
            r8 = 35
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            java.lang.String r9 = r9.f185283w
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            r9 = r9 ^ r11
            rx3.b0 r10 = rx3.C13598b0.f38549a
            r4.add(r10)
            goto L_0x0022
        L_0x005c:
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r4 = r1.field_reportObject
            java.lang.String r10 = "Finder.FinderPostReportLogic"
            java.lang.String r12 = ";"
            java.lang.String r13 = ","
            if (r4 == 0) goto L_0x0343
            com.tencent.mm.autogen.mmdata.rpt.FinderPostStruct r15 = new com.tencent.mm.autogen.mmdata.rpt.FinderPostStruct
            r15.<init>()
            java.lang.String r0 = r4.sessionId
            java.lang.String r14 = "SessionId"
            java.lang.String r0 = r15.mo86045b(r14, r0, r11)
            r15.f155851d = r0
            int r0 = r4.enterScene
            r15.f155853e = r0
            r15.f155855f = r2
            java.lang.String r14 = "active_info"
            if (r2 != r11) goto L_0x008d
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = f167337b
            if (r0 == 0) goto L_0x0086
            java.lang.String r0 = r0.activeInfo
            goto L_0x0087
        L_0x0086:
            r0 = 0
        L_0x0087:
            java.lang.String r0 = r15.mo86045b(r14, r0, r11)
            r15.f155864j0 = r0
        L_0x008d:
            di3.d r0 = di3.C86312j.m106911c(r3)
            dp1.y0 r0 = (dp1.C58417y0) r0
            r20 = r6
            long r5 = r33.getId()
            java.lang.String r0 = r0.xx0(r5)
            java.lang.String r5 = "FeedID"
            java.lang.String r0 = r15.mo86045b(r5, r0, r11)
            r15.f155857g = r0
            int r0 = r4.draftId
            long r5 = (long) r0
            java.lang.String r0 = o40.C61926c.m72691p(r5)
            java.lang.String r5 = "draftId"
            java.lang.String r0 = r15.mo86045b(r5, r0, r11)
            r15.f155858g0 = r0
            int r0 = r4.draftType
            long r5 = (long) r0
            r15.f155860h0 = r5
            int r0 = r4.exitPageId
            r15.f155859h = r0
            long r5 = r4.enterTakePhotoTime
            r15.f155861i = r5
            long r5 = r4.enterVideoEditTime
            r15.f155863j = r5
            long r5 = r4.sendOrExitButtonTime
            r15.f155865k = r5
            long r5 = r4.videoRecordTime
            r15.f155867l = r5
            int r0 = r4.videoSource
            long r5 = (long) r0
            r15.f155869m = r5
            int r0 = r4.videoEmojiCount
            long r5 = (long) r0
            r15.f155870n = r5
            int r0 = r4.videoWordingCount
            long r5 = (long) r0
            r15.f155871o = r5
            java.lang.String r0 = r4.videoMusicId
            if (r0 != 0) goto L_0x00e1
            r0 = r7
        L_0x00e1:
            java.lang.String r5 = "VideoMusicId"
            java.lang.String r0 = r15.mo86045b(r5, r0, r11)
            r15.f155872p = r0
            int r0 = r4.videoMusicIndex
            long r5 = (long) r0
            r15.f155873q = r5
            int r0 = r4.videoMusicSearch
            long r5 = (long) r0
            r15.f155874r = r5
            int r0 = r4.videoPostType
            long r5 = (long) r0
            r15.f155875s = r5
            java.lang.String r0 = "ExtInfo"
            java.lang.String r0 = r15.mo86045b(r0, r8, r11)
            r15.f155876t = r0
            int r0 = r4.existDesc
            long r5 = (long) r0
            r15.f155877u = r5
            int r0 = r4.descCount
            long r5 = (long) r0
            r15.f155878v = r5
            java.lang.String r0 = r4.actionTrace
            if (r0 != 0) goto L_0x010f
            r0 = r7
        L_0x010f:
            java.lang.String r5 = "Action"
            java.lang.String r0 = r15.mo86045b(r5, r0, r11)
            r15.f155879w = r0
            int r0 = r4.lbsFlag
            long r5 = (long) r0
            r15.f155880x = r5
            java.lang.String r0 = r4.link
            if (r0 != 0) goto L_0x0121
            r0 = r7
        L_0x0121:
            java.lang.String r5 = "Url"
            java.lang.String r0 = r15.mo86045b(r5, r0, r11)
            r15.f155881y = r0
            int r0 = r4.draft
            long r5 = (long) r0
            r15.f155882z = r5
            er1.q3 r0 = er1.C58771q3.f168268a
            java.lang.String r0 = r0.mo83810a(r1)
            r5 = 0
            java.lang.String r0 = z04.C112551y.m153814n(r0, r13, r12, r5)
            java.lang.String r5 = "Tag"
            java.lang.String r0 = r15.mo86045b(r5, r0, r11)
            r15.f155822A = r0
            java.lang.String r0 = "TagId"
            java.lang.String r0 = r15.mo86045b(r0, r7, r11)
            r15.f155823B = r0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x0150
            r5 = 0
            goto L_0x0152
        L_0x0150:
            r5 = 2
        L_0x0152:
            r15.f155824C = r5
            int r0 = r4.mentionCount
            r15.f155828G = r0
            int r0 = r4.clickMentionCount
            long r5 = (long) r0
            r15.f155829H = r5
            int r0 = r4.clickSucMentionCount
            long r5 = (long) r0
            r15.f155830I = r5
            int r0 = r4.mentionRepeatCount
            long r5 = (long) r0
            r15.f155831J = r5
            dp1.t0 r0 = f167336a
            int r5 = r4.is_change_product_title
            java.lang.String r6 = "is_change_product_title"
            r8 = 0
            org.json.JSONObject r5 = r0.mo83259e(r8, r6, r5)
            int r6 = r4.recommend_lbs_position
            if (r6 < 0) goto L_0x017c
            java.lang.String r8 = "recommend_lbs_position"
            org.json.JSONObject r5 = r0.mo83259e(r5, r8, r6)
        L_0x017c:
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "editInfoJson.toString()"
            gy3.C87412m.m108593f(r5, r6)
            r6 = 0
            java.lang.String r5 = z04.C112551y.m153814n(r5, r13, r12, r6)
            java.lang.String r6 = "EditInfo"
            java.lang.String r5 = r15.mo86045b(r6, r5, r11)
            r15.f155825D = r5
            r15.f155827F = r9
            java.lang.String r5 = r4.forwardingAppId
            java.lang.String r6 = "ForwardingAppId"
            java.lang.String r5 = r15.mo86045b(r6, r5, r11)
            r15.f155852d0 = r5
            java.lang.String r5 = r4.topicActivityId
            java.lang.String r6 = "ActivityID"
            java.lang.String r5 = r15.mo86045b(r6, r5, r11)
            r15.f155854e0 = r5
            int r5 = r4.topicActivityType
            long r5 = (long) r5
            r15.f155856f0 = r5
            int r5 = r4.isMultiShot
            java.lang.String r6 = "IsMultiShot"
            r8 = 0
            org.json.JSONObject r5 = r0.mo83259e(r8, r6, r5)
            int r6 = r4.multiShotChangeCnt
            java.lang.String r8 = "MultiShotChangeCnt"
            org.json.JSONObject r5 = r0.mo83259e(r5, r8, r6)
            int r6 = r4.multiShotClickCnt
            java.lang.String r8 = "MultiShotClickCnt"
            org.json.JSONObject r5 = r0.mo83259e(r5, r8, r6)
            int r6 = r4.multiShotSuccessCnt
            java.lang.String r8 = "MultiShotSuccessCnt"
            org.json.JSONObject r5 = r0.mo83259e(r5, r8, r6)
            int r6 = r4.multiShotVideoCnt
            java.lang.String r8 = "MultiShotVideoCnt"
            org.json.JSONObject r0 = r0.mo83259e(r5, r8, r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "recordInfo.toString()"
            gy3.C87412m.m108593f(r0, r5)
            r5 = 0
            java.lang.String r0 = z04.C112551y.m153814n(r0, r13, r12, r5)
            java.lang.String r5 = "RecordInfo"
            java.lang.String r0 = r15.mo86045b(r5, r0, r11)
            r15.f155832K = r0
            int r0 = r4.videoSubType
            long r5 = (long) r0
            r15.f155833L = r5
            java.lang.String r0 = r4.postId
            java.lang.String r5 = "PostId"
            java.lang.String r0 = r15.mo86045b(r5, r0, r11)
            r15.f155834M = r0
            java.lang.String r0 = r4.editId
            java.lang.String r5 = "EditId"
            java.lang.String r0 = r15.mo86045b(r5, r0, r11)
            r15.f155835N = r0
            java.lang.String r0 = r4.originColorSpace
            java.lang.String r5 = "ColorSpace"
            java.lang.String r0 = r15.mo86045b(r5, r0, r11)
            r15.f155866k0 = r0
            java.lang.String r0 = r4.clickId
            java.lang.String r5 = "ClickId"
            java.lang.String r0 = r15.mo86045b(r5, r0, r11)
            r15.f155840S = r0
            te3.db1 r0 = r33.getLocation()
            if (r0 == 0) goto L_0x0231
            er1.w3 r5 = er1.C58784w3.f168295a
            java.lang.String r6 = r0.f182663f
            java.lang.String r0 = r0.f182664g
            java.lang.String r0 = r5.mo83946l0(r6, r0)
            java.lang.String r5 = "LbsInfo"
            java.lang.String r0 = r15.mo86045b(r5, r0, r11)
            r15.f155836O = r0
        L_0x0231:
            int r0 = r4.remuxType
            long r5 = (long) r0
            r15.f155837P = r5
            int r0 = r4.musicType
            long r5 = (long) r0
            r15.f155845X = r5
            java.lang.String r0 = r4.followSoundTrackId
            java.lang.String r5 = "FollowSoundTrackId"
            java.lang.String r0 = r15.mo86045b(r5, r0, r11)
            r15.f155847Z = r0
            int r0 = r4.soundTrackType
            long r5 = (long) r0
            r15.f155846Y = r5
            java.lang.String r0 = r4.musicFeedId
            java.lang.String r5 = "MusicFeedid"
            java.lang.String r0 = r15.mo86045b(r5, r0, r11)
            r15.f155862i0 = r0
            boolean r0 = r33.isLongVideo()
            if (r0 == 0) goto L_0x0292
            long r5 = r33.getId()
            java.lang.String r0 = o40.C61926c.m72691p(r5)
            java.lang.String r5 = "LongVideoId"
            java.lang.String r0 = r15.mo86045b(r5, r0, r11)
            r15.f155841T = r0
            java.util.LinkedList r0 = r33.getMediaList()
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            te3.rq2 r0 = (te3.C64689rq2) r0
            if (r0 == 0) goto L_0x0279
            int r0 = r0.f185269g
            goto L_0x027a
        L_0x0279:
            r0 = 0
        L_0x027a:
            long r5 = (long) r0
            r15.f155842U = r5
            java.util.LinkedList r0 = r33.getMediaList()
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            te3.rq2 r0 = (te3.C64689rq2) r0
            if (r0 == 0) goto L_0x028c
            int r0 = r0.f185273n
            goto L_0x028d
        L_0x028c:
            r0 = 0
        L_0x028d:
            long r5 = (long) r0
            r15.f155843V = r5
            r15.f155844W = r5
        L_0x0292:
            if (r2 == 0) goto L_0x0317
            te3.tq2 r0 = r1.field_postinfo
            if (r0 == 0) goto L_0x0317
            java.lang.String r5 = r0.f185659u
            java.lang.String r6 = "ActiveId_utf_kv"
            java.lang.String r0 = r15.f155864j0     // Catch:{ JSONException -> 0x0308 }
            if (r0 == 0) goto L_0x02a9
            int r0 = r0.length()     // Catch:{ JSONException -> 0x0308 }
            if (r0 != 0) goto L_0x02a7
            goto L_0x02a9
        L_0x02a7:
            r0 = 0
            goto L_0x02aa
        L_0x02a9:
            r0 = 1
        L_0x02aa:
            if (r0 == 0) goto L_0x02b3
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0308 }
            r0.<init>()     // Catch:{ JSONException -> 0x0308 }
        L_0x02b1:
            r8 = r0
            goto L_0x02c6
        L_0x02b3:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0308 }
            java.lang.String r8 = r15.f155864j0     // Catch:{ JSONException -> 0x0308 }
            java.lang.String r9 = "struct.active_info"
            gy3.C87412m.m108593f(r8, r9)     // Catch:{ JSONException -> 0x0308 }
            r9 = 0
            java.lang.String r8 = z04.C112551y.m153814n(r8, r12, r13, r9)     // Catch:{ JSONException -> 0x0308 }
            r0.<init>(r8)     // Catch:{ JSONException -> 0x0308 }
            goto L_0x02b1
        L_0x02c6:
            boolean r0 = r8.has(r6)     // Catch:{ Exception -> 0x02d6 }
            if (r0 != r11) goto L_0x02ce
            r0 = 1
            goto L_0x02cf
        L_0x02ce:
            r0 = 0
        L_0x02cf:
            if (r0 == 0) goto L_0x02e2
            org.json.JSONObject r0 = r8.getJSONObject(r6)     // Catch:{ Exception -> 0x02d6 }
            goto L_0x02e3
        L_0x02d6:
            r0 = move-exception
            java.lang.String r9 = "safeGetInt"
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ JSONException -> 0x0308 }
            r19 = 0
            r1[r19] = r0     // Catch:{ JSONException -> 0x0308 }
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r9, r7, r1)     // Catch:{ JSONException -> 0x0308 }
        L_0x02e2:
            r0 = 0
        L_0x02e3:
            if (r0 != 0) goto L_0x02ed
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0308 }
            r0.<init>()     // Catch:{ JSONException -> 0x0308 }
            r8.put(r6, r0)     // Catch:{ JSONException -> 0x0308 }
        L_0x02ed:
            java.lang.String r1 = "vst_id"
            r0.put(r1, r5)     // Catch:{ JSONException -> 0x0308 }
            java.lang.String r0 = r8.toString()     // Catch:{ JSONException -> 0x0308 }
            java.lang.String r1 = "activeInfo.toString()"
            gy3.C87412m.m108593f(r0, r1)     // Catch:{ JSONException -> 0x0308 }
            r1 = 0
            java.lang.String r0 = z04.C112551y.m153814n(r0, r13, r12, r1)     // Catch:{ JSONException -> 0x0308 }
            java.lang.String r0 = r15.mo86045b(r14, r0, r11)     // Catch:{ JSONException -> 0x0308 }
            r15.f155864j0 = r0     // Catch:{ JSONException -> 0x0308 }
            goto L_0x0317
        L_0x0308:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.String r0 = r0.getMessage()
            r5 = 0
            r1[r5] = r0
            java.lang.String r0 = "JSONException %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r0, r1)
        L_0x0317:
            java.lang.String r0 = r4.tempateInfo
            if (r0 == 0) goto L_0x0324
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0322
            goto L_0x0324
        L_0x0322:
            r0 = 0
            goto L_0x0325
        L_0x0324:
            r0 = 1
        L_0x0325:
            if (r0 != 0) goto L_0x0331
            java.lang.String r0 = r4.tempateInfo
            java.lang.String r1 = "TemplateInfo"
            java.lang.String r0 = r15.mo86045b(r1, r0, r11)
            r15.f155848a0 = r0
        L_0x0331:
            dp1.t0 r0 = f167336a
            r0.mo83256b(r15)
            r15.mo86054n()
            di3.d r0 = di3.C86312j.m106911c(r3)
            dp1.y0 r0 = (dp1.C58417y0) r0
            r0.Ec0(r15)
            goto L_0x0345
        L_0x0343:
            r20 = r6
        L_0x0345:
            java.lang.Class<lr.b> r0 = p599lr.C61381b.class
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "report19086 localId:"
            r1.append(r4)
            long r4 = r33.getLocalId()
            r1.append(r4)
            java.lang.String r4 = ", "
            r1.append(r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            r1 = r33
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r4 = r1.field_reportObject
            if (r4 != 0) goto L_0x0380
            java.lang.String r0 = "report19086, feedReportObj is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            kj2.d r1 = kj2.C117407d.INSTANCE
            r2 = 1253(0x4e5, double:6.19E-321)
            r4 = 38
            r6 = 1
            r8 = 0
            r1.idkeyStat(r2, r4, r6, r8)
            goto L_0x0808
        L_0x0380:
            up1.f r5 = up1.C37521f.f99374d
            r5.getClass()
            pe1.c<java.lang.Integer> r5 = up1.C37521f.f99562y
            java.lang.Object r5 = r5.mo60266n()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 == 0) goto L_0x0395
            goto L_0x0808
        L_0x0395:
            r5 = 4
            r6 = 2
            if (r2 != 0) goto L_0x040c
            int r8 = r4.postStage
            if (r8 == r11) goto L_0x03f9
            if (r8 == r6) goto L_0x03e5
            r9 = 3
            if (r8 == r9) goto L_0x03d1
            if (r8 == r5) goto L_0x03bd
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = "postStage range error, "
            r0.append(r8)
            int r8 = r4.postStage
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x040c
        L_0x03bd:
            di3.d r0 = di3.C86312j.m106911c(r0)
            lr.b r0 = (p599lr.C61381b) r0
            qo1.j r0 = r0.mo78555oT()
            boolean r8 = r33.isLongVideo()
            r0.mo12430e(r8)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x040c
        L_0x03d1:
            di3.d r0 = di3.C86312j.m106911c(r0)
            lr.b r0 = (p599lr.C61381b) r0
            qo1.j r0 = r0.mo78555oT()
            boolean r8 = r33.isLongVideo()
            r0.mo12428c(r8)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x040c
        L_0x03e5:
            di3.d r0 = di3.C86312j.m106911c(r0)
            lr.b r0 = (p599lr.C61381b) r0
            qo1.j r0 = r0.mo78555oT()
            boolean r8 = r33.isLongVideo()
            r0.mo12429d(r8)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x040c
        L_0x03f9:
            di3.d r0 = di3.C86312j.m106911c(r0)
            lr.b r0 = (p599lr.C61381b) r0
            qo1.j r0 = r0.mo78555oT()
            boolean r8 = r33.isLongVideo()
            r0.mo12432g(r8)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x040c:
            boolean r8 = r33.isMvFeed()
            boolean r9 = r33.isLongVideo()
            int r14 = r4.uploadCost
            int r15 = r4.mediaProcessCost
            int r6 = r4.postTaskCost
            int r5 = r4.clickRepostCount
            r23 = r12
            long r11 = r4.uploadMediaTotalSize
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r24 = r8
            r22 = 1
            int r8 = com.tencent.mars.cdn.CdnLogic.getRecentAverageSpeed(r22)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r25 = r0
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMediaReportObject> r0 = r4.mediaList
            r1.addAll(r0)
            if (r2 != 0) goto L_0x0477
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMediaReportObject> r0 = r4.mediaList
            r1.addAll(r0)
            java.util.LinkedList r0 = r33.getMediaList()
            java.util.Iterator r0 = r0.iterator()
            r26 = 0
        L_0x044a:
            boolean r27 = r0.hasNext()
            if (r27 == 0) goto L_0x0472
            java.lang.Object r27 = r0.next()
            r28 = r0
            r0 = r27
            te3.rq2 r0 = (te3.C64689rq2) r0
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r0 = r0.f185262W0
            r29 = r11
            if (r0 == 0) goto L_0x046d
            int r11 = r0.cdnUploadRetCode
            if (r11 == 0) goto L_0x046b
            r1.add(r0)
            int r0 = r0.cdnUploadRetCode
            r26 = r0
        L_0x046b:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x046d:
            r0 = r28
            r11 = r29
            goto L_0x044a
        L_0x0472:
            r29 = r11
            r11 = r26
            goto L_0x047a
        L_0x0477:
            r29 = r11
            r11 = 0
        L_0x047a:
            java.util.Iterator r0 = r1.iterator()
            r12 = r25
            r25 = r5
            r5 = 0
        L_0x0483:
            boolean r26 = r0.hasNext()
            if (r26 == 0) goto L_0x04a6
            java.lang.Object r12 = r0.next()
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r12 = (com.tencent.p014mm.protocal.protobuf.FinderMediaReportObject) r12
            r26 = r0
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            o40.C61937h.m72704c(r12, r0)
            if (r5 != 0) goto L_0x04a2
            int r5 = r12.zipTime
            if (r5 <= 0) goto L_0x04a1
            r5 = 1
            goto L_0x04a2
        L_0x04a1:
            r5 = 0
        L_0x04a2:
            r12 = r0
            r0 = r26
            goto L_0x0483
        L_0x04a6:
            zc1.b r0 = zc1.C66785b.f191882e     // Catch:{ all -> 0x0524 }
            r26 = r6
            r18 = r8
            r27 = r11
            r6 = 0
            r8 = 0
            r11 = 1
            bd1.b r0 = zc1.C66783a.C66784a.m78800c(r0, r8, r11, r6)     // Catch:{ all -> 0x0522 }
            if (r0 == 0) goto L_0x04ba
            java.lang.String r8 = r0.field_nickname     // Catch:{ all -> 0x0522 }
            goto L_0x04bb
        L_0x04ba:
            r8 = r6
        L_0x04bb:
            if (r8 != 0) goto L_0x04be
            r8 = r7
        L_0x04be:
            java.lang.String r0 = "snn"
            r12.put(r0, r8)     // Catch:{ all -> 0x0522 }
            java.util.LinkedList r0 = r33.getMediaList()     // Catch:{ all -> 0x0522 }
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)     // Catch:{ all -> 0x0522 }
            te3.rq2 r0 = (te3.C64689rq2) r0     // Catch:{ all -> 0x0522 }
            if (r0 == 0) goto L_0x0533
            te3.xb1 r0 = r0.f185236C     // Catch:{ all -> 0x0522 }
            if (r0 == 0) goto L_0x0533
            java.lang.String r8 = "codecInfo"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0522 }
            r11.<init>()     // Catch:{ all -> 0x0522 }
            java.lang.String r6 = "video_score:"
            r11.append(r6)     // Catch:{ all -> 0x0522 }
            float r6 = r0.f186282d     // Catch:{ all -> 0x0522 }
            r11.append(r6)     // Catch:{ all -> 0x0522 }
            java.lang.String r6 = ",video_cover_score:"
            r11.append(r6)     // Catch:{ all -> 0x0522 }
            float r6 = r0.f186283e     // Catch:{ all -> 0x0522 }
            r11.append(r6)     // Catch:{ all -> 0x0522 }
            java.lang.String r6 = ",video_audio_score:"
            r11.append(r6)     // Catch:{ all -> 0x0522 }
            float r6 = r0.f186284f     // Catch:{ all -> 0x0522 }
            r11.append(r6)     // Catch:{ all -> 0x0522 }
            java.lang.String r6 = ",thumb_score:"
            r11.append(r6)     // Catch:{ all -> 0x0522 }
            float r6 = r0.f186285g     // Catch:{ all -> 0x0522 }
            r11.append(r6)     // Catch:{ all -> 0x0522 }
            java.lang.String r6 = ",hdimg_score:"
            r11.append(r6)     // Catch:{ all -> 0x0522 }
            float r6 = r0.f186286h     // Catch:{ all -> 0x0522 }
            r11.append(r6)     // Catch:{ all -> 0x0522 }
            java.lang.String r6 = ",has_stickers:"
            r11.append(r6)     // Catch:{ all -> 0x0522 }
            boolean r0 = r0.f186287i     // Catch:{ all -> 0x0522 }
            r11.append(r0)     // Catch:{ all -> 0x0522 }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x0522 }
            r12.put(r8, r0)     // Catch:{ all -> 0x0522 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0522 }
            goto L_0x0533
        L_0x0522:
            r0 = move-exception
            goto L_0x052b
        L_0x0524:
            r0 = move-exception
            r26 = r6
            r18 = r8
            r27 = r11
        L_0x052b:
            r6 = 0
            java.lang.Object[] r8 = new java.lang.Object[r6]
            java.lang.String r6 = "mediaInfoJson put snn"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r6, r8)
        L_0x0533:
            java.util.LinkedList r0 = r33.getMediaList()
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            te3.rq2 r0 = (te3.C64689rq2) r0
            if (r0 == 0) goto L_0x0563
            java.lang.String r6 = r0.f185278r
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x055f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = r0.f185266d
            r6.append(r8)
            java.lang.String r0 = r0.f185286y
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            goto L_0x0561
        L_0x055f:
            java.lang.String r0 = r0.f185278r
        L_0x0561:
            if (r0 != 0) goto L_0x0564
        L_0x0563:
            r0 = r7
        L_0x0564:
            if (r9 == 0) goto L_0x0599
            java.util.LinkedList r6 = r33.getMediaList()
            if (r6 == 0) goto L_0x0597
            java.lang.Object r6 = sx3.C110818d0.m150916N(r6)
            te3.rq2 r6 = (te3.C64689rq2) r6
            if (r6 == 0) goto L_0x0597
            java.lang.String r8 = r6.f185278r
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 == 0) goto L_0x0594
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = r6.f185266d
            r8.append(r11)
            java.lang.String r6 = r6.f185286y
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            goto L_0x059a
        L_0x0594:
            java.lang.String r6 = r6.f185278r
            goto L_0x059a
        L_0x0597:
            r6 = 0
            goto L_0x059a
        L_0x0599:
            r6 = r7
        L_0x059a:
            java.lang.String r8 = r12.toString()
            java.lang.String r11 = "mediaInfoJson.toString()"
            gy3.C87412m.m108593f(r8, r11)
            r11 = r23
            r12 = 0
            java.lang.String r8 = z04.C112551y.m153814n(r8, r13, r11, r12)
            java.lang.Object r12 = sx3.C110818d0.m150916N(r1)
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r12 = (com.tencent.p014mm.protocal.protobuf.FinderMediaReportObject) r12
            if (r12 == 0) goto L_0x05cd
            int r12 = r12.mediaType
            r23 = r10
            r10 = 4
            if (r12 != r10) goto L_0x05cf
            dp1.t0 r10 = f167336a
            java.lang.Object r1 = sx3.C110818d0.m150914L(r1)
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r1 = (com.tencent.p014mm.protocal.protobuf.FinderMediaReportObject) r1
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMediaReportInfo> r1 = r1.multiMediaInfo
            java.lang.String r12 = "mediaReportList.first().multiMediaInfo"
            gy3.C87412m.m108593f(r1, r12)
            java.lang.String r1 = r10.mo83255a(r1)
            goto L_0x05d0
        L_0x05cd:
            r23 = r10
        L_0x05cf:
            r1 = r7
        L_0x05d0:
            r10 = 0
            java.lang.String r1 = z04.C112551y.m153814n(r1, r13, r11, r10)
            int r11 = r4.dumpCgiErrorCode
            int r12 = r4.dumpCgiErrorType
            int r10 = r4.sdkShareType
            r21 = r10
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r33.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r10 = r10.objectDesc
            if (r10 == 0) goto L_0x05f7
            te3.ef1 r10 = r10.event
            if (r10 == 0) goto L_0x05f7
            r28 = r11
            long r10 = r10.f132898d
            r16 = 0
            int r31 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r31 != 0) goto L_0x05f9
            r10 = 1
            r19 = 1
            goto L_0x05fc
        L_0x05f7:
            r28 = r11
        L_0x05f9:
            r10 = 1
            r19 = 0
        L_0x05fc:
            r11 = r19 ^ 1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r16 = r11
            int r11 = r4.enterScene
            r10.append(r11)
            r10.append(r13)
            java.lang.String r11 = r4.sessionId
            r10.append(r11)
            r10.append(r13)
            if (r2 == 0) goto L_0x062a
            di3.d r11 = di3.C86312j.m106911c(r3)
            dp1.y0 r11 = (dp1.C58417y0) r11
            r17 = r0
            r19 = r1
            long r0 = r33.getId()
            java.lang.String r0 = r11.xx0(r0)
            goto L_0x0630
        L_0x062a:
            r17 = r0
            r19 = r1
            r0 = r20
        L_0x0630:
            r10.append(r0)
            r10.append(r13)
            int r0 = r4.videoSource
            r10.append(r0)
            r10.append(r13)
            long r0 = eb0.C31543z5.m39453c()
            r31 = r12
            long r11 = r4.sendOrExitButtonTime
            long r0 = r0 - r11
            r10.append(r0)
            r10.append(r13)
            r10.append(r5)
            r10.append(r13)
            r10.append(r14)
            r10.append(r13)
            r10.append(r7)
            r10.append(r13)
            r10.append(r2)
            r10.append(r13)
            r10.append(r15)
            r10.append(r13)
            r0 = 15
            r10.append(r0)
            r10.append(r13)
            r1 = r27
            r10.append(r1)
            r10.append(r13)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetTypeString(r0)
            r10.append(r0)
            r10.append(r13)
            int r0 = r4.retryCount
            r10.append(r0)
            r10.append(r13)
            r1 = r18
            r10.append(r1)
            r10.append(r13)
            r10.append(r8)
            r10.append(r13)
            int r0 = r4.videoPostType
            r10.append(r0)
            r10.append(r13)
            int r0 = r4.uploadLogicError
            r10.append(r0)
            r10.append(r13)
            int r0 = r4.postStage
            r10.append(r0)
            r10.append(r13)
            r0 = r19
            r10.append(r0)
            r10.append(r13)
            if (r2 == 0) goto L_0x06d0
            di3.d r0 = di3.C86312j.m106911c(r3)
            dp1.y0 r0 = (dp1.C58417y0) r0
            long r1 = r33.getId()
            java.lang.String r0 = r0.xx0(r1)
            goto L_0x06d2
        L_0x06d0:
            r0 = r20
        L_0x06d2:
            r10.append(r0)
            r10.append(r13)
            int r0 = r4.cgiErrorCode
            r10.append(r0)
            r10.append(r13)
            int r0 = r4.cgiErrorType
            r10.append(r0)
            r10.append(r13)
            r0 = r17
            r10.append(r0)
            r10.append(r13)
            if (r9 == 0) goto L_0x06f4
            r11 = 1
            goto L_0x06f5
        L_0x06f4:
            r11 = 2
        L_0x06f5:
            r10.append(r11)
            r10.append(r13)
            r10.append(r6)
            r10.append(r13)
            int r0 = r4.megaCgiErrorCode
            r10.append(r0)
            r10.append(r13)
            int r0 = r4.megaCgiErrorType
            r10.append(r0)
            r10.append(r13)
            int r0 = r4.longVideoSizeInvalid
            r10.append(r0)
            r10.append(r13)
            r1 = r26
            r10.append(r1)
            r10.append(r13)
            r2 = r25
            r10.append(r2)
            r10.append(r13)
            r2 = r29
            r10.append(r2)
            r10.append(r13)
            r0 = r28
            r10.append(r0)
            r10.append(r13)
            r2 = r31
            r10.append(r2)
            r10.append(r13)
            r3 = r21
            r10.append(r3)
            r10.append(r13)
            r5 = r16
            r10.append(r5)
            r10.append(r13)
            r6 = r24
            r10.append(r6)
            r10.append(r13)
            int r6 = r4.fromDraft
            r10.append(r6)
            r10.append(r13)
            int r6 = r4.mpError
            r10.append(r6)
            r10.append(r13)
            int r6 = r4.waitingPostCount
            r10.append(r6)
            r10.append(r13)
            java.lang.String r6 = r4.editId
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            java.lang.String r7 = "sb.toString()"
            gy3.C87412m.m108593f(r6, r7)
            kj2.d r7 = kj2.C117407d.INSTANCE
            r8 = 19086(0x4a8e, float:2.6745E-41)
            r7.kvStat(r8, r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "19086 "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r7 = r23
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "19086, taskCostTime:"
            r6.append(r8)
            r6.append(r1)
            java.lang.String r1 = ", cdnUploadTime:"
            r6.append(r1)
            r6.append(r14)
            java.lang.String r1 = ", remuxTime:"
            r6.append(r1)
            r6.append(r15)
            java.lang.String r1 = ", fromDraft:"
            r6.append(r1)
            int r1 = r4.fromDraft
            r6.append(r1)
            java.lang.String r1 = ", cgiErrorType:"
            r6.append(r1)
            int r1 = r4.cgiErrorType
            r6.append(r1)
            java.lang.String r1 = ", cgiErrorCode:"
            r6.append(r1)
            int r1 = r4.cgiErrorCode
            r6.append(r1)
            java.lang.String r1 = ", waitingPostCount: "
            r6.append(r1)
            int r1 = r4.waitingPostCount
            r6.append(r1)
            java.lang.String r1 = ", sdkShareType:"
            r6.append(r1)
            r6.append(r3)
            java.lang.String r1 = ", isActivityEvent:"
            r6.append(r1)
            r6.append(r5)
            java.lang.String r1 = ", dumpCgiErrorType:"
            r6.append(r1)
            r6.append(r2)
            java.lang.String r1 = ", dumpCgiErrorCode:"
            r6.append(r1)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
        L_0x0808:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dp1.C58408t0.mo83262h(com.tencent.mm.plugin.finder.storage.FinderItem, boolean):void");
    }

    /* renamed from: i */
    public final void mo83263i(Context context, int i) {
        C87412m.m108594g(context, "context");
        C49712hj1 hj12 = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        Intent intent = activity != null ? activity.getIntent() : null;
        long longExtra = intent != null ? intent.getLongExtra("key_ref_feed_id", 0) : 0;
        int intExtra = intent != null ? intent.getIntExtra("key_ref_comment_scene", 0) : 0;
        if (longExtra == 0 && intExtra == 0) {
            Log.m105924i("Finder.FinderPostReportLogic", "feedId=0, commentScene=0");
            return;
        }
        FinderItem e = C65834e.f189316a.mo89871e(longExtra);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("feedId", longExtra);
        } catch (JSONException e2) {
            Log.m105920e("Finder.FinderPostReportLogic", e2.getMessage());
        }
        C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
        if (f != null) {
            hj12 = f.mo12861q3();
        }
        C7450q qVar = C7450q.f25643a;
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "json.toString()");
        qVar.mo8596d(hj12, e, i, jSONObject2, intExtra);
    }

    /* renamed from: j */
    public final void mo83264j(String str) {
        C87412m.m108594g(str, "clickId");
        FinderFeedReportObject finderFeedReportObject = f167337b;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.clickId = str;
        }
    }

    /* renamed from: k */
    public final void mo83265k(String str, String str2) {
        C87412m.m108594g(str, "postId");
        FinderFeedReportObject finderFeedReportObject = f167337b;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.postId = str;
            if (str2 != null) {
                finderFeedReportObject.editId = str2;
            }
        }
    }

    /* renamed from: l */
    public final void mo83266l(int i, boolean z) {
        String str;
        Log.m105924i("Finder.FinderPostReportLogic", "[startPost] entrance:" + i + " draft:" + z);
        FinderFeedReportObject finderFeedReportObject = new FinderFeedReportObject();
        f167337b = finderFeedReportObject;
        finderFeedReportObject.flowId = C31543z5.m39453c() + '_' + C66785b.f191882e.mo90662O5();
        if (z) {
            FinderFeedReportObject finderFeedReportObject2 = f167337b;
            if (finderFeedReportObject2 != null) {
                C61926c.m72661F("Finder.FinderPostReportLogic", new C58410b(z, finderFeedReportObject2, i));
                return;
            }
            return;
        }
        FinderFeedReportObject finderFeedReportObject3 = f167337b;
        if (finderFeedReportObject3 != null) {
            finderFeedReportObject3.sessionId = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            finderFeedReportObject3.enterScene = i;
            finderFeedReportObject3.draft = z ? 1 : 0;
        }
        C59266a aVar = C59266a.f169452a;
        FinderFeedReportObject finderFeedReportObject4 = f167337b;
        if (finderFeedReportObject4 == null || (str = finderFeedReportObject4.flowId) == null) {
            str = "";
        }
        C59268c cVar = C59267b.f169453a;
        aVar.mo84410b(str, C59267b.f169453a);
    }
}
