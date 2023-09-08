package fn2;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import fy3.C32226l;
import gy3.C87412m;
import in2.C9212e;
import rx3.C13598b0;

/* renamed from: fn2.d */
public final class C8175d extends C9212e {

    /* renamed from: e */
    public TextView f27067e;

    /* renamed from: f */
    public MMSwitchBtn f27068f;

    /* renamed from: g */
    public boolean f27069g;

    /* renamed from: h */
    public C32226l<? super Boolean, C13598b0> f27070h;

    /* renamed from: i */
    public String f27071i = "";

    /* renamed from: fn2.d$a */
    public static final class C8176a implements MMSwitchBtn.C7041b {

        /* renamed from: a */
        public final /* synthetic */ C8175d f27072a;

        public C8176a(C8175d dVar) {
            this.f27072a = dVar;
        }

        public final void onStatusChange(boolean z) {
            C8175d dVar = this.f27072a;
            dVar.f27069g = z;
            C32226l<? super Boolean, C13598b0> lVar = dVar.f27070h;
            if (lVar != null) {
                lVar.invoke(Boolean.valueOf(z));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8175d(String str) {
        super(str);
        C87412m.m108594g(str, "key");
    }

    /* renamed from: a */
    public int mo9229a() {
        return C0966R.C0971layout.f7208x7;
    }

    /* renamed from: c */
    public void mo9230c(View view) {
        C87412m.m108594g(view, "view");
        this.f27067e = (TextView) view.findViewById(C0966R.C0970id.f359338op3);
        this.f27068f = (MMSwitchBtn) view.findViewById(C0966R.C0970id.f359332op0);
        mo9232e();
    }

    /* renamed from: d */
    public final void mo9231d(String str) {
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f27071i = str;
        mo9232e();
    }

    /* renamed from: e */
    public final void mo9232e() {
        TextView textView = this.f27067e;
        if (textView != null) {
            textView.setText(this.f27071i);
        }
        MMSwitchBtn mMSwitchBtn = this.f27068f;
        if (mMSwitchBtn != null) {
            mMSwitchBtn.setCheck(this.f27069g);
        }
        MMSwitchBtn mMSwitchBtn2 = this.f27068f;
        if (mMSwitchBtn2 != null) {
            mMSwitchBtn2.setSwitchListener(new C8176a(this));
        }
    }
}
