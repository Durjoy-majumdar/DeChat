package er1;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39623j;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import di3.C7335d;
import di3.C86312j;
import dp1.C7435f2;
import dp1.C7450q;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60905o;
import o40.C61926c;
import org.json.JSONException;
import org.json.JSONObject;
import p145dx.C7523p;
import p145dx.C7524q;
import p145dx.C7527z;
import qo3.C101218e0;
import rs1.C13117b;
import rs1.C13442s8;
import rs1.C13452t2;
import rx3.C13598b0;
import te3.C49712hj1;
import wj2.C66132f;

/* renamed from: er1.n2 */
public final class C7842n2 {

    /* renamed from: a */
    public static final C7842n2 f26407a = new C7842n2();

    /* renamed from: er1.n2$a */
    public static final class C7843a extends C87413o implements C32227p<Boolean, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f26408d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f26409e;

        /* renamed from: f */
        public final /* synthetic */ FinderObject f26410f;

        /* renamed from: g */
        public final /* synthetic */ String f26411g;

        /* renamed from: h */
        public final /* synthetic */ boolean f26412h;

        /* renamed from: i */
        public final /* synthetic */ String f26413i;

        /* renamed from: j */
        public final /* synthetic */ int f26414j;

        /* renamed from: n */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f26415n;

        /* renamed from: o */
        public final /* synthetic */ BaseFinderFeed f26416o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7843a(AppCompatActivity appCompatActivity, C60905o oVar, FinderObject finderObject, String str, boolean z, String str2, int i, C32226l<? super Boolean, C13598b0> lVar, BaseFinderFeed baseFinderFeed) {
            super(2);
            this.f26408d = appCompatActivity;
            this.f26409e = oVar;
            this.f26410f = finderObject;
            this.f26411g = str;
            this.f26412h = z;
            this.f26413i = str2;
            this.f26414j = i;
            this.f26415n = lVar;
            this.f26416o = baseFinderFeed;
        }

