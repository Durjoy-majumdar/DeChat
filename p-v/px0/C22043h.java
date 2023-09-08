package px0;

import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C19623o0;
import gc0.C20828a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76912y0;
import rb0.C48009v0;
import uo3.C78253a;

/* renamed from: px0.h */
public final class C22043h implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C22055p f62383d;

    /* renamed from: e */
    public final /* synthetic */ C19623o0 f62384e;

    /* renamed from: px0.h$a */
    public static final class C22044a implements View.OnCreateContextMenuListener {

        /* renamed from: d */
        public static final C22044a f62385d = new C22044a();

        public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            C87412m.m108592e(contextMenu, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenu");
            C76874e0 e0Var = (C76874e0) contextMenu;
            e0Var.mo107136c(0, 1, 0, "删除卡片", C0966R.raw.icons_outlined_delete);
            e0Var.mo107136c(0, 2, 0, "清理封面图", C0966R.raw.icons_outlined_read_clean);
        }
    }

    /* renamed from: px0.h$b */
    public static final class C22045b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C19623o0 f62386d;

        /* renamed from: e */
        public final /* synthetic */ C22055p f62387e;

        public C22045b(C19623o0 o0Var, C22055p pVar) {
            this.f62386d = o0Var;
            this.f62387e = pVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int itemId = menuItem.getItemId();
            if (itemId == 1) {
                C48009v0.Jx0().mo25785Lo(this.f62386d.field_msgId);
                C76912y0.m92769h(this.f62387e.mo35163d(), "已长按删除", C0966R.raw.icons_outlined_delete);
            } else if (itemId == 2) {
                C20828a.m22825b().mo32514c();
                C76912y0.m92769h(this.f62387e.mo35163d(), "已清理图片", C0966R.raw.icons_outlined_read_clean);
            }
        }
    }

    public C22043h(C22055p pVar, C19623o0 o0Var) {
        this.f62383d = pVar;
        this.f62384e = o0Var;
    }

    public final boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/nativefinder/list/NativeFinderListHelper$initData$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C22044a aVar = C22044a.f62385d;
        C19623o0 o0Var = this.f62384e;
        C22055p pVar = this.f62383d;
        C22045b bVar = new C22045b(o0Var, pVar);
        C78253a aVar2 = new C78253a(pVar.mo35163d());
        aVar2.f229257z = true;
        TextView textView = this.f62383d.f62421h;
        if (textView != null) {
            aVar2.mo108273h(textView, aVar, bVar, 0, 0);
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/nativefinder/list/NativeFinderListHelper$initData$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        C87412m.m108603p("titleTv");
        throw null;
    }
}
