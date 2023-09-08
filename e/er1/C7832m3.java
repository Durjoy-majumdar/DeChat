package er1;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.view.C4059g5;
import com.tencent.p014mm.plugin.finder.view.C4126n8;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.xweb.FileReaderHelper;
import df1.C7322a;
import di3.C7335d;
import di3.C86312j;
import dp1.C7435f2;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import go3.C76003c;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import ht1.C8808v4;
import java.util.regex.Pattern;
import kd1.C9584f;
import ke3.C88144b;
import kg3.C76577a;
import o40.C61926c;
import org.json.JSONException;
import org.json.JSONObject;
import p227rn.C13090x;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import te3.C49277ef1;
import te3.C49295ek0;
import te3.C50687oi1;
import up1.C37521f;
import yr3.C79150a;
import z04.C112550d0;
import z04.C112551y;
import zc1.C66785b;

/* renamed from: er1.m3 */
public final class C7832m3 {

    /* renamed from: a */
    public static final C7832m3 f26372a = new C7832m3();

    /* renamed from: b */
    public static final String f26373b = "mp.weixin.qq.com/s";

    /* renamed from: c */
    public static final C13601g f26374c = C36568h.m40985a(C7837e.f26400d);

    /* renamed from: d */
    public static final int f26375d = C76577a.m92151b(MMApplicationContext.getContext(), 24);

    /* renamed from: e */
    public static final float f26376e = ((float) C76577a.m92150a(MMApplicationContext.getContext(), 2.0f));

    /* renamed from: f */
    public static final int f26377f;

