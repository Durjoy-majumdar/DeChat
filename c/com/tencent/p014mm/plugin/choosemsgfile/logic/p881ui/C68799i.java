package com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.choosemsgfile.logic.ui.i */
public class C68799i extends RecyclerView.C0129l {

    /* renamed from: d */
    public final /* synthetic */ Context f197646d;

    public C68799i(ChooseMsgFileUIController chooseMsgFileUIController, Context context) {
        this.f197646d = context;
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        int dimension = (int) this.f197646d.getResources().getDimension(C0966R.dimen.f3928j9);
        rect.bottom = dimension;
        rect.top = dimension;
        rect.left = dimension;
        rect.right = dimension;
    }
}
