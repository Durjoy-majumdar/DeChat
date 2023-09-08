package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82086j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.s0 */
public class C105576s0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SightCaptureUI f314024d;

    public C105576s0(SightCaptureUI sightCaptureUI) {
        this.f314024d = sightCaptureUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SightCaptureUI sightCaptureUI = this.f314024d;
        int i = sightCaptureUI.f313866g;
        if (i == 3) {
            sightCaptureUI.getClass();
            Log.m105924i("MicroMsg.SightCaptureUI", "[gotoPhotoEditUI]");
            if (sightCaptureUI.f313871j == null) {
                Log.m105920e("MicroMsg.SightCaptureUI", "mediaRecorder == NULL");
            } else {
                String stringExtra = sightCaptureUI.getIntent().getStringExtra("GalleryUI_FromUser");
                String stringExtra2 = sightCaptureUI.getIntent().getStringExtra("GalleryUI_ToUser");
                Intent intent = new Intent();
                intent.putExtra("GalleryUI_FromUser", stringExtra);
                intent.putExtra("GalleryUI_ToUser", stringExtra2);
                int i2 = sightCaptureUI.f313847V.f248458o;
                if (i2 == 1) {
                    intent.putExtra("from_scene", C82086j.CTRL_INDEX);
                } else if (i2 == 2) {
                    intent.putExtra("from_scene", 289);
                }
                intent.putExtra("raw_photo_path", Util.isNullOrNil(sightCaptureUI.f313859c1) ? sightCaptureUI.f313871j.mo159627u() : sightCaptureUI.f313859c1);
                intent.putExtra("after_photo_edit", sightCaptureUI.f313861d1);
                intent.setClassName(sightCaptureUI, "com.tencent.mm.ui.MMNewPhotoEditUI");
                sightCaptureUI.startActivityForResult(intent, 4369);
            }
        } else if (i == 4) {
            sightCaptureUI.getClass();
            boolean z = false;
            if (C75044y4.m89993e(sightCaptureUI) > 0) {
                sightCaptureUI.setSelfNavigationBarVisible(0);
            }
            sightCaptureUI.f313830I = (VideoSeekBarEditorView) sightCaptureUI.findViewById(C0966R.C0970id.l7e);
            if (C75044y4.m89993e(sightCaptureUI) > 0) {
                z = true;
            }
            if (z) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sightCaptureUI.f313830I.getLayoutParams();
                marginLayoutParams.bottomMargin = Math.max(C75044y4.m89991c(sightCaptureUI), C75044y4.m89993e(sightCaptureUI));
                sightCaptureUI.f313830I.setLayoutParams(marginLayoutParams);
            }
            C105562q qVar = new C105562q();
            sightCaptureUI.f313832K = qVar;
            qVar.f314005x = 2;
            qVar.f314001t = true;
            qVar.mo150416d(sightCaptureUI, sightCaptureUI.f313847V.f248458o, sightCaptureUI.f313871j.getFilePath(), sightCaptureUI.f313830I, sightCaptureUI.f313829H, sightCaptureUI.f313880u, sightCaptureUI.f313868h, false);
            sightCaptureUI.f313832K.f313997p = new C105557p0(sightCaptureUI);
            sightCaptureUI.f313874p.setVisibility(8);
            sightCaptureUI.f313876q.setVisibility(8);
            sightCaptureUI.f313883x.setVisibility(8);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
