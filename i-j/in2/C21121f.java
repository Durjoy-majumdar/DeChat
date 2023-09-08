package in2;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: in2.f */
public final class C21121f extends C9212e {

    /* renamed from: e */
    public boolean f59716e;

    /* renamed from: f */
    public TextView f59717f;

    /* renamed from: g */
    public MMSwitchBtn f59718g;

    /* renamed from: h */
    public C32226l<? super Boolean, C13598b0> f59719h;

    /* renamed from: i */
    public String f59720i = "";

    /* renamed from: j */
    public boolean f59721j = true;

    /* renamed from: in2.f$a */
    public static final class C21122a implements MMSwitchBtn.C7041b {

        /* renamed from: a */
        public final /* synthetic */ C21121f f59722a;

        public C21122a(C21121f fVar) {
            this.f59722a = fVar;
        }

        public final void onStatusChange(boolean z) {
            C21121f fVar = this.f59722a;
            fVar.f59716e = z;
            C32226l<? super Boolean, C13598b0> lVar = fVar.f59719h;
            if (lVar != null) {
                lVar.invoke(Boolean.valueOf(z));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21121f(String str, boolean z) {
        super(str);
        C87412m.m108594g(str, "key");
        this.f59716e = z;
    }

    /* renamed from: a */
    public int mo9229a() {
        return C0966R.C0971layout.f7208x7;
    }

    /* renamed from: c */
    public void mo9230c(View view) {
        C87412m.m108594g(view, "view");
        this.f59717f = (TextView) view.findViewById(C0966R.C0970id.f359338op3);
        this.f59718g = (MMSwitchBtn) view.findViewById(C0966R.C0970id.f359332op0);
        mo32903e();
    }

    /* renamed from: d */
    public final void mo32902d(boolean z) {
        this.f59716e = z;
        mo32903e();
    }

    /* renamed from: e */
    public final void mo32903e() {
        TextView textView = this.f59717f;
        if (textView != null) {
            textView.setText(this.f59720i);
        }
        MMSwitchBtn mMSwitchBtn = this.f59718g;
        if (mMSwitchBtn != null) {
            mMSwitchBtn.setCheck(this.f59716e);
        }
        MMSwitchBtn mMSwitchBtn2 = this.f59718g;
        if (mMSwitchBtn2 != null) {
            mMSwitchBtn2.setSwitchListener(new C21122a(this));
        }
        MMSwitchBtn mMSwitchBtn3 = this.f59718g;
        if (mMSwitchBtn3 != null) {
            mMSwitchBtn3.setEnabled(this.f59721j);
        }
    }
}
