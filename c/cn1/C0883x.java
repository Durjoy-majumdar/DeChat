package cn1;

import an1.C0096i;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import te3.C51942x91;
import up1.C27696y;

/* renamed from: cn1.x */
public class C0883x extends C60896i<C0096i> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.d6r;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        String str;
        ImageView imageView;
        String str2;
        C0096i iVar = (C0096i) cVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(iVar, "item");
        oVar.f44854d.setTag(Integer.valueOf(i));
        oVar.f173502D = iVar;
        C51942x91 x912 = iVar.f534d.f131576d;
        if (x912 != null && x912.f144531d == 0) {
            WeImageView weImageView = (WeImageView) oVar.mo85812D(C0966R.C0970id.m4t);
            if (weImageView != null) {
                weImageView.setVisibility(0);
                return;
            }
            return;
        }
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.lkb);
        if (textView != null) {
            C51942x91 x913 = iVar.f534d.f131576d;
            if (x913 == null || (str2 = x913.f144532e) == null) {
                str2 = "";
            }
            textView.setText(str2);
        }
        C51942x91 x914 = iVar.f534d.f131576d;
        if (x914 != null && (str = x914.f144540p) != null && (imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.lc4)) != null) {
            C39818r rVar = C39818r.f106831a;
            ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85957c(new C11984n0(str, C27696y.RAW_IMAGE), imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.DEFAULT));
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
