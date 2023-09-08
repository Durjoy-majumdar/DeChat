package com.tencent.p014mm.plugin.finder.activity.topic.p051ui;

import ae1.C0034a;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import be1.C0266a;
import be1.C0267b;
import be1.C0270e;
import be1.C0272g;
import be1.C0276h;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.activity.base.p048ui.BaseProfileUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import java.util.Set;
import kotlin.Metadata;
import l31.C61212e;
import o31.C11345b;
import o40.C61926c;
import od1.C11396b;
import rs1.C13317l7;
import rs1.C13442s8;
import sx3.C110826x0;
import te3.C51270sn1;
import zd1.C16143a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/activity/topic/ui/FinderNewTopicUI;", "Lcom/tencent/mm/plugin/finder/activity/base/ui/BaseProfileUI;", "Lte3/sn1;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.activity.topic.ui.FinderNewTopicUI */
public class FinderNewTopicUI extends BaseProfileUI<C51270sn1> {

    /* renamed from: p */
    public final C16143a f12488p = new C16143a();

    /* renamed from: I7 */
    public int mo2194I7() {
        return 22;
    }

    /* renamed from: V3 */
    public C11396b<C51270sn1> mo2195V3() {
        return this.f12488p;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C0272g.class, C0266a.class, C0270e.class, C0267b.class, C0276h.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Class cls = C58417y0.class;
        Class cls2 = C61212e.class;
        int intExtra = getIntent().getIntExtra("key_topic_type", 1);
        long longExtra = getIntent().getLongExtra("key_ref_object_id", 0);
        long longExtra2 = getIntent().getLongExtra("KEY_TOPIC_ID", 0);
        String stringExtra = getIntent().getStringExtra("key_topic_title");
        String str = "";
        if (stringExtra == null) {
            stringExtra = str;
        }
        Log.m105924i("FinderNewTopicUI", "type:" + intExtra + ", topicName:" + stringExtra + " topicId:" + longExtra2 + " refObjectId:" + longExtra);
        int intExtra2 = getIntent().getIntExtra("key_report_scene", 0);
        if (intExtra2 != 0) {
            String stringExtra2 = getIntent().getStringExtra("key_from_user");
            if (stringExtra2 != null) {
                str = stringExtra2;
            }
            ((C58417y0) C86312j.m106911c(cls)).ly0(intExtra2, str, stringExtra, intExtra);
            if (getIntent().getIntExtra("key_topic_type", 1) == 4) {
                long longExtra3 = getIntent().getLongExtra("key_ref_object_id", 0);
                C39818r rVar = C39818r.f106831a;
                AppCompatActivity context = getContext();
                C87412m.m108593f(context, "context");
                ((C58417y0) C86312j.m106911c(cls)).iy0(longExtra3, intExtra2, 4, str, 0, 2, (String) null, ((C13442s8) rVar.mo62444c(context).mo75002a(C13442s8.class)).f38098n);
            }
        }
        C13317l7 l7Var = (C13317l7) C39818r.f106831a.mo62443b(this).mo75002a(C13317l7.class);
        l7Var.mo12758c3("feedid", C61926c.m72691p(longExtra));
        l7Var.mo12758c3("topicid", C61926c.m72691p(longExtra2));
        l7Var.mo12758c3("topicname", stringExtra);
        ((C61212e) C86312j.m106911c(cls2)).mo86178qr(this, C11345b.FinderTopicFeedUI);
        ((C61212e) C86312j.m106911c(cls2)).mo86136FZ(this, getClass().getSimpleName());
        ((C61212e) C86312j.m106911c(cls2)).mo86148No(this, 40, 24184);
        ((C61212e) C86312j.m106911c(cls2)).E60(this, new C0034a(this));
    }

    /* renamed from: z5 */
    public int mo2197z5() {
        return C0966R.C0971layout.cth;
    }
}
