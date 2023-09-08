package com.tencent.p014mm.plugin.record.p094ui.viewWrappers;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.record.p094ui.C94356i;
import com.tencent.p014mm.storage.C72963f4;
import j20.C117292a;
import java.util.ArrayList;
import uo3.C78253a;

/* renamed from: com.tencent.mm.plugin.record.ui.viewWrappers.f */
public class C94388f implements C94356i.C94363d {

    /* renamed from: a */
    public Context f272820a;

    /* renamed from: b */
    public int f272821b;

    /* renamed from: c */
    public int f272822c;

    /* renamed from: d */
    public C72963f4 f272823d;

    /* renamed from: e */
    public C78253a f272824e;

    /* renamed from: com.tencent.mm.plugin.record.ui.viewWrappers.f$a */
    public class C94389a implements View.OnTouchListener {
        public C94389a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/record/ui/viewWrappers/TextViewWrapper$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                C94388f.this.f272821b = (int) motionEvent.getRawX();
                C94388f.this.f272822c = (int) motionEvent.getRawY();
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/record/ui/viewWrappers/TextViewWrapper$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    public C94388f(Context context) {
        this.f272820a = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0196 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01f9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo129755a(android.view.View r23, int r24, sg2.C101617b r25, java.lang.Object r26) {
        /*
            r22 = this;
            r7 = r22
            r8 = r23
            r9 = r25
            r0 = 2131311985(0x7f093d71, float:1.8242326E38)
            android.view.View r0 = r8.findViewById(r0)
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            te3.rc0 r0 = r9.f297464a
            java.lang.String r0 = r0.f299301f
            r6.setText(r0)
            eb0.c r0 = eb0.C97625j3.m125812b()
            g62.l r0 = r0.mo105911z()
            long r1 = r9.f297466c
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            com.tencent.mm.storage.f4 r0 = r0.b00(r1)
            r7.f272823d = r0
            int r1 = r9.f297470g
            r3 = 1
            r4 = 2
            if (r1 != r3) goto L_0x003e
            de3.f0$b r1 = de3.C45331f0.C45333b.CHATTING_RECORD_FROM_SINGLE_CHAT
            java.lang.String r0 = r0.mo108768t()
            int r0 = kb0.C76528a.m92004a(r0)
            android.os.Bundle r0 = r1.mo70879a(r0)
            goto L_0x005a
        L_0x003e:
            if (r1 != r4) goto L_0x004f
            de3.f0$b r1 = de3.C45331f0.C45333b.CHATTING_RECORD_FROM_GROUP_CHAT
            java.lang.String r0 = r0.mo108768t()
            int r0 = kb0.C76528a.m92004a(r0)
            android.os.Bundle r0 = r1.mo70879a(r0)
            goto L_0x005a
        L_0x004f:
            r0 = 15
            if (r1 != r0) goto L_0x005c
            de3.f0$b r0 = de3.C45331f0.C45333b.CHATTING_RECORD_FROM_FAV
            r1 = -1
            android.os.Bundle r0 = r0.mo70879a(r1)
        L_0x005a:
            r14 = r0
            goto L_0x005d
        L_0x005c:
            r14 = 0
        L_0x005d:
            if (r14 == 0) goto L_0x00bc
            java.lang.String r0 = r9.f297472i
            java.lang.String r1 = r9.f297471h
            com.tencent.mm.storage.f4 r5 = r7.f272823d
            java.lang.String r5 = r5.mo108768t()
            te3.rc0 r10 = r9.f297464a
            te3.sc0 r10 = r10.f299296c1
            if (r10 == 0) goto L_0x0072
            te3.tc0 r10 = r10.f299405d
            goto L_0x0073
        L_0x0072:
            r10 = 0
        L_0x0073:
            if (r10 == 0) goto L_0x008f
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r11 == 0) goto L_0x007d
            java.lang.String r0 = r10.f299529s
        L_0x007d:
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r11 == 0) goto L_0x0085
            java.lang.String r1 = r10.f299519f
        L_0x0085:
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r11 == 0) goto L_0x008f
            java.lang.String r5 = pb1.C100705f0.m131750a(r10)
        L_0x008f:
            java.lang.String r10 = "msgUsername"
            r14.putString(r10, r1)
            java.lang.String r1 = "serverMsgID"
            r14.putString(r1, r0)
            java.lang.String r0 = "geta8key_username"
            r14.putString(r0, r5)
            java.lang.String r0 = "KMsgType"
            r14.putInt(r0, r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "span extraData = "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.TextViewWrapper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x00bc:
            java.lang.Class<ny.h> r0 = p629ny.C76979h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            r10 = r0
            ny.h r10 = (p629ny.C76979h) r10
            r12 = 1
            int r0 = r9.f297468e
            r1 = 0
            if (r0 != r3) goto L_0x00ce
            r0 = 6
            r13 = 6
            goto L_0x00d4
        L_0x00ce:
            if (r0 != 0) goto L_0x00d3
            r0 = 4
            r13 = 4
            goto L_0x00d4
        L_0x00d3:
            r13 = 0
        L_0x00d4:
            ny.e r15 = de3.C75370s.f221608c
            com.tencent.mm.storage.f4 r0 = r7.f272823d
            boolean r0 = eb0.C75569c4.m90693z(r0)
            r16 = r0 ^ 1
            r11 = r6
            r10.mo107055Rj(r11, r12, r13, r14, r15, r16)
            r0 = 2131311992(0x7f093d78, float:1.824234E38)
            android.view.View r0 = r8.findViewById(r0)
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 2131311993(0x7f093d79, float:1.8242342E38)
            android.view.View r0 = r8.findViewById(r0)
            r5 = 2131311989(0x7f093d75, float:1.8242334E38)
            android.view.View r5 = r8.findViewById(r5)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r15 = 8
            r10.setVisibility(r15)
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r15)
            r14.mo10233c(r11)
            java.lang.Object[] r12 = r14.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/record/ui/viewWrappers/TextViewWrapper"
            java.lang.String r16 = "fillView"
            java.lang.String r17 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r11 = r0
            r2 = r14
            r14 = r16
            r3 = 8
            r15 = r17
            r16 = r18
            r17 = r19
            r18 = r20
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/record/ui/viewWrappers/TextViewWrapper"
            java.lang.String r13 = "fillView"
            java.lang.String r14 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            r5.setVisibility(r3)
            r3 = r26
            com.tencent.mm.plugin.record.ui.TranslateHelper r3 = (com.tencent.p014mm.plugin.record.p094ui.TranslateHelper) r3
            if (r3 == 0) goto L_0x015f
            r2 = r24
            qg2.u0 r11 = r3.mo129732a(r2)
            r15 = r11
            goto L_0x0162
        L_0x015f:
            r2 = r24
            r15 = 0
        L_0x0162:
            if (r15 == 0) goto L_0x0196
            int r11 = r15.f177823e
            if (r11 != r4) goto L_0x0196
            java.lang.String r0 = r15.f177824f
            r10.setText(r0)
            r10.setVisibility(r1)
            r0 = 2131311991(0x7f093d77, float:1.8242338E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r4 = r15.f177825g
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x018d
            android.content.res.Resources r4 = r23.getResources()
            r11 = 2131837996(0x7f11442c, float:1.9309203E38)
            java.lang.String r4 = r4.getString(r11)
            goto L_0x018f
        L_0x018d:
            java.lang.String r4 = r15.f177825g
        L_0x018f:
            r0.setText(r4)
            r5.setVisibility(r1)
            goto L_0x01df
        L_0x0196:
            if (r15 == 0) goto L_0x01df
            int r4 = r15.f177823e
            r5 = 1
            if (r4 != r5) goto L_0x01df
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r4.mo10233c(r5)
            java.lang.Object[] r12 = r4.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/record/ui/viewWrappers/TextViewWrapper"
            java.lang.String r14 = "fillView"
            java.lang.String r5 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r0
            r21 = r15
            r15 = r5
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r1 = r4.mo10231a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r12 = "com/tencent/mm/plugin/record/ui/viewWrappers/TextViewWrapper"
            java.lang.String r13 = "fillView"
            java.lang.String r14 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01e1
        L_0x01df:
            r21 = r15
        L_0x01e1:
            r4 = 1
            com.tencent.mm.plugin.record.ui.viewWrappers.g r11 = new com.tencent.mm.plugin.record.ui.viewWrappers.g
            r0 = r11
            r1 = r22
            r2 = r3
            r12 = r3
            r3 = r4
            r4 = r21
            r5 = r25
            r13 = r6
            r6 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r13.setOnLongClickListener(r11)
            if (r12 == 0) goto L_0x020c
            r3 = 0
            com.tencent.mm.plugin.record.ui.viewWrappers.g r11 = new com.tencent.mm.plugin.record.ui.viewWrappers.g
            r0 = r11
            r1 = r22
            r2 = r12
            r4 = r21
            r5 = r25
            r6 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r10.setOnLongClickListener(r11)
        L_0x020c:
            com.tencent.mm.plugin.record.ui.viewWrappers.f$a r0 = new com.tencent.mm.plugin.record.ui.viewWrappers.f$a
            r0.<init>()
            r8.setOnTouchListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.record.p094ui.viewWrappers.C94388f.mo129755a(android.view.View, int, sg2.b, java.lang.Object):void");
    }

    /* renamed from: b */
    public View mo129756b(Context context) {
        return View.inflate(context, C0966R.C0971layout.bqj, (ViewGroup) null);
    }

    public void destroy() {
        this.f272820a = null;
    }

    public void pause() {
    }
}
