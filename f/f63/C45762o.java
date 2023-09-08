package f63;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.WcPayCashierDialog;
import com.tencent.p014mm.sdk.platformtools.Util;
import qo3.C77390c0;

/* renamed from: f63.o */
public class C45762o extends C77390c0 {

    /* renamed from: d */
    public View f123616d;

    /* renamed from: e */
    public TextView f123617e = ((TextView) this.f123616d.findViewById(C0966R.C0970id.f359571ll3));

    /* renamed from: f */
    public ImageView f123618f;

    /* renamed from: g */
    public ViewGroup f123619g = ((ViewGroup) this.f123616d.findViewById(C0966R.C0970id.lsb));

    public C45762o(Context context) {
        super(context, C0966R.style.a66);
        View inflate = View.inflate(getContext(), C0966R.C0971layout.ch8, (ViewGroup) null);
        this.f123616d = inflate;
        this.f123618f = (ImageView) inflate.findViewById(C0966R.C0970id.lsa);
        ImageView imageView = this.f123618f;
        int i = WcPayCashierDialog.f210409y0;
        Util.expandViewTouchArea(imageView, i, i, i, i);
        this.f123618f.setOnClickListener(new C45761n(this));
        setContentView(this.f123616d);
        setCanceledOnTouchOutside(false);
    }
}
