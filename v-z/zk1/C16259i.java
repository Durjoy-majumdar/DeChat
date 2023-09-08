package zk1;

import android.content.Intent;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C48722aj0;
import te3.C49098d51;

/* renamed from: zk1.i */
public final class C16259i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C48722aj0 f43535d;

    /* renamed from: e */
    public final /* synthetic */ C16229h f43536e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16259i(C48722aj0 aj02, C16229h hVar) {
        super(0);
        this.f43535d = aj02;
        this.f43536e = hVar;
    }

    public Object invoke() {
        Intent intent = new Intent();
        C49098d51 d512 = this.f43535d.f130563e;
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_INFO", d512 != null ? d512.toByteArray() : null);
        this.f43536e.getActivity().setResult(-1, intent);
        this.f43536e.getActivity().finish();
        this.f43536e.getActivity().overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2493eh);
        return C13598b0.f38549a;
    }
}
