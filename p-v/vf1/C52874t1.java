package vf1;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveBizPrepareUI;
import di3.C86312j;
import e00.C58468e0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vf1.t1 */
public final class C52874t1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveBizPrepareUI f147673d;

    public C52874t1(FinderLiveBizPrepareUI finderLiveBizPrepareUI) {
        this.f147673d = finderLiveBizPrepareUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizPrepareUI$initBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C58468e0 e0Var = (C58468e0) C86312j.m106911c(C58468e0.class);
        if (e0Var != null) {
            e0Var.clear();
        }
        Intent intent = new Intent();
        intent.putExtra("finder_biz_live_article_url", this.f147673d.f111508o);
        this.f147673d.setResult(-1, intent);
        this.f147673d.finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizPrepareUI$initBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
