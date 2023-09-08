package com.tencent.p014mm.plugin.component.editor;

import android.view.View;
import com.tencent.p014mm.autogen.events.DealQBarStrEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import p21.C100619d;
import te3.C101834rc0;

/* renamed from: com.tencent.mm.plugin.component.editor.e */
public class C93072e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RecogQBarOfImageFileResultEvent f268116d;

    /* renamed from: e */
    public final /* synthetic */ String f268117e;

    /* renamed from: f */
    public final /* synthetic */ int f268118f;

    /* renamed from: g */
    public final /* synthetic */ int f268119g;

    /* renamed from: h */
    public final /* synthetic */ EditorImageUI f268120h;

    public C93072e(EditorImageUI editorImageUI, RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent, String str, int i, int i2) {
        this.f268120h = editorImageUI;
        this.f268116d = recogQBarOfImageFileResultEvent;
        this.f268117e = str;
        this.f268118f = i;
        this.f268119g = i2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/component/editor/EditorImageUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.Editor.EditorImageUI", "request deal QBAR string");
        if (this.f268120h.f267999n.mo107563h()) {
            this.f268120h.f267999n.mo107572p();
        }
        if (this.f268116d == null) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/EditorImageUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        DealQBarStrEvent dealQBarStrEvent = new DealQBarStrEvent();
        DealQBarStrEvent.C92468a aVar = dealQBarStrEvent.f264648d;
        EditorImageUI editorImageUI = this.f268120h;
        aVar.f264650b = editorImageUI;
        aVar.f264649a = this.f268117e;
        aVar.f264651c = this.f268118f;
        aVar.f264653e = 8;
        int selectedItemPosition = editorImageUI.f267994f.getSelectedItemPosition();
        if (-1 == selectedItemPosition) {
            Log.m105928w("MicroMsg.Editor.EditorImageUI", "error position");
        } else {
            C101834rc0 rc02 = ((C100619d) editorImageUI.f267995g.getItem(selectedItemPosition)).f294808m;
            if (rc02 != null) {
                DealQBarStrEvent.C92468a aVar2 = dealQBarStrEvent.f264648d;
                aVar2.f264658j = rc02.f299325s;
                aVar2.f264659k = rc02.f299329u;
            }
        }
        dealQBarStrEvent.f264648d.f264652d = this.f268119g;
        if (this.f268120h.getIntent() != null) {
            dealQBarStrEvent.f264648d.f264660l = this.f268120h.getIntent().getBundleExtra("_stat_obj");
        }
        dealQBarStrEvent.publish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/EditorImageUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
