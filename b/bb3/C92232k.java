package bb3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import xa3.C102587c;
import xa3.C102593i;

/* renamed from: bb3.k */
public class C92232k {

    /* renamed from: a */
    public PopupWindow f263993a;

    /* renamed from: b */
    public View f263994b;

    /* renamed from: c */
    public C92237e f263995c;

    /* renamed from: bb3.k$a */
    public class C92233a implements View.OnClickListener {
        public C92233a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wenote/model/nativenote/manager/WNNoteEditorOperateWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C92232k.this.f263993a.dismiss();
            View view2 = C92232k.this.f263994b;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/manager/WNNoteEditorOperateWindow$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/wenote/model/nativenote/manager/WNNoteEditorOperateWindow$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C92237e eVar = C92232k.this.f263995c;
            if (eVar != null) {
                ((NoteEditorUI) eVar).mo134934c8();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/model/nativenote/manager/WNNoteEditorOperateWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: bb3.k$b */
    public class C92234b implements View.OnClickListener {
        public C92234b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wenote/model/nativenote/manager/WNNoteEditorOperateWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C92232k.this.f263993a.dismiss();
            View view2 = C92232k.this.f263994b;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/manager/WNNoteEditorOperateWindow$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/wenote/model/nativenote/manager/WNNoteEditorOperateWindow$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C92237e eVar = C92232k.this.f263995c;
            if (eVar != null) {
                NoteEditorUI noteEditorUI = (NoteEditorUI) eVar;
                Log.m105925i("MicroMsg.Note.NoteEditorUI", "onOperateWindowCopy %s", Long.valueOf(noteEditorUI.f283270x));
                C92231j.m115957e(noteEditorUI.getContext(), noteEditorUI.f283238X0.mo126202l());
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/model/nativenote/manager/WNNoteEditorOperateWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: bb3.k$c */
    public class C92235c implements View.OnClickListener {
        public C92235c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wenote/model/nativenote/manager/WNNoteEditorOperateWindow$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C92232k.this.f263993a.dismiss();
            View view2 = C92232k.this.f263994b;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/manager/WNNoteEditorOperateWindow$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/wenote/model/nativenote/manager/WNNoteEditorOperateWindow$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C92237e eVar = C92232k.this.f263995c;
            if (eVar != null) {
                NoteEditorUI noteEditorUI = (NoteEditorUI) eVar;
                Log.m105925i("MicroMsg.Note.NoteEditorUI", "onOperateWindowCut %s", Long.valueOf(noteEditorUI.f283270x));
                C92231j.m115957e(noteEditorUI.getContext(), noteEditorUI.f283238X0.mo126202l());
                noteEditorUI.mo134934c8();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/model/nativenote/manager/WNNoteEditorOperateWindow$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: bb3.k$d */
    public class C92236d implements View.OnClickListener {
        public C92236d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wenote/model/nativenote/manager/WNNoteEditorOperateWindow$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C92232k.this.f263993a.dismiss();
            View view2 = C92232k.this.f263994b;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/wenote/model/nativenote/manager/WNNoteEditorOperateWindow$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/wenote/model/nativenote/manager/WNNoteEditorOperateWindow$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C92237e eVar = C92232k.this.f263995c;
            if (eVar != null) {
                NoteEditorUI noteEditorUI = (NoteEditorUI) eVar;
                Log.m105925i("MicroMsg.Note.NoteEditorUI", "onOperateWindowPaste %s", Long.valueOf(noteEditorUI.f283270x));
                int c = C92231j.m115955c(noteEditorUI.getContext());
                if (c == 2) {
                    if (C92231j.m115956d(noteEditorUI)) {
                        noteEditorUI.mo134932a8();
                    } else {
                        noteEditorUI.f283238X0.mo126197g(false);
                        C92231j.m115953a();
                        C102593i iVar = new C102593i();
                        iVar.f302126s = "";
                        iVar.f302071b = false;
                        iVar.f302077h = false;
                        iVar.f302072c = 0;
                        iVar.f302079j = true;
                        noteEditorUI.f283238X0.mo126192b(iVar, false);
                        noteEditorUI.mo134930Y7();
                    }
                } else if (c == 3) {
                    ArrayList<C102587c> b = C92231j.m115954b();
                    if (noteEditorUI.f283238X0.mo126196f(b)) {
                        noteEditorUI.mo134932a8();
                    } else {
                        noteEditorUI.f283238X0.mo126197g(false);
                        noteEditorUI.f283238X0.mo126210t(b, (WXRTEditText) null, false, true, false, false, false);
                        noteEditorUI.mo134927V7();
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/model/nativenote/manager/WNNoteEditorOperateWindow$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: bb3.k$e */
    public interface C92237e {
    }

    public C92232k(Context context, View view) {
        this.f263994b = view;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cil, (ViewGroup) null);
        inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        PopupWindow popupWindow = new PopupWindow(inflate, -2, -2, false);
        this.f263993a = popupWindow;
        popupWindow.setClippingEnabled(false);
        inflate.findViewById(C0966R.C0970id.lp9).setOnClickListener(new C92233a());
        inflate.findViewById(C0966R.C0970id.lp6).setOnClickListener(new C92234b());
        inflate.findViewById(C0966R.C0970id.lp8).setOnClickListener(new C92235c());
        inflate.findViewById(C0966R.C0970id.lpg).setOnClickListener(new C92236d());
    }
}
