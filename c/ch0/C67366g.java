package ch0;

import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.address.p879ui.InvoiceQrcodeTextView;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C11184p0;
import nj3.C76879j;
import uo3.C78253a;

/* renamed from: ch0.g */
public class C67366g implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ InvoiceQrcodeTextView f193225d;

    /* renamed from: ch0.g$a */
    public class C67367a implements View.OnCreateContextMenuListener {

        /* renamed from: d */
        public final /* synthetic */ TextView f193226d;

        public C67367a(C67366g gVar, TextView textView) {
            this.f193226d = textView;
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            contextMenu.add(this.f193226d.getContext().getString(C0966R.string.f7936wt));
        }
    }

    /* renamed from: ch0.g$b */
    public class C67368b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ TextView f193227d;

        public C67368b(C67366g gVar, TextView textView) {
            this.f193227d = textView;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (i == 0) {
                ClipboardHelper.setText(this.f193227d.getText().toString());
                C76879j.m92729W(this.f193227d.getContext(), this.f193227d.getContext().getString(C0966R.string.f7938wv));
            }
        }
    }

    /* renamed from: ch0.g$c */
    public class C67369c implements PopupWindow.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ TextView f193228d;

        /* renamed from: e */
        public final /* synthetic */ CharSequence f193229e;

        public C67369c(C67366g gVar, TextView textView, CharSequence charSequence) {
            this.f193228d = textView;
            this.f193229e = charSequence;
        }

        public void onDismiss() {
            this.f193228d.setText(this.f193229e);
        }
    }

    public C67366g(InvoiceQrcodeTextView invoiceQrcodeTextView) {
        this.f193225d = invoiceQrcodeTextView;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/address/ui/InvoiceQrcodeTextView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        TextView textView = (TextView) view;
        if (textView.getText() != null) {
            CharSequence text = textView.getText();
            SpannableString spannableString = new SpannableString(text);
            spannableString.setSpan(new BackgroundColorSpan(textView.getContext().getResources().getColor(C0966R.color.a16)), 0, text.length(), 33);
            textView.setText(spannableString);
            C78253a aVar = new C78253a(textView.getContext(), textView);
            aVar.f229249r = new C67367a(this, textView);
            aVar.f229251t = new C67368b(this, textView);
            aVar.f229227C = new C67369c(this, textView, text);
            InvoiceQrcodeTextView invoiceQrcodeTextView = this.f193225d;
            aVar.mo71743n(invoiceQrcodeTextView.f196896s, invoiceQrcodeTextView.f196897t);
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/address/ui/InvoiceQrcodeTextView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
