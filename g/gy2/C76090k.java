package gy2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import ay2.C67113b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.C68691e;
import com.tencent.p014mm.plugin.taskbar.p110ui.section.weapp.TaskBarSectionWeAppRecyclerView;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import kg3.C76577a;
import kr0.C76633z0;

/* renamed from: gy2.k */
public class C76090k extends C67113b {

    /* renamed from: j */
    public final TaskBarSectionWeAppRecyclerView f222996j;

    /* renamed from: n */
    public final RelativeLayout f222997n;

    /* renamed from: o */
    public TaskBarSectionWeAppRecyclerView.C71348e f222998o;

    /* renamed from: gy2.k$a */
    public final class C76091a implements TaskBarSectionWeAppRecyclerView.C71348e {

        /* renamed from: a */
        public final TaskBarSectionWeAppRecyclerView.C71348e f222999a;

        /* renamed from: b */
        public final /* synthetic */ C76090k f223000b;

        public C76091a(C76090k kVar, TaskBarSectionWeAppRecyclerView.C71348e eVar) {
            C87412m.m108594g(eVar, "delegate");
            this.f223000b = kVar;
            this.f222999a = eVar;
        }

        /* renamed from: a */
        public boolean mo98218a(float f, float f2) {
            return this.f222999a.mo98218a(f, f2);
        }

        /* renamed from: b */
        public void mo98219b(LocalUsageInfo localUsageInfo, int i, int i2) {
            this.f222999a.mo98219b(localUsageInfo, i, i2);
        }

        /* renamed from: c */
        public void mo98220c(C68691e.C68692a aVar, boolean z) {
            this.f222999a.mo98220c(aVar, z);
        }

        /* renamed from: d */
        public void mo98221d(C68691e.C68692a aVar, int i) {
            this.f222999a.mo98221d(aVar, i);
            this.f223000b.mo106312i();
        }

        /* renamed from: e */
        public void mo98222e(float f) {
            this.f223000b.mo106282h(f);
        }

        /* renamed from: f */
        public void mo98223f() {
            this.f222999a.mo98223f();
        }

        /* renamed from: g */
        public void mo98224g(int i, C68691e.C68692a aVar) {
            this.f222999a.mo98224g(i, aVar);
        }

        /* renamed from: h */
        public void mo98225h() {
            this.f222999a.mo98225h();
        }

        /* renamed from: i */
        public View mo98226i() {
            return this.f222999a.mo98226i();
        }

        /* renamed from: j */
        public void mo98227j(boolean z) {
            this.f222999a.mo98227j(z);
        }

        /* renamed from: k */
        public void mo98228k(RecyclerView.C16631z zVar, View view, C68691e.C68692a aVar, int i, boolean z) {
            this.f222999a.mo98228k(zVar, view, aVar, i, z);
        }

        /* renamed from: l */
        public void mo98229l(C68691e.C68692a aVar, int i) {
            this.f222999a.mo98229l(aVar, i);
            this.f223000b.mo106312i();
        }
    }

    /* renamed from: gy2.k$b */
    public static final class C76092b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C76090k f223001d;

        public C76092b(C76090k kVar) {
            this.f223001d = kVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppView$moreView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f223001d.mo106281g();
            C117292a.m165361g(this, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppView$moreView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: gy2.k$c */
    public static final class C76093c implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ RelativeLayout f223002d;

        public C76093c(RelativeLayout relativeLayout) {
            this.f223002d = relativeLayout;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppView$moreView$1$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C76633z0 z0Var = (C76633z0) C86312j.m106911c(C76633z0.class);
            if (z0Var == null) {
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppView$moreView$1$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return false;
            } else if (z0Var.Sm0()) {
                z0Var.mo94231eT(this.f223002d.getContext());
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppView$moreView$1$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            } else {
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppView$moreView$1$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return false;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76090k(Context context, C67113b.C67114a aVar, int i, AttributeSet attributeSet, int i2) {
        super(context, aVar, i, attributeSet, i2);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "callback");
        TaskBarSectionWeAppRecyclerView e = mo106280e();
        this.f222996j = e;
        RelativeLayout relativeLayout = (RelativeLayout) getRoot().findViewById(C0966R.C0970id.gyw);
        relativeLayout.setContentDescription(C76577a.m92166q(context, C0966R.string.f7891v8) + C76577a.m92166q(context, C0966R.string.a4n));
        relativeLayout.setOnClickListener(new C76092b(this));
        relativeLayout.setOnLongClickListener(new C76093c(relativeLayout));
        this.f222997n = relativeLayout;
        ((ViewGroup) getRoot().findViewById(C0966R.C0970id.f357785br0)).addView(e, 0, new FrameLayout.LayoutParams(-1, -2));
        e.setId(C0966R.C0970id.f359353kg2);
        if (Build.VERSION.SDK_INT >= 22) {
            relativeLayout.setAccessibilityTraversalBefore(e.getId());
        }
    }

    /* renamed from: f */
    public static final String m91403f(List<? extends C68691e.C68692a> list) {
        C87412m.m108594g(list, "items");
        StringBuilder sb = new StringBuilder();
        for (C68691e.C68692a aVar : list) {
            sb.append(aVar.f197340a.f239044h + ',');
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "result.toString()");
        return sb4;
    }

    /* renamed from: b */
    public void mo91215b() {
        mo106312i();
        this.f222996j.mo98291A1();
    }

    /* renamed from: c */
    public String mo91216c() {
        String string = getContext().getString(C0966R.string.f7905vr);
        C87412m.m108593f(string, "context.getString(R.stri…nd_taskbar_section_weapp)");
        return string;
    }

    /* renamed from: d */
    public boolean mo91217d(int i) {
        return true;
    }

    /* renamed from: e */
    public TaskBarSectionWeAppRecyclerView mo106280e() {
        return new TaskBarSectionWeAppRecyclerView(getContext());
    }

    /* renamed from: g */
    public void mo106281g() {
        TaskBarSectionWeAppRecyclerView.C71348e eVar = this.f222998o;
        if (eVar != null) {
            ((C76091a) eVar).mo98225h();
        }
    }

    public final RelativeLayout getMoreView() {
        return this.f222997n;
    }

    public final TaskBarSectionWeAppRecyclerView getRecyclerView() {
        return this.f222996j;
    }

    public final int getShowCount() {
        return this.f222996j.getShowCount();
    }

    public final int getShowLines() {
        return this.f222996j.getShowLines();
    }

    public final List<C68691e.C68692a> getShowList() {
        return this.f222996j.getShowList();
    }

    public final TaskBarSectionWeAppRecyclerView.C71348e getWeAppCallback() {
        return this.f222998o;
    }

    /* renamed from: h */
    public void mo106282h(float f) {
    }

    /* renamed from: i */
    public final void mo106312i() {
        ImageView imageView;
        this.f222997n.setVisibility(this.f222996j.getDataList().size() > 8 ? 0 : 4);
        if (this.f222997n.getVisibility() == 4 && (imageView = (ImageView) findViewById(C0966R.C0970id.m4t)) != null) {
            imageView.setImageDrawable((Drawable) null);
        }
    }

    public final void setDataList(List<? extends C68691e.C68692a> list) {
        this.f222996j.setDataList(list);
    }

    public final void setWeAppCallback(TaskBarSectionWeAppRecyclerView.C71348e eVar) {
        if (eVar != null) {
            C76091a aVar = new C76091a(this, eVar);
            this.f222998o = aVar;
            this.f222996j.setWeAppCallback(aVar);
        }
    }
}
