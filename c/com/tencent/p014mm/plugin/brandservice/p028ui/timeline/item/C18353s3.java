package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19623o0;
import di3.C86312j;
import ex0.C20642c;
import j20.C117292a;
import java.util.ArrayList;
import rb0.C48009v0;
import s90.C77630j;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.s3 */
public class C18353s3 extends C18206a {

    /* renamed from: c */
    public Context f50824c;

    /* renamed from: d */
    public C18508z2 f50825d;

    /* renamed from: e */
    public View f50826e;

    /* renamed from: f */
    public View f50827f;

    /* renamed from: g */
    public View f50828g;

    /* renamed from: h */
    public ImageView f50829h;

    /* renamed from: i */
    public TextView f50830i;

    /* renamed from: j */
    public TextView f50831j;

    /* renamed from: k */
    public View f50832k;

    /* renamed from: l */
    public View.OnClickListener f50833l = new C18354a();

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.s3$a */
    public class C18354a implements View.OnClickListener {
        public C18354a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C19623o0 kD = C48009v0.Jx0().mo25806kD(((C20642c) C86312j.m106911c(C20642c.class)).Eh0(view));
            if (kD != null) {
                C18353s3.this.f50825d.f51443n.mo22984k(kD, 4);
            } else {
                Log.m105928w("MicroMsg.BizTimeLineItem", "mediaIconClickListener info is null");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: a */
    public void mo22903a() {
        View view = this.f50826e;
        if (view != null) {
            this.f50829h = (ImageView) view.findViewById(C0966R.C0970id.a27);
            this.f50830i = (TextView) this.f50826e.findViewById(C0966R.C0970id.hfq);
            this.f50831j = (TextView) this.f50826e.findViewById(C0966R.C0970id.kky);
            this.f50828g = this.f50826e.findViewById(C0966R.C0970id.a_m);
            this.f50832k = this.f50826e.findViewById(C0966R.C0970id.aex);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00af  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo22920b(android.view.View r16, android.widget.TextView r17, com.tencent.p014mm.storage.C19623o0 r18, s90.C77630j r19) {
        /*
            r15 = this;
            r8 = r16
            r9 = r17
            r10 = r19
            r0 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11 = 0
            if (r10 == 0) goto L_0x00ff
            java.lang.String r1 = r10.f226326e
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0019
            goto L_0x00ff
        L_0x0019:
            java.lang.Class<ex0.d> r1 = ex0.C45696d.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            ex0.d r1 = (ex0.C45696d) r1
            java.lang.String r2 = r10.f226326e
            s90.d r12 = r1.pq0(r2)
            java.lang.String r13 = ""
            if (r12 == 0) goto L_0x003d
            s90.c r1 = r12.f129333g
            if (r1 == 0) goto L_0x003d
            java.lang.String r1 = r1.f129329f
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x003d
            s90.c r1 = r12.f129333g
            java.lang.String r1 = r1.f129329f
        L_0x003b:
            r14 = r1
            goto L_0x0051
        L_0x003d:
            if (r12 == 0) goto L_0x0050
            s90.b r1 = r12.f129334h
            if (r1 == 0) goto L_0x0050
            java.lang.String r1 = r1.f129325d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0050
            s90.b r1 = r12.f129334h
            java.lang.String r1 = r1.f129325d
            goto L_0x003b
        L_0x0050:
            r14 = r13
        L_0x0051:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r1 != 0) goto L_0x00af
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r0 = k20.C60958c.f173611a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r13.mo10233c(r0)
            java.lang.Object[] r1 = r13.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItem"
            java.lang.String r3 = "initStatLayout"
            java.lang.String r4 = "(Landroid/view/View;Landroid/widget/TextView;Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/message/BizReaderItem;)Z"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r0 = r16
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r13.mo10231a(r11)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r8.setVisibility(r0)
            java.lang.String r1 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItem"
            java.lang.String r2 = "initStatLayout"
            java.lang.String r3 = "(Landroid/view/View;Landroid/widget/TextView;Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/message/BizReaderItem;)Z"
            java.lang.String r4 = "android/view/View_EXEC_"
            java.lang.String r5 = "setVisibility"
            java.lang.String r6 = "(I)V"
            r0 = r16
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            r9.setText(r14)
            s90.b r0 = r12.f129334h
            int r5 = r0.f129326e
            r0 = r15
            r1 = r18
            r2 = r19
            r3 = r16
            r4 = r17
            r0.mo22830c(r1, r2, r3, r4, r5)
            r0 = 1
            return r0
        L_0x00af:
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            r12.mo10233c(r0)
            java.lang.Object[] r1 = r12.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItem"
            java.lang.String r3 = "initStatLayout"
            java.lang.String r4 = "(Landroid/view/View;Landroid/widget/TextView;Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/message/BizReaderItem;)Z"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r0 = r16
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r12.mo10231a(r11)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r8.setVisibility(r0)
            java.lang.String r1 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItem"
            java.lang.String r2 = "initStatLayout"
            java.lang.String r3 = "(Landroid/view/View;Landroid/widget/TextView;Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/message/BizReaderItem;)Z"
            java.lang.String r4 = "android/view/View_EXEC_"
            java.lang.String r5 = "setVisibility"
            java.lang.String r6 = "(I)V"
            r0 = r16
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            r9.setText(r13)
            r5 = 0
            r0 = r15
            r1 = r18
            r2 = r19
            r3 = r16
            r4 = r17
            r0.mo22830c(r1, r2, r3, r4, r5)
            return r11
        L_0x00ff:
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            r12.mo10233c(r0)
            java.lang.Object[] r1 = r12.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItem"
            java.lang.String r3 = "initStatLayout"
            java.lang.String r4 = "(Landroid/view/View;Landroid/widget/TextView;Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/message/BizReaderItem;)Z"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r0 = r16
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r12.mo10231a(r11)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r8.setVisibility(r0)
            java.lang.String r1 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItem"
            java.lang.String r2 = "initStatLayout"
            java.lang.String r3 = "(Landroid/view/View;Landroid/widget/TextView;Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/message/BizReaderItem;)Z"
            java.lang.String r4 = "android/view/View_EXEC_"
            java.lang.String r5 = "setVisibility"
            java.lang.String r6 = "(I)V"
            r0 = r16
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            r5 = 0
            r0 = r15
            r1 = r18
            r2 = r19
            r3 = r16
            r4 = r17
            r0.mo22830c(r1, r2, r3, r4, r5)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18353s3.mo22920b(android.view.View, android.widget.TextView, com.tencent.mm.storage.o0, s90.j):boolean");
    }

    /* renamed from: c */
    public void mo22830c(C19623o0 o0Var, C77630j jVar, View view, TextView textView, int i) {
    }
}