    /* renamed from: g */
    public static final int f26378g = ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3738cr));

    /* renamed from: h */
    public static final int f26379h;

    /* renamed from: i */
    public static final int f26380i = MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3573y5);

    /* renamed from: j */
    public static final int f26381j = Color.parseColor("#DEE9FF");

    /* renamed from: k */
    public static final int f26382k;

    /* renamed from: l */
    public static final int f26383l = MMApplicationContext.getContext().getResources().getColor(C0966R.color.f2960ag);

    /* renamed from: m */
    public static final int f26384m = MMApplicationContext.getContext().getResources().getColor(C0966R.color.ams);

    /* renamed from: n */
    public static final int f26385n = MMApplicationContext.getContext().getResources().getColor(C0966R.color.f2939n);

    /* renamed from: o */
    public static final int f26386o;

    /* renamed from: p */
    public static final MMNeat7extView f26387p;

    /* renamed from: q */
    public static Bitmap f26388q;

    /* renamed from: r */
    public static final Drawable f26389r;

    /* renamed from: s */
    public static final Drawable f26390s;

    /* renamed from: er1.m3$a */
    public interface C7833a {
        /* renamed from: a */
        void mo724a(boolean z, SpannableStringBuilder spannableStringBuilder);
    }

    /* renamed from: er1.m3$b */
    public static final class C7834b extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BaseFinderFeed f26391d;

        /* renamed from: e */
        public final /* synthetic */ Context f26392e;

        /* renamed from: f */
        public final /* synthetic */ C49277ef1 f26393f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7834b(BaseFinderFeed baseFinderFeed, Context context, C49277ef1 ef12) {
            super(1);
            this.f26391d = baseFinderFeed;
            this.f26392e = context;
            this.f26393f = ef12;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((String) obj, FileReaderHelper.TXT_EXT);
            C7832m3 m3Var = C7832m3.f26372a;
            if (!m3Var.mo8948p() && !this.f26391d.mo3479M()) {
                Context context = this.f26392e;
                BaseFinderFeed baseFinderFeed = this.f26391d;
                C49277ef1 ef12 = this.f26393f;
                C87412m.m108593f(ef12, "eventDesc");
                if (!m3Var.mo8948p() && !baseFinderFeed.mo3479M()) {
                    Intent intent = new Intent();
                    C13442s8.f38060Q0.mo12871c(context, intent);
                    intent.putExtra("key_activity_id", ef12.f132898d);
                    intent.putExtra("key_activity_name", ef12.f132899e);
                    intent.putExtra("key_nick_name", ef12.f132900f);
                    intent.putExtra("key_feed_ref_id", baseFinderFeed.mo3513o().getFeedObject().f164794id);
                    Log.m105924i("Finder.TextUtils", "eventTopicId :" + ef12.f132898d + " eventName:" + ef12.f132899e + " refId: " + baseFinderFeed.mo3513o().getFeedObject().f164794id);
                    intent.putExtra("key_feed_report_id", baseFinderFeed.mo3513o().getFeedObject().f164794id);
                    intent.putExtra("key_activity_profile_src_type", "1");
                    intent.putExtra("key_entrance_type", 7);
                    C9584f.f29822a.mo10262a(intent, C31543z5.m39453c(), 2);
                    C7335d c = C86312j.m106911c(C58684b.class);
                    C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
                    ((C58684b) c).vx0((MMActivity) context, intent, false);
                    String p = C61926c.m72691p(ef12.f132898d);
                    String p2 = C61926c.m72691p(baseFinderFeed.getItemId());
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("activityid", p);
                        jSONObject.put("feedid", p2);
                    } catch (JSONException unused) {
                    }
                    C7435f2 f2Var = C7435f2.f25626a;
                    C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
                    f2Var.mo8577a(f != null ? f.mo12861q3() : null, "link_activity", 1, jSONObject);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: er1.m3$c */
    public static final class C7835c extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Context f26394d;

        /* renamed from: e */
        public final /* synthetic */ BaseFinderFeed f26395e;

        /* renamed from: f */
        public final /* synthetic */ String f26396f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7835c(Context context, BaseFinderFeed baseFinderFeed, String str) {
            super(1);
            this.f26394d = context;
            this.f26395e = baseFinderFeed;
            this.f26396f = str;
        }

        public Object invoke(Object obj) {
            C7322a b;
            C87412m.m108594g((String) obj, FileReaderHelper.TXT_EXT);
            C7832m3 m3Var = C7832m3.f26372a;
            if (!m3Var.mo8948p()) {
                Context context = this.f26394d;
                BaseFinderFeed baseFinderFeed = this.f26395e;
                String str = this.f26396f;
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                C13442s8 f = aVar.mo12873f(context);
                int i = f != null ? f.f38096i : 0;
                Intent intent = new Intent();
                String a = m3Var.mo8935a(str, 156, i + 10000, (int) (System.currentTimeMillis() / ((long) 1000)));
                Log.m105924i("Finder.TextUtils", "click linkLayout, url:" + str + ", urlWithReportParams:" + a);
                intent.putExtra("rawUrl", a);
                C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                C13442s8 f2 = aVar.mo12873f(context);
                if (!(f2 == null || (b = C60172g4.C60173a.m70190b(f2, 0, 1, (Object) null)) == null)) {
                    b.mo8766a(new C7322a.C7323a(19, baseFinderFeed.getItemId()));
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: er1.m3$d */
    public static final class C7836d extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f26397d;

        /* renamed from: e */
        public final /* synthetic */ Context f26398e;

        /* renamed from: f */
        public final /* synthetic */ BaseFinderFeed f26399f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7836d(boolean z, Context context, BaseFinderFeed baseFinderFeed) {
            super(1);
            this.f26397d = z;
            this.f26398e = context;
            this.f26399f = baseFinderFeed;
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x018f  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0218  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r25) {
            /*
                r24 = this;
                r0 = r24
                r4 = r25
                java.lang.String r4 = (java.lang.String) r4
                java.lang.String r1 = "txt"
                gy3.C87412m.m108594g(r4, r1)
                boolean r1 = r0.f26397d
                if (r1 != 0) goto L_0x02de
                er1.m3 r1 = er1.C7832m3.f26372a
                android.content.Context r2 = r0.f26398e
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r12 = r0.f26399f
                r1.getClass()
                java.lang.Class<dp1.y0> r1 = dp1.C58417y0.class
                java.lang.Class<er1.b> r3 = er1.C58684b.class
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "[handlePoiOnClick] poiText="
                r5.append(r6)
                r5.append(r4)
                r6 = 32
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                java.lang.String r6 = "Finder.TextUtils"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
                up1.f r5 = up1.C37521f.f99374d
                r5.getClass()
                pe1.c<java.lang.Boolean> r6 = up1.C37521f.f99557x4
                java.lang.Object r6 = r6.mo60266n()
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                r7 = 3
                java.lang.String r8 = "key_entrance_type"
                r11 = 1
                if (r6 == 0) goto L_0x0239
                android.content.Intent r1 = new android.content.Intent
                r1.<init>()
                te3.m74 r9 = new te3.m74
                r9.<init>()
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r12.mo3513o()
                te3.db1 r5 = r5.getLocation()
                float r5 = r5.f182662e
                r9.f184220e = r5
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r12.mo3513o()
                te3.db1 r5 = r5.getLocation()
                float r5 = r5.f182661d
                r9.f184219d = r5
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r12.mo3513o()
                te3.db1 r5 = r5.getLocation()
                java.lang.String r5 = r5.f182666i
                r9.f184224i = r5
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r12.mo3513o()
                te3.db1 r5 = r5.getLocation()
                int r5 = r5.f182667j
                r9.f184225j = r5
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r12.mo3513o()
                te3.db1 r5 = r5.getLocation()
                java.lang.String r5 = r5.f182663f
                r9.f184221f = r5
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r12.mo3513o()
                te3.db1 r5 = r5.getLocation()
                java.lang.String r5 = r5.f182670p
                r9.f184234v = r5
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r12.mo3513o()
                te3.db1 r5 = r5.getLocation()
                java.lang.String r5 = r5.f182665h
                r9.f184223h = r5
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r12.mo3513o()
                te3.db1 r5 = r5.getLocation()
                java.lang.String r5 = r5.f182664g
                r9.f184222g = r5
                byte[] r5 = r9.toByteArray()
                java.lang.String r6 = "key_location"
                r1.putExtra(r6, r5)
                ht1.w3$a r5 = ht1.C98522w3.C8810a.FINDER_POI_FROM_TYPE_FINDER
                java.lang.String r6 = "key_from_type"
                r1.putExtra(r6, r5)
                rs1.s8$a r10 = rs1.C13442s8.f38060Q0
                rs1.s8 r5 = r10.mo12873f(r2)
                if (r5 == 0) goto L_0x00df
                int r6 = r5.f38096i
                java.lang.String r13 = "key_from_scene"
                r1.putExtra(r13, r6)
                java.lang.String r5 = r5.f38098n
                java.lang.String r6 = "key_context_id"
                r1.putExtra(r6, r5)
            L_0x00df:
                r1.putExtra(r8, r7)
                com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                java.lang.Class<ht1.w3> r6 = ht1.C98522w3.class
                di3.d r6 = di3.C86312j.m106911c(r6)
                ht1.w3 r6 = (ht1.C98522w3) r6
                long r6 = r6.mo3991CD()
                r14 = 3
                r5.mo175912v(r6, r14)
                tf3.q r5 = new tf3.q
                r5.<init>()
                oa1.d r6 = oa1.C117731d.m166007c()
                int r6 = r6.mo182440a(r5)
                if (r6 == r11) goto L_0x010f
                bp3.p r6 = bp3.C79758p.f233760a
                int r5 = r6.mo109883f(r5)
                if (r5 != r11) goto L_0x010d
                goto L_0x010f
            L_0x010d:
                r5 = 0
                goto L_0x0110
            L_0x010f:
                r5 = 1
            L_0x0110:
                if (r5 == 0) goto L_0x0158
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r12.mo3513o()
                te3.db1 r5 = r5.getLocation()
                java.lang.String r5 = r5.f182666i
                if (r5 == 0) goto L_0x0129
                java.lang.String r6 = "foursquare_"
                r7 = 0
                boolean r5 = z04.C112551y.m153819s(r5, r6, r7)
                if (r5 != r11) goto L_0x0129
                r5 = 1
                goto L_0x012a
            L_0x0129:
                r5 = 0
            L_0x012a:
                if (r5 != 0) goto L_0x0158
                pe1.c<java.lang.Integer> r5 = up1.C37521f.f99576z4
                java.lang.Object r5 = r5.mo60266n()
                java.lang.Number r5 = (java.lang.Number) r5
                int r5 = r5.intValue()
                if (r5 != 0) goto L_0x013b
                goto L_0x0158
            L_0x013b:
                di3.d r3 = di3.C86312j.m106911c(r3)
                java.lang.String r5 = "getService(ActivityRouter::class.java)"
                gy3.C87412m.m108593f(r3, r5)
                r5 = r3
                tf0.o1 r5 = (tf0.C13883o1) r5
                r3 = 0
                r14 = 8
                r15 = 0
                r6 = r2
                r7 = r1
                r8 = r9
                r9 = r3
                r1 = r10
                r10 = r14
                r14 = 1
                r11 = r15
                tf0.C13883o1.C13884a.m13253e(r5, r6, r7, r8, r9, r10, r11)
                r5 = r1
                goto L_0x0163
            L_0x0158:
                r5 = r10
                r14 = 1
                di3.d r3 = di3.C86312j.m106911c(r3)
                er1.b r3 = (er1.C58684b) r3
                r3.I00(r2, r1)
            L_0x0163:
                rs1.s8 r1 = r5.mo12873f(r2)
                if (r1 == 0) goto L_0x017f
                r3 = 0
                r5 = 0
                df1.a r1 = ht1.C60172g4.C60173a.m70190b(r1, r5, r14, r3)
                if (r1 == 0) goto L_0x017f
                long r5 = r12.getItemId()
                df1.a$a r3 = new df1.a$a
                r7 = 14
                r3.<init>(r7, r5)
                r1.mo8766a(r3)
            L_0x017f:
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r12.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                int r1 = r1.recommendType
                java.lang.String r3 = "link_poi"
                java.lang.String r5 = "poi_name"
                if (r1 != r14) goto L_0x0218
                bl3.r r1 = bl3.C39818r.f106831a
                java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r6 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
                bl3.r$a r1 = r1.mo62446e(r6)
                java.lang.Class<os1.d> r6 = os1.C62153d.class
                androidx.lifecycle.i0 r1 = r1.mo75002a(r6)
                os1.d r1 = (os1.C62153d) r1
                rx3.l r1 = r1.mo9104X0()
                com.tencent.mm.plugin.finder.storage.FinderItem r6 = r12.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r6 = r6.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r6 = r6.objectDesc
                if (r6 == 0) goto L_0x01b2
                te3.db1 r6 = r6.location
                goto L_0x01b3
            L_0x01b2:
                r6 = 0
            L_0x01b3:
                if (r6 == 0) goto L_0x02de
                B r7 = r1.f38556e
                java.lang.Number r7 = (java.lang.Number) r7
                float r7 = r7.floatValue()
                double r7 = (double) r7
                A r1 = r1.f38555d
                java.lang.Number r1 = (java.lang.Number) r1
                float r1 = r1.floatValue()
                double r9 = (double) r1
                float r1 = r6.f182662e
                double r13 = (double) r1
                float r1 = r6.f182661d
                r23 = r12
                double r11 = (double) r1
                r15 = r7
                r17 = r9
                r19 = r13
                r21 = r11
                double r6 = pl0.C118116u.m166641f(r15, r17, r19, r21)
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r23.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                java.lang.String r1 = r1.recommendReason
                org.json.JSONObject r8 = new org.json.JSONObject
                r8.<init>()
                r8.put(r5, r4)     // Catch:{ JSONException -> 0x0200 }
                java.lang.String r4 = "geo_distance"
                int r5 = (int) r6     // Catch:{ JSONException -> 0x0200 }
                java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ JSONException -> 0x0200 }
                r8.put(r4, r5)     // Catch:{ JSONException -> 0x0200 }
                java.lang.String r4 = "content"
                if (r1 != 0) goto L_0x01fc
                java.lang.String r1 = ""
            L_0x01fc:
                r8.put(r4, r1)     // Catch:{ JSONException -> 0x0200 }
                goto L_0x0201
            L_0x0200:
            L_0x0201:
                dp1.f2 r1 = dp1.C7435f2.f25626a
                rs1.s8$a r4 = rs1.C13442s8.f38060Q0
                rs1.s8 r2 = r4.mo12873f(r2)
                if (r2 == 0) goto L_0x0211
                te3.hj1 r14 = r2.mo12861q3()
                r2 = 1
                goto L_0x0213
            L_0x0211:
                r2 = 1
                r14 = 0
            L_0x0213:
                r1.mo8577a(r14, r3, r2, r8)
                goto L_0x02de
            L_0x0218:
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                r1.put(r5, r4)     // Catch:{ JSONException -> 0x0221 }
                goto L_0x0222
            L_0x0221:
            L_0x0222:
                dp1.f2 r4 = dp1.C7435f2.f25626a
                rs1.s8$a r5 = rs1.C13442s8.f38060Q0
                rs1.s8 r2 = r5.mo12873f(r2)
                if (r2 == 0) goto L_0x0232
                te3.hj1 r14 = r2.mo12861q3()
                r2 = 1
                goto L_0x0234
            L_0x0232:
                r2 = 1
                r14 = 0
            L_0x0234:
                r4.mo8577a(r14, r3, r2, r1)
                goto L_0x02de
            L_0x0239:
                r23 = r12
                boolean r6 = r5.mo61158L()
                if (r6 == 0) goto L_0x02cf
                boolean r5 = r5.mo61157K()
                if (r5 == 0) goto L_0x02cf
                rs1.s8$a r5 = rs1.C13442s8.f38060Q0
                rs1.s8 r6 = r5.mo12873f(r2)
                if (r6 == 0) goto L_0x0252
                int r6 = r6.f38096i
                goto L_0x0253
            L_0x0252:
                r6 = 0
            L_0x0253:
                android.content.Intent r9 = new android.content.Intent
                r9.<init>()
                r10 = 2
                java.lang.String r12 = "key_topic_type"
                r9.putExtra(r12, r10)
                com.tencent.mm.plugin.finder.storage.FinderItem r10 = r23.mo3513o()
                long r12 = r10.getId()
                java.lang.String r10 = "key_ref_object_id"
                r9.putExtra(r10, r12)
                java.lang.String r10 = "key_topic_title"
                r9.putExtra(r10, r4)
                com.tencent.mm.plugin.finder.storage.FinderItem r10 = r23.mo3513o()
                te3.db1 r10 = r10.getLocation()
                byte[] r10 = r10.toByteArray()
                java.lang.String r12 = "key_topic_poi_location"
                r9.putExtra(r12, r10)
                di3.d r10 = di3.C86312j.m106911c(r1)
                dp1.y0 r10 = (dp1.C58417y0) r10
                int r6 = r10.Xy0(r6)
                java.lang.String r10 = "KEY_TAB_TYPE"
                r9.putExtra(r10, r6)
                r5.mo12871c(r2, r9)
                r9.putExtra(r8, r7)
                di3.d r3 = di3.C86312j.m106911c(r3)
                er1.b r3 = (er1.C58684b) r3
                r3.F50(r2, r9)
                rs1.s8 r9 = r5.mo12873f(r2)
                if (r9 == 0) goto L_0x02de
                di3.d r1 = di3.C86312j.m106911c(r1)
                dp1.y0 r1 = (dp1.C58417y0) r1
                long r2 = r23.getItemId()
                r5 = 2
                r6 = 0
                int r8 = r9.f38096i
                r1.Ax0(r2, r4, r5, r6, r8)
                r1 = 0
                r2 = 0
                r3 = 1
                df1.a r1 = ht1.C60172g4.C60173a.m70190b(r9, r2, r3, r1)
                if (r1 == 0) goto L_0x02de
                long r2 = r23.getItemId()
                df1.a$a r4 = new df1.a$a
                r5 = 14
                r4.<init>(r5, r2)
                r1.mo8766a(r4)
                goto L_0x02de
            L_0x02cf:
                er1.w3 r1 = er1.C58784w3.f168295a
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r23.mo3513o()
                te3.db1 r3 = r3.getLocation()
                r4 = 5
                r5 = 1
                r1.mo83920c1(r2, r3, r5, r4)
            L_0x02de:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: er1.C7832m3.C7836d.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: er1.m3$e */
    public static final class C7837e extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C7837e f26400d = new C7837e();

        public C7837e() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C7865r3.f26468a.mo8970c());
        }
    }

    static {
        MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3766df);
        int dimension = (int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3736cp);
        f26377f = dimension;
        f26379h = dimension;
        C76577a.m92153d(MMApplicationContext.getContext(), C0966R.color.f3394rb);
        int color = MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3585yj);
        f26382k = color;
        int color2 = MMApplicationContext.getContext().getResources().getColor(C0966R.color.f2939n);
        int i = MMApplicationContext.getContext().getResources().getDisplayMetrics().widthPixels - (dimension * 2);
        f26386o = i;
        MMNeat7extView mMNeat7extView = new MMNeat7extView(MMApplicationContext.getContext());
        mMNeat7extView.mo154994l(1, C76577a.m92165p(MMApplicationContext.getContext()) * 15.0f);
        mMNeat7extView.setMaxWidth(i);
        f26387p = mMNeat7extView;
        f26389r = C74933u4.m89768e(MMApplicationContext.getContext(), C0966R.raw.icons_filled_location, color2);
        f26390s = C74933u4.m89768e(MMApplicationContext.getContext(), C0966R.raw.icons_filled_location, color);
    }

    /* renamed from: c */
    public static SpannableStringBuilder m7968c(C7832m3 m3Var, int i, String str, Context context, boolean z, int i2, int i3, boolean z2, int i4, Object obj) {
        Drawable drawable;
        if ((i4 & 16) != 0) {
            i2 = 0;
        }
        if ((i4 & 32) != 0) {
            i3 = -1;
        }
        if ((i4 & 64) != 0) {
            z2 = false;
        }
        m3Var.getClass();
        C87412m.m108594g(str, "prefix");
        C87412m.m108594g(context, "context");
        StringBuilder sb = new StringBuilder(str);
        sb.length();
        if (z) {
            int i5 = z2 ? C0966R.raw.icons_filled_fire : C0966R.raw.icons_outlined_fire;
            if (i2 == 0) {
                i2 = context.getResources().getColor(C0966R.color.f3585yj);
            }
            drawable = C74933u4.m89768e(context, i5, i2);
            if (i3 == -1) {
                i3 = f26378g;
            }
            drawable.setBounds(0, 0, i3, i3);
            sb.append(" ");
        } else {
            drawable = null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb);
        if (drawable != null) {
            spannableStringBuilder.setSpan(new C76003c(drawable, 1), str.length(), str.length() + 1, 17);
        }
        return spannableStringBuilder;
    }

    /* renamed from: d */
    public static SpannableStringBuilder m7969d(C7832m3 m3Var, int i, Spannable spannable, Context context, boolean z, int i2, int i3, boolean z2, int i4, Object obj) {
        Drawable drawable;
        if ((i4 & 16) != 0) {
            i2 = 0;
        }
        if ((i4 & 32) != 0) {
            i3 = -1;
        }
        if ((i4 & 64) != 0) {
            z2 = false;
        }
        m3Var.getClass();
        C87412m.m108594g(spannable, "prefix");
        C87412m.m108594g(context, "context");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable);
        spannableStringBuilder.length();
        if (z) {
            int i5 = z2 ? C0966R.raw.icons_filled_fire : C0966R.raw.icons_outlined_fire;
            if (i2 == 0) {
                i2 = context.getResources().getColor(C0966R.color.f3585yj);
            }
            drawable = C74933u4.m89768e(context, i5, i2);
            if (i3 == -1) {
                i3 = f26378g;
            }
            drawable.setBounds(0, 0, i3, i3);
            spannableStringBuilder.append(" ");
        } else {
            drawable = null;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        if (drawable != null) {
            spannableStringBuilder2.setSpan(new C76003c(drawable, 1), spannable.length(), spannable.length() + 1, 17);
        }
        return spannableStringBuilder2;
    }

    /* renamed from: a */
    public final String mo8935a(String str, int i, int i2, int i3) {
        String str2;
        String str3;
        int sessionId = ((C13090x) C86312j.m106911c(C13090x.class)).getSessionId();
        if (str == null) {
            return str;
        }
        String domainString = WeChatHosts.domainString(C0966R.string.f360885fm3);
        C87412m.m108593f(domainString, "domainString(com.tencent…ng.host_mp_weixin_qq_com)");
        boolean z = false;
        if (!C112550d0.m153801u(str, domainString, false) && i2 < 0 && i < 0 && i3 <= 0) {
            return str;
        }
        int E = C112550d0.m153769E(str, "#", 0, false, 6, (Object) null);
        if (E > 0) {
            str2 = str.substring(0, E);
            C87412m.m108593f(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            str3 = str.substring(E);
            C87412m.m108593f(str3, "this as java.lang.String).substring(startIndex)");
        } else {
            str2 = str;
            str3 = "";
        }
        if (!C112550d0.m153801u(str, "?", false)) {
            str2 = str2 + '?';
            z = true;
        }
        if (i >= 0) {
            Pattern compile = Pattern.compile("(scene=[\\d]*)");
            C87412m.m108593f(compile, "compile(pattern)");
            C87412m.m108594g(str2, "input");
            String replaceAll = compile.matcher(str2).replaceAll("");
            C87412m.m108593f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
            str2 = replaceAll + "&scene=" + i;
        }
        if (i2 >= 0) {
            Pattern compile2 = Pattern.compile("(subscene=[\\d]*)");
            C87412m.m108593f(compile2, "compile(pattern)");
            C87412m.m108594g(str2, "input");
            String replaceAll2 = compile2.matcher(str2).replaceAll("");
            C87412m.m108593f(replaceAll2, "nativePattern.matcher(in…).replaceAll(replacement)");
            str2 = replaceAll2 + "&subscene=" + i2;
        }
        if (sessionId > 0) {
            str2 = str2 + "&sessionid=" + sessionId;
        }
        if (i3 > 0) {
            str2 = (str2 + "&clicktime=" + i3) + "&enterid=" + i3;
        }
        String str4 = str2;
        if (z) {
            str4 = C112551y.m153816p(str4, "?&", "?", false, 4, (Object) null);
        }
        return str4 + str3;
    }

    /* renamed from: b */
    public final String mo8936b(String str) {
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        if (str.length() < 2 || !C112551y.m153819s(str, "\t", false) || C112550d0.m153788X(str.subSequence(1, 2), "\t", false, 2, (Object) null)) {
            return str;
        }
        return "\t\t\t" + str;
    }

    /* renamed from: e */
    public final String mo8937e(int i) {
        return i > 99 ? "99+" : String.valueOf(i);
    }

    /* JADX WARNING: type inference failed for: r3v9, types: [java.lang.CharSequence] */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00eb, code lost:
        if (r9 == null) goto L_0x00ed;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final rx3.C13604l<java.lang.Integer, android.text.SpannableString> mo8938f(android.content.Context r18, com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r19, com.tencent.p014mm.p136ui.widget.MMNeat7extView r20, int r21, float r22, boolean r23) {
        /*
            r17 = this;
            r0 = r18
            r1 = r23
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r19.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
            int r2 = r2.adFlag
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "getCampaignSpan feedId:"
            r3.append(r4)
            long r4 = r19.getItemId()
            java.lang.String r4 = o40.C61926c.m72691p(r4)
            r3.append(r4)
            java.lang.String r4 = " adFlag:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = " ignoreAdFlag:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "Finder.TextUtils"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            r3 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            if (r1 != 0) goto L_0x004d
            r1 = 4
            if (r1 != r2) goto L_0x004d
            rx3.l r0 = new rx3.l
            r0.<init>(r3, r4)
            return r0
        L_0x004d:
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r19.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
            if (r1 == 0) goto L_0x0203
            te3.ef1 r1 = r1.event
            if (r1 == 0) goto L_0x0203
            java.lang.String r2 = r1.f132899e
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x006c
            int r2 = r2.length()
            if (r2 != 0) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r2 = 0
            goto L_0x006d
        L_0x006c:
            r2 = 1
        L_0x006d:
            if (r2 != 0) goto L_0x0203
            java.lang.String r2 = "  "
            android.text.TextPaint r3 = r20.getPaint()
            float r3 = r3.measureText(r2)
            er1.m3 r7 = f26372a
            float r3 = r22 - r3
            java.lang.String r8 = r7.mo8939g(r1, r0)
            int r9 = r1.f132901g
            if (r9 != 0) goto L_0x0099
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            java.lang.String r4 = r1.f132899e
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x0096:
            r9 = r3
            goto L_0x0167
        L_0x0099:
            er1.w3 r9 = er1.C58784w3.f168295a
            te3.ek0 r10 = r1.f132902h
            boolean r9 = r9.mo83906V0(r10)
            java.lang.String r10 = ""
            if (r9 == 0) goto L_0x0130
            te3.ek0 r9 = r1.f132902h
            if (r9 == 0) goto L_0x00ac
            java.lang.String r9 = r9.f132980r
            goto L_0x00ad
        L_0x00ac:
            r9 = r4
        L_0x00ad:
            if (r9 == 0) goto L_0x00b8
            int r9 = r9.length()
            if (r9 != 0) goto L_0x00b6
            goto L_0x00b8
        L_0x00b6:
            r9 = 0
            goto L_0x00b9
        L_0x00b8:
            r9 = 1
        L_0x00b9:
            java.lang.String r11 = " "
            r12 = 2
            if (r9 == 0) goto L_0x0100
            int r4 = r1.f132901g
            java.lang.String r4 = er1.C7878t0.m8034c(r12, r4)
            te3.ek0 r9 = r1.f132902h
            if (r9 == 0) goto L_0x00ed
            r13 = 2131826072(0x7f111598, float:1.9285018E38)
            java.lang.Object[] r14 = new java.lang.Object[r12]
            r14[r5] = r10
            r14[r6] = r4
            java.lang.String r13 = r0.getString(r13, r14)
            java.lang.String r14 = "context.getString(\n     …unt\n                    )"
            gy3.C87412m.m108593f(r13, r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r13)
            java.lang.String r9 = r9.f132972g
            r14.append(r9)
            java.lang.String r9 = r14.toString()
            if (r9 != 0) goto L_0x0131
        L_0x00ed:
            r9 = 2131826070(0x7f111596, float:1.9285014E38)
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r12[r5] = r11
            r12[r6] = r4
            java.lang.String r9 = r0.getString(r9, r12)
            java.lang.String r4 = "context.getString(\n     …teCount\n                )"
            gy3.C87412m.m108593f(r9, r4)
            goto L_0x0131
        L_0x0100:
            te3.ek0 r9 = r1.f132902h
            if (r9 == 0) goto L_0x0107
            java.lang.String r9 = r9.f132980r
            goto L_0x0108
        L_0x0107:
            r9 = r4
        L_0x0108:
            if (r9 == 0) goto L_0x0113
            int r9 = r9.length()
            if (r9 != 0) goto L_0x0111
            goto L_0x0113
        L_0x0111:
            r9 = 0
            goto L_0x0114
        L_0x0113:
            r9 = 1
        L_0x0114:
            if (r9 != 0) goto L_0x0130
            r9 = 2131826071(0x7f111597, float:1.9285016E38)
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r12[r5] = r11
            te3.ek0 r11 = r1.f132902h
            if (r11 == 0) goto L_0x0123
            java.lang.String r4 = r11.f132980r
        L_0x0123:
            r12[r6] = r4
            java.lang.String r9 = r0.getString(r9, r12)
            java.lang.String r4 = "{\n                    co…      )\n                }"
            gy3.C87412m.m108593f(r9, r4)
            goto L_0x0131
        L_0x0130:
            r9 = r10
        L_0x0131:
            android.text.TextPaint r4 = r20.getPaint()
            java.lang.String r11 = "measureTv.paint"
            gy3.C87412m.m108593f(r4, r11)
            java.lang.String r11 = r1.f132899e
            if (r11 != 0) goto L_0x013f
            r11 = r10
        L_0x013f:
            float r12 = r4.measureText(r8)
            float r3 = r3 - r12
            float r12 = r4.measureText(r9)
            float r3 = r3 - r12
            android.text.TextUtils$TruncateAt r12 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r3 = android.text.TextUtils.ellipsize(r11, r4, r3, r12)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r8)
            if (r3 != 0) goto L_0x015a
            goto L_0x015b
        L_0x015a:
            r10 = r3
        L_0x015b:
            r4.append(r10)
            r4.append(r9)
            java.lang.String r3 = r4.toString()
            goto L_0x0096
        L_0x0167:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r9)
            java.lang.String r2 = r3.toString()
            android.text.SpannableString r3 = new android.text.SpannableString
            r3.<init>(r2)
            android.content.res.Resources r2 = r18.getResources()
            r4 = 2131100935(0x7f060507, float:1.7814265E38)
            int r2 = r2.getColor(r4)
            boolean r4 = r7.mo8948p()
            if (r4 != 0) goto L_0x0196
            boolean r4 = r19.mo3479M()
            if (r4 == 0) goto L_0x0193
            goto L_0x0196
        L_0x0193:
            int r4 = f26383l
            goto L_0x0197
        L_0x0196:
            r4 = r2
        L_0x0197:
            r8 = 2131755625(0x7f100269, float:1.9142135E38)
            android.graphics.drawable.Drawable r4 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r0, r8, r4)
            int r8 = f26379h
            r4.setBounds(r5, r5, r8, r8)
            boolean r7 = r7.mo8948p()
            if (r7 != 0) goto L_0x01b3
            boolean r7 = r19.mo3479M()
            if (r7 == 0) goto L_0x01b0
            goto L_0x01b3
        L_0x01b0:
            r10 = r21
            goto L_0x01b4
        L_0x01b3:
            r10 = r2
        L_0x01b4:
            go3.c r2 = new go3.c
            r2.<init>(r4, r6)
            r4 = 17
            r3.setSpan(r2, r5, r6, r4)
            com.tencent.mm.plugin.finder.view.g5 r2 = new com.tencent.mm.plugin.finder.view.g5
            int r11 = f26380i
            r12 = 0
            r13 = 0
            er1.m3$b r14 = new er1.m3$b
            r5 = r19
            r14.<init>(r5, r0, r1)
            r15 = 16
            r16 = 0
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            float r1 = f26376e
            r2.f18184i = r1
            r2.f18187o = r6
            int r1 = r3.length()
            r3.setSpan(r2, r6, r1, r4)
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r0 = r1.mo62443b(r0)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC> r1 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.class
            bl3.t r0 = r0.mo62449e(r1)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC r0 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) r0
            if (r0 == 0) goto L_0x01f9
            long r1 = r19.getItemId()
            r4 = 8
            r0.mo5123k3(r1, r4)
        L_0x01f9:
            rx3.l r0 = new rx3.l
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r0.<init>(r1, r3)
            return r0
        L_0x0203:
            rx3.l r0 = new rx3.l
            r0.<init>(r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C7832m3.mo8938f(android.content.Context, com.tencent.mm.plugin.finder.model.BaseFinderFeed, com.tencent.mm.ui.widget.MMNeat7extView, int, float, boolean):rx3.l");
    }

    /* renamed from: g */
    public final String mo8939g(C49277ef1 ef12, Context context) {
        String str;
        C87412m.m108594g(ef12, "activityEvent");
        C87412m.m108594g(context, "context");
        boolean W0 = C58784w3.f168295a.mo83908W0(ef12.f132903i);
        if (Util.isNullOrNil(ef12.f132899e)) {
            str = context.getString(C0966R.string.czr);
        } else {
            C49295ek0 ek02 = ef12.f132902h;
            String str2 = null;
            if ((ek02 != null ? ek02.f132969d : null) == null) {
                str = (!W0 || Util.isNullOrNil(ef12.f132900f)) ? context.getString(C0966R.string.czt) : context.getString(C0966R.string.cyr, new Object[]{ef12.f132900f, ""});
            } else if (!W0 || Util.isNullOrNil(ef12.f132900f)) {
                C49295ek0 ek03 = ef12.f132902h;
                if (ek03 == null || (str = ek03.f132969d) == null) {
                    str = "";
                }
            } else {
                StringBuilder sb = new StringBuilder();
                C49295ek0 ek04 = ef12.f132902h;
                if (ek04 != null) {
                    str2 = ek04.f132969d;
                }
                sb.append(str2);
                sb.append(context.getString(C0966R.string.cy9, new Object[]{ef12.f132900f, ""}));
                str = sb.toString();
            }
        }
        C87412m.m108593f(str, "if (Util.isNullOrNil(act…          }\n            }");
        return str;
    }

    /* renamed from: h */
    public final CharSequence mo8940h(Context context, int i, int i2, int i3, int i4) {
        if (i == 1 && i2 == 0 && i3 == 0) {
            String string = context.getResources().getString(C0966R.string.ec4);
            C87412m.m108593f(string, "{\n            context.re…_recommend_tip)\n        }");
            return string;
        } else if (i > 1 && i2 == 0 && i3 == 0) {
            String string2 = context.getResources().getString(C0966R.string.ebt, new Object[]{mo8937e(i)});
            C87412m.m108593f(string2, "{\n            context.re…ecommendCount))\n        }");
            return string2;
        } else if (i >= 1 && i2 == 0 && i3 > 0) {
            String string3 = context.getResources().getString(C0966R.string.ebm, new Object[]{mo8937e(i4)});
            C87412m.m108593f(string3, "{\n            context.re…)\n            )\n        }");
            return string3;
        } else if ((i < 1 && i3 <= 0) || i2 <= 0) {
            return "";
        } else {
            int dimension = (int) context.getResources().getDimension(C0966R.dimen.f3736cp);
            C58784w3 w3Var = C58784w3.f168295a;
            Integer b0 = w3Var.mo83917b0(1, true);
            int intValue = b0 != null ? b0.intValue() : C0966R.raw.icons_filled_channels_like_bold;
            Context context2 = MMApplicationContext.getContext();
            C87412m.m108593f(context2, "getContext()");
            String string4 = context.getResources().getString(C0966R.string.heu, new Object[]{mo8937e(i2)});
            C87412m.m108593f(string4, "context.resources.getStr…eMessageCount(likeCount))");
            return w3Var.mo83957q1(context2, string4, '#', intValue, C0966R.color.BW_100_Alpha_0_8, dimension, dimension);
        }
    }

    /* renamed from: i */
    public final SpannableString mo8941i(C79150a aVar, int i, SpannableString spannableString, int i2, boolean z) {
        boolean z2;
        SpannableString spannableString2;
        int i3;
        int b;
        int length = spannableString != null ? spannableString.length() : 0;
        boolean z3 = true;
        if (i2 < length) {
            StringBuilder sb = new StringBuilder();
            sb.append(spannableString != null ? spannableString.subSequence(0, i2).toString() : null);
            sb.append(8230);
            Log.m105924i("Finder.TextUtils", sb.toString());
            z2 = true;
        } else {
            z2 = false;
        }
        int min = Math.min(length, i2);
        if (!z || (b = aVar.mo109122b((i3 = i - 1)) + aVar.mo109133q0(i3)) <= 0) {
            z3 = z2;
        } else {
            min = Math.min(b, min);
        }
        if (!z3 || spannableString == null) {
            spannableString2 = new SpannableString("");
        } else {
            CharSequence subSequence = spannableString.subSequence(0, min);
            C87412m.m108592e(subSequence, "null cannot be cast to non-null type android.text.SpannableString");
            spannableString2 = (SpannableString) subSequence;
        }
        return new SpannableString(new SpannableStringBuilder(spannableString2).append(MMApplicationContext.getContext().getText(C0966R.string.mln)));
    }

    /* renamed from: j */
    public final C13604l<Integer, SpannableString> mo8942j(Context context, BaseFinderFeed baseFinderFeed, MMNeat7extView mMNeat7extView, int i, float f) {
        int i2;
        FinderDescPanelUIC finderDescPanelUIC;
        Context context2 = context;
        Class cls = FinderDescPanelUIC.class;
        int i3 = baseFinderFeed.mo3513o().getExtReading().f183805g;
        C58784w3 w3Var = C58784w3.f168295a;
        String str = baseFinderFeed.mo3513o().getExtReading().f183802d;
        if (str == null || str.length() == 0) {
            str = null;
        }
        String str2 = baseFinderFeed.mo3513o().getExtReading().f183803e;
        String str3 = str2 == null || str2.length() == 0 ? null : str2;
        C58739j4 j4Var = C58739j4.f168176a;
        if (str == null || str3 == null) {
            return new C13604l<>(-1, null);
        }
        C37521f.f99374d.getClass();
        if (C37521f.f99427i8.mo60266n().intValue() == 1 && C112550d0.m153801u(str, f26373b, false)) {
            return new C13604l<>(-1, null);
        }
        String str4 = "  " + TextUtils.ellipsize(str3, mMNeat7extView.getPaint(), f, TextUtils.TruncateAt.END);
        SpannableString spannableString = new SpannableString(str4);
        C7832m3 m3Var = f26372a;
        Drawable e = C74933u4.m89768e(context2, i3 != 1 ? C0966R.raw.icons_filled_link : C0966R.raw.icons_filled_red_envelope_big, (m3Var.mo8948p() || baseFinderFeed.mo3479M()) ? f26381j : i3 == 1 ? f26384m : f26385n);
        int i4 = f26379h;
        e.setBounds(0, 0, (int) (((((float) i4) * 1.0f) * ((float) e.getIntrinsicWidth())) / ((float) e.getIntrinsicHeight())), i4);
        int i5 = (m3Var.mo8948p() || baseFinderFeed.mo3479M()) ? f26381j : i;
        spannableString.setSpan(new C76003c(e, 1), 0, 1, 17);
        C4059g5 g5Var = r9;
        C4059g5 g5Var2 = new C4059g5(str3, i5, f26380i, false, false, new C7835c(context2, baseFinderFeed, str), 16, (C8480h) null);
        g5Var.f18184i = f26376e;
        spannableString.setSpan(g5Var, 1, str4.length(), 17);
        if (i3 == 0) {
            i2 = 0;
            if (C112550d0.m153801u(str, f26373b, false)) {
                FinderDescPanelUIC finderDescPanelUIC2 = (FinderDescPanelUIC) C39818r.f106831a.mo62443b(context2).mo62449e(cls);
                if (finderDescPanelUIC2 != null) {
                    finderDescPanelUIC2.mo5123k3(baseFinderFeed.getItemId(), 1);
                }
            } else {
                FinderDescPanelUIC finderDescPanelUIC3 = (FinderDescPanelUIC) C39818r.f106831a.mo62443b(context2).mo62449e(cls);
                if (finderDescPanelUIC3 != null) {
                    finderDescPanelUIC3.mo5123k3(baseFinderFeed.getItemId(), 4);
                }
            }
        } else if (i3 != 1) {
            if (i3 == 2 && (finderDescPanelUIC = (FinderDescPanelUIC) C39818r.f106831a.mo62443b(context2).mo62449e(cls)) != null) {
                finderDescPanelUIC.mo5123k3(baseFinderFeed.getItemId(), 512);
            }
            i2 = -1;
        } else {
            FinderDescPanelUIC finderDescPanelUIC4 = (FinderDescPanelUIC) C39818r.f106831a.mo62443b(context2).mo62449e(cls);
            if (finderDescPanelUIC4 != null) {
                finderDescPanelUIC4.mo5123k3(baseFinderFeed.getItemId(), 16);
            }
            i2 = 1;
        }
        return new C13604l<>(Integer.valueOf(i2), spannableString);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0134  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final rx3.C13604l<java.lang.Integer, android.text.SpannableString> mo8943k(android.content.Context r17, com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r18, com.tencent.p014mm.p136ui.widget.MMNeat7extView r19, int r20, float r21) {
        /*
            r16 = this;
            r0 = r17
            er1.w3 r1 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r18.mo3513o()
            te3.db1 r2 = r2.getLocation()
            java.lang.String r2 = r2.f182663f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x001b
            int r5 = r2.length()
            if (r5 != 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r5 = 0
            goto L_0x001c
        L_0x001b:
            r5 = 1
        L_0x001c:
            r6 = 0
            if (r5 == 0) goto L_0x0020
            r2 = r6
        L_0x0020:
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r18.mo3513o()
            te3.db1 r5 = r5.getLocation()
            java.lang.String r5 = r5.f182664g
            if (r5 == 0) goto L_0x0035
            int r7 = r5.length()
            if (r7 != 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r7 = 0
            goto L_0x0036
        L_0x0035:
            r7 = 1
        L_0x0036:
            if (r7 == 0) goto L_0x0039
            r5 = r6
        L_0x0039:
            java.lang.String r1 = r1.mo83946l0(r2, r5)
            r2 = -1
            if (r1 == 0) goto L_0x013e
            int r5 = r1.length()
            if (r5 != 0) goto L_0x0048
            r5 = 1
            goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            if (r5 == 0) goto L_0x004d
            java.lang.String r1 = ""
        L_0x004d:
            r8 = r1
            int r1 = r8.length()
            if (r1 != 0) goto L_0x0056
            r1 = 1
            goto L_0x0057
        L_0x0056:
            r1 = 0
        L_0x0057:
            if (r1 == 0) goto L_0x0063
            rx3.l r0 = new rx3.l
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r6)
            return r0
        L_0x0063:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "  "
            r1.append(r2)
            android.text.TextPaint r2 = r19.getPaint()
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.END
            r6 = r21
            java.lang.CharSequence r2 = android.text.TextUtils.ellipsize(r8, r2, r6, r5)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r1)
            er1.m3 r1 = f26372a
            boolean r1 = r1.mo8948p()
            if (r1 != 0) goto L_0x00a9
            boolean r1 = r18.mo3479M()
            if (r1 != 0) goto L_0x00a9
            up1.f r1 = up1.C37521f.f99374d
            r1.getClass()
            pe1.c<java.lang.Integer> r1 = up1.C37521f.f99535v1
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 != r4) goto L_0x00a7
            goto L_0x00a9
        L_0x00a7:
            r1 = 0
            goto L_0x00aa
        L_0x00a9:
            r1 = 1
        L_0x00aa:
            if (r1 == 0) goto L_0x00af
            android.graphics.drawable.Drawable r5 = f26390s
            goto L_0x00b1
        L_0x00af:
            android.graphics.drawable.Drawable r5 = f26389r
        L_0x00b1:
            int r6 = f26379h
            r5.setBounds(r3, r3, r6, r6)
            if (r1 == 0) goto L_0x00bc
            int r6 = f26382k
            r9 = r6
            goto L_0x00be
        L_0x00bc:
            r9 = r20
        L_0x00be:
            go3.c r6 = new go3.c
            r6.<init>(r5, r4)
            r5 = 17
            r2.setSpan(r6, r3, r4, r5)
            com.tencent.mm.plugin.finder.view.g5 r6 = new com.tencent.mm.plugin.finder.view.g5
            int r10 = f26380i
            r11 = 0
            r12 = 0
            er1.m3$d r13 = new er1.m3$d
            r15 = r18
            r13.<init>(r1, r0, r15)
            r14 = 16
            r1 = 0
            r7 = r6
            r15 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            float r1 = f26376e
            r6.f18184i = r1
            r6.f18185j = r4
            int r1 = r2.length()
            r2.setSpan(r6, r4, r1, r5)
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r1 = r1.mo62443b(r0)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC> r5 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.class
            bl3.t r1 = r1.mo62449e(r5)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC r1 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) r1
            if (r1 == 0) goto L_0x0102
            long r5 = r18.getItemId()
            r7 = 2
            r1.mo5123k3(r5, r7)
        L_0x0102:
            rs1.s8$a r1 = rs1.C13442s8.f38060Q0
            rs1.s8 r0 = r1.mo12873f(r0)
            if (r0 == 0) goto L_0x010d
            int r0 = r0.f38096i
            goto L_0x010e
        L_0x010d:
            r0 = 0
        L_0x010e:
            r1 = 16
            if (r0 != r1) goto L_0x011e
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r18.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            int r0 = r0.is_poi_same_city
            if (r0 == r4) goto L_0x012a
        L_0x011e:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r18.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            int r0 = r0.recommendType
            if (r0 != r4) goto L_0x0134
        L_0x012a:
            rx3.l r0 = new rx3.l
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0.<init>(r1, r2)
            goto L_0x013d
        L_0x0134:
            rx3.l r0 = new rx3.l
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.<init>(r1, r2)
        L_0x013d:
            return r0
        L_0x013e:
            rx3.l r0 = new rx3.l
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C7832m3.mo8943k(android.content.Context, com.tencent.mm.plugin.finder.model.BaseFinderFeed, com.tencent.mm.ui.widget.MMNeat7extView, int, float):rx3.l");
    }

    /* renamed from: l */
    public final C4126n8 mo8944l(Context context, BaseFinderFeed baseFinderFeed) {
        View inflate;
        if (!C58784w3.f168295a.mo83878J0(baseFinderFeed.mo3513o().getFeedObject())) {
            return null;
        }
        if (f26388q == null && (inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.cxz, (ViewGroup) null)) != null) {
            inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
            f26388q = Bitmap.createBitmap(inflate.getMeasuredWidth(), inflate.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            Bitmap bitmap = f26388q;
            C87412m.m108591d(bitmap);
            Canvas canvas = new Canvas(bitmap);
            canvas.drawColor(0);
            inflate.draw(canvas);
        }
        Bitmap bitmap2 = f26388q;
        if (bitmap2 != null) {
            return new C4126n8(context, bitmap2);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r2 == false) goto L_0x001e;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final rx3.C13604l<java.lang.Integer, android.text.SpannableString> mo8945m(android.content.Context r7, com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r8, boolean r9) {
        /*
            r6 = this;
            r0 = 0
            if (r9 != 0) goto L_0x001e
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r8.mo3513o()
            int r1 = r1.getCreateTime()
            if (r1 <= 0) goto L_0x001e
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r8.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            int r1 = r1.objectType
            r2 = 1
            if (r1 != r2) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            if (r2 != 0) goto L_0x0020
        L_0x001e:
            if (r9 == 0) goto L_0x0059
        L_0x0020:
            android.text.SpannableString r1 = new android.text.SpannableString
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r8.mo3513o()
            int r8 = r8.getCreateTime()
            long r2 = (long) r8
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            java.lang.String r8 = er1.C7878t0.m8037f(r7, r2)
            r1.<init>(r8)
            android.text.style.ForegroundColorSpan r8 = new android.text.style.ForegroundColorSpan
            android.content.res.Resources r7 = r7.getResources()
            r2 = 2131100931(0x7f060503, float:1.7814257E38)
            int r7 = r7.getColor(r2)
            r8.<init>(r7)
            int r7 = r1.length()
            r2 = 17
            r1.setSpan(r8, r0, r7, r2)
            rx3.l r7 = new rx3.l
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            r7.<init>(r8, r1)
            return r7
        L_0x0059:
            rx3.l r7 = new rx3.l
            r8 = -1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9 = 0
            r7.<init>(r8, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C7832m3.mo8945m(android.content.Context, com.tencent.mm.plugin.finder.model.BaseFinderFeed, boolean):rx3.l");
    }

    /* renamed from: n */
    public final int mo8946n() {
        int i;
        int i2 = 0;
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_COMMENT_INT_SYNC, 0);
        int j2 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_LIKE_INT_SYNC, 0);
        int j3 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_OBJECT_LIEK_LIKE_INT_SYNC, 0);
        int j4 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_OBJECT_RECOMMEND_LIKE_INT_SYNC, 0);
        int j5 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_FRIEND_RECOMMEND_INT_SYNC, 0);
        int i3 = j2 + j3 + j4;
        int i4 = j2 + j + j3 + j4 + j5;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(((float) C76577a.m92151b(MMApplicationContext.getContext(), 14)) * C76577a.m92165p(MMApplicationContext.getContext()));
        C85875k4.m106189j0(textPaint, 0.8f);
        if (i4 > 0) {
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            i = (int) textPaint.measureText(mo8947o(context, j5, i3, j, i4).toString());
        } else {
            i = 0;
        }
        C2479n0 n0Var = C2479n0.f12955a;
        C2479n0.C2480a value = C2479n0.f12975u.getValue();
        boolean z = true;
        if (value == null || !value.f12908a) {
            z = false;
        }
        if (z) {
            String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.ejk);
            C87412m.m108593f(string, "getContext().resources.g…_private_msg_bubble_text)");
            i2 = (int) textPaint.measureText(string);
        }
        int i5 = i > i2 ? i : i2;
        Log.m105924i("Finder.TextUtils", "bubbleWidth :" + i + " privateMsgWidth:" + i2 + " width:" + i5);
        int dimension = (int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3706by);
        int dimension2 = (int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.a6f);
        return i5 > dimension ? (dimension2 + i5) - dimension : dimension2;
    }

    /* renamed from: o */
    public final CharSequence mo8947o(Context context, int i, int i2, int i3, int i4) {
        int i5 = i2;
        int i6 = i3;
        C87412m.m108594g(context, "context");
        if (i5 == 0) {
            if (i > 0) {
                return mo8940h(context, i, i2, i3, i4);
            }
            String string = context.getResources().getString(C0966R.string.ebm, new Object[]{mo8937e(i6)});
            C87412m.m108593f(string, "{\n                    co…Count))\n                }");
            return string;
        } else if (i6 == 0) {
            if (i > 0) {
                return mo8940h(context, i, i2, i3, i4);
            }
            int dimension = (int) context.getResources().getDimension(C0966R.dimen.f3736cp);
            C58784w3 w3Var = C58784w3.f168295a;
            Integer b0 = w3Var.mo83917b0(1, true);
            int intValue = b0 != null ? b0.intValue() : C0966R.raw.icons_filled_channels_like_bold;
            Context context2 = MMApplicationContext.getContext();
            C87412m.m108593f(context2, "getContext()");
            String string2 = context.getResources().getString(C0966R.string.fz8, new Object[]{mo8937e(i5)});
            C87412m.m108593f(string2, "context.resources.getStr…eMessageCount(likeCount))");
            return w3Var.mo83957q1(context2, string2, '#', intValue, C0966R.color.BW_100_Alpha_0_8, dimension, dimension);
        } else if (i > 0) {
            return mo8940h(context, i, i2, i3, i4);
        } else {
            int dimension2 = (int) context.getResources().getDimension(C0966R.dimen.f3736cp);
            C58784w3 w3Var2 = C58784w3.f168295a;
            Integer b05 = w3Var2.mo83917b0(1, true);
            int intValue2 = b05 != null ? b05.intValue() : C0966R.raw.icons_filled_channels_like_bold;
            Context context3 = MMApplicationContext.getContext();
            C87412m.m108593f(context3, "getContext()");
            String string3 = context.getResources().getString(C0966R.string.heu, new Object[]{mo8937e(i4)});
            C87412m.m108593f(string3, "context.resources.getStr…MessageCount(totalCount))");
            return w3Var2.mo83957q1(context3, string3, '#', intValue2, C0966R.color.BW_100_Alpha_0_8, dimension2, dimension2);
        }
    }

    /* renamed from: p */
    public final boolean mo8948p() {
        if (!((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e()) {
            C50687oi1 oi12 = C66785b.f191882e.mo90673n0().mo62397b().f140461E;
            return oi12 != null && oi12.f139196d == 1;
        }
    }
}
