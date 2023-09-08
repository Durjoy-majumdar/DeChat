package yz1;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Message;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C76901s0;
import sz1.C77815b;
import wz1.C78747b;
import xz1.C79013a;

/* renamed from: yz1.x */
public class C79206x implements C79205w {

    /* renamed from: a */
    public ValueAnimator f232516a = null;

    /* renamed from: b */
    public Context f232517b;

    /* renamed from: c */
    public C88144b.C88145d f232518c;

    /* renamed from: d */
    public View f232519d;

    /* renamed from: e */
    public C76901s0 f232520e;

    /* renamed from: f */
    public View f232521f;

    /* renamed from: g */
    public C79211e f232522g;

    /* renamed from: h */
    public TextView f232523h;

    /* renamed from: i */
    public boolean f232524i = false;

    /* renamed from: j */
    public String f232525j = "";

    /* renamed from: k */
    public String f232526k = "";

    /* renamed from: l */
    public C79013a f232527l = null;

    /* renamed from: m */
    public String f232528m = "";

    /* renamed from: n */
    public int f232529n;

    /* renamed from: o */
    public int f232530o;

    /* renamed from: p */
    public int f232531p;

    /* renamed from: q */
    public int[] f232532q;

    /* renamed from: r */
    public C79013a f232533r = null;

    /* renamed from: s */
    public C79208b f232534s;

    /* renamed from: t */
    public C79209c f232535t;

    /* renamed from: u */
    public C79210d f232536u = null;

    /* renamed from: v */
    public String f232537v;

    /* renamed from: w */
    public View f232538w;

    /* renamed from: x */
    public MMHandler f232539x = new C79207a();

    /* renamed from: y */
    public boolean f232540y = false;

