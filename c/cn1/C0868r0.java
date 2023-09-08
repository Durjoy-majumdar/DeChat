package cn1;

import an1.C0101n;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import di3.C86312j;
import er1.C58739j4;
import er1.C58784w3;
import fe1.C58960c;
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
import pl1.C62345f;
import rs1.C13442s8;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C49098d51;
import te3.C49114d91;
import te3.C49712hj1;
import up1.C27696y;

/* renamed from: cn1.r0 */
public class C0868r0 extends C60896i<C0101n> {

    /* renamed from: e */
    public final C49712hj1 f2062e;

    public C0868r0(C49712hj1 hj12) {
        C87412m.m108594g(hj12, "contextObj");
        this.f2062e = hj12;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fe  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m836j(an1.C0101n r20, jq3.C60905o r21, android.view.View r22, cn1.C0868r0 r23) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            java.lang.Class<tf0.q1> r3 = tf0.C13887q1.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            tf0.q1 r3 = (tf0.C13887q1) r3
            te3.d91 r4 = r0.f541d
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r4.f132197e
            java.lang.String r6 = ""
            if (r5 == 0) goto L_0x001a
            java.lang.String r5 = r5.username
            if (r5 != 0) goto L_0x001b
        L_0x001a:
            r5 = r6
        L_0x001b:
            te3.d51 r4 = r4.f132196d
            if (r4 == 0) goto L_0x0023
            java.lang.String r4 = r4.f132122h
            if (r4 != 0) goto L_0x0024
        L_0x0023:
            r4 = r6
        L_0x0024:
            te3.d51 r3 = r3.mo13343h4(r5, r4)
            if (r3 != 0) goto L_0x002e
            te3.d91 r3 = r0.f541d
            te3.d51 r3 = r3.f132196d
        L_0x002e:
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0038
            int r7 = r3.f132127p
            if (r7 != r4) goto L_0x0038
            r7 = 1
            goto L_0x0039
        L_0x0038:
            r7 = 0
        L_0x0039:
            if (r7 == 0) goto L_0x004f
            er1.j4 r7 = er1.C58739j4.f168176a
            te3.d91 r0 = r0.f541d
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r0.f132197e
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = r0.username
            goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            boolean r0 = r7.mo83691T(r0)
            if (r0 != 0) goto L_0x004f
            r0 = 1
            goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            r7 = 2131234844(0x7f08101c, float:1.8085865E38)
            r8 = 2131234843(0x7f08101b, float:1.8085863E38)
            r9 = 8
            r10 = 2131310423(0x7f093757, float:1.8239158E38)
            r11 = 2131306203(0x7f0926db, float:1.8230598E38)
            if (r0 == 0) goto L_0x00fe
            if (r3 == 0) goto L_0x01a7
            android.view.View r0 = r1.mo85812D(r11)
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r11.mo10233c(r9)
            java.lang.Object[] r13 = r11.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/NoticeConvert"
            java.lang.String r15 = "onBindViewHolder$lambda-14$render"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/NoticeConvertData;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/NoticeConvert;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r0
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r9 = r11.mo10231a(r5)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r0.setVisibility(r9)
            java.lang.String r13 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/NoticeConvert"
            java.lang.String r14 = "onBindViewHolder$lambda-14$render"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/NoticeConvertData;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/NoticeConvert;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            android.view.View r0 = r1.mo85812D(r10)
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r1 = r3.f132119e
            if (r1 != 0) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r4 = 0
        L_0x00b2:
            if (r4 == 0) goto L_0x00bf
            r2.setBackgroundResource(r7)
            r1 = 2131827749(0x7f111c25, float:1.928842E38)
            r0.setText(r1)
            goto L_0x01a7
        L_0x00bf:
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.lang.String r1 = r3.f132126o
            if (r1 != 0) goto L_0x00c9
            goto L_0x00ca
        L_0x00c9:
            r6 = r1
        L_0x00ca:
            java.lang.String r1 = "activityId"
            r11.put(r1, r6)
            java.lang.Class<ak1.o> r1 = ak1.C54108o.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            java.lang.String r3 = "getService(HellLiveReport::class.java)"
            gy3.C87412m.m108593f(r1, r3)
            r9 = r1
            ht1.j5 r9 = (ht1.C8777j5) r9
            ak1.f0$n r10 = ak1.C54067f0.C0066n.LIVE_CONCERT_NEW_LIVE_SPACE_RECEIVE
            r1 = r23
            te3.hj1 r1 = r1.f2062e
            java.lang.String r12 = r1.f134671e
            int r1 = r1.f134675i
            java.lang.String r13 = java.lang.String.valueOf(r1)
            r14 = 0
            r15 = 16
            r16 = 0
            ht1.C8777j5.C8778a.m8609j(r9, r10, r11, r12, r13, r14, r15, r16)
            r2.setBackgroundResource(r8)
            r1 = 2131827748(0x7f111c24, float:1.9288417E38)
            r0.setText(r1)
            goto L_0x01a7
        L_0x00fe:
            if (r3 == 0) goto L_0x01a7
            android.view.View r0 = r1.mo85812D(r11)
            android.view.View r1 = r1.mo85812D(r10)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r3 = r3.f132119e
            if (r3 != 0) goto L_0x010f
            goto L_0x0110
        L_0x010f:
            r4 = 0
        L_0x0110:
            if (r4 == 0) goto L_0x015d
            r2.setBackgroundResource(r7)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r2.mo10233c(r3)
            java.lang.Object[] r7 = r2.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/NoticeConvert"
            java.lang.String r9 = "onBindViewHolder$lambda-14$render"
            java.lang.String r10 = "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/NoticeConvertData;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/NoticeConvert;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r0
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r2 = r2.mo10231a(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r3 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/NoticeConvert"
            java.lang.String r4 = "onBindViewHolder$lambda-14$render"
            java.lang.String r5 = "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/NoticeConvertData;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/NoticeConvert;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r0
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            r0 = 2131827754(0x7f111c2a, float:1.928843E38)
            r1.setText(r0)
            goto L_0x01a7
        L_0x015d:
            r2.setBackgroundResource(r8)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r2.mo10233c(r3)
            java.lang.Object[] r7 = r2.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/NoticeConvert"
            java.lang.String r9 = "onBindViewHolder$lambda-14$render"
            java.lang.String r10 = "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/NoticeConvertData;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/NoticeConvert;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r0
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r2 = r2.mo10231a(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r3 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/NoticeConvert"
            java.lang.String r4 = "onBindViewHolder$lambda-14$render"
            java.lang.String r5 = "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/NoticeConvertData;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/NoticeConvert;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r0
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            r0 = 2131827753(0x7f111c29, float:1.9288428E38)
            r1.setText(r0)
        L_0x01a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn1.C0868r0.m836j(an1.n, jq3.o, android.view.View, cn1.r0):void");
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cnh;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        String str;
        C49098d51 d512;
        FinderContact finderContact;
        FinderContact finderContact2;
        String str2;
        C60905o oVar2 = oVar;
        C0101n nVar = (C0101n) cVar;
        Class cls = C61212e.class;
        Class cls2 = C11990s0.class;
        Class<C60200t1> cls3 = C60200t1.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(nVar, "item");
        ImageView imageView = (ImageView) oVar2.mo85812D(C0966R.C0970id.m_1);
        if (imageView != null) {
            C49098d51 d513 = nVar.f541d.f132196d;
            String str3 = d513 != null ? d513.f132120f : null;
            if (str3 == null || str3.length() == 0) {
                FinderContact finderContact3 = nVar.f541d.f132197e;
                str3 = finderContact3 != null ? finderContact3.headUrl : null;
            }
            if (str3 == null || str3.length() == 0) {
                imageView.setImageDrawable((Drawable) null);
            } else {
                C39818r rVar = C39818r.f106831a;
                ((C11990s0) rVar.mo62446e(cls3).mo62447c(cls2)).mo11871f2().mo85957c(new C11984n0(str3, C27696y.THUMB_IMAGE), imageView, ((C11990s0) rVar.mo62446e(cls3).mo62447c(cls2)).mo11867O2(C11978e0.C11979a.DEFAULT));
            }
            FinderContact finderContact4 = nVar.f541d.f132197e;
            if (!(finderContact4 == null || (str2 = finderContact4.username) == null)) {
                if (!(str2.length() > 0)) {
                    str2 = null;
                }
                if (str2 != null) {
                    imageView.setOnClickListener(new C0858o0(this, oVar2, str2));
                }
            }
        }
        ImageView imageView2 = (ImageView) oVar2.mo85812D(C0966R.C0970id.fcz);
        if (imageView2 != null) {
            FinderContact finderContact5 = nVar.f541d.f132197e;
            String str4 = finderContact5 != null ? finderContact5.headUrl : null;
            if (str4 != null) {
                if (!(str4.length() > 0)) {
                    str4 = null;
                }
                if (str4 != null) {
                    C39818r rVar2 = C39818r.f106831a;
                    ((C11990s0) rVar2.mo62446e(cls3).mo62447c(cls2)).mo11872i2().mo85957c(new C62345f(str4, (C27696y) null, 2, (C8480h) null), imageView2, ((C11990s0) rVar2.mo62446e(cls3).mo62447c(cls2)).mo11867O2(C11978e0.C11979a.AVATAR));
                }
            }
        }
        TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.kxa);
        if (textView != null) {
            FinderContact finderContact6 = nVar.f541d.f132197e;
            textView.setText(finderContact6 != null ? finderContact6.nickname : null);
        }
        ImageView imageView3 = (ImageView) oVar2.mo85812D(C0966R.C0970id.m_0);
        if (!(imageView3 == null || (finderContact2 = nVar.f541d.f132197e) == null)) {
            C58784w3.m68429F1(C58784w3.f168295a, imageView3, finderContact2.authInfo, 0, C58960c.m68829a(finderContact2, false), 4, (Object) null);
        }
        TextView textView2 = (TextView) oVar2.mo85812D(C0966R.C0970id.f359428ma1);
        if (textView2 != null) {
            C49098d51 d514 = nVar.f541d.f132196d;
            textView2.setText(oVar2.f173499A.getResources().getString(C0966R.string.d5x, new Object[]{C58739j4.m68254u(C58739j4.f168176a, ((long) (d514 != null ? d514.f132118d : 0)) * 1000, (Boolean) null, false, 2, (Object) null)}));
        }
        TextView textView3 = (TextView) oVar2.mo85812D(C0966R.C0970id.f359429kw2);
        if (textView3 != null) {
            C49098d51 d515 = nVar.f541d.f132196d;
            textView3.setText(d515 != null ? d515.f132121g : null);
        }
        View D = oVar2.mo85812D(C0966R.C0970id.m_5);
        if (D != null) {
            m836j(nVar, oVar2, D, this);
            C0863p0 p0Var = r0;
            C0863p0 p0Var2 = new C0863p0(nVar, this, oVar, i, D);
            D.setOnClickListener(p0Var);
        }
        View D2 = oVar2.mo85812D(C0966R.C0970id.m_5);
        ((C61212e) C86312j.m106911c(cls)).o30(D2, "live_square_notice");
        C61212e eVar = (C61212e) C86312j.m106911c(cls);
        C13604l[] lVarArr = new C13604l[5];
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        Context context = oVar2.f173499A;
        C87412m.m108593f(context, "holder.context");
        C13442s8 f = aVar.mo12873f(context);
        lVarArr[0] = new C13604l("comment_scene", f != null ? Integer.valueOf(f.f38096i) : null);
        lVarArr[1] = new C13604l("live_label_type", Integer.valueOf(nVar.f542e.f130377d));
        C49114d91 d912 = nVar.f541d;
        lVarArr[2] = new C13604l("finder_username", (d912 == null || (finderContact = d912.f132197e) == null) ? null : finderContact.username);
        lVarArr[3] = new C13604l("live_room_type", Integer.valueOf(i2));
        C49114d91 d913 = nVar.f541d;
        if (d913 == null || (d512 = d913.f132196d) == null || (str = d512.f132122h) == null) {
            str = "";
        }
        lVarArr[4] = new C13604l("live_notice_id", str);
        eVar.mo86149PM(D2, C90364q0.m113147f(lVarArr));
        ((C61212e) C86312j.m106911c(cls)).E60(D2, new C0866q0(nVar, oVar2));
        ((C61212e) C86312j.m106911c(cls)).mo86175pO(D2, 40, 25388);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
