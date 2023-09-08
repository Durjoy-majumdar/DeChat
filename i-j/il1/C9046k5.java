package il1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import fj1.C45795b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import pt1.C35640b;
import rx3.C36570n;

/* renamed from: il1.k5 */
public final class C9046k5 implements View.OnClickListener {

    /* renamed from: d */
    public final LinearLayout f28556d;

    /* renamed from: e */
    public final C45795b f28557e;

    /* renamed from: f */
    public final Integer f28558f;

    /* renamed from: g */
    public final TextView f28559g;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00b4 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9046k5(android.widget.LinearLayout r11, fj1.C45795b r12, java.lang.Integer r13) {
        /*
            r10 = this;
            java.lang.String r0 = "luckyMoneyRoot"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "liveData"
            gy3.C87412m.m108594g(r12, r0)
            r10.<init>()
            r10.f28556d = r11
            r10.f28557e = r12
            r10.f28558f = r13
            r0 = 2131303834(0x7f091d9a, float:1.8225794E38)
            android.view.View r0 = r11.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.f28559g = r0
            r1 = 2131303832(0x7f091d98, float:1.822579E38)
            android.view.View r1 = r11.findViewById(r1)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            r2 = 2131303827(0x7f091d93, float:1.822578E38)
            android.view.View r2 = r11.findViewById(r2)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r2
            r11.setOnClickListener(r10)
            java.lang.Class<cl1.o> r3 = cl1.C54991o.class
            er1.j4 r4 = er1.C58739j4.f168176a
            boolean r4 = r4.mo83692U()
            if (r4 == 0) goto L_0x0056
            pe1.c<java.lang.Integer> r4 = gg1.C32444a.f86153i
            java.lang.Object r5 = r4.mo60266n()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 == 0) goto L_0x0056
            java.lang.Object r4 = r4.mo60266n()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            goto L_0x0060
        L_0x0056:
            androidx.lifecycle.i0 r4 = r12.mo71262a(r3)
            cl1.o r4 = (cl1.C54991o) r4
            te3.g31 r4 = r4.f154372u2
            int r4 = r4.f183272e
        L_0x0060:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "checkLuckyMoneyStatusBySvrConfig "
            r5.append(r6)
            androidx.lifecycle.i0 r6 = r12.mo71262a(r3)
            cl1.o r6 = (cl1.C54991o) r6
            te3.g31 r6 = r6.f154372u2
            int r6 = r6.f183272e
            r5.append(r6)
            java.lang.String r6 = " FINDER_DEBUG_LIVE_LUCKY_MONEY_ENTRANCE.value():"
            r5.append(r6)
            pe1.c<java.lang.Integer> r6 = gg1.C32444a.f86153i
            java.lang.Object r6 = r6.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r5.append(r6)
            java.lang.String r6 = " luckyMoneyConfig:"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "Finder.FinderLiveLuckyMoneyWidget"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            androidx.lifecycle.i0 r5 = r12.mo71262a(r3)
            cl1.o r5 = (cl1.C54991o) r5
            r5 = 0
            r6 = 1
            if (r4 == r6) goto L_0x00aa
            if (r4 == 0) goto L_0x00aa
            r7 = 1
            goto L_0x00ab
        L_0x00aa:
            r7 = 0
        L_0x00ab:
            r8 = 8
            if (r7 != 0) goto L_0x00b4
            r11.setVisibility(r8)
            goto L_0x01e6
        L_0x00b4:
            if (r13 != 0) goto L_0x00b7
            goto L_0x0115
        L_0x00b7:
            int r7 = r13.intValue()
            if (r7 != r6) goto L_0x0115
            androidx.lifecycle.i0 r7 = r12.mo71262a(r3)
            cl1.o r7 = (cl1.C54991o) r7
            r7 = 3
            if (r4 != r7) goto L_0x00c8
            r7 = 1
            goto L_0x00c9
        L_0x00c8:
            r7 = 0
        L_0x00c9:
            if (r7 == 0) goto L_0x0115
            android.content.Context r12 = r11.getContext()
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131101688(0x7f0607f8, float:1.7815793E38)
            int r12 = r12.getColor(r13)
            r1.setIconColor(r12)
            android.content.Context r12 = r11.getContext()
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131232563(0x7f080733, float:1.8081239E38)
            android.graphics.drawable.Drawable r12 = r12.getDrawable(r13)
            r1.setImageDrawable(r12)
            android.content.Context r12 = r11.getContext()
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131100666(0x7f0603fa, float:1.781372E38)
            int r12 = r12.getColor(r13)
            r2.setIconColor(r12)
            android.content.Context r12 = r11.getContext()
            android.content.res.Resources r12 = r12.getResources()
            int r12 = r12.getColor(r13)
            r0.setTextColor(r12)
            r11.setVisibility(r5)
            goto L_0x01e6
        L_0x0115:
            r7 = 2
            if (r13 != 0) goto L_0x0119
            goto L_0x011f
        L_0x0119:
            int r9 = r13.intValue()
            if (r9 == r7) goto L_0x0132
        L_0x011f:
            androidx.lifecycle.i0 r12 = r12.mo71262a(r3)
            cl1.o r12 = (cl1.C54991o) r12
            if (r4 != r7) goto L_0x0129
            r12 = 1
            goto L_0x012a
        L_0x0129:
            r12 = 0
        L_0x012a:
            if (r12 == 0) goto L_0x012d
            goto L_0x0132
        L_0x012d:
            r11.setVisibility(r8)
            goto L_0x01e6
        L_0x0132:
            android.content.Context r12 = r11.getContext()
            android.content.res.Resources r12 = r12.getResources()
            r3 = 2131099704(0x7f060038, float:1.7811769E38)
            int r12 = r12.getColor(r3)
            r1.setIconColor(r12)
            if (r13 != 0) goto L_0x0147
            goto L_0x0160
        L_0x0147:
            int r12 = r13.intValue()
            if (r12 != r6) goto L_0x0160
            android.content.Context r12 = r11.getContext()
            android.content.res.Resources r12 = r12.getResources()
            r3 = 2131755896(0x7f100378, float:1.9142684E38)
            android.graphics.drawable.Drawable r12 = r12.getDrawable(r3)
            r1.setImageDrawable(r12)
            goto L_0x017b
        L_0x0160:
            if (r13 != 0) goto L_0x0163
            goto L_0x017b
        L_0x0163:
            int r12 = r13.intValue()
            if (r12 != r7) goto L_0x017b
            android.content.Context r12 = r11.getContext()
            android.content.res.Resources r12 = r12.getResources()
            r3 = 2131756341(0x7f100535, float:1.9143587E38)
            android.graphics.drawable.Drawable r12 = r12.getDrawable(r3)
            r1.setImageDrawable(r12)
        L_0x017b:
            r12 = 2131099699(0x7f060033, float:1.7811759E38)
            r1 = 2131101837(0x7f06088d, float:1.7816095E38)
            if (r13 != 0) goto L_0x0184
            goto L_0x019a
        L_0x0184:
            int r3 = r13.intValue()
            if (r3 != r6) goto L_0x019a
            android.content.Context r3 = r11.getContext()
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getColor(r1)
            r0.setTextColor(r3)
            goto L_0x01b2
        L_0x019a:
            if (r13 != 0) goto L_0x019d
            goto L_0x01b2
        L_0x019d:
            int r3 = r13.intValue()
            if (r3 != r7) goto L_0x01b2
            android.content.Context r3 = r11.getContext()
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getColor(r12)
            r0.setTextColor(r3)
        L_0x01b2:
            if (r13 != 0) goto L_0x01b5
            goto L_0x01cb
        L_0x01b5:
            int r0 = r13.intValue()
            if (r0 != r6) goto L_0x01cb
            android.content.Context r12 = r11.getContext()
            android.content.res.Resources r12 = r12.getResources()
            int r12 = r12.getColor(r1)
            r2.setIconColor(r12)
            goto L_0x01e3
        L_0x01cb:
            if (r13 != 0) goto L_0x01ce
            goto L_0x01e3
        L_0x01ce:
            int r13 = r13.intValue()
            if (r13 != r7) goto L_0x01e3
            android.content.Context r13 = r11.getContext()
            android.content.res.Resources r13 = r13.getResources()
            int r12 = r13.getColor(r12)
            r2.setIconColor(r12)
        L_0x01e3:
            r11.setVisibility(r5)
        L_0x01e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C9046k5.<init>(android.widget.LinearLayout, fj1.b, java.lang.Integer):void");
    }

    /* renamed from: a */
    public final void mo9870a() {
        Class cls = C54991o.class;
        int size = ((C54991o) this.f28557e.mo71262a(cls)).f154376v2.f513a.size();
        if (!((C54991o) this.f28557e.mo71262a(cls)).mo75965J3() || size <= 0) {
            this.f28559g.setText(this.f28556d.getContext().getResources().getString(C0966R.string.duo));
        } else {
            Integer num = this.f28558f;
            if (num != null && num.intValue() == 1) {
                this.f28559g.setText(this.f28556d.getContext().getResources().getString(C0966R.string.dux, new Object[]{Integer.valueOf(size)}));
            } else {
                Integer num2 = this.f28558f;
                if (num2 != null && num2.intValue() == 2) {
                    this.f28559g.setText(this.f28556d.getContext().getResources().getString(C0966R.string.fo5, new Object[]{Integer.valueOf(size)}));
                }
            }
        }
        this.f28559g.setVisibility(0);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveLuckyMoneyWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.dr6) {
            Class cls = C54991o.class;
            Intent intent = new Intent(this.f28556d.getContext(), (Class) ((C36570n) C35640b.f95292i).getValue());
            intent.putExtra("titile", this.f28556d.getContext().getResources().getString(C0966R.string.e6v));
            intent.putExtra("KBlockOpenImFav", true);
            intent.putExtra("KEY_LUCKY_MONEY_CHAT_ROOM_MAX_COUNT", ((C54991o) this.f28557e.mo71262a(cls)).f154372u2.f183271d);
            intent.putStringArrayListExtra("KEY_LUCKY_MONEY_CHAT_ROOM_USERNAME", new ArrayList(((C54991o) this.f28557e.mo71262a(cls)).f154376v2.f513a));
            Context context = this.f28556d.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(1004);
            aVar.mo10233c(intent);
            C117292a.m165364j((Activity) context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLuckyMoneyWidget", "goToSelectLuckyRoom", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLuckyMoneyWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
