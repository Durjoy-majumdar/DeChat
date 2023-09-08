package lq1;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.uniComments.UniCommentDrawer;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import fo1.C59264a;
import qq1.C63317a;
import sq1.C64147b;
import sq1.C64151e;

/* renamed from: lq1.h */
public interface C61364h extends C59264a<C61356g0> {
    /* renamed from: B0 */
    void mo79225B0(UniCommentDrawer uniCommentDrawer, C61356g0 g0Var, C63317a aVar, C61355g gVar, int i, boolean z, long j, C64147b bVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6);

    /* renamed from: C */
    boolean mo79226C(C64151e eVar, boolean z);

    /* renamed from: a */
    RecyclerView.C0129l mo79230a(Context context);

    /* renamed from: c */
    WxRecyclerAdapter<?> mo79231c(Context context);

    /* renamed from: f */
    void mo79233f(View view, int i);

    /* renamed from: g */
    int mo79235g();

    int getCommentScene();

    /* renamed from: h */
    boolean mo79237h();

    /* renamed from: i0 */
    void mo79238i0(C64151e eVar, boolean z);

    /* renamed from: m1 */
    void mo79240m1(View view, C64151e eVar);

    /* renamed from: p */
    int mo79242p();

    /* renamed from: r */
    void mo79243r(ImageView imageView, int i);

    /* renamed from: s */
    int mo79244s();

    /* renamed from: u */
    C63317a mo79245u();

    /* renamed from: u1 */
    void mo79247u1(int i);

    /* renamed from: v */
    C64151e mo79248v(long j);
}
