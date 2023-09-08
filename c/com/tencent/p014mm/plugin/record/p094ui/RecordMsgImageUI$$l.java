package com.tencent.p014mm.plugin.record.p094ui;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.plugin.fav.p047ui.gallery.C93624e;
import com.tencent.p014mm.plugin.fav.p047ui.widget.FavVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import qg2.C101147j0;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgImageUI$$l */
public class RecordMsgImageUI$$l implements AdapterView.OnItemSelectedListener {

    /* renamed from: d */
    public final /* synthetic */ RecordMsgImageUI f272665d;

    public RecordMsgImageUI$$l(RecordMsgImageUI recordMsgImageUI) {
        this.f272665d = recordMsgImageUI;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/record/ui/RecordMsgImageUI$5", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        this.f272665d.f272650z++;
        Log.m105918d("MicroMsg.ShowImageUI", "onItemSelected() called with: parent = [" + adapterView + "], view = [" + view + "], position = [" + i + "], id = [" + j + "]");
        C93624e a = this.f272665d.f272636i.getItem(i);
        FavVideoView favVideoView = this.f272665d.f272624A;
        if (favVideoView != null) {
            favVideoView.mo128629d();
        }
        if (a.mo128525k() == 2) {
            if (C101147j0.m132614G(a.mo128528n(), this.f272665d.f272638n)) {
                this.f272665d.setMMTitle(String.format("%d/%d", new Object[]{Integer.valueOf(i + 1), Integer.valueOf(((LinkedList) this.f272665d.f272631d).size())}));
                this.f272665d.enableOptionMenu(true);
            } else {
                this.f272665d.enableOptionMenu(false);
            }
        } else if (view instanceof FavVideoView) {
            FavVideoView favVideoView2 = (FavVideoView) view;
            if ((this.f272665d.f272636i.getItemViewType(i) == 15 || this.f272665d.f272636i.getItemViewType(i) == 4) && !favVideoView2.mo128628c()) {
                RecordMsgImageUI recordMsgImageUI = this.f272665d;
                if (i != recordMsgImageUI.f272637j || recordMsgImageUI.f272649y) {
                    favVideoView2.setStartAfterPrepared(false);
                } else {
                    favVideoView2.setStartAfterPrepared(true);
                    this.f272665d.f272649y = true;
                }
                favVideoView2.mo128630e();
                this.f272665d.f272624A = favVideoView2;
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/record/ui/RecordMsgImageUI$5", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
