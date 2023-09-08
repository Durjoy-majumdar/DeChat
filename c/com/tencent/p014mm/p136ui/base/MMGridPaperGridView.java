package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import junit.framework.Assert;
import k20.C60958c;
import k20.C9556a;
import x22.C118793a;

/* renamed from: com.tencent.mm.ui.base.MMGridPaperGridView */
public final class MMGridPaperGridView extends GridView {

    /* renamed from: d */
    public int f348247d;

    /* renamed from: e */
    public int f348248e;

    /* renamed from: f */
    public int f348249f;

    /* renamed from: g */
    public int f348250g;

    /* renamed from: h */
    public int f348251h = -1;

    /* renamed from: i */
    public boolean f348252i = false;

    /* renamed from: j */
    public C116067c f348253j;

    /* renamed from: n */
    public C116072d f348254n;

    /* renamed from: o */
    public AdapterView.OnItemClickListener f348255o = new C57662a();

    /* renamed from: p */
    public AdapterView.OnItemLongClickListener f348256p = new C57663b();

    /* renamed from: com.tencent.mm.ui.base.MMGridPaperGridView$a */
    public class C57662a implements AdapterView.OnItemClickListener {
        public C57662a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/MMGridPaperGridView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            MMGridPaperGridView mMGridPaperGridView = MMGridPaperGridView.this;
            C116072d dVar = mMGridPaperGridView.f348254n;
            if (dVar == null) {
                Log.m105928w("MicroMsg.MMGridPaperGridView", "on item click, but main adapter is null");
                C117292a.m165361g(this, "com/tencent/mm/ui/base/MMGridPaperGridView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            int i2 = mMGridPaperGridView.f348250g;
            dVar.getClass();
            C117292a.m165361g(this, "com/tencent/mm/ui/base/MMGridPaperGridView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMGridPaperGridView$b */
    public class C57663b implements AdapterView.OnItemLongClickListener {
        public C57663b() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            MMGridPaperGridView mMGridPaperGridView = MMGridPaperGridView.this;
            C116072d dVar = mMGridPaperGridView.f348254n;
            if (dVar == null) {
                Log.m105928w("MicroMsg.MMGridPaperGridView", "on item long click, but main adapter is null");
                return false;
            }
            int i2 = mMGridPaperGridView.f348250g;
            dVar.getClass();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMGridPaperGridView$c */
    public class C116067c extends BaseAdapter {
        public C116067c(C57662a aVar) {
        }

        public int getCount() {
            MMGridPaperGridView mMGridPaperGridView = MMGridPaperGridView.this;
            int i = mMGridPaperGridView.f348249f;
            if (i < 0 || mMGridPaperGridView.f348254n == null) {
                return 0;
            }
            return i;
        }

        public Object getItem(int i) {
            MMGridPaperGridView mMGridPaperGridView = MMGridPaperGridView.this;
            C116072d dVar = mMGridPaperGridView.f348254n;
            if (dVar == null) {
                return null;
            }
            return ((C118793a) dVar).f355422b.get(mMGridPaperGridView.f348250g + i);
        }

        public long getItemId(int i) {
            MMGridPaperGridView mMGridPaperGridView = MMGridPaperGridView.this;
            C116072d dVar = mMGridPaperGridView.f348254n;
            if (dVar == null) {
                return 0;
            }
            ((C118793a) dVar).getClass();
            return (long) (mMGridPaperGridView.f348250g + i);
        }

        public int getItemViewType(int i) {
            MMGridPaperGridView mMGridPaperGridView = MMGridPaperGridView.this;
            C116072d dVar = mMGridPaperGridView.f348254n;
            if (dVar == null) {
                return 0;
            }
            int i2 = mMGridPaperGridView.f348250g;
            dVar.getClass();
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            long currentTicks = Util.currentTicks();
            Object[] objArr = new Object[5];
            objArr[0] = Integer.valueOf(MMGridPaperGridView.this.f348247d);
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Boolean.valueOf(view == null);
            objArr[3] = viewGroup.toString();
            objArr[4] = Boolean.valueOf(MMGridPaperGridView.this.f348252i);
            Log.m105927v("MicroMsg.MMGridPaperGridView", "getView:index[%d], pos[%d], converrView is null[%B], parent is [%s], mClearMode[%B]", objArr);
            View view2 = null;
            View view3 = MMGridPaperGridView.this.f348252i ? null : view;
            if (MMGridPaperGridView.this.f348254n != null) {
                view2 = MMGridPaperGridView.this.f348254n.mo177354b(MMGridPaperGridView.this.f348250g + i, view3, viewGroup);
            }
            Assert.assertTrue(view2 != null);
            if (-1 == MMGridPaperGridView.this.f348251h || MMGridPaperGridView.this.f348250g + i != MMGridPaperGridView.this.f348251h) {
                C9556a aVar = new C9556a();
                C60958c.m71442b(0, aVar);
                View view4 = view2;
                C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/ui/base/MMGridPaperGridView$GridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/ui/base/MMGridPaperGridView$GridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                C9556a aVar2 = new C9556a();
                C60958c.m71442b(4, aVar2);
                View view5 = view2;
                C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/ui/base/MMGridPaperGridView$GridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/ui/base/MMGridPaperGridView$GridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            Log.m105927v("MicroMsg.MMGridPaperGridView", "get View ok: use %d ms, hidden index[%d], cur global index[%d]", Long.valueOf(Util.ticksToNow(currentTicks)), Integer.valueOf(MMGridPaperGridView.this.f348251h), Integer.valueOf(MMGridPaperGridView.this.f348250g + i));
            return view2;
        }

        public int getViewTypeCount() {
            C116072d dVar = MMGridPaperGridView.this.f348254n;
            if (dVar == null) {
                return 1;
            }
            dVar.getClass();
            return 1;
        }

        public boolean isEnabled(int i) {
            MMGridPaperGridView mMGridPaperGridView = MMGridPaperGridView.this;
            C116072d dVar = mMGridPaperGridView.f348254n;
            if (dVar == null) {
                return false;
            }
            int i2 = mMGridPaperGridView.f348250g;
            dVar.getClass();
            return true;
        }
    }

    public MMGridPaperGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public int getIndex() {
        return this.f348247d;
    }

    /* renamed from: h */
    public void mo177288h() {
        C116067c cVar = this.f348253j;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
        }
    }

    /* renamed from: i */
    public void mo177289i(int i, int i2, int i3, C116072d dVar) {
        Object[] objArr = new Object[4];
        boolean z = false;
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Integer.valueOf(i3);
        if (dVar == null) {
            z = true;
        }
        objArr[3] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.MMGridPaperGridView", "index[%d], rows[%d], columns[%d], adapter is null[%B]", objArr);
        this.f348247d = i;
        this.f348248e = i3;
        this.f348254n = dVar;
        int i4 = i2 * i3;
        this.f348249f = i4;
        this.f348250g = i * i4;
        if (dVar != null && dVar.mo177353a() - this.f348250g < this.f348249f) {
            this.f348249f = this.f348254n.mo177353a() - this.f348250g;
        }
        if (getAdapter() == null) {
            Log.m105928w("MicroMsg.MMGridPaperGridView", "get adapter null, new one");
            C116067c cVar = new C116067c((C57662a) null);
            this.f348253j = cVar;
            setAdapter(cVar);
        }
        setNumColumns(this.f348248e);
        setColumnWidth(3);
        setOnItemClickListener(this.f348255o);
        setOnItemLongClickListener(this.f348256p);
    }

    public void setClearMode(boolean z) {
        this.f348252i = z;
    }

    public void setHiddenIndex(int i) {
        this.f348251h = i;
    }

    public MMGridPaperGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
