package u21;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.component.editor.EditorUI;
import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import p21.C100616a;
import p21.C100628m;

/* renamed from: u21.d */
public class C101943d {

    /* renamed from: a */
    public PopupWindow f300124a;

    /* renamed from: b */
    public View f300125b;

    /* renamed from: c */
    public C101948e f300126c;

    /* renamed from: u21.d$a */
    public class C101944a implements View.OnClickListener {
        public C101944a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/model/nativenote/manager/EditorOperateMenu$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C101943d.this.f300124a.dismiss();
            View view2 = C101943d.this.f300125b;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/manager/EditorOperateMenu$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/EditorOperateMenu$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C101948e eVar = C101943d.this.f300126c;
            if (eVar != null) {
                ((EditorUI) eVar).mo127479M7();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/EditorOperateMenu$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: u21.d$b */
    public class C101945b implements View.OnClickListener {
        public C101945b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/model/nativenote/manager/EditorOperateMenu$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C101943d.this.f300124a.dismiss();
            View view2 = C101943d.this.f300125b;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/manager/EditorOperateMenu$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/EditorOperateMenu$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C101948e eVar = C101943d.this.f300126c;
            if (eVar != null) {
                C101940b.m134172e(((EditorUI) eVar).getContext(), C101941c.m134173q().mo141457m());
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/EditorOperateMenu$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: u21.d$c */
    public class C101946c implements View.OnClickListener {
        public C101946c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/model/nativenote/manager/EditorOperateMenu$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C101943d.this.f300124a.dismiss();
            View view2 = C101943d.this.f300125b;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/manager/EditorOperateMenu$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/EditorOperateMenu$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C101948e eVar = C101943d.this.f300126c;
            if (eVar != null) {
                EditorUI editorUI = (EditorUI) eVar;
                C101940b.m134172e(editorUI.getContext(), C101941c.m134173q().mo141457m());
                editorUI.mo127479M7();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/EditorOperateMenu$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: u21.d$d */
    public class C101947d implements View.OnClickListener {
        public C101947d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/model/nativenote/manager/EditorOperateMenu$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C101943d.this.f300124a.dismiss();
            View view2 = C101943d.this.f300125b;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/manager/EditorOperateMenu$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/EditorOperateMenu$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C101948e eVar = C101943d.this.f300126c;
            if (eVar != null) {
                EditorUI editorUI = (EditorUI) eVar;
                int c = C101940b.m134170c(editorUI.getContext());
                if (c == 2) {
                    if (C101940b.m134171d(editorUI)) {
                        editorUI.mo127486U7();
                    } else {
                        C101941c.m134173q().mo141452h(false);
                        C101940b.m134168a();
                        C100628m mVar = new C100628m();
                        mVar.f294819s = "";
                        mVar.f294796b = false;
                        mVar.f294801g = false;
                        mVar.f294797c = 0;
                        mVar.f294803i = true;
                        C101941c.m134173q().mo141446b(mVar, false);
                        editorUI.mo127484S7();
                    }
                } else if (c == 3) {
                    ArrayList<C100616a> b = C101940b.m134169b();
                    if (C101941c.m134173q().mo141451g(b)) {
                        editorUI.mo127486U7();
                    } else {
                        C101941c.m134173q().mo141452h(false);
                        C101941c.m134173q().mo141462s(b, (WXRTEditText) null, false, true, false, false, false);
                        editorUI.mo127481O7();
                    }
                } else {
                    Log.m105918d("MicroMsg.EditorActivityUI", "no data.");
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/EditorOperateMenu$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: u21.d$e */
    public interface C101948e {
    }

    public C101943d(Context context, View view, C101948e eVar) {
        this.f300126c = eVar;
        this.f300125b = view;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cl5, (ViewGroup) null);
        inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        PopupWindow popupWindow = new PopupWindow(inflate, -2, -2, false);
        this.f300124a = popupWindow;
        popupWindow.setClippingEnabled(false);
        inflate.findViewById(C0966R.C0970id.lp9).setOnClickListener(new C101944a());
        inflate.findViewById(C0966R.C0970id.lp6).setOnClickListener(new C101945b());
        inflate.findViewById(C0966R.C0970id.lp8).setOnClickListener(new C101946c());
        inflate.findViewById(C0966R.C0970id.lpg).setOnClickListener(new C101947d());
    }
}
