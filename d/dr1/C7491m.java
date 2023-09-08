package dr1;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.NativeInfo;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C9556a;
import org.json.JSONException;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: dr1.m */
public final class C7491m extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C7489l f25727d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7491m(C7489l lVar) {
        super(0);
        this.f25727d = lVar;
    }

    public Object invoke() {
        NativeInfo nativeInfo;
        String str;
        C7489l lVar = this.f25727d;
        FinderJumpInfo finderJumpInfo = lVar.f25723d;
        if (!(finderJumpInfo == null || (nativeInfo = finderJumpInfo.native_info) == null || (str = nativeInfo.necessary_params) == null)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("productId");
                String optString2 = jSONObject.optString("name");
                Intent intent = new Intent();
                intent.setClassName(lVar.f25720a, "com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI");
                intent.putExtra("extra_id", optString);
                intent.putExtra("extra_name", optString2);
                intent.putExtra("preceding_scence", 0);
                AppCompatActivity appCompatActivity = lVar.f25720a;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/upload/postui/FinderEmojiWidget$showBottomSheet$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                appCompatActivity.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/finder/upload/postui/FinderEmojiWidget$showBottomSheet$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (JSONException unused) {
            }
        }
        return C13598b0.f38549a;
    }
}
