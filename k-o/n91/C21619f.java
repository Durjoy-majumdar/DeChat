package n91;

import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import com.tencent.p014mm.sdk.platformtools.Log;
import e91.C116711b;
import gy3.C87412m;
import h81.C20928j;
import j20.C21153d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import te3.xr4;

/* renamed from: n91.f */
public final class C21619f {

    /* renamed from: a */
    public C21613c f61210a;

    /* renamed from: b */
    public List<C20928j.C20932d> f61211b = new ArrayList();

    /* renamed from: c */
    public WeakReference<Object[]> f61212c;

    /* renamed from: d */
    public Pair<String, String> f61213d;

    /* renamed from: e */
    public final C21621b f61214e = new C21621b(this);

    /* renamed from: f */
    public boolean f61215f;

    /* renamed from: g */
    public final C21620a f61216g = new C21620a(this);

    /* renamed from: h */
    public int f61217h;

    /* renamed from: i */
    public long f61218i;

    /* renamed from: n91.f$a */
    public static final class C21620a implements C21153d {

        /* renamed from: a */
        public final /* synthetic */ C21619f f61219a;

        public C21620a(C21619f fVar) {
            this.f61219a = fVar;
        }

        /* renamed from: a */
        public void mo32409a(String str, String str2, String str3, Object obj, Object obj2) {
            if (this.f61219a.f61215f && obj != null && (obj instanceof View) && obj2 != null && (obj2 instanceof Boolean) && ((Boolean) obj2).booleanValue()) {
                C21619f fVar = this.f61219a;
                fVar.f61215f = false;
                C21619f.m24543a(fVar, (View) obj, str, obj, C21614d.TOUCH);
            }
        }

        /* renamed from: b */
        public void mo32410b(String str, String str2, String str3, Object obj, Object[] objArr) {
            if (objArr != null) {
                boolean z = true;
                if (!(objArr.length == 0)) {
                    MotionEvent motionEvent = objArr[0];
                    if (motionEvent instanceof MotionEvent) {
                        C87412m.m108592e(motionEvent, "null cannot be cast to non-null type android.view.MotionEvent");
                        C21619f fVar = this.f61219a;
                        if (motionEvent.getAction() != 0) {
                            z = false;
                        }
                        fVar.f61215f = z;
                    }
                }
            }
        }
    }

    /* renamed from: n91.f$b */
    public static final class C21621b implements C21153d {

        /* renamed from: a */
        public final /* synthetic */ C21619f f61220a;

        public C21621b(C21619f fVar) {
            this.f61220a = fVar;
        }

