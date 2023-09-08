package rs1;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import cm1.C0772s;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderEmojiSelectUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderProfileUI;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.NativeInfo;
import gy3.C87412m;
import j20.C117292a;
import jq3.C60898l;
import jq3.C60905o;
import k20.C9556a;
import org.json.JSONObject;

/* renamed from: rs1.q1 */
public final class C13375q1 implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ C63599o1 f37890d;

    public C13375q1(C63599o1 o1Var) {
        this.f37890d = o1Var;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        C63599o1 o1Var = this.f37890d;
        o1Var.getClass();
        C0740i2 i2Var = (C0740i2) oVar.f173503E;
        if (!(i2Var instanceof C0772s)) {
            return;
        }
        if (o1Var.getActivity() instanceof FinderProfileUI) {
            Intent intent = new Intent();
            intent.setClassName(o1Var.getActivity(), "com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI");
            intent.putExtra("extra_id", ((C0772s) i2Var).f1814d.f298994d);
            intent.putExtra("preceding_scence", 106);
            intent.putExtra("download_entrance_scene", 35);
            AppCompatActivity activity = o1Var.getActivity();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            AppCompatActivity appCompatActivity = activity;
            C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderEmojiListUIC", "handleOnItemClick", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/finder/viewmodel/component/FinderEmojiListUIC", "handleOnItemClick", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (o1Var.getActivity() instanceof FinderEmojiSelectUI) {
            FinderJumpInfo finderJumpInfo = new FinderJumpInfo();
            finderJumpInfo.jumpinfo_type = 3;
            finderJumpInfo.business_type = 6;
            C0772s sVar = (C0772s) i2Var;
            finderJumpInfo.wording = sVar.f1814d.f298996f;
            finderJumpInfo.recommend_reason = "表情专辑";
            finderJumpInfo.source = 1;
            NativeInfo nativeInfo = new NativeInfo();
            nativeInfo.native_type = 6;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("productId", sVar.f1814d.f298994d);
            jSONObject.put("name", sVar.f1814d.f298996f);
            nativeInfo.necessary_params = jSONObject.toString();
            finderJumpInfo.native_info = nativeInfo;
            Intent intent2 = new Intent();
            intent2.putExtra("JUMP_INFO", finderJumpInfo.toByteArray());
            o1Var.getActivity().setResult(-1, intent2);
            o1Var.getActivity().finish();
        }
    }
}
