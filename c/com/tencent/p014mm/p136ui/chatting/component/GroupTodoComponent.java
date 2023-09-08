package com.tencent.p014mm.p136ui.chatting.component;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.NotifyGroupTodoEvent;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$d;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import gc0.C20828a;
import hc0.C20937c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kr0.C76629w0;
import p195li.C61288e;
import p203mi.C24982c0;
import p203mi.C61479x;
import p203mi.C76758b0;
import p270xi.C91212b;
import p644pi.C77089d;
import p684si.C77711c;
import p684si.C77712d;
import te3.C77955jv3;
import uo3.C78253a;
import xo3.C78967g;
import zj3.C79337a0;
import zt3.C119157j;
import zt3.C119179t;

@C91212b(exportInterface = C79337a0.class)
/* renamed from: com.tencent.mm.ui.chatting.component.GroupTodoComponent */
public class GroupTodoComponent extends C73412a implements C79337a0 {

    /* renamed from: e */
    public View f215547e;

    /* renamed from: f */
    public RecyclerView f215548f;

    /* renamed from: g */
    public ImageView f215549g;

    /* renamed from: h */
    public ImageView f215550h;

    /* renamed from: i */
    public LinearLayoutManager f215551i;

    /* renamed from: j */
    public C73359i f215552j;

    /* renamed from: n */
    public List<C77711c> f215553n = new ArrayList();

    /* renamed from: o */
    public HashMap<String, C77711c> f215554o = new HashMap<>();

    /* renamed from: p */
    public C73355e f215555p = null;

    /* renamed from: q */
    public ArrayList<C73365j> f215556q = new ArrayList<>();

    /* renamed from: r */
    public boolean f215557r = true;

    /* renamed from: s */
    public ObjectAnimator f215558s = null;

    /* renamed from: t */
    public ObjectAnimator f215559t = null;

    /* renamed from: u */
    public IListener<NotifyGroupTodoEvent> f215560u = new IListener<NotifyGroupTodoEvent>(C40008f.f107254d) {
        {
            this.__eventId = 1864745998;
        }

        public boolean callback(IEvent iEvent) {
            int Z5;
            NotifyGroupTodoEvent notifyGroupTodoEvent = (NotifyGroupTodoEvent) iEvent;
            GroupTodoComponent.this.f215752d.mo91558S();
            if (notifyGroupTodoEvent != null) {
                NotifyGroupTodoEvent.C67740a aVar = notifyGroupTodoEvent.f193762d;
                Log.m105925i("MicroMsg.roomTodo.GroupTodoComponent", "NotifyGroupTodoEvent %s %s %s", aVar.f193764b, aVar.f193765c, Integer.valueOf(aVar.f193763a));
                if (Util.isEqual(GroupTodoComponent.this.f215752d.mo91577r(), notifyGroupTodoEvent.f193762d.f193764b)) {
                    if (notifyGroupTodoEvent.f193762d.f193763a != 3 && GroupTodoComponent.this.f215556q.size() > 0) {
                        Iterator<C73365j> it = GroupTodoComponent.this.f215556q.iterator();
                        while (it.hasNext()) {
                            C73365j next = it.next();
                            if (next.f215587b == 1) {
                                GroupTodoComponent.this.mo102218b6(next.f215586a);
                                GroupTodoComponent.this.f215552j.notifyItemRangeChanged(next.f215588c, next.f215589d);
                            }
                        }
                        GroupTodoComponent.this.f215556q.clear();
                    }
                    C77712d wx02 = ((C77089d) C86312j.m106911c(C77089d.class)).wx0();
                    NotifyGroupTodoEvent.C67740a aVar2 = notifyGroupTodoEvent.f193762d;
                    C77711c Lo = wx02.mo107864Lo(aVar2.f193764b, aVar2.f193765c);
                    NotifyGroupTodoEvent.C67740a aVar3 = notifyGroupTodoEvent.f193762d;
                    int i = aVar3.f193763a;
                    if (i == 0) {
                        GroupTodoComponent.this.mo102214Y5(Lo, false);
                    } else if (i == 1) {
                        GroupTodoComponent groupTodoComponent = GroupTodoComponent.this;
                        String str = aVar3.f193765c;
                        groupTodoComponent.getClass();
                        if (!Util.isNullOrNil(str) && (Z5 = groupTodoComponent.mo102216Z5(groupTodoComponent.f215554o.remove(str))) != -1) {
                            groupTodoComponent.f215552j.notifyItemRemoved(Z5);
                        }
                    } else if (i == 2) {
                        GroupTodoComponent.this.mo102214Y5(Lo, false);
                    } else if (i == 3) {
                        GroupTodoComponent.this.mo102214Y5(Lo, true);
                    }
                    GroupTodoComponent.this.mo102219c6();
                }
            }
            return false;
        }
    };

