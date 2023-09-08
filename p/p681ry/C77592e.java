package p681ry;

import android.content.Context;
import android.widget.ListView;
import com.tencent.p014mm.plugin.taskbar.p110ui.C71323d;
import com.tencent.p014mm.plugin.taskbar.p110ui.C71325e;
import com.tencent.p014mm.plugin.taskbar.p110ui.C71327g;
import com.tencent.p014mm.plugin.taskbar.p110ui.C71331l;
import com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarContainer;
import com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarViewPresenter;
import di3.C86301e;
import ei3.C86522b;
import p691sy.C77814b;

@C86522b
/* renamed from: ry.e */
public class C77592e extends C86301e implements C77814b {
    /* renamed from: ay */
    public C71325e mo107775ay(Context context) {
        return new TaskBarContainer(context);
    }

    /* renamed from: ro */
    public C71323d mo107776ro(Context context, ListView listView, C71325e eVar) {
        return new C71331l(context, listView, (TaskBarContainer) eVar);
    }

    /* renamed from: wY */
    public C71327g mo107777wY() {
        return new TaskBarViewPresenter();
    }
}
