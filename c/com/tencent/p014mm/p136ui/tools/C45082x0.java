package com.tencent.p014mm.p136ui.tools;

import android.app.Dialog;
import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C47268j0;
import nj3.C76874e0;
import nj3.C76875f0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.ui.tools.x0 */
public class C45082x0 implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public Context f122285d;

    /* renamed from: e */
    public C77407n f122286e;

    /* renamed from: f */
    public C11182m0 f122287f;

    /* renamed from: g */
    public C11184p0 f122288g;

    /* renamed from: h */
    public C77407n.C47880p f122289h;

    /* renamed from: i */
    public C76874e0 f122290i;

    /* renamed from: j */
    public C76874e0 f122291j;

    /* renamed from: n */
    public C47268j0 f122292n;

    /* renamed from: com.tencent.mm.ui.tools.x0$a */
    public class C45083a implements AdapterView.OnItemLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ View.OnCreateContextMenuListener f122293d;

        /* renamed from: com.tencent.mm.ui.tools.x0$a$a */
        public class C45084a implements C11182m0 {
            public C45084a() {
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.clear();
                Iterator it = ((ArrayList) C45082x0.this.f122291j.f224704d).iterator();
                while (it.hasNext()) {
                    e0Var.mo107174t((MenuItem) it.next());
                }
            }
        }

        public C45083a(View.OnCreateContextMenuListener onCreateContextMenuListener) {
            this.f122293d = onCreateContextMenuListener;
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            C45082x0.this.f122291j.clear();
            Log.m105926v("MicroMsg.MMSubMenuHelper", "registerForContextMenu AbsListView long click");
            AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = new AdapterView.AdapterContextMenuInfo(view, i, j);
            this.f122293d.onCreateContextMenu(C45082x0.this.f122291j, view, adapterContextMenuInfo);
            Iterator it = ((ArrayList) C45082x0.this.f122291j.f224704d).iterator();
            while (it.hasNext()) {
                ((C76875f0) ((MenuItem) it.next())).f224728w = adapterContextMenuInfo;
            }
            C45082x0 x0Var = C45082x0.this;
            x0Var.f122287f = new C45084a();
            x0Var.f122286e.f225776l1 = true;
            x0Var.mo70439e();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.x0$b */
    public class C45085b implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ View.OnCreateContextMenuListener f122296d;

        /* renamed from: com.tencent.mm.ui.tools.x0$b$a */
        public class C45086a implements C11182m0 {
            public C45086a() {
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.clear();
                Iterator it = ((ArrayList) C45082x0.this.f122291j.f224704d).iterator();
                while (it.hasNext()) {
                    e0Var.mo107174t((MenuItem) it.next());
                }
            }
        }

        public C45085b(View.OnCreateContextMenuListener onCreateContextMenuListener) {
            this.f122296d = onCreateContextMenuListener;
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tools/MMListMenuHelper$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            Log.m105926v("MicroMsg.MMSubMenuHelper", "registerForContextMenu normal view long click");
            C45082x0.this.f122291j.clear();
            this.f122296d.onCreateContextMenu(C45082x0.this.f122291j, view, (ContextMenu.ContextMenuInfo) null);
            C45082x0 x0Var = C45082x0.this;
            x0Var.f122287f = new C45086a();
            x0Var.f122286e.f225776l1 = true;
            x0Var.mo70439e();
            if (C45082x0.this.f122291j.size() > 0) {
                C117292a.m165362h(true, this, "com/tencent/mm/ui/tools/MMListMenuHelper$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            }
            C117292a.m165362h(false, this, "com/tencent/mm/ui/tools/MMListMenuHelper$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.x0$c */
    public class C45087c implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ View.OnCreateContextMenuListener f122299d;

        /* renamed from: com.tencent.mm.ui.tools.x0$c$a */
        public class C45088a implements C11182m0 {
            public C45088a() {
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.clear();
                Iterator it = ((ArrayList) C45082x0.this.f122291j.f224704d).iterator();
                while (it.hasNext()) {
                    e0Var.mo107174t((MenuItem) it.next());
                }
            }
        }

        public C45087c(View.OnCreateContextMenuListener onCreateContextMenuListener) {
            this.f122299d = onCreateContextMenuListener;
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tools/MMListMenuHelper$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            Log.m105926v("MicroMsg.MMSubMenuHelper", "registerForContextMenu normal view long click");
            C45082x0.this.f122291j.clear();
            this.f122299d.onCreateContextMenu(C45082x0.this.f122291j, view, (ContextMenu.ContextMenuInfo) null);
            C45082x0 x0Var = C45082x0.this;
            x0Var.f122287f = new C45088a();
            x0Var.f122286e.f225776l1 = true;
            x0Var.mo70439e();
            C117292a.m165362h(true, this, "com/tencent/mm/ui/tools/MMListMenuHelper$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.x0$d */
    public class C45089d implements C11182m0 {
        public C45089d() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.clear();
            Iterator it = ((ArrayList) C45082x0.this.f122291j.f224704d).iterator();
            while (it.hasNext()) {
                e0Var.mo107174t((MenuItem) it.next());
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.x0$e */
    public class C45090e implements C11182m0 {
        public C45090e() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.clear();
            Iterator it = ((ArrayList) C45082x0.this.f122291j.f224704d).iterator();
            while (it.hasNext()) {
                e0Var.mo107174t((MenuItem) it.next());
            }
        }
    }

    public C45082x0(Context context) {
        this.f122285d = context;
        LayoutInflater.from(context);
        this.f122286e = new C77407n(context, 1, false);
        this.f122290i = new C76874e0(context);
        this.f122291j = new C76874e0(context);
    }

    /* renamed from: a */
    public void mo70435a() {
        if (this.f122286e.mo107563h()) {
            this.f122286e.mo107572p();
        }
    }

    /* renamed from: b */
    public void mo70436b(View view, View.OnCreateContextMenuListener onCreateContextMenuListener, C11184p0 p0Var, C77407n.C47880p pVar) {
        Context context = this.f122285d;
        if (!(context instanceof MMFragmentActivity) || !((MMFragmentActivity) context).isSwiping()) {
            this.f122289h = pVar;
            this.f122288g = p0Var;
            this.f122291j.clear();
            onCreateContextMenuListener.onCreateContextMenu(this.f122291j, view, (ContextMenu.ContextMenuInfo) null);
            this.f122287f = new C45090e();
            this.f122286e.f225776l1 = true;
            mo70439e();
            return;
        }
        Log.m105928w("MicroMsg.MMSubMenuHelper", "is swiping, PASS openContextMenu");
    }

    /* renamed from: c */
    public void mo70437c(View view, int i, long j, View.OnCreateContextMenuListener onCreateContextMenuListener, C11184p0 p0Var) {
        Context context = this.f122285d;
        if (!(context instanceof MMFragmentActivity) || !((MMFragmentActivity) context).isSwiping()) {
            this.f122288g = p0Var;
            this.f122291j.clear();
            AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = new AdapterView.AdapterContextMenuInfo(view, i, j);
            onCreateContextMenuListener.onCreateContextMenu(this.f122291j, view, adapterContextMenuInfo);
            Iterator it = ((ArrayList) this.f122291j.f224704d).iterator();
            while (it.hasNext()) {
                ((C76875f0) ((MenuItem) it.next())).f224728w = adapterContextMenuInfo;
            }
            this.f122287f = new C45089d();
            this.f122286e.f225776l1 = true;
            mo70439e();
            return;
        }
        Log.m105928w("MicroMsg.MMSubMenuHelper", "is swiping, PASS openContextMenuForAdapterView");
    }

    /* renamed from: d */
    public void mo70438d(View view, View.OnCreateContextMenuListener onCreateContextMenuListener, C11184p0 p0Var) {
        this.f122288g = p0Var;
        Log.m105926v("MicroMsg.MMSubMenuHelper", "registerForContextMenu");
        if (view instanceof AbsListView) {
            Log.m105926v("MicroMsg.MMSubMenuHelper", "registerForContextMenu AbsListView");
            ((AbsListView) view).setOnItemLongClickListener(new C45083a(onCreateContextMenuListener));
        } else if (view instanceof MMWebView) {
            Log.m105926v("MicroMsg.MMSubMenuHelper", "registerForContextMenu for webview");
            view.setOnLongClickListener(new C45085b(onCreateContextMenuListener));
        } else {
            Log.m105926v("MicroMsg.MMSubMenuHelper", "registerForContextMenu normal view");
            view.setOnLongClickListener(new C45087c(onCreateContextMenuListener));
        }
    }

    /* renamed from: e */
    public Dialog mo70439e() {
        if (this.f122287f != null) {
            this.f122290i.clear();
            C76874e0 e0Var = new C76874e0(this.f122285d);
            this.f122290i = e0Var;
            this.f122287f.onCreateMMMenu(e0Var);
        }
        if (this.f122290i.mo107176v()) {
            Log.m105928w("MicroMsg.MMSubMenuHelper", "show, menu empty");
            return null;
        }
        C77407n nVar = this.f122286e;
        nVar.f225771i = this.f122287f;
        nVar.f225782p = this.f122288g;
        nVar.f225761d = this.f122289h;
        nVar.f225725D = this.f122292n;
        nVar.mo107573q();
        return null;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/tools/MMListMenuHelper", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        C76875f0 f0Var = (C76875f0) ((ArrayList) this.f122290i.f224704d).get(i);
        if (f0Var.mo107177c()) {
            Log.m105924i("MicroMsg.MMSubMenuHelper", "onItemClick menu item has listener");
            mo70435a();
            C117292a.m165361g(this, "com/tencent/mm/ui/tools/MMListMenuHelper", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        C11184p0 p0Var = this.f122288g;
        if (p0Var != null) {
            p0Var.onMMMenuItemSelected(f0Var, i);
        }
        mo70435a();
        C117292a.m165361g(this, "com/tencent/mm/ui/tools/MMListMenuHelper", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
