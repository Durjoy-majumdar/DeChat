package ck2;

import a14.C0000n0;
import bl3.C39818r;
import com.tencent.p014mm.plugin.ringtone.uic.RingtoneExclusiveMainUIC;
import d14.C45253g;
import d14.C58050i1;
import d14.C58052j1;
import fy3.C32227p;
import kotlin.ResultKt;
import qj2.C63183a;
import rx3.C13598b0;
import rx3.C13600d;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.uic.RingtoneExclusiveMainUIC$bindDataSource$1", mo125469f = "RingtoneExclusiveMainUIC.kt", mo125470l = {108}, mo125471m = "invokeSuspend")
/* renamed from: ck2.i */
public final class C54911i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f153910d;

    /* renamed from: e */
    public final /* synthetic */ RingtoneExclusiveMainUIC f153911e;

    /* renamed from: ck2.i$a */
    public static final class C54912a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ RingtoneExclusiveMainUIC f153912d;

        public C54912a(RingtoneExclusiveMainUIC ringtoneExclusiveMainUIC) {
            this.f153912d = ringtoneExclusiveMainUIC;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
            r2 = r2.getData();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(java.lang.Object r18, wx3.C15601d r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                qj2.a$a r1 = (qj2.C63183a.C63184a) r1
                boolean r2 = r1 instanceof qj2.C63183a.C63184a.C63185a
                if (r2 == 0) goto L_0x03be
                qj2.a$a$a r1 = (qj2.C63183a.C63184a.C63185a) r1
                int r2 = r1.f179279b
                r3 = 1
                r4 = 0
                if (r2 == r3) goto L_0x01aa
                r5 = 4
                java.lang.String r6 = " and "
                java.lang.String r7 = "SimpleUIComponent"
                if (r2 == r5) goto L_0x010c
                r5 = 5
                if (r2 == r5) goto L_0x00c1
                com.tencent.mm.plugin.ringtone.uic.RingtoneExclusiveMainUIC r2 = r0.f153912d
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.a> r2 = r2.f164091j
                if (r2 == 0) goto L_0x002d
                java.util.List r2 = r2.getData()
                if (r2 == 0) goto L_0x002d
                int r2 = r2.size()
                goto L_0x002e
            L_0x002d:
                r2 = 0
            L_0x002e:
                java.util.List<pj2.a> r5 = r1.f179278a
                if (r5 == 0) goto L_0x0094
                com.tencent.mm.plugin.ringtone.uic.RingtoneExclusiveMainUIC r6 = r0.f153912d
                java.util.Iterator r5 = r5.iterator()
            L_0x0038:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L_0x0094
                java.lang.Object r7 = r5.next()
                pj2.a r7 = (pj2.C62318a) r7
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.a> r8 = r6.f164091j
                r9 = 0
                if (r8 == 0) goto L_0x0074
                java.util.List r8 = r8.getData()
                if (r8 == 0) goto L_0x0074
                java.util.Iterator r8 = r8.iterator()
            L_0x0053:
                boolean r10 = r8.hasNext()
                if (r10 == 0) goto L_0x0072
                java.lang.Object r10 = r8.next()
                r11 = r10
                pj2.a r11 = (pj2.C62318a) r11
                long r11 = r11.getItemId()
                long r13 = r7.getItemId()
                int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r15 != 0) goto L_0x006e
                r11 = 1
                goto L_0x006f
            L_0x006e:
                r11 = 0
            L_0x006f:
                if (r11 == 0) goto L_0x0053
                r9 = r10
            L_0x0072:
                pj2.a r9 = (pj2.C62318a) r9
            L_0x0074:
                if (r9 != 0) goto L_0x0084
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.a> r8 = r6.f164091j
                if (r8 == 0) goto L_0x0038
                java.util.List r8 = r8.getData()
                if (r8 == 0) goto L_0x0038
                r8.add(r7)
                goto L_0x0038
            L_0x0084:
                r9.f177145e = r4
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.a> r7 = r6.f164091j
                if (r7 == 0) goto L_0x0038
                long r8 = r9.getItemId()
                java.lang.Boolean r10 = java.lang.Boolean.FALSE
                r7.mo85799f6(r8, r10)
                goto L_0x0038
            L_0x0094:
                com.tencent.mm.plugin.ringtone.uic.RingtoneExclusiveMainUIC r5 = r0.f153912d
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.a> r5 = r5.f164091j
                if (r5 == 0) goto L_0x00a9
                java.util.List r5 = r5.getData()
                if (r5 == 0) goto L_0x00a9
                boolean r5 = r5.isEmpty()
                r5 = r5 ^ r3
                if (r5 != r3) goto L_0x00a9
                r5 = 1
                goto L_0x00aa
            L_0x00a9:
                r5 = 0
            L_0x00aa:
                if (r5 == 0) goto L_0x01b4
                com.tencent.mm.plugin.ringtone.uic.RingtoneExclusiveMainUIC r5 = r0.f153912d
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.a> r5 = r5.f164091j
                if (r5 == 0) goto L_0x01b4
                java.util.List<pj2.a> r1 = r1.f179278a
                if (r1 == 0) goto L_0x00bb
                int r1 = r1.size()
                goto L_0x00bc
            L_0x00bb:
                r1 = 0
            L_0x00bc:
                r5.notifyItemRangeChanged(r2, r1)
                goto L_0x01b4
            L_0x00c1:
                java.util.List<pj2.a> r1 = r1.f179278a
                if (r1 == 0) goto L_0x01b4
                com.tencent.mm.plugin.ringtone.uic.RingtoneExclusiveMainUIC r2 = r0.f153912d
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                r5.addAll(r1)
                r2.mo80837d3(r5)
                java.util.Iterator r1 = r5.iterator()
            L_0x00d6:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x0103
                java.lang.Object r5 = r1.next()
                pj2.a r5 = (pj2.C62318a) r5
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "current member  data must be init from cache "
                r8.append(r9)
                ve3.i r9 = r5.f177144d
                java.lang.String r9 = r9.f147588d
                r8.append(r9)
                r8.append(r6)
                ve3.i r5 = r5.f177144d
                r8.append(r5)
                java.lang.String r5 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
                goto L_0x00d6
            L_0x0103:
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.a> r1 = r2.f164091j
                if (r1 == 0) goto L_0x01b4
                r1.notifyDataSetChanged()
                goto L_0x01b4
            L_0x010c:
                java.util.List<pj2.a> r1 = r1.f179278a
                if (r1 == 0) goto L_0x01b4
                com.tencent.mm.plugin.ringtone.uic.RingtoneExclusiveMainUIC r2 = r0.f153912d
                java.util.Iterator r1 = r1.iterator()
            L_0x0116:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x01b4
                java.lang.Object r5 = r1.next()
                pj2.a r5 = (pj2.C62318a) r5
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "current member  data must be delete "
                r8.append(r9)
                ve3.i r9 = r5.f177144d
                java.lang.String r9 = r9.f147588d
                r8.append(r9)
                r8.append(r6)
                ve3.i r9 = r5.f177144d
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.a> r9 = r2.f164091j
                if (r9 == 0) goto L_0x018b
                java.util.List r9 = r9.getData()
                if (r9 == 0) goto L_0x018b
                java.util.Iterator r9 = r9.iterator()
            L_0x0155:
                boolean r10 = r9.hasNext()
                if (r10 == 0) goto L_0x018b
                java.lang.Object r10 = r9.next()
                pj2.a r10 = (pj2.C62318a) r10
                long r11 = r10.getItemId()
                long r13 = r5.getItemId()
                int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r15 == 0) goto L_0x0171
                r8.add(r10)
                goto L_0x0155
            L_0x0171:
                boolean r10 = r10.f177145e
                if (r10 == 0) goto L_0x0155
                bl3.r r10 = bl3.C39818r.f106831a
                androidx.appcompat.app.AppCompatActivity r11 = r2.getActivity()
                bl3.r$a r10 = r10.mo62444c(r11)
                java.lang.Class<ck2.d0> r11 = ck2.C54883d0.class
                androidx.lifecycle.i0 r10 = r10.mo75002a(r11)
                ck2.d0 r10 = (ck2.C54883d0) r10
                r10.mo75823T2()
                goto L_0x0155
            L_0x018b:
                r2.mo80837d3(r8)
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.a> r8 = r2.f164091j
                if (r8 == 0) goto L_0x0116
                long r12 = r5.getItemId()
                r14 = 0
                r15 = 2
                r16 = 0
                r11 = r8
                androidx.recyclerview.widget.RecyclerView$z r5 = jq3.C60898l.m71330b6(r11, r12, r14, r15, r16)
                if (r5 == 0) goto L_0x0116
                int r5 = r5.mo17363j()
                r8.notifyItemRemoved(r5)
                goto L_0x0116
            L_0x01aa:
                com.tencent.mm.plugin.ringtone.uic.RingtoneExclusiveMainUIC r1 = r0.f153912d
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r1.mo80837d3(r2)
            L_0x01b4:
                com.tencent.mm.plugin.ringtone.uic.RingtoneExclusiveMainUIC r1 = r0.f153912d
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.a> r2 = r1.f164091j
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                if (r2 == 0) goto L_0x01cb
                java.util.List r2 = r2.getData()
                if (r2 == 0) goto L_0x01cb
                boolean r2 = r2.isEmpty()
                if (r2 != r3) goto L_0x01cb
                goto L_0x01cc
            L_0x01cb:
                r3 = 0
            L_0x01cc:
                r2 = 8
                if (r3 == 0) goto L_0x02b2
                rx3.g r3 = r1.f164087f
                rx3.n r3 = (rx3.C36570n) r3
                java.lang.Object r3 = r3.getValue()
                android.view.View r3 = (android.view.View) r3
                k20.a r14 = new k20.a
                r14.<init>()
                java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
                r14.mo10233c(r5)
                java.lang.Object[] r7 = r14.mo10232b()
                java.lang.String r8 = "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC"
                java.lang.String r9 = "refreshAddUI"
                java.lang.String r10 = "()V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                r6 = r3
                j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
                java.lang.Object r5 = r14.mo10231a(r4)
                java.lang.Integer r5 = (java.lang.Integer) r5
                int r5 = r5.intValue()
                r3.setVisibility(r5)
                java.lang.String r7 = "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC"
                java.lang.String r8 = "refreshAddUI"
                java.lang.String r9 = "()V"
                java.lang.String r10 = "android/view/View_EXEC_"
                java.lang.String r11 = "setVisibility"
                java.lang.String r12 = "(I)V"
                j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
                rx3.g r5 = r1.f164088g
                rx3.n r5 = (rx3.C36570n) r5
                java.lang.Object r5 = r5.getValue()
                android.view.View r5 = (android.view.View) r5
                if (r5 != 0) goto L_0x0225
                goto L_0x0266
            L_0x0225:
                k20.a r14 = new k20.a
                r14.<init>()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
                r14.mo10233c(r6)
                java.lang.Object[] r7 = r14.mo10232b()
                java.lang.String r8 = "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC"
                java.lang.String r9 = "refreshAddUI"
                java.lang.String r10 = "()V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                r6 = r5
                j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
                java.lang.Object r6 = r14.mo10231a(r4)
                java.lang.Integer r6 = (java.lang.Integer) r6
                int r6 = r6.intValue()
                r5.setVisibility(r6)
                java.lang.String r7 = "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC"
                java.lang.String r8 = "refreshAddUI"
                java.lang.String r9 = "()V"
                java.lang.String r10 = "android/view/View_EXEC_"
                java.lang.String r11 = "setVisibility"
                java.lang.String r12 = "(I)V"
                r6 = r5
                j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            L_0x0266:
                rx3.g r5 = r1.f164090i
                rx3.n r5 = (rx3.C36570n) r5
                java.lang.Object r5 = r5.getValue()
                android.view.View r5 = (android.view.View) r5
                k20.a r14 = new k20.a
                r14.<init>()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r14.mo10233c(r2)
                java.lang.Object[] r7 = r14.mo10232b()
                java.lang.String r8 = "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC"
                java.lang.String r9 = "refreshAddUI"
                java.lang.String r10 = "()V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                r6 = r5
                j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
                java.lang.Object r2 = r14.mo10231a(r4)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r5.setVisibility(r2)
                java.lang.String r7 = "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC"
                java.lang.String r8 = "refreshAddUI"
                java.lang.String r9 = "()V"
                java.lang.String r10 = "android/view/View_EXEC_"
                java.lang.String r11 = "setVisibility"
                java.lang.String r12 = "(I)V"
                j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
                goto L_0x038e
            L_0x02b2:
                rx3.g r3 = r1.f164088g
                rx3.n r3 = (rx3.C36570n) r3
                java.lang.Object r3 = r3.getValue()
                android.view.View r3 = (android.view.View) r3
                k20.a r14 = new k20.a
                r14.<init>()
                java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
                r14.mo10233c(r5)
                java.lang.Object[] r7 = r14.mo10232b()
                java.lang.String r8 = "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC"
                java.lang.String r9 = "refreshAddUI"
                java.lang.String r10 = "()V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                r6 = r3
                j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
                java.lang.Object r6 = r14.mo10231a(r4)
                java.lang.Integer r6 = (java.lang.Integer) r6
                int r6 = r6.intValue()
                r3.setVisibility(r6)
                java.lang.String r7 = "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC"
                java.lang.String r8 = "refreshAddUI"
                java.lang.String r9 = "()V"
                java.lang.String r10 = "android/view/View_EXEC_"
                java.lang.String r11 = "setVisibility"
                java.lang.String r12 = "(I)V"
                r6 = r3
                j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
                rx3.g r6 = r1.f164087f
                rx3.n r6 = (rx3.C36570n) r6
                java.lang.Object r6 = r6.getValue()
                android.view.View r6 = (android.view.View) r6
                if (r6 != 0) goto L_0x0308
                goto L_0x0348
            L_0x0308:
                k20.a r15 = new k20.a
                r15.<init>()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r15.mo10233c(r2)
                java.lang.Object[] r8 = r15.mo10232b()
                java.lang.String r9 = "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC"
                java.lang.String r10 = "refreshAddUI"
                java.lang.String r11 = "()V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                r7 = r6
                j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                java.lang.Object r2 = r15.mo10231a(r4)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r6.setVisibility(r2)
                java.lang.String r8 = "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC"
                java.lang.String r9 = "refreshAddUI"
                java.lang.String r10 = "()V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            L_0x0348:
                rx3.g r2 = r1.f164090i
                rx3.n r2 = (rx3.C36570n) r2
                java.lang.Object r2 = r2.getValue()
                android.view.View r2 = (android.view.View) r2
                k20.a r14 = new k20.a
                r14.<init>()
                r14.mo10233c(r5)
                java.lang.Object[] r7 = r14.mo10232b()
                java.lang.String r8 = "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC"
                java.lang.String r9 = "refreshAddUI"
                java.lang.String r10 = "()V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                r6 = r2
                j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
                java.lang.Object r4 = r14.mo10231a(r4)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r2.setVisibility(r4)
                java.lang.String r7 = "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC"
                java.lang.String r8 = "refreshAddUI"
                java.lang.String r9 = "()V"
                java.lang.String r10 = "android/view/View_EXEC_"
                java.lang.String r11 = "setVisibility"
                java.lang.String r12 = "(I)V"
                j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            L_0x038e:
                ck2.k r2 = new ck2.k
                r2.<init>(r1)
                r3.setOnClickListener(r2)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r3.getHitRect(r1)
                int r2 = r1.right
                int r2 = r2 + 100
                r1.right = r2
                int r2 = r1.bottom
                int r2 = r2 + 100
                r1.bottom = r2
                android.view.ViewParent r2 = r3.getParent()
                java.lang.String r4 = "null cannot be cast to non-null type android.view.View"
                gy3.C87412m.m108592e(r2, r4)
                android.view.View r2 = (android.view.View) r2
                android.view.TouchDelegate r4 = new android.view.TouchDelegate
                r4.<init>(r1, r3)
                r2.setTouchDelegate(r4)
            L_0x03be:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ck2.C54911i.C54912a.emit(java.lang.Object, wx3.d):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54911i(RingtoneExclusiveMainUIC ringtoneExclusiveMainUIC, C15601d<? super C54911i> dVar) {
        super(2, dVar);
        this.f153911e = ringtoneExclusiveMainUIC;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C54911i(this.f153911e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C54911i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C58050i1<C63183a.C63184a> i1Var;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f153910d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C63183a aVar2 = ((C54897h) C39818r.f106831a.mo62444c(this.f153911e.getActivity()).mo75002a(C54897h.class)).f153875g;
            if (aVar2 == null || (i1Var = aVar2.f179276h) == null) {
                return C13598b0.f38549a;
            }
            C54912a aVar3 = new C54912a(this.f153911e);
            this.f153910d = 1;
            if (((C58052j1) i1Var).mo31880a(aVar3, this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        throw new C13600d();
    }
}
