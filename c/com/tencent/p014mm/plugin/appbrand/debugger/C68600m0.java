package com.tencent.p014mm.plugin.appbrand.debugger;

import al3.C0086a;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.debugger.C81745v;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Future;
import k20.C60958c;
import k20.C9556a;
import qo3.C77389a;
import qo3.C77398g;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.m0 */
public class C68600m0 extends FrameLayout {

    /* renamed from: d */
    public C81743t f197046d;

    /* renamed from: e */
    public ViewGroup f197047e;

    /* renamed from: f */
    public RemoteDebugMoveView f197048f;

    /* renamed from: g */
    public LinkedList<String> f197049g = new LinkedList<>();

    /* renamed from: h */
    public TextView f197050h;

    /* renamed from: i */
    public TextView f197051i;

    /* renamed from: j */
    public TextView f197052j;

    /* renamed from: n */
    public TextView f197053n;

    /* renamed from: o */
    public TextView f197054o;

    /* renamed from: p */
    public TextView f197055p;

    /* renamed from: q */
    public TextView f197056q;

    /* renamed from: r */
    public ImageView f197057r;

    /* renamed from: s */
    public ImageView f197058s;

    /* renamed from: t */
    public View f197059t;

    /* renamed from: u */
    public boolean f197060u = false;

    /* renamed from: v */
    public C68602c f197061v;

    /* renamed from: w */
    public C77398g f197062w;

    /* renamed from: x */
    public View.OnClickListener f197063x = new C68601a();

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.m0$a */
    public class C68601a implements View.OnClickListener {
        public C68601a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/debugger/RemoteDebugView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C68600m0.this.onClick(view);
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/debugger/RemoteDebugView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.m0$c */
    public interface C68602c {
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.m0$b */
    public class C68603b implements DialogInterface.OnClickListener {
        public C68603b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C68602c cVar = C68600m0.this.f197061v;
            if (cVar != null) {
                C81745v.C81746a aVar = (C81745v.C81746a) cVar;
                C81745v vVar = C81745v.this;
                vVar.f239914h.mo114050f();
                C81695a0 a0Var = vVar.f239914h;
                a0Var.getClass();
                Log.m105924i("MicroMsg.RemoteDebugMsgMrg", "onClose");
                Future<?> future = a0Var.f239786j;
                if (future != null) {
                    future.cancel(false);
                }
                C83231l.m102146g(C81745v.this.f239915i.getAppId(), C83231l.C83235e.CLOSE);
                if (C81745v.this.f239915i.getRuntime() != null) {
                    C81745v.this.f239915i.getRuntime().mo113006E();
                }
            }
        }
    }

    public C68600m0(Context context, C81743t tVar, C68602c cVar) {
        super(context);
        this.f197046d = tVar;
        this.f197061v = cVar;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackgroundColor(getContext().getResources().getColor(C0966R.color.ahf));
        setId(C0966R.C0970id.f5873r1);
    }

    /* renamed from: a */
    public static void m80856a(C68600m0 m0Var, String str) {
        m0Var.f197049g.add(0, str);
        while (m0Var.f197049g.size() > 10) {
            m0Var.f197049g.removeLast();
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = m0Var.f197049g.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append("\n");
        }
        m0Var.f197056q.setText(sb.toString());
        if (m0Var.f197060u) {
            m0Var.f197056q.setVisibility(0);
        } else {
            m0Var.f197056q.setVisibility(8);
        }
    }

    /* renamed from: b */
    public static void m80857b(C68600m0 m0Var) {
        if (m0Var.f197046d.mo114111c() || !m0Var.f197046d.mo114112d()) {
            m0Var.f197057r.setImageResource(C0966R.C0969drawable.f4466db);
            m0Var.f197050h.setText(m0Var.getContext().getString(C0966R.string.f7854tu));
            return;
        }
        m0Var.f197057r.setImageResource(C0966R.C0969drawable.f4467dc);
        m0Var.f197050h.setText(m0Var.getContext().getString(C0966R.string.f7855tv));
    }

    public void bringToFront() {
        if (this.f197047e == null) {
            Log.m105928w("MicroMsg.RemoteDebugView", "bringToFront mContentView is null");
        }
    }

    /* renamed from: c */
    public final boolean mo94268c() {
        boolean z;
        int i;
        int i2;
        C81743t tVar = this.f197046d;
        synchronized (tVar) {
            z = tVar.f239893o;
        }
        if (z) {
            return true;
        }
        C81743t tVar2 = this.f197046d;
        synchronized (tVar2) {
            i = tVar2.f239884f;
        }
        if (i == 4) {
            return true;
        }
        C81743t tVar3 = this.f197046d;
        synchronized (tVar3) {
            i2 = tVar3.f239884f;
        }
        return i2 == 5;
    }

    /* renamed from: d */
    public void mo94269d() {
        if (this.f197060u) {
            View view = this.f197059t;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/debugger/RemoteDebugView", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/debugger/RemoteDebugView", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f197049g.size() > 0) {
                this.f197056q.setVisibility(0);
            } else {
                this.f197056q.setVisibility(8);
            }
            this.f197054o.setVisibility(8);
        } else {
            View view2 = this.f197059t;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/debugger/RemoteDebugView", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/debugger/RemoteDebugView", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f197056q.setVisibility(8);
            this.f197054o.setVisibility(0);
        }
        invalidate();
    }

    /* renamed from: e */
    public final void mo94270e() {
        C77398g gVar = this.f197062w;
        if (gVar == null || !gVar.isShowing()) {
            Context context = getContext();
            if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                C77389a aVar = new C77389a();
                aVar.f225644a = context.getString(C0966R.string.f7853tt);
                aVar.f225660q = "";
                aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.au5);
                aVar.f225620C = new C68603b();
                aVar.f225664u = C0086a.m38a(context).getString(C0966R.string.atx);
                C77398g gVar2 = new C77398g(context, C0966R.style.a66);
                gVar2.mo107525e(aVar);
                this.f197062w = gVar2;
                gVar2.show();
            }
        }
    }

    public void onClick(View view) {
        if (view.getId() == C0966R.C0970id.f6001ui) {
            this.f197060u = true;
            mo94269d();
            RemoteDebugMoveView remoteDebugMoveView = this.f197048f;
            remoteDebugMoveView.getClass();
            remoteDebugMoveView.postDelayed(new C68610z(remoteDebugMoveView), 50);
        } else if (view.getId() == C0966R.C0970id.f5996ud) {
            this.f197060u = false;
            mo94269d();
        } else if (view.getId() == C0966R.C0970id.f6004ul) {
            mo94270e();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (mo94268c()) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
