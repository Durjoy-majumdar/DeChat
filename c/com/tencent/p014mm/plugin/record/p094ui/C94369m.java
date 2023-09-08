package com.tencent.p014mm.plugin.record.p094ui;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.autogen.events.DealQBarStrEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent;
import com.tencent.p014mm.plugin.fav.p047ui.gallery.C93624e;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.record.ui.m */
public class C94369m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RecogQBarOfImageFileResultEvent f272747d;

    /* renamed from: e */
    public final /* synthetic */ String f272748e;

    /* renamed from: f */
    public final /* synthetic */ int f272749f;

    /* renamed from: g */
    public final /* synthetic */ int f272750g;

    /* renamed from: h */
    public final /* synthetic */ RecordMsgImageUI f272751h;

    public C94369m(RecordMsgImageUI recordMsgImageUI, RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent, String str, int i, int i2) {
        this.f272751h = recordMsgImageUI;
        this.f272747d = recogQBarOfImageFileResultEvent;
        this.f272748e = str;
        this.f272749f = i;
        this.f272750g = i2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/record/ui/RecordMsgImageUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.ShowImageUI", "request deal QBAR string");
        if (this.f272751h.f272641q.mo107563h()) {
            this.f272751h.f272641q.mo107572p();
        }
        if (this.f272747d == null) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/record/ui/RecordMsgImageUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        DealQBarStrEvent dealQBarStrEvent = new DealQBarStrEvent();
        DealQBarStrEvent.C92468a aVar = dealQBarStrEvent.f264648d;
        RecordMsgImageUI recordMsgImageUI = this.f272751h;
        aVar.f264650b = recordMsgImageUI;
        aVar.f264649a = this.f272748e;
        aVar.f264651c = this.f272749f;
        aVar.f264653e = 8;
        aVar.f264657i = 30;
        int selectedItemPosition = recordMsgImageUI.f272635h.getSelectedItemPosition();
        if (-1 == selectedItemPosition) {
            Log.m105928w("MicroMsg.ShowImageUI", "error position");
        } else {
            C93624e a = recordMsgImageUI.f272636i.getItem(selectedItemPosition);
            if (a != null) {
                dealQBarStrEvent.f264648d.f264658j = a.mo128520f();
                dealQBarStrEvent.f264648d.f264659k = a.mo128519e();
            }
        }
        dealQBarStrEvent.f264648d.f264652d = this.f272750g;
        if (this.f272751h.getIntent() != null) {
            dealQBarStrEvent.f264648d.f264660l = this.f272751h.getIntent().getBundleExtra("_stat_obj");
        }
        RecordMsgImageUI recordMsgImageUI2 = this.f272751h;
        recordMsgImageUI2.getClass();
        Bundle bundle = dealQBarStrEvent.f264648d.f264660l;
        if (bundle == null) {
            Log.m105924i("MicroMsg.ShowImageUI", "addStatInfo4AppBrand, statObj is null");
            bundle = new Bundle();
            dealQBarStrEvent.f264648d.f264660l = bundle;
        }
        Log.m105925i("MicroMsg.ShowImageUI", "addStatInfo4AppBrand, fromScene: %d, chatType: %d", Integer.valueOf(recordMsgImageUI2.f272647w), Integer.valueOf(recordMsgImageUI2.f272648x));
        if (1 == recordMsgImageUI2.f272647w) {
            bundle.putInt("LaunchCodeScene_ScanScene", 4);
        } else {
            bundle.putInt("LaunchCodeScene_ScanScene", 1);
            bundle.putInt("LaunchCodeScene_ChatType", recordMsgImageUI2.f272648x);
        }
        dealQBarStrEvent.publish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/record/ui/RecordMsgImageUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
