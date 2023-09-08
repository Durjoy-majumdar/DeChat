package k11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.OpenNoteFromSessionEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import j11.C98895d;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

public class s$$d implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ C99085s f290471d;

    public s$$d(C99085s sVar) {
        this.f290471d = sVar;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        Log.m105925i("MicroMsg.CleanChattingDetailAdapter", "Click Item position=%d, count=%d", Integer.valueOf(i), Integer.valueOf(this.f290471d.getCount()));
        if (i < 0 || i >= this.f290471d.getCount()) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        C98895d dVar = this.f290471d.f290456f.get(i);
        Intent intent = new Intent();
        int i2 = dVar.f289895b;
        if (i2 == 1) {
            intent.putExtra("key_title", this.f290471d.f290455e.getString(C0966R.string.beg));
            intent.putExtra("show_menu", false);
            intent.putExtra("key_image_path", C86013q1.m106450k(dVar.f289897d) ? dVar.f289897d : dVar.f289896c);
            C88144b.m109801s(this.f290471d.f290455e, ".ui.tools.ShowImageUI", intent, (Bundle) null);
        } else if (i2 == 3) {
            intent.putExtra("img_gallery_msg_id", dVar.f289899f).putExtra("img_gallery_talker", dVar.f289898e).putExtra("img_gallery_enter_from_chatting_ui", false).putExtra("msg_type", 0).putExtra("show_enter_grid", false);
            C88144b.m109801s(this.f290471d.f290455e, ".ui.chatting.gallery.ImageGalleryUI", intent, (Bundle) null);
        } else if (i2 == 4) {
            intent.putExtra("app_msg_id", dVar.f289899f);
            C88144b.m109801s(this.f290471d.f290455e, ".ui.chatting.AppAttachDownloadUI", intent, (Bundle) null);
        } else if (i2 == 5) {
            intent.putExtra("message_id", dVar.f289899f);
            intent.putExtra("record_xml", dVar.f289903j);
            intent.putExtra("record_show_share", false);
            intent.putExtra("from_scene", 2);
            C88144b.m109791i(this.f290471d.f290455e, "record", ".ui.RecordMsgDetailUI", intent, (Bundle) null);
        } else if (i2 == 6) {
            OpenNoteFromSessionEvent openNoteFromSessionEvent = new OpenNoteFromSessionEvent();
            OpenNoteFromSessionEvent.C67750a aVar = openNoteFromSessionEvent.f193796d;
            aVar.f193799c = this.f290471d.f290455e;
            aVar.f193797a = dVar.f289899f;
            aVar.f193800d = false;
            aVar.f193801e = 6;
            aVar.f193798b = dVar.f289903j;
            openNoteFromSessionEvent.publish();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
