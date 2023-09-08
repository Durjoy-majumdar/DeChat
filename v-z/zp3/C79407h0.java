package zp3;

import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.view.SmileyPanelImpl;

/* renamed from: zp3.h0 */
public class C79407h0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FragmentActivity f232926d;

    /* renamed from: e */
    public final /* synthetic */ SmileyPanelImpl f232927e;

    public C79407h0(SmileyPanelImpl smileyPanelImpl, FragmentActivity fragmentActivity) {
        this.f232927e = smileyPanelImpl;
        this.f232926d = fragmentActivity;
    }

    public void run() {
        this.f232926d.getLifecycle().addObserver(this.f232927e);
    }
}
