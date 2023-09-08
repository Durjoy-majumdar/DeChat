package rs1;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C54219z;
import bl3.C113200q;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import dp1.C7435f2;
import gy3.C87412m;
import ht1.C8773i2;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jq3.C60905o;
import org.json.JSONObject;
import p185kq.C10383h;
import sx3.C110818d0;
import te3.C64689rq2;
import zt3.C119157j;
import zt3.C119179t;

@C113200q(initialMode = 2)
/* renamed from: rs1.j2 */
public final class C13282j2 extends C13308kb implements C8773i2 {

    /* renamed from: o */
    public static final ConcurrentHashMap<Long, C54219z<LinkedList<FinderCommentInfo>>> f37698o = new ConcurrentHashMap<>();

    /* renamed from: f */
    public long f37699f;

    /* renamed from: g */
    public long f37700g;

    /* renamed from: h */
    public long f37701h;

    /* renamed from: i */
    public long f37702i;

    /* renamed from: j */
    public boolean f37703j;

    /* renamed from: n */
    public Map<Long, Integer> f37704n = new LinkedHashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13282j2(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public View mo12677c3(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        return oVar.mo85812D(C0966R.C0970id.lz7);
    }

    /* renamed from: d3 */
    public void mo12619d3(C60905o oVar, boolean z) {
        C87412m.m108594g(oVar, "holder");
        ViewGroup viewGroup = (ViewGroup) oVar.mo85812D(C0966R.C0970id.lz7);
        if (viewGroup != null) {
            viewGroup.setAlpha(1.0f);
            viewGroup.animate().alpha(0.0f).setDuration(250).setListener(new C13228f2(viewGroup)).start();
        }
    }

    /* renamed from: e3 */
    public boolean mo12620e3(C60905o oVar, boolean z) {
        C87412m.m108594g(oVar, "holder");
        Object obj = oVar.f173503E;
        BaseFinderFeed baseFinderFeed = obj instanceof BaseFinderFeed ? (BaseFinderFeed) obj : null;
        if (baseFinderFeed == null) {
            return false;
        }
        return mo12677c3(oVar) != null && !Util.isNullOrNil((List) mo12733j3(baseFinderFeed.getItemId()).getValue());
    }

    /* renamed from: g3 */
    public void mo12678g3(C60905o oVar, boolean z, long j, long j2) {
        C87412m.m108594g(oVar, "holder");
        if (z) {
            boolean z2 = true;
            if (this.f37700g == j) {
                mo12736m3(j, 1);
            }
            View c3 = mo12677c3(oVar);
            if (c3 == null || c3.getVisibility() != 0) {
                z2 = false;
            }
            if (z2) {
                mo12735l3(oVar);
                return;
            }
            this.f37700g = 0;
            this.f37701h = 0;
            this.f37702i = 0;
            this.f37699f = 0;
            this.f37703j = false;
        }
    }

    /* renamed from: i3 */
    public void mo12621i3(C60905o oVar, boolean z) {
        C87412m.m108594g(oVar, "holder");
        mo12735l3(oVar);
        ViewGroup viewGroup = (ViewGroup) oVar.mo85812D(C0966R.C0970id.lz7);
        if (viewGroup != null) {
            C119179t tVar = C119157j.f356862d;
            C13240g2 g2Var = new C13240g2(viewGroup, this, oVar);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(g2Var, 150, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r3 = new androidx.lifecycle.C54219z<>();
     */
    /* renamed from: j3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.lifecycle.C54219z<java.util.LinkedList<com.tencent.p014mm.protocal.protobuf.FinderCommentInfo>> mo12733j3(long r2) {
        /*
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, androidx.lifecycle.z<java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo>>> r0 = f37698o
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r3 = r0.get(r2)
            if (r3 != 0) goto L_0x0019
            androidx.lifecycle.z r3 = new androidx.lifecycle.z
            r3.<init>()
            java.lang.Object r2 = r0.putIfAbsent(r2, r3)
            if (r2 != 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r3 = r2
        L_0x0019:
            androidx.lifecycle.z r3 = (androidx.lifecycle.C54219z) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13282j2.mo12733j3(long):androidx.lifecycle.z");
    }

    /* renamed from: k3 */
    public final void mo12734k3() {
        this.f37699f = System.currentTimeMillis();
        Log.m105924i("Finder.FeedHotCommentUIC", "hotcomment is expose, showingFeedId = " + this.f37700g + " startExposeTime = " + this.f37699f + " showingCommentId = " + this.f37701h + " showingDuration = " + this.f37702i);
    }

    /* renamed from: l3 */
    public final void mo12735l3(C60905o oVar) {
        FinderCommentInfo finderCommentInfo;
        Object obj = oVar.f173503E;
        BaseFinderFeed baseFinderFeed = obj instanceof BaseFinderFeed ? (BaseFinderFeed) obj : null;
        if (baseFinderFeed != null) {
            C64689rq2 rq22 = (C64689rq2) C110818d0.m150916N(baseFinderFeed.mo3513o().getMediaList());
            long j = 0;
            long j2 = (rq22 != null ? rq22.f185238E : 0) / 1000;
            this.f37700g = baseFinderFeed.getItemId();
            LinkedList value = mo12733j3(baseFinderFeed.getItemId()).getValue();
            if (!(value == null || (finderCommentInfo = (FinderCommentInfo) C110818d0.m150916N(value)) == null)) {
                j = finderCommentInfo.commentId;
            }
            this.f37701h = j;
            this.f37702i = j2;
            this.f37699f = System.currentTimeMillis();
            Log.m105924i("Finder.FeedHotCommentUIC", "hotcomment is expose, showingFeedId = " + this.f37700g + " startExposeTime = " + this.f37699f + " showingCommentId = " + this.f37701h + " showingDuration = " + this.f37702i);
        }
    }

    /* renamed from: m3 */
    public final void mo12736m3(long j, int i) {
        Class cls = C10383h.class;
        if (j != 0) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            long j2 = ((LinkedHashMap) this.f37704n).get(Long.valueOf(j));
            if (j2 == null) {
                j2 = 0L;
            }
            jSONObject2.put("cid", ((C10383h) C86312j.m106911c(cls)).mo10700XQ(this.f37701h));
            jSONObject2.put("feedid", ((C10383h) C86312j.m106911c(cls)).mo10700XQ(j));
            jSONObject2.put("current_play_sec", j2);
            jSONObject2.put("video_duration", this.f37702i);
            jSONObject2.put("expose_start_time", this.f37699f);
            jSONObject2.put("expose_end_time", System.currentTimeMillis());
            jSONObject2.put("expose_end_type", i);
            jSONObject.put("hot_comment", jSONObject2);
            C13442s8 f = C13442s8.f38060Q0.mo12873f(getContext());
            C7435f2.f25626a.mo8577a(f != null ? f.mo12861q3() : null, "hot_comment", 0, jSONObject);
        }
    }

    public void onPause() {
        super.onPause();
        long j = this.f37700g;
        if (j != 0) {
            mo12736m3(j, 1);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f37700g != 0) {
            mo12734k3();
        }
    }
}
