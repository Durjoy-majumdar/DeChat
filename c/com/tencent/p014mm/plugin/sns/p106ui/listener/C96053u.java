package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.C95787g0;
import com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.vfs.C86013q1;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import te3.C101804kv2;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.u */
public class C96053u implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280463d;

    public C96053u(TimelineClickListener timelineClickListener) {
        this.f280463d = timelineClickListener;
    }

    public void onClick(View view) {
        String str;
        int i;
        int i2;
        View view2 = view;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$29", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$29");
        if (view.getTag() instanceof C95787g0) {
            C95787g0 g0Var = (C95787g0) view.getTag();
            C101804kv2 kv22 = g0Var.f279450a.ContentObj.f298427h.get(0);
            C94866e1.Yx0().mo139807TE(g0Var.f279451b);
            String e = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d);
            String T = C102236a0.m134725T(kv22);
            String str2 = "";
            if (C86013q1.m106450k(e + T)) {
                str2 = e + T;
                str = e + C102236a0.m134729X(kv22);
            } else {
                str = str2;
            }
            if (C86013q1.m106450k(e + C102236a0.m134735b0(kv22))) {
                str2 = e + C102236a0.m134735b0(kv22);
                str = e + C102236a0.m134739d0(kv22);
            }
            int[] iArr = new int[2];
            View findViewById = view2.findViewById(C0966R.C0970id.bs_);
            if (findViewById != null) {
                findViewById.getLocationInWindow(iArr);
                i = findViewById.getWidth();
                i2 = findViewById.getHeight();
            } else {
                view2.getLocationInWindow(iArr);
                i = view.getWidth();
                i2 = view.getHeight();
            }
            Intent intent = new Intent();
            intent.setClass(TimelineClickListener.m122988j(this.f280463d), SnsOnlineVideoActivity.class);
            intent.putExtra("intent_videopath", str2);
            intent.putExtra("intent_thumbpath", str);
            intent.putExtra("intent_localid", g0Var.f279451b);
            intent.putExtra("intent_isad", false);
            intent.putExtra("intent_from_scene", TimelineClickListener.m122989k(this.f280463d));
            intent.putExtra("img_gallery_left", iArr[0]);
            intent.putExtra("img_gallery_top", iArr[1]);
            intent.putExtra("img_gallery_width", i);
            intent.putExtra("img_gallery_height", i2);
            Activity j = TimelineClickListener.m122988j(this.f280463d);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Activity activity = j;
            C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$29", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            j.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(activity, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$29", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            TimelineClickListener.m122988j(this.f280463d).overridePendingTransition(0, 0);
            TimelineClickListener.m122978D(TimelineClickListener.m122988j(this.f280463d), g0Var.f279450a);
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$29");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$29", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
