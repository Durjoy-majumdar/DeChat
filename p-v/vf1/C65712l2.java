package vf1;

import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveDelManagerUI;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import java.util.Iterator;
import rx3.C13598b0;
import te3.C49765hx0;
import te3.C51934x71;

/* renamed from: vf1.l2 */
public final class C65712l2 extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveDelManagerUI f189058d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65712l2(FinderLiveDelManagerUI finderLiveDelManagerUI) {
        super(1);
        this.f189058d = finderLiveDelManagerUI;
    }

    public Object invoke(Object obj) {
        C49765hx0 hx02;
        T t;
        String str = (String) obj;
        C87412m.m108594g(str, "username");
        Iterator<T> it = this.f189058d.f158991i.iterator();
        while (true) {
            hx02 = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C87412m.m108589b(((C51934x71) t).f144501d, str)) {
                break;
            }
        }
        C51934x71 x712 = (C51934x71) t;
        if (x712 != null) {
            hx02 = x712.f144503f;
        }
        C49765hx0 hx03 = hx02;
        if (hx03 != null) {
            FinderContact finderContact = hx03.f134919d;
            if (finderContact != null) {
                finderContact.username = str;
            }
            FinderLiveDelManagerUI finderLiveDelManagerUI = this.f189058d;
            FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget = finderLiveDelManagerUI.f158990h;
            if (finderLiveMemebrProfileWidget != null) {
                C39818r rVar = C39818r.f106831a;
                AppCompatActivity context = finderLiveDelManagerUI.getContext();
                C87412m.m108593f(context, "context");
                FinderLiveMemebrProfileWidget.m3151B(finderLiveMemebrProfileWidget, hx03, 4, ((C60172g4) rVar.mo62444c(context).mo62447c(C60172g4.class)).mo12861q3(), false, (String) null, 16, (Object) null);
            }
        }
        return C13598b0.f38549a;
    }
}