    /* renamed from: yz1.x$a */
    public class C79207a extends MMHandler {
        public C79207a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c9, code lost:
            if (r8 <= 1) goto L_0x00cb;
         */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00bd  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00d0  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00ec  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r15) {
            /*
                r14 = this;
                int r0 = r15.what
                r1 = 20001(0x4e21, float:2.8027E-41)
                if (r0 == r1) goto L_0x0013
                r15 = 20002(0x4e22, float:2.8029E-41)
                if (r0 == r15) goto L_0x000c
                goto L_0x01b6
            L_0x000c:
                yz1.x r15 = yz1.C79206x.this
                r15.mo109223a()
                goto L_0x01b6
            L_0x0013:
                yz1.x r0 = yz1.C79206x.this
                java.lang.Object r2 = r15.obj
                java.lang.String r2 = (java.lang.String) r2
                int r15 = r15.arg1
                r0.getClass()
                java.lang.Class<sz1.b> r3 = sz1.C77815b.class
                java.lang.String r4 = "MicroMsg.groupsolitaire.SuggestSolitatireTips"
                java.lang.String r5 = "showTips()"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
                java.lang.Class<f62.i0> r5 = f62.C75698i0.class
                di3.d r5 = di3.C86312j.m106911c(r5)
                f62.i0 r5 = (f62.C75698i0) r5
                java.lang.String r6 = r0.f232526k
                boolean r5 = r5.Mq0(r6)
                if (r5 == 0) goto L_0x01b1
                java.lang.String r5 = r0.f232537v
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r5 != 0) goto L_0x01b1
                android.view.View r5 = r0.f232538w
                if (r5 != 0) goto L_0x0045
                goto L_0x01b1
            L_0x0045:
                com.tencent.mm.sdk.platformtools.MMHandler r5 = r0.f232539x
                r5.removeMessages(r1)
                r1 = 0
                r0.f232540y = r1
                r5 = 2131831088(0x7f112930, float:1.9295192E38)
                r6 = 1
                if (r15 != r6) goto L_0x005c
                android.widget.TextView r2 = r0.f232523h
                r2.setText(r5)
                r0.f232540y = r6
                goto L_0x00f4
            L_0x005c:
                java.lang.String r7 = r0.f232526k
                xz1.a r8 = r0.f232527l
                java.util.HashMap<java.lang.Integer, xz1.b> r8 = r8.f232007N
                int r8 = r8.size()
                sg.g<java.lang.Integer, xz1.a> r9 = wz1.C78747b.f230457a
                di3.d r9 = di3.C86312j.m106911c(r3)
                sz1.b r9 = (sz1.C77815b) r9
                wz1.c r9 = r9.vx0()
                xz1.a r2 = r9.mo108668f(r7, r2)
                di3.d r9 = di3.C86312j.m106911c(r3)
                sz1.b r9 = (sz1.C77815b) r9
                wz1.c r9 = r9.vx0()
                wz1.a r7 = r9.mo108666c(r7)
                if (r2 != 0) goto L_0x0087
                goto L_0x00cb
            L_0x0087:
                if (r7 != 0) goto L_0x008a
                goto L_0x00b8
            L_0x008a:
                int r9 = r2.field_active
                if (r9 != r6) goto L_0x00a4
                long r9 = r2.field_lastActiveTime
                long r11 = r7.f230453b
                int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r13 < 0) goto L_0x00a4
                java.util.HashMap<java.lang.Integer, xz1.b> r9 = r2.f232007N
                int r9 = r9.size()
                int r10 = wz1.C78747b.m95123w()
                if (r9 >= r10) goto L_0x00a4
                r9 = 1
                goto L_0x00a5
            L_0x00a4:
                r9 = 0
            L_0x00a5:
                int r10 = r2.field_active
                if (r10 != 0) goto L_0x00b3
                long r10 = r2.field_lastActiveTime
                long r12 = r7.f230455d
                int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r7 < 0) goto L_0x00b3
                r7 = 1
                goto L_0x00b4
            L_0x00b3:
                r7 = 0
            L_0x00b4:
                if (r9 != 0) goto L_0x00ba
                if (r7 != 0) goto L_0x00ba
            L_0x00b8:
                r7 = 1
                goto L_0x00bb
            L_0x00ba:
                r7 = 0
            L_0x00bb:
                if (r7 != 0) goto L_0x00cc
                java.lang.String r2 = r2.field_creator
                java.lang.String r9 = eb0.C75592q0.m90789s()
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r2, (java.lang.String) r9)
                if (r2 == 0) goto L_0x00cc
                if (r8 > r6) goto L_0x00cc
            L_0x00cb:
                r7 = 1
            L_0x00cc:
                r0.f232540y = r7
                if (r7 == 0) goto L_0x00ec
                android.widget.TextView r2 = r0.f232523h
                r2.setText(r5)
                xz1.a r2 = r0.f232527l
                java.lang.String r2 = r2.f232001H
                boolean r2 = wz1.C78747b.m95094F(r2)
                if (r2 == 0) goto L_0x00f4
                nj3.s0 r15 = r0.f232520e
                boolean r15 = r15.isShowing()
                if (r15 == 0) goto L_0x01b6
                r0.mo109223a()
                goto L_0x01b6
            L_0x00ec:
                android.widget.TextView r2 = r0.f232523h
                r5 = 2131831087(0x7f11292f, float:1.929519E38)
                r2.setText(r5)
            L_0x00f4:
                nj3.s0 r2 = r0.f232520e
                boolean r2 = r2.isShowing()
                if (r2 == 0) goto L_0x0103
                java.lang.String r15 = "showTips() mBubbleState isShowing"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r15)
                goto L_0x01b6
            L_0x0103:
                boolean r2 = r0.f232540y
                r4 = 2
                if (r2 == 0) goto L_0x012b
                if (r15 != r6) goto L_0x011b
                di3.d r15 = di3.C86312j.m106911c(r3)
                sz1.b r15 = (sz1.C77815b) r15
                wz1.e r15 = r15.wx0()
                java.lang.String r2 = r0.f232526k
                r3 = 3
                r15.mo108687h(r2, r3)
                goto L_0x013a
            L_0x011b:
                di3.d r15 = di3.C86312j.m106911c(r3)
                sz1.b r15 = (sz1.C77815b) r15
                wz1.e r15 = r15.wx0()
                java.lang.String r2 = r0.f232526k
                r15.mo108687h(r2, r4)
                goto L_0x013a
            L_0x012b:
                di3.d r15 = di3.C86312j.m106911c(r3)
                sz1.b r15 = (sz1.C77815b) r15
                wz1.e r15 = r15.wx0()
                java.lang.String r2 = r0.f232526k
                r15.mo108687h(r2, r6)
            L_0x013a:
                android.view.View r15 = r0.f232521f
                if (r15 == 0) goto L_0x01b6
                int[] r2 = new int[r4]
                r0.f232532q = r2
                r15.getLocationInWindow(r2)
                r0.f232531p = r1
                android.view.View r15 = r0.f232521f
                int r15 = r15.getWidth()
                nj3.s0 r2 = r0.f232520e
                int r2 = r2.getWidth()
                int r15 = r15 - r2
                android.content.Context r2 = r0.f232517b
                r3 = 8
                int r2 = kg3.C76577a.m92151b(r2, r3)
                int r15 = r15 - r2
                r0.f232529n = r15
                int[] r15 = r0.f232532q
                r15 = r15[r6]
                nj3.s0 r2 = r0.f232520e
                int r2 = r2.getHeight()
                int r15 = r15 - r2
                android.content.Context r2 = r0.f232517b
                int r2 = kg3.C76577a.m92151b(r2, r3)
                int r15 = r15 - r2
                r0.f232530o = r15
                yz1.x$d r2 = r0.f232536u
                if (r2 == 0) goto L_0x0197
                r3 = r2
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$p r3 = (com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$p) r3
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r3.f212033a
                int r3 = r3.f211884i1
                if (r3 != 0) goto L_0x0181
                goto L_0x0182
            L_0x0181:
                r6 = 0
            L_0x0182:
                if (r6 != 0) goto L_0x0197
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$p r2 = (com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$p) r2
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r2.f212033a
                com.tencent.mm.ui.chatting.component.GroupTodoComponent$g r2 = r2.f211765H1
                if (r2 == 0) goto L_0x0193
                com.tencent.mm.ui.chatting.component.FootComponent$$i r2 = (com.tencent.p014mm.p136ui.chatting.component.FootComponent$$i) r2
                int r2 = r2.mo102204a()
                goto L_0x0194
            L_0x0193:
                r2 = 0
            L_0x0194:
                int r15 = r15 + r2
                r0.f232530o = r15
            L_0x0197:
                nj3.s0 r15 = r0.f232520e
                android.view.View r2 = r0.f232521f
                int r3 = r0.f232529n
                int r4 = r0.f232530o
                r15.showAtLocation(r2, r1, r3, r4)
                android.view.View r15 = r0.f232521f
                android.view.ViewTreeObserver r15 = r15.getViewTreeObserver()
                yz1.z r1 = new yz1.z
                r1.<init>(r0)
                r15.addOnGlobalLayoutListener(r1)
                goto L_0x01b6
            L_0x01b1:
                java.lang.String r15 = "showTips() show close"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r15)
            L_0x01b6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yz1.C79206x.C79207a.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: yz1.x$b */
    public static class C79208b implements Runnable {

        /* renamed from: d */
        public Context f232542d;

        /* renamed from: e */
        public C79205w f232543e;

        /* renamed from: f */
        public MMHandler f232544f;

        /* renamed from: g */
        public String f232545g;

        /* renamed from: h */
        public String f232546h;

        public C79208b(Context context, MMHandler mMHandler, C79205w wVar) {
            this.f232542d = context;
            this.f232544f = mMHandler;
            this.f232543e = wVar;
        }

        public void run() {
            try {
                Pair<Integer, C79013a> j = ((C77815b) C86312j.m106911c(C77815b.class)).vx0().mo108672j(this.f232545g, 1, this.f232546h);
                if (((Integer) j.first).intValue() > C78747b.m95123w()) {
                    this.f232544f.sendEmptyMessage(20002);
                    return;
                }
                if (((Integer) j.first).intValue() < 1) {
                    Object obj = j.second;
                    if (obj == null || ((C79013a) obj).f232009Q < 1) {
                        if (C78747b.m95090B(this.f232542d, this.f232545g)) {
                            ((C79206x) this.f232543e).f232527l = null;
                            Message message = new Message();
                            message.what = 20001;
                            message.arg1 = 1;
                            ((C79206x) this.f232543e).f232528m = this.f232545g.trim();
                            this.f232544f.sendMessage(message);
                            return;
                        }
                        this.f232544f.sendEmptyMessage(20002);
                        return;
                    }
                }
                C79205w wVar = this.f232543e;
                Object obj2 = j.second;
                ((C79206x) wVar).f232527l = (C79013a) obj2;
                if (C78747b.m95091C((C79013a) obj2)) {
                    Message message2 = new Message();
                    message2.what = 20001;
                    message2.obj = C78747b.m95115o((C79013a) j.second);
                    this.f232544f.sendMessage(message2);
                    return;
                }
                this.f232544f.sendEmptyMessage(20002);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.groupsolitaire.SuggestSolitatireTips", "CheckRunnable run() Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
            }
        }
    }

    /* renamed from: yz1.x$c */
    public class C79209c extends C79208b {
        public C79209c(C79206x xVar, Context context, MMHandler mMHandler, C79205w wVar) {
            super(context, mMHandler, wVar);
        }

        public void run() {
            try {
                Pair<Integer, C79013a> j = ((C77815b) C86312j.m106911c(C77815b.class)).vx0().mo108672j(this.f232545g, 1, this.f232546h);
                if (((Integer) j.first).intValue() <= C78747b.m95123w() && ((Integer) j.first).intValue() >= 1) {
                    C79205w wVar = this.f232543e;
                    C79013a aVar = (C79013a) j.second;
                    C79206x xVar = (C79206x) wVar;
                    if (xVar.f232533r == null) {
                        xVar.f232533r = aVar;
                    } else if (aVar == null) {
                        xVar.f232533r = null;
                    } else {
                        Log.m105924i("MicroMsg.groupsolitaire.SuggestSolitatireTips", "setCopyGroupSolitaire repeat");
                    }
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.groupsolitaire.SuggestSolitatireTips", "CheckRunnable run() Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
            }
        }
    }

    /* renamed from: yz1.x$d */
    public interface C79210d {
    }

    /* renamed from: yz1.x$e */
    public interface C79211e {
    }

    public C79206x(Context context, C88144b.C88145d dVar, C79211e eVar) {
        Log.m105924i("MicroMsg.groupsolitaire.SuggestSolitatireTips", "SuggestSolitatireTips()");
        this.f232517b = context;
        this.f232518c = dVar;
        this.f232522g = eVar;
        MMHandler mMHandler = this.f232539x;
        this.f232534s = new C79208b(context, mMHandler, this);
        this.f232535t = new C79209c(this, context, mMHandler, this);
        this.f232528m = context.getString(C0966R.string.ffa);
        View inflate = View.inflate(this.f232517b, C0966R.C0971layout.c7w, (ViewGroup) null);
        this.f232519d = inflate;
        inflate.setOnClickListener(new C79212y(this));
        C76901s0 s0Var = new C76901s0(this.f232519d, C76577a.m92155f(this.f232517b, C0966R.dimen.f357074ar3), C76577a.m92155f(this.f232517b, C0966R.dimen.f357073ar2), true);
        this.f232520e = s0Var;
        s0Var.setBackgroundDrawable(new ColorDrawable(0));
        this.f232520e.setOutsideTouchable(false);
        this.f232520e.setFocusable(false);
        this.f232520e.setAnimationStyle(C0966R.style.f8707rx);
        TextView textView = (TextView) this.f232519d.findViewById(C0966R.C0970id.jxt);
        this.f232523h = textView;
        textView.setTextSize(0, (float) C76577a.m92155f(this.f232517b, C0966R.dimen.f3881hq));
        ((TextView) this.f232519d.findViewById(C0966R.C0970id.jxq)).setTextSize(0, (float) C76577a.m92155f(this.f232517b, C0966R.dimen.f3628l));
    }

    /* renamed from: a */
    public void mo109223a() {
        Log.m105924i("MicroMsg.groupsolitaire.SuggestSolitatireTips", "hideTips()");
        if (this.f232520e.isShowing()) {
            this.f232520e.dismiss();
        }
        this.f232539x.removeCallbacksAndMessages((Object) null);
        this.f232539x.removeMessages(20002);
    }
}
