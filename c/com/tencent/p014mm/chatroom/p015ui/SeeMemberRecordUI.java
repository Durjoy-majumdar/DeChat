package com.tencent.p014mm.chatroom.p015ui;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.View;
import android.widget.ListAdapter;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatroom.p015ui.SelectMemberUI;
import com.tencent.p014mm.p136ui.contact.C74536o1;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.chatroom.ui.SeeMemberRecordUI */
public class SeeMemberRecordUI extends SelectMemberUI {
    /* renamed from: N7 */
    public void mo62762N7(View view, int i, long j) {
        ListAdapter adapter = this.f108215d.getAdapter();
        SelectMemberUI.C40250g gVar = this.f108221j;
        if (adapter == gVar) {
            SelectMemberUI.C40249f b = gVar.getItem(i);
            if (b == null) {
                Log.m105920e("MicroMsg.SeeMemberRecordUI", "item is null!");
                return;
            }
            C72996z1 z1Var = b.f108239b;
            if (z1Var == null) {
                Log.m105920e("MicroMsg.SeeMemberRecordUI", "contact is null!");
            } else {
                mo62763Q7(z1Var.getUsername());
            }
        } else {
            ListAdapter adapter2 = this.f108215d.getAdapter();
            C74536o1 o1Var = this.f108220i;
            if (adapter2 == o1Var) {
                mo62763Q7(o1Var.getItem(i).f222621r);
            }
        }
    }

    /* renamed from: Q7 */
    public final void mo62763Q7(String str) {
        hideVKB();
        Intent intent = new Intent(this, SelectedMemberChattingRecordUI.class);
        intent.putExtra("RoomInfo_Id", this.f108223o);
        intent.putExtra("room_member", str);
        intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, getString(C0966R.string.iib));
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/chatroom/ui/SeeMemberRecordUI", "doSeeMemberRecord", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/chatroom/ui/SeeMemberRecordUI", "doSeeMemberRecord", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Transition inflateTransition = TransitionInflater.from(this).inflateTransition(17760258);
        inflateTransition.excludeTarget(getWindow().getDecorView().findViewById(C0966R.C0970id.f5383do), true);
        inflateTransition.excludeTarget(16908335, true);
        getWindow().setEnterTransition(inflateTransition);
    }
}
