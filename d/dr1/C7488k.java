package dr1;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.view.FinderJumperView;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.List;
import k60.C60979d;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import sx3.C110818d0;
import up1.C27696y;

/* renamed from: dr1.k */
public final class C7488k implements C7478d0 {

    /* renamed from: a */
    public final AppCompatActivity f25716a;

    /* renamed from: b */
    public final FinderJumperView f25717b;

    /* renamed from: c */
    public FinderJumpInfo f25718c;

    /* renamed from: d */
    public List<? extends FinderJumpInfo> f25719d;

    public C7488k(AppCompatActivity appCompatActivity, FinderJumperView finderJumperView) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(finderJumperView, "chooseView");
        this.f25716a = appCompatActivity;
        this.f25717b = finderJumperView;
    }

    /* renamed from: a */
    public void mo8615a(List<? extends FinderJumpInfo> list) {
        String str;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        this.f25719d = list;
        String str2 = null;
        FinderJumpInfo finderJumpInfo = list != null ? (FinderJumpInfo) C110818d0.m150916N(list) : null;
        this.f25718c = finderJumpInfo;
        if (finderJumpInfo == null) {
            this.f25717b.setVisibility(8);
        } else {
            this.f25717b.setVisibility(0);
        }
        String str3 = "";
        this.f25717b.setDefaultTitle(str3);
        this.f25717b.setDefaultIconId(0);
        this.f25717b.setFilledIconId(0);
        this.f25717b.setOnClickListener((View.OnClickListener) null);
        FinderJumperView finderJumperView = this.f25717b;
        FinderJumpInfo finderJumpInfo2 = this.f25718c;
        if (!(finderJumpInfo2 == null || (str = finderJumpInfo2.wording) == null)) {
            str3 = str;
        }
        finderJumperView.mo4600c(str3, false);
        C60979d<C100810g0> f2 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2();
        FinderJumpInfo finderJumpInfo3 = this.f25718c;
        if (finderJumpInfo3 != null) {
            str2 = finderJumpInfo3.icon_url;
        }
        f2.mo85957c(new C11984n0(str2, C27696y.THUMB_IMAGE), this.f25717b.getIconDefaultIv(), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.LINK_THUMB));
    }

    /* renamed from: b */
    public List<FinderJumpInfo> mo8616b() {
        return this.f25719d;
    }
}
