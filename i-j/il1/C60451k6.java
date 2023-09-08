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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import pt1.C35640b;
import rx3.C36570n;
import sx3.C36907w;
import te3.C64848y91;

/* renamed from: il1.k6 */
public final class C60451k6 {

    /* renamed from: a */
    public final LinearLayout f172358a;

    /* renamed from: b */
    public final C45795b f172359b;

    /* renamed from: c */
    public final TextView f172360c;

    /* renamed from: il1.k6$a */
    public static final class C60452a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60451k6 f172361d;

        public C60452a(C60451k6 k6Var) {
            this.f172361d = k6Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveTagWidget$refreshTagInfo$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f172361d.mo85419a(false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveTagWidget$refreshTagInfo$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C60451k6(LinearLayout linearLayout, C45795b bVar) {
        C87412m.m108594g(linearLayout, "filterPanelRoot");
        C87412m.m108594g(bVar, "liveData");
        this.f172358a = linearLayout;
        this.f172359b = bVar;
        this.f172360c = (TextView) linearLayout.findViewById(C0966R.C0970id.f358234e01);
        C87412m.m108593f(linearLayout.getContext().getString(C0966R.string.dz6), "filterPanelRoot.context.…g.finder_live_not_choose)");
        mo85421c();
        linearLayout.setClickable(true);
    }

    /* renamed from: a */
    public final void mo85419a(boolean z) {
        ArrayList arrayList;
        Intent intent = new Intent();
        Context context = this.f172358a.getContext();
        C35640b bVar = C35640b.f95284a;
        intent.setClass(context, (Class) ((C36570n) C35640b.f95290g).getValue());
        LinkedList<C64848y91> linkedList = ((C54991o) this.f172359b.mo71262a(C54991o.class)).f154322h2;
        Serializable serializable = null;
        if (linkedList != null) {
            arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (C64848y91 byteArray : linkedList) {
                arrayList.add(byteArray.toByteArray());
            }
        } else {
            arrayList = null;
        }
        if (arrayList instanceof Serializable) {
            serializable = arrayList;
        }
        intent.putExtra("KEY_TAG_INFO", serializable);
        intent.putExtra("KEY_HAS_NEXT_ACTION", z);
        Context context2 = this.f172358a.getContext();
        C87412m.m108592e(context2, "null cannot be cast to non-null type android.app.Activity");
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(1003);
        aVar.mo10233c(intent);
        C117292a.m165364j((Activity) context2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveTagWidget", "gotoTagUI", "(Z)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    /* renamed from: b */
    public final boolean mo85420b() {
        Class cls = C54991o.class;
        if (((C54991o) this.f172359b.mo71262a(cls)).f154326i2 != null) {
            C64848y91 y912 = ((C54991o) this.f172359b.mo71262a(cls)).f154326i2;
            String str = y912 != null ? y912.f186454e : null;
            if (!(str == null || str.length() == 0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x010d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85421c() {
        /*
            r11 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            java.lang.Class<ak1.o> r1 = ak1.C54108o.class
            fj1.b r2 = r11.f172359b
            androidx.lifecycle.i0 r2 = r2.mo71262a(r0)
            cl1.o r2 = (cl1.C54991o) r2
            java.util.LinkedList<te3.y91> r2 = r2.f154322h2
            if (r2 == 0) goto L_0x011a
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x001f
            android.widget.LinearLayout r0 = r11.f172358a
            r1 = 8
            r0.setVisibility(r1)
            goto L_0x011a
        L_0x001f:
            android.widget.LinearLayout r2 = r11.f172358a
            r3 = 0
            r2.setVisibility(r3)
            di3.d r2 = di3.C86312j.m106911c(r1)
            ak1.o r2 = (ak1.C54108o) r2
            r2.getClass()
            ak1.f0 r2 = ak1.C54108o.f151869h
            r2.getClass()
            java.lang.String r4 = ""
            r2.f151421C = r4
            android.widget.TextView r5 = r11.f172360c
            android.widget.LinearLayout r6 = r11.f172358a
            android.content.Context r6 = r6.getContext()
            r7 = 2131828900(0x7f1120a4, float:1.9290754E38)
            java.lang.String r6 = r6.getString(r7)
            r5.setText(r6)
            fj1.b r5 = r11.f172359b
            androidx.lifecycle.i0 r0 = r5.mo71262a(r0)
            cl1.o r0 = (cl1.C54991o) r0
            te3.y91 r0 = r0.f154326i2
            if (r0 == 0) goto L_0x0110
            java.lang.String r5 = r0.f186454e
            r6 = 1
            if (r5 == 0) goto L_0x0063
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r5 = 0
            goto L_0x0064
        L_0x0063:
            r5 = 1
        L_0x0064:
            if (r5 != 0) goto L_0x00f0
            te3.y91 r5 = r0.f186456g
            r8 = 0
            if (r5 == 0) goto L_0x006e
            java.lang.String r5 = r5.f186454e
            goto L_0x006f
        L_0x006e:
            r5 = r8
        L_0x006f:
            if (r5 == 0) goto L_0x007a
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r5 = 0
            goto L_0x007b
        L_0x007a:
            r5 = 1
        L_0x007b:
            if (r5 != 0) goto L_0x00f0
            android.widget.TextView r5 = r11.f172360c
            te3.y91 r7 = r0.f186456g
            if (r7 == 0) goto L_0x0089
            int r9 = r7.f186457h
            if (r9 != r6) goto L_0x0089
            r9 = 1
            goto L_0x008a
        L_0x0089:
            r9 = 0
        L_0x008a:
            r10 = 2131828901(0x7f1120a5, float:1.9290756E38)
            if (r9 == 0) goto L_0x00ca
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = r0.f186454e
            r7.append(r9)
            r9 = 45
            r7.append(r9)
            te3.y91 r9 = r0.f186456g
            if (r9 == 0) goto L_0x00a4
            java.lang.String r8 = r9.f186454e
        L_0x00a4:
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            di3.d r8 = di3.C86312j.m106911c(r1)
            ak1.o r8 = (ak1.C54108o) r8
            r8.getClass()
            java.lang.String r8 = "<set-?>"
            gy3.C87412m.m108594g(r7, r8)
            r2.f151421C = r7
            android.widget.LinearLayout r8 = r11.f172358a
            android.content.Context r8 = r8.getContext()
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r3] = r7
            java.lang.String r3 = r8.getString(r10, r6)
            goto L_0x00ec
        L_0x00ca:
            if (r7 == 0) goto L_0x00ce
            java.lang.String r8 = r7.f186454e
        L_0x00ce:
            di3.d r7 = di3.C86312j.m106911c(r1)
            ak1.o r7 = (ak1.C54108o) r7
            r7.getClass()
            if (r8 != 0) goto L_0x00db
            r7 = r4
            goto L_0x00dc
        L_0x00db:
            r7 = r8
        L_0x00dc:
            r2.f151421C = r7
            android.widget.LinearLayout r7 = r11.f172358a
            android.content.Context r7 = r7.getContext()
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r3] = r8
            java.lang.String r3 = r7.getString(r10, r6)
        L_0x00ec:
            r5.setText(r3)
            goto L_0x00ff
        L_0x00f0:
            android.widget.TextView r3 = r11.f172360c
            android.widget.LinearLayout r5 = r11.f172358a
            android.content.Context r5 = r5.getContext()
            java.lang.String r5 = r5.getString(r7)
            r3.setText(r5)
        L_0x00ff:
            di3.d r1 = di3.C86312j.m106911c(r1)
            ak1.o r1 = (ak1.C54108o) r1
            r1.getClass()
            java.lang.String r0 = r0.f186454e
            if (r0 != 0) goto L_0x010d
            goto L_0x010e
        L_0x010d:
            r4 = r0
        L_0x010e:
            r2.f151420B = r4
        L_0x0110:
            android.widget.LinearLayout r0 = r11.f172358a
            il1.k6$a r1 = new il1.k6$a
            r1.<init>(r11)
            r0.setOnClickListener(r1)
        L_0x011a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C60451k6.mo85421c():void");
    }
}
