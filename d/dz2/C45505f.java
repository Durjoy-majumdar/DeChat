package dz2;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b03.C39691c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import fy3.C32228q;
import gc0.C20828a;
import gy3.C87412m;
import hz2.C60235a;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import kg3.C76577a;
import m02.C46940b;
import p158gt.C76057w;
import p196ln.C76705f;
import p629ny.C76979h;
import p773yy.C79168k;
import pz2.C47727b;
import qy2.C63347a;
import qy2.C77455o;
import rz2.C48202d;
import uz2.C52678e0;
import xz2.C79019r;
import z04.C112551y;

/* renamed from: dz2.f */
public final class C45505f extends C60896i<C47727b> {

    /* renamed from: e */
    public long f123168e;

    /* renamed from: f */
    public C32228q<? super View, ? super Integer, ? super Long, Boolean> f123169f;

    public C45505f(long j, C32228q<? super View, ? super Integer, ? super Long, Boolean> qVar) {
        this.f123168e = j;
        this.f123169f = qVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.c9c;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        String str;
        C47727b bVar = (C47727b) cVar;
        Class cls = C76979h.class;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(bVar, "item");
        boolean z2 = true;
        C72996z1 K30 = ((C46940b) C86312j.m106911c(C46940b.class)).K30(bVar.f128236d.field_HashUserName, 1);
        if (K30 == null || !K30.mo62927s3()) {
            ((TextView) oVar.mo85812D(C0966R.C0970id.kxb)).setText(bVar.f128236d.field_DisplayName);
            C20828a.m22825b().mo32518g(bVar.f128236d.field_HeadImgUrl, (ImageView) oVar.mo85812D(C0966R.C0970id.fcc));
            oVar.f44854d.setOnClickListener((View.OnClickListener) null);
        } else {
            TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.kxb);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(((C76979h) C86312j.m106911c(cls)).op0(oVar.f173499A, K30.mo62898f(), C76577a.m92157h(oVar.f173499A, C0966R.dimen.f3927j7)));
            ImageSpan Ig0 = ((C79168k) C86312j.m106911c(C79168k.class)).Ig0(textView, K30.getUsername(), C63347a.C47892c.CONVERSATION_LIST, (float) C76577a.m92157h(oVar.f173499A, C0966R.dimen.f3927j7));
            if (Ig0 != null) {
                spannableStringBuilder.append(" ");
                spannableStringBuilder.setSpan(Ig0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
            }
            textView.setText(spannableStringBuilder);
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z((ImageView) oVar.mo85812D(C0966R.C0970id.fcc), K30.getUsername());
            oVar.f44854d.setOnClickListener(new C45503c(K30, oVar, this));
        }
        oVar.f44854d.setOnLongClickListener(new C7570d(this, oVar, i));
        Drawable drawable = MMApplicationContext.getContext().getResources().getDrawable(C0966R.raw.icons_outlined_like);
        C74933u4.m89769f(drawable, MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3133gi));
        ((ImageView) oVar.mo85812D(C0966R.C0970id.f67)).setImageDrawable(drawable);
        ((TextView) oVar.mo85812D(C0966R.C0970id.kyj)).setText(C72715f.m85112e(oVar.f173499A, ((long) bVar.f128236d.field_CreateTime) * 1000, true));
        TextView textView2 = (TextView) oVar.mo85812D(C0966R.C0970id.h2q);
        String str2 = bVar.f128236d.field_Description;
        if (!(str2 == null || str2.length() == 0)) {
            str = bVar.f128236d.field_Description;
            C87412m.m108593f(str, "item.likeInfo.field_Description");
        } else {
            C39691c a = IStatusIconHelperKt.m39109a();
            C48202d dVar = bVar.f128236d;
            dVar.getClass();
            C52678e0 e0Var = new C52678e0();
            byte[] bArr = dVar.field_TopicInfo;
            if (bArr != null) {
                e0Var.parseFrom(bArr);
            }
            str = a.mo62301m(e0Var);
        }
        textView2.setText(((C76979h) C86312j.m106911c(cls)).yp0(oVar.f173499A, str, textView2.getTextSize()));
        ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.fdn);
        String str3 = bVar.f128236d.field_thumbUrl;
        imageView.setImageDrawable((Drawable) null);
        if (!(str3 == null || C112551y.m153811k(str3))) {
            imageView.setTag(bVar);
            ((C76057w) C86312j.m106911c(C76057w.class)).h60(str3, new C45504e(imageView, bVar));
        }
        FrameLayout frameLayout = (FrameLayout) oVar.mo85812D(C0966R.C0970id.fla);
        frameLayout.removeAllViews();
        C48202d dVar2 = bVar.f128236d;
        dVar2.getClass();
        C52678e0 e0Var2 = new C52678e0();
        byte[] bArr2 = dVar2.field_TopicInfo;
        if (bArr2 != null) {
            e0Var2.parseFrom(bArr2);
        }
        String d = C60235a.m70504d(e0Var2);
        if (d != null && !C112551y.m153811k(d)) {
            z2 = false;
        }
        if (!z2) {
            C77455o b = C79019r.f232026a.mo108987b(C75463g.m90504b(e0Var2));
            if (b != null) {
                b.mo84147m(bVar.f128236d.field_TextStatusId, C75463g.m90503a(e0Var2));
            }
            if (b != null) {
                b.mo84150q(frameLayout);
            }
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
