package qk1;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import cj1.C0581o5;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import fy3.C32228q;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C9506m;
import jq3.C9507n;
import k20.C9556a;
import rx3.C13598b0;
import sn0.C90259e;

/* renamed from: qk1.i0 */
public final class C12806i0 extends C9506m<C12807a> {

    /* renamed from: e */
    public C45795b f36652e;

    /* renamed from: f */
    public final String f36653f = "Finder.FinderLiveCommentAdapter";

    /* renamed from: g */
    public final ArrayList<C0581o5> f36654g = new ArrayList<>();

    /* renamed from: h */
    public C32228q<? super C0581o5, ? super View, ? super C9507n, C13598b0> f36655h;

    /* renamed from: i */
    public C32228q<? super C0581o5, ? super View, ? super C9507n, C13598b0> f36656i;

    /* renamed from: j */
    public C32228q<? super C0581o5, ? super View, ? super C9507n, C13598b0> f36657j;

    /* renamed from: qk1.i0$a */
    public static final class C12807a extends C9507n {

        /* renamed from: A */
        public final MMNeat7extView f36658A;

        /* renamed from: B */
        public final View f36659B;

        /* renamed from: C */
        public final View f36660C;

        /* renamed from: D */
        public final View f36661D;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12807a(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.fsv);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…_comment_item_content_tv)");
            this.f36658A = (MMNeat7extView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.fss);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.live_comment_container)");
            this.f36659B = findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.fsr);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.live_comment_arrow)");
            this.f36660C = findViewById3;
            View findViewById4 = view.findViewById(C0966R.C0970id.iox);
            C87412m.m108593f(findViewById4, "itemView.findViewById(R.id.comment_like_ui_root)");
            this.f36661D = findViewById4;
        }

        /* renamed from: B */
        public final MMNeat7extView mo12335B() {
            return this.f36658A;
        }

        /* renamed from: z */
        public final View mo12336z() {
            return this.f36659B;
        }
    }

    /* renamed from: qk1.i0$b */
    public static final class C12808b implements GestureDetector.OnGestureListener {
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$_onBindViewHolder$3", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$_onBindViewHolder$3", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        public void onShowPress(MotionEvent motionEvent) {
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$_onBindViewHolder$3", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$_onBindViewHolder$3", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: qk1.i0$c */
    public static final class C12809c implements GestureDetector.OnDoubleTapListener {

        /* renamed from: d */
        public final /* synthetic */ C0581o5 f36662d;

        /* renamed from: e */
        public final /* synthetic */ C12806i0 f36663e;

        /* renamed from: f */
        public final /* synthetic */ int f36664f;

        /* renamed from: g */
        public final /* synthetic */ C12807a f36665g;

        public C12809c(C0581o5 o5Var, C12806i0 i0Var, int i, C12807a aVar) {
            this.f36662d = o5Var;
            this.f36663e = i0Var;
            this.f36664f = i;
            this.f36665g = aVar;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$_onBindViewHolder$4$1", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            if (this.f36662d != null) {
                String str = this.f36663e.f36653f;
                Log.m105924i(str, "onDoubleTap: topComment,content:" + this.f36662d.getContent() + ",position:" + this.f36664f);
                C32228q<? super C0581o5, ? super View, ? super C9507n, C13598b0> qVar = this.f36663e.f36656i;
                if (qVar != null) {
                    C0581o5 o5Var = this.f36662d;
                    View view = this.f36665g.f44854d;
                    C87412m.m108593f(view, "holder.itemView");
                    qVar.invoke(o5Var, view, this.f36665g);
                }
            } else {
                String str2 = this.f36663e.f36653f;
                Log.m105928w(str2, "onDoubleTap: OnClick IndexOutOfBounds! position:" + this.f36664f + " commentList.size:" + this.f36663e.f36654g.size() + " view:" + this.f36665g.f44854d);
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$_onBindViewHolder$4$1", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return true;
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return true;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (this.f36662d != null) {
                String str = this.f36663e.f36653f;
                Log.m105924i(str, "onSingleTapConfirmed: topComment,content:" + this.f36662d.getContent() + ",position:" + this.f36664f);
                C32228q<? super C0581o5, ? super View, ? super C9507n, C13598b0> qVar = this.f36663e.f36655h;
                if (qVar == null) {
                    return true;
                }
                C0581o5 o5Var = this.f36662d;
                View view = this.f36665g.f44854d;
                C87412m.m108593f(view, "holder.itemView");
                qVar.invoke(o5Var, view, this.f36665g);
                return true;
            }
            String str2 = this.f36663e.f36653f;
            Log.m105928w(str2, "onSingleTapConfirmed: OnClick IndexOutOfBounds! position:" + this.f36664f + " commentList.size:" + this.f36663e.f36654g.size() + " view:" + this.f36665g.f44854d);
            return true;
        }
    }

    /* renamed from: qk1.i0$d */
    public static final class C12810d implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ GestureDetector f36666d;

        public C12810d(GestureDetector gestureDetector) {
            this.f36666d = gestureDetector;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            MotionEvent motionEvent2 = motionEvent;
            ArrayList arrayList = new ArrayList();
            View view2 = view;
            arrayList.add(view);
            arrayList.add(motionEvent2);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$_onBindViewHolder$4$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            GestureDetector gestureDetector = this.f36666d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(motionEvent2);
            GestureDetector gestureDetector2 = gestureDetector;
            C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$_onBindViewHolder$4$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
            C117292a.m165360f(gestureDetector2, onTouchEvent, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$_onBindViewHolder$4$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            C117292a.m165362h(onTouchEvent, this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$_onBindViewHolder$4$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return onTouchEvent;
        }
    }

    /* renamed from: qk1.i0$e */
    public static final class C12811e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C0581o5 f36667d;

        /* renamed from: e */
        public final /* synthetic */ C12806i0 f36668e;

        /* renamed from: f */
        public final /* synthetic */ int f36669f;

        /* renamed from: g */
        public final /* synthetic */ C12807a f36670g;

        public C12811e(C0581o5 o5Var, C12806i0 i0Var, int i, C12807a aVar) {
            this.f36667d = o5Var;
            this.f36668e = i0Var;
            this.f36669f = i;
            this.f36670g = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$_onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f36667d != null) {
                String str = this.f36668e.f36653f;
                Log.m105924i(str, "onLikeIconClickListener: topComment,content:" + this.f36667d.getContent() + ",position:" + this.f36669f);
                C32228q<? super C0581o5, ? super View, ? super C9507n, C13598b0> qVar = this.f36668e.f36657j;
                if (qVar != null) {
                    C0581o5 o5Var = this.f36667d;
                    C87412m.m108593f(view, LocaleUtil.ITALIAN);
                    qVar.invoke(o5Var, view, this.f36670g);
                }
            } else {
                String str2 = this.f36668e.f36653f;
                Log.m105928w(str2, "onLikeIconClickListener: OnClick IndexOutOfBounds! position:" + this.f36669f + " commentList.size:" + this.f36668e.f36654g.size() + " view:" + this.f36670g.f44854d);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$_onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C12806i0(C45795b bVar) {
        C87412m.m108594g(bVar, "roomData");
        this.f36652e = bVar;
    }

    /* renamed from: F4 */
    public void mo10187F4(C9507n nVar, int i) {
        C12807a aVar = (C12807a) nVar;
        C87412m.m108594g(aVar, "holder");
        mo10188G4(aVar, i, new ArrayList());
    }

    /* renamed from: O4 */
    public C9507n mo10189O4(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "viewGroup");
        View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.afr, (ViewGroup) null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.topMargin = C74942w4.m89784a(viewGroup.getContext(), 4);
        inflate.setLayoutParams(marginLayoutParams);
        return new C12807a(inflate);
    }

    public int getItemCount() {
        return this.f36654g.size();
    }

    /* JADX WARNING: type inference failed for: r5v6, types: [java.lang.Object, java.lang.String] */
    /* JADX WARNING: type inference failed for: r5v8, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: u5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10188G4(qk1.C12806i0.C12807a r29, int r30, java.util.List<java.lang.Object> r31) {
        /*
            r28 = this;
            r0 = r28
            r7 = r29
            r8 = r30
            java.lang.String r1 = "holder"
            gy3.C87412m.m108594g(r7, r1)
            java.lang.String r1 = "payloads"
            r6 = r31
            gy3.C87412m.m108594g(r6, r1)
            android.view.View r1 = r7.f44854d
            android.content.Context r9 = r1.getContext()
            java.util.ArrayList<cj1.o5> r1 = r0.f36654g
            java.lang.Object r1 = r1.get(r8)
            r2 = 8
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            r11 = 0
            if (r1 != 0) goto L_0x008a
            java.lang.String r1 = r0.f36653f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "commentList position:"
            r2.append(r3)
            r2.append(r8)
            java.lang.String r3 = " is null, size = "
            r2.append(r3)
            java.util.ArrayList<cj1.o5> r3 = r0.f36654g
            int r3 = r3.size()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            android.view.View r3 = r7.f44854d
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r1.mo10233c(r10)
            java.lang.Object[] r13 = r1.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter"
            java.lang.String r15 = "_onBindViewHolder"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;ILjava/util/List;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r3
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r1 = r1.mo10231a(r11)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3.setVisibility(r1)
            java.lang.String r4 = "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter"
            java.lang.String r5 = "_onBindViewHolder"
            java.lang.String r6 = "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;ILjava/util/List;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x008a:
            android.view.View r1 = r7.f44854d
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r2.mo10233c(r3)
            java.lang.Object[] r13 = r2.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter"
            java.lang.String r15 = "_onBindViewHolder"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;ILjava/util/List;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r1
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r2 = r2.mo10231a(r11)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r13 = "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter"
            java.lang.String r14 = "_onBindViewHolder"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;ILjava/util/List;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r7.f36658A
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r2 = -2
            r1.width = r2
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r7.f36658A
            r2.setLayoutParams(r1)
            android.view.View r1 = r7.f44854d
            java.util.ArrayList<cj1.o5> r2 = r0.f36654g
            java.lang.Object r2 = r2.get(r8)
            cj1.o5 r2 = (cj1.C0581o5) r2
            int r2 = r2.getType()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.setTag(r2)
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r7.f36658A
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1.setMaxLines(r2)
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r7.f36658A
            r12 = 0
            r1.setEllipsize(r12)
            android.view.View r1 = r7.f36660C
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r10)
            java.lang.Object[] r14 = r2.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter"
            java.lang.String r16 = "reset"
            java.lang.String r17 = "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r1
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r2 = r2.mo10231a(r11)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter"
            java.lang.String r15 = "reset"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            android.view.View r1 = r7.f44854d
            r2 = 1065353216(0x3f800000, float:1.0)
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r3.mo10233c(r2)
            java.lang.Object[] r21 = r3.mo10232b()
            java.lang.String r22 = "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter"
            java.lang.String r23 = "reset"
            java.lang.String r24 = "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setAlpha"
            java.lang.String r27 = "(F)V"
            r20 = r1
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            java.lang.Object r2 = r3.mo10231a(r11)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.setAlpha(r2)
            java.lang.String r21 = "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter"
            java.lang.String r22 = "reset"
            java.lang.String r23 = "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setAlpha"
            java.lang.String r26 = "(F)V"
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
            android.view.View r1 = r7.f36661D
            r2 = 4
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.mo10233c(r2)
            java.lang.Object[] r14 = r3.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter"
            java.lang.String r16 = "reset"
            java.lang.String r17 = "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r1
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r2 = r3.mo10231a(r11)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter"
            java.lang.String r15 = "reset"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            if (r9 == 0) goto L_0x027f
            fj1.b r1 = r0.f36652e
            java.lang.Class<yg1.c> r2 = yg1.C16004c.class
            androidx.lifecycle.i0 r1 = r1.mo71262a(r2)
            r13 = r1
            yg1.c r13 = (yg1.C16004c) r13
            java.util.ArrayList<cj1.o5> r1 = r0.f36654g
            java.lang.Object r1 = r1.get(r8)
            java.lang.String r2 = "commentList[position]"
            gy3.C87412m.m108593f(r1, r2)
            r14 = r1
            cj1.o5 r14 = (cj1.C0581o5) r14
            java.util.Map<java.lang.Integer, yg1.b> r1 = r13.f43061g
            int r2 = r14.getType()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.get(r2)
            yg1.b r1 = (yg1.C15999b) r1
            if (r1 == 0) goto L_0x0223
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r7.f36658A
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131101837(0x7f06088d, float:1.7816095E38)
            int r3 = r3.getColor(r4)
            r2.setTextColor(r3)
            boolean r15 = r14 instanceof cj1.C0588q5
            if (r15 == 0) goto L_0x0215
            boolean r2 = r31.isEmpty()
            if (r2 == 0) goto L_0x0209
            goto L_0x0215
        L_0x0209:
            r2 = r9
            r3 = r29
            r4 = r14
            r5 = r30
            r6 = r31
            r1.mo8805l(r2, r3, r4, r5, r6)
            goto L_0x0218
        L_0x0215:
            r1.mo8798b(r9, r7, r14, r8)
        L_0x0218:
            if (r15 == 0) goto L_0x0220
            r1 = r14
            cj1.q5 r1 = (cj1.C0588q5) r1
            r1.mo570d(r11)
        L_0x0220:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0224
        L_0x0223:
            r1 = r12
        L_0x0224:
            if (r1 != 0) goto L_0x027c
            java.lang.String r1 = r13.f43060f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "invalid type:"
            r2.append(r3)
            int r3 = r14.getType()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            android.view.View r1 = r7.f44854d
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r10)
            java.lang.Object[] r14 = r2.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/live/component/msginterceptor/FinderLiveCommentItemService"
            java.lang.String r16 = "fillItem"
            java.lang.String r17 = "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;ILjava/util/List;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r1
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r2 = r2.mo10231a(r11)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/live/component/msginterceptor/FinderLiveCommentItemService"
            java.lang.String r15 = "fillItem"
            java.lang.String r16 = "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;ILjava/util/List;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
        L_0x027c:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0280
        L_0x027f:
            r1 = r12
        L_0x0280:
            if (r1 != 0) goto L_0x02be
            android.view.View r1 = r7.f44854d
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r10)
            java.lang.Object[] r14 = r2.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter"
            java.lang.String r16 = "_onBindViewHolder"
            java.lang.String r17 = "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;ILjava/util/List;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r1
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r2 = r2.mo10231a(r11)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter"
            java.lang.String r15 = "_onBindViewHolder"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;ILjava/util/List;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
        L_0x02be:
            java.util.ArrayList<cj1.o5> r1 = r0.f36654g
            java.lang.Object r1 = sx3.C110818d0.m150917O(r1, r8)
            cj1.o5 r1 = (cj1.C0581o5) r1
            android.view.View r2 = r7.f44854d
            r3 = 1
            r2.setClickable(r3)
            android.view.GestureDetector r2 = new android.view.GestureDetector
            qk1.i0$b r4 = new qk1.i0$b
            r4.<init>()
            r2.<init>(r9, r4)
            qk1.i0$c r4 = new qk1.i0$c
            r4.<init>(r1, r0, r8, r7)
            r2.setOnDoubleTapListener(r4)
            android.view.View r4 = r7.f44854d
            qk1.i0$d r5 = new qk1.i0$d
            r5.<init>(r2)
            r4.setOnTouchListener(r5)
            android.view.View r2 = r7.f36661D
            qk1.i0$e r4 = new qk1.i0$e
            r4.<init>(r1, r0, r8, r7)
            r2.setOnClickListener(r4)
            if (r1 == 0) goto L_0x03d8
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r7.f36658A
            r4 = 2131302532(0x7f091884, float:1.8223153E38)
            if (r9 == 0) goto L_0x0371
            te3.hx0 r5 = r1.mo579i()
            if (r5 == 0) goto L_0x0303
            java.util.LinkedList<te3.aw0> r12 = r5.f134930r
        L_0x0303:
            if (r12 == 0) goto L_0x030e
            boolean r5 = r12.isEmpty()
            if (r5 == 0) goto L_0x030c
            goto L_0x030e
        L_0x030c:
            r5 = 0
            goto L_0x030f
        L_0x030e:
            r5 = 1
        L_0x030f:
            if (r5 == 0) goto L_0x0315
            java.lang.String r5 = ""
        L_0x0313:
            r12 = r5
            goto L_0x0371
        L_0x0315:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.util.Iterator r6 = r12.iterator()
        L_0x031e:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0366
            java.lang.Object r8 = r6.next()
            te3.aw0 r8 = (te3.C48770aw0) r8
            int r10 = r8.f130791f
            int r8 = r8.f130789d
            if (r8 == r3) goto L_0x034d
            r12 = 2
            if (r8 == r12) goto L_0x0334
            goto L_0x031e
        L_0x0334:
            if (r10 <= 0) goto L_0x031e
            android.content.res.Resources r8 = r9.getResources()
            r12 = 2131827061(0x7f111975, float:1.9287024E38)
            java.lang.Object[] r13 = new java.lang.Object[r3]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r13[r11] = r10
            java.lang.String r8 = r8.getString(r12, r13)
            r5.append(r8)
            goto L_0x031e
        L_0x034d:
            if (r10 <= 0) goto L_0x031e
            android.content.res.Resources r8 = r9.getResources()
            r12 = 2131828166(0x7f111dc6, float:1.9289265E38)
            java.lang.String r8 = r8.getString(r12)
            r5.append(r8)
            r5.append(r10)
            java.lang.String r8 = " "
            r5.append(r8)
            goto L_0x031e
        L_0x0366:
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "sb.toString()"
            gy3.C87412m.m108593f(r5, r6)
            goto L_0x0313
        L_0x0371:
            r2.setTag(r4, r12)
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r7.f36658A
            r4 = 2131302535(0x7f091887, float:1.8223159E38)
            ok1.e r5 = ok1.C62042e.f176370a
            java.lang.String r13 = r1.mo571e()
            java.lang.String r14 = r1.mo573g()
            r15 = 0
            r16 = 4
            r17 = 0
            r12 = r5
            java.lang.String r6 = ok1.C62042e.m72808l0(r12, r13, r14, r15, r16, r17)
            r2.setTag(r4, r6)
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r7.f36658A
            r4 = 2131302538(0x7f09188a, float:1.8223165E38)
            java.lang.String r13 = r1.mo580j()
            java.lang.String r14 = r5.mo87020L(r1)
            java.lang.String r5 = ok1.C62042e.m72808l0(r12, r13, r14, r15, r16, r17)
            r2.setTag(r4, r5)
            int r2 = r1.getType()
            r4 = 20013(0x4e2d, float:2.8044E-41)
            if (r2 == r4) goto L_0x03b9
            r4 = 20035(0x4e43, float:2.8075E-41)
            if (r2 == r4) goto L_0x03b9
            r4 = 20019(0x4e33, float:2.8053E-41)
            if (r2 == r4) goto L_0x03b9
            r4 = 20020(0x4e34, float:2.8054E-41)
            if (r2 == r4) goto L_0x03b9
            goto L_0x03ba
        L_0x03b9:
            r11 = 1
        L_0x03ba:
            if (r11 != 0) goto L_0x03c8
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r7.f36658A
            r3 = 2131302534(0x7f091886, float:1.8223157E38)
            java.lang.String r4 = r1.getContent()
            r2.setTag(r3, r4)
        L_0x03c8:
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r7.f36658A
            r3 = 2131302536(0x7f091888, float:1.822316E38)
            int r1 = r1.getType()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.setTag(r3, r1)
        L_0x03d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qk1.C12806i0.mo10188G4(qk1.i0$a, int, java.util.List):void");
    }
}
