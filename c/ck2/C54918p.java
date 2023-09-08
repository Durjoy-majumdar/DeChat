package ck2;

import a14.C0000n0;
import bl3.C39818r;
import d14.C45252f;
import d14.C45253g;
import d14.C58100z0;
import fy3.C32227p;
import kotlin.ResultKt;
import p145dx.C58451o;
import pj2.C62328j;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.uic.RingtoneFinderAuthorMainUIC$bindDataSource$1", mo125469f = "RingtoneFinderAuthorMainUIC.kt", mo125470l = {92}, mo125471m = "invokeSuspend")
/* renamed from: ck2.p */
public final class C54918p extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f153929d;

    /* renamed from: e */
    public final /* synthetic */ C54920q f153930e;

    /* renamed from: ck2.p$a */
    public static final class C54919a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ C54920q f153931d;

        public C54919a(C54920q qVar) {
            this.f153931d = qVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
            r2 = ((jq3.C60898l.C60901e) r2).f173492d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00f3  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00f8  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x00b0 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(java.lang.Object r26, wx3.C15601d r27) {
            /*
                r25 = this;
                r0 = r25
                r1 = r26
                dx.o$a r1 = (p145dx.C58451o.C58452a) r1
                int r2 = r1.f167434b
                r3 = 0
                java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
                r5 = 8
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r6 = 4
                if (r2 != r6) goto L_0x0089
                ck2.q r1 = r0.f153931d
                jq3.l$a r2 = r1.f153935g
                r4 = 0
                if (r2 == 0) goto L_0x002d
                jq3.l$e r2 = (jq3.C60898l.C60901e) r2
                android.view.View r2 = r2.f173492d
                if (r2 == 0) goto L_0x002d
                r6 = 2131301660(0x7f09151c, float:1.8221384E38)
                android.view.View r2 = r2.findViewById(r6)
                com.tencent.mm.ui.widget.imageview.WeImageView r2 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r2
                goto L_0x002e
            L_0x002d:
                r2 = r4
            L_0x002e:
                if (r2 != 0) goto L_0x0031
                goto L_0x0034
            L_0x0031:
                r2.setVisibility(r3)
            L_0x0034:
                jq3.l$a r1 = r1.f153935g
                if (r1 == 0) goto L_0x0045
                jq3.l$e r1 = (jq3.C60898l.C60901e) r1
                android.view.View r1 = r1.f173492d
                if (r1 == 0) goto L_0x0045
                r2 = 2131308035(0x7f092e03, float:1.8234314E38)
                android.view.View r4 = r1.findViewById(r2)
            L_0x0045:
                if (r4 != 0) goto L_0x0049
                goto L_0x025b
            L_0x0049:
                k20.a r1 = new k20.a
                r1.<init>()
                java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
                r1.mo10233c(r5)
                java.lang.Object[] r7 = r1.mo10232b()
                java.lang.String r8 = "com/tencent/mm/plugin/ringtone/uic/RingtoneFinderAuthorMainUIC"
                java.lang.String r9 = "showFooterView"
                java.lang.String r10 = "()V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                r6 = r4
                j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
                java.lang.Object r1 = r1.mo10231a(r3)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                r4.setVisibility(r1)
                java.lang.String r7 = "com/tencent/mm/plugin/ringtone/uic/RingtoneFinderAuthorMainUIC"
                java.lang.String r8 = "showFooterView"
                java.lang.String r9 = "()V"
                java.lang.String r10 = "android/view/View_EXEC_"
                java.lang.String r11 = "setVisibility"
                java.lang.String r12 = "(I)V"
                j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
                goto L_0x025b
            L_0x0089:
                r7 = 1
                if (r2 != r7) goto L_0x0093
                ck2.q r1 = r0.f153931d
                r1.mo75848d3()
                goto L_0x025b
            L_0x0093:
                ck2.q r2 = r0.f153931d
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r2 = r2.f153933e
                if (r2 == 0) goto L_0x00a4
                java.util.List r2 = r2.getData()
                if (r2 == 0) goto L_0x00a4
                int r2 = r2.size()
                goto L_0x00a5
            L_0x00a4:
                r2 = 0
            L_0x00a5:
                java.util.List<pj2.d> r1 = r1.f167433a
                if (r1 == 0) goto L_0x0108
                ck2.q r8 = r0.f153931d
                java.util.Iterator r1 = r1.iterator()
                r9 = 0
            L_0x00b0:
                boolean r10 = r1.hasNext()
                if (r10 == 0) goto L_0x0109
                java.lang.Object r10 = r1.next()
                pj2.d r10 = (pj2.C62323d) r10
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r11 = r8.f153933e
                if (r11 == 0) goto L_0x00f5
                java.util.List r11 = r11.getData()
                if (r11 == 0) goto L_0x00f5
                boolean r12 = r11.isEmpty()
                if (r12 == 0) goto L_0x00cd
                goto L_0x00f0
            L_0x00cd:
                java.util.Iterator r11 = r11.iterator()
            L_0x00d1:
                boolean r12 = r11.hasNext()
                if (r12 == 0) goto L_0x00f0
                java.lang.Object r12 = r11.next()
                pj2.d r12 = (pj2.C62323d) r12
                long r12 = r12.getItemId()
                long r14 = r10.getItemId()
                int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r16 != 0) goto L_0x00eb
                r12 = 1
                goto L_0x00ec
            L_0x00eb:
                r12 = 0
            L_0x00ec:
                if (r12 == 0) goto L_0x00d1
                r11 = 0
                goto L_0x00f1
            L_0x00f0:
                r11 = 1
            L_0x00f1:
                if (r11 != r7) goto L_0x00f5
                r11 = 1
                goto L_0x00f6
            L_0x00f5:
                r11 = 0
            L_0x00f6:
                if (r11 == 0) goto L_0x00b0
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r11 = r8.f153933e
                if (r11 == 0) goto L_0x0105
                java.util.List r11 = r11.getData()
                if (r11 == 0) goto L_0x0105
                r11.add(r10)
            L_0x0105:
                int r9 = r9 + 1
                goto L_0x00b0
            L_0x0108:
                r9 = 0
            L_0x0109:
                ck2.q r1 = r0.f153931d
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r1 = r1.f153933e
                if (r1 == 0) goto L_0x011c
                java.util.List r1 = r1.getData()
                if (r1 == 0) goto L_0x011c
                boolean r1 = r1.isEmpty()
                if (r1 != r7) goto L_0x011c
                goto L_0x011d
            L_0x011c:
                r7 = 0
            L_0x011d:
                r1 = 2131312560(0x7f093fb0, float:1.8243492E38)
                r8 = 2131310310(0x7f0936e6, float:1.8238928E38)
                if (r7 == 0) goto L_0x01b9
                ck2.q r2 = r0.f153931d
                android.view.View r5 = r2.findViewById(r8)
                if (r5 != 0) goto L_0x012e
                goto L_0x016c
            L_0x012e:
                k20.a r7 = new k20.a
                r7.<init>()
                java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
                r7.mo10233c(r4)
                java.lang.Object[] r10 = r7.mo10232b()
                java.lang.String r11 = "com/tencent/mm/plugin/ringtone/uic/RingtoneFinderAuthorMainUIC"
                java.lang.String r12 = "showNoResultVIew"
                java.lang.String r13 = "()V"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                r9 = r5
                j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
                java.lang.Object r4 = r7.mo10231a(r3)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r5.setVisibility(r4)
                java.lang.String r10 = "com/tencent/mm/plugin/ringtone/uic/RingtoneFinderAuthorMainUIC"
                java.lang.String r11 = "showNoResultVIew"
                java.lang.String r12 = "()V"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r15 = "(I)V"
                j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            L_0x016c:
                android.view.View r1 = r2.findViewById(r1)
                if (r1 != 0) goto L_0x0174
                goto L_0x025b
            L_0x0174:
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
                java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
                r2.mo10233c(r4)
                java.lang.Object[] r17 = r2.mo10232b()
                java.lang.String r18 = "com/tencent/mm/plugin/ringtone/uic/RingtoneFinderAuthorMainUIC"
                java.lang.String r19 = "showNoResultVIew"
                java.lang.String r20 = "()V"
                java.lang.String r21 = "android/view/View_EXEC_"
                java.lang.String r22 = "setVisibility"
                java.lang.String r23 = "(I)V"
                r16 = r1
                j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
                java.lang.Object r2 = r2.mo10231a(r3)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r17 = "com/tencent/mm/plugin/ringtone/uic/RingtoneFinderAuthorMainUIC"
                java.lang.String r18 = "showNoResultVIew"
                java.lang.String r19 = "()V"
                java.lang.String r20 = "android/view/View_EXEC_"
                java.lang.String r21 = "setVisibility"
                java.lang.String r22 = "(I)V"
                j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
                goto L_0x025b
            L_0x01b9:
                ck2.q r6 = r0.f153931d
                android.view.View r7 = r6.findViewById(r8)
                if (r7 != 0) goto L_0x01c2
                goto L_0x0200
            L_0x01c2:
                k20.a r8 = new k20.a
                r8.<init>()
                java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
                r8.mo10233c(r5)
                java.lang.Object[] r11 = r8.mo10232b()
                java.lang.String r12 = "com/tencent/mm/plugin/ringtone/uic/RingtoneFinderAuthorMainUIC"
                java.lang.String r13 = "showSearchResultView"
                java.lang.String r14 = "()V"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                r10 = r7
                j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
                java.lang.Object r5 = r8.mo10231a(r3)
                java.lang.Integer r5 = (java.lang.Integer) r5
                int r5 = r5.intValue()
                r7.setVisibility(r5)
                java.lang.String r11 = "com/tencent/mm/plugin/ringtone/uic/RingtoneFinderAuthorMainUIC"
                java.lang.String r12 = "showSearchResultView"
                java.lang.String r13 = "()V"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            L_0x0200:
                android.view.View r1 = r6.findViewById(r1)
                if (r1 != 0) goto L_0x0207
                goto L_0x0246
            L_0x0207:
                k20.a r5 = new k20.a
                r5.<init>()
                java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
                r5.mo10233c(r4)
                java.lang.Object[] r18 = r5.mo10232b()
                java.lang.String r19 = "com/tencent/mm/plugin/ringtone/uic/RingtoneFinderAuthorMainUIC"
                java.lang.String r20 = "showSearchResultView"
                java.lang.String r21 = "()V"
                java.lang.String r22 = "android/view/View_EXEC_"
                java.lang.String r23 = "setVisibility"
                java.lang.String r24 = "(I)V"
                r17 = r1
                j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
                java.lang.Object r3 = r5.mo10231a(r3)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r1.setVisibility(r3)
                java.lang.String r18 = "com/tencent/mm/plugin/ringtone/uic/RingtoneFinderAuthorMainUIC"
                java.lang.String r19 = "showSearchResultView"
                java.lang.String r20 = "()V"
                java.lang.String r21 = "android/view/View_EXEC_"
                java.lang.String r22 = "setVisibility"
                java.lang.String r23 = "(I)V"
                j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            L_0x0246:
                if (r2 != 0) goto L_0x0252
                ck2.q r1 = r0.f153931d
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r1 = r1.f153933e
                if (r1 == 0) goto L_0x025b
                r1.notifyDataSetChanged()
                goto L_0x025b
            L_0x0252:
                ck2.q r1 = r0.f153931d
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r1 = r1.f153933e
                if (r1 == 0) goto L_0x025b
                r1.notifyItemRangeInserted(r2, r9)
            L_0x025b:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ck2.C54918p.C54919a.emit(java.lang.Object, wx3.d):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54918p(C54920q qVar, C15601d<? super C54918p> dVar) {
        super(2, dVar);
        this.f153930e = qVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C54918p(this.f153930e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C54918p) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C45252f<C58451o.C58452a> fVar;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f153929d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C62328j jVar = ((C54873a) C39818r.f106831a.mo62444c(this.f153930e.getActivity()).mo75002a(C54873a.class)).f153804d;
            if (!(jVar == null || (fVar = jVar.f177169e) == null)) {
                C54919a aVar2 = new C54919a(this.f153930e);
                this.f153929d = 1;
                if (C58100z0.m67238l((C58100z0) fVar, aVar2, this) == aVar) {
                    return aVar;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
