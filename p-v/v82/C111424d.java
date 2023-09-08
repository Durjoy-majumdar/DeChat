package v82;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1821q0;
import com.tencent.p014mm.plugin.multitalk.model.C105770a;
import d82.C107025a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import kg3.C76577a;

/* renamed from: v82.d */
public final class C111424d extends RecyclerView.C16613e<C111433e> {

    /* renamed from: d */
    public Context f333576d;

    /* renamed from: e */
    public CopyOnWriteArrayList<C107025a> f333577e = new CopyOnWriteArrayList<>();

    /* renamed from: f */
    public boolean f333578f;

    /* renamed from: g */
    public HashSet<String> f333579g;

    /* renamed from: h */
    public ArrayList<String> f333580h;

    /* renamed from: i */
    public HashSet<String> f333581i;

    /* renamed from: j */
    public boolean f333582j;

    /* renamed from: n */
    public final int f333583n = 1;

    /* renamed from: o */
    public int f333584o = 1;

    /* renamed from: p */
    public C105770a f333585p;

    public C111424d(Context context) {
        C87412m.m108594g(context, "context");
        this.f333576d = context;
    }

    /* renamed from: F4 */
    public final int mo163094F4() {
        int j = C76577a.m92159j(this.f333576d) - C76577a.m92151b(this.f333576d, C1821q0.CTRL_INDEX);
        int i = C85875k4.m106184h(this.f333576d).x;
        return j > i ? (getItemCount() - this.f333583n) - this.f333584o < 5 ? i / 2 : i / 3 : (getItemCount() - this.f333583n) - this.f333584o < 5 ? j / 2 : j / 3;
    }

    public int getItemCount() {
        int i;
        int i2;
        if (this.f333577e.size() > 12) {
            this.f333582j = true;
            this.f333584o = 1;
            i2 = this.f333577e.size() + this.f333583n;
            i = this.f333584o;
        } else {
            this.f333582j = false;
            this.f333584o = 0;
            i2 = this.f333577e.size();
            i = this.f333583n;
        }
        return i2 + i;
    }

