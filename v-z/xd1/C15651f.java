package xd1;

import android.content.Context;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.view.HardTouchableLayout;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C11184p0;
import p910lj.C76701a;
import uo3.C78253a;

/* renamed from: xd1.f */
public final class C15651f implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C15644c f42317d;

    /* renamed from: e */
    public final /* synthetic */ TextView f42318e;

    /* renamed from: f */
    public final /* synthetic */ TextView f42319f;

    /* renamed from: xd1.f$a */
    public static final class C15652a implements View.OnCreateContextMenuListener {

        /* renamed from: d */
        public final /* synthetic */ C15644c f42320d;

        public C15652a(C15644c cVar) {
            this.f42320d = cVar;
        }

        public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            contextMenu.add(0, 0, 0, this.f42320d.getContext().getString(C0966R.string.f7936wt));
        }
    }

    /* renamed from: xd1.f$b */
    public static final class C15653b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ TextView f42321d;

        /* renamed from: e */
        public final /* synthetic */ TextView f42322e;

        /* renamed from: f */
        public final /* synthetic */ C15644c f42323f;

        public C15653b(TextView textView, TextView textView2, C15644c cVar) {
            this.f42321d = textView;
            this.f42322e = textView2;
            this.f42323f = cVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (i == 0) {
                StringBuilder sb = new StringBuilder();
                CharSequence text = this.f42321d.getText();
                CharSequence charSequence = "";
                if (text == null) {
                    text = charSequence;
                }
                sb.append(text);
                sb.append(' ');
                CharSequence text2 = this.f42322e.getText();
                if (text2 != null) {
                    charSequence = text2;
                }
                sb.append(charSequence);
                ClipboardHelper.setText(sb.toString());
                C76701a.makeText((Context) this.f42323f.getContext(), (int) C0966R.string.f7938wv, 0).show();
            }
        }
    }

    /* renamed from: xd1.f$c */
    public static final class C15654c implements PopupWindow.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ TextView f42324d;

        /* renamed from: e */
        public final /* synthetic */ C15644c f42325e;

        /* renamed from: f */
        public final /* synthetic */ TextView f42326f;

        public C15654c(TextView textView, C15644c cVar, TextView textView2) {
            this.f42324d = textView;
            this.f42325e = cVar;
            this.f42326f = textView2;
        }

        public final void onDismiss() {
            this.f42324d.setBackgroundColor(this.f42325e.getContext().getResources().getColor(C0966R.color.ahf));
            this.f42326f.setBackgroundColor(this.f42325e.getContext().getResources().getColor(C0966R.color.ahf));
        }
    }

    public C15651f(C15644c cVar, TextView textView, TextView textView2) {
        this.f42317d = cVar;
        this.f42318e = textView;
        this.f42319f = textView2;
    }

    public final boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/activity/poi/uic/FinderPoiHeaderUIC$initDrawerHeader$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C78253a aVar = new C78253a(this.f42317d.getContext(), view);
        C15644c cVar = this.f42317d;
        aVar.f229249r = new C15652a(cVar);
        TextView textView = this.f42319f;
        TextView textView2 = this.f42318e;
        aVar.f229251t = new C15653b(textView, textView2, cVar);
        aVar.f229227C = new C15654c(textView2, cVar, textView);
        textView2.setBackgroundColor(cVar.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_0_5));
        this.f42319f.setBackgroundColor(this.f42317d.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_0_5));
        int i = HardTouchableLayout.f165562q;
        boolean n = aVar.mo71743n(HardTouchableLayout.f165562q, HardTouchableLayout.f165563r);
        C117292a.m165362h(n, this, "com/tencent/mm/plugin/finder/activity/poi/uic/FinderPoiHeaderUIC$initDrawerHeader$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return n;
    }
}
