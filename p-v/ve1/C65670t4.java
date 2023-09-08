package ve1;

import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C55036w0;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import te3.C64848y91;

/* renamed from: ve1.t4 */
public final class C65670t4 extends C60896i<C55036w0> {

    /* renamed from: e */
    public C64848y91 f188954e;

    public C65670t4(C64848y91 y912) {
        this.f188954e = y912;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.akb;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        String str;
        C64848y91 y912;
        C64848y91 y913;
        C55036w0 w0Var = (C55036w0) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(w0Var, "item");
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.dzz);
        TextView textView2 = (TextView) oVar.mo85812D(C0966R.C0970id.dzx);
        if (textView2 != null) {
            textView2.setText(w0Var.f154513d.f186454e);
        }
        C64848y91 y914 = this.f188954e;
        if (y914 != null) {
            int i3 = y914.f186453d;
            if (!(i3 == -1)) {
                if (i3 == w0Var.f154513d.f186453d) {
                    C64848y91 y915 = y914.f186456g;
                    String str2 = null;
                    if (y915 != null && y915.f186457h == 1) {
                        Context context = textView.getContext();
                        Object[] objArr = new Object[1];
                        StringBuilder sb = new StringBuilder();
                        C64848y91 y916 = this.f188954e;
                        sb.append(y916 != null ? y916.f186454e : null);
                        sb.append('-');
                        C64848y91 y917 = this.f188954e;
                        if (!(y917 == null || (y913 = y917.f186456g) == null)) {
                            str2 = y913.f186454e;
                        }
                        sb.append(str2);
                        objArr[0] = sb.toString();
                        str = context.getString(C0966R.string.e8x, objArr);
                    } else {
                        Context context2 = textView.getContext();
                        Object[] objArr2 = new Object[1];
                        C64848y91 y918 = this.f188954e;
                        if (!(y918 == null || (y912 = y918.f186456g) == null)) {
                            str2 = y912.f186454e;
                        }
                        objArr2[0] = str2;
                        str = context2.getString(C0966R.string.e8x, objArr2);
                    }
                    C87412m.m108593f(str, "if (selectedTagInfo?.cho…?.tag_name)\n            }");
                    textView.setVisibility(0);
                    textView.setText(str);
                    return;
                }
            }
        }
        textView.setVisibility(8);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
