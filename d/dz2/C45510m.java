package dz2;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import az2.C39674e;
import b03.C39691c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32228q;
import gy3.C87412m;
import hz2.C60235a;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import kg3.C76577a;
import p158gt.C76057w;
import p196ln.C76705f;
import p629ny.C76979h;
import p773yy.C79168k;
import pz2.C47729d;
import qy2.C63347a;
import qy2.C77455o;
import rz2.C48201c;
import rz2.C48204f;
import rz2.C48206h;
import uz2.C52678e0;
import xz2.C79019r;
import z04.C112551y;

/* renamed from: dz2.m */
public final class C45510m extends C60896i<C47729d> {

    /* renamed from: e */
    public long f123177e;

    /* renamed from: f */
    public C32228q<? super View, ? super Integer, ? super Long, Boolean> f123178f;

    public C45510m(long j, C32228q<? super View, ? super Integer, ? super Long, Boolean> qVar) {
        this.f123177e = j;
        this.f123178f = qVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.c9s;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        String str;
        String str2;
        C47729d dVar = (C47729d) cVar;
        Class cls = C76979h.class;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(dVar, "item");
        C72996z1 N2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69664N2(dVar.f128238d.field_UserName);
        boolean z2 = true;
        if (N2 != null && N2.mo62927s3()) {
            TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.kxb);
            TextView textView2 = (TextView) oVar.mo85812D(C0966R.C0970id.kxw);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(((C76979h) C86312j.m106911c(cls)).op0(oVar.f173499A, N2.mo62898f(), C76577a.m92157h(oVar.f173499A, C0966R.dimen.f3927j7)));
            ImageSpan Ig0 = ((C79168k) C86312j.m106911c(C79168k.class)).Ig0(textView, N2.getUsername(), C63347a.C47892c.CONVERSATION_LIST, (float) C76577a.m92157h(oVar.f173499A, C0966R.dimen.f3927j7));
            if (Ig0 != null) {
                spannableStringBuilder.append(" ");
                spannableStringBuilder.setSpan(Ig0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
            }
            textView.setText(spannableStringBuilder);
            textView2.setText(oVar.f173499A.getString(dVar.f128238d.field_ShowType == 1 ? C0966R.string.jzh : C0966R.string.k1m));
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z((ImageView) oVar.mo85812D(C0966R.C0970id.fcc), N2.getUsername());
            oVar.f44854d.setOnClickListener(new C45508j(N2, oVar, this));
        }
        ((TextView) oVar.mo85812D(C0966R.C0970id.kyj)).setText(C72715f.m85112e(oVar.f173499A, ((long) dVar.f128238d.field_CreateTime) * 1000, true));
        ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.fdc);
        String str3 = dVar.f128238d.field_thumbUrl;
        if (!(str3 == null || C112551y.m153811k(str3))) {
            str = dVar.f128238d.field_thumbUrl;
            C87412m.m108593f(str, "item.referenceInfo.field_thumbUrl");
        } else {
            C48206h t0 = C39674e.f106452d.mo62255t0();
            String str4 = dVar.f128238d.field_TextStatusId;
            C87412m.m108593f(str4, "item.referenceInfo.field_TextStatusId");
            C48201c Ow = t0.mo72963Ow(str4);
            if (Ow != null) {
                String str5 = Ow.field_MediaThumbUrl;
                if (!(str5 == null || str5.length() == 0)) {
                    str = Ow.field_MediaThumbUrl;
                    C87412m.m108593f(str, "field_MediaThumbUrl");
                }
            }
            str = "";
        }
        oVar.f44854d.setOnLongClickListener(new C7571k(this, oVar, i));
        imageView.setImageDrawable((Drawable) null);
        if (!C112551y.m153811k(str)) {
            imageView.setTag(dVar);
            ((C76057w) C86312j.m106911c(C76057w.class)).h60(str, new C45509l(imageView, dVar));
        }
        FrameLayout frameLayout = (FrameLayout) oVar.mo85812D(C0966R.C0970id.fla);
        frameLayout.removeAllViews();
        C48204f fVar = dVar.f128238d;
        fVar.getClass();
        C52678e0 e0Var = new C52678e0();
        byte[] bArr = fVar.field_TopicInfo;
        if (bArr != null) {
            e0Var.parseFrom(bArr);
        }
        String d = C60235a.m70504d(e0Var);
        if (!(d == null || C112551y.m153811k(d))) {
            C77455o b = C79019r.f232026a.mo108987b(C75463g.m90504b(e0Var));
            if (b != null) {
                b.mo84147m(dVar.f128238d.field_TextStatusId, C75463g.m90503a(e0Var));
            }
            if (b != null) {
                b.mo84150q(frameLayout);
            }
        }
        TextView textView3 = (TextView) oVar.mo85812D(C0966R.C0970id.h2q);
        String str6 = dVar.f128238d.field_Description;
        if (!(str6 == null || str6.length() == 0)) {
            z2 = false;
        }
        if (!z2) {
            str2 = dVar.f128238d.field_Description;
            C87412m.m108593f(str2, "item.referenceInfo.field_Description");
        } else {
            C39691c a = IStatusIconHelperKt.m39109a();
            C48204f fVar2 = dVar.f128238d;
            fVar2.getClass();
            C52678e0 e0Var2 = new C52678e0();
            byte[] bArr2 = fVar2.field_TopicInfo;
            if (bArr2 != null) {
                e0Var2.parseFrom(bArr2);
            }
            str2 = a.mo62301m(e0Var2);
        }
        textView3.setText(((C76979h) C86312j.m106911c(cls)).yp0(oVar.f173499A, str2, textView3.getTextSize()));
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
