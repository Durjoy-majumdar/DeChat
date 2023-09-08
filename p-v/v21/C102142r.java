package v21;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText;
import m21.C99785b;

/* renamed from: v21.r */
public class C102142r {
    /* renamed from: a */
    public static C102126c m134570a(View view) {
        if (view == null) {
            return null;
        }
        WXRTEditText wXRTEditText = (WXRTEditText) view.findViewById(C0966R.C0970id.ix5);
        WXRTEditText wXRTEditText2 = (WXRTEditText) view.findViewById(C0966R.C0970id.al6);
        WXRTEditText wXRTEditText3 = (WXRTEditText) view.findViewById(C0966R.C0970id.al4);
        if (wXRTEditText != null) {
            return new C102126c(wXRTEditText);
        }
        if (wXRTEditText2 == null || wXRTEditText3 == null) {
            return null;
        }
        return new C102126c(wXRTEditText2, wXRTEditText3);
    }

    /* renamed from: b */
    public static View m134571b(RecyclerView recyclerView, int i) {
        if (recyclerView == null) {
            return null;
        }
        try {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager)) {
                return null;
            }
            ((C99785b) recyclerView.getAdapter()).getClass();
            return ((LinearLayoutManager) layoutManager).findViewByPosition(i + 0);
        } catch (Exception unused) {
            return null;
        }
    }
}
