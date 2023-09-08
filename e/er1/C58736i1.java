package er1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C55018j0;
import co1.C55041a;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FeedDeleteEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import com.tencent.thumbplayer.tplayer.plugins.ITPEventID;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import dp1.C7435f2;
import ej0.C86524b;
import ej0.C86525c;
import er1.C58780v1;
import f40.C86709a0;
import fe1.C58969q;
import gy3.C87412m;
import ht1.C60172g4;
import ht1.C60206u1;
import ht1.C8808v4;
import java.util.List;
import java.util.Map;
import jq3.C60905o;
import ke3.C88144b;
import l31.C61212e;
import nj3.C76874e0;
import nj3.C76912y0;
import o40.C61926c;
import org.json.JSONObject;
import p749xh.C66261f3;
import pl1.C62367r0;
import q31.C118148a;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C90363p0;
import sx3.C90364q0;
import te3.C49150di1;
import te3.C49712hj1;
import te3.C50124kf1;
import te3.C50259lg1;
import te3.C51286sr0;
import te3.C64689rq2;
import tf0.C64916p1;
import up1.C37521f;
import z04.C112551y;

/* renamed from: er1.i1 */
public final class C58736i1 {

    /* renamed from: a */
    public static final C58736i1 f168173a = new C58736i1();

    /* renamed from: er1.i1$a */
    public static final class C58737a extends C58780v1.C58781a {

        /* renamed from: b */
        public final /* synthetic */ String f168174b;

        public C58737a(String str) {
            this.f168174b = str;
        }

        /* renamed from: d */
        public boolean mo83376d(long j, int i) {
            C58780v1.f168288a.mo83841c(this.f168289a, j, i, this.f168174b);
            return false;
        }
    }

    /* renamed from: er1.i1$b */
    public static final class C58738b implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ C49712hj1 f168175a;

        public C58738b(C49712hj1 hj12) {
            this.f168175a = hj12;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            C13604l[] lVarArr = new C13604l[4];
            C49712hj1 hj12 = this.f168175a;
            Integer num = null;
            lVarArr[0] = new C13604l("behaviour_session_id", hj12 != null ? hj12.f134670d : null);
            lVarArr[1] = new C13604l("finder_context_id", hj12 != null ? hj12.f134671e : null);
            lVarArr[2] = new C13604l("finder_tab_context_id", hj12 != null ? hj12.f134672f : null);
            if (hj12 != null) {
                num = Integer.valueOf(hj12.f134675i);
            }
            lVarArr[3] = new C13604l("comment_scene", num);
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: a */
    public final void mo83655a(Context context, C76874e0 e0Var, BaseFinderFeed baseFinderFeed) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(e0Var, "menu");
        C87412m.m108594g(baseFinderFeed, "feed");
        C37521f.f99374d.getClass();
        if (C37521f.f99432j4.mo60266n().intValue() == 1 && !C58739j4.f168176a.mo83686O(baseFinderFeed)) {
            boolean Cw0 = ((C60206u1) C86312j.m106911c(C60206u1.class)).Cw0();
            if (Cw0) {
                e0Var.mo107144g(ITPEventID.RICH_MEDIA_SYNCHRONIZER_RESET, context.getString(C0966R.string.mt8), C0966R.raw.icons_finder_disable_auto_scroll);
            } else {
                e0Var.mo107144g(ITPEventID.RICH_MEDIA_SYNCHRONIZER_DESELECT_DONE, context.getString(C0966R.string.mt9), C0966R.raw.icons_finder_enable_auto_scroll);
            }
            C7435f2 f2Var = C7435f2.f25626a;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
            C49712hj1 q3 = f != null ? f.mo12861q3() : null;
            String str = Cw0 ? "close_auto_slide" : "open_auto_slide";
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("feedid", C61926c.m72691p(baseFinderFeed.getItemId()));
            C13598b0 b0Var = C13598b0.f38549a;
            f2Var.mo8577a(q3, str, 0, jSONObject);
        }
    }