    public int getItemViewType(int i) {
        if (i == 0) {
            return 2;
        }
        return (i != getItemCount() - 1 || !this.f333582j) ? 1 : 3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C16631z r25, int r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r2 = r25
            v82.e r2 = (v82.C111433e) r2
            java.lang.String r3 = "holder"
            gy3.C87412m.m108594g(r2, r3)
            int r3 = r0.getItemViewType(r1)
            r4 = 8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r8 = 1
            r9 = 2
            r10 = 3
            if (r3 != r8) goto L_0x03ea
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
            int r11 = r24.mo163094F4()
            int r12 = r24.mo163094F4()
            r3.<init>(r11, r12)
            r3.addRule(r8)
            int r11 = r0.f333583n
            int r1 = r1 - r11
            int r11 = r24.getItemCount()
            int r12 = r0.f333583n
            int r11 = r11 - r12
            int r12 = r0.f333584o
            int r11 = r11 - r12
            if (r11 != r10) goto L_0x0048
            if (r1 != r9) goto L_0x0048
            int r11 = r24.mo163094F4()
            int r11 = r11 / r9
            goto L_0x0049
        L_0x0048:
            r11 = 0
        L_0x0049:
            r3.setMarginStart(r11)
            android.view.View r9 = r2.f44854d
            r9.setLayoutParams(r3)
            java.util.concurrent.CopyOnWriteArrayList<d82.a> r3 = r0.f333577e
            java.lang.Object r3 = r3.get(r1)
            d82.a r3 = (d82.C107025a) r3
            if (r3 == 0) goto L_0x005e
            java.lang.String r3 = r3.f320418e
            goto L_0x005f
        L_0x005e:
            r3 = 0
        L_0x005f:
            r2.f333612I = r3
            java.util.concurrent.CopyOnWriteArrayList<d82.a> r3 = r0.f333577e
            java.lang.Object r3 = r3.get(r1)
            d82.a r3 = (d82.C107025a) r3
            if (r3 == 0) goto L_0x0072
            com.tencent.pb.talkroom.sdk.MultiTalkGroupMember r3 = r3.f320414a
            if (r3 == 0) goto L_0x0072
            java.lang.String r3 = r3.f320048d
            goto L_0x0073
        L_0x0072:
            r3 = 0
        L_0x0073:
            r2.f333613J = r3
            com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r3 = r2.f333625z
            java.lang.String r11 = ""
            if (r3 == 0) goto L_0x00ac
            java.util.concurrent.CopyOnWriteArrayList<d82.a> r12 = r0.f333577e
            java.lang.Object r12 = r12.get(r1)
            d82.a r12 = (d82.C107025a) r12
            if (r12 == 0) goto L_0x008c
            com.tencent.pb.talkroom.sdk.MultiTalkGroupMember r12 = r12.f320414a
            if (r12 == 0) goto L_0x008c
            java.lang.String r12 = r12.f320048d
            goto L_0x008d
        L_0x008c:
            r12 = 0
        L_0x008d:
            if (r12 != 0) goto L_0x0090
            r12 = r11
        L_0x0090:
            java.util.concurrent.CopyOnWriteArrayList<d82.a> r13 = r0.f333577e
            java.lang.Object r13 = r13.get(r1)
            d82.a r13 = (d82.C107025a) r13
            if (r13 == 0) goto L_0x00a1
            com.tencent.pb.talkroom.sdk.MultiTalkGroupMember r13 = r13.f320414a
            if (r13 == 0) goto L_0x00a1
            java.lang.String r13 = r13.f320048d
            goto L_0x00a2
        L_0x00a1:
            r13 = 0
        L_0x00a2:
            if (r13 != 0) goto L_0x00a5
            r13 = r11
        L_0x00a5:
            int r13 = c92.C104331h.m139311c(r13)
            r3.mo150925g(r12, r13)
        L_0x00ac:
            com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r3 = r2.f333625z
            if (r3 != 0) goto L_0x00b1
            goto L_0x00b4
        L_0x00b1:
            r3.setIndex(r1)
        L_0x00b4:
            com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r3 = r2.f333625z
            if (r3 != 0) goto L_0x00b9
            goto L_0x00c0
        L_0x00b9:
            int r12 = r3.getIndex()
            r3.setPosition(r12)
        L_0x00c0:
            com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r3 = r2.f333625z
            if (r3 == 0) goto L_0x00d5
            java.util.concurrent.CopyOnWriteArrayList<d82.a> r12 = r0.f333577e
            java.lang.Object r12 = r12.get(r1)
            d82.a r12 = (d82.C107025a) r12
            if (r12 == 0) goto L_0x00d1
            android.view.View$OnClickListener r12 = r12.f320415b
            goto L_0x00d2
        L_0x00d1:
            r12 = 0
        L_0x00d2:
            r3.setOnClickListener(r12)
        L_0x00d5:
            java.util.concurrent.CopyOnWriteArrayList<d82.a> r3 = r0.f333577e
            java.lang.Object r3 = r3.get(r1)
            d82.a r3 = (d82.C107025a) r3
            if (r3 == 0) goto L_0x00eb
            com.tencent.pb.talkroom.sdk.MultiTalkGroupMember r3 = r3.f320414a
            if (r3 == 0) goto L_0x00eb
            int r3 = r3.f320050f
            r12 = 10
            if (r3 != r12) goto L_0x00eb
            r3 = 1
            goto L_0x00ec
        L_0x00eb:
            r3 = 0
        L_0x00ec:
            java.lang.String r12 = "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable"
            r13 = 4
            if (r3 != 0) goto L_0x01aa
            android.view.View r3 = r2.f333604A
            if (r3 != 0) goto L_0x00f6
            goto L_0x013f
        L_0x00f6:
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r14 = k20.C60958c.f173611a
            r15.mo10233c(r7)
            java.lang.Object[] r16 = r15.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutAdapter"
            java.lang.String r18 = "onBindViewHolder"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder;I)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r14 = r3
            r9 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r9 = r9.mo10231a(r6)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r3.setVisibility(r9)
            java.lang.String r15 = "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutAdapter"
            java.lang.String r16 = "onBindViewHolder"
            java.lang.String r17 = "(Lcom/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder;I)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
        L_0x013f:
            com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r3 = r2.f333625z
            if (r3 != 0) goto L_0x0144
            goto L_0x0147
        L_0x0144:
            r3.setImportantForAccessibility(r13)
        L_0x0147:
            android.widget.ImageView r3 = r2.f333608E
            if (r3 == 0) goto L_0x0150
            android.graphics.drawable.Drawable r3 = r3.getBackground()
            goto L_0x0151
        L_0x0150:
            r3 = 0
        L_0x0151:
            if (r3 == 0) goto L_0x017f
            android.widget.ImageView r3 = r2.f333608E
            if (r3 != 0) goto L_0x0158
            goto L_0x015b
        L_0x0158:
            r3.setVisibility(r6)
        L_0x015b:
            android.widget.ImageView r3 = r2.f333608E
            if (r3 == 0) goto L_0x0164
            android.graphics.drawable.Drawable r3 = r3.getBackground()
            goto L_0x0165
        L_0x0164:
            r3 = 0
        L_0x0165:
            gy3.C87412m.m108592e(r3, r12)
            android.graphics.drawable.AnimationDrawable r3 = (android.graphics.drawable.AnimationDrawable) r3
            r3.stop()
            android.widget.ImageView r3 = r2.f333608E
            if (r3 == 0) goto L_0x0176
            android.graphics.drawable.Drawable r3 = r3.getBackground()
            goto L_0x0177
        L_0x0176:
            r3 = 0
        L_0x0177:
            gy3.C87412m.m108592e(r3, r12)
            android.graphics.drawable.AnimationDrawable r3 = (android.graphics.drawable.AnimationDrawable) r3
            r3.start()
        L_0x017f:
            java.util.HashSet<java.lang.String> r3 = r0.f333581i
            if (r3 == 0) goto L_0x019d
            java.util.concurrent.CopyOnWriteArrayList<d82.a> r9 = r0.f333577e
            java.lang.Object r9 = r9.get(r1)
            d82.a r9 = (d82.C107025a) r9
            if (r9 == 0) goto L_0x0194
            com.tencent.pb.talkroom.sdk.MultiTalkGroupMember r9 = r9.f320414a
            if (r9 == 0) goto L_0x0194
            java.lang.String r9 = r9.f320048d
            goto L_0x0195
        L_0x0194:
            r9 = 0
        L_0x0195:
            boolean r3 = sx3.C110818d0.m150903D(r3, r9)
            if (r3 != r8) goto L_0x019d
            r3 = 1
            goto L_0x019e
        L_0x019d:
            r3 = 0
        L_0x019e:
            if (r3 != 0) goto L_0x0265
            v82.a r3 = new v82.a
            r3.<init>(r0)
            r2.mo163112G(r3, r6)
            goto L_0x0265
        L_0x01aa:
            java.util.HashSet<java.lang.String> r3 = r0.f333581i
            if (r3 == 0) goto L_0x01c8
            java.util.concurrent.CopyOnWriteArrayList<d82.a> r9 = r0.f333577e
            java.lang.Object r9 = r9.get(r1)
            d82.a r9 = (d82.C107025a) r9
            if (r9 == 0) goto L_0x01bf
            com.tencent.pb.talkroom.sdk.MultiTalkGroupMember r9 = r9.f320414a
            if (r9 == 0) goto L_0x01bf
            java.lang.String r9 = r9.f320048d
            goto L_0x01c0
        L_0x01bf:
            r9 = 0
        L_0x01c0:
            boolean r3 = sx3.C110818d0.m150903D(r3, r9)
            if (r3 != r8) goto L_0x01c8
            r3 = 1
            goto L_0x01c9
        L_0x01c8:
            r3 = 0
        L_0x01c9:
            if (r3 != 0) goto L_0x01f8
            java.util.concurrent.CopyOnWriteArrayList<d82.a> r3 = r0.f333577e
            java.lang.Object r3 = r3.get(r1)
            d82.a r3 = (d82.C107025a) r3
            if (r3 == 0) goto L_0x01dc
            com.tencent.pb.talkroom.sdk.MultiTalkGroupMember r3 = r3.f320414a
            if (r3 == 0) goto L_0x01dc
            java.lang.String r3 = r3.f320048d
            goto L_0x01dd
        L_0x01dc:
            r3 = 0
        L_0x01dd:
            java.lang.String r9 = eb0.C75592q0.m90789s()
            boolean r3 = gy3.C87412m.m108589b(r3, r9)
            if (r3 == 0) goto L_0x01f0
            v82.b r3 = new v82.b
            r3.<init>(r0)
            r2.mo163112G(r3, r6)
            goto L_0x01f8
        L_0x01f0:
            v82.c r3 = new v82.c
            r3.<init>(r0)
            r2.mo163112G(r3, r8)
        L_0x01f8:
            android.view.View r3 = r2.f333604A
            if (r3 != 0) goto L_0x01fd
            goto L_0x0237
        L_0x01fd:
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r14 = k20.C60958c.f173611a
            r9.mo10233c(r5)
            java.lang.Object[] r15 = r9.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutAdapter"
            java.lang.String r17 = "onBindViewHolder"
            java.lang.String r18 = "(Lcom/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder;I)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r3
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r9 = r9.mo10231a(r6)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r3.setVisibility(r9)
            java.lang.String r15 = "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutAdapter"
            java.lang.String r16 = "onBindViewHolder"
            java.lang.String r17 = "(Lcom/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder;I)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
        L_0x0237:
            com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r3 = r2.f333625z
            if (r3 != 0) goto L_0x023c
            goto L_0x023f
        L_0x023c:
            r3.setImportantForAccessibility(r8)
        L_0x023f:
            android.widget.ImageView r3 = r2.f333608E
            if (r3 == 0) goto L_0x0248
            android.graphics.drawable.Drawable r3 = r3.getBackground()
            goto L_0x0249
        L_0x0248:
            r3 = 0
        L_0x0249:
            if (r3 == 0) goto L_0x025d
            android.widget.ImageView r3 = r2.f333608E
            if (r3 == 0) goto L_0x0254
            android.graphics.drawable.Drawable r3 = r3.getBackground()
            goto L_0x0255
        L_0x0254:
            r3 = 0
        L_0x0255:
            gy3.C87412m.m108592e(r3, r12)
            android.graphics.drawable.AnimationDrawable r3 = (android.graphics.drawable.AnimationDrawable) r3
            r3.stop()
        L_0x025d:
            android.widget.ImageView r3 = r2.f333608E
            if (r3 != 0) goto L_0x0262
            goto L_0x0265
        L_0x0262:
            r3.setVisibility(r4)
        L_0x0265:
            java.util.concurrent.CopyOnWriteArrayList<d82.a> r3 = r0.f333577e
            java.lang.Object r3 = r3.get(r1)
            d82.a r3 = (d82.C107025a) r3
            if (r3 == 0) goto L_0x0276
            com.tencent.pb.talkroom.sdk.MultiTalkGroupMember r3 = r3.f320414a
            if (r3 == 0) goto L_0x0276
            java.lang.String r3 = r3.f320048d
            goto L_0x0277
        L_0x0276:
            r3 = 0
        L_0x0277:
            if (r3 != 0) goto L_0x027a
            goto L_0x027b
        L_0x027a:
            r11 = r3
        L_0x027b:
            com.tencent.mm.plugin.multitalk.model.a r3 = r0.f333585p
            if (r3 == 0) goto L_0x0294
            android.util.ArrayMap<java.lang.String, java.lang.Integer> r3 = r3.f314546j
            java.lang.Object r3 = r3.get(r11)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 != 0) goto L_0x028b
            r3 = 0
            goto L_0x028f
        L_0x028b:
            int r3 = r3.intValue()
        L_0x028f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0295
        L_0x0294:
            r3 = 0
        L_0x0295:
            if (r3 != 0) goto L_0x0298
            goto L_0x029e
        L_0x0298:
            int r9 = r3.intValue()
            if (r9 == r10) goto L_0x02cd
        L_0x029e:
            if (r3 != 0) goto L_0x02a1
            goto L_0x02a8
        L_0x02a1:
            int r3 = r3.intValue()
            if (r3 != r13) goto L_0x02a8
            goto L_0x02cd
        L_0x02a8:
            java.util.HashSet<java.lang.String> r3 = r0.f333579g
            if (r3 == 0) goto L_0x02b3
            boolean r3 = r3.contains(r11)
            if (r3 != r8) goto L_0x02b3
            goto L_0x02b4
        L_0x02b3:
            r8 = 0
        L_0x02b4:
            if (r8 == 0) goto L_0x02c2
            boolean r3 = r0.f333578f
            if (r3 != 0) goto L_0x02c2
            com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r3 = r2.f333625z
            if (r3 == 0) goto L_0x02c9
            r3.mo150924f()
            goto L_0x02c9
        L_0x02c2:
            com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r3 = r2.f333625z
            if (r3 == 0) goto L_0x02c9
            r3.mo150921c()
        L_0x02c9:
            r2.mo163111F(r13)
            goto L_0x030b
        L_0x02cd:
            com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r3 = r2.f333625z
            if (r3 == 0) goto L_0x02d4
            r3.mo150923e()
        L_0x02d4:
            r2.mo163111F(r6)
            com.tencent.mm.plugin.multitalk.model.a r3 = r0.f333585p
            if (r3 == 0) goto L_0x0305
            android.util.ArrayMap<java.lang.String, java.lang.Integer> r3 = r3.f314546j
            java.lang.Object r3 = r3.get(r11)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x0300
            int r3 = r3.intValue()
            if (r3 == r10) goto L_0x02ee
            if (r3 == r13) goto L_0x02ee
            goto L_0x0300
        L_0x02ee:
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r3 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            com.tencent.mm.plugin.multitalk.model.g0 r3 = r3.mo150672o()
            int r3 = r3.mo150748a(r11)
            r9 = 102(0x66, float:1.43E-43)
            if (r3 != r9) goto L_0x0300
            r3 = 1
            goto L_0x0301
        L_0x0300:
            r3 = 0
        L_0x0301:
            if (r3 != r8) goto L_0x0305
            r3 = 1
            goto L_0x0306
        L_0x0305:
            r3 = 0
        L_0x0306:
            if (r3 == 0) goto L_0x030b
            r2.mo163109D(r8, r6)
        L_0x030b:
            android.view.View r3 = r2.f333618P
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            r8.mo10233c(r7)
            java.lang.Object[] r10 = r8.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutAdapter"
            java.lang.String r12 = "onBindViewHolder"
            java.lang.String r13 = "(Lcom/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder;I)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r3
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r7 = r8.mo10231a(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r3.setVisibility(r7)
            java.lang.String r10 = "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutAdapter"
            java.lang.String r11 = "onBindViewHolder"
            java.lang.String r12 = "(Lcom/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder;I)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            android.view.View r3 = r2.f333619Q
            k20.a r7 = new k20.a
            r7.<init>()
            r7.mo10233c(r5)
            java.lang.Object[] r17 = r7.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutAdapter"
            java.lang.String r19 = "onBindViewHolder"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder;I)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r3
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r7 = r7.mo10231a(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r3.setVisibility(r7)
            java.lang.String r17 = "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutAdapter"
            java.lang.String r18 = "onBindViewHolder"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder;I)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.view.View r3 = r2.f333620R
            k20.a r15 = new k20.a
            r15.<init>()
            r15.mo10233c(r5)
            java.lang.Object[] r8 = r15.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutAdapter"
            java.lang.String r10 = "onBindViewHolder"
            java.lang.String r11 = "(Lcom/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder;I)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r3
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r5 = r15.mo10231a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r8 = "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutAdapter"
            java.lang.String r9 = "onBindViewHolder"
            java.lang.String r10 = "(Lcom/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder;I)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r3 = eb0.C75592q0.m90789s()
            java.util.concurrent.CopyOnWriteArrayList<d82.a> r5 = r0.f333577e
            java.lang.Object r1 = r5.get(r1)
            d82.a r1 = (d82.C107025a) r1
            if (r1 == 0) goto L_0x03d1
            com.tencent.pb.talkroom.sdk.MultiTalkGroupMember r1 = r1.f320414a
            if (r1 == 0) goto L_0x03d1
            java.lang.String r9 = r1.f320048d
            goto L_0x03d2
        L_0x03d1:
            r9 = 0
        L_0x03d2:
            boolean r1 = gy3.C87412m.m108589b(r3, r9)
            if (r1 == 0) goto L_0x03e5
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r1 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            boolean r1 = r1.f314493e
            if (r1 == 0) goto L_0x03e5
            r2.mo163110E(r6)
            goto L_0x05a1
        L_0x03e5:
            r2.mo163110E(r4)
            goto L_0x05a1
        L_0x03ea:
            int r3 = r0.getItemViewType(r1)
            r4 = -1
            if (r3 != r9) goto L_0x04bd
            android.view.View r1 = r2.f333618P
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            r3.mo10233c(r5)
            java.lang.Object[] r12 = r3.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutAdapter"
            java.lang.String r14 = "onBindViewHolder"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder;I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r3 = r3.mo10231a(r6)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r12 = "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutAdapter"
            java.lang.String r13 = "onBindViewHolder"
            java.lang.String r14 = "(Lcom/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder;I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            android.content.Context r1 = r0.f333576d
            r3 = 52
            int r1 = kg3.C76577a.m92151b(r1, r3)
            android.content.Context r3 = r0.f333576d
            int r3 = com.tencent.p014mm.p136ui.C85875k4.m106198o(r3)
            int r1 = r1 + r3
            android.view.View r3 = r2.f333619Q
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams
            r8.<init>(r4, r1)
            r3.setLayoutParams(r8)
            android.view.View r1 = r2.f333619Q
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r7)
            java.lang.Object[] r10 = r3.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutAdapter"
            java.lang.String r12 = "onBindViewHolder"
            java.lang.String r13 = "(Lcom/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder;I)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r1
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r3 = r3.mo10231a(r6)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r10 = "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutAdapter"
            java.lang.String r11 = "onBindViewHolder"
            java.lang.String r12 = "(Lcom/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder;I)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            android.view.View r1 = r2.f333620R
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r5)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutAdapter"
            java.lang.String r19 = "onBindViewHolder"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder;I)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r2 = r2.mo10231a(r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r17 = "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutAdapter"
            java.lang.String r18 = "onBindViewHolder"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder;I)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x05a1
        L_0x04bd:
            int r1 = r0.getItemViewType(r1)
            if (r1 != r10) goto L_0x05a1
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            int r3 = r24.mo163094F4()
            int r9 = r24.mo163094F4()
            r1.<init>(r3, r9)
            r1.addRule(r8)
            android.view.View r3 = r2.f44854d
            r3.setLayoutParams(r1)
            android.view.View r1 = r2.f333618P
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            r3.mo10233c(r5)
            java.lang.Object[] r9 = r3.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutAdapter"
            java.lang.String r11 = "onBindViewHolder"
            java.lang.String r12 = "(Lcom/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder;I)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r1
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r3 = r3.mo10231a(r6)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r9 = "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutAdapter"
            java.lang.String r10 = "onBindViewHolder"
            java.lang.String r11 = "(Lcom/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder;I)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            android.view.View r1 = r2.f333619Q
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r5)
            java.lang.Object[] r16 = r3.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutAdapter"
            java.lang.String r18 = "onBindViewHolder"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder;I)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r1
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r3 = r3.mo10231a(r6)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r16 = "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutAdapter"
            java.lang.String r17 = "onBindViewHolder"
            java.lang.String r18 = "(Lcom/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder;I)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            android.content.Context r1 = r0.f333576d
            r3 = 32
            int r1 = kg3.C76577a.m92151b(r1, r3)
            android.content.Context r3 = r0.f333576d
            int r3 = com.tencent.p014mm.p136ui.C85875k4.m106198o(r3)
            int r1 = r1 + r3
            android.view.View r3 = r2.f333620R
            android.widget.RelativeLayout$LayoutParams r5 = new android.widget.RelativeLayout$LayoutParams
            r5.<init>(r4, r1)
            r3.setLayoutParams(r5)
            android.view.View r1 = r2.f333620R
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r7)
            java.lang.Object[] r9 = r2.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutAdapter"
            java.lang.String r11 = "onBindViewHolder"
            java.lang.String r12 = "(Lcom/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder;I)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r1
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r2 = r2.mo10231a(r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r9 = "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutAdapter"
            java.lang.String r10 = "onBindViewHolder"
            java.lang.String r11 = "(Lcom/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder;I)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
        L_0x05a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v82.C111424d.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$z, int):void");
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f333576d).inflate(C0966R.C0971layout.b_w, viewGroup, false);
        C87412m.m108593f(inflate, "from(context).inflate(R.…atar_cell, parent, false)");
        return new C111433e(inflate);
    }
}
