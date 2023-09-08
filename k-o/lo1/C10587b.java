package lo1;

import android.content.Context;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.Html5Info;
import com.tencent.p014mm.protocal.protobuf.MiniAppInfo;
import com.tencent.p014mm.protocal.protobuf.NativeInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import jq3.C60896i;
import jq3.C60905o;
import mo1.C61526s1;
import org.json.JSONException;
import org.json.JSONObject;
import z04.C112551y;

/* renamed from: lo1.b */
public final class C10587b extends C60896i<C10586a> {

    /* renamed from: e */
    public static final C10588a f31940e = new C10588a((C8480h) null);

    /* renamed from: lo1.b$a */
    public static final class C10588a {
        public C10588a(C8480h hVar) {
        }

        /* renamed from: a */
        public final JSONObject mo10850a(Context context, FinderJumpInfo finderJumpInfo) {
            String str;
            String str2;
            String str3;
            String str4;
            JSONObject jSONObject;
            C87412m.m108594g(context, "context");
            C87412m.m108594g(finderJumpInfo, "jumpInfo");
            int i = finderJumpInfo.jumpinfo_type;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("iconname", finderJumpInfo.wording);
            jSONObject2.put("iconurl", mo10851b(context, finderJumpInfo));
            JSONObject jSONObject3 = new JSONObject();
            String str5 = "";
            if (i == 1) {
                jSONObject2.put("icontype", 1);
                MiniAppInfo miniAppInfo = finderJumpInfo.mini_app_info;
                if (miniAppInfo == null || (str = miniAppInfo.app_id) == null) {
                    str = str5;
                }
                jSONObject3.put("appid", str);
                MiniAppInfo miniAppInfo2 = finderJumpInfo.mini_app_info;
                if (!(miniAppInfo2 == null || (str2 = miniAppInfo2.path) == null)) {
                    str5 = str2;
                }
                jSONObject3.put("path", str5);
            } else if (i == 2) {
                jSONObject2.put("icontype", 3);
                Html5Info html5Info = finderJumpInfo.html5_info;
                if (!(html5Info == null || (str3 = html5Info.url) == null)) {
                    str5 = str3;
                }
                jSONObject3.put("url", str5);
            } else if (i == 3) {
                NativeInfo nativeInfo = finderJumpInfo.native_info;
                String str6 = null;
                Integer valueOf = nativeInfo != null ? Integer.valueOf(nativeInfo.native_type) : null;
                NativeInfo nativeInfo2 = finderJumpInfo.native_info;
                if (nativeInfo2 == null || (str4 = nativeInfo2.necessary_params) == null) {
                    str4 = str5;
                }
                try {
                    jSONObject = new JSONObject(str4);
                } catch (JSONException e) {
                    Log.m105920e("ProfileMenuConvert", e.getMessage());
                    jSONObject = null;
                }
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                if (valueOf != null && valueOf.intValue() == 2) {
                    jSONObject2.put("icontype", 2);
                    try {
                        if (jSONObject.has("cardId")) {
                            str6 = jSONObject.getString("cardId");
                        }
                    } catch (Exception e2) {
                        Log.printDebugStack("safeGetString", str5, e2);
                    }
                    if (str6 != null) {
                        str5 = str6;
                    }
                    jSONObject3.put("cardId", str5);
                } else if (valueOf != null && valueOf.intValue() == 7) {
                    jSONObject2.put("icontype", 4);
                    try {
                        if (jSONObject.has("kf_url")) {
                            str6 = jSONObject.getString("kf_url");
                        }
                    } catch (Exception e3) {
                        Log.printDebugStack("safeGetString", str5, e3);
                    }
                    if (str6 != null) {
                        str5 = str6;
                    }
                    jSONObject3.put("kf_url", str5);
                }
            }
            String jSONObject4 = jSONObject3.toString();
            C87412m.m108593f(jSONObject4, "utf_kv.toString()");
            jSONObject2.put("utf_kv", C112551y.m153814n(jSONObject4, ",", ";", false));
            return jSONObject2;
        }

