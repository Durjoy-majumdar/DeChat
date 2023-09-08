package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.TalkRoomServerEvent;
import com.tencent.p014mm.autogen.events.VoipCheckIsDeviceUsingEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.profile.C42599h;
import com.tencent.p014mm.plugin.profile.p088ui.NormalUserFooterPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import p182kk.C61104a;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.profile.ui.g2 */
public class C70275g2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ NormalUserFooterPreference.C70154c f203036d;

    public C70275g2(NormalUserFooterPreference.C70154c cVar) {
        this.f203036d = cVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$BaseHandler$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        NormalUserFooterPreference.C70154c cVar = this.f203036d;
        cVar.getClass();
        VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = new VoipCheckIsDeviceUsingEvent();
        voipCheckIsDeviceUsingEvent.publish();
        if (!NormalUserFooterPreference.this.f202624J.getUsername().equals(voipCheckIsDeviceUsingEvent.f194014d.f194018d)) {
            VoipCheckIsDeviceUsingEvent.C67817a aVar = voipCheckIsDeviceUsingEvent.f194014d;
            if (aVar.f194016b || aVar.f194017c) {
                C76701a.makeText((Context) NormalUserFooterPreference.this.f202653d1.getContext(), aVar.f194015a ? C0966R.string.auy : C0966R.string.auz, 0).show();
                Log.m105924i("MicroMsg.NormalUserFooterPreference", "voip is running, can't do this");
                C42599h.xx0(NormalUserFooterPreference.this.f202653d1.getIntent(), 5, 1, NormalUserFooterPreference.this.f202624J.getUsername());
                C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$BaseHandler$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
        if (!C61104a.m71665u(NormalUserFooterPreference.this.f202653d1) && !C61104a.m71649e(NormalUserFooterPreference.this.f202653d1)) {
            TalkRoomServerEvent talkRoomServerEvent = new TalkRoomServerEvent();
            talkRoomServerEvent.f154883d.f154885a = true;
            talkRoomServerEvent.publish();
            String str = talkRoomServerEvent.f154884e.f154887a;
            if (!Util.isNullOrNil(str)) {
                Log.m105926v("MicroMsg.NormalUserFooterPreference", "Talkroom is on: " + str);
                MMActivity mMActivity = NormalUserFooterPreference.this.f202653d1;
                C76879j.m92707A(mMActivity, mMActivity.getString(C0966R.string.jt9), "", NormalUserFooterPreference.this.f202653d1.getString(C0966R.string.a18), NormalUserFooterPreference.this.f202653d1.getString(C0966R.string.f7926wf), new C70253b2(cVar), new C70259c2(cVar));
            } else {
                cVar.mo96639m();
            }
        }
        C42599h.xx0(NormalUserFooterPreference.this.f202653d1.getIntent(), 5, 1, NormalUserFooterPreference.this.f202624J.getUsername());
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$BaseHandler$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
