package com.tencent.p014mm.plugin.textstatus.p112ui;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import cz2.C45238o;
import cz2.C45240p;
import cz2.C7154j;
import cz2.C75314h;
import fy3.C32224a;
import gy3.C87413o;
import java.util.Iterator;
import jq3.C60896i;
import jq3.C9493c;
import jq3.C9500j;
import kotlin.Metadata;
import qz2.C36226f;
import rx3.C13598b0;
import sx3.C64197v;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$buildItemConverts$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$buildItemConverts$1 */
public final class TextStatusDoWhatActivityV2$buildItemConverts$1 implements C9500j {
    public final /* synthetic */ TextStatusDoWhatActivityV2 this$0;

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$buildItemConverts$1$a */
    public static final class C71387a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusDoWhatActivityV2 f206864d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71387a(TextStatusDoWhatActivityV2$buildItemConverts$1 textStatusDoWhatActivityV2$buildItemConverts$1, TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
            super(0);
            this.f206864d = textStatusDoWhatActivityV2;
        }

        public Object invoke() {
            RecyclerView.C16613e adapter;
            Iterator<C9493c> it = this.f206864d.f206823Y.iterator();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C9493c next = it.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C64197v.m75542k();
                    throw null;
                } else if (next instanceof C36226f) {
                    i = i2;
                    break;
                } else {
                    i2 = i3;
                }
            }
            this.f206864d.f206823Y.remove(i);
            WxRecyclerView wxRecyclerView = this.f206864d.f206825d;
            if (!(wxRecyclerView == null || (adapter = wxRecyclerView.getAdapter()) == null)) {
                adapter.notifyItemRemoved(i);
            }
            return C13598b0.f38549a;
        }
    }

    public TextStatusDoWhatActivityV2$buildItemConverts$1(TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        this.this$0 = textStatusDoWhatActivityV2;
    }

    public C60896i<?> getItemConvert(int i) {
        if (i == -1) {
            return new C7154j();
        }
        if (i == 2) {
            TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.this$0;
            return new C45240p(textStatusDoWhatActivityV2.f206844x0, new C71387a(this, textStatusDoWhatActivityV2));
        } else if (i == 3) {
            return new C45238o(this.this$0.f206835p0);
        } else {
            if (i != 4) {
                return new C45238o(this.this$0.f206835p0);
            }
            TextStatusDoWhatActivityV2 textStatusDoWhatActivityV22 = this.this$0;
            return new C75314h(textStatusDoWhatActivityV22.f206809Q0, textStatusDoWhatActivityV22.f206846y0);
        }
    }
}
