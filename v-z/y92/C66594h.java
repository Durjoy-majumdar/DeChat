package y92;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.MMImageView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import java.util.List;
import jq3.C60905o;
import jq3.C9493c;
import k60.C60979d;
import kg3.C76577a;
import l60.C99342a;
import l60.C99344b;
import o40.C61926c;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62368t0;
import rx3.C13598b0;
import te3.C64459j13;
import up1.C27696y;
import v92.C65558a;
import w92.C65943a;
import x92.C15628a;

/* renamed from: y92.h */
public final class C66594h extends C66590e {

    /* renamed from: j */
    public final String f191505j = "MicroMsg.VideoMinusScreenRoundCornerConvert";

    /* renamed from: y92.h$a */
    public static final class C66595a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f191506d;

        /* renamed from: e */
        public final /* synthetic */ ImageView f191507e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66595a(Bitmap bitmap, ImageView imageView) {
            super(0);
            this.f191506d = bitmap;
            this.f191507e = imageView;
        }

        public Object invoke() {
            boolean z = ((float) this.f191506d.getWidth()) / ((float) this.f191506d.getHeight()) > ((float) this.f191507e.getWidth()) / ((float) this.f191507e.getHeight());
            this.f191507e.setScaleType(z ? ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP);
            this.f191507e.setBackground(z ? new ColorDrawable(-16777216) : null);
            return C13598b0.f38549a;
        }
    }

    public C66594h(C65943a aVar) {
        super(C0966R.C0971layout.bbn, aVar);
    }

    /* renamed from: d */
    public void mo2292d(RecyclerView recyclerView, WxRecyclerAdapter<?> wxRecyclerAdapter) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(wxRecyclerAdapter, "adapter");
        super.mo2292d(recyclerView, wxRecyclerAdapter);
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C60905o oVar2 = oVar;
        C65558a aVar = (C65558a) cVar;
        C11978e0.C11979a aVar2 = C11978e0.C11979a.TIMELINE;
        Class cls = C62368t0.class;
        Class cls2 = C11990s0.class;
        Class cls3 = C60200t1.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(aVar, "item");
        Log.m105918d(this.f191505j, "onBindViewHolder");
        super.mo90637l(oVar, aVar, i, i2, z, list);
        C64459j13 m2 = aVar.f188631d.mo80305m2();
        TextView textView = (TextView) oVar2.f44854d.findViewById(C0966R.C0970id.h3n);
        ImageView imageView = (ImageView) oVar2.f44854d.findViewById(C0966R.C0970id.h3f);
        ImageView imageView2 = (ImageView) oVar2.f44854d.findViewById(C0966R.C0970id.h3g);
        C39818r rVar = C39818r.f106831a;
        C60979d<C100810g0> i25 = ((C11990s0) rVar.mo62446e(cls3).mo62447c(cls2)).mo11872i2();
        C62368t0 t0Var = (C62368t0) C86312j.m106911c(cls);
        String str = m2 != null ? m2.f183756i : null;
        if (str == null) {
            str = "";
        }
        C100810g0 Rt0 = t0Var.Rt0(str, C27696y.MEDIUM_AVATAR_IMAGE);
        C87412m.m108593f(imageView, "avatarImgView");
        i25.mo85957c(Rt0, imageView, ((C11990s0) rVar.mo62446e(cls3).mo62447c(cls2)).mo11867O2(C11978e0.C11979a.AVATAR));
        C15628a aVar3 = C15628a.f42254a;
        C87412m.m108593f(textView, "nickname");
        String str2 = m2 != null ? m2.f183751d : null;
        if (str2 == null) {
            str2 = "";
        }
        textView.setText(aVar3.mo14374a(textView, str2, this.f191499i));
        boolean z2 = true;
        if (m2 != null) {
            C87412m.m108593f(imageView2, "avatarIconView");
            int i3 = m2.f183757j;
            String str3 = m2.f183753f;
            imageView2.setVisibility(8);
            Drawable drawable = imageView2.getDrawable();
            if (drawable != null) {
                drawable.setColorFilter((ColorFilter) null);
            }
            Log.m105924i("MicroMsg.MinusScreen.ViewUtils", "authType = " + i3 + ", authIconUrl = " + str3);
            imageView2.setVisibility(0);
            if (i3 <= 0) {
                imageView2.setVisibility(8);
            } else if (i3 == 1) {
                if (!(str3 == null || str3.length() == 0)) {
                    ((C11990s0) rVar.mo62446e(cls3).mo62447c(cls2)).mo11871f2().mo85957c(((C62368t0) C86312j.m106911c(cls)).mo87412UE(str3, C27696y.RAW_IMAGE), imageView2, ((C11990s0) rVar.mo62446e(cls3).mo62447c(cls2)).mo11867O2(aVar2));
                } else {
                    imageView2.setImageDrawable(C74933u4.m89768e(imageView2.getContext(), C0966R.raw.icons_filled_star_identify, C76577a.m92153d(imageView2.getContext(), C0966R.color.Orange_100)));
                }
            } else if (i3 == 2) {
                imageView2.setImageResource(C0966R.raw.icons_filled_star_identify_enterprise);
            } else if (i3 != 100) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(8);
            }
        }
        WeImageView weImageView = (WeImageView) oVar2.mo85812D(C0966R.C0970id.h3i);
        weImageView.setImageResource(C0966R.raw.icons_outlined_playbtn);
        weImageView.setIconColor(oVar2.f173499A.getResources().getColor(C0966R.color.f2975b6));
        if (!m2.f183758n) {
            weImageView.setVisibility(0);
        } else {
            weImageView.setVisibility(8);
        }
        TextView textView2 = (TextView) oVar2.mo85812D(C0966R.C0970id.h3m);
        int i4 = aVar.f188631d.mo80305m2().f183754g;
        textView2.setText(mo90636k(i4 / 60) + XVFSFile.PATH_SEPARATOR_CHAR + mo90636k(i4 % 60));
        textView2.setVisibility(8);
        MMImageView mMImageView = (MMImageView) oVar2.f44854d.findViewById(C0966R.C0970id.h3s);
        WeImageView weImageView2 = (WeImageView) oVar2.f44854d.findViewById(C0966R.C0970id.h3k);
        if (mMImageView.getVisibility() == 8) {
            String s402 = ((C60200t1) C86312j.m106911c(cls3)).s40(aVar.f188631d);
            if (Util.isNullOrNil(s402)) {
                z2 = false;
            } else {
                mMImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                mMImageView.setBackgroundColor(-16777216);
                C99344b<C100810g0, Bitmap> b = ((C11990s0) rVar.mo62446e(cls3).mo62447c(cls2)).mo11871f2().mo85956b(((C62368t0) C86312j.m106911c(cls)).mo87412UE(s402, C27696y.THUMB_IMAGE), ((C11990s0) rVar.mo62446e(cls3).mo62447c(cls2)).mo11867O2(aVar2));
                C53512j jVar = new C53512j(mMImageView);
                b.getClass();
                b.f291320d = jVar;
                ((C99342a) b).mo85954d(mMImageView);
            }
            if (z2) {
                mMImageView.setVisibility(0);
                weImageView2.setVisibility(8);
                weImageView.setVisibility(0);
                return;
            }
        }
        mMImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        mMImageView.setBackground((Drawable) null);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        super.mo45f(recyclerView, oVar, i);
    }

    /* renamed from: j */
    public String mo90635j(Context context, C65558a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "item");
        return Util.isNullOrNil(aVar.f188631d.mo80305m2().f183751d) ? context.getResources().getString(C0966R.string.gsl) : aVar.f188631d.mo80305m2().f183751d;
    }

    /* renamed from: m */
    public void mo90638m(Bitmap bitmap, ImageView imageView) {
        C87412m.m108594g(bitmap, "bitmap");
        C87412m.m108594g(imageView, "imgView");
        super.mo90638m(bitmap, imageView);
        C61926c.m72668M(new C66595a(bitmap, imageView));
    }
}
