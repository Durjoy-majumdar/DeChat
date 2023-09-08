package x82;

import a92.C0018e;
import a92.C103341b;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.projector.recyclerview.ScreenThumbLayoutManager;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import j20.C117292a;
import java.util.concurrent.CopyOnWriteArrayList;
import k20.C60958c;
import k20.C9556a;
import x82.C112075a;

/* renamed from: x82.b0 */
public final class C112080b0 {

    /* renamed from: a */
    public Context f335545a;

    /* renamed from: b */
    public C112075a f335546b;

    /* renamed from: c */
    public CopyOnWriteArrayList<Bitmap> f335547c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    public View f335548d;

    /* renamed from: e */
    public ScreenThumbLayoutManager f335549e;

    /* renamed from: f */
    public C0018e f335550f;

    /* renamed from: g */
    public C103341b f335551g;

    /* renamed from: h */
    public RecyclerView f335552h;

    /* renamed from: i */
    public FrameLayout f335553i;

    /* renamed from: j */
    public C112134y f335554j;

    /* renamed from: k */
    public FrameLayout f335555k;

    /* renamed from: l */
    public View f335556l;

    /* renamed from: m */
    public int f335557m = -1;

    /* renamed from: n */
    public int f335558n = -1;

    /* renamed from: o */
    public String f335559o;

    /* renamed from: p */
    public boolean f335560p;

    /* renamed from: q */
    public boolean f335561q;

    /* renamed from: r */
    public int f335562r;

    /* renamed from: s */
    public int f335563s = 3;

    public C112080b0(Context context, C112075a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "statusManager");
        this.f335545a = context;
        this.f335546b = aVar;
    }

    /* renamed from: a */
    public final void mo163779a() {
        FrameLayout frameLayout = this.f335555k;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            C112134y yVar = this.f335554j;
            if (yVar != null) {
                yVar.mo163916c(this.f335545a, frameLayout);
            }
        }
        if (this.f335546b.mo163771b() == 90 || this.f335546b.mo163771b() == 270) {
            RecyclerView recyclerView = this.f335552h;
            if (recyclerView != null) {
                recyclerView.setVisibility(4);
                return;
            }
            return;
        }
        RecyclerView recyclerView2 = this.f335552h;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(4);
        }
        View view = this.f335556l;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbUI", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbUI", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: b */
    public final void mo163780b() {
        Bundle bundle = new Bundle();
        bundle.putInt("thumb_current_page", this.f335562r);
        this.f335546b.mo163772c(C112075a.C112077b.REQUEST_THUMB_REFRESH, bundle);
    }

    /* renamed from: c */
    public final void mo163781c() {
        FrameLayout frameLayout = this.f335555k;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            C112134y yVar = this.f335554j;
            if (yVar != null) {
                yVar.mo163916c(this.f335545a, frameLayout);
            }
        }
        C112134y yVar2 = this.f335554j;
        if (yVar2 != null) {
            yVar2.mo163917d();
        }
        FrameLayout frameLayout2 = this.f335555k;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        FrameLayout frameLayout3 = this.f335553i;
        if (frameLayout3 != null) {
            frameLayout3.setVisibility(0);
        }
        RecyclerView recyclerView = this.f335552h;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        View view = this.f335556l;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbUI", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbUI", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo163782d(this.f335557m);
    }

    /* renamed from: d */
    public final void mo163782d(int i) {
        if (this.f335552h != null && i >= 0 && this.f335558n >= 0) {
            C112134y yVar = this.f335554j;
            if (yVar != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(i + 1);
                sb.append(XVFSFile.SEPARATOR_CHAR);
                sb.append(this.f335558n);
                yVar.mo163918e(sb.toString());
            }
            C103341b bVar = this.f335551g;
            if (bVar != null) {
                bVar.f304732i = i;
                bVar.notifyDataSetChanged();
            }
            ScreenThumbLayoutManager screenThumbLayoutManager = this.f335549e;
            if (screenThumbLayoutManager != null) {
                RecyclerView recyclerView = this.f335552h;
                C87412m.m108591d(recyclerView);
                screenThumbLayoutManager.smoothScrollToPosition(recyclerView, new RecyclerView.C16628w(), i);
            }
        }
    }
}
