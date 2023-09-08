package com.tencent.p014mm.p136ui.base.sortview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.tencent.p014mm.p136ui.base.VerticalScrollBar;
import com.tencent.p014mm.p136ui.base.sortview.C44721b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import qj3.C47861c;
import qj3.C47862d;
import qj3.C47863e;
import qj3.C47864f;

/* renamed from: com.tencent.mm.ui.base.sortview.BaseSortView */
public abstract class BaseSortView extends LinearLayout implements VerticalScrollBar.C6756b {

    /* renamed from: d */
    public VerticalScrollBar f121297d;

    /* renamed from: e */
    public ListView f121298e;

    /* renamed from: f */
    public View f121299f;

    /* renamed from: g */
    public C44721b f121300g = new C44721b(getItemViewCreator());

    /* renamed from: h */
    public AdapterView.OnItemClickListener f121301h;

    /* renamed from: i */
    public AdapterView.OnItemLongClickListener f121302i;

    /* renamed from: j */
    public AdapterView.OnItemSelectedListener f121303j;

    /* renamed from: n */
    public List<C47864f> f121304n = new ArrayList();

    /* renamed from: o */
    public int f121305o;

    /* renamed from: p */
    public boolean f121306p;

    /* renamed from: q */
    public boolean f121307q;

    /* renamed from: r */
    public C44719a f121308r;

    /* renamed from: com.tencent.mm.ui.base.sortview.BaseSortView$a */
    public interface C44719a {
    }

    public BaseSortView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo63491b();
        this.f121297d = getScrollBar();
        this.f121298e = getListView();
        this.f121299f = getNoResultView();
        this.f121306p = true;
        mo69937d(true);
        this.f121298e.setAdapter(this.f121300g);
        VerticalScrollBar verticalScrollBar = this.f121297d;
        if (verticalScrollBar != null) {
            verticalScrollBar.setOnScrollBarTouchListener(this);
        }
        this.f121300g.registerDataSetObserver(new C44720a(this));
        this.f121298e.setOnItemClickListener(new C47861c(this));
        this.f121298e.setOnItemLongClickListener(new C47862d(this));
        this.f121298e.setOnItemSelectedListener(new C47863e(this));
    }

    /* renamed from: S0 */
    public void mo5638S0(String str) {
        int nullAs = Util.nullAs((Integer) ((HashMap) this.f121300g.f121311e).get(str), -1);
        if (nullAs >= 0) {
            this.f121298e.setSelection(nullAs);
        }
    }

    /* renamed from: a */
    public void mo69936a(String str) {
        boolean z;
        boolean z2 = true;
        if (this.f121305o != 1) {
            Log.m105928w("MicroMsg.BaseSortView", "Can't doFilter successfully out of the search mode.");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!Util.isNullOrNil(str)) {
            arrayList.clear();
            Iterator it = ((ArrayList) this.f121304n).iterator();
            while (it.hasNext()) {
                C47864f fVar = (C47864f) it.next();
                if (mo63492c(str, fVar)) {
                    arrayList.add(fVar);
                }
            }
            z = true;
        } else {
            z = false;
        }
        mo69939f(this.f121298e, z && arrayList.size() > 0);
        View view = this.f121299f;
        if (!z || arrayList.size() > 0) {
            z2 = false;
        }
        mo69939f(view, z2);
        mo69938e(arrayList);
    }

    /* renamed from: b */
    public abstract View mo63491b();

    /* renamed from: c */
    public abstract boolean mo63492c(String str, C47864f fVar);

    /* renamed from: d */
    public void mo69937d(boolean z) {
        this.f121307q = z;
        VerticalScrollBar verticalScrollBar = this.f121297d;
        if (verticalScrollBar != null) {
            verticalScrollBar.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: e */
    public void mo69938e(List<C47864f> list) {
        List<C47864f> list2;
        if (this.f121305o == 0 && (list2 = this.f121304n) != list) {
            ((ArrayList) list2).clear();
            if (list != null) {
                ((ArrayList) this.f121304n).addAll(list);
            }
        }
        this.f121300g.mo69954b(list);
    }

    /* renamed from: f */
    public void mo69939f(View view, boolean z) {
        if (view != null) {
            int i = z ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/base/sortview/BaseSortView", "updateViewStatus", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/base/sortview/BaseSortView", "updateViewStatus", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public C44721b getAdapter() {
        return this.f121300g;
    }

    public C44719a getDataSetObserver() {
        return this.f121308r;
    }

    public List<C47864f> getDatas() {
        return this.f121300g.f121310d;
    }

    public abstract C44721b.C44723b getItemViewCreator();

    public abstract ListView getListView();

    public int getMode() {
        return this.f121305o;
    }

    public abstract View getNoResultView();

    public AdapterView.OnItemClickListener getOnItemClickListener() {
        return this.f121301h;
    }

    public AdapterView.OnItemLongClickListener getOnItemLongClickListener() {
        return this.f121302i;
    }

    public AdapterView.OnItemSelectedListener getOnItemSelectedListener() {
        return this.f121303j;
    }

    public abstract VerticalScrollBar getScrollBar();

    public void setDataSetObserver(C44719a aVar) {
        this.f121308r = aVar;
    }

    public void setMode(int i) {
        if (i == 1) {
            this.f121305o = 1;
            mo69936a("");
            return;
        }
        this.f121305o = 0;
        mo69939f(this.f121299f, false);
        mo69939f(this.f121298e, true);
        mo69938e(this.f121304n);
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.f121301h = onItemClickListener;
    }

    public void setOnItemLongClickListener(AdapterView.OnItemLongClickListener onItemLongClickListener) {
        this.f121302i = onItemLongClickListener;
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f121303j = onItemSelectedListener;
    }
}