        public Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int intValue = ((Number) obj2).intValue();
            if (booleanValue) {
                C39818r rVar = C39818r.f106831a;
                AppCompatActivity appCompatActivity = this.f26408d;
                C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                C13452t2 t2Var = (C13452t2) rVar.mo62444c((MMActivity) appCompatActivity).mo75002a(C13452t2.class);
                C60905o oVar = this.f26409e;
                t2Var.getClass();
                boolean z = false;
                if (C13117b.f37342j && intValue == 1 && oVar != null) {
                    TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.mhh);
                    WeImageView weImageView = (WeImageView) oVar.mo85812D(C0966R.C0970id.mj4);
                    if (weImageView != null) {
                        weImageView.setVisibility(0);
                    }
                    if (textView != null) {
                        textView.setText(t2Var.getContext().getResources().getString(C0966R.string.lui));
                    }
                    textView.setTextColor(t2Var.getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
                }
                AppCompatActivity appCompatActivity2 = this.f26408d;
                long j = this.f26410f.f164794id;
                String str = this.f26411g;
                boolean z2 = this.f26412h;
                String str2 = this.f26413i;
                int i = this.f26414j;
                C87412m.m108594g(appCompatActivity2, "context");
                C87412m.m108594g(str2, "reportJson");
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("feedid", C61926c.m72691p(j));
                    if (z2) {
                        jSONObject.put("entrance", 1);
                    } else {
                        jSONObject.put("entrance", 2);
                    }
                    if (C13117b.f37342j) {
                        jSONObject.put("feed_source", 1);
                    } else {
                        jSONObject.put("feed_source", 0);
                    }
                    jSONObject.put("set_type", intValue);
                    if (str != null) {
                        if (str.length() > 0) {
                            jSONObject.put("songid", str);
                        }
                    }
                    if (str2.length() > 0) {
                        z = true;
                    }
                    if (z) {
                        jSONObject.put("bell_info", str2);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("intab", i);
                        jSONObject.put("video_pos_info", jSONObject2.toString());
                    }
                } catch (JSONException unused) {
                }
                C7435f2 f2Var = C7435f2.f25626a;
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                C13442s8 f = aVar.mo12873f(appCompatActivity2);
                f2Var.mo8577a(f != null ? f.mo12861q3() : null, "set_song_success", 1, jSONObject);
                C13442s8 f2 = aVar.mo12873f(this.f26408d);
                if (f2 != null) {
                    C7450q.f25643a.mo8594b(f2.mo12861q3(), this.f26416o, 45);
                }
            }
            this.f26415n.invoke(Boolean.valueOf(booleanValue));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m7986b(C7842n2 n2Var, AppCompatActivity appCompatActivity, BaseFinderFeed baseFinderFeed, long j, boolean z, String str, String str2, int i, C60905o oVar, C32226l lVar, int i2, Object obj) {
        int i3 = i2;
        n2Var.mo8952a(appCompatActivity, baseFinderFeed, j, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? "" : str, (i3 & 32) != 0 ? "" : str2, (i3 & 64) != 0 ? 0 : i, (i3 & 128) != 0 ? null : oVar, lVar);
    }

    /* renamed from: a */
    public final void mo8952a(AppCompatActivity appCompatActivity, BaseFinderFeed baseFinderFeed, long j, boolean z, String str, String str2, int i, C60905o oVar, C32226l<? super Boolean, C13598b0> lVar) {
        FinderObjectDesc finderObjectDesc;
        AppCompatActivity appCompatActivity2 = appCompatActivity;
        BaseFinderFeed baseFinderFeed2 = baseFinderFeed;
        C87412m.m108594g(appCompatActivity2, "context");
        C87412m.m108594g(baseFinderFeed2, "feed");
        C87412m.m108594g(str2, "reportJson");
        C87412m.m108594g(lVar, "feedOp");
        FinderObject finderObject = baseFinderFeed.mo3513o().getFinderObject();
        if (finderObject != null && (finderObjectDesc = finderObject.objectDesc) != null) {
            FinderMedia first = finderObjectDesc.media.getFirst();
            C87412m.m108593f(first, "media.media.first");
            C66132f sm02 = ((C7527z) C86312j.m106911c(C7527z.class)).sm0(finderObject, first);
            C66132f Xz = ((C7523p) C86312j.m106911c(C7523p.class)).mo8647Xz(finderObject.f164794id);
            if (Xz != null) {
                sm02.mo90181l(Xz.f190085h);
                String str3 = Xz.f190086i;
                C87412m.m108594g(str3, "<set-?>");
                sm02.f190086i = str3;
                String str4 = Xz.f190087j;
                C87412m.m108594g(str4, "<set-?>");
                sm02.f190087j = str4;
            }
            String stringExtra = appCompatActivity.getIntent().getStringExtra("KEY_RINGTONE_TO_USERNAME");
            String str5 = stringExtra == null ? "" : stringExtra;
            int intExtra = appCompatActivity.getIntent().getIntExtra("KEY_RINGTONE_CHANNEL", 11);
            int intExtra2 = appCompatActivity.getIntent().getIntExtra("KEY_RINGTONE_CHOOSE_SCENE", 0);
            String stringExtra2 = appCompatActivity.getIntent().getStringExtra("KEY_RINGTONE_REC_REQUEST_ID");
            String str6 = stringExtra2 == null ? "" : stringExtra2;
            boolean booleanExtra = appCompatActivity.getIntent().getBooleanExtra("KEY_IS_VIDEO_STREAM", false);
            C7335d c = C86312j.m106911c(C7524q.class);
            C87412m.m108593f(c, "getService(IRingtoneHalf…ialogService::class.java)");
            C39623j lifecycle = appCompatActivity.getLifecycle();
            C87412m.m108593f(lifecycle, "context.lifecycle");
            AppCompatActivity appCompatActivity3 = appCompatActivity;
            ((C7524q) c).mo8649su(appCompatActivity3, lifecycle, str5, sm02, j, intExtra, intExtra2, str6, booleanExtra, true, (C32226l<? super C101218e0, C13598b0>) null, new C7843a(appCompatActivity3, oVar, finderObject, str, z, str2, i, lVar, baseFinderFeed));
            C13442s8 f = C13442s8.f38060Q0.mo12873f(appCompatActivity2);
            C49712hj1 q3 = f != null ? f.mo12861q3() : null;
            if (q3 != null) {
                C7450q.f25643a.mo8594b(q3, baseFinderFeed2, 44);
            }
        }
    }
}
