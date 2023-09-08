package k11;

import android.widget.TextView;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI;
import java.util.ArrayList;

public final /* synthetic */ class v$$z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CleanChattingUI f290532d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList f290533e;

    public /* synthetic */ v$$z(CleanChattingUI cleanChattingUI, ArrayList arrayList) {
        this.f290532d = cleanChattingUI;
        this.f290533e = arrayList;
    }

    public final void run() {
        CleanChattingUI cleanChattingUI = this.f290532d;
        ArrayList arrayList = this.f290533e;
        C99084r rVar = cleanChattingUI.f267895d;
        int i = cleanChattingUI.f267910v;
        rVar.f290442f = arrayList;
        rVar.f290444h = i;
        rVar.notifyDataSetChanged();
        cleanChattingUI.f267901j.setEnabled(!arrayList.isEmpty());
        int i2 = 8;
        cleanChattingUI.f267898g.setVisibility(8);
        TextView textView = cleanChattingUI.f267899h;
        if (arrayList.isEmpty()) {
            i2 = 0;
        }
        textView.setVisibility(i2);
        cleanChattingUI.f267896e.setVisibility(0);
        C99084r rVar2 = cleanChattingUI.f267895d;
        rVar2.f290441e.clear();
        rVar2.notifyDataSetChanged();
        cleanChattingUI.mo127433I7();
    }
}
