package com.tencent.p014mm.plugin.finder.view.manager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import ft1.C59319a;
import fy3.C32224a;
import fy3.C32227p;
import gs1.C59695l;
import gy3.C87413o;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import o40.C11348f;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B-\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/manager/FinderStaggeredGridLayoutManager;", "Landroidx/recyclerview/widget/StaggeredGridLayoutManager;", "Lgs1/l;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager */
public class FinderStaggeredGridLayoutManager extends StaggeredGridLayoutManager implements C59695l {

    /* renamed from: E */
    public C32227p<? super Long, ? super RecyclerView.C16628w, C13598b0> f162366E;

    /* renamed from: com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager$a */
    public static final class C56641a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C56641a f162367d = new C56641a();

        public C56641a() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return "";
        }
    }

    public FinderStaggeredGridLayoutManager(int i, int i2) {
        super(i, i2);
    }

    /* renamed from: U */
    public void mo17414U(int i, int i2) {
        if (Log.getLogLevel() <= 1) {
            Log.m105918d("Finder.StaggeredGridLayoutManager", "[scrollToPosition] position=" + i + " offset=" + i2);
        }
        super.mo17414U(i, i2);
    }

    /* renamed from: d */
    public void mo77960d(C32227p<? super Long, ? super RecyclerView.C16628w, C13598b0> pVar) {
        this.f162366E = pVar;
    }

    public void onLayoutChildren(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        try {
            mo17406M(rVar, wVar, true);
        } catch (IndexOutOfBoundsException e) {
            Log.printErrStackTrace("Finder.StaggeredGridLayoutManager", e, "", new Object[0]);
        } catch (IllegalStateException e2) {
            Log.printErrStackTrace("Finder.StaggeredGridLayoutManager", e2, "", new Object[0]);
            C11348f.C11349a.m11178b(C59319a.f169618b, "onLayoutChildren_error", false, (C11348f.C11352b) null, false, false, C56641a.f162367d, 28, (Object) null);
        }
    }

    public void requestSimpleAnimationsInNextLayout() {
        super.requestSimpleAnimationsInNextLayout();
        try {
            Method declaredMethod = RecyclerView.class.getDeclaredMethod("Y0", new Class[0]);
            declaredMethod.setAccessible(true);
            Field declaredField = RecyclerView.LayoutManager.class.getDeclaredField("mRecyclerView");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            if (obj != null) {
                declaredMethod.invoke(obj, new Object[0]);
                Log.m105924i("Finder.StaggeredGridLayoutManager", "markItemDecorInsetsDirty");
            }
        } catch (Exception e) {
            Log.printErrStackTrace("Finder.StaggeredGridLayoutManager", e, "", new Object[0]);
        }
    }

    public void scrollToPosition(int i) {
        if (Log.getLogLevel() <= 1) {
            Log.m105918d("Finder.StaggeredGridLayoutManager", "[scrollToPosition] position=" + i + ' ');
        }
        super.scrollToPosition(i);
    }

    public int scrollVerticallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        long currentTimeMillis = this.f162366E == null ? 0 : System.currentTimeMillis();
        try {
            if (Log.getLogLevel() <= 1) {
                Log.m105918d("Finder.StaggeredGridLayoutManager", "[scrollVerticallyBy] dy=" + i + " state=" + wVar);
            }
            return mo17413T(i, rVar, wVar);
        } finally {
            C32227p<? super Long, ? super RecyclerView.C16628w, C13598b0> pVar = this.f162366E;
            if (pVar != null && currentTimeMillis > 0) {
                pVar.invoke(Long.valueOf(System.currentTimeMillis() - currentTimeMillis), wVar);
            }
        }
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C16628w wVar, int i) {
        if (Log.getLogLevel() <= 1) {
            Log.m105918d("Finder.StaggeredGridLayoutManager", "[smoothScrollToPosition] position=" + i + " state=" + wVar);
        }
        super.smoothScrollToPosition(recyclerView, wVar, i);
    }

    public FinderStaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
