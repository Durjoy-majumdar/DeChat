package pf1;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.view.View;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import cg1.C0500a;
import cm1.C55033u;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import df1.C58259c;
import dp1.C58375j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60905o;
import org.json.JSONObject;
import rs1.C13442s8;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import up1.C37521f;
import z04.C119027c;

/* renamed from: pf1.f */
public class C11896f implements C11917o0 {

    /* renamed from: a */
    public C60905o f34764a;

    /* renamed from: b */
    public C11920q f34765b;

    /* renamed from: c */
    public int f34766c = -1;

    /* renamed from: d */
    public final C13601g f34767d = C36568h.m40985a(new C11898b(this));

    /* renamed from: e */
    public final C13601g f34768e = C36568h.m40985a(C11899c.f34773d);

    /* renamed from: f */
    public final C13601g f34769f = C36568h.m40985a(C11897a.f34771d);

    /* renamed from: g */
    public boolean f34770g;

    /* renamed from: pf1.f$a */
    public static final class C11897a extends C87413o implements C32224a<Handler> {

        /* renamed from: d */
        public static final C11897a f34771d = new C11897a();

        public C11897a() {
            super(0);
        }

        public Object invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: pf1.f$b */
    public static final class C11898b extends C87413o implements C32224a<Runnable> {

        /* renamed from: d */
        public final /* synthetic */ C11896f f34772d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11898b(C11896f fVar) {
            super(0);
            this.f34772d = fVar;
        }

        public Object invoke() {
            return new C11900g(this.f34772d);
        }
    }

    /* renamed from: pf1.f$c */
    public static final class C11899c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C11899c f34773d = new C11899c();

        public C11899c() {
            super(0);
        }

        public Object invoke() {
            C37521f.f99374d.getClass();
            boolean z = true;
            if (C37521f.f99458m6.mo60266n().intValue() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public void mo11784a(C60905o oVar, View view, C11920q qVar) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        this.f34770g = true;
    }

    /* renamed from: b */
    public void mo11768b(C60905o oVar, View view, C11920q qVar) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
    }

    /* renamed from: c */
    public void mo11769c(View view, C11920q qVar) {
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
    }

    /* renamed from: d */
    public void mo11785d(C60905o oVar, View view, C11920q qVar) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        mo11775r(oVar, view, qVar);
        C11901h hVar = C11901h.f34775a;
        Context context = oVar.f173499A;
        C87412m.m108593f(context, "holder.context");
        int q = mo11793q();
        String p = mo11792p();
        JSONObject o = mo11791o(qVar);
        C87412m.m108594g(p, "eid");
        C11901h.m11610a(hVar, context, p, 1, qVar, q, 0, o, 32, (Object) null);
    }

