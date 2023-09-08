package gi2;

import ai2.C92007a;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: gi2.f */
public interface C107818f {

    /* renamed from: gi2.f$a */
    public static final class C107819a {
        /* renamed from: a */
        public static /* synthetic */ void m146077a(C107818f fVar, Rect rect, float f, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    f = 0.5f;
                }
                fVar.mo53773f(rect, f);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDefaultLocation");
        }

        /* renamed from: b */
        public static boolean m146078b(C107818f fVar, String str) {
            C87412m.m108594g(str, "objID");
            if (!(fVar instanceof View)) {
                return false;
            }
            C92007a editorData = fVar.getEditorData();
            if (editorData == null || !C87412m.m108589b(str, editorData.f263405d)) {
                View view = (View) fVar;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/view/IEditView$DefaultImpls", "showAtObjectId", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/view/IEditView;Ljava/lang/String;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/recordvideo/ui/editor/view/IEditView$DefaultImpls", "showAtObjectId", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/view/IEditView;Ljava/lang/String;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return false;
            }
            View view3 = (View) fVar;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/view/IEditView$DefaultImpls", "showAtObjectId", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/view/IEditView;Ljava/lang/String;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/recordvideo/ui/editor/view/IEditView$DefaultImpls", "showAtObjectId", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/view/IEditView;Ljava/lang/String;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }

        /* renamed from: c */
        public static boolean m146079c(C107818f fVar, long j) {
            C107818f fVar2 = fVar;
            if (!(fVar2 instanceof View)) {
                return false;
            }
            C92007a editorData = fVar.getEditorData();
            if (editorData != null) {
                if ((j >= editorData.f263404c.mo146049c() && j <= editorData.f263404c.mo146048b()) && fVar.mo53780h()) {
                    View view = (View) fVar2;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/view/IEditView$DefaultImpls", "showAtTime", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/view/IEditView;J)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/recordvideo/ui/editor/view/IEditView$DefaultImpls", "showAtTime", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/view/IEditView;J)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return true;
                }
            }
            View view3 = (View) fVar2;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(4);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/view/IEditView$DefaultImpls", "showAtTime", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/view/IEditView;J)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/recordvideo/ui/editor/view/IEditView$DefaultImpls", "showAtTime", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/view/IEditView;J)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return false;
        }
    }

    /* renamed from: a */
    boolean mo53770a(long j);

    /* renamed from: e */
    boolean mo53772e(String str);

    /* renamed from: f */
    void mo53773f(Rect rect, float f);

    float[] getContentBoundary();

    RectF getDrawRect();

    C92007a getEditorData();

    C98129b getType();

    /* renamed from: h */
    boolean mo53780h();

    /* renamed from: m */
    void mo53782m(Rect rect, int i);

    void setValidArea(Rect rect);
}
