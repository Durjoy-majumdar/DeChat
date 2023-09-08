package d60;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import d60.C58124b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: d60.x */
public final class C7230x extends C58121a implements View.OnClickListener {

    /* renamed from: f */
    public final C58124b f25292f;

    /* renamed from: g */
    public final TextView f25293g;

    /* renamed from: h */
    public final TextView f25294h;

    /* renamed from: i */
    public final ImageView f25295i;

    /* renamed from: d60.x$a */
    public /* synthetic */ class C7231a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25296a;

        static {
            int[] iArr = new int[C58124b.C58125b.values().length];
            C58124b.C58125b bVar = C58124b.C58125b.UNKNOWN;
            iArr[58] = 1;
            f25296a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7230x(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f25292f = bVar;
        this.f25293g = (TextView) viewGroup.findViewById(C0966R.C0970id.ftp);
        TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.ftn);
        this.f25294h = textView;
        this.f25295i = (ImageView) viewGroup.findViewById(C0966R.C0970id.fto);
        ((WeImageView) viewGroup.findViewById(C0966R.C0970id.ftl)).setOnClickListener(this);
        ((Button) viewGroup.findViewById(C0966R.C0970id.ftm)).setOnClickListener(this);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/live/plugin/LiveExceptionPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        boolean z = true;
        if ((valueOf == null || valueOf.intValue() != C0966R.C0970id.ftl) && (valueOf == null || valueOf.intValue() != C0966R.C0970id.ftm)) {
            z = false;
        }
        if (z) {
            C58124b.C7172a.m7372a(this.f25292f, C58124b.C58125b.QUIT_LIVE, (Bundle) null, 2, (Object) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveExceptionPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        if (C7231a.f25296a[bVar.ordinal()] == 1) {
            Drawable drawable = null;
            String string = bundle != null ? bundle.getString("PARAM_LIVE_EXCEPTION_TITLE") : null;
            CharSequence charSequence = bundle != null ? bundle.getCharSequence("PARAM_LIVE_EXCEPTION_DESC") : null;
            Integer valueOf = bundle != null ? Integer.valueOf(bundle.getInt("PARAM_LIVE_EXCEPTION_ICON_RES")) : null;
            if (!(valueOf == null || valueOf.intValue() == 0)) {
                drawable = this.f166287d.getContext().getResources().getDrawable(valueOf.intValue());
            }
            this.f25293g.setText(string);
            this.f25294h.setText(charSequence, TextView.BufferType.SPANNABLE);
            this.f25295i.setImageDrawable(drawable);
        }
    }
}
