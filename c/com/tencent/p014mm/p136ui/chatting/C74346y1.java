package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.p136ui.chatting.C74352z3;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import di3.C86312j;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76901s0;

/* renamed from: com.tencent.mm.ui.chatting.y1 */
public class C74346y1 {

    /* renamed from: a */
    public static int f218381a = -1;

    /* renamed from: b */
    public static C74347b f218382b = new C74347b();

    /* renamed from: com.tencent.mm.ui.chatting.y1$a */
    public static class C44869a implements View.OnTouchListener {

        /* renamed from: d */
        public int f121730d = Color.argb(255, 136, 136, 136);

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/ChattingItemAvatarOnHoverHelper$ChangeViewBgOnTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            int action = motionEvent.getAction();
            Drawable drawable = view instanceof ImageView ? ((ImageView) view).getDrawable() : view.getBackground();
            if (drawable != null) {
                if (action == 0) {
                    drawable.setColorFilter(this.f121730d, PorterDuff.Mode.MULTIPLY);
                } else if (action == 3 || action == 1) {
                    drawable.clearColorFilter();
                }
            }
            C117292a.m165362h(false, this, "com/tencent/mm/ui/chatting/ChattingItemAvatarOnHoverHelper$ChangeViewBgOnTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.y1$b */
    public static class C74347b implements C74352z3.C74354b, View.OnClickListener, View.OnTouchListener {

        /* renamed from: d */
        public C76901s0 f218383d;

        /* renamed from: e */
        public View f218384e;

        /* renamed from: f */
        public View f218385f;

        /* renamed from: g */
        public View f218386g;

        /* renamed from: h */
        public int f218387h;

        /* renamed from: i */
        public int f218388i;

        /* renamed from: j */
        public int f218389j;

        /* renamed from: n */
        public int f218390n;

        /* renamed from: o */
        public boolean f218391o;

        /* renamed from: p */
        public C44869a f218392p = new C44869a();

        /* renamed from: q */
        public View.OnTouchListener f218393q = new C44870a();

        /* renamed from: r */
        public View f218394r;

        /* renamed from: s */
        public int f218395s = 300;

        /* renamed from: t */
        public MTimerHandler f218396t;

        /* renamed from: u */
        public MTimerHandler.CallBack f218397u = new C74348b();

        /* renamed from: com.tencent.mm.ui.chatting.y1$b$a */
        public class C44870a implements View.OnTouchListener {
            public C44870a() {
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/chatting/ChattingItemAvatarOnHoverHelper$OnHoverMotionEventCallback$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                C74347b bVar = C74347b.this;
                C44869a aVar = bVar.f218392p;
                if (aVar != null) {
                    aVar.onTouch(bVar.f218384e, motionEvent);
                }
                C117292a.m165362h(false, this, "com/tencent/mm/ui/chatting/ChattingItemAvatarOnHoverHelper$OnHoverMotionEventCallback$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.y1$b$b */
        public class C74348b implements MTimerHandler.CallBack {
            public C74348b() {
            }

            public boolean onTimerExpired() {
                C76901s0 s0Var;
                C74347b bVar = C74347b.this;
                View view = bVar.f218394r;
                if (!(view == null || (s0Var = bVar.f218383d) == null)) {
                    bVar.getClass();
                    s0Var.showAsDropDown(view, 0, C74347b.this.f218389j);
                }
                return false;
            }
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/ChattingItemAvatarOnHoverHelper$OnHoverMotionEventCallback", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C74243t8 t8Var = (C74243t8) view.getTag();
            if (view == this.f218386g) {
                C74346y1.m88787a(view.getContext(), t8Var.f217968b, 3, 2);
            } else {
                C74346y1.m88787a(view.getContext(), t8Var.f217968b, 2, 1);
            }
            C76901s0 s0Var = this.f218383d;
            if (s0Var != null) {
                s0Var.dismiss();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingItemAvatarOnHoverHelper$OnHoverMotionEventCallback", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
            if (r8 != 3) goto L_0x0032;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                r0.add(r9)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/ui/chatting/ChattingItemAvatarOnHoverHelper$OnHoverMotionEventCallback"
                java.lang.String r2 = "android/view/View$OnTouchListener"
                java.lang.String r3 = "onTouch"
                java.lang.String r4 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                int r8 = r9.getAction()
                r9 = 1
                if (r8 == r9) goto L_0x0029
                r9 = 3
                if (r8 == r9) goto L_0x002b
                goto L_0x0032
            L_0x0029:
                r7.f218391o = r9
            L_0x002b:
                nj3.s0 r8 = r7.f218383d
                if (r8 == 0) goto L_0x0032
                r8.dismiss()
            L_0x0032:
                r8 = 0
                r0 = 0
                java.lang.String r2 = "com/tencent/mm/ui/chatting/ChattingItemAvatarOnHoverHelper$OnHoverMotionEventCallback"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r7
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C74346y1.C74347b.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: a */
    public static void m88787a(Context context, String str, int i, int i2) {
        VoipEvent voipEvent = new VoipEvent();
        VoipEvent.C67818a aVar = voipEvent.f194019d;
        aVar.f194022b = 5;
        aVar.f194025e = str;
        aVar.f194024d = context;
        aVar.f194026f = i;
        voipEvent.publish();
        C115669n.INSTANCE.mo160131h(11033, 4, 1, 0);
    }

    /* renamed from: b */
    public static boolean m88788b() {
        if (f218381a == -1) {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_chatting_hover_enable, 0);
            f218381a = Qe;
            Log.m105925i("MicroMsg.ChattingItemAvatarOnHoverHelper", "isEnable:%s", Integer.valueOf(Qe));
        }
        return f218381a == 1;
    }
}
