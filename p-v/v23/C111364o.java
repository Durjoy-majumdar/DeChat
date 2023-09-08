package v23;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.vlog.p117ui.timelineeditor.view.TimelineEditorDragRectView;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lh2.C99417a;
import lh2.C99447k;
import qh2.C101198e;

/* renamed from: v23.o */
public final class C111364o extends C99417a implements View.OnClickListener {

    /* renamed from: f */
    public final View f333395f;

    /* renamed from: g */
    public final TimelineEditorDragRectView f333396g;

    /* renamed from: h */
    public final Context f333397h;

    /* renamed from: i */
    public final View f333398i;

    /* renamed from: j */
    public RectF f333399j;

    /* renamed from: n */
    public RectF f333400n = new RectF(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: v23.o$a */
    public static final class C111365a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C111364o f333401d;

        public C111365a(C111364o oVar) {
            this.f333401d = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorHalfScreenPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.TimelineEditorHalfScreenPlugin", "click halfScreenRectView");
            this.f333401d.mo78564e();
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorHalfScreenPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: v23.o$b */
    public static final class C111366b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C101198e f333402d;

        public C111366b(C101198e eVar) {
            this.f333402d = eVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorHalfScreenPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C101198e.C62622a.m73576a(this.f333402d, C101198e.C101199b.FINDER_SHOW_GUIDE, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorHalfScreenPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111364o(ViewGroup viewGroup, C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(viewGroup, "parent");
        C87412m.m108594g(eVar, "status");
        View findViewById = viewGroup.findViewById(C0966R.C0970id.etb);
        C87412m.m108593f(findViewById, "parent.findViewById(R.id.half_screen_select_btn)");
        this.f333395f = findViewById;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.bwp);
        C87412m.m108593f(findViewById2, "parent.findViewById(R.id.crop_ope_layout)");
        TimelineEditorDragRectView timelineEditorDragRectView = (TimelineEditorDragRectView) findViewById2;
        this.f333396g = timelineEditorDragRectView;
        Context context = viewGroup.getContext();
        this.f333397h = context;
        View findViewById3 = viewGroup.findViewById(C0966R.C0970id.et8);
        C87412m.m108593f(findViewById3, "parent.findViewById(R.id.half_screen_header)");
        this.f333398i = findViewById3;
        this.f333399j = new RectF(0.0f, 0.0f, ((float) C76577a.m92145A(context)) * 1.0f, ((float) C76577a.m92159j(context)) * 1.0f);
        findViewById.setOnClickListener(this);
        View findViewById4 = timelineEditorDragRectView.findViewById(C0966R.C0970id.f359379kl3);
        C87412m.m108593f(findViewById4, "halfScreenRectView.findV…e_editor_crop_rect_close)");
        new C99447k((ImageView) findViewById4, eVar).f291493e = "HalfScreenBack";
        timelineEditorDragRectView.findViewById(C0966R.C0970id.ccp).setOnClickListener(new C111365a(this));
        findViewById3.setOnClickListener(new C111366b(eVar));
        boolean St0 = ((C60200t1) C86312j.m106911c(C60200t1.class)).St0();
        Log.m105924i("MicroMsg.TimelineEditorHalfScreenPlugin", "enableSetHalfPosition:" + St0);
        if (!St0) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorHalfScreenPlugin", "<init>", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorHalfScreenPlugin", "<init>", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: e */
    public boolean mo78564e() {
        if (this.f333396g.getVisibility() != 0 || this.f333398i.getVisibility() != 0) {
            return false;
        }
        this.f333396g.setVisibility(4);
        View view = this.f333395f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorHalfScreenPlugin", "onBackPress", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorHalfScreenPlugin", "onBackPress", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C101198e.C62622a.m73576a(this.f291492d, C101198e.C101199b.EDIT_SHOW_OPERATION, (Bundle) null, 2, (Object) null);
        return true;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorHalfScreenPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.etb) {
            C101198e.C62622a.m73576a(this.f291492d, C101198e.C101199b.EDIT_HIDE_OPERATION, (Bundle) null, 2, (Object) null);
            View view2 = this.f333395f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorHalfScreenPlugin", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorHalfScreenPlugin", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f333396g.setVisibility(0);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorHalfScreenPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