        /* renamed from: b */
        public final String mo10851b(Context context, FinderJumpInfo finderJumpInfo) {
            String str;
            boolean z = ((C61526s1) C39818r.f106831a.mo62443b(context).mo75002a(C61526s1.class)).f174899n;
            boolean z2 = C85875k4.m106211z();
            if (z) {
                str = finderJumpInfo.icon_url_bg;
                if (str == null) {
                    return "";
                }
            } else if (z2) {
                str = finderJumpInfo.icon_url_dark;
                if (str == null) {
                    return "";
                }
            } else {
                str = finderJumpInfo.icon_url;
                if (str == null) {
                    return "";
                }
            }
            return str;
        }
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.aoa;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00fa  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r20, jq3.C9493c r21, int r22, int r23, boolean r24, java.util.List r25) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            lo1.a r1 = (lo1.C10586a) r1
            java.lang.String r2 = "holder"
            gy3.C87412m.m108594g(r0, r2)
            java.lang.String r2 = "item"
            gy3.C87412m.m108594g(r1, r2)
            bl3.r r2 = bl3.C39818r.f106831a
            android.content.Context r3 = r0.f173499A
            java.lang.String r4 = "holder.context"
            gy3.C87412m.m108593f(r3, r4)
            bl3.r$a r2 = r2.mo62443b(r3)
            java.lang.Class<mo1.s1> r3 = mo1.C61526s1.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
            mo1.s1 r2 = (mo1.C61526s1) r2
            boolean r2 = r2.f174899n
            if (r2 == 0) goto L_0x0037
            android.content.Context r2 = r0.f173499A
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131100739(0x7f060443, float:1.7813868E38)
            int r2 = r2.getColor(r3)
            goto L_0x0044
        L_0x0037:
            android.content.Context r2 = r0.f173499A
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131100738(0x7f060442, float:1.7813866E38)
            int r2 = r2.getColor(r3)
        L_0x0044:
            r3 = 2131309126(0x7f093246, float:1.8236527E38)
            android.view.View r3 = r0.mo85812D(r3)
            r8 = r3
            android.widget.TextView r8 = (android.widget.TextView) r8
            pf1.q r3 = r1.f31939d
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r3 = r3.f34827a
            java.lang.String r3 = r3.wording
            r8.setText(r3)
            r8.setTextColor(r2)
            pf1.q r3 = r1.f31939d
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r5 = r3.f34827a
            java.lang.String r5 = r5.ext_info
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x006d
            int r5 = r5.length()
            if (r5 != 0) goto L_0x006b
            goto L_0x006d
        L_0x006b:
            r5 = 0
            goto L_0x006e
        L_0x006d:
            r5 = 1
        L_0x006e:
            java.lang.String r9 = ""
            if (r5 != 0) goto L_0x008f
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x0088 }
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r3 = r3.f34827a     // Catch:{ Exception -> 0x0088 }
            java.lang.String r3 = r3.ext_info     // Catch:{ Exception -> 0x0088 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x0088 }
            java.lang.String r3 = "tail_icon"
            java.lang.String r3 = r5.optString(r3)     // Catch:{ Exception -> 0x0088 }
            java.lang.String r5 = "JSONObject(jumpInfo.ext_…o).optString(\"tail_icon\")"
            gy3.C87412m.m108593f(r3, r5)     // Catch:{ Exception -> 0x0088 }
            goto L_0x0090
        L_0x0088:
            java.lang.String r3 = "FinderJumpInfoEx"
            java.lang.String r5 = "prase jumpInfo ext_info exception!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r5)
        L_0x008f:
            r3 = r9
        L_0x0090:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r10 = "type:"
            r5.append(r10)
            pf1.q r10 = r1.f31939d
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r10 = r10.f34827a
            int r10 = r10.business_type
            r5.append(r10)
            java.lang.String r10 = ",ext_info:"
            r5.append(r10)
            pf1.q r10 = r1.f31939d
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r10 = r10.f34827a
            java.lang.String r10 = r10.ext_info
            r5.append(r10)
            java.lang.String r10 = ",tailIcon:"
            r5.append(r10)
            r5.append(r3)
            java.lang.String r10 = ",scope:"
            r5.append(r10)
            a14.n0 r10 = r0.f29679z
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            java.lang.String r10 = "ProfileMenuConvert"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r5)
            int r5 = r3.length()
            if (r5 <= 0) goto L_0x00d4
            goto L_0x00d5
        L_0x00d4:
            r6 = 0
        L_0x00d5:
            if (r6 == 0) goto L_0x010d
            a14.n0 r7 = r0.f29679z
            if (r7 == 0) goto L_0x010d
            java.lang.Class<ir.n> r5 = p565ir.C60606n.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            java.lang.String r6 = "getService(IFinderLiveFeatureService::class.java)"
            gy3.C87412m.m108593f(r5, r6)
            ir.n r5 = (p565ir.C60606n) r5
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
            r10.add(r3)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            pf1.q r3 = r1.f31939d
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r3 = r3.f34827a
            java.lang.String r3 = r3.wording
            if (r3 != 0) goto L_0x00fb
            r3 = r9
        L_0x00fb:
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 768(0x300, float:1.076E-42)
            r18 = 0
            java.lang.String r6 = "ProfileMenuConvert-tailIcon"
            r9 = r10
            r10 = r3
            p565ir.C60606n.C60607a.m70858b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x010d:
            bl3.r r3 = bl3.C39818r.f106831a
            java.lang.Class<ht1.t1> r5 = ht1.C60200t1.class
            bl3.r$a r3 = r3.mo62446e(r5)
            java.lang.Class<pl1.s0> r5 = pl1.C11990s0.class
            bl3.c r3 = r3.mo62447c(r5)
            pl1.s0 r3 = (pl1.C11990s0) r3
            k60.d r3 = r3.mo11870V()
            pl1.n0 r5 = new pl1.n0
            lo1.b$a r6 = f31940e
            android.content.Context r7 = r0.f173499A
            gy3.C87412m.m108593f(r7, r4)
            pf1.q r4 = r1.f31939d
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r4 = r4.f34827a
            java.lang.String r4 = r6.mo10851b(r7, r4)
            up1.y r6 = up1.C27696y.RAW_IMAGE
            r5.<init>(r4, r6)
            l60.b r3 = r3.mo85955a(r5)
            lo1.d r4 = new lo1.d
            r4.<init>(r2)
            r3.getClass()
            r3.f291320d = r4
            r2 = 2131309136(0x7f093250, float:1.8236547E38)
            android.view.View r2 = r0.mo85812D(r2)
            java.lang.String r4 = "holder.getView(R.id.menu_icon)"
            gy3.C87412m.m108593f(r2, r4)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            l60.a r3 = (l60.C99342a) r3
            r3.mo85954d(r2)
            android.view.View r2 = r0.f44854d
            lo1.e r3 = new lo1.e
            r3.<init>(r0, r1)
            r2.setOnClickListener(r3)
            android.view.View r2 = r0.f44854d
            java.lang.String r3 = "holder.itemView"
            gy3.C87412m.m108593f(r2, r3)
            lo1.f r3 = new lo1.f
            r3.<init>(r0, r1)
            zp3.C23564m.m28138h(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lo1.C10587b.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        C39818r rVar = C39818r.f106831a;
        Context context = oVar.f173499A;
        C87412m.m108593f(context, "holder.context");
        int color = ((C61526s1) rVar.mo62443b(context).mo75002a(C61526s1.class)).f174899n ? oVar.f173499A.getResources().getColor(C0966R.color.f3460zr) : oVar.f173499A.getResources().getColor(C0966R.color.f3459zq);
        WeImageView weImageView = (WeImageView) oVar.mo85812D(C0966R.C0970id.gs5);
        weImageView.setLayerPaint((Paint) null);
        weImageView.setIconColor(color);
    }
}
