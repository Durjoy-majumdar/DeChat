package cn1;

import an1.C0088a;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import er1.C7865r3;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import l31.C61212e;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import up1.C27696y;

/* renamed from: cn1.a */
public class C0804a extends C60896i<C0088a> {

    /* renamed from: f */
    public static final C0805a f1876f = new C0805a((C8480h) null);

    /* renamed from: g */
    public static final int f1877g = C74942w4.m89784a(MMApplicationContext.getContext(), 12);

    /* renamed from: h */
    public static final int f1878h = C7865r3.f26468a.mo8970c();

    /* renamed from: e */
    public final boolean f1879e;

    /* renamed from: cn1.a$a */
    public static final class C0805a {
        public C0805a(C8480h hVar) {
        }

        /* renamed from: a */
        public static final int m763a(C0805a aVar) {
            aVar.getClass();
            if (!C85875k4.m106157N()) {
                return C0804a.f1878h;
            }
            Context context = MMApplicationContext.getContext();
            return C74942w4.m89784a(context, context.getResources().getConfiguration().screenWidthDp);
        }
    }

    static {
        C74942w4.m89784a(MMApplicationContext.getContext(), 24);
    }

    public C0804a(boolean z) {
        this.f1879e = z;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cn_;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C0088a aVar = (C0088a) cVar;
        C11978e0.C11979a aVar2 = C11978e0.C11979a.DEFAULT;
        C27696y yVar = C27696y.THUMB_IMAGE;
        Class cls = C61212e.class;
        Class cls2 = C11990s0.class;
        Class<C60200t1> cls3 = C60200t1.class;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(aVar, "item");
        ViewGroup.LayoutParams layoutParams = oVar.f44854d.getLayoutParams();
        int i3 = 0;
        if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
            if (this.f1879e) {
                StaggeredGridLayoutManager.LayoutParams layoutParams2 = (StaggeredGridLayoutManager.LayoutParams) layoutParams;
                int i4 = f1877g;
                layoutParams2.leftMargin = i4;
                if (aVar.f523f != aVar.f524g - 1) {
                    i4 = 0;
                }
                layoutParams2.rightMargin = i4;
                layoutParams.width = C0805a.m763a(f1876f) - C74942w4.m89784a(oVar.f173499A, 24);
            } else {
                StaggeredGridLayoutManager.LayoutParams layoutParams3 = (StaggeredGridLayoutManager.LayoutParams) layoutParams;
                int i5 = f1877g;
                layoutParams3.leftMargin = i5;
                layoutParams3.rightMargin = i5;
                layoutParams.width = C0805a.m763a(f1876f);
            }
        }
        ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.m9y);
        String str = "";
        if (imageView != null) {
            String str2 = aVar.f521d.f133472e;
            if (str2 == null) {
                str2 = str;
            }
            C39818r rVar = C39818r.f106831a;
            ((C11990s0) rVar.mo62446e(cls3).mo62447c(cls2)).mo11871f2().mo85957c(new C11984n0(str2, yVar), imageView, ((C11990s0) rVar.mo62446e(cls3).mo62447c(cls2)).mo11867O2(aVar2));
        }
        ImageView imageView2 = (ImageView) oVar.mo85812D(C0966R.C0970id.m9z);
        if (imageView2 != null) {
            String str3 = aVar.f521d.f133473f;
            if (str3 != null) {
                str = str3;
            }
            C39818r rVar2 = C39818r.f106831a;
            ((C11990s0) rVar2.mo62446e(cls3).mo62447c(cls2)).mo11871f2().mo85957c(new C11984n0(str, yVar), imageView2, ((C11990s0) rVar2.mo62446e(cls3).mo62447c(cls2)).mo11867O2(aVar2));
        }
        View D = oVar.mo85812D(C0966R.C0970id.m_p);
        if (D != null) {
            try {
                i3 = Color.parseColor('#' + aVar.f521d.f133474g);
            } catch (Exception e) {
                Log.m105924i("Finder.AdConvert", "color Exception " + e);
            }
            D.setBackgroundColor(i3);
            D.setOnClickListener(new C0809b(aVar, oVar));
        }
        View D2 = oVar.mo85812D(C0966R.C0970id.m_p);
        ((C61212e) C86312j.m106911c(cls)).o30(D2, "live_square_banner_card");
        ((C61212e) C86312j.m106911c(cls)).mo86175pO(D2, 40, 25388);
        ((C61212e) C86312j.m106911c(cls)).mo86175pO(D2, 40, 26236);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        ViewGroup.LayoutParams layoutParams = oVar.f44854d.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f44911i = true;
        }
    }
}
