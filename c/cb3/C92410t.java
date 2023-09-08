package cb3;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText;

/* renamed from: cb3.t */
public class C92410t {
    /* renamed from: a */
    public static C92392c m116227a(View view) {
        if (view == null) {
            return null;
        }
        WXRTEditText wXRTEditText = (WXRTEditText) view.findViewById(C0966R.C0970id.ix5);
        WXRTEditText wXRTEditText2 = (WXRTEditText) view.findViewById(C0966R.C0970id.al6);
        WXRTEditText wXRTEditText3 = (WXRTEditText) view.findViewById(C0966R.C0970id.al4);
        if (wXRTEditText != null) {
            return new C92392c(wXRTEditText);
        }
        if (wXRTEditText2 == null || wXRTEditText3 == null) {
            return null;
        }
        return new C92392c(wXRTEditText2, wXRTEditText3);
    }

    /* renamed from: b */
    public static View m116228b(RecyclerView recyclerView, int i) {
        if (recyclerView == null) {
            return null;
        }
        try {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                return ((LinearLayoutManager) layoutManager).findViewByPosition(i);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
