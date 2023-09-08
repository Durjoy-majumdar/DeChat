package com.tencent.p014mm.p136ui.conversation.banner;

import ak3.C67056a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import l31.C61212e;
import ln3.C76709a;
import ln3.C76716j;
import rx3.C13604l;
import sx3.C90363p0;
import sx3.C90364q0;

/* renamed from: com.tencent.mm.ui.conversation.banner.m */
public final class C74672m extends C74670k {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74672m(Context context, String str, String str2, boolean z) {
        super(context, str, str2, z);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: h */
    public View mo103828h(String str, Context context) {
        if (C87412m.m108589b("2", str)) {
            View inflate = View.inflate(context, C0966R.C0971layout.cuo, (ViewGroup) null);
            C87412m.m108593f(inflate, "{\n            View.infla…ner_2_v2, null)\n        }");
            return inflate;
        }
        View inflate2 = View.inflate(context, C0966R.C0971layout.cup, (ViewGroup) null);
        C87412m.m108593f(inflate2, "{\n            View.infla…anner_v2, null)\n        }");
        return inflate2;
    }

    /* renamed from: i */
    public void mo103829i() {
        C76716j jVar;
        WeakReference<C67056a> weakReference = C67056a.f192606o;
        C67056a aVar = weakReference != null ? weakReference.get() : null;
        if (aVar != null) {
            Iterator<T> it = aVar.f192612j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    jVar = null;
                    break;
                }
                C76709a aVar2 = (C76709a) it.next();
                if (aVar2 instanceof C76716j) {
                    jVar = (C76716j) aVar2;
                    break;
                }
            }
            if (jVar != null) {
                ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("group_msg_set_top_detach", (Object) null, C90364q0.m113149h(C90363p0.m113143b(new C13604l("group_bar_close_scene", 3)), jVar.mo106997b()), 26356);
            }
        }
    }
}