    /* renamed from: e */
    public void mo11786e(boolean z, C60905o oVar, View view, C11920q qVar) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        boolean z2 = false;
        this.f34770g = false;
        mo11793q();
        this.f34765b = qVar;
        this.f34764a = oVar;
        if (z) {
            if (this.f34766c != 15) {
                z2 = true;
            }
            if (z2) {
                C11901h hVar = C11901h.f34775a;
                Context context = oVar.f173499A;
                C87412m.m108593f(context, "holder.context");
                int q = mo11793q();
                String p = mo11792p();
                JSONObject o = mo11791o(qVar);
                C87412m.m108594g(p, "eid");
                C11901h.m11610a(hVar, context, p, 0, qVar, q, 0, o, 32, (Object) null);
            }
            C37521f.f99374d.getClass();
            if (C37521f.f99155D8.mo60266n().intValue() == 0) {
                mo11794s();
                return;
            }
            return;
        }
        C37521f.f99374d.getClass();
        if (C37521f.f99155D8.mo60266n().intValue() == 0) {
            if (((Boolean) ((C36570n) this.f34768e).getValue()).booleanValue() && mo11795t()) {
                z2 = true;
            }
            if (z2) {
                ((Handler) ((C36570n) this.f34769f).getValue()).removeCallbacks((Runnable) ((C36570n) this.f34767d).getValue());
                Log.m105924i("BaseJumperEventHandler", "remove preloadRunnable");
            }
        }
    }

    /* renamed from: f */
    public void mo11770f(C60905o oVar, View view, C11920q qVar) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
    }

    /* renamed from: g */
    public void mo11771g(String str, C11920q qVar, View view) {
        C87412m.m108594g(str, "activityName");
        C87412m.m108594g(qVar, "infoEx");
        C87412m.m108594g(view, "jumpView");
    }

    /* renamed from: h */
    public void mo11772h(C60905o oVar, View view, C11920q qVar) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
    }

    /* renamed from: i */
    public void mo11787i(C11920q qVar) {
        C87412m.m108594g(qVar, "infoEx");
        Log.m105924i("BaseJumperEventHandler", "onDataUpdate");
        this.f34765b = qVar;
    }

    /* renamed from: j */
    public void mo11788j(C60905o oVar, View view, C11920q qVar) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
    }

    /* renamed from: k */
    public void mo11789k(C60905o oVar, View view, C11920q qVar) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
    }

    /* renamed from: l */
    public void mo11773l(C60905o oVar, View view, C11920q qVar, C58259c.C58260a aVar) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        C87412m.m108594g(aVar, "event");
    }

    /* renamed from: m */
    public void mo11774m(C60905o oVar, int i) {
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: n */
    public void mo11790n() {
    }

    /* renamed from: o */
    public JSONObject mo11791o(C11920q qVar) {
        String str;
        C87412m.m108594g(qVar, "infoEx");
        FinderJumpInfo finderJumpInfo = qVar.f34827a;
        C87412m.m108594g(finderJumpInfo, "info");
        int i = 1;
        if (!(finderJumpInfo.business_type == 8 || finderJumpInfo.red_packet_type > 0) || (str = qVar.f34827a.report_info) == null || Util.isNullOrNil(str)) {
            return null;
        }
        byte[] decode = Base64.decode(str, 0);
        C87412m.m108593f(decode, "decode(it, Base64.DEFAULT)");
        try {
            JSONObject jSONObject = new JSONObject(new String(decode, C119027c.f356488a));
            int optInt = jSONObject.optInt("bubble_statu");
            int optInt2 = jSONObject.optInt("bubble_connection_type");
            String optString = jSONObject.optString("coverid");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("bubble_statu", optInt);
            jSONObject2.put("bubble_connection_type", optInt2);
            jSONObject2.put("coverid", optString);
            if (this.f34766c != 5) {
                i = 2;
            }
            jSONObject2.put("bubble_type", i);
            return jSONObject2;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: p */
    public String mo11792p() {
        return "feed_jumpicon";
    }

    /* renamed from: q */
    public int mo11793q() {
        return 0;
    }

    /* renamed from: r */
    public void mo11775r(C60905o oVar, View view, C11920q qVar) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        FinderJumpInfo finderJumpInfo = qVar.f34827a;
        C87412m.m108594g(finderJumpInfo, "info");
        if (finderJumpInfo.business_type == 8 || finderJumpInfo.red_packet_type > 0) {
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            Context context = oVar.f173499A;
            C87412m.m108593f(context, "holder.context");
            C13442s8 f = aVar.mo12873f(context);
            Integer valueOf = f != null ? Integer.valueOf(f.f38096i) : null;
            boolean b = C87412m.m108589b(qVar.f34833g, FFmpegMetadataRetriever.METADATA_KEY_COMMENT);
            qVar.f34839m = "commentScene=" + valueOf + "&isFromComment=" + (b ? 1 : 0) + "&finderJumpId=" + qVar.f34827a.jump_id;
            String str = qVar.f34827a.jump_id;
            BaseFinderFeed baseFinderFeed = qVar.f34830d;
            if (!(str == null || baseFinderFeed == null)) {
                C0500a.f1223a.put(str, baseFinderFeed);
            }
        }
        Object obj = oVar.f173503E;
        if (obj instanceof C55033u) {
            C55033u uVar = (C55033u) obj;
            if (uVar.f154492d.mo89544z2()) {
                Context context2 = oVar.f173499A;
                C87412m.m108593f(context2, "holder.context");
                C39622i0 a = C39818r.f106831a.mo62443b(context2).mo75002a(C58375j.class);
                C87412m.m108593f(a, "UICProvider.of(context).…tAdReportUIC::class.java)");
                ((C58375j) a).mo83142e3(oVar, uVar);
            }
        }
    }

    /* renamed from: s */
    public final void mo11794s() {
        FinderJumpInfo finderJumpInfo;
        FinderJumpInfo finderJumpInfo2;
        int i = 0;
        if (!(((Boolean) ((C36570n) this.f34768e).getValue()).booleanValue() && mo11795t())) {
            Log.m105924i("BaseJumperEventHandler", "not preload, shouldPreload()=" + mo11795t());
            return;
        }
        C11920q qVar = this.f34765b;
        if (!(qVar == null || (finderJumpInfo2 = qVar.f34827a) == null)) {
            i = finderJumpInfo2.delay_preload_time;
        }
        long j = ((long) i) * 1000;
        ((Handler) ((C36570n) this.f34769f).getValue()).postDelayed((Runnable) ((C36570n) this.f34767d).getValue(), j);
        StringBuilder sb = new StringBuilder();
        sb.append("post preloadRunnable jumpType=");
        C11920q qVar2 = this.f34765b;
        sb.append((qVar2 == null || (finderJumpInfo = qVar2.f34827a) == null) ? null : Integer.valueOf(finderJumpInfo.jumpinfo_type));
        sb.append(", delayPreloadTime=");
        sb.append(j);
        sb.append(LocaleUtil.MALAY);
        Log.m105924i("BaseJumperEventHandler", sb.toString());
    }

    /* renamed from: t */
    public boolean mo11795t() {
        FinderJumpInfo finderJumpInfo;
        C11920q qVar = this.f34765b;
        if (qVar == null || (finderJumpInfo = qVar.f34827a) == null) {
            return false;
        }
        return finderJumpInfo.need_preload;
    }
}
