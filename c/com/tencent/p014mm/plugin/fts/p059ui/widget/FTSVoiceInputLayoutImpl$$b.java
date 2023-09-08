package com.tencent.p014mm.plugin.fts.p059ui.widget;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl$$b */
public class FTSVoiceInputLayoutImpl$$b implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ FTSVoiceInputLayoutImpl f52882d;

    public FTSVoiceInputLayoutImpl$$b(FTSVoiceInputLayoutImpl fTSVoiceInputLayoutImpl) {
        this.f52882d = fTSVoiceInputLayoutImpl;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fts/ui/widget/FTSVoiceInputLayoutImpl$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        Log.m105919d("MicroMsg.FTSVoiceInputLayoutImpl", "btn onLongClickListener currentState %s", Integer.valueOf(this.f52882d.f52892f));
        FTSVoiceInputLayoutImpl fTSVoiceInputLayoutImpl = this.f52882d;
        fTSVoiceInputLayoutImpl.f52876t = true;
        C68992b bVar = fTSVoiceInputLayoutImpl.f52875s;
        Log.m105919d("MicroMsg.FTSVoiceInputDrawable", "longClickState %s", Integer.valueOf(bVar.f198253n));
        bVar.f198253n = 7;
        bVar.invalidateSelf();
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/fts/ui/widget/FTSVoiceInputLayoutImpl$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
