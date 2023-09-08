package ve1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C55011a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58746l1;
import er1.C58784w3;
import er1.C7818j1;
import er1.C7878t0;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import te3.C64284cg;
import zp3.C23564m;

/* renamed from: ve1.h5 */
public abstract class C65600h5<T extends C55011a> extends C60896i<T> {

    /* renamed from: e */
    public final int f188764e;

    /* renamed from: f */
    public final int f188765f;

    public C65600h5(int i, int i2) {
        this.f188764e = i;
        this.f188765f = i2;
    }

    /* renamed from: c */
    public int mo43c() {
        return this.f188764e;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        ImageView imageView;
        ImageView imageView2;
        C55011a aVar = (C55011a) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(aVar, "item");
        Context context = oVar.f173499A;
        C58784w3 w3Var = C58784w3.f168295a;
        int i3 = aVar.f154465d.field_createTime;
        w3Var.getClass();
        ((TextView) oVar.mo85812D(C0966R.C0970id.kky)).setText(C7878t0.m8038g(context, ((long) i3) * ((long) 1000)));
        if (!aVar.f154465d.mo90403l2() && !aVar.f154467f && (imageView2 = (ImageView) oVar.mo85812D(C0966R.C0970id.d77)) != null) {
            FinderContact finderContact = aVar.f154465d.field_contact;
            C58784w3.m68429F1(w3Var, imageView2, finderContact != null ? finderContact.authInfo : null, 0, (C64284cg) null, 12, (Object) null);
        }
        mo89664j(oVar, aVar, i);
        Log.m105924i("FinderMsgConvert", "onBindViewHolder: " + getClass().getCanonicalName());
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.a84);
        if (textView != null) {
            textView.setVisibility(aVar.f154466e ? 0 : 8);
        }
        if (!aVar.f154465d.mo90403l2()) {
            int dimensionPixelSize = oVar.f173499A.getResources().getDimensionPixelSize(C0966R.dimen.f3753d4);
            View D = oVar.mo85812D(C0966R.C0970id.a27);
            if (D != null) {
                D.getLayoutParams().width = dimensionPixelSize;
                D.getLayoutParams().height = dimensionPixelSize;
            }
        } else {
            int dimensionPixelSize2 = oVar.f173499A.getResources().getDimensionPixelSize(C0966R.dimen.f3753d4);
            int dimensionPixelSize3 = oVar.f173499A.getResources().getDimensionPixelSize(C0966R.dimen.f3749d0);
            View D2 = oVar.mo85812D(C0966R.C0970id.hq7);
            if (D2 != null) {
                D2.getLayoutParams().width = dimensionPixelSize2;
                D2.getLayoutParams().height = dimensionPixelSize2;
            }
            View D3 = oVar.mo85812D(C0966R.C0970id.hq4);
            if (D3 != null) {
                D3.getLayoutParams().width = dimensionPixelSize3;
                D3.getLayoutParams().height = dimensionPixelSize3;
            }
        }
        ImageView imageView3 = (ImageView) oVar.mo85812D(C0966R.C0970id.fo5);
        if (imageView3 != null && (imageView3.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            if (this.f188765f == 2) {
                ViewGroup.LayoutParams layoutParams = imageView3.getLayoutParams();
                LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    layoutParams2.setMargins(oVar.f173499A.getResources().getDimensionPixelOffset(C0966R.dimen.f3736cp), 0, 0, 0);
                }
            } else {
                ViewGroup.LayoutParams layoutParams3 = imageView3.getLayoutParams();
                LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams3 : null;
                if (layoutParams4 != null) {
                    layoutParams4.setMargins(oVar.f173499A.getResources().getDimensionPixelOffset(C0966R.dimen.f3736cp), 0, 0, 0);
                }
            }
        }
        TextView textView2 = (TextView) oVar.mo85812D(C0966R.C0970id.a84);
        if (textView2 != null) {
            textView2.setTextSize(1, 14.0f);
        }
        View D4 = aVar.f154465d.mo90403l2() ? oVar.mo85812D(C0966R.C0970id.hq7) : oVar.mo85812D(C0966R.C0970id.a27);
        if (D4 != null) {
            D4.setOnClickListener(new C58746l1(aVar, this.f188765f, true, D4, true));
        }
        if (D4 != null) {
            View view = oVar.f44854d;
            Context context2 = oVar.f173499A;
            C87412m.m108593f(context2, "holder.context");
            if (view != null) {
                C23564m.m28138h(view, new C7818j1(context2));
            }
        }
        if (!aVar.f154465d.mo90403l2() && !aVar.f154467f && (imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.d77)) != null) {
            FinderContact finderContact2 = aVar.f154465d.field_contact;
            C58784w3.m68429F1(w3Var, imageView, finderContact2 != null ? finderContact2.authInfo : null, 0, (C64284cg) null, 12, (Object) null);
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: j */
    public abstract void mo89664j(C60905o oVar, T t, int i);

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        if (r2 != null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        if (r2 == null) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89673k(p749xh.C66276va r8, android.widget.ImageView r9, android.widget.TextView r10) {
        /*
            r7 = this;
            java.lang.Class<pl1.s0> r0 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            java.lang.String r2 = "finderMention"
            gy3.C87412m.m108594g(r8, r2)
            java.lang.String r2 = "thumbView"
            gy3.C87412m.m108594g(r9, r2)
            java.lang.String r2 = "contextView"
            gy3.C87412m.m108594g(r10, r2)
            r2 = 8
            r10.setVisibility(r2)
            te3.gc1 r2 = r8.field_extInfo
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0023
            java.lang.String r2 = r2.f183301d
            if (r2 != 0) goto L_0x0024
        L_0x0023:
            r2 = r3
        L_0x0024:
            java.lang.String r4 = "music"
            boolean r2 = gy3.C87412m.m108589b(r2, r4)
            if (r2 == 0) goto L_0x004a
            te3.gc1 r2 = r8.field_extInfo
            if (r2 == 0) goto L_0x0050
            pe3.b r2 = r2.f183303f
            if (r2 == 0) goto L_0x0050
            byte[] r2 = r2.f257327a
            java.lang.String r4 = "it.bytes"
            gy3.C87412m.m108593f(r2, r4)
            te3.kb1 r4 = new te3.kb1     // Catch:{ Exception -> 0x0046 }
            r4.<init>()     // Catch:{ Exception -> 0x0046 }
            r4.parseFrom(r2)     // Catch:{ Exception -> 0x0046 }
            java.lang.String r2 = r4.f183912o     // Catch:{ Exception -> 0x0046 }
            goto L_0x0047
        L_0x0046:
            r2 = 0
        L_0x0047:
            if (r2 != 0) goto L_0x004f
            goto L_0x0050
        L_0x004a:
            java.lang.String r2 = r8.field_thumbUrl
            if (r2 != 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r3 = r2
        L_0x0050:
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r2 = r2.mo62446e(r1)
            bl3.c r2 = r2.mo62447c(r0)
            pl1.s0 r2 = (pl1.C11990s0) r2
            k60.d r2 = r2.mo11871f2()
            pl1.n0 r4 = new pl1.n0
            up1.y r5 = up1.C27696y.THUMB_IMAGE
            r4.<init>(r3, r5)
            pl1.e0$a r5 = pl1.C11978e0.C11979a.MSG_THUMB
            bl3.r r6 = bl3.C39818r.f106831a
            bl3.r$a r1 = r6.mo62446e(r1)
            bl3.c r0 = r1.mo62447c(r0)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r0 = r0.mo11867O2(r5)
            r2.mo85957c(r4, r9, r0)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r9 == 0) goto L_0x00a0
            int r9 = r8.field_mediaType
            r0 = 1
            if (r9 != r0) goto L_0x00a0
            java.lang.Class<ny.h> r9 = p629ny.C76979h.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            ny.h r9 = (p629ny.C76979h) r9
            android.content.Context r0 = r10.getContext()
            java.lang.String r8 = r8.field_description
            android.text.SpannableString r8 = r9.mo107057T1(r0, r8)
            r10.setText(r8)
            r8 = 0
            r10.setVisibility(r8)
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C65600h5.mo89673k(xh.va, android.widget.ImageView, android.widget.TextView):void");
    }
}
