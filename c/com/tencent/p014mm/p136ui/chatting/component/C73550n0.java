package com.tencent.p014mm.p136ui.chatting.component;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Comparator;
import nj3.C76879j;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.component.n0 */
public class C73550n0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C73655y0 f216049d;

    /* renamed from: com.tencent.mm.ui.chatting.component.n0$a */
    public class C73551a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C79368l f216050d;

        /* renamed from: e */
        public final /* synthetic */ Context f216051e;

        /* renamed from: com.tencent.mm.ui.chatting.component.n0$a$a */
        public class C73552a implements Comparator<Long> {
            public C73552a(C73551a aVar) {
            }

            public int compare(Object obj, Object obj2) {
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
            }
        }

        public C73551a(C79368l lVar, Context context) {
            this.f216050d = lVar;
            this.f216051e = context;
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x0091 A[EDGE_INSN: B:30:0x0091->B:22:0x0091 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x0038  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.content.DialogInterface r14, int r15) {
            /*
                r13 = this;
                java.lang.String r14 = "MicroMsg.ChattingMoreBtnBarHelper"
                java.lang.String r15 = "delete message"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r15)
                zj3.l r14 = r13.f216050d
                java.util.Set r14 = r14.mo108206p3()
                r15 = 0
                java.lang.Long[] r0 = new java.lang.Long[r15]
                java.lang.Object[] r14 = r14.toArray(r0)
                java.lang.Long[] r14 = (java.lang.Long[]) r14
                com.tencent.mm.ui.chatting.component.n0$a$a r0 = new com.tencent.mm.ui.chatting.component.n0$a$a
                r0.<init>(r13)
                java.util.Arrays.sort(r14, r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                zj3.l r1 = r13.f216050d
                android.util.SparseArray r1 = r1.mo108175K1()
                int r2 = r1.size()
                int r3 = r14.length
                r4 = r2
                r5 = 0
            L_0x0030:
                if (r5 >= r3) goto L_0x0094
                r6 = r14[r5]
            L_0x0034:
                int r2 = r2 + -1
                if (r2 < 0) goto L_0x0091
                java.lang.Object r7 = r1.get(r2)
                com.tencent.mm.storage.f4 r7 = (com.tencent.p014mm.storage.C72963f4) r7
                long r8 = r7.getMsgId()
                long r10 = r6.longValue()
                int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r12 <= 0) goto L_0x0051
                boolean r8 = r7.mo101019v3()
                if (r8 == 0) goto L_0x0051
                goto L_0x0034
            L_0x0051:
                long r7 = r7.getMsgId()
                long r9 = r6.longValue()
                int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r11 != 0) goto L_0x005f
                r7 = 1
                goto L_0x0060
            L_0x005f:
                r7 = 0
            L_0x0060:
                if (r7 == 0) goto L_0x007a
                int r4 = r4 + -1
            L_0x0064:
                if (r4 <= r2) goto L_0x0090
                java.lang.Object r6 = r1.get(r4)
                com.tencent.mm.storage.f4 r6 = (com.tencent.p014mm.storage.C72963f4) r6
                long r6 = r6.getMsgId()
                java.lang.Long r6 = java.lang.Long.valueOf(r6)
                r0.add(r6)
                int r4 = r4 + -1
                goto L_0x0064
            L_0x007a:
                int r2 = r2 + -1
                if (r2 < 0) goto L_0x0090
                java.lang.Object r4 = r1.get(r2)
                com.tencent.mm.storage.f4 r4 = (com.tencent.p014mm.storage.C72963f4) r4
                long r7 = r4.getMsgId()
                long r9 = r6.longValue()
                int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r4 != 0) goto L_0x007a
            L_0x0090:
                r4 = r2
            L_0x0091:
                int r5 = r5 + 1
                goto L_0x0030
            L_0x0094:
                android.content.Context r14 = r13.f216051e
                zj3.l r15 = r13.f216050d
                java.util.Set r15 = r15.mo108206p3()
                com.tencent.mm.ui.chatting.component.n0 r1 = com.tencent.p014mm.p136ui.chatting.component.C73550n0.this
                com.tencent.mm.ui.chatting.component.y0 r1 = r1.f216049d
                com.tencent.p014mm.p136ui.chatting.C73871v0.m87560a(r14, r15, r1)
                int r14 = r0.size()
                if (r14 <= 0) goto L_0x00b7
                android.content.Context r14 = r13.f216051e
                java.util.concurrent.CopyOnWriteArraySet r15 = new java.util.concurrent.CopyOnWriteArraySet
                r15.<init>(r0)
                com.tencent.mm.ui.chatting.component.n0 r0 = com.tencent.p014mm.p136ui.chatting.component.C73550n0.this
                com.tencent.mm.ui.chatting.component.y0 r0 = r0.f216049d
                com.tencent.p014mm.p136ui.chatting.C73871v0.m87560a(r14, r15, r0)
            L_0x00b7:
                com.tencent.mm.ui.chatting.component.n0 r14 = com.tencent.p014mm.p136ui.chatting.component.C73550n0.this
                com.tencent.mm.ui.chatting.component.y0 r14 = r14.f216049d
                r14.mo102686y3()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C73550n0.C73551a.onClick(android.content.DialogInterface, int):void");
        }
    }

    public C73550n0(C73655y0 y0Var) {
        this.f216049d = y0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/component/ChattingMoreComponent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C79368l lVar = (C79368l) this.f216049d.f215752d.f193278b.mo102812a(C79368l.class);
        if (lVar.mo108181M5() == 0) {
            Log.m105928w("MicroMsg.ChattingMoreBtnBarHelper", "ignore click del btn, selected items count is 0");
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        Activity f = this.f216049d.f215752d.mo91565f();
        C76879j.m92708B(f, f.getString(C0966R.string.bj6), "", f.getString(C0966R.string.byd), f.getString(C0966R.string.f7926wf), new C73551a(lVar, f), (DialogInterface.OnClickListener) null, C0966R.color.f3041d1);
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
