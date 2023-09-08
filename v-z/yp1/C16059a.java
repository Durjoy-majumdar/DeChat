package yp1;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import com.tencent.p014mm.plugin.finder.view.C4059g5;
import dp1.C7435f2;
import gy3.C87412m;
import o40.C61926c;
import org.json.JSONException;
import org.json.JSONObject;
import rs1.C13442s8;
import zp3.C23555k;

/* renamed from: yp1.a */
public final class C16059a extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ SpannableString f43192a;

    /* renamed from: b */
    public final /* synthetic */ View f43193b;

    /* renamed from: c */
    public final /* synthetic */ long f43194c;

    public C16059a(SpannableString spannableString, View view, long j) {
        this.f43192a = spannableString;
        this.f43193b = view;
        this.f43194c = j;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        C87412m.m108594g(view, "view");
        if (z) {
            SpannableString spannableString = this.f43192a;
            Object[] spans = spannableString.getSpans(0, spannableString.length(), C4059g5.class);
            C87412m.m108593f(spans, "spannableString.getSpans…extClickSpan::class.java)");
            for (C4059g5 g5Var : (C4059g5[]) spans) {
                if (g5Var.f18181f) {
                    Context context = this.f43193b.getContext();
                    C87412m.m108593f(context, "contentTv.context");
                    long j3 = this.f43194c;
                    String str = g5Var.f18179d;
                    C87412m.m108594g(str, "topicName");
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("feedid", C61926c.m72691p(j3));
                        jSONObject.put("topicid", C61926c.m72691p(0));
                        jSONObject.put("topicname", str);
                    } catch (JSONException unused) {
                    }
                    C7435f2 f2Var = C7435f2.f25626a;
                    C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
                    f2Var.mo8577a(f != null ? f.mo12861q3() : null, "link_topic_tag", 0, jSONObject);
                }
            }
        }
    }
}
