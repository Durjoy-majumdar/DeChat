package com.tencent.p014mm.plugin.sns.p106ui;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82086j;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82088k;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pluginsdk.p133ui.applet.ContactListExpandPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44668u3;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import java.util.LinkedList;
import java.util.List;
import nj3.C76879j;
import ob0.C117747y;
import p159gw.C8462g;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI */
public class SnsBlackDetailUI extends SnsTagDetailUI {
    /* renamed from: H7 */
    public void mo6443H7(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("__onCreate", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        Log.m105918d("MicroMsg.SnsBlackDetailUI", "SnsBlackDetailUI __onCreate");
        C86709a0.m107528h();
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().add(this);
        SnsMethodCalculate.markEndTimeMs("__onCreate", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
    }

    /* renamed from: I7 */
    public void mo6444I7() {
        SnsMethodCalculate.markStartTimeMs("__onDestroy", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        Log.m105918d("MicroMsg.SnsBlackDetailUI", "SnsBlackDetailUI __onDestroy");
        C86709a0.m107528h();
        if (C86709a0.m107523b().mo121114l()) {
            C86709a0.m107528h();
            ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().remove(this);
        }
        SnsMethodCalculate.markEndTimeMs("__onDestroy", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
    }

    /* renamed from: J7 */
    public void mo6445J7() {
        SnsMethodCalculate.markStartTimeMs("dealBack", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        if ((this.f21203i + " " + Util.listToString(this.f21201g, ",")).equals(this.f21204j) && this.f21202h != 0) {
            finish();
            SnsMethodCalculate.markEndTimeMs("dealBack", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        } else if (C94866e1.ey0().mo11656kD(this.f21202h, this.f21203i)) {
            C76879j.m92748s(this, getString(C0966R.string.jhw, new Object[]{this.f21203i}), getString(C0966R.string.a3h));
            SnsMethodCalculate.markEndTimeMs("dealBack", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        } else {
            List<String> N7 = mo6449N7();
            LinkedList<String> linkedList = new LinkedList<>();
            LinkedList<String> linkedList2 = new LinkedList<>();
            for (String next : N7) {
                if (!this.f21201g.contains(next)) {
                    linkedList.add(next);
                }
            }
            for (String next2 : this.f21201g) {
                if (!N7.contains(next2)) {
                    linkedList2.add(next2);
                }
            }
            for (String e0 : linkedList) {
                C45628s0.m50771e0(e0, false);
            }
            for (String e05 : linkedList2) {
                C45628s0.m50771e0(e05, true);
            }
            finish();
            SnsMethodCalculate.markEndTimeMs("dealBack", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        }
    }

    /* renamed from: K7 */
    public void mo6446K7(String str) {
        SnsMethodCalculate.markStartTimeMs("dealDelChatRoomMember", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        super.mo6446K7(str);
        SnsMethodCalculate.markEndTimeMs("dealDelChatRoomMember", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
    }

    /* renamed from: L7 */
    public void mo6447L7(List<String> list) {
        SnsMethodCalculate.markStartTimeMs("dealOnAddContact", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        C44668u3 Jx0 = C94866e1.Jx0();
        String s = C75592q0.m90789s();
        for (String next : list) {
            if (!this.f21201g.contains(next) && Jx0.get(next).mo62927s3() && !s.equals(next)) {
                this.f21201g.add(next);
            }
        }
        ContactListExpandPreference contactListExpandPreference = this.f21200f;
        if (contactListExpandPreference != null) {
            contactListExpandPreference.mo100303M(this.f21201g);
        }
        mo6455P7();
        SnsMethodCalculate.markEndTimeMs("dealOnAddContact", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
    }

    /* renamed from: M7 */
    public void mo6448M7() {
        SnsMethodCalculate.markStartTimeMs("deleteTag", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        SnsMethodCalculate.markEndTimeMs("deleteTag", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
    }

    /* renamed from: N7 */
    public List<String> mo6449N7() {
        SnsMethodCalculate.markStartTimeMs("getListUserName", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        LinkedList linkedList = new LinkedList();
        if (this.f21202h == 4) {
            SnsMethodCalculate.markStartTimeMs("updateListUserNameByContact", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
            new LinkedList();
            List<String> gt = ((C8462g) C86312j.m106911c(C8462g.class)).mo9266gt();
            SnsMethodCalculate.markEndTimeMs("updateListUserNameByContact", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
            SnsMethodCalculate.markEndTimeMs("getListUserName", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
            return gt;
        }
        SnsMethodCalculate.markEndTimeMs("getListUserName", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        return linkedList;
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        super.onCreate(bundle);
        Log.m105918d("MicroMsg.SnsBlackDetailUI", "SnsBlackDetailUI onCreate");
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        ContactListExpandPreference contactListExpandPreference = this.f21200f;
        if (contactListExpandPreference != null) {
            contactListExpandPreference.getClass();
        }
        C89779i0 i0Var = this.f21198d;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(C82086j.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(291, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(JsApiSetAudioState.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(C82088k.CTRL_INDEX, this);
        C86709a0.m107528h();
        if (C86709a0.m107523b().mo121114l()) {
            C86709a0.m107528h();
            ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().remove(this);
        }
        super.onDestroy();
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        Log.m105924i("MicroMsg.SnsBlackDetailUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
        C89779i0 i0Var = this.f21198d;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
    }
}
