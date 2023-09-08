package to3;

import com.tencent.p014mm.p136ui.C85975v4;
import com.tencent.p014mm.p136ui.widget.listview.PullDownListView;

/* renamed from: to3.a */
public class C78076a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ PullDownListView f228855d;

    public C78076a(PullDownListView pullDownListView) {
        this.f228855d = pullDownListView;
    }

    public void run() {
        C85975v4.m106304a("MicroMsg.PullDownListView", "mThis.getLeft()=%s, mThis.getTop()=%s, mThis.getRight()=%s, mThis.getBottom()=%s", Integer.valueOf(this.f228855d.f220660s.getLeft()), Integer.valueOf(this.f228855d.f220660s.getTop()), Integer.valueOf(this.f228855d.f220660s.getRight()), Integer.valueOf(this.f228855d.f220660s.getBottom()));
        PullDownListView pullDownListView = this.f228855d;
        pullDownListView.f220663v.set(pullDownListView.f220660s.getLeft(), this.f228855d.f220660s.getTop(), this.f228855d.f220660s.getRight(), this.f228855d.f220660s.getBottom());
    }
}