    /* renamed from: v */
    public C73356f f215561v = new C73354d();

    /* renamed from: com.tencent.mm.ui.chatting.component.GroupTodoComponent$a */
    public class C44782a implements Animator.AnimatorListener {
        public C44782a() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            View view = GroupTodoComponent.this.f215547e;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/GroupTodoComponent$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/chatting/component/GroupTodoComponent$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.GroupTodoComponent$b */
    public class C44783b implements Animator.AnimatorListener {
        public C44783b() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            View view = GroupTodoComponent.this.f215547e;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/GroupTodoComponent$4", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/chatting/component/GroupTodoComponent$4", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.GroupTodoComponent$c */
    public class C73353c implements Runnable {
        public C73353c() {
        }

        public void run() {
            int size = ((ArrayList) GroupTodoComponent.this.f215553n).size();
            while (true) {
                size--;
                if (size >= 20) {
                    C77711c cVar = (C77711c) ((ArrayList) GroupTodoComponent.this.f215553n).remove(size);
                    if (cVar != null) {
                        GroupTodoComponent.this.f215554o.remove(cVar);
                    }
                } else {
                    GroupTodoComponent groupTodoComponent = GroupTodoComponent.this;
                    groupTodoComponent.f215552j.notifyItemRangeRemoved(20, ((ArrayList) groupTodoComponent.f215553n).size() - 20);
                    return;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.GroupTodoComponent$d */
    public class C73354d implements C73356f {
        public C73354d() {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.GroupTodoComponent$e */
    public interface C73355e {
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.GroupTodoComponent$f */
    public interface C73356f {
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.GroupTodoComponent$g */
    public interface C73357g {
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.GroupTodoComponent$h */
    public static class C73358h extends RecyclerView.C16631z {

        /* renamed from: G */
        public static final C20937c f215565G;

        /* renamed from: A */
        public RelativeLayout f215566A;

        /* renamed from: B */
        public ImageView f215567B;

        /* renamed from: C */
        public TextView f215568C;

        /* renamed from: D */
        public RelativeLayout f215569D;

        /* renamed from: E */
        public RelativeLayout f215570E;

        /* renamed from: F */
        public TextView f215571F;

        /* renamed from: z */
        public View f215572z;

        static {
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59359o = C0966R.raw.app_brand_app_default_icon_for_tail;
            int b = C76577a.m92151b(MMApplicationContext.getContext(), 20);
            int b2 = C76577a.m92151b(MMApplicationContext.getContext(), 20);
            bVar.f59354j = b;
            bVar.f59355k = b2;
            bVar.f59364t = true;
            bVar.f59346b = true;
            bVar.f59345a = true;
            f215565G = bVar.mo32666a();
        }

        public C73358h(View view) {
            super(view);
            this.f215572z = view;
            this.f215566A = (RelativeLayout) view.findViewById(C0966R.C0970id.f359402kq3);
            this.f215567B = (ImageView) view.findViewById(C0966R.C0970id.kq7);
            this.f215568C = (TextView) view.findViewById(C0966R.C0970id.kqf);
            this.f215569D = (RelativeLayout) view.findViewById(C0966R.C0970id.kq5);
            this.f215570E = (RelativeLayout) view.findViewById(C0966R.C0970id.kqa);
            this.f215571F = (TextView) view.findViewById(C0966R.C0970id.kqc);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.GroupTodoComponent$i */
    public static class C73359i extends RecyclerView.C16613e {

        /* renamed from: d */
        public Context f215573d;

        /* renamed from: e */
        public List<C77711c> f215574e;

        /* renamed from: f */
        public C73356f f215575f;

        /* renamed from: com.tencent.mm.ui.chatting.component.GroupTodoComponent$i$a */
        public class C73360a implements C76629w0.C61144a {

            /* renamed from: a */
            public final /* synthetic */ C73358h f215576a;

            /* renamed from: b */
            public final /* synthetic */ C77711c f215577b;

            /* renamed from: com.tencent.mm.ui.chatting.component.GroupTodoComponent$i$a$a */
            public class C73361a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ WxaAttributes f215578d;

                public C73361a(WxaAttributes wxaAttributes) {
                    this.f215578d = wxaAttributes;
                }

                public void run() {
                    WxaAttributes wxaAttributes;
                    C20828a b = C20828a.m22825b();
                    WxaAttributes wxaAttributes2 = this.f215578d;
                    b.mo32519h(wxaAttributes2 != null ? wxaAttributes2.field_smallHeadURL : "", C73360a.this.f215576a.f215567B, C73358h.f215565G);
                    if (Util.isNullOrNil(C73360a.this.f215577b.field_title) && (wxaAttributes = this.f215578d) != null) {
                        C73360a.this.f215576a.f215568C.setText(wxaAttributes.field_nickname);
                    }
                }
            }

            public C73360a(C73359i iVar, C73358h hVar, C77711c cVar) {
                this.f215576a = hVar;
                this.f215577b = cVar;
            }

            /* renamed from: a */
            public void mo21208a(WxaAttributes wxaAttributes) {
                MMHandlerThread.postToMainThread(new C73361a(wxaAttributes));
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.component.GroupTodoComponent$i$b */
        public class C73362b implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C73358h f215580d;

            public C73362b(C73358h hVar) {
                this.f215580d = hVar;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/chatting/component/GroupTodoComponent$ToDoAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C73356f fVar = C73359i.this.f215575f;
                if (fVar != null) {
                    int j = this.f215580d.mo17363j();
                    C73354d dVar = (C73354d) fVar;
                    dVar.getClass();
                    Object tag = view.getTag();
                    if (tag instanceof C77711c) {
                        C77711c cVar = (C77711c) tag;
                        boolean i = C76758b0.m92504i(cVar);
                        Log.m105925i("MicroMsg.roomTodo.GroupTodoComponent", "onFinish finish(%s %s)", cVar.field_todoid, Boolean.valueOf(i));
                        if (i) {
                            C61288e zx02 = ((C77089d) C86312j.m106911c(C77089d.class)).zx0();
                            String r = GroupTodoComponent.this.f215752d.mo91577r();
                            String str = cVar.field_creator;
                            String str2 = cVar.field_todoid;
                            C77955jv3 b = C76758b0.m92497b(cVar);
                            zx02.getClass();
                            C86709a0.m107524d().mo123460f(new C61479x(r, str, str2, b));
                            GroupTodoComponent.this.mo102216Z5(cVar);
                            GroupTodoComponent.this.f215552j.notifyItemRemoved(j);
                            GroupTodoComponent.this.mo102219c6();
                        }
                        C24982c0.m31598b(GroupTodoComponent.this.f215752d.mo91577r(), cVar.mo107863n2() ? 1 : 0, 1, 2, cVar.field_todoid, cVar.field_username);
                    } else {
                        Object[] objArr = new Object[1];
                        objArr[0] = tag == null ? "null" : tag.getClass().getSimpleName();
                        Log.m105921e("MicroMsg.roomTodo.GroupTodoComponent", "onFinish %s", objArr);
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/GroupTodoComponent$ToDoAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.component.GroupTodoComponent$i$c */
        public class C73363c implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C73358h f215582d;

            public C73363c(C73358h hVar) {
                this.f215582d = hVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:9:0x008f, code lost:
                r8 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(eb0.C75604z3.m90840l(true, r9, r8.mo108769t2()), (java.lang.String) null);
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onClick(android.view.View r13) {
                /*
                    r12 = this;
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    r0.add(r13)
                    java.lang.Object[] r6 = r0.toArray()
                    r0.clear()
                    java.lang.String r1 = "com/tencent/mm/ui/chatting/component/GroupTodoComponent$ToDoAdapter$3"
                    java.lang.String r2 = "android/view/View$OnClickListener"
                    java.lang.String r3 = "onClick"
                    java.lang.String r4 = "(Landroid/view/View;)V"
                    r5 = r12
                    j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                    com.tencent.mm.ui.chatting.component.GroupTodoComponent$i r0 = com.tencent.p014mm.p136ui.chatting.component.GroupTodoComponent.C73359i.this
                    com.tencent.mm.ui.chatting.component.GroupTodoComponent$f r0 = r0.f215575f
                    if (r0 == 0) goto L_0x0125
                    com.tencent.mm.ui.chatting.component.GroupTodoComponent$h r1 = r12.f215582d
                    int r1 = r1.mo17363j()
                    com.tencent.mm.ui.chatting.component.GroupTodoComponent$d r0 = (com.tencent.p014mm.p136ui.chatting.component.GroupTodoComponent.C73354d) r0
                    r0.getClass()
                    java.lang.Class<pi.d> r2 = p644pi.C77089d.class
                    java.lang.Object r13 = r13.getTag()
                    boolean r3 = r13 instanceof p684si.C77711c
                    java.lang.String r4 = "null"
                    java.lang.String r5 = "MicroMsg.roomTodo.GroupTodoComponent"
                    r6 = 1
                    r7 = 0
                    if (r3 == 0) goto L_0x0111
                    si.c r13 = (p684si.C77711c) r13
                    boolean r3 = r13.mo107863n2()
                    if (r3 == 0) goto L_0x0052
                    com.tencent.mm.ui.chatting.component.GroupTodoComponent r3 = com.tencent.p014mm.p136ui.chatting.component.GroupTodoComponent.this
                    ck3.b r3 = r3.f215752d
                    android.app.Activity r3 = r3.mo91565f()
                    java.lang.String r8 = r13.field_roomname
                    p203mi.C76758b0.m92499d(r3, r8, r7)
                    goto L_0x00b7
                L_0x0052:
                    di0.o r3 = new di0.o
                    r3.<init>()
                    java.lang.String r8 = r13.field_username
                    r3.f250929a = r8
                    java.lang.String r8 = r13.field_path
                    r3.f250934f = r8
                    r8 = 1160(0x488, float:1.626E-42)
                    r3.f250939k = r8
                    java.lang.String r8 = r13.field_roomname
                    r3.f250948t = r8
                    di3.d r8 = di3.C86312j.m106911c(r2)
                    pi.d r8 = (p644pi.C77089d) r8
                    r8.mo107397j(r3, r13)
                    java.lang.Class<f62.k0> r8 = f62.C75700k0.class
                    k40.a r8 = f40.C86709a0.m107533q(r8)
                    f62.k0 r8 = (f62.C75700k0) r8
                    g62.l r8 = r8.mo96095LE()
                    java.lang.String r9 = r13.field_roomname
                    long r10 = r13.mo107862m2()
                    com.tencent.mm.storage.g4 r8 = (com.tencent.p014mm.storage.C72972g4) r8
                    com.tencent.mm.storage.f4 r8 = r8.h30(r9, r10)
                    java.lang.String r9 = r8.getContent()
                    if (r9 != 0) goto L_0x008f
                    goto L_0x009e
                L_0x008f:
                    int r8 = r8.mo108769t2()
                    java.lang.String r8 = eb0.C75604z3.m90840l(r6, r9, r8)
                    r9 = 0
                    com.tencent.mm.message.l$b r8 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r8, r9)
                    if (r8 != 0) goto L_0x00a0
                L_0x009e:
                    r8 = 0
                    goto L_0x00a2
                L_0x00a0:
                    int r8 = r8.f195617q2
                L_0x00a2:
                    r3.f250922K = r8
                    java.lang.Class<kr0.x0> r8 = kr0.C76630x0.class
                    di3.d r8 = di3.C86312j.m106911c(r8)
                    kr0.x0 r8 = (kr0.C76630x0) r8
                    com.tencent.mm.ui.chatting.component.GroupTodoComponent r9 = com.tencent.p014mm.p136ui.chatting.component.GroupTodoComponent.this
                    ck3.b r9 = r9.f215752d
                    android.app.Activity r9 = r9.mo91565f()
                    r8.mo106898tv(r9, r3)
                L_0x00b7:
                    di3.d r2 = di3.C86312j.m106911c(r2)
                    pi.d r2 = (p644pi.C77089d) r2
                    si.d r2 = r2.wx0()
                    java.lang.String r3 = r13.field_roomname
                    java.lang.String r8 = r13.field_todoid
                    si.c r2 = r2.mo107864Lo(r3, r8)
                    boolean r3 = p203mi.C76758b0.m92500e(r2)
                    if (r2 == 0) goto L_0x00e0
                    boolean r8 = p203mi.C76758b0.m92505j(r2)
                    if (r8 == 0) goto L_0x00e1
                    com.tencent.mm.ui.chatting.component.k2 r9 = new com.tencent.mm.ui.chatting.component.k2
                    r9.<init>(r0, r2, r1)
                    r10 = 300(0x12c, double:1.48E-321)
                    com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r9, r10)
                    goto L_0x00e1
                L_0x00e0:
                    r8 = 0
                L_0x00e1:
                    com.tencent.mm.ui.chatting.component.GroupTodoComponent r0 = com.tencent.p014mm.p136ui.chatting.component.GroupTodoComponent.this
                    ck3.b r0 = r0.f215752d
                    java.lang.String r0 = r0.mo91577r()
                    boolean r1 = r13.mo107863n2()
                    java.lang.String r9 = r13.field_todoid
                    java.lang.String r13 = r13.field_username
                    p203mi.C24982c0.m31597a(r0, r1, r6, r9, r13)
                    r13 = 3
                    java.lang.Object[] r13 = new java.lang.Object[r13]
                    if (r2 != 0) goto L_0x00fa
                    goto L_0x00fc
                L_0x00fa:
                    java.lang.String r4 = r2.field_todoid
                L_0x00fc:
                    r13[r7] = r4
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
                    r13[r6] = r0
                    r0 = 2
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
                    r13[r0] = r1
                    java.lang.String r0 = "click update to finish(%s %s %s)"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r13)
                    goto L_0x0125
                L_0x0111:
                    java.lang.Object[] r0 = new java.lang.Object[r6]
                    if (r13 != 0) goto L_0x0116
                    goto L_0x011e
                L_0x0116:
                    java.lang.Class r13 = r13.getClass()
                    java.lang.String r4 = r13.getSimpleName()
                L_0x011e:
                    r0[r7] = r4
                    java.lang.String r13 = "onClick %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r13, r0)
                L_0x0125:
                    java.lang.String r13 = "com/tencent/mm/ui/chatting/component/GroupTodoComponent$ToDoAdapter$3"
                    java.lang.String r0 = "android/view/View$OnClickListener"
                    java.lang.String r1 = "onClick"
                    java.lang.String r2 = "(Landroid/view/View;)V"
                    j20.C117292a.m165361g(r12, r13, r0, r1, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.GroupTodoComponent.C73359i.C73363c.onClick(android.view.View):void");
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.component.GroupTodoComponent$i$d */
        public class C73364d implements View.OnLongClickListener {

            /* renamed from: d */
            public final /* synthetic */ C73358h f215584d;

            public C73364d(C73358h hVar) {
                this.f215584d = hVar;
            }

            public boolean onLongClick(View view) {
                View view2 = view;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view2);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/chatting/component/GroupTodoComponent$ToDoAdapter$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                C73356f fVar = C73359i.this.f215575f;
                if (fVar != null) {
                    int j = this.f215584d.mo17363j();
                    C73354d dVar = (C73354d) fVar;
                    dVar.getClass();
                    Object tag = view.getTag();
                    if (tag instanceof C77711c) {
                        C77711c cVar = (C77711c) tag;
                        C78253a aVar = new C78253a(GroupTodoComponent.this.f215752d.mo91565f(), view2);
                        aVar.f229256y = true;
                        aVar.f229228D = true;
                        aVar.f229229E = true;
                        aVar.f229249r = new C73523l2(dVar);
                        aVar.f229251t = new C73531m2(dVar, cVar, j);
                        int[] iArr = new int[2];
                        view2.getLocationInWindow(iArr);
                        int i = iArr[0];
                        int i2 = iArr[1] - 32;
                        if (i <= 0) {
                            i = 16;
                        }
                        if (i2 < 0) {
                            i2 = 16;
                        }
                        if (i > C78967g.m95476i(GroupTodoComponent.this.f215752d.mo91565f())) {
                            i = C78967g.m95476i(GroupTodoComponent.this.f215752d.mo91565f()) - 16;
                        }
                        aVar.f229227C = new C73554n2(dVar, view2);
                        aVar.f229248q = view2;
                        aVar.mo71743n(i, i2);
                        view2.setBackgroundResource(C0966R.C0969drawable.f4765ma);
                        C24982c0.m31598b(GroupTodoComponent.this.f215752d.mo91577r(), cVar.mo107863n2() ? 1 : 0, 4, 2, cVar.field_todoid, cVar.field_username);
                    }
                    C117292a.m165362h(true, this, "com/tencent/mm/ui/chatting/component/GroupTodoComponent$ToDoAdapter$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                    return true;
                }
                C117292a.m165362h(false, this, "com/tencent/mm/ui/chatting/component/GroupTodoComponent$ToDoAdapter$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return false;
            }
        }

        public C73359i(Context context, List<C77711c> list, C73356f fVar) {
            this.f215573d = context;
            this.f215574e = list;
            this.f215575f = fVar;
        }

        public int getItemCount() {
            return this.f215574e.size();
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            int i2 = i;
            Class cls = C76629w0.class;
            List<C77711c> list = this.f215574e;
            if (list != null && i2 >= 0 && i2 < list.size()) {
                C73358h hVar = (C73358h) zVar;
                C77711c cVar = this.f215574e.get(i2);
                Log.m105919d("MicroMsg.roomTodo.GroupTodoComponent", "onBindViewHolder() i:%s", Integer.valueOf(i));
                View view = hVar.f215572z;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/GroupTodoComponent$ToDoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/component/GroupTodoComponent$ToDoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (cVar.mo107863n2()) {
                    hVar.f215567B.setImageResource(C0966R.C0969drawable.beh);
                    hVar.f215568C.setText(Util.nullAs(cVar.field_title, this.f215573d.getString(C0966R.string.b4n)));
                } else {
                    WxaAttributes N2 = ((C76629w0) C86312j.m106911c(cls)).mo106879N2(cVar.field_username);
                    if (N2 == null) {
                        ((C76629w0) C86312j.m106911c(cls)).mo106884tG(cVar.field_username, new C73360a(this, hVar, cVar));
                        if (!Util.isNullOrNil(cVar.field_title)) {
                            hVar.f215568C.setText(Util.nullAs(cVar.field_title, ""));
                        }
                    } else {
                        C20828a.m22825b().mo32519h(N2.field_smallHeadURL, hVar.f215567B, C73358h.f215565G);
                        hVar.f215568C.setText(Util.nullAs(cVar.field_title, N2.field_nickname));
                    }
                }
                if (i2 == 0) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) hVar.f215566A.getLayoutParams();
                    if (layoutParams.leftMargin == 0) {
                        layoutParams.leftMargin = C76577a.m92151b(this.f215573d, 2);
                        hVar.f215566A.setLayoutParams(layoutParams);
                    }
                } else {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) hVar.f215566A.getLayoutParams();
                    if (layoutParams2.leftMargin != 0) {
                        layoutParams2.leftMargin = 0;
                        hVar.f215566A.setLayoutParams(layoutParams2);
                    }
                }
                int i3 = cVar.field_state;
                if (i3 == 0) {
                    hVar.f215569D.setVisibility(8);
                    if (cVar.field_nreply > 0) {
                        hVar.f215570E.setVisibility(0);
                        TextView textView = hVar.f215571F;
                        textView.setText("" + cVar.field_nreply);
                    } else {
                        hVar.f215570E.setVisibility(8);
                    }
                } else if (i3 == 1) {
                    hVar.f215569D.setVisibility(0);
                    hVar.f215570E.setVisibility(8);
                    hVar.f215569D.setTag(cVar);
                    hVar.f215569D.setOnClickListener(new C73362b(hVar));
                }
                hVar.f215566A.setTag(cVar);
                hVar.f215566A.setOnClickListener(new C73363c(hVar));
                hVar.f215566A.setOnLongClickListener(new C73364d(hVar));
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C73358h(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f6842q1, viewGroup, false));
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.GroupTodoComponent$j */
    public static class C73365j {

        /* renamed from: a */
        public C77711c f215586a;

        /* renamed from: b */
        public int f215587b;

        /* renamed from: c */
        public int f215588c;

        /* renamed from: d */
        public int f215589d;

        public C73365j(C77711c cVar, int i, int i2, int i3) {
            this.f215586a = cVar;
            this.f215587b = i;
            this.f215588c = i2;
            this.f215589d = i3;
        }
    }

    /* renamed from: F4 */
    public void mo26186F4() {
        Log.m105918d("MicroMsg.roomTodo.GroupTodoComponent", "onChattingResume");
        if (this.f215556q.size() > 0) {
            Log.m105925i("MicroMsg.roomTodo.GroupTodoComponent", "saveOperationList:%s", Integer.valueOf(this.f215556q.size()));
            Iterator<C73365j> it = this.f215556q.iterator();
            while (it.hasNext()) {
                C73365j next = it.next();
                if (next.f215587b == 1) {
                    mo102218b6(next.f215586a);
                    this.f215552j.notifyItemRangeChanged(next.f215588c, next.f215589d);
                }
            }
            this.f215556q.clear();
        }
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        Log.m105918d("MicroMsg.roomTodo.GroupTodoComponent", "onChattingPause");
    }

    /* renamed from: O2 */
    public void mo102212O2(C73355e eVar) {
        this.f215555p = eVar;
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        Log.m105925i("MicroMsg.roomTodo.GroupTodoComponent", "onChattingEnterAnimStart: user %s hashCode:%s", this.f215752d.mo91577r(), Integer.valueOf(hashCode()));
        if (this.f215547e == null) {
            long c = C31543z5.m39453c();
            View c2 = this.f215752d.mo91562c(C0966R.C0970id.b4v);
            this.f215547e = c2;
            this.f215548f = (RecyclerView) c2.findViewById(C0966R.C0970id.kqe);
            this.f215549g = (ImageView) this.f215547e.findViewById(C0966R.C0970id.kq_);
            this.f215550h = (ImageView) this.f215547e.findViewById(C0966R.C0970id.kqd);
            this.f215548f.mo17043c(new C73496i2(this));
            WxLinearLayoutManager wxLinearLayoutManager = new WxLinearLayoutManager(this.f215752d.mo91565f());
            this.f215551i = wxLinearLayoutManager;
            wxLinearLayoutManager.mo16974W(0);
            this.f215548f.setLayoutManager(this.f215551i);
            C73359i iVar = new C73359i(this.f215752d.mo91565f(), this.f215553n, this.f215561v);
            this.f215552j = iVar;
            this.f215548f.setAdapter(iVar);
            this.f215552j.notifyDataSetChanged();
            Log.m105925i("MicroMsg.roomTodo.GroupTodoComponent", "constructor interTime:%s", Long.valueOf(C31543z5.m39453c() - c));
        }
        long c3 = C31543z5.m39453c();
        if (C72996z1.m85807K5(this.f215752d.mo91577r())) {
            this.f215560u.alive();
            if (this.f215547e != null) {
                ((ArrayList) this.f215553n).clear();
                this.f215554o.clear();
                C77712d wx02 = ((C77089d) C86312j.m106911c(C77089d.class)).wx0();
                String r = this.f215752d.mo91577r();
                wx02.getClass();
                ArrayList arrayList = new ArrayList();
                if (!Util.isNullOrNil(r)) {
                    long c4 = C31543z5.m39453c();
                    ISQLiteDatabase iSQLiteDatabase = wx02.f226496d;
                    String[] strArr = C77711c.f226491T.columns;
                    Cursor query = iSQLiteDatabase.query("GroupTodo", strArr, "roomname=? and createtime>=? AND state IN (0,1)", new String[]{r, (c4 - C77712d.f226493e.longValue()) + ""}, (String) null, (String) null, "updatetime DESC limit 20");
                    if (query != null) {
                        while (query.moveToNext()) {
                            try {
                                C77711c cVar = new C77711c();
                                cVar.convertFrom(query);
                                arrayList.add(cVar);
                            } finally {
                                query.close();
                            }
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C77711c cVar2 = (C77711c) it.next();
                    ((ArrayList) this.f215553n).add(cVar2);
                    this.f215554o.put(cVar2.field_todoid, cVar2);
                }
                Collections.sort(this.f215553n, new C73506j2(this));
                this.f215552j.notifyDataSetChanged();
                mo102219c6();
            }
            mo102217a6();
        } else {
            ((ArrayList) this.f215553n).clear();
            this.f215554o.clear();
            Collections.sort(this.f215553n, new C73506j2(this));
            this.f215552j.notifyDataSetChanged();
            mo102219c6();
            View view = this.f215547e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/GroupTodoComponent", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/component/GroupTodoComponent", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        Log.m105925i("MicroMsg.roomTodo.GroupTodoComponent", "onResume chatroomUsername:%s interTime:%s size:%s", this.f215752d.mo91577r(), Long.valueOf(C31543z5.m39453c() - c3), Integer.valueOf(((ArrayList) this.f215553n).size()));
    }

    /* renamed from: R0 */
    public void mo102213R0(boolean z) {
        if (C72996z1.m85807K5(this.f215752d.mo91577r())) {
            this.f215557r = true;
            if (this.f215547e.getVisibility() != 0 && ((ArrayList) this.f215553n).size() != 0) {
                if (this.f215559t == null) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f215547e, "alpha", new float[]{0.0f, 1.0f});
                    this.f215559t = ofFloat;
                    ofFloat.addListener(new C44783b());
                }
                if (z) {
                    this.f215559t.setDuration(100);
                } else {
                    this.f215559t.setDuration(200);
                }
                this.f215559t.start();
            }
        }
    }

    /* renamed from: Y5 */
    public final void mo102214Y5(C77711c cVar, boolean z) {
        if (C76758b0.m92500e(cVar)) {
            if (!((ArrayList) this.f215553n).contains(cVar)) {
                if (cVar != null) {
                    ((ArrayList) this.f215553n).add(0, cVar);
                    this.f215554o.put(cVar.field_todoid, cVar);
                    this.f215552j.notifyItemInserted(0);
                }
                if (((ArrayList) this.f215553n).size() > 20) {
                    C119179t tVar = C119157j.f356862d;
                    C73353c cVar2 = new C73353c();
                    C119157j jVar = (C119157j) tVar;
                    jVar.getClass();
                    jVar.mo183892w(cVar2, 300, false);
                }
            } else if (!z) {
                int b6 = mo102218b6(cVar);
                if (b6 != -1) {
                    this.f215552j.notifyItemRangeChanged(0, b6 + 1);
                }
            } else if (((ArrayList) this.f215553n).indexOf(cVar) != -1) {
                this.f215556q.add(new C73365j(cVar, 1, 0, ((ArrayList) this.f215553n).indexOf(cVar) + 1));
            }
        }
    }

    /* renamed from: Z3 */
    public void mo102215Z3(boolean z) {
        if (C72996z1.m85807K5(this.f215752d.mo91577r())) {
            this.f215557r = false;
            if (this.f215547e.getVisibility() == 0) {
                if (this.f215558s == null) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f215547e, "alpha", new float[]{1.0f, 0.0f});
                    this.f215558s = ofFloat;
                    ofFloat.addListener(new C44782a());
                }
                if (z) {
                    this.f215558s.setDuration(100);
                } else {
                    this.f215558s.setDuration(200);
                }
                this.f215558s.start();
            }
        }
    }

    /* renamed from: Z5 */
    public final int mo102216Z5(C77711c cVar) {
        if (cVar == null) {
            return -1;
        }
        if (((ArrayList) this.f215553n).contains(cVar)) {
            int indexOf = ((ArrayList) this.f215553n).indexOf(cVar);
            ((ArrayList) this.f215553n).remove(cVar);
            this.f215554o.remove(cVar.field_todoid);
            return indexOf;
        }
        Log.m105920e("MicroMsg.roomTodo.GroupTodoComponent", "removeTodoItemList todo no exist???");
        return -1;
    }

    /* renamed from: a6 */
    public final void mo102217a6() {
        C72976h2 j = ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69771j(this.f215752d.mo91577r());
        if (j != null && j.mo108830w2() == 1) {
            j.mo108800V2(0);
            ((C44660i2) C97625j3.m125812b().mo105908w()).mo69774l0(j, j.getUsername(), false);
        }
    }

    /* renamed from: b6 */
    public final int mo102218b6(C77711c cVar) {
        if (cVar == null) {
            return -1;
        }
        if (((ArrayList) this.f215553n).contains(cVar)) {
            int indexOf = ((ArrayList) this.f215553n).indexOf(cVar);
            ((ArrayList) this.f215553n).remove(indexOf);
            ((ArrayList) this.f215553n).add(0, cVar);
            this.f215554o.put(cVar.field_todoid, cVar);
            return indexOf;
        }
        Log.m105920e("MicroMsg.roomTodo.GroupTodoComponent", "updateItem todo no exist???");
        return -1;
    }

    /* renamed from: c6 */
    public final void mo102219c6() {
        View view;
        View view2;
        if (this.f215547e == null) {
            return;
        }
        if (((ArrayList) this.f215553n).size() == 0) {
            View view3 = this.f215547e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/GroupTodoComponent", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/ui/chatting/component/GroupTodoComponent", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C73355e eVar = this.f215555p;
            if (eVar != null && (view2 = ((ChatFooter$$d) eVar).f211985a.f211926r) != null) {
                view2.setBackgroundResource(C0966R.C0969drawable.c4w);
            }
        } else if (this.f215557r) {
            View view5 = this.f215547e;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/component/GroupTodoComponent", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/ui/chatting/component/GroupTodoComponent", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C73355e eVar2 = this.f215555p;
            if (eVar2 != null && (view = ((ChatFooter$$d) eVar2).f211985a.f211926r) != null) {
                view.setBackgroundResource(C0966R.C0969drawable.c4x);
            }
        }
    }

    /* renamed from: m2 */
    public int mo102220m2() {
        if (this.f215547e == null || ((ArrayList) this.f215553n).size() <= 0) {
            return 0;
        }
        return C76577a.m92151b(this.f215752d.mo91565f(), 48);
    }

    /* renamed from: n2 */
    public void mo26199n2() {
        if (C72996z1.m85807K5(this.f215752d.mo91577r())) {
            Log.m105924i("MicroMsg.roomTodo.GroupTodoComponent", "onPause");
            this.f215560u.dead();
            View view = this.f215547e;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/GroupTodoComponent", "onPause", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/chatting/component/GroupTodoComponent", "onPause", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            mo102217a6();
        }
        Log.m105918d("MicroMsg.roomTodo.GroupTodoComponent", "onChattingExitAnimEnd");
    }
}
