package com.tencent.p014mm.plugin.record.p094ui.viewWrappers;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.autogen.events.DealQBarStrEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.record.ui.viewWrappers.d */
public class C94385d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RecogQBarOfImageFileResultEvent f272811d;

    /* renamed from: e */
    public final /* synthetic */ Context f272812e;

    /* renamed from: f */
    public final /* synthetic */ String f272813f;

    /* renamed from: g */
    public final /* synthetic */ int f272814g;

    /* renamed from: h */
    public final /* synthetic */ int f272815h;

    /* renamed from: i */
    public final /* synthetic */ ImageViewWrapper f272816i;

    public C94385d(ImageViewWrapper imageViewWrapper, RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent, Context context, String str, int i, int i2) {
        this.f272816i = imageViewWrapper;
        this.f272811d = recogQBarOfImageFileResultEvent;
        this.f272812e = context;
        this.f272813f = str;
        this.f272814g = i;
        this.f272815h = i2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.ImageViewWrapper", "request deal QBAR string");
        if (this.f272816i.f272761d.mo107563h()) {
            this.f272816i.f272761d.mo107572p();
        }
        if (this.f272811d == null) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        DealQBarStrEvent dealQBarStrEvent = new DealQBarStrEvent();
        DealQBarStrEvent.C92468a aVar = dealQBarStrEvent.f264648d;
        aVar.f264650b = (Activity) this.f272812e;
        aVar.f264649a = this.f272813f;
        aVar.f264651c = this.f272814g;
        aVar.f264652d = this.f272815h;
        aVar.f264657i = 30;
        ImageViewWrapper imageViewWrapper = this.f272816i;
        imageViewWrapper.getClass();
        Bundle bundle = new Bundle();
        dealQBarStrEvent.f264648d.f264660l = bundle;
        Log.m105925i("MicroMsg.ImageViewWrapper", "addStatInfo4AppBrand, fromScene: %d, chatType: %d", Integer.valueOf(imageViewWrapper.f272766i), Integer.valueOf(imageViewWrapper.f272765h));
        if (1 == imageViewWrapper.f272766i) {
            bundle.putInt("LaunchCodeScene_ScanScene", 4);
        } else {
            bundle.putInt("LaunchCodeScene_ScanScene", 1);
            bundle.putInt("LaunchCodeScene_ChatType", imageViewWrapper.f272765h);
        }
        dealQBarStrEvent.publish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