        /* renamed from: a */
        public void mo32409a(String str, String str2, String str3, Object obj, Object obj2) {
            C21614d dVar = C21614d.TOUCH;
            if (C87412m.m108589b(str2, "onTouch") && C87412m.m108589b(str3, "(Landroid/view/View;Landroid/view/MotionEvent;)Z")) {
                WeakReference<Object[]> weakReference = this.f61220a.f61212c;
                AdapterView adapterView = null;
                Object[] objArr = weakReference != null ? weakReference.get() : null;
                if (objArr != null) {
                    boolean z = true;
                    MotionEvent motionEvent = null;
                    for (int length = objArr.length - 1; -1 < length; length--) {
                        Object obj3 = objArr[length];
                        if (obj3 instanceof MotionEvent) {
                            C87412m.m108592e(obj3, "null cannot be cast to non-null type android.view.MotionEvent");
                            motionEvent = (MotionEvent) obj3;
                        } else if (obj3 instanceof View) {
                            C87412m.m108592e(obj3, "null cannot be cast to non-null type android.view.View");
                            adapterView = (View) obj3;
                        }
                        if (adapterView != null && motionEvent != null) {
                            break;
                        }
                    }
                    if (adapterView != null && motionEvent != null && motionEvent.getAction() == 1) {
                        if (obj2 == null || !(obj2 instanceof Boolean) || !((Boolean) obj2).booleanValue()) {
                            boolean hasOnClickListeners = adapterView.hasOnClickListeners();
                            if (!(adapterView instanceof AdapterView) || adapterView.getOnItemClickListener() == null) {
                                z = false;
                            }
                            if (!hasOnClickListeners && !z) {
                                C21619f.m24543a(this.f61220a, adapterView, str, obj, dVar);
                                return;
                            }
                            return;
                        }
                        this.f61220a.f61213d = new Pair<>(adapterView.getClass().getName(), obj != null ? obj.getClass().getName() : str);
                        C21619f.m24543a(this.f61220a, adapterView, str, obj, dVar);
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo32410b(String str, String str2, String str3, Object obj, Object[] objArr) {
            View view;
            C21614d dVar = C21614d.SINGLE_CLICK;
            if (objArr != null) {
                if (!(objArr.length == 0)) {
                    View view2 = objArr[0];
                    String str4 = null;
                    if (!(view2 instanceof View) || objArr.length != 1) {
                        int length = objArr.length - 1;
                        while (true) {
                            if (-1 >= length) {
                                view = null;
                                break;
                            }
                            View view3 = objArr[length];
                            if (view3 instanceof View) {
                                C87412m.m108592e(view3, "null cannot be cast to non-null type android.view.View");
                                view = view3;
                                break;
                            }
                            length--;
                        }
                    } else {
                        C87412m.m108592e(view2, "null cannot be cast to non-null type android.view.View");
                        view = view2;
                    }
                    if (view != null) {
                        this.f61220a.f61212c = null;
                        if (C87412m.m108589b(str2, "onTouch") && C87412m.m108589b(str3, "(Landroid/view/View;Landroid/view/MotionEvent;)Z")) {
                            for (int length2 = objArr.length - 1; -1 < length2; length2--) {
                                MotionEvent motionEvent = objArr[length2];
                                if (motionEvent instanceof MotionEvent) {
                                    C87412m.m108592e(motionEvent, "null cannot be cast to non-null type android.view.MotionEvent");
                                    if (motionEvent.getAction() == 1) {
                                        this.f61220a.f61212c = new WeakReference<>(objArr);
                                    }
                                }
                            }
                        } else if (!C87412m.m108589b(str2, "onClick") || !C87412m.m108589b(str3, "(Landroid/view/View;)V")) {
                            if (C87412m.m108589b("onDrag", str2) && C87412m.m108589b("(Landroid/view/View;Landroid/view/DragEvent;)Z", str3)) {
                                dVar = C21614d.DRAG;
                            } else if (C87412m.m108589b("onLongClick", str2) && C87412m.m108589b("(Landroid/view/View;)Z", str3)) {
                                dVar = C21614d.LONG_CLICK;
                            } else if (C87412m.m108589b("onKey", str2) && C87412m.m108589b("(Landroid/view/View;ILandroid/view/KeyEvent;)Z", str3)) {
                                dVar = C21614d.KEY;
                            } else if (C87412m.m108589b("onHover", str2) && C87412m.m108589b("(Landroid/view/View;Landroid/view/MotionEvent;)Z", str3)) {
                                dVar = C21614d.HOVER;
                            } else if (C87412m.m108589b("onItemClick", str2) && C87412m.m108589b("(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", str3)) {
                                if (objArr.length > 1) {
                                    View view4 = objArr[1];
                                    if (view4 instanceof View) {
                                        C87412m.m108592e(view4, "null cannot be cast to non-null type android.view.View");
                                        view = view4;
                                    }
                                }
                                dVar = C21614d.ITEM_CLICK;
                            } else if (C87412m.m108589b("onItemLongClick", str2) && C87412m.m108589b("(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", str3)) {
                                dVar = C21614d.ITEM_LONG_CLICK;
                            } else if (C87412m.m108589b("onItemSelected", str2) && C87412m.m108589b("(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", str3)) {
                                dVar = C21614d.ITEM_SELECTED;
                            } else if (C87412m.m108589b("onTouchEvent", str2) && C87412m.m108589b("(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", str3)) {
                                dVar = C21614d.TOUCH;
                            }
                            if (C21608a.f61182e) {
                                Log.m105928w("HABBYGE-MALI.ViewOpCallback", "gGestureFirst=TRUE");
                                C21608a.f61182e = false;
                                return;
                            }
                            C21619f.m24543a(this.f61220a, view, str, obj, dVar);
                        } else {
                            Pair<String, String> pair = this.f61220a.f61213d;
                            String str5 = pair != null ? (String) pair.first : null;
                            String str6 = pair != null ? (String) pair.second : null;
                            if (!(str5 == null || !C87412m.m108589b(str5, view.getClass().getName()) || str6 == null)) {
                                if (!C87412m.m108589b(str6, str)) {
                                    if (obj != null) {
                                        str4 = obj.getClass().getName();
                                    }
                                    if (C87412m.m108589b(str6, str4)) {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                            C21619f.m24543a(this.f61220a, view, str, obj, dVar);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m24543a(C21619f fVar, View view, String str, Object obj, C21614d dVar) {
        C21613c cVar;
        fVar.getClass();
        C21614d dVar2 = C21614d.TOUCH;
        String c = view.getId() == -1 ? C117615g.f351847a.mo182336c(view) : C117615g.f351847a.mo182335b(view);
        String s = view.getId() == -1 ? c : C116711b.m164594s(view.getId());
        xr4 xr4 = new xr4();
        xr4.f354548e = c;
        xr4.f354547d = s;
        xr4.f354555o = System.currentTimeMillis();
        xr4.f354553j = view.hashCode();
        xr4.f354549f = C116711b.m164583h(view.getClass().getName());
        if (obj != null) {
            str = obj.getClass().getName();
        }
        xr4.f354551h = C116711b.m164583h(str);
        xr4.f354552i = dVar.f61206d;
        xr4.f354561u = view instanceof ViewGroup ? 1 : 0;
        if (!(dVar == dVar2 || (cVar = fVar.f61210a) == null)) {
            cVar.mo33861a(view, xr4);
        }
        int hashCode = view.hashCode();
        long currentTimeMillis = System.currentTimeMillis();
        if (hashCode != fVar.f61217h || currentTimeMillis - fVar.f61218i >= 500) {
            fVar.f61217h = hashCode;
            fVar.f61218i = currentTimeMillis;
            Iterator it = ((ArrayList) fVar.f61211b).iterator();
            while (it.hasNext()) {
                C20928j.C20932d dVar3 = (C20928j.C20932d) it.next();
                if (dVar == C21614d.SINGLE_CLICK) {
                    dVar3.mo32639H(view);
                } else if (dVar == dVar2) {
                    dVar3.mo32641K(view);
                } else if (dVar == C21614d.LONG_CLICK) {
                    dVar3.mo32664z(view);
                } else if (dVar == C21614d.DOUBLE_CLICK) {
                    dVar3.mo32656r(view);
                } else if (dVar == C21614d.ITEM_CLICK) {
                    dVar3.mo32663y(view);
                } else if (dVar == C21614d.ITEM_LONG_CLICK) {
                    dVar3.mo32659u(view);
                } else if (dVar == C21614d.ITEM_SELECTED) {
                    dVar3.mo32643a(view);
                } else if (dVar == C21614d.KEY) {
                    dVar3.mo32636A(view);
                } else {
                    dVar3.mo32642L(view);
                }
            }
        }
    }
}