    /* renamed from: b */
    public final void mo83656b(Context context, BaseFinderFeed baseFinderFeed, C76874e0 e0Var) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(e0Var, "menu");
        if (baseFinderFeed.mo3513o().isCommentClose() || !C58784w3.f168295a.mo83889N0()) {
            e0Var.mo107144g(107, context.getString(C0966R.string.d9v), C0966R.raw.icons_outlined_comment);
        } else {
            e0Var.mo107144g(106, context.getString(C0966R.string.d8r), C0966R.raw.icons_outlined_comment_close);
        }
    }

    /* renamed from: c */
    public final void mo83657c(Context context, BaseFinderFeed baseFinderFeed, C76874e0 e0Var) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(e0Var, "menu");
        C50124kf1 kf12 = baseFinderFeed.mo3513o().getFeedObject().object_extend;
        String str = kf12 != null ? kf12.f136750i : null;
        if (!(str == null || str.length() == 0)) {
            e0Var.mo107144g(207, context.getString(C0966R.string.mst), C0966R.raw.finder_icons_outlined_copy_id);
        }
    }

    /* renamed from: d */
    public final void mo83658d(Context context, BaseFinderFeed baseFinderFeed, C76874e0 e0Var) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(e0Var, "menu");
        String str = baseFinderFeed.mo3513o().getFeedObject().internal_feedback_url;
        if (!(str == null || str.length() == 0)) {
            e0Var.mo107144g(201, context.getString(C0966R.string.d6c), C0966R.raw.icons_outlined_finder_internal_feedback);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0026, code lost:
        r0 = r0.f136756r;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo83659e(android.content.Context r7, com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r8, nj3.C76874e0 r9) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "feed"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "menu"
            gy3.C87412m.m108594g(r9, r0)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r8.mo3513o()
            int r0 = r0.getMediaType()
            r1 = 4
            if (r0 != r1) goto L_0x0052
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r8.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            te3.kf1 r0 = r0.object_extend
            if (r0 == 0) goto L_0x002d
            te3.ui0 r0 = r0.f136756r
            if (r0 == 0) goto L_0x002d
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r0.f142864d
            goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            if (r0 == 0) goto L_0x0052
            fe1.q r8 = r8.mo3507l()
            r0 = 0
            if (r8 == 0) goto L_0x003b
            long r2 = r8.field_additionalFlag
            goto L_0x003c
        L_0x003b:
            r2 = r0
        L_0x003c:
            r4 = 16
            long r2 = r2 & r4
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x0052
            r8 = 209(0xd1, float:2.93E-43)
            r0 = 2131829126(0x7f112186, float:1.9291212E38)
            java.lang.String r7 = r7.getString(r0)
            r0 = 2131756357(0x7f100545, float:1.914362E38)
            r9.mo107144g(r8, r7, r0)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58736i1.mo83659e(android.content.Context, com.tencent.mm.plugin.finder.model.BaseFinderFeed, nj3.e0):void");
    }

    /* renamed from: f */
    public final void mo83660f(Context context, C76874e0 e0Var, BaseFinderFeed baseFinderFeed) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(e0Var, "menu");
        C87412m.m108594g(baseFinderFeed, "feed");
        if (baseFinderFeed instanceof C55018j0) {
            e0Var.mo107144g(ITPEventID.RICH_MEDIA_SYNCHRONIZER_RELEASE, context.getString(C0966R.string.cak), C0966R.raw.icons_outlined_multitask);
            C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
            Integer num = null;
            C49712hj1 q3 = f != null ? f.mo12861q3() : null;
            C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
            C13604l[] lVarArr = new C13604l[6];
            lVarArr[0] = new C13604l("view_id", "button_float_frame");
            lVarArr[1] = new C13604l("feed_id", C61926c.m72691p(baseFinderFeed.getItemId()));
            lVarArr[2] = new C13604l("behaviour_session_id", q3 != null ? q3.f134670d : null);
            lVarArr[3] = new C13604l("finder_context_id", q3 != null ? q3.f134671e : null);
            lVarArr[4] = new C13604l("finder_tab_context_id", q3 != null ? q3.f134672f : null);
            if (q3 != null) {
                num = Integer.valueOf(q3.f134675i);
            }
            lVarArr[5] = new C13604l("comment_scene", num);
            eVar.mo86168ix("view_exp", C90364q0.m113147f(lVarArr), 25496);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0073, code lost:
        if (r0 == false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0107, code lost:
        if (r11 == false) goto L_0x010a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo83661g(android.content.Context r9, nj3.C76874e0 r10, com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r11) {
        /*
            r8 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "menu"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.String r0 = "feed"
            gy3.C87412m.m108594g(r11, r0)
            er1.w3 r0 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r11.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            r0.getClass()
            java.lang.String r0 = "finderObject"
            gy3.C87412m.m108594g(r1, r0)
            int r1 = r1.permissionFlag
            r2 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r2
            r2 = 1
            r3 = 0
            if (r1 <= 0) goto L_0x002c
            r1 = 1
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            if (r1 != 0) goto L_0x0030
            return
        L_0x0030:
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r11.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r11 = r11.getFeedObject()
            gy3.C87412m.m108594g(r11, r0)
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r11.objectDesc
            if (r0 == 0) goto L_0x0077
            te3.jl0 r1 = r0.fromApp
            if (r1 == 0) goto L_0x0054
            java.lang.String r1 = r1.f183806d
            if (r1 == 0) goto L_0x0054
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x004f
            r1 = 1
            goto L_0x0050
        L_0x004f:
            r1 = 0
        L_0x0050:
            if (r1 != r2) goto L_0x0054
            r1 = 1
            goto L_0x0055
        L_0x0054:
            r1 = 0
        L_0x0055:
            if (r1 == 0) goto L_0x0059
            goto L_0x010a
        L_0x0059:
            te3.ve1 r0 = r0.feedBgmInfo
            if (r0 == 0) goto L_0x0072
            te3.td1 r0 = r0.f185873d
            if (r0 == 0) goto L_0x0072
            java.lang.String r0 = r0.f185534d
            if (r0 == 0) goto L_0x0072
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x006d
            r0 = 1
            goto L_0x006e
        L_0x006d:
            r0 = 0
        L_0x006e:
            if (r0 != r2) goto L_0x0072
            r0 = 1
            goto L_0x0073
        L_0x0072:
            r0 = 0
        L_0x0073:
            if (r0 == 0) goto L_0x0077
            goto L_0x010a
        L_0x0077:
            zc1.b r0 = zc1.C66785b.f191882e
            java.lang.String r1 = r0.mo90662O5()
            r4 = 2
            r5 = 0
            bd1.b r0 = zc1.C66783a.C66784a.m78798a(r0, r1, r3, r4, r5)
            if (r0 == 0) goto L_0x00ae
            te3.dr2 r0 = r0.mo75251m2()
            te3.hg1 r0 = r0.f132492I
            if (r0 == 0) goto L_0x00ae
            java.util.LinkedList<te3.lg1> r0 = r0.f134612d
            if (r0 == 0) goto L_0x00ae
            java.util.Iterator r0 = r0.iterator()
        L_0x0095:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00ac
            java.lang.Object r1 = r0.next()
            r4 = r1
            te3.lg1 r4 = (te3.C50259lg1) r4
            int r4 = r4.f137398d
            if (r4 != r2) goto L_0x00a8
            r4 = 1
            goto L_0x00a9
        L_0x00a8:
            r4 = 0
        L_0x00a9:
            if (r4 == 0) goto L_0x0095
            r5 = r1
        L_0x00ac:
            te3.lg1 r5 = (te3.C50259lg1) r5
        L_0x00ae:
            if (r5 == 0) goto L_0x00cf
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r11.objectDesc
            if (r0 == 0) goto L_0x00c3
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r0 = r0.media
            if (r0 == 0) goto L_0x00c3
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            com.tencent.mm.protocal.protobuf.FinderMedia r0 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r0
            if (r0 == 0) goto L_0x00c3
            int r0 = r0.mediaType
            goto L_0x00c4
        L_0x00c3:
            r0 = -1
        L_0x00c4:
            java.util.LinkedList<java.lang.Integer> r1 = r5.f137400f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            goto L_0x00d0
        L_0x00cf:
            r0 = 0
        L_0x00d0:
            if (r0 == 0) goto L_0x010a
            sg.i<java.lang.String, java.lang.String> r0 = vp1.C65840n.f189341a
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r11 = r11.objectDesc
            if (r11 == 0) goto L_0x00ec
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r11 = r11.media
            if (r11 == 0) goto L_0x00ec
            java.lang.Object r11 = sx3.C110818d0.m150916N(r11)
            com.tencent.mm.protocal.protobuf.FinderMedia r11 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r11
            if (r11 == 0) goto L_0x00ec
            int r11 = r11.videoDuration
            long r0 = (long) r11
            r6 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r6
            goto L_0x00ee
        L_0x00ec:
            r0 = 0
        L_0x00ee:
            if (r5 == 0) goto L_0x0106
            te3.sr0 r11 = r5.f137401g
            if (r11 != 0) goto L_0x00f5
            goto L_0x0106
        L_0x00f5:
            te3.k93 r11 = r5.f137402h
            if (r11 == 0) goto L_0x00fc
            int r11 = r11.f136627d
            goto L_0x00fd
        L_0x00fc:
            r11 = 0
        L_0x00fd:
            int r11 = r11 * 1000
            long r4 = (long) r11
            int r11 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r11 < 0) goto L_0x0106
            r11 = 1
            goto L_0x0107
        L_0x0106:
            r11 = 0
        L_0x0107:
            if (r11 == 0) goto L_0x010a
            goto L_0x010b
        L_0x010a:
            r2 = 0
        L_0x010b:
            if (r2 == 0) goto L_0x0120
            r11 = 119(0x77, float:1.67E-43)
            android.content.res.Resources r9 = r9.getResources()
            r0 = 2131829880(0x7f112478, float:1.9292742E38)
            java.lang.String r9 = r9.getString(r0)
            r0 = 2131756378(0x7f10055a, float:1.9143662E38)
            r10.mo107151k(r11, r9, r0, r3)
        L_0x0120:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58736i1.mo83661g(android.content.Context, nj3.e0, com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }

    /* renamed from: h */
    public final void mo83662h(Context context, BaseFinderFeed baseFinderFeed, C76874e0 e0Var) {
        int i;
        String str;
        C86524b bVar;
        Class cls = C56711j.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(e0Var, "menu");
        C37521f.f99374d.getClass();
        if (C37521f.f99395f3.mo60266n().intValue() != 0) {
            C58784w3 w3Var = C58784w3.f168295a;
            FinderObject feedObject = baseFinderFeed.mo3513o().getFeedObject();
            w3Var.getClass();
            C87412m.m108594g(feedObject, C66261f3.COL_FINDEROBJECT);
            if ((feedObject.permissionFlag & TPMediaCodecProfileLevel.HEVCMainTierLevel62) > 0) {
                C39818r rVar = C39818r.f106831a;
                long itemId = baseFinderFeed.getItemId();
                long j = ((C56711j) rVar.mo62443b(context).mo75002a(cls)).f162606x;
                boolean z = j != 0 && j == itemId;
                Integer num = null;
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(MMApplicationContext.getContext().getResources().getString(C0966R.string.dib));
                    sb.append(10);
                    C86525c cVar = ((C56711j) rVar.mo62443b(context).mo75002a(cls)).f162605w;
                    String str2 = (cVar == null || (bVar = cVar.f251382a) == null) ? null : bVar.f251378g;
                    if (str2 == null) {
                        str2 = "";
                    }
                    sb.append(str2);
                    str = sb.toString();
                    i = 1;
                } else {
                    str = MMApplicationContext.getContext().getResources().getString(C0966R.string.dx4);
                    C87412m.m108593f(str, "{\n            MMApplicat…on_cast_screen)\n        }");
                    i = 0;
                }
                e0Var.mo107146h(210, str, C0966R.raw.finder_icon_projection_screen_2, context.getResources().getColor(C0966R.color.f2939n));
                C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
                C49712hj1 q3 = f != null ? f.mo12861q3() : null;
                C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
                C13604l[] lVarArr = new C13604l[4];
                lVarArr[0] = new C13604l("view_id", "projection");
                lVarArr[1] = new C13604l("if_projection", Integer.valueOf(i));
                lVarArr[2] = new C13604l("feed_id", C61926c.m72691p(baseFinderFeed.getItemId()));
                if (q3 != null) {
                    num = Integer.valueOf(q3.f134675i);
                }
                lVarArr[3] = new C13604l("comment_scene", num);
                eVar.mo86168ix("view_exp", C90364q0.m113147f(lVarArr), 25496);
            }
        }
    }

    /* renamed from: i */
    public final void mo83663i(Context context, BaseFinderFeed baseFinderFeed, C76874e0 e0Var) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(e0Var, "menu");
        C55018j0 j0Var = baseFinderFeed instanceof C55018j0 ? (C55018j0) baseFinderFeed : null;
        boolean z = false;
        if (j0Var != null && j0Var.mo76076p0()) {
            z = true;
        }
        if (!z) {
            return;
        }
        if (C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_FINDER_FINDER_BULLET_SWITCH_BOOLEAN, true)) {
            e0Var.mo107144g(301, context.getString(C0966R.string.f361047md2), C0966R.raw.icons_outlined_menu_close_bullet_visitor_2);
        } else {
            e0Var.mo107144g(302, context.getString(C0966R.string.f361048md3), C0966R.raw.icons_outlined_menu_open_bullet_visitor_2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002f, code lost:
        r11 = r11.getFeedObject();
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo83664j(android.content.Context r9, nj3.C76874e0 r10, com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r11) {
        /*
            r8 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "menu"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.String r0 = "feed"
            gy3.C87412m.m108594g(r11, r0)
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99197I5
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x0052
            er1.w3 r0 = er1.C58784w3.f168295a
            r0.getClass()
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r11.mo3513o()
            if (r11 == 0) goto L_0x0038
            com.tencent.mm.protocal.protobuf.FinderObject r11 = r11.getFeedObject()
            if (r11 == 0) goto L_0x0038
            int r11 = r11.permissionFlag
            goto L_0x0039
        L_0x0038:
            r11 = 0
        L_0x0039:
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r11 = r11 & r0
            if (r11 != 0) goto L_0x0040
            r11 = 1
            goto L_0x0041
        L_0x0040:
            r11 = 0
        L_0x0041:
            if (r11 == 0) goto L_0x0052
            java.lang.Class<hy.o0> r11 = p166hy.C98567o0.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            hy.o0 r11 = (p166hy.C98567o0) r11
            boolean r11 = r11.Fi0()
            if (r11 == 0) goto L_0x0052
            r1 = 1
        L_0x0052:
            if (r1 != 0) goto L_0x0055
            return
        L_0x0055:
            r3 = 120(0x78, float:1.68E-43)
            android.content.res.Resources r9 = r9.getResources()
            r11 = 2131829890(0x7f112482, float:1.9292762E38)
            java.lang.String r4 = r9.getString(r11)
            r5 = 2131755875(0x7f100363, float:1.9142642E38)
            r6 = 0
            r7 = 0
            r2 = r10
            r2.mo107150j(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58736i1.mo83664j(android.content.Context, nj3.e0, com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }

    /* renamed from: k */
    public final void mo83665k(Context context, BaseFinderFeed baseFinderFeed, C76874e0 e0Var) {
        Class cls = C58417y0.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(e0Var, "menu");
        boolean e = ((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e();
        C49150di1 di12 = baseFinderFeed.mo3513o().getFeedObject().finder_promotion_jumpinfo;
        if (di12 != null) {
            String str = di12.f132351g;
            if (str == null || str.length() == 0) {
                str = C58784w3.f168295a.mo83897Q0(baseFinderFeed) ? context.getString(C0966R.string.mwq) : context.getString(C0966R.string.mof);
            }
            Log.m105924i("FinderMenuUtil", "promotion=" + str);
            if (e) {
                e0Var.mo107151k(202, str, C0966R.raw.icon_outlined_promote, true);
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                C58417y0.Ty0((C58417y0) c, context, false, baseFinderFeed.mo3513o().getId(), 3, (String) null, 0, 48, (Object) null);
                return;
            }
            e0Var.mo107144g(202, str, C0966R.raw.icon_outlined_promote);
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(FinderReportLogic::class.java)");
            C58417y0.Ty0((C58417y0) c2, context, false, baseFinderFeed.mo3513o().getId(), 0, (String) null, 0, 56, (Object) null);
        }
    }

    /* renamed from: l */
    public final void mo83666l(C60905o oVar, boolean z, BaseFinderFeed baseFinderFeed, int i, List<?> list) {
        C60905o oVar2 = oVar;
        int i2 = i;
        List<?> list2 = list;
        Class cls = C60206u1.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(list2, "dataList");
        Context context = oVar2.f173499A;
        int i3 = 2;
        C49712hj1 hj12 = null;
        if (z) {
            ((C60206u1) C86312j.m106911c(cls)).mo60952g8(true);
            C76912y0.makeText(context, (int) C0966R.string.mqn, 0).show();
            C87412m.m108593f(context, "context");
            long itemId = baseFinderFeed.getItemId();
            C7435f2 f2Var = C7435f2.f25626a;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
            C49712hj1 q3 = f != null ? f.mo12861q3() : null;
            JSONObject jSONObject = new JSONObject();
            if (i2 == 1) {
                i3 = 1;
            }
            jSONObject.put("from_action", i3);
            jSONObject.put("feedid", C61926c.m72691p(itemId));
            C13598b0 b0Var = C13598b0.f38549a;
            f2Var.mo8577a(q3, "open_auto_slide", 1, jSONObject);
            int j = oVar.mo17363j();
            RecyclerView.C16613e eVar = oVar2.f173500B;
            WxRecyclerAdapter wxRecyclerAdapter = eVar instanceof WxRecyclerAdapter ? (WxRecyclerAdapter) eVar : null;
            int c6 = j - (wxRecyclerAdapter != null ? wxRecyclerAdapter.mo85796c6() : 0);
            Log.m105924i("FinderMenuUtil", "enableAutoScroll: fixPosition=" + c6 + ", adapterPos=" + oVar.mo17363j() + ", dataSize=" + list.size());
            int size = list.size();
            for (int i4 = c6 + 1; i4 < size; i4++) {
                Object O = C110818d0.m150917O(list2, i4);
                BaseFinderFeed baseFinderFeed2 = O instanceof BaseFinderFeed ? (BaseFinderFeed) O : null;
                if (baseFinderFeed2 != null) {
                    if (!(baseFinderFeed2.mo3513o().isLiveFeed() && !baseFinderFeed2.mo3515p())) {
                        baseFinderFeed2 = null;
                    }
                    if (baseFinderFeed2 != null) {
                        Log.m105924i("FinderMenuUtil", "enableAutoScroll: delete, index=" + i4 + ", feedId=" + C61926c.m72691p(baseFinderFeed2.getItemId()));
                        FeedDeleteEvent feedDeleteEvent = new FeedDeleteEvent();
                        feedDeleteEvent.f9154d.f9155a = baseFinderFeed2.mo3513o().getId();
                        feedDeleteEvent.publish();
                    }
                }
            }
            return;
        }
        ((C60206u1) C86312j.m106911c(cls)).mo60952g8(false);
        C76912y0.makeText(context, (int) C0966R.string.mqm, 0).show();
        C87412m.m108593f(context, "context");
        long itemId2 = baseFinderFeed.getItemId();
        C7435f2 f2Var2 = C7435f2.f25626a;
        C13442s8 f2 = C13442s8.f38060Q0.mo12873f(context);
        if (f2 != null) {
            hj12 = f2.mo12861q3();
        }
        JSONObject jSONObject2 = new JSONObject();
        if (i2 == 1) {
            i3 = 1;
        }
        jSONObject2.put("from_action", i3);
        jSONObject2.put("feedid", C61926c.m72691p(itemId2));
        C13598b0 b0Var2 = C13598b0.f38549a;
        f2Var2.mo8577a(hj12, "close_auto_slide", 1, jSONObject2);
    }

    /* renamed from: m */
    public final void mo83667m(Context context, View view, int i, MenuItem menuItem, BaseFinderFeed baseFinderFeed) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(view, "menuView");
        C87412m.m108594g(menuItem, "menuItem");
        C87412m.m108594g(baseFinderFeed, "feed");
        int itemId = menuItem.getItemId();
        if (itemId == 119) {
            C13604l[] lVarArr = new C13604l[2];
            lVarArr[0] = new C13604l("feed_id", C61926c.m72691p(baseFinderFeed.getItemId()));
            C58969q l = baseFinderFeed.mo3507l();
            lVarArr[1] = new C13604l("finder_username", l != null ? l.getUsername() : null);
            mo83669o(context, view, "post_music_icon", C90364q0.m113147f(lVarArr));
        } else if (itemId == 120) {
            ((C61212e) C86312j.m106911c(C61212e.class)).mo86165fW(view, C61926c.m72691p(baseFinderFeed.getItemId()));
            mo83669o(context, view, "set_friend_circle_cover", C90363p0.m113143b(new C13604l("feed_id", C61926c.m72691p(baseFinderFeed.getItemId()))));
        }
    }

    /* renamed from: n */
    public final void mo83668n(Context context, BaseFinderFeed baseFinderFeed) {
        C51286sr0 sr02;
        C64689rq2 rq22;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(baseFinderFeed, "feed");
        C58780v1 v1Var = C58780v1.f168288a;
        C50259lg1 a = v1Var.mo83839a();
        if (a != null && (sr02 = a.f137401g) != null && (rq22 = (C64689rq2) C110818d0.m150916N(baseFinderFeed.mo3513o().getMediaList())) != null) {
            String str = rq22.f185266d + rq22.f185286y;
            if (str != null) {
                v1Var.mo83840b(context, sr02, "tid=" + baseFinderFeed.getItemId(), new C58737a(str));
            }
        }
    }

    /* renamed from: o */
    public final void mo83669o(Context context, View view, String str, Map<String, ? extends Object> map) {
        View findViewById = view.findViewById(C0966R.C0970id.f1j);
        if (findViewById != null) {
            findViewById.hasOnClickListeners();
        }
        C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
        eVar.o30(view, str);
        eVar.mo86175pO(view, 40, 25496);
        eVar.mo86149PM(view, map);
        C60172g4 gr02 = ((C64916p1) C86312j.m106911c(C64916p1.class)).gr0(context);
        eVar.E60(view, new C58738b(gr02 != null ? gr02.mo12861q3() : null));
    }

    /* renamed from: p */
    public final void mo83670p(MMActivity mMActivity, BaseFinderFeed baseFinderFeed, int i) {
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(baseFinderFeed, "feed");
        C50124kf1 kf12 = baseFinderFeed.mo3513o().getFeedObject().object_extend;
        if (kf12 != null) {
            Log.m105924i("FinderMenuUtil", "internal_click_copy_msg=" + kf12.f136750i);
            ClipboardHelper.setText(kf12.f136750i);
            C76912y0.m92773l(mMActivity, mMActivity.getResources().getString(C0966R.string.msu));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("feedid", C61926c.m72691p(baseFinderFeed.getItemId()));
            jSONObject.put("finder_username", baseFinderFeed.mo3513o().getUserName());
            jSONObject.put("from_action", i == 1 ? 1 : 2);
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "kvJson.toString()");
            String n = C112551y.m153814n(jSONObject2, ",", ";", false);
            C13442s8 f = C13442s8.f38060Q0.mo12873f(mMActivity);
            y0Var.Cx0(1, "copy_id", n, f != null ? f.mo12861q3() : null);
        }
    }

    /* renamed from: q */
    public final void mo83671q(MMActivity mMActivity, BaseFinderFeed baseFinderFeed) {
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(baseFinderFeed, "feed");
        Intent intent = new Intent();
        C62367r0 a = C55041a.f154526a.mo76098a(baseFinderFeed.mo3513o().getExpectId(), (C64689rq2) C110818d0.m150914L(baseFinderFeed.mo3513o().getMediaList()), false);
        String str = baseFinderFeed.mo3513o().getFeedObject().internal_feedback_url + "?&specFormat=" + a.mo87422g() + "&currentSpeed=" + CdnLogic.getRecentAverageSpeed(2) + "&maxBitRate=" + ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Hx0().f154556k;
        Log.m105924i("FinderMenuUtil", "internal_feedback_url=" + str);
        intent.putExtra("rawUrl", str);
        C88144b.m109791i(mMActivity, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* JADX WARNING: type inference failed for: r2v17, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo83672r(android.content.Context r19, com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r20, jq3.C60905o r21) {
        /*
            r18 = this;
            r0 = r19
            r1 = r21
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.j> r2 = com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j.class
            java.lang.Class<l31.e> r3 = l31.C61212e.class
            java.lang.String r4 = "context"
            gy3.C87412m.m108594g(r0, r4)
            java.lang.String r4 = "feed"
            r5 = r20
            gy3.C87412m.m108594g(r5, r4)
            java.lang.String r4 = "holder"
            gy3.C87412m.m108594g(r1, r4)
            rs1.s8$a r4 = rs1.C13442s8.f38060Q0
            rs1.s8 r4 = r4.mo12873f(r0)
            if (r4 == 0) goto L_0x0026
            te3.hj1 r4 = r4.mo12861q3()
            goto L_0x0027
        L_0x0026:
            r4 = 0
        L_0x0027:
            r7 = 2131302685(0x7f09191d, float:1.8223463E38)
            android.view.View r1 = r1.mo85812D(r7)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r1 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r1
            r7 = 0
            if (r1 == 0) goto L_0x0039
            long r9 = r1.getCurrentPosMs()
            goto L_0x003a
        L_0x0039:
            r9 = r7
        L_0x003a:
            di3.d r1 = di3.C86312j.m106911c(r3)
            l31.e r1 = (l31.C61212e) r1
            r11 = 5
            rx3.l[] r11 = new rx3.C13604l[r11]
            rx3.l r12 = new rx3.l
            java.lang.String r13 = "view_id"
            java.lang.String r14 = "projection"
            r12.<init>(r13, r14)
            r13 = 0
            r11[r13] = r12
            bl3.r r12 = bl3.C39818r.f106831a
            bl3.r$a r14 = r12.mo62443b(r0)
            androidx.lifecycle.i0 r14 = r14.mo75002a(r2)
            com.tencent.mm.plugin.finder.viewmodel.component.j r14 = (com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j) r14
            long r15 = r20.getItemId()
            long r13 = r14.f162606x
            r6 = 1
            int r17 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r17 == 0) goto L_0x006d
            int r7 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r7 != 0) goto L_0x006d
            r7 = 1
            goto L_0x006e
        L_0x006d:
            r7 = 0
        L_0x006e:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            rx3.l r8 = new rx3.l
            java.lang.String r13 = "if_projection"
            r8.<init>(r13, r7)
            r11[r6] = r8
            r7 = 2
            long r13 = r20.getItemId()
            java.lang.String r8 = o40.C61926c.m72691p(r13)
            rx3.l r13 = new rx3.l
            java.lang.String r14 = "feed_id"
            r13.<init>(r14, r8)
            r11[r7] = r13
            r7 = 3
            if (r4 == 0) goto L_0x0097
            int r4 = r4.f134675i
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0098
        L_0x0097:
            r4 = 0
        L_0x0098:
            rx3.l r8 = new rx3.l
            java.lang.String r13 = "comment_scene"
            r8.<init>(r13, r4)
            r11[r7] = r8
            r4 = 4
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            rx3.l r8 = new rx3.l
            java.lang.String r9 = "projection_front_time"
            r8.<init>(r9, r7)
            r11[r4] = r8
            java.util.Map r4 = sx3.C90364q0.m113147f(r11)
            r7 = 25496(0x6398, float:3.5728E-41)
            java.lang.String r8 = "view_clk"
            r1.mo86168ix(r8, r4, r7)
            bl3.r$a r0 = r12.mo62443b(r0)
            androidx.lifecycle.i0 r0 = r0.mo75002a(r2)
            r1 = r0
            com.tencent.mm.plugin.finder.viewmodel.component.j r1 = (com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j) r1
            long r4 = r20.getItemId()
            rx3.g r0 = r1.f162582F
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            com.tencent.mm.plugin.finder.viewmodel.component.FinderProjectionScreenUIC$videoEndListener$2$1 r0 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderProjectionScreenUIC$videoEndListener$2$1) r0
            r0.alive()
            java.lang.String r0 = r1.mo80096j3(r4)
            if (r0 == 0) goto L_0x00df
            r0 = 0
            goto L_0x00f3
        L_0x00df:
            a14.n0 r8 = r1.getMainScope()
            r9 = 0
            r10 = 0
            rs1.p8 r11 = new rs1.p8
            r0 = 0
            r11.<init>(r1, r4, r0)
            r12 = 3
            r13 = 0
            a14.z1 r2 = a14.C53895h.m60466d(r8, r9, r10, r11, r12, r13)
            r1.f162577A = r2
        L_0x00f3:
            boolean r2 = r1.f162584H
            if (r2 == 0) goto L_0x00f9
            goto L_0x01bf
        L_0x00f9:
            r1.f162584H = r6
            rx3.g r2 = r1.f162598p
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            androidx.recyclerview.widget.LinearLayoutManager r8 = new androidx.recyclerview.widget.LinearLayoutManager
            android.view.View r9 = r1.mo80095i3()
            android.content.Context r9 = r9.getContext()
            r8.<init>(r9)
            r2.setLayoutManager(r8)
            rx3.g r2 = r1.f162598p
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            com.tencent.mm.plugin.finder.viewmodel.component.j$a r8 = r1.mo80092e3()
            r2.setAdapter(r8)
            android.view.View r2 = r1.mo80095i3()
            rs1.d8 r8 = rs1.C13192d8.f37512d
            r2.setOnTouchListener(r8)
            rx3.g r2 = r1.f162593h
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.view.View r2 = (android.view.View) r2
            rs1.e8 r8 = new rs1.e8
            r8.<init>(r1)
            r2.setOnClickListener(r8)
            rx3.g r2 = r1.f162592g
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.view.View r2 = (android.view.View) r2
            rs1.f8 r8 = new rs1.f8
            r8.<init>(r1)
            r2.setOnClickListener(r8)
            rx3.g r2 = r1.f162601s
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.widget.TextView r2 = (android.widget.TextView) r2
            rs1.g8 r8 = new rs1.g8
            r8.<init>(r1)
            r2.setOnClickListener(r8)
            di3.d r2 = di3.C86312j.m106911c(r3)
            l31.e r2 = (l31.C61212e) r2
            rx3.g r8 = r1.f162601s
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.lang.String r9 = "projection_break"
            r2.o30(r8, r9)
            rx3.g r8 = r1.f162601s
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            android.widget.TextView r8 = (android.widget.TextView) r8
            r9 = 32
            r2.mo86175pO(r8, r9, r7)
            rx3.g r8 = r1.f162601s
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            android.widget.TextView r8 = (android.widget.TextView) r8
            rs1.h8 r9 = new rs1.h8
            r9.<init>(r1)
            r2.E60(r8, r9)
            di3.d r2 = di3.C86312j.m106911c(r3)
            l31.e r2 = (l31.C61212e) r2
            android.widget.TextView r3 = r1.mo80094g3()
            java.lang.String r8 = "search_again"
            r2.o30(r3, r8)
            android.widget.TextView r3 = r1.mo80094g3()
            r8 = 40
            r2.mo86175pO(r3, r8, r7)
            android.widget.TextView r3 = r1.mo80094g3()
            rs1.i8 r7 = new rs1.i8
            r7.<init>(r1)
            r2.E60(r3, r7)
        L_0x01bf:
            r1.f162607y = r4
            android.view.View r2 = r1.mo80095i3()
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r3.mo10233c(r8)
            java.lang.Object[] r9 = r3.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r11 = "showPanel"
            java.lang.String r12 = "(J)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r2
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            r7 = 0
            java.lang.Object r3 = r3.mo10231a(r7)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC"
            java.lang.String r10 = "showPanel"
            java.lang.String r11 = "(J)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            android.view.View r2 = r1.mo80095i3()
            android.view.ViewParent r2 = r2.getParent()
            if (r2 == 0) goto L_0x022b
            android.view.View r2 = r1.mo80095i3()
            android.view.ViewParent r2 = r2.getParent()
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x0222
            r0 = r2
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L_0x0222:
            if (r0 == 0) goto L_0x022b
            android.view.View r2 = r1.mo80095i3()
            r0.removeView(r2)
        L_0x022b:
            androidx.appcompat.app.AppCompatActivity r0 = r1.getActivity()
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            java.lang.String r2 = "null cannot be cast to non-null type android.view.ViewGroup"
            gy3.C87412m.m108592e(r0, r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r2 = r1.mo80095i3()
            r3 = -1
            r0.addView(r2, r3, r3)
            android.view.View r0 = r1.mo80095i3()
            r2 = 2131304713(0x7f092109, float:1.8227576E38)
            android.view.View r0 = r0.findViewById(r2)
            java.lang.String r2 = "root.findViewById<TextVi…ojection_screen_title_tv)"
            gy3.C87412m.m108593f(r0, r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            er1.C7919x.m8091a(r0)
            rx3.g r0 = r1.f162590e
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            com.tencent.mm.ui.widget.LiveBottomSheetPanel r0 = (com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel) r0
            android.app.Activity r2 = r1.getContext()
            android.graphics.Point r2 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r2)
            int r2 = r2.y
            float r2 = (float) r2
            r0.setTranslationY(r2)
            rx3.g r0 = r1.f162590e
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            com.tencent.mm.ui.widget.LiveBottomSheetPanel r0 = (com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel) r0
            r0.mo78804d()
            ej0.c r0 = r1.f162605w
            if (r0 != 0) goto L_0x02bf
            r1.f162583G = r3
            java.lang.String r2 = "FinderProjectionScreenUIC"
            java.lang.String r0 = "prepare"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            int r0 = fj0.C86898q.f252215h     // Catch:{ a -> 0x02a1 }
            fj0.q r0 = fj0.C86898q.C59104e.f169066a     // Catch:{ a -> 0x02a1 }
            r0.mo121346b()     // Catch:{ a -> 0x02a1 }
            fj0.l r0 = fj0.C86883l.C86886c.f252190a     // Catch:{ a -> 0x02a1 }
            r0.mo121337b()     // Catch:{ a -> 0x02a1 }
            ej0.a r0 = ej0.C58606a.m68054a()
            r0.mo83497b(r1)
            goto L_0x02ba
        L_0x02a1:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "RouterException: "
            r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
        L_0x02ba:
            r2 = 0
            r1.mo80099m3(r2)
            goto L_0x02c8
        L_0x02bf:
            long r2 = r1.f162606x
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x02c8
            r1.mo80101n3(r0)
        L_0x02c8:
            r1.f162580D = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58736i1.mo83672r(android.content.Context, com.tencent.mm.plugin.finder.model.BaseFinderFeed, jq3.o):void");
    }
}
