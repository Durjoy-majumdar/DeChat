package gi2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import nh2.C109741a;
import rx3.C13598b0;
import vg2.C78414c;

/* renamed from: gi2.c */
public final class C107811c {

    /* renamed from: a */
    public GridView f322629a;

    /* renamed from: b */
    public int f322630b = -1;

    /* renamed from: c */
    public final ArrayList<C107814b> f322631c = new ArrayList<>();

    /* renamed from: d */
    public C107812a f322632d;

    /* renamed from: e */
    public final int f322633e = 24;

    /* renamed from: f */
    public C32226l<? super Integer, C13598b0> f322634f;

    /* renamed from: gi2.c$a */
    public final class C107812a extends BaseAdapter {

        /* renamed from: d */
        public ArrayList<C107814b> f322635d;

        /* renamed from: e */
        public C107815c f322636e;

        /* renamed from: f */
        public final /* synthetic */ C107811c f322637f;

        /* renamed from: gi2.c$a$a */
        public static final class C107813a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C107812a f322638d;

            public C107813a(C107812a aVar) {
                this.f322638d = aVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/recordvideo/ui/editor/view/EditorTextColorSelector$ColorResourceAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (view instanceof C109741a) {
                    Object tag = view.getTag();
                    C87412m.m108592e(tag, "null cannot be cast to non-null type kotlin.Int");
                    int intValue = ((Integer) tag).intValue();
                    C107815c cVar = this.f322638d.f322636e;
                    if (cVar != null) {
                        cVar.mo158222a(intValue);
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/ui/editor/view/EditorTextColorSelector$ColorResourceAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C107812a(C107811c cVar, ArrayList<C107814b> arrayList) {
            C87412m.m108594g(arrayList, "resourceList");
            this.f322637f = cVar;
            this.f322635d = arrayList;
        }

        public int getCount() {
            return this.f322635d.size();
        }

        public Object getItem(int i) {
            C107814b bVar = this.f322635d.get(i);
            C87412m.m108593f(bVar, "resourceList[position]");
            return bVar;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C87412m.m108591d(viewGroup);
            Context context = viewGroup.getContext();
            C87412m.m108593f(context, "parent!!.context");
            C109741a aVar = new C109741a(context, (AttributeSet) null, false);
            C107814b bVar = (C107814b) getItem(i);
            aVar.setDrawColor(bVar.f322639a);
            C78414c.f229758a.mo108365b(aVar, bVar.f322639a);
            int b = C76577a.m92151b(aVar.getContext(), this.f322637f.f322633e);
            aVar.setLayoutParams(new AbsListView.LayoutParams(b, b));
            aVar.setTag(Integer.valueOf(i));
            aVar.setOnClickListener(new C107813a(this));
            if (i == this.f322637f.f322630b) {
                aVar.setHasSelected(true);
            } else {
                aVar.setHasSelected(false);
            }
            return aVar;
        }
    }

    /* renamed from: gi2.c$b */
    public static final class C107814b {

        /* renamed from: a */
        public int f322639a;
    }

    /* renamed from: gi2.c$c */
    public interface C107815c {
        /* renamed from: a */
        void mo158222a(int i);
    }

    public C107811c(GridView gridView) {
        C87412m.m108594g(gridView, "view");
        this.f322629a = gridView;
    }
}
