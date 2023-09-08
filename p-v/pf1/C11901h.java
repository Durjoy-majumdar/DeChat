package pf1;

import android.content.Context;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.MiniAppInfo;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import dp1.C7435f2;
import dp1.C7450q;
import er1.C58784w3;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import mf1.C10817f1;
import o40.C61926c;
import o40.C61937h;
import org.json.JSONException;
import org.json.JSONObject;
import rs1.C13442s8;
import te3.C49712hj1;
import te3.C50124kf1;
import te3.C51384te1;
import te3.uc4;

/* renamed from: pf1.h */
public final class C11901h {

    /* renamed from: a */
    public static final C11901h f34775a = new C11901h();

    /* renamed from: a */
    public static void m11610a(C11901h hVar, Context context, String str, int i, C11920q qVar, int i2, int i3, JSONObject jSONObject, int i4, Object obj) {
        String str2;
        BaseFinderFeed baseFinderFeed;
        String str3;
        String str4;
        T t;
        String str5;
        boolean z;
        FinderItem o;
        FinderObject feedObject;
        FinderItem o2;
        FinderObject feedObject2;
        C50124kf1 kf12;
        C51384te1 te12;
        boolean z2 = false;
        if ((i4 & 16) != 0) {
            i2 = 0;
        }
        if ((i4 & 32) != 0) {
            i3 = 0;
        }
        C49712hj1 hj12 = null;
        if ((i4 & 64) != 0) {
            jSONObject = null;
        }
        hVar.getClass();
        String str6 = "";
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            BaseFinderFeed baseFinderFeed2 = qVar.f34830d;
            long j = 0;
            jSONObject.put("feedid", C61926c.m72691p(baseFinderFeed2 != null ? baseFinderFeed2.getItemId() : 0));
            JSONObject h = C61937h.m72709h(qVar.f34827a);
            h.remove("ext_info");
            h.remove("style");
            str2 = h.toString();
            C87412m.m108593f(str2, "jumpInfoJson.toString()");
            try {
                jSONObject.put("jump_info", h);
                if (i3 > 0) {
                    jSONObject.put("leave_type", i3);
                }
                String str7 = qVar.f34833g;
                int i5 = 2;
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, C87412m.m108589b(FFmpegMetadataRetriever.METADATA_KEY_COMMENT, str7) ? 2 : C87412m.m108589b("TWO_FLOW", str7) ? 4 : 1);
                jSONObject.put("type", i2);
                if (qVar.f34827a.business_type == 2) {
                    BaseFinderFeed baseFinderFeed3 = qVar.f34830d;
                    if (!(baseFinderFeed3 == null || (o2 = baseFinderFeed3.mo3513o()) == null || (feedObject2 = o2.getFeedObject()) == null || (kf12 = feedObject2.object_extend) == null || (te12 = kf12.f136749h) == null)) {
                        j = te12.f142157e;
                    }
                    jSONObject.put("advertisementid", C61926c.m72691p(j));
                    BaseFinderFeed baseFinderFeed4 = qVar.f34830d;
                    jSONObject.put("is_adver_assembly", (baseFinderFeed4 == null || (o = baseFinderFeed4.mo3513o()) == null || (feedObject = o.getFeedObject()) == null) ? false : C58784w3.f168295a.mo83878J0(feedObject) ? 1 : 0);
                    LinkedList<uc4> linkedList = qVar.f34827a.style;
                    C87412m.m108593f(linkedList, "infoEx.jumpInfo.style");
                    Iterator<T> it = linkedList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (((uc4) t).f142762h == qVar.f34842p) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            break;
                        }
                    }
                    uc4 uc4 = (uc4) t;
                    if (uc4 == null || (str5 = uc4.toJSON().toString()) == null) {
                        str5 = "{}";
                    }
                    jSONObject.put("adver_style", str5);
                    C10817f1 f1Var = qVar.f34823A;
                    if (f1Var != null && f1Var.f32318b == 2) {
                        z2 = true;
                    }
                    if (!z2) {
                        i5 = 1;
                    }
                    jSONObject.put("adver_status", i5);
                }
            } catch (JSONException unused) {
            }
        } catch (JSONException unused2) {
            str2 = str6;
        }
        C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
        if (f != null) {
            hj12 = f.mo12861q3();
        }
        FinderJumpInfo finderJumpInfo = qVar.f34827a;
        if (finderJumpInfo.business_type == 1 && (baseFinderFeed = qVar.f34830d) != null) {
            if (i == 0) {
                C7450q qVar2 = C7450q.f25643a;
                MiniAppInfo miniAppInfo = finderJumpInfo.mini_app_info;
                if (!(miniAppInfo == null || (str3 = miniAppInfo.fetch_info_id) == null)) {
                    str6 = str3;
                }
                qVar2.mo8595c(hj12, baseFinderFeed, 34, str6);
            } else if (i == 1) {
                C7450q qVar3 = C7450q.f25643a;
                MiniAppInfo miniAppInfo2 = finderJumpInfo.mini_app_info;
                if (!(miniAppInfo2 == null || (str4 = miniAppInfo2.fetch_info_id) == null)) {
                    str6 = str4;
                }
                qVar3.mo8595c(hj12, baseFinderFeed, 35, str6);
            }
        }
        C7435f2.f25626a.mo8577a(hj12, str, i, jSONObject);
        if (C87412m.m108589b("feed_jumpicon", str) || C87412m.m108589b("link_music_profile", str)) {
            C7450q.f25643a.mo8595c(hj12, qVar.f34830d, i == 0 ? 39 : 40, str2);
        }
    }
}
