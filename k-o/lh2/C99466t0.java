package lh2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.recordvideo.activity.MMRecordUI;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import lh2.C109344g0;
import qh2.C101198e;
import th2.C110992d;

/* renamed from: lh2.t0 */
public class C99466t0 implements View.OnClickListener, C109344g0 {

    /* renamed from: d */
    public WeImageView f291627d;

    /* renamed from: e */
    public C101198e f291628e;

    /* renamed from: f */
    public int f291629f;

    public C99466t0(WeImageView weImageView, C101198e eVar) {
        C87412m.m108594g(weImageView, "view");
        C87412m.m108594g(eVar, "status");
        this.f291627d = weImageView;
        this.f291628e = eVar;
        weImageView.setOnClickListener(this);
        this.f291627d.setIconColor(-1);
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    public String name() {
        return getClass().getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/RecordClosePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.RecordClosePlugin", "RecordClosePlugin close");
        Context context = this.f291627d.getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.activity.MMRecordUI");
        ((MMRecordUI) context).mo129783I7();
        C101198e.C62622a.m73576a(this.f291628e, C101198e.C101199b.RECORD_BACK, (Bundle) null, 2, (Object) null);
        C110992d dVar = C110992d.f332425a;
        dVar.mo162670d(3);
        dVar.mo162669b(3);
        dVar.mo162673g(this.f291629f);
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/RecordClosePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onDetach() {
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
    }

    public void release() {
    }

    public void reset() {
    }

    public void setVisibility(int i) {
        this.f291627d.setVisibility(i);
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
