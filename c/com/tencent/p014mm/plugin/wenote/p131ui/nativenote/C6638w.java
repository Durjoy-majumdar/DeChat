package com.tencent.p014mm.plugin.wenote.p131ui.nativenote;

import a70.C112760b;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.mmsight.SightParams;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.w */
public class C6638w implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f23920d;

    /* renamed from: e */
    public final /* synthetic */ C96728e0 f23921e;

    public C6638w(C96728e0 e0Var, Context context) {
        this.f23921e = e0Var;
        this.f23920d = context;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteFootPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.WNNoteFootPannel", "go to GalleryEntryUI");
        ((NoteEditorUI) this.f23921e.f283371s).f283238X0.mo126184D(-1, false, true);
        Intent intent = new Intent();
        intent.putExtra("max_select_count", 9);
        intent.putExtra("query_source_type", 13);
        intent.putExtra("query_media_type", 3);
        intent.putExtra("show_header_view", true);
        intent.putExtra("send_btn_string", this.f23920d.getString(C0966R.string.cmx));
        this.f23921e.getClass();
        SightParams sightParams = (SightParams) intent.getParcelableExtra("KEY_SIGHT_PARAMS");
        if (sightParams == null) {
            sightParams = new SightParams(4, 0);
        }
        String str = "micromsg_" + System.currentTimeMillis();
        String str2 = C112760b.m154240l() + str + ".mp4";
        String str3 = C112760b.m154240l() + str + ".jpeg";
        int intExtra = intent.getIntExtra("key_pick_local_media_duration", 60);
        SightParams sightParams2 = new SightParams(4, 1);
        sightParams2.f248451e = 2;
        sightParams2.f248450d = 0;
        if (sightParams2.f248452f == null) {
            sightParams2.f248452f = new VideoTransPara();
        }
        sightParams2.f248452f.f267170h = intExtra;
        sightParams2.mo118479a(str, str2, str3, AndroidMediaUtil.getSysCameraDirPath() + String.format("%s%d.%s", new Object[]{"capture", Long.valueOf(System.currentTimeMillis()), "jpg"}));
        intent.putExtra("KEY_SIGHT_PARAMS", sightParams);
        intent.putExtra("record_video_force_sys_camera", false);
        intent.putExtra("record_video_is_sight_capture", true);
        intent.addFlags(67108864);
        intent.putExtra("key_can_select_video_and_pic", true);
        C88144b.m109795m(this.f23920d, "gallery", ".ui.GalleryEntryUI", intent, 4097);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteFootPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
