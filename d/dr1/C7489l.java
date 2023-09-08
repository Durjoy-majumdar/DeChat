package dr1;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import bt1.C0378f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.FinderEmojiChooseView;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dp1.C7435f2;
import fe1.C58969q;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import qo3.C77407n;
import rs1.C13442s8;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C49712hj1;

/* renamed from: dr1.l */
public final class C7489l implements C7478d0 {

    /* renamed from: a */
    public final AppCompatActivity f25720a;

    /* renamed from: b */
    public final FinderEmojiChooseView f25721b;

    /* renamed from: c */
    public final C49712hj1 f25722c;

    /* renamed from: d */
    public FinderJumpInfo f25723d;

    /* renamed from: e */
    public List<? extends FinderJumpInfo> f25724e;

    /* renamed from: f */
    public C32224a<C13598b0> f25725f;

    /* renamed from: dr1.l$a */
    public static final class C7490a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C7489l f25726d;

        public C7490a(C7489l lVar) {
            this.f25726d = lVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/upload/postui/FinderEmojiWidget$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7489l lVar = this.f25726d;
            if (lVar.f25723d != null) {
                AppCompatActivity appCompatActivity = lVar.f25720a;
                C7491m mVar = new C7491m(lVar);
                C7492n nVar = new C7492n(lVar);
                C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                C0378f.C0379a aVar = new C0378f.C0379a(appCompatActivity);
                C0378f.C0380b bVar = new C0378f.C0380b(mVar, nVar, (C32224a<C13598b0>) null);
                C77407n nVar2 = new C77407n((Context) appCompatActivity, 1, true);
                nVar2.f225771i = aVar;
                nVar2.f225782p = bVar;
                nVar2.f225795v = null;
                nVar2.mo107573q();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/upload/postui/FinderEmojiWidget$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C7489l(AppCompatActivity appCompatActivity, FinderEmojiChooseView finderEmojiChooseView) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(finderEmojiChooseView, "emojiChooseView");
        this.f25720a = appCompatActivity;
        this.f25721b = finderEmojiChooseView;
        this.f25722c = ((C13442s8) C39818r.f106831a.mo62444c(appCompatActivity).mo75002a(C13442s8.class)).mo12861q3();
    }

    /* renamed from: a */
    public void mo8615a(List<? extends FinderJumpInfo> list) {
        this.f25724e = list;
        this.f25723d = list != null ? (FinderJumpInfo) C110818d0.m150916N(list) : null;
        if (!C0378f.m323a(C0378f.f979a, (C58969q) null, 1, (Object) null)) {
            this.f25721b.setVisibility(8);
            return;
        }
        if (this.f25721b.getVisibility() != 0) {
            this.f25721b.setVisibility(0);
            C49712hj1 hj12 = this.f25722c;
            hj12.f134675i = 74;
            C7435f2.f25626a.mo8577a(hj12, "button_post_choose_emoji", 0, (JSONObject) null);
        }
        mo8629c();
        this.f25721b.setOnClickListener(new C7490a(this));
    }

    /* renamed from: b */
    public List<FinderJumpInfo> mo8616b() {
        return this.f25724e;
    }

    /* renamed from: c */
    public final void mo8629c() {
        C13598b0 b0Var;
        FinderJumpInfo finderJumpInfo = this.f25723d;
        if (finderJumpInfo != null) {
            FinderEmojiChooseView finderEmojiChooseView = this.f25721b;
            String str = finderJumpInfo.wording;
            String string = finderEmojiChooseView.getResources().getString(C0966R.string.ei8);
            C87412m.m108593f(string, "resources.getString(R.st…finder_post_emoji_choose)");
            finderEmojiChooseView.getIconIv().setIconColor(finderEmojiChooseView.getContext().getResources().getColor(C0966R.color.f2960ag));
            TextView descTv = finderEmojiChooseView.getDescTv();
            descTv.setText(string + 65306 + str);
            finderEmojiChooseView.getDescTv().setTextColor(finderEmojiChooseView.getContext().getResources().getColor(C0966R.color.f2960ag));
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            FinderEmojiChooseView finderEmojiChooseView2 = this.f25721b;
            finderEmojiChooseView2.getIconIv().setVisibility(0);
            finderEmojiChooseView2.getIconIv().setIconColor(finderEmojiChooseView2.getContext().getResources().getColor(C0966R.color.FG_0));
            finderEmojiChooseView2.getDescTv().setText(finderEmojiChooseView2.getResources().getString(C0966R.string.ei8));
            finderEmojiChooseView2.getDescTv().setTextColor(finderEmojiChooseView2.getContext().getResources().getColor(C0966R.color.a7f));
        }
    }
}
