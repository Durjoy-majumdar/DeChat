package com.tencent.p014mm.plugin.choosemsgfile.p318ui;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.gridviewheaders.C74763a;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import f11.C97792a;
import g11.C98068c;
import gc0.C20828a;
import hc0.C20937c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Date;

/* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.e */
public class C93010e extends RecyclerView.C0130p {

    /* renamed from: d */
    public Runnable f267869d = new C93011a();

    /* renamed from: e */
    public final /* synthetic */ ChooseMsgFileUI f267870e;

    /* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.e$a */
    public class C93011a implements Runnable {
        public C93011a() {
        }

        public void run() {
            C93010e.this.f267870e.f267849o.startAnimation(AnimationUtils.loadAnimation(C93010e.this.f267870e.getContext(), C0966R.C0968anim.f2394bx));
            C93010e.this.f267870e.f267849o.setVisibility(8);
        }
    }

    public C93010e(ChooseMsgFileUI chooseMsgFileUI) {
        this.f267870e = chooseMsgFileUI;
    }

    /* renamed from: a */
    public void mo127428a(boolean z) {
        if (z) {
            this.f267870e.f267849o.removeCallbacks(this.f267869d);
            if (this.f267870e.f267849o.getVisibility() != 0) {
                this.f267870e.f267849o.clearAnimation();
                Animation loadAnimation = AnimationUtils.loadAnimation(this.f267870e.getContext(), C0966R.C0968anim.f2393bw);
                this.f267870e.f267849o.setVisibility(0);
                this.f267870e.f267849o.startAnimation(loadAnimation);
                return;
            }
            return;
        }
        this.f267870e.f267849o.removeCallbacks(this.f267869d);
        this.f267870e.f267849o.postDelayed(this.f267869d, 256);
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI$10", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        if (1 == i) {
            mo127428a(true);
        } else if (i == 0) {
            mo127428a(false);
        }
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) recyclerView.getLayoutManager()).mo16957C() == 0) {
                ChooseMsgFileUI chooseMsgFileUI = this.f267870e;
                if (!chooseMsgFileUI.f267857w) {
                    chooseMsgFileUI.f267846i.mo127389c(false, chooseMsgFileUI.f267843f, chooseMsgFileUI.f267845h);
                }
            }
            this.f267870e.f267857w = false;
            C20828a.m22825b().mo32525n(i);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI$10", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI$10", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        ChooseMsgFileUI chooseMsgFileUI = this.f267870e;
        C97792a F4 = this.f267870e.f267846i.f267780d.mo127392F4(((LinearLayoutManager) chooseMsgFileUI.f267846i.mo127388b(chooseMsgFileUI)).mo16957C());
        if (F4 == null) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI$10", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        long g = F4.mo137123g();
        LruCache<Integer, C20937c> lruCache = C98068c.f287519a;
        this.f267870e.f267849o.setText(Util.nullAs(C74763a.m89510e().mo103936d(new Date(g), MMApplicationContext.getContext()), ""));
        C117292a.m165361g(this, "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI$10", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
