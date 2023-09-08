package rs1;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.view.FinderWordingLayout;
import com.tencent.p014mm.sdk.platformtools.Util;
import hi3.C87515a;
import ht1.C60200t1;
import java.util.List;
import jq3.C60905o;
import kg3.C76577a;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import rs1.C13181d3;
import te3.C48996cf1;
import te3.C49160dl;
import up1.C27696y;
import wp1.C15587j;

/* renamed from: rs1.l3 */
public final class C13313l3<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ FinderWordingLayout f37776d;

    /* renamed from: e */
    public final /* synthetic */ BaseFinderFeed f37777e;

    /* renamed from: f */
    public final /* synthetic */ C13181d3 f37778f;

    /* renamed from: g */
    public final /* synthetic */ C60905o f37779g;

    /* renamed from: h */
    public final /* synthetic */ boolean f37780h;

    public C13313l3(FinderWordingLayout finderWordingLayout, BaseFinderFeed baseFinderFeed, C13181d3 d3Var, C60905o oVar, boolean z) {
        this.f37776d = finderWordingLayout;
        this.f37777e = baseFinderFeed;
        this.f37778f = d3Var;
        this.f37779g = oVar;
        this.f37780h = z;
    }

    public void onChanged(Object obj) {
        String str;
        C49160dl dlVar = (C49160dl) obj;
        FinderWordingLayout finderWordingLayout = this.f37776d;
        BaseFinderFeed baseFinderFeed = this.f37777e;
        finderWordingLayout.mo4758a(baseFinderFeed, dlVar, new C13181d3.C13182a(this.f37778f, baseFinderFeed, this.f37779g), this.f37780h);
        if (this.f37780h && !Util.isNullOrNil((List) dlVar.f132389f)) {
            C13181d3 d3Var = this.f37778f;
            C60905o oVar = this.f37779g;
            d3Var.getClass();
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            C48996cf1 a = C15587j.f42215a.mo14349a("FinderObjectDynamicImageKey_FinderFavManageIcon");
            if (a == null || (str = a.f131694e) == null) {
                str = "";
            }
            Drawable e = C87515a.m108835e(oVar.f173499A.getResources(), C0966R.raw.finder_icons_outlined_star_self, 0.0f);
            int d = C76577a.m92153d(oVar.f173499A, C0966R.color.f3585yj);
            WeImageView weImageView = (WeImageView) oVar.mo85812D(C0966R.C0970id.f26);
            TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.f359286k04);
            View D = oVar.mo85812D(C0966R.C0970id.k07);
            if (str.length() == 0) {
                weImageView.setImageDrawable(e);
                weImageView.setIconColor(d);
            } else {
                weImageView.setLayerPaint((Paint) null);
                weImageView.setIconColor(0);
                C39818r rVar = C39818r.f106831a;
                ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85957c(new C11984n0(str, C27696y.RAW_IMAGE), weImageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.FAV_ICON));
                weImageView.setAlpha(0.8f);
            }
            textView.setTextColor(d);
            D.setEnabled(true);
        }
        this.f37776d.setSizeChangeListener(new C13242g3(this.f37778f, this.f37779g));
        FinderWordingLayout finderWordingLayout2 = this.f37776d;
        finderWordingLayout2.setItemRemoveListener(new C13270i3(dlVar, finderWordingLayout2, this.f37778f, this.f37779g));
        this.f37776d.setOnModeChangeListener(new C13296k3(this.f37779g, this.f37778f));
    }
}
