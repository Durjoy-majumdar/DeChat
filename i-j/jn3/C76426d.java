package jn3;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import java.util.ArrayList;
import jq3.C9493c;
import jq3.C9500j;

/* renamed from: jn3.d */
public final class C76426d extends WxRecyclerAdapter<C9493c> {

    /* renamed from: G */
    public final /* synthetic */ ChatTipsBarGroup f223752G;

    /* renamed from: jn3.d$a */
    public static final class C76427a extends RecyclerView.C16615g {
        /* renamed from: b */
        public void mo2556b() {
            Log.m105918d("MicroMsg.ChatTipsBarGroup", "onChanged() called");
        }

        /* renamed from: c */
        public void mo2557c(int i, int i2) {
            Log.m105918d("MicroMsg.ChatTipsBarGroup", "onItemRangeChanged() called with: positionStart = " + i + ", itemCount = " + i2);
        }

        /* renamed from: d */
        public void mo2558d(int i, int i2, Object obj) {
            mo2557c(i, i2);
            Log.m105918d("MicroMsg.ChatTipsBarGroup", "onItemRangeChanged() called with: positionStart = " + i + ", itemCount = " + i2 + ", payload = " + obj);
        }

        /* renamed from: e */
        public void mo2559e(int i, int i2) {
            Log.m105918d("MicroMsg.ChatTipsBarGroup", "onItemRangeInserted() called with: positionStart = " + i + ", itemCount = " + i2);
        }

        /* renamed from: f */
        public void mo17312f(int i, int i2, int i3) {
            Log.m105918d("MicroMsg.ChatTipsBarGroup", "onItemRangeMoved() called with: fromPosition = " + i + ", toPosition = " + i2 + ", itemCount = " + i3);
        }

        /* renamed from: g */
        public void mo2560g(int i, int i2) {
            Log.m105918d("MicroMsg.ChatTipsBarGroup", "onItemRangeRemoved() called with: positionStart = " + i + ", itemCount = " + i2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76426d(ChatTipsBarGroup chatTipsBarGroup, C9500j jVar, ArrayList<C9493c> arrayList) {
        super(jVar, arrayList, false);
        this.f223752G = chatTipsBarGroup;
        registerAdapterDataObserver(new C76427a());
    }

    /* renamed from: F4 */
    public int mo82597F4() {
        int F4 = super.mo82597F4();
        if (this.f223752G.f219962p.f219973a != ChatTipsBarGroup.C74824c.MODE_FOLD || F4 <= 1) {
            return F4;
        }
        return 1;
    }
}
