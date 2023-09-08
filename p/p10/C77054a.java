package p10;

import com.tencent.p014mm.framework.app.UIPageFragmentActivity;
import com.tenpay.android.wechat.OnPasswdInputListener;
import com.tenpay.android.wechat.TenpaySecureEditText;
import tc2.C118418g;

/* renamed from: p10.a */
public class C77054a implements OnPasswdInputListener {

    /* renamed from: a */
    public final /* synthetic */ TenpaySecureEditText f225097a;

    /* renamed from: b */
    public final /* synthetic */ UIPageFragmentActivity f225098b;

    public C77054a(UIPageFragmentActivity uIPageFragmentActivity, TenpaySecureEditText tenpaySecureEditText) {
        this.f225098b = uIPageFragmentActivity;
        this.f225097a = tenpaySecureEditText;
    }

    public void onDone() {
        C118418g gVar = C118418g.INSTANCE;
        if (this.f225097a.getEditState() == TenpaySecureEditText.EditState.PASSWORD) {
            UIPageFragmentActivity uIPageFragmentActivity = this.f225098b;
            int i = UIPageFragmentActivity.f195305u;
            uIPageFragmentActivity.getClass();
            gVar.mo175817ev(true);
            return;
        }
        UIPageFragmentActivity uIPageFragmentActivity2 = this.f225098b;
        int i2 = UIPageFragmentActivity.f195305u;
        uIPageFragmentActivity2.getClass();
        gVar.mo175817ev(false);
    }
}
